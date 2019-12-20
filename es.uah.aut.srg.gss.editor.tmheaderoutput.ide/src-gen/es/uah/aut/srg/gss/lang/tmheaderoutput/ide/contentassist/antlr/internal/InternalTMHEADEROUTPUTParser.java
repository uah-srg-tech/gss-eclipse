package es.uah.aut.srg.gss.lang.tmheaderoutput.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.gss.lang.tmheaderoutput.services.TMHEADEROUTPUTGrammarAccess;



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
public class InternalTMHEADEROUTPUTParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_UINT_STRING", "RULE_HEX_STRING", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'/>'", "'<GSSTMHeaderOutput'", "'name='", "'>'", "'<format'", "'file='", "'</GSSTMHeaderOutput>'", "'<fields>'", "'</fields>'", "'<HeaderField'", "'gssHeaderField='", "'</HeaderField>'", "'<FieldValueRaw'", "'value='"
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


        public InternalTMHEADEROUTPUTParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTMHEADEROUTPUTParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTMHEADEROUTPUTParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTMHEADEROUTPUT.g"; }


    	private TMHEADEROUTPUTGrammarAccess grammarAccess;

    	public void setGrammarAccess(TMHEADEROUTPUTGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleGSSTMHeaderOutput"
    // InternalTMHEADEROUTPUT.g:61:1: entryRuleGSSTMHeaderOutput : ruleGSSTMHeaderOutput EOF ;
    public final void entryRuleGSSTMHeaderOutput() throws RecognitionException {
        try {
            // InternalTMHEADEROUTPUT.g:62:1: ( ruleGSSTMHeaderOutput EOF )
            // InternalTMHEADEROUTPUT.g:63:1: ruleGSSTMHeaderOutput EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSTMHeaderOutput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputRule()); 
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
    // $ANTLR end "entryRuleGSSTMHeaderOutput"


    // $ANTLR start "ruleGSSTMHeaderOutput"
    // InternalTMHEADEROUTPUT.g:70:1: ruleGSSTMHeaderOutput : ( ( rule__GSSTMHeaderOutput__Group__0 ) ) ;
    public final void ruleGSSTMHeaderOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:74:2: ( ( ( rule__GSSTMHeaderOutput__Group__0 ) ) )
            // InternalTMHEADEROUTPUT.g:75:2: ( ( rule__GSSTMHeaderOutput__Group__0 ) )
            {
            // InternalTMHEADEROUTPUT.g:75:2: ( ( rule__GSSTMHeaderOutput__Group__0 ) )
            // InternalTMHEADEROUTPUT.g:76:3: ( rule__GSSTMHeaderOutput__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputAccess().getGroup()); 
            }
            // InternalTMHEADEROUTPUT.g:77:3: ( rule__GSSTMHeaderOutput__Group__0 )
            // InternalTMHEADEROUTPUT.g:77:4: rule__GSSTMHeaderOutput__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutput__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputAccess().getGroup()); 
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
    // $ANTLR end "ruleGSSTMHeaderOutput"


    // $ANTLR start "entryRuleGSSTMHeaderOutputField"
    // InternalTMHEADEROUTPUT.g:86:1: entryRuleGSSTMHeaderOutputField : ruleGSSTMHeaderOutputField EOF ;
    public final void entryRuleGSSTMHeaderOutputField() throws RecognitionException {
        try {
            // InternalTMHEADEROUTPUT.g:87:1: ( ruleGSSTMHeaderOutputField EOF )
            // InternalTMHEADEROUTPUT.g:88:1: ruleGSSTMHeaderOutputField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSTMHeaderOutputField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputFieldRule()); 
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
    // $ANTLR end "entryRuleGSSTMHeaderOutputField"


    // $ANTLR start "ruleGSSTMHeaderOutputField"
    // InternalTMHEADEROUTPUT.g:95:1: ruleGSSTMHeaderOutputField : ( ( rule__GSSTMHeaderOutputField__Group__0 ) ) ;
    public final void ruleGSSTMHeaderOutputField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:99:2: ( ( ( rule__GSSTMHeaderOutputField__Group__0 ) ) )
            // InternalTMHEADEROUTPUT.g:100:2: ( ( rule__GSSTMHeaderOutputField__Group__0 ) )
            {
            // InternalTMHEADEROUTPUT.g:100:2: ( ( rule__GSSTMHeaderOutputField__Group__0 ) )
            // InternalTMHEADEROUTPUT.g:101:3: ( rule__GSSTMHeaderOutputField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputFieldAccess().getGroup()); 
            }
            // InternalTMHEADEROUTPUT.g:102:3: ( rule__GSSTMHeaderOutputField__Group__0 )
            // InternalTMHEADEROUTPUT.g:102:4: rule__GSSTMHeaderOutputField__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutputField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputFieldAccess().getGroup()); 
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
    // $ANTLR end "ruleGSSTMHeaderOutputField"


    // $ANTLR start "entryRuleTMTCIFFieldValueRaw"
    // InternalTMHEADEROUTPUT.g:111:1: entryRuleTMTCIFFieldValueRaw : ruleTMTCIFFieldValueRaw EOF ;
    public final void entryRuleTMTCIFFieldValueRaw() throws RecognitionException {
        try {
            // InternalTMHEADEROUTPUT.g:112:1: ( ruleTMTCIFFieldValueRaw EOF )
            // InternalTMHEADEROUTPUT.g:113:1: ruleTMTCIFFieldValueRaw EOF
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
    // InternalTMHEADEROUTPUT.g:120:1: ruleTMTCIFFieldValueRaw : ( ( rule__TMTCIFFieldValueRaw__Group__0 ) ) ;
    public final void ruleTMTCIFFieldValueRaw() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:124:2: ( ( ( rule__TMTCIFFieldValueRaw__Group__0 ) ) )
            // InternalTMHEADEROUTPUT.g:125:2: ( ( rule__TMTCIFFieldValueRaw__Group__0 ) )
            {
            // InternalTMHEADEROUTPUT.g:125:2: ( ( rule__TMTCIFFieldValueRaw__Group__0 ) )
            // InternalTMHEADEROUTPUT.g:126:3: ( rule__TMTCIFFieldValueRaw__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueRawAccess().getGroup()); 
            }
            // InternalTMHEADEROUTPUT.g:127:3: ( rule__TMTCIFFieldValueRaw__Group__0 )
            // InternalTMHEADEROUTPUT.g:127:4: rule__TMTCIFFieldValueRaw__Group__0
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


    // $ANTLR start "rule__GSSTMHeaderOutputField__Alternatives_5"
    // InternalTMHEADEROUTPUT.g:135:1: rule__GSSTMHeaderOutputField__Alternatives_5 : ( ( ( rule__GSSTMHeaderOutputField__Group_5_0__0 ) ) | ( '/>' ) );
    public final void rule__GSSTMHeaderOutputField__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:139:1: ( ( ( rule__GSSTMHeaderOutputField__Group_5_0__0 ) ) | ( '/>' ) )
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
                    // InternalTMHEADEROUTPUT.g:140:2: ( ( rule__GSSTMHeaderOutputField__Group_5_0__0 ) )
                    {
                    // InternalTMHEADEROUTPUT.g:140:2: ( ( rule__GSSTMHeaderOutputField__Group_5_0__0 ) )
                    // InternalTMHEADEROUTPUT.g:141:3: ( rule__GSSTMHeaderOutputField__Group_5_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSTMHeaderOutputFieldAccess().getGroup_5_0()); 
                    }
                    // InternalTMHEADEROUTPUT.g:142:3: ( rule__GSSTMHeaderOutputField__Group_5_0__0 )
                    // InternalTMHEADEROUTPUT.g:142:4: rule__GSSTMHeaderOutputField__Group_5_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTMHeaderOutputField__Group_5_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSTMHeaderOutputFieldAccess().getGroup_5_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTMHEADEROUTPUT.g:146:2: ( '/>' )
                    {
                    // InternalTMHEADEROUTPUT.g:146:2: ( '/>' )
                    // InternalTMHEADEROUTPUT.g:147:3: '/>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSTMHeaderOutputFieldAccess().getSolidusGreaterThanSignKeyword_5_1()); 
                    }
                    match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSTMHeaderOutputFieldAccess().getSolidusGreaterThanSignKeyword_5_1()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutputField__Alternatives_5"


    // $ANTLR start "rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0"
    // InternalTMHEADEROUTPUT.g:156:1: rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 : ( ( RULE_UINT_STRING ) | ( RULE_HEX_STRING ) );
    public final void rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:160:1: ( ( RULE_UINT_STRING ) | ( RULE_HEX_STRING ) )
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
                    // InternalTMHEADEROUTPUT.g:161:2: ( RULE_UINT_STRING )
                    {
                    // InternalTMHEADEROUTPUT.g:161:2: ( RULE_UINT_STRING )
                    // InternalTMHEADEROUTPUT.g:162:3: RULE_UINT_STRING
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
                    // InternalTMHEADEROUTPUT.g:167:2: ( RULE_HEX_STRING )
                    {
                    // InternalTMHEADEROUTPUT.g:167:2: ( RULE_HEX_STRING )
                    // InternalTMHEADEROUTPUT.g:168:3: RULE_HEX_STRING
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


    // $ANTLR start "rule__GSSTMHeaderOutput__Group__0"
    // InternalTMHEADEROUTPUT.g:177:1: rule__GSSTMHeaderOutput__Group__0 : rule__GSSTMHeaderOutput__Group__0__Impl rule__GSSTMHeaderOutput__Group__1 ;
    public final void rule__GSSTMHeaderOutput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:181:1: ( rule__GSSTMHeaderOutput__Group__0__Impl rule__GSSTMHeaderOutput__Group__1 )
            // InternalTMHEADEROUTPUT.g:182:2: rule__GSSTMHeaderOutput__Group__0__Impl rule__GSSTMHeaderOutput__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__GSSTMHeaderOutput__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutput__Group__1();

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
    // $ANTLR end "rule__GSSTMHeaderOutput__Group__0"


    // $ANTLR start "rule__GSSTMHeaderOutput__Group__0__Impl"
    // InternalTMHEADEROUTPUT.g:189:1: rule__GSSTMHeaderOutput__Group__0__Impl : ( '<GSSTMHeaderOutput' ) ;
    public final void rule__GSSTMHeaderOutput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:193:1: ( ( '<GSSTMHeaderOutput' ) )
            // InternalTMHEADEROUTPUT.g:194:1: ( '<GSSTMHeaderOutput' )
            {
            // InternalTMHEADEROUTPUT.g:194:1: ( '<GSSTMHeaderOutput' )
            // InternalTMHEADEROUTPUT.g:195:2: '<GSSTMHeaderOutput'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputAccess().getGSSTMHeaderOutputKeyword_0()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputAccess().getGSSTMHeaderOutputKeyword_0()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutput__Group__0__Impl"


    // $ANTLR start "rule__GSSTMHeaderOutput__Group__1"
    // InternalTMHEADEROUTPUT.g:204:1: rule__GSSTMHeaderOutput__Group__1 : rule__GSSTMHeaderOutput__Group__1__Impl rule__GSSTMHeaderOutput__Group__2 ;
    public final void rule__GSSTMHeaderOutput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:208:1: ( rule__GSSTMHeaderOutput__Group__1__Impl rule__GSSTMHeaderOutput__Group__2 )
            // InternalTMHEADEROUTPUT.g:209:2: rule__GSSTMHeaderOutput__Group__1__Impl rule__GSSTMHeaderOutput__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTMHeaderOutput__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutput__Group__2();

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
    // $ANTLR end "rule__GSSTMHeaderOutput__Group__1"


    // $ANTLR start "rule__GSSTMHeaderOutput__Group__1__Impl"
    // InternalTMHEADEROUTPUT.g:216:1: rule__GSSTMHeaderOutput__Group__1__Impl : ( 'name=' ) ;
    public final void rule__GSSTMHeaderOutput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:220:1: ( ( 'name=' ) )
            // InternalTMHEADEROUTPUT.g:221:1: ( 'name=' )
            {
            // InternalTMHEADEROUTPUT.g:221:1: ( 'name=' )
            // InternalTMHEADEROUTPUT.g:222:2: 'name='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputAccess().getNameKeyword_1()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputAccess().getNameKeyword_1()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutput__Group__1__Impl"


    // $ANTLR start "rule__GSSTMHeaderOutput__Group__2"
    // InternalTMHEADEROUTPUT.g:231:1: rule__GSSTMHeaderOutput__Group__2 : rule__GSSTMHeaderOutput__Group__2__Impl rule__GSSTMHeaderOutput__Group__3 ;
    public final void rule__GSSTMHeaderOutput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:235:1: ( rule__GSSTMHeaderOutput__Group__2__Impl rule__GSSTMHeaderOutput__Group__3 )
            // InternalTMHEADEROUTPUT.g:236:2: rule__GSSTMHeaderOutput__Group__2__Impl rule__GSSTMHeaderOutput__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSTMHeaderOutput__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutput__Group__3();

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
    // $ANTLR end "rule__GSSTMHeaderOutput__Group__2"


    // $ANTLR start "rule__GSSTMHeaderOutput__Group__2__Impl"
    // InternalTMHEADEROUTPUT.g:243:1: rule__GSSTMHeaderOutput__Group__2__Impl : ( ( rule__GSSTMHeaderOutput__NameAssignment_2 ) ) ;
    public final void rule__GSSTMHeaderOutput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:247:1: ( ( ( rule__GSSTMHeaderOutput__NameAssignment_2 ) ) )
            // InternalTMHEADEROUTPUT.g:248:1: ( ( rule__GSSTMHeaderOutput__NameAssignment_2 ) )
            {
            // InternalTMHEADEROUTPUT.g:248:1: ( ( rule__GSSTMHeaderOutput__NameAssignment_2 ) )
            // InternalTMHEADEROUTPUT.g:249:2: ( rule__GSSTMHeaderOutput__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputAccess().getNameAssignment_2()); 
            }
            // InternalTMHEADEROUTPUT.g:250:2: ( rule__GSSTMHeaderOutput__NameAssignment_2 )
            // InternalTMHEADEROUTPUT.g:250:3: rule__GSSTMHeaderOutput__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutput__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutput__Group__2__Impl"


    // $ANTLR start "rule__GSSTMHeaderOutput__Group__3"
    // InternalTMHEADEROUTPUT.g:258:1: rule__GSSTMHeaderOutput__Group__3 : rule__GSSTMHeaderOutput__Group__3__Impl rule__GSSTMHeaderOutput__Group__4 ;
    public final void rule__GSSTMHeaderOutput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:262:1: ( rule__GSSTMHeaderOutput__Group__3__Impl rule__GSSTMHeaderOutput__Group__4 )
            // InternalTMHEADEROUTPUT.g:263:2: rule__GSSTMHeaderOutput__Group__3__Impl rule__GSSTMHeaderOutput__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSTMHeaderOutput__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutput__Group__4();

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
    // $ANTLR end "rule__GSSTMHeaderOutput__Group__3"


    // $ANTLR start "rule__GSSTMHeaderOutput__Group__3__Impl"
    // InternalTMHEADEROUTPUT.g:270:1: rule__GSSTMHeaderOutput__Group__3__Impl : ( '>' ) ;
    public final void rule__GSSTMHeaderOutput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:274:1: ( ( '>' ) )
            // InternalTMHEADEROUTPUT.g:275:1: ( '>' )
            {
            // InternalTMHEADEROUTPUT.g:275:1: ( '>' )
            // InternalTMHEADEROUTPUT.g:276:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputAccess().getGreaterThanSignKeyword_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputAccess().getGreaterThanSignKeyword_3()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutput__Group__3__Impl"


    // $ANTLR start "rule__GSSTMHeaderOutput__Group__4"
    // InternalTMHEADEROUTPUT.g:285:1: rule__GSSTMHeaderOutput__Group__4 : rule__GSSTMHeaderOutput__Group__4__Impl rule__GSSTMHeaderOutput__Group__5 ;
    public final void rule__GSSTMHeaderOutput__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:289:1: ( rule__GSSTMHeaderOutput__Group__4__Impl rule__GSSTMHeaderOutput__Group__5 )
            // InternalTMHEADEROUTPUT.g:290:2: rule__GSSTMHeaderOutput__Group__4__Impl rule__GSSTMHeaderOutput__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSTMHeaderOutput__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutput__Group__5();

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
    // $ANTLR end "rule__GSSTMHeaderOutput__Group__4"


    // $ANTLR start "rule__GSSTMHeaderOutput__Group__4__Impl"
    // InternalTMHEADEROUTPUT.g:297:1: rule__GSSTMHeaderOutput__Group__4__Impl : ( '<format' ) ;
    public final void rule__GSSTMHeaderOutput__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:301:1: ( ( '<format' ) )
            // InternalTMHEADEROUTPUT.g:302:1: ( '<format' )
            {
            // InternalTMHEADEROUTPUT.g:302:1: ( '<format' )
            // InternalTMHEADEROUTPUT.g:303:2: '<format'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputAccess().getFormatKeyword_4()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputAccess().getFormatKeyword_4()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutput__Group__4__Impl"


    // $ANTLR start "rule__GSSTMHeaderOutput__Group__5"
    // InternalTMHEADEROUTPUT.g:312:1: rule__GSSTMHeaderOutput__Group__5 : rule__GSSTMHeaderOutput__Group__5__Impl rule__GSSTMHeaderOutput__Group__6 ;
    public final void rule__GSSTMHeaderOutput__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:316:1: ( rule__GSSTMHeaderOutput__Group__5__Impl rule__GSSTMHeaderOutput__Group__6 )
            // InternalTMHEADEROUTPUT.g:317:2: rule__GSSTMHeaderOutput__Group__5__Impl rule__GSSTMHeaderOutput__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTMHeaderOutput__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutput__Group__6();

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
    // $ANTLR end "rule__GSSTMHeaderOutput__Group__5"


    // $ANTLR start "rule__GSSTMHeaderOutput__Group__5__Impl"
    // InternalTMHEADEROUTPUT.g:324:1: rule__GSSTMHeaderOutput__Group__5__Impl : ( 'file=' ) ;
    public final void rule__GSSTMHeaderOutput__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:328:1: ( ( 'file=' ) )
            // InternalTMHEADEROUTPUT.g:329:1: ( 'file=' )
            {
            // InternalTMHEADEROUTPUT.g:329:1: ( 'file=' )
            // InternalTMHEADEROUTPUT.g:330:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputAccess().getFileKeyword_5()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputAccess().getFileKeyword_5()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutput__Group__5__Impl"


    // $ANTLR start "rule__GSSTMHeaderOutput__Group__6"
    // InternalTMHEADEROUTPUT.g:339:1: rule__GSSTMHeaderOutput__Group__6 : rule__GSSTMHeaderOutput__Group__6__Impl rule__GSSTMHeaderOutput__Group__7 ;
    public final void rule__GSSTMHeaderOutput__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:343:1: ( rule__GSSTMHeaderOutput__Group__6__Impl rule__GSSTMHeaderOutput__Group__7 )
            // InternalTMHEADEROUTPUT.g:344:2: rule__GSSTMHeaderOutput__Group__6__Impl rule__GSSTMHeaderOutput__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSTMHeaderOutput__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutput__Group__7();

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
    // $ANTLR end "rule__GSSTMHeaderOutput__Group__6"


    // $ANTLR start "rule__GSSTMHeaderOutput__Group__6__Impl"
    // InternalTMHEADEROUTPUT.g:351:1: rule__GSSTMHeaderOutput__Group__6__Impl : ( ( rule__GSSTMHeaderOutput__FormatAssignment_6 ) ) ;
    public final void rule__GSSTMHeaderOutput__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:355:1: ( ( ( rule__GSSTMHeaderOutput__FormatAssignment_6 ) ) )
            // InternalTMHEADEROUTPUT.g:356:1: ( ( rule__GSSTMHeaderOutput__FormatAssignment_6 ) )
            {
            // InternalTMHEADEROUTPUT.g:356:1: ( ( rule__GSSTMHeaderOutput__FormatAssignment_6 ) )
            // InternalTMHEADEROUTPUT.g:357:2: ( rule__GSSTMHeaderOutput__FormatAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputAccess().getFormatAssignment_6()); 
            }
            // InternalTMHEADEROUTPUT.g:358:2: ( rule__GSSTMHeaderOutput__FormatAssignment_6 )
            // InternalTMHEADEROUTPUT.g:358:3: rule__GSSTMHeaderOutput__FormatAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutput__FormatAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputAccess().getFormatAssignment_6()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutput__Group__6__Impl"


    // $ANTLR start "rule__GSSTMHeaderOutput__Group__7"
    // InternalTMHEADEROUTPUT.g:366:1: rule__GSSTMHeaderOutput__Group__7 : rule__GSSTMHeaderOutput__Group__7__Impl rule__GSSTMHeaderOutput__Group__8 ;
    public final void rule__GSSTMHeaderOutput__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:370:1: ( rule__GSSTMHeaderOutput__Group__7__Impl rule__GSSTMHeaderOutput__Group__8 )
            // InternalTMHEADEROUTPUT.g:371:2: rule__GSSTMHeaderOutput__Group__7__Impl rule__GSSTMHeaderOutput__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSTMHeaderOutput__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutput__Group__8();

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
    // $ANTLR end "rule__GSSTMHeaderOutput__Group__7"


    // $ANTLR start "rule__GSSTMHeaderOutput__Group__7__Impl"
    // InternalTMHEADEROUTPUT.g:378:1: rule__GSSTMHeaderOutput__Group__7__Impl : ( '/>' ) ;
    public final void rule__GSSTMHeaderOutput__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:382:1: ( ( '/>' ) )
            // InternalTMHEADEROUTPUT.g:383:1: ( '/>' )
            {
            // InternalTMHEADEROUTPUT.g:383:1: ( '/>' )
            // InternalTMHEADEROUTPUT.g:384:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputAccess().getSolidusGreaterThanSignKeyword_7()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputAccess().getSolidusGreaterThanSignKeyword_7()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutput__Group__7__Impl"


    // $ANTLR start "rule__GSSTMHeaderOutput__Group__8"
    // InternalTMHEADEROUTPUT.g:393:1: rule__GSSTMHeaderOutput__Group__8 : rule__GSSTMHeaderOutput__Group__8__Impl rule__GSSTMHeaderOutput__Group__9 ;
    public final void rule__GSSTMHeaderOutput__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:397:1: ( rule__GSSTMHeaderOutput__Group__8__Impl rule__GSSTMHeaderOutput__Group__9 )
            // InternalTMHEADEROUTPUT.g:398:2: rule__GSSTMHeaderOutput__Group__8__Impl rule__GSSTMHeaderOutput__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSTMHeaderOutput__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutput__Group__9();

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
    // $ANTLR end "rule__GSSTMHeaderOutput__Group__8"


    // $ANTLR start "rule__GSSTMHeaderOutput__Group__8__Impl"
    // InternalTMHEADEROUTPUT.g:405:1: rule__GSSTMHeaderOutput__Group__8__Impl : ( ( rule__GSSTMHeaderOutput__Group_8__0 )? ) ;
    public final void rule__GSSTMHeaderOutput__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:409:1: ( ( ( rule__GSSTMHeaderOutput__Group_8__0 )? ) )
            // InternalTMHEADEROUTPUT.g:410:1: ( ( rule__GSSTMHeaderOutput__Group_8__0 )? )
            {
            // InternalTMHEADEROUTPUT.g:410:1: ( ( rule__GSSTMHeaderOutput__Group_8__0 )? )
            // InternalTMHEADEROUTPUT.g:411:2: ( rule__GSSTMHeaderOutput__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputAccess().getGroup_8()); 
            }
            // InternalTMHEADEROUTPUT.g:412:2: ( rule__GSSTMHeaderOutput__Group_8__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTMHEADEROUTPUT.g:412:3: rule__GSSTMHeaderOutput__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTMHeaderOutput__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputAccess().getGroup_8()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutput__Group__8__Impl"


    // $ANTLR start "rule__GSSTMHeaderOutput__Group__9"
    // InternalTMHEADEROUTPUT.g:420:1: rule__GSSTMHeaderOutput__Group__9 : rule__GSSTMHeaderOutput__Group__9__Impl ;
    public final void rule__GSSTMHeaderOutput__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:424:1: ( rule__GSSTMHeaderOutput__Group__9__Impl )
            // InternalTMHEADEROUTPUT.g:425:2: rule__GSSTMHeaderOutput__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutput__Group__9__Impl();

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
    // $ANTLR end "rule__GSSTMHeaderOutput__Group__9"


    // $ANTLR start "rule__GSSTMHeaderOutput__Group__9__Impl"
    // InternalTMHEADEROUTPUT.g:431:1: rule__GSSTMHeaderOutput__Group__9__Impl : ( '</GSSTMHeaderOutput>' ) ;
    public final void rule__GSSTMHeaderOutput__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:435:1: ( ( '</GSSTMHeaderOutput>' ) )
            // InternalTMHEADEROUTPUT.g:436:1: ( '</GSSTMHeaderOutput>' )
            {
            // InternalTMHEADEROUTPUT.g:436:1: ( '</GSSTMHeaderOutput>' )
            // InternalTMHEADEROUTPUT.g:437:2: '</GSSTMHeaderOutput>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputAccess().getGSSTMHeaderOutputKeyword_9()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputAccess().getGSSTMHeaderOutputKeyword_9()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutput__Group__9__Impl"


    // $ANTLR start "rule__GSSTMHeaderOutput__Group_8__0"
    // InternalTMHEADEROUTPUT.g:447:1: rule__GSSTMHeaderOutput__Group_8__0 : rule__GSSTMHeaderOutput__Group_8__0__Impl rule__GSSTMHeaderOutput__Group_8__1 ;
    public final void rule__GSSTMHeaderOutput__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:451:1: ( rule__GSSTMHeaderOutput__Group_8__0__Impl rule__GSSTMHeaderOutput__Group_8__1 )
            // InternalTMHEADEROUTPUT.g:452:2: rule__GSSTMHeaderOutput__Group_8__0__Impl rule__GSSTMHeaderOutput__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTMHeaderOutput__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutput__Group_8__1();

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
    // $ANTLR end "rule__GSSTMHeaderOutput__Group_8__0"


    // $ANTLR start "rule__GSSTMHeaderOutput__Group_8__0__Impl"
    // InternalTMHEADEROUTPUT.g:459:1: rule__GSSTMHeaderOutput__Group_8__0__Impl : ( '<fields>' ) ;
    public final void rule__GSSTMHeaderOutput__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:463:1: ( ( '<fields>' ) )
            // InternalTMHEADEROUTPUT.g:464:1: ( '<fields>' )
            {
            // InternalTMHEADEROUTPUT.g:464:1: ( '<fields>' )
            // InternalTMHEADEROUTPUT.g:465:2: '<fields>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputAccess().getFieldsKeyword_8_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputAccess().getFieldsKeyword_8_0()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutput__Group_8__0__Impl"


    // $ANTLR start "rule__GSSTMHeaderOutput__Group_8__1"
    // InternalTMHEADEROUTPUT.g:474:1: rule__GSSTMHeaderOutput__Group_8__1 : rule__GSSTMHeaderOutput__Group_8__1__Impl rule__GSSTMHeaderOutput__Group_8__2 ;
    public final void rule__GSSTMHeaderOutput__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:478:1: ( rule__GSSTMHeaderOutput__Group_8__1__Impl rule__GSSTMHeaderOutput__Group_8__2 )
            // InternalTMHEADEROUTPUT.g:479:2: rule__GSSTMHeaderOutput__Group_8__1__Impl rule__GSSTMHeaderOutput__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTMHeaderOutput__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutput__Group_8__2();

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
    // $ANTLR end "rule__GSSTMHeaderOutput__Group_8__1"


    // $ANTLR start "rule__GSSTMHeaderOutput__Group_8__1__Impl"
    // InternalTMHEADEROUTPUT.g:486:1: rule__GSSTMHeaderOutput__Group_8__1__Impl : ( ( ( rule__GSSTMHeaderOutput__GssHeaderFieldsAssignment_8_1 ) ) ( ( rule__GSSTMHeaderOutput__GssHeaderFieldsAssignment_8_1 )* ) ) ;
    public final void rule__GSSTMHeaderOutput__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:490:1: ( ( ( ( rule__GSSTMHeaderOutput__GssHeaderFieldsAssignment_8_1 ) ) ( ( rule__GSSTMHeaderOutput__GssHeaderFieldsAssignment_8_1 )* ) ) )
            // InternalTMHEADEROUTPUT.g:491:1: ( ( ( rule__GSSTMHeaderOutput__GssHeaderFieldsAssignment_8_1 ) ) ( ( rule__GSSTMHeaderOutput__GssHeaderFieldsAssignment_8_1 )* ) )
            {
            // InternalTMHEADEROUTPUT.g:491:1: ( ( ( rule__GSSTMHeaderOutput__GssHeaderFieldsAssignment_8_1 ) ) ( ( rule__GSSTMHeaderOutput__GssHeaderFieldsAssignment_8_1 )* ) )
            // InternalTMHEADEROUTPUT.g:492:2: ( ( rule__GSSTMHeaderOutput__GssHeaderFieldsAssignment_8_1 ) ) ( ( rule__GSSTMHeaderOutput__GssHeaderFieldsAssignment_8_1 )* )
            {
            // InternalTMHEADEROUTPUT.g:492:2: ( ( rule__GSSTMHeaderOutput__GssHeaderFieldsAssignment_8_1 ) )
            // InternalTMHEADEROUTPUT.g:493:3: ( rule__GSSTMHeaderOutput__GssHeaderFieldsAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputAccess().getGssHeaderFieldsAssignment_8_1()); 
            }
            // InternalTMHEADEROUTPUT.g:494:3: ( rule__GSSTMHeaderOutput__GssHeaderFieldsAssignment_8_1 )
            // InternalTMHEADEROUTPUT.g:494:4: rule__GSSTMHeaderOutput__GssHeaderFieldsAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTMHeaderOutput__GssHeaderFieldsAssignment_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputAccess().getGssHeaderFieldsAssignment_8_1()); 
            }

            }

            // InternalTMHEADEROUTPUT.g:497:2: ( ( rule__GSSTMHeaderOutput__GssHeaderFieldsAssignment_8_1 )* )
            // InternalTMHEADEROUTPUT.g:498:3: ( rule__GSSTMHeaderOutput__GssHeaderFieldsAssignment_8_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputAccess().getGssHeaderFieldsAssignment_8_1()); 
            }
            // InternalTMHEADEROUTPUT.g:499:3: ( rule__GSSTMHeaderOutput__GssHeaderFieldsAssignment_8_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTMHEADEROUTPUT.g:499:4: rule__GSSTMHeaderOutput__GssHeaderFieldsAssignment_8_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    rule__GSSTMHeaderOutput__GssHeaderFieldsAssignment_8_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputAccess().getGssHeaderFieldsAssignment_8_1()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutput__Group_8__1__Impl"


    // $ANTLR start "rule__GSSTMHeaderOutput__Group_8__2"
    // InternalTMHEADEROUTPUT.g:508:1: rule__GSSTMHeaderOutput__Group_8__2 : rule__GSSTMHeaderOutput__Group_8__2__Impl ;
    public final void rule__GSSTMHeaderOutput__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:512:1: ( rule__GSSTMHeaderOutput__Group_8__2__Impl )
            // InternalTMHEADEROUTPUT.g:513:2: rule__GSSTMHeaderOutput__Group_8__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutput__Group_8__2__Impl();

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
    // $ANTLR end "rule__GSSTMHeaderOutput__Group_8__2"


    // $ANTLR start "rule__GSSTMHeaderOutput__Group_8__2__Impl"
    // InternalTMHEADEROUTPUT.g:519:1: rule__GSSTMHeaderOutput__Group_8__2__Impl : ( '</fields>' ) ;
    public final void rule__GSSTMHeaderOutput__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:523:1: ( ( '</fields>' ) )
            // InternalTMHEADEROUTPUT.g:524:1: ( '</fields>' )
            {
            // InternalTMHEADEROUTPUT.g:524:1: ( '</fields>' )
            // InternalTMHEADEROUTPUT.g:525:2: '</fields>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputAccess().getFieldsKeyword_8_2()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputAccess().getFieldsKeyword_8_2()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutput__Group_8__2__Impl"


    // $ANTLR start "rule__GSSTMHeaderOutputField__Group__0"
    // InternalTMHEADEROUTPUT.g:535:1: rule__GSSTMHeaderOutputField__Group__0 : rule__GSSTMHeaderOutputField__Group__0__Impl rule__GSSTMHeaderOutputField__Group__1 ;
    public final void rule__GSSTMHeaderOutputField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:539:1: ( rule__GSSTMHeaderOutputField__Group__0__Impl rule__GSSTMHeaderOutputField__Group__1 )
            // InternalTMHEADEROUTPUT.g:540:2: rule__GSSTMHeaderOutputField__Group__0__Impl rule__GSSTMHeaderOutputField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__GSSTMHeaderOutputField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutputField__Group__1();

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
    // $ANTLR end "rule__GSSTMHeaderOutputField__Group__0"


    // $ANTLR start "rule__GSSTMHeaderOutputField__Group__0__Impl"
    // InternalTMHEADEROUTPUT.g:547:1: rule__GSSTMHeaderOutputField__Group__0__Impl : ( '<HeaderField' ) ;
    public final void rule__GSSTMHeaderOutputField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:551:1: ( ( '<HeaderField' ) )
            // InternalTMHEADEROUTPUT.g:552:1: ( '<HeaderField' )
            {
            // InternalTMHEADEROUTPUT.g:552:1: ( '<HeaderField' )
            // InternalTMHEADEROUTPUT.g:553:2: '<HeaderField'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputFieldAccess().getHeaderFieldKeyword_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputFieldAccess().getHeaderFieldKeyword_0()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutputField__Group__0__Impl"


    // $ANTLR start "rule__GSSTMHeaderOutputField__Group__1"
    // InternalTMHEADEROUTPUT.g:562:1: rule__GSSTMHeaderOutputField__Group__1 : rule__GSSTMHeaderOutputField__Group__1__Impl rule__GSSTMHeaderOutputField__Group__2 ;
    public final void rule__GSSTMHeaderOutputField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:566:1: ( rule__GSSTMHeaderOutputField__Group__1__Impl rule__GSSTMHeaderOutputField__Group__2 )
            // InternalTMHEADEROUTPUT.g:567:2: rule__GSSTMHeaderOutputField__Group__1__Impl rule__GSSTMHeaderOutputField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTMHeaderOutputField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutputField__Group__2();

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
    // $ANTLR end "rule__GSSTMHeaderOutputField__Group__1"


    // $ANTLR start "rule__GSSTMHeaderOutputField__Group__1__Impl"
    // InternalTMHEADEROUTPUT.g:574:1: rule__GSSTMHeaderOutputField__Group__1__Impl : ( 'name=' ) ;
    public final void rule__GSSTMHeaderOutputField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:578:1: ( ( 'name=' ) )
            // InternalTMHEADEROUTPUT.g:579:1: ( 'name=' )
            {
            // InternalTMHEADEROUTPUT.g:579:1: ( 'name=' )
            // InternalTMHEADEROUTPUT.g:580:2: 'name='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputFieldAccess().getNameKeyword_1()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputFieldAccess().getNameKeyword_1()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutputField__Group__1__Impl"


    // $ANTLR start "rule__GSSTMHeaderOutputField__Group__2"
    // InternalTMHEADEROUTPUT.g:589:1: rule__GSSTMHeaderOutputField__Group__2 : rule__GSSTMHeaderOutputField__Group__2__Impl rule__GSSTMHeaderOutputField__Group__3 ;
    public final void rule__GSSTMHeaderOutputField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:593:1: ( rule__GSSTMHeaderOutputField__Group__2__Impl rule__GSSTMHeaderOutputField__Group__3 )
            // InternalTMHEADEROUTPUT.g:594:2: rule__GSSTMHeaderOutputField__Group__2__Impl rule__GSSTMHeaderOutputField__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__GSSTMHeaderOutputField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutputField__Group__3();

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
    // $ANTLR end "rule__GSSTMHeaderOutputField__Group__2"


    // $ANTLR start "rule__GSSTMHeaderOutputField__Group__2__Impl"
    // InternalTMHEADEROUTPUT.g:601:1: rule__GSSTMHeaderOutputField__Group__2__Impl : ( ( rule__GSSTMHeaderOutputField__NameAssignment_2 ) ) ;
    public final void rule__GSSTMHeaderOutputField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:605:1: ( ( ( rule__GSSTMHeaderOutputField__NameAssignment_2 ) ) )
            // InternalTMHEADEROUTPUT.g:606:1: ( ( rule__GSSTMHeaderOutputField__NameAssignment_2 ) )
            {
            // InternalTMHEADEROUTPUT.g:606:1: ( ( rule__GSSTMHeaderOutputField__NameAssignment_2 ) )
            // InternalTMHEADEROUTPUT.g:607:2: ( rule__GSSTMHeaderOutputField__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputFieldAccess().getNameAssignment_2()); 
            }
            // InternalTMHEADEROUTPUT.g:608:2: ( rule__GSSTMHeaderOutputField__NameAssignment_2 )
            // InternalTMHEADEROUTPUT.g:608:3: rule__GSSTMHeaderOutputField__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutputField__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputFieldAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutputField__Group__2__Impl"


    // $ANTLR start "rule__GSSTMHeaderOutputField__Group__3"
    // InternalTMHEADEROUTPUT.g:616:1: rule__GSSTMHeaderOutputField__Group__3 : rule__GSSTMHeaderOutputField__Group__3__Impl rule__GSSTMHeaderOutputField__Group__4 ;
    public final void rule__GSSTMHeaderOutputField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:620:1: ( rule__GSSTMHeaderOutputField__Group__3__Impl rule__GSSTMHeaderOutputField__Group__4 )
            // InternalTMHEADEROUTPUT.g:621:2: rule__GSSTMHeaderOutputField__Group__3__Impl rule__GSSTMHeaderOutputField__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTMHeaderOutputField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutputField__Group__4();

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
    // $ANTLR end "rule__GSSTMHeaderOutputField__Group__3"


    // $ANTLR start "rule__GSSTMHeaderOutputField__Group__3__Impl"
    // InternalTMHEADEROUTPUT.g:628:1: rule__GSSTMHeaderOutputField__Group__3__Impl : ( 'gssHeaderField=' ) ;
    public final void rule__GSSTMHeaderOutputField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:632:1: ( ( 'gssHeaderField=' ) )
            // InternalTMHEADEROUTPUT.g:633:1: ( 'gssHeaderField=' )
            {
            // InternalTMHEADEROUTPUT.g:633:1: ( 'gssHeaderField=' )
            // InternalTMHEADEROUTPUT.g:634:2: 'gssHeaderField='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputFieldAccess().getGssHeaderFieldKeyword_3()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputFieldAccess().getGssHeaderFieldKeyword_3()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutputField__Group__3__Impl"


    // $ANTLR start "rule__GSSTMHeaderOutputField__Group__4"
    // InternalTMHEADEROUTPUT.g:643:1: rule__GSSTMHeaderOutputField__Group__4 : rule__GSSTMHeaderOutputField__Group__4__Impl rule__GSSTMHeaderOutputField__Group__5 ;
    public final void rule__GSSTMHeaderOutputField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:647:1: ( rule__GSSTMHeaderOutputField__Group__4__Impl rule__GSSTMHeaderOutputField__Group__5 )
            // InternalTMHEADEROUTPUT.g:648:2: rule__GSSTMHeaderOutputField__Group__4__Impl rule__GSSTMHeaderOutputField__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__GSSTMHeaderOutputField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutputField__Group__5();

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
    // $ANTLR end "rule__GSSTMHeaderOutputField__Group__4"


    // $ANTLR start "rule__GSSTMHeaderOutputField__Group__4__Impl"
    // InternalTMHEADEROUTPUT.g:655:1: rule__GSSTMHeaderOutputField__Group__4__Impl : ( ( rule__GSSTMHeaderOutputField__GssHeaderFieldAssignment_4 ) ) ;
    public final void rule__GSSTMHeaderOutputField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:659:1: ( ( ( rule__GSSTMHeaderOutputField__GssHeaderFieldAssignment_4 ) ) )
            // InternalTMHEADEROUTPUT.g:660:1: ( ( rule__GSSTMHeaderOutputField__GssHeaderFieldAssignment_4 ) )
            {
            // InternalTMHEADEROUTPUT.g:660:1: ( ( rule__GSSTMHeaderOutputField__GssHeaderFieldAssignment_4 ) )
            // InternalTMHEADEROUTPUT.g:661:2: ( rule__GSSTMHeaderOutputField__GssHeaderFieldAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputFieldAccess().getGssHeaderFieldAssignment_4()); 
            }
            // InternalTMHEADEROUTPUT.g:662:2: ( rule__GSSTMHeaderOutputField__GssHeaderFieldAssignment_4 )
            // InternalTMHEADEROUTPUT.g:662:3: rule__GSSTMHeaderOutputField__GssHeaderFieldAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutputField__GssHeaderFieldAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputFieldAccess().getGssHeaderFieldAssignment_4()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutputField__Group__4__Impl"


    // $ANTLR start "rule__GSSTMHeaderOutputField__Group__5"
    // InternalTMHEADEROUTPUT.g:670:1: rule__GSSTMHeaderOutputField__Group__5 : rule__GSSTMHeaderOutputField__Group__5__Impl ;
    public final void rule__GSSTMHeaderOutputField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:674:1: ( rule__GSSTMHeaderOutputField__Group__5__Impl )
            // InternalTMHEADEROUTPUT.g:675:2: rule__GSSTMHeaderOutputField__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutputField__Group__5__Impl();

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
    // $ANTLR end "rule__GSSTMHeaderOutputField__Group__5"


    // $ANTLR start "rule__GSSTMHeaderOutputField__Group__5__Impl"
    // InternalTMHEADEROUTPUT.g:681:1: rule__GSSTMHeaderOutputField__Group__5__Impl : ( ( rule__GSSTMHeaderOutputField__Alternatives_5 ) ) ;
    public final void rule__GSSTMHeaderOutputField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:685:1: ( ( ( rule__GSSTMHeaderOutputField__Alternatives_5 ) ) )
            // InternalTMHEADEROUTPUT.g:686:1: ( ( rule__GSSTMHeaderOutputField__Alternatives_5 ) )
            {
            // InternalTMHEADEROUTPUT.g:686:1: ( ( rule__GSSTMHeaderOutputField__Alternatives_5 ) )
            // InternalTMHEADEROUTPUT.g:687:2: ( rule__GSSTMHeaderOutputField__Alternatives_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputFieldAccess().getAlternatives_5()); 
            }
            // InternalTMHEADEROUTPUT.g:688:2: ( rule__GSSTMHeaderOutputField__Alternatives_5 )
            // InternalTMHEADEROUTPUT.g:688:3: rule__GSSTMHeaderOutputField__Alternatives_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutputField__Alternatives_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputFieldAccess().getAlternatives_5()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutputField__Group__5__Impl"


    // $ANTLR start "rule__GSSTMHeaderOutputField__Group_5_0__0"
    // InternalTMHEADEROUTPUT.g:697:1: rule__GSSTMHeaderOutputField__Group_5_0__0 : rule__GSSTMHeaderOutputField__Group_5_0__0__Impl rule__GSSTMHeaderOutputField__Group_5_0__1 ;
    public final void rule__GSSTMHeaderOutputField__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:701:1: ( rule__GSSTMHeaderOutputField__Group_5_0__0__Impl rule__GSSTMHeaderOutputField__Group_5_0__1 )
            // InternalTMHEADEROUTPUT.g:702:2: rule__GSSTMHeaderOutputField__Group_5_0__0__Impl rule__GSSTMHeaderOutputField__Group_5_0__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__GSSTMHeaderOutputField__Group_5_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutputField__Group_5_0__1();

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
    // $ANTLR end "rule__GSSTMHeaderOutputField__Group_5_0__0"


    // $ANTLR start "rule__GSSTMHeaderOutputField__Group_5_0__0__Impl"
    // InternalTMHEADEROUTPUT.g:709:1: rule__GSSTMHeaderOutputField__Group_5_0__0__Impl : ( '>' ) ;
    public final void rule__GSSTMHeaderOutputField__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:713:1: ( ( '>' ) )
            // InternalTMHEADEROUTPUT.g:714:1: ( '>' )
            {
            // InternalTMHEADEROUTPUT.g:714:1: ( '>' )
            // InternalTMHEADEROUTPUT.g:715:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputFieldAccess().getGreaterThanSignKeyword_5_0_0()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputFieldAccess().getGreaterThanSignKeyword_5_0_0()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutputField__Group_5_0__0__Impl"


    // $ANTLR start "rule__GSSTMHeaderOutputField__Group_5_0__1"
    // InternalTMHEADEROUTPUT.g:724:1: rule__GSSTMHeaderOutputField__Group_5_0__1 : rule__GSSTMHeaderOutputField__Group_5_0__1__Impl rule__GSSTMHeaderOutputField__Group_5_0__2 ;
    public final void rule__GSSTMHeaderOutputField__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:728:1: ( rule__GSSTMHeaderOutputField__Group_5_0__1__Impl rule__GSSTMHeaderOutputField__Group_5_0__2 )
            // InternalTMHEADEROUTPUT.g:729:2: rule__GSSTMHeaderOutputField__Group_5_0__1__Impl rule__GSSTMHeaderOutputField__Group_5_0__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__GSSTMHeaderOutputField__Group_5_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutputField__Group_5_0__2();

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
    // $ANTLR end "rule__GSSTMHeaderOutputField__Group_5_0__1"


    // $ANTLR start "rule__GSSTMHeaderOutputField__Group_5_0__1__Impl"
    // InternalTMHEADEROUTPUT.g:736:1: rule__GSSTMHeaderOutputField__Group_5_0__1__Impl : ( ( rule__GSSTMHeaderOutputField__FieldValueAssignment_5_0_1 ) ) ;
    public final void rule__GSSTMHeaderOutputField__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:740:1: ( ( ( rule__GSSTMHeaderOutputField__FieldValueAssignment_5_0_1 ) ) )
            // InternalTMHEADEROUTPUT.g:741:1: ( ( rule__GSSTMHeaderOutputField__FieldValueAssignment_5_0_1 ) )
            {
            // InternalTMHEADEROUTPUT.g:741:1: ( ( rule__GSSTMHeaderOutputField__FieldValueAssignment_5_0_1 ) )
            // InternalTMHEADEROUTPUT.g:742:2: ( rule__GSSTMHeaderOutputField__FieldValueAssignment_5_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputFieldAccess().getFieldValueAssignment_5_0_1()); 
            }
            // InternalTMHEADEROUTPUT.g:743:2: ( rule__GSSTMHeaderOutputField__FieldValueAssignment_5_0_1 )
            // InternalTMHEADEROUTPUT.g:743:3: rule__GSSTMHeaderOutputField__FieldValueAssignment_5_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutputField__FieldValueAssignment_5_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputFieldAccess().getFieldValueAssignment_5_0_1()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutputField__Group_5_0__1__Impl"


    // $ANTLR start "rule__GSSTMHeaderOutputField__Group_5_0__2"
    // InternalTMHEADEROUTPUT.g:751:1: rule__GSSTMHeaderOutputField__Group_5_0__2 : rule__GSSTMHeaderOutputField__Group_5_0__2__Impl ;
    public final void rule__GSSTMHeaderOutputField__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:755:1: ( rule__GSSTMHeaderOutputField__Group_5_0__2__Impl )
            // InternalTMHEADEROUTPUT.g:756:2: rule__GSSTMHeaderOutputField__Group_5_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMHeaderOutputField__Group_5_0__2__Impl();

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
    // $ANTLR end "rule__GSSTMHeaderOutputField__Group_5_0__2"


    // $ANTLR start "rule__GSSTMHeaderOutputField__Group_5_0__2__Impl"
    // InternalTMHEADEROUTPUT.g:762:1: rule__GSSTMHeaderOutputField__Group_5_0__2__Impl : ( '</HeaderField>' ) ;
    public final void rule__GSSTMHeaderOutputField__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:766:1: ( ( '</HeaderField>' ) )
            // InternalTMHEADEROUTPUT.g:767:1: ( '</HeaderField>' )
            {
            // InternalTMHEADEROUTPUT.g:767:1: ( '</HeaderField>' )
            // InternalTMHEADEROUTPUT.g:768:2: '</HeaderField>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputFieldAccess().getHeaderFieldKeyword_5_0_2()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputFieldAccess().getHeaderFieldKeyword_5_0_2()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutputField__Group_5_0__2__Impl"


    // $ANTLR start "rule__TMTCIFFieldValueRaw__Group__0"
    // InternalTMHEADEROUTPUT.g:778:1: rule__TMTCIFFieldValueRaw__Group__0 : rule__TMTCIFFieldValueRaw__Group__0__Impl rule__TMTCIFFieldValueRaw__Group__1 ;
    public final void rule__TMTCIFFieldValueRaw__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:782:1: ( rule__TMTCIFFieldValueRaw__Group__0__Impl rule__TMTCIFFieldValueRaw__Group__1 )
            // InternalTMHEADEROUTPUT.g:783:2: rule__TMTCIFFieldValueRaw__Group__0__Impl rule__TMTCIFFieldValueRaw__Group__1
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
    // InternalTMHEADEROUTPUT.g:790:1: rule__TMTCIFFieldValueRaw__Group__0__Impl : ( '<FieldValueRaw' ) ;
    public final void rule__TMTCIFFieldValueRaw__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:794:1: ( ( '<FieldValueRaw' ) )
            // InternalTMHEADEROUTPUT.g:795:1: ( '<FieldValueRaw' )
            {
            // InternalTMHEADEROUTPUT.g:795:1: ( '<FieldValueRaw' )
            // InternalTMHEADEROUTPUT.g:796:2: '<FieldValueRaw'
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
    // InternalTMHEADEROUTPUT.g:805:1: rule__TMTCIFFieldValueRaw__Group__1 : rule__TMTCIFFieldValueRaw__Group__1__Impl rule__TMTCIFFieldValueRaw__Group__2 ;
    public final void rule__TMTCIFFieldValueRaw__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:809:1: ( rule__TMTCIFFieldValueRaw__Group__1__Impl rule__TMTCIFFieldValueRaw__Group__2 )
            // InternalTMHEADEROUTPUT.g:810:2: rule__TMTCIFFieldValueRaw__Group__1__Impl rule__TMTCIFFieldValueRaw__Group__2
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
    // InternalTMHEADEROUTPUT.g:817:1: rule__TMTCIFFieldValueRaw__Group__1__Impl : ( 'value=' ) ;
    public final void rule__TMTCIFFieldValueRaw__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:821:1: ( ( 'value=' ) )
            // InternalTMHEADEROUTPUT.g:822:1: ( 'value=' )
            {
            // InternalTMHEADEROUTPUT.g:822:1: ( 'value=' )
            // InternalTMHEADEROUTPUT.g:823:2: 'value='
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
    // InternalTMHEADEROUTPUT.g:832:1: rule__TMTCIFFieldValueRaw__Group__2 : rule__TMTCIFFieldValueRaw__Group__2__Impl rule__TMTCIFFieldValueRaw__Group__3 ;
    public final void rule__TMTCIFFieldValueRaw__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:836:1: ( rule__TMTCIFFieldValueRaw__Group__2__Impl rule__TMTCIFFieldValueRaw__Group__3 )
            // InternalTMHEADEROUTPUT.g:837:2: rule__TMTCIFFieldValueRaw__Group__2__Impl rule__TMTCIFFieldValueRaw__Group__3
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
    // InternalTMHEADEROUTPUT.g:844:1: rule__TMTCIFFieldValueRaw__Group__2__Impl : ( ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 ) ) ;
    public final void rule__TMTCIFFieldValueRaw__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:848:1: ( ( ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 ) ) )
            // InternalTMHEADEROUTPUT.g:849:1: ( ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 ) )
            {
            // InternalTMHEADEROUTPUT.g:849:1: ( ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 ) )
            // InternalTMHEADEROUTPUT.g:850:2: ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAssignment_2()); 
            }
            // InternalTMHEADEROUTPUT.g:851:2: ( rule__TMTCIFFieldValueRaw__ValueAssignment_2 )
            // InternalTMHEADEROUTPUT.g:851:3: rule__TMTCIFFieldValueRaw__ValueAssignment_2
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
    // InternalTMHEADEROUTPUT.g:859:1: rule__TMTCIFFieldValueRaw__Group__3 : rule__TMTCIFFieldValueRaw__Group__3__Impl ;
    public final void rule__TMTCIFFieldValueRaw__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:863:1: ( rule__TMTCIFFieldValueRaw__Group__3__Impl )
            // InternalTMHEADEROUTPUT.g:864:2: rule__TMTCIFFieldValueRaw__Group__3__Impl
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
    // InternalTMHEADEROUTPUT.g:870:1: rule__TMTCIFFieldValueRaw__Group__3__Impl : ( '/>' ) ;
    public final void rule__TMTCIFFieldValueRaw__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:874:1: ( ( '/>' ) )
            // InternalTMHEADEROUTPUT.g:875:1: ( '/>' )
            {
            // InternalTMHEADEROUTPUT.g:875:1: ( '/>' )
            // InternalTMHEADEROUTPUT.g:876:2: '/>'
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


    // $ANTLR start "rule__GSSTMHeaderOutput__NameAssignment_2"
    // InternalTMHEADEROUTPUT.g:886:1: rule__GSSTMHeaderOutput__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GSSTMHeaderOutput__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:890:1: ( ( RULE_STRING ) )
            // InternalTMHEADEROUTPUT.g:891:2: ( RULE_STRING )
            {
            // InternalTMHEADEROUTPUT.g:891:2: ( RULE_STRING )
            // InternalTMHEADEROUTPUT.g:892:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputAccess().getNameSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutput__NameAssignment_2"


    // $ANTLR start "rule__GSSTMHeaderOutput__FormatAssignment_6"
    // InternalTMHEADEROUTPUT.g:901:1: rule__GSSTMHeaderOutput__FormatAssignment_6 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTMHeaderOutput__FormatAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:905:1: ( ( ( RULE_STRING ) ) )
            // InternalTMHEADEROUTPUT.g:906:2: ( ( RULE_STRING ) )
            {
            // InternalTMHEADEROUTPUT.g:906:2: ( ( RULE_STRING ) )
            // InternalTMHEADEROUTPUT.g:907:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputAccess().getFormatGSSFormatFormatCrossReference_6_0()); 
            }
            // InternalTMHEADEROUTPUT.g:908:3: ( RULE_STRING )
            // InternalTMHEADEROUTPUT.g:909:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputAccess().getFormatGSSFormatFormatSTRINGTerminalRuleCall_6_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputAccess().getFormatGSSFormatFormatSTRINGTerminalRuleCall_6_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputAccess().getFormatGSSFormatFormatCrossReference_6_0()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutput__FormatAssignment_6"


    // $ANTLR start "rule__GSSTMHeaderOutput__GssHeaderFieldsAssignment_8_1"
    // InternalTMHEADEROUTPUT.g:920:1: rule__GSSTMHeaderOutput__GssHeaderFieldsAssignment_8_1 : ( ruleGSSTMHeaderOutputField ) ;
    public final void rule__GSSTMHeaderOutput__GssHeaderFieldsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:924:1: ( ( ruleGSSTMHeaderOutputField ) )
            // InternalTMHEADEROUTPUT.g:925:2: ( ruleGSSTMHeaderOutputField )
            {
            // InternalTMHEADEROUTPUT.g:925:2: ( ruleGSSTMHeaderOutputField )
            // InternalTMHEADEROUTPUT.g:926:3: ruleGSSTMHeaderOutputField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputAccess().getGssHeaderFieldsGSSTMHeaderOutputFieldParserRuleCall_8_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSTMHeaderOutputField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputAccess().getGssHeaderFieldsGSSTMHeaderOutputFieldParserRuleCall_8_1_0()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutput__GssHeaderFieldsAssignment_8_1"


    // $ANTLR start "rule__GSSTMHeaderOutputField__NameAssignment_2"
    // InternalTMHEADEROUTPUT.g:935:1: rule__GSSTMHeaderOutputField__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GSSTMHeaderOutputField__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:939:1: ( ( RULE_STRING ) )
            // InternalTMHEADEROUTPUT.g:940:2: ( RULE_STRING )
            {
            // InternalTMHEADEROUTPUT.g:940:2: ( RULE_STRING )
            // InternalTMHEADEROUTPUT.g:941:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputFieldAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputFieldAccess().getNameSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutputField__NameAssignment_2"


    // $ANTLR start "rule__GSSTMHeaderOutputField__GssHeaderFieldAssignment_4"
    // InternalTMHEADEROUTPUT.g:950:1: rule__GSSTMHeaderOutputField__GssHeaderFieldAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTMHeaderOutputField__GssHeaderFieldAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:954:1: ( ( ( RULE_STRING ) ) )
            // InternalTMHEADEROUTPUT.g:955:2: ( ( RULE_STRING ) )
            {
            // InternalTMHEADEROUTPUT.g:955:2: ( ( RULE_STRING ) )
            // InternalTMHEADEROUTPUT.g:956:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputFieldAccess().getGssHeaderFieldGSSFormatFieldCrossReference_4_0()); 
            }
            // InternalTMHEADEROUTPUT.g:957:3: ( RULE_STRING )
            // InternalTMHEADEROUTPUT.g:958:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputFieldAccess().getGssHeaderFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputFieldAccess().getGssHeaderFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputFieldAccess().getGssHeaderFieldGSSFormatFieldCrossReference_4_0()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutputField__GssHeaderFieldAssignment_4"


    // $ANTLR start "rule__GSSTMHeaderOutputField__FieldValueAssignment_5_0_1"
    // InternalTMHEADEROUTPUT.g:969:1: rule__GSSTMHeaderOutputField__FieldValueAssignment_5_0_1 : ( ruleTMTCIFFieldValueRaw ) ;
    public final void rule__GSSTMHeaderOutputField__FieldValueAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:973:1: ( ( ruleTMTCIFFieldValueRaw ) )
            // InternalTMHEADEROUTPUT.g:974:2: ( ruleTMTCIFFieldValueRaw )
            {
            // InternalTMHEADEROUTPUT.g:974:2: ( ruleTMTCIFFieldValueRaw )
            // InternalTMHEADEROUTPUT.g:975:3: ruleTMTCIFFieldValueRaw
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMHeaderOutputFieldAccess().getFieldValueTMTCIFFieldValueRawParserRuleCall_5_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFieldValueRaw();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMHeaderOutputFieldAccess().getFieldValueTMTCIFFieldValueRawParserRuleCall_5_0_1_0()); 
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
    // $ANTLR end "rule__GSSTMHeaderOutputField__FieldValueAssignment_5_0_1"


    // $ANTLR start "rule__TMTCIFFieldValueRaw__ValueAssignment_2"
    // InternalTMHEADEROUTPUT.g:984:1: rule__TMTCIFFieldValueRaw__ValueAssignment_2 : ( ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 ) ) ;
    public final void rule__TMTCIFFieldValueRaw__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMHEADEROUTPUT.g:988:1: ( ( ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 ) ) )
            // InternalTMHEADEROUTPUT.g:989:2: ( ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 ) )
            {
            // InternalTMHEADEROUTPUT.g:989:2: ( ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 ) )
            // InternalTMHEADEROUTPUT.g:990:3: ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFieldValueRawAccess().getValueAlternatives_2_0()); 
            }
            // InternalTMHEADEROUTPUT.g:991:3: ( rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0 )
            // InternalTMHEADEROUTPUT.g:991:4: rule__TMTCIFFieldValueRaw__ValueAlternatives_2_0
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