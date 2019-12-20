package es.uah.aut.srg.gss.lang.tcheaderinput.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
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
public class InternalTCHEADERINPUTParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_UINT_STRING", "RULE_HEX_STRING", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'/>'", "'<GSSTCHeaderInput'", "'name='", "'>'", "'<format'", "'file='", "'</GSSTCHeaderInput>'", "'<fields>'", "'</fields>'", "'<HeaderField'", "'gssHeaderField='", "'</HeaderField>'", "'<FieldValueRaw'", "'value='"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_UINT_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int RULE_HEX_STRING=5;
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


    	private TCHEADERINPUTGrammarAccess grammarAccess;

    	public void setGrammarAccess(TCHEADERINPUTGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleGSSTCHeaderInput"
    // InternalTCHEADERINPUT.g:61:1: entryRuleGSSTCHeaderInput : ruleGSSTCHeaderInput EOF ;
    public final void entryRuleGSSTCHeaderInput() throws RecognitionException {
        try {
            // InternalTCHEADERINPUT.g:62:1: ( ruleGSSTCHeaderInput EOF )
            // InternalTCHEADERINPUT.g:63:1: ruleGSSTCHeaderInput EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSTCHeaderInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGSSTCHeaderInput"


    // $ANTLR start "ruleGSSTCHeaderInput"
    // InternalTCHEADERINPUT.g:70:1: ruleGSSTCHeaderInput : ( ( rule__GSSTCHeaderInput__Group__0 ) ) ;
    public final void ruleGSSTCHeaderInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:74:2: ( ( ( rule__GSSTCHeaderInput__Group__0 ) ) )
            // InternalTCHEADERINPUT.g:75:2: ( ( rule__GSSTCHeaderInput__Group__0 ) )
            {
            // InternalTCHEADERINPUT.g:75:2: ( ( rule__GSSTCHeaderInput__Group__0 ) )
            // InternalTCHEADERINPUT.g:76:3: ( rule__GSSTCHeaderInput__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputAccess().getGroup()); 
            }
            // InternalTCHEADERINPUT.g:77:3: ( rule__GSSTCHeaderInput__Group__0 )
            // InternalTCHEADERINPUT.g:77:4: rule__GSSTCHeaderInput__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInput__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSTCHeaderInput"


    // $ANTLR start "entryRuleGSSTCHeaderInputField"
    // InternalTCHEADERINPUT.g:86:1: entryRuleGSSTCHeaderInputField : ruleGSSTCHeaderInputField EOF ;
    public final void entryRuleGSSTCHeaderInputField() throws RecognitionException {
        try {
            // InternalTCHEADERINPUT.g:87:1: ( ruleGSSTCHeaderInputField EOF )
            // InternalTCHEADERINPUT.g:88:1: ruleGSSTCHeaderInputField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSTCHeaderInputField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputFieldRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGSSTCHeaderInputField"


    // $ANTLR start "ruleGSSTCHeaderInputField"
    // InternalTCHEADERINPUT.g:95:1: ruleGSSTCHeaderInputField : ( ( rule__GSSTCHeaderInputField__Group__0 ) ) ;
    public final void ruleGSSTCHeaderInputField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:99:2: ( ( ( rule__GSSTCHeaderInputField__Group__0 ) ) )
            // InternalTCHEADERINPUT.g:100:2: ( ( rule__GSSTCHeaderInputField__Group__0 ) )
            {
            // InternalTCHEADERINPUT.g:100:2: ( ( rule__GSSTCHeaderInputField__Group__0 ) )
            // InternalTCHEADERINPUT.g:101:3: ( rule__GSSTCHeaderInputField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputFieldAccess().getGroup()); 
            }
            // InternalTCHEADERINPUT.g:102:3: ( rule__GSSTCHeaderInputField__Group__0 )
            // InternalTCHEADERINPUT.g:102:4: rule__GSSTCHeaderInputField__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInputField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSTCHeaderInputField"


    // $ANTLR start "entryRuleTMTCIFFieldValueRaw"
    // InternalTCHEADERINPUT.g:111:1: entryRuleTMTCIFFieldValueRaw : ruleTMTCIFFieldValueRaw EOF ;
    public final void entryRuleTMTCIFFieldValueRaw() throws RecognitionException {
        try {
            // InternalTCHEADERINPUT.g:112:1: ( ruleTMTCIFFieldValueRaw EOF )
            // InternalTCHEADERINPUT.g:113:1: ruleTMTCIFFieldValueRaw EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueRawRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFFieldValueRaw();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueRawRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTMTCIFFieldValueRaw"


    // $ANTLR start "ruleTMTCIFFieldValueRaw"
    // InternalTCHEADERINPUT.g:120:1: ruleTMTCIFFieldValueRaw : ( ( rule__TMTCIFFieldValueRaw__Group__0 ) ) ;
    public final void ruleTMTCIFFieldValueRaw() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:124:2: ( ( ( rule__TMTCIFFieldValueRaw__Group__0 ) ) )
            // InternalTCHEADERINPUT.g:125:2: ( ( rule__TMTCIFFieldValueRaw__Group__0 ) )
            {
            // InternalTCHEADERINPUT.g:125:2: ( ( rule__TMTCIFFieldValueRaw__Group__0 ) )
            // InternalTCHEADERINPUT.g:126:3: ( rule__TMTCIFFieldValueRaw__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueRawAccess().getGroup()); 
            }
            // InternalTCHEADERINPUT.g:127:3: ( rule__TMTCIFFieldValueRaw__Group__0 )
            // InternalTCHEADERINPUT.g:127:4: rule__TMTCIFFieldValueRaw__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueRaw__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueRawAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTMTCIFFieldValueRaw"


    // $ANTLR start "rule__GSSTCHeaderInputField__Alternatives_5"
    // InternalTCHEADERINPUT.g:135:1: rule__GSSTCHeaderInputField__Alternatives_5 : ( ( ( rule__GSSTCHeaderInputField__Group_5_0__0 ) ) | ( '/>' ) );
    public final void rule__GSSTCHeaderInputField__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:139:1: ( ( ( rule__GSSTCHeaderInputField__Group_5_0__0 ) ) | ( '/>' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTCHEADERINPUT.g:140:2: ( ( rule__GSSTCHeaderInputField__Group_5_0__0 ) )
                    {
                    // InternalTCHEADERINPUT.g:140:2: ( ( rule__GSSTCHeaderInputField__Group_5_0__0 ) )
                    // InternalTCHEADERINPUT.g:141:3: ( rule__GSSTCHeaderInputField__Group_5_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSTCHeaderInputFieldAccess().getGroup_5_0()); 
                    }
                    // InternalTCHEADERINPUT.g:142:3: ( rule__GSSTCHeaderInputField__Group_5_0__0 )
                    // InternalTCHEADERINPUT.g:142:4: rule__GSSTCHeaderInputField__Group_5_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTCHeaderInputField__Group_5_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSTCHeaderInputFieldAccess().getGroup_5_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTCHEADERINPUT.g:146:2: ( '/>' )
                    {
                    // InternalTCHEADERINPUT.g:146:2: ( '/>' )
                    // InternalTCHEADERINPUT.g:147:3: '/>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSTCHeaderInputFieldAccess().getSolidusGreaterThanSignKeyword_5_1()); 
                    }
                    match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSTCHeaderInputFieldAccess().getSolidusGreaterThanSignKeyword_5_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInputField__Alternatives_5"


    // $ANTLR start "rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0"
    // InternalTCHEADERINPUT.g:156:1: rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 : ( ( RULE_UINT_STRING ) | ( RULE_HEX_STRING ) );
    public final void rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:160:1: ( ( RULE_UINT_STRING ) | ( RULE_HEX_STRING ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_UINT_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_HEX_STRING) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTCHEADERINPUT.g:161:2: ( RULE_UINT_STRING )
                    {
                    // InternalTCHEADERINPUT.g:161:2: ( RULE_UINT_STRING )
                    // InternalTCHEADERINPUT.g:162:3: RULE_UINT_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFieldValueRawAccess().getValueUINT_STRINGTerminalRuleCall_2_0_0()); 
                    }
                    match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFieldValueRawAccess().getValueUINT_STRINGTerminalRuleCall_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTCHEADERINPUT.g:167:2: ( RULE_HEX_STRING )
                    {
                    // InternalTCHEADERINPUT.g:167:2: ( RULE_HEX_STRING )
                    // InternalTCHEADERINPUT.g:168:3: RULE_HEX_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFieldValueRawAccess().getValueHEX_STRINGTerminalRuleCall_2_0_1()); 
                    }
                    match(input,RULE_HEX_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFieldValueRawAccess().getValueHEX_STRINGTerminalRuleCall_2_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0"


    // $ANTLR start "rule__GSSTCHeaderInput__Group__0"
    // InternalTCHEADERINPUT.g:177:1: rule__GSSTCHeaderInput__Group__0 : rule__GSSTCHeaderInput__Group__0__Impl rule__GSSTCHeaderInput__Group__1 ;
    public final void rule__GSSTCHeaderInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:181:1: ( rule__GSSTCHeaderInput__Group__0__Impl rule__GSSTCHeaderInput__Group__1 )
            // InternalTCHEADERINPUT.g:182:2: rule__GSSTCHeaderInput__Group__0__Impl rule__GSSTCHeaderInput__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__GSSTCHeaderInput__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInput__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__Group__0"


    // $ANTLR start "rule__GSSTCHeaderInput__Group__0__Impl"
    // InternalTCHEADERINPUT.g:189:1: rule__GSSTCHeaderInput__Group__0__Impl : ( '<GSSTCHeaderInput' ) ;
    public final void rule__GSSTCHeaderInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:193:1: ( ( '<GSSTCHeaderInput' ) )
            // InternalTCHEADERINPUT.g:194:1: ( '<GSSTCHeaderInput' )
            {
            // InternalTCHEADERINPUT.g:194:1: ( '<GSSTCHeaderInput' )
            // InternalTCHEADERINPUT.g:195:2: '<GSSTCHeaderInput'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputAccess().getGSSTCHeaderInputKeyword_0()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputAccess().getGSSTCHeaderInputKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__Group__0__Impl"


    // $ANTLR start "rule__GSSTCHeaderInput__Group__1"
    // InternalTCHEADERINPUT.g:204:1: rule__GSSTCHeaderInput__Group__1 : rule__GSSTCHeaderInput__Group__1__Impl rule__GSSTCHeaderInput__Group__2 ;
    public final void rule__GSSTCHeaderInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:208:1: ( rule__GSSTCHeaderInput__Group__1__Impl rule__GSSTCHeaderInput__Group__2 )
            // InternalTCHEADERINPUT.g:209:2: rule__GSSTCHeaderInput__Group__1__Impl rule__GSSTCHeaderInput__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTCHeaderInput__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInput__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__Group__1"


    // $ANTLR start "rule__GSSTCHeaderInput__Group__1__Impl"
    // InternalTCHEADERINPUT.g:216:1: rule__GSSTCHeaderInput__Group__1__Impl : ( 'name=' ) ;
    public final void rule__GSSTCHeaderInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:220:1: ( ( 'name=' ) )
            // InternalTCHEADERINPUT.g:221:1: ( 'name=' )
            {
            // InternalTCHEADERINPUT.g:221:1: ( 'name=' )
            // InternalTCHEADERINPUT.g:222:2: 'name='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputAccess().getNameKeyword_1()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputAccess().getNameKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__Group__1__Impl"


    // $ANTLR start "rule__GSSTCHeaderInput__Group__2"
    // InternalTCHEADERINPUT.g:231:1: rule__GSSTCHeaderInput__Group__2 : rule__GSSTCHeaderInput__Group__2__Impl rule__GSSTCHeaderInput__Group__3 ;
    public final void rule__GSSTCHeaderInput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:235:1: ( rule__GSSTCHeaderInput__Group__2__Impl rule__GSSTCHeaderInput__Group__3 )
            // InternalTCHEADERINPUT.g:236:2: rule__GSSTCHeaderInput__Group__2__Impl rule__GSSTCHeaderInput__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSTCHeaderInput__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInput__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__Group__2"


    // $ANTLR start "rule__GSSTCHeaderInput__Group__2__Impl"
    // InternalTCHEADERINPUT.g:243:1: rule__GSSTCHeaderInput__Group__2__Impl : ( ( rule__GSSTCHeaderInput__NameAssignment_2 ) ) ;
    public final void rule__GSSTCHeaderInput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:247:1: ( ( ( rule__GSSTCHeaderInput__NameAssignment_2 ) ) )
            // InternalTCHEADERINPUT.g:248:1: ( ( rule__GSSTCHeaderInput__NameAssignment_2 ) )
            {
            // InternalTCHEADERINPUT.g:248:1: ( ( rule__GSSTCHeaderInput__NameAssignment_2 ) )
            // InternalTCHEADERINPUT.g:249:2: ( rule__GSSTCHeaderInput__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputAccess().getNameAssignment_2()); 
            }
            // InternalTCHEADERINPUT.g:250:2: ( rule__GSSTCHeaderInput__NameAssignment_2 )
            // InternalTCHEADERINPUT.g:250:3: rule__GSSTCHeaderInput__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInput__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__Group__2__Impl"


    // $ANTLR start "rule__GSSTCHeaderInput__Group__3"
    // InternalTCHEADERINPUT.g:258:1: rule__GSSTCHeaderInput__Group__3 : rule__GSSTCHeaderInput__Group__3__Impl rule__GSSTCHeaderInput__Group__4 ;
    public final void rule__GSSTCHeaderInput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:262:1: ( rule__GSSTCHeaderInput__Group__3__Impl rule__GSSTCHeaderInput__Group__4 )
            // InternalTCHEADERINPUT.g:263:2: rule__GSSTCHeaderInput__Group__3__Impl rule__GSSTCHeaderInput__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSTCHeaderInput__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInput__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__Group__3"


    // $ANTLR start "rule__GSSTCHeaderInput__Group__3__Impl"
    // InternalTCHEADERINPUT.g:270:1: rule__GSSTCHeaderInput__Group__3__Impl : ( '>' ) ;
    public final void rule__GSSTCHeaderInput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:274:1: ( ( '>' ) )
            // InternalTCHEADERINPUT.g:275:1: ( '>' )
            {
            // InternalTCHEADERINPUT.g:275:1: ( '>' )
            // InternalTCHEADERINPUT.g:276:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputAccess().getGreaterThanSignKeyword_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputAccess().getGreaterThanSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__Group__3__Impl"


    // $ANTLR start "rule__GSSTCHeaderInput__Group__4"
    // InternalTCHEADERINPUT.g:285:1: rule__GSSTCHeaderInput__Group__4 : rule__GSSTCHeaderInput__Group__4__Impl rule__GSSTCHeaderInput__Group__5 ;
    public final void rule__GSSTCHeaderInput__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:289:1: ( rule__GSSTCHeaderInput__Group__4__Impl rule__GSSTCHeaderInput__Group__5 )
            // InternalTCHEADERINPUT.g:290:2: rule__GSSTCHeaderInput__Group__4__Impl rule__GSSTCHeaderInput__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSTCHeaderInput__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInput__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__Group__4"


    // $ANTLR start "rule__GSSTCHeaderInput__Group__4__Impl"
    // InternalTCHEADERINPUT.g:297:1: rule__GSSTCHeaderInput__Group__4__Impl : ( '<format' ) ;
    public final void rule__GSSTCHeaderInput__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:301:1: ( ( '<format' ) )
            // InternalTCHEADERINPUT.g:302:1: ( '<format' )
            {
            // InternalTCHEADERINPUT.g:302:1: ( '<format' )
            // InternalTCHEADERINPUT.g:303:2: '<format'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputAccess().getFormatKeyword_4()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputAccess().getFormatKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__Group__4__Impl"


    // $ANTLR start "rule__GSSTCHeaderInput__Group__5"
    // InternalTCHEADERINPUT.g:312:1: rule__GSSTCHeaderInput__Group__5 : rule__GSSTCHeaderInput__Group__5__Impl rule__GSSTCHeaderInput__Group__6 ;
    public final void rule__GSSTCHeaderInput__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:316:1: ( rule__GSSTCHeaderInput__Group__5__Impl rule__GSSTCHeaderInput__Group__6 )
            // InternalTCHEADERINPUT.g:317:2: rule__GSSTCHeaderInput__Group__5__Impl rule__GSSTCHeaderInput__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTCHeaderInput__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInput__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__Group__5"


    // $ANTLR start "rule__GSSTCHeaderInput__Group__5__Impl"
    // InternalTCHEADERINPUT.g:324:1: rule__GSSTCHeaderInput__Group__5__Impl : ( 'file=' ) ;
    public final void rule__GSSTCHeaderInput__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:328:1: ( ( 'file=' ) )
            // InternalTCHEADERINPUT.g:329:1: ( 'file=' )
            {
            // InternalTCHEADERINPUT.g:329:1: ( 'file=' )
            // InternalTCHEADERINPUT.g:330:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputAccess().getFileKeyword_5()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputAccess().getFileKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__Group__5__Impl"


    // $ANTLR start "rule__GSSTCHeaderInput__Group__6"
    // InternalTCHEADERINPUT.g:339:1: rule__GSSTCHeaderInput__Group__6 : rule__GSSTCHeaderInput__Group__6__Impl rule__GSSTCHeaderInput__Group__7 ;
    public final void rule__GSSTCHeaderInput__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:343:1: ( rule__GSSTCHeaderInput__Group__6__Impl rule__GSSTCHeaderInput__Group__7 )
            // InternalTCHEADERINPUT.g:344:2: rule__GSSTCHeaderInput__Group__6__Impl rule__GSSTCHeaderInput__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSTCHeaderInput__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInput__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__Group__6"


    // $ANTLR start "rule__GSSTCHeaderInput__Group__6__Impl"
    // InternalTCHEADERINPUT.g:351:1: rule__GSSTCHeaderInput__Group__6__Impl : ( ( rule__GSSTCHeaderInput__FormatAssignment_6 ) ) ;
    public final void rule__GSSTCHeaderInput__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:355:1: ( ( ( rule__GSSTCHeaderInput__FormatAssignment_6 ) ) )
            // InternalTCHEADERINPUT.g:356:1: ( ( rule__GSSTCHeaderInput__FormatAssignment_6 ) )
            {
            // InternalTCHEADERINPUT.g:356:1: ( ( rule__GSSTCHeaderInput__FormatAssignment_6 ) )
            // InternalTCHEADERINPUT.g:357:2: ( rule__GSSTCHeaderInput__FormatAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputAccess().getFormatAssignment_6()); 
            }
            // InternalTCHEADERINPUT.g:358:2: ( rule__GSSTCHeaderInput__FormatAssignment_6 )
            // InternalTCHEADERINPUT.g:358:3: rule__GSSTCHeaderInput__FormatAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInput__FormatAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputAccess().getFormatAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__Group__6__Impl"


    // $ANTLR start "rule__GSSTCHeaderInput__Group__7"
    // InternalTCHEADERINPUT.g:366:1: rule__GSSTCHeaderInput__Group__7 : rule__GSSTCHeaderInput__Group__7__Impl rule__GSSTCHeaderInput__Group__8 ;
    public final void rule__GSSTCHeaderInput__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:370:1: ( rule__GSSTCHeaderInput__Group__7__Impl rule__GSSTCHeaderInput__Group__8 )
            // InternalTCHEADERINPUT.g:371:2: rule__GSSTCHeaderInput__Group__7__Impl rule__GSSTCHeaderInput__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSTCHeaderInput__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInput__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__Group__7"


    // $ANTLR start "rule__GSSTCHeaderInput__Group__7__Impl"
    // InternalTCHEADERINPUT.g:378:1: rule__GSSTCHeaderInput__Group__7__Impl : ( '/>' ) ;
    public final void rule__GSSTCHeaderInput__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:382:1: ( ( '/>' ) )
            // InternalTCHEADERINPUT.g:383:1: ( '/>' )
            {
            // InternalTCHEADERINPUT.g:383:1: ( '/>' )
            // InternalTCHEADERINPUT.g:384:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputAccess().getSolidusGreaterThanSignKeyword_7()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputAccess().getSolidusGreaterThanSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__Group__7__Impl"


    // $ANTLR start "rule__GSSTCHeaderInput__Group__8"
    // InternalTCHEADERINPUT.g:393:1: rule__GSSTCHeaderInput__Group__8 : rule__GSSTCHeaderInput__Group__8__Impl rule__GSSTCHeaderInput__Group__9 ;
    public final void rule__GSSTCHeaderInput__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:397:1: ( rule__GSSTCHeaderInput__Group__8__Impl rule__GSSTCHeaderInput__Group__9 )
            // InternalTCHEADERINPUT.g:398:2: rule__GSSTCHeaderInput__Group__8__Impl rule__GSSTCHeaderInput__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSTCHeaderInput__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInput__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__Group__8"


    // $ANTLR start "rule__GSSTCHeaderInput__Group__8__Impl"
    // InternalTCHEADERINPUT.g:405:1: rule__GSSTCHeaderInput__Group__8__Impl : ( ( rule__GSSTCHeaderInput__Group_8__0 )? ) ;
    public final void rule__GSSTCHeaderInput__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:409:1: ( ( ( rule__GSSTCHeaderInput__Group_8__0 )? ) )
            // InternalTCHEADERINPUT.g:410:1: ( ( rule__GSSTCHeaderInput__Group_8__0 )? )
            {
            // InternalTCHEADERINPUT.g:410:1: ( ( rule__GSSTCHeaderInput__Group_8__0 )? )
            // InternalTCHEADERINPUT.g:411:2: ( rule__GSSTCHeaderInput__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputAccess().getGroup_8()); 
            }
            // InternalTCHEADERINPUT.g:412:2: ( rule__GSSTCHeaderInput__Group_8__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTCHEADERINPUT.g:412:3: rule__GSSTCHeaderInput__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTCHeaderInput__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputAccess().getGroup_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__Group__8__Impl"


    // $ANTLR start "rule__GSSTCHeaderInput__Group__9"
    // InternalTCHEADERINPUT.g:420:1: rule__GSSTCHeaderInput__Group__9 : rule__GSSTCHeaderInput__Group__9__Impl ;
    public final void rule__GSSTCHeaderInput__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:424:1: ( rule__GSSTCHeaderInput__Group__9__Impl )
            // InternalTCHEADERINPUT.g:425:2: rule__GSSTCHeaderInput__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInput__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__Group__9"


    // $ANTLR start "rule__GSSTCHeaderInput__Group__9__Impl"
    // InternalTCHEADERINPUT.g:431:1: rule__GSSTCHeaderInput__Group__9__Impl : ( '</GSSTCHeaderInput>' ) ;
    public final void rule__GSSTCHeaderInput__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:435:1: ( ( '</GSSTCHeaderInput>' ) )
            // InternalTCHEADERINPUT.g:436:1: ( '</GSSTCHeaderInput>' )
            {
            // InternalTCHEADERINPUT.g:436:1: ( '</GSSTCHeaderInput>' )
            // InternalTCHEADERINPUT.g:437:2: '</GSSTCHeaderInput>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputAccess().getGSSTCHeaderInputKeyword_9()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputAccess().getGSSTCHeaderInputKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__Group__9__Impl"


    // $ANTLR start "rule__GSSTCHeaderInput__Group_8__0"
    // InternalTCHEADERINPUT.g:447:1: rule__GSSTCHeaderInput__Group_8__0 : rule__GSSTCHeaderInput__Group_8__0__Impl rule__GSSTCHeaderInput__Group_8__1 ;
    public final void rule__GSSTCHeaderInput__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:451:1: ( rule__GSSTCHeaderInput__Group_8__0__Impl rule__GSSTCHeaderInput__Group_8__1 )
            // InternalTCHEADERINPUT.g:452:2: rule__GSSTCHeaderInput__Group_8__0__Impl rule__GSSTCHeaderInput__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTCHeaderInput__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInput__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__Group_8__0"


    // $ANTLR start "rule__GSSTCHeaderInput__Group_8__0__Impl"
    // InternalTCHEADERINPUT.g:459:1: rule__GSSTCHeaderInput__Group_8__0__Impl : ( '<fields>' ) ;
    public final void rule__GSSTCHeaderInput__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:463:1: ( ( '<fields>' ) )
            // InternalTCHEADERINPUT.g:464:1: ( '<fields>' )
            {
            // InternalTCHEADERINPUT.g:464:1: ( '<fields>' )
            // InternalTCHEADERINPUT.g:465:2: '<fields>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputAccess().getFieldsKeyword_8_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputAccess().getFieldsKeyword_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__Group_8__0__Impl"


    // $ANTLR start "rule__GSSTCHeaderInput__Group_8__1"
    // InternalTCHEADERINPUT.g:474:1: rule__GSSTCHeaderInput__Group_8__1 : rule__GSSTCHeaderInput__Group_8__1__Impl rule__GSSTCHeaderInput__Group_8__2 ;
    public final void rule__GSSTCHeaderInput__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:478:1: ( rule__GSSTCHeaderInput__Group_8__1__Impl rule__GSSTCHeaderInput__Group_8__2 )
            // InternalTCHEADERINPUT.g:479:2: rule__GSSTCHeaderInput__Group_8__1__Impl rule__GSSTCHeaderInput__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTCHeaderInput__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInput__Group_8__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__Group_8__1"


    // $ANTLR start "rule__GSSTCHeaderInput__Group_8__1__Impl"
    // InternalTCHEADERINPUT.g:486:1: rule__GSSTCHeaderInput__Group_8__1__Impl : ( ( ( rule__GSSTCHeaderInput__GssHeaderFieldsAssignment_8_1 ) ) ( ( rule__GSSTCHeaderInput__GssHeaderFieldsAssignment_8_1 )* ) ) ;
    public final void rule__GSSTCHeaderInput__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:490:1: ( ( ( ( rule__GSSTCHeaderInput__GssHeaderFieldsAssignment_8_1 ) ) ( ( rule__GSSTCHeaderInput__GssHeaderFieldsAssignment_8_1 )* ) ) )
            // InternalTCHEADERINPUT.g:491:1: ( ( ( rule__GSSTCHeaderInput__GssHeaderFieldsAssignment_8_1 ) ) ( ( rule__GSSTCHeaderInput__GssHeaderFieldsAssignment_8_1 )* ) )
            {
            // InternalTCHEADERINPUT.g:491:1: ( ( ( rule__GSSTCHeaderInput__GssHeaderFieldsAssignment_8_1 ) ) ( ( rule__GSSTCHeaderInput__GssHeaderFieldsAssignment_8_1 )* ) )
            // InternalTCHEADERINPUT.g:492:2: ( ( rule__GSSTCHeaderInput__GssHeaderFieldsAssignment_8_1 ) ) ( ( rule__GSSTCHeaderInput__GssHeaderFieldsAssignment_8_1 )* )
            {
            // InternalTCHEADERINPUT.g:492:2: ( ( rule__GSSTCHeaderInput__GssHeaderFieldsAssignment_8_1 ) )
            // InternalTCHEADERINPUT.g:493:3: ( rule__GSSTCHeaderInput__GssHeaderFieldsAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputAccess().getGssHeaderFieldsAssignment_8_1()); 
            }
            // InternalTCHEADERINPUT.g:494:3: ( rule__GSSTCHeaderInput__GssHeaderFieldsAssignment_8_1 )
            // InternalTCHEADERINPUT.g:494:4: rule__GSSTCHeaderInput__GssHeaderFieldsAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTCHeaderInput__GssHeaderFieldsAssignment_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputAccess().getGssHeaderFieldsAssignment_8_1()); 
            }

            }

            // InternalTCHEADERINPUT.g:497:2: ( ( rule__GSSTCHeaderInput__GssHeaderFieldsAssignment_8_1 )* )
            // InternalTCHEADERINPUT.g:498:3: ( rule__GSSTCHeaderInput__GssHeaderFieldsAssignment_8_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputAccess().getGssHeaderFieldsAssignment_8_1()); 
            }
            // InternalTCHEADERINPUT.g:499:3: ( rule__GSSTCHeaderInput__GssHeaderFieldsAssignment_8_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTCHEADERINPUT.g:499:4: rule__GSSTCHeaderInput__GssHeaderFieldsAssignment_8_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    rule__GSSTCHeaderInput__GssHeaderFieldsAssignment_8_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputAccess().getGssHeaderFieldsAssignment_8_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__Group_8__1__Impl"


    // $ANTLR start "rule__GSSTCHeaderInput__Group_8__2"
    // InternalTCHEADERINPUT.g:508:1: rule__GSSTCHeaderInput__Group_8__2 : rule__GSSTCHeaderInput__Group_8__2__Impl ;
    public final void rule__GSSTCHeaderInput__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:512:1: ( rule__GSSTCHeaderInput__Group_8__2__Impl )
            // InternalTCHEADERINPUT.g:513:2: rule__GSSTCHeaderInput__Group_8__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInput__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__Group_8__2"


    // $ANTLR start "rule__GSSTCHeaderInput__Group_8__2__Impl"
    // InternalTCHEADERINPUT.g:519:1: rule__GSSTCHeaderInput__Group_8__2__Impl : ( '</fields>' ) ;
    public final void rule__GSSTCHeaderInput__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:523:1: ( ( '</fields>' ) )
            // InternalTCHEADERINPUT.g:524:1: ( '</fields>' )
            {
            // InternalTCHEADERINPUT.g:524:1: ( '</fields>' )
            // InternalTCHEADERINPUT.g:525:2: '</fields>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputAccess().getFieldsKeyword_8_2()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputAccess().getFieldsKeyword_8_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__Group_8__2__Impl"


    // $ANTLR start "rule__GSSTCHeaderInputField__Group__0"
    // InternalTCHEADERINPUT.g:535:1: rule__GSSTCHeaderInputField__Group__0 : rule__GSSTCHeaderInputField__Group__0__Impl rule__GSSTCHeaderInputField__Group__1 ;
    public final void rule__GSSTCHeaderInputField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:539:1: ( rule__GSSTCHeaderInputField__Group__0__Impl rule__GSSTCHeaderInputField__Group__1 )
            // InternalTCHEADERINPUT.g:540:2: rule__GSSTCHeaderInputField__Group__0__Impl rule__GSSTCHeaderInputField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__GSSTCHeaderInputField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInputField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInputField__Group__0"


    // $ANTLR start "rule__GSSTCHeaderInputField__Group__0__Impl"
    // InternalTCHEADERINPUT.g:547:1: rule__GSSTCHeaderInputField__Group__0__Impl : ( '<HeaderField' ) ;
    public final void rule__GSSTCHeaderInputField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:551:1: ( ( '<HeaderField' ) )
            // InternalTCHEADERINPUT.g:552:1: ( '<HeaderField' )
            {
            // InternalTCHEADERINPUT.g:552:1: ( '<HeaderField' )
            // InternalTCHEADERINPUT.g:553:2: '<HeaderField'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputFieldAccess().getHeaderFieldKeyword_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputFieldAccess().getHeaderFieldKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInputField__Group__0__Impl"


    // $ANTLR start "rule__GSSTCHeaderInputField__Group__1"
    // InternalTCHEADERINPUT.g:562:1: rule__GSSTCHeaderInputField__Group__1 : rule__GSSTCHeaderInputField__Group__1__Impl rule__GSSTCHeaderInputField__Group__2 ;
    public final void rule__GSSTCHeaderInputField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:566:1: ( rule__GSSTCHeaderInputField__Group__1__Impl rule__GSSTCHeaderInputField__Group__2 )
            // InternalTCHEADERINPUT.g:567:2: rule__GSSTCHeaderInputField__Group__1__Impl rule__GSSTCHeaderInputField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTCHeaderInputField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInputField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInputField__Group__1"


    // $ANTLR start "rule__GSSTCHeaderInputField__Group__1__Impl"
    // InternalTCHEADERINPUT.g:574:1: rule__GSSTCHeaderInputField__Group__1__Impl : ( 'name=' ) ;
    public final void rule__GSSTCHeaderInputField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:578:1: ( ( 'name=' ) )
            // InternalTCHEADERINPUT.g:579:1: ( 'name=' )
            {
            // InternalTCHEADERINPUT.g:579:1: ( 'name=' )
            // InternalTCHEADERINPUT.g:580:2: 'name='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputFieldAccess().getNameKeyword_1()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputFieldAccess().getNameKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInputField__Group__1__Impl"


    // $ANTLR start "rule__GSSTCHeaderInputField__Group__2"
    // InternalTCHEADERINPUT.g:589:1: rule__GSSTCHeaderInputField__Group__2 : rule__GSSTCHeaderInputField__Group__2__Impl rule__GSSTCHeaderInputField__Group__3 ;
    public final void rule__GSSTCHeaderInputField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:593:1: ( rule__GSSTCHeaderInputField__Group__2__Impl rule__GSSTCHeaderInputField__Group__3 )
            // InternalTCHEADERINPUT.g:594:2: rule__GSSTCHeaderInputField__Group__2__Impl rule__GSSTCHeaderInputField__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__GSSTCHeaderInputField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInputField__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInputField__Group__2"


    // $ANTLR start "rule__GSSTCHeaderInputField__Group__2__Impl"
    // InternalTCHEADERINPUT.g:601:1: rule__GSSTCHeaderInputField__Group__2__Impl : ( ( rule__GSSTCHeaderInputField__NameAssignment_2 ) ) ;
    public final void rule__GSSTCHeaderInputField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:605:1: ( ( ( rule__GSSTCHeaderInputField__NameAssignment_2 ) ) )
            // InternalTCHEADERINPUT.g:606:1: ( ( rule__GSSTCHeaderInputField__NameAssignment_2 ) )
            {
            // InternalTCHEADERINPUT.g:606:1: ( ( rule__GSSTCHeaderInputField__NameAssignment_2 ) )
            // InternalTCHEADERINPUT.g:607:2: ( rule__GSSTCHeaderInputField__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputFieldAccess().getNameAssignment_2()); 
            }
            // InternalTCHEADERINPUT.g:608:2: ( rule__GSSTCHeaderInputField__NameAssignment_2 )
            // InternalTCHEADERINPUT.g:608:3: rule__GSSTCHeaderInputField__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInputField__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputFieldAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInputField__Group__2__Impl"


    // $ANTLR start "rule__GSSTCHeaderInputField__Group__3"
    // InternalTCHEADERINPUT.g:616:1: rule__GSSTCHeaderInputField__Group__3 : rule__GSSTCHeaderInputField__Group__3__Impl rule__GSSTCHeaderInputField__Group__4 ;
    public final void rule__GSSTCHeaderInputField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:620:1: ( rule__GSSTCHeaderInputField__Group__3__Impl rule__GSSTCHeaderInputField__Group__4 )
            // InternalTCHEADERINPUT.g:621:2: rule__GSSTCHeaderInputField__Group__3__Impl rule__GSSTCHeaderInputField__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTCHeaderInputField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInputField__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInputField__Group__3"


    // $ANTLR start "rule__GSSTCHeaderInputField__Group__3__Impl"
    // InternalTCHEADERINPUT.g:628:1: rule__GSSTCHeaderInputField__Group__3__Impl : ( 'gssHeaderField=' ) ;
    public final void rule__GSSTCHeaderInputField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:632:1: ( ( 'gssHeaderField=' ) )
            // InternalTCHEADERINPUT.g:633:1: ( 'gssHeaderField=' )
            {
            // InternalTCHEADERINPUT.g:633:1: ( 'gssHeaderField=' )
            // InternalTCHEADERINPUT.g:634:2: 'gssHeaderField='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputFieldAccess().getGssHeaderFieldKeyword_3()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputFieldAccess().getGssHeaderFieldKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInputField__Group__3__Impl"


    // $ANTLR start "rule__GSSTCHeaderInputField__Group__4"
    // InternalTCHEADERINPUT.g:643:1: rule__GSSTCHeaderInputField__Group__4 : rule__GSSTCHeaderInputField__Group__4__Impl rule__GSSTCHeaderInputField__Group__5 ;
    public final void rule__GSSTCHeaderInputField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:647:1: ( rule__GSSTCHeaderInputField__Group__4__Impl rule__GSSTCHeaderInputField__Group__5 )
            // InternalTCHEADERINPUT.g:648:2: rule__GSSTCHeaderInputField__Group__4__Impl rule__GSSTCHeaderInputField__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__GSSTCHeaderInputField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInputField__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInputField__Group__4"


    // $ANTLR start "rule__GSSTCHeaderInputField__Group__4__Impl"
    // InternalTCHEADERINPUT.g:655:1: rule__GSSTCHeaderInputField__Group__4__Impl : ( ( rule__GSSTCHeaderInputField__GssHeaderFieldAssignment_4 ) ) ;
    public final void rule__GSSTCHeaderInputField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:659:1: ( ( ( rule__GSSTCHeaderInputField__GssHeaderFieldAssignment_4 ) ) )
            // InternalTCHEADERINPUT.g:660:1: ( ( rule__GSSTCHeaderInputField__GssHeaderFieldAssignment_4 ) )
            {
            // InternalTCHEADERINPUT.g:660:1: ( ( rule__GSSTCHeaderInputField__GssHeaderFieldAssignment_4 ) )
            // InternalTCHEADERINPUT.g:661:2: ( rule__GSSTCHeaderInputField__GssHeaderFieldAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputFieldAccess().getGssHeaderFieldAssignment_4()); 
            }
            // InternalTCHEADERINPUT.g:662:2: ( rule__GSSTCHeaderInputField__GssHeaderFieldAssignment_4 )
            // InternalTCHEADERINPUT.g:662:3: rule__GSSTCHeaderInputField__GssHeaderFieldAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInputField__GssHeaderFieldAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputFieldAccess().getGssHeaderFieldAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInputField__Group__4__Impl"


    // $ANTLR start "rule__GSSTCHeaderInputField__Group__5"
    // InternalTCHEADERINPUT.g:670:1: rule__GSSTCHeaderInputField__Group__5 : rule__GSSTCHeaderInputField__Group__5__Impl ;
    public final void rule__GSSTCHeaderInputField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:674:1: ( rule__GSSTCHeaderInputField__Group__5__Impl )
            // InternalTCHEADERINPUT.g:675:2: rule__GSSTCHeaderInputField__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInputField__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInputField__Group__5"


    // $ANTLR start "rule__GSSTCHeaderInputField__Group__5__Impl"
    // InternalTCHEADERINPUT.g:681:1: rule__GSSTCHeaderInputField__Group__5__Impl : ( ( rule__GSSTCHeaderInputField__Alternatives_5 ) ) ;
    public final void rule__GSSTCHeaderInputField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:685:1: ( ( ( rule__GSSTCHeaderInputField__Alternatives_5 ) ) )
            // InternalTCHEADERINPUT.g:686:1: ( ( rule__GSSTCHeaderInputField__Alternatives_5 ) )
            {
            // InternalTCHEADERINPUT.g:686:1: ( ( rule__GSSTCHeaderInputField__Alternatives_5 ) )
            // InternalTCHEADERINPUT.g:687:2: ( rule__GSSTCHeaderInputField__Alternatives_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputFieldAccess().getAlternatives_5()); 
            }
            // InternalTCHEADERINPUT.g:688:2: ( rule__GSSTCHeaderInputField__Alternatives_5 )
            // InternalTCHEADERINPUT.g:688:3: rule__GSSTCHeaderInputField__Alternatives_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInputField__Alternatives_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputFieldAccess().getAlternatives_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInputField__Group__5__Impl"


    // $ANTLR start "rule__GSSTCHeaderInputField__Group_5_0__0"
    // InternalTCHEADERINPUT.g:697:1: rule__GSSTCHeaderInputField__Group_5_0__0 : rule__GSSTCHeaderInputField__Group_5_0__0__Impl rule__GSSTCHeaderInputField__Group_5_0__1 ;
    public final void rule__GSSTCHeaderInputField__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:701:1: ( rule__GSSTCHeaderInputField__Group_5_0__0__Impl rule__GSSTCHeaderInputField__Group_5_0__1 )
            // InternalTCHEADERINPUT.g:702:2: rule__GSSTCHeaderInputField__Group_5_0__0__Impl rule__GSSTCHeaderInputField__Group_5_0__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__GSSTCHeaderInputField__Group_5_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInputField__Group_5_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInputField__Group_5_0__0"


    // $ANTLR start "rule__GSSTCHeaderInputField__Group_5_0__0__Impl"
    // InternalTCHEADERINPUT.g:709:1: rule__GSSTCHeaderInputField__Group_5_0__0__Impl : ( '>' ) ;
    public final void rule__GSSTCHeaderInputField__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:713:1: ( ( '>' ) )
            // InternalTCHEADERINPUT.g:714:1: ( '>' )
            {
            // InternalTCHEADERINPUT.g:714:1: ( '>' )
            // InternalTCHEADERINPUT.g:715:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputFieldAccess().getGreaterThanSignKeyword_5_0_0()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputFieldAccess().getGreaterThanSignKeyword_5_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInputField__Group_5_0__0__Impl"


    // $ANTLR start "rule__GSSTCHeaderInputField__Group_5_0__1"
    // InternalTCHEADERINPUT.g:724:1: rule__GSSTCHeaderInputField__Group_5_0__1 : rule__GSSTCHeaderInputField__Group_5_0__1__Impl rule__GSSTCHeaderInputField__Group_5_0__2 ;
    public final void rule__GSSTCHeaderInputField__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:728:1: ( rule__GSSTCHeaderInputField__Group_5_0__1__Impl rule__GSSTCHeaderInputField__Group_5_0__2 )
            // InternalTCHEADERINPUT.g:729:2: rule__GSSTCHeaderInputField__Group_5_0__1__Impl rule__GSSTCHeaderInputField__Group_5_0__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__GSSTCHeaderInputField__Group_5_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInputField__Group_5_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInputField__Group_5_0__1"


    // $ANTLR start "rule__GSSTCHeaderInputField__Group_5_0__1__Impl"
    // InternalTCHEADERINPUT.g:736:1: rule__GSSTCHeaderInputField__Group_5_0__1__Impl : ( ( rule__GSSTCHeaderInputField__FieldValueAssignment_5_0_1 ) ) ;
    public final void rule__GSSTCHeaderInputField__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:740:1: ( ( ( rule__GSSTCHeaderInputField__FieldValueAssignment_5_0_1 ) ) )
            // InternalTCHEADERINPUT.g:741:1: ( ( rule__GSSTCHeaderInputField__FieldValueAssignment_5_0_1 ) )
            {
            // InternalTCHEADERINPUT.g:741:1: ( ( rule__GSSTCHeaderInputField__FieldValueAssignment_5_0_1 ) )
            // InternalTCHEADERINPUT.g:742:2: ( rule__GSSTCHeaderInputField__FieldValueAssignment_5_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputFieldAccess().getFieldValueAssignment_5_0_1()); 
            }
            // InternalTCHEADERINPUT.g:743:2: ( rule__GSSTCHeaderInputField__FieldValueAssignment_5_0_1 )
            // InternalTCHEADERINPUT.g:743:3: rule__GSSTCHeaderInputField__FieldValueAssignment_5_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInputField__FieldValueAssignment_5_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputFieldAccess().getFieldValueAssignment_5_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInputField__Group_5_0__1__Impl"


    // $ANTLR start "rule__GSSTCHeaderInputField__Group_5_0__2"
    // InternalTCHEADERINPUT.g:751:1: rule__GSSTCHeaderInputField__Group_5_0__2 : rule__GSSTCHeaderInputField__Group_5_0__2__Impl ;
    public final void rule__GSSTCHeaderInputField__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:755:1: ( rule__GSSTCHeaderInputField__Group_5_0__2__Impl )
            // InternalTCHEADERINPUT.g:756:2: rule__GSSTCHeaderInputField__Group_5_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCHeaderInputField__Group_5_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInputField__Group_5_0__2"


    // $ANTLR start "rule__GSSTCHeaderInputField__Group_5_0__2__Impl"
    // InternalTCHEADERINPUT.g:762:1: rule__GSSTCHeaderInputField__Group_5_0__2__Impl : ( '</HeaderField>' ) ;
    public final void rule__GSSTCHeaderInputField__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:766:1: ( ( '</HeaderField>' ) )
            // InternalTCHEADERINPUT.g:767:1: ( '</HeaderField>' )
            {
            // InternalTCHEADERINPUT.g:767:1: ( '</HeaderField>' )
            // InternalTCHEADERINPUT.g:768:2: '</HeaderField>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputFieldAccess().getHeaderFieldKeyword_5_0_2()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputFieldAccess().getHeaderFieldKeyword_5_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInputField__Group_5_0__2__Impl"


    // $ANTLR start "rule__TMTCIFFieldValueRaw__Group__0"
    // InternalTCHEADERINPUT.g:778:1: rule__TMTCIFFieldValueRaw__Group__0 : rule__TMTCIFFieldValueRaw__Group__0__Impl rule__TMTCIFFieldValueRaw__Group__1 ;
    public final void rule__TMTCIFFieldValueRaw__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:782:1: ( rule__TMTCIFFieldValueRaw__Group__0__Impl rule__TMTCIFFieldValueRaw__Group__1 )
            // InternalTCHEADERINPUT.g:783:2: rule__TMTCIFFieldValueRaw__Group__0__Impl rule__TMTCIFFieldValueRaw__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__TMTCIFFieldValueRaw__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueRaw__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueRaw__Group__0"


    // $ANTLR start "rule__TMTCIFFieldValueRaw__Group__0__Impl"
    // InternalTCHEADERINPUT.g:790:1: rule__TMTCIFFieldValueRaw__Group__0__Impl : ( '<FieldValueRaw' ) ;
    public final void rule__TMTCIFFieldValueRaw__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:794:1: ( ( '<FieldValueRaw' ) )
            // InternalTCHEADERINPUT.g:795:1: ( '<FieldValueRaw' )
            {
            // InternalTCHEADERINPUT.g:795:1: ( '<FieldValueRaw' )
            // InternalTCHEADERINPUT.g:796:2: '<FieldValueRaw'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueRawAccess().getFieldValueRawKeyword_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueRawAccess().getFieldValueRawKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueRaw__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFFieldValueRaw__Group__1"
    // InternalTCHEADERINPUT.g:805:1: rule__TMTCIFFieldValueRaw__Group__1 : rule__TMTCIFFieldValueRaw__Group__1__Impl rule__TMTCIFFieldValueRaw__Group__2 ;
    public final void rule__TMTCIFFieldValueRaw__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:809:1: ( rule__TMTCIFFieldValueRaw__Group__1__Impl rule__TMTCIFFieldValueRaw__Group__2 )
            // InternalTCHEADERINPUT.g:810:2: rule__TMTCIFFieldValueRaw__Group__1__Impl rule__TMTCIFFieldValueRaw__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__TMTCIFFieldValueRaw__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueRaw__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueRaw__Group__1"


    // $ANTLR start "rule__TMTCIFFieldValueRaw__Group__1__Impl"
    // InternalTCHEADERINPUT.g:817:1: rule__TMTCIFFieldValueRaw__Group__1__Impl : ( 'value=' ) ;
    public final void rule__TMTCIFFieldValueRaw__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:821:1: ( ( 'value=' ) )
            // InternalTCHEADERINPUT.g:822:1: ( 'value=' )
            {
            // InternalTCHEADERINPUT.g:822:1: ( 'value=' )
            // InternalTCHEADERINPUT.g:823:2: 'value='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueRawAccess().getValueKeyword_1()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueRawAccess().getValueKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueRaw__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFFieldValueRaw__Group__2"
    // InternalTCHEADERINPUT.g:832:1: rule__TMTCIFFieldValueRaw__Group__2 : rule__TMTCIFFieldValueRaw__Group__2__Impl rule__TMTCIFFieldValueRaw__Group__3 ;
    public final void rule__TMTCIFFieldValueRaw__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:836:1: ( rule__TMTCIFFieldValueRaw__Group__2__Impl rule__TMTCIFFieldValueRaw__Group__3 )
            // InternalTCHEADERINPUT.g:837:2: rule__TMTCIFFieldValueRaw__Group__2__Impl rule__TMTCIFFieldValueRaw__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFFieldValueRaw__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueRaw__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueRaw__Group__2"


    // $ANTLR start "rule__TMTCIFFieldValueRaw__Group__2__Impl"
    // InternalTCHEADERINPUT.g:844:1: rule__TMTCIFFieldValueRaw__Group__2__Impl : ( ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 ) ) ;
    public final void rule__TMTCIFFieldValueRaw__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:848:1: ( ( ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 ) ) )
            // InternalTCHEADERINPUT.g:849:1: ( ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 ) )
            {
            // InternalTCHEADERINPUT.g:849:1: ( ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 ) )
            // InternalTCHEADERINPUT.g:850:2: ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAssignment_2()); 
            }
            // InternalTCHEADERINPUT.g:851:2: ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 )
            // InternalTCHEADERINPUT.g:851:3: rule__TMTCIFFieldValueRaw__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueRaw__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueRaw__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFFieldValueRaw__Group__3"
    // InternalTCHEADERINPUT.g:859:1: rule__TMTCIFFieldValueRaw__Group__3 : rule__TMTCIFFieldValueRaw__Group__3__Impl ;
    public final void rule__TMTCIFFieldValueRaw__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:863:1: ( rule__TMTCIFFieldValueRaw__Group__3__Impl )
            // InternalTCHEADERINPUT.g:864:2: rule__TMTCIFFieldValueRaw__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueRaw__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueRaw__Group__3"


    // $ANTLR start "rule__TMTCIFFieldValueRaw__Group__3__Impl"
    // InternalTCHEADERINPUT.g:870:1: rule__TMTCIFFieldValueRaw__Group__3__Impl : ( '/>' ) ;
    public final void rule__TMTCIFFieldValueRaw__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:874:1: ( ( '/>' ) )
            // InternalTCHEADERINPUT.g:875:1: ( '/>' )
            {
            // InternalTCHEADERINPUT.g:875:1: ( '/>' )
            // InternalTCHEADERINPUT.g:876:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueRawAccess().getSolidusGreaterThanSignKeyword_3()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueRawAccess().getSolidusGreaterThanSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueRaw__Group__3__Impl"


    // $ANTLR start "rule__GSSTCHeaderInput__NameAssignment_2"
    // InternalTCHEADERINPUT.g:886:1: rule__GSSTCHeaderInput__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GSSTCHeaderInput__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:890:1: ( ( RULE_STRING ) )
            // InternalTCHEADERINPUT.g:891:2: ( RULE_STRING )
            {
            // InternalTCHEADERINPUT.g:891:2: ( RULE_STRING )
            // InternalTCHEADERINPUT.g:892:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__NameAssignment_2"


    // $ANTLR start "rule__GSSTCHeaderInput__FormatAssignment_6"
    // InternalTCHEADERINPUT.g:901:1: rule__GSSTCHeaderInput__FormatAssignment_6 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTCHeaderInput__FormatAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:905:1: ( ( ( RULE_STRING ) ) )
            // InternalTCHEADERINPUT.g:906:2: ( ( RULE_STRING ) )
            {
            // InternalTCHEADERINPUT.g:906:2: ( ( RULE_STRING ) )
            // InternalTCHEADERINPUT.g:907:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputAccess().getFormatGSSFormatFormatCrossReference_6_0()); 
            }
            // InternalTCHEADERINPUT.g:908:3: ( RULE_STRING )
            // InternalTCHEADERINPUT.g:909:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputAccess().getFormatGSSFormatFormatSTRINGTerminalRuleCall_6_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputAccess().getFormatGSSFormatFormatSTRINGTerminalRuleCall_6_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputAccess().getFormatGSSFormatFormatCrossReference_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__FormatAssignment_6"


    // $ANTLR start "rule__GSSTCHeaderInput__GssHeaderFieldsAssignment_8_1"
    // InternalTCHEADERINPUT.g:920:1: rule__GSSTCHeaderInput__GssHeaderFieldsAssignment_8_1 : ( ruleGSSTCHeaderInputField ) ;
    public final void rule__GSSTCHeaderInput__GssHeaderFieldsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:924:1: ( ( ruleGSSTCHeaderInputField ) )
            // InternalTCHEADERINPUT.g:925:2: ( ruleGSSTCHeaderInputField )
            {
            // InternalTCHEADERINPUT.g:925:2: ( ruleGSSTCHeaderInputField )
            // InternalTCHEADERINPUT.g:926:3: ruleGSSTCHeaderInputField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputAccess().getGssHeaderFieldsGSSTCHeaderInputFieldParserRuleCall_8_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSTCHeaderInputField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputAccess().getGssHeaderFieldsGSSTCHeaderInputFieldParserRuleCall_8_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInput__GssHeaderFieldsAssignment_8_1"


    // $ANTLR start "rule__GSSTCHeaderInputField__NameAssignment_2"
    // InternalTCHEADERINPUT.g:935:1: rule__GSSTCHeaderInputField__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GSSTCHeaderInputField__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:939:1: ( ( RULE_STRING ) )
            // InternalTCHEADERINPUT.g:940:2: ( RULE_STRING )
            {
            // InternalTCHEADERINPUT.g:940:2: ( RULE_STRING )
            // InternalTCHEADERINPUT.g:941:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputFieldAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputFieldAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInputField__NameAssignment_2"


    // $ANTLR start "rule__GSSTCHeaderInputField__GssHeaderFieldAssignment_4"
    // InternalTCHEADERINPUT.g:950:1: rule__GSSTCHeaderInputField__GssHeaderFieldAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTCHeaderInputField__GssHeaderFieldAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:954:1: ( ( ( RULE_STRING ) ) )
            // InternalTCHEADERINPUT.g:955:2: ( ( RULE_STRING ) )
            {
            // InternalTCHEADERINPUT.g:955:2: ( ( RULE_STRING ) )
            // InternalTCHEADERINPUT.g:956:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputFieldAccess().getGssHeaderFieldGSSFormatFieldCrossReference_4_0()); 
            }
            // InternalTCHEADERINPUT.g:957:3: ( RULE_STRING )
            // InternalTCHEADERINPUT.g:958:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputFieldAccess().getGssHeaderFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputFieldAccess().getGssHeaderFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputFieldAccess().getGssHeaderFieldGSSFormatFieldCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInputField__GssHeaderFieldAssignment_4"


    // $ANTLR start "rule__GSSTCHeaderInputField__FieldValueAssignment_5_0_1"
    // InternalTCHEADERINPUT.g:969:1: rule__GSSTCHeaderInputField__FieldValueAssignment_5_0_1 : ( ruleTMTCIFFieldValueRaw ) ;
    public final void rule__GSSTCHeaderInputField__FieldValueAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:973:1: ( ( ruleTMTCIFFieldValueRaw ) )
            // InternalTCHEADERINPUT.g:974:2: ( ruleTMTCIFFieldValueRaw )
            {
            // InternalTCHEADERINPUT.g:974:2: ( ruleTMTCIFFieldValueRaw )
            // InternalTCHEADERINPUT.g:975:3: ruleTMTCIFFieldValueRaw
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCHeaderInputFieldAccess().getFieldValueTMTCIFFieldValueRawParserRuleCall_5_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFieldValueRaw();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCHeaderInputFieldAccess().getFieldValueTMTCIFFieldValueRawParserRuleCall_5_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSTCHeaderInputField__FieldValueAssignment_5_0_1"


    // $ANTLR start "rule__TMTCIFFieldValueRaw__ValueAssignment_2"
    // InternalTCHEADERINPUT.g:984:1: rule__TMTCIFFieldValueRaw__ValueAssignment_2 : ( ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 ) ) ;
    public final void rule__TMTCIFFieldValueRaw__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTCHEADERINPUT.g:988:1: ( ( ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 ) ) )
            // InternalTCHEADERINPUT.g:989:2: ( ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 ) )
            {
            // InternalTCHEADERINPUT.g:989:2: ( ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 ) )
            // InternalTCHEADERINPUT.g:990:3: ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAlternatives_2_0()); 
            }
            // InternalTCHEADERINPUT.g:991:3: ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 )
            // InternalTCHEADERINPUT.g:991:4: rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAlternatives_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFieldValueRaw__ValueAssignment_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000030L});
    }


}