package es.uah.aut.srg.gss.lang.tm.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.gss.lang.tm.services.TMGrammarAccess;



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
public class InternalTMParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_UINT_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<GSSTM'", "'name='", "'type='", "'subtype='", "'levels='", "'>'", "'</GSSTM>'", "'<level3_format'", "'file='", "'/>'", "'<level3_filter'", "'<from_level2_import'", "'<level2_format'", "'<level2_filter'", "'<from_level1_import'", "'<level1_format'", "'<level1_filter'", "'<from_level0_import'", "'<level0_format'", "'<level0_filter'", "'<fields>'", "'</fields>'", "'<PI1'", "'val='", "'gssField='", "'<Field'", "'enumRef='"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_UINT_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
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


        public InternalTMParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTMParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTMParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTM.g"; }


    	private TMGrammarAccess grammarAccess;

    	public void setGrammarAccess(TMGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleGSSTM"
    // InternalTM.g:61:1: entryRuleGSSTM : ruleGSSTM EOF ;
    public final void entryRuleGSSTM() throws RecognitionException {
        try {
            // InternalTM.g:62:1: ( ruleGSSTM EOF )
            // InternalTM.g:63:1: ruleGSSTM EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSTM();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMRule()); 
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
    // $ANTLR end "entryRuleGSSTM"


    // $ANTLR start "ruleGSSTM"
    // InternalTM.g:70:1: ruleGSSTM : ( ( rule__GSSTM__Group__0 ) ) ;
    public final void ruleGSSTM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:74:2: ( ( ( rule__GSSTM__Group__0 ) ) )
            // InternalTM.g:75:2: ( ( rule__GSSTM__Group__0 ) )
            {
            // InternalTM.g:75:2: ( ( rule__GSSTM__Group__0 ) )
            // InternalTM.g:76:3: ( rule__GSSTM__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getGroup()); 
            }
            // InternalTM.g:77:3: ( rule__GSSTM__Group__0 )
            // InternalTM.g:77:4: rule__GSSTM__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getGroup()); 
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
    // $ANTLR end "ruleGSSTM"


    // $ANTLR start "entryRuleGSSTMPi1"
    // InternalTM.g:86:1: entryRuleGSSTMPi1 : ruleGSSTMPi1 EOF ;
    public final void entryRuleGSSTMPi1() throws RecognitionException {
        try {
            // InternalTM.g:87:1: ( ruleGSSTMPi1 EOF )
            // InternalTM.g:88:1: ruleGSSTMPi1 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMPi1Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSTMPi1();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMPi1Rule()); 
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
    // $ANTLR end "entryRuleGSSTMPi1"


    // $ANTLR start "ruleGSSTMPi1"
    // InternalTM.g:95:1: ruleGSSTMPi1 : ( ( rule__GSSTMPi1__Group__0 ) ) ;
    public final void ruleGSSTMPi1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:99:2: ( ( ( rule__GSSTMPi1__Group__0 ) ) )
            // InternalTM.g:100:2: ( ( rule__GSSTMPi1__Group__0 ) )
            {
            // InternalTM.g:100:2: ( ( rule__GSSTMPi1__Group__0 ) )
            // InternalTM.g:101:3: ( rule__GSSTMPi1__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMPi1Access().getGroup()); 
            }
            // InternalTM.g:102:3: ( rule__GSSTMPi1__Group__0 )
            // InternalTM.g:102:4: rule__GSSTMPi1__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMPi1__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMPi1Access().getGroup()); 
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
    // $ANTLR end "ruleGSSTMPi1"


    // $ANTLR start "entryRuleGSSTMField"
    // InternalTM.g:111:1: entryRuleGSSTMField : ruleGSSTMField EOF ;
    public final void entryRuleGSSTMField() throws RecognitionException {
        try {
            // InternalTM.g:112:1: ( ruleGSSTMField EOF )
            // InternalTM.g:113:1: ruleGSSTMField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSTMField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMFieldRule()); 
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
    // $ANTLR end "entryRuleGSSTMField"


    // $ANTLR start "ruleGSSTMField"
    // InternalTM.g:120:1: ruleGSSTMField : ( ( rule__GSSTMField__Group__0 ) ) ;
    public final void ruleGSSTMField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:124:2: ( ( ( rule__GSSTMField__Group__0 ) ) )
            // InternalTM.g:125:2: ( ( rule__GSSTMField__Group__0 ) )
            {
            // InternalTM.g:125:2: ( ( rule__GSSTMField__Group__0 ) )
            // InternalTM.g:126:3: ( rule__GSSTMField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMFieldAccess().getGroup()); 
            }
            // InternalTM.g:127:3: ( rule__GSSTMField__Group__0 )
            // InternalTM.g:127:4: rule__GSSTMField__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMFieldAccess().getGroup()); 
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
    // $ANTLR end "ruleGSSTMField"


    // $ANTLR start "rule__GSSTM__Group__0"
    // InternalTM.g:135:1: rule__GSSTM__Group__0 : rule__GSSTM__Group__0__Impl rule__GSSTM__Group__1 ;
    public final void rule__GSSTM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:139:1: ( rule__GSSTM__Group__0__Impl rule__GSSTM__Group__1 )
            // InternalTM.g:140:2: rule__GSSTM__Group__0__Impl rule__GSSTM__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__GSSTM__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group__1();

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
    // $ANTLR end "rule__GSSTM__Group__0"


    // $ANTLR start "rule__GSSTM__Group__0__Impl"
    // InternalTM.g:147:1: rule__GSSTM__Group__0__Impl : ( '<GSSTM' ) ;
    public final void rule__GSSTM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:151:1: ( ( '<GSSTM' ) )
            // InternalTM.g:152:1: ( '<GSSTM' )
            {
            // InternalTM.g:152:1: ( '<GSSTM' )
            // InternalTM.g:153:2: '<GSSTM'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getGSSTMKeyword_0()); 
            }
            match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getGSSTMKeyword_0()); 
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
    // $ANTLR end "rule__GSSTM__Group__0__Impl"


    // $ANTLR start "rule__GSSTM__Group__1"
    // InternalTM.g:162:1: rule__GSSTM__Group__1 : rule__GSSTM__Group__1__Impl rule__GSSTM__Group__2 ;
    public final void rule__GSSTM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:166:1: ( rule__GSSTM__Group__1__Impl rule__GSSTM__Group__2 )
            // InternalTM.g:167:2: rule__GSSTM__Group__1__Impl rule__GSSTM__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTM__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group__2();

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
    // $ANTLR end "rule__GSSTM__Group__1"


    // $ANTLR start "rule__GSSTM__Group__1__Impl"
    // InternalTM.g:174:1: rule__GSSTM__Group__1__Impl : ( 'name=' ) ;
    public final void rule__GSSTM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:178:1: ( ( 'name=' ) )
            // InternalTM.g:179:1: ( 'name=' )
            {
            // InternalTM.g:179:1: ( 'name=' )
            // InternalTM.g:180:2: 'name='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getNameKeyword_1()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getNameKeyword_1()); 
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
    // $ANTLR end "rule__GSSTM__Group__1__Impl"


    // $ANTLR start "rule__GSSTM__Group__2"
    // InternalTM.g:189:1: rule__GSSTM__Group__2 : rule__GSSTM__Group__2__Impl rule__GSSTM__Group__3 ;
    public final void rule__GSSTM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:193:1: ( rule__GSSTM__Group__2__Impl rule__GSSTM__Group__3 )
            // InternalTM.g:194:2: rule__GSSTM__Group__2__Impl rule__GSSTM__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSTM__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group__3();

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
    // $ANTLR end "rule__GSSTM__Group__2"


    // $ANTLR start "rule__GSSTM__Group__2__Impl"
    // InternalTM.g:201:1: rule__GSSTM__Group__2__Impl : ( ( rule__GSSTM__NameAssignment_2 ) ) ;
    public final void rule__GSSTM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:205:1: ( ( ( rule__GSSTM__NameAssignment_2 ) ) )
            // InternalTM.g:206:1: ( ( rule__GSSTM__NameAssignment_2 ) )
            {
            // InternalTM.g:206:1: ( ( rule__GSSTM__NameAssignment_2 ) )
            // InternalTM.g:207:2: ( rule__GSSTM__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getNameAssignment_2()); 
            }
            // InternalTM.g:208:2: ( rule__GSSTM__NameAssignment_2 )
            // InternalTM.g:208:3: rule__GSSTM__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__GSSTM__Group__2__Impl"


    // $ANTLR start "rule__GSSTM__Group__3"
    // InternalTM.g:216:1: rule__GSSTM__Group__3 : rule__GSSTM__Group__3__Impl rule__GSSTM__Group__4 ;
    public final void rule__GSSTM__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:220:1: ( rule__GSSTM__Group__3__Impl rule__GSSTM__Group__4 )
            // InternalTM.g:221:2: rule__GSSTM__Group__3__Impl rule__GSSTM__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSTM__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group__4();

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
    // $ANTLR end "rule__GSSTM__Group__3"


    // $ANTLR start "rule__GSSTM__Group__3__Impl"
    // InternalTM.g:228:1: rule__GSSTM__Group__3__Impl : ( 'type=' ) ;
    public final void rule__GSSTM__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:232:1: ( ( 'type=' ) )
            // InternalTM.g:233:1: ( 'type=' )
            {
            // InternalTM.g:233:1: ( 'type=' )
            // InternalTM.g:234:2: 'type='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getTypeKeyword_3()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getTypeKeyword_3()); 
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
    // $ANTLR end "rule__GSSTM__Group__3__Impl"


    // $ANTLR start "rule__GSSTM__Group__4"
    // InternalTM.g:243:1: rule__GSSTM__Group__4 : rule__GSSTM__Group__4__Impl rule__GSSTM__Group__5 ;
    public final void rule__GSSTM__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:247:1: ( rule__GSSTM__Group__4__Impl rule__GSSTM__Group__5 )
            // InternalTM.g:248:2: rule__GSSTM__Group__4__Impl rule__GSSTM__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSTM__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group__5();

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
    // $ANTLR end "rule__GSSTM__Group__4"


    // $ANTLR start "rule__GSSTM__Group__4__Impl"
    // InternalTM.g:255:1: rule__GSSTM__Group__4__Impl : ( ( rule__GSSTM__TypeAssignment_4 ) ) ;
    public final void rule__GSSTM__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:259:1: ( ( ( rule__GSSTM__TypeAssignment_4 ) ) )
            // InternalTM.g:260:1: ( ( rule__GSSTM__TypeAssignment_4 ) )
            {
            // InternalTM.g:260:1: ( ( rule__GSSTM__TypeAssignment_4 ) )
            // InternalTM.g:261:2: ( rule__GSSTM__TypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getTypeAssignment_4()); 
            }
            // InternalTM.g:262:2: ( rule__GSSTM__TypeAssignment_4 )
            // InternalTM.g:262:3: rule__GSSTM__TypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__TypeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getTypeAssignment_4()); 
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
    // $ANTLR end "rule__GSSTM__Group__4__Impl"


    // $ANTLR start "rule__GSSTM__Group__5"
    // InternalTM.g:270:1: rule__GSSTM__Group__5 : rule__GSSTM__Group__5__Impl rule__GSSTM__Group__6 ;
    public final void rule__GSSTM__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:274:1: ( rule__GSSTM__Group__5__Impl rule__GSSTM__Group__6 )
            // InternalTM.g:275:2: rule__GSSTM__Group__5__Impl rule__GSSTM__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSTM__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group__6();

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
    // $ANTLR end "rule__GSSTM__Group__5"


    // $ANTLR start "rule__GSSTM__Group__5__Impl"
    // InternalTM.g:282:1: rule__GSSTM__Group__5__Impl : ( 'subtype=' ) ;
    public final void rule__GSSTM__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:286:1: ( ( 'subtype=' ) )
            // InternalTM.g:287:1: ( 'subtype=' )
            {
            // InternalTM.g:287:1: ( 'subtype=' )
            // InternalTM.g:288:2: 'subtype='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getSubtypeKeyword_5()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getSubtypeKeyword_5()); 
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
    // $ANTLR end "rule__GSSTM__Group__5__Impl"


    // $ANTLR start "rule__GSSTM__Group__6"
    // InternalTM.g:297:1: rule__GSSTM__Group__6 : rule__GSSTM__Group__6__Impl rule__GSSTM__Group__7 ;
    public final void rule__GSSTM__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:301:1: ( rule__GSSTM__Group__6__Impl rule__GSSTM__Group__7 )
            // InternalTM.g:302:2: rule__GSSTM__Group__6__Impl rule__GSSTM__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSTM__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group__7();

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
    // $ANTLR end "rule__GSSTM__Group__6"


    // $ANTLR start "rule__GSSTM__Group__6__Impl"
    // InternalTM.g:309:1: rule__GSSTM__Group__6__Impl : ( ( rule__GSSTM__SubtypeAssignment_6 ) ) ;
    public final void rule__GSSTM__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:313:1: ( ( ( rule__GSSTM__SubtypeAssignment_6 ) ) )
            // InternalTM.g:314:1: ( ( rule__GSSTM__SubtypeAssignment_6 ) )
            {
            // InternalTM.g:314:1: ( ( rule__GSSTM__SubtypeAssignment_6 ) )
            // InternalTM.g:315:2: ( rule__GSSTM__SubtypeAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getSubtypeAssignment_6()); 
            }
            // InternalTM.g:316:2: ( rule__GSSTM__SubtypeAssignment_6 )
            // InternalTM.g:316:3: rule__GSSTM__SubtypeAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__SubtypeAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getSubtypeAssignment_6()); 
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
    // $ANTLR end "rule__GSSTM__Group__6__Impl"


    // $ANTLR start "rule__GSSTM__Group__7"
    // InternalTM.g:324:1: rule__GSSTM__Group__7 : rule__GSSTM__Group__7__Impl rule__GSSTM__Group__8 ;
    public final void rule__GSSTM__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:328:1: ( rule__GSSTM__Group__7__Impl rule__GSSTM__Group__8 )
            // InternalTM.g:329:2: rule__GSSTM__Group__7__Impl rule__GSSTM__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSTM__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group__8();

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
    // $ANTLR end "rule__GSSTM__Group__7"


    // $ANTLR start "rule__GSSTM__Group__7__Impl"
    // InternalTM.g:336:1: rule__GSSTM__Group__7__Impl : ( 'levels=' ) ;
    public final void rule__GSSTM__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:340:1: ( ( 'levels=' ) )
            // InternalTM.g:341:1: ( 'levels=' )
            {
            // InternalTM.g:341:1: ( 'levels=' )
            // InternalTM.g:342:2: 'levels='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevelsKeyword_7()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevelsKeyword_7()); 
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
    // $ANTLR end "rule__GSSTM__Group__7__Impl"


    // $ANTLR start "rule__GSSTM__Group__8"
    // InternalTM.g:351:1: rule__GSSTM__Group__8 : rule__GSSTM__Group__8__Impl rule__GSSTM__Group__9 ;
    public final void rule__GSSTM__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:355:1: ( rule__GSSTM__Group__8__Impl rule__GSSTM__Group__9 )
            // InternalTM.g:356:2: rule__GSSTM__Group__8__Impl rule__GSSTM__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSTM__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group__9();

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
    // $ANTLR end "rule__GSSTM__Group__8"


    // $ANTLR start "rule__GSSTM__Group__8__Impl"
    // InternalTM.g:363:1: rule__GSSTM__Group__8__Impl : ( ( rule__GSSTM__LevelsAssignment_8 ) ) ;
    public final void rule__GSSTM__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:367:1: ( ( ( rule__GSSTM__LevelsAssignment_8 ) ) )
            // InternalTM.g:368:1: ( ( rule__GSSTM__LevelsAssignment_8 ) )
            {
            // InternalTM.g:368:1: ( ( rule__GSSTM__LevelsAssignment_8 ) )
            // InternalTM.g:369:2: ( rule__GSSTM__LevelsAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevelsAssignment_8()); 
            }
            // InternalTM.g:370:2: ( rule__GSSTM__LevelsAssignment_8 )
            // InternalTM.g:370:3: rule__GSSTM__LevelsAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__LevelsAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevelsAssignment_8()); 
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
    // $ANTLR end "rule__GSSTM__Group__8__Impl"


    // $ANTLR start "rule__GSSTM__Group__9"
    // InternalTM.g:378:1: rule__GSSTM__Group__9 : rule__GSSTM__Group__9__Impl rule__GSSTM__Group__10 ;
    public final void rule__GSSTM__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:382:1: ( rule__GSSTM__Group__9__Impl rule__GSSTM__Group__10 )
            // InternalTM.g:383:2: rule__GSSTM__Group__9__Impl rule__GSSTM__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTM__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group__10();

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
    // $ANTLR end "rule__GSSTM__Group__9"


    // $ANTLR start "rule__GSSTM__Group__9__Impl"
    // InternalTM.g:390:1: rule__GSSTM__Group__9__Impl : ( '>' ) ;
    public final void rule__GSSTM__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:394:1: ( ( '>' ) )
            // InternalTM.g:395:1: ( '>' )
            {
            // InternalTM.g:395:1: ( '>' )
            // InternalTM.g:396:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getGreaterThanSignKeyword_9()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getGreaterThanSignKeyword_9()); 
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
    // $ANTLR end "rule__GSSTM__Group__9__Impl"


    // $ANTLR start "rule__GSSTM__Group__10"
    // InternalTM.g:405:1: rule__GSSTM__Group__10 : rule__GSSTM__Group__10__Impl rule__GSSTM__Group__11 ;
    public final void rule__GSSTM__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:409:1: ( rule__GSSTM__Group__10__Impl rule__GSSTM__Group__11 )
            // InternalTM.g:410:2: rule__GSSTM__Group__10__Impl rule__GSSTM__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTM__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group__11();

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
    // $ANTLR end "rule__GSSTM__Group__10"


    // $ANTLR start "rule__GSSTM__Group__10__Impl"
    // InternalTM.g:417:1: rule__GSSTM__Group__10__Impl : ( ( rule__GSSTM__Group_10__0 )? ) ;
    public final void rule__GSSTM__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:421:1: ( ( ( rule__GSSTM__Group_10__0 )? ) )
            // InternalTM.g:422:1: ( ( rule__GSSTM__Group_10__0 )? )
            {
            // InternalTM.g:422:1: ( ( rule__GSSTM__Group_10__0 )? )
            // InternalTM.g:423:2: ( rule__GSSTM__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getGroup_10()); 
            }
            // InternalTM.g:424:2: ( rule__GSSTM__Group_10__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTM.g:424:3: rule__GSSTM__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTM__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getGroup_10()); 
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
    // $ANTLR end "rule__GSSTM__Group__10__Impl"


    // $ANTLR start "rule__GSSTM__Group__11"
    // InternalTM.g:432:1: rule__GSSTM__Group__11 : rule__GSSTM__Group__11__Impl rule__GSSTM__Group__12 ;
    public final void rule__GSSTM__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:436:1: ( rule__GSSTM__Group__11__Impl rule__GSSTM__Group__12 )
            // InternalTM.g:437:2: rule__GSSTM__Group__11__Impl rule__GSSTM__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTM__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group__12();

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
    // $ANTLR end "rule__GSSTM__Group__11"


    // $ANTLR start "rule__GSSTM__Group__11__Impl"
    // InternalTM.g:444:1: rule__GSSTM__Group__11__Impl : ( ( rule__GSSTM__Group_11__0 )? ) ;
    public final void rule__GSSTM__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:448:1: ( ( ( rule__GSSTM__Group_11__0 )? ) )
            // InternalTM.g:449:1: ( ( rule__GSSTM__Group_11__0 )? )
            {
            // InternalTM.g:449:1: ( ( rule__GSSTM__Group_11__0 )? )
            // InternalTM.g:450:2: ( rule__GSSTM__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getGroup_11()); 
            }
            // InternalTM.g:451:2: ( rule__GSSTM__Group_11__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTM.g:451:3: rule__GSSTM__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTM__Group_11__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getGroup_11()); 
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
    // $ANTLR end "rule__GSSTM__Group__11__Impl"


    // $ANTLR start "rule__GSSTM__Group__12"
    // InternalTM.g:459:1: rule__GSSTM__Group__12 : rule__GSSTM__Group__12__Impl rule__GSSTM__Group__13 ;
    public final void rule__GSSTM__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:463:1: ( rule__GSSTM__Group__12__Impl rule__GSSTM__Group__13 )
            // InternalTM.g:464:2: rule__GSSTM__Group__12__Impl rule__GSSTM__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTM__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group__13();

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
    // $ANTLR end "rule__GSSTM__Group__12"


    // $ANTLR start "rule__GSSTM__Group__12__Impl"
    // InternalTM.g:471:1: rule__GSSTM__Group__12__Impl : ( ( rule__GSSTM__Group_12__0 )? ) ;
    public final void rule__GSSTM__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:475:1: ( ( ( rule__GSSTM__Group_12__0 )? ) )
            // InternalTM.g:476:1: ( ( rule__GSSTM__Group_12__0 )? )
            {
            // InternalTM.g:476:1: ( ( rule__GSSTM__Group_12__0 )? )
            // InternalTM.g:477:2: ( rule__GSSTM__Group_12__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getGroup_12()); 
            }
            // InternalTM.g:478:2: ( rule__GSSTM__Group_12__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTM.g:478:3: rule__GSSTM__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTM__Group_12__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getGroup_12()); 
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
    // $ANTLR end "rule__GSSTM__Group__12__Impl"


    // $ANTLR start "rule__GSSTM__Group__13"
    // InternalTM.g:486:1: rule__GSSTM__Group__13 : rule__GSSTM__Group__13__Impl rule__GSSTM__Group__14 ;
    public final void rule__GSSTM__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:490:1: ( rule__GSSTM__Group__13__Impl rule__GSSTM__Group__14 )
            // InternalTM.g:491:2: rule__GSSTM__Group__13__Impl rule__GSSTM__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTM__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group__14();

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
    // $ANTLR end "rule__GSSTM__Group__13"


    // $ANTLR start "rule__GSSTM__Group__13__Impl"
    // InternalTM.g:498:1: rule__GSSTM__Group__13__Impl : ( ( rule__GSSTM__Group_13__0 )? ) ;
    public final void rule__GSSTM__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:502:1: ( ( ( rule__GSSTM__Group_13__0 )? ) )
            // InternalTM.g:503:1: ( ( rule__GSSTM__Group_13__0 )? )
            {
            // InternalTM.g:503:1: ( ( rule__GSSTM__Group_13__0 )? )
            // InternalTM.g:504:2: ( rule__GSSTM__Group_13__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getGroup_13()); 
            }
            // InternalTM.g:505:2: ( rule__GSSTM__Group_13__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTM.g:505:3: rule__GSSTM__Group_13__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTM__Group_13__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getGroup_13()); 
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
    // $ANTLR end "rule__GSSTM__Group__13__Impl"


    // $ANTLR start "rule__GSSTM__Group__14"
    // InternalTM.g:513:1: rule__GSSTM__Group__14 : rule__GSSTM__Group__14__Impl rule__GSSTM__Group__15 ;
    public final void rule__GSSTM__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:517:1: ( rule__GSSTM__Group__14__Impl rule__GSSTM__Group__15 )
            // InternalTM.g:518:2: rule__GSSTM__Group__14__Impl rule__GSSTM__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTM__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group__15();

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
    // $ANTLR end "rule__GSSTM__Group__14"


    // $ANTLR start "rule__GSSTM__Group__14__Impl"
    // InternalTM.g:525:1: rule__GSSTM__Group__14__Impl : ( ( rule__GSSTM__Group_14__0 )? ) ;
    public final void rule__GSSTM__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:529:1: ( ( ( rule__GSSTM__Group_14__0 )? ) )
            // InternalTM.g:530:1: ( ( rule__GSSTM__Group_14__0 )? )
            {
            // InternalTM.g:530:1: ( ( rule__GSSTM__Group_14__0 )? )
            // InternalTM.g:531:2: ( rule__GSSTM__Group_14__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getGroup_14()); 
            }
            // InternalTM.g:532:2: ( rule__GSSTM__Group_14__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTM.g:532:3: rule__GSSTM__Group_14__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTM__Group_14__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getGroup_14()); 
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
    // $ANTLR end "rule__GSSTM__Group__14__Impl"


    // $ANTLR start "rule__GSSTM__Group__15"
    // InternalTM.g:540:1: rule__GSSTM__Group__15 : rule__GSSTM__Group__15__Impl rule__GSSTM__Group__16 ;
    public final void rule__GSSTM__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:544:1: ( rule__GSSTM__Group__15__Impl rule__GSSTM__Group__16 )
            // InternalTM.g:545:2: rule__GSSTM__Group__15__Impl rule__GSSTM__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTM__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group__16();

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
    // $ANTLR end "rule__GSSTM__Group__15"


    // $ANTLR start "rule__GSSTM__Group__15__Impl"
    // InternalTM.g:552:1: rule__GSSTM__Group__15__Impl : ( ( rule__GSSTM__Group_15__0 )? ) ;
    public final void rule__GSSTM__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:556:1: ( ( ( rule__GSSTM__Group_15__0 )? ) )
            // InternalTM.g:557:1: ( ( rule__GSSTM__Group_15__0 )? )
            {
            // InternalTM.g:557:1: ( ( rule__GSSTM__Group_15__0 )? )
            // InternalTM.g:558:2: ( rule__GSSTM__Group_15__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getGroup_15()); 
            }
            // InternalTM.g:559:2: ( rule__GSSTM__Group_15__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTM.g:559:3: rule__GSSTM__Group_15__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTM__Group_15__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getGroup_15()); 
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
    // $ANTLR end "rule__GSSTM__Group__15__Impl"


    // $ANTLR start "rule__GSSTM__Group__16"
    // InternalTM.g:567:1: rule__GSSTM__Group__16 : rule__GSSTM__Group__16__Impl rule__GSSTM__Group__17 ;
    public final void rule__GSSTM__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:571:1: ( rule__GSSTM__Group__16__Impl rule__GSSTM__Group__17 )
            // InternalTM.g:572:2: rule__GSSTM__Group__16__Impl rule__GSSTM__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTM__Group__16__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group__17();

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
    // $ANTLR end "rule__GSSTM__Group__16"


    // $ANTLR start "rule__GSSTM__Group__16__Impl"
    // InternalTM.g:579:1: rule__GSSTM__Group__16__Impl : ( ( rule__GSSTM__Group_16__0 )? ) ;
    public final void rule__GSSTM__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:583:1: ( ( ( rule__GSSTM__Group_16__0 )? ) )
            // InternalTM.g:584:1: ( ( rule__GSSTM__Group_16__0 )? )
            {
            // InternalTM.g:584:1: ( ( rule__GSSTM__Group_16__0 )? )
            // InternalTM.g:585:2: ( rule__GSSTM__Group_16__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getGroup_16()); 
            }
            // InternalTM.g:586:2: ( rule__GSSTM__Group_16__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTM.g:586:3: rule__GSSTM__Group_16__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTM__Group_16__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getGroup_16()); 
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
    // $ANTLR end "rule__GSSTM__Group__16__Impl"


    // $ANTLR start "rule__GSSTM__Group__17"
    // InternalTM.g:594:1: rule__GSSTM__Group__17 : rule__GSSTM__Group__17__Impl rule__GSSTM__Group__18 ;
    public final void rule__GSSTM__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:598:1: ( rule__GSSTM__Group__17__Impl rule__GSSTM__Group__18 )
            // InternalTM.g:599:2: rule__GSSTM__Group__17__Impl rule__GSSTM__Group__18
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTM__Group__17__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group__18();

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
    // $ANTLR end "rule__GSSTM__Group__17"


    // $ANTLR start "rule__GSSTM__Group__17__Impl"
    // InternalTM.g:606:1: rule__GSSTM__Group__17__Impl : ( ( rule__GSSTM__Group_17__0 )? ) ;
    public final void rule__GSSTM__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:610:1: ( ( ( rule__GSSTM__Group_17__0 )? ) )
            // InternalTM.g:611:1: ( ( rule__GSSTM__Group_17__0 )? )
            {
            // InternalTM.g:611:1: ( ( rule__GSSTM__Group_17__0 )? )
            // InternalTM.g:612:2: ( rule__GSSTM__Group_17__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getGroup_17()); 
            }
            // InternalTM.g:613:2: ( rule__GSSTM__Group_17__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTM.g:613:3: rule__GSSTM__Group_17__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTM__Group_17__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getGroup_17()); 
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
    // $ANTLR end "rule__GSSTM__Group__17__Impl"


    // $ANTLR start "rule__GSSTM__Group__18"
    // InternalTM.g:621:1: rule__GSSTM__Group__18 : rule__GSSTM__Group__18__Impl rule__GSSTM__Group__19 ;
    public final void rule__GSSTM__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:625:1: ( rule__GSSTM__Group__18__Impl rule__GSSTM__Group__19 )
            // InternalTM.g:626:2: rule__GSSTM__Group__18__Impl rule__GSSTM__Group__19
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTM__Group__18__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group__19();

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
    // $ANTLR end "rule__GSSTM__Group__18"


    // $ANTLR start "rule__GSSTM__Group__18__Impl"
    // InternalTM.g:633:1: rule__GSSTM__Group__18__Impl : ( ( rule__GSSTM__Group_18__0 )? ) ;
    public final void rule__GSSTM__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:637:1: ( ( ( rule__GSSTM__Group_18__0 )? ) )
            // InternalTM.g:638:1: ( ( rule__GSSTM__Group_18__0 )? )
            {
            // InternalTM.g:638:1: ( ( rule__GSSTM__Group_18__0 )? )
            // InternalTM.g:639:2: ( rule__GSSTM__Group_18__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getGroup_18()); 
            }
            // InternalTM.g:640:2: ( rule__GSSTM__Group_18__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTM.g:640:3: rule__GSSTM__Group_18__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTM__Group_18__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getGroup_18()); 
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
    // $ANTLR end "rule__GSSTM__Group__18__Impl"


    // $ANTLR start "rule__GSSTM__Group__19"
    // InternalTM.g:648:1: rule__GSSTM__Group__19 : rule__GSSTM__Group__19__Impl rule__GSSTM__Group__20 ;
    public final void rule__GSSTM__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:652:1: ( rule__GSSTM__Group__19__Impl rule__GSSTM__Group__20 )
            // InternalTM.g:653:2: rule__GSSTM__Group__19__Impl rule__GSSTM__Group__20
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTM__Group__19__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group__20();

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
    // $ANTLR end "rule__GSSTM__Group__19"


    // $ANTLR start "rule__GSSTM__Group__19__Impl"
    // InternalTM.g:660:1: rule__GSSTM__Group__19__Impl : ( ( rule__GSSTM__Group_19__0 )? ) ;
    public final void rule__GSSTM__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:664:1: ( ( ( rule__GSSTM__Group_19__0 )? ) )
            // InternalTM.g:665:1: ( ( rule__GSSTM__Group_19__0 )? )
            {
            // InternalTM.g:665:1: ( ( rule__GSSTM__Group_19__0 )? )
            // InternalTM.g:666:2: ( rule__GSSTM__Group_19__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getGroup_19()); 
            }
            // InternalTM.g:667:2: ( rule__GSSTM__Group_19__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTM.g:667:3: rule__GSSTM__Group_19__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTM__Group_19__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getGroup_19()); 
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
    // $ANTLR end "rule__GSSTM__Group__19__Impl"


    // $ANTLR start "rule__GSSTM__Group__20"
    // InternalTM.g:675:1: rule__GSSTM__Group__20 : rule__GSSTM__Group__20__Impl rule__GSSTM__Group__21 ;
    public final void rule__GSSTM__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:679:1: ( rule__GSSTM__Group__20__Impl rule__GSSTM__Group__21 )
            // InternalTM.g:680:2: rule__GSSTM__Group__20__Impl rule__GSSTM__Group__21
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTM__Group__20__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group__21();

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
    // $ANTLR end "rule__GSSTM__Group__20"


    // $ANTLR start "rule__GSSTM__Group__20__Impl"
    // InternalTM.g:687:1: rule__GSSTM__Group__20__Impl : ( ( rule__GSSTM__Group_20__0 )? ) ;
    public final void rule__GSSTM__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:691:1: ( ( ( rule__GSSTM__Group_20__0 )? ) )
            // InternalTM.g:692:1: ( ( rule__GSSTM__Group_20__0 )? )
            {
            // InternalTM.g:692:1: ( ( rule__GSSTM__Group_20__0 )? )
            // InternalTM.g:693:2: ( rule__GSSTM__Group_20__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getGroup_20()); 
            }
            // InternalTM.g:694:2: ( rule__GSSTM__Group_20__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTM.g:694:3: rule__GSSTM__Group_20__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTM__Group_20__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getGroup_20()); 
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
    // $ANTLR end "rule__GSSTM__Group__20__Impl"


    // $ANTLR start "rule__GSSTM__Group__21"
    // InternalTM.g:702:1: rule__GSSTM__Group__21 : rule__GSSTM__Group__21__Impl rule__GSSTM__Group__22 ;
    public final void rule__GSSTM__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:706:1: ( rule__GSSTM__Group__21__Impl rule__GSSTM__Group__22 )
            // InternalTM.g:707:2: rule__GSSTM__Group__21__Impl rule__GSSTM__Group__22
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTM__Group__21__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group__22();

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
    // $ANTLR end "rule__GSSTM__Group__21"


    // $ANTLR start "rule__GSSTM__Group__21__Impl"
    // InternalTM.g:714:1: rule__GSSTM__Group__21__Impl : ( ( rule__GSSTM__GssPi1Assignment_21 )? ) ;
    public final void rule__GSSTM__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:718:1: ( ( ( rule__GSSTM__GssPi1Assignment_21 )? ) )
            // InternalTM.g:719:1: ( ( rule__GSSTM__GssPi1Assignment_21 )? )
            {
            // InternalTM.g:719:1: ( ( rule__GSSTM__GssPi1Assignment_21 )? )
            // InternalTM.g:720:2: ( rule__GSSTM__GssPi1Assignment_21 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getGssPi1Assignment_21()); 
            }
            // InternalTM.g:721:2: ( rule__GSSTM__GssPi1Assignment_21 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTM.g:721:3: rule__GSSTM__GssPi1Assignment_21
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTM__GssPi1Assignment_21();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getGssPi1Assignment_21()); 
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
    // $ANTLR end "rule__GSSTM__Group__21__Impl"


    // $ANTLR start "rule__GSSTM__Group__22"
    // InternalTM.g:729:1: rule__GSSTM__Group__22 : rule__GSSTM__Group__22__Impl rule__GSSTM__Group__23 ;
    public final void rule__GSSTM__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:733:1: ( rule__GSSTM__Group__22__Impl rule__GSSTM__Group__23 )
            // InternalTM.g:734:2: rule__GSSTM__Group__22__Impl rule__GSSTM__Group__23
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSTM__Group__22__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group__23();

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
    // $ANTLR end "rule__GSSTM__Group__22"


    // $ANTLR start "rule__GSSTM__Group__22__Impl"
    // InternalTM.g:741:1: rule__GSSTM__Group__22__Impl : ( ( rule__GSSTM__Group_22__0 )? ) ;
    public final void rule__GSSTM__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:745:1: ( ( ( rule__GSSTM__Group_22__0 )? ) )
            // InternalTM.g:746:1: ( ( rule__GSSTM__Group_22__0 )? )
            {
            // InternalTM.g:746:1: ( ( rule__GSSTM__Group_22__0 )? )
            // InternalTM.g:747:2: ( rule__GSSTM__Group_22__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getGroup_22()); 
            }
            // InternalTM.g:748:2: ( rule__GSSTM__Group_22__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTM.g:748:3: rule__GSSTM__Group_22__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTM__Group_22__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getGroup_22()); 
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
    // $ANTLR end "rule__GSSTM__Group__22__Impl"


    // $ANTLR start "rule__GSSTM__Group__23"
    // InternalTM.g:756:1: rule__GSSTM__Group__23 : rule__GSSTM__Group__23__Impl ;
    public final void rule__GSSTM__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:760:1: ( rule__GSSTM__Group__23__Impl )
            // InternalTM.g:761:2: rule__GSSTM__Group__23__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group__23__Impl();

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
    // $ANTLR end "rule__GSSTM__Group__23"


    // $ANTLR start "rule__GSSTM__Group__23__Impl"
    // InternalTM.g:767:1: rule__GSSTM__Group__23__Impl : ( '</GSSTM>' ) ;
    public final void rule__GSSTM__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:771:1: ( ( '</GSSTM>' ) )
            // InternalTM.g:772:1: ( '</GSSTM>' )
            {
            // InternalTM.g:772:1: ( '</GSSTM>' )
            // InternalTM.g:773:2: '</GSSTM>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getGSSTMKeyword_23()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getGSSTMKeyword_23()); 
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
    // $ANTLR end "rule__GSSTM__Group__23__Impl"


    // $ANTLR start "rule__GSSTM__Group_10__0"
    // InternalTM.g:783:1: rule__GSSTM__Group_10__0 : rule__GSSTM__Group_10__0__Impl rule__GSSTM__Group_10__1 ;
    public final void rule__GSSTM__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:787:1: ( rule__GSSTM__Group_10__0__Impl rule__GSSTM__Group_10__1 )
            // InternalTM.g:788:2: rule__GSSTM__Group_10__0__Impl rule__GSSTM__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTM__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_10__1();

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
    // $ANTLR end "rule__GSSTM__Group_10__0"


    // $ANTLR start "rule__GSSTM__Group_10__0__Impl"
    // InternalTM.g:795:1: rule__GSSTM__Group_10__0__Impl : ( '<level3_format' ) ;
    public final void rule__GSSTM__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:799:1: ( ( '<level3_format' ) )
            // InternalTM.g:800:1: ( '<level3_format' )
            {
            // InternalTM.g:800:1: ( '<level3_format' )
            // InternalTM.g:801:2: '<level3_format'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel3_formatKeyword_10_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel3_formatKeyword_10_0()); 
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
    // $ANTLR end "rule__GSSTM__Group_10__0__Impl"


    // $ANTLR start "rule__GSSTM__Group_10__1"
    // InternalTM.g:810:1: rule__GSSTM__Group_10__1 : rule__GSSTM__Group_10__1__Impl rule__GSSTM__Group_10__2 ;
    public final void rule__GSSTM__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:814:1: ( rule__GSSTM__Group_10__1__Impl rule__GSSTM__Group_10__2 )
            // InternalTM.g:815:2: rule__GSSTM__Group_10__1__Impl rule__GSSTM__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTM__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_10__2();

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
    // $ANTLR end "rule__GSSTM__Group_10__1"


    // $ANTLR start "rule__GSSTM__Group_10__1__Impl"
    // InternalTM.g:822:1: rule__GSSTM__Group_10__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTM__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:826:1: ( ( 'file=' ) )
            // InternalTM.g:827:1: ( 'file=' )
            {
            // InternalTM.g:827:1: ( 'file=' )
            // InternalTM.g:828:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getFileKeyword_10_1()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getFileKeyword_10_1()); 
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
    // $ANTLR end "rule__GSSTM__Group_10__1__Impl"


    // $ANTLR start "rule__GSSTM__Group_10__2"
    // InternalTM.g:837:1: rule__GSSTM__Group_10__2 : rule__GSSTM__Group_10__2__Impl rule__GSSTM__Group_10__3 ;
    public final void rule__GSSTM__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:841:1: ( rule__GSSTM__Group_10__2__Impl rule__GSSTM__Group_10__3 )
            // InternalTM.g:842:2: rule__GSSTM__Group_10__2__Impl rule__GSSTM__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTM__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_10__3();

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
    // $ANTLR end "rule__GSSTM__Group_10__2"


    // $ANTLR start "rule__GSSTM__Group_10__2__Impl"
    // InternalTM.g:849:1: rule__GSSTM__Group_10__2__Impl : ( ( rule__GSSTM__Level3_formatAssignment_10_2 ) ) ;
    public final void rule__GSSTM__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:853:1: ( ( ( rule__GSSTM__Level3_formatAssignment_10_2 ) ) )
            // InternalTM.g:854:1: ( ( rule__GSSTM__Level3_formatAssignment_10_2 ) )
            {
            // InternalTM.g:854:1: ( ( rule__GSSTM__Level3_formatAssignment_10_2 ) )
            // InternalTM.g:855:2: ( rule__GSSTM__Level3_formatAssignment_10_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel3_formatAssignment_10_2()); 
            }
            // InternalTM.g:856:2: ( rule__GSSTM__Level3_formatAssignment_10_2 )
            // InternalTM.g:856:3: rule__GSSTM__Level3_formatAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Level3_formatAssignment_10_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel3_formatAssignment_10_2()); 
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
    // $ANTLR end "rule__GSSTM__Group_10__2__Impl"


    // $ANTLR start "rule__GSSTM__Group_10__3"
    // InternalTM.g:864:1: rule__GSSTM__Group_10__3 : rule__GSSTM__Group_10__3__Impl ;
    public final void rule__GSSTM__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:868:1: ( rule__GSSTM__Group_10__3__Impl )
            // InternalTM.g:869:2: rule__GSSTM__Group_10__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_10__3__Impl();

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
    // $ANTLR end "rule__GSSTM__Group_10__3"


    // $ANTLR start "rule__GSSTM__Group_10__3__Impl"
    // InternalTM.g:875:1: rule__GSSTM__Group_10__3__Impl : ( '/>' ) ;
    public final void rule__GSSTM__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:879:1: ( ( '/>' ) )
            // InternalTM.g:880:1: ( '/>' )
            {
            // InternalTM.g:880:1: ( '/>' )
            // InternalTM.g:881:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_10_3()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_10_3()); 
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
    // $ANTLR end "rule__GSSTM__Group_10__3__Impl"


    // $ANTLR start "rule__GSSTM__Group_11__0"
    // InternalTM.g:891:1: rule__GSSTM__Group_11__0 : rule__GSSTM__Group_11__0__Impl rule__GSSTM__Group_11__1 ;
    public final void rule__GSSTM__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:895:1: ( rule__GSSTM__Group_11__0__Impl rule__GSSTM__Group_11__1 )
            // InternalTM.g:896:2: rule__GSSTM__Group_11__0__Impl rule__GSSTM__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTM__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_11__1();

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
    // $ANTLR end "rule__GSSTM__Group_11__0"


    // $ANTLR start "rule__GSSTM__Group_11__0__Impl"
    // InternalTM.g:903:1: rule__GSSTM__Group_11__0__Impl : ( '<level3_filter' ) ;
    public final void rule__GSSTM__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:907:1: ( ( '<level3_filter' ) )
            // InternalTM.g:908:1: ( '<level3_filter' )
            {
            // InternalTM.g:908:1: ( '<level3_filter' )
            // InternalTM.g:909:2: '<level3_filter'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel3_filterKeyword_11_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel3_filterKeyword_11_0()); 
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
    // $ANTLR end "rule__GSSTM__Group_11__0__Impl"


    // $ANTLR start "rule__GSSTM__Group_11__1"
    // InternalTM.g:918:1: rule__GSSTM__Group_11__1 : rule__GSSTM__Group_11__1__Impl rule__GSSTM__Group_11__2 ;
    public final void rule__GSSTM__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:922:1: ( rule__GSSTM__Group_11__1__Impl rule__GSSTM__Group_11__2 )
            // InternalTM.g:923:2: rule__GSSTM__Group_11__1__Impl rule__GSSTM__Group_11__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTM__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_11__2();

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
    // $ANTLR end "rule__GSSTM__Group_11__1"


    // $ANTLR start "rule__GSSTM__Group_11__1__Impl"
    // InternalTM.g:930:1: rule__GSSTM__Group_11__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTM__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:934:1: ( ( 'file=' ) )
            // InternalTM.g:935:1: ( 'file=' )
            {
            // InternalTM.g:935:1: ( 'file=' )
            // InternalTM.g:936:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getFileKeyword_11_1()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getFileKeyword_11_1()); 
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
    // $ANTLR end "rule__GSSTM__Group_11__1__Impl"


    // $ANTLR start "rule__GSSTM__Group_11__2"
    // InternalTM.g:945:1: rule__GSSTM__Group_11__2 : rule__GSSTM__Group_11__2__Impl rule__GSSTM__Group_11__3 ;
    public final void rule__GSSTM__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:949:1: ( rule__GSSTM__Group_11__2__Impl rule__GSSTM__Group_11__3 )
            // InternalTM.g:950:2: rule__GSSTM__Group_11__2__Impl rule__GSSTM__Group_11__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTM__Group_11__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_11__3();

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
    // $ANTLR end "rule__GSSTM__Group_11__2"


    // $ANTLR start "rule__GSSTM__Group_11__2__Impl"
    // InternalTM.g:957:1: rule__GSSTM__Group_11__2__Impl : ( ( rule__GSSTM__Level3_filterAssignment_11_2 ) ) ;
    public final void rule__GSSTM__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:961:1: ( ( ( rule__GSSTM__Level3_filterAssignment_11_2 ) ) )
            // InternalTM.g:962:1: ( ( rule__GSSTM__Level3_filterAssignment_11_2 ) )
            {
            // InternalTM.g:962:1: ( ( rule__GSSTM__Level3_filterAssignment_11_2 ) )
            // InternalTM.g:963:2: ( rule__GSSTM__Level3_filterAssignment_11_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel3_filterAssignment_11_2()); 
            }
            // InternalTM.g:964:2: ( rule__GSSTM__Level3_filterAssignment_11_2 )
            // InternalTM.g:964:3: rule__GSSTM__Level3_filterAssignment_11_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Level3_filterAssignment_11_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel3_filterAssignment_11_2()); 
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
    // $ANTLR end "rule__GSSTM__Group_11__2__Impl"


    // $ANTLR start "rule__GSSTM__Group_11__3"
    // InternalTM.g:972:1: rule__GSSTM__Group_11__3 : rule__GSSTM__Group_11__3__Impl ;
    public final void rule__GSSTM__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:976:1: ( rule__GSSTM__Group_11__3__Impl )
            // InternalTM.g:977:2: rule__GSSTM__Group_11__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_11__3__Impl();

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
    // $ANTLR end "rule__GSSTM__Group_11__3"


    // $ANTLR start "rule__GSSTM__Group_11__3__Impl"
    // InternalTM.g:983:1: rule__GSSTM__Group_11__3__Impl : ( '/>' ) ;
    public final void rule__GSSTM__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:987:1: ( ( '/>' ) )
            // InternalTM.g:988:1: ( '/>' )
            {
            // InternalTM.g:988:1: ( '/>' )
            // InternalTM.g:989:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_11_3()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_11_3()); 
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
    // $ANTLR end "rule__GSSTM__Group_11__3__Impl"


    // $ANTLR start "rule__GSSTM__Group_12__0"
    // InternalTM.g:999:1: rule__GSSTM__Group_12__0 : rule__GSSTM__Group_12__0__Impl rule__GSSTM__Group_12__1 ;
    public final void rule__GSSTM__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1003:1: ( rule__GSSTM__Group_12__0__Impl rule__GSSTM__Group_12__1 )
            // InternalTM.g:1004:2: rule__GSSTM__Group_12__0__Impl rule__GSSTM__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTM__Group_12__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_12__1();

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
    // $ANTLR end "rule__GSSTM__Group_12__0"


    // $ANTLR start "rule__GSSTM__Group_12__0__Impl"
    // InternalTM.g:1011:1: rule__GSSTM__Group_12__0__Impl : ( '<from_level2_import' ) ;
    public final void rule__GSSTM__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1015:1: ( ( '<from_level2_import' ) )
            // InternalTM.g:1016:1: ( '<from_level2_import' )
            {
            // InternalTM.g:1016:1: ( '<from_level2_import' )
            // InternalTM.g:1017:2: '<from_level2_import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getFrom_level2_importKeyword_12_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getFrom_level2_importKeyword_12_0()); 
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
    // $ANTLR end "rule__GSSTM__Group_12__0__Impl"


    // $ANTLR start "rule__GSSTM__Group_12__1"
    // InternalTM.g:1026:1: rule__GSSTM__Group_12__1 : rule__GSSTM__Group_12__1__Impl rule__GSSTM__Group_12__2 ;
    public final void rule__GSSTM__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1030:1: ( rule__GSSTM__Group_12__1__Impl rule__GSSTM__Group_12__2 )
            // InternalTM.g:1031:2: rule__GSSTM__Group_12__1__Impl rule__GSSTM__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTM__Group_12__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_12__2();

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
    // $ANTLR end "rule__GSSTM__Group_12__1"


    // $ANTLR start "rule__GSSTM__Group_12__1__Impl"
    // InternalTM.g:1038:1: rule__GSSTM__Group_12__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTM__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1042:1: ( ( 'file=' ) )
            // InternalTM.g:1043:1: ( 'file=' )
            {
            // InternalTM.g:1043:1: ( 'file=' )
            // InternalTM.g:1044:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getFileKeyword_12_1()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getFileKeyword_12_1()); 
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
    // $ANTLR end "rule__GSSTM__Group_12__1__Impl"


    // $ANTLR start "rule__GSSTM__Group_12__2"
    // InternalTM.g:1053:1: rule__GSSTM__Group_12__2 : rule__GSSTM__Group_12__2__Impl rule__GSSTM__Group_12__3 ;
    public final void rule__GSSTM__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1057:1: ( rule__GSSTM__Group_12__2__Impl rule__GSSTM__Group_12__3 )
            // InternalTM.g:1058:2: rule__GSSTM__Group_12__2__Impl rule__GSSTM__Group_12__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTM__Group_12__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_12__3();

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
    // $ANTLR end "rule__GSSTM__Group_12__2"


    // $ANTLR start "rule__GSSTM__Group_12__2__Impl"
    // InternalTM.g:1065:1: rule__GSSTM__Group_12__2__Impl : ( ( rule__GSSTM__From_level2_importAssignment_12_2 ) ) ;
    public final void rule__GSSTM__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1069:1: ( ( ( rule__GSSTM__From_level2_importAssignment_12_2 ) ) )
            // InternalTM.g:1070:1: ( ( rule__GSSTM__From_level2_importAssignment_12_2 ) )
            {
            // InternalTM.g:1070:1: ( ( rule__GSSTM__From_level2_importAssignment_12_2 ) )
            // InternalTM.g:1071:2: ( rule__GSSTM__From_level2_importAssignment_12_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getFrom_level2_importAssignment_12_2()); 
            }
            // InternalTM.g:1072:2: ( rule__GSSTM__From_level2_importAssignment_12_2 )
            // InternalTM.g:1072:3: rule__GSSTM__From_level2_importAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__From_level2_importAssignment_12_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getFrom_level2_importAssignment_12_2()); 
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
    // $ANTLR end "rule__GSSTM__Group_12__2__Impl"


    // $ANTLR start "rule__GSSTM__Group_12__3"
    // InternalTM.g:1080:1: rule__GSSTM__Group_12__3 : rule__GSSTM__Group_12__3__Impl ;
    public final void rule__GSSTM__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1084:1: ( rule__GSSTM__Group_12__3__Impl )
            // InternalTM.g:1085:2: rule__GSSTM__Group_12__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_12__3__Impl();

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
    // $ANTLR end "rule__GSSTM__Group_12__3"


    // $ANTLR start "rule__GSSTM__Group_12__3__Impl"
    // InternalTM.g:1091:1: rule__GSSTM__Group_12__3__Impl : ( '/>' ) ;
    public final void rule__GSSTM__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1095:1: ( ( '/>' ) )
            // InternalTM.g:1096:1: ( '/>' )
            {
            // InternalTM.g:1096:1: ( '/>' )
            // InternalTM.g:1097:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_12_3()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_12_3()); 
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
    // $ANTLR end "rule__GSSTM__Group_12__3__Impl"


    // $ANTLR start "rule__GSSTM__Group_13__0"
    // InternalTM.g:1107:1: rule__GSSTM__Group_13__0 : rule__GSSTM__Group_13__0__Impl rule__GSSTM__Group_13__1 ;
    public final void rule__GSSTM__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1111:1: ( rule__GSSTM__Group_13__0__Impl rule__GSSTM__Group_13__1 )
            // InternalTM.g:1112:2: rule__GSSTM__Group_13__0__Impl rule__GSSTM__Group_13__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTM__Group_13__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_13__1();

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
    // $ANTLR end "rule__GSSTM__Group_13__0"


    // $ANTLR start "rule__GSSTM__Group_13__0__Impl"
    // InternalTM.g:1119:1: rule__GSSTM__Group_13__0__Impl : ( '<level2_format' ) ;
    public final void rule__GSSTM__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1123:1: ( ( '<level2_format' ) )
            // InternalTM.g:1124:1: ( '<level2_format' )
            {
            // InternalTM.g:1124:1: ( '<level2_format' )
            // InternalTM.g:1125:2: '<level2_format'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel2_formatKeyword_13_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel2_formatKeyword_13_0()); 
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
    // $ANTLR end "rule__GSSTM__Group_13__0__Impl"


    // $ANTLR start "rule__GSSTM__Group_13__1"
    // InternalTM.g:1134:1: rule__GSSTM__Group_13__1 : rule__GSSTM__Group_13__1__Impl rule__GSSTM__Group_13__2 ;
    public final void rule__GSSTM__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1138:1: ( rule__GSSTM__Group_13__1__Impl rule__GSSTM__Group_13__2 )
            // InternalTM.g:1139:2: rule__GSSTM__Group_13__1__Impl rule__GSSTM__Group_13__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTM__Group_13__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_13__2();

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
    // $ANTLR end "rule__GSSTM__Group_13__1"


    // $ANTLR start "rule__GSSTM__Group_13__1__Impl"
    // InternalTM.g:1146:1: rule__GSSTM__Group_13__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTM__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1150:1: ( ( 'file=' ) )
            // InternalTM.g:1151:1: ( 'file=' )
            {
            // InternalTM.g:1151:1: ( 'file=' )
            // InternalTM.g:1152:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getFileKeyword_13_1()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getFileKeyword_13_1()); 
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
    // $ANTLR end "rule__GSSTM__Group_13__1__Impl"


    // $ANTLR start "rule__GSSTM__Group_13__2"
    // InternalTM.g:1161:1: rule__GSSTM__Group_13__2 : rule__GSSTM__Group_13__2__Impl rule__GSSTM__Group_13__3 ;
    public final void rule__GSSTM__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1165:1: ( rule__GSSTM__Group_13__2__Impl rule__GSSTM__Group_13__3 )
            // InternalTM.g:1166:2: rule__GSSTM__Group_13__2__Impl rule__GSSTM__Group_13__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTM__Group_13__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_13__3();

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
    // $ANTLR end "rule__GSSTM__Group_13__2"


    // $ANTLR start "rule__GSSTM__Group_13__2__Impl"
    // InternalTM.g:1173:1: rule__GSSTM__Group_13__2__Impl : ( ( rule__GSSTM__Level2_formatAssignment_13_2 ) ) ;
    public final void rule__GSSTM__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1177:1: ( ( ( rule__GSSTM__Level2_formatAssignment_13_2 ) ) )
            // InternalTM.g:1178:1: ( ( rule__GSSTM__Level2_formatAssignment_13_2 ) )
            {
            // InternalTM.g:1178:1: ( ( rule__GSSTM__Level2_formatAssignment_13_2 ) )
            // InternalTM.g:1179:2: ( rule__GSSTM__Level2_formatAssignment_13_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel2_formatAssignment_13_2()); 
            }
            // InternalTM.g:1180:2: ( rule__GSSTM__Level2_formatAssignment_13_2 )
            // InternalTM.g:1180:3: rule__GSSTM__Level2_formatAssignment_13_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Level2_formatAssignment_13_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel2_formatAssignment_13_2()); 
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
    // $ANTLR end "rule__GSSTM__Group_13__2__Impl"


    // $ANTLR start "rule__GSSTM__Group_13__3"
    // InternalTM.g:1188:1: rule__GSSTM__Group_13__3 : rule__GSSTM__Group_13__3__Impl ;
    public final void rule__GSSTM__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1192:1: ( rule__GSSTM__Group_13__3__Impl )
            // InternalTM.g:1193:2: rule__GSSTM__Group_13__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_13__3__Impl();

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
    // $ANTLR end "rule__GSSTM__Group_13__3"


    // $ANTLR start "rule__GSSTM__Group_13__3__Impl"
    // InternalTM.g:1199:1: rule__GSSTM__Group_13__3__Impl : ( '/>' ) ;
    public final void rule__GSSTM__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1203:1: ( ( '/>' ) )
            // InternalTM.g:1204:1: ( '/>' )
            {
            // InternalTM.g:1204:1: ( '/>' )
            // InternalTM.g:1205:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_13_3()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_13_3()); 
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
    // $ANTLR end "rule__GSSTM__Group_13__3__Impl"


    // $ANTLR start "rule__GSSTM__Group_14__0"
    // InternalTM.g:1215:1: rule__GSSTM__Group_14__0 : rule__GSSTM__Group_14__0__Impl rule__GSSTM__Group_14__1 ;
    public final void rule__GSSTM__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1219:1: ( rule__GSSTM__Group_14__0__Impl rule__GSSTM__Group_14__1 )
            // InternalTM.g:1220:2: rule__GSSTM__Group_14__0__Impl rule__GSSTM__Group_14__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTM__Group_14__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_14__1();

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
    // $ANTLR end "rule__GSSTM__Group_14__0"


    // $ANTLR start "rule__GSSTM__Group_14__0__Impl"
    // InternalTM.g:1227:1: rule__GSSTM__Group_14__0__Impl : ( '<level2_filter' ) ;
    public final void rule__GSSTM__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1231:1: ( ( '<level2_filter' ) )
            // InternalTM.g:1232:1: ( '<level2_filter' )
            {
            // InternalTM.g:1232:1: ( '<level2_filter' )
            // InternalTM.g:1233:2: '<level2_filter'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel2_filterKeyword_14_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel2_filterKeyword_14_0()); 
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
    // $ANTLR end "rule__GSSTM__Group_14__0__Impl"


    // $ANTLR start "rule__GSSTM__Group_14__1"
    // InternalTM.g:1242:1: rule__GSSTM__Group_14__1 : rule__GSSTM__Group_14__1__Impl rule__GSSTM__Group_14__2 ;
    public final void rule__GSSTM__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1246:1: ( rule__GSSTM__Group_14__1__Impl rule__GSSTM__Group_14__2 )
            // InternalTM.g:1247:2: rule__GSSTM__Group_14__1__Impl rule__GSSTM__Group_14__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTM__Group_14__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_14__2();

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
    // $ANTLR end "rule__GSSTM__Group_14__1"


    // $ANTLR start "rule__GSSTM__Group_14__1__Impl"
    // InternalTM.g:1254:1: rule__GSSTM__Group_14__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTM__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1258:1: ( ( 'file=' ) )
            // InternalTM.g:1259:1: ( 'file=' )
            {
            // InternalTM.g:1259:1: ( 'file=' )
            // InternalTM.g:1260:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getFileKeyword_14_1()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getFileKeyword_14_1()); 
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
    // $ANTLR end "rule__GSSTM__Group_14__1__Impl"


    // $ANTLR start "rule__GSSTM__Group_14__2"
    // InternalTM.g:1269:1: rule__GSSTM__Group_14__2 : rule__GSSTM__Group_14__2__Impl rule__GSSTM__Group_14__3 ;
    public final void rule__GSSTM__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1273:1: ( rule__GSSTM__Group_14__2__Impl rule__GSSTM__Group_14__3 )
            // InternalTM.g:1274:2: rule__GSSTM__Group_14__2__Impl rule__GSSTM__Group_14__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTM__Group_14__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_14__3();

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
    // $ANTLR end "rule__GSSTM__Group_14__2"


    // $ANTLR start "rule__GSSTM__Group_14__2__Impl"
    // InternalTM.g:1281:1: rule__GSSTM__Group_14__2__Impl : ( ( rule__GSSTM__Level2_filterAssignment_14_2 ) ) ;
    public final void rule__GSSTM__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1285:1: ( ( ( rule__GSSTM__Level2_filterAssignment_14_2 ) ) )
            // InternalTM.g:1286:1: ( ( rule__GSSTM__Level2_filterAssignment_14_2 ) )
            {
            // InternalTM.g:1286:1: ( ( rule__GSSTM__Level2_filterAssignment_14_2 ) )
            // InternalTM.g:1287:2: ( rule__GSSTM__Level2_filterAssignment_14_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel2_filterAssignment_14_2()); 
            }
            // InternalTM.g:1288:2: ( rule__GSSTM__Level2_filterAssignment_14_2 )
            // InternalTM.g:1288:3: rule__GSSTM__Level2_filterAssignment_14_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Level2_filterAssignment_14_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel2_filterAssignment_14_2()); 
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
    // $ANTLR end "rule__GSSTM__Group_14__2__Impl"


    // $ANTLR start "rule__GSSTM__Group_14__3"
    // InternalTM.g:1296:1: rule__GSSTM__Group_14__3 : rule__GSSTM__Group_14__3__Impl ;
    public final void rule__GSSTM__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1300:1: ( rule__GSSTM__Group_14__3__Impl )
            // InternalTM.g:1301:2: rule__GSSTM__Group_14__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_14__3__Impl();

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
    // $ANTLR end "rule__GSSTM__Group_14__3"


    // $ANTLR start "rule__GSSTM__Group_14__3__Impl"
    // InternalTM.g:1307:1: rule__GSSTM__Group_14__3__Impl : ( '/>' ) ;
    public final void rule__GSSTM__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1311:1: ( ( '/>' ) )
            // InternalTM.g:1312:1: ( '/>' )
            {
            // InternalTM.g:1312:1: ( '/>' )
            // InternalTM.g:1313:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_14_3()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_14_3()); 
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
    // $ANTLR end "rule__GSSTM__Group_14__3__Impl"


    // $ANTLR start "rule__GSSTM__Group_15__0"
    // InternalTM.g:1323:1: rule__GSSTM__Group_15__0 : rule__GSSTM__Group_15__0__Impl rule__GSSTM__Group_15__1 ;
    public final void rule__GSSTM__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1327:1: ( rule__GSSTM__Group_15__0__Impl rule__GSSTM__Group_15__1 )
            // InternalTM.g:1328:2: rule__GSSTM__Group_15__0__Impl rule__GSSTM__Group_15__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTM__Group_15__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_15__1();

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
    // $ANTLR end "rule__GSSTM__Group_15__0"


    // $ANTLR start "rule__GSSTM__Group_15__0__Impl"
    // InternalTM.g:1335:1: rule__GSSTM__Group_15__0__Impl : ( '<from_level1_import' ) ;
    public final void rule__GSSTM__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1339:1: ( ( '<from_level1_import' ) )
            // InternalTM.g:1340:1: ( '<from_level1_import' )
            {
            // InternalTM.g:1340:1: ( '<from_level1_import' )
            // InternalTM.g:1341:2: '<from_level1_import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getFrom_level1_importKeyword_15_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getFrom_level1_importKeyword_15_0()); 
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
    // $ANTLR end "rule__GSSTM__Group_15__0__Impl"


    // $ANTLR start "rule__GSSTM__Group_15__1"
    // InternalTM.g:1350:1: rule__GSSTM__Group_15__1 : rule__GSSTM__Group_15__1__Impl rule__GSSTM__Group_15__2 ;
    public final void rule__GSSTM__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1354:1: ( rule__GSSTM__Group_15__1__Impl rule__GSSTM__Group_15__2 )
            // InternalTM.g:1355:2: rule__GSSTM__Group_15__1__Impl rule__GSSTM__Group_15__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTM__Group_15__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_15__2();

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
    // $ANTLR end "rule__GSSTM__Group_15__1"


    // $ANTLR start "rule__GSSTM__Group_15__1__Impl"
    // InternalTM.g:1362:1: rule__GSSTM__Group_15__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTM__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1366:1: ( ( 'file=' ) )
            // InternalTM.g:1367:1: ( 'file=' )
            {
            // InternalTM.g:1367:1: ( 'file=' )
            // InternalTM.g:1368:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getFileKeyword_15_1()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getFileKeyword_15_1()); 
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
    // $ANTLR end "rule__GSSTM__Group_15__1__Impl"


    // $ANTLR start "rule__GSSTM__Group_15__2"
    // InternalTM.g:1377:1: rule__GSSTM__Group_15__2 : rule__GSSTM__Group_15__2__Impl rule__GSSTM__Group_15__3 ;
    public final void rule__GSSTM__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1381:1: ( rule__GSSTM__Group_15__2__Impl rule__GSSTM__Group_15__3 )
            // InternalTM.g:1382:2: rule__GSSTM__Group_15__2__Impl rule__GSSTM__Group_15__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTM__Group_15__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_15__3();

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
    // $ANTLR end "rule__GSSTM__Group_15__2"


    // $ANTLR start "rule__GSSTM__Group_15__2__Impl"
    // InternalTM.g:1389:1: rule__GSSTM__Group_15__2__Impl : ( ( rule__GSSTM__From_level1_importAssignment_15_2 ) ) ;
    public final void rule__GSSTM__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1393:1: ( ( ( rule__GSSTM__From_level1_importAssignment_15_2 ) ) )
            // InternalTM.g:1394:1: ( ( rule__GSSTM__From_level1_importAssignment_15_2 ) )
            {
            // InternalTM.g:1394:1: ( ( rule__GSSTM__From_level1_importAssignment_15_2 ) )
            // InternalTM.g:1395:2: ( rule__GSSTM__From_level1_importAssignment_15_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getFrom_level1_importAssignment_15_2()); 
            }
            // InternalTM.g:1396:2: ( rule__GSSTM__From_level1_importAssignment_15_2 )
            // InternalTM.g:1396:3: rule__GSSTM__From_level1_importAssignment_15_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__From_level1_importAssignment_15_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getFrom_level1_importAssignment_15_2()); 
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
    // $ANTLR end "rule__GSSTM__Group_15__2__Impl"


    // $ANTLR start "rule__GSSTM__Group_15__3"
    // InternalTM.g:1404:1: rule__GSSTM__Group_15__3 : rule__GSSTM__Group_15__3__Impl ;
    public final void rule__GSSTM__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1408:1: ( rule__GSSTM__Group_15__3__Impl )
            // InternalTM.g:1409:2: rule__GSSTM__Group_15__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_15__3__Impl();

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
    // $ANTLR end "rule__GSSTM__Group_15__3"


    // $ANTLR start "rule__GSSTM__Group_15__3__Impl"
    // InternalTM.g:1415:1: rule__GSSTM__Group_15__3__Impl : ( '/>' ) ;
    public final void rule__GSSTM__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1419:1: ( ( '/>' ) )
            // InternalTM.g:1420:1: ( '/>' )
            {
            // InternalTM.g:1420:1: ( '/>' )
            // InternalTM.g:1421:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_15_3()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_15_3()); 
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
    // $ANTLR end "rule__GSSTM__Group_15__3__Impl"


    // $ANTLR start "rule__GSSTM__Group_16__0"
    // InternalTM.g:1431:1: rule__GSSTM__Group_16__0 : rule__GSSTM__Group_16__0__Impl rule__GSSTM__Group_16__1 ;
    public final void rule__GSSTM__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1435:1: ( rule__GSSTM__Group_16__0__Impl rule__GSSTM__Group_16__1 )
            // InternalTM.g:1436:2: rule__GSSTM__Group_16__0__Impl rule__GSSTM__Group_16__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTM__Group_16__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_16__1();

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
    // $ANTLR end "rule__GSSTM__Group_16__0"


    // $ANTLR start "rule__GSSTM__Group_16__0__Impl"
    // InternalTM.g:1443:1: rule__GSSTM__Group_16__0__Impl : ( '<level1_format' ) ;
    public final void rule__GSSTM__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1447:1: ( ( '<level1_format' ) )
            // InternalTM.g:1448:1: ( '<level1_format' )
            {
            // InternalTM.g:1448:1: ( '<level1_format' )
            // InternalTM.g:1449:2: '<level1_format'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel1_formatKeyword_16_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel1_formatKeyword_16_0()); 
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
    // $ANTLR end "rule__GSSTM__Group_16__0__Impl"


    // $ANTLR start "rule__GSSTM__Group_16__1"
    // InternalTM.g:1458:1: rule__GSSTM__Group_16__1 : rule__GSSTM__Group_16__1__Impl rule__GSSTM__Group_16__2 ;
    public final void rule__GSSTM__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1462:1: ( rule__GSSTM__Group_16__1__Impl rule__GSSTM__Group_16__2 )
            // InternalTM.g:1463:2: rule__GSSTM__Group_16__1__Impl rule__GSSTM__Group_16__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTM__Group_16__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_16__2();

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
    // $ANTLR end "rule__GSSTM__Group_16__1"


    // $ANTLR start "rule__GSSTM__Group_16__1__Impl"
    // InternalTM.g:1470:1: rule__GSSTM__Group_16__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTM__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1474:1: ( ( 'file=' ) )
            // InternalTM.g:1475:1: ( 'file=' )
            {
            // InternalTM.g:1475:1: ( 'file=' )
            // InternalTM.g:1476:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getFileKeyword_16_1()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getFileKeyword_16_1()); 
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
    // $ANTLR end "rule__GSSTM__Group_16__1__Impl"


    // $ANTLR start "rule__GSSTM__Group_16__2"
    // InternalTM.g:1485:1: rule__GSSTM__Group_16__2 : rule__GSSTM__Group_16__2__Impl rule__GSSTM__Group_16__3 ;
    public final void rule__GSSTM__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1489:1: ( rule__GSSTM__Group_16__2__Impl rule__GSSTM__Group_16__3 )
            // InternalTM.g:1490:2: rule__GSSTM__Group_16__2__Impl rule__GSSTM__Group_16__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTM__Group_16__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_16__3();

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
    // $ANTLR end "rule__GSSTM__Group_16__2"


    // $ANTLR start "rule__GSSTM__Group_16__2__Impl"
    // InternalTM.g:1497:1: rule__GSSTM__Group_16__2__Impl : ( ( rule__GSSTM__Level1_formatAssignment_16_2 ) ) ;
    public final void rule__GSSTM__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1501:1: ( ( ( rule__GSSTM__Level1_formatAssignment_16_2 ) ) )
            // InternalTM.g:1502:1: ( ( rule__GSSTM__Level1_formatAssignment_16_2 ) )
            {
            // InternalTM.g:1502:1: ( ( rule__GSSTM__Level1_formatAssignment_16_2 ) )
            // InternalTM.g:1503:2: ( rule__GSSTM__Level1_formatAssignment_16_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel1_formatAssignment_16_2()); 
            }
            // InternalTM.g:1504:2: ( rule__GSSTM__Level1_formatAssignment_16_2 )
            // InternalTM.g:1504:3: rule__GSSTM__Level1_formatAssignment_16_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Level1_formatAssignment_16_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel1_formatAssignment_16_2()); 
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
    // $ANTLR end "rule__GSSTM__Group_16__2__Impl"


    // $ANTLR start "rule__GSSTM__Group_16__3"
    // InternalTM.g:1512:1: rule__GSSTM__Group_16__3 : rule__GSSTM__Group_16__3__Impl ;
    public final void rule__GSSTM__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1516:1: ( rule__GSSTM__Group_16__3__Impl )
            // InternalTM.g:1517:2: rule__GSSTM__Group_16__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_16__3__Impl();

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
    // $ANTLR end "rule__GSSTM__Group_16__3"


    // $ANTLR start "rule__GSSTM__Group_16__3__Impl"
    // InternalTM.g:1523:1: rule__GSSTM__Group_16__3__Impl : ( '/>' ) ;
    public final void rule__GSSTM__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1527:1: ( ( '/>' ) )
            // InternalTM.g:1528:1: ( '/>' )
            {
            // InternalTM.g:1528:1: ( '/>' )
            // InternalTM.g:1529:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_16_3()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_16_3()); 
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
    // $ANTLR end "rule__GSSTM__Group_16__3__Impl"


    // $ANTLR start "rule__GSSTM__Group_17__0"
    // InternalTM.g:1539:1: rule__GSSTM__Group_17__0 : rule__GSSTM__Group_17__0__Impl rule__GSSTM__Group_17__1 ;
    public final void rule__GSSTM__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1543:1: ( rule__GSSTM__Group_17__0__Impl rule__GSSTM__Group_17__1 )
            // InternalTM.g:1544:2: rule__GSSTM__Group_17__0__Impl rule__GSSTM__Group_17__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTM__Group_17__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_17__1();

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
    // $ANTLR end "rule__GSSTM__Group_17__0"


    // $ANTLR start "rule__GSSTM__Group_17__0__Impl"
    // InternalTM.g:1551:1: rule__GSSTM__Group_17__0__Impl : ( '<level1_filter' ) ;
    public final void rule__GSSTM__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1555:1: ( ( '<level1_filter' ) )
            // InternalTM.g:1556:1: ( '<level1_filter' )
            {
            // InternalTM.g:1556:1: ( '<level1_filter' )
            // InternalTM.g:1557:2: '<level1_filter'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel1_filterKeyword_17_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel1_filterKeyword_17_0()); 
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
    // $ANTLR end "rule__GSSTM__Group_17__0__Impl"


    // $ANTLR start "rule__GSSTM__Group_17__1"
    // InternalTM.g:1566:1: rule__GSSTM__Group_17__1 : rule__GSSTM__Group_17__1__Impl rule__GSSTM__Group_17__2 ;
    public final void rule__GSSTM__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1570:1: ( rule__GSSTM__Group_17__1__Impl rule__GSSTM__Group_17__2 )
            // InternalTM.g:1571:2: rule__GSSTM__Group_17__1__Impl rule__GSSTM__Group_17__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTM__Group_17__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_17__2();

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
    // $ANTLR end "rule__GSSTM__Group_17__1"


    // $ANTLR start "rule__GSSTM__Group_17__1__Impl"
    // InternalTM.g:1578:1: rule__GSSTM__Group_17__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTM__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1582:1: ( ( 'file=' ) )
            // InternalTM.g:1583:1: ( 'file=' )
            {
            // InternalTM.g:1583:1: ( 'file=' )
            // InternalTM.g:1584:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getFileKeyword_17_1()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getFileKeyword_17_1()); 
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
    // $ANTLR end "rule__GSSTM__Group_17__1__Impl"


    // $ANTLR start "rule__GSSTM__Group_17__2"
    // InternalTM.g:1593:1: rule__GSSTM__Group_17__2 : rule__GSSTM__Group_17__2__Impl rule__GSSTM__Group_17__3 ;
    public final void rule__GSSTM__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1597:1: ( rule__GSSTM__Group_17__2__Impl rule__GSSTM__Group_17__3 )
            // InternalTM.g:1598:2: rule__GSSTM__Group_17__2__Impl rule__GSSTM__Group_17__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTM__Group_17__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_17__3();

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
    // $ANTLR end "rule__GSSTM__Group_17__2"


    // $ANTLR start "rule__GSSTM__Group_17__2__Impl"
    // InternalTM.g:1605:1: rule__GSSTM__Group_17__2__Impl : ( ( rule__GSSTM__Level1_filterAssignment_17_2 ) ) ;
    public final void rule__GSSTM__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1609:1: ( ( ( rule__GSSTM__Level1_filterAssignment_17_2 ) ) )
            // InternalTM.g:1610:1: ( ( rule__GSSTM__Level1_filterAssignment_17_2 ) )
            {
            // InternalTM.g:1610:1: ( ( rule__GSSTM__Level1_filterAssignment_17_2 ) )
            // InternalTM.g:1611:2: ( rule__GSSTM__Level1_filterAssignment_17_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel1_filterAssignment_17_2()); 
            }
            // InternalTM.g:1612:2: ( rule__GSSTM__Level1_filterAssignment_17_2 )
            // InternalTM.g:1612:3: rule__GSSTM__Level1_filterAssignment_17_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Level1_filterAssignment_17_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel1_filterAssignment_17_2()); 
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
    // $ANTLR end "rule__GSSTM__Group_17__2__Impl"


    // $ANTLR start "rule__GSSTM__Group_17__3"
    // InternalTM.g:1620:1: rule__GSSTM__Group_17__3 : rule__GSSTM__Group_17__3__Impl ;
    public final void rule__GSSTM__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1624:1: ( rule__GSSTM__Group_17__3__Impl )
            // InternalTM.g:1625:2: rule__GSSTM__Group_17__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_17__3__Impl();

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
    // $ANTLR end "rule__GSSTM__Group_17__3"


    // $ANTLR start "rule__GSSTM__Group_17__3__Impl"
    // InternalTM.g:1631:1: rule__GSSTM__Group_17__3__Impl : ( '/>' ) ;
    public final void rule__GSSTM__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1635:1: ( ( '/>' ) )
            // InternalTM.g:1636:1: ( '/>' )
            {
            // InternalTM.g:1636:1: ( '/>' )
            // InternalTM.g:1637:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_17_3()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_17_3()); 
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
    // $ANTLR end "rule__GSSTM__Group_17__3__Impl"


    // $ANTLR start "rule__GSSTM__Group_18__0"
    // InternalTM.g:1647:1: rule__GSSTM__Group_18__0 : rule__GSSTM__Group_18__0__Impl rule__GSSTM__Group_18__1 ;
    public final void rule__GSSTM__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1651:1: ( rule__GSSTM__Group_18__0__Impl rule__GSSTM__Group_18__1 )
            // InternalTM.g:1652:2: rule__GSSTM__Group_18__0__Impl rule__GSSTM__Group_18__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTM__Group_18__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_18__1();

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
    // $ANTLR end "rule__GSSTM__Group_18__0"


    // $ANTLR start "rule__GSSTM__Group_18__0__Impl"
    // InternalTM.g:1659:1: rule__GSSTM__Group_18__0__Impl : ( '<from_level0_import' ) ;
    public final void rule__GSSTM__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1663:1: ( ( '<from_level0_import' ) )
            // InternalTM.g:1664:1: ( '<from_level0_import' )
            {
            // InternalTM.g:1664:1: ( '<from_level0_import' )
            // InternalTM.g:1665:2: '<from_level0_import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getFrom_level0_importKeyword_18_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getFrom_level0_importKeyword_18_0()); 
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
    // $ANTLR end "rule__GSSTM__Group_18__0__Impl"


    // $ANTLR start "rule__GSSTM__Group_18__1"
    // InternalTM.g:1674:1: rule__GSSTM__Group_18__1 : rule__GSSTM__Group_18__1__Impl rule__GSSTM__Group_18__2 ;
    public final void rule__GSSTM__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1678:1: ( rule__GSSTM__Group_18__1__Impl rule__GSSTM__Group_18__2 )
            // InternalTM.g:1679:2: rule__GSSTM__Group_18__1__Impl rule__GSSTM__Group_18__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTM__Group_18__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_18__2();

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
    // $ANTLR end "rule__GSSTM__Group_18__1"


    // $ANTLR start "rule__GSSTM__Group_18__1__Impl"
    // InternalTM.g:1686:1: rule__GSSTM__Group_18__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTM__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1690:1: ( ( 'file=' ) )
            // InternalTM.g:1691:1: ( 'file=' )
            {
            // InternalTM.g:1691:1: ( 'file=' )
            // InternalTM.g:1692:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getFileKeyword_18_1()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getFileKeyword_18_1()); 
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
    // $ANTLR end "rule__GSSTM__Group_18__1__Impl"


    // $ANTLR start "rule__GSSTM__Group_18__2"
    // InternalTM.g:1701:1: rule__GSSTM__Group_18__2 : rule__GSSTM__Group_18__2__Impl rule__GSSTM__Group_18__3 ;
    public final void rule__GSSTM__Group_18__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1705:1: ( rule__GSSTM__Group_18__2__Impl rule__GSSTM__Group_18__3 )
            // InternalTM.g:1706:2: rule__GSSTM__Group_18__2__Impl rule__GSSTM__Group_18__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTM__Group_18__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_18__3();

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
    // $ANTLR end "rule__GSSTM__Group_18__2"


    // $ANTLR start "rule__GSSTM__Group_18__2__Impl"
    // InternalTM.g:1713:1: rule__GSSTM__Group_18__2__Impl : ( ( rule__GSSTM__From_level0_importAssignment_18_2 ) ) ;
    public final void rule__GSSTM__Group_18__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1717:1: ( ( ( rule__GSSTM__From_level0_importAssignment_18_2 ) ) )
            // InternalTM.g:1718:1: ( ( rule__GSSTM__From_level0_importAssignment_18_2 ) )
            {
            // InternalTM.g:1718:1: ( ( rule__GSSTM__From_level0_importAssignment_18_2 ) )
            // InternalTM.g:1719:2: ( rule__GSSTM__From_level0_importAssignment_18_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getFrom_level0_importAssignment_18_2()); 
            }
            // InternalTM.g:1720:2: ( rule__GSSTM__From_level0_importAssignment_18_2 )
            // InternalTM.g:1720:3: rule__GSSTM__From_level0_importAssignment_18_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__From_level0_importAssignment_18_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getFrom_level0_importAssignment_18_2()); 
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
    // $ANTLR end "rule__GSSTM__Group_18__2__Impl"


    // $ANTLR start "rule__GSSTM__Group_18__3"
    // InternalTM.g:1728:1: rule__GSSTM__Group_18__3 : rule__GSSTM__Group_18__3__Impl ;
    public final void rule__GSSTM__Group_18__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1732:1: ( rule__GSSTM__Group_18__3__Impl )
            // InternalTM.g:1733:2: rule__GSSTM__Group_18__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_18__3__Impl();

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
    // $ANTLR end "rule__GSSTM__Group_18__3"


    // $ANTLR start "rule__GSSTM__Group_18__3__Impl"
    // InternalTM.g:1739:1: rule__GSSTM__Group_18__3__Impl : ( '/>' ) ;
    public final void rule__GSSTM__Group_18__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1743:1: ( ( '/>' ) )
            // InternalTM.g:1744:1: ( '/>' )
            {
            // InternalTM.g:1744:1: ( '/>' )
            // InternalTM.g:1745:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_18_3()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_18_3()); 
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
    // $ANTLR end "rule__GSSTM__Group_18__3__Impl"


    // $ANTLR start "rule__GSSTM__Group_19__0"
    // InternalTM.g:1755:1: rule__GSSTM__Group_19__0 : rule__GSSTM__Group_19__0__Impl rule__GSSTM__Group_19__1 ;
    public final void rule__GSSTM__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1759:1: ( rule__GSSTM__Group_19__0__Impl rule__GSSTM__Group_19__1 )
            // InternalTM.g:1760:2: rule__GSSTM__Group_19__0__Impl rule__GSSTM__Group_19__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTM__Group_19__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_19__1();

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
    // $ANTLR end "rule__GSSTM__Group_19__0"


    // $ANTLR start "rule__GSSTM__Group_19__0__Impl"
    // InternalTM.g:1767:1: rule__GSSTM__Group_19__0__Impl : ( '<level0_format' ) ;
    public final void rule__GSSTM__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1771:1: ( ( '<level0_format' ) )
            // InternalTM.g:1772:1: ( '<level0_format' )
            {
            // InternalTM.g:1772:1: ( '<level0_format' )
            // InternalTM.g:1773:2: '<level0_format'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel0_formatKeyword_19_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel0_formatKeyword_19_0()); 
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
    // $ANTLR end "rule__GSSTM__Group_19__0__Impl"


    // $ANTLR start "rule__GSSTM__Group_19__1"
    // InternalTM.g:1782:1: rule__GSSTM__Group_19__1 : rule__GSSTM__Group_19__1__Impl rule__GSSTM__Group_19__2 ;
    public final void rule__GSSTM__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1786:1: ( rule__GSSTM__Group_19__1__Impl rule__GSSTM__Group_19__2 )
            // InternalTM.g:1787:2: rule__GSSTM__Group_19__1__Impl rule__GSSTM__Group_19__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTM__Group_19__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_19__2();

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
    // $ANTLR end "rule__GSSTM__Group_19__1"


    // $ANTLR start "rule__GSSTM__Group_19__1__Impl"
    // InternalTM.g:1794:1: rule__GSSTM__Group_19__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTM__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1798:1: ( ( 'file=' ) )
            // InternalTM.g:1799:1: ( 'file=' )
            {
            // InternalTM.g:1799:1: ( 'file=' )
            // InternalTM.g:1800:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getFileKeyword_19_1()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getFileKeyword_19_1()); 
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
    // $ANTLR end "rule__GSSTM__Group_19__1__Impl"


    // $ANTLR start "rule__GSSTM__Group_19__2"
    // InternalTM.g:1809:1: rule__GSSTM__Group_19__2 : rule__GSSTM__Group_19__2__Impl rule__GSSTM__Group_19__3 ;
    public final void rule__GSSTM__Group_19__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1813:1: ( rule__GSSTM__Group_19__2__Impl rule__GSSTM__Group_19__3 )
            // InternalTM.g:1814:2: rule__GSSTM__Group_19__2__Impl rule__GSSTM__Group_19__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTM__Group_19__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_19__3();

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
    // $ANTLR end "rule__GSSTM__Group_19__2"


    // $ANTLR start "rule__GSSTM__Group_19__2__Impl"
    // InternalTM.g:1821:1: rule__GSSTM__Group_19__2__Impl : ( ( rule__GSSTM__Level0_formatAssignment_19_2 ) ) ;
    public final void rule__GSSTM__Group_19__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1825:1: ( ( ( rule__GSSTM__Level0_formatAssignment_19_2 ) ) )
            // InternalTM.g:1826:1: ( ( rule__GSSTM__Level0_formatAssignment_19_2 ) )
            {
            // InternalTM.g:1826:1: ( ( rule__GSSTM__Level0_formatAssignment_19_2 ) )
            // InternalTM.g:1827:2: ( rule__GSSTM__Level0_formatAssignment_19_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel0_formatAssignment_19_2()); 
            }
            // InternalTM.g:1828:2: ( rule__GSSTM__Level0_formatAssignment_19_2 )
            // InternalTM.g:1828:3: rule__GSSTM__Level0_formatAssignment_19_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Level0_formatAssignment_19_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel0_formatAssignment_19_2()); 
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
    // $ANTLR end "rule__GSSTM__Group_19__2__Impl"


    // $ANTLR start "rule__GSSTM__Group_19__3"
    // InternalTM.g:1836:1: rule__GSSTM__Group_19__3 : rule__GSSTM__Group_19__3__Impl ;
    public final void rule__GSSTM__Group_19__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1840:1: ( rule__GSSTM__Group_19__3__Impl )
            // InternalTM.g:1841:2: rule__GSSTM__Group_19__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_19__3__Impl();

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
    // $ANTLR end "rule__GSSTM__Group_19__3"


    // $ANTLR start "rule__GSSTM__Group_19__3__Impl"
    // InternalTM.g:1847:1: rule__GSSTM__Group_19__3__Impl : ( '/>' ) ;
    public final void rule__GSSTM__Group_19__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1851:1: ( ( '/>' ) )
            // InternalTM.g:1852:1: ( '/>' )
            {
            // InternalTM.g:1852:1: ( '/>' )
            // InternalTM.g:1853:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_19_3()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_19_3()); 
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
    // $ANTLR end "rule__GSSTM__Group_19__3__Impl"


    // $ANTLR start "rule__GSSTM__Group_20__0"
    // InternalTM.g:1863:1: rule__GSSTM__Group_20__0 : rule__GSSTM__Group_20__0__Impl rule__GSSTM__Group_20__1 ;
    public final void rule__GSSTM__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1867:1: ( rule__GSSTM__Group_20__0__Impl rule__GSSTM__Group_20__1 )
            // InternalTM.g:1868:2: rule__GSSTM__Group_20__0__Impl rule__GSSTM__Group_20__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSTM__Group_20__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_20__1();

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
    // $ANTLR end "rule__GSSTM__Group_20__0"


    // $ANTLR start "rule__GSSTM__Group_20__0__Impl"
    // InternalTM.g:1875:1: rule__GSSTM__Group_20__0__Impl : ( '<level0_filter' ) ;
    public final void rule__GSSTM__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1879:1: ( ( '<level0_filter' ) )
            // InternalTM.g:1880:1: ( '<level0_filter' )
            {
            // InternalTM.g:1880:1: ( '<level0_filter' )
            // InternalTM.g:1881:2: '<level0_filter'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel0_filterKeyword_20_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel0_filterKeyword_20_0()); 
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
    // $ANTLR end "rule__GSSTM__Group_20__0__Impl"


    // $ANTLR start "rule__GSSTM__Group_20__1"
    // InternalTM.g:1890:1: rule__GSSTM__Group_20__1 : rule__GSSTM__Group_20__1__Impl rule__GSSTM__Group_20__2 ;
    public final void rule__GSSTM__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1894:1: ( rule__GSSTM__Group_20__1__Impl rule__GSSTM__Group_20__2 )
            // InternalTM.g:1895:2: rule__GSSTM__Group_20__1__Impl rule__GSSTM__Group_20__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTM__Group_20__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_20__2();

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
    // $ANTLR end "rule__GSSTM__Group_20__1"


    // $ANTLR start "rule__GSSTM__Group_20__1__Impl"
    // InternalTM.g:1902:1: rule__GSSTM__Group_20__1__Impl : ( 'file=' ) ;
    public final void rule__GSSTM__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1906:1: ( ( 'file=' ) )
            // InternalTM.g:1907:1: ( 'file=' )
            {
            // InternalTM.g:1907:1: ( 'file=' )
            // InternalTM.g:1908:2: 'file='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getFileKeyword_20_1()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getFileKeyword_20_1()); 
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
    // $ANTLR end "rule__GSSTM__Group_20__1__Impl"


    // $ANTLR start "rule__GSSTM__Group_20__2"
    // InternalTM.g:1917:1: rule__GSSTM__Group_20__2 : rule__GSSTM__Group_20__2__Impl rule__GSSTM__Group_20__3 ;
    public final void rule__GSSTM__Group_20__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1921:1: ( rule__GSSTM__Group_20__2__Impl rule__GSSTM__Group_20__3 )
            // InternalTM.g:1922:2: rule__GSSTM__Group_20__2__Impl rule__GSSTM__Group_20__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTM__Group_20__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_20__3();

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
    // $ANTLR end "rule__GSSTM__Group_20__2"


    // $ANTLR start "rule__GSSTM__Group_20__2__Impl"
    // InternalTM.g:1929:1: rule__GSSTM__Group_20__2__Impl : ( ( rule__GSSTM__Level0_filterAssignment_20_2 ) ) ;
    public final void rule__GSSTM__Group_20__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1933:1: ( ( ( rule__GSSTM__Level0_filterAssignment_20_2 ) ) )
            // InternalTM.g:1934:1: ( ( rule__GSSTM__Level0_filterAssignment_20_2 ) )
            {
            // InternalTM.g:1934:1: ( ( rule__GSSTM__Level0_filterAssignment_20_2 ) )
            // InternalTM.g:1935:2: ( rule__GSSTM__Level0_filterAssignment_20_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel0_filterAssignment_20_2()); 
            }
            // InternalTM.g:1936:2: ( rule__GSSTM__Level0_filterAssignment_20_2 )
            // InternalTM.g:1936:3: rule__GSSTM__Level0_filterAssignment_20_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Level0_filterAssignment_20_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel0_filterAssignment_20_2()); 
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
    // $ANTLR end "rule__GSSTM__Group_20__2__Impl"


    // $ANTLR start "rule__GSSTM__Group_20__3"
    // InternalTM.g:1944:1: rule__GSSTM__Group_20__3 : rule__GSSTM__Group_20__3__Impl ;
    public final void rule__GSSTM__Group_20__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1948:1: ( rule__GSSTM__Group_20__3__Impl )
            // InternalTM.g:1949:2: rule__GSSTM__Group_20__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_20__3__Impl();

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
    // $ANTLR end "rule__GSSTM__Group_20__3"


    // $ANTLR start "rule__GSSTM__Group_20__3__Impl"
    // InternalTM.g:1955:1: rule__GSSTM__Group_20__3__Impl : ( '/>' ) ;
    public final void rule__GSSTM__Group_20__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1959:1: ( ( '/>' ) )
            // InternalTM.g:1960:1: ( '/>' )
            {
            // InternalTM.g:1960:1: ( '/>' )
            // InternalTM.g:1961:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_20_3()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getSolidusGreaterThanSignKeyword_20_3()); 
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
    // $ANTLR end "rule__GSSTM__Group_20__3__Impl"


    // $ANTLR start "rule__GSSTM__Group_22__0"
    // InternalTM.g:1971:1: rule__GSSTM__Group_22__0 : rule__GSSTM__Group_22__0__Impl rule__GSSTM__Group_22__1 ;
    public final void rule__GSSTM__Group_22__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1975:1: ( rule__GSSTM__Group_22__0__Impl rule__GSSTM__Group_22__1 )
            // InternalTM.g:1976:2: rule__GSSTM__Group_22__0__Impl rule__GSSTM__Group_22__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__GSSTM__Group_22__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_22__1();

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
    // $ANTLR end "rule__GSSTM__Group_22__0"


    // $ANTLR start "rule__GSSTM__Group_22__0__Impl"
    // InternalTM.g:1983:1: rule__GSSTM__Group_22__0__Impl : ( '<fields>' ) ;
    public final void rule__GSSTM__Group_22__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:1987:1: ( ( '<fields>' ) )
            // InternalTM.g:1988:1: ( '<fields>' )
            {
            // InternalTM.g:1988:1: ( '<fields>' )
            // InternalTM.g:1989:2: '<fields>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getFieldsKeyword_22_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getFieldsKeyword_22_0()); 
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
    // $ANTLR end "rule__GSSTM__Group_22__0__Impl"


    // $ANTLR start "rule__GSSTM__Group_22__1"
    // InternalTM.g:1998:1: rule__GSSTM__Group_22__1 : rule__GSSTM__Group_22__1__Impl rule__GSSTM__Group_22__2 ;
    public final void rule__GSSTM__Group_22__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2002:1: ( rule__GSSTM__Group_22__1__Impl rule__GSSTM__Group_22__2 )
            // InternalTM.g:2003:2: rule__GSSTM__Group_22__1__Impl rule__GSSTM__Group_22__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__GSSTM__Group_22__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_22__2();

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
    // $ANTLR end "rule__GSSTM__Group_22__1"


    // $ANTLR start "rule__GSSTM__Group_22__1__Impl"
    // InternalTM.g:2010:1: rule__GSSTM__Group_22__1__Impl : ( ( ( rule__GSSTM__GssFieldsAssignment_22_1 ) ) ( ( rule__GSSTM__GssFieldsAssignment_22_1 )* ) ) ;
    public final void rule__GSSTM__Group_22__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2014:1: ( ( ( ( rule__GSSTM__GssFieldsAssignment_22_1 ) ) ( ( rule__GSSTM__GssFieldsAssignment_22_1 )* ) ) )
            // InternalTM.g:2015:1: ( ( ( rule__GSSTM__GssFieldsAssignment_22_1 ) ) ( ( rule__GSSTM__GssFieldsAssignment_22_1 )* ) )
            {
            // InternalTM.g:2015:1: ( ( ( rule__GSSTM__GssFieldsAssignment_22_1 ) ) ( ( rule__GSSTM__GssFieldsAssignment_22_1 )* ) )
            // InternalTM.g:2016:2: ( ( rule__GSSTM__GssFieldsAssignment_22_1 ) ) ( ( rule__GSSTM__GssFieldsAssignment_22_1 )* )
            {
            // InternalTM.g:2016:2: ( ( rule__GSSTM__GssFieldsAssignment_22_1 ) )
            // InternalTM.g:2017:3: ( rule__GSSTM__GssFieldsAssignment_22_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getGssFieldsAssignment_22_1()); 
            }
            // InternalTM.g:2018:3: ( rule__GSSTM__GssFieldsAssignment_22_1 )
            // InternalTM.g:2018:4: rule__GSSTM__GssFieldsAssignment_22_1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__GSSTM__GssFieldsAssignment_22_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getGssFieldsAssignment_22_1()); 
            }

            }

            // InternalTM.g:2021:2: ( ( rule__GSSTM__GssFieldsAssignment_22_1 )* )
            // InternalTM.g:2022:3: ( rule__GSSTM__GssFieldsAssignment_22_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getGssFieldsAssignment_22_1()); 
            }
            // InternalTM.g:2023:3: ( rule__GSSTM__GssFieldsAssignment_22_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==37) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTM.g:2023:4: rule__GSSTM__GssFieldsAssignment_22_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    rule__GSSTM__GssFieldsAssignment_22_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getGssFieldsAssignment_22_1()); 
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
    // $ANTLR end "rule__GSSTM__Group_22__1__Impl"


    // $ANTLR start "rule__GSSTM__Group_22__2"
    // InternalTM.g:2032:1: rule__GSSTM__Group_22__2 : rule__GSSTM__Group_22__2__Impl ;
    public final void rule__GSSTM__Group_22__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2036:1: ( rule__GSSTM__Group_22__2__Impl )
            // InternalTM.g:2037:2: rule__GSSTM__Group_22__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTM__Group_22__2__Impl();

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
    // $ANTLR end "rule__GSSTM__Group_22__2"


    // $ANTLR start "rule__GSSTM__Group_22__2__Impl"
    // InternalTM.g:2043:1: rule__GSSTM__Group_22__2__Impl : ( '</fields>' ) ;
    public final void rule__GSSTM__Group_22__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2047:1: ( ( '</fields>' ) )
            // InternalTM.g:2048:1: ( '</fields>' )
            {
            // InternalTM.g:2048:1: ( '</fields>' )
            // InternalTM.g:2049:2: '</fields>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getFieldsKeyword_22_2()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getFieldsKeyword_22_2()); 
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
    // $ANTLR end "rule__GSSTM__Group_22__2__Impl"


    // $ANTLR start "rule__GSSTMPi1__Group__0"
    // InternalTM.g:2059:1: rule__GSSTMPi1__Group__0 : rule__GSSTMPi1__Group__0__Impl rule__GSSTMPi1__Group__1 ;
    public final void rule__GSSTMPi1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2063:1: ( rule__GSSTMPi1__Group__0__Impl rule__GSSTMPi1__Group__1 )
            // InternalTM.g:2064:2: rule__GSSTMPi1__Group__0__Impl rule__GSSTMPi1__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__GSSTMPi1__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMPi1__Group__1();

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
    // $ANTLR end "rule__GSSTMPi1__Group__0"


    // $ANTLR start "rule__GSSTMPi1__Group__0__Impl"
    // InternalTM.g:2071:1: rule__GSSTMPi1__Group__0__Impl : ( '<PI1' ) ;
    public final void rule__GSSTMPi1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2075:1: ( ( '<PI1' ) )
            // InternalTM.g:2076:1: ( '<PI1' )
            {
            // InternalTM.g:2076:1: ( '<PI1' )
            // InternalTM.g:2077:2: '<PI1'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMPi1Access().getPI1Keyword_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMPi1Access().getPI1Keyword_0()); 
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
    // $ANTLR end "rule__GSSTMPi1__Group__0__Impl"


    // $ANTLR start "rule__GSSTMPi1__Group__1"
    // InternalTM.g:2086:1: rule__GSSTMPi1__Group__1 : rule__GSSTMPi1__Group__1__Impl rule__GSSTMPi1__Group__2 ;
    public final void rule__GSSTMPi1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2090:1: ( rule__GSSTMPi1__Group__1__Impl rule__GSSTMPi1__Group__2 )
            // InternalTM.g:2091:2: rule__GSSTMPi1__Group__1__Impl rule__GSSTMPi1__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTMPi1__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMPi1__Group__2();

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
    // $ANTLR end "rule__GSSTMPi1__Group__1"


    // $ANTLR start "rule__GSSTMPi1__Group__1__Impl"
    // InternalTM.g:2098:1: rule__GSSTMPi1__Group__1__Impl : ( 'name=' ) ;
    public final void rule__GSSTMPi1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2102:1: ( ( 'name=' ) )
            // InternalTM.g:2103:1: ( 'name=' )
            {
            // InternalTM.g:2103:1: ( 'name=' )
            // InternalTM.g:2104:2: 'name='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMPi1Access().getNameKeyword_1()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMPi1Access().getNameKeyword_1()); 
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
    // $ANTLR end "rule__GSSTMPi1__Group__1__Impl"


    // $ANTLR start "rule__GSSTMPi1__Group__2"
    // InternalTM.g:2113:1: rule__GSSTMPi1__Group__2 : rule__GSSTMPi1__Group__2__Impl rule__GSSTMPi1__Group__3 ;
    public final void rule__GSSTMPi1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2117:1: ( rule__GSSTMPi1__Group__2__Impl rule__GSSTMPi1__Group__3 )
            // InternalTM.g:2118:2: rule__GSSTMPi1__Group__2__Impl rule__GSSTMPi1__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__GSSTMPi1__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMPi1__Group__3();

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
    // $ANTLR end "rule__GSSTMPi1__Group__2"


    // $ANTLR start "rule__GSSTMPi1__Group__2__Impl"
    // InternalTM.g:2125:1: rule__GSSTMPi1__Group__2__Impl : ( ( rule__GSSTMPi1__NameAssignment_2 ) ) ;
    public final void rule__GSSTMPi1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2129:1: ( ( ( rule__GSSTMPi1__NameAssignment_2 ) ) )
            // InternalTM.g:2130:1: ( ( rule__GSSTMPi1__NameAssignment_2 ) )
            {
            // InternalTM.g:2130:1: ( ( rule__GSSTMPi1__NameAssignment_2 ) )
            // InternalTM.g:2131:2: ( rule__GSSTMPi1__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMPi1Access().getNameAssignment_2()); 
            }
            // InternalTM.g:2132:2: ( rule__GSSTMPi1__NameAssignment_2 )
            // InternalTM.g:2132:3: rule__GSSTMPi1__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMPi1__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMPi1Access().getNameAssignment_2()); 
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
    // $ANTLR end "rule__GSSTMPi1__Group__2__Impl"


    // $ANTLR start "rule__GSSTMPi1__Group__3"
    // InternalTM.g:2140:1: rule__GSSTMPi1__Group__3 : rule__GSSTMPi1__Group__3__Impl rule__GSSTMPi1__Group__4 ;
    public final void rule__GSSTMPi1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2144:1: ( rule__GSSTMPi1__Group__3__Impl rule__GSSTMPi1__Group__4 )
            // InternalTM.g:2145:2: rule__GSSTMPi1__Group__3__Impl rule__GSSTMPi1__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSTMPi1__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMPi1__Group__4();

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
    // $ANTLR end "rule__GSSTMPi1__Group__3"


    // $ANTLR start "rule__GSSTMPi1__Group__3__Impl"
    // InternalTM.g:2152:1: rule__GSSTMPi1__Group__3__Impl : ( 'val=' ) ;
    public final void rule__GSSTMPi1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2156:1: ( ( 'val=' ) )
            // InternalTM.g:2157:1: ( 'val=' )
            {
            // InternalTM.g:2157:1: ( 'val=' )
            // InternalTM.g:2158:2: 'val='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMPi1Access().getValKeyword_3()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMPi1Access().getValKeyword_3()); 
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
    // $ANTLR end "rule__GSSTMPi1__Group__3__Impl"


    // $ANTLR start "rule__GSSTMPi1__Group__4"
    // InternalTM.g:2167:1: rule__GSSTMPi1__Group__4 : rule__GSSTMPi1__Group__4__Impl rule__GSSTMPi1__Group__5 ;
    public final void rule__GSSTMPi1__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2171:1: ( rule__GSSTMPi1__Group__4__Impl rule__GSSTMPi1__Group__5 )
            // InternalTM.g:2172:2: rule__GSSTMPi1__Group__4__Impl rule__GSSTMPi1__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSTMPi1__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMPi1__Group__5();

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
    // $ANTLR end "rule__GSSTMPi1__Group__4"


    // $ANTLR start "rule__GSSTMPi1__Group__4__Impl"
    // InternalTM.g:2179:1: rule__GSSTMPi1__Group__4__Impl : ( ( rule__GSSTMPi1__ValAssignment_4 ) ) ;
    public final void rule__GSSTMPi1__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2183:1: ( ( ( rule__GSSTMPi1__ValAssignment_4 ) ) )
            // InternalTM.g:2184:1: ( ( rule__GSSTMPi1__ValAssignment_4 ) )
            {
            // InternalTM.g:2184:1: ( ( rule__GSSTMPi1__ValAssignment_4 ) )
            // InternalTM.g:2185:2: ( rule__GSSTMPi1__ValAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMPi1Access().getValAssignment_4()); 
            }
            // InternalTM.g:2186:2: ( rule__GSSTMPi1__ValAssignment_4 )
            // InternalTM.g:2186:3: rule__GSSTMPi1__ValAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMPi1__ValAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMPi1Access().getValAssignment_4()); 
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
    // $ANTLR end "rule__GSSTMPi1__Group__4__Impl"


    // $ANTLR start "rule__GSSTMPi1__Group__5"
    // InternalTM.g:2194:1: rule__GSSTMPi1__Group__5 : rule__GSSTMPi1__Group__5__Impl rule__GSSTMPi1__Group__6 ;
    public final void rule__GSSTMPi1__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2198:1: ( rule__GSSTMPi1__Group__5__Impl rule__GSSTMPi1__Group__6 )
            // InternalTM.g:2199:2: rule__GSSTMPi1__Group__5__Impl rule__GSSTMPi1__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTMPi1__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMPi1__Group__6();

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
    // $ANTLR end "rule__GSSTMPi1__Group__5"


    // $ANTLR start "rule__GSSTMPi1__Group__5__Impl"
    // InternalTM.g:2206:1: rule__GSSTMPi1__Group__5__Impl : ( 'gssField=' ) ;
    public final void rule__GSSTMPi1__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2210:1: ( ( 'gssField=' ) )
            // InternalTM.g:2211:1: ( 'gssField=' )
            {
            // InternalTM.g:2211:1: ( 'gssField=' )
            // InternalTM.g:2212:2: 'gssField='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMPi1Access().getGssFieldKeyword_5()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMPi1Access().getGssFieldKeyword_5()); 
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
    // $ANTLR end "rule__GSSTMPi1__Group__5__Impl"


    // $ANTLR start "rule__GSSTMPi1__Group__6"
    // InternalTM.g:2221:1: rule__GSSTMPi1__Group__6 : rule__GSSTMPi1__Group__6__Impl rule__GSSTMPi1__Group__7 ;
    public final void rule__GSSTMPi1__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2225:1: ( rule__GSSTMPi1__Group__6__Impl rule__GSSTMPi1__Group__7 )
            // InternalTM.g:2226:2: rule__GSSTMPi1__Group__6__Impl rule__GSSTMPi1__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSTMPi1__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMPi1__Group__7();

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
    // $ANTLR end "rule__GSSTMPi1__Group__6"


    // $ANTLR start "rule__GSSTMPi1__Group__6__Impl"
    // InternalTM.g:2233:1: rule__GSSTMPi1__Group__6__Impl : ( ( rule__GSSTMPi1__GssFieldAssignment_6 ) ) ;
    public final void rule__GSSTMPi1__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2237:1: ( ( ( rule__GSSTMPi1__GssFieldAssignment_6 ) ) )
            // InternalTM.g:2238:1: ( ( rule__GSSTMPi1__GssFieldAssignment_6 ) )
            {
            // InternalTM.g:2238:1: ( ( rule__GSSTMPi1__GssFieldAssignment_6 ) )
            // InternalTM.g:2239:2: ( rule__GSSTMPi1__GssFieldAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMPi1Access().getGssFieldAssignment_6()); 
            }
            // InternalTM.g:2240:2: ( rule__GSSTMPi1__GssFieldAssignment_6 )
            // InternalTM.g:2240:3: rule__GSSTMPi1__GssFieldAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMPi1__GssFieldAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMPi1Access().getGssFieldAssignment_6()); 
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
    // $ANTLR end "rule__GSSTMPi1__Group__6__Impl"


    // $ANTLR start "rule__GSSTMPi1__Group__7"
    // InternalTM.g:2248:1: rule__GSSTMPi1__Group__7 : rule__GSSTMPi1__Group__7__Impl ;
    public final void rule__GSSTMPi1__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2252:1: ( rule__GSSTMPi1__Group__7__Impl )
            // InternalTM.g:2253:2: rule__GSSTMPi1__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMPi1__Group__7__Impl();

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
    // $ANTLR end "rule__GSSTMPi1__Group__7"


    // $ANTLR start "rule__GSSTMPi1__Group__7__Impl"
    // InternalTM.g:2259:1: rule__GSSTMPi1__Group__7__Impl : ( '/>' ) ;
    public final void rule__GSSTMPi1__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2263:1: ( ( '/>' ) )
            // InternalTM.g:2264:1: ( '/>' )
            {
            // InternalTM.g:2264:1: ( '/>' )
            // InternalTM.g:2265:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMPi1Access().getSolidusGreaterThanSignKeyword_7()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMPi1Access().getSolidusGreaterThanSignKeyword_7()); 
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
    // $ANTLR end "rule__GSSTMPi1__Group__7__Impl"


    // $ANTLR start "rule__GSSTMField__Group__0"
    // InternalTM.g:2275:1: rule__GSSTMField__Group__0 : rule__GSSTMField__Group__0__Impl rule__GSSTMField__Group__1 ;
    public final void rule__GSSTMField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2279:1: ( rule__GSSTMField__Group__0__Impl rule__GSSTMField__Group__1 )
            // InternalTM.g:2280:2: rule__GSSTMField__Group__0__Impl rule__GSSTMField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__GSSTMField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMField__Group__1();

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
    // $ANTLR end "rule__GSSTMField__Group__0"


    // $ANTLR start "rule__GSSTMField__Group__0__Impl"
    // InternalTM.g:2287:1: rule__GSSTMField__Group__0__Impl : ( '<Field' ) ;
    public final void rule__GSSTMField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2291:1: ( ( '<Field' ) )
            // InternalTM.g:2292:1: ( '<Field' )
            {
            // InternalTM.g:2292:1: ( '<Field' )
            // InternalTM.g:2293:2: '<Field'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMFieldAccess().getFieldKeyword_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMFieldAccess().getFieldKeyword_0()); 
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
    // $ANTLR end "rule__GSSTMField__Group__0__Impl"


    // $ANTLR start "rule__GSSTMField__Group__1"
    // InternalTM.g:2302:1: rule__GSSTMField__Group__1 : rule__GSSTMField__Group__1__Impl rule__GSSTMField__Group__2 ;
    public final void rule__GSSTMField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2306:1: ( rule__GSSTMField__Group__1__Impl rule__GSSTMField__Group__2 )
            // InternalTM.g:2307:2: rule__GSSTMField__Group__1__Impl rule__GSSTMField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTMField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMField__Group__2();

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
    // $ANTLR end "rule__GSSTMField__Group__1"


    // $ANTLR start "rule__GSSTMField__Group__1__Impl"
    // InternalTM.g:2314:1: rule__GSSTMField__Group__1__Impl : ( 'name=' ) ;
    public final void rule__GSSTMField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2318:1: ( ( 'name=' ) )
            // InternalTM.g:2319:1: ( 'name=' )
            {
            // InternalTM.g:2319:1: ( 'name=' )
            // InternalTM.g:2320:2: 'name='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMFieldAccess().getNameKeyword_1()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMFieldAccess().getNameKeyword_1()); 
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
    // $ANTLR end "rule__GSSTMField__Group__1__Impl"


    // $ANTLR start "rule__GSSTMField__Group__2"
    // InternalTM.g:2329:1: rule__GSSTMField__Group__2 : rule__GSSTMField__Group__2__Impl rule__GSSTMField__Group__3 ;
    public final void rule__GSSTMField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2333:1: ( rule__GSSTMField__Group__2__Impl rule__GSSTMField__Group__3 )
            // InternalTM.g:2334:2: rule__GSSTMField__Group__2__Impl rule__GSSTMField__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSTMField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMField__Group__3();

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
    // $ANTLR end "rule__GSSTMField__Group__2"


    // $ANTLR start "rule__GSSTMField__Group__2__Impl"
    // InternalTM.g:2341:1: rule__GSSTMField__Group__2__Impl : ( ( rule__GSSTMField__NameAssignment_2 ) ) ;
    public final void rule__GSSTMField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2345:1: ( ( ( rule__GSSTMField__NameAssignment_2 ) ) )
            // InternalTM.g:2346:1: ( ( rule__GSSTMField__NameAssignment_2 ) )
            {
            // InternalTM.g:2346:1: ( ( rule__GSSTMField__NameAssignment_2 ) )
            // InternalTM.g:2347:2: ( rule__GSSTMField__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMFieldAccess().getNameAssignment_2()); 
            }
            // InternalTM.g:2348:2: ( rule__GSSTMField__NameAssignment_2 )
            // InternalTM.g:2348:3: rule__GSSTMField__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMField__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMFieldAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__GSSTMField__Group__2__Impl"


    // $ANTLR start "rule__GSSTMField__Group__3"
    // InternalTM.g:2356:1: rule__GSSTMField__Group__3 : rule__GSSTMField__Group__3__Impl rule__GSSTMField__Group__4 ;
    public final void rule__GSSTMField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2360:1: ( rule__GSSTMField__Group__3__Impl rule__GSSTMField__Group__4 )
            // InternalTM.g:2361:2: rule__GSSTMField__Group__3__Impl rule__GSSTMField__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTMField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMField__Group__4();

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
    // $ANTLR end "rule__GSSTMField__Group__3"


    // $ANTLR start "rule__GSSTMField__Group__3__Impl"
    // InternalTM.g:2368:1: rule__GSSTMField__Group__3__Impl : ( 'gssField=' ) ;
    public final void rule__GSSTMField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2372:1: ( ( 'gssField=' ) )
            // InternalTM.g:2373:1: ( 'gssField=' )
            {
            // InternalTM.g:2373:1: ( 'gssField=' )
            // InternalTM.g:2374:2: 'gssField='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMFieldAccess().getGssFieldKeyword_3()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMFieldAccess().getGssFieldKeyword_3()); 
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
    // $ANTLR end "rule__GSSTMField__Group__3__Impl"


    // $ANTLR start "rule__GSSTMField__Group__4"
    // InternalTM.g:2383:1: rule__GSSTMField__Group__4 : rule__GSSTMField__Group__4__Impl rule__GSSTMField__Group__5 ;
    public final void rule__GSSTMField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2387:1: ( rule__GSSTMField__Group__4__Impl rule__GSSTMField__Group__5 )
            // InternalTM.g:2388:2: rule__GSSTMField__Group__4__Impl rule__GSSTMField__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__GSSTMField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMField__Group__5();

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
    // $ANTLR end "rule__GSSTMField__Group__4"


    // $ANTLR start "rule__GSSTMField__Group__4__Impl"
    // InternalTM.g:2395:1: rule__GSSTMField__Group__4__Impl : ( ( rule__GSSTMField__GssFieldAssignment_4 ) ) ;
    public final void rule__GSSTMField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2399:1: ( ( ( rule__GSSTMField__GssFieldAssignment_4 ) ) )
            // InternalTM.g:2400:1: ( ( rule__GSSTMField__GssFieldAssignment_4 ) )
            {
            // InternalTM.g:2400:1: ( ( rule__GSSTMField__GssFieldAssignment_4 ) )
            // InternalTM.g:2401:2: ( rule__GSSTMField__GssFieldAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMFieldAccess().getGssFieldAssignment_4()); 
            }
            // InternalTM.g:2402:2: ( rule__GSSTMField__GssFieldAssignment_4 )
            // InternalTM.g:2402:3: rule__GSSTMField__GssFieldAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMField__GssFieldAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMFieldAccess().getGssFieldAssignment_4()); 
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
    // $ANTLR end "rule__GSSTMField__Group__4__Impl"


    // $ANTLR start "rule__GSSTMField__Group__5"
    // InternalTM.g:2410:1: rule__GSSTMField__Group__5 : rule__GSSTMField__Group__5__Impl rule__GSSTMField__Group__6 ;
    public final void rule__GSSTMField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2414:1: ( rule__GSSTMField__Group__5__Impl rule__GSSTMField__Group__6 )
            // InternalTM.g:2415:2: rule__GSSTMField__Group__5__Impl rule__GSSTMField__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__GSSTMField__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMField__Group__6();

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
    // $ANTLR end "rule__GSSTMField__Group__5"


    // $ANTLR start "rule__GSSTMField__Group__5__Impl"
    // InternalTM.g:2422:1: rule__GSSTMField__Group__5__Impl : ( ( rule__GSSTMField__Group_5__0 )? ) ;
    public final void rule__GSSTMField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2426:1: ( ( ( rule__GSSTMField__Group_5__0 )? ) )
            // InternalTM.g:2427:1: ( ( rule__GSSTMField__Group_5__0 )? )
            {
            // InternalTM.g:2427:1: ( ( rule__GSSTMField__Group_5__0 )? )
            // InternalTM.g:2428:2: ( rule__GSSTMField__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMFieldAccess().getGroup_5()); 
            }
            // InternalTM.g:2429:2: ( rule__GSSTMField__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTM.g:2429:3: rule__GSSTMField__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSTMField__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMFieldAccess().getGroup_5()); 
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
    // $ANTLR end "rule__GSSTMField__Group__5__Impl"


    // $ANTLR start "rule__GSSTMField__Group__6"
    // InternalTM.g:2437:1: rule__GSSTMField__Group__6 : rule__GSSTMField__Group__6__Impl ;
    public final void rule__GSSTMField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2441:1: ( rule__GSSTMField__Group__6__Impl )
            // InternalTM.g:2442:2: rule__GSSTMField__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMField__Group__6__Impl();

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
    // $ANTLR end "rule__GSSTMField__Group__6"


    // $ANTLR start "rule__GSSTMField__Group__6__Impl"
    // InternalTM.g:2448:1: rule__GSSTMField__Group__6__Impl : ( '/>' ) ;
    public final void rule__GSSTMField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2452:1: ( ( '/>' ) )
            // InternalTM.g:2453:1: ( '/>' )
            {
            // InternalTM.g:2453:1: ( '/>' )
            // InternalTM.g:2454:2: '/>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMFieldAccess().getSolidusGreaterThanSignKeyword_6()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMFieldAccess().getSolidusGreaterThanSignKeyword_6()); 
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
    // $ANTLR end "rule__GSSTMField__Group__6__Impl"


    // $ANTLR start "rule__GSSTMField__Group_5__0"
    // InternalTM.g:2464:1: rule__GSSTMField__Group_5__0 : rule__GSSTMField__Group_5__0__Impl rule__GSSTMField__Group_5__1 ;
    public final void rule__GSSTMField__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2468:1: ( rule__GSSTMField__Group_5__0__Impl rule__GSSTMField__Group_5__1 )
            // InternalTM.g:2469:2: rule__GSSTMField__Group_5__0__Impl rule__GSSTMField__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__GSSTMField__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMField__Group_5__1();

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
    // $ANTLR end "rule__GSSTMField__Group_5__0"


    // $ANTLR start "rule__GSSTMField__Group_5__0__Impl"
    // InternalTM.g:2476:1: rule__GSSTMField__Group_5__0__Impl : ( 'enumRef=' ) ;
    public final void rule__GSSTMField__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2480:1: ( ( 'enumRef=' ) )
            // InternalTM.g:2481:1: ( 'enumRef=' )
            {
            // InternalTM.g:2481:1: ( 'enumRef=' )
            // InternalTM.g:2482:2: 'enumRef='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMFieldAccess().getEnumRefKeyword_5_0()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMFieldAccess().getEnumRefKeyword_5_0()); 
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
    // $ANTLR end "rule__GSSTMField__Group_5__0__Impl"


    // $ANTLR start "rule__GSSTMField__Group_5__1"
    // InternalTM.g:2491:1: rule__GSSTMField__Group_5__1 : rule__GSSTMField__Group_5__1__Impl ;
    public final void rule__GSSTMField__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2495:1: ( rule__GSSTMField__Group_5__1__Impl )
            // InternalTM.g:2496:2: rule__GSSTMField__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMField__Group_5__1__Impl();

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
    // $ANTLR end "rule__GSSTMField__Group_5__1"


    // $ANTLR start "rule__GSSTMField__Group_5__1__Impl"
    // InternalTM.g:2502:1: rule__GSSTMField__Group_5__1__Impl : ( ( rule__GSSTMField__EnumRefAssignment_5_1 ) ) ;
    public final void rule__GSSTMField__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2506:1: ( ( ( rule__GSSTMField__EnumRefAssignment_5_1 ) ) )
            // InternalTM.g:2507:1: ( ( rule__GSSTMField__EnumRefAssignment_5_1 ) )
            {
            // InternalTM.g:2507:1: ( ( rule__GSSTMField__EnumRefAssignment_5_1 ) )
            // InternalTM.g:2508:2: ( rule__GSSTMField__EnumRefAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMFieldAccess().getEnumRefAssignment_5_1()); 
            }
            // InternalTM.g:2509:2: ( rule__GSSTMField__EnumRefAssignment_5_1 )
            // InternalTM.g:2509:3: rule__GSSTMField__EnumRefAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSTMField__EnumRefAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMFieldAccess().getEnumRefAssignment_5_1()); 
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
    // $ANTLR end "rule__GSSTMField__Group_5__1__Impl"


    // $ANTLR start "rule__GSSTM__NameAssignment_2"
    // InternalTM.g:2518:1: rule__GSSTM__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GSSTM__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2522:1: ( ( RULE_STRING ) )
            // InternalTM.g:2523:2: ( RULE_STRING )
            {
            // InternalTM.g:2523:2: ( RULE_STRING )
            // InternalTM.g:2524:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getNameSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__GSSTM__NameAssignment_2"


    // $ANTLR start "rule__GSSTM__TypeAssignment_4"
    // InternalTM.g:2533:1: rule__GSSTM__TypeAssignment_4 : ( RULE_UINT_STRING ) ;
    public final void rule__GSSTM__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2537:1: ( ( RULE_UINT_STRING ) )
            // InternalTM.g:2538:2: ( RULE_UINT_STRING )
            {
            // InternalTM.g:2538:2: ( RULE_UINT_STRING )
            // InternalTM.g:2539:3: RULE_UINT_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getTypeUINT_STRINGTerminalRuleCall_4_0()); 
            }
            match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getTypeUINT_STRINGTerminalRuleCall_4_0()); 
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
    // $ANTLR end "rule__GSSTM__TypeAssignment_4"


    // $ANTLR start "rule__GSSTM__SubtypeAssignment_6"
    // InternalTM.g:2548:1: rule__GSSTM__SubtypeAssignment_6 : ( RULE_UINT_STRING ) ;
    public final void rule__GSSTM__SubtypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2552:1: ( ( RULE_UINT_STRING ) )
            // InternalTM.g:2553:2: ( RULE_UINT_STRING )
            {
            // InternalTM.g:2553:2: ( RULE_UINT_STRING )
            // InternalTM.g:2554:3: RULE_UINT_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getSubtypeUINT_STRINGTerminalRuleCall_6_0()); 
            }
            match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getSubtypeUINT_STRINGTerminalRuleCall_6_0()); 
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
    // $ANTLR end "rule__GSSTM__SubtypeAssignment_6"


    // $ANTLR start "rule__GSSTM__LevelsAssignment_8"
    // InternalTM.g:2563:1: rule__GSSTM__LevelsAssignment_8 : ( RULE_UINT_STRING ) ;
    public final void rule__GSSTM__LevelsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2567:1: ( ( RULE_UINT_STRING ) )
            // InternalTM.g:2568:2: ( RULE_UINT_STRING )
            {
            // InternalTM.g:2568:2: ( RULE_UINT_STRING )
            // InternalTM.g:2569:3: RULE_UINT_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevelsUINT_STRINGTerminalRuleCall_8_0()); 
            }
            match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevelsUINT_STRINGTerminalRuleCall_8_0()); 
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
    // $ANTLR end "rule__GSSTM__LevelsAssignment_8"


    // $ANTLR start "rule__GSSTM__Level3_formatAssignment_10_2"
    // InternalTM.g:2578:1: rule__GSSTM__Level3_formatAssignment_10_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTM__Level3_formatAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2582:1: ( ( ( RULE_STRING ) ) )
            // InternalTM.g:2583:2: ( ( RULE_STRING ) )
            {
            // InternalTM.g:2583:2: ( ( RULE_STRING ) )
            // InternalTM.g:2584:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel3_formatGSSFormatFormatCrossReference_10_2_0()); 
            }
            // InternalTM.g:2585:3: ( RULE_STRING )
            // InternalTM.g:2586:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel3_formatGSSFormatFormatSTRINGTerminalRuleCall_10_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel3_formatGSSFormatFormatSTRINGTerminalRuleCall_10_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel3_formatGSSFormatFormatCrossReference_10_2_0()); 
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
    // $ANTLR end "rule__GSSTM__Level3_formatAssignment_10_2"


    // $ANTLR start "rule__GSSTM__Level3_filterAssignment_11_2"
    // InternalTM.g:2597:1: rule__GSSTM__Level3_filterAssignment_11_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTM__Level3_filterAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2601:1: ( ( ( RULE_STRING ) ) )
            // InternalTM.g:2602:2: ( ( RULE_STRING ) )
            {
            // InternalTM.g:2602:2: ( ( RULE_STRING ) )
            // InternalTM.g:2603:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel3_filterGSSFilterFilterCrossReference_11_2_0()); 
            }
            // InternalTM.g:2604:3: ( RULE_STRING )
            // InternalTM.g:2605:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel3_filterGSSFilterFilterSTRINGTerminalRuleCall_11_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel3_filterGSSFilterFilterSTRINGTerminalRuleCall_11_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel3_filterGSSFilterFilterCrossReference_11_2_0()); 
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
    // $ANTLR end "rule__GSSTM__Level3_filterAssignment_11_2"


    // $ANTLR start "rule__GSSTM__From_level2_importAssignment_12_2"
    // InternalTM.g:2616:1: rule__GSSTM__From_level2_importAssignment_12_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTM__From_level2_importAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2620:1: ( ( ( RULE_STRING ) ) )
            // InternalTM.g:2621:2: ( ( RULE_STRING ) )
            {
            // InternalTM.g:2621:2: ( ( RULE_STRING ) )
            // InternalTM.g:2622:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getFrom_level2_importGSSImportImportCrossReference_12_2_0()); 
            }
            // InternalTM.g:2623:3: ( RULE_STRING )
            // InternalTM.g:2624:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getFrom_level2_importGSSImportImportSTRINGTerminalRuleCall_12_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getFrom_level2_importGSSImportImportSTRINGTerminalRuleCall_12_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getFrom_level2_importGSSImportImportCrossReference_12_2_0()); 
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
    // $ANTLR end "rule__GSSTM__From_level2_importAssignment_12_2"


    // $ANTLR start "rule__GSSTM__Level2_formatAssignment_13_2"
    // InternalTM.g:2635:1: rule__GSSTM__Level2_formatAssignment_13_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTM__Level2_formatAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2639:1: ( ( ( RULE_STRING ) ) )
            // InternalTM.g:2640:2: ( ( RULE_STRING ) )
            {
            // InternalTM.g:2640:2: ( ( RULE_STRING ) )
            // InternalTM.g:2641:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel2_formatGSSFormatFormatCrossReference_13_2_0()); 
            }
            // InternalTM.g:2642:3: ( RULE_STRING )
            // InternalTM.g:2643:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel2_formatGSSFormatFormatSTRINGTerminalRuleCall_13_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel2_formatGSSFormatFormatSTRINGTerminalRuleCall_13_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel2_formatGSSFormatFormatCrossReference_13_2_0()); 
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
    // $ANTLR end "rule__GSSTM__Level2_formatAssignment_13_2"


    // $ANTLR start "rule__GSSTM__Level2_filterAssignment_14_2"
    // InternalTM.g:2654:1: rule__GSSTM__Level2_filterAssignment_14_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTM__Level2_filterAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2658:1: ( ( ( RULE_STRING ) ) )
            // InternalTM.g:2659:2: ( ( RULE_STRING ) )
            {
            // InternalTM.g:2659:2: ( ( RULE_STRING ) )
            // InternalTM.g:2660:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel2_filterGSSFilterFilterCrossReference_14_2_0()); 
            }
            // InternalTM.g:2661:3: ( RULE_STRING )
            // InternalTM.g:2662:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel2_filterGSSFilterFilterSTRINGTerminalRuleCall_14_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel2_filterGSSFilterFilterSTRINGTerminalRuleCall_14_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel2_filterGSSFilterFilterCrossReference_14_2_0()); 
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
    // $ANTLR end "rule__GSSTM__Level2_filterAssignment_14_2"


    // $ANTLR start "rule__GSSTM__From_level1_importAssignment_15_2"
    // InternalTM.g:2673:1: rule__GSSTM__From_level1_importAssignment_15_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTM__From_level1_importAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2677:1: ( ( ( RULE_STRING ) ) )
            // InternalTM.g:2678:2: ( ( RULE_STRING ) )
            {
            // InternalTM.g:2678:2: ( ( RULE_STRING ) )
            // InternalTM.g:2679:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getFrom_level1_importGSSImportImportCrossReference_15_2_0()); 
            }
            // InternalTM.g:2680:3: ( RULE_STRING )
            // InternalTM.g:2681:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getFrom_level1_importGSSImportImportSTRINGTerminalRuleCall_15_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getFrom_level1_importGSSImportImportSTRINGTerminalRuleCall_15_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getFrom_level1_importGSSImportImportCrossReference_15_2_0()); 
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
    // $ANTLR end "rule__GSSTM__From_level1_importAssignment_15_2"


    // $ANTLR start "rule__GSSTM__Level1_formatAssignment_16_2"
    // InternalTM.g:2692:1: rule__GSSTM__Level1_formatAssignment_16_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTM__Level1_formatAssignment_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2696:1: ( ( ( RULE_STRING ) ) )
            // InternalTM.g:2697:2: ( ( RULE_STRING ) )
            {
            // InternalTM.g:2697:2: ( ( RULE_STRING ) )
            // InternalTM.g:2698:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel1_formatGSSFormatFormatCrossReference_16_2_0()); 
            }
            // InternalTM.g:2699:3: ( RULE_STRING )
            // InternalTM.g:2700:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel1_formatGSSFormatFormatSTRINGTerminalRuleCall_16_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel1_formatGSSFormatFormatSTRINGTerminalRuleCall_16_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel1_formatGSSFormatFormatCrossReference_16_2_0()); 
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
    // $ANTLR end "rule__GSSTM__Level1_formatAssignment_16_2"


    // $ANTLR start "rule__GSSTM__Level1_filterAssignment_17_2"
    // InternalTM.g:2711:1: rule__GSSTM__Level1_filterAssignment_17_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTM__Level1_filterAssignment_17_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2715:1: ( ( ( RULE_STRING ) ) )
            // InternalTM.g:2716:2: ( ( RULE_STRING ) )
            {
            // InternalTM.g:2716:2: ( ( RULE_STRING ) )
            // InternalTM.g:2717:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel1_filterGSSFilterFilterCrossReference_17_2_0()); 
            }
            // InternalTM.g:2718:3: ( RULE_STRING )
            // InternalTM.g:2719:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel1_filterGSSFilterFilterSTRINGTerminalRuleCall_17_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel1_filterGSSFilterFilterSTRINGTerminalRuleCall_17_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel1_filterGSSFilterFilterCrossReference_17_2_0()); 
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
    // $ANTLR end "rule__GSSTM__Level1_filterAssignment_17_2"


    // $ANTLR start "rule__GSSTM__From_level0_importAssignment_18_2"
    // InternalTM.g:2730:1: rule__GSSTM__From_level0_importAssignment_18_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTM__From_level0_importAssignment_18_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2734:1: ( ( ( RULE_STRING ) ) )
            // InternalTM.g:2735:2: ( ( RULE_STRING ) )
            {
            // InternalTM.g:2735:2: ( ( RULE_STRING ) )
            // InternalTM.g:2736:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getFrom_level0_importGSSImportImportCrossReference_18_2_0()); 
            }
            // InternalTM.g:2737:3: ( RULE_STRING )
            // InternalTM.g:2738:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getFrom_level0_importGSSImportImportSTRINGTerminalRuleCall_18_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getFrom_level0_importGSSImportImportSTRINGTerminalRuleCall_18_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getFrom_level0_importGSSImportImportCrossReference_18_2_0()); 
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
    // $ANTLR end "rule__GSSTM__From_level0_importAssignment_18_2"


    // $ANTLR start "rule__GSSTM__Level0_formatAssignment_19_2"
    // InternalTM.g:2749:1: rule__GSSTM__Level0_formatAssignment_19_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTM__Level0_formatAssignment_19_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2753:1: ( ( ( RULE_STRING ) ) )
            // InternalTM.g:2754:2: ( ( RULE_STRING ) )
            {
            // InternalTM.g:2754:2: ( ( RULE_STRING ) )
            // InternalTM.g:2755:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel0_formatGSSFormatFormatCrossReference_19_2_0()); 
            }
            // InternalTM.g:2756:3: ( RULE_STRING )
            // InternalTM.g:2757:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel0_formatGSSFormatFormatSTRINGTerminalRuleCall_19_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel0_formatGSSFormatFormatSTRINGTerminalRuleCall_19_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel0_formatGSSFormatFormatCrossReference_19_2_0()); 
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
    // $ANTLR end "rule__GSSTM__Level0_formatAssignment_19_2"


    // $ANTLR start "rule__GSSTM__Level0_filterAssignment_20_2"
    // InternalTM.g:2768:1: rule__GSSTM__Level0_filterAssignment_20_2 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTM__Level0_filterAssignment_20_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2772:1: ( ( ( RULE_STRING ) ) )
            // InternalTM.g:2773:2: ( ( RULE_STRING ) )
            {
            // InternalTM.g:2773:2: ( ( RULE_STRING ) )
            // InternalTM.g:2774:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel0_filterGSSFilterFilterCrossReference_20_2_0()); 
            }
            // InternalTM.g:2775:3: ( RULE_STRING )
            // InternalTM.g:2776:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getLevel0_filterGSSFilterFilterSTRINGTerminalRuleCall_20_2_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel0_filterGSSFilterFilterSTRINGTerminalRuleCall_20_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getLevel0_filterGSSFilterFilterCrossReference_20_2_0()); 
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
    // $ANTLR end "rule__GSSTM__Level0_filterAssignment_20_2"


    // $ANTLR start "rule__GSSTM__GssPi1Assignment_21"
    // InternalTM.g:2787:1: rule__GSSTM__GssPi1Assignment_21 : ( ruleGSSTMPi1 ) ;
    public final void rule__GSSTM__GssPi1Assignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2791:1: ( ( ruleGSSTMPi1 ) )
            // InternalTM.g:2792:2: ( ruleGSSTMPi1 )
            {
            // InternalTM.g:2792:2: ( ruleGSSTMPi1 )
            // InternalTM.g:2793:3: ruleGSSTMPi1
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getGssPi1GSSTMPi1ParserRuleCall_21_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSTMPi1();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getGssPi1GSSTMPi1ParserRuleCall_21_0()); 
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
    // $ANTLR end "rule__GSSTM__GssPi1Assignment_21"


    // $ANTLR start "rule__GSSTM__GssFieldsAssignment_22_1"
    // InternalTM.g:2802:1: rule__GSSTM__GssFieldsAssignment_22_1 : ( ruleGSSTMField ) ;
    public final void rule__GSSTM__GssFieldsAssignment_22_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2806:1: ( ( ruleGSSTMField ) )
            // InternalTM.g:2807:2: ( ruleGSSTMField )
            {
            // InternalTM.g:2807:2: ( ruleGSSTMField )
            // InternalTM.g:2808:3: ruleGSSTMField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMAccess().getGssFieldsGSSTMFieldParserRuleCall_22_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSTMField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMAccess().getGssFieldsGSSTMFieldParserRuleCall_22_1_0()); 
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
    // $ANTLR end "rule__GSSTM__GssFieldsAssignment_22_1"


    // $ANTLR start "rule__GSSTMPi1__NameAssignment_2"
    // InternalTM.g:2817:1: rule__GSSTMPi1__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GSSTMPi1__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2821:1: ( ( RULE_STRING ) )
            // InternalTM.g:2822:2: ( RULE_STRING )
            {
            // InternalTM.g:2822:2: ( RULE_STRING )
            // InternalTM.g:2823:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMPi1Access().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMPi1Access().getNameSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__GSSTMPi1__NameAssignment_2"


    // $ANTLR start "rule__GSSTMPi1__ValAssignment_4"
    // InternalTM.g:2832:1: rule__GSSTMPi1__ValAssignment_4 : ( RULE_UINT_STRING ) ;
    public final void rule__GSSTMPi1__ValAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2836:1: ( ( RULE_UINT_STRING ) )
            // InternalTM.g:2837:2: ( RULE_UINT_STRING )
            {
            // InternalTM.g:2837:2: ( RULE_UINT_STRING )
            // InternalTM.g:2838:3: RULE_UINT_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMPi1Access().getValUINT_STRINGTerminalRuleCall_4_0()); 
            }
            match(input,RULE_UINT_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMPi1Access().getValUINT_STRINGTerminalRuleCall_4_0()); 
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
    // $ANTLR end "rule__GSSTMPi1__ValAssignment_4"


    // $ANTLR start "rule__GSSTMPi1__GssFieldAssignment_6"
    // InternalTM.g:2847:1: rule__GSSTMPi1__GssFieldAssignment_6 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTMPi1__GssFieldAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2851:1: ( ( ( RULE_STRING ) ) )
            // InternalTM.g:2852:2: ( ( RULE_STRING ) )
            {
            // InternalTM.g:2852:2: ( ( RULE_STRING ) )
            // InternalTM.g:2853:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMPi1Access().getGssFieldGSSFormatFieldCrossReference_6_0()); 
            }
            // InternalTM.g:2854:3: ( RULE_STRING )
            // InternalTM.g:2855:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMPi1Access().getGssFieldGSSFormatFieldSTRINGTerminalRuleCall_6_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMPi1Access().getGssFieldGSSFormatFieldSTRINGTerminalRuleCall_6_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMPi1Access().getGssFieldGSSFormatFieldCrossReference_6_0()); 
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
    // $ANTLR end "rule__GSSTMPi1__GssFieldAssignment_6"


    // $ANTLR start "rule__GSSTMField__NameAssignment_2"
    // InternalTM.g:2866:1: rule__GSSTMField__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GSSTMField__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2870:1: ( ( RULE_STRING ) )
            // InternalTM.g:2871:2: ( RULE_STRING )
            {
            // InternalTM.g:2871:2: ( RULE_STRING )
            // InternalTM.g:2872:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMFieldAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMFieldAccess().getNameSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__GSSTMField__NameAssignment_2"


    // $ANTLR start "rule__GSSTMField__GssFieldAssignment_4"
    // InternalTM.g:2881:1: rule__GSSTMField__GssFieldAssignment_4 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTMField__GssFieldAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2885:1: ( ( ( RULE_STRING ) ) )
            // InternalTM.g:2886:2: ( ( RULE_STRING ) )
            {
            // InternalTM.g:2886:2: ( ( RULE_STRING ) )
            // InternalTM.g:2887:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMFieldAccess().getGssFieldGSSFormatFieldCrossReference_4_0()); 
            }
            // InternalTM.g:2888:3: ( RULE_STRING )
            // InternalTM.g:2889:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMFieldAccess().getGssFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMFieldAccess().getGssFieldGSSFormatFieldSTRINGTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMFieldAccess().getGssFieldGSSFormatFieldCrossReference_4_0()); 
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
    // $ANTLR end "rule__GSSTMField__GssFieldAssignment_4"


    // $ANTLR start "rule__GSSTMField__EnumRefAssignment_5_1"
    // InternalTM.g:2900:1: rule__GSSTMField__EnumRefAssignment_5_1 : ( ( RULE_STRING ) ) ;
    public final void rule__GSSTMField__EnumRefAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTM.g:2904:1: ( ( ( RULE_STRING ) ) )
            // InternalTM.g:2905:2: ( ( RULE_STRING ) )
            {
            // InternalTM.g:2905:2: ( ( RULE_STRING ) )
            // InternalTM.g:2906:3: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMFieldAccess().getEnumRefTMTCIFEnumCrossReference_5_1_0()); 
            }
            // InternalTM.g:2907:3: ( RULE_STRING )
            // InternalTM.g:2908:4: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSTMFieldAccess().getEnumRefTMTCIFEnumSTRINGTerminalRuleCall_5_1_0_1()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMFieldAccess().getEnumRefTMTCIFEnumSTRINGTerminalRuleCall_5_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSTMFieldAccess().getEnumRefTMTCIFEnumCrossReference_5_1_0()); 
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
    // $ANTLR end "rule__GSSTMField__EnumRefAssignment_5_1"

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
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000005FFCC0000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000200000L});
    }


}