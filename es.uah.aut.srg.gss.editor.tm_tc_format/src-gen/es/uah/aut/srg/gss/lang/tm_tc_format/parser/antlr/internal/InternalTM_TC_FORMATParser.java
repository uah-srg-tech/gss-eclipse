package es.uah.aut.srg.gss.lang.tm_tc_format.parser.antlr.internal;

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
import es.uah.aut.srg.gss.lang.tm_tc_format.services.TM_TC_FORMATGrammarAccess;



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
public class InternalTM_TC_FORMATParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_HEXADECIMAL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'GSSTmTcFormatTmTCFormat'", "'{'", "'uri'", "':='", "'version'", "'description'", "'protocol'", "'type'", "'}'", "'GSSTmTcFormatCSField'", "'fid'", "'pfid'", "'name'", "'byteOrder'", "'firstBit'", "'GSSTmTcFormatCSFormulaField'", "'GSSTmTcFormatVSField'", "'GSSTmTcFormatFDICField'", "'checkType'", "'GSSTmTcFormatVRFieldSize'", "'GSSTmTcFormatAField'", "'GSSTmTcFormatAIField'", "'GSSTmTcFormatSize'", "'bytes'", "'bits'", "'GSSTmTcFormatGlobalOffset'", "'GSSTmTcFormatFormula'", "'slope'", "'intercept'", "'GSSTmTcFormatConstSize'", "'GSSTmTcFormatMaxSize'", "'GSSTmTcFormatVariableSize'", "'fidRef'", "'unit'", "'power'", "'GSSTmTcFormatFloatingOffset'", "'GSSTmTcFormatSortedFieldsToCheck'", "'GSSTmTcFormatFieldToCheck'", "'GSSTmTcFormatArrayDimension'", "'maxItems'", "'GSSTmTcFormatLocalOffset'", "'GSSTmTcFormatArrayRef'", "'.'", "'('", "')'", "'-'", "'e'", "'TM'", "'TC'", "'structured'", "'uint'", "'flag'", "'enumerated'", "'bit_vector'", "'byte_vector'", "'float'", "'deduced'", "'big_endian'", "'little_endian'", "'na'", "'MSB'", "'LSB'", "'halfword'", "'string10'", "'string17'", "'string69'", "'2bits'", "'2bits_with_0'", "'crc16'", "'checksum16'"
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
    public static final int RULE_INT=5;
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
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
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


        public InternalTM_TC_FORMATParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTM_TC_FORMATParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTM_TC_FORMATParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTM_TC_FORMAT.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private TM_TC_FORMATGrammarAccess grammarAccess;

        public InternalTM_TC_FORMATParser(TokenStream input, TM_TC_FORMATGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GSSModelFile";
       	}

       	@Override
       	protected TM_TC_FORMATGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGSSModelFile"
    // InternalTM_TC_FORMAT.g:79:1: entryRuleGSSModelFile returns [EObject current=null] : iv_ruleGSSModelFile= ruleGSSModelFile EOF ;
    public final EObject entryRuleGSSModelFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSModelFile = null;


        try {
            // InternalTM_TC_FORMAT.g:79:53: (iv_ruleGSSModelFile= ruleGSSModelFile EOF )
            // InternalTM_TC_FORMAT.g:80:2: iv_ruleGSSModelFile= ruleGSSModelFile EOF
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
    // InternalTM_TC_FORMAT.g:86:1: ruleGSSModelFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSTmTcFormatTmTCFormat ) ) ) ;
    public final EObject ruleGSSModelFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:92:2: ( ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSTmTcFormatTmTCFormat ) ) ) )
            // InternalTM_TC_FORMAT.g:93:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSTmTcFormatTmTCFormat ) ) )
            {
            // InternalTM_TC_FORMAT.g:93:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSTmTcFormatTmTCFormat ) ) )
            // InternalTM_TC_FORMAT.g:94:3: ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSTmTcFormatTmTCFormat ) )
            {
            // InternalTM_TC_FORMAT.g:94:3: ( (lv_imports_0_0= ruleGSSModelFileImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTM_TC_FORMAT.g:95:4: (lv_imports_0_0= ruleGSSModelFileImport )
            	    {
            	    // InternalTM_TC_FORMAT.g:95:4: (lv_imports_0_0= ruleGSSModelFileImport )
            	    // InternalTM_TC_FORMAT.g:96:5: lv_imports_0_0= ruleGSSModelFileImport
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
            	      						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSModelFileImport");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalTM_TC_FORMAT.g:113:3: ( (lv_element_1_0= ruleGSSTmTcFormatTmTCFormat ) )
            // InternalTM_TC_FORMAT.g:114:4: (lv_element_1_0= ruleGSSTmTcFormatTmTCFormat )
            {
            // InternalTM_TC_FORMAT.g:114:4: (lv_element_1_0= ruleGSSTmTcFormatTmTCFormat )
            // InternalTM_TC_FORMAT.g:115:5: lv_element_1_0= ruleGSSTmTcFormatTmTCFormat
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSModelFileAccess().getElementGSSTmTcFormatTmTCFormatParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_1_0=ruleGSSTmTcFormatTmTCFormat();

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
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatTmTCFormat");
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
    // InternalTM_TC_FORMAT.g:136:1: entryRuleGSSModelFileImport returns [EObject current=null] : iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF ;
    public final EObject entryRuleGSSModelFileImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSModelFileImport = null;


        try {
            // InternalTM_TC_FORMAT.g:136:59: (iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF )
            // InternalTM_TC_FORMAT.g:137:2: iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF
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
    // InternalTM_TC_FORMAT.g:143:1: ruleGSSModelFileImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleGSSModelFileImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:149:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalTM_TC_FORMAT.g:150:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalTM_TC_FORMAT.g:150:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalTM_TC_FORMAT.g:151:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSModelFileImportAccess().getImportKeyword_0());
              		
            }
            // InternalTM_TC_FORMAT.g:155:3: ( (lv_importURI_1_0= RULE_ID ) )
            // InternalTM_TC_FORMAT.g:156:4: (lv_importURI_1_0= RULE_ID )
            {
            // InternalTM_TC_FORMAT.g:156:4: (lv_importURI_1_0= RULE_ID )
            // InternalTM_TC_FORMAT.g:157:5: lv_importURI_1_0= RULE_ID
            {
            lv_importURI_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_importURI_1_0, grammarAccess.getGSSModelFileImportAccess().getImportURIIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSModelFileImportRule());
              					}
              					setWithLastConsumed(
              						current,
              						"importURI",
              						lv_importURI_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
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


    // $ANTLR start "entryRuleGSSTmTcFormatTmTCFormat"
    // InternalTM_TC_FORMAT.g:181:1: entryRuleGSSTmTcFormatTmTCFormat returns [EObject current=null] : iv_ruleGSSTmTcFormatTmTCFormat= ruleGSSTmTcFormatTmTCFormat EOF ;
    public final EObject entryRuleGSSTmTcFormatTmTCFormat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatTmTCFormat = null;



        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalTM_TC_FORMAT.g:185:2: (iv_ruleGSSTmTcFormatTmTCFormat= ruleGSSTmTcFormatTmTCFormat EOF )
            // InternalTM_TC_FORMAT.g:186:2: iv_ruleGSSTmTcFormatTmTCFormat= ruleGSSTmTcFormatTmTCFormat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTmTcFormatTmTCFormat=ruleGSSTmTcFormatTmTCFormat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTmTcFormatTmTCFormat; 
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
    // $ANTLR end "entryRuleGSSTmTcFormatTmTCFormat"


    // $ANTLR start "ruleGSSTmTcFormatTmTCFormat"
    // InternalTM_TC_FORMAT.g:195:1: ruleGSSTmTcFormatTmTCFormat returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatTmTCFormat' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' otherlv_32= ';' ) ;
    public final EObject ruleGSSTmTcFormatTmTCFormat() throws RecognitionException {
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
        Token lv_description_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_protocol_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;

        AntlrDatatypeRuleToken lv_version_10_0 = null;

        Enumerator lv_type_22_0 = null;

        EObject lv_CSField_24_0 = null;

        EObject lv_CSFormulaField_25_0 = null;

        EObject lv_VSField_26_0 = null;

        EObject lv_FDICField_27_0 = null;

        EObject lv_VRFieldSize_28_0 = null;

        EObject lv_AField_29_0 = null;

        EObject lv_AIField_30_0 = null;



        	enterRule();
        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalTM_TC_FORMAT.g:204:2: ( (otherlv_0= 'GSSTmTcFormatTmTCFormat' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' otherlv_32= ';' ) )
            // InternalTM_TC_FORMAT.g:205:2: (otherlv_0= 'GSSTmTcFormatTmTCFormat' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' otherlv_32= ';' )
            {
            // InternalTM_TC_FORMAT.g:205:2: (otherlv_0= 'GSSTmTcFormatTmTCFormat' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' otherlv_32= ';' )
            // InternalTM_TC_FORMAT.g:206:3: otherlv_0= 'GSSTmTcFormatTmTCFormat' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' otherlv_32= ';'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getGSSTmTcFormatTmTCFormatKeyword_0());
              		
            }
            // InternalTM_TC_FORMAT.g:210:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTM_TC_FORMAT.g:211:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTM_TC_FORMAT.g:211:4: (lv_name_1_0= RULE_ID )
            // InternalTM_TC_FORMAT.g:212:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTmTcFormatTmTCFormatRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalTM_TC_FORMAT.g:232:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) ) )+ {...}?) ) )
            // InternalTM_TC_FORMAT.g:233:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) ) )+ {...}?) )
            {
            // InternalTM_TC_FORMAT.g:233:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) ) )+ {...}?) )
            // InternalTM_TC_FORMAT.g:234:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3());
            // InternalTM_TC_FORMAT.g:237:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) ) )+ {...}?)
            // InternalTM_TC_FORMAT.g:238:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) ) )+ {...}?
            {
            // InternalTM_TC_FORMAT.g:238:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=6;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 1) ) {
                    alt3=2;
                }
                else if ( LA3_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 2) ) {
                    alt3=3;
                }
                else if ( LA3_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 3) ) {
                    alt3=4;
                }
                else if ( LA3_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 4) ) {
                    alt3=5;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTM_TC_FORMAT.g:239:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // InternalTM_TC_FORMAT.g:239:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    // InternalTM_TC_FORMAT.g:240:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSTmTcFormatTmTCFormat", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalTM_TC_FORMAT.g:240:120: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    // InternalTM_TC_FORMAT.g:241:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 0);
            	    // InternalTM_TC_FORMAT.g:244:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    // InternalTM_TC_FORMAT.g:244:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSTmTcFormatTmTCFormat", "true");
            	    }
            	    // InternalTM_TC_FORMAT.g:244:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    // InternalTM_TC_FORMAT.g:244:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_4, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUriKeyword_3_0_0());
            	      								
            	    }
            	    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getColonEqualsSignKeyword_3_0_1());
            	      								
            	    }
            	    // InternalTM_TC_FORMAT.g:252:9: ( (lv_uri_6_0= ruleQualifiedName ) )
            	    // InternalTM_TC_FORMAT.g:253:10: (lv_uri_6_0= ruleQualifiedName )
            	    {
            	    // InternalTM_TC_FORMAT.g:253:10: (lv_uri_6_0= ruleQualifiedName )
            	    // InternalTM_TC_FORMAT.g:254:11: lv_uri_6_0= ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_uri_6_0=ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTCFormatRule());
            	      											}
            	      											set(
            	      												current,
            	      												"uri",
            	      												lv_uri_6_0,
            	      												"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.QualifiedName");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getSemicolonKeyword_3_0_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTM_TC_FORMAT.g:281:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // InternalTM_TC_FORMAT.g:281:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    // InternalTM_TC_FORMAT.g:282:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSTmTcFormatTmTCFormat", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalTM_TC_FORMAT.g:282:120: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    // InternalTM_TC_FORMAT.g:283:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 1);
            	    // InternalTM_TC_FORMAT.g:286:9: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    // InternalTM_TC_FORMAT.g:286:10: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSTmTcFormatTmTCFormat", "true");
            	    }
            	    // InternalTM_TC_FORMAT.g:286:19: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    // InternalTM_TC_FORMAT.g:286:20: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_8, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getVersionKeyword_3_1_0());
            	      								
            	    }
            	    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getColonEqualsSignKeyword_3_1_1());
            	      								
            	    }
            	    // InternalTM_TC_FORMAT.g:294:9: ( (lv_version_10_0= ruleVersion ) )
            	    // InternalTM_TC_FORMAT.g:295:10: (lv_version_10_0= ruleVersion )
            	    {
            	    // InternalTM_TC_FORMAT.g:295:10: (lv_version_10_0= ruleVersion )
            	    // InternalTM_TC_FORMAT.g:296:11: lv_version_10_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getVersionVersionParserRuleCall_3_1_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_version_10_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTCFormatRule());
            	      											}
            	      											set(
            	      												current,
            	      												"version",
            	      												lv_version_10_0,
            	      												"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.Version");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getSemicolonKeyword_3_1_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalTM_TC_FORMAT.g:323:4: ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // InternalTM_TC_FORMAT.g:323:4: ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) )
            	    // InternalTM_TC_FORMAT.g:324:5: {...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSTmTcFormatTmTCFormat", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalTM_TC_FORMAT.g:324:120: ( ({...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' ) ) )
            	    // InternalTM_TC_FORMAT.g:325:6: ({...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 2);
            	    // InternalTM_TC_FORMAT.g:328:9: ({...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' ) )
            	    // InternalTM_TC_FORMAT.g:328:10: {...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSTmTcFormatTmTCFormat", "true");
            	    }
            	    // InternalTM_TC_FORMAT.g:328:19: (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' )
            	    // InternalTM_TC_FORMAT.g:328:20: otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_12, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getDescriptionKeyword_3_2_0());
            	      								
            	    }
            	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getColonEqualsSignKeyword_3_2_1());
            	      								
            	    }
            	    // InternalTM_TC_FORMAT.g:336:9: ( (lv_description_14_0= RULE_ID ) )
            	    // InternalTM_TC_FORMAT.g:337:10: (lv_description_14_0= RULE_ID )
            	    {
            	    // InternalTM_TC_FORMAT.g:337:10: (lv_description_14_0= RULE_ID )
            	    // InternalTM_TC_FORMAT.g:338:11: lv_description_14_0= RULE_ID
            	    {
            	    lv_description_14_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											newLeafNode(lv_description_14_0, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getDescriptionIDTerminalRuleCall_3_2_2_0());
            	      										
            	    }
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getGSSTmTcFormatTmTCFormatRule());
            	      											}
            	      											setWithLastConsumed(
            	      												current,
            	      												"description",
            	      												lv_description_14_0,
            	      												"org.eclipse.xtext.common.Terminals.ID");
            	      										
            	    }

            	    }


            	    }

            	    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_15, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getSemicolonKeyword_3_2_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalTM_TC_FORMAT.g:364:4: ({...}? => ( ({...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // InternalTM_TC_FORMAT.g:364:4: ({...}? => ( ({...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' ) ) ) )
            	    // InternalTM_TC_FORMAT.g:365:5: {...}? => ( ({...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSTmTcFormatTmTCFormat", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalTM_TC_FORMAT.g:365:120: ( ({...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' ) ) )
            	    // InternalTM_TC_FORMAT.g:366:6: ({...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 3);
            	    // InternalTM_TC_FORMAT.g:369:9: ({...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' ) )
            	    // InternalTM_TC_FORMAT.g:369:10: {...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSTmTcFormatTmTCFormat", "true");
            	    }
            	    // InternalTM_TC_FORMAT.g:369:19: (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' )
            	    // InternalTM_TC_FORMAT.g:369:20: otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,20,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_16, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getProtocolKeyword_3_3_0());
            	      								
            	    }
            	    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_17, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getColonEqualsSignKeyword_3_3_1());
            	      								
            	    }
            	    // InternalTM_TC_FORMAT.g:377:9: ( (lv_protocol_18_0= RULE_ID ) )
            	    // InternalTM_TC_FORMAT.g:378:10: (lv_protocol_18_0= RULE_ID )
            	    {
            	    // InternalTM_TC_FORMAT.g:378:10: (lv_protocol_18_0= RULE_ID )
            	    // InternalTM_TC_FORMAT.g:379:11: lv_protocol_18_0= RULE_ID
            	    {
            	    lv_protocol_18_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											newLeafNode(lv_protocol_18_0, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getProtocolIDTerminalRuleCall_3_3_2_0());
            	      										
            	    }
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getGSSTmTcFormatTmTCFormatRule());
            	      											}
            	      											setWithLastConsumed(
            	      												current,
            	      												"protocol",
            	      												lv_protocol_18_0,
            	      												"org.eclipse.xtext.common.Terminals.ID");
            	      										
            	    }

            	    }


            	    }

            	    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_19, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getSemicolonKeyword_3_3_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalTM_TC_FORMAT.g:405:4: ({...}? => ( ({...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) )
            	    {
            	    // InternalTM_TC_FORMAT.g:405:4: ({...}? => ( ({...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) )
            	    // InternalTM_TC_FORMAT.g:406:5: {...}? => ( ({...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSTmTcFormatTmTCFormat", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalTM_TC_FORMAT.g:406:120: ( ({...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* ) ) )
            	    // InternalTM_TC_FORMAT.g:407:6: ({...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 4);
            	    // InternalTM_TC_FORMAT.g:410:9: ({...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* ) )
            	    // InternalTM_TC_FORMAT.g:410:10: {...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSTmTcFormatTmTCFormat", "true");
            	    }
            	    // InternalTM_TC_FORMAT.g:410:19: ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* )
            	    // InternalTM_TC_FORMAT.g:410:20: (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )*
            	    {
            	    // InternalTM_TC_FORMAT.g:410:20: (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' )
            	    // InternalTM_TC_FORMAT.g:411:10: otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';'
            	    {
            	    otherlv_20=(Token)match(input,21,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_20, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getTypeKeyword_3_4_0_0());
            	      									
            	    }
            	    otherlv_21=(Token)match(input,17,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_21, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getColonEqualsSignKeyword_3_4_0_1());
            	      									
            	    }
            	    // InternalTM_TC_FORMAT.g:419:10: ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) )
            	    // InternalTM_TC_FORMAT.g:420:11: (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType )
            	    {
            	    // InternalTM_TC_FORMAT.g:420:11: (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType )
            	    // InternalTM_TC_FORMAT.g:421:12: lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType
            	    {
            	    if ( state.backtracking==0 ) {

            	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getTypeGSSTmTcFormatTmTCFormatTypeEnumRuleCall_3_4_0_2_0());
            	      											
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_type_22_0=ruleGSSTmTcFormatTmTCFormatType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      												if (current==null) {
            	      													current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTCFormatRule());
            	      												}
            	      												set(
            	      													current,
            	      													"type",
            	      													lv_type_22_0,
            	      													"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatTmTCFormatType");
            	      												afterParserOrEnumRuleCall();
            	      											
            	    }

            	    }


            	    }

            	    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_23, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getSemicolonKeyword_3_4_0_3());
            	      									
            	    }

            	    }

            	    // InternalTM_TC_FORMAT.g:443:9: ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )*
            	    loop2:
            	    do {
            	        int alt2=8;
            	        switch ( input.LA(1) ) {
            	        case 23:
            	            {
            	            alt2=1;
            	            }
            	            break;
            	        case 29:
            	            {
            	            alt2=2;
            	            }
            	            break;
            	        case 30:
            	            {
            	            alt2=3;
            	            }
            	            break;
            	        case 31:
            	            {
            	            alt2=4;
            	            }
            	            break;
            	        case 33:
            	            {
            	            alt2=5;
            	            }
            	            break;
            	        case 34:
            	            {
            	            alt2=6;
            	            }
            	            break;
            	        case 35:
            	            {
            	            alt2=7;
            	            }
            	            break;

            	        }

            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalTM_TC_FORMAT.g:444:10: ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:444:10: ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) )
            	    	    // InternalTM_TC_FORMAT.g:445:11: (lv_CSField_24_0= ruleGSSTmTcFormatCSField )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:445:11: (lv_CSField_24_0= ruleGSSTmTcFormatCSField )
            	    	    // InternalTM_TC_FORMAT.g:446:12: lv_CSField_24_0= ruleGSSTmTcFormatCSField
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getCSFieldGSSTmTcFormatCSFieldParserRuleCall_3_4_1_0_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_12);
            	    	    lv_CSField_24_0=ruleGSSTmTcFormatCSField();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTCFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"CSField",
            	    	      													lv_CSField_24_0,
            	    	      													"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatCSField");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalTM_TC_FORMAT.g:464:10: ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:464:10: ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) )
            	    	    // InternalTM_TC_FORMAT.g:465:11: (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:465:11: (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField )
            	    	    // InternalTM_TC_FORMAT.g:466:12: lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getCSFormulaFieldGSSTmTcFormatCSFormulaFieldParserRuleCall_3_4_1_1_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_12);
            	    	    lv_CSFormulaField_25_0=ruleGSSTmTcFormatCSFormulaField();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTCFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"CSFormulaField",
            	    	      													lv_CSFormulaField_25_0,
            	    	      													"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatCSFormulaField");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // InternalTM_TC_FORMAT.g:484:10: ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:484:10: ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) )
            	    	    // InternalTM_TC_FORMAT.g:485:11: (lv_VSField_26_0= ruleGSSTmTcFormatVSField )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:485:11: (lv_VSField_26_0= ruleGSSTmTcFormatVSField )
            	    	    // InternalTM_TC_FORMAT.g:486:12: lv_VSField_26_0= ruleGSSTmTcFormatVSField
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getVSFieldGSSTmTcFormatVSFieldParserRuleCall_3_4_1_2_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_12);
            	    	    lv_VSField_26_0=ruleGSSTmTcFormatVSField();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTCFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"VSField",
            	    	      													lv_VSField_26_0,
            	    	      													"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatVSField");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 4 :
            	    	    // InternalTM_TC_FORMAT.g:504:10: ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:504:10: ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) )
            	    	    // InternalTM_TC_FORMAT.g:505:11: (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:505:11: (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField )
            	    	    // InternalTM_TC_FORMAT.g:506:12: lv_FDICField_27_0= ruleGSSTmTcFormatFDICField
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getFDICFieldGSSTmTcFormatFDICFieldParserRuleCall_3_4_1_3_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_12);
            	    	    lv_FDICField_27_0=ruleGSSTmTcFormatFDICField();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTCFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"FDICField",
            	    	      													lv_FDICField_27_0,
            	    	      													"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFDICField");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 5 :
            	    	    // InternalTM_TC_FORMAT.g:524:10: ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:524:10: ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) )
            	    	    // InternalTM_TC_FORMAT.g:525:11: (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:525:11: (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize )
            	    	    // InternalTM_TC_FORMAT.g:526:12: lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getVRFieldSizeGSSTmTcFormatVRFieldSizeParserRuleCall_3_4_1_4_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_12);
            	    	    lv_VRFieldSize_28_0=ruleGSSTmTcFormatVRFieldSize();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTCFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"VRFieldSize",
            	    	      													lv_VRFieldSize_28_0,
            	    	      													"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatVRFieldSize");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 6 :
            	    	    // InternalTM_TC_FORMAT.g:544:10: ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:544:10: ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) )
            	    	    // InternalTM_TC_FORMAT.g:545:11: (lv_AField_29_0= ruleGSSTmTcFormatAField )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:545:11: (lv_AField_29_0= ruleGSSTmTcFormatAField )
            	    	    // InternalTM_TC_FORMAT.g:546:12: lv_AField_29_0= ruleGSSTmTcFormatAField
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getAFieldGSSTmTcFormatAFieldParserRuleCall_3_4_1_5_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_12);
            	    	    lv_AField_29_0=ruleGSSTmTcFormatAField();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTCFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"AField",
            	    	      													lv_AField_29_0,
            	    	      													"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatAField");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 7 :
            	    	    // InternalTM_TC_FORMAT.g:564:10: ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:564:10: ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) )
            	    	    // InternalTM_TC_FORMAT.g:565:11: (lv_AIField_30_0= ruleGSSTmTcFormatAIField )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:565:11: (lv_AIField_30_0= ruleGSSTmTcFormatAIField )
            	    	    // InternalTM_TC_FORMAT.g:566:12: lv_AIField_30_0= ruleGSSTmTcFormatAIField
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getAIFieldGSSTmTcFormatAIFieldParserRuleCall_3_4_1_6_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_12);
            	    	    lv_AIField_30_0=ruleGSSTmTcFormatAIField();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTCFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"AIField",
            	    	      													lv_AIField_30_0,
            	    	      													"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatAIField");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3());

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleGSSTmTcFormatTmTCFormat", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3());

            }

            otherlv_31=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_31, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_32=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_32, grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getSemicolonKeyword_5());
              		
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
    // $ANTLR end "ruleGSSTmTcFormatTmTCFormat"


    // $ANTLR start "entryRuleGSSTmTcFormatCSField"
    // InternalTM_TC_FORMAT.g:613:1: entryRuleGSSTmTcFormatCSField returns [EObject current=null] : iv_ruleGSSTmTcFormatCSField= ruleGSSTmTcFormatCSField EOF ;
    public final EObject entryRuleGSSTmTcFormatCSField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatCSField = null;


        try {
            // InternalTM_TC_FORMAT.g:613:61: (iv_ruleGSSTmTcFormatCSField= ruleGSSTmTcFormatCSField EOF )
            // InternalTM_TC_FORMAT.g:614:2: iv_ruleGSSTmTcFormatCSField= ruleGSSTmTcFormatCSField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTmTcFormatCSFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTmTcFormatCSField=ruleGSSTmTcFormatCSField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTmTcFormatCSField; 
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
    // $ANTLR end "entryRuleGSSTmTcFormatCSField"


    // $ANTLR start "ruleGSSTmTcFormatCSField"
    // InternalTM_TC_FORMAT.g:620:1: ruleGSSTmTcFormatCSField returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatCSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) otherlv_32= '}' otherlv_33= ';' ) ;
    public final EObject ruleGSSTmTcFormatCSField() throws RecognitionException {
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
        Token lv_name_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_description_16_0=null;
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
        Token otherlv_32=null;
        Token otherlv_33=null;
        AntlrDatatypeRuleToken lv_fid_4_0 = null;

        AntlrDatatypeRuleToken lv_pfid_8_0 = null;

        Enumerator lv_type_20_0 = null;

        Enumerator lv_byteOrder_24_0 = null;

        Enumerator lv_firstBit_28_0 = null;

        EObject lv_size_30_0 = null;

        EObject lv_globalOffset_31_0 = null;



        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:626:2: ( (otherlv_0= 'GSSTmTcFormatCSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) otherlv_32= '}' otherlv_33= ';' ) )
            // InternalTM_TC_FORMAT.g:627:2: (otherlv_0= 'GSSTmTcFormatCSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) otherlv_32= '}' otherlv_33= ';' )
            {
            // InternalTM_TC_FORMAT.g:627:2: (otherlv_0= 'GSSTmTcFormatCSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) otherlv_32= '}' otherlv_33= ';' )
            // InternalTM_TC_FORMAT.g:628:3: otherlv_0= 'GSSTmTcFormatCSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) otherlv_32= '}' otherlv_33= ';'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatCSFieldAccess().getGSSTmTcFormatCSFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatCSFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatCSFieldAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:644:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:645:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:645:4: (lv_fid_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:646:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFieldAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_fid_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFieldRule());
              					}
              					set(
              						current,
              						"fid",
              						lv_fid_4_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatCSFieldAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:675:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:676:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:676:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:677:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFieldAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_pfid_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFieldRule());
              					}
              					set(
              						current,
              						"pfid",
              						lv_pfid_8_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatCSFieldAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalTM_TC_FORMAT.g:706:3: ( (lv_name_12_0= RULE_ID ) )
            // InternalTM_TC_FORMAT.g:707:4: (lv_name_12_0= RULE_ID )
            {
            // InternalTM_TC_FORMAT.g:707:4: (lv_name_12_0= RULE_ID )
            // InternalTM_TC_FORMAT.g:708:5: lv_name_12_0= RULE_ID
            {
            lv_name_12_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getGSSTmTcFormatCSFieldAccess().getNameIDTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTmTcFormatCSFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_12_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_13());
              		
            }
            // InternalTM_TC_FORMAT.g:728:3: (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTM_TC_FORMAT.g:729:4: otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSTmTcFormatCSFieldAccess().getDescriptionKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalTM_TC_FORMAT.g:737:4: ( (lv_description_16_0= RULE_ID ) )
                    // InternalTM_TC_FORMAT.g:738:5: (lv_description_16_0= RULE_ID )
                    {
                    // InternalTM_TC_FORMAT.g:738:5: (lv_description_16_0= RULE_ID )
                    // InternalTM_TC_FORMAT.g:739:6: lv_description_16_0= RULE_ID
                    {
                    lv_description_16_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_16_0, grammarAccess.getGSSTmTcFormatCSFieldAccess().getDescriptionIDTerminalRuleCall_14_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTmTcFormatCSFieldRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"description",
                      							lv_description_16_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,21,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSTmTcFormatCSFieldAccess().getTypeKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_16());
              		
            }
            // InternalTM_TC_FORMAT.g:768:3: ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) )
            // InternalTM_TC_FORMAT.g:769:4: (lv_type_20_0= ruleGSSTmTcFormatFieldType )
            {
            // InternalTM_TC_FORMAT.g:769:4: (lv_type_20_0= ruleGSSTmTcFormatFieldType )
            // InternalTM_TC_FORMAT.g:770:5: lv_type_20_0= ruleGSSTmTcFormatFieldType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFieldAccess().getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_type_20_0=ruleGSSTmTcFormatFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFieldRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_20_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_18());
              		
            }
            otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSTmTcFormatCSFieldAccess().getByteOrderKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,17,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_20());
              		
            }
            // InternalTM_TC_FORMAT.g:799:3: ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) )
            // InternalTM_TC_FORMAT.g:800:4: (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder )
            {
            // InternalTM_TC_FORMAT.g:800:4: (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder )
            // InternalTM_TC_FORMAT.g:801:5: lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_byteOrder_24_0=ruleGSSTmTcFormatFieldByteOrder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFieldRule());
              					}
              					set(
              						current,
              						"byteOrder",
              						lv_byteOrder_24_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldByteOrder");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_25=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_22());
              		
            }
            otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSTmTcFormatCSFieldAccess().getFirstBitKeyword_23());
              		
            }
            otherlv_27=(Token)match(input,17,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_24());
              		
            }
            // InternalTM_TC_FORMAT.g:830:3: ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) )
            // InternalTM_TC_FORMAT.g:831:4: (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit )
            {
            // InternalTM_TC_FORMAT.g:831:4: (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit )
            // InternalTM_TC_FORMAT.g:832:5: lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_firstBit_28_0=ruleGSSTmTcFormatSFieldFirstBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFieldRule());
              					}
              					set(
              						current,
              						"firstBit",
              						lv_firstBit_28_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSFieldFirstBit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_29=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_26());
              		
            }
            // InternalTM_TC_FORMAT.g:853:3: ( (lv_size_30_0= ruleGSSTmTcFormatSize ) )
            // InternalTM_TC_FORMAT.g:854:4: (lv_size_30_0= ruleGSSTmTcFormatSize )
            {
            // InternalTM_TC_FORMAT.g:854:4: (lv_size_30_0= ruleGSSTmTcFormatSize )
            // InternalTM_TC_FORMAT.g:855:5: lv_size_30_0= ruleGSSTmTcFormatSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFieldAccess().getSizeGSSTmTcFormatSizeParserRuleCall_27_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_25);
            lv_size_30_0=ruleGSSTmTcFormatSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFieldRule());
              					}
              					set(
              						current,
              						"size",
              						lv_size_30_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTM_TC_FORMAT.g:872:3: ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) )
            // InternalTM_TC_FORMAT.g:873:4: (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset )
            {
            // InternalTM_TC_FORMAT.g:873:4: (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset )
            // InternalTM_TC_FORMAT.g:874:5: lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFieldAccess().getGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_globalOffset_31_0=ruleGSSTmTcFormatGlobalOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFieldRule());
              					}
              					set(
              						current,
              						"globalOffset",
              						lv_globalOffset_31_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatGlobalOffset");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_32=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_32, grammarAccess.getGSSTmTcFormatCSFieldAccess().getRightCurlyBracketKeyword_29());
              		
            }
            otherlv_33=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_33, grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_30());
              		
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
    // $ANTLR end "ruleGSSTmTcFormatCSField"


    // $ANTLR start "entryRuleGSSTmTcFormatCSFormulaField"
    // InternalTM_TC_FORMAT.g:903:1: entryRuleGSSTmTcFormatCSFormulaField returns [EObject current=null] : iv_ruleGSSTmTcFormatCSFormulaField= ruleGSSTmTcFormatCSFormulaField EOF ;
    public final EObject entryRuleGSSTmTcFormatCSFormulaField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatCSFormulaField = null;


        try {
            // InternalTM_TC_FORMAT.g:903:68: (iv_ruleGSSTmTcFormatCSFormulaField= ruleGSSTmTcFormatCSFormulaField EOF )
            // InternalTM_TC_FORMAT.g:904:2: iv_ruleGSSTmTcFormatCSFormulaField= ruleGSSTmTcFormatCSFormulaField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTmTcFormatCSFormulaFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTmTcFormatCSFormulaField=ruleGSSTmTcFormatCSFormulaField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTmTcFormatCSFormulaField; 
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
    // $ANTLR end "entryRuleGSSTmTcFormatCSFormulaField"


    // $ANTLR start "ruleGSSTmTcFormatCSFormulaField"
    // InternalTM_TC_FORMAT.g:910:1: ruleGSSTmTcFormatCSFormulaField returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatCSFormulaField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) ( (lv_formula_32_0= ruleGSSTmTcFormatFormula ) ) otherlv_33= '}' otherlv_34= ';' ) ;
    public final EObject ruleGSSTmTcFormatCSFormulaField() throws RecognitionException {
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
        Token lv_name_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_description_16_0=null;
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
        Token otherlv_33=null;
        Token otherlv_34=null;
        AntlrDatatypeRuleToken lv_fid_4_0 = null;

        AntlrDatatypeRuleToken lv_pfid_8_0 = null;

        Enumerator lv_type_20_0 = null;

        Enumerator lv_byteOrder_24_0 = null;

        Enumerator lv_firstBit_28_0 = null;

        EObject lv_size_30_0 = null;

        EObject lv_globalOffset_31_0 = null;

        EObject lv_formula_32_0 = null;



        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:916:2: ( (otherlv_0= 'GSSTmTcFormatCSFormulaField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) ( (lv_formula_32_0= ruleGSSTmTcFormatFormula ) ) otherlv_33= '}' otherlv_34= ';' ) )
            // InternalTM_TC_FORMAT.g:917:2: (otherlv_0= 'GSSTmTcFormatCSFormulaField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) ( (lv_formula_32_0= ruleGSSTmTcFormatFormula ) ) otherlv_33= '}' otherlv_34= ';' )
            {
            // InternalTM_TC_FORMAT.g:917:2: (otherlv_0= 'GSSTmTcFormatCSFormulaField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) ( (lv_formula_32_0= ruleGSSTmTcFormatFormula ) ) otherlv_33= '}' otherlv_34= ';' )
            // InternalTM_TC_FORMAT.g:918:3: otherlv_0= 'GSSTmTcFormatCSFormulaField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) ( (lv_formula_32_0= ruleGSSTmTcFormatFormula ) ) otherlv_33= '}' otherlv_34= ';'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getGSSTmTcFormatCSFormulaFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:934:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:935:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:935:4: (lv_fid_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:936:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_fid_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFormulaFieldRule());
              					}
              					set(
              						current,
              						"fid",
              						lv_fid_4_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:965:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:966:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:966:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:967:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_pfid_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFormulaFieldRule());
              					}
              					set(
              						current,
              						"pfid",
              						lv_pfid_8_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalTM_TC_FORMAT.g:996:3: ( (lv_name_12_0= RULE_ID ) )
            // InternalTM_TC_FORMAT.g:997:4: (lv_name_12_0= RULE_ID )
            {
            // InternalTM_TC_FORMAT.g:997:4: (lv_name_12_0= RULE_ID )
            // InternalTM_TC_FORMAT.g:998:5: lv_name_12_0= RULE_ID
            {
            lv_name_12_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getNameIDTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTmTcFormatCSFormulaFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_12_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_13());
              		
            }
            // InternalTM_TC_FORMAT.g:1018:3: (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTM_TC_FORMAT.g:1019:4: otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getDescriptionKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalTM_TC_FORMAT.g:1027:4: ( (lv_description_16_0= RULE_ID ) )
                    // InternalTM_TC_FORMAT.g:1028:5: (lv_description_16_0= RULE_ID )
                    {
                    // InternalTM_TC_FORMAT.g:1028:5: (lv_description_16_0= RULE_ID )
                    // InternalTM_TC_FORMAT.g:1029:6: lv_description_16_0= RULE_ID
                    {
                    lv_description_16_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_16_0, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getDescriptionIDTerminalRuleCall_14_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTmTcFormatCSFormulaFieldRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"description",
                      							lv_description_16_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,21,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getTypeKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_16());
              		
            }
            // InternalTM_TC_FORMAT.g:1058:3: ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) )
            // InternalTM_TC_FORMAT.g:1059:4: (lv_type_20_0= ruleGSSTmTcFormatFieldType )
            {
            // InternalTM_TC_FORMAT.g:1059:4: (lv_type_20_0= ruleGSSTmTcFormatFieldType )
            // InternalTM_TC_FORMAT.g:1060:5: lv_type_20_0= ruleGSSTmTcFormatFieldType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_type_20_0=ruleGSSTmTcFormatFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFormulaFieldRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_20_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_18());
              		
            }
            otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getByteOrderKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,17,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_20());
              		
            }
            // InternalTM_TC_FORMAT.g:1089:3: ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) )
            // InternalTM_TC_FORMAT.g:1090:4: (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder )
            {
            // InternalTM_TC_FORMAT.g:1090:4: (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder )
            // InternalTM_TC_FORMAT.g:1091:5: lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_byteOrder_24_0=ruleGSSTmTcFormatFieldByteOrder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFormulaFieldRule());
              					}
              					set(
              						current,
              						"byteOrder",
              						lv_byteOrder_24_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldByteOrder");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_25=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_22());
              		
            }
            otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFirstBitKeyword_23());
              		
            }
            otherlv_27=(Token)match(input,17,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_24());
              		
            }
            // InternalTM_TC_FORMAT.g:1120:3: ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) )
            // InternalTM_TC_FORMAT.g:1121:4: (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit )
            {
            // InternalTM_TC_FORMAT.g:1121:4: (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit )
            // InternalTM_TC_FORMAT.g:1122:5: lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_firstBit_28_0=ruleGSSTmTcFormatSFieldFirstBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFormulaFieldRule());
              					}
              					set(
              						current,
              						"firstBit",
              						lv_firstBit_28_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSFieldFirstBit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_29=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_26());
              		
            }
            // InternalTM_TC_FORMAT.g:1143:3: ( (lv_size_30_0= ruleGSSTmTcFormatSize ) )
            // InternalTM_TC_FORMAT.g:1144:4: (lv_size_30_0= ruleGSSTmTcFormatSize )
            {
            // InternalTM_TC_FORMAT.g:1144:4: (lv_size_30_0= ruleGSSTmTcFormatSize )
            // InternalTM_TC_FORMAT.g:1145:5: lv_size_30_0= ruleGSSTmTcFormatSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSizeGSSTmTcFormatSizeParserRuleCall_27_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_25);
            lv_size_30_0=ruleGSSTmTcFormatSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFormulaFieldRule());
              					}
              					set(
              						current,
              						"size",
              						lv_size_30_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTM_TC_FORMAT.g:1162:3: ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) )
            // InternalTM_TC_FORMAT.g:1163:4: (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset )
            {
            // InternalTM_TC_FORMAT.g:1163:4: (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset )
            // InternalTM_TC_FORMAT.g:1164:5: lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_27);
            lv_globalOffset_31_0=ruleGSSTmTcFormatGlobalOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFormulaFieldRule());
              					}
              					set(
              						current,
              						"globalOffset",
              						lv_globalOffset_31_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatGlobalOffset");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTM_TC_FORMAT.g:1181:3: ( (lv_formula_32_0= ruleGSSTmTcFormatFormula ) )
            // InternalTM_TC_FORMAT.g:1182:4: (lv_formula_32_0= ruleGSSTmTcFormatFormula )
            {
            // InternalTM_TC_FORMAT.g:1182:4: (lv_formula_32_0= ruleGSSTmTcFormatFormula )
            // InternalTM_TC_FORMAT.g:1183:5: lv_formula_32_0= ruleGSSTmTcFormatFormula
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFormulaGSSTmTcFormatFormulaParserRuleCall_29_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_formula_32_0=ruleGSSTmTcFormatFormula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatCSFormulaFieldRule());
              					}
              					set(
              						current,
              						"formula",
              						lv_formula_32_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFormula");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_33=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_33, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getRightCurlyBracketKeyword_30());
              		
            }
            otherlv_34=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_34, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_31());
              		
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
    // $ANTLR end "ruleGSSTmTcFormatCSFormulaField"


    // $ANTLR start "entryRuleGSSTmTcFormatVSField"
    // InternalTM_TC_FORMAT.g:1212:1: entryRuleGSSTmTcFormatVSField returns [EObject current=null] : iv_ruleGSSTmTcFormatVSField= ruleGSSTmTcFormatVSField EOF ;
    public final EObject entryRuleGSSTmTcFormatVSField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatVSField = null;


        try {
            // InternalTM_TC_FORMAT.g:1212:61: (iv_ruleGSSTmTcFormatVSField= ruleGSSTmTcFormatVSField EOF )
            // InternalTM_TC_FORMAT.g:1213:2: iv_ruleGSSTmTcFormatVSField= ruleGSSTmTcFormatVSField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTmTcFormatVSField=ruleGSSTmTcFormatVSField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTmTcFormatVSField; 
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
    // $ANTLR end "entryRuleGSSTmTcFormatVSField"


    // $ANTLR start "ruleGSSTmTcFormatVSField"
    // InternalTM_TC_FORMAT.g:1219:1: ruleGSSTmTcFormatVSField returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatVSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_constSize_30_0= ruleGSSTmTcFormatConstSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) ( (lv_maxSize_32_0= ruleGSSTmTcFormatMaxSize ) ) ( (lv_variableSize_33_0= ruleGSSTmTcFormatVariableSize ) ) otherlv_34= '}' otherlv_35= ';' ) ;
    public final EObject ruleGSSTmTcFormatVSField() throws RecognitionException {
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
        Token lv_name_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_description_16_0=null;
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
        Token otherlv_34=null;
        Token otherlv_35=null;
        AntlrDatatypeRuleToken lv_fid_4_0 = null;

        AntlrDatatypeRuleToken lv_pfid_8_0 = null;

        Enumerator lv_type_20_0 = null;

        Enumerator lv_byteOrder_24_0 = null;

        Enumerator lv_firstBit_28_0 = null;

        EObject lv_constSize_30_0 = null;

        EObject lv_globalOffset_31_0 = null;

        EObject lv_maxSize_32_0 = null;

        EObject lv_variableSize_33_0 = null;



        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:1225:2: ( (otherlv_0= 'GSSTmTcFormatVSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_constSize_30_0= ruleGSSTmTcFormatConstSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) ( (lv_maxSize_32_0= ruleGSSTmTcFormatMaxSize ) ) ( (lv_variableSize_33_0= ruleGSSTmTcFormatVariableSize ) ) otherlv_34= '}' otherlv_35= ';' ) )
            // InternalTM_TC_FORMAT.g:1226:2: (otherlv_0= 'GSSTmTcFormatVSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_constSize_30_0= ruleGSSTmTcFormatConstSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) ( (lv_maxSize_32_0= ruleGSSTmTcFormatMaxSize ) ) ( (lv_variableSize_33_0= ruleGSSTmTcFormatVariableSize ) ) otherlv_34= '}' otherlv_35= ';' )
            {
            // InternalTM_TC_FORMAT.g:1226:2: (otherlv_0= 'GSSTmTcFormatVSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_constSize_30_0= ruleGSSTmTcFormatConstSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) ( (lv_maxSize_32_0= ruleGSSTmTcFormatMaxSize ) ) ( (lv_variableSize_33_0= ruleGSSTmTcFormatVariableSize ) ) otherlv_34= '}' otherlv_35= ';' )
            // InternalTM_TC_FORMAT.g:1227:3: otherlv_0= 'GSSTmTcFormatVSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_constSize_30_0= ruleGSSTmTcFormatConstSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) ( (lv_maxSize_32_0= ruleGSSTmTcFormatMaxSize ) ) ( (lv_variableSize_33_0= ruleGSSTmTcFormatVariableSize ) ) otherlv_34= '}' otherlv_35= ';'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatVSFieldAccess().getGSSTmTcFormatVSFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatVSFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatVSFieldAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:1243:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:1244:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:1244:4: (lv_fid_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:1245:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_fid_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVSFieldRule());
              					}
              					set(
              						current,
              						"fid",
              						lv_fid_4_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatVSFieldAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:1274:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:1275:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:1275:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:1276:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_pfid_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVSFieldRule());
              					}
              					set(
              						current,
              						"pfid",
              						lv_pfid_8_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatVSFieldAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalTM_TC_FORMAT.g:1305:3: ( (lv_name_12_0= RULE_ID ) )
            // InternalTM_TC_FORMAT.g:1306:4: (lv_name_12_0= RULE_ID )
            {
            // InternalTM_TC_FORMAT.g:1306:4: (lv_name_12_0= RULE_ID )
            // InternalTM_TC_FORMAT.g:1307:5: lv_name_12_0= RULE_ID
            {
            lv_name_12_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getGSSTmTcFormatVSFieldAccess().getNameIDTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTmTcFormatVSFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_12_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_13());
              		
            }
            // InternalTM_TC_FORMAT.g:1327:3: (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTM_TC_FORMAT.g:1328:4: otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSTmTcFormatVSFieldAccess().getDescriptionKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalTM_TC_FORMAT.g:1336:4: ( (lv_description_16_0= RULE_ID ) )
                    // InternalTM_TC_FORMAT.g:1337:5: (lv_description_16_0= RULE_ID )
                    {
                    // InternalTM_TC_FORMAT.g:1337:5: (lv_description_16_0= RULE_ID )
                    // InternalTM_TC_FORMAT.g:1338:6: lv_description_16_0= RULE_ID
                    {
                    lv_description_16_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_16_0, grammarAccess.getGSSTmTcFormatVSFieldAccess().getDescriptionIDTerminalRuleCall_14_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTmTcFormatVSFieldRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"description",
                      							lv_description_16_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,21,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSTmTcFormatVSFieldAccess().getTypeKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_16());
              		
            }
            // InternalTM_TC_FORMAT.g:1367:3: ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) )
            // InternalTM_TC_FORMAT.g:1368:4: (lv_type_20_0= ruleGSSTmTcFormatFieldType )
            {
            // InternalTM_TC_FORMAT.g:1368:4: (lv_type_20_0= ruleGSSTmTcFormatFieldType )
            // InternalTM_TC_FORMAT.g:1369:5: lv_type_20_0= ruleGSSTmTcFormatFieldType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_type_20_0=ruleGSSTmTcFormatFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVSFieldRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_20_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_18());
              		
            }
            otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSTmTcFormatVSFieldAccess().getByteOrderKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,17,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_20());
              		
            }
            // InternalTM_TC_FORMAT.g:1398:3: ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) )
            // InternalTM_TC_FORMAT.g:1399:4: (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder )
            {
            // InternalTM_TC_FORMAT.g:1399:4: (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder )
            // InternalTM_TC_FORMAT.g:1400:5: lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_byteOrder_24_0=ruleGSSTmTcFormatFieldByteOrder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVSFieldRule());
              					}
              					set(
              						current,
              						"byteOrder",
              						lv_byteOrder_24_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldByteOrder");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_25=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_22());
              		
            }
            otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSTmTcFormatVSFieldAccess().getFirstBitKeyword_23());
              		
            }
            otherlv_27=(Token)match(input,17,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_24());
              		
            }
            // InternalTM_TC_FORMAT.g:1429:3: ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) )
            // InternalTM_TC_FORMAT.g:1430:4: (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit )
            {
            // InternalTM_TC_FORMAT.g:1430:4: (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit )
            // InternalTM_TC_FORMAT.g:1431:5: lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_firstBit_28_0=ruleGSSTmTcFormatSFieldFirstBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVSFieldRule());
              					}
              					set(
              						current,
              						"firstBit",
              						lv_firstBit_28_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSFieldFirstBit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_29=(Token)match(input,13,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_26());
              		
            }
            // InternalTM_TC_FORMAT.g:1452:3: ( (lv_constSize_30_0= ruleGSSTmTcFormatConstSize ) )
            // InternalTM_TC_FORMAT.g:1453:4: (lv_constSize_30_0= ruleGSSTmTcFormatConstSize )
            {
            // InternalTM_TC_FORMAT.g:1453:4: (lv_constSize_30_0= ruleGSSTmTcFormatConstSize )
            // InternalTM_TC_FORMAT.g:1454:5: lv_constSize_30_0= ruleGSSTmTcFormatConstSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getConstSizeGSSTmTcFormatConstSizeParserRuleCall_27_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_25);
            lv_constSize_30_0=ruleGSSTmTcFormatConstSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVSFieldRule());
              					}
              					set(
              						current,
              						"constSize",
              						lv_constSize_30_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatConstSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTM_TC_FORMAT.g:1471:3: ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) )
            // InternalTM_TC_FORMAT.g:1472:4: (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset )
            {
            // InternalTM_TC_FORMAT.g:1472:4: (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset )
            // InternalTM_TC_FORMAT.g:1473:5: lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_29);
            lv_globalOffset_31_0=ruleGSSTmTcFormatGlobalOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVSFieldRule());
              					}
              					set(
              						current,
              						"globalOffset",
              						lv_globalOffset_31_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatGlobalOffset");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTM_TC_FORMAT.g:1490:3: ( (lv_maxSize_32_0= ruleGSSTmTcFormatMaxSize ) )
            // InternalTM_TC_FORMAT.g:1491:4: (lv_maxSize_32_0= ruleGSSTmTcFormatMaxSize )
            {
            // InternalTM_TC_FORMAT.g:1491:4: (lv_maxSize_32_0= ruleGSSTmTcFormatMaxSize )
            // InternalTM_TC_FORMAT.g:1492:5: lv_maxSize_32_0= ruleGSSTmTcFormatMaxSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getMaxSizeGSSTmTcFormatMaxSizeParserRuleCall_29_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_30);
            lv_maxSize_32_0=ruleGSSTmTcFormatMaxSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVSFieldRule());
              					}
              					set(
              						current,
              						"maxSize",
              						lv_maxSize_32_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatMaxSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTM_TC_FORMAT.g:1509:3: ( (lv_variableSize_33_0= ruleGSSTmTcFormatVariableSize ) )
            // InternalTM_TC_FORMAT.g:1510:4: (lv_variableSize_33_0= ruleGSSTmTcFormatVariableSize )
            {
            // InternalTM_TC_FORMAT.g:1510:4: (lv_variableSize_33_0= ruleGSSTmTcFormatVariableSize )
            // InternalTM_TC_FORMAT.g:1511:5: lv_variableSize_33_0= ruleGSSTmTcFormatVariableSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getVariableSizeGSSTmTcFormatVariableSizeParserRuleCall_30_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_variableSize_33_0=ruleGSSTmTcFormatVariableSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVSFieldRule());
              					}
              					set(
              						current,
              						"variableSize",
              						lv_variableSize_33_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatVariableSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_34=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_34, grammarAccess.getGSSTmTcFormatVSFieldAccess().getRightCurlyBracketKeyword_31());
              		
            }
            otherlv_35=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_35, grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_32());
              		
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
    // $ANTLR end "ruleGSSTmTcFormatVSField"


    // $ANTLR start "entryRuleGSSTmTcFormatFDICField"
    // InternalTM_TC_FORMAT.g:1540:1: entryRuleGSSTmTcFormatFDICField returns [EObject current=null] : iv_ruleGSSTmTcFormatFDICField= ruleGSSTmTcFormatFDICField EOF ;
    public final EObject entryRuleGSSTmTcFormatFDICField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatFDICField = null;


        try {
            // InternalTM_TC_FORMAT.g:1540:63: (iv_ruleGSSTmTcFormatFDICField= ruleGSSTmTcFormatFDICField EOF )
            // InternalTM_TC_FORMAT.g:1541:2: iv_ruleGSSTmTcFormatFDICField= ruleGSSTmTcFormatFDICField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTmTcFormatFDICFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTmTcFormatFDICField=ruleGSSTmTcFormatFDICField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTmTcFormatFDICField; 
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
    // $ANTLR end "entryRuleGSSTmTcFormatFDICField"


    // $ANTLR start "ruleGSSTmTcFormatFDICField"
    // InternalTM_TC_FORMAT.g:1547:1: ruleGSSTmTcFormatFDICField returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatFDICField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'checkType' otherlv_19= ':=' ( (lv_checkType_20_0= ruleGSSTmTcFormatCheckType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_floatingOffset_31_0= ruleGSSTmTcFormatFloatingOffset ) ) ( (lv_sortedFieldsToCheck_32_0= ruleGSSTmTcFormatSortedFieldsToCheck ) ) otherlv_33= '}' otherlv_34= ';' ) ;
    public final EObject ruleGSSTmTcFormatFDICField() throws RecognitionException {
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
        Token lv_name_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_description_16_0=null;
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
        Token otherlv_33=null;
        Token otherlv_34=null;
        AntlrDatatypeRuleToken lv_fid_4_0 = null;

        AntlrDatatypeRuleToken lv_pfid_8_0 = null;

        Enumerator lv_checkType_20_0 = null;

        Enumerator lv_byteOrder_24_0 = null;

        Enumerator lv_firstBit_28_0 = null;

        EObject lv_size_30_0 = null;

        EObject lv_floatingOffset_31_0 = null;

        EObject lv_sortedFieldsToCheck_32_0 = null;



        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:1553:2: ( (otherlv_0= 'GSSTmTcFormatFDICField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'checkType' otherlv_19= ':=' ( (lv_checkType_20_0= ruleGSSTmTcFormatCheckType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_floatingOffset_31_0= ruleGSSTmTcFormatFloatingOffset ) ) ( (lv_sortedFieldsToCheck_32_0= ruleGSSTmTcFormatSortedFieldsToCheck ) ) otherlv_33= '}' otherlv_34= ';' ) )
            // InternalTM_TC_FORMAT.g:1554:2: (otherlv_0= 'GSSTmTcFormatFDICField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'checkType' otherlv_19= ':=' ( (lv_checkType_20_0= ruleGSSTmTcFormatCheckType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_floatingOffset_31_0= ruleGSSTmTcFormatFloatingOffset ) ) ( (lv_sortedFieldsToCheck_32_0= ruleGSSTmTcFormatSortedFieldsToCheck ) ) otherlv_33= '}' otherlv_34= ';' )
            {
            // InternalTM_TC_FORMAT.g:1554:2: (otherlv_0= 'GSSTmTcFormatFDICField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'checkType' otherlv_19= ':=' ( (lv_checkType_20_0= ruleGSSTmTcFormatCheckType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_floatingOffset_31_0= ruleGSSTmTcFormatFloatingOffset ) ) ( (lv_sortedFieldsToCheck_32_0= ruleGSSTmTcFormatSortedFieldsToCheck ) ) otherlv_33= '}' otherlv_34= ';' )
            // InternalTM_TC_FORMAT.g:1555:3: otherlv_0= 'GSSTmTcFormatFDICField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'checkType' otherlv_19= ':=' ( (lv_checkType_20_0= ruleGSSTmTcFormatCheckType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_floatingOffset_31_0= ruleGSSTmTcFormatFloatingOffset ) ) ( (lv_sortedFieldsToCheck_32_0= ruleGSSTmTcFormatSortedFieldsToCheck ) ) otherlv_33= '}' otherlv_34= ';'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getGSSTmTcFormatFDICFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:1571:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:1572:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:1572:4: (lv_fid_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:1573:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_fid_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatFDICFieldRule());
              					}
              					set(
              						current,
              						"fid",
              						lv_fid_4_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:1602:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:1603:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:1603:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:1604:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_pfid_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatFDICFieldRule());
              					}
              					set(
              						current,
              						"pfid",
              						lv_pfid_8_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalTM_TC_FORMAT.g:1633:3: ( (lv_name_12_0= RULE_ID ) )
            // InternalTM_TC_FORMAT.g:1634:4: (lv_name_12_0= RULE_ID )
            {
            // InternalTM_TC_FORMAT.g:1634:4: (lv_name_12_0= RULE_ID )
            // InternalTM_TC_FORMAT.g:1635:5: lv_name_12_0= RULE_ID
            {
            lv_name_12_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getNameIDTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTmTcFormatFDICFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_12_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_13());
              		
            }
            // InternalTM_TC_FORMAT.g:1655:3: (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTM_TC_FORMAT.g:1656:4: otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getDescriptionKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalTM_TC_FORMAT.g:1664:4: ( (lv_description_16_0= RULE_ID ) )
                    // InternalTM_TC_FORMAT.g:1665:5: (lv_description_16_0= RULE_ID )
                    {
                    // InternalTM_TC_FORMAT.g:1665:5: (lv_description_16_0= RULE_ID )
                    // InternalTM_TC_FORMAT.g:1666:6: lv_description_16_0= RULE_ID
                    {
                    lv_description_16_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_16_0, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getDescriptionIDTerminalRuleCall_14_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTmTcFormatFDICFieldRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"description",
                      							lv_description_16_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,32,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getCheckTypeKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_16());
              		
            }
            // InternalTM_TC_FORMAT.g:1695:3: ( (lv_checkType_20_0= ruleGSSTmTcFormatCheckType ) )
            // InternalTM_TC_FORMAT.g:1696:4: (lv_checkType_20_0= ruleGSSTmTcFormatCheckType )
            {
            // InternalTM_TC_FORMAT.g:1696:4: (lv_checkType_20_0= ruleGSSTmTcFormatCheckType )
            // InternalTM_TC_FORMAT.g:1697:5: lv_checkType_20_0= ruleGSSTmTcFormatCheckType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getCheckTypeGSSTmTcFormatCheckTypeEnumRuleCall_17_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_checkType_20_0=ruleGSSTmTcFormatCheckType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatFDICFieldRule());
              					}
              					set(
              						current,
              						"checkType",
              						lv_checkType_20_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatCheckType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_18());
              		
            }
            otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getByteOrderKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,17,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_20());
              		
            }
            // InternalTM_TC_FORMAT.g:1726:3: ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) )
            // InternalTM_TC_FORMAT.g:1727:4: (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder )
            {
            // InternalTM_TC_FORMAT.g:1727:4: (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder )
            // InternalTM_TC_FORMAT.g:1728:5: lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_byteOrder_24_0=ruleGSSTmTcFormatFieldByteOrder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatFDICFieldRule());
              					}
              					set(
              						current,
              						"byteOrder",
              						lv_byteOrder_24_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldByteOrder");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_25=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_22());
              		
            }
            otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFirstBitKeyword_23());
              		
            }
            otherlv_27=(Token)match(input,17,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_24());
              		
            }
            // InternalTM_TC_FORMAT.g:1757:3: ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) )
            // InternalTM_TC_FORMAT.g:1758:4: (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit )
            {
            // InternalTM_TC_FORMAT.g:1758:4: (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit )
            // InternalTM_TC_FORMAT.g:1759:5: lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_firstBit_28_0=ruleGSSTmTcFormatSFieldFirstBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatFDICFieldRule());
              					}
              					set(
              						current,
              						"firstBit",
              						lv_firstBit_28_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSFieldFirstBit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_29=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_26());
              		
            }
            // InternalTM_TC_FORMAT.g:1780:3: ( (lv_size_30_0= ruleGSSTmTcFormatSize ) )
            // InternalTM_TC_FORMAT.g:1781:4: (lv_size_30_0= ruleGSSTmTcFormatSize )
            {
            // InternalTM_TC_FORMAT.g:1781:4: (lv_size_30_0= ruleGSSTmTcFormatSize )
            // InternalTM_TC_FORMAT.g:1782:5: lv_size_30_0= ruleGSSTmTcFormatSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSizeGSSTmTcFormatSizeParserRuleCall_27_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_34);
            lv_size_30_0=ruleGSSTmTcFormatSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatFDICFieldRule());
              					}
              					set(
              						current,
              						"size",
              						lv_size_30_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTM_TC_FORMAT.g:1799:3: ( (lv_floatingOffset_31_0= ruleGSSTmTcFormatFloatingOffset ) )
            // InternalTM_TC_FORMAT.g:1800:4: (lv_floatingOffset_31_0= ruleGSSTmTcFormatFloatingOffset )
            {
            // InternalTM_TC_FORMAT.g:1800:4: (lv_floatingOffset_31_0= ruleGSSTmTcFormatFloatingOffset )
            // InternalTM_TC_FORMAT.g:1801:5: lv_floatingOffset_31_0= ruleGSSTmTcFormatFloatingOffset
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFloatingOffsetGSSTmTcFormatFloatingOffsetParserRuleCall_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_35);
            lv_floatingOffset_31_0=ruleGSSTmTcFormatFloatingOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatFDICFieldRule());
              					}
              					set(
              						current,
              						"floatingOffset",
              						lv_floatingOffset_31_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFloatingOffset");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTM_TC_FORMAT.g:1818:3: ( (lv_sortedFieldsToCheck_32_0= ruleGSSTmTcFormatSortedFieldsToCheck ) )
            // InternalTM_TC_FORMAT.g:1819:4: (lv_sortedFieldsToCheck_32_0= ruleGSSTmTcFormatSortedFieldsToCheck )
            {
            // InternalTM_TC_FORMAT.g:1819:4: (lv_sortedFieldsToCheck_32_0= ruleGSSTmTcFormatSortedFieldsToCheck )
            // InternalTM_TC_FORMAT.g:1820:5: lv_sortedFieldsToCheck_32_0= ruleGSSTmTcFormatSortedFieldsToCheck
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSortedFieldsToCheckGSSTmTcFormatSortedFieldsToCheckParserRuleCall_29_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_sortedFieldsToCheck_32_0=ruleGSSTmTcFormatSortedFieldsToCheck();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatFDICFieldRule());
              					}
              					set(
              						current,
              						"sortedFieldsToCheck",
              						lv_sortedFieldsToCheck_32_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSortedFieldsToCheck");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_33=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_33, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getRightCurlyBracketKeyword_30());
              		
            }
            otherlv_34=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_34, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_31());
              		
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
    // $ANTLR end "ruleGSSTmTcFormatFDICField"


    // $ANTLR start "entryRuleGSSTmTcFormatVRFieldSize"
    // InternalTM_TC_FORMAT.g:1849:1: entryRuleGSSTmTcFormatVRFieldSize returns [EObject current=null] : iv_ruleGSSTmTcFormatVRFieldSize= ruleGSSTmTcFormatVRFieldSize EOF ;
    public final EObject entryRuleGSSTmTcFormatVRFieldSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatVRFieldSize = null;


        try {
            // InternalTM_TC_FORMAT.g:1849:65: (iv_ruleGSSTmTcFormatVRFieldSize= ruleGSSTmTcFormatVRFieldSize EOF )
            // InternalTM_TC_FORMAT.g:1850:2: iv_ruleGSSTmTcFormatVRFieldSize= ruleGSSTmTcFormatVRFieldSize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTmTcFormatVRFieldSizeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTmTcFormatVRFieldSize=ruleGSSTmTcFormatVRFieldSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTmTcFormatVRFieldSize; 
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
    // $ANTLR end "entryRuleGSSTmTcFormatVRFieldSize"


    // $ANTLR start "ruleGSSTmTcFormatVRFieldSize"
    // InternalTM_TC_FORMAT.g:1856:1: ruleGSSTmTcFormatVRFieldSize returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatVRFieldSize' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) ;
    public final EObject ruleGSSTmTcFormatVRFieldSize() throws RecognitionException {
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
        Token lv_name_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_fid_4_0 = null;

        AntlrDatatypeRuleToken lv_pfid_8_0 = null;



        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:1862:2: ( (otherlv_0= 'GSSTmTcFormatVRFieldSize' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) )
            // InternalTM_TC_FORMAT.g:1863:2: (otherlv_0= 'GSSTmTcFormatVRFieldSize' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            {
            // InternalTM_TC_FORMAT.g:1863:2: (otherlv_0= 'GSSTmTcFormatVRFieldSize' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            // InternalTM_TC_FORMAT.g:1864:3: otherlv_0= 'GSSTmTcFormatVRFieldSize' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getGSSTmTcFormatVRFieldSizeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:1880:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:1881:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:1881:4: (lv_fid_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:1882:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_fid_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVRFieldSizeRule());
              					}
              					set(
              						current,
              						"fid",
              						lv_fid_4_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:1911:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:1912:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:1912:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:1913:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_pfid_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVRFieldSizeRule());
              					}
              					set(
              						current,
              						"pfid",
              						lv_pfid_8_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalTM_TC_FORMAT.g:1942:3: ( (lv_name_12_0= RULE_ID ) )
            // InternalTM_TC_FORMAT.g:1943:4: (lv_name_12_0= RULE_ID )
            {
            // InternalTM_TC_FORMAT.g:1943:4: (lv_name_12_0= RULE_ID )
            // InternalTM_TC_FORMAT.g:1944:5: lv_name_12_0= RULE_ID
            {
            lv_name_12_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getNameIDTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTmTcFormatVRFieldSizeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_12_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getRightCurlyBracketKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getSemicolonKeyword_15());
              		
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
    // $ANTLR end "ruleGSSTmTcFormatVRFieldSize"


    // $ANTLR start "entryRuleGSSTmTcFormatAField"
    // InternalTM_TC_FORMAT.g:1976:1: entryRuleGSSTmTcFormatAField returns [EObject current=null] : iv_ruleGSSTmTcFormatAField= ruleGSSTmTcFormatAField EOF ;
    public final EObject entryRuleGSSTmTcFormatAField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatAField = null;


        try {
            // InternalTM_TC_FORMAT.g:1976:60: (iv_ruleGSSTmTcFormatAField= ruleGSSTmTcFormatAField EOF )
            // InternalTM_TC_FORMAT.g:1977:2: iv_ruleGSSTmTcFormatAField= ruleGSSTmTcFormatAField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTmTcFormatAFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTmTcFormatAField=ruleGSSTmTcFormatAField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTmTcFormatAField; 
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
    // $ANTLR end "entryRuleGSSTmTcFormatAField"


    // $ANTLR start "ruleGSSTmTcFormatAField"
    // InternalTM_TC_FORMAT.g:1983:1: ruleGSSTmTcFormatAField returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatAField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) ( (lv_arrayDimension_32_0= ruleGSSTmTcFormatArrayDimension ) ) otherlv_33= '}' otherlv_34= ';' ) ;
    public final EObject ruleGSSTmTcFormatAField() throws RecognitionException {
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
        Token lv_name_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_description_16_0=null;
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
        Token otherlv_33=null;
        Token otherlv_34=null;
        AntlrDatatypeRuleToken lv_fid_4_0 = null;

        AntlrDatatypeRuleToken lv_pfid_8_0 = null;

        Enumerator lv_type_20_0 = null;

        Enumerator lv_byteOrder_24_0 = null;

        Enumerator lv_firstBit_28_0 = null;

        EObject lv_size_30_0 = null;

        EObject lv_globalOffset_31_0 = null;

        EObject lv_arrayDimension_32_0 = null;



        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:1989:2: ( (otherlv_0= 'GSSTmTcFormatAField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) ( (lv_arrayDimension_32_0= ruleGSSTmTcFormatArrayDimension ) ) otherlv_33= '}' otherlv_34= ';' ) )
            // InternalTM_TC_FORMAT.g:1990:2: (otherlv_0= 'GSSTmTcFormatAField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) ( (lv_arrayDimension_32_0= ruleGSSTmTcFormatArrayDimension ) ) otherlv_33= '}' otherlv_34= ';' )
            {
            // InternalTM_TC_FORMAT.g:1990:2: (otherlv_0= 'GSSTmTcFormatAField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) ( (lv_arrayDimension_32_0= ruleGSSTmTcFormatArrayDimension ) ) otherlv_33= '}' otherlv_34= ';' )
            // InternalTM_TC_FORMAT.g:1991:3: otherlv_0= 'GSSTmTcFormatAField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) ( (lv_arrayDimension_32_0= ruleGSSTmTcFormatArrayDimension ) ) otherlv_33= '}' otherlv_34= ';'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatAFieldAccess().getGSSTmTcFormatAFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatAFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatAFieldAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:2007:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:2008:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:2008:4: (lv_fid_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:2009:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAFieldAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_fid_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAFieldRule());
              					}
              					set(
              						current,
              						"fid",
              						lv_fid_4_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatAFieldAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:2038:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:2039:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:2039:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:2040:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAFieldAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_pfid_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAFieldRule());
              					}
              					set(
              						current,
              						"pfid",
              						lv_pfid_8_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatAFieldAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalTM_TC_FORMAT.g:2069:3: ( (lv_name_12_0= RULE_ID ) )
            // InternalTM_TC_FORMAT.g:2070:4: (lv_name_12_0= RULE_ID )
            {
            // InternalTM_TC_FORMAT.g:2070:4: (lv_name_12_0= RULE_ID )
            // InternalTM_TC_FORMAT.g:2071:5: lv_name_12_0= RULE_ID
            {
            lv_name_12_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getGSSTmTcFormatAFieldAccess().getNameIDTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTmTcFormatAFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_12_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_13());
              		
            }
            // InternalTM_TC_FORMAT.g:2091:3: (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTM_TC_FORMAT.g:2092:4: otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSTmTcFormatAFieldAccess().getDescriptionKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalTM_TC_FORMAT.g:2100:4: ( (lv_description_16_0= RULE_ID ) )
                    // InternalTM_TC_FORMAT.g:2101:5: (lv_description_16_0= RULE_ID )
                    {
                    // InternalTM_TC_FORMAT.g:2101:5: (lv_description_16_0= RULE_ID )
                    // InternalTM_TC_FORMAT.g:2102:6: lv_description_16_0= RULE_ID
                    {
                    lv_description_16_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_16_0, grammarAccess.getGSSTmTcFormatAFieldAccess().getDescriptionIDTerminalRuleCall_14_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTmTcFormatAFieldRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"description",
                      							lv_description_16_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,21,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSTmTcFormatAFieldAccess().getTypeKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_16());
              		
            }
            // InternalTM_TC_FORMAT.g:2131:3: ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) )
            // InternalTM_TC_FORMAT.g:2132:4: (lv_type_20_0= ruleGSSTmTcFormatFieldType )
            {
            // InternalTM_TC_FORMAT.g:2132:4: (lv_type_20_0= ruleGSSTmTcFormatFieldType )
            // InternalTM_TC_FORMAT.g:2133:5: lv_type_20_0= ruleGSSTmTcFormatFieldType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAFieldAccess().getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_type_20_0=ruleGSSTmTcFormatFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAFieldRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_20_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_18());
              		
            }
            otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSTmTcFormatAFieldAccess().getByteOrderKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,17,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_20());
              		
            }
            // InternalTM_TC_FORMAT.g:2162:3: ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) )
            // InternalTM_TC_FORMAT.g:2163:4: (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder )
            {
            // InternalTM_TC_FORMAT.g:2163:4: (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder )
            // InternalTM_TC_FORMAT.g:2164:5: lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_byteOrder_24_0=ruleGSSTmTcFormatFieldByteOrder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAFieldRule());
              					}
              					set(
              						current,
              						"byteOrder",
              						lv_byteOrder_24_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldByteOrder");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_25=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_22());
              		
            }
            otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSTmTcFormatAFieldAccess().getFirstBitKeyword_23());
              		
            }
            otherlv_27=(Token)match(input,17,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_24());
              		
            }
            // InternalTM_TC_FORMAT.g:2193:3: ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) )
            // InternalTM_TC_FORMAT.g:2194:4: (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit )
            {
            // InternalTM_TC_FORMAT.g:2194:4: (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit )
            // InternalTM_TC_FORMAT.g:2195:5: lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_firstBit_28_0=ruleGSSTmTcFormatSFieldFirstBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAFieldRule());
              					}
              					set(
              						current,
              						"firstBit",
              						lv_firstBit_28_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSFieldFirstBit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_29=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_26());
              		
            }
            // InternalTM_TC_FORMAT.g:2216:3: ( (lv_size_30_0= ruleGSSTmTcFormatSize ) )
            // InternalTM_TC_FORMAT.g:2217:4: (lv_size_30_0= ruleGSSTmTcFormatSize )
            {
            // InternalTM_TC_FORMAT.g:2217:4: (lv_size_30_0= ruleGSSTmTcFormatSize )
            // InternalTM_TC_FORMAT.g:2218:5: lv_size_30_0= ruleGSSTmTcFormatSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAFieldAccess().getSizeGSSTmTcFormatSizeParserRuleCall_27_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_25);
            lv_size_30_0=ruleGSSTmTcFormatSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAFieldRule());
              					}
              					set(
              						current,
              						"size",
              						lv_size_30_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTM_TC_FORMAT.g:2235:3: ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) )
            // InternalTM_TC_FORMAT.g:2236:4: (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset )
            {
            // InternalTM_TC_FORMAT.g:2236:4: (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset )
            // InternalTM_TC_FORMAT.g:2237:5: lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAFieldAccess().getGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_36);
            lv_globalOffset_31_0=ruleGSSTmTcFormatGlobalOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAFieldRule());
              					}
              					set(
              						current,
              						"globalOffset",
              						lv_globalOffset_31_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatGlobalOffset");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTM_TC_FORMAT.g:2254:3: ( (lv_arrayDimension_32_0= ruleGSSTmTcFormatArrayDimension ) )
            // InternalTM_TC_FORMAT.g:2255:4: (lv_arrayDimension_32_0= ruleGSSTmTcFormatArrayDimension )
            {
            // InternalTM_TC_FORMAT.g:2255:4: (lv_arrayDimension_32_0= ruleGSSTmTcFormatArrayDimension )
            // InternalTM_TC_FORMAT.g:2256:5: lv_arrayDimension_32_0= ruleGSSTmTcFormatArrayDimension
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAFieldAccess().getArrayDimensionGSSTmTcFormatArrayDimensionParserRuleCall_29_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_arrayDimension_32_0=ruleGSSTmTcFormatArrayDimension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAFieldRule());
              					}
              					set(
              						current,
              						"arrayDimension",
              						lv_arrayDimension_32_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatArrayDimension");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_33=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_33, grammarAccess.getGSSTmTcFormatAFieldAccess().getRightCurlyBracketKeyword_30());
              		
            }
            otherlv_34=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_34, grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_31());
              		
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
    // $ANTLR end "ruleGSSTmTcFormatAField"


    // $ANTLR start "entryRuleGSSTmTcFormatAIField"
    // InternalTM_TC_FORMAT.g:2285:1: entryRuleGSSTmTcFormatAIField returns [EObject current=null] : iv_ruleGSSTmTcFormatAIField= ruleGSSTmTcFormatAIField EOF ;
    public final EObject entryRuleGSSTmTcFormatAIField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatAIField = null;


        try {
            // InternalTM_TC_FORMAT.g:2285:61: (iv_ruleGSSTmTcFormatAIField= ruleGSSTmTcFormatAIField EOF )
            // InternalTM_TC_FORMAT.g:2286:2: iv_ruleGSSTmTcFormatAIField= ruleGSSTmTcFormatAIField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTmTcFormatAIFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTmTcFormatAIField=ruleGSSTmTcFormatAIField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTmTcFormatAIField; 
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
    // $ANTLR end "entryRuleGSSTmTcFormatAIField"


    // $ANTLR start "ruleGSSTmTcFormatAIField"
    // InternalTM_TC_FORMAT.g:2292:1: ruleGSSTmTcFormatAIField returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatAIField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_localOffset_31_0= ruleGSSTmTcFormatLocalOffset ) ) ( (lv_arrayRef_32_0= ruleGSSTmTcFormatArrayRef ) ) otherlv_33= '}' otherlv_34= ';' ) ;
    public final EObject ruleGSSTmTcFormatAIField() throws RecognitionException {
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
        Token lv_name_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_description_16_0=null;
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
        Token otherlv_33=null;
        Token otherlv_34=null;
        AntlrDatatypeRuleToken lv_fid_4_0 = null;

        AntlrDatatypeRuleToken lv_pfid_8_0 = null;

        Enumerator lv_type_20_0 = null;

        Enumerator lv_byteOrder_24_0 = null;

        Enumerator lv_firstBit_28_0 = null;

        EObject lv_size_30_0 = null;

        EObject lv_localOffset_31_0 = null;

        EObject lv_arrayRef_32_0 = null;



        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:2298:2: ( (otherlv_0= 'GSSTmTcFormatAIField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_localOffset_31_0= ruleGSSTmTcFormatLocalOffset ) ) ( (lv_arrayRef_32_0= ruleGSSTmTcFormatArrayRef ) ) otherlv_33= '}' otherlv_34= ';' ) )
            // InternalTM_TC_FORMAT.g:2299:2: (otherlv_0= 'GSSTmTcFormatAIField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_localOffset_31_0= ruleGSSTmTcFormatLocalOffset ) ) ( (lv_arrayRef_32_0= ruleGSSTmTcFormatArrayRef ) ) otherlv_33= '}' otherlv_34= ';' )
            {
            // InternalTM_TC_FORMAT.g:2299:2: (otherlv_0= 'GSSTmTcFormatAIField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_localOffset_31_0= ruleGSSTmTcFormatLocalOffset ) ) ( (lv_arrayRef_32_0= ruleGSSTmTcFormatArrayRef ) ) otherlv_33= '}' otherlv_34= ';' )
            // InternalTM_TC_FORMAT.g:2300:3: otherlv_0= 'GSSTmTcFormatAIField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_localOffset_31_0= ruleGSSTmTcFormatLocalOffset ) ) ( (lv_arrayRef_32_0= ruleGSSTmTcFormatArrayRef ) ) otherlv_33= '}' otherlv_34= ';'
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatAIFieldAccess().getGSSTmTcFormatAIFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatAIFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatAIFieldAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:2316:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:2317:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:2317:4: (lv_fid_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:2318:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAIFieldAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_fid_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAIFieldRule());
              					}
              					set(
              						current,
              						"fid",
              						lv_fid_4_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatAIFieldAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:2347:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:2348:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:2348:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:2349:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAIFieldAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_pfid_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAIFieldRule());
              					}
              					set(
              						current,
              						"pfid",
              						lv_pfid_8_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatAIFieldAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalTM_TC_FORMAT.g:2378:3: ( (lv_name_12_0= RULE_ID ) )
            // InternalTM_TC_FORMAT.g:2379:4: (lv_name_12_0= RULE_ID )
            {
            // InternalTM_TC_FORMAT.g:2379:4: (lv_name_12_0= RULE_ID )
            // InternalTM_TC_FORMAT.g:2380:5: lv_name_12_0= RULE_ID
            {
            lv_name_12_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getGSSTmTcFormatAIFieldAccess().getNameIDTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTmTcFormatAIFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_12_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_13());
              		
            }
            // InternalTM_TC_FORMAT.g:2400:3: (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTM_TC_FORMAT.g:2401:4: otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_ID ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSTmTcFormatAIFieldAccess().getDescriptionKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalTM_TC_FORMAT.g:2409:4: ( (lv_description_16_0= RULE_ID ) )
                    // InternalTM_TC_FORMAT.g:2410:5: (lv_description_16_0= RULE_ID )
                    {
                    // InternalTM_TC_FORMAT.g:2410:5: (lv_description_16_0= RULE_ID )
                    // InternalTM_TC_FORMAT.g:2411:6: lv_description_16_0= RULE_ID
                    {
                    lv_description_16_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_16_0, grammarAccess.getGSSTmTcFormatAIFieldAccess().getDescriptionIDTerminalRuleCall_14_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTmTcFormatAIFieldRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"description",
                      							lv_description_16_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,21,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSTmTcFormatAIFieldAccess().getTypeKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_16());
              		
            }
            // InternalTM_TC_FORMAT.g:2440:3: ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) )
            // InternalTM_TC_FORMAT.g:2441:4: (lv_type_20_0= ruleGSSTmTcFormatFieldType )
            {
            // InternalTM_TC_FORMAT.g:2441:4: (lv_type_20_0= ruleGSSTmTcFormatFieldType )
            // InternalTM_TC_FORMAT.g:2442:5: lv_type_20_0= ruleGSSTmTcFormatFieldType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAIFieldAccess().getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_type_20_0=ruleGSSTmTcFormatFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAIFieldRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_20_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_18());
              		
            }
            otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSTmTcFormatAIFieldAccess().getByteOrderKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,17,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_20());
              		
            }
            // InternalTM_TC_FORMAT.g:2471:3: ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) )
            // InternalTM_TC_FORMAT.g:2472:4: (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder )
            {
            // InternalTM_TC_FORMAT.g:2472:4: (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder )
            // InternalTM_TC_FORMAT.g:2473:5: lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAIFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_byteOrder_24_0=ruleGSSTmTcFormatFieldByteOrder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAIFieldRule());
              					}
              					set(
              						current,
              						"byteOrder",
              						lv_byteOrder_24_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldByteOrder");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_25=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_22());
              		
            }
            otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSTmTcFormatAIFieldAccess().getFirstBitKeyword_23());
              		
            }
            otherlv_27=(Token)match(input,17,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_24());
              		
            }
            // InternalTM_TC_FORMAT.g:2502:3: ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) )
            // InternalTM_TC_FORMAT.g:2503:4: (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit )
            {
            // InternalTM_TC_FORMAT.g:2503:4: (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit )
            // InternalTM_TC_FORMAT.g:2504:5: lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAIFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_firstBit_28_0=ruleGSSTmTcFormatSFieldFirstBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAIFieldRule());
              					}
              					set(
              						current,
              						"firstBit",
              						lv_firstBit_28_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSFieldFirstBit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_29=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_26());
              		
            }
            // InternalTM_TC_FORMAT.g:2525:3: ( (lv_size_30_0= ruleGSSTmTcFormatSize ) )
            // InternalTM_TC_FORMAT.g:2526:4: (lv_size_30_0= ruleGSSTmTcFormatSize )
            {
            // InternalTM_TC_FORMAT.g:2526:4: (lv_size_30_0= ruleGSSTmTcFormatSize )
            // InternalTM_TC_FORMAT.g:2527:5: lv_size_30_0= ruleGSSTmTcFormatSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAIFieldAccess().getSizeGSSTmTcFormatSizeParserRuleCall_27_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_37);
            lv_size_30_0=ruleGSSTmTcFormatSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAIFieldRule());
              					}
              					set(
              						current,
              						"size",
              						lv_size_30_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTM_TC_FORMAT.g:2544:3: ( (lv_localOffset_31_0= ruleGSSTmTcFormatLocalOffset ) )
            // InternalTM_TC_FORMAT.g:2545:4: (lv_localOffset_31_0= ruleGSSTmTcFormatLocalOffset )
            {
            // InternalTM_TC_FORMAT.g:2545:4: (lv_localOffset_31_0= ruleGSSTmTcFormatLocalOffset )
            // InternalTM_TC_FORMAT.g:2546:5: lv_localOffset_31_0= ruleGSSTmTcFormatLocalOffset
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAIFieldAccess().getLocalOffsetGSSTmTcFormatLocalOffsetParserRuleCall_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_38);
            lv_localOffset_31_0=ruleGSSTmTcFormatLocalOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAIFieldRule());
              					}
              					set(
              						current,
              						"localOffset",
              						lv_localOffset_31_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatLocalOffset");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTM_TC_FORMAT.g:2563:3: ( (lv_arrayRef_32_0= ruleGSSTmTcFormatArrayRef ) )
            // InternalTM_TC_FORMAT.g:2564:4: (lv_arrayRef_32_0= ruleGSSTmTcFormatArrayRef )
            {
            // InternalTM_TC_FORMAT.g:2564:4: (lv_arrayRef_32_0= ruleGSSTmTcFormatArrayRef )
            // InternalTM_TC_FORMAT.g:2565:5: lv_arrayRef_32_0= ruleGSSTmTcFormatArrayRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAIFieldAccess().getArrayRefGSSTmTcFormatArrayRefParserRuleCall_29_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_arrayRef_32_0=ruleGSSTmTcFormatArrayRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatAIFieldRule());
              					}
              					set(
              						current,
              						"arrayRef",
              						lv_arrayRef_32_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatArrayRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_33=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_33, grammarAccess.getGSSTmTcFormatAIFieldAccess().getRightCurlyBracketKeyword_30());
              		
            }
            otherlv_34=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_34, grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_31());
              		
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
    // $ANTLR end "ruleGSSTmTcFormatAIField"


    // $ANTLR start "entryRuleGSSTmTcFormatSize"
    // InternalTM_TC_FORMAT.g:2594:1: entryRuleGSSTmTcFormatSize returns [EObject current=null] : iv_ruleGSSTmTcFormatSize= ruleGSSTmTcFormatSize EOF ;
    public final EObject entryRuleGSSTmTcFormatSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatSize = null;


        try {
            // InternalTM_TC_FORMAT.g:2594:58: (iv_ruleGSSTmTcFormatSize= ruleGSSTmTcFormatSize EOF )
            // InternalTM_TC_FORMAT.g:2595:2: iv_ruleGSSTmTcFormatSize= ruleGSSTmTcFormatSize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTmTcFormatSizeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTmTcFormatSize=ruleGSSTmTcFormatSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTmTcFormatSize; 
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
    // $ANTLR end "entryRuleGSSTmTcFormatSize"


    // $ANTLR start "ruleGSSTmTcFormatSize"
    // InternalTM_TC_FORMAT.g:2601:1: ruleGSSTmTcFormatSize returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSTmTcFormatSize() throws RecognitionException {
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
            // InternalTM_TC_FORMAT.g:2607:2: ( (otherlv_0= 'GSSTmTcFormatSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalTM_TC_FORMAT.g:2608:2: (otherlv_0= 'GSSTmTcFormatSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalTM_TC_FORMAT.g:2608:2: (otherlv_0= 'GSSTmTcFormatSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalTM_TC_FORMAT.g:2609:3: otherlv_0= 'GSSTmTcFormatSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatSizeAccess().getGSSTmTcFormatSizeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatSizeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatSizeAccess().getBytesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatSizeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:2625:3: ( (lv_bytes_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:2626:4: (lv_bytes_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:2626:4: (lv_bytes_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:2627:5: lv_bytes_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatSizeAccess().getBytesINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_bytes_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatSizeRule());
              					}
              					set(
              						current,
              						"bytes",
              						lv_bytes_4_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatSizeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatSizeAccess().getBitsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatSizeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:2656:3: ( (lv_bits_8_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:2657:4: (lv_bits_8_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:2657:4: (lv_bits_8_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:2658:5: lv_bits_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatSizeAccess().getBitsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_bits_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatSizeRule());
              					}
              					set(
              						current,
              						"bits",
              						lv_bits_8_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatSizeAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatSizeAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatSizeAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleGSSTmTcFormatSize"


    // $ANTLR start "entryRuleGSSTmTcFormatGlobalOffset"
    // InternalTM_TC_FORMAT.g:2691:1: entryRuleGSSTmTcFormatGlobalOffset returns [EObject current=null] : iv_ruleGSSTmTcFormatGlobalOffset= ruleGSSTmTcFormatGlobalOffset EOF ;
    public final EObject entryRuleGSSTmTcFormatGlobalOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatGlobalOffset = null;


        try {
            // InternalTM_TC_FORMAT.g:2691:66: (iv_ruleGSSTmTcFormatGlobalOffset= ruleGSSTmTcFormatGlobalOffset EOF )
            // InternalTM_TC_FORMAT.g:2692:2: iv_ruleGSSTmTcFormatGlobalOffset= ruleGSSTmTcFormatGlobalOffset EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTmTcFormatGlobalOffsetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTmTcFormatGlobalOffset=ruleGSSTmTcFormatGlobalOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTmTcFormatGlobalOffset; 
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
    // $ANTLR end "entryRuleGSSTmTcFormatGlobalOffset"


    // $ANTLR start "ruleGSSTmTcFormatGlobalOffset"
    // InternalTM_TC_FORMAT.g:2698:1: ruleGSSTmTcFormatGlobalOffset returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatGlobalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSTmTcFormatGlobalOffset() throws RecognitionException {
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
            // InternalTM_TC_FORMAT.g:2704:2: ( (otherlv_0= 'GSSTmTcFormatGlobalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalTM_TC_FORMAT.g:2705:2: (otherlv_0= 'GSSTmTcFormatGlobalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalTM_TC_FORMAT.g:2705:2: (otherlv_0= 'GSSTmTcFormatGlobalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalTM_TC_FORMAT.g:2706:3: otherlv_0= 'GSSTmTcFormatGlobalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getGSSTmTcFormatGlobalOffsetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBytesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:2722:3: ( (lv_bytes_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:2723:4: (lv_bytes_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:2723:4: (lv_bytes_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:2724:5: lv_bytes_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBytesINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_bytes_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatGlobalOffsetRule());
              					}
              					set(
              						current,
              						"bytes",
              						lv_bytes_4_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBitsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:2753:3: ( (lv_bits_8_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:2754:4: (lv_bits_8_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:2754:4: (lv_bits_8_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:2755:5: lv_bits_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBitsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_bits_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatGlobalOffsetRule());
              					}
              					set(
              						current,
              						"bits",
              						lv_bits_8_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleGSSTmTcFormatGlobalOffset"


    // $ANTLR start "entryRuleGSSTmTcFormatFormula"
    // InternalTM_TC_FORMAT.g:2788:1: entryRuleGSSTmTcFormatFormula returns [EObject current=null] : iv_ruleGSSTmTcFormatFormula= ruleGSSTmTcFormatFormula EOF ;
    public final EObject entryRuleGSSTmTcFormatFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatFormula = null;


        try {
            // InternalTM_TC_FORMAT.g:2788:61: (iv_ruleGSSTmTcFormatFormula= ruleGSSTmTcFormatFormula EOF )
            // InternalTM_TC_FORMAT.g:2789:2: iv_ruleGSSTmTcFormatFormula= ruleGSSTmTcFormatFormula EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTmTcFormatFormulaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTmTcFormatFormula=ruleGSSTmTcFormatFormula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTmTcFormatFormula; 
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
    // $ANTLR end "entryRuleGSSTmTcFormatFormula"


    // $ANTLR start "ruleGSSTmTcFormatFormula"
    // InternalTM_TC_FORMAT.g:2795:1: ruleGSSTmTcFormatFormula returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatFormula' otherlv_1= '{' otherlv_2= 'slope' otherlv_3= ':=' ( (lv_slope_4_0= ruleREAL ) ) otherlv_5= ';' otherlv_6= 'intercept' otherlv_7= ':=' ( (lv_intercept_8_0= ruleREAL ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSTmTcFormatFormula() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_slope_4_0 = null;

        AntlrDatatypeRuleToken lv_intercept_8_0 = null;



        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:2801:2: ( (otherlv_0= 'GSSTmTcFormatFormula' otherlv_1= '{' otherlv_2= 'slope' otherlv_3= ':=' ( (lv_slope_4_0= ruleREAL ) ) otherlv_5= ';' otherlv_6= 'intercept' otherlv_7= ':=' ( (lv_intercept_8_0= ruleREAL ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalTM_TC_FORMAT.g:2802:2: (otherlv_0= 'GSSTmTcFormatFormula' otherlv_1= '{' otherlv_2= 'slope' otherlv_3= ':=' ( (lv_slope_4_0= ruleREAL ) ) otherlv_5= ';' otherlv_6= 'intercept' otherlv_7= ':=' ( (lv_intercept_8_0= ruleREAL ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalTM_TC_FORMAT.g:2802:2: (otherlv_0= 'GSSTmTcFormatFormula' otherlv_1= '{' otherlv_2= 'slope' otherlv_3= ':=' ( (lv_slope_4_0= ruleREAL ) ) otherlv_5= ';' otherlv_6= 'intercept' otherlv_7= ':=' ( (lv_intercept_8_0= ruleREAL ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalTM_TC_FORMAT.g:2803:3: otherlv_0= 'GSSTmTcFormatFormula' otherlv_1= '{' otherlv_2= 'slope' otherlv_3= ':=' ( (lv_slope_4_0= ruleREAL ) ) otherlv_5= ';' otherlv_6= 'intercept' otherlv_7= ':=' ( (lv_intercept_8_0= ruleREAL ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatFormulaAccess().getGSSTmTcFormatFormulaKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatFormulaAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,41,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatFormulaAccess().getSlopeKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatFormulaAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:2819:3: ( (lv_slope_4_0= ruleREAL ) )
            // InternalTM_TC_FORMAT.g:2820:4: (lv_slope_4_0= ruleREAL )
            {
            // InternalTM_TC_FORMAT.g:2820:4: (lv_slope_4_0= ruleREAL )
            // InternalTM_TC_FORMAT.g:2821:5: lv_slope_4_0= ruleREAL
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatFormulaAccess().getSlopeREALParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_slope_4_0=ruleREAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatFormulaRule());
              					}
              					set(
              						current,
              						"slope",
              						lv_slope_4_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.REAL");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatFormulaAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,42,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatFormulaAccess().getInterceptKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatFormulaAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:2850:3: ( (lv_intercept_8_0= ruleREAL ) )
            // InternalTM_TC_FORMAT.g:2851:4: (lv_intercept_8_0= ruleREAL )
            {
            // InternalTM_TC_FORMAT.g:2851:4: (lv_intercept_8_0= ruleREAL )
            // InternalTM_TC_FORMAT.g:2852:5: lv_intercept_8_0= ruleREAL
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatFormulaAccess().getInterceptREALParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_intercept_8_0=ruleREAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatFormulaRule());
              					}
              					set(
              						current,
              						"intercept",
              						lv_intercept_8_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.REAL");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatFormulaAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatFormulaAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatFormulaAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleGSSTmTcFormatFormula"


    // $ANTLR start "entryRuleGSSTmTcFormatConstSize"
    // InternalTM_TC_FORMAT.g:2885:1: entryRuleGSSTmTcFormatConstSize returns [EObject current=null] : iv_ruleGSSTmTcFormatConstSize= ruleGSSTmTcFormatConstSize EOF ;
    public final EObject entryRuleGSSTmTcFormatConstSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatConstSize = null;


        try {
            // InternalTM_TC_FORMAT.g:2885:63: (iv_ruleGSSTmTcFormatConstSize= ruleGSSTmTcFormatConstSize EOF )
            // InternalTM_TC_FORMAT.g:2886:2: iv_ruleGSSTmTcFormatConstSize= ruleGSSTmTcFormatConstSize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTmTcFormatConstSizeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTmTcFormatConstSize=ruleGSSTmTcFormatConstSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTmTcFormatConstSize; 
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
    // $ANTLR end "entryRuleGSSTmTcFormatConstSize"


    // $ANTLR start "ruleGSSTmTcFormatConstSize"
    // InternalTM_TC_FORMAT.g:2892:1: ruleGSSTmTcFormatConstSize returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatConstSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSTmTcFormatConstSize() throws RecognitionException {
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
            // InternalTM_TC_FORMAT.g:2898:2: ( (otherlv_0= 'GSSTmTcFormatConstSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalTM_TC_FORMAT.g:2899:2: (otherlv_0= 'GSSTmTcFormatConstSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalTM_TC_FORMAT.g:2899:2: (otherlv_0= 'GSSTmTcFormatConstSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalTM_TC_FORMAT.g:2900:3: otherlv_0= 'GSSTmTcFormatConstSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatConstSizeAccess().getGSSTmTcFormatConstSizeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatConstSizeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatConstSizeAccess().getBytesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatConstSizeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:2916:3: ( (lv_bytes_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:2917:4: (lv_bytes_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:2917:4: (lv_bytes_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:2918:5: lv_bytes_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatConstSizeAccess().getBytesINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_bytes_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatConstSizeRule());
              					}
              					set(
              						current,
              						"bytes",
              						lv_bytes_4_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatConstSizeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatConstSizeAccess().getBitsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatConstSizeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:2947:3: ( (lv_bits_8_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:2948:4: (lv_bits_8_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:2948:4: (lv_bits_8_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:2949:5: lv_bits_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatConstSizeAccess().getBitsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_bits_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatConstSizeRule());
              					}
              					set(
              						current,
              						"bits",
              						lv_bits_8_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatConstSizeAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatConstSizeAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatConstSizeAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleGSSTmTcFormatConstSize"


    // $ANTLR start "entryRuleGSSTmTcFormatMaxSize"
    // InternalTM_TC_FORMAT.g:2982:1: entryRuleGSSTmTcFormatMaxSize returns [EObject current=null] : iv_ruleGSSTmTcFormatMaxSize= ruleGSSTmTcFormatMaxSize EOF ;
    public final EObject entryRuleGSSTmTcFormatMaxSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatMaxSize = null;


        try {
            // InternalTM_TC_FORMAT.g:2982:61: (iv_ruleGSSTmTcFormatMaxSize= ruleGSSTmTcFormatMaxSize EOF )
            // InternalTM_TC_FORMAT.g:2983:2: iv_ruleGSSTmTcFormatMaxSize= ruleGSSTmTcFormatMaxSize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTmTcFormatMaxSizeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTmTcFormatMaxSize=ruleGSSTmTcFormatMaxSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTmTcFormatMaxSize; 
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
    // $ANTLR end "entryRuleGSSTmTcFormatMaxSize"


    // $ANTLR start "ruleGSSTmTcFormatMaxSize"
    // InternalTM_TC_FORMAT.g:2989:1: ruleGSSTmTcFormatMaxSize returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatMaxSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSTmTcFormatMaxSize() throws RecognitionException {
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
            // InternalTM_TC_FORMAT.g:2995:2: ( (otherlv_0= 'GSSTmTcFormatMaxSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalTM_TC_FORMAT.g:2996:2: (otherlv_0= 'GSSTmTcFormatMaxSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalTM_TC_FORMAT.g:2996:2: (otherlv_0= 'GSSTmTcFormatMaxSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalTM_TC_FORMAT.g:2997:3: otherlv_0= 'GSSTmTcFormatMaxSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getGSSTmTcFormatMaxSizeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBytesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:3013:3: ( (lv_bytes_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:3014:4: (lv_bytes_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:3014:4: (lv_bytes_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:3015:5: lv_bytes_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBytesINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_bytes_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatMaxSizeRule());
              					}
              					set(
              						current,
              						"bytes",
              						lv_bytes_4_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBitsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:3044:3: ( (lv_bits_8_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:3045:4: (lv_bits_8_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:3045:4: (lv_bits_8_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:3046:5: lv_bits_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBitsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_bits_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatMaxSizeRule());
              					}
              					set(
              						current,
              						"bits",
              						lv_bits_8_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleGSSTmTcFormatMaxSize"


    // $ANTLR start "entryRuleGSSTmTcFormatVariableSize"
    // InternalTM_TC_FORMAT.g:3079:1: entryRuleGSSTmTcFormatVariableSize returns [EObject current=null] : iv_ruleGSSTmTcFormatVariableSize= ruleGSSTmTcFormatVariableSize EOF ;
    public final EObject entryRuleGSSTmTcFormatVariableSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatVariableSize = null;


        try {
            // InternalTM_TC_FORMAT.g:3079:66: (iv_ruleGSSTmTcFormatVariableSize= ruleGSSTmTcFormatVariableSize EOF )
            // InternalTM_TC_FORMAT.g:3080:2: iv_ruleGSSTmTcFormatVariableSize= ruleGSSTmTcFormatVariableSize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTmTcFormatVariableSizeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTmTcFormatVariableSize=ruleGSSTmTcFormatVariableSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTmTcFormatVariableSize; 
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
    // $ANTLR end "entryRuleGSSTmTcFormatVariableSize"


    // $ANTLR start "ruleGSSTmTcFormatVariableSize"
    // InternalTM_TC_FORMAT.g:3086:1: ruleGSSTmTcFormatVariableSize returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatVariableSize' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'unit' otherlv_7= ':=' ( (lv_unit_8_0= ruleGSSTmTcFormatUnit ) ) otherlv_9= ';' (otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleGSSTmTcFormatPower ) ) otherlv_13= ';' )? otherlv_14= '}' otherlv_15= ';' ) ;
    public final EObject ruleGSSTmTcFormatVariableSize() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_fidRef_4_0 = null;

        Enumerator lv_unit_8_0 = null;

        Enumerator lv_power_12_0 = null;



        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:3092:2: ( (otherlv_0= 'GSSTmTcFormatVariableSize' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'unit' otherlv_7= ':=' ( (lv_unit_8_0= ruleGSSTmTcFormatUnit ) ) otherlv_9= ';' (otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleGSSTmTcFormatPower ) ) otherlv_13= ';' )? otherlv_14= '}' otherlv_15= ';' ) )
            // InternalTM_TC_FORMAT.g:3093:2: (otherlv_0= 'GSSTmTcFormatVariableSize' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'unit' otherlv_7= ':=' ( (lv_unit_8_0= ruleGSSTmTcFormatUnit ) ) otherlv_9= ';' (otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleGSSTmTcFormatPower ) ) otherlv_13= ';' )? otherlv_14= '}' otherlv_15= ';' )
            {
            // InternalTM_TC_FORMAT.g:3093:2: (otherlv_0= 'GSSTmTcFormatVariableSize' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'unit' otherlv_7= ':=' ( (lv_unit_8_0= ruleGSSTmTcFormatUnit ) ) otherlv_9= ';' (otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleGSSTmTcFormatPower ) ) otherlv_13= ';' )? otherlv_14= '}' otherlv_15= ';' )
            // InternalTM_TC_FORMAT.g:3094:3: otherlv_0= 'GSSTmTcFormatVariableSize' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'unit' otherlv_7= ':=' ( (lv_unit_8_0= ruleGSSTmTcFormatUnit ) ) otherlv_9= ';' (otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleGSSTmTcFormatPower ) ) otherlv_13= ';' )? otherlv_14= '}' otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getGSSTmTcFormatVariableSizeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getFidRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:3110:3: ( (lv_fidRef_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:3111:4: (lv_fidRef_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:3111:4: (lv_fidRef_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:3112:5: lv_fidRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getFidRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_fidRef_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVariableSizeRule());
              					}
              					set(
              						current,
              						"fidRef",
              						lv_fidRef_4_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getUnitKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:3141:3: ( (lv_unit_8_0= ruleGSSTmTcFormatUnit ) )
            // InternalTM_TC_FORMAT.g:3142:4: (lv_unit_8_0= ruleGSSTmTcFormatUnit )
            {
            // InternalTM_TC_FORMAT.g:3142:4: (lv_unit_8_0= ruleGSSTmTcFormatUnit )
            // InternalTM_TC_FORMAT.g:3143:5: lv_unit_8_0= ruleGSSTmTcFormatUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getUnitGSSTmTcFormatUnitEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_unit_8_0=ruleGSSTmTcFormatUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVariableSizeRule());
              					}
              					set(
              						current,
              						"unit",
              						lv_unit_8_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getSemicolonKeyword_9());
              		
            }
            // InternalTM_TC_FORMAT.g:3164:3: (otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleGSSTmTcFormatPower ) ) otherlv_13= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==48) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTM_TC_FORMAT.g:3165:4: otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleGSSTmTcFormatPower ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,48,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getPowerKeyword_10_0());
                      			
                    }
                    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getColonEqualsSignKeyword_10_1());
                      			
                    }
                    // InternalTM_TC_FORMAT.g:3173:4: ( (lv_power_12_0= ruleGSSTmTcFormatPower ) )
                    // InternalTM_TC_FORMAT.g:3174:5: (lv_power_12_0= ruleGSSTmTcFormatPower )
                    {
                    // InternalTM_TC_FORMAT.g:3174:5: (lv_power_12_0= ruleGSSTmTcFormatPower )
                    // InternalTM_TC_FORMAT.g:3175:6: lv_power_12_0= ruleGSSTmTcFormatPower
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getPowerGSSTmTcFormatPowerEnumRuleCall_10_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_5);
                    lv_power_12_0=ruleGSSTmTcFormatPower();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVariableSizeRule());
                      						}
                      						set(
                      							current,
                      							"power",
                      							lv_power_12_0,
                      							"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatPower");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getSemicolonKeyword_10_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getRightCurlyBracketKeyword_11());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getSemicolonKeyword_12());
              		
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
    // $ANTLR end "ruleGSSTmTcFormatVariableSize"


    // $ANTLR start "entryRuleGSSTmTcFormatFloatingOffset"
    // InternalTM_TC_FORMAT.g:3209:1: entryRuleGSSTmTcFormatFloatingOffset returns [EObject current=null] : iv_ruleGSSTmTcFormatFloatingOffset= ruleGSSTmTcFormatFloatingOffset EOF ;
    public final EObject entryRuleGSSTmTcFormatFloatingOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatFloatingOffset = null;


        try {
            // InternalTM_TC_FORMAT.g:3209:68: (iv_ruleGSSTmTcFormatFloatingOffset= ruleGSSTmTcFormatFloatingOffset EOF )
            // InternalTM_TC_FORMAT.g:3210:2: iv_ruleGSSTmTcFormatFloatingOffset= ruleGSSTmTcFormatFloatingOffset EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTmTcFormatFloatingOffsetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTmTcFormatFloatingOffset=ruleGSSTmTcFormatFloatingOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTmTcFormatFloatingOffset; 
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
    // $ANTLR end "entryRuleGSSTmTcFormatFloatingOffset"


    // $ANTLR start "ruleGSSTmTcFormatFloatingOffset"
    // InternalTM_TC_FORMAT.g:3216:1: ruleGSSTmTcFormatFloatingOffset returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatFloatingOffset' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSTmTcFormatFloatingOffset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_fidRef_4_0 = null;



        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:3222:2: ( (otherlv_0= 'GSSTmTcFormatFloatingOffset' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalTM_TC_FORMAT.g:3223:2: (otherlv_0= 'GSSTmTcFormatFloatingOffset' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalTM_TC_FORMAT.g:3223:2: (otherlv_0= 'GSSTmTcFormatFloatingOffset' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalTM_TC_FORMAT.g:3224:3: otherlv_0= 'GSSTmTcFormatFloatingOffset' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getGSSTmTcFormatFloatingOffsetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getFidRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:3240:3: ( (lv_fidRef_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:3241:4: (lv_fidRef_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:3241:4: (lv_fidRef_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:3242:5: lv_fidRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getFidRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_fidRef_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatFloatingOffsetRule());
              					}
              					set(
              						current,
              						"fidRef",
              						lv_fidRef_4_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSTmTcFormatFloatingOffset"


    // $ANTLR start "entryRuleGSSTmTcFormatSortedFieldsToCheck"
    // InternalTM_TC_FORMAT.g:3275:1: entryRuleGSSTmTcFormatSortedFieldsToCheck returns [EObject current=null] : iv_ruleGSSTmTcFormatSortedFieldsToCheck= ruleGSSTmTcFormatSortedFieldsToCheck EOF ;
    public final EObject entryRuleGSSTmTcFormatSortedFieldsToCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatSortedFieldsToCheck = null;


        try {
            // InternalTM_TC_FORMAT.g:3275:73: (iv_ruleGSSTmTcFormatSortedFieldsToCheck= ruleGSSTmTcFormatSortedFieldsToCheck EOF )
            // InternalTM_TC_FORMAT.g:3276:2: iv_ruleGSSTmTcFormatSortedFieldsToCheck= ruleGSSTmTcFormatSortedFieldsToCheck EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTmTcFormatSortedFieldsToCheck=ruleGSSTmTcFormatSortedFieldsToCheck();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTmTcFormatSortedFieldsToCheck; 
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
    // $ANTLR end "entryRuleGSSTmTcFormatSortedFieldsToCheck"


    // $ANTLR start "ruleGSSTmTcFormatSortedFieldsToCheck"
    // InternalTM_TC_FORMAT.g:3282:1: ruleGSSTmTcFormatSortedFieldsToCheck returns [EObject current=null] : ( () otherlv_1= 'GSSTmTcFormatSortedFieldsToCheck' otherlv_2= '{' ( (lv_fieldToCheck_3_0= ruleGSSTmTcFormatFieldToCheck ) )* otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleGSSTmTcFormatSortedFieldsToCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_fieldToCheck_3_0 = null;



        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:3288:2: ( ( () otherlv_1= 'GSSTmTcFormatSortedFieldsToCheck' otherlv_2= '{' ( (lv_fieldToCheck_3_0= ruleGSSTmTcFormatFieldToCheck ) )* otherlv_4= '}' otherlv_5= ';' ) )
            // InternalTM_TC_FORMAT.g:3289:2: ( () otherlv_1= 'GSSTmTcFormatSortedFieldsToCheck' otherlv_2= '{' ( (lv_fieldToCheck_3_0= ruleGSSTmTcFormatFieldToCheck ) )* otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalTM_TC_FORMAT.g:3289:2: ( () otherlv_1= 'GSSTmTcFormatSortedFieldsToCheck' otherlv_2= '{' ( (lv_fieldToCheck_3_0= ruleGSSTmTcFormatFieldToCheck ) )* otherlv_4= '}' otherlv_5= ';' )
            // InternalTM_TC_FORMAT.g:3290:3: () otherlv_1= 'GSSTmTcFormatSortedFieldsToCheck' otherlv_2= '{' ( (lv_fieldToCheck_3_0= ruleGSSTmTcFormatFieldToCheck ) )* otherlv_4= '}' otherlv_5= ';'
            {
            // InternalTM_TC_FORMAT.g:3290:3: ()
            // InternalTM_TC_FORMAT.g:3291:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getGSSTmTcFormatSortedFieldsToCheckAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getGSSTmTcFormatSortedFieldsToCheckKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalTM_TC_FORMAT.g:3308:3: ( (lv_fieldToCheck_3_0= ruleGSSTmTcFormatFieldToCheck ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==51) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTM_TC_FORMAT.g:3309:4: (lv_fieldToCheck_3_0= ruleGSSTmTcFormatFieldToCheck )
            	    {
            	    // InternalTM_TC_FORMAT.g:3309:4: (lv_fieldToCheck_3_0= ruleGSSTmTcFormatFieldToCheck )
            	    // InternalTM_TC_FORMAT.g:3310:5: lv_fieldToCheck_3_0= ruleGSSTmTcFormatFieldToCheck
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getFieldToCheckGSSTmTcFormatFieldToCheckParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_49);
            	    lv_fieldToCheck_3_0=ruleGSSTmTcFormatFieldToCheck();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckRule());
            	      					}
            	      					add(
            	      						current,
            	      						"fieldToCheck",
            	      						lv_fieldToCheck_3_0,
            	      						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFieldToCheck");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getSemicolonKeyword_5());
              		
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
    // $ANTLR end "ruleGSSTmTcFormatSortedFieldsToCheck"


    // $ANTLR start "entryRuleGSSTmTcFormatFieldToCheck"
    // InternalTM_TC_FORMAT.g:3339:1: entryRuleGSSTmTcFormatFieldToCheck returns [EObject current=null] : iv_ruleGSSTmTcFormatFieldToCheck= ruleGSSTmTcFormatFieldToCheck EOF ;
    public final EObject entryRuleGSSTmTcFormatFieldToCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatFieldToCheck = null;


        try {
            // InternalTM_TC_FORMAT.g:3339:66: (iv_ruleGSSTmTcFormatFieldToCheck= ruleGSSTmTcFormatFieldToCheck EOF )
            // InternalTM_TC_FORMAT.g:3340:2: iv_ruleGSSTmTcFormatFieldToCheck= ruleGSSTmTcFormatFieldToCheck EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTmTcFormatFieldToCheckRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTmTcFormatFieldToCheck=ruleGSSTmTcFormatFieldToCheck();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTmTcFormatFieldToCheck; 
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
    // $ANTLR end "entryRuleGSSTmTcFormatFieldToCheck"


    // $ANTLR start "ruleGSSTmTcFormatFieldToCheck"
    // InternalTM_TC_FORMAT.g:3346:1: ruleGSSTmTcFormatFieldToCheck returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatFieldToCheck' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSTmTcFormatFieldToCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_fidRef_4_0 = null;



        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:3352:2: ( (otherlv_0= 'GSSTmTcFormatFieldToCheck' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalTM_TC_FORMAT.g:3353:2: (otherlv_0= 'GSSTmTcFormatFieldToCheck' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalTM_TC_FORMAT.g:3353:2: (otherlv_0= 'GSSTmTcFormatFieldToCheck' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalTM_TC_FORMAT.g:3354:3: otherlv_0= 'GSSTmTcFormatFieldToCheck' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getGSSTmTcFormatFieldToCheckKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getFidRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:3370:3: ( (lv_fidRef_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:3371:4: (lv_fidRef_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:3371:4: (lv_fidRef_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:3372:5: lv_fidRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getFidRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_fidRef_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatFieldToCheckRule());
              					}
              					set(
              						current,
              						"fidRef",
              						lv_fidRef_4_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSTmTcFormatFieldToCheck"


    // $ANTLR start "entryRuleGSSTmTcFormatArrayDimension"
    // InternalTM_TC_FORMAT.g:3405:1: entryRuleGSSTmTcFormatArrayDimension returns [EObject current=null] : iv_ruleGSSTmTcFormatArrayDimension= ruleGSSTmTcFormatArrayDimension EOF ;
    public final EObject entryRuleGSSTmTcFormatArrayDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatArrayDimension = null;


        try {
            // InternalTM_TC_FORMAT.g:3405:68: (iv_ruleGSSTmTcFormatArrayDimension= ruleGSSTmTcFormatArrayDimension EOF )
            // InternalTM_TC_FORMAT.g:3406:2: iv_ruleGSSTmTcFormatArrayDimension= ruleGSSTmTcFormatArrayDimension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTmTcFormatArrayDimensionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTmTcFormatArrayDimension=ruleGSSTmTcFormatArrayDimension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTmTcFormatArrayDimension; 
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
    // $ANTLR end "entryRuleGSSTmTcFormatArrayDimension"


    // $ANTLR start "ruleGSSTmTcFormatArrayDimension"
    // InternalTM_TC_FORMAT.g:3412:1: ruleGSSTmTcFormatArrayDimension returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatArrayDimension' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'maxItems' otherlv_7= ':=' ( (lv_maxItems_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSTmTcFormatArrayDimension() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_fidRef_4_0 = null;

        AntlrDatatypeRuleToken lv_maxItems_8_0 = null;



        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:3418:2: ( (otherlv_0= 'GSSTmTcFormatArrayDimension' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'maxItems' otherlv_7= ':=' ( (lv_maxItems_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalTM_TC_FORMAT.g:3419:2: (otherlv_0= 'GSSTmTcFormatArrayDimension' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'maxItems' otherlv_7= ':=' ( (lv_maxItems_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalTM_TC_FORMAT.g:3419:2: (otherlv_0= 'GSSTmTcFormatArrayDimension' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'maxItems' otherlv_7= ':=' ( (lv_maxItems_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalTM_TC_FORMAT.g:3420:3: otherlv_0= 'GSSTmTcFormatArrayDimension' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'maxItems' otherlv_7= ':=' ( (lv_maxItems_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getGSSTmTcFormatArrayDimensionKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getFidRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:3436:3: ( (lv_fidRef_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:3437:4: (lv_fidRef_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:3437:4: (lv_fidRef_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:3438:5: lv_fidRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getFidRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_fidRef_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatArrayDimensionRule());
              					}
              					set(
              						current,
              						"fidRef",
              						lv_fidRef_4_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,53,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getMaxItemsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:3467:3: ( (lv_maxItems_8_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:3468:4: (lv_maxItems_8_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:3468:4: (lv_maxItems_8_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:3469:5: lv_maxItems_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getMaxItemsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_maxItems_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatArrayDimensionRule());
              					}
              					set(
              						current,
              						"maxItems",
              						lv_maxItems_8_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleGSSTmTcFormatArrayDimension"


    // $ANTLR start "entryRuleGSSTmTcFormatLocalOffset"
    // InternalTM_TC_FORMAT.g:3502:1: entryRuleGSSTmTcFormatLocalOffset returns [EObject current=null] : iv_ruleGSSTmTcFormatLocalOffset= ruleGSSTmTcFormatLocalOffset EOF ;
    public final EObject entryRuleGSSTmTcFormatLocalOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatLocalOffset = null;


        try {
            // InternalTM_TC_FORMAT.g:3502:65: (iv_ruleGSSTmTcFormatLocalOffset= ruleGSSTmTcFormatLocalOffset EOF )
            // InternalTM_TC_FORMAT.g:3503:2: iv_ruleGSSTmTcFormatLocalOffset= ruleGSSTmTcFormatLocalOffset EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTmTcFormatLocalOffsetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTmTcFormatLocalOffset=ruleGSSTmTcFormatLocalOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTmTcFormatLocalOffset; 
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
    // $ANTLR end "entryRuleGSSTmTcFormatLocalOffset"


    // $ANTLR start "ruleGSSTmTcFormatLocalOffset"
    // InternalTM_TC_FORMAT.g:3509:1: ruleGSSTmTcFormatLocalOffset returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatLocalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSTmTcFormatLocalOffset() throws RecognitionException {
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
            // InternalTM_TC_FORMAT.g:3515:2: ( (otherlv_0= 'GSSTmTcFormatLocalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalTM_TC_FORMAT.g:3516:2: (otherlv_0= 'GSSTmTcFormatLocalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalTM_TC_FORMAT.g:3516:2: (otherlv_0= 'GSSTmTcFormatLocalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalTM_TC_FORMAT.g:3517:3: otherlv_0= 'GSSTmTcFormatLocalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getGSSTmTcFormatLocalOffsetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBytesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:3533:3: ( (lv_bytes_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:3534:4: (lv_bytes_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:3534:4: (lv_bytes_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:3535:5: lv_bytes_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBytesINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_bytes_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatLocalOffsetRule());
              					}
              					set(
              						current,
              						"bytes",
              						lv_bytes_4_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBitsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:3564:3: ( (lv_bits_8_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:3565:4: (lv_bits_8_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:3565:4: (lv_bits_8_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:3566:5: lv_bits_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBitsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_bits_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatLocalOffsetRule());
              					}
              					set(
              						current,
              						"bits",
              						lv_bits_8_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleGSSTmTcFormatLocalOffset"


    // $ANTLR start "entryRuleGSSTmTcFormatArrayRef"
    // InternalTM_TC_FORMAT.g:3599:1: entryRuleGSSTmTcFormatArrayRef returns [EObject current=null] : iv_ruleGSSTmTcFormatArrayRef= ruleGSSTmTcFormatArrayRef EOF ;
    public final EObject entryRuleGSSTmTcFormatArrayRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatArrayRef = null;


        try {
            // InternalTM_TC_FORMAT.g:3599:62: (iv_ruleGSSTmTcFormatArrayRef= ruleGSSTmTcFormatArrayRef EOF )
            // InternalTM_TC_FORMAT.g:3600:2: iv_ruleGSSTmTcFormatArrayRef= ruleGSSTmTcFormatArrayRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTmTcFormatArrayRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTmTcFormatArrayRef=ruleGSSTmTcFormatArrayRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTmTcFormatArrayRef; 
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
    // $ANTLR end "entryRuleGSSTmTcFormatArrayRef"


    // $ANTLR start "ruleGSSTmTcFormatArrayRef"
    // InternalTM_TC_FORMAT.g:3606:1: ruleGSSTmTcFormatArrayRef returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatArrayRef' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSTmTcFormatArrayRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_fidRef_4_0 = null;



        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:3612:2: ( (otherlv_0= 'GSSTmTcFormatArrayRef' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalTM_TC_FORMAT.g:3613:2: (otherlv_0= 'GSSTmTcFormatArrayRef' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalTM_TC_FORMAT.g:3613:2: (otherlv_0= 'GSSTmTcFormatArrayRef' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalTM_TC_FORMAT.g:3614:3: otherlv_0= 'GSSTmTcFormatArrayRef' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatArrayRefAccess().getGSSTmTcFormatArrayRefKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatArrayRefAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatArrayRefAccess().getFidRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatArrayRefAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:3630:3: ( (lv_fidRef_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:3631:4: (lv_fidRef_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:3631:4: (lv_fidRef_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:3632:5: lv_fidRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatArrayRefAccess().getFidRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_fidRef_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatArrayRefRule());
              					}
              					set(
              						current,
              						"fidRef",
              						lv_fidRef_4_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatArrayRefAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatArrayRefAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatArrayRefAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSTmTcFormatArrayRef"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalTM_TC_FORMAT.g:3665:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalTM_TC_FORMAT.g:3665:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalTM_TC_FORMAT.g:3666:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalTM_TC_FORMAT.g:3672:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:3678:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalTM_TC_FORMAT.g:3679:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalTM_TC_FORMAT.g:3679:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalTM_TC_FORMAT.g:3680:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalTM_TC_FORMAT.g:3687:3: (kw= '.' this_ID_2= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==56) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTM_TC_FORMAT.g:3688:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,56,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalTM_TC_FORMAT.g:3705:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalTM_TC_FORMAT.g:3705:47: (iv_ruleVersion= ruleVersion EOF )
            // InternalTM_TC_FORMAT.g:3706:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalTM_TC_FORMAT.g:3712:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // InternalTM_TC_FORMAT.g:3718:2: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalTM_TC_FORMAT.g:3719:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalTM_TC_FORMAT.g:3719:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalTM_TC_FORMAT.g:3720:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalTM_TC_FORMAT.g:3720:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RULE_ID) ) {
                    alt14=2;
                }
                else if ( (LA14_1==EOF||LA14_1==13||LA14_1==56||LA14_1==58) ) {
                    alt14=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalTM_TC_FORMAT.g:3721:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalTM_TC_FORMAT.g:3729:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalTM_TC_FORMAT.g:3729:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalTM_TC_FORMAT.g:3730:5: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalTM_TC_FORMAT.g:3730:5: (this_INT_1= RULE_INT )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_INT) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalTM_TC_FORMAT.g:3731:6: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_INT_1);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						newLeafNode(this_INT_1, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0());
                              					
                            }

                            }
                            break;

                    }

                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_51); if (state.failed) return current;
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

            // InternalTM_TC_FORMAT.g:3748:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==56) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTM_TC_FORMAT.g:3749:4: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,56,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    // InternalTM_TC_FORMAT.g:3754:4: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==RULE_INT) ) {
            	        int LA16_1 = input.LA(2);

            	        if ( (LA16_1==RULE_ID) ) {
            	            alt16=2;
            	        }
            	        else if ( (LA16_1==EOF||LA16_1==13||LA16_1==56||LA16_1==58) ) {
            	            alt16=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 16, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA16_0==RULE_ID) ) {
            	        alt16=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalTM_TC_FORMAT.g:3755:5: this_INT_4= RULE_INT
            	            {
            	            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_51); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_INT_4);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalTM_TC_FORMAT.g:3763:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalTM_TC_FORMAT.g:3763:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalTM_TC_FORMAT.g:3764:6: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalTM_TC_FORMAT.g:3764:6: (this_INT_5= RULE_INT )?
            	            int alt15=2;
            	            int LA15_0 = input.LA(1);

            	            if ( (LA15_0==RULE_INT) ) {
            	                alt15=1;
            	            }
            	            switch (alt15) {
            	                case 1 :
            	                    // InternalTM_TC_FORMAT.g:3765:7: this_INT_5= RULE_INT
            	                    {
            	                    this_INT_5=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      							current.merge(this_INT_5);
            	                      						
            	                    }
            	                    if ( state.backtracking==0 ) {

            	                      							newLeafNode(this_INT_5, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0());
            	                      						
            	                    }

            	                    }
            	                    break;

            	            }

            	            this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_51); if (state.failed) return current;
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
            	    break loop17;
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
    // InternalTM_TC_FORMAT.g:3787:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // InternalTM_TC_FORMAT.g:3787:62: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // InternalTM_TC_FORMAT.g:3788:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // InternalTM_TC_FORMAT.g:3794:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;



        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:3800:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // InternalTM_TC_FORMAT.g:3801:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // InternalTM_TC_FORMAT.g:3801:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // InternalTM_TC_FORMAT.g:3802:3: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_52);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,57,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2());
              		
            }
            pushFollow(FollowSets000.FOLLOW_53);
            this_Version_2=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Version_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalTM_TC_FORMAT.g:3836:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // InternalTM_TC_FORMAT.g:3836:47: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalTM_TC_FORMAT.g:3837:2: iv_ruleINTEGER= ruleINTEGER EOF
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
    // InternalTM_TC_FORMAT.g:3843:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;


        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:3849:2: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // InternalTM_TC_FORMAT.g:3850:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // InternalTM_TC_FORMAT.g:3850:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT||LA19_0==59) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_HEXADECIMAL) ) {
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
                    // InternalTM_TC_FORMAT.g:3851:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // InternalTM_TC_FORMAT.g:3851:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // InternalTM_TC_FORMAT.g:3852:4: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // InternalTM_TC_FORMAT.g:3852:4: (kw= '-' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==59) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalTM_TC_FORMAT.g:3853:5: kw= '-'
                            {
                            kw=(Token)match(input,59,FollowSets000.FOLLOW_54); if (state.failed) return current;
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
                    // InternalTM_TC_FORMAT.g:3868:3: this_HEXADECIMAL_2= RULE_HEXADECIMAL
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


    // $ANTLR start "entryRuleREAL"
    // InternalTM_TC_FORMAT.g:3879:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;


        try {
            // InternalTM_TC_FORMAT.g:3879:44: (iv_ruleREAL= ruleREAL EOF )
            // InternalTM_TC_FORMAT.g:3880:2: iv_ruleREAL= ruleREAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getREALRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleREAL=ruleREAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleREAL.getText(); 
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
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalTM_TC_FORMAT.g:3886:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_6=null;


        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:3892:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? ) )
            // InternalTM_TC_FORMAT.g:3893:2: ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? )
            {
            // InternalTM_TC_FORMAT.g:3893:2: ( (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )? )
            // InternalTM_TC_FORMAT.g:3894:3: (kw= '-' )? (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )?
            {
            // InternalTM_TC_FORMAT.g:3894:3: (kw= '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==59) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTM_TC_FORMAT.g:3895:4: kw= '-'
                    {
                    kw=(Token)match(input,59,FollowSets000.FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getREALAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalTM_TC_FORMAT.g:3901:3: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            // InternalTM_TC_FORMAT.g:3902:4: this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
            {
            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(this_INT_1);
              			
            }
            if ( state.backtracking==0 ) {

              				newLeafNode(this_INT_1, grammarAccess.getREALAccess().getINTTerminalRuleCall_1_0());
              			
            }
            kw=(Token)match(input,56,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(kw);
              				newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1_1());
              			
            }
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(this_INT_3);
              			
            }
            if ( state.backtracking==0 ) {

              				newLeafNode(this_INT_3, grammarAccess.getREALAccess().getINTTerminalRuleCall_1_2());
              			
            }

            }

            // InternalTM_TC_FORMAT.g:3922:3: (kw= 'e' (kw= '-' )? this_INT_6= RULE_INT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==60) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTM_TC_FORMAT.g:3923:4: kw= 'e' (kw= '-' )? this_INT_6= RULE_INT
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getREALAccess().getEKeyword_2_0());
                      			
                    }
                    // InternalTM_TC_FORMAT.g:3928:4: (kw= '-' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==59) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalTM_TC_FORMAT.g:3929:5: kw= '-'
                            {
                            kw=(Token)match(input,59,FollowSets000.FOLLOW_54); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getREALAccess().getHyphenMinusKeyword_2_1());
                              				
                            }

                            }
                            break;

                    }

                    this_INT_6=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_6, grammarAccess.getREALAccess().getINTTerminalRuleCall_2_2());
                      			
                    }

                    }
                    break;

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
    // $ANTLR end "ruleREAL"


    // $ANTLR start "ruleGSSTmTcFormatTmTCFormatType"
    // InternalTM_TC_FORMAT.g:3947:1: ruleGSSTmTcFormatTmTCFormatType returns [Enumerator current=null] : ( (enumLiteral_0= 'TM' ) | (enumLiteral_1= 'TC' ) ) ;
    public final Enumerator ruleGSSTmTcFormatTmTCFormatType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:3953:2: ( ( (enumLiteral_0= 'TM' ) | (enumLiteral_1= 'TC' ) ) )
            // InternalTM_TC_FORMAT.g:3954:2: ( (enumLiteral_0= 'TM' ) | (enumLiteral_1= 'TC' ) )
            {
            // InternalTM_TC_FORMAT.g:3954:2: ( (enumLiteral_0= 'TM' ) | (enumLiteral_1= 'TC' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==61) ) {
                alt23=1;
            }
            else if ( (LA23_0==62) ) {
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
                    // InternalTM_TC_FORMAT.g:3955:3: (enumLiteral_0= 'TM' )
                    {
                    // InternalTM_TC_FORMAT.g:3955:3: (enumLiteral_0= 'TM' )
                    // InternalTM_TC_FORMAT.g:3956:4: enumLiteral_0= 'TM'
                    {
                    enumLiteral_0=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatTmTCFormatTypeAccess().getTMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSTmTcFormatTmTCFormatTypeAccess().getTMEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTM_TC_FORMAT.g:3963:3: (enumLiteral_1= 'TC' )
                    {
                    // InternalTM_TC_FORMAT.g:3963:3: (enumLiteral_1= 'TC' )
                    // InternalTM_TC_FORMAT.g:3964:4: enumLiteral_1= 'TC'
                    {
                    enumLiteral_1=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatTmTCFormatTypeAccess().getTCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSTmTcFormatTmTCFormatTypeAccess().getTCEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGSSTmTcFormatTmTCFormatType"


    // $ANTLR start "ruleGSSTmTcFormatFieldType"
    // InternalTM_TC_FORMAT.g:3974:1: ruleGSSTmTcFormatFieldType returns [Enumerator current=null] : ( (enumLiteral_0= 'structured' ) | (enumLiteral_1= 'uint' ) | (enumLiteral_2= 'flag' ) | (enumLiteral_3= 'enumerated' ) | (enumLiteral_4= 'bit_vector' ) | (enumLiteral_5= 'byte_vector' ) | (enumLiteral_6= 'float' ) | (enumLiteral_7= 'deduced' ) ) ;
    public final Enumerator ruleGSSTmTcFormatFieldType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:3980:2: ( ( (enumLiteral_0= 'structured' ) | (enumLiteral_1= 'uint' ) | (enumLiteral_2= 'flag' ) | (enumLiteral_3= 'enumerated' ) | (enumLiteral_4= 'bit_vector' ) | (enumLiteral_5= 'byte_vector' ) | (enumLiteral_6= 'float' ) | (enumLiteral_7= 'deduced' ) ) )
            // InternalTM_TC_FORMAT.g:3981:2: ( (enumLiteral_0= 'structured' ) | (enumLiteral_1= 'uint' ) | (enumLiteral_2= 'flag' ) | (enumLiteral_3= 'enumerated' ) | (enumLiteral_4= 'bit_vector' ) | (enumLiteral_5= 'byte_vector' ) | (enumLiteral_6= 'float' ) | (enumLiteral_7= 'deduced' ) )
            {
            // InternalTM_TC_FORMAT.g:3981:2: ( (enumLiteral_0= 'structured' ) | (enumLiteral_1= 'uint' ) | (enumLiteral_2= 'flag' ) | (enumLiteral_3= 'enumerated' ) | (enumLiteral_4= 'bit_vector' ) | (enumLiteral_5= 'byte_vector' ) | (enumLiteral_6= 'float' ) | (enumLiteral_7= 'deduced' ) )
            int alt24=8;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt24=1;
                }
                break;
            case 64:
                {
                alt24=2;
                }
                break;
            case 65:
                {
                alt24=3;
                }
                break;
            case 66:
                {
                alt24=4;
                }
                break;
            case 67:
                {
                alt24=5;
                }
                break;
            case 68:
                {
                alt24=6;
                }
                break;
            case 69:
                {
                alt24=7;
                }
                break;
            case 70:
                {
                alt24=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalTM_TC_FORMAT.g:3982:3: (enumLiteral_0= 'structured' )
                    {
                    // InternalTM_TC_FORMAT.g:3982:3: (enumLiteral_0= 'structured' )
                    // InternalTM_TC_FORMAT.g:3983:4: enumLiteral_0= 'structured'
                    {
                    enumLiteral_0=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatFieldTypeAccess().getStructuredEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSTmTcFormatFieldTypeAccess().getStructuredEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTM_TC_FORMAT.g:3990:3: (enumLiteral_1= 'uint' )
                    {
                    // InternalTM_TC_FORMAT.g:3990:3: (enumLiteral_1= 'uint' )
                    // InternalTM_TC_FORMAT.g:3991:4: enumLiteral_1= 'uint'
                    {
                    enumLiteral_1=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatFieldTypeAccess().getUintEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSTmTcFormatFieldTypeAccess().getUintEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTM_TC_FORMAT.g:3998:3: (enumLiteral_2= 'flag' )
                    {
                    // InternalTM_TC_FORMAT.g:3998:3: (enumLiteral_2= 'flag' )
                    // InternalTM_TC_FORMAT.g:3999:4: enumLiteral_2= 'flag'
                    {
                    enumLiteral_2=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatFieldTypeAccess().getFlagEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSTmTcFormatFieldTypeAccess().getFlagEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTM_TC_FORMAT.g:4006:3: (enumLiteral_3= 'enumerated' )
                    {
                    // InternalTM_TC_FORMAT.g:4006:3: (enumLiteral_3= 'enumerated' )
                    // InternalTM_TC_FORMAT.g:4007:4: enumLiteral_3= 'enumerated'
                    {
                    enumLiteral_3=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatFieldTypeAccess().getEnumeratedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getGSSTmTcFormatFieldTypeAccess().getEnumeratedEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTM_TC_FORMAT.g:4014:3: (enumLiteral_4= 'bit_vector' )
                    {
                    // InternalTM_TC_FORMAT.g:4014:3: (enumLiteral_4= 'bit_vector' )
                    // InternalTM_TC_FORMAT.g:4015:4: enumLiteral_4= 'bit_vector'
                    {
                    enumLiteral_4=(Token)match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatFieldTypeAccess().getBit_vectorEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getGSSTmTcFormatFieldTypeAccess().getBit_vectorEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalTM_TC_FORMAT.g:4022:3: (enumLiteral_5= 'byte_vector' )
                    {
                    // InternalTM_TC_FORMAT.g:4022:3: (enumLiteral_5= 'byte_vector' )
                    // InternalTM_TC_FORMAT.g:4023:4: enumLiteral_5= 'byte_vector'
                    {
                    enumLiteral_5=(Token)match(input,68,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatFieldTypeAccess().getByte_vectorEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getGSSTmTcFormatFieldTypeAccess().getByte_vectorEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalTM_TC_FORMAT.g:4030:3: (enumLiteral_6= 'float' )
                    {
                    // InternalTM_TC_FORMAT.g:4030:3: (enumLiteral_6= 'float' )
                    // InternalTM_TC_FORMAT.g:4031:4: enumLiteral_6= 'float'
                    {
                    enumLiteral_6=(Token)match(input,69,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatFieldTypeAccess().getFloatEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getGSSTmTcFormatFieldTypeAccess().getFloatEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalTM_TC_FORMAT.g:4038:3: (enumLiteral_7= 'deduced' )
                    {
                    // InternalTM_TC_FORMAT.g:4038:3: (enumLiteral_7= 'deduced' )
                    // InternalTM_TC_FORMAT.g:4039:4: enumLiteral_7= 'deduced'
                    {
                    enumLiteral_7=(Token)match(input,70,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatFieldTypeAccess().getDeducedEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getGSSTmTcFormatFieldTypeAccess().getDeducedEnumLiteralDeclaration_7());
                      			
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
    // $ANTLR end "ruleGSSTmTcFormatFieldType"


    // $ANTLR start "ruleGSSTmTcFormatFieldByteOrder"
    // InternalTM_TC_FORMAT.g:4049:1: ruleGSSTmTcFormatFieldByteOrder returns [Enumerator current=null] : ( (enumLiteral_0= 'big_endian' ) | (enumLiteral_1= 'little_endian' ) | (enumLiteral_2= 'na' ) ) ;
    public final Enumerator ruleGSSTmTcFormatFieldByteOrder() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:4055:2: ( ( (enumLiteral_0= 'big_endian' ) | (enumLiteral_1= 'little_endian' ) | (enumLiteral_2= 'na' ) ) )
            // InternalTM_TC_FORMAT.g:4056:2: ( (enumLiteral_0= 'big_endian' ) | (enumLiteral_1= 'little_endian' ) | (enumLiteral_2= 'na' ) )
            {
            // InternalTM_TC_FORMAT.g:4056:2: ( (enumLiteral_0= 'big_endian' ) | (enumLiteral_1= 'little_endian' ) | (enumLiteral_2= 'na' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt25=1;
                }
                break;
            case 72:
                {
                alt25=2;
                }
                break;
            case 73:
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
                    // InternalTM_TC_FORMAT.g:4057:3: (enumLiteral_0= 'big_endian' )
                    {
                    // InternalTM_TC_FORMAT.g:4057:3: (enumLiteral_0= 'big_endian' )
                    // InternalTM_TC_FORMAT.g:4058:4: enumLiteral_0= 'big_endian'
                    {
                    enumLiteral_0=(Token)match(input,71,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatFieldByteOrderAccess().getBig_endianEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSTmTcFormatFieldByteOrderAccess().getBig_endianEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTM_TC_FORMAT.g:4065:3: (enumLiteral_1= 'little_endian' )
                    {
                    // InternalTM_TC_FORMAT.g:4065:3: (enumLiteral_1= 'little_endian' )
                    // InternalTM_TC_FORMAT.g:4066:4: enumLiteral_1= 'little_endian'
                    {
                    enumLiteral_1=(Token)match(input,72,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatFieldByteOrderAccess().getLittle_endianEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSTmTcFormatFieldByteOrderAccess().getLittle_endianEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTM_TC_FORMAT.g:4073:3: (enumLiteral_2= 'na' )
                    {
                    // InternalTM_TC_FORMAT.g:4073:3: (enumLiteral_2= 'na' )
                    // InternalTM_TC_FORMAT.g:4074:4: enumLiteral_2= 'na'
                    {
                    enumLiteral_2=(Token)match(input,73,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatFieldByteOrderAccess().getNaEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSTmTcFormatFieldByteOrderAccess().getNaEnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleGSSTmTcFormatFieldByteOrder"


    // $ANTLR start "ruleGSSTmTcFormatSFieldFirstBit"
    // InternalTM_TC_FORMAT.g:4084:1: ruleGSSTmTcFormatSFieldFirstBit returns [Enumerator current=null] : ( (enumLiteral_0= 'MSB' ) | (enumLiteral_1= 'LSB' ) ) ;
    public final Enumerator ruleGSSTmTcFormatSFieldFirstBit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:4090:2: ( ( (enumLiteral_0= 'MSB' ) | (enumLiteral_1= 'LSB' ) ) )
            // InternalTM_TC_FORMAT.g:4091:2: ( (enumLiteral_0= 'MSB' ) | (enumLiteral_1= 'LSB' ) )
            {
            // InternalTM_TC_FORMAT.g:4091:2: ( (enumLiteral_0= 'MSB' ) | (enumLiteral_1= 'LSB' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==74) ) {
                alt26=1;
            }
            else if ( (LA26_0==75) ) {
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
                    // InternalTM_TC_FORMAT.g:4092:3: (enumLiteral_0= 'MSB' )
                    {
                    // InternalTM_TC_FORMAT.g:4092:3: (enumLiteral_0= 'MSB' )
                    // InternalTM_TC_FORMAT.g:4093:4: enumLiteral_0= 'MSB'
                    {
                    enumLiteral_0=(Token)match(input,74,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatSFieldFirstBitAccess().getMSBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSTmTcFormatSFieldFirstBitAccess().getMSBEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTM_TC_FORMAT.g:4100:3: (enumLiteral_1= 'LSB' )
                    {
                    // InternalTM_TC_FORMAT.g:4100:3: (enumLiteral_1= 'LSB' )
                    // InternalTM_TC_FORMAT.g:4101:4: enumLiteral_1= 'LSB'
                    {
                    enumLiteral_1=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatSFieldFirstBitAccess().getLSBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSTmTcFormatSFieldFirstBitAccess().getLSBEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGSSTmTcFormatSFieldFirstBit"


    // $ANTLR start "ruleGSSTmTcFormatUnit"
    // InternalTM_TC_FORMAT.g:4111:1: ruleGSSTmTcFormatUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) | (enumLiteral_2= 'halfword' ) | (enumLiteral_3= 'string10' ) | (enumLiteral_4= 'string17' ) | (enumLiteral_5= 'string69' ) ) ;
    public final Enumerator ruleGSSTmTcFormatUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:4117:2: ( ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) | (enumLiteral_2= 'halfword' ) | (enumLiteral_3= 'string10' ) | (enumLiteral_4= 'string17' ) | (enumLiteral_5= 'string69' ) ) )
            // InternalTM_TC_FORMAT.g:4118:2: ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) | (enumLiteral_2= 'halfword' ) | (enumLiteral_3= 'string10' ) | (enumLiteral_4= 'string17' ) | (enumLiteral_5= 'string69' ) )
            {
            // InternalTM_TC_FORMAT.g:4118:2: ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) | (enumLiteral_2= 'halfword' ) | (enumLiteral_3= 'string10' ) | (enumLiteral_4= 'string17' ) | (enumLiteral_5= 'string69' ) )
            int alt27=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt27=1;
                }
                break;
            case 38:
                {
                alt27=2;
                }
                break;
            case 76:
                {
                alt27=3;
                }
                break;
            case 77:
                {
                alt27=4;
                }
                break;
            case 78:
                {
                alt27=5;
                }
                break;
            case 79:
                {
                alt27=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalTM_TC_FORMAT.g:4119:3: (enumLiteral_0= 'bytes' )
                    {
                    // InternalTM_TC_FORMAT.g:4119:3: (enumLiteral_0= 'bytes' )
                    // InternalTM_TC_FORMAT.g:4120:4: enumLiteral_0= 'bytes'
                    {
                    enumLiteral_0=(Token)match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatUnitAccess().getBytesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSTmTcFormatUnitAccess().getBytesEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTM_TC_FORMAT.g:4127:3: (enumLiteral_1= 'bits' )
                    {
                    // InternalTM_TC_FORMAT.g:4127:3: (enumLiteral_1= 'bits' )
                    // InternalTM_TC_FORMAT.g:4128:4: enumLiteral_1= 'bits'
                    {
                    enumLiteral_1=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatUnitAccess().getBitsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSTmTcFormatUnitAccess().getBitsEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTM_TC_FORMAT.g:4135:3: (enumLiteral_2= 'halfword' )
                    {
                    // InternalTM_TC_FORMAT.g:4135:3: (enumLiteral_2= 'halfword' )
                    // InternalTM_TC_FORMAT.g:4136:4: enumLiteral_2= 'halfword'
                    {
                    enumLiteral_2=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatUnitAccess().getHalfwordEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSTmTcFormatUnitAccess().getHalfwordEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTM_TC_FORMAT.g:4143:3: (enumLiteral_3= 'string10' )
                    {
                    // InternalTM_TC_FORMAT.g:4143:3: (enumLiteral_3= 'string10' )
                    // InternalTM_TC_FORMAT.g:4144:4: enumLiteral_3= 'string10'
                    {
                    enumLiteral_3=(Token)match(input,77,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatUnitAccess().getString10EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getGSSTmTcFormatUnitAccess().getString10EnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTM_TC_FORMAT.g:4151:3: (enumLiteral_4= 'string17' )
                    {
                    // InternalTM_TC_FORMAT.g:4151:3: (enumLiteral_4= 'string17' )
                    // InternalTM_TC_FORMAT.g:4152:4: enumLiteral_4= 'string17'
                    {
                    enumLiteral_4=(Token)match(input,78,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatUnitAccess().getString17EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getGSSTmTcFormatUnitAccess().getString17EnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalTM_TC_FORMAT.g:4159:3: (enumLiteral_5= 'string69' )
                    {
                    // InternalTM_TC_FORMAT.g:4159:3: (enumLiteral_5= 'string69' )
                    // InternalTM_TC_FORMAT.g:4160:4: enumLiteral_5= 'string69'
                    {
                    enumLiteral_5=(Token)match(input,79,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatUnitAccess().getString69EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getGSSTmTcFormatUnitAccess().getString69EnumLiteralDeclaration_5());
                      			
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
    // $ANTLR end "ruleGSSTmTcFormatUnit"


    // $ANTLR start "ruleGSSTmTcFormatPower"
    // InternalTM_TC_FORMAT.g:4170:1: ruleGSSTmTcFormatPower returns [Enumerator current=null] : ( (enumLiteral_0= '2bits' ) | (enumLiteral_1= '2bits_with_0' ) ) ;
    public final Enumerator ruleGSSTmTcFormatPower() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:4176:2: ( ( (enumLiteral_0= '2bits' ) | (enumLiteral_1= '2bits_with_0' ) ) )
            // InternalTM_TC_FORMAT.g:4177:2: ( (enumLiteral_0= '2bits' ) | (enumLiteral_1= '2bits_with_0' ) )
            {
            // InternalTM_TC_FORMAT.g:4177:2: ( (enumLiteral_0= '2bits' ) | (enumLiteral_1= '2bits_with_0' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==80) ) {
                alt28=1;
            }
            else if ( (LA28_0==81) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalTM_TC_FORMAT.g:4178:3: (enumLiteral_0= '2bits' )
                    {
                    // InternalTM_TC_FORMAT.g:4178:3: (enumLiteral_0= '2bits' )
                    // InternalTM_TC_FORMAT.g:4179:4: enumLiteral_0= '2bits'
                    {
                    enumLiteral_0=(Token)match(input,80,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatPowerAccess().get_2EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSTmTcFormatPowerAccess().get_2EnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTM_TC_FORMAT.g:4186:3: (enumLiteral_1= '2bits_with_0' )
                    {
                    // InternalTM_TC_FORMAT.g:4186:3: (enumLiteral_1= '2bits_with_0' )
                    // InternalTM_TC_FORMAT.g:4187:4: enumLiteral_1= '2bits_with_0'
                    {
                    enumLiteral_1=(Token)match(input,81,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatPowerAccess().get_2_with_0EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSTmTcFormatPowerAccess().get_2_with_0EnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGSSTmTcFormatPower"


    // $ANTLR start "ruleGSSTmTcFormatCheckType"
    // InternalTM_TC_FORMAT.g:4197:1: ruleGSSTmTcFormatCheckType returns [Enumerator current=null] : ( (enumLiteral_0= 'crc16' ) | (enumLiteral_1= 'checksum16' ) ) ;
    public final Enumerator ruleGSSTmTcFormatCheckType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:4203:2: ( ( (enumLiteral_0= 'crc16' ) | (enumLiteral_1= 'checksum16' ) ) )
            // InternalTM_TC_FORMAT.g:4204:2: ( (enumLiteral_0= 'crc16' ) | (enumLiteral_1= 'checksum16' ) )
            {
            // InternalTM_TC_FORMAT.g:4204:2: ( (enumLiteral_0= 'crc16' ) | (enumLiteral_1= 'checksum16' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==82) ) {
                alt29=1;
            }
            else if ( (LA29_0==83) ) {
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
                    // InternalTM_TC_FORMAT.g:4205:3: (enumLiteral_0= 'crc16' )
                    {
                    // InternalTM_TC_FORMAT.g:4205:3: (enumLiteral_0= 'crc16' )
                    // InternalTM_TC_FORMAT.g:4206:4: enumLiteral_0= 'crc16'
                    {
                    enumLiteral_0=(Token)match(input,82,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatCheckTypeAccess().getCrc16EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSTmTcFormatCheckTypeAccess().getCrc16EnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTM_TC_FORMAT.g:4213:3: (enumLiteral_1= 'checksum16' )
                    {
                    // InternalTM_TC_FORMAT.g:4213:3: (enumLiteral_1= 'checksum16' )
                    // InternalTM_TC_FORMAT.g:4214:4: enumLiteral_1= 'checksum16'
                    {
                    enumLiteral_1=(Token)match(input,83,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatCheckTypeAccess().getChecksum16EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSTmTcFormatCheckTypeAccess().getChecksum16EnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGSSTmTcFormatCheckType"

    // $ANTLR start synpred2_InternalTM_TC_FORMAT
    public final void synpred2_InternalTM_TC_FORMAT_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;


        // InternalTM_TC_FORMAT.g:239:4: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) )
        // InternalTM_TC_FORMAT.g:239:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        {
        // InternalTM_TC_FORMAT.g:239:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        // InternalTM_TC_FORMAT.g:240:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalTM_TC_FORMAT", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalTM_TC_FORMAT.g:240:120: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        // InternalTM_TC_FORMAT.g:241:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 0);
        // InternalTM_TC_FORMAT.g:244:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        // InternalTM_TC_FORMAT.g:244:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalTM_TC_FORMAT", "true");
        }
        // InternalTM_TC_FORMAT.g:244:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        // InternalTM_TC_FORMAT.g:244:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
        {
        otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_8); if (state.failed) return ;
        otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return ;
        // InternalTM_TC_FORMAT.g:252:9: ( (lv_uri_6_0= ruleQualifiedName ) )
        // InternalTM_TC_FORMAT.g:253:10: (lv_uri_6_0= ruleQualifiedName )
        {
        // InternalTM_TC_FORMAT.g:253:10: (lv_uri_6_0= ruleQualifiedName )
        // InternalTM_TC_FORMAT.g:254:11: lv_uri_6_0= ruleQualifiedName
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
          										
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
    // $ANTLR end synpred2_InternalTM_TC_FORMAT

    // $ANTLR start synpred3_InternalTM_TC_FORMAT
    public final void synpred3_InternalTM_TC_FORMAT_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_version_10_0 = null;


        // InternalTM_TC_FORMAT.g:281:4: ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )
        // InternalTM_TC_FORMAT.g:281:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        {
        // InternalTM_TC_FORMAT.g:281:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        // InternalTM_TC_FORMAT.g:282:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalTM_TC_FORMAT", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 1)");
        }
        // InternalTM_TC_FORMAT.g:282:120: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        // InternalTM_TC_FORMAT.g:283:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 1);
        // InternalTM_TC_FORMAT.g:286:9: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        // InternalTM_TC_FORMAT.g:286:10: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalTM_TC_FORMAT", "true");
        }
        // InternalTM_TC_FORMAT.g:286:19: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        // InternalTM_TC_FORMAT.g:286:20: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
        {
        otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_8); if (state.failed) return ;
        otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_10); if (state.failed) return ;
        // InternalTM_TC_FORMAT.g:294:9: ( (lv_version_10_0= ruleVersion ) )
        // InternalTM_TC_FORMAT.g:295:10: (lv_version_10_0= ruleVersion )
        {
        // InternalTM_TC_FORMAT.g:295:10: (lv_version_10_0= ruleVersion )
        // InternalTM_TC_FORMAT.g:296:11: lv_version_10_0= ruleVersion
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getVersionVersionParserRuleCall_3_1_2_0());
          										
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
    // $ANTLR end synpred3_InternalTM_TC_FORMAT

    // $ANTLR start synpred4_InternalTM_TC_FORMAT
    public final void synpred4_InternalTM_TC_FORMAT_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_description_14_0=null;
        Token otherlv_15=null;

        // InternalTM_TC_FORMAT.g:323:4: ( ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) )
        // InternalTM_TC_FORMAT.g:323:4: ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) )
        {
        // InternalTM_TC_FORMAT.g:323:4: ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) )
        // InternalTM_TC_FORMAT.g:324:5: {...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred4_InternalTM_TC_FORMAT", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 2)");
        }
        // InternalTM_TC_FORMAT.g:324:120: ( ({...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' ) ) )
        // InternalTM_TC_FORMAT.g:325:6: ({...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 2);
        // InternalTM_TC_FORMAT.g:328:9: ({...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' ) )
        // InternalTM_TC_FORMAT.g:328:10: {...}? => (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred4_InternalTM_TC_FORMAT", "true");
        }
        // InternalTM_TC_FORMAT.g:328:19: (otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';' )
        // InternalTM_TC_FORMAT.g:328:20: otherlv_12= 'description' otherlv_13= ':=' ( (lv_description_14_0= RULE_ID ) ) otherlv_15= ';'
        {
        otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_8); if (state.failed) return ;
        otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return ;
        // InternalTM_TC_FORMAT.g:336:9: ( (lv_description_14_0= RULE_ID ) )
        // InternalTM_TC_FORMAT.g:337:10: (lv_description_14_0= RULE_ID )
        {
        // InternalTM_TC_FORMAT.g:337:10: (lv_description_14_0= RULE_ID )
        // InternalTM_TC_FORMAT.g:338:11: lv_description_14_0= RULE_ID
        {
        lv_description_14_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); if (state.failed) return ;

        }


        }

        otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalTM_TC_FORMAT

    // $ANTLR start synpred5_InternalTM_TC_FORMAT
    public final void synpred5_InternalTM_TC_FORMAT_fragment() throws RecognitionException {   
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_protocol_18_0=null;
        Token otherlv_19=null;

        // InternalTM_TC_FORMAT.g:364:4: ( ({...}? => ( ({...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' ) ) ) ) )
        // InternalTM_TC_FORMAT.g:364:4: ({...}? => ( ({...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' ) ) ) )
        {
        // InternalTM_TC_FORMAT.g:364:4: ({...}? => ( ({...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' ) ) ) )
        // InternalTM_TC_FORMAT.g:365:5: {...}? => ( ({...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred5_InternalTM_TC_FORMAT", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 3)");
        }
        // InternalTM_TC_FORMAT.g:365:120: ( ({...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' ) ) )
        // InternalTM_TC_FORMAT.g:366:6: ({...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 3);
        // InternalTM_TC_FORMAT.g:369:9: ({...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' ) )
        // InternalTM_TC_FORMAT.g:369:10: {...}? => (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred5_InternalTM_TC_FORMAT", "true");
        }
        // InternalTM_TC_FORMAT.g:369:19: (otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';' )
        // InternalTM_TC_FORMAT.g:369:20: otherlv_16= 'protocol' otherlv_17= ':=' ( (lv_protocol_18_0= RULE_ID ) ) otherlv_19= ';'
        {
        otherlv_16=(Token)match(input,20,FollowSets000.FOLLOW_8); if (state.failed) return ;
        otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return ;
        // InternalTM_TC_FORMAT.g:377:9: ( (lv_protocol_18_0= RULE_ID ) )
        // InternalTM_TC_FORMAT.g:378:10: (lv_protocol_18_0= RULE_ID )
        {
        // InternalTM_TC_FORMAT.g:378:10: (lv_protocol_18_0= RULE_ID )
        // InternalTM_TC_FORMAT.g:379:11: lv_protocol_18_0= RULE_ID
        {
        lv_protocol_18_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); if (state.failed) return ;

        }


        }

        otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalTM_TC_FORMAT

    // $ANTLR start synpred13_InternalTM_TC_FORMAT
    public final void synpred13_InternalTM_TC_FORMAT_fragment() throws RecognitionException {   
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Enumerator lv_type_22_0 = null;

        EObject lv_CSField_24_0 = null;

        EObject lv_CSFormulaField_25_0 = null;

        EObject lv_VSField_26_0 = null;

        EObject lv_FDICField_27_0 = null;

        EObject lv_VRFieldSize_28_0 = null;

        EObject lv_AField_29_0 = null;

        EObject lv_AIField_30_0 = null;


        // InternalTM_TC_FORMAT.g:405:4: ( ({...}? => ( ({...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) ) )
        // InternalTM_TC_FORMAT.g:405:4: ({...}? => ( ({...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) )
        {
        // InternalTM_TC_FORMAT.g:405:4: ({...}? => ( ({...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) )
        // InternalTM_TC_FORMAT.g:406:5: {...}? => ( ({...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 4) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred13_InternalTM_TC_FORMAT", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 4)");
        }
        // InternalTM_TC_FORMAT.g:406:120: ( ({...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* ) ) )
        // InternalTM_TC_FORMAT.g:407:6: ({...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getUnorderedGroup_3(), 4);
        // InternalTM_TC_FORMAT.g:410:9: ({...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* ) )
        // InternalTM_TC_FORMAT.g:410:10: {...}? => ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred13_InternalTM_TC_FORMAT", "true");
        }
        // InternalTM_TC_FORMAT.g:410:19: ( (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )* )
        // InternalTM_TC_FORMAT.g:410:20: (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' ) ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )*
        {
        // InternalTM_TC_FORMAT.g:410:20: (otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';' )
        // InternalTM_TC_FORMAT.g:411:10: otherlv_20= 'type' otherlv_21= ':=' ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) ) otherlv_23= ';'
        {
        otherlv_20=(Token)match(input,21,FollowSets000.FOLLOW_8); if (state.failed) return ;
        otherlv_21=(Token)match(input,17,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalTM_TC_FORMAT.g:419:10: ( (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType ) )
        // InternalTM_TC_FORMAT.g:420:11: (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType )
        {
        // InternalTM_TC_FORMAT.g:420:11: (lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType )
        // InternalTM_TC_FORMAT.g:421:12: lv_type_22_0= ruleGSSTmTcFormatTmTCFormatType
        {
        if ( state.backtracking==0 ) {

          												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getTypeGSSTmTcFormatTmTCFormatTypeEnumRuleCall_3_4_0_2_0());
          											
        }
        pushFollow(FollowSets000.FOLLOW_5);
        lv_type_22_0=ruleGSSTmTcFormatTmTCFormatType();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_57); if (state.failed) return ;

        }

        // InternalTM_TC_FORMAT.g:443:9: ( ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) ) )*
        loop30:
        do {
            int alt30=8;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt30=1;
                }
                break;
            case 29:
                {
                alt30=2;
                }
                break;
            case 30:
                {
                alt30=3;
                }
                break;
            case 31:
                {
                alt30=4;
                }
                break;
            case 33:
                {
                alt30=5;
                }
                break;
            case 34:
                {
                alt30=6;
                }
                break;
            case 35:
                {
                alt30=7;
                }
                break;

            }

            switch (alt30) {
        	case 1 :
        	    // InternalTM_TC_FORMAT.g:444:10: ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) )
        	    {
        	    // InternalTM_TC_FORMAT.g:444:10: ( (lv_CSField_24_0= ruleGSSTmTcFormatCSField ) )
        	    // InternalTM_TC_FORMAT.g:445:11: (lv_CSField_24_0= ruleGSSTmTcFormatCSField )
        	    {
        	    // InternalTM_TC_FORMAT.g:445:11: (lv_CSField_24_0= ruleGSSTmTcFormatCSField )
        	    // InternalTM_TC_FORMAT.g:446:12: lv_CSField_24_0= ruleGSSTmTcFormatCSField
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getCSFieldGSSTmTcFormatCSFieldParserRuleCall_3_4_1_0_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_57);
        	    lv_CSField_24_0=ruleGSSTmTcFormatCSField();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 2 :
        	    // InternalTM_TC_FORMAT.g:464:10: ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) )
        	    {
        	    // InternalTM_TC_FORMAT.g:464:10: ( (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField ) )
        	    // InternalTM_TC_FORMAT.g:465:11: (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField )
        	    {
        	    // InternalTM_TC_FORMAT.g:465:11: (lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField )
        	    // InternalTM_TC_FORMAT.g:466:12: lv_CSFormulaField_25_0= ruleGSSTmTcFormatCSFormulaField
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getCSFormulaFieldGSSTmTcFormatCSFormulaFieldParserRuleCall_3_4_1_1_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_57);
        	    lv_CSFormulaField_25_0=ruleGSSTmTcFormatCSFormulaField();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 3 :
        	    // InternalTM_TC_FORMAT.g:484:10: ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) )
        	    {
        	    // InternalTM_TC_FORMAT.g:484:10: ( (lv_VSField_26_0= ruleGSSTmTcFormatVSField ) )
        	    // InternalTM_TC_FORMAT.g:485:11: (lv_VSField_26_0= ruleGSSTmTcFormatVSField )
        	    {
        	    // InternalTM_TC_FORMAT.g:485:11: (lv_VSField_26_0= ruleGSSTmTcFormatVSField )
        	    // InternalTM_TC_FORMAT.g:486:12: lv_VSField_26_0= ruleGSSTmTcFormatVSField
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getVSFieldGSSTmTcFormatVSFieldParserRuleCall_3_4_1_2_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_57);
        	    lv_VSField_26_0=ruleGSSTmTcFormatVSField();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 4 :
        	    // InternalTM_TC_FORMAT.g:504:10: ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) )
        	    {
        	    // InternalTM_TC_FORMAT.g:504:10: ( (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField ) )
        	    // InternalTM_TC_FORMAT.g:505:11: (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField )
        	    {
        	    // InternalTM_TC_FORMAT.g:505:11: (lv_FDICField_27_0= ruleGSSTmTcFormatFDICField )
        	    // InternalTM_TC_FORMAT.g:506:12: lv_FDICField_27_0= ruleGSSTmTcFormatFDICField
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getFDICFieldGSSTmTcFormatFDICFieldParserRuleCall_3_4_1_3_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_57);
        	    lv_FDICField_27_0=ruleGSSTmTcFormatFDICField();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 5 :
        	    // InternalTM_TC_FORMAT.g:524:10: ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) )
        	    {
        	    // InternalTM_TC_FORMAT.g:524:10: ( (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize ) )
        	    // InternalTM_TC_FORMAT.g:525:11: (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize )
        	    {
        	    // InternalTM_TC_FORMAT.g:525:11: (lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize )
        	    // InternalTM_TC_FORMAT.g:526:12: lv_VRFieldSize_28_0= ruleGSSTmTcFormatVRFieldSize
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getVRFieldSizeGSSTmTcFormatVRFieldSizeParserRuleCall_3_4_1_4_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_57);
        	    lv_VRFieldSize_28_0=ruleGSSTmTcFormatVRFieldSize();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 6 :
        	    // InternalTM_TC_FORMAT.g:544:10: ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) )
        	    {
        	    // InternalTM_TC_FORMAT.g:544:10: ( (lv_AField_29_0= ruleGSSTmTcFormatAField ) )
        	    // InternalTM_TC_FORMAT.g:545:11: (lv_AField_29_0= ruleGSSTmTcFormatAField )
        	    {
        	    // InternalTM_TC_FORMAT.g:545:11: (lv_AField_29_0= ruleGSSTmTcFormatAField )
        	    // InternalTM_TC_FORMAT.g:546:12: lv_AField_29_0= ruleGSSTmTcFormatAField
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getAFieldGSSTmTcFormatAFieldParserRuleCall_3_4_1_5_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_57);
        	    lv_AField_29_0=ruleGSSTmTcFormatAField();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 7 :
        	    // InternalTM_TC_FORMAT.g:564:10: ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) )
        	    {
        	    // InternalTM_TC_FORMAT.g:564:10: ( (lv_AIField_30_0= ruleGSSTmTcFormatAIField ) )
        	    // InternalTM_TC_FORMAT.g:565:11: (lv_AIField_30_0= ruleGSSTmTcFormatAIField )
        	    {
        	    // InternalTM_TC_FORMAT.g:565:11: (lv_AIField_30_0= ruleGSSTmTcFormatAIField )
        	    // InternalTM_TC_FORMAT.g:566:12: lv_AIField_30_0= ruleGSSTmTcFormatAIField
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTCFormatAccess().getAIFieldGSSTmTcFormatAIFieldParserRuleCall_3_4_1_6_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_57);
        	    lv_AIField_30_0=ruleGSSTmTcFormatAIField();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop30;
            }
        } while (true);


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred13_InternalTM_TC_FORMAT

    // Delegated rules

    public final boolean synpred3_InternalTM_TC_FORMAT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalTM_TC_FORMAT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalTM_TC_FORMAT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalTM_TC_FORMAT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalTM_TC_FORMAT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalTM_TC_FORMAT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalTM_TC_FORMAT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalTM_TC_FORMAT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalTM_TC_FORMAT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalTM_TC_FORMAT_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000003D0000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000007D0000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x6000000000000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000EE0FD0000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0800000000000060L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x8000000000000000L,0x000000000000007FL});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000380L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100080000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0800000000000020L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000006000000000L,0x000000000000F000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001000000400000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0008000000400000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0100000000000002L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000EE0800002L});
    }


}