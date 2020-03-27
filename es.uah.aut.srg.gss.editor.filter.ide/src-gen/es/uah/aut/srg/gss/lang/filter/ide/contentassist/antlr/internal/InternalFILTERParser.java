package es.uah.aut.srg.gss.lang.filter.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.gss.lang.filter.services.FILTERGrammarAccess;



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
public class InternalFILTERParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_HEXADECIMAL", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'decimal'", "'hex'", "'binary'", "'char'", "'string'", "'equal'", "'different'", "'bigger_than'", "'smaller_than'", "'bigger_or_equal'", "'smaller_or_equal'", "'data'", "'size'", "'crc'", "'import'", "':='", "';'", "'GSSFilterMaxtermFilter'", "'{'", "'uri'", "'version'", "'formatFile'", "'}'", "'GSSFilterMintermFilter'", "'GSSFilterBoolVar'", "'id'", "'name'", "'constantType'", "'FieldRef'", "'GSSFilterBoolVarFromArrayItem'", "'AIFieldRef'", "'GSSFilterBoolVarFromGroupedArrayItem'", "'group'", "'AIFieldRefs'", "'GSSFilterBoolVarFDIC'", "'GSSFilterFieldOp'", "'type'", "'GSSFilterConstant'", "'value'", "'mask'", "'GSSFilterSelect'", "'fromFile'", "'offset'", "'GSSFilterSelectLine'", "'line'", "'leftTrim'", "'rightTrim'", "'GSSFilterMaxterm'", "'GSSFilterMinterm'", "'GSSFilterBoolVarRef'", "'idRef'", "'.'", "'('", "')'", "'::'", "'-'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int RULE_HEXADECIMAL=5;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalFILTERParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFILTERParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFILTERParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFILTER.g"; }


    	private FILTERGrammarAccess grammarAccess;

    	public void setGrammarAccess(FILTERGrammarAccess grammarAccess) {
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
    // InternalFILTER.g:61:1: entryRuleGSSModelFile : ruleGSSModelFile EOF ;
    public final void entryRuleGSSModelFile() throws RecognitionException {
        try {
            // InternalFILTER.g:62:1: ( ruleGSSModelFile EOF )
            // InternalFILTER.g:63:1: ruleGSSModelFile EOF
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
    // InternalFILTER.g:70:1: ruleGSSModelFile : ( ( rule__GSSModelFile__Group__0 ) ) ;
    public final void ruleGSSModelFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:74:2: ( ( ( rule__GSSModelFile__Group__0 ) ) )
            // InternalFILTER.g:75:2: ( ( rule__GSSModelFile__Group__0 ) )
            {
            // InternalFILTER.g:75:2: ( ( rule__GSSModelFile__Group__0 ) )
            // InternalFILTER.g:76:3: ( rule__GSSModelFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getGroup()); 
            }
            // InternalFILTER.g:77:3: ( rule__GSSModelFile__Group__0 )
            // InternalFILTER.g:77:4: rule__GSSModelFile__Group__0
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
    // InternalFILTER.g:86:1: entryRuleGSSModelFileImport : ruleGSSModelFileImport EOF ;
    public final void entryRuleGSSModelFileImport() throws RecognitionException {
        try {
            // InternalFILTER.g:87:1: ( ruleGSSModelFileImport EOF )
            // InternalFILTER.g:88:1: ruleGSSModelFileImport EOF
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
    // InternalFILTER.g:95:1: ruleGSSModelFileImport : ( ( rule__GSSModelFileImport__Group__0 ) ) ;
    public final void ruleGSSModelFileImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:99:2: ( ( ( rule__GSSModelFileImport__Group__0 ) ) )
            // InternalFILTER.g:100:2: ( ( rule__GSSModelFileImport__Group__0 ) )
            {
            // InternalFILTER.g:100:2: ( ( rule__GSSModelFileImport__Group__0 ) )
            // InternalFILTER.g:101:3: ( rule__GSSModelFileImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getGroup()); 
            }
            // InternalFILTER.g:102:3: ( rule__GSSModelFileImport__Group__0 )
            // InternalFILTER.g:102:4: rule__GSSModelFileImport__Group__0
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


    // $ANTLR start "entryRuleGSSFilterFilter"
    // InternalFILTER.g:111:1: entryRuleGSSFilterFilter : ruleGSSFilterFilter EOF ;
    public final void entryRuleGSSFilterFilter() throws RecognitionException {
        try {
            // InternalFILTER.g:112:1: ( ruleGSSFilterFilter EOF )
            // InternalFILTER.g:113:1: ruleGSSFilterFilter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSFilterFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterFilterRule()); 
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
    // $ANTLR end "entryRuleGSSFilterFilter"


    // $ANTLR start "ruleGSSFilterFilter"
    // InternalFILTER.g:120:1: ruleGSSFilterFilter : ( ( rule__GSSFilterFilter__Alternatives ) ) ;
    public final void ruleGSSFilterFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:124:2: ( ( ( rule__GSSFilterFilter__Alternatives ) ) )
            // InternalFILTER.g:125:2: ( ( rule__GSSFilterFilter__Alternatives ) )
            {
            // InternalFILTER.g:125:2: ( ( rule__GSSFilterFilter__Alternatives ) )
            // InternalFILTER.g:126:3: ( rule__GSSFilterFilter__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterFilterAccess().getAlternatives()); 
            }
            // InternalFILTER.g:127:3: ( rule__GSSFilterFilter__Alternatives )
            // InternalFILTER.g:127:4: rule__GSSFilterFilter__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterFilter__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterFilterAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSFilterFilter"


    // $ANTLR start "entryRuleGSSFilterMaxtermFilter"
    // InternalFILTER.g:136:1: entryRuleGSSFilterMaxtermFilter : ruleGSSFilterMaxtermFilter EOF ;
    public final void entryRuleGSSFilterMaxtermFilter() throws RecognitionException {
        try {
            // InternalFILTER.g:137:1: ( ruleGSSFilterMaxtermFilter EOF )
            // InternalFILTER.g:138:1: ruleGSSFilterMaxtermFilter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSFilterMaxtermFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterRule()); 
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
    // $ANTLR end "entryRuleGSSFilterMaxtermFilter"


    // $ANTLR start "ruleGSSFilterMaxtermFilter"
    // InternalFILTER.g:145:1: ruleGSSFilterMaxtermFilter : ( ( rule__GSSFilterMaxtermFilter__Group__0 ) ) ;
    public final void ruleGSSFilterMaxtermFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:149:2: ( ( ( rule__GSSFilterMaxtermFilter__Group__0 ) ) )
            // InternalFILTER.g:150:2: ( ( rule__GSSFilterMaxtermFilter__Group__0 ) )
            {
            // InternalFILTER.g:150:2: ( ( rule__GSSFilterMaxtermFilter__Group__0 ) )
            // InternalFILTER.g:151:3: ( rule__GSSFilterMaxtermFilter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getGroup()); 
            }
            // InternalFILTER.g:152:3: ( rule__GSSFilterMaxtermFilter__Group__0 )
            // InternalFILTER.g:152:4: rule__GSSFilterMaxtermFilter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxtermFilter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSFilterMaxtermFilter"


    // $ANTLR start "entryRuleGSSFilterAbstractBoolVar"
    // InternalFILTER.g:161:1: entryRuleGSSFilterAbstractBoolVar : ruleGSSFilterAbstractBoolVar EOF ;
    public final void entryRuleGSSFilterAbstractBoolVar() throws RecognitionException {
        try {
            // InternalFILTER.g:162:1: ( ruleGSSFilterAbstractBoolVar EOF )
            // InternalFILTER.g:163:1: ruleGSSFilterAbstractBoolVar EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterAbstractBoolVarRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSFilterAbstractBoolVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterAbstractBoolVarRule()); 
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
    // $ANTLR end "entryRuleGSSFilterAbstractBoolVar"


    // $ANTLR start "ruleGSSFilterAbstractBoolVar"
    // InternalFILTER.g:170:1: ruleGSSFilterAbstractBoolVar : ( ( rule__GSSFilterAbstractBoolVar__Alternatives ) ) ;
    public final void ruleGSSFilterAbstractBoolVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:174:2: ( ( ( rule__GSSFilterAbstractBoolVar__Alternatives ) ) )
            // InternalFILTER.g:175:2: ( ( rule__GSSFilterAbstractBoolVar__Alternatives ) )
            {
            // InternalFILTER.g:175:2: ( ( rule__GSSFilterAbstractBoolVar__Alternatives ) )
            // InternalFILTER.g:176:3: ( rule__GSSFilterAbstractBoolVar__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterAbstractBoolVarAccess().getAlternatives()); 
            }
            // InternalFILTER.g:177:3: ( rule__GSSFilterAbstractBoolVar__Alternatives )
            // InternalFILTER.g:177:4: rule__GSSFilterAbstractBoolVar__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterAbstractBoolVar__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterAbstractBoolVarAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSFilterAbstractBoolVar"


    // $ANTLR start "entryRuleGSSFilterMintermFilter"
    // InternalFILTER.g:186:1: entryRuleGSSFilterMintermFilter : ruleGSSFilterMintermFilter EOF ;
    public final void entryRuleGSSFilterMintermFilter() throws RecognitionException {
        try {
            // InternalFILTER.g:187:1: ( ruleGSSFilterMintermFilter EOF )
            // InternalFILTER.g:188:1: ruleGSSFilterMintermFilter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSFilterMintermFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterRule()); 
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
    // $ANTLR end "entryRuleGSSFilterMintermFilter"


    // $ANTLR start "ruleGSSFilterMintermFilter"
    // InternalFILTER.g:195:1: ruleGSSFilterMintermFilter : ( ( rule__GSSFilterMintermFilter__Group__0 ) ) ;
    public final void ruleGSSFilterMintermFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:199:2: ( ( ( rule__GSSFilterMintermFilter__Group__0 ) ) )
            // InternalFILTER.g:200:2: ( ( rule__GSSFilterMintermFilter__Group__0 ) )
            {
            // InternalFILTER.g:200:2: ( ( rule__GSSFilterMintermFilter__Group__0 ) )
            // InternalFILTER.g:201:3: ( rule__GSSFilterMintermFilter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getGroup()); 
            }
            // InternalFILTER.g:202:3: ( rule__GSSFilterMintermFilter__Group__0 )
            // InternalFILTER.g:202:4: rule__GSSFilterMintermFilter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMintermFilter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSFilterMintermFilter"


    // $ANTLR start "entryRuleGSSFilterBoolVar"
    // InternalFILTER.g:211:1: entryRuleGSSFilterBoolVar : ruleGSSFilterBoolVar EOF ;
    public final void entryRuleGSSFilterBoolVar() throws RecognitionException {
        try {
            // InternalFILTER.g:212:1: ( ruleGSSFilterBoolVar EOF )
            // InternalFILTER.g:213:1: ruleGSSFilterBoolVar EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSFilterBoolVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarRule()); 
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
    // $ANTLR end "entryRuleGSSFilterBoolVar"


    // $ANTLR start "ruleGSSFilterBoolVar"
    // InternalFILTER.g:220:1: ruleGSSFilterBoolVar : ( ( rule__GSSFilterBoolVar__Group__0 ) ) ;
    public final void ruleGSSFilterBoolVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:224:2: ( ( ( rule__GSSFilterBoolVar__Group__0 ) ) )
            // InternalFILTER.g:225:2: ( ( rule__GSSFilterBoolVar__Group__0 ) )
            {
            // InternalFILTER.g:225:2: ( ( rule__GSSFilterBoolVar__Group__0 ) )
            // InternalFILTER.g:226:3: ( rule__GSSFilterBoolVar__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getGroup()); 
            }
            // InternalFILTER.g:227:3: ( rule__GSSFilterBoolVar__Group__0 )
            // InternalFILTER.g:227:4: rule__GSSFilterBoolVar__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSFilterBoolVar"


    // $ANTLR start "entryRuleGSSFilterBoolVarFromArrayItem"
    // InternalFILTER.g:236:1: entryRuleGSSFilterBoolVarFromArrayItem : ruleGSSFilterBoolVarFromArrayItem EOF ;
    public final void entryRuleGSSFilterBoolVarFromArrayItem() throws RecognitionException {
        try {
            // InternalFILTER.g:237:1: ( ruleGSSFilterBoolVarFromArrayItem EOF )
            // InternalFILTER.g:238:1: ruleGSSFilterBoolVarFromArrayItem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSFilterBoolVarFromArrayItem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemRule()); 
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
    // $ANTLR end "entryRuleGSSFilterBoolVarFromArrayItem"


    // $ANTLR start "ruleGSSFilterBoolVarFromArrayItem"
    // InternalFILTER.g:245:1: ruleGSSFilterBoolVarFromArrayItem : ( ( rule__GSSFilterBoolVarFromArrayItem__Group__0 ) ) ;
    public final void ruleGSSFilterBoolVarFromArrayItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:249:2: ( ( ( rule__GSSFilterBoolVarFromArrayItem__Group__0 ) ) )
            // InternalFILTER.g:250:2: ( ( rule__GSSFilterBoolVarFromArrayItem__Group__0 ) )
            {
            // InternalFILTER.g:250:2: ( ( rule__GSSFilterBoolVarFromArrayItem__Group__0 ) )
            // InternalFILTER.g:251:3: ( rule__GSSFilterBoolVarFromArrayItem__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getGroup()); 
            }
            // InternalFILTER.g:252:3: ( rule__GSSFilterBoolVarFromArrayItem__Group__0 )
            // InternalFILTER.g:252:4: rule__GSSFilterBoolVarFromArrayItem__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSFilterBoolVarFromArrayItem"


    // $ANTLR start "entryRuleGSSFilterBoolVarFromGroupedArrayItem"
    // InternalFILTER.g:261:1: entryRuleGSSFilterBoolVarFromGroupedArrayItem : ruleGSSFilterBoolVarFromGroupedArrayItem EOF ;
    public final void entryRuleGSSFilterBoolVarFromGroupedArrayItem() throws RecognitionException {
        try {
            // InternalFILTER.g:262:1: ( ruleGSSFilterBoolVarFromGroupedArrayItem EOF )
            // InternalFILTER.g:263:1: ruleGSSFilterBoolVarFromGroupedArrayItem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSFilterBoolVarFromGroupedArrayItem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule()); 
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
    // $ANTLR end "entryRuleGSSFilterBoolVarFromGroupedArrayItem"


    // $ANTLR start "ruleGSSFilterBoolVarFromGroupedArrayItem"
    // InternalFILTER.g:270:1: ruleGSSFilterBoolVarFromGroupedArrayItem : ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__0 ) ) ;
    public final void ruleGSSFilterBoolVarFromGroupedArrayItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:274:2: ( ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__0 ) ) )
            // InternalFILTER.g:275:2: ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__0 ) )
            {
            // InternalFILTER.g:275:2: ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__0 ) )
            // InternalFILTER.g:276:3: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGroup()); 
            }
            // InternalFILTER.g:277:3: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__0 )
            // InternalFILTER.g:277:4: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSFilterBoolVarFromGroupedArrayItem"


    // $ANTLR start "entryRuleGSSFilterBoolVarFDIC"
    // InternalFILTER.g:286:1: entryRuleGSSFilterBoolVarFDIC : ruleGSSFilterBoolVarFDIC EOF ;
    public final void entryRuleGSSFilterBoolVarFDIC() throws RecognitionException {
        try {
            // InternalFILTER.g:287:1: ( ruleGSSFilterBoolVarFDIC EOF )
            // InternalFILTER.g:288:1: ruleGSSFilterBoolVarFDIC EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFDICRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSFilterBoolVarFDIC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFDICRule()); 
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
    // $ANTLR end "entryRuleGSSFilterBoolVarFDIC"


    // $ANTLR start "ruleGSSFilterBoolVarFDIC"
    // InternalFILTER.g:295:1: ruleGSSFilterBoolVarFDIC : ( ( rule__GSSFilterBoolVarFDIC__Group__0 ) ) ;
    public final void ruleGSSFilterBoolVarFDIC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:299:2: ( ( ( rule__GSSFilterBoolVarFDIC__Group__0 ) ) )
            // InternalFILTER.g:300:2: ( ( rule__GSSFilterBoolVarFDIC__Group__0 ) )
            {
            // InternalFILTER.g:300:2: ( ( rule__GSSFilterBoolVarFDIC__Group__0 ) )
            // InternalFILTER.g:301:3: ( rule__GSSFilterBoolVarFDIC__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFDICAccess().getGroup()); 
            }
            // InternalFILTER.g:302:3: ( rule__GSSFilterBoolVarFDIC__Group__0 )
            // InternalFILTER.g:302:4: rule__GSSFilterBoolVarFDIC__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFDIC__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFDICAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSFilterBoolVarFDIC"


    // $ANTLR start "entryRuleGSSFilterValue"
    // InternalFILTER.g:311:1: entryRuleGSSFilterValue : ruleGSSFilterValue EOF ;
    public final void entryRuleGSSFilterValue() throws RecognitionException {
        try {
            // InternalFILTER.g:312:1: ( ruleGSSFilterValue EOF )
            // InternalFILTER.g:313:1: ruleGSSFilterValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSFilterValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterValueRule()); 
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
    // $ANTLR end "entryRuleGSSFilterValue"


    // $ANTLR start "ruleGSSFilterValue"
    // InternalFILTER.g:320:1: ruleGSSFilterValue : ( ( rule__GSSFilterValue__Alternatives ) ) ;
    public final void ruleGSSFilterValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:324:2: ( ( ( rule__GSSFilterValue__Alternatives ) ) )
            // InternalFILTER.g:325:2: ( ( rule__GSSFilterValue__Alternatives ) )
            {
            // InternalFILTER.g:325:2: ( ( rule__GSSFilterValue__Alternatives ) )
            // InternalFILTER.g:326:3: ( rule__GSSFilterValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterValueAccess().getAlternatives()); 
            }
            // InternalFILTER.g:327:3: ( rule__GSSFilterValue__Alternatives )
            // InternalFILTER.g:327:4: rule__GSSFilterValue__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSFilterValue"


    // $ANTLR start "entryRuleGSSFilterFieldOp"
    // InternalFILTER.g:336:1: entryRuleGSSFilterFieldOp : ruleGSSFilterFieldOp EOF ;
    public final void entryRuleGSSFilterFieldOp() throws RecognitionException {
        try {
            // InternalFILTER.g:337:1: ( ruleGSSFilterFieldOp EOF )
            // InternalFILTER.g:338:1: ruleGSSFilterFieldOp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterFieldOpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSFilterFieldOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterFieldOpRule()); 
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
    // $ANTLR end "entryRuleGSSFilterFieldOp"


    // $ANTLR start "ruleGSSFilterFieldOp"
    // InternalFILTER.g:345:1: ruleGSSFilterFieldOp : ( ( rule__GSSFilterFieldOp__Group__0 ) ) ;
    public final void ruleGSSFilterFieldOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:349:2: ( ( ( rule__GSSFilterFieldOp__Group__0 ) ) )
            // InternalFILTER.g:350:2: ( ( rule__GSSFilterFieldOp__Group__0 ) )
            {
            // InternalFILTER.g:350:2: ( ( rule__GSSFilterFieldOp__Group__0 ) )
            // InternalFILTER.g:351:3: ( rule__GSSFilterFieldOp__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterFieldOpAccess().getGroup()); 
            }
            // InternalFILTER.g:352:3: ( rule__GSSFilterFieldOp__Group__0 )
            // InternalFILTER.g:352:4: rule__GSSFilterFieldOp__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterFieldOp__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterFieldOpAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSFilterFieldOp"


    // $ANTLR start "entryRuleGSSFilterConstant"
    // InternalFILTER.g:361:1: entryRuleGSSFilterConstant : ruleGSSFilterConstant EOF ;
    public final void entryRuleGSSFilterConstant() throws RecognitionException {
        try {
            // InternalFILTER.g:362:1: ( ruleGSSFilterConstant EOF )
            // InternalFILTER.g:363:1: ruleGSSFilterConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterConstantRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSFilterConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterConstantRule()); 
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
    // $ANTLR end "entryRuleGSSFilterConstant"


    // $ANTLR start "ruleGSSFilterConstant"
    // InternalFILTER.g:370:1: ruleGSSFilterConstant : ( ( rule__GSSFilterConstant__Group__0 ) ) ;
    public final void ruleGSSFilterConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:374:2: ( ( ( rule__GSSFilterConstant__Group__0 ) ) )
            // InternalFILTER.g:375:2: ( ( rule__GSSFilterConstant__Group__0 ) )
            {
            // InternalFILTER.g:375:2: ( ( rule__GSSFilterConstant__Group__0 ) )
            // InternalFILTER.g:376:3: ( rule__GSSFilterConstant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterConstantAccess().getGroup()); 
            }
            // InternalFILTER.g:377:3: ( rule__GSSFilterConstant__Group__0 )
            // InternalFILTER.g:377:4: rule__GSSFilterConstant__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterConstant__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterConstantAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSFilterConstant"


    // $ANTLR start "entryRuleGSSFilterSelect"
    // InternalFILTER.g:386:1: entryRuleGSSFilterSelect : ruleGSSFilterSelect EOF ;
    public final void entryRuleGSSFilterSelect() throws RecognitionException {
        try {
            // InternalFILTER.g:387:1: ( ruleGSSFilterSelect EOF )
            // InternalFILTER.g:388:1: ruleGSSFilterSelect EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSFilterSelect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectRule()); 
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
    // $ANTLR end "entryRuleGSSFilterSelect"


    // $ANTLR start "ruleGSSFilterSelect"
    // InternalFILTER.g:395:1: ruleGSSFilterSelect : ( ( rule__GSSFilterSelect__Group__0 ) ) ;
    public final void ruleGSSFilterSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:399:2: ( ( ( rule__GSSFilterSelect__Group__0 ) ) )
            // InternalFILTER.g:400:2: ( ( rule__GSSFilterSelect__Group__0 ) )
            {
            // InternalFILTER.g:400:2: ( ( rule__GSSFilterSelect__Group__0 ) )
            // InternalFILTER.g:401:3: ( rule__GSSFilterSelect__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getGroup()); 
            }
            // InternalFILTER.g:402:3: ( rule__GSSFilterSelect__Group__0 )
            // InternalFILTER.g:402:4: rule__GSSFilterSelect__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSFilterSelect"


    // $ANTLR start "entryRuleGSSFilterSelectLine"
    // InternalFILTER.g:411:1: entryRuleGSSFilterSelectLine : ruleGSSFilterSelectLine EOF ;
    public final void entryRuleGSSFilterSelectLine() throws RecognitionException {
        try {
            // InternalFILTER.g:412:1: ( ruleGSSFilterSelectLine EOF )
            // InternalFILTER.g:413:1: ruleGSSFilterSelectLine EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSFilterSelectLine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineRule()); 
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
    // $ANTLR end "entryRuleGSSFilterSelectLine"


    // $ANTLR start "ruleGSSFilterSelectLine"
    // InternalFILTER.g:420:1: ruleGSSFilterSelectLine : ( ( rule__GSSFilterSelectLine__Group__0 ) ) ;
    public final void ruleGSSFilterSelectLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:424:2: ( ( ( rule__GSSFilterSelectLine__Group__0 ) ) )
            // InternalFILTER.g:425:2: ( ( rule__GSSFilterSelectLine__Group__0 ) )
            {
            // InternalFILTER.g:425:2: ( ( rule__GSSFilterSelectLine__Group__0 ) )
            // InternalFILTER.g:426:3: ( rule__GSSFilterSelectLine__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getGroup()); 
            }
            // InternalFILTER.g:427:3: ( rule__GSSFilterSelectLine__Group__0 )
            // InternalFILTER.g:427:4: rule__GSSFilterSelectLine__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSFilterSelectLine"


    // $ANTLR start "entryRuleGSSFilterMaxterm"
    // InternalFILTER.g:436:1: entryRuleGSSFilterMaxterm : ruleGSSFilterMaxterm EOF ;
    public final void entryRuleGSSFilterMaxterm() throws RecognitionException {
        try {
            // InternalFILTER.g:437:1: ( ruleGSSFilterMaxterm EOF )
            // InternalFILTER.g:438:1: ruleGSSFilterMaxterm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSFilterMaxterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermRule()); 
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
    // $ANTLR end "entryRuleGSSFilterMaxterm"


    // $ANTLR start "ruleGSSFilterMaxterm"
    // InternalFILTER.g:445:1: ruleGSSFilterMaxterm : ( ( rule__GSSFilterMaxterm__Group__0 ) ) ;
    public final void ruleGSSFilterMaxterm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:449:2: ( ( ( rule__GSSFilterMaxterm__Group__0 ) ) )
            // InternalFILTER.g:450:2: ( ( rule__GSSFilterMaxterm__Group__0 ) )
            {
            // InternalFILTER.g:450:2: ( ( rule__GSSFilterMaxterm__Group__0 ) )
            // InternalFILTER.g:451:3: ( rule__GSSFilterMaxterm__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermAccess().getGroup()); 
            }
            // InternalFILTER.g:452:3: ( rule__GSSFilterMaxterm__Group__0 )
            // InternalFILTER.g:452:4: rule__GSSFilterMaxterm__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxterm__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSFilterMaxterm"


    // $ANTLR start "entryRuleGSSFilterMinterm"
    // InternalFILTER.g:461:1: entryRuleGSSFilterMinterm : ruleGSSFilterMinterm EOF ;
    public final void entryRuleGSSFilterMinterm() throws RecognitionException {
        try {
            // InternalFILTER.g:462:1: ( ruleGSSFilterMinterm EOF )
            // InternalFILTER.g:463:1: ruleGSSFilterMinterm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSFilterMinterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermRule()); 
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
    // $ANTLR end "entryRuleGSSFilterMinterm"


    // $ANTLR start "ruleGSSFilterMinterm"
    // InternalFILTER.g:470:1: ruleGSSFilterMinterm : ( ( rule__GSSFilterMinterm__Group__0 ) ) ;
    public final void ruleGSSFilterMinterm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:474:2: ( ( ( rule__GSSFilterMinterm__Group__0 ) ) )
            // InternalFILTER.g:475:2: ( ( rule__GSSFilterMinterm__Group__0 ) )
            {
            // InternalFILTER.g:475:2: ( ( rule__GSSFilterMinterm__Group__0 ) )
            // InternalFILTER.g:476:3: ( rule__GSSFilterMinterm__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermAccess().getGroup()); 
            }
            // InternalFILTER.g:477:3: ( rule__GSSFilterMinterm__Group__0 )
            // InternalFILTER.g:477:4: rule__GSSFilterMinterm__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMinterm__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSFilterMinterm"


    // $ANTLR start "entryRuleGSSFilterBoolVarRef"
    // InternalFILTER.g:486:1: entryRuleGSSFilterBoolVarRef : ruleGSSFilterBoolVarRef EOF ;
    public final void entryRuleGSSFilterBoolVarRef() throws RecognitionException {
        try {
            // InternalFILTER.g:487:1: ( ruleGSSFilterBoolVarRef EOF )
            // InternalFILTER.g:488:1: ruleGSSFilterBoolVarRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSFilterBoolVarRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarRefRule()); 
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
    // $ANTLR end "entryRuleGSSFilterBoolVarRef"


    // $ANTLR start "ruleGSSFilterBoolVarRef"
    // InternalFILTER.g:495:1: ruleGSSFilterBoolVarRef : ( ( rule__GSSFilterBoolVarRef__Group__0 ) ) ;
    public final void ruleGSSFilterBoolVarRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:499:2: ( ( ( rule__GSSFilterBoolVarRef__Group__0 ) ) )
            // InternalFILTER.g:500:2: ( ( rule__GSSFilterBoolVarRef__Group__0 ) )
            {
            // InternalFILTER.g:500:2: ( ( rule__GSSFilterBoolVarRef__Group__0 ) )
            // InternalFILTER.g:501:3: ( rule__GSSFilterBoolVarRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarRefAccess().getGroup()); 
            }
            // InternalFILTER.g:502:3: ( rule__GSSFilterBoolVarRef__Group__0 )
            // InternalFILTER.g:502:4: rule__GSSFilterBoolVarRef__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarRef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarRefAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSFilterBoolVarRef"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalFILTER.g:511:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalFILTER.g:512:1: ( ruleQualifiedName EOF )
            // InternalFILTER.g:513:1: ruleQualifiedName EOF
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
    // InternalFILTER.g:520:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:524:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalFILTER.g:525:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalFILTER.g:525:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalFILTER.g:526:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalFILTER.g:527:3: ( rule__QualifiedName__Group__0 )
            // InternalFILTER.g:527:4: rule__QualifiedName__Group__0
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
    // InternalFILTER.g:536:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalFILTER.g:537:1: ( ruleVersion EOF )
            // InternalFILTER.g:538:1: ruleVersion EOF
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
    // InternalFILTER.g:545:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:549:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalFILTER.g:550:2: ( ( rule__Version__Group__0 ) )
            {
            // InternalFILTER.g:550:2: ( ( rule__Version__Group__0 ) )
            // InternalFILTER.g:551:3: ( rule__Version__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup()); 
            }
            // InternalFILTER.g:552:3: ( rule__Version__Group__0 )
            // InternalFILTER.g:552:4: rule__Version__Group__0
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
    // InternalFILTER.g:561:1: entryRuleVersionedQualifiedName : ruleVersionedQualifiedName EOF ;
    public final void entryRuleVersionedQualifiedName() throws RecognitionException {
        try {
            // InternalFILTER.g:562:1: ( ruleVersionedQualifiedName EOF )
            // InternalFILTER.g:563:1: ruleVersionedQualifiedName EOF
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
    // InternalFILTER.g:570:1: ruleVersionedQualifiedName : ( ( rule__VersionedQualifiedName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:574:2: ( ( ( rule__VersionedQualifiedName__Group__0 ) ) )
            // InternalFILTER.g:575:2: ( ( rule__VersionedQualifiedName__Group__0 ) )
            {
            // InternalFILTER.g:575:2: ( ( rule__VersionedQualifiedName__Group__0 ) )
            // InternalFILTER.g:576:3: ( rule__VersionedQualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); 
            }
            // InternalFILTER.g:577:3: ( rule__VersionedQualifiedName__Group__0 )
            // InternalFILTER.g:577:4: rule__VersionedQualifiedName__Group__0
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


    // $ANTLR start "entryRuleVersionedQualifiedReferenceName"
    // InternalFILTER.g:586:1: entryRuleVersionedQualifiedReferenceName : ruleVersionedQualifiedReferenceName EOF ;
    public final void entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        try {
            // InternalFILTER.g:587:1: ( ruleVersionedQualifiedReferenceName EOF )
            // InternalFILTER.g:588:1: ruleVersionedQualifiedReferenceName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameRule()); 
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
    // $ANTLR end "entryRuleVersionedQualifiedReferenceName"


    // $ANTLR start "ruleVersionedQualifiedReferenceName"
    // InternalFILTER.g:595:1: ruleVersionedQualifiedReferenceName : ( ( rule__VersionedQualifiedReferenceName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedReferenceName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:599:2: ( ( ( rule__VersionedQualifiedReferenceName__Group__0 ) ) )
            // InternalFILTER.g:600:2: ( ( rule__VersionedQualifiedReferenceName__Group__0 ) )
            {
            // InternalFILTER.g:600:2: ( ( rule__VersionedQualifiedReferenceName__Group__0 ) )
            // InternalFILTER.g:601:3: ( rule__VersionedQualifiedReferenceName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup()); 
            }
            // InternalFILTER.g:602:3: ( rule__VersionedQualifiedReferenceName__Group__0 )
            // InternalFILTER.g:602:4: rule__VersionedQualifiedReferenceName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VersionedQualifiedReferenceName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVersionedQualifiedReferenceName"


    // $ANTLR start "entryRuleINTEGER"
    // InternalFILTER.g:611:1: entryRuleINTEGER : ruleINTEGER EOF ;
    public final void entryRuleINTEGER() throws RecognitionException {
        try {
            // InternalFILTER.g:612:1: ( ruleINTEGER EOF )
            // InternalFILTER.g:613:1: ruleINTEGER EOF
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
    // InternalFILTER.g:620:1: ruleINTEGER : ( ( rule__INTEGER__Alternatives ) ) ;
    public final void ruleINTEGER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:624:2: ( ( ( rule__INTEGER__Alternatives ) ) )
            // InternalFILTER.g:625:2: ( ( rule__INTEGER__Alternatives ) )
            {
            // InternalFILTER.g:625:2: ( ( rule__INTEGER__Alternatives ) )
            // InternalFILTER.g:626:3: ( rule__INTEGER__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getAlternatives()); 
            }
            // InternalFILTER.g:627:3: ( rule__INTEGER__Alternatives )
            // InternalFILTER.g:627:4: rule__INTEGER__Alternatives
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


    // $ANTLR start "ruleGSSFilterConstantType"
    // InternalFILTER.g:636:1: ruleGSSFilterConstantType : ( ( rule__GSSFilterConstantType__Alternatives ) ) ;
    public final void ruleGSSFilterConstantType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:640:1: ( ( ( rule__GSSFilterConstantType__Alternatives ) ) )
            // InternalFILTER.g:641:2: ( ( rule__GSSFilterConstantType__Alternatives ) )
            {
            // InternalFILTER.g:641:2: ( ( rule__GSSFilterConstantType__Alternatives ) )
            // InternalFILTER.g:642:3: ( rule__GSSFilterConstantType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterConstantTypeAccess().getAlternatives()); 
            }
            // InternalFILTER.g:643:3: ( rule__GSSFilterConstantType__Alternatives )
            // InternalFILTER.g:643:4: rule__GSSFilterConstantType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterConstantType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterConstantTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSFilterConstantType"


    // $ANTLR start "ruleGSSFilterOPType"
    // InternalFILTER.g:652:1: ruleGSSFilterOPType : ( ( rule__GSSFilterOPType__Alternatives ) ) ;
    public final void ruleGSSFilterOPType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:656:1: ( ( ( rule__GSSFilterOPType__Alternatives ) ) )
            // InternalFILTER.g:657:2: ( ( rule__GSSFilterOPType__Alternatives ) )
            {
            // InternalFILTER.g:657:2: ( ( rule__GSSFilterOPType__Alternatives ) )
            // InternalFILTER.g:658:3: ( rule__GSSFilterOPType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterOPTypeAccess().getAlternatives()); 
            }
            // InternalFILTER.g:659:3: ( rule__GSSFilterOPType__Alternatives )
            // InternalFILTER.g:659:4: rule__GSSFilterOPType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterOPType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterOPTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSFilterOPType"


    // $ANTLR start "ruleGSSFilterSelectType"
    // InternalFILTER.g:668:1: ruleGSSFilterSelectType : ( ( rule__GSSFilterSelectType__Alternatives ) ) ;
    public final void ruleGSSFilterSelectType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:672:1: ( ( ( rule__GSSFilterSelectType__Alternatives ) ) )
            // InternalFILTER.g:673:2: ( ( rule__GSSFilterSelectType__Alternatives ) )
            {
            // InternalFILTER.g:673:2: ( ( rule__GSSFilterSelectType__Alternatives ) )
            // InternalFILTER.g:674:3: ( rule__GSSFilterSelectType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectTypeAccess().getAlternatives()); 
            }
            // InternalFILTER.g:675:3: ( rule__GSSFilterSelectType__Alternatives )
            // InternalFILTER.g:675:4: rule__GSSFilterSelectType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSFilterSelectType"


    // $ANTLR start "rule__GSSFilterFilter__Alternatives"
    // InternalFILTER.g:683:1: rule__GSSFilterFilter__Alternatives : ( ( ruleGSSFilterMaxtermFilter ) | ( ruleGSSFilterMintermFilter ) );
    public final void rule__GSSFilterFilter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:687:1: ( ( ruleGSSFilterMaxtermFilter ) | ( ruleGSSFilterMintermFilter ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==29) ) {
                alt1=1;
            }
            else if ( (LA1_0==35) ) {
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
                    // InternalFILTER.g:688:2: ( ruleGSSFilterMaxtermFilter )
                    {
                    // InternalFILTER.g:688:2: ( ruleGSSFilterMaxtermFilter )
                    // InternalFILTER.g:689:3: ruleGSSFilterMaxtermFilter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterFilterAccess().getGSSFilterMaxtermFilterParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleGSSFilterMaxtermFilter();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterFilterAccess().getGSSFilterMaxtermFilterParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:694:2: ( ruleGSSFilterMintermFilter )
                    {
                    // InternalFILTER.g:694:2: ( ruleGSSFilterMintermFilter )
                    // InternalFILTER.g:695:3: ruleGSSFilterMintermFilter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterFilterAccess().getGSSFilterMintermFilterParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleGSSFilterMintermFilter();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterFilterAccess().getGSSFilterMintermFilterParserRuleCall_1()); 
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
    // $ANTLR end "rule__GSSFilterFilter__Alternatives"


    // $ANTLR start "rule__GSSFilterAbstractBoolVar__Alternatives"
    // InternalFILTER.g:704:1: rule__GSSFilterAbstractBoolVar__Alternatives : ( ( ruleGSSFilterBoolVar ) | ( ruleGSSFilterBoolVarFromArrayItem ) | ( ruleGSSFilterBoolVarFromGroupedArrayItem ) | ( ruleGSSFilterBoolVarFDIC ) );
    public final void rule__GSSFilterAbstractBoolVar__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:708:1: ( ( ruleGSSFilterBoolVar ) | ( ruleGSSFilterBoolVarFromArrayItem ) | ( ruleGSSFilterBoolVarFromGroupedArrayItem ) | ( ruleGSSFilterBoolVarFDIC ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt2=1;
                }
                break;
            case 41:
                {
                alt2=2;
                }
                break;
            case 43:
                {
                alt2=3;
                }
                break;
            case 46:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalFILTER.g:709:2: ( ruleGSSFilterBoolVar )
                    {
                    // InternalFILTER.g:709:2: ( ruleGSSFilterBoolVar )
                    // InternalFILTER.g:710:3: ruleGSSFilterBoolVar
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterAbstractBoolVarAccess().getGSSFilterBoolVarParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleGSSFilterBoolVar();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterAbstractBoolVarAccess().getGSSFilterBoolVarParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:715:2: ( ruleGSSFilterBoolVarFromArrayItem )
                    {
                    // InternalFILTER.g:715:2: ( ruleGSSFilterBoolVarFromArrayItem )
                    // InternalFILTER.g:716:3: ruleGSSFilterBoolVarFromArrayItem
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterAbstractBoolVarAccess().getGSSFilterBoolVarFromArrayItemParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleGSSFilterBoolVarFromArrayItem();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterAbstractBoolVarAccess().getGSSFilterBoolVarFromArrayItemParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFILTER.g:721:2: ( ruleGSSFilterBoolVarFromGroupedArrayItem )
                    {
                    // InternalFILTER.g:721:2: ( ruleGSSFilterBoolVarFromGroupedArrayItem )
                    // InternalFILTER.g:722:3: ruleGSSFilterBoolVarFromGroupedArrayItem
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterAbstractBoolVarAccess().getGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleGSSFilterBoolVarFromGroupedArrayItem();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterAbstractBoolVarAccess().getGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFILTER.g:727:2: ( ruleGSSFilterBoolVarFDIC )
                    {
                    // InternalFILTER.g:727:2: ( ruleGSSFilterBoolVarFDIC )
                    // InternalFILTER.g:728:3: ruleGSSFilterBoolVarFDIC
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterAbstractBoolVarAccess().getGSSFilterBoolVarFDICParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleGSSFilterBoolVarFDIC();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterAbstractBoolVarAccess().getGSSFilterBoolVarFDICParserRuleCall_3()); 
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
    // $ANTLR end "rule__GSSFilterAbstractBoolVar__Alternatives"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Alternatives_19"
    // InternalFILTER.g:737:1: rule__GSSFilterBoolVarFromArrayItem__Alternatives_19 : ( ( ( rule__GSSFilterBoolVarFromArrayItem__ConstantAssignment_19_0 ) ) | ( ( rule__GSSFilterBoolVarFromArrayItem__SelectAssignment_19_1 ) ) | ( ( rule__GSSFilterBoolVarFromArrayItem__SelectLineAssignment_19_2 ) ) );
    public final void rule__GSSFilterBoolVarFromArrayItem__Alternatives_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:741:1: ( ( ( rule__GSSFilterBoolVarFromArrayItem__ConstantAssignment_19_0 ) ) | ( ( rule__GSSFilterBoolVarFromArrayItem__SelectAssignment_19_1 ) ) | ( ( rule__GSSFilterBoolVarFromArrayItem__SelectLineAssignment_19_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt3=1;
                }
                break;
            case 52:
                {
                alt3=2;
                }
                break;
            case 55:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalFILTER.g:742:2: ( ( rule__GSSFilterBoolVarFromArrayItem__ConstantAssignment_19_0 ) )
                    {
                    // InternalFILTER.g:742:2: ( ( rule__GSSFilterBoolVarFromArrayItem__ConstantAssignment_19_0 ) )
                    // InternalFILTER.g:743:3: ( rule__GSSFilterBoolVarFromArrayItem__ConstantAssignment_19_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantAssignment_19_0()); 
                    }
                    // InternalFILTER.g:744:3: ( rule__GSSFilterBoolVarFromArrayItem__ConstantAssignment_19_0 )
                    // InternalFILTER.g:744:4: rule__GSSFilterBoolVarFromArrayItem__ConstantAssignment_19_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSFilterBoolVarFromArrayItem__ConstantAssignment_19_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantAssignment_19_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:748:2: ( ( rule__GSSFilterBoolVarFromArrayItem__SelectAssignment_19_1 ) )
                    {
                    // InternalFILTER.g:748:2: ( ( rule__GSSFilterBoolVarFromArrayItem__SelectAssignment_19_1 ) )
                    // InternalFILTER.g:749:3: ( rule__GSSFilterBoolVarFromArrayItem__SelectAssignment_19_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSelectAssignment_19_1()); 
                    }
                    // InternalFILTER.g:750:3: ( rule__GSSFilterBoolVarFromArrayItem__SelectAssignment_19_1 )
                    // InternalFILTER.g:750:4: rule__GSSFilterBoolVarFromArrayItem__SelectAssignment_19_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSFilterBoolVarFromArrayItem__SelectAssignment_19_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSelectAssignment_19_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFILTER.g:754:2: ( ( rule__GSSFilterBoolVarFromArrayItem__SelectLineAssignment_19_2 ) )
                    {
                    // InternalFILTER.g:754:2: ( ( rule__GSSFilterBoolVarFromArrayItem__SelectLineAssignment_19_2 ) )
                    // InternalFILTER.g:755:3: ( rule__GSSFilterBoolVarFromArrayItem__SelectLineAssignment_19_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSelectLineAssignment_19_2()); 
                    }
                    // InternalFILTER.g:756:3: ( rule__GSSFilterBoolVarFromArrayItem__SelectLineAssignment_19_2 )
                    // InternalFILTER.g:756:4: rule__GSSFilterBoolVarFromArrayItem__SelectLineAssignment_19_2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSFilterBoolVarFromArrayItem__SelectLineAssignment_19_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSelectLineAssignment_19_2()); 
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
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Alternatives_19"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Alternatives_23"
    // InternalFILTER.g:764:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Alternatives_23 : ( ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0 ) ) | ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1 ) ) | ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2 ) ) );
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Alternatives_23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:768:1: ( ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0 ) ) | ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1 ) ) | ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt4=1;
                }
                break;
            case 52:
                {
                alt4=2;
                }
                break;
            case 55:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalFILTER.g:769:2: ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0 ) )
                    {
                    // InternalFILTER.g:769:2: ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0 ) )
                    // InternalFILTER.g:770:3: ( rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantAssignment_23_0()); 
                    }
                    // InternalFILTER.g:771:3: ( rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0 )
                    // InternalFILTER.g:771:4: rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantAssignment_23_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:775:2: ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1 ) )
                    {
                    // InternalFILTER.g:775:2: ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1 ) )
                    // InternalFILTER.g:776:3: ( rule__GSSFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSelectAssignment_23_1()); 
                    }
                    // InternalFILTER.g:777:3: ( rule__GSSFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1 )
                    // InternalFILTER.g:777:4: rule__GSSFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSelectAssignment_23_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFILTER.g:781:2: ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2 ) )
                    {
                    // InternalFILTER.g:781:2: ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2 ) )
                    // InternalFILTER.g:782:3: ( rule__GSSFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSelectLineAssignment_23_2()); 
                    }
                    // InternalFILTER.g:783:3: ( rule__GSSFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2 )
                    // InternalFILTER.g:783:4: rule__GSSFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSelectLineAssignment_23_2()); 
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
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Alternatives_23"


    // $ANTLR start "rule__GSSFilterValue__Alternatives"
    // InternalFILTER.g:791:1: rule__GSSFilterValue__Alternatives : ( ( ruleGSSFilterConstant ) | ( ruleGSSFilterSelect ) | ( ruleGSSFilterSelectLine ) );
    public final void rule__GSSFilterValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:795:1: ( ( ruleGSSFilterConstant ) | ( ruleGSSFilterSelect ) | ( ruleGSSFilterSelectLine ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt5=1;
                }
                break;
            case 52:
                {
                alt5=2;
                }
                break;
            case 55:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalFILTER.g:796:2: ( ruleGSSFilterConstant )
                    {
                    // InternalFILTER.g:796:2: ( ruleGSSFilterConstant )
                    // InternalFILTER.g:797:3: ruleGSSFilterConstant
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterValueAccess().getGSSFilterConstantParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleGSSFilterConstant();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterValueAccess().getGSSFilterConstantParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:802:2: ( ruleGSSFilterSelect )
                    {
                    // InternalFILTER.g:802:2: ( ruleGSSFilterSelect )
                    // InternalFILTER.g:803:3: ruleGSSFilterSelect
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterValueAccess().getGSSFilterSelectParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleGSSFilterSelect();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterValueAccess().getGSSFilterSelectParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFILTER.g:808:2: ( ruleGSSFilterSelectLine )
                    {
                    // InternalFILTER.g:808:2: ( ruleGSSFilterSelectLine )
                    // InternalFILTER.g:809:3: ruleGSSFilterSelectLine
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterValueAccess().getGSSFilterSelectLineParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleGSSFilterSelectLine();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterValueAccess().getGSSFilterSelectLineParserRuleCall_2()); 
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
    // $ANTLR end "rule__GSSFilterValue__Alternatives"


    // $ANTLR start "rule__Version__Alternatives_0"
    // InternalFILTER.g:818:1: rule__Version__Alternatives_0 : ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) );
    public final void rule__Version__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:822:1: ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID) ) {
                    alt6=2;
                }
                else if ( (LA6_1==EOF||LA6_1==28||LA6_1==63||LA6_1==65) ) {
                    alt6=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalFILTER.g:823:2: ( RULE_INT )
                    {
                    // InternalFILTER.g:823:2: ( RULE_INT )
                    // InternalFILTER.g:824:3: RULE_INT
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
                    // InternalFILTER.g:829:2: ( ( rule__Version__Group_0_1__0 ) )
                    {
                    // InternalFILTER.g:829:2: ( ( rule__Version__Group_0_1__0 ) )
                    // InternalFILTER.g:830:3: ( rule__Version__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_0_1()); 
                    }
                    // InternalFILTER.g:831:3: ( rule__Version__Group_0_1__0 )
                    // InternalFILTER.g:831:4: rule__Version__Group_0_1__0
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
    // InternalFILTER.g:839:1: rule__Version__Alternatives_1_1 : ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) );
    public final void rule__Version__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:843:1: ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EOF||LA7_1==28||LA7_1==63||LA7_1==65) ) {
                    alt7=1;
                }
                else if ( (LA7_1==RULE_ID) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFILTER.g:844:2: ( RULE_INT )
                    {
                    // InternalFILTER.g:844:2: ( RULE_INT )
                    // InternalFILTER.g:845:3: RULE_INT
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
                    // InternalFILTER.g:850:2: ( ( rule__Version__Group_1_1_1__0 ) )
                    {
                    // InternalFILTER.g:850:2: ( ( rule__Version__Group_1_1_1__0 ) )
                    // InternalFILTER.g:851:3: ( rule__Version__Group_1_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_1_1_1()); 
                    }
                    // InternalFILTER.g:852:3: ( rule__Version__Group_1_1_1__0 )
                    // InternalFILTER.g:852:4: rule__Version__Group_1_1_1__0
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
    // InternalFILTER.g:860:1: rule__INTEGER__Alternatives : ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) );
    public final void rule__INTEGER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:864:1: ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT||LA8_0==67) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_HEXADECIMAL) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFILTER.g:865:2: ( ( rule__INTEGER__Group_0__0 ) )
                    {
                    // InternalFILTER.g:865:2: ( ( rule__INTEGER__Group_0__0 ) )
                    // InternalFILTER.g:866:3: ( rule__INTEGER__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getINTEGERAccess().getGroup_0()); 
                    }
                    // InternalFILTER.g:867:3: ( rule__INTEGER__Group_0__0 )
                    // InternalFILTER.g:867:4: rule__INTEGER__Group_0__0
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
                    // InternalFILTER.g:871:2: ( RULE_HEXADECIMAL )
                    {
                    // InternalFILTER.g:871:2: ( RULE_HEXADECIMAL )
                    // InternalFILTER.g:872:3: RULE_HEXADECIMAL
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


    // $ANTLR start "rule__GSSFilterConstantType__Alternatives"
    // InternalFILTER.g:881:1: rule__GSSFilterConstantType__Alternatives : ( ( ( 'decimal' ) ) | ( ( 'hex' ) ) | ( ( 'binary' ) ) | ( ( 'char' ) ) | ( ( 'string' ) ) );
    public final void rule__GSSFilterConstantType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:885:1: ( ( ( 'decimal' ) ) | ( ( 'hex' ) ) | ( ( 'binary' ) ) | ( ( 'char' ) ) | ( ( 'string' ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt9=1;
                }
                break;
            case 13:
                {
                alt9=2;
                }
                break;
            case 14:
                {
                alt9=3;
                }
                break;
            case 15:
                {
                alt9=4;
                }
                break;
            case 16:
                {
                alt9=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalFILTER.g:886:2: ( ( 'decimal' ) )
                    {
                    // InternalFILTER.g:886:2: ( ( 'decimal' ) )
                    // InternalFILTER.g:887:3: ( 'decimal' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterConstantTypeAccess().getDecimalEnumLiteralDeclaration_0()); 
                    }
                    // InternalFILTER.g:888:3: ( 'decimal' )
                    // InternalFILTER.g:888:4: 'decimal'
                    {
                    match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterConstantTypeAccess().getDecimalEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:892:2: ( ( 'hex' ) )
                    {
                    // InternalFILTER.g:892:2: ( ( 'hex' ) )
                    // InternalFILTER.g:893:3: ( 'hex' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterConstantTypeAccess().getHexEnumLiteralDeclaration_1()); 
                    }
                    // InternalFILTER.g:894:3: ( 'hex' )
                    // InternalFILTER.g:894:4: 'hex'
                    {
                    match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterConstantTypeAccess().getHexEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFILTER.g:898:2: ( ( 'binary' ) )
                    {
                    // InternalFILTER.g:898:2: ( ( 'binary' ) )
                    // InternalFILTER.g:899:3: ( 'binary' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterConstantTypeAccess().getBinaryEnumLiteralDeclaration_2()); 
                    }
                    // InternalFILTER.g:900:3: ( 'binary' )
                    // InternalFILTER.g:900:4: 'binary'
                    {
                    match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterConstantTypeAccess().getBinaryEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFILTER.g:904:2: ( ( 'char' ) )
                    {
                    // InternalFILTER.g:904:2: ( ( 'char' ) )
                    // InternalFILTER.g:905:3: ( 'char' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterConstantTypeAccess().getCharEnumLiteralDeclaration_3()); 
                    }
                    // InternalFILTER.g:906:3: ( 'char' )
                    // InternalFILTER.g:906:4: 'char'
                    {
                    match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterConstantTypeAccess().getCharEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalFILTER.g:910:2: ( ( 'string' ) )
                    {
                    // InternalFILTER.g:910:2: ( ( 'string' ) )
                    // InternalFILTER.g:911:3: ( 'string' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterConstantTypeAccess().getStringEnumLiteralDeclaration_4()); 
                    }
                    // InternalFILTER.g:912:3: ( 'string' )
                    // InternalFILTER.g:912:4: 'string'
                    {
                    match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterConstantTypeAccess().getStringEnumLiteralDeclaration_4()); 
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
    // $ANTLR end "rule__GSSFilterConstantType__Alternatives"


    // $ANTLR start "rule__GSSFilterOPType__Alternatives"
    // InternalFILTER.g:920:1: rule__GSSFilterOPType__Alternatives : ( ( ( 'equal' ) ) | ( ( 'different' ) ) | ( ( 'bigger_than' ) ) | ( ( 'smaller_than' ) ) | ( ( 'bigger_or_equal' ) ) | ( ( 'smaller_or_equal' ) ) );
    public final void rule__GSSFilterOPType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:924:1: ( ( ( 'equal' ) ) | ( ( 'different' ) ) | ( ( 'bigger_than' ) ) | ( ( 'smaller_than' ) ) | ( ( 'bigger_or_equal' ) ) | ( ( 'smaller_or_equal' ) ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt10=1;
                }
                break;
            case 18:
                {
                alt10=2;
                }
                break;
            case 19:
                {
                alt10=3;
                }
                break;
            case 20:
                {
                alt10=4;
                }
                break;
            case 21:
                {
                alt10=5;
                }
                break;
            case 22:
                {
                alt10=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalFILTER.g:925:2: ( ( 'equal' ) )
                    {
                    // InternalFILTER.g:925:2: ( ( 'equal' ) )
                    // InternalFILTER.g:926:3: ( 'equal' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterOPTypeAccess().getEqualEnumLiteralDeclaration_0()); 
                    }
                    // InternalFILTER.g:927:3: ( 'equal' )
                    // InternalFILTER.g:927:4: 'equal'
                    {
                    match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterOPTypeAccess().getEqualEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:931:2: ( ( 'different' ) )
                    {
                    // InternalFILTER.g:931:2: ( ( 'different' ) )
                    // InternalFILTER.g:932:3: ( 'different' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterOPTypeAccess().getDifferentEnumLiteralDeclaration_1()); 
                    }
                    // InternalFILTER.g:933:3: ( 'different' )
                    // InternalFILTER.g:933:4: 'different'
                    {
                    match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterOPTypeAccess().getDifferentEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFILTER.g:937:2: ( ( 'bigger_than' ) )
                    {
                    // InternalFILTER.g:937:2: ( ( 'bigger_than' ) )
                    // InternalFILTER.g:938:3: ( 'bigger_than' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterOPTypeAccess().getBigger_thanEnumLiteralDeclaration_2()); 
                    }
                    // InternalFILTER.g:939:3: ( 'bigger_than' )
                    // InternalFILTER.g:939:4: 'bigger_than'
                    {
                    match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterOPTypeAccess().getBigger_thanEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFILTER.g:943:2: ( ( 'smaller_than' ) )
                    {
                    // InternalFILTER.g:943:2: ( ( 'smaller_than' ) )
                    // InternalFILTER.g:944:3: ( 'smaller_than' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterOPTypeAccess().getSmaller_thanEnumLiteralDeclaration_3()); 
                    }
                    // InternalFILTER.g:945:3: ( 'smaller_than' )
                    // InternalFILTER.g:945:4: 'smaller_than'
                    {
                    match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterOPTypeAccess().getSmaller_thanEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalFILTER.g:949:2: ( ( 'bigger_or_equal' ) )
                    {
                    // InternalFILTER.g:949:2: ( ( 'bigger_or_equal' ) )
                    // InternalFILTER.g:950:3: ( 'bigger_or_equal' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterOPTypeAccess().getBigger_or_equalEnumLiteralDeclaration_4()); 
                    }
                    // InternalFILTER.g:951:3: ( 'bigger_or_equal' )
                    // InternalFILTER.g:951:4: 'bigger_or_equal'
                    {
                    match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterOPTypeAccess().getBigger_or_equalEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalFILTER.g:955:2: ( ( 'smaller_or_equal' ) )
                    {
                    // InternalFILTER.g:955:2: ( ( 'smaller_or_equal' ) )
                    // InternalFILTER.g:956:3: ( 'smaller_or_equal' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterOPTypeAccess().getSmaller_or_equalEnumLiteralDeclaration_5()); 
                    }
                    // InternalFILTER.g:957:3: ( 'smaller_or_equal' )
                    // InternalFILTER.g:957:4: 'smaller_or_equal'
                    {
                    match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterOPTypeAccess().getSmaller_or_equalEnumLiteralDeclaration_5()); 
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
    // $ANTLR end "rule__GSSFilterOPType__Alternatives"


    // $ANTLR start "rule__GSSFilterSelectType__Alternatives"
    // InternalFILTER.g:965:1: rule__GSSFilterSelectType__Alternatives : ( ( ( 'data' ) ) | ( ( 'size' ) ) | ( ( 'crc' ) ) );
    public final void rule__GSSFilterSelectType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:969:1: ( ( ( 'data' ) ) | ( ( 'size' ) ) | ( ( 'crc' ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt11=1;
                }
                break;
            case 24:
                {
                alt11=2;
                }
                break;
            case 25:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalFILTER.g:970:2: ( ( 'data' ) )
                    {
                    // InternalFILTER.g:970:2: ( ( 'data' ) )
                    // InternalFILTER.g:971:3: ( 'data' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterSelectTypeAccess().getDataEnumLiteralDeclaration_0()); 
                    }
                    // InternalFILTER.g:972:3: ( 'data' )
                    // InternalFILTER.g:972:4: 'data'
                    {
                    match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterSelectTypeAccess().getDataEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:976:2: ( ( 'size' ) )
                    {
                    // InternalFILTER.g:976:2: ( ( 'size' ) )
                    // InternalFILTER.g:977:3: ( 'size' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterSelectTypeAccess().getSizeEnumLiteralDeclaration_1()); 
                    }
                    // InternalFILTER.g:978:3: ( 'size' )
                    // InternalFILTER.g:978:4: 'size'
                    {
                    match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterSelectTypeAccess().getSizeEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFILTER.g:982:2: ( ( 'crc' ) )
                    {
                    // InternalFILTER.g:982:2: ( ( 'crc' ) )
                    // InternalFILTER.g:983:3: ( 'crc' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSFilterSelectTypeAccess().getCrcEnumLiteralDeclaration_2()); 
                    }
                    // InternalFILTER.g:984:3: ( 'crc' )
                    // InternalFILTER.g:984:4: 'crc'
                    {
                    match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSFilterSelectTypeAccess().getCrcEnumLiteralDeclaration_2()); 
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
    // $ANTLR end "rule__GSSFilterSelectType__Alternatives"


    // $ANTLR start "rule__GSSModelFile__Group__0"
    // InternalFILTER.g:992:1: rule__GSSModelFile__Group__0 : rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1 ;
    public final void rule__GSSModelFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:996:1: ( rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1 )
            // InternalFILTER.g:997:2: rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1
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
    // InternalFILTER.g:1004:1: rule__GSSModelFile__Group__0__Impl : ( ( rule__GSSModelFile__ImportsAssignment_0 )* ) ;
    public final void rule__GSSModelFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1008:1: ( ( ( rule__GSSModelFile__ImportsAssignment_0 )* ) )
            // InternalFILTER.g:1009:1: ( ( rule__GSSModelFile__ImportsAssignment_0 )* )
            {
            // InternalFILTER.g:1009:1: ( ( rule__GSSModelFile__ImportsAssignment_0 )* )
            // InternalFILTER.g:1010:2: ( rule__GSSModelFile__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getImportsAssignment_0()); 
            }
            // InternalFILTER.g:1011:2: ( rule__GSSModelFile__ImportsAssignment_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFILTER.g:1011:3: rule__GSSModelFile__ImportsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__GSSModelFile__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalFILTER.g:1019:1: rule__GSSModelFile__Group__1 : rule__GSSModelFile__Group__1__Impl ;
    public final void rule__GSSModelFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1023:1: ( rule__GSSModelFile__Group__1__Impl )
            // InternalFILTER.g:1024:2: rule__GSSModelFile__Group__1__Impl
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
    // InternalFILTER.g:1030:1: rule__GSSModelFile__Group__1__Impl : ( ( rule__GSSModelFile__ElementAssignment_1 ) ) ;
    public final void rule__GSSModelFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1034:1: ( ( ( rule__GSSModelFile__ElementAssignment_1 ) ) )
            // InternalFILTER.g:1035:1: ( ( rule__GSSModelFile__ElementAssignment_1 ) )
            {
            // InternalFILTER.g:1035:1: ( ( rule__GSSModelFile__ElementAssignment_1 ) )
            // InternalFILTER.g:1036:2: ( rule__GSSModelFile__ElementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getElementAssignment_1()); 
            }
            // InternalFILTER.g:1037:2: ( rule__GSSModelFile__ElementAssignment_1 )
            // InternalFILTER.g:1037:3: rule__GSSModelFile__ElementAssignment_1
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
    // InternalFILTER.g:1046:1: rule__GSSModelFileImport__Group__0 : rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1 ;
    public final void rule__GSSModelFileImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1050:1: ( rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1 )
            // InternalFILTER.g:1051:2: rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1
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
    // InternalFILTER.g:1058:1: rule__GSSModelFileImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__GSSModelFileImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1062:1: ( ( 'import' ) )
            // InternalFILTER.g:1063:1: ( 'import' )
            {
            // InternalFILTER.g:1063:1: ( 'import' )
            // InternalFILTER.g:1064:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getImportKeyword_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalFILTER.g:1073:1: rule__GSSModelFileImport__Group__1 : rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2 ;
    public final void rule__GSSModelFileImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1077:1: ( rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2 )
            // InternalFILTER.g:1078:2: rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2
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
    // InternalFILTER.g:1085:1: rule__GSSModelFileImport__Group__1__Impl : ( ':=' ) ;
    public final void rule__GSSModelFileImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1089:1: ( ( ':=' ) )
            // InternalFILTER.g:1090:1: ( ':=' )
            {
            // InternalFILTER.g:1090:1: ( ':=' )
            // InternalFILTER.g:1091:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalFILTER.g:1100:1: rule__GSSModelFileImport__Group__2 : rule__GSSModelFileImport__Group__2__Impl rule__GSSModelFileImport__Group__3 ;
    public final void rule__GSSModelFileImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1104:1: ( rule__GSSModelFileImport__Group__2__Impl rule__GSSModelFileImport__Group__3 )
            // InternalFILTER.g:1105:2: rule__GSSModelFileImport__Group__2__Impl rule__GSSModelFileImport__Group__3
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
    // InternalFILTER.g:1112:1: rule__GSSModelFileImport__Group__2__Impl : ( ( rule__GSSModelFileImport__ImportURIAssignment_2 ) ) ;
    public final void rule__GSSModelFileImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1116:1: ( ( ( rule__GSSModelFileImport__ImportURIAssignment_2 ) ) )
            // InternalFILTER.g:1117:1: ( ( rule__GSSModelFileImport__ImportURIAssignment_2 ) )
            {
            // InternalFILTER.g:1117:1: ( ( rule__GSSModelFileImport__ImportURIAssignment_2 ) )
            // InternalFILTER.g:1118:2: ( rule__GSSModelFileImport__ImportURIAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getImportURIAssignment_2()); 
            }
            // InternalFILTER.g:1119:2: ( rule__GSSModelFileImport__ImportURIAssignment_2 )
            // InternalFILTER.g:1119:3: rule__GSSModelFileImport__ImportURIAssignment_2
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
    // InternalFILTER.g:1127:1: rule__GSSModelFileImport__Group__3 : rule__GSSModelFileImport__Group__3__Impl ;
    public final void rule__GSSModelFileImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1131:1: ( rule__GSSModelFileImport__Group__3__Impl )
            // InternalFILTER.g:1132:2: rule__GSSModelFileImport__Group__3__Impl
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
    // InternalFILTER.g:1138:1: rule__GSSModelFileImport__Group__3__Impl : ( ';' ) ;
    public final void rule__GSSModelFileImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1142:1: ( ( ';' ) )
            // InternalFILTER.g:1143:1: ( ';' )
            {
            // InternalFILTER.g:1143:1: ( ';' )
            // InternalFILTER.g:1144:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getSemicolonKeyword_3()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__0"
    // InternalFILTER.g:1154:1: rule__GSSFilterMaxtermFilter__Group__0 : rule__GSSFilterMaxtermFilter__Group__0__Impl rule__GSSFilterMaxtermFilter__Group__1 ;
    public final void rule__GSSFilterMaxtermFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1158:1: ( rule__GSSFilterMaxtermFilter__Group__0__Impl rule__GSSFilterMaxtermFilter__Group__1 )
            // InternalFILTER.g:1159:2: rule__GSSFilterMaxtermFilter__Group__0__Impl rule__GSSFilterMaxtermFilter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSFilterMaxtermFilter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxtermFilter__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__0"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__0__Impl"
    // InternalFILTER.g:1166:1: rule__GSSFilterMaxtermFilter__Group__0__Impl : ( 'GSSFilterMaxtermFilter' ) ;
    public final void rule__GSSFilterMaxtermFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1170:1: ( ( 'GSSFilterMaxtermFilter' ) )
            // InternalFILTER.g:1171:1: ( 'GSSFilterMaxtermFilter' )
            {
            // InternalFILTER.g:1171:1: ( 'GSSFilterMaxtermFilter' )
            // InternalFILTER.g:1172:2: 'GSSFilterMaxtermFilter'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getGSSFilterMaxtermFilterKeyword_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getGSSFilterMaxtermFilterKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__0__Impl"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__1"
    // InternalFILTER.g:1181:1: rule__GSSFilterMaxtermFilter__Group__1 : rule__GSSFilterMaxtermFilter__Group__1__Impl rule__GSSFilterMaxtermFilter__Group__2 ;
    public final void rule__GSSFilterMaxtermFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1185:1: ( rule__GSSFilterMaxtermFilter__Group__1__Impl rule__GSSFilterMaxtermFilter__Group__2 )
            // InternalFILTER.g:1186:2: rule__GSSFilterMaxtermFilter__Group__1__Impl rule__GSSFilterMaxtermFilter__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSFilterMaxtermFilter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxtermFilter__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__1"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__1__Impl"
    // InternalFILTER.g:1193:1: rule__GSSFilterMaxtermFilter__Group__1__Impl : ( ( rule__GSSFilterMaxtermFilter__NameAssignment_1 ) ) ;
    public final void rule__GSSFilterMaxtermFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1197:1: ( ( ( rule__GSSFilterMaxtermFilter__NameAssignment_1 ) ) )
            // InternalFILTER.g:1198:1: ( ( rule__GSSFilterMaxtermFilter__NameAssignment_1 ) )
            {
            // InternalFILTER.g:1198:1: ( ( rule__GSSFilterMaxtermFilter__NameAssignment_1 ) )
            // InternalFILTER.g:1199:2: ( rule__GSSFilterMaxtermFilter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getNameAssignment_1()); 
            }
            // InternalFILTER.g:1200:2: ( rule__GSSFilterMaxtermFilter__NameAssignment_1 )
            // InternalFILTER.g:1200:3: rule__GSSFilterMaxtermFilter__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxtermFilter__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__1__Impl"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__2"
    // InternalFILTER.g:1208:1: rule__GSSFilterMaxtermFilter__Group__2 : rule__GSSFilterMaxtermFilter__Group__2__Impl rule__GSSFilterMaxtermFilter__Group__3 ;
    public final void rule__GSSFilterMaxtermFilter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1212:1: ( rule__GSSFilterMaxtermFilter__Group__2__Impl rule__GSSFilterMaxtermFilter__Group__3 )
            // InternalFILTER.g:1213:2: rule__GSSFilterMaxtermFilter__Group__2__Impl rule__GSSFilterMaxtermFilter__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSFilterMaxtermFilter__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxtermFilter__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__2"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__2__Impl"
    // InternalFILTER.g:1220:1: rule__GSSFilterMaxtermFilter__Group__2__Impl : ( '{' ) ;
    public final void rule__GSSFilterMaxtermFilter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1224:1: ( ( '{' ) )
            // InternalFILTER.g:1225:1: ( '{' )
            {
            // InternalFILTER.g:1225:1: ( '{' )
            // InternalFILTER.g:1226:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__2__Impl"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__3"
    // InternalFILTER.g:1235:1: rule__GSSFilterMaxtermFilter__Group__3 : rule__GSSFilterMaxtermFilter__Group__3__Impl rule__GSSFilterMaxtermFilter__Group__4 ;
    public final void rule__GSSFilterMaxtermFilter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1239:1: ( rule__GSSFilterMaxtermFilter__Group__3__Impl rule__GSSFilterMaxtermFilter__Group__4 )
            // InternalFILTER.g:1240:2: rule__GSSFilterMaxtermFilter__Group__3__Impl rule__GSSFilterMaxtermFilter__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterMaxtermFilter__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxtermFilter__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__3"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__3__Impl"
    // InternalFILTER.g:1247:1: rule__GSSFilterMaxtermFilter__Group__3__Impl : ( 'uri' ) ;
    public final void rule__GSSFilterMaxtermFilter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1251:1: ( ( 'uri' ) )
            // InternalFILTER.g:1252:1: ( 'uri' )
            {
            // InternalFILTER.g:1252:1: ( 'uri' )
            // InternalFILTER.g:1253:2: 'uri'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getUriKeyword_3()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getUriKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__3__Impl"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__4"
    // InternalFILTER.g:1262:1: rule__GSSFilterMaxtermFilter__Group__4 : rule__GSSFilterMaxtermFilter__Group__4__Impl rule__GSSFilterMaxtermFilter__Group__5 ;
    public final void rule__GSSFilterMaxtermFilter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1266:1: ( rule__GSSFilterMaxtermFilter__Group__4__Impl rule__GSSFilterMaxtermFilter__Group__5 )
            // InternalFILTER.g:1267:2: rule__GSSFilterMaxtermFilter__Group__4__Impl rule__GSSFilterMaxtermFilter__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSFilterMaxtermFilter__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxtermFilter__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__4"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__4__Impl"
    // InternalFILTER.g:1274:1: rule__GSSFilterMaxtermFilter__Group__4__Impl : ( ':=' ) ;
    public final void rule__GSSFilterMaxtermFilter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1278:1: ( ( ':=' ) )
            // InternalFILTER.g:1279:1: ( ':=' )
            {
            // InternalFILTER.g:1279:1: ( ':=' )
            // InternalFILTER.g:1280:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_4()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__4__Impl"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__5"
    // InternalFILTER.g:1289:1: rule__GSSFilterMaxtermFilter__Group__5 : rule__GSSFilterMaxtermFilter__Group__5__Impl rule__GSSFilterMaxtermFilter__Group__6 ;
    public final void rule__GSSFilterMaxtermFilter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1293:1: ( rule__GSSFilterMaxtermFilter__Group__5__Impl rule__GSSFilterMaxtermFilter__Group__6 )
            // InternalFILTER.g:1294:2: rule__GSSFilterMaxtermFilter__Group__5__Impl rule__GSSFilterMaxtermFilter__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterMaxtermFilter__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxtermFilter__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__5"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__5__Impl"
    // InternalFILTER.g:1301:1: rule__GSSFilterMaxtermFilter__Group__5__Impl : ( ( rule__GSSFilterMaxtermFilter__UriAssignment_5 ) ) ;
    public final void rule__GSSFilterMaxtermFilter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1305:1: ( ( ( rule__GSSFilterMaxtermFilter__UriAssignment_5 ) ) )
            // InternalFILTER.g:1306:1: ( ( rule__GSSFilterMaxtermFilter__UriAssignment_5 ) )
            {
            // InternalFILTER.g:1306:1: ( ( rule__GSSFilterMaxtermFilter__UriAssignment_5 ) )
            // InternalFILTER.g:1307:2: ( rule__GSSFilterMaxtermFilter__UriAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getUriAssignment_5()); 
            }
            // InternalFILTER.g:1308:2: ( rule__GSSFilterMaxtermFilter__UriAssignment_5 )
            // InternalFILTER.g:1308:3: rule__GSSFilterMaxtermFilter__UriAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxtermFilter__UriAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getUriAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__5__Impl"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__6"
    // InternalFILTER.g:1316:1: rule__GSSFilterMaxtermFilter__Group__6 : rule__GSSFilterMaxtermFilter__Group__6__Impl rule__GSSFilterMaxtermFilter__Group__7 ;
    public final void rule__GSSFilterMaxtermFilter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1320:1: ( rule__GSSFilterMaxtermFilter__Group__6__Impl rule__GSSFilterMaxtermFilter__Group__7 )
            // InternalFILTER.g:1321:2: rule__GSSFilterMaxtermFilter__Group__6__Impl rule__GSSFilterMaxtermFilter__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSFilterMaxtermFilter__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxtermFilter__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__6"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__6__Impl"
    // InternalFILTER.g:1328:1: rule__GSSFilterMaxtermFilter__Group__6__Impl : ( ';' ) ;
    public final void rule__GSSFilterMaxtermFilter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1332:1: ( ( ';' ) )
            // InternalFILTER.g:1333:1: ( ';' )
            {
            // InternalFILTER.g:1333:1: ( ';' )
            // InternalFILTER.g:1334:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_6()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__6__Impl"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__7"
    // InternalFILTER.g:1343:1: rule__GSSFilterMaxtermFilter__Group__7 : rule__GSSFilterMaxtermFilter__Group__7__Impl rule__GSSFilterMaxtermFilter__Group__8 ;
    public final void rule__GSSFilterMaxtermFilter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1347:1: ( rule__GSSFilterMaxtermFilter__Group__7__Impl rule__GSSFilterMaxtermFilter__Group__8 )
            // InternalFILTER.g:1348:2: rule__GSSFilterMaxtermFilter__Group__7__Impl rule__GSSFilterMaxtermFilter__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterMaxtermFilter__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxtermFilter__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__7"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__7__Impl"
    // InternalFILTER.g:1355:1: rule__GSSFilterMaxtermFilter__Group__7__Impl : ( 'version' ) ;
    public final void rule__GSSFilterMaxtermFilter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1359:1: ( ( 'version' ) )
            // InternalFILTER.g:1360:1: ( 'version' )
            {
            // InternalFILTER.g:1360:1: ( 'version' )
            // InternalFILTER.g:1361:2: 'version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionKeyword_7()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__7__Impl"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__8"
    // InternalFILTER.g:1370:1: rule__GSSFilterMaxtermFilter__Group__8 : rule__GSSFilterMaxtermFilter__Group__8__Impl rule__GSSFilterMaxtermFilter__Group__9 ;
    public final void rule__GSSFilterMaxtermFilter__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1374:1: ( rule__GSSFilterMaxtermFilter__Group__8__Impl rule__GSSFilterMaxtermFilter__Group__9 )
            // InternalFILTER.g:1375:2: rule__GSSFilterMaxtermFilter__Group__8__Impl rule__GSSFilterMaxtermFilter__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSFilterMaxtermFilter__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxtermFilter__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__8"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__8__Impl"
    // InternalFILTER.g:1382:1: rule__GSSFilterMaxtermFilter__Group__8__Impl : ( ':=' ) ;
    public final void rule__GSSFilterMaxtermFilter__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1386:1: ( ( ':=' ) )
            // InternalFILTER.g:1387:1: ( ':=' )
            {
            // InternalFILTER.g:1387:1: ( ':=' )
            // InternalFILTER.g:1388:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_8()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__8__Impl"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__9"
    // InternalFILTER.g:1397:1: rule__GSSFilterMaxtermFilter__Group__9 : rule__GSSFilterMaxtermFilter__Group__9__Impl rule__GSSFilterMaxtermFilter__Group__10 ;
    public final void rule__GSSFilterMaxtermFilter__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1401:1: ( rule__GSSFilterMaxtermFilter__Group__9__Impl rule__GSSFilterMaxtermFilter__Group__10 )
            // InternalFILTER.g:1402:2: rule__GSSFilterMaxtermFilter__Group__9__Impl rule__GSSFilterMaxtermFilter__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterMaxtermFilter__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxtermFilter__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__9"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__9__Impl"
    // InternalFILTER.g:1409:1: rule__GSSFilterMaxtermFilter__Group__9__Impl : ( ( rule__GSSFilterMaxtermFilter__VersionAssignment_9 ) ) ;
    public final void rule__GSSFilterMaxtermFilter__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1413:1: ( ( ( rule__GSSFilterMaxtermFilter__VersionAssignment_9 ) ) )
            // InternalFILTER.g:1414:1: ( ( rule__GSSFilterMaxtermFilter__VersionAssignment_9 ) )
            {
            // InternalFILTER.g:1414:1: ( ( rule__GSSFilterMaxtermFilter__VersionAssignment_9 ) )
            // InternalFILTER.g:1415:2: ( rule__GSSFilterMaxtermFilter__VersionAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionAssignment_9()); 
            }
            // InternalFILTER.g:1416:2: ( rule__GSSFilterMaxtermFilter__VersionAssignment_9 )
            // InternalFILTER.g:1416:3: rule__GSSFilterMaxtermFilter__VersionAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxtermFilter__VersionAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionAssignment_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__9__Impl"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__10"
    // InternalFILTER.g:1424:1: rule__GSSFilterMaxtermFilter__Group__10 : rule__GSSFilterMaxtermFilter__Group__10__Impl rule__GSSFilterMaxtermFilter__Group__11 ;
    public final void rule__GSSFilterMaxtermFilter__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1428:1: ( rule__GSSFilterMaxtermFilter__Group__10__Impl rule__GSSFilterMaxtermFilter__Group__11 )
            // InternalFILTER.g:1429:2: rule__GSSFilterMaxtermFilter__Group__10__Impl rule__GSSFilterMaxtermFilter__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__GSSFilterMaxtermFilter__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxtermFilter__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__10"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__10__Impl"
    // InternalFILTER.g:1436:1: rule__GSSFilterMaxtermFilter__Group__10__Impl : ( ';' ) ;
    public final void rule__GSSFilterMaxtermFilter__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1440:1: ( ( ';' ) )
            // InternalFILTER.g:1441:1: ( ';' )
            {
            // InternalFILTER.g:1441:1: ( ';' )
            // InternalFILTER.g:1442:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_10()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__10__Impl"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__11"
    // InternalFILTER.g:1451:1: rule__GSSFilterMaxtermFilter__Group__11 : rule__GSSFilterMaxtermFilter__Group__11__Impl rule__GSSFilterMaxtermFilter__Group__12 ;
    public final void rule__GSSFilterMaxtermFilter__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1455:1: ( rule__GSSFilterMaxtermFilter__Group__11__Impl rule__GSSFilterMaxtermFilter__Group__12 )
            // InternalFILTER.g:1456:2: rule__GSSFilterMaxtermFilter__Group__11__Impl rule__GSSFilterMaxtermFilter__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterMaxtermFilter__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxtermFilter__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__11"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__11__Impl"
    // InternalFILTER.g:1463:1: rule__GSSFilterMaxtermFilter__Group__11__Impl : ( 'formatFile' ) ;
    public final void rule__GSSFilterMaxtermFilter__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1467:1: ( ( 'formatFile' ) )
            // InternalFILTER.g:1468:1: ( 'formatFile' )
            {
            // InternalFILTER.g:1468:1: ( 'formatFile' )
            // InternalFILTER.g:1469:2: 'formatFile'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileKeyword_11()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__11__Impl"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__12"
    // InternalFILTER.g:1478:1: rule__GSSFilterMaxtermFilter__Group__12 : rule__GSSFilterMaxtermFilter__Group__12__Impl rule__GSSFilterMaxtermFilter__Group__13 ;
    public final void rule__GSSFilterMaxtermFilter__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1482:1: ( rule__GSSFilterMaxtermFilter__Group__12__Impl rule__GSSFilterMaxtermFilter__Group__13 )
            // InternalFILTER.g:1483:2: rule__GSSFilterMaxtermFilter__Group__12__Impl rule__GSSFilterMaxtermFilter__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSFilterMaxtermFilter__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxtermFilter__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__12"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__12__Impl"
    // InternalFILTER.g:1490:1: rule__GSSFilterMaxtermFilter__Group__12__Impl : ( ':=' ) ;
    public final void rule__GSSFilterMaxtermFilter__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1494:1: ( ( ':=' ) )
            // InternalFILTER.g:1495:1: ( ':=' )
            {
            // InternalFILTER.g:1495:1: ( ':=' )
            // InternalFILTER.g:1496:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_12()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__12__Impl"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__13"
    // InternalFILTER.g:1505:1: rule__GSSFilterMaxtermFilter__Group__13 : rule__GSSFilterMaxtermFilter__Group__13__Impl rule__GSSFilterMaxtermFilter__Group__14 ;
    public final void rule__GSSFilterMaxtermFilter__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1509:1: ( rule__GSSFilterMaxtermFilter__Group__13__Impl rule__GSSFilterMaxtermFilter__Group__14 )
            // InternalFILTER.g:1510:2: rule__GSSFilterMaxtermFilter__Group__13__Impl rule__GSSFilterMaxtermFilter__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterMaxtermFilter__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxtermFilter__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__13"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__13__Impl"
    // InternalFILTER.g:1517:1: rule__GSSFilterMaxtermFilter__Group__13__Impl : ( ( rule__GSSFilterMaxtermFilter__FormatFileAssignment_13 ) ) ;
    public final void rule__GSSFilterMaxtermFilter__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1521:1: ( ( ( rule__GSSFilterMaxtermFilter__FormatFileAssignment_13 ) ) )
            // InternalFILTER.g:1522:1: ( ( rule__GSSFilterMaxtermFilter__FormatFileAssignment_13 ) )
            {
            // InternalFILTER.g:1522:1: ( ( rule__GSSFilterMaxtermFilter__FormatFileAssignment_13 ) )
            // InternalFILTER.g:1523:2: ( rule__GSSFilterMaxtermFilter__FormatFileAssignment_13 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileAssignment_13()); 
            }
            // InternalFILTER.g:1524:2: ( rule__GSSFilterMaxtermFilter__FormatFileAssignment_13 )
            // InternalFILTER.g:1524:3: rule__GSSFilterMaxtermFilter__FormatFileAssignment_13
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxtermFilter__FormatFileAssignment_13();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileAssignment_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__13__Impl"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__14"
    // InternalFILTER.g:1532:1: rule__GSSFilterMaxtermFilter__Group__14 : rule__GSSFilterMaxtermFilter__Group__14__Impl rule__GSSFilterMaxtermFilter__Group__15 ;
    public final void rule__GSSFilterMaxtermFilter__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1536:1: ( rule__GSSFilterMaxtermFilter__Group__14__Impl rule__GSSFilterMaxtermFilter__Group__15 )
            // InternalFILTER.g:1537:2: rule__GSSFilterMaxtermFilter__Group__14__Impl rule__GSSFilterMaxtermFilter__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__GSSFilterMaxtermFilter__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxtermFilter__Group__15();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__14"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__14__Impl"
    // InternalFILTER.g:1544:1: rule__GSSFilterMaxtermFilter__Group__14__Impl : ( ';' ) ;
    public final void rule__GSSFilterMaxtermFilter__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1548:1: ( ( ';' ) )
            // InternalFILTER.g:1549:1: ( ';' )
            {
            // InternalFILTER.g:1549:1: ( ';' )
            // InternalFILTER.g:1550:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_14()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__14__Impl"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__15"
    // InternalFILTER.g:1559:1: rule__GSSFilterMaxtermFilter__Group__15 : rule__GSSFilterMaxtermFilter__Group__15__Impl rule__GSSFilterMaxtermFilter__Group__16 ;
    public final void rule__GSSFilterMaxtermFilter__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1563:1: ( rule__GSSFilterMaxtermFilter__Group__15__Impl rule__GSSFilterMaxtermFilter__Group__16 )
            // InternalFILTER.g:1564:2: rule__GSSFilterMaxtermFilter__Group__15__Impl rule__GSSFilterMaxtermFilter__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__GSSFilterMaxtermFilter__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxtermFilter__Group__16();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__15"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__15__Impl"
    // InternalFILTER.g:1571:1: rule__GSSFilterMaxtermFilter__Group__15__Impl : ( ( ( rule__GSSFilterMaxtermFilter__BoolVarAssignment_15 ) ) ( ( rule__GSSFilterMaxtermFilter__BoolVarAssignment_15 )* ) ) ;
    public final void rule__GSSFilterMaxtermFilter__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1575:1: ( ( ( ( rule__GSSFilterMaxtermFilter__BoolVarAssignment_15 ) ) ( ( rule__GSSFilterMaxtermFilter__BoolVarAssignment_15 )* ) ) )
            // InternalFILTER.g:1576:1: ( ( ( rule__GSSFilterMaxtermFilter__BoolVarAssignment_15 ) ) ( ( rule__GSSFilterMaxtermFilter__BoolVarAssignment_15 )* ) )
            {
            // InternalFILTER.g:1576:1: ( ( ( rule__GSSFilterMaxtermFilter__BoolVarAssignment_15 ) ) ( ( rule__GSSFilterMaxtermFilter__BoolVarAssignment_15 )* ) )
            // InternalFILTER.g:1577:2: ( ( rule__GSSFilterMaxtermFilter__BoolVarAssignment_15 ) ) ( ( rule__GSSFilterMaxtermFilter__BoolVarAssignment_15 )* )
            {
            // InternalFILTER.g:1577:2: ( ( rule__GSSFilterMaxtermFilter__BoolVarAssignment_15 ) )
            // InternalFILTER.g:1578:3: ( rule__GSSFilterMaxtermFilter__BoolVarAssignment_15 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarAssignment_15()); 
            }
            // InternalFILTER.g:1579:3: ( rule__GSSFilterMaxtermFilter__BoolVarAssignment_15 )
            // InternalFILTER.g:1579:4: rule__GSSFilterMaxtermFilter__BoolVarAssignment_15
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__GSSFilterMaxtermFilter__BoolVarAssignment_15();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarAssignment_15()); 
            }

            }

            // InternalFILTER.g:1582:2: ( ( rule__GSSFilterMaxtermFilter__BoolVarAssignment_15 )* )
            // InternalFILTER.g:1583:3: ( rule__GSSFilterMaxtermFilter__BoolVarAssignment_15 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarAssignment_15()); 
            }
            // InternalFILTER.g:1584:3: ( rule__GSSFilterMaxtermFilter__BoolVarAssignment_15 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==36||LA13_0==41||LA13_0==43||LA13_0==46) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFILTER.g:1584:4: rule__GSSFilterMaxtermFilter__BoolVarAssignment_15
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__GSSFilterMaxtermFilter__BoolVarAssignment_15();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarAssignment_15()); 
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
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__15__Impl"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__16"
    // InternalFILTER.g:1593:1: rule__GSSFilterMaxtermFilter__Group__16 : rule__GSSFilterMaxtermFilter__Group__16__Impl rule__GSSFilterMaxtermFilter__Group__17 ;
    public final void rule__GSSFilterMaxtermFilter__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1597:1: ( rule__GSSFilterMaxtermFilter__Group__16__Impl rule__GSSFilterMaxtermFilter__Group__17 )
            // InternalFILTER.g:1598:2: rule__GSSFilterMaxtermFilter__Group__16__Impl rule__GSSFilterMaxtermFilter__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSFilterMaxtermFilter__Group__16__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxtermFilter__Group__17();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__16"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__16__Impl"
    // InternalFILTER.g:1605:1: rule__GSSFilterMaxtermFilter__Group__16__Impl : ( ( ( rule__GSSFilterMaxtermFilter__MaxtermAssignment_16 ) ) ( ( rule__GSSFilterMaxtermFilter__MaxtermAssignment_16 )* ) ) ;
    public final void rule__GSSFilterMaxtermFilter__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1609:1: ( ( ( ( rule__GSSFilterMaxtermFilter__MaxtermAssignment_16 ) ) ( ( rule__GSSFilterMaxtermFilter__MaxtermAssignment_16 )* ) ) )
            // InternalFILTER.g:1610:1: ( ( ( rule__GSSFilterMaxtermFilter__MaxtermAssignment_16 ) ) ( ( rule__GSSFilterMaxtermFilter__MaxtermAssignment_16 )* ) )
            {
            // InternalFILTER.g:1610:1: ( ( ( rule__GSSFilterMaxtermFilter__MaxtermAssignment_16 ) ) ( ( rule__GSSFilterMaxtermFilter__MaxtermAssignment_16 )* ) )
            // InternalFILTER.g:1611:2: ( ( rule__GSSFilterMaxtermFilter__MaxtermAssignment_16 ) ) ( ( rule__GSSFilterMaxtermFilter__MaxtermAssignment_16 )* )
            {
            // InternalFILTER.g:1611:2: ( ( rule__GSSFilterMaxtermFilter__MaxtermAssignment_16 ) )
            // InternalFILTER.g:1612:3: ( rule__GSSFilterMaxtermFilter__MaxtermAssignment_16 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getMaxtermAssignment_16()); 
            }
            // InternalFILTER.g:1613:3: ( rule__GSSFilterMaxtermFilter__MaxtermAssignment_16 )
            // InternalFILTER.g:1613:4: rule__GSSFilterMaxtermFilter__MaxtermAssignment_16
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__GSSFilterMaxtermFilter__MaxtermAssignment_16();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getMaxtermAssignment_16()); 
            }

            }

            // InternalFILTER.g:1616:2: ( ( rule__GSSFilterMaxtermFilter__MaxtermAssignment_16 )* )
            // InternalFILTER.g:1617:3: ( rule__GSSFilterMaxtermFilter__MaxtermAssignment_16 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getMaxtermAssignment_16()); 
            }
            // InternalFILTER.g:1618:3: ( rule__GSSFilterMaxtermFilter__MaxtermAssignment_16 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==59) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalFILTER.g:1618:4: rule__GSSFilterMaxtermFilter__MaxtermAssignment_16
            	    {
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    rule__GSSFilterMaxtermFilter__MaxtermAssignment_16();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getMaxtermAssignment_16()); 
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
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__16__Impl"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__17"
    // InternalFILTER.g:1627:1: rule__GSSFilterMaxtermFilter__Group__17 : rule__GSSFilterMaxtermFilter__Group__17__Impl rule__GSSFilterMaxtermFilter__Group__18 ;
    public final void rule__GSSFilterMaxtermFilter__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1631:1: ( rule__GSSFilterMaxtermFilter__Group__17__Impl rule__GSSFilterMaxtermFilter__Group__18 )
            // InternalFILTER.g:1632:2: rule__GSSFilterMaxtermFilter__Group__17__Impl rule__GSSFilterMaxtermFilter__Group__18
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterMaxtermFilter__Group__17__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxtermFilter__Group__18();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__17"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__17__Impl"
    // InternalFILTER.g:1639:1: rule__GSSFilterMaxtermFilter__Group__17__Impl : ( '}' ) ;
    public final void rule__GSSFilterMaxtermFilter__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1643:1: ( ( '}' ) )
            // InternalFILTER.g:1644:1: ( '}' )
            {
            // InternalFILTER.g:1644:1: ( '}' )
            // InternalFILTER.g:1645:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getRightCurlyBracketKeyword_17()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getRightCurlyBracketKeyword_17()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__17__Impl"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__18"
    // InternalFILTER.g:1654:1: rule__GSSFilterMaxtermFilter__Group__18 : rule__GSSFilterMaxtermFilter__Group__18__Impl ;
    public final void rule__GSSFilterMaxtermFilter__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1658:1: ( rule__GSSFilterMaxtermFilter__Group__18__Impl )
            // InternalFILTER.g:1659:2: rule__GSSFilterMaxtermFilter__Group__18__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxtermFilter__Group__18__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__18"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__Group__18__Impl"
    // InternalFILTER.g:1665:1: rule__GSSFilterMaxtermFilter__Group__18__Impl : ( ';' ) ;
    public final void rule__GSSFilterMaxtermFilter__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1669:1: ( ( ';' ) )
            // InternalFILTER.g:1670:1: ( ';' )
            {
            // InternalFILTER.g:1670:1: ( ';' )
            // InternalFILTER.g:1671:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_18()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_18()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__Group__18__Impl"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__0"
    // InternalFILTER.g:1681:1: rule__GSSFilterMintermFilter__Group__0 : rule__GSSFilterMintermFilter__Group__0__Impl rule__GSSFilterMintermFilter__Group__1 ;
    public final void rule__GSSFilterMintermFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1685:1: ( rule__GSSFilterMintermFilter__Group__0__Impl rule__GSSFilterMintermFilter__Group__1 )
            // InternalFILTER.g:1686:2: rule__GSSFilterMintermFilter__Group__0__Impl rule__GSSFilterMintermFilter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSFilterMintermFilter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMintermFilter__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__0"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__0__Impl"
    // InternalFILTER.g:1693:1: rule__GSSFilterMintermFilter__Group__0__Impl : ( 'GSSFilterMintermFilter' ) ;
    public final void rule__GSSFilterMintermFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1697:1: ( ( 'GSSFilterMintermFilter' ) )
            // InternalFILTER.g:1698:1: ( 'GSSFilterMintermFilter' )
            {
            // InternalFILTER.g:1698:1: ( 'GSSFilterMintermFilter' )
            // InternalFILTER.g:1699:2: 'GSSFilterMintermFilter'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getGSSFilterMintermFilterKeyword_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getGSSFilterMintermFilterKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__0__Impl"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__1"
    // InternalFILTER.g:1708:1: rule__GSSFilterMintermFilter__Group__1 : rule__GSSFilterMintermFilter__Group__1__Impl rule__GSSFilterMintermFilter__Group__2 ;
    public final void rule__GSSFilterMintermFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1712:1: ( rule__GSSFilterMintermFilter__Group__1__Impl rule__GSSFilterMintermFilter__Group__2 )
            // InternalFILTER.g:1713:2: rule__GSSFilterMintermFilter__Group__1__Impl rule__GSSFilterMintermFilter__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSFilterMintermFilter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMintermFilter__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__1"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__1__Impl"
    // InternalFILTER.g:1720:1: rule__GSSFilterMintermFilter__Group__1__Impl : ( ( rule__GSSFilterMintermFilter__NameAssignment_1 ) ) ;
    public final void rule__GSSFilterMintermFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1724:1: ( ( ( rule__GSSFilterMintermFilter__NameAssignment_1 ) ) )
            // InternalFILTER.g:1725:1: ( ( rule__GSSFilterMintermFilter__NameAssignment_1 ) )
            {
            // InternalFILTER.g:1725:1: ( ( rule__GSSFilterMintermFilter__NameAssignment_1 ) )
            // InternalFILTER.g:1726:2: ( rule__GSSFilterMintermFilter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getNameAssignment_1()); 
            }
            // InternalFILTER.g:1727:2: ( rule__GSSFilterMintermFilter__NameAssignment_1 )
            // InternalFILTER.g:1727:3: rule__GSSFilterMintermFilter__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMintermFilter__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__1__Impl"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__2"
    // InternalFILTER.g:1735:1: rule__GSSFilterMintermFilter__Group__2 : rule__GSSFilterMintermFilter__Group__2__Impl rule__GSSFilterMintermFilter__Group__3 ;
    public final void rule__GSSFilterMintermFilter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1739:1: ( rule__GSSFilterMintermFilter__Group__2__Impl rule__GSSFilterMintermFilter__Group__3 )
            // InternalFILTER.g:1740:2: rule__GSSFilterMintermFilter__Group__2__Impl rule__GSSFilterMintermFilter__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSFilterMintermFilter__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMintermFilter__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__2"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__2__Impl"
    // InternalFILTER.g:1747:1: rule__GSSFilterMintermFilter__Group__2__Impl : ( '{' ) ;
    public final void rule__GSSFilterMintermFilter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1751:1: ( ( '{' ) )
            // InternalFILTER.g:1752:1: ( '{' )
            {
            // InternalFILTER.g:1752:1: ( '{' )
            // InternalFILTER.g:1753:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__2__Impl"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__3"
    // InternalFILTER.g:1762:1: rule__GSSFilterMintermFilter__Group__3 : rule__GSSFilterMintermFilter__Group__3__Impl rule__GSSFilterMintermFilter__Group__4 ;
    public final void rule__GSSFilterMintermFilter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1766:1: ( rule__GSSFilterMintermFilter__Group__3__Impl rule__GSSFilterMintermFilter__Group__4 )
            // InternalFILTER.g:1767:2: rule__GSSFilterMintermFilter__Group__3__Impl rule__GSSFilterMintermFilter__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterMintermFilter__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMintermFilter__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__3"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__3__Impl"
    // InternalFILTER.g:1774:1: rule__GSSFilterMintermFilter__Group__3__Impl : ( 'uri' ) ;
    public final void rule__GSSFilterMintermFilter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1778:1: ( ( 'uri' ) )
            // InternalFILTER.g:1779:1: ( 'uri' )
            {
            // InternalFILTER.g:1779:1: ( 'uri' )
            // InternalFILTER.g:1780:2: 'uri'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getUriKeyword_3()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getUriKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__3__Impl"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__4"
    // InternalFILTER.g:1789:1: rule__GSSFilterMintermFilter__Group__4 : rule__GSSFilterMintermFilter__Group__4__Impl rule__GSSFilterMintermFilter__Group__5 ;
    public final void rule__GSSFilterMintermFilter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1793:1: ( rule__GSSFilterMintermFilter__Group__4__Impl rule__GSSFilterMintermFilter__Group__5 )
            // InternalFILTER.g:1794:2: rule__GSSFilterMintermFilter__Group__4__Impl rule__GSSFilterMintermFilter__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSFilterMintermFilter__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMintermFilter__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__4"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__4__Impl"
    // InternalFILTER.g:1801:1: rule__GSSFilterMintermFilter__Group__4__Impl : ( ':=' ) ;
    public final void rule__GSSFilterMintermFilter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1805:1: ( ( ':=' ) )
            // InternalFILTER.g:1806:1: ( ':=' )
            {
            // InternalFILTER.g:1806:1: ( ':=' )
            // InternalFILTER.g:1807:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_4()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__4__Impl"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__5"
    // InternalFILTER.g:1816:1: rule__GSSFilterMintermFilter__Group__5 : rule__GSSFilterMintermFilter__Group__5__Impl rule__GSSFilterMintermFilter__Group__6 ;
    public final void rule__GSSFilterMintermFilter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1820:1: ( rule__GSSFilterMintermFilter__Group__5__Impl rule__GSSFilterMintermFilter__Group__6 )
            // InternalFILTER.g:1821:2: rule__GSSFilterMintermFilter__Group__5__Impl rule__GSSFilterMintermFilter__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterMintermFilter__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMintermFilter__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__5"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__5__Impl"
    // InternalFILTER.g:1828:1: rule__GSSFilterMintermFilter__Group__5__Impl : ( ( rule__GSSFilterMintermFilter__UriAssignment_5 ) ) ;
    public final void rule__GSSFilterMintermFilter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1832:1: ( ( ( rule__GSSFilterMintermFilter__UriAssignment_5 ) ) )
            // InternalFILTER.g:1833:1: ( ( rule__GSSFilterMintermFilter__UriAssignment_5 ) )
            {
            // InternalFILTER.g:1833:1: ( ( rule__GSSFilterMintermFilter__UriAssignment_5 ) )
            // InternalFILTER.g:1834:2: ( rule__GSSFilterMintermFilter__UriAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getUriAssignment_5()); 
            }
            // InternalFILTER.g:1835:2: ( rule__GSSFilterMintermFilter__UriAssignment_5 )
            // InternalFILTER.g:1835:3: rule__GSSFilterMintermFilter__UriAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMintermFilter__UriAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getUriAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__5__Impl"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__6"
    // InternalFILTER.g:1843:1: rule__GSSFilterMintermFilter__Group__6 : rule__GSSFilterMintermFilter__Group__6__Impl rule__GSSFilterMintermFilter__Group__7 ;
    public final void rule__GSSFilterMintermFilter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1847:1: ( rule__GSSFilterMintermFilter__Group__6__Impl rule__GSSFilterMintermFilter__Group__7 )
            // InternalFILTER.g:1848:2: rule__GSSFilterMintermFilter__Group__6__Impl rule__GSSFilterMintermFilter__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSFilterMintermFilter__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMintermFilter__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__6"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__6__Impl"
    // InternalFILTER.g:1855:1: rule__GSSFilterMintermFilter__Group__6__Impl : ( ';' ) ;
    public final void rule__GSSFilterMintermFilter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1859:1: ( ( ';' ) )
            // InternalFILTER.g:1860:1: ( ';' )
            {
            // InternalFILTER.g:1860:1: ( ';' )
            // InternalFILTER.g:1861:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_6()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__6__Impl"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__7"
    // InternalFILTER.g:1870:1: rule__GSSFilterMintermFilter__Group__7 : rule__GSSFilterMintermFilter__Group__7__Impl rule__GSSFilterMintermFilter__Group__8 ;
    public final void rule__GSSFilterMintermFilter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1874:1: ( rule__GSSFilterMintermFilter__Group__7__Impl rule__GSSFilterMintermFilter__Group__8 )
            // InternalFILTER.g:1875:2: rule__GSSFilterMintermFilter__Group__7__Impl rule__GSSFilterMintermFilter__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterMintermFilter__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMintermFilter__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__7"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__7__Impl"
    // InternalFILTER.g:1882:1: rule__GSSFilterMintermFilter__Group__7__Impl : ( 'version' ) ;
    public final void rule__GSSFilterMintermFilter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1886:1: ( ( 'version' ) )
            // InternalFILTER.g:1887:1: ( 'version' )
            {
            // InternalFILTER.g:1887:1: ( 'version' )
            // InternalFILTER.g:1888:2: 'version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getVersionKeyword_7()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getVersionKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__7__Impl"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__8"
    // InternalFILTER.g:1897:1: rule__GSSFilterMintermFilter__Group__8 : rule__GSSFilterMintermFilter__Group__8__Impl rule__GSSFilterMintermFilter__Group__9 ;
    public final void rule__GSSFilterMintermFilter__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1901:1: ( rule__GSSFilterMintermFilter__Group__8__Impl rule__GSSFilterMintermFilter__Group__9 )
            // InternalFILTER.g:1902:2: rule__GSSFilterMintermFilter__Group__8__Impl rule__GSSFilterMintermFilter__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSFilterMintermFilter__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMintermFilter__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__8"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__8__Impl"
    // InternalFILTER.g:1909:1: rule__GSSFilterMintermFilter__Group__8__Impl : ( ':=' ) ;
    public final void rule__GSSFilterMintermFilter__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1913:1: ( ( ':=' ) )
            // InternalFILTER.g:1914:1: ( ':=' )
            {
            // InternalFILTER.g:1914:1: ( ':=' )
            // InternalFILTER.g:1915:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_8()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__8__Impl"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__9"
    // InternalFILTER.g:1924:1: rule__GSSFilterMintermFilter__Group__9 : rule__GSSFilterMintermFilter__Group__9__Impl rule__GSSFilterMintermFilter__Group__10 ;
    public final void rule__GSSFilterMintermFilter__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1928:1: ( rule__GSSFilterMintermFilter__Group__9__Impl rule__GSSFilterMintermFilter__Group__10 )
            // InternalFILTER.g:1929:2: rule__GSSFilterMintermFilter__Group__9__Impl rule__GSSFilterMintermFilter__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterMintermFilter__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMintermFilter__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__9"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__9__Impl"
    // InternalFILTER.g:1936:1: rule__GSSFilterMintermFilter__Group__9__Impl : ( ( rule__GSSFilterMintermFilter__VersionAssignment_9 ) ) ;
    public final void rule__GSSFilterMintermFilter__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1940:1: ( ( ( rule__GSSFilterMintermFilter__VersionAssignment_9 ) ) )
            // InternalFILTER.g:1941:1: ( ( rule__GSSFilterMintermFilter__VersionAssignment_9 ) )
            {
            // InternalFILTER.g:1941:1: ( ( rule__GSSFilterMintermFilter__VersionAssignment_9 ) )
            // InternalFILTER.g:1942:2: ( rule__GSSFilterMintermFilter__VersionAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getVersionAssignment_9()); 
            }
            // InternalFILTER.g:1943:2: ( rule__GSSFilterMintermFilter__VersionAssignment_9 )
            // InternalFILTER.g:1943:3: rule__GSSFilterMintermFilter__VersionAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMintermFilter__VersionAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getVersionAssignment_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__9__Impl"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__10"
    // InternalFILTER.g:1951:1: rule__GSSFilterMintermFilter__Group__10 : rule__GSSFilterMintermFilter__Group__10__Impl rule__GSSFilterMintermFilter__Group__11 ;
    public final void rule__GSSFilterMintermFilter__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1955:1: ( rule__GSSFilterMintermFilter__Group__10__Impl rule__GSSFilterMintermFilter__Group__11 )
            // InternalFILTER.g:1956:2: rule__GSSFilterMintermFilter__Group__10__Impl rule__GSSFilterMintermFilter__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__GSSFilterMintermFilter__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMintermFilter__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__10"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__10__Impl"
    // InternalFILTER.g:1963:1: rule__GSSFilterMintermFilter__Group__10__Impl : ( ';' ) ;
    public final void rule__GSSFilterMintermFilter__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1967:1: ( ( ';' ) )
            // InternalFILTER.g:1968:1: ( ';' )
            {
            // InternalFILTER.g:1968:1: ( ';' )
            // InternalFILTER.g:1969:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_10()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__10__Impl"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__11"
    // InternalFILTER.g:1978:1: rule__GSSFilterMintermFilter__Group__11 : rule__GSSFilterMintermFilter__Group__11__Impl rule__GSSFilterMintermFilter__Group__12 ;
    public final void rule__GSSFilterMintermFilter__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1982:1: ( rule__GSSFilterMintermFilter__Group__11__Impl rule__GSSFilterMintermFilter__Group__12 )
            // InternalFILTER.g:1983:2: rule__GSSFilterMintermFilter__Group__11__Impl rule__GSSFilterMintermFilter__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterMintermFilter__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMintermFilter__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__11"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__11__Impl"
    // InternalFILTER.g:1990:1: rule__GSSFilterMintermFilter__Group__11__Impl : ( 'formatFile' ) ;
    public final void rule__GSSFilterMintermFilter__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1994:1: ( ( 'formatFile' ) )
            // InternalFILTER.g:1995:1: ( 'formatFile' )
            {
            // InternalFILTER.g:1995:1: ( 'formatFile' )
            // InternalFILTER.g:1996:2: 'formatFile'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileKeyword_11()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__11__Impl"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__12"
    // InternalFILTER.g:2005:1: rule__GSSFilterMintermFilter__Group__12 : rule__GSSFilterMintermFilter__Group__12__Impl rule__GSSFilterMintermFilter__Group__13 ;
    public final void rule__GSSFilterMintermFilter__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2009:1: ( rule__GSSFilterMintermFilter__Group__12__Impl rule__GSSFilterMintermFilter__Group__13 )
            // InternalFILTER.g:2010:2: rule__GSSFilterMintermFilter__Group__12__Impl rule__GSSFilterMintermFilter__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSFilterMintermFilter__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMintermFilter__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__12"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__12__Impl"
    // InternalFILTER.g:2017:1: rule__GSSFilterMintermFilter__Group__12__Impl : ( ':=' ) ;
    public final void rule__GSSFilterMintermFilter__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2021:1: ( ( ':=' ) )
            // InternalFILTER.g:2022:1: ( ':=' )
            {
            // InternalFILTER.g:2022:1: ( ':=' )
            // InternalFILTER.g:2023:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_12()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__12__Impl"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__13"
    // InternalFILTER.g:2032:1: rule__GSSFilterMintermFilter__Group__13 : rule__GSSFilterMintermFilter__Group__13__Impl rule__GSSFilterMintermFilter__Group__14 ;
    public final void rule__GSSFilterMintermFilter__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2036:1: ( rule__GSSFilterMintermFilter__Group__13__Impl rule__GSSFilterMintermFilter__Group__14 )
            // InternalFILTER.g:2037:2: rule__GSSFilterMintermFilter__Group__13__Impl rule__GSSFilterMintermFilter__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterMintermFilter__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMintermFilter__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__13"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__13__Impl"
    // InternalFILTER.g:2044:1: rule__GSSFilterMintermFilter__Group__13__Impl : ( ( rule__GSSFilterMintermFilter__FormatFileAssignment_13 ) ) ;
    public final void rule__GSSFilterMintermFilter__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2048:1: ( ( ( rule__GSSFilterMintermFilter__FormatFileAssignment_13 ) ) )
            // InternalFILTER.g:2049:1: ( ( rule__GSSFilterMintermFilter__FormatFileAssignment_13 ) )
            {
            // InternalFILTER.g:2049:1: ( ( rule__GSSFilterMintermFilter__FormatFileAssignment_13 ) )
            // InternalFILTER.g:2050:2: ( rule__GSSFilterMintermFilter__FormatFileAssignment_13 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileAssignment_13()); 
            }
            // InternalFILTER.g:2051:2: ( rule__GSSFilterMintermFilter__FormatFileAssignment_13 )
            // InternalFILTER.g:2051:3: rule__GSSFilterMintermFilter__FormatFileAssignment_13
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMintermFilter__FormatFileAssignment_13();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileAssignment_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__13__Impl"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__14"
    // InternalFILTER.g:2059:1: rule__GSSFilterMintermFilter__Group__14 : rule__GSSFilterMintermFilter__Group__14__Impl rule__GSSFilterMintermFilter__Group__15 ;
    public final void rule__GSSFilterMintermFilter__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2063:1: ( rule__GSSFilterMintermFilter__Group__14__Impl rule__GSSFilterMintermFilter__Group__15 )
            // InternalFILTER.g:2064:2: rule__GSSFilterMintermFilter__Group__14__Impl rule__GSSFilterMintermFilter__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__GSSFilterMintermFilter__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMintermFilter__Group__15();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__14"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__14__Impl"
    // InternalFILTER.g:2071:1: rule__GSSFilterMintermFilter__Group__14__Impl : ( ';' ) ;
    public final void rule__GSSFilterMintermFilter__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2075:1: ( ( ';' ) )
            // InternalFILTER.g:2076:1: ( ';' )
            {
            // InternalFILTER.g:2076:1: ( ';' )
            // InternalFILTER.g:2077:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_14()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__14__Impl"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__15"
    // InternalFILTER.g:2086:1: rule__GSSFilterMintermFilter__Group__15 : rule__GSSFilterMintermFilter__Group__15__Impl rule__GSSFilterMintermFilter__Group__16 ;
    public final void rule__GSSFilterMintermFilter__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2090:1: ( rule__GSSFilterMintermFilter__Group__15__Impl rule__GSSFilterMintermFilter__Group__16 )
            // InternalFILTER.g:2091:2: rule__GSSFilterMintermFilter__Group__15__Impl rule__GSSFilterMintermFilter__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__GSSFilterMintermFilter__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMintermFilter__Group__16();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__15"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__15__Impl"
    // InternalFILTER.g:2098:1: rule__GSSFilterMintermFilter__Group__15__Impl : ( ( ( rule__GSSFilterMintermFilter__BoolVarAssignment_15 ) ) ( ( rule__GSSFilterMintermFilter__BoolVarAssignment_15 )* ) ) ;
    public final void rule__GSSFilterMintermFilter__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2102:1: ( ( ( ( rule__GSSFilterMintermFilter__BoolVarAssignment_15 ) ) ( ( rule__GSSFilterMintermFilter__BoolVarAssignment_15 )* ) ) )
            // InternalFILTER.g:2103:1: ( ( ( rule__GSSFilterMintermFilter__BoolVarAssignment_15 ) ) ( ( rule__GSSFilterMintermFilter__BoolVarAssignment_15 )* ) )
            {
            // InternalFILTER.g:2103:1: ( ( ( rule__GSSFilterMintermFilter__BoolVarAssignment_15 ) ) ( ( rule__GSSFilterMintermFilter__BoolVarAssignment_15 )* ) )
            // InternalFILTER.g:2104:2: ( ( rule__GSSFilterMintermFilter__BoolVarAssignment_15 ) ) ( ( rule__GSSFilterMintermFilter__BoolVarAssignment_15 )* )
            {
            // InternalFILTER.g:2104:2: ( ( rule__GSSFilterMintermFilter__BoolVarAssignment_15 ) )
            // InternalFILTER.g:2105:3: ( rule__GSSFilterMintermFilter__BoolVarAssignment_15 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarAssignment_15()); 
            }
            // InternalFILTER.g:2106:3: ( rule__GSSFilterMintermFilter__BoolVarAssignment_15 )
            // InternalFILTER.g:2106:4: rule__GSSFilterMintermFilter__BoolVarAssignment_15
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__GSSFilterMintermFilter__BoolVarAssignment_15();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarAssignment_15()); 
            }

            }

            // InternalFILTER.g:2109:2: ( ( rule__GSSFilterMintermFilter__BoolVarAssignment_15 )* )
            // InternalFILTER.g:2110:3: ( rule__GSSFilterMintermFilter__BoolVarAssignment_15 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarAssignment_15()); 
            }
            // InternalFILTER.g:2111:3: ( rule__GSSFilterMintermFilter__BoolVarAssignment_15 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==36||LA15_0==41||LA15_0==43||LA15_0==46) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalFILTER.g:2111:4: rule__GSSFilterMintermFilter__BoolVarAssignment_15
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__GSSFilterMintermFilter__BoolVarAssignment_15();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarAssignment_15()); 
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
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__15__Impl"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__16"
    // InternalFILTER.g:2120:1: rule__GSSFilterMintermFilter__Group__16 : rule__GSSFilterMintermFilter__Group__16__Impl rule__GSSFilterMintermFilter__Group__17 ;
    public final void rule__GSSFilterMintermFilter__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2124:1: ( rule__GSSFilterMintermFilter__Group__16__Impl rule__GSSFilterMintermFilter__Group__17 )
            // InternalFILTER.g:2125:2: rule__GSSFilterMintermFilter__Group__16__Impl rule__GSSFilterMintermFilter__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSFilterMintermFilter__Group__16__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMintermFilter__Group__17();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__16"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__16__Impl"
    // InternalFILTER.g:2132:1: rule__GSSFilterMintermFilter__Group__16__Impl : ( ( ( rule__GSSFilterMintermFilter__MintermAssignment_16 ) ) ( ( rule__GSSFilterMintermFilter__MintermAssignment_16 )* ) ) ;
    public final void rule__GSSFilterMintermFilter__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2136:1: ( ( ( ( rule__GSSFilterMintermFilter__MintermAssignment_16 ) ) ( ( rule__GSSFilterMintermFilter__MintermAssignment_16 )* ) ) )
            // InternalFILTER.g:2137:1: ( ( ( rule__GSSFilterMintermFilter__MintermAssignment_16 ) ) ( ( rule__GSSFilterMintermFilter__MintermAssignment_16 )* ) )
            {
            // InternalFILTER.g:2137:1: ( ( ( rule__GSSFilterMintermFilter__MintermAssignment_16 ) ) ( ( rule__GSSFilterMintermFilter__MintermAssignment_16 )* ) )
            // InternalFILTER.g:2138:2: ( ( rule__GSSFilterMintermFilter__MintermAssignment_16 ) ) ( ( rule__GSSFilterMintermFilter__MintermAssignment_16 )* )
            {
            // InternalFILTER.g:2138:2: ( ( rule__GSSFilterMintermFilter__MintermAssignment_16 ) )
            // InternalFILTER.g:2139:3: ( rule__GSSFilterMintermFilter__MintermAssignment_16 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getMintermAssignment_16()); 
            }
            // InternalFILTER.g:2140:3: ( rule__GSSFilterMintermFilter__MintermAssignment_16 )
            // InternalFILTER.g:2140:4: rule__GSSFilterMintermFilter__MintermAssignment_16
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__GSSFilterMintermFilter__MintermAssignment_16();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getMintermAssignment_16()); 
            }

            }

            // InternalFILTER.g:2143:2: ( ( rule__GSSFilterMintermFilter__MintermAssignment_16 )* )
            // InternalFILTER.g:2144:3: ( rule__GSSFilterMintermFilter__MintermAssignment_16 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getMintermAssignment_16()); 
            }
            // InternalFILTER.g:2145:3: ( rule__GSSFilterMintermFilter__MintermAssignment_16 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==60) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFILTER.g:2145:4: rule__GSSFilterMintermFilter__MintermAssignment_16
            	    {
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    rule__GSSFilterMintermFilter__MintermAssignment_16();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getMintermAssignment_16()); 
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
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__16__Impl"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__17"
    // InternalFILTER.g:2154:1: rule__GSSFilterMintermFilter__Group__17 : rule__GSSFilterMintermFilter__Group__17__Impl rule__GSSFilterMintermFilter__Group__18 ;
    public final void rule__GSSFilterMintermFilter__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2158:1: ( rule__GSSFilterMintermFilter__Group__17__Impl rule__GSSFilterMintermFilter__Group__18 )
            // InternalFILTER.g:2159:2: rule__GSSFilterMintermFilter__Group__17__Impl rule__GSSFilterMintermFilter__Group__18
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterMintermFilter__Group__17__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMintermFilter__Group__18();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__17"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__17__Impl"
    // InternalFILTER.g:2166:1: rule__GSSFilterMintermFilter__Group__17__Impl : ( '}' ) ;
    public final void rule__GSSFilterMintermFilter__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2170:1: ( ( '}' ) )
            // InternalFILTER.g:2171:1: ( '}' )
            {
            // InternalFILTER.g:2171:1: ( '}' )
            // InternalFILTER.g:2172:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getRightCurlyBracketKeyword_17()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getRightCurlyBracketKeyword_17()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__17__Impl"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__18"
    // InternalFILTER.g:2181:1: rule__GSSFilterMintermFilter__Group__18 : rule__GSSFilterMintermFilter__Group__18__Impl ;
    public final void rule__GSSFilterMintermFilter__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2185:1: ( rule__GSSFilterMintermFilter__Group__18__Impl )
            // InternalFILTER.g:2186:2: rule__GSSFilterMintermFilter__Group__18__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMintermFilter__Group__18__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__18"


    // $ANTLR start "rule__GSSFilterMintermFilter__Group__18__Impl"
    // InternalFILTER.g:2192:1: rule__GSSFilterMintermFilter__Group__18__Impl : ( ';' ) ;
    public final void rule__GSSFilterMintermFilter__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2196:1: ( ( ';' ) )
            // InternalFILTER.g:2197:1: ( ';' )
            {
            // InternalFILTER.g:2197:1: ( ';' )
            // InternalFILTER.g:2198:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_18()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_18()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__Group__18__Impl"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__0"
    // InternalFILTER.g:2208:1: rule__GSSFilterBoolVar__Group__0 : rule__GSSFilterBoolVar__Group__0__Impl rule__GSSFilterBoolVar__Group__1 ;
    public final void rule__GSSFilterBoolVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2212:1: ( rule__GSSFilterBoolVar__Group__0__Impl rule__GSSFilterBoolVar__Group__1 )
            // InternalFILTER.g:2213:2: rule__GSSFilterBoolVar__Group__0__Impl rule__GSSFilterBoolVar__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSFilterBoolVar__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__0"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__0__Impl"
    // InternalFILTER.g:2220:1: rule__GSSFilterBoolVar__Group__0__Impl : ( 'GSSFilterBoolVar' ) ;
    public final void rule__GSSFilterBoolVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2224:1: ( ( 'GSSFilterBoolVar' ) )
            // InternalFILTER.g:2225:1: ( 'GSSFilterBoolVar' )
            {
            // InternalFILTER.g:2225:1: ( 'GSSFilterBoolVar' )
            // InternalFILTER.g:2226:2: 'GSSFilterBoolVar'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getGSSFilterBoolVarKeyword_0()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getGSSFilterBoolVarKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__0__Impl"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__1"
    // InternalFILTER.g:2235:1: rule__GSSFilterBoolVar__Group__1 : rule__GSSFilterBoolVar__Group__1__Impl rule__GSSFilterBoolVar__Group__2 ;
    public final void rule__GSSFilterBoolVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2239:1: ( rule__GSSFilterBoolVar__Group__1__Impl rule__GSSFilterBoolVar__Group__2 )
            // InternalFILTER.g:2240:2: rule__GSSFilterBoolVar__Group__1__Impl rule__GSSFilterBoolVar__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__GSSFilterBoolVar__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__1"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__1__Impl"
    // InternalFILTER.g:2247:1: rule__GSSFilterBoolVar__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSFilterBoolVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2251:1: ( ( '{' ) )
            // InternalFILTER.g:2252:1: ( '{' )
            {
            // InternalFILTER.g:2252:1: ( '{' )
            // InternalFILTER.g:2253:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__1__Impl"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__2"
    // InternalFILTER.g:2262:1: rule__GSSFilterBoolVar__Group__2 : rule__GSSFilterBoolVar__Group__2__Impl rule__GSSFilterBoolVar__Group__3 ;
    public final void rule__GSSFilterBoolVar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2266:1: ( rule__GSSFilterBoolVar__Group__2__Impl rule__GSSFilterBoolVar__Group__3 )
            // InternalFILTER.g:2267:2: rule__GSSFilterBoolVar__Group__2__Impl rule__GSSFilterBoolVar__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterBoolVar__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__2"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__2__Impl"
    // InternalFILTER.g:2274:1: rule__GSSFilterBoolVar__Group__2__Impl : ( 'id' ) ;
    public final void rule__GSSFilterBoolVar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2278:1: ( ( 'id' ) )
            // InternalFILTER.g:2279:1: ( 'id' )
            {
            // InternalFILTER.g:2279:1: ( 'id' )
            // InternalFILTER.g:2280:2: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getIdKeyword_2()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getIdKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__2__Impl"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__3"
    // InternalFILTER.g:2289:1: rule__GSSFilterBoolVar__Group__3 : rule__GSSFilterBoolVar__Group__3__Impl rule__GSSFilterBoolVar__Group__4 ;
    public final void rule__GSSFilterBoolVar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2293:1: ( rule__GSSFilterBoolVar__Group__3__Impl rule__GSSFilterBoolVar__Group__4 )
            // InternalFILTER.g:2294:2: rule__GSSFilterBoolVar__Group__3__Impl rule__GSSFilterBoolVar__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__GSSFilterBoolVar__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__3"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__3__Impl"
    // InternalFILTER.g:2301:1: rule__GSSFilterBoolVar__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSFilterBoolVar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2305:1: ( ( ':=' ) )
            // InternalFILTER.g:2306:1: ( ':=' )
            {
            // InternalFILTER.g:2306:1: ( ':=' )
            // InternalFILTER.g:2307:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__3__Impl"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__4"
    // InternalFILTER.g:2316:1: rule__GSSFilterBoolVar__Group__4 : rule__GSSFilterBoolVar__Group__4__Impl rule__GSSFilterBoolVar__Group__5 ;
    public final void rule__GSSFilterBoolVar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2320:1: ( rule__GSSFilterBoolVar__Group__4__Impl rule__GSSFilterBoolVar__Group__5 )
            // InternalFILTER.g:2321:2: rule__GSSFilterBoolVar__Group__4__Impl rule__GSSFilterBoolVar__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterBoolVar__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__4"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__4__Impl"
    // InternalFILTER.g:2328:1: rule__GSSFilterBoolVar__Group__4__Impl : ( ( rule__GSSFilterBoolVar__IdAssignment_4 ) ) ;
    public final void rule__GSSFilterBoolVar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2332:1: ( ( ( rule__GSSFilterBoolVar__IdAssignment_4 ) ) )
            // InternalFILTER.g:2333:1: ( ( rule__GSSFilterBoolVar__IdAssignment_4 ) )
            {
            // InternalFILTER.g:2333:1: ( ( rule__GSSFilterBoolVar__IdAssignment_4 ) )
            // InternalFILTER.g:2334:2: ( rule__GSSFilterBoolVar__IdAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getIdAssignment_4()); 
            }
            // InternalFILTER.g:2335:2: ( rule__GSSFilterBoolVar__IdAssignment_4 )
            // InternalFILTER.g:2335:3: rule__GSSFilterBoolVar__IdAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__IdAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getIdAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__4__Impl"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__5"
    // InternalFILTER.g:2343:1: rule__GSSFilterBoolVar__Group__5 : rule__GSSFilterBoolVar__Group__5__Impl rule__GSSFilterBoolVar__Group__6 ;
    public final void rule__GSSFilterBoolVar__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2347:1: ( rule__GSSFilterBoolVar__Group__5__Impl rule__GSSFilterBoolVar__Group__6 )
            // InternalFILTER.g:2348:2: rule__GSSFilterBoolVar__Group__5__Impl rule__GSSFilterBoolVar__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__GSSFilterBoolVar__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__5"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__5__Impl"
    // InternalFILTER.g:2355:1: rule__GSSFilterBoolVar__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSFilterBoolVar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2359:1: ( ( ';' ) )
            // InternalFILTER.g:2360:1: ( ';' )
            {
            // InternalFILTER.g:2360:1: ( ';' )
            // InternalFILTER.g:2361:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_5()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__5__Impl"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__6"
    // InternalFILTER.g:2370:1: rule__GSSFilterBoolVar__Group__6 : rule__GSSFilterBoolVar__Group__6__Impl rule__GSSFilterBoolVar__Group__7 ;
    public final void rule__GSSFilterBoolVar__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2374:1: ( rule__GSSFilterBoolVar__Group__6__Impl rule__GSSFilterBoolVar__Group__7 )
            // InternalFILTER.g:2375:2: rule__GSSFilterBoolVar__Group__6__Impl rule__GSSFilterBoolVar__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterBoolVar__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__6"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__6__Impl"
    // InternalFILTER.g:2382:1: rule__GSSFilterBoolVar__Group__6__Impl : ( 'name' ) ;
    public final void rule__GSSFilterBoolVar__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2386:1: ( ( 'name' ) )
            // InternalFILTER.g:2387:1: ( 'name' )
            {
            // InternalFILTER.g:2387:1: ( 'name' )
            // InternalFILTER.g:2388:2: 'name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getNameKeyword_6()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getNameKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__6__Impl"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__7"
    // InternalFILTER.g:2397:1: rule__GSSFilterBoolVar__Group__7 : rule__GSSFilterBoolVar__Group__7__Impl rule__GSSFilterBoolVar__Group__8 ;
    public final void rule__GSSFilterBoolVar__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2401:1: ( rule__GSSFilterBoolVar__Group__7__Impl rule__GSSFilterBoolVar__Group__8 )
            // InternalFILTER.g:2402:2: rule__GSSFilterBoolVar__Group__7__Impl rule__GSSFilterBoolVar__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSFilterBoolVar__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__7"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__7__Impl"
    // InternalFILTER.g:2409:1: rule__GSSFilterBoolVar__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSFilterBoolVar__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2413:1: ( ( ':=' ) )
            // InternalFILTER.g:2414:1: ( ':=' )
            {
            // InternalFILTER.g:2414:1: ( ':=' )
            // InternalFILTER.g:2415:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__7__Impl"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__8"
    // InternalFILTER.g:2424:1: rule__GSSFilterBoolVar__Group__8 : rule__GSSFilterBoolVar__Group__8__Impl rule__GSSFilterBoolVar__Group__9 ;
    public final void rule__GSSFilterBoolVar__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2428:1: ( rule__GSSFilterBoolVar__Group__8__Impl rule__GSSFilterBoolVar__Group__9 )
            // InternalFILTER.g:2429:2: rule__GSSFilterBoolVar__Group__8__Impl rule__GSSFilterBoolVar__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterBoolVar__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__8"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__8__Impl"
    // InternalFILTER.g:2436:1: rule__GSSFilterBoolVar__Group__8__Impl : ( ( rule__GSSFilterBoolVar__NameAssignment_8 ) ) ;
    public final void rule__GSSFilterBoolVar__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2440:1: ( ( ( rule__GSSFilterBoolVar__NameAssignment_8 ) ) )
            // InternalFILTER.g:2441:1: ( ( rule__GSSFilterBoolVar__NameAssignment_8 ) )
            {
            // InternalFILTER.g:2441:1: ( ( rule__GSSFilterBoolVar__NameAssignment_8 ) )
            // InternalFILTER.g:2442:2: ( rule__GSSFilterBoolVar__NameAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getNameAssignment_8()); 
            }
            // InternalFILTER.g:2443:2: ( rule__GSSFilterBoolVar__NameAssignment_8 )
            // InternalFILTER.g:2443:3: rule__GSSFilterBoolVar__NameAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__NameAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getNameAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__8__Impl"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__9"
    // InternalFILTER.g:2451:1: rule__GSSFilterBoolVar__Group__9 : rule__GSSFilterBoolVar__Group__9__Impl rule__GSSFilterBoolVar__Group__10 ;
    public final void rule__GSSFilterBoolVar__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2455:1: ( rule__GSSFilterBoolVar__Group__9__Impl rule__GSSFilterBoolVar__Group__10 )
            // InternalFILTER.g:2456:2: rule__GSSFilterBoolVar__Group__9__Impl rule__GSSFilterBoolVar__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__GSSFilterBoolVar__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__9"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__9__Impl"
    // InternalFILTER.g:2463:1: rule__GSSFilterBoolVar__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSFilterBoolVar__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2467:1: ( ( ';' ) )
            // InternalFILTER.g:2468:1: ( ';' )
            {
            // InternalFILTER.g:2468:1: ( ';' )
            // InternalFILTER.g:2469:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_9()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__9__Impl"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__10"
    // InternalFILTER.g:2478:1: rule__GSSFilterBoolVar__Group__10 : rule__GSSFilterBoolVar__Group__10__Impl rule__GSSFilterBoolVar__Group__11 ;
    public final void rule__GSSFilterBoolVar__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2482:1: ( rule__GSSFilterBoolVar__Group__10__Impl rule__GSSFilterBoolVar__Group__11 )
            // InternalFILTER.g:2483:2: rule__GSSFilterBoolVar__Group__10__Impl rule__GSSFilterBoolVar__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterBoolVar__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__10"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__10__Impl"
    // InternalFILTER.g:2490:1: rule__GSSFilterBoolVar__Group__10__Impl : ( 'constantType' ) ;
    public final void rule__GSSFilterBoolVar__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2494:1: ( ( 'constantType' ) )
            // InternalFILTER.g:2495:1: ( 'constantType' )
            {
            // InternalFILTER.g:2495:1: ( 'constantType' )
            // InternalFILTER.g:2496:2: 'constantType'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getConstantTypeKeyword_10()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getConstantTypeKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__10__Impl"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__11"
    // InternalFILTER.g:2505:1: rule__GSSFilterBoolVar__Group__11 : rule__GSSFilterBoolVar__Group__11__Impl rule__GSSFilterBoolVar__Group__12 ;
    public final void rule__GSSFilterBoolVar__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2509:1: ( rule__GSSFilterBoolVar__Group__11__Impl rule__GSSFilterBoolVar__Group__12 )
            // InternalFILTER.g:2510:2: rule__GSSFilterBoolVar__Group__11__Impl rule__GSSFilterBoolVar__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__GSSFilterBoolVar__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__11"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__11__Impl"
    // InternalFILTER.g:2517:1: rule__GSSFilterBoolVar__Group__11__Impl : ( ':=' ) ;
    public final void rule__GSSFilterBoolVar__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2521:1: ( ( ':=' ) )
            // InternalFILTER.g:2522:1: ( ':=' )
            {
            // InternalFILTER.g:2522:1: ( ':=' )
            // InternalFILTER.g:2523:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_11()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__11__Impl"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__12"
    // InternalFILTER.g:2532:1: rule__GSSFilterBoolVar__Group__12 : rule__GSSFilterBoolVar__Group__12__Impl rule__GSSFilterBoolVar__Group__13 ;
    public final void rule__GSSFilterBoolVar__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2536:1: ( rule__GSSFilterBoolVar__Group__12__Impl rule__GSSFilterBoolVar__Group__13 )
            // InternalFILTER.g:2537:2: rule__GSSFilterBoolVar__Group__12__Impl rule__GSSFilterBoolVar__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterBoolVar__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__12"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__12__Impl"
    // InternalFILTER.g:2544:1: rule__GSSFilterBoolVar__Group__12__Impl : ( ( rule__GSSFilterBoolVar__ConstantTypeAssignment_12 ) ) ;
    public final void rule__GSSFilterBoolVar__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2548:1: ( ( ( rule__GSSFilterBoolVar__ConstantTypeAssignment_12 ) ) )
            // InternalFILTER.g:2549:1: ( ( rule__GSSFilterBoolVar__ConstantTypeAssignment_12 ) )
            {
            // InternalFILTER.g:2549:1: ( ( rule__GSSFilterBoolVar__ConstantTypeAssignment_12 ) )
            // InternalFILTER.g:2550:2: ( rule__GSSFilterBoolVar__ConstantTypeAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getConstantTypeAssignment_12()); 
            }
            // InternalFILTER.g:2551:2: ( rule__GSSFilterBoolVar__ConstantTypeAssignment_12 )
            // InternalFILTER.g:2551:3: rule__GSSFilterBoolVar__ConstantTypeAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__ConstantTypeAssignment_12();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getConstantTypeAssignment_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__12__Impl"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__13"
    // InternalFILTER.g:2559:1: rule__GSSFilterBoolVar__Group__13 : rule__GSSFilterBoolVar__Group__13__Impl rule__GSSFilterBoolVar__Group__14 ;
    public final void rule__GSSFilterBoolVar__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2563:1: ( rule__GSSFilterBoolVar__Group__13__Impl rule__GSSFilterBoolVar__Group__14 )
            // InternalFILTER.g:2564:2: rule__GSSFilterBoolVar__Group__13__Impl rule__GSSFilterBoolVar__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__GSSFilterBoolVar__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__13"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__13__Impl"
    // InternalFILTER.g:2571:1: rule__GSSFilterBoolVar__Group__13__Impl : ( ';' ) ;
    public final void rule__GSSFilterBoolVar__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2575:1: ( ( ';' ) )
            // InternalFILTER.g:2576:1: ( ';' )
            {
            // InternalFILTER.g:2576:1: ( ';' )
            // InternalFILTER.g:2577:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_13()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__13__Impl"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__14"
    // InternalFILTER.g:2586:1: rule__GSSFilterBoolVar__Group__14 : rule__GSSFilterBoolVar__Group__14__Impl rule__GSSFilterBoolVar__Group__15 ;
    public final void rule__GSSFilterBoolVar__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2590:1: ( rule__GSSFilterBoolVar__Group__14__Impl rule__GSSFilterBoolVar__Group__15 )
            // InternalFILTER.g:2591:2: rule__GSSFilterBoolVar__Group__14__Impl rule__GSSFilterBoolVar__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterBoolVar__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__Group__15();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__14"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__14__Impl"
    // InternalFILTER.g:2598:1: rule__GSSFilterBoolVar__Group__14__Impl : ( 'FieldRef' ) ;
    public final void rule__GSSFilterBoolVar__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2602:1: ( ( 'FieldRef' ) )
            // InternalFILTER.g:2603:1: ( 'FieldRef' )
            {
            // InternalFILTER.g:2603:1: ( 'FieldRef' )
            // InternalFILTER.g:2604:2: 'FieldRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getFieldRefKeyword_14()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getFieldRefKeyword_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__14__Impl"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__15"
    // InternalFILTER.g:2613:1: rule__GSSFilterBoolVar__Group__15 : rule__GSSFilterBoolVar__Group__15__Impl rule__GSSFilterBoolVar__Group__16 ;
    public final void rule__GSSFilterBoolVar__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2617:1: ( rule__GSSFilterBoolVar__Group__15__Impl rule__GSSFilterBoolVar__Group__16 )
            // InternalFILTER.g:2618:2: rule__GSSFilterBoolVar__Group__15__Impl rule__GSSFilterBoolVar__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSFilterBoolVar__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__Group__16();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__15"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__15__Impl"
    // InternalFILTER.g:2625:1: rule__GSSFilterBoolVar__Group__15__Impl : ( ':=' ) ;
    public final void rule__GSSFilterBoolVar__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2629:1: ( ( ':=' ) )
            // InternalFILTER.g:2630:1: ( ':=' )
            {
            // InternalFILTER.g:2630:1: ( ':=' )
            // InternalFILTER.g:2631:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_15()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_15()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__15__Impl"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__16"
    // InternalFILTER.g:2640:1: rule__GSSFilterBoolVar__Group__16 : rule__GSSFilterBoolVar__Group__16__Impl rule__GSSFilterBoolVar__Group__17 ;
    public final void rule__GSSFilterBoolVar__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2644:1: ( rule__GSSFilterBoolVar__Group__16__Impl rule__GSSFilterBoolVar__Group__17 )
            // InternalFILTER.g:2645:2: rule__GSSFilterBoolVar__Group__16__Impl rule__GSSFilterBoolVar__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterBoolVar__Group__16__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__Group__17();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__16"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__16__Impl"
    // InternalFILTER.g:2652:1: rule__GSSFilterBoolVar__Group__16__Impl : ( ( rule__GSSFilterBoolVar__FieldRefAssignment_16 ) ) ;
    public final void rule__GSSFilterBoolVar__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2656:1: ( ( ( rule__GSSFilterBoolVar__FieldRefAssignment_16 ) ) )
            // InternalFILTER.g:2657:1: ( ( rule__GSSFilterBoolVar__FieldRefAssignment_16 ) )
            {
            // InternalFILTER.g:2657:1: ( ( rule__GSSFilterBoolVar__FieldRefAssignment_16 ) )
            // InternalFILTER.g:2658:2: ( rule__GSSFilterBoolVar__FieldRefAssignment_16 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getFieldRefAssignment_16()); 
            }
            // InternalFILTER.g:2659:2: ( rule__GSSFilterBoolVar__FieldRefAssignment_16 )
            // InternalFILTER.g:2659:3: rule__GSSFilterBoolVar__FieldRefAssignment_16
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__FieldRefAssignment_16();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getFieldRefAssignment_16()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__16__Impl"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__17"
    // InternalFILTER.g:2667:1: rule__GSSFilterBoolVar__Group__17 : rule__GSSFilterBoolVar__Group__17__Impl rule__GSSFilterBoolVar__Group__18 ;
    public final void rule__GSSFilterBoolVar__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2671:1: ( rule__GSSFilterBoolVar__Group__17__Impl rule__GSSFilterBoolVar__Group__18 )
            // InternalFILTER.g:2672:2: rule__GSSFilterBoolVar__Group__17__Impl rule__GSSFilterBoolVar__Group__18
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__GSSFilterBoolVar__Group__17__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__Group__18();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__17"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__17__Impl"
    // InternalFILTER.g:2679:1: rule__GSSFilterBoolVar__Group__17__Impl : ( ';' ) ;
    public final void rule__GSSFilterBoolVar__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2683:1: ( ( ';' ) )
            // InternalFILTER.g:2684:1: ( ';' )
            {
            // InternalFILTER.g:2684:1: ( ';' )
            // InternalFILTER.g:2685:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_17()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_17()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__17__Impl"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__18"
    // InternalFILTER.g:2694:1: rule__GSSFilterBoolVar__Group__18 : rule__GSSFilterBoolVar__Group__18__Impl rule__GSSFilterBoolVar__Group__19 ;
    public final void rule__GSSFilterBoolVar__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2698:1: ( rule__GSSFilterBoolVar__Group__18__Impl rule__GSSFilterBoolVar__Group__19 )
            // InternalFILTER.g:2699:2: rule__GSSFilterBoolVar__Group__18__Impl rule__GSSFilterBoolVar__Group__19
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__GSSFilterBoolVar__Group__18__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__Group__19();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__18"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__18__Impl"
    // InternalFILTER.g:2706:1: rule__GSSFilterBoolVar__Group__18__Impl : ( ( rule__GSSFilterBoolVar__OpAssignment_18 ) ) ;
    public final void rule__GSSFilterBoolVar__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2710:1: ( ( ( rule__GSSFilterBoolVar__OpAssignment_18 ) ) )
            // InternalFILTER.g:2711:1: ( ( rule__GSSFilterBoolVar__OpAssignment_18 ) )
            {
            // InternalFILTER.g:2711:1: ( ( rule__GSSFilterBoolVar__OpAssignment_18 ) )
            // InternalFILTER.g:2712:2: ( rule__GSSFilterBoolVar__OpAssignment_18 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getOpAssignment_18()); 
            }
            // InternalFILTER.g:2713:2: ( rule__GSSFilterBoolVar__OpAssignment_18 )
            // InternalFILTER.g:2713:3: rule__GSSFilterBoolVar__OpAssignment_18
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__OpAssignment_18();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getOpAssignment_18()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__18__Impl"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__19"
    // InternalFILTER.g:2721:1: rule__GSSFilterBoolVar__Group__19 : rule__GSSFilterBoolVar__Group__19__Impl rule__GSSFilterBoolVar__Group__20 ;
    public final void rule__GSSFilterBoolVar__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2725:1: ( rule__GSSFilterBoolVar__Group__19__Impl rule__GSSFilterBoolVar__Group__20 )
            // InternalFILTER.g:2726:2: rule__GSSFilterBoolVar__Group__19__Impl rule__GSSFilterBoolVar__Group__20
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSFilterBoolVar__Group__19__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__Group__20();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__19"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__19__Impl"
    // InternalFILTER.g:2733:1: rule__GSSFilterBoolVar__Group__19__Impl : ( ( rule__GSSFilterBoolVar__ValueAssignment_19 ) ) ;
    public final void rule__GSSFilterBoolVar__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2737:1: ( ( ( rule__GSSFilterBoolVar__ValueAssignment_19 ) ) )
            // InternalFILTER.g:2738:1: ( ( rule__GSSFilterBoolVar__ValueAssignment_19 ) )
            {
            // InternalFILTER.g:2738:1: ( ( rule__GSSFilterBoolVar__ValueAssignment_19 ) )
            // InternalFILTER.g:2739:2: ( rule__GSSFilterBoolVar__ValueAssignment_19 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getValueAssignment_19()); 
            }
            // InternalFILTER.g:2740:2: ( rule__GSSFilterBoolVar__ValueAssignment_19 )
            // InternalFILTER.g:2740:3: rule__GSSFilterBoolVar__ValueAssignment_19
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__ValueAssignment_19();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getValueAssignment_19()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__19__Impl"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__20"
    // InternalFILTER.g:2748:1: rule__GSSFilterBoolVar__Group__20 : rule__GSSFilterBoolVar__Group__20__Impl rule__GSSFilterBoolVar__Group__21 ;
    public final void rule__GSSFilterBoolVar__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2752:1: ( rule__GSSFilterBoolVar__Group__20__Impl rule__GSSFilterBoolVar__Group__21 )
            // InternalFILTER.g:2753:2: rule__GSSFilterBoolVar__Group__20__Impl rule__GSSFilterBoolVar__Group__21
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterBoolVar__Group__20__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__Group__21();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__20"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__20__Impl"
    // InternalFILTER.g:2760:1: rule__GSSFilterBoolVar__Group__20__Impl : ( '}' ) ;
    public final void rule__GSSFilterBoolVar__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2764:1: ( ( '}' ) )
            // InternalFILTER.g:2765:1: ( '}' )
            {
            // InternalFILTER.g:2765:1: ( '}' )
            // InternalFILTER.g:2766:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getRightCurlyBracketKeyword_20()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getRightCurlyBracketKeyword_20()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__20__Impl"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__21"
    // InternalFILTER.g:2775:1: rule__GSSFilterBoolVar__Group__21 : rule__GSSFilterBoolVar__Group__21__Impl ;
    public final void rule__GSSFilterBoolVar__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2779:1: ( rule__GSSFilterBoolVar__Group__21__Impl )
            // InternalFILTER.g:2780:2: rule__GSSFilterBoolVar__Group__21__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVar__Group__21__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__21"


    // $ANTLR start "rule__GSSFilterBoolVar__Group__21__Impl"
    // InternalFILTER.g:2786:1: rule__GSSFilterBoolVar__Group__21__Impl : ( ';' ) ;
    public final void rule__GSSFilterBoolVar__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2790:1: ( ( ';' ) )
            // InternalFILTER.g:2791:1: ( ';' )
            {
            // InternalFILTER.g:2791:1: ( ';' )
            // InternalFILTER.g:2792:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_21()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_21()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__Group__21__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__0"
    // InternalFILTER.g:2802:1: rule__GSSFilterBoolVarFromArrayItem__Group__0 : rule__GSSFilterBoolVarFromArrayItem__Group__0__Impl rule__GSSFilterBoolVarFromArrayItem__Group__1 ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2806:1: ( rule__GSSFilterBoolVarFromArrayItem__Group__0__Impl rule__GSSFilterBoolVarFromArrayItem__Group__1 )
            // InternalFILTER.g:2807:2: rule__GSSFilterBoolVarFromArrayItem__Group__0__Impl rule__GSSFilterBoolVarFromArrayItem__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSFilterBoolVarFromArrayItem__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__0"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__0__Impl"
    // InternalFILTER.g:2814:1: rule__GSSFilterBoolVarFromArrayItem__Group__0__Impl : ( 'GSSFilterBoolVarFromArrayItem' ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2818:1: ( ( 'GSSFilterBoolVarFromArrayItem' ) )
            // InternalFILTER.g:2819:1: ( 'GSSFilterBoolVarFromArrayItem' )
            {
            // InternalFILTER.g:2819:1: ( 'GSSFilterBoolVarFromArrayItem' )
            // InternalFILTER.g:2820:2: 'GSSFilterBoolVarFromArrayItem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getGSSFilterBoolVarFromArrayItemKeyword_0()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getGSSFilterBoolVarFromArrayItemKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__0__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__1"
    // InternalFILTER.g:2829:1: rule__GSSFilterBoolVarFromArrayItem__Group__1 : rule__GSSFilterBoolVarFromArrayItem__Group__1__Impl rule__GSSFilterBoolVarFromArrayItem__Group__2 ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2833:1: ( rule__GSSFilterBoolVarFromArrayItem__Group__1__Impl rule__GSSFilterBoolVarFromArrayItem__Group__2 )
            // InternalFILTER.g:2834:2: rule__GSSFilterBoolVarFromArrayItem__Group__1__Impl rule__GSSFilterBoolVarFromArrayItem__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__GSSFilterBoolVarFromArrayItem__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__1"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__1__Impl"
    // InternalFILTER.g:2841:1: rule__GSSFilterBoolVarFromArrayItem__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2845:1: ( ( '{' ) )
            // InternalFILTER.g:2846:1: ( '{' )
            {
            // InternalFILTER.g:2846:1: ( '{' )
            // InternalFILTER.g:2847:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__1__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__2"
    // InternalFILTER.g:2856:1: rule__GSSFilterBoolVarFromArrayItem__Group__2 : rule__GSSFilterBoolVarFromArrayItem__Group__2__Impl rule__GSSFilterBoolVarFromArrayItem__Group__3 ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2860:1: ( rule__GSSFilterBoolVarFromArrayItem__Group__2__Impl rule__GSSFilterBoolVarFromArrayItem__Group__3 )
            // InternalFILTER.g:2861:2: rule__GSSFilterBoolVarFromArrayItem__Group__2__Impl rule__GSSFilterBoolVarFromArrayItem__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterBoolVarFromArrayItem__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__2"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__2__Impl"
    // InternalFILTER.g:2868:1: rule__GSSFilterBoolVarFromArrayItem__Group__2__Impl : ( 'id' ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2872:1: ( ( 'id' ) )
            // InternalFILTER.g:2873:1: ( 'id' )
            {
            // InternalFILTER.g:2873:1: ( 'id' )
            // InternalFILTER.g:2874:2: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getIdKeyword_2()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getIdKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__2__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__3"
    // InternalFILTER.g:2883:1: rule__GSSFilterBoolVarFromArrayItem__Group__3 : rule__GSSFilterBoolVarFromArrayItem__Group__3__Impl rule__GSSFilterBoolVarFromArrayItem__Group__4 ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2887:1: ( rule__GSSFilterBoolVarFromArrayItem__Group__3__Impl rule__GSSFilterBoolVarFromArrayItem__Group__4 )
            // InternalFILTER.g:2888:2: rule__GSSFilterBoolVarFromArrayItem__Group__3__Impl rule__GSSFilterBoolVarFromArrayItem__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__GSSFilterBoolVarFromArrayItem__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__3"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__3__Impl"
    // InternalFILTER.g:2895:1: rule__GSSFilterBoolVarFromArrayItem__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2899:1: ( ( ':=' ) )
            // InternalFILTER.g:2900:1: ( ':=' )
            {
            // InternalFILTER.g:2900:1: ( ':=' )
            // InternalFILTER.g:2901:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__3__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__4"
    // InternalFILTER.g:2910:1: rule__GSSFilterBoolVarFromArrayItem__Group__4 : rule__GSSFilterBoolVarFromArrayItem__Group__4__Impl rule__GSSFilterBoolVarFromArrayItem__Group__5 ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2914:1: ( rule__GSSFilterBoolVarFromArrayItem__Group__4__Impl rule__GSSFilterBoolVarFromArrayItem__Group__5 )
            // InternalFILTER.g:2915:2: rule__GSSFilterBoolVarFromArrayItem__Group__4__Impl rule__GSSFilterBoolVarFromArrayItem__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterBoolVarFromArrayItem__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__4"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__4__Impl"
    // InternalFILTER.g:2922:1: rule__GSSFilterBoolVarFromArrayItem__Group__4__Impl : ( ( rule__GSSFilterBoolVarFromArrayItem__IdAssignment_4 ) ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2926:1: ( ( ( rule__GSSFilterBoolVarFromArrayItem__IdAssignment_4 ) ) )
            // InternalFILTER.g:2927:1: ( ( rule__GSSFilterBoolVarFromArrayItem__IdAssignment_4 ) )
            {
            // InternalFILTER.g:2927:1: ( ( rule__GSSFilterBoolVarFromArrayItem__IdAssignment_4 ) )
            // InternalFILTER.g:2928:2: ( rule__GSSFilterBoolVarFromArrayItem__IdAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getIdAssignment_4()); 
            }
            // InternalFILTER.g:2929:2: ( rule__GSSFilterBoolVarFromArrayItem__IdAssignment_4 )
            // InternalFILTER.g:2929:3: rule__GSSFilterBoolVarFromArrayItem__IdAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__IdAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getIdAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__4__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__5"
    // InternalFILTER.g:2937:1: rule__GSSFilterBoolVarFromArrayItem__Group__5 : rule__GSSFilterBoolVarFromArrayItem__Group__5__Impl rule__GSSFilterBoolVarFromArrayItem__Group__6 ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2941:1: ( rule__GSSFilterBoolVarFromArrayItem__Group__5__Impl rule__GSSFilterBoolVarFromArrayItem__Group__6 )
            // InternalFILTER.g:2942:2: rule__GSSFilterBoolVarFromArrayItem__Group__5__Impl rule__GSSFilterBoolVarFromArrayItem__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__GSSFilterBoolVarFromArrayItem__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__5"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__5__Impl"
    // InternalFILTER.g:2949:1: rule__GSSFilterBoolVarFromArrayItem__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2953:1: ( ( ';' ) )
            // InternalFILTER.g:2954:1: ( ';' )
            {
            // InternalFILTER.g:2954:1: ( ';' )
            // InternalFILTER.g:2955:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_5()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__5__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__6"
    // InternalFILTER.g:2964:1: rule__GSSFilterBoolVarFromArrayItem__Group__6 : rule__GSSFilterBoolVarFromArrayItem__Group__6__Impl rule__GSSFilterBoolVarFromArrayItem__Group__7 ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2968:1: ( rule__GSSFilterBoolVarFromArrayItem__Group__6__Impl rule__GSSFilterBoolVarFromArrayItem__Group__7 )
            // InternalFILTER.g:2969:2: rule__GSSFilterBoolVarFromArrayItem__Group__6__Impl rule__GSSFilterBoolVarFromArrayItem__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterBoolVarFromArrayItem__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__6"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__6__Impl"
    // InternalFILTER.g:2976:1: rule__GSSFilterBoolVarFromArrayItem__Group__6__Impl : ( 'name' ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2980:1: ( ( 'name' ) )
            // InternalFILTER.g:2981:1: ( 'name' )
            {
            // InternalFILTER.g:2981:1: ( 'name' )
            // InternalFILTER.g:2982:2: 'name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getNameKeyword_6()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getNameKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__6__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__7"
    // InternalFILTER.g:2991:1: rule__GSSFilterBoolVarFromArrayItem__Group__7 : rule__GSSFilterBoolVarFromArrayItem__Group__7__Impl rule__GSSFilterBoolVarFromArrayItem__Group__8 ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2995:1: ( rule__GSSFilterBoolVarFromArrayItem__Group__7__Impl rule__GSSFilterBoolVarFromArrayItem__Group__8 )
            // InternalFILTER.g:2996:2: rule__GSSFilterBoolVarFromArrayItem__Group__7__Impl rule__GSSFilterBoolVarFromArrayItem__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSFilterBoolVarFromArrayItem__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__7"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__7__Impl"
    // InternalFILTER.g:3003:1: rule__GSSFilterBoolVarFromArrayItem__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3007:1: ( ( ':=' ) )
            // InternalFILTER.g:3008:1: ( ':=' )
            {
            // InternalFILTER.g:3008:1: ( ':=' )
            // InternalFILTER.g:3009:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__7__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__8"
    // InternalFILTER.g:3018:1: rule__GSSFilterBoolVarFromArrayItem__Group__8 : rule__GSSFilterBoolVarFromArrayItem__Group__8__Impl rule__GSSFilterBoolVarFromArrayItem__Group__9 ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3022:1: ( rule__GSSFilterBoolVarFromArrayItem__Group__8__Impl rule__GSSFilterBoolVarFromArrayItem__Group__9 )
            // InternalFILTER.g:3023:2: rule__GSSFilterBoolVarFromArrayItem__Group__8__Impl rule__GSSFilterBoolVarFromArrayItem__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterBoolVarFromArrayItem__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__8"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__8__Impl"
    // InternalFILTER.g:3030:1: rule__GSSFilterBoolVarFromArrayItem__Group__8__Impl : ( ( rule__GSSFilterBoolVarFromArrayItem__NameAssignment_8 ) ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3034:1: ( ( ( rule__GSSFilterBoolVarFromArrayItem__NameAssignment_8 ) ) )
            // InternalFILTER.g:3035:1: ( ( rule__GSSFilterBoolVarFromArrayItem__NameAssignment_8 ) )
            {
            // InternalFILTER.g:3035:1: ( ( rule__GSSFilterBoolVarFromArrayItem__NameAssignment_8 ) )
            // InternalFILTER.g:3036:2: ( rule__GSSFilterBoolVarFromArrayItem__NameAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getNameAssignment_8()); 
            }
            // InternalFILTER.g:3037:2: ( rule__GSSFilterBoolVarFromArrayItem__NameAssignment_8 )
            // InternalFILTER.g:3037:3: rule__GSSFilterBoolVarFromArrayItem__NameAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__NameAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getNameAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__8__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__9"
    // InternalFILTER.g:3045:1: rule__GSSFilterBoolVarFromArrayItem__Group__9 : rule__GSSFilterBoolVarFromArrayItem__Group__9__Impl rule__GSSFilterBoolVarFromArrayItem__Group__10 ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3049:1: ( rule__GSSFilterBoolVarFromArrayItem__Group__9__Impl rule__GSSFilterBoolVarFromArrayItem__Group__10 )
            // InternalFILTER.g:3050:2: rule__GSSFilterBoolVarFromArrayItem__Group__9__Impl rule__GSSFilterBoolVarFromArrayItem__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__GSSFilterBoolVarFromArrayItem__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__9"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__9__Impl"
    // InternalFILTER.g:3057:1: rule__GSSFilterBoolVarFromArrayItem__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3061:1: ( ( ';' ) )
            // InternalFILTER.g:3062:1: ( ';' )
            {
            // InternalFILTER.g:3062:1: ( ';' )
            // InternalFILTER.g:3063:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_9()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__9__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__10"
    // InternalFILTER.g:3072:1: rule__GSSFilterBoolVarFromArrayItem__Group__10 : rule__GSSFilterBoolVarFromArrayItem__Group__10__Impl rule__GSSFilterBoolVarFromArrayItem__Group__11 ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3076:1: ( rule__GSSFilterBoolVarFromArrayItem__Group__10__Impl rule__GSSFilterBoolVarFromArrayItem__Group__11 )
            // InternalFILTER.g:3077:2: rule__GSSFilterBoolVarFromArrayItem__Group__10__Impl rule__GSSFilterBoolVarFromArrayItem__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterBoolVarFromArrayItem__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__10"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__10__Impl"
    // InternalFILTER.g:3084:1: rule__GSSFilterBoolVarFromArrayItem__Group__10__Impl : ( 'constantType' ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3088:1: ( ( 'constantType' ) )
            // InternalFILTER.g:3089:1: ( 'constantType' )
            {
            // InternalFILTER.g:3089:1: ( 'constantType' )
            // InternalFILTER.g:3090:2: 'constantType'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantTypeKeyword_10()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantTypeKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__10__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__11"
    // InternalFILTER.g:3099:1: rule__GSSFilterBoolVarFromArrayItem__Group__11 : rule__GSSFilterBoolVarFromArrayItem__Group__11__Impl rule__GSSFilterBoolVarFromArrayItem__Group__12 ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3103:1: ( rule__GSSFilterBoolVarFromArrayItem__Group__11__Impl rule__GSSFilterBoolVarFromArrayItem__Group__12 )
            // InternalFILTER.g:3104:2: rule__GSSFilterBoolVarFromArrayItem__Group__11__Impl rule__GSSFilterBoolVarFromArrayItem__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__GSSFilterBoolVarFromArrayItem__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__11"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__11__Impl"
    // InternalFILTER.g:3111:1: rule__GSSFilterBoolVarFromArrayItem__Group__11__Impl : ( ':=' ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3115:1: ( ( ':=' ) )
            // InternalFILTER.g:3116:1: ( ':=' )
            {
            // InternalFILTER.g:3116:1: ( ':=' )
            // InternalFILTER.g:3117:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_11()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__11__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__12"
    // InternalFILTER.g:3126:1: rule__GSSFilterBoolVarFromArrayItem__Group__12 : rule__GSSFilterBoolVarFromArrayItem__Group__12__Impl rule__GSSFilterBoolVarFromArrayItem__Group__13 ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3130:1: ( rule__GSSFilterBoolVarFromArrayItem__Group__12__Impl rule__GSSFilterBoolVarFromArrayItem__Group__13 )
            // InternalFILTER.g:3131:2: rule__GSSFilterBoolVarFromArrayItem__Group__12__Impl rule__GSSFilterBoolVarFromArrayItem__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterBoolVarFromArrayItem__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__12"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__12__Impl"
    // InternalFILTER.g:3138:1: rule__GSSFilterBoolVarFromArrayItem__Group__12__Impl : ( ( rule__GSSFilterBoolVarFromArrayItem__ConstantTypeAssignment_12 ) ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3142:1: ( ( ( rule__GSSFilterBoolVarFromArrayItem__ConstantTypeAssignment_12 ) ) )
            // InternalFILTER.g:3143:1: ( ( rule__GSSFilterBoolVarFromArrayItem__ConstantTypeAssignment_12 ) )
            {
            // InternalFILTER.g:3143:1: ( ( rule__GSSFilterBoolVarFromArrayItem__ConstantTypeAssignment_12 ) )
            // InternalFILTER.g:3144:2: ( rule__GSSFilterBoolVarFromArrayItem__ConstantTypeAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantTypeAssignment_12()); 
            }
            // InternalFILTER.g:3145:2: ( rule__GSSFilterBoolVarFromArrayItem__ConstantTypeAssignment_12 )
            // InternalFILTER.g:3145:3: rule__GSSFilterBoolVarFromArrayItem__ConstantTypeAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__ConstantTypeAssignment_12();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantTypeAssignment_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__12__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__13"
    // InternalFILTER.g:3153:1: rule__GSSFilterBoolVarFromArrayItem__Group__13 : rule__GSSFilterBoolVarFromArrayItem__Group__13__Impl rule__GSSFilterBoolVarFromArrayItem__Group__14 ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3157:1: ( rule__GSSFilterBoolVarFromArrayItem__Group__13__Impl rule__GSSFilterBoolVarFromArrayItem__Group__14 )
            // InternalFILTER.g:3158:2: rule__GSSFilterBoolVarFromArrayItem__Group__13__Impl rule__GSSFilterBoolVarFromArrayItem__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__GSSFilterBoolVarFromArrayItem__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__13"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__13__Impl"
    // InternalFILTER.g:3165:1: rule__GSSFilterBoolVarFromArrayItem__Group__13__Impl : ( ';' ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3169:1: ( ( ';' ) )
            // InternalFILTER.g:3170:1: ( ';' )
            {
            // InternalFILTER.g:3170:1: ( ';' )
            // InternalFILTER.g:3171:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_13()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__13__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__14"
    // InternalFILTER.g:3180:1: rule__GSSFilterBoolVarFromArrayItem__Group__14 : rule__GSSFilterBoolVarFromArrayItem__Group__14__Impl rule__GSSFilterBoolVarFromArrayItem__Group__15 ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3184:1: ( rule__GSSFilterBoolVarFromArrayItem__Group__14__Impl rule__GSSFilterBoolVarFromArrayItem__Group__15 )
            // InternalFILTER.g:3185:2: rule__GSSFilterBoolVarFromArrayItem__Group__14__Impl rule__GSSFilterBoolVarFromArrayItem__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterBoolVarFromArrayItem__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__Group__15();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__14"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__14__Impl"
    // InternalFILTER.g:3192:1: rule__GSSFilterBoolVarFromArrayItem__Group__14__Impl : ( 'AIFieldRef' ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3196:1: ( ( 'AIFieldRef' ) )
            // InternalFILTER.g:3197:1: ( 'AIFieldRef' )
            {
            // InternalFILTER.g:3197:1: ( 'AIFieldRef' )
            // InternalFILTER.g:3198:2: 'AIFieldRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAIFieldRefKeyword_14()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAIFieldRefKeyword_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__14__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__15"
    // InternalFILTER.g:3207:1: rule__GSSFilterBoolVarFromArrayItem__Group__15 : rule__GSSFilterBoolVarFromArrayItem__Group__15__Impl rule__GSSFilterBoolVarFromArrayItem__Group__16 ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3211:1: ( rule__GSSFilterBoolVarFromArrayItem__Group__15__Impl rule__GSSFilterBoolVarFromArrayItem__Group__16 )
            // InternalFILTER.g:3212:2: rule__GSSFilterBoolVarFromArrayItem__Group__15__Impl rule__GSSFilterBoolVarFromArrayItem__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSFilterBoolVarFromArrayItem__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__Group__16();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__15"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__15__Impl"
    // InternalFILTER.g:3219:1: rule__GSSFilterBoolVarFromArrayItem__Group__15__Impl : ( ':=' ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3223:1: ( ( ':=' ) )
            // InternalFILTER.g:3224:1: ( ':=' )
            {
            // InternalFILTER.g:3224:1: ( ':=' )
            // InternalFILTER.g:3225:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_15()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_15()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__15__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__16"
    // InternalFILTER.g:3234:1: rule__GSSFilterBoolVarFromArrayItem__Group__16 : rule__GSSFilterBoolVarFromArrayItem__Group__16__Impl rule__GSSFilterBoolVarFromArrayItem__Group__17 ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3238:1: ( rule__GSSFilterBoolVarFromArrayItem__Group__16__Impl rule__GSSFilterBoolVarFromArrayItem__Group__17 )
            // InternalFILTER.g:3239:2: rule__GSSFilterBoolVarFromArrayItem__Group__16__Impl rule__GSSFilterBoolVarFromArrayItem__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterBoolVarFromArrayItem__Group__16__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__Group__17();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__16"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__16__Impl"
    // InternalFILTER.g:3246:1: rule__GSSFilterBoolVarFromArrayItem__Group__16__Impl : ( ( rule__GSSFilterBoolVarFromArrayItem__AIFieldRefAssignment_16 ) ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3250:1: ( ( ( rule__GSSFilterBoolVarFromArrayItem__AIFieldRefAssignment_16 ) ) )
            // InternalFILTER.g:3251:1: ( ( rule__GSSFilterBoolVarFromArrayItem__AIFieldRefAssignment_16 ) )
            {
            // InternalFILTER.g:3251:1: ( ( rule__GSSFilterBoolVarFromArrayItem__AIFieldRefAssignment_16 ) )
            // InternalFILTER.g:3252:2: ( rule__GSSFilterBoolVarFromArrayItem__AIFieldRefAssignment_16 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAIFieldRefAssignment_16()); 
            }
            // InternalFILTER.g:3253:2: ( rule__GSSFilterBoolVarFromArrayItem__AIFieldRefAssignment_16 )
            // InternalFILTER.g:3253:3: rule__GSSFilterBoolVarFromArrayItem__AIFieldRefAssignment_16
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__AIFieldRefAssignment_16();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAIFieldRefAssignment_16()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__16__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__17"
    // InternalFILTER.g:3261:1: rule__GSSFilterBoolVarFromArrayItem__Group__17 : rule__GSSFilterBoolVarFromArrayItem__Group__17__Impl rule__GSSFilterBoolVarFromArrayItem__Group__18 ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3265:1: ( rule__GSSFilterBoolVarFromArrayItem__Group__17__Impl rule__GSSFilterBoolVarFromArrayItem__Group__18 )
            // InternalFILTER.g:3266:2: rule__GSSFilterBoolVarFromArrayItem__Group__17__Impl rule__GSSFilterBoolVarFromArrayItem__Group__18
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__GSSFilterBoolVarFromArrayItem__Group__17__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__Group__18();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__17"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__17__Impl"
    // InternalFILTER.g:3273:1: rule__GSSFilterBoolVarFromArrayItem__Group__17__Impl : ( ';' ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3277:1: ( ( ';' ) )
            // InternalFILTER.g:3278:1: ( ';' )
            {
            // InternalFILTER.g:3278:1: ( ';' )
            // InternalFILTER.g:3279:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_17()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_17()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__17__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__18"
    // InternalFILTER.g:3288:1: rule__GSSFilterBoolVarFromArrayItem__Group__18 : rule__GSSFilterBoolVarFromArrayItem__Group__18__Impl rule__GSSFilterBoolVarFromArrayItem__Group__19 ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3292:1: ( rule__GSSFilterBoolVarFromArrayItem__Group__18__Impl rule__GSSFilterBoolVarFromArrayItem__Group__19 )
            // InternalFILTER.g:3293:2: rule__GSSFilterBoolVarFromArrayItem__Group__18__Impl rule__GSSFilterBoolVarFromArrayItem__Group__19
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__GSSFilterBoolVarFromArrayItem__Group__18__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__Group__19();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__18"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__18__Impl"
    // InternalFILTER.g:3300:1: rule__GSSFilterBoolVarFromArrayItem__Group__18__Impl : ( ( rule__GSSFilterBoolVarFromArrayItem__OpAssignment_18 ) ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3304:1: ( ( ( rule__GSSFilterBoolVarFromArrayItem__OpAssignment_18 ) ) )
            // InternalFILTER.g:3305:1: ( ( rule__GSSFilterBoolVarFromArrayItem__OpAssignment_18 ) )
            {
            // InternalFILTER.g:3305:1: ( ( rule__GSSFilterBoolVarFromArrayItem__OpAssignment_18 ) )
            // InternalFILTER.g:3306:2: ( rule__GSSFilterBoolVarFromArrayItem__OpAssignment_18 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getOpAssignment_18()); 
            }
            // InternalFILTER.g:3307:2: ( rule__GSSFilterBoolVarFromArrayItem__OpAssignment_18 )
            // InternalFILTER.g:3307:3: rule__GSSFilterBoolVarFromArrayItem__OpAssignment_18
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__OpAssignment_18();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getOpAssignment_18()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__18__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__19"
    // InternalFILTER.g:3315:1: rule__GSSFilterBoolVarFromArrayItem__Group__19 : rule__GSSFilterBoolVarFromArrayItem__Group__19__Impl rule__GSSFilterBoolVarFromArrayItem__Group__20 ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3319:1: ( rule__GSSFilterBoolVarFromArrayItem__Group__19__Impl rule__GSSFilterBoolVarFromArrayItem__Group__20 )
            // InternalFILTER.g:3320:2: rule__GSSFilterBoolVarFromArrayItem__Group__19__Impl rule__GSSFilterBoolVarFromArrayItem__Group__20
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSFilterBoolVarFromArrayItem__Group__19__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__Group__20();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__19"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__19__Impl"
    // InternalFILTER.g:3327:1: rule__GSSFilterBoolVarFromArrayItem__Group__19__Impl : ( ( rule__GSSFilterBoolVarFromArrayItem__Alternatives_19 ) ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3331:1: ( ( ( rule__GSSFilterBoolVarFromArrayItem__Alternatives_19 ) ) )
            // InternalFILTER.g:3332:1: ( ( rule__GSSFilterBoolVarFromArrayItem__Alternatives_19 ) )
            {
            // InternalFILTER.g:3332:1: ( ( rule__GSSFilterBoolVarFromArrayItem__Alternatives_19 ) )
            // InternalFILTER.g:3333:2: ( rule__GSSFilterBoolVarFromArrayItem__Alternatives_19 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAlternatives_19()); 
            }
            // InternalFILTER.g:3334:2: ( rule__GSSFilterBoolVarFromArrayItem__Alternatives_19 )
            // InternalFILTER.g:3334:3: rule__GSSFilterBoolVarFromArrayItem__Alternatives_19
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__Alternatives_19();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAlternatives_19()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__19__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__20"
    // InternalFILTER.g:3342:1: rule__GSSFilterBoolVarFromArrayItem__Group__20 : rule__GSSFilterBoolVarFromArrayItem__Group__20__Impl rule__GSSFilterBoolVarFromArrayItem__Group__21 ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3346:1: ( rule__GSSFilterBoolVarFromArrayItem__Group__20__Impl rule__GSSFilterBoolVarFromArrayItem__Group__21 )
            // InternalFILTER.g:3347:2: rule__GSSFilterBoolVarFromArrayItem__Group__20__Impl rule__GSSFilterBoolVarFromArrayItem__Group__21
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterBoolVarFromArrayItem__Group__20__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__Group__21();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__20"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__20__Impl"
    // InternalFILTER.g:3354:1: rule__GSSFilterBoolVarFromArrayItem__Group__20__Impl : ( '}' ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3358:1: ( ( '}' ) )
            // InternalFILTER.g:3359:1: ( '}' )
            {
            // InternalFILTER.g:3359:1: ( '}' )
            // InternalFILTER.g:3360:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getRightCurlyBracketKeyword_20()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getRightCurlyBracketKeyword_20()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__20__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__21"
    // InternalFILTER.g:3369:1: rule__GSSFilterBoolVarFromArrayItem__Group__21 : rule__GSSFilterBoolVarFromArrayItem__Group__21__Impl ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3373:1: ( rule__GSSFilterBoolVarFromArrayItem__Group__21__Impl )
            // InternalFILTER.g:3374:2: rule__GSSFilterBoolVarFromArrayItem__Group__21__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromArrayItem__Group__21__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__21"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__Group__21__Impl"
    // InternalFILTER.g:3380:1: rule__GSSFilterBoolVarFromArrayItem__Group__21__Impl : ( ';' ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3384:1: ( ( ';' ) )
            // InternalFILTER.g:3385:1: ( ';' )
            {
            // InternalFILTER.g:3385:1: ( ';' )
            // InternalFILTER.g:3386:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_21()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_21()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__Group__21__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__0"
    // InternalFILTER.g:3396:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__0 : rule__GSSFilterBoolVarFromGroupedArrayItem__Group__0__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__1 ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3400:1: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__0__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__1 )
            // InternalFILTER.g:3401:2: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__0__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__0"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__0__Impl"
    // InternalFILTER.g:3408:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__0__Impl : ( 'GSSFilterBoolVarFromGroupedArrayItem' ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3412:1: ( ( 'GSSFilterBoolVarFromGroupedArrayItem' ) )
            // InternalFILTER.g:3413:1: ( 'GSSFilterBoolVarFromGroupedArrayItem' )
            {
            // InternalFILTER.g:3413:1: ( 'GSSFilterBoolVarFromGroupedArrayItem' )
            // InternalFILTER.g:3414:2: 'GSSFilterBoolVarFromGroupedArrayItem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGSSFilterBoolVarFromGroupedArrayItemKeyword_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGSSFilterBoolVarFromGroupedArrayItemKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__0__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__1"
    // InternalFILTER.g:3423:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__1 : rule__GSSFilterBoolVarFromGroupedArrayItem__Group__1__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__2 ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3427:1: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__1__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__2 )
            // InternalFILTER.g:3428:2: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__1__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__1"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__1__Impl"
    // InternalFILTER.g:3435:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3439:1: ( ( '{' ) )
            // InternalFILTER.g:3440:1: ( '{' )
            {
            // InternalFILTER.g:3440:1: ( '{' )
            // InternalFILTER.g:3441:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__1__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__2"
    // InternalFILTER.g:3450:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__2 : rule__GSSFilterBoolVarFromGroupedArrayItem__Group__2__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__3 ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3454:1: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__2__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__3 )
            // InternalFILTER.g:3455:2: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__2__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__2"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__2__Impl"
    // InternalFILTER.g:3462:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__2__Impl : ( 'id' ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3466:1: ( ( 'id' ) )
            // InternalFILTER.g:3467:1: ( 'id' )
            {
            // InternalFILTER.g:3467:1: ( 'id' )
            // InternalFILTER.g:3468:2: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getIdKeyword_2()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getIdKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__2__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__3"
    // InternalFILTER.g:3477:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__3 : rule__GSSFilterBoolVarFromGroupedArrayItem__Group__3__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__4 ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3481:1: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__3__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__4 )
            // InternalFILTER.g:3482:2: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__3__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__3"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__3__Impl"
    // InternalFILTER.g:3489:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3493:1: ( ( ':=' ) )
            // InternalFILTER.g:3494:1: ( ':=' )
            {
            // InternalFILTER.g:3494:1: ( ':=' )
            // InternalFILTER.g:3495:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__3__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__4"
    // InternalFILTER.g:3504:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__4 : rule__GSSFilterBoolVarFromGroupedArrayItem__Group__4__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__5 ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3508:1: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__4__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__5 )
            // InternalFILTER.g:3509:2: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__4__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__4"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__4__Impl"
    // InternalFILTER.g:3516:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__4__Impl : ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__IdAssignment_4 ) ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3520:1: ( ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__IdAssignment_4 ) ) )
            // InternalFILTER.g:3521:1: ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__IdAssignment_4 ) )
            {
            // InternalFILTER.g:3521:1: ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__IdAssignment_4 ) )
            // InternalFILTER.g:3522:2: ( rule__GSSFilterBoolVarFromGroupedArrayItem__IdAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getIdAssignment_4()); 
            }
            // InternalFILTER.g:3523:2: ( rule__GSSFilterBoolVarFromGroupedArrayItem__IdAssignment_4 )
            // InternalFILTER.g:3523:3: rule__GSSFilterBoolVarFromGroupedArrayItem__IdAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__IdAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getIdAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__4__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__5"
    // InternalFILTER.g:3531:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__5 : rule__GSSFilterBoolVarFromGroupedArrayItem__Group__5__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__6 ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3535:1: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__5__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__6 )
            // InternalFILTER.g:3536:2: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__5__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__5"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__5__Impl"
    // InternalFILTER.g:3543:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3547:1: ( ( ';' ) )
            // InternalFILTER.g:3548:1: ( ';' )
            {
            // InternalFILTER.g:3548:1: ( ';' )
            // InternalFILTER.g:3549:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_5()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__5__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__6"
    // InternalFILTER.g:3558:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__6 : rule__GSSFilterBoolVarFromGroupedArrayItem__Group__6__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__7 ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3562:1: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__6__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__7 )
            // InternalFILTER.g:3563:2: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__6__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__6"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__6__Impl"
    // InternalFILTER.g:3570:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__6__Impl : ( 'name' ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3574:1: ( ( 'name' ) )
            // InternalFILTER.g:3575:1: ( 'name' )
            {
            // InternalFILTER.g:3575:1: ( 'name' )
            // InternalFILTER.g:3576:2: 'name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getNameKeyword_6()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getNameKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__6__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__7"
    // InternalFILTER.g:3585:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__7 : rule__GSSFilterBoolVarFromGroupedArrayItem__Group__7__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__8 ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3589:1: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__7__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__8 )
            // InternalFILTER.g:3590:2: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__7__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__7"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__7__Impl"
    // InternalFILTER.g:3597:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3601:1: ( ( ':=' ) )
            // InternalFILTER.g:3602:1: ( ':=' )
            {
            // InternalFILTER.g:3602:1: ( ':=' )
            // InternalFILTER.g:3603:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__7__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__8"
    // InternalFILTER.g:3612:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__8 : rule__GSSFilterBoolVarFromGroupedArrayItem__Group__8__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__9 ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3616:1: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__8__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__9 )
            // InternalFILTER.g:3617:2: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__8__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__8"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__8__Impl"
    // InternalFILTER.g:3624:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__8__Impl : ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__NameAssignment_8 ) ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3628:1: ( ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__NameAssignment_8 ) ) )
            // InternalFILTER.g:3629:1: ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__NameAssignment_8 ) )
            {
            // InternalFILTER.g:3629:1: ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__NameAssignment_8 ) )
            // InternalFILTER.g:3630:2: ( rule__GSSFilterBoolVarFromGroupedArrayItem__NameAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getNameAssignment_8()); 
            }
            // InternalFILTER.g:3631:2: ( rule__GSSFilterBoolVarFromGroupedArrayItem__NameAssignment_8 )
            // InternalFILTER.g:3631:3: rule__GSSFilterBoolVarFromGroupedArrayItem__NameAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__NameAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getNameAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__8__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__9"
    // InternalFILTER.g:3639:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__9 : rule__GSSFilterBoolVarFromGroupedArrayItem__Group__9__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__10 ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3643:1: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__9__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__10 )
            // InternalFILTER.g:3644:2: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__9__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__9"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__9__Impl"
    // InternalFILTER.g:3651:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3655:1: ( ( ';' ) )
            // InternalFILTER.g:3656:1: ( ';' )
            {
            // InternalFILTER.g:3656:1: ( ';' )
            // InternalFILTER.g:3657:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_9()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__9__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__10"
    // InternalFILTER.g:3666:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__10 : rule__GSSFilterBoolVarFromGroupedArrayItem__Group__10__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__11 ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3670:1: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__10__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__11 )
            // InternalFILTER.g:3671:2: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__10__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__10"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__10__Impl"
    // InternalFILTER.g:3678:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__10__Impl : ( 'constantType' ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3682:1: ( ( 'constantType' ) )
            // InternalFILTER.g:3683:1: ( 'constantType' )
            {
            // InternalFILTER.g:3683:1: ( 'constantType' )
            // InternalFILTER.g:3684:2: 'constantType'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeKeyword_10()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__10__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__11"
    // InternalFILTER.g:3693:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__11 : rule__GSSFilterBoolVarFromGroupedArrayItem__Group__11__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__12 ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3697:1: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__11__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__12 )
            // InternalFILTER.g:3698:2: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__11__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__11"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__11__Impl"
    // InternalFILTER.g:3705:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__11__Impl : ( ':=' ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3709:1: ( ( ':=' ) )
            // InternalFILTER.g:3710:1: ( ':=' )
            {
            // InternalFILTER.g:3710:1: ( ':=' )
            // InternalFILTER.g:3711:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_11()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__11__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__12"
    // InternalFILTER.g:3720:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__12 : rule__GSSFilterBoolVarFromGroupedArrayItem__Group__12__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__13 ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3724:1: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__12__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__13 )
            // InternalFILTER.g:3725:2: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__12__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__12"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__12__Impl"
    // InternalFILTER.g:3732:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__12__Impl : ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12 ) ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3736:1: ( ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12 ) ) )
            // InternalFILTER.g:3737:1: ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12 ) )
            {
            // InternalFILTER.g:3737:1: ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12 ) )
            // InternalFILTER.g:3738:2: ( rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeAssignment_12()); 
            }
            // InternalFILTER.g:3739:2: ( rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12 )
            // InternalFILTER.g:3739:3: rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeAssignment_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__12__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__13"
    // InternalFILTER.g:3747:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__13 : rule__GSSFilterBoolVarFromGroupedArrayItem__Group__13__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__14 ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3751:1: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__13__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__14 )
            // InternalFILTER.g:3752:2: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__13__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__13"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__13__Impl"
    // InternalFILTER.g:3759:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__13__Impl : ( ';' ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3763:1: ( ( ';' ) )
            // InternalFILTER.g:3764:1: ( ';' )
            {
            // InternalFILTER.g:3764:1: ( ';' )
            // InternalFILTER.g:3765:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_13()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__13__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__14"
    // InternalFILTER.g:3774:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__14 : rule__GSSFilterBoolVarFromGroupedArrayItem__Group__14__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__15 ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3778:1: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__14__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__15 )
            // InternalFILTER.g:3779:2: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__14__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__15();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__14"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__14__Impl"
    // InternalFILTER.g:3786:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__14__Impl : ( 'group' ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3790:1: ( ( 'group' ) )
            // InternalFILTER.g:3791:1: ( 'group' )
            {
            // InternalFILTER.g:3791:1: ( 'group' )
            // InternalFILTER.g:3792:2: 'group'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGroupKeyword_14()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGroupKeyword_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__14__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__15"
    // InternalFILTER.g:3801:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__15 : rule__GSSFilterBoolVarFromGroupedArrayItem__Group__15__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__16 ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3805:1: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__15__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__16 )
            // InternalFILTER.g:3806:2: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__15__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__16();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__15"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__15__Impl"
    // InternalFILTER.g:3813:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__15__Impl : ( ':=' ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3817:1: ( ( ':=' ) )
            // InternalFILTER.g:3818:1: ( ':=' )
            {
            // InternalFILTER.g:3818:1: ( ':=' )
            // InternalFILTER.g:3819:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_15()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_15()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__15__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__16"
    // InternalFILTER.g:3828:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__16 : rule__GSSFilterBoolVarFromGroupedArrayItem__Group__16__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__17 ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3832:1: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__16__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__17 )
            // InternalFILTER.g:3833:2: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__16__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__16__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__17();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__16"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__16__Impl"
    // InternalFILTER.g:3840:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__16__Impl : ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__GroupAssignment_16 ) ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3844:1: ( ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__GroupAssignment_16 ) ) )
            // InternalFILTER.g:3845:1: ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__GroupAssignment_16 ) )
            {
            // InternalFILTER.g:3845:1: ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__GroupAssignment_16 ) )
            // InternalFILTER.g:3846:2: ( rule__GSSFilterBoolVarFromGroupedArrayItem__GroupAssignment_16 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGroupAssignment_16()); 
            }
            // InternalFILTER.g:3847:2: ( rule__GSSFilterBoolVarFromGroupedArrayItem__GroupAssignment_16 )
            // InternalFILTER.g:3847:3: rule__GSSFilterBoolVarFromGroupedArrayItem__GroupAssignment_16
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__GroupAssignment_16();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGroupAssignment_16()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__16__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__17"
    // InternalFILTER.g:3855:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__17 : rule__GSSFilterBoolVarFromGroupedArrayItem__Group__17__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__18 ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3859:1: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__17__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__18 )
            // InternalFILTER.g:3860:2: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__17__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__18
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__17__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__18();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__17"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__17__Impl"
    // InternalFILTER.g:3867:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__17__Impl : ( ';' ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3871:1: ( ( ';' ) )
            // InternalFILTER.g:3872:1: ( ';' )
            {
            // InternalFILTER.g:3872:1: ( ';' )
            // InternalFILTER.g:3873:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_17()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_17()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__17__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__18"
    // InternalFILTER.g:3882:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__18 : rule__GSSFilterBoolVarFromGroupedArrayItem__Group__18__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__19 ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3886:1: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__18__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__19 )
            // InternalFILTER.g:3887:2: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__18__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__19
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__18__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__19();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__18"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__18__Impl"
    // InternalFILTER.g:3894:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__18__Impl : ( 'AIFieldRefs' ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3898:1: ( ( 'AIFieldRefs' ) )
            // InternalFILTER.g:3899:1: ( 'AIFieldRefs' )
            {
            // InternalFILTER.g:3899:1: ( 'AIFieldRefs' )
            // InternalFILTER.g:3900:2: 'AIFieldRefs'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsKeyword_18()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsKeyword_18()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__18__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__19"
    // InternalFILTER.g:3909:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__19 : rule__GSSFilterBoolVarFromGroupedArrayItem__Group__19__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__20 ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3913:1: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__19__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__20 )
            // InternalFILTER.g:3914:2: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__19__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__20
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__19__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__20();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__19"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__19__Impl"
    // InternalFILTER.g:3921:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__19__Impl : ( ':=' ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3925:1: ( ( ':=' ) )
            // InternalFILTER.g:3926:1: ( ':=' )
            {
            // InternalFILTER.g:3926:1: ( ':=' )
            // InternalFILTER.g:3927:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_19()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_19()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__19__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__20"
    // InternalFILTER.g:3936:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__20 : rule__GSSFilterBoolVarFromGroupedArrayItem__Group__20__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__21 ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3940:1: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__20__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__21 )
            // InternalFILTER.g:3941:2: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__20__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__21
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__20__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__21();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__20"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__20__Impl"
    // InternalFILTER.g:3948:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__20__Impl : ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20 ) ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3952:1: ( ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20 ) ) )
            // InternalFILTER.g:3953:1: ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20 ) )
            {
            // InternalFILTER.g:3953:1: ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20 ) )
            // InternalFILTER.g:3954:2: ( rule__GSSFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsAssignment_20()); 
            }
            // InternalFILTER.g:3955:2: ( rule__GSSFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20 )
            // InternalFILTER.g:3955:3: rule__GSSFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsAssignment_20()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__20__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__21"
    // InternalFILTER.g:3963:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__21 : rule__GSSFilterBoolVarFromGroupedArrayItem__Group__21__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__22 ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3967:1: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__21__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__22 )
            // InternalFILTER.g:3968:2: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__21__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__22
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__21__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__22();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__21"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__21__Impl"
    // InternalFILTER.g:3975:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__21__Impl : ( ';' ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3979:1: ( ( ';' ) )
            // InternalFILTER.g:3980:1: ( ';' )
            {
            // InternalFILTER.g:3980:1: ( ';' )
            // InternalFILTER.g:3981:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_21()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_21()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__21__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__22"
    // InternalFILTER.g:3990:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__22 : rule__GSSFilterBoolVarFromGroupedArrayItem__Group__22__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__23 ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3994:1: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__22__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__23 )
            // InternalFILTER.g:3995:2: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__22__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__23
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__22__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__23();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__22"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__22__Impl"
    // InternalFILTER.g:4002:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__22__Impl : ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__OpAssignment_22 ) ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4006:1: ( ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__OpAssignment_22 ) ) )
            // InternalFILTER.g:4007:1: ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__OpAssignment_22 ) )
            {
            // InternalFILTER.g:4007:1: ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__OpAssignment_22 ) )
            // InternalFILTER.g:4008:2: ( rule__GSSFilterBoolVarFromGroupedArrayItem__OpAssignment_22 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getOpAssignment_22()); 
            }
            // InternalFILTER.g:4009:2: ( rule__GSSFilterBoolVarFromGroupedArrayItem__OpAssignment_22 )
            // InternalFILTER.g:4009:3: rule__GSSFilterBoolVarFromGroupedArrayItem__OpAssignment_22
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__OpAssignment_22();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getOpAssignment_22()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__22__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__23"
    // InternalFILTER.g:4017:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__23 : rule__GSSFilterBoolVarFromGroupedArrayItem__Group__23__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__24 ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4021:1: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__23__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__24 )
            // InternalFILTER.g:4022:2: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__23__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__24
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__23__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__24();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__23"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__23__Impl"
    // InternalFILTER.g:4029:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__23__Impl : ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__Alternatives_23 ) ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4033:1: ( ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__Alternatives_23 ) ) )
            // InternalFILTER.g:4034:1: ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__Alternatives_23 ) )
            {
            // InternalFILTER.g:4034:1: ( ( rule__GSSFilterBoolVarFromGroupedArrayItem__Alternatives_23 ) )
            // InternalFILTER.g:4035:2: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Alternatives_23 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAlternatives_23()); 
            }
            // InternalFILTER.g:4036:2: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Alternatives_23 )
            // InternalFILTER.g:4036:3: rule__GSSFilterBoolVarFromGroupedArrayItem__Alternatives_23
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Alternatives_23();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAlternatives_23()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__23__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__24"
    // InternalFILTER.g:4044:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__24 : rule__GSSFilterBoolVarFromGroupedArrayItem__Group__24__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__25 ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4048:1: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__24__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__25 )
            // InternalFILTER.g:4049:2: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__24__Impl rule__GSSFilterBoolVarFromGroupedArrayItem__Group__25
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__24__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__25();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__24"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__24__Impl"
    // InternalFILTER.g:4056:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__24__Impl : ( '}' ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4060:1: ( ( '}' ) )
            // InternalFILTER.g:4061:1: ( '}' )
            {
            // InternalFILTER.g:4061:1: ( '}' )
            // InternalFILTER.g:4062:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getRightCurlyBracketKeyword_24()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getRightCurlyBracketKeyword_24()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__24__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__25"
    // InternalFILTER.g:4071:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__25 : rule__GSSFilterBoolVarFromGroupedArrayItem__Group__25__Impl ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4075:1: ( rule__GSSFilterBoolVarFromGroupedArrayItem__Group__25__Impl )
            // InternalFILTER.g:4076:2: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__25__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFromGroupedArrayItem__Group__25__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__25"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__25__Impl"
    // InternalFILTER.g:4082:1: rule__GSSFilterBoolVarFromGroupedArrayItem__Group__25__Impl : ( ';' ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4086:1: ( ( ';' ) )
            // InternalFILTER.g:4087:1: ( ';' )
            {
            // InternalFILTER.g:4087:1: ( ';' )
            // InternalFILTER.g:4088:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_25()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_25()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__Group__25__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__0"
    // InternalFILTER.g:4098:1: rule__GSSFilterBoolVarFDIC__Group__0 : rule__GSSFilterBoolVarFDIC__Group__0__Impl rule__GSSFilterBoolVarFDIC__Group__1 ;
    public final void rule__GSSFilterBoolVarFDIC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4102:1: ( rule__GSSFilterBoolVarFDIC__Group__0__Impl rule__GSSFilterBoolVarFDIC__Group__1 )
            // InternalFILTER.g:4103:2: rule__GSSFilterBoolVarFDIC__Group__0__Impl rule__GSSFilterBoolVarFDIC__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSFilterBoolVarFDIC__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFDIC__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__0"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__0__Impl"
    // InternalFILTER.g:4110:1: rule__GSSFilterBoolVarFDIC__Group__0__Impl : ( 'GSSFilterBoolVarFDIC' ) ;
    public final void rule__GSSFilterBoolVarFDIC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4114:1: ( ( 'GSSFilterBoolVarFDIC' ) )
            // InternalFILTER.g:4115:1: ( 'GSSFilterBoolVarFDIC' )
            {
            // InternalFILTER.g:4115:1: ( 'GSSFilterBoolVarFDIC' )
            // InternalFILTER.g:4116:2: 'GSSFilterBoolVarFDIC'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFDICAccess().getGSSFilterBoolVarFDICKeyword_0()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFDICAccess().getGSSFilterBoolVarFDICKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__0__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__1"
    // InternalFILTER.g:4125:1: rule__GSSFilterBoolVarFDIC__Group__1 : rule__GSSFilterBoolVarFDIC__Group__1__Impl rule__GSSFilterBoolVarFDIC__Group__2 ;
    public final void rule__GSSFilterBoolVarFDIC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4129:1: ( rule__GSSFilterBoolVarFDIC__Group__1__Impl rule__GSSFilterBoolVarFDIC__Group__2 )
            // InternalFILTER.g:4130:2: rule__GSSFilterBoolVarFDIC__Group__1__Impl rule__GSSFilterBoolVarFDIC__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__GSSFilterBoolVarFDIC__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFDIC__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__1"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__1__Impl"
    // InternalFILTER.g:4137:1: rule__GSSFilterBoolVarFDIC__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSFilterBoolVarFDIC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4141:1: ( ( '{' ) )
            // InternalFILTER.g:4142:1: ( '{' )
            {
            // InternalFILTER.g:4142:1: ( '{' )
            // InternalFILTER.g:4143:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFDICAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFDICAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__1__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__2"
    // InternalFILTER.g:4152:1: rule__GSSFilterBoolVarFDIC__Group__2 : rule__GSSFilterBoolVarFDIC__Group__2__Impl rule__GSSFilterBoolVarFDIC__Group__3 ;
    public final void rule__GSSFilterBoolVarFDIC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4156:1: ( rule__GSSFilterBoolVarFDIC__Group__2__Impl rule__GSSFilterBoolVarFDIC__Group__3 )
            // InternalFILTER.g:4157:2: rule__GSSFilterBoolVarFDIC__Group__2__Impl rule__GSSFilterBoolVarFDIC__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterBoolVarFDIC__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFDIC__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__2"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__2__Impl"
    // InternalFILTER.g:4164:1: rule__GSSFilterBoolVarFDIC__Group__2__Impl : ( 'id' ) ;
    public final void rule__GSSFilterBoolVarFDIC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4168:1: ( ( 'id' ) )
            // InternalFILTER.g:4169:1: ( 'id' )
            {
            // InternalFILTER.g:4169:1: ( 'id' )
            // InternalFILTER.g:4170:2: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFDICAccess().getIdKeyword_2()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFDICAccess().getIdKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__2__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__3"
    // InternalFILTER.g:4179:1: rule__GSSFilterBoolVarFDIC__Group__3 : rule__GSSFilterBoolVarFDIC__Group__3__Impl rule__GSSFilterBoolVarFDIC__Group__4 ;
    public final void rule__GSSFilterBoolVarFDIC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4183:1: ( rule__GSSFilterBoolVarFDIC__Group__3__Impl rule__GSSFilterBoolVarFDIC__Group__4 )
            // InternalFILTER.g:4184:2: rule__GSSFilterBoolVarFDIC__Group__3__Impl rule__GSSFilterBoolVarFDIC__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__GSSFilterBoolVarFDIC__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFDIC__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__3"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__3__Impl"
    // InternalFILTER.g:4191:1: rule__GSSFilterBoolVarFDIC__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSFilterBoolVarFDIC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4195:1: ( ( ':=' ) )
            // InternalFILTER.g:4196:1: ( ':=' )
            {
            // InternalFILTER.g:4196:1: ( ':=' )
            // InternalFILTER.g:4197:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFDICAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFDICAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__3__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__4"
    // InternalFILTER.g:4206:1: rule__GSSFilterBoolVarFDIC__Group__4 : rule__GSSFilterBoolVarFDIC__Group__4__Impl rule__GSSFilterBoolVarFDIC__Group__5 ;
    public final void rule__GSSFilterBoolVarFDIC__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4210:1: ( rule__GSSFilterBoolVarFDIC__Group__4__Impl rule__GSSFilterBoolVarFDIC__Group__5 )
            // InternalFILTER.g:4211:2: rule__GSSFilterBoolVarFDIC__Group__4__Impl rule__GSSFilterBoolVarFDIC__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterBoolVarFDIC__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFDIC__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__4"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__4__Impl"
    // InternalFILTER.g:4218:1: rule__GSSFilterBoolVarFDIC__Group__4__Impl : ( ( rule__GSSFilterBoolVarFDIC__IdAssignment_4 ) ) ;
    public final void rule__GSSFilterBoolVarFDIC__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4222:1: ( ( ( rule__GSSFilterBoolVarFDIC__IdAssignment_4 ) ) )
            // InternalFILTER.g:4223:1: ( ( rule__GSSFilterBoolVarFDIC__IdAssignment_4 ) )
            {
            // InternalFILTER.g:4223:1: ( ( rule__GSSFilterBoolVarFDIC__IdAssignment_4 ) )
            // InternalFILTER.g:4224:2: ( rule__GSSFilterBoolVarFDIC__IdAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFDICAccess().getIdAssignment_4()); 
            }
            // InternalFILTER.g:4225:2: ( rule__GSSFilterBoolVarFDIC__IdAssignment_4 )
            // InternalFILTER.g:4225:3: rule__GSSFilterBoolVarFDIC__IdAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFDIC__IdAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFDICAccess().getIdAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__4__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__5"
    // InternalFILTER.g:4233:1: rule__GSSFilterBoolVarFDIC__Group__5 : rule__GSSFilterBoolVarFDIC__Group__5__Impl rule__GSSFilterBoolVarFDIC__Group__6 ;
    public final void rule__GSSFilterBoolVarFDIC__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4237:1: ( rule__GSSFilterBoolVarFDIC__Group__5__Impl rule__GSSFilterBoolVarFDIC__Group__6 )
            // InternalFILTER.g:4238:2: rule__GSSFilterBoolVarFDIC__Group__5__Impl rule__GSSFilterBoolVarFDIC__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__GSSFilterBoolVarFDIC__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFDIC__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__5"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__5__Impl"
    // InternalFILTER.g:4245:1: rule__GSSFilterBoolVarFDIC__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSFilterBoolVarFDIC__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4249:1: ( ( ';' ) )
            // InternalFILTER.g:4250:1: ( ';' )
            {
            // InternalFILTER.g:4250:1: ( ';' )
            // InternalFILTER.g:4251:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFDICAccess().getSemicolonKeyword_5()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFDICAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__5__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__6"
    // InternalFILTER.g:4260:1: rule__GSSFilterBoolVarFDIC__Group__6 : rule__GSSFilterBoolVarFDIC__Group__6__Impl rule__GSSFilterBoolVarFDIC__Group__7 ;
    public final void rule__GSSFilterBoolVarFDIC__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4264:1: ( rule__GSSFilterBoolVarFDIC__Group__6__Impl rule__GSSFilterBoolVarFDIC__Group__7 )
            // InternalFILTER.g:4265:2: rule__GSSFilterBoolVarFDIC__Group__6__Impl rule__GSSFilterBoolVarFDIC__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterBoolVarFDIC__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFDIC__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__6"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__6__Impl"
    // InternalFILTER.g:4272:1: rule__GSSFilterBoolVarFDIC__Group__6__Impl : ( 'name' ) ;
    public final void rule__GSSFilterBoolVarFDIC__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4276:1: ( ( 'name' ) )
            // InternalFILTER.g:4277:1: ( 'name' )
            {
            // InternalFILTER.g:4277:1: ( 'name' )
            // InternalFILTER.g:4278:2: 'name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFDICAccess().getNameKeyword_6()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFDICAccess().getNameKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__6__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__7"
    // InternalFILTER.g:4287:1: rule__GSSFilterBoolVarFDIC__Group__7 : rule__GSSFilterBoolVarFDIC__Group__7__Impl rule__GSSFilterBoolVarFDIC__Group__8 ;
    public final void rule__GSSFilterBoolVarFDIC__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4291:1: ( rule__GSSFilterBoolVarFDIC__Group__7__Impl rule__GSSFilterBoolVarFDIC__Group__8 )
            // InternalFILTER.g:4292:2: rule__GSSFilterBoolVarFDIC__Group__7__Impl rule__GSSFilterBoolVarFDIC__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSFilterBoolVarFDIC__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFDIC__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__7"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__7__Impl"
    // InternalFILTER.g:4299:1: rule__GSSFilterBoolVarFDIC__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSFilterBoolVarFDIC__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4303:1: ( ( ':=' ) )
            // InternalFILTER.g:4304:1: ( ':=' )
            {
            // InternalFILTER.g:4304:1: ( ':=' )
            // InternalFILTER.g:4305:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFDICAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFDICAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__7__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__8"
    // InternalFILTER.g:4314:1: rule__GSSFilterBoolVarFDIC__Group__8 : rule__GSSFilterBoolVarFDIC__Group__8__Impl rule__GSSFilterBoolVarFDIC__Group__9 ;
    public final void rule__GSSFilterBoolVarFDIC__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4318:1: ( rule__GSSFilterBoolVarFDIC__Group__8__Impl rule__GSSFilterBoolVarFDIC__Group__9 )
            // InternalFILTER.g:4319:2: rule__GSSFilterBoolVarFDIC__Group__8__Impl rule__GSSFilterBoolVarFDIC__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterBoolVarFDIC__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFDIC__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__8"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__8__Impl"
    // InternalFILTER.g:4326:1: rule__GSSFilterBoolVarFDIC__Group__8__Impl : ( ( rule__GSSFilterBoolVarFDIC__NameAssignment_8 ) ) ;
    public final void rule__GSSFilterBoolVarFDIC__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4330:1: ( ( ( rule__GSSFilterBoolVarFDIC__NameAssignment_8 ) ) )
            // InternalFILTER.g:4331:1: ( ( rule__GSSFilterBoolVarFDIC__NameAssignment_8 ) )
            {
            // InternalFILTER.g:4331:1: ( ( rule__GSSFilterBoolVarFDIC__NameAssignment_8 ) )
            // InternalFILTER.g:4332:2: ( rule__GSSFilterBoolVarFDIC__NameAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFDICAccess().getNameAssignment_8()); 
            }
            // InternalFILTER.g:4333:2: ( rule__GSSFilterBoolVarFDIC__NameAssignment_8 )
            // InternalFILTER.g:4333:3: rule__GSSFilterBoolVarFDIC__NameAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFDIC__NameAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFDICAccess().getNameAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__8__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__9"
    // InternalFILTER.g:4341:1: rule__GSSFilterBoolVarFDIC__Group__9 : rule__GSSFilterBoolVarFDIC__Group__9__Impl rule__GSSFilterBoolVarFDIC__Group__10 ;
    public final void rule__GSSFilterBoolVarFDIC__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4345:1: ( rule__GSSFilterBoolVarFDIC__Group__9__Impl rule__GSSFilterBoolVarFDIC__Group__10 )
            // InternalFILTER.g:4346:2: rule__GSSFilterBoolVarFDIC__Group__9__Impl rule__GSSFilterBoolVarFDIC__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__GSSFilterBoolVarFDIC__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFDIC__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__9"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__9__Impl"
    // InternalFILTER.g:4353:1: rule__GSSFilterBoolVarFDIC__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSFilterBoolVarFDIC__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4357:1: ( ( ';' ) )
            // InternalFILTER.g:4358:1: ( ';' )
            {
            // InternalFILTER.g:4358:1: ( ';' )
            // InternalFILTER.g:4359:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFDICAccess().getSemicolonKeyword_9()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFDICAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__9__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__10"
    // InternalFILTER.g:4368:1: rule__GSSFilterBoolVarFDIC__Group__10 : rule__GSSFilterBoolVarFDIC__Group__10__Impl rule__GSSFilterBoolVarFDIC__Group__11 ;
    public final void rule__GSSFilterBoolVarFDIC__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4372:1: ( rule__GSSFilterBoolVarFDIC__Group__10__Impl rule__GSSFilterBoolVarFDIC__Group__11 )
            // InternalFILTER.g:4373:2: rule__GSSFilterBoolVarFDIC__Group__10__Impl rule__GSSFilterBoolVarFDIC__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterBoolVarFDIC__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFDIC__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__10"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__10__Impl"
    // InternalFILTER.g:4380:1: rule__GSSFilterBoolVarFDIC__Group__10__Impl : ( 'FieldRef' ) ;
    public final void rule__GSSFilterBoolVarFDIC__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4384:1: ( ( 'FieldRef' ) )
            // InternalFILTER.g:4385:1: ( 'FieldRef' )
            {
            // InternalFILTER.g:4385:1: ( 'FieldRef' )
            // InternalFILTER.g:4386:2: 'FieldRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefKeyword_10()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__10__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__11"
    // InternalFILTER.g:4395:1: rule__GSSFilterBoolVarFDIC__Group__11 : rule__GSSFilterBoolVarFDIC__Group__11__Impl rule__GSSFilterBoolVarFDIC__Group__12 ;
    public final void rule__GSSFilterBoolVarFDIC__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4399:1: ( rule__GSSFilterBoolVarFDIC__Group__11__Impl rule__GSSFilterBoolVarFDIC__Group__12 )
            // InternalFILTER.g:4400:2: rule__GSSFilterBoolVarFDIC__Group__11__Impl rule__GSSFilterBoolVarFDIC__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSFilterBoolVarFDIC__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFDIC__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__11"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__11__Impl"
    // InternalFILTER.g:4407:1: rule__GSSFilterBoolVarFDIC__Group__11__Impl : ( ':=' ) ;
    public final void rule__GSSFilterBoolVarFDIC__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4411:1: ( ( ':=' ) )
            // InternalFILTER.g:4412:1: ( ':=' )
            {
            // InternalFILTER.g:4412:1: ( ':=' )
            // InternalFILTER.g:4413:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFDICAccess().getColonEqualsSignKeyword_11()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFDICAccess().getColonEqualsSignKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__11__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__12"
    // InternalFILTER.g:4422:1: rule__GSSFilterBoolVarFDIC__Group__12 : rule__GSSFilterBoolVarFDIC__Group__12__Impl rule__GSSFilterBoolVarFDIC__Group__13 ;
    public final void rule__GSSFilterBoolVarFDIC__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4426:1: ( rule__GSSFilterBoolVarFDIC__Group__12__Impl rule__GSSFilterBoolVarFDIC__Group__13 )
            // InternalFILTER.g:4427:2: rule__GSSFilterBoolVarFDIC__Group__12__Impl rule__GSSFilterBoolVarFDIC__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterBoolVarFDIC__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFDIC__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__12"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__12__Impl"
    // InternalFILTER.g:4434:1: rule__GSSFilterBoolVarFDIC__Group__12__Impl : ( ( rule__GSSFilterBoolVarFDIC__FieldRefAssignment_12 ) ) ;
    public final void rule__GSSFilterBoolVarFDIC__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4438:1: ( ( ( rule__GSSFilterBoolVarFDIC__FieldRefAssignment_12 ) ) )
            // InternalFILTER.g:4439:1: ( ( rule__GSSFilterBoolVarFDIC__FieldRefAssignment_12 ) )
            {
            // InternalFILTER.g:4439:1: ( ( rule__GSSFilterBoolVarFDIC__FieldRefAssignment_12 ) )
            // InternalFILTER.g:4440:2: ( rule__GSSFilterBoolVarFDIC__FieldRefAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefAssignment_12()); 
            }
            // InternalFILTER.g:4441:2: ( rule__GSSFilterBoolVarFDIC__FieldRefAssignment_12 )
            // InternalFILTER.g:4441:3: rule__GSSFilterBoolVarFDIC__FieldRefAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFDIC__FieldRefAssignment_12();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefAssignment_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__12__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__13"
    // InternalFILTER.g:4449:1: rule__GSSFilterBoolVarFDIC__Group__13 : rule__GSSFilterBoolVarFDIC__Group__13__Impl rule__GSSFilterBoolVarFDIC__Group__14 ;
    public final void rule__GSSFilterBoolVarFDIC__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4453:1: ( rule__GSSFilterBoolVarFDIC__Group__13__Impl rule__GSSFilterBoolVarFDIC__Group__14 )
            // InternalFILTER.g:4454:2: rule__GSSFilterBoolVarFDIC__Group__13__Impl rule__GSSFilterBoolVarFDIC__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__GSSFilterBoolVarFDIC__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFDIC__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__13"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__13__Impl"
    // InternalFILTER.g:4461:1: rule__GSSFilterBoolVarFDIC__Group__13__Impl : ( ';' ) ;
    public final void rule__GSSFilterBoolVarFDIC__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4465:1: ( ( ';' ) )
            // InternalFILTER.g:4466:1: ( ';' )
            {
            // InternalFILTER.g:4466:1: ( ';' )
            // InternalFILTER.g:4467:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFDICAccess().getSemicolonKeyword_13()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFDICAccess().getSemicolonKeyword_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__13__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__14"
    // InternalFILTER.g:4476:1: rule__GSSFilterBoolVarFDIC__Group__14 : rule__GSSFilterBoolVarFDIC__Group__14__Impl rule__GSSFilterBoolVarFDIC__Group__15 ;
    public final void rule__GSSFilterBoolVarFDIC__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4480:1: ( rule__GSSFilterBoolVarFDIC__Group__14__Impl rule__GSSFilterBoolVarFDIC__Group__15 )
            // InternalFILTER.g:4481:2: rule__GSSFilterBoolVarFDIC__Group__14__Impl rule__GSSFilterBoolVarFDIC__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSFilterBoolVarFDIC__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFDIC__Group__15();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__14"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__14__Impl"
    // InternalFILTER.g:4488:1: rule__GSSFilterBoolVarFDIC__Group__14__Impl : ( ( rule__GSSFilterBoolVarFDIC__OpAssignment_14 ) ) ;
    public final void rule__GSSFilterBoolVarFDIC__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4492:1: ( ( ( rule__GSSFilterBoolVarFDIC__OpAssignment_14 ) ) )
            // InternalFILTER.g:4493:1: ( ( rule__GSSFilterBoolVarFDIC__OpAssignment_14 ) )
            {
            // InternalFILTER.g:4493:1: ( ( rule__GSSFilterBoolVarFDIC__OpAssignment_14 ) )
            // InternalFILTER.g:4494:2: ( rule__GSSFilterBoolVarFDIC__OpAssignment_14 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFDICAccess().getOpAssignment_14()); 
            }
            // InternalFILTER.g:4495:2: ( rule__GSSFilterBoolVarFDIC__OpAssignment_14 )
            // InternalFILTER.g:4495:3: rule__GSSFilterBoolVarFDIC__OpAssignment_14
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFDIC__OpAssignment_14();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFDICAccess().getOpAssignment_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__14__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__15"
    // InternalFILTER.g:4503:1: rule__GSSFilterBoolVarFDIC__Group__15 : rule__GSSFilterBoolVarFDIC__Group__15__Impl rule__GSSFilterBoolVarFDIC__Group__16 ;
    public final void rule__GSSFilterBoolVarFDIC__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4507:1: ( rule__GSSFilterBoolVarFDIC__Group__15__Impl rule__GSSFilterBoolVarFDIC__Group__16 )
            // InternalFILTER.g:4508:2: rule__GSSFilterBoolVarFDIC__Group__15__Impl rule__GSSFilterBoolVarFDIC__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterBoolVarFDIC__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFDIC__Group__16();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__15"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__15__Impl"
    // InternalFILTER.g:4515:1: rule__GSSFilterBoolVarFDIC__Group__15__Impl : ( '}' ) ;
    public final void rule__GSSFilterBoolVarFDIC__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4519:1: ( ( '}' ) )
            // InternalFILTER.g:4520:1: ( '}' )
            {
            // InternalFILTER.g:4520:1: ( '}' )
            // InternalFILTER.g:4521:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFDICAccess().getRightCurlyBracketKeyword_15()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFDICAccess().getRightCurlyBracketKeyword_15()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__15__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__16"
    // InternalFILTER.g:4530:1: rule__GSSFilterBoolVarFDIC__Group__16 : rule__GSSFilterBoolVarFDIC__Group__16__Impl ;
    public final void rule__GSSFilterBoolVarFDIC__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4534:1: ( rule__GSSFilterBoolVarFDIC__Group__16__Impl )
            // InternalFILTER.g:4535:2: rule__GSSFilterBoolVarFDIC__Group__16__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarFDIC__Group__16__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__16"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__Group__16__Impl"
    // InternalFILTER.g:4541:1: rule__GSSFilterBoolVarFDIC__Group__16__Impl : ( ';' ) ;
    public final void rule__GSSFilterBoolVarFDIC__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4545:1: ( ( ';' ) )
            // InternalFILTER.g:4546:1: ( ';' )
            {
            // InternalFILTER.g:4546:1: ( ';' )
            // InternalFILTER.g:4547:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFDICAccess().getSemicolonKeyword_16()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFDICAccess().getSemicolonKeyword_16()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__Group__16__Impl"


    // $ANTLR start "rule__GSSFilterFieldOp__Group__0"
    // InternalFILTER.g:4557:1: rule__GSSFilterFieldOp__Group__0 : rule__GSSFilterFieldOp__Group__0__Impl rule__GSSFilterFieldOp__Group__1 ;
    public final void rule__GSSFilterFieldOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4561:1: ( rule__GSSFilterFieldOp__Group__0__Impl rule__GSSFilterFieldOp__Group__1 )
            // InternalFILTER.g:4562:2: rule__GSSFilterFieldOp__Group__0__Impl rule__GSSFilterFieldOp__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSFilterFieldOp__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterFieldOp__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterFieldOp__Group__0"


    // $ANTLR start "rule__GSSFilterFieldOp__Group__0__Impl"
    // InternalFILTER.g:4569:1: rule__GSSFilterFieldOp__Group__0__Impl : ( 'GSSFilterFieldOp' ) ;
    public final void rule__GSSFilterFieldOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4573:1: ( ( 'GSSFilterFieldOp' ) )
            // InternalFILTER.g:4574:1: ( 'GSSFilterFieldOp' )
            {
            // InternalFILTER.g:4574:1: ( 'GSSFilterFieldOp' )
            // InternalFILTER.g:4575:2: 'GSSFilterFieldOp'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterFieldOpAccess().getGSSFilterFieldOpKeyword_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterFieldOpAccess().getGSSFilterFieldOpKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterFieldOp__Group__0__Impl"


    // $ANTLR start "rule__GSSFilterFieldOp__Group__1"
    // InternalFILTER.g:4584:1: rule__GSSFilterFieldOp__Group__1 : rule__GSSFilterFieldOp__Group__1__Impl rule__GSSFilterFieldOp__Group__2 ;
    public final void rule__GSSFilterFieldOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4588:1: ( rule__GSSFilterFieldOp__Group__1__Impl rule__GSSFilterFieldOp__Group__2 )
            // InternalFILTER.g:4589:2: rule__GSSFilterFieldOp__Group__1__Impl rule__GSSFilterFieldOp__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__GSSFilterFieldOp__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterFieldOp__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterFieldOp__Group__1"


    // $ANTLR start "rule__GSSFilterFieldOp__Group__1__Impl"
    // InternalFILTER.g:4596:1: rule__GSSFilterFieldOp__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSFilterFieldOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4600:1: ( ( '{' ) )
            // InternalFILTER.g:4601:1: ( '{' )
            {
            // InternalFILTER.g:4601:1: ( '{' )
            // InternalFILTER.g:4602:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterFieldOpAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterFieldOpAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterFieldOp__Group__1__Impl"


    // $ANTLR start "rule__GSSFilterFieldOp__Group__2"
    // InternalFILTER.g:4611:1: rule__GSSFilterFieldOp__Group__2 : rule__GSSFilterFieldOp__Group__2__Impl rule__GSSFilterFieldOp__Group__3 ;
    public final void rule__GSSFilterFieldOp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4615:1: ( rule__GSSFilterFieldOp__Group__2__Impl rule__GSSFilterFieldOp__Group__3 )
            // InternalFILTER.g:4616:2: rule__GSSFilterFieldOp__Group__2__Impl rule__GSSFilterFieldOp__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterFieldOp__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterFieldOp__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterFieldOp__Group__2"


    // $ANTLR start "rule__GSSFilterFieldOp__Group__2__Impl"
    // InternalFILTER.g:4623:1: rule__GSSFilterFieldOp__Group__2__Impl : ( 'type' ) ;
    public final void rule__GSSFilterFieldOp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4627:1: ( ( 'type' ) )
            // InternalFILTER.g:4628:1: ( 'type' )
            {
            // InternalFILTER.g:4628:1: ( 'type' )
            // InternalFILTER.g:4629:2: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterFieldOpAccess().getTypeKeyword_2()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterFieldOpAccess().getTypeKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterFieldOp__Group__2__Impl"


    // $ANTLR start "rule__GSSFilterFieldOp__Group__3"
    // InternalFILTER.g:4638:1: rule__GSSFilterFieldOp__Group__3 : rule__GSSFilterFieldOp__Group__3__Impl rule__GSSFilterFieldOp__Group__4 ;
    public final void rule__GSSFilterFieldOp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4642:1: ( rule__GSSFilterFieldOp__Group__3__Impl rule__GSSFilterFieldOp__Group__4 )
            // InternalFILTER.g:4643:2: rule__GSSFilterFieldOp__Group__3__Impl rule__GSSFilterFieldOp__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__GSSFilterFieldOp__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterFieldOp__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterFieldOp__Group__3"


    // $ANTLR start "rule__GSSFilterFieldOp__Group__3__Impl"
    // InternalFILTER.g:4650:1: rule__GSSFilterFieldOp__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSFilterFieldOp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4654:1: ( ( ':=' ) )
            // InternalFILTER.g:4655:1: ( ':=' )
            {
            // InternalFILTER.g:4655:1: ( ':=' )
            // InternalFILTER.g:4656:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterFieldOpAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterFieldOpAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterFieldOp__Group__3__Impl"


    // $ANTLR start "rule__GSSFilterFieldOp__Group__4"
    // InternalFILTER.g:4665:1: rule__GSSFilterFieldOp__Group__4 : rule__GSSFilterFieldOp__Group__4__Impl rule__GSSFilterFieldOp__Group__5 ;
    public final void rule__GSSFilterFieldOp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4669:1: ( rule__GSSFilterFieldOp__Group__4__Impl rule__GSSFilterFieldOp__Group__5 )
            // InternalFILTER.g:4670:2: rule__GSSFilterFieldOp__Group__4__Impl rule__GSSFilterFieldOp__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterFieldOp__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterFieldOp__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterFieldOp__Group__4"


    // $ANTLR start "rule__GSSFilterFieldOp__Group__4__Impl"
    // InternalFILTER.g:4677:1: rule__GSSFilterFieldOp__Group__4__Impl : ( ( rule__GSSFilterFieldOp__TypeAssignment_4 ) ) ;
    public final void rule__GSSFilterFieldOp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4681:1: ( ( ( rule__GSSFilterFieldOp__TypeAssignment_4 ) ) )
            // InternalFILTER.g:4682:1: ( ( rule__GSSFilterFieldOp__TypeAssignment_4 ) )
            {
            // InternalFILTER.g:4682:1: ( ( rule__GSSFilterFieldOp__TypeAssignment_4 ) )
            // InternalFILTER.g:4683:2: ( rule__GSSFilterFieldOp__TypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterFieldOpAccess().getTypeAssignment_4()); 
            }
            // InternalFILTER.g:4684:2: ( rule__GSSFilterFieldOp__TypeAssignment_4 )
            // InternalFILTER.g:4684:3: rule__GSSFilterFieldOp__TypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterFieldOp__TypeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterFieldOpAccess().getTypeAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterFieldOp__Group__4__Impl"


    // $ANTLR start "rule__GSSFilterFieldOp__Group__5"
    // InternalFILTER.g:4692:1: rule__GSSFilterFieldOp__Group__5 : rule__GSSFilterFieldOp__Group__5__Impl rule__GSSFilterFieldOp__Group__6 ;
    public final void rule__GSSFilterFieldOp__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4696:1: ( rule__GSSFilterFieldOp__Group__5__Impl rule__GSSFilterFieldOp__Group__6 )
            // InternalFILTER.g:4697:2: rule__GSSFilterFieldOp__Group__5__Impl rule__GSSFilterFieldOp__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSFilterFieldOp__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterFieldOp__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterFieldOp__Group__5"


    // $ANTLR start "rule__GSSFilterFieldOp__Group__5__Impl"
    // InternalFILTER.g:4704:1: rule__GSSFilterFieldOp__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSFilterFieldOp__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4708:1: ( ( ';' ) )
            // InternalFILTER.g:4709:1: ( ';' )
            {
            // InternalFILTER.g:4709:1: ( ';' )
            // InternalFILTER.g:4710:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterFieldOpAccess().getSemicolonKeyword_5()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterFieldOpAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterFieldOp__Group__5__Impl"


    // $ANTLR start "rule__GSSFilterFieldOp__Group__6"
    // InternalFILTER.g:4719:1: rule__GSSFilterFieldOp__Group__6 : rule__GSSFilterFieldOp__Group__6__Impl rule__GSSFilterFieldOp__Group__7 ;
    public final void rule__GSSFilterFieldOp__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4723:1: ( rule__GSSFilterFieldOp__Group__6__Impl rule__GSSFilterFieldOp__Group__7 )
            // InternalFILTER.g:4724:2: rule__GSSFilterFieldOp__Group__6__Impl rule__GSSFilterFieldOp__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterFieldOp__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterFieldOp__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterFieldOp__Group__6"


    // $ANTLR start "rule__GSSFilterFieldOp__Group__6__Impl"
    // InternalFILTER.g:4731:1: rule__GSSFilterFieldOp__Group__6__Impl : ( '}' ) ;
    public final void rule__GSSFilterFieldOp__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4735:1: ( ( '}' ) )
            // InternalFILTER.g:4736:1: ( '}' )
            {
            // InternalFILTER.g:4736:1: ( '}' )
            // InternalFILTER.g:4737:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterFieldOpAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterFieldOpAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterFieldOp__Group__6__Impl"


    // $ANTLR start "rule__GSSFilterFieldOp__Group__7"
    // InternalFILTER.g:4746:1: rule__GSSFilterFieldOp__Group__7 : rule__GSSFilterFieldOp__Group__7__Impl ;
    public final void rule__GSSFilterFieldOp__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4750:1: ( rule__GSSFilterFieldOp__Group__7__Impl )
            // InternalFILTER.g:4751:2: rule__GSSFilterFieldOp__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterFieldOp__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterFieldOp__Group__7"


    // $ANTLR start "rule__GSSFilterFieldOp__Group__7__Impl"
    // InternalFILTER.g:4757:1: rule__GSSFilterFieldOp__Group__7__Impl : ( ';' ) ;
    public final void rule__GSSFilterFieldOp__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4761:1: ( ( ';' ) )
            // InternalFILTER.g:4762:1: ( ';' )
            {
            // InternalFILTER.g:4762:1: ( ';' )
            // InternalFILTER.g:4763:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterFieldOpAccess().getSemicolonKeyword_7()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterFieldOpAccess().getSemicolonKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterFieldOp__Group__7__Impl"


    // $ANTLR start "rule__GSSFilterConstant__Group__0"
    // InternalFILTER.g:4773:1: rule__GSSFilterConstant__Group__0 : rule__GSSFilterConstant__Group__0__Impl rule__GSSFilterConstant__Group__1 ;
    public final void rule__GSSFilterConstant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4777:1: ( rule__GSSFilterConstant__Group__0__Impl rule__GSSFilterConstant__Group__1 )
            // InternalFILTER.g:4778:2: rule__GSSFilterConstant__Group__0__Impl rule__GSSFilterConstant__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSFilterConstant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterConstant__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__Group__0"


    // $ANTLR start "rule__GSSFilterConstant__Group__0__Impl"
    // InternalFILTER.g:4785:1: rule__GSSFilterConstant__Group__0__Impl : ( 'GSSFilterConstant' ) ;
    public final void rule__GSSFilterConstant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4789:1: ( ( 'GSSFilterConstant' ) )
            // InternalFILTER.g:4790:1: ( 'GSSFilterConstant' )
            {
            // InternalFILTER.g:4790:1: ( 'GSSFilterConstant' )
            // InternalFILTER.g:4791:2: 'GSSFilterConstant'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterConstantAccess().getGSSFilterConstantKeyword_0()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterConstantAccess().getGSSFilterConstantKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__Group__0__Impl"


    // $ANTLR start "rule__GSSFilterConstant__Group__1"
    // InternalFILTER.g:4800:1: rule__GSSFilterConstant__Group__1 : rule__GSSFilterConstant__Group__1__Impl rule__GSSFilterConstant__Group__2 ;
    public final void rule__GSSFilterConstant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4804:1: ( rule__GSSFilterConstant__Group__1__Impl rule__GSSFilterConstant__Group__2 )
            // InternalFILTER.g:4805:2: rule__GSSFilterConstant__Group__1__Impl rule__GSSFilterConstant__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__GSSFilterConstant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterConstant__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__Group__1"


    // $ANTLR start "rule__GSSFilterConstant__Group__1__Impl"
    // InternalFILTER.g:4812:1: rule__GSSFilterConstant__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSFilterConstant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4816:1: ( ( '{' ) )
            // InternalFILTER.g:4817:1: ( '{' )
            {
            // InternalFILTER.g:4817:1: ( '{' )
            // InternalFILTER.g:4818:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterConstantAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterConstantAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__Group__1__Impl"


    // $ANTLR start "rule__GSSFilterConstant__Group__2"
    // InternalFILTER.g:4827:1: rule__GSSFilterConstant__Group__2 : rule__GSSFilterConstant__Group__2__Impl rule__GSSFilterConstant__Group__3 ;
    public final void rule__GSSFilterConstant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4831:1: ( rule__GSSFilterConstant__Group__2__Impl rule__GSSFilterConstant__Group__3 )
            // InternalFILTER.g:4832:2: rule__GSSFilterConstant__Group__2__Impl rule__GSSFilterConstant__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterConstant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterConstant__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__Group__2"


    // $ANTLR start "rule__GSSFilterConstant__Group__2__Impl"
    // InternalFILTER.g:4839:1: rule__GSSFilterConstant__Group__2__Impl : ( 'value' ) ;
    public final void rule__GSSFilterConstant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4843:1: ( ( 'value' ) )
            // InternalFILTER.g:4844:1: ( 'value' )
            {
            // InternalFILTER.g:4844:1: ( 'value' )
            // InternalFILTER.g:4845:2: 'value'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterConstantAccess().getValueKeyword_2()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterConstantAccess().getValueKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__Group__2__Impl"


    // $ANTLR start "rule__GSSFilterConstant__Group__3"
    // InternalFILTER.g:4854:1: rule__GSSFilterConstant__Group__3 : rule__GSSFilterConstant__Group__3__Impl rule__GSSFilterConstant__Group__4 ;
    public final void rule__GSSFilterConstant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4858:1: ( rule__GSSFilterConstant__Group__3__Impl rule__GSSFilterConstant__Group__4 )
            // InternalFILTER.g:4859:2: rule__GSSFilterConstant__Group__3__Impl rule__GSSFilterConstant__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__GSSFilterConstant__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterConstant__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__Group__3"


    // $ANTLR start "rule__GSSFilterConstant__Group__3__Impl"
    // InternalFILTER.g:4866:1: rule__GSSFilterConstant__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSFilterConstant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4870:1: ( ( ':=' ) )
            // InternalFILTER.g:4871:1: ( ':=' )
            {
            // InternalFILTER.g:4871:1: ( ':=' )
            // InternalFILTER.g:4872:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterConstantAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterConstantAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__Group__3__Impl"


    // $ANTLR start "rule__GSSFilterConstant__Group__4"
    // InternalFILTER.g:4881:1: rule__GSSFilterConstant__Group__4 : rule__GSSFilterConstant__Group__4__Impl rule__GSSFilterConstant__Group__5 ;
    public final void rule__GSSFilterConstant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4885:1: ( rule__GSSFilterConstant__Group__4__Impl rule__GSSFilterConstant__Group__5 )
            // InternalFILTER.g:4886:2: rule__GSSFilterConstant__Group__4__Impl rule__GSSFilterConstant__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterConstant__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterConstant__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__Group__4"


    // $ANTLR start "rule__GSSFilterConstant__Group__4__Impl"
    // InternalFILTER.g:4893:1: rule__GSSFilterConstant__Group__4__Impl : ( ( rule__GSSFilterConstant__ValueAssignment_4 ) ) ;
    public final void rule__GSSFilterConstant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4897:1: ( ( ( rule__GSSFilterConstant__ValueAssignment_4 ) ) )
            // InternalFILTER.g:4898:1: ( ( rule__GSSFilterConstant__ValueAssignment_4 ) )
            {
            // InternalFILTER.g:4898:1: ( ( rule__GSSFilterConstant__ValueAssignment_4 ) )
            // InternalFILTER.g:4899:2: ( rule__GSSFilterConstant__ValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterConstantAccess().getValueAssignment_4()); 
            }
            // InternalFILTER.g:4900:2: ( rule__GSSFilterConstant__ValueAssignment_4 )
            // InternalFILTER.g:4900:3: rule__GSSFilterConstant__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterConstant__ValueAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterConstantAccess().getValueAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__Group__4__Impl"


    // $ANTLR start "rule__GSSFilterConstant__Group__5"
    // InternalFILTER.g:4908:1: rule__GSSFilterConstant__Group__5 : rule__GSSFilterConstant__Group__5__Impl rule__GSSFilterConstant__Group__6 ;
    public final void rule__GSSFilterConstant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4912:1: ( rule__GSSFilterConstant__Group__5__Impl rule__GSSFilterConstant__Group__6 )
            // InternalFILTER.g:4913:2: rule__GSSFilterConstant__Group__5__Impl rule__GSSFilterConstant__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__GSSFilterConstant__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterConstant__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__Group__5"


    // $ANTLR start "rule__GSSFilterConstant__Group__5__Impl"
    // InternalFILTER.g:4920:1: rule__GSSFilterConstant__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSFilterConstant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4924:1: ( ( ';' ) )
            // InternalFILTER.g:4925:1: ( ';' )
            {
            // InternalFILTER.g:4925:1: ( ';' )
            // InternalFILTER.g:4926:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterConstantAccess().getSemicolonKeyword_5()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterConstantAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__Group__5__Impl"


    // $ANTLR start "rule__GSSFilterConstant__Group__6"
    // InternalFILTER.g:4935:1: rule__GSSFilterConstant__Group__6 : rule__GSSFilterConstant__Group__6__Impl rule__GSSFilterConstant__Group__7 ;
    public final void rule__GSSFilterConstant__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4939:1: ( rule__GSSFilterConstant__Group__6__Impl rule__GSSFilterConstant__Group__7 )
            // InternalFILTER.g:4940:2: rule__GSSFilterConstant__Group__6__Impl rule__GSSFilterConstant__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__GSSFilterConstant__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterConstant__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__Group__6"


    // $ANTLR start "rule__GSSFilterConstant__Group__6__Impl"
    // InternalFILTER.g:4947:1: rule__GSSFilterConstant__Group__6__Impl : ( ( rule__GSSFilterConstant__Group_6__0 )? ) ;
    public final void rule__GSSFilterConstant__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4951:1: ( ( ( rule__GSSFilterConstant__Group_6__0 )? ) )
            // InternalFILTER.g:4952:1: ( ( rule__GSSFilterConstant__Group_6__0 )? )
            {
            // InternalFILTER.g:4952:1: ( ( rule__GSSFilterConstant__Group_6__0 )? )
            // InternalFILTER.g:4953:2: ( rule__GSSFilterConstant__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterConstantAccess().getGroup_6()); 
            }
            // InternalFILTER.g:4954:2: ( rule__GSSFilterConstant__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==51) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFILTER.g:4954:3: rule__GSSFilterConstant__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSFilterConstant__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterConstantAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__Group__6__Impl"


    // $ANTLR start "rule__GSSFilterConstant__Group__7"
    // InternalFILTER.g:4962:1: rule__GSSFilterConstant__Group__7 : rule__GSSFilterConstant__Group__7__Impl rule__GSSFilterConstant__Group__8 ;
    public final void rule__GSSFilterConstant__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4966:1: ( rule__GSSFilterConstant__Group__7__Impl rule__GSSFilterConstant__Group__8 )
            // InternalFILTER.g:4967:2: rule__GSSFilterConstant__Group__7__Impl rule__GSSFilterConstant__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterConstant__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterConstant__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__Group__7"


    // $ANTLR start "rule__GSSFilterConstant__Group__7__Impl"
    // InternalFILTER.g:4974:1: rule__GSSFilterConstant__Group__7__Impl : ( '}' ) ;
    public final void rule__GSSFilterConstant__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4978:1: ( ( '}' ) )
            // InternalFILTER.g:4979:1: ( '}' )
            {
            // InternalFILTER.g:4979:1: ( '}' )
            // InternalFILTER.g:4980:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterConstantAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterConstantAccess().getRightCurlyBracketKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__Group__7__Impl"


    // $ANTLR start "rule__GSSFilterConstant__Group__8"
    // InternalFILTER.g:4989:1: rule__GSSFilterConstant__Group__8 : rule__GSSFilterConstant__Group__8__Impl ;
    public final void rule__GSSFilterConstant__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4993:1: ( rule__GSSFilterConstant__Group__8__Impl )
            // InternalFILTER.g:4994:2: rule__GSSFilterConstant__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterConstant__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__Group__8"


    // $ANTLR start "rule__GSSFilterConstant__Group__8__Impl"
    // InternalFILTER.g:5000:1: rule__GSSFilterConstant__Group__8__Impl : ( ';' ) ;
    public final void rule__GSSFilterConstant__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5004:1: ( ( ';' ) )
            // InternalFILTER.g:5005:1: ( ';' )
            {
            // InternalFILTER.g:5005:1: ( ';' )
            // InternalFILTER.g:5006:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterConstantAccess().getSemicolonKeyword_8()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterConstantAccess().getSemicolonKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__Group__8__Impl"


    // $ANTLR start "rule__GSSFilterConstant__Group_6__0"
    // InternalFILTER.g:5016:1: rule__GSSFilterConstant__Group_6__0 : rule__GSSFilterConstant__Group_6__0__Impl rule__GSSFilterConstant__Group_6__1 ;
    public final void rule__GSSFilterConstant__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5020:1: ( rule__GSSFilterConstant__Group_6__0__Impl rule__GSSFilterConstant__Group_6__1 )
            // InternalFILTER.g:5021:2: rule__GSSFilterConstant__Group_6__0__Impl rule__GSSFilterConstant__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterConstant__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterConstant__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__Group_6__0"


    // $ANTLR start "rule__GSSFilterConstant__Group_6__0__Impl"
    // InternalFILTER.g:5028:1: rule__GSSFilterConstant__Group_6__0__Impl : ( 'mask' ) ;
    public final void rule__GSSFilterConstant__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5032:1: ( ( 'mask' ) )
            // InternalFILTER.g:5033:1: ( 'mask' )
            {
            // InternalFILTER.g:5033:1: ( 'mask' )
            // InternalFILTER.g:5034:2: 'mask'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterConstantAccess().getMaskKeyword_6_0()); 
            }
            match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterConstantAccess().getMaskKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__Group_6__0__Impl"


    // $ANTLR start "rule__GSSFilterConstant__Group_6__1"
    // InternalFILTER.g:5043:1: rule__GSSFilterConstant__Group_6__1 : rule__GSSFilterConstant__Group_6__1__Impl rule__GSSFilterConstant__Group_6__2 ;
    public final void rule__GSSFilterConstant__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5047:1: ( rule__GSSFilterConstant__Group_6__1__Impl rule__GSSFilterConstant__Group_6__2 )
            // InternalFILTER.g:5048:2: rule__GSSFilterConstant__Group_6__1__Impl rule__GSSFilterConstant__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__GSSFilterConstant__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterConstant__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__Group_6__1"


    // $ANTLR start "rule__GSSFilterConstant__Group_6__1__Impl"
    // InternalFILTER.g:5055:1: rule__GSSFilterConstant__Group_6__1__Impl : ( ':=' ) ;
    public final void rule__GSSFilterConstant__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5059:1: ( ( ':=' ) )
            // InternalFILTER.g:5060:1: ( ':=' )
            {
            // InternalFILTER.g:5060:1: ( ':=' )
            // InternalFILTER.g:5061:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterConstantAccess().getColonEqualsSignKeyword_6_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterConstantAccess().getColonEqualsSignKeyword_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__Group_6__1__Impl"


    // $ANTLR start "rule__GSSFilterConstant__Group_6__2"
    // InternalFILTER.g:5070:1: rule__GSSFilterConstant__Group_6__2 : rule__GSSFilterConstant__Group_6__2__Impl rule__GSSFilterConstant__Group_6__3 ;
    public final void rule__GSSFilterConstant__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5074:1: ( rule__GSSFilterConstant__Group_6__2__Impl rule__GSSFilterConstant__Group_6__3 )
            // InternalFILTER.g:5075:2: rule__GSSFilterConstant__Group_6__2__Impl rule__GSSFilterConstant__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterConstant__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterConstant__Group_6__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__Group_6__2"


    // $ANTLR start "rule__GSSFilterConstant__Group_6__2__Impl"
    // InternalFILTER.g:5082:1: rule__GSSFilterConstant__Group_6__2__Impl : ( ( rule__GSSFilterConstant__MaskAssignment_6_2 ) ) ;
    public final void rule__GSSFilterConstant__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5086:1: ( ( ( rule__GSSFilterConstant__MaskAssignment_6_2 ) ) )
            // InternalFILTER.g:5087:1: ( ( rule__GSSFilterConstant__MaskAssignment_6_2 ) )
            {
            // InternalFILTER.g:5087:1: ( ( rule__GSSFilterConstant__MaskAssignment_6_2 ) )
            // InternalFILTER.g:5088:2: ( rule__GSSFilterConstant__MaskAssignment_6_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterConstantAccess().getMaskAssignment_6_2()); 
            }
            // InternalFILTER.g:5089:2: ( rule__GSSFilterConstant__MaskAssignment_6_2 )
            // InternalFILTER.g:5089:3: rule__GSSFilterConstant__MaskAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterConstant__MaskAssignment_6_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterConstantAccess().getMaskAssignment_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__Group_6__2__Impl"


    // $ANTLR start "rule__GSSFilterConstant__Group_6__3"
    // InternalFILTER.g:5097:1: rule__GSSFilterConstant__Group_6__3 : rule__GSSFilterConstant__Group_6__3__Impl ;
    public final void rule__GSSFilterConstant__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5101:1: ( rule__GSSFilterConstant__Group_6__3__Impl )
            // InternalFILTER.g:5102:2: rule__GSSFilterConstant__Group_6__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterConstant__Group_6__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__Group_6__3"


    // $ANTLR start "rule__GSSFilterConstant__Group_6__3__Impl"
    // InternalFILTER.g:5108:1: rule__GSSFilterConstant__Group_6__3__Impl : ( ';' ) ;
    public final void rule__GSSFilterConstant__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5112:1: ( ( ';' ) )
            // InternalFILTER.g:5113:1: ( ';' )
            {
            // InternalFILTER.g:5113:1: ( ';' )
            // InternalFILTER.g:5114:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterConstantAccess().getSemicolonKeyword_6_3()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterConstantAccess().getSemicolonKeyword_6_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__Group_6__3__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group__0"
    // InternalFILTER.g:5124:1: rule__GSSFilterSelect__Group__0 : rule__GSSFilterSelect__Group__0__Impl rule__GSSFilterSelect__Group__1 ;
    public final void rule__GSSFilterSelect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5128:1: ( rule__GSSFilterSelect__Group__0__Impl rule__GSSFilterSelect__Group__1 )
            // InternalFILTER.g:5129:2: rule__GSSFilterSelect__Group__0__Impl rule__GSSFilterSelect__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSFilterSelect__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__0"


    // $ANTLR start "rule__GSSFilterSelect__Group__0__Impl"
    // InternalFILTER.g:5136:1: rule__GSSFilterSelect__Group__0__Impl : ( 'GSSFilterSelect' ) ;
    public final void rule__GSSFilterSelect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5140:1: ( ( 'GSSFilterSelect' ) )
            // InternalFILTER.g:5141:1: ( 'GSSFilterSelect' )
            {
            // InternalFILTER.g:5141:1: ( 'GSSFilterSelect' )
            // InternalFILTER.g:5142:2: 'GSSFilterSelect'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getGSSFilterSelectKeyword_0()); 
            }
            match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getGSSFilterSelectKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__0__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group__1"
    // InternalFILTER.g:5151:1: rule__GSSFilterSelect__Group__1 : rule__GSSFilterSelect__Group__1__Impl rule__GSSFilterSelect__Group__2 ;
    public final void rule__GSSFilterSelect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5155:1: ( rule__GSSFilterSelect__Group__1__Impl rule__GSSFilterSelect__Group__2 )
            // InternalFILTER.g:5156:2: rule__GSSFilterSelect__Group__1__Impl rule__GSSFilterSelect__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_37);
            rule__GSSFilterSelect__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__1"


    // $ANTLR start "rule__GSSFilterSelect__Group__1__Impl"
    // InternalFILTER.g:5163:1: rule__GSSFilterSelect__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSFilterSelect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5167:1: ( ( '{' ) )
            // InternalFILTER.g:5168:1: ( '{' )
            {
            // InternalFILTER.g:5168:1: ( '{' )
            // InternalFILTER.g:5169:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__1__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group__2"
    // InternalFILTER.g:5178:1: rule__GSSFilterSelect__Group__2 : rule__GSSFilterSelect__Group__2__Impl rule__GSSFilterSelect__Group__3 ;
    public final void rule__GSSFilterSelect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5182:1: ( rule__GSSFilterSelect__Group__2__Impl rule__GSSFilterSelect__Group__3 )
            // InternalFILTER.g:5183:2: rule__GSSFilterSelect__Group__2__Impl rule__GSSFilterSelect__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterSelect__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__2"


    // $ANTLR start "rule__GSSFilterSelect__Group__2__Impl"
    // InternalFILTER.g:5190:1: rule__GSSFilterSelect__Group__2__Impl : ( 'fromFile' ) ;
    public final void rule__GSSFilterSelect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5194:1: ( ( 'fromFile' ) )
            // InternalFILTER.g:5195:1: ( 'fromFile' )
            {
            // InternalFILTER.g:5195:1: ( 'fromFile' )
            // InternalFILTER.g:5196:2: 'fromFile'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getFromFileKeyword_2()); 
            }
            match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getFromFileKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__2__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group__3"
    // InternalFILTER.g:5205:1: rule__GSSFilterSelect__Group__3 : rule__GSSFilterSelect__Group__3__Impl rule__GSSFilterSelect__Group__4 ;
    public final void rule__GSSFilterSelect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5209:1: ( rule__GSSFilterSelect__Group__3__Impl rule__GSSFilterSelect__Group__4 )
            // InternalFILTER.g:5210:2: rule__GSSFilterSelect__Group__3__Impl rule__GSSFilterSelect__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSFilterSelect__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__3"


    // $ANTLR start "rule__GSSFilterSelect__Group__3__Impl"
    // InternalFILTER.g:5217:1: rule__GSSFilterSelect__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSFilterSelect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5221:1: ( ( ':=' ) )
            // InternalFILTER.g:5222:1: ( ':=' )
            {
            // InternalFILTER.g:5222:1: ( ':=' )
            // InternalFILTER.g:5223:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__3__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group__4"
    // InternalFILTER.g:5232:1: rule__GSSFilterSelect__Group__4 : rule__GSSFilterSelect__Group__4__Impl rule__GSSFilterSelect__Group__5 ;
    public final void rule__GSSFilterSelect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5236:1: ( rule__GSSFilterSelect__Group__4__Impl rule__GSSFilterSelect__Group__5 )
            // InternalFILTER.g:5237:2: rule__GSSFilterSelect__Group__4__Impl rule__GSSFilterSelect__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterSelect__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__4"


    // $ANTLR start "rule__GSSFilterSelect__Group__4__Impl"
    // InternalFILTER.g:5244:1: rule__GSSFilterSelect__Group__4__Impl : ( ( rule__GSSFilterSelect__FromFileAssignment_4 ) ) ;
    public final void rule__GSSFilterSelect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5248:1: ( ( ( rule__GSSFilterSelect__FromFileAssignment_4 ) ) )
            // InternalFILTER.g:5249:1: ( ( rule__GSSFilterSelect__FromFileAssignment_4 ) )
            {
            // InternalFILTER.g:5249:1: ( ( rule__GSSFilterSelect__FromFileAssignment_4 ) )
            // InternalFILTER.g:5250:2: ( rule__GSSFilterSelect__FromFileAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getFromFileAssignment_4()); 
            }
            // InternalFILTER.g:5251:2: ( rule__GSSFilterSelect__FromFileAssignment_4 )
            // InternalFILTER.g:5251:3: rule__GSSFilterSelect__FromFileAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__FromFileAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getFromFileAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__4__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group__5"
    // InternalFILTER.g:5259:1: rule__GSSFilterSelect__Group__5 : rule__GSSFilterSelect__Group__5__Impl rule__GSSFilterSelect__Group__6 ;
    public final void rule__GSSFilterSelect__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5263:1: ( rule__GSSFilterSelect__Group__5__Impl rule__GSSFilterSelect__Group__6 )
            // InternalFILTER.g:5264:2: rule__GSSFilterSelect__Group__5__Impl rule__GSSFilterSelect__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__GSSFilterSelect__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__5"


    // $ANTLR start "rule__GSSFilterSelect__Group__5__Impl"
    // InternalFILTER.g:5271:1: rule__GSSFilterSelect__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSFilterSelect__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5275:1: ( ( ';' ) )
            // InternalFILTER.g:5276:1: ( ';' )
            {
            // InternalFILTER.g:5276:1: ( ';' )
            // InternalFILTER.g:5277:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_5()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__5__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group__6"
    // InternalFILTER.g:5286:1: rule__GSSFilterSelect__Group__6 : rule__GSSFilterSelect__Group__6__Impl rule__GSSFilterSelect__Group__7 ;
    public final void rule__GSSFilterSelect__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5290:1: ( rule__GSSFilterSelect__Group__6__Impl rule__GSSFilterSelect__Group__7 )
            // InternalFILTER.g:5291:2: rule__GSSFilterSelect__Group__6__Impl rule__GSSFilterSelect__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterSelect__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__6"


    // $ANTLR start "rule__GSSFilterSelect__Group__6__Impl"
    // InternalFILTER.g:5298:1: rule__GSSFilterSelect__Group__6__Impl : ( 'type' ) ;
    public final void rule__GSSFilterSelect__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5302:1: ( ( 'type' ) )
            // InternalFILTER.g:5303:1: ( 'type' )
            {
            // InternalFILTER.g:5303:1: ( 'type' )
            // InternalFILTER.g:5304:2: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getTypeKeyword_6()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getTypeKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__6__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group__7"
    // InternalFILTER.g:5313:1: rule__GSSFilterSelect__Group__7 : rule__GSSFilterSelect__Group__7__Impl rule__GSSFilterSelect__Group__8 ;
    public final void rule__GSSFilterSelect__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5317:1: ( rule__GSSFilterSelect__Group__7__Impl rule__GSSFilterSelect__Group__8 )
            // InternalFILTER.g:5318:2: rule__GSSFilterSelect__Group__7__Impl rule__GSSFilterSelect__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_38);
            rule__GSSFilterSelect__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__7"


    // $ANTLR start "rule__GSSFilterSelect__Group__7__Impl"
    // InternalFILTER.g:5325:1: rule__GSSFilterSelect__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSFilterSelect__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5329:1: ( ( ':=' ) )
            // InternalFILTER.g:5330:1: ( ':=' )
            {
            // InternalFILTER.g:5330:1: ( ':=' )
            // InternalFILTER.g:5331:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__7__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group__8"
    // InternalFILTER.g:5340:1: rule__GSSFilterSelect__Group__8 : rule__GSSFilterSelect__Group__8__Impl rule__GSSFilterSelect__Group__9 ;
    public final void rule__GSSFilterSelect__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5344:1: ( rule__GSSFilterSelect__Group__8__Impl rule__GSSFilterSelect__Group__9 )
            // InternalFILTER.g:5345:2: rule__GSSFilterSelect__Group__8__Impl rule__GSSFilterSelect__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterSelect__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__8"


    // $ANTLR start "rule__GSSFilterSelect__Group__8__Impl"
    // InternalFILTER.g:5352:1: rule__GSSFilterSelect__Group__8__Impl : ( ( rule__GSSFilterSelect__TypeAssignment_8 ) ) ;
    public final void rule__GSSFilterSelect__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5356:1: ( ( ( rule__GSSFilterSelect__TypeAssignment_8 ) ) )
            // InternalFILTER.g:5357:1: ( ( rule__GSSFilterSelect__TypeAssignment_8 ) )
            {
            // InternalFILTER.g:5357:1: ( ( rule__GSSFilterSelect__TypeAssignment_8 ) )
            // InternalFILTER.g:5358:2: ( rule__GSSFilterSelect__TypeAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getTypeAssignment_8()); 
            }
            // InternalFILTER.g:5359:2: ( rule__GSSFilterSelect__TypeAssignment_8 )
            // InternalFILTER.g:5359:3: rule__GSSFilterSelect__TypeAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__TypeAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getTypeAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__8__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group__9"
    // InternalFILTER.g:5367:1: rule__GSSFilterSelect__Group__9 : rule__GSSFilterSelect__Group__9__Impl rule__GSSFilterSelect__Group__10 ;
    public final void rule__GSSFilterSelect__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5371:1: ( rule__GSSFilterSelect__Group__9__Impl rule__GSSFilterSelect__Group__10 )
            // InternalFILTER.g:5372:2: rule__GSSFilterSelect__Group__9__Impl rule__GSSFilterSelect__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__GSSFilterSelect__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__9"


    // $ANTLR start "rule__GSSFilterSelect__Group__9__Impl"
    // InternalFILTER.g:5379:1: rule__GSSFilterSelect__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSFilterSelect__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5383:1: ( ( ';' ) )
            // InternalFILTER.g:5384:1: ( ';' )
            {
            // InternalFILTER.g:5384:1: ( ';' )
            // InternalFILTER.g:5385:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_9()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__9__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group__10"
    // InternalFILTER.g:5394:1: rule__GSSFilterSelect__Group__10 : rule__GSSFilterSelect__Group__10__Impl rule__GSSFilterSelect__Group__11 ;
    public final void rule__GSSFilterSelect__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5398:1: ( rule__GSSFilterSelect__Group__10__Impl rule__GSSFilterSelect__Group__11 )
            // InternalFILTER.g:5399:2: rule__GSSFilterSelect__Group__10__Impl rule__GSSFilterSelect__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__GSSFilterSelect__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__10"


    // $ANTLR start "rule__GSSFilterSelect__Group__10__Impl"
    // InternalFILTER.g:5406:1: rule__GSSFilterSelect__Group__10__Impl : ( ( rule__GSSFilterSelect__Group_10__0 )? ) ;
    public final void rule__GSSFilterSelect__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5410:1: ( ( ( rule__GSSFilterSelect__Group_10__0 )? ) )
            // InternalFILTER.g:5411:1: ( ( rule__GSSFilterSelect__Group_10__0 )? )
            {
            // InternalFILTER.g:5411:1: ( ( rule__GSSFilterSelect__Group_10__0 )? )
            // InternalFILTER.g:5412:2: ( rule__GSSFilterSelect__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getGroup_10()); 
            }
            // InternalFILTER.g:5413:2: ( rule__GSSFilterSelect__Group_10__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==54) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalFILTER.g:5413:3: rule__GSSFilterSelect__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSFilterSelect__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getGroup_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__10__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group__11"
    // InternalFILTER.g:5421:1: rule__GSSFilterSelect__Group__11 : rule__GSSFilterSelect__Group__11__Impl rule__GSSFilterSelect__Group__12 ;
    public final void rule__GSSFilterSelect__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5425:1: ( rule__GSSFilterSelect__Group__11__Impl rule__GSSFilterSelect__Group__12 )
            // InternalFILTER.g:5426:2: rule__GSSFilterSelect__Group__11__Impl rule__GSSFilterSelect__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__GSSFilterSelect__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__11"


    // $ANTLR start "rule__GSSFilterSelect__Group__11__Impl"
    // InternalFILTER.g:5433:1: rule__GSSFilterSelect__Group__11__Impl : ( ( rule__GSSFilterSelect__Group_11__0 )? ) ;
    public final void rule__GSSFilterSelect__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5437:1: ( ( ( rule__GSSFilterSelect__Group_11__0 )? ) )
            // InternalFILTER.g:5438:1: ( ( rule__GSSFilterSelect__Group_11__0 )? )
            {
            // InternalFILTER.g:5438:1: ( ( rule__GSSFilterSelect__Group_11__0 )? )
            // InternalFILTER.g:5439:2: ( rule__GSSFilterSelect__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getGroup_11()); 
            }
            // InternalFILTER.g:5440:2: ( rule__GSSFilterSelect__Group_11__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalFILTER.g:5440:3: rule__GSSFilterSelect__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSFilterSelect__Group_11__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getGroup_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__11__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group__12"
    // InternalFILTER.g:5448:1: rule__GSSFilterSelect__Group__12 : rule__GSSFilterSelect__Group__12__Impl rule__GSSFilterSelect__Group__13 ;
    public final void rule__GSSFilterSelect__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5452:1: ( rule__GSSFilterSelect__Group__12__Impl rule__GSSFilterSelect__Group__13 )
            // InternalFILTER.g:5453:2: rule__GSSFilterSelect__Group__12__Impl rule__GSSFilterSelect__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__GSSFilterSelect__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__12"


    // $ANTLR start "rule__GSSFilterSelect__Group__12__Impl"
    // InternalFILTER.g:5460:1: rule__GSSFilterSelect__Group__12__Impl : ( ( rule__GSSFilterSelect__Group_12__0 )? ) ;
    public final void rule__GSSFilterSelect__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5464:1: ( ( ( rule__GSSFilterSelect__Group_12__0 )? ) )
            // InternalFILTER.g:5465:1: ( ( rule__GSSFilterSelect__Group_12__0 )? )
            {
            // InternalFILTER.g:5465:1: ( ( rule__GSSFilterSelect__Group_12__0 )? )
            // InternalFILTER.g:5466:2: ( rule__GSSFilterSelect__Group_12__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getGroup_12()); 
            }
            // InternalFILTER.g:5467:2: ( rule__GSSFilterSelect__Group_12__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==51) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalFILTER.g:5467:3: rule__GSSFilterSelect__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSFilterSelect__Group_12__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getGroup_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__12__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group__13"
    // InternalFILTER.g:5475:1: rule__GSSFilterSelect__Group__13 : rule__GSSFilterSelect__Group__13__Impl rule__GSSFilterSelect__Group__14 ;
    public final void rule__GSSFilterSelect__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5479:1: ( rule__GSSFilterSelect__Group__13__Impl rule__GSSFilterSelect__Group__14 )
            // InternalFILTER.g:5480:2: rule__GSSFilterSelect__Group__13__Impl rule__GSSFilterSelect__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterSelect__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__13"


    // $ANTLR start "rule__GSSFilterSelect__Group__13__Impl"
    // InternalFILTER.g:5487:1: rule__GSSFilterSelect__Group__13__Impl : ( '}' ) ;
    public final void rule__GSSFilterSelect__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5491:1: ( ( '}' ) )
            // InternalFILTER.g:5492:1: ( '}' )
            {
            // InternalFILTER.g:5492:1: ( '}' )
            // InternalFILTER.g:5493:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getRightCurlyBracketKeyword_13()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getRightCurlyBracketKeyword_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__13__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group__14"
    // InternalFILTER.g:5502:1: rule__GSSFilterSelect__Group__14 : rule__GSSFilterSelect__Group__14__Impl ;
    public final void rule__GSSFilterSelect__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5506:1: ( rule__GSSFilterSelect__Group__14__Impl )
            // InternalFILTER.g:5507:2: rule__GSSFilterSelect__Group__14__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__14"


    // $ANTLR start "rule__GSSFilterSelect__Group__14__Impl"
    // InternalFILTER.g:5513:1: rule__GSSFilterSelect__Group__14__Impl : ( ';' ) ;
    public final void rule__GSSFilterSelect__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5517:1: ( ( ';' ) )
            // InternalFILTER.g:5518:1: ( ';' )
            {
            // InternalFILTER.g:5518:1: ( ';' )
            // InternalFILTER.g:5519:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_14()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group__14__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group_10__0"
    // InternalFILTER.g:5529:1: rule__GSSFilterSelect__Group_10__0 : rule__GSSFilterSelect__Group_10__0__Impl rule__GSSFilterSelect__Group_10__1 ;
    public final void rule__GSSFilterSelect__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5533:1: ( rule__GSSFilterSelect__Group_10__0__Impl rule__GSSFilterSelect__Group_10__1 )
            // InternalFILTER.g:5534:2: rule__GSSFilterSelect__Group_10__0__Impl rule__GSSFilterSelect__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterSelect__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group_10__0"


    // $ANTLR start "rule__GSSFilterSelect__Group_10__0__Impl"
    // InternalFILTER.g:5541:1: rule__GSSFilterSelect__Group_10__0__Impl : ( 'offset' ) ;
    public final void rule__GSSFilterSelect__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5545:1: ( ( 'offset' ) )
            // InternalFILTER.g:5546:1: ( 'offset' )
            {
            // InternalFILTER.g:5546:1: ( 'offset' )
            // InternalFILTER.g:5547:2: 'offset'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getOffsetKeyword_10_0()); 
            }
            match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getOffsetKeyword_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group_10__0__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group_10__1"
    // InternalFILTER.g:5556:1: rule__GSSFilterSelect__Group_10__1 : rule__GSSFilterSelect__Group_10__1__Impl rule__GSSFilterSelect__Group_10__2 ;
    public final void rule__GSSFilterSelect__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5560:1: ( rule__GSSFilterSelect__Group_10__1__Impl rule__GSSFilterSelect__Group_10__2 )
            // InternalFILTER.g:5561:2: rule__GSSFilterSelect__Group_10__1__Impl rule__GSSFilterSelect__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__GSSFilterSelect__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group_10__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group_10__1"


    // $ANTLR start "rule__GSSFilterSelect__Group_10__1__Impl"
    // InternalFILTER.g:5568:1: rule__GSSFilterSelect__Group_10__1__Impl : ( ':=' ) ;
    public final void rule__GSSFilterSelect__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5572:1: ( ( ':=' ) )
            // InternalFILTER.g:5573:1: ( ':=' )
            {
            // InternalFILTER.g:5573:1: ( ':=' )
            // InternalFILTER.g:5574:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_10_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_10_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group_10__1__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group_10__2"
    // InternalFILTER.g:5583:1: rule__GSSFilterSelect__Group_10__2 : rule__GSSFilterSelect__Group_10__2__Impl rule__GSSFilterSelect__Group_10__3 ;
    public final void rule__GSSFilterSelect__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5587:1: ( rule__GSSFilterSelect__Group_10__2__Impl rule__GSSFilterSelect__Group_10__3 )
            // InternalFILTER.g:5588:2: rule__GSSFilterSelect__Group_10__2__Impl rule__GSSFilterSelect__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterSelect__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group_10__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group_10__2"


    // $ANTLR start "rule__GSSFilterSelect__Group_10__2__Impl"
    // InternalFILTER.g:5595:1: rule__GSSFilterSelect__Group_10__2__Impl : ( ( rule__GSSFilterSelect__OffsetAssignment_10_2 ) ) ;
    public final void rule__GSSFilterSelect__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5599:1: ( ( ( rule__GSSFilterSelect__OffsetAssignment_10_2 ) ) )
            // InternalFILTER.g:5600:1: ( ( rule__GSSFilterSelect__OffsetAssignment_10_2 ) )
            {
            // InternalFILTER.g:5600:1: ( ( rule__GSSFilterSelect__OffsetAssignment_10_2 ) )
            // InternalFILTER.g:5601:2: ( rule__GSSFilterSelect__OffsetAssignment_10_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getOffsetAssignment_10_2()); 
            }
            // InternalFILTER.g:5602:2: ( rule__GSSFilterSelect__OffsetAssignment_10_2 )
            // InternalFILTER.g:5602:3: rule__GSSFilterSelect__OffsetAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__OffsetAssignment_10_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getOffsetAssignment_10_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group_10__2__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group_10__3"
    // InternalFILTER.g:5610:1: rule__GSSFilterSelect__Group_10__3 : rule__GSSFilterSelect__Group_10__3__Impl ;
    public final void rule__GSSFilterSelect__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5614:1: ( rule__GSSFilterSelect__Group_10__3__Impl )
            // InternalFILTER.g:5615:2: rule__GSSFilterSelect__Group_10__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group_10__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group_10__3"


    // $ANTLR start "rule__GSSFilterSelect__Group_10__3__Impl"
    // InternalFILTER.g:5621:1: rule__GSSFilterSelect__Group_10__3__Impl : ( ';' ) ;
    public final void rule__GSSFilterSelect__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5625:1: ( ( ';' ) )
            // InternalFILTER.g:5626:1: ( ';' )
            {
            // InternalFILTER.g:5626:1: ( ';' )
            // InternalFILTER.g:5627:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_10_3()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_10_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group_10__3__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group_11__0"
    // InternalFILTER.g:5637:1: rule__GSSFilterSelect__Group_11__0 : rule__GSSFilterSelect__Group_11__0__Impl rule__GSSFilterSelect__Group_11__1 ;
    public final void rule__GSSFilterSelect__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5641:1: ( rule__GSSFilterSelect__Group_11__0__Impl rule__GSSFilterSelect__Group_11__1 )
            // InternalFILTER.g:5642:2: rule__GSSFilterSelect__Group_11__0__Impl rule__GSSFilterSelect__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterSelect__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group_11__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group_11__0"


    // $ANTLR start "rule__GSSFilterSelect__Group_11__0__Impl"
    // InternalFILTER.g:5649:1: rule__GSSFilterSelect__Group_11__0__Impl : ( 'size' ) ;
    public final void rule__GSSFilterSelect__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5653:1: ( ( 'size' ) )
            // InternalFILTER.g:5654:1: ( 'size' )
            {
            // InternalFILTER.g:5654:1: ( 'size' )
            // InternalFILTER.g:5655:2: 'size'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getSizeKeyword_11_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getSizeKeyword_11_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group_11__0__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group_11__1"
    // InternalFILTER.g:5664:1: rule__GSSFilterSelect__Group_11__1 : rule__GSSFilterSelect__Group_11__1__Impl rule__GSSFilterSelect__Group_11__2 ;
    public final void rule__GSSFilterSelect__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5668:1: ( rule__GSSFilterSelect__Group_11__1__Impl rule__GSSFilterSelect__Group_11__2 )
            // InternalFILTER.g:5669:2: rule__GSSFilterSelect__Group_11__1__Impl rule__GSSFilterSelect__Group_11__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__GSSFilterSelect__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group_11__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group_11__1"


    // $ANTLR start "rule__GSSFilterSelect__Group_11__1__Impl"
    // InternalFILTER.g:5676:1: rule__GSSFilterSelect__Group_11__1__Impl : ( ':=' ) ;
    public final void rule__GSSFilterSelect__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5680:1: ( ( ':=' ) )
            // InternalFILTER.g:5681:1: ( ':=' )
            {
            // InternalFILTER.g:5681:1: ( ':=' )
            // InternalFILTER.g:5682:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_11_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_11_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group_11__1__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group_11__2"
    // InternalFILTER.g:5691:1: rule__GSSFilterSelect__Group_11__2 : rule__GSSFilterSelect__Group_11__2__Impl rule__GSSFilterSelect__Group_11__3 ;
    public final void rule__GSSFilterSelect__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5695:1: ( rule__GSSFilterSelect__Group_11__2__Impl rule__GSSFilterSelect__Group_11__3 )
            // InternalFILTER.g:5696:2: rule__GSSFilterSelect__Group_11__2__Impl rule__GSSFilterSelect__Group_11__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterSelect__Group_11__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group_11__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group_11__2"


    // $ANTLR start "rule__GSSFilterSelect__Group_11__2__Impl"
    // InternalFILTER.g:5703:1: rule__GSSFilterSelect__Group_11__2__Impl : ( ( rule__GSSFilterSelect__SizeAssignment_11_2 ) ) ;
    public final void rule__GSSFilterSelect__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5707:1: ( ( ( rule__GSSFilterSelect__SizeAssignment_11_2 ) ) )
            // InternalFILTER.g:5708:1: ( ( rule__GSSFilterSelect__SizeAssignment_11_2 ) )
            {
            // InternalFILTER.g:5708:1: ( ( rule__GSSFilterSelect__SizeAssignment_11_2 ) )
            // InternalFILTER.g:5709:2: ( rule__GSSFilterSelect__SizeAssignment_11_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getSizeAssignment_11_2()); 
            }
            // InternalFILTER.g:5710:2: ( rule__GSSFilterSelect__SizeAssignment_11_2 )
            // InternalFILTER.g:5710:3: rule__GSSFilterSelect__SizeAssignment_11_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__SizeAssignment_11_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getSizeAssignment_11_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group_11__2__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group_11__3"
    // InternalFILTER.g:5718:1: rule__GSSFilterSelect__Group_11__3 : rule__GSSFilterSelect__Group_11__3__Impl ;
    public final void rule__GSSFilterSelect__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5722:1: ( rule__GSSFilterSelect__Group_11__3__Impl )
            // InternalFILTER.g:5723:2: rule__GSSFilterSelect__Group_11__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group_11__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group_11__3"


    // $ANTLR start "rule__GSSFilterSelect__Group_11__3__Impl"
    // InternalFILTER.g:5729:1: rule__GSSFilterSelect__Group_11__3__Impl : ( ';' ) ;
    public final void rule__GSSFilterSelect__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5733:1: ( ( ';' ) )
            // InternalFILTER.g:5734:1: ( ';' )
            {
            // InternalFILTER.g:5734:1: ( ';' )
            // InternalFILTER.g:5735:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_11_3()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_11_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group_11__3__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group_12__0"
    // InternalFILTER.g:5745:1: rule__GSSFilterSelect__Group_12__0 : rule__GSSFilterSelect__Group_12__0__Impl rule__GSSFilterSelect__Group_12__1 ;
    public final void rule__GSSFilterSelect__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5749:1: ( rule__GSSFilterSelect__Group_12__0__Impl rule__GSSFilterSelect__Group_12__1 )
            // InternalFILTER.g:5750:2: rule__GSSFilterSelect__Group_12__0__Impl rule__GSSFilterSelect__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterSelect__Group_12__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group_12__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group_12__0"


    // $ANTLR start "rule__GSSFilterSelect__Group_12__0__Impl"
    // InternalFILTER.g:5757:1: rule__GSSFilterSelect__Group_12__0__Impl : ( 'mask' ) ;
    public final void rule__GSSFilterSelect__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5761:1: ( ( 'mask' ) )
            // InternalFILTER.g:5762:1: ( 'mask' )
            {
            // InternalFILTER.g:5762:1: ( 'mask' )
            // InternalFILTER.g:5763:2: 'mask'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getMaskKeyword_12_0()); 
            }
            match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getMaskKeyword_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group_12__0__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group_12__1"
    // InternalFILTER.g:5772:1: rule__GSSFilterSelect__Group_12__1 : rule__GSSFilterSelect__Group_12__1__Impl rule__GSSFilterSelect__Group_12__2 ;
    public final void rule__GSSFilterSelect__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5776:1: ( rule__GSSFilterSelect__Group_12__1__Impl rule__GSSFilterSelect__Group_12__2 )
            // InternalFILTER.g:5777:2: rule__GSSFilterSelect__Group_12__1__Impl rule__GSSFilterSelect__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__GSSFilterSelect__Group_12__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group_12__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group_12__1"


    // $ANTLR start "rule__GSSFilterSelect__Group_12__1__Impl"
    // InternalFILTER.g:5784:1: rule__GSSFilterSelect__Group_12__1__Impl : ( ':=' ) ;
    public final void rule__GSSFilterSelect__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5788:1: ( ( ':=' ) )
            // InternalFILTER.g:5789:1: ( ':=' )
            {
            // InternalFILTER.g:5789:1: ( ':=' )
            // InternalFILTER.g:5790:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_12_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_12_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group_12__1__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group_12__2"
    // InternalFILTER.g:5799:1: rule__GSSFilterSelect__Group_12__2 : rule__GSSFilterSelect__Group_12__2__Impl rule__GSSFilterSelect__Group_12__3 ;
    public final void rule__GSSFilterSelect__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5803:1: ( rule__GSSFilterSelect__Group_12__2__Impl rule__GSSFilterSelect__Group_12__3 )
            // InternalFILTER.g:5804:2: rule__GSSFilterSelect__Group_12__2__Impl rule__GSSFilterSelect__Group_12__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterSelect__Group_12__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group_12__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group_12__2"


    // $ANTLR start "rule__GSSFilterSelect__Group_12__2__Impl"
    // InternalFILTER.g:5811:1: rule__GSSFilterSelect__Group_12__2__Impl : ( ( rule__GSSFilterSelect__MaskAssignment_12_2 ) ) ;
    public final void rule__GSSFilterSelect__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5815:1: ( ( ( rule__GSSFilterSelect__MaskAssignment_12_2 ) ) )
            // InternalFILTER.g:5816:1: ( ( rule__GSSFilterSelect__MaskAssignment_12_2 ) )
            {
            // InternalFILTER.g:5816:1: ( ( rule__GSSFilterSelect__MaskAssignment_12_2 ) )
            // InternalFILTER.g:5817:2: ( rule__GSSFilterSelect__MaskAssignment_12_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getMaskAssignment_12_2()); 
            }
            // InternalFILTER.g:5818:2: ( rule__GSSFilterSelect__MaskAssignment_12_2 )
            // InternalFILTER.g:5818:3: rule__GSSFilterSelect__MaskAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__MaskAssignment_12_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getMaskAssignment_12_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group_12__2__Impl"


    // $ANTLR start "rule__GSSFilterSelect__Group_12__3"
    // InternalFILTER.g:5826:1: rule__GSSFilterSelect__Group_12__3 : rule__GSSFilterSelect__Group_12__3__Impl ;
    public final void rule__GSSFilterSelect__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5830:1: ( rule__GSSFilterSelect__Group_12__3__Impl )
            // InternalFILTER.g:5831:2: rule__GSSFilterSelect__Group_12__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelect__Group_12__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group_12__3"


    // $ANTLR start "rule__GSSFilterSelect__Group_12__3__Impl"
    // InternalFILTER.g:5837:1: rule__GSSFilterSelect__Group_12__3__Impl : ( ';' ) ;
    public final void rule__GSSFilterSelect__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5841:1: ( ( ';' ) )
            // InternalFILTER.g:5842:1: ( ';' )
            {
            // InternalFILTER.g:5842:1: ( ';' )
            // InternalFILTER.g:5843:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_12_3()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_12_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__Group_12__3__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__0"
    // InternalFILTER.g:5853:1: rule__GSSFilterSelectLine__Group__0 : rule__GSSFilterSelectLine__Group__0__Impl rule__GSSFilterSelectLine__Group__1 ;
    public final void rule__GSSFilterSelectLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5857:1: ( rule__GSSFilterSelectLine__Group__0__Impl rule__GSSFilterSelectLine__Group__1 )
            // InternalFILTER.g:5858:2: rule__GSSFilterSelectLine__Group__0__Impl rule__GSSFilterSelectLine__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSFilterSelectLine__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__0"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__0__Impl"
    // InternalFILTER.g:5865:1: rule__GSSFilterSelectLine__Group__0__Impl : ( 'GSSFilterSelectLine' ) ;
    public final void rule__GSSFilterSelectLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5869:1: ( ( 'GSSFilterSelectLine' ) )
            // InternalFILTER.g:5870:1: ( 'GSSFilterSelectLine' )
            {
            // InternalFILTER.g:5870:1: ( 'GSSFilterSelectLine' )
            // InternalFILTER.g:5871:2: 'GSSFilterSelectLine'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getGSSFilterSelectLineKeyword_0()); 
            }
            match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getGSSFilterSelectLineKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__0__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__1"
    // InternalFILTER.g:5880:1: rule__GSSFilterSelectLine__Group__1 : rule__GSSFilterSelectLine__Group__1__Impl rule__GSSFilterSelectLine__Group__2 ;
    public final void rule__GSSFilterSelectLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5884:1: ( rule__GSSFilterSelectLine__Group__1__Impl rule__GSSFilterSelectLine__Group__2 )
            // InternalFILTER.g:5885:2: rule__GSSFilterSelectLine__Group__1__Impl rule__GSSFilterSelectLine__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_37);
            rule__GSSFilterSelectLine__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__1"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__1__Impl"
    // InternalFILTER.g:5892:1: rule__GSSFilterSelectLine__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSFilterSelectLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5896:1: ( ( '{' ) )
            // InternalFILTER.g:5897:1: ( '{' )
            {
            // InternalFILTER.g:5897:1: ( '{' )
            // InternalFILTER.g:5898:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__1__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__2"
    // InternalFILTER.g:5907:1: rule__GSSFilterSelectLine__Group__2 : rule__GSSFilterSelectLine__Group__2__Impl rule__GSSFilterSelectLine__Group__3 ;
    public final void rule__GSSFilterSelectLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5911:1: ( rule__GSSFilterSelectLine__Group__2__Impl rule__GSSFilterSelectLine__Group__3 )
            // InternalFILTER.g:5912:2: rule__GSSFilterSelectLine__Group__2__Impl rule__GSSFilterSelectLine__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterSelectLine__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__2"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__2__Impl"
    // InternalFILTER.g:5919:1: rule__GSSFilterSelectLine__Group__2__Impl : ( 'fromFile' ) ;
    public final void rule__GSSFilterSelectLine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5923:1: ( ( 'fromFile' ) )
            // InternalFILTER.g:5924:1: ( 'fromFile' )
            {
            // InternalFILTER.g:5924:1: ( 'fromFile' )
            // InternalFILTER.g:5925:2: 'fromFile'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getFromFileKeyword_2()); 
            }
            match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getFromFileKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__2__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__3"
    // InternalFILTER.g:5934:1: rule__GSSFilterSelectLine__Group__3 : rule__GSSFilterSelectLine__Group__3__Impl rule__GSSFilterSelectLine__Group__4 ;
    public final void rule__GSSFilterSelectLine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5938:1: ( rule__GSSFilterSelectLine__Group__3__Impl rule__GSSFilterSelectLine__Group__4 )
            // InternalFILTER.g:5939:2: rule__GSSFilterSelectLine__Group__3__Impl rule__GSSFilterSelectLine__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSFilterSelectLine__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__3"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__3__Impl"
    // InternalFILTER.g:5946:1: rule__GSSFilterSelectLine__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSFilterSelectLine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5950:1: ( ( ':=' ) )
            // InternalFILTER.g:5951:1: ( ':=' )
            {
            // InternalFILTER.g:5951:1: ( ':=' )
            // InternalFILTER.g:5952:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__3__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__4"
    // InternalFILTER.g:5961:1: rule__GSSFilterSelectLine__Group__4 : rule__GSSFilterSelectLine__Group__4__Impl rule__GSSFilterSelectLine__Group__5 ;
    public final void rule__GSSFilterSelectLine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5965:1: ( rule__GSSFilterSelectLine__Group__4__Impl rule__GSSFilterSelectLine__Group__5 )
            // InternalFILTER.g:5966:2: rule__GSSFilterSelectLine__Group__4__Impl rule__GSSFilterSelectLine__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterSelectLine__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__4"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__4__Impl"
    // InternalFILTER.g:5973:1: rule__GSSFilterSelectLine__Group__4__Impl : ( ( rule__GSSFilterSelectLine__FromFileAssignment_4 ) ) ;
    public final void rule__GSSFilterSelectLine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5977:1: ( ( ( rule__GSSFilterSelectLine__FromFileAssignment_4 ) ) )
            // InternalFILTER.g:5978:1: ( ( rule__GSSFilterSelectLine__FromFileAssignment_4 ) )
            {
            // InternalFILTER.g:5978:1: ( ( rule__GSSFilterSelectLine__FromFileAssignment_4 ) )
            // InternalFILTER.g:5979:2: ( rule__GSSFilterSelectLine__FromFileAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getFromFileAssignment_4()); 
            }
            // InternalFILTER.g:5980:2: ( rule__GSSFilterSelectLine__FromFileAssignment_4 )
            // InternalFILTER.g:5980:3: rule__GSSFilterSelectLine__FromFileAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__FromFileAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getFromFileAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__4__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__5"
    // InternalFILTER.g:5988:1: rule__GSSFilterSelectLine__Group__5 : rule__GSSFilterSelectLine__Group__5__Impl rule__GSSFilterSelectLine__Group__6 ;
    public final void rule__GSSFilterSelectLine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5992:1: ( rule__GSSFilterSelectLine__Group__5__Impl rule__GSSFilterSelectLine__Group__6 )
            // InternalFILTER.g:5993:2: rule__GSSFilterSelectLine__Group__5__Impl rule__GSSFilterSelectLine__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__GSSFilterSelectLine__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__5"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__5__Impl"
    // InternalFILTER.g:6000:1: rule__GSSFilterSelectLine__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSFilterSelectLine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6004:1: ( ( ';' ) )
            // InternalFILTER.g:6005:1: ( ';' )
            {
            // InternalFILTER.g:6005:1: ( ';' )
            // InternalFILTER.g:6006:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_5()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__5__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__6"
    // InternalFILTER.g:6015:1: rule__GSSFilterSelectLine__Group__6 : rule__GSSFilterSelectLine__Group__6__Impl rule__GSSFilterSelectLine__Group__7 ;
    public final void rule__GSSFilterSelectLine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6019:1: ( rule__GSSFilterSelectLine__Group__6__Impl rule__GSSFilterSelectLine__Group__7 )
            // InternalFILTER.g:6020:2: rule__GSSFilterSelectLine__Group__6__Impl rule__GSSFilterSelectLine__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterSelectLine__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__6"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__6__Impl"
    // InternalFILTER.g:6027:1: rule__GSSFilterSelectLine__Group__6__Impl : ( 'line' ) ;
    public final void rule__GSSFilterSelectLine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6031:1: ( ( 'line' ) )
            // InternalFILTER.g:6032:1: ( 'line' )
            {
            // InternalFILTER.g:6032:1: ( 'line' )
            // InternalFILTER.g:6033:2: 'line'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getLineKeyword_6()); 
            }
            match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getLineKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__6__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__7"
    // InternalFILTER.g:6042:1: rule__GSSFilterSelectLine__Group__7 : rule__GSSFilterSelectLine__Group__7__Impl rule__GSSFilterSelectLine__Group__8 ;
    public final void rule__GSSFilterSelectLine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6046:1: ( rule__GSSFilterSelectLine__Group__7__Impl rule__GSSFilterSelectLine__Group__8 )
            // InternalFILTER.g:6047:2: rule__GSSFilterSelectLine__Group__7__Impl rule__GSSFilterSelectLine__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__GSSFilterSelectLine__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__7"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__7__Impl"
    // InternalFILTER.g:6054:1: rule__GSSFilterSelectLine__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSFilterSelectLine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6058:1: ( ( ':=' ) )
            // InternalFILTER.g:6059:1: ( ':=' )
            {
            // InternalFILTER.g:6059:1: ( ':=' )
            // InternalFILTER.g:6060:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__7__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__8"
    // InternalFILTER.g:6069:1: rule__GSSFilterSelectLine__Group__8 : rule__GSSFilterSelectLine__Group__8__Impl rule__GSSFilterSelectLine__Group__9 ;
    public final void rule__GSSFilterSelectLine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6073:1: ( rule__GSSFilterSelectLine__Group__8__Impl rule__GSSFilterSelectLine__Group__9 )
            // InternalFILTER.g:6074:2: rule__GSSFilterSelectLine__Group__8__Impl rule__GSSFilterSelectLine__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterSelectLine__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__8"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__8__Impl"
    // InternalFILTER.g:6081:1: rule__GSSFilterSelectLine__Group__8__Impl : ( ( rule__GSSFilterSelectLine__LineAssignment_8 ) ) ;
    public final void rule__GSSFilterSelectLine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6085:1: ( ( ( rule__GSSFilterSelectLine__LineAssignment_8 ) ) )
            // InternalFILTER.g:6086:1: ( ( rule__GSSFilterSelectLine__LineAssignment_8 ) )
            {
            // InternalFILTER.g:6086:1: ( ( rule__GSSFilterSelectLine__LineAssignment_8 ) )
            // InternalFILTER.g:6087:2: ( rule__GSSFilterSelectLine__LineAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getLineAssignment_8()); 
            }
            // InternalFILTER.g:6088:2: ( rule__GSSFilterSelectLine__LineAssignment_8 )
            // InternalFILTER.g:6088:3: rule__GSSFilterSelectLine__LineAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__LineAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getLineAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__8__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__9"
    // InternalFILTER.g:6096:1: rule__GSSFilterSelectLine__Group__9 : rule__GSSFilterSelectLine__Group__9__Impl rule__GSSFilterSelectLine__Group__10 ;
    public final void rule__GSSFilterSelectLine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6100:1: ( rule__GSSFilterSelectLine__Group__9__Impl rule__GSSFilterSelectLine__Group__10 )
            // InternalFILTER.g:6101:2: rule__GSSFilterSelectLine__Group__9__Impl rule__GSSFilterSelectLine__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_41);
            rule__GSSFilterSelectLine__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__9"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__9__Impl"
    // InternalFILTER.g:6108:1: rule__GSSFilterSelectLine__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSFilterSelectLine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6112:1: ( ( ';' ) )
            // InternalFILTER.g:6113:1: ( ';' )
            {
            // InternalFILTER.g:6113:1: ( ';' )
            // InternalFILTER.g:6114:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_9()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__9__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__10"
    // InternalFILTER.g:6123:1: rule__GSSFilterSelectLine__Group__10 : rule__GSSFilterSelectLine__Group__10__Impl rule__GSSFilterSelectLine__Group__11 ;
    public final void rule__GSSFilterSelectLine__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6127:1: ( rule__GSSFilterSelectLine__Group__10__Impl rule__GSSFilterSelectLine__Group__11 )
            // InternalFILTER.g:6128:2: rule__GSSFilterSelectLine__Group__10__Impl rule__GSSFilterSelectLine__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_41);
            rule__GSSFilterSelectLine__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__10"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__10__Impl"
    // InternalFILTER.g:6135:1: rule__GSSFilterSelectLine__Group__10__Impl : ( ( rule__GSSFilterSelectLine__Group_10__0 )? ) ;
    public final void rule__GSSFilterSelectLine__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6139:1: ( ( ( rule__GSSFilterSelectLine__Group_10__0 )? ) )
            // InternalFILTER.g:6140:1: ( ( rule__GSSFilterSelectLine__Group_10__0 )? )
            {
            // InternalFILTER.g:6140:1: ( ( rule__GSSFilterSelectLine__Group_10__0 )? )
            // InternalFILTER.g:6141:2: ( rule__GSSFilterSelectLine__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getGroup_10()); 
            }
            // InternalFILTER.g:6142:2: ( rule__GSSFilterSelectLine__Group_10__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==57) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalFILTER.g:6142:3: rule__GSSFilterSelectLine__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSFilterSelectLine__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getGroup_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__10__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__11"
    // InternalFILTER.g:6150:1: rule__GSSFilterSelectLine__Group__11 : rule__GSSFilterSelectLine__Group__11__Impl rule__GSSFilterSelectLine__Group__12 ;
    public final void rule__GSSFilterSelectLine__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6154:1: ( rule__GSSFilterSelectLine__Group__11__Impl rule__GSSFilterSelectLine__Group__12 )
            // InternalFILTER.g:6155:2: rule__GSSFilterSelectLine__Group__11__Impl rule__GSSFilterSelectLine__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_41);
            rule__GSSFilterSelectLine__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__11"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__11__Impl"
    // InternalFILTER.g:6162:1: rule__GSSFilterSelectLine__Group__11__Impl : ( ( rule__GSSFilterSelectLine__Group_11__0 )? ) ;
    public final void rule__GSSFilterSelectLine__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6166:1: ( ( ( rule__GSSFilterSelectLine__Group_11__0 )? ) )
            // InternalFILTER.g:6167:1: ( ( rule__GSSFilterSelectLine__Group_11__0 )? )
            {
            // InternalFILTER.g:6167:1: ( ( rule__GSSFilterSelectLine__Group_11__0 )? )
            // InternalFILTER.g:6168:2: ( rule__GSSFilterSelectLine__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getGroup_11()); 
            }
            // InternalFILTER.g:6169:2: ( rule__GSSFilterSelectLine__Group_11__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==58) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalFILTER.g:6169:3: rule__GSSFilterSelectLine__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSFilterSelectLine__Group_11__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getGroup_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__11__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__12"
    // InternalFILTER.g:6177:1: rule__GSSFilterSelectLine__Group__12 : rule__GSSFilterSelectLine__Group__12__Impl rule__GSSFilterSelectLine__Group__13 ;
    public final void rule__GSSFilterSelectLine__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6181:1: ( rule__GSSFilterSelectLine__Group__12__Impl rule__GSSFilterSelectLine__Group__13 )
            // InternalFILTER.g:6182:2: rule__GSSFilterSelectLine__Group__12__Impl rule__GSSFilterSelectLine__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_41);
            rule__GSSFilterSelectLine__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__12"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__12__Impl"
    // InternalFILTER.g:6189:1: rule__GSSFilterSelectLine__Group__12__Impl : ( ( rule__GSSFilterSelectLine__Group_12__0 )? ) ;
    public final void rule__GSSFilterSelectLine__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6193:1: ( ( ( rule__GSSFilterSelectLine__Group_12__0 )? ) )
            // InternalFILTER.g:6194:1: ( ( rule__GSSFilterSelectLine__Group_12__0 )? )
            {
            // InternalFILTER.g:6194:1: ( ( rule__GSSFilterSelectLine__Group_12__0 )? )
            // InternalFILTER.g:6195:2: ( rule__GSSFilterSelectLine__Group_12__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getGroup_12()); 
            }
            // InternalFILTER.g:6196:2: ( rule__GSSFilterSelectLine__Group_12__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==51) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalFILTER.g:6196:3: rule__GSSFilterSelectLine__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSFilterSelectLine__Group_12__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getGroup_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__12__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__13"
    // InternalFILTER.g:6204:1: rule__GSSFilterSelectLine__Group__13 : rule__GSSFilterSelectLine__Group__13__Impl rule__GSSFilterSelectLine__Group__14 ;
    public final void rule__GSSFilterSelectLine__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6208:1: ( rule__GSSFilterSelectLine__Group__13__Impl rule__GSSFilterSelectLine__Group__14 )
            // InternalFILTER.g:6209:2: rule__GSSFilterSelectLine__Group__13__Impl rule__GSSFilterSelectLine__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterSelectLine__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__13"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__13__Impl"
    // InternalFILTER.g:6216:1: rule__GSSFilterSelectLine__Group__13__Impl : ( '}' ) ;
    public final void rule__GSSFilterSelectLine__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6220:1: ( ( '}' ) )
            // InternalFILTER.g:6221:1: ( '}' )
            {
            // InternalFILTER.g:6221:1: ( '}' )
            // InternalFILTER.g:6222:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getRightCurlyBracketKeyword_13()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getRightCurlyBracketKeyword_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__13__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__14"
    // InternalFILTER.g:6231:1: rule__GSSFilterSelectLine__Group__14 : rule__GSSFilterSelectLine__Group__14__Impl ;
    public final void rule__GSSFilterSelectLine__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6235:1: ( rule__GSSFilterSelectLine__Group__14__Impl )
            // InternalFILTER.g:6236:2: rule__GSSFilterSelectLine__Group__14__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__14"


    // $ANTLR start "rule__GSSFilterSelectLine__Group__14__Impl"
    // InternalFILTER.g:6242:1: rule__GSSFilterSelectLine__Group__14__Impl : ( ';' ) ;
    public final void rule__GSSFilterSelectLine__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6246:1: ( ( ';' ) )
            // InternalFILTER.g:6247:1: ( ';' )
            {
            // InternalFILTER.g:6247:1: ( ';' )
            // InternalFILTER.g:6248:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_14()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group__14__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group_10__0"
    // InternalFILTER.g:6258:1: rule__GSSFilterSelectLine__Group_10__0 : rule__GSSFilterSelectLine__Group_10__0__Impl rule__GSSFilterSelectLine__Group_10__1 ;
    public final void rule__GSSFilterSelectLine__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6262:1: ( rule__GSSFilterSelectLine__Group_10__0__Impl rule__GSSFilterSelectLine__Group_10__1 )
            // InternalFILTER.g:6263:2: rule__GSSFilterSelectLine__Group_10__0__Impl rule__GSSFilterSelectLine__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterSelectLine__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group_10__0"


    // $ANTLR start "rule__GSSFilterSelectLine__Group_10__0__Impl"
    // InternalFILTER.g:6270:1: rule__GSSFilterSelectLine__Group_10__0__Impl : ( 'leftTrim' ) ;
    public final void rule__GSSFilterSelectLine__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6274:1: ( ( 'leftTrim' ) )
            // InternalFILTER.g:6275:1: ( 'leftTrim' )
            {
            // InternalFILTER.g:6275:1: ( 'leftTrim' )
            // InternalFILTER.g:6276:2: 'leftTrim'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getLeftTrimKeyword_10_0()); 
            }
            match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getLeftTrimKeyword_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group_10__0__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group_10__1"
    // InternalFILTER.g:6285:1: rule__GSSFilterSelectLine__Group_10__1 : rule__GSSFilterSelectLine__Group_10__1__Impl rule__GSSFilterSelectLine__Group_10__2 ;
    public final void rule__GSSFilterSelectLine__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6289:1: ( rule__GSSFilterSelectLine__Group_10__1__Impl rule__GSSFilterSelectLine__Group_10__2 )
            // InternalFILTER.g:6290:2: rule__GSSFilterSelectLine__Group_10__1__Impl rule__GSSFilterSelectLine__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__GSSFilterSelectLine__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group_10__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group_10__1"


    // $ANTLR start "rule__GSSFilterSelectLine__Group_10__1__Impl"
    // InternalFILTER.g:6297:1: rule__GSSFilterSelectLine__Group_10__1__Impl : ( ':=' ) ;
    public final void rule__GSSFilterSelectLine__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6301:1: ( ( ':=' ) )
            // InternalFILTER.g:6302:1: ( ':=' )
            {
            // InternalFILTER.g:6302:1: ( ':=' )
            // InternalFILTER.g:6303:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_10_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_10_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group_10__1__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group_10__2"
    // InternalFILTER.g:6312:1: rule__GSSFilterSelectLine__Group_10__2 : rule__GSSFilterSelectLine__Group_10__2__Impl rule__GSSFilterSelectLine__Group_10__3 ;
    public final void rule__GSSFilterSelectLine__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6316:1: ( rule__GSSFilterSelectLine__Group_10__2__Impl rule__GSSFilterSelectLine__Group_10__3 )
            // InternalFILTER.g:6317:2: rule__GSSFilterSelectLine__Group_10__2__Impl rule__GSSFilterSelectLine__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterSelectLine__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group_10__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group_10__2"


    // $ANTLR start "rule__GSSFilterSelectLine__Group_10__2__Impl"
    // InternalFILTER.g:6324:1: rule__GSSFilterSelectLine__Group_10__2__Impl : ( ( rule__GSSFilterSelectLine__LeftTrimAssignment_10_2 ) ) ;
    public final void rule__GSSFilterSelectLine__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6328:1: ( ( ( rule__GSSFilterSelectLine__LeftTrimAssignment_10_2 ) ) )
            // InternalFILTER.g:6329:1: ( ( rule__GSSFilterSelectLine__LeftTrimAssignment_10_2 ) )
            {
            // InternalFILTER.g:6329:1: ( ( rule__GSSFilterSelectLine__LeftTrimAssignment_10_2 ) )
            // InternalFILTER.g:6330:2: ( rule__GSSFilterSelectLine__LeftTrimAssignment_10_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getLeftTrimAssignment_10_2()); 
            }
            // InternalFILTER.g:6331:2: ( rule__GSSFilterSelectLine__LeftTrimAssignment_10_2 )
            // InternalFILTER.g:6331:3: rule__GSSFilterSelectLine__LeftTrimAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__LeftTrimAssignment_10_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getLeftTrimAssignment_10_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group_10__2__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group_10__3"
    // InternalFILTER.g:6339:1: rule__GSSFilterSelectLine__Group_10__3 : rule__GSSFilterSelectLine__Group_10__3__Impl ;
    public final void rule__GSSFilterSelectLine__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6343:1: ( rule__GSSFilterSelectLine__Group_10__3__Impl )
            // InternalFILTER.g:6344:2: rule__GSSFilterSelectLine__Group_10__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group_10__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group_10__3"


    // $ANTLR start "rule__GSSFilterSelectLine__Group_10__3__Impl"
    // InternalFILTER.g:6350:1: rule__GSSFilterSelectLine__Group_10__3__Impl : ( ';' ) ;
    public final void rule__GSSFilterSelectLine__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6354:1: ( ( ';' ) )
            // InternalFILTER.g:6355:1: ( ';' )
            {
            // InternalFILTER.g:6355:1: ( ';' )
            // InternalFILTER.g:6356:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_10_3()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_10_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group_10__3__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group_11__0"
    // InternalFILTER.g:6366:1: rule__GSSFilterSelectLine__Group_11__0 : rule__GSSFilterSelectLine__Group_11__0__Impl rule__GSSFilterSelectLine__Group_11__1 ;
    public final void rule__GSSFilterSelectLine__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6370:1: ( rule__GSSFilterSelectLine__Group_11__0__Impl rule__GSSFilterSelectLine__Group_11__1 )
            // InternalFILTER.g:6371:2: rule__GSSFilterSelectLine__Group_11__0__Impl rule__GSSFilterSelectLine__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterSelectLine__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group_11__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group_11__0"


    // $ANTLR start "rule__GSSFilterSelectLine__Group_11__0__Impl"
    // InternalFILTER.g:6378:1: rule__GSSFilterSelectLine__Group_11__0__Impl : ( 'rightTrim' ) ;
    public final void rule__GSSFilterSelectLine__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6382:1: ( ( 'rightTrim' ) )
            // InternalFILTER.g:6383:1: ( 'rightTrim' )
            {
            // InternalFILTER.g:6383:1: ( 'rightTrim' )
            // InternalFILTER.g:6384:2: 'rightTrim'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getRightTrimKeyword_11_0()); 
            }
            match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getRightTrimKeyword_11_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group_11__0__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group_11__1"
    // InternalFILTER.g:6393:1: rule__GSSFilterSelectLine__Group_11__1 : rule__GSSFilterSelectLine__Group_11__1__Impl rule__GSSFilterSelectLine__Group_11__2 ;
    public final void rule__GSSFilterSelectLine__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6397:1: ( rule__GSSFilterSelectLine__Group_11__1__Impl rule__GSSFilterSelectLine__Group_11__2 )
            // InternalFILTER.g:6398:2: rule__GSSFilterSelectLine__Group_11__1__Impl rule__GSSFilterSelectLine__Group_11__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__GSSFilterSelectLine__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group_11__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group_11__1"


    // $ANTLR start "rule__GSSFilterSelectLine__Group_11__1__Impl"
    // InternalFILTER.g:6405:1: rule__GSSFilterSelectLine__Group_11__1__Impl : ( ':=' ) ;
    public final void rule__GSSFilterSelectLine__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6409:1: ( ( ':=' ) )
            // InternalFILTER.g:6410:1: ( ':=' )
            {
            // InternalFILTER.g:6410:1: ( ':=' )
            // InternalFILTER.g:6411:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_11_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_11_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group_11__1__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group_11__2"
    // InternalFILTER.g:6420:1: rule__GSSFilterSelectLine__Group_11__2 : rule__GSSFilterSelectLine__Group_11__2__Impl rule__GSSFilterSelectLine__Group_11__3 ;
    public final void rule__GSSFilterSelectLine__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6424:1: ( rule__GSSFilterSelectLine__Group_11__2__Impl rule__GSSFilterSelectLine__Group_11__3 )
            // InternalFILTER.g:6425:2: rule__GSSFilterSelectLine__Group_11__2__Impl rule__GSSFilterSelectLine__Group_11__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterSelectLine__Group_11__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group_11__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group_11__2"


    // $ANTLR start "rule__GSSFilterSelectLine__Group_11__2__Impl"
    // InternalFILTER.g:6432:1: rule__GSSFilterSelectLine__Group_11__2__Impl : ( ( rule__GSSFilterSelectLine__RightTrimAssignment_11_2 ) ) ;
    public final void rule__GSSFilterSelectLine__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6436:1: ( ( ( rule__GSSFilterSelectLine__RightTrimAssignment_11_2 ) ) )
            // InternalFILTER.g:6437:1: ( ( rule__GSSFilterSelectLine__RightTrimAssignment_11_2 ) )
            {
            // InternalFILTER.g:6437:1: ( ( rule__GSSFilterSelectLine__RightTrimAssignment_11_2 ) )
            // InternalFILTER.g:6438:2: ( rule__GSSFilterSelectLine__RightTrimAssignment_11_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getRightTrimAssignment_11_2()); 
            }
            // InternalFILTER.g:6439:2: ( rule__GSSFilterSelectLine__RightTrimAssignment_11_2 )
            // InternalFILTER.g:6439:3: rule__GSSFilterSelectLine__RightTrimAssignment_11_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__RightTrimAssignment_11_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getRightTrimAssignment_11_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group_11__2__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group_11__3"
    // InternalFILTER.g:6447:1: rule__GSSFilterSelectLine__Group_11__3 : rule__GSSFilterSelectLine__Group_11__3__Impl ;
    public final void rule__GSSFilterSelectLine__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6451:1: ( rule__GSSFilterSelectLine__Group_11__3__Impl )
            // InternalFILTER.g:6452:2: rule__GSSFilterSelectLine__Group_11__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group_11__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group_11__3"


    // $ANTLR start "rule__GSSFilterSelectLine__Group_11__3__Impl"
    // InternalFILTER.g:6458:1: rule__GSSFilterSelectLine__Group_11__3__Impl : ( ';' ) ;
    public final void rule__GSSFilterSelectLine__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6462:1: ( ( ';' ) )
            // InternalFILTER.g:6463:1: ( ';' )
            {
            // InternalFILTER.g:6463:1: ( ';' )
            // InternalFILTER.g:6464:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_11_3()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_11_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group_11__3__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group_12__0"
    // InternalFILTER.g:6474:1: rule__GSSFilterSelectLine__Group_12__0 : rule__GSSFilterSelectLine__Group_12__0__Impl rule__GSSFilterSelectLine__Group_12__1 ;
    public final void rule__GSSFilterSelectLine__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6478:1: ( rule__GSSFilterSelectLine__Group_12__0__Impl rule__GSSFilterSelectLine__Group_12__1 )
            // InternalFILTER.g:6479:2: rule__GSSFilterSelectLine__Group_12__0__Impl rule__GSSFilterSelectLine__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterSelectLine__Group_12__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group_12__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group_12__0"


    // $ANTLR start "rule__GSSFilterSelectLine__Group_12__0__Impl"
    // InternalFILTER.g:6486:1: rule__GSSFilterSelectLine__Group_12__0__Impl : ( 'mask' ) ;
    public final void rule__GSSFilterSelectLine__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6490:1: ( ( 'mask' ) )
            // InternalFILTER.g:6491:1: ( 'mask' )
            {
            // InternalFILTER.g:6491:1: ( 'mask' )
            // InternalFILTER.g:6492:2: 'mask'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getMaskKeyword_12_0()); 
            }
            match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getMaskKeyword_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group_12__0__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group_12__1"
    // InternalFILTER.g:6501:1: rule__GSSFilterSelectLine__Group_12__1 : rule__GSSFilterSelectLine__Group_12__1__Impl rule__GSSFilterSelectLine__Group_12__2 ;
    public final void rule__GSSFilterSelectLine__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6505:1: ( rule__GSSFilterSelectLine__Group_12__1__Impl rule__GSSFilterSelectLine__Group_12__2 )
            // InternalFILTER.g:6506:2: rule__GSSFilterSelectLine__Group_12__1__Impl rule__GSSFilterSelectLine__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__GSSFilterSelectLine__Group_12__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group_12__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group_12__1"


    // $ANTLR start "rule__GSSFilterSelectLine__Group_12__1__Impl"
    // InternalFILTER.g:6513:1: rule__GSSFilterSelectLine__Group_12__1__Impl : ( ':=' ) ;
    public final void rule__GSSFilterSelectLine__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6517:1: ( ( ':=' ) )
            // InternalFILTER.g:6518:1: ( ':=' )
            {
            // InternalFILTER.g:6518:1: ( ':=' )
            // InternalFILTER.g:6519:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_12_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_12_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group_12__1__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group_12__2"
    // InternalFILTER.g:6528:1: rule__GSSFilterSelectLine__Group_12__2 : rule__GSSFilterSelectLine__Group_12__2__Impl rule__GSSFilterSelectLine__Group_12__3 ;
    public final void rule__GSSFilterSelectLine__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6532:1: ( rule__GSSFilterSelectLine__Group_12__2__Impl rule__GSSFilterSelectLine__Group_12__3 )
            // InternalFILTER.g:6533:2: rule__GSSFilterSelectLine__Group_12__2__Impl rule__GSSFilterSelectLine__Group_12__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterSelectLine__Group_12__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group_12__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group_12__2"


    // $ANTLR start "rule__GSSFilterSelectLine__Group_12__2__Impl"
    // InternalFILTER.g:6540:1: rule__GSSFilterSelectLine__Group_12__2__Impl : ( ( rule__GSSFilterSelectLine__MaskAssignment_12_2 ) ) ;
    public final void rule__GSSFilterSelectLine__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6544:1: ( ( ( rule__GSSFilterSelectLine__MaskAssignment_12_2 ) ) )
            // InternalFILTER.g:6545:1: ( ( rule__GSSFilterSelectLine__MaskAssignment_12_2 ) )
            {
            // InternalFILTER.g:6545:1: ( ( rule__GSSFilterSelectLine__MaskAssignment_12_2 ) )
            // InternalFILTER.g:6546:2: ( rule__GSSFilterSelectLine__MaskAssignment_12_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getMaskAssignment_12_2()); 
            }
            // InternalFILTER.g:6547:2: ( rule__GSSFilterSelectLine__MaskAssignment_12_2 )
            // InternalFILTER.g:6547:3: rule__GSSFilterSelectLine__MaskAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__MaskAssignment_12_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getMaskAssignment_12_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group_12__2__Impl"


    // $ANTLR start "rule__GSSFilterSelectLine__Group_12__3"
    // InternalFILTER.g:6555:1: rule__GSSFilterSelectLine__Group_12__3 : rule__GSSFilterSelectLine__Group_12__3__Impl ;
    public final void rule__GSSFilterSelectLine__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6559:1: ( rule__GSSFilterSelectLine__Group_12__3__Impl )
            // InternalFILTER.g:6560:2: rule__GSSFilterSelectLine__Group_12__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterSelectLine__Group_12__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group_12__3"


    // $ANTLR start "rule__GSSFilterSelectLine__Group_12__3__Impl"
    // InternalFILTER.g:6566:1: rule__GSSFilterSelectLine__Group_12__3__Impl : ( ';' ) ;
    public final void rule__GSSFilterSelectLine__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6570:1: ( ( ';' ) )
            // InternalFILTER.g:6571:1: ( ';' )
            {
            // InternalFILTER.g:6571:1: ( ';' )
            // InternalFILTER.g:6572:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_12_3()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_12_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__Group_12__3__Impl"


    // $ANTLR start "rule__GSSFilterMaxterm__Group__0"
    // InternalFILTER.g:6582:1: rule__GSSFilterMaxterm__Group__0 : rule__GSSFilterMaxterm__Group__0__Impl rule__GSSFilterMaxterm__Group__1 ;
    public final void rule__GSSFilterMaxterm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6586:1: ( rule__GSSFilterMaxterm__Group__0__Impl rule__GSSFilterMaxterm__Group__1 )
            // InternalFILTER.g:6587:2: rule__GSSFilterMaxterm__Group__0__Impl rule__GSSFilterMaxterm__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSFilterMaxterm__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxterm__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxterm__Group__0"


    // $ANTLR start "rule__GSSFilterMaxterm__Group__0__Impl"
    // InternalFILTER.g:6594:1: rule__GSSFilterMaxterm__Group__0__Impl : ( 'GSSFilterMaxterm' ) ;
    public final void rule__GSSFilterMaxterm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6598:1: ( ( 'GSSFilterMaxterm' ) )
            // InternalFILTER.g:6599:1: ( 'GSSFilterMaxterm' )
            {
            // InternalFILTER.g:6599:1: ( 'GSSFilterMaxterm' )
            // InternalFILTER.g:6600:2: 'GSSFilterMaxterm'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermAccess().getGSSFilterMaxtermKeyword_0()); 
            }
            match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermAccess().getGSSFilterMaxtermKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxterm__Group__0__Impl"


    // $ANTLR start "rule__GSSFilterMaxterm__Group__1"
    // InternalFILTER.g:6609:1: rule__GSSFilterMaxterm__Group__1 : rule__GSSFilterMaxterm__Group__1__Impl rule__GSSFilterMaxterm__Group__2 ;
    public final void rule__GSSFilterMaxterm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6613:1: ( rule__GSSFilterMaxterm__Group__1__Impl rule__GSSFilterMaxterm__Group__2 )
            // InternalFILTER.g:6614:2: rule__GSSFilterMaxterm__Group__1__Impl rule__GSSFilterMaxterm__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__GSSFilterMaxterm__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxterm__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxterm__Group__1"


    // $ANTLR start "rule__GSSFilterMaxterm__Group__1__Impl"
    // InternalFILTER.g:6621:1: rule__GSSFilterMaxterm__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSFilterMaxterm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6625:1: ( ( '{' ) )
            // InternalFILTER.g:6626:1: ( '{' )
            {
            // InternalFILTER.g:6626:1: ( '{' )
            // InternalFILTER.g:6627:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxterm__Group__1__Impl"


    // $ANTLR start "rule__GSSFilterMaxterm__Group__2"
    // InternalFILTER.g:6636:1: rule__GSSFilterMaxterm__Group__2 : rule__GSSFilterMaxterm__Group__2__Impl rule__GSSFilterMaxterm__Group__3 ;
    public final void rule__GSSFilterMaxterm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6640:1: ( rule__GSSFilterMaxterm__Group__2__Impl rule__GSSFilterMaxterm__Group__3 )
            // InternalFILTER.g:6641:2: rule__GSSFilterMaxterm__Group__2__Impl rule__GSSFilterMaxterm__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterMaxterm__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxterm__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxterm__Group__2"


    // $ANTLR start "rule__GSSFilterMaxterm__Group__2__Impl"
    // InternalFILTER.g:6648:1: rule__GSSFilterMaxterm__Group__2__Impl : ( 'id' ) ;
    public final void rule__GSSFilterMaxterm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6652:1: ( ( 'id' ) )
            // InternalFILTER.g:6653:1: ( 'id' )
            {
            // InternalFILTER.g:6653:1: ( 'id' )
            // InternalFILTER.g:6654:2: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermAccess().getIdKeyword_2()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermAccess().getIdKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxterm__Group__2__Impl"


    // $ANTLR start "rule__GSSFilterMaxterm__Group__3"
    // InternalFILTER.g:6663:1: rule__GSSFilterMaxterm__Group__3 : rule__GSSFilterMaxterm__Group__3__Impl rule__GSSFilterMaxterm__Group__4 ;
    public final void rule__GSSFilterMaxterm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6667:1: ( rule__GSSFilterMaxterm__Group__3__Impl rule__GSSFilterMaxterm__Group__4 )
            // InternalFILTER.g:6668:2: rule__GSSFilterMaxterm__Group__3__Impl rule__GSSFilterMaxterm__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__GSSFilterMaxterm__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxterm__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxterm__Group__3"


    // $ANTLR start "rule__GSSFilterMaxterm__Group__3__Impl"
    // InternalFILTER.g:6675:1: rule__GSSFilterMaxterm__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSFilterMaxterm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6679:1: ( ( ':=' ) )
            // InternalFILTER.g:6680:1: ( ':=' )
            {
            // InternalFILTER.g:6680:1: ( ':=' )
            // InternalFILTER.g:6681:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxterm__Group__3__Impl"


    // $ANTLR start "rule__GSSFilterMaxterm__Group__4"
    // InternalFILTER.g:6690:1: rule__GSSFilterMaxterm__Group__4 : rule__GSSFilterMaxterm__Group__4__Impl rule__GSSFilterMaxterm__Group__5 ;
    public final void rule__GSSFilterMaxterm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6694:1: ( rule__GSSFilterMaxterm__Group__4__Impl rule__GSSFilterMaxterm__Group__5 )
            // InternalFILTER.g:6695:2: rule__GSSFilterMaxterm__Group__4__Impl rule__GSSFilterMaxterm__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterMaxterm__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxterm__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxterm__Group__4"


    // $ANTLR start "rule__GSSFilterMaxterm__Group__4__Impl"
    // InternalFILTER.g:6702:1: rule__GSSFilterMaxterm__Group__4__Impl : ( ( rule__GSSFilterMaxterm__IdAssignment_4 ) ) ;
    public final void rule__GSSFilterMaxterm__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6706:1: ( ( ( rule__GSSFilterMaxterm__IdAssignment_4 ) ) )
            // InternalFILTER.g:6707:1: ( ( rule__GSSFilterMaxterm__IdAssignment_4 ) )
            {
            // InternalFILTER.g:6707:1: ( ( rule__GSSFilterMaxterm__IdAssignment_4 ) )
            // InternalFILTER.g:6708:2: ( rule__GSSFilterMaxterm__IdAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermAccess().getIdAssignment_4()); 
            }
            // InternalFILTER.g:6709:2: ( rule__GSSFilterMaxterm__IdAssignment_4 )
            // InternalFILTER.g:6709:3: rule__GSSFilterMaxterm__IdAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxterm__IdAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermAccess().getIdAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxterm__Group__4__Impl"


    // $ANTLR start "rule__GSSFilterMaxterm__Group__5"
    // InternalFILTER.g:6717:1: rule__GSSFilterMaxterm__Group__5 : rule__GSSFilterMaxterm__Group__5__Impl rule__GSSFilterMaxterm__Group__6 ;
    public final void rule__GSSFilterMaxterm__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6721:1: ( rule__GSSFilterMaxterm__Group__5__Impl rule__GSSFilterMaxterm__Group__6 )
            // InternalFILTER.g:6722:2: rule__GSSFilterMaxterm__Group__5__Impl rule__GSSFilterMaxterm__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__GSSFilterMaxterm__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxterm__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxterm__Group__5"


    // $ANTLR start "rule__GSSFilterMaxterm__Group__5__Impl"
    // InternalFILTER.g:6729:1: rule__GSSFilterMaxterm__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSFilterMaxterm__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6733:1: ( ( ';' ) )
            // InternalFILTER.g:6734:1: ( ';' )
            {
            // InternalFILTER.g:6734:1: ( ';' )
            // InternalFILTER.g:6735:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermAccess().getSemicolonKeyword_5()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxterm__Group__5__Impl"


    // $ANTLR start "rule__GSSFilterMaxterm__Group__6"
    // InternalFILTER.g:6744:1: rule__GSSFilterMaxterm__Group__6 : rule__GSSFilterMaxterm__Group__6__Impl rule__GSSFilterMaxterm__Group__7 ;
    public final void rule__GSSFilterMaxterm__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6748:1: ( rule__GSSFilterMaxterm__Group__6__Impl rule__GSSFilterMaxterm__Group__7 )
            // InternalFILTER.g:6749:2: rule__GSSFilterMaxterm__Group__6__Impl rule__GSSFilterMaxterm__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSFilterMaxterm__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxterm__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxterm__Group__6"


    // $ANTLR start "rule__GSSFilterMaxterm__Group__6__Impl"
    // InternalFILTER.g:6756:1: rule__GSSFilterMaxterm__Group__6__Impl : ( ( ( rule__GSSFilterMaxterm__BoolVarRefAssignment_6 ) ) ( ( rule__GSSFilterMaxterm__BoolVarRefAssignment_6 )* ) ) ;
    public final void rule__GSSFilterMaxterm__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6760:1: ( ( ( ( rule__GSSFilterMaxterm__BoolVarRefAssignment_6 ) ) ( ( rule__GSSFilterMaxterm__BoolVarRefAssignment_6 )* ) ) )
            // InternalFILTER.g:6761:1: ( ( ( rule__GSSFilterMaxterm__BoolVarRefAssignment_6 ) ) ( ( rule__GSSFilterMaxterm__BoolVarRefAssignment_6 )* ) )
            {
            // InternalFILTER.g:6761:1: ( ( ( rule__GSSFilterMaxterm__BoolVarRefAssignment_6 ) ) ( ( rule__GSSFilterMaxterm__BoolVarRefAssignment_6 )* ) )
            // InternalFILTER.g:6762:2: ( ( rule__GSSFilterMaxterm__BoolVarRefAssignment_6 ) ) ( ( rule__GSSFilterMaxterm__BoolVarRefAssignment_6 )* )
            {
            // InternalFILTER.g:6762:2: ( ( rule__GSSFilterMaxterm__BoolVarRefAssignment_6 ) )
            // InternalFILTER.g:6763:3: ( rule__GSSFilterMaxterm__BoolVarRefAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermAccess().getBoolVarRefAssignment_6()); 
            }
            // InternalFILTER.g:6764:3: ( rule__GSSFilterMaxterm__BoolVarRefAssignment_6 )
            // InternalFILTER.g:6764:4: rule__GSSFilterMaxterm__BoolVarRefAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_43);
            rule__GSSFilterMaxterm__BoolVarRefAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermAccess().getBoolVarRefAssignment_6()); 
            }

            }

            // InternalFILTER.g:6767:2: ( ( rule__GSSFilterMaxterm__BoolVarRefAssignment_6 )* )
            // InternalFILTER.g:6768:3: ( rule__GSSFilterMaxterm__BoolVarRefAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermAccess().getBoolVarRefAssignment_6()); 
            }
            // InternalFILTER.g:6769:3: ( rule__GSSFilterMaxterm__BoolVarRefAssignment_6 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==61) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalFILTER.g:6769:4: rule__GSSFilterMaxterm__BoolVarRefAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_43);
            	    rule__GSSFilterMaxterm__BoolVarRefAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermAccess().getBoolVarRefAssignment_6()); 
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
    // $ANTLR end "rule__GSSFilterMaxterm__Group__6__Impl"


    // $ANTLR start "rule__GSSFilterMaxterm__Group__7"
    // InternalFILTER.g:6778:1: rule__GSSFilterMaxterm__Group__7 : rule__GSSFilterMaxterm__Group__7__Impl rule__GSSFilterMaxterm__Group__8 ;
    public final void rule__GSSFilterMaxterm__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6782:1: ( rule__GSSFilterMaxterm__Group__7__Impl rule__GSSFilterMaxterm__Group__8 )
            // InternalFILTER.g:6783:2: rule__GSSFilterMaxterm__Group__7__Impl rule__GSSFilterMaxterm__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterMaxterm__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxterm__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxterm__Group__7"


    // $ANTLR start "rule__GSSFilterMaxterm__Group__7__Impl"
    // InternalFILTER.g:6790:1: rule__GSSFilterMaxterm__Group__7__Impl : ( '}' ) ;
    public final void rule__GSSFilterMaxterm__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6794:1: ( ( '}' ) )
            // InternalFILTER.g:6795:1: ( '}' )
            {
            // InternalFILTER.g:6795:1: ( '}' )
            // InternalFILTER.g:6796:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermAccess().getRightCurlyBracketKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxterm__Group__7__Impl"


    // $ANTLR start "rule__GSSFilterMaxterm__Group__8"
    // InternalFILTER.g:6805:1: rule__GSSFilterMaxterm__Group__8 : rule__GSSFilterMaxterm__Group__8__Impl ;
    public final void rule__GSSFilterMaxterm__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6809:1: ( rule__GSSFilterMaxterm__Group__8__Impl )
            // InternalFILTER.g:6810:2: rule__GSSFilterMaxterm__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMaxterm__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxterm__Group__8"


    // $ANTLR start "rule__GSSFilterMaxterm__Group__8__Impl"
    // InternalFILTER.g:6816:1: rule__GSSFilterMaxterm__Group__8__Impl : ( ';' ) ;
    public final void rule__GSSFilterMaxterm__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6820:1: ( ( ';' ) )
            // InternalFILTER.g:6821:1: ( ';' )
            {
            // InternalFILTER.g:6821:1: ( ';' )
            // InternalFILTER.g:6822:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermAccess().getSemicolonKeyword_8()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermAccess().getSemicolonKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxterm__Group__8__Impl"


    // $ANTLR start "rule__GSSFilterMinterm__Group__0"
    // InternalFILTER.g:6832:1: rule__GSSFilterMinterm__Group__0 : rule__GSSFilterMinterm__Group__0__Impl rule__GSSFilterMinterm__Group__1 ;
    public final void rule__GSSFilterMinterm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6836:1: ( rule__GSSFilterMinterm__Group__0__Impl rule__GSSFilterMinterm__Group__1 )
            // InternalFILTER.g:6837:2: rule__GSSFilterMinterm__Group__0__Impl rule__GSSFilterMinterm__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSFilterMinterm__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMinterm__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMinterm__Group__0"


    // $ANTLR start "rule__GSSFilterMinterm__Group__0__Impl"
    // InternalFILTER.g:6844:1: rule__GSSFilterMinterm__Group__0__Impl : ( 'GSSFilterMinterm' ) ;
    public final void rule__GSSFilterMinterm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6848:1: ( ( 'GSSFilterMinterm' ) )
            // InternalFILTER.g:6849:1: ( 'GSSFilterMinterm' )
            {
            // InternalFILTER.g:6849:1: ( 'GSSFilterMinterm' )
            // InternalFILTER.g:6850:2: 'GSSFilterMinterm'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermAccess().getGSSFilterMintermKeyword_0()); 
            }
            match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermAccess().getGSSFilterMintermKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMinterm__Group__0__Impl"


    // $ANTLR start "rule__GSSFilterMinterm__Group__1"
    // InternalFILTER.g:6859:1: rule__GSSFilterMinterm__Group__1 : rule__GSSFilterMinterm__Group__1__Impl rule__GSSFilterMinterm__Group__2 ;
    public final void rule__GSSFilterMinterm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6863:1: ( rule__GSSFilterMinterm__Group__1__Impl rule__GSSFilterMinterm__Group__2 )
            // InternalFILTER.g:6864:2: rule__GSSFilterMinterm__Group__1__Impl rule__GSSFilterMinterm__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__GSSFilterMinterm__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMinterm__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMinterm__Group__1"


    // $ANTLR start "rule__GSSFilterMinterm__Group__1__Impl"
    // InternalFILTER.g:6871:1: rule__GSSFilterMinterm__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSFilterMinterm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6875:1: ( ( '{' ) )
            // InternalFILTER.g:6876:1: ( '{' )
            {
            // InternalFILTER.g:6876:1: ( '{' )
            // InternalFILTER.g:6877:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMinterm__Group__1__Impl"


    // $ANTLR start "rule__GSSFilterMinterm__Group__2"
    // InternalFILTER.g:6886:1: rule__GSSFilterMinterm__Group__2 : rule__GSSFilterMinterm__Group__2__Impl rule__GSSFilterMinterm__Group__3 ;
    public final void rule__GSSFilterMinterm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6890:1: ( rule__GSSFilterMinterm__Group__2__Impl rule__GSSFilterMinterm__Group__3 )
            // InternalFILTER.g:6891:2: rule__GSSFilterMinterm__Group__2__Impl rule__GSSFilterMinterm__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterMinterm__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMinterm__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMinterm__Group__2"


    // $ANTLR start "rule__GSSFilterMinterm__Group__2__Impl"
    // InternalFILTER.g:6898:1: rule__GSSFilterMinterm__Group__2__Impl : ( 'id' ) ;
    public final void rule__GSSFilterMinterm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6902:1: ( ( 'id' ) )
            // InternalFILTER.g:6903:1: ( 'id' )
            {
            // InternalFILTER.g:6903:1: ( 'id' )
            // InternalFILTER.g:6904:2: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermAccess().getIdKeyword_2()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermAccess().getIdKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMinterm__Group__2__Impl"


    // $ANTLR start "rule__GSSFilterMinterm__Group__3"
    // InternalFILTER.g:6913:1: rule__GSSFilterMinterm__Group__3 : rule__GSSFilterMinterm__Group__3__Impl rule__GSSFilterMinterm__Group__4 ;
    public final void rule__GSSFilterMinterm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6917:1: ( rule__GSSFilterMinterm__Group__3__Impl rule__GSSFilterMinterm__Group__4 )
            // InternalFILTER.g:6918:2: rule__GSSFilterMinterm__Group__3__Impl rule__GSSFilterMinterm__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__GSSFilterMinterm__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMinterm__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMinterm__Group__3"


    // $ANTLR start "rule__GSSFilterMinterm__Group__3__Impl"
    // InternalFILTER.g:6925:1: rule__GSSFilterMinterm__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSFilterMinterm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6929:1: ( ( ':=' ) )
            // InternalFILTER.g:6930:1: ( ':=' )
            {
            // InternalFILTER.g:6930:1: ( ':=' )
            // InternalFILTER.g:6931:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMinterm__Group__3__Impl"


    // $ANTLR start "rule__GSSFilterMinterm__Group__4"
    // InternalFILTER.g:6940:1: rule__GSSFilterMinterm__Group__4 : rule__GSSFilterMinterm__Group__4__Impl rule__GSSFilterMinterm__Group__5 ;
    public final void rule__GSSFilterMinterm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6944:1: ( rule__GSSFilterMinterm__Group__4__Impl rule__GSSFilterMinterm__Group__5 )
            // InternalFILTER.g:6945:2: rule__GSSFilterMinterm__Group__4__Impl rule__GSSFilterMinterm__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterMinterm__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMinterm__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMinterm__Group__4"


    // $ANTLR start "rule__GSSFilterMinterm__Group__4__Impl"
    // InternalFILTER.g:6952:1: rule__GSSFilterMinterm__Group__4__Impl : ( ( rule__GSSFilterMinterm__IdAssignment_4 ) ) ;
    public final void rule__GSSFilterMinterm__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6956:1: ( ( ( rule__GSSFilterMinterm__IdAssignment_4 ) ) )
            // InternalFILTER.g:6957:1: ( ( rule__GSSFilterMinterm__IdAssignment_4 ) )
            {
            // InternalFILTER.g:6957:1: ( ( rule__GSSFilterMinterm__IdAssignment_4 ) )
            // InternalFILTER.g:6958:2: ( rule__GSSFilterMinterm__IdAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermAccess().getIdAssignment_4()); 
            }
            // InternalFILTER.g:6959:2: ( rule__GSSFilterMinterm__IdAssignment_4 )
            // InternalFILTER.g:6959:3: rule__GSSFilterMinterm__IdAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMinterm__IdAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermAccess().getIdAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMinterm__Group__4__Impl"


    // $ANTLR start "rule__GSSFilterMinterm__Group__5"
    // InternalFILTER.g:6967:1: rule__GSSFilterMinterm__Group__5 : rule__GSSFilterMinterm__Group__5__Impl rule__GSSFilterMinterm__Group__6 ;
    public final void rule__GSSFilterMinterm__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6971:1: ( rule__GSSFilterMinterm__Group__5__Impl rule__GSSFilterMinterm__Group__6 )
            // InternalFILTER.g:6972:2: rule__GSSFilterMinterm__Group__5__Impl rule__GSSFilterMinterm__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__GSSFilterMinterm__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMinterm__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMinterm__Group__5"


    // $ANTLR start "rule__GSSFilterMinterm__Group__5__Impl"
    // InternalFILTER.g:6979:1: rule__GSSFilterMinterm__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSFilterMinterm__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6983:1: ( ( ';' ) )
            // InternalFILTER.g:6984:1: ( ';' )
            {
            // InternalFILTER.g:6984:1: ( ';' )
            // InternalFILTER.g:6985:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermAccess().getSemicolonKeyword_5()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMinterm__Group__5__Impl"


    // $ANTLR start "rule__GSSFilterMinterm__Group__6"
    // InternalFILTER.g:6994:1: rule__GSSFilterMinterm__Group__6 : rule__GSSFilterMinterm__Group__6__Impl rule__GSSFilterMinterm__Group__7 ;
    public final void rule__GSSFilterMinterm__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6998:1: ( rule__GSSFilterMinterm__Group__6__Impl rule__GSSFilterMinterm__Group__7 )
            // InternalFILTER.g:6999:2: rule__GSSFilterMinterm__Group__6__Impl rule__GSSFilterMinterm__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSFilterMinterm__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMinterm__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMinterm__Group__6"


    // $ANTLR start "rule__GSSFilterMinterm__Group__6__Impl"
    // InternalFILTER.g:7006:1: rule__GSSFilterMinterm__Group__6__Impl : ( ( ( rule__GSSFilterMinterm__BoolVarRefAssignment_6 ) ) ( ( rule__GSSFilterMinterm__BoolVarRefAssignment_6 )* ) ) ;
    public final void rule__GSSFilterMinterm__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7010:1: ( ( ( ( rule__GSSFilterMinterm__BoolVarRefAssignment_6 ) ) ( ( rule__GSSFilterMinterm__BoolVarRefAssignment_6 )* ) ) )
            // InternalFILTER.g:7011:1: ( ( ( rule__GSSFilterMinterm__BoolVarRefAssignment_6 ) ) ( ( rule__GSSFilterMinterm__BoolVarRefAssignment_6 )* ) )
            {
            // InternalFILTER.g:7011:1: ( ( ( rule__GSSFilterMinterm__BoolVarRefAssignment_6 ) ) ( ( rule__GSSFilterMinterm__BoolVarRefAssignment_6 )* ) )
            // InternalFILTER.g:7012:2: ( ( rule__GSSFilterMinterm__BoolVarRefAssignment_6 ) ) ( ( rule__GSSFilterMinterm__BoolVarRefAssignment_6 )* )
            {
            // InternalFILTER.g:7012:2: ( ( rule__GSSFilterMinterm__BoolVarRefAssignment_6 ) )
            // InternalFILTER.g:7013:3: ( rule__GSSFilterMinterm__BoolVarRefAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermAccess().getBoolVarRefAssignment_6()); 
            }
            // InternalFILTER.g:7014:3: ( rule__GSSFilterMinterm__BoolVarRefAssignment_6 )
            // InternalFILTER.g:7014:4: rule__GSSFilterMinterm__BoolVarRefAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_43);
            rule__GSSFilterMinterm__BoolVarRefAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermAccess().getBoolVarRefAssignment_6()); 
            }

            }

            // InternalFILTER.g:7017:2: ( ( rule__GSSFilterMinterm__BoolVarRefAssignment_6 )* )
            // InternalFILTER.g:7018:3: ( rule__GSSFilterMinterm__BoolVarRefAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermAccess().getBoolVarRefAssignment_6()); 
            }
            // InternalFILTER.g:7019:3: ( rule__GSSFilterMinterm__BoolVarRefAssignment_6 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==61) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalFILTER.g:7019:4: rule__GSSFilterMinterm__BoolVarRefAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_43);
            	    rule__GSSFilterMinterm__BoolVarRefAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermAccess().getBoolVarRefAssignment_6()); 
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
    // $ANTLR end "rule__GSSFilterMinterm__Group__6__Impl"


    // $ANTLR start "rule__GSSFilterMinterm__Group__7"
    // InternalFILTER.g:7028:1: rule__GSSFilterMinterm__Group__7 : rule__GSSFilterMinterm__Group__7__Impl rule__GSSFilterMinterm__Group__8 ;
    public final void rule__GSSFilterMinterm__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7032:1: ( rule__GSSFilterMinterm__Group__7__Impl rule__GSSFilterMinterm__Group__8 )
            // InternalFILTER.g:7033:2: rule__GSSFilterMinterm__Group__7__Impl rule__GSSFilterMinterm__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterMinterm__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMinterm__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMinterm__Group__7"


    // $ANTLR start "rule__GSSFilterMinterm__Group__7__Impl"
    // InternalFILTER.g:7040:1: rule__GSSFilterMinterm__Group__7__Impl : ( '}' ) ;
    public final void rule__GSSFilterMinterm__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7044:1: ( ( '}' ) )
            // InternalFILTER.g:7045:1: ( '}' )
            {
            // InternalFILTER.g:7045:1: ( '}' )
            // InternalFILTER.g:7046:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermAccess().getRightCurlyBracketKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMinterm__Group__7__Impl"


    // $ANTLR start "rule__GSSFilterMinterm__Group__8"
    // InternalFILTER.g:7055:1: rule__GSSFilterMinterm__Group__8 : rule__GSSFilterMinterm__Group__8__Impl ;
    public final void rule__GSSFilterMinterm__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7059:1: ( rule__GSSFilterMinterm__Group__8__Impl )
            // InternalFILTER.g:7060:2: rule__GSSFilterMinterm__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterMinterm__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMinterm__Group__8"


    // $ANTLR start "rule__GSSFilterMinterm__Group__8__Impl"
    // InternalFILTER.g:7066:1: rule__GSSFilterMinterm__Group__8__Impl : ( ';' ) ;
    public final void rule__GSSFilterMinterm__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7070:1: ( ( ';' ) )
            // InternalFILTER.g:7071:1: ( ';' )
            {
            // InternalFILTER.g:7071:1: ( ';' )
            // InternalFILTER.g:7072:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermAccess().getSemicolonKeyword_8()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermAccess().getSemicolonKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMinterm__Group__8__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarRef__Group__0"
    // InternalFILTER.g:7082:1: rule__GSSFilterBoolVarRef__Group__0 : rule__GSSFilterBoolVarRef__Group__0__Impl rule__GSSFilterBoolVarRef__Group__1 ;
    public final void rule__GSSFilterBoolVarRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7086:1: ( rule__GSSFilterBoolVarRef__Group__0__Impl rule__GSSFilterBoolVarRef__Group__1 )
            // InternalFILTER.g:7087:2: rule__GSSFilterBoolVarRef__Group__0__Impl rule__GSSFilterBoolVarRef__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSFilterBoolVarRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarRef__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarRef__Group__0"


    // $ANTLR start "rule__GSSFilterBoolVarRef__Group__0__Impl"
    // InternalFILTER.g:7094:1: rule__GSSFilterBoolVarRef__Group__0__Impl : ( 'GSSFilterBoolVarRef' ) ;
    public final void rule__GSSFilterBoolVarRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7098:1: ( ( 'GSSFilterBoolVarRef' ) )
            // InternalFILTER.g:7099:1: ( 'GSSFilterBoolVarRef' )
            {
            // InternalFILTER.g:7099:1: ( 'GSSFilterBoolVarRef' )
            // InternalFILTER.g:7100:2: 'GSSFilterBoolVarRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarRefAccess().getGSSFilterBoolVarRefKeyword_0()); 
            }
            match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarRefAccess().getGSSFilterBoolVarRefKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarRef__Group__0__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarRef__Group__1"
    // InternalFILTER.g:7109:1: rule__GSSFilterBoolVarRef__Group__1 : rule__GSSFilterBoolVarRef__Group__1__Impl rule__GSSFilterBoolVarRef__Group__2 ;
    public final void rule__GSSFilterBoolVarRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7113:1: ( rule__GSSFilterBoolVarRef__Group__1__Impl rule__GSSFilterBoolVarRef__Group__2 )
            // InternalFILTER.g:7114:2: rule__GSSFilterBoolVarRef__Group__1__Impl rule__GSSFilterBoolVarRef__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_44);
            rule__GSSFilterBoolVarRef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarRef__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarRef__Group__1"


    // $ANTLR start "rule__GSSFilterBoolVarRef__Group__1__Impl"
    // InternalFILTER.g:7121:1: rule__GSSFilterBoolVarRef__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSFilterBoolVarRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7125:1: ( ( '{' ) )
            // InternalFILTER.g:7126:1: ( '{' )
            {
            // InternalFILTER.g:7126:1: ( '{' )
            // InternalFILTER.g:7127:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarRefAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarRefAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarRef__Group__1__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarRef__Group__2"
    // InternalFILTER.g:7136:1: rule__GSSFilterBoolVarRef__Group__2 : rule__GSSFilterBoolVarRef__Group__2__Impl rule__GSSFilterBoolVarRef__Group__3 ;
    public final void rule__GSSFilterBoolVarRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7140:1: ( rule__GSSFilterBoolVarRef__Group__2__Impl rule__GSSFilterBoolVarRef__Group__3 )
            // InternalFILTER.g:7141:2: rule__GSSFilterBoolVarRef__Group__2__Impl rule__GSSFilterBoolVarRef__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSFilterBoolVarRef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarRef__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarRef__Group__2"


    // $ANTLR start "rule__GSSFilterBoolVarRef__Group__2__Impl"
    // InternalFILTER.g:7148:1: rule__GSSFilterBoolVarRef__Group__2__Impl : ( 'idRef' ) ;
    public final void rule__GSSFilterBoolVarRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7152:1: ( ( 'idRef' ) )
            // InternalFILTER.g:7153:1: ( 'idRef' )
            {
            // InternalFILTER.g:7153:1: ( 'idRef' )
            // InternalFILTER.g:7154:2: 'idRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarRefAccess().getIdRefKeyword_2()); 
            }
            match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarRefAccess().getIdRefKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarRef__Group__2__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarRef__Group__3"
    // InternalFILTER.g:7163:1: rule__GSSFilterBoolVarRef__Group__3 : rule__GSSFilterBoolVarRef__Group__3__Impl rule__GSSFilterBoolVarRef__Group__4 ;
    public final void rule__GSSFilterBoolVarRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7167:1: ( rule__GSSFilterBoolVarRef__Group__3__Impl rule__GSSFilterBoolVarRef__Group__4 )
            // InternalFILTER.g:7168:2: rule__GSSFilterBoolVarRef__Group__3__Impl rule__GSSFilterBoolVarRef__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__GSSFilterBoolVarRef__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarRef__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarRef__Group__3"


    // $ANTLR start "rule__GSSFilterBoolVarRef__Group__3__Impl"
    // InternalFILTER.g:7175:1: rule__GSSFilterBoolVarRef__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSFilterBoolVarRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7179:1: ( ( ':=' ) )
            // InternalFILTER.g:7180:1: ( ':=' )
            {
            // InternalFILTER.g:7180:1: ( ':=' )
            // InternalFILTER.g:7181:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarRefAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarRefAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarRef__Group__3__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarRef__Group__4"
    // InternalFILTER.g:7190:1: rule__GSSFilterBoolVarRef__Group__4 : rule__GSSFilterBoolVarRef__Group__4__Impl rule__GSSFilterBoolVarRef__Group__5 ;
    public final void rule__GSSFilterBoolVarRef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7194:1: ( rule__GSSFilterBoolVarRef__Group__4__Impl rule__GSSFilterBoolVarRef__Group__5 )
            // InternalFILTER.g:7195:2: rule__GSSFilterBoolVarRef__Group__4__Impl rule__GSSFilterBoolVarRef__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterBoolVarRef__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarRef__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarRef__Group__4"


    // $ANTLR start "rule__GSSFilterBoolVarRef__Group__4__Impl"
    // InternalFILTER.g:7202:1: rule__GSSFilterBoolVarRef__Group__4__Impl : ( ( rule__GSSFilterBoolVarRef__IdRefAssignment_4 ) ) ;
    public final void rule__GSSFilterBoolVarRef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7206:1: ( ( ( rule__GSSFilterBoolVarRef__IdRefAssignment_4 ) ) )
            // InternalFILTER.g:7207:1: ( ( rule__GSSFilterBoolVarRef__IdRefAssignment_4 ) )
            {
            // InternalFILTER.g:7207:1: ( ( rule__GSSFilterBoolVarRef__IdRefAssignment_4 ) )
            // InternalFILTER.g:7208:2: ( rule__GSSFilterBoolVarRef__IdRefAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarRefAccess().getIdRefAssignment_4()); 
            }
            // InternalFILTER.g:7209:2: ( rule__GSSFilterBoolVarRef__IdRefAssignment_4 )
            // InternalFILTER.g:7209:3: rule__GSSFilterBoolVarRef__IdRefAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarRef__IdRefAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarRefAccess().getIdRefAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarRef__Group__4__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarRef__Group__5"
    // InternalFILTER.g:7217:1: rule__GSSFilterBoolVarRef__Group__5 : rule__GSSFilterBoolVarRef__Group__5__Impl rule__GSSFilterBoolVarRef__Group__6 ;
    public final void rule__GSSFilterBoolVarRef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7221:1: ( rule__GSSFilterBoolVarRef__Group__5__Impl rule__GSSFilterBoolVarRef__Group__6 )
            // InternalFILTER.g:7222:2: rule__GSSFilterBoolVarRef__Group__5__Impl rule__GSSFilterBoolVarRef__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSFilterBoolVarRef__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarRef__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarRef__Group__5"


    // $ANTLR start "rule__GSSFilterBoolVarRef__Group__5__Impl"
    // InternalFILTER.g:7229:1: rule__GSSFilterBoolVarRef__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSFilterBoolVarRef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7233:1: ( ( ';' ) )
            // InternalFILTER.g:7234:1: ( ';' )
            {
            // InternalFILTER.g:7234:1: ( ';' )
            // InternalFILTER.g:7235:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarRefAccess().getSemicolonKeyword_5()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarRefAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarRef__Group__5__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarRef__Group__6"
    // InternalFILTER.g:7244:1: rule__GSSFilterBoolVarRef__Group__6 : rule__GSSFilterBoolVarRef__Group__6__Impl rule__GSSFilterBoolVarRef__Group__7 ;
    public final void rule__GSSFilterBoolVarRef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7248:1: ( rule__GSSFilterBoolVarRef__Group__6__Impl rule__GSSFilterBoolVarRef__Group__7 )
            // InternalFILTER.g:7249:2: rule__GSSFilterBoolVarRef__Group__6__Impl rule__GSSFilterBoolVarRef__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSFilterBoolVarRef__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarRef__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarRef__Group__6"


    // $ANTLR start "rule__GSSFilterBoolVarRef__Group__6__Impl"
    // InternalFILTER.g:7256:1: rule__GSSFilterBoolVarRef__Group__6__Impl : ( '}' ) ;
    public final void rule__GSSFilterBoolVarRef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7260:1: ( ( '}' ) )
            // InternalFILTER.g:7261:1: ( '}' )
            {
            // InternalFILTER.g:7261:1: ( '}' )
            // InternalFILTER.g:7262:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarRefAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarRefAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarRef__Group__6__Impl"


    // $ANTLR start "rule__GSSFilterBoolVarRef__Group__7"
    // InternalFILTER.g:7271:1: rule__GSSFilterBoolVarRef__Group__7 : rule__GSSFilterBoolVarRef__Group__7__Impl ;
    public final void rule__GSSFilterBoolVarRef__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7275:1: ( rule__GSSFilterBoolVarRef__Group__7__Impl )
            // InternalFILTER.g:7276:2: rule__GSSFilterBoolVarRef__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSFilterBoolVarRef__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarRef__Group__7"


    // $ANTLR start "rule__GSSFilterBoolVarRef__Group__7__Impl"
    // InternalFILTER.g:7282:1: rule__GSSFilterBoolVarRef__Group__7__Impl : ( ';' ) ;
    public final void rule__GSSFilterBoolVarRef__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7286:1: ( ( ';' ) )
            // InternalFILTER.g:7287:1: ( ';' )
            {
            // InternalFILTER.g:7287:1: ( ';' )
            // InternalFILTER.g:7288:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarRefAccess().getSemicolonKeyword_7()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarRefAccess().getSemicolonKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarRef__Group__7__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalFILTER.g:7298:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7302:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalFILTER.g:7303:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_45);
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
    // InternalFILTER.g:7310:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7314:1: ( ( RULE_ID ) )
            // InternalFILTER.g:7315:1: ( RULE_ID )
            {
            // InternalFILTER.g:7315:1: ( RULE_ID )
            // InternalFILTER.g:7316:2: RULE_ID
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
    // InternalFILTER.g:7325:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7329:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalFILTER.g:7330:2: rule__QualifiedName__Group__1__Impl
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
    // InternalFILTER.g:7336:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7340:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalFILTER.g:7341:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalFILTER.g:7341:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalFILTER.g:7342:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalFILTER.g:7343:2: ( rule__QualifiedName__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==63) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalFILTER.g:7343:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_46);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalFILTER.g:7352:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7356:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalFILTER.g:7357:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalFILTER.g:7364:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7368:1: ( ( '.' ) )
            // InternalFILTER.g:7369:1: ( '.' )
            {
            // InternalFILTER.g:7369:1: ( '.' )
            // InternalFILTER.g:7370:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalFILTER.g:7379:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7383:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalFILTER.g:7384:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalFILTER.g:7390:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7394:1: ( ( RULE_ID ) )
            // InternalFILTER.g:7395:1: ( RULE_ID )
            {
            // InternalFILTER.g:7395:1: ( RULE_ID )
            // InternalFILTER.g:7396:2: RULE_ID
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
    // InternalFILTER.g:7406:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7410:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalFILTER.g:7411:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_45);
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
    // InternalFILTER.g:7418:1: rule__Version__Group__0__Impl : ( ( rule__Version__Alternatives_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7422:1: ( ( ( rule__Version__Alternatives_0 ) ) )
            // InternalFILTER.g:7423:1: ( ( rule__Version__Alternatives_0 ) )
            {
            // InternalFILTER.g:7423:1: ( ( rule__Version__Alternatives_0 ) )
            // InternalFILTER.g:7424:2: ( rule__Version__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_0()); 
            }
            // InternalFILTER.g:7425:2: ( rule__Version__Alternatives_0 )
            // InternalFILTER.g:7425:3: rule__Version__Alternatives_0
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
    // InternalFILTER.g:7433:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7437:1: ( rule__Version__Group__1__Impl )
            // InternalFILTER.g:7438:2: rule__Version__Group__1__Impl
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
    // InternalFILTER.g:7444:1: rule__Version__Group__1__Impl : ( ( rule__Version__Group_1__0 )* ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7448:1: ( ( ( rule__Version__Group_1__0 )* ) )
            // InternalFILTER.g:7449:1: ( ( rule__Version__Group_1__0 )* )
            {
            // InternalFILTER.g:7449:1: ( ( rule__Version__Group_1__0 )* )
            // InternalFILTER.g:7450:2: ( rule__Version__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1()); 
            }
            // InternalFILTER.g:7451:2: ( rule__Version__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==63) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalFILTER.g:7451:3: rule__Version__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_46);
            	    rule__Version__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalFILTER.g:7460:1: rule__Version__Group_0_1__0 : rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 ;
    public final void rule__Version__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7464:1: ( rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 )
            // InternalFILTER.g:7465:2: rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalFILTER.g:7472:1: rule__Version__Group_0_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7476:1: ( ( ( RULE_INT )? ) )
            // InternalFILTER.g:7477:1: ( ( RULE_INT )? )
            {
            // InternalFILTER.g:7477:1: ( ( RULE_INT )? )
            // InternalFILTER.g:7478:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
            }
            // InternalFILTER.g:7479:2: ( RULE_INT )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_INT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalFILTER.g:7479:3: RULE_INT
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
    // InternalFILTER.g:7487:1: rule__Version__Group_0_1__1 : rule__Version__Group_0_1__1__Impl ;
    public final void rule__Version__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7491:1: ( rule__Version__Group_0_1__1__Impl )
            // InternalFILTER.g:7492:2: rule__Version__Group_0_1__1__Impl
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
    // InternalFILTER.g:7498:1: rule__Version__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7502:1: ( ( RULE_ID ) )
            // InternalFILTER.g:7503:1: ( RULE_ID )
            {
            // InternalFILTER.g:7503:1: ( RULE_ID )
            // InternalFILTER.g:7504:2: RULE_ID
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
    // InternalFILTER.g:7514:1: rule__Version__Group_1__0 : rule__Version__Group_1__0__Impl rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7518:1: ( rule__Version__Group_1__0__Impl rule__Version__Group_1__1 )
            // InternalFILTER.g:7519:2: rule__Version__Group_1__0__Impl rule__Version__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalFILTER.g:7526:1: rule__Version__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7530:1: ( ( '.' ) )
            // InternalFILTER.g:7531:1: ( '.' )
            {
            // InternalFILTER.g:7531:1: ( '.' )
            // InternalFILTER.g:7532:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            }
            match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalFILTER.g:7541:1: rule__Version__Group_1__1 : rule__Version__Group_1__1__Impl ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7545:1: ( rule__Version__Group_1__1__Impl )
            // InternalFILTER.g:7546:2: rule__Version__Group_1__1__Impl
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
    // InternalFILTER.g:7552:1: rule__Version__Group_1__1__Impl : ( ( rule__Version__Alternatives_1_1 ) ) ;
    public final void rule__Version__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7556:1: ( ( ( rule__Version__Alternatives_1_1 ) ) )
            // InternalFILTER.g:7557:1: ( ( rule__Version__Alternatives_1_1 ) )
            {
            // InternalFILTER.g:7557:1: ( ( rule__Version__Alternatives_1_1 ) )
            // InternalFILTER.g:7558:2: ( rule__Version__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_1_1()); 
            }
            // InternalFILTER.g:7559:2: ( rule__Version__Alternatives_1_1 )
            // InternalFILTER.g:7559:3: rule__Version__Alternatives_1_1
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
    // InternalFILTER.g:7568:1: rule__Version__Group_1_1_1__0 : rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 ;
    public final void rule__Version__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7572:1: ( rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 )
            // InternalFILTER.g:7573:2: rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalFILTER.g:7580:1: rule__Version__Group_1_1_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7584:1: ( ( ( RULE_INT )? ) )
            // InternalFILTER.g:7585:1: ( ( RULE_INT )? )
            {
            // InternalFILTER.g:7585:1: ( ( RULE_INT )? )
            // InternalFILTER.g:7586:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
            }
            // InternalFILTER.g:7587:2: ( RULE_INT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalFILTER.g:7587:3: RULE_INT
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
    // InternalFILTER.g:7595:1: rule__Version__Group_1_1_1__1 : rule__Version__Group_1_1_1__1__Impl ;
    public final void rule__Version__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7599:1: ( rule__Version__Group_1_1_1__1__Impl )
            // InternalFILTER.g:7600:2: rule__Version__Group_1_1_1__1__Impl
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
    // InternalFILTER.g:7606:1: rule__Version__Group_1_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7610:1: ( ( RULE_ID ) )
            // InternalFILTER.g:7611:1: ( RULE_ID )
            {
            // InternalFILTER.g:7611:1: ( RULE_ID )
            // InternalFILTER.g:7612:2: RULE_ID
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
    // InternalFILTER.g:7622:1: rule__VersionedQualifiedName__Group__0 : rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 ;
    public final void rule__VersionedQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7626:1: ( rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 )
            // InternalFILTER.g:7627:2: rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_47);
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
    // InternalFILTER.g:7634:1: rule__VersionedQualifiedName__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__VersionedQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7638:1: ( ( ruleQualifiedName ) )
            // InternalFILTER.g:7639:1: ( ruleQualifiedName )
            {
            // InternalFILTER.g:7639:1: ( ruleQualifiedName )
            // InternalFILTER.g:7640:2: ruleQualifiedName
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
    // InternalFILTER.g:7649:1: rule__VersionedQualifiedName__Group__1 : rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 ;
    public final void rule__VersionedQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7653:1: ( rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 )
            // InternalFILTER.g:7654:2: rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalFILTER.g:7661:1: rule__VersionedQualifiedName__Group__1__Impl : ( '(' ) ;
    public final void rule__VersionedQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7665:1: ( ( '(' ) )
            // InternalFILTER.g:7666:1: ( '(' )
            {
            // InternalFILTER.g:7666:1: ( '(' )
            // InternalFILTER.g:7667:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalFILTER.g:7676:1: rule__VersionedQualifiedName__Group__2 : rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 ;
    public final void rule__VersionedQualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7680:1: ( rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 )
            // InternalFILTER.g:7681:2: rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_48);
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
    // InternalFILTER.g:7688:1: rule__VersionedQualifiedName__Group__2__Impl : ( ruleVersion ) ;
    public final void rule__VersionedQualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7692:1: ( ( ruleVersion ) )
            // InternalFILTER.g:7693:1: ( ruleVersion )
            {
            // InternalFILTER.g:7693:1: ( ruleVersion )
            // InternalFILTER.g:7694:2: ruleVersion
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
    // InternalFILTER.g:7703:1: rule__VersionedQualifiedName__Group__3 : rule__VersionedQualifiedName__Group__3__Impl ;
    public final void rule__VersionedQualifiedName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7707:1: ( rule__VersionedQualifiedName__Group__3__Impl )
            // InternalFILTER.g:7708:2: rule__VersionedQualifiedName__Group__3__Impl
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
    // InternalFILTER.g:7714:1: rule__VersionedQualifiedName__Group__3__Impl : ( ')' ) ;
    public final void rule__VersionedQualifiedName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7718:1: ( ( ')' ) )
            // InternalFILTER.g:7719:1: ( ')' )
            {
            // InternalFILTER.g:7719:1: ( ')' )
            // InternalFILTER.g:7720:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group__0"
    // InternalFILTER.g:7730:1: rule__VersionedQualifiedReferenceName__Group__0 : rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7734:1: ( rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1 )
            // InternalFILTER.g:7735:2: rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__VersionedQualifiedReferenceName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VersionedQualifiedReferenceName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group__0"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group__0__Impl"
    // InternalFILTER.g:7742:1: rule__VersionedQualifiedReferenceName__Group__0__Impl : ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7746:1: ( ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? ) )
            // InternalFILTER.g:7747:1: ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? )
            {
            // InternalFILTER.g:7747:1: ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? )
            // InternalFILTER.g:7748:2: ( rule__VersionedQualifiedReferenceName__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_0()); 
            }
            // InternalFILTER.g:7749:2: ( rule__VersionedQualifiedReferenceName__Group_0__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                int LA30_1 = input.LA(2);

                if ( ((LA30_1>=63 && LA30_1<=64)) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // InternalFILTER.g:7749:3: rule__VersionedQualifiedReferenceName__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__VersionedQualifiedReferenceName__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group__0__Impl"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group__1"
    // InternalFILTER.g:7757:1: rule__VersionedQualifiedReferenceName__Group__1 : rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2 ;
    public final void rule__VersionedQualifiedReferenceName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7761:1: ( rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2 )
            // InternalFILTER.g:7762:2: rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_49);
            rule__VersionedQualifiedReferenceName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VersionedQualifiedReferenceName__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group__1"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group__1__Impl"
    // InternalFILTER.g:7769:1: rule__VersionedQualifiedReferenceName__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7773:1: ( ( RULE_ID ) )
            // InternalFILTER.g:7774:1: ( RULE_ID )
            {
            // InternalFILTER.g:7774:1: ( RULE_ID )
            // InternalFILTER.g:7775:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group__1__Impl"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group__2"
    // InternalFILTER.g:7784:1: rule__VersionedQualifiedReferenceName__Group__2 : rule__VersionedQualifiedReferenceName__Group__2__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7788:1: ( rule__VersionedQualifiedReferenceName__Group__2__Impl )
            // InternalFILTER.g:7789:2: rule__VersionedQualifiedReferenceName__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VersionedQualifiedReferenceName__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group__2"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group__2__Impl"
    // InternalFILTER.g:7795:1: rule__VersionedQualifiedReferenceName__Group__2__Impl : ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7799:1: ( ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* ) )
            // InternalFILTER.g:7800:1: ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* )
            {
            // InternalFILTER.g:7800:1: ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* )
            // InternalFILTER.g:7801:2: ( rule__VersionedQualifiedReferenceName__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_2()); 
            }
            // InternalFILTER.g:7802:2: ( rule__VersionedQualifiedReferenceName__Group_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==66) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalFILTER.g:7802:3: rule__VersionedQualifiedReferenceName__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_50);
            	    rule__VersionedQualifiedReferenceName__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group__2__Impl"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group_0__0"
    // InternalFILTER.g:7811:1: rule__VersionedQualifiedReferenceName__Group_0__0 : rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7815:1: ( rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1 )
            // InternalFILTER.g:7816:2: rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_49);
            rule__VersionedQualifiedReferenceName__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VersionedQualifiedReferenceName__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group_0__0"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group_0__0__Impl"
    // InternalFILTER.g:7823:1: rule__VersionedQualifiedReferenceName__Group_0__0__Impl : ( ruleVersionedQualifiedName ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7827:1: ( ( ruleVersionedQualifiedName ) )
            // InternalFILTER.g:7828:1: ( ruleVersionedQualifiedName )
            {
            // InternalFILTER.g:7828:1: ( ruleVersionedQualifiedName )
            // InternalFILTER.g:7829:2: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group_0__0__Impl"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group_0__1"
    // InternalFILTER.g:7838:1: rule__VersionedQualifiedReferenceName__Group_0__1 : rule__VersionedQualifiedReferenceName__Group_0__1__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7842:1: ( rule__VersionedQualifiedReferenceName__Group_0__1__Impl )
            // InternalFILTER.g:7843:2: rule__VersionedQualifiedReferenceName__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VersionedQualifiedReferenceName__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group_0__1"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group_0__1__Impl"
    // InternalFILTER.g:7849:1: rule__VersionedQualifiedReferenceName__Group_0__1__Impl : ( '::' ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7853:1: ( ( '::' ) )
            // InternalFILTER.g:7854:1: ( '::' )
            {
            // InternalFILTER.g:7854:1: ( '::' )
            // InternalFILTER.g:7855:2: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1()); 
            }
            match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group_0__1__Impl"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group_2__0"
    // InternalFILTER.g:7865:1: rule__VersionedQualifiedReferenceName__Group_2__0 : rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7869:1: ( rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1 )
            // InternalFILTER.g:7870:2: rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__VersionedQualifiedReferenceName__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VersionedQualifiedReferenceName__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group_2__0"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group_2__0__Impl"
    // InternalFILTER.g:7877:1: rule__VersionedQualifiedReferenceName__Group_2__0__Impl : ( '::' ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7881:1: ( ( '::' ) )
            // InternalFILTER.g:7882:1: ( '::' )
            {
            // InternalFILTER.g:7882:1: ( '::' )
            // InternalFILTER.g:7883:2: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0()); 
            }
            match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group_2__0__Impl"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group_2__1"
    // InternalFILTER.g:7892:1: rule__VersionedQualifiedReferenceName__Group_2__1 : rule__VersionedQualifiedReferenceName__Group_2__1__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7896:1: ( rule__VersionedQualifiedReferenceName__Group_2__1__Impl )
            // InternalFILTER.g:7897:2: rule__VersionedQualifiedReferenceName__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VersionedQualifiedReferenceName__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group_2__1"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group_2__1__Impl"
    // InternalFILTER.g:7903:1: rule__VersionedQualifiedReferenceName__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7907:1: ( ( RULE_ID ) )
            // InternalFILTER.g:7908:1: ( RULE_ID )
            {
            // InternalFILTER.g:7908:1: ( RULE_ID )
            // InternalFILTER.g:7909:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group_2__1__Impl"


    // $ANTLR start "rule__INTEGER__Group_0__0"
    // InternalFILTER.g:7919:1: rule__INTEGER__Group_0__0 : rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 ;
    public final void rule__INTEGER__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7923:1: ( rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 )
            // InternalFILTER.g:7924:2: rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_51);
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
    // InternalFILTER.g:7931:1: rule__INTEGER__Group_0__0__Impl : ( ( '-' )? ) ;
    public final void rule__INTEGER__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7935:1: ( ( ( '-' )? ) )
            // InternalFILTER.g:7936:1: ( ( '-' )? )
            {
            // InternalFILTER.g:7936:1: ( ( '-' )? )
            // InternalFILTER.g:7937:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); 
            }
            // InternalFILTER.g:7938:2: ( '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==67) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalFILTER.g:7938:3: '-'
                    {
                    match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalFILTER.g:7946:1: rule__INTEGER__Group_0__1 : rule__INTEGER__Group_0__1__Impl ;
    public final void rule__INTEGER__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7950:1: ( rule__INTEGER__Group_0__1__Impl )
            // InternalFILTER.g:7951:2: rule__INTEGER__Group_0__1__Impl
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
    // InternalFILTER.g:7957:1: rule__INTEGER__Group_0__1__Impl : ( RULE_INT ) ;
    public final void rule__INTEGER__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7961:1: ( ( RULE_INT ) )
            // InternalFILTER.g:7962:1: ( RULE_INT )
            {
            // InternalFILTER.g:7962:1: ( RULE_INT )
            // InternalFILTER.g:7963:2: RULE_INT
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


    // $ANTLR start "rule__GSSModelFile__ImportsAssignment_0"
    // InternalFILTER.g:7973:1: rule__GSSModelFile__ImportsAssignment_0 : ( ruleGSSModelFileImport ) ;
    public final void rule__GSSModelFile__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7977:1: ( ( ruleGSSModelFileImport ) )
            // InternalFILTER.g:7978:2: ( ruleGSSModelFileImport )
            {
            // InternalFILTER.g:7978:2: ( ruleGSSModelFileImport )
            // InternalFILTER.g:7979:3: ruleGSSModelFileImport
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
    // InternalFILTER.g:7988:1: rule__GSSModelFile__ElementAssignment_1 : ( ruleGSSFilterFilter ) ;
    public final void rule__GSSModelFile__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7992:1: ( ( ruleGSSFilterFilter ) )
            // InternalFILTER.g:7993:2: ( ruleGSSFilterFilter )
            {
            // InternalFILTER.g:7993:2: ( ruleGSSFilterFilter )
            // InternalFILTER.g:7994:3: ruleGSSFilterFilter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getElementGSSFilterFilterParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSFilterFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSModelFileAccess().getElementGSSFilterFilterParserRuleCall_1_0()); 
            }

            }


            }

        }
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
    // InternalFILTER.g:8003:1: rule__GSSModelFileImport__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GSSModelFileImport__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8007:1: ( ( RULE_STRING ) )
            // InternalFILTER.g:8008:2: ( RULE_STRING )
            {
            // InternalFILTER.g:8008:2: ( RULE_STRING )
            // InternalFILTER.g:8009:3: RULE_STRING
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


    // $ANTLR start "rule__GSSFilterMaxtermFilter__NameAssignment_1"
    // InternalFILTER.g:8018:1: rule__GSSFilterMaxtermFilter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GSSFilterMaxtermFilter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8022:1: ( ( RULE_ID ) )
            // InternalFILTER.g:8023:2: ( RULE_ID )
            {
            // InternalFILTER.g:8023:2: ( RULE_ID )
            // InternalFILTER.g:8024:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__NameAssignment_1"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__UriAssignment_5"
    // InternalFILTER.g:8033:1: rule__GSSFilterMaxtermFilter__UriAssignment_5 : ( ruleQualifiedName ) ;
    public final void rule__GSSFilterMaxtermFilter__UriAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8037:1: ( ( ruleQualifiedName ) )
            // InternalFILTER.g:8038:2: ( ruleQualifiedName )
            {
            // InternalFILTER.g:8038:2: ( ruleQualifiedName )
            // InternalFILTER.g:8039:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getUriQualifiedNameParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getUriQualifiedNameParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__UriAssignment_5"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__VersionAssignment_9"
    // InternalFILTER.g:8048:1: rule__GSSFilterMaxtermFilter__VersionAssignment_9 : ( ruleVersion ) ;
    public final void rule__GSSFilterMaxtermFilter__VersionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8052:1: ( ( ruleVersion ) )
            // InternalFILTER.g:8053:2: ( ruleVersion )
            {
            // InternalFILTER.g:8053:2: ( ruleVersion )
            // InternalFILTER.g:8054:3: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionVersionParserRuleCall_9_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionVersionParserRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__VersionAssignment_9"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__FormatFileAssignment_13"
    // InternalFILTER.g:8063:1: rule__GSSFilterMaxtermFilter__FormatFileAssignment_13 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__GSSFilterMaxtermFilter__FormatFileAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8067:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalFILTER.g:8068:2: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalFILTER.g:8068:2: ( ( ruleVersionedQualifiedName ) )
            // InternalFILTER.g:8069:3: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileGSSFormatFormatCrossReference_13_0()); 
            }
            // InternalFILTER.g:8070:3: ( ruleVersionedQualifiedName )
            // InternalFILTER.g:8071:4: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileGSSFormatFormatVersionedQualifiedNameParserRuleCall_13_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileGSSFormatFormatVersionedQualifiedNameParserRuleCall_13_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileGSSFormatFormatCrossReference_13_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__FormatFileAssignment_13"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__BoolVarAssignment_15"
    // InternalFILTER.g:8082:1: rule__GSSFilterMaxtermFilter__BoolVarAssignment_15 : ( ruleGSSFilterAbstractBoolVar ) ;
    public final void rule__GSSFilterMaxtermFilter__BoolVarAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8086:1: ( ( ruleGSSFilterAbstractBoolVar ) )
            // InternalFILTER.g:8087:2: ( ruleGSSFilterAbstractBoolVar )
            {
            // InternalFILTER.g:8087:2: ( ruleGSSFilterAbstractBoolVar )
            // InternalFILTER.g:8088:3: ruleGSSFilterAbstractBoolVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarGSSFilterAbstractBoolVarParserRuleCall_15_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSFilterAbstractBoolVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarGSSFilterAbstractBoolVarParserRuleCall_15_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__BoolVarAssignment_15"


    // $ANTLR start "rule__GSSFilterMaxtermFilter__MaxtermAssignment_16"
    // InternalFILTER.g:8097:1: rule__GSSFilterMaxtermFilter__MaxtermAssignment_16 : ( ruleGSSFilterMaxterm ) ;
    public final void rule__GSSFilterMaxtermFilter__MaxtermAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8101:1: ( ( ruleGSSFilterMaxterm ) )
            // InternalFILTER.g:8102:2: ( ruleGSSFilterMaxterm )
            {
            // InternalFILTER.g:8102:2: ( ruleGSSFilterMaxterm )
            // InternalFILTER.g:8103:3: ruleGSSFilterMaxterm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermFilterAccess().getMaxtermGSSFilterMaxtermParserRuleCall_16_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSFilterMaxterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermFilterAccess().getMaxtermGSSFilterMaxtermParserRuleCall_16_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxtermFilter__MaxtermAssignment_16"


    // $ANTLR start "rule__GSSFilterMintermFilter__NameAssignment_1"
    // InternalFILTER.g:8112:1: rule__GSSFilterMintermFilter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GSSFilterMintermFilter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8116:1: ( ( RULE_ID ) )
            // InternalFILTER.g:8117:2: ( RULE_ID )
            {
            // InternalFILTER.g:8117:2: ( RULE_ID )
            // InternalFILTER.g:8118:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__NameAssignment_1"


    // $ANTLR start "rule__GSSFilterMintermFilter__UriAssignment_5"
    // InternalFILTER.g:8127:1: rule__GSSFilterMintermFilter__UriAssignment_5 : ( ruleQualifiedName ) ;
    public final void rule__GSSFilterMintermFilter__UriAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8131:1: ( ( ruleQualifiedName ) )
            // InternalFILTER.g:8132:2: ( ruleQualifiedName )
            {
            // InternalFILTER.g:8132:2: ( ruleQualifiedName )
            // InternalFILTER.g:8133:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getUriQualifiedNameParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getUriQualifiedNameParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__UriAssignment_5"


    // $ANTLR start "rule__GSSFilterMintermFilter__VersionAssignment_9"
    // InternalFILTER.g:8142:1: rule__GSSFilterMintermFilter__VersionAssignment_9 : ( ruleVersion ) ;
    public final void rule__GSSFilterMintermFilter__VersionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8146:1: ( ( ruleVersion ) )
            // InternalFILTER.g:8147:2: ( ruleVersion )
            {
            // InternalFILTER.g:8147:2: ( ruleVersion )
            // InternalFILTER.g:8148:3: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getVersionVersionParserRuleCall_9_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getVersionVersionParserRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__VersionAssignment_9"


    // $ANTLR start "rule__GSSFilterMintermFilter__FormatFileAssignment_13"
    // InternalFILTER.g:8157:1: rule__GSSFilterMintermFilter__FormatFileAssignment_13 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__GSSFilterMintermFilter__FormatFileAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8161:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalFILTER.g:8162:2: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalFILTER.g:8162:2: ( ( ruleVersionedQualifiedName ) )
            // InternalFILTER.g:8163:3: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileGSSFormatFormatCrossReference_13_0()); 
            }
            // InternalFILTER.g:8164:3: ( ruleVersionedQualifiedName )
            // InternalFILTER.g:8165:4: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileGSSFormatFormatVersionedQualifiedNameParserRuleCall_13_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileGSSFormatFormatVersionedQualifiedNameParserRuleCall_13_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileGSSFormatFormatCrossReference_13_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__FormatFileAssignment_13"


    // $ANTLR start "rule__GSSFilterMintermFilter__BoolVarAssignment_15"
    // InternalFILTER.g:8176:1: rule__GSSFilterMintermFilter__BoolVarAssignment_15 : ( ruleGSSFilterAbstractBoolVar ) ;
    public final void rule__GSSFilterMintermFilter__BoolVarAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8180:1: ( ( ruleGSSFilterAbstractBoolVar ) )
            // InternalFILTER.g:8181:2: ( ruleGSSFilterAbstractBoolVar )
            {
            // InternalFILTER.g:8181:2: ( ruleGSSFilterAbstractBoolVar )
            // InternalFILTER.g:8182:3: ruleGSSFilterAbstractBoolVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarGSSFilterAbstractBoolVarParserRuleCall_15_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSFilterAbstractBoolVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarGSSFilterAbstractBoolVarParserRuleCall_15_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__BoolVarAssignment_15"


    // $ANTLR start "rule__GSSFilterMintermFilter__MintermAssignment_16"
    // InternalFILTER.g:8191:1: rule__GSSFilterMintermFilter__MintermAssignment_16 : ( ruleGSSFilterMinterm ) ;
    public final void rule__GSSFilterMintermFilter__MintermAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8195:1: ( ( ruleGSSFilterMinterm ) )
            // InternalFILTER.g:8196:2: ( ruleGSSFilterMinterm )
            {
            // InternalFILTER.g:8196:2: ( ruleGSSFilterMinterm )
            // InternalFILTER.g:8197:3: ruleGSSFilterMinterm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermFilterAccess().getMintermGSSFilterMintermParserRuleCall_16_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSFilterMinterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermFilterAccess().getMintermGSSFilterMintermParserRuleCall_16_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMintermFilter__MintermAssignment_16"


    // $ANTLR start "rule__GSSFilterBoolVar__IdAssignment_4"
    // InternalFILTER.g:8206:1: rule__GSSFilterBoolVar__IdAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSFilterBoolVar__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8210:1: ( ( ruleINTEGER ) )
            // InternalFILTER.g:8211:2: ( ruleINTEGER )
            {
            // InternalFILTER.g:8211:2: ( ruleINTEGER )
            // InternalFILTER.g:8212:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getIdINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getIdINTEGERParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__IdAssignment_4"


    // $ANTLR start "rule__GSSFilterBoolVar__NameAssignment_8"
    // InternalFILTER.g:8221:1: rule__GSSFilterBoolVar__NameAssignment_8 : ( RULE_ID ) ;
    public final void rule__GSSFilterBoolVar__NameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8225:1: ( ( RULE_ID ) )
            // InternalFILTER.g:8226:2: ( RULE_ID )
            {
            // InternalFILTER.g:8226:2: ( RULE_ID )
            // InternalFILTER.g:8227:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getNameIDTerminalRuleCall_8_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getNameIDTerminalRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__NameAssignment_8"


    // $ANTLR start "rule__GSSFilterBoolVar__ConstantTypeAssignment_12"
    // InternalFILTER.g:8236:1: rule__GSSFilterBoolVar__ConstantTypeAssignment_12 : ( ruleGSSFilterConstantType ) ;
    public final void rule__GSSFilterBoolVar__ConstantTypeAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8240:1: ( ( ruleGSSFilterConstantType ) )
            // InternalFILTER.g:8241:2: ( ruleGSSFilterConstantType )
            {
            // InternalFILTER.g:8241:2: ( ruleGSSFilterConstantType )
            // InternalFILTER.g:8242:3: ruleGSSFilterConstantType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSFilterConstantType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__ConstantTypeAssignment_12"


    // $ANTLR start "rule__GSSFilterBoolVar__FieldRefAssignment_16"
    // InternalFILTER.g:8251:1: rule__GSSFilterBoolVar__FieldRefAssignment_16 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__GSSFilterBoolVar__FieldRefAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8255:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalFILTER.g:8256:2: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalFILTER.g:8256:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalFILTER.g:8257:3: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getFieldRefGSSFormatFieldCrossReference_16_0()); 
            }
            // InternalFILTER.g:8258:3: ( ruleVersionedQualifiedReferenceName )
            // InternalFILTER.g:8259:4: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getFieldRefGSSFormatFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getFieldRefGSSFormatFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getFieldRefGSSFormatFieldCrossReference_16_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__FieldRefAssignment_16"


    // $ANTLR start "rule__GSSFilterBoolVar__OpAssignment_18"
    // InternalFILTER.g:8270:1: rule__GSSFilterBoolVar__OpAssignment_18 : ( ruleGSSFilterFieldOp ) ;
    public final void rule__GSSFilterBoolVar__OpAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8274:1: ( ( ruleGSSFilterFieldOp ) )
            // InternalFILTER.g:8275:2: ( ruleGSSFilterFieldOp )
            {
            // InternalFILTER.g:8275:2: ( ruleGSSFilterFieldOp )
            // InternalFILTER.g:8276:3: ruleGSSFilterFieldOp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getOpGSSFilterFieldOpParserRuleCall_18_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSFilterFieldOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getOpGSSFilterFieldOpParserRuleCall_18_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__OpAssignment_18"


    // $ANTLR start "rule__GSSFilterBoolVar__ValueAssignment_19"
    // InternalFILTER.g:8285:1: rule__GSSFilterBoolVar__ValueAssignment_19 : ( ruleGSSFilterValue ) ;
    public final void rule__GSSFilterBoolVar__ValueAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8289:1: ( ( ruleGSSFilterValue ) )
            // InternalFILTER.g:8290:2: ( ruleGSSFilterValue )
            {
            // InternalFILTER.g:8290:2: ( ruleGSSFilterValue )
            // InternalFILTER.g:8291:3: ruleGSSFilterValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarAccess().getValueGSSFilterValueParserRuleCall_19_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSFilterValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarAccess().getValueGSSFilterValueParserRuleCall_19_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVar__ValueAssignment_19"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__IdAssignment_4"
    // InternalFILTER.g:8300:1: rule__GSSFilterBoolVarFromArrayItem__IdAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8304:1: ( ( ruleINTEGER ) )
            // InternalFILTER.g:8305:2: ( ruleINTEGER )
            {
            // InternalFILTER.g:8305:2: ( ruleINTEGER )
            // InternalFILTER.g:8306:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getIdINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getIdINTEGERParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__IdAssignment_4"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__NameAssignment_8"
    // InternalFILTER.g:8315:1: rule__GSSFilterBoolVarFromArrayItem__NameAssignment_8 : ( RULE_ID ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__NameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8319:1: ( ( RULE_ID ) )
            // InternalFILTER.g:8320:2: ( RULE_ID )
            {
            // InternalFILTER.g:8320:2: ( RULE_ID )
            // InternalFILTER.g:8321:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getNameIDTerminalRuleCall_8_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getNameIDTerminalRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__NameAssignment_8"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__ConstantTypeAssignment_12"
    // InternalFILTER.g:8330:1: rule__GSSFilterBoolVarFromArrayItem__ConstantTypeAssignment_12 : ( ruleGSSFilterConstantType ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__ConstantTypeAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8334:1: ( ( ruleGSSFilterConstantType ) )
            // InternalFILTER.g:8335:2: ( ruleGSSFilterConstantType )
            {
            // InternalFILTER.g:8335:2: ( ruleGSSFilterConstantType )
            // InternalFILTER.g:8336:3: ruleGSSFilterConstantType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSFilterConstantType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__ConstantTypeAssignment_12"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__AIFieldRefAssignment_16"
    // InternalFILTER.g:8345:1: rule__GSSFilterBoolVarFromArrayItem__AIFieldRefAssignment_16 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__AIFieldRefAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8349:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalFILTER.g:8350:2: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalFILTER.g:8350:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalFILTER.g:8351:3: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAIFieldRefGSSFormatAIFieldCrossReference_16_0()); 
            }
            // InternalFILTER.g:8352:3: ( ruleVersionedQualifiedReferenceName )
            // InternalFILTER.g:8353:4: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAIFieldRefGSSFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAIFieldRefGSSFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAIFieldRefGSSFormatAIFieldCrossReference_16_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__AIFieldRefAssignment_16"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__OpAssignment_18"
    // InternalFILTER.g:8364:1: rule__GSSFilterBoolVarFromArrayItem__OpAssignment_18 : ( ruleGSSFilterFieldOp ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__OpAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8368:1: ( ( ruleGSSFilterFieldOp ) )
            // InternalFILTER.g:8369:2: ( ruleGSSFilterFieldOp )
            {
            // InternalFILTER.g:8369:2: ( ruleGSSFilterFieldOp )
            // InternalFILTER.g:8370:3: ruleGSSFilterFieldOp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getOpGSSFilterFieldOpParserRuleCall_18_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSFilterFieldOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getOpGSSFilterFieldOpParserRuleCall_18_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__OpAssignment_18"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__ConstantAssignment_19_0"
    // InternalFILTER.g:8379:1: rule__GSSFilterBoolVarFromArrayItem__ConstantAssignment_19_0 : ( ruleGSSFilterConstant ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__ConstantAssignment_19_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8383:1: ( ( ruleGSSFilterConstant ) )
            // InternalFILTER.g:8384:2: ( ruleGSSFilterConstant )
            {
            // InternalFILTER.g:8384:2: ( ruleGSSFilterConstant )
            // InternalFILTER.g:8385:3: ruleGSSFilterConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantGSSFilterConstantParserRuleCall_19_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSFilterConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantGSSFilterConstantParserRuleCall_19_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__ConstantAssignment_19_0"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__SelectAssignment_19_1"
    // InternalFILTER.g:8394:1: rule__GSSFilterBoolVarFromArrayItem__SelectAssignment_19_1 : ( ruleGSSFilterSelect ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__SelectAssignment_19_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8398:1: ( ( ruleGSSFilterSelect ) )
            // InternalFILTER.g:8399:2: ( ruleGSSFilterSelect )
            {
            // InternalFILTER.g:8399:2: ( ruleGSSFilterSelect )
            // InternalFILTER.g:8400:3: ruleGSSFilterSelect
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSelectGSSFilterSelectParserRuleCall_19_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSFilterSelect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSelectGSSFilterSelectParserRuleCall_19_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__SelectAssignment_19_1"


    // $ANTLR start "rule__GSSFilterBoolVarFromArrayItem__SelectLineAssignment_19_2"
    // InternalFILTER.g:8409:1: rule__GSSFilterBoolVarFromArrayItem__SelectLineAssignment_19_2 : ( ruleGSSFilterSelectLine ) ;
    public final void rule__GSSFilterBoolVarFromArrayItem__SelectLineAssignment_19_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8413:1: ( ( ruleGSSFilterSelectLine ) )
            // InternalFILTER.g:8414:2: ( ruleGSSFilterSelectLine )
            {
            // InternalFILTER.g:8414:2: ( ruleGSSFilterSelectLine )
            // InternalFILTER.g:8415:3: ruleGSSFilterSelectLine
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSelectLineGSSFilterSelectLineParserRuleCall_19_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSFilterSelectLine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSelectLineGSSFilterSelectLineParserRuleCall_19_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromArrayItem__SelectLineAssignment_19_2"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__IdAssignment_4"
    // InternalFILTER.g:8424:1: rule__GSSFilterBoolVarFromGroupedArrayItem__IdAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8428:1: ( ( ruleINTEGER ) )
            // InternalFILTER.g:8429:2: ( ruleINTEGER )
            {
            // InternalFILTER.g:8429:2: ( ruleINTEGER )
            // InternalFILTER.g:8430:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getIdINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getIdINTEGERParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__IdAssignment_4"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__NameAssignment_8"
    // InternalFILTER.g:8439:1: rule__GSSFilterBoolVarFromGroupedArrayItem__NameAssignment_8 : ( RULE_ID ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__NameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8443:1: ( ( RULE_ID ) )
            // InternalFILTER.g:8444:2: ( RULE_ID )
            {
            // InternalFILTER.g:8444:2: ( RULE_ID )
            // InternalFILTER.g:8445:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getNameIDTerminalRuleCall_8_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getNameIDTerminalRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__NameAssignment_8"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12"
    // InternalFILTER.g:8454:1: rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12 : ( ruleGSSFilterConstantType ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8458:1: ( ( ruleGSSFilterConstantType ) )
            // InternalFILTER.g:8459:2: ( ruleGSSFilterConstantType )
            {
            // InternalFILTER.g:8459:2: ( ruleGSSFilterConstantType )
            // InternalFILTER.g:8460:3: ruleGSSFilterConstantType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSFilterConstantType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__GroupAssignment_16"
    // InternalFILTER.g:8469:1: rule__GSSFilterBoolVarFromGroupedArrayItem__GroupAssignment_16 : ( RULE_ID ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__GroupAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8473:1: ( ( RULE_ID ) )
            // InternalFILTER.g:8474:2: ( RULE_ID )
            {
            // InternalFILTER.g:8474:2: ( RULE_ID )
            // InternalFILTER.g:8475:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGroupIDTerminalRuleCall_16_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGroupIDTerminalRuleCall_16_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__GroupAssignment_16"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20"
    // InternalFILTER.g:8484:1: rule__GSSFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8488:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalFILTER.g:8489:2: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalFILTER.g:8489:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalFILTER.g:8490:3: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsGSSFormatAFieldCrossReference_20_0()); 
            }
            // InternalFILTER.g:8491:3: ( ruleVersionedQualifiedReferenceName )
            // InternalFILTER.g:8492:4: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsGSSFormatAFieldVersionedQualifiedReferenceNameParserRuleCall_20_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsGSSFormatAFieldVersionedQualifiedReferenceNameParserRuleCall_20_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsGSSFormatAFieldCrossReference_20_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__OpAssignment_22"
    // InternalFILTER.g:8503:1: rule__GSSFilterBoolVarFromGroupedArrayItem__OpAssignment_22 : ( ruleGSSFilterFieldOp ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__OpAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8507:1: ( ( ruleGSSFilterFieldOp ) )
            // InternalFILTER.g:8508:2: ( ruleGSSFilterFieldOp )
            {
            // InternalFILTER.g:8508:2: ( ruleGSSFilterFieldOp )
            // InternalFILTER.g:8509:3: ruleGSSFilterFieldOp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getOpGSSFilterFieldOpParserRuleCall_22_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSFilterFieldOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getOpGSSFilterFieldOpParserRuleCall_22_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__OpAssignment_22"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0"
    // InternalFILTER.g:8518:1: rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0 : ( ruleGSSFilterConstant ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8522:1: ( ( ruleGSSFilterConstant ) )
            // InternalFILTER.g:8523:2: ( ruleGSSFilterConstant )
            {
            // InternalFILTER.g:8523:2: ( ruleGSSFilterConstant )
            // InternalFILTER.g:8524:3: ruleGSSFilterConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantGSSFilterConstantParserRuleCall_23_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSFilterConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantGSSFilterConstantParserRuleCall_23_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1"
    // InternalFILTER.g:8533:1: rule__GSSFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1 : ( ruleGSSFilterSelect ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8537:1: ( ( ruleGSSFilterSelect ) )
            // InternalFILTER.g:8538:2: ( ruleGSSFilterSelect )
            {
            // InternalFILTER.g:8538:2: ( ruleGSSFilterSelect )
            // InternalFILTER.g:8539:3: ruleGSSFilterSelect
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSelectGSSFilterSelectParserRuleCall_23_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSFilterSelect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSelectGSSFilterSelectParserRuleCall_23_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1"


    // $ANTLR start "rule__GSSFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2"
    // InternalFILTER.g:8548:1: rule__GSSFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2 : ( ruleGSSFilterSelectLine ) ;
    public final void rule__GSSFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8552:1: ( ( ruleGSSFilterSelectLine ) )
            // InternalFILTER.g:8553:2: ( ruleGSSFilterSelectLine )
            {
            // InternalFILTER.g:8553:2: ( ruleGSSFilterSelectLine )
            // InternalFILTER.g:8554:3: ruleGSSFilterSelectLine
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSelectLineGSSFilterSelectLineParserRuleCall_23_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSFilterSelectLine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSelectLineGSSFilterSelectLineParserRuleCall_23_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__IdAssignment_4"
    // InternalFILTER.g:8563:1: rule__GSSFilterBoolVarFDIC__IdAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSFilterBoolVarFDIC__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8567:1: ( ( ruleINTEGER ) )
            // InternalFILTER.g:8568:2: ( ruleINTEGER )
            {
            // InternalFILTER.g:8568:2: ( ruleINTEGER )
            // InternalFILTER.g:8569:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFDICAccess().getIdINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFDICAccess().getIdINTEGERParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__IdAssignment_4"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__NameAssignment_8"
    // InternalFILTER.g:8578:1: rule__GSSFilterBoolVarFDIC__NameAssignment_8 : ( RULE_ID ) ;
    public final void rule__GSSFilterBoolVarFDIC__NameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8582:1: ( ( RULE_ID ) )
            // InternalFILTER.g:8583:2: ( RULE_ID )
            {
            // InternalFILTER.g:8583:2: ( RULE_ID )
            // InternalFILTER.g:8584:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFDICAccess().getNameIDTerminalRuleCall_8_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFDICAccess().getNameIDTerminalRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__NameAssignment_8"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__FieldRefAssignment_12"
    // InternalFILTER.g:8593:1: rule__GSSFilterBoolVarFDIC__FieldRefAssignment_12 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__GSSFilterBoolVarFDIC__FieldRefAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8597:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalFILTER.g:8598:2: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalFILTER.g:8598:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalFILTER.g:8599:3: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefGSSFormatFDICFieldCrossReference_12_0()); 
            }
            // InternalFILTER.g:8600:3: ( ruleVersionedQualifiedReferenceName )
            // InternalFILTER.g:8601:4: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefGSSFormatFDICFieldVersionedQualifiedReferenceNameParserRuleCall_12_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefGSSFormatFDICFieldVersionedQualifiedReferenceNameParserRuleCall_12_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefGSSFormatFDICFieldCrossReference_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__FieldRefAssignment_12"


    // $ANTLR start "rule__GSSFilterBoolVarFDIC__OpAssignment_14"
    // InternalFILTER.g:8612:1: rule__GSSFilterBoolVarFDIC__OpAssignment_14 : ( ruleGSSFilterFieldOp ) ;
    public final void rule__GSSFilterBoolVarFDIC__OpAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8616:1: ( ( ruleGSSFilterFieldOp ) )
            // InternalFILTER.g:8617:2: ( ruleGSSFilterFieldOp )
            {
            // InternalFILTER.g:8617:2: ( ruleGSSFilterFieldOp )
            // InternalFILTER.g:8618:3: ruleGSSFilterFieldOp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarFDICAccess().getOpGSSFilterFieldOpParserRuleCall_14_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSFilterFieldOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarFDICAccess().getOpGSSFilterFieldOpParserRuleCall_14_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarFDIC__OpAssignment_14"


    // $ANTLR start "rule__GSSFilterFieldOp__TypeAssignment_4"
    // InternalFILTER.g:8627:1: rule__GSSFilterFieldOp__TypeAssignment_4 : ( ruleGSSFilterOPType ) ;
    public final void rule__GSSFilterFieldOp__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8631:1: ( ( ruleGSSFilterOPType ) )
            // InternalFILTER.g:8632:2: ( ruleGSSFilterOPType )
            {
            // InternalFILTER.g:8632:2: ( ruleGSSFilterOPType )
            // InternalFILTER.g:8633:3: ruleGSSFilterOPType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterFieldOpAccess().getTypeGSSFilterOPTypeEnumRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSFilterOPType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterFieldOpAccess().getTypeGSSFilterOPTypeEnumRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterFieldOp__TypeAssignment_4"


    // $ANTLR start "rule__GSSFilterConstant__ValueAssignment_4"
    // InternalFILTER.g:8642:1: rule__GSSFilterConstant__ValueAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSFilterConstant__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8646:1: ( ( ruleINTEGER ) )
            // InternalFILTER.g:8647:2: ( ruleINTEGER )
            {
            // InternalFILTER.g:8647:2: ( ruleINTEGER )
            // InternalFILTER.g:8648:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterConstantAccess().getValueINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterConstantAccess().getValueINTEGERParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__ValueAssignment_4"


    // $ANTLR start "rule__GSSFilterConstant__MaskAssignment_6_2"
    // InternalFILTER.g:8657:1: rule__GSSFilterConstant__MaskAssignment_6_2 : ( RULE_HEXADECIMAL ) ;
    public final void rule__GSSFilterConstant__MaskAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8661:1: ( ( RULE_HEXADECIMAL ) )
            // InternalFILTER.g:8662:2: ( RULE_HEXADECIMAL )
            {
            // InternalFILTER.g:8662:2: ( RULE_HEXADECIMAL )
            // InternalFILTER.g:8663:3: RULE_HEXADECIMAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterConstantAccess().getMaskHEXADECIMALTerminalRuleCall_6_2_0()); 
            }
            match(input,RULE_HEXADECIMAL,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterConstantAccess().getMaskHEXADECIMALTerminalRuleCall_6_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterConstant__MaskAssignment_6_2"


    // $ANTLR start "rule__GSSFilterSelect__FromFileAssignment_4"
    // InternalFILTER.g:8672:1: rule__GSSFilterSelect__FromFileAssignment_4 : ( RULE_ID ) ;
    public final void rule__GSSFilterSelect__FromFileAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8676:1: ( ( RULE_ID ) )
            // InternalFILTER.g:8677:2: ( RULE_ID )
            {
            // InternalFILTER.g:8677:2: ( RULE_ID )
            // InternalFILTER.g:8678:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getFromFileIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getFromFileIDTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__FromFileAssignment_4"


    // $ANTLR start "rule__GSSFilterSelect__TypeAssignment_8"
    // InternalFILTER.g:8687:1: rule__GSSFilterSelect__TypeAssignment_8 : ( ruleGSSFilterSelectType ) ;
    public final void rule__GSSFilterSelect__TypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8691:1: ( ( ruleGSSFilterSelectType ) )
            // InternalFILTER.g:8692:2: ( ruleGSSFilterSelectType )
            {
            // InternalFILTER.g:8692:2: ( ruleGSSFilterSelectType )
            // InternalFILTER.g:8693:3: ruleGSSFilterSelectType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getTypeGSSFilterSelectTypeEnumRuleCall_8_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSFilterSelectType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getTypeGSSFilterSelectTypeEnumRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__TypeAssignment_8"


    // $ANTLR start "rule__GSSFilterSelect__OffsetAssignment_10_2"
    // InternalFILTER.g:8702:1: rule__GSSFilterSelect__OffsetAssignment_10_2 : ( ruleINTEGER ) ;
    public final void rule__GSSFilterSelect__OffsetAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8706:1: ( ( ruleINTEGER ) )
            // InternalFILTER.g:8707:2: ( ruleINTEGER )
            {
            // InternalFILTER.g:8707:2: ( ruleINTEGER )
            // InternalFILTER.g:8708:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getOffsetINTEGERParserRuleCall_10_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getOffsetINTEGERParserRuleCall_10_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__OffsetAssignment_10_2"


    // $ANTLR start "rule__GSSFilterSelect__SizeAssignment_11_2"
    // InternalFILTER.g:8717:1: rule__GSSFilterSelect__SizeAssignment_11_2 : ( ruleINTEGER ) ;
    public final void rule__GSSFilterSelect__SizeAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8721:1: ( ( ruleINTEGER ) )
            // InternalFILTER.g:8722:2: ( ruleINTEGER )
            {
            // InternalFILTER.g:8722:2: ( ruleINTEGER )
            // InternalFILTER.g:8723:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getSizeINTEGERParserRuleCall_11_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getSizeINTEGERParserRuleCall_11_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__SizeAssignment_11_2"


    // $ANTLR start "rule__GSSFilterSelect__MaskAssignment_12_2"
    // InternalFILTER.g:8732:1: rule__GSSFilterSelect__MaskAssignment_12_2 : ( RULE_HEXADECIMAL ) ;
    public final void rule__GSSFilterSelect__MaskAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8736:1: ( ( RULE_HEXADECIMAL ) )
            // InternalFILTER.g:8737:2: ( RULE_HEXADECIMAL )
            {
            // InternalFILTER.g:8737:2: ( RULE_HEXADECIMAL )
            // InternalFILTER.g:8738:3: RULE_HEXADECIMAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectAccess().getMaskHEXADECIMALTerminalRuleCall_12_2_0()); 
            }
            match(input,RULE_HEXADECIMAL,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectAccess().getMaskHEXADECIMALTerminalRuleCall_12_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelect__MaskAssignment_12_2"


    // $ANTLR start "rule__GSSFilterSelectLine__FromFileAssignment_4"
    // InternalFILTER.g:8747:1: rule__GSSFilterSelectLine__FromFileAssignment_4 : ( RULE_ID ) ;
    public final void rule__GSSFilterSelectLine__FromFileAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8751:1: ( ( RULE_ID ) )
            // InternalFILTER.g:8752:2: ( RULE_ID )
            {
            // InternalFILTER.g:8752:2: ( RULE_ID )
            // InternalFILTER.g:8753:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getFromFileIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getFromFileIDTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__FromFileAssignment_4"


    // $ANTLR start "rule__GSSFilterSelectLine__LineAssignment_8"
    // InternalFILTER.g:8762:1: rule__GSSFilterSelectLine__LineAssignment_8 : ( ruleINTEGER ) ;
    public final void rule__GSSFilterSelectLine__LineAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8766:1: ( ( ruleINTEGER ) )
            // InternalFILTER.g:8767:2: ( ruleINTEGER )
            {
            // InternalFILTER.g:8767:2: ( ruleINTEGER )
            // InternalFILTER.g:8768:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getLineINTEGERParserRuleCall_8_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getLineINTEGERParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__LineAssignment_8"


    // $ANTLR start "rule__GSSFilterSelectLine__LeftTrimAssignment_10_2"
    // InternalFILTER.g:8777:1: rule__GSSFilterSelectLine__LeftTrimAssignment_10_2 : ( ruleINTEGER ) ;
    public final void rule__GSSFilterSelectLine__LeftTrimAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8781:1: ( ( ruleINTEGER ) )
            // InternalFILTER.g:8782:2: ( ruleINTEGER )
            {
            // InternalFILTER.g:8782:2: ( ruleINTEGER )
            // InternalFILTER.g:8783:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getLeftTrimINTEGERParserRuleCall_10_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getLeftTrimINTEGERParserRuleCall_10_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__LeftTrimAssignment_10_2"


    // $ANTLR start "rule__GSSFilterSelectLine__RightTrimAssignment_11_2"
    // InternalFILTER.g:8792:1: rule__GSSFilterSelectLine__RightTrimAssignment_11_2 : ( ruleINTEGER ) ;
    public final void rule__GSSFilterSelectLine__RightTrimAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8796:1: ( ( ruleINTEGER ) )
            // InternalFILTER.g:8797:2: ( ruleINTEGER )
            {
            // InternalFILTER.g:8797:2: ( ruleINTEGER )
            // InternalFILTER.g:8798:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getRightTrimINTEGERParserRuleCall_11_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getRightTrimINTEGERParserRuleCall_11_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__RightTrimAssignment_11_2"


    // $ANTLR start "rule__GSSFilterSelectLine__MaskAssignment_12_2"
    // InternalFILTER.g:8807:1: rule__GSSFilterSelectLine__MaskAssignment_12_2 : ( RULE_HEXADECIMAL ) ;
    public final void rule__GSSFilterSelectLine__MaskAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8811:1: ( ( RULE_HEXADECIMAL ) )
            // InternalFILTER.g:8812:2: ( RULE_HEXADECIMAL )
            {
            // InternalFILTER.g:8812:2: ( RULE_HEXADECIMAL )
            // InternalFILTER.g:8813:3: RULE_HEXADECIMAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterSelectLineAccess().getMaskHEXADECIMALTerminalRuleCall_12_2_0()); 
            }
            match(input,RULE_HEXADECIMAL,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterSelectLineAccess().getMaskHEXADECIMALTerminalRuleCall_12_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterSelectLine__MaskAssignment_12_2"


    // $ANTLR start "rule__GSSFilterMaxterm__IdAssignment_4"
    // InternalFILTER.g:8822:1: rule__GSSFilterMaxterm__IdAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSFilterMaxterm__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8826:1: ( ( ruleINTEGER ) )
            // InternalFILTER.g:8827:2: ( ruleINTEGER )
            {
            // InternalFILTER.g:8827:2: ( ruleINTEGER )
            // InternalFILTER.g:8828:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermAccess().getIdINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermAccess().getIdINTEGERParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxterm__IdAssignment_4"


    // $ANTLR start "rule__GSSFilterMaxterm__BoolVarRefAssignment_6"
    // InternalFILTER.g:8837:1: rule__GSSFilterMaxterm__BoolVarRefAssignment_6 : ( ruleGSSFilterBoolVarRef ) ;
    public final void rule__GSSFilterMaxterm__BoolVarRefAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8841:1: ( ( ruleGSSFilterBoolVarRef ) )
            // InternalFILTER.g:8842:2: ( ruleGSSFilterBoolVarRef )
            {
            // InternalFILTER.g:8842:2: ( ruleGSSFilterBoolVarRef )
            // InternalFILTER.g:8843:3: ruleGSSFilterBoolVarRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMaxtermAccess().getBoolVarRefGSSFilterBoolVarRefParserRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSFilterBoolVarRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMaxtermAccess().getBoolVarRefGSSFilterBoolVarRefParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMaxterm__BoolVarRefAssignment_6"


    // $ANTLR start "rule__GSSFilterMinterm__IdAssignment_4"
    // InternalFILTER.g:8852:1: rule__GSSFilterMinterm__IdAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSFilterMinterm__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8856:1: ( ( ruleINTEGER ) )
            // InternalFILTER.g:8857:2: ( ruleINTEGER )
            {
            // InternalFILTER.g:8857:2: ( ruleINTEGER )
            // InternalFILTER.g:8858:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermAccess().getIdINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermAccess().getIdINTEGERParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMinterm__IdAssignment_4"


    // $ANTLR start "rule__GSSFilterMinterm__BoolVarRefAssignment_6"
    // InternalFILTER.g:8867:1: rule__GSSFilterMinterm__BoolVarRefAssignment_6 : ( ruleGSSFilterBoolVarRef ) ;
    public final void rule__GSSFilterMinterm__BoolVarRefAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8871:1: ( ( ruleGSSFilterBoolVarRef ) )
            // InternalFILTER.g:8872:2: ( ruleGSSFilterBoolVarRef )
            {
            // InternalFILTER.g:8872:2: ( ruleGSSFilterBoolVarRef )
            // InternalFILTER.g:8873:3: ruleGSSFilterBoolVarRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterMintermAccess().getBoolVarRefGSSFilterBoolVarRefParserRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSFilterBoolVarRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterMintermAccess().getBoolVarRefGSSFilterBoolVarRefParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterMinterm__BoolVarRefAssignment_6"


    // $ANTLR start "rule__GSSFilterBoolVarRef__IdRefAssignment_4"
    // InternalFILTER.g:8882:1: rule__GSSFilterBoolVarRef__IdRefAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSFilterBoolVarRef__IdRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8886:1: ( ( ruleINTEGER ) )
            // InternalFILTER.g:8887:2: ( ruleINTEGER )
            {
            // InternalFILTER.g:8887:2: ( ruleINTEGER )
            // InternalFILTER.g:8888:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSFilterBoolVarRefAccess().getIdRefINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSFilterBoolVarRefAccess().getIdRefINTEGERParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSFilterBoolVarRef__IdRefAssignment_4"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000820000000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00004A1000000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00004A1000000002L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000008L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000001F000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0092000000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000000007E0000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0008000400000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000003800000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0048000401000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0608000400000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x2000000000000002L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x8000000000000002L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000008L});
    }


}