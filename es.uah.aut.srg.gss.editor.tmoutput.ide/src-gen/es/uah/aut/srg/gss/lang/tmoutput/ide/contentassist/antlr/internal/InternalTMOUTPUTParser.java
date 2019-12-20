package es.uah.aut.srg.gss.lang.tmoutput.ide.contentassist.antlr.internal;

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
public class InternalTMOUTPUTParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_UINT_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<GSSTMOutput'", "'name='", "'type='", "'subtype='", "'levels='", "'>'", "'</GSSTMOutput>'", "'pi1_val='", "'<level3_format'", "'file='", "'/>'", "'<level3_filter'", "'<from_level2_import'", "'<level2_format'", "'<level2_filter'", "'<from_level1_import'", "'<level1_format'", "'<level1_filter'", "'<from_level0_import'", "'<level0_format'", "'<level0_filter'", "'<fields>'", "'</fields>'", "'<OutputField'", "'gssField='"
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


    	private TMOUTPUTGrammarAccess grammarAccess;

    	public void setGrammarAccess(TMOUTPUTGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleGSSTMOutput"
    // InternalTMOUTPUT.g:61:1: entryRuleGSSTMOutput : ruleGSSTMOutput EOF ;
    public final void entryRuleGSSTMOutput() throws RecognitionException {
        try {
            // InternalTMOUTPUT.g:62:1: ( ruleGSSTMOutput EOF )
            // InternalTMOUTPUT.g:63:1: ruleGSSTMOutput EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSTMOutput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputRule()); 
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
    // $ANTLR end "entryRuleGSSTMOutput"


    // $ANTLR start "ruleGSSTMOutput"
    // InternalTMOUTPUT.g:70:1: ruleGSSTMOutput : ( ( rule__GSSTMOutput__Group__0 ) ) ;
    public final void ruleGSSTMOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:74:2: ( ( ( rule__GSSTMOutput__Group__0 ) ) )
            // InternalTMOUTPUT.g:75:2: ( ( rule__GSSTMOutput__Group__0 ) )
            {
            // InternalTMOUTPUT.g:75:2: ( ( rule__GSSTMOutput__Group__0 ) )
            // InternalTMOUTPUT.g:76:3: ( rule__GSSTMOutput__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getGroup()); 
            }
            // InternalTMOUTPUT.g:77:3: ( rule__GSSTMOutput__Group__0 )
            // InternalTMOUTPUT.g:77:4: rule__GSSTMOutput__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getGroup()); 
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
    // $ANTLR end "ruleGSSTMOutput"


    // $ANTLR start "entryRuleGSSTMOutputField"
    // InternalTMOUTPUT.g:86:1: entryRuleGSSTMOutputField : ruleGSSTMOutputField EOF ;
    public final void entryRuleGSSTMOutputField() throws RecognitionException {
        try {
            // InternalTMOUTPUT.g:87:1: ( ruleGSSTMOutputField EOF )
            // InternalTMOUTPUT.g:88:1: ruleGSSTMOutputField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSTMOutputField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputFieldRule()); 
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
    // $ANTLR end "entryRuleGSSTMOutputField"


    // $ANTLR start "ruleGSSTMOutputField"
    // InternalTMOUTPUT.g:95:1: ruleGSSTMOutputField : ( ( rule__GSSTMOutputField__Group__0 ) ) ;
    public final void ruleGSSTMOutputField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:99:2: ( ( ( rule__GSSTMOutputField__Group__0 ) ) )
            // InternalTMOUTPUT.g:100:2: ( ( rule__GSSTMOutputField__Group__0 ) )
            {
            // InternalTMOUTPUT.g:100:2: ( ( rule__GSSTMOutputField__Group__0 ) )
            // InternalTMOUTPUT.g:101:3: ( rule__GSSTMOutputField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputFieldAccess().getGroup()); 
            }
            // InternalTMOUTPUT.g:102:3: ( rule__GSSTMOutputField__Group__0 )
            // InternalTMOUTPUT.g:102:4: rule__GSSTMOutputField__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutputField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputFieldAccess().getGroup()); 
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
    // $ANTLR end "ruleGSSTMOutputField"


    // $ANTLR start "rule__GSSTMOutput__Group__0"
    // InternalTMOUTPUT.g:110:1: rule__GSSTMOutput__Group__0 : rule__GSSTMOutput__Group__0__Impl rule__GSSTMOutput__Group__1 ;
    public final void rule__GSSTMOutput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:114:1: ( rule__GSSTMOutput__Group__0__Impl rule__GSSTMOutput__Group__1 )
            // InternalTMOUTPUT.g:115:2: rule__GSSTMOutput__Group__0__Impl rule__GSSTMOutput__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__GSSTMOutput__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group__1();

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
    // $ANTLR end "rule__GSSTMOutput__Group__0"


    // $ANTLR start "rule__GSSTMOutput__Group__0__Impl"
    // InternalTMOUTPUT.g:122:1: rule__GSSTMOutput__Group__0__Impl : ( '<GSSTMOutput' ) ;
    public final void rule__GSSTMOutput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:126:1: ( ( '<GSSTMOutput' ) )
            // InternalTMOUTPUT.g:127:1: ( '<GSSTMOutput' )
            {
            // InternalTMOUTPUT.g:127:1: ( '<GSSTMOutput' )
            // InternalTMOUTPUT.g:128:2: '<GSSTMOutput'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getGSSTMOutputKeyword_0()); 
            }
            match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getGSSTMOutputKeyword_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group__0__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group__1"
    // InternalTMOUTPUT.g:137:1: rule__GSSTMOutput__Group__1 : rule__GSSTMOutput__Group__1__Impl rule__GSSTMOutput__Group__2 ;
    public final void rule__GSSTMOutput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:141:1: ( rule__GSSTMOutput__Group__1__Impl rule__GSSTMOutput__Group__2 )
            // InternalTMOUTPUT.g:142:2: rule__GSSTMOutput__Group__1__Impl rule__GSSTMOutput__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTMOutput__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group__2();

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
    // $ANTLR end "rule__GSSTMOutput__Group__1"


    // $ANTLR start "rule__GSSTMOutput__Group__1__Impl"
    // InternalTMOUTPUT.g:149:1: rule__GSSTMOutput__Group__1__Impl : ( 'name=' ) ;
    public final void rule__GSSTMOutput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:153:1: ( ( 'name=' ) )
            // InternalTMOUTPUT.g:154:1: ( 'name=' )
            {
            // InternalTMOUTPUT.g:154:1: ( 'name=' )
            // InternalTMOUTPUT.g:155:2: 'name='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getNameKeyword_1()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getNameKeyword_1()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group__1__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group__2"
    // InternalTMOUTPUT.g:164:1: rule__GSSTMOutput__Group__2 : rule__GSSTMOutput__Group__2__Impl rule__GSSTMOutput__Group__3 ;
    public final void rule__GSSTMOutput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:168:1: ( rule__GSSTMOutput__Group__2__Impl rule__GSSTMOutput__Group__3 )
            // InternalTMOUTPUT.g:169:2: rule__GSSTMOutput__Group__2__Impl rule__GSSTMOutput__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSTMOutput__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group__3();

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
    // $ANTLR end "rule__GSSTMOutput__Group__2"


    // $ANTLR start "rule__GSSTMOutput__Group__2__Impl"
    // InternalTMOUTPUT.g:176:1: rule__GSSTMOutput__Group__2__Impl : ( ( rule__GSSTMOutput__NameAssignment_2 ) ) ;
    public final void rule__GSSTMOutput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:180:1: ( ( ( rule__GSSTMOutput__NameAssignment_2 ) ) )
            // InternalTMOUTPUT.g:181:1: ( ( rule__GSSTMOutput__NameAssignment_2 ) )
            {
            // InternalTMOUTPUT.g:181:1: ( ( rule__GSSTMOutput__NameAssignment_2 ) )
            // InternalTMOUTPUT.g:182:2: ( rule__GSSTMOutput__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getNameAssignment_2()); 
            }
            // InternalTMOUTPUT.g:183:2: ( rule__GSSTMOutput__NameAssignment_2 )
            // InternalTMOUTPUT.g:183:3: rule__GSSTMOutput__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group__2__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group__3"
    // InternalTMOUTPUT.g:191:1: rule__GSSTMOutput__Group__3 : rule__GSSTMOutput__Group__3__Impl rule__GSSTMOutput__Group__4 ;
    public final void rule__GSSTMOutput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:195:1: ( rule__GSSTMOutput__Group__3__Impl rule__GSSTMOutput__Group__4 )
            // InternalTMOUTPUT.g:196:2: rule__GSSTMOutput__Group__3__Impl rule__GSSTMOutput__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSTMOutput__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group__4();

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
    // $ANTLR end "rule__GSSTMOutput__Group__3"


    // $ANTLR start "rule__GSSTMOutput__Group__3__Impl"
    // InternalTMOUTPUT.g:203:1: rule__GSSTMOutput__Group__3__Impl : ( 'type=' ) ;
    public final void rule__GSSTMOutput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:207:1: ( ( 'type=' ) )
            // InternalTMOUTPUT.g:208:1: ( 'type=' )
            {
            // InternalTMOUTPUT.g:208:1: ( 'type=' )
            // InternalTMOUTPUT.g:209:2: 'type='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getTypeKeyword_3()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getTypeKeyword_3()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group__3__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group__4"
    // InternalTMOUTPUT.g:218:1: rule__GSSTMOutput__Group__4 : rule__GSSTMOutput__Group__4__Impl rule__GSSTMOutput__Group__5 ;
    public final void rule__GSSTMOutput__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:222:1: ( rule__GSSTMOutput__Group__4__Impl rule__GSSTMOutput__Group__5 )
            // InternalTMOUTPUT.g:223:2: rule__GSSTMOutput__Group__4__Impl rule__GSSTMOutput__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSTMOutput__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group__5();

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
    // $ANTLR end "rule__GSSTMOutput__Group__4"


    // $ANTLR start "rule__GSSTMOutput__Group__4__Impl"
    // InternalTMOUTPUT.g:230:1: rule__GSSTMOutput__Group__4__Impl : ( ( rule__GSSTMOutput__TypeAssignment_4 ) ) ;
    public final void rule__GSSTMOutput__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:234:1: ( ( ( rule__GSSTMOutput__TypeAssignment_4 ) ) )
            // InternalTMOUTPUT.g:235:1: ( ( rule__GSSTMOutput__TypeAssignment_4 ) )
            {
            // InternalTMOUTPUT.g:235:1: ( ( rule__GSSTMOutput__TypeAssignment_4 ) )
            // InternalTMOUTPUT.g:236:2: ( rule__GSSTMOutput__TypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getTypeAssignment_4()); 
            }
            // InternalTMOUTPUT.g:237:2: ( rule__GSSTMOutput__TypeAssignment_4 )
            // InternalTMOUTPUT.g:237:3: rule__GSSTMOutput__TypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__TypeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getTypeAssignment_4()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group__4__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group__5"
    // InternalTMOUTPUT.g:245:1: rule__GSSTMOutput__Group__5 : rule__GSSTMOutput__Group__5__Impl rule__GSSTMOutput__Group__6 ;
    public final void rule__GSSTMOutput__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:249:1: ( rule__GSSTMOutput__Group__5__Impl rule__GSSTMOutput__Group__6 )
            // InternalTMOUTPUT.g:250:2: rule__GSSTMOutput__Group__5__Impl rule__GSSTMOutput__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSTMOutput__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group__6();

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
    // $ANTLR end "rule__GSSTMOutput__Group__5"


    // $ANTLR start "rule__GSSTMOutput__Group__5__Impl"
    // InternalTMOUTPUT.g:257:1: rule__GSSTMOutput__Group__5__Impl : ( 'subtype=' ) ;
    public final void rule__GSSTMOutput__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:261:1: ( ( 'subtype=' ) )
            // InternalTMOUTPUT.g:262:1: ( 'subtype=' )
            {
            // InternalTMOUTPUT.g:262:1: ( 'subtype=' )
            // InternalTMOUTPUT.g:263:2: 'subtype='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getSubtypeKeyword_5()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getSubtypeKeyword_5()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group__5__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group__6"
    // InternalTMOUTPUT.g:272:1: rule__GSSTMOutput__Group__6 : rule__GSSTMOutput__Group__6__Impl rule__GSSTMOutput__Group__7 ;
    public final void rule__GSSTMOutput__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:276:1: ( rule__GSSTMOutput__Group__6__Impl rule__GSSTMOutput__Group__7 )
            // InternalTMOUTPUT.g:277:2: rule__GSSTMOutput__Group__6__Impl rule__GSSTMOutput__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSTMOutput__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group__7();

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
    // $ANTLR end "rule__GSSTMOutput__Group__6"


    // $ANTLR start "rule__GSSTMOutput__Group__6__Impl"
    // InternalTMOUTPUT.g:284:1: rule__GSSTMOutput__Group__6__Impl : ( ( rule__GSSTMOutput__SubtypeAssignment_6 ) ) ;
    public final void rule__GSSTMOutput__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:288:1: ( ( ( rule__GSSTMOutput__SubtypeAssignment_6 ) ) )
            // InternalTMOUTPUT.g:289:1: ( ( rule__GSSTMOutput__SubtypeAssignment_6 ) )
            {
            // InternalTMOUTPUT.g:289:1: ( ( rule__GSSTMOutput__SubtypeAssignment_6 ) )
            // InternalTMOUTPUT.g:290:2: ( rule__GSSTMOutput__SubtypeAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getSubtypeAssignment_6()); 
            }
            // InternalTMOUTPUT.g:291:2: ( rule__GSSTMOutput__SubtypeAssignment_6 )
            // InternalTMOUTPUT.g:291:3: rule__GSSTMOutput__SubtypeAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__SubtypeAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getSubtypeAssignment_6()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group__6__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group__7"
    // InternalTMOUTPUT.g:299:1: rule__GSSTMOutput__Group__7 : rule__GSSTMOutput__Group__7__Impl rule__GSSTMOutput__Group__8 ;
    public final void rule__GSSTMOutput__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:303:1: ( rule__GSSTMOutput__Group__7__Impl rule__GSSTMOutput__Group__8 )
            // InternalTMOUTPUT.g:304:2: rule__GSSTMOutput__Group__7__Impl rule__GSSTMOutput__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSTMOutput__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group__8();

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
    // $ANTLR end "rule__GSSTMOutput__Group__7"


    // $ANTLR start "rule__GSSTMOutput__Group__7__Impl"
    // InternalTMOUTPUT.g:311:1: rule__GSSTMOutput__Group__7__Impl : ( ( rule__GSSTMOutput__Group_7__0 )? ) ;
    public final void rule__GSSTMOutput__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:315:1: ( ( ( rule__GSSTMOutput__Group_7__0 )? ) )
            // InternalTMOUTPUT.g:316:1: ( ( rule__GSSTMOutput__Group_7__0 )? )
            {
            // InternalTMOUTPUT.g:316:1: ( ( rule__GSSTMOutput__Group_7__0 )? )
            // InternalTMOUTPUT.g:317:2: ( rule__GSSTMOutput__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getGroup_7()); 
            }
            // InternalTMOUTPUT.g:318:2: ( rule__GSSTMOutput__Group_7__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTMOUTPUT.g:318:3: rule__GSSTMOutput__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTMOutput__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getGroup_7()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group__7__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group__8"
    // InternalTMOUTPUT.g:326:1: rule__GSSTMOutput__Group__8 : rule__GSSTMOutput__Group__8__Impl rule__GSSTMOutput__Group__9 ;
    public final void rule__GSSTMOutput__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:330:1: ( rule__GSSTMOutput__Group__8__Impl rule__GSSTMOutput__Group__9 )
            // InternalTMOUTPUT.g:331:2: rule__GSSTMOutput__Group__8__Impl rule__GSSTMOutput__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSTMOutput__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group__9();

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
    // $ANTLR end "rule__GSSTMOutput__Group__8"


    // $ANTLR start "rule__GSSTMOutput__Group__8__Impl"
    // InternalTMOUTPUT.g:338:1: rule__GSSTMOutput__Group__8__Impl : ( 'levels=' ) ;
    public final void rule__GSSTMOutput__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:342:1: ( ( 'levels=' ) )
            // InternalTMOUTPUT.g:343:1: ( 'levels=' )
            {
            // InternalTMOUTPUT.g:343:1: ( 'levels=' )
            // InternalTMOUTPUT.g:344:2: 'levels='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevelsKeyword_8()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevelsKeyword_8()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group__8__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group__9"
    // InternalTMOUTPUT.g:353:1: rule__GSSTMOutput__Group__9 : rule__GSSTMOutput__Group__9__Impl rule__GSSTMOutput__Group__10 ;
    public final void rule__GSSTMOutput__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:357:1: ( rule__GSSTMOutput__Group__9__Impl rule__GSSTMOutput__Group__10 )
            // InternalTMOUTPUT.g:358:2: rule__GSSTMOutput__Group__9__Impl rule__GSSTMOutput__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSTMOutput__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group__10();

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
    // $ANTLR end "rule__GSSTMOutput__Group__9"


    // $ANTLR start "rule__GSSTMOutput__Group__9__Impl"
    // InternalTMOUTPUT.g:365:1: rule__GSSTMOutput__Group__9__Impl : ( ( rule__GSSTMOutput__LevelsAssignment_9 ) ) ;
    public final void rule__GSSTMOutput__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:369:1: ( ( ( rule__GSSTMOutput__LevelsAssignment_9 ) ) )
            // InternalTMOUTPUT.g:370:1: ( ( rule__GSSTMOutput__LevelsAssignment_9 ) )
            {
            // InternalTMOUTPUT.g:370:1: ( ( rule__GSSTMOutput__LevelsAssignment_9 ) )
            // InternalTMOUTPUT.g:371:2: ( rule__GSSTMOutput__LevelsAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevelsAssignment_9()); 
            }
            // InternalTMOUTPUT.g:372:2: ( rule__GSSTMOutput__LevelsAssignment_9 )
            // InternalTMOUTPUT.g:372:3: rule__GSSTMOutput__LevelsAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__LevelsAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevelsAssignment_9()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group__9__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group__10"
    // InternalTMOUTPUT.g:380:1: rule__GSSTMOutput__Group__10 : rule__GSSTMOutput__Group__10__Impl rule__GSSTMOutput__Group__11 ;
    public final void rule__GSSTMOutput__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:384:1: ( rule__GSSTMOutput__Group__10__Impl rule__GSSTMOutput__Group__11 )
            // InternalTMOUTPUT.g:385:2: rule__GSSTMOutput__Group__10__Impl rule__GSSTMOutput__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTMOutput__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group__11();

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
    // $ANTLR end "rule__GSSTMOutput__Group__10"


    // $ANTLR start "rule__GSSTMOutput__Group__10__Impl"
    // InternalTMOUTPUT.g:392:1: rule__GSSTMOutput__Group__10__Impl : ( '>' ) ;
    public final void rule__GSSTMOutput__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:396:1: ( ( '>' ) )
            // InternalTMOUTPUT.g:397:1: ( '>' )
            {
            // InternalTMOUTPUT.g:397:1: ( '>' )
            // InternalTMOUTPUT.g:398:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getGreaterThanSignKeyword_10()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getGreaterThanSignKeyword_10()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group__10__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group__11"
    // InternalTMOUTPUT.g:407:1: rule__GSSTMOutput__Group__11 : rule__GSSTMOutput__Group__11__Impl rule__GSSTMOutput__Group__12 ;
    public final void rule__GSSTMOutput__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:411:1: ( rule__GSSTMOutput__Group__11__Impl rule__GSSTMOutput__Group__12 )
            // InternalTMOUTPUT.g:412:2: rule__GSSTMOutput__Group__11__Impl rule__GSSTMOutput__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTMOutput__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group__12();

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
    // $ANTLR end "rule__GSSTMOutput__Group__11"


    // $ANTLR start "rule__GSSTMOutput__Group__11__Impl"
    // InternalTMOUTPUT.g:419:1: rule__GSSTMOutput__Group__11__Impl : ( ( rule__GSSTMOutput__Group_11__0 )? ) ;
    public final void rule__GSSTMOutput__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:423:1: ( ( ( rule__GSSTMOutput__Group_11__0 )? ) )
            // InternalTMOUTPUT.g:424:1: ( ( rule__GSSTMOutput__Group_11__0 )? )
            {
            // InternalTMOUTPUT.g:424:1: ( ( rule__GSSTMOutput__Group_11__0 )? )
            // InternalTMOUTPUT.g:425:2: ( rule__GSSTMOutput__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getGroup_11()); 
            }
            // InternalTMOUTPUT.g:426:2: ( rule__GSSTMOutput__Group_11__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTMOUTPUT.g:426:3: rule__GSSTMOutput__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTMOutput__Group_11__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getGroup_11()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group__11__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group__12"
    // InternalTMOUTPUT.g:434:1: rule__GSSTMOutput__Group__12 : rule__GSSTMOutput__Group__12__Impl rule__GSSTMOutput__Group__13 ;
    public final void rule__GSSTMOutput__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:438:1: ( rule__GSSTMOutput__Group__12__Impl rule__GSSTMOutput__Group__13 )
            // InternalTMOUTPUT.g:439:2: rule__GSSTMOutput__Group__12__Impl rule__GSSTMOutput__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTMOutput__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group__13();

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
    // $ANTLR end "rule__GSSTMOutput__Group__12"


    // $ANTLR start "rule__GSSTMOutput__Group__12__Impl"
    // InternalTMOUTPUT.g:446:1: rule__GSSTMOutput__Group__12__Impl : ( ( rule__GSSTMOutput__Group_12__0 )? ) ;
    public final void rule__GSSTMOutput__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:450:1: ( ( ( rule__GSSTMOutput__Group_12__0 )? ) )
            // InternalTMOUTPUT.g:451:1: ( ( rule__GSSTMOutput__Group_12__0 )? )
            {
            // InternalTMOUTPUT.g:451:1: ( ( rule__GSSTMOutput__Group_12__0 )? )
            // InternalTMOUTPUT.g:452:2: ( rule__GSSTMOutput__Group_12__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getGroup_12()); 
            }
            // InternalTMOUTPUT.g:453:2: ( rule__GSSTMOutput__Group_12__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTMOUTPUT.g:453:3: rule__GSSTMOutput__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTMOutput__Group_12__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getGroup_12()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group__12__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group__13"
    // InternalTMOUTPUT.g:461:1: rule__GSSTMOutput__Group__13 : rule__GSSTMOutput__Group__13__Impl rule__GSSTMOutput__Group__14 ;
    public final void rule__GSSTMOutput__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:465:1: ( rule__GSSTMOutput__Group__13__Impl rule__GSSTMOutput__Group__14 )
            // InternalTMOUTPUT.g:466:2: rule__GSSTMOutput__Group__13__Impl rule__GSSTMOutput__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTMOutput__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group__14();

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
    // $ANTLR end "rule__GSSTMOutput__Group__13"


    // $ANTLR start "rule__GSSTMOutput__Group__13__Impl"
    // InternalTMOUTPUT.g:473:1: rule__GSSTMOutput__Group__13__Impl : ( ( rule__GSSTMOutput__Group_13__0 )? ) ;
    public final void rule__GSSTMOutput__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:477:1: ( ( ( rule__GSSTMOutput__Group_13__0 )? ) )
            // InternalTMOUTPUT.g:478:1: ( ( rule__GSSTMOutput__Group_13__0 )? )
            {
            // InternalTMOUTPUT.g:478:1: ( ( rule__GSSTMOutput__Group_13__0 )? )
            // InternalTMOUTPUT.g:479:2: ( rule__GSSTMOutput__Group_13__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getGroup_13()); 
            }
            // InternalTMOUTPUT.g:480:2: ( rule__GSSTMOutput__Group_13__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTMOUTPUT.g:480:3: rule__GSSTMOutput__Group_13__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTMOutput__Group_13__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getGroup_13()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group__13__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group__14"
    // InternalTMOUTPUT.g:488:1: rule__GSSTMOutput__Group__14 : rule__GSSTMOutput__Group__14__Impl rule__GSSTMOutput__Group__15 ;
    public final void rule__GSSTMOutput__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:492:1: ( rule__GSSTMOutput__Group__14__Impl rule__GSSTMOutput__Group__15 )
            // InternalTMOUTPUT.g:493:2: rule__GSSTMOutput__Group__14__Impl rule__GSSTMOutput__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTMOutput__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group__15();

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
    // $ANTLR end "rule__GSSTMOutput__Group__14"


    // $ANTLR start "rule__GSSTMOutput__Group__14__Impl"
    // InternalTMOUTPUT.g:500:1: rule__GSSTMOutput__Group__14__Impl : ( ( rule__GSSTMOutput__Group_14__0 )? ) ;
    public final void rule__GSSTMOutput__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:504:1: ( ( ( rule__GSSTMOutput__Group_14__0 )? ) )
            // InternalTMOUTPUT.g:505:1: ( ( rule__GSSTMOutput__Group_14__0 )? )
            {
            // InternalTMOUTPUT.g:505:1: ( ( rule__GSSTMOutput__Group_14__0 )? )
            // InternalTMOUTPUT.g:506:2: ( rule__GSSTMOutput__Group_14__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getGroup_14()); 
            }
            // InternalTMOUTPUT.g:507:2: ( rule__GSSTMOutput__Group_14__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTMOUTPUT.g:507:3: rule__GSSTMOutput__Group_14__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTMOutput__Group_14__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getGroup_14()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group__14__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group__15"
    // InternalTMOUTPUT.g:515:1: rule__GSSTMOutput__Group__15 : rule__GSSTMOutput__Group__15__Impl rule__GSSTMOutput__Group__16 ;
    public final void rule__GSSTMOutput__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:519:1: ( rule__GSSTMOutput__Group__15__Impl rule__GSSTMOutput__Group__16 )
            // InternalTMOUTPUT.g:520:2: rule__GSSTMOutput__Group__15__Impl rule__GSSTMOutput__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTMOutput__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group__16();

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
    // $ANTLR end "rule__GSSTMOutput__Group__15"


    // $ANTLR start "rule__GSSTMOutput__Group__15__Impl"
    // InternalTMOUTPUT.g:527:1: rule__GSSTMOutput__Group__15__Impl : ( ( rule__GSSTMOutput__Group_15__0 )? ) ;
    public final void rule__GSSTMOutput__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:531:1: ( ( ( rule__GSSTMOutput__Group_15__0 )? ) )
            // InternalTMOUTPUT.g:532:1: ( ( rule__GSSTMOutput__Group_15__0 )? )
            {
            // InternalTMOUTPUT.g:532:1: ( ( rule__GSSTMOutput__Group_15__0 )? )
            // InternalTMOUTPUT.g:533:2: ( rule__GSSTMOutput__Group_15__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getGroup_15()); 
            }
            // InternalTMOUTPUT.g:534:2: ( rule__GSSTMOutput__Group_15__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTMOUTPUT.g:534:3: rule__GSSTMOutput__Group_15__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTMOutput__Group_15__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getGroup_15()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group__15__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group__16"
    // InternalTMOUTPUT.g:542:1: rule__GSSTMOutput__Group__16 : rule__GSSTMOutput__Group__16__Impl rule__GSSTMOutput__Group__17 ;
    public final void rule__GSSTMOutput__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:546:1: ( rule__GSSTMOutput__Group__16__Impl rule__GSSTMOutput__Group__17 )
            // InternalTMOUTPUT.g:547:2: rule__GSSTMOutput__Group__16__Impl rule__GSSTMOutput__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTMOutput__Group__16__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group__17();

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
    // $ANTLR end "rule__GSSTMOutput__Group__16"


    // $ANTLR start "rule__GSSTMOutput__Group__16__Impl"
    // InternalTMOUTPUT.g:554:1: rule__GSSTMOutput__Group__16__Impl : ( ( rule__GSSTMOutput__Group_16__0 )? ) ;
    public final void rule__GSSTMOutput__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:558:1: ( ( ( rule__GSSTMOutput__Group_16__0 )? ) )
            // InternalTMOUTPUT.g:559:1: ( ( rule__GSSTMOutput__Group_16__0 )? )
            {
            // InternalTMOUTPUT.g:559:1: ( ( rule__GSSTMOutput__Group_16__0 )? )
            // InternalTMOUTPUT.g:560:2: ( rule__GSSTMOutput__Group_16__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getGroup_16()); 
            }
            // InternalTMOUTPUT.g:561:2: ( rule__GSSTMOutput__Group_16__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTMOUTPUT.g:561:3: rule__GSSTMOutput__Group_16__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTMOutput__Group_16__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getGroup_16()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group__16__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group__17"
    // InternalTMOUTPUT.g:569:1: rule__GSSTMOutput__Group__17 : rule__GSSTMOutput__Group__17__Impl rule__GSSTMOutput__Group__18 ;
    public final void rule__GSSTMOutput__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:573:1: ( rule__GSSTMOutput__Group__17__Impl rule__GSSTMOutput__Group__18 )
            // InternalTMOUTPUT.g:574:2: rule__GSSTMOutput__Group__17__Impl rule__GSSTMOutput__Group__18
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTMOutput__Group__17__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group__18();

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
    // $ANTLR end "rule__GSSTMOutput__Group__17"


    // $ANTLR start "rule__GSSTMOutput__Group__17__Impl"
    // InternalTMOUTPUT.g:581:1: rule__GSSTMOutput__Group__17__Impl : ( ( rule__GSSTMOutput__Group_17__0 )? ) ;
    public final void rule__GSSTMOutput__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:585:1: ( ( ( rule__GSSTMOutput__Group_17__0 )? ) )
            // InternalTMOUTPUT.g:586:1: ( ( rule__GSSTMOutput__Group_17__0 )? )
            {
            // InternalTMOUTPUT.g:586:1: ( ( rule__GSSTMOutput__Group_17__0 )? )
            // InternalTMOUTPUT.g:587:2: ( rule__GSSTMOutput__Group_17__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getGroup_17()); 
            }
            // InternalTMOUTPUT.g:588:2: ( rule__GSSTMOutput__Group_17__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTMOUTPUT.g:588:3: rule__GSSTMOutput__Group_17__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTMOutput__Group_17__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getGroup_17()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group__17__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group__18"
    // InternalTMOUTPUT.g:596:1: rule__GSSTMOutput__Group__18 : rule__GSSTMOutput__Group__18__Impl rule__GSSTMOutput__Group__19 ;
    public final void rule__GSSTMOutput__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:600:1: ( rule__GSSTMOutput__Group__18__Impl rule__GSSTMOutput__Group__19 )
            // InternalTMOUTPUT.g:601:2: rule__GSSTMOutput__Group__18__Impl rule__GSSTMOutput__Group__19
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTMOutput__Group__18__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group__19();

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
    // $ANTLR end "rule__GSSTMOutput__Group__18"


    // $ANTLR start "rule__GSSTMOutput__Group__18__Impl"
    // InternalTMOUTPUT.g:608:1: rule__GSSTMOutput__Group__18__Impl : ( ( rule__GSSTMOutput__Group_18__0 )? ) ;
    public final void rule__GSSTMOutput__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:612:1: ( ( ( rule__GSSTMOutput__Group_18__0 )? ) )
            // InternalTMOUTPUT.g:613:1: ( ( rule__GSSTMOutput__Group_18__0 )? )
            {
            // InternalTMOUTPUT.g:613:1: ( ( rule__GSSTMOutput__Group_18__0 )? )
            // InternalTMOUTPUT.g:614:2: ( rule__GSSTMOutput__Group_18__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getGroup_18()); 
            }
            // InternalTMOUTPUT.g:615:2: ( rule__GSSTMOutput__Group_18__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTMOUTPUT.g:615:3: rule__GSSTMOutput__Group_18__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTMOutput__Group_18__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getGroup_18()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group__18__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group__19"
    // InternalTMOUTPUT.g:623:1: rule__GSSTMOutput__Group__19 : rule__GSSTMOutput__Group__19__Impl rule__GSSTMOutput__Group__20 ;
    public final void rule__GSSTMOutput__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:627:1: ( rule__GSSTMOutput__Group__19__Impl rule__GSSTMOutput__Group__20 )
            // InternalTMOUTPUT.g:628:2: rule__GSSTMOutput__Group__19__Impl rule__GSSTMOutput__Group__20
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTMOutput__Group__19__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group__20();

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
    // $ANTLR end "rule__GSSTMOutput__Group__19"


    // $ANTLR start "rule__GSSTMOutput__Group__19__Impl"
    // InternalTMOUTPUT.g:635:1: rule__GSSTMOutput__Group__19__Impl : ( ( rule__GSSTMOutput__Group_19__0 )? ) ;
    public final void rule__GSSTMOutput__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:639:1: ( ( ( rule__GSSTMOutput__Group_19__0 )? ) )
            // InternalTMOUTPUT.g:640:1: ( ( rule__GSSTMOutput__Group_19__0 )? )
            {
            // InternalTMOUTPUT.g:640:1: ( ( rule__GSSTMOutput__Group_19__0 )? )
            // InternalTMOUTPUT.g:641:2: ( rule__GSSTMOutput__Group_19__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getGroup_19()); 
            }
            // InternalTMOUTPUT.g:642:2: ( rule__GSSTMOutput__Group_19__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTMOUTPUT.g:642:3: rule__GSSTMOutput__Group_19__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTMOutput__Group_19__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getGroup_19()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group__19__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group__20"
    // InternalTMOUTPUT.g:650:1: rule__GSSTMOutput__Group__20 : rule__GSSTMOutput__Group__20__Impl rule__GSSTMOutput__Group__21 ;
    public final void rule__GSSTMOutput__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:654:1: ( rule__GSSTMOutput__Group__20__Impl rule__GSSTMOutput__Group__21 )
            // InternalTMOUTPUT.g:655:2: rule__GSSTMOutput__Group__20__Impl rule__GSSTMOutput__Group__21
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTMOutput__Group__20__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group__21();

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
    // $ANTLR end "rule__GSSTMOutput__Group__20"


    // $ANTLR start "rule__GSSTMOutput__Group__20__Impl"
    // InternalTMOUTPUT.g:662:1: rule__GSSTMOutput__Group__20__Impl : ( ( rule__GSSTMOutput__Group_20__0 )? ) ;
    public final void rule__GSSTMOutput__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:666:1: ( ( ( rule__GSSTMOutput__Group_20__0 )? ) )
            // InternalTMOUTPUT.g:667:1: ( ( rule__GSSTMOutput__Group_20__0 )? )
            {
            // InternalTMOUTPUT.g:667:1: ( ( rule__GSSTMOutput__Group_20__0 )? )
            // InternalTMOUTPUT.g:668:2: ( rule__GSSTMOutput__Group_20__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getGroup_20()); 
            }
            // InternalTMOUTPUT.g:669:2: ( rule__GSSTMOutput__Group_20__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTMOUTPUT.g:669:3: rule__GSSTMOutput__Group_20__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTMOutput__Group_20__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getGroup_20()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group__20__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group__21"
    // InternalTMOUTPUT.g:677:1: rule__GSSTMOutput__Group__21 : rule__GSSTMOutput__Group__21__Impl rule__GSSTMOutput__Group__22 ;
    public final void rule__GSSTMOutput__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:681:1: ( rule__GSSTMOutput__Group__21__Impl rule__GSSTMOutput__Group__22 )
            // InternalTMOUTPUT.g:682:2: rule__GSSTMOutput__Group__21__Impl rule__GSSTMOutput__Group__22
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTMOutput__Group__21__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group__22();

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
    // $ANTLR end "rule__GSSTMOutput__Group__21"


    // $ANTLR start "rule__GSSTMOutput__Group__21__Impl"
    // InternalTMOUTPUT.g:689:1: rule__GSSTMOutput__Group__21__Impl : ( ( rule__GSSTMOutput__Group_21__0 )? ) ;
    public final void rule__GSSTMOutput__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:693:1: ( ( ( rule__GSSTMOutput__Group_21__0 )? ) )
            // InternalTMOUTPUT.g:694:1: ( ( rule__GSSTMOutput__Group_21__0 )? )
            {
            // InternalTMOUTPUT.g:694:1: ( ( rule__GSSTMOutput__Group_21__0 )? )
            // InternalTMOUTPUT.g:695:2: ( rule__GSSTMOutput__Group_21__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getGroup_21()); 
            }
            // InternalTMOUTPUT.g:696:2: ( rule__GSSTMOutput__Group_21__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTMOUTPUT.g:696:3: rule__GSSTMOutput__Group_21__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTMOutput__Group_21__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getGroup_21()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group__21__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group__22"
    // InternalTMOUTPUT.g:704:1: rule__GSSTMOutput__Group__22 : rule__GSSTMOutput__Group__22__Impl rule__GSSTMOutput__Group__23 ;
    public final void rule__GSSTMOutput__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:708:1: ( rule__GSSTMOutput__Group__22__Impl rule__GSSTMOutput__Group__23 )
            // InternalTMOUTPUT.g:709:2: rule__GSSTMOutput__Group__22__Impl rule__GSSTMOutput__Group__23
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTMOutput__Group__22__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group__23();

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
    // $ANTLR end "rule__GSSTMOutput__Group__22"


    // $ANTLR start "rule__GSSTMOutput__Group__22__Impl"
    // InternalTMOUTPUT.g:716:1: rule__GSSTMOutput__Group__22__Impl : ( ( rule__GSSTMOutput__Group_22__0 )? ) ;
    public final void rule__GSSTMOutput__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:720:1: ( ( ( rule__GSSTMOutput__Group_22__0 )? ) )
            // InternalTMOUTPUT.g:721:1: ( ( rule__GSSTMOutput__Group_22__0 )? )
            {
            // InternalTMOUTPUT.g:721:1: ( ( rule__GSSTMOutput__Group_22__0 )? )
            // InternalTMOUTPUT.g:722:2: ( rule__GSSTMOutput__Group_22__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getGroup_22()); 
            }
            // InternalTMOUTPUT.g:723:2: ( rule__GSSTMOutput__Group_22__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTMOUTPUT.g:723:3: rule__GSSTMOutput__Group_22__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTMOutput__Group_22__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getGroup_22()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group__22__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group__23"
    // InternalTMOUTPUT.g:731:1: rule__GSSTMOutput__Group__23 : rule__GSSTMOutput__Group__23__Impl ;
    public final void rule__GSSTMOutput__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:735:1: ( rule__GSSTMOutput__Group__23__Impl )
            // InternalTMOUTPUT.g:736:2: rule__GSSTMOutput__Group__23__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group__23__Impl();

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
    // $ANTLR end "rule__GSSTMOutput__Group__23"


    // $ANTLR start "rule__GSSTMOutput__Group__23__Impl"
    // InternalTMOUTPUT.g:742:1: rule__GSSTMOutput__Group__23__Impl : ( '</GSSTMOutput>' ) ;
    public final void rule__GSSTMOutput__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:746:1: ( ( '</GSSTMOutput>' ) )
            // InternalTMOUTPUT.g:747:1: ( '</GSSTMOutput>' )
            {
            // InternalTMOUTPUT.g:747:1: ( '</GSSTMOutput>' )
            // InternalTMOUTPUT.g:748:2: '</GSSTMOutput>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getGSSTMOutputKeyword_23()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getGSSTMOutputKeyword_23()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group__23__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_7__0"
    // InternalTMOUTPUT.g:758:1: rule__GSSTMOutput__Group_7__0 : rule__GSSTMOutput__Group_7__0__Impl rule__GSSTMOutput__Group_7__1 ;
    public final void rule__GSSTMOutput__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:762:1: ( rule__GSSTMOutput__Group_7__0__Impl rule__GSSTMOutput__Group_7__1 )
            // InternalTMOUTPUT.g:763:2: rule__GSSTMOutput__Group_7__0__Impl rule__GSSTMOutput__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSTMOutput__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_7__1();

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
    // $ANTLR end "rule__GSSTMOutput__Group_7__0"


    // $ANTLR start "rule__GSSTMOutput__Group_7__0__Impl"
    // InternalTMOUTPUT.g:770:1: rule__GSSTMOutput__Group_7__0__Impl : ( 'pi1_val=' ) ;
    public final void rule__GSSTMOutput__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:774:1: ( ( 'pi1_val=' ) )
            // InternalTMOUTPUT.g:775:1: ( 'pi1_val=' )
            {
            // InternalTMOUTPUT.g:775:1: ( 'pi1_val=' )
            // InternalTMOUTPUT.g:776:2: 'pi1_val='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getPi1_valKeyword_7_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getPi1_valKeyword_7_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_7__0__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_7__1"
    // InternalTMOUTPUT.g:785:1: rule__GSSTMOutput__Group_7__1 : rule__GSSTMOutput__Group_7__1__Impl ;
    public final void rule__GSSTMOutput__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:789:1: ( rule__GSSTMOutput__Group_7__1__Impl )
            // InternalTMOUTPUT.g:790:2: rule__GSSTMOutput__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_7__1__Impl();

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
    // $ANTLR end "rule__GSSTMOutput__Group_7__1"


    // $ANTLR start "rule__GSSTMOutput__Group_7__1__Impl"
    // InternalTMOUTPUT.g:796:1: rule__GSSTMOutput__Group_7__1__Impl : ( ( rule__GSSTMOutput__Pi1_valAssignment_7_1 ) ) ;
    public final void rule__GSSTMOutput__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:800:1: ( ( ( rule__GSSTMOutput__Pi1_valAssignment_7_1 ) ) )
            // InternalTMOUTPUT.g:801:1: ( ( rule__GSSTMOutput__Pi1_valAssignment_7_1 ) )
            {
            // InternalTMOUTPUT.g:801:1: ( ( rule__GSSTMOutput__Pi1_valAssignment_7_1 ) )
            // InternalTMOUTPUT.g:802:2: ( rule__GSSTMOutput__Pi1_valAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getPi1_valAssignment_7_1()); 
            }
            // InternalTMOUTPUT.g:803:2: ( rule__GSSTMOutput__Pi1_valAssignment_7_1 )
            // InternalTMOUTPUT.g:803:3: rule__GSSTMOutput__Pi1_valAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Pi1_valAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getPi1_valAssignment_7_1()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_7__1__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_11__0"
    // InternalTMOUTPUT.g:812:1: rule__GSSTMOutput__Group_11__0 : rule__GSSTMOutput__Group_11__0__Impl rule__GSSTMOutput__Group_11__1 ;
    public final void rule__GSSTMOutput__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:816:1: ( rule__GSSTMOutput__Group_11__0__Impl rule__GSSTMOutput__Group_11__1 )
            // InternalTMOUTPUT.g:817:2: rule__GSSTMOutput__Group_11__0__Impl rule__GSSTMOutput__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTMOutput__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_11__1();

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
    // $ANTLR end "rule__GSSTMOutput__Group_11__0"


    // $ANTLR start "rule__GSSTMOutput__Group_11__0__Impl"
    // InternalTMOUTPUT.g:824:1: rule__GSSTMOutput__Group_11__0__Impl : ( '<level3_format' ) ;
    public final void rule__GSSTMOutput__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:828:1: ( ( '<level3_format' ) )
            // InternalTMOUTPUT.g:829:1: ( '<level3_format' )
            {
            // InternalTMOUTPUT.g:829:1: ( '<level3_format' )
            // InternalTMOUTPUT.g:830:2: '<level3_format'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel3_formatKeyword_11_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel3_formatKeyword_11_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_11__0__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_11__1"
    // InternalTMOUTPUT.g:839:1: rule__GSSTMOutput__Group_11__1 : rule__GSSTMOutput__Group_11__1__Impl rule__GSSTMOutput__Group_11__2 ;
    public final void rule__GSSTMOutput__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:843:1: ( rule__GSSTMOutput__Group_11__1__Impl rule__GSSTMOutput__Group_11__2 )
            // InternalTMOUTPUT.g:844:2: rule__GSSTMOutput__Group_11__1__Impl rule__GSSTMOutput__Group_11__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTMOutput__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_11__2();

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
    // $ANTLR end "rule__GSSTMOutput__Group_11__1"


    // $ANTLR start "rule__GSSTMOutput__Group_11__1__Impl"
    // InternalTMOUTPUT.g:851:1: rule__GSSTMOutput__Group_11__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTMOutput__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:855:1: ( ( 'file=' ) )
            // InternalTMOUTPUT.g:856:1: ( 'file=' )
            {
            // InternalTMOUTPUT.g:856:1: ( 'file=' )
            // InternalTMOUTPUT.g:857:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getFileKeyword_11_1()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getFileKeyword_11_1()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_11__1__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_11__2"
    // InternalTMOUTPUT.g:866:1: rule__GSSTMOutput__Group_11__2 : rule__GSSTMOutput__Group_11__2__Impl rule__GSSTMOutput__Group_11__3 ;
    public final void rule__GSSTMOutput__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:870:1: ( rule__GSSTMOutput__Group_11__2__Impl rule__GSSTMOutput__Group_11__3 )
            // InternalTMOUTPUT.g:871:2: rule__GSSTMOutput__Group_11__2__Impl rule__GSSTMOutput__Group_11__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTMOutput__Group_11__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_11__3();

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
    // $ANTLR end "rule__GSSTMOutput__Group_11__2"


    // $ANTLR start "rule__GSSTMOutput__Group_11__2__Impl"
    // InternalTMOUTPUT.g:878:1: rule__GSSTMOutput__Group_11__2__Impl : ( ( rule__GSSTMOutput__Level3_formatAssignment_11_2 ) ) ;
    public final void rule__GSSTMOutput__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:882:1: ( ( ( rule__GSSTMOutput__Level3_formatAssignment_11_2 ) ) )
            // InternalTMOUTPUT.g:883:1: ( ( rule__GSSTMOutput__Level3_formatAssignment_11_2 ) )
            {
            // InternalTMOUTPUT.g:883:1: ( ( rule__GSSTMOutput__Level3_formatAssignment_11_2 ) )
            // InternalTMOUTPUT.g:884:2: ( rule__GSSTMOutput__Level3_formatAssignment_11_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel3_formatAssignment_11_2()); 
            }
            // InternalTMOUTPUT.g:885:2: ( rule__GSSTMOutput__Level3_formatAssignment_11_2 )
            // InternalTMOUTPUT.g:885:3: rule__GSSTMOutput__Level3_formatAssignment_11_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Level3_formatAssignment_11_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel3_formatAssignment_11_2()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_11__2__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_11__3"
    // InternalTMOUTPUT.g:893:1: rule__GSSTMOutput__Group_11__3 : rule__GSSTMOutput__Group_11__3__Impl ;
    public final void rule__GSSTMOutput__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:897:1: ( rule__GSSTMOutput__Group_11__3__Impl )
            // InternalTMOUTPUT.g:898:2: rule__GSSTMOutput__Group_11__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_11__3__Impl();

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
    // $ANTLR end "rule__GSSTMOutput__Group_11__3"


    // $ANTLR start "rule__GSSTMOutput__Group_11__3__Impl"
    // InternalTMOUTPUT.g:904:1: rule__GSSTMOutput__Group_11__3__Impl : ( '/>' ) ;
    public final void rule__GSSTMOutput__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:908:1: ( ( '/>' ) )
            // InternalTMOUTPUT.g:909:1: ( '/>' )
            {
            // InternalTMOUTPUT.g:909:1: ( '/>' )
            // InternalTMOUTPUT.g:910:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_11_3()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_11_3()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_11__3__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_12__0"
    // InternalTMOUTPUT.g:920:1: rule__GSSTMOutput__Group_12__0 : rule__GSSTMOutput__Group_12__0__Impl rule__GSSTMOutput__Group_12__1 ;
    public final void rule__GSSTMOutput__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:924:1: ( rule__GSSTMOutput__Group_12__0__Impl rule__GSSTMOutput__Group_12__1 )
            // InternalTMOUTPUT.g:925:2: rule__GSSTMOutput__Group_12__0__Impl rule__GSSTMOutput__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTMOutput__Group_12__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_12__1();

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
    // $ANTLR end "rule__GSSTMOutput__Group_12__0"


    // $ANTLR start "rule__GSSTMOutput__Group_12__0__Impl"
    // InternalTMOUTPUT.g:932:1: rule__GSSTMOutput__Group_12__0__Impl : ( '<level3_filter' ) ;
    public final void rule__GSSTMOutput__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:936:1: ( ( '<level3_filter' ) )
            // InternalTMOUTPUT.g:937:1: ( '<level3_filter' )
            {
            // InternalTMOUTPUT.g:937:1: ( '<level3_filter' )
            // InternalTMOUTPUT.g:938:2: '<level3_filter'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel3_filterKeyword_12_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel3_filterKeyword_12_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_12__0__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_12__1"
    // InternalTMOUTPUT.g:947:1: rule__GSSTMOutput__Group_12__1 : rule__GSSTMOutput__Group_12__1__Impl rule__GSSTMOutput__Group_12__2 ;
    public final void rule__GSSTMOutput__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:951:1: ( rule__GSSTMOutput__Group_12__1__Impl rule__GSSTMOutput__Group_12__2 )
            // InternalTMOUTPUT.g:952:2: rule__GSSTMOutput__Group_12__1__Impl rule__GSSTMOutput__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTMOutput__Group_12__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_12__2();

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
    // $ANTLR end "rule__GSSTMOutput__Group_12__1"


    // $ANTLR start "rule__GSSTMOutput__Group_12__1__Impl"
    // InternalTMOUTPUT.g:959:1: rule__GSSTMOutput__Group_12__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTMOutput__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:963:1: ( ( 'file=' ) )
            // InternalTMOUTPUT.g:964:1: ( 'file=' )
            {
            // InternalTMOUTPUT.g:964:1: ( 'file=' )
            // InternalTMOUTPUT.g:965:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getFileKeyword_12_1()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getFileKeyword_12_1()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_12__1__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_12__2"
    // InternalTMOUTPUT.g:974:1: rule__GSSTMOutput__Group_12__2 : rule__GSSTMOutput__Group_12__2__Impl rule__GSSTMOutput__Group_12__3 ;
    public final void rule__GSSTMOutput__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:978:1: ( rule__GSSTMOutput__Group_12__2__Impl rule__GSSTMOutput__Group_12__3 )
            // InternalTMOUTPUT.g:979:2: rule__GSSTMOutput__Group_12__2__Impl rule__GSSTMOutput__Group_12__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTMOutput__Group_12__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_12__3();

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
    // $ANTLR end "rule__GSSTMOutput__Group_12__2"


    // $ANTLR start "rule__GSSTMOutput__Group_12__2__Impl"
    // InternalTMOUTPUT.g:986:1: rule__GSSTMOutput__Group_12__2__Impl : ( ( rule__GSSTMOutput__Level3_filterAssignment_12_2 ) ) ;
    public final void rule__GSSTMOutput__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:990:1: ( ( ( rule__GSSTMOutput__Level3_filterAssignment_12_2 ) ) )
            // InternalTMOUTPUT.g:991:1: ( ( rule__GSSTMOutput__Level3_filterAssignment_12_2 ) )
            {
            // InternalTMOUTPUT.g:991:1: ( ( rule__GSSTMOutput__Level3_filterAssignment_12_2 ) )
            // InternalTMOUTPUT.g:992:2: ( rule__GSSTMOutput__Level3_filterAssignment_12_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel3_filterAssignment_12_2()); 
            }
            // InternalTMOUTPUT.g:993:2: ( rule__GSSTMOutput__Level3_filterAssignment_12_2 )
            // InternalTMOUTPUT.g:993:3: rule__GSSTMOutput__Level3_filterAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Level3_filterAssignment_12_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel3_filterAssignment_12_2()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_12__2__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_12__3"
    // InternalTMOUTPUT.g:1001:1: rule__GSSTMOutput__Group_12__3 : rule__GSSTMOutput__Group_12__3__Impl ;
    public final void rule__GSSTMOutput__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1005:1: ( rule__GSSTMOutput__Group_12__3__Impl )
            // InternalTMOUTPUT.g:1006:2: rule__GSSTMOutput__Group_12__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_12__3__Impl();

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
    // $ANTLR end "rule__GSSTMOutput__Group_12__3"


    // $ANTLR start "rule__GSSTMOutput__Group_12__3__Impl"
    // InternalTMOUTPUT.g:1012:1: rule__GSSTMOutput__Group_12__3__Impl : ( '/>' ) ;
    public final void rule__GSSTMOutput__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1016:1: ( ( '/>' ) )
            // InternalTMOUTPUT.g:1017:1: ( '/>' )
            {
            // InternalTMOUTPUT.g:1017:1: ( '/>' )
            // InternalTMOUTPUT.g:1018:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_12_3()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_12_3()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_12__3__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_13__0"
    // InternalTMOUTPUT.g:1028:1: rule__GSSTMOutput__Group_13__0 : rule__GSSTMOutput__Group_13__0__Impl rule__GSSTMOutput__Group_13__1 ;
    public final void rule__GSSTMOutput__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1032:1: ( rule__GSSTMOutput__Group_13__0__Impl rule__GSSTMOutput__Group_13__1 )
            // InternalTMOUTPUT.g:1033:2: rule__GSSTMOutput__Group_13__0__Impl rule__GSSTMOutput__Group_13__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTMOutput__Group_13__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_13__1();

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
    // $ANTLR end "rule__GSSTMOutput__Group_13__0"


    // $ANTLR start "rule__GSSTMOutput__Group_13__0__Impl"
    // InternalTMOUTPUT.g:1040:1: rule__GSSTMOutput__Group_13__0__Impl : ( '<from_level2_import' ) ;
    public final void rule__GSSTMOutput__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1044:1: ( ( '<from_level2_import' ) )
            // InternalTMOUTPUT.g:1045:1: ( '<from_level2_import' )
            {
            // InternalTMOUTPUT.g:1045:1: ( '<from_level2_import' )
            // InternalTMOUTPUT.g:1046:2: '<from_level2_import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getFrom_level2_importKeyword_13_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getFrom_level2_importKeyword_13_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_13__0__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_13__1"
    // InternalTMOUTPUT.g:1055:1: rule__GSSTMOutput__Group_13__1 : rule__GSSTMOutput__Group_13__1__Impl rule__GSSTMOutput__Group_13__2 ;
    public final void rule__GSSTMOutput__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1059:1: ( rule__GSSTMOutput__Group_13__1__Impl rule__GSSTMOutput__Group_13__2 )
            // InternalTMOUTPUT.g:1060:2: rule__GSSTMOutput__Group_13__1__Impl rule__GSSTMOutput__Group_13__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTMOutput__Group_13__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_13__2();

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
    // $ANTLR end "rule__GSSTMOutput__Group_13__1"


    // $ANTLR start "rule__GSSTMOutput__Group_13__1__Impl"
    // InternalTMOUTPUT.g:1067:1: rule__GSSTMOutput__Group_13__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTMOutput__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1071:1: ( ( 'file=' ) )
            // InternalTMOUTPUT.g:1072:1: ( 'file=' )
            {
            // InternalTMOUTPUT.g:1072:1: ( 'file=' )
            // InternalTMOUTPUT.g:1073:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getFileKeyword_13_1()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getFileKeyword_13_1()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_13__1__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_13__2"
    // InternalTMOUTPUT.g:1082:1: rule__GSSTMOutput__Group_13__2 : rule__GSSTMOutput__Group_13__2__Impl rule__GSSTMOutput__Group_13__3 ;
    public final void rule__GSSTMOutput__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1086:1: ( rule__GSSTMOutput__Group_13__2__Impl rule__GSSTMOutput__Group_13__3 )
            // InternalTMOUTPUT.g:1087:2: rule__GSSTMOutput__Group_13__2__Impl rule__GSSTMOutput__Group_13__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTMOutput__Group_13__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_13__3();

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
    // $ANTLR end "rule__GSSTMOutput__Group_13__2"


    // $ANTLR start "rule__GSSTMOutput__Group_13__2__Impl"
    // InternalTMOUTPUT.g:1094:1: rule__GSSTMOutput__Group_13__2__Impl : ( ( rule__GSSTMOutput__From_level2_importAssignment_13_2 ) ) ;
    public final void rule__GSSTMOutput__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1098:1: ( ( ( rule__GSSTMOutput__From_level2_importAssignment_13_2 ) ) )
            // InternalTMOUTPUT.g:1099:1: ( ( rule__GSSTMOutput__From_level2_importAssignment_13_2 ) )
            {
            // InternalTMOUTPUT.g:1099:1: ( ( rule__GSSTMOutput__From_level2_importAssignment_13_2 ) )
            // InternalTMOUTPUT.g:1100:2: ( rule__GSSTMOutput__From_level2_importAssignment_13_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getFrom_level2_importAssignment_13_2()); 
            }
            // InternalTMOUTPUT.g:1101:2: ( rule__GSSTMOutput__From_level2_importAssignment_13_2 )
            // InternalTMOUTPUT.g:1101:3: rule__GSSTMOutput__From_level2_importAssignment_13_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__From_level2_importAssignment_13_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getFrom_level2_importAssignment_13_2()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_13__2__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_13__3"
    // InternalTMOUTPUT.g:1109:1: rule__GSSTMOutput__Group_13__3 : rule__GSSTMOutput__Group_13__3__Impl ;
    public final void rule__GSSTMOutput__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1113:1: ( rule__GSSTMOutput__Group_13__3__Impl )
            // InternalTMOUTPUT.g:1114:2: rule__GSSTMOutput__Group_13__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_13__3__Impl();

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
    // $ANTLR end "rule__GSSTMOutput__Group_13__3"


    // $ANTLR start "rule__GSSTMOutput__Group_13__3__Impl"
    // InternalTMOUTPUT.g:1120:1: rule__GSSTMOutput__Group_13__3__Impl : ( '/>' ) ;
    public final void rule__GSSTMOutput__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1124:1: ( ( '/>' ) )
            // InternalTMOUTPUT.g:1125:1: ( '/>' )
            {
            // InternalTMOUTPUT.g:1125:1: ( '/>' )
            // InternalTMOUTPUT.g:1126:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_13_3()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_13_3()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_13__3__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_14__0"
    // InternalTMOUTPUT.g:1136:1: rule__GSSTMOutput__Group_14__0 : rule__GSSTMOutput__Group_14__0__Impl rule__GSSTMOutput__Group_14__1 ;
    public final void rule__GSSTMOutput__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1140:1: ( rule__GSSTMOutput__Group_14__0__Impl rule__GSSTMOutput__Group_14__1 )
            // InternalTMOUTPUT.g:1141:2: rule__GSSTMOutput__Group_14__0__Impl rule__GSSTMOutput__Group_14__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTMOutput__Group_14__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_14__1();

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
    // $ANTLR end "rule__GSSTMOutput__Group_14__0"


    // $ANTLR start "rule__GSSTMOutput__Group_14__0__Impl"
    // InternalTMOUTPUT.g:1148:1: rule__GSSTMOutput__Group_14__0__Impl : ( '<level2_format' ) ;
    public final void rule__GSSTMOutput__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1152:1: ( ( '<level2_format' ) )
            // InternalTMOUTPUT.g:1153:1: ( '<level2_format' )
            {
            // InternalTMOUTPUT.g:1153:1: ( '<level2_format' )
            // InternalTMOUTPUT.g:1154:2: '<level2_format'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel2_formatKeyword_14_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel2_formatKeyword_14_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_14__0__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_14__1"
    // InternalTMOUTPUT.g:1163:1: rule__GSSTMOutput__Group_14__1 : rule__GSSTMOutput__Group_14__1__Impl rule__GSSTMOutput__Group_14__2 ;
    public final void rule__GSSTMOutput__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1167:1: ( rule__GSSTMOutput__Group_14__1__Impl rule__GSSTMOutput__Group_14__2 )
            // InternalTMOUTPUT.g:1168:2: rule__GSSTMOutput__Group_14__1__Impl rule__GSSTMOutput__Group_14__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTMOutput__Group_14__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_14__2();

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
    // $ANTLR end "rule__GSSTMOutput__Group_14__1"


    // $ANTLR start "rule__GSSTMOutput__Group_14__1__Impl"
    // InternalTMOUTPUT.g:1175:1: rule__GSSTMOutput__Group_14__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTMOutput__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1179:1: ( ( 'file=' ) )
            // InternalTMOUTPUT.g:1180:1: ( 'file=' )
            {
            // InternalTMOUTPUT.g:1180:1: ( 'file=' )
            // InternalTMOUTPUT.g:1181:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getFileKeyword_14_1()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getFileKeyword_14_1()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_14__1__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_14__2"
    // InternalTMOUTPUT.g:1190:1: rule__GSSTMOutput__Group_14__2 : rule__GSSTMOutput__Group_14__2__Impl rule__GSSTMOutput__Group_14__3 ;
    public final void rule__GSSTMOutput__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1194:1: ( rule__GSSTMOutput__Group_14__2__Impl rule__GSSTMOutput__Group_14__3 )
            // InternalTMOUTPUT.g:1195:2: rule__GSSTMOutput__Group_14__2__Impl rule__GSSTMOutput__Group_14__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTMOutput__Group_14__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_14__3();

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
    // $ANTLR end "rule__GSSTMOutput__Group_14__2"


    // $ANTLR start "rule__GSSTMOutput__Group_14__2__Impl"
    // InternalTMOUTPUT.g:1202:1: rule__GSSTMOutput__Group_14__2__Impl : ( ( rule__GSSTMOutput__Level2_formatAssignment_14_2 ) ) ;
    public final void rule__GSSTMOutput__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1206:1: ( ( ( rule__GSSTMOutput__Level2_formatAssignment_14_2 ) ) )
            // InternalTMOUTPUT.g:1207:1: ( ( rule__GSSTMOutput__Level2_formatAssignment_14_2 ) )
            {
            // InternalTMOUTPUT.g:1207:1: ( ( rule__GSSTMOutput__Level2_formatAssignment_14_2 ) )
            // InternalTMOUTPUT.g:1208:2: ( rule__GSSTMOutput__Level2_formatAssignment_14_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel2_formatAssignment_14_2()); 
            }
            // InternalTMOUTPUT.g:1209:2: ( rule__GSSTMOutput__Level2_formatAssignment_14_2 )
            // InternalTMOUTPUT.g:1209:3: rule__GSSTMOutput__Level2_formatAssignment_14_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Level2_formatAssignment_14_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel2_formatAssignment_14_2()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_14__2__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_14__3"
    // InternalTMOUTPUT.g:1217:1: rule__GSSTMOutput__Group_14__3 : rule__GSSTMOutput__Group_14__3__Impl ;
    public final void rule__GSSTMOutput__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1221:1: ( rule__GSSTMOutput__Group_14__3__Impl )
            // InternalTMOUTPUT.g:1222:2: rule__GSSTMOutput__Group_14__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_14__3__Impl();

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
    // $ANTLR end "rule__GSSTMOutput__Group_14__3"


    // $ANTLR start "rule__GSSTMOutput__Group_14__3__Impl"
    // InternalTMOUTPUT.g:1228:1: rule__GSSTMOutput__Group_14__3__Impl : ( '/>' ) ;
    public final void rule__GSSTMOutput__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1232:1: ( ( '/>' ) )
            // InternalTMOUTPUT.g:1233:1: ( '/>' )
            {
            // InternalTMOUTPUT.g:1233:1: ( '/>' )
            // InternalTMOUTPUT.g:1234:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_14_3()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_14_3()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_14__3__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_15__0"
    // InternalTMOUTPUT.g:1244:1: rule__GSSTMOutput__Group_15__0 : rule__GSSTMOutput__Group_15__0__Impl rule__GSSTMOutput__Group_15__1 ;
    public final void rule__GSSTMOutput__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1248:1: ( rule__GSSTMOutput__Group_15__0__Impl rule__GSSTMOutput__Group_15__1 )
            // InternalTMOUTPUT.g:1249:2: rule__GSSTMOutput__Group_15__0__Impl rule__GSSTMOutput__Group_15__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTMOutput__Group_15__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_15__1();

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
    // $ANTLR end "rule__GSSTMOutput__Group_15__0"


    // $ANTLR start "rule__GSSTMOutput__Group_15__0__Impl"
    // InternalTMOUTPUT.g:1256:1: rule__GSSTMOutput__Group_15__0__Impl : ( '<level2_filter' ) ;
    public final void rule__GSSTMOutput__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1260:1: ( ( '<level2_filter' ) )
            // InternalTMOUTPUT.g:1261:1: ( '<level2_filter' )
            {
            // InternalTMOUTPUT.g:1261:1: ( '<level2_filter' )
            // InternalTMOUTPUT.g:1262:2: '<level2_filter'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel2_filterKeyword_15_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel2_filterKeyword_15_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_15__0__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_15__1"
    // InternalTMOUTPUT.g:1271:1: rule__GSSTMOutput__Group_15__1 : rule__GSSTMOutput__Group_15__1__Impl rule__GSSTMOutput__Group_15__2 ;
    public final void rule__GSSTMOutput__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1275:1: ( rule__GSSTMOutput__Group_15__1__Impl rule__GSSTMOutput__Group_15__2 )
            // InternalTMOUTPUT.g:1276:2: rule__GSSTMOutput__Group_15__1__Impl rule__GSSTMOutput__Group_15__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTMOutput__Group_15__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_15__2();

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
    // $ANTLR end "rule__GSSTMOutput__Group_15__1"


    // $ANTLR start "rule__GSSTMOutput__Group_15__1__Impl"
    // InternalTMOUTPUT.g:1283:1: rule__GSSTMOutput__Group_15__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTMOutput__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1287:1: ( ( 'file=' ) )
            // InternalTMOUTPUT.g:1288:1: ( 'file=' )
            {
            // InternalTMOUTPUT.g:1288:1: ( 'file=' )
            // InternalTMOUTPUT.g:1289:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getFileKeyword_15_1()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getFileKeyword_15_1()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_15__1__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_15__2"
    // InternalTMOUTPUT.g:1298:1: rule__GSSTMOutput__Group_15__2 : rule__GSSTMOutput__Group_15__2__Impl rule__GSSTMOutput__Group_15__3 ;
    public final void rule__GSSTMOutput__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1302:1: ( rule__GSSTMOutput__Group_15__2__Impl rule__GSSTMOutput__Group_15__3 )
            // InternalTMOUTPUT.g:1303:2: rule__GSSTMOutput__Group_15__2__Impl rule__GSSTMOutput__Group_15__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTMOutput__Group_15__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_15__3();

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
    // $ANTLR end "rule__GSSTMOutput__Group_15__2"


    // $ANTLR start "rule__GSSTMOutput__Group_15__2__Impl"
    // InternalTMOUTPUT.g:1310:1: rule__GSSTMOutput__Group_15__2__Impl : ( ( rule__GSSTMOutput__Level2_filterAssignment_15_2 ) ) ;
    public final void rule__GSSTMOutput__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1314:1: ( ( ( rule__GSSTMOutput__Level2_filterAssignment_15_2 ) ) )
            // InternalTMOUTPUT.g:1315:1: ( ( rule__GSSTMOutput__Level2_filterAssignment_15_2 ) )
            {
            // InternalTMOUTPUT.g:1315:1: ( ( rule__GSSTMOutput__Level2_filterAssignment_15_2 ) )
            // InternalTMOUTPUT.g:1316:2: ( rule__GSSTMOutput__Level2_filterAssignment_15_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel2_filterAssignment_15_2()); 
            }
            // InternalTMOUTPUT.g:1317:2: ( rule__GSSTMOutput__Level2_filterAssignment_15_2 )
            // InternalTMOUTPUT.g:1317:3: rule__GSSTMOutput__Level2_filterAssignment_15_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Level2_filterAssignment_15_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel2_filterAssignment_15_2()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_15__2__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_15__3"
    // InternalTMOUTPUT.g:1325:1: rule__GSSTMOutput__Group_15__3 : rule__GSSTMOutput__Group_15__3__Impl ;
    public final void rule__GSSTMOutput__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1329:1: ( rule__GSSTMOutput__Group_15__3__Impl )
            // InternalTMOUTPUT.g:1330:2: rule__GSSTMOutput__Group_15__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_15__3__Impl();

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
    // $ANTLR end "rule__GSSTMOutput__Group_15__3"


    // $ANTLR start "rule__GSSTMOutput__Group_15__3__Impl"
    // InternalTMOUTPUT.g:1336:1: rule__GSSTMOutput__Group_15__3__Impl : ( '/>' ) ;
    public final void rule__GSSTMOutput__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1340:1: ( ( '/>' ) )
            // InternalTMOUTPUT.g:1341:1: ( '/>' )
            {
            // InternalTMOUTPUT.g:1341:1: ( '/>' )
            // InternalTMOUTPUT.g:1342:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_15_3()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_15_3()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_15__3__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_16__0"
    // InternalTMOUTPUT.g:1352:1: rule__GSSTMOutput__Group_16__0 : rule__GSSTMOutput__Group_16__0__Impl rule__GSSTMOutput__Group_16__1 ;
    public final void rule__GSSTMOutput__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1356:1: ( rule__GSSTMOutput__Group_16__0__Impl rule__GSSTMOutput__Group_16__1 )
            // InternalTMOUTPUT.g:1357:2: rule__GSSTMOutput__Group_16__0__Impl rule__GSSTMOutput__Group_16__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTMOutput__Group_16__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_16__1();

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
    // $ANTLR end "rule__GSSTMOutput__Group_16__0"


    // $ANTLR start "rule__GSSTMOutput__Group_16__0__Impl"
    // InternalTMOUTPUT.g:1364:1: rule__GSSTMOutput__Group_16__0__Impl : ( '<from_level1_import' ) ;
    public final void rule__GSSTMOutput__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1368:1: ( ( '<from_level1_import' ) )
            // InternalTMOUTPUT.g:1369:1: ( '<from_level1_import' )
            {
            // InternalTMOUTPUT.g:1369:1: ( '<from_level1_import' )
            // InternalTMOUTPUT.g:1370:2: '<from_level1_import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getFrom_level1_importKeyword_16_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getFrom_level1_importKeyword_16_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_16__0__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_16__1"
    // InternalTMOUTPUT.g:1379:1: rule__GSSTMOutput__Group_16__1 : rule__GSSTMOutput__Group_16__1__Impl rule__GSSTMOutput__Group_16__2 ;
    public final void rule__GSSTMOutput__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1383:1: ( rule__GSSTMOutput__Group_16__1__Impl rule__GSSTMOutput__Group_16__2 )
            // InternalTMOUTPUT.g:1384:2: rule__GSSTMOutput__Group_16__1__Impl rule__GSSTMOutput__Group_16__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTMOutput__Group_16__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_16__2();

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
    // $ANTLR end "rule__GSSTMOutput__Group_16__1"


    // $ANTLR start "rule__GSSTMOutput__Group_16__1__Impl"
    // InternalTMOUTPUT.g:1391:1: rule__GSSTMOutput__Group_16__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTMOutput__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1395:1: ( ( 'file=' ) )
            // InternalTMOUTPUT.g:1396:1: ( 'file=' )
            {
            // InternalTMOUTPUT.g:1396:1: ( 'file=' )
            // InternalTMOUTPUT.g:1397:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getFileKeyword_16_1()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getFileKeyword_16_1()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_16__1__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_16__2"
    // InternalTMOUTPUT.g:1406:1: rule__GSSTMOutput__Group_16__2 : rule__GSSTMOutput__Group_16__2__Impl rule__GSSTMOutput__Group_16__3 ;
    public final void rule__GSSTMOutput__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1410:1: ( rule__GSSTMOutput__Group_16__2__Impl rule__GSSTMOutput__Group_16__3 )
            // InternalTMOUTPUT.g:1411:2: rule__GSSTMOutput__Group_16__2__Impl rule__GSSTMOutput__Group_16__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTMOutput__Group_16__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_16__3();

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
    // $ANTLR end "rule__GSSTMOutput__Group_16__2"


    // $ANTLR start "rule__GSSTMOutput__Group_16__2__Impl"
    // InternalTMOUTPUT.g:1418:1: rule__GSSTMOutput__Group_16__2__Impl : ( ( rule__GSSTMOutput__From_level1_importAssignment_16_2 ) ) ;
    public final void rule__GSSTMOutput__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1422:1: ( ( ( rule__GSSTMOutput__From_level1_importAssignment_16_2 ) ) )
            // InternalTMOUTPUT.g:1423:1: ( ( rule__GSSTMOutput__From_level1_importAssignment_16_2 ) )
            {
            // InternalTMOUTPUT.g:1423:1: ( ( rule__GSSTMOutput__From_level1_importAssignment_16_2 ) )
            // InternalTMOUTPUT.g:1424:2: ( rule__GSSTMOutput__From_level1_importAssignment_16_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getFrom_level1_importAssignment_16_2()); 
            }
            // InternalTMOUTPUT.g:1425:2: ( rule__GSSTMOutput__From_level1_importAssignment_16_2 )
            // InternalTMOUTPUT.g:1425:3: rule__GSSTMOutput__From_level1_importAssignment_16_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__From_level1_importAssignment_16_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getFrom_level1_importAssignment_16_2()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_16__2__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_16__3"
    // InternalTMOUTPUT.g:1433:1: rule__GSSTMOutput__Group_16__3 : rule__GSSTMOutput__Group_16__3__Impl ;
    public final void rule__GSSTMOutput__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1437:1: ( rule__GSSTMOutput__Group_16__3__Impl )
            // InternalTMOUTPUT.g:1438:2: rule__GSSTMOutput__Group_16__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_16__3__Impl();

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
    // $ANTLR end "rule__GSSTMOutput__Group_16__3"


    // $ANTLR start "rule__GSSTMOutput__Group_16__3__Impl"
    // InternalTMOUTPUT.g:1444:1: rule__GSSTMOutput__Group_16__3__Impl : ( '/>' ) ;
    public final void rule__GSSTMOutput__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1448:1: ( ( '/>' ) )
            // InternalTMOUTPUT.g:1449:1: ( '/>' )
            {
            // InternalTMOUTPUT.g:1449:1: ( '/>' )
            // InternalTMOUTPUT.g:1450:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_16_3()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_16_3()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_16__3__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_17__0"
    // InternalTMOUTPUT.g:1460:1: rule__GSSTMOutput__Group_17__0 : rule__GSSTMOutput__Group_17__0__Impl rule__GSSTMOutput__Group_17__1 ;
    public final void rule__GSSTMOutput__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1464:1: ( rule__GSSTMOutput__Group_17__0__Impl rule__GSSTMOutput__Group_17__1 )
            // InternalTMOUTPUT.g:1465:2: rule__GSSTMOutput__Group_17__0__Impl rule__GSSTMOutput__Group_17__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTMOutput__Group_17__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_17__1();

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
    // $ANTLR end "rule__GSSTMOutput__Group_17__0"


    // $ANTLR start "rule__GSSTMOutput__Group_17__0__Impl"
    // InternalTMOUTPUT.g:1472:1: rule__GSSTMOutput__Group_17__0__Impl : ( '<level1_format' ) ;
    public final void rule__GSSTMOutput__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1476:1: ( ( '<level1_format' ) )
            // InternalTMOUTPUT.g:1477:1: ( '<level1_format' )
            {
            // InternalTMOUTPUT.g:1477:1: ( '<level1_format' )
            // InternalTMOUTPUT.g:1478:2: '<level1_format'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel1_formatKeyword_17_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel1_formatKeyword_17_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_17__0__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_17__1"
    // InternalTMOUTPUT.g:1487:1: rule__GSSTMOutput__Group_17__1 : rule__GSSTMOutput__Group_17__1__Impl rule__GSSTMOutput__Group_17__2 ;
    public final void rule__GSSTMOutput__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1491:1: ( rule__GSSTMOutput__Group_17__1__Impl rule__GSSTMOutput__Group_17__2 )
            // InternalTMOUTPUT.g:1492:2: rule__GSSTMOutput__Group_17__1__Impl rule__GSSTMOutput__Group_17__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTMOutput__Group_17__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_17__2();

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
    // $ANTLR end "rule__GSSTMOutput__Group_17__1"


    // $ANTLR start "rule__GSSTMOutput__Group_17__1__Impl"
    // InternalTMOUTPUT.g:1499:1: rule__GSSTMOutput__Group_17__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTMOutput__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1503:1: ( ( 'file=' ) )
            // InternalTMOUTPUT.g:1504:1: ( 'file=' )
            {
            // InternalTMOUTPUT.g:1504:1: ( 'file=' )
            // InternalTMOUTPUT.g:1505:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getFileKeyword_17_1()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getFileKeyword_17_1()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_17__1__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_17__2"
    // InternalTMOUTPUT.g:1514:1: rule__GSSTMOutput__Group_17__2 : rule__GSSTMOutput__Group_17__2__Impl rule__GSSTMOutput__Group_17__3 ;
    public final void rule__GSSTMOutput__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1518:1: ( rule__GSSTMOutput__Group_17__2__Impl rule__GSSTMOutput__Group_17__3 )
            // InternalTMOUTPUT.g:1519:2: rule__GSSTMOutput__Group_17__2__Impl rule__GSSTMOutput__Group_17__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTMOutput__Group_17__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_17__3();

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
    // $ANTLR end "rule__GSSTMOutput__Group_17__2"


    // $ANTLR start "rule__GSSTMOutput__Group_17__2__Impl"
    // InternalTMOUTPUT.g:1526:1: rule__GSSTMOutput__Group_17__2__Impl : ( ( rule__GSSTMOutput__Level1_formatAssignment_17_2 ) ) ;
    public final void rule__GSSTMOutput__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1530:1: ( ( ( rule__GSSTMOutput__Level1_formatAssignment_17_2 ) ) )
            // InternalTMOUTPUT.g:1531:1: ( ( rule__GSSTMOutput__Level1_formatAssignment_17_2 ) )
            {
            // InternalTMOUTPUT.g:1531:1: ( ( rule__GSSTMOutput__Level1_formatAssignment_17_2 ) )
            // InternalTMOUTPUT.g:1532:2: ( rule__GSSTMOutput__Level1_formatAssignment_17_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel1_formatAssignment_17_2()); 
            }
            // InternalTMOUTPUT.g:1533:2: ( rule__GSSTMOutput__Level1_formatAssignment_17_2 )
            // InternalTMOUTPUT.g:1533:3: rule__GSSTMOutput__Level1_formatAssignment_17_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Level1_formatAssignment_17_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel1_formatAssignment_17_2()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_17__2__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_17__3"
    // InternalTMOUTPUT.g:1541:1: rule__GSSTMOutput__Group_17__3 : rule__GSSTMOutput__Group_17__3__Impl ;
    public final void rule__GSSTMOutput__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1545:1: ( rule__GSSTMOutput__Group_17__3__Impl )
            // InternalTMOUTPUT.g:1546:2: rule__GSSTMOutput__Group_17__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_17__3__Impl();

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
    // $ANTLR end "rule__GSSTMOutput__Group_17__3"


    // $ANTLR start "rule__GSSTMOutput__Group_17__3__Impl"
    // InternalTMOUTPUT.g:1552:1: rule__GSSTMOutput__Group_17__3__Impl : ( '/>' ) ;
    public final void rule__GSSTMOutput__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1556:1: ( ( '/>' ) )
            // InternalTMOUTPUT.g:1557:1: ( '/>' )
            {
            // InternalTMOUTPUT.g:1557:1: ( '/>' )
            // InternalTMOUTPUT.g:1558:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_17_3()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_17_3()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_17__3__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_18__0"
    // InternalTMOUTPUT.g:1568:1: rule__GSSTMOutput__Group_18__0 : rule__GSSTMOutput__Group_18__0__Impl rule__GSSTMOutput__Group_18__1 ;
    public final void rule__GSSTMOutput__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1572:1: ( rule__GSSTMOutput__Group_18__0__Impl rule__GSSTMOutput__Group_18__1 )
            // InternalTMOUTPUT.g:1573:2: rule__GSSTMOutput__Group_18__0__Impl rule__GSSTMOutput__Group_18__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTMOutput__Group_18__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_18__1();

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
    // $ANTLR end "rule__GSSTMOutput__Group_18__0"


    // $ANTLR start "rule__GSSTMOutput__Group_18__0__Impl"
    // InternalTMOUTPUT.g:1580:1: rule__GSSTMOutput__Group_18__0__Impl : ( '<level1_filter' ) ;
    public final void rule__GSSTMOutput__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1584:1: ( ( '<level1_filter' ) )
            // InternalTMOUTPUT.g:1585:1: ( '<level1_filter' )
            {
            // InternalTMOUTPUT.g:1585:1: ( '<level1_filter' )
            // InternalTMOUTPUT.g:1586:2: '<level1_filter'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel1_filterKeyword_18_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel1_filterKeyword_18_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_18__0__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_18__1"
    // InternalTMOUTPUT.g:1595:1: rule__GSSTMOutput__Group_18__1 : rule__GSSTMOutput__Group_18__1__Impl rule__GSSTMOutput__Group_18__2 ;
    public final void rule__GSSTMOutput__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1599:1: ( rule__GSSTMOutput__Group_18__1__Impl rule__GSSTMOutput__Group_18__2 )
            // InternalTMOUTPUT.g:1600:2: rule__GSSTMOutput__Group_18__1__Impl rule__GSSTMOutput__Group_18__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTMOutput__Group_18__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_18__2();

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
    // $ANTLR end "rule__GSSTMOutput__Group_18__1"


    // $ANTLR start "rule__GSSTMOutput__Group_18__1__Impl"
    // InternalTMOUTPUT.g:1607:1: rule__GSSTMOutput__Group_18__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTMOutput__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1611:1: ( ( 'file=' ) )
            // InternalTMOUTPUT.g:1612:1: ( 'file=' )
            {
            // InternalTMOUTPUT.g:1612:1: ( 'file=' )
            // InternalTMOUTPUT.g:1613:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getFileKeyword_18_1()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getFileKeyword_18_1()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_18__1__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_18__2"
    // InternalTMOUTPUT.g:1622:1: rule__GSSTMOutput__Group_18__2 : rule__GSSTMOutput__Group_18__2__Impl rule__GSSTMOutput__Group_18__3 ;
    public final void rule__GSSTMOutput__Group_18__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1626:1: ( rule__GSSTMOutput__Group_18__2__Impl rule__GSSTMOutput__Group_18__3 )
            // InternalTMOUTPUT.g:1627:2: rule__GSSTMOutput__Group_18__2__Impl rule__GSSTMOutput__Group_18__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTMOutput__Group_18__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_18__3();

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
    // $ANTLR end "rule__GSSTMOutput__Group_18__2"


    // $ANTLR start "rule__GSSTMOutput__Group_18__2__Impl"
    // InternalTMOUTPUT.g:1634:1: rule__GSSTMOutput__Group_18__2__Impl : ( ( rule__GSSTMOutput__Level1_filterAssignment_18_2 ) ) ;
    public final void rule__GSSTMOutput__Group_18__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1638:1: ( ( ( rule__GSSTMOutput__Level1_filterAssignment_18_2 ) ) )
            // InternalTMOUTPUT.g:1639:1: ( ( rule__GSSTMOutput__Level1_filterAssignment_18_2 ) )
            {
            // InternalTMOUTPUT.g:1639:1: ( ( rule__GSSTMOutput__Level1_filterAssignment_18_2 ) )
            // InternalTMOUTPUT.g:1640:2: ( rule__GSSTMOutput__Level1_filterAssignment_18_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel1_filterAssignment_18_2()); 
            }
            // InternalTMOUTPUT.g:1641:2: ( rule__GSSTMOutput__Level1_filterAssignment_18_2 )
            // InternalTMOUTPUT.g:1641:3: rule__GSSTMOutput__Level1_filterAssignment_18_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Level1_filterAssignment_18_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel1_filterAssignment_18_2()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_18__2__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_18__3"
    // InternalTMOUTPUT.g:1649:1: rule__GSSTMOutput__Group_18__3 : rule__GSSTMOutput__Group_18__3__Impl ;
    public final void rule__GSSTMOutput__Group_18__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1653:1: ( rule__GSSTMOutput__Group_18__3__Impl )
            // InternalTMOUTPUT.g:1654:2: rule__GSSTMOutput__Group_18__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_18__3__Impl();

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
    // $ANTLR end "rule__GSSTMOutput__Group_18__3"


    // $ANTLR start "rule__GSSTMOutput__Group_18__3__Impl"
    // InternalTMOUTPUT.g:1660:1: rule__GSSTMOutput__Group_18__3__Impl : ( '/>' ) ;
    public final void rule__GSSTMOutput__Group_18__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1664:1: ( ( '/>' ) )
            // InternalTMOUTPUT.g:1665:1: ( '/>' )
            {
            // InternalTMOUTPUT.g:1665:1: ( '/>' )
            // InternalTMOUTPUT.g:1666:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_18_3()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_18_3()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_18__3__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_19__0"
    // InternalTMOUTPUT.g:1676:1: rule__GSSTMOutput__Group_19__0 : rule__GSSTMOutput__Group_19__0__Impl rule__GSSTMOutput__Group_19__1 ;
    public final void rule__GSSTMOutput__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1680:1: ( rule__GSSTMOutput__Group_19__0__Impl rule__GSSTMOutput__Group_19__1 )
            // InternalTMOUTPUT.g:1681:2: rule__GSSTMOutput__Group_19__0__Impl rule__GSSTMOutput__Group_19__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTMOutput__Group_19__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_19__1();

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
    // $ANTLR end "rule__GSSTMOutput__Group_19__0"


    // $ANTLR start "rule__GSSTMOutput__Group_19__0__Impl"
    // InternalTMOUTPUT.g:1688:1: rule__GSSTMOutput__Group_19__0__Impl : ( '<from_level0_import' ) ;
    public final void rule__GSSTMOutput__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1692:1: ( ( '<from_level0_import' ) )
            // InternalTMOUTPUT.g:1693:1: ( '<from_level0_import' )
            {
            // InternalTMOUTPUT.g:1693:1: ( '<from_level0_import' )
            // InternalTMOUTPUT.g:1694:2: '<from_level0_import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getFrom_level0_importKeyword_19_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getFrom_level0_importKeyword_19_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_19__0__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_19__1"
    // InternalTMOUTPUT.g:1703:1: rule__GSSTMOutput__Group_19__1 : rule__GSSTMOutput__Group_19__1__Impl rule__GSSTMOutput__Group_19__2 ;
    public final void rule__GSSTMOutput__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1707:1: ( rule__GSSTMOutput__Group_19__1__Impl rule__GSSTMOutput__Group_19__2 )
            // InternalTMOUTPUT.g:1708:2: rule__GSSTMOutput__Group_19__1__Impl rule__GSSTMOutput__Group_19__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTMOutput__Group_19__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_19__2();

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
    // $ANTLR end "rule__GSSTMOutput__Group_19__1"


    // $ANTLR start "rule__GSSTMOutput__Group_19__1__Impl"
    // InternalTMOUTPUT.g:1715:1: rule__GSSTMOutput__Group_19__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTMOutput__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1719:1: ( ( 'file=' ) )
            // InternalTMOUTPUT.g:1720:1: ( 'file=' )
            {
            // InternalTMOUTPUT.g:1720:1: ( 'file=' )
            // InternalTMOUTPUT.g:1721:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getFileKeyword_19_1()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getFileKeyword_19_1()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_19__1__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_19__2"
    // InternalTMOUTPUT.g:1730:1: rule__GSSTMOutput__Group_19__2 : rule__GSSTMOutput__Group_19__2__Impl rule__GSSTMOutput__Group_19__3 ;
    public final void rule__GSSTMOutput__Group_19__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1734:1: ( rule__GSSTMOutput__Group_19__2__Impl rule__GSSTMOutput__Group_19__3 )
            // InternalTMOUTPUT.g:1735:2: rule__GSSTMOutput__Group_19__2__Impl rule__GSSTMOutput__Group_19__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTMOutput__Group_19__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_19__3();

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
    // $ANTLR end "rule__GSSTMOutput__Group_19__2"


    // $ANTLR start "rule__GSSTMOutput__Group_19__2__Impl"
    // InternalTMOUTPUT.g:1742:1: rule__GSSTMOutput__Group_19__2__Impl : ( ( rule__GSSTMOutput__From_level0_importAssignment_19_2 ) ) ;
    public final void rule__GSSTMOutput__Group_19__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1746:1: ( ( ( rule__GSSTMOutput__From_level0_importAssignment_19_2 ) ) )
            // InternalTMOUTPUT.g:1747:1: ( ( rule__GSSTMOutput__From_level0_importAssignment_19_2 ) )
            {
            // InternalTMOUTPUT.g:1747:1: ( ( rule__GSSTMOutput__From_level0_importAssignment_19_2 ) )
            // InternalTMOUTPUT.g:1748:2: ( rule__GSSTMOutput__From_level0_importAssignment_19_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getFrom_level0_importAssignment_19_2()); 
            }
            // InternalTMOUTPUT.g:1749:2: ( rule__GSSTMOutput__From_level0_importAssignment_19_2 )
            // InternalTMOUTPUT.g:1749:3: rule__GSSTMOutput__From_level0_importAssignment_19_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__From_level0_importAssignment_19_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getFrom_level0_importAssignment_19_2()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_19__2__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_19__3"
    // InternalTMOUTPUT.g:1757:1: rule__GSSTMOutput__Group_19__3 : rule__GSSTMOutput__Group_19__3__Impl ;
    public final void rule__GSSTMOutput__Group_19__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1761:1: ( rule__GSSTMOutput__Group_19__3__Impl )
            // InternalTMOUTPUT.g:1762:2: rule__GSSTMOutput__Group_19__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_19__3__Impl();

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
    // $ANTLR end "rule__GSSTMOutput__Group_19__3"


    // $ANTLR start "rule__GSSTMOutput__Group_19__3__Impl"
    // InternalTMOUTPUT.g:1768:1: rule__GSSTMOutput__Group_19__3__Impl : ( '/>' ) ;
    public final void rule__GSSTMOutput__Group_19__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1772:1: ( ( '/>' ) )
            // InternalTMOUTPUT.g:1773:1: ( '/>' )
            {
            // InternalTMOUTPUT.g:1773:1: ( '/>' )
            // InternalTMOUTPUT.g:1774:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_19_3()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_19_3()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_19__3__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_20__0"
    // InternalTMOUTPUT.g:1784:1: rule__GSSTMOutput__Group_20__0 : rule__GSSTMOutput__Group_20__0__Impl rule__GSSTMOutput__Group_20__1 ;
    public final void rule__GSSTMOutput__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1788:1: ( rule__GSSTMOutput__Group_20__0__Impl rule__GSSTMOutput__Group_20__1 )
            // InternalTMOUTPUT.g:1789:2: rule__GSSTMOutput__Group_20__0__Impl rule__GSSTMOutput__Group_20__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTMOutput__Group_20__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_20__1();

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
    // $ANTLR end "rule__GSSTMOutput__Group_20__0"


    // $ANTLR start "rule__GSSTMOutput__Group_20__0__Impl"
    // InternalTMOUTPUT.g:1796:1: rule__GSSTMOutput__Group_20__0__Impl : ( '<level0_format' ) ;
    public final void rule__GSSTMOutput__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1800:1: ( ( '<level0_format' ) )
            // InternalTMOUTPUT.g:1801:1: ( '<level0_format' )
            {
            // InternalTMOUTPUT.g:1801:1: ( '<level0_format' )
            // InternalTMOUTPUT.g:1802:2: '<level0_format'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel0_formatKeyword_20_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel0_formatKeyword_20_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_20__0__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_20__1"
    // InternalTMOUTPUT.g:1811:1: rule__GSSTMOutput__Group_20__1 : rule__GSSTMOutput__Group_20__1__Impl rule__GSSTMOutput__Group_20__2 ;
    public final void rule__GSSTMOutput__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1815:1: ( rule__GSSTMOutput__Group_20__1__Impl rule__GSSTMOutput__Group_20__2 )
            // InternalTMOUTPUT.g:1816:2: rule__GSSTMOutput__Group_20__1__Impl rule__GSSTMOutput__Group_20__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTMOutput__Group_20__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_20__2();

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
    // $ANTLR end "rule__GSSTMOutput__Group_20__1"


    // $ANTLR start "rule__GSSTMOutput__Group_20__1__Impl"
    // InternalTMOUTPUT.g:1823:1: rule__GSSTMOutput__Group_20__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTMOutput__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1827:1: ( ( 'file=' ) )
            // InternalTMOUTPUT.g:1828:1: ( 'file=' )
            {
            // InternalTMOUTPUT.g:1828:1: ( 'file=' )
            // InternalTMOUTPUT.g:1829:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getFileKeyword_20_1()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getFileKeyword_20_1()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_20__1__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_20__2"
    // InternalTMOUTPUT.g:1838:1: rule__GSSTMOutput__Group_20__2 : rule__GSSTMOutput__Group_20__2__Impl rule__GSSTMOutput__Group_20__3 ;
    public final void rule__GSSTMOutput__Group_20__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1842:1: ( rule__GSSTMOutput__Group_20__2__Impl rule__GSSTMOutput__Group_20__3 )
            // InternalTMOUTPUT.g:1843:2: rule__GSSTMOutput__Group_20__2__Impl rule__GSSTMOutput__Group_20__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTMOutput__Group_20__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_20__3();

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
    // $ANTLR end "rule__GSSTMOutput__Group_20__2"


    // $ANTLR start "rule__GSSTMOutput__Group_20__2__Impl"
    // InternalTMOUTPUT.g:1850:1: rule__GSSTMOutput__Group_20__2__Impl : ( ( rule__GSSTMOutput__Level0_formatAssignment_20_2 ) ) ;
    public final void rule__GSSTMOutput__Group_20__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1854:1: ( ( ( rule__GSSTMOutput__Level0_formatAssignment_20_2 ) ) )
            // InternalTMOUTPUT.g:1855:1: ( ( rule__GSSTMOutput__Level0_formatAssignment_20_2 ) )
            {
            // InternalTMOUTPUT.g:1855:1: ( ( rule__GSSTMOutput__Level0_formatAssignment_20_2 ) )
            // InternalTMOUTPUT.g:1856:2: ( rule__GSSTMOutput__Level0_formatAssignment_20_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel0_formatAssignment_20_2()); 
            }
            // InternalTMOUTPUT.g:1857:2: ( rule__GSSTMOutput__Level0_formatAssignment_20_2 )
            // InternalTMOUTPUT.g:1857:3: rule__GSSTMOutput__Level0_formatAssignment_20_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Level0_formatAssignment_20_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel0_formatAssignment_20_2()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_20__2__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_20__3"
    // InternalTMOUTPUT.g:1865:1: rule__GSSTMOutput__Group_20__3 : rule__GSSTMOutput__Group_20__3__Impl ;
    public final void rule__GSSTMOutput__Group_20__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1869:1: ( rule__GSSTMOutput__Group_20__3__Impl )
            // InternalTMOUTPUT.g:1870:2: rule__GSSTMOutput__Group_20__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_20__3__Impl();

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
    // $ANTLR end "rule__GSSTMOutput__Group_20__3"


    // $ANTLR start "rule__GSSTMOutput__Group_20__3__Impl"
    // InternalTMOUTPUT.g:1876:1: rule__GSSTMOutput__Group_20__3__Impl : ( '/>' ) ;
    public final void rule__GSSTMOutput__Group_20__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1880:1: ( ( '/>' ) )
            // InternalTMOUTPUT.g:1881:1: ( '/>' )
            {
            // InternalTMOUTPUT.g:1881:1: ( '/>' )
            // InternalTMOUTPUT.g:1882:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_20_3()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_20_3()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_20__3__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_21__0"
    // InternalTMOUTPUT.g:1892:1: rule__GSSTMOutput__Group_21__0 : rule__GSSTMOutput__Group_21__0__Impl rule__GSSTMOutput__Group_21__1 ;
    public final void rule__GSSTMOutput__Group_21__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1896:1: ( rule__GSSTMOutput__Group_21__0__Impl rule__GSSTMOutput__Group_21__1 )
            // InternalTMOUTPUT.g:1897:2: rule__GSSTMOutput__Group_21__0__Impl rule__GSSTMOutput__Group_21__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTMOutput__Group_21__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_21__1();

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
    // $ANTLR end "rule__GSSTMOutput__Group_21__0"


    // $ANTLR start "rule__GSSTMOutput__Group_21__0__Impl"
    // InternalTMOUTPUT.g:1904:1: rule__GSSTMOutput__Group_21__0__Impl : ( '<level0_filter' ) ;
    public final void rule__GSSTMOutput__Group_21__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1908:1: ( ( '<level0_filter' ) )
            // InternalTMOUTPUT.g:1909:1: ( '<level0_filter' )
            {
            // InternalTMOUTPUT.g:1909:1: ( '<level0_filter' )
            // InternalTMOUTPUT.g:1910:2: '<level0_filter'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel0_filterKeyword_21_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel0_filterKeyword_21_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_21__0__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_21__1"
    // InternalTMOUTPUT.g:1919:1: rule__GSSTMOutput__Group_21__1 : rule__GSSTMOutput__Group_21__1__Impl rule__GSSTMOutput__Group_21__2 ;
    public final void rule__GSSTMOutput__Group_21__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1923:1: ( rule__GSSTMOutput__Group_21__1__Impl rule__GSSTMOutput__Group_21__2 )
            // InternalTMOUTPUT.g:1924:2: rule__GSSTMOutput__Group_21__1__Impl rule__GSSTMOutput__Group_21__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTMOutput__Group_21__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_21__2();

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
    // $ANTLR end "rule__GSSTMOutput__Group_21__1"


    // $ANTLR start "rule__GSSTMOutput__Group_21__1__Impl"
    // InternalTMOUTPUT.g:1931:1: rule__GSSTMOutput__Group_21__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTMOutput__Group_21__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1935:1: ( ( 'file=' ) )
            // InternalTMOUTPUT.g:1936:1: ( 'file=' )
            {
            // InternalTMOUTPUT.g:1936:1: ( 'file=' )
            // InternalTMOUTPUT.g:1937:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getFileKeyword_21_1()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getFileKeyword_21_1()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_21__1__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_21__2"
    // InternalTMOUTPUT.g:1946:1: rule__GSSTMOutput__Group_21__2 : rule__GSSTMOutput__Group_21__2__Impl rule__GSSTMOutput__Group_21__3 ;
    public final void rule__GSSTMOutput__Group_21__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1950:1: ( rule__GSSTMOutput__Group_21__2__Impl rule__GSSTMOutput__Group_21__3 )
            // InternalTMOUTPUT.g:1951:2: rule__GSSTMOutput__Group_21__2__Impl rule__GSSTMOutput__Group_21__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTMOutput__Group_21__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_21__3();

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
    // $ANTLR end "rule__GSSTMOutput__Group_21__2"


    // $ANTLR start "rule__GSSTMOutput__Group_21__2__Impl"
    // InternalTMOUTPUT.g:1958:1: rule__GSSTMOutput__Group_21__2__Impl : ( ( rule__GSSTMOutput__Level0_filterAssignment_21_2 ) ) ;
    public final void rule__GSSTMOutput__Group_21__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1962:1: ( ( ( rule__GSSTMOutput__Level0_filterAssignment_21_2 ) ) )
            // InternalTMOUTPUT.g:1963:1: ( ( rule__GSSTMOutput__Level0_filterAssignment_21_2 ) )
            {
            // InternalTMOUTPUT.g:1963:1: ( ( rule__GSSTMOutput__Level0_filterAssignment_21_2 ) )
            // InternalTMOUTPUT.g:1964:2: ( rule__GSSTMOutput__Level0_filterAssignment_21_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel0_filterAssignment_21_2()); 
            }
            // InternalTMOUTPUT.g:1965:2: ( rule__GSSTMOutput__Level0_filterAssignment_21_2 )
            // InternalTMOUTPUT.g:1965:3: rule__GSSTMOutput__Level0_filterAssignment_21_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Level0_filterAssignment_21_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel0_filterAssignment_21_2()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_21__2__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_21__3"
    // InternalTMOUTPUT.g:1973:1: rule__GSSTMOutput__Group_21__3 : rule__GSSTMOutput__Group_21__3__Impl ;
    public final void rule__GSSTMOutput__Group_21__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1977:1: ( rule__GSSTMOutput__Group_21__3__Impl )
            // InternalTMOUTPUT.g:1978:2: rule__GSSTMOutput__Group_21__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_21__3__Impl();

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
    // $ANTLR end "rule__GSSTMOutput__Group_21__3"


    // $ANTLR start "rule__GSSTMOutput__Group_21__3__Impl"
    // InternalTMOUTPUT.g:1984:1: rule__GSSTMOutput__Group_21__3__Impl : ( '/>' ) ;
    public final void rule__GSSTMOutput__Group_21__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:1988:1: ( ( '/>' ) )
            // InternalTMOUTPUT.g:1989:1: ( '/>' )
            {
            // InternalTMOUTPUT.g:1989:1: ( '/>' )
            // InternalTMOUTPUT.g:1990:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_21_3()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getSolidusGreaterThanSignKeyword_21_3()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_21__3__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_22__0"
    // InternalTMOUTPUT.g:2000:1: rule__GSSTMOutput__Group_22__0 : rule__GSSTMOutput__Group_22__0__Impl rule__GSSTMOutput__Group_22__1 ;
    public final void rule__GSSTMOutput__Group_22__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2004:1: ( rule__GSSTMOutput__Group_22__0__Impl rule__GSSTMOutput__Group_22__1 )
            // InternalTMOUTPUT.g:2005:2: rule__GSSTMOutput__Group_22__0__Impl rule__GSSTMOutput__Group_22__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__GSSTMOutput__Group_22__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_22__1();

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
    // $ANTLR end "rule__GSSTMOutput__Group_22__0"


    // $ANTLR start "rule__GSSTMOutput__Group_22__0__Impl"
    // InternalTMOUTPUT.g:2012:1: rule__GSSTMOutput__Group_22__0__Impl : ( '<fields>' ) ;
    public final void rule__GSSTMOutput__Group_22__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2016:1: ( ( '<fields>' ) )
            // InternalTMOUTPUT.g:2017:1: ( '<fields>' )
            {
            // InternalTMOUTPUT.g:2017:1: ( '<fields>' )
            // InternalTMOUTPUT.g:2018:2: '<fields>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getFieldsKeyword_22_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getFieldsKeyword_22_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_22__0__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_22__1"
    // InternalTMOUTPUT.g:2027:1: rule__GSSTMOutput__Group_22__1 : rule__GSSTMOutput__Group_22__1__Impl rule__GSSTMOutput__Group_22__2 ;
    public final void rule__GSSTMOutput__Group_22__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2031:1: ( rule__GSSTMOutput__Group_22__1__Impl rule__GSSTMOutput__Group_22__2 )
            // InternalTMOUTPUT.g:2032:2: rule__GSSTMOutput__Group_22__1__Impl rule__GSSTMOutput__Group_22__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__GSSTMOutput__Group_22__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_22__2();

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
    // $ANTLR end "rule__GSSTMOutput__Group_22__1"


    // $ANTLR start "rule__GSSTMOutput__Group_22__1__Impl"
    // InternalTMOUTPUT.g:2039:1: rule__GSSTMOutput__Group_22__1__Impl : ( ( ( rule__GSSTMOutput__GssFieldsAssignment_22_1 ) ) ( ( rule__GSSTMOutput__GssFieldsAssignment_22_1 )* ) ) ;
    public final void rule__GSSTMOutput__Group_22__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2043:1: ( ( ( ( rule__GSSTMOutput__GssFieldsAssignment_22_1 ) ) ( ( rule__GSSTMOutput__GssFieldsAssignment_22_1 )* ) ) )
            // InternalTMOUTPUT.g:2044:1: ( ( ( rule__GSSTMOutput__GssFieldsAssignment_22_1 ) ) ( ( rule__GSSTMOutput__GssFieldsAssignment_22_1 )* ) )
            {
            // InternalTMOUTPUT.g:2044:1: ( ( ( rule__GSSTMOutput__GssFieldsAssignment_22_1 ) ) ( ( rule__GSSTMOutput__GssFieldsAssignment_22_1 )* ) )
            // InternalTMOUTPUT.g:2045:2: ( ( rule__GSSTMOutput__GssFieldsAssignment_22_1 ) ) ( ( rule__GSSTMOutput__GssFieldsAssignment_22_1 )* )
            {
            // InternalTMOUTPUT.g:2045:2: ( ( rule__GSSTMOutput__GssFieldsAssignment_22_1 ) )
            // InternalTMOUTPUT.g:2046:3: ( rule__GSSTMOutput__GssFieldsAssignment_22_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getGssFieldsAssignment_22_1()); 
            }
            // InternalTMOUTPUT.g:2047:3: ( rule__GSSTMOutput__GssFieldsAssignment_22_1 )
            // InternalTMOUTPUT.g:2047:4: rule__GSSTMOutput__GssFieldsAssignment_22_1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__GSSTMOutput__GssFieldsAssignment_22_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getGssFieldsAssignment_22_1()); 
            }

            }

            // InternalTMOUTPUT.g:2050:2: ( ( rule__GSSTMOutput__GssFieldsAssignment_22_1 )* )
            // InternalTMOUTPUT.g:2051:3: ( rule__GSSTMOutput__GssFieldsAssignment_22_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getGssFieldsAssignment_22_1()); 
            }
            // InternalTMOUTPUT.g:2052:3: ( rule__GSSTMOutput__GssFieldsAssignment_22_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==35) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTMOUTPUT.g:2052:4: rule__GSSTMOutput__GssFieldsAssignment_22_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    rule__GSSTMOutput__GssFieldsAssignment_22_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getGssFieldsAssignment_22_1()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_22__1__Impl"


    // $ANTLR start "rule__GSSTMOutput__Group_22__2"
    // InternalTMOUTPUT.g:2061:1: rule__GSSTMOutput__Group_22__2 : rule__GSSTMOutput__Group_22__2__Impl ;
    public final void rule__GSSTMOutput__Group_22__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2065:1: ( rule__GSSTMOutput__Group_22__2__Impl )
            // InternalTMOUTPUT.g:2066:2: rule__GSSTMOutput__Group_22__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutput__Group_22__2__Impl();

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
    // $ANTLR end "rule__GSSTMOutput__Group_22__2"


    // $ANTLR start "rule__GSSTMOutput__Group_22__2__Impl"
    // InternalTMOUTPUT.g:2072:1: rule__GSSTMOutput__Group_22__2__Impl : ( '</fields>' ) ;
    public final void rule__GSSTMOutput__Group_22__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2076:1: ( ( '</fields>' ) )
            // InternalTMOUTPUT.g:2077:1: ( '</fields>' )
            {
            // InternalTMOUTPUT.g:2077:1: ( '</fields>' )
            // InternalTMOUTPUT.g:2078:2: '</fields>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getFieldsKeyword_22_2()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getFieldsKeyword_22_2()); 
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
    // $ANTLR end "rule__GSSTMOutput__Group_22__2__Impl"


    // $ANTLR start "rule__GSSTMOutputField__Group__0"
    // InternalTMOUTPUT.g:2088:1: rule__GSSTMOutputField__Group__0 : rule__GSSTMOutputField__Group__0__Impl rule__GSSTMOutputField__Group__1 ;
    public final void rule__GSSTMOutputField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2092:1: ( rule__GSSTMOutputField__Group__0__Impl rule__GSSTMOutputField__Group__1 )
            // InternalTMOUTPUT.g:2093:2: rule__GSSTMOutputField__Group__0__Impl rule__GSSTMOutputField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__GSSTMOutputField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutputField__Group__1();

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
    // $ANTLR end "rule__GSSTMOutputField__Group__0"


    // $ANTLR start "rule__GSSTMOutputField__Group__0__Impl"
    // InternalTMOUTPUT.g:2100:1: rule__GSSTMOutputField__Group__0__Impl : ( '<OutputField' ) ;
    public final void rule__GSSTMOutputField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2104:1: ( ( '<OutputField' ) )
            // InternalTMOUTPUT.g:2105:1: ( '<OutputField' )
            {
            // InternalTMOUTPUT.g:2105:1: ( '<OutputField' )
            // InternalTMOUTPUT.g:2106:2: '<OutputField'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputFieldAccess().getOutputFieldKeyword_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputFieldAccess().getOutputFieldKeyword_0()); 
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
    // $ANTLR end "rule__GSSTMOutputField__Group__0__Impl"


    // $ANTLR start "rule__GSSTMOutputField__Group__1"
    // InternalTMOUTPUT.g:2115:1: rule__GSSTMOutputField__Group__1 : rule__GSSTMOutputField__Group__1__Impl rule__GSSTMOutputField__Group__2 ;
    public final void rule__GSSTMOutputField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2119:1: ( rule__GSSTMOutputField__Group__1__Impl rule__GSSTMOutputField__Group__2 )
            // InternalTMOUTPUT.g:2120:2: rule__GSSTMOutputField__Group__1__Impl rule__GSSTMOutputField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTMOutputField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutputField__Group__2();

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
    // $ANTLR end "rule__GSSTMOutputField__Group__1"


    // $ANTLR start "rule__GSSTMOutputField__Group__1__Impl"
    // InternalTMOUTPUT.g:2127:1: rule__GSSTMOutputField__Group__1__Impl : ( 'name=' ) ;
    public final void rule__GSSTMOutputField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2131:1: ( ( 'name=' ) )
            // InternalTMOUTPUT.g:2132:1: ( 'name=' )
            {
            // InternalTMOUTPUT.g:2132:1: ( 'name=' )
            // InternalTMOUTPUT.g:2133:2: 'name='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputFieldAccess().getNameKeyword_1()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputFieldAccess().getNameKeyword_1()); 
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
    // $ANTLR end "rule__GSSTMOutputField__Group__1__Impl"


    // $ANTLR start "rule__GSSTMOutputField__Group__2"
    // InternalTMOUTPUT.g:2142:1: rule__GSSTMOutputField__Group__2 : rule__GSSTMOutputField__Group__2__Impl rule__GSSTMOutputField__Group__3 ;
    public final void rule__GSSTMOutputField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2146:1: ( rule__GSSTMOutputField__Group__2__Impl rule__GSSTMOutputField__Group__3 )
            // InternalTMOUTPUT.g:2147:2: rule__GSSTMOutputField__Group__2__Impl rule__GSSTMOutputField__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__GSSTMOutputField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutputField__Group__3();

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
    // $ANTLR end "rule__GSSTMOutputField__Group__2"


    // $ANTLR start "rule__GSSTMOutputField__Group__2__Impl"
    // InternalTMOUTPUT.g:2154:1: rule__GSSTMOutputField__Group__2__Impl : ( ( rule__GSSTMOutputField__NameAssignment_2 ) ) ;
    public final void rule__GSSTMOutputField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2158:1: ( ( ( rule__GSSTMOutputField__NameAssignment_2 ) ) )
            // InternalTMOUTPUT.g:2159:1: ( ( rule__GSSTMOutputField__NameAssignment_2 ) )
            {
            // InternalTMOUTPUT.g:2159:1: ( ( rule__GSSTMOutputField__NameAssignment_2 ) )
            // InternalTMOUTPUT.g:2160:2: ( rule__GSSTMOutputField__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputFieldAccess().getNameAssignment_2()); 
            }
            // InternalTMOUTPUT.g:2161:2: ( rule__GSSTMOutputField__NameAssignment_2 )
            // InternalTMOUTPUT.g:2161:3: rule__GSSTMOutputField__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutputField__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputFieldAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__GSSTMOutputField__Group__2__Impl"


    // $ANTLR start "rule__GSSTMOutputField__Group__3"
    // InternalTMOUTPUT.g:2169:1: rule__GSSTMOutputField__Group__3 : rule__GSSTMOutputField__Group__3__Impl rule__GSSTMOutputField__Group__4 ;
    public final void rule__GSSTMOutputField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2173:1: ( rule__GSSTMOutputField__Group__3__Impl rule__GSSTMOutputField__Group__4 )
            // InternalTMOUTPUT.g:2174:2: rule__GSSTMOutputField__Group__3__Impl rule__GSSTMOutputField__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTMOutputField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutputField__Group__4();

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
    // $ANTLR end "rule__GSSTMOutputField__Group__3"


    // $ANTLR start "rule__GSSTMOutputField__Group__3__Impl"
    // InternalTMOUTPUT.g:2181:1: rule__GSSTMOutputField__Group__3__Impl : ( 'gssField=' ) ;
    public final void rule__GSSTMOutputField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2185:1: ( ( 'gssField=' ) )
            // InternalTMOUTPUT.g:2186:1: ( 'gssField=' )
            {
            // InternalTMOUTPUT.g:2186:1: ( 'gssField=' )
            // InternalTMOUTPUT.g:2187:2: 'gssField='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputFieldAccess().getGssFieldKeyword_3()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputFieldAccess().getGssFieldKeyword_3()); 
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
    // $ANTLR end "rule__GSSTMOutputField__Group__3__Impl"


    // $ANTLR start "rule__GSSTMOutputField__Group__4"
    // InternalTMOUTPUT.g:2196:1: rule__GSSTMOutputField__Group__4 : rule__GSSTMOutputField__Group__4__Impl rule__GSSTMOutputField__Group__5 ;
    public final void rule__GSSTMOutputField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2200:1: ( rule__GSSTMOutputField__Group__4__Impl rule__GSSTMOutputField__Group__5 )
            // InternalTMOUTPUT.g:2201:2: rule__GSSTMOutputField__Group__4__Impl rule__GSSTMOutputField__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTMOutputField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutputField__Group__5();

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
    // $ANTLR end "rule__GSSTMOutputField__Group__4"


    // $ANTLR start "rule__GSSTMOutputField__Group__4__Impl"
    // InternalTMOUTPUT.g:2208:1: rule__GSSTMOutputField__Group__4__Impl : ( ( rule__GSSTMOutputField__GssFieldAssignment_4 ) ) ;
    public final void rule__GSSTMOutputField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2212:1: ( ( ( rule__GSSTMOutputField__GssFieldAssignment_4 ) ) )
            // InternalTMOUTPUT.g:2213:1: ( ( rule__GSSTMOutputField__GssFieldAssignment_4 ) )
            {
            // InternalTMOUTPUT.g:2213:1: ( ( rule__GSSTMOutputField__GssFieldAssignment_4 ) )
            // InternalTMOUTPUT.g:2214:2: ( rule__GSSTMOutputField__GssFieldAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputFieldAccess().getGssFieldAssignment_4()); 
            }
            // InternalTMOUTPUT.g:2215:2: ( rule__GSSTMOutputField__GssFieldAssignment_4 )
            // InternalTMOUTPUT.g:2215:3: rule__GSSTMOutputField__GssFieldAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutputField__GssFieldAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputFieldAccess().getGssFieldAssignment_4()); 
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
    // $ANTLR end "rule__GSSTMOutputField__Group__4__Impl"


    // $ANTLR start "rule__GSSTMOutputField__Group__5"
    // InternalTMOUTPUT.g:2223:1: rule__GSSTMOutputField__Group__5 : rule__GSSTMOutputField__Group__5__Impl ;
    public final void rule__GSSTMOutputField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2227:1: ( rule__GSSTMOutputField__Group__5__Impl )
            // InternalTMOUTPUT.g:2228:2: rule__GSSTMOutputField__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMOutputField__Group__5__Impl();

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
    // $ANTLR end "rule__GSSTMOutputField__Group__5"


    // $ANTLR start "rule__GSSTMOutputField__Group__5__Impl"
    // InternalTMOUTPUT.g:2234:1: rule__GSSTMOutputField__Group__5__Impl : ( '/>' ) ;
    public final void rule__GSSTMOutputField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2238:1: ( ( '/>' ) )
            // InternalTMOUTPUT.g:2239:1: ( '/>' )
            {
            // InternalTMOUTPUT.g:2239:1: ( '/>' )
            // InternalTMOUTPUT.g:2240:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputFieldAccess().getSolidusGreaterThanSignKeyword_5()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputFieldAccess().getSolidusGreaterThanSignKeyword_5()); 
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
    // $ANTLR end "rule__GSSTMOutputField__Group__5__Impl"


    // $ANTLR start "rule__GSSTMOutput__NameAssignment_2"
    // InternalTMOUTPUT.g:2250:1: rule__GSSTMOutput__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GSSTMOutput__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2254:1: ( ( RULE_STRING ) )
            // InternalTMOUTPUT.g:2255:2: ( RULE_STRING )
            {
            // InternalTMOUTPUT.g:2255:2: ( RULE_STRING )
            // InternalTMOUTPUT.g:2256:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getNameSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__NameAssignment_2"


    // $ANTLR start "rule__GSSTMOutput__TypeAssignment_4"
    // InternalTMOUTPUT.g:2265:1: rule__GSSTMOutput__TypeAssignment_4 : ( RULE_UINT_STRING ) ;
    public final void rule__GSSTMOutput__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2269:1: ( ( RULE_UINT_STRING ) )
            // InternalTMOUTPUT.g:2270:2: ( RULE_UINT_STRING )
            {
            // InternalTMOUTPUT.g:2270:2: ( RULE_UINT_STRING )
            // InternalTMOUTPUT.g:2271:3: RULE_UINT_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getTypeUINT_STRINGTerminalRuleCall_4_0()); 
            }
            match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getTypeUINT_STRINGTerminalRuleCall_4_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__TypeAssignment_4"


    // $ANTLR start "rule__GSSTMOutput__SubtypeAssignment_6"
    // InternalTMOUTPUT.g:2280:1: rule__GSSTMOutput__SubtypeAssignment_6 : ( RULE_UINT_STRING ) ;
    public final void rule__GSSTMOutput__SubtypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2284:1: ( ( RULE_UINT_STRING ) )
            // InternalTMOUTPUT.g:2285:2: ( RULE_UINT_STRING )
            {
            // InternalTMOUTPUT.g:2285:2: ( RULE_UINT_STRING )
            // InternalTMOUTPUT.g:2286:3: RULE_UINT_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getSubtypeUINT_STRINGTerminalRuleCall_6_0()); 
            }
            match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getSubtypeUINT_STRINGTerminalRuleCall_6_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__SubtypeAssignment_6"


    // $ANTLR start "rule__GSSTMOutput__Pi1_valAssignment_7_1"
    // InternalTMOUTPUT.g:2295:1: rule__GSSTMOutput__Pi1_valAssignment_7_1 : ( RULE_UINT_STRING ) ;
    public final void rule__GSSTMOutput__Pi1_valAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2299:1: ( ( RULE_UINT_STRING ) )
            // InternalTMOUTPUT.g:2300:2: ( RULE_UINT_STRING )
            {
            // InternalTMOUTPUT.g:2300:2: ( RULE_UINT_STRING )
            // InternalTMOUTPUT.g:2301:3: RULE_UINT_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getPi1_valUINT_STRINGTerminalRuleCall_7_1_0()); 
            }
            match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getPi1_valUINT_STRINGTerminalRuleCall_7_1_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__Pi1_valAssignment_7_1"


    // $ANTLR start "rule__GSSTMOutput__LevelsAssignment_9"
    // InternalTMOUTPUT.g:2310:1: rule__GSSTMOutput__LevelsAssignment_9 : ( RULE_UINT_STRING ) ;
    public final void rule__GSSTMOutput__LevelsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2314:1: ( ( RULE_UINT_STRING ) )
            // InternalTMOUTPUT.g:2315:2: ( RULE_UINT_STRING )
            {
            // InternalTMOUTPUT.g:2315:2: ( RULE_UINT_STRING )
            // InternalTMOUTPUT.g:2316:3: RULE_UINT_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevelsUINT_STRINGTerminalRuleCall_9_0()); 
            }
            match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevelsUINT_STRINGTerminalRuleCall_9_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__LevelsAssignment_9"


    // $ANTLR start "rule__GSSTMOutput__Level3_formatAssignment_11_2"
    // InternalTMOUTPUT.g:2325:1: rule__GSSTMOutput__Level3_formatAssignment_11_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTMOutput__Level3_formatAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2329:1: ( ( ( RULE_STRING ) ) )
            // InternalTMOUTPUT.g:2330:2: ( ( RULE_STRING ) )
            {
            // InternalTMOUTPUT.g:2330:2: ( ( RULE_STRING ) )
            // InternalTMOUTPUT.g:2331:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel3_formatGSSFormatFormatCrossReference_11_2_0()); 
            }
            // InternalTMOUTPUT.g:2332:3: ( RULE_STRING )
            // InternalTMOUTPUT.g:2333:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel3_formatGSSFormatFormatSTRINGTerminalRuleCall_11_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel3_formatGSSFormatFormatSTRINGTerminalRuleCall_11_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel3_formatGSSFormatFormatCrossReference_11_2_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__Level3_formatAssignment_11_2"


    // $ANTLR start "rule__GSSTMOutput__Level3_filterAssignment_12_2"
    // InternalTMOUTPUT.g:2344:1: rule__GSSTMOutput__Level3_filterAssignment_12_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTMOutput__Level3_filterAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2348:1: ( ( ( RULE_STRING ) ) )
            // InternalTMOUTPUT.g:2349:2: ( ( RULE_STRING ) )
            {
            // InternalTMOUTPUT.g:2349:2: ( ( RULE_STRING ) )
            // InternalTMOUTPUT.g:2350:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel3_filterGSSFilterFilterCrossReference_12_2_0()); 
            }
            // InternalTMOUTPUT.g:2351:3: ( RULE_STRING )
            // InternalTMOUTPUT.g:2352:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel3_filterGSSFilterFilterSTRINGTerminalRuleCall_12_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel3_filterGSSFilterFilterSTRINGTerminalRuleCall_12_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel3_filterGSSFilterFilterCrossReference_12_2_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__Level3_filterAssignment_12_2"


    // $ANTLR start "rule__GSSTMOutput__From_level2_importAssignment_13_2"
    // InternalTMOUTPUT.g:2363:1: rule__GSSTMOutput__From_level2_importAssignment_13_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTMOutput__From_level2_importAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2367:1: ( ( ( RULE_STRING ) ) )
            // InternalTMOUTPUT.g:2368:2: ( ( RULE_STRING ) )
            {
            // InternalTMOUTPUT.g:2368:2: ( ( RULE_STRING ) )
            // InternalTMOUTPUT.g:2369:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getFrom_level2_importGSSImportImportCrossReference_13_2_0()); 
            }
            // InternalTMOUTPUT.g:2370:3: ( RULE_STRING )
            // InternalTMOUTPUT.g:2371:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getFrom_level2_importGSSImportImportSTRINGTerminalRuleCall_13_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getFrom_level2_importGSSImportImportSTRINGTerminalRuleCall_13_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getFrom_level2_importGSSImportImportCrossReference_13_2_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__From_level2_importAssignment_13_2"


    // $ANTLR start "rule__GSSTMOutput__Level2_formatAssignment_14_2"
    // InternalTMOUTPUT.g:2382:1: rule__GSSTMOutput__Level2_formatAssignment_14_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTMOutput__Level2_formatAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2386:1: ( ( ( RULE_STRING ) ) )
            // InternalTMOUTPUT.g:2387:2: ( ( RULE_STRING ) )
            {
            // InternalTMOUTPUT.g:2387:2: ( ( RULE_STRING ) )
            // InternalTMOUTPUT.g:2388:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel2_formatGSSFormatFormatCrossReference_14_2_0()); 
            }
            // InternalTMOUTPUT.g:2389:3: ( RULE_STRING )
            // InternalTMOUTPUT.g:2390:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel2_formatGSSFormatFormatSTRINGTerminalRuleCall_14_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel2_formatGSSFormatFormatSTRINGTerminalRuleCall_14_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel2_formatGSSFormatFormatCrossReference_14_2_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__Level2_formatAssignment_14_2"


    // $ANTLR start "rule__GSSTMOutput__Level2_filterAssignment_15_2"
    // InternalTMOUTPUT.g:2401:1: rule__GSSTMOutput__Level2_filterAssignment_15_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTMOutput__Level2_filterAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2405:1: ( ( ( RULE_STRING ) ) )
            // InternalTMOUTPUT.g:2406:2: ( ( RULE_STRING ) )
            {
            // InternalTMOUTPUT.g:2406:2: ( ( RULE_STRING ) )
            // InternalTMOUTPUT.g:2407:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel2_filterGSSFilterFilterCrossReference_15_2_0()); 
            }
            // InternalTMOUTPUT.g:2408:3: ( RULE_STRING )
            // InternalTMOUTPUT.g:2409:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel2_filterGSSFilterFilterSTRINGTerminalRuleCall_15_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel2_filterGSSFilterFilterSTRINGTerminalRuleCall_15_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel2_filterGSSFilterFilterCrossReference_15_2_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__Level2_filterAssignment_15_2"


    // $ANTLR start "rule__GSSTMOutput__From_level1_importAssignment_16_2"
    // InternalTMOUTPUT.g:2420:1: rule__GSSTMOutput__From_level1_importAssignment_16_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTMOutput__From_level1_importAssignment_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2424:1: ( ( ( RULE_STRING ) ) )
            // InternalTMOUTPUT.g:2425:2: ( ( RULE_STRING ) )
            {
            // InternalTMOUTPUT.g:2425:2: ( ( RULE_STRING ) )
            // InternalTMOUTPUT.g:2426:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getFrom_level1_importGSSImportImportCrossReference_16_2_0()); 
            }
            // InternalTMOUTPUT.g:2427:3: ( RULE_STRING )
            // InternalTMOUTPUT.g:2428:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getFrom_level1_importGSSImportImportSTRINGTerminalRuleCall_16_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getFrom_level1_importGSSImportImportSTRINGTerminalRuleCall_16_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getFrom_level1_importGSSImportImportCrossReference_16_2_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__From_level1_importAssignment_16_2"


    // $ANTLR start "rule__GSSTMOutput__Level1_formatAssignment_17_2"
    // InternalTMOUTPUT.g:2439:1: rule__GSSTMOutput__Level1_formatAssignment_17_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTMOutput__Level1_formatAssignment_17_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2443:1: ( ( ( RULE_STRING ) ) )
            // InternalTMOUTPUT.g:2444:2: ( ( RULE_STRING ) )
            {
            // InternalTMOUTPUT.g:2444:2: ( ( RULE_STRING ) )
            // InternalTMOUTPUT.g:2445:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel1_formatGSSFormatFormatCrossReference_17_2_0()); 
            }
            // InternalTMOUTPUT.g:2446:3: ( RULE_STRING )
            // InternalTMOUTPUT.g:2447:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel1_formatGSSFormatFormatSTRINGTerminalRuleCall_17_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel1_formatGSSFormatFormatSTRINGTerminalRuleCall_17_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel1_formatGSSFormatFormatCrossReference_17_2_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__Level1_formatAssignment_17_2"


    // $ANTLR start "rule__GSSTMOutput__Level1_filterAssignment_18_2"
    // InternalTMOUTPUT.g:2458:1: rule__GSSTMOutput__Level1_filterAssignment_18_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTMOutput__Level1_filterAssignment_18_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2462:1: ( ( ( RULE_STRING ) ) )
            // InternalTMOUTPUT.g:2463:2: ( ( RULE_STRING ) )
            {
            // InternalTMOUTPUT.g:2463:2: ( ( RULE_STRING ) )
            // InternalTMOUTPUT.g:2464:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel1_filterGSSFilterFilterCrossReference_18_2_0()); 
            }
            // InternalTMOUTPUT.g:2465:3: ( RULE_STRING )
            // InternalTMOUTPUT.g:2466:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel1_filterGSSFilterFilterSTRINGTerminalRuleCall_18_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel1_filterGSSFilterFilterSTRINGTerminalRuleCall_18_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel1_filterGSSFilterFilterCrossReference_18_2_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__Level1_filterAssignment_18_2"


    // $ANTLR start "rule__GSSTMOutput__From_level0_importAssignment_19_2"
    // InternalTMOUTPUT.g:2477:1: rule__GSSTMOutput__From_level0_importAssignment_19_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTMOutput__From_level0_importAssignment_19_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2481:1: ( ( ( RULE_STRING ) ) )
            // InternalTMOUTPUT.g:2482:2: ( ( RULE_STRING ) )
            {
            // InternalTMOUTPUT.g:2482:2: ( ( RULE_STRING ) )
            // InternalTMOUTPUT.g:2483:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getFrom_level0_importGSSImportImportCrossReference_19_2_0()); 
            }
            // InternalTMOUTPUT.g:2484:3: ( RULE_STRING )
            // InternalTMOUTPUT.g:2485:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getFrom_level0_importGSSImportImportSTRINGTerminalRuleCall_19_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getFrom_level0_importGSSImportImportSTRINGTerminalRuleCall_19_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getFrom_level0_importGSSImportImportCrossReference_19_2_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__From_level0_importAssignment_19_2"


    // $ANTLR start "rule__GSSTMOutput__Level0_formatAssignment_20_2"
    // InternalTMOUTPUT.g:2496:1: rule__GSSTMOutput__Level0_formatAssignment_20_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTMOutput__Level0_formatAssignment_20_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2500:1: ( ( ( RULE_STRING ) ) )
            // InternalTMOUTPUT.g:2501:2: ( ( RULE_STRING ) )
            {
            // InternalTMOUTPUT.g:2501:2: ( ( RULE_STRING ) )
            // InternalTMOUTPUT.g:2502:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel0_formatGSSFormatFormatCrossReference_20_2_0()); 
            }
            // InternalTMOUTPUT.g:2503:3: ( RULE_STRING )
            // InternalTMOUTPUT.g:2504:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel0_formatGSSFormatFormatSTRINGTerminalRuleCall_20_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel0_formatGSSFormatFormatSTRINGTerminalRuleCall_20_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel0_formatGSSFormatFormatCrossReference_20_2_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__Level0_formatAssignment_20_2"


    // $ANTLR start "rule__GSSTMOutput__Level0_filterAssignment_21_2"
    // InternalTMOUTPUT.g:2515:1: rule__GSSTMOutput__Level0_filterAssignment_21_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTMOutput__Level0_filterAssignment_21_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2519:1: ( ( ( RULE_STRING ) ) )
            // InternalTMOUTPUT.g:2520:2: ( ( RULE_STRING ) )
            {
            // InternalTMOUTPUT.g:2520:2: ( ( RULE_STRING ) )
            // InternalTMOUTPUT.g:2521:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel0_filterGSSFilterFilterCrossReference_21_2_0()); 
            }
            // InternalTMOUTPUT.g:2522:3: ( RULE_STRING )
            // InternalTMOUTPUT.g:2523:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getLevel0_filterGSSFilterFilterSTRINGTerminalRuleCall_21_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel0_filterGSSFilterFilterSTRINGTerminalRuleCall_21_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getLevel0_filterGSSFilterFilterCrossReference_21_2_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__Level0_filterAssignment_21_2"


    // $ANTLR start "rule__GSSTMOutput__GssFieldsAssignment_22_1"
    // InternalTMOUTPUT.g:2534:1: rule__GSSTMOutput__GssFieldsAssignment_22_1 : ( ruleGSSTMOutputField ) ;
    public final void rule__GSSTMOutput__GssFieldsAssignment_22_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2538:1: ( ( ruleGSSTMOutputField ) )
            // InternalTMOUTPUT.g:2539:2: ( ruleGSSTMOutputField )
            {
            // InternalTMOUTPUT.g:2539:2: ( ruleGSSTMOutputField )
            // InternalTMOUTPUT.g:2540:3: ruleGSSTMOutputField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputAccess().getGssFieldsGSSTMOutputFieldParserRuleCall_22_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSTMOutputField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputAccess().getGssFieldsGSSTMOutputFieldParserRuleCall_22_1_0()); 
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
    // $ANTLR end "rule__GSSTMOutput__GssFieldsAssignment_22_1"


    // $ANTLR start "rule__GSSTMOutputField__NameAssignment_2"
    // InternalTMOUTPUT.g:2549:1: rule__GSSTMOutputField__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GSSTMOutputField__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2553:1: ( ( RULE_STRING ) )
            // InternalTMOUTPUT.g:2554:2: ( RULE_STRING )
            {
            // InternalTMOUTPUT.g:2554:2: ( RULE_STRING )
            // InternalTMOUTPUT.g:2555:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputFieldAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputFieldAccess().getNameSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__GSSTMOutputField__NameAssignment_2"


    // $ANTLR start "rule__GSSTMOutputField__GssFieldAssignment_4"
    // InternalTMOUTPUT.g:2564:1: rule__GSSTMOutputField__GssFieldAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTMOutputField__GssFieldAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTMOUTPUT.g:2568:1: ( ( ( RULE_STRING ) ) )
            // InternalTMOUTPUT.g:2569:2: ( ( RULE_STRING ) )
            {
            // InternalTMOUTPUT.g:2569:2: ( ( RULE_STRING ) )
            // InternalTMOUTPUT.g:2570:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputFieldAccess().getGssFieldGSSFormatFieldCrossReference_4_0()); 
            }
            // InternalTMOUTPUT.g:2571:3: ( RULE_STRING )
            // InternalTMOUTPUT.g:2572:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMOutputFieldAccess().getGssFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputFieldAccess().getGssFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMOutputFieldAccess().getGssFieldGSSFormatFieldCrossReference_4_0()); 
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
    // $ANTLR end "rule__GSSTMOutputField__GssFieldAssignment_4"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000003FF940000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000000L});
    }


}