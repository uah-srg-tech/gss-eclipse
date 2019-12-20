package es.uah.aut.srg.gss.lang.tcinput.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uah.aut.srg.gss.lang.tcinput.services.TCINPUTGrammarAccess;



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
public class InternalTCINPUTParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_UINT_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<GSSTCInput'", "'name='", "'type='", "'subtype='", "'levels='", "'>'", "'<to_level3_export'", "'file='", "'/>'", "'<level3_format'", "'<to_level2_export'", "'<level2_format'", "'<to_level1_export'", "'<level1_format'", "'<to_level0_export'", "'<level0_format'", "'<fields>'", "'</fields>'", "'</GSSTCInput>'", "'<InputField'", "'gssField='", "'enumRef='"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_UINT_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTCINPUTParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTCINPUTParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTCINPUTParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTCINPUT.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private TCINPUTGrammarAccess grammarAccess;

        public InternalTCINPUTParser(TokenStream input, TCINPUTGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GSSTCInput";
       	}

       	@Override
       	protected TCINPUTGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGSSTCInput"
    // InternalTCINPUT.g:77:1: entryRuleGSSTCInput returns [EObject current=null] : iv_ruleGSSTCInput= ruleGSSTCInput EOF ;
    public final EObject entryRuleGSSTCInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTCInput = null;


        try {
            // InternalTCINPUT.g:77:51: (iv_ruleGSSTCInput= ruleGSSTCInput EOF )
            // InternalTCINPUT.g:78:2: iv_ruleGSSTCInput= ruleGSSTCInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTCInputRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTCInput=ruleGSSTCInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTCInput; 
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
    // $ANTLR end "entryRuleGSSTCInput"


    // $ANTLR start "ruleGSSTCInput"
    // InternalTCINPUT.g:84:1: ruleGSSTCInput returns [EObject current=null] : (otherlv_0= '<GSSTCInput' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'type=' ( (lv_type_4_0= RULE_UINT_STRING ) ) otherlv_5= 'subtype=' ( (lv_subtype_6_0= RULE_UINT_STRING ) ) otherlv_7= 'levels=' ( (lv_levels_8_0= RULE_UINT_STRING ) ) otherlv_9= '>' (otherlv_10= '<to_level3_export' otherlv_11= 'file=' ( (otherlv_12= RULE_STRING ) ) otherlv_13= '/>' )? (otherlv_14= '<level3_format' otherlv_15= 'file=' ( (otherlv_16= RULE_STRING ) ) otherlv_17= '/>' )? (otherlv_18= '<to_level2_export' otherlv_19= 'file=' ( (otherlv_20= RULE_STRING ) ) otherlv_21= '/>' )? (otherlv_22= '<level2_format' otherlv_23= 'file=' ( (otherlv_24= RULE_STRING ) ) otherlv_25= '/>' )? (otherlv_26= '<to_level1_export' otherlv_27= 'file=' ( (otherlv_28= RULE_STRING ) ) otherlv_29= '/>' )? (otherlv_30= '<level1_format' otherlv_31= 'file=' ( (otherlv_32= RULE_STRING ) ) otherlv_33= '/>' )? (otherlv_34= '<to_level0_export' otherlv_35= 'file=' ( (otherlv_36= RULE_STRING ) ) otherlv_37= '/>' )? (otherlv_38= '<level0_format' otherlv_39= 'file=' ( (otherlv_40= RULE_STRING ) ) otherlv_41= '/>' )? (otherlv_42= '<fields>' ( (lv_gssFields_43_0= ruleGSSTCInputField ) )+ otherlv_44= '</fields>' )? otherlv_45= '</GSSTCInput>' ) ;
    public final EObject ruleGSSTCInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_type_4_0=null;
        Token otherlv_5=null;
        Token lv_subtype_6_0=null;
        Token otherlv_7=null;
        Token lv_levels_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        EObject lv_gssFields_43_0 = null;



        	enterRule();

        try {
            // InternalTCINPUT.g:90:2: ( (otherlv_0= '<GSSTCInput' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'type=' ( (lv_type_4_0= RULE_UINT_STRING ) ) otherlv_5= 'subtype=' ( (lv_subtype_6_0= RULE_UINT_STRING ) ) otherlv_7= 'levels=' ( (lv_levels_8_0= RULE_UINT_STRING ) ) otherlv_9= '>' (otherlv_10= '<to_level3_export' otherlv_11= 'file=' ( (otherlv_12= RULE_STRING ) ) otherlv_13= '/>' )? (otherlv_14= '<level3_format' otherlv_15= 'file=' ( (otherlv_16= RULE_STRING ) ) otherlv_17= '/>' )? (otherlv_18= '<to_level2_export' otherlv_19= 'file=' ( (otherlv_20= RULE_STRING ) ) otherlv_21= '/>' )? (otherlv_22= '<level2_format' otherlv_23= 'file=' ( (otherlv_24= RULE_STRING ) ) otherlv_25= '/>' )? (otherlv_26= '<to_level1_export' otherlv_27= 'file=' ( (otherlv_28= RULE_STRING ) ) otherlv_29= '/>' )? (otherlv_30= '<level1_format' otherlv_31= 'file=' ( (otherlv_32= RULE_STRING ) ) otherlv_33= '/>' )? (otherlv_34= '<to_level0_export' otherlv_35= 'file=' ( (otherlv_36= RULE_STRING ) ) otherlv_37= '/>' )? (otherlv_38= '<level0_format' otherlv_39= 'file=' ( (otherlv_40= RULE_STRING ) ) otherlv_41= '/>' )? (otherlv_42= '<fields>' ( (lv_gssFields_43_0= ruleGSSTCInputField ) )+ otherlv_44= '</fields>' )? otherlv_45= '</GSSTCInput>' ) )
            // InternalTCINPUT.g:91:2: (otherlv_0= '<GSSTCInput' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'type=' ( (lv_type_4_0= RULE_UINT_STRING ) ) otherlv_5= 'subtype=' ( (lv_subtype_6_0= RULE_UINT_STRING ) ) otherlv_7= 'levels=' ( (lv_levels_8_0= RULE_UINT_STRING ) ) otherlv_9= '>' (otherlv_10= '<to_level3_export' otherlv_11= 'file=' ( (otherlv_12= RULE_STRING ) ) otherlv_13= '/>' )? (otherlv_14= '<level3_format' otherlv_15= 'file=' ( (otherlv_16= RULE_STRING ) ) otherlv_17= '/>' )? (otherlv_18= '<to_level2_export' otherlv_19= 'file=' ( (otherlv_20= RULE_STRING ) ) otherlv_21= '/>' )? (otherlv_22= '<level2_format' otherlv_23= 'file=' ( (otherlv_24= RULE_STRING ) ) otherlv_25= '/>' )? (otherlv_26= '<to_level1_export' otherlv_27= 'file=' ( (otherlv_28= RULE_STRING ) ) otherlv_29= '/>' )? (otherlv_30= '<level1_format' otherlv_31= 'file=' ( (otherlv_32= RULE_STRING ) ) otherlv_33= '/>' )? (otherlv_34= '<to_level0_export' otherlv_35= 'file=' ( (otherlv_36= RULE_STRING ) ) otherlv_37= '/>' )? (otherlv_38= '<level0_format' otherlv_39= 'file=' ( (otherlv_40= RULE_STRING ) ) otherlv_41= '/>' )? (otherlv_42= '<fields>' ( (lv_gssFields_43_0= ruleGSSTCInputField ) )+ otherlv_44= '</fields>' )? otherlv_45= '</GSSTCInput>' )
            {
            // InternalTCINPUT.g:91:2: (otherlv_0= '<GSSTCInput' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'type=' ( (lv_type_4_0= RULE_UINT_STRING ) ) otherlv_5= 'subtype=' ( (lv_subtype_6_0= RULE_UINT_STRING ) ) otherlv_7= 'levels=' ( (lv_levels_8_0= RULE_UINT_STRING ) ) otherlv_9= '>' (otherlv_10= '<to_level3_export' otherlv_11= 'file=' ( (otherlv_12= RULE_STRING ) ) otherlv_13= '/>' )? (otherlv_14= '<level3_format' otherlv_15= 'file=' ( (otherlv_16= RULE_STRING ) ) otherlv_17= '/>' )? (otherlv_18= '<to_level2_export' otherlv_19= 'file=' ( (otherlv_20= RULE_STRING ) ) otherlv_21= '/>' )? (otherlv_22= '<level2_format' otherlv_23= 'file=' ( (otherlv_24= RULE_STRING ) ) otherlv_25= '/>' )? (otherlv_26= '<to_level1_export' otherlv_27= 'file=' ( (otherlv_28= RULE_STRING ) ) otherlv_29= '/>' )? (otherlv_30= '<level1_format' otherlv_31= 'file=' ( (otherlv_32= RULE_STRING ) ) otherlv_33= '/>' )? (otherlv_34= '<to_level0_export' otherlv_35= 'file=' ( (otherlv_36= RULE_STRING ) ) otherlv_37= '/>' )? (otherlv_38= '<level0_format' otherlv_39= 'file=' ( (otherlv_40= RULE_STRING ) ) otherlv_41= '/>' )? (otherlv_42= '<fields>' ( (lv_gssFields_43_0= ruleGSSTCInputField ) )+ otherlv_44= '</fields>' )? otherlv_45= '</GSSTCInput>' )
            // InternalTCINPUT.g:92:3: otherlv_0= '<GSSTCInput' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'type=' ( (lv_type_4_0= RULE_UINT_STRING ) ) otherlv_5= 'subtype=' ( (lv_subtype_6_0= RULE_UINT_STRING ) ) otherlv_7= 'levels=' ( (lv_levels_8_0= RULE_UINT_STRING ) ) otherlv_9= '>' (otherlv_10= '<to_level3_export' otherlv_11= 'file=' ( (otherlv_12= RULE_STRING ) ) otherlv_13= '/>' )? (otherlv_14= '<level3_format' otherlv_15= 'file=' ( (otherlv_16= RULE_STRING ) ) otherlv_17= '/>' )? (otherlv_18= '<to_level2_export' otherlv_19= 'file=' ( (otherlv_20= RULE_STRING ) ) otherlv_21= '/>' )? (otherlv_22= '<level2_format' otherlv_23= 'file=' ( (otherlv_24= RULE_STRING ) ) otherlv_25= '/>' )? (otherlv_26= '<to_level1_export' otherlv_27= 'file=' ( (otherlv_28= RULE_STRING ) ) otherlv_29= '/>' )? (otherlv_30= '<level1_format' otherlv_31= 'file=' ( (otherlv_32= RULE_STRING ) ) otherlv_33= '/>' )? (otherlv_34= '<to_level0_export' otherlv_35= 'file=' ( (otherlv_36= RULE_STRING ) ) otherlv_37= '/>' )? (otherlv_38= '<level0_format' otherlv_39= 'file=' ( (otherlv_40= RULE_STRING ) ) otherlv_41= '/>' )? (otherlv_42= '<fields>' ( (lv_gssFields_43_0= ruleGSSTCInputField ) )+ otherlv_44= '</fields>' )? otherlv_45= '</GSSTCInput>'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTCInputAccess().getGSSTCInputKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTCInputAccess().getNameKeyword_1());
              		
            }
            // InternalTCINPUT.g:100:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalTCINPUT.g:101:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalTCINPUT.g:101:4: (lv_name_2_0= RULE_STRING )
            // InternalTCINPUT.g:102:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getGSSTCInputAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTCInputRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTCInputAccess().getTypeKeyword_3());
              		
            }
            // InternalTCINPUT.g:122:3: ( (lv_type_4_0= RULE_UINT_STRING ) )
            // InternalTCINPUT.g:123:4: (lv_type_4_0= RULE_UINT_STRING )
            {
            // InternalTCINPUT.g:123:4: (lv_type_4_0= RULE_UINT_STRING )
            // InternalTCINPUT.g:124:5: lv_type_4_0= RULE_UINT_STRING
            {
            lv_type_4_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_type_4_0, grammarAccess.getGSSTCInputAccess().getTypeUINT_STRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTCInputRule());
              					}
              					setWithLastConsumed(
              						current,
              						"type",
              						lv_type_4_0,
              						"es.uah.aut.srg.gss.lang.tcinput.TCINPUT.UINT_STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTCInputAccess().getSubtypeKeyword_5());
              		
            }
            // InternalTCINPUT.g:144:3: ( (lv_subtype_6_0= RULE_UINT_STRING ) )
            // InternalTCINPUT.g:145:4: (lv_subtype_6_0= RULE_UINT_STRING )
            {
            // InternalTCINPUT.g:145:4: (lv_subtype_6_0= RULE_UINT_STRING )
            // InternalTCINPUT.g:146:5: lv_subtype_6_0= RULE_UINT_STRING
            {
            lv_subtype_6_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_subtype_6_0, grammarAccess.getGSSTCInputAccess().getSubtypeUINT_STRINGTerminalRuleCall_6_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTCInputRule());
              					}
              					setWithLastConsumed(
              						current,
              						"subtype",
              						lv_subtype_6_0,
              						"es.uah.aut.srg.gss.lang.tcinput.TCINPUT.UINT_STRING");
              				
            }

            }


            }

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTCInputAccess().getLevelsKeyword_7());
              		
            }
            // InternalTCINPUT.g:166:3: ( (lv_levels_8_0= RULE_UINT_STRING ) )
            // InternalTCINPUT.g:167:4: (lv_levels_8_0= RULE_UINT_STRING )
            {
            // InternalTCINPUT.g:167:4: (lv_levels_8_0= RULE_UINT_STRING )
            // InternalTCINPUT.g:168:5: lv_levels_8_0= RULE_UINT_STRING
            {
            lv_levels_8_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_levels_8_0, grammarAccess.getGSSTCInputAccess().getLevelsUINT_STRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTCInputRule());
              					}
              					setWithLastConsumed(
              						current,
              						"levels",
              						lv_levels_8_0,
              						"es.uah.aut.srg.gss.lang.tcinput.TCINPUT.UINT_STRING");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTCInputAccess().getGreaterThanSignKeyword_9());
              		
            }
            // InternalTCINPUT.g:188:3: (otherlv_10= '<to_level3_export' otherlv_11= 'file=' ( (otherlv_12= RULE_STRING ) ) otherlv_13= '/>' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTCINPUT.g:189:4: otherlv_10= '<to_level3_export' otherlv_11= 'file=' ( (otherlv_12= RULE_STRING ) ) otherlv_13= '/>'
                    {
                    otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getGSSTCInputAccess().getTo_level3_exportKeyword_10_0());
                      			
                    }
                    otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getGSSTCInputAccess().getFileKeyword_10_1());
                      			
                    }
                    // InternalTCINPUT.g:197:4: ( (otherlv_12= RULE_STRING ) )
                    // InternalTCINPUT.g:198:5: (otherlv_12= RULE_STRING )
                    {
                    // InternalTCINPUT.g:198:5: (otherlv_12= RULE_STRING )
                    // InternalTCINPUT.g:199:6: otherlv_12= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTCInputRule());
                      						}
                      					
                    }
                    otherlv_12=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_12, grammarAccess.getGSSTCInputAccess().getTo_level3_exportGSSExportExportCrossReference_10_2_0());
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,20,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getGSSTCInputAccess().getSolidusGreaterThanSignKeyword_10_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTCINPUT.g:218:3: (otherlv_14= '<level3_format' otherlv_15= 'file=' ( (otherlv_16= RULE_STRING ) ) otherlv_17= '/>' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTCINPUT.g:219:4: otherlv_14= '<level3_format' otherlv_15= 'file=' ( (otherlv_16= RULE_STRING ) ) otherlv_17= '/>'
                    {
                    otherlv_14=(Token)match(input,21,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSTCInputAccess().getLevel3_formatKeyword_11_0());
                      			
                    }
                    otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSTCInputAccess().getFileKeyword_11_1());
                      			
                    }
                    // InternalTCINPUT.g:227:4: ( (otherlv_16= RULE_STRING ) )
                    // InternalTCINPUT.g:228:5: (otherlv_16= RULE_STRING )
                    {
                    // InternalTCINPUT.g:228:5: (otherlv_16= RULE_STRING )
                    // InternalTCINPUT.g:229:6: otherlv_16= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTCInputRule());
                      						}
                      					
                    }
                    otherlv_16=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_16, grammarAccess.getGSSTCInputAccess().getLevel3_formatGSSFormatFormatCrossReference_11_2_0());
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSTCInputAccess().getSolidusGreaterThanSignKeyword_11_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTCINPUT.g:248:3: (otherlv_18= '<to_level2_export' otherlv_19= 'file=' ( (otherlv_20= RULE_STRING ) ) otherlv_21= '/>' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTCINPUT.g:249:4: otherlv_18= '<to_level2_export' otherlv_19= 'file=' ( (otherlv_20= RULE_STRING ) ) otherlv_21= '/>'
                    {
                    otherlv_18=(Token)match(input,22,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getGSSTCInputAccess().getTo_level2_exportKeyword_12_0());
                      			
                    }
                    otherlv_19=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getGSSTCInputAccess().getFileKeyword_12_1());
                      			
                    }
                    // InternalTCINPUT.g:257:4: ( (otherlv_20= RULE_STRING ) )
                    // InternalTCINPUT.g:258:5: (otherlv_20= RULE_STRING )
                    {
                    // InternalTCINPUT.g:258:5: (otherlv_20= RULE_STRING )
                    // InternalTCINPUT.g:259:6: otherlv_20= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTCInputRule());
                      						}
                      					
                    }
                    otherlv_20=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_20, grammarAccess.getGSSTCInputAccess().getTo_level2_exportGSSExportExportCrossReference_12_2_0());
                      					
                    }

                    }


                    }

                    otherlv_21=(Token)match(input,20,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getGSSTCInputAccess().getSolidusGreaterThanSignKeyword_12_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTCINPUT.g:278:3: (otherlv_22= '<level2_format' otherlv_23= 'file=' ( (otherlv_24= RULE_STRING ) ) otherlv_25= '/>' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTCINPUT.g:279:4: otherlv_22= '<level2_format' otherlv_23= 'file=' ( (otherlv_24= RULE_STRING ) ) otherlv_25= '/>'
                    {
                    otherlv_22=(Token)match(input,23,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getGSSTCInputAccess().getLevel2_formatKeyword_13_0());
                      			
                    }
                    otherlv_23=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getGSSTCInputAccess().getFileKeyword_13_1());
                      			
                    }
                    // InternalTCINPUT.g:287:4: ( (otherlv_24= RULE_STRING ) )
                    // InternalTCINPUT.g:288:5: (otherlv_24= RULE_STRING )
                    {
                    // InternalTCINPUT.g:288:5: (otherlv_24= RULE_STRING )
                    // InternalTCINPUT.g:289:6: otherlv_24= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTCInputRule());
                      						}
                      					
                    }
                    otherlv_24=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_24, grammarAccess.getGSSTCInputAccess().getLevel2_formatGSSFormatFormatCrossReference_13_2_0());
                      					
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,20,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getGSSTCInputAccess().getSolidusGreaterThanSignKeyword_13_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTCINPUT.g:308:3: (otherlv_26= '<to_level1_export' otherlv_27= 'file=' ( (otherlv_28= RULE_STRING ) ) otherlv_29= '/>' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTCINPUT.g:309:4: otherlv_26= '<to_level1_export' otherlv_27= 'file=' ( (otherlv_28= RULE_STRING ) ) otherlv_29= '/>'
                    {
                    otherlv_26=(Token)match(input,24,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_26, grammarAccess.getGSSTCInputAccess().getTo_level1_exportKeyword_14_0());
                      			
                    }
                    otherlv_27=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_27, grammarAccess.getGSSTCInputAccess().getFileKeyword_14_1());
                      			
                    }
                    // InternalTCINPUT.g:317:4: ( (otherlv_28= RULE_STRING ) )
                    // InternalTCINPUT.g:318:5: (otherlv_28= RULE_STRING )
                    {
                    // InternalTCINPUT.g:318:5: (otherlv_28= RULE_STRING )
                    // InternalTCINPUT.g:319:6: otherlv_28= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTCInputRule());
                      						}
                      					
                    }
                    otherlv_28=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_28, grammarAccess.getGSSTCInputAccess().getTo_level1_exportGSSExportExportCrossReference_14_2_0());
                      					
                    }

                    }


                    }

                    otherlv_29=(Token)match(input,20,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_29, grammarAccess.getGSSTCInputAccess().getSolidusGreaterThanSignKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTCINPUT.g:338:3: (otherlv_30= '<level1_format' otherlv_31= 'file=' ( (otherlv_32= RULE_STRING ) ) otherlv_33= '/>' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTCINPUT.g:339:4: otherlv_30= '<level1_format' otherlv_31= 'file=' ( (otherlv_32= RULE_STRING ) ) otherlv_33= '/>'
                    {
                    otherlv_30=(Token)match(input,25,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_30, grammarAccess.getGSSTCInputAccess().getLevel1_formatKeyword_15_0());
                      			
                    }
                    otherlv_31=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getGSSTCInputAccess().getFileKeyword_15_1());
                      			
                    }
                    // InternalTCINPUT.g:347:4: ( (otherlv_32= RULE_STRING ) )
                    // InternalTCINPUT.g:348:5: (otherlv_32= RULE_STRING )
                    {
                    // InternalTCINPUT.g:348:5: (otherlv_32= RULE_STRING )
                    // InternalTCINPUT.g:349:6: otherlv_32= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTCInputRule());
                      						}
                      					
                    }
                    otherlv_32=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_32, grammarAccess.getGSSTCInputAccess().getLevel1_formatGSSFormatFormatCrossReference_15_2_0());
                      					
                    }

                    }


                    }

                    otherlv_33=(Token)match(input,20,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_33, grammarAccess.getGSSTCInputAccess().getSolidusGreaterThanSignKeyword_15_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTCINPUT.g:368:3: (otherlv_34= '<to_level0_export' otherlv_35= 'file=' ( (otherlv_36= RULE_STRING ) ) otherlv_37= '/>' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTCINPUT.g:369:4: otherlv_34= '<to_level0_export' otherlv_35= 'file=' ( (otherlv_36= RULE_STRING ) ) otherlv_37= '/>'
                    {
                    otherlv_34=(Token)match(input,26,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_34, grammarAccess.getGSSTCInputAccess().getTo_level0_exportKeyword_16_0());
                      			
                    }
                    otherlv_35=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_35, grammarAccess.getGSSTCInputAccess().getFileKeyword_16_1());
                      			
                    }
                    // InternalTCINPUT.g:377:4: ( (otherlv_36= RULE_STRING ) )
                    // InternalTCINPUT.g:378:5: (otherlv_36= RULE_STRING )
                    {
                    // InternalTCINPUT.g:378:5: (otherlv_36= RULE_STRING )
                    // InternalTCINPUT.g:379:6: otherlv_36= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTCInputRule());
                      						}
                      					
                    }
                    otherlv_36=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_36, grammarAccess.getGSSTCInputAccess().getTo_level0_exportGSSExportExportCrossReference_16_2_0());
                      					
                    }

                    }


                    }

                    otherlv_37=(Token)match(input,20,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_37, grammarAccess.getGSSTCInputAccess().getSolidusGreaterThanSignKeyword_16_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTCINPUT.g:398:3: (otherlv_38= '<level0_format' otherlv_39= 'file=' ( (otherlv_40= RULE_STRING ) ) otherlv_41= '/>' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTCINPUT.g:399:4: otherlv_38= '<level0_format' otherlv_39= 'file=' ( (otherlv_40= RULE_STRING ) ) otherlv_41= '/>'
                    {
                    otherlv_38=(Token)match(input,27,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_38, grammarAccess.getGSSTCInputAccess().getLevel0_formatKeyword_17_0());
                      			
                    }
                    otherlv_39=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_39, grammarAccess.getGSSTCInputAccess().getFileKeyword_17_1());
                      			
                    }
                    // InternalTCINPUT.g:407:4: ( (otherlv_40= RULE_STRING ) )
                    // InternalTCINPUT.g:408:5: (otherlv_40= RULE_STRING )
                    {
                    // InternalTCINPUT.g:408:5: (otherlv_40= RULE_STRING )
                    // InternalTCINPUT.g:409:6: otherlv_40= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTCInputRule());
                      						}
                      					
                    }
                    otherlv_40=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_40, grammarAccess.getGSSTCInputAccess().getLevel0_formatGSSFormatFormatCrossReference_17_2_0());
                      					
                    }

                    }


                    }

                    otherlv_41=(Token)match(input,20,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_41, grammarAccess.getGSSTCInputAccess().getSolidusGreaterThanSignKeyword_17_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTCINPUT.g:428:3: (otherlv_42= '<fields>' ( (lv_gssFields_43_0= ruleGSSTCInputField ) )+ otherlv_44= '</fields>' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTCINPUT.g:429:4: otherlv_42= '<fields>' ( (lv_gssFields_43_0= ruleGSSTCInputField ) )+ otherlv_44= '</fields>'
                    {
                    otherlv_42=(Token)match(input,28,FollowSets000.FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_42, grammarAccess.getGSSTCInputAccess().getFieldsKeyword_18_0());
                      			
                    }
                    // InternalTCINPUT.g:433:4: ( (lv_gssFields_43_0= ruleGSSTCInputField ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==31) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalTCINPUT.g:434:5: (lv_gssFields_43_0= ruleGSSTCInputField )
                    	    {
                    	    // InternalTCINPUT.g:434:5: (lv_gssFields_43_0= ruleGSSTCInputField )
                    	    // InternalTCINPUT.g:435:6: lv_gssFields_43_0= ruleGSSTCInputField
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getGSSTCInputAccess().getGssFieldsGSSTCInputFieldParserRuleCall_18_1_0());
                    	      					
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_22);
                    	    lv_gssFields_43_0=ruleGSSTCInputField();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getGSSTCInputRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"gssFields",
                    	      							lv_gssFields_43_0,
                    	      							"es.uah.aut.srg.gss.lang.tcinput.TCINPUT.GSSTCInputField");
                    	      						afterParserOrEnumRuleCall();
                    	      					
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

                    otherlv_44=(Token)match(input,29,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_44, grammarAccess.getGSSTCInputAccess().getFieldsKeyword_18_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_45=(Token)match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_45, grammarAccess.getGSSTCInputAccess().getGSSTCInputKeyword_19());
              		
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
    // $ANTLR end "ruleGSSTCInput"


    // $ANTLR start "entryRuleGSSTCInputField"
    // InternalTCINPUT.g:465:1: entryRuleGSSTCInputField returns [EObject current=null] : iv_ruleGSSTCInputField= ruleGSSTCInputField EOF ;
    public final EObject entryRuleGSSTCInputField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTCInputField = null;


        try {
            // InternalTCINPUT.g:465:56: (iv_ruleGSSTCInputField= ruleGSSTCInputField EOF )
            // InternalTCINPUT.g:466:2: iv_ruleGSSTCInputField= ruleGSSTCInputField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTCInputFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTCInputField=ruleGSSTCInputField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTCInputField; 
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
    // $ANTLR end "entryRuleGSSTCInputField"


    // $ANTLR start "ruleGSSTCInputField"
    // InternalTCINPUT.g:472:1: ruleGSSTCInputField returns [EObject current=null] : (otherlv_0= '<InputField' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'gssField=' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= 'enumRef=' ( (otherlv_6= RULE_STRING ) ) )? otherlv_7= '/>' ) ;
    public final EObject ruleGSSTCInputField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalTCINPUT.g:478:2: ( (otherlv_0= '<InputField' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'gssField=' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= 'enumRef=' ( (otherlv_6= RULE_STRING ) ) )? otherlv_7= '/>' ) )
            // InternalTCINPUT.g:479:2: (otherlv_0= '<InputField' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'gssField=' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= 'enumRef=' ( (otherlv_6= RULE_STRING ) ) )? otherlv_7= '/>' )
            {
            // InternalTCINPUT.g:479:2: (otherlv_0= '<InputField' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'gssField=' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= 'enumRef=' ( (otherlv_6= RULE_STRING ) ) )? otherlv_7= '/>' )
            // InternalTCINPUT.g:480:3: otherlv_0= '<InputField' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'gssField=' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= 'enumRef=' ( (otherlv_6= RULE_STRING ) ) )? otherlv_7= '/>'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTCInputFieldAccess().getInputFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTCInputFieldAccess().getNameKeyword_1());
              		
            }
            // InternalTCINPUT.g:488:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalTCINPUT.g:489:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalTCINPUT.g:489:4: (lv_name_2_0= RULE_STRING )
            // InternalTCINPUT.g:490:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getGSSTCInputFieldAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTCInputFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTCInputFieldAccess().getGssFieldKeyword_3());
              		
            }
            // InternalTCINPUT.g:510:3: ( (otherlv_4= RULE_STRING ) )
            // InternalTCINPUT.g:511:4: (otherlv_4= RULE_STRING )
            {
            // InternalTCINPUT.g:511:4: (otherlv_4= RULE_STRING )
            // InternalTCINPUT.g:512:5: otherlv_4= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTCInputFieldRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getGSSTCInputFieldAccess().getGssFieldGSSFormatFieldCrossReference_4_0());
              				
            }

            }


            }

            // InternalTCINPUT.g:526:3: (otherlv_5= 'enumRef=' ( (otherlv_6= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTCINPUT.g:527:4: otherlv_5= 'enumRef=' ( (otherlv_6= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,33,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getGSSTCInputFieldAccess().getEnumRefKeyword_5_0());
                      			
                    }
                    // InternalTCINPUT.g:531:4: ( (otherlv_6= RULE_STRING ) )
                    // InternalTCINPUT.g:532:5: (otherlv_6= RULE_STRING )
                    {
                    // InternalTCINPUT.g:532:5: (otherlv_6= RULE_STRING )
                    // InternalTCINPUT.g:533:6: otherlv_6= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTCInputFieldRule());
                      						}
                      					
                    }
                    otherlv_6=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_6, grammarAccess.getGSSTCInputFieldAccess().getEnumRefTMTCIFEnumCrossReference_5_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTCInputFieldAccess().getSolidusGreaterThanSignKeyword_6());
              		
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
    // $ANTLR end "ruleGSSTCInputField"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000005FE40000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000005FE00000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000005FC00000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000005F800000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000005F000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000005E000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000005C000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000058000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000050000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200100000L});
    }


}