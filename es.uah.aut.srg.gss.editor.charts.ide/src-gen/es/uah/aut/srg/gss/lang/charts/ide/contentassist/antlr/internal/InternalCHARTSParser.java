package es.uah.aut.srg.gss.lang.charts.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.gss.lang.charts.services.CHARTSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/*******************************************************************************
 * Copyright (c) 2018 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
@SuppressWarnings("all")
public class InternalCHARTSParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_HEXADECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'volts'", "'amps'", "'import'", "':='", "';'", "'GSSChartsCharts'", "'{'", "'}'", "'uri'", "'version'", "'GSSChartsChart'", "'id'", "'name'", "'y_units'", "'y_max'", "'.'", "'('", "')'", "'-'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int RULE_HEXADECIMAL=7;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCHARTSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCHARTSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCHARTSParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCHARTS.g"; }


    	private CHARTSGrammarAccess grammarAccess;

    	public void setGrammarAccess(CHARTSGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleGSSModelFile"
    // InternalCHARTS.g:61:1: entryRuleGSSModelFile : ruleGSSModelFile EOF ;
    public final void entryRuleGSSModelFile() throws RecognitionException {
        try {
            // InternalCHARTS.g:62:1: ( ruleGSSModelFile EOF )
            // InternalCHARTS.g:63:1: ruleGSSModelFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSModelFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSModelFileRule()); 
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
    // $ANTLR end "entryRuleGSSModelFile"


    // $ANTLR start "ruleGSSModelFile"
    // InternalCHARTS.g:70:1: ruleGSSModelFile : ( ( rule__GSSModelFile__Group__0 ) ) ;
    public final void ruleGSSModelFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:74:2: ( ( ( rule__GSSModelFile__Group__0 ) ) )
            // InternalCHARTS.g:75:2: ( ( rule__GSSModelFile__Group__0 ) )
            {
            // InternalCHARTS.g:75:2: ( ( rule__GSSModelFile__Group__0 ) )
            // InternalCHARTS.g:76:3: ( rule__GSSModelFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getGroup()); 
            }
            // InternalCHARTS.g:77:3: ( rule__GSSModelFile__Group__0 )
            // InternalCHARTS.g:77:4: rule__GSSModelFile__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSModelFile__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSModelFileAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSModelFile"


    // $ANTLR start "entryRuleGSSModelFileImport"
    // InternalCHARTS.g:86:1: entryRuleGSSModelFileImport : ruleGSSModelFileImport EOF ;
    public final void entryRuleGSSModelFileImport() throws RecognitionException {
        try {
            // InternalCHARTS.g:87:1: ( ruleGSSModelFileImport EOF )
            // InternalCHARTS.g:88:1: ruleGSSModelFileImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSModelFileImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSModelFileImportRule()); 
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
    // $ANTLR end "entryRuleGSSModelFileImport"


    // $ANTLR start "ruleGSSModelFileImport"
    // InternalCHARTS.g:95:1: ruleGSSModelFileImport : ( ( rule__GSSModelFileImport__Group__0 ) ) ;
    public final void ruleGSSModelFileImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:99:2: ( ( ( rule__GSSModelFileImport__Group__0 ) ) )
            // InternalCHARTS.g:100:2: ( ( rule__GSSModelFileImport__Group__0 ) )
            {
            // InternalCHARTS.g:100:2: ( ( rule__GSSModelFileImport__Group__0 ) )
            // InternalCHARTS.g:101:3: ( rule__GSSModelFileImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getGroup()); 
            }
            // InternalCHARTS.g:102:3: ( rule__GSSModelFileImport__Group__0 )
            // InternalCHARTS.g:102:4: rule__GSSModelFileImport__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSModelFileImport__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSModelFileImportAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSModelFileImport"


    // $ANTLR start "entryRuleGSSChartsCharts"
    // InternalCHARTS.g:111:1: entryRuleGSSChartsCharts : ruleGSSChartsCharts EOF ;
    public final void entryRuleGSSChartsCharts() throws RecognitionException {
        try {
            // InternalCHARTS.g:112:1: ( ruleGSSChartsCharts EOF )
            // InternalCHARTS.g:113:1: ruleGSSChartsCharts EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSChartsCharts();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartsRule()); 
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
    // $ANTLR end "entryRuleGSSChartsCharts"


    // $ANTLR start "ruleGSSChartsCharts"
    // InternalCHARTS.g:120:1: ruleGSSChartsCharts : ( ( rule__GSSChartsCharts__Group__0 ) ) ;
    public final void ruleGSSChartsCharts() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:124:2: ( ( ( rule__GSSChartsCharts__Group__0 ) ) )
            // InternalCHARTS.g:125:2: ( ( rule__GSSChartsCharts__Group__0 ) )
            {
            // InternalCHARTS.g:125:2: ( ( rule__GSSChartsCharts__Group__0 ) )
            // InternalCHARTS.g:126:3: ( rule__GSSChartsCharts__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getGroup()); 
            }
            // InternalCHARTS.g:127:3: ( rule__GSSChartsCharts__Group__0 )
            // InternalCHARTS.g:127:4: rule__GSSChartsCharts__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsCharts__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSChartsCharts"


    // $ANTLR start "entryRuleGSSChartsChart"
    // InternalCHARTS.g:136:1: entryRuleGSSChartsChart : ruleGSSChartsChart EOF ;
    public final void entryRuleGSSChartsChart() throws RecognitionException {
        try {
            // InternalCHARTS.g:137:1: ( ruleGSSChartsChart EOF )
            // InternalCHARTS.g:138:1: ruleGSSChartsChart EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSChartsChart();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartRule()); 
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
    // $ANTLR end "entryRuleGSSChartsChart"


    // $ANTLR start "ruleGSSChartsChart"
    // InternalCHARTS.g:145:1: ruleGSSChartsChart : ( ( rule__GSSChartsChart__Group__0 ) ) ;
    public final void ruleGSSChartsChart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:149:2: ( ( ( rule__GSSChartsChart__Group__0 ) ) )
            // InternalCHARTS.g:150:2: ( ( rule__GSSChartsChart__Group__0 ) )
            {
            // InternalCHARTS.g:150:2: ( ( rule__GSSChartsChart__Group__0 ) )
            // InternalCHARTS.g:151:3: ( rule__GSSChartsChart__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getGroup()); 
            }
            // InternalCHARTS.g:152:3: ( rule__GSSChartsChart__Group__0 )
            // InternalCHARTS.g:152:4: rule__GSSChartsChart__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsChart__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSChartsChart"


    // $ANTLR start "entryRuleEString"
    // InternalCHARTS.g:161:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalCHARTS.g:162:1: ( ruleEString EOF )
            // InternalCHARTS.g:163:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCHARTS.g:170:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:174:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalCHARTS.g:175:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalCHARTS.g:175:2: ( ( rule__EString__Alternatives ) )
            // InternalCHARTS.g:176:3: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalCHARTS.g:177:3: ( rule__EString__Alternatives )
            // InternalCHARTS.g:177:4: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCHARTS.g:186:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalCHARTS.g:187:1: ( ruleQualifiedName EOF )
            // InternalCHARTS.g:188:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalCHARTS.g:195:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:199:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalCHARTS.g:200:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalCHARTS.g:200:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalCHARTS.g:201:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalCHARTS.g:202:3: ( rule__QualifiedName__Group__0 )
            // InternalCHARTS.g:202:4: rule__QualifiedName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleVersion"
    // InternalCHARTS.g:211:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalCHARTS.g:212:1: ( ruleVersion EOF )
            // InternalCHARTS.g:213:1: ruleVersion EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionRule()); 
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
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalCHARTS.g:220:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:224:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalCHARTS.g:225:2: ( ( rule__Version__Group__0 ) )
            {
            // InternalCHARTS.g:225:2: ( ( rule__Version__Group__0 ) )
            // InternalCHARTS.g:226:3: ( rule__Version__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup()); 
            }
            // InternalCHARTS.g:227:3: ( rule__Version__Group__0 )
            // InternalCHARTS.g:227:4: rule__Version__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Version__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleVersionedQualifiedName"
    // InternalCHARTS.g:236:1: entryRuleVersionedQualifiedName : ruleVersionedQualifiedName EOF ;
    public final void entryRuleVersionedQualifiedName() throws RecognitionException {
        try {
            // InternalCHARTS.g:237:1: ( ruleVersionedQualifiedName EOF )
            // InternalCHARTS.g:238:1: ruleVersionedQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleVersionedQualifiedName"


    // $ANTLR start "ruleVersionedQualifiedName"
    // InternalCHARTS.g:245:1: ruleVersionedQualifiedName : ( ( rule__VersionedQualifiedName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:249:2: ( ( ( rule__VersionedQualifiedName__Group__0 ) ) )
            // InternalCHARTS.g:250:2: ( ( rule__VersionedQualifiedName__Group__0 ) )
            {
            // InternalCHARTS.g:250:2: ( ( rule__VersionedQualifiedName__Group__0 ) )
            // InternalCHARTS.g:251:3: ( rule__VersionedQualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); 
            }
            // InternalCHARTS.g:252:3: ( rule__VersionedQualifiedName__Group__0 )
            // InternalCHARTS.g:252:4: rule__VersionedQualifiedName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VersionedQualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVersionedQualifiedName"


    // $ANTLR start "entryRuleINTEGER"
    // InternalCHARTS.g:261:1: entryRuleINTEGER : ruleINTEGER EOF ;
    public final void entryRuleINTEGER() throws RecognitionException {
        try {
            // InternalCHARTS.g:262:1: ( ruleINTEGER EOF )
            // InternalCHARTS.g:263:1: ruleINTEGER EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getINTEGERRule()); 
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
    // $ANTLR end "entryRuleINTEGER"


    // $ANTLR start "ruleINTEGER"
    // InternalCHARTS.g:270:1: ruleINTEGER : ( ( rule__INTEGER__Alternatives ) ) ;
    public final void ruleINTEGER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:274:2: ( ( ( rule__INTEGER__Alternatives ) ) )
            // InternalCHARTS.g:275:2: ( ( rule__INTEGER__Alternatives ) )
            {
            // InternalCHARTS.g:275:2: ( ( rule__INTEGER__Alternatives ) )
            // InternalCHARTS.g:276:3: ( rule__INTEGER__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getAlternatives()); 
            }
            // InternalCHARTS.g:277:3: ( rule__INTEGER__Alternatives )
            // InternalCHARTS.g:277:4: rule__INTEGER__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__INTEGER__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getINTEGERAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleINTEGER"


    // $ANTLR start "ruleGSSChartsYUnits"
    // InternalCHARTS.g:286:1: ruleGSSChartsYUnits : ( ( rule__GSSChartsYUnits__Alternatives ) ) ;
    public final void ruleGSSChartsYUnits() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:290:1: ( ( ( rule__GSSChartsYUnits__Alternatives ) ) )
            // InternalCHARTS.g:291:2: ( ( rule__GSSChartsYUnits__Alternatives ) )
            {
            // InternalCHARTS.g:291:2: ( ( rule__GSSChartsYUnits__Alternatives ) )
            // InternalCHARTS.g:292:3: ( rule__GSSChartsYUnits__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsYUnitsAccess().getAlternatives()); 
            }
            // InternalCHARTS.g:293:3: ( rule__GSSChartsYUnits__Alternatives )
            // InternalCHARTS.g:293:4: rule__GSSChartsYUnits__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsYUnits__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsYUnitsAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSChartsYUnits"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalCHARTS.g:301:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:305:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
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
                    // InternalCHARTS.g:306:2: ( RULE_STRING )
                    {
                    // InternalCHARTS.g:306:2: ( RULE_STRING )
                    // InternalCHARTS.g:307:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCHARTS.g:312:2: ( RULE_ID )
                    {
                    // InternalCHARTS.g:312:2: ( RULE_ID )
                    // InternalCHARTS.g:313:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Version__Alternatives_0"
    // InternalCHARTS.g:322:1: rule__Version__Alternatives_0 : ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) );
    public final void rule__Version__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:326:1: ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    alt2=2;
                }
                else if ( (LA2_1==EOF||LA2_1==16||LA2_1==27||LA2_1==29) ) {
                    alt2=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_ID) ) {
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
                    // InternalCHARTS.g:327:2: ( RULE_INT )
                    {
                    // InternalCHARTS.g:327:2: ( RULE_INT )
                    // InternalCHARTS.g:328:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCHARTS.g:333:2: ( ( rule__Version__Group_0_1__0 ) )
                    {
                    // InternalCHARTS.g:333:2: ( ( rule__Version__Group_0_1__0 ) )
                    // InternalCHARTS.g:334:3: ( rule__Version__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_0_1()); 
                    }
                    // InternalCHARTS.g:335:3: ( rule__Version__Group_0_1__0 )
                    // InternalCHARTS.g:335:4: rule__Version__Group_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Version__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVersionAccess().getGroup_0_1()); 
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
    // $ANTLR end "rule__Version__Alternatives_0"


    // $ANTLR start "rule__Version__Alternatives_1_1"
    // InternalCHARTS.g:343:1: rule__Version__Alternatives_1_1 : ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) );
    public final void rule__Version__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:347:1: ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    alt3=2;
                }
                else if ( (LA3_1==EOF||LA3_1==16||LA3_1==27||LA3_1==29) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCHARTS.g:348:2: ( RULE_INT )
                    {
                    // InternalCHARTS.g:348:2: ( RULE_INT )
                    // InternalCHARTS.g:349:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); 
                    }
                    match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCHARTS.g:354:2: ( ( rule__Version__Group_1_1_1__0 ) )
                    {
                    // InternalCHARTS.g:354:2: ( ( rule__Version__Group_1_1_1__0 ) )
                    // InternalCHARTS.g:355:3: ( rule__Version__Group_1_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_1_1_1()); 
                    }
                    // InternalCHARTS.g:356:3: ( rule__Version__Group_1_1_1__0 )
                    // InternalCHARTS.g:356:4: rule__Version__Group_1_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Version__Group_1_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVersionAccess().getGroup_1_1_1()); 
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
    // $ANTLR end "rule__Version__Alternatives_1_1"


    // $ANTLR start "rule__INTEGER__Alternatives"
    // InternalCHARTS.g:364:1: rule__INTEGER__Alternatives : ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) );
    public final void rule__INTEGER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:368:1: ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||LA4_0==30) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_HEXADECIMAL) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCHARTS.g:369:2: ( ( rule__INTEGER__Group_0__0 ) )
                    {
                    // InternalCHARTS.g:369:2: ( ( rule__INTEGER__Group_0__0 ) )
                    // InternalCHARTS.g:370:3: ( rule__INTEGER__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getINTEGERAccess().getGroup_0()); 
                    }
                    // InternalCHARTS.g:371:3: ( rule__INTEGER__Group_0__0 )
                    // InternalCHARTS.g:371:4: rule__INTEGER__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__INTEGER__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getINTEGERAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCHARTS.g:375:2: ( RULE_HEXADECIMAL )
                    {
                    // InternalCHARTS.g:375:2: ( RULE_HEXADECIMAL )
                    // InternalCHARTS.g:376:3: RULE_HEXADECIMAL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getINTEGERAccess().getHEXADECIMALTerminalRuleCall_1()); 
                    }
                    match(input,RULE_HEXADECIMAL,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getINTEGERAccess().getHEXADECIMALTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__INTEGER__Alternatives"


    // $ANTLR start "rule__GSSChartsYUnits__Alternatives"
    // InternalCHARTS.g:385:1: rule__GSSChartsYUnits__Alternatives : ( ( ( 'volts' ) ) | ( ( 'amps' ) ) );
    public final void rule__GSSChartsYUnits__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:389:1: ( ( ( 'volts' ) ) | ( ( 'amps' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCHARTS.g:390:2: ( ( 'volts' ) )
                    {
                    // InternalCHARTS.g:390:2: ( ( 'volts' ) )
                    // InternalCHARTS.g:391:3: ( 'volts' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSChartsYUnitsAccess().getVoltsEnumLiteralDeclaration_0()); 
                    }
                    // InternalCHARTS.g:392:3: ( 'volts' )
                    // InternalCHARTS.g:392:4: 'volts'
                    {
                    match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSChartsYUnitsAccess().getVoltsEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCHARTS.g:396:2: ( ( 'amps' ) )
                    {
                    // InternalCHARTS.g:396:2: ( ( 'amps' ) )
                    // InternalCHARTS.g:397:3: ( 'amps' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSChartsYUnitsAccess().getAmpsEnumLiteralDeclaration_1()); 
                    }
                    // InternalCHARTS.g:398:3: ( 'amps' )
                    // InternalCHARTS.g:398:4: 'amps'
                    {
                    match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSChartsYUnitsAccess().getAmpsEnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__GSSChartsYUnits__Alternatives"


    // $ANTLR start "rule__GSSModelFile__Group__0"
    // InternalCHARTS.g:406:1: rule__GSSModelFile__Group__0 : rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1 ;
    public final void rule__GSSModelFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:410:1: ( rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1 )
            // InternalCHARTS.g:411:2: rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__GSSModelFile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSModelFile__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSModelFile__Group__0"


    // $ANTLR start "rule__GSSModelFile__Group__0__Impl"
    // InternalCHARTS.g:418:1: rule__GSSModelFile__Group__0__Impl : ( ( rule__GSSModelFile__ImportsAssignment_0 )* ) ;
    public final void rule__GSSModelFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:422:1: ( ( ( rule__GSSModelFile__ImportsAssignment_0 )* ) )
            // InternalCHARTS.g:423:1: ( ( rule__GSSModelFile__ImportsAssignment_0 )* )
            {
            // InternalCHARTS.g:423:1: ( ( rule__GSSModelFile__ImportsAssignment_0 )* )
            // InternalCHARTS.g:424:2: ( rule__GSSModelFile__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getImportsAssignment_0()); 
            }
            // InternalCHARTS.g:425:2: ( rule__GSSModelFile__ImportsAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCHARTS.g:425:3: rule__GSSModelFile__ImportsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__GSSModelFile__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSModelFileAccess().getImportsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSModelFile__Group__0__Impl"


    // $ANTLR start "rule__GSSModelFile__Group__1"
    // InternalCHARTS.g:433:1: rule__GSSModelFile__Group__1 : rule__GSSModelFile__Group__1__Impl ;
    public final void rule__GSSModelFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:437:1: ( rule__GSSModelFile__Group__1__Impl )
            // InternalCHARTS.g:438:2: rule__GSSModelFile__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSModelFile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSModelFile__Group__1"


    // $ANTLR start "rule__GSSModelFile__Group__1__Impl"
    // InternalCHARTS.g:444:1: rule__GSSModelFile__Group__1__Impl : ( ( rule__GSSModelFile__ElementAssignment_1 ) ) ;
    public final void rule__GSSModelFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:448:1: ( ( ( rule__GSSModelFile__ElementAssignment_1 ) ) )
            // InternalCHARTS.g:449:1: ( ( rule__GSSModelFile__ElementAssignment_1 ) )
            {
            // InternalCHARTS.g:449:1: ( ( rule__GSSModelFile__ElementAssignment_1 ) )
            // InternalCHARTS.g:450:2: ( rule__GSSModelFile__ElementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getElementAssignment_1()); 
            }
            // InternalCHARTS.g:451:2: ( rule__GSSModelFile__ElementAssignment_1 )
            // InternalCHARTS.g:451:3: rule__GSSModelFile__ElementAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSModelFile__ElementAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSModelFileAccess().getElementAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSModelFile__Group__1__Impl"


    // $ANTLR start "rule__GSSModelFileImport__Group__0"
    // InternalCHARTS.g:460:1: rule__GSSModelFileImport__Group__0 : rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1 ;
    public final void rule__GSSModelFileImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:464:1: ( rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1 )
            // InternalCHARTS.g:465:2: rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSModelFileImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSModelFileImport__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSModelFileImport__Group__0"


    // $ANTLR start "rule__GSSModelFileImport__Group__0__Impl"
    // InternalCHARTS.g:472:1: rule__GSSModelFileImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__GSSModelFileImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:476:1: ( ( 'import' ) )
            // InternalCHARTS.g:477:1: ( 'import' )
            {
            // InternalCHARTS.g:477:1: ( 'import' )
            // InternalCHARTS.g:478:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getImportKeyword_0()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSModelFileImportAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSModelFileImport__Group__0__Impl"


    // $ANTLR start "rule__GSSModelFileImport__Group__1"
    // InternalCHARTS.g:487:1: rule__GSSModelFileImport__Group__1 : rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2 ;
    public final void rule__GSSModelFileImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:491:1: ( rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2 )
            // InternalCHARTS.g:492:2: rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSModelFileImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSModelFileImport__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSModelFileImport__Group__1"


    // $ANTLR start "rule__GSSModelFileImport__Group__1__Impl"
    // InternalCHARTS.g:499:1: rule__GSSModelFileImport__Group__1__Impl : ( ':=' ) ;
    public final void rule__GSSModelFileImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:503:1: ( ( ':=' ) )
            // InternalCHARTS.g:504:1: ( ':=' )
            {
            // InternalCHARTS.g:504:1: ( ':=' )
            // InternalCHARTS.g:505:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSModelFileImportAccess().getColonEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSModelFileImport__Group__1__Impl"


    // $ANTLR start "rule__GSSModelFileImport__Group__2"
    // InternalCHARTS.g:514:1: rule__GSSModelFileImport__Group__2 : rule__GSSModelFileImport__Group__2__Impl rule__GSSModelFileImport__Group__3 ;
    public final void rule__GSSModelFileImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:518:1: ( rule__GSSModelFileImport__Group__2__Impl rule__GSSModelFileImport__Group__3 )
            // InternalCHARTS.g:519:2: rule__GSSModelFileImport__Group__2__Impl rule__GSSModelFileImport__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSModelFileImport__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSModelFileImport__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSModelFileImport__Group__2"


    // $ANTLR start "rule__GSSModelFileImport__Group__2__Impl"
    // InternalCHARTS.g:526:1: rule__GSSModelFileImport__Group__2__Impl : ( ( rule__GSSModelFileImport__ImportURIAssignment_2 ) ) ;
    public final void rule__GSSModelFileImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:530:1: ( ( ( rule__GSSModelFileImport__ImportURIAssignment_2 ) ) )
            // InternalCHARTS.g:531:1: ( ( rule__GSSModelFileImport__ImportURIAssignment_2 ) )
            {
            // InternalCHARTS.g:531:1: ( ( rule__GSSModelFileImport__ImportURIAssignment_2 ) )
            // InternalCHARTS.g:532:2: ( rule__GSSModelFileImport__ImportURIAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getImportURIAssignment_2()); 
            }
            // InternalCHARTS.g:533:2: ( rule__GSSModelFileImport__ImportURIAssignment_2 )
            // InternalCHARTS.g:533:3: rule__GSSModelFileImport__ImportURIAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSModelFileImport__ImportURIAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSModelFileImportAccess().getImportURIAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSModelFileImport__Group__2__Impl"


    // $ANTLR start "rule__GSSModelFileImport__Group__3"
    // InternalCHARTS.g:541:1: rule__GSSModelFileImport__Group__3 : rule__GSSModelFileImport__Group__3__Impl ;
    public final void rule__GSSModelFileImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:545:1: ( rule__GSSModelFileImport__Group__3__Impl )
            // InternalCHARTS.g:546:2: rule__GSSModelFileImport__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSModelFileImport__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSModelFileImport__Group__3"


    // $ANTLR start "rule__GSSModelFileImport__Group__3__Impl"
    // InternalCHARTS.g:552:1: rule__GSSModelFileImport__Group__3__Impl : ( ';' ) ;
    public final void rule__GSSModelFileImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:556:1: ( ( ';' ) )
            // InternalCHARTS.g:557:1: ( ';' )
            {
            // InternalCHARTS.g:557:1: ( ';' )
            // InternalCHARTS.g:558:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getSemicolonKeyword_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSModelFileImportAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSModelFileImport__Group__3__Impl"


    // $ANTLR start "rule__GSSChartsCharts__Group__0"
    // InternalCHARTS.g:568:1: rule__GSSChartsCharts__Group__0 : rule__GSSChartsCharts__Group__0__Impl rule__GSSChartsCharts__Group__1 ;
    public final void rule__GSSChartsCharts__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:572:1: ( rule__GSSChartsCharts__Group__0__Impl rule__GSSChartsCharts__Group__1 )
            // InternalCHARTS.g:573:2: rule__GSSChartsCharts__Group__0__Impl rule__GSSChartsCharts__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSChartsCharts__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsCharts__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group__0"


    // $ANTLR start "rule__GSSChartsCharts__Group__0__Impl"
    // InternalCHARTS.g:580:1: rule__GSSChartsCharts__Group__0__Impl : ( 'GSSChartsCharts' ) ;
    public final void rule__GSSChartsCharts__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:584:1: ( ( 'GSSChartsCharts' ) )
            // InternalCHARTS.g:585:1: ( 'GSSChartsCharts' )
            {
            // InternalCHARTS.g:585:1: ( 'GSSChartsCharts' )
            // InternalCHARTS.g:586:2: 'GSSChartsCharts'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getGSSChartsChartsKeyword_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartsAccess().getGSSChartsChartsKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group__0__Impl"


    // $ANTLR start "rule__GSSChartsCharts__Group__1"
    // InternalCHARTS.g:595:1: rule__GSSChartsCharts__Group__1 : rule__GSSChartsCharts__Group__1__Impl rule__GSSChartsCharts__Group__2 ;
    public final void rule__GSSChartsCharts__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:599:1: ( rule__GSSChartsCharts__Group__1__Impl rule__GSSChartsCharts__Group__2 )
            // InternalCHARTS.g:600:2: rule__GSSChartsCharts__Group__1__Impl rule__GSSChartsCharts__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSChartsCharts__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsCharts__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group__1"


    // $ANTLR start "rule__GSSChartsCharts__Group__1__Impl"
    // InternalCHARTS.g:607:1: rule__GSSChartsCharts__Group__1__Impl : ( ( rule__GSSChartsCharts__NameAssignment_1 ) ) ;
    public final void rule__GSSChartsCharts__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:611:1: ( ( ( rule__GSSChartsCharts__NameAssignment_1 ) ) )
            // InternalCHARTS.g:612:1: ( ( rule__GSSChartsCharts__NameAssignment_1 ) )
            {
            // InternalCHARTS.g:612:1: ( ( rule__GSSChartsCharts__NameAssignment_1 ) )
            // InternalCHARTS.g:613:2: ( rule__GSSChartsCharts__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getNameAssignment_1()); 
            }
            // InternalCHARTS.g:614:2: ( rule__GSSChartsCharts__NameAssignment_1 )
            // InternalCHARTS.g:614:3: rule__GSSChartsCharts__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsCharts__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartsAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group__1__Impl"


    // $ANTLR start "rule__GSSChartsCharts__Group__2"
    // InternalCHARTS.g:622:1: rule__GSSChartsCharts__Group__2 : rule__GSSChartsCharts__Group__2__Impl rule__GSSChartsCharts__Group__3 ;
    public final void rule__GSSChartsCharts__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:626:1: ( rule__GSSChartsCharts__Group__2__Impl rule__GSSChartsCharts__Group__3 )
            // InternalCHARTS.g:627:2: rule__GSSChartsCharts__Group__2__Impl rule__GSSChartsCharts__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSChartsCharts__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsCharts__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group__2"


    // $ANTLR start "rule__GSSChartsCharts__Group__2__Impl"
    // InternalCHARTS.g:634:1: rule__GSSChartsCharts__Group__2__Impl : ( '{' ) ;
    public final void rule__GSSChartsCharts__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:638:1: ( ( '{' ) )
            // InternalCHARTS.g:639:1: ( '{' )
            {
            // InternalCHARTS.g:639:1: ( '{' )
            // InternalCHARTS.g:640:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartsAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group__2__Impl"


    // $ANTLR start "rule__GSSChartsCharts__Group__3"
    // InternalCHARTS.g:649:1: rule__GSSChartsCharts__Group__3 : rule__GSSChartsCharts__Group__3__Impl rule__GSSChartsCharts__Group__4 ;
    public final void rule__GSSChartsCharts__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:653:1: ( rule__GSSChartsCharts__Group__3__Impl rule__GSSChartsCharts__Group__4 )
            // InternalCHARTS.g:654:2: rule__GSSChartsCharts__Group__3__Impl rule__GSSChartsCharts__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSChartsCharts__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsCharts__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group__3"


    // $ANTLR start "rule__GSSChartsCharts__Group__3__Impl"
    // InternalCHARTS.g:661:1: rule__GSSChartsCharts__Group__3__Impl : ( ( rule__GSSChartsCharts__UnorderedGroup_3 ) ) ;
    public final void rule__GSSChartsCharts__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:665:1: ( ( ( rule__GSSChartsCharts__UnorderedGroup_3 ) ) )
            // InternalCHARTS.g:666:1: ( ( rule__GSSChartsCharts__UnorderedGroup_3 ) )
            {
            // InternalCHARTS.g:666:1: ( ( rule__GSSChartsCharts__UnorderedGroup_3 ) )
            // InternalCHARTS.g:667:2: ( rule__GSSChartsCharts__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3()); 
            }
            // InternalCHARTS.g:668:2: ( rule__GSSChartsCharts__UnorderedGroup_3 )
            // InternalCHARTS.g:668:3: rule__GSSChartsCharts__UnorderedGroup_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsCharts__UnorderedGroup_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group__3__Impl"


    // $ANTLR start "rule__GSSChartsCharts__Group__4"
    // InternalCHARTS.g:676:1: rule__GSSChartsCharts__Group__4 : rule__GSSChartsCharts__Group__4__Impl rule__GSSChartsCharts__Group__5 ;
    public final void rule__GSSChartsCharts__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:680:1: ( rule__GSSChartsCharts__Group__4__Impl rule__GSSChartsCharts__Group__5 )
            // InternalCHARTS.g:681:2: rule__GSSChartsCharts__Group__4__Impl rule__GSSChartsCharts__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSChartsCharts__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsCharts__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group__4"


    // $ANTLR start "rule__GSSChartsCharts__Group__4__Impl"
    // InternalCHARTS.g:688:1: rule__GSSChartsCharts__Group__4__Impl : ( ( ( rule__GSSChartsCharts__ChartAssignment_4 ) ) ( ( rule__GSSChartsCharts__ChartAssignment_4 )* ) ) ;
    public final void rule__GSSChartsCharts__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:692:1: ( ( ( ( rule__GSSChartsCharts__ChartAssignment_4 ) ) ( ( rule__GSSChartsCharts__ChartAssignment_4 )* ) ) )
            // InternalCHARTS.g:693:1: ( ( ( rule__GSSChartsCharts__ChartAssignment_4 ) ) ( ( rule__GSSChartsCharts__ChartAssignment_4 )* ) )
            {
            // InternalCHARTS.g:693:1: ( ( ( rule__GSSChartsCharts__ChartAssignment_4 ) ) ( ( rule__GSSChartsCharts__ChartAssignment_4 )* ) )
            // InternalCHARTS.g:694:2: ( ( rule__GSSChartsCharts__ChartAssignment_4 ) ) ( ( rule__GSSChartsCharts__ChartAssignment_4 )* )
            {
            // InternalCHARTS.g:694:2: ( ( rule__GSSChartsCharts__ChartAssignment_4 ) )
            // InternalCHARTS.g:695:3: ( rule__GSSChartsCharts__ChartAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getChartAssignment_4()); 
            }
            // InternalCHARTS.g:696:3: ( rule__GSSChartsCharts__ChartAssignment_4 )
            // InternalCHARTS.g:696:4: rule__GSSChartsCharts__ChartAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__GSSChartsCharts__ChartAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartsAccess().getChartAssignment_4()); 
            }

            }

            // InternalCHARTS.g:699:2: ( ( rule__GSSChartsCharts__ChartAssignment_4 )* )
            // InternalCHARTS.g:700:3: ( rule__GSSChartsCharts__ChartAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getChartAssignment_4()); 
            }
            // InternalCHARTS.g:701:3: ( rule__GSSChartsCharts__ChartAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCHARTS.g:701:4: rule__GSSChartsCharts__ChartAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    rule__GSSChartsCharts__ChartAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartsAccess().getChartAssignment_4()); 
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
    // $ANTLR end "rule__GSSChartsCharts__Group__4__Impl"


    // $ANTLR start "rule__GSSChartsCharts__Group__5"
    // InternalCHARTS.g:710:1: rule__GSSChartsCharts__Group__5 : rule__GSSChartsCharts__Group__5__Impl rule__GSSChartsCharts__Group__6 ;
    public final void rule__GSSChartsCharts__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:714:1: ( rule__GSSChartsCharts__Group__5__Impl rule__GSSChartsCharts__Group__6 )
            // InternalCHARTS.g:715:2: rule__GSSChartsCharts__Group__5__Impl rule__GSSChartsCharts__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSChartsCharts__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsCharts__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group__5"


    // $ANTLR start "rule__GSSChartsCharts__Group__5__Impl"
    // InternalCHARTS.g:722:1: rule__GSSChartsCharts__Group__5__Impl : ( '}' ) ;
    public final void rule__GSSChartsCharts__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:726:1: ( ( '}' ) )
            // InternalCHARTS.g:727:1: ( '}' )
            {
            // InternalCHARTS.g:727:1: ( '}' )
            // InternalCHARTS.g:728:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartsAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group__5__Impl"


    // $ANTLR start "rule__GSSChartsCharts__Group__6"
    // InternalCHARTS.g:737:1: rule__GSSChartsCharts__Group__6 : rule__GSSChartsCharts__Group__6__Impl ;
    public final void rule__GSSChartsCharts__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:741:1: ( rule__GSSChartsCharts__Group__6__Impl )
            // InternalCHARTS.g:742:2: rule__GSSChartsCharts__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsCharts__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group__6"


    // $ANTLR start "rule__GSSChartsCharts__Group__6__Impl"
    // InternalCHARTS.g:748:1: rule__GSSChartsCharts__Group__6__Impl : ( ';' ) ;
    public final void rule__GSSChartsCharts__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:752:1: ( ( ';' ) )
            // InternalCHARTS.g:753:1: ( ';' )
            {
            // InternalCHARTS.g:753:1: ( ';' )
            // InternalCHARTS.g:754:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getSemicolonKeyword_6()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartsAccess().getSemicolonKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group__6__Impl"


    // $ANTLR start "rule__GSSChartsCharts__Group_3_0__0"
    // InternalCHARTS.g:764:1: rule__GSSChartsCharts__Group_3_0__0 : rule__GSSChartsCharts__Group_3_0__0__Impl rule__GSSChartsCharts__Group_3_0__1 ;
    public final void rule__GSSChartsCharts__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:768:1: ( rule__GSSChartsCharts__Group_3_0__0__Impl rule__GSSChartsCharts__Group_3_0__1 )
            // InternalCHARTS.g:769:2: rule__GSSChartsCharts__Group_3_0__0__Impl rule__GSSChartsCharts__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSChartsCharts__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsCharts__Group_3_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group_3_0__0"


    // $ANTLR start "rule__GSSChartsCharts__Group_3_0__0__Impl"
    // InternalCHARTS.g:776:1: rule__GSSChartsCharts__Group_3_0__0__Impl : ( 'uri' ) ;
    public final void rule__GSSChartsCharts__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:780:1: ( ( 'uri' ) )
            // InternalCHARTS.g:781:1: ( 'uri' )
            {
            // InternalCHARTS.g:781:1: ( 'uri' )
            // InternalCHARTS.g:782:2: 'uri'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getUriKeyword_3_0_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartsAccess().getUriKeyword_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group_3_0__0__Impl"


    // $ANTLR start "rule__GSSChartsCharts__Group_3_0__1"
    // InternalCHARTS.g:791:1: rule__GSSChartsCharts__Group_3_0__1 : rule__GSSChartsCharts__Group_3_0__1__Impl rule__GSSChartsCharts__Group_3_0__2 ;
    public final void rule__GSSChartsCharts__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:795:1: ( rule__GSSChartsCharts__Group_3_0__1__Impl rule__GSSChartsCharts__Group_3_0__2 )
            // InternalCHARTS.g:796:2: rule__GSSChartsCharts__Group_3_0__1__Impl rule__GSSChartsCharts__Group_3_0__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__GSSChartsCharts__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsCharts__Group_3_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group_3_0__1"


    // $ANTLR start "rule__GSSChartsCharts__Group_3_0__1__Impl"
    // InternalCHARTS.g:803:1: rule__GSSChartsCharts__Group_3_0__1__Impl : ( ':=' ) ;
    public final void rule__GSSChartsCharts__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:807:1: ( ( ':=' ) )
            // InternalCHARTS.g:808:1: ( ':=' )
            {
            // InternalCHARTS.g:808:1: ( ':=' )
            // InternalCHARTS.g:809:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getColonEqualsSignKeyword_3_0_1()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartsAccess().getColonEqualsSignKeyword_3_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group_3_0__1__Impl"


    // $ANTLR start "rule__GSSChartsCharts__Group_3_0__2"
    // InternalCHARTS.g:818:1: rule__GSSChartsCharts__Group_3_0__2 : rule__GSSChartsCharts__Group_3_0__2__Impl rule__GSSChartsCharts__Group_3_0__3 ;
    public final void rule__GSSChartsCharts__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:822:1: ( rule__GSSChartsCharts__Group_3_0__2__Impl rule__GSSChartsCharts__Group_3_0__3 )
            // InternalCHARTS.g:823:2: rule__GSSChartsCharts__Group_3_0__2__Impl rule__GSSChartsCharts__Group_3_0__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSChartsCharts__Group_3_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsCharts__Group_3_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group_3_0__2"


    // $ANTLR start "rule__GSSChartsCharts__Group_3_0__2__Impl"
    // InternalCHARTS.g:830:1: rule__GSSChartsCharts__Group_3_0__2__Impl : ( ( rule__GSSChartsCharts__UriAssignment_3_0_2 ) ) ;
    public final void rule__GSSChartsCharts__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:834:1: ( ( ( rule__GSSChartsCharts__UriAssignment_3_0_2 ) ) )
            // InternalCHARTS.g:835:1: ( ( rule__GSSChartsCharts__UriAssignment_3_0_2 ) )
            {
            // InternalCHARTS.g:835:1: ( ( rule__GSSChartsCharts__UriAssignment_3_0_2 ) )
            // InternalCHARTS.g:836:2: ( rule__GSSChartsCharts__UriAssignment_3_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getUriAssignment_3_0_2()); 
            }
            // InternalCHARTS.g:837:2: ( rule__GSSChartsCharts__UriAssignment_3_0_2 )
            // InternalCHARTS.g:837:3: rule__GSSChartsCharts__UriAssignment_3_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsCharts__UriAssignment_3_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartsAccess().getUriAssignment_3_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group_3_0__2__Impl"


    // $ANTLR start "rule__GSSChartsCharts__Group_3_0__3"
    // InternalCHARTS.g:845:1: rule__GSSChartsCharts__Group_3_0__3 : rule__GSSChartsCharts__Group_3_0__3__Impl ;
    public final void rule__GSSChartsCharts__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:849:1: ( rule__GSSChartsCharts__Group_3_0__3__Impl )
            // InternalCHARTS.g:850:2: rule__GSSChartsCharts__Group_3_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsCharts__Group_3_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group_3_0__3"


    // $ANTLR start "rule__GSSChartsCharts__Group_3_0__3__Impl"
    // InternalCHARTS.g:856:1: rule__GSSChartsCharts__Group_3_0__3__Impl : ( ';' ) ;
    public final void rule__GSSChartsCharts__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:860:1: ( ( ';' ) )
            // InternalCHARTS.g:861:1: ( ';' )
            {
            // InternalCHARTS.g:861:1: ( ';' )
            // InternalCHARTS.g:862:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getSemicolonKeyword_3_0_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartsAccess().getSemicolonKeyword_3_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group_3_0__3__Impl"


    // $ANTLR start "rule__GSSChartsCharts__Group_3_1__0"
    // InternalCHARTS.g:872:1: rule__GSSChartsCharts__Group_3_1__0 : rule__GSSChartsCharts__Group_3_1__0__Impl rule__GSSChartsCharts__Group_3_1__1 ;
    public final void rule__GSSChartsCharts__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:876:1: ( rule__GSSChartsCharts__Group_3_1__0__Impl rule__GSSChartsCharts__Group_3_1__1 )
            // InternalCHARTS.g:877:2: rule__GSSChartsCharts__Group_3_1__0__Impl rule__GSSChartsCharts__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSChartsCharts__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsCharts__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group_3_1__0"


    // $ANTLR start "rule__GSSChartsCharts__Group_3_1__0__Impl"
    // InternalCHARTS.g:884:1: rule__GSSChartsCharts__Group_3_1__0__Impl : ( 'version' ) ;
    public final void rule__GSSChartsCharts__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:888:1: ( ( 'version' ) )
            // InternalCHARTS.g:889:1: ( 'version' )
            {
            // InternalCHARTS.g:889:1: ( 'version' )
            // InternalCHARTS.g:890:2: 'version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getVersionKeyword_3_1_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartsAccess().getVersionKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group_3_1__0__Impl"


    // $ANTLR start "rule__GSSChartsCharts__Group_3_1__1"
    // InternalCHARTS.g:899:1: rule__GSSChartsCharts__Group_3_1__1 : rule__GSSChartsCharts__Group_3_1__1__Impl rule__GSSChartsCharts__Group_3_1__2 ;
    public final void rule__GSSChartsCharts__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:903:1: ( rule__GSSChartsCharts__Group_3_1__1__Impl rule__GSSChartsCharts__Group_3_1__2 )
            // InternalCHARTS.g:904:2: rule__GSSChartsCharts__Group_3_1__1__Impl rule__GSSChartsCharts__Group_3_1__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__GSSChartsCharts__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsCharts__Group_3_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group_3_1__1"


    // $ANTLR start "rule__GSSChartsCharts__Group_3_1__1__Impl"
    // InternalCHARTS.g:911:1: rule__GSSChartsCharts__Group_3_1__1__Impl : ( ':=' ) ;
    public final void rule__GSSChartsCharts__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:915:1: ( ( ':=' ) )
            // InternalCHARTS.g:916:1: ( ':=' )
            {
            // InternalCHARTS.g:916:1: ( ':=' )
            // InternalCHARTS.g:917:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getColonEqualsSignKeyword_3_1_1()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartsAccess().getColonEqualsSignKeyword_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group_3_1__1__Impl"


    // $ANTLR start "rule__GSSChartsCharts__Group_3_1__2"
    // InternalCHARTS.g:926:1: rule__GSSChartsCharts__Group_3_1__2 : rule__GSSChartsCharts__Group_3_1__2__Impl rule__GSSChartsCharts__Group_3_1__3 ;
    public final void rule__GSSChartsCharts__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:930:1: ( rule__GSSChartsCharts__Group_3_1__2__Impl rule__GSSChartsCharts__Group_3_1__3 )
            // InternalCHARTS.g:931:2: rule__GSSChartsCharts__Group_3_1__2__Impl rule__GSSChartsCharts__Group_3_1__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSChartsCharts__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsCharts__Group_3_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group_3_1__2"


    // $ANTLR start "rule__GSSChartsCharts__Group_3_1__2__Impl"
    // InternalCHARTS.g:938:1: rule__GSSChartsCharts__Group_3_1__2__Impl : ( ( rule__GSSChartsCharts__VersionAssignment_3_1_2 ) ) ;
    public final void rule__GSSChartsCharts__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:942:1: ( ( ( rule__GSSChartsCharts__VersionAssignment_3_1_2 ) ) )
            // InternalCHARTS.g:943:1: ( ( rule__GSSChartsCharts__VersionAssignment_3_1_2 ) )
            {
            // InternalCHARTS.g:943:1: ( ( rule__GSSChartsCharts__VersionAssignment_3_1_2 ) )
            // InternalCHARTS.g:944:2: ( rule__GSSChartsCharts__VersionAssignment_3_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getVersionAssignment_3_1_2()); 
            }
            // InternalCHARTS.g:945:2: ( rule__GSSChartsCharts__VersionAssignment_3_1_2 )
            // InternalCHARTS.g:945:3: rule__GSSChartsCharts__VersionAssignment_3_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsCharts__VersionAssignment_3_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartsAccess().getVersionAssignment_3_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group_3_1__2__Impl"


    // $ANTLR start "rule__GSSChartsCharts__Group_3_1__3"
    // InternalCHARTS.g:953:1: rule__GSSChartsCharts__Group_3_1__3 : rule__GSSChartsCharts__Group_3_1__3__Impl ;
    public final void rule__GSSChartsCharts__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:957:1: ( rule__GSSChartsCharts__Group_3_1__3__Impl )
            // InternalCHARTS.g:958:2: rule__GSSChartsCharts__Group_3_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsCharts__Group_3_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group_3_1__3"


    // $ANTLR start "rule__GSSChartsCharts__Group_3_1__3__Impl"
    // InternalCHARTS.g:964:1: rule__GSSChartsCharts__Group_3_1__3__Impl : ( ';' ) ;
    public final void rule__GSSChartsCharts__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:968:1: ( ( ';' ) )
            // InternalCHARTS.g:969:1: ( ';' )
            {
            // InternalCHARTS.g:969:1: ( ';' )
            // InternalCHARTS.g:970:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getSemicolonKeyword_3_1_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartsAccess().getSemicolonKeyword_3_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__Group_3_1__3__Impl"


    // $ANTLR start "rule__GSSChartsChart__Group__0"
    // InternalCHARTS.g:980:1: rule__GSSChartsChart__Group__0 : rule__GSSChartsChart__Group__0__Impl rule__GSSChartsChart__Group__1 ;
    public final void rule__GSSChartsChart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:984:1: ( rule__GSSChartsChart__Group__0__Impl rule__GSSChartsChart__Group__1 )
            // InternalCHARTS.g:985:2: rule__GSSChartsChart__Group__0__Impl rule__GSSChartsChart__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSChartsChart__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsChart__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__0"


    // $ANTLR start "rule__GSSChartsChart__Group__0__Impl"
    // InternalCHARTS.g:992:1: rule__GSSChartsChart__Group__0__Impl : ( 'GSSChartsChart' ) ;
    public final void rule__GSSChartsChart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:996:1: ( ( 'GSSChartsChart' ) )
            // InternalCHARTS.g:997:1: ( 'GSSChartsChart' )
            {
            // InternalCHARTS.g:997:1: ( 'GSSChartsChart' )
            // InternalCHARTS.g:998:2: 'GSSChartsChart'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getGSSChartsChartKeyword_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartAccess().getGSSChartsChartKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__0__Impl"


    // $ANTLR start "rule__GSSChartsChart__Group__1"
    // InternalCHARTS.g:1007:1: rule__GSSChartsChart__Group__1 : rule__GSSChartsChart__Group__1__Impl rule__GSSChartsChart__Group__2 ;
    public final void rule__GSSChartsChart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1011:1: ( rule__GSSChartsChart__Group__1__Impl rule__GSSChartsChart__Group__2 )
            // InternalCHARTS.g:1012:2: rule__GSSChartsChart__Group__1__Impl rule__GSSChartsChart__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__GSSChartsChart__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsChart__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__1"


    // $ANTLR start "rule__GSSChartsChart__Group__1__Impl"
    // InternalCHARTS.g:1019:1: rule__GSSChartsChart__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSChartsChart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1023:1: ( ( '{' ) )
            // InternalCHARTS.g:1024:1: ( '{' )
            {
            // InternalCHARTS.g:1024:1: ( '{' )
            // InternalCHARTS.g:1025:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__1__Impl"


    // $ANTLR start "rule__GSSChartsChart__Group__2"
    // InternalCHARTS.g:1034:1: rule__GSSChartsChart__Group__2 : rule__GSSChartsChart__Group__2__Impl rule__GSSChartsChart__Group__3 ;
    public final void rule__GSSChartsChart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1038:1: ( rule__GSSChartsChart__Group__2__Impl rule__GSSChartsChart__Group__3 )
            // InternalCHARTS.g:1039:2: rule__GSSChartsChart__Group__2__Impl rule__GSSChartsChart__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSChartsChart__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsChart__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__2"


    // $ANTLR start "rule__GSSChartsChart__Group__2__Impl"
    // InternalCHARTS.g:1046:1: rule__GSSChartsChart__Group__2__Impl : ( 'id' ) ;
    public final void rule__GSSChartsChart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1050:1: ( ( 'id' ) )
            // InternalCHARTS.g:1051:1: ( 'id' )
            {
            // InternalCHARTS.g:1051:1: ( 'id' )
            // InternalCHARTS.g:1052:2: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getIdKeyword_2()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartAccess().getIdKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__2__Impl"


    // $ANTLR start "rule__GSSChartsChart__Group__3"
    // InternalCHARTS.g:1061:1: rule__GSSChartsChart__Group__3 : rule__GSSChartsChart__Group__3__Impl rule__GSSChartsChart__Group__4 ;
    public final void rule__GSSChartsChart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1065:1: ( rule__GSSChartsChart__Group__3__Impl rule__GSSChartsChart__Group__4 )
            // InternalCHARTS.g:1066:2: rule__GSSChartsChart__Group__3__Impl rule__GSSChartsChart__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSChartsChart__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsChart__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__3"


    // $ANTLR start "rule__GSSChartsChart__Group__3__Impl"
    // InternalCHARTS.g:1073:1: rule__GSSChartsChart__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSChartsChart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1077:1: ( ( ':=' ) )
            // InternalCHARTS.g:1078:1: ( ':=' )
            {
            // InternalCHARTS.g:1078:1: ( ':=' )
            // InternalCHARTS.g:1079:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__3__Impl"


    // $ANTLR start "rule__GSSChartsChart__Group__4"
    // InternalCHARTS.g:1088:1: rule__GSSChartsChart__Group__4 : rule__GSSChartsChart__Group__4__Impl rule__GSSChartsChart__Group__5 ;
    public final void rule__GSSChartsChart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1092:1: ( rule__GSSChartsChart__Group__4__Impl rule__GSSChartsChart__Group__5 )
            // InternalCHARTS.g:1093:2: rule__GSSChartsChart__Group__4__Impl rule__GSSChartsChart__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSChartsChart__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsChart__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__4"


    // $ANTLR start "rule__GSSChartsChart__Group__4__Impl"
    // InternalCHARTS.g:1100:1: rule__GSSChartsChart__Group__4__Impl : ( ( rule__GSSChartsChart__IdAssignment_4 ) ) ;
    public final void rule__GSSChartsChart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1104:1: ( ( ( rule__GSSChartsChart__IdAssignment_4 ) ) )
            // InternalCHARTS.g:1105:1: ( ( rule__GSSChartsChart__IdAssignment_4 ) )
            {
            // InternalCHARTS.g:1105:1: ( ( rule__GSSChartsChart__IdAssignment_4 ) )
            // InternalCHARTS.g:1106:2: ( rule__GSSChartsChart__IdAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getIdAssignment_4()); 
            }
            // InternalCHARTS.g:1107:2: ( rule__GSSChartsChart__IdAssignment_4 )
            // InternalCHARTS.g:1107:3: rule__GSSChartsChart__IdAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsChart__IdAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartAccess().getIdAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__4__Impl"


    // $ANTLR start "rule__GSSChartsChart__Group__5"
    // InternalCHARTS.g:1115:1: rule__GSSChartsChart__Group__5 : rule__GSSChartsChart__Group__5__Impl rule__GSSChartsChart__Group__6 ;
    public final void rule__GSSChartsChart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1119:1: ( rule__GSSChartsChart__Group__5__Impl rule__GSSChartsChart__Group__6 )
            // InternalCHARTS.g:1120:2: rule__GSSChartsChart__Group__5__Impl rule__GSSChartsChart__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__GSSChartsChart__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsChart__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__5"


    // $ANTLR start "rule__GSSChartsChart__Group__5__Impl"
    // InternalCHARTS.g:1127:1: rule__GSSChartsChart__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSChartsChart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1131:1: ( ( ';' ) )
            // InternalCHARTS.g:1132:1: ( ';' )
            {
            // InternalCHARTS.g:1132:1: ( ';' )
            // InternalCHARTS.g:1133:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getSemicolonKeyword_5()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__5__Impl"


    // $ANTLR start "rule__GSSChartsChart__Group__6"
    // InternalCHARTS.g:1142:1: rule__GSSChartsChart__Group__6 : rule__GSSChartsChart__Group__6__Impl rule__GSSChartsChart__Group__7 ;
    public final void rule__GSSChartsChart__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1146:1: ( rule__GSSChartsChart__Group__6__Impl rule__GSSChartsChart__Group__7 )
            // InternalCHARTS.g:1147:2: rule__GSSChartsChart__Group__6__Impl rule__GSSChartsChart__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSChartsChart__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsChart__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__6"


    // $ANTLR start "rule__GSSChartsChart__Group__6__Impl"
    // InternalCHARTS.g:1154:1: rule__GSSChartsChart__Group__6__Impl : ( 'name' ) ;
    public final void rule__GSSChartsChart__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1158:1: ( ( 'name' ) )
            // InternalCHARTS.g:1159:1: ( 'name' )
            {
            // InternalCHARTS.g:1159:1: ( 'name' )
            // InternalCHARTS.g:1160:2: 'name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getNameKeyword_6()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartAccess().getNameKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__6__Impl"


    // $ANTLR start "rule__GSSChartsChart__Group__7"
    // InternalCHARTS.g:1169:1: rule__GSSChartsChart__Group__7 : rule__GSSChartsChart__Group__7__Impl rule__GSSChartsChart__Group__8 ;
    public final void rule__GSSChartsChart__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1173:1: ( rule__GSSChartsChart__Group__7__Impl rule__GSSChartsChart__Group__8 )
            // InternalCHARTS.g:1174:2: rule__GSSChartsChart__Group__7__Impl rule__GSSChartsChart__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__GSSChartsChart__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsChart__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__7"


    // $ANTLR start "rule__GSSChartsChart__Group__7__Impl"
    // InternalCHARTS.g:1181:1: rule__GSSChartsChart__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSChartsChart__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1185:1: ( ( ':=' ) )
            // InternalCHARTS.g:1186:1: ( ':=' )
            {
            // InternalCHARTS.g:1186:1: ( ':=' )
            // InternalCHARTS.g:1187:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__7__Impl"


    // $ANTLR start "rule__GSSChartsChart__Group__8"
    // InternalCHARTS.g:1196:1: rule__GSSChartsChart__Group__8 : rule__GSSChartsChart__Group__8__Impl rule__GSSChartsChart__Group__9 ;
    public final void rule__GSSChartsChart__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1200:1: ( rule__GSSChartsChart__Group__8__Impl rule__GSSChartsChart__Group__9 )
            // InternalCHARTS.g:1201:2: rule__GSSChartsChart__Group__8__Impl rule__GSSChartsChart__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSChartsChart__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsChart__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__8"


    // $ANTLR start "rule__GSSChartsChart__Group__8__Impl"
    // InternalCHARTS.g:1208:1: rule__GSSChartsChart__Group__8__Impl : ( ( rule__GSSChartsChart__NameAssignment_8 ) ) ;
    public final void rule__GSSChartsChart__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1212:1: ( ( ( rule__GSSChartsChart__NameAssignment_8 ) ) )
            // InternalCHARTS.g:1213:1: ( ( rule__GSSChartsChart__NameAssignment_8 ) )
            {
            // InternalCHARTS.g:1213:1: ( ( rule__GSSChartsChart__NameAssignment_8 ) )
            // InternalCHARTS.g:1214:2: ( rule__GSSChartsChart__NameAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getNameAssignment_8()); 
            }
            // InternalCHARTS.g:1215:2: ( rule__GSSChartsChart__NameAssignment_8 )
            // InternalCHARTS.g:1215:3: rule__GSSChartsChart__NameAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsChart__NameAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartAccess().getNameAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__8__Impl"


    // $ANTLR start "rule__GSSChartsChart__Group__9"
    // InternalCHARTS.g:1223:1: rule__GSSChartsChart__Group__9 : rule__GSSChartsChart__Group__9__Impl rule__GSSChartsChart__Group__10 ;
    public final void rule__GSSChartsChart__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1227:1: ( rule__GSSChartsChart__Group__9__Impl rule__GSSChartsChart__Group__10 )
            // InternalCHARTS.g:1228:2: rule__GSSChartsChart__Group__9__Impl rule__GSSChartsChart__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__GSSChartsChart__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsChart__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__9"


    // $ANTLR start "rule__GSSChartsChart__Group__9__Impl"
    // InternalCHARTS.g:1235:1: rule__GSSChartsChart__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSChartsChart__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1239:1: ( ( ';' ) )
            // InternalCHARTS.g:1240:1: ( ';' )
            {
            // InternalCHARTS.g:1240:1: ( ';' )
            // InternalCHARTS.g:1241:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getSemicolonKeyword_9()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__9__Impl"


    // $ANTLR start "rule__GSSChartsChart__Group__10"
    // InternalCHARTS.g:1250:1: rule__GSSChartsChart__Group__10 : rule__GSSChartsChart__Group__10__Impl rule__GSSChartsChart__Group__11 ;
    public final void rule__GSSChartsChart__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1254:1: ( rule__GSSChartsChart__Group__10__Impl rule__GSSChartsChart__Group__11 )
            // InternalCHARTS.g:1255:2: rule__GSSChartsChart__Group__10__Impl rule__GSSChartsChart__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSChartsChart__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsChart__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__10"


    // $ANTLR start "rule__GSSChartsChart__Group__10__Impl"
    // InternalCHARTS.g:1262:1: rule__GSSChartsChart__Group__10__Impl : ( 'y_units' ) ;
    public final void rule__GSSChartsChart__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1266:1: ( ( 'y_units' ) )
            // InternalCHARTS.g:1267:1: ( 'y_units' )
            {
            // InternalCHARTS.g:1267:1: ( 'y_units' )
            // InternalCHARTS.g:1268:2: 'y_units'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getY_unitsKeyword_10()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartAccess().getY_unitsKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__10__Impl"


    // $ANTLR start "rule__GSSChartsChart__Group__11"
    // InternalCHARTS.g:1277:1: rule__GSSChartsChart__Group__11 : rule__GSSChartsChart__Group__11__Impl rule__GSSChartsChart__Group__12 ;
    public final void rule__GSSChartsChart__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1281:1: ( rule__GSSChartsChart__Group__11__Impl rule__GSSChartsChart__Group__12 )
            // InternalCHARTS.g:1282:2: rule__GSSChartsChart__Group__11__Impl rule__GSSChartsChart__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__GSSChartsChart__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsChart__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__11"


    // $ANTLR start "rule__GSSChartsChart__Group__11__Impl"
    // InternalCHARTS.g:1289:1: rule__GSSChartsChart__Group__11__Impl : ( ':=' ) ;
    public final void rule__GSSChartsChart__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1293:1: ( ( ':=' ) )
            // InternalCHARTS.g:1294:1: ( ':=' )
            {
            // InternalCHARTS.g:1294:1: ( ':=' )
            // InternalCHARTS.g:1295:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getColonEqualsSignKeyword_11()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartAccess().getColonEqualsSignKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__11__Impl"


    // $ANTLR start "rule__GSSChartsChart__Group__12"
    // InternalCHARTS.g:1304:1: rule__GSSChartsChart__Group__12 : rule__GSSChartsChart__Group__12__Impl rule__GSSChartsChart__Group__13 ;
    public final void rule__GSSChartsChart__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1308:1: ( rule__GSSChartsChart__Group__12__Impl rule__GSSChartsChart__Group__13 )
            // InternalCHARTS.g:1309:2: rule__GSSChartsChart__Group__12__Impl rule__GSSChartsChart__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSChartsChart__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsChart__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__12"


    // $ANTLR start "rule__GSSChartsChart__Group__12__Impl"
    // InternalCHARTS.g:1316:1: rule__GSSChartsChart__Group__12__Impl : ( ( rule__GSSChartsChart__Y_unitsAssignment_12 ) ) ;
    public final void rule__GSSChartsChart__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1320:1: ( ( ( rule__GSSChartsChart__Y_unitsAssignment_12 ) ) )
            // InternalCHARTS.g:1321:1: ( ( rule__GSSChartsChart__Y_unitsAssignment_12 ) )
            {
            // InternalCHARTS.g:1321:1: ( ( rule__GSSChartsChart__Y_unitsAssignment_12 ) )
            // InternalCHARTS.g:1322:2: ( rule__GSSChartsChart__Y_unitsAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getY_unitsAssignment_12()); 
            }
            // InternalCHARTS.g:1323:2: ( rule__GSSChartsChart__Y_unitsAssignment_12 )
            // InternalCHARTS.g:1323:3: rule__GSSChartsChart__Y_unitsAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsChart__Y_unitsAssignment_12();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartAccess().getY_unitsAssignment_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__12__Impl"


    // $ANTLR start "rule__GSSChartsChart__Group__13"
    // InternalCHARTS.g:1331:1: rule__GSSChartsChart__Group__13 : rule__GSSChartsChart__Group__13__Impl rule__GSSChartsChart__Group__14 ;
    public final void rule__GSSChartsChart__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1335:1: ( rule__GSSChartsChart__Group__13__Impl rule__GSSChartsChart__Group__14 )
            // InternalCHARTS.g:1336:2: rule__GSSChartsChart__Group__13__Impl rule__GSSChartsChart__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__GSSChartsChart__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsChart__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__13"


    // $ANTLR start "rule__GSSChartsChart__Group__13__Impl"
    // InternalCHARTS.g:1343:1: rule__GSSChartsChart__Group__13__Impl : ( ';' ) ;
    public final void rule__GSSChartsChart__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1347:1: ( ( ';' ) )
            // InternalCHARTS.g:1348:1: ( ';' )
            {
            // InternalCHARTS.g:1348:1: ( ';' )
            // InternalCHARTS.g:1349:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getSemicolonKeyword_13()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartAccess().getSemicolonKeyword_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__13__Impl"


    // $ANTLR start "rule__GSSChartsChart__Group__14"
    // InternalCHARTS.g:1358:1: rule__GSSChartsChart__Group__14 : rule__GSSChartsChart__Group__14__Impl rule__GSSChartsChart__Group__15 ;
    public final void rule__GSSChartsChart__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1362:1: ( rule__GSSChartsChart__Group__14__Impl rule__GSSChartsChart__Group__15 )
            // InternalCHARTS.g:1363:2: rule__GSSChartsChart__Group__14__Impl rule__GSSChartsChart__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSChartsChart__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsChart__Group__15();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__14"


    // $ANTLR start "rule__GSSChartsChart__Group__14__Impl"
    // InternalCHARTS.g:1370:1: rule__GSSChartsChart__Group__14__Impl : ( 'y_max' ) ;
    public final void rule__GSSChartsChart__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1374:1: ( ( 'y_max' ) )
            // InternalCHARTS.g:1375:1: ( 'y_max' )
            {
            // InternalCHARTS.g:1375:1: ( 'y_max' )
            // InternalCHARTS.g:1376:2: 'y_max'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getY_maxKeyword_14()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartAccess().getY_maxKeyword_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__14__Impl"


    // $ANTLR start "rule__GSSChartsChart__Group__15"
    // InternalCHARTS.g:1385:1: rule__GSSChartsChart__Group__15 : rule__GSSChartsChart__Group__15__Impl rule__GSSChartsChart__Group__16 ;
    public final void rule__GSSChartsChart__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1389:1: ( rule__GSSChartsChart__Group__15__Impl rule__GSSChartsChart__Group__16 )
            // InternalCHARTS.g:1390:2: rule__GSSChartsChart__Group__15__Impl rule__GSSChartsChart__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSChartsChart__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsChart__Group__16();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__15"


    // $ANTLR start "rule__GSSChartsChart__Group__15__Impl"
    // InternalCHARTS.g:1397:1: rule__GSSChartsChart__Group__15__Impl : ( ':=' ) ;
    public final void rule__GSSChartsChart__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1401:1: ( ( ':=' ) )
            // InternalCHARTS.g:1402:1: ( ':=' )
            {
            // InternalCHARTS.g:1402:1: ( ':=' )
            // InternalCHARTS.g:1403:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getColonEqualsSignKeyword_15()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartAccess().getColonEqualsSignKeyword_15()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__15__Impl"


    // $ANTLR start "rule__GSSChartsChart__Group__16"
    // InternalCHARTS.g:1412:1: rule__GSSChartsChart__Group__16 : rule__GSSChartsChart__Group__16__Impl rule__GSSChartsChart__Group__17 ;
    public final void rule__GSSChartsChart__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1416:1: ( rule__GSSChartsChart__Group__16__Impl rule__GSSChartsChart__Group__17 )
            // InternalCHARTS.g:1417:2: rule__GSSChartsChart__Group__16__Impl rule__GSSChartsChart__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSChartsChart__Group__16__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsChart__Group__17();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__16"


    // $ANTLR start "rule__GSSChartsChart__Group__16__Impl"
    // InternalCHARTS.g:1424:1: rule__GSSChartsChart__Group__16__Impl : ( ( rule__GSSChartsChart__Y_maxAssignment_16 ) ) ;
    public final void rule__GSSChartsChart__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1428:1: ( ( ( rule__GSSChartsChart__Y_maxAssignment_16 ) ) )
            // InternalCHARTS.g:1429:1: ( ( rule__GSSChartsChart__Y_maxAssignment_16 ) )
            {
            // InternalCHARTS.g:1429:1: ( ( rule__GSSChartsChart__Y_maxAssignment_16 ) )
            // InternalCHARTS.g:1430:2: ( rule__GSSChartsChart__Y_maxAssignment_16 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getY_maxAssignment_16()); 
            }
            // InternalCHARTS.g:1431:2: ( rule__GSSChartsChart__Y_maxAssignment_16 )
            // InternalCHARTS.g:1431:3: rule__GSSChartsChart__Y_maxAssignment_16
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsChart__Y_maxAssignment_16();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartAccess().getY_maxAssignment_16()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__16__Impl"


    // $ANTLR start "rule__GSSChartsChart__Group__17"
    // InternalCHARTS.g:1439:1: rule__GSSChartsChart__Group__17 : rule__GSSChartsChart__Group__17__Impl rule__GSSChartsChart__Group__18 ;
    public final void rule__GSSChartsChart__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1443:1: ( rule__GSSChartsChart__Group__17__Impl rule__GSSChartsChart__Group__18 )
            // InternalCHARTS.g:1444:2: rule__GSSChartsChart__Group__17__Impl rule__GSSChartsChart__Group__18
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSChartsChart__Group__17__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsChart__Group__18();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__17"


    // $ANTLR start "rule__GSSChartsChart__Group__17__Impl"
    // InternalCHARTS.g:1451:1: rule__GSSChartsChart__Group__17__Impl : ( ';' ) ;
    public final void rule__GSSChartsChart__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1455:1: ( ( ';' ) )
            // InternalCHARTS.g:1456:1: ( ';' )
            {
            // InternalCHARTS.g:1456:1: ( ';' )
            // InternalCHARTS.g:1457:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getSemicolonKeyword_17()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartAccess().getSemicolonKeyword_17()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__17__Impl"


    // $ANTLR start "rule__GSSChartsChart__Group__18"
    // InternalCHARTS.g:1466:1: rule__GSSChartsChart__Group__18 : rule__GSSChartsChart__Group__18__Impl rule__GSSChartsChart__Group__19 ;
    public final void rule__GSSChartsChart__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1470:1: ( rule__GSSChartsChart__Group__18__Impl rule__GSSChartsChart__Group__19 )
            // InternalCHARTS.g:1471:2: rule__GSSChartsChart__Group__18__Impl rule__GSSChartsChart__Group__19
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSChartsChart__Group__18__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsChart__Group__19();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__18"


    // $ANTLR start "rule__GSSChartsChart__Group__18__Impl"
    // InternalCHARTS.g:1478:1: rule__GSSChartsChart__Group__18__Impl : ( '}' ) ;
    public final void rule__GSSChartsChart__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1482:1: ( ( '}' ) )
            // InternalCHARTS.g:1483:1: ( '}' )
            {
            // InternalCHARTS.g:1483:1: ( '}' )
            // InternalCHARTS.g:1484:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getRightCurlyBracketKeyword_18()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartAccess().getRightCurlyBracketKeyword_18()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__18__Impl"


    // $ANTLR start "rule__GSSChartsChart__Group__19"
    // InternalCHARTS.g:1493:1: rule__GSSChartsChart__Group__19 : rule__GSSChartsChart__Group__19__Impl ;
    public final void rule__GSSChartsChart__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1497:1: ( rule__GSSChartsChart__Group__19__Impl )
            // InternalCHARTS.g:1498:2: rule__GSSChartsChart__Group__19__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsChart__Group__19__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__19"


    // $ANTLR start "rule__GSSChartsChart__Group__19__Impl"
    // InternalCHARTS.g:1504:1: rule__GSSChartsChart__Group__19__Impl : ( ';' ) ;
    public final void rule__GSSChartsChart__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1508:1: ( ( ';' ) )
            // InternalCHARTS.g:1509:1: ( ';' )
            {
            // InternalCHARTS.g:1509:1: ( ';' )
            // InternalCHARTS.g:1510:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getSemicolonKeyword_19()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartAccess().getSemicolonKeyword_19()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Group__19__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalCHARTS.g:1520:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1524:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalCHARTS.g:1525:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalCHARTS.g:1532:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1536:1: ( ( RULE_ID ) )
            // InternalCHARTS.g:1537:1: ( RULE_ID )
            {
            // InternalCHARTS.g:1537:1: ( RULE_ID )
            // InternalCHARTS.g:1538:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalCHARTS.g:1547:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1551:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalCHARTS.g:1552:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalCHARTS.g:1558:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1562:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalCHARTS.g:1563:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalCHARTS.g:1563:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalCHARTS.g:1564:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalCHARTS.g:1565:2: ( rule__QualifiedName__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCHARTS.g:1565:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalCHARTS.g:1574:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1578:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalCHARTS.g:1579:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalCHARTS.g:1586:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1590:1: ( ( '.' ) )
            // InternalCHARTS.g:1591:1: ( '.' )
            {
            // InternalCHARTS.g:1591:1: ( '.' )
            // InternalCHARTS.g:1592:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalCHARTS.g:1601:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1605:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalCHARTS.g:1606:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalCHARTS.g:1612:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1616:1: ( ( RULE_ID ) )
            // InternalCHARTS.g:1617:1: ( RULE_ID )
            {
            // InternalCHARTS.g:1617:1: ( RULE_ID )
            // InternalCHARTS.g:1618:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Version__Group__0"
    // InternalCHARTS.g:1628:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1632:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalCHARTS.g:1633:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__Version__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Version__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__0"


    // $ANTLR start "rule__Version__Group__0__Impl"
    // InternalCHARTS.g:1640:1: rule__Version__Group__0__Impl : ( ( rule__Version__Alternatives_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1644:1: ( ( ( rule__Version__Alternatives_0 ) ) )
            // InternalCHARTS.g:1645:1: ( ( rule__Version__Alternatives_0 ) )
            {
            // InternalCHARTS.g:1645:1: ( ( rule__Version__Alternatives_0 ) )
            // InternalCHARTS.g:1646:2: ( rule__Version__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_0()); 
            }
            // InternalCHARTS.g:1647:2: ( rule__Version__Alternatives_0 )
            // InternalCHARTS.g:1647:3: rule__Version__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Version__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__0__Impl"


    // $ANTLR start "rule__Version__Group__1"
    // InternalCHARTS.g:1655:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1659:1: ( rule__Version__Group__1__Impl )
            // InternalCHARTS.g:1660:2: rule__Version__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Version__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__1"


    // $ANTLR start "rule__Version__Group__1__Impl"
    // InternalCHARTS.g:1666:1: rule__Version__Group__1__Impl : ( ( rule__Version__Group_1__0 )* ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1670:1: ( ( ( rule__Version__Group_1__0 )* ) )
            // InternalCHARTS.g:1671:1: ( ( rule__Version__Group_1__0 )* )
            {
            // InternalCHARTS.g:1671:1: ( ( rule__Version__Group_1__0 )* )
            // InternalCHARTS.g:1672:2: ( rule__Version__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1()); 
            }
            // InternalCHARTS.g:1673:2: ( rule__Version__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCHARTS.g:1673:3: rule__Version__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    rule__Version__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__1__Impl"


    // $ANTLR start "rule__Version__Group_0_1__0"
    // InternalCHARTS.g:1682:1: rule__Version__Group_0_1__0 : rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 ;
    public final void rule__Version__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1686:1: ( rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 )
            // InternalCHARTS.g:1687:2: rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__Version__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Version__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_0_1__0"


    // $ANTLR start "rule__Version__Group_0_1__0__Impl"
    // InternalCHARTS.g:1694:1: rule__Version__Group_0_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1698:1: ( ( ( RULE_INT )? ) )
            // InternalCHARTS.g:1699:1: ( ( RULE_INT )? )
            {
            // InternalCHARTS.g:1699:1: ( ( RULE_INT )? )
            // InternalCHARTS.g:1700:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
            }
            // InternalCHARTS.g:1701:2: ( RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCHARTS.g:1701:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_0_1__0__Impl"


    // $ANTLR start "rule__Version__Group_0_1__1"
    // InternalCHARTS.g:1709:1: rule__Version__Group_0_1__1 : rule__Version__Group_0_1__1__Impl ;
    public final void rule__Version__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1713:1: ( rule__Version__Group_0_1__1__Impl )
            // InternalCHARTS.g:1714:2: rule__Version__Group_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Version__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_0_1__1"


    // $ANTLR start "rule__Version__Group_0_1__1__Impl"
    // InternalCHARTS.g:1720:1: rule__Version__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1724:1: ( ( RULE_ID ) )
            // InternalCHARTS.g:1725:1: ( RULE_ID )
            {
            // InternalCHARTS.g:1725:1: ( RULE_ID )
            // InternalCHARTS.g:1726:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getIDTerminalRuleCall_0_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getIDTerminalRuleCall_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_0_1__1__Impl"


    // $ANTLR start "rule__Version__Group_1__0"
    // InternalCHARTS.g:1736:1: rule__Version__Group_1__0 : rule__Version__Group_1__0__Impl rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1740:1: ( rule__Version__Group_1__0__Impl rule__Version__Group_1__1 )
            // InternalCHARTS.g:1741:2: rule__Version__Group_1__0__Impl rule__Version__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__Version__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Version__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_1__0"


    // $ANTLR start "rule__Version__Group_1__0__Impl"
    // InternalCHARTS.g:1748:1: rule__Version__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1752:1: ( ( '.' ) )
            // InternalCHARTS.g:1753:1: ( '.' )
            {
            // InternalCHARTS.g:1753:1: ( '.' )
            // InternalCHARTS.g:1754:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_1__0__Impl"


    // $ANTLR start "rule__Version__Group_1__1"
    // InternalCHARTS.g:1763:1: rule__Version__Group_1__1 : rule__Version__Group_1__1__Impl ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1767:1: ( rule__Version__Group_1__1__Impl )
            // InternalCHARTS.g:1768:2: rule__Version__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Version__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_1__1"


    // $ANTLR start "rule__Version__Group_1__1__Impl"
    // InternalCHARTS.g:1774:1: rule__Version__Group_1__1__Impl : ( ( rule__Version__Alternatives_1_1 ) ) ;
    public final void rule__Version__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1778:1: ( ( ( rule__Version__Alternatives_1_1 ) ) )
            // InternalCHARTS.g:1779:1: ( ( rule__Version__Alternatives_1_1 ) )
            {
            // InternalCHARTS.g:1779:1: ( ( rule__Version__Alternatives_1_1 ) )
            // InternalCHARTS.g:1780:2: ( rule__Version__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_1_1()); 
            }
            // InternalCHARTS.g:1781:2: ( rule__Version__Alternatives_1_1 )
            // InternalCHARTS.g:1781:3: rule__Version__Alternatives_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Version__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getAlternatives_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_1__1__Impl"


    // $ANTLR start "rule__Version__Group_1_1_1__0"
    // InternalCHARTS.g:1790:1: rule__Version__Group_1_1_1__0 : rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 ;
    public final void rule__Version__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1794:1: ( rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 )
            // InternalCHARTS.g:1795:2: rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__Version__Group_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Version__Group_1_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_1_1_1__0"


    // $ANTLR start "rule__Version__Group_1_1_1__0__Impl"
    // InternalCHARTS.g:1802:1: rule__Version__Group_1_1_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1806:1: ( ( ( RULE_INT )? ) )
            // InternalCHARTS.g:1807:1: ( ( RULE_INT )? )
            {
            // InternalCHARTS.g:1807:1: ( ( RULE_INT )? )
            // InternalCHARTS.g:1808:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
            }
            // InternalCHARTS.g:1809:2: ( RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCHARTS.g:1809:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__Version__Group_1_1_1__1"
    // InternalCHARTS.g:1817:1: rule__Version__Group_1_1_1__1 : rule__Version__Group_1_1_1__1__Impl ;
    public final void rule__Version__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1821:1: ( rule__Version__Group_1_1_1__1__Impl )
            // InternalCHARTS.g:1822:2: rule__Version__Group_1_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Version__Group_1_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_1_1_1__1"


    // $ANTLR start "rule__Version__Group_1_1_1__1__Impl"
    // InternalCHARTS.g:1828:1: rule__Version__Group_1_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1832:1: ( ( RULE_ID ) )
            // InternalCHARTS.g:1833:1: ( RULE_ID )
            {
            // InternalCHARTS.g:1833:1: ( RULE_ID )
            // InternalCHARTS.g:1834:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_1_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__VersionedQualifiedName__Group__0"
    // InternalCHARTS.g:1844:1: rule__VersionedQualifiedName__Group__0 : rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 ;
    public final void rule__VersionedQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1848:1: ( rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 )
            // InternalCHARTS.g:1849:2: rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__VersionedQualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VersionedQualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedName__Group__0"


    // $ANTLR start "rule__VersionedQualifiedName__Group__0__Impl"
    // InternalCHARTS.g:1856:1: rule__VersionedQualifiedName__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__VersionedQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1860:1: ( ( ruleQualifiedName ) )
            // InternalCHARTS.g:1861:1: ( ruleQualifiedName )
            {
            // InternalCHARTS.g:1861:1: ( ruleQualifiedName )
            // InternalCHARTS.g:1862:2: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedName__Group__0__Impl"


    // $ANTLR start "rule__VersionedQualifiedName__Group__1"
    // InternalCHARTS.g:1871:1: rule__VersionedQualifiedName__Group__1 : rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 ;
    public final void rule__VersionedQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1875:1: ( rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 )
            // InternalCHARTS.g:1876:2: rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__VersionedQualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VersionedQualifiedName__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedName__Group__1"


    // $ANTLR start "rule__VersionedQualifiedName__Group__1__Impl"
    // InternalCHARTS.g:1883:1: rule__VersionedQualifiedName__Group__1__Impl : ( '(' ) ;
    public final void rule__VersionedQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1887:1: ( ( '(' ) )
            // InternalCHARTS.g:1888:1: ( '(' )
            {
            // InternalCHARTS.g:1888:1: ( '(' )
            // InternalCHARTS.g:1889:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedName__Group__1__Impl"


    // $ANTLR start "rule__VersionedQualifiedName__Group__2"
    // InternalCHARTS.g:1898:1: rule__VersionedQualifiedName__Group__2 : rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 ;
    public final void rule__VersionedQualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1902:1: ( rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 )
            // InternalCHARTS.g:1903:2: rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__VersionedQualifiedName__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VersionedQualifiedName__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedName__Group__2"


    // $ANTLR start "rule__VersionedQualifiedName__Group__2__Impl"
    // InternalCHARTS.g:1910:1: rule__VersionedQualifiedName__Group__2__Impl : ( ruleVersion ) ;
    public final void rule__VersionedQualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1914:1: ( ( ruleVersion ) )
            // InternalCHARTS.g:1915:1: ( ruleVersion )
            {
            // InternalCHARTS.g:1915:1: ( ruleVersion )
            // InternalCHARTS.g:1916:2: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedName__Group__2__Impl"


    // $ANTLR start "rule__VersionedQualifiedName__Group__3"
    // InternalCHARTS.g:1925:1: rule__VersionedQualifiedName__Group__3 : rule__VersionedQualifiedName__Group__3__Impl ;
    public final void rule__VersionedQualifiedName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1929:1: ( rule__VersionedQualifiedName__Group__3__Impl )
            // InternalCHARTS.g:1930:2: rule__VersionedQualifiedName__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VersionedQualifiedName__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedName__Group__3"


    // $ANTLR start "rule__VersionedQualifiedName__Group__3__Impl"
    // InternalCHARTS.g:1936:1: rule__VersionedQualifiedName__Group__3__Impl : ( ')' ) ;
    public final void rule__VersionedQualifiedName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1940:1: ( ( ')' ) )
            // InternalCHARTS.g:1941:1: ( ')' )
            {
            // InternalCHARTS.g:1941:1: ( ')' )
            // InternalCHARTS.g:1942:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedName__Group__3__Impl"


    // $ANTLR start "rule__INTEGER__Group_0__0"
    // InternalCHARTS.g:1952:1: rule__INTEGER__Group_0__0 : rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 ;
    public final void rule__INTEGER__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1956:1: ( rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 )
            // InternalCHARTS.g:1957:2: rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__INTEGER__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__INTEGER__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INTEGER__Group_0__0"


    // $ANTLR start "rule__INTEGER__Group_0__0__Impl"
    // InternalCHARTS.g:1964:1: rule__INTEGER__Group_0__0__Impl : ( ( '-' )? ) ;
    public final void rule__INTEGER__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1968:1: ( ( ( '-' )? ) )
            // InternalCHARTS.g:1969:1: ( ( '-' )? )
            {
            // InternalCHARTS.g:1969:1: ( ( '-' )? )
            // InternalCHARTS.g:1970:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); 
            }
            // InternalCHARTS.g:1971:2: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCHARTS.g:1971:3: '-'
                    {
                    match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INTEGER__Group_0__0__Impl"


    // $ANTLR start "rule__INTEGER__Group_0__1"
    // InternalCHARTS.g:1979:1: rule__INTEGER__Group_0__1 : rule__INTEGER__Group_0__1__Impl ;
    public final void rule__INTEGER__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1983:1: ( rule__INTEGER__Group_0__1__Impl )
            // InternalCHARTS.g:1984:2: rule__INTEGER__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__INTEGER__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INTEGER__Group_0__1"


    // $ANTLR start "rule__INTEGER__Group_0__1__Impl"
    // InternalCHARTS.g:1990:1: rule__INTEGER__Group_0__1__Impl : ( RULE_INT ) ;
    public final void rule__INTEGER__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1994:1: ( ( RULE_INT ) )
            // InternalCHARTS.g:1995:1: ( RULE_INT )
            {
            // InternalCHARTS.g:1995:1: ( RULE_INT )
            // InternalCHARTS.g:1996:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getINTTerminalRuleCall_0_1()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getINTEGERAccess().getINTTerminalRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INTEGER__Group_0__1__Impl"


    // $ANTLR start "rule__GSSChartsCharts__UnorderedGroup_3"
    // InternalCHARTS.g:2006:1: rule__GSSChartsCharts__UnorderedGroup_3 : rule__GSSChartsCharts__UnorderedGroup_3__0 {...}?;
    public final void rule__GSSChartsCharts__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3());
        	
        try {
            // InternalCHARTS.g:2011:1: ( rule__GSSChartsCharts__UnorderedGroup_3__0 {...}?)
            // InternalCHARTS.g:2012:2: rule__GSSChartsCharts__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsCharts__UnorderedGroup_3__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__GSSChartsCharts__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__UnorderedGroup_3"


    // $ANTLR start "rule__GSSChartsCharts__UnorderedGroup_3__Impl"
    // InternalCHARTS.g:2020:1: rule__GSSChartsCharts__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__GSSChartsCharts__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalCHARTS.g:2025:1: ( ( ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_1__0 ) ) ) ) ) )
            // InternalCHARTS.g:2026:3: ( ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_1__0 ) ) ) ) )
            {
            // InternalCHARTS.g:2026:3: ( ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_1__0 ) ) ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( LA13_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 0) ) {
                alt13=1;
            }
            else if ( LA13_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 1) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalCHARTS.g:2027:3: ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_0__0 ) ) ) )
                    {
                    // InternalCHARTS.g:2027:3: ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_0__0 ) ) ) )
                    // InternalCHARTS.g:2028:4: {...}? => ( ( ( rule__GSSChartsCharts__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSChartsCharts__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalCHARTS.g:2028:111: ( ( ( rule__GSSChartsCharts__Group_3_0__0 ) ) )
                    // InternalCHARTS.g:2029:5: ( ( rule__GSSChartsCharts__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // InternalCHARTS.g:2035:5: ( ( rule__GSSChartsCharts__Group_3_0__0 ) )
                    // InternalCHARTS.g:2036:6: ( rule__GSSChartsCharts__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSChartsChartsAccess().getGroup_3_0()); 
                    }
                    // InternalCHARTS.g:2037:6: ( rule__GSSChartsCharts__Group_3_0__0 )
                    // InternalCHARTS.g:2037:7: rule__GSSChartsCharts__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSChartsCharts__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSChartsChartsAccess().getGroup_3_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCHARTS.g:2042:3: ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_1__0 ) ) ) )
                    {
                    // InternalCHARTS.g:2042:3: ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_1__0 ) ) ) )
                    // InternalCHARTS.g:2043:4: {...}? => ( ( ( rule__GSSChartsCharts__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSChartsCharts__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalCHARTS.g:2043:111: ( ( ( rule__GSSChartsCharts__Group_3_1__0 ) ) )
                    // InternalCHARTS.g:2044:5: ( ( rule__GSSChartsCharts__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // InternalCHARTS.g:2050:5: ( ( rule__GSSChartsCharts__Group_3_1__0 ) )
                    // InternalCHARTS.g:2051:6: ( rule__GSSChartsCharts__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSChartsChartsAccess().getGroup_3_1()); 
                    }
                    // InternalCHARTS.g:2052:6: ( rule__GSSChartsCharts__Group_3_1__0 )
                    // InternalCHARTS.g:2052:7: rule__GSSChartsCharts__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSChartsCharts__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSChartsChartsAccess().getGroup_3_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__GSSChartsCharts__UnorderedGroup_3__0"
    // InternalCHARTS.g:2065:1: rule__GSSChartsCharts__UnorderedGroup_3__0 : rule__GSSChartsCharts__UnorderedGroup_3__Impl ( rule__GSSChartsCharts__UnorderedGroup_3__1 )? ;
    public final void rule__GSSChartsCharts__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:2069:1: ( rule__GSSChartsCharts__UnorderedGroup_3__Impl ( rule__GSSChartsCharts__UnorderedGroup_3__1 )? )
            // InternalCHARTS.g:2070:2: rule__GSSChartsCharts__UnorderedGroup_3__Impl ( rule__GSSChartsCharts__UnorderedGroup_3__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__GSSChartsCharts__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCHARTS.g:2071:2: ( rule__GSSChartsCharts__UnorderedGroup_3__1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( LA14_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 0) ) {
                alt14=1;
            }
            else if ( LA14_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 1) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCHARTS.g:0:0: rule__GSSChartsCharts__UnorderedGroup_3__1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSChartsCharts__UnorderedGroup_3__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__UnorderedGroup_3__0"


    // $ANTLR start "rule__GSSChartsCharts__UnorderedGroup_3__1"
    // InternalCHARTS.g:2077:1: rule__GSSChartsCharts__UnorderedGroup_3__1 : rule__GSSChartsCharts__UnorderedGroup_3__Impl ;
    public final void rule__GSSChartsCharts__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:2081:1: ( rule__GSSChartsCharts__UnorderedGroup_3__Impl )
            // InternalCHARTS.g:2082:2: rule__GSSChartsCharts__UnorderedGroup_3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSChartsCharts__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__UnorderedGroup_3__1"


    // $ANTLR start "rule__GSSModelFile__ImportsAssignment_0"
    // InternalCHARTS.g:2089:1: rule__GSSModelFile__ImportsAssignment_0 : ( ruleGSSModelFileImport ) ;
    public final void rule__GSSModelFile__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:2093:1: ( ( ruleGSSModelFileImport ) )
            // InternalCHARTS.g:2094:2: ( ruleGSSModelFileImport )
            {
            // InternalCHARTS.g:2094:2: ( ruleGSSModelFileImport )
            // InternalCHARTS.g:2095:3: ruleGSSModelFileImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getImportsGSSModelFileImportParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSModelFileImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSModelFileAccess().getImportsGSSModelFileImportParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSModelFile__ImportsAssignment_0"


    // $ANTLR start "rule__GSSModelFile__ElementAssignment_1"
    // InternalCHARTS.g:2104:1: rule__GSSModelFile__ElementAssignment_1 : ( ruleGSSChartsCharts ) ;
    public final void rule__GSSModelFile__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:2108:1: ( ( ruleGSSChartsCharts ) )
            // InternalCHARTS.g:2109:2: ( ruleGSSChartsCharts )
            {
            // InternalCHARTS.g:2109:2: ( ruleGSSChartsCharts )
            // InternalCHARTS.g:2110:3: ruleGSSChartsCharts
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getElementGSSChartsChartsParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSChartsCharts();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSModelFileAccess().getElementGSSChartsChartsParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSModelFile__ElementAssignment_1"


    // $ANTLR start "rule__GSSModelFileImport__ImportURIAssignment_2"
    // InternalCHARTS.g:2119:1: rule__GSSModelFileImport__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GSSModelFileImport__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:2123:1: ( ( RULE_STRING ) )
            // InternalCHARTS.g:2124:2: ( RULE_STRING )
            {
            // InternalCHARTS.g:2124:2: ( RULE_STRING )
            // InternalCHARTS.g:2125:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSModelFileImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSModelFileImport__ImportURIAssignment_2"


    // $ANTLR start "rule__GSSChartsCharts__NameAssignment_1"
    // InternalCHARTS.g:2134:1: rule__GSSChartsCharts__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__GSSChartsCharts__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:2138:1: ( ( ruleEString ) )
            // InternalCHARTS.g:2139:2: ( ruleEString )
            {
            // InternalCHARTS.g:2139:2: ( ruleEString )
            // InternalCHARTS.g:2140:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartsAccess().getNameEStringParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__NameAssignment_1"


    // $ANTLR start "rule__GSSChartsCharts__UriAssignment_3_0_2"
    // InternalCHARTS.g:2149:1: rule__GSSChartsCharts__UriAssignment_3_0_2 : ( ruleQualifiedName ) ;
    public final void rule__GSSChartsCharts__UriAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:2153:1: ( ( ruleQualifiedName ) )
            // InternalCHARTS.g:2154:2: ( ruleQualifiedName )
            {
            // InternalCHARTS.g:2154:2: ( ruleQualifiedName )
            // InternalCHARTS.g:2155:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartsAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__UriAssignment_3_0_2"


    // $ANTLR start "rule__GSSChartsCharts__VersionAssignment_3_1_2"
    // InternalCHARTS.g:2164:1: rule__GSSChartsCharts__VersionAssignment_3_1_2 : ( ruleVersion ) ;
    public final void rule__GSSChartsCharts__VersionAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:2168:1: ( ( ruleVersion ) )
            // InternalCHARTS.g:2169:2: ( ruleVersion )
            {
            // InternalCHARTS.g:2169:2: ( ruleVersion )
            // InternalCHARTS.g:2170:3: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getVersionVersionParserRuleCall_3_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartsAccess().getVersionVersionParserRuleCall_3_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__VersionAssignment_3_1_2"


    // $ANTLR start "rule__GSSChartsCharts__ChartAssignment_4"
    // InternalCHARTS.g:2179:1: rule__GSSChartsCharts__ChartAssignment_4 : ( ruleGSSChartsChart ) ;
    public final void rule__GSSChartsCharts__ChartAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:2183:1: ( ( ruleGSSChartsChart ) )
            // InternalCHARTS.g:2184:2: ( ruleGSSChartsChart )
            {
            // InternalCHARTS.g:2184:2: ( ruleGSSChartsChart )
            // InternalCHARTS.g:2185:3: ruleGSSChartsChart
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getChartGSSChartsChartParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSChartsChart();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartsAccess().getChartGSSChartsChartParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsCharts__ChartAssignment_4"


    // $ANTLR start "rule__GSSChartsChart__IdAssignment_4"
    // InternalCHARTS.g:2194:1: rule__GSSChartsChart__IdAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSChartsChart__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:2198:1: ( ( ruleINTEGER ) )
            // InternalCHARTS.g:2199:2: ( ruleINTEGER )
            {
            // InternalCHARTS.g:2199:2: ( ruleINTEGER )
            // InternalCHARTS.g:2200:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getIdINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartAccess().getIdINTEGERParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__IdAssignment_4"


    // $ANTLR start "rule__GSSChartsChart__NameAssignment_8"
    // InternalCHARTS.g:2209:1: rule__GSSChartsChart__NameAssignment_8 : ( RULE_ID ) ;
    public final void rule__GSSChartsChart__NameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:2213:1: ( ( RULE_ID ) )
            // InternalCHARTS.g:2214:2: ( RULE_ID )
            {
            // InternalCHARTS.g:2214:2: ( RULE_ID )
            // InternalCHARTS.g:2215:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getNameIDTerminalRuleCall_8_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartAccess().getNameIDTerminalRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__NameAssignment_8"


    // $ANTLR start "rule__GSSChartsChart__Y_unitsAssignment_12"
    // InternalCHARTS.g:2224:1: rule__GSSChartsChart__Y_unitsAssignment_12 : ( ruleGSSChartsYUnits ) ;
    public final void rule__GSSChartsChart__Y_unitsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:2228:1: ( ( ruleGSSChartsYUnits ) )
            // InternalCHARTS.g:2229:2: ( ruleGSSChartsYUnits )
            {
            // InternalCHARTS.g:2229:2: ( ruleGSSChartsYUnits )
            // InternalCHARTS.g:2230:3: ruleGSSChartsYUnits
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getY_unitsGSSChartsYUnitsEnumRuleCall_12_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSChartsYUnits();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartAccess().getY_unitsGSSChartsYUnitsEnumRuleCall_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Y_unitsAssignment_12"


    // $ANTLR start "rule__GSSChartsChart__Y_maxAssignment_16"
    // InternalCHARTS.g:2239:1: rule__GSSChartsChart__Y_maxAssignment_16 : ( ruleINTEGER ) ;
    public final void rule__GSSChartsChart__Y_maxAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:2243:1: ( ( ruleINTEGER ) )
            // InternalCHARTS.g:2244:2: ( ruleINTEGER )
            {
            // InternalCHARTS.g:2244:2: ( ruleINTEGER )
            // InternalCHARTS.g:2245:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getY_maxINTEGERParserRuleCall_16_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartAccess().getY_maxINTEGERParserRuleCall_16_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSChartsChart__Y_maxAssignment_16"

    // $ANTLR start synpred13_InternalCHARTS
    public final void synpred13_InternalCHARTS_fragment() throws RecognitionException {   
        // InternalCHARTS.g:2027:3: ( ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_0__0 ) ) ) ) )
        // InternalCHARTS.g:2027:3: ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_0__0 ) ) ) )
        {
        // InternalCHARTS.g:2027:3: ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_0__0 ) ) ) )
        // InternalCHARTS.g:2028:4: {...}? => ( ( ( rule__GSSChartsCharts__Group_3_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred13_InternalCHARTS", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalCHARTS.g:2028:111: ( ( ( rule__GSSChartsCharts__Group_3_0__0 ) ) )
        // InternalCHARTS.g:2029:5: ( ( rule__GSSChartsCharts__Group_3_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 0);
        // InternalCHARTS.g:2035:5: ( ( rule__GSSChartsCharts__Group_3_0__0 ) )
        // InternalCHARTS.g:2036:6: ( rule__GSSChartsCharts__Group_3_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSChartsChartsAccess().getGroup_3_0()); 
        }
        // InternalCHARTS.g:2037:6: ( rule__GSSChartsCharts__Group_3_0__0 )
        // InternalCHARTS.g:2037:7: rule__GSSChartsCharts__Group_3_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSChartsCharts__Group_3_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred13_InternalCHARTS

    // $ANTLR start synpred14_InternalCHARTS
    public final void synpred14_InternalCHARTS_fragment() throws RecognitionException {   
        // InternalCHARTS.g:2071:2: ( rule__GSSChartsCharts__UnorderedGroup_3__1 )
        // InternalCHARTS.g:2071:2: rule__GSSChartsCharts__UnorderedGroup_3__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSChartsCharts__UnorderedGroup_3__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalCHARTS

    // Delegated rules

    public final boolean synpred14_InternalCHARTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalCHARTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalCHARTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalCHARTS_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000400000C0L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000040L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000300002L});
    }


}