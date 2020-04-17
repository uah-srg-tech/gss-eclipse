package es.uah.aut.srg.gss.lang.tc.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.gss.lang.tc.services.TCGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/*******************************************************************************
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
@SuppressWarnings("all")
public class InternalTCParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_UINT_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<GSSTC'", "'name='", "'type='", "'subtype='", "'levels='", "'>'", "'</GSSTC>'", "'<to_level3_export'", "'file='", "'/>'", "'<level3_format'", "'<to_level2_export'", "'<level2_format'", "'<to_level1_export'", "'<level1_format'", "'<to_level0_export'", "'<level0_format'", "'<fields>'", "'</fields>'", "'<Field'", "'gssField='", "'enumRef='"
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


        public InternalTCParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTCParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTCParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTC.g"; }


    	private TCGrammarAccess grammarAccess;

    	public void setGrammarAccess(TCGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleGSSTC"
    // InternalTC.g:61:1: entryRuleGSSTC : ruleGSSTC EOF ;
    public final void entryRuleGSSTC() throws RecognitionException {
        try {
            // InternalTC.g:62:1: ( ruleGSSTC EOF )
            // InternalTC.g:63:1: ruleGSSTC EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSTC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCRule()); 
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
    // $ANTLR end "entryRuleGSSTC"


    // $ANTLR start "ruleGSSTC"
    // InternalTC.g:70:1: ruleGSSTC : ( ( rule__GSSTC__Group__0 ) ) ;
    public final void ruleGSSTC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:74:2: ( ( ( rule__GSSTC__Group__0 ) ) )
            // InternalTC.g:75:2: ( ( rule__GSSTC__Group__0 ) )
            {
            // InternalTC.g:75:2: ( ( rule__GSSTC__Group__0 ) )
            // InternalTC.g:76:3: ( rule__GSSTC__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getGroup()); 
            }
            // InternalTC.g:77:3: ( rule__GSSTC__Group__0 )
            // InternalTC.g:77:4: rule__GSSTC__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getGroup()); 
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
    // $ANTLR end "ruleGSSTC"


    // $ANTLR start "entryRuleGSSTCField"
    // InternalTC.g:86:1: entryRuleGSSTCField : ruleGSSTCField EOF ;
    public final void entryRuleGSSTCField() throws RecognitionException {
        try {
            // InternalTC.g:87:1: ( ruleGSSTCField EOF )
            // InternalTC.g:88:1: ruleGSSTCField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSTCField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCFieldRule()); 
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
    // $ANTLR end "entryRuleGSSTCField"


    // $ANTLR start "ruleGSSTCField"
    // InternalTC.g:95:1: ruleGSSTCField : ( ( rule__GSSTCField__Group__0 ) ) ;
    public final void ruleGSSTCField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:99:2: ( ( ( rule__GSSTCField__Group__0 ) ) )
            // InternalTC.g:100:2: ( ( rule__GSSTCField__Group__0 ) )
            {
            // InternalTC.g:100:2: ( ( rule__GSSTCField__Group__0 ) )
            // InternalTC.g:101:3: ( rule__GSSTCField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCFieldAccess().getGroup()); 
            }
            // InternalTC.g:102:3: ( rule__GSSTCField__Group__0 )
            // InternalTC.g:102:4: rule__GSSTCField__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCFieldAccess().getGroup()); 
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
    // $ANTLR end "ruleGSSTCField"


    // $ANTLR start "rule__GSSTC__Group__0"
    // InternalTC.g:110:1: rule__GSSTC__Group__0 : rule__GSSTC__Group__0__Impl rule__GSSTC__Group__1 ;
    public final void rule__GSSTC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:114:1: ( rule__GSSTC__Group__0__Impl rule__GSSTC__Group__1 )
            // InternalTC.g:115:2: rule__GSSTC__Group__0__Impl rule__GSSTC__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__GSSTC__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group__1();

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
    // $ANTLR end "rule__GSSTC__Group__0"


    // $ANTLR start "rule__GSSTC__Group__0__Impl"
    // InternalTC.g:122:1: rule__GSSTC__Group__0__Impl : ( '<GSSTC' ) ;
    public final void rule__GSSTC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:126:1: ( ( '<GSSTC' ) )
            // InternalTC.g:127:1: ( '<GSSTC' )
            {
            // InternalTC.g:127:1: ( '<GSSTC' )
            // InternalTC.g:128:2: '<GSSTC'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getGSSTCKeyword_0()); 
            }
            match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getGSSTCKeyword_0()); 
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
    // $ANTLR end "rule__GSSTC__Group__0__Impl"


    // $ANTLR start "rule__GSSTC__Group__1"
    // InternalTC.g:137:1: rule__GSSTC__Group__1 : rule__GSSTC__Group__1__Impl rule__GSSTC__Group__2 ;
    public final void rule__GSSTC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:141:1: ( rule__GSSTC__Group__1__Impl rule__GSSTC__Group__2 )
            // InternalTC.g:142:2: rule__GSSTC__Group__1__Impl rule__GSSTC__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTC__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group__2();

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
    // $ANTLR end "rule__GSSTC__Group__1"


    // $ANTLR start "rule__GSSTC__Group__1__Impl"
    // InternalTC.g:149:1: rule__GSSTC__Group__1__Impl : ( 'name=' ) ;
    public final void rule__GSSTC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:153:1: ( ( 'name=' ) )
            // InternalTC.g:154:1: ( 'name=' )
            {
            // InternalTC.g:154:1: ( 'name=' )
            // InternalTC.g:155:2: 'name='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getNameKeyword_1()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getNameKeyword_1()); 
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
    // $ANTLR end "rule__GSSTC__Group__1__Impl"


    // $ANTLR start "rule__GSSTC__Group__2"
    // InternalTC.g:164:1: rule__GSSTC__Group__2 : rule__GSSTC__Group__2__Impl rule__GSSTC__Group__3 ;
    public final void rule__GSSTC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:168:1: ( rule__GSSTC__Group__2__Impl rule__GSSTC__Group__3 )
            // InternalTC.g:169:2: rule__GSSTC__Group__2__Impl rule__GSSTC__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSTC__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group__3();

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
    // $ANTLR end "rule__GSSTC__Group__2"


    // $ANTLR start "rule__GSSTC__Group__2__Impl"
    // InternalTC.g:176:1: rule__GSSTC__Group__2__Impl : ( ( rule__GSSTC__NameAssignment_2 ) ) ;
    public final void rule__GSSTC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:180:1: ( ( ( rule__GSSTC__NameAssignment_2 ) ) )
            // InternalTC.g:181:1: ( ( rule__GSSTC__NameAssignment_2 ) )
            {
            // InternalTC.g:181:1: ( ( rule__GSSTC__NameAssignment_2 ) )
            // InternalTC.g:182:2: ( rule__GSSTC__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getNameAssignment_2()); 
            }
            // InternalTC.g:183:2: ( rule__GSSTC__NameAssignment_2 )
            // InternalTC.g:183:3: rule__GSSTC__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__GSSTC__Group__2__Impl"


    // $ANTLR start "rule__GSSTC__Group__3"
    // InternalTC.g:191:1: rule__GSSTC__Group__3 : rule__GSSTC__Group__3__Impl rule__GSSTC__Group__4 ;
    public final void rule__GSSTC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:195:1: ( rule__GSSTC__Group__3__Impl rule__GSSTC__Group__4 )
            // InternalTC.g:196:2: rule__GSSTC__Group__3__Impl rule__GSSTC__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSTC__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group__4();

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
    // $ANTLR end "rule__GSSTC__Group__3"


    // $ANTLR start "rule__GSSTC__Group__3__Impl"
    // InternalTC.g:203:1: rule__GSSTC__Group__3__Impl : ( 'type=' ) ;
    public final void rule__GSSTC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:207:1: ( ( 'type=' ) )
            // InternalTC.g:208:1: ( 'type=' )
            {
            // InternalTC.g:208:1: ( 'type=' )
            // InternalTC.g:209:2: 'type='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getTypeKeyword_3()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getTypeKeyword_3()); 
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
    // $ANTLR end "rule__GSSTC__Group__3__Impl"


    // $ANTLR start "rule__GSSTC__Group__4"
    // InternalTC.g:218:1: rule__GSSTC__Group__4 : rule__GSSTC__Group__4__Impl rule__GSSTC__Group__5 ;
    public final void rule__GSSTC__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:222:1: ( rule__GSSTC__Group__4__Impl rule__GSSTC__Group__5 )
            // InternalTC.g:223:2: rule__GSSTC__Group__4__Impl rule__GSSTC__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSTC__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group__5();

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
    // $ANTLR end "rule__GSSTC__Group__4"


    // $ANTLR start "rule__GSSTC__Group__4__Impl"
    // InternalTC.g:230:1: rule__GSSTC__Group__4__Impl : ( ( rule__GSSTC__TypeAssignment_4 ) ) ;
    public final void rule__GSSTC__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:234:1: ( ( ( rule__GSSTC__TypeAssignment_4 ) ) )
            // InternalTC.g:235:1: ( ( rule__GSSTC__TypeAssignment_4 ) )
            {
            // InternalTC.g:235:1: ( ( rule__GSSTC__TypeAssignment_4 ) )
            // InternalTC.g:236:2: ( rule__GSSTC__TypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getTypeAssignment_4()); 
            }
            // InternalTC.g:237:2: ( rule__GSSTC__TypeAssignment_4 )
            // InternalTC.g:237:3: rule__GSSTC__TypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__TypeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getTypeAssignment_4()); 
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
    // $ANTLR end "rule__GSSTC__Group__4__Impl"


    // $ANTLR start "rule__GSSTC__Group__5"
    // InternalTC.g:245:1: rule__GSSTC__Group__5 : rule__GSSTC__Group__5__Impl rule__GSSTC__Group__6 ;
    public final void rule__GSSTC__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:249:1: ( rule__GSSTC__Group__5__Impl rule__GSSTC__Group__6 )
            // InternalTC.g:250:2: rule__GSSTC__Group__5__Impl rule__GSSTC__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSTC__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group__6();

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
    // $ANTLR end "rule__GSSTC__Group__5"


    // $ANTLR start "rule__GSSTC__Group__5__Impl"
    // InternalTC.g:257:1: rule__GSSTC__Group__5__Impl : ( 'subtype=' ) ;
    public final void rule__GSSTC__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:261:1: ( ( 'subtype=' ) )
            // InternalTC.g:262:1: ( 'subtype=' )
            {
            // InternalTC.g:262:1: ( 'subtype=' )
            // InternalTC.g:263:2: 'subtype='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getSubtypeKeyword_5()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getSubtypeKeyword_5()); 
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
    // $ANTLR end "rule__GSSTC__Group__5__Impl"


    // $ANTLR start "rule__GSSTC__Group__6"
    // InternalTC.g:272:1: rule__GSSTC__Group__6 : rule__GSSTC__Group__6__Impl rule__GSSTC__Group__7 ;
    public final void rule__GSSTC__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:276:1: ( rule__GSSTC__Group__6__Impl rule__GSSTC__Group__7 )
            // InternalTC.g:277:2: rule__GSSTC__Group__6__Impl rule__GSSTC__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSTC__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group__7();

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
    // $ANTLR end "rule__GSSTC__Group__6"


    // $ANTLR start "rule__GSSTC__Group__6__Impl"
    // InternalTC.g:284:1: rule__GSSTC__Group__6__Impl : ( ( rule__GSSTC__SubtypeAssignment_6 ) ) ;
    public final void rule__GSSTC__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:288:1: ( ( ( rule__GSSTC__SubtypeAssignment_6 ) ) )
            // InternalTC.g:289:1: ( ( rule__GSSTC__SubtypeAssignment_6 ) )
            {
            // InternalTC.g:289:1: ( ( rule__GSSTC__SubtypeAssignment_6 ) )
            // InternalTC.g:290:2: ( rule__GSSTC__SubtypeAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getSubtypeAssignment_6()); 
            }
            // InternalTC.g:291:2: ( rule__GSSTC__SubtypeAssignment_6 )
            // InternalTC.g:291:3: rule__GSSTC__SubtypeAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__SubtypeAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getSubtypeAssignment_6()); 
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
    // $ANTLR end "rule__GSSTC__Group__6__Impl"


    // $ANTLR start "rule__GSSTC__Group__7"
    // InternalTC.g:299:1: rule__GSSTC__Group__7 : rule__GSSTC__Group__7__Impl rule__GSSTC__Group__8 ;
    public final void rule__GSSTC__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:303:1: ( rule__GSSTC__Group__7__Impl rule__GSSTC__Group__8 )
            // InternalTC.g:304:2: rule__GSSTC__Group__7__Impl rule__GSSTC__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSTC__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group__8();

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
    // $ANTLR end "rule__GSSTC__Group__7"


    // $ANTLR start "rule__GSSTC__Group__7__Impl"
    // InternalTC.g:311:1: rule__GSSTC__Group__7__Impl : ( 'levels=' ) ;
    public final void rule__GSSTC__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:315:1: ( ( 'levels=' ) )
            // InternalTC.g:316:1: ( 'levels=' )
            {
            // InternalTC.g:316:1: ( 'levels=' )
            // InternalTC.g:317:2: 'levels='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getLevelsKeyword_7()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getLevelsKeyword_7()); 
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
    // $ANTLR end "rule__GSSTC__Group__7__Impl"


    // $ANTLR start "rule__GSSTC__Group__8"
    // InternalTC.g:326:1: rule__GSSTC__Group__8 : rule__GSSTC__Group__8__Impl rule__GSSTC__Group__9 ;
    public final void rule__GSSTC__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:330:1: ( rule__GSSTC__Group__8__Impl rule__GSSTC__Group__9 )
            // InternalTC.g:331:2: rule__GSSTC__Group__8__Impl rule__GSSTC__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSTC__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group__9();

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
    // $ANTLR end "rule__GSSTC__Group__8"


    // $ANTLR start "rule__GSSTC__Group__8__Impl"
    // InternalTC.g:338:1: rule__GSSTC__Group__8__Impl : ( ( rule__GSSTC__LevelsAssignment_8 ) ) ;
    public final void rule__GSSTC__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:342:1: ( ( ( rule__GSSTC__LevelsAssignment_8 ) ) )
            // InternalTC.g:343:1: ( ( rule__GSSTC__LevelsAssignment_8 ) )
            {
            // InternalTC.g:343:1: ( ( rule__GSSTC__LevelsAssignment_8 ) )
            // InternalTC.g:344:2: ( rule__GSSTC__LevelsAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getLevelsAssignment_8()); 
            }
            // InternalTC.g:345:2: ( rule__GSSTC__LevelsAssignment_8 )
            // InternalTC.g:345:3: rule__GSSTC__LevelsAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__LevelsAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getLevelsAssignment_8()); 
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
    // $ANTLR end "rule__GSSTC__Group__8__Impl"


    // $ANTLR start "rule__GSSTC__Group__9"
    // InternalTC.g:353:1: rule__GSSTC__Group__9 : rule__GSSTC__Group__9__Impl rule__GSSTC__Group__10 ;
    public final void rule__GSSTC__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:357:1: ( rule__GSSTC__Group__9__Impl rule__GSSTC__Group__10 )
            // InternalTC.g:358:2: rule__GSSTC__Group__9__Impl rule__GSSTC__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTC__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group__10();

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
    // $ANTLR end "rule__GSSTC__Group__9"


    // $ANTLR start "rule__GSSTC__Group__9__Impl"
    // InternalTC.g:365:1: rule__GSSTC__Group__9__Impl : ( '>' ) ;
    public final void rule__GSSTC__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:369:1: ( ( '>' ) )
            // InternalTC.g:370:1: ( '>' )
            {
            // InternalTC.g:370:1: ( '>' )
            // InternalTC.g:371:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getGreaterThanSignKeyword_9()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getGreaterThanSignKeyword_9()); 
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
    // $ANTLR end "rule__GSSTC__Group__9__Impl"


    // $ANTLR start "rule__GSSTC__Group__10"
    // InternalTC.g:380:1: rule__GSSTC__Group__10 : rule__GSSTC__Group__10__Impl rule__GSSTC__Group__11 ;
    public final void rule__GSSTC__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:384:1: ( rule__GSSTC__Group__10__Impl rule__GSSTC__Group__11 )
            // InternalTC.g:385:2: rule__GSSTC__Group__10__Impl rule__GSSTC__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTC__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group__11();

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
    // $ANTLR end "rule__GSSTC__Group__10"


    // $ANTLR start "rule__GSSTC__Group__10__Impl"
    // InternalTC.g:392:1: rule__GSSTC__Group__10__Impl : ( ( rule__GSSTC__Group_10__0 )? ) ;
    public final void rule__GSSTC__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:396:1: ( ( ( rule__GSSTC__Group_10__0 )? ) )
            // InternalTC.g:397:1: ( ( rule__GSSTC__Group_10__0 )? )
            {
            // InternalTC.g:397:1: ( ( rule__GSSTC__Group_10__0 )? )
            // InternalTC.g:398:2: ( rule__GSSTC__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getGroup_10()); 
            }
            // InternalTC.g:399:2: ( rule__GSSTC__Group_10__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTC.g:399:3: rule__GSSTC__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTC__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getGroup_10()); 
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
    // $ANTLR end "rule__GSSTC__Group__10__Impl"


    // $ANTLR start "rule__GSSTC__Group__11"
    // InternalTC.g:407:1: rule__GSSTC__Group__11 : rule__GSSTC__Group__11__Impl rule__GSSTC__Group__12 ;
    public final void rule__GSSTC__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:411:1: ( rule__GSSTC__Group__11__Impl rule__GSSTC__Group__12 )
            // InternalTC.g:412:2: rule__GSSTC__Group__11__Impl rule__GSSTC__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTC__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group__12();

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
    // $ANTLR end "rule__GSSTC__Group__11"


    // $ANTLR start "rule__GSSTC__Group__11__Impl"
    // InternalTC.g:419:1: rule__GSSTC__Group__11__Impl : ( ( rule__GSSTC__Group_11__0 )? ) ;
    public final void rule__GSSTC__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:423:1: ( ( ( rule__GSSTC__Group_11__0 )? ) )
            // InternalTC.g:424:1: ( ( rule__GSSTC__Group_11__0 )? )
            {
            // InternalTC.g:424:1: ( ( rule__GSSTC__Group_11__0 )? )
            // InternalTC.g:425:2: ( rule__GSSTC__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getGroup_11()); 
            }
            // InternalTC.g:426:2: ( rule__GSSTC__Group_11__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTC.g:426:3: rule__GSSTC__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTC__Group_11__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getGroup_11()); 
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
    // $ANTLR end "rule__GSSTC__Group__11__Impl"


    // $ANTLR start "rule__GSSTC__Group__12"
    // InternalTC.g:434:1: rule__GSSTC__Group__12 : rule__GSSTC__Group__12__Impl rule__GSSTC__Group__13 ;
    public final void rule__GSSTC__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:438:1: ( rule__GSSTC__Group__12__Impl rule__GSSTC__Group__13 )
            // InternalTC.g:439:2: rule__GSSTC__Group__12__Impl rule__GSSTC__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTC__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group__13();

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
    // $ANTLR end "rule__GSSTC__Group__12"


    // $ANTLR start "rule__GSSTC__Group__12__Impl"
    // InternalTC.g:446:1: rule__GSSTC__Group__12__Impl : ( ( rule__GSSTC__Group_12__0 )? ) ;
    public final void rule__GSSTC__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:450:1: ( ( ( rule__GSSTC__Group_12__0 )? ) )
            // InternalTC.g:451:1: ( ( rule__GSSTC__Group_12__0 )? )
            {
            // InternalTC.g:451:1: ( ( rule__GSSTC__Group_12__0 )? )
            // InternalTC.g:452:2: ( rule__GSSTC__Group_12__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getGroup_12()); 
            }
            // InternalTC.g:453:2: ( rule__GSSTC__Group_12__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTC.g:453:3: rule__GSSTC__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTC__Group_12__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getGroup_12()); 
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
    // $ANTLR end "rule__GSSTC__Group__12__Impl"


    // $ANTLR start "rule__GSSTC__Group__13"
    // InternalTC.g:461:1: rule__GSSTC__Group__13 : rule__GSSTC__Group__13__Impl rule__GSSTC__Group__14 ;
    public final void rule__GSSTC__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:465:1: ( rule__GSSTC__Group__13__Impl rule__GSSTC__Group__14 )
            // InternalTC.g:466:2: rule__GSSTC__Group__13__Impl rule__GSSTC__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTC__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group__14();

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
    // $ANTLR end "rule__GSSTC__Group__13"


    // $ANTLR start "rule__GSSTC__Group__13__Impl"
    // InternalTC.g:473:1: rule__GSSTC__Group__13__Impl : ( ( rule__GSSTC__Group_13__0 )? ) ;
    public final void rule__GSSTC__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:477:1: ( ( ( rule__GSSTC__Group_13__0 )? ) )
            // InternalTC.g:478:1: ( ( rule__GSSTC__Group_13__0 )? )
            {
            // InternalTC.g:478:1: ( ( rule__GSSTC__Group_13__0 )? )
            // InternalTC.g:479:2: ( rule__GSSTC__Group_13__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getGroup_13()); 
            }
            // InternalTC.g:480:2: ( rule__GSSTC__Group_13__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTC.g:480:3: rule__GSSTC__Group_13__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTC__Group_13__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getGroup_13()); 
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
    // $ANTLR end "rule__GSSTC__Group__13__Impl"


    // $ANTLR start "rule__GSSTC__Group__14"
    // InternalTC.g:488:1: rule__GSSTC__Group__14 : rule__GSSTC__Group__14__Impl rule__GSSTC__Group__15 ;
    public final void rule__GSSTC__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:492:1: ( rule__GSSTC__Group__14__Impl rule__GSSTC__Group__15 )
            // InternalTC.g:493:2: rule__GSSTC__Group__14__Impl rule__GSSTC__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTC__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group__15();

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
    // $ANTLR end "rule__GSSTC__Group__14"


    // $ANTLR start "rule__GSSTC__Group__14__Impl"
    // InternalTC.g:500:1: rule__GSSTC__Group__14__Impl : ( ( rule__GSSTC__Group_14__0 )? ) ;
    public final void rule__GSSTC__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:504:1: ( ( ( rule__GSSTC__Group_14__0 )? ) )
            // InternalTC.g:505:1: ( ( rule__GSSTC__Group_14__0 )? )
            {
            // InternalTC.g:505:1: ( ( rule__GSSTC__Group_14__0 )? )
            // InternalTC.g:506:2: ( rule__GSSTC__Group_14__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getGroup_14()); 
            }
            // InternalTC.g:507:2: ( rule__GSSTC__Group_14__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTC.g:507:3: rule__GSSTC__Group_14__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTC__Group_14__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getGroup_14()); 
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
    // $ANTLR end "rule__GSSTC__Group__14__Impl"


    // $ANTLR start "rule__GSSTC__Group__15"
    // InternalTC.g:515:1: rule__GSSTC__Group__15 : rule__GSSTC__Group__15__Impl rule__GSSTC__Group__16 ;
    public final void rule__GSSTC__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:519:1: ( rule__GSSTC__Group__15__Impl rule__GSSTC__Group__16 )
            // InternalTC.g:520:2: rule__GSSTC__Group__15__Impl rule__GSSTC__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTC__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group__16();

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
    // $ANTLR end "rule__GSSTC__Group__15"


    // $ANTLR start "rule__GSSTC__Group__15__Impl"
    // InternalTC.g:527:1: rule__GSSTC__Group__15__Impl : ( ( rule__GSSTC__Group_15__0 )? ) ;
    public final void rule__GSSTC__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:531:1: ( ( ( rule__GSSTC__Group_15__0 )? ) )
            // InternalTC.g:532:1: ( ( rule__GSSTC__Group_15__0 )? )
            {
            // InternalTC.g:532:1: ( ( rule__GSSTC__Group_15__0 )? )
            // InternalTC.g:533:2: ( rule__GSSTC__Group_15__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getGroup_15()); 
            }
            // InternalTC.g:534:2: ( rule__GSSTC__Group_15__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTC.g:534:3: rule__GSSTC__Group_15__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTC__Group_15__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getGroup_15()); 
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
    // $ANTLR end "rule__GSSTC__Group__15__Impl"


    // $ANTLR start "rule__GSSTC__Group__16"
    // InternalTC.g:542:1: rule__GSSTC__Group__16 : rule__GSSTC__Group__16__Impl rule__GSSTC__Group__17 ;
    public final void rule__GSSTC__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:546:1: ( rule__GSSTC__Group__16__Impl rule__GSSTC__Group__17 )
            // InternalTC.g:547:2: rule__GSSTC__Group__16__Impl rule__GSSTC__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTC__Group__16__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group__17();

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
    // $ANTLR end "rule__GSSTC__Group__16"


    // $ANTLR start "rule__GSSTC__Group__16__Impl"
    // InternalTC.g:554:1: rule__GSSTC__Group__16__Impl : ( ( rule__GSSTC__Group_16__0 )? ) ;
    public final void rule__GSSTC__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:558:1: ( ( ( rule__GSSTC__Group_16__0 )? ) )
            // InternalTC.g:559:1: ( ( rule__GSSTC__Group_16__0 )? )
            {
            // InternalTC.g:559:1: ( ( rule__GSSTC__Group_16__0 )? )
            // InternalTC.g:560:2: ( rule__GSSTC__Group_16__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getGroup_16()); 
            }
            // InternalTC.g:561:2: ( rule__GSSTC__Group_16__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTC.g:561:3: rule__GSSTC__Group_16__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTC__Group_16__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getGroup_16()); 
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
    // $ANTLR end "rule__GSSTC__Group__16__Impl"


    // $ANTLR start "rule__GSSTC__Group__17"
    // InternalTC.g:569:1: rule__GSSTC__Group__17 : rule__GSSTC__Group__17__Impl rule__GSSTC__Group__18 ;
    public final void rule__GSSTC__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:573:1: ( rule__GSSTC__Group__17__Impl rule__GSSTC__Group__18 )
            // InternalTC.g:574:2: rule__GSSTC__Group__17__Impl rule__GSSTC__Group__18
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTC__Group__17__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group__18();

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
    // $ANTLR end "rule__GSSTC__Group__17"


    // $ANTLR start "rule__GSSTC__Group__17__Impl"
    // InternalTC.g:581:1: rule__GSSTC__Group__17__Impl : ( ( rule__GSSTC__Group_17__0 )? ) ;
    public final void rule__GSSTC__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:585:1: ( ( ( rule__GSSTC__Group_17__0 )? ) )
            // InternalTC.g:586:1: ( ( rule__GSSTC__Group_17__0 )? )
            {
            // InternalTC.g:586:1: ( ( rule__GSSTC__Group_17__0 )? )
            // InternalTC.g:587:2: ( rule__GSSTC__Group_17__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getGroup_17()); 
            }
            // InternalTC.g:588:2: ( rule__GSSTC__Group_17__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTC.g:588:3: rule__GSSTC__Group_17__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTC__Group_17__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getGroup_17()); 
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
    // $ANTLR end "rule__GSSTC__Group__17__Impl"


    // $ANTLR start "rule__GSSTC__Group__18"
    // InternalTC.g:596:1: rule__GSSTC__Group__18 : rule__GSSTC__Group__18__Impl rule__GSSTC__Group__19 ;
    public final void rule__GSSTC__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:600:1: ( rule__GSSTC__Group__18__Impl rule__GSSTC__Group__19 )
            // InternalTC.g:601:2: rule__GSSTC__Group__18__Impl rule__GSSTC__Group__19
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTC__Group__18__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group__19();

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
    // $ANTLR end "rule__GSSTC__Group__18"


    // $ANTLR start "rule__GSSTC__Group__18__Impl"
    // InternalTC.g:608:1: rule__GSSTC__Group__18__Impl : ( ( rule__GSSTC__Group_18__0 )? ) ;
    public final void rule__GSSTC__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:612:1: ( ( ( rule__GSSTC__Group_18__0 )? ) )
            // InternalTC.g:613:1: ( ( rule__GSSTC__Group_18__0 )? )
            {
            // InternalTC.g:613:1: ( ( rule__GSSTC__Group_18__0 )? )
            // InternalTC.g:614:2: ( rule__GSSTC__Group_18__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getGroup_18()); 
            }
            // InternalTC.g:615:2: ( rule__GSSTC__Group_18__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTC.g:615:3: rule__GSSTC__Group_18__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTC__Group_18__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getGroup_18()); 
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
    // $ANTLR end "rule__GSSTC__Group__18__Impl"


    // $ANTLR start "rule__GSSTC__Group__19"
    // InternalTC.g:623:1: rule__GSSTC__Group__19 : rule__GSSTC__Group__19__Impl ;
    public final void rule__GSSTC__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:627:1: ( rule__GSSTC__Group__19__Impl )
            // InternalTC.g:628:2: rule__GSSTC__Group__19__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group__19__Impl();

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
    // $ANTLR end "rule__GSSTC__Group__19"


    // $ANTLR start "rule__GSSTC__Group__19__Impl"
    // InternalTC.g:634:1: rule__GSSTC__Group__19__Impl : ( '</GSSTC>' ) ;
    public final void rule__GSSTC__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:638:1: ( ( '</GSSTC>' ) )
            // InternalTC.g:639:1: ( '</GSSTC>' )
            {
            // InternalTC.g:639:1: ( '</GSSTC>' )
            // InternalTC.g:640:2: '</GSSTC>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getGSSTCKeyword_19()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getGSSTCKeyword_19()); 
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
    // $ANTLR end "rule__GSSTC__Group__19__Impl"


    // $ANTLR start "rule__GSSTC__Group_10__0"
    // InternalTC.g:650:1: rule__GSSTC__Group_10__0 : rule__GSSTC__Group_10__0__Impl rule__GSSTC__Group_10__1 ;
    public final void rule__GSSTC__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:654:1: ( rule__GSSTC__Group_10__0__Impl rule__GSSTC__Group_10__1 )
            // InternalTC.g:655:2: rule__GSSTC__Group_10__0__Impl rule__GSSTC__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTC__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_10__1();

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
    // $ANTLR end "rule__GSSTC__Group_10__0"


    // $ANTLR start "rule__GSSTC__Group_10__0__Impl"
    // InternalTC.g:662:1: rule__GSSTC__Group_10__0__Impl : ( '<to_level3_export' ) ;
    public final void rule__GSSTC__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:666:1: ( ( '<to_level3_export' ) )
            // InternalTC.g:667:1: ( '<to_level3_export' )
            {
            // InternalTC.g:667:1: ( '<to_level3_export' )
            // InternalTC.g:668:2: '<to_level3_export'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getTo_level3_exportKeyword_10_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getTo_level3_exportKeyword_10_0()); 
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
    // $ANTLR end "rule__GSSTC__Group_10__0__Impl"


    // $ANTLR start "rule__GSSTC__Group_10__1"
    // InternalTC.g:677:1: rule__GSSTC__Group_10__1 : rule__GSSTC__Group_10__1__Impl rule__GSSTC__Group_10__2 ;
    public final void rule__GSSTC__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:681:1: ( rule__GSSTC__Group_10__1__Impl rule__GSSTC__Group_10__2 )
            // InternalTC.g:682:2: rule__GSSTC__Group_10__1__Impl rule__GSSTC__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTC__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_10__2();

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
    // $ANTLR end "rule__GSSTC__Group_10__1"


    // $ANTLR start "rule__GSSTC__Group_10__1__Impl"
    // InternalTC.g:689:1: rule__GSSTC__Group_10__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTC__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:693:1: ( ( 'file=' ) )
            // InternalTC.g:694:1: ( 'file=' )
            {
            // InternalTC.g:694:1: ( 'file=' )
            // InternalTC.g:695:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getFileKeyword_10_1()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getFileKeyword_10_1()); 
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
    // $ANTLR end "rule__GSSTC__Group_10__1__Impl"


    // $ANTLR start "rule__GSSTC__Group_10__2"
    // InternalTC.g:704:1: rule__GSSTC__Group_10__2 : rule__GSSTC__Group_10__2__Impl rule__GSSTC__Group_10__3 ;
    public final void rule__GSSTC__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:708:1: ( rule__GSSTC__Group_10__2__Impl rule__GSSTC__Group_10__3 )
            // InternalTC.g:709:2: rule__GSSTC__Group_10__2__Impl rule__GSSTC__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTC__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_10__3();

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
    // $ANTLR end "rule__GSSTC__Group_10__2"


    // $ANTLR start "rule__GSSTC__Group_10__2__Impl"
    // InternalTC.g:716:1: rule__GSSTC__Group_10__2__Impl : ( ( rule__GSSTC__To_level3_exportAssignment_10_2 ) ) ;
    public final void rule__GSSTC__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:720:1: ( ( ( rule__GSSTC__To_level3_exportAssignment_10_2 ) ) )
            // InternalTC.g:721:1: ( ( rule__GSSTC__To_level3_exportAssignment_10_2 ) )
            {
            // InternalTC.g:721:1: ( ( rule__GSSTC__To_level3_exportAssignment_10_2 ) )
            // InternalTC.g:722:2: ( rule__GSSTC__To_level3_exportAssignment_10_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getTo_level3_exportAssignment_10_2()); 
            }
            // InternalTC.g:723:2: ( rule__GSSTC__To_level3_exportAssignment_10_2 )
            // InternalTC.g:723:3: rule__GSSTC__To_level3_exportAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__To_level3_exportAssignment_10_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getTo_level3_exportAssignment_10_2()); 
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
    // $ANTLR end "rule__GSSTC__Group_10__2__Impl"


    // $ANTLR start "rule__GSSTC__Group_10__3"
    // InternalTC.g:731:1: rule__GSSTC__Group_10__3 : rule__GSSTC__Group_10__3__Impl ;
    public final void rule__GSSTC__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:735:1: ( rule__GSSTC__Group_10__3__Impl )
            // InternalTC.g:736:2: rule__GSSTC__Group_10__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_10__3__Impl();

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
    // $ANTLR end "rule__GSSTC__Group_10__3"


    // $ANTLR start "rule__GSSTC__Group_10__3__Impl"
    // InternalTC.g:742:1: rule__GSSTC__Group_10__3__Impl : ( '/>' ) ;
    public final void rule__GSSTC__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:746:1: ( ( '/>' ) )
            // InternalTC.g:747:1: ( '/>' )
            {
            // InternalTC.g:747:1: ( '/>' )
            // InternalTC.g:748:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getSolidusGreaterThanSignKeyword_10_3()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getSolidusGreaterThanSignKeyword_10_3()); 
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
    // $ANTLR end "rule__GSSTC__Group_10__3__Impl"


    // $ANTLR start "rule__GSSTC__Group_11__0"
    // InternalTC.g:758:1: rule__GSSTC__Group_11__0 : rule__GSSTC__Group_11__0__Impl rule__GSSTC__Group_11__1 ;
    public final void rule__GSSTC__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:762:1: ( rule__GSSTC__Group_11__0__Impl rule__GSSTC__Group_11__1 )
            // InternalTC.g:763:2: rule__GSSTC__Group_11__0__Impl rule__GSSTC__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTC__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_11__1();

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
    // $ANTLR end "rule__GSSTC__Group_11__0"


    // $ANTLR start "rule__GSSTC__Group_11__0__Impl"
    // InternalTC.g:770:1: rule__GSSTC__Group_11__0__Impl : ( '<level3_format' ) ;
    public final void rule__GSSTC__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:774:1: ( ( '<level3_format' ) )
            // InternalTC.g:775:1: ( '<level3_format' )
            {
            // InternalTC.g:775:1: ( '<level3_format' )
            // InternalTC.g:776:2: '<level3_format'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getLevel3_formatKeyword_11_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getLevel3_formatKeyword_11_0()); 
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
    // $ANTLR end "rule__GSSTC__Group_11__0__Impl"


    // $ANTLR start "rule__GSSTC__Group_11__1"
    // InternalTC.g:785:1: rule__GSSTC__Group_11__1 : rule__GSSTC__Group_11__1__Impl rule__GSSTC__Group_11__2 ;
    public final void rule__GSSTC__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:789:1: ( rule__GSSTC__Group_11__1__Impl rule__GSSTC__Group_11__2 )
            // InternalTC.g:790:2: rule__GSSTC__Group_11__1__Impl rule__GSSTC__Group_11__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTC__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_11__2();

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
    // $ANTLR end "rule__GSSTC__Group_11__1"


    // $ANTLR start "rule__GSSTC__Group_11__1__Impl"
    // InternalTC.g:797:1: rule__GSSTC__Group_11__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTC__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:801:1: ( ( 'file=' ) )
            // InternalTC.g:802:1: ( 'file=' )
            {
            // InternalTC.g:802:1: ( 'file=' )
            // InternalTC.g:803:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getFileKeyword_11_1()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getFileKeyword_11_1()); 
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
    // $ANTLR end "rule__GSSTC__Group_11__1__Impl"


    // $ANTLR start "rule__GSSTC__Group_11__2"
    // InternalTC.g:812:1: rule__GSSTC__Group_11__2 : rule__GSSTC__Group_11__2__Impl rule__GSSTC__Group_11__3 ;
    public final void rule__GSSTC__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:816:1: ( rule__GSSTC__Group_11__2__Impl rule__GSSTC__Group_11__3 )
            // InternalTC.g:817:2: rule__GSSTC__Group_11__2__Impl rule__GSSTC__Group_11__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTC__Group_11__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_11__3();

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
    // $ANTLR end "rule__GSSTC__Group_11__2"


    // $ANTLR start "rule__GSSTC__Group_11__2__Impl"
    // InternalTC.g:824:1: rule__GSSTC__Group_11__2__Impl : ( ( rule__GSSTC__Level3_formatAssignment_11_2 ) ) ;
    public final void rule__GSSTC__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:828:1: ( ( ( rule__GSSTC__Level3_formatAssignment_11_2 ) ) )
            // InternalTC.g:829:1: ( ( rule__GSSTC__Level3_formatAssignment_11_2 ) )
            {
            // InternalTC.g:829:1: ( ( rule__GSSTC__Level3_formatAssignment_11_2 ) )
            // InternalTC.g:830:2: ( rule__GSSTC__Level3_formatAssignment_11_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getLevel3_formatAssignment_11_2()); 
            }
            // InternalTC.g:831:2: ( rule__GSSTC__Level3_formatAssignment_11_2 )
            // InternalTC.g:831:3: rule__GSSTC__Level3_formatAssignment_11_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Level3_formatAssignment_11_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getLevel3_formatAssignment_11_2()); 
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
    // $ANTLR end "rule__GSSTC__Group_11__2__Impl"


    // $ANTLR start "rule__GSSTC__Group_11__3"
    // InternalTC.g:839:1: rule__GSSTC__Group_11__3 : rule__GSSTC__Group_11__3__Impl ;
    public final void rule__GSSTC__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:843:1: ( rule__GSSTC__Group_11__3__Impl )
            // InternalTC.g:844:2: rule__GSSTC__Group_11__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_11__3__Impl();

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
    // $ANTLR end "rule__GSSTC__Group_11__3"


    // $ANTLR start "rule__GSSTC__Group_11__3__Impl"
    // InternalTC.g:850:1: rule__GSSTC__Group_11__3__Impl : ( '/>' ) ;
    public final void rule__GSSTC__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:854:1: ( ( '/>' ) )
            // InternalTC.g:855:1: ( '/>' )
            {
            // InternalTC.g:855:1: ( '/>' )
            // InternalTC.g:856:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getSolidusGreaterThanSignKeyword_11_3()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getSolidusGreaterThanSignKeyword_11_3()); 
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
    // $ANTLR end "rule__GSSTC__Group_11__3__Impl"


    // $ANTLR start "rule__GSSTC__Group_12__0"
    // InternalTC.g:866:1: rule__GSSTC__Group_12__0 : rule__GSSTC__Group_12__0__Impl rule__GSSTC__Group_12__1 ;
    public final void rule__GSSTC__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:870:1: ( rule__GSSTC__Group_12__0__Impl rule__GSSTC__Group_12__1 )
            // InternalTC.g:871:2: rule__GSSTC__Group_12__0__Impl rule__GSSTC__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTC__Group_12__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_12__1();

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
    // $ANTLR end "rule__GSSTC__Group_12__0"


    // $ANTLR start "rule__GSSTC__Group_12__0__Impl"
    // InternalTC.g:878:1: rule__GSSTC__Group_12__0__Impl : ( '<to_level2_export' ) ;
    public final void rule__GSSTC__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:882:1: ( ( '<to_level2_export' ) )
            // InternalTC.g:883:1: ( '<to_level2_export' )
            {
            // InternalTC.g:883:1: ( '<to_level2_export' )
            // InternalTC.g:884:2: '<to_level2_export'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getTo_level2_exportKeyword_12_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getTo_level2_exportKeyword_12_0()); 
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
    // $ANTLR end "rule__GSSTC__Group_12__0__Impl"


    // $ANTLR start "rule__GSSTC__Group_12__1"
    // InternalTC.g:893:1: rule__GSSTC__Group_12__1 : rule__GSSTC__Group_12__1__Impl rule__GSSTC__Group_12__2 ;
    public final void rule__GSSTC__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:897:1: ( rule__GSSTC__Group_12__1__Impl rule__GSSTC__Group_12__2 )
            // InternalTC.g:898:2: rule__GSSTC__Group_12__1__Impl rule__GSSTC__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTC__Group_12__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_12__2();

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
    // $ANTLR end "rule__GSSTC__Group_12__1"


    // $ANTLR start "rule__GSSTC__Group_12__1__Impl"
    // InternalTC.g:905:1: rule__GSSTC__Group_12__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTC__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:909:1: ( ( 'file=' ) )
            // InternalTC.g:910:1: ( 'file=' )
            {
            // InternalTC.g:910:1: ( 'file=' )
            // InternalTC.g:911:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getFileKeyword_12_1()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getFileKeyword_12_1()); 
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
    // $ANTLR end "rule__GSSTC__Group_12__1__Impl"


    // $ANTLR start "rule__GSSTC__Group_12__2"
    // InternalTC.g:920:1: rule__GSSTC__Group_12__2 : rule__GSSTC__Group_12__2__Impl rule__GSSTC__Group_12__3 ;
    public final void rule__GSSTC__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:924:1: ( rule__GSSTC__Group_12__2__Impl rule__GSSTC__Group_12__3 )
            // InternalTC.g:925:2: rule__GSSTC__Group_12__2__Impl rule__GSSTC__Group_12__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTC__Group_12__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_12__3();

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
    // $ANTLR end "rule__GSSTC__Group_12__2"


    // $ANTLR start "rule__GSSTC__Group_12__2__Impl"
    // InternalTC.g:932:1: rule__GSSTC__Group_12__2__Impl : ( ( rule__GSSTC__To_level2_exportAssignment_12_2 ) ) ;
    public final void rule__GSSTC__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:936:1: ( ( ( rule__GSSTC__To_level2_exportAssignment_12_2 ) ) )
            // InternalTC.g:937:1: ( ( rule__GSSTC__To_level2_exportAssignment_12_2 ) )
            {
            // InternalTC.g:937:1: ( ( rule__GSSTC__To_level2_exportAssignment_12_2 ) )
            // InternalTC.g:938:2: ( rule__GSSTC__To_level2_exportAssignment_12_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getTo_level2_exportAssignment_12_2()); 
            }
            // InternalTC.g:939:2: ( rule__GSSTC__To_level2_exportAssignment_12_2 )
            // InternalTC.g:939:3: rule__GSSTC__To_level2_exportAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__To_level2_exportAssignment_12_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getTo_level2_exportAssignment_12_2()); 
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
    // $ANTLR end "rule__GSSTC__Group_12__2__Impl"


    // $ANTLR start "rule__GSSTC__Group_12__3"
    // InternalTC.g:947:1: rule__GSSTC__Group_12__3 : rule__GSSTC__Group_12__3__Impl ;
    public final void rule__GSSTC__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:951:1: ( rule__GSSTC__Group_12__3__Impl )
            // InternalTC.g:952:2: rule__GSSTC__Group_12__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_12__3__Impl();

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
    // $ANTLR end "rule__GSSTC__Group_12__3"


    // $ANTLR start "rule__GSSTC__Group_12__3__Impl"
    // InternalTC.g:958:1: rule__GSSTC__Group_12__3__Impl : ( '/>' ) ;
    public final void rule__GSSTC__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:962:1: ( ( '/>' ) )
            // InternalTC.g:963:1: ( '/>' )
            {
            // InternalTC.g:963:1: ( '/>' )
            // InternalTC.g:964:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getSolidusGreaterThanSignKeyword_12_3()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getSolidusGreaterThanSignKeyword_12_3()); 
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
    // $ANTLR end "rule__GSSTC__Group_12__3__Impl"


    // $ANTLR start "rule__GSSTC__Group_13__0"
    // InternalTC.g:974:1: rule__GSSTC__Group_13__0 : rule__GSSTC__Group_13__0__Impl rule__GSSTC__Group_13__1 ;
    public final void rule__GSSTC__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:978:1: ( rule__GSSTC__Group_13__0__Impl rule__GSSTC__Group_13__1 )
            // InternalTC.g:979:2: rule__GSSTC__Group_13__0__Impl rule__GSSTC__Group_13__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTC__Group_13__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_13__1();

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
    // $ANTLR end "rule__GSSTC__Group_13__0"


    // $ANTLR start "rule__GSSTC__Group_13__0__Impl"
    // InternalTC.g:986:1: rule__GSSTC__Group_13__0__Impl : ( '<level2_format' ) ;
    public final void rule__GSSTC__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:990:1: ( ( '<level2_format' ) )
            // InternalTC.g:991:1: ( '<level2_format' )
            {
            // InternalTC.g:991:1: ( '<level2_format' )
            // InternalTC.g:992:2: '<level2_format'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getLevel2_formatKeyword_13_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getLevel2_formatKeyword_13_0()); 
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
    // $ANTLR end "rule__GSSTC__Group_13__0__Impl"


    // $ANTLR start "rule__GSSTC__Group_13__1"
    // InternalTC.g:1001:1: rule__GSSTC__Group_13__1 : rule__GSSTC__Group_13__1__Impl rule__GSSTC__Group_13__2 ;
    public final void rule__GSSTC__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1005:1: ( rule__GSSTC__Group_13__1__Impl rule__GSSTC__Group_13__2 )
            // InternalTC.g:1006:2: rule__GSSTC__Group_13__1__Impl rule__GSSTC__Group_13__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTC__Group_13__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_13__2();

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
    // $ANTLR end "rule__GSSTC__Group_13__1"


    // $ANTLR start "rule__GSSTC__Group_13__1__Impl"
    // InternalTC.g:1013:1: rule__GSSTC__Group_13__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTC__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1017:1: ( ( 'file=' ) )
            // InternalTC.g:1018:1: ( 'file=' )
            {
            // InternalTC.g:1018:1: ( 'file=' )
            // InternalTC.g:1019:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getFileKeyword_13_1()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getFileKeyword_13_1()); 
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
    // $ANTLR end "rule__GSSTC__Group_13__1__Impl"


    // $ANTLR start "rule__GSSTC__Group_13__2"
    // InternalTC.g:1028:1: rule__GSSTC__Group_13__2 : rule__GSSTC__Group_13__2__Impl rule__GSSTC__Group_13__3 ;
    public final void rule__GSSTC__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1032:1: ( rule__GSSTC__Group_13__2__Impl rule__GSSTC__Group_13__3 )
            // InternalTC.g:1033:2: rule__GSSTC__Group_13__2__Impl rule__GSSTC__Group_13__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTC__Group_13__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_13__3();

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
    // $ANTLR end "rule__GSSTC__Group_13__2"


    // $ANTLR start "rule__GSSTC__Group_13__2__Impl"
    // InternalTC.g:1040:1: rule__GSSTC__Group_13__2__Impl : ( ( rule__GSSTC__Level2_formatAssignment_13_2 ) ) ;
    public final void rule__GSSTC__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1044:1: ( ( ( rule__GSSTC__Level2_formatAssignment_13_2 ) ) )
            // InternalTC.g:1045:1: ( ( rule__GSSTC__Level2_formatAssignment_13_2 ) )
            {
            // InternalTC.g:1045:1: ( ( rule__GSSTC__Level2_formatAssignment_13_2 ) )
            // InternalTC.g:1046:2: ( rule__GSSTC__Level2_formatAssignment_13_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getLevel2_formatAssignment_13_2()); 
            }
            // InternalTC.g:1047:2: ( rule__GSSTC__Level2_formatAssignment_13_2 )
            // InternalTC.g:1047:3: rule__GSSTC__Level2_formatAssignment_13_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Level2_formatAssignment_13_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getLevel2_formatAssignment_13_2()); 
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
    // $ANTLR end "rule__GSSTC__Group_13__2__Impl"


    // $ANTLR start "rule__GSSTC__Group_13__3"
    // InternalTC.g:1055:1: rule__GSSTC__Group_13__3 : rule__GSSTC__Group_13__3__Impl ;
    public final void rule__GSSTC__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1059:1: ( rule__GSSTC__Group_13__3__Impl )
            // InternalTC.g:1060:2: rule__GSSTC__Group_13__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_13__3__Impl();

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
    // $ANTLR end "rule__GSSTC__Group_13__3"


    // $ANTLR start "rule__GSSTC__Group_13__3__Impl"
    // InternalTC.g:1066:1: rule__GSSTC__Group_13__3__Impl : ( '/>' ) ;
    public final void rule__GSSTC__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1070:1: ( ( '/>' ) )
            // InternalTC.g:1071:1: ( '/>' )
            {
            // InternalTC.g:1071:1: ( '/>' )
            // InternalTC.g:1072:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getSolidusGreaterThanSignKeyword_13_3()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getSolidusGreaterThanSignKeyword_13_3()); 
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
    // $ANTLR end "rule__GSSTC__Group_13__3__Impl"


    // $ANTLR start "rule__GSSTC__Group_14__0"
    // InternalTC.g:1082:1: rule__GSSTC__Group_14__0 : rule__GSSTC__Group_14__0__Impl rule__GSSTC__Group_14__1 ;
    public final void rule__GSSTC__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1086:1: ( rule__GSSTC__Group_14__0__Impl rule__GSSTC__Group_14__1 )
            // InternalTC.g:1087:2: rule__GSSTC__Group_14__0__Impl rule__GSSTC__Group_14__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTC__Group_14__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_14__1();

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
    // $ANTLR end "rule__GSSTC__Group_14__0"


    // $ANTLR start "rule__GSSTC__Group_14__0__Impl"
    // InternalTC.g:1094:1: rule__GSSTC__Group_14__0__Impl : ( '<to_level1_export' ) ;
    public final void rule__GSSTC__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1098:1: ( ( '<to_level1_export' ) )
            // InternalTC.g:1099:1: ( '<to_level1_export' )
            {
            // InternalTC.g:1099:1: ( '<to_level1_export' )
            // InternalTC.g:1100:2: '<to_level1_export'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getTo_level1_exportKeyword_14_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getTo_level1_exportKeyword_14_0()); 
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
    // $ANTLR end "rule__GSSTC__Group_14__0__Impl"


    // $ANTLR start "rule__GSSTC__Group_14__1"
    // InternalTC.g:1109:1: rule__GSSTC__Group_14__1 : rule__GSSTC__Group_14__1__Impl rule__GSSTC__Group_14__2 ;
    public final void rule__GSSTC__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1113:1: ( rule__GSSTC__Group_14__1__Impl rule__GSSTC__Group_14__2 )
            // InternalTC.g:1114:2: rule__GSSTC__Group_14__1__Impl rule__GSSTC__Group_14__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTC__Group_14__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_14__2();

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
    // $ANTLR end "rule__GSSTC__Group_14__1"


    // $ANTLR start "rule__GSSTC__Group_14__1__Impl"
    // InternalTC.g:1121:1: rule__GSSTC__Group_14__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTC__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1125:1: ( ( 'file=' ) )
            // InternalTC.g:1126:1: ( 'file=' )
            {
            // InternalTC.g:1126:1: ( 'file=' )
            // InternalTC.g:1127:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getFileKeyword_14_1()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getFileKeyword_14_1()); 
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
    // $ANTLR end "rule__GSSTC__Group_14__1__Impl"


    // $ANTLR start "rule__GSSTC__Group_14__2"
    // InternalTC.g:1136:1: rule__GSSTC__Group_14__2 : rule__GSSTC__Group_14__2__Impl rule__GSSTC__Group_14__3 ;
    public final void rule__GSSTC__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1140:1: ( rule__GSSTC__Group_14__2__Impl rule__GSSTC__Group_14__3 )
            // InternalTC.g:1141:2: rule__GSSTC__Group_14__2__Impl rule__GSSTC__Group_14__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTC__Group_14__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_14__3();

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
    // $ANTLR end "rule__GSSTC__Group_14__2"


    // $ANTLR start "rule__GSSTC__Group_14__2__Impl"
    // InternalTC.g:1148:1: rule__GSSTC__Group_14__2__Impl : ( ( rule__GSSTC__To_level1_exportAssignment_14_2 ) ) ;
    public final void rule__GSSTC__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1152:1: ( ( ( rule__GSSTC__To_level1_exportAssignment_14_2 ) ) )
            // InternalTC.g:1153:1: ( ( rule__GSSTC__To_level1_exportAssignment_14_2 ) )
            {
            // InternalTC.g:1153:1: ( ( rule__GSSTC__To_level1_exportAssignment_14_2 ) )
            // InternalTC.g:1154:2: ( rule__GSSTC__To_level1_exportAssignment_14_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getTo_level1_exportAssignment_14_2()); 
            }
            // InternalTC.g:1155:2: ( rule__GSSTC__To_level1_exportAssignment_14_2 )
            // InternalTC.g:1155:3: rule__GSSTC__To_level1_exportAssignment_14_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__To_level1_exportAssignment_14_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getTo_level1_exportAssignment_14_2()); 
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
    // $ANTLR end "rule__GSSTC__Group_14__2__Impl"


    // $ANTLR start "rule__GSSTC__Group_14__3"
    // InternalTC.g:1163:1: rule__GSSTC__Group_14__3 : rule__GSSTC__Group_14__3__Impl ;
    public final void rule__GSSTC__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1167:1: ( rule__GSSTC__Group_14__3__Impl )
            // InternalTC.g:1168:2: rule__GSSTC__Group_14__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_14__3__Impl();

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
    // $ANTLR end "rule__GSSTC__Group_14__3"


    // $ANTLR start "rule__GSSTC__Group_14__3__Impl"
    // InternalTC.g:1174:1: rule__GSSTC__Group_14__3__Impl : ( '/>' ) ;
    public final void rule__GSSTC__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1178:1: ( ( '/>' ) )
            // InternalTC.g:1179:1: ( '/>' )
            {
            // InternalTC.g:1179:1: ( '/>' )
            // InternalTC.g:1180:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getSolidusGreaterThanSignKeyword_14_3()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getSolidusGreaterThanSignKeyword_14_3()); 
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
    // $ANTLR end "rule__GSSTC__Group_14__3__Impl"


    // $ANTLR start "rule__GSSTC__Group_15__0"
    // InternalTC.g:1190:1: rule__GSSTC__Group_15__0 : rule__GSSTC__Group_15__0__Impl rule__GSSTC__Group_15__1 ;
    public final void rule__GSSTC__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1194:1: ( rule__GSSTC__Group_15__0__Impl rule__GSSTC__Group_15__1 )
            // InternalTC.g:1195:2: rule__GSSTC__Group_15__0__Impl rule__GSSTC__Group_15__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTC__Group_15__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_15__1();

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
    // $ANTLR end "rule__GSSTC__Group_15__0"


    // $ANTLR start "rule__GSSTC__Group_15__0__Impl"
    // InternalTC.g:1202:1: rule__GSSTC__Group_15__0__Impl : ( '<level1_format' ) ;
    public final void rule__GSSTC__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1206:1: ( ( '<level1_format' ) )
            // InternalTC.g:1207:1: ( '<level1_format' )
            {
            // InternalTC.g:1207:1: ( '<level1_format' )
            // InternalTC.g:1208:2: '<level1_format'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getLevel1_formatKeyword_15_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getLevel1_formatKeyword_15_0()); 
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
    // $ANTLR end "rule__GSSTC__Group_15__0__Impl"


    // $ANTLR start "rule__GSSTC__Group_15__1"
    // InternalTC.g:1217:1: rule__GSSTC__Group_15__1 : rule__GSSTC__Group_15__1__Impl rule__GSSTC__Group_15__2 ;
    public final void rule__GSSTC__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1221:1: ( rule__GSSTC__Group_15__1__Impl rule__GSSTC__Group_15__2 )
            // InternalTC.g:1222:2: rule__GSSTC__Group_15__1__Impl rule__GSSTC__Group_15__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTC__Group_15__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_15__2();

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
    // $ANTLR end "rule__GSSTC__Group_15__1"


    // $ANTLR start "rule__GSSTC__Group_15__1__Impl"
    // InternalTC.g:1229:1: rule__GSSTC__Group_15__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTC__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1233:1: ( ( 'file=' ) )
            // InternalTC.g:1234:1: ( 'file=' )
            {
            // InternalTC.g:1234:1: ( 'file=' )
            // InternalTC.g:1235:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getFileKeyword_15_1()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getFileKeyword_15_1()); 
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
    // $ANTLR end "rule__GSSTC__Group_15__1__Impl"


    // $ANTLR start "rule__GSSTC__Group_15__2"
    // InternalTC.g:1244:1: rule__GSSTC__Group_15__2 : rule__GSSTC__Group_15__2__Impl rule__GSSTC__Group_15__3 ;
    public final void rule__GSSTC__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1248:1: ( rule__GSSTC__Group_15__2__Impl rule__GSSTC__Group_15__3 )
            // InternalTC.g:1249:2: rule__GSSTC__Group_15__2__Impl rule__GSSTC__Group_15__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTC__Group_15__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_15__3();

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
    // $ANTLR end "rule__GSSTC__Group_15__2"


    // $ANTLR start "rule__GSSTC__Group_15__2__Impl"
    // InternalTC.g:1256:1: rule__GSSTC__Group_15__2__Impl : ( ( rule__GSSTC__Level1_formatAssignment_15_2 ) ) ;
    public final void rule__GSSTC__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1260:1: ( ( ( rule__GSSTC__Level1_formatAssignment_15_2 ) ) )
            // InternalTC.g:1261:1: ( ( rule__GSSTC__Level1_formatAssignment_15_2 ) )
            {
            // InternalTC.g:1261:1: ( ( rule__GSSTC__Level1_formatAssignment_15_2 ) )
            // InternalTC.g:1262:2: ( rule__GSSTC__Level1_formatAssignment_15_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getLevel1_formatAssignment_15_2()); 
            }
            // InternalTC.g:1263:2: ( rule__GSSTC__Level1_formatAssignment_15_2 )
            // InternalTC.g:1263:3: rule__GSSTC__Level1_formatAssignment_15_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Level1_formatAssignment_15_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getLevel1_formatAssignment_15_2()); 
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
    // $ANTLR end "rule__GSSTC__Group_15__2__Impl"


    // $ANTLR start "rule__GSSTC__Group_15__3"
    // InternalTC.g:1271:1: rule__GSSTC__Group_15__3 : rule__GSSTC__Group_15__3__Impl ;
    public final void rule__GSSTC__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1275:1: ( rule__GSSTC__Group_15__3__Impl )
            // InternalTC.g:1276:2: rule__GSSTC__Group_15__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_15__3__Impl();

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
    // $ANTLR end "rule__GSSTC__Group_15__3"


    // $ANTLR start "rule__GSSTC__Group_15__3__Impl"
    // InternalTC.g:1282:1: rule__GSSTC__Group_15__3__Impl : ( '/>' ) ;
    public final void rule__GSSTC__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1286:1: ( ( '/>' ) )
            // InternalTC.g:1287:1: ( '/>' )
            {
            // InternalTC.g:1287:1: ( '/>' )
            // InternalTC.g:1288:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getSolidusGreaterThanSignKeyword_15_3()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getSolidusGreaterThanSignKeyword_15_3()); 
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
    // $ANTLR end "rule__GSSTC__Group_15__3__Impl"


    // $ANTLR start "rule__GSSTC__Group_16__0"
    // InternalTC.g:1298:1: rule__GSSTC__Group_16__0 : rule__GSSTC__Group_16__0__Impl rule__GSSTC__Group_16__1 ;
    public final void rule__GSSTC__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1302:1: ( rule__GSSTC__Group_16__0__Impl rule__GSSTC__Group_16__1 )
            // InternalTC.g:1303:2: rule__GSSTC__Group_16__0__Impl rule__GSSTC__Group_16__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTC__Group_16__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_16__1();

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
    // $ANTLR end "rule__GSSTC__Group_16__0"


    // $ANTLR start "rule__GSSTC__Group_16__0__Impl"
    // InternalTC.g:1310:1: rule__GSSTC__Group_16__0__Impl : ( '<to_level0_export' ) ;
    public final void rule__GSSTC__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1314:1: ( ( '<to_level0_export' ) )
            // InternalTC.g:1315:1: ( '<to_level0_export' )
            {
            // InternalTC.g:1315:1: ( '<to_level0_export' )
            // InternalTC.g:1316:2: '<to_level0_export'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getTo_level0_exportKeyword_16_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getTo_level0_exportKeyword_16_0()); 
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
    // $ANTLR end "rule__GSSTC__Group_16__0__Impl"


    // $ANTLR start "rule__GSSTC__Group_16__1"
    // InternalTC.g:1325:1: rule__GSSTC__Group_16__1 : rule__GSSTC__Group_16__1__Impl rule__GSSTC__Group_16__2 ;
    public final void rule__GSSTC__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1329:1: ( rule__GSSTC__Group_16__1__Impl rule__GSSTC__Group_16__2 )
            // InternalTC.g:1330:2: rule__GSSTC__Group_16__1__Impl rule__GSSTC__Group_16__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTC__Group_16__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_16__2();

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
    // $ANTLR end "rule__GSSTC__Group_16__1"


    // $ANTLR start "rule__GSSTC__Group_16__1__Impl"
    // InternalTC.g:1337:1: rule__GSSTC__Group_16__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTC__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1341:1: ( ( 'file=' ) )
            // InternalTC.g:1342:1: ( 'file=' )
            {
            // InternalTC.g:1342:1: ( 'file=' )
            // InternalTC.g:1343:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getFileKeyword_16_1()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getFileKeyword_16_1()); 
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
    // $ANTLR end "rule__GSSTC__Group_16__1__Impl"


    // $ANTLR start "rule__GSSTC__Group_16__2"
    // InternalTC.g:1352:1: rule__GSSTC__Group_16__2 : rule__GSSTC__Group_16__2__Impl rule__GSSTC__Group_16__3 ;
    public final void rule__GSSTC__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1356:1: ( rule__GSSTC__Group_16__2__Impl rule__GSSTC__Group_16__3 )
            // InternalTC.g:1357:2: rule__GSSTC__Group_16__2__Impl rule__GSSTC__Group_16__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTC__Group_16__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_16__3();

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
    // $ANTLR end "rule__GSSTC__Group_16__2"


    // $ANTLR start "rule__GSSTC__Group_16__2__Impl"
    // InternalTC.g:1364:1: rule__GSSTC__Group_16__2__Impl : ( ( rule__GSSTC__To_level0_exportAssignment_16_2 ) ) ;
    public final void rule__GSSTC__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1368:1: ( ( ( rule__GSSTC__To_level0_exportAssignment_16_2 ) ) )
            // InternalTC.g:1369:1: ( ( rule__GSSTC__To_level0_exportAssignment_16_2 ) )
            {
            // InternalTC.g:1369:1: ( ( rule__GSSTC__To_level0_exportAssignment_16_2 ) )
            // InternalTC.g:1370:2: ( rule__GSSTC__To_level0_exportAssignment_16_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getTo_level0_exportAssignment_16_2()); 
            }
            // InternalTC.g:1371:2: ( rule__GSSTC__To_level0_exportAssignment_16_2 )
            // InternalTC.g:1371:3: rule__GSSTC__To_level0_exportAssignment_16_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__To_level0_exportAssignment_16_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getTo_level0_exportAssignment_16_2()); 
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
    // $ANTLR end "rule__GSSTC__Group_16__2__Impl"


    // $ANTLR start "rule__GSSTC__Group_16__3"
    // InternalTC.g:1379:1: rule__GSSTC__Group_16__3 : rule__GSSTC__Group_16__3__Impl ;
    public final void rule__GSSTC__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1383:1: ( rule__GSSTC__Group_16__3__Impl )
            // InternalTC.g:1384:2: rule__GSSTC__Group_16__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_16__3__Impl();

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
    // $ANTLR end "rule__GSSTC__Group_16__3"


    // $ANTLR start "rule__GSSTC__Group_16__3__Impl"
    // InternalTC.g:1390:1: rule__GSSTC__Group_16__3__Impl : ( '/>' ) ;
    public final void rule__GSSTC__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1394:1: ( ( '/>' ) )
            // InternalTC.g:1395:1: ( '/>' )
            {
            // InternalTC.g:1395:1: ( '/>' )
            // InternalTC.g:1396:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getSolidusGreaterThanSignKeyword_16_3()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getSolidusGreaterThanSignKeyword_16_3()); 
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
    // $ANTLR end "rule__GSSTC__Group_16__3__Impl"


    // $ANTLR start "rule__GSSTC__Group_17__0"
    // InternalTC.g:1406:1: rule__GSSTC__Group_17__0 : rule__GSSTC__Group_17__0__Impl rule__GSSTC__Group_17__1 ;
    public final void rule__GSSTC__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1410:1: ( rule__GSSTC__Group_17__0__Impl rule__GSSTC__Group_17__1 )
            // InternalTC.g:1411:2: rule__GSSTC__Group_17__0__Impl rule__GSSTC__Group_17__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTC__Group_17__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_17__1();

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
    // $ANTLR end "rule__GSSTC__Group_17__0"


    // $ANTLR start "rule__GSSTC__Group_17__0__Impl"
    // InternalTC.g:1418:1: rule__GSSTC__Group_17__0__Impl : ( '<level0_format' ) ;
    public final void rule__GSSTC__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1422:1: ( ( '<level0_format' ) )
            // InternalTC.g:1423:1: ( '<level0_format' )
            {
            // InternalTC.g:1423:1: ( '<level0_format' )
            // InternalTC.g:1424:2: '<level0_format'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getLevel0_formatKeyword_17_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getLevel0_formatKeyword_17_0()); 
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
    // $ANTLR end "rule__GSSTC__Group_17__0__Impl"


    // $ANTLR start "rule__GSSTC__Group_17__1"
    // InternalTC.g:1433:1: rule__GSSTC__Group_17__1 : rule__GSSTC__Group_17__1__Impl rule__GSSTC__Group_17__2 ;
    public final void rule__GSSTC__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1437:1: ( rule__GSSTC__Group_17__1__Impl rule__GSSTC__Group_17__2 )
            // InternalTC.g:1438:2: rule__GSSTC__Group_17__1__Impl rule__GSSTC__Group_17__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTC__Group_17__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_17__2();

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
    // $ANTLR end "rule__GSSTC__Group_17__1"


    // $ANTLR start "rule__GSSTC__Group_17__1__Impl"
    // InternalTC.g:1445:1: rule__GSSTC__Group_17__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTC__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1449:1: ( ( 'file=' ) )
            // InternalTC.g:1450:1: ( 'file=' )
            {
            // InternalTC.g:1450:1: ( 'file=' )
            // InternalTC.g:1451:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getFileKeyword_17_1()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getFileKeyword_17_1()); 
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
    // $ANTLR end "rule__GSSTC__Group_17__1__Impl"


    // $ANTLR start "rule__GSSTC__Group_17__2"
    // InternalTC.g:1460:1: rule__GSSTC__Group_17__2 : rule__GSSTC__Group_17__2__Impl rule__GSSTC__Group_17__3 ;
    public final void rule__GSSTC__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1464:1: ( rule__GSSTC__Group_17__2__Impl rule__GSSTC__Group_17__3 )
            // InternalTC.g:1465:2: rule__GSSTC__Group_17__2__Impl rule__GSSTC__Group_17__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTC__Group_17__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_17__3();

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
    // $ANTLR end "rule__GSSTC__Group_17__2"


    // $ANTLR start "rule__GSSTC__Group_17__2__Impl"
    // InternalTC.g:1472:1: rule__GSSTC__Group_17__2__Impl : ( ( rule__GSSTC__Level0_formatAssignment_17_2 ) ) ;
    public final void rule__GSSTC__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1476:1: ( ( ( rule__GSSTC__Level0_formatAssignment_17_2 ) ) )
            // InternalTC.g:1477:1: ( ( rule__GSSTC__Level0_formatAssignment_17_2 ) )
            {
            // InternalTC.g:1477:1: ( ( rule__GSSTC__Level0_formatAssignment_17_2 ) )
            // InternalTC.g:1478:2: ( rule__GSSTC__Level0_formatAssignment_17_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getLevel0_formatAssignment_17_2()); 
            }
            // InternalTC.g:1479:2: ( rule__GSSTC__Level0_formatAssignment_17_2 )
            // InternalTC.g:1479:3: rule__GSSTC__Level0_formatAssignment_17_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Level0_formatAssignment_17_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getLevel0_formatAssignment_17_2()); 
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
    // $ANTLR end "rule__GSSTC__Group_17__2__Impl"


    // $ANTLR start "rule__GSSTC__Group_17__3"
    // InternalTC.g:1487:1: rule__GSSTC__Group_17__3 : rule__GSSTC__Group_17__3__Impl ;
    public final void rule__GSSTC__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1491:1: ( rule__GSSTC__Group_17__3__Impl )
            // InternalTC.g:1492:2: rule__GSSTC__Group_17__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_17__3__Impl();

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
    // $ANTLR end "rule__GSSTC__Group_17__3"


    // $ANTLR start "rule__GSSTC__Group_17__3__Impl"
    // InternalTC.g:1498:1: rule__GSSTC__Group_17__3__Impl : ( '/>' ) ;
    public final void rule__GSSTC__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1502:1: ( ( '/>' ) )
            // InternalTC.g:1503:1: ( '/>' )
            {
            // InternalTC.g:1503:1: ( '/>' )
            // InternalTC.g:1504:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getSolidusGreaterThanSignKeyword_17_3()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getSolidusGreaterThanSignKeyword_17_3()); 
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
    // $ANTLR end "rule__GSSTC__Group_17__3__Impl"


    // $ANTLR start "rule__GSSTC__Group_18__0"
    // InternalTC.g:1514:1: rule__GSSTC__Group_18__0 : rule__GSSTC__Group_18__0__Impl rule__GSSTC__Group_18__1 ;
    public final void rule__GSSTC__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1518:1: ( rule__GSSTC__Group_18__0__Impl rule__GSSTC__Group_18__1 )
            // InternalTC.g:1519:2: rule__GSSTC__Group_18__0__Impl rule__GSSTC__Group_18__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__GSSTC__Group_18__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_18__1();

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
    // $ANTLR end "rule__GSSTC__Group_18__0"


    // $ANTLR start "rule__GSSTC__Group_18__0__Impl"
    // InternalTC.g:1526:1: rule__GSSTC__Group_18__0__Impl : ( '<fields>' ) ;
    public final void rule__GSSTC__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1530:1: ( ( '<fields>' ) )
            // InternalTC.g:1531:1: ( '<fields>' )
            {
            // InternalTC.g:1531:1: ( '<fields>' )
            // InternalTC.g:1532:2: '<fields>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getFieldsKeyword_18_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getFieldsKeyword_18_0()); 
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
    // $ANTLR end "rule__GSSTC__Group_18__0__Impl"


    // $ANTLR start "rule__GSSTC__Group_18__1"
    // InternalTC.g:1541:1: rule__GSSTC__Group_18__1 : rule__GSSTC__Group_18__1__Impl rule__GSSTC__Group_18__2 ;
    public final void rule__GSSTC__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1545:1: ( rule__GSSTC__Group_18__1__Impl rule__GSSTC__Group_18__2 )
            // InternalTC.g:1546:2: rule__GSSTC__Group_18__1__Impl rule__GSSTC__Group_18__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__GSSTC__Group_18__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_18__2();

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
    // $ANTLR end "rule__GSSTC__Group_18__1"


    // $ANTLR start "rule__GSSTC__Group_18__1__Impl"
    // InternalTC.g:1553:1: rule__GSSTC__Group_18__1__Impl : ( ( ( rule__GSSTC__FieldsAssignment_18_1 ) ) ( ( rule__GSSTC__FieldsAssignment_18_1 )* ) ) ;
    public final void rule__GSSTC__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1557:1: ( ( ( ( rule__GSSTC__FieldsAssignment_18_1 ) ) ( ( rule__GSSTC__FieldsAssignment_18_1 )* ) ) )
            // InternalTC.g:1558:1: ( ( ( rule__GSSTC__FieldsAssignment_18_1 ) ) ( ( rule__GSSTC__FieldsAssignment_18_1 )* ) )
            {
            // InternalTC.g:1558:1: ( ( ( rule__GSSTC__FieldsAssignment_18_1 ) ) ( ( rule__GSSTC__FieldsAssignment_18_1 )* ) )
            // InternalTC.g:1559:2: ( ( rule__GSSTC__FieldsAssignment_18_1 ) ) ( ( rule__GSSTC__FieldsAssignment_18_1 )* )
            {
            // InternalTC.g:1559:2: ( ( rule__GSSTC__FieldsAssignment_18_1 ) )
            // InternalTC.g:1560:3: ( rule__GSSTC__FieldsAssignment_18_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getFieldsAssignment_18_1()); 
            }
            // InternalTC.g:1561:3: ( rule__GSSTC__FieldsAssignment_18_1 )
            // InternalTC.g:1561:4: rule__GSSTC__FieldsAssignment_18_1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__GSSTC__FieldsAssignment_18_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getFieldsAssignment_18_1()); 
            }

            }

            // InternalTC.g:1564:2: ( ( rule__GSSTC__FieldsAssignment_18_1 )* )
            // InternalTC.g:1565:3: ( rule__GSSTC__FieldsAssignment_18_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getFieldsAssignment_18_1()); 
            }
            // InternalTC.g:1566:3: ( rule__GSSTC__FieldsAssignment_18_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTC.g:1566:4: rule__GSSTC__FieldsAssignment_18_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    rule__GSSTC__FieldsAssignment_18_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getFieldsAssignment_18_1()); 
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
    // $ANTLR end "rule__GSSTC__Group_18__1__Impl"


    // $ANTLR start "rule__GSSTC__Group_18__2"
    // InternalTC.g:1575:1: rule__GSSTC__Group_18__2 : rule__GSSTC__Group_18__2__Impl ;
    public final void rule__GSSTC__Group_18__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1579:1: ( rule__GSSTC__Group_18__2__Impl )
            // InternalTC.g:1580:2: rule__GSSTC__Group_18__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTC__Group_18__2__Impl();

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
    // $ANTLR end "rule__GSSTC__Group_18__2"


    // $ANTLR start "rule__GSSTC__Group_18__2__Impl"
    // InternalTC.g:1586:1: rule__GSSTC__Group_18__2__Impl : ( '</fields>' ) ;
    public final void rule__GSSTC__Group_18__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1590:1: ( ( '</fields>' ) )
            // InternalTC.g:1591:1: ( '</fields>' )
            {
            // InternalTC.g:1591:1: ( '</fields>' )
            // InternalTC.g:1592:2: '</fields>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getFieldsKeyword_18_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getFieldsKeyword_18_2()); 
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
    // $ANTLR end "rule__GSSTC__Group_18__2__Impl"


    // $ANTLR start "rule__GSSTCField__Group__0"
    // InternalTC.g:1602:1: rule__GSSTCField__Group__0 : rule__GSSTCField__Group__0__Impl rule__GSSTCField__Group__1 ;
    public final void rule__GSSTCField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1606:1: ( rule__GSSTCField__Group__0__Impl rule__GSSTCField__Group__1 )
            // InternalTC.g:1607:2: rule__GSSTCField__Group__0__Impl rule__GSSTCField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__GSSTCField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCField__Group__1();

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
    // $ANTLR end "rule__GSSTCField__Group__0"


    // $ANTLR start "rule__GSSTCField__Group__0__Impl"
    // InternalTC.g:1614:1: rule__GSSTCField__Group__0__Impl : ( '<Field' ) ;
    public final void rule__GSSTCField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1618:1: ( ( '<Field' ) )
            // InternalTC.g:1619:1: ( '<Field' )
            {
            // InternalTC.g:1619:1: ( '<Field' )
            // InternalTC.g:1620:2: '<Field'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCFieldAccess().getFieldKeyword_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCFieldAccess().getFieldKeyword_0()); 
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
    // $ANTLR end "rule__GSSTCField__Group__0__Impl"


    // $ANTLR start "rule__GSSTCField__Group__1"
    // InternalTC.g:1629:1: rule__GSSTCField__Group__1 : rule__GSSTCField__Group__1__Impl rule__GSSTCField__Group__2 ;
    public final void rule__GSSTCField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1633:1: ( rule__GSSTCField__Group__1__Impl rule__GSSTCField__Group__2 )
            // InternalTC.g:1634:2: rule__GSSTCField__Group__1__Impl rule__GSSTCField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTCField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCField__Group__2();

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
    // $ANTLR end "rule__GSSTCField__Group__1"


    // $ANTLR start "rule__GSSTCField__Group__1__Impl"
    // InternalTC.g:1641:1: rule__GSSTCField__Group__1__Impl : ( 'name=' ) ;
    public final void rule__GSSTCField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1645:1: ( ( 'name=' ) )
            // InternalTC.g:1646:1: ( 'name=' )
            {
            // InternalTC.g:1646:1: ( 'name=' )
            // InternalTC.g:1647:2: 'name='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCFieldAccess().getNameKeyword_1()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCFieldAccess().getNameKeyword_1()); 
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
    // $ANTLR end "rule__GSSTCField__Group__1__Impl"


    // $ANTLR start "rule__GSSTCField__Group__2"
    // InternalTC.g:1656:1: rule__GSSTCField__Group__2 : rule__GSSTCField__Group__2__Impl rule__GSSTCField__Group__3 ;
    public final void rule__GSSTCField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1660:1: ( rule__GSSTCField__Group__2__Impl rule__GSSTCField__Group__3 )
            // InternalTC.g:1661:2: rule__GSSTCField__Group__2__Impl rule__GSSTCField__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__GSSTCField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCField__Group__3();

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
    // $ANTLR end "rule__GSSTCField__Group__2"


    // $ANTLR start "rule__GSSTCField__Group__2__Impl"
    // InternalTC.g:1668:1: rule__GSSTCField__Group__2__Impl : ( ( rule__GSSTCField__NameAssignment_2 ) ) ;
    public final void rule__GSSTCField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1672:1: ( ( ( rule__GSSTCField__NameAssignment_2 ) ) )
            // InternalTC.g:1673:1: ( ( rule__GSSTCField__NameAssignment_2 ) )
            {
            // InternalTC.g:1673:1: ( ( rule__GSSTCField__NameAssignment_2 ) )
            // InternalTC.g:1674:2: ( rule__GSSTCField__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCFieldAccess().getNameAssignment_2()); 
            }
            // InternalTC.g:1675:2: ( rule__GSSTCField__NameAssignment_2 )
            // InternalTC.g:1675:3: rule__GSSTCField__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCField__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCFieldAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__GSSTCField__Group__2__Impl"


    // $ANTLR start "rule__GSSTCField__Group__3"
    // InternalTC.g:1683:1: rule__GSSTCField__Group__3 : rule__GSSTCField__Group__3__Impl rule__GSSTCField__Group__4 ;
    public final void rule__GSSTCField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1687:1: ( rule__GSSTCField__Group__3__Impl rule__GSSTCField__Group__4 )
            // InternalTC.g:1688:2: rule__GSSTCField__Group__3__Impl rule__GSSTCField__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTCField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCField__Group__4();

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
    // $ANTLR end "rule__GSSTCField__Group__3"


    // $ANTLR start "rule__GSSTCField__Group__3__Impl"
    // InternalTC.g:1695:1: rule__GSSTCField__Group__3__Impl : ( 'gssField=' ) ;
    public final void rule__GSSTCField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1699:1: ( ( 'gssField=' ) )
            // InternalTC.g:1700:1: ( 'gssField=' )
            {
            // InternalTC.g:1700:1: ( 'gssField=' )
            // InternalTC.g:1701:2: 'gssField='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCFieldAccess().getGssFieldKeyword_3()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCFieldAccess().getGssFieldKeyword_3()); 
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
    // $ANTLR end "rule__GSSTCField__Group__3__Impl"


    // $ANTLR start "rule__GSSTCField__Group__4"
    // InternalTC.g:1710:1: rule__GSSTCField__Group__4 : rule__GSSTCField__Group__4__Impl rule__GSSTCField__Group__5 ;
    public final void rule__GSSTCField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1714:1: ( rule__GSSTCField__Group__4__Impl rule__GSSTCField__Group__5 )
            // InternalTC.g:1715:2: rule__GSSTCField__Group__4__Impl rule__GSSTCField__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSTCField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCField__Group__5();

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
    // $ANTLR end "rule__GSSTCField__Group__4"


    // $ANTLR start "rule__GSSTCField__Group__4__Impl"
    // InternalTC.g:1722:1: rule__GSSTCField__Group__4__Impl : ( ( rule__GSSTCField__GssFieldAssignment_4 ) ) ;
    public final void rule__GSSTCField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1726:1: ( ( ( rule__GSSTCField__GssFieldAssignment_4 ) ) )
            // InternalTC.g:1727:1: ( ( rule__GSSTCField__GssFieldAssignment_4 ) )
            {
            // InternalTC.g:1727:1: ( ( rule__GSSTCField__GssFieldAssignment_4 ) )
            // InternalTC.g:1728:2: ( rule__GSSTCField__GssFieldAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCFieldAccess().getGssFieldAssignment_4()); 
            }
            // InternalTC.g:1729:2: ( rule__GSSTCField__GssFieldAssignment_4 )
            // InternalTC.g:1729:3: rule__GSSTCField__GssFieldAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCField__GssFieldAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCFieldAccess().getGssFieldAssignment_4()); 
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
    // $ANTLR end "rule__GSSTCField__Group__4__Impl"


    // $ANTLR start "rule__GSSTCField__Group__5"
    // InternalTC.g:1737:1: rule__GSSTCField__Group__5 : rule__GSSTCField__Group__5__Impl rule__GSSTCField__Group__6 ;
    public final void rule__GSSTCField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1741:1: ( rule__GSSTCField__Group__5__Impl rule__GSSTCField__Group__6 )
            // InternalTC.g:1742:2: rule__GSSTCField__Group__5__Impl rule__GSSTCField__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSTCField__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCField__Group__6();

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
    // $ANTLR end "rule__GSSTCField__Group__5"


    // $ANTLR start "rule__GSSTCField__Group__5__Impl"
    // InternalTC.g:1749:1: rule__GSSTCField__Group__5__Impl : ( ( rule__GSSTCField__Group_5__0 )? ) ;
    public final void rule__GSSTCField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1753:1: ( ( ( rule__GSSTCField__Group_5__0 )? ) )
            // InternalTC.g:1754:1: ( ( rule__GSSTCField__Group_5__0 )? )
            {
            // InternalTC.g:1754:1: ( ( rule__GSSTCField__Group_5__0 )? )
            // InternalTC.g:1755:2: ( rule__GSSTCField__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCFieldAccess().getGroup_5()); 
            }
            // InternalTC.g:1756:2: ( rule__GSSTCField__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTC.g:1756:3: rule__GSSTCField__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTCField__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCFieldAccess().getGroup_5()); 
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
    // $ANTLR end "rule__GSSTCField__Group__5__Impl"


    // $ANTLR start "rule__GSSTCField__Group__6"
    // InternalTC.g:1764:1: rule__GSSTCField__Group__6 : rule__GSSTCField__Group__6__Impl ;
    public final void rule__GSSTCField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1768:1: ( rule__GSSTCField__Group__6__Impl )
            // InternalTC.g:1769:2: rule__GSSTCField__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCField__Group__6__Impl();

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
    // $ANTLR end "rule__GSSTCField__Group__6"


    // $ANTLR start "rule__GSSTCField__Group__6__Impl"
    // InternalTC.g:1775:1: rule__GSSTCField__Group__6__Impl : ( '/>' ) ;
    public final void rule__GSSTCField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1779:1: ( ( '/>' ) )
            // InternalTC.g:1780:1: ( '/>' )
            {
            // InternalTC.g:1780:1: ( '/>' )
            // InternalTC.g:1781:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCFieldAccess().getSolidusGreaterThanSignKeyword_6()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCFieldAccess().getSolidusGreaterThanSignKeyword_6()); 
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
    // $ANTLR end "rule__GSSTCField__Group__6__Impl"


    // $ANTLR start "rule__GSSTCField__Group_5__0"
    // InternalTC.g:1791:1: rule__GSSTCField__Group_5__0 : rule__GSSTCField__Group_5__0__Impl rule__GSSTCField__Group_5__1 ;
    public final void rule__GSSTCField__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1795:1: ( rule__GSSTCField__Group_5__0__Impl rule__GSSTCField__Group_5__1 )
            // InternalTC.g:1796:2: rule__GSSTCField__Group_5__0__Impl rule__GSSTCField__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTCField__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCField__Group_5__1();

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
    // $ANTLR end "rule__GSSTCField__Group_5__0"


    // $ANTLR start "rule__GSSTCField__Group_5__0__Impl"
    // InternalTC.g:1803:1: rule__GSSTCField__Group_5__0__Impl : ( 'enumRef=' ) ;
    public final void rule__GSSTCField__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1807:1: ( ( 'enumRef=' ) )
            // InternalTC.g:1808:1: ( 'enumRef=' )
            {
            // InternalTC.g:1808:1: ( 'enumRef=' )
            // InternalTC.g:1809:2: 'enumRef='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCFieldAccess().getEnumRefKeyword_5_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCFieldAccess().getEnumRefKeyword_5_0()); 
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
    // $ANTLR end "rule__GSSTCField__Group_5__0__Impl"


    // $ANTLR start "rule__GSSTCField__Group_5__1"
    // InternalTC.g:1818:1: rule__GSSTCField__Group_5__1 : rule__GSSTCField__Group_5__1__Impl ;
    public final void rule__GSSTCField__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1822:1: ( rule__GSSTCField__Group_5__1__Impl )
            // InternalTC.g:1823:2: rule__GSSTCField__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCField__Group_5__1__Impl();

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
    // $ANTLR end "rule__GSSTCField__Group_5__1"


    // $ANTLR start "rule__GSSTCField__Group_5__1__Impl"
    // InternalTC.g:1829:1: rule__GSSTCField__Group_5__1__Impl : ( ( rule__GSSTCField__EnumRefAssignment_5_1 ) ) ;
    public final void rule__GSSTCField__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1833:1: ( ( ( rule__GSSTCField__EnumRefAssignment_5_1 ) ) )
            // InternalTC.g:1834:1: ( ( rule__GSSTCField__EnumRefAssignment_5_1 ) )
            {
            // InternalTC.g:1834:1: ( ( rule__GSSTCField__EnumRefAssignment_5_1 ) )
            // InternalTC.g:1835:2: ( rule__GSSTCField__EnumRefAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCFieldAccess().getEnumRefAssignment_5_1()); 
            }
            // InternalTC.g:1836:2: ( rule__GSSTCField__EnumRefAssignment_5_1 )
            // InternalTC.g:1836:3: rule__GSSTCField__EnumRefAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTCField__EnumRefAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCFieldAccess().getEnumRefAssignment_5_1()); 
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
    // $ANTLR end "rule__GSSTCField__Group_5__1__Impl"


    // $ANTLR start "rule__GSSTC__NameAssignment_2"
    // InternalTC.g:1845:1: rule__GSSTC__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GSSTC__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1849:1: ( ( RULE_STRING ) )
            // InternalTC.g:1850:2: ( RULE_STRING )
            {
            // InternalTC.g:1850:2: ( RULE_STRING )
            // InternalTC.g:1851:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getNameSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__GSSTC__NameAssignment_2"


    // $ANTLR start "rule__GSSTC__TypeAssignment_4"
    // InternalTC.g:1860:1: rule__GSSTC__TypeAssignment_4 : ( RULE_UINT_STRING ) ;
    public final void rule__GSSTC__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1864:1: ( ( RULE_UINT_STRING ) )
            // InternalTC.g:1865:2: ( RULE_UINT_STRING )
            {
            // InternalTC.g:1865:2: ( RULE_UINT_STRING )
            // InternalTC.g:1866:3: RULE_UINT_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getTypeUINT_STRINGTerminalRuleCall_4_0()); 
            }
            match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getTypeUINT_STRINGTerminalRuleCall_4_0()); 
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
    // $ANTLR end "rule__GSSTC__TypeAssignment_4"


    // $ANTLR start "rule__GSSTC__SubtypeAssignment_6"
    // InternalTC.g:1875:1: rule__GSSTC__SubtypeAssignment_6 : ( RULE_UINT_STRING ) ;
    public final void rule__GSSTC__SubtypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1879:1: ( ( RULE_UINT_STRING ) )
            // InternalTC.g:1880:2: ( RULE_UINT_STRING )
            {
            // InternalTC.g:1880:2: ( RULE_UINT_STRING )
            // InternalTC.g:1881:3: RULE_UINT_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getSubtypeUINT_STRINGTerminalRuleCall_6_0()); 
            }
            match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getSubtypeUINT_STRINGTerminalRuleCall_6_0()); 
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
    // $ANTLR end "rule__GSSTC__SubtypeAssignment_6"


    // $ANTLR start "rule__GSSTC__LevelsAssignment_8"
    // InternalTC.g:1890:1: rule__GSSTC__LevelsAssignment_8 : ( RULE_UINT_STRING ) ;
    public final void rule__GSSTC__LevelsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1894:1: ( ( RULE_UINT_STRING ) )
            // InternalTC.g:1895:2: ( RULE_UINT_STRING )
            {
            // InternalTC.g:1895:2: ( RULE_UINT_STRING )
            // InternalTC.g:1896:3: RULE_UINT_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getLevelsUINT_STRINGTerminalRuleCall_8_0()); 
            }
            match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getLevelsUINT_STRINGTerminalRuleCall_8_0()); 
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
    // $ANTLR end "rule__GSSTC__LevelsAssignment_8"


    // $ANTLR start "rule__GSSTC__To_level3_exportAssignment_10_2"
    // InternalTC.g:1905:1: rule__GSSTC__To_level3_exportAssignment_10_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTC__To_level3_exportAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1909:1: ( ( ( RULE_STRING ) ) )
            // InternalTC.g:1910:2: ( ( RULE_STRING ) )
            {
            // InternalTC.g:1910:2: ( ( RULE_STRING ) )
            // InternalTC.g:1911:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getTo_level3_exportGSSExportExportCrossReference_10_2_0()); 
            }
            // InternalTC.g:1912:3: ( RULE_STRING )
            // InternalTC.g:1913:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getTo_level3_exportGSSExportExportSTRINGTerminalRuleCall_10_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getTo_level3_exportGSSExportExportSTRINGTerminalRuleCall_10_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getTo_level3_exportGSSExportExportCrossReference_10_2_0()); 
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
    // $ANTLR end "rule__GSSTC__To_level3_exportAssignment_10_2"


    // $ANTLR start "rule__GSSTC__Level3_formatAssignment_11_2"
    // InternalTC.g:1924:1: rule__GSSTC__Level3_formatAssignment_11_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTC__Level3_formatAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1928:1: ( ( ( RULE_STRING ) ) )
            // InternalTC.g:1929:2: ( ( RULE_STRING ) )
            {
            // InternalTC.g:1929:2: ( ( RULE_STRING ) )
            // InternalTC.g:1930:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getLevel3_formatGSSFormatFormatCrossReference_11_2_0()); 
            }
            // InternalTC.g:1931:3: ( RULE_STRING )
            // InternalTC.g:1932:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getLevel3_formatGSSFormatFormatSTRINGTerminalRuleCall_11_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getLevel3_formatGSSFormatFormatSTRINGTerminalRuleCall_11_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getLevel3_formatGSSFormatFormatCrossReference_11_2_0()); 
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
    // $ANTLR end "rule__GSSTC__Level3_formatAssignment_11_2"


    // $ANTLR start "rule__GSSTC__To_level2_exportAssignment_12_2"
    // InternalTC.g:1943:1: rule__GSSTC__To_level2_exportAssignment_12_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTC__To_level2_exportAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1947:1: ( ( ( RULE_STRING ) ) )
            // InternalTC.g:1948:2: ( ( RULE_STRING ) )
            {
            // InternalTC.g:1948:2: ( ( RULE_STRING ) )
            // InternalTC.g:1949:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getTo_level2_exportGSSExportExportCrossReference_12_2_0()); 
            }
            // InternalTC.g:1950:3: ( RULE_STRING )
            // InternalTC.g:1951:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getTo_level2_exportGSSExportExportSTRINGTerminalRuleCall_12_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getTo_level2_exportGSSExportExportSTRINGTerminalRuleCall_12_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getTo_level2_exportGSSExportExportCrossReference_12_2_0()); 
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
    // $ANTLR end "rule__GSSTC__To_level2_exportAssignment_12_2"


    // $ANTLR start "rule__GSSTC__Level2_formatAssignment_13_2"
    // InternalTC.g:1962:1: rule__GSSTC__Level2_formatAssignment_13_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTC__Level2_formatAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1966:1: ( ( ( RULE_STRING ) ) )
            // InternalTC.g:1967:2: ( ( RULE_STRING ) )
            {
            // InternalTC.g:1967:2: ( ( RULE_STRING ) )
            // InternalTC.g:1968:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getLevel2_formatGSSFormatFormatCrossReference_13_2_0()); 
            }
            // InternalTC.g:1969:3: ( RULE_STRING )
            // InternalTC.g:1970:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getLevel2_formatGSSFormatFormatSTRINGTerminalRuleCall_13_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getLevel2_formatGSSFormatFormatSTRINGTerminalRuleCall_13_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getLevel2_formatGSSFormatFormatCrossReference_13_2_0()); 
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
    // $ANTLR end "rule__GSSTC__Level2_formatAssignment_13_2"


    // $ANTLR start "rule__GSSTC__To_level1_exportAssignment_14_2"
    // InternalTC.g:1981:1: rule__GSSTC__To_level1_exportAssignment_14_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTC__To_level1_exportAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:1985:1: ( ( ( RULE_STRING ) ) )
            // InternalTC.g:1986:2: ( ( RULE_STRING ) )
            {
            // InternalTC.g:1986:2: ( ( RULE_STRING ) )
            // InternalTC.g:1987:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getTo_level1_exportGSSExportExportCrossReference_14_2_0()); 
            }
            // InternalTC.g:1988:3: ( RULE_STRING )
            // InternalTC.g:1989:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getTo_level1_exportGSSExportExportSTRINGTerminalRuleCall_14_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getTo_level1_exportGSSExportExportSTRINGTerminalRuleCall_14_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getTo_level1_exportGSSExportExportCrossReference_14_2_0()); 
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
    // $ANTLR end "rule__GSSTC__To_level1_exportAssignment_14_2"


    // $ANTLR start "rule__GSSTC__Level1_formatAssignment_15_2"
    // InternalTC.g:2000:1: rule__GSSTC__Level1_formatAssignment_15_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTC__Level1_formatAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:2004:1: ( ( ( RULE_STRING ) ) )
            // InternalTC.g:2005:2: ( ( RULE_STRING ) )
            {
            // InternalTC.g:2005:2: ( ( RULE_STRING ) )
            // InternalTC.g:2006:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getLevel1_formatGSSFormatFormatCrossReference_15_2_0()); 
            }
            // InternalTC.g:2007:3: ( RULE_STRING )
            // InternalTC.g:2008:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getLevel1_formatGSSFormatFormatSTRINGTerminalRuleCall_15_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getLevel1_formatGSSFormatFormatSTRINGTerminalRuleCall_15_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getLevel1_formatGSSFormatFormatCrossReference_15_2_0()); 
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
    // $ANTLR end "rule__GSSTC__Level1_formatAssignment_15_2"


    // $ANTLR start "rule__GSSTC__To_level0_exportAssignment_16_2"
    // InternalTC.g:2019:1: rule__GSSTC__To_level0_exportAssignment_16_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTC__To_level0_exportAssignment_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:2023:1: ( ( ( RULE_STRING ) ) )
            // InternalTC.g:2024:2: ( ( RULE_STRING ) )
            {
            // InternalTC.g:2024:2: ( ( RULE_STRING ) )
            // InternalTC.g:2025:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getTo_level0_exportGSSExportExportCrossReference_16_2_0()); 
            }
            // InternalTC.g:2026:3: ( RULE_STRING )
            // InternalTC.g:2027:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getTo_level0_exportGSSExportExportSTRINGTerminalRuleCall_16_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getTo_level0_exportGSSExportExportSTRINGTerminalRuleCall_16_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getTo_level0_exportGSSExportExportCrossReference_16_2_0()); 
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
    // $ANTLR end "rule__GSSTC__To_level0_exportAssignment_16_2"


    // $ANTLR start "rule__GSSTC__Level0_formatAssignment_17_2"
    // InternalTC.g:2038:1: rule__GSSTC__Level0_formatAssignment_17_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTC__Level0_formatAssignment_17_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:2042:1: ( ( ( RULE_STRING ) ) )
            // InternalTC.g:2043:2: ( ( RULE_STRING ) )
            {
            // InternalTC.g:2043:2: ( ( RULE_STRING ) )
            // InternalTC.g:2044:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getLevel0_formatGSSFormatFormatCrossReference_17_2_0()); 
            }
            // InternalTC.g:2045:3: ( RULE_STRING )
            // InternalTC.g:2046:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getLevel0_formatGSSFormatFormatSTRINGTerminalRuleCall_17_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getLevel0_formatGSSFormatFormatSTRINGTerminalRuleCall_17_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getLevel0_formatGSSFormatFormatCrossReference_17_2_0()); 
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
    // $ANTLR end "rule__GSSTC__Level0_formatAssignment_17_2"


    // $ANTLR start "rule__GSSTC__FieldsAssignment_18_1"
    // InternalTC.g:2057:1: rule__GSSTC__FieldsAssignment_18_1 : ( ruleGSSTCField ) ;
    public final void rule__GSSTC__FieldsAssignment_18_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:2061:1: ( ( ruleGSSTCField ) )
            // InternalTC.g:2062:2: ( ruleGSSTCField )
            {
            // InternalTC.g:2062:2: ( ruleGSSTCField )
            // InternalTC.g:2063:3: ruleGSSTCField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCAccess().getFieldsGSSTCFieldParserRuleCall_18_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSTCField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCAccess().getFieldsGSSTCFieldParserRuleCall_18_1_0()); 
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
    // $ANTLR end "rule__GSSTC__FieldsAssignment_18_1"


    // $ANTLR start "rule__GSSTCField__NameAssignment_2"
    // InternalTC.g:2072:1: rule__GSSTCField__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GSSTCField__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:2076:1: ( ( RULE_STRING ) )
            // InternalTC.g:2077:2: ( RULE_STRING )
            {
            // InternalTC.g:2077:2: ( RULE_STRING )
            // InternalTC.g:2078:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCFieldAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCFieldAccess().getNameSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__GSSTCField__NameAssignment_2"


    // $ANTLR start "rule__GSSTCField__GssFieldAssignment_4"
    // InternalTC.g:2087:1: rule__GSSTCField__GssFieldAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTCField__GssFieldAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:2091:1: ( ( ( RULE_STRING ) ) )
            // InternalTC.g:2092:2: ( ( RULE_STRING ) )
            {
            // InternalTC.g:2092:2: ( ( RULE_STRING ) )
            // InternalTC.g:2093:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCFieldAccess().getGssFieldGSSFormatFieldCrossReference_4_0()); 
            }
            // InternalTC.g:2094:3: ( RULE_STRING )
            // InternalTC.g:2095:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCFieldAccess().getGssFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCFieldAccess().getGssFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCFieldAccess().getGssFieldGSSFormatFieldCrossReference_4_0()); 
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
    // $ANTLR end "rule__GSSTCField__GssFieldAssignment_4"


    // $ANTLR start "rule__GSSTCField__EnumRefAssignment_5_1"
    // InternalTC.g:2106:1: rule__GSSTCField__EnumRefAssignment_5_1 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTCField__EnumRefAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTC.g:2110:1: ( ( ( RULE_STRING ) ) )
            // InternalTC.g:2111:2: ( ( RULE_STRING ) )
            {
            // InternalTC.g:2111:2: ( ( RULE_STRING ) )
            // InternalTC.g:2112:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCFieldAccess().getEnumRefTMTCIFEnumCrossReference_5_1_0()); 
            }
            // InternalTC.g:2113:3: ( RULE_STRING )
            // InternalTC.g:2114:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTCFieldAccess().getEnumRefTMTCIFEnumSTRINGTerminalRuleCall_5_1_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCFieldAccess().getEnumRefTMTCIFEnumSTRINGTerminalRuleCall_5_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTCFieldAccess().getEnumRefTMTCIFEnumCrossReference_5_1_0()); 
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
    // $ANTLR end "rule__GSSTCField__EnumRefAssignment_5_1"

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
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000003FCC0000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200200000L});
    }


}