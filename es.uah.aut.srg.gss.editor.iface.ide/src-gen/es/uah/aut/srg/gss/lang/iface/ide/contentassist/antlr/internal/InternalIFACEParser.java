package es.uah.aut.srg.gss.lang.iface.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.gss.lang.iface.services.IFACEGrammarAccess;



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
public class InternalIFACEParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_HEXADECIMAL", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'usb'", "'mk2'", "'pci'", "'38400bauds'", "'115200bauds'", "'NO'", "'ODD'", "'EVEN'", "'MARK'", "'SPACE'", "'5bits'", "'6bits'", "'7bits'", "'8bits'", "'1bit'", "'2bits'", "'rts_cts'", "'xon_xoff'", "'bytes'", "'bits'", "'no'", "'2_with_0'", "'import'", "';'", "'portConfig'", "'{'", "'}'", "'uri'", "':='", "'version'", "'spwPort'", "'type'", "'link'", "'writingPort'", "'readingPort'", "'port'", "'uartPort'", "'number'", "'baudRate'", "'parity'", "'dataBits'", "'stopBits'", "'flowControl'", "'uartProtocol'", "'unit'", "'power'", "'constSize'", "'sizeFieldOffset'", "'sizeFieldTrim'", "'syncPattern'", "'hexValue'", "'spwTCPort'", "'spwPortRef'", "'dummyPort'", "'.'", "'('", "')'", "'-'"
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
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
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


        public InternalIFACEParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIFACEParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIFACEParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIFACE.g"; }


    	private IFACEGrammarAccess grammarAccess;

    	public void setGrammarAccess(IFACEGrammarAccess grammarAccess) {
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
    // InternalIFACE.g:61:1: entryRuleGSSModelFile : ruleGSSModelFile EOF ;
    public final void entryRuleGSSModelFile() throws RecognitionException {
        try {
            // InternalIFACE.g:62:1: ( ruleGSSModelFile EOF )
            // InternalIFACE.g:63:1: ruleGSSModelFile EOF
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
    // InternalIFACE.g:70:1: ruleGSSModelFile : ( ( rule__GSSModelFile__Group__0 ) ) ;
    public final void ruleGSSModelFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:74:2: ( ( ( rule__GSSModelFile__Group__0 ) ) )
            // InternalIFACE.g:75:2: ( ( rule__GSSModelFile__Group__0 ) )
            {
            // InternalIFACE.g:75:2: ( ( rule__GSSModelFile__Group__0 ) )
            // InternalIFACE.g:76:3: ( rule__GSSModelFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getGroup()); 
            }
            // InternalIFACE.g:77:3: ( rule__GSSModelFile__Group__0 )
            // InternalIFACE.g:77:4: rule__GSSModelFile__Group__0
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
    // InternalIFACE.g:86:1: entryRuleGSSModelFileImport : ruleGSSModelFileImport EOF ;
    public final void entryRuleGSSModelFileImport() throws RecognitionException {
        try {
            // InternalIFACE.g:87:1: ( ruleGSSModelFileImport EOF )
            // InternalIFACE.g:88:1: ruleGSSModelFileImport EOF
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
    // InternalIFACE.g:95:1: ruleGSSModelFileImport : ( ( rule__GSSModelFileImport__Group__0 ) ) ;
    public final void ruleGSSModelFileImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:99:2: ( ( ( rule__GSSModelFileImport__Group__0 ) ) )
            // InternalIFACE.g:100:2: ( ( rule__GSSModelFileImport__Group__0 ) )
            {
            // InternalIFACE.g:100:2: ( ( rule__GSSModelFileImport__Group__0 ) )
            // InternalIFACE.g:101:3: ( rule__GSSModelFileImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getGroup()); 
            }
            // InternalIFACE.g:102:3: ( rule__GSSModelFileImport__Group__0 )
            // InternalIFACE.g:102:4: rule__GSSModelFileImport__Group__0
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


    // $ANTLR start "entryRuleGSSIfacePortConfig"
    // InternalIFACE.g:111:1: entryRuleGSSIfacePortConfig : ruleGSSIfacePortConfig EOF ;
    public final void entryRuleGSSIfacePortConfig() throws RecognitionException {
        try {
            // InternalIFACE.g:112:1: ( ruleGSSIfacePortConfig EOF )
            // InternalIFACE.g:113:1: ruleGSSIfacePortConfig EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSIfacePortConfig();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortConfigRule()); 
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
    // $ANTLR end "entryRuleGSSIfacePortConfig"


    // $ANTLR start "ruleGSSIfacePortConfig"
    // InternalIFACE.g:120:1: ruleGSSIfacePortConfig : ( ( rule__GSSIfacePortConfig__Group__0 ) ) ;
    public final void ruleGSSIfacePortConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:124:2: ( ( ( rule__GSSIfacePortConfig__Group__0 ) ) )
            // InternalIFACE.g:125:2: ( ( rule__GSSIfacePortConfig__Group__0 ) )
            {
            // InternalIFACE.g:125:2: ( ( rule__GSSIfacePortConfig__Group__0 ) )
            // InternalIFACE.g:126:3: ( rule__GSSIfacePortConfig__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getGroup()); 
            }
            // InternalIFACE.g:127:3: ( rule__GSSIfacePortConfig__Group__0 )
            // InternalIFACE.g:127:4: rule__GSSIfacePortConfig__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortConfig__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortConfigAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSIfacePortConfig"


    // $ANTLR start "entryRuleGSSIfacePort"
    // InternalIFACE.g:136:1: entryRuleGSSIfacePort : ruleGSSIfacePort EOF ;
    public final void entryRuleGSSIfacePort() throws RecognitionException {
        try {
            // InternalIFACE.g:137:1: ( ruleGSSIfacePort EOF )
            // InternalIFACE.g:138:1: ruleGSSIfacePort EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSIfacePort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortRule()); 
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
    // $ANTLR end "entryRuleGSSIfacePort"


    // $ANTLR start "ruleGSSIfacePort"
    // InternalIFACE.g:145:1: ruleGSSIfacePort : ( ( rule__GSSIfacePort__Alternatives ) ) ;
    public final void ruleGSSIfacePort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:149:2: ( ( ( rule__GSSIfacePort__Alternatives ) ) )
            // InternalIFACE.g:150:2: ( ( rule__GSSIfacePort__Alternatives ) )
            {
            // InternalIFACE.g:150:2: ( ( rule__GSSIfacePort__Alternatives ) )
            // InternalIFACE.g:151:3: ( rule__GSSIfacePort__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortAccess().getAlternatives()); 
            }
            // InternalIFACE.g:152:3: ( rule__GSSIfacePort__Alternatives )
            // InternalIFACE.g:152:4: rule__GSSIfacePort__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePort__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSIfacePort"


    // $ANTLR start "entryRuleGSSIfaceSpWPort"
    // InternalIFACE.g:161:1: entryRuleGSSIfaceSpWPort : ruleGSSIfaceSpWPort EOF ;
    public final void entryRuleGSSIfaceSpWPort() throws RecognitionException {
        try {
            // InternalIFACE.g:162:1: ( ruleGSSIfaceSpWPort EOF )
            // InternalIFACE.g:163:1: ruleGSSIfaceSpWPort EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSIfaceSpWPort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortRule()); 
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
    // $ANTLR end "entryRuleGSSIfaceSpWPort"


    // $ANTLR start "ruleGSSIfaceSpWPort"
    // InternalIFACE.g:170:1: ruleGSSIfaceSpWPort : ( ( rule__GSSIfaceSpWPort__Group__0 ) ) ;
    public final void ruleGSSIfaceSpWPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:174:2: ( ( ( rule__GSSIfaceSpWPort__Group__0 ) ) )
            // InternalIFACE.g:175:2: ( ( rule__GSSIfaceSpWPort__Group__0 ) )
            {
            // InternalIFACE.g:175:2: ( ( rule__GSSIfaceSpWPort__Group__0 ) )
            // InternalIFACE.g:176:3: ( rule__GSSIfaceSpWPort__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getGroup()); 
            }
            // InternalIFACE.g:177:3: ( rule__GSSIfaceSpWPort__Group__0 )
            // InternalIFACE.g:177:4: rule__GSSIfaceSpWPort__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSIfaceSpWPort"


    // $ANTLR start "entryRuleGSSIfaceReadingPort"
    // InternalIFACE.g:186:1: entryRuleGSSIfaceReadingPort : ruleGSSIfaceReadingPort EOF ;
    public final void entryRuleGSSIfaceReadingPort() throws RecognitionException {
        try {
            // InternalIFACE.g:187:1: ( ruleGSSIfaceReadingPort EOF )
            // InternalIFACE.g:188:1: ruleGSSIfaceReadingPort EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSIfaceReadingPort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceReadingPortRule()); 
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
    // $ANTLR end "entryRuleGSSIfaceReadingPort"


    // $ANTLR start "ruleGSSIfaceReadingPort"
    // InternalIFACE.g:195:1: ruleGSSIfaceReadingPort : ( ( rule__GSSIfaceReadingPort__Group__0 ) ) ;
    public final void ruleGSSIfaceReadingPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:199:2: ( ( ( rule__GSSIfaceReadingPort__Group__0 ) ) )
            // InternalIFACE.g:200:2: ( ( rule__GSSIfaceReadingPort__Group__0 ) )
            {
            // InternalIFACE.g:200:2: ( ( rule__GSSIfaceReadingPort__Group__0 ) )
            // InternalIFACE.g:201:3: ( rule__GSSIfaceReadingPort__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getGroup()); 
            }
            // InternalIFACE.g:202:3: ( rule__GSSIfaceReadingPort__Group__0 )
            // InternalIFACE.g:202:4: rule__GSSIfaceReadingPort__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceReadingPort__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceReadingPortAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSIfaceReadingPort"


    // $ANTLR start "entryRuleGSSIfaceUartPort"
    // InternalIFACE.g:211:1: entryRuleGSSIfaceUartPort : ruleGSSIfaceUartPort EOF ;
    public final void entryRuleGSSIfaceUartPort() throws RecognitionException {
        try {
            // InternalIFACE.g:212:1: ( ruleGSSIfaceUartPort EOF )
            // InternalIFACE.g:213:1: ruleGSSIfaceUartPort EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSIfaceUartPort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortRule()); 
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
    // $ANTLR end "entryRuleGSSIfaceUartPort"


    // $ANTLR start "ruleGSSIfaceUartPort"
    // InternalIFACE.g:220:1: ruleGSSIfaceUartPort : ( ( rule__GSSIfaceUartPort__Group__0 ) ) ;
    public final void ruleGSSIfaceUartPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:224:2: ( ( ( rule__GSSIfaceUartPort__Group__0 ) ) )
            // InternalIFACE.g:225:2: ( ( rule__GSSIfaceUartPort__Group__0 ) )
            {
            // InternalIFACE.g:225:2: ( ( rule__GSSIfaceUartPort__Group__0 ) )
            // InternalIFACE.g:226:3: ( rule__GSSIfaceUartPort__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getGroup()); 
            }
            // InternalIFACE.g:227:3: ( rule__GSSIfaceUartPort__Group__0 )
            // InternalIFACE.g:227:4: rule__GSSIfaceUartPort__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSIfaceUartPort"


    // $ANTLR start "entryRuleGSSIfaceUartProtocol"
    // InternalIFACE.g:236:1: entryRuleGSSIfaceUartProtocol : ruleGSSIfaceUartProtocol EOF ;
    public final void entryRuleGSSIfaceUartProtocol() throws RecognitionException {
        try {
            // InternalIFACE.g:237:1: ( ruleGSSIfaceUartProtocol EOF )
            // InternalIFACE.g:238:1: ruleGSSIfaceUartProtocol EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSIfaceUartProtocol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolRule()); 
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
    // $ANTLR end "entryRuleGSSIfaceUartProtocol"


    // $ANTLR start "ruleGSSIfaceUartProtocol"
    // InternalIFACE.g:245:1: ruleGSSIfaceUartProtocol : ( ( rule__GSSIfaceUartProtocol__Group__0 ) ) ;
    public final void ruleGSSIfaceUartProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:249:2: ( ( ( rule__GSSIfaceUartProtocol__Group__0 ) ) )
            // InternalIFACE.g:250:2: ( ( rule__GSSIfaceUartProtocol__Group__0 ) )
            {
            // InternalIFACE.g:250:2: ( ( rule__GSSIfaceUartProtocol__Group__0 ) )
            // InternalIFACE.g:251:3: ( rule__GSSIfaceUartProtocol__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getGroup()); 
            }
            // InternalIFACE.g:252:3: ( rule__GSSIfaceUartProtocol__Group__0 )
            // InternalIFACE.g:252:4: rule__GSSIfaceUartProtocol__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSIfaceUartProtocol"


    // $ANTLR start "entryRuleGSSIfaceConstSize"
    // InternalIFACE.g:261:1: entryRuleGSSIfaceConstSize : ruleGSSIfaceConstSize EOF ;
    public final void entryRuleGSSIfaceConstSize() throws RecognitionException {
        try {
            // InternalIFACE.g:262:1: ( ruleGSSIfaceConstSize EOF )
            // InternalIFACE.g:263:1: ruleGSSIfaceConstSize EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSIfaceConstSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeRule()); 
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
    // $ANTLR end "entryRuleGSSIfaceConstSize"


    // $ANTLR start "ruleGSSIfaceConstSize"
    // InternalIFACE.g:270:1: ruleGSSIfaceConstSize : ( ( rule__GSSIfaceConstSize__Group__0 ) ) ;
    public final void ruleGSSIfaceConstSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:274:2: ( ( ( rule__GSSIfaceConstSize__Group__0 ) ) )
            // InternalIFACE.g:275:2: ( ( rule__GSSIfaceConstSize__Group__0 ) )
            {
            // InternalIFACE.g:275:2: ( ( rule__GSSIfaceConstSize__Group__0 ) )
            // InternalIFACE.g:276:3: ( rule__GSSIfaceConstSize__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getGroup()); 
            }
            // InternalIFACE.g:277:3: ( rule__GSSIfaceConstSize__Group__0 )
            // InternalIFACE.g:277:4: rule__GSSIfaceConstSize__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSIfaceConstSize"


    // $ANTLR start "entryRuleGSSIfaceSizeFieldOffset"
    // InternalIFACE.g:286:1: entryRuleGSSIfaceSizeFieldOffset : ruleGSSIfaceSizeFieldOffset EOF ;
    public final void entryRuleGSSIfaceSizeFieldOffset() throws RecognitionException {
        try {
            // InternalIFACE.g:287:1: ( ruleGSSIfaceSizeFieldOffset EOF )
            // InternalIFACE.g:288:1: ruleGSSIfaceSizeFieldOffset EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSIfaceSizeFieldOffset();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetRule()); 
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
    // $ANTLR end "entryRuleGSSIfaceSizeFieldOffset"


    // $ANTLR start "ruleGSSIfaceSizeFieldOffset"
    // InternalIFACE.g:295:1: ruleGSSIfaceSizeFieldOffset : ( ( rule__GSSIfaceSizeFieldOffset__Group__0 ) ) ;
    public final void ruleGSSIfaceSizeFieldOffset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:299:2: ( ( ( rule__GSSIfaceSizeFieldOffset__Group__0 ) ) )
            // InternalIFACE.g:300:2: ( ( rule__GSSIfaceSizeFieldOffset__Group__0 ) )
            {
            // InternalIFACE.g:300:2: ( ( rule__GSSIfaceSizeFieldOffset__Group__0 ) )
            // InternalIFACE.g:301:3: ( rule__GSSIfaceSizeFieldOffset__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getGroup()); 
            }
            // InternalIFACE.g:302:3: ( rule__GSSIfaceSizeFieldOffset__Group__0 )
            // InternalIFACE.g:302:4: rule__GSSIfaceSizeFieldOffset__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSIfaceSizeFieldOffset"


    // $ANTLR start "entryRuleGSSIfaceSizeFieldTrim"
    // InternalIFACE.g:311:1: entryRuleGSSIfaceSizeFieldTrim : ruleGSSIfaceSizeFieldTrim EOF ;
    public final void entryRuleGSSIfaceSizeFieldTrim() throws RecognitionException {
        try {
            // InternalIFACE.g:312:1: ( ruleGSSIfaceSizeFieldTrim EOF )
            // InternalIFACE.g:313:1: ruleGSSIfaceSizeFieldTrim EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSIfaceSizeFieldTrim();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimRule()); 
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
    // $ANTLR end "entryRuleGSSIfaceSizeFieldTrim"


    // $ANTLR start "ruleGSSIfaceSizeFieldTrim"
    // InternalIFACE.g:320:1: ruleGSSIfaceSizeFieldTrim : ( ( rule__GSSIfaceSizeFieldTrim__Group__0 ) ) ;
    public final void ruleGSSIfaceSizeFieldTrim() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:324:2: ( ( ( rule__GSSIfaceSizeFieldTrim__Group__0 ) ) )
            // InternalIFACE.g:325:2: ( ( rule__GSSIfaceSizeFieldTrim__Group__0 ) )
            {
            // InternalIFACE.g:325:2: ( ( rule__GSSIfaceSizeFieldTrim__Group__0 ) )
            // InternalIFACE.g:326:3: ( rule__GSSIfaceSizeFieldTrim__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getGroup()); 
            }
            // InternalIFACE.g:327:3: ( rule__GSSIfaceSizeFieldTrim__Group__0 )
            // InternalIFACE.g:327:4: rule__GSSIfaceSizeFieldTrim__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSIfaceSizeFieldTrim"


    // $ANTLR start "entryRuleGSSIfaceSyncPattern"
    // InternalIFACE.g:336:1: entryRuleGSSIfaceSyncPattern : ruleGSSIfaceSyncPattern EOF ;
    public final void entryRuleGSSIfaceSyncPattern() throws RecognitionException {
        try {
            // InternalIFACE.g:337:1: ( ruleGSSIfaceSyncPattern EOF )
            // InternalIFACE.g:338:1: ruleGSSIfaceSyncPattern EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSIfaceSyncPattern();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSyncPatternRule()); 
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
    // $ANTLR end "entryRuleGSSIfaceSyncPattern"


    // $ANTLR start "ruleGSSIfaceSyncPattern"
    // InternalIFACE.g:345:1: ruleGSSIfaceSyncPattern : ( ( rule__GSSIfaceSyncPattern__Group__0 ) ) ;
    public final void ruleGSSIfaceSyncPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:349:2: ( ( ( rule__GSSIfaceSyncPattern__Group__0 ) ) )
            // InternalIFACE.g:350:2: ( ( rule__GSSIfaceSyncPattern__Group__0 ) )
            {
            // InternalIFACE.g:350:2: ( ( rule__GSSIfaceSyncPattern__Group__0 ) )
            // InternalIFACE.g:351:3: ( rule__GSSIfaceSyncPattern__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getGroup()); 
            }
            // InternalIFACE.g:352:3: ( rule__GSSIfaceSyncPattern__Group__0 )
            // InternalIFACE.g:352:4: rule__GSSIfaceSyncPattern__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSyncPattern__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSyncPatternAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSIfaceSyncPattern"


    // $ANTLR start "entryRuleGSSIfaceSpWTCPort"
    // InternalIFACE.g:361:1: entryRuleGSSIfaceSpWTCPort : ruleGSSIfaceSpWTCPort EOF ;
    public final void entryRuleGSSIfaceSpWTCPort() throws RecognitionException {
        try {
            // InternalIFACE.g:362:1: ( ruleGSSIfaceSpWTCPort EOF )
            // InternalIFACE.g:363:1: ruleGSSIfaceSpWTCPort EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSIfaceSpWTCPort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWTCPortRule()); 
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
    // $ANTLR end "entryRuleGSSIfaceSpWTCPort"


    // $ANTLR start "ruleGSSIfaceSpWTCPort"
    // InternalIFACE.g:370:1: ruleGSSIfaceSpWTCPort : ( ( rule__GSSIfaceSpWTCPort__Group__0 ) ) ;
    public final void ruleGSSIfaceSpWTCPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:374:2: ( ( ( rule__GSSIfaceSpWTCPort__Group__0 ) ) )
            // InternalIFACE.g:375:2: ( ( rule__GSSIfaceSpWTCPort__Group__0 ) )
            {
            // InternalIFACE.g:375:2: ( ( rule__GSSIfaceSpWTCPort__Group__0 ) )
            // InternalIFACE.g:376:3: ( rule__GSSIfaceSpWTCPort__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getGroup()); 
            }
            // InternalIFACE.g:377:3: ( rule__GSSIfaceSpWTCPort__Group__0 )
            // InternalIFACE.g:377:4: rule__GSSIfaceSpWTCPort__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWTCPort__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWTCPortAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSIfaceSpWTCPort"


    // $ANTLR start "entryRuleGSSIfaceDummyPort"
    // InternalIFACE.g:386:1: entryRuleGSSIfaceDummyPort : ruleGSSIfaceDummyPort EOF ;
    public final void entryRuleGSSIfaceDummyPort() throws RecognitionException {
        try {
            // InternalIFACE.g:387:1: ( ruleGSSIfaceDummyPort EOF )
            // InternalIFACE.g:388:1: ruleGSSIfaceDummyPort EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceDummyPortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSIfaceDummyPort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceDummyPortRule()); 
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
    // $ANTLR end "entryRuleGSSIfaceDummyPort"


    // $ANTLR start "ruleGSSIfaceDummyPort"
    // InternalIFACE.g:395:1: ruleGSSIfaceDummyPort : ( ( rule__GSSIfaceDummyPort__Group__0 ) ) ;
    public final void ruleGSSIfaceDummyPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:399:2: ( ( ( rule__GSSIfaceDummyPort__Group__0 ) ) )
            // InternalIFACE.g:400:2: ( ( rule__GSSIfaceDummyPort__Group__0 ) )
            {
            // InternalIFACE.g:400:2: ( ( rule__GSSIfaceDummyPort__Group__0 ) )
            // InternalIFACE.g:401:3: ( rule__GSSIfaceDummyPort__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceDummyPortAccess().getGroup()); 
            }
            // InternalIFACE.g:402:3: ( rule__GSSIfaceDummyPort__Group__0 )
            // InternalIFACE.g:402:4: rule__GSSIfaceDummyPort__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceDummyPort__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceDummyPortAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSIfaceDummyPort"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalIFACE.g:411:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalIFACE.g:412:1: ( ruleQualifiedName EOF )
            // InternalIFACE.g:413:1: ruleQualifiedName EOF
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
    // InternalIFACE.g:420:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:424:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalIFACE.g:425:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalIFACE.g:425:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalIFACE.g:426:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalIFACE.g:427:3: ( rule__QualifiedName__Group__0 )
            // InternalIFACE.g:427:4: rule__QualifiedName__Group__0
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
    // InternalIFACE.g:436:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalIFACE.g:437:1: ( ruleVersion EOF )
            // InternalIFACE.g:438:1: ruleVersion EOF
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
    // InternalIFACE.g:445:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:449:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalIFACE.g:450:2: ( ( rule__Version__Group__0 ) )
            {
            // InternalIFACE.g:450:2: ( ( rule__Version__Group__0 ) )
            // InternalIFACE.g:451:3: ( rule__Version__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup()); 
            }
            // InternalIFACE.g:452:3: ( rule__Version__Group__0 )
            // InternalIFACE.g:452:4: rule__Version__Group__0
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
    // InternalIFACE.g:461:1: entryRuleVersionedQualifiedName : ruleVersionedQualifiedName EOF ;
    public final void entryRuleVersionedQualifiedName() throws RecognitionException {
        try {
            // InternalIFACE.g:462:1: ( ruleVersionedQualifiedName EOF )
            // InternalIFACE.g:463:1: ruleVersionedQualifiedName EOF
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
    // InternalIFACE.g:470:1: ruleVersionedQualifiedName : ( ( rule__VersionedQualifiedName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:474:2: ( ( ( rule__VersionedQualifiedName__Group__0 ) ) )
            // InternalIFACE.g:475:2: ( ( rule__VersionedQualifiedName__Group__0 ) )
            {
            // InternalIFACE.g:475:2: ( ( rule__VersionedQualifiedName__Group__0 ) )
            // InternalIFACE.g:476:3: ( rule__VersionedQualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); 
            }
            // InternalIFACE.g:477:3: ( rule__VersionedQualifiedName__Group__0 )
            // InternalIFACE.g:477:4: rule__VersionedQualifiedName__Group__0
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
    // InternalIFACE.g:486:1: entryRuleINTEGER : ruleINTEGER EOF ;
    public final void entryRuleINTEGER() throws RecognitionException {
        try {
            // InternalIFACE.g:487:1: ( ruleINTEGER EOF )
            // InternalIFACE.g:488:1: ruleINTEGER EOF
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
    // InternalIFACE.g:495:1: ruleINTEGER : ( ( rule__INTEGER__Alternatives ) ) ;
    public final void ruleINTEGER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:499:2: ( ( ( rule__INTEGER__Alternatives ) ) )
            // InternalIFACE.g:500:2: ( ( rule__INTEGER__Alternatives ) )
            {
            // InternalIFACE.g:500:2: ( ( rule__INTEGER__Alternatives ) )
            // InternalIFACE.g:501:3: ( rule__INTEGER__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getAlternatives()); 
            }
            // InternalIFACE.g:502:3: ( rule__INTEGER__Alternatives )
            // InternalIFACE.g:502:4: rule__INTEGER__Alternatives
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


    // $ANTLR start "ruleGSSIfaceSpWPortType"
    // InternalIFACE.g:511:1: ruleGSSIfaceSpWPortType : ( ( rule__GSSIfaceSpWPortType__Alternatives ) ) ;
    public final void ruleGSSIfaceSpWPortType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:515:1: ( ( ( rule__GSSIfaceSpWPortType__Alternatives ) ) )
            // InternalIFACE.g:516:2: ( ( rule__GSSIfaceSpWPortType__Alternatives ) )
            {
            // InternalIFACE.g:516:2: ( ( rule__GSSIfaceSpWPortType__Alternatives ) )
            // InternalIFACE.g:517:3: ( rule__GSSIfaceSpWPortType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortTypeAccess().getAlternatives()); 
            }
            // InternalIFACE.g:518:3: ( rule__GSSIfaceSpWPortType__Alternatives )
            // InternalIFACE.g:518:4: rule__GSSIfaceSpWPortType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPortType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSIfaceSpWPortType"


    // $ANTLR start "ruleGSSIfaceUartPortBaudRate"
    // InternalIFACE.g:527:1: ruleGSSIfaceUartPortBaudRate : ( ( rule__GSSIfaceUartPortBaudRate__Alternatives ) ) ;
    public final void ruleGSSIfaceUartPortBaudRate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:531:1: ( ( ( rule__GSSIfaceUartPortBaudRate__Alternatives ) ) )
            // InternalIFACE.g:532:2: ( ( rule__GSSIfaceUartPortBaudRate__Alternatives ) )
            {
            // InternalIFACE.g:532:2: ( ( rule__GSSIfaceUartPortBaudRate__Alternatives ) )
            // InternalIFACE.g:533:3: ( rule__GSSIfaceUartPortBaudRate__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortBaudRateAccess().getAlternatives()); 
            }
            // InternalIFACE.g:534:3: ( rule__GSSIfaceUartPortBaudRate__Alternatives )
            // InternalIFACE.g:534:4: rule__GSSIfaceUartPortBaudRate__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPortBaudRate__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortBaudRateAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSIfaceUartPortBaudRate"


    // $ANTLR start "ruleGSSIfaceUartPortParity"
    // InternalIFACE.g:543:1: ruleGSSIfaceUartPortParity : ( ( rule__GSSIfaceUartPortParity__Alternatives ) ) ;
    public final void ruleGSSIfaceUartPortParity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:547:1: ( ( ( rule__GSSIfaceUartPortParity__Alternatives ) ) )
            // InternalIFACE.g:548:2: ( ( rule__GSSIfaceUartPortParity__Alternatives ) )
            {
            // InternalIFACE.g:548:2: ( ( rule__GSSIfaceUartPortParity__Alternatives ) )
            // InternalIFACE.g:549:3: ( rule__GSSIfaceUartPortParity__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortParityAccess().getAlternatives()); 
            }
            // InternalIFACE.g:550:3: ( rule__GSSIfaceUartPortParity__Alternatives )
            // InternalIFACE.g:550:4: rule__GSSIfaceUartPortParity__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPortParity__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortParityAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSIfaceUartPortParity"


    // $ANTLR start "ruleGSSIfaceUartPortDataBits"
    // InternalIFACE.g:559:1: ruleGSSIfaceUartPortDataBits : ( ( rule__GSSIfaceUartPortDataBits__Alternatives ) ) ;
    public final void ruleGSSIfaceUartPortDataBits() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:563:1: ( ( ( rule__GSSIfaceUartPortDataBits__Alternatives ) ) )
            // InternalIFACE.g:564:2: ( ( rule__GSSIfaceUartPortDataBits__Alternatives ) )
            {
            // InternalIFACE.g:564:2: ( ( rule__GSSIfaceUartPortDataBits__Alternatives ) )
            // InternalIFACE.g:565:3: ( rule__GSSIfaceUartPortDataBits__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortDataBitsAccess().getAlternatives()); 
            }
            // InternalIFACE.g:566:3: ( rule__GSSIfaceUartPortDataBits__Alternatives )
            // InternalIFACE.g:566:4: rule__GSSIfaceUartPortDataBits__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPortDataBits__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortDataBitsAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSIfaceUartPortDataBits"


    // $ANTLR start "ruleGSSIfaceUartPortStopBits"
    // InternalIFACE.g:575:1: ruleGSSIfaceUartPortStopBits : ( ( rule__GSSIfaceUartPortStopBits__Alternatives ) ) ;
    public final void ruleGSSIfaceUartPortStopBits() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:579:1: ( ( ( rule__GSSIfaceUartPortStopBits__Alternatives ) ) )
            // InternalIFACE.g:580:2: ( ( rule__GSSIfaceUartPortStopBits__Alternatives ) )
            {
            // InternalIFACE.g:580:2: ( ( rule__GSSIfaceUartPortStopBits__Alternatives ) )
            // InternalIFACE.g:581:3: ( rule__GSSIfaceUartPortStopBits__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortStopBitsAccess().getAlternatives()); 
            }
            // InternalIFACE.g:582:3: ( rule__GSSIfaceUartPortStopBits__Alternatives )
            // InternalIFACE.g:582:4: rule__GSSIfaceUartPortStopBits__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPortStopBits__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortStopBitsAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSIfaceUartPortStopBits"


    // $ANTLR start "ruleGSSIfaceUartPortFlowControl"
    // InternalIFACE.g:591:1: ruleGSSIfaceUartPortFlowControl : ( ( rule__GSSIfaceUartPortFlowControl__Alternatives ) ) ;
    public final void ruleGSSIfaceUartPortFlowControl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:595:1: ( ( ( rule__GSSIfaceUartPortFlowControl__Alternatives ) ) )
            // InternalIFACE.g:596:2: ( ( rule__GSSIfaceUartPortFlowControl__Alternatives ) )
            {
            // InternalIFACE.g:596:2: ( ( rule__GSSIfaceUartPortFlowControl__Alternatives ) )
            // InternalIFACE.g:597:3: ( rule__GSSIfaceUartPortFlowControl__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortFlowControlAccess().getAlternatives()); 
            }
            // InternalIFACE.g:598:3: ( rule__GSSIfaceUartPortFlowControl__Alternatives )
            // InternalIFACE.g:598:4: rule__GSSIfaceUartPortFlowControl__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPortFlowControl__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortFlowControlAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSIfaceUartPortFlowControl"


    // $ANTLR start "ruleGSSIfaceUartProtocolUnit"
    // InternalIFACE.g:607:1: ruleGSSIfaceUartProtocolUnit : ( ( rule__GSSIfaceUartProtocolUnit__Alternatives ) ) ;
    public final void ruleGSSIfaceUartProtocolUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:611:1: ( ( ( rule__GSSIfaceUartProtocolUnit__Alternatives ) ) )
            // InternalIFACE.g:612:2: ( ( rule__GSSIfaceUartProtocolUnit__Alternatives ) )
            {
            // InternalIFACE.g:612:2: ( ( rule__GSSIfaceUartProtocolUnit__Alternatives ) )
            // InternalIFACE.g:613:3: ( rule__GSSIfaceUartProtocolUnit__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolUnitAccess().getAlternatives()); 
            }
            // InternalIFACE.g:614:3: ( rule__GSSIfaceUartProtocolUnit__Alternatives )
            // InternalIFACE.g:614:4: rule__GSSIfaceUartProtocolUnit__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocolUnit__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolUnitAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSIfaceUartProtocolUnit"


    // $ANTLR start "ruleGSSIfaceUartProtocolPower"
    // InternalIFACE.g:623:1: ruleGSSIfaceUartProtocolPower : ( ( rule__GSSIfaceUartProtocolPower__Alternatives ) ) ;
    public final void ruleGSSIfaceUartProtocolPower() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:627:1: ( ( ( rule__GSSIfaceUartProtocolPower__Alternatives ) ) )
            // InternalIFACE.g:628:2: ( ( rule__GSSIfaceUartProtocolPower__Alternatives ) )
            {
            // InternalIFACE.g:628:2: ( ( rule__GSSIfaceUartProtocolPower__Alternatives ) )
            // InternalIFACE.g:629:3: ( rule__GSSIfaceUartProtocolPower__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolPowerAccess().getAlternatives()); 
            }
            // InternalIFACE.g:630:3: ( rule__GSSIfaceUartProtocolPower__Alternatives )
            // InternalIFACE.g:630:4: rule__GSSIfaceUartProtocolPower__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocolPower__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolPowerAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSIfaceUartProtocolPower"


    // $ANTLR start "rule__GSSIfacePort__Alternatives"
    // InternalIFACE.g:638:1: rule__GSSIfacePort__Alternatives : ( ( ruleGSSIfaceSpWPort ) | ( ruleGSSIfaceUartPort ) | ( ruleGSSIfaceSpWTCPort ) | ( ruleGSSIfaceDummyPort ) );
    public final void rule__GSSIfacePort__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:642:1: ( ( ruleGSSIfaceSpWPort ) | ( ruleGSSIfaceUartPort ) | ( ruleGSSIfaceSpWTCPort ) | ( ruleGSSIfaceDummyPort ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt1=1;
                }
                break;
            case 48:
                {
                alt1=2;
                }
                break;
            case 63:
                {
                alt1=3;
                }
                break;
            case 65:
                {
                alt1=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalIFACE.g:643:2: ( ruleGSSIfaceSpWPort )
                    {
                    // InternalIFACE.g:643:2: ( ruleGSSIfaceSpWPort )
                    // InternalIFACE.g:644:3: ruleGSSIfaceSpWPort
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSpWPortParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleGSSIfaceSpWPort();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSpWPortParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:649:2: ( ruleGSSIfaceUartPort )
                    {
                    // InternalIFACE.g:649:2: ( ruleGSSIfaceUartPort )
                    // InternalIFACE.g:650:3: ruleGSSIfaceUartPort
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfacePortAccess().getGSSIfaceUartPortParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleGSSIfaceUartPort();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfacePortAccess().getGSSIfaceUartPortParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIFACE.g:655:2: ( ruleGSSIfaceSpWTCPort )
                    {
                    // InternalIFACE.g:655:2: ( ruleGSSIfaceSpWTCPort )
                    // InternalIFACE.g:656:3: ruleGSSIfaceSpWTCPort
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSpWTCPortParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleGSSIfaceSpWTCPort();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSpWTCPortParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalIFACE.g:661:2: ( ruleGSSIfaceDummyPort )
                    {
                    // InternalIFACE.g:661:2: ( ruleGSSIfaceDummyPort )
                    // InternalIFACE.g:662:3: ruleGSSIfaceDummyPort
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfacePortAccess().getGSSIfaceDummyPortParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleGSSIfaceDummyPort();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfacePortAccess().getGSSIfaceDummyPortParserRuleCall_3()); 
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
    // $ANTLR end "rule__GSSIfacePort__Alternatives"


    // $ANTLR start "rule__Version__Alternatives_0"
    // InternalIFACE.g:671:1: rule__Version__Alternatives_0 : ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) );
    public final void rule__Version__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:675:1: ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    alt2=2;
                }
                else if ( (LA2_1==EOF||LA2_1==35||LA2_1==66||LA2_1==68) ) {
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
                    // InternalIFACE.g:676:2: ( RULE_INT )
                    {
                    // InternalIFACE.g:676:2: ( RULE_INT )
                    // InternalIFACE.g:677:3: RULE_INT
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
                    // InternalIFACE.g:682:2: ( ( rule__Version__Group_0_1__0 ) )
                    {
                    // InternalIFACE.g:682:2: ( ( rule__Version__Group_0_1__0 ) )
                    // InternalIFACE.g:683:3: ( rule__Version__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_0_1()); 
                    }
                    // InternalIFACE.g:684:3: ( rule__Version__Group_0_1__0 )
                    // InternalIFACE.g:684:4: rule__Version__Group_0_1__0
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
    // InternalIFACE.g:692:1: rule__Version__Alternatives_1_1 : ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) );
    public final void rule__Version__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:696:1: ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    alt3=2;
                }
                else if ( (LA3_1==EOF||LA3_1==35||LA3_1==66||LA3_1==68) ) {
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
                    // InternalIFACE.g:697:2: ( RULE_INT )
                    {
                    // InternalIFACE.g:697:2: ( RULE_INT )
                    // InternalIFACE.g:698:3: RULE_INT
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
                    // InternalIFACE.g:703:2: ( ( rule__Version__Group_1_1_1__0 ) )
                    {
                    // InternalIFACE.g:703:2: ( ( rule__Version__Group_1_1_1__0 ) )
                    // InternalIFACE.g:704:3: ( rule__Version__Group_1_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_1_1_1()); 
                    }
                    // InternalIFACE.g:705:3: ( rule__Version__Group_1_1_1__0 )
                    // InternalIFACE.g:705:4: rule__Version__Group_1_1_1__0
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
    // InternalIFACE.g:713:1: rule__INTEGER__Alternatives : ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) );
    public final void rule__INTEGER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:717:1: ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||LA4_0==69) ) {
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
                    // InternalIFACE.g:718:2: ( ( rule__INTEGER__Group_0__0 ) )
                    {
                    // InternalIFACE.g:718:2: ( ( rule__INTEGER__Group_0__0 ) )
                    // InternalIFACE.g:719:3: ( rule__INTEGER__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getINTEGERAccess().getGroup_0()); 
                    }
                    // InternalIFACE.g:720:3: ( rule__INTEGER__Group_0__0 )
                    // InternalIFACE.g:720:4: rule__INTEGER__Group_0__0
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
                    // InternalIFACE.g:724:2: ( RULE_HEXADECIMAL )
                    {
                    // InternalIFACE.g:724:2: ( RULE_HEXADECIMAL )
                    // InternalIFACE.g:725:3: RULE_HEXADECIMAL
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


    // $ANTLR start "rule__GSSIfaceSpWPortType__Alternatives"
    // InternalIFACE.g:734:1: rule__GSSIfaceSpWPortType__Alternatives : ( ( ( 'usb' ) ) | ( ( 'mk2' ) ) | ( ( 'pci' ) ) );
    public final void rule__GSSIfaceSpWPortType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:738:1: ( ( ( 'usb' ) ) | ( ( 'mk2' ) ) | ( ( 'pci' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 14:
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
                    // InternalIFACE.g:739:2: ( ( 'usb' ) )
                    {
                    // InternalIFACE.g:739:2: ( ( 'usb' ) )
                    // InternalIFACE.g:740:3: ( 'usb' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceSpWPortTypeAccess().getUsbEnumLiteralDeclaration_0()); 
                    }
                    // InternalIFACE.g:741:3: ( 'usb' )
                    // InternalIFACE.g:741:4: 'usb'
                    {
                    match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceSpWPortTypeAccess().getUsbEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:745:2: ( ( 'mk2' ) )
                    {
                    // InternalIFACE.g:745:2: ( ( 'mk2' ) )
                    // InternalIFACE.g:746:3: ( 'mk2' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceSpWPortTypeAccess().getMk2EnumLiteralDeclaration_1()); 
                    }
                    // InternalIFACE.g:747:3: ( 'mk2' )
                    // InternalIFACE.g:747:4: 'mk2'
                    {
                    match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceSpWPortTypeAccess().getMk2EnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIFACE.g:751:2: ( ( 'pci' ) )
                    {
                    // InternalIFACE.g:751:2: ( ( 'pci' ) )
                    // InternalIFACE.g:752:3: ( 'pci' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceSpWPortTypeAccess().getPciEnumLiteralDeclaration_2()); 
                    }
                    // InternalIFACE.g:753:3: ( 'pci' )
                    // InternalIFACE.g:753:4: 'pci'
                    {
                    match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceSpWPortTypeAccess().getPciEnumLiteralDeclaration_2()); 
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
    // $ANTLR end "rule__GSSIfaceSpWPortType__Alternatives"


    // $ANTLR start "rule__GSSIfaceUartPortBaudRate__Alternatives"
    // InternalIFACE.g:761:1: rule__GSSIfaceUartPortBaudRate__Alternatives : ( ( ( '38400bauds' ) ) | ( ( '115200bauds' ) ) );
    public final void rule__GSSIfaceUartPortBaudRate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:765:1: ( ( ( '38400bauds' ) ) | ( ( '115200bauds' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
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
                    // InternalIFACE.g:766:2: ( ( '38400bauds' ) )
                    {
                    // InternalIFACE.g:766:2: ( ( '38400bauds' ) )
                    // InternalIFACE.g:767:3: ( '38400bauds' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortBaudRateAccess().get_38400EnumLiteralDeclaration_0()); 
                    }
                    // InternalIFACE.g:768:3: ( '38400bauds' )
                    // InternalIFACE.g:768:4: '38400bauds'
                    {
                    match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartPortBaudRateAccess().get_38400EnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:772:2: ( ( '115200bauds' ) )
                    {
                    // InternalIFACE.g:772:2: ( ( '115200bauds' ) )
                    // InternalIFACE.g:773:3: ( '115200bauds' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortBaudRateAccess().get_115200EnumLiteralDeclaration_1()); 
                    }
                    // InternalIFACE.g:774:3: ( '115200bauds' )
                    // InternalIFACE.g:774:4: '115200bauds'
                    {
                    match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartPortBaudRateAccess().get_115200EnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__GSSIfaceUartPortBaudRate__Alternatives"


    // $ANTLR start "rule__GSSIfaceUartPortParity__Alternatives"
    // InternalIFACE.g:782:1: rule__GSSIfaceUartPortParity__Alternatives : ( ( ( 'NO' ) ) | ( ( 'ODD' ) ) | ( ( 'EVEN' ) ) | ( ( 'MARK' ) ) | ( ( 'SPACE' ) ) );
    public final void rule__GSSIfaceUartPortParity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:786:1: ( ( ( 'NO' ) ) | ( ( 'ODD' ) ) | ( ( 'EVEN' ) ) | ( ( 'MARK' ) ) | ( ( 'SPACE' ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 20:
                {
                alt7=4;
                }
                break;
            case 21:
                {
                alt7=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalIFACE.g:787:2: ( ( 'NO' ) )
                    {
                    // InternalIFACE.g:787:2: ( ( 'NO' ) )
                    // InternalIFACE.g:788:3: ( 'NO' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortParityAccess().getNOEnumLiteralDeclaration_0()); 
                    }
                    // InternalIFACE.g:789:3: ( 'NO' )
                    // InternalIFACE.g:789:4: 'NO'
                    {
                    match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartPortParityAccess().getNOEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:793:2: ( ( 'ODD' ) )
                    {
                    // InternalIFACE.g:793:2: ( ( 'ODD' ) )
                    // InternalIFACE.g:794:3: ( 'ODD' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortParityAccess().getODDEnumLiteralDeclaration_1()); 
                    }
                    // InternalIFACE.g:795:3: ( 'ODD' )
                    // InternalIFACE.g:795:4: 'ODD'
                    {
                    match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartPortParityAccess().getODDEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIFACE.g:799:2: ( ( 'EVEN' ) )
                    {
                    // InternalIFACE.g:799:2: ( ( 'EVEN' ) )
                    // InternalIFACE.g:800:3: ( 'EVEN' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortParityAccess().getEVENEnumLiteralDeclaration_2()); 
                    }
                    // InternalIFACE.g:801:3: ( 'EVEN' )
                    // InternalIFACE.g:801:4: 'EVEN'
                    {
                    match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartPortParityAccess().getEVENEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalIFACE.g:805:2: ( ( 'MARK' ) )
                    {
                    // InternalIFACE.g:805:2: ( ( 'MARK' ) )
                    // InternalIFACE.g:806:3: ( 'MARK' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortParityAccess().getMARKEnumLiteralDeclaration_3()); 
                    }
                    // InternalIFACE.g:807:3: ( 'MARK' )
                    // InternalIFACE.g:807:4: 'MARK'
                    {
                    match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartPortParityAccess().getMARKEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalIFACE.g:811:2: ( ( 'SPACE' ) )
                    {
                    // InternalIFACE.g:811:2: ( ( 'SPACE' ) )
                    // InternalIFACE.g:812:3: ( 'SPACE' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortParityAccess().getSPACEEnumLiteralDeclaration_4()); 
                    }
                    // InternalIFACE.g:813:3: ( 'SPACE' )
                    // InternalIFACE.g:813:4: 'SPACE'
                    {
                    match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartPortParityAccess().getSPACEEnumLiteralDeclaration_4()); 
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
    // $ANTLR end "rule__GSSIfaceUartPortParity__Alternatives"


    // $ANTLR start "rule__GSSIfaceUartPortDataBits__Alternatives"
    // InternalIFACE.g:821:1: rule__GSSIfaceUartPortDataBits__Alternatives : ( ( ( '5bits' ) ) | ( ( '6bits' ) ) | ( ( '7bits' ) ) | ( ( '8bits' ) ) );
    public final void rule__GSSIfaceUartPortDataBits__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:825:1: ( ( ( '5bits' ) ) | ( ( '6bits' ) ) | ( ( '7bits' ) ) | ( ( '8bits' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            case 25:
                {
                alt8=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalIFACE.g:826:2: ( ( '5bits' ) )
                    {
                    // InternalIFACE.g:826:2: ( ( '5bits' ) )
                    // InternalIFACE.g:827:3: ( '5bits' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_5EnumLiteralDeclaration_0()); 
                    }
                    // InternalIFACE.g:828:3: ( '5bits' )
                    // InternalIFACE.g:828:4: '5bits'
                    {
                    match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_5EnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:832:2: ( ( '6bits' ) )
                    {
                    // InternalIFACE.g:832:2: ( ( '6bits' ) )
                    // InternalIFACE.g:833:3: ( '6bits' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_6EnumLiteralDeclaration_1()); 
                    }
                    // InternalIFACE.g:834:3: ( '6bits' )
                    // InternalIFACE.g:834:4: '6bits'
                    {
                    match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_6EnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIFACE.g:838:2: ( ( '7bits' ) )
                    {
                    // InternalIFACE.g:838:2: ( ( '7bits' ) )
                    // InternalIFACE.g:839:3: ( '7bits' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_7EnumLiteralDeclaration_2()); 
                    }
                    // InternalIFACE.g:840:3: ( '7bits' )
                    // InternalIFACE.g:840:4: '7bits'
                    {
                    match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_7EnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalIFACE.g:844:2: ( ( '8bits' ) )
                    {
                    // InternalIFACE.g:844:2: ( ( '8bits' ) )
                    // InternalIFACE.g:845:3: ( '8bits' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_8EnumLiteralDeclaration_3()); 
                    }
                    // InternalIFACE.g:846:3: ( '8bits' )
                    // InternalIFACE.g:846:4: '8bits'
                    {
                    match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_8EnumLiteralDeclaration_3()); 
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
    // $ANTLR end "rule__GSSIfaceUartPortDataBits__Alternatives"


    // $ANTLR start "rule__GSSIfaceUartPortStopBits__Alternatives"
    // InternalIFACE.g:854:1: rule__GSSIfaceUartPortStopBits__Alternatives : ( ( ( '1bit' ) ) | ( ( '2bits' ) ) );
    public final void rule__GSSIfaceUartPortStopBits__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:858:1: ( ( ( '1bit' ) ) | ( ( '2bits' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            else if ( (LA9_0==27) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalIFACE.g:859:2: ( ( '1bit' ) )
                    {
                    // InternalIFACE.g:859:2: ( ( '1bit' ) )
                    // InternalIFACE.g:860:3: ( '1bit' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortStopBitsAccess().get_1EnumLiteralDeclaration_0()); 
                    }
                    // InternalIFACE.g:861:3: ( '1bit' )
                    // InternalIFACE.g:861:4: '1bit'
                    {
                    match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartPortStopBitsAccess().get_1EnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:865:2: ( ( '2bits' ) )
                    {
                    // InternalIFACE.g:865:2: ( ( '2bits' ) )
                    // InternalIFACE.g:866:3: ( '2bits' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortStopBitsAccess().get_2EnumLiteralDeclaration_1()); 
                    }
                    // InternalIFACE.g:867:3: ( '2bits' )
                    // InternalIFACE.g:867:4: '2bits'
                    {
                    match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartPortStopBitsAccess().get_2EnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__GSSIfaceUartPortStopBits__Alternatives"


    // $ANTLR start "rule__GSSIfaceUartPortFlowControl__Alternatives"
    // InternalIFACE.g:875:1: rule__GSSIfaceUartPortFlowControl__Alternatives : ( ( ( 'rts_cts' ) ) | ( ( 'xon_xoff' ) ) );
    public final void rule__GSSIfaceUartPortFlowControl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:879:1: ( ( ( 'rts_cts' ) ) | ( ( 'xon_xoff' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            else if ( (LA10_0==29) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalIFACE.g:880:2: ( ( 'rts_cts' ) )
                    {
                    // InternalIFACE.g:880:2: ( ( 'rts_cts' ) )
                    // InternalIFACE.g:881:3: ( 'rts_cts' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortFlowControlAccess().getRts_ctsEnumLiteralDeclaration_0()); 
                    }
                    // InternalIFACE.g:882:3: ( 'rts_cts' )
                    // InternalIFACE.g:882:4: 'rts_cts'
                    {
                    match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartPortFlowControlAccess().getRts_ctsEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:886:2: ( ( 'xon_xoff' ) )
                    {
                    // InternalIFACE.g:886:2: ( ( 'xon_xoff' ) )
                    // InternalIFACE.g:887:3: ( 'xon_xoff' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortFlowControlAccess().getXon_xoffEnumLiteralDeclaration_1()); 
                    }
                    // InternalIFACE.g:888:3: ( 'xon_xoff' )
                    // InternalIFACE.g:888:4: 'xon_xoff'
                    {
                    match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartPortFlowControlAccess().getXon_xoffEnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__GSSIfaceUartPortFlowControl__Alternatives"


    // $ANTLR start "rule__GSSIfaceUartProtocolUnit__Alternatives"
    // InternalIFACE.g:896:1: rule__GSSIfaceUartProtocolUnit__Alternatives : ( ( ( 'bytes' ) ) | ( ( 'bits' ) ) );
    public final void rule__GSSIfaceUartProtocolUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:900:1: ( ( ( 'bytes' ) ) | ( ( 'bits' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            else if ( (LA11_0==31) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalIFACE.g:901:2: ( ( 'bytes' ) )
                    {
                    // InternalIFACE.g:901:2: ( ( 'bytes' ) )
                    // InternalIFACE.g:902:3: ( 'bytes' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartProtocolUnitAccess().getBytesEnumLiteralDeclaration_0()); 
                    }
                    // InternalIFACE.g:903:3: ( 'bytes' )
                    // InternalIFACE.g:903:4: 'bytes'
                    {
                    match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartProtocolUnitAccess().getBytesEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:907:2: ( ( 'bits' ) )
                    {
                    // InternalIFACE.g:907:2: ( ( 'bits' ) )
                    // InternalIFACE.g:908:3: ( 'bits' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartProtocolUnitAccess().getBitsEnumLiteralDeclaration_1()); 
                    }
                    // InternalIFACE.g:909:3: ( 'bits' )
                    // InternalIFACE.g:909:4: 'bits'
                    {
                    match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartProtocolUnitAccess().getBitsEnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__GSSIfaceUartProtocolUnit__Alternatives"


    // $ANTLR start "rule__GSSIfaceUartProtocolPower__Alternatives"
    // InternalIFACE.g:917:1: rule__GSSIfaceUartProtocolPower__Alternatives : ( ( ( 'no' ) ) | ( ( '2bits' ) ) | ( ( '2_with_0' ) ) );
    public final void rule__GSSIfaceUartProtocolPower__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:921:1: ( ( ( 'no' ) ) | ( ( '2bits' ) ) | ( ( '2_with_0' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt12=1;
                }
                break;
            case 27:
                {
                alt12=2;
                }
                break;
            case 33:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalIFACE.g:922:2: ( ( 'no' ) )
                    {
                    // InternalIFACE.g:922:2: ( ( 'no' ) )
                    // InternalIFACE.g:923:3: ( 'no' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartProtocolPowerAccess().getNoEnumLiteralDeclaration_0()); 
                    }
                    // InternalIFACE.g:924:3: ( 'no' )
                    // InternalIFACE.g:924:4: 'no'
                    {
                    match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartProtocolPowerAccess().getNoEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:928:2: ( ( '2bits' ) )
                    {
                    // InternalIFACE.g:928:2: ( ( '2bits' ) )
                    // InternalIFACE.g:929:3: ( '2bits' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartProtocolPowerAccess().get_2EnumLiteralDeclaration_1()); 
                    }
                    // InternalIFACE.g:930:3: ( '2bits' )
                    // InternalIFACE.g:930:4: '2bits'
                    {
                    match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartProtocolPowerAccess().get_2EnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIFACE.g:934:2: ( ( '2_with_0' ) )
                    {
                    // InternalIFACE.g:934:2: ( ( '2_with_0' ) )
                    // InternalIFACE.g:935:3: ( '2_with_0' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartProtocolPowerAccess().get_2_with_0EnumLiteralDeclaration_2()); 
                    }
                    // InternalIFACE.g:936:3: ( '2_with_0' )
                    // InternalIFACE.g:936:4: '2_with_0'
                    {
                    match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartProtocolPowerAccess().get_2_with_0EnumLiteralDeclaration_2()); 
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
    // $ANTLR end "rule__GSSIfaceUartProtocolPower__Alternatives"


    // $ANTLR start "rule__GSSModelFile__Group__0"
    // InternalIFACE.g:944:1: rule__GSSModelFile__Group__0 : rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1 ;
    public final void rule__GSSModelFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:948:1: ( rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1 )
            // InternalIFACE.g:949:2: rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1
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
    // InternalIFACE.g:956:1: rule__GSSModelFile__Group__0__Impl : ( ( rule__GSSModelFile__ImportsAssignment_0 )* ) ;
    public final void rule__GSSModelFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:960:1: ( ( ( rule__GSSModelFile__ImportsAssignment_0 )* ) )
            // InternalIFACE.g:961:1: ( ( rule__GSSModelFile__ImportsAssignment_0 )* )
            {
            // InternalIFACE.g:961:1: ( ( rule__GSSModelFile__ImportsAssignment_0 )* )
            // InternalIFACE.g:962:2: ( rule__GSSModelFile__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getImportsAssignment_0()); 
            }
            // InternalIFACE.g:963:2: ( rule__GSSModelFile__ImportsAssignment_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==34) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalIFACE.g:963:3: rule__GSSModelFile__ImportsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__GSSModelFile__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalIFACE.g:971:1: rule__GSSModelFile__Group__1 : rule__GSSModelFile__Group__1__Impl ;
    public final void rule__GSSModelFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:975:1: ( rule__GSSModelFile__Group__1__Impl )
            // InternalIFACE.g:976:2: rule__GSSModelFile__Group__1__Impl
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
    // InternalIFACE.g:982:1: rule__GSSModelFile__Group__1__Impl : ( ( rule__GSSModelFile__ElementAssignment_1 ) ) ;
    public final void rule__GSSModelFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:986:1: ( ( ( rule__GSSModelFile__ElementAssignment_1 ) ) )
            // InternalIFACE.g:987:1: ( ( rule__GSSModelFile__ElementAssignment_1 ) )
            {
            // InternalIFACE.g:987:1: ( ( rule__GSSModelFile__ElementAssignment_1 ) )
            // InternalIFACE.g:988:2: ( rule__GSSModelFile__ElementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getElementAssignment_1()); 
            }
            // InternalIFACE.g:989:2: ( rule__GSSModelFile__ElementAssignment_1 )
            // InternalIFACE.g:989:3: rule__GSSModelFile__ElementAssignment_1
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
    // InternalIFACE.g:998:1: rule__GSSModelFileImport__Group__0 : rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1 ;
    public final void rule__GSSModelFileImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1002:1: ( rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1 )
            // InternalIFACE.g:1003:2: rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1
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
    // InternalIFACE.g:1010:1: rule__GSSModelFileImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__GSSModelFileImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1014:1: ( ( 'import' ) )
            // InternalIFACE.g:1015:1: ( 'import' )
            {
            // InternalIFACE.g:1015:1: ( 'import' )
            // InternalIFACE.g:1016:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getImportKeyword_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1025:1: rule__GSSModelFileImport__Group__1 : rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2 ;
    public final void rule__GSSModelFileImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1029:1: ( rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2 )
            // InternalIFACE.g:1030:2: rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2
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
    // InternalIFACE.g:1037:1: rule__GSSModelFileImport__Group__1__Impl : ( ( rule__GSSModelFileImport__ImportURIAssignment_1 ) ) ;
    public final void rule__GSSModelFileImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1041:1: ( ( ( rule__GSSModelFileImport__ImportURIAssignment_1 ) ) )
            // InternalIFACE.g:1042:1: ( ( rule__GSSModelFileImport__ImportURIAssignment_1 ) )
            {
            // InternalIFACE.g:1042:1: ( ( rule__GSSModelFileImport__ImportURIAssignment_1 ) )
            // InternalIFACE.g:1043:2: ( rule__GSSModelFileImport__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getImportURIAssignment_1()); 
            }
            // InternalIFACE.g:1044:2: ( rule__GSSModelFileImport__ImportURIAssignment_1 )
            // InternalIFACE.g:1044:3: rule__GSSModelFileImport__ImportURIAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSModelFileImport__ImportURIAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSModelFileImportAccess().getImportURIAssignment_1()); 
            }

            }


            }

        }
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
    // InternalIFACE.g:1052:1: rule__GSSModelFileImport__Group__2 : rule__GSSModelFileImport__Group__2__Impl ;
    public final void rule__GSSModelFileImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1056:1: ( rule__GSSModelFileImport__Group__2__Impl )
            // InternalIFACE.g:1057:2: rule__GSSModelFileImport__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSModelFileImport__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalIFACE.g:1063:1: rule__GSSModelFileImport__Group__2__Impl : ( ';' ) ;
    public final void rule__GSSModelFileImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1067:1: ( ( ';' ) )
            // InternalIFACE.g:1068:1: ( ';' )
            {
            // InternalIFACE.g:1068:1: ( ';' )
            // InternalIFACE.g:1069:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getSemicolonKeyword_2()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSModelFileImportAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__GSSIfacePortConfig__Group__0"
    // InternalIFACE.g:1079:1: rule__GSSIfacePortConfig__Group__0 : rule__GSSIfacePortConfig__Group__0__Impl rule__GSSIfacePortConfig__Group__1 ;
    public final void rule__GSSIfacePortConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1083:1: ( rule__GSSIfacePortConfig__Group__0__Impl rule__GSSIfacePortConfig__Group__1 )
            // InternalIFACE.g:1084:2: rule__GSSIfacePortConfig__Group__0__Impl rule__GSSIfacePortConfig__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSIfacePortConfig__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortConfig__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group__0"


    // $ANTLR start "rule__GSSIfacePortConfig__Group__0__Impl"
    // InternalIFACE.g:1091:1: rule__GSSIfacePortConfig__Group__0__Impl : ( 'portConfig' ) ;
    public final void rule__GSSIfacePortConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1095:1: ( ( 'portConfig' ) )
            // InternalIFACE.g:1096:1: ( 'portConfig' )
            {
            // InternalIFACE.g:1096:1: ( 'portConfig' )
            // InternalIFACE.g:1097:2: 'portConfig'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getPortConfigKeyword_0()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortConfigAccess().getPortConfigKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group__0__Impl"


    // $ANTLR start "rule__GSSIfacePortConfig__Group__1"
    // InternalIFACE.g:1106:1: rule__GSSIfacePortConfig__Group__1 : rule__GSSIfacePortConfig__Group__1__Impl rule__GSSIfacePortConfig__Group__2 ;
    public final void rule__GSSIfacePortConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1110:1: ( rule__GSSIfacePortConfig__Group__1__Impl rule__GSSIfacePortConfig__Group__2 )
            // InternalIFACE.g:1111:2: rule__GSSIfacePortConfig__Group__1__Impl rule__GSSIfacePortConfig__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSIfacePortConfig__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortConfig__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group__1"


    // $ANTLR start "rule__GSSIfacePortConfig__Group__1__Impl"
    // InternalIFACE.g:1118:1: rule__GSSIfacePortConfig__Group__1__Impl : ( ( rule__GSSIfacePortConfig__NameAssignment_1 ) ) ;
    public final void rule__GSSIfacePortConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1122:1: ( ( ( rule__GSSIfacePortConfig__NameAssignment_1 ) ) )
            // InternalIFACE.g:1123:1: ( ( rule__GSSIfacePortConfig__NameAssignment_1 ) )
            {
            // InternalIFACE.g:1123:1: ( ( rule__GSSIfacePortConfig__NameAssignment_1 ) )
            // InternalIFACE.g:1124:2: ( rule__GSSIfacePortConfig__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getNameAssignment_1()); 
            }
            // InternalIFACE.g:1125:2: ( rule__GSSIfacePortConfig__NameAssignment_1 )
            // InternalIFACE.g:1125:3: rule__GSSIfacePortConfig__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortConfig__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortConfigAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group__1__Impl"


    // $ANTLR start "rule__GSSIfacePortConfig__Group__2"
    // InternalIFACE.g:1133:1: rule__GSSIfacePortConfig__Group__2 : rule__GSSIfacePortConfig__Group__2__Impl rule__GSSIfacePortConfig__Group__3 ;
    public final void rule__GSSIfacePortConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1137:1: ( rule__GSSIfacePortConfig__Group__2__Impl rule__GSSIfacePortConfig__Group__3 )
            // InternalIFACE.g:1138:2: rule__GSSIfacePortConfig__Group__2__Impl rule__GSSIfacePortConfig__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSIfacePortConfig__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortConfig__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group__2"


    // $ANTLR start "rule__GSSIfacePortConfig__Group__2__Impl"
    // InternalIFACE.g:1145:1: rule__GSSIfacePortConfig__Group__2__Impl : ( '{' ) ;
    public final void rule__GSSIfacePortConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1149:1: ( ( '{' ) )
            // InternalIFACE.g:1150:1: ( '{' )
            {
            // InternalIFACE.g:1150:1: ( '{' )
            // InternalIFACE.g:1151:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortConfigAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group__2__Impl"


    // $ANTLR start "rule__GSSIfacePortConfig__Group__3"
    // InternalIFACE.g:1160:1: rule__GSSIfacePortConfig__Group__3 : rule__GSSIfacePortConfig__Group__3__Impl rule__GSSIfacePortConfig__Group__4 ;
    public final void rule__GSSIfacePortConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1164:1: ( rule__GSSIfacePortConfig__Group__3__Impl rule__GSSIfacePortConfig__Group__4 )
            // InternalIFACE.g:1165:2: rule__GSSIfacePortConfig__Group__3__Impl rule__GSSIfacePortConfig__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSIfacePortConfig__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortConfig__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group__3"


    // $ANTLR start "rule__GSSIfacePortConfig__Group__3__Impl"
    // InternalIFACE.g:1172:1: rule__GSSIfacePortConfig__Group__3__Impl : ( ( rule__GSSIfacePortConfig__UnorderedGroup_3 ) ) ;
    public final void rule__GSSIfacePortConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1176:1: ( ( ( rule__GSSIfacePortConfig__UnorderedGroup_3 ) ) )
            // InternalIFACE.g:1177:1: ( ( rule__GSSIfacePortConfig__UnorderedGroup_3 ) )
            {
            // InternalIFACE.g:1177:1: ( ( rule__GSSIfacePortConfig__UnorderedGroup_3 ) )
            // InternalIFACE.g:1178:2: ( rule__GSSIfacePortConfig__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3()); 
            }
            // InternalIFACE.g:1179:2: ( rule__GSSIfacePortConfig__UnorderedGroup_3 )
            // InternalIFACE.g:1179:3: rule__GSSIfacePortConfig__UnorderedGroup_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortConfig__UnorderedGroup_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group__3__Impl"


    // $ANTLR start "rule__GSSIfacePortConfig__Group__4"
    // InternalIFACE.g:1187:1: rule__GSSIfacePortConfig__Group__4 : rule__GSSIfacePortConfig__Group__4__Impl rule__GSSIfacePortConfig__Group__5 ;
    public final void rule__GSSIfacePortConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1191:1: ( rule__GSSIfacePortConfig__Group__4__Impl rule__GSSIfacePortConfig__Group__5 )
            // InternalIFACE.g:1192:2: rule__GSSIfacePortConfig__Group__4__Impl rule__GSSIfacePortConfig__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfacePortConfig__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortConfig__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group__4"


    // $ANTLR start "rule__GSSIfacePortConfig__Group__4__Impl"
    // InternalIFACE.g:1199:1: rule__GSSIfacePortConfig__Group__4__Impl : ( ( rule__GSSIfacePortConfig__PortConfigAssignment_4 ) ) ;
    public final void rule__GSSIfacePortConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1203:1: ( ( ( rule__GSSIfacePortConfig__PortConfigAssignment_4 ) ) )
            // InternalIFACE.g:1204:1: ( ( rule__GSSIfacePortConfig__PortConfigAssignment_4 ) )
            {
            // InternalIFACE.g:1204:1: ( ( rule__GSSIfacePortConfig__PortConfigAssignment_4 ) )
            // InternalIFACE.g:1205:2: ( rule__GSSIfacePortConfig__PortConfigAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getPortConfigAssignment_4()); 
            }
            // InternalIFACE.g:1206:2: ( rule__GSSIfacePortConfig__PortConfigAssignment_4 )
            // InternalIFACE.g:1206:3: rule__GSSIfacePortConfig__PortConfigAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortConfig__PortConfigAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortConfigAccess().getPortConfigAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group__4__Impl"


    // $ANTLR start "rule__GSSIfacePortConfig__Group__5"
    // InternalIFACE.g:1214:1: rule__GSSIfacePortConfig__Group__5 : rule__GSSIfacePortConfig__Group__5__Impl rule__GSSIfacePortConfig__Group__6 ;
    public final void rule__GSSIfacePortConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1218:1: ( rule__GSSIfacePortConfig__Group__5__Impl rule__GSSIfacePortConfig__Group__6 )
            // InternalIFACE.g:1219:2: rule__GSSIfacePortConfig__Group__5__Impl rule__GSSIfacePortConfig__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfacePortConfig__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortConfig__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group__5"


    // $ANTLR start "rule__GSSIfacePortConfig__Group__5__Impl"
    // InternalIFACE.g:1226:1: rule__GSSIfacePortConfig__Group__5__Impl : ( '}' ) ;
    public final void rule__GSSIfacePortConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1230:1: ( ( '}' ) )
            // InternalIFACE.g:1231:1: ( '}' )
            {
            // InternalIFACE.g:1231:1: ( '}' )
            // InternalIFACE.g:1232:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortConfigAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group__5__Impl"


    // $ANTLR start "rule__GSSIfacePortConfig__Group__6"
    // InternalIFACE.g:1241:1: rule__GSSIfacePortConfig__Group__6 : rule__GSSIfacePortConfig__Group__6__Impl ;
    public final void rule__GSSIfacePortConfig__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1245:1: ( rule__GSSIfacePortConfig__Group__6__Impl )
            // InternalIFACE.g:1246:2: rule__GSSIfacePortConfig__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortConfig__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group__6"


    // $ANTLR start "rule__GSSIfacePortConfig__Group__6__Impl"
    // InternalIFACE.g:1252:1: rule__GSSIfacePortConfig__Group__6__Impl : ( ';' ) ;
    public final void rule__GSSIfacePortConfig__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1256:1: ( ( ';' ) )
            // InternalIFACE.g:1257:1: ( ';' )
            {
            // InternalIFACE.g:1257:1: ( ';' )
            // InternalIFACE.g:1258:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getSemicolonKeyword_6()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortConfigAccess().getSemicolonKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group__6__Impl"


    // $ANTLR start "rule__GSSIfacePortConfig__Group_3_0__0"
    // InternalIFACE.g:1268:1: rule__GSSIfacePortConfig__Group_3_0__0 : rule__GSSIfacePortConfig__Group_3_0__0__Impl rule__GSSIfacePortConfig__Group_3_0__1 ;
    public final void rule__GSSIfacePortConfig__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1272:1: ( rule__GSSIfacePortConfig__Group_3_0__0__Impl rule__GSSIfacePortConfig__Group_3_0__1 )
            // InternalIFACE.g:1273:2: rule__GSSIfacePortConfig__Group_3_0__0__Impl rule__GSSIfacePortConfig__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfacePortConfig__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortConfig__Group_3_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group_3_0__0"


    // $ANTLR start "rule__GSSIfacePortConfig__Group_3_0__0__Impl"
    // InternalIFACE.g:1280:1: rule__GSSIfacePortConfig__Group_3_0__0__Impl : ( 'uri' ) ;
    public final void rule__GSSIfacePortConfig__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1284:1: ( ( 'uri' ) )
            // InternalIFACE.g:1285:1: ( 'uri' )
            {
            // InternalIFACE.g:1285:1: ( 'uri' )
            // InternalIFACE.g:1286:2: 'uri'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getUriKeyword_3_0_0()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortConfigAccess().getUriKeyword_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group_3_0__0__Impl"


    // $ANTLR start "rule__GSSIfacePortConfig__Group_3_0__1"
    // InternalIFACE.g:1295:1: rule__GSSIfacePortConfig__Group_3_0__1 : rule__GSSIfacePortConfig__Group_3_0__1__Impl rule__GSSIfacePortConfig__Group_3_0__2 ;
    public final void rule__GSSIfacePortConfig__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1299:1: ( rule__GSSIfacePortConfig__Group_3_0__1__Impl rule__GSSIfacePortConfig__Group_3_0__2 )
            // InternalIFACE.g:1300:2: rule__GSSIfacePortConfig__Group_3_0__1__Impl rule__GSSIfacePortConfig__Group_3_0__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSIfacePortConfig__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortConfig__Group_3_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group_3_0__1"


    // $ANTLR start "rule__GSSIfacePortConfig__Group_3_0__1__Impl"
    // InternalIFACE.g:1307:1: rule__GSSIfacePortConfig__Group_3_0__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfacePortConfig__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1311:1: ( ( ':=' ) )
            // InternalIFACE.g:1312:1: ( ':=' )
            {
            // InternalIFACE.g:1312:1: ( ':=' )
            // InternalIFACE.g:1313:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getColonEqualsSignKeyword_3_0_1()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortConfigAccess().getColonEqualsSignKeyword_3_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group_3_0__1__Impl"


    // $ANTLR start "rule__GSSIfacePortConfig__Group_3_0__2"
    // InternalIFACE.g:1322:1: rule__GSSIfacePortConfig__Group_3_0__2 : rule__GSSIfacePortConfig__Group_3_0__2__Impl rule__GSSIfacePortConfig__Group_3_0__3 ;
    public final void rule__GSSIfacePortConfig__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1326:1: ( rule__GSSIfacePortConfig__Group_3_0__2__Impl rule__GSSIfacePortConfig__Group_3_0__3 )
            // InternalIFACE.g:1327:2: rule__GSSIfacePortConfig__Group_3_0__2__Impl rule__GSSIfacePortConfig__Group_3_0__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfacePortConfig__Group_3_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortConfig__Group_3_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group_3_0__2"


    // $ANTLR start "rule__GSSIfacePortConfig__Group_3_0__2__Impl"
    // InternalIFACE.g:1334:1: rule__GSSIfacePortConfig__Group_3_0__2__Impl : ( ( rule__GSSIfacePortConfig__UriAssignment_3_0_2 ) ) ;
    public final void rule__GSSIfacePortConfig__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1338:1: ( ( ( rule__GSSIfacePortConfig__UriAssignment_3_0_2 ) ) )
            // InternalIFACE.g:1339:1: ( ( rule__GSSIfacePortConfig__UriAssignment_3_0_2 ) )
            {
            // InternalIFACE.g:1339:1: ( ( rule__GSSIfacePortConfig__UriAssignment_3_0_2 ) )
            // InternalIFACE.g:1340:2: ( rule__GSSIfacePortConfig__UriAssignment_3_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getUriAssignment_3_0_2()); 
            }
            // InternalIFACE.g:1341:2: ( rule__GSSIfacePortConfig__UriAssignment_3_0_2 )
            // InternalIFACE.g:1341:3: rule__GSSIfacePortConfig__UriAssignment_3_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortConfig__UriAssignment_3_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortConfigAccess().getUriAssignment_3_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group_3_0__2__Impl"


    // $ANTLR start "rule__GSSIfacePortConfig__Group_3_0__3"
    // InternalIFACE.g:1349:1: rule__GSSIfacePortConfig__Group_3_0__3 : rule__GSSIfacePortConfig__Group_3_0__3__Impl ;
    public final void rule__GSSIfacePortConfig__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1353:1: ( rule__GSSIfacePortConfig__Group_3_0__3__Impl )
            // InternalIFACE.g:1354:2: rule__GSSIfacePortConfig__Group_3_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortConfig__Group_3_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group_3_0__3"


    // $ANTLR start "rule__GSSIfacePortConfig__Group_3_0__3__Impl"
    // InternalIFACE.g:1360:1: rule__GSSIfacePortConfig__Group_3_0__3__Impl : ( ';' ) ;
    public final void rule__GSSIfacePortConfig__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1364:1: ( ( ';' ) )
            // InternalIFACE.g:1365:1: ( ';' )
            {
            // InternalIFACE.g:1365:1: ( ';' )
            // InternalIFACE.g:1366:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getSemicolonKeyword_3_0_3()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortConfigAccess().getSemicolonKeyword_3_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group_3_0__3__Impl"


    // $ANTLR start "rule__GSSIfacePortConfig__Group_3_1__0"
    // InternalIFACE.g:1376:1: rule__GSSIfacePortConfig__Group_3_1__0 : rule__GSSIfacePortConfig__Group_3_1__0__Impl rule__GSSIfacePortConfig__Group_3_1__1 ;
    public final void rule__GSSIfacePortConfig__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1380:1: ( rule__GSSIfacePortConfig__Group_3_1__0__Impl rule__GSSIfacePortConfig__Group_3_1__1 )
            // InternalIFACE.g:1381:2: rule__GSSIfacePortConfig__Group_3_1__0__Impl rule__GSSIfacePortConfig__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfacePortConfig__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortConfig__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group_3_1__0"


    // $ANTLR start "rule__GSSIfacePortConfig__Group_3_1__0__Impl"
    // InternalIFACE.g:1388:1: rule__GSSIfacePortConfig__Group_3_1__0__Impl : ( 'version' ) ;
    public final void rule__GSSIfacePortConfig__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1392:1: ( ( 'version' ) )
            // InternalIFACE.g:1393:1: ( 'version' )
            {
            // InternalIFACE.g:1393:1: ( 'version' )
            // InternalIFACE.g:1394:2: 'version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getVersionKeyword_3_1_0()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortConfigAccess().getVersionKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group_3_1__0__Impl"


    // $ANTLR start "rule__GSSIfacePortConfig__Group_3_1__1"
    // InternalIFACE.g:1403:1: rule__GSSIfacePortConfig__Group_3_1__1 : rule__GSSIfacePortConfig__Group_3_1__1__Impl rule__GSSIfacePortConfig__Group_3_1__2 ;
    public final void rule__GSSIfacePortConfig__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1407:1: ( rule__GSSIfacePortConfig__Group_3_1__1__Impl rule__GSSIfacePortConfig__Group_3_1__2 )
            // InternalIFACE.g:1408:2: rule__GSSIfacePortConfig__Group_3_1__1__Impl rule__GSSIfacePortConfig__Group_3_1__2
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__GSSIfacePortConfig__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortConfig__Group_3_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group_3_1__1"


    // $ANTLR start "rule__GSSIfacePortConfig__Group_3_1__1__Impl"
    // InternalIFACE.g:1415:1: rule__GSSIfacePortConfig__Group_3_1__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfacePortConfig__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1419:1: ( ( ':=' ) )
            // InternalIFACE.g:1420:1: ( ':=' )
            {
            // InternalIFACE.g:1420:1: ( ':=' )
            // InternalIFACE.g:1421:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getColonEqualsSignKeyword_3_1_1()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortConfigAccess().getColonEqualsSignKeyword_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group_3_1__1__Impl"


    // $ANTLR start "rule__GSSIfacePortConfig__Group_3_1__2"
    // InternalIFACE.g:1430:1: rule__GSSIfacePortConfig__Group_3_1__2 : rule__GSSIfacePortConfig__Group_3_1__2__Impl rule__GSSIfacePortConfig__Group_3_1__3 ;
    public final void rule__GSSIfacePortConfig__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1434:1: ( rule__GSSIfacePortConfig__Group_3_1__2__Impl rule__GSSIfacePortConfig__Group_3_1__3 )
            // InternalIFACE.g:1435:2: rule__GSSIfacePortConfig__Group_3_1__2__Impl rule__GSSIfacePortConfig__Group_3_1__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfacePortConfig__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortConfig__Group_3_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group_3_1__2"


    // $ANTLR start "rule__GSSIfacePortConfig__Group_3_1__2__Impl"
    // InternalIFACE.g:1442:1: rule__GSSIfacePortConfig__Group_3_1__2__Impl : ( ( rule__GSSIfacePortConfig__VersionAssignment_3_1_2 ) ) ;
    public final void rule__GSSIfacePortConfig__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1446:1: ( ( ( rule__GSSIfacePortConfig__VersionAssignment_3_1_2 ) ) )
            // InternalIFACE.g:1447:1: ( ( rule__GSSIfacePortConfig__VersionAssignment_3_1_2 ) )
            {
            // InternalIFACE.g:1447:1: ( ( rule__GSSIfacePortConfig__VersionAssignment_3_1_2 ) )
            // InternalIFACE.g:1448:2: ( rule__GSSIfacePortConfig__VersionAssignment_3_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getVersionAssignment_3_1_2()); 
            }
            // InternalIFACE.g:1449:2: ( rule__GSSIfacePortConfig__VersionAssignment_3_1_2 )
            // InternalIFACE.g:1449:3: rule__GSSIfacePortConfig__VersionAssignment_3_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortConfig__VersionAssignment_3_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortConfigAccess().getVersionAssignment_3_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group_3_1__2__Impl"


    // $ANTLR start "rule__GSSIfacePortConfig__Group_3_1__3"
    // InternalIFACE.g:1457:1: rule__GSSIfacePortConfig__Group_3_1__3 : rule__GSSIfacePortConfig__Group_3_1__3__Impl ;
    public final void rule__GSSIfacePortConfig__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1461:1: ( rule__GSSIfacePortConfig__Group_3_1__3__Impl )
            // InternalIFACE.g:1462:2: rule__GSSIfacePortConfig__Group_3_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortConfig__Group_3_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group_3_1__3"


    // $ANTLR start "rule__GSSIfacePortConfig__Group_3_1__3__Impl"
    // InternalIFACE.g:1468:1: rule__GSSIfacePortConfig__Group_3_1__3__Impl : ( ';' ) ;
    public final void rule__GSSIfacePortConfig__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1472:1: ( ( ';' ) )
            // InternalIFACE.g:1473:1: ( ';' )
            {
            // InternalIFACE.g:1473:1: ( ';' )
            // InternalIFACE.g:1474:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getSemicolonKeyword_3_1_3()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortConfigAccess().getSemicolonKeyword_3_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__Group_3_1__3__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__0"
    // InternalIFACE.g:1484:1: rule__GSSIfaceSpWPort__Group__0 : rule__GSSIfaceSpWPort__Group__0__Impl rule__GSSIfaceSpWPort__Group__1 ;
    public final void rule__GSSIfaceSpWPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1488:1: ( rule__GSSIfaceSpWPort__Group__0__Impl rule__GSSIfaceSpWPort__Group__1 )
            // InternalIFACE.g:1489:2: rule__GSSIfaceSpWPort__Group__0__Impl rule__GSSIfaceSpWPort__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSIfaceSpWPort__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__0"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__0__Impl"
    // InternalIFACE.g:1496:1: rule__GSSIfaceSpWPort__Group__0__Impl : ( 'spwPort' ) ;
    public final void rule__GSSIfaceSpWPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1500:1: ( ( 'spwPort' ) )
            // InternalIFACE.g:1501:1: ( 'spwPort' )
            {
            // InternalIFACE.g:1501:1: ( 'spwPort' )
            // InternalIFACE.g:1502:2: 'spwPort'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getSpwPortKeyword_0()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getSpwPortKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__0__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__1"
    // InternalIFACE.g:1511:1: rule__GSSIfaceSpWPort__Group__1 : rule__GSSIfaceSpWPort__Group__1__Impl rule__GSSIfaceSpWPort__Group__2 ;
    public final void rule__GSSIfaceSpWPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1515:1: ( rule__GSSIfaceSpWPort__Group__1__Impl rule__GSSIfaceSpWPort__Group__2 )
            // InternalIFACE.g:1516:2: rule__GSSIfaceSpWPort__Group__1__Impl rule__GSSIfaceSpWPort__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__GSSIfaceSpWPort__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__1"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__1__Impl"
    // InternalIFACE.g:1523:1: rule__GSSIfaceSpWPort__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceSpWPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1527:1: ( ( '{' ) )
            // InternalIFACE.g:1528:1: ( '{' )
            {
            // InternalIFACE.g:1528:1: ( '{' )
            // InternalIFACE.g:1529:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__1__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__2"
    // InternalIFACE.g:1538:1: rule__GSSIfaceSpWPort__Group__2 : rule__GSSIfaceSpWPort__Group__2__Impl rule__GSSIfaceSpWPort__Group__3 ;
    public final void rule__GSSIfaceSpWPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1542:1: ( rule__GSSIfaceSpWPort__Group__2__Impl rule__GSSIfaceSpWPort__Group__3 )
            // InternalIFACE.g:1543:2: rule__GSSIfaceSpWPort__Group__2__Impl rule__GSSIfaceSpWPort__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfaceSpWPort__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__2"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__2__Impl"
    // InternalIFACE.g:1550:1: rule__GSSIfaceSpWPort__Group__2__Impl : ( 'type' ) ;
    public final void rule__GSSIfaceSpWPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1554:1: ( ( 'type' ) )
            // InternalIFACE.g:1555:1: ( 'type' )
            {
            // InternalIFACE.g:1555:1: ( 'type' )
            // InternalIFACE.g:1556:2: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getTypeKeyword_2()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getTypeKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__2__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__3"
    // InternalIFACE.g:1565:1: rule__GSSIfaceSpWPort__Group__3 : rule__GSSIfaceSpWPort__Group__3__Impl rule__GSSIfaceSpWPort__Group__4 ;
    public final void rule__GSSIfaceSpWPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1569:1: ( rule__GSSIfaceSpWPort__Group__3__Impl rule__GSSIfaceSpWPort__Group__4 )
            // InternalIFACE.g:1570:2: rule__GSSIfaceSpWPort__Group__3__Impl rule__GSSIfaceSpWPort__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__GSSIfaceSpWPort__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__3"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__3__Impl"
    // InternalIFACE.g:1577:1: rule__GSSIfaceSpWPort__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSpWPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1581:1: ( ( ':=' ) )
            // InternalIFACE.g:1582:1: ( ':=' )
            {
            // InternalIFACE.g:1582:1: ( ':=' )
            // InternalIFACE.g:1583:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__3__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__4"
    // InternalIFACE.g:1592:1: rule__GSSIfaceSpWPort__Group__4 : rule__GSSIfaceSpWPort__Group__4__Impl rule__GSSIfaceSpWPort__Group__5 ;
    public final void rule__GSSIfaceSpWPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1596:1: ( rule__GSSIfaceSpWPort__Group__4__Impl rule__GSSIfaceSpWPort__Group__5 )
            // InternalIFACE.g:1597:2: rule__GSSIfaceSpWPort__Group__4__Impl rule__GSSIfaceSpWPort__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSpWPort__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__4"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__4__Impl"
    // InternalIFACE.g:1604:1: rule__GSSIfaceSpWPort__Group__4__Impl : ( ( rule__GSSIfaceSpWPort__TypeAssignment_4 ) ) ;
    public final void rule__GSSIfaceSpWPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1608:1: ( ( ( rule__GSSIfaceSpWPort__TypeAssignment_4 ) ) )
            // InternalIFACE.g:1609:1: ( ( rule__GSSIfaceSpWPort__TypeAssignment_4 ) )
            {
            // InternalIFACE.g:1609:1: ( ( rule__GSSIfaceSpWPort__TypeAssignment_4 ) )
            // InternalIFACE.g:1610:2: ( rule__GSSIfaceSpWPort__TypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getTypeAssignment_4()); 
            }
            // InternalIFACE.g:1611:2: ( rule__GSSIfaceSpWPort__TypeAssignment_4 )
            // InternalIFACE.g:1611:3: rule__GSSIfaceSpWPort__TypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__TypeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getTypeAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__4__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__5"
    // InternalIFACE.g:1619:1: rule__GSSIfaceSpWPort__Group__5 : rule__GSSIfaceSpWPort__Group__5__Impl rule__GSSIfaceSpWPort__Group__6 ;
    public final void rule__GSSIfaceSpWPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1623:1: ( rule__GSSIfaceSpWPort__Group__5__Impl rule__GSSIfaceSpWPort__Group__6 )
            // InternalIFACE.g:1624:2: rule__GSSIfaceSpWPort__Group__5__Impl rule__GSSIfaceSpWPort__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__GSSIfaceSpWPort__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__5"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__5__Impl"
    // InternalIFACE.g:1631:1: rule__GSSIfaceSpWPort__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSpWPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1635:1: ( ( ';' ) )
            // InternalIFACE.g:1636:1: ( ';' )
            {
            // InternalIFACE.g:1636:1: ( ';' )
            // InternalIFACE.g:1637:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_5()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__5__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__6"
    // InternalIFACE.g:1646:1: rule__GSSIfaceSpWPort__Group__6 : rule__GSSIfaceSpWPort__Group__6__Impl rule__GSSIfaceSpWPort__Group__7 ;
    public final void rule__GSSIfaceSpWPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1650:1: ( rule__GSSIfaceSpWPort__Group__6__Impl rule__GSSIfaceSpWPort__Group__7 )
            // InternalIFACE.g:1651:2: rule__GSSIfaceSpWPort__Group__6__Impl rule__GSSIfaceSpWPort__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfaceSpWPort__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__6"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__6__Impl"
    // InternalIFACE.g:1658:1: rule__GSSIfaceSpWPort__Group__6__Impl : ( 'link' ) ;
    public final void rule__GSSIfaceSpWPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1662:1: ( ( 'link' ) )
            // InternalIFACE.g:1663:1: ( 'link' )
            {
            // InternalIFACE.g:1663:1: ( 'link' )
            // InternalIFACE.g:1664:2: 'link'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getLinkKeyword_6()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getLinkKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__6__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__7"
    // InternalIFACE.g:1673:1: rule__GSSIfaceSpWPort__Group__7 : rule__GSSIfaceSpWPort__Group__7__Impl rule__GSSIfaceSpWPort__Group__8 ;
    public final void rule__GSSIfaceSpWPort__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1677:1: ( rule__GSSIfaceSpWPort__Group__7__Impl rule__GSSIfaceSpWPort__Group__8 )
            // InternalIFACE.g:1678:2: rule__GSSIfaceSpWPort__Group__7__Impl rule__GSSIfaceSpWPort__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSIfaceSpWPort__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__7"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__7__Impl"
    // InternalIFACE.g:1685:1: rule__GSSIfaceSpWPort__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSpWPort__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1689:1: ( ( ':=' ) )
            // InternalIFACE.g:1690:1: ( ':=' )
            {
            // InternalIFACE.g:1690:1: ( ':=' )
            // InternalIFACE.g:1691:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__7__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__8"
    // InternalIFACE.g:1700:1: rule__GSSIfaceSpWPort__Group__8 : rule__GSSIfaceSpWPort__Group__8__Impl rule__GSSIfaceSpWPort__Group__9 ;
    public final void rule__GSSIfaceSpWPort__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1704:1: ( rule__GSSIfaceSpWPort__Group__8__Impl rule__GSSIfaceSpWPort__Group__9 )
            // InternalIFACE.g:1705:2: rule__GSSIfaceSpWPort__Group__8__Impl rule__GSSIfaceSpWPort__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSpWPort__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__8"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__8__Impl"
    // InternalIFACE.g:1712:1: rule__GSSIfaceSpWPort__Group__8__Impl : ( ( rule__GSSIfaceSpWPort__LinkAssignment_8 ) ) ;
    public final void rule__GSSIfaceSpWPort__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1716:1: ( ( ( rule__GSSIfaceSpWPort__LinkAssignment_8 ) ) )
            // InternalIFACE.g:1717:1: ( ( rule__GSSIfaceSpWPort__LinkAssignment_8 ) )
            {
            // InternalIFACE.g:1717:1: ( ( rule__GSSIfaceSpWPort__LinkAssignment_8 ) )
            // InternalIFACE.g:1718:2: ( rule__GSSIfaceSpWPort__LinkAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getLinkAssignment_8()); 
            }
            // InternalIFACE.g:1719:2: ( rule__GSSIfaceSpWPort__LinkAssignment_8 )
            // InternalIFACE.g:1719:3: rule__GSSIfaceSpWPort__LinkAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__LinkAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getLinkAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__8__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__9"
    // InternalIFACE.g:1727:1: rule__GSSIfaceSpWPort__Group__9 : rule__GSSIfaceSpWPort__Group__9__Impl rule__GSSIfaceSpWPort__Group__10 ;
    public final void rule__GSSIfaceSpWPort__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1731:1: ( rule__GSSIfaceSpWPort__Group__9__Impl rule__GSSIfaceSpWPort__Group__10 )
            // InternalIFACE.g:1732:2: rule__GSSIfaceSpWPort__Group__9__Impl rule__GSSIfaceSpWPort__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__GSSIfaceSpWPort__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__9"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__9__Impl"
    // InternalIFACE.g:1739:1: rule__GSSIfaceSpWPort__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSpWPort__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1743:1: ( ( ';' ) )
            // InternalIFACE.g:1744:1: ( ';' )
            {
            // InternalIFACE.g:1744:1: ( ';' )
            // InternalIFACE.g:1745:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_9()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__9__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__10"
    // InternalIFACE.g:1754:1: rule__GSSIfaceSpWPort__Group__10 : rule__GSSIfaceSpWPort__Group__10__Impl rule__GSSIfaceSpWPort__Group__11 ;
    public final void rule__GSSIfaceSpWPort__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1758:1: ( rule__GSSIfaceSpWPort__Group__10__Impl rule__GSSIfaceSpWPort__Group__11 )
            // InternalIFACE.g:1759:2: rule__GSSIfaceSpWPort__Group__10__Impl rule__GSSIfaceSpWPort__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfaceSpWPort__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__10"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__10__Impl"
    // InternalIFACE.g:1766:1: rule__GSSIfaceSpWPort__Group__10__Impl : ( 'writingPort' ) ;
    public final void rule__GSSIfaceSpWPort__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1770:1: ( ( 'writingPort' ) )
            // InternalIFACE.g:1771:1: ( 'writingPort' )
            {
            // InternalIFACE.g:1771:1: ( 'writingPort' )
            // InternalIFACE.g:1772:2: 'writingPort'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortKeyword_10()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__10__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__11"
    // InternalIFACE.g:1781:1: rule__GSSIfaceSpWPort__Group__11 : rule__GSSIfaceSpWPort__Group__11__Impl rule__GSSIfaceSpWPort__Group__12 ;
    public final void rule__GSSIfaceSpWPort__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1785:1: ( rule__GSSIfaceSpWPort__Group__11__Impl rule__GSSIfaceSpWPort__Group__12 )
            // InternalIFACE.g:1786:2: rule__GSSIfaceSpWPort__Group__11__Impl rule__GSSIfaceSpWPort__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSIfaceSpWPort__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__11"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__11__Impl"
    // InternalIFACE.g:1793:1: rule__GSSIfaceSpWPort__Group__11__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSpWPort__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1797:1: ( ( ':=' ) )
            // InternalIFACE.g:1798:1: ( ':=' )
            {
            // InternalIFACE.g:1798:1: ( ':=' )
            // InternalIFACE.g:1799:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_11()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__11__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__12"
    // InternalIFACE.g:1808:1: rule__GSSIfaceSpWPort__Group__12 : rule__GSSIfaceSpWPort__Group__12__Impl rule__GSSIfaceSpWPort__Group__13 ;
    public final void rule__GSSIfaceSpWPort__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1812:1: ( rule__GSSIfaceSpWPort__Group__12__Impl rule__GSSIfaceSpWPort__Group__13 )
            // InternalIFACE.g:1813:2: rule__GSSIfaceSpWPort__Group__12__Impl rule__GSSIfaceSpWPort__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSpWPort__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__12"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__12__Impl"
    // InternalIFACE.g:1820:1: rule__GSSIfaceSpWPort__Group__12__Impl : ( ( rule__GSSIfaceSpWPort__WritingPortAssignment_12 ) ) ;
    public final void rule__GSSIfaceSpWPort__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1824:1: ( ( ( rule__GSSIfaceSpWPort__WritingPortAssignment_12 ) ) )
            // InternalIFACE.g:1825:1: ( ( rule__GSSIfaceSpWPort__WritingPortAssignment_12 ) )
            {
            // InternalIFACE.g:1825:1: ( ( rule__GSSIfaceSpWPort__WritingPortAssignment_12 ) )
            // InternalIFACE.g:1826:2: ( rule__GSSIfaceSpWPort__WritingPortAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortAssignment_12()); 
            }
            // InternalIFACE.g:1827:2: ( rule__GSSIfaceSpWPort__WritingPortAssignment_12 )
            // InternalIFACE.g:1827:3: rule__GSSIfaceSpWPort__WritingPortAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__WritingPortAssignment_12();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortAssignment_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__12__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__13"
    // InternalIFACE.g:1835:1: rule__GSSIfaceSpWPort__Group__13 : rule__GSSIfaceSpWPort__Group__13__Impl rule__GSSIfaceSpWPort__Group__14 ;
    public final void rule__GSSIfaceSpWPort__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1839:1: ( rule__GSSIfaceSpWPort__Group__13__Impl rule__GSSIfaceSpWPort__Group__14 )
            // InternalIFACE.g:1840:2: rule__GSSIfaceSpWPort__Group__13__Impl rule__GSSIfaceSpWPort__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__GSSIfaceSpWPort__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__13"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__13__Impl"
    // InternalIFACE.g:1847:1: rule__GSSIfaceSpWPort__Group__13__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSpWPort__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1851:1: ( ( ';' ) )
            // InternalIFACE.g:1852:1: ( ';' )
            {
            // InternalIFACE.g:1852:1: ( ';' )
            // InternalIFACE.g:1853:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_13()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__13__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__14"
    // InternalIFACE.g:1862:1: rule__GSSIfaceSpWPort__Group__14 : rule__GSSIfaceSpWPort__Group__14__Impl rule__GSSIfaceSpWPort__Group__15 ;
    public final void rule__GSSIfaceSpWPort__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1866:1: ( rule__GSSIfaceSpWPort__Group__14__Impl rule__GSSIfaceSpWPort__Group__15 )
            // InternalIFACE.g:1867:2: rule__GSSIfaceSpWPort__Group__14__Impl rule__GSSIfaceSpWPort__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceSpWPort__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group__15();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__14"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__14__Impl"
    // InternalIFACE.g:1874:1: rule__GSSIfaceSpWPort__Group__14__Impl : ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 ) ) ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )* ) ) ;
    public final void rule__GSSIfaceSpWPort__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1878:1: ( ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 ) ) ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )* ) ) )
            // InternalIFACE.g:1879:1: ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 ) ) ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )* ) )
            {
            // InternalIFACE.g:1879:1: ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 ) ) ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )* ) )
            // InternalIFACE.g:1880:2: ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 ) ) ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )* )
            {
            // InternalIFACE.g:1880:2: ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 ) )
            // InternalIFACE.g:1881:3: ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortAssignment_14()); 
            }
            // InternalIFACE.g:1882:3: ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )
            // InternalIFACE.g:1882:4: rule__GSSIfaceSpWPort__ReadingPortAssignment_14
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__GSSIfaceSpWPort__ReadingPortAssignment_14();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortAssignment_14()); 
            }

            }

            // InternalIFACE.g:1885:2: ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )* )
            // InternalIFACE.g:1886:3: ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortAssignment_14()); 
            }
            // InternalIFACE.g:1887:3: ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==46) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalIFACE.g:1887:4: rule__GSSIfaceSpWPort__ReadingPortAssignment_14
            	    {
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    rule__GSSIfaceSpWPort__ReadingPortAssignment_14();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortAssignment_14()); 
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
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__14__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__15"
    // InternalIFACE.g:1896:1: rule__GSSIfaceSpWPort__Group__15 : rule__GSSIfaceSpWPort__Group__15__Impl rule__GSSIfaceSpWPort__Group__16 ;
    public final void rule__GSSIfaceSpWPort__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1900:1: ( rule__GSSIfaceSpWPort__Group__15__Impl rule__GSSIfaceSpWPort__Group__16 )
            // InternalIFACE.g:1901:2: rule__GSSIfaceSpWPort__Group__15__Impl rule__GSSIfaceSpWPort__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSpWPort__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group__16();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__15"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__15__Impl"
    // InternalIFACE.g:1908:1: rule__GSSIfaceSpWPort__Group__15__Impl : ( '}' ) ;
    public final void rule__GSSIfaceSpWPort__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1912:1: ( ( '}' ) )
            // InternalIFACE.g:1913:1: ( '}' )
            {
            // InternalIFACE.g:1913:1: ( '}' )
            // InternalIFACE.g:1914:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getRightCurlyBracketKeyword_15()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getRightCurlyBracketKeyword_15()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__15__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__16"
    // InternalIFACE.g:1923:1: rule__GSSIfaceSpWPort__Group__16 : rule__GSSIfaceSpWPort__Group__16__Impl ;
    public final void rule__GSSIfaceSpWPort__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1927:1: ( rule__GSSIfaceSpWPort__Group__16__Impl )
            // InternalIFACE.g:1928:2: rule__GSSIfaceSpWPort__Group__16__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group__16__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__16"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group__16__Impl"
    // InternalIFACE.g:1934:1: rule__GSSIfaceSpWPort__Group__16__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSpWPort__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1938:1: ( ( ';' ) )
            // InternalIFACE.g:1939:1: ( ';' )
            {
            // InternalIFACE.g:1939:1: ( ';' )
            // InternalIFACE.g:1940:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_16()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_16()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group__16__Impl"


    // $ANTLR start "rule__GSSIfaceReadingPort__Group__0"
    // InternalIFACE.g:1950:1: rule__GSSIfaceReadingPort__Group__0 : rule__GSSIfaceReadingPort__Group__0__Impl rule__GSSIfaceReadingPort__Group__1 ;
    public final void rule__GSSIfaceReadingPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1954:1: ( rule__GSSIfaceReadingPort__Group__0__Impl rule__GSSIfaceReadingPort__Group__1 )
            // InternalIFACE.g:1955:2: rule__GSSIfaceReadingPort__Group__0__Impl rule__GSSIfaceReadingPort__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSIfaceReadingPort__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceReadingPort__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceReadingPort__Group__0"


    // $ANTLR start "rule__GSSIfaceReadingPort__Group__0__Impl"
    // InternalIFACE.g:1962:1: rule__GSSIfaceReadingPort__Group__0__Impl : ( 'readingPort' ) ;
    public final void rule__GSSIfaceReadingPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1966:1: ( ( 'readingPort' ) )
            // InternalIFACE.g:1967:1: ( 'readingPort' )
            {
            // InternalIFACE.g:1967:1: ( 'readingPort' )
            // InternalIFACE.g:1968:2: 'readingPort'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getReadingPortKeyword_0()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceReadingPortAccess().getReadingPortKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceReadingPort__Group__0__Impl"


    // $ANTLR start "rule__GSSIfaceReadingPort__Group__1"
    // InternalIFACE.g:1977:1: rule__GSSIfaceReadingPort__Group__1 : rule__GSSIfaceReadingPort__Group__1__Impl rule__GSSIfaceReadingPort__Group__2 ;
    public final void rule__GSSIfaceReadingPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1981:1: ( rule__GSSIfaceReadingPort__Group__1__Impl rule__GSSIfaceReadingPort__Group__2 )
            // InternalIFACE.g:1982:2: rule__GSSIfaceReadingPort__Group__1__Impl rule__GSSIfaceReadingPort__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__GSSIfaceReadingPort__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceReadingPort__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceReadingPort__Group__1"


    // $ANTLR start "rule__GSSIfaceReadingPort__Group__1__Impl"
    // InternalIFACE.g:1989:1: rule__GSSIfaceReadingPort__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceReadingPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1993:1: ( ( '{' ) )
            // InternalIFACE.g:1994:1: ( '{' )
            {
            // InternalIFACE.g:1994:1: ( '{' )
            // InternalIFACE.g:1995:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceReadingPortAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceReadingPort__Group__1__Impl"


    // $ANTLR start "rule__GSSIfaceReadingPort__Group__2"
    // InternalIFACE.g:2004:1: rule__GSSIfaceReadingPort__Group__2 : rule__GSSIfaceReadingPort__Group__2__Impl rule__GSSIfaceReadingPort__Group__3 ;
    public final void rule__GSSIfaceReadingPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2008:1: ( rule__GSSIfaceReadingPort__Group__2__Impl rule__GSSIfaceReadingPort__Group__3 )
            // InternalIFACE.g:2009:2: rule__GSSIfaceReadingPort__Group__2__Impl rule__GSSIfaceReadingPort__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfaceReadingPort__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceReadingPort__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceReadingPort__Group__2"


    // $ANTLR start "rule__GSSIfaceReadingPort__Group__2__Impl"
    // InternalIFACE.g:2016:1: rule__GSSIfaceReadingPort__Group__2__Impl : ( 'port' ) ;
    public final void rule__GSSIfaceReadingPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2020:1: ( ( 'port' ) )
            // InternalIFACE.g:2021:1: ( 'port' )
            {
            // InternalIFACE.g:2021:1: ( 'port' )
            // InternalIFACE.g:2022:2: 'port'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getPortKeyword_2()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceReadingPortAccess().getPortKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceReadingPort__Group__2__Impl"


    // $ANTLR start "rule__GSSIfaceReadingPort__Group__3"
    // InternalIFACE.g:2031:1: rule__GSSIfaceReadingPort__Group__3 : rule__GSSIfaceReadingPort__Group__3__Impl rule__GSSIfaceReadingPort__Group__4 ;
    public final void rule__GSSIfaceReadingPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2035:1: ( rule__GSSIfaceReadingPort__Group__3__Impl rule__GSSIfaceReadingPort__Group__4 )
            // InternalIFACE.g:2036:2: rule__GSSIfaceReadingPort__Group__3__Impl rule__GSSIfaceReadingPort__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSIfaceReadingPort__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceReadingPort__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceReadingPort__Group__3"


    // $ANTLR start "rule__GSSIfaceReadingPort__Group__3__Impl"
    // InternalIFACE.g:2043:1: rule__GSSIfaceReadingPort__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceReadingPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2047:1: ( ( ':=' ) )
            // InternalIFACE.g:2048:1: ( ':=' )
            {
            // InternalIFACE.g:2048:1: ( ':=' )
            // InternalIFACE.g:2049:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceReadingPortAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceReadingPort__Group__3__Impl"


    // $ANTLR start "rule__GSSIfaceReadingPort__Group__4"
    // InternalIFACE.g:2058:1: rule__GSSIfaceReadingPort__Group__4 : rule__GSSIfaceReadingPort__Group__4__Impl rule__GSSIfaceReadingPort__Group__5 ;
    public final void rule__GSSIfaceReadingPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2062:1: ( rule__GSSIfaceReadingPort__Group__4__Impl rule__GSSIfaceReadingPort__Group__5 )
            // InternalIFACE.g:2063:2: rule__GSSIfaceReadingPort__Group__4__Impl rule__GSSIfaceReadingPort__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceReadingPort__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceReadingPort__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceReadingPort__Group__4"


    // $ANTLR start "rule__GSSIfaceReadingPort__Group__4__Impl"
    // InternalIFACE.g:2070:1: rule__GSSIfaceReadingPort__Group__4__Impl : ( ( rule__GSSIfaceReadingPort__PortAssignment_4 ) ) ;
    public final void rule__GSSIfaceReadingPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2074:1: ( ( ( rule__GSSIfaceReadingPort__PortAssignment_4 ) ) )
            // InternalIFACE.g:2075:1: ( ( rule__GSSIfaceReadingPort__PortAssignment_4 ) )
            {
            // InternalIFACE.g:2075:1: ( ( rule__GSSIfaceReadingPort__PortAssignment_4 ) )
            // InternalIFACE.g:2076:2: ( rule__GSSIfaceReadingPort__PortAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getPortAssignment_4()); 
            }
            // InternalIFACE.g:2077:2: ( rule__GSSIfaceReadingPort__PortAssignment_4 )
            // InternalIFACE.g:2077:3: rule__GSSIfaceReadingPort__PortAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceReadingPort__PortAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceReadingPortAccess().getPortAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceReadingPort__Group__4__Impl"


    // $ANTLR start "rule__GSSIfaceReadingPort__Group__5"
    // InternalIFACE.g:2085:1: rule__GSSIfaceReadingPort__Group__5 : rule__GSSIfaceReadingPort__Group__5__Impl rule__GSSIfaceReadingPort__Group__6 ;
    public final void rule__GSSIfaceReadingPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2089:1: ( rule__GSSIfaceReadingPort__Group__5__Impl rule__GSSIfaceReadingPort__Group__6 )
            // InternalIFACE.g:2090:2: rule__GSSIfaceReadingPort__Group__5__Impl rule__GSSIfaceReadingPort__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceReadingPort__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceReadingPort__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceReadingPort__Group__5"


    // $ANTLR start "rule__GSSIfaceReadingPort__Group__5__Impl"
    // InternalIFACE.g:2097:1: rule__GSSIfaceReadingPort__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceReadingPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2101:1: ( ( ';' ) )
            // InternalIFACE.g:2102:1: ( ';' )
            {
            // InternalIFACE.g:2102:1: ( ';' )
            // InternalIFACE.g:2103:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getSemicolonKeyword_5()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceReadingPortAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceReadingPort__Group__5__Impl"


    // $ANTLR start "rule__GSSIfaceReadingPort__Group__6"
    // InternalIFACE.g:2112:1: rule__GSSIfaceReadingPort__Group__6 : rule__GSSIfaceReadingPort__Group__6__Impl rule__GSSIfaceReadingPort__Group__7 ;
    public final void rule__GSSIfaceReadingPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2116:1: ( rule__GSSIfaceReadingPort__Group__6__Impl rule__GSSIfaceReadingPort__Group__7 )
            // InternalIFACE.g:2117:2: rule__GSSIfaceReadingPort__Group__6__Impl rule__GSSIfaceReadingPort__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceReadingPort__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceReadingPort__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceReadingPort__Group__6"


    // $ANTLR start "rule__GSSIfaceReadingPort__Group__6__Impl"
    // InternalIFACE.g:2124:1: rule__GSSIfaceReadingPort__Group__6__Impl : ( '}' ) ;
    public final void rule__GSSIfaceReadingPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2128:1: ( ( '}' ) )
            // InternalIFACE.g:2129:1: ( '}' )
            {
            // InternalIFACE.g:2129:1: ( '}' )
            // InternalIFACE.g:2130:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceReadingPortAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceReadingPort__Group__6__Impl"


    // $ANTLR start "rule__GSSIfaceReadingPort__Group__7"
    // InternalIFACE.g:2139:1: rule__GSSIfaceReadingPort__Group__7 : rule__GSSIfaceReadingPort__Group__7__Impl ;
    public final void rule__GSSIfaceReadingPort__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2143:1: ( rule__GSSIfaceReadingPort__Group__7__Impl )
            // InternalIFACE.g:2144:2: rule__GSSIfaceReadingPort__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceReadingPort__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceReadingPort__Group__7"


    // $ANTLR start "rule__GSSIfaceReadingPort__Group__7__Impl"
    // InternalIFACE.g:2150:1: rule__GSSIfaceReadingPort__Group__7__Impl : ( ';' ) ;
    public final void rule__GSSIfaceReadingPort__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2154:1: ( ( ';' ) )
            // InternalIFACE.g:2155:1: ( ';' )
            {
            // InternalIFACE.g:2155:1: ( ';' )
            // InternalIFACE.g:2156:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getSemicolonKeyword_7()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceReadingPortAccess().getSemicolonKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceReadingPort__Group__7__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__0"
    // InternalIFACE.g:2166:1: rule__GSSIfaceUartPort__Group__0 : rule__GSSIfaceUartPort__Group__0__Impl rule__GSSIfaceUartPort__Group__1 ;
    public final void rule__GSSIfaceUartPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2170:1: ( rule__GSSIfaceUartPort__Group__0__Impl rule__GSSIfaceUartPort__Group__1 )
            // InternalIFACE.g:2171:2: rule__GSSIfaceUartPort__Group__0__Impl rule__GSSIfaceUartPort__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSIfaceUartPort__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__0"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__0__Impl"
    // InternalIFACE.g:2178:1: rule__GSSIfaceUartPort__Group__0__Impl : ( 'uartPort' ) ;
    public final void rule__GSSIfaceUartPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2182:1: ( ( 'uartPort' ) )
            // InternalIFACE.g:2183:1: ( 'uartPort' )
            {
            // InternalIFACE.g:2183:1: ( 'uartPort' )
            // InternalIFACE.g:2184:2: 'uartPort'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getUartPortKeyword_0()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getUartPortKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__0__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__1"
    // InternalIFACE.g:2193:1: rule__GSSIfaceUartPort__Group__1 : rule__GSSIfaceUartPort__Group__1__Impl rule__GSSIfaceUartPort__Group__2 ;
    public final void rule__GSSIfaceUartPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2197:1: ( rule__GSSIfaceUartPort__Group__1__Impl rule__GSSIfaceUartPort__Group__2 )
            // InternalIFACE.g:2198:2: rule__GSSIfaceUartPort__Group__1__Impl rule__GSSIfaceUartPort__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__GSSIfaceUartPort__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__1"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__1__Impl"
    // InternalIFACE.g:2205:1: rule__GSSIfaceUartPort__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceUartPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2209:1: ( ( '{' ) )
            // InternalIFACE.g:2210:1: ( '{' )
            {
            // InternalIFACE.g:2210:1: ( '{' )
            // InternalIFACE.g:2211:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__1__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__2"
    // InternalIFACE.g:2220:1: rule__GSSIfaceUartPort__Group__2 : rule__GSSIfaceUartPort__Group__2__Impl rule__GSSIfaceUartPort__Group__3 ;
    public final void rule__GSSIfaceUartPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2224:1: ( rule__GSSIfaceUartPort__Group__2__Impl rule__GSSIfaceUartPort__Group__3 )
            // InternalIFACE.g:2225:2: rule__GSSIfaceUartPort__Group__2__Impl rule__GSSIfaceUartPort__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfaceUartPort__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__2"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__2__Impl"
    // InternalIFACE.g:2232:1: rule__GSSIfaceUartPort__Group__2__Impl : ( 'number' ) ;
    public final void rule__GSSIfaceUartPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2236:1: ( ( 'number' ) )
            // InternalIFACE.g:2237:1: ( 'number' )
            {
            // InternalIFACE.g:2237:1: ( 'number' )
            // InternalIFACE.g:2238:2: 'number'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getNumberKeyword_2()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getNumberKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__2__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__3"
    // InternalIFACE.g:2247:1: rule__GSSIfaceUartPort__Group__3 : rule__GSSIfaceUartPort__Group__3__Impl rule__GSSIfaceUartPort__Group__4 ;
    public final void rule__GSSIfaceUartPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2251:1: ( rule__GSSIfaceUartPort__Group__3__Impl rule__GSSIfaceUartPort__Group__4 )
            // InternalIFACE.g:2252:2: rule__GSSIfaceUartPort__Group__3__Impl rule__GSSIfaceUartPort__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSIfaceUartPort__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__3"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__3__Impl"
    // InternalIFACE.g:2259:1: rule__GSSIfaceUartPort__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2263:1: ( ( ':=' ) )
            // InternalIFACE.g:2264:1: ( ':=' )
            {
            // InternalIFACE.g:2264:1: ( ':=' )
            // InternalIFACE.g:2265:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__3__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__4"
    // InternalIFACE.g:2274:1: rule__GSSIfaceUartPort__Group__4 : rule__GSSIfaceUartPort__Group__4__Impl rule__GSSIfaceUartPort__Group__5 ;
    public final void rule__GSSIfaceUartPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2278:1: ( rule__GSSIfaceUartPort__Group__4__Impl rule__GSSIfaceUartPort__Group__5 )
            // InternalIFACE.g:2279:2: rule__GSSIfaceUartPort__Group__4__Impl rule__GSSIfaceUartPort__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceUartPort__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__4"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__4__Impl"
    // InternalIFACE.g:2286:1: rule__GSSIfaceUartPort__Group__4__Impl : ( ( rule__GSSIfaceUartPort__NumberAssignment_4 ) ) ;
    public final void rule__GSSIfaceUartPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2290:1: ( ( ( rule__GSSIfaceUartPort__NumberAssignment_4 ) ) )
            // InternalIFACE.g:2291:1: ( ( rule__GSSIfaceUartPort__NumberAssignment_4 ) )
            {
            // InternalIFACE.g:2291:1: ( ( rule__GSSIfaceUartPort__NumberAssignment_4 ) )
            // InternalIFACE.g:2292:2: ( rule__GSSIfaceUartPort__NumberAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getNumberAssignment_4()); 
            }
            // InternalIFACE.g:2293:2: ( rule__GSSIfaceUartPort__NumberAssignment_4 )
            // InternalIFACE.g:2293:3: rule__GSSIfaceUartPort__NumberAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__NumberAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getNumberAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__4__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__5"
    // InternalIFACE.g:2301:1: rule__GSSIfaceUartPort__Group__5 : rule__GSSIfaceUartPort__Group__5__Impl rule__GSSIfaceUartPort__Group__6 ;
    public final void rule__GSSIfaceUartPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2305:1: ( rule__GSSIfaceUartPort__Group__5__Impl rule__GSSIfaceUartPort__Group__6 )
            // InternalIFACE.g:2306:2: rule__GSSIfaceUartPort__Group__5__Impl rule__GSSIfaceUartPort__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__GSSIfaceUartPort__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__5"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__5__Impl"
    // InternalIFACE.g:2313:1: rule__GSSIfaceUartPort__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2317:1: ( ( ';' ) )
            // InternalIFACE.g:2318:1: ( ';' )
            {
            // InternalIFACE.g:2318:1: ( ';' )
            // InternalIFACE.g:2319:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_5()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__5__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__6"
    // InternalIFACE.g:2328:1: rule__GSSIfaceUartPort__Group__6 : rule__GSSIfaceUartPort__Group__6__Impl rule__GSSIfaceUartPort__Group__7 ;
    public final void rule__GSSIfaceUartPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2332:1: ( rule__GSSIfaceUartPort__Group__6__Impl rule__GSSIfaceUartPort__Group__7 )
            // InternalIFACE.g:2333:2: rule__GSSIfaceUartPort__Group__6__Impl rule__GSSIfaceUartPort__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfaceUartPort__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__6"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__6__Impl"
    // InternalIFACE.g:2340:1: rule__GSSIfaceUartPort__Group__6__Impl : ( 'baudRate' ) ;
    public final void rule__GSSIfaceUartPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2344:1: ( ( 'baudRate' ) )
            // InternalIFACE.g:2345:1: ( 'baudRate' )
            {
            // InternalIFACE.g:2345:1: ( 'baudRate' )
            // InternalIFACE.g:2346:2: 'baudRate'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateKeyword_6()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__6__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__7"
    // InternalIFACE.g:2355:1: rule__GSSIfaceUartPort__Group__7 : rule__GSSIfaceUartPort__Group__7__Impl rule__GSSIfaceUartPort__Group__8 ;
    public final void rule__GSSIfaceUartPort__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2359:1: ( rule__GSSIfaceUartPort__Group__7__Impl rule__GSSIfaceUartPort__Group__8 )
            // InternalIFACE.g:2360:2: rule__GSSIfaceUartPort__Group__7__Impl rule__GSSIfaceUartPort__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__GSSIfaceUartPort__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__7"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__7__Impl"
    // InternalIFACE.g:2367:1: rule__GSSIfaceUartPort__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartPort__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2371:1: ( ( ':=' ) )
            // InternalIFACE.g:2372:1: ( ':=' )
            {
            // InternalIFACE.g:2372:1: ( ':=' )
            // InternalIFACE.g:2373:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__7__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__8"
    // InternalIFACE.g:2382:1: rule__GSSIfaceUartPort__Group__8 : rule__GSSIfaceUartPort__Group__8__Impl rule__GSSIfaceUartPort__Group__9 ;
    public final void rule__GSSIfaceUartPort__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2386:1: ( rule__GSSIfaceUartPort__Group__8__Impl rule__GSSIfaceUartPort__Group__9 )
            // InternalIFACE.g:2387:2: rule__GSSIfaceUartPort__Group__8__Impl rule__GSSIfaceUartPort__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceUartPort__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__8"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__8__Impl"
    // InternalIFACE.g:2394:1: rule__GSSIfaceUartPort__Group__8__Impl : ( ( rule__GSSIfaceUartPort__BaudRateAssignment_8 ) ) ;
    public final void rule__GSSIfaceUartPort__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2398:1: ( ( ( rule__GSSIfaceUartPort__BaudRateAssignment_8 ) ) )
            // InternalIFACE.g:2399:1: ( ( rule__GSSIfaceUartPort__BaudRateAssignment_8 ) )
            {
            // InternalIFACE.g:2399:1: ( ( rule__GSSIfaceUartPort__BaudRateAssignment_8 ) )
            // InternalIFACE.g:2400:2: ( rule__GSSIfaceUartPort__BaudRateAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateAssignment_8()); 
            }
            // InternalIFACE.g:2401:2: ( rule__GSSIfaceUartPort__BaudRateAssignment_8 )
            // InternalIFACE.g:2401:3: rule__GSSIfaceUartPort__BaudRateAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__BaudRateAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__8__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__9"
    // InternalIFACE.g:2409:1: rule__GSSIfaceUartPort__Group__9 : rule__GSSIfaceUartPort__Group__9__Impl rule__GSSIfaceUartPort__Group__10 ;
    public final void rule__GSSIfaceUartPort__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2413:1: ( rule__GSSIfaceUartPort__Group__9__Impl rule__GSSIfaceUartPort__Group__10 )
            // InternalIFACE.g:2414:2: rule__GSSIfaceUartPort__Group__9__Impl rule__GSSIfaceUartPort__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__GSSIfaceUartPort__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__9"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__9__Impl"
    // InternalIFACE.g:2421:1: rule__GSSIfaceUartPort__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2425:1: ( ( ';' ) )
            // InternalIFACE.g:2426:1: ( ';' )
            {
            // InternalIFACE.g:2426:1: ( ';' )
            // InternalIFACE.g:2427:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_9()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__9__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__10"
    // InternalIFACE.g:2436:1: rule__GSSIfaceUartPort__Group__10 : rule__GSSIfaceUartPort__Group__10__Impl rule__GSSIfaceUartPort__Group__11 ;
    public final void rule__GSSIfaceUartPort__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2440:1: ( rule__GSSIfaceUartPort__Group__10__Impl rule__GSSIfaceUartPort__Group__11 )
            // InternalIFACE.g:2441:2: rule__GSSIfaceUartPort__Group__10__Impl rule__GSSIfaceUartPort__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfaceUartPort__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__10"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__10__Impl"
    // InternalIFACE.g:2448:1: rule__GSSIfaceUartPort__Group__10__Impl : ( 'parity' ) ;
    public final void rule__GSSIfaceUartPort__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2452:1: ( ( 'parity' ) )
            // InternalIFACE.g:2453:1: ( 'parity' )
            {
            // InternalIFACE.g:2453:1: ( 'parity' )
            // InternalIFACE.g:2454:2: 'parity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getParityKeyword_10()); 
            }
            match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getParityKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__10__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__11"
    // InternalIFACE.g:2463:1: rule__GSSIfaceUartPort__Group__11 : rule__GSSIfaceUartPort__Group__11__Impl rule__GSSIfaceUartPort__Group__12 ;
    public final void rule__GSSIfaceUartPort__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2467:1: ( rule__GSSIfaceUartPort__Group__11__Impl rule__GSSIfaceUartPort__Group__12 )
            // InternalIFACE.g:2468:2: rule__GSSIfaceUartPort__Group__11__Impl rule__GSSIfaceUartPort__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__GSSIfaceUartPort__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__11"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__11__Impl"
    // InternalIFACE.g:2475:1: rule__GSSIfaceUartPort__Group__11__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartPort__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2479:1: ( ( ':=' ) )
            // InternalIFACE.g:2480:1: ( ':=' )
            {
            // InternalIFACE.g:2480:1: ( ':=' )
            // InternalIFACE.g:2481:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_11()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__11__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__12"
    // InternalIFACE.g:2490:1: rule__GSSIfaceUartPort__Group__12 : rule__GSSIfaceUartPort__Group__12__Impl rule__GSSIfaceUartPort__Group__13 ;
    public final void rule__GSSIfaceUartPort__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2494:1: ( rule__GSSIfaceUartPort__Group__12__Impl rule__GSSIfaceUartPort__Group__13 )
            // InternalIFACE.g:2495:2: rule__GSSIfaceUartPort__Group__12__Impl rule__GSSIfaceUartPort__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceUartPort__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__12"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__12__Impl"
    // InternalIFACE.g:2502:1: rule__GSSIfaceUartPort__Group__12__Impl : ( ( rule__GSSIfaceUartPort__ParityAssignment_12 ) ) ;
    public final void rule__GSSIfaceUartPort__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2506:1: ( ( ( rule__GSSIfaceUartPort__ParityAssignment_12 ) ) )
            // InternalIFACE.g:2507:1: ( ( rule__GSSIfaceUartPort__ParityAssignment_12 ) )
            {
            // InternalIFACE.g:2507:1: ( ( rule__GSSIfaceUartPort__ParityAssignment_12 ) )
            // InternalIFACE.g:2508:2: ( rule__GSSIfaceUartPort__ParityAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getParityAssignment_12()); 
            }
            // InternalIFACE.g:2509:2: ( rule__GSSIfaceUartPort__ParityAssignment_12 )
            // InternalIFACE.g:2509:3: rule__GSSIfaceUartPort__ParityAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__ParityAssignment_12();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getParityAssignment_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__12__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__13"
    // InternalIFACE.g:2517:1: rule__GSSIfaceUartPort__Group__13 : rule__GSSIfaceUartPort__Group__13__Impl rule__GSSIfaceUartPort__Group__14 ;
    public final void rule__GSSIfaceUartPort__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2521:1: ( rule__GSSIfaceUartPort__Group__13__Impl rule__GSSIfaceUartPort__Group__14 )
            // InternalIFACE.g:2522:2: rule__GSSIfaceUartPort__Group__13__Impl rule__GSSIfaceUartPort__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__GSSIfaceUartPort__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__13"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__13__Impl"
    // InternalIFACE.g:2529:1: rule__GSSIfaceUartPort__Group__13__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2533:1: ( ( ';' ) )
            // InternalIFACE.g:2534:1: ( ';' )
            {
            // InternalIFACE.g:2534:1: ( ';' )
            // InternalIFACE.g:2535:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_13()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__13__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__14"
    // InternalIFACE.g:2544:1: rule__GSSIfaceUartPort__Group__14 : rule__GSSIfaceUartPort__Group__14__Impl rule__GSSIfaceUartPort__Group__15 ;
    public final void rule__GSSIfaceUartPort__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2548:1: ( rule__GSSIfaceUartPort__Group__14__Impl rule__GSSIfaceUartPort__Group__15 )
            // InternalIFACE.g:2549:2: rule__GSSIfaceUartPort__Group__14__Impl rule__GSSIfaceUartPort__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfaceUartPort__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__15();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__14"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__14__Impl"
    // InternalIFACE.g:2556:1: rule__GSSIfaceUartPort__Group__14__Impl : ( 'dataBits' ) ;
    public final void rule__GSSIfaceUartPort__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2560:1: ( ( 'dataBits' ) )
            // InternalIFACE.g:2561:1: ( 'dataBits' )
            {
            // InternalIFACE.g:2561:1: ( 'dataBits' )
            // InternalIFACE.g:2562:2: 'dataBits'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsKeyword_14()); 
            }
            match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsKeyword_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__14__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__15"
    // InternalIFACE.g:2571:1: rule__GSSIfaceUartPort__Group__15 : rule__GSSIfaceUartPort__Group__15__Impl rule__GSSIfaceUartPort__Group__16 ;
    public final void rule__GSSIfaceUartPort__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2575:1: ( rule__GSSIfaceUartPort__Group__15__Impl rule__GSSIfaceUartPort__Group__16 )
            // InternalIFACE.g:2576:2: rule__GSSIfaceUartPort__Group__15__Impl rule__GSSIfaceUartPort__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__GSSIfaceUartPort__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__16();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__15"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__15__Impl"
    // InternalIFACE.g:2583:1: rule__GSSIfaceUartPort__Group__15__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartPort__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2587:1: ( ( ':=' ) )
            // InternalIFACE.g:2588:1: ( ':=' )
            {
            // InternalIFACE.g:2588:1: ( ':=' )
            // InternalIFACE.g:2589:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_15()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_15()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__15__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__16"
    // InternalIFACE.g:2598:1: rule__GSSIfaceUartPort__Group__16 : rule__GSSIfaceUartPort__Group__16__Impl rule__GSSIfaceUartPort__Group__17 ;
    public final void rule__GSSIfaceUartPort__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2602:1: ( rule__GSSIfaceUartPort__Group__16__Impl rule__GSSIfaceUartPort__Group__17 )
            // InternalIFACE.g:2603:2: rule__GSSIfaceUartPort__Group__16__Impl rule__GSSIfaceUartPort__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceUartPort__Group__16__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__17();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__16"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__16__Impl"
    // InternalIFACE.g:2610:1: rule__GSSIfaceUartPort__Group__16__Impl : ( ( rule__GSSIfaceUartPort__DataBitsAssignment_16 ) ) ;
    public final void rule__GSSIfaceUartPort__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2614:1: ( ( ( rule__GSSIfaceUartPort__DataBitsAssignment_16 ) ) )
            // InternalIFACE.g:2615:1: ( ( rule__GSSIfaceUartPort__DataBitsAssignment_16 ) )
            {
            // InternalIFACE.g:2615:1: ( ( rule__GSSIfaceUartPort__DataBitsAssignment_16 ) )
            // InternalIFACE.g:2616:2: ( rule__GSSIfaceUartPort__DataBitsAssignment_16 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsAssignment_16()); 
            }
            // InternalIFACE.g:2617:2: ( rule__GSSIfaceUartPort__DataBitsAssignment_16 )
            // InternalIFACE.g:2617:3: rule__GSSIfaceUartPort__DataBitsAssignment_16
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__DataBitsAssignment_16();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsAssignment_16()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__16__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__17"
    // InternalIFACE.g:2625:1: rule__GSSIfaceUartPort__Group__17 : rule__GSSIfaceUartPort__Group__17__Impl rule__GSSIfaceUartPort__Group__18 ;
    public final void rule__GSSIfaceUartPort__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2629:1: ( rule__GSSIfaceUartPort__Group__17__Impl rule__GSSIfaceUartPort__Group__18 )
            // InternalIFACE.g:2630:2: rule__GSSIfaceUartPort__Group__17__Impl rule__GSSIfaceUartPort__Group__18
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__GSSIfaceUartPort__Group__17__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__18();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__17"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__17__Impl"
    // InternalIFACE.g:2637:1: rule__GSSIfaceUartPort__Group__17__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2641:1: ( ( ';' ) )
            // InternalIFACE.g:2642:1: ( ';' )
            {
            // InternalIFACE.g:2642:1: ( ';' )
            // InternalIFACE.g:2643:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_17()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_17()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__17__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__18"
    // InternalIFACE.g:2652:1: rule__GSSIfaceUartPort__Group__18 : rule__GSSIfaceUartPort__Group__18__Impl rule__GSSIfaceUartPort__Group__19 ;
    public final void rule__GSSIfaceUartPort__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2656:1: ( rule__GSSIfaceUartPort__Group__18__Impl rule__GSSIfaceUartPort__Group__19 )
            // InternalIFACE.g:2657:2: rule__GSSIfaceUartPort__Group__18__Impl rule__GSSIfaceUartPort__Group__19
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfaceUartPort__Group__18__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__19();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__18"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__18__Impl"
    // InternalIFACE.g:2664:1: rule__GSSIfaceUartPort__Group__18__Impl : ( 'stopBits' ) ;
    public final void rule__GSSIfaceUartPort__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2668:1: ( ( 'stopBits' ) )
            // InternalIFACE.g:2669:1: ( 'stopBits' )
            {
            // InternalIFACE.g:2669:1: ( 'stopBits' )
            // InternalIFACE.g:2670:2: 'stopBits'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsKeyword_18()); 
            }
            match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsKeyword_18()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__18__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__19"
    // InternalIFACE.g:2679:1: rule__GSSIfaceUartPort__Group__19 : rule__GSSIfaceUartPort__Group__19__Impl rule__GSSIfaceUartPort__Group__20 ;
    public final void rule__GSSIfaceUartPort__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2683:1: ( rule__GSSIfaceUartPort__Group__19__Impl rule__GSSIfaceUartPort__Group__20 )
            // InternalIFACE.g:2684:2: rule__GSSIfaceUartPort__Group__19__Impl rule__GSSIfaceUartPort__Group__20
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__GSSIfaceUartPort__Group__19__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__20();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__19"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__19__Impl"
    // InternalIFACE.g:2691:1: rule__GSSIfaceUartPort__Group__19__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartPort__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2695:1: ( ( ':=' ) )
            // InternalIFACE.g:2696:1: ( ':=' )
            {
            // InternalIFACE.g:2696:1: ( ':=' )
            // InternalIFACE.g:2697:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_19()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_19()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__19__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__20"
    // InternalIFACE.g:2706:1: rule__GSSIfaceUartPort__Group__20 : rule__GSSIfaceUartPort__Group__20__Impl rule__GSSIfaceUartPort__Group__21 ;
    public final void rule__GSSIfaceUartPort__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2710:1: ( rule__GSSIfaceUartPort__Group__20__Impl rule__GSSIfaceUartPort__Group__21 )
            // InternalIFACE.g:2711:2: rule__GSSIfaceUartPort__Group__20__Impl rule__GSSIfaceUartPort__Group__21
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceUartPort__Group__20__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__21();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__20"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__20__Impl"
    // InternalIFACE.g:2718:1: rule__GSSIfaceUartPort__Group__20__Impl : ( ( rule__GSSIfaceUartPort__StopBitsAssignment_20 ) ) ;
    public final void rule__GSSIfaceUartPort__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2722:1: ( ( ( rule__GSSIfaceUartPort__StopBitsAssignment_20 ) ) )
            // InternalIFACE.g:2723:1: ( ( rule__GSSIfaceUartPort__StopBitsAssignment_20 ) )
            {
            // InternalIFACE.g:2723:1: ( ( rule__GSSIfaceUartPort__StopBitsAssignment_20 ) )
            // InternalIFACE.g:2724:2: ( rule__GSSIfaceUartPort__StopBitsAssignment_20 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsAssignment_20()); 
            }
            // InternalIFACE.g:2725:2: ( rule__GSSIfaceUartPort__StopBitsAssignment_20 )
            // InternalIFACE.g:2725:3: rule__GSSIfaceUartPort__StopBitsAssignment_20
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__StopBitsAssignment_20();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsAssignment_20()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__20__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__21"
    // InternalIFACE.g:2733:1: rule__GSSIfaceUartPort__Group__21 : rule__GSSIfaceUartPort__Group__21__Impl rule__GSSIfaceUartPort__Group__22 ;
    public final void rule__GSSIfaceUartPort__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2737:1: ( rule__GSSIfaceUartPort__Group__21__Impl rule__GSSIfaceUartPort__Group__22 )
            // InternalIFACE.g:2738:2: rule__GSSIfaceUartPort__Group__21__Impl rule__GSSIfaceUartPort__Group__22
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__GSSIfaceUartPort__Group__21__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__22();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__21"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__21__Impl"
    // InternalIFACE.g:2745:1: rule__GSSIfaceUartPort__Group__21__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2749:1: ( ( ';' ) )
            // InternalIFACE.g:2750:1: ( ';' )
            {
            // InternalIFACE.g:2750:1: ( ';' )
            // InternalIFACE.g:2751:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_21()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_21()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__21__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__22"
    // InternalIFACE.g:2760:1: rule__GSSIfaceUartPort__Group__22 : rule__GSSIfaceUartPort__Group__22__Impl rule__GSSIfaceUartPort__Group__23 ;
    public final void rule__GSSIfaceUartPort__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2764:1: ( rule__GSSIfaceUartPort__Group__22__Impl rule__GSSIfaceUartPort__Group__23 )
            // InternalIFACE.g:2765:2: rule__GSSIfaceUartPort__Group__22__Impl rule__GSSIfaceUartPort__Group__23
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfaceUartPort__Group__22__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__23();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__22"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__22__Impl"
    // InternalIFACE.g:2772:1: rule__GSSIfaceUartPort__Group__22__Impl : ( 'flowControl' ) ;
    public final void rule__GSSIfaceUartPort__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2776:1: ( ( 'flowControl' ) )
            // InternalIFACE.g:2777:1: ( 'flowControl' )
            {
            // InternalIFACE.g:2777:1: ( 'flowControl' )
            // InternalIFACE.g:2778:2: 'flowControl'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getFlowControlKeyword_22()); 
            }
            match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getFlowControlKeyword_22()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__22__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__23"
    // InternalIFACE.g:2787:1: rule__GSSIfaceUartPort__Group__23 : rule__GSSIfaceUartPort__Group__23__Impl rule__GSSIfaceUartPort__Group__24 ;
    public final void rule__GSSIfaceUartPort__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2791:1: ( rule__GSSIfaceUartPort__Group__23__Impl rule__GSSIfaceUartPort__Group__24 )
            // InternalIFACE.g:2792:2: rule__GSSIfaceUartPort__Group__23__Impl rule__GSSIfaceUartPort__Group__24
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__GSSIfaceUartPort__Group__23__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__24();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__23"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__23__Impl"
    // InternalIFACE.g:2799:1: rule__GSSIfaceUartPort__Group__23__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartPort__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2803:1: ( ( ':=' ) )
            // InternalIFACE.g:2804:1: ( ':=' )
            {
            // InternalIFACE.g:2804:1: ( ':=' )
            // InternalIFACE.g:2805:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_23()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_23()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__23__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__24"
    // InternalIFACE.g:2814:1: rule__GSSIfaceUartPort__Group__24 : rule__GSSIfaceUartPort__Group__24__Impl rule__GSSIfaceUartPort__Group__25 ;
    public final void rule__GSSIfaceUartPort__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2818:1: ( rule__GSSIfaceUartPort__Group__24__Impl rule__GSSIfaceUartPort__Group__25 )
            // InternalIFACE.g:2819:2: rule__GSSIfaceUartPort__Group__24__Impl rule__GSSIfaceUartPort__Group__25
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceUartPort__Group__24__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__25();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__24"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__24__Impl"
    // InternalIFACE.g:2826:1: rule__GSSIfaceUartPort__Group__24__Impl : ( ( rule__GSSIfaceUartPort__FlowControlAssignment_24 ) ) ;
    public final void rule__GSSIfaceUartPort__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2830:1: ( ( ( rule__GSSIfaceUartPort__FlowControlAssignment_24 ) ) )
            // InternalIFACE.g:2831:1: ( ( rule__GSSIfaceUartPort__FlowControlAssignment_24 ) )
            {
            // InternalIFACE.g:2831:1: ( ( rule__GSSIfaceUartPort__FlowControlAssignment_24 ) )
            // InternalIFACE.g:2832:2: ( rule__GSSIfaceUartPort__FlowControlAssignment_24 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getFlowControlAssignment_24()); 
            }
            // InternalIFACE.g:2833:2: ( rule__GSSIfaceUartPort__FlowControlAssignment_24 )
            // InternalIFACE.g:2833:3: rule__GSSIfaceUartPort__FlowControlAssignment_24
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__FlowControlAssignment_24();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getFlowControlAssignment_24()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__24__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__25"
    // InternalIFACE.g:2841:1: rule__GSSIfaceUartPort__Group__25 : rule__GSSIfaceUartPort__Group__25__Impl rule__GSSIfaceUartPort__Group__26 ;
    public final void rule__GSSIfaceUartPort__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2845:1: ( rule__GSSIfaceUartPort__Group__25__Impl rule__GSSIfaceUartPort__Group__26 )
            // InternalIFACE.g:2846:2: rule__GSSIfaceUartPort__Group__25__Impl rule__GSSIfaceUartPort__Group__26
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__GSSIfaceUartPort__Group__25__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__26();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__25"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__25__Impl"
    // InternalIFACE.g:2853:1: rule__GSSIfaceUartPort__Group__25__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2857:1: ( ( ';' ) )
            // InternalIFACE.g:2858:1: ( ';' )
            {
            // InternalIFACE.g:2858:1: ( ';' )
            // InternalIFACE.g:2859:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_25()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_25()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__25__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__26"
    // InternalIFACE.g:2868:1: rule__GSSIfaceUartPort__Group__26 : rule__GSSIfaceUartPort__Group__26__Impl rule__GSSIfaceUartPort__Group__27 ;
    public final void rule__GSSIfaceUartPort__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2872:1: ( rule__GSSIfaceUartPort__Group__26__Impl rule__GSSIfaceUartPort__Group__27 )
            // InternalIFACE.g:2873:2: rule__GSSIfaceUartPort__Group__26__Impl rule__GSSIfaceUartPort__Group__27
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceUartPort__Group__26__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__27();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__26"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__26__Impl"
    // InternalIFACE.g:2880:1: rule__GSSIfaceUartPort__Group__26__Impl : ( ( rule__GSSIfaceUartPort__UartProtocolAssignment_26 ) ) ;
    public final void rule__GSSIfaceUartPort__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2884:1: ( ( ( rule__GSSIfaceUartPort__UartProtocolAssignment_26 ) ) )
            // InternalIFACE.g:2885:1: ( ( rule__GSSIfaceUartPort__UartProtocolAssignment_26 ) )
            {
            // InternalIFACE.g:2885:1: ( ( rule__GSSIfaceUartPort__UartProtocolAssignment_26 ) )
            // InternalIFACE.g:2886:2: ( rule__GSSIfaceUartPort__UartProtocolAssignment_26 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getUartProtocolAssignment_26()); 
            }
            // InternalIFACE.g:2887:2: ( rule__GSSIfaceUartPort__UartProtocolAssignment_26 )
            // InternalIFACE.g:2887:3: rule__GSSIfaceUartPort__UartProtocolAssignment_26
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__UartProtocolAssignment_26();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getUartProtocolAssignment_26()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__26__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__27"
    // InternalIFACE.g:2895:1: rule__GSSIfaceUartPort__Group__27 : rule__GSSIfaceUartPort__Group__27__Impl rule__GSSIfaceUartPort__Group__28 ;
    public final void rule__GSSIfaceUartPort__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2899:1: ( rule__GSSIfaceUartPort__Group__27__Impl rule__GSSIfaceUartPort__Group__28 )
            // InternalIFACE.g:2900:2: rule__GSSIfaceUartPort__Group__27__Impl rule__GSSIfaceUartPort__Group__28
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceUartPort__Group__27__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__28();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__27"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__27__Impl"
    // InternalIFACE.g:2907:1: rule__GSSIfaceUartPort__Group__27__Impl : ( '}' ) ;
    public final void rule__GSSIfaceUartPort__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2911:1: ( ( '}' ) )
            // InternalIFACE.g:2912:1: ( '}' )
            {
            // InternalIFACE.g:2912:1: ( '}' )
            // InternalIFACE.g:2913:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getRightCurlyBracketKeyword_27()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getRightCurlyBracketKeyword_27()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__27__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__28"
    // InternalIFACE.g:2922:1: rule__GSSIfaceUartPort__Group__28 : rule__GSSIfaceUartPort__Group__28__Impl ;
    public final void rule__GSSIfaceUartPort__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2926:1: ( rule__GSSIfaceUartPort__Group__28__Impl )
            // InternalIFACE.g:2927:2: rule__GSSIfaceUartPort__Group__28__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__28__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__28"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__28__Impl"
    // InternalIFACE.g:2933:1: rule__GSSIfaceUartPort__Group__28__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2937:1: ( ( ';' ) )
            // InternalIFACE.g:2938:1: ( ';' )
            {
            // InternalIFACE.g:2938:1: ( ';' )
            // InternalIFACE.g:2939:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_28()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_28()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__28__Impl"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__0"
    // InternalIFACE.g:2949:1: rule__GSSIfaceUartProtocol__Group__0 : rule__GSSIfaceUartProtocol__Group__0__Impl rule__GSSIfaceUartProtocol__Group__1 ;
    public final void rule__GSSIfaceUartProtocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2953:1: ( rule__GSSIfaceUartProtocol__Group__0__Impl rule__GSSIfaceUartProtocol__Group__1 )
            // InternalIFACE.g:2954:2: rule__GSSIfaceUartProtocol__Group__0__Impl rule__GSSIfaceUartProtocol__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSIfaceUartProtocol__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__0"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__0__Impl"
    // InternalIFACE.g:2961:1: rule__GSSIfaceUartProtocol__Group__0__Impl : ( 'uartProtocol' ) ;
    public final void rule__GSSIfaceUartProtocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2965:1: ( ( 'uartProtocol' ) )
            // InternalIFACE.g:2966:1: ( 'uartProtocol' )
            {
            // InternalIFACE.g:2966:1: ( 'uartProtocol' )
            // InternalIFACE.g:2967:2: 'uartProtocol'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getUartProtocolKeyword_0()); 
            }
            match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getUartProtocolKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__0__Impl"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__1"
    // InternalIFACE.g:2976:1: rule__GSSIfaceUartProtocol__Group__1 : rule__GSSIfaceUartProtocol__Group__1__Impl rule__GSSIfaceUartProtocol__Group__2 ;
    public final void rule__GSSIfaceUartProtocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2980:1: ( rule__GSSIfaceUartProtocol__Group__1__Impl rule__GSSIfaceUartProtocol__Group__2 )
            // InternalIFACE.g:2981:2: rule__GSSIfaceUartProtocol__Group__1__Impl rule__GSSIfaceUartProtocol__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__GSSIfaceUartProtocol__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__1"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__1__Impl"
    // InternalIFACE.g:2988:1: rule__GSSIfaceUartProtocol__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceUartProtocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2992:1: ( ( '{' ) )
            // InternalIFACE.g:2993:1: ( '{' )
            {
            // InternalIFACE.g:2993:1: ( '{' )
            // InternalIFACE.g:2994:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__1__Impl"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__2"
    // InternalIFACE.g:3003:1: rule__GSSIfaceUartProtocol__Group__2 : rule__GSSIfaceUartProtocol__Group__2__Impl rule__GSSIfaceUartProtocol__Group__3 ;
    public final void rule__GSSIfaceUartProtocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3007:1: ( rule__GSSIfaceUartProtocol__Group__2__Impl rule__GSSIfaceUartProtocol__Group__3 )
            // InternalIFACE.g:3008:2: rule__GSSIfaceUartProtocol__Group__2__Impl rule__GSSIfaceUartProtocol__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfaceUartProtocol__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__2"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__2__Impl"
    // InternalIFACE.g:3015:1: rule__GSSIfaceUartProtocol__Group__2__Impl : ( 'unit' ) ;
    public final void rule__GSSIfaceUartProtocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3019:1: ( ( 'unit' ) )
            // InternalIFACE.g:3020:1: ( 'unit' )
            {
            // InternalIFACE.g:3020:1: ( 'unit' )
            // InternalIFACE.g:3021:2: 'unit'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getUnitKeyword_2()); 
            }
            match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getUnitKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__2__Impl"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__3"
    // InternalIFACE.g:3030:1: rule__GSSIfaceUartProtocol__Group__3 : rule__GSSIfaceUartProtocol__Group__3__Impl rule__GSSIfaceUartProtocol__Group__4 ;
    public final void rule__GSSIfaceUartProtocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3034:1: ( rule__GSSIfaceUartProtocol__Group__3__Impl rule__GSSIfaceUartProtocol__Group__4 )
            // InternalIFACE.g:3035:2: rule__GSSIfaceUartProtocol__Group__3__Impl rule__GSSIfaceUartProtocol__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__GSSIfaceUartProtocol__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__3"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__3__Impl"
    // InternalIFACE.g:3042:1: rule__GSSIfaceUartProtocol__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartProtocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3046:1: ( ( ':=' ) )
            // InternalIFACE.g:3047:1: ( ':=' )
            {
            // InternalIFACE.g:3047:1: ( ':=' )
            // InternalIFACE.g:3048:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__3__Impl"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__4"
    // InternalIFACE.g:3057:1: rule__GSSIfaceUartProtocol__Group__4 : rule__GSSIfaceUartProtocol__Group__4__Impl rule__GSSIfaceUartProtocol__Group__5 ;
    public final void rule__GSSIfaceUartProtocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3061:1: ( rule__GSSIfaceUartProtocol__Group__4__Impl rule__GSSIfaceUartProtocol__Group__5 )
            // InternalIFACE.g:3062:2: rule__GSSIfaceUartProtocol__Group__4__Impl rule__GSSIfaceUartProtocol__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceUartProtocol__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__4"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__4__Impl"
    // InternalIFACE.g:3069:1: rule__GSSIfaceUartProtocol__Group__4__Impl : ( ( rule__GSSIfaceUartProtocol__UnitAssignment_4 ) ) ;
    public final void rule__GSSIfaceUartProtocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3073:1: ( ( ( rule__GSSIfaceUartProtocol__UnitAssignment_4 ) ) )
            // InternalIFACE.g:3074:1: ( ( rule__GSSIfaceUartProtocol__UnitAssignment_4 ) )
            {
            // InternalIFACE.g:3074:1: ( ( rule__GSSIfaceUartProtocol__UnitAssignment_4 ) )
            // InternalIFACE.g:3075:2: ( rule__GSSIfaceUartProtocol__UnitAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getUnitAssignment_4()); 
            }
            // InternalIFACE.g:3076:2: ( rule__GSSIfaceUartProtocol__UnitAssignment_4 )
            // InternalIFACE.g:3076:3: rule__GSSIfaceUartProtocol__UnitAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__UnitAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getUnitAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__4__Impl"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__5"
    // InternalIFACE.g:3084:1: rule__GSSIfaceUartProtocol__Group__5 : rule__GSSIfaceUartProtocol__Group__5__Impl rule__GSSIfaceUartProtocol__Group__6 ;
    public final void rule__GSSIfaceUartProtocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3088:1: ( rule__GSSIfaceUartProtocol__Group__5__Impl rule__GSSIfaceUartProtocol__Group__6 )
            // InternalIFACE.g:3089:2: rule__GSSIfaceUartProtocol__Group__5__Impl rule__GSSIfaceUartProtocol__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__GSSIfaceUartProtocol__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__5"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__5__Impl"
    // InternalIFACE.g:3096:1: rule__GSSIfaceUartProtocol__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartProtocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3100:1: ( ( ';' ) )
            // InternalIFACE.g:3101:1: ( ';' )
            {
            // InternalIFACE.g:3101:1: ( ';' )
            // InternalIFACE.g:3102:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_5()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__5__Impl"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__6"
    // InternalIFACE.g:3111:1: rule__GSSIfaceUartProtocol__Group__6 : rule__GSSIfaceUartProtocol__Group__6__Impl rule__GSSIfaceUartProtocol__Group__7 ;
    public final void rule__GSSIfaceUartProtocol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3115:1: ( rule__GSSIfaceUartProtocol__Group__6__Impl rule__GSSIfaceUartProtocol__Group__7 )
            // InternalIFACE.g:3116:2: rule__GSSIfaceUartProtocol__Group__6__Impl rule__GSSIfaceUartProtocol__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfaceUartProtocol__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__6"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__6__Impl"
    // InternalIFACE.g:3123:1: rule__GSSIfaceUartProtocol__Group__6__Impl : ( 'power' ) ;
    public final void rule__GSSIfaceUartProtocol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3127:1: ( ( 'power' ) )
            // InternalIFACE.g:3128:1: ( 'power' )
            {
            // InternalIFACE.g:3128:1: ( 'power' )
            // InternalIFACE.g:3129:2: 'power'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getPowerKeyword_6()); 
            }
            match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getPowerKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__6__Impl"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__7"
    // InternalIFACE.g:3138:1: rule__GSSIfaceUartProtocol__Group__7 : rule__GSSIfaceUartProtocol__Group__7__Impl rule__GSSIfaceUartProtocol__Group__8 ;
    public final void rule__GSSIfaceUartProtocol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3142:1: ( rule__GSSIfaceUartProtocol__Group__7__Impl rule__GSSIfaceUartProtocol__Group__8 )
            // InternalIFACE.g:3143:2: rule__GSSIfaceUartProtocol__Group__7__Impl rule__GSSIfaceUartProtocol__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_37);
            rule__GSSIfaceUartProtocol__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__7"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__7__Impl"
    // InternalIFACE.g:3150:1: rule__GSSIfaceUartProtocol__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartProtocol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3154:1: ( ( ':=' ) )
            // InternalIFACE.g:3155:1: ( ':=' )
            {
            // InternalIFACE.g:3155:1: ( ':=' )
            // InternalIFACE.g:3156:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__7__Impl"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__8"
    // InternalIFACE.g:3165:1: rule__GSSIfaceUartProtocol__Group__8 : rule__GSSIfaceUartProtocol__Group__8__Impl rule__GSSIfaceUartProtocol__Group__9 ;
    public final void rule__GSSIfaceUartProtocol__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3169:1: ( rule__GSSIfaceUartProtocol__Group__8__Impl rule__GSSIfaceUartProtocol__Group__9 )
            // InternalIFACE.g:3170:2: rule__GSSIfaceUartProtocol__Group__8__Impl rule__GSSIfaceUartProtocol__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceUartProtocol__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__8"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__8__Impl"
    // InternalIFACE.g:3177:1: rule__GSSIfaceUartProtocol__Group__8__Impl : ( ( rule__GSSIfaceUartProtocol__PowerAssignment_8 ) ) ;
    public final void rule__GSSIfaceUartProtocol__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3181:1: ( ( ( rule__GSSIfaceUartProtocol__PowerAssignment_8 ) ) )
            // InternalIFACE.g:3182:1: ( ( rule__GSSIfaceUartProtocol__PowerAssignment_8 ) )
            {
            // InternalIFACE.g:3182:1: ( ( rule__GSSIfaceUartProtocol__PowerAssignment_8 ) )
            // InternalIFACE.g:3183:2: ( rule__GSSIfaceUartProtocol__PowerAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getPowerAssignment_8()); 
            }
            // InternalIFACE.g:3184:2: ( rule__GSSIfaceUartProtocol__PowerAssignment_8 )
            // InternalIFACE.g:3184:3: rule__GSSIfaceUartProtocol__PowerAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__PowerAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getPowerAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__8__Impl"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__9"
    // InternalIFACE.g:3192:1: rule__GSSIfaceUartProtocol__Group__9 : rule__GSSIfaceUartProtocol__Group__9__Impl rule__GSSIfaceUartProtocol__Group__10 ;
    public final void rule__GSSIfaceUartProtocol__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3196:1: ( rule__GSSIfaceUartProtocol__Group__9__Impl rule__GSSIfaceUartProtocol__Group__10 )
            // InternalIFACE.g:3197:2: rule__GSSIfaceUartProtocol__Group__9__Impl rule__GSSIfaceUartProtocol__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_38);
            rule__GSSIfaceUartProtocol__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__9"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__9__Impl"
    // InternalIFACE.g:3204:1: rule__GSSIfaceUartProtocol__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartProtocol__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3208:1: ( ( ';' ) )
            // InternalIFACE.g:3209:1: ( ';' )
            {
            // InternalIFACE.g:3209:1: ( ';' )
            // InternalIFACE.g:3210:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_9()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__9__Impl"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__10"
    // InternalIFACE.g:3219:1: rule__GSSIfaceUartProtocol__Group__10 : rule__GSSIfaceUartProtocol__Group__10__Impl rule__GSSIfaceUartProtocol__Group__11 ;
    public final void rule__GSSIfaceUartProtocol__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3223:1: ( rule__GSSIfaceUartProtocol__Group__10__Impl rule__GSSIfaceUartProtocol__Group__11 )
            // InternalIFACE.g:3224:2: rule__GSSIfaceUartProtocol__Group__10__Impl rule__GSSIfaceUartProtocol__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__GSSIfaceUartProtocol__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__10"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__10__Impl"
    // InternalIFACE.g:3231:1: rule__GSSIfaceUartProtocol__Group__10__Impl : ( ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_10 ) ) ;
    public final void rule__GSSIfaceUartProtocol__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3235:1: ( ( ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_10 ) ) )
            // InternalIFACE.g:3236:1: ( ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_10 ) )
            {
            // InternalIFACE.g:3236:1: ( ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_10 ) )
            // InternalIFACE.g:3237:2: ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getConstSizeAssignment_10()); 
            }
            // InternalIFACE.g:3238:2: ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_10 )
            // InternalIFACE.g:3238:3: rule__GSSIfaceUartProtocol__ConstSizeAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__ConstSizeAssignment_10();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getConstSizeAssignment_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__10__Impl"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__11"
    // InternalIFACE.g:3246:1: rule__GSSIfaceUartProtocol__Group__11 : rule__GSSIfaceUartProtocol__Group__11__Impl rule__GSSIfaceUartProtocol__Group__12 ;
    public final void rule__GSSIfaceUartProtocol__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3250:1: ( rule__GSSIfaceUartProtocol__Group__11__Impl rule__GSSIfaceUartProtocol__Group__12 )
            // InternalIFACE.g:3251:2: rule__GSSIfaceUartProtocol__Group__11__Impl rule__GSSIfaceUartProtocol__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__GSSIfaceUartProtocol__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__11"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__11__Impl"
    // InternalIFACE.g:3258:1: rule__GSSIfaceUartProtocol__Group__11__Impl : ( ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_11 ) ) ;
    public final void rule__GSSIfaceUartProtocol__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3262:1: ( ( ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_11 ) ) )
            // InternalIFACE.g:3263:1: ( ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_11 ) )
            {
            // InternalIFACE.g:3263:1: ( ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_11 ) )
            // InternalIFACE.g:3264:2: ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_11 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldOffsetAssignment_11()); 
            }
            // InternalIFACE.g:3265:2: ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_11 )
            // InternalIFACE.g:3265:3: rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_11();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldOffsetAssignment_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__11__Impl"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__12"
    // InternalIFACE.g:3273:1: rule__GSSIfaceUartProtocol__Group__12 : rule__GSSIfaceUartProtocol__Group__12__Impl rule__GSSIfaceUartProtocol__Group__13 ;
    public final void rule__GSSIfaceUartProtocol__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3277:1: ( rule__GSSIfaceUartProtocol__Group__12__Impl rule__GSSIfaceUartProtocol__Group__13 )
            // InternalIFACE.g:3278:2: rule__GSSIfaceUartProtocol__Group__12__Impl rule__GSSIfaceUartProtocol__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_41);
            rule__GSSIfaceUartProtocol__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__12"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__12__Impl"
    // InternalIFACE.g:3285:1: rule__GSSIfaceUartProtocol__Group__12__Impl : ( ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_12 ) ) ;
    public final void rule__GSSIfaceUartProtocol__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3289:1: ( ( ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_12 ) ) )
            // InternalIFACE.g:3290:1: ( ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_12 ) )
            {
            // InternalIFACE.g:3290:1: ( ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_12 ) )
            // InternalIFACE.g:3291:2: ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldTrimAssignment_12()); 
            }
            // InternalIFACE.g:3292:2: ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_12 )
            // InternalIFACE.g:3292:3: rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_12();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldTrimAssignment_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__12__Impl"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__13"
    // InternalIFACE.g:3300:1: rule__GSSIfaceUartProtocol__Group__13 : rule__GSSIfaceUartProtocol__Group__13__Impl rule__GSSIfaceUartProtocol__Group__14 ;
    public final void rule__GSSIfaceUartProtocol__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3304:1: ( rule__GSSIfaceUartProtocol__Group__13__Impl rule__GSSIfaceUartProtocol__Group__14 )
            // InternalIFACE.g:3305:2: rule__GSSIfaceUartProtocol__Group__13__Impl rule__GSSIfaceUartProtocol__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_41);
            rule__GSSIfaceUartProtocol__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__13"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__13__Impl"
    // InternalIFACE.g:3312:1: rule__GSSIfaceUartProtocol__Group__13__Impl : ( ( rule__GSSIfaceUartProtocol__SyncPatternAssignment_13 )? ) ;
    public final void rule__GSSIfaceUartProtocol__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3316:1: ( ( ( rule__GSSIfaceUartProtocol__SyncPatternAssignment_13 )? ) )
            // InternalIFACE.g:3317:1: ( ( rule__GSSIfaceUartProtocol__SyncPatternAssignment_13 )? )
            {
            // InternalIFACE.g:3317:1: ( ( rule__GSSIfaceUartProtocol__SyncPatternAssignment_13 )? )
            // InternalIFACE.g:3318:2: ( rule__GSSIfaceUartProtocol__SyncPatternAssignment_13 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getSyncPatternAssignment_13()); 
            }
            // InternalIFACE.g:3319:2: ( rule__GSSIfaceUartProtocol__SyncPatternAssignment_13 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==61) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalIFACE.g:3319:3: rule__GSSIfaceUartProtocol__SyncPatternAssignment_13
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartProtocol__SyncPatternAssignment_13();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getSyncPatternAssignment_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__13__Impl"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__14"
    // InternalIFACE.g:3327:1: rule__GSSIfaceUartProtocol__Group__14 : rule__GSSIfaceUartProtocol__Group__14__Impl rule__GSSIfaceUartProtocol__Group__15 ;
    public final void rule__GSSIfaceUartProtocol__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3331:1: ( rule__GSSIfaceUartProtocol__Group__14__Impl rule__GSSIfaceUartProtocol__Group__15 )
            // InternalIFACE.g:3332:2: rule__GSSIfaceUartProtocol__Group__14__Impl rule__GSSIfaceUartProtocol__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceUartProtocol__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__Group__15();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__14"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__14__Impl"
    // InternalIFACE.g:3339:1: rule__GSSIfaceUartProtocol__Group__14__Impl : ( '}' ) ;
    public final void rule__GSSIfaceUartProtocol__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3343:1: ( ( '}' ) )
            // InternalIFACE.g:3344:1: ( '}' )
            {
            // InternalIFACE.g:3344:1: ( '}' )
            // InternalIFACE.g:3345:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getRightCurlyBracketKeyword_14()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getRightCurlyBracketKeyword_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__14__Impl"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__15"
    // InternalIFACE.g:3354:1: rule__GSSIfaceUartProtocol__Group__15 : rule__GSSIfaceUartProtocol__Group__15__Impl ;
    public final void rule__GSSIfaceUartProtocol__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3358:1: ( rule__GSSIfaceUartProtocol__Group__15__Impl )
            // InternalIFACE.g:3359:2: rule__GSSIfaceUartProtocol__Group__15__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__15"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__15__Impl"
    // InternalIFACE.g:3365:1: rule__GSSIfaceUartProtocol__Group__15__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartProtocol__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3369:1: ( ( ';' ) )
            // InternalIFACE.g:3370:1: ( ';' )
            {
            // InternalIFACE.g:3370:1: ( ';' )
            // InternalIFACE.g:3371:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_15()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_15()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group__15__Impl"


    // $ANTLR start "rule__GSSIfaceConstSize__Group__0"
    // InternalIFACE.g:3381:1: rule__GSSIfaceConstSize__Group__0 : rule__GSSIfaceConstSize__Group__0__Impl rule__GSSIfaceConstSize__Group__1 ;
    public final void rule__GSSIfaceConstSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3385:1: ( rule__GSSIfaceConstSize__Group__0__Impl rule__GSSIfaceConstSize__Group__1 )
            // InternalIFACE.g:3386:2: rule__GSSIfaceConstSize__Group__0__Impl rule__GSSIfaceConstSize__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSIfaceConstSize__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group__0"


    // $ANTLR start "rule__GSSIfaceConstSize__Group__0__Impl"
    // InternalIFACE.g:3393:1: rule__GSSIfaceConstSize__Group__0__Impl : ( 'constSize' ) ;
    public final void rule__GSSIfaceConstSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3397:1: ( ( 'constSize' ) )
            // InternalIFACE.g:3398:1: ( 'constSize' )
            {
            // InternalIFACE.g:3398:1: ( 'constSize' )
            // InternalIFACE.g:3399:2: 'constSize'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getConstSizeKeyword_0()); 
            }
            match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getConstSizeKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group__0__Impl"


    // $ANTLR start "rule__GSSIfaceConstSize__Group__1"
    // InternalIFACE.g:3408:1: rule__GSSIfaceConstSize__Group__1 : rule__GSSIfaceConstSize__Group__1__Impl rule__GSSIfaceConstSize__Group__2 ;
    public final void rule__GSSIfaceConstSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3412:1: ( rule__GSSIfaceConstSize__Group__1__Impl rule__GSSIfaceConstSize__Group__2 )
            // InternalIFACE.g:3413:2: rule__GSSIfaceConstSize__Group__1__Impl rule__GSSIfaceConstSize__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__GSSIfaceConstSize__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group__1"


    // $ANTLR start "rule__GSSIfaceConstSize__Group__1__Impl"
    // InternalIFACE.g:3420:1: rule__GSSIfaceConstSize__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceConstSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3424:1: ( ( '{' ) )
            // InternalIFACE.g:3425:1: ( '{' )
            {
            // InternalIFACE.g:3425:1: ( '{' )
            // InternalIFACE.g:3426:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group__1__Impl"


    // $ANTLR start "rule__GSSIfaceConstSize__Group__2"
    // InternalIFACE.g:3435:1: rule__GSSIfaceConstSize__Group__2 : rule__GSSIfaceConstSize__Group__2__Impl rule__GSSIfaceConstSize__Group__3 ;
    public final void rule__GSSIfaceConstSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3439:1: ( rule__GSSIfaceConstSize__Group__2__Impl rule__GSSIfaceConstSize__Group__3 )
            // InternalIFACE.g:3440:2: rule__GSSIfaceConstSize__Group__2__Impl rule__GSSIfaceConstSize__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfaceConstSize__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group__2"


    // $ANTLR start "rule__GSSIfaceConstSize__Group__2__Impl"
    // InternalIFACE.g:3447:1: rule__GSSIfaceConstSize__Group__2__Impl : ( 'bytes' ) ;
    public final void rule__GSSIfaceConstSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3451:1: ( ( 'bytes' ) )
            // InternalIFACE.g:3452:1: ( 'bytes' )
            {
            // InternalIFACE.g:3452:1: ( 'bytes' )
            // InternalIFACE.g:3453:2: 'bytes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getBytesKeyword_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getBytesKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group__2__Impl"


    // $ANTLR start "rule__GSSIfaceConstSize__Group__3"
    // InternalIFACE.g:3462:1: rule__GSSIfaceConstSize__Group__3 : rule__GSSIfaceConstSize__Group__3__Impl rule__GSSIfaceConstSize__Group__4 ;
    public final void rule__GSSIfaceConstSize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3466:1: ( rule__GSSIfaceConstSize__Group__3__Impl rule__GSSIfaceConstSize__Group__4 )
            // InternalIFACE.g:3467:2: rule__GSSIfaceConstSize__Group__3__Impl rule__GSSIfaceConstSize__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSIfaceConstSize__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group__3"


    // $ANTLR start "rule__GSSIfaceConstSize__Group__3__Impl"
    // InternalIFACE.g:3474:1: rule__GSSIfaceConstSize__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceConstSize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3478:1: ( ( ':=' ) )
            // InternalIFACE.g:3479:1: ( ':=' )
            {
            // InternalIFACE.g:3479:1: ( ':=' )
            // InternalIFACE.g:3480:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group__3__Impl"


    // $ANTLR start "rule__GSSIfaceConstSize__Group__4"
    // InternalIFACE.g:3489:1: rule__GSSIfaceConstSize__Group__4 : rule__GSSIfaceConstSize__Group__4__Impl rule__GSSIfaceConstSize__Group__5 ;
    public final void rule__GSSIfaceConstSize__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3493:1: ( rule__GSSIfaceConstSize__Group__4__Impl rule__GSSIfaceConstSize__Group__5 )
            // InternalIFACE.g:3494:2: rule__GSSIfaceConstSize__Group__4__Impl rule__GSSIfaceConstSize__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceConstSize__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group__4"


    // $ANTLR start "rule__GSSIfaceConstSize__Group__4__Impl"
    // InternalIFACE.g:3501:1: rule__GSSIfaceConstSize__Group__4__Impl : ( ( rule__GSSIfaceConstSize__BytesAssignment_4 ) ) ;
    public final void rule__GSSIfaceConstSize__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3505:1: ( ( ( rule__GSSIfaceConstSize__BytesAssignment_4 ) ) )
            // InternalIFACE.g:3506:1: ( ( rule__GSSIfaceConstSize__BytesAssignment_4 ) )
            {
            // InternalIFACE.g:3506:1: ( ( rule__GSSIfaceConstSize__BytesAssignment_4 ) )
            // InternalIFACE.g:3507:2: ( rule__GSSIfaceConstSize__BytesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getBytesAssignment_4()); 
            }
            // InternalIFACE.g:3508:2: ( rule__GSSIfaceConstSize__BytesAssignment_4 )
            // InternalIFACE.g:3508:3: rule__GSSIfaceConstSize__BytesAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__BytesAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getBytesAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group__4__Impl"


    // $ANTLR start "rule__GSSIfaceConstSize__Group__5"
    // InternalIFACE.g:3516:1: rule__GSSIfaceConstSize__Group__5 : rule__GSSIfaceConstSize__Group__5__Impl rule__GSSIfaceConstSize__Group__6 ;
    public final void rule__GSSIfaceConstSize__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3520:1: ( rule__GSSIfaceConstSize__Group__5__Impl rule__GSSIfaceConstSize__Group__6 )
            // InternalIFACE.g:3521:2: rule__GSSIfaceConstSize__Group__5__Impl rule__GSSIfaceConstSize__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_43);
            rule__GSSIfaceConstSize__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group__5"


    // $ANTLR start "rule__GSSIfaceConstSize__Group__5__Impl"
    // InternalIFACE.g:3528:1: rule__GSSIfaceConstSize__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceConstSize__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3532:1: ( ( ';' ) )
            // InternalIFACE.g:3533:1: ( ';' )
            {
            // InternalIFACE.g:3533:1: ( ';' )
            // InternalIFACE.g:3534:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_5()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group__5__Impl"


    // $ANTLR start "rule__GSSIfaceConstSize__Group__6"
    // InternalIFACE.g:3543:1: rule__GSSIfaceConstSize__Group__6 : rule__GSSIfaceConstSize__Group__6__Impl rule__GSSIfaceConstSize__Group__7 ;
    public final void rule__GSSIfaceConstSize__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3547:1: ( rule__GSSIfaceConstSize__Group__6__Impl rule__GSSIfaceConstSize__Group__7 )
            // InternalIFACE.g:3548:2: rule__GSSIfaceConstSize__Group__6__Impl rule__GSSIfaceConstSize__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfaceConstSize__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group__6"


    // $ANTLR start "rule__GSSIfaceConstSize__Group__6__Impl"
    // InternalIFACE.g:3555:1: rule__GSSIfaceConstSize__Group__6__Impl : ( 'bits' ) ;
    public final void rule__GSSIfaceConstSize__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3559:1: ( ( 'bits' ) )
            // InternalIFACE.g:3560:1: ( 'bits' )
            {
            // InternalIFACE.g:3560:1: ( 'bits' )
            // InternalIFACE.g:3561:2: 'bits'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getBitsKeyword_6()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getBitsKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group__6__Impl"


    // $ANTLR start "rule__GSSIfaceConstSize__Group__7"
    // InternalIFACE.g:3570:1: rule__GSSIfaceConstSize__Group__7 : rule__GSSIfaceConstSize__Group__7__Impl rule__GSSIfaceConstSize__Group__8 ;
    public final void rule__GSSIfaceConstSize__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3574:1: ( rule__GSSIfaceConstSize__Group__7__Impl rule__GSSIfaceConstSize__Group__8 )
            // InternalIFACE.g:3575:2: rule__GSSIfaceConstSize__Group__7__Impl rule__GSSIfaceConstSize__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSIfaceConstSize__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group__7"


    // $ANTLR start "rule__GSSIfaceConstSize__Group__7__Impl"
    // InternalIFACE.g:3582:1: rule__GSSIfaceConstSize__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceConstSize__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3586:1: ( ( ':=' ) )
            // InternalIFACE.g:3587:1: ( ':=' )
            {
            // InternalIFACE.g:3587:1: ( ':=' )
            // InternalIFACE.g:3588:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group__7__Impl"


    // $ANTLR start "rule__GSSIfaceConstSize__Group__8"
    // InternalIFACE.g:3597:1: rule__GSSIfaceConstSize__Group__8 : rule__GSSIfaceConstSize__Group__8__Impl rule__GSSIfaceConstSize__Group__9 ;
    public final void rule__GSSIfaceConstSize__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3601:1: ( rule__GSSIfaceConstSize__Group__8__Impl rule__GSSIfaceConstSize__Group__9 )
            // InternalIFACE.g:3602:2: rule__GSSIfaceConstSize__Group__8__Impl rule__GSSIfaceConstSize__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceConstSize__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group__8"


    // $ANTLR start "rule__GSSIfaceConstSize__Group__8__Impl"
    // InternalIFACE.g:3609:1: rule__GSSIfaceConstSize__Group__8__Impl : ( ( rule__GSSIfaceConstSize__BitsAssignment_8 ) ) ;
    public final void rule__GSSIfaceConstSize__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3613:1: ( ( ( rule__GSSIfaceConstSize__BitsAssignment_8 ) ) )
            // InternalIFACE.g:3614:1: ( ( rule__GSSIfaceConstSize__BitsAssignment_8 ) )
            {
            // InternalIFACE.g:3614:1: ( ( rule__GSSIfaceConstSize__BitsAssignment_8 ) )
            // InternalIFACE.g:3615:2: ( rule__GSSIfaceConstSize__BitsAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getBitsAssignment_8()); 
            }
            // InternalIFACE.g:3616:2: ( rule__GSSIfaceConstSize__BitsAssignment_8 )
            // InternalIFACE.g:3616:3: rule__GSSIfaceConstSize__BitsAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__BitsAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getBitsAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group__8__Impl"


    // $ANTLR start "rule__GSSIfaceConstSize__Group__9"
    // InternalIFACE.g:3624:1: rule__GSSIfaceConstSize__Group__9 : rule__GSSIfaceConstSize__Group__9__Impl rule__GSSIfaceConstSize__Group__10 ;
    public final void rule__GSSIfaceConstSize__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3628:1: ( rule__GSSIfaceConstSize__Group__9__Impl rule__GSSIfaceConstSize__Group__10 )
            // InternalIFACE.g:3629:2: rule__GSSIfaceConstSize__Group__9__Impl rule__GSSIfaceConstSize__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceConstSize__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group__9"


    // $ANTLR start "rule__GSSIfaceConstSize__Group__9__Impl"
    // InternalIFACE.g:3636:1: rule__GSSIfaceConstSize__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSIfaceConstSize__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3640:1: ( ( ';' ) )
            // InternalIFACE.g:3641:1: ( ';' )
            {
            // InternalIFACE.g:3641:1: ( ';' )
            // InternalIFACE.g:3642:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_9()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group__9__Impl"


    // $ANTLR start "rule__GSSIfaceConstSize__Group__10"
    // InternalIFACE.g:3651:1: rule__GSSIfaceConstSize__Group__10 : rule__GSSIfaceConstSize__Group__10__Impl rule__GSSIfaceConstSize__Group__11 ;
    public final void rule__GSSIfaceConstSize__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3655:1: ( rule__GSSIfaceConstSize__Group__10__Impl rule__GSSIfaceConstSize__Group__11 )
            // InternalIFACE.g:3656:2: rule__GSSIfaceConstSize__Group__10__Impl rule__GSSIfaceConstSize__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceConstSize__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group__10"


    // $ANTLR start "rule__GSSIfaceConstSize__Group__10__Impl"
    // InternalIFACE.g:3663:1: rule__GSSIfaceConstSize__Group__10__Impl : ( '}' ) ;
    public final void rule__GSSIfaceConstSize__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3667:1: ( ( '}' ) )
            // InternalIFACE.g:3668:1: ( '}' )
            {
            // InternalIFACE.g:3668:1: ( '}' )
            // InternalIFACE.g:3669:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getRightCurlyBracketKeyword_10()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getRightCurlyBracketKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group__10__Impl"


    // $ANTLR start "rule__GSSIfaceConstSize__Group__11"
    // InternalIFACE.g:3678:1: rule__GSSIfaceConstSize__Group__11 : rule__GSSIfaceConstSize__Group__11__Impl ;
    public final void rule__GSSIfaceConstSize__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3682:1: ( rule__GSSIfaceConstSize__Group__11__Impl )
            // InternalIFACE.g:3683:2: rule__GSSIfaceConstSize__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group__11"


    // $ANTLR start "rule__GSSIfaceConstSize__Group__11__Impl"
    // InternalIFACE.g:3689:1: rule__GSSIfaceConstSize__Group__11__Impl : ( ';' ) ;
    public final void rule__GSSIfaceConstSize__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3693:1: ( ( ';' ) )
            // InternalIFACE.g:3694:1: ( ';' )
            {
            // InternalIFACE.g:3694:1: ( ';' )
            // InternalIFACE.g:3695:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_11()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group__11__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group__0"
    // InternalIFACE.g:3705:1: rule__GSSIfaceSizeFieldOffset__Group__0 : rule__GSSIfaceSizeFieldOffset__Group__0__Impl rule__GSSIfaceSizeFieldOffset__Group__1 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3709:1: ( rule__GSSIfaceSizeFieldOffset__Group__0__Impl rule__GSSIfaceSizeFieldOffset__Group__1 )
            // InternalIFACE.g:3710:2: rule__GSSIfaceSizeFieldOffset__Group__0__Impl rule__GSSIfaceSizeFieldOffset__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSIfaceSizeFieldOffset__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group__0"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group__0__Impl"
    // InternalIFACE.g:3717:1: rule__GSSIfaceSizeFieldOffset__Group__0__Impl : ( 'sizeFieldOffset' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3721:1: ( ( 'sizeFieldOffset' ) )
            // InternalIFACE.g:3722:1: ( 'sizeFieldOffset' )
            {
            // InternalIFACE.g:3722:1: ( 'sizeFieldOffset' )
            // InternalIFACE.g:3723:2: 'sizeFieldOffset'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSizeFieldOffsetKeyword_0()); 
            }
            match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSizeFieldOffsetKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group__0__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group__1"
    // InternalIFACE.g:3732:1: rule__GSSIfaceSizeFieldOffset__Group__1 : rule__GSSIfaceSizeFieldOffset__Group__1__Impl rule__GSSIfaceSizeFieldOffset__Group__2 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3736:1: ( rule__GSSIfaceSizeFieldOffset__Group__1__Impl rule__GSSIfaceSizeFieldOffset__Group__2 )
            // InternalIFACE.g:3737:2: rule__GSSIfaceSizeFieldOffset__Group__1__Impl rule__GSSIfaceSizeFieldOffset__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__GSSIfaceSizeFieldOffset__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group__1"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group__1__Impl"
    // InternalIFACE.g:3744:1: rule__GSSIfaceSizeFieldOffset__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3748:1: ( ( '{' ) )
            // InternalIFACE.g:3749:1: ( '{' )
            {
            // InternalIFACE.g:3749:1: ( '{' )
            // InternalIFACE.g:3750:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group__1__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group__2"
    // InternalIFACE.g:3759:1: rule__GSSIfaceSizeFieldOffset__Group__2 : rule__GSSIfaceSizeFieldOffset__Group__2__Impl rule__GSSIfaceSizeFieldOffset__Group__3 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3763:1: ( rule__GSSIfaceSizeFieldOffset__Group__2__Impl rule__GSSIfaceSizeFieldOffset__Group__3 )
            // InternalIFACE.g:3764:2: rule__GSSIfaceSizeFieldOffset__Group__2__Impl rule__GSSIfaceSizeFieldOffset__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfaceSizeFieldOffset__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group__2"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group__2__Impl"
    // InternalIFACE.g:3771:1: rule__GSSIfaceSizeFieldOffset__Group__2__Impl : ( 'bytes' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3775:1: ( ( 'bytes' ) )
            // InternalIFACE.g:3776:1: ( 'bytes' )
            {
            // InternalIFACE.g:3776:1: ( 'bytes' )
            // InternalIFACE.g:3777:2: 'bytes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesKeyword_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group__2__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group__3"
    // InternalIFACE.g:3786:1: rule__GSSIfaceSizeFieldOffset__Group__3 : rule__GSSIfaceSizeFieldOffset__Group__3__Impl rule__GSSIfaceSizeFieldOffset__Group__4 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3790:1: ( rule__GSSIfaceSizeFieldOffset__Group__3__Impl rule__GSSIfaceSizeFieldOffset__Group__4 )
            // InternalIFACE.g:3791:2: rule__GSSIfaceSizeFieldOffset__Group__3__Impl rule__GSSIfaceSizeFieldOffset__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSIfaceSizeFieldOffset__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group__3"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group__3__Impl"
    // InternalIFACE.g:3798:1: rule__GSSIfaceSizeFieldOffset__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3802:1: ( ( ':=' ) )
            // InternalIFACE.g:3803:1: ( ':=' )
            {
            // InternalIFACE.g:3803:1: ( ':=' )
            // InternalIFACE.g:3804:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group__3__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group__4"
    // InternalIFACE.g:3813:1: rule__GSSIfaceSizeFieldOffset__Group__4 : rule__GSSIfaceSizeFieldOffset__Group__4__Impl rule__GSSIfaceSizeFieldOffset__Group__5 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3817:1: ( rule__GSSIfaceSizeFieldOffset__Group__4__Impl rule__GSSIfaceSizeFieldOffset__Group__5 )
            // InternalIFACE.g:3818:2: rule__GSSIfaceSizeFieldOffset__Group__4__Impl rule__GSSIfaceSizeFieldOffset__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSizeFieldOffset__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group__4"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group__4__Impl"
    // InternalIFACE.g:3825:1: rule__GSSIfaceSizeFieldOffset__Group__4__Impl : ( ( rule__GSSIfaceSizeFieldOffset__BytesAssignment_4 ) ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3829:1: ( ( ( rule__GSSIfaceSizeFieldOffset__BytesAssignment_4 ) ) )
            // InternalIFACE.g:3830:1: ( ( rule__GSSIfaceSizeFieldOffset__BytesAssignment_4 ) )
            {
            // InternalIFACE.g:3830:1: ( ( rule__GSSIfaceSizeFieldOffset__BytesAssignment_4 ) )
            // InternalIFACE.g:3831:2: ( rule__GSSIfaceSizeFieldOffset__BytesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesAssignment_4()); 
            }
            // InternalIFACE.g:3832:2: ( rule__GSSIfaceSizeFieldOffset__BytesAssignment_4 )
            // InternalIFACE.g:3832:3: rule__GSSIfaceSizeFieldOffset__BytesAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__BytesAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group__4__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group__5"
    // InternalIFACE.g:3840:1: rule__GSSIfaceSizeFieldOffset__Group__5 : rule__GSSIfaceSizeFieldOffset__Group__5__Impl rule__GSSIfaceSizeFieldOffset__Group__6 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3844:1: ( rule__GSSIfaceSizeFieldOffset__Group__5__Impl rule__GSSIfaceSizeFieldOffset__Group__6 )
            // InternalIFACE.g:3845:2: rule__GSSIfaceSizeFieldOffset__Group__5__Impl rule__GSSIfaceSizeFieldOffset__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_43);
            rule__GSSIfaceSizeFieldOffset__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group__5"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group__5__Impl"
    // InternalIFACE.g:3852:1: rule__GSSIfaceSizeFieldOffset__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3856:1: ( ( ';' ) )
            // InternalIFACE.g:3857:1: ( ';' )
            {
            // InternalIFACE.g:3857:1: ( ';' )
            // InternalIFACE.g:3858:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_5()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group__5__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group__6"
    // InternalIFACE.g:3867:1: rule__GSSIfaceSizeFieldOffset__Group__6 : rule__GSSIfaceSizeFieldOffset__Group__6__Impl rule__GSSIfaceSizeFieldOffset__Group__7 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3871:1: ( rule__GSSIfaceSizeFieldOffset__Group__6__Impl rule__GSSIfaceSizeFieldOffset__Group__7 )
            // InternalIFACE.g:3872:2: rule__GSSIfaceSizeFieldOffset__Group__6__Impl rule__GSSIfaceSizeFieldOffset__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfaceSizeFieldOffset__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group__6"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group__6__Impl"
    // InternalIFACE.g:3879:1: rule__GSSIfaceSizeFieldOffset__Group__6__Impl : ( 'bits' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3883:1: ( ( 'bits' ) )
            // InternalIFACE.g:3884:1: ( 'bits' )
            {
            // InternalIFACE.g:3884:1: ( 'bits' )
            // InternalIFACE.g:3885:2: 'bits'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsKeyword_6()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group__6__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group__7"
    // InternalIFACE.g:3894:1: rule__GSSIfaceSizeFieldOffset__Group__7 : rule__GSSIfaceSizeFieldOffset__Group__7__Impl rule__GSSIfaceSizeFieldOffset__Group__8 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3898:1: ( rule__GSSIfaceSizeFieldOffset__Group__7__Impl rule__GSSIfaceSizeFieldOffset__Group__8 )
            // InternalIFACE.g:3899:2: rule__GSSIfaceSizeFieldOffset__Group__7__Impl rule__GSSIfaceSizeFieldOffset__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSIfaceSizeFieldOffset__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group__7"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group__7__Impl"
    // InternalIFACE.g:3906:1: rule__GSSIfaceSizeFieldOffset__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3910:1: ( ( ':=' ) )
            // InternalIFACE.g:3911:1: ( ':=' )
            {
            // InternalIFACE.g:3911:1: ( ':=' )
            // InternalIFACE.g:3912:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group__7__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group__8"
    // InternalIFACE.g:3921:1: rule__GSSIfaceSizeFieldOffset__Group__8 : rule__GSSIfaceSizeFieldOffset__Group__8__Impl rule__GSSIfaceSizeFieldOffset__Group__9 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3925:1: ( rule__GSSIfaceSizeFieldOffset__Group__8__Impl rule__GSSIfaceSizeFieldOffset__Group__9 )
            // InternalIFACE.g:3926:2: rule__GSSIfaceSizeFieldOffset__Group__8__Impl rule__GSSIfaceSizeFieldOffset__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSizeFieldOffset__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group__8"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group__8__Impl"
    // InternalIFACE.g:3933:1: rule__GSSIfaceSizeFieldOffset__Group__8__Impl : ( ( rule__GSSIfaceSizeFieldOffset__BitsAssignment_8 ) ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3937:1: ( ( ( rule__GSSIfaceSizeFieldOffset__BitsAssignment_8 ) ) )
            // InternalIFACE.g:3938:1: ( ( rule__GSSIfaceSizeFieldOffset__BitsAssignment_8 ) )
            {
            // InternalIFACE.g:3938:1: ( ( rule__GSSIfaceSizeFieldOffset__BitsAssignment_8 ) )
            // InternalIFACE.g:3939:2: ( rule__GSSIfaceSizeFieldOffset__BitsAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsAssignment_8()); 
            }
            // InternalIFACE.g:3940:2: ( rule__GSSIfaceSizeFieldOffset__BitsAssignment_8 )
            // InternalIFACE.g:3940:3: rule__GSSIfaceSizeFieldOffset__BitsAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__BitsAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group__8__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group__9"
    // InternalIFACE.g:3948:1: rule__GSSIfaceSizeFieldOffset__Group__9 : rule__GSSIfaceSizeFieldOffset__Group__9__Impl rule__GSSIfaceSizeFieldOffset__Group__10 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3952:1: ( rule__GSSIfaceSizeFieldOffset__Group__9__Impl rule__GSSIfaceSizeFieldOffset__Group__10 )
            // InternalIFACE.g:3953:2: rule__GSSIfaceSizeFieldOffset__Group__9__Impl rule__GSSIfaceSizeFieldOffset__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceSizeFieldOffset__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group__9"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group__9__Impl"
    // InternalIFACE.g:3960:1: rule__GSSIfaceSizeFieldOffset__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3964:1: ( ( ';' ) )
            // InternalIFACE.g:3965:1: ( ';' )
            {
            // InternalIFACE.g:3965:1: ( ';' )
            // InternalIFACE.g:3966:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_9()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group__9__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group__10"
    // InternalIFACE.g:3975:1: rule__GSSIfaceSizeFieldOffset__Group__10 : rule__GSSIfaceSizeFieldOffset__Group__10__Impl rule__GSSIfaceSizeFieldOffset__Group__11 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3979:1: ( rule__GSSIfaceSizeFieldOffset__Group__10__Impl rule__GSSIfaceSizeFieldOffset__Group__11 )
            // InternalIFACE.g:3980:2: rule__GSSIfaceSizeFieldOffset__Group__10__Impl rule__GSSIfaceSizeFieldOffset__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSizeFieldOffset__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group__10"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group__10__Impl"
    // InternalIFACE.g:3987:1: rule__GSSIfaceSizeFieldOffset__Group__10__Impl : ( '}' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3991:1: ( ( '}' ) )
            // InternalIFACE.g:3992:1: ( '}' )
            {
            // InternalIFACE.g:3992:1: ( '}' )
            // InternalIFACE.g:3993:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getRightCurlyBracketKeyword_10()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getRightCurlyBracketKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group__10__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group__11"
    // InternalIFACE.g:4002:1: rule__GSSIfaceSizeFieldOffset__Group__11 : rule__GSSIfaceSizeFieldOffset__Group__11__Impl ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4006:1: ( rule__GSSIfaceSizeFieldOffset__Group__11__Impl )
            // InternalIFACE.g:4007:2: rule__GSSIfaceSizeFieldOffset__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group__11"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group__11__Impl"
    // InternalIFACE.g:4013:1: rule__GSSIfaceSizeFieldOffset__Group__11__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4017:1: ( ( ';' ) )
            // InternalIFACE.g:4018:1: ( ';' )
            {
            // InternalIFACE.g:4018:1: ( ';' )
            // InternalIFACE.g:4019:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_11()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group__11__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group__0"
    // InternalIFACE.g:4029:1: rule__GSSIfaceSizeFieldTrim__Group__0 : rule__GSSIfaceSizeFieldTrim__Group__0__Impl rule__GSSIfaceSizeFieldTrim__Group__1 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4033:1: ( rule__GSSIfaceSizeFieldTrim__Group__0__Impl rule__GSSIfaceSizeFieldTrim__Group__1 )
            // InternalIFACE.g:4034:2: rule__GSSIfaceSizeFieldTrim__Group__0__Impl rule__GSSIfaceSizeFieldTrim__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSIfaceSizeFieldTrim__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group__0"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group__0__Impl"
    // InternalIFACE.g:4041:1: rule__GSSIfaceSizeFieldTrim__Group__0__Impl : ( 'sizeFieldTrim' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4045:1: ( ( 'sizeFieldTrim' ) )
            // InternalIFACE.g:4046:1: ( 'sizeFieldTrim' )
            {
            // InternalIFACE.g:4046:1: ( 'sizeFieldTrim' )
            // InternalIFACE.g:4047:2: 'sizeFieldTrim'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSizeFieldTrimKeyword_0()); 
            }
            match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSizeFieldTrimKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group__0__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group__1"
    // InternalIFACE.g:4056:1: rule__GSSIfaceSizeFieldTrim__Group__1 : rule__GSSIfaceSizeFieldTrim__Group__1__Impl rule__GSSIfaceSizeFieldTrim__Group__2 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4060:1: ( rule__GSSIfaceSizeFieldTrim__Group__1__Impl rule__GSSIfaceSizeFieldTrim__Group__2 )
            // InternalIFACE.g:4061:2: rule__GSSIfaceSizeFieldTrim__Group__1__Impl rule__GSSIfaceSizeFieldTrim__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__GSSIfaceSizeFieldTrim__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group__1"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group__1__Impl"
    // InternalIFACE.g:4068:1: rule__GSSIfaceSizeFieldTrim__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4072:1: ( ( '{' ) )
            // InternalIFACE.g:4073:1: ( '{' )
            {
            // InternalIFACE.g:4073:1: ( '{' )
            // InternalIFACE.g:4074:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group__1__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group__2"
    // InternalIFACE.g:4083:1: rule__GSSIfaceSizeFieldTrim__Group__2 : rule__GSSIfaceSizeFieldTrim__Group__2__Impl rule__GSSIfaceSizeFieldTrim__Group__3 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4087:1: ( rule__GSSIfaceSizeFieldTrim__Group__2__Impl rule__GSSIfaceSizeFieldTrim__Group__3 )
            // InternalIFACE.g:4088:2: rule__GSSIfaceSizeFieldTrim__Group__2__Impl rule__GSSIfaceSizeFieldTrim__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfaceSizeFieldTrim__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group__2"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group__2__Impl"
    // InternalIFACE.g:4095:1: rule__GSSIfaceSizeFieldTrim__Group__2__Impl : ( 'bytes' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4099:1: ( ( 'bytes' ) )
            // InternalIFACE.g:4100:1: ( 'bytes' )
            {
            // InternalIFACE.g:4100:1: ( 'bytes' )
            // InternalIFACE.g:4101:2: 'bytes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesKeyword_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group__2__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group__3"
    // InternalIFACE.g:4110:1: rule__GSSIfaceSizeFieldTrim__Group__3 : rule__GSSIfaceSizeFieldTrim__Group__3__Impl rule__GSSIfaceSizeFieldTrim__Group__4 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4114:1: ( rule__GSSIfaceSizeFieldTrim__Group__3__Impl rule__GSSIfaceSizeFieldTrim__Group__4 )
            // InternalIFACE.g:4115:2: rule__GSSIfaceSizeFieldTrim__Group__3__Impl rule__GSSIfaceSizeFieldTrim__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSIfaceSizeFieldTrim__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group__3"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group__3__Impl"
    // InternalIFACE.g:4122:1: rule__GSSIfaceSizeFieldTrim__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4126:1: ( ( ':=' ) )
            // InternalIFACE.g:4127:1: ( ':=' )
            {
            // InternalIFACE.g:4127:1: ( ':=' )
            // InternalIFACE.g:4128:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group__3__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group__4"
    // InternalIFACE.g:4137:1: rule__GSSIfaceSizeFieldTrim__Group__4 : rule__GSSIfaceSizeFieldTrim__Group__4__Impl rule__GSSIfaceSizeFieldTrim__Group__5 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4141:1: ( rule__GSSIfaceSizeFieldTrim__Group__4__Impl rule__GSSIfaceSizeFieldTrim__Group__5 )
            // InternalIFACE.g:4142:2: rule__GSSIfaceSizeFieldTrim__Group__4__Impl rule__GSSIfaceSizeFieldTrim__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSizeFieldTrim__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group__4"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group__4__Impl"
    // InternalIFACE.g:4149:1: rule__GSSIfaceSizeFieldTrim__Group__4__Impl : ( ( rule__GSSIfaceSizeFieldTrim__BytesAssignment_4 ) ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4153:1: ( ( ( rule__GSSIfaceSizeFieldTrim__BytesAssignment_4 ) ) )
            // InternalIFACE.g:4154:1: ( ( rule__GSSIfaceSizeFieldTrim__BytesAssignment_4 ) )
            {
            // InternalIFACE.g:4154:1: ( ( rule__GSSIfaceSizeFieldTrim__BytesAssignment_4 ) )
            // InternalIFACE.g:4155:2: ( rule__GSSIfaceSizeFieldTrim__BytesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesAssignment_4()); 
            }
            // InternalIFACE.g:4156:2: ( rule__GSSIfaceSizeFieldTrim__BytesAssignment_4 )
            // InternalIFACE.g:4156:3: rule__GSSIfaceSizeFieldTrim__BytesAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__BytesAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group__4__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group__5"
    // InternalIFACE.g:4164:1: rule__GSSIfaceSizeFieldTrim__Group__5 : rule__GSSIfaceSizeFieldTrim__Group__5__Impl rule__GSSIfaceSizeFieldTrim__Group__6 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4168:1: ( rule__GSSIfaceSizeFieldTrim__Group__5__Impl rule__GSSIfaceSizeFieldTrim__Group__6 )
            // InternalIFACE.g:4169:2: rule__GSSIfaceSizeFieldTrim__Group__5__Impl rule__GSSIfaceSizeFieldTrim__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_43);
            rule__GSSIfaceSizeFieldTrim__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group__5"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group__5__Impl"
    // InternalIFACE.g:4176:1: rule__GSSIfaceSizeFieldTrim__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4180:1: ( ( ';' ) )
            // InternalIFACE.g:4181:1: ( ';' )
            {
            // InternalIFACE.g:4181:1: ( ';' )
            // InternalIFACE.g:4182:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_5()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group__5__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group__6"
    // InternalIFACE.g:4191:1: rule__GSSIfaceSizeFieldTrim__Group__6 : rule__GSSIfaceSizeFieldTrim__Group__6__Impl rule__GSSIfaceSizeFieldTrim__Group__7 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4195:1: ( rule__GSSIfaceSizeFieldTrim__Group__6__Impl rule__GSSIfaceSizeFieldTrim__Group__7 )
            // InternalIFACE.g:4196:2: rule__GSSIfaceSizeFieldTrim__Group__6__Impl rule__GSSIfaceSizeFieldTrim__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfaceSizeFieldTrim__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group__6"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group__6__Impl"
    // InternalIFACE.g:4203:1: rule__GSSIfaceSizeFieldTrim__Group__6__Impl : ( 'bits' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4207:1: ( ( 'bits' ) )
            // InternalIFACE.g:4208:1: ( 'bits' )
            {
            // InternalIFACE.g:4208:1: ( 'bits' )
            // InternalIFACE.g:4209:2: 'bits'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsKeyword_6()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group__6__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group__7"
    // InternalIFACE.g:4218:1: rule__GSSIfaceSizeFieldTrim__Group__7 : rule__GSSIfaceSizeFieldTrim__Group__7__Impl rule__GSSIfaceSizeFieldTrim__Group__8 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4222:1: ( rule__GSSIfaceSizeFieldTrim__Group__7__Impl rule__GSSIfaceSizeFieldTrim__Group__8 )
            // InternalIFACE.g:4223:2: rule__GSSIfaceSizeFieldTrim__Group__7__Impl rule__GSSIfaceSizeFieldTrim__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSIfaceSizeFieldTrim__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group__7"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group__7__Impl"
    // InternalIFACE.g:4230:1: rule__GSSIfaceSizeFieldTrim__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4234:1: ( ( ':=' ) )
            // InternalIFACE.g:4235:1: ( ':=' )
            {
            // InternalIFACE.g:4235:1: ( ':=' )
            // InternalIFACE.g:4236:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group__7__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group__8"
    // InternalIFACE.g:4245:1: rule__GSSIfaceSizeFieldTrim__Group__8 : rule__GSSIfaceSizeFieldTrim__Group__8__Impl rule__GSSIfaceSizeFieldTrim__Group__9 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4249:1: ( rule__GSSIfaceSizeFieldTrim__Group__8__Impl rule__GSSIfaceSizeFieldTrim__Group__9 )
            // InternalIFACE.g:4250:2: rule__GSSIfaceSizeFieldTrim__Group__8__Impl rule__GSSIfaceSizeFieldTrim__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSizeFieldTrim__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group__8"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group__8__Impl"
    // InternalIFACE.g:4257:1: rule__GSSIfaceSizeFieldTrim__Group__8__Impl : ( ( rule__GSSIfaceSizeFieldTrim__BitsAssignment_8 ) ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4261:1: ( ( ( rule__GSSIfaceSizeFieldTrim__BitsAssignment_8 ) ) )
            // InternalIFACE.g:4262:1: ( ( rule__GSSIfaceSizeFieldTrim__BitsAssignment_8 ) )
            {
            // InternalIFACE.g:4262:1: ( ( rule__GSSIfaceSizeFieldTrim__BitsAssignment_8 ) )
            // InternalIFACE.g:4263:2: ( rule__GSSIfaceSizeFieldTrim__BitsAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsAssignment_8()); 
            }
            // InternalIFACE.g:4264:2: ( rule__GSSIfaceSizeFieldTrim__BitsAssignment_8 )
            // InternalIFACE.g:4264:3: rule__GSSIfaceSizeFieldTrim__BitsAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__BitsAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group__8__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group__9"
    // InternalIFACE.g:4272:1: rule__GSSIfaceSizeFieldTrim__Group__9 : rule__GSSIfaceSizeFieldTrim__Group__9__Impl rule__GSSIfaceSizeFieldTrim__Group__10 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4276:1: ( rule__GSSIfaceSizeFieldTrim__Group__9__Impl rule__GSSIfaceSizeFieldTrim__Group__10 )
            // InternalIFACE.g:4277:2: rule__GSSIfaceSizeFieldTrim__Group__9__Impl rule__GSSIfaceSizeFieldTrim__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceSizeFieldTrim__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group__9"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group__9__Impl"
    // InternalIFACE.g:4284:1: rule__GSSIfaceSizeFieldTrim__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4288:1: ( ( ';' ) )
            // InternalIFACE.g:4289:1: ( ';' )
            {
            // InternalIFACE.g:4289:1: ( ';' )
            // InternalIFACE.g:4290:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_9()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group__9__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group__10"
    // InternalIFACE.g:4299:1: rule__GSSIfaceSizeFieldTrim__Group__10 : rule__GSSIfaceSizeFieldTrim__Group__10__Impl rule__GSSIfaceSizeFieldTrim__Group__11 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4303:1: ( rule__GSSIfaceSizeFieldTrim__Group__10__Impl rule__GSSIfaceSizeFieldTrim__Group__11 )
            // InternalIFACE.g:4304:2: rule__GSSIfaceSizeFieldTrim__Group__10__Impl rule__GSSIfaceSizeFieldTrim__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSizeFieldTrim__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group__10"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group__10__Impl"
    // InternalIFACE.g:4311:1: rule__GSSIfaceSizeFieldTrim__Group__10__Impl : ( '}' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4315:1: ( ( '}' ) )
            // InternalIFACE.g:4316:1: ( '}' )
            {
            // InternalIFACE.g:4316:1: ( '}' )
            // InternalIFACE.g:4317:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getRightCurlyBracketKeyword_10()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getRightCurlyBracketKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group__10__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group__11"
    // InternalIFACE.g:4326:1: rule__GSSIfaceSizeFieldTrim__Group__11 : rule__GSSIfaceSizeFieldTrim__Group__11__Impl ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4330:1: ( rule__GSSIfaceSizeFieldTrim__Group__11__Impl )
            // InternalIFACE.g:4331:2: rule__GSSIfaceSizeFieldTrim__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group__11"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group__11__Impl"
    // InternalIFACE.g:4337:1: rule__GSSIfaceSizeFieldTrim__Group__11__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4341:1: ( ( ';' ) )
            // InternalIFACE.g:4342:1: ( ';' )
            {
            // InternalIFACE.g:4342:1: ( ';' )
            // InternalIFACE.g:4343:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_11()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group__11__Impl"


    // $ANTLR start "rule__GSSIfaceSyncPattern__Group__0"
    // InternalIFACE.g:4353:1: rule__GSSIfaceSyncPattern__Group__0 : rule__GSSIfaceSyncPattern__Group__0__Impl rule__GSSIfaceSyncPattern__Group__1 ;
    public final void rule__GSSIfaceSyncPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4357:1: ( rule__GSSIfaceSyncPattern__Group__0__Impl rule__GSSIfaceSyncPattern__Group__1 )
            // InternalIFACE.g:4358:2: rule__GSSIfaceSyncPattern__Group__0__Impl rule__GSSIfaceSyncPattern__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSIfaceSyncPattern__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSyncPattern__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSyncPattern__Group__0"


    // $ANTLR start "rule__GSSIfaceSyncPattern__Group__0__Impl"
    // InternalIFACE.g:4365:1: rule__GSSIfaceSyncPattern__Group__0__Impl : ( 'syncPattern' ) ;
    public final void rule__GSSIfaceSyncPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4369:1: ( ( 'syncPattern' ) )
            // InternalIFACE.g:4370:1: ( 'syncPattern' )
            {
            // InternalIFACE.g:4370:1: ( 'syncPattern' )
            // InternalIFACE.g:4371:2: 'syncPattern'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getSyncPatternKeyword_0()); 
            }
            match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSyncPatternAccess().getSyncPatternKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSyncPattern__Group__0__Impl"


    // $ANTLR start "rule__GSSIfaceSyncPattern__Group__1"
    // InternalIFACE.g:4380:1: rule__GSSIfaceSyncPattern__Group__1 : rule__GSSIfaceSyncPattern__Group__1__Impl rule__GSSIfaceSyncPattern__Group__2 ;
    public final void rule__GSSIfaceSyncPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4384:1: ( rule__GSSIfaceSyncPattern__Group__1__Impl rule__GSSIfaceSyncPattern__Group__2 )
            // InternalIFACE.g:4385:2: rule__GSSIfaceSyncPattern__Group__1__Impl rule__GSSIfaceSyncPattern__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_44);
            rule__GSSIfaceSyncPattern__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSyncPattern__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSyncPattern__Group__1"


    // $ANTLR start "rule__GSSIfaceSyncPattern__Group__1__Impl"
    // InternalIFACE.g:4392:1: rule__GSSIfaceSyncPattern__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceSyncPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4396:1: ( ( '{' ) )
            // InternalIFACE.g:4397:1: ( '{' )
            {
            // InternalIFACE.g:4397:1: ( '{' )
            // InternalIFACE.g:4398:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSyncPatternAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSyncPattern__Group__1__Impl"


    // $ANTLR start "rule__GSSIfaceSyncPattern__Group__2"
    // InternalIFACE.g:4407:1: rule__GSSIfaceSyncPattern__Group__2 : rule__GSSIfaceSyncPattern__Group__2__Impl rule__GSSIfaceSyncPattern__Group__3 ;
    public final void rule__GSSIfaceSyncPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4411:1: ( rule__GSSIfaceSyncPattern__Group__2__Impl rule__GSSIfaceSyncPattern__Group__3 )
            // InternalIFACE.g:4412:2: rule__GSSIfaceSyncPattern__Group__2__Impl rule__GSSIfaceSyncPattern__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfaceSyncPattern__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSyncPattern__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSyncPattern__Group__2"


    // $ANTLR start "rule__GSSIfaceSyncPattern__Group__2__Impl"
    // InternalIFACE.g:4419:1: rule__GSSIfaceSyncPattern__Group__2__Impl : ( 'hexValue' ) ;
    public final void rule__GSSIfaceSyncPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4423:1: ( ( 'hexValue' ) )
            // InternalIFACE.g:4424:1: ( 'hexValue' )
            {
            // InternalIFACE.g:4424:1: ( 'hexValue' )
            // InternalIFACE.g:4425:2: 'hexValue'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueKeyword_2()); 
            }
            match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSyncPattern__Group__2__Impl"


    // $ANTLR start "rule__GSSIfaceSyncPattern__Group__3"
    // InternalIFACE.g:4434:1: rule__GSSIfaceSyncPattern__Group__3 : rule__GSSIfaceSyncPattern__Group__3__Impl rule__GSSIfaceSyncPattern__Group__4 ;
    public final void rule__GSSIfaceSyncPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4438:1: ( rule__GSSIfaceSyncPattern__Group__3__Impl rule__GSSIfaceSyncPattern__Group__4 )
            // InternalIFACE.g:4439:2: rule__GSSIfaceSyncPattern__Group__3__Impl rule__GSSIfaceSyncPattern__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_45);
            rule__GSSIfaceSyncPattern__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSyncPattern__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSyncPattern__Group__3"


    // $ANTLR start "rule__GSSIfaceSyncPattern__Group__3__Impl"
    // InternalIFACE.g:4446:1: rule__GSSIfaceSyncPattern__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSyncPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4450:1: ( ( ':=' ) )
            // InternalIFACE.g:4451:1: ( ':=' )
            {
            // InternalIFACE.g:4451:1: ( ':=' )
            // InternalIFACE.g:4452:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSyncPatternAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSyncPattern__Group__3__Impl"


    // $ANTLR start "rule__GSSIfaceSyncPattern__Group__4"
    // InternalIFACE.g:4461:1: rule__GSSIfaceSyncPattern__Group__4 : rule__GSSIfaceSyncPattern__Group__4__Impl rule__GSSIfaceSyncPattern__Group__5 ;
    public final void rule__GSSIfaceSyncPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4465:1: ( rule__GSSIfaceSyncPattern__Group__4__Impl rule__GSSIfaceSyncPattern__Group__5 )
            // InternalIFACE.g:4466:2: rule__GSSIfaceSyncPattern__Group__4__Impl rule__GSSIfaceSyncPattern__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSyncPattern__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSyncPattern__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSyncPattern__Group__4"


    // $ANTLR start "rule__GSSIfaceSyncPattern__Group__4__Impl"
    // InternalIFACE.g:4473:1: rule__GSSIfaceSyncPattern__Group__4__Impl : ( ( rule__GSSIfaceSyncPattern__HexValueAssignment_4 ) ) ;
    public final void rule__GSSIfaceSyncPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4477:1: ( ( ( rule__GSSIfaceSyncPattern__HexValueAssignment_4 ) ) )
            // InternalIFACE.g:4478:1: ( ( rule__GSSIfaceSyncPattern__HexValueAssignment_4 ) )
            {
            // InternalIFACE.g:4478:1: ( ( rule__GSSIfaceSyncPattern__HexValueAssignment_4 ) )
            // InternalIFACE.g:4479:2: ( rule__GSSIfaceSyncPattern__HexValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueAssignment_4()); 
            }
            // InternalIFACE.g:4480:2: ( rule__GSSIfaceSyncPattern__HexValueAssignment_4 )
            // InternalIFACE.g:4480:3: rule__GSSIfaceSyncPattern__HexValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSyncPattern__HexValueAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSyncPattern__Group__4__Impl"


    // $ANTLR start "rule__GSSIfaceSyncPattern__Group__5"
    // InternalIFACE.g:4488:1: rule__GSSIfaceSyncPattern__Group__5 : rule__GSSIfaceSyncPattern__Group__5__Impl rule__GSSIfaceSyncPattern__Group__6 ;
    public final void rule__GSSIfaceSyncPattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4492:1: ( rule__GSSIfaceSyncPattern__Group__5__Impl rule__GSSIfaceSyncPattern__Group__6 )
            // InternalIFACE.g:4493:2: rule__GSSIfaceSyncPattern__Group__5__Impl rule__GSSIfaceSyncPattern__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceSyncPattern__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSyncPattern__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSyncPattern__Group__5"


    // $ANTLR start "rule__GSSIfaceSyncPattern__Group__5__Impl"
    // InternalIFACE.g:4500:1: rule__GSSIfaceSyncPattern__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSyncPattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4504:1: ( ( ';' ) )
            // InternalIFACE.g:4505:1: ( ';' )
            {
            // InternalIFACE.g:4505:1: ( ';' )
            // InternalIFACE.g:4506:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getSemicolonKeyword_5()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSyncPatternAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSyncPattern__Group__5__Impl"


    // $ANTLR start "rule__GSSIfaceSyncPattern__Group__6"
    // InternalIFACE.g:4515:1: rule__GSSIfaceSyncPattern__Group__6 : rule__GSSIfaceSyncPattern__Group__6__Impl rule__GSSIfaceSyncPattern__Group__7 ;
    public final void rule__GSSIfaceSyncPattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4519:1: ( rule__GSSIfaceSyncPattern__Group__6__Impl rule__GSSIfaceSyncPattern__Group__7 )
            // InternalIFACE.g:4520:2: rule__GSSIfaceSyncPattern__Group__6__Impl rule__GSSIfaceSyncPattern__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSyncPattern__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSyncPattern__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSyncPattern__Group__6"


    // $ANTLR start "rule__GSSIfaceSyncPattern__Group__6__Impl"
    // InternalIFACE.g:4527:1: rule__GSSIfaceSyncPattern__Group__6__Impl : ( '}' ) ;
    public final void rule__GSSIfaceSyncPattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4531:1: ( ( '}' ) )
            // InternalIFACE.g:4532:1: ( '}' )
            {
            // InternalIFACE.g:4532:1: ( '}' )
            // InternalIFACE.g:4533:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSyncPatternAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSyncPattern__Group__6__Impl"


    // $ANTLR start "rule__GSSIfaceSyncPattern__Group__7"
    // InternalIFACE.g:4542:1: rule__GSSIfaceSyncPattern__Group__7 : rule__GSSIfaceSyncPattern__Group__7__Impl ;
    public final void rule__GSSIfaceSyncPattern__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4546:1: ( rule__GSSIfaceSyncPattern__Group__7__Impl )
            // InternalIFACE.g:4547:2: rule__GSSIfaceSyncPattern__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSyncPattern__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSyncPattern__Group__7"


    // $ANTLR start "rule__GSSIfaceSyncPattern__Group__7__Impl"
    // InternalIFACE.g:4553:1: rule__GSSIfaceSyncPattern__Group__7__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSyncPattern__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4557:1: ( ( ';' ) )
            // InternalIFACE.g:4558:1: ( ';' )
            {
            // InternalIFACE.g:4558:1: ( ';' )
            // InternalIFACE.g:4559:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getSemicolonKeyword_7()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSyncPatternAccess().getSemicolonKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSyncPattern__Group__7__Impl"


    // $ANTLR start "rule__GSSIfaceSpWTCPort__Group__0"
    // InternalIFACE.g:4569:1: rule__GSSIfaceSpWTCPort__Group__0 : rule__GSSIfaceSpWTCPort__Group__0__Impl rule__GSSIfaceSpWTCPort__Group__1 ;
    public final void rule__GSSIfaceSpWTCPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4573:1: ( rule__GSSIfaceSpWTCPort__Group__0__Impl rule__GSSIfaceSpWTCPort__Group__1 )
            // InternalIFACE.g:4574:2: rule__GSSIfaceSpWTCPort__Group__0__Impl rule__GSSIfaceSpWTCPort__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSIfaceSpWTCPort__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWTCPort__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWTCPort__Group__0"


    // $ANTLR start "rule__GSSIfaceSpWTCPort__Group__0__Impl"
    // InternalIFACE.g:4581:1: rule__GSSIfaceSpWTCPort__Group__0__Impl : ( 'spwTCPort' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4585:1: ( ( 'spwTCPort' ) )
            // InternalIFACE.g:4586:1: ( 'spwTCPort' )
            {
            // InternalIFACE.g:4586:1: ( 'spwTCPort' )
            // InternalIFACE.g:4587:2: 'spwTCPort'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwTCPortKeyword_0()); 
            }
            match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwTCPortKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWTCPort__Group__0__Impl"


    // $ANTLR start "rule__GSSIfaceSpWTCPort__Group__1"
    // InternalIFACE.g:4596:1: rule__GSSIfaceSpWTCPort__Group__1 : rule__GSSIfaceSpWTCPort__Group__1__Impl rule__GSSIfaceSpWTCPort__Group__2 ;
    public final void rule__GSSIfaceSpWTCPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4600:1: ( rule__GSSIfaceSpWTCPort__Group__1__Impl rule__GSSIfaceSpWTCPort__Group__2 )
            // InternalIFACE.g:4601:2: rule__GSSIfaceSpWTCPort__Group__1__Impl rule__GSSIfaceSpWTCPort__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_46);
            rule__GSSIfaceSpWTCPort__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWTCPort__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWTCPort__Group__1"


    // $ANTLR start "rule__GSSIfaceSpWTCPort__Group__1__Impl"
    // InternalIFACE.g:4608:1: rule__GSSIfaceSpWTCPort__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4612:1: ( ( '{' ) )
            // InternalIFACE.g:4613:1: ( '{' )
            {
            // InternalIFACE.g:4613:1: ( '{' )
            // InternalIFACE.g:4614:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWTCPortAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWTCPort__Group__1__Impl"


    // $ANTLR start "rule__GSSIfaceSpWTCPort__Group__2"
    // InternalIFACE.g:4623:1: rule__GSSIfaceSpWTCPort__Group__2 : rule__GSSIfaceSpWTCPort__Group__2__Impl rule__GSSIfaceSpWTCPort__Group__3 ;
    public final void rule__GSSIfaceSpWTCPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4627:1: ( rule__GSSIfaceSpWTCPort__Group__2__Impl rule__GSSIfaceSpWTCPort__Group__3 )
            // InternalIFACE.g:4628:2: rule__GSSIfaceSpWTCPort__Group__2__Impl rule__GSSIfaceSpWTCPort__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfaceSpWTCPort__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWTCPort__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWTCPort__Group__2"


    // $ANTLR start "rule__GSSIfaceSpWTCPort__Group__2__Impl"
    // InternalIFACE.g:4635:1: rule__GSSIfaceSpWTCPort__Group__2__Impl : ( 'spwPortRef' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4639:1: ( ( 'spwPortRef' ) )
            // InternalIFACE.g:4640:1: ( 'spwPortRef' )
            {
            // InternalIFACE.g:4640:1: ( 'spwPortRef' )
            // InternalIFACE.g:4641:2: 'spwPortRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefKeyword_2()); 
            }
            match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWTCPort__Group__2__Impl"


    // $ANTLR start "rule__GSSIfaceSpWTCPort__Group__3"
    // InternalIFACE.g:4650:1: rule__GSSIfaceSpWTCPort__Group__3 : rule__GSSIfaceSpWTCPort__Group__3__Impl rule__GSSIfaceSpWTCPort__Group__4 ;
    public final void rule__GSSIfaceSpWTCPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4654:1: ( rule__GSSIfaceSpWTCPort__Group__3__Impl rule__GSSIfaceSpWTCPort__Group__4 )
            // InternalIFACE.g:4655:2: rule__GSSIfaceSpWTCPort__Group__3__Impl rule__GSSIfaceSpWTCPort__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSIfaceSpWTCPort__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWTCPort__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWTCPort__Group__3"


    // $ANTLR start "rule__GSSIfaceSpWTCPort__Group__3__Impl"
    // InternalIFACE.g:4662:1: rule__GSSIfaceSpWTCPort__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4666:1: ( ( ':=' ) )
            // InternalIFACE.g:4667:1: ( ':=' )
            {
            // InternalIFACE.g:4667:1: ( ':=' )
            // InternalIFACE.g:4668:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWTCPortAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWTCPort__Group__3__Impl"


    // $ANTLR start "rule__GSSIfaceSpWTCPort__Group__4"
    // InternalIFACE.g:4677:1: rule__GSSIfaceSpWTCPort__Group__4 : rule__GSSIfaceSpWTCPort__Group__4__Impl rule__GSSIfaceSpWTCPort__Group__5 ;
    public final void rule__GSSIfaceSpWTCPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4681:1: ( rule__GSSIfaceSpWTCPort__Group__4__Impl rule__GSSIfaceSpWTCPort__Group__5 )
            // InternalIFACE.g:4682:2: rule__GSSIfaceSpWTCPort__Group__4__Impl rule__GSSIfaceSpWTCPort__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSpWTCPort__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWTCPort__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWTCPort__Group__4"


    // $ANTLR start "rule__GSSIfaceSpWTCPort__Group__4__Impl"
    // InternalIFACE.g:4689:1: rule__GSSIfaceSpWTCPort__Group__4__Impl : ( ( rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4 ) ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4693:1: ( ( ( rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4 ) ) )
            // InternalIFACE.g:4694:1: ( ( rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4 ) )
            {
            // InternalIFACE.g:4694:1: ( ( rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4 ) )
            // InternalIFACE.g:4695:2: ( rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefAssignment_4()); 
            }
            // InternalIFACE.g:4696:2: ( rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4 )
            // InternalIFACE.g:4696:3: rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWTCPort__Group__4__Impl"


    // $ANTLR start "rule__GSSIfaceSpWTCPort__Group__5"
    // InternalIFACE.g:4704:1: rule__GSSIfaceSpWTCPort__Group__5 : rule__GSSIfaceSpWTCPort__Group__5__Impl rule__GSSIfaceSpWTCPort__Group__6 ;
    public final void rule__GSSIfaceSpWTCPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4708:1: ( rule__GSSIfaceSpWTCPort__Group__5__Impl rule__GSSIfaceSpWTCPort__Group__6 )
            // InternalIFACE.g:4709:2: rule__GSSIfaceSpWTCPort__Group__5__Impl rule__GSSIfaceSpWTCPort__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceSpWTCPort__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWTCPort__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWTCPort__Group__5"


    // $ANTLR start "rule__GSSIfaceSpWTCPort__Group__5__Impl"
    // InternalIFACE.g:4716:1: rule__GSSIfaceSpWTCPort__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4720:1: ( ( ';' ) )
            // InternalIFACE.g:4721:1: ( ';' )
            {
            // InternalIFACE.g:4721:1: ( ';' )
            // InternalIFACE.g:4722:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSemicolonKeyword_5()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWTCPortAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWTCPort__Group__5__Impl"


    // $ANTLR start "rule__GSSIfaceSpWTCPort__Group__6"
    // InternalIFACE.g:4731:1: rule__GSSIfaceSpWTCPort__Group__6 : rule__GSSIfaceSpWTCPort__Group__6__Impl rule__GSSIfaceSpWTCPort__Group__7 ;
    public final void rule__GSSIfaceSpWTCPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4735:1: ( rule__GSSIfaceSpWTCPort__Group__6__Impl rule__GSSIfaceSpWTCPort__Group__7 )
            // InternalIFACE.g:4736:2: rule__GSSIfaceSpWTCPort__Group__6__Impl rule__GSSIfaceSpWTCPort__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSpWTCPort__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWTCPort__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWTCPort__Group__6"


    // $ANTLR start "rule__GSSIfaceSpWTCPort__Group__6__Impl"
    // InternalIFACE.g:4743:1: rule__GSSIfaceSpWTCPort__Group__6__Impl : ( '}' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4747:1: ( ( '}' ) )
            // InternalIFACE.g:4748:1: ( '}' )
            {
            // InternalIFACE.g:4748:1: ( '}' )
            // InternalIFACE.g:4749:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWTCPortAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWTCPort__Group__6__Impl"


    // $ANTLR start "rule__GSSIfaceSpWTCPort__Group__7"
    // InternalIFACE.g:4758:1: rule__GSSIfaceSpWTCPort__Group__7 : rule__GSSIfaceSpWTCPort__Group__7__Impl ;
    public final void rule__GSSIfaceSpWTCPort__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4762:1: ( rule__GSSIfaceSpWTCPort__Group__7__Impl )
            // InternalIFACE.g:4763:2: rule__GSSIfaceSpWTCPort__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWTCPort__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWTCPort__Group__7"


    // $ANTLR start "rule__GSSIfaceSpWTCPort__Group__7__Impl"
    // InternalIFACE.g:4769:1: rule__GSSIfaceSpWTCPort__Group__7__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4773:1: ( ( ';' ) )
            // InternalIFACE.g:4774:1: ( ';' )
            {
            // InternalIFACE.g:4774:1: ( ';' )
            // InternalIFACE.g:4775:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSemicolonKeyword_7()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWTCPortAccess().getSemicolonKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWTCPort__Group__7__Impl"


    // $ANTLR start "rule__GSSIfaceDummyPort__Group__0"
    // InternalIFACE.g:4785:1: rule__GSSIfaceDummyPort__Group__0 : rule__GSSIfaceDummyPort__Group__0__Impl rule__GSSIfaceDummyPort__Group__1 ;
    public final void rule__GSSIfaceDummyPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4789:1: ( rule__GSSIfaceDummyPort__Group__0__Impl rule__GSSIfaceDummyPort__Group__1 )
            // InternalIFACE.g:4790:2: rule__GSSIfaceDummyPort__Group__0__Impl rule__GSSIfaceDummyPort__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSIfaceDummyPort__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceDummyPort__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceDummyPort__Group__0"


    // $ANTLR start "rule__GSSIfaceDummyPort__Group__0__Impl"
    // InternalIFACE.g:4797:1: rule__GSSIfaceDummyPort__Group__0__Impl : ( () ) ;
    public final void rule__GSSIfaceDummyPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4801:1: ( ( () ) )
            // InternalIFACE.g:4802:1: ( () )
            {
            // InternalIFACE.g:4802:1: ( () )
            // InternalIFACE.g:4803:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceDummyPortAccess().getGSSIfaceDummyPortAction_0()); 
            }
            // InternalIFACE.g:4804:2: ()
            // InternalIFACE.g:4804:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceDummyPortAccess().getGSSIfaceDummyPortAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceDummyPort__Group__0__Impl"


    // $ANTLR start "rule__GSSIfaceDummyPort__Group__1"
    // InternalIFACE.g:4812:1: rule__GSSIfaceDummyPort__Group__1 : rule__GSSIfaceDummyPort__Group__1__Impl rule__GSSIfaceDummyPort__Group__2 ;
    public final void rule__GSSIfaceDummyPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4816:1: ( rule__GSSIfaceDummyPort__Group__1__Impl rule__GSSIfaceDummyPort__Group__2 )
            // InternalIFACE.g:4817:2: rule__GSSIfaceDummyPort__Group__1__Impl rule__GSSIfaceDummyPort__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSIfaceDummyPort__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceDummyPort__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceDummyPort__Group__1"


    // $ANTLR start "rule__GSSIfaceDummyPort__Group__1__Impl"
    // InternalIFACE.g:4824:1: rule__GSSIfaceDummyPort__Group__1__Impl : ( 'dummyPort' ) ;
    public final void rule__GSSIfaceDummyPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4828:1: ( ( 'dummyPort' ) )
            // InternalIFACE.g:4829:1: ( 'dummyPort' )
            {
            // InternalIFACE.g:4829:1: ( 'dummyPort' )
            // InternalIFACE.g:4830:2: 'dummyPort'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceDummyPortAccess().getDummyPortKeyword_1()); 
            }
            match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceDummyPortAccess().getDummyPortKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceDummyPort__Group__1__Impl"


    // $ANTLR start "rule__GSSIfaceDummyPort__Group__2"
    // InternalIFACE.g:4839:1: rule__GSSIfaceDummyPort__Group__2 : rule__GSSIfaceDummyPort__Group__2__Impl rule__GSSIfaceDummyPort__Group__3 ;
    public final void rule__GSSIfaceDummyPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4843:1: ( rule__GSSIfaceDummyPort__Group__2__Impl rule__GSSIfaceDummyPort__Group__3 )
            // InternalIFACE.g:4844:2: rule__GSSIfaceDummyPort__Group__2__Impl rule__GSSIfaceDummyPort__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceDummyPort__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceDummyPort__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceDummyPort__Group__2"


    // $ANTLR start "rule__GSSIfaceDummyPort__Group__2__Impl"
    // InternalIFACE.g:4851:1: rule__GSSIfaceDummyPort__Group__2__Impl : ( '{' ) ;
    public final void rule__GSSIfaceDummyPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4855:1: ( ( '{' ) )
            // InternalIFACE.g:4856:1: ( '{' )
            {
            // InternalIFACE.g:4856:1: ( '{' )
            // InternalIFACE.g:4857:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceDummyPortAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceDummyPortAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceDummyPort__Group__2__Impl"


    // $ANTLR start "rule__GSSIfaceDummyPort__Group__3"
    // InternalIFACE.g:4866:1: rule__GSSIfaceDummyPort__Group__3 : rule__GSSIfaceDummyPort__Group__3__Impl rule__GSSIfaceDummyPort__Group__4 ;
    public final void rule__GSSIfaceDummyPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4870:1: ( rule__GSSIfaceDummyPort__Group__3__Impl rule__GSSIfaceDummyPort__Group__4 )
            // InternalIFACE.g:4871:2: rule__GSSIfaceDummyPort__Group__3__Impl rule__GSSIfaceDummyPort__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceDummyPort__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceDummyPort__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceDummyPort__Group__3"


    // $ANTLR start "rule__GSSIfaceDummyPort__Group__3__Impl"
    // InternalIFACE.g:4878:1: rule__GSSIfaceDummyPort__Group__3__Impl : ( '}' ) ;
    public final void rule__GSSIfaceDummyPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4882:1: ( ( '}' ) )
            // InternalIFACE.g:4883:1: ( '}' )
            {
            // InternalIFACE.g:4883:1: ( '}' )
            // InternalIFACE.g:4884:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceDummyPortAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceDummyPortAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceDummyPort__Group__3__Impl"


    // $ANTLR start "rule__GSSIfaceDummyPort__Group__4"
    // InternalIFACE.g:4893:1: rule__GSSIfaceDummyPort__Group__4 : rule__GSSIfaceDummyPort__Group__4__Impl ;
    public final void rule__GSSIfaceDummyPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4897:1: ( rule__GSSIfaceDummyPort__Group__4__Impl )
            // InternalIFACE.g:4898:2: rule__GSSIfaceDummyPort__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceDummyPort__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceDummyPort__Group__4"


    // $ANTLR start "rule__GSSIfaceDummyPort__Group__4__Impl"
    // InternalIFACE.g:4904:1: rule__GSSIfaceDummyPort__Group__4__Impl : ( ';' ) ;
    public final void rule__GSSIfaceDummyPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4908:1: ( ( ';' ) )
            // InternalIFACE.g:4909:1: ( ';' )
            {
            // InternalIFACE.g:4909:1: ( ';' )
            // InternalIFACE.g:4910:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceDummyPortAccess().getSemicolonKeyword_4()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceDummyPortAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceDummyPort__Group__4__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalIFACE.g:4920:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4924:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalIFACE.g:4925:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_47);
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
    // InternalIFACE.g:4932:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4936:1: ( ( RULE_ID ) )
            // InternalIFACE.g:4937:1: ( RULE_ID )
            {
            // InternalIFACE.g:4937:1: ( RULE_ID )
            // InternalIFACE.g:4938:2: RULE_ID
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
    // InternalIFACE.g:4947:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4951:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalIFACE.g:4952:2: rule__QualifiedName__Group__1__Impl
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
    // InternalIFACE.g:4958:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4962:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalIFACE.g:4963:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalIFACE.g:4963:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalIFACE.g:4964:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalIFACE.g:4965:2: ( rule__QualifiedName__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==66) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalIFACE.g:4965:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_48);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalIFACE.g:4974:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4978:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalIFACE.g:4979:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalIFACE.g:4986:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4990:1: ( ( '.' ) )
            // InternalIFACE.g:4991:1: ( '.' )
            {
            // InternalIFACE.g:4991:1: ( '.' )
            // InternalIFACE.g:4992:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:5001:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5005:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalIFACE.g:5006:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalIFACE.g:5012:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5016:1: ( ( RULE_ID ) )
            // InternalIFACE.g:5017:1: ( RULE_ID )
            {
            // InternalIFACE.g:5017:1: ( RULE_ID )
            // InternalIFACE.g:5018:2: RULE_ID
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
    // InternalIFACE.g:5028:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5032:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalIFACE.g:5033:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_47);
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
    // InternalIFACE.g:5040:1: rule__Version__Group__0__Impl : ( ( rule__Version__Alternatives_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5044:1: ( ( ( rule__Version__Alternatives_0 ) ) )
            // InternalIFACE.g:5045:1: ( ( rule__Version__Alternatives_0 ) )
            {
            // InternalIFACE.g:5045:1: ( ( rule__Version__Alternatives_0 ) )
            // InternalIFACE.g:5046:2: ( rule__Version__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_0()); 
            }
            // InternalIFACE.g:5047:2: ( rule__Version__Alternatives_0 )
            // InternalIFACE.g:5047:3: rule__Version__Alternatives_0
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
    // InternalIFACE.g:5055:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5059:1: ( rule__Version__Group__1__Impl )
            // InternalIFACE.g:5060:2: rule__Version__Group__1__Impl
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
    // InternalIFACE.g:5066:1: rule__Version__Group__1__Impl : ( ( rule__Version__Group_1__0 )* ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5070:1: ( ( ( rule__Version__Group_1__0 )* ) )
            // InternalIFACE.g:5071:1: ( ( rule__Version__Group_1__0 )* )
            {
            // InternalIFACE.g:5071:1: ( ( rule__Version__Group_1__0 )* )
            // InternalIFACE.g:5072:2: ( rule__Version__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1()); 
            }
            // InternalIFACE.g:5073:2: ( rule__Version__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==66) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalIFACE.g:5073:3: rule__Version__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_48);
            	    rule__Version__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalIFACE.g:5082:1: rule__Version__Group_0_1__0 : rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 ;
    public final void rule__Version__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5086:1: ( rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 )
            // InternalIFACE.g:5087:2: rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalIFACE.g:5094:1: rule__Version__Group_0_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5098:1: ( ( ( RULE_INT )? ) )
            // InternalIFACE.g:5099:1: ( ( RULE_INT )? )
            {
            // InternalIFACE.g:5099:1: ( ( RULE_INT )? )
            // InternalIFACE.g:5100:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
            }
            // InternalIFACE.g:5101:2: ( RULE_INT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalIFACE.g:5101:3: RULE_INT
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
    // InternalIFACE.g:5109:1: rule__Version__Group_0_1__1 : rule__Version__Group_0_1__1__Impl ;
    public final void rule__Version__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5113:1: ( rule__Version__Group_0_1__1__Impl )
            // InternalIFACE.g:5114:2: rule__Version__Group_0_1__1__Impl
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
    // InternalIFACE.g:5120:1: rule__Version__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5124:1: ( ( RULE_ID ) )
            // InternalIFACE.g:5125:1: ( RULE_ID )
            {
            // InternalIFACE.g:5125:1: ( RULE_ID )
            // InternalIFACE.g:5126:2: RULE_ID
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
    // InternalIFACE.g:5136:1: rule__Version__Group_1__0 : rule__Version__Group_1__0__Impl rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5140:1: ( rule__Version__Group_1__0__Impl rule__Version__Group_1__1 )
            // InternalIFACE.g:5141:2: rule__Version__Group_1__0__Impl rule__Version__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalIFACE.g:5148:1: rule__Version__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5152:1: ( ( '.' ) )
            // InternalIFACE.g:5153:1: ( '.' )
            {
            // InternalIFACE.g:5153:1: ( '.' )
            // InternalIFACE.g:5154:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            }
            match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:5163:1: rule__Version__Group_1__1 : rule__Version__Group_1__1__Impl ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5167:1: ( rule__Version__Group_1__1__Impl )
            // InternalIFACE.g:5168:2: rule__Version__Group_1__1__Impl
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
    // InternalIFACE.g:5174:1: rule__Version__Group_1__1__Impl : ( ( rule__Version__Alternatives_1_1 ) ) ;
    public final void rule__Version__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5178:1: ( ( ( rule__Version__Alternatives_1_1 ) ) )
            // InternalIFACE.g:5179:1: ( ( rule__Version__Alternatives_1_1 ) )
            {
            // InternalIFACE.g:5179:1: ( ( rule__Version__Alternatives_1_1 ) )
            // InternalIFACE.g:5180:2: ( rule__Version__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_1_1()); 
            }
            // InternalIFACE.g:5181:2: ( rule__Version__Alternatives_1_1 )
            // InternalIFACE.g:5181:3: rule__Version__Alternatives_1_1
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
    // InternalIFACE.g:5190:1: rule__Version__Group_1_1_1__0 : rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 ;
    public final void rule__Version__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5194:1: ( rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 )
            // InternalIFACE.g:5195:2: rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalIFACE.g:5202:1: rule__Version__Group_1_1_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5206:1: ( ( ( RULE_INT )? ) )
            // InternalIFACE.g:5207:1: ( ( RULE_INT )? )
            {
            // InternalIFACE.g:5207:1: ( ( RULE_INT )? )
            // InternalIFACE.g:5208:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
            }
            // InternalIFACE.g:5209:2: ( RULE_INT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalIFACE.g:5209:3: RULE_INT
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
    // InternalIFACE.g:5217:1: rule__Version__Group_1_1_1__1 : rule__Version__Group_1_1_1__1__Impl ;
    public final void rule__Version__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5221:1: ( rule__Version__Group_1_1_1__1__Impl )
            // InternalIFACE.g:5222:2: rule__Version__Group_1_1_1__1__Impl
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
    // InternalIFACE.g:5228:1: rule__Version__Group_1_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5232:1: ( ( RULE_ID ) )
            // InternalIFACE.g:5233:1: ( RULE_ID )
            {
            // InternalIFACE.g:5233:1: ( RULE_ID )
            // InternalIFACE.g:5234:2: RULE_ID
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
    // InternalIFACE.g:5244:1: rule__VersionedQualifiedName__Group__0 : rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 ;
    public final void rule__VersionedQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5248:1: ( rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 )
            // InternalIFACE.g:5249:2: rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_49);
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
    // InternalIFACE.g:5256:1: rule__VersionedQualifiedName__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__VersionedQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5260:1: ( ( ruleQualifiedName ) )
            // InternalIFACE.g:5261:1: ( ruleQualifiedName )
            {
            // InternalIFACE.g:5261:1: ( ruleQualifiedName )
            // InternalIFACE.g:5262:2: ruleQualifiedName
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
    // InternalIFACE.g:5271:1: rule__VersionedQualifiedName__Group__1 : rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 ;
    public final void rule__VersionedQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5275:1: ( rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 )
            // InternalIFACE.g:5276:2: rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalIFACE.g:5283:1: rule__VersionedQualifiedName__Group__1__Impl : ( '(' ) ;
    public final void rule__VersionedQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5287:1: ( ( '(' ) )
            // InternalIFACE.g:5288:1: ( '(' )
            {
            // InternalIFACE.g:5288:1: ( '(' )
            // InternalIFACE.g:5289:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:5298:1: rule__VersionedQualifiedName__Group__2 : rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 ;
    public final void rule__VersionedQualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5302:1: ( rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 )
            // InternalIFACE.g:5303:2: rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_50);
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
    // InternalIFACE.g:5310:1: rule__VersionedQualifiedName__Group__2__Impl : ( ruleVersion ) ;
    public final void rule__VersionedQualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5314:1: ( ( ruleVersion ) )
            // InternalIFACE.g:5315:1: ( ruleVersion )
            {
            // InternalIFACE.g:5315:1: ( ruleVersion )
            // InternalIFACE.g:5316:2: ruleVersion
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
    // InternalIFACE.g:5325:1: rule__VersionedQualifiedName__Group__3 : rule__VersionedQualifiedName__Group__3__Impl ;
    public final void rule__VersionedQualifiedName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5329:1: ( rule__VersionedQualifiedName__Group__3__Impl )
            // InternalIFACE.g:5330:2: rule__VersionedQualifiedName__Group__3__Impl
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
    // InternalIFACE.g:5336:1: rule__VersionedQualifiedName__Group__3__Impl : ( ')' ) ;
    public final void rule__VersionedQualifiedName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5340:1: ( ( ')' ) )
            // InternalIFACE.g:5341:1: ( ')' )
            {
            // InternalIFACE.g:5341:1: ( ')' )
            // InternalIFACE.g:5342:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,68,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:5352:1: rule__INTEGER__Group_0__0 : rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 ;
    public final void rule__INTEGER__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5356:1: ( rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 )
            // InternalIFACE.g:5357:2: rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1
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
    // InternalIFACE.g:5364:1: rule__INTEGER__Group_0__0__Impl : ( ( '-' )? ) ;
    public final void rule__INTEGER__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5368:1: ( ( ( '-' )? ) )
            // InternalIFACE.g:5369:1: ( ( '-' )? )
            {
            // InternalIFACE.g:5369:1: ( ( '-' )? )
            // InternalIFACE.g:5370:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); 
            }
            // InternalIFACE.g:5371:2: ( '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==69) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalIFACE.g:5371:3: '-'
                    {
                    match(input,69,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalIFACE.g:5379:1: rule__INTEGER__Group_0__1 : rule__INTEGER__Group_0__1__Impl ;
    public final void rule__INTEGER__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5383:1: ( rule__INTEGER__Group_0__1__Impl )
            // InternalIFACE.g:5384:2: rule__INTEGER__Group_0__1__Impl
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
    // InternalIFACE.g:5390:1: rule__INTEGER__Group_0__1__Impl : ( RULE_INT ) ;
    public final void rule__INTEGER__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5394:1: ( ( RULE_INT ) )
            // InternalIFACE.g:5395:1: ( RULE_INT )
            {
            // InternalIFACE.g:5395:1: ( RULE_INT )
            // InternalIFACE.g:5396:2: RULE_INT
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


    // $ANTLR start "rule__GSSIfacePortConfig__UnorderedGroup_3"
    // InternalIFACE.g:5406:1: rule__GSSIfacePortConfig__UnorderedGroup_3 : rule__GSSIfacePortConfig__UnorderedGroup_3__0 {...}?;
    public final void rule__GSSIfacePortConfig__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3());
        	
        try {
            // InternalIFACE.g:5411:1: ( rule__GSSIfacePortConfig__UnorderedGroup_3__0 {...}?)
            // InternalIFACE.g:5412:2: rule__GSSIfacePortConfig__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortConfig__UnorderedGroup_3__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__GSSIfacePortConfig__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__UnorderedGroup_3"


    // $ANTLR start "rule__GSSIfacePortConfig__UnorderedGroup_3__Impl"
    // InternalIFACE.g:5420:1: rule__GSSIfacePortConfig__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__GSSIfacePortConfig__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalIFACE.g:5425:1: ( ( ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) ) ) )
            // InternalIFACE.g:5426:3: ( ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) ) )
            {
            // InternalIFACE.g:5426:3: ( ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( LA21_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalIFACE.g:5427:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) )
                    {
                    // InternalIFACE.g:5427:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) )
                    // InternalIFACE.g:5428:4: {...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfacePortConfig__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalIFACE.g:5428:114: ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) )
                    // InternalIFACE.g:5429:5: ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // InternalIFACE.g:5435:5: ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) )
                    // InternalIFACE.g:5436:6: ( rule__GSSIfacePortConfig__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfacePortConfigAccess().getGroup_3_0()); 
                    }
                    // InternalIFACE.g:5437:6: ( rule__GSSIfacePortConfig__Group_3_0__0 )
                    // InternalIFACE.g:5437:7: rule__GSSIfacePortConfig__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfacePortConfig__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfacePortConfigAccess().getGroup_3_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:5442:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) )
                    {
                    // InternalIFACE.g:5442:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) )
                    // InternalIFACE.g:5443:4: {...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfacePortConfig__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalIFACE.g:5443:114: ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) )
                    // InternalIFACE.g:5444:5: ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // InternalIFACE.g:5450:5: ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) )
                    // InternalIFACE.g:5451:6: ( rule__GSSIfacePortConfig__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfacePortConfigAccess().getGroup_3_1()); 
                    }
                    // InternalIFACE.g:5452:6: ( rule__GSSIfacePortConfig__Group_3_1__0 )
                    // InternalIFACE.g:5452:7: rule__GSSIfacePortConfig__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfacePortConfig__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfacePortConfigAccess().getGroup_3_1()); 
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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__GSSIfacePortConfig__UnorderedGroup_3__0"
    // InternalIFACE.g:5465:1: rule__GSSIfacePortConfig__UnorderedGroup_3__0 : rule__GSSIfacePortConfig__UnorderedGroup_3__Impl ( rule__GSSIfacePortConfig__UnorderedGroup_3__1 )? ;
    public final void rule__GSSIfacePortConfig__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5469:1: ( rule__GSSIfacePortConfig__UnorderedGroup_3__Impl ( rule__GSSIfacePortConfig__UnorderedGroup_3__1 )? )
            // InternalIFACE.g:5470:2: rule__GSSIfacePortConfig__UnorderedGroup_3__Impl ( rule__GSSIfacePortConfig__UnorderedGroup_3__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_52);
            rule__GSSIfacePortConfig__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalIFACE.g:5471:2: ( rule__GSSIfacePortConfig__UnorderedGroup_3__1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalIFACE.g:0:0: rule__GSSIfacePortConfig__UnorderedGroup_3__1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfacePortConfig__UnorderedGroup_3__1();

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
    // $ANTLR end "rule__GSSIfacePortConfig__UnorderedGroup_3__0"


    // $ANTLR start "rule__GSSIfacePortConfig__UnorderedGroup_3__1"
    // InternalIFACE.g:5477:1: rule__GSSIfacePortConfig__UnorderedGroup_3__1 : rule__GSSIfacePortConfig__UnorderedGroup_3__Impl ;
    public final void rule__GSSIfacePortConfig__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5481:1: ( rule__GSSIfacePortConfig__UnorderedGroup_3__Impl )
            // InternalIFACE.g:5482:2: rule__GSSIfacePortConfig__UnorderedGroup_3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortConfig__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__UnorderedGroup_3__1"


    // $ANTLR start "rule__GSSModelFile__ImportsAssignment_0"
    // InternalIFACE.g:5489:1: rule__GSSModelFile__ImportsAssignment_0 : ( ruleGSSModelFileImport ) ;
    public final void rule__GSSModelFile__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5493:1: ( ( ruleGSSModelFileImport ) )
            // InternalIFACE.g:5494:2: ( ruleGSSModelFileImport )
            {
            // InternalIFACE.g:5494:2: ( ruleGSSModelFileImport )
            // InternalIFACE.g:5495:3: ruleGSSModelFileImport
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
    // InternalIFACE.g:5504:1: rule__GSSModelFile__ElementAssignment_1 : ( ruleGSSIfacePortConfig ) ;
    public final void rule__GSSModelFile__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5508:1: ( ( ruleGSSIfacePortConfig ) )
            // InternalIFACE.g:5509:2: ( ruleGSSIfacePortConfig )
            {
            // InternalIFACE.g:5509:2: ( ruleGSSIfacePortConfig )
            // InternalIFACE.g:5510:3: ruleGSSIfacePortConfig
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getElementGSSIfacePortConfigParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfacePortConfig();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSModelFileAccess().getElementGSSIfacePortConfigParserRuleCall_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__GSSModelFileImport__ImportURIAssignment_1"
    // InternalIFACE.g:5519:1: rule__GSSModelFileImport__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GSSModelFileImport__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5523:1: ( ( RULE_STRING ) )
            // InternalIFACE.g:5524:2: ( RULE_STRING )
            {
            // InternalIFACE.g:5524:2: ( RULE_STRING )
            // InternalIFACE.g:5525:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSModelFileImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSModelFileImport__ImportURIAssignment_1"


    // $ANTLR start "rule__GSSIfacePortConfig__NameAssignment_1"
    // InternalIFACE.g:5534:1: rule__GSSIfacePortConfig__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GSSIfacePortConfig__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5538:1: ( ( RULE_ID ) )
            // InternalIFACE.g:5539:2: ( RULE_ID )
            {
            // InternalIFACE.g:5539:2: ( RULE_ID )
            // InternalIFACE.g:5540:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortConfigAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__NameAssignment_1"


    // $ANTLR start "rule__GSSIfacePortConfig__UriAssignment_3_0_2"
    // InternalIFACE.g:5549:1: rule__GSSIfacePortConfig__UriAssignment_3_0_2 : ( ruleQualifiedName ) ;
    public final void rule__GSSIfacePortConfig__UriAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5553:1: ( ( ruleQualifiedName ) )
            // InternalIFACE.g:5554:2: ( ruleQualifiedName )
            {
            // InternalIFACE.g:5554:2: ( ruleQualifiedName )
            // InternalIFACE.g:5555:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortConfigAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__UriAssignment_3_0_2"


    // $ANTLR start "rule__GSSIfacePortConfig__VersionAssignment_3_1_2"
    // InternalIFACE.g:5564:1: rule__GSSIfacePortConfig__VersionAssignment_3_1_2 : ( ruleVersion ) ;
    public final void rule__GSSIfacePortConfig__VersionAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5568:1: ( ( ruleVersion ) )
            // InternalIFACE.g:5569:2: ( ruleVersion )
            {
            // InternalIFACE.g:5569:2: ( ruleVersion )
            // InternalIFACE.g:5570:3: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getVersionVersionParserRuleCall_3_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortConfigAccess().getVersionVersionParserRuleCall_3_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__VersionAssignment_3_1_2"


    // $ANTLR start "rule__GSSIfacePortConfig__PortConfigAssignment_4"
    // InternalIFACE.g:5579:1: rule__GSSIfacePortConfig__PortConfigAssignment_4 : ( ruleGSSIfacePort ) ;
    public final void rule__GSSIfacePortConfig__PortConfigAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5583:1: ( ( ruleGSSIfacePort ) )
            // InternalIFACE.g:5584:2: ( ruleGSSIfacePort )
            {
            // InternalIFACE.g:5584:2: ( ruleGSSIfacePort )
            // InternalIFACE.g:5585:3: ruleGSSIfacePort
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getPortConfigGSSIfacePortParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfacePort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortConfigAccess().getPortConfigGSSIfacePortParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__PortConfigAssignment_4"


    // $ANTLR start "rule__GSSIfaceSpWPort__TypeAssignment_4"
    // InternalIFACE.g:5594:1: rule__GSSIfaceSpWPort__TypeAssignment_4 : ( ruleGSSIfaceSpWPortType ) ;
    public final void rule__GSSIfaceSpWPort__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5598:1: ( ( ruleGSSIfaceSpWPortType ) )
            // InternalIFACE.g:5599:2: ( ruleGSSIfaceSpWPortType )
            {
            // InternalIFACE.g:5599:2: ( ruleGSSIfaceSpWPortType )
            // InternalIFACE.g:5600:3: ruleGSSIfaceSpWPortType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getTypeGSSIfaceSpWPortTypeEnumRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceSpWPortType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getTypeGSSIfaceSpWPortTypeEnumRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__TypeAssignment_4"


    // $ANTLR start "rule__GSSIfaceSpWPort__LinkAssignment_8"
    // InternalIFACE.g:5609:1: rule__GSSIfaceSpWPort__LinkAssignment_8 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSpWPort__LinkAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5613:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:5614:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:5614:2: ( ruleINTEGER )
            // InternalIFACE.g:5615:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getLinkINTEGERParserRuleCall_8_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getLinkINTEGERParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__LinkAssignment_8"


    // $ANTLR start "rule__GSSIfaceSpWPort__WritingPortAssignment_12"
    // InternalIFACE.g:5624:1: rule__GSSIfaceSpWPort__WritingPortAssignment_12 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSpWPort__WritingPortAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5628:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:5629:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:5629:2: ( ruleINTEGER )
            // InternalIFACE.g:5630:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortINTEGERParserRuleCall_12_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortINTEGERParserRuleCall_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__WritingPortAssignment_12"


    // $ANTLR start "rule__GSSIfaceSpWPort__ReadingPortAssignment_14"
    // InternalIFACE.g:5639:1: rule__GSSIfaceSpWPort__ReadingPortAssignment_14 : ( ruleGSSIfaceReadingPort ) ;
    public final void rule__GSSIfaceSpWPort__ReadingPortAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5643:1: ( ( ruleGSSIfaceReadingPort ) )
            // InternalIFACE.g:5644:2: ( ruleGSSIfaceReadingPort )
            {
            // InternalIFACE.g:5644:2: ( ruleGSSIfaceReadingPort )
            // InternalIFACE.g:5645:3: ruleGSSIfaceReadingPort
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortGSSIfaceReadingPortParserRuleCall_14_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceReadingPort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortGSSIfaceReadingPortParserRuleCall_14_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__ReadingPortAssignment_14"


    // $ANTLR start "rule__GSSIfaceReadingPort__PortAssignment_4"
    // InternalIFACE.g:5654:1: rule__GSSIfaceReadingPort__PortAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceReadingPort__PortAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5658:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:5659:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:5659:2: ( ruleINTEGER )
            // InternalIFACE.g:5660:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getPortINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceReadingPortAccess().getPortINTEGERParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceReadingPort__PortAssignment_4"


    // $ANTLR start "rule__GSSIfaceUartPort__NumberAssignment_4"
    // InternalIFACE.g:5669:1: rule__GSSIfaceUartPort__NumberAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceUartPort__NumberAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5673:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:5674:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:5674:2: ( ruleINTEGER )
            // InternalIFACE.g:5675:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getNumberINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getNumberINTEGERParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__NumberAssignment_4"


    // $ANTLR start "rule__GSSIfaceUartPort__BaudRateAssignment_8"
    // InternalIFACE.g:5684:1: rule__GSSIfaceUartPort__BaudRateAssignment_8 : ( ruleGSSIfaceUartPortBaudRate ) ;
    public final void rule__GSSIfaceUartPort__BaudRateAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5688:1: ( ( ruleGSSIfaceUartPortBaudRate ) )
            // InternalIFACE.g:5689:2: ( ruleGSSIfaceUartPortBaudRate )
            {
            // InternalIFACE.g:5689:2: ( ruleGSSIfaceUartPortBaudRate )
            // InternalIFACE.g:5690:3: ruleGSSIfaceUartPortBaudRate
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateGSSIfaceUartPortBaudRateEnumRuleCall_8_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceUartPortBaudRate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateGSSIfaceUartPortBaudRateEnumRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__BaudRateAssignment_8"


    // $ANTLR start "rule__GSSIfaceUartPort__ParityAssignment_12"
    // InternalIFACE.g:5699:1: rule__GSSIfaceUartPort__ParityAssignment_12 : ( ruleGSSIfaceUartPortParity ) ;
    public final void rule__GSSIfaceUartPort__ParityAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5703:1: ( ( ruleGSSIfaceUartPortParity ) )
            // InternalIFACE.g:5704:2: ( ruleGSSIfaceUartPortParity )
            {
            // InternalIFACE.g:5704:2: ( ruleGSSIfaceUartPortParity )
            // InternalIFACE.g:5705:3: ruleGSSIfaceUartPortParity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getParityGSSIfaceUartPortParityEnumRuleCall_12_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceUartPortParity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getParityGSSIfaceUartPortParityEnumRuleCall_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__ParityAssignment_12"


    // $ANTLR start "rule__GSSIfaceUartPort__DataBitsAssignment_16"
    // InternalIFACE.g:5714:1: rule__GSSIfaceUartPort__DataBitsAssignment_16 : ( ruleGSSIfaceUartPortDataBits ) ;
    public final void rule__GSSIfaceUartPort__DataBitsAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5718:1: ( ( ruleGSSIfaceUartPortDataBits ) )
            // InternalIFACE.g:5719:2: ( ruleGSSIfaceUartPortDataBits )
            {
            // InternalIFACE.g:5719:2: ( ruleGSSIfaceUartPortDataBits )
            // InternalIFACE.g:5720:3: ruleGSSIfaceUartPortDataBits
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsGSSIfaceUartPortDataBitsEnumRuleCall_16_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceUartPortDataBits();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsGSSIfaceUartPortDataBitsEnumRuleCall_16_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__DataBitsAssignment_16"


    // $ANTLR start "rule__GSSIfaceUartPort__StopBitsAssignment_20"
    // InternalIFACE.g:5729:1: rule__GSSIfaceUartPort__StopBitsAssignment_20 : ( ruleGSSIfaceUartPortStopBits ) ;
    public final void rule__GSSIfaceUartPort__StopBitsAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5733:1: ( ( ruleGSSIfaceUartPortStopBits ) )
            // InternalIFACE.g:5734:2: ( ruleGSSIfaceUartPortStopBits )
            {
            // InternalIFACE.g:5734:2: ( ruleGSSIfaceUartPortStopBits )
            // InternalIFACE.g:5735:3: ruleGSSIfaceUartPortStopBits
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsGSSIfaceUartPortStopBitsEnumRuleCall_20_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceUartPortStopBits();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsGSSIfaceUartPortStopBitsEnumRuleCall_20_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__StopBitsAssignment_20"


    // $ANTLR start "rule__GSSIfaceUartPort__FlowControlAssignment_24"
    // InternalIFACE.g:5744:1: rule__GSSIfaceUartPort__FlowControlAssignment_24 : ( ruleGSSIfaceUartPortFlowControl ) ;
    public final void rule__GSSIfaceUartPort__FlowControlAssignment_24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5748:1: ( ( ruleGSSIfaceUartPortFlowControl ) )
            // InternalIFACE.g:5749:2: ( ruleGSSIfaceUartPortFlowControl )
            {
            // InternalIFACE.g:5749:2: ( ruleGSSIfaceUartPortFlowControl )
            // InternalIFACE.g:5750:3: ruleGSSIfaceUartPortFlowControl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getFlowControlGSSIfaceUartPortFlowControlEnumRuleCall_24_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceUartPortFlowControl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getFlowControlGSSIfaceUartPortFlowControlEnumRuleCall_24_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__FlowControlAssignment_24"


    // $ANTLR start "rule__GSSIfaceUartPort__UartProtocolAssignment_26"
    // InternalIFACE.g:5759:1: rule__GSSIfaceUartPort__UartProtocolAssignment_26 : ( ruleGSSIfaceUartProtocol ) ;
    public final void rule__GSSIfaceUartPort__UartProtocolAssignment_26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5763:1: ( ( ruleGSSIfaceUartProtocol ) )
            // InternalIFACE.g:5764:2: ( ruleGSSIfaceUartProtocol )
            {
            // InternalIFACE.g:5764:2: ( ruleGSSIfaceUartProtocol )
            // InternalIFACE.g:5765:3: ruleGSSIfaceUartProtocol
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getUartProtocolGSSIfaceUartProtocolParserRuleCall_26_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceUartProtocol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getUartProtocolGSSIfaceUartProtocolParserRuleCall_26_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__UartProtocolAssignment_26"


    // $ANTLR start "rule__GSSIfaceUartProtocol__UnitAssignment_4"
    // InternalIFACE.g:5774:1: rule__GSSIfaceUartProtocol__UnitAssignment_4 : ( ruleGSSIfaceUartProtocolUnit ) ;
    public final void rule__GSSIfaceUartProtocol__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5778:1: ( ( ruleGSSIfaceUartProtocolUnit ) )
            // InternalIFACE.g:5779:2: ( ruleGSSIfaceUartProtocolUnit )
            {
            // InternalIFACE.g:5779:2: ( ruleGSSIfaceUartProtocolUnit )
            // InternalIFACE.g:5780:3: ruleGSSIfaceUartProtocolUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getUnitGSSIfaceUartProtocolUnitEnumRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceUartProtocolUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getUnitGSSIfaceUartProtocolUnitEnumRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__UnitAssignment_4"


    // $ANTLR start "rule__GSSIfaceUartProtocol__PowerAssignment_8"
    // InternalIFACE.g:5789:1: rule__GSSIfaceUartProtocol__PowerAssignment_8 : ( ruleGSSIfaceUartProtocolPower ) ;
    public final void rule__GSSIfaceUartProtocol__PowerAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5793:1: ( ( ruleGSSIfaceUartProtocolPower ) )
            // InternalIFACE.g:5794:2: ( ruleGSSIfaceUartProtocolPower )
            {
            // InternalIFACE.g:5794:2: ( ruleGSSIfaceUartProtocolPower )
            // InternalIFACE.g:5795:3: ruleGSSIfaceUartProtocolPower
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getPowerGSSIfaceUartProtocolPowerEnumRuleCall_8_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceUartProtocolPower();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getPowerGSSIfaceUartProtocolPowerEnumRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__PowerAssignment_8"


    // $ANTLR start "rule__GSSIfaceUartProtocol__ConstSizeAssignment_10"
    // InternalIFACE.g:5804:1: rule__GSSIfaceUartProtocol__ConstSizeAssignment_10 : ( ruleGSSIfaceConstSize ) ;
    public final void rule__GSSIfaceUartProtocol__ConstSizeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5808:1: ( ( ruleGSSIfaceConstSize ) )
            // InternalIFACE.g:5809:2: ( ruleGSSIfaceConstSize )
            {
            // InternalIFACE.g:5809:2: ( ruleGSSIfaceConstSize )
            // InternalIFACE.g:5810:3: ruleGSSIfaceConstSize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getConstSizeGSSIfaceConstSizeParserRuleCall_10_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceConstSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getConstSizeGSSIfaceConstSizeParserRuleCall_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__ConstSizeAssignment_10"


    // $ANTLR start "rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_11"
    // InternalIFACE.g:5819:1: rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_11 : ( ruleGSSIfaceSizeFieldOffset ) ;
    public final void rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5823:1: ( ( ruleGSSIfaceSizeFieldOffset ) )
            // InternalIFACE.g:5824:2: ( ruleGSSIfaceSizeFieldOffset )
            {
            // InternalIFACE.g:5824:2: ( ruleGSSIfaceSizeFieldOffset )
            // InternalIFACE.g:5825:3: ruleGSSIfaceSizeFieldOffset
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldOffsetGSSIfaceSizeFieldOffsetParserRuleCall_11_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceSizeFieldOffset();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldOffsetGSSIfaceSizeFieldOffsetParserRuleCall_11_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_11"


    // $ANTLR start "rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_12"
    // InternalIFACE.g:5834:1: rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_12 : ( ruleGSSIfaceSizeFieldTrim ) ;
    public final void rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5838:1: ( ( ruleGSSIfaceSizeFieldTrim ) )
            // InternalIFACE.g:5839:2: ( ruleGSSIfaceSizeFieldTrim )
            {
            // InternalIFACE.g:5839:2: ( ruleGSSIfaceSizeFieldTrim )
            // InternalIFACE.g:5840:3: ruleGSSIfaceSizeFieldTrim
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldTrimGSSIfaceSizeFieldTrimParserRuleCall_12_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceSizeFieldTrim();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldTrimGSSIfaceSizeFieldTrimParserRuleCall_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_12"


    // $ANTLR start "rule__GSSIfaceUartProtocol__SyncPatternAssignment_13"
    // InternalIFACE.g:5849:1: rule__GSSIfaceUartProtocol__SyncPatternAssignment_13 : ( ruleGSSIfaceSyncPattern ) ;
    public final void rule__GSSIfaceUartProtocol__SyncPatternAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5853:1: ( ( ruleGSSIfaceSyncPattern ) )
            // InternalIFACE.g:5854:2: ( ruleGSSIfaceSyncPattern )
            {
            // InternalIFACE.g:5854:2: ( ruleGSSIfaceSyncPattern )
            // InternalIFACE.g:5855:3: ruleGSSIfaceSyncPattern
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getSyncPatternGSSIfaceSyncPatternParserRuleCall_13_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceSyncPattern();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getSyncPatternGSSIfaceSyncPatternParserRuleCall_13_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__SyncPatternAssignment_13"


    // $ANTLR start "rule__GSSIfaceConstSize__BytesAssignment_4"
    // InternalIFACE.g:5864:1: rule__GSSIfaceConstSize__BytesAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceConstSize__BytesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5868:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:5869:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:5869:2: ( ruleINTEGER )
            // InternalIFACE.g:5870:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getBytesINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getBytesINTEGERParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__BytesAssignment_4"


    // $ANTLR start "rule__GSSIfaceConstSize__BitsAssignment_8"
    // InternalIFACE.g:5879:1: rule__GSSIfaceConstSize__BitsAssignment_8 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceConstSize__BitsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5883:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:5884:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:5884:2: ( ruleINTEGER )
            // InternalIFACE.g:5885:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getBitsINTEGERParserRuleCall_8_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getBitsINTEGERParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__BitsAssignment_8"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__BytesAssignment_4"
    // InternalIFACE.g:5894:1: rule__GSSIfaceSizeFieldOffset__BytesAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSizeFieldOffset__BytesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5898:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:5899:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:5899:2: ( ruleINTEGER )
            // InternalIFACE.g:5900:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesINTEGERParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__BytesAssignment_4"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__BitsAssignment_8"
    // InternalIFACE.g:5909:1: rule__GSSIfaceSizeFieldOffset__BitsAssignment_8 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSizeFieldOffset__BitsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5913:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:5914:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:5914:2: ( ruleINTEGER )
            // InternalIFACE.g:5915:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsINTEGERParserRuleCall_8_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsINTEGERParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__BitsAssignment_8"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__BytesAssignment_4"
    // InternalIFACE.g:5924:1: rule__GSSIfaceSizeFieldTrim__BytesAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSizeFieldTrim__BytesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5928:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:5929:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:5929:2: ( ruleINTEGER )
            // InternalIFACE.g:5930:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesINTEGERParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__BytesAssignment_4"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__BitsAssignment_8"
    // InternalIFACE.g:5939:1: rule__GSSIfaceSizeFieldTrim__BitsAssignment_8 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSizeFieldTrim__BitsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5943:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:5944:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:5944:2: ( ruleINTEGER )
            // InternalIFACE.g:5945:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsINTEGERParserRuleCall_8_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsINTEGERParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__BitsAssignment_8"


    // $ANTLR start "rule__GSSIfaceSyncPattern__HexValueAssignment_4"
    // InternalIFACE.g:5954:1: rule__GSSIfaceSyncPattern__HexValueAssignment_4 : ( RULE_HEXADECIMAL ) ;
    public final void rule__GSSIfaceSyncPattern__HexValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5958:1: ( ( RULE_HEXADECIMAL ) )
            // InternalIFACE.g:5959:2: ( RULE_HEXADECIMAL )
            {
            // InternalIFACE.g:5959:2: ( RULE_HEXADECIMAL )
            // InternalIFACE.g:5960:3: RULE_HEXADECIMAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueHEXADECIMALTerminalRuleCall_4_0()); 
            }
            match(input,RULE_HEXADECIMAL,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueHEXADECIMALTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSyncPattern__HexValueAssignment_4"


    // $ANTLR start "rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4"
    // InternalIFACE.g:5969:1: rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5973:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:5974:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:5974:2: ( ruleINTEGER )
            // InternalIFACE.g:5975:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefINTEGERParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4"

    // $ANTLR start synpred30_InternalIFACE
    public final void synpred30_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5427:3: ( ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) ) )
        // InternalIFACE.g:5427:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) )
        {
        // InternalIFACE.g:5427:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) )
        // InternalIFACE.g:5428:4: {...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred30_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalIFACE.g:5428:114: ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) )
        // InternalIFACE.g:5429:5: ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0);
        // InternalIFACE.g:5435:5: ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) )
        // InternalIFACE.g:5436:6: ( rule__GSSIfacePortConfig__Group_3_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSIfacePortConfigAccess().getGroup_3_0()); 
        }
        // InternalIFACE.g:5437:6: ( rule__GSSIfacePortConfig__Group_3_0__0 )
        // InternalIFACE.g:5437:7: rule__GSSIfacePortConfig__Group_3_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfacePortConfig__Group_3_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred30_InternalIFACE

    // $ANTLR start synpred31_InternalIFACE
    public final void synpred31_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5471:2: ( rule__GSSIfacePortConfig__UnorderedGroup_3__1 )
        // InternalIFACE.g:5471:2: rule__GSSIfacePortConfig__UnorderedGroup_3__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfacePortConfig__UnorderedGroup_3__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalIFACE

    // Delegated rules

    public final boolean synpred30_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalIFACE_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000028000000000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x8001040000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000007000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000020L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000003E0000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000003C00000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000308000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x2000004000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000020L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000028000000002L});
    }


}