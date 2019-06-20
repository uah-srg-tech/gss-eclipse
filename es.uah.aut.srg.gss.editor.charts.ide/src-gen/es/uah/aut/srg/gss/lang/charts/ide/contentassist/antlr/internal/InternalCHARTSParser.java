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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_HEXADECIMAL", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'volts'", "'amps'", "'import'", "':='", "';'", "'GSSChartsCharts'", "'{'", "'}'", "'uri'", "'version'", "'GSSChartsChart'", "'id'", "'name'", "'y_units'", "'y_max'", "'.'", "'('", "')'", "'-'"
    };
    public static final int RULE_STRING=7;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int RULE_HEXADECIMAL=5;
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCHARTS.g:161:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalCHARTS.g:162:1: ( ruleQualifiedName EOF )
            // InternalCHARTS.g:163:1: ruleQualifiedName EOF
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
    // InternalCHARTS.g:170:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:174:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalCHARTS.g:175:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalCHARTS.g:175:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalCHARTS.g:176:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalCHARTS.g:177:3: ( rule__QualifiedName__Group__0 )
            // InternalCHARTS.g:177:4: rule__QualifiedName__Group__0
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
    // InternalCHARTS.g:186:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalCHARTS.g:187:1: ( ruleVersion EOF )
            // InternalCHARTS.g:188:1: ruleVersion EOF
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
    // InternalCHARTS.g:195:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:199:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalCHARTS.g:200:2: ( ( rule__Version__Group__0 ) )
            {
            // InternalCHARTS.g:200:2: ( ( rule__Version__Group__0 ) )
            // InternalCHARTS.g:201:3: ( rule__Version__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup()); 
            }
            // InternalCHARTS.g:202:3: ( rule__Version__Group__0 )
            // InternalCHARTS.g:202:4: rule__Version__Group__0
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
    // InternalCHARTS.g:211:1: entryRuleVersionedQualifiedName : ruleVersionedQualifiedName EOF ;
    public final void entryRuleVersionedQualifiedName() throws RecognitionException {
        try {
            // InternalCHARTS.g:212:1: ( ruleVersionedQualifiedName EOF )
            // InternalCHARTS.g:213:1: ruleVersionedQualifiedName EOF
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
    // InternalCHARTS.g:220:1: ruleVersionedQualifiedName : ( ( rule__VersionedQualifiedName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:224:2: ( ( ( rule__VersionedQualifiedName__Group__0 ) ) )
            // InternalCHARTS.g:225:2: ( ( rule__VersionedQualifiedName__Group__0 ) )
            {
            // InternalCHARTS.g:225:2: ( ( rule__VersionedQualifiedName__Group__0 ) )
            // InternalCHARTS.g:226:3: ( rule__VersionedQualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); 
            }
            // InternalCHARTS.g:227:3: ( rule__VersionedQualifiedName__Group__0 )
            // InternalCHARTS.g:227:4: rule__VersionedQualifiedName__Group__0
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
    // InternalCHARTS.g:236:1: entryRuleINTEGER : ruleINTEGER EOF ;
    public final void entryRuleINTEGER() throws RecognitionException {
        try {
            // InternalCHARTS.g:237:1: ( ruleINTEGER EOF )
            // InternalCHARTS.g:238:1: ruleINTEGER EOF
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
    // InternalCHARTS.g:245:1: ruleINTEGER : ( ( rule__INTEGER__Alternatives ) ) ;
    public final void ruleINTEGER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:249:2: ( ( ( rule__INTEGER__Alternatives ) ) )
            // InternalCHARTS.g:250:2: ( ( rule__INTEGER__Alternatives ) )
            {
            // InternalCHARTS.g:250:2: ( ( rule__INTEGER__Alternatives ) )
            // InternalCHARTS.g:251:3: ( rule__INTEGER__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getAlternatives()); 
            }
            // InternalCHARTS.g:252:3: ( rule__INTEGER__Alternatives )
            // InternalCHARTS.g:252:4: rule__INTEGER__Alternatives
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
    // InternalCHARTS.g:261:1: ruleGSSChartsYUnits : ( ( rule__GSSChartsYUnits__Alternatives ) ) ;
    public final void ruleGSSChartsYUnits() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:265:1: ( ( ( rule__GSSChartsYUnits__Alternatives ) ) )
            // InternalCHARTS.g:266:2: ( ( rule__GSSChartsYUnits__Alternatives ) )
            {
            // InternalCHARTS.g:266:2: ( ( rule__GSSChartsYUnits__Alternatives ) )
            // InternalCHARTS.g:267:3: ( rule__GSSChartsYUnits__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsYUnitsAccess().getAlternatives()); 
            }
            // InternalCHARTS.g:268:3: ( rule__GSSChartsYUnits__Alternatives )
            // InternalCHARTS.g:268:4: rule__GSSChartsYUnits__Alternatives
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


    // $ANTLR start "rule__Version__Alternatives_0"
    // InternalCHARTS.g:276:1: rule__Version__Alternatives_0 : ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) );
    public final void rule__Version__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:280:1: ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_ID) ) {
                    alt1=2;
                }
                else if ( (LA1_1==EOF||LA1_1==16||LA1_1==27||LA1_1==29) ) {
                    alt1=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
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
                    // InternalCHARTS.g:281:2: ( RULE_INT )
                    {
                    // InternalCHARTS.g:281:2: ( RULE_INT )
                    // InternalCHARTS.g:282:3: RULE_INT
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
                    // InternalCHARTS.g:287:2: ( ( rule__Version__Group_0_1__0 ) )
                    {
                    // InternalCHARTS.g:287:2: ( ( rule__Version__Group_0_1__0 ) )
                    // InternalCHARTS.g:288:3: ( rule__Version__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_0_1()); 
                    }
                    // InternalCHARTS.g:289:3: ( rule__Version__Group_0_1__0 )
                    // InternalCHARTS.g:289:4: rule__Version__Group_0_1__0
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
    // InternalCHARTS.g:297:1: rule__Version__Alternatives_1_1 : ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) );
    public final void rule__Version__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:301:1: ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||LA2_1==16||LA2_1==27||LA2_1==29) ) {
                    alt2=1;
                }
                else if ( (LA2_1==RULE_ID) ) {
                    alt2=2;
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
                    // InternalCHARTS.g:302:2: ( RULE_INT )
                    {
                    // InternalCHARTS.g:302:2: ( RULE_INT )
                    // InternalCHARTS.g:303:3: RULE_INT
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
                    // InternalCHARTS.g:308:2: ( ( rule__Version__Group_1_1_1__0 ) )
                    {
                    // InternalCHARTS.g:308:2: ( ( rule__Version__Group_1_1_1__0 ) )
                    // InternalCHARTS.g:309:3: ( rule__Version__Group_1_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_1_1_1()); 
                    }
                    // InternalCHARTS.g:310:3: ( rule__Version__Group_1_1_1__0 )
                    // InternalCHARTS.g:310:4: rule__Version__Group_1_1_1__0
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
    // InternalCHARTS.g:318:1: rule__INTEGER__Alternatives : ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) );
    public final void rule__INTEGER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:322:1: ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT||LA3_0==30) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_HEXADECIMAL) ) {
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
                    // InternalCHARTS.g:323:2: ( ( rule__INTEGER__Group_0__0 ) )
                    {
                    // InternalCHARTS.g:323:2: ( ( rule__INTEGER__Group_0__0 ) )
                    // InternalCHARTS.g:324:3: ( rule__INTEGER__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getINTEGERAccess().getGroup_0()); 
                    }
                    // InternalCHARTS.g:325:3: ( rule__INTEGER__Group_0__0 )
                    // InternalCHARTS.g:325:4: rule__INTEGER__Group_0__0
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
                    // InternalCHARTS.g:329:2: ( RULE_HEXADECIMAL )
                    {
                    // InternalCHARTS.g:329:2: ( RULE_HEXADECIMAL )
                    // InternalCHARTS.g:330:3: RULE_HEXADECIMAL
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
    // InternalCHARTS.g:339:1: rule__GSSChartsYUnits__Alternatives : ( ( ( 'volts' ) ) | ( ( 'amps' ) ) );
    public final void rule__GSSChartsYUnits__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:343:1: ( ( ( 'volts' ) ) | ( ( 'amps' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
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
                    // InternalCHARTS.g:344:2: ( ( 'volts' ) )
                    {
                    // InternalCHARTS.g:344:2: ( ( 'volts' ) )
                    // InternalCHARTS.g:345:3: ( 'volts' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSChartsYUnitsAccess().getVoltsEnumLiteralDeclaration_0()); 
                    }
                    // InternalCHARTS.g:346:3: ( 'volts' )
                    // InternalCHARTS.g:346:4: 'volts'
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
                    // InternalCHARTS.g:350:2: ( ( 'amps' ) )
                    {
                    // InternalCHARTS.g:350:2: ( ( 'amps' ) )
                    // InternalCHARTS.g:351:3: ( 'amps' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSChartsYUnitsAccess().getAmpsEnumLiteralDeclaration_1()); 
                    }
                    // InternalCHARTS.g:352:3: ( 'amps' )
                    // InternalCHARTS.g:352:4: 'amps'
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
    // InternalCHARTS.g:360:1: rule__GSSModelFile__Group__0 : rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1 ;
    public final void rule__GSSModelFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:364:1: ( rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1 )
            // InternalCHARTS.g:365:2: rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1
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
    // InternalCHARTS.g:372:1: rule__GSSModelFile__Group__0__Impl : ( ( rule__GSSModelFile__ImportsAssignment_0 )* ) ;
    public final void rule__GSSModelFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:376:1: ( ( ( rule__GSSModelFile__ImportsAssignment_0 )* ) )
            // InternalCHARTS.g:377:1: ( ( rule__GSSModelFile__ImportsAssignment_0 )* )
            {
            // InternalCHARTS.g:377:1: ( ( rule__GSSModelFile__ImportsAssignment_0 )* )
            // InternalCHARTS.g:378:2: ( rule__GSSModelFile__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getImportsAssignment_0()); 
            }
            // InternalCHARTS.g:379:2: ( rule__GSSModelFile__ImportsAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCHARTS.g:379:3: rule__GSSModelFile__ImportsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__GSSModelFile__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalCHARTS.g:387:1: rule__GSSModelFile__Group__1 : rule__GSSModelFile__Group__1__Impl ;
    public final void rule__GSSModelFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:391:1: ( rule__GSSModelFile__Group__1__Impl )
            // InternalCHARTS.g:392:2: rule__GSSModelFile__Group__1__Impl
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
    // InternalCHARTS.g:398:1: rule__GSSModelFile__Group__1__Impl : ( ( rule__GSSModelFile__ElementAssignment_1 ) ) ;
    public final void rule__GSSModelFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:402:1: ( ( ( rule__GSSModelFile__ElementAssignment_1 ) ) )
            // InternalCHARTS.g:403:1: ( ( rule__GSSModelFile__ElementAssignment_1 ) )
            {
            // InternalCHARTS.g:403:1: ( ( rule__GSSModelFile__ElementAssignment_1 ) )
            // InternalCHARTS.g:404:2: ( rule__GSSModelFile__ElementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getElementAssignment_1()); 
            }
            // InternalCHARTS.g:405:2: ( rule__GSSModelFile__ElementAssignment_1 )
            // InternalCHARTS.g:405:3: rule__GSSModelFile__ElementAssignment_1
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
    // InternalCHARTS.g:414:1: rule__GSSModelFileImport__Group__0 : rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1 ;
    public final void rule__GSSModelFileImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:418:1: ( rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1 )
            // InternalCHARTS.g:419:2: rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1
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
    // InternalCHARTS.g:426:1: rule__GSSModelFileImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__GSSModelFileImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:430:1: ( ( 'import' ) )
            // InternalCHARTS.g:431:1: ( 'import' )
            {
            // InternalCHARTS.g:431:1: ( 'import' )
            // InternalCHARTS.g:432:2: 'import'
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
    // InternalCHARTS.g:441:1: rule__GSSModelFileImport__Group__1 : rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2 ;
    public final void rule__GSSModelFileImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:445:1: ( rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2 )
            // InternalCHARTS.g:446:2: rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2
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
    // InternalCHARTS.g:453:1: rule__GSSModelFileImport__Group__1__Impl : ( ':=' ) ;
    public final void rule__GSSModelFileImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:457:1: ( ( ':=' ) )
            // InternalCHARTS.g:458:1: ( ':=' )
            {
            // InternalCHARTS.g:458:1: ( ':=' )
            // InternalCHARTS.g:459:2: ':='
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
    // InternalCHARTS.g:468:1: rule__GSSModelFileImport__Group__2 : rule__GSSModelFileImport__Group__2__Impl rule__GSSModelFileImport__Group__3 ;
    public final void rule__GSSModelFileImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:472:1: ( rule__GSSModelFileImport__Group__2__Impl rule__GSSModelFileImport__Group__3 )
            // InternalCHARTS.g:473:2: rule__GSSModelFileImport__Group__2__Impl rule__GSSModelFileImport__Group__3
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
    // InternalCHARTS.g:480:1: rule__GSSModelFileImport__Group__2__Impl : ( ( rule__GSSModelFileImport__ImportURIAssignment_2 ) ) ;
    public final void rule__GSSModelFileImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:484:1: ( ( ( rule__GSSModelFileImport__ImportURIAssignment_2 ) ) )
            // InternalCHARTS.g:485:1: ( ( rule__GSSModelFileImport__ImportURIAssignment_2 ) )
            {
            // InternalCHARTS.g:485:1: ( ( rule__GSSModelFileImport__ImportURIAssignment_2 ) )
            // InternalCHARTS.g:486:2: ( rule__GSSModelFileImport__ImportURIAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getImportURIAssignment_2()); 
            }
            // InternalCHARTS.g:487:2: ( rule__GSSModelFileImport__ImportURIAssignment_2 )
            // InternalCHARTS.g:487:3: rule__GSSModelFileImport__ImportURIAssignment_2
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
    // InternalCHARTS.g:495:1: rule__GSSModelFileImport__Group__3 : rule__GSSModelFileImport__Group__3__Impl ;
    public final void rule__GSSModelFileImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:499:1: ( rule__GSSModelFileImport__Group__3__Impl )
            // InternalCHARTS.g:500:2: rule__GSSModelFileImport__Group__3__Impl
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
    // InternalCHARTS.g:506:1: rule__GSSModelFileImport__Group__3__Impl : ( ';' ) ;
    public final void rule__GSSModelFileImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:510:1: ( ( ';' ) )
            // InternalCHARTS.g:511:1: ( ';' )
            {
            // InternalCHARTS.g:511:1: ( ';' )
            // InternalCHARTS.g:512:2: ';'
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
    // InternalCHARTS.g:522:1: rule__GSSChartsCharts__Group__0 : rule__GSSChartsCharts__Group__0__Impl rule__GSSChartsCharts__Group__1 ;
    public final void rule__GSSChartsCharts__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:526:1: ( rule__GSSChartsCharts__Group__0__Impl rule__GSSChartsCharts__Group__1 )
            // InternalCHARTS.g:527:2: rule__GSSChartsCharts__Group__0__Impl rule__GSSChartsCharts__Group__1
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
    // InternalCHARTS.g:534:1: rule__GSSChartsCharts__Group__0__Impl : ( 'GSSChartsCharts' ) ;
    public final void rule__GSSChartsCharts__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:538:1: ( ( 'GSSChartsCharts' ) )
            // InternalCHARTS.g:539:1: ( 'GSSChartsCharts' )
            {
            // InternalCHARTS.g:539:1: ( 'GSSChartsCharts' )
            // InternalCHARTS.g:540:2: 'GSSChartsCharts'
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
    // InternalCHARTS.g:549:1: rule__GSSChartsCharts__Group__1 : rule__GSSChartsCharts__Group__1__Impl rule__GSSChartsCharts__Group__2 ;
    public final void rule__GSSChartsCharts__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:553:1: ( rule__GSSChartsCharts__Group__1__Impl rule__GSSChartsCharts__Group__2 )
            // InternalCHARTS.g:554:2: rule__GSSChartsCharts__Group__1__Impl rule__GSSChartsCharts__Group__2
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
    // InternalCHARTS.g:561:1: rule__GSSChartsCharts__Group__1__Impl : ( ( rule__GSSChartsCharts__NameAssignment_1 ) ) ;
    public final void rule__GSSChartsCharts__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:565:1: ( ( ( rule__GSSChartsCharts__NameAssignment_1 ) ) )
            // InternalCHARTS.g:566:1: ( ( rule__GSSChartsCharts__NameAssignment_1 ) )
            {
            // InternalCHARTS.g:566:1: ( ( rule__GSSChartsCharts__NameAssignment_1 ) )
            // InternalCHARTS.g:567:2: ( rule__GSSChartsCharts__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getNameAssignment_1()); 
            }
            // InternalCHARTS.g:568:2: ( rule__GSSChartsCharts__NameAssignment_1 )
            // InternalCHARTS.g:568:3: rule__GSSChartsCharts__NameAssignment_1
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
    // InternalCHARTS.g:576:1: rule__GSSChartsCharts__Group__2 : rule__GSSChartsCharts__Group__2__Impl rule__GSSChartsCharts__Group__3 ;
    public final void rule__GSSChartsCharts__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:580:1: ( rule__GSSChartsCharts__Group__2__Impl rule__GSSChartsCharts__Group__3 )
            // InternalCHARTS.g:581:2: rule__GSSChartsCharts__Group__2__Impl rule__GSSChartsCharts__Group__3
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
    // InternalCHARTS.g:588:1: rule__GSSChartsCharts__Group__2__Impl : ( '{' ) ;
    public final void rule__GSSChartsCharts__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:592:1: ( ( '{' ) )
            // InternalCHARTS.g:593:1: ( '{' )
            {
            // InternalCHARTS.g:593:1: ( '{' )
            // InternalCHARTS.g:594:2: '{'
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
    // InternalCHARTS.g:603:1: rule__GSSChartsCharts__Group__3 : rule__GSSChartsCharts__Group__3__Impl rule__GSSChartsCharts__Group__4 ;
    public final void rule__GSSChartsCharts__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:607:1: ( rule__GSSChartsCharts__Group__3__Impl rule__GSSChartsCharts__Group__4 )
            // InternalCHARTS.g:608:2: rule__GSSChartsCharts__Group__3__Impl rule__GSSChartsCharts__Group__4
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
    // InternalCHARTS.g:615:1: rule__GSSChartsCharts__Group__3__Impl : ( ( rule__GSSChartsCharts__UnorderedGroup_3 ) ) ;
    public final void rule__GSSChartsCharts__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:619:1: ( ( ( rule__GSSChartsCharts__UnorderedGroup_3 ) ) )
            // InternalCHARTS.g:620:1: ( ( rule__GSSChartsCharts__UnorderedGroup_3 ) )
            {
            // InternalCHARTS.g:620:1: ( ( rule__GSSChartsCharts__UnorderedGroup_3 ) )
            // InternalCHARTS.g:621:2: ( rule__GSSChartsCharts__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3()); 
            }
            // InternalCHARTS.g:622:2: ( rule__GSSChartsCharts__UnorderedGroup_3 )
            // InternalCHARTS.g:622:3: rule__GSSChartsCharts__UnorderedGroup_3
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
    // InternalCHARTS.g:630:1: rule__GSSChartsCharts__Group__4 : rule__GSSChartsCharts__Group__4__Impl rule__GSSChartsCharts__Group__5 ;
    public final void rule__GSSChartsCharts__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:634:1: ( rule__GSSChartsCharts__Group__4__Impl rule__GSSChartsCharts__Group__5 )
            // InternalCHARTS.g:635:2: rule__GSSChartsCharts__Group__4__Impl rule__GSSChartsCharts__Group__5
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
    // InternalCHARTS.g:642:1: rule__GSSChartsCharts__Group__4__Impl : ( ( ( rule__GSSChartsCharts__ChartAssignment_4 ) ) ( ( rule__GSSChartsCharts__ChartAssignment_4 )* ) ) ;
    public final void rule__GSSChartsCharts__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:646:1: ( ( ( ( rule__GSSChartsCharts__ChartAssignment_4 ) ) ( ( rule__GSSChartsCharts__ChartAssignment_4 )* ) ) )
            // InternalCHARTS.g:647:1: ( ( ( rule__GSSChartsCharts__ChartAssignment_4 ) ) ( ( rule__GSSChartsCharts__ChartAssignment_4 )* ) )
            {
            // InternalCHARTS.g:647:1: ( ( ( rule__GSSChartsCharts__ChartAssignment_4 ) ) ( ( rule__GSSChartsCharts__ChartAssignment_4 )* ) )
            // InternalCHARTS.g:648:2: ( ( rule__GSSChartsCharts__ChartAssignment_4 ) ) ( ( rule__GSSChartsCharts__ChartAssignment_4 )* )
            {
            // InternalCHARTS.g:648:2: ( ( rule__GSSChartsCharts__ChartAssignment_4 ) )
            // InternalCHARTS.g:649:3: ( rule__GSSChartsCharts__ChartAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getChartAssignment_4()); 
            }
            // InternalCHARTS.g:650:3: ( rule__GSSChartsCharts__ChartAssignment_4 )
            // InternalCHARTS.g:650:4: rule__GSSChartsCharts__ChartAssignment_4
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

            // InternalCHARTS.g:653:2: ( ( rule__GSSChartsCharts__ChartAssignment_4 )* )
            // InternalCHARTS.g:654:3: ( rule__GSSChartsCharts__ChartAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getChartAssignment_4()); 
            }
            // InternalCHARTS.g:655:3: ( rule__GSSChartsCharts__ChartAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCHARTS.g:655:4: rule__GSSChartsCharts__ChartAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    rule__GSSChartsCharts__ChartAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalCHARTS.g:664:1: rule__GSSChartsCharts__Group__5 : rule__GSSChartsCharts__Group__5__Impl rule__GSSChartsCharts__Group__6 ;
    public final void rule__GSSChartsCharts__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:668:1: ( rule__GSSChartsCharts__Group__5__Impl rule__GSSChartsCharts__Group__6 )
            // InternalCHARTS.g:669:2: rule__GSSChartsCharts__Group__5__Impl rule__GSSChartsCharts__Group__6
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
    // InternalCHARTS.g:676:1: rule__GSSChartsCharts__Group__5__Impl : ( '}' ) ;
    public final void rule__GSSChartsCharts__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:680:1: ( ( '}' ) )
            // InternalCHARTS.g:681:1: ( '}' )
            {
            // InternalCHARTS.g:681:1: ( '}' )
            // InternalCHARTS.g:682:2: '}'
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
    // InternalCHARTS.g:691:1: rule__GSSChartsCharts__Group__6 : rule__GSSChartsCharts__Group__6__Impl ;
    public final void rule__GSSChartsCharts__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:695:1: ( rule__GSSChartsCharts__Group__6__Impl )
            // InternalCHARTS.g:696:2: rule__GSSChartsCharts__Group__6__Impl
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
    // InternalCHARTS.g:702:1: rule__GSSChartsCharts__Group__6__Impl : ( ';' ) ;
    public final void rule__GSSChartsCharts__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:706:1: ( ( ';' ) )
            // InternalCHARTS.g:707:1: ( ';' )
            {
            // InternalCHARTS.g:707:1: ( ';' )
            // InternalCHARTS.g:708:2: ';'
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
    // InternalCHARTS.g:718:1: rule__GSSChartsCharts__Group_3_0__0 : rule__GSSChartsCharts__Group_3_0__0__Impl rule__GSSChartsCharts__Group_3_0__1 ;
    public final void rule__GSSChartsCharts__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:722:1: ( rule__GSSChartsCharts__Group_3_0__0__Impl rule__GSSChartsCharts__Group_3_0__1 )
            // InternalCHARTS.g:723:2: rule__GSSChartsCharts__Group_3_0__0__Impl rule__GSSChartsCharts__Group_3_0__1
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
    // InternalCHARTS.g:730:1: rule__GSSChartsCharts__Group_3_0__0__Impl : ( 'uri' ) ;
    public final void rule__GSSChartsCharts__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:734:1: ( ( 'uri' ) )
            // InternalCHARTS.g:735:1: ( 'uri' )
            {
            // InternalCHARTS.g:735:1: ( 'uri' )
            // InternalCHARTS.g:736:2: 'uri'
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
    // InternalCHARTS.g:745:1: rule__GSSChartsCharts__Group_3_0__1 : rule__GSSChartsCharts__Group_3_0__1__Impl rule__GSSChartsCharts__Group_3_0__2 ;
    public final void rule__GSSChartsCharts__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:749:1: ( rule__GSSChartsCharts__Group_3_0__1__Impl rule__GSSChartsCharts__Group_3_0__2 )
            // InternalCHARTS.g:750:2: rule__GSSChartsCharts__Group_3_0__1__Impl rule__GSSChartsCharts__Group_3_0__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalCHARTS.g:757:1: rule__GSSChartsCharts__Group_3_0__1__Impl : ( ':=' ) ;
    public final void rule__GSSChartsCharts__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:761:1: ( ( ':=' ) )
            // InternalCHARTS.g:762:1: ( ':=' )
            {
            // InternalCHARTS.g:762:1: ( ':=' )
            // InternalCHARTS.g:763:2: ':='
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
    // InternalCHARTS.g:772:1: rule__GSSChartsCharts__Group_3_0__2 : rule__GSSChartsCharts__Group_3_0__2__Impl rule__GSSChartsCharts__Group_3_0__3 ;
    public final void rule__GSSChartsCharts__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:776:1: ( rule__GSSChartsCharts__Group_3_0__2__Impl rule__GSSChartsCharts__Group_3_0__3 )
            // InternalCHARTS.g:777:2: rule__GSSChartsCharts__Group_3_0__2__Impl rule__GSSChartsCharts__Group_3_0__3
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
    // InternalCHARTS.g:784:1: rule__GSSChartsCharts__Group_3_0__2__Impl : ( ( rule__GSSChartsCharts__UriAssignment_3_0_2 ) ) ;
    public final void rule__GSSChartsCharts__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:788:1: ( ( ( rule__GSSChartsCharts__UriAssignment_3_0_2 ) ) )
            // InternalCHARTS.g:789:1: ( ( rule__GSSChartsCharts__UriAssignment_3_0_2 ) )
            {
            // InternalCHARTS.g:789:1: ( ( rule__GSSChartsCharts__UriAssignment_3_0_2 ) )
            // InternalCHARTS.g:790:2: ( rule__GSSChartsCharts__UriAssignment_3_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getUriAssignment_3_0_2()); 
            }
            // InternalCHARTS.g:791:2: ( rule__GSSChartsCharts__UriAssignment_3_0_2 )
            // InternalCHARTS.g:791:3: rule__GSSChartsCharts__UriAssignment_3_0_2
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
    // InternalCHARTS.g:799:1: rule__GSSChartsCharts__Group_3_0__3 : rule__GSSChartsCharts__Group_3_0__3__Impl ;
    public final void rule__GSSChartsCharts__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:803:1: ( rule__GSSChartsCharts__Group_3_0__3__Impl )
            // InternalCHARTS.g:804:2: rule__GSSChartsCharts__Group_3_0__3__Impl
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
    // InternalCHARTS.g:810:1: rule__GSSChartsCharts__Group_3_0__3__Impl : ( ';' ) ;
    public final void rule__GSSChartsCharts__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:814:1: ( ( ';' ) )
            // InternalCHARTS.g:815:1: ( ';' )
            {
            // InternalCHARTS.g:815:1: ( ';' )
            // InternalCHARTS.g:816:2: ';'
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
    // InternalCHARTS.g:826:1: rule__GSSChartsCharts__Group_3_1__0 : rule__GSSChartsCharts__Group_3_1__0__Impl rule__GSSChartsCharts__Group_3_1__1 ;
    public final void rule__GSSChartsCharts__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:830:1: ( rule__GSSChartsCharts__Group_3_1__0__Impl rule__GSSChartsCharts__Group_3_1__1 )
            // InternalCHARTS.g:831:2: rule__GSSChartsCharts__Group_3_1__0__Impl rule__GSSChartsCharts__Group_3_1__1
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
    // InternalCHARTS.g:838:1: rule__GSSChartsCharts__Group_3_1__0__Impl : ( 'version' ) ;
    public final void rule__GSSChartsCharts__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:842:1: ( ( 'version' ) )
            // InternalCHARTS.g:843:1: ( 'version' )
            {
            // InternalCHARTS.g:843:1: ( 'version' )
            // InternalCHARTS.g:844:2: 'version'
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
    // InternalCHARTS.g:853:1: rule__GSSChartsCharts__Group_3_1__1 : rule__GSSChartsCharts__Group_3_1__1__Impl rule__GSSChartsCharts__Group_3_1__2 ;
    public final void rule__GSSChartsCharts__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:857:1: ( rule__GSSChartsCharts__Group_3_1__1__Impl rule__GSSChartsCharts__Group_3_1__2 )
            // InternalCHARTS.g:858:2: rule__GSSChartsCharts__Group_3_1__1__Impl rule__GSSChartsCharts__Group_3_1__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalCHARTS.g:865:1: rule__GSSChartsCharts__Group_3_1__1__Impl : ( ':=' ) ;
    public final void rule__GSSChartsCharts__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:869:1: ( ( ':=' ) )
            // InternalCHARTS.g:870:1: ( ':=' )
            {
            // InternalCHARTS.g:870:1: ( ':=' )
            // InternalCHARTS.g:871:2: ':='
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
    // InternalCHARTS.g:880:1: rule__GSSChartsCharts__Group_3_1__2 : rule__GSSChartsCharts__Group_3_1__2__Impl rule__GSSChartsCharts__Group_3_1__3 ;
    public final void rule__GSSChartsCharts__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:884:1: ( rule__GSSChartsCharts__Group_3_1__2__Impl rule__GSSChartsCharts__Group_3_1__3 )
            // InternalCHARTS.g:885:2: rule__GSSChartsCharts__Group_3_1__2__Impl rule__GSSChartsCharts__Group_3_1__3
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
    // InternalCHARTS.g:892:1: rule__GSSChartsCharts__Group_3_1__2__Impl : ( ( rule__GSSChartsCharts__VersionAssignment_3_1_2 ) ) ;
    public final void rule__GSSChartsCharts__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:896:1: ( ( ( rule__GSSChartsCharts__VersionAssignment_3_1_2 ) ) )
            // InternalCHARTS.g:897:1: ( ( rule__GSSChartsCharts__VersionAssignment_3_1_2 ) )
            {
            // InternalCHARTS.g:897:1: ( ( rule__GSSChartsCharts__VersionAssignment_3_1_2 ) )
            // InternalCHARTS.g:898:2: ( rule__GSSChartsCharts__VersionAssignment_3_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getVersionAssignment_3_1_2()); 
            }
            // InternalCHARTS.g:899:2: ( rule__GSSChartsCharts__VersionAssignment_3_1_2 )
            // InternalCHARTS.g:899:3: rule__GSSChartsCharts__VersionAssignment_3_1_2
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
    // InternalCHARTS.g:907:1: rule__GSSChartsCharts__Group_3_1__3 : rule__GSSChartsCharts__Group_3_1__3__Impl ;
    public final void rule__GSSChartsCharts__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:911:1: ( rule__GSSChartsCharts__Group_3_1__3__Impl )
            // InternalCHARTS.g:912:2: rule__GSSChartsCharts__Group_3_1__3__Impl
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
    // InternalCHARTS.g:918:1: rule__GSSChartsCharts__Group_3_1__3__Impl : ( ';' ) ;
    public final void rule__GSSChartsCharts__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:922:1: ( ( ';' ) )
            // InternalCHARTS.g:923:1: ( ';' )
            {
            // InternalCHARTS.g:923:1: ( ';' )
            // InternalCHARTS.g:924:2: ';'
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
    // InternalCHARTS.g:934:1: rule__GSSChartsChart__Group__0 : rule__GSSChartsChart__Group__0__Impl rule__GSSChartsChart__Group__1 ;
    public final void rule__GSSChartsChart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:938:1: ( rule__GSSChartsChart__Group__0__Impl rule__GSSChartsChart__Group__1 )
            // InternalCHARTS.g:939:2: rule__GSSChartsChart__Group__0__Impl rule__GSSChartsChart__Group__1
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
    // InternalCHARTS.g:946:1: rule__GSSChartsChart__Group__0__Impl : ( 'GSSChartsChart' ) ;
    public final void rule__GSSChartsChart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:950:1: ( ( 'GSSChartsChart' ) )
            // InternalCHARTS.g:951:1: ( 'GSSChartsChart' )
            {
            // InternalCHARTS.g:951:1: ( 'GSSChartsChart' )
            // InternalCHARTS.g:952:2: 'GSSChartsChart'
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
    // InternalCHARTS.g:961:1: rule__GSSChartsChart__Group__1 : rule__GSSChartsChart__Group__1__Impl rule__GSSChartsChart__Group__2 ;
    public final void rule__GSSChartsChart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:965:1: ( rule__GSSChartsChart__Group__1__Impl rule__GSSChartsChart__Group__2 )
            // InternalCHARTS.g:966:2: rule__GSSChartsChart__Group__1__Impl rule__GSSChartsChart__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
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
    // InternalCHARTS.g:973:1: rule__GSSChartsChart__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSChartsChart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:977:1: ( ( '{' ) )
            // InternalCHARTS.g:978:1: ( '{' )
            {
            // InternalCHARTS.g:978:1: ( '{' )
            // InternalCHARTS.g:979:2: '{'
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
    // InternalCHARTS.g:988:1: rule__GSSChartsChart__Group__2 : rule__GSSChartsChart__Group__2__Impl rule__GSSChartsChart__Group__3 ;
    public final void rule__GSSChartsChart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:992:1: ( rule__GSSChartsChart__Group__2__Impl rule__GSSChartsChart__Group__3 )
            // InternalCHARTS.g:993:2: rule__GSSChartsChart__Group__2__Impl rule__GSSChartsChart__Group__3
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
    // InternalCHARTS.g:1000:1: rule__GSSChartsChart__Group__2__Impl : ( 'id' ) ;
    public final void rule__GSSChartsChart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1004:1: ( ( 'id' ) )
            // InternalCHARTS.g:1005:1: ( 'id' )
            {
            // InternalCHARTS.g:1005:1: ( 'id' )
            // InternalCHARTS.g:1006:2: 'id'
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
    // InternalCHARTS.g:1015:1: rule__GSSChartsChart__Group__3 : rule__GSSChartsChart__Group__3__Impl rule__GSSChartsChart__Group__4 ;
    public final void rule__GSSChartsChart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1019:1: ( rule__GSSChartsChart__Group__3__Impl rule__GSSChartsChart__Group__4 )
            // InternalCHARTS.g:1020:2: rule__GSSChartsChart__Group__3__Impl rule__GSSChartsChart__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalCHARTS.g:1027:1: rule__GSSChartsChart__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSChartsChart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1031:1: ( ( ':=' ) )
            // InternalCHARTS.g:1032:1: ( ':=' )
            {
            // InternalCHARTS.g:1032:1: ( ':=' )
            // InternalCHARTS.g:1033:2: ':='
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
    // InternalCHARTS.g:1042:1: rule__GSSChartsChart__Group__4 : rule__GSSChartsChart__Group__4__Impl rule__GSSChartsChart__Group__5 ;
    public final void rule__GSSChartsChart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1046:1: ( rule__GSSChartsChart__Group__4__Impl rule__GSSChartsChart__Group__5 )
            // InternalCHARTS.g:1047:2: rule__GSSChartsChart__Group__4__Impl rule__GSSChartsChart__Group__5
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
    // InternalCHARTS.g:1054:1: rule__GSSChartsChart__Group__4__Impl : ( ( rule__GSSChartsChart__IdAssignment_4 ) ) ;
    public final void rule__GSSChartsChart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1058:1: ( ( ( rule__GSSChartsChart__IdAssignment_4 ) ) )
            // InternalCHARTS.g:1059:1: ( ( rule__GSSChartsChart__IdAssignment_4 ) )
            {
            // InternalCHARTS.g:1059:1: ( ( rule__GSSChartsChart__IdAssignment_4 ) )
            // InternalCHARTS.g:1060:2: ( rule__GSSChartsChart__IdAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getIdAssignment_4()); 
            }
            // InternalCHARTS.g:1061:2: ( rule__GSSChartsChart__IdAssignment_4 )
            // InternalCHARTS.g:1061:3: rule__GSSChartsChart__IdAssignment_4
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
    // InternalCHARTS.g:1069:1: rule__GSSChartsChart__Group__5 : rule__GSSChartsChart__Group__5__Impl rule__GSSChartsChart__Group__6 ;
    public final void rule__GSSChartsChart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1073:1: ( rule__GSSChartsChart__Group__5__Impl rule__GSSChartsChart__Group__6 )
            // InternalCHARTS.g:1074:2: rule__GSSChartsChart__Group__5__Impl rule__GSSChartsChart__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalCHARTS.g:1081:1: rule__GSSChartsChart__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSChartsChart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1085:1: ( ( ';' ) )
            // InternalCHARTS.g:1086:1: ( ';' )
            {
            // InternalCHARTS.g:1086:1: ( ';' )
            // InternalCHARTS.g:1087:2: ';'
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
    // InternalCHARTS.g:1096:1: rule__GSSChartsChart__Group__6 : rule__GSSChartsChart__Group__6__Impl rule__GSSChartsChart__Group__7 ;
    public final void rule__GSSChartsChart__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1100:1: ( rule__GSSChartsChart__Group__6__Impl rule__GSSChartsChart__Group__7 )
            // InternalCHARTS.g:1101:2: rule__GSSChartsChart__Group__6__Impl rule__GSSChartsChart__Group__7
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
    // InternalCHARTS.g:1108:1: rule__GSSChartsChart__Group__6__Impl : ( 'name' ) ;
    public final void rule__GSSChartsChart__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1112:1: ( ( 'name' ) )
            // InternalCHARTS.g:1113:1: ( 'name' )
            {
            // InternalCHARTS.g:1113:1: ( 'name' )
            // InternalCHARTS.g:1114:2: 'name'
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
    // InternalCHARTS.g:1123:1: rule__GSSChartsChart__Group__7 : rule__GSSChartsChart__Group__7__Impl rule__GSSChartsChart__Group__8 ;
    public final void rule__GSSChartsChart__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1127:1: ( rule__GSSChartsChart__Group__7__Impl rule__GSSChartsChart__Group__8 )
            // InternalCHARTS.g:1128:2: rule__GSSChartsChart__Group__7__Impl rule__GSSChartsChart__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalCHARTS.g:1135:1: rule__GSSChartsChart__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSChartsChart__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1139:1: ( ( ':=' ) )
            // InternalCHARTS.g:1140:1: ( ':=' )
            {
            // InternalCHARTS.g:1140:1: ( ':=' )
            // InternalCHARTS.g:1141:2: ':='
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
    // InternalCHARTS.g:1150:1: rule__GSSChartsChart__Group__8 : rule__GSSChartsChart__Group__8__Impl rule__GSSChartsChart__Group__9 ;
    public final void rule__GSSChartsChart__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1154:1: ( rule__GSSChartsChart__Group__8__Impl rule__GSSChartsChart__Group__9 )
            // InternalCHARTS.g:1155:2: rule__GSSChartsChart__Group__8__Impl rule__GSSChartsChart__Group__9
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
    // InternalCHARTS.g:1162:1: rule__GSSChartsChart__Group__8__Impl : ( ( rule__GSSChartsChart__NameAssignment_8 ) ) ;
    public final void rule__GSSChartsChart__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1166:1: ( ( ( rule__GSSChartsChart__NameAssignment_8 ) ) )
            // InternalCHARTS.g:1167:1: ( ( rule__GSSChartsChart__NameAssignment_8 ) )
            {
            // InternalCHARTS.g:1167:1: ( ( rule__GSSChartsChart__NameAssignment_8 ) )
            // InternalCHARTS.g:1168:2: ( rule__GSSChartsChart__NameAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getNameAssignment_8()); 
            }
            // InternalCHARTS.g:1169:2: ( rule__GSSChartsChart__NameAssignment_8 )
            // InternalCHARTS.g:1169:3: rule__GSSChartsChart__NameAssignment_8
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
    // InternalCHARTS.g:1177:1: rule__GSSChartsChart__Group__9 : rule__GSSChartsChart__Group__9__Impl rule__GSSChartsChart__Group__10 ;
    public final void rule__GSSChartsChart__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1181:1: ( rule__GSSChartsChart__Group__9__Impl rule__GSSChartsChart__Group__10 )
            // InternalCHARTS.g:1182:2: rule__GSSChartsChart__Group__9__Impl rule__GSSChartsChart__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_18);
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
    // InternalCHARTS.g:1189:1: rule__GSSChartsChart__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSChartsChart__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1193:1: ( ( ';' ) )
            // InternalCHARTS.g:1194:1: ( ';' )
            {
            // InternalCHARTS.g:1194:1: ( ';' )
            // InternalCHARTS.g:1195:2: ';'
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
    // InternalCHARTS.g:1204:1: rule__GSSChartsChart__Group__10 : rule__GSSChartsChart__Group__10__Impl rule__GSSChartsChart__Group__11 ;
    public final void rule__GSSChartsChart__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1208:1: ( rule__GSSChartsChart__Group__10__Impl rule__GSSChartsChart__Group__11 )
            // InternalCHARTS.g:1209:2: rule__GSSChartsChart__Group__10__Impl rule__GSSChartsChart__Group__11
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
    // InternalCHARTS.g:1216:1: rule__GSSChartsChart__Group__10__Impl : ( 'y_units' ) ;
    public final void rule__GSSChartsChart__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1220:1: ( ( 'y_units' ) )
            // InternalCHARTS.g:1221:1: ( 'y_units' )
            {
            // InternalCHARTS.g:1221:1: ( 'y_units' )
            // InternalCHARTS.g:1222:2: 'y_units'
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
    // InternalCHARTS.g:1231:1: rule__GSSChartsChart__Group__11 : rule__GSSChartsChart__Group__11__Impl rule__GSSChartsChart__Group__12 ;
    public final void rule__GSSChartsChart__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1235:1: ( rule__GSSChartsChart__Group__11__Impl rule__GSSChartsChart__Group__12 )
            // InternalCHARTS.g:1236:2: rule__GSSChartsChart__Group__11__Impl rule__GSSChartsChart__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalCHARTS.g:1243:1: rule__GSSChartsChart__Group__11__Impl : ( ':=' ) ;
    public final void rule__GSSChartsChart__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1247:1: ( ( ':=' ) )
            // InternalCHARTS.g:1248:1: ( ':=' )
            {
            // InternalCHARTS.g:1248:1: ( ':=' )
            // InternalCHARTS.g:1249:2: ':='
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
    // InternalCHARTS.g:1258:1: rule__GSSChartsChart__Group__12 : rule__GSSChartsChart__Group__12__Impl rule__GSSChartsChart__Group__13 ;
    public final void rule__GSSChartsChart__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1262:1: ( rule__GSSChartsChart__Group__12__Impl rule__GSSChartsChart__Group__13 )
            // InternalCHARTS.g:1263:2: rule__GSSChartsChart__Group__12__Impl rule__GSSChartsChart__Group__13
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
    // InternalCHARTS.g:1270:1: rule__GSSChartsChart__Group__12__Impl : ( ( rule__GSSChartsChart__Y_unitsAssignment_12 ) ) ;
    public final void rule__GSSChartsChart__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1274:1: ( ( ( rule__GSSChartsChart__Y_unitsAssignment_12 ) ) )
            // InternalCHARTS.g:1275:1: ( ( rule__GSSChartsChart__Y_unitsAssignment_12 ) )
            {
            // InternalCHARTS.g:1275:1: ( ( rule__GSSChartsChart__Y_unitsAssignment_12 ) )
            // InternalCHARTS.g:1276:2: ( rule__GSSChartsChart__Y_unitsAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getY_unitsAssignment_12()); 
            }
            // InternalCHARTS.g:1277:2: ( rule__GSSChartsChart__Y_unitsAssignment_12 )
            // InternalCHARTS.g:1277:3: rule__GSSChartsChart__Y_unitsAssignment_12
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
    // InternalCHARTS.g:1285:1: rule__GSSChartsChart__Group__13 : rule__GSSChartsChart__Group__13__Impl rule__GSSChartsChart__Group__14 ;
    public final void rule__GSSChartsChart__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1289:1: ( rule__GSSChartsChart__Group__13__Impl rule__GSSChartsChart__Group__14 )
            // InternalCHARTS.g:1290:2: rule__GSSChartsChart__Group__13__Impl rule__GSSChartsChart__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalCHARTS.g:1297:1: rule__GSSChartsChart__Group__13__Impl : ( ';' ) ;
    public final void rule__GSSChartsChart__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1301:1: ( ( ';' ) )
            // InternalCHARTS.g:1302:1: ( ';' )
            {
            // InternalCHARTS.g:1302:1: ( ';' )
            // InternalCHARTS.g:1303:2: ';'
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
    // InternalCHARTS.g:1312:1: rule__GSSChartsChart__Group__14 : rule__GSSChartsChart__Group__14__Impl rule__GSSChartsChart__Group__15 ;
    public final void rule__GSSChartsChart__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1316:1: ( rule__GSSChartsChart__Group__14__Impl rule__GSSChartsChart__Group__15 )
            // InternalCHARTS.g:1317:2: rule__GSSChartsChart__Group__14__Impl rule__GSSChartsChart__Group__15
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
    // InternalCHARTS.g:1324:1: rule__GSSChartsChart__Group__14__Impl : ( 'y_max' ) ;
    public final void rule__GSSChartsChart__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1328:1: ( ( 'y_max' ) )
            // InternalCHARTS.g:1329:1: ( 'y_max' )
            {
            // InternalCHARTS.g:1329:1: ( 'y_max' )
            // InternalCHARTS.g:1330:2: 'y_max'
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
    // InternalCHARTS.g:1339:1: rule__GSSChartsChart__Group__15 : rule__GSSChartsChart__Group__15__Impl rule__GSSChartsChart__Group__16 ;
    public final void rule__GSSChartsChart__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1343:1: ( rule__GSSChartsChart__Group__15__Impl rule__GSSChartsChart__Group__16 )
            // InternalCHARTS.g:1344:2: rule__GSSChartsChart__Group__15__Impl rule__GSSChartsChart__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalCHARTS.g:1351:1: rule__GSSChartsChart__Group__15__Impl : ( ':=' ) ;
    public final void rule__GSSChartsChart__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1355:1: ( ( ':=' ) )
            // InternalCHARTS.g:1356:1: ( ':=' )
            {
            // InternalCHARTS.g:1356:1: ( ':=' )
            // InternalCHARTS.g:1357:2: ':='
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
    // InternalCHARTS.g:1366:1: rule__GSSChartsChart__Group__16 : rule__GSSChartsChart__Group__16__Impl rule__GSSChartsChart__Group__17 ;
    public final void rule__GSSChartsChart__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1370:1: ( rule__GSSChartsChart__Group__16__Impl rule__GSSChartsChart__Group__17 )
            // InternalCHARTS.g:1371:2: rule__GSSChartsChart__Group__16__Impl rule__GSSChartsChart__Group__17
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
    // InternalCHARTS.g:1378:1: rule__GSSChartsChart__Group__16__Impl : ( ( rule__GSSChartsChart__Y_maxAssignment_16 ) ) ;
    public final void rule__GSSChartsChart__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1382:1: ( ( ( rule__GSSChartsChart__Y_maxAssignment_16 ) ) )
            // InternalCHARTS.g:1383:1: ( ( rule__GSSChartsChart__Y_maxAssignment_16 ) )
            {
            // InternalCHARTS.g:1383:1: ( ( rule__GSSChartsChart__Y_maxAssignment_16 ) )
            // InternalCHARTS.g:1384:2: ( rule__GSSChartsChart__Y_maxAssignment_16 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getY_maxAssignment_16()); 
            }
            // InternalCHARTS.g:1385:2: ( rule__GSSChartsChart__Y_maxAssignment_16 )
            // InternalCHARTS.g:1385:3: rule__GSSChartsChart__Y_maxAssignment_16
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
    // InternalCHARTS.g:1393:1: rule__GSSChartsChart__Group__17 : rule__GSSChartsChart__Group__17__Impl rule__GSSChartsChart__Group__18 ;
    public final void rule__GSSChartsChart__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1397:1: ( rule__GSSChartsChart__Group__17__Impl rule__GSSChartsChart__Group__18 )
            // InternalCHARTS.g:1398:2: rule__GSSChartsChart__Group__17__Impl rule__GSSChartsChart__Group__18
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
    // InternalCHARTS.g:1405:1: rule__GSSChartsChart__Group__17__Impl : ( ';' ) ;
    public final void rule__GSSChartsChart__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1409:1: ( ( ';' ) )
            // InternalCHARTS.g:1410:1: ( ';' )
            {
            // InternalCHARTS.g:1410:1: ( ';' )
            // InternalCHARTS.g:1411:2: ';'
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
    // InternalCHARTS.g:1420:1: rule__GSSChartsChart__Group__18 : rule__GSSChartsChart__Group__18__Impl rule__GSSChartsChart__Group__19 ;
    public final void rule__GSSChartsChart__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1424:1: ( rule__GSSChartsChart__Group__18__Impl rule__GSSChartsChart__Group__19 )
            // InternalCHARTS.g:1425:2: rule__GSSChartsChart__Group__18__Impl rule__GSSChartsChart__Group__19
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
    // InternalCHARTS.g:1432:1: rule__GSSChartsChart__Group__18__Impl : ( '}' ) ;
    public final void rule__GSSChartsChart__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1436:1: ( ( '}' ) )
            // InternalCHARTS.g:1437:1: ( '}' )
            {
            // InternalCHARTS.g:1437:1: ( '}' )
            // InternalCHARTS.g:1438:2: '}'
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
    // InternalCHARTS.g:1447:1: rule__GSSChartsChart__Group__19 : rule__GSSChartsChart__Group__19__Impl ;
    public final void rule__GSSChartsChart__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1451:1: ( rule__GSSChartsChart__Group__19__Impl )
            // InternalCHARTS.g:1452:2: rule__GSSChartsChart__Group__19__Impl
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
    // InternalCHARTS.g:1458:1: rule__GSSChartsChart__Group__19__Impl : ( ';' ) ;
    public final void rule__GSSChartsChart__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1462:1: ( ( ';' ) )
            // InternalCHARTS.g:1463:1: ( ';' )
            {
            // InternalCHARTS.g:1463:1: ( ';' )
            // InternalCHARTS.g:1464:2: ';'
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
    // InternalCHARTS.g:1474:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1478:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalCHARTS.g:1479:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
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
    // InternalCHARTS.g:1486:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1490:1: ( ( RULE_ID ) )
            // InternalCHARTS.g:1491:1: ( RULE_ID )
            {
            // InternalCHARTS.g:1491:1: ( RULE_ID )
            // InternalCHARTS.g:1492:2: RULE_ID
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
    // InternalCHARTS.g:1501:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1505:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalCHARTS.g:1506:2: rule__QualifiedName__Group__1__Impl
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
    // InternalCHARTS.g:1512:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1516:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalCHARTS.g:1517:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalCHARTS.g:1517:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalCHARTS.g:1518:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalCHARTS.g:1519:2: ( rule__QualifiedName__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCHARTS.g:1519:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_22);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalCHARTS.g:1528:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1532:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalCHARTS.g:1533:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalCHARTS.g:1540:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1544:1: ( ( '.' ) )
            // InternalCHARTS.g:1545:1: ( '.' )
            {
            // InternalCHARTS.g:1545:1: ( '.' )
            // InternalCHARTS.g:1546:2: '.'
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
    // InternalCHARTS.g:1555:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1559:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalCHARTS.g:1560:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalCHARTS.g:1566:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1570:1: ( ( RULE_ID ) )
            // InternalCHARTS.g:1571:1: ( RULE_ID )
            {
            // InternalCHARTS.g:1571:1: ( RULE_ID )
            // InternalCHARTS.g:1572:2: RULE_ID
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
    // InternalCHARTS.g:1582:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1586:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalCHARTS.g:1587:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
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
    // InternalCHARTS.g:1594:1: rule__Version__Group__0__Impl : ( ( rule__Version__Alternatives_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1598:1: ( ( ( rule__Version__Alternatives_0 ) ) )
            // InternalCHARTS.g:1599:1: ( ( rule__Version__Alternatives_0 ) )
            {
            // InternalCHARTS.g:1599:1: ( ( rule__Version__Alternatives_0 ) )
            // InternalCHARTS.g:1600:2: ( rule__Version__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_0()); 
            }
            // InternalCHARTS.g:1601:2: ( rule__Version__Alternatives_0 )
            // InternalCHARTS.g:1601:3: rule__Version__Alternatives_0
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
    // InternalCHARTS.g:1609:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1613:1: ( rule__Version__Group__1__Impl )
            // InternalCHARTS.g:1614:2: rule__Version__Group__1__Impl
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
    // InternalCHARTS.g:1620:1: rule__Version__Group__1__Impl : ( ( rule__Version__Group_1__0 )* ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1624:1: ( ( ( rule__Version__Group_1__0 )* ) )
            // InternalCHARTS.g:1625:1: ( ( rule__Version__Group_1__0 )* )
            {
            // InternalCHARTS.g:1625:1: ( ( rule__Version__Group_1__0 )* )
            // InternalCHARTS.g:1626:2: ( rule__Version__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1()); 
            }
            // InternalCHARTS.g:1627:2: ( rule__Version__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCHARTS.g:1627:3: rule__Version__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_22);
            	    rule__Version__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalCHARTS.g:1636:1: rule__Version__Group_0_1__0 : rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 ;
    public final void rule__Version__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1640:1: ( rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 )
            // InternalCHARTS.g:1641:2: rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalCHARTS.g:1648:1: rule__Version__Group_0_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1652:1: ( ( ( RULE_INT )? ) )
            // InternalCHARTS.g:1653:1: ( ( RULE_INT )? )
            {
            // InternalCHARTS.g:1653:1: ( ( RULE_INT )? )
            // InternalCHARTS.g:1654:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
            }
            // InternalCHARTS.g:1655:2: ( RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCHARTS.g:1655:3: RULE_INT
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
    // InternalCHARTS.g:1663:1: rule__Version__Group_0_1__1 : rule__Version__Group_0_1__1__Impl ;
    public final void rule__Version__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1667:1: ( rule__Version__Group_0_1__1__Impl )
            // InternalCHARTS.g:1668:2: rule__Version__Group_0_1__1__Impl
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
    // InternalCHARTS.g:1674:1: rule__Version__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1678:1: ( ( RULE_ID ) )
            // InternalCHARTS.g:1679:1: ( RULE_ID )
            {
            // InternalCHARTS.g:1679:1: ( RULE_ID )
            // InternalCHARTS.g:1680:2: RULE_ID
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
    // InternalCHARTS.g:1690:1: rule__Version__Group_1__0 : rule__Version__Group_1__0__Impl rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1694:1: ( rule__Version__Group_1__0__Impl rule__Version__Group_1__1 )
            // InternalCHARTS.g:1695:2: rule__Version__Group_1__0__Impl rule__Version__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalCHARTS.g:1702:1: rule__Version__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1706:1: ( ( '.' ) )
            // InternalCHARTS.g:1707:1: ( '.' )
            {
            // InternalCHARTS.g:1707:1: ( '.' )
            // InternalCHARTS.g:1708:2: '.'
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
    // InternalCHARTS.g:1717:1: rule__Version__Group_1__1 : rule__Version__Group_1__1__Impl ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1721:1: ( rule__Version__Group_1__1__Impl )
            // InternalCHARTS.g:1722:2: rule__Version__Group_1__1__Impl
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
    // InternalCHARTS.g:1728:1: rule__Version__Group_1__1__Impl : ( ( rule__Version__Alternatives_1_1 ) ) ;
    public final void rule__Version__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1732:1: ( ( ( rule__Version__Alternatives_1_1 ) ) )
            // InternalCHARTS.g:1733:1: ( ( rule__Version__Alternatives_1_1 ) )
            {
            // InternalCHARTS.g:1733:1: ( ( rule__Version__Alternatives_1_1 ) )
            // InternalCHARTS.g:1734:2: ( rule__Version__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_1_1()); 
            }
            // InternalCHARTS.g:1735:2: ( rule__Version__Alternatives_1_1 )
            // InternalCHARTS.g:1735:3: rule__Version__Alternatives_1_1
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
    // InternalCHARTS.g:1744:1: rule__Version__Group_1_1_1__0 : rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 ;
    public final void rule__Version__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1748:1: ( rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 )
            // InternalCHARTS.g:1749:2: rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalCHARTS.g:1756:1: rule__Version__Group_1_1_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1760:1: ( ( ( RULE_INT )? ) )
            // InternalCHARTS.g:1761:1: ( ( RULE_INT )? )
            {
            // InternalCHARTS.g:1761:1: ( ( RULE_INT )? )
            // InternalCHARTS.g:1762:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
            }
            // InternalCHARTS.g:1763:2: ( RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCHARTS.g:1763:3: RULE_INT
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
    // InternalCHARTS.g:1771:1: rule__Version__Group_1_1_1__1 : rule__Version__Group_1_1_1__1__Impl ;
    public final void rule__Version__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1775:1: ( rule__Version__Group_1_1_1__1__Impl )
            // InternalCHARTS.g:1776:2: rule__Version__Group_1_1_1__1__Impl
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
    // InternalCHARTS.g:1782:1: rule__Version__Group_1_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1786:1: ( ( RULE_ID ) )
            // InternalCHARTS.g:1787:1: ( RULE_ID )
            {
            // InternalCHARTS.g:1787:1: ( RULE_ID )
            // InternalCHARTS.g:1788:2: RULE_ID
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
    // InternalCHARTS.g:1798:1: rule__VersionedQualifiedName__Group__0 : rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 ;
    public final void rule__VersionedQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1802:1: ( rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 )
            // InternalCHARTS.g:1803:2: rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
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
    // InternalCHARTS.g:1810:1: rule__VersionedQualifiedName__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__VersionedQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1814:1: ( ( ruleQualifiedName ) )
            // InternalCHARTS.g:1815:1: ( ruleQualifiedName )
            {
            // InternalCHARTS.g:1815:1: ( ruleQualifiedName )
            // InternalCHARTS.g:1816:2: ruleQualifiedName
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
    // InternalCHARTS.g:1825:1: rule__VersionedQualifiedName__Group__1 : rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 ;
    public final void rule__VersionedQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1829:1: ( rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 )
            // InternalCHARTS.g:1830:2: rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalCHARTS.g:1837:1: rule__VersionedQualifiedName__Group__1__Impl : ( '(' ) ;
    public final void rule__VersionedQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1841:1: ( ( '(' ) )
            // InternalCHARTS.g:1842:1: ( '(' )
            {
            // InternalCHARTS.g:1842:1: ( '(' )
            // InternalCHARTS.g:1843:2: '('
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
    // InternalCHARTS.g:1852:1: rule__VersionedQualifiedName__Group__2 : rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 ;
    public final void rule__VersionedQualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1856:1: ( rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 )
            // InternalCHARTS.g:1857:2: rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalCHARTS.g:1864:1: rule__VersionedQualifiedName__Group__2__Impl : ( ruleVersion ) ;
    public final void rule__VersionedQualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1868:1: ( ( ruleVersion ) )
            // InternalCHARTS.g:1869:1: ( ruleVersion )
            {
            // InternalCHARTS.g:1869:1: ( ruleVersion )
            // InternalCHARTS.g:1870:2: ruleVersion
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
    // InternalCHARTS.g:1879:1: rule__VersionedQualifiedName__Group__3 : rule__VersionedQualifiedName__Group__3__Impl ;
    public final void rule__VersionedQualifiedName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1883:1: ( rule__VersionedQualifiedName__Group__3__Impl )
            // InternalCHARTS.g:1884:2: rule__VersionedQualifiedName__Group__3__Impl
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
    // InternalCHARTS.g:1890:1: rule__VersionedQualifiedName__Group__3__Impl : ( ')' ) ;
    public final void rule__VersionedQualifiedName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1894:1: ( ( ')' ) )
            // InternalCHARTS.g:1895:1: ( ')' )
            {
            // InternalCHARTS.g:1895:1: ( ')' )
            // InternalCHARTS.g:1896:2: ')'
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
    // InternalCHARTS.g:1906:1: rule__INTEGER__Group_0__0 : rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 ;
    public final void rule__INTEGER__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1910:1: ( rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 )
            // InternalCHARTS.g:1911:2: rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
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
    // InternalCHARTS.g:1918:1: rule__INTEGER__Group_0__0__Impl : ( ( '-' )? ) ;
    public final void rule__INTEGER__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1922:1: ( ( ( '-' )? ) )
            // InternalCHARTS.g:1923:1: ( ( '-' )? )
            {
            // InternalCHARTS.g:1923:1: ( ( '-' )? )
            // InternalCHARTS.g:1924:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); 
            }
            // InternalCHARTS.g:1925:2: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCHARTS.g:1925:3: '-'
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
    // InternalCHARTS.g:1933:1: rule__INTEGER__Group_0__1 : rule__INTEGER__Group_0__1__Impl ;
    public final void rule__INTEGER__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1937:1: ( rule__INTEGER__Group_0__1__Impl )
            // InternalCHARTS.g:1938:2: rule__INTEGER__Group_0__1__Impl
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
    // InternalCHARTS.g:1944:1: rule__INTEGER__Group_0__1__Impl : ( RULE_INT ) ;
    public final void rule__INTEGER__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:1948:1: ( ( RULE_INT ) )
            // InternalCHARTS.g:1949:1: ( RULE_INT )
            {
            // InternalCHARTS.g:1949:1: ( RULE_INT )
            // InternalCHARTS.g:1950:2: RULE_INT
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
    // InternalCHARTS.g:1960:1: rule__GSSChartsCharts__UnorderedGroup_3 : rule__GSSChartsCharts__UnorderedGroup_3__0 {...}?;
    public final void rule__GSSChartsCharts__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3());
        	
        try {
            // InternalCHARTS.g:1965:1: ( rule__GSSChartsCharts__UnorderedGroup_3__0 {...}?)
            // InternalCHARTS.g:1966:2: rule__GSSChartsCharts__UnorderedGroup_3__0 {...}?
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
    // InternalCHARTS.g:1974:1: rule__GSSChartsCharts__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__GSSChartsCharts__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalCHARTS.g:1979:1: ( ( ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_1__0 ) ) ) ) ) )
            // InternalCHARTS.g:1980:3: ( ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_1__0 ) ) ) ) )
            {
            // InternalCHARTS.g:1980:3: ( ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_1__0 ) ) ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( LA12_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 0) ) {
                alt12=1;
            }
            else if ( LA12_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 1) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalCHARTS.g:1981:3: ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_0__0 ) ) ) )
                    {
                    // InternalCHARTS.g:1981:3: ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_0__0 ) ) ) )
                    // InternalCHARTS.g:1982:4: {...}? => ( ( ( rule__GSSChartsCharts__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSChartsCharts__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalCHARTS.g:1982:111: ( ( ( rule__GSSChartsCharts__Group_3_0__0 ) ) )
                    // InternalCHARTS.g:1983:5: ( ( rule__GSSChartsCharts__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // InternalCHARTS.g:1989:5: ( ( rule__GSSChartsCharts__Group_3_0__0 ) )
                    // InternalCHARTS.g:1990:6: ( rule__GSSChartsCharts__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSChartsChartsAccess().getGroup_3_0()); 
                    }
                    // InternalCHARTS.g:1991:6: ( rule__GSSChartsCharts__Group_3_0__0 )
                    // InternalCHARTS.g:1991:7: rule__GSSChartsCharts__Group_3_0__0
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
                    // InternalCHARTS.g:1996:3: ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_1__0 ) ) ) )
                    {
                    // InternalCHARTS.g:1996:3: ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_1__0 ) ) ) )
                    // InternalCHARTS.g:1997:4: {...}? => ( ( ( rule__GSSChartsCharts__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSChartsCharts__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalCHARTS.g:1997:111: ( ( ( rule__GSSChartsCharts__Group_3_1__0 ) ) )
                    // InternalCHARTS.g:1998:5: ( ( rule__GSSChartsCharts__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // InternalCHARTS.g:2004:5: ( ( rule__GSSChartsCharts__Group_3_1__0 ) )
                    // InternalCHARTS.g:2005:6: ( rule__GSSChartsCharts__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSChartsChartsAccess().getGroup_3_1()); 
                    }
                    // InternalCHARTS.g:2006:6: ( rule__GSSChartsCharts__Group_3_1__0 )
                    // InternalCHARTS.g:2006:7: rule__GSSChartsCharts__Group_3_1__0
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
    // InternalCHARTS.g:2019:1: rule__GSSChartsCharts__UnorderedGroup_3__0 : rule__GSSChartsCharts__UnorderedGroup_3__Impl ( rule__GSSChartsCharts__UnorderedGroup_3__1 )? ;
    public final void rule__GSSChartsCharts__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:2023:1: ( rule__GSSChartsCharts__UnorderedGroup_3__Impl ( rule__GSSChartsCharts__UnorderedGroup_3__1 )? )
            // InternalCHARTS.g:2024:2: rule__GSSChartsCharts__UnorderedGroup_3__Impl ( rule__GSSChartsCharts__UnorderedGroup_3__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__GSSChartsCharts__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalCHARTS.g:2025:2: ( rule__GSSChartsCharts__UnorderedGroup_3__1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( LA13_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 0) ) {
                alt13=1;
            }
            else if ( LA13_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 1) ) {
                alt13=1;
            }
            switch (alt13) {
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
    // InternalCHARTS.g:2031:1: rule__GSSChartsCharts__UnorderedGroup_3__1 : rule__GSSChartsCharts__UnorderedGroup_3__Impl ;
    public final void rule__GSSChartsCharts__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:2035:1: ( rule__GSSChartsCharts__UnorderedGroup_3__Impl )
            // InternalCHARTS.g:2036:2: rule__GSSChartsCharts__UnorderedGroup_3__Impl
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
    // InternalCHARTS.g:2043:1: rule__GSSModelFile__ImportsAssignment_0 : ( ruleGSSModelFileImport ) ;
    public final void rule__GSSModelFile__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:2047:1: ( ( ruleGSSModelFileImport ) )
            // InternalCHARTS.g:2048:2: ( ruleGSSModelFileImport )
            {
            // InternalCHARTS.g:2048:2: ( ruleGSSModelFileImport )
            // InternalCHARTS.g:2049:3: ruleGSSModelFileImport
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
    // InternalCHARTS.g:2058:1: rule__GSSModelFile__ElementAssignment_1 : ( ruleGSSChartsCharts ) ;
    public final void rule__GSSModelFile__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:2062:1: ( ( ruleGSSChartsCharts ) )
            // InternalCHARTS.g:2063:2: ( ruleGSSChartsCharts )
            {
            // InternalCHARTS.g:2063:2: ( ruleGSSChartsCharts )
            // InternalCHARTS.g:2064:3: ruleGSSChartsCharts
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
    // InternalCHARTS.g:2073:1: rule__GSSModelFileImport__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GSSModelFileImport__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:2077:1: ( ( RULE_STRING ) )
            // InternalCHARTS.g:2078:2: ( RULE_STRING )
            {
            // InternalCHARTS.g:2078:2: ( RULE_STRING )
            // InternalCHARTS.g:2079:3: RULE_STRING
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
    // InternalCHARTS.g:2088:1: rule__GSSChartsCharts__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GSSChartsCharts__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:2092:1: ( ( RULE_ID ) )
            // InternalCHARTS.g:2093:2: ( RULE_ID )
            {
            // InternalCHARTS.g:2093:2: ( RULE_ID )
            // InternalCHARTS.g:2094:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartsAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartsAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
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
    // InternalCHARTS.g:2103:1: rule__GSSChartsCharts__UriAssignment_3_0_2 : ( ruleQualifiedName ) ;
    public final void rule__GSSChartsCharts__UriAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:2107:1: ( ( ruleQualifiedName ) )
            // InternalCHARTS.g:2108:2: ( ruleQualifiedName )
            {
            // InternalCHARTS.g:2108:2: ( ruleQualifiedName )
            // InternalCHARTS.g:2109:3: ruleQualifiedName
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
    // InternalCHARTS.g:2118:1: rule__GSSChartsCharts__VersionAssignment_3_1_2 : ( ruleVersion ) ;
    public final void rule__GSSChartsCharts__VersionAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:2122:1: ( ( ruleVersion ) )
            // InternalCHARTS.g:2123:2: ( ruleVersion )
            {
            // InternalCHARTS.g:2123:2: ( ruleVersion )
            // InternalCHARTS.g:2124:3: ruleVersion
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
    // InternalCHARTS.g:2133:1: rule__GSSChartsCharts__ChartAssignment_4 : ( ruleGSSChartsChart ) ;
    public final void rule__GSSChartsCharts__ChartAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:2137:1: ( ( ruleGSSChartsChart ) )
            // InternalCHARTS.g:2138:2: ( ruleGSSChartsChart )
            {
            // InternalCHARTS.g:2138:2: ( ruleGSSChartsChart )
            // InternalCHARTS.g:2139:3: ruleGSSChartsChart
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
    // InternalCHARTS.g:2148:1: rule__GSSChartsChart__IdAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSChartsChart__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:2152:1: ( ( ruleINTEGER ) )
            // InternalCHARTS.g:2153:2: ( ruleINTEGER )
            {
            // InternalCHARTS.g:2153:2: ( ruleINTEGER )
            // InternalCHARTS.g:2154:3: ruleINTEGER
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
    // InternalCHARTS.g:2163:1: rule__GSSChartsChart__NameAssignment_8 : ( RULE_STRING ) ;
    public final void rule__GSSChartsChart__NameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:2167:1: ( ( RULE_STRING ) )
            // InternalCHARTS.g:2168:2: ( RULE_STRING )
            {
            // InternalCHARTS.g:2168:2: ( RULE_STRING )
            // InternalCHARTS.g:2169:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSChartsChartAccess().getNameSTRINGTerminalRuleCall_8_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSChartsChartAccess().getNameSTRINGTerminalRuleCall_8_0()); 
            }

            }


            }

        }
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
    // InternalCHARTS.g:2178:1: rule__GSSChartsChart__Y_unitsAssignment_12 : ( ruleGSSChartsYUnits ) ;
    public final void rule__GSSChartsChart__Y_unitsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:2182:1: ( ( ruleGSSChartsYUnits ) )
            // InternalCHARTS.g:2183:2: ( ruleGSSChartsYUnits )
            {
            // InternalCHARTS.g:2183:2: ( ruleGSSChartsYUnits )
            // InternalCHARTS.g:2184:3: ruleGSSChartsYUnits
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
    // InternalCHARTS.g:2193:1: rule__GSSChartsChart__Y_maxAssignment_16 : ( ruleINTEGER ) ;
    public final void rule__GSSChartsChart__Y_maxAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCHARTS.g:2197:1: ( ( ruleINTEGER ) )
            // InternalCHARTS.g:2198:2: ( ruleINTEGER )
            {
            // InternalCHARTS.g:2198:2: ( ruleINTEGER )
            // InternalCHARTS.g:2199:3: ruleINTEGER
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

    // $ANTLR start synpred12_InternalCHARTS
    public final void synpred12_InternalCHARTS_fragment() throws RecognitionException {   
        // InternalCHARTS.g:1981:3: ( ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_0__0 ) ) ) ) )
        // InternalCHARTS.g:1981:3: ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_0__0 ) ) ) )
        {
        // InternalCHARTS.g:1981:3: ({...}? => ( ( ( rule__GSSChartsCharts__Group_3_0__0 ) ) ) )
        // InternalCHARTS.g:1982:4: {...}? => ( ( ( rule__GSSChartsCharts__Group_3_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalCHARTS", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalCHARTS.g:1982:111: ( ( ( rule__GSSChartsCharts__Group_3_0__0 ) ) )
        // InternalCHARTS.g:1983:5: ( ( rule__GSSChartsCharts__Group_3_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSChartsChartsAccess().getUnorderedGroup_3(), 0);
        // InternalCHARTS.g:1989:5: ( ( rule__GSSChartsCharts__Group_3_0__0 ) )
        // InternalCHARTS.g:1990:6: ( rule__GSSChartsCharts__Group_3_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSChartsChartsAccess().getGroup_3_0()); 
        }
        // InternalCHARTS.g:1991:6: ( rule__GSSChartsCharts__Group_3_0__0 )
        // InternalCHARTS.g:1991:7: rule__GSSChartsCharts__Group_3_0__0
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
    // $ANTLR end synpred12_InternalCHARTS

    // $ANTLR start synpred13_InternalCHARTS
    public final void synpred13_InternalCHARTS_fragment() throws RecognitionException {   
        // InternalCHARTS.g:2025:2: ( rule__GSSChartsCharts__UnorderedGroup_3__1 )
        // InternalCHARTS.g:2025:2: rule__GSSChartsCharts__UnorderedGroup_3__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSChartsCharts__UnorderedGroup_3__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalCHARTS

    // Delegated rules

    public final boolean synpred12_InternalCHARTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalCHARTS_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000030L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000010L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000300002L});
    }


}