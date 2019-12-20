package es.uah.aut.srg.gss.lang.tcheaderinput.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uah.aut.srg.gss.lang.tcheaderinput.services.TCHEADERINPUTGrammarAccess;



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
public class InternalTCHEADERINPUTParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_UINT_STRING", "RULE_HEX_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<GSSTCHeaderInput'", "'name='", "'>'", "'<format'", "'file='", "'/>'", "'<fields>'", "'</fields>'", "'</GSSTCHeaderInput>'", "'<HeaderField'", "'gssHeaderField='", "'</HeaderField>'", "'<FieldValueRaw'", "'value='"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_UINT_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int RULE_HEX_STRING=6;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int RULE_INT=8;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTCHEADERINPUTParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTCHEADERINPUTParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTCHEADERINPUTParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTCHEADERINPUT.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private TCHEADERINPUTGrammarAccess grammarAccess;

        public InternalTCHEADERINPUTParser(TokenStream input, TCHEADERINPUTGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GSSTCHeaderInput";
       	}

       	@Override
       	protected TCHEADERINPUTGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGSSTCHeaderInput"
    // InternalTCHEADERINPUT.g:77:1: entryRuleGSSTCHeaderInput returns [EObject current=null] : iv_ruleGSSTCHeaderInput= ruleGSSTCHeaderInput EOF ;
    public final EObject entryRuleGSSTCHeaderInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTCHeaderInput = null;


        try {
            // InternalTCHEADERINPUT.g:77:57: (iv_ruleGSSTCHeaderInput= ruleGSSTCHeaderInput EOF )
            // InternalTCHEADERINPUT.g:78:2: iv_ruleGSSTCHeaderInput= ruleGSSTCHeaderInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTCHeaderInputRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTCHeaderInput=ruleGSSTCHeaderInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTCHeaderInput; 
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
    // $ANTLR end "entryRuleGSSTCHeaderInput"


    // $ANTLR start "ruleGSSTCHeaderInput"
    // InternalTCHEADERINPUT.g:84:1: ruleGSSTCHeaderInput returns [EObject current=null] : (otherlv_0= '<GSSTCHeaderInput' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' otherlv_4= '<format' otherlv_5= 'file=' ( (otherlv_6= RULE_STRING ) ) otherlv_7= '/>' (otherlv_8= '<fields>' ( (lv_gssHeaderFields_9_0= ruleGSSTCHeaderInputField ) )+ otherlv_10= '</fields>' )? otherlv_11= '</GSSTCHeaderInput>' ) ;
    public final EObject ruleGSSTCHeaderInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_gssHeaderFields_9_0 = null;



        	enterRule();

        try {
            // InternalTCHEADERINPUT.g:90:2: ( (otherlv_0= '<GSSTCHeaderInput' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' otherlv_4= '<format' otherlv_5= 'file=' ( (otherlv_6= RULE_STRING ) ) otherlv_7= '/>' (otherlv_8= '<fields>' ( (lv_gssHeaderFields_9_0= ruleGSSTCHeaderInputField ) )+ otherlv_10= '</fields>' )? otherlv_11= '</GSSTCHeaderInput>' ) )
            // InternalTCHEADERINPUT.g:91:2: (otherlv_0= '<GSSTCHeaderInput' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' otherlv_4= '<format' otherlv_5= 'file=' ( (otherlv_6= RULE_STRING ) ) otherlv_7= '/>' (otherlv_8= '<fields>' ( (lv_gssHeaderFields_9_0= ruleGSSTCHeaderInputField ) )+ otherlv_10= '</fields>' )? otherlv_11= '</GSSTCHeaderInput>' )
            {
            // InternalTCHEADERINPUT.g:91:2: (otherlv_0= '<GSSTCHeaderInput' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' otherlv_4= '<format' otherlv_5= 'file=' ( (otherlv_6= RULE_STRING ) ) otherlv_7= '/>' (otherlv_8= '<fields>' ( (lv_gssHeaderFields_9_0= ruleGSSTCHeaderInputField ) )+ otherlv_10= '</fields>' )? otherlv_11= '</GSSTCHeaderInput>' )
            // InternalTCHEADERINPUT.g:92:3: otherlv_0= '<GSSTCHeaderInput' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' otherlv_4= '<format' otherlv_5= 'file=' ( (otherlv_6= RULE_STRING ) ) otherlv_7= '/>' (otherlv_8= '<fields>' ( (lv_gssHeaderFields_9_0= ruleGSSTCHeaderInputField ) )+ otherlv_10= '</fields>' )? otherlv_11= '</GSSTCHeaderInput>'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTCHeaderInputAccess().getGSSTCHeaderInputKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTCHeaderInputAccess().getNameKeyword_1());
              		
            }
            // InternalTCHEADERINPUT.g:100:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalTCHEADERINPUT.g:101:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalTCHEADERINPUT.g:101:4: (lv_name_2_0= RULE_STRING )
            // InternalTCHEADERINPUT.g:102:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getGSSTCHeaderInputAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTCHeaderInputRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTCHeaderInputAccess().getGreaterThanSignKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGSSTCHeaderInputAccess().getFormatKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTCHeaderInputAccess().getFileKeyword_5());
              		
            }
            // InternalTCHEADERINPUT.g:130:3: ( (otherlv_6= RULE_STRING ) )
            // InternalTCHEADERINPUT.g:131:4: (otherlv_6= RULE_STRING )
            {
            // InternalTCHEADERINPUT.g:131:4: (otherlv_6= RULE_STRING )
            // InternalTCHEADERINPUT.g:132:5: otherlv_6= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTCHeaderInputRule());
              					}
              				
            }
            otherlv_6=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_6, grammarAccess.getGSSTCHeaderInputAccess().getFormatGSSFormatFormatCrossReference_6_0());
              				
            }

            }


            }

            otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTCHeaderInputAccess().getSolidusGreaterThanSignKeyword_7());
              		
            }
            // InternalTCHEADERINPUT.g:150:3: (otherlv_8= '<fields>' ( (lv_gssHeaderFields_9_0= ruleGSSTCHeaderInputField ) )+ otherlv_10= '</fields>' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTCHEADERINPUT.g:151:4: otherlv_8= '<fields>' ( (lv_gssHeaderFields_9_0= ruleGSSTCHeaderInputField ) )+ otherlv_10= '</fields>'
                    {
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getGSSTCHeaderInputAccess().getFieldsKeyword_8_0());
                      			
                    }
                    // InternalTCHEADERINPUT.g:155:4: ( (lv_gssHeaderFields_9_0= ruleGSSTCHeaderInputField ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==22) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalTCHEADERINPUT.g:156:5: (lv_gssHeaderFields_9_0= ruleGSSTCHeaderInputField )
                    	    {
                    	    // InternalTCHEADERINPUT.g:156:5: (lv_gssHeaderFields_9_0= ruleGSSTCHeaderInputField )
                    	    // InternalTCHEADERINPUT.g:157:6: lv_gssHeaderFields_9_0= ruleGSSTCHeaderInputField
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getGSSTCHeaderInputAccess().getGssHeaderFieldsGSSTCHeaderInputFieldParserRuleCall_8_1_0());
                    	      					
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_11);
                    	    lv_gssHeaderFields_9_0=ruleGSSTCHeaderInputField();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getGSSTCHeaderInputRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"gssHeaderFields",
                    	      							lv_gssHeaderFields_9_0,
                    	      							"es.uah.aut.srg.gss.lang.tcheaderinput.TCHEADERINPUT.GSSTCHeaderInputField");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);

                    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getGSSTCHeaderInputAccess().getFieldsKeyword_8_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSTCHeaderInputAccess().getGSSTCHeaderInputKeyword_9());
              		
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
    // $ANTLR end "ruleGSSTCHeaderInput"


    // $ANTLR start "entryRuleGSSTCHeaderInputField"
    // InternalTCHEADERINPUT.g:187:1: entryRuleGSSTCHeaderInputField returns [EObject current=null] : iv_ruleGSSTCHeaderInputField= ruleGSSTCHeaderInputField EOF ;
    public final EObject entryRuleGSSTCHeaderInputField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTCHeaderInputField = null;


        try {
            // InternalTCHEADERINPUT.g:187:62: (iv_ruleGSSTCHeaderInputField= ruleGSSTCHeaderInputField EOF )
            // InternalTCHEADERINPUT.g:188:2: iv_ruleGSSTCHeaderInputField= ruleGSSTCHeaderInputField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTCHeaderInputFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTCHeaderInputField=ruleGSSTCHeaderInputField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTCHeaderInputField; 
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
    // $ANTLR end "entryRuleGSSTCHeaderInputField"


    // $ANTLR start "ruleGSSTCHeaderInputField"
    // InternalTCHEADERINPUT.g:194:1: ruleGSSTCHeaderInputField returns [EObject current=null] : (otherlv_0= '<HeaderField' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'gssHeaderField=' ( (otherlv_4= RULE_STRING ) ) ( (otherlv_5= '>' ( (lv_fieldValue_6_0= ruleTMTCIFFieldValueRaw ) ) otherlv_7= '</HeaderField>' ) | otherlv_8= '/>' ) ) ;
    public final EObject ruleGSSTCHeaderInputField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_fieldValue_6_0 = null;



        	enterRule();

        try {
            // InternalTCHEADERINPUT.g:200:2: ( (otherlv_0= '<HeaderField' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'gssHeaderField=' ( (otherlv_4= RULE_STRING ) ) ( (otherlv_5= '>' ( (lv_fieldValue_6_0= ruleTMTCIFFieldValueRaw ) ) otherlv_7= '</HeaderField>' ) | otherlv_8= '/>' ) ) )
            // InternalTCHEADERINPUT.g:201:2: (otherlv_0= '<HeaderField' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'gssHeaderField=' ( (otherlv_4= RULE_STRING ) ) ( (otherlv_5= '>' ( (lv_fieldValue_6_0= ruleTMTCIFFieldValueRaw ) ) otherlv_7= '</HeaderField>' ) | otherlv_8= '/>' ) )
            {
            // InternalTCHEADERINPUT.g:201:2: (otherlv_0= '<HeaderField' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'gssHeaderField=' ( (otherlv_4= RULE_STRING ) ) ( (otherlv_5= '>' ( (lv_fieldValue_6_0= ruleTMTCIFFieldValueRaw ) ) otherlv_7= '</HeaderField>' ) | otherlv_8= '/>' ) )
            // InternalTCHEADERINPUT.g:202:3: otherlv_0= '<HeaderField' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'gssHeaderField=' ( (otherlv_4= RULE_STRING ) ) ( (otherlv_5= '>' ( (lv_fieldValue_6_0= ruleTMTCIFFieldValueRaw ) ) otherlv_7= '</HeaderField>' ) | otherlv_8= '/>' )
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTCHeaderInputFieldAccess().getHeaderFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTCHeaderInputFieldAccess().getNameKeyword_1());
              		
            }
            // InternalTCHEADERINPUT.g:210:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalTCHEADERINPUT.g:211:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalTCHEADERINPUT.g:211:4: (lv_name_2_0= RULE_STRING )
            // InternalTCHEADERINPUT.g:212:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getGSSTCHeaderInputFieldAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTCHeaderInputFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTCHeaderInputFieldAccess().getGssHeaderFieldKeyword_3());
              		
            }
            // InternalTCHEADERINPUT.g:232:3: ( (otherlv_4= RULE_STRING ) )
            // InternalTCHEADERINPUT.g:233:4: (otherlv_4= RULE_STRING )
            {
            // InternalTCHEADERINPUT.g:233:4: (otherlv_4= RULE_STRING )
            // InternalTCHEADERINPUT.g:234:5: otherlv_4= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTCHeaderInputFieldRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getGSSTCHeaderInputFieldAccess().getGssHeaderFieldGSSFormatFieldCrossReference_4_0());
              				
            }

            }


            }

            // InternalTCHEADERINPUT.g:248:3: ( (otherlv_5= '>' ( (lv_fieldValue_6_0= ruleTMTCIFFieldValueRaw ) ) otherlv_7= '</HeaderField>' ) | otherlv_8= '/>' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTCHEADERINPUT.g:249:4: (otherlv_5= '>' ( (lv_fieldValue_6_0= ruleTMTCIFFieldValueRaw ) ) otherlv_7= '</HeaderField>' )
                    {
                    // InternalTCHEADERINPUT.g:249:4: (otherlv_5= '>' ( (lv_fieldValue_6_0= ruleTMTCIFFieldValueRaw ) ) otherlv_7= '</HeaderField>' )
                    // InternalTCHEADERINPUT.g:250:5: otherlv_5= '>' ( (lv_fieldValue_6_0= ruleTMTCIFFieldValueRaw ) ) otherlv_7= '</HeaderField>'
                    {
                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getGSSTCHeaderInputFieldAccess().getGreaterThanSignKeyword_5_0_0());
                      				
                    }
                    // InternalTCHEADERINPUT.g:254:5: ( (lv_fieldValue_6_0= ruleTMTCIFFieldValueRaw ) )
                    // InternalTCHEADERINPUT.g:255:6: (lv_fieldValue_6_0= ruleTMTCIFFieldValueRaw )
                    {
                    // InternalTCHEADERINPUT.g:255:6: (lv_fieldValue_6_0= ruleTMTCIFFieldValueRaw )
                    // InternalTCHEADERINPUT.g:256:7: lv_fieldValue_6_0= ruleTMTCIFFieldValueRaw
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getGSSTCHeaderInputFieldAccess().getFieldValueTMTCIFFieldValueRawParserRuleCall_5_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_16);
                    lv_fieldValue_6_0=ruleTMTCIFFieldValueRaw();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getGSSTCHeaderInputFieldRule());
                      							}
                      							set(
                      								current,
                      								"fieldValue",
                      								lv_fieldValue_6_0,
                      								"es.uah.aut.srg.gss.lang.tcheaderinput.TCHEADERINPUT.TMTCIFFieldValueRaw");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getGSSTCHeaderInputFieldAccess().getHeaderFieldKeyword_5_0_2());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTCHEADERINPUT.g:279:4: otherlv_8= '/>'
                    {
                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getGSSTCHeaderInputFieldAccess().getSolidusGreaterThanSignKeyword_5_1());
                      			
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
    // $ANTLR end "ruleGSSTCHeaderInputField"


    // $ANTLR start "entryRuleTMTCIFFieldValueRaw"
    // InternalTCHEADERINPUT.g:288:1: entryRuleTMTCIFFieldValueRaw returns [EObject current=null] : iv_ruleTMTCIFFieldValueRaw= ruleTMTCIFFieldValueRaw EOF ;
    public final EObject entryRuleTMTCIFFieldValueRaw() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFieldValueRaw = null;


        try {
            // InternalTCHEADERINPUT.g:288:60: (iv_ruleTMTCIFFieldValueRaw= ruleTMTCIFFieldValueRaw EOF )
            // InternalTCHEADERINPUT.g:289:2: iv_ruleTMTCIFFieldValueRaw= ruleTMTCIFFieldValueRaw EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFieldValueRawRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFieldValueRaw=ruleTMTCIFFieldValueRaw();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFieldValueRaw; 
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
    // $ANTLR end "entryRuleTMTCIFFieldValueRaw"


    // $ANTLR start "ruleTMTCIFFieldValueRaw"
    // InternalTCHEADERINPUT.g:295:1: ruleTMTCIFFieldValueRaw returns [EObject current=null] : (otherlv_0= '<FieldValueRaw' otherlv_1= 'value=' ( ( (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING ) ) ) otherlv_3= '/>' ) ;
    public final EObject ruleTMTCIFFieldValueRaw() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTCHEADERINPUT.g:301:2: ( (otherlv_0= '<FieldValueRaw' otherlv_1= 'value=' ( ( (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING ) ) ) otherlv_3= '/>' ) )
            // InternalTCHEADERINPUT.g:302:2: (otherlv_0= '<FieldValueRaw' otherlv_1= 'value=' ( ( (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING ) ) ) otherlv_3= '/>' )
            {
            // InternalTCHEADERINPUT.g:302:2: (otherlv_0= '<FieldValueRaw' otherlv_1= 'value=' ( ( (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING ) ) ) otherlv_3= '/>' )
            // InternalTCHEADERINPUT.g:303:3: otherlv_0= '<FieldValueRaw' otherlv_1= 'value=' ( ( (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING ) ) ) otherlv_3= '/>'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFieldValueRawAccess().getFieldValueRawKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFieldValueRawAccess().getValueKeyword_1());
              		
            }
            // InternalTCHEADERINPUT.g:311:3: ( ( (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING ) ) )
            // InternalTCHEADERINPUT.g:312:4: ( (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING ) )
            {
            // InternalTCHEADERINPUT.g:312:4: ( (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING ) )
            // InternalTCHEADERINPUT.g:313:5: (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING )
            {
            // InternalTCHEADERINPUT.g:313:5: (lv_value_2_1= RULE_UINT_STRING | lv_value_2_2= RULE_HEX_STRING )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_UINT_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_HEX_STRING) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTCHEADERINPUT.g:314:6: lv_value_2_1= RULE_UINT_STRING
                    {
                    lv_value_2_1=(Token)match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_2_1, grammarAccess.getTMTCIFFieldValueRawAccess().getValueUINT_STRINGTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTMTCIFFieldValueRawRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_2_1,
                      							"es.uah.aut.srg.gss.lang.tcheaderinput.TCHEADERINPUT.UINT_STRING");
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalTCHEADERINPUT.g:329:6: lv_value_2_2= RULE_HEX_STRING
                    {
                    lv_value_2_2=(Token)match(input,RULE_HEX_STRING,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_2_2, grammarAccess.getTMTCIFFieldValueRawAccess().getValueHEX_STRINGTerminalRuleCall_2_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTMTCIFFieldValueRawRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_2_2,
                      							"es.uah.aut.srg.gss.lang.tcheaderinput.TCHEADERINPUT.HEX_STRING");
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFieldValueRawAccess().getSolidusGreaterThanSignKeyword_3());
              		
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
    // $ANTLR end "ruleTMTCIFFieldValueRaw"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000060L});
    }


}