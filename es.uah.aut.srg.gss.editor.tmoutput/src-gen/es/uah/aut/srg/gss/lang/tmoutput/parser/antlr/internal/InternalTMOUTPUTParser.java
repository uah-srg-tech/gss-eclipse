package es.uah.aut.srg.gss.lang.tmoutput.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uah.aut.srg.gss.lang.tmoutput.services.TMOUTPUTGrammarAccess;



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
public class InternalTMOUTPUTParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_UINT_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<GSSTMOutput'", "'name='", "'type='", "'subtype='", "'levels='", "'>'", "'<level3_format'", "'file='", "'/>'", "'<level3_filter'", "'<from_level2_import'", "'<level2_format'", "'<level2_filter'", "'<from_level1_import'", "'<level1_format'", "'<level1_filter'", "'<from_level0_import'", "'<level0_format'", "'<level0_filter'", "'<fields>'", "'</fields>'", "'</GSSTMOutput>'", "'<OutputPI1'", "'val='", "'gssField='", "'<OutputField'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_UINT_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
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


        public InternalTMOUTPUTParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTMOUTPUTParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTMOUTPUTParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTMOUTPUT.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private TMOUTPUTGrammarAccess grammarAccess;

        public InternalTMOUTPUTParser(TokenStream input, TMOUTPUTGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GSSTMOutput";
       	}

       	@Override
       	protected TMOUTPUTGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGSSTMOutput"
    // InternalTMOUTPUT.g:77:1: entryRuleGSSTMOutput returns [EObject current=null] : iv_ruleGSSTMOutput= ruleGSSTMOutput EOF ;
    public final EObject entryRuleGSSTMOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTMOutput = null;


        try {
            // InternalTMOUTPUT.g:77:52: (iv_ruleGSSTMOutput= ruleGSSTMOutput EOF )
            // InternalTMOUTPUT.g:78:2: iv_ruleGSSTMOutput= ruleGSSTMOutput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTMOutputRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTMOutput=ruleGSSTMOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTMOutput; 
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
    // $ANTLR end "entryRuleGSSTMOutput"


    // $ANTLR start "ruleGSSTMOutput"
    // InternalTMOUTPUT.g:84:1: ruleGSSTMOutput returns [EObject current=null] : (otherlv_0= '<GSSTMOutput' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'type=' ( (lv_type_4_0= RULE_UINT_STRING ) ) otherlv_5= 'subtype=' ( (lv_subtype_6_0= RULE_UINT_STRING ) ) otherlv_7= 'levels=' ( (lv_levels_8_0= RULE_UINT_STRING ) ) otherlv_9= '>' (otherlv_10= '<level3_format' otherlv_11= 'file=' ( (otherlv_12= RULE_STRING ) ) otherlv_13= '/>' )? (otherlv_14= '<level3_filter' otherlv_15= 'file=' ( (otherlv_16= RULE_STRING ) ) otherlv_17= '/>' )? (otherlv_18= '<from_level2_import' otherlv_19= 'file=' ( (otherlv_20= RULE_STRING ) ) otherlv_21= '/>' )? (otherlv_22= '<level2_format' otherlv_23= 'file=' ( (otherlv_24= RULE_STRING ) ) otherlv_25= '/>' )? (otherlv_26= '<level2_filter' otherlv_27= 'file=' ( (otherlv_28= RULE_STRING ) ) otherlv_29= '/>' )? (otherlv_30= '<from_level1_import' otherlv_31= 'file=' ( (otherlv_32= RULE_STRING ) ) otherlv_33= '/>' )? (otherlv_34= '<level1_format' otherlv_35= 'file=' ( (otherlv_36= RULE_STRING ) ) otherlv_37= '/>' )? (otherlv_38= '<level1_filter' otherlv_39= 'file=' ( (otherlv_40= RULE_STRING ) ) otherlv_41= '/>' )? (otherlv_42= '<from_level0_import' otherlv_43= 'file=' ( (otherlv_44= RULE_STRING ) ) otherlv_45= '/>' )? (otherlv_46= '<level0_format' otherlv_47= 'file=' ( (otherlv_48= RULE_STRING ) ) otherlv_49= '/>' )? (otherlv_50= '<level0_filter' otherlv_51= 'file=' ( (otherlv_52= RULE_STRING ) ) otherlv_53= '/>' )? ( (lv_gssPi1_54_0= ruleGSSTMOutputPi1 ) )? (otherlv_55= '<fields>' ( (lv_gssFields_56_0= ruleGSSTMOutputField ) )+ otherlv_57= '</fields>' )? otherlv_58= '</GSSTMOutput>' ) ;
    public final EObject ruleGSSTMOutput() throws RecognitionException {
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
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_55=null;
        Token otherlv_57=null;
        Token otherlv_58=null;
        EObject lv_gssPi1_54_0 = null;

        EObject lv_gssFields_56_0 = null;



        	enterRule();

        try {
            // InternalTMOUTPUT.g:90:2: ( (otherlv_0= '<GSSTMOutput' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'type=' ( (lv_type_4_0= RULE_UINT_STRING ) ) otherlv_5= 'subtype=' ( (lv_subtype_6_0= RULE_UINT_STRING ) ) otherlv_7= 'levels=' ( (lv_levels_8_0= RULE_UINT_STRING ) ) otherlv_9= '>' (otherlv_10= '<level3_format' otherlv_11= 'file=' ( (otherlv_12= RULE_STRING ) ) otherlv_13= '/>' )? (otherlv_14= '<level3_filter' otherlv_15= 'file=' ( (otherlv_16= RULE_STRING ) ) otherlv_17= '/>' )? (otherlv_18= '<from_level2_import' otherlv_19= 'file=' ( (otherlv_20= RULE_STRING ) ) otherlv_21= '/>' )? (otherlv_22= '<level2_format' otherlv_23= 'file=' ( (otherlv_24= RULE_STRING ) ) otherlv_25= '/>' )? (otherlv_26= '<level2_filter' otherlv_27= 'file=' ( (otherlv_28= RULE_STRING ) ) otherlv_29= '/>' )? (otherlv_30= '<from_level1_import' otherlv_31= 'file=' ( (otherlv_32= RULE_STRING ) ) otherlv_33= '/>' )? (otherlv_34= '<level1_format' otherlv_35= 'file=' ( (otherlv_36= RULE_STRING ) ) otherlv_37= '/>' )? (otherlv_38= '<level1_filter' otherlv_39= 'file=' ( (otherlv_40= RULE_STRING ) ) otherlv_41= '/>' )? (otherlv_42= '<from_level0_import' otherlv_43= 'file=' ( (otherlv_44= RULE_STRING ) ) otherlv_45= '/>' )? (otherlv_46= '<level0_format' otherlv_47= 'file=' ( (otherlv_48= RULE_STRING ) ) otherlv_49= '/>' )? (otherlv_50= '<level0_filter' otherlv_51= 'file=' ( (otherlv_52= RULE_STRING ) ) otherlv_53= '/>' )? ( (lv_gssPi1_54_0= ruleGSSTMOutputPi1 ) )? (otherlv_55= '<fields>' ( (lv_gssFields_56_0= ruleGSSTMOutputField ) )+ otherlv_57= '</fields>' )? otherlv_58= '</GSSTMOutput>' ) )
            // InternalTMOUTPUT.g:91:2: (otherlv_0= '<GSSTMOutput' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'type=' ( (lv_type_4_0= RULE_UINT_STRING ) ) otherlv_5= 'subtype=' ( (lv_subtype_6_0= RULE_UINT_STRING ) ) otherlv_7= 'levels=' ( (lv_levels_8_0= RULE_UINT_STRING ) ) otherlv_9= '>' (otherlv_10= '<level3_format' otherlv_11= 'file=' ( (otherlv_12= RULE_STRING ) ) otherlv_13= '/>' )? (otherlv_14= '<level3_filter' otherlv_15= 'file=' ( (otherlv_16= RULE_STRING ) ) otherlv_17= '/>' )? (otherlv_18= '<from_level2_import' otherlv_19= 'file=' ( (otherlv_20= RULE_STRING ) ) otherlv_21= '/>' )? (otherlv_22= '<level2_format' otherlv_23= 'file=' ( (otherlv_24= RULE_STRING ) ) otherlv_25= '/>' )? (otherlv_26= '<level2_filter' otherlv_27= 'file=' ( (otherlv_28= RULE_STRING ) ) otherlv_29= '/>' )? (otherlv_30= '<from_level1_import' otherlv_31= 'file=' ( (otherlv_32= RULE_STRING ) ) otherlv_33= '/>' )? (otherlv_34= '<level1_format' otherlv_35= 'file=' ( (otherlv_36= RULE_STRING ) ) otherlv_37= '/>' )? (otherlv_38= '<level1_filter' otherlv_39= 'file=' ( (otherlv_40= RULE_STRING ) ) otherlv_41= '/>' )? (otherlv_42= '<from_level0_import' otherlv_43= 'file=' ( (otherlv_44= RULE_STRING ) ) otherlv_45= '/>' )? (otherlv_46= '<level0_format' otherlv_47= 'file=' ( (otherlv_48= RULE_STRING ) ) otherlv_49= '/>' )? (otherlv_50= '<level0_filter' otherlv_51= 'file=' ( (otherlv_52= RULE_STRING ) ) otherlv_53= '/>' )? ( (lv_gssPi1_54_0= ruleGSSTMOutputPi1 ) )? (otherlv_55= '<fields>' ( (lv_gssFields_56_0= ruleGSSTMOutputField ) )+ otherlv_57= '</fields>' )? otherlv_58= '</GSSTMOutput>' )
            {
            // InternalTMOUTPUT.g:91:2: (otherlv_0= '<GSSTMOutput' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'type=' ( (lv_type_4_0= RULE_UINT_STRING ) ) otherlv_5= 'subtype=' ( (lv_subtype_6_0= RULE_UINT_STRING ) ) otherlv_7= 'levels=' ( (lv_levels_8_0= RULE_UINT_STRING ) ) otherlv_9= '>' (otherlv_10= '<level3_format' otherlv_11= 'file=' ( (otherlv_12= RULE_STRING ) ) otherlv_13= '/>' )? (otherlv_14= '<level3_filter' otherlv_15= 'file=' ( (otherlv_16= RULE_STRING ) ) otherlv_17= '/>' )? (otherlv_18= '<from_level2_import' otherlv_19= 'file=' ( (otherlv_20= RULE_STRING ) ) otherlv_21= '/>' )? (otherlv_22= '<level2_format' otherlv_23= 'file=' ( (otherlv_24= RULE_STRING ) ) otherlv_25= '/>' )? (otherlv_26= '<level2_filter' otherlv_27= 'file=' ( (otherlv_28= RULE_STRING ) ) otherlv_29= '/>' )? (otherlv_30= '<from_level1_import' otherlv_31= 'file=' ( (otherlv_32= RULE_STRING ) ) otherlv_33= '/>' )? (otherlv_34= '<level1_format' otherlv_35= 'file=' ( (otherlv_36= RULE_STRING ) ) otherlv_37= '/>' )? (otherlv_38= '<level1_filter' otherlv_39= 'file=' ( (otherlv_40= RULE_STRING ) ) otherlv_41= '/>' )? (otherlv_42= '<from_level0_import' otherlv_43= 'file=' ( (otherlv_44= RULE_STRING ) ) otherlv_45= '/>' )? (otherlv_46= '<level0_format' otherlv_47= 'file=' ( (otherlv_48= RULE_STRING ) ) otherlv_49= '/>' )? (otherlv_50= '<level0_filter' otherlv_51= 'file=' ( (otherlv_52= RULE_STRING ) ) otherlv_53= '/>' )? ( (lv_gssPi1_54_0= ruleGSSTMOutputPi1 ) )? (otherlv_55= '<fields>' ( (lv_gssFields_56_0= ruleGSSTMOutputField ) )+ otherlv_57= '</fields>' )? otherlv_58= '</GSSTMOutput>' )
            // InternalTMOUTPUT.g:92:3: otherlv_0= '<GSSTMOutput' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'type=' ( (lv_type_4_0= RULE_UINT_STRING ) ) otherlv_5= 'subtype=' ( (lv_subtype_6_0= RULE_UINT_STRING ) ) otherlv_7= 'levels=' ( (lv_levels_8_0= RULE_UINT_STRING ) ) otherlv_9= '>' (otherlv_10= '<level3_format' otherlv_11= 'file=' ( (otherlv_12= RULE_STRING ) ) otherlv_13= '/>' )? (otherlv_14= '<level3_filter' otherlv_15= 'file=' ( (otherlv_16= RULE_STRING ) ) otherlv_17= '/>' )? (otherlv_18= '<from_level2_import' otherlv_19= 'file=' ( (otherlv_20= RULE_STRING ) ) otherlv_21= '/>' )? (otherlv_22= '<level2_format' otherlv_23= 'file=' ( (otherlv_24= RULE_STRING ) ) otherlv_25= '/>' )? (otherlv_26= '<level2_filter' otherlv_27= 'file=' ( (otherlv_28= RULE_STRING ) ) otherlv_29= '/>' )? (otherlv_30= '<from_level1_import' otherlv_31= 'file=' ( (otherlv_32= RULE_STRING ) ) otherlv_33= '/>' )? (otherlv_34= '<level1_format' otherlv_35= 'file=' ( (otherlv_36= RULE_STRING ) ) otherlv_37= '/>' )? (otherlv_38= '<level1_filter' otherlv_39= 'file=' ( (otherlv_40= RULE_STRING ) ) otherlv_41= '/>' )? (otherlv_42= '<from_level0_import' otherlv_43= 'file=' ( (otherlv_44= RULE_STRING ) ) otherlv_45= '/>' )? (otherlv_46= '<level0_format' otherlv_47= 'file=' ( (otherlv_48= RULE_STRING ) ) otherlv_49= '/>' )? (otherlv_50= '<level0_filter' otherlv_51= 'file=' ( (otherlv_52= RULE_STRING ) ) otherlv_53= '/>' )? ( (lv_gssPi1_54_0= ruleGSSTMOutputPi1 ) )? (otherlv_55= '<fields>' ( (lv_gssFields_56_0= ruleGSSTMOutputField ) )+ otherlv_57= '</fields>' )? otherlv_58= '</GSSTMOutput>'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTMOutputAccess().getGSSTMOutputKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTMOutputAccess().getNameKeyword_1());
              		
            }
            // InternalTMOUTPUT.g:100:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalTMOUTPUT.g:101:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalTMOUTPUT.g:101:4: (lv_name_2_0= RULE_STRING )
            // InternalTMOUTPUT.g:102:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getGSSTMOutputAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTMOutputRule());
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

              			newLeafNode(otherlv_3, grammarAccess.getGSSTMOutputAccess().getTypeKeyword_3());
              		
            }
            // InternalTMOUTPUT.g:122:3: ( (lv_type_4_0= RULE_UINT_STRING ) )
            // InternalTMOUTPUT.g:123:4: (lv_type_4_0= RULE_UINT_STRING )
            {
            // InternalTMOUTPUT.g:123:4: (lv_type_4_0= RULE_UINT_STRING )
            // InternalTMOUTPUT.g:124:5: lv_type_4_0= RULE_UINT_STRING
            {
            lv_type_4_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_type_4_0, grammarAccess.getGSSTMOutputAccess().getTypeUINT_STRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTMOutputRule());
              					}
              					setWithLastConsumed(
              						current,
              						"type",
              						lv_type_4_0,
              						"es.uah.aut.srg.gss.lang.tmoutput.TMOUTPUT.UINT_STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTMOutputAccess().getSubtypeKeyword_5());
              		
            }
            // InternalTMOUTPUT.g:144:3: ( (lv_subtype_6_0= RULE_UINT_STRING ) )
            // InternalTMOUTPUT.g:145:4: (lv_subtype_6_0= RULE_UINT_STRING )
            {
            // InternalTMOUTPUT.g:145:4: (lv_subtype_6_0= RULE_UINT_STRING )
            // InternalTMOUTPUT.g:146:5: lv_subtype_6_0= RULE_UINT_STRING
            {
            lv_subtype_6_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_subtype_6_0, grammarAccess.getGSSTMOutputAccess().getSubtypeUINT_STRINGTerminalRuleCall_6_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTMOutputRule());
              					}
              					setWithLastConsumed(
              						current,
              						"subtype",
              						lv_subtype_6_0,
              						"es.uah.aut.srg.gss.lang.tmoutput.TMOUTPUT.UINT_STRING");
              				
            }

            }


            }

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTMOutputAccess().getLevelsKeyword_7());
              		
            }
            // InternalTMOUTPUT.g:166:3: ( (lv_levels_8_0= RULE_UINT_STRING ) )
            // InternalTMOUTPUT.g:167:4: (lv_levels_8_0= RULE_UINT_STRING )
            {
            // InternalTMOUTPUT.g:167:4: (lv_levels_8_0= RULE_UINT_STRING )
            // InternalTMOUTPUT.g:168:5: lv_levels_8_0= RULE_UINT_STRING
            {
            lv_levels_8_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_levels_8_0, grammarAccess.getGSSTMOutputAccess().getLevelsUINT_STRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTMOutputRule());
              					}
              					setWithLastConsumed(
              						current,
              						"levels",
              						lv_levels_8_0,
              						"es.uah.aut.srg.gss.lang.tmoutput.TMOUTPUT.UINT_STRING");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTMOutputAccess().getGreaterThanSignKeyword_9());
              		
            }
            // InternalTMOUTPUT.g:188:3: (otherlv_10= '<level3_format' otherlv_11= 'file=' ( (otherlv_12= RULE_STRING ) ) otherlv_13= '/>' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTMOUTPUT.g:189:4: otherlv_10= '<level3_format' otherlv_11= 'file=' ( (otherlv_12= RULE_STRING ) ) otherlv_13= '/>'
                    {
                    otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getGSSTMOutputAccess().getLevel3_formatKeyword_10_0());
                      			
                    }
                    otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getGSSTMOutputAccess().getFileKeyword_10_1());
                      			
                    }
                    // InternalTMOUTPUT.g:197:4: ( (otherlv_12= RULE_STRING ) )
                    // InternalTMOUTPUT.g:198:5: (otherlv_12= RULE_STRING )
                    {
                    // InternalTMOUTPUT.g:198:5: (otherlv_12= RULE_STRING )
                    // InternalTMOUTPUT.g:199:6: otherlv_12= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTMOutputRule());
                      						}
                      					
                    }
                    otherlv_12=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_12, grammarAccess.getGSSTMOutputAccess().getLevel3_formatGSSFormatFormatCrossReference_10_2_0());
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,20,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_10_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTMOUTPUT.g:218:3: (otherlv_14= '<level3_filter' otherlv_15= 'file=' ( (otherlv_16= RULE_STRING ) ) otherlv_17= '/>' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTMOUTPUT.g:219:4: otherlv_14= '<level3_filter' otherlv_15= 'file=' ( (otherlv_16= RULE_STRING ) ) otherlv_17= '/>'
                    {
                    otherlv_14=(Token)match(input,21,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSTMOutputAccess().getLevel3_filterKeyword_11_0());
                      			
                    }
                    otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSTMOutputAccess().getFileKeyword_11_1());
                      			
                    }
                    // InternalTMOUTPUT.g:227:4: ( (otherlv_16= RULE_STRING ) )
                    // InternalTMOUTPUT.g:228:5: (otherlv_16= RULE_STRING )
                    {
                    // InternalTMOUTPUT.g:228:5: (otherlv_16= RULE_STRING )
                    // InternalTMOUTPUT.g:229:6: otherlv_16= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTMOutputRule());
                      						}
                      					
                    }
                    otherlv_16=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_16, grammarAccess.getGSSTMOutputAccess().getLevel3_filterGSSFilterFilterCrossReference_11_2_0());
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_11_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTMOUTPUT.g:248:3: (otherlv_18= '<from_level2_import' otherlv_19= 'file=' ( (otherlv_20= RULE_STRING ) ) otherlv_21= '/>' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTMOUTPUT.g:249:4: otherlv_18= '<from_level2_import' otherlv_19= 'file=' ( (otherlv_20= RULE_STRING ) ) otherlv_21= '/>'
                    {
                    otherlv_18=(Token)match(input,22,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getGSSTMOutputAccess().getFrom_level2_importKeyword_12_0());
                      			
                    }
                    otherlv_19=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getGSSTMOutputAccess().getFileKeyword_12_1());
                      			
                    }
                    // InternalTMOUTPUT.g:257:4: ( (otherlv_20= RULE_STRING ) )
                    // InternalTMOUTPUT.g:258:5: (otherlv_20= RULE_STRING )
                    {
                    // InternalTMOUTPUT.g:258:5: (otherlv_20= RULE_STRING )
                    // InternalTMOUTPUT.g:259:6: otherlv_20= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTMOutputRule());
                      						}
                      					
                    }
                    otherlv_20=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_20, grammarAccess.getGSSTMOutputAccess().getFrom_level2_importGSSImportImportCrossReference_12_2_0());
                      					
                    }

                    }


                    }

                    otherlv_21=(Token)match(input,20,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_12_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTMOUTPUT.g:278:3: (otherlv_22= '<level2_format' otherlv_23= 'file=' ( (otherlv_24= RULE_STRING ) ) otherlv_25= '/>' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTMOUTPUT.g:279:4: otherlv_22= '<level2_format' otherlv_23= 'file=' ( (otherlv_24= RULE_STRING ) ) otherlv_25= '/>'
                    {
                    otherlv_22=(Token)match(input,23,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getGSSTMOutputAccess().getLevel2_formatKeyword_13_0());
                      			
                    }
                    otherlv_23=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getGSSTMOutputAccess().getFileKeyword_13_1());
                      			
                    }
                    // InternalTMOUTPUT.g:287:4: ( (otherlv_24= RULE_STRING ) )
                    // InternalTMOUTPUT.g:288:5: (otherlv_24= RULE_STRING )
                    {
                    // InternalTMOUTPUT.g:288:5: (otherlv_24= RULE_STRING )
                    // InternalTMOUTPUT.g:289:6: otherlv_24= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTMOutputRule());
                      						}
                      					
                    }
                    otherlv_24=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_24, grammarAccess.getGSSTMOutputAccess().getLevel2_formatGSSFormatFormatCrossReference_13_2_0());
                      					
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,20,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_13_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTMOUTPUT.g:308:3: (otherlv_26= '<level2_filter' otherlv_27= 'file=' ( (otherlv_28= RULE_STRING ) ) otherlv_29= '/>' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTMOUTPUT.g:309:4: otherlv_26= '<level2_filter' otherlv_27= 'file=' ( (otherlv_28= RULE_STRING ) ) otherlv_29= '/>'
                    {
                    otherlv_26=(Token)match(input,24,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_26, grammarAccess.getGSSTMOutputAccess().getLevel2_filterKeyword_14_0());
                      			
                    }
                    otherlv_27=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_27, grammarAccess.getGSSTMOutputAccess().getFileKeyword_14_1());
                      			
                    }
                    // InternalTMOUTPUT.g:317:4: ( (otherlv_28= RULE_STRING ) )
                    // InternalTMOUTPUT.g:318:5: (otherlv_28= RULE_STRING )
                    {
                    // InternalTMOUTPUT.g:318:5: (otherlv_28= RULE_STRING )
                    // InternalTMOUTPUT.g:319:6: otherlv_28= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTMOutputRule());
                      						}
                      					
                    }
                    otherlv_28=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_28, grammarAccess.getGSSTMOutputAccess().getLevel2_filterGSSFilterFilterCrossReference_14_2_0());
                      					
                    }

                    }


                    }

                    otherlv_29=(Token)match(input,20,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_29, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTMOUTPUT.g:338:3: (otherlv_30= '<from_level1_import' otherlv_31= 'file=' ( (otherlv_32= RULE_STRING ) ) otherlv_33= '/>' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTMOUTPUT.g:339:4: otherlv_30= '<from_level1_import' otherlv_31= 'file=' ( (otherlv_32= RULE_STRING ) ) otherlv_33= '/>'
                    {
                    otherlv_30=(Token)match(input,25,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_30, grammarAccess.getGSSTMOutputAccess().getFrom_level1_importKeyword_15_0());
                      			
                    }
                    otherlv_31=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getGSSTMOutputAccess().getFileKeyword_15_1());
                      			
                    }
                    // InternalTMOUTPUT.g:347:4: ( (otherlv_32= RULE_STRING ) )
                    // InternalTMOUTPUT.g:348:5: (otherlv_32= RULE_STRING )
                    {
                    // InternalTMOUTPUT.g:348:5: (otherlv_32= RULE_STRING )
                    // InternalTMOUTPUT.g:349:6: otherlv_32= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTMOutputRule());
                      						}
                      					
                    }
                    otherlv_32=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_32, grammarAccess.getGSSTMOutputAccess().getFrom_level1_importGSSImportImportCrossReference_15_2_0());
                      					
                    }

                    }


                    }

                    otherlv_33=(Token)match(input,20,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_33, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_15_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTMOUTPUT.g:368:3: (otherlv_34= '<level1_format' otherlv_35= 'file=' ( (otherlv_36= RULE_STRING ) ) otherlv_37= '/>' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTMOUTPUT.g:369:4: otherlv_34= '<level1_format' otherlv_35= 'file=' ( (otherlv_36= RULE_STRING ) ) otherlv_37= '/>'
                    {
                    otherlv_34=(Token)match(input,26,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_34, grammarAccess.getGSSTMOutputAccess().getLevel1_formatKeyword_16_0());
                      			
                    }
                    otherlv_35=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_35, grammarAccess.getGSSTMOutputAccess().getFileKeyword_16_1());
                      			
                    }
                    // InternalTMOUTPUT.g:377:4: ( (otherlv_36= RULE_STRING ) )
                    // InternalTMOUTPUT.g:378:5: (otherlv_36= RULE_STRING )
                    {
                    // InternalTMOUTPUT.g:378:5: (otherlv_36= RULE_STRING )
                    // InternalTMOUTPUT.g:379:6: otherlv_36= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTMOutputRule());
                      						}
                      					
                    }
                    otherlv_36=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_36, grammarAccess.getGSSTMOutputAccess().getLevel1_formatGSSFormatFormatCrossReference_16_2_0());
                      					
                    }

                    }


                    }

                    otherlv_37=(Token)match(input,20,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_37, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_16_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTMOUTPUT.g:398:3: (otherlv_38= '<level1_filter' otherlv_39= 'file=' ( (otherlv_40= RULE_STRING ) ) otherlv_41= '/>' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTMOUTPUT.g:399:4: otherlv_38= '<level1_filter' otherlv_39= 'file=' ( (otherlv_40= RULE_STRING ) ) otherlv_41= '/>'
                    {
                    otherlv_38=(Token)match(input,27,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_38, grammarAccess.getGSSTMOutputAccess().getLevel1_filterKeyword_17_0());
                      			
                    }
                    otherlv_39=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_39, grammarAccess.getGSSTMOutputAccess().getFileKeyword_17_1());
                      			
                    }
                    // InternalTMOUTPUT.g:407:4: ( (otherlv_40= RULE_STRING ) )
                    // InternalTMOUTPUT.g:408:5: (otherlv_40= RULE_STRING )
                    {
                    // InternalTMOUTPUT.g:408:5: (otherlv_40= RULE_STRING )
                    // InternalTMOUTPUT.g:409:6: otherlv_40= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTMOutputRule());
                      						}
                      					
                    }
                    otherlv_40=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_40, grammarAccess.getGSSTMOutputAccess().getLevel1_filterGSSFilterFilterCrossReference_17_2_0());
                      					
                    }

                    }


                    }

                    otherlv_41=(Token)match(input,20,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_41, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_17_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTMOUTPUT.g:428:3: (otherlv_42= '<from_level0_import' otherlv_43= 'file=' ( (otherlv_44= RULE_STRING ) ) otherlv_45= '/>' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTMOUTPUT.g:429:4: otherlv_42= '<from_level0_import' otherlv_43= 'file=' ( (otherlv_44= RULE_STRING ) ) otherlv_45= '/>'
                    {
                    otherlv_42=(Token)match(input,28,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_42, grammarAccess.getGSSTMOutputAccess().getFrom_level0_importKeyword_18_0());
                      			
                    }
                    otherlv_43=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_43, grammarAccess.getGSSTMOutputAccess().getFileKeyword_18_1());
                      			
                    }
                    // InternalTMOUTPUT.g:437:4: ( (otherlv_44= RULE_STRING ) )
                    // InternalTMOUTPUT.g:438:5: (otherlv_44= RULE_STRING )
                    {
                    // InternalTMOUTPUT.g:438:5: (otherlv_44= RULE_STRING )
                    // InternalTMOUTPUT.g:439:6: otherlv_44= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTMOutputRule());
                      						}
                      					
                    }
                    otherlv_44=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_44, grammarAccess.getGSSTMOutputAccess().getFrom_level0_importGSSImportImportCrossReference_18_2_0());
                      					
                    }

                    }


                    }

                    otherlv_45=(Token)match(input,20,FollowSets000.FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_45, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_18_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTMOUTPUT.g:458:3: (otherlv_46= '<level0_format' otherlv_47= 'file=' ( (otherlv_48= RULE_STRING ) ) otherlv_49= '/>' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTMOUTPUT.g:459:4: otherlv_46= '<level0_format' otherlv_47= 'file=' ( (otherlv_48= RULE_STRING ) ) otherlv_49= '/>'
                    {
                    otherlv_46=(Token)match(input,29,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_46, grammarAccess.getGSSTMOutputAccess().getLevel0_formatKeyword_19_0());
                      			
                    }
                    otherlv_47=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_47, grammarAccess.getGSSTMOutputAccess().getFileKeyword_19_1());
                      			
                    }
                    // InternalTMOUTPUT.g:467:4: ( (otherlv_48= RULE_STRING ) )
                    // InternalTMOUTPUT.g:468:5: (otherlv_48= RULE_STRING )
                    {
                    // InternalTMOUTPUT.g:468:5: (otherlv_48= RULE_STRING )
                    // InternalTMOUTPUT.g:469:6: otherlv_48= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTMOutputRule());
                      						}
                      					
                    }
                    otherlv_48=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_48, grammarAccess.getGSSTMOutputAccess().getLevel0_formatGSSFormatFormatCrossReference_19_2_0());
                      					
                    }

                    }


                    }

                    otherlv_49=(Token)match(input,20,FollowSets000.FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_49, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_19_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTMOUTPUT.g:488:3: (otherlv_50= '<level0_filter' otherlv_51= 'file=' ( (otherlv_52= RULE_STRING ) ) otherlv_53= '/>' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTMOUTPUT.g:489:4: otherlv_50= '<level0_filter' otherlv_51= 'file=' ( (otherlv_52= RULE_STRING ) ) otherlv_53= '/>'
                    {
                    otherlv_50=(Token)match(input,30,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_50, grammarAccess.getGSSTMOutputAccess().getLevel0_filterKeyword_20_0());
                      			
                    }
                    otherlv_51=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_51, grammarAccess.getGSSTMOutputAccess().getFileKeyword_20_1());
                      			
                    }
                    // InternalTMOUTPUT.g:497:4: ( (otherlv_52= RULE_STRING ) )
                    // InternalTMOUTPUT.g:498:5: (otherlv_52= RULE_STRING )
                    {
                    // InternalTMOUTPUT.g:498:5: (otherlv_52= RULE_STRING )
                    // InternalTMOUTPUT.g:499:6: otherlv_52= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTMOutputRule());
                      						}
                      					
                    }
                    otherlv_52=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_52, grammarAccess.getGSSTMOutputAccess().getLevel0_filterGSSFilterFilterCrossReference_20_2_0());
                      					
                    }

                    }


                    }

                    otherlv_53=(Token)match(input,20,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_53, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_20_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTMOUTPUT.g:518:3: ( (lv_gssPi1_54_0= ruleGSSTMOutputPi1 ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTMOUTPUT.g:519:4: (lv_gssPi1_54_0= ruleGSSTMOutputPi1 )
                    {
                    // InternalTMOUTPUT.g:519:4: (lv_gssPi1_54_0= ruleGSSTMOutputPi1 )
                    // InternalTMOUTPUT.g:520:5: lv_gssPi1_54_0= ruleGSSTMOutputPi1
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGSSTMOutputAccess().getGssPi1GSSTMOutputPi1ParserRuleCall_21_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_24);
                    lv_gssPi1_54_0=ruleGSSTMOutputPi1();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGSSTMOutputRule());
                      					}
                      					set(
                      						current,
                      						"gssPi1",
                      						lv_gssPi1_54_0,
                      						"es.uah.aut.srg.gss.lang.tmoutput.TMOUTPUT.GSSTMOutputPi1");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalTMOUTPUT.g:537:3: (otherlv_55= '<fields>' ( (lv_gssFields_56_0= ruleGSSTMOutputField ) )+ otherlv_57= '</fields>' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTMOUTPUT.g:538:4: otherlv_55= '<fields>' ( (lv_gssFields_56_0= ruleGSSTMOutputField ) )+ otherlv_57= '</fields>'
                    {
                    otherlv_55=(Token)match(input,31,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_55, grammarAccess.getGSSTMOutputAccess().getFieldsKeyword_22_0());
                      			
                    }
                    // InternalTMOUTPUT.g:542:4: ( (lv_gssFields_56_0= ruleGSSTMOutputField ) )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==37) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalTMOUTPUT.g:543:5: (lv_gssFields_56_0= ruleGSSTMOutputField )
                    	    {
                    	    // InternalTMOUTPUT.g:543:5: (lv_gssFields_56_0= ruleGSSTMOutputField )
                    	    // InternalTMOUTPUT.g:544:6: lv_gssFields_56_0= ruleGSSTMOutputField
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getGSSTMOutputAccess().getGssFieldsGSSTMOutputFieldParserRuleCall_22_1_0());
                    	      					
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_26);
                    	    lv_gssFields_56_0=ruleGSSTMOutputField();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getGSSTMOutputRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"gssFields",
                    	      							lv_gssFields_56_0,
                    	      							"es.uah.aut.srg.gss.lang.tmoutput.TMOUTPUT.GSSTMOutputField");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    otherlv_57=(Token)match(input,32,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_57, grammarAccess.getGSSTMOutputAccess().getFieldsKeyword_22_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_58=(Token)match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_58, grammarAccess.getGSSTMOutputAccess().getGSSTMOutputKeyword_23());
              		
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
    // $ANTLR end "ruleGSSTMOutput"


    // $ANTLR start "entryRuleGSSTMOutputPi1"
    // InternalTMOUTPUT.g:574:1: entryRuleGSSTMOutputPi1 returns [EObject current=null] : iv_ruleGSSTMOutputPi1= ruleGSSTMOutputPi1 EOF ;
    public final EObject entryRuleGSSTMOutputPi1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTMOutputPi1 = null;


        try {
            // InternalTMOUTPUT.g:574:55: (iv_ruleGSSTMOutputPi1= ruleGSSTMOutputPi1 EOF )
            // InternalTMOUTPUT.g:575:2: iv_ruleGSSTMOutputPi1= ruleGSSTMOutputPi1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTMOutputPi1Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTMOutputPi1=ruleGSSTMOutputPi1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTMOutputPi1; 
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
    // $ANTLR end "entryRuleGSSTMOutputPi1"


    // $ANTLR start "ruleGSSTMOutputPi1"
    // InternalTMOUTPUT.g:581:1: ruleGSSTMOutputPi1 returns [EObject current=null] : (otherlv_0= '<OutputPI1' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'val=' ( (lv_val_4_0= RULE_UINT_STRING ) ) otherlv_5= 'gssField=' ( (otherlv_6= RULE_STRING ) ) otherlv_7= '/>' ) ;
    public final EObject ruleGSSTMOutputPi1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_val_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalTMOUTPUT.g:587:2: ( (otherlv_0= '<OutputPI1' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'val=' ( (lv_val_4_0= RULE_UINT_STRING ) ) otherlv_5= 'gssField=' ( (otherlv_6= RULE_STRING ) ) otherlv_7= '/>' ) )
            // InternalTMOUTPUT.g:588:2: (otherlv_0= '<OutputPI1' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'val=' ( (lv_val_4_0= RULE_UINT_STRING ) ) otherlv_5= 'gssField=' ( (otherlv_6= RULE_STRING ) ) otherlv_7= '/>' )
            {
            // InternalTMOUTPUT.g:588:2: (otherlv_0= '<OutputPI1' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'val=' ( (lv_val_4_0= RULE_UINT_STRING ) ) otherlv_5= 'gssField=' ( (otherlv_6= RULE_STRING ) ) otherlv_7= '/>' )
            // InternalTMOUTPUT.g:589:3: otherlv_0= '<OutputPI1' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'val=' ( (lv_val_4_0= RULE_UINT_STRING ) ) otherlv_5= 'gssField=' ( (otherlv_6= RULE_STRING ) ) otherlv_7= '/>'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTMOutputPi1Access().getOutputPI1Keyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTMOutputPi1Access().getNameKeyword_1());
              		
            }
            // InternalTMOUTPUT.g:597:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalTMOUTPUT.g:598:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalTMOUTPUT.g:598:4: (lv_name_2_0= RULE_STRING )
            // InternalTMOUTPUT.g:599:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getGSSTMOutputPi1Access().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTMOutputPi1Rule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTMOutputPi1Access().getValKeyword_3());
              		
            }
            // InternalTMOUTPUT.g:619:3: ( (lv_val_4_0= RULE_UINT_STRING ) )
            // InternalTMOUTPUT.g:620:4: (lv_val_4_0= RULE_UINT_STRING )
            {
            // InternalTMOUTPUT.g:620:4: (lv_val_4_0= RULE_UINT_STRING )
            // InternalTMOUTPUT.g:621:5: lv_val_4_0= RULE_UINT_STRING
            {
            lv_val_4_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_val_4_0, grammarAccess.getGSSTMOutputPi1Access().getValUINT_STRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTMOutputPi1Rule());
              					}
              					setWithLastConsumed(
              						current,
              						"val",
              						lv_val_4_0,
              						"es.uah.aut.srg.gss.lang.tmoutput.TMOUTPUT.UINT_STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,36,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTMOutputPi1Access().getGssFieldKeyword_5());
              		
            }
            // InternalTMOUTPUT.g:641:3: ( (otherlv_6= RULE_STRING ) )
            // InternalTMOUTPUT.g:642:4: (otherlv_6= RULE_STRING )
            {
            // InternalTMOUTPUT.g:642:4: (otherlv_6= RULE_STRING )
            // InternalTMOUTPUT.g:643:5: otherlv_6= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTMOutputPi1Rule());
              					}
              				
            }
            otherlv_6=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_6, grammarAccess.getGSSTMOutputPi1Access().getGssFieldGSSFormatFieldCrossReference_6_0());
              				
            }

            }


            }

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTMOutputPi1Access().getSolidusGreaterThanSignKeyword_7());
              		
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
    // $ANTLR end "ruleGSSTMOutputPi1"


    // $ANTLR start "entryRuleGSSTMOutputField"
    // InternalTMOUTPUT.g:665:1: entryRuleGSSTMOutputField returns [EObject current=null] : iv_ruleGSSTMOutputField= ruleGSSTMOutputField EOF ;
    public final EObject entryRuleGSSTMOutputField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTMOutputField = null;


        try {
            // InternalTMOUTPUT.g:665:57: (iv_ruleGSSTMOutputField= ruleGSSTMOutputField EOF )
            // InternalTMOUTPUT.g:666:2: iv_ruleGSSTMOutputField= ruleGSSTMOutputField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTMOutputFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTMOutputField=ruleGSSTMOutputField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTMOutputField; 
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
    // $ANTLR end "entryRuleGSSTMOutputField"


    // $ANTLR start "ruleGSSTMOutputField"
    // InternalTMOUTPUT.g:672:1: ruleGSSTMOutputField returns [EObject current=null] : (otherlv_0= '<OutputField' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'gssField=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= '/>' ) ;
    public final EObject ruleGSSTMOutputField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalTMOUTPUT.g:678:2: ( (otherlv_0= '<OutputField' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'gssField=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= '/>' ) )
            // InternalTMOUTPUT.g:679:2: (otherlv_0= '<OutputField' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'gssField=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= '/>' )
            {
            // InternalTMOUTPUT.g:679:2: (otherlv_0= '<OutputField' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'gssField=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= '/>' )
            // InternalTMOUTPUT.g:680:3: otherlv_0= '<OutputField' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'gssField=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= '/>'
            {
            otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTMOutputFieldAccess().getOutputFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTMOutputFieldAccess().getNameKeyword_1());
              		
            }
            // InternalTMOUTPUT.g:688:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalTMOUTPUT.g:689:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalTMOUTPUT.g:689:4: (lv_name_2_0= RULE_STRING )
            // InternalTMOUTPUT.g:690:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getGSSTMOutputFieldAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTMOutputFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTMOutputFieldAccess().getGssFieldKeyword_3());
              		
            }
            // InternalTMOUTPUT.g:710:3: ( (otherlv_4= RULE_STRING ) )
            // InternalTMOUTPUT.g:711:4: (otherlv_4= RULE_STRING )
            {
            // InternalTMOUTPUT.g:711:4: (otherlv_4= RULE_STRING )
            // InternalTMOUTPUT.g:712:5: otherlv_4= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTMOutputFieldRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getGSSTMOutputFieldAccess().getGssFieldGSSFormatFieldCrossReference_4_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTMOutputFieldAccess().getSolidusGreaterThanSignKeyword_5());
              		
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
    // $ANTLR end "ruleGSSTMOutputField"

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
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000006FFE40000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000006FFE00000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000006FFC00000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000006FF800000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000006FF000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000006FE000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000006FC000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000006F8000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000006F0000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000006E0000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000006C0000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000680000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000280000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002100000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    }


}