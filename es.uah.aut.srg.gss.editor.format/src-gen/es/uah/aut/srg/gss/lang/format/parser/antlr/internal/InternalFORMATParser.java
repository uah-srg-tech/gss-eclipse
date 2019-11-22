package es.uah.aut.srg.gss.lang.format.parser.antlr.internal;

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
import es.uah.aut.srg.gss.lang.format.services.FORMATGrammarAccess;



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
public class InternalFORMATParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_HEXADECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "':='", "';'", "'GSSFormatFormat'", "'{'", "'uri'", "'version'", "'protocol'", "'type'", "'}'", "'GSSFormatCSField'", "'fid'", "'pfid'", "'name'", "'description'", "'byteOrder'", "'firstBit'", "'GSSFormatCSFormulaField'", "'GSSFormatVSField'", "'GSSFormatVRFieldSize'", "'GSSFormatFDICField'", "'checkType'", "'GSSFormatAField'", "'GSSFormatAIField'", "'GSSFormatSize'", "'bytes'", "'bits'", "'GSSFormatGlobalOffset'", "'GSSFormatFormula'", "'slope'", "'intercept'", "'GSSFormatConstSize'", "'GSSFormatMaxSize'", "'GSSFormatVariableSize'", "'fidRef'", "'unit'", "'power'", "'GSSFormatFloatingOffset'", "'GSSFormatSortedFieldsToCheck'", "'GSSFormatFieldToCheck'", "'GSSFormatArrayDimension'", "'maxItems'", "'GSSFormatLocalOffset'", "'GSSFormatArrayRef'", "'.'", "'-'", "'TM'", "'TC'", "'structured'", "'uint'", "'flag'", "'enumerated'", "'bit_vector'", "'byte_vector'", "'float'", "'deduced'", "'big_endian'", "'little_endian'", "'na'", "'MSB'", "'LSB'", "'halfword'", "'string10'", "'string17'", "'string69'", "'2bits'", "'2bits_with_0'", "'crc16'", "'checksum16'"
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


        public InternalFORMATParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFORMATParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFORMATParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFORMAT.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private FORMATGrammarAccess grammarAccess;

        public InternalFORMATParser(TokenStream input, FORMATGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GSSModelFile";
       	}

       	@Override
       	protected FORMATGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGSSModelFile"
    // InternalFORMAT.g:79:1: entryRuleGSSModelFile returns [EObject current=null] : iv_ruleGSSModelFile= ruleGSSModelFile EOF ;
    public final EObject entryRuleGSSModelFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSModelFile = null;


        try {
            // InternalFORMAT.g:79:53: (iv_ruleGSSModelFile= ruleGSSModelFile EOF )
            // InternalFORMAT.g:80:2: iv_ruleGSSModelFile= ruleGSSModelFile EOF
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
    // InternalFORMAT.g:86:1: ruleGSSModelFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSFormatFormat ) ) ) ;
    public final EObject ruleGSSModelFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalFORMAT.g:92:2: ( ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSFormatFormat ) ) ) )
            // InternalFORMAT.g:93:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSFormatFormat ) ) )
            {
            // InternalFORMAT.g:93:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSFormatFormat ) ) )
            // InternalFORMAT.g:94:3: ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSFormatFormat ) )
            {
            // InternalFORMAT.g:94:3: ( (lv_imports_0_0= ruleGSSModelFileImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFORMAT.g:95:4: (lv_imports_0_0= ruleGSSModelFileImport )
            	    {
            	    // InternalFORMAT.g:95:4: (lv_imports_0_0= ruleGSSModelFileImport )
            	    // InternalFORMAT.g:96:5: lv_imports_0_0= ruleGSSModelFileImport
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
            	      						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSModelFileImport");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalFORMAT.g:113:3: ( (lv_element_1_0= ruleGSSFormatFormat ) )
            // InternalFORMAT.g:114:4: (lv_element_1_0= ruleGSSFormatFormat )
            {
            // InternalFORMAT.g:114:4: (lv_element_1_0= ruleGSSFormatFormat )
            // InternalFORMAT.g:115:5: lv_element_1_0= ruleGSSFormatFormat
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSModelFileAccess().getElementGSSFormatFormatParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_1_0=ruleGSSFormatFormat();

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
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFormat");
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
    // InternalFORMAT.g:136:1: entryRuleGSSModelFileImport returns [EObject current=null] : iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF ;
    public final EObject entryRuleGSSModelFileImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSModelFileImport = null;


        try {
            // InternalFORMAT.g:136:59: (iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF )
            // InternalFORMAT.g:137:2: iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF
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
    // InternalFORMAT.g:143:1: ruleGSSModelFileImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleGSSModelFileImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalFORMAT.g:149:2: ( (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // InternalFORMAT.g:150:2: (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // InternalFORMAT.g:150:2: (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // InternalFORMAT.g:151:3: otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSModelFileImportAccess().getImportKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSModelFileImportAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalFORMAT.g:159:3: ( (lv_importURI_2_0= RULE_STRING ) )
            // InternalFORMAT.g:160:4: (lv_importURI_2_0= RULE_STRING )
            {
            // InternalFORMAT.g:160:4: (lv_importURI_2_0= RULE_STRING )
            // InternalFORMAT.g:161:5: lv_importURI_2_0= RULE_STRING
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


    // $ANTLR start "entryRuleGSSFormatFormat"
    // InternalFORMAT.g:185:1: entryRuleGSSFormatFormat returns [EObject current=null] : iv_ruleGSSFormatFormat= ruleGSSFormatFormat EOF ;
    public final EObject entryRuleGSSFormatFormat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFormatFormat = null;



        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalFORMAT.g:189:2: (iv_ruleGSSFormatFormat= ruleGSSFormatFormat EOF )
            // InternalFORMAT.g:190:2: iv_ruleGSSFormatFormat= ruleGSSFormatFormat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFormatFormatRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFormatFormat=ruleGSSFormatFormat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFormatFormat; 
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
    // $ANTLR end "entryRuleGSSFormatFormat"


    // $ANTLR start "ruleGSSFormatFormat"
    // InternalFORMAT.g:199:1: ruleGSSFormatFormat returns [EObject current=null] : (otherlv_0= 'GSSFormatFormat' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' otherlv_28= ';' ) ;
    public final EObject ruleGSSFormatFormat() throws RecognitionException {
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
        	grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalFORMAT.g:208:2: ( (otherlv_0= 'GSSFormatFormat' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' otherlv_28= ';' ) )
            // InternalFORMAT.g:209:2: (otherlv_0= 'GSSFormatFormat' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' otherlv_28= ';' )
            {
            // InternalFORMAT.g:209:2: (otherlv_0= 'GSSFormatFormat' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' otherlv_28= ';' )
            // InternalFORMAT.g:210:3: otherlv_0= 'GSSFormatFormat' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' otherlv_28= ';'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFormatFormatAccess().getGSSFormatFormatKeyword_0());
              		
            }
            // InternalFORMAT.g:214:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFORMAT.g:215:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFORMAT.g:215:4: (lv_name_1_0= RULE_ID )
            // InternalFORMAT.g:216:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getGSSFormatFormatAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFormatFormatRule());
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

              			newLeafNode(otherlv_2, grammarAccess.getGSSFormatFormatAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalFORMAT.g:236:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* ) ) ) ) )+ {...}?) ) )
            // InternalFORMAT.g:237:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* ) ) ) ) )+ {...}?) )
            {
            // InternalFORMAT.g:237:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* ) ) ) ) )+ {...}?) )
            // InternalFORMAT.g:238:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3());
            // InternalFORMAT.g:241:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* ) ) ) ) )+ {...}?)
            // InternalFORMAT.g:242:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* ) ) ) ) )+ {...}?
            {
            // InternalFORMAT.g:242:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=5;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 1) ) {
                    alt3=2;
                }
                else if ( LA3_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 2) ) {
                    alt3=3;
                }
                else if ( LA3_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 3) ) {
                    alt3=4;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFORMAT.g:243:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // InternalFORMAT.g:243:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    // InternalFORMAT.g:244:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSFormatFormat", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalFORMAT.g:244:112: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    // InternalFORMAT.g:245:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 0);
            	    // InternalFORMAT.g:248:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    // InternalFORMAT.g:248:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSFormatFormat", "true");
            	    }
            	    // InternalFORMAT.g:248:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    // InternalFORMAT.g:248:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_4, grammarAccess.getGSSFormatFormatAccess().getUriKeyword_3_0_0());
            	      								
            	    }
            	    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_5, grammarAccess.getGSSFormatFormatAccess().getColonEqualsSignKeyword_3_0_1());
            	      								
            	    }
            	    // InternalFORMAT.g:256:9: ( (lv_uri_6_0= ruleQualifiedName ) )
            	    // InternalFORMAT.g:257:10: (lv_uri_6_0= ruleQualifiedName )
            	    {
            	    // InternalFORMAT.g:257:10: (lv_uri_6_0= ruleQualifiedName )
            	    // InternalFORMAT.g:258:11: lv_uri_6_0= ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_uri_6_0=ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSFormatFormatRule());
            	      											}
            	      											set(
            	      												current,
            	      												"uri",
            	      												lv_uri_6_0,
            	      												"es.uah.aut.srg.gss.lang.format.FORMAT.QualifiedName");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getGSSFormatFormatAccess().getSemicolonKeyword_3_0_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalFORMAT.g:285:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // InternalFORMAT.g:285:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    // InternalFORMAT.g:286:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSFormatFormat", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalFORMAT.g:286:112: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    // InternalFORMAT.g:287:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 1);
            	    // InternalFORMAT.g:290:9: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    // InternalFORMAT.g:290:10: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSFormatFormat", "true");
            	    }
            	    // InternalFORMAT.g:290:19: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    // InternalFORMAT.g:290:20: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_8, grammarAccess.getGSSFormatFormatAccess().getVersionKeyword_3_1_0());
            	      								
            	    }
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_9, grammarAccess.getGSSFormatFormatAccess().getColonEqualsSignKeyword_3_1_1());
            	      								
            	    }
            	    // InternalFORMAT.g:298:9: ( (lv_version_10_0= ruleVersion ) )
            	    // InternalFORMAT.g:299:10: (lv_version_10_0= ruleVersion )
            	    {
            	    // InternalFORMAT.g:299:10: (lv_version_10_0= ruleVersion )
            	    // InternalFORMAT.g:300:11: lv_version_10_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getVersionVersionParserRuleCall_3_1_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_version_10_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSFormatFormatRule());
            	      											}
            	      											set(
            	      												current,
            	      												"version",
            	      												lv_version_10_0,
            	      												"es.uah.aut.srg.gss.lang.format.FORMAT.Version");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_11, grammarAccess.getGSSFormatFormatAccess().getSemicolonKeyword_3_1_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalFORMAT.g:327:4: ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // InternalFORMAT.g:327:4: ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) )
            	    // InternalFORMAT.g:328:5: {...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSFormatFormat", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalFORMAT.g:328:112: ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) )
            	    // InternalFORMAT.g:329:6: ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 2);
            	    // InternalFORMAT.g:332:9: ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) )
            	    // InternalFORMAT.g:332:10: {...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSFormatFormat", "true");
            	    }
            	    // InternalFORMAT.g:332:19: (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' )
            	    // InternalFORMAT.g:332:20: otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_12, grammarAccess.getGSSFormatFormatAccess().getProtocolKeyword_3_2_0());
            	      								
            	    }
            	    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_13, grammarAccess.getGSSFormatFormatAccess().getColonEqualsSignKeyword_3_2_1());
            	      								
            	    }
            	    // InternalFORMAT.g:340:9: ( (lv_protocol_14_0= RULE_ID ) )
            	    // InternalFORMAT.g:341:10: (lv_protocol_14_0= RULE_ID )
            	    {
            	    // InternalFORMAT.g:341:10: (lv_protocol_14_0= RULE_ID )
            	    // InternalFORMAT.g:342:11: lv_protocol_14_0= RULE_ID
            	    {
            	    lv_protocol_14_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											newLeafNode(lv_protocol_14_0, grammarAccess.getGSSFormatFormatAccess().getProtocolIDTerminalRuleCall_3_2_2_0());
            	      										
            	    }
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getGSSFormatFormatRule());
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

            	      									newLeafNode(otherlv_15, grammarAccess.getGSSFormatFormatAccess().getSemicolonKeyword_3_2_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalFORMAT.g:368:4: ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* ) ) ) )
            	    {
            	    // InternalFORMAT.g:368:4: ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* ) ) ) )
            	    // InternalFORMAT.g:369:5: {...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSFormatFormat", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalFORMAT.g:369:112: ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* ) ) )
            	    // InternalFORMAT.g:370:6: ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 3);
            	    // InternalFORMAT.g:373:9: ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* ) )
            	    // InternalFORMAT.g:373:10: {...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSFormatFormat", "true");
            	    }
            	    // InternalFORMAT.g:373:19: ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* )
            	    // InternalFORMAT.g:373:20: (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )*
            	    {
            	    // InternalFORMAT.g:373:20: (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' )
            	    // InternalFORMAT.g:374:10: otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_16, grammarAccess.getGSSFormatFormatAccess().getTypeKeyword_3_3_0_0());
            	      									
            	    }
            	    otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_17, grammarAccess.getGSSFormatFormatAccess().getColonEqualsSignKeyword_3_3_0_1());
            	      									
            	    }
            	    // InternalFORMAT.g:382:10: ( (lv_type_18_0= ruleGSSFormatFormatType ) )
            	    // InternalFORMAT.g:383:11: (lv_type_18_0= ruleGSSFormatFormatType )
            	    {
            	    // InternalFORMAT.g:383:11: (lv_type_18_0= ruleGSSFormatFormatType )
            	    // InternalFORMAT.g:384:12: lv_type_18_0= ruleGSSFormatFormatType
            	    {
            	    if ( state.backtracking==0 ) {

            	      												newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getTypeGSSFormatFormatTypeEnumRuleCall_3_3_0_2_0());
            	      											
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_type_18_0=ruleGSSFormatFormatType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      												if (current==null) {
            	      													current = createModelElementForParent(grammarAccess.getGSSFormatFormatRule());
            	      												}
            	      												set(
            	      													current,
            	      													"type",
            	      													lv_type_18_0,
            	      													"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFormatType");
            	      												afterParserOrEnumRuleCall();
            	      											
            	    }

            	    }


            	    }

            	    otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_19, grammarAccess.getGSSFormatFormatAccess().getSemicolonKeyword_3_3_0_3());
            	      									
            	    }

            	    }

            	    // InternalFORMAT.g:406:9: ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )*
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
            	    	    // InternalFORMAT.g:407:10: ( (lv_CSField_20_0= ruleGSSFormatCSField ) )
            	    	    {
            	    	    // InternalFORMAT.g:407:10: ( (lv_CSField_20_0= ruleGSSFormatCSField ) )
            	    	    // InternalFORMAT.g:408:11: (lv_CSField_20_0= ruleGSSFormatCSField )
            	    	    {
            	    	    // InternalFORMAT.g:408:11: (lv_CSField_20_0= ruleGSSFormatCSField )
            	    	    // InternalFORMAT.g:409:12: lv_CSField_20_0= ruleGSSFormatCSField
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getCSFieldGSSFormatCSFieldParserRuleCall_3_3_1_0_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_13);
            	    	    lv_CSField_20_0=ruleGSSFormatCSField();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSFormatFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"CSField",
            	    	      													lv_CSField_20_0,
            	    	      													"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatCSField");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalFORMAT.g:427:10: ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) )
            	    	    {
            	    	    // InternalFORMAT.g:427:10: ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) )
            	    	    // InternalFORMAT.g:428:11: (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField )
            	    	    {
            	    	    // InternalFORMAT.g:428:11: (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField )
            	    	    // InternalFORMAT.g:429:12: lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getCSFormulaFieldGSSFormatCSFormulaFieldParserRuleCall_3_3_1_1_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_13);
            	    	    lv_CSFormulaField_21_0=ruleGSSFormatCSFormulaField();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSFormatFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"CSFormulaField",
            	    	      													lv_CSFormulaField_21_0,
            	    	      													"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatCSFormulaField");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // InternalFORMAT.g:447:10: ( (lv_VSField_22_0= ruleGSSFormatVSField ) )
            	    	    {
            	    	    // InternalFORMAT.g:447:10: ( (lv_VSField_22_0= ruleGSSFormatVSField ) )
            	    	    // InternalFORMAT.g:448:11: (lv_VSField_22_0= ruleGSSFormatVSField )
            	    	    {
            	    	    // InternalFORMAT.g:448:11: (lv_VSField_22_0= ruleGSSFormatVSField )
            	    	    // InternalFORMAT.g:449:12: lv_VSField_22_0= ruleGSSFormatVSField
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getVSFieldGSSFormatVSFieldParserRuleCall_3_3_1_2_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_13);
            	    	    lv_VSField_22_0=ruleGSSFormatVSField();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSFormatFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"VSField",
            	    	      													lv_VSField_22_0,
            	    	      													"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatVSField");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 4 :
            	    	    // InternalFORMAT.g:467:10: ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) )
            	    	    {
            	    	    // InternalFORMAT.g:467:10: ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) )
            	    	    // InternalFORMAT.g:468:11: (lv_FDICField_23_0= ruleGSSFormatFDICField )
            	    	    {
            	    	    // InternalFORMAT.g:468:11: (lv_FDICField_23_0= ruleGSSFormatFDICField )
            	    	    // InternalFORMAT.g:469:12: lv_FDICField_23_0= ruleGSSFormatFDICField
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getFDICFieldGSSFormatFDICFieldParserRuleCall_3_3_1_3_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_13);
            	    	    lv_FDICField_23_0=ruleGSSFormatFDICField();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSFormatFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"FDICField",
            	    	      													lv_FDICField_23_0,
            	    	      													"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFDICField");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 5 :
            	    	    // InternalFORMAT.g:487:10: ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) )
            	    	    {
            	    	    // InternalFORMAT.g:487:10: ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) )
            	    	    // InternalFORMAT.g:488:11: (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize )
            	    	    {
            	    	    // InternalFORMAT.g:488:11: (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize )
            	    	    // InternalFORMAT.g:489:12: lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getVRFieldSizeGSSFormatVRFieldSizeParserRuleCall_3_3_1_4_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_13);
            	    	    lv_VRFieldSize_24_0=ruleGSSFormatVRFieldSize();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSFormatFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"VRFieldSize",
            	    	      													lv_VRFieldSize_24_0,
            	    	      													"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatVRFieldSize");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 6 :
            	    	    // InternalFORMAT.g:507:10: ( (lv_AField_25_0= ruleGSSFormatAField ) )
            	    	    {
            	    	    // InternalFORMAT.g:507:10: ( (lv_AField_25_0= ruleGSSFormatAField ) )
            	    	    // InternalFORMAT.g:508:11: (lv_AField_25_0= ruleGSSFormatAField )
            	    	    {
            	    	    // InternalFORMAT.g:508:11: (lv_AField_25_0= ruleGSSFormatAField )
            	    	    // InternalFORMAT.g:509:12: lv_AField_25_0= ruleGSSFormatAField
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getAFieldGSSFormatAFieldParserRuleCall_3_3_1_5_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_13);
            	    	    lv_AField_25_0=ruleGSSFormatAField();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSFormatFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"AField",
            	    	      													lv_AField_25_0,
            	    	      													"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatAField");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 7 :
            	    	    // InternalFORMAT.g:527:10: ( (lv_AIField_26_0= ruleGSSFormatAIField ) )
            	    	    {
            	    	    // InternalFORMAT.g:527:10: ( (lv_AIField_26_0= ruleGSSFormatAIField ) )
            	    	    // InternalFORMAT.g:528:11: (lv_AIField_26_0= ruleGSSFormatAIField )
            	    	    {
            	    	    // InternalFORMAT.g:528:11: (lv_AIField_26_0= ruleGSSFormatAIField )
            	    	    // InternalFORMAT.g:529:12: lv_AIField_26_0= ruleGSSFormatAIField
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getAIFieldGSSFormatAIFieldParserRuleCall_3_3_1_6_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_13);
            	    	    lv_AIField_26_0=ruleGSSFormatAIField();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSFormatFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"AIField",
            	    	      													lv_AIField_26_0,
            	    	      													"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatAIField");
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

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3());

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleGSSFormatFormat", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3());

            }

            otherlv_27=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSFormatFormatAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_28=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_28, grammarAccess.getGSSFormatFormatAccess().getSemicolonKeyword_5());
              		
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
    // $ANTLR end "ruleGSSFormatFormat"


    // $ANTLR start "entryRuleGSSFormatCSField"
    // InternalFORMAT.g:576:1: entryRuleGSSFormatCSField returns [EObject current=null] : iv_ruleGSSFormatCSField= ruleGSSFormatCSField EOF ;
    public final EObject entryRuleGSSFormatCSField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFormatCSField = null;


        try {
            // InternalFORMAT.g:576:57: (iv_ruleGSSFormatCSField= ruleGSSFormatCSField EOF )
            // InternalFORMAT.g:577:2: iv_ruleGSSFormatCSField= ruleGSSFormatCSField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFormatCSFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFormatCSField=ruleGSSFormatCSField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFormatCSField; 
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
    // $ANTLR end "entryRuleGSSFormatCSField"


    // $ANTLR start "ruleGSSFormatCSField"
    // InternalFORMAT.g:583:1: ruleGSSFormatCSField returns [EObject current=null] : (otherlv_0= 'GSSFormatCSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSFormatGlobalOffset ) ) otherlv_32= '}' otherlv_33= ';' ) ;
    public final EObject ruleGSSFormatCSField() throws RecognitionException {
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
            // InternalFORMAT.g:589:2: ( (otherlv_0= 'GSSFormatCSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSFormatGlobalOffset ) ) otherlv_32= '}' otherlv_33= ';' ) )
            // InternalFORMAT.g:590:2: (otherlv_0= 'GSSFormatCSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSFormatGlobalOffset ) ) otherlv_32= '}' otherlv_33= ';' )
            {
            // InternalFORMAT.g:590:2: (otherlv_0= 'GSSFormatCSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSFormatGlobalOffset ) ) otherlv_32= '}' otherlv_33= ';' )
            // InternalFORMAT.g:591:3: otherlv_0= 'GSSFormatCSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSFormatGlobalOffset ) ) otherlv_32= '}' otherlv_33= ';'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFormatCSFieldAccess().getGSSFormatCSFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFormatCSFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFormatCSFieldAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:607:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:608:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:608:4: (lv_fid_4_0= ruleINTEGER )
            // InternalFORMAT.g:609:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatCSFieldAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fid_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatCSFieldRule());
              					}
              					set(
              						current,
              						"fid",
              						lv_fid_4_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFormatCSFieldAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:638:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalFORMAT.g:639:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalFORMAT.g:639:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalFORMAT.g:640:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatCSFieldAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_pfid_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatCSFieldRule());
              					}
              					set(
              						current,
              						"pfid",
              						lv_pfid_8_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSFormatCSFieldAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalFORMAT.g:669:3: ( (lv_name_12_0= RULE_STRING ) )
            // InternalFORMAT.g:670:4: (lv_name_12_0= RULE_STRING )
            {
            // InternalFORMAT.g:670:4: (lv_name_12_0= RULE_STRING )
            // InternalFORMAT.g:671:5: lv_name_12_0= RULE_STRING
            {
            lv_name_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getGSSFormatCSFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFormatCSFieldRule());
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

              			newLeafNode(otherlv_13, grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_13());
              		
            }
            // InternalFORMAT.g:691:3: (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFORMAT.g:692:4: otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSFormatCSFieldAccess().getDescriptionKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalFORMAT.g:700:4: ( (lv_description_16_0= RULE_STRING ) )
                    // InternalFORMAT.g:701:5: (lv_description_16_0= RULE_STRING )
                    {
                    // InternalFORMAT.g:701:5: (lv_description_16_0= RULE_STRING )
                    // InternalFORMAT.g:702:6: lv_description_16_0= RULE_STRING
                    {
                    lv_description_16_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_16_0, grammarAccess.getGSSFormatCSFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSFormatCSFieldRule());
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

                      				newLeafNode(otherlv_17, grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSFormatCSFieldAccess().getTypeKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_16());
              		
            }
            // InternalFORMAT.g:731:3: ( (lv_type_20_0= ruleGSSFormatFieldType ) )
            // InternalFORMAT.g:732:4: (lv_type_20_0= ruleGSSFormatFieldType )
            {
            // InternalFORMAT.g:732:4: (lv_type_20_0= ruleGSSFormatFieldType )
            // InternalFORMAT.g:733:5: lv_type_20_0= ruleGSSFormatFieldType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatCSFieldAccess().getTypeGSSFormatFieldTypeEnumRuleCall_17_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_20_0=ruleGSSFormatFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatCSFieldRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_20_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_18());
              		
            }
            otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSFormatCSFieldAccess().getByteOrderKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_20());
              		
            }
            // InternalFORMAT.g:762:3: ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) )
            // InternalFORMAT.g:763:4: (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder )
            {
            // InternalFORMAT.g:763:4: (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder )
            // InternalFORMAT.g:764:5: lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatCSFieldAccess().getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_byteOrder_24_0=ruleGSSFormatFieldByteOrder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatCSFieldRule());
              					}
              					set(
              						current,
              						"byteOrder",
              						lv_byteOrder_24_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldByteOrder");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_22());
              		
            }
            otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSFormatCSFieldAccess().getFirstBitKeyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSFormatCSFieldAccess().getColonEqualsSignKeyword_24());
              		
            }
            // InternalFORMAT.g:793:3: ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) )
            // InternalFORMAT.g:794:4: (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit )
            {
            // InternalFORMAT.g:794:4: (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit )
            // InternalFORMAT.g:795:5: lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatCSFieldAccess().getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_firstBit_28_0=ruleGSSFormatSFieldFirstBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatCSFieldRule());
              					}
              					set(
              						current,
              						"firstBit",
              						lv_firstBit_28_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSFieldFirstBit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_26());
              		
            }
            // InternalFORMAT.g:816:3: ( (lv_size_30_0= ruleGSSFormatSize ) )
            // InternalFORMAT.g:817:4: (lv_size_30_0= ruleGSSFormatSize )
            {
            // InternalFORMAT.g:817:4: (lv_size_30_0= ruleGSSFormatSize )
            // InternalFORMAT.g:818:5: lv_size_30_0= ruleGSSFormatSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatCSFieldAccess().getSizeGSSFormatSizeParserRuleCall_27_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_size_30_0=ruleGSSFormatSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatCSFieldRule());
              					}
              					set(
              						current,
              						"size",
              						lv_size_30_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFORMAT.g:835:3: ( (lv_globalOffset_31_0= ruleGSSFormatGlobalOffset ) )
            // InternalFORMAT.g:836:4: (lv_globalOffset_31_0= ruleGSSFormatGlobalOffset )
            {
            // InternalFORMAT.g:836:4: (lv_globalOffset_31_0= ruleGSSFormatGlobalOffset )
            // InternalFORMAT.g:837:5: lv_globalOffset_31_0= ruleGSSFormatGlobalOffset
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatCSFieldAccess().getGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_27);
            lv_globalOffset_31_0=ruleGSSFormatGlobalOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatCSFieldRule());
              					}
              					set(
              						current,
              						"globalOffset",
              						lv_globalOffset_31_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatGlobalOffset");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_32=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_32, grammarAccess.getGSSFormatCSFieldAccess().getRightCurlyBracketKeyword_29());
              		
            }
            otherlv_33=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_33, grammarAccess.getGSSFormatCSFieldAccess().getSemicolonKeyword_30());
              		
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
    // $ANTLR end "ruleGSSFormatCSField"


    // $ANTLR start "entryRuleGSSFormatCSFormulaField"
    // InternalFORMAT.g:866:1: entryRuleGSSFormatCSFormulaField returns [EObject current=null] : iv_ruleGSSFormatCSFormulaField= ruleGSSFormatCSFormulaField EOF ;
    public final EObject entryRuleGSSFormatCSFormulaField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFormatCSFormulaField = null;


        try {
            // InternalFORMAT.g:866:64: (iv_ruleGSSFormatCSFormulaField= ruleGSSFormatCSFormulaField EOF )
            // InternalFORMAT.g:867:2: iv_ruleGSSFormatCSFormulaField= ruleGSSFormatCSFormulaField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFormatCSFormulaFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFormatCSFormulaField=ruleGSSFormatCSFormulaField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFormatCSFormulaField; 
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
    // $ANTLR end "entryRuleGSSFormatCSFormulaField"


    // $ANTLR start "ruleGSSFormatCSFormulaField"
    // InternalFORMAT.g:873:1: ruleGSSFormatCSFormulaField returns [EObject current=null] : (otherlv_0= 'GSSFormatCSFormulaField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSFormatGlobalOffset ) ) ( (lv_formula_32_0= ruleGSSFormatFormula ) ) otherlv_33= '}' otherlv_34= ';' ) ;
    public final EObject ruleGSSFormatCSFormulaField() throws RecognitionException {
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
            // InternalFORMAT.g:879:2: ( (otherlv_0= 'GSSFormatCSFormulaField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSFormatGlobalOffset ) ) ( (lv_formula_32_0= ruleGSSFormatFormula ) ) otherlv_33= '}' otherlv_34= ';' ) )
            // InternalFORMAT.g:880:2: (otherlv_0= 'GSSFormatCSFormulaField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSFormatGlobalOffset ) ) ( (lv_formula_32_0= ruleGSSFormatFormula ) ) otherlv_33= '}' otherlv_34= ';' )
            {
            // InternalFORMAT.g:880:2: (otherlv_0= 'GSSFormatCSFormulaField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSFormatGlobalOffset ) ) ( (lv_formula_32_0= ruleGSSFormatFormula ) ) otherlv_33= '}' otherlv_34= ';' )
            // InternalFORMAT.g:881:3: otherlv_0= 'GSSFormatCSFormulaField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSFormatSize ) ) ( (lv_globalOffset_31_0= ruleGSSFormatGlobalOffset ) ) ( (lv_formula_32_0= ruleGSSFormatFormula ) ) otherlv_33= '}' otherlv_34= ';'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFormatCSFormulaFieldAccess().getGSSFormatCSFormulaFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFormatCSFormulaFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFormatCSFormulaFieldAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:897:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:898:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:898:4: (lv_fid_4_0= ruleINTEGER )
            // InternalFORMAT.g:899:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatCSFormulaFieldAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fid_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatCSFormulaFieldRule());
              					}
              					set(
              						current,
              						"fid",
              						lv_fid_4_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFormatCSFormulaFieldAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:928:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalFORMAT.g:929:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalFORMAT.g:929:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalFORMAT.g:930:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatCSFormulaFieldAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_pfid_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatCSFormulaFieldRule());
              					}
              					set(
              						current,
              						"pfid",
              						lv_pfid_8_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSFormatCSFormulaFieldAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalFORMAT.g:959:3: ( (lv_name_12_0= RULE_STRING ) )
            // InternalFORMAT.g:960:4: (lv_name_12_0= RULE_STRING )
            {
            // InternalFORMAT.g:960:4: (lv_name_12_0= RULE_STRING )
            // InternalFORMAT.g:961:5: lv_name_12_0= RULE_STRING
            {
            lv_name_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getGSSFormatCSFormulaFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFormatCSFormulaFieldRule());
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

              			newLeafNode(otherlv_13, grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_13());
              		
            }
            // InternalFORMAT.g:981:3: (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFORMAT.g:982:4: otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSFormatCSFormulaFieldAccess().getDescriptionKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalFORMAT.g:990:4: ( (lv_description_16_0= RULE_STRING ) )
                    // InternalFORMAT.g:991:5: (lv_description_16_0= RULE_STRING )
                    {
                    // InternalFORMAT.g:991:5: (lv_description_16_0= RULE_STRING )
                    // InternalFORMAT.g:992:6: lv_description_16_0= RULE_STRING
                    {
                    lv_description_16_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_16_0, grammarAccess.getGSSFormatCSFormulaFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSFormatCSFormulaFieldRule());
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

                      				newLeafNode(otherlv_17, grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSFormatCSFormulaFieldAccess().getTypeKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_16());
              		
            }
            // InternalFORMAT.g:1021:3: ( (lv_type_20_0= ruleGSSFormatFieldType ) )
            // InternalFORMAT.g:1022:4: (lv_type_20_0= ruleGSSFormatFieldType )
            {
            // InternalFORMAT.g:1022:4: (lv_type_20_0= ruleGSSFormatFieldType )
            // InternalFORMAT.g:1023:5: lv_type_20_0= ruleGSSFormatFieldType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatCSFormulaFieldAccess().getTypeGSSFormatFieldTypeEnumRuleCall_17_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_20_0=ruleGSSFormatFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatCSFormulaFieldRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_20_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_18());
              		
            }
            otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSFormatCSFormulaFieldAccess().getByteOrderKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_20());
              		
            }
            // InternalFORMAT.g:1052:3: ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) )
            // InternalFORMAT.g:1053:4: (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder )
            {
            // InternalFORMAT.g:1053:4: (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder )
            // InternalFORMAT.g:1054:5: lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatCSFormulaFieldAccess().getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_byteOrder_24_0=ruleGSSFormatFieldByteOrder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatCSFormulaFieldRule());
              					}
              					set(
              						current,
              						"byteOrder",
              						lv_byteOrder_24_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldByteOrder");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_22());
              		
            }
            otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSFormatCSFormulaFieldAccess().getFirstBitKeyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_24());
              		
            }
            // InternalFORMAT.g:1083:3: ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) )
            // InternalFORMAT.g:1084:4: (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit )
            {
            // InternalFORMAT.g:1084:4: (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit )
            // InternalFORMAT.g:1085:5: lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatCSFormulaFieldAccess().getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_firstBit_28_0=ruleGSSFormatSFieldFirstBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatCSFormulaFieldRule());
              					}
              					set(
              						current,
              						"firstBit",
              						lv_firstBit_28_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSFieldFirstBit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_26());
              		
            }
            // InternalFORMAT.g:1106:3: ( (lv_size_30_0= ruleGSSFormatSize ) )
            // InternalFORMAT.g:1107:4: (lv_size_30_0= ruleGSSFormatSize )
            {
            // InternalFORMAT.g:1107:4: (lv_size_30_0= ruleGSSFormatSize )
            // InternalFORMAT.g:1108:5: lv_size_30_0= ruleGSSFormatSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatCSFormulaFieldAccess().getSizeGSSFormatSizeParserRuleCall_27_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_size_30_0=ruleGSSFormatSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatCSFormulaFieldRule());
              					}
              					set(
              						current,
              						"size",
              						lv_size_30_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFORMAT.g:1125:3: ( (lv_globalOffset_31_0= ruleGSSFormatGlobalOffset ) )
            // InternalFORMAT.g:1126:4: (lv_globalOffset_31_0= ruleGSSFormatGlobalOffset )
            {
            // InternalFORMAT.g:1126:4: (lv_globalOffset_31_0= ruleGSSFormatGlobalOffset )
            // InternalFORMAT.g:1127:5: lv_globalOffset_31_0= ruleGSSFormatGlobalOffset
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatCSFormulaFieldAccess().getGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_28);
            lv_globalOffset_31_0=ruleGSSFormatGlobalOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatCSFormulaFieldRule());
              					}
              					set(
              						current,
              						"globalOffset",
              						lv_globalOffset_31_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatGlobalOffset");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFORMAT.g:1144:3: ( (lv_formula_32_0= ruleGSSFormatFormula ) )
            // InternalFORMAT.g:1145:4: (lv_formula_32_0= ruleGSSFormatFormula )
            {
            // InternalFORMAT.g:1145:4: (lv_formula_32_0= ruleGSSFormatFormula )
            // InternalFORMAT.g:1146:5: lv_formula_32_0= ruleGSSFormatFormula
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatCSFormulaFieldAccess().getFormulaGSSFormatFormulaParserRuleCall_29_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_27);
            lv_formula_32_0=ruleGSSFormatFormula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatCSFormulaFieldRule());
              					}
              					set(
              						current,
              						"formula",
              						lv_formula_32_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFormula");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_33=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_33, grammarAccess.getGSSFormatCSFormulaFieldAccess().getRightCurlyBracketKeyword_30());
              		
            }
            otherlv_34=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_34, grammarAccess.getGSSFormatCSFormulaFieldAccess().getSemicolonKeyword_31());
              		
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
    // $ANTLR end "ruleGSSFormatCSFormulaField"


    // $ANTLR start "entryRuleGSSFormatVSField"
    // InternalFORMAT.g:1175:1: entryRuleGSSFormatVSField returns [EObject current=null] : iv_ruleGSSFormatVSField= ruleGSSFormatVSField EOF ;
    public final EObject entryRuleGSSFormatVSField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFormatVSField = null;


        try {
            // InternalFORMAT.g:1175:57: (iv_ruleGSSFormatVSField= ruleGSSFormatVSField EOF )
            // InternalFORMAT.g:1176:2: iv_ruleGSSFormatVSField= ruleGSSFormatVSField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFormatVSFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFormatVSField=ruleGSSFormatVSField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFormatVSField; 
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
    // $ANTLR end "entryRuleGSSFormatVSField"


    // $ANTLR start "ruleGSSFormatVSField"
    // InternalFORMAT.g:1182:1: ruleGSSFormatVSField returns [EObject current=null] : (otherlv_0= 'GSSFormatVSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_constSize_30_0= ruleGSSFormatConstSize ) ) ( (lv_variableSize_31_0= ruleGSSFormatVariableSize ) ) ( (lv_maxSize_32_0= ruleGSSFormatMaxSize ) ) ( (lv_globalOffset_33_0= ruleGSSFormatGlobalOffset ) ) otherlv_34= '}' otherlv_35= ';' ) ;
    public final EObject ruleGSSFormatVSField() throws RecognitionException {
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

        EObject lv_variableSize_31_0 = null;

        EObject lv_maxSize_32_0 = null;

        EObject lv_globalOffset_33_0 = null;



        	enterRule();

        try {
            // InternalFORMAT.g:1188:2: ( (otherlv_0= 'GSSFormatVSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_constSize_30_0= ruleGSSFormatConstSize ) ) ( (lv_variableSize_31_0= ruleGSSFormatVariableSize ) ) ( (lv_maxSize_32_0= ruleGSSFormatMaxSize ) ) ( (lv_globalOffset_33_0= ruleGSSFormatGlobalOffset ) ) otherlv_34= '}' otherlv_35= ';' ) )
            // InternalFORMAT.g:1189:2: (otherlv_0= 'GSSFormatVSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_constSize_30_0= ruleGSSFormatConstSize ) ) ( (lv_variableSize_31_0= ruleGSSFormatVariableSize ) ) ( (lv_maxSize_32_0= ruleGSSFormatMaxSize ) ) ( (lv_globalOffset_33_0= ruleGSSFormatGlobalOffset ) ) otherlv_34= '}' otherlv_35= ';' )
            {
            // InternalFORMAT.g:1189:2: (otherlv_0= 'GSSFormatVSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_constSize_30_0= ruleGSSFormatConstSize ) ) ( (lv_variableSize_31_0= ruleGSSFormatVariableSize ) ) ( (lv_maxSize_32_0= ruleGSSFormatMaxSize ) ) ( (lv_globalOffset_33_0= ruleGSSFormatGlobalOffset ) ) otherlv_34= '}' otherlv_35= ';' )
            // InternalFORMAT.g:1190:3: otherlv_0= 'GSSFormatVSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_constSize_30_0= ruleGSSFormatConstSize ) ) ( (lv_variableSize_31_0= ruleGSSFormatVariableSize ) ) ( (lv_maxSize_32_0= ruleGSSFormatMaxSize ) ) ( (lv_globalOffset_33_0= ruleGSSFormatGlobalOffset ) ) otherlv_34= '}' otherlv_35= ';'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFormatVSFieldAccess().getGSSFormatVSFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFormatVSFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFormatVSFieldAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:1206:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:1207:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:1207:4: (lv_fid_4_0= ruleINTEGER )
            // InternalFORMAT.g:1208:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatVSFieldAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fid_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatVSFieldRule());
              					}
              					set(
              						current,
              						"fid",
              						lv_fid_4_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFormatVSFieldAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:1237:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalFORMAT.g:1238:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalFORMAT.g:1238:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalFORMAT.g:1239:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatVSFieldAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_pfid_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatVSFieldRule());
              					}
              					set(
              						current,
              						"pfid",
              						lv_pfid_8_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSFormatVSFieldAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalFORMAT.g:1268:3: ( (lv_name_12_0= RULE_STRING ) )
            // InternalFORMAT.g:1269:4: (lv_name_12_0= RULE_STRING )
            {
            // InternalFORMAT.g:1269:4: (lv_name_12_0= RULE_STRING )
            // InternalFORMAT.g:1270:5: lv_name_12_0= RULE_STRING
            {
            lv_name_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getGSSFormatVSFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFormatVSFieldRule());
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

              			newLeafNode(otherlv_13, grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_13());
              		
            }
            // InternalFORMAT.g:1290:3: (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFORMAT.g:1291:4: otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSFormatVSFieldAccess().getDescriptionKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalFORMAT.g:1299:4: ( (lv_description_16_0= RULE_STRING ) )
                    // InternalFORMAT.g:1300:5: (lv_description_16_0= RULE_STRING )
                    {
                    // InternalFORMAT.g:1300:5: (lv_description_16_0= RULE_STRING )
                    // InternalFORMAT.g:1301:6: lv_description_16_0= RULE_STRING
                    {
                    lv_description_16_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_16_0, grammarAccess.getGSSFormatVSFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSFormatVSFieldRule());
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

                      				newLeafNode(otherlv_17, grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSFormatVSFieldAccess().getTypeKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_16());
              		
            }
            // InternalFORMAT.g:1330:3: ( (lv_type_20_0= ruleGSSFormatFieldType ) )
            // InternalFORMAT.g:1331:4: (lv_type_20_0= ruleGSSFormatFieldType )
            {
            // InternalFORMAT.g:1331:4: (lv_type_20_0= ruleGSSFormatFieldType )
            // InternalFORMAT.g:1332:5: lv_type_20_0= ruleGSSFormatFieldType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatVSFieldAccess().getTypeGSSFormatFieldTypeEnumRuleCall_17_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_20_0=ruleGSSFormatFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatVSFieldRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_20_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_18());
              		
            }
            otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSFormatVSFieldAccess().getByteOrderKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_20());
              		
            }
            // InternalFORMAT.g:1361:3: ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) )
            // InternalFORMAT.g:1362:4: (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder )
            {
            // InternalFORMAT.g:1362:4: (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder )
            // InternalFORMAT.g:1363:5: lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatVSFieldAccess().getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_byteOrder_24_0=ruleGSSFormatFieldByteOrder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatVSFieldRule());
              					}
              					set(
              						current,
              						"byteOrder",
              						lv_byteOrder_24_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldByteOrder");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_22());
              		
            }
            otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSFormatVSFieldAccess().getFirstBitKeyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSFormatVSFieldAccess().getColonEqualsSignKeyword_24());
              		
            }
            // InternalFORMAT.g:1392:3: ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) )
            // InternalFORMAT.g:1393:4: (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit )
            {
            // InternalFORMAT.g:1393:4: (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit )
            // InternalFORMAT.g:1394:5: lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatVSFieldAccess().getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_firstBit_28_0=ruleGSSFormatSFieldFirstBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatVSFieldRule());
              					}
              					set(
              						current,
              						"firstBit",
              						lv_firstBit_28_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSFieldFirstBit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_26());
              		
            }
            // InternalFORMAT.g:1415:3: ( (lv_constSize_30_0= ruleGSSFormatConstSize ) )
            // InternalFORMAT.g:1416:4: (lv_constSize_30_0= ruleGSSFormatConstSize )
            {
            // InternalFORMAT.g:1416:4: (lv_constSize_30_0= ruleGSSFormatConstSize )
            // InternalFORMAT.g:1417:5: lv_constSize_30_0= ruleGSSFormatConstSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatVSFieldAccess().getConstSizeGSSFormatConstSizeParserRuleCall_27_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_30);
            lv_constSize_30_0=ruleGSSFormatConstSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatVSFieldRule());
              					}
              					set(
              						current,
              						"constSize",
              						lv_constSize_30_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatConstSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFORMAT.g:1434:3: ( (lv_variableSize_31_0= ruleGSSFormatVariableSize ) )
            // InternalFORMAT.g:1435:4: (lv_variableSize_31_0= ruleGSSFormatVariableSize )
            {
            // InternalFORMAT.g:1435:4: (lv_variableSize_31_0= ruleGSSFormatVariableSize )
            // InternalFORMAT.g:1436:5: lv_variableSize_31_0= ruleGSSFormatVariableSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatVSFieldAccess().getVariableSizeGSSFormatVariableSizeParserRuleCall_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_31);
            lv_variableSize_31_0=ruleGSSFormatVariableSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatVSFieldRule());
              					}
              					set(
              						current,
              						"variableSize",
              						lv_variableSize_31_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatVariableSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFORMAT.g:1453:3: ( (lv_maxSize_32_0= ruleGSSFormatMaxSize ) )
            // InternalFORMAT.g:1454:4: (lv_maxSize_32_0= ruleGSSFormatMaxSize )
            {
            // InternalFORMAT.g:1454:4: (lv_maxSize_32_0= ruleGSSFormatMaxSize )
            // InternalFORMAT.g:1455:5: lv_maxSize_32_0= ruleGSSFormatMaxSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatVSFieldAccess().getMaxSizeGSSFormatMaxSizeParserRuleCall_29_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_maxSize_32_0=ruleGSSFormatMaxSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatVSFieldRule());
              					}
              					set(
              						current,
              						"maxSize",
              						lv_maxSize_32_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatMaxSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFORMAT.g:1472:3: ( (lv_globalOffset_33_0= ruleGSSFormatGlobalOffset ) )
            // InternalFORMAT.g:1473:4: (lv_globalOffset_33_0= ruleGSSFormatGlobalOffset )
            {
            // InternalFORMAT.g:1473:4: (lv_globalOffset_33_0= ruleGSSFormatGlobalOffset )
            // InternalFORMAT.g:1474:5: lv_globalOffset_33_0= ruleGSSFormatGlobalOffset
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatVSFieldAccess().getGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_30_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_27);
            lv_globalOffset_33_0=ruleGSSFormatGlobalOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatVSFieldRule());
              					}
              					set(
              						current,
              						"globalOffset",
              						lv_globalOffset_33_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatGlobalOffset");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_34=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_34, grammarAccess.getGSSFormatVSFieldAccess().getRightCurlyBracketKeyword_31());
              		
            }
            otherlv_35=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_35, grammarAccess.getGSSFormatVSFieldAccess().getSemicolonKeyword_32());
              		
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
    // $ANTLR end "ruleGSSFormatVSField"


    // $ANTLR start "entryRuleGSSFormatVRFieldSize"
    // InternalFORMAT.g:1503:1: entryRuleGSSFormatVRFieldSize returns [EObject current=null] : iv_ruleGSSFormatVRFieldSize= ruleGSSFormatVRFieldSize EOF ;
    public final EObject entryRuleGSSFormatVRFieldSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFormatVRFieldSize = null;


        try {
            // InternalFORMAT.g:1503:61: (iv_ruleGSSFormatVRFieldSize= ruleGSSFormatVRFieldSize EOF )
            // InternalFORMAT.g:1504:2: iv_ruleGSSFormatVRFieldSize= ruleGSSFormatVRFieldSize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFormatVRFieldSizeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFormatVRFieldSize=ruleGSSFormatVRFieldSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFormatVRFieldSize; 
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
    // $ANTLR end "entryRuleGSSFormatVRFieldSize"


    // $ANTLR start "ruleGSSFormatVRFieldSize"
    // InternalFORMAT.g:1510:1: ruleGSSFormatVRFieldSize returns [EObject current=null] : (otherlv_0= 'GSSFormatVRFieldSize' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) ;
    public final EObject ruleGSSFormatVRFieldSize() throws RecognitionException {
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
            // InternalFORMAT.g:1516:2: ( (otherlv_0= 'GSSFormatVRFieldSize' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) )
            // InternalFORMAT.g:1517:2: (otherlv_0= 'GSSFormatVRFieldSize' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            {
            // InternalFORMAT.g:1517:2: (otherlv_0= 'GSSFormatVRFieldSize' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            // InternalFORMAT.g:1518:3: otherlv_0= 'GSSFormatVRFieldSize' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFormatVRFieldSizeAccess().getGSSFormatVRFieldSizeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFormatVRFieldSizeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFormatVRFieldSizeAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFormatVRFieldSizeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:1534:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:1535:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:1535:4: (lv_fid_4_0= ruleINTEGER )
            // InternalFORMAT.g:1536:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatVRFieldSizeAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fid_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatVRFieldSizeRule());
              					}
              					set(
              						current,
              						"fid",
              						lv_fid_4_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFormatVRFieldSizeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFormatVRFieldSizeAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFormatVRFieldSizeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:1565:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalFORMAT.g:1566:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalFORMAT.g:1566:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalFORMAT.g:1567:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatVRFieldSizeAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_pfid_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatVRFieldSizeRule());
              					}
              					set(
              						current,
              						"pfid",
              						lv_pfid_8_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFormatVRFieldSizeAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSFormatVRFieldSizeAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSFormatVRFieldSizeAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalFORMAT.g:1596:3: ( (lv_name_12_0= RULE_STRING ) )
            // InternalFORMAT.g:1597:4: (lv_name_12_0= RULE_STRING )
            {
            // InternalFORMAT.g:1597:4: (lv_name_12_0= RULE_STRING )
            // InternalFORMAT.g:1598:5: lv_name_12_0= RULE_STRING
            {
            lv_name_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getGSSFormatVRFieldSizeAccess().getNameSTRINGTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFormatVRFieldSizeRule());
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

              			newLeafNode(otherlv_13, grammarAccess.getGSSFormatVRFieldSizeAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSFormatVRFieldSizeAccess().getRightCurlyBracketKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSFormatVRFieldSizeAccess().getSemicolonKeyword_15());
              		
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
    // $ANTLR end "ruleGSSFormatVRFieldSize"


    // $ANTLR start "entryRuleGSSFormatFDICField"
    // InternalFORMAT.g:1630:1: entryRuleGSSFormatFDICField returns [EObject current=null] : iv_ruleGSSFormatFDICField= ruleGSSFormatFDICField EOF ;
    public final EObject entryRuleGSSFormatFDICField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFormatFDICField = null;


        try {
            // InternalFORMAT.g:1630:59: (iv_ruleGSSFormatFDICField= ruleGSSFormatFDICField EOF )
            // InternalFORMAT.g:1631:2: iv_ruleGSSFormatFDICField= ruleGSSFormatFDICField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFormatFDICFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFormatFDICField=ruleGSSFormatFDICField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFormatFDICField; 
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
    // $ANTLR end "entryRuleGSSFormatFDICField"


    // $ANTLR start "ruleGSSFormatFDICField"
    // InternalFORMAT.g:1637:1: ruleGSSFormatFDICField returns [EObject current=null] : (otherlv_0= 'GSSFormatFDICField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'checkType' otherlv_19= ':=' ( (lv_checkType_20_0= ruleGSSFormatCheckType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSFormatSize ) ) ( (lv_floatingOffset_31_0= ruleGSSFormatFloatingOffset ) ) ( (lv_sortedFieldsToCheck_32_0= ruleGSSFormatSortedFieldsToCheck ) ) otherlv_33= '}' otherlv_34= ';' ) ;
    public final EObject ruleGSSFormatFDICField() throws RecognitionException {
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
            // InternalFORMAT.g:1643:2: ( (otherlv_0= 'GSSFormatFDICField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'checkType' otherlv_19= ':=' ( (lv_checkType_20_0= ruleGSSFormatCheckType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSFormatSize ) ) ( (lv_floatingOffset_31_0= ruleGSSFormatFloatingOffset ) ) ( (lv_sortedFieldsToCheck_32_0= ruleGSSFormatSortedFieldsToCheck ) ) otherlv_33= '}' otherlv_34= ';' ) )
            // InternalFORMAT.g:1644:2: (otherlv_0= 'GSSFormatFDICField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'checkType' otherlv_19= ':=' ( (lv_checkType_20_0= ruleGSSFormatCheckType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSFormatSize ) ) ( (lv_floatingOffset_31_0= ruleGSSFormatFloatingOffset ) ) ( (lv_sortedFieldsToCheck_32_0= ruleGSSFormatSortedFieldsToCheck ) ) otherlv_33= '}' otherlv_34= ';' )
            {
            // InternalFORMAT.g:1644:2: (otherlv_0= 'GSSFormatFDICField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'checkType' otherlv_19= ':=' ( (lv_checkType_20_0= ruleGSSFormatCheckType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSFormatSize ) ) ( (lv_floatingOffset_31_0= ruleGSSFormatFloatingOffset ) ) ( (lv_sortedFieldsToCheck_32_0= ruleGSSFormatSortedFieldsToCheck ) ) otherlv_33= '}' otherlv_34= ';' )
            // InternalFORMAT.g:1645:3: otherlv_0= 'GSSFormatFDICField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'checkType' otherlv_19= ':=' ( (lv_checkType_20_0= ruleGSSFormatCheckType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleGSSFormatSize ) ) ( (lv_floatingOffset_31_0= ruleGSSFormatFloatingOffset ) ) ( (lv_sortedFieldsToCheck_32_0= ruleGSSFormatSortedFieldsToCheck ) ) otherlv_33= '}' otherlv_34= ';'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFormatFDICFieldAccess().getGSSFormatFDICFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFormatFDICFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFormatFDICFieldAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:1661:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:1662:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:1662:4: (lv_fid_4_0= ruleINTEGER )
            // InternalFORMAT.g:1663:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatFDICFieldAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fid_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatFDICFieldRule());
              					}
              					set(
              						current,
              						"fid",
              						lv_fid_4_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFormatFDICFieldAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:1692:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalFORMAT.g:1693:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalFORMAT.g:1693:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalFORMAT.g:1694:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatFDICFieldAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_pfid_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatFDICFieldRule());
              					}
              					set(
              						current,
              						"pfid",
              						lv_pfid_8_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSFormatFDICFieldAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalFORMAT.g:1723:3: ( (lv_name_12_0= RULE_STRING ) )
            // InternalFORMAT.g:1724:4: (lv_name_12_0= RULE_STRING )
            {
            // InternalFORMAT.g:1724:4: (lv_name_12_0= RULE_STRING )
            // InternalFORMAT.g:1725:5: lv_name_12_0= RULE_STRING
            {
            lv_name_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getGSSFormatFDICFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFormatFDICFieldRule());
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

              			newLeafNode(otherlv_13, grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_13());
              		
            }
            // InternalFORMAT.g:1745:3: (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalFORMAT.g:1746:4: otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSFormatFDICFieldAccess().getDescriptionKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalFORMAT.g:1754:4: ( (lv_description_16_0= RULE_STRING ) )
                    // InternalFORMAT.g:1755:5: (lv_description_16_0= RULE_STRING )
                    {
                    // InternalFORMAT.g:1755:5: (lv_description_16_0= RULE_STRING )
                    // InternalFORMAT.g:1756:6: lv_description_16_0= RULE_STRING
                    {
                    lv_description_16_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_16_0, grammarAccess.getGSSFormatFDICFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSFormatFDICFieldRule());
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

                      				newLeafNode(otherlv_17, grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,33,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSFormatFDICFieldAccess().getCheckTypeKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_16());
              		
            }
            // InternalFORMAT.g:1785:3: ( (lv_checkType_20_0= ruleGSSFormatCheckType ) )
            // InternalFORMAT.g:1786:4: (lv_checkType_20_0= ruleGSSFormatCheckType )
            {
            // InternalFORMAT.g:1786:4: (lv_checkType_20_0= ruleGSSFormatCheckType )
            // InternalFORMAT.g:1787:5: lv_checkType_20_0= ruleGSSFormatCheckType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatFDICFieldAccess().getCheckTypeGSSFormatCheckTypeEnumRuleCall_17_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_checkType_20_0=ruleGSSFormatCheckType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatFDICFieldRule());
              					}
              					set(
              						current,
              						"checkType",
              						lv_checkType_20_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatCheckType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_18());
              		
            }
            otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSFormatFDICFieldAccess().getByteOrderKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_20());
              		
            }
            // InternalFORMAT.g:1816:3: ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) )
            // InternalFORMAT.g:1817:4: (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder )
            {
            // InternalFORMAT.g:1817:4: (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder )
            // InternalFORMAT.g:1818:5: lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatFDICFieldAccess().getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_byteOrder_24_0=ruleGSSFormatFieldByteOrder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatFDICFieldRule());
              					}
              					set(
              						current,
              						"byteOrder",
              						lv_byteOrder_24_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldByteOrder");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_22());
              		
            }
            otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSFormatFDICFieldAccess().getFirstBitKeyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSFormatFDICFieldAccess().getColonEqualsSignKeyword_24());
              		
            }
            // InternalFORMAT.g:1847:3: ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) )
            // InternalFORMAT.g:1848:4: (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit )
            {
            // InternalFORMAT.g:1848:4: (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit )
            // InternalFORMAT.g:1849:5: lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatFDICFieldAccess().getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_firstBit_28_0=ruleGSSFormatSFieldFirstBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatFDICFieldRule());
              					}
              					set(
              						current,
              						"firstBit",
              						lv_firstBit_28_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSFieldFirstBit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_26());
              		
            }
            // InternalFORMAT.g:1870:3: ( (lv_size_30_0= ruleGSSFormatSize ) )
            // InternalFORMAT.g:1871:4: (lv_size_30_0= ruleGSSFormatSize )
            {
            // InternalFORMAT.g:1871:4: (lv_size_30_0= ruleGSSFormatSize )
            // InternalFORMAT.g:1872:5: lv_size_30_0= ruleGSSFormatSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatFDICFieldAccess().getSizeGSSFormatSizeParserRuleCall_27_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_35);
            lv_size_30_0=ruleGSSFormatSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatFDICFieldRule());
              					}
              					set(
              						current,
              						"size",
              						lv_size_30_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFORMAT.g:1889:3: ( (lv_floatingOffset_31_0= ruleGSSFormatFloatingOffset ) )
            // InternalFORMAT.g:1890:4: (lv_floatingOffset_31_0= ruleGSSFormatFloatingOffset )
            {
            // InternalFORMAT.g:1890:4: (lv_floatingOffset_31_0= ruleGSSFormatFloatingOffset )
            // InternalFORMAT.g:1891:5: lv_floatingOffset_31_0= ruleGSSFormatFloatingOffset
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatFDICFieldAccess().getFloatingOffsetGSSFormatFloatingOffsetParserRuleCall_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_36);
            lv_floatingOffset_31_0=ruleGSSFormatFloatingOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatFDICFieldRule());
              					}
              					set(
              						current,
              						"floatingOffset",
              						lv_floatingOffset_31_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFloatingOffset");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFORMAT.g:1908:3: ( (lv_sortedFieldsToCheck_32_0= ruleGSSFormatSortedFieldsToCheck ) )
            // InternalFORMAT.g:1909:4: (lv_sortedFieldsToCheck_32_0= ruleGSSFormatSortedFieldsToCheck )
            {
            // InternalFORMAT.g:1909:4: (lv_sortedFieldsToCheck_32_0= ruleGSSFormatSortedFieldsToCheck )
            // InternalFORMAT.g:1910:5: lv_sortedFieldsToCheck_32_0= ruleGSSFormatSortedFieldsToCheck
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatFDICFieldAccess().getSortedFieldsToCheckGSSFormatSortedFieldsToCheckParserRuleCall_29_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_27);
            lv_sortedFieldsToCheck_32_0=ruleGSSFormatSortedFieldsToCheck();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatFDICFieldRule());
              					}
              					set(
              						current,
              						"sortedFieldsToCheck",
              						lv_sortedFieldsToCheck_32_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSortedFieldsToCheck");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_33=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_33, grammarAccess.getGSSFormatFDICFieldAccess().getRightCurlyBracketKeyword_30());
              		
            }
            otherlv_34=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_34, grammarAccess.getGSSFormatFDICFieldAccess().getSemicolonKeyword_31());
              		
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
    // $ANTLR end "ruleGSSFormatFDICField"


    // $ANTLR start "entryRuleGSSFormatAField"
    // InternalFORMAT.g:1939:1: entryRuleGSSFormatAField returns [EObject current=null] : iv_ruleGSSFormatAField= ruleGSSFormatAField EOF ;
    public final EObject entryRuleGSSFormatAField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFormatAField = null;


        try {
            // InternalFORMAT.g:1939:56: (iv_ruleGSSFormatAField= ruleGSSFormatAField EOF )
            // InternalFORMAT.g:1940:2: iv_ruleGSSFormatAField= ruleGSSFormatAField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFormatAFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFormatAField=ruleGSSFormatAField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFormatAField; 
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
    // $ANTLR end "entryRuleGSSFormatAField"


    // $ANTLR start "ruleGSSFormatAField"
    // InternalFORMAT.g:1946:1: ruleGSSFormatAField returns [EObject current=null] : (otherlv_0= 'GSSFormatAField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_arrayDimension_30_0= ruleGSSFormatArrayDimension ) ) ( (lv_size_31_0= ruleGSSFormatSize ) ) ( (lv_globalOffset_32_0= ruleGSSFormatGlobalOffset ) ) otherlv_33= '}' otherlv_34= ';' ) ;
    public final EObject ruleGSSFormatAField() throws RecognitionException {
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

        EObject lv_arrayDimension_30_0 = null;

        EObject lv_size_31_0 = null;

        EObject lv_globalOffset_32_0 = null;



        	enterRule();

        try {
            // InternalFORMAT.g:1952:2: ( (otherlv_0= 'GSSFormatAField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_arrayDimension_30_0= ruleGSSFormatArrayDimension ) ) ( (lv_size_31_0= ruleGSSFormatSize ) ) ( (lv_globalOffset_32_0= ruleGSSFormatGlobalOffset ) ) otherlv_33= '}' otherlv_34= ';' ) )
            // InternalFORMAT.g:1953:2: (otherlv_0= 'GSSFormatAField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_arrayDimension_30_0= ruleGSSFormatArrayDimension ) ) ( (lv_size_31_0= ruleGSSFormatSize ) ) ( (lv_globalOffset_32_0= ruleGSSFormatGlobalOffset ) ) otherlv_33= '}' otherlv_34= ';' )
            {
            // InternalFORMAT.g:1953:2: (otherlv_0= 'GSSFormatAField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_arrayDimension_30_0= ruleGSSFormatArrayDimension ) ) ( (lv_size_31_0= ruleGSSFormatSize ) ) ( (lv_globalOffset_32_0= ruleGSSFormatGlobalOffset ) ) otherlv_33= '}' otherlv_34= ';' )
            // InternalFORMAT.g:1954:3: otherlv_0= 'GSSFormatAField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_arrayDimension_30_0= ruleGSSFormatArrayDimension ) ) ( (lv_size_31_0= ruleGSSFormatSize ) ) ( (lv_globalOffset_32_0= ruleGSSFormatGlobalOffset ) ) otherlv_33= '}' otherlv_34= ';'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFormatAFieldAccess().getGSSFormatAFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFormatAFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFormatAFieldAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:1970:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:1971:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:1971:4: (lv_fid_4_0= ruleINTEGER )
            // InternalFORMAT.g:1972:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatAFieldAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fid_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatAFieldRule());
              					}
              					set(
              						current,
              						"fid",
              						lv_fid_4_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFormatAFieldAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:2001:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalFORMAT.g:2002:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalFORMAT.g:2002:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalFORMAT.g:2003:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatAFieldAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_pfid_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatAFieldRule());
              					}
              					set(
              						current,
              						"pfid",
              						lv_pfid_8_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSFormatAFieldAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalFORMAT.g:2032:3: ( (lv_name_12_0= RULE_STRING ) )
            // InternalFORMAT.g:2033:4: (lv_name_12_0= RULE_STRING )
            {
            // InternalFORMAT.g:2033:4: (lv_name_12_0= RULE_STRING )
            // InternalFORMAT.g:2034:5: lv_name_12_0= RULE_STRING
            {
            lv_name_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getGSSFormatAFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFormatAFieldRule());
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

              			newLeafNode(otherlv_13, grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_13());
              		
            }
            // InternalFORMAT.g:2054:3: (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFORMAT.g:2055:4: otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSFormatAFieldAccess().getDescriptionKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalFORMAT.g:2063:4: ( (lv_description_16_0= RULE_STRING ) )
                    // InternalFORMAT.g:2064:5: (lv_description_16_0= RULE_STRING )
                    {
                    // InternalFORMAT.g:2064:5: (lv_description_16_0= RULE_STRING )
                    // InternalFORMAT.g:2065:6: lv_description_16_0= RULE_STRING
                    {
                    lv_description_16_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_16_0, grammarAccess.getGSSFormatAFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSFormatAFieldRule());
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

                      				newLeafNode(otherlv_17, grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSFormatAFieldAccess().getTypeKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_16());
              		
            }
            // InternalFORMAT.g:2094:3: ( (lv_type_20_0= ruleGSSFormatFieldType ) )
            // InternalFORMAT.g:2095:4: (lv_type_20_0= ruleGSSFormatFieldType )
            {
            // InternalFORMAT.g:2095:4: (lv_type_20_0= ruleGSSFormatFieldType )
            // InternalFORMAT.g:2096:5: lv_type_20_0= ruleGSSFormatFieldType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatAFieldAccess().getTypeGSSFormatFieldTypeEnumRuleCall_17_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_20_0=ruleGSSFormatFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatAFieldRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_20_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_18());
              		
            }
            otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSFormatAFieldAccess().getByteOrderKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_20());
              		
            }
            // InternalFORMAT.g:2125:3: ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) )
            // InternalFORMAT.g:2126:4: (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder )
            {
            // InternalFORMAT.g:2126:4: (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder )
            // InternalFORMAT.g:2127:5: lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatAFieldAccess().getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_byteOrder_24_0=ruleGSSFormatFieldByteOrder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatAFieldRule());
              					}
              					set(
              						current,
              						"byteOrder",
              						lv_byteOrder_24_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldByteOrder");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_22());
              		
            }
            otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSFormatAFieldAccess().getFirstBitKeyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSFormatAFieldAccess().getColonEqualsSignKeyword_24());
              		
            }
            // InternalFORMAT.g:2156:3: ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) )
            // InternalFORMAT.g:2157:4: (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit )
            {
            // InternalFORMAT.g:2157:4: (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit )
            // InternalFORMAT.g:2158:5: lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatAFieldAccess().getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_firstBit_28_0=ruleGSSFormatSFieldFirstBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatAFieldRule());
              					}
              					set(
              						current,
              						"firstBit",
              						lv_firstBit_28_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSFieldFirstBit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_26());
              		
            }
            // InternalFORMAT.g:2179:3: ( (lv_arrayDimension_30_0= ruleGSSFormatArrayDimension ) )
            // InternalFORMAT.g:2180:4: (lv_arrayDimension_30_0= ruleGSSFormatArrayDimension )
            {
            // InternalFORMAT.g:2180:4: (lv_arrayDimension_30_0= ruleGSSFormatArrayDimension )
            // InternalFORMAT.g:2181:5: lv_arrayDimension_30_0= ruleGSSFormatArrayDimension
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatAFieldAccess().getArrayDimensionGSSFormatArrayDimensionParserRuleCall_27_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_25);
            lv_arrayDimension_30_0=ruleGSSFormatArrayDimension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatAFieldRule());
              					}
              					set(
              						current,
              						"arrayDimension",
              						lv_arrayDimension_30_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatArrayDimension");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFORMAT.g:2198:3: ( (lv_size_31_0= ruleGSSFormatSize ) )
            // InternalFORMAT.g:2199:4: (lv_size_31_0= ruleGSSFormatSize )
            {
            // InternalFORMAT.g:2199:4: (lv_size_31_0= ruleGSSFormatSize )
            // InternalFORMAT.g:2200:5: lv_size_31_0= ruleGSSFormatSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatAFieldAccess().getSizeGSSFormatSizeParserRuleCall_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_size_31_0=ruleGSSFormatSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatAFieldRule());
              					}
              					set(
              						current,
              						"size",
              						lv_size_31_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFORMAT.g:2217:3: ( (lv_globalOffset_32_0= ruleGSSFormatGlobalOffset ) )
            // InternalFORMAT.g:2218:4: (lv_globalOffset_32_0= ruleGSSFormatGlobalOffset )
            {
            // InternalFORMAT.g:2218:4: (lv_globalOffset_32_0= ruleGSSFormatGlobalOffset )
            // InternalFORMAT.g:2219:5: lv_globalOffset_32_0= ruleGSSFormatGlobalOffset
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatAFieldAccess().getGlobalOffsetGSSFormatGlobalOffsetParserRuleCall_29_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_27);
            lv_globalOffset_32_0=ruleGSSFormatGlobalOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatAFieldRule());
              					}
              					set(
              						current,
              						"globalOffset",
              						lv_globalOffset_32_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatGlobalOffset");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_33=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_33, grammarAccess.getGSSFormatAFieldAccess().getRightCurlyBracketKeyword_30());
              		
            }
            otherlv_34=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_34, grammarAccess.getGSSFormatAFieldAccess().getSemicolonKeyword_31());
              		
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
    // $ANTLR end "ruleGSSFormatAField"


    // $ANTLR start "entryRuleGSSFormatAIField"
    // InternalFORMAT.g:2248:1: entryRuleGSSFormatAIField returns [EObject current=null] : iv_ruleGSSFormatAIField= ruleGSSFormatAIField EOF ;
    public final EObject entryRuleGSSFormatAIField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFormatAIField = null;


        try {
            // InternalFORMAT.g:2248:57: (iv_ruleGSSFormatAIField= ruleGSSFormatAIField EOF )
            // InternalFORMAT.g:2249:2: iv_ruleGSSFormatAIField= ruleGSSFormatAIField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFormatAIFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFormatAIField=ruleGSSFormatAIField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFormatAIField; 
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
    // $ANTLR end "entryRuleGSSFormatAIField"


    // $ANTLR start "ruleGSSFormatAIField"
    // InternalFORMAT.g:2255:1: ruleGSSFormatAIField returns [EObject current=null] : (otherlv_0= 'GSSFormatAIField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_arrayRef_30_0= ruleGSSFormatArrayRef ) ) ( (lv_size_31_0= ruleGSSFormatSize ) ) ( (lv_localOffset_32_0= ruleGSSFormatLocalOffset ) ) otherlv_33= '}' otherlv_34= ';' ) ;
    public final EObject ruleGSSFormatAIField() throws RecognitionException {
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

        EObject lv_arrayRef_30_0 = null;

        EObject lv_size_31_0 = null;

        EObject lv_localOffset_32_0 = null;



        	enterRule();

        try {
            // InternalFORMAT.g:2261:2: ( (otherlv_0= 'GSSFormatAIField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_arrayRef_30_0= ruleGSSFormatArrayRef ) ) ( (lv_size_31_0= ruleGSSFormatSize ) ) ( (lv_localOffset_32_0= ruleGSSFormatLocalOffset ) ) otherlv_33= '}' otherlv_34= ';' ) )
            // InternalFORMAT.g:2262:2: (otherlv_0= 'GSSFormatAIField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_arrayRef_30_0= ruleGSSFormatArrayRef ) ) ( (lv_size_31_0= ruleGSSFormatSize ) ) ( (lv_localOffset_32_0= ruleGSSFormatLocalOffset ) ) otherlv_33= '}' otherlv_34= ';' )
            {
            // InternalFORMAT.g:2262:2: (otherlv_0= 'GSSFormatAIField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_arrayRef_30_0= ruleGSSFormatArrayRef ) ) ( (lv_size_31_0= ruleGSSFormatSize ) ) ( (lv_localOffset_32_0= ruleGSSFormatLocalOffset ) ) otherlv_33= '}' otherlv_34= ';' )
            // InternalFORMAT.g:2263:3: otherlv_0= 'GSSFormatAIField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleGSSFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_arrayRef_30_0= ruleGSSFormatArrayRef ) ) ( (lv_size_31_0= ruleGSSFormatSize ) ) ( (lv_localOffset_32_0= ruleGSSFormatLocalOffset ) ) otherlv_33= '}' otherlv_34= ';'
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFormatAIFieldAccess().getGSSFormatAIFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFormatAIFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFormatAIFieldAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:2279:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:2280:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:2280:4: (lv_fid_4_0= ruleINTEGER )
            // InternalFORMAT.g:2281:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatAIFieldAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fid_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatAIFieldRule());
              					}
              					set(
              						current,
              						"fid",
              						lv_fid_4_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFormatAIFieldAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:2310:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalFORMAT.g:2311:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalFORMAT.g:2311:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalFORMAT.g:2312:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatAIFieldAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_pfid_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatAIFieldRule());
              					}
              					set(
              						current,
              						"pfid",
              						lv_pfid_8_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSFormatAIFieldAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalFORMAT.g:2341:3: ( (lv_name_12_0= RULE_STRING ) )
            // InternalFORMAT.g:2342:4: (lv_name_12_0= RULE_STRING )
            {
            // InternalFORMAT.g:2342:4: (lv_name_12_0= RULE_STRING )
            // InternalFORMAT.g:2343:5: lv_name_12_0= RULE_STRING
            {
            lv_name_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getGSSFormatAIFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFormatAIFieldRule());
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

              			newLeafNode(otherlv_13, grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_13());
              		
            }
            // InternalFORMAT.g:2363:3: (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalFORMAT.g:2364:4: otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSFormatAIFieldAccess().getDescriptionKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalFORMAT.g:2372:4: ( (lv_description_16_0= RULE_STRING ) )
                    // InternalFORMAT.g:2373:5: (lv_description_16_0= RULE_STRING )
                    {
                    // InternalFORMAT.g:2373:5: (lv_description_16_0= RULE_STRING )
                    // InternalFORMAT.g:2374:6: lv_description_16_0= RULE_STRING
                    {
                    lv_description_16_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_16_0, grammarAccess.getGSSFormatAIFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSFormatAIFieldRule());
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

                      				newLeafNode(otherlv_17, grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSFormatAIFieldAccess().getTypeKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_16());
              		
            }
            // InternalFORMAT.g:2403:3: ( (lv_type_20_0= ruleGSSFormatFieldType ) )
            // InternalFORMAT.g:2404:4: (lv_type_20_0= ruleGSSFormatFieldType )
            {
            // InternalFORMAT.g:2404:4: (lv_type_20_0= ruleGSSFormatFieldType )
            // InternalFORMAT.g:2405:5: lv_type_20_0= ruleGSSFormatFieldType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatAIFieldAccess().getTypeGSSFormatFieldTypeEnumRuleCall_17_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_20_0=ruleGSSFormatFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatAIFieldRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_20_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_18());
              		
            }
            otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSFormatAIFieldAccess().getByteOrderKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_20());
              		
            }
            // InternalFORMAT.g:2434:3: ( (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder ) )
            // InternalFORMAT.g:2435:4: (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder )
            {
            // InternalFORMAT.g:2435:4: (lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder )
            // InternalFORMAT.g:2436:5: lv_byteOrder_24_0= ruleGSSFormatFieldByteOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatAIFieldAccess().getByteOrderGSSFormatFieldByteOrderEnumRuleCall_21_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_byteOrder_24_0=ruleGSSFormatFieldByteOrder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatAIFieldRule());
              					}
              					set(
              						current,
              						"byteOrder",
              						lv_byteOrder_24_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldByteOrder");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_22());
              		
            }
            otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSFormatAIFieldAccess().getFirstBitKeyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSFormatAIFieldAccess().getColonEqualsSignKeyword_24());
              		
            }
            // InternalFORMAT.g:2465:3: ( (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit ) )
            // InternalFORMAT.g:2466:4: (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit )
            {
            // InternalFORMAT.g:2466:4: (lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit )
            // InternalFORMAT.g:2467:5: lv_firstBit_28_0= ruleGSSFormatSFieldFirstBit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatAIFieldAccess().getFirstBitGSSFormatSFieldFirstBitEnumRuleCall_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_firstBit_28_0=ruleGSSFormatSFieldFirstBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatAIFieldRule());
              					}
              					set(
              						current,
              						"firstBit",
              						lv_firstBit_28_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSFieldFirstBit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_26());
              		
            }
            // InternalFORMAT.g:2488:3: ( (lv_arrayRef_30_0= ruleGSSFormatArrayRef ) )
            // InternalFORMAT.g:2489:4: (lv_arrayRef_30_0= ruleGSSFormatArrayRef )
            {
            // InternalFORMAT.g:2489:4: (lv_arrayRef_30_0= ruleGSSFormatArrayRef )
            // InternalFORMAT.g:2490:5: lv_arrayRef_30_0= ruleGSSFormatArrayRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatAIFieldAccess().getArrayRefGSSFormatArrayRefParserRuleCall_27_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_25);
            lv_arrayRef_30_0=ruleGSSFormatArrayRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatAIFieldRule());
              					}
              					set(
              						current,
              						"arrayRef",
              						lv_arrayRef_30_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatArrayRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFORMAT.g:2507:3: ( (lv_size_31_0= ruleGSSFormatSize ) )
            // InternalFORMAT.g:2508:4: (lv_size_31_0= ruleGSSFormatSize )
            {
            // InternalFORMAT.g:2508:4: (lv_size_31_0= ruleGSSFormatSize )
            // InternalFORMAT.g:2509:5: lv_size_31_0= ruleGSSFormatSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatAIFieldAccess().getSizeGSSFormatSizeParserRuleCall_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_39);
            lv_size_31_0=ruleGSSFormatSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatAIFieldRule());
              					}
              					set(
              						current,
              						"size",
              						lv_size_31_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFORMAT.g:2526:3: ( (lv_localOffset_32_0= ruleGSSFormatLocalOffset ) )
            // InternalFORMAT.g:2527:4: (lv_localOffset_32_0= ruleGSSFormatLocalOffset )
            {
            // InternalFORMAT.g:2527:4: (lv_localOffset_32_0= ruleGSSFormatLocalOffset )
            // InternalFORMAT.g:2528:5: lv_localOffset_32_0= ruleGSSFormatLocalOffset
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatAIFieldAccess().getLocalOffsetGSSFormatLocalOffsetParserRuleCall_29_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_27);
            lv_localOffset_32_0=ruleGSSFormatLocalOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatAIFieldRule());
              					}
              					set(
              						current,
              						"localOffset",
              						lv_localOffset_32_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatLocalOffset");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_33=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_33, grammarAccess.getGSSFormatAIFieldAccess().getRightCurlyBracketKeyword_30());
              		
            }
            otherlv_34=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_34, grammarAccess.getGSSFormatAIFieldAccess().getSemicolonKeyword_31());
              		
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
    // $ANTLR end "ruleGSSFormatAIField"


    // $ANTLR start "entryRuleGSSFormatSize"
    // InternalFORMAT.g:2557:1: entryRuleGSSFormatSize returns [EObject current=null] : iv_ruleGSSFormatSize= ruleGSSFormatSize EOF ;
    public final EObject entryRuleGSSFormatSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFormatSize = null;


        try {
            // InternalFORMAT.g:2557:54: (iv_ruleGSSFormatSize= ruleGSSFormatSize EOF )
            // InternalFORMAT.g:2558:2: iv_ruleGSSFormatSize= ruleGSSFormatSize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFormatSizeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFormatSize=ruleGSSFormatSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFormatSize; 
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
    // $ANTLR end "entryRuleGSSFormatSize"


    // $ANTLR start "ruleGSSFormatSize"
    // InternalFORMAT.g:2564:1: ruleGSSFormatSize returns [EObject current=null] : (otherlv_0= 'GSSFormatSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSFormatSize() throws RecognitionException {
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
            // InternalFORMAT.g:2570:2: ( (otherlv_0= 'GSSFormatSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalFORMAT.g:2571:2: (otherlv_0= 'GSSFormatSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalFORMAT.g:2571:2: (otherlv_0= 'GSSFormatSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalFORMAT.g:2572:3: otherlv_0= 'GSSFormatSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFormatSizeAccess().getGSSFormatSizeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFormatSizeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFormatSizeAccess().getBytesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFormatSizeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:2588:3: ( (lv_bytes_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:2589:4: (lv_bytes_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:2589:4: (lv_bytes_4_0= ruleINTEGER )
            // InternalFORMAT.g:2590:5: lv_bytes_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatSizeAccess().getBytesINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_bytes_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatSizeRule());
              					}
              					set(
              						current,
              						"bytes",
              						lv_bytes_4_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFormatSizeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFormatSizeAccess().getBitsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFormatSizeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:2619:3: ( (lv_bits_8_0= ruleINTEGER ) )
            // InternalFORMAT.g:2620:4: (lv_bits_8_0= ruleINTEGER )
            {
            // InternalFORMAT.g:2620:4: (lv_bits_8_0= ruleINTEGER )
            // InternalFORMAT.g:2621:5: lv_bits_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatSizeAccess().getBitsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_bits_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatSizeRule());
              					}
              					set(
              						current,
              						"bits",
              						lv_bits_8_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFormatSizeAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSFormatSizeAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSFormatSizeAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleGSSFormatSize"


    // $ANTLR start "entryRuleGSSFormatGlobalOffset"
    // InternalFORMAT.g:2654:1: entryRuleGSSFormatGlobalOffset returns [EObject current=null] : iv_ruleGSSFormatGlobalOffset= ruleGSSFormatGlobalOffset EOF ;
    public final EObject entryRuleGSSFormatGlobalOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFormatGlobalOffset = null;


        try {
            // InternalFORMAT.g:2654:62: (iv_ruleGSSFormatGlobalOffset= ruleGSSFormatGlobalOffset EOF )
            // InternalFORMAT.g:2655:2: iv_ruleGSSFormatGlobalOffset= ruleGSSFormatGlobalOffset EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFormatGlobalOffsetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFormatGlobalOffset=ruleGSSFormatGlobalOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFormatGlobalOffset; 
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
    // $ANTLR end "entryRuleGSSFormatGlobalOffset"


    // $ANTLR start "ruleGSSFormatGlobalOffset"
    // InternalFORMAT.g:2661:1: ruleGSSFormatGlobalOffset returns [EObject current=null] : (otherlv_0= 'GSSFormatGlobalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSFormatGlobalOffset() throws RecognitionException {
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
            // InternalFORMAT.g:2667:2: ( (otherlv_0= 'GSSFormatGlobalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalFORMAT.g:2668:2: (otherlv_0= 'GSSFormatGlobalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalFORMAT.g:2668:2: (otherlv_0= 'GSSFormatGlobalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalFORMAT.g:2669:3: otherlv_0= 'GSSFormatGlobalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFormatGlobalOffsetAccess().getGSSFormatGlobalOffsetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFormatGlobalOffsetAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFormatGlobalOffsetAccess().getBytesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFormatGlobalOffsetAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:2685:3: ( (lv_bytes_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:2686:4: (lv_bytes_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:2686:4: (lv_bytes_4_0= ruleINTEGER )
            // InternalFORMAT.g:2687:5: lv_bytes_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatGlobalOffsetAccess().getBytesINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_bytes_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatGlobalOffsetRule());
              					}
              					set(
              						current,
              						"bytes",
              						lv_bytes_4_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFormatGlobalOffsetAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFormatGlobalOffsetAccess().getBitsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFormatGlobalOffsetAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:2716:3: ( (lv_bits_8_0= ruleINTEGER ) )
            // InternalFORMAT.g:2717:4: (lv_bits_8_0= ruleINTEGER )
            {
            // InternalFORMAT.g:2717:4: (lv_bits_8_0= ruleINTEGER )
            // InternalFORMAT.g:2718:5: lv_bits_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatGlobalOffsetAccess().getBitsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_bits_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatGlobalOffsetRule());
              					}
              					set(
              						current,
              						"bits",
              						lv_bits_8_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFormatGlobalOffsetAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSFormatGlobalOffsetAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSFormatGlobalOffsetAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleGSSFormatGlobalOffset"


    // $ANTLR start "entryRuleGSSFormatFormula"
    // InternalFORMAT.g:2751:1: entryRuleGSSFormatFormula returns [EObject current=null] : iv_ruleGSSFormatFormula= ruleGSSFormatFormula EOF ;
    public final EObject entryRuleGSSFormatFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFormatFormula = null;


        try {
            // InternalFORMAT.g:2751:57: (iv_ruleGSSFormatFormula= ruleGSSFormatFormula EOF )
            // InternalFORMAT.g:2752:2: iv_ruleGSSFormatFormula= ruleGSSFormatFormula EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFormatFormulaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFormatFormula=ruleGSSFormatFormula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFormatFormula; 
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
    // $ANTLR end "entryRuleGSSFormatFormula"


    // $ANTLR start "ruleGSSFormatFormula"
    // InternalFORMAT.g:2758:1: ruleGSSFormatFormula returns [EObject current=null] : (otherlv_0= 'GSSFormatFormula' otherlv_1= '{' otherlv_2= 'slope' otherlv_3= ':=' ( (lv_slope_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'intercept' otherlv_7= ':=' ( (lv_intercept_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSFormatFormula() throws RecognitionException {
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
            // InternalFORMAT.g:2764:2: ( (otherlv_0= 'GSSFormatFormula' otherlv_1= '{' otherlv_2= 'slope' otherlv_3= ':=' ( (lv_slope_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'intercept' otherlv_7= ':=' ( (lv_intercept_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalFORMAT.g:2765:2: (otherlv_0= 'GSSFormatFormula' otherlv_1= '{' otherlv_2= 'slope' otherlv_3= ':=' ( (lv_slope_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'intercept' otherlv_7= ':=' ( (lv_intercept_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalFORMAT.g:2765:2: (otherlv_0= 'GSSFormatFormula' otherlv_1= '{' otherlv_2= 'slope' otherlv_3= ':=' ( (lv_slope_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'intercept' otherlv_7= ':=' ( (lv_intercept_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalFORMAT.g:2766:3: otherlv_0= 'GSSFormatFormula' otherlv_1= '{' otherlv_2= 'slope' otherlv_3= ':=' ( (lv_slope_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'intercept' otherlv_7= ':=' ( (lv_intercept_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFormatFormulaAccess().getGSSFormatFormulaKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFormatFormulaAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,41,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFormatFormulaAccess().getSlopeKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFormatFormulaAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:2782:3: ( (lv_slope_4_0= RULE_STRING ) )
            // InternalFORMAT.g:2783:4: (lv_slope_4_0= RULE_STRING )
            {
            // InternalFORMAT.g:2783:4: (lv_slope_4_0= RULE_STRING )
            // InternalFORMAT.g:2784:5: lv_slope_4_0= RULE_STRING
            {
            lv_slope_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_slope_4_0, grammarAccess.getGSSFormatFormulaAccess().getSlopeSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFormatFormulaRule());
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

              			newLeafNode(otherlv_5, grammarAccess.getGSSFormatFormulaAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,42,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFormatFormulaAccess().getInterceptKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFormatFormulaAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:2812:3: ( (lv_intercept_8_0= RULE_STRING ) )
            // InternalFORMAT.g:2813:4: (lv_intercept_8_0= RULE_STRING )
            {
            // InternalFORMAT.g:2813:4: (lv_intercept_8_0= RULE_STRING )
            // InternalFORMAT.g:2814:5: lv_intercept_8_0= RULE_STRING
            {
            lv_intercept_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_intercept_8_0, grammarAccess.getGSSFormatFormulaAccess().getInterceptSTRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFormatFormulaRule());
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

              			newLeafNode(otherlv_9, grammarAccess.getGSSFormatFormulaAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSFormatFormulaAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSFormatFormulaAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleGSSFormatFormula"


    // $ANTLR start "entryRuleGSSFormatConstSize"
    // InternalFORMAT.g:2846:1: entryRuleGSSFormatConstSize returns [EObject current=null] : iv_ruleGSSFormatConstSize= ruleGSSFormatConstSize EOF ;
    public final EObject entryRuleGSSFormatConstSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFormatConstSize = null;


        try {
            // InternalFORMAT.g:2846:59: (iv_ruleGSSFormatConstSize= ruleGSSFormatConstSize EOF )
            // InternalFORMAT.g:2847:2: iv_ruleGSSFormatConstSize= ruleGSSFormatConstSize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFormatConstSizeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFormatConstSize=ruleGSSFormatConstSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFormatConstSize; 
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
    // $ANTLR end "entryRuleGSSFormatConstSize"


    // $ANTLR start "ruleGSSFormatConstSize"
    // InternalFORMAT.g:2853:1: ruleGSSFormatConstSize returns [EObject current=null] : (otherlv_0= 'GSSFormatConstSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSFormatConstSize() throws RecognitionException {
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
            // InternalFORMAT.g:2859:2: ( (otherlv_0= 'GSSFormatConstSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalFORMAT.g:2860:2: (otherlv_0= 'GSSFormatConstSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalFORMAT.g:2860:2: (otherlv_0= 'GSSFormatConstSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalFORMAT.g:2861:3: otherlv_0= 'GSSFormatConstSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFormatConstSizeAccess().getGSSFormatConstSizeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFormatConstSizeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFormatConstSizeAccess().getBytesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFormatConstSizeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:2877:3: ( (lv_bytes_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:2878:4: (lv_bytes_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:2878:4: (lv_bytes_4_0= ruleINTEGER )
            // InternalFORMAT.g:2879:5: lv_bytes_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatConstSizeAccess().getBytesINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_bytes_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatConstSizeRule());
              					}
              					set(
              						current,
              						"bytes",
              						lv_bytes_4_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFormatConstSizeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFormatConstSizeAccess().getBitsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFormatConstSizeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:2908:3: ( (lv_bits_8_0= ruleINTEGER ) )
            // InternalFORMAT.g:2909:4: (lv_bits_8_0= ruleINTEGER )
            {
            // InternalFORMAT.g:2909:4: (lv_bits_8_0= ruleINTEGER )
            // InternalFORMAT.g:2910:5: lv_bits_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatConstSizeAccess().getBitsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_bits_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatConstSizeRule());
              					}
              					set(
              						current,
              						"bits",
              						lv_bits_8_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFormatConstSizeAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSFormatConstSizeAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSFormatConstSizeAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleGSSFormatConstSize"


    // $ANTLR start "entryRuleGSSFormatMaxSize"
    // InternalFORMAT.g:2943:1: entryRuleGSSFormatMaxSize returns [EObject current=null] : iv_ruleGSSFormatMaxSize= ruleGSSFormatMaxSize EOF ;
    public final EObject entryRuleGSSFormatMaxSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFormatMaxSize = null;


        try {
            // InternalFORMAT.g:2943:57: (iv_ruleGSSFormatMaxSize= ruleGSSFormatMaxSize EOF )
            // InternalFORMAT.g:2944:2: iv_ruleGSSFormatMaxSize= ruleGSSFormatMaxSize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFormatMaxSizeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFormatMaxSize=ruleGSSFormatMaxSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFormatMaxSize; 
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
    // $ANTLR end "entryRuleGSSFormatMaxSize"


    // $ANTLR start "ruleGSSFormatMaxSize"
    // InternalFORMAT.g:2950:1: ruleGSSFormatMaxSize returns [EObject current=null] : (otherlv_0= 'GSSFormatMaxSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSFormatMaxSize() throws RecognitionException {
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
            // InternalFORMAT.g:2956:2: ( (otherlv_0= 'GSSFormatMaxSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalFORMAT.g:2957:2: (otherlv_0= 'GSSFormatMaxSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalFORMAT.g:2957:2: (otherlv_0= 'GSSFormatMaxSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalFORMAT.g:2958:3: otherlv_0= 'GSSFormatMaxSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFormatMaxSizeAccess().getGSSFormatMaxSizeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFormatMaxSizeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFormatMaxSizeAccess().getBytesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFormatMaxSizeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:2974:3: ( (lv_bytes_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:2975:4: (lv_bytes_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:2975:4: (lv_bytes_4_0= ruleINTEGER )
            // InternalFORMAT.g:2976:5: lv_bytes_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatMaxSizeAccess().getBytesINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_bytes_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatMaxSizeRule());
              					}
              					set(
              						current,
              						"bytes",
              						lv_bytes_4_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFormatMaxSizeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFormatMaxSizeAccess().getBitsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFormatMaxSizeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:3005:3: ( (lv_bits_8_0= ruleINTEGER ) )
            // InternalFORMAT.g:3006:4: (lv_bits_8_0= ruleINTEGER )
            {
            // InternalFORMAT.g:3006:4: (lv_bits_8_0= ruleINTEGER )
            // InternalFORMAT.g:3007:5: lv_bits_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatMaxSizeAccess().getBitsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_bits_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatMaxSizeRule());
              					}
              					set(
              						current,
              						"bits",
              						lv_bits_8_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFormatMaxSizeAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSFormatMaxSizeAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSFormatMaxSizeAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleGSSFormatMaxSize"


    // $ANTLR start "entryRuleGSSFormatVariableSize"
    // InternalFORMAT.g:3040:1: entryRuleGSSFormatVariableSize returns [EObject current=null] : iv_ruleGSSFormatVariableSize= ruleGSSFormatVariableSize EOF ;
    public final EObject entryRuleGSSFormatVariableSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFormatVariableSize = null;


        try {
            // InternalFORMAT.g:3040:62: (iv_ruleGSSFormatVariableSize= ruleGSSFormatVariableSize EOF )
            // InternalFORMAT.g:3041:2: iv_ruleGSSFormatVariableSize= ruleGSSFormatVariableSize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFormatVariableSizeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFormatVariableSize=ruleGSSFormatVariableSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFormatVariableSize; 
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
    // $ANTLR end "entryRuleGSSFormatVariableSize"


    // $ANTLR start "ruleGSSFormatVariableSize"
    // InternalFORMAT.g:3047:1: ruleGSSFormatVariableSize returns [EObject current=null] : (otherlv_0= 'GSSFormatVariableSize' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'unit' otherlv_7= ':=' ( (lv_unit_8_0= ruleGSSFormatUnit ) ) otherlv_9= ';' (otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleGSSFormatPower ) ) otherlv_13= ';' )? otherlv_14= '}' otherlv_15= ';' ) ;
    public final EObject ruleGSSFormatVariableSize() throws RecognitionException {
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
            // InternalFORMAT.g:3053:2: ( (otherlv_0= 'GSSFormatVariableSize' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'unit' otherlv_7= ':=' ( (lv_unit_8_0= ruleGSSFormatUnit ) ) otherlv_9= ';' (otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleGSSFormatPower ) ) otherlv_13= ';' )? otherlv_14= '}' otherlv_15= ';' ) )
            // InternalFORMAT.g:3054:2: (otherlv_0= 'GSSFormatVariableSize' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'unit' otherlv_7= ':=' ( (lv_unit_8_0= ruleGSSFormatUnit ) ) otherlv_9= ';' (otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleGSSFormatPower ) ) otherlv_13= ';' )? otherlv_14= '}' otherlv_15= ';' )
            {
            // InternalFORMAT.g:3054:2: (otherlv_0= 'GSSFormatVariableSize' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'unit' otherlv_7= ':=' ( (lv_unit_8_0= ruleGSSFormatUnit ) ) otherlv_9= ';' (otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleGSSFormatPower ) ) otherlv_13= ';' )? otherlv_14= '}' otherlv_15= ';' )
            // InternalFORMAT.g:3055:3: otherlv_0= 'GSSFormatVariableSize' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'unit' otherlv_7= ':=' ( (lv_unit_8_0= ruleGSSFormatUnit ) ) otherlv_9= ';' (otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleGSSFormatPower ) ) otherlv_13= ';' )? otherlv_14= '}' otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFormatVariableSizeAccess().getGSSFormatVariableSizeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFormatVariableSizeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFormatVariableSizeAccess().getFidRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFormatVariableSizeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:3071:3: ( (lv_fidRef_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:3072:4: (lv_fidRef_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:3072:4: (lv_fidRef_4_0= ruleINTEGER )
            // InternalFORMAT.g:3073:5: lv_fidRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatVariableSizeAccess().getFidRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fidRef_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatVariableSizeRule());
              					}
              					set(
              						current,
              						"fidRef",
              						lv_fidRef_4_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFormatVariableSizeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFormatVariableSizeAccess().getUnitKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFormatVariableSizeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:3102:3: ( (lv_unit_8_0= ruleGSSFormatUnit ) )
            // InternalFORMAT.g:3103:4: (lv_unit_8_0= ruleGSSFormatUnit )
            {
            // InternalFORMAT.g:3103:4: (lv_unit_8_0= ruleGSSFormatUnit )
            // InternalFORMAT.g:3104:5: lv_unit_8_0= ruleGSSFormatUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatVariableSizeAccess().getUnitGSSFormatUnitEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_unit_8_0=ruleGSSFormatUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatVariableSizeRule());
              					}
              					set(
              						current,
              						"unit",
              						lv_unit_8_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFormatVariableSizeAccess().getSemicolonKeyword_9());
              		
            }
            // InternalFORMAT.g:3125:3: (otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleGSSFormatPower ) ) otherlv_13= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==48) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFORMAT.g:3126:4: otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleGSSFormatPower ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,48,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getGSSFormatVariableSizeAccess().getPowerKeyword_10_0());
                      			
                    }
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getGSSFormatVariableSizeAccess().getColonEqualsSignKeyword_10_1());
                      			
                    }
                    // InternalFORMAT.g:3134:4: ( (lv_power_12_0= ruleGSSFormatPower ) )
                    // InternalFORMAT.g:3135:5: (lv_power_12_0= ruleGSSFormatPower )
                    {
                    // InternalFORMAT.g:3135:5: (lv_power_12_0= ruleGSSFormatPower )
                    // InternalFORMAT.g:3136:6: lv_power_12_0= ruleGSSFormatPower
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSFormatVariableSizeAccess().getPowerGSSFormatPowerEnumRuleCall_10_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_power_12_0=ruleGSSFormatPower();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSFormatVariableSizeRule());
                      						}
                      						set(
                      							current,
                      							"power",
                      							lv_power_12_0,
                      							"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatPower");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getGSSFormatVariableSizeAccess().getSemicolonKeyword_10_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_14=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSFormatVariableSizeAccess().getRightCurlyBracketKeyword_11());
              		
            }
            otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSFormatVariableSizeAccess().getSemicolonKeyword_12());
              		
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
    // $ANTLR end "ruleGSSFormatVariableSize"


    // $ANTLR start "entryRuleGSSFormatFloatingOffset"
    // InternalFORMAT.g:3170:1: entryRuleGSSFormatFloatingOffset returns [EObject current=null] : iv_ruleGSSFormatFloatingOffset= ruleGSSFormatFloatingOffset EOF ;
    public final EObject entryRuleGSSFormatFloatingOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFormatFloatingOffset = null;


        try {
            // InternalFORMAT.g:3170:64: (iv_ruleGSSFormatFloatingOffset= ruleGSSFormatFloatingOffset EOF )
            // InternalFORMAT.g:3171:2: iv_ruleGSSFormatFloatingOffset= ruleGSSFormatFloatingOffset EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFormatFloatingOffsetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFormatFloatingOffset=ruleGSSFormatFloatingOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFormatFloatingOffset; 
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
    // $ANTLR end "entryRuleGSSFormatFloatingOffset"


    // $ANTLR start "ruleGSSFormatFloatingOffset"
    // InternalFORMAT.g:3177:1: ruleGSSFormatFloatingOffset returns [EObject current=null] : (otherlv_0= 'GSSFormatFloatingOffset' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSFormatFloatingOffset() throws RecognitionException {
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
            // InternalFORMAT.g:3183:2: ( (otherlv_0= 'GSSFormatFloatingOffset' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalFORMAT.g:3184:2: (otherlv_0= 'GSSFormatFloatingOffset' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalFORMAT.g:3184:2: (otherlv_0= 'GSSFormatFloatingOffset' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalFORMAT.g:3185:3: otherlv_0= 'GSSFormatFloatingOffset' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFormatFloatingOffsetAccess().getGSSFormatFloatingOffsetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFormatFloatingOffsetAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFormatFloatingOffsetAccess().getFidRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFormatFloatingOffsetAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:3201:3: ( (lv_fidRef_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:3202:4: (lv_fidRef_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:3202:4: (lv_fidRef_4_0= ruleINTEGER )
            // InternalFORMAT.g:3203:5: lv_fidRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatFloatingOffsetAccess().getFidRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fidRef_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatFloatingOffsetRule());
              					}
              					set(
              						current,
              						"fidRef",
              						lv_fidRef_4_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFormatFloatingOffsetAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFormatFloatingOffsetAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFormatFloatingOffsetAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSFormatFloatingOffset"


    // $ANTLR start "entryRuleGSSFormatSortedFieldsToCheck"
    // InternalFORMAT.g:3236:1: entryRuleGSSFormatSortedFieldsToCheck returns [EObject current=null] : iv_ruleGSSFormatSortedFieldsToCheck= ruleGSSFormatSortedFieldsToCheck EOF ;
    public final EObject entryRuleGSSFormatSortedFieldsToCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFormatSortedFieldsToCheck = null;


        try {
            // InternalFORMAT.g:3236:69: (iv_ruleGSSFormatSortedFieldsToCheck= ruleGSSFormatSortedFieldsToCheck EOF )
            // InternalFORMAT.g:3237:2: iv_ruleGSSFormatSortedFieldsToCheck= ruleGSSFormatSortedFieldsToCheck EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFormatSortedFieldsToCheckRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFormatSortedFieldsToCheck=ruleGSSFormatSortedFieldsToCheck();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFormatSortedFieldsToCheck; 
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
    // $ANTLR end "entryRuleGSSFormatSortedFieldsToCheck"


    // $ANTLR start "ruleGSSFormatSortedFieldsToCheck"
    // InternalFORMAT.g:3243:1: ruleGSSFormatSortedFieldsToCheck returns [EObject current=null] : ( () otherlv_1= 'GSSFormatSortedFieldsToCheck' otherlv_2= '{' ( (lv_fieldToCheck_3_0= ruleGSSFormatFieldToCheck ) )+ otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleGSSFormatSortedFieldsToCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_fieldToCheck_3_0 = null;



        	enterRule();

        try {
            // InternalFORMAT.g:3249:2: ( ( () otherlv_1= 'GSSFormatSortedFieldsToCheck' otherlv_2= '{' ( (lv_fieldToCheck_3_0= ruleGSSFormatFieldToCheck ) )+ otherlv_4= '}' otherlv_5= ';' ) )
            // InternalFORMAT.g:3250:2: ( () otherlv_1= 'GSSFormatSortedFieldsToCheck' otherlv_2= '{' ( (lv_fieldToCheck_3_0= ruleGSSFormatFieldToCheck ) )+ otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalFORMAT.g:3250:2: ( () otherlv_1= 'GSSFormatSortedFieldsToCheck' otherlv_2= '{' ( (lv_fieldToCheck_3_0= ruleGSSFormatFieldToCheck ) )+ otherlv_4= '}' otherlv_5= ';' )
            // InternalFORMAT.g:3251:3: () otherlv_1= 'GSSFormatSortedFieldsToCheck' otherlv_2= '{' ( (lv_fieldToCheck_3_0= ruleGSSFormatFieldToCheck ) )+ otherlv_4= '}' otherlv_5= ';'
            {
            // InternalFORMAT.g:3251:3: ()
            // InternalFORMAT.g:3252:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getGSSFormatSortedFieldsToCheckAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getGSSFormatSortedFieldsToCheckKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalFORMAT.g:3269:3: ( (lv_fieldToCheck_3_0= ruleGSSFormatFieldToCheck ) )+
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
            	    // InternalFORMAT.g:3270:4: (lv_fieldToCheck_3_0= ruleGSSFormatFieldToCheck )
            	    {
            	    // InternalFORMAT.g:3270:4: (lv_fieldToCheck_3_0= ruleGSSFormatFieldToCheck )
            	    // InternalFORMAT.g:3271:5: lv_fieldToCheck_3_0= ruleGSSFormatFieldToCheck
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getFieldToCheckGSSFormatFieldToCheckParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_50);
            	    lv_fieldToCheck_3_0=ruleGSSFormatFieldToCheck();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSFormatSortedFieldsToCheckRule());
            	      					}
            	      					add(
            	      						current,
            	      						"fieldToCheck",
            	      						lv_fieldToCheck_3_0,
            	      						"es.uah.aut.srg.gss.lang.format.FORMAT.GSSFormatFieldToCheck");
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

              			newLeafNode(otherlv_4, grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFormatSortedFieldsToCheckAccess().getSemicolonKeyword_5());
              		
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
    // $ANTLR end "ruleGSSFormatSortedFieldsToCheck"


    // $ANTLR start "entryRuleGSSFormatFieldToCheck"
    // InternalFORMAT.g:3300:1: entryRuleGSSFormatFieldToCheck returns [EObject current=null] : iv_ruleGSSFormatFieldToCheck= ruleGSSFormatFieldToCheck EOF ;
    public final EObject entryRuleGSSFormatFieldToCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFormatFieldToCheck = null;


        try {
            // InternalFORMAT.g:3300:62: (iv_ruleGSSFormatFieldToCheck= ruleGSSFormatFieldToCheck EOF )
            // InternalFORMAT.g:3301:2: iv_ruleGSSFormatFieldToCheck= ruleGSSFormatFieldToCheck EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFormatFieldToCheckRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFormatFieldToCheck=ruleGSSFormatFieldToCheck();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFormatFieldToCheck; 
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
    // $ANTLR end "entryRuleGSSFormatFieldToCheck"


    // $ANTLR start "ruleGSSFormatFieldToCheck"
    // InternalFORMAT.g:3307:1: ruleGSSFormatFieldToCheck returns [EObject current=null] : (otherlv_0= 'GSSFormatFieldToCheck' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSFormatFieldToCheck() throws RecognitionException {
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
            // InternalFORMAT.g:3313:2: ( (otherlv_0= 'GSSFormatFieldToCheck' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalFORMAT.g:3314:2: (otherlv_0= 'GSSFormatFieldToCheck' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalFORMAT.g:3314:2: (otherlv_0= 'GSSFormatFieldToCheck' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalFORMAT.g:3315:3: otherlv_0= 'GSSFormatFieldToCheck' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFormatFieldToCheckAccess().getGSSFormatFieldToCheckKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFormatFieldToCheckAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFormatFieldToCheckAccess().getFidRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFormatFieldToCheckAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:3331:3: ( (lv_fidRef_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:3332:4: (lv_fidRef_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:3332:4: (lv_fidRef_4_0= ruleINTEGER )
            // InternalFORMAT.g:3333:5: lv_fidRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatFieldToCheckAccess().getFidRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fidRef_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatFieldToCheckRule());
              					}
              					set(
              						current,
              						"fidRef",
              						lv_fidRef_4_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFormatFieldToCheckAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFormatFieldToCheckAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFormatFieldToCheckAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSFormatFieldToCheck"


    // $ANTLR start "entryRuleGSSFormatArrayDimension"
    // InternalFORMAT.g:3366:1: entryRuleGSSFormatArrayDimension returns [EObject current=null] : iv_ruleGSSFormatArrayDimension= ruleGSSFormatArrayDimension EOF ;
    public final EObject entryRuleGSSFormatArrayDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFormatArrayDimension = null;


        try {
            // InternalFORMAT.g:3366:64: (iv_ruleGSSFormatArrayDimension= ruleGSSFormatArrayDimension EOF )
            // InternalFORMAT.g:3367:2: iv_ruleGSSFormatArrayDimension= ruleGSSFormatArrayDimension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFormatArrayDimensionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFormatArrayDimension=ruleGSSFormatArrayDimension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFormatArrayDimension; 
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
    // $ANTLR end "entryRuleGSSFormatArrayDimension"


    // $ANTLR start "ruleGSSFormatArrayDimension"
    // InternalFORMAT.g:3373:1: ruleGSSFormatArrayDimension returns [EObject current=null] : (otherlv_0= 'GSSFormatArrayDimension' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'maxItems' otherlv_7= ':=' ( (lv_maxItems_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSFormatArrayDimension() throws RecognitionException {
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
            // InternalFORMAT.g:3379:2: ( (otherlv_0= 'GSSFormatArrayDimension' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'maxItems' otherlv_7= ':=' ( (lv_maxItems_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalFORMAT.g:3380:2: (otherlv_0= 'GSSFormatArrayDimension' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'maxItems' otherlv_7= ':=' ( (lv_maxItems_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalFORMAT.g:3380:2: (otherlv_0= 'GSSFormatArrayDimension' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'maxItems' otherlv_7= ':=' ( (lv_maxItems_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalFORMAT.g:3381:3: otherlv_0= 'GSSFormatArrayDimension' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'maxItems' otherlv_7= ':=' ( (lv_maxItems_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFormatArrayDimensionAccess().getGSSFormatArrayDimensionKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFormatArrayDimensionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFormatArrayDimensionAccess().getFidRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFormatArrayDimensionAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:3397:3: ( (lv_fidRef_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:3398:4: (lv_fidRef_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:3398:4: (lv_fidRef_4_0= ruleINTEGER )
            // InternalFORMAT.g:3399:5: lv_fidRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatArrayDimensionAccess().getFidRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fidRef_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatArrayDimensionRule());
              					}
              					set(
              						current,
              						"fidRef",
              						lv_fidRef_4_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFormatArrayDimensionAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,53,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFormatArrayDimensionAccess().getMaxItemsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFormatArrayDimensionAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:3428:3: ( (lv_maxItems_8_0= ruleINTEGER ) )
            // InternalFORMAT.g:3429:4: (lv_maxItems_8_0= ruleINTEGER )
            {
            // InternalFORMAT.g:3429:4: (lv_maxItems_8_0= ruleINTEGER )
            // InternalFORMAT.g:3430:5: lv_maxItems_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatArrayDimensionAccess().getMaxItemsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_maxItems_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatArrayDimensionRule());
              					}
              					set(
              						current,
              						"maxItems",
              						lv_maxItems_8_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFormatArrayDimensionAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSFormatArrayDimensionAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSFormatArrayDimensionAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleGSSFormatArrayDimension"


    // $ANTLR start "entryRuleGSSFormatLocalOffset"
    // InternalFORMAT.g:3463:1: entryRuleGSSFormatLocalOffset returns [EObject current=null] : iv_ruleGSSFormatLocalOffset= ruleGSSFormatLocalOffset EOF ;
    public final EObject entryRuleGSSFormatLocalOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFormatLocalOffset = null;


        try {
            // InternalFORMAT.g:3463:61: (iv_ruleGSSFormatLocalOffset= ruleGSSFormatLocalOffset EOF )
            // InternalFORMAT.g:3464:2: iv_ruleGSSFormatLocalOffset= ruleGSSFormatLocalOffset EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFormatLocalOffsetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFormatLocalOffset=ruleGSSFormatLocalOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFormatLocalOffset; 
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
    // $ANTLR end "entryRuleGSSFormatLocalOffset"


    // $ANTLR start "ruleGSSFormatLocalOffset"
    // InternalFORMAT.g:3470:1: ruleGSSFormatLocalOffset returns [EObject current=null] : (otherlv_0= 'GSSFormatLocalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSFormatLocalOffset() throws RecognitionException {
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
            // InternalFORMAT.g:3476:2: ( (otherlv_0= 'GSSFormatLocalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalFORMAT.g:3477:2: (otherlv_0= 'GSSFormatLocalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalFORMAT.g:3477:2: (otherlv_0= 'GSSFormatLocalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalFORMAT.g:3478:3: otherlv_0= 'GSSFormatLocalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFormatLocalOffsetAccess().getGSSFormatLocalOffsetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFormatLocalOffsetAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFormatLocalOffsetAccess().getBytesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFormatLocalOffsetAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:3494:3: ( (lv_bytes_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:3495:4: (lv_bytes_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:3495:4: (lv_bytes_4_0= ruleINTEGER )
            // InternalFORMAT.g:3496:5: lv_bytes_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatLocalOffsetAccess().getBytesINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_bytes_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatLocalOffsetRule());
              					}
              					set(
              						current,
              						"bytes",
              						lv_bytes_4_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFormatLocalOffsetAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFormatLocalOffsetAccess().getBitsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFormatLocalOffsetAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:3525:3: ( (lv_bits_8_0= ruleINTEGER ) )
            // InternalFORMAT.g:3526:4: (lv_bits_8_0= ruleINTEGER )
            {
            // InternalFORMAT.g:3526:4: (lv_bits_8_0= ruleINTEGER )
            // InternalFORMAT.g:3527:5: lv_bits_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatLocalOffsetAccess().getBitsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_bits_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatLocalOffsetRule());
              					}
              					set(
              						current,
              						"bits",
              						lv_bits_8_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFormatLocalOffsetAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSFormatLocalOffsetAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSFormatLocalOffsetAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleGSSFormatLocalOffset"


    // $ANTLR start "entryRuleGSSFormatArrayRef"
    // InternalFORMAT.g:3560:1: entryRuleGSSFormatArrayRef returns [EObject current=null] : iv_ruleGSSFormatArrayRef= ruleGSSFormatArrayRef EOF ;
    public final EObject entryRuleGSSFormatArrayRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFormatArrayRef = null;


        try {
            // InternalFORMAT.g:3560:58: (iv_ruleGSSFormatArrayRef= ruleGSSFormatArrayRef EOF )
            // InternalFORMAT.g:3561:2: iv_ruleGSSFormatArrayRef= ruleGSSFormatArrayRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFormatArrayRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFormatArrayRef=ruleGSSFormatArrayRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFormatArrayRef; 
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
    // $ANTLR end "entryRuleGSSFormatArrayRef"


    // $ANTLR start "ruleGSSFormatArrayRef"
    // InternalFORMAT.g:3567:1: ruleGSSFormatArrayRef returns [EObject current=null] : (otherlv_0= 'GSSFormatArrayRef' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSFormatArrayRef() throws RecognitionException {
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
            // InternalFORMAT.g:3573:2: ( (otherlv_0= 'GSSFormatArrayRef' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalFORMAT.g:3574:2: (otherlv_0= 'GSSFormatArrayRef' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalFORMAT.g:3574:2: (otherlv_0= 'GSSFormatArrayRef' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalFORMAT.g:3575:3: otherlv_0= 'GSSFormatArrayRef' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFormatArrayRefAccess().getGSSFormatArrayRefKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFormatArrayRefAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFormatArrayRefAccess().getFidRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFormatArrayRefAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:3591:3: ( (lv_fidRef_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:3592:4: (lv_fidRef_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:3592:4: (lv_fidRef_4_0= ruleINTEGER )
            // InternalFORMAT.g:3593:5: lv_fidRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFormatArrayRefAccess().getFidRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fidRef_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFormatArrayRefRule());
              					}
              					set(
              						current,
              						"fidRef",
              						lv_fidRef_4_0,
              						"es.uah.aut.srg.gss.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFormatArrayRefAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFormatArrayRefAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFormatArrayRefAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSFormatArrayRef"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalFORMAT.g:3626:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalFORMAT.g:3626:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalFORMAT.g:3627:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalFORMAT.g:3633:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalFORMAT.g:3639:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalFORMAT.g:3640:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalFORMAT.g:3640:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalFORMAT.g:3641:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalFORMAT.g:3648:3: (kw= '.' this_ID_2= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==56) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFORMAT.g:3649:4: kw= '.' this_ID_2= RULE_ID
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
    // InternalFORMAT.g:3666:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalFORMAT.g:3666:47: (iv_ruleVersion= ruleVersion EOF )
            // InternalFORMAT.g:3667:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalFORMAT.g:3673:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // InternalFORMAT.g:3679:2: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalFORMAT.g:3680:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalFORMAT.g:3680:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalFORMAT.g:3681:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalFORMAT.g:3681:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RULE_ID) ) {
                    alt14=2;
                }
                else if ( (LA14_1==EOF||LA14_1==14||LA14_1==56) ) {
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
                    // InternalFORMAT.g:3682:4: this_INT_0= RULE_INT
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
                    // InternalFORMAT.g:3690:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalFORMAT.g:3690:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalFORMAT.g:3691:5: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalFORMAT.g:3691:5: (this_INT_1= RULE_INT )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_INT) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalFORMAT.g:3692:6: this_INT_1= RULE_INT
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

            // InternalFORMAT.g:3709:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==56) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalFORMAT.g:3710:4: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,56,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    // InternalFORMAT.g:3715:4: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==RULE_INT) ) {
            	        int LA16_1 = input.LA(2);

            	        if ( (LA16_1==RULE_ID) ) {
            	            alt16=2;
            	        }
            	        else if ( (LA16_1==EOF||LA16_1==14||LA16_1==56) ) {
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
            	            // InternalFORMAT.g:3716:5: this_INT_4= RULE_INT
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
            	            // InternalFORMAT.g:3724:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalFORMAT.g:3724:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalFORMAT.g:3725:6: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalFORMAT.g:3725:6: (this_INT_5= RULE_INT )?
            	            int alt15=2;
            	            int LA15_0 = input.LA(1);

            	            if ( (LA15_0==RULE_INT) ) {
            	                alt15=1;
            	            }
            	            switch (alt15) {
            	                case 1 :
            	                    // InternalFORMAT.g:3726:7: this_INT_5= RULE_INT
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


    // $ANTLR start "entryRuleINTEGER"
    // InternalFORMAT.g:3748:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // InternalFORMAT.g:3748:47: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalFORMAT.g:3749:2: iv_ruleINTEGER= ruleINTEGER EOF
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
    // InternalFORMAT.g:3755:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;


        	enterRule();

        try {
            // InternalFORMAT.g:3761:2: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // InternalFORMAT.g:3762:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // InternalFORMAT.g:3762:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT||LA19_0==57) ) {
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
                    // InternalFORMAT.g:3763:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // InternalFORMAT.g:3763:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // InternalFORMAT.g:3764:4: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // InternalFORMAT.g:3764:4: (kw= '-' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==57) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalFORMAT.g:3765:5: kw= '-'
                            {
                            kw=(Token)match(input,57,FollowSets000.FOLLOW_53); if (state.failed) return current;
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
                    // InternalFORMAT.g:3780:3: this_HEXADECIMAL_2= RULE_HEXADECIMAL
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


    // $ANTLR start "ruleGSSFormatFormatType"
    // InternalFORMAT.g:3791:1: ruleGSSFormatFormatType returns [Enumerator current=null] : ( (enumLiteral_0= 'TM' ) | (enumLiteral_1= 'TC' ) ) ;
    public final Enumerator ruleGSSFormatFormatType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFORMAT.g:3797:2: ( ( (enumLiteral_0= 'TM' ) | (enumLiteral_1= 'TC' ) ) )
            // InternalFORMAT.g:3798:2: ( (enumLiteral_0= 'TM' ) | (enumLiteral_1= 'TC' ) )
            {
            // InternalFORMAT.g:3798:2: ( (enumLiteral_0= 'TM' ) | (enumLiteral_1= 'TC' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==58) ) {
                alt20=1;
            }
            else if ( (LA20_0==59) ) {
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
                    // InternalFORMAT.g:3799:3: (enumLiteral_0= 'TM' )
                    {
                    // InternalFORMAT.g:3799:3: (enumLiteral_0= 'TM' )
                    // InternalFORMAT.g:3800:4: enumLiteral_0= 'TM'
                    {
                    enumLiteral_0=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFormatFormatTypeAccess().getTMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSFormatFormatTypeAccess().getTMEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFORMAT.g:3807:3: (enumLiteral_1= 'TC' )
                    {
                    // InternalFORMAT.g:3807:3: (enumLiteral_1= 'TC' )
                    // InternalFORMAT.g:3808:4: enumLiteral_1= 'TC'
                    {
                    enumLiteral_1=(Token)match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFormatFormatTypeAccess().getTCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSFormatFormatTypeAccess().getTCEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGSSFormatFormatType"


    // $ANTLR start "ruleGSSFormatFieldType"
    // InternalFORMAT.g:3818:1: ruleGSSFormatFieldType returns [Enumerator current=null] : ( (enumLiteral_0= 'structured' ) | (enumLiteral_1= 'uint' ) | (enumLiteral_2= 'flag' ) | (enumLiteral_3= 'enumerated' ) | (enumLiteral_4= 'bit_vector' ) | (enumLiteral_5= 'byte_vector' ) | (enumLiteral_6= 'float' ) | (enumLiteral_7= 'deduced' ) ) ;
    public final Enumerator ruleGSSFormatFieldType() throws RecognitionException {
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
            // InternalFORMAT.g:3824:2: ( ( (enumLiteral_0= 'structured' ) | (enumLiteral_1= 'uint' ) | (enumLiteral_2= 'flag' ) | (enumLiteral_3= 'enumerated' ) | (enumLiteral_4= 'bit_vector' ) | (enumLiteral_5= 'byte_vector' ) | (enumLiteral_6= 'float' ) | (enumLiteral_7= 'deduced' ) ) )
            // InternalFORMAT.g:3825:2: ( (enumLiteral_0= 'structured' ) | (enumLiteral_1= 'uint' ) | (enumLiteral_2= 'flag' ) | (enumLiteral_3= 'enumerated' ) | (enumLiteral_4= 'bit_vector' ) | (enumLiteral_5= 'byte_vector' ) | (enumLiteral_6= 'float' ) | (enumLiteral_7= 'deduced' ) )
            {
            // InternalFORMAT.g:3825:2: ( (enumLiteral_0= 'structured' ) | (enumLiteral_1= 'uint' ) | (enumLiteral_2= 'flag' ) | (enumLiteral_3= 'enumerated' ) | (enumLiteral_4= 'bit_vector' ) | (enumLiteral_5= 'byte_vector' ) | (enumLiteral_6= 'float' ) | (enumLiteral_7= 'deduced' ) )
            int alt21=8;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt21=1;
                }
                break;
            case 61:
                {
                alt21=2;
                }
                break;
            case 62:
                {
                alt21=3;
                }
                break;
            case 63:
                {
                alt21=4;
                }
                break;
            case 64:
                {
                alt21=5;
                }
                break;
            case 65:
                {
                alt21=6;
                }
                break;
            case 66:
                {
                alt21=7;
                }
                break;
            case 67:
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
                    // InternalFORMAT.g:3826:3: (enumLiteral_0= 'structured' )
                    {
                    // InternalFORMAT.g:3826:3: (enumLiteral_0= 'structured' )
                    // InternalFORMAT.g:3827:4: enumLiteral_0= 'structured'
                    {
                    enumLiteral_0=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFormatFieldTypeAccess().getStructuredEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSFormatFieldTypeAccess().getStructuredEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFORMAT.g:3834:3: (enumLiteral_1= 'uint' )
                    {
                    // InternalFORMAT.g:3834:3: (enumLiteral_1= 'uint' )
                    // InternalFORMAT.g:3835:4: enumLiteral_1= 'uint'
                    {
                    enumLiteral_1=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFormatFieldTypeAccess().getUintEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSFormatFieldTypeAccess().getUintEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFORMAT.g:3842:3: (enumLiteral_2= 'flag' )
                    {
                    // InternalFORMAT.g:3842:3: (enumLiteral_2= 'flag' )
                    // InternalFORMAT.g:3843:4: enumLiteral_2= 'flag'
                    {
                    enumLiteral_2=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFormatFieldTypeAccess().getFlagEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSFormatFieldTypeAccess().getFlagEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFORMAT.g:3850:3: (enumLiteral_3= 'enumerated' )
                    {
                    // InternalFORMAT.g:3850:3: (enumLiteral_3= 'enumerated' )
                    // InternalFORMAT.g:3851:4: enumLiteral_3= 'enumerated'
                    {
                    enumLiteral_3=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFormatFieldTypeAccess().getEnumeratedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getGSSFormatFieldTypeAccess().getEnumeratedEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalFORMAT.g:3858:3: (enumLiteral_4= 'bit_vector' )
                    {
                    // InternalFORMAT.g:3858:3: (enumLiteral_4= 'bit_vector' )
                    // InternalFORMAT.g:3859:4: enumLiteral_4= 'bit_vector'
                    {
                    enumLiteral_4=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFormatFieldTypeAccess().getBit_vectorEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getGSSFormatFieldTypeAccess().getBit_vectorEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalFORMAT.g:3866:3: (enumLiteral_5= 'byte_vector' )
                    {
                    // InternalFORMAT.g:3866:3: (enumLiteral_5= 'byte_vector' )
                    // InternalFORMAT.g:3867:4: enumLiteral_5= 'byte_vector'
                    {
                    enumLiteral_5=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFormatFieldTypeAccess().getByte_vectorEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getGSSFormatFieldTypeAccess().getByte_vectorEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalFORMAT.g:3874:3: (enumLiteral_6= 'float' )
                    {
                    // InternalFORMAT.g:3874:3: (enumLiteral_6= 'float' )
                    // InternalFORMAT.g:3875:4: enumLiteral_6= 'float'
                    {
                    enumLiteral_6=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFormatFieldTypeAccess().getFloatEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getGSSFormatFieldTypeAccess().getFloatEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalFORMAT.g:3882:3: (enumLiteral_7= 'deduced' )
                    {
                    // InternalFORMAT.g:3882:3: (enumLiteral_7= 'deduced' )
                    // InternalFORMAT.g:3883:4: enumLiteral_7= 'deduced'
                    {
                    enumLiteral_7=(Token)match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFormatFieldTypeAccess().getDeducedEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getGSSFormatFieldTypeAccess().getDeducedEnumLiteralDeclaration_7());
                      			
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
    // $ANTLR end "ruleGSSFormatFieldType"


    // $ANTLR start "ruleGSSFormatFieldByteOrder"
    // InternalFORMAT.g:3893:1: ruleGSSFormatFieldByteOrder returns [Enumerator current=null] : ( (enumLiteral_0= 'big_endian' ) | (enumLiteral_1= 'little_endian' ) | (enumLiteral_2= 'na' ) ) ;
    public final Enumerator ruleGSSFormatFieldByteOrder() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalFORMAT.g:3899:2: ( ( (enumLiteral_0= 'big_endian' ) | (enumLiteral_1= 'little_endian' ) | (enumLiteral_2= 'na' ) ) )
            // InternalFORMAT.g:3900:2: ( (enumLiteral_0= 'big_endian' ) | (enumLiteral_1= 'little_endian' ) | (enumLiteral_2= 'na' ) )
            {
            // InternalFORMAT.g:3900:2: ( (enumLiteral_0= 'big_endian' ) | (enumLiteral_1= 'little_endian' ) | (enumLiteral_2= 'na' ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt22=1;
                }
                break;
            case 69:
                {
                alt22=2;
                }
                break;
            case 70:
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
                    // InternalFORMAT.g:3901:3: (enumLiteral_0= 'big_endian' )
                    {
                    // InternalFORMAT.g:3901:3: (enumLiteral_0= 'big_endian' )
                    // InternalFORMAT.g:3902:4: enumLiteral_0= 'big_endian'
                    {
                    enumLiteral_0=(Token)match(input,68,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFormatFieldByteOrderAccess().getBig_endianEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSFormatFieldByteOrderAccess().getBig_endianEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFORMAT.g:3909:3: (enumLiteral_1= 'little_endian' )
                    {
                    // InternalFORMAT.g:3909:3: (enumLiteral_1= 'little_endian' )
                    // InternalFORMAT.g:3910:4: enumLiteral_1= 'little_endian'
                    {
                    enumLiteral_1=(Token)match(input,69,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFormatFieldByteOrderAccess().getLittle_endianEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSFormatFieldByteOrderAccess().getLittle_endianEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFORMAT.g:3917:3: (enumLiteral_2= 'na' )
                    {
                    // InternalFORMAT.g:3917:3: (enumLiteral_2= 'na' )
                    // InternalFORMAT.g:3918:4: enumLiteral_2= 'na'
                    {
                    enumLiteral_2=(Token)match(input,70,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFormatFieldByteOrderAccess().getNaEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSFormatFieldByteOrderAccess().getNaEnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleGSSFormatFieldByteOrder"


    // $ANTLR start "ruleGSSFormatSFieldFirstBit"
    // InternalFORMAT.g:3928:1: ruleGSSFormatSFieldFirstBit returns [Enumerator current=null] : ( (enumLiteral_0= 'MSB' ) | (enumLiteral_1= 'LSB' ) ) ;
    public final Enumerator ruleGSSFormatSFieldFirstBit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFORMAT.g:3934:2: ( ( (enumLiteral_0= 'MSB' ) | (enumLiteral_1= 'LSB' ) ) )
            // InternalFORMAT.g:3935:2: ( (enumLiteral_0= 'MSB' ) | (enumLiteral_1= 'LSB' ) )
            {
            // InternalFORMAT.g:3935:2: ( (enumLiteral_0= 'MSB' ) | (enumLiteral_1= 'LSB' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==71) ) {
                alt23=1;
            }
            else if ( (LA23_0==72) ) {
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
                    // InternalFORMAT.g:3936:3: (enumLiteral_0= 'MSB' )
                    {
                    // InternalFORMAT.g:3936:3: (enumLiteral_0= 'MSB' )
                    // InternalFORMAT.g:3937:4: enumLiteral_0= 'MSB'
                    {
                    enumLiteral_0=(Token)match(input,71,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFormatSFieldFirstBitAccess().getMSBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSFormatSFieldFirstBitAccess().getMSBEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFORMAT.g:3944:3: (enumLiteral_1= 'LSB' )
                    {
                    // InternalFORMAT.g:3944:3: (enumLiteral_1= 'LSB' )
                    // InternalFORMAT.g:3945:4: enumLiteral_1= 'LSB'
                    {
                    enumLiteral_1=(Token)match(input,72,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFormatSFieldFirstBitAccess().getLSBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSFormatSFieldFirstBitAccess().getLSBEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGSSFormatSFieldFirstBit"


    // $ANTLR start "ruleGSSFormatUnit"
    // InternalFORMAT.g:3955:1: ruleGSSFormatUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) | (enumLiteral_2= 'halfword' ) | (enumLiteral_3= 'string10' ) | (enumLiteral_4= 'string17' ) | (enumLiteral_5= 'string69' ) ) ;
    public final Enumerator ruleGSSFormatUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalFORMAT.g:3961:2: ( ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) | (enumLiteral_2= 'halfword' ) | (enumLiteral_3= 'string10' ) | (enumLiteral_4= 'string17' ) | (enumLiteral_5= 'string69' ) ) )
            // InternalFORMAT.g:3962:2: ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) | (enumLiteral_2= 'halfword' ) | (enumLiteral_3= 'string10' ) | (enumLiteral_4= 'string17' ) | (enumLiteral_5= 'string69' ) )
            {
            // InternalFORMAT.g:3962:2: ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) | (enumLiteral_2= 'halfword' ) | (enumLiteral_3= 'string10' ) | (enumLiteral_4= 'string17' ) | (enumLiteral_5= 'string69' ) )
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
            case 73:
                {
                alt24=3;
                }
                break;
            case 74:
                {
                alt24=4;
                }
                break;
            case 75:
                {
                alt24=5;
                }
                break;
            case 76:
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
                    // InternalFORMAT.g:3963:3: (enumLiteral_0= 'bytes' )
                    {
                    // InternalFORMAT.g:3963:3: (enumLiteral_0= 'bytes' )
                    // InternalFORMAT.g:3964:4: enumLiteral_0= 'bytes'
                    {
                    enumLiteral_0=(Token)match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFormatUnitAccess().getBytesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSFormatUnitAccess().getBytesEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFORMAT.g:3971:3: (enumLiteral_1= 'bits' )
                    {
                    // InternalFORMAT.g:3971:3: (enumLiteral_1= 'bits' )
                    // InternalFORMAT.g:3972:4: enumLiteral_1= 'bits'
                    {
                    enumLiteral_1=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFormatUnitAccess().getBitsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSFormatUnitAccess().getBitsEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFORMAT.g:3979:3: (enumLiteral_2= 'halfword' )
                    {
                    // InternalFORMAT.g:3979:3: (enumLiteral_2= 'halfword' )
                    // InternalFORMAT.g:3980:4: enumLiteral_2= 'halfword'
                    {
                    enumLiteral_2=(Token)match(input,73,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFormatUnitAccess().getHalfwordEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSFormatUnitAccess().getHalfwordEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFORMAT.g:3987:3: (enumLiteral_3= 'string10' )
                    {
                    // InternalFORMAT.g:3987:3: (enumLiteral_3= 'string10' )
                    // InternalFORMAT.g:3988:4: enumLiteral_3= 'string10'
                    {
                    enumLiteral_3=(Token)match(input,74,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFormatUnitAccess().getString10EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getGSSFormatUnitAccess().getString10EnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalFORMAT.g:3995:3: (enumLiteral_4= 'string17' )
                    {
                    // InternalFORMAT.g:3995:3: (enumLiteral_4= 'string17' )
                    // InternalFORMAT.g:3996:4: enumLiteral_4= 'string17'
                    {
                    enumLiteral_4=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFormatUnitAccess().getString17EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getGSSFormatUnitAccess().getString17EnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalFORMAT.g:4003:3: (enumLiteral_5= 'string69' )
                    {
                    // InternalFORMAT.g:4003:3: (enumLiteral_5= 'string69' )
                    // InternalFORMAT.g:4004:4: enumLiteral_5= 'string69'
                    {
                    enumLiteral_5=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFormatUnitAccess().getString69EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getGSSFormatUnitAccess().getString69EnumLiteralDeclaration_5());
                      			
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
    // $ANTLR end "ruleGSSFormatUnit"


    // $ANTLR start "ruleGSSFormatPower"
    // InternalFORMAT.g:4014:1: ruleGSSFormatPower returns [Enumerator current=null] : ( (enumLiteral_0= '2bits' ) | (enumLiteral_1= '2bits_with_0' ) ) ;
    public final Enumerator ruleGSSFormatPower() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFORMAT.g:4020:2: ( ( (enumLiteral_0= '2bits' ) | (enumLiteral_1= '2bits_with_0' ) ) )
            // InternalFORMAT.g:4021:2: ( (enumLiteral_0= '2bits' ) | (enumLiteral_1= '2bits_with_0' ) )
            {
            // InternalFORMAT.g:4021:2: ( (enumLiteral_0= '2bits' ) | (enumLiteral_1= '2bits_with_0' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==77) ) {
                alt25=1;
            }
            else if ( (LA25_0==78) ) {
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
                    // InternalFORMAT.g:4022:3: (enumLiteral_0= '2bits' )
                    {
                    // InternalFORMAT.g:4022:3: (enumLiteral_0= '2bits' )
                    // InternalFORMAT.g:4023:4: enumLiteral_0= '2bits'
                    {
                    enumLiteral_0=(Token)match(input,77,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFormatPowerAccess().get_2EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSFormatPowerAccess().get_2EnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFORMAT.g:4030:3: (enumLiteral_1= '2bits_with_0' )
                    {
                    // InternalFORMAT.g:4030:3: (enumLiteral_1= '2bits_with_0' )
                    // InternalFORMAT.g:4031:4: enumLiteral_1= '2bits_with_0'
                    {
                    enumLiteral_1=(Token)match(input,78,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFormatPowerAccess().get_2_with_0EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSFormatPowerAccess().get_2_with_0EnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGSSFormatPower"


    // $ANTLR start "ruleGSSFormatCheckType"
    // InternalFORMAT.g:4041:1: ruleGSSFormatCheckType returns [Enumerator current=null] : ( (enumLiteral_0= 'crc16' ) | (enumLiteral_1= 'checksum16' ) ) ;
    public final Enumerator ruleGSSFormatCheckType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFORMAT.g:4047:2: ( ( (enumLiteral_0= 'crc16' ) | (enumLiteral_1= 'checksum16' ) ) )
            // InternalFORMAT.g:4048:2: ( (enumLiteral_0= 'crc16' ) | (enumLiteral_1= 'checksum16' ) )
            {
            // InternalFORMAT.g:4048:2: ( (enumLiteral_0= 'crc16' ) | (enumLiteral_1= 'checksum16' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==79) ) {
                alt26=1;
            }
            else if ( (LA26_0==80) ) {
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
                    // InternalFORMAT.g:4049:3: (enumLiteral_0= 'crc16' )
                    {
                    // InternalFORMAT.g:4049:3: (enumLiteral_0= 'crc16' )
                    // InternalFORMAT.g:4050:4: enumLiteral_0= 'crc16'
                    {
                    enumLiteral_0=(Token)match(input,79,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFormatCheckTypeAccess().getCrc16EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSFormatCheckTypeAccess().getCrc16EnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFORMAT.g:4057:3: (enumLiteral_1= 'checksum16' )
                    {
                    // InternalFORMAT.g:4057:3: (enumLiteral_1= 'checksum16' )
                    // InternalFORMAT.g:4058:4: enumLiteral_1= 'checksum16'
                    {
                    enumLiteral_1=(Token)match(input,80,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFormatCheckTypeAccess().getChecksum16EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSFormatCheckTypeAccess().getChecksum16EnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGSSFormatCheckType"

    // $ANTLR start synpred2_InternalFORMAT
    public final void synpred2_InternalFORMAT_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;


        // InternalFORMAT.g:243:4: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) )
        // InternalFORMAT.g:243:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        {
        // InternalFORMAT.g:243:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        // InternalFORMAT.g:244:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalFORMAT", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalFORMAT.g:244:112: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        // InternalFORMAT.g:245:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 0);
        // InternalFORMAT.g:248:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        // InternalFORMAT.g:248:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalFORMAT", "true");
        }
        // InternalFORMAT.g:248:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        // InternalFORMAT.g:248:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
        {
        otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalFORMAT.g:256:9: ( (lv_uri_6_0= ruleQualifiedName ) )
        // InternalFORMAT.g:257:10: (lv_uri_6_0= ruleQualifiedName )
        {
        // InternalFORMAT.g:257:10: (lv_uri_6_0= ruleQualifiedName )
        // InternalFORMAT.g:258:11: lv_uri_6_0= ruleQualifiedName
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
          										
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
    // $ANTLR end synpred2_InternalFORMAT

    // $ANTLR start synpred3_InternalFORMAT
    public final void synpred3_InternalFORMAT_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_version_10_0 = null;


        // InternalFORMAT.g:285:4: ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )
        // InternalFORMAT.g:285:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        {
        // InternalFORMAT.g:285:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        // InternalFORMAT.g:286:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalFORMAT", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 1)");
        }
        // InternalFORMAT.g:286:112: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        // InternalFORMAT.g:287:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 1);
        // InternalFORMAT.g:290:9: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        // InternalFORMAT.g:290:10: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalFORMAT", "true");
        }
        // InternalFORMAT.g:290:19: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        // InternalFORMAT.g:290:20: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
        {
        otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalFORMAT.g:298:9: ( (lv_version_10_0= ruleVersion ) )
        // InternalFORMAT.g:299:10: (lv_version_10_0= ruleVersion )
        {
        // InternalFORMAT.g:299:10: (lv_version_10_0= ruleVersion )
        // InternalFORMAT.g:300:11: lv_version_10_0= ruleVersion
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getVersionVersionParserRuleCall_3_1_2_0());
          										
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
    // $ANTLR end synpred3_InternalFORMAT

    // $ANTLR start synpred4_InternalFORMAT
    public final void synpred4_InternalFORMAT_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_protocol_14_0=null;
        Token otherlv_15=null;

        // InternalFORMAT.g:327:4: ( ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) )
        // InternalFORMAT.g:327:4: ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) )
        {
        // InternalFORMAT.g:327:4: ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) )
        // InternalFORMAT.g:328:5: {...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred4_InternalFORMAT", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 2)");
        }
        // InternalFORMAT.g:328:112: ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) )
        // InternalFORMAT.g:329:6: ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 2);
        // InternalFORMAT.g:332:9: ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) )
        // InternalFORMAT.g:332:10: {...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred4_InternalFORMAT", "true");
        }
        // InternalFORMAT.g:332:19: (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' )
        // InternalFORMAT.g:332:20: otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';'
        {
        otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalFORMAT.g:340:9: ( (lv_protocol_14_0= RULE_ID ) )
        // InternalFORMAT.g:341:10: (lv_protocol_14_0= RULE_ID )
        {
        // InternalFORMAT.g:341:10: (lv_protocol_14_0= RULE_ID )
        // InternalFORMAT.g:342:11: lv_protocol_14_0= RULE_ID
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
    // $ANTLR end synpred4_InternalFORMAT

    // $ANTLR start synpred12_InternalFORMAT
    public final void synpred12_InternalFORMAT_fragment() throws RecognitionException {   
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


        // InternalFORMAT.g:368:4: ( ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* ) ) ) ) )
        // InternalFORMAT.g:368:4: ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* ) ) ) )
        {
        // InternalFORMAT.g:368:4: ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* ) ) ) )
        // InternalFORMAT.g:369:5: {...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalFORMAT", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 3)");
        }
        // InternalFORMAT.g:369:112: ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* ) ) )
        // InternalFORMAT.g:370:6: ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSFormatFormatAccess().getUnorderedGroup_3(), 3);
        // InternalFORMAT.g:373:9: ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* ) )
        // InternalFORMAT.g:373:10: {...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalFORMAT", "true");
        }
        // InternalFORMAT.g:373:19: ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )* )
        // InternalFORMAT.g:373:20: (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )*
        {
        // InternalFORMAT.g:373:20: (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';' )
        // InternalFORMAT.g:374:10: otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleGSSFormatFormatType ) ) otherlv_19= ';'
        {
        otherlv_16=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return ;
        // InternalFORMAT.g:382:10: ( (lv_type_18_0= ruleGSSFormatFormatType ) )
        // InternalFORMAT.g:383:11: (lv_type_18_0= ruleGSSFormatFormatType )
        {
        // InternalFORMAT.g:383:11: (lv_type_18_0= ruleGSSFormatFormatType )
        // InternalFORMAT.g:384:12: lv_type_18_0= ruleGSSFormatFormatType
        {
        if ( state.backtracking==0 ) {

          												newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getTypeGSSFormatFormatTypeEnumRuleCall_3_3_0_2_0());
          											
        }
        pushFollow(FollowSets000.FOLLOW_6);
        lv_type_18_0=ruleGSSFormatFormatType();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_54); if (state.failed) return ;

        }

        // InternalFORMAT.g:406:9: ( ( (lv_CSField_20_0= ruleGSSFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleGSSFormatVSField ) ) | ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleGSSFormatAField ) ) | ( (lv_AIField_26_0= ruleGSSFormatAIField ) ) )*
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
        	    // InternalFORMAT.g:407:10: ( (lv_CSField_20_0= ruleGSSFormatCSField ) )
        	    {
        	    // InternalFORMAT.g:407:10: ( (lv_CSField_20_0= ruleGSSFormatCSField ) )
        	    // InternalFORMAT.g:408:11: (lv_CSField_20_0= ruleGSSFormatCSField )
        	    {
        	    // InternalFORMAT.g:408:11: (lv_CSField_20_0= ruleGSSFormatCSField )
        	    // InternalFORMAT.g:409:12: lv_CSField_20_0= ruleGSSFormatCSField
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getCSFieldGSSFormatCSFieldParserRuleCall_3_3_1_0_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_54);
        	    lv_CSField_20_0=ruleGSSFormatCSField();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 2 :
        	    // InternalFORMAT.g:427:10: ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) )
        	    {
        	    // InternalFORMAT.g:427:10: ( (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField ) )
        	    // InternalFORMAT.g:428:11: (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField )
        	    {
        	    // InternalFORMAT.g:428:11: (lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField )
        	    // InternalFORMAT.g:429:12: lv_CSFormulaField_21_0= ruleGSSFormatCSFormulaField
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getCSFormulaFieldGSSFormatCSFormulaFieldParserRuleCall_3_3_1_1_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_54);
        	    lv_CSFormulaField_21_0=ruleGSSFormatCSFormulaField();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 3 :
        	    // InternalFORMAT.g:447:10: ( (lv_VSField_22_0= ruleGSSFormatVSField ) )
        	    {
        	    // InternalFORMAT.g:447:10: ( (lv_VSField_22_0= ruleGSSFormatVSField ) )
        	    // InternalFORMAT.g:448:11: (lv_VSField_22_0= ruleGSSFormatVSField )
        	    {
        	    // InternalFORMAT.g:448:11: (lv_VSField_22_0= ruleGSSFormatVSField )
        	    // InternalFORMAT.g:449:12: lv_VSField_22_0= ruleGSSFormatVSField
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getVSFieldGSSFormatVSFieldParserRuleCall_3_3_1_2_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_54);
        	    lv_VSField_22_0=ruleGSSFormatVSField();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 4 :
        	    // InternalFORMAT.g:467:10: ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) )
        	    {
        	    // InternalFORMAT.g:467:10: ( (lv_FDICField_23_0= ruleGSSFormatFDICField ) )
        	    // InternalFORMAT.g:468:11: (lv_FDICField_23_0= ruleGSSFormatFDICField )
        	    {
        	    // InternalFORMAT.g:468:11: (lv_FDICField_23_0= ruleGSSFormatFDICField )
        	    // InternalFORMAT.g:469:12: lv_FDICField_23_0= ruleGSSFormatFDICField
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getFDICFieldGSSFormatFDICFieldParserRuleCall_3_3_1_3_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_54);
        	    lv_FDICField_23_0=ruleGSSFormatFDICField();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 5 :
        	    // InternalFORMAT.g:487:10: ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) )
        	    {
        	    // InternalFORMAT.g:487:10: ( (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize ) )
        	    // InternalFORMAT.g:488:11: (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize )
        	    {
        	    // InternalFORMAT.g:488:11: (lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize )
        	    // InternalFORMAT.g:489:12: lv_VRFieldSize_24_0= ruleGSSFormatVRFieldSize
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getVRFieldSizeGSSFormatVRFieldSizeParserRuleCall_3_3_1_4_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_54);
        	    lv_VRFieldSize_24_0=ruleGSSFormatVRFieldSize();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 6 :
        	    // InternalFORMAT.g:507:10: ( (lv_AField_25_0= ruleGSSFormatAField ) )
        	    {
        	    // InternalFORMAT.g:507:10: ( (lv_AField_25_0= ruleGSSFormatAField ) )
        	    // InternalFORMAT.g:508:11: (lv_AField_25_0= ruleGSSFormatAField )
        	    {
        	    // InternalFORMAT.g:508:11: (lv_AField_25_0= ruleGSSFormatAField )
        	    // InternalFORMAT.g:509:12: lv_AField_25_0= ruleGSSFormatAField
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getAFieldGSSFormatAFieldParserRuleCall_3_3_1_5_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_54);
        	    lv_AField_25_0=ruleGSSFormatAField();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 7 :
        	    // InternalFORMAT.g:527:10: ( (lv_AIField_26_0= ruleGSSFormatAIField ) )
        	    {
        	    // InternalFORMAT.g:527:10: ( (lv_AIField_26_0= ruleGSSFormatAIField ) )
        	    // InternalFORMAT.g:528:11: (lv_AIField_26_0= ruleGSSFormatAIField )
        	    {
        	    // InternalFORMAT.g:528:11: (lv_AIField_26_0= ruleGSSFormatAIField )
        	    // InternalFORMAT.g:529:12: lv_AIField_26_0= ruleGSSFormatAIField
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSFormatFormatAccess().getAIFieldGSSFormatAIFieldParserRuleCall_3_3_1_6_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_54);
        	    lv_AIField_26_0=ruleGSSFormatAIField();

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
    // $ANTLR end synpred12_InternalFORMAT

    // Delegated rules

    public final boolean synpred3_InternalFORMAT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalFORMAT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalFORMAT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalFORMAT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalFORMAT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalFORMAT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalFORMAT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalFORMAT_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0C00000000000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000DE07E0000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x02000000000000C0L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004100000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0xF000000000000000L,0x000000000000000FL});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000070L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000204000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000006000000000L,0x0000000000001E00L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001000000200000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0008000000200000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0100000000000002L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000DE0400002L});
    }


}