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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_UINT_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<GSSTMOutput'", "'name='", "'type='", "'subtype='", "'pi1_val='", "'levels='", "'>'", "'<level3_format'", "'file='", "'/>'", "'<level3_filter'", "'<from_level2_import'", "'<level2_format'", "'<level2_filter'", "'<from_level1_import'", "'<level1_format'", "'<level1_filter'", "'<from_level0_import'", "'<level0_format'", "'<level0_filter'", "'<fields>'", "'</fields>'", "'</GSSTMOutput>'", "'<OutputField'", "'gssField='"
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
    // InternalTMOUTPUT.g:84:1: ruleGSSTMOutput returns [EObject current=null] : (otherlv_0= '<GSSTMOutput' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'type=' ( (lv_type_4_0= RULE_UINT_STRING ) ) otherlv_5= 'subtype=' ( (lv_subtype_6_0= RULE_UINT_STRING ) ) (otherlv_7= 'pi1_val=' ( (lv_pi1_val_8_0= RULE_UINT_STRING ) ) )? otherlv_9= 'levels=' ( (lv_levels_10_0= RULE_UINT_STRING ) ) otherlv_11= '>' (otherlv_12= '<level3_format' otherlv_13= 'file=' ( (otherlv_14= RULE_STRING ) ) otherlv_15= '/>' )? (otherlv_16= '<level3_filter' otherlv_17= 'file=' ( (otherlv_18= RULE_STRING ) ) otherlv_19= '/>' )? (otherlv_20= '<from_level2_import' otherlv_21= 'file=' ( (otherlv_22= RULE_STRING ) ) otherlv_23= '/>' )? (otherlv_24= '<level2_format' otherlv_25= 'file=' ( (otherlv_26= RULE_STRING ) ) otherlv_27= '/>' )? (otherlv_28= '<level2_filter' otherlv_29= 'file=' ( (otherlv_30= RULE_STRING ) ) otherlv_31= '/>' )? (otherlv_32= '<from_level1_import' otherlv_33= 'file=' ( (otherlv_34= RULE_STRING ) ) otherlv_35= '/>' )? (otherlv_36= '<level1_format' otherlv_37= 'file=' ( (otherlv_38= RULE_STRING ) ) otherlv_39= '/>' )? (otherlv_40= '<level1_filter' otherlv_41= 'file=' ( (otherlv_42= RULE_STRING ) ) otherlv_43= '/>' )? (otherlv_44= '<from_level0_import' otherlv_45= 'file=' ( (otherlv_46= RULE_STRING ) ) otherlv_47= '/>' )? (otherlv_48= '<level0_format' otherlv_49= 'file=' ( (otherlv_50= RULE_STRING ) ) otherlv_51= '/>' )? (otherlv_52= '<level0_filter' otherlv_53= 'file=' ( (otherlv_54= RULE_STRING ) ) otherlv_55= '/>' )? (otherlv_56= '<fields>' ( (lv_gssFields_57_0= ruleGSSTMOutputField ) )+ otherlv_58= '</fields>' )? otherlv_59= '</GSSTMOutput>' ) ;
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
        Token lv_pi1_val_8_0=null;
        Token otherlv_9=null;
        Token lv_levels_10_0=null;
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
        Token otherlv_54=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token otherlv_58=null;
        Token otherlv_59=null;
        EObject lv_gssFields_57_0 = null;



        	enterRule();

        try {
            // InternalTMOUTPUT.g:90:2: ( (otherlv_0= '<GSSTMOutput' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'type=' ( (lv_type_4_0= RULE_UINT_STRING ) ) otherlv_5= 'subtype=' ( (lv_subtype_6_0= RULE_UINT_STRING ) ) (otherlv_7= 'pi1_val=' ( (lv_pi1_val_8_0= RULE_UINT_STRING ) ) )? otherlv_9= 'levels=' ( (lv_levels_10_0= RULE_UINT_STRING ) ) otherlv_11= '>' (otherlv_12= '<level3_format' otherlv_13= 'file=' ( (otherlv_14= RULE_STRING ) ) otherlv_15= '/>' )? (otherlv_16= '<level3_filter' otherlv_17= 'file=' ( (otherlv_18= RULE_STRING ) ) otherlv_19= '/>' )? (otherlv_20= '<from_level2_import' otherlv_21= 'file=' ( (otherlv_22= RULE_STRING ) ) otherlv_23= '/>' )? (otherlv_24= '<level2_format' otherlv_25= 'file=' ( (otherlv_26= RULE_STRING ) ) otherlv_27= '/>' )? (otherlv_28= '<level2_filter' otherlv_29= 'file=' ( (otherlv_30= RULE_STRING ) ) otherlv_31= '/>' )? (otherlv_32= '<from_level1_import' otherlv_33= 'file=' ( (otherlv_34= RULE_STRING ) ) otherlv_35= '/>' )? (otherlv_36= '<level1_format' otherlv_37= 'file=' ( (otherlv_38= RULE_STRING ) ) otherlv_39= '/>' )? (otherlv_40= '<level1_filter' otherlv_41= 'file=' ( (otherlv_42= RULE_STRING ) ) otherlv_43= '/>' )? (otherlv_44= '<from_level0_import' otherlv_45= 'file=' ( (otherlv_46= RULE_STRING ) ) otherlv_47= '/>' )? (otherlv_48= '<level0_format' otherlv_49= 'file=' ( (otherlv_50= RULE_STRING ) ) otherlv_51= '/>' )? (otherlv_52= '<level0_filter' otherlv_53= 'file=' ( (otherlv_54= RULE_STRING ) ) otherlv_55= '/>' )? (otherlv_56= '<fields>' ( (lv_gssFields_57_0= ruleGSSTMOutputField ) )+ otherlv_58= '</fields>' )? otherlv_59= '</GSSTMOutput>' ) )
            // InternalTMOUTPUT.g:91:2: (otherlv_0= '<GSSTMOutput' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'type=' ( (lv_type_4_0= RULE_UINT_STRING ) ) otherlv_5= 'subtype=' ( (lv_subtype_6_0= RULE_UINT_STRING ) ) (otherlv_7= 'pi1_val=' ( (lv_pi1_val_8_0= RULE_UINT_STRING ) ) )? otherlv_9= 'levels=' ( (lv_levels_10_0= RULE_UINT_STRING ) ) otherlv_11= '>' (otherlv_12= '<level3_format' otherlv_13= 'file=' ( (otherlv_14= RULE_STRING ) ) otherlv_15= '/>' )? (otherlv_16= '<level3_filter' otherlv_17= 'file=' ( (otherlv_18= RULE_STRING ) ) otherlv_19= '/>' )? (otherlv_20= '<from_level2_import' otherlv_21= 'file=' ( (otherlv_22= RULE_STRING ) ) otherlv_23= '/>' )? (otherlv_24= '<level2_format' otherlv_25= 'file=' ( (otherlv_26= RULE_STRING ) ) otherlv_27= '/>' )? (otherlv_28= '<level2_filter' otherlv_29= 'file=' ( (otherlv_30= RULE_STRING ) ) otherlv_31= '/>' )? (otherlv_32= '<from_level1_import' otherlv_33= 'file=' ( (otherlv_34= RULE_STRING ) ) otherlv_35= '/>' )? (otherlv_36= '<level1_format' otherlv_37= 'file=' ( (otherlv_38= RULE_STRING ) ) otherlv_39= '/>' )? (otherlv_40= '<level1_filter' otherlv_41= 'file=' ( (otherlv_42= RULE_STRING ) ) otherlv_43= '/>' )? (otherlv_44= '<from_level0_import' otherlv_45= 'file=' ( (otherlv_46= RULE_STRING ) ) otherlv_47= '/>' )? (otherlv_48= '<level0_format' otherlv_49= 'file=' ( (otherlv_50= RULE_STRING ) ) otherlv_51= '/>' )? (otherlv_52= '<level0_filter' otherlv_53= 'file=' ( (otherlv_54= RULE_STRING ) ) otherlv_55= '/>' )? (otherlv_56= '<fields>' ( (lv_gssFields_57_0= ruleGSSTMOutputField ) )+ otherlv_58= '</fields>' )? otherlv_59= '</GSSTMOutput>' )
            {
            // InternalTMOUTPUT.g:91:2: (otherlv_0= '<GSSTMOutput' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'type=' ( (lv_type_4_0= RULE_UINT_STRING ) ) otherlv_5= 'subtype=' ( (lv_subtype_6_0= RULE_UINT_STRING ) ) (otherlv_7= 'pi1_val=' ( (lv_pi1_val_8_0= RULE_UINT_STRING ) ) )? otherlv_9= 'levels=' ( (lv_levels_10_0= RULE_UINT_STRING ) ) otherlv_11= '>' (otherlv_12= '<level3_format' otherlv_13= 'file=' ( (otherlv_14= RULE_STRING ) ) otherlv_15= '/>' )? (otherlv_16= '<level3_filter' otherlv_17= 'file=' ( (otherlv_18= RULE_STRING ) ) otherlv_19= '/>' )? (otherlv_20= '<from_level2_import' otherlv_21= 'file=' ( (otherlv_22= RULE_STRING ) ) otherlv_23= '/>' )? (otherlv_24= '<level2_format' otherlv_25= 'file=' ( (otherlv_26= RULE_STRING ) ) otherlv_27= '/>' )? (otherlv_28= '<level2_filter' otherlv_29= 'file=' ( (otherlv_30= RULE_STRING ) ) otherlv_31= '/>' )? (otherlv_32= '<from_level1_import' otherlv_33= 'file=' ( (otherlv_34= RULE_STRING ) ) otherlv_35= '/>' )? (otherlv_36= '<level1_format' otherlv_37= 'file=' ( (otherlv_38= RULE_STRING ) ) otherlv_39= '/>' )? (otherlv_40= '<level1_filter' otherlv_41= 'file=' ( (otherlv_42= RULE_STRING ) ) otherlv_43= '/>' )? (otherlv_44= '<from_level0_import' otherlv_45= 'file=' ( (otherlv_46= RULE_STRING ) ) otherlv_47= '/>' )? (otherlv_48= '<level0_format' otherlv_49= 'file=' ( (otherlv_50= RULE_STRING ) ) otherlv_51= '/>' )? (otherlv_52= '<level0_filter' otherlv_53= 'file=' ( (otherlv_54= RULE_STRING ) ) otherlv_55= '/>' )? (otherlv_56= '<fields>' ( (lv_gssFields_57_0= ruleGSSTMOutputField ) )+ otherlv_58= '</fields>' )? otherlv_59= '</GSSTMOutput>' )
            // InternalTMOUTPUT.g:92:3: otherlv_0= '<GSSTMOutput' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'type=' ( (lv_type_4_0= RULE_UINT_STRING ) ) otherlv_5= 'subtype=' ( (lv_subtype_6_0= RULE_UINT_STRING ) ) (otherlv_7= 'pi1_val=' ( (lv_pi1_val_8_0= RULE_UINT_STRING ) ) )? otherlv_9= 'levels=' ( (lv_levels_10_0= RULE_UINT_STRING ) ) otherlv_11= '>' (otherlv_12= '<level3_format' otherlv_13= 'file=' ( (otherlv_14= RULE_STRING ) ) otherlv_15= '/>' )? (otherlv_16= '<level3_filter' otherlv_17= 'file=' ( (otherlv_18= RULE_STRING ) ) otherlv_19= '/>' )? (otherlv_20= '<from_level2_import' otherlv_21= 'file=' ( (otherlv_22= RULE_STRING ) ) otherlv_23= '/>' )? (otherlv_24= '<level2_format' otherlv_25= 'file=' ( (otherlv_26= RULE_STRING ) ) otherlv_27= '/>' )? (otherlv_28= '<level2_filter' otherlv_29= 'file=' ( (otherlv_30= RULE_STRING ) ) otherlv_31= '/>' )? (otherlv_32= '<from_level1_import' otherlv_33= 'file=' ( (otherlv_34= RULE_STRING ) ) otherlv_35= '/>' )? (otherlv_36= '<level1_format' otherlv_37= 'file=' ( (otherlv_38= RULE_STRING ) ) otherlv_39= '/>' )? (otherlv_40= '<level1_filter' otherlv_41= 'file=' ( (otherlv_42= RULE_STRING ) ) otherlv_43= '/>' )? (otherlv_44= '<from_level0_import' otherlv_45= 'file=' ( (otherlv_46= RULE_STRING ) ) otherlv_47= '/>' )? (otherlv_48= '<level0_format' otherlv_49= 'file=' ( (otherlv_50= RULE_STRING ) ) otherlv_51= '/>' )? (otherlv_52= '<level0_filter' otherlv_53= 'file=' ( (otherlv_54= RULE_STRING ) ) otherlv_55= '/>' )? (otherlv_56= '<fields>' ( (lv_gssFields_57_0= ruleGSSTMOutputField ) )+ otherlv_58= '</fields>' )? otherlv_59= '</GSSTMOutput>'
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

            // InternalTMOUTPUT.g:162:3: (otherlv_7= 'pi1_val=' ( (lv_pi1_val_8_0= RULE_UINT_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTMOUTPUT.g:163:4: otherlv_7= 'pi1_val=' ( (lv_pi1_val_8_0= RULE_UINT_STRING ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getGSSTMOutputAccess().getPi1_valKeyword_7_0());
                      			
                    }
                    // InternalTMOUTPUT.g:167:4: ( (lv_pi1_val_8_0= RULE_UINT_STRING ) )
                    // InternalTMOUTPUT.g:168:5: (lv_pi1_val_8_0= RULE_UINT_STRING )
                    {
                    // InternalTMOUTPUT.g:168:5: (lv_pi1_val_8_0= RULE_UINT_STRING )
                    // InternalTMOUTPUT.g:169:6: lv_pi1_val_8_0= RULE_UINT_STRING
                    {
                    lv_pi1_val_8_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_pi1_val_8_0, grammarAccess.getGSSTMOutputAccess().getPi1_valUINT_STRINGTerminalRuleCall_7_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTMOutputRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"pi1_val",
                      							lv_pi1_val_8_0,
                      							"es.uah.aut.srg.gss.lang.tmoutput.TMOUTPUT.UINT_STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTMOutputAccess().getLevelsKeyword_8());
              		
            }
            // InternalTMOUTPUT.g:190:3: ( (lv_levels_10_0= RULE_UINT_STRING ) )
            // InternalTMOUTPUT.g:191:4: (lv_levels_10_0= RULE_UINT_STRING )
            {
            // InternalTMOUTPUT.g:191:4: (lv_levels_10_0= RULE_UINT_STRING )
            // InternalTMOUTPUT.g:192:5: lv_levels_10_0= RULE_UINT_STRING
            {
            lv_levels_10_0=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_levels_10_0, grammarAccess.getGSSTMOutputAccess().getLevelsUINT_STRINGTerminalRuleCall_9_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTMOutputRule());
              					}
              					setWithLastConsumed(
              						current,
              						"levels",
              						lv_levels_10_0,
              						"es.uah.aut.srg.gss.lang.tmoutput.TMOUTPUT.UINT_STRING");
              				
            }

            }


            }

            otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSTMOutputAccess().getGreaterThanSignKeyword_10());
              		
            }
            // InternalTMOUTPUT.g:212:3: (otherlv_12= '<level3_format' otherlv_13= 'file=' ( (otherlv_14= RULE_STRING ) ) otherlv_15= '/>' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTMOUTPUT.g:213:4: otherlv_12= '<level3_format' otherlv_13= 'file=' ( (otherlv_14= RULE_STRING ) ) otherlv_15= '/>'
                    {
                    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getGSSTMOutputAccess().getLevel3_formatKeyword_11_0());
                      			
                    }
                    otherlv_13=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getGSSTMOutputAccess().getFileKeyword_11_1());
                      			
                    }
                    // InternalTMOUTPUT.g:221:4: ( (otherlv_14= RULE_STRING ) )
                    // InternalTMOUTPUT.g:222:5: (otherlv_14= RULE_STRING )
                    {
                    // InternalTMOUTPUT.g:222:5: (otherlv_14= RULE_STRING )
                    // InternalTMOUTPUT.g:223:6: otherlv_14= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTMOutputRule());
                      						}
                      					
                    }
                    otherlv_14=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_14, grammarAccess.getGSSTMOutputAccess().getLevel3_formatGSSFormatFormatCrossReference_11_2_0());
                      					
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,21,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_11_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTMOUTPUT.g:242:3: (otherlv_16= '<level3_filter' otherlv_17= 'file=' ( (otherlv_18= RULE_STRING ) ) otherlv_19= '/>' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTMOUTPUT.g:243:4: otherlv_16= '<level3_filter' otherlv_17= 'file=' ( (otherlv_18= RULE_STRING ) ) otherlv_19= '/>'
                    {
                    otherlv_16=(Token)match(input,22,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getGSSTMOutputAccess().getLevel3_filterKeyword_12_0());
                      			
                    }
                    otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSTMOutputAccess().getFileKeyword_12_1());
                      			
                    }
                    // InternalTMOUTPUT.g:251:4: ( (otherlv_18= RULE_STRING ) )
                    // InternalTMOUTPUT.g:252:5: (otherlv_18= RULE_STRING )
                    {
                    // InternalTMOUTPUT.g:252:5: (otherlv_18= RULE_STRING )
                    // InternalTMOUTPUT.g:253:6: otherlv_18= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTMOutputRule());
                      						}
                      					
                    }
                    otherlv_18=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_18, grammarAccess.getGSSTMOutputAccess().getLevel3_filterGSSFilterFilterCrossReference_12_2_0());
                      					
                    }

                    }


                    }

                    otherlv_19=(Token)match(input,21,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_12_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTMOUTPUT.g:272:3: (otherlv_20= '<from_level2_import' otherlv_21= 'file=' ( (otherlv_22= RULE_STRING ) ) otherlv_23= '/>' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTMOUTPUT.g:273:4: otherlv_20= '<from_level2_import' otherlv_21= 'file=' ( (otherlv_22= RULE_STRING ) ) otherlv_23= '/>'
                    {
                    otherlv_20=(Token)match(input,23,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getGSSTMOutputAccess().getFrom_level2_importKeyword_13_0());
                      			
                    }
                    otherlv_21=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getGSSTMOutputAccess().getFileKeyword_13_1());
                      			
                    }
                    // InternalTMOUTPUT.g:281:4: ( (otherlv_22= RULE_STRING ) )
                    // InternalTMOUTPUT.g:282:5: (otherlv_22= RULE_STRING )
                    {
                    // InternalTMOUTPUT.g:282:5: (otherlv_22= RULE_STRING )
                    // InternalTMOUTPUT.g:283:6: otherlv_22= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTMOutputRule());
                      						}
                      					
                    }
                    otherlv_22=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_22, grammarAccess.getGSSTMOutputAccess().getFrom_level2_importGSSImportImportCrossReference_13_2_0());
                      					
                    }

                    }


                    }

                    otherlv_23=(Token)match(input,21,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_13_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTMOUTPUT.g:302:3: (otherlv_24= '<level2_format' otherlv_25= 'file=' ( (otherlv_26= RULE_STRING ) ) otherlv_27= '/>' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTMOUTPUT.g:303:4: otherlv_24= '<level2_format' otherlv_25= 'file=' ( (otherlv_26= RULE_STRING ) ) otherlv_27= '/>'
                    {
                    otherlv_24=(Token)match(input,24,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_24, grammarAccess.getGSSTMOutputAccess().getLevel2_formatKeyword_14_0());
                      			
                    }
                    otherlv_25=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getGSSTMOutputAccess().getFileKeyword_14_1());
                      			
                    }
                    // InternalTMOUTPUT.g:311:4: ( (otherlv_26= RULE_STRING ) )
                    // InternalTMOUTPUT.g:312:5: (otherlv_26= RULE_STRING )
                    {
                    // InternalTMOUTPUT.g:312:5: (otherlv_26= RULE_STRING )
                    // InternalTMOUTPUT.g:313:6: otherlv_26= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTMOutputRule());
                      						}
                      					
                    }
                    otherlv_26=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_26, grammarAccess.getGSSTMOutputAccess().getLevel2_formatGSSFormatFormatCrossReference_14_2_0());
                      					
                    }

                    }


                    }

                    otherlv_27=(Token)match(input,21,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_27, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTMOUTPUT.g:332:3: (otherlv_28= '<level2_filter' otherlv_29= 'file=' ( (otherlv_30= RULE_STRING ) ) otherlv_31= '/>' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTMOUTPUT.g:333:4: otherlv_28= '<level2_filter' otherlv_29= 'file=' ( (otherlv_30= RULE_STRING ) ) otherlv_31= '/>'
                    {
                    otherlv_28=(Token)match(input,25,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_28, grammarAccess.getGSSTMOutputAccess().getLevel2_filterKeyword_15_0());
                      			
                    }
                    otherlv_29=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_29, grammarAccess.getGSSTMOutputAccess().getFileKeyword_15_1());
                      			
                    }
                    // InternalTMOUTPUT.g:341:4: ( (otherlv_30= RULE_STRING ) )
                    // InternalTMOUTPUT.g:342:5: (otherlv_30= RULE_STRING )
                    {
                    // InternalTMOUTPUT.g:342:5: (otherlv_30= RULE_STRING )
                    // InternalTMOUTPUT.g:343:6: otherlv_30= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTMOutputRule());
                      						}
                      					
                    }
                    otherlv_30=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_30, grammarAccess.getGSSTMOutputAccess().getLevel2_filterGSSFilterFilterCrossReference_15_2_0());
                      					
                    }

                    }


                    }

                    otherlv_31=(Token)match(input,21,FollowSets000.FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_15_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTMOUTPUT.g:362:3: (otherlv_32= '<from_level1_import' otherlv_33= 'file=' ( (otherlv_34= RULE_STRING ) ) otherlv_35= '/>' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTMOUTPUT.g:363:4: otherlv_32= '<from_level1_import' otherlv_33= 'file=' ( (otherlv_34= RULE_STRING ) ) otherlv_35= '/>'
                    {
                    otherlv_32=(Token)match(input,26,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_32, grammarAccess.getGSSTMOutputAccess().getFrom_level1_importKeyword_16_0());
                      			
                    }
                    otherlv_33=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_33, grammarAccess.getGSSTMOutputAccess().getFileKeyword_16_1());
                      			
                    }
                    // InternalTMOUTPUT.g:371:4: ( (otherlv_34= RULE_STRING ) )
                    // InternalTMOUTPUT.g:372:5: (otherlv_34= RULE_STRING )
                    {
                    // InternalTMOUTPUT.g:372:5: (otherlv_34= RULE_STRING )
                    // InternalTMOUTPUT.g:373:6: otherlv_34= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTMOutputRule());
                      						}
                      					
                    }
                    otherlv_34=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_34, grammarAccess.getGSSTMOutputAccess().getFrom_level1_importGSSImportImportCrossReference_16_2_0());
                      					
                    }

                    }


                    }

                    otherlv_35=(Token)match(input,21,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_35, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_16_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTMOUTPUT.g:392:3: (otherlv_36= '<level1_format' otherlv_37= 'file=' ( (otherlv_38= RULE_STRING ) ) otherlv_39= '/>' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTMOUTPUT.g:393:4: otherlv_36= '<level1_format' otherlv_37= 'file=' ( (otherlv_38= RULE_STRING ) ) otherlv_39= '/>'
                    {
                    otherlv_36=(Token)match(input,27,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_36, grammarAccess.getGSSTMOutputAccess().getLevel1_formatKeyword_17_0());
                      			
                    }
                    otherlv_37=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_37, grammarAccess.getGSSTMOutputAccess().getFileKeyword_17_1());
                      			
                    }
                    // InternalTMOUTPUT.g:401:4: ( (otherlv_38= RULE_STRING ) )
                    // InternalTMOUTPUT.g:402:5: (otherlv_38= RULE_STRING )
                    {
                    // InternalTMOUTPUT.g:402:5: (otherlv_38= RULE_STRING )
                    // InternalTMOUTPUT.g:403:6: otherlv_38= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTMOutputRule());
                      						}
                      					
                    }
                    otherlv_38=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_38, grammarAccess.getGSSTMOutputAccess().getLevel1_formatGSSFormatFormatCrossReference_17_2_0());
                      					
                    }

                    }


                    }

                    otherlv_39=(Token)match(input,21,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_39, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_17_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTMOUTPUT.g:422:3: (otherlv_40= '<level1_filter' otherlv_41= 'file=' ( (otherlv_42= RULE_STRING ) ) otherlv_43= '/>' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTMOUTPUT.g:423:4: otherlv_40= '<level1_filter' otherlv_41= 'file=' ( (otherlv_42= RULE_STRING ) ) otherlv_43= '/>'
                    {
                    otherlv_40=(Token)match(input,28,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_40, grammarAccess.getGSSTMOutputAccess().getLevel1_filterKeyword_18_0());
                      			
                    }
                    otherlv_41=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_41, grammarAccess.getGSSTMOutputAccess().getFileKeyword_18_1());
                      			
                    }
                    // InternalTMOUTPUT.g:431:4: ( (otherlv_42= RULE_STRING ) )
                    // InternalTMOUTPUT.g:432:5: (otherlv_42= RULE_STRING )
                    {
                    // InternalTMOUTPUT.g:432:5: (otherlv_42= RULE_STRING )
                    // InternalTMOUTPUT.g:433:6: otherlv_42= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTMOutputRule());
                      						}
                      					
                    }
                    otherlv_42=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_42, grammarAccess.getGSSTMOutputAccess().getLevel1_filterGSSFilterFilterCrossReference_18_2_0());
                      					
                    }

                    }


                    }

                    otherlv_43=(Token)match(input,21,FollowSets000.FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_43, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_18_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTMOUTPUT.g:452:3: (otherlv_44= '<from_level0_import' otherlv_45= 'file=' ( (otherlv_46= RULE_STRING ) ) otherlv_47= '/>' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTMOUTPUT.g:453:4: otherlv_44= '<from_level0_import' otherlv_45= 'file=' ( (otherlv_46= RULE_STRING ) ) otherlv_47= '/>'
                    {
                    otherlv_44=(Token)match(input,29,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_44, grammarAccess.getGSSTMOutputAccess().getFrom_level0_importKeyword_19_0());
                      			
                    }
                    otherlv_45=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_45, grammarAccess.getGSSTMOutputAccess().getFileKeyword_19_1());
                      			
                    }
                    // InternalTMOUTPUT.g:461:4: ( (otherlv_46= RULE_STRING ) )
                    // InternalTMOUTPUT.g:462:5: (otherlv_46= RULE_STRING )
                    {
                    // InternalTMOUTPUT.g:462:5: (otherlv_46= RULE_STRING )
                    // InternalTMOUTPUT.g:463:6: otherlv_46= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTMOutputRule());
                      						}
                      					
                    }
                    otherlv_46=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_46, grammarAccess.getGSSTMOutputAccess().getFrom_level0_importGSSImportImportCrossReference_19_2_0());
                      					
                    }

                    }


                    }

                    otherlv_47=(Token)match(input,21,FollowSets000.FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_47, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_19_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTMOUTPUT.g:482:3: (otherlv_48= '<level0_format' otherlv_49= 'file=' ( (otherlv_50= RULE_STRING ) ) otherlv_51= '/>' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTMOUTPUT.g:483:4: otherlv_48= '<level0_format' otherlv_49= 'file=' ( (otherlv_50= RULE_STRING ) ) otherlv_51= '/>'
                    {
                    otherlv_48=(Token)match(input,30,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_48, grammarAccess.getGSSTMOutputAccess().getLevel0_formatKeyword_20_0());
                      			
                    }
                    otherlv_49=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_49, grammarAccess.getGSSTMOutputAccess().getFileKeyword_20_1());
                      			
                    }
                    // InternalTMOUTPUT.g:491:4: ( (otherlv_50= RULE_STRING ) )
                    // InternalTMOUTPUT.g:492:5: (otherlv_50= RULE_STRING )
                    {
                    // InternalTMOUTPUT.g:492:5: (otherlv_50= RULE_STRING )
                    // InternalTMOUTPUT.g:493:6: otherlv_50= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTMOutputRule());
                      						}
                      					
                    }
                    otherlv_50=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_50, grammarAccess.getGSSTMOutputAccess().getLevel0_formatGSSFormatFormatCrossReference_20_2_0());
                      					
                    }

                    }


                    }

                    otherlv_51=(Token)match(input,21,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_51, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_20_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTMOUTPUT.g:512:3: (otherlv_52= '<level0_filter' otherlv_53= 'file=' ( (otherlv_54= RULE_STRING ) ) otherlv_55= '/>' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTMOUTPUT.g:513:4: otherlv_52= '<level0_filter' otherlv_53= 'file=' ( (otherlv_54= RULE_STRING ) ) otherlv_55= '/>'
                    {
                    otherlv_52=(Token)match(input,31,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_52, grammarAccess.getGSSTMOutputAccess().getLevel0_filterKeyword_21_0());
                      			
                    }
                    otherlv_53=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_53, grammarAccess.getGSSTMOutputAccess().getFileKeyword_21_1());
                      			
                    }
                    // InternalTMOUTPUT.g:521:4: ( (otherlv_54= RULE_STRING ) )
                    // InternalTMOUTPUT.g:522:5: (otherlv_54= RULE_STRING )
                    {
                    // InternalTMOUTPUT.g:522:5: (otherlv_54= RULE_STRING )
                    // InternalTMOUTPUT.g:523:6: otherlv_54= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTMOutputRule());
                      						}
                      					
                    }
                    otherlv_54=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_54, grammarAccess.getGSSTMOutputAccess().getLevel0_filterGSSFilterFilterCrossReference_21_2_0());
                      					
                    }

                    }


                    }

                    otherlv_55=(Token)match(input,21,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_55, grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_21_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTMOUTPUT.g:542:3: (otherlv_56= '<fields>' ( (lv_gssFields_57_0= ruleGSSTMOutputField ) )+ otherlv_58= '</fields>' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTMOUTPUT.g:543:4: otherlv_56= '<fields>' ( (lv_gssFields_57_0= ruleGSSTMOutputField ) )+ otherlv_58= '</fields>'
                    {
                    otherlv_56=(Token)match(input,32,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_56, grammarAccess.getGSSTMOutputAccess().getFieldsKeyword_22_0());
                      			
                    }
                    // InternalTMOUTPUT.g:547:4: ( (lv_gssFields_57_0= ruleGSSTMOutputField ) )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==35) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalTMOUTPUT.g:548:5: (lv_gssFields_57_0= ruleGSSTMOutputField )
                    	    {
                    	    // InternalTMOUTPUT.g:548:5: (lv_gssFields_57_0= ruleGSSTMOutputField )
                    	    // InternalTMOUTPUT.g:549:6: lv_gssFields_57_0= ruleGSSTMOutputField
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getGSSTMOutputAccess().getGssFieldsGSSTMOutputFieldParserRuleCall_22_1_0());
                    	      					
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_26);
                    	    lv_gssFields_57_0=ruleGSSTMOutputField();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getGSSTMOutputRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"gssFields",
                    	      							lv_gssFields_57_0,
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

                    otherlv_58=(Token)match(input,33,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_58, grammarAccess.getGSSTMOutputAccess().getFieldsKeyword_22_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_59=(Token)match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_59, grammarAccess.getGSSTMOutputAccess().getGSSTMOutputKeyword_23());
              		
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


    // $ANTLR start "entryRuleGSSTMOutputField"
    // InternalTMOUTPUT.g:579:1: entryRuleGSSTMOutputField returns [EObject current=null] : iv_ruleGSSTMOutputField= ruleGSSTMOutputField EOF ;
    public final EObject entryRuleGSSTMOutputField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTMOutputField = null;


        try {
            // InternalTMOUTPUT.g:579:57: (iv_ruleGSSTMOutputField= ruleGSSTMOutputField EOF )
            // InternalTMOUTPUT.g:580:2: iv_ruleGSSTMOutputField= ruleGSSTMOutputField EOF
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
    // InternalTMOUTPUT.g:586:1: ruleGSSTMOutputField returns [EObject current=null] : (otherlv_0= '<OutputField' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'gssField=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= '/>' ) ;
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
            // InternalTMOUTPUT.g:592:2: ( (otherlv_0= '<OutputField' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'gssField=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= '/>' ) )
            // InternalTMOUTPUT.g:593:2: (otherlv_0= '<OutputField' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'gssField=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= '/>' )
            {
            // InternalTMOUTPUT.g:593:2: (otherlv_0= '<OutputField' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'gssField=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= '/>' )
            // InternalTMOUTPUT.g:594:3: otherlv_0= '<OutputField' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'gssField=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= '/>'
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTMOutputFieldAccess().getOutputFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTMOutputFieldAccess().getNameKeyword_1());
              		
            }
            // InternalTMOUTPUT.g:602:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalTMOUTPUT.g:603:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalTMOUTPUT.g:603:4: (lv_name_2_0= RULE_STRING )
            // InternalTMOUTPUT.g:604:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_28); if (state.failed) return current;
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
            // InternalTMOUTPUT.g:624:3: ( (otherlv_4= RULE_STRING ) )
            // InternalTMOUTPUT.g:625:4: (otherlv_4= RULE_STRING )
            {
            // InternalTMOUTPUT.g:625:4: (otherlv_4= RULE_STRING )
            // InternalTMOUTPUT.g:626:5: otherlv_4= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTMOutputFieldRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getGSSTMOutputFieldAccess().getGssFieldGSSFormatFieldCrossReference_4_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000005FFC80000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000005FFC00000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000005FF800000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000005FF000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000005FE000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000005FC000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000005F8000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000005F0000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000005E0000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000005C0000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000580000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000500000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000A00000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    }


}