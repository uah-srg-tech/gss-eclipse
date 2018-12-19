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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_HEXADECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "':='", "';'", "'GSSTmTcFormatTmTcFormat'", "'{'", "'uri'", "'version'", "'protocol'", "'type'", "'}'", "'GSSTmTcFormatCSField'", "'fid'", "'pfid'", "'name'", "'description'", "'byteOrder'", "'firstBit'", "'GSSTmTcFormatCSFormulaField'", "'GSSTmTcFormatVSField'", "'GSSTmTcFormatVRFieldSize'", "'GSSTmTcFormatFDICField'", "'checkType'", "'GSSTmTcFormatAField'", "'GSSTmTcFormatAIField'", "'GSSTmTcFormatSize'", "'bytes'", "'bits'", "'GSSTmTcFormatGlobalOffset'", "'GSSTmTcFormatFormula'", "'slope'", "'intercept'", "'GSSTmTcFormatConstSize'", "'GSSTmTcFormatMaxSize'", "'GSSTmTcFormatVariableSize'", "'fidRef'", "'unit'", "'power'", "'GSSTmTcFormatFloatingOffset'", "'GSSTmTcFormatSortedFieldsToCheck'", "'GSSTmTcFormatFieldToCheck'", "'GSSTmTcFormatArrayDimension'", "'maxItems'", "'GSSTmTcFormatLocalOffset'", "'GSSTmTcFormatArrayRef'", "'.'", "'('", "')'", "'-'", "'TM'", "'TC'", "'structured'", "'uint'", "'flag'", "'enumerated'", "'bit_vector'", "'byte_vector'", "'float'", "'deduced'", "'big_endian'", "'little_endian'", "'na'", "'MSB'", "'LSB'", "'halfword'", "'string10'", "'string17'", "'string69'", "'2bits'", "'2bits_with_0'", "'crc16'", "'checksum16'"
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
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int RULE_HEXADECIMAL=7;
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
    // InternalTM_TC_FORMAT.g:86:1: ruleGSSModelFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSTmTcFormatTmTcFormat ) ) ) ;
    public final EObject ruleGSSModelFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:92:2: ( ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSTmTcFormatTmTcFormat ) ) ) )
            // InternalTM_TC_FORMAT.g:93:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSTmTcFormatTmTcFormat ) ) )
            {
            // InternalTM_TC_FORMAT.g:93:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSTmTcFormatTmTcFormat ) ) )
            // InternalTM_TC_FORMAT.g:94:3: ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSTmTcFormatTmTcFormat ) )
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

            // InternalTM_TC_FORMAT.g:113:3: ( (lv_element_1_0= ruleGSSTmTcFormatTmTcFormat ) )
            // InternalTM_TC_FORMAT.g:114:4: (lv_element_1_0= ruleGSSTmTcFormatTmTcFormat )
            {
            // InternalTM_TC_FORMAT.g:114:4: (lv_element_1_0= ruleGSSTmTcFormatTmTcFormat )
            // InternalTM_TC_FORMAT.g:115:5: lv_element_1_0= ruleGSSTmTcFormatTmTcFormat
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSModelFileAccess().getElementGSSTmTcFormatTmTcFormatParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_1_0=ruleGSSTmTcFormatTmTcFormat();

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
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatTmTcFormat");
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
    // InternalTM_TC_FORMAT.g:143:1: ruleGSSModelFileImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleGSSModelFileImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:149:2: ( (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // InternalTM_TC_FORMAT.g:150:2: (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // InternalTM_TC_FORMAT.g:150:2: (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // InternalTM_TC_FORMAT.g:151:3: otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSModelFileImportAccess().getImportKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSModelFileImportAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalTM_TC_FORMAT.g:159:3: ( (lv_importURI_2_0= RULE_STRING ) )
            // InternalTM_TC_FORMAT.g:160:4: (lv_importURI_2_0= RULE_STRING )
            {
            // InternalTM_TC_FORMAT.g:160:4: (lv_importURI_2_0= RULE_STRING )
            // InternalTM_TC_FORMAT.g:161:5: lv_importURI_2_0= RULE_STRING
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


    // $ANTLR start "entryRuleGSSTmTcFormatTmTcFormat"
    // InternalTM_TC_FORMAT.g:185:1: entryRuleGSSTmTcFormatTmTcFormat returns [EObject current=null] : iv_ruleGSSTmTcFormatTmTcFormat= ruleGSSTmTcFormatTmTcFormat EOF ;
    public final EObject entryRuleGSSTmTcFormatTmTcFormat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatTmTcFormat = null;



        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalTM_TC_FORMAT.g:189:2: (iv_ruleGSSTmTcFormatTmTcFormat= ruleGSSTmTcFormatTmTcFormat EOF )
            // InternalTM_TC_FORMAT.g:190:2: iv_ruleGSSTmTcFormatTmTcFormat= ruleGSSTmTcFormatTmTcFormat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTmTcFormatTmTcFormatRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTmTcFormatTmTcFormat=ruleGSSTmTcFormatTmTcFormat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTmTcFormatTmTcFormat; 
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
    // $ANTLR end "entryRuleGSSTmTcFormatTmTcFormat"


    // $ANTLR start "ruleGSSTmTcFormatTmTcFormat"
    // InternalTM_TC_FORMAT.g:199:1: ruleGSSTmTcFormatTmTcFormat returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatTmTcFormat' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' otherlv_28= ';' ) ;
    public final EObject ruleGSSTmTcFormatTmTcFormat() throws RecognitionException {
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
        Token lv_protocol_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;

        AntlrDatatypeRuleToken lv_version_10_0 = null;

        Enumerator lv_type_18_0 = null;

        EObject lv_CSField_20_0 = null;

        EObject lv_CSFormulaField_21_0 = null;

        EObject lv_VSField_22_0 = null;

        EObject lv_FDICField_23_0 = null;

        EObject lv_VRFieldSize_24_0 = null;

        EObject lv_AField_25_0 = null;

        EObject lv_AIField_26_0 = null;



        	enterRule();
        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalTM_TC_FORMAT.g:208:2: ( (otherlv_0= 'GSSTmTcFormatTmTcFormat' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' otherlv_28= ';' ) )
            // InternalTM_TC_FORMAT.g:209:2: (otherlv_0= 'GSSTmTcFormatTmTcFormat' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' otherlv_28= ';' )
            {
            // InternalTM_TC_FORMAT.g:209:2: (otherlv_0= 'GSSTmTcFormatTmTcFormat' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' otherlv_28= ';' )
            // InternalTM_TC_FORMAT.g:210:3: otherlv_0= 'GSSTmTcFormatTmTcFormat' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' otherlv_28= ';'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getGSSTmTcFormatTmTcFormatKeyword_0());
              		
            }
            // InternalTM_TC_FORMAT.g:214:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTM_TC_FORMAT.g:215:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTM_TC_FORMAT.g:215:4: (lv_name_1_0= RULE_ID )
            // InternalTM_TC_FORMAT.g:216:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTmTcFormatTmTcFormatRule());
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

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalTM_TC_FORMAT.g:236:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) ) )+ {...}?) ) )
            // InternalTM_TC_FORMAT.g:237:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) ) )+ {...}?) )
            {
            // InternalTM_TC_FORMAT.g:237:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) ) )+ {...}?) )
            // InternalTM_TC_FORMAT.g:238:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3());
            // InternalTM_TC_FORMAT.g:241:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) ) )+ {...}?)
            // InternalTM_TC_FORMAT.g:242:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) ) )+ {...}?
            {
            // InternalTM_TC_FORMAT.g:242:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=5;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 1) ) {
                    alt3=2;
                }
                else if ( LA3_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 2) ) {
                    alt3=3;
                }
                else if ( LA3_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 3) ) {
                    alt3=4;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTM_TC_FORMAT.g:243:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // InternalTM_TC_FORMAT.g:243:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    // InternalTM_TC_FORMAT.g:244:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSTmTcFormatTmTcFormat", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalTM_TC_FORMAT.g:244:120: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    // InternalTM_TC_FORMAT.g:245:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 0);
            	    // InternalTM_TC_FORMAT.g:248:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    // InternalTM_TC_FORMAT.g:248:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSTmTcFormatTmTcFormat", "true");
            	    }
            	    // InternalTM_TC_FORMAT.g:248:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    // InternalTM_TC_FORMAT.g:248:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_4, grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUriKeyword_3_0_0());
            	      								
            	    }
            	    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getColonEqualsSignKeyword_3_0_1());
            	      								
            	    }
            	    // InternalTM_TC_FORMAT.g:256:9: ( (lv_uri_6_0= ruleQualifiedName ) )
            	    // InternalTM_TC_FORMAT.g:257:10: (lv_uri_6_0= ruleQualifiedName )
            	    {
            	    // InternalTM_TC_FORMAT.g:257:10: (lv_uri_6_0= ruleQualifiedName )
            	    // InternalTM_TC_FORMAT.g:258:11: lv_uri_6_0= ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_uri_6_0=ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTcFormatRule());
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

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getSemicolonKeyword_3_0_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTM_TC_FORMAT.g:285:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // InternalTM_TC_FORMAT.g:285:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    // InternalTM_TC_FORMAT.g:286:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSTmTcFormatTmTcFormat", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalTM_TC_FORMAT.g:286:120: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    // InternalTM_TC_FORMAT.g:287:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 1);
            	    // InternalTM_TC_FORMAT.g:290:9: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    // InternalTM_TC_FORMAT.g:290:10: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSTmTcFormatTmTcFormat", "true");
            	    }
            	    // InternalTM_TC_FORMAT.g:290:19: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    // InternalTM_TC_FORMAT.g:290:20: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_8, grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getVersionKeyword_3_1_0());
            	      								
            	    }
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getColonEqualsSignKeyword_3_1_1());
            	      								
            	    }
            	    // InternalTM_TC_FORMAT.g:298:9: ( (lv_version_10_0= ruleVersion ) )
            	    // InternalTM_TC_FORMAT.g:299:10: (lv_version_10_0= ruleVersion )
            	    {
            	    // InternalTM_TC_FORMAT.g:299:10: (lv_version_10_0= ruleVersion )
            	    // InternalTM_TC_FORMAT.g:300:11: lv_version_10_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getVersionVersionParserRuleCall_3_1_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_version_10_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTcFormatRule());
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

            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getSemicolonKeyword_3_1_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalTM_TC_FORMAT.g:327:4: ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // InternalTM_TC_FORMAT.g:327:4: ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) )
            	    // InternalTM_TC_FORMAT.g:328:5: {...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSTmTcFormatTmTcFormat", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalTM_TC_FORMAT.g:328:120: ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) )
            	    // InternalTM_TC_FORMAT.g:329:6: ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 2);
            	    // InternalTM_TC_FORMAT.g:332:9: ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) )
            	    // InternalTM_TC_FORMAT.g:332:10: {...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSTmTcFormatTmTcFormat", "true");
            	    }
            	    // InternalTM_TC_FORMAT.g:332:19: (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' )
            	    // InternalTM_TC_FORMAT.g:332:20: otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_12, grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getProtocolKeyword_3_2_0());
            	      								
            	    }
            	    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getColonEqualsSignKeyword_3_2_1());
            	      								
            	    }
            	    // InternalTM_TC_FORMAT.g:340:9: ( (lv_protocol_14_0= RULE_ID ) )
            	    // InternalTM_TC_FORMAT.g:341:10: (lv_protocol_14_0= RULE_ID )
            	    {
            	    // InternalTM_TC_FORMAT.g:341:10: (lv_protocol_14_0= RULE_ID )
            	    // InternalTM_TC_FORMAT.g:342:11: lv_protocol_14_0= RULE_ID
            	    {
            	    lv_protocol_14_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											newLeafNode(lv_protocol_14_0, grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getProtocolIDTerminalRuleCall_3_2_2_0());
            	      										
            	    }
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getGSSTmTcFormatTmTcFormatRule());
            	      											}
            	      											setWithLastConsumed(
            	      												current,
            	      												"protocol",
            	      												lv_protocol_14_0,
            	      												"org.eclipse.xtext.common.Terminals.ID");
            	      										
            	    }

            	    }


            	    }

            	    otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_15, grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getSemicolonKeyword_3_2_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalTM_TC_FORMAT.g:368:4: ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) )
            	    {
            	    // InternalTM_TC_FORMAT.g:368:4: ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) )
            	    // InternalTM_TC_FORMAT.g:369:5: {...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSTmTcFormatTmTcFormat", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalTM_TC_FORMAT.g:369:120: ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* ) ) )
            	    // InternalTM_TC_FORMAT.g:370:6: ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 3);
            	    // InternalTM_TC_FORMAT.g:373:9: ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* ) )
            	    // InternalTM_TC_FORMAT.g:373:10: {...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSTmTcFormatTmTcFormat", "true");
            	    }
            	    // InternalTM_TC_FORMAT.g:373:19: ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* )
            	    // InternalTM_TC_FORMAT.g:373:20: (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )*
            	    {
            	    // InternalTM_TC_FORMAT.g:373:20: (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' )
            	    // InternalTM_TC_FORMAT.g:374:10: otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_16, grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getTypeKeyword_3_3_0_0());
            	      									
            	    }
            	    otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_17, grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getColonEqualsSignKeyword_3_3_0_1());
            	      									
            	    }
            	    // InternalTM_TC_FORMAT.g:382:10: ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) )
            	    // InternalTM_TC_FORMAT.g:383:11: (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType )
            	    {
            	    // InternalTM_TC_FORMAT.g:383:11: (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType )
            	    // InternalTM_TC_FORMAT.g:384:12: lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType
            	    {
            	    if ( state.backtracking==0 ) {

            	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getTypeGSSTmTcFormatTmTcFormatTypeEnumRuleCall_3_3_0_2_0());
            	      											
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_type_18_0=ruleGSSTmTcFormatTmTcFormatType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      												if (current==null) {
            	      													current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTcFormatRule());
            	      												}
            	      												set(
            	      													current,
            	      													"type",
            	      													lv_type_18_0,
            	      													"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatTmTcFormatType");
            	      												afterParserOrEnumRuleCall();
            	      											
            	    }

            	    }


            	    }

            	    otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_19, grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getSemicolonKeyword_3_3_0_3());
            	      									
            	    }

            	    }

            	    // InternalTM_TC_FORMAT.g:406:9: ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )*
            	    loop2:
            	    do {
            	        int alt2=8;
            	        switch ( input.LA(1) ) {
            	        case 22:
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
            	        case 32:
            	            {
            	            alt2=4;
            	            }
            	            break;
            	        case 31:
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
            	    	    // InternalTM_TC_FORMAT.g:407:10: ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:407:10: ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) )
            	    	    // InternalTM_TC_FORMAT.g:408:11: (lv_CSField_20_0= ruleGSSTmTcFormatCSField )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:408:11: (lv_CSField_20_0= ruleGSSTmTcFormatCSField )
            	    	    // InternalTM_TC_FORMAT.g:409:12: lv_CSField_20_0= ruleGSSTmTcFormatCSField
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getCSFieldGSSTmTcFormatCSFieldParserRuleCall_3_3_1_0_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_13);
            	    	    lv_CSField_20_0=ruleGSSTmTcFormatCSField();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTcFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"CSField",
            	    	      													lv_CSField_20_0,
            	    	      													"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatCSField");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalTM_TC_FORMAT.g:427:10: ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:427:10: ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) )
            	    	    // InternalTM_TC_FORMAT.g:428:11: (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:428:11: (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField )
            	    	    // InternalTM_TC_FORMAT.g:429:12: lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getCSFormulaFieldGSSTmTcFormatCSFormulaFieldParserRuleCall_3_3_1_1_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_13);
            	    	    lv_CSFormulaField_21_0=ruleGSSTmTcFormatCSFormulaField();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTcFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"CSFormulaField",
            	    	      													lv_CSFormulaField_21_0,
            	    	      													"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatCSFormulaField");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // InternalTM_TC_FORMAT.g:447:10: ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:447:10: ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) )
            	    	    // InternalTM_TC_FORMAT.g:448:11: (lv_VSField_22_0= ruleGSSTmTcFormatVSField )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:448:11: (lv_VSField_22_0= ruleGSSTmTcFormatVSField )
            	    	    // InternalTM_TC_FORMAT.g:449:12: lv_VSField_22_0= ruleGSSTmTcFormatVSField
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getVSFieldGSSTmTcFormatVSFieldParserRuleCall_3_3_1_2_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_13);
            	    	    lv_VSField_22_0=ruleGSSTmTcFormatVSField();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTcFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"VSField",
            	    	      													lv_VSField_22_0,
            	    	      													"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatVSField");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 4 :
            	    	    // InternalTM_TC_FORMAT.g:467:10: ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:467:10: ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) )
            	    	    // InternalTM_TC_FORMAT.g:468:11: (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:468:11: (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField )
            	    	    // InternalTM_TC_FORMAT.g:469:12: lv_FDICField_23_0= ruleGSSTmTcFormatFDICField
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getFDICFieldGSSTmTcFormatFDICFieldParserRuleCall_3_3_1_3_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_13);
            	    	    lv_FDICField_23_0=ruleGSSTmTcFormatFDICField();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTcFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"FDICField",
            	    	      													lv_FDICField_23_0,
            	    	      													"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatFDICField");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 5 :
            	    	    // InternalTM_TC_FORMAT.g:487:10: ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:487:10: ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) )
            	    	    // InternalTM_TC_FORMAT.g:488:11: (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:488:11: (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize )
            	    	    // InternalTM_TC_FORMAT.g:489:12: lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getVRFieldSizeGSSTmTcFormatVRFieldSizeParserRuleCall_3_3_1_4_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_13);
            	    	    lv_VRFieldSize_24_0=ruleGSSTmTcFormatVRFieldSize();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTcFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"VRFieldSize",
            	    	      													lv_VRFieldSize_24_0,
            	    	      													"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatVRFieldSize");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 6 :
            	    	    // InternalTM_TC_FORMAT.g:507:10: ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:507:10: ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) )
            	    	    // InternalTM_TC_FORMAT.g:508:11: (lv_AField_25_0= ruleGSSTmTcFormatAField )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:508:11: (lv_AField_25_0= ruleGSSTmTcFormatAField )
            	    	    // InternalTM_TC_FORMAT.g:509:12: lv_AField_25_0= ruleGSSTmTcFormatAField
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getAFieldGSSTmTcFormatAFieldParserRuleCall_3_3_1_5_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_13);
            	    	    lv_AField_25_0=ruleGSSTmTcFormatAField();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTcFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"AField",
            	    	      													lv_AField_25_0,
            	    	      													"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatAField");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 7 :
            	    	    // InternalTM_TC_FORMAT.g:527:10: ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:527:10: ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) )
            	    	    // InternalTM_TC_FORMAT.g:528:11: (lv_AIField_26_0= ruleGSSTmTcFormatAIField )
            	    	    {
            	    	    // InternalTM_TC_FORMAT.g:528:11: (lv_AIField_26_0= ruleGSSTmTcFormatAIField )
            	    	    // InternalTM_TC_FORMAT.g:529:12: lv_AIField_26_0= ruleGSSTmTcFormatAIField
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getAIFieldGSSTmTcFormatAIFieldParserRuleCall_3_3_1_6_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_13);
            	    	    lv_AIField_26_0=ruleGSSTmTcFormatAIField();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSTmTcFormatTmTcFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"AIField",
            	    	      													lv_AIField_26_0,
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

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3());

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleGSSTmTcFormatTmTcFormat", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3());

            }

            otherlv_27=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_28=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_28, grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getSemicolonKeyword_5());
              		
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
    // $ANTLR end "ruleGSSTmTcFormatTmTcFormat"


    // $ANTLR start "entryRuleGSSTmTcFormatCSField"
    // InternalTM_TC_FORMAT.g:576:1: entryRuleGSSTmTcFormatCSField returns [EObject current=null] : iv_ruleGSSTmTcFormatCSField= ruleGSSTmTcFormatCSField EOF ;
    public final EObject entryRuleGSSTmTcFormatCSField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatCSField = null;


        try {
            // InternalTM_TC_FORMAT.g:576:61: (iv_ruleGSSTmTcFormatCSField= ruleGSSTmTcFormatCSField EOF )
            // InternalTM_TC_FORMAT.g:577:2: iv_ruleGSSTmTcFormatCSField= ruleGSSTmTcFormatCSField EOF
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
    // InternalTM_TC_FORMAT.g:583:1: ruleGSSTmTcFormatCSField returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatCSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) otherlv_32= '}' otherlv_33= ';' ) ;
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
            // InternalTM_TC_FORMAT.g:589:2: ( (otherlv_0= 'GSSTmTcFormatCSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) otherlv_32= '}' otherlv_33= ';' ) )
            // InternalTM_TC_FORMAT.g:590:2: (otherlv_0= 'GSSTmTcFormatCSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) otherlv_32= '}' otherlv_33= ';' )
            {
            // InternalTM_TC_FORMAT.g:590:2: (otherlv_0= 'GSSTmTcFormatCSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) otherlv_32= '}' otherlv_33= ';' )
            // InternalTM_TC_FORMAT.g:591:3: otherlv_0= 'GSSTmTcFormatCSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) otherlv_32= '}' otherlv_33= ';'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatCSFieldAccess().getGSSTmTcFormatCSFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatCSFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatCSFieldAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:607:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:608:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:608:4: (lv_fid_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:609:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFieldAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatCSFieldAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:638:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:639:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:639:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:640:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFieldAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatCSFieldAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalTM_TC_FORMAT.g:669:3: ( (lv_name_12_0= RULE_STRING ) )
            // InternalTM_TC_FORMAT.g:670:4: (lv_name_12_0= RULE_STRING )
            {
            // InternalTM_TC_FORMAT.g:670:4: (lv_name_12_0= RULE_STRING )
            // InternalTM_TC_FORMAT.g:671:5: lv_name_12_0= RULE_STRING
            {
            lv_name_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getGSSTmTcFormatCSFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTmTcFormatCSFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_12_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_13());
              		
            }
            // InternalTM_TC_FORMAT.g:691:3: (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTM_TC_FORMAT.g:692:4: otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSTmTcFormatCSFieldAccess().getDescriptionKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalTM_TC_FORMAT.g:700:4: ( (lv_description_16_0= RULE_STRING ) )
                    // InternalTM_TC_FORMAT.g:701:5: (lv_description_16_0= RULE_STRING )
                    {
                    // InternalTM_TC_FORMAT.g:701:5: (lv_description_16_0= RULE_STRING )
                    // InternalTM_TC_FORMAT.g:702:6: lv_description_16_0= RULE_STRING
                    {
                    lv_description_16_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_16_0, grammarAccess.getGSSTmTcFormatCSFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTmTcFormatCSFieldRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"description",
                      							lv_description_16_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSTmTcFormatCSFieldAccess().getTypeKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_16());
              		
            }
            // InternalTM_TC_FORMAT.g:731:3: ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) )
            // InternalTM_TC_FORMAT.g:732:4: (lv_type_20_0= ruleGSSTmTcFormatFieldType )
            {
            // InternalTM_TC_FORMAT.g:732:4: (lv_type_20_0= ruleGSSTmTcFormatFieldType )
            // InternalTM_TC_FORMAT.g:733:5: lv_type_20_0= ruleGSSTmTcFormatFieldType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFieldAccess().getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_18());
              		
            }
            otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSTmTcFormatCSFieldAccess().getByteOrderKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_20());
              		
            }
            // InternalTM_TC_FORMAT.g:762:3: ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) )
            // InternalTM_TC_FORMAT.g:763:4: (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder )
            {
            // InternalTM_TC_FORMAT.g:763:4: (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder )
            // InternalTM_TC_FORMAT.g:764:5: lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_22());
              		
            }
            otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSTmTcFormatCSFieldAccess().getFirstBitKeyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSTmTcFormatCSFieldAccess().getColonEqualsSignKeyword_24());
              		
            }
            // InternalTM_TC_FORMAT.g:793:3: ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) )
            // InternalTM_TC_FORMAT.g:794:4: (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit )
            {
            // InternalTM_TC_FORMAT.g:794:4: (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit )
            // InternalTM_TC_FORMAT.g:795:5: lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSTmTcFormatCSFieldAccess().getSemicolonKeyword_26());
              		
            }
            // InternalTM_TC_FORMAT.g:816:3: ( (lv_size_30_0= ruleGSSTmTcFormatSize ) )
            // InternalTM_TC_FORMAT.g:817:4: (lv_size_30_0= ruleGSSTmTcFormatSize )
            {
            // InternalTM_TC_FORMAT.g:817:4: (lv_size_30_0= ruleGSSTmTcFormatSize )
            // InternalTM_TC_FORMAT.g:818:5: lv_size_30_0= ruleGSSTmTcFormatSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFieldAccess().getSizeGSSTmTcFormatSizeParserRuleCall_27_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
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

            // InternalTM_TC_FORMAT.g:835:3: ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) )
            // InternalTM_TC_FORMAT.g:836:4: (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset )
            {
            // InternalTM_TC_FORMAT.g:836:4: (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset )
            // InternalTM_TC_FORMAT.g:837:5: lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFieldAccess().getGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_27);
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

            otherlv_32=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_32, grammarAccess.getGSSTmTcFormatCSFieldAccess().getRightCurlyBracketKeyword_29());
              		
            }
            otherlv_33=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalTM_TC_FORMAT.g:866:1: entryRuleGSSTmTcFormatCSFormulaField returns [EObject current=null] : iv_ruleGSSTmTcFormatCSFormulaField= ruleGSSTmTcFormatCSFormulaField EOF ;
    public final EObject entryRuleGSSTmTcFormatCSFormulaField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatCSFormulaField = null;


        try {
            // InternalTM_TC_FORMAT.g:866:68: (iv_ruleGSSTmTcFormatCSFormulaField= ruleGSSTmTcFormatCSFormulaField EOF )
            // InternalTM_TC_FORMAT.g:867:2: iv_ruleGSSTmTcFormatCSFormulaField= ruleGSSTmTcFormatCSFormulaField EOF
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
    // InternalTM_TC_FORMAT.g:873:1: ruleGSSTmTcFormatCSFormulaField returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatCSFormulaField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) ( (lv_formula_32_0= ruleGSSTmTcFormatFormula ) ) otherlv_33= '}' otherlv_34= ';' ) ;
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
            // InternalTM_TC_FORMAT.g:879:2: ( (otherlv_0= 'GSSTmTcFormatCSFormulaField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) ( (lv_formula_32_0= ruleGSSTmTcFormatFormula ) ) otherlv_33= '}' otherlv_34= ';' ) )
            // InternalTM_TC_FORMAT.g:880:2: (otherlv_0= 'GSSTmTcFormatCSFormulaField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) ( (lv_formula_32_0= ruleGSSTmTcFormatFormula ) ) otherlv_33= '}' otherlv_34= ';' )
            {
            // InternalTM_TC_FORMAT.g:880:2: (otherlv_0= 'GSSTmTcFormatCSFormulaField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) ( (lv_formula_32_0= ruleGSSTmTcFormatFormula ) ) otherlv_33= '}' otherlv_34= ';' )
            // InternalTM_TC_FORMAT.g:881:3: otherlv_0= 'GSSTmTcFormatCSFormulaField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) ( (lv_formula_32_0= ruleGSSTmTcFormatFormula ) ) otherlv_33= '}' otherlv_34= ';'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getGSSTmTcFormatCSFormulaFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:897:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:898:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:898:4: (lv_fid_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:899:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:928:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:929:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:929:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:930:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalTM_TC_FORMAT.g:959:3: ( (lv_name_12_0= RULE_STRING ) )
            // InternalTM_TC_FORMAT.g:960:4: (lv_name_12_0= RULE_STRING )
            {
            // InternalTM_TC_FORMAT.g:960:4: (lv_name_12_0= RULE_STRING )
            // InternalTM_TC_FORMAT.g:961:5: lv_name_12_0= RULE_STRING
            {
            lv_name_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTmTcFormatCSFormulaFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_12_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_13());
              		
            }
            // InternalTM_TC_FORMAT.g:981:3: (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTM_TC_FORMAT.g:982:4: otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getDescriptionKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalTM_TC_FORMAT.g:990:4: ( (lv_description_16_0= RULE_STRING ) )
                    // InternalTM_TC_FORMAT.g:991:5: (lv_description_16_0= RULE_STRING )
                    {
                    // InternalTM_TC_FORMAT.g:991:5: (lv_description_16_0= RULE_STRING )
                    // InternalTM_TC_FORMAT.g:992:6: lv_description_16_0= RULE_STRING
                    {
                    lv_description_16_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_16_0, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTmTcFormatCSFormulaFieldRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"description",
                      							lv_description_16_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getTypeKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_16());
              		
            }
            // InternalTM_TC_FORMAT.g:1021:3: ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) )
            // InternalTM_TC_FORMAT.g:1022:4: (lv_type_20_0= ruleGSSTmTcFormatFieldType )
            {
            // InternalTM_TC_FORMAT.g:1022:4: (lv_type_20_0= ruleGSSTmTcFormatFieldType )
            // InternalTM_TC_FORMAT.g:1023:5: lv_type_20_0= ruleGSSTmTcFormatFieldType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_18());
              		
            }
            otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getByteOrderKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_20());
              		
            }
            // InternalTM_TC_FORMAT.g:1052:3: ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) )
            // InternalTM_TC_FORMAT.g:1053:4: (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder )
            {
            // InternalTM_TC_FORMAT.g:1053:4: (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder )
            // InternalTM_TC_FORMAT.g:1054:5: lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_22());
              		
            }
            otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFirstBitKeyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_24());
              		
            }
            // InternalTM_TC_FORMAT.g:1083:3: ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) )
            // InternalTM_TC_FORMAT.g:1084:4: (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit )
            {
            // InternalTM_TC_FORMAT.g:1084:4: (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit )
            // InternalTM_TC_FORMAT.g:1085:5: lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSemicolonKeyword_26());
              		
            }
            // InternalTM_TC_FORMAT.g:1106:3: ( (lv_size_30_0= ruleGSSTmTcFormatSize ) )
            // InternalTM_TC_FORMAT.g:1107:4: (lv_size_30_0= ruleGSSTmTcFormatSize )
            {
            // InternalTM_TC_FORMAT.g:1107:4: (lv_size_30_0= ruleGSSTmTcFormatSize )
            // InternalTM_TC_FORMAT.g:1108:5: lv_size_30_0= ruleGSSTmTcFormatSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getSizeGSSTmTcFormatSizeParserRuleCall_27_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
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

            // InternalTM_TC_FORMAT.g:1125:3: ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) )
            // InternalTM_TC_FORMAT.g:1126:4: (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset )
            {
            // InternalTM_TC_FORMAT.g:1126:4: (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset )
            // InternalTM_TC_FORMAT.g:1127:5: lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_28);
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

            // InternalTM_TC_FORMAT.g:1144:3: ( (lv_formula_32_0= ruleGSSTmTcFormatFormula ) )
            // InternalTM_TC_FORMAT.g:1145:4: (lv_formula_32_0= ruleGSSTmTcFormatFormula )
            {
            // InternalTM_TC_FORMAT.g:1145:4: (lv_formula_32_0= ruleGSSTmTcFormatFormula )
            // InternalTM_TC_FORMAT.g:1146:5: lv_formula_32_0= ruleGSSTmTcFormatFormula
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getFormulaGSSTmTcFormatFormulaParserRuleCall_29_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_27);
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

            otherlv_33=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_33, grammarAccess.getGSSTmTcFormatCSFormulaFieldAccess().getRightCurlyBracketKeyword_30());
              		
            }
            otherlv_34=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalTM_TC_FORMAT.g:1175:1: entryRuleGSSTmTcFormatVSField returns [EObject current=null] : iv_ruleGSSTmTcFormatVSField= ruleGSSTmTcFormatVSField EOF ;
    public final EObject entryRuleGSSTmTcFormatVSField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatVSField = null;


        try {
            // InternalTM_TC_FORMAT.g:1175:61: (iv_ruleGSSTmTcFormatVSField= ruleGSSTmTcFormatVSField EOF )
            // InternalTM_TC_FORMAT.g:1176:2: iv_ruleGSSTmTcFormatVSField= ruleGSSTmTcFormatVSField EOF
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
    // InternalTM_TC_FORMAT.g:1182:1: ruleGSSTmTcFormatVSField returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatVSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_constSize_30_0= ruleGSSTmTcFormatConstSize ) ) ( (lv_maxSize_31_0= ruleGSSTmTcFormatMaxSize ) ) ( (lv_variableSize_32_0= ruleGSSTmTcFormatVariableSize ) ) ( (lv_globalOffset_33_0= ruleGSSTmTcFormatGlobalOffset ) ) otherlv_34= '}' otherlv_35= ';' ) ;
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

        EObject lv_maxSize_31_0 = null;

        EObject lv_variableSize_32_0 = null;

        EObject lv_globalOffset_33_0 = null;



        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:1188:2: ( (otherlv_0= 'GSSTmTcFormatVSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_constSize_30_0= ruleGSSTmTcFormatConstSize ) ) ( (lv_maxSize_31_0= ruleGSSTmTcFormatMaxSize ) ) ( (lv_variableSize_32_0= ruleGSSTmTcFormatVariableSize ) ) ( (lv_globalOffset_33_0= ruleGSSTmTcFormatGlobalOffset ) ) otherlv_34= '}' otherlv_35= ';' ) )
            // InternalTM_TC_FORMAT.g:1189:2: (otherlv_0= 'GSSTmTcFormatVSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_constSize_30_0= ruleGSSTmTcFormatConstSize ) ) ( (lv_maxSize_31_0= ruleGSSTmTcFormatMaxSize ) ) ( (lv_variableSize_32_0= ruleGSSTmTcFormatVariableSize ) ) ( (lv_globalOffset_33_0= ruleGSSTmTcFormatGlobalOffset ) ) otherlv_34= '}' otherlv_35= ';' )
            {
            // InternalTM_TC_FORMAT.g:1189:2: (otherlv_0= 'GSSTmTcFormatVSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_constSize_30_0= ruleGSSTmTcFormatConstSize ) ) ( (lv_maxSize_31_0= ruleGSSTmTcFormatMaxSize ) ) ( (lv_variableSize_32_0= ruleGSSTmTcFormatVariableSize ) ) ( (lv_globalOffset_33_0= ruleGSSTmTcFormatGlobalOffset ) ) otherlv_34= '}' otherlv_35= ';' )
            // InternalTM_TC_FORMAT.g:1190:3: otherlv_0= 'GSSTmTcFormatVSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_constSize_30_0= ruleGSSTmTcFormatConstSize ) ) ( (lv_maxSize_31_0= ruleGSSTmTcFormatMaxSize ) ) ( (lv_variableSize_32_0= ruleGSSTmTcFormatVariableSize ) ) ( (lv_globalOffset_33_0= ruleGSSTmTcFormatGlobalOffset ) ) otherlv_34= '}' otherlv_35= ';'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatVSFieldAccess().getGSSTmTcFormatVSFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatVSFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatVSFieldAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:1206:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:1207:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:1207:4: (lv_fid_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:1208:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatVSFieldAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:1237:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:1238:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:1238:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:1239:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatVSFieldAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalTM_TC_FORMAT.g:1268:3: ( (lv_name_12_0= RULE_STRING ) )
            // InternalTM_TC_FORMAT.g:1269:4: (lv_name_12_0= RULE_STRING )
            {
            // InternalTM_TC_FORMAT.g:1269:4: (lv_name_12_0= RULE_STRING )
            // InternalTM_TC_FORMAT.g:1270:5: lv_name_12_0= RULE_STRING
            {
            lv_name_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getGSSTmTcFormatVSFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTmTcFormatVSFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_12_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_13());
              		
            }
            // InternalTM_TC_FORMAT.g:1290:3: (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTM_TC_FORMAT.g:1291:4: otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSTmTcFormatVSFieldAccess().getDescriptionKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalTM_TC_FORMAT.g:1299:4: ( (lv_description_16_0= RULE_STRING ) )
                    // InternalTM_TC_FORMAT.g:1300:5: (lv_description_16_0= RULE_STRING )
                    {
                    // InternalTM_TC_FORMAT.g:1300:5: (lv_description_16_0= RULE_STRING )
                    // InternalTM_TC_FORMAT.g:1301:6: lv_description_16_0= RULE_STRING
                    {
                    lv_description_16_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_16_0, grammarAccess.getGSSTmTcFormatVSFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTmTcFormatVSFieldRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"description",
                      							lv_description_16_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSTmTcFormatVSFieldAccess().getTypeKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_16());
              		
            }
            // InternalTM_TC_FORMAT.g:1330:3: ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) )
            // InternalTM_TC_FORMAT.g:1331:4: (lv_type_20_0= ruleGSSTmTcFormatFieldType )
            {
            // InternalTM_TC_FORMAT.g:1331:4: (lv_type_20_0= ruleGSSTmTcFormatFieldType )
            // InternalTM_TC_FORMAT.g:1332:5: lv_type_20_0= ruleGSSTmTcFormatFieldType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_18());
              		
            }
            otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSTmTcFormatVSFieldAccess().getByteOrderKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_20());
              		
            }
            // InternalTM_TC_FORMAT.g:1361:3: ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) )
            // InternalTM_TC_FORMAT.g:1362:4: (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder )
            {
            // InternalTM_TC_FORMAT.g:1362:4: (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder )
            // InternalTM_TC_FORMAT.g:1363:5: lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_22());
              		
            }
            otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSTmTcFormatVSFieldAccess().getFirstBitKeyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSTmTcFormatVSFieldAccess().getColonEqualsSignKeyword_24());
              		
            }
            // InternalTM_TC_FORMAT.g:1392:3: ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) )
            // InternalTM_TC_FORMAT.g:1393:4: (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit )
            {
            // InternalTM_TC_FORMAT.g:1393:4: (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit )
            // InternalTM_TC_FORMAT.g:1394:5: lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSTmTcFormatVSFieldAccess().getSemicolonKeyword_26());
              		
            }
            // InternalTM_TC_FORMAT.g:1415:3: ( (lv_constSize_30_0= ruleGSSTmTcFormatConstSize ) )
            // InternalTM_TC_FORMAT.g:1416:4: (lv_constSize_30_0= ruleGSSTmTcFormatConstSize )
            {
            // InternalTM_TC_FORMAT.g:1416:4: (lv_constSize_30_0= ruleGSSTmTcFormatConstSize )
            // InternalTM_TC_FORMAT.g:1417:5: lv_constSize_30_0= ruleGSSTmTcFormatConstSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getConstSizeGSSTmTcFormatConstSizeParserRuleCall_27_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_30);
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

            // InternalTM_TC_FORMAT.g:1434:3: ( (lv_maxSize_31_0= ruleGSSTmTcFormatMaxSize ) )
            // InternalTM_TC_FORMAT.g:1435:4: (lv_maxSize_31_0= ruleGSSTmTcFormatMaxSize )
            {
            // InternalTM_TC_FORMAT.g:1435:4: (lv_maxSize_31_0= ruleGSSTmTcFormatMaxSize )
            // InternalTM_TC_FORMAT.g:1436:5: lv_maxSize_31_0= ruleGSSTmTcFormatMaxSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getMaxSizeGSSTmTcFormatMaxSizeParserRuleCall_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_31);
            lv_maxSize_31_0=ruleGSSTmTcFormatMaxSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVSFieldRule());
              					}
              					set(
              						current,
              						"maxSize",
              						lv_maxSize_31_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatMaxSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTM_TC_FORMAT.g:1453:3: ( (lv_variableSize_32_0= ruleGSSTmTcFormatVariableSize ) )
            // InternalTM_TC_FORMAT.g:1454:4: (lv_variableSize_32_0= ruleGSSTmTcFormatVariableSize )
            {
            // InternalTM_TC_FORMAT.g:1454:4: (lv_variableSize_32_0= ruleGSSTmTcFormatVariableSize )
            // InternalTM_TC_FORMAT.g:1455:5: lv_variableSize_32_0= ruleGSSTmTcFormatVariableSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getVariableSizeGSSTmTcFormatVariableSizeParserRuleCall_29_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_variableSize_32_0=ruleGSSTmTcFormatVariableSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVSFieldRule());
              					}
              					set(
              						current,
              						"variableSize",
              						lv_variableSize_32_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatVariableSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTM_TC_FORMAT.g:1472:3: ( (lv_globalOffset_33_0= ruleGSSTmTcFormatGlobalOffset ) )
            // InternalTM_TC_FORMAT.g:1473:4: (lv_globalOffset_33_0= ruleGSSTmTcFormatGlobalOffset )
            {
            // InternalTM_TC_FORMAT.g:1473:4: (lv_globalOffset_33_0= ruleGSSTmTcFormatGlobalOffset )
            // InternalTM_TC_FORMAT.g:1474:5: lv_globalOffset_33_0= ruleGSSTmTcFormatGlobalOffset
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatVSFieldAccess().getGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_30_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_27);
            lv_globalOffset_33_0=ruleGSSTmTcFormatGlobalOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSTmTcFormatVSFieldRule());
              					}
              					set(
              						current,
              						"globalOffset",
              						lv_globalOffset_33_0,
              						"es.uah.aut.srg.gss.lang.tm_tc_format.TM_TC_FORMAT.GSSTmTcFormatGlobalOffset");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_34=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_34, grammarAccess.getGSSTmTcFormatVSFieldAccess().getRightCurlyBracketKeyword_31());
              		
            }
            otherlv_35=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleGSSTmTcFormatVRFieldSize"
    // InternalTM_TC_FORMAT.g:1503:1: entryRuleGSSTmTcFormatVRFieldSize returns [EObject current=null] : iv_ruleGSSTmTcFormatVRFieldSize= ruleGSSTmTcFormatVRFieldSize EOF ;
    public final EObject entryRuleGSSTmTcFormatVRFieldSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatVRFieldSize = null;


        try {
            // InternalTM_TC_FORMAT.g:1503:65: (iv_ruleGSSTmTcFormatVRFieldSize= ruleGSSTmTcFormatVRFieldSize EOF )
            // InternalTM_TC_FORMAT.g:1504:2: iv_ruleGSSTmTcFormatVRFieldSize= ruleGSSTmTcFormatVRFieldSize EOF
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
    // InternalTM_TC_FORMAT.g:1510:1: ruleGSSTmTcFormatVRFieldSize returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatVRFieldSize' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) ;
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
            // InternalTM_TC_FORMAT.g:1516:2: ( (otherlv_0= 'GSSTmTcFormatVRFieldSize' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) )
            // InternalTM_TC_FORMAT.g:1517:2: (otherlv_0= 'GSSTmTcFormatVRFieldSize' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            {
            // InternalTM_TC_FORMAT.g:1517:2: (otherlv_0= 'GSSTmTcFormatVRFieldSize' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            // InternalTM_TC_FORMAT.g:1518:3: otherlv_0= 'GSSTmTcFormatVRFieldSize' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getGSSTmTcFormatVRFieldSizeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:1534:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:1535:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:1535:4: (lv_fid_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:1536:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:1565:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:1566:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:1566:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:1567:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalTM_TC_FORMAT.g:1596:3: ( (lv_name_12_0= RULE_STRING ) )
            // InternalTM_TC_FORMAT.g:1597:4: (lv_name_12_0= RULE_STRING )
            {
            // InternalTM_TC_FORMAT.g:1597:4: (lv_name_12_0= RULE_STRING )
            // InternalTM_TC_FORMAT.g:1598:5: lv_name_12_0= RULE_STRING
            {
            lv_name_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getNameSTRINGTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTmTcFormatVRFieldSizeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_12_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSTmTcFormatVRFieldSizeAccess().getRightCurlyBracketKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleGSSTmTcFormatFDICField"
    // InternalTM_TC_FORMAT.g:1630:1: entryRuleGSSTmTcFormatFDICField returns [EObject current=null] : iv_ruleGSSTmTcFormatFDICField= ruleGSSTmTcFormatFDICField EOF ;
    public final EObject entryRuleGSSTmTcFormatFDICField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatFDICField = null;


        try {
            // InternalTM_TC_FORMAT.g:1630:63: (iv_ruleGSSTmTcFormatFDICField= ruleGSSTmTcFormatFDICField EOF )
            // InternalTM_TC_FORMAT.g:1631:2: iv_ruleGSSTmTcFormatFDICField= ruleGSSTmTcFormatFDICField EOF
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
    // InternalTM_TC_FORMAT.g:1637:1: ruleGSSTmTcFormatFDICField returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatFDICField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'checkType' otherlv_19= ':=' ( (lv_checkType_20_0= ruleGSSTmTcFormatCheckType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_floatingOffset_31_0= ruleGSSTmTcFormatFloatingOffset ) ) ( (lv_sortedFieldsToCheck_32_0= ruleGSSTmTcFormatSortedFieldsToCheck ) ) otherlv_33= '}' otherlv_34= ';' ) ;
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
            // InternalTM_TC_FORMAT.g:1643:2: ( (otherlv_0= 'GSSTmTcFormatFDICField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'checkType' otherlv_19= ':=' ( (lv_checkType_20_0= ruleGSSTmTcFormatCheckType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_floatingOffset_31_0= ruleGSSTmTcFormatFloatingOffset ) ) ( (lv_sortedFieldsToCheck_32_0= ruleGSSTmTcFormatSortedFieldsToCheck ) ) otherlv_33= '}' otherlv_34= ';' ) )
            // InternalTM_TC_FORMAT.g:1644:2: (otherlv_0= 'GSSTmTcFormatFDICField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'checkType' otherlv_19= ':=' ( (lv_checkType_20_0= ruleGSSTmTcFormatCheckType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_floatingOffset_31_0= ruleGSSTmTcFormatFloatingOffset ) ) ( (lv_sortedFieldsToCheck_32_0= ruleGSSTmTcFormatSortedFieldsToCheck ) ) otherlv_33= '}' otherlv_34= ';' )
            {
            // InternalTM_TC_FORMAT.g:1644:2: (otherlv_0= 'GSSTmTcFormatFDICField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'checkType' otherlv_19= ':=' ( (lv_checkType_20_0= ruleGSSTmTcFormatCheckType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_floatingOffset_31_0= ruleGSSTmTcFormatFloatingOffset ) ) ( (lv_sortedFieldsToCheck_32_0= ruleGSSTmTcFormatSortedFieldsToCheck ) ) otherlv_33= '}' otherlv_34= ';' )
            // InternalTM_TC_FORMAT.g:1645:3: otherlv_0= 'GSSTmTcFormatFDICField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'checkType' otherlv_19= ':=' ( (lv_checkType_20_0= ruleGSSTmTcFormatCheckType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_floatingOffset_31_0= ruleGSSTmTcFormatFloatingOffset ) ) ( (lv_sortedFieldsToCheck_32_0= ruleGSSTmTcFormatSortedFieldsToCheck ) ) otherlv_33= '}' otherlv_34= ';'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getGSSTmTcFormatFDICFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:1661:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:1662:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:1662:4: (lv_fid_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:1663:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:1692:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:1693:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:1693:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:1694:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalTM_TC_FORMAT.g:1723:3: ( (lv_name_12_0= RULE_STRING ) )
            // InternalTM_TC_FORMAT.g:1724:4: (lv_name_12_0= RULE_STRING )
            {
            // InternalTM_TC_FORMAT.g:1724:4: (lv_name_12_0= RULE_STRING )
            // InternalTM_TC_FORMAT.g:1725:5: lv_name_12_0= RULE_STRING
            {
            lv_name_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTmTcFormatFDICFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_12_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_13());
              		
            }
            // InternalTM_TC_FORMAT.g:1745:3: (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTM_TC_FORMAT.g:1746:4: otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getDescriptionKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalTM_TC_FORMAT.g:1754:4: ( (lv_description_16_0= RULE_STRING ) )
                    // InternalTM_TC_FORMAT.g:1755:5: (lv_description_16_0= RULE_STRING )
                    {
                    // InternalTM_TC_FORMAT.g:1755:5: (lv_description_16_0= RULE_STRING )
                    // InternalTM_TC_FORMAT.g:1756:6: lv_description_16_0= RULE_STRING
                    {
                    lv_description_16_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_16_0, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTmTcFormatFDICFieldRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"description",
                      							lv_description_16_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,33,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getCheckTypeKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_16());
              		
            }
            // InternalTM_TC_FORMAT.g:1785:3: ( (lv_checkType_20_0= ruleGSSTmTcFormatCheckType ) )
            // InternalTM_TC_FORMAT.g:1786:4: (lv_checkType_20_0= ruleGSSTmTcFormatCheckType )
            {
            // InternalTM_TC_FORMAT.g:1786:4: (lv_checkType_20_0= ruleGSSTmTcFormatCheckType )
            // InternalTM_TC_FORMAT.g:1787:5: lv_checkType_20_0= ruleGSSTmTcFormatCheckType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getCheckTypeGSSTmTcFormatCheckTypeEnumRuleCall_17_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_18());
              		
            }
            otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getByteOrderKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_20());
              		
            }
            // InternalTM_TC_FORMAT.g:1816:3: ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) )
            // InternalTM_TC_FORMAT.g:1817:4: (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder )
            {
            // InternalTM_TC_FORMAT.g:1817:4: (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder )
            // InternalTM_TC_FORMAT.g:1818:5: lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_22());
              		
            }
            otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFirstBitKeyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getColonEqualsSignKeyword_24());
              		
            }
            // InternalTM_TC_FORMAT.g:1847:3: ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) )
            // InternalTM_TC_FORMAT.g:1848:4: (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit )
            {
            // InternalTM_TC_FORMAT.g:1848:4: (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit )
            // InternalTM_TC_FORMAT.g:1849:5: lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSemicolonKeyword_26());
              		
            }
            // InternalTM_TC_FORMAT.g:1870:3: ( (lv_size_30_0= ruleGSSTmTcFormatSize ) )
            // InternalTM_TC_FORMAT.g:1871:4: (lv_size_30_0= ruleGSSTmTcFormatSize )
            {
            // InternalTM_TC_FORMAT.g:1871:4: (lv_size_30_0= ruleGSSTmTcFormatSize )
            // InternalTM_TC_FORMAT.g:1872:5: lv_size_30_0= ruleGSSTmTcFormatSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSizeGSSTmTcFormatSizeParserRuleCall_27_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_35);
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

            // InternalTM_TC_FORMAT.g:1889:3: ( (lv_floatingOffset_31_0= ruleGSSTmTcFormatFloatingOffset ) )
            // InternalTM_TC_FORMAT.g:1890:4: (lv_floatingOffset_31_0= ruleGSSTmTcFormatFloatingOffset )
            {
            // InternalTM_TC_FORMAT.g:1890:4: (lv_floatingOffset_31_0= ruleGSSTmTcFormatFloatingOffset )
            // InternalTM_TC_FORMAT.g:1891:5: lv_floatingOffset_31_0= ruleGSSTmTcFormatFloatingOffset
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getFloatingOffsetGSSTmTcFormatFloatingOffsetParserRuleCall_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_36);
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

            // InternalTM_TC_FORMAT.g:1908:3: ( (lv_sortedFieldsToCheck_32_0= ruleGSSTmTcFormatSortedFieldsToCheck ) )
            // InternalTM_TC_FORMAT.g:1909:4: (lv_sortedFieldsToCheck_32_0= ruleGSSTmTcFormatSortedFieldsToCheck )
            {
            // InternalTM_TC_FORMAT.g:1909:4: (lv_sortedFieldsToCheck_32_0= ruleGSSTmTcFormatSortedFieldsToCheck )
            // InternalTM_TC_FORMAT.g:1910:5: lv_sortedFieldsToCheck_32_0= ruleGSSTmTcFormatSortedFieldsToCheck
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatFDICFieldAccess().getSortedFieldsToCheckGSSTmTcFormatSortedFieldsToCheckParserRuleCall_29_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_27);
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

            otherlv_33=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_33, grammarAccess.getGSSTmTcFormatFDICFieldAccess().getRightCurlyBracketKeyword_30());
              		
            }
            otherlv_34=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleGSSTmTcFormatAField"
    // InternalTM_TC_FORMAT.g:1939:1: entryRuleGSSTmTcFormatAField returns [EObject current=null] : iv_ruleGSSTmTcFormatAField= ruleGSSTmTcFormatAField EOF ;
    public final EObject entryRuleGSSTmTcFormatAField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatAField = null;


        try {
            // InternalTM_TC_FORMAT.g:1939:60: (iv_ruleGSSTmTcFormatAField= ruleGSSTmTcFormatAField EOF )
            // InternalTM_TC_FORMAT.g:1940:2: iv_ruleGSSTmTcFormatAField= ruleGSSTmTcFormatAField EOF
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
    // InternalTM_TC_FORMAT.g:1946:1: ruleGSSTmTcFormatAField returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatAField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) ( (lv_arrayDimension_32_0= ruleGSSTmTcFormatArrayDimension ) ) otherlv_33= '}' otherlv_34= ';' ) ;
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
            // InternalTM_TC_FORMAT.g:1952:2: ( (otherlv_0= 'GSSTmTcFormatAField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) ( (lv_arrayDimension_32_0= ruleGSSTmTcFormatArrayDimension ) ) otherlv_33= '}' otherlv_34= ';' ) )
            // InternalTM_TC_FORMAT.g:1953:2: (otherlv_0= 'GSSTmTcFormatAField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) ( (lv_arrayDimension_32_0= ruleGSSTmTcFormatArrayDimension ) ) otherlv_33= '}' otherlv_34= ';' )
            {
            // InternalTM_TC_FORMAT.g:1953:2: (otherlv_0= 'GSSTmTcFormatAField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) ( (lv_arrayDimension_32_0= ruleGSSTmTcFormatArrayDimension ) ) otherlv_33= '}' otherlv_34= ';' )
            // InternalTM_TC_FORMAT.g:1954:3: otherlv_0= 'GSSTmTcFormatAField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) ) ( (lv_arrayDimension_32_0= ruleGSSTmTcFormatArrayDimension ) ) otherlv_33= '}' otherlv_34= ';'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatAFieldAccess().getGSSTmTcFormatAFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatAFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatAFieldAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:1970:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:1971:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:1971:4: (lv_fid_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:1972:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAFieldAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatAFieldAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:2001:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:2002:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:2002:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:2003:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAFieldAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatAFieldAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalTM_TC_FORMAT.g:2032:3: ( (lv_name_12_0= RULE_STRING ) )
            // InternalTM_TC_FORMAT.g:2033:4: (lv_name_12_0= RULE_STRING )
            {
            // InternalTM_TC_FORMAT.g:2033:4: (lv_name_12_0= RULE_STRING )
            // InternalTM_TC_FORMAT.g:2034:5: lv_name_12_0= RULE_STRING
            {
            lv_name_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getGSSTmTcFormatAFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTmTcFormatAFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_12_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_13());
              		
            }
            // InternalTM_TC_FORMAT.g:2054:3: (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTM_TC_FORMAT.g:2055:4: otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSTmTcFormatAFieldAccess().getDescriptionKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalTM_TC_FORMAT.g:2063:4: ( (lv_description_16_0= RULE_STRING ) )
                    // InternalTM_TC_FORMAT.g:2064:5: (lv_description_16_0= RULE_STRING )
                    {
                    // InternalTM_TC_FORMAT.g:2064:5: (lv_description_16_0= RULE_STRING )
                    // InternalTM_TC_FORMAT.g:2065:6: lv_description_16_0= RULE_STRING
                    {
                    lv_description_16_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_16_0, grammarAccess.getGSSTmTcFormatAFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTmTcFormatAFieldRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"description",
                      							lv_description_16_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSTmTcFormatAFieldAccess().getTypeKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_16());
              		
            }
            // InternalTM_TC_FORMAT.g:2094:3: ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) )
            // InternalTM_TC_FORMAT.g:2095:4: (lv_type_20_0= ruleGSSTmTcFormatFieldType )
            {
            // InternalTM_TC_FORMAT.g:2095:4: (lv_type_20_0= ruleGSSTmTcFormatFieldType )
            // InternalTM_TC_FORMAT.g:2096:5: lv_type_20_0= ruleGSSTmTcFormatFieldType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAFieldAccess().getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_18());
              		
            }
            otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSTmTcFormatAFieldAccess().getByteOrderKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_20());
              		
            }
            // InternalTM_TC_FORMAT.g:2125:3: ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) )
            // InternalTM_TC_FORMAT.g:2126:4: (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder )
            {
            // InternalTM_TC_FORMAT.g:2126:4: (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder )
            // InternalTM_TC_FORMAT.g:2127:5: lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_22());
              		
            }
            otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSTmTcFormatAFieldAccess().getFirstBitKeyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSTmTcFormatAFieldAccess().getColonEqualsSignKeyword_24());
              		
            }
            // InternalTM_TC_FORMAT.g:2156:3: ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) )
            // InternalTM_TC_FORMAT.g:2157:4: (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit )
            {
            // InternalTM_TC_FORMAT.g:2157:4: (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit )
            // InternalTM_TC_FORMAT.g:2158:5: lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSTmTcFormatAFieldAccess().getSemicolonKeyword_26());
              		
            }
            // InternalTM_TC_FORMAT.g:2179:3: ( (lv_size_30_0= ruleGSSTmTcFormatSize ) )
            // InternalTM_TC_FORMAT.g:2180:4: (lv_size_30_0= ruleGSSTmTcFormatSize )
            {
            // InternalTM_TC_FORMAT.g:2180:4: (lv_size_30_0= ruleGSSTmTcFormatSize )
            // InternalTM_TC_FORMAT.g:2181:5: lv_size_30_0= ruleGSSTmTcFormatSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAFieldAccess().getSizeGSSTmTcFormatSizeParserRuleCall_27_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
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

            // InternalTM_TC_FORMAT.g:2198:3: ( (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset ) )
            // InternalTM_TC_FORMAT.g:2199:4: (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset )
            {
            // InternalTM_TC_FORMAT.g:2199:4: (lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset )
            // InternalTM_TC_FORMAT.g:2200:5: lv_globalOffset_31_0= ruleGSSTmTcFormatGlobalOffset
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAFieldAccess().getGlobalOffsetGSSTmTcFormatGlobalOffsetParserRuleCall_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_37);
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

            // InternalTM_TC_FORMAT.g:2217:3: ( (lv_arrayDimension_32_0= ruleGSSTmTcFormatArrayDimension ) )
            // InternalTM_TC_FORMAT.g:2218:4: (lv_arrayDimension_32_0= ruleGSSTmTcFormatArrayDimension )
            {
            // InternalTM_TC_FORMAT.g:2218:4: (lv_arrayDimension_32_0= ruleGSSTmTcFormatArrayDimension )
            // InternalTM_TC_FORMAT.g:2219:5: lv_arrayDimension_32_0= ruleGSSTmTcFormatArrayDimension
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAFieldAccess().getArrayDimensionGSSTmTcFormatArrayDimensionParserRuleCall_29_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_27);
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

            otherlv_33=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_33, grammarAccess.getGSSTmTcFormatAFieldAccess().getRightCurlyBracketKeyword_30());
              		
            }
            otherlv_34=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalTM_TC_FORMAT.g:2248:1: entryRuleGSSTmTcFormatAIField returns [EObject current=null] : iv_ruleGSSTmTcFormatAIField= ruleGSSTmTcFormatAIField EOF ;
    public final EObject entryRuleGSSTmTcFormatAIField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatAIField = null;


        try {
            // InternalTM_TC_FORMAT.g:2248:61: (iv_ruleGSSTmTcFormatAIField= ruleGSSTmTcFormatAIField EOF )
            // InternalTM_TC_FORMAT.g:2249:2: iv_ruleGSSTmTcFormatAIField= ruleGSSTmTcFormatAIField EOF
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
    // InternalTM_TC_FORMAT.g:2255:1: ruleGSSTmTcFormatAIField returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatAIField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_localOffset_31_0= ruleGSSTmTcFormatLocalOffset ) ) ( (lv_arrayRef_32_0= ruleGSSTmTcFormatArrayRef ) ) otherlv_33= '}' otherlv_34= ';' ) ;
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
            // InternalTM_TC_FORMAT.g:2261:2: ( (otherlv_0= 'GSSTmTcFormatAIField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_localOffset_31_0= ruleGSSTmTcFormatLocalOffset ) ) ( (lv_arrayRef_32_0= ruleGSSTmTcFormatArrayRef ) ) otherlv_33= '}' otherlv_34= ';' ) )
            // InternalTM_TC_FORMAT.g:2262:2: (otherlv_0= 'GSSTmTcFormatAIField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_localOffset_31_0= ruleGSSTmTcFormatLocalOffset ) ) ( (lv_arrayRef_32_0= ruleGSSTmTcFormatArrayRef ) ) otherlv_33= '}' otherlv_34= ';' )
            {
            // InternalTM_TC_FORMAT.g:2262:2: (otherlv_0= 'GSSTmTcFormatAIField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_localOffset_31_0= ruleGSSTmTcFormatLocalOffset ) ) ( (lv_arrayRef_32_0= ruleGSSTmTcFormatArrayRef ) ) otherlv_33= '}' otherlv_34= ';' )
            // InternalTM_TC_FORMAT.g:2263:3: otherlv_0= 'GSSTmTcFormatAIField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSTmTcFormatSize ) ) ( (lv_localOffset_31_0= ruleGSSTmTcFormatLocalOffset ) ) ( (lv_arrayRef_32_0= ruleGSSTmTcFormatArrayRef ) ) otherlv_33= '}' otherlv_34= ';'
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatAIFieldAccess().getGSSTmTcFormatAIFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatAIFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatAIFieldAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:2279:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:2280:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:2280:4: (lv_fid_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:2281:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAIFieldAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatAIFieldAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:2310:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:2311:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:2311:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:2312:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAIFieldAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatAIFieldAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalTM_TC_FORMAT.g:2341:3: ( (lv_name_12_0= RULE_STRING ) )
            // InternalTM_TC_FORMAT.g:2342:4: (lv_name_12_0= RULE_STRING )
            {
            // InternalTM_TC_FORMAT.g:2342:4: (lv_name_12_0= RULE_STRING )
            // InternalTM_TC_FORMAT.g:2343:5: lv_name_12_0= RULE_STRING
            {
            lv_name_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getGSSTmTcFormatAIFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTmTcFormatAIFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_12_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_13());
              		
            }
            // InternalTM_TC_FORMAT.g:2363:3: (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTM_TC_FORMAT.g:2364:4: otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSTmTcFormatAIFieldAccess().getDescriptionKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalTM_TC_FORMAT.g:2372:4: ( (lv_description_16_0= RULE_STRING ) )
                    // InternalTM_TC_FORMAT.g:2373:5: (lv_description_16_0= RULE_STRING )
                    {
                    // InternalTM_TC_FORMAT.g:2373:5: (lv_description_16_0= RULE_STRING )
                    // InternalTM_TC_FORMAT.g:2374:6: lv_description_16_0= RULE_STRING
                    {
                    lv_description_16_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_16_0, grammarAccess.getGSSTmTcFormatAIFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTmTcFormatAIFieldRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"description",
                      							lv_description_16_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSTmTcFormatAIFieldAccess().getTypeKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_16());
              		
            }
            // InternalTM_TC_FORMAT.g:2403:3: ( (lv_type_20_0= ruleGSSTmTcFormatFieldType ) )
            // InternalTM_TC_FORMAT.g:2404:4: (lv_type_20_0= ruleGSSTmTcFormatFieldType )
            {
            // InternalTM_TC_FORMAT.g:2404:4: (lv_type_20_0= ruleGSSTmTcFormatFieldType )
            // InternalTM_TC_FORMAT.g:2405:5: lv_type_20_0= ruleGSSTmTcFormatFieldType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAIFieldAccess().getTypeGSSTmTcFormatFieldTypeEnumRuleCall_17_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_18());
              		
            }
            otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSTmTcFormatAIFieldAccess().getByteOrderKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_20());
              		
            }
            // InternalTM_TC_FORMAT.g:2434:3: ( (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder ) )
            // InternalTM_TC_FORMAT.g:2435:4: (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder )
            {
            // InternalTM_TC_FORMAT.g:2435:4: (lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder )
            // InternalTM_TC_FORMAT.g:2436:5: lv_byteOrder_24_0= ruleGSSTmTcFormatFieldByteOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAIFieldAccess().getByteOrderGSSTmTcFormatFieldByteOrderEnumRuleCall_21_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_22());
              		
            }
            otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSTmTcFormatAIFieldAccess().getFirstBitKeyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSTmTcFormatAIFieldAccess().getColonEqualsSignKeyword_24());
              		
            }
            // InternalTM_TC_FORMAT.g:2465:3: ( (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit ) )
            // InternalTM_TC_FORMAT.g:2466:4: (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit )
            {
            // InternalTM_TC_FORMAT.g:2466:4: (lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit )
            // InternalTM_TC_FORMAT.g:2467:5: lv_firstBit_28_0= ruleGSSTmTcFormatSFieldFirstBit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAIFieldAccess().getFirstBitGSSTmTcFormatSFieldFirstBitEnumRuleCall_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSTmTcFormatAIFieldAccess().getSemicolonKeyword_26());
              		
            }
            // InternalTM_TC_FORMAT.g:2488:3: ( (lv_size_30_0= ruleGSSTmTcFormatSize ) )
            // InternalTM_TC_FORMAT.g:2489:4: (lv_size_30_0= ruleGSSTmTcFormatSize )
            {
            // InternalTM_TC_FORMAT.g:2489:4: (lv_size_30_0= ruleGSSTmTcFormatSize )
            // InternalTM_TC_FORMAT.g:2490:5: lv_size_30_0= ruleGSSTmTcFormatSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAIFieldAccess().getSizeGSSTmTcFormatSizeParserRuleCall_27_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_38);
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

            // InternalTM_TC_FORMAT.g:2507:3: ( (lv_localOffset_31_0= ruleGSSTmTcFormatLocalOffset ) )
            // InternalTM_TC_FORMAT.g:2508:4: (lv_localOffset_31_0= ruleGSSTmTcFormatLocalOffset )
            {
            // InternalTM_TC_FORMAT.g:2508:4: (lv_localOffset_31_0= ruleGSSTmTcFormatLocalOffset )
            // InternalTM_TC_FORMAT.g:2509:5: lv_localOffset_31_0= ruleGSSTmTcFormatLocalOffset
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAIFieldAccess().getLocalOffsetGSSTmTcFormatLocalOffsetParserRuleCall_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_39);
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

            // InternalTM_TC_FORMAT.g:2526:3: ( (lv_arrayRef_32_0= ruleGSSTmTcFormatArrayRef ) )
            // InternalTM_TC_FORMAT.g:2527:4: (lv_arrayRef_32_0= ruleGSSTmTcFormatArrayRef )
            {
            // InternalTM_TC_FORMAT.g:2527:4: (lv_arrayRef_32_0= ruleGSSTmTcFormatArrayRef )
            // InternalTM_TC_FORMAT.g:2528:5: lv_arrayRef_32_0= ruleGSSTmTcFormatArrayRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatAIFieldAccess().getArrayRefGSSTmTcFormatArrayRefParserRuleCall_29_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_27);
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

            otherlv_33=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_33, grammarAccess.getGSSTmTcFormatAIFieldAccess().getRightCurlyBracketKeyword_30());
              		
            }
            otherlv_34=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalTM_TC_FORMAT.g:2557:1: entryRuleGSSTmTcFormatSize returns [EObject current=null] : iv_ruleGSSTmTcFormatSize= ruleGSSTmTcFormatSize EOF ;
    public final EObject entryRuleGSSTmTcFormatSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatSize = null;


        try {
            // InternalTM_TC_FORMAT.g:2557:58: (iv_ruleGSSTmTcFormatSize= ruleGSSTmTcFormatSize EOF )
            // InternalTM_TC_FORMAT.g:2558:2: iv_ruleGSSTmTcFormatSize= ruleGSSTmTcFormatSize EOF
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
    // InternalTM_TC_FORMAT.g:2564:1: ruleGSSTmTcFormatSize returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
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
            // InternalTM_TC_FORMAT.g:2570:2: ( (otherlv_0= 'GSSTmTcFormatSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalTM_TC_FORMAT.g:2571:2: (otherlv_0= 'GSSTmTcFormatSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalTM_TC_FORMAT.g:2571:2: (otherlv_0= 'GSSTmTcFormatSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalTM_TC_FORMAT.g:2572:3: otherlv_0= 'GSSTmTcFormatSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatSizeAccess().getGSSTmTcFormatSizeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatSizeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatSizeAccess().getBytesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatSizeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:2588:3: ( (lv_bytes_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:2589:4: (lv_bytes_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:2589:4: (lv_bytes_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:2590:5: lv_bytes_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatSizeAccess().getBytesINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatSizeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatSizeAccess().getBitsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatSizeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:2619:3: ( (lv_bits_8_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:2620:4: (lv_bits_8_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:2620:4: (lv_bits_8_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:2621:5: lv_bits_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatSizeAccess().getBitsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatSizeAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatSizeAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalTM_TC_FORMAT.g:2654:1: entryRuleGSSTmTcFormatGlobalOffset returns [EObject current=null] : iv_ruleGSSTmTcFormatGlobalOffset= ruleGSSTmTcFormatGlobalOffset EOF ;
    public final EObject entryRuleGSSTmTcFormatGlobalOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatGlobalOffset = null;


        try {
            // InternalTM_TC_FORMAT.g:2654:66: (iv_ruleGSSTmTcFormatGlobalOffset= ruleGSSTmTcFormatGlobalOffset EOF )
            // InternalTM_TC_FORMAT.g:2655:2: iv_ruleGSSTmTcFormatGlobalOffset= ruleGSSTmTcFormatGlobalOffset EOF
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
    // InternalTM_TC_FORMAT.g:2661:1: ruleGSSTmTcFormatGlobalOffset returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatGlobalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
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
            // InternalTM_TC_FORMAT.g:2667:2: ( (otherlv_0= 'GSSTmTcFormatGlobalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalTM_TC_FORMAT.g:2668:2: (otherlv_0= 'GSSTmTcFormatGlobalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalTM_TC_FORMAT.g:2668:2: (otherlv_0= 'GSSTmTcFormatGlobalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalTM_TC_FORMAT.g:2669:3: otherlv_0= 'GSSTmTcFormatGlobalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getGSSTmTcFormatGlobalOffsetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBytesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:2685:3: ( (lv_bytes_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:2686:4: (lv_bytes_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:2686:4: (lv_bytes_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:2687:5: lv_bytes_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBytesINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBitsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:2716:3: ( (lv_bits_8_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:2717:4: (lv_bits_8_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:2717:4: (lv_bits_8_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:2718:5: lv_bits_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getBitsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatGlobalOffsetAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalTM_TC_FORMAT.g:2751:1: entryRuleGSSTmTcFormatFormula returns [EObject current=null] : iv_ruleGSSTmTcFormatFormula= ruleGSSTmTcFormatFormula EOF ;
    public final EObject entryRuleGSSTmTcFormatFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatFormula = null;


        try {
            // InternalTM_TC_FORMAT.g:2751:61: (iv_ruleGSSTmTcFormatFormula= ruleGSSTmTcFormatFormula EOF )
            // InternalTM_TC_FORMAT.g:2752:2: iv_ruleGSSTmTcFormatFormula= ruleGSSTmTcFormatFormula EOF
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
    // InternalTM_TC_FORMAT.g:2758:1: ruleGSSTmTcFormatFormula returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatFormula' otherlv_1= '{' otherlv_2= 'slope' otherlv_3= ':=' ( (lv_slope_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'intercept' otherlv_7= ':=' ( (lv_intercept_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSTmTcFormatFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_slope_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_intercept_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:2764:2: ( (otherlv_0= 'GSSTmTcFormatFormula' otherlv_1= '{' otherlv_2= 'slope' otherlv_3= ':=' ( (lv_slope_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'intercept' otherlv_7= ':=' ( (lv_intercept_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalTM_TC_FORMAT.g:2765:2: (otherlv_0= 'GSSTmTcFormatFormula' otherlv_1= '{' otherlv_2= 'slope' otherlv_3= ':=' ( (lv_slope_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'intercept' otherlv_7= ':=' ( (lv_intercept_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalTM_TC_FORMAT.g:2765:2: (otherlv_0= 'GSSTmTcFormatFormula' otherlv_1= '{' otherlv_2= 'slope' otherlv_3= ':=' ( (lv_slope_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'intercept' otherlv_7= ':=' ( (lv_intercept_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalTM_TC_FORMAT.g:2766:3: otherlv_0= 'GSSTmTcFormatFormula' otherlv_1= '{' otherlv_2= 'slope' otherlv_3= ':=' ( (lv_slope_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'intercept' otherlv_7= ':=' ( (lv_intercept_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatFormulaAccess().getGSSTmTcFormatFormulaKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatFormulaAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,41,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatFormulaAccess().getSlopeKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatFormulaAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:2782:3: ( (lv_slope_4_0= RULE_STRING ) )
            // InternalTM_TC_FORMAT.g:2783:4: (lv_slope_4_0= RULE_STRING )
            {
            // InternalTM_TC_FORMAT.g:2783:4: (lv_slope_4_0= RULE_STRING )
            // InternalTM_TC_FORMAT.g:2784:5: lv_slope_4_0= RULE_STRING
            {
            lv_slope_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_slope_4_0, grammarAccess.getGSSTmTcFormatFormulaAccess().getSlopeSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTmTcFormatFormulaRule());
              					}
              					setWithLastConsumed(
              						current,
              						"slope",
              						lv_slope_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatFormulaAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,42,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatFormulaAccess().getInterceptKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatFormulaAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:2812:3: ( (lv_intercept_8_0= RULE_STRING ) )
            // InternalTM_TC_FORMAT.g:2813:4: (lv_intercept_8_0= RULE_STRING )
            {
            // InternalTM_TC_FORMAT.g:2813:4: (lv_intercept_8_0= RULE_STRING )
            // InternalTM_TC_FORMAT.g:2814:5: lv_intercept_8_0= RULE_STRING
            {
            lv_intercept_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_intercept_8_0, grammarAccess.getGSSTmTcFormatFormulaAccess().getInterceptSTRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTmTcFormatFormulaRule());
              					}
              					setWithLastConsumed(
              						current,
              						"intercept",
              						lv_intercept_8_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatFormulaAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatFormulaAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalTM_TC_FORMAT.g:2846:1: entryRuleGSSTmTcFormatConstSize returns [EObject current=null] : iv_ruleGSSTmTcFormatConstSize= ruleGSSTmTcFormatConstSize EOF ;
    public final EObject entryRuleGSSTmTcFormatConstSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatConstSize = null;


        try {
            // InternalTM_TC_FORMAT.g:2846:63: (iv_ruleGSSTmTcFormatConstSize= ruleGSSTmTcFormatConstSize EOF )
            // InternalTM_TC_FORMAT.g:2847:2: iv_ruleGSSTmTcFormatConstSize= ruleGSSTmTcFormatConstSize EOF
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
    // InternalTM_TC_FORMAT.g:2853:1: ruleGSSTmTcFormatConstSize returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatConstSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
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
            // InternalTM_TC_FORMAT.g:2859:2: ( (otherlv_0= 'GSSTmTcFormatConstSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalTM_TC_FORMAT.g:2860:2: (otherlv_0= 'GSSTmTcFormatConstSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalTM_TC_FORMAT.g:2860:2: (otherlv_0= 'GSSTmTcFormatConstSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalTM_TC_FORMAT.g:2861:3: otherlv_0= 'GSSTmTcFormatConstSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatConstSizeAccess().getGSSTmTcFormatConstSizeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatConstSizeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatConstSizeAccess().getBytesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatConstSizeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:2877:3: ( (lv_bytes_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:2878:4: (lv_bytes_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:2878:4: (lv_bytes_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:2879:5: lv_bytes_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatConstSizeAccess().getBytesINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatConstSizeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatConstSizeAccess().getBitsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatConstSizeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:2908:3: ( (lv_bits_8_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:2909:4: (lv_bits_8_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:2909:4: (lv_bits_8_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:2910:5: lv_bits_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatConstSizeAccess().getBitsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatConstSizeAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatConstSizeAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalTM_TC_FORMAT.g:2943:1: entryRuleGSSTmTcFormatMaxSize returns [EObject current=null] : iv_ruleGSSTmTcFormatMaxSize= ruleGSSTmTcFormatMaxSize EOF ;
    public final EObject entryRuleGSSTmTcFormatMaxSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatMaxSize = null;


        try {
            // InternalTM_TC_FORMAT.g:2943:61: (iv_ruleGSSTmTcFormatMaxSize= ruleGSSTmTcFormatMaxSize EOF )
            // InternalTM_TC_FORMAT.g:2944:2: iv_ruleGSSTmTcFormatMaxSize= ruleGSSTmTcFormatMaxSize EOF
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
    // InternalTM_TC_FORMAT.g:2950:1: ruleGSSTmTcFormatMaxSize returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatMaxSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
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
            // InternalTM_TC_FORMAT.g:2956:2: ( (otherlv_0= 'GSSTmTcFormatMaxSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalTM_TC_FORMAT.g:2957:2: (otherlv_0= 'GSSTmTcFormatMaxSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalTM_TC_FORMAT.g:2957:2: (otherlv_0= 'GSSTmTcFormatMaxSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalTM_TC_FORMAT.g:2958:3: otherlv_0= 'GSSTmTcFormatMaxSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getGSSTmTcFormatMaxSizeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBytesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:2974:3: ( (lv_bytes_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:2975:4: (lv_bytes_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:2975:4: (lv_bytes_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:2976:5: lv_bytes_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBytesINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBitsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:3005:3: ( (lv_bits_8_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:3006:4: (lv_bits_8_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:3006:4: (lv_bits_8_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:3007:5: lv_bits_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatMaxSizeAccess().getBitsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatMaxSizeAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalTM_TC_FORMAT.g:3040:1: entryRuleGSSTmTcFormatVariableSize returns [EObject current=null] : iv_ruleGSSTmTcFormatVariableSize= ruleGSSTmTcFormatVariableSize EOF ;
    public final EObject entryRuleGSSTmTcFormatVariableSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatVariableSize = null;


        try {
            // InternalTM_TC_FORMAT.g:3040:66: (iv_ruleGSSTmTcFormatVariableSize= ruleGSSTmTcFormatVariableSize EOF )
            // InternalTM_TC_FORMAT.g:3041:2: iv_ruleGSSTmTcFormatVariableSize= ruleGSSTmTcFormatVariableSize EOF
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
    // InternalTM_TC_FORMAT.g:3047:1: ruleGSSTmTcFormatVariableSize returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatVariableSize' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'unit' otherlv_7= ':=' ( (lv_unit_8_0= ruleGSSTmTcFormatUnit ) ) otherlv_9= ';' (otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleGSSTmTcFormatPower ) ) otherlv_13= ';' )? otherlv_14= '}' otherlv_15= ';' ) ;
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
            // InternalTM_TC_FORMAT.g:3053:2: ( (otherlv_0= 'GSSTmTcFormatVariableSize' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'unit' otherlv_7= ':=' ( (lv_unit_8_0= ruleGSSTmTcFormatUnit ) ) otherlv_9= ';' (otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleGSSTmTcFormatPower ) ) otherlv_13= ';' )? otherlv_14= '}' otherlv_15= ';' ) )
            // InternalTM_TC_FORMAT.g:3054:2: (otherlv_0= 'GSSTmTcFormatVariableSize' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'unit' otherlv_7= ':=' ( (lv_unit_8_0= ruleGSSTmTcFormatUnit ) ) otherlv_9= ';' (otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleGSSTmTcFormatPower ) ) otherlv_13= ';' )? otherlv_14= '}' otherlv_15= ';' )
            {
            // InternalTM_TC_FORMAT.g:3054:2: (otherlv_0= 'GSSTmTcFormatVariableSize' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'unit' otherlv_7= ':=' ( (lv_unit_8_0= ruleGSSTmTcFormatUnit ) ) otherlv_9= ';' (otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleGSSTmTcFormatPower ) ) otherlv_13= ';' )? otherlv_14= '}' otherlv_15= ';' )
            // InternalTM_TC_FORMAT.g:3055:3: otherlv_0= 'GSSTmTcFormatVariableSize' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'unit' otherlv_7= ':=' ( (lv_unit_8_0= ruleGSSTmTcFormatUnit ) ) otherlv_9= ';' (otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleGSSTmTcFormatPower ) ) otherlv_13= ';' )? otherlv_14= '}' otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getGSSTmTcFormatVariableSizeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getFidRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:3071:3: ( (lv_fidRef_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:3072:4: (lv_fidRef_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:3072:4: (lv_fidRef_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:3073:5: lv_fidRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getFidRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getUnitKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:3102:3: ( (lv_unit_8_0= ruleGSSTmTcFormatUnit ) )
            // InternalTM_TC_FORMAT.g:3103:4: (lv_unit_8_0= ruleGSSTmTcFormatUnit )
            {
            // InternalTM_TC_FORMAT.g:3103:4: (lv_unit_8_0= ruleGSSTmTcFormatUnit )
            // InternalTM_TC_FORMAT.g:3104:5: lv_unit_8_0= ruleGSSTmTcFormatUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getUnitGSSTmTcFormatUnitEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getSemicolonKeyword_9());
              		
            }
            // InternalTM_TC_FORMAT.g:3125:3: (otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleGSSTmTcFormatPower ) ) otherlv_13= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==48) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTM_TC_FORMAT.g:3126:4: otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleGSSTmTcFormatPower ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,48,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getPowerKeyword_10_0());
                      			
                    }
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getColonEqualsSignKeyword_10_1());
                      			
                    }
                    // InternalTM_TC_FORMAT.g:3134:4: ( (lv_power_12_0= ruleGSSTmTcFormatPower ) )
                    // InternalTM_TC_FORMAT.g:3135:5: (lv_power_12_0= ruleGSSTmTcFormatPower )
                    {
                    // InternalTM_TC_FORMAT.g:3135:5: (lv_power_12_0= ruleGSSTmTcFormatPower )
                    // InternalTM_TC_FORMAT.g:3136:6: lv_power_12_0= ruleGSSTmTcFormatPower
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSTmTcFormatVariableSizeAccess().getPowerGSSTmTcFormatPowerEnumRuleCall_10_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
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

                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getSemicolonKeyword_10_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_14=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSTmTcFormatVariableSizeAccess().getRightCurlyBracketKeyword_11());
              		
            }
            otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalTM_TC_FORMAT.g:3170:1: entryRuleGSSTmTcFormatFloatingOffset returns [EObject current=null] : iv_ruleGSSTmTcFormatFloatingOffset= ruleGSSTmTcFormatFloatingOffset EOF ;
    public final EObject entryRuleGSSTmTcFormatFloatingOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatFloatingOffset = null;


        try {
            // InternalTM_TC_FORMAT.g:3170:68: (iv_ruleGSSTmTcFormatFloatingOffset= ruleGSSTmTcFormatFloatingOffset EOF )
            // InternalTM_TC_FORMAT.g:3171:2: iv_ruleGSSTmTcFormatFloatingOffset= ruleGSSTmTcFormatFloatingOffset EOF
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
    // InternalTM_TC_FORMAT.g:3177:1: ruleGSSTmTcFormatFloatingOffset returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatFloatingOffset' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
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
            // InternalTM_TC_FORMAT.g:3183:2: ( (otherlv_0= 'GSSTmTcFormatFloatingOffset' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalTM_TC_FORMAT.g:3184:2: (otherlv_0= 'GSSTmTcFormatFloatingOffset' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalTM_TC_FORMAT.g:3184:2: (otherlv_0= 'GSSTmTcFormatFloatingOffset' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalTM_TC_FORMAT.g:3185:3: otherlv_0= 'GSSTmTcFormatFloatingOffset' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getGSSTmTcFormatFloatingOffsetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getFidRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:3201:3: ( (lv_fidRef_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:3202:4: (lv_fidRef_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:3202:4: (lv_fidRef_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:3203:5: lv_fidRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getFidRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatFloatingOffsetAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalTM_TC_FORMAT.g:3236:1: entryRuleGSSTmTcFormatSortedFieldsToCheck returns [EObject current=null] : iv_ruleGSSTmTcFormatSortedFieldsToCheck= ruleGSSTmTcFormatSortedFieldsToCheck EOF ;
    public final EObject entryRuleGSSTmTcFormatSortedFieldsToCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatSortedFieldsToCheck = null;


        try {
            // InternalTM_TC_FORMAT.g:3236:73: (iv_ruleGSSTmTcFormatSortedFieldsToCheck= ruleGSSTmTcFormatSortedFieldsToCheck EOF )
            // InternalTM_TC_FORMAT.g:3237:2: iv_ruleGSSTmTcFormatSortedFieldsToCheck= ruleGSSTmTcFormatSortedFieldsToCheck EOF
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
    // InternalTM_TC_FORMAT.g:3243:1: ruleGSSTmTcFormatSortedFieldsToCheck returns [EObject current=null] : ( () otherlv_1= 'GSSTmTcFormatSortedFieldsToCheck' otherlv_2= '{' ( (lv_fieldToCheck_3_0= ruleGSSTmTcFormatFieldToCheck ) )+ otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleGSSTmTcFormatSortedFieldsToCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_fieldToCheck_3_0 = null;



        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:3249:2: ( ( () otherlv_1= 'GSSTmTcFormatSortedFieldsToCheck' otherlv_2= '{' ( (lv_fieldToCheck_3_0= ruleGSSTmTcFormatFieldToCheck ) )+ otherlv_4= '}' otherlv_5= ';' ) )
            // InternalTM_TC_FORMAT.g:3250:2: ( () otherlv_1= 'GSSTmTcFormatSortedFieldsToCheck' otherlv_2= '{' ( (lv_fieldToCheck_3_0= ruleGSSTmTcFormatFieldToCheck ) )+ otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalTM_TC_FORMAT.g:3250:2: ( () otherlv_1= 'GSSTmTcFormatSortedFieldsToCheck' otherlv_2= '{' ( (lv_fieldToCheck_3_0= ruleGSSTmTcFormatFieldToCheck ) )+ otherlv_4= '}' otherlv_5= ';' )
            // InternalTM_TC_FORMAT.g:3251:3: () otherlv_1= 'GSSTmTcFormatSortedFieldsToCheck' otherlv_2= '{' ( (lv_fieldToCheck_3_0= ruleGSSTmTcFormatFieldToCheck ) )+ otherlv_4= '}' otherlv_5= ';'
            {
            // InternalTM_TC_FORMAT.g:3251:3: ()
            // InternalTM_TC_FORMAT.g:3252:4: 
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

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getGSSTmTcFormatSortedFieldsToCheckKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalTM_TC_FORMAT.g:3269:3: ( (lv_fieldToCheck_3_0= ruleGSSTmTcFormatFieldToCheck ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==51) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTM_TC_FORMAT.g:3270:4: (lv_fieldToCheck_3_0= ruleGSSTmTcFormatFieldToCheck )
            	    {
            	    // InternalTM_TC_FORMAT.g:3270:4: (lv_fieldToCheck_3_0= ruleGSSTmTcFormatFieldToCheck )
            	    // InternalTM_TC_FORMAT.g:3271:5: lv_fieldToCheck_3_0= ruleGSSTmTcFormatFieldToCheck
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getFieldToCheckGSSTmTcFormatFieldToCheckParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_50);
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
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGSSTmTcFormatSortedFieldsToCheckAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalTM_TC_FORMAT.g:3300:1: entryRuleGSSTmTcFormatFieldToCheck returns [EObject current=null] : iv_ruleGSSTmTcFormatFieldToCheck= ruleGSSTmTcFormatFieldToCheck EOF ;
    public final EObject entryRuleGSSTmTcFormatFieldToCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatFieldToCheck = null;


        try {
            // InternalTM_TC_FORMAT.g:3300:66: (iv_ruleGSSTmTcFormatFieldToCheck= ruleGSSTmTcFormatFieldToCheck EOF )
            // InternalTM_TC_FORMAT.g:3301:2: iv_ruleGSSTmTcFormatFieldToCheck= ruleGSSTmTcFormatFieldToCheck EOF
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
    // InternalTM_TC_FORMAT.g:3307:1: ruleGSSTmTcFormatFieldToCheck returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatFieldToCheck' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
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
            // InternalTM_TC_FORMAT.g:3313:2: ( (otherlv_0= 'GSSTmTcFormatFieldToCheck' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalTM_TC_FORMAT.g:3314:2: (otherlv_0= 'GSSTmTcFormatFieldToCheck' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalTM_TC_FORMAT.g:3314:2: (otherlv_0= 'GSSTmTcFormatFieldToCheck' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalTM_TC_FORMAT.g:3315:3: otherlv_0= 'GSSTmTcFormatFieldToCheck' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getGSSTmTcFormatFieldToCheckKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getFidRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:3331:3: ( (lv_fidRef_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:3332:4: (lv_fidRef_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:3332:4: (lv_fidRef_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:3333:5: lv_fidRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getFidRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatFieldToCheckAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalTM_TC_FORMAT.g:3366:1: entryRuleGSSTmTcFormatArrayDimension returns [EObject current=null] : iv_ruleGSSTmTcFormatArrayDimension= ruleGSSTmTcFormatArrayDimension EOF ;
    public final EObject entryRuleGSSTmTcFormatArrayDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatArrayDimension = null;


        try {
            // InternalTM_TC_FORMAT.g:3366:68: (iv_ruleGSSTmTcFormatArrayDimension= ruleGSSTmTcFormatArrayDimension EOF )
            // InternalTM_TC_FORMAT.g:3367:2: iv_ruleGSSTmTcFormatArrayDimension= ruleGSSTmTcFormatArrayDimension EOF
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
    // InternalTM_TC_FORMAT.g:3373:1: ruleGSSTmTcFormatArrayDimension returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatArrayDimension' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'maxItems' otherlv_7= ':=' ( (lv_maxItems_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
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
            // InternalTM_TC_FORMAT.g:3379:2: ( (otherlv_0= 'GSSTmTcFormatArrayDimension' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'maxItems' otherlv_7= ':=' ( (lv_maxItems_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalTM_TC_FORMAT.g:3380:2: (otherlv_0= 'GSSTmTcFormatArrayDimension' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'maxItems' otherlv_7= ':=' ( (lv_maxItems_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalTM_TC_FORMAT.g:3380:2: (otherlv_0= 'GSSTmTcFormatArrayDimension' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'maxItems' otherlv_7= ':=' ( (lv_maxItems_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalTM_TC_FORMAT.g:3381:3: otherlv_0= 'GSSTmTcFormatArrayDimension' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'maxItems' otherlv_7= ':=' ( (lv_maxItems_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getGSSTmTcFormatArrayDimensionKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getFidRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:3397:3: ( (lv_fidRef_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:3398:4: (lv_fidRef_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:3398:4: (lv_fidRef_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:3399:5: lv_fidRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getFidRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,53,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getMaxItemsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:3428:3: ( (lv_maxItems_8_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:3429:4: (lv_maxItems_8_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:3429:4: (lv_maxItems_8_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:3430:5: lv_maxItems_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getMaxItemsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatArrayDimensionAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalTM_TC_FORMAT.g:3463:1: entryRuleGSSTmTcFormatLocalOffset returns [EObject current=null] : iv_ruleGSSTmTcFormatLocalOffset= ruleGSSTmTcFormatLocalOffset EOF ;
    public final EObject entryRuleGSSTmTcFormatLocalOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatLocalOffset = null;


        try {
            // InternalTM_TC_FORMAT.g:3463:65: (iv_ruleGSSTmTcFormatLocalOffset= ruleGSSTmTcFormatLocalOffset EOF )
            // InternalTM_TC_FORMAT.g:3464:2: iv_ruleGSSTmTcFormatLocalOffset= ruleGSSTmTcFormatLocalOffset EOF
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
    // InternalTM_TC_FORMAT.g:3470:1: ruleGSSTmTcFormatLocalOffset returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatLocalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
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
            // InternalTM_TC_FORMAT.g:3476:2: ( (otherlv_0= 'GSSTmTcFormatLocalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalTM_TC_FORMAT.g:3477:2: (otherlv_0= 'GSSTmTcFormatLocalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalTM_TC_FORMAT.g:3477:2: (otherlv_0= 'GSSTmTcFormatLocalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalTM_TC_FORMAT.g:3478:3: otherlv_0= 'GSSTmTcFormatLocalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getGSSTmTcFormatLocalOffsetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBytesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:3494:3: ( (lv_bytes_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:3495:4: (lv_bytes_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:3495:4: (lv_bytes_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:3496:5: lv_bytes_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBytesINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBitsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalTM_TC_FORMAT.g:3525:3: ( (lv_bits_8_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:3526:4: (lv_bits_8_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:3526:4: (lv_bits_8_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:3527:5: lv_bits_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getBitsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSTmTcFormatLocalOffsetAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalTM_TC_FORMAT.g:3560:1: entryRuleGSSTmTcFormatArrayRef returns [EObject current=null] : iv_ruleGSSTmTcFormatArrayRef= ruleGSSTmTcFormatArrayRef EOF ;
    public final EObject entryRuleGSSTmTcFormatArrayRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTmTcFormatArrayRef = null;


        try {
            // InternalTM_TC_FORMAT.g:3560:62: (iv_ruleGSSTmTcFormatArrayRef= ruleGSSTmTcFormatArrayRef EOF )
            // InternalTM_TC_FORMAT.g:3561:2: iv_ruleGSSTmTcFormatArrayRef= ruleGSSTmTcFormatArrayRef EOF
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
    // InternalTM_TC_FORMAT.g:3567:1: ruleGSSTmTcFormatArrayRef returns [EObject current=null] : (otherlv_0= 'GSSTmTcFormatArrayRef' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
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
            // InternalTM_TC_FORMAT.g:3573:2: ( (otherlv_0= 'GSSTmTcFormatArrayRef' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalTM_TC_FORMAT.g:3574:2: (otherlv_0= 'GSSTmTcFormatArrayRef' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalTM_TC_FORMAT.g:3574:2: (otherlv_0= 'GSSTmTcFormatArrayRef' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalTM_TC_FORMAT.g:3575:3: otherlv_0= 'GSSTmTcFormatArrayRef' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTmTcFormatArrayRefAccess().getGSSTmTcFormatArrayRefKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTmTcFormatArrayRefAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTmTcFormatArrayRefAccess().getFidRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTmTcFormatArrayRefAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalTM_TC_FORMAT.g:3591:3: ( (lv_fidRef_4_0= ruleINTEGER ) )
            // InternalTM_TC_FORMAT.g:3592:4: (lv_fidRef_4_0= ruleINTEGER )
            {
            // InternalTM_TC_FORMAT.g:3592:4: (lv_fidRef_4_0= ruleINTEGER )
            // InternalTM_TC_FORMAT.g:3593:5: lv_fidRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTmTcFormatArrayRefAccess().getFidRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTmTcFormatArrayRefAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTmTcFormatArrayRefAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalTM_TC_FORMAT.g:3626:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalTM_TC_FORMAT.g:3626:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalTM_TC_FORMAT.g:3627:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalTM_TC_FORMAT.g:3633:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:3639:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalTM_TC_FORMAT.g:3640:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalTM_TC_FORMAT.g:3640:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalTM_TC_FORMAT.g:3641:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalTM_TC_FORMAT.g:3648:3: (kw= '.' this_ID_2= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==56) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTM_TC_FORMAT.g:3649:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,56,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_52); if (state.failed) return current;
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
    // InternalTM_TC_FORMAT.g:3666:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalTM_TC_FORMAT.g:3666:47: (iv_ruleVersion= ruleVersion EOF )
            // InternalTM_TC_FORMAT.g:3667:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalTM_TC_FORMAT.g:3673:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // InternalTM_TC_FORMAT.g:3679:2: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalTM_TC_FORMAT.g:3680:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalTM_TC_FORMAT.g:3680:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalTM_TC_FORMAT.g:3681:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalTM_TC_FORMAT.g:3681:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RULE_ID) ) {
                    alt14=2;
                }
                else if ( (LA14_1==EOF||LA14_1==14||LA14_1==56||LA14_1==58) ) {
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
                    // InternalTM_TC_FORMAT.g:3682:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalTM_TC_FORMAT.g:3690:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalTM_TC_FORMAT.g:3690:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalTM_TC_FORMAT.g:3691:5: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalTM_TC_FORMAT.g:3691:5: (this_INT_1= RULE_INT )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_INT) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalTM_TC_FORMAT.g:3692:6: this_INT_1= RULE_INT
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

                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_52); if (state.failed) return current;
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

            // InternalTM_TC_FORMAT.g:3709:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==56) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTM_TC_FORMAT.g:3710:4: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,56,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    // InternalTM_TC_FORMAT.g:3715:4: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==RULE_INT) ) {
            	        int LA16_1 = input.LA(2);

            	        if ( (LA16_1==EOF||LA16_1==14||LA16_1==56||LA16_1==58) ) {
            	            alt16=1;
            	        }
            	        else if ( (LA16_1==RULE_ID) ) {
            	            alt16=2;
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
            	            // InternalTM_TC_FORMAT.g:3716:5: this_INT_4= RULE_INT
            	            {
            	            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_52); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_INT_4);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalTM_TC_FORMAT.g:3724:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalTM_TC_FORMAT.g:3724:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalTM_TC_FORMAT.g:3725:6: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalTM_TC_FORMAT.g:3725:6: (this_INT_5= RULE_INT )?
            	            int alt15=2;
            	            int LA15_0 = input.LA(1);

            	            if ( (LA15_0==RULE_INT) ) {
            	                alt15=1;
            	            }
            	            switch (alt15) {
            	                case 1 :
            	                    // InternalTM_TC_FORMAT.g:3726:7: this_INT_5= RULE_INT
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

            	            this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_52); if (state.failed) return current;
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
    // InternalTM_TC_FORMAT.g:3748:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // InternalTM_TC_FORMAT.g:3748:62: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // InternalTM_TC_FORMAT.g:3749:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // InternalTM_TC_FORMAT.g:3755:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;



        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:3761:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // InternalTM_TC_FORMAT.g:3762:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // InternalTM_TC_FORMAT.g:3762:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // InternalTM_TC_FORMAT.g:3763:3: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_53);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,57,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2());
              		
            }
            pushFollow(FollowSets000.FOLLOW_54);
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
    // InternalTM_TC_FORMAT.g:3797:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // InternalTM_TC_FORMAT.g:3797:47: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalTM_TC_FORMAT.g:3798:2: iv_ruleINTEGER= ruleINTEGER EOF
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
    // InternalTM_TC_FORMAT.g:3804:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;


        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:3810:2: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // InternalTM_TC_FORMAT.g:3811:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // InternalTM_TC_FORMAT.g:3811:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
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
                    // InternalTM_TC_FORMAT.g:3812:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // InternalTM_TC_FORMAT.g:3812:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // InternalTM_TC_FORMAT.g:3813:4: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // InternalTM_TC_FORMAT.g:3813:4: (kw= '-' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==59) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalTM_TC_FORMAT.g:3814:5: kw= '-'
                            {
                            kw=(Token)match(input,59,FollowSets000.FOLLOW_55); if (state.failed) return current;
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
                    // InternalTM_TC_FORMAT.g:3829:3: this_HEXADECIMAL_2= RULE_HEXADECIMAL
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


    // $ANTLR start "ruleGSSTmTcFormatTmTcFormatType"
    // InternalTM_TC_FORMAT.g:3840:1: ruleGSSTmTcFormatTmTcFormatType returns [Enumerator current=null] : ( (enumLiteral_0= 'TM' ) | (enumLiteral_1= 'TC' ) ) ;
    public final Enumerator ruleGSSTmTcFormatTmTcFormatType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:3846:2: ( ( (enumLiteral_0= 'TM' ) | (enumLiteral_1= 'TC' ) ) )
            // InternalTM_TC_FORMAT.g:3847:2: ( (enumLiteral_0= 'TM' ) | (enumLiteral_1= 'TC' ) )
            {
            // InternalTM_TC_FORMAT.g:3847:2: ( (enumLiteral_0= 'TM' ) | (enumLiteral_1= 'TC' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==60) ) {
                alt20=1;
            }
            else if ( (LA20_0==61) ) {
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
                    // InternalTM_TC_FORMAT.g:3848:3: (enumLiteral_0= 'TM' )
                    {
                    // InternalTM_TC_FORMAT.g:3848:3: (enumLiteral_0= 'TM' )
                    // InternalTM_TC_FORMAT.g:3849:4: enumLiteral_0= 'TM'
                    {
                    enumLiteral_0=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatTmTcFormatTypeAccess().getTMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSTmTcFormatTmTcFormatTypeAccess().getTMEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTM_TC_FORMAT.g:3856:3: (enumLiteral_1= 'TC' )
                    {
                    // InternalTM_TC_FORMAT.g:3856:3: (enumLiteral_1= 'TC' )
                    // InternalTM_TC_FORMAT.g:3857:4: enumLiteral_1= 'TC'
                    {
                    enumLiteral_1=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatTmTcFormatTypeAccess().getTCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSTmTcFormatTmTcFormatTypeAccess().getTCEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGSSTmTcFormatTmTcFormatType"


    // $ANTLR start "ruleGSSTmTcFormatFieldType"
    // InternalTM_TC_FORMAT.g:3867:1: ruleGSSTmTcFormatFieldType returns [Enumerator current=null] : ( (enumLiteral_0= 'structured' ) | (enumLiteral_1= 'uint' ) | (enumLiteral_2= 'flag' ) | (enumLiteral_3= 'enumerated' ) | (enumLiteral_4= 'bit_vector' ) | (enumLiteral_5= 'byte_vector' ) | (enumLiteral_6= 'float' ) | (enumLiteral_7= 'deduced' ) ) ;
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
            // InternalTM_TC_FORMAT.g:3873:2: ( ( (enumLiteral_0= 'structured' ) | (enumLiteral_1= 'uint' ) | (enumLiteral_2= 'flag' ) | (enumLiteral_3= 'enumerated' ) | (enumLiteral_4= 'bit_vector' ) | (enumLiteral_5= 'byte_vector' ) | (enumLiteral_6= 'float' ) | (enumLiteral_7= 'deduced' ) ) )
            // InternalTM_TC_FORMAT.g:3874:2: ( (enumLiteral_0= 'structured' ) | (enumLiteral_1= 'uint' ) | (enumLiteral_2= 'flag' ) | (enumLiteral_3= 'enumerated' ) | (enumLiteral_4= 'bit_vector' ) | (enumLiteral_5= 'byte_vector' ) | (enumLiteral_6= 'float' ) | (enumLiteral_7= 'deduced' ) )
            {
            // InternalTM_TC_FORMAT.g:3874:2: ( (enumLiteral_0= 'structured' ) | (enumLiteral_1= 'uint' ) | (enumLiteral_2= 'flag' ) | (enumLiteral_3= 'enumerated' ) | (enumLiteral_4= 'bit_vector' ) | (enumLiteral_5= 'byte_vector' ) | (enumLiteral_6= 'float' ) | (enumLiteral_7= 'deduced' ) )
            int alt21=8;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt21=1;
                }
                break;
            case 63:
                {
                alt21=2;
                }
                break;
            case 64:
                {
                alt21=3;
                }
                break;
            case 65:
                {
                alt21=4;
                }
                break;
            case 66:
                {
                alt21=5;
                }
                break;
            case 67:
                {
                alt21=6;
                }
                break;
            case 68:
                {
                alt21=7;
                }
                break;
            case 69:
                {
                alt21=8;
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
                    // InternalTM_TC_FORMAT.g:3875:3: (enumLiteral_0= 'structured' )
                    {
                    // InternalTM_TC_FORMAT.g:3875:3: (enumLiteral_0= 'structured' )
                    // InternalTM_TC_FORMAT.g:3876:4: enumLiteral_0= 'structured'
                    {
                    enumLiteral_0=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatFieldTypeAccess().getStructuredEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSTmTcFormatFieldTypeAccess().getStructuredEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTM_TC_FORMAT.g:3883:3: (enumLiteral_1= 'uint' )
                    {
                    // InternalTM_TC_FORMAT.g:3883:3: (enumLiteral_1= 'uint' )
                    // InternalTM_TC_FORMAT.g:3884:4: enumLiteral_1= 'uint'
                    {
                    enumLiteral_1=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatFieldTypeAccess().getUintEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSTmTcFormatFieldTypeAccess().getUintEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTM_TC_FORMAT.g:3891:3: (enumLiteral_2= 'flag' )
                    {
                    // InternalTM_TC_FORMAT.g:3891:3: (enumLiteral_2= 'flag' )
                    // InternalTM_TC_FORMAT.g:3892:4: enumLiteral_2= 'flag'
                    {
                    enumLiteral_2=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatFieldTypeAccess().getFlagEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSTmTcFormatFieldTypeAccess().getFlagEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTM_TC_FORMAT.g:3899:3: (enumLiteral_3= 'enumerated' )
                    {
                    // InternalTM_TC_FORMAT.g:3899:3: (enumLiteral_3= 'enumerated' )
                    // InternalTM_TC_FORMAT.g:3900:4: enumLiteral_3= 'enumerated'
                    {
                    enumLiteral_3=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatFieldTypeAccess().getEnumeratedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getGSSTmTcFormatFieldTypeAccess().getEnumeratedEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTM_TC_FORMAT.g:3907:3: (enumLiteral_4= 'bit_vector' )
                    {
                    // InternalTM_TC_FORMAT.g:3907:3: (enumLiteral_4= 'bit_vector' )
                    // InternalTM_TC_FORMAT.g:3908:4: enumLiteral_4= 'bit_vector'
                    {
                    enumLiteral_4=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatFieldTypeAccess().getBit_vectorEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getGSSTmTcFormatFieldTypeAccess().getBit_vectorEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalTM_TC_FORMAT.g:3915:3: (enumLiteral_5= 'byte_vector' )
                    {
                    // InternalTM_TC_FORMAT.g:3915:3: (enumLiteral_5= 'byte_vector' )
                    // InternalTM_TC_FORMAT.g:3916:4: enumLiteral_5= 'byte_vector'
                    {
                    enumLiteral_5=(Token)match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatFieldTypeAccess().getByte_vectorEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getGSSTmTcFormatFieldTypeAccess().getByte_vectorEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalTM_TC_FORMAT.g:3923:3: (enumLiteral_6= 'float' )
                    {
                    // InternalTM_TC_FORMAT.g:3923:3: (enumLiteral_6= 'float' )
                    // InternalTM_TC_FORMAT.g:3924:4: enumLiteral_6= 'float'
                    {
                    enumLiteral_6=(Token)match(input,68,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatFieldTypeAccess().getFloatEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getGSSTmTcFormatFieldTypeAccess().getFloatEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalTM_TC_FORMAT.g:3931:3: (enumLiteral_7= 'deduced' )
                    {
                    // InternalTM_TC_FORMAT.g:3931:3: (enumLiteral_7= 'deduced' )
                    // InternalTM_TC_FORMAT.g:3932:4: enumLiteral_7= 'deduced'
                    {
                    enumLiteral_7=(Token)match(input,69,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalTM_TC_FORMAT.g:3942:1: ruleGSSTmTcFormatFieldByteOrder returns [Enumerator current=null] : ( (enumLiteral_0= 'big_endian' ) | (enumLiteral_1= 'little_endian' ) | (enumLiteral_2= 'na' ) ) ;
    public final Enumerator ruleGSSTmTcFormatFieldByteOrder() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:3948:2: ( ( (enumLiteral_0= 'big_endian' ) | (enumLiteral_1= 'little_endian' ) | (enumLiteral_2= 'na' ) ) )
            // InternalTM_TC_FORMAT.g:3949:2: ( (enumLiteral_0= 'big_endian' ) | (enumLiteral_1= 'little_endian' ) | (enumLiteral_2= 'na' ) )
            {
            // InternalTM_TC_FORMAT.g:3949:2: ( (enumLiteral_0= 'big_endian' ) | (enumLiteral_1= 'little_endian' ) | (enumLiteral_2= 'na' ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt22=1;
                }
                break;
            case 71:
                {
                alt22=2;
                }
                break;
            case 72:
                {
                alt22=3;
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
                    // InternalTM_TC_FORMAT.g:3950:3: (enumLiteral_0= 'big_endian' )
                    {
                    // InternalTM_TC_FORMAT.g:3950:3: (enumLiteral_0= 'big_endian' )
                    // InternalTM_TC_FORMAT.g:3951:4: enumLiteral_0= 'big_endian'
                    {
                    enumLiteral_0=(Token)match(input,70,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatFieldByteOrderAccess().getBig_endianEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSTmTcFormatFieldByteOrderAccess().getBig_endianEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTM_TC_FORMAT.g:3958:3: (enumLiteral_1= 'little_endian' )
                    {
                    // InternalTM_TC_FORMAT.g:3958:3: (enumLiteral_1= 'little_endian' )
                    // InternalTM_TC_FORMAT.g:3959:4: enumLiteral_1= 'little_endian'
                    {
                    enumLiteral_1=(Token)match(input,71,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatFieldByteOrderAccess().getLittle_endianEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSTmTcFormatFieldByteOrderAccess().getLittle_endianEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTM_TC_FORMAT.g:3966:3: (enumLiteral_2= 'na' )
                    {
                    // InternalTM_TC_FORMAT.g:3966:3: (enumLiteral_2= 'na' )
                    // InternalTM_TC_FORMAT.g:3967:4: enumLiteral_2= 'na'
                    {
                    enumLiteral_2=(Token)match(input,72,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalTM_TC_FORMAT.g:3977:1: ruleGSSTmTcFormatSFieldFirstBit returns [Enumerator current=null] : ( (enumLiteral_0= 'MSB' ) | (enumLiteral_1= 'LSB' ) ) ;
    public final Enumerator ruleGSSTmTcFormatSFieldFirstBit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:3983:2: ( ( (enumLiteral_0= 'MSB' ) | (enumLiteral_1= 'LSB' ) ) )
            // InternalTM_TC_FORMAT.g:3984:2: ( (enumLiteral_0= 'MSB' ) | (enumLiteral_1= 'LSB' ) )
            {
            // InternalTM_TC_FORMAT.g:3984:2: ( (enumLiteral_0= 'MSB' ) | (enumLiteral_1= 'LSB' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==73) ) {
                alt23=1;
            }
            else if ( (LA23_0==74) ) {
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
                    // InternalTM_TC_FORMAT.g:3985:3: (enumLiteral_0= 'MSB' )
                    {
                    // InternalTM_TC_FORMAT.g:3985:3: (enumLiteral_0= 'MSB' )
                    // InternalTM_TC_FORMAT.g:3986:4: enumLiteral_0= 'MSB'
                    {
                    enumLiteral_0=(Token)match(input,73,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatSFieldFirstBitAccess().getMSBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSTmTcFormatSFieldFirstBitAccess().getMSBEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTM_TC_FORMAT.g:3993:3: (enumLiteral_1= 'LSB' )
                    {
                    // InternalTM_TC_FORMAT.g:3993:3: (enumLiteral_1= 'LSB' )
                    // InternalTM_TC_FORMAT.g:3994:4: enumLiteral_1= 'LSB'
                    {
                    enumLiteral_1=(Token)match(input,74,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalTM_TC_FORMAT.g:4004:1: ruleGSSTmTcFormatUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) | (enumLiteral_2= 'halfword' ) | (enumLiteral_3= 'string10' ) | (enumLiteral_4= 'string17' ) | (enumLiteral_5= 'string69' ) ) ;
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
            // InternalTM_TC_FORMAT.g:4010:2: ( ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) | (enumLiteral_2= 'halfword' ) | (enumLiteral_3= 'string10' ) | (enumLiteral_4= 'string17' ) | (enumLiteral_5= 'string69' ) ) )
            // InternalTM_TC_FORMAT.g:4011:2: ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) | (enumLiteral_2= 'halfword' ) | (enumLiteral_3= 'string10' ) | (enumLiteral_4= 'string17' ) | (enumLiteral_5= 'string69' ) )
            {
            // InternalTM_TC_FORMAT.g:4011:2: ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) | (enumLiteral_2= 'halfword' ) | (enumLiteral_3= 'string10' ) | (enumLiteral_4= 'string17' ) | (enumLiteral_5= 'string69' ) )
            int alt24=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt24=1;
                }
                break;
            case 38:
                {
                alt24=2;
                }
                break;
            case 75:
                {
                alt24=3;
                }
                break;
            case 76:
                {
                alt24=4;
                }
                break;
            case 77:
                {
                alt24=5;
                }
                break;
            case 78:
                {
                alt24=6;
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
                    // InternalTM_TC_FORMAT.g:4012:3: (enumLiteral_0= 'bytes' )
                    {
                    // InternalTM_TC_FORMAT.g:4012:3: (enumLiteral_0= 'bytes' )
                    // InternalTM_TC_FORMAT.g:4013:4: enumLiteral_0= 'bytes'
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
                    // InternalTM_TC_FORMAT.g:4020:3: (enumLiteral_1= 'bits' )
                    {
                    // InternalTM_TC_FORMAT.g:4020:3: (enumLiteral_1= 'bits' )
                    // InternalTM_TC_FORMAT.g:4021:4: enumLiteral_1= 'bits'
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
                    // InternalTM_TC_FORMAT.g:4028:3: (enumLiteral_2= 'halfword' )
                    {
                    // InternalTM_TC_FORMAT.g:4028:3: (enumLiteral_2= 'halfword' )
                    // InternalTM_TC_FORMAT.g:4029:4: enumLiteral_2= 'halfword'
                    {
                    enumLiteral_2=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatUnitAccess().getHalfwordEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSTmTcFormatUnitAccess().getHalfwordEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTM_TC_FORMAT.g:4036:3: (enumLiteral_3= 'string10' )
                    {
                    // InternalTM_TC_FORMAT.g:4036:3: (enumLiteral_3= 'string10' )
                    // InternalTM_TC_FORMAT.g:4037:4: enumLiteral_3= 'string10'
                    {
                    enumLiteral_3=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatUnitAccess().getString10EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getGSSTmTcFormatUnitAccess().getString10EnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTM_TC_FORMAT.g:4044:3: (enumLiteral_4= 'string17' )
                    {
                    // InternalTM_TC_FORMAT.g:4044:3: (enumLiteral_4= 'string17' )
                    // InternalTM_TC_FORMAT.g:4045:4: enumLiteral_4= 'string17'
                    {
                    enumLiteral_4=(Token)match(input,77,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatUnitAccess().getString17EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getGSSTmTcFormatUnitAccess().getString17EnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalTM_TC_FORMAT.g:4052:3: (enumLiteral_5= 'string69' )
                    {
                    // InternalTM_TC_FORMAT.g:4052:3: (enumLiteral_5= 'string69' )
                    // InternalTM_TC_FORMAT.g:4053:4: enumLiteral_5= 'string69'
                    {
                    enumLiteral_5=(Token)match(input,78,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalTM_TC_FORMAT.g:4063:1: ruleGSSTmTcFormatPower returns [Enumerator current=null] : ( (enumLiteral_0= '2bits' ) | (enumLiteral_1= '2bits_with_0' ) ) ;
    public final Enumerator ruleGSSTmTcFormatPower() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:4069:2: ( ( (enumLiteral_0= '2bits' ) | (enumLiteral_1= '2bits_with_0' ) ) )
            // InternalTM_TC_FORMAT.g:4070:2: ( (enumLiteral_0= '2bits' ) | (enumLiteral_1= '2bits_with_0' ) )
            {
            // InternalTM_TC_FORMAT.g:4070:2: ( (enumLiteral_0= '2bits' ) | (enumLiteral_1= '2bits_with_0' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==79) ) {
                alt25=1;
            }
            else if ( (LA25_0==80) ) {
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
                    // InternalTM_TC_FORMAT.g:4071:3: (enumLiteral_0= '2bits' )
                    {
                    // InternalTM_TC_FORMAT.g:4071:3: (enumLiteral_0= '2bits' )
                    // InternalTM_TC_FORMAT.g:4072:4: enumLiteral_0= '2bits'
                    {
                    enumLiteral_0=(Token)match(input,79,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatPowerAccess().get_2EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSTmTcFormatPowerAccess().get_2EnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTM_TC_FORMAT.g:4079:3: (enumLiteral_1= '2bits_with_0' )
                    {
                    // InternalTM_TC_FORMAT.g:4079:3: (enumLiteral_1= '2bits_with_0' )
                    // InternalTM_TC_FORMAT.g:4080:4: enumLiteral_1= '2bits_with_0'
                    {
                    enumLiteral_1=(Token)match(input,80,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalTM_TC_FORMAT.g:4090:1: ruleGSSTmTcFormatCheckType returns [Enumerator current=null] : ( (enumLiteral_0= 'crc16' ) | (enumLiteral_1= 'checksum16' ) ) ;
    public final Enumerator ruleGSSTmTcFormatCheckType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTM_TC_FORMAT.g:4096:2: ( ( (enumLiteral_0= 'crc16' ) | (enumLiteral_1= 'checksum16' ) ) )
            // InternalTM_TC_FORMAT.g:4097:2: ( (enumLiteral_0= 'crc16' ) | (enumLiteral_1= 'checksum16' ) )
            {
            // InternalTM_TC_FORMAT.g:4097:2: ( (enumLiteral_0= 'crc16' ) | (enumLiteral_1= 'checksum16' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==81) ) {
                alt26=1;
            }
            else if ( (LA26_0==82) ) {
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
                    // InternalTM_TC_FORMAT.g:4098:3: (enumLiteral_0= 'crc16' )
                    {
                    // InternalTM_TC_FORMAT.g:4098:3: (enumLiteral_0= 'crc16' )
                    // InternalTM_TC_FORMAT.g:4099:4: enumLiteral_0= 'crc16'
                    {
                    enumLiteral_0=(Token)match(input,81,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSTmTcFormatCheckTypeAccess().getCrc16EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSTmTcFormatCheckTypeAccess().getCrc16EnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTM_TC_FORMAT.g:4106:3: (enumLiteral_1= 'checksum16' )
                    {
                    // InternalTM_TC_FORMAT.g:4106:3: (enumLiteral_1= 'checksum16' )
                    // InternalTM_TC_FORMAT.g:4107:4: enumLiteral_1= 'checksum16'
                    {
                    enumLiteral_1=(Token)match(input,82,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


        // InternalTM_TC_FORMAT.g:243:4: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) )
        // InternalTM_TC_FORMAT.g:243:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        {
        // InternalTM_TC_FORMAT.g:243:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        // InternalTM_TC_FORMAT.g:244:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalTM_TC_FORMAT", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalTM_TC_FORMAT.g:244:120: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        // InternalTM_TC_FORMAT.g:245:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 0);
        // InternalTM_TC_FORMAT.g:248:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        // InternalTM_TC_FORMAT.g:248:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalTM_TC_FORMAT", "true");
        }
        // InternalTM_TC_FORMAT.g:248:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        // InternalTM_TC_FORMAT.g:248:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
        {
        otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalTM_TC_FORMAT.g:256:9: ( (lv_uri_6_0= ruleQualifiedName ) )
        // InternalTM_TC_FORMAT.g:257:10: (lv_uri_6_0= ruleQualifiedName )
        {
        // InternalTM_TC_FORMAT.g:257:10: (lv_uri_6_0= ruleQualifiedName )
        // InternalTM_TC_FORMAT.g:258:11: lv_uri_6_0= ruleQualifiedName
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
          										
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
    // $ANTLR end synpred2_InternalTM_TC_FORMAT

    // $ANTLR start synpred3_InternalTM_TC_FORMAT
    public final void synpred3_InternalTM_TC_FORMAT_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_version_10_0 = null;


        // InternalTM_TC_FORMAT.g:285:4: ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )
        // InternalTM_TC_FORMAT.g:285:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        {
        // InternalTM_TC_FORMAT.g:285:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        // InternalTM_TC_FORMAT.g:286:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalTM_TC_FORMAT", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 1)");
        }
        // InternalTM_TC_FORMAT.g:286:120: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        // InternalTM_TC_FORMAT.g:287:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 1);
        // InternalTM_TC_FORMAT.g:290:9: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        // InternalTM_TC_FORMAT.g:290:10: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalTM_TC_FORMAT", "true");
        }
        // InternalTM_TC_FORMAT.g:290:19: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        // InternalTM_TC_FORMAT.g:290:20: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
        {
        otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalTM_TC_FORMAT.g:298:9: ( (lv_version_10_0= ruleVersion ) )
        // InternalTM_TC_FORMAT.g:299:10: (lv_version_10_0= ruleVersion )
        {
        // InternalTM_TC_FORMAT.g:299:10: (lv_version_10_0= ruleVersion )
        // InternalTM_TC_FORMAT.g:300:11: lv_version_10_0= ruleVersion
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getVersionVersionParserRuleCall_3_1_2_0());
          										
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
    // $ANTLR end synpred3_InternalTM_TC_FORMAT

    // $ANTLR start synpred4_InternalTM_TC_FORMAT
    public final void synpred4_InternalTM_TC_FORMAT_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_protocol_14_0=null;
        Token otherlv_15=null;

        // InternalTM_TC_FORMAT.g:327:4: ( ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) )
        // InternalTM_TC_FORMAT.g:327:4: ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) )
        {
        // InternalTM_TC_FORMAT.g:327:4: ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) )
        // InternalTM_TC_FORMAT.g:328:5: {...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred4_InternalTM_TC_FORMAT", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 2)");
        }
        // InternalTM_TC_FORMAT.g:328:120: ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) )
        // InternalTM_TC_FORMAT.g:329:6: ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 2);
        // InternalTM_TC_FORMAT.g:332:9: ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) )
        // InternalTM_TC_FORMAT.g:332:10: {...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred4_InternalTM_TC_FORMAT", "true");
        }
        // InternalTM_TC_FORMAT.g:332:19: (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' )
        // InternalTM_TC_FORMAT.g:332:20: otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';'
        {
        otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalTM_TC_FORMAT.g:340:9: ( (lv_protocol_14_0= RULE_ID ) )
        // InternalTM_TC_FORMAT.g:341:10: (lv_protocol_14_0= RULE_ID )
        {
        // InternalTM_TC_FORMAT.g:341:10: (lv_protocol_14_0= RULE_ID )
        // InternalTM_TC_FORMAT.g:342:11: lv_protocol_14_0= RULE_ID
        {
        lv_protocol_14_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return ;

        }


        }

        otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalTM_TC_FORMAT

    // $ANTLR start synpred12_InternalTM_TC_FORMAT
    public final void synpred12_InternalTM_TC_FORMAT_fragment() throws RecognitionException {   
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Enumerator lv_type_18_0 = null;

        EObject lv_CSField_20_0 = null;

        EObject lv_CSFormulaField_21_0 = null;

        EObject lv_VSField_22_0 = null;

        EObject lv_FDICField_23_0 = null;

        EObject lv_VRFieldSize_24_0 = null;

        EObject lv_AField_25_0 = null;

        EObject lv_AIField_26_0 = null;


        // InternalTM_TC_FORMAT.g:368:4: ( ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) ) )
        // InternalTM_TC_FORMAT.g:368:4: ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) )
        {
        // InternalTM_TC_FORMAT.g:368:4: ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* ) ) ) )
        // InternalTM_TC_FORMAT.g:369:5: {...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalTM_TC_FORMAT", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 3)");
        }
        // InternalTM_TC_FORMAT.g:369:120: ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* ) ) )
        // InternalTM_TC_FORMAT.g:370:6: ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getUnorderedGroup_3(), 3);
        // InternalTM_TC_FORMAT.g:373:9: ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* ) )
        // InternalTM_TC_FORMAT.g:373:10: {...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalTM_TC_FORMAT", "true");
        }
        // InternalTM_TC_FORMAT.g:373:19: ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )* )
        // InternalTM_TC_FORMAT.g:373:20: (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )*
        {
        // InternalTM_TC_FORMAT.g:373:20: (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';' )
        // InternalTM_TC_FORMAT.g:374:10: otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) ) otherlv_19= ';'
        {
        otherlv_16=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return ;
        // InternalTM_TC_FORMAT.g:382:10: ( (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType ) )
        // InternalTM_TC_FORMAT.g:383:11: (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType )
        {
        // InternalTM_TC_FORMAT.g:383:11: (lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType )
        // InternalTM_TC_FORMAT.g:384:12: lv_type_18_0= ruleGSSTmTcFormatTmTcFormatType
        {
        if ( state.backtracking==0 ) {

          												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getTypeGSSTmTcFormatTmTcFormatTypeEnumRuleCall_3_3_0_2_0());
          											
        }
        pushFollow(FollowSets000.FOLLOW_6);
        lv_type_18_0=ruleGSSTmTcFormatTmTcFormatType();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_56); if (state.failed) return ;

        }

        // InternalTM_TC_FORMAT.g:406:9: ( ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) ) )*
        loop27:
        do {
            int alt27=8;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt27=1;
                }
                break;
            case 29:
                {
                alt27=2;
                }
                break;
            case 30:
                {
                alt27=3;
                }
                break;
            case 32:
                {
                alt27=4;
                }
                break;
            case 31:
                {
                alt27=5;
                }
                break;
            case 34:
                {
                alt27=6;
                }
                break;
            case 35:
                {
                alt27=7;
                }
                break;

            }

            switch (alt27) {
        	case 1 :
        	    // InternalTM_TC_FORMAT.g:407:10: ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) )
        	    {
        	    // InternalTM_TC_FORMAT.g:407:10: ( (lv_CSField_20_0= ruleGSSTmTcFormatCSField ) )
        	    // InternalTM_TC_FORMAT.g:408:11: (lv_CSField_20_0= ruleGSSTmTcFormatCSField )
        	    {
        	    // InternalTM_TC_FORMAT.g:408:11: (lv_CSField_20_0= ruleGSSTmTcFormatCSField )
        	    // InternalTM_TC_FORMAT.g:409:12: lv_CSField_20_0= ruleGSSTmTcFormatCSField
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getCSFieldGSSTmTcFormatCSFieldParserRuleCall_3_3_1_0_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_56);
        	    lv_CSField_20_0=ruleGSSTmTcFormatCSField();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 2 :
        	    // InternalTM_TC_FORMAT.g:427:10: ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) )
        	    {
        	    // InternalTM_TC_FORMAT.g:427:10: ( (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField ) )
        	    // InternalTM_TC_FORMAT.g:428:11: (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField )
        	    {
        	    // InternalTM_TC_FORMAT.g:428:11: (lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField )
        	    // InternalTM_TC_FORMAT.g:429:12: lv_CSFormulaField_21_0= ruleGSSTmTcFormatCSFormulaField
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getCSFormulaFieldGSSTmTcFormatCSFormulaFieldParserRuleCall_3_3_1_1_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_56);
        	    lv_CSFormulaField_21_0=ruleGSSTmTcFormatCSFormulaField();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 3 :
        	    // InternalTM_TC_FORMAT.g:447:10: ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) )
        	    {
        	    // InternalTM_TC_FORMAT.g:447:10: ( (lv_VSField_22_0= ruleGSSTmTcFormatVSField ) )
        	    // InternalTM_TC_FORMAT.g:448:11: (lv_VSField_22_0= ruleGSSTmTcFormatVSField )
        	    {
        	    // InternalTM_TC_FORMAT.g:448:11: (lv_VSField_22_0= ruleGSSTmTcFormatVSField )
        	    // InternalTM_TC_FORMAT.g:449:12: lv_VSField_22_0= ruleGSSTmTcFormatVSField
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getVSFieldGSSTmTcFormatVSFieldParserRuleCall_3_3_1_2_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_56);
        	    lv_VSField_22_0=ruleGSSTmTcFormatVSField();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 4 :
        	    // InternalTM_TC_FORMAT.g:467:10: ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) )
        	    {
        	    // InternalTM_TC_FORMAT.g:467:10: ( (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField ) )
        	    // InternalTM_TC_FORMAT.g:468:11: (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField )
        	    {
        	    // InternalTM_TC_FORMAT.g:468:11: (lv_FDICField_23_0= ruleGSSTmTcFormatFDICField )
        	    // InternalTM_TC_FORMAT.g:469:12: lv_FDICField_23_0= ruleGSSTmTcFormatFDICField
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getFDICFieldGSSTmTcFormatFDICFieldParserRuleCall_3_3_1_3_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_56);
        	    lv_FDICField_23_0=ruleGSSTmTcFormatFDICField();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 5 :
        	    // InternalTM_TC_FORMAT.g:487:10: ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) )
        	    {
        	    // InternalTM_TC_FORMAT.g:487:10: ( (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize ) )
        	    // InternalTM_TC_FORMAT.g:488:11: (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize )
        	    {
        	    // InternalTM_TC_FORMAT.g:488:11: (lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize )
        	    // InternalTM_TC_FORMAT.g:489:12: lv_VRFieldSize_24_0= ruleGSSTmTcFormatVRFieldSize
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getVRFieldSizeGSSTmTcFormatVRFieldSizeParserRuleCall_3_3_1_4_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_56);
        	    lv_VRFieldSize_24_0=ruleGSSTmTcFormatVRFieldSize();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 6 :
        	    // InternalTM_TC_FORMAT.g:507:10: ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) )
        	    {
        	    // InternalTM_TC_FORMAT.g:507:10: ( (lv_AField_25_0= ruleGSSTmTcFormatAField ) )
        	    // InternalTM_TC_FORMAT.g:508:11: (lv_AField_25_0= ruleGSSTmTcFormatAField )
        	    {
        	    // InternalTM_TC_FORMAT.g:508:11: (lv_AField_25_0= ruleGSSTmTcFormatAField )
        	    // InternalTM_TC_FORMAT.g:509:12: lv_AField_25_0= ruleGSSTmTcFormatAField
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getAFieldGSSTmTcFormatAFieldParserRuleCall_3_3_1_5_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_56);
        	    lv_AField_25_0=ruleGSSTmTcFormatAField();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 7 :
        	    // InternalTM_TC_FORMAT.g:527:10: ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) )
        	    {
        	    // InternalTM_TC_FORMAT.g:527:10: ( (lv_AIField_26_0= ruleGSSTmTcFormatAIField ) )
        	    // InternalTM_TC_FORMAT.g:528:11: (lv_AIField_26_0= ruleGSSTmTcFormatAIField )
        	    {
        	    // InternalTM_TC_FORMAT.g:528:11: (lv_AIField_26_0= ruleGSSTmTcFormatAIField )
        	    // InternalTM_TC_FORMAT.g:529:12: lv_AIField_26_0= ruleGSSTmTcFormatAIField
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSTmTcFormatTmTcFormatAccess().getAIFieldGSSTmTcFormatAIFieldParserRuleCall_3_3_1_6_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_56);
        	    lv_AIField_26_0=ruleGSSTmTcFormatAIField();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop27;
            }
        } while (true);


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred12_InternalTM_TC_FORMAT

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
    public final boolean synpred12_InternalTM_TC_FORMAT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalTM_TC_FORMAT_fragment(); // can never throw exception
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


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000009000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001E0000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000003E0000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x3000000000000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000DE07E0000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x08000000000000C0L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004100000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0xC000000000000000L,0x000000000000003FL});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001C0L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000204000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000006000000000L,0x0000000000007800L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001000000200000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0008000000200000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0100000000000002L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000DE0400002L});
    }


}