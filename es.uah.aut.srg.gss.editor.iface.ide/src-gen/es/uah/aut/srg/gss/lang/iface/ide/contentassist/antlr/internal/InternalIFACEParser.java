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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_HEXADECIMAL", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'usb'", "'mk2'", "'pci'", "'38400bauds'", "'115200bauds'", "'NO'", "'ODD'", "'EVEN'", "'MARK'", "'SPACE'", "'5bits'", "'6bits'", "'7bits'", "'8bits'", "'1bit'", "'2bits'", "'bytes'", "'bits'", "'no'", "'2_with_0'", "'import'", "';'", "'portConfig'", "'{'", "'}'", "'uri'", "':='", "'version'", "'spwPort'", "'type'", "'link'", "'writingPort'", "'readingPort'", "'port'", "'uartPort'", "'number'", "'baudRate'", "'parity'", "'dataBits'", "'stopBits'", "'inputQueueSize'", "'outputQueueSize'", "'uartProtocol'", "'unit'", "'power'", "'constSize'", "'sizeFieldOffset'", "'sizeFieldTrim'", "'syncPattern'", "'hexValue'", "'spwTCPort'", "'spwPortRef'", "'dummyPort'", "'.'", "'('", "')'", "'-'"
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


    // $ANTLR start "ruleGSSIfaceUartProtocolUnit"
    // InternalIFACE.g:591:1: ruleGSSIfaceUartProtocolUnit : ( ( rule__GSSIfaceUartProtocolUnit__Alternatives ) ) ;
    public final void ruleGSSIfaceUartProtocolUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:595:1: ( ( ( rule__GSSIfaceUartProtocolUnit__Alternatives ) ) )
            // InternalIFACE.g:596:2: ( ( rule__GSSIfaceUartProtocolUnit__Alternatives ) )
            {
            // InternalIFACE.g:596:2: ( ( rule__GSSIfaceUartProtocolUnit__Alternatives ) )
            // InternalIFACE.g:597:3: ( rule__GSSIfaceUartProtocolUnit__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolUnitAccess().getAlternatives()); 
            }
            // InternalIFACE.g:598:3: ( rule__GSSIfaceUartProtocolUnit__Alternatives )
            // InternalIFACE.g:598:4: rule__GSSIfaceUartProtocolUnit__Alternatives
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
    // InternalIFACE.g:607:1: ruleGSSIfaceUartProtocolPower : ( ( rule__GSSIfaceUartProtocolPower__Alternatives ) ) ;
    public final void ruleGSSIfaceUartProtocolPower() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:611:1: ( ( ( rule__GSSIfaceUartProtocolPower__Alternatives ) ) )
            // InternalIFACE.g:612:2: ( ( rule__GSSIfaceUartProtocolPower__Alternatives ) )
            {
            // InternalIFACE.g:612:2: ( ( rule__GSSIfaceUartProtocolPower__Alternatives ) )
            // InternalIFACE.g:613:3: ( rule__GSSIfaceUartProtocolPower__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolPowerAccess().getAlternatives()); 
            }
            // InternalIFACE.g:614:3: ( rule__GSSIfaceUartProtocolPower__Alternatives )
            // InternalIFACE.g:614:4: rule__GSSIfaceUartProtocolPower__Alternatives
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
    // InternalIFACE.g:622:1: rule__GSSIfacePort__Alternatives : ( ( ruleGSSIfaceSpWPort ) | ( ruleGSSIfaceUartPort ) | ( ruleGSSIfaceSpWTCPort ) | ( ruleGSSIfaceDummyPort ) );
    public final void rule__GSSIfacePort__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:626:1: ( ( ruleGSSIfaceSpWPort ) | ( ruleGSSIfaceUartPort ) | ( ruleGSSIfaceSpWTCPort ) | ( ruleGSSIfaceDummyPort ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt1=1;
                }
                break;
            case 46:
                {
                alt1=2;
                }
                break;
            case 62:
                {
                alt1=3;
                }
                break;
            case 64:
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
                    // InternalIFACE.g:627:2: ( ruleGSSIfaceSpWPort )
                    {
                    // InternalIFACE.g:627:2: ( ruleGSSIfaceSpWPort )
                    // InternalIFACE.g:628:3: ruleGSSIfaceSpWPort
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
                    // InternalIFACE.g:633:2: ( ruleGSSIfaceUartPort )
                    {
                    // InternalIFACE.g:633:2: ( ruleGSSIfaceUartPort )
                    // InternalIFACE.g:634:3: ruleGSSIfaceUartPort
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
                    // InternalIFACE.g:639:2: ( ruleGSSIfaceSpWTCPort )
                    {
                    // InternalIFACE.g:639:2: ( ruleGSSIfaceSpWTCPort )
                    // InternalIFACE.g:640:3: ruleGSSIfaceSpWTCPort
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
                    // InternalIFACE.g:645:2: ( ruleGSSIfaceDummyPort )
                    {
                    // InternalIFACE.g:645:2: ( ruleGSSIfaceDummyPort )
                    // InternalIFACE.g:646:3: ruleGSSIfaceDummyPort
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
    // InternalIFACE.g:655:1: rule__Version__Alternatives_0 : ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) );
    public final void rule__Version__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:659:1: ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||LA2_1==33||LA2_1==65||LA2_1==67) ) {
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
                    // InternalIFACE.g:660:2: ( RULE_INT )
                    {
                    // InternalIFACE.g:660:2: ( RULE_INT )
                    // InternalIFACE.g:661:3: RULE_INT
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
                    // InternalIFACE.g:666:2: ( ( rule__Version__Group_0_1__0 ) )
                    {
                    // InternalIFACE.g:666:2: ( ( rule__Version__Group_0_1__0 ) )
                    // InternalIFACE.g:667:3: ( rule__Version__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_0_1()); 
                    }
                    // InternalIFACE.g:668:3: ( rule__Version__Group_0_1__0 )
                    // InternalIFACE.g:668:4: rule__Version__Group_0_1__0
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
    // InternalIFACE.g:676:1: rule__Version__Alternatives_1_1 : ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) );
    public final void rule__Version__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:680:1: ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==33||LA3_1==65||LA3_1==67) ) {
                    alt3=1;
                }
                else if ( (LA3_1==RULE_ID) ) {
                    alt3=2;
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
                    // InternalIFACE.g:681:2: ( RULE_INT )
                    {
                    // InternalIFACE.g:681:2: ( RULE_INT )
                    // InternalIFACE.g:682:3: RULE_INT
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
                    // InternalIFACE.g:687:2: ( ( rule__Version__Group_1_1_1__0 ) )
                    {
                    // InternalIFACE.g:687:2: ( ( rule__Version__Group_1_1_1__0 ) )
                    // InternalIFACE.g:688:3: ( rule__Version__Group_1_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_1_1_1()); 
                    }
                    // InternalIFACE.g:689:3: ( rule__Version__Group_1_1_1__0 )
                    // InternalIFACE.g:689:4: rule__Version__Group_1_1_1__0
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
    // InternalIFACE.g:697:1: rule__INTEGER__Alternatives : ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) );
    public final void rule__INTEGER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:701:1: ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||LA4_0==68) ) {
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
                    // InternalIFACE.g:702:2: ( ( rule__INTEGER__Group_0__0 ) )
                    {
                    // InternalIFACE.g:702:2: ( ( rule__INTEGER__Group_0__0 ) )
                    // InternalIFACE.g:703:3: ( rule__INTEGER__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getINTEGERAccess().getGroup_0()); 
                    }
                    // InternalIFACE.g:704:3: ( rule__INTEGER__Group_0__0 )
                    // InternalIFACE.g:704:4: rule__INTEGER__Group_0__0
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
                    // InternalIFACE.g:708:2: ( RULE_HEXADECIMAL )
                    {
                    // InternalIFACE.g:708:2: ( RULE_HEXADECIMAL )
                    // InternalIFACE.g:709:3: RULE_HEXADECIMAL
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
    // InternalIFACE.g:718:1: rule__GSSIfaceSpWPortType__Alternatives : ( ( ( 'usb' ) ) | ( ( 'mk2' ) ) | ( ( 'pci' ) ) );
    public final void rule__GSSIfaceSpWPortType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:722:1: ( ( ( 'usb' ) ) | ( ( 'mk2' ) ) | ( ( 'pci' ) ) )
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
                    // InternalIFACE.g:723:2: ( ( 'usb' ) )
                    {
                    // InternalIFACE.g:723:2: ( ( 'usb' ) )
                    // InternalIFACE.g:724:3: ( 'usb' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceSpWPortTypeAccess().getUsbEnumLiteralDeclaration_0()); 
                    }
                    // InternalIFACE.g:725:3: ( 'usb' )
                    // InternalIFACE.g:725:4: 'usb'
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
                    // InternalIFACE.g:729:2: ( ( 'mk2' ) )
                    {
                    // InternalIFACE.g:729:2: ( ( 'mk2' ) )
                    // InternalIFACE.g:730:3: ( 'mk2' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceSpWPortTypeAccess().getMk2EnumLiteralDeclaration_1()); 
                    }
                    // InternalIFACE.g:731:3: ( 'mk2' )
                    // InternalIFACE.g:731:4: 'mk2'
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
                    // InternalIFACE.g:735:2: ( ( 'pci' ) )
                    {
                    // InternalIFACE.g:735:2: ( ( 'pci' ) )
                    // InternalIFACE.g:736:3: ( 'pci' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceSpWPortTypeAccess().getPciEnumLiteralDeclaration_2()); 
                    }
                    // InternalIFACE.g:737:3: ( 'pci' )
                    // InternalIFACE.g:737:4: 'pci'
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
    // InternalIFACE.g:745:1: rule__GSSIfaceUartPortBaudRate__Alternatives : ( ( ( '38400bauds' ) ) | ( ( '115200bauds' ) ) );
    public final void rule__GSSIfaceUartPortBaudRate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:749:1: ( ( ( '38400bauds' ) ) | ( ( '115200bauds' ) ) )
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
                    // InternalIFACE.g:750:2: ( ( '38400bauds' ) )
                    {
                    // InternalIFACE.g:750:2: ( ( '38400bauds' ) )
                    // InternalIFACE.g:751:3: ( '38400bauds' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortBaudRateAccess().get_38400EnumLiteralDeclaration_0()); 
                    }
                    // InternalIFACE.g:752:3: ( '38400bauds' )
                    // InternalIFACE.g:752:4: '38400bauds'
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
                    // InternalIFACE.g:756:2: ( ( '115200bauds' ) )
                    {
                    // InternalIFACE.g:756:2: ( ( '115200bauds' ) )
                    // InternalIFACE.g:757:3: ( '115200bauds' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortBaudRateAccess().get_115200EnumLiteralDeclaration_1()); 
                    }
                    // InternalIFACE.g:758:3: ( '115200bauds' )
                    // InternalIFACE.g:758:4: '115200bauds'
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
    // InternalIFACE.g:766:1: rule__GSSIfaceUartPortParity__Alternatives : ( ( ( 'NO' ) ) | ( ( 'ODD' ) ) | ( ( 'EVEN' ) ) | ( ( 'MARK' ) ) | ( ( 'SPACE' ) ) );
    public final void rule__GSSIfaceUartPortParity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:770:1: ( ( ( 'NO' ) ) | ( ( 'ODD' ) ) | ( ( 'EVEN' ) ) | ( ( 'MARK' ) ) | ( ( 'SPACE' ) ) )
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
                    // InternalIFACE.g:771:2: ( ( 'NO' ) )
                    {
                    // InternalIFACE.g:771:2: ( ( 'NO' ) )
                    // InternalIFACE.g:772:3: ( 'NO' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortParityAccess().getNOEnumLiteralDeclaration_0()); 
                    }
                    // InternalIFACE.g:773:3: ( 'NO' )
                    // InternalIFACE.g:773:4: 'NO'
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
                    // InternalIFACE.g:777:2: ( ( 'ODD' ) )
                    {
                    // InternalIFACE.g:777:2: ( ( 'ODD' ) )
                    // InternalIFACE.g:778:3: ( 'ODD' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortParityAccess().getODDEnumLiteralDeclaration_1()); 
                    }
                    // InternalIFACE.g:779:3: ( 'ODD' )
                    // InternalIFACE.g:779:4: 'ODD'
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
                    // InternalIFACE.g:783:2: ( ( 'EVEN' ) )
                    {
                    // InternalIFACE.g:783:2: ( ( 'EVEN' ) )
                    // InternalIFACE.g:784:3: ( 'EVEN' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortParityAccess().getEVENEnumLiteralDeclaration_2()); 
                    }
                    // InternalIFACE.g:785:3: ( 'EVEN' )
                    // InternalIFACE.g:785:4: 'EVEN'
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
                    // InternalIFACE.g:789:2: ( ( 'MARK' ) )
                    {
                    // InternalIFACE.g:789:2: ( ( 'MARK' ) )
                    // InternalIFACE.g:790:3: ( 'MARK' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortParityAccess().getMARKEnumLiteralDeclaration_3()); 
                    }
                    // InternalIFACE.g:791:3: ( 'MARK' )
                    // InternalIFACE.g:791:4: 'MARK'
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
                    // InternalIFACE.g:795:2: ( ( 'SPACE' ) )
                    {
                    // InternalIFACE.g:795:2: ( ( 'SPACE' ) )
                    // InternalIFACE.g:796:3: ( 'SPACE' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortParityAccess().getSPACEEnumLiteralDeclaration_4()); 
                    }
                    // InternalIFACE.g:797:3: ( 'SPACE' )
                    // InternalIFACE.g:797:4: 'SPACE'
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
    // InternalIFACE.g:805:1: rule__GSSIfaceUartPortDataBits__Alternatives : ( ( ( '5bits' ) ) | ( ( '6bits' ) ) | ( ( '7bits' ) ) | ( ( '8bits' ) ) );
    public final void rule__GSSIfaceUartPortDataBits__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:809:1: ( ( ( '5bits' ) ) | ( ( '6bits' ) ) | ( ( '7bits' ) ) | ( ( '8bits' ) ) )
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
                    // InternalIFACE.g:810:2: ( ( '5bits' ) )
                    {
                    // InternalIFACE.g:810:2: ( ( '5bits' ) )
                    // InternalIFACE.g:811:3: ( '5bits' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_5EnumLiteralDeclaration_0()); 
                    }
                    // InternalIFACE.g:812:3: ( '5bits' )
                    // InternalIFACE.g:812:4: '5bits'
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
                    // InternalIFACE.g:816:2: ( ( '6bits' ) )
                    {
                    // InternalIFACE.g:816:2: ( ( '6bits' ) )
                    // InternalIFACE.g:817:3: ( '6bits' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_6EnumLiteralDeclaration_1()); 
                    }
                    // InternalIFACE.g:818:3: ( '6bits' )
                    // InternalIFACE.g:818:4: '6bits'
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
                    // InternalIFACE.g:822:2: ( ( '7bits' ) )
                    {
                    // InternalIFACE.g:822:2: ( ( '7bits' ) )
                    // InternalIFACE.g:823:3: ( '7bits' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_7EnumLiteralDeclaration_2()); 
                    }
                    // InternalIFACE.g:824:3: ( '7bits' )
                    // InternalIFACE.g:824:4: '7bits'
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
                    // InternalIFACE.g:828:2: ( ( '8bits' ) )
                    {
                    // InternalIFACE.g:828:2: ( ( '8bits' ) )
                    // InternalIFACE.g:829:3: ( '8bits' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_8EnumLiteralDeclaration_3()); 
                    }
                    // InternalIFACE.g:830:3: ( '8bits' )
                    // InternalIFACE.g:830:4: '8bits'
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
    // InternalIFACE.g:838:1: rule__GSSIfaceUartPortStopBits__Alternatives : ( ( ( '1bit' ) ) | ( ( '2bits' ) ) );
    public final void rule__GSSIfaceUartPortStopBits__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:842:1: ( ( ( '1bit' ) ) | ( ( '2bits' ) ) )
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
                    // InternalIFACE.g:843:2: ( ( '1bit' ) )
                    {
                    // InternalIFACE.g:843:2: ( ( '1bit' ) )
                    // InternalIFACE.g:844:3: ( '1bit' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortStopBitsAccess().get_1EnumLiteralDeclaration_0()); 
                    }
                    // InternalIFACE.g:845:3: ( '1bit' )
                    // InternalIFACE.g:845:4: '1bit'
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
                    // InternalIFACE.g:849:2: ( ( '2bits' ) )
                    {
                    // InternalIFACE.g:849:2: ( ( '2bits' ) )
                    // InternalIFACE.g:850:3: ( '2bits' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortStopBitsAccess().get_2EnumLiteralDeclaration_1()); 
                    }
                    // InternalIFACE.g:851:3: ( '2bits' )
                    // InternalIFACE.g:851:4: '2bits'
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


    // $ANTLR start "rule__GSSIfaceUartProtocolUnit__Alternatives"
    // InternalIFACE.g:859:1: rule__GSSIfaceUartProtocolUnit__Alternatives : ( ( ( 'bytes' ) ) | ( ( 'bits' ) ) );
    public final void rule__GSSIfaceUartProtocolUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:863:1: ( ( ( 'bytes' ) ) | ( ( 'bits' ) ) )
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
                    // InternalIFACE.g:864:2: ( ( 'bytes' ) )
                    {
                    // InternalIFACE.g:864:2: ( ( 'bytes' ) )
                    // InternalIFACE.g:865:3: ( 'bytes' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartProtocolUnitAccess().getBytesEnumLiteralDeclaration_0()); 
                    }
                    // InternalIFACE.g:866:3: ( 'bytes' )
                    // InternalIFACE.g:866:4: 'bytes'
                    {
                    match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartProtocolUnitAccess().getBytesEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:870:2: ( ( 'bits' ) )
                    {
                    // InternalIFACE.g:870:2: ( ( 'bits' ) )
                    // InternalIFACE.g:871:3: ( 'bits' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartProtocolUnitAccess().getBitsEnumLiteralDeclaration_1()); 
                    }
                    // InternalIFACE.g:872:3: ( 'bits' )
                    // InternalIFACE.g:872:4: 'bits'
                    {
                    match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalIFACE.g:880:1: rule__GSSIfaceUartProtocolPower__Alternatives : ( ( ( 'no' ) ) | ( ( '2bits' ) ) | ( ( '2_with_0' ) ) );
    public final void rule__GSSIfaceUartProtocolPower__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:884:1: ( ( ( 'no' ) ) | ( ( '2bits' ) ) | ( ( '2_with_0' ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt11=1;
                }
                break;
            case 27:
                {
                alt11=2;
                }
                break;
            case 31:
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
                    // InternalIFACE.g:885:2: ( ( 'no' ) )
                    {
                    // InternalIFACE.g:885:2: ( ( 'no' ) )
                    // InternalIFACE.g:886:3: ( 'no' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartProtocolPowerAccess().getNoEnumLiteralDeclaration_0()); 
                    }
                    // InternalIFACE.g:887:3: ( 'no' )
                    // InternalIFACE.g:887:4: 'no'
                    {
                    match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartProtocolPowerAccess().getNoEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:891:2: ( ( '2bits' ) )
                    {
                    // InternalIFACE.g:891:2: ( ( '2bits' ) )
                    // InternalIFACE.g:892:3: ( '2bits' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartProtocolPowerAccess().get_2EnumLiteralDeclaration_1()); 
                    }
                    // InternalIFACE.g:893:3: ( '2bits' )
                    // InternalIFACE.g:893:4: '2bits'
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
                    // InternalIFACE.g:897:2: ( ( '2_with_0' ) )
                    {
                    // InternalIFACE.g:897:2: ( ( '2_with_0' ) )
                    // InternalIFACE.g:898:3: ( '2_with_0' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartProtocolPowerAccess().get_2_with_0EnumLiteralDeclaration_2()); 
                    }
                    // InternalIFACE.g:899:3: ( '2_with_0' )
                    // InternalIFACE.g:899:4: '2_with_0'
                    {
                    match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalIFACE.g:907:1: rule__GSSModelFile__Group__0 : rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1 ;
    public final void rule__GSSModelFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:911:1: ( rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1 )
            // InternalIFACE.g:912:2: rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1
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
    // InternalIFACE.g:919:1: rule__GSSModelFile__Group__0__Impl : ( ( rule__GSSModelFile__ImportsAssignment_0 )* ) ;
    public final void rule__GSSModelFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:923:1: ( ( ( rule__GSSModelFile__ImportsAssignment_0 )* ) )
            // InternalIFACE.g:924:1: ( ( rule__GSSModelFile__ImportsAssignment_0 )* )
            {
            // InternalIFACE.g:924:1: ( ( rule__GSSModelFile__ImportsAssignment_0 )* )
            // InternalIFACE.g:925:2: ( rule__GSSModelFile__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getImportsAssignment_0()); 
            }
            // InternalIFACE.g:926:2: ( rule__GSSModelFile__ImportsAssignment_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalIFACE.g:926:3: rule__GSSModelFile__ImportsAssignment_0
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
    // InternalIFACE.g:934:1: rule__GSSModelFile__Group__1 : rule__GSSModelFile__Group__1__Impl ;
    public final void rule__GSSModelFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:938:1: ( rule__GSSModelFile__Group__1__Impl )
            // InternalIFACE.g:939:2: rule__GSSModelFile__Group__1__Impl
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
    // InternalIFACE.g:945:1: rule__GSSModelFile__Group__1__Impl : ( ( rule__GSSModelFile__ElementAssignment_1 ) ) ;
    public final void rule__GSSModelFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:949:1: ( ( ( rule__GSSModelFile__ElementAssignment_1 ) ) )
            // InternalIFACE.g:950:1: ( ( rule__GSSModelFile__ElementAssignment_1 ) )
            {
            // InternalIFACE.g:950:1: ( ( rule__GSSModelFile__ElementAssignment_1 ) )
            // InternalIFACE.g:951:2: ( rule__GSSModelFile__ElementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getElementAssignment_1()); 
            }
            // InternalIFACE.g:952:2: ( rule__GSSModelFile__ElementAssignment_1 )
            // InternalIFACE.g:952:3: rule__GSSModelFile__ElementAssignment_1
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
    // InternalIFACE.g:961:1: rule__GSSModelFileImport__Group__0 : rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1 ;
    public final void rule__GSSModelFileImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:965:1: ( rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1 )
            // InternalIFACE.g:966:2: rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1
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
    // InternalIFACE.g:973:1: rule__GSSModelFileImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__GSSModelFileImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:977:1: ( ( 'import' ) )
            // InternalIFACE.g:978:1: ( 'import' )
            {
            // InternalIFACE.g:978:1: ( 'import' )
            // InternalIFACE.g:979:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getImportKeyword_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:988:1: rule__GSSModelFileImport__Group__1 : rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2 ;
    public final void rule__GSSModelFileImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:992:1: ( rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2 )
            // InternalIFACE.g:993:2: rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2
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
    // InternalIFACE.g:1000:1: rule__GSSModelFileImport__Group__1__Impl : ( ( rule__GSSModelFileImport__ImportURIAssignment_1 ) ) ;
    public final void rule__GSSModelFileImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1004:1: ( ( ( rule__GSSModelFileImport__ImportURIAssignment_1 ) ) )
            // InternalIFACE.g:1005:1: ( ( rule__GSSModelFileImport__ImportURIAssignment_1 ) )
            {
            // InternalIFACE.g:1005:1: ( ( rule__GSSModelFileImport__ImportURIAssignment_1 ) )
            // InternalIFACE.g:1006:2: ( rule__GSSModelFileImport__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getImportURIAssignment_1()); 
            }
            // InternalIFACE.g:1007:2: ( rule__GSSModelFileImport__ImportURIAssignment_1 )
            // InternalIFACE.g:1007:3: rule__GSSModelFileImport__ImportURIAssignment_1
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
    // InternalIFACE.g:1015:1: rule__GSSModelFileImport__Group__2 : rule__GSSModelFileImport__Group__2__Impl ;
    public final void rule__GSSModelFileImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1019:1: ( rule__GSSModelFileImport__Group__2__Impl )
            // InternalIFACE.g:1020:2: rule__GSSModelFileImport__Group__2__Impl
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
    // InternalIFACE.g:1026:1: rule__GSSModelFileImport__Group__2__Impl : ( ';' ) ;
    public final void rule__GSSModelFileImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1030:1: ( ( ';' ) )
            // InternalIFACE.g:1031:1: ( ';' )
            {
            // InternalIFACE.g:1031:1: ( ';' )
            // InternalIFACE.g:1032:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getSemicolonKeyword_2()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1042:1: rule__GSSIfacePortConfig__Group__0 : rule__GSSIfacePortConfig__Group__0__Impl rule__GSSIfacePortConfig__Group__1 ;
    public final void rule__GSSIfacePortConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1046:1: ( rule__GSSIfacePortConfig__Group__0__Impl rule__GSSIfacePortConfig__Group__1 )
            // InternalIFACE.g:1047:2: rule__GSSIfacePortConfig__Group__0__Impl rule__GSSIfacePortConfig__Group__1
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
    // InternalIFACE.g:1054:1: rule__GSSIfacePortConfig__Group__0__Impl : ( 'portConfig' ) ;
    public final void rule__GSSIfacePortConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1058:1: ( ( 'portConfig' ) )
            // InternalIFACE.g:1059:1: ( 'portConfig' )
            {
            // InternalIFACE.g:1059:1: ( 'portConfig' )
            // InternalIFACE.g:1060:2: 'portConfig'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getPortConfigKeyword_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1069:1: rule__GSSIfacePortConfig__Group__1 : rule__GSSIfacePortConfig__Group__1__Impl rule__GSSIfacePortConfig__Group__2 ;
    public final void rule__GSSIfacePortConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1073:1: ( rule__GSSIfacePortConfig__Group__1__Impl rule__GSSIfacePortConfig__Group__2 )
            // InternalIFACE.g:1074:2: rule__GSSIfacePortConfig__Group__1__Impl rule__GSSIfacePortConfig__Group__2
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
    // InternalIFACE.g:1081:1: rule__GSSIfacePortConfig__Group__1__Impl : ( ( rule__GSSIfacePortConfig__NameAssignment_1 ) ) ;
    public final void rule__GSSIfacePortConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1085:1: ( ( ( rule__GSSIfacePortConfig__NameAssignment_1 ) ) )
            // InternalIFACE.g:1086:1: ( ( rule__GSSIfacePortConfig__NameAssignment_1 ) )
            {
            // InternalIFACE.g:1086:1: ( ( rule__GSSIfacePortConfig__NameAssignment_1 ) )
            // InternalIFACE.g:1087:2: ( rule__GSSIfacePortConfig__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getNameAssignment_1()); 
            }
            // InternalIFACE.g:1088:2: ( rule__GSSIfacePortConfig__NameAssignment_1 )
            // InternalIFACE.g:1088:3: rule__GSSIfacePortConfig__NameAssignment_1
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
    // InternalIFACE.g:1096:1: rule__GSSIfacePortConfig__Group__2 : rule__GSSIfacePortConfig__Group__2__Impl rule__GSSIfacePortConfig__Group__3 ;
    public final void rule__GSSIfacePortConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1100:1: ( rule__GSSIfacePortConfig__Group__2__Impl rule__GSSIfacePortConfig__Group__3 )
            // InternalIFACE.g:1101:2: rule__GSSIfacePortConfig__Group__2__Impl rule__GSSIfacePortConfig__Group__3
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
    // InternalIFACE.g:1108:1: rule__GSSIfacePortConfig__Group__2__Impl : ( '{' ) ;
    public final void rule__GSSIfacePortConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1112:1: ( ( '{' ) )
            // InternalIFACE.g:1113:1: ( '{' )
            {
            // InternalIFACE.g:1113:1: ( '{' )
            // InternalIFACE.g:1114:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1123:1: rule__GSSIfacePortConfig__Group__3 : rule__GSSIfacePortConfig__Group__3__Impl rule__GSSIfacePortConfig__Group__4 ;
    public final void rule__GSSIfacePortConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1127:1: ( rule__GSSIfacePortConfig__Group__3__Impl rule__GSSIfacePortConfig__Group__4 )
            // InternalIFACE.g:1128:2: rule__GSSIfacePortConfig__Group__3__Impl rule__GSSIfacePortConfig__Group__4
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
    // InternalIFACE.g:1135:1: rule__GSSIfacePortConfig__Group__3__Impl : ( ( rule__GSSIfacePortConfig__UnorderedGroup_3 ) ) ;
    public final void rule__GSSIfacePortConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1139:1: ( ( ( rule__GSSIfacePortConfig__UnorderedGroup_3 ) ) )
            // InternalIFACE.g:1140:1: ( ( rule__GSSIfacePortConfig__UnorderedGroup_3 ) )
            {
            // InternalIFACE.g:1140:1: ( ( rule__GSSIfacePortConfig__UnorderedGroup_3 ) )
            // InternalIFACE.g:1141:2: ( rule__GSSIfacePortConfig__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3()); 
            }
            // InternalIFACE.g:1142:2: ( rule__GSSIfacePortConfig__UnorderedGroup_3 )
            // InternalIFACE.g:1142:3: rule__GSSIfacePortConfig__UnorderedGroup_3
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
    // InternalIFACE.g:1150:1: rule__GSSIfacePortConfig__Group__4 : rule__GSSIfacePortConfig__Group__4__Impl rule__GSSIfacePortConfig__Group__5 ;
    public final void rule__GSSIfacePortConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1154:1: ( rule__GSSIfacePortConfig__Group__4__Impl rule__GSSIfacePortConfig__Group__5 )
            // InternalIFACE.g:1155:2: rule__GSSIfacePortConfig__Group__4__Impl rule__GSSIfacePortConfig__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalIFACE.g:1162:1: rule__GSSIfacePortConfig__Group__4__Impl : ( '}' ) ;
    public final void rule__GSSIfacePortConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1166:1: ( ( '}' ) )
            // InternalIFACE.g:1167:1: ( '}' )
            {
            // InternalIFACE.g:1167:1: ( '}' )
            // InternalIFACE.g:1168:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortConfigAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
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
    // InternalIFACE.g:1177:1: rule__GSSIfacePortConfig__Group__5 : rule__GSSIfacePortConfig__Group__5__Impl ;
    public final void rule__GSSIfacePortConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1181:1: ( rule__GSSIfacePortConfig__Group__5__Impl )
            // InternalIFACE.g:1182:2: rule__GSSIfacePortConfig__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortConfig__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalIFACE.g:1188:1: rule__GSSIfacePortConfig__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfacePortConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1192:1: ( ( ';' ) )
            // InternalIFACE.g:1193:1: ( ';' )
            {
            // InternalIFACE.g:1193:1: ( ';' )
            // InternalIFACE.g:1194:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getSemicolonKeyword_5()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortConfigAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__GSSIfacePortConfig__Group_3_0__0"
    // InternalIFACE.g:1204:1: rule__GSSIfacePortConfig__Group_3_0__0 : rule__GSSIfacePortConfig__Group_3_0__0__Impl rule__GSSIfacePortConfig__Group_3_0__1 ;
    public final void rule__GSSIfacePortConfig__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1208:1: ( rule__GSSIfacePortConfig__Group_3_0__0__Impl rule__GSSIfacePortConfig__Group_3_0__1 )
            // InternalIFACE.g:1209:2: rule__GSSIfacePortConfig__Group_3_0__0__Impl rule__GSSIfacePortConfig__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
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
    // InternalIFACE.g:1216:1: rule__GSSIfacePortConfig__Group_3_0__0__Impl : ( 'uri' ) ;
    public final void rule__GSSIfacePortConfig__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1220:1: ( ( 'uri' ) )
            // InternalIFACE.g:1221:1: ( 'uri' )
            {
            // InternalIFACE.g:1221:1: ( 'uri' )
            // InternalIFACE.g:1222:2: 'uri'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getUriKeyword_3_0_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1231:1: rule__GSSIfacePortConfig__Group_3_0__1 : rule__GSSIfacePortConfig__Group_3_0__1__Impl rule__GSSIfacePortConfig__Group_3_0__2 ;
    public final void rule__GSSIfacePortConfig__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1235:1: ( rule__GSSIfacePortConfig__Group_3_0__1__Impl rule__GSSIfacePortConfig__Group_3_0__2 )
            // InternalIFACE.g:1236:2: rule__GSSIfacePortConfig__Group_3_0__1__Impl rule__GSSIfacePortConfig__Group_3_0__2
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
    // InternalIFACE.g:1243:1: rule__GSSIfacePortConfig__Group_3_0__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfacePortConfig__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1247:1: ( ( ':=' ) )
            // InternalIFACE.g:1248:1: ( ':=' )
            {
            // InternalIFACE.g:1248:1: ( ':=' )
            // InternalIFACE.g:1249:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getColonEqualsSignKeyword_3_0_1()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1258:1: rule__GSSIfacePortConfig__Group_3_0__2 : rule__GSSIfacePortConfig__Group_3_0__2__Impl rule__GSSIfacePortConfig__Group_3_0__3 ;
    public final void rule__GSSIfacePortConfig__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1262:1: ( rule__GSSIfacePortConfig__Group_3_0__2__Impl rule__GSSIfacePortConfig__Group_3_0__3 )
            // InternalIFACE.g:1263:2: rule__GSSIfacePortConfig__Group_3_0__2__Impl rule__GSSIfacePortConfig__Group_3_0__3
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
    // InternalIFACE.g:1270:1: rule__GSSIfacePortConfig__Group_3_0__2__Impl : ( ( rule__GSSIfacePortConfig__UriAssignment_3_0_2 ) ) ;
    public final void rule__GSSIfacePortConfig__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1274:1: ( ( ( rule__GSSIfacePortConfig__UriAssignment_3_0_2 ) ) )
            // InternalIFACE.g:1275:1: ( ( rule__GSSIfacePortConfig__UriAssignment_3_0_2 ) )
            {
            // InternalIFACE.g:1275:1: ( ( rule__GSSIfacePortConfig__UriAssignment_3_0_2 ) )
            // InternalIFACE.g:1276:2: ( rule__GSSIfacePortConfig__UriAssignment_3_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getUriAssignment_3_0_2()); 
            }
            // InternalIFACE.g:1277:2: ( rule__GSSIfacePortConfig__UriAssignment_3_0_2 )
            // InternalIFACE.g:1277:3: rule__GSSIfacePortConfig__UriAssignment_3_0_2
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
    // InternalIFACE.g:1285:1: rule__GSSIfacePortConfig__Group_3_0__3 : rule__GSSIfacePortConfig__Group_3_0__3__Impl ;
    public final void rule__GSSIfacePortConfig__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1289:1: ( rule__GSSIfacePortConfig__Group_3_0__3__Impl )
            // InternalIFACE.g:1290:2: rule__GSSIfacePortConfig__Group_3_0__3__Impl
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
    // InternalIFACE.g:1296:1: rule__GSSIfacePortConfig__Group_3_0__3__Impl : ( ';' ) ;
    public final void rule__GSSIfacePortConfig__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1300:1: ( ( ';' ) )
            // InternalIFACE.g:1301:1: ( ';' )
            {
            // InternalIFACE.g:1301:1: ( ';' )
            // InternalIFACE.g:1302:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getSemicolonKeyword_3_0_3()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1312:1: rule__GSSIfacePortConfig__Group_3_1__0 : rule__GSSIfacePortConfig__Group_3_1__0__Impl rule__GSSIfacePortConfig__Group_3_1__1 ;
    public final void rule__GSSIfacePortConfig__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1316:1: ( rule__GSSIfacePortConfig__Group_3_1__0__Impl rule__GSSIfacePortConfig__Group_3_1__1 )
            // InternalIFACE.g:1317:2: rule__GSSIfacePortConfig__Group_3_1__0__Impl rule__GSSIfacePortConfig__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
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
    // InternalIFACE.g:1324:1: rule__GSSIfacePortConfig__Group_3_1__0__Impl : ( 'version' ) ;
    public final void rule__GSSIfacePortConfig__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1328:1: ( ( 'version' ) )
            // InternalIFACE.g:1329:1: ( 'version' )
            {
            // InternalIFACE.g:1329:1: ( 'version' )
            // InternalIFACE.g:1330:2: 'version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getVersionKeyword_3_1_0()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1339:1: rule__GSSIfacePortConfig__Group_3_1__1 : rule__GSSIfacePortConfig__Group_3_1__1__Impl rule__GSSIfacePortConfig__Group_3_1__2 ;
    public final void rule__GSSIfacePortConfig__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1343:1: ( rule__GSSIfacePortConfig__Group_3_1__1__Impl rule__GSSIfacePortConfig__Group_3_1__2 )
            // InternalIFACE.g:1344:2: rule__GSSIfacePortConfig__Group_3_1__1__Impl rule__GSSIfacePortConfig__Group_3_1__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalIFACE.g:1351:1: rule__GSSIfacePortConfig__Group_3_1__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfacePortConfig__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1355:1: ( ( ':=' ) )
            // InternalIFACE.g:1356:1: ( ':=' )
            {
            // InternalIFACE.g:1356:1: ( ':=' )
            // InternalIFACE.g:1357:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getColonEqualsSignKeyword_3_1_1()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1366:1: rule__GSSIfacePortConfig__Group_3_1__2 : rule__GSSIfacePortConfig__Group_3_1__2__Impl rule__GSSIfacePortConfig__Group_3_1__3 ;
    public final void rule__GSSIfacePortConfig__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1370:1: ( rule__GSSIfacePortConfig__Group_3_1__2__Impl rule__GSSIfacePortConfig__Group_3_1__3 )
            // InternalIFACE.g:1371:2: rule__GSSIfacePortConfig__Group_3_1__2__Impl rule__GSSIfacePortConfig__Group_3_1__3
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
    // InternalIFACE.g:1378:1: rule__GSSIfacePortConfig__Group_3_1__2__Impl : ( ( rule__GSSIfacePortConfig__VersionAssignment_3_1_2 ) ) ;
    public final void rule__GSSIfacePortConfig__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1382:1: ( ( ( rule__GSSIfacePortConfig__VersionAssignment_3_1_2 ) ) )
            // InternalIFACE.g:1383:1: ( ( rule__GSSIfacePortConfig__VersionAssignment_3_1_2 ) )
            {
            // InternalIFACE.g:1383:1: ( ( rule__GSSIfacePortConfig__VersionAssignment_3_1_2 ) )
            // InternalIFACE.g:1384:2: ( rule__GSSIfacePortConfig__VersionAssignment_3_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getVersionAssignment_3_1_2()); 
            }
            // InternalIFACE.g:1385:2: ( rule__GSSIfacePortConfig__VersionAssignment_3_1_2 )
            // InternalIFACE.g:1385:3: rule__GSSIfacePortConfig__VersionAssignment_3_1_2
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
    // InternalIFACE.g:1393:1: rule__GSSIfacePortConfig__Group_3_1__3 : rule__GSSIfacePortConfig__Group_3_1__3__Impl ;
    public final void rule__GSSIfacePortConfig__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1397:1: ( rule__GSSIfacePortConfig__Group_3_1__3__Impl )
            // InternalIFACE.g:1398:2: rule__GSSIfacePortConfig__Group_3_1__3__Impl
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
    // InternalIFACE.g:1404:1: rule__GSSIfacePortConfig__Group_3_1__3__Impl : ( ';' ) ;
    public final void rule__GSSIfacePortConfig__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1408:1: ( ( ';' ) )
            // InternalIFACE.g:1409:1: ( ';' )
            {
            // InternalIFACE.g:1409:1: ( ';' )
            // InternalIFACE.g:1410:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getSemicolonKeyword_3_1_3()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1420:1: rule__GSSIfaceSpWPort__Group__0 : rule__GSSIfaceSpWPort__Group__0__Impl rule__GSSIfaceSpWPort__Group__1 ;
    public final void rule__GSSIfaceSpWPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1424:1: ( rule__GSSIfaceSpWPort__Group__0__Impl rule__GSSIfaceSpWPort__Group__1 )
            // InternalIFACE.g:1425:2: rule__GSSIfaceSpWPort__Group__0__Impl rule__GSSIfaceSpWPort__Group__1
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
    // InternalIFACE.g:1432:1: rule__GSSIfaceSpWPort__Group__0__Impl : ( 'spwPort' ) ;
    public final void rule__GSSIfaceSpWPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1436:1: ( ( 'spwPort' ) )
            // InternalIFACE.g:1437:1: ( 'spwPort' )
            {
            // InternalIFACE.g:1437:1: ( 'spwPort' )
            // InternalIFACE.g:1438:2: 'spwPort'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getSpwPortKeyword_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1447:1: rule__GSSIfaceSpWPort__Group__1 : rule__GSSIfaceSpWPort__Group__1__Impl rule__GSSIfaceSpWPort__Group__2 ;
    public final void rule__GSSIfaceSpWPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1451:1: ( rule__GSSIfaceSpWPort__Group__1__Impl rule__GSSIfaceSpWPort__Group__2 )
            // InternalIFACE.g:1452:2: rule__GSSIfaceSpWPort__Group__1__Impl rule__GSSIfaceSpWPort__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalIFACE.g:1459:1: rule__GSSIfaceSpWPort__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceSpWPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1463:1: ( ( '{' ) )
            // InternalIFACE.g:1464:1: ( '{' )
            {
            // InternalIFACE.g:1464:1: ( '{' )
            // InternalIFACE.g:1465:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1474:1: rule__GSSIfaceSpWPort__Group__2 : rule__GSSIfaceSpWPort__Group__2__Impl rule__GSSIfaceSpWPort__Group__3 ;
    public final void rule__GSSIfaceSpWPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1478:1: ( rule__GSSIfaceSpWPort__Group__2__Impl rule__GSSIfaceSpWPort__Group__3 )
            // InternalIFACE.g:1479:2: rule__GSSIfaceSpWPort__Group__2__Impl rule__GSSIfaceSpWPort__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
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
    // InternalIFACE.g:1486:1: rule__GSSIfaceSpWPort__Group__2__Impl : ( ( rule__GSSIfaceSpWPort__UnorderedGroup_2 ) ) ;
    public final void rule__GSSIfaceSpWPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1490:1: ( ( ( rule__GSSIfaceSpWPort__UnorderedGroup_2 ) ) )
            // InternalIFACE.g:1491:1: ( ( rule__GSSIfaceSpWPort__UnorderedGroup_2 ) )
            {
            // InternalIFACE.g:1491:1: ( ( rule__GSSIfaceSpWPort__UnorderedGroup_2 ) )
            // InternalIFACE.g:1492:2: ( rule__GSSIfaceSpWPort__UnorderedGroup_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2()); 
            }
            // InternalIFACE.g:1493:2: ( rule__GSSIfaceSpWPort__UnorderedGroup_2 )
            // InternalIFACE.g:1493:3: rule__GSSIfaceSpWPort__UnorderedGroup_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__UnorderedGroup_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2()); 
            }

            }


            }

        }
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
    // InternalIFACE.g:1501:1: rule__GSSIfaceSpWPort__Group__3 : rule__GSSIfaceSpWPort__Group__3__Impl rule__GSSIfaceSpWPort__Group__4 ;
    public final void rule__GSSIfaceSpWPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1505:1: ( rule__GSSIfaceSpWPort__Group__3__Impl rule__GSSIfaceSpWPort__Group__4 )
            // InternalIFACE.g:1506:2: rule__GSSIfaceSpWPort__Group__3__Impl rule__GSSIfaceSpWPort__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalIFACE.g:1513:1: rule__GSSIfaceSpWPort__Group__3__Impl : ( '}' ) ;
    public final void rule__GSSIfaceSpWPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1517:1: ( ( '}' ) )
            // InternalIFACE.g:1518:1: ( '}' )
            {
            // InternalIFACE.g:1518:1: ( '}' )
            // InternalIFACE.g:1519:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
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
    // InternalIFACE.g:1528:1: rule__GSSIfaceSpWPort__Group__4 : rule__GSSIfaceSpWPort__Group__4__Impl ;
    public final void rule__GSSIfaceSpWPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1532:1: ( rule__GSSIfaceSpWPort__Group__4__Impl )
            // InternalIFACE.g:1533:2: rule__GSSIfaceSpWPort__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalIFACE.g:1539:1: rule__GSSIfaceSpWPort__Group__4__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSpWPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1543:1: ( ( ';' ) )
            // InternalIFACE.g:1544:1: ( ';' )
            {
            // InternalIFACE.g:1544:1: ( ';' )
            // InternalIFACE.g:1545:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_4()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__GSSIfaceSpWPort__Group_2_0__0"
    // InternalIFACE.g:1555:1: rule__GSSIfaceSpWPort__Group_2_0__0 : rule__GSSIfaceSpWPort__Group_2_0__0__Impl rule__GSSIfaceSpWPort__Group_2_0__1 ;
    public final void rule__GSSIfaceSpWPort__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1559:1: ( rule__GSSIfaceSpWPort__Group_2_0__0__Impl rule__GSSIfaceSpWPort__Group_2_0__1 )
            // InternalIFACE.g:1560:2: rule__GSSIfaceSpWPort__Group_2_0__0__Impl rule__GSSIfaceSpWPort__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceSpWPort__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group_2_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group_2_0__0"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group_2_0__0__Impl"
    // InternalIFACE.g:1567:1: rule__GSSIfaceSpWPort__Group_2_0__0__Impl : ( 'type' ) ;
    public final void rule__GSSIfaceSpWPort__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1571:1: ( ( 'type' ) )
            // InternalIFACE.g:1572:1: ( 'type' )
            {
            // InternalIFACE.g:1572:1: ( 'type' )
            // InternalIFACE.g:1573:2: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getTypeKeyword_2_0_0()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getTypeKeyword_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group_2_0__0__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group_2_0__1"
    // InternalIFACE.g:1582:1: rule__GSSIfaceSpWPort__Group_2_0__1 : rule__GSSIfaceSpWPort__Group_2_0__1__Impl rule__GSSIfaceSpWPort__Group_2_0__2 ;
    public final void rule__GSSIfaceSpWPort__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1586:1: ( rule__GSSIfaceSpWPort__Group_2_0__1__Impl rule__GSSIfaceSpWPort__Group_2_0__2 )
            // InternalIFACE.g:1587:2: rule__GSSIfaceSpWPort__Group_2_0__1__Impl rule__GSSIfaceSpWPort__Group_2_0__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__GSSIfaceSpWPort__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group_2_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group_2_0__1"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group_2_0__1__Impl"
    // InternalIFACE.g:1594:1: rule__GSSIfaceSpWPort__Group_2_0__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSpWPort__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1598:1: ( ( ':=' ) )
            // InternalIFACE.g:1599:1: ( ':=' )
            {
            // InternalIFACE.g:1599:1: ( ':=' )
            // InternalIFACE.g:1600:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_2_0_1()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_2_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group_2_0__1__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group_2_0__2"
    // InternalIFACE.g:1609:1: rule__GSSIfaceSpWPort__Group_2_0__2 : rule__GSSIfaceSpWPort__Group_2_0__2__Impl rule__GSSIfaceSpWPort__Group_2_0__3 ;
    public final void rule__GSSIfaceSpWPort__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1613:1: ( rule__GSSIfaceSpWPort__Group_2_0__2__Impl rule__GSSIfaceSpWPort__Group_2_0__3 )
            // InternalIFACE.g:1614:2: rule__GSSIfaceSpWPort__Group_2_0__2__Impl rule__GSSIfaceSpWPort__Group_2_0__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSpWPort__Group_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group_2_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group_2_0__2"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group_2_0__2__Impl"
    // InternalIFACE.g:1621:1: rule__GSSIfaceSpWPort__Group_2_0__2__Impl : ( ( rule__GSSIfaceSpWPort__TypeAssignment_2_0_2 ) ) ;
    public final void rule__GSSIfaceSpWPort__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1625:1: ( ( ( rule__GSSIfaceSpWPort__TypeAssignment_2_0_2 ) ) )
            // InternalIFACE.g:1626:1: ( ( rule__GSSIfaceSpWPort__TypeAssignment_2_0_2 ) )
            {
            // InternalIFACE.g:1626:1: ( ( rule__GSSIfaceSpWPort__TypeAssignment_2_0_2 ) )
            // InternalIFACE.g:1627:2: ( rule__GSSIfaceSpWPort__TypeAssignment_2_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getTypeAssignment_2_0_2()); 
            }
            // InternalIFACE.g:1628:2: ( rule__GSSIfaceSpWPort__TypeAssignment_2_0_2 )
            // InternalIFACE.g:1628:3: rule__GSSIfaceSpWPort__TypeAssignment_2_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__TypeAssignment_2_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getTypeAssignment_2_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group_2_0__2__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group_2_0__3"
    // InternalIFACE.g:1636:1: rule__GSSIfaceSpWPort__Group_2_0__3 : rule__GSSIfaceSpWPort__Group_2_0__3__Impl ;
    public final void rule__GSSIfaceSpWPort__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1640:1: ( rule__GSSIfaceSpWPort__Group_2_0__3__Impl )
            // InternalIFACE.g:1641:2: rule__GSSIfaceSpWPort__Group_2_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group_2_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group_2_0__3"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group_2_0__3__Impl"
    // InternalIFACE.g:1647:1: rule__GSSIfaceSpWPort__Group_2_0__3__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSpWPort__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1651:1: ( ( ';' ) )
            // InternalIFACE.g:1652:1: ( ';' )
            {
            // InternalIFACE.g:1652:1: ( ';' )
            // InternalIFACE.g:1653:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_2_0_3()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_2_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group_2_0__3__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group_2_1__0"
    // InternalIFACE.g:1663:1: rule__GSSIfaceSpWPort__Group_2_1__0 : rule__GSSIfaceSpWPort__Group_2_1__0__Impl rule__GSSIfaceSpWPort__Group_2_1__1 ;
    public final void rule__GSSIfaceSpWPort__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1667:1: ( rule__GSSIfaceSpWPort__Group_2_1__0__Impl rule__GSSIfaceSpWPort__Group_2_1__1 )
            // InternalIFACE.g:1668:2: rule__GSSIfaceSpWPort__Group_2_1__0__Impl rule__GSSIfaceSpWPort__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceSpWPort__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group_2_1__0"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group_2_1__0__Impl"
    // InternalIFACE.g:1675:1: rule__GSSIfaceSpWPort__Group_2_1__0__Impl : ( 'link' ) ;
    public final void rule__GSSIfaceSpWPort__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1679:1: ( ( 'link' ) )
            // InternalIFACE.g:1680:1: ( 'link' )
            {
            // InternalIFACE.g:1680:1: ( 'link' )
            // InternalIFACE.g:1681:2: 'link'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getLinkKeyword_2_1_0()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getLinkKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group_2_1__0__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group_2_1__1"
    // InternalIFACE.g:1690:1: rule__GSSIfaceSpWPort__Group_2_1__1 : rule__GSSIfaceSpWPort__Group_2_1__1__Impl rule__GSSIfaceSpWPort__Group_2_1__2 ;
    public final void rule__GSSIfaceSpWPort__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1694:1: ( rule__GSSIfaceSpWPort__Group_2_1__1__Impl rule__GSSIfaceSpWPort__Group_2_1__2 )
            // InternalIFACE.g:1695:2: rule__GSSIfaceSpWPort__Group_2_1__1__Impl rule__GSSIfaceSpWPort__Group_2_1__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__GSSIfaceSpWPort__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group_2_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group_2_1__1"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group_2_1__1__Impl"
    // InternalIFACE.g:1702:1: rule__GSSIfaceSpWPort__Group_2_1__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSpWPort__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1706:1: ( ( ':=' ) )
            // InternalIFACE.g:1707:1: ( ':=' )
            {
            // InternalIFACE.g:1707:1: ( ':=' )
            // InternalIFACE.g:1708:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_2_1_1()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group_2_1__1__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group_2_1__2"
    // InternalIFACE.g:1717:1: rule__GSSIfaceSpWPort__Group_2_1__2 : rule__GSSIfaceSpWPort__Group_2_1__2__Impl rule__GSSIfaceSpWPort__Group_2_1__3 ;
    public final void rule__GSSIfaceSpWPort__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1721:1: ( rule__GSSIfaceSpWPort__Group_2_1__2__Impl rule__GSSIfaceSpWPort__Group_2_1__3 )
            // InternalIFACE.g:1722:2: rule__GSSIfaceSpWPort__Group_2_1__2__Impl rule__GSSIfaceSpWPort__Group_2_1__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSpWPort__Group_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group_2_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group_2_1__2"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group_2_1__2__Impl"
    // InternalIFACE.g:1729:1: rule__GSSIfaceSpWPort__Group_2_1__2__Impl : ( ( rule__GSSIfaceSpWPort__LinkAssignment_2_1_2 ) ) ;
    public final void rule__GSSIfaceSpWPort__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1733:1: ( ( ( rule__GSSIfaceSpWPort__LinkAssignment_2_1_2 ) ) )
            // InternalIFACE.g:1734:1: ( ( rule__GSSIfaceSpWPort__LinkAssignment_2_1_2 ) )
            {
            // InternalIFACE.g:1734:1: ( ( rule__GSSIfaceSpWPort__LinkAssignment_2_1_2 ) )
            // InternalIFACE.g:1735:2: ( rule__GSSIfaceSpWPort__LinkAssignment_2_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getLinkAssignment_2_1_2()); 
            }
            // InternalIFACE.g:1736:2: ( rule__GSSIfaceSpWPort__LinkAssignment_2_1_2 )
            // InternalIFACE.g:1736:3: rule__GSSIfaceSpWPort__LinkAssignment_2_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__LinkAssignment_2_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getLinkAssignment_2_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group_2_1__2__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group_2_1__3"
    // InternalIFACE.g:1744:1: rule__GSSIfaceSpWPort__Group_2_1__3 : rule__GSSIfaceSpWPort__Group_2_1__3__Impl ;
    public final void rule__GSSIfaceSpWPort__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1748:1: ( rule__GSSIfaceSpWPort__Group_2_1__3__Impl )
            // InternalIFACE.g:1749:2: rule__GSSIfaceSpWPort__Group_2_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group_2_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group_2_1__3"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group_2_1__3__Impl"
    // InternalIFACE.g:1755:1: rule__GSSIfaceSpWPort__Group_2_1__3__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSpWPort__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1759:1: ( ( ';' ) )
            // InternalIFACE.g:1760:1: ( ';' )
            {
            // InternalIFACE.g:1760:1: ( ';' )
            // InternalIFACE.g:1761:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_2_1_3()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_2_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group_2_1__3__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group_2_2__0"
    // InternalIFACE.g:1771:1: rule__GSSIfaceSpWPort__Group_2_2__0 : rule__GSSIfaceSpWPort__Group_2_2__0__Impl rule__GSSIfaceSpWPort__Group_2_2__1 ;
    public final void rule__GSSIfaceSpWPort__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1775:1: ( rule__GSSIfaceSpWPort__Group_2_2__0__Impl rule__GSSIfaceSpWPort__Group_2_2__1 )
            // InternalIFACE.g:1776:2: rule__GSSIfaceSpWPort__Group_2_2__0__Impl rule__GSSIfaceSpWPort__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceSpWPort__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group_2_2__0"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group_2_2__0__Impl"
    // InternalIFACE.g:1783:1: rule__GSSIfaceSpWPort__Group_2_2__0__Impl : ( 'writingPort' ) ;
    public final void rule__GSSIfaceSpWPort__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1787:1: ( ( 'writingPort' ) )
            // InternalIFACE.g:1788:1: ( 'writingPort' )
            {
            // InternalIFACE.g:1788:1: ( 'writingPort' )
            // InternalIFACE.g:1789:2: 'writingPort'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortKeyword_2_2_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortKeyword_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group_2_2__0__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group_2_2__1"
    // InternalIFACE.g:1798:1: rule__GSSIfaceSpWPort__Group_2_2__1 : rule__GSSIfaceSpWPort__Group_2_2__1__Impl rule__GSSIfaceSpWPort__Group_2_2__2 ;
    public final void rule__GSSIfaceSpWPort__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1802:1: ( rule__GSSIfaceSpWPort__Group_2_2__1__Impl rule__GSSIfaceSpWPort__Group_2_2__2 )
            // InternalIFACE.g:1803:2: rule__GSSIfaceSpWPort__Group_2_2__1__Impl rule__GSSIfaceSpWPort__Group_2_2__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__GSSIfaceSpWPort__Group_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group_2_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group_2_2__1"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group_2_2__1__Impl"
    // InternalIFACE.g:1810:1: rule__GSSIfaceSpWPort__Group_2_2__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSpWPort__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1814:1: ( ( ':=' ) )
            // InternalIFACE.g:1815:1: ( ':=' )
            {
            // InternalIFACE.g:1815:1: ( ':=' )
            // InternalIFACE.g:1816:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_2_2_1()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group_2_2__1__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group_2_2__2"
    // InternalIFACE.g:1825:1: rule__GSSIfaceSpWPort__Group_2_2__2 : rule__GSSIfaceSpWPort__Group_2_2__2__Impl rule__GSSIfaceSpWPort__Group_2_2__3 ;
    public final void rule__GSSIfaceSpWPort__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1829:1: ( rule__GSSIfaceSpWPort__Group_2_2__2__Impl rule__GSSIfaceSpWPort__Group_2_2__3 )
            // InternalIFACE.g:1830:2: rule__GSSIfaceSpWPort__Group_2_2__2__Impl rule__GSSIfaceSpWPort__Group_2_2__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSpWPort__Group_2_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group_2_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group_2_2__2"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group_2_2__2__Impl"
    // InternalIFACE.g:1837:1: rule__GSSIfaceSpWPort__Group_2_2__2__Impl : ( ( rule__GSSIfaceSpWPort__WritingPortAssignment_2_2_2 ) ) ;
    public final void rule__GSSIfaceSpWPort__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1841:1: ( ( ( rule__GSSIfaceSpWPort__WritingPortAssignment_2_2_2 ) ) )
            // InternalIFACE.g:1842:1: ( ( rule__GSSIfaceSpWPort__WritingPortAssignment_2_2_2 ) )
            {
            // InternalIFACE.g:1842:1: ( ( rule__GSSIfaceSpWPort__WritingPortAssignment_2_2_2 ) )
            // InternalIFACE.g:1843:2: ( rule__GSSIfaceSpWPort__WritingPortAssignment_2_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortAssignment_2_2_2()); 
            }
            // InternalIFACE.g:1844:2: ( rule__GSSIfaceSpWPort__WritingPortAssignment_2_2_2 )
            // InternalIFACE.g:1844:3: rule__GSSIfaceSpWPort__WritingPortAssignment_2_2_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__WritingPortAssignment_2_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortAssignment_2_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group_2_2__2__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group_2_2__3"
    // InternalIFACE.g:1852:1: rule__GSSIfaceSpWPort__Group_2_2__3 : rule__GSSIfaceSpWPort__Group_2_2__3__Impl ;
    public final void rule__GSSIfaceSpWPort__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1856:1: ( rule__GSSIfaceSpWPort__Group_2_2__3__Impl )
            // InternalIFACE.g:1857:2: rule__GSSIfaceSpWPort__Group_2_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__Group_2_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group_2_2__3"


    // $ANTLR start "rule__GSSIfaceSpWPort__Group_2_2__3__Impl"
    // InternalIFACE.g:1863:1: rule__GSSIfaceSpWPort__Group_2_2__3__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSpWPort__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1867:1: ( ( ';' ) )
            // InternalIFACE.g:1868:1: ( ';' )
            {
            // InternalIFACE.g:1868:1: ( ';' )
            // InternalIFACE.g:1869:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_2_2_3()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_2_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__Group_2_2__3__Impl"


    // $ANTLR start "rule__GSSIfaceReadingPort__Group__0"
    // InternalIFACE.g:1879:1: rule__GSSIfaceReadingPort__Group__0 : rule__GSSIfaceReadingPort__Group__0__Impl rule__GSSIfaceReadingPort__Group__1 ;
    public final void rule__GSSIfaceReadingPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1883:1: ( rule__GSSIfaceReadingPort__Group__0__Impl rule__GSSIfaceReadingPort__Group__1 )
            // InternalIFACE.g:1884:2: rule__GSSIfaceReadingPort__Group__0__Impl rule__GSSIfaceReadingPort__Group__1
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
    // InternalIFACE.g:1891:1: rule__GSSIfaceReadingPort__Group__0__Impl : ( 'readingPort' ) ;
    public final void rule__GSSIfaceReadingPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1895:1: ( ( 'readingPort' ) )
            // InternalIFACE.g:1896:1: ( 'readingPort' )
            {
            // InternalIFACE.g:1896:1: ( 'readingPort' )
            // InternalIFACE.g:1897:2: 'readingPort'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getReadingPortKeyword_0()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1906:1: rule__GSSIfaceReadingPort__Group__1 : rule__GSSIfaceReadingPort__Group__1__Impl rule__GSSIfaceReadingPort__Group__2 ;
    public final void rule__GSSIfaceReadingPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1910:1: ( rule__GSSIfaceReadingPort__Group__1__Impl rule__GSSIfaceReadingPort__Group__2 )
            // InternalIFACE.g:1911:2: rule__GSSIfaceReadingPort__Group__1__Impl rule__GSSIfaceReadingPort__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalIFACE.g:1918:1: rule__GSSIfaceReadingPort__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceReadingPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1922:1: ( ( '{' ) )
            // InternalIFACE.g:1923:1: ( '{' )
            {
            // InternalIFACE.g:1923:1: ( '{' )
            // InternalIFACE.g:1924:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1933:1: rule__GSSIfaceReadingPort__Group__2 : rule__GSSIfaceReadingPort__Group__2__Impl rule__GSSIfaceReadingPort__Group__3 ;
    public final void rule__GSSIfaceReadingPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1937:1: ( rule__GSSIfaceReadingPort__Group__2__Impl rule__GSSIfaceReadingPort__Group__3 )
            // InternalIFACE.g:1938:2: rule__GSSIfaceReadingPort__Group__2__Impl rule__GSSIfaceReadingPort__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
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
    // InternalIFACE.g:1945:1: rule__GSSIfaceReadingPort__Group__2__Impl : ( ( rule__GSSIfaceReadingPort__Group_2__0 ) ) ;
    public final void rule__GSSIfaceReadingPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1949:1: ( ( ( rule__GSSIfaceReadingPort__Group_2__0 ) ) )
            // InternalIFACE.g:1950:1: ( ( rule__GSSIfaceReadingPort__Group_2__0 ) )
            {
            // InternalIFACE.g:1950:1: ( ( rule__GSSIfaceReadingPort__Group_2__0 ) )
            // InternalIFACE.g:1951:2: ( rule__GSSIfaceReadingPort__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getGroup_2()); 
            }
            // InternalIFACE.g:1952:2: ( rule__GSSIfaceReadingPort__Group_2__0 )
            // InternalIFACE.g:1952:3: rule__GSSIfaceReadingPort__Group_2__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceReadingPort__Group_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceReadingPortAccess().getGroup_2()); 
            }

            }


            }

        }
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
    // InternalIFACE.g:1960:1: rule__GSSIfaceReadingPort__Group__3 : rule__GSSIfaceReadingPort__Group__3__Impl rule__GSSIfaceReadingPort__Group__4 ;
    public final void rule__GSSIfaceReadingPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1964:1: ( rule__GSSIfaceReadingPort__Group__3__Impl rule__GSSIfaceReadingPort__Group__4 )
            // InternalIFACE.g:1965:2: rule__GSSIfaceReadingPort__Group__3__Impl rule__GSSIfaceReadingPort__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalIFACE.g:1972:1: rule__GSSIfaceReadingPort__Group__3__Impl : ( '}' ) ;
    public final void rule__GSSIfaceReadingPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1976:1: ( ( '}' ) )
            // InternalIFACE.g:1977:1: ( '}' )
            {
            // InternalIFACE.g:1977:1: ( '}' )
            // InternalIFACE.g:1978:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceReadingPortAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
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
    // InternalIFACE.g:1987:1: rule__GSSIfaceReadingPort__Group__4 : rule__GSSIfaceReadingPort__Group__4__Impl ;
    public final void rule__GSSIfaceReadingPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1991:1: ( rule__GSSIfaceReadingPort__Group__4__Impl )
            // InternalIFACE.g:1992:2: rule__GSSIfaceReadingPort__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceReadingPort__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalIFACE.g:1998:1: rule__GSSIfaceReadingPort__Group__4__Impl : ( ';' ) ;
    public final void rule__GSSIfaceReadingPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2002:1: ( ( ';' ) )
            // InternalIFACE.g:2003:1: ( ';' )
            {
            // InternalIFACE.g:2003:1: ( ';' )
            // InternalIFACE.g:2004:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getSemicolonKeyword_4()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceReadingPortAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__GSSIfaceReadingPort__Group_2__0"
    // InternalIFACE.g:2014:1: rule__GSSIfaceReadingPort__Group_2__0 : rule__GSSIfaceReadingPort__Group_2__0__Impl rule__GSSIfaceReadingPort__Group_2__1 ;
    public final void rule__GSSIfaceReadingPort__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2018:1: ( rule__GSSIfaceReadingPort__Group_2__0__Impl rule__GSSIfaceReadingPort__Group_2__1 )
            // InternalIFACE.g:2019:2: rule__GSSIfaceReadingPort__Group_2__0__Impl rule__GSSIfaceReadingPort__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceReadingPort__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceReadingPort__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceReadingPort__Group_2__0"


    // $ANTLR start "rule__GSSIfaceReadingPort__Group_2__0__Impl"
    // InternalIFACE.g:2026:1: rule__GSSIfaceReadingPort__Group_2__0__Impl : ( 'port' ) ;
    public final void rule__GSSIfaceReadingPort__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2030:1: ( ( 'port' ) )
            // InternalIFACE.g:2031:1: ( 'port' )
            {
            // InternalIFACE.g:2031:1: ( 'port' )
            // InternalIFACE.g:2032:2: 'port'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getPortKeyword_2_0()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceReadingPortAccess().getPortKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceReadingPort__Group_2__0__Impl"


    // $ANTLR start "rule__GSSIfaceReadingPort__Group_2__1"
    // InternalIFACE.g:2041:1: rule__GSSIfaceReadingPort__Group_2__1 : rule__GSSIfaceReadingPort__Group_2__1__Impl rule__GSSIfaceReadingPort__Group_2__2 ;
    public final void rule__GSSIfaceReadingPort__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2045:1: ( rule__GSSIfaceReadingPort__Group_2__1__Impl rule__GSSIfaceReadingPort__Group_2__2 )
            // InternalIFACE.g:2046:2: rule__GSSIfaceReadingPort__Group_2__1__Impl rule__GSSIfaceReadingPort__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__GSSIfaceReadingPort__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceReadingPort__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceReadingPort__Group_2__1"


    // $ANTLR start "rule__GSSIfaceReadingPort__Group_2__1__Impl"
    // InternalIFACE.g:2053:1: rule__GSSIfaceReadingPort__Group_2__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceReadingPort__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2057:1: ( ( ':=' ) )
            // InternalIFACE.g:2058:1: ( ':=' )
            {
            // InternalIFACE.g:2058:1: ( ':=' )
            // InternalIFACE.g:2059:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getColonEqualsSignKeyword_2_1()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceReadingPortAccess().getColonEqualsSignKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceReadingPort__Group_2__1__Impl"


    // $ANTLR start "rule__GSSIfaceReadingPort__Group_2__2"
    // InternalIFACE.g:2068:1: rule__GSSIfaceReadingPort__Group_2__2 : rule__GSSIfaceReadingPort__Group_2__2__Impl rule__GSSIfaceReadingPort__Group_2__3 ;
    public final void rule__GSSIfaceReadingPort__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2072:1: ( rule__GSSIfaceReadingPort__Group_2__2__Impl rule__GSSIfaceReadingPort__Group_2__3 )
            // InternalIFACE.g:2073:2: rule__GSSIfaceReadingPort__Group_2__2__Impl rule__GSSIfaceReadingPort__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceReadingPort__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceReadingPort__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceReadingPort__Group_2__2"


    // $ANTLR start "rule__GSSIfaceReadingPort__Group_2__2__Impl"
    // InternalIFACE.g:2080:1: rule__GSSIfaceReadingPort__Group_2__2__Impl : ( ( rule__GSSIfaceReadingPort__PortAssignment_2_2 ) ) ;
    public final void rule__GSSIfaceReadingPort__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2084:1: ( ( ( rule__GSSIfaceReadingPort__PortAssignment_2_2 ) ) )
            // InternalIFACE.g:2085:1: ( ( rule__GSSIfaceReadingPort__PortAssignment_2_2 ) )
            {
            // InternalIFACE.g:2085:1: ( ( rule__GSSIfaceReadingPort__PortAssignment_2_2 ) )
            // InternalIFACE.g:2086:2: ( rule__GSSIfaceReadingPort__PortAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getPortAssignment_2_2()); 
            }
            // InternalIFACE.g:2087:2: ( rule__GSSIfaceReadingPort__PortAssignment_2_2 )
            // InternalIFACE.g:2087:3: rule__GSSIfaceReadingPort__PortAssignment_2_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceReadingPort__PortAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceReadingPortAccess().getPortAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceReadingPort__Group_2__2__Impl"


    // $ANTLR start "rule__GSSIfaceReadingPort__Group_2__3"
    // InternalIFACE.g:2095:1: rule__GSSIfaceReadingPort__Group_2__3 : rule__GSSIfaceReadingPort__Group_2__3__Impl ;
    public final void rule__GSSIfaceReadingPort__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2099:1: ( rule__GSSIfaceReadingPort__Group_2__3__Impl )
            // InternalIFACE.g:2100:2: rule__GSSIfaceReadingPort__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceReadingPort__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceReadingPort__Group_2__3"


    // $ANTLR start "rule__GSSIfaceReadingPort__Group_2__3__Impl"
    // InternalIFACE.g:2106:1: rule__GSSIfaceReadingPort__Group_2__3__Impl : ( ';' ) ;
    public final void rule__GSSIfaceReadingPort__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2110:1: ( ( ';' ) )
            // InternalIFACE.g:2111:1: ( ';' )
            {
            // InternalIFACE.g:2111:1: ( ';' )
            // InternalIFACE.g:2112:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getSemicolonKeyword_2_3()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceReadingPortAccess().getSemicolonKeyword_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceReadingPort__Group_2__3__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__0"
    // InternalIFACE.g:2122:1: rule__GSSIfaceUartPort__Group__0 : rule__GSSIfaceUartPort__Group__0__Impl rule__GSSIfaceUartPort__Group__1 ;
    public final void rule__GSSIfaceUartPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2126:1: ( rule__GSSIfaceUartPort__Group__0__Impl rule__GSSIfaceUartPort__Group__1 )
            // InternalIFACE.g:2127:2: rule__GSSIfaceUartPort__Group__0__Impl rule__GSSIfaceUartPort__Group__1
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
    // InternalIFACE.g:2134:1: rule__GSSIfaceUartPort__Group__0__Impl : ( 'uartPort' ) ;
    public final void rule__GSSIfaceUartPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2138:1: ( ( 'uartPort' ) )
            // InternalIFACE.g:2139:1: ( 'uartPort' )
            {
            // InternalIFACE.g:2139:1: ( 'uartPort' )
            // InternalIFACE.g:2140:2: 'uartPort'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getUartPortKeyword_0()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:2149:1: rule__GSSIfaceUartPort__Group__1 : rule__GSSIfaceUartPort__Group__1__Impl rule__GSSIfaceUartPort__Group__2 ;
    public final void rule__GSSIfaceUartPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2153:1: ( rule__GSSIfaceUartPort__Group__1__Impl rule__GSSIfaceUartPort__Group__2 )
            // InternalIFACE.g:2154:2: rule__GSSIfaceUartPort__Group__1__Impl rule__GSSIfaceUartPort__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalIFACE.g:2161:1: rule__GSSIfaceUartPort__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceUartPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2165:1: ( ( '{' ) )
            // InternalIFACE.g:2166:1: ( '{' )
            {
            // InternalIFACE.g:2166:1: ( '{' )
            // InternalIFACE.g:2167:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:2176:1: rule__GSSIfaceUartPort__Group__2 : rule__GSSIfaceUartPort__Group__2__Impl rule__GSSIfaceUartPort__Group__3 ;
    public final void rule__GSSIfaceUartPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2180:1: ( rule__GSSIfaceUartPort__Group__2__Impl rule__GSSIfaceUartPort__Group__3 )
            // InternalIFACE.g:2181:2: rule__GSSIfaceUartPort__Group__2__Impl rule__GSSIfaceUartPort__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
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
    // InternalIFACE.g:2188:1: rule__GSSIfaceUartPort__Group__2__Impl : ( ( rule__GSSIfaceUartPort__UnorderedGroup_2 ) ) ;
    public final void rule__GSSIfaceUartPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2192:1: ( ( ( rule__GSSIfaceUartPort__UnorderedGroup_2 ) ) )
            // InternalIFACE.g:2193:1: ( ( rule__GSSIfaceUartPort__UnorderedGroup_2 ) )
            {
            // InternalIFACE.g:2193:1: ( ( rule__GSSIfaceUartPort__UnorderedGroup_2 ) )
            // InternalIFACE.g:2194:2: ( rule__GSSIfaceUartPort__UnorderedGroup_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2()); 
            }
            // InternalIFACE.g:2195:2: ( rule__GSSIfaceUartPort__UnorderedGroup_2 )
            // InternalIFACE.g:2195:3: rule__GSSIfaceUartPort__UnorderedGroup_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__UnorderedGroup_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2()); 
            }

            }


            }

        }
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
    // InternalIFACE.g:2203:1: rule__GSSIfaceUartPort__Group__3 : rule__GSSIfaceUartPort__Group__3__Impl rule__GSSIfaceUartPort__Group__4 ;
    public final void rule__GSSIfaceUartPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2207:1: ( rule__GSSIfaceUartPort__Group__3__Impl rule__GSSIfaceUartPort__Group__4 )
            // InternalIFACE.g:2208:2: rule__GSSIfaceUartPort__Group__3__Impl rule__GSSIfaceUartPort__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalIFACE.g:2215:1: rule__GSSIfaceUartPort__Group__3__Impl : ( '}' ) ;
    public final void rule__GSSIfaceUartPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2219:1: ( ( '}' ) )
            // InternalIFACE.g:2220:1: ( '}' )
            {
            // InternalIFACE.g:2220:1: ( '}' )
            // InternalIFACE.g:2221:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
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
    // InternalIFACE.g:2230:1: rule__GSSIfaceUartPort__Group__4 : rule__GSSIfaceUartPort__Group__4__Impl ;
    public final void rule__GSSIfaceUartPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2234:1: ( rule__GSSIfaceUartPort__Group__4__Impl )
            // InternalIFACE.g:2235:2: rule__GSSIfaceUartPort__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalIFACE.g:2241:1: rule__GSSIfaceUartPort__Group__4__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2245:1: ( ( ';' ) )
            // InternalIFACE.g:2246:1: ( ';' )
            {
            // InternalIFACE.g:2246:1: ( ';' )
            // InternalIFACE.g:2247:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_4()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_0__0"
    // InternalIFACE.g:2257:1: rule__GSSIfaceUartPort__Group_2_0__0 : rule__GSSIfaceUartPort__Group_2_0__0__Impl rule__GSSIfaceUartPort__Group_2_0__1 ;
    public final void rule__GSSIfaceUartPort__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2261:1: ( rule__GSSIfaceUartPort__Group_2_0__0__Impl rule__GSSIfaceUartPort__Group_2_0__1 )
            // InternalIFACE.g:2262:2: rule__GSSIfaceUartPort__Group_2_0__0__Impl rule__GSSIfaceUartPort__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceUartPort__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_0__0"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_0__0__Impl"
    // InternalIFACE.g:2269:1: rule__GSSIfaceUartPort__Group_2_0__0__Impl : ( 'number' ) ;
    public final void rule__GSSIfaceUartPort__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2273:1: ( ( 'number' ) )
            // InternalIFACE.g:2274:1: ( 'number' )
            {
            // InternalIFACE.g:2274:1: ( 'number' )
            // InternalIFACE.g:2275:2: 'number'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getNumberKeyword_2_0_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getNumberKeyword_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_0__0__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_0__1"
    // InternalIFACE.g:2284:1: rule__GSSIfaceUartPort__Group_2_0__1 : rule__GSSIfaceUartPort__Group_2_0__1__Impl rule__GSSIfaceUartPort__Group_2_0__2 ;
    public final void rule__GSSIfaceUartPort__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2288:1: ( rule__GSSIfaceUartPort__Group_2_0__1__Impl rule__GSSIfaceUartPort__Group_2_0__2 )
            // InternalIFACE.g:2289:2: rule__GSSIfaceUartPort__Group_2_0__1__Impl rule__GSSIfaceUartPort__Group_2_0__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__GSSIfaceUartPort__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_0__1"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_0__1__Impl"
    // InternalIFACE.g:2296:1: rule__GSSIfaceUartPort__Group_2_0__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartPort__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2300:1: ( ( ':=' ) )
            // InternalIFACE.g:2301:1: ( ':=' )
            {
            // InternalIFACE.g:2301:1: ( ':=' )
            // InternalIFACE.g:2302:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_0_1()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_0__1__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_0__2"
    // InternalIFACE.g:2311:1: rule__GSSIfaceUartPort__Group_2_0__2 : rule__GSSIfaceUartPort__Group_2_0__2__Impl rule__GSSIfaceUartPort__Group_2_0__3 ;
    public final void rule__GSSIfaceUartPort__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2315:1: ( rule__GSSIfaceUartPort__Group_2_0__2__Impl rule__GSSIfaceUartPort__Group_2_0__3 )
            // InternalIFACE.g:2316:2: rule__GSSIfaceUartPort__Group_2_0__2__Impl rule__GSSIfaceUartPort__Group_2_0__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceUartPort__Group_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_0__2"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_0__2__Impl"
    // InternalIFACE.g:2323:1: rule__GSSIfaceUartPort__Group_2_0__2__Impl : ( ( rule__GSSIfaceUartPort__NumberAssignment_2_0_2 ) ) ;
    public final void rule__GSSIfaceUartPort__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2327:1: ( ( ( rule__GSSIfaceUartPort__NumberAssignment_2_0_2 ) ) )
            // InternalIFACE.g:2328:1: ( ( rule__GSSIfaceUartPort__NumberAssignment_2_0_2 ) )
            {
            // InternalIFACE.g:2328:1: ( ( rule__GSSIfaceUartPort__NumberAssignment_2_0_2 ) )
            // InternalIFACE.g:2329:2: ( rule__GSSIfaceUartPort__NumberAssignment_2_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getNumberAssignment_2_0_2()); 
            }
            // InternalIFACE.g:2330:2: ( rule__GSSIfaceUartPort__NumberAssignment_2_0_2 )
            // InternalIFACE.g:2330:3: rule__GSSIfaceUartPort__NumberAssignment_2_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__NumberAssignment_2_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getNumberAssignment_2_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_0__2__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_0__3"
    // InternalIFACE.g:2338:1: rule__GSSIfaceUartPort__Group_2_0__3 : rule__GSSIfaceUartPort__Group_2_0__3__Impl ;
    public final void rule__GSSIfaceUartPort__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2342:1: ( rule__GSSIfaceUartPort__Group_2_0__3__Impl )
            // InternalIFACE.g:2343:2: rule__GSSIfaceUartPort__Group_2_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_0__3"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_0__3__Impl"
    // InternalIFACE.g:2349:1: rule__GSSIfaceUartPort__Group_2_0__3__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2353:1: ( ( ';' ) )
            // InternalIFACE.g:2354:1: ( ';' )
            {
            // InternalIFACE.g:2354:1: ( ';' )
            // InternalIFACE.g:2355:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_0_3()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_0__3__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_1__0"
    // InternalIFACE.g:2365:1: rule__GSSIfaceUartPort__Group_2_1__0 : rule__GSSIfaceUartPort__Group_2_1__0__Impl rule__GSSIfaceUartPort__Group_2_1__1 ;
    public final void rule__GSSIfaceUartPort__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2369:1: ( rule__GSSIfaceUartPort__Group_2_1__0__Impl rule__GSSIfaceUartPort__Group_2_1__1 )
            // InternalIFACE.g:2370:2: rule__GSSIfaceUartPort__Group_2_1__0__Impl rule__GSSIfaceUartPort__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceUartPort__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_1__0"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_1__0__Impl"
    // InternalIFACE.g:2377:1: rule__GSSIfaceUartPort__Group_2_1__0__Impl : ( 'baudRate' ) ;
    public final void rule__GSSIfaceUartPort__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2381:1: ( ( 'baudRate' ) )
            // InternalIFACE.g:2382:1: ( 'baudRate' )
            {
            // InternalIFACE.g:2382:1: ( 'baudRate' )
            // InternalIFACE.g:2383:2: 'baudRate'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateKeyword_2_1_0()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_1__0__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_1__1"
    // InternalIFACE.g:2392:1: rule__GSSIfaceUartPort__Group_2_1__1 : rule__GSSIfaceUartPort__Group_2_1__1__Impl rule__GSSIfaceUartPort__Group_2_1__2 ;
    public final void rule__GSSIfaceUartPort__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2396:1: ( rule__GSSIfaceUartPort__Group_2_1__1__Impl rule__GSSIfaceUartPort__Group_2_1__2 )
            // InternalIFACE.g:2397:2: rule__GSSIfaceUartPort__Group_2_1__1__Impl rule__GSSIfaceUartPort__Group_2_1__2
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__GSSIfaceUartPort__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_1__1"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_1__1__Impl"
    // InternalIFACE.g:2404:1: rule__GSSIfaceUartPort__Group_2_1__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartPort__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2408:1: ( ( ':=' ) )
            // InternalIFACE.g:2409:1: ( ':=' )
            {
            // InternalIFACE.g:2409:1: ( ':=' )
            // InternalIFACE.g:2410:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_1_1()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_1__1__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_1__2"
    // InternalIFACE.g:2419:1: rule__GSSIfaceUartPort__Group_2_1__2 : rule__GSSIfaceUartPort__Group_2_1__2__Impl rule__GSSIfaceUartPort__Group_2_1__3 ;
    public final void rule__GSSIfaceUartPort__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2423:1: ( rule__GSSIfaceUartPort__Group_2_1__2__Impl rule__GSSIfaceUartPort__Group_2_1__3 )
            // InternalIFACE.g:2424:2: rule__GSSIfaceUartPort__Group_2_1__2__Impl rule__GSSIfaceUartPort__Group_2_1__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceUartPort__Group_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_1__2"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_1__2__Impl"
    // InternalIFACE.g:2431:1: rule__GSSIfaceUartPort__Group_2_1__2__Impl : ( ( rule__GSSIfaceUartPort__BaudRateAssignment_2_1_2 ) ) ;
    public final void rule__GSSIfaceUartPort__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2435:1: ( ( ( rule__GSSIfaceUartPort__BaudRateAssignment_2_1_2 ) ) )
            // InternalIFACE.g:2436:1: ( ( rule__GSSIfaceUartPort__BaudRateAssignment_2_1_2 ) )
            {
            // InternalIFACE.g:2436:1: ( ( rule__GSSIfaceUartPort__BaudRateAssignment_2_1_2 ) )
            // InternalIFACE.g:2437:2: ( rule__GSSIfaceUartPort__BaudRateAssignment_2_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateAssignment_2_1_2()); 
            }
            // InternalIFACE.g:2438:2: ( rule__GSSIfaceUartPort__BaudRateAssignment_2_1_2 )
            // InternalIFACE.g:2438:3: rule__GSSIfaceUartPort__BaudRateAssignment_2_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__BaudRateAssignment_2_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateAssignment_2_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_1__2__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_1__3"
    // InternalIFACE.g:2446:1: rule__GSSIfaceUartPort__Group_2_1__3 : rule__GSSIfaceUartPort__Group_2_1__3__Impl ;
    public final void rule__GSSIfaceUartPort__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2450:1: ( rule__GSSIfaceUartPort__Group_2_1__3__Impl )
            // InternalIFACE.g:2451:2: rule__GSSIfaceUartPort__Group_2_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_1__3"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_1__3__Impl"
    // InternalIFACE.g:2457:1: rule__GSSIfaceUartPort__Group_2_1__3__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2461:1: ( ( ';' ) )
            // InternalIFACE.g:2462:1: ( ';' )
            {
            // InternalIFACE.g:2462:1: ( ';' )
            // InternalIFACE.g:2463:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_1_3()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_1__3__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_2__0"
    // InternalIFACE.g:2473:1: rule__GSSIfaceUartPort__Group_2_2__0 : rule__GSSIfaceUartPort__Group_2_2__0__Impl rule__GSSIfaceUartPort__Group_2_2__1 ;
    public final void rule__GSSIfaceUartPort__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2477:1: ( rule__GSSIfaceUartPort__Group_2_2__0__Impl rule__GSSIfaceUartPort__Group_2_2__1 )
            // InternalIFACE.g:2478:2: rule__GSSIfaceUartPort__Group_2_2__0__Impl rule__GSSIfaceUartPort__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceUartPort__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_2__0"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_2__0__Impl"
    // InternalIFACE.g:2485:1: rule__GSSIfaceUartPort__Group_2_2__0__Impl : ( 'parity' ) ;
    public final void rule__GSSIfaceUartPort__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2489:1: ( ( 'parity' ) )
            // InternalIFACE.g:2490:1: ( 'parity' )
            {
            // InternalIFACE.g:2490:1: ( 'parity' )
            // InternalIFACE.g:2491:2: 'parity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getParityKeyword_2_2_0()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getParityKeyword_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_2__0__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_2__1"
    // InternalIFACE.g:2500:1: rule__GSSIfaceUartPort__Group_2_2__1 : rule__GSSIfaceUartPort__Group_2_2__1__Impl rule__GSSIfaceUartPort__Group_2_2__2 ;
    public final void rule__GSSIfaceUartPort__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2504:1: ( rule__GSSIfaceUartPort__Group_2_2__1__Impl rule__GSSIfaceUartPort__Group_2_2__2 )
            // InternalIFACE.g:2505:2: rule__GSSIfaceUartPort__Group_2_2__1__Impl rule__GSSIfaceUartPort__Group_2_2__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__GSSIfaceUartPort__Group_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_2__1"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_2__1__Impl"
    // InternalIFACE.g:2512:1: rule__GSSIfaceUartPort__Group_2_2__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartPort__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2516:1: ( ( ':=' ) )
            // InternalIFACE.g:2517:1: ( ':=' )
            {
            // InternalIFACE.g:2517:1: ( ':=' )
            // InternalIFACE.g:2518:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_2_1()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_2__1__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_2__2"
    // InternalIFACE.g:2527:1: rule__GSSIfaceUartPort__Group_2_2__2 : rule__GSSIfaceUartPort__Group_2_2__2__Impl rule__GSSIfaceUartPort__Group_2_2__3 ;
    public final void rule__GSSIfaceUartPort__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2531:1: ( rule__GSSIfaceUartPort__Group_2_2__2__Impl rule__GSSIfaceUartPort__Group_2_2__3 )
            // InternalIFACE.g:2532:2: rule__GSSIfaceUartPort__Group_2_2__2__Impl rule__GSSIfaceUartPort__Group_2_2__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceUartPort__Group_2_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_2__2"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_2__2__Impl"
    // InternalIFACE.g:2539:1: rule__GSSIfaceUartPort__Group_2_2__2__Impl : ( ( rule__GSSIfaceUartPort__ParityAssignment_2_2_2 ) ) ;
    public final void rule__GSSIfaceUartPort__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2543:1: ( ( ( rule__GSSIfaceUartPort__ParityAssignment_2_2_2 ) ) )
            // InternalIFACE.g:2544:1: ( ( rule__GSSIfaceUartPort__ParityAssignment_2_2_2 ) )
            {
            // InternalIFACE.g:2544:1: ( ( rule__GSSIfaceUartPort__ParityAssignment_2_2_2 ) )
            // InternalIFACE.g:2545:2: ( rule__GSSIfaceUartPort__ParityAssignment_2_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getParityAssignment_2_2_2()); 
            }
            // InternalIFACE.g:2546:2: ( rule__GSSIfaceUartPort__ParityAssignment_2_2_2 )
            // InternalIFACE.g:2546:3: rule__GSSIfaceUartPort__ParityAssignment_2_2_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__ParityAssignment_2_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getParityAssignment_2_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_2__2__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_2__3"
    // InternalIFACE.g:2554:1: rule__GSSIfaceUartPort__Group_2_2__3 : rule__GSSIfaceUartPort__Group_2_2__3__Impl ;
    public final void rule__GSSIfaceUartPort__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2558:1: ( rule__GSSIfaceUartPort__Group_2_2__3__Impl )
            // InternalIFACE.g:2559:2: rule__GSSIfaceUartPort__Group_2_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_2__3"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_2__3__Impl"
    // InternalIFACE.g:2565:1: rule__GSSIfaceUartPort__Group_2_2__3__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2569:1: ( ( ';' ) )
            // InternalIFACE.g:2570:1: ( ';' )
            {
            // InternalIFACE.g:2570:1: ( ';' )
            // InternalIFACE.g:2571:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_2_3()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_2__3__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_3__0"
    // InternalIFACE.g:2581:1: rule__GSSIfaceUartPort__Group_2_3__0 : rule__GSSIfaceUartPort__Group_2_3__0__Impl rule__GSSIfaceUartPort__Group_2_3__1 ;
    public final void rule__GSSIfaceUartPort__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2585:1: ( rule__GSSIfaceUartPort__Group_2_3__0__Impl rule__GSSIfaceUartPort__Group_2_3__1 )
            // InternalIFACE.g:2586:2: rule__GSSIfaceUartPort__Group_2_3__0__Impl rule__GSSIfaceUartPort__Group_2_3__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceUartPort__Group_2_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_3__0"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_3__0__Impl"
    // InternalIFACE.g:2593:1: rule__GSSIfaceUartPort__Group_2_3__0__Impl : ( 'dataBits' ) ;
    public final void rule__GSSIfaceUartPort__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2597:1: ( ( 'dataBits' ) )
            // InternalIFACE.g:2598:1: ( 'dataBits' )
            {
            // InternalIFACE.g:2598:1: ( 'dataBits' )
            // InternalIFACE.g:2599:2: 'dataBits'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsKeyword_2_3_0()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsKeyword_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_3__0__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_3__1"
    // InternalIFACE.g:2608:1: rule__GSSIfaceUartPort__Group_2_3__1 : rule__GSSIfaceUartPort__Group_2_3__1__Impl rule__GSSIfaceUartPort__Group_2_3__2 ;
    public final void rule__GSSIfaceUartPort__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2612:1: ( rule__GSSIfaceUartPort__Group_2_3__1__Impl rule__GSSIfaceUartPort__Group_2_3__2 )
            // InternalIFACE.g:2613:2: rule__GSSIfaceUartPort__Group_2_3__1__Impl rule__GSSIfaceUartPort__Group_2_3__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__GSSIfaceUartPort__Group_2_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_3__1"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_3__1__Impl"
    // InternalIFACE.g:2620:1: rule__GSSIfaceUartPort__Group_2_3__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartPort__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2624:1: ( ( ':=' ) )
            // InternalIFACE.g:2625:1: ( ':=' )
            {
            // InternalIFACE.g:2625:1: ( ':=' )
            // InternalIFACE.g:2626:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_3_1()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_3__1__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_3__2"
    // InternalIFACE.g:2635:1: rule__GSSIfaceUartPort__Group_2_3__2 : rule__GSSIfaceUartPort__Group_2_3__2__Impl rule__GSSIfaceUartPort__Group_2_3__3 ;
    public final void rule__GSSIfaceUartPort__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2639:1: ( rule__GSSIfaceUartPort__Group_2_3__2__Impl rule__GSSIfaceUartPort__Group_2_3__3 )
            // InternalIFACE.g:2640:2: rule__GSSIfaceUartPort__Group_2_3__2__Impl rule__GSSIfaceUartPort__Group_2_3__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceUartPort__Group_2_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_3__2"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_3__2__Impl"
    // InternalIFACE.g:2647:1: rule__GSSIfaceUartPort__Group_2_3__2__Impl : ( ( rule__GSSIfaceUartPort__DataBitsAssignment_2_3_2 ) ) ;
    public final void rule__GSSIfaceUartPort__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2651:1: ( ( ( rule__GSSIfaceUartPort__DataBitsAssignment_2_3_2 ) ) )
            // InternalIFACE.g:2652:1: ( ( rule__GSSIfaceUartPort__DataBitsAssignment_2_3_2 ) )
            {
            // InternalIFACE.g:2652:1: ( ( rule__GSSIfaceUartPort__DataBitsAssignment_2_3_2 ) )
            // InternalIFACE.g:2653:2: ( rule__GSSIfaceUartPort__DataBitsAssignment_2_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsAssignment_2_3_2()); 
            }
            // InternalIFACE.g:2654:2: ( rule__GSSIfaceUartPort__DataBitsAssignment_2_3_2 )
            // InternalIFACE.g:2654:3: rule__GSSIfaceUartPort__DataBitsAssignment_2_3_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__DataBitsAssignment_2_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsAssignment_2_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_3__2__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_3__3"
    // InternalIFACE.g:2662:1: rule__GSSIfaceUartPort__Group_2_3__3 : rule__GSSIfaceUartPort__Group_2_3__3__Impl ;
    public final void rule__GSSIfaceUartPort__Group_2_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2666:1: ( rule__GSSIfaceUartPort__Group_2_3__3__Impl )
            // InternalIFACE.g:2667:2: rule__GSSIfaceUartPort__Group_2_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_3__3"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_3__3__Impl"
    // InternalIFACE.g:2673:1: rule__GSSIfaceUartPort__Group_2_3__3__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group_2_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2677:1: ( ( ';' ) )
            // InternalIFACE.g:2678:1: ( ';' )
            {
            // InternalIFACE.g:2678:1: ( ';' )
            // InternalIFACE.g:2679:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_3_3()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_3__3__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_4__0"
    // InternalIFACE.g:2689:1: rule__GSSIfaceUartPort__Group_2_4__0 : rule__GSSIfaceUartPort__Group_2_4__0__Impl rule__GSSIfaceUartPort__Group_2_4__1 ;
    public final void rule__GSSIfaceUartPort__Group_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2693:1: ( rule__GSSIfaceUartPort__Group_2_4__0__Impl rule__GSSIfaceUartPort__Group_2_4__1 )
            // InternalIFACE.g:2694:2: rule__GSSIfaceUartPort__Group_2_4__0__Impl rule__GSSIfaceUartPort__Group_2_4__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceUartPort__Group_2_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_4__0"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_4__0__Impl"
    // InternalIFACE.g:2701:1: rule__GSSIfaceUartPort__Group_2_4__0__Impl : ( 'stopBits' ) ;
    public final void rule__GSSIfaceUartPort__Group_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2705:1: ( ( 'stopBits' ) )
            // InternalIFACE.g:2706:1: ( 'stopBits' )
            {
            // InternalIFACE.g:2706:1: ( 'stopBits' )
            // InternalIFACE.g:2707:2: 'stopBits'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsKeyword_2_4_0()); 
            }
            match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsKeyword_2_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_4__0__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_4__1"
    // InternalIFACE.g:2716:1: rule__GSSIfaceUartPort__Group_2_4__1 : rule__GSSIfaceUartPort__Group_2_4__1__Impl rule__GSSIfaceUartPort__Group_2_4__2 ;
    public final void rule__GSSIfaceUartPort__Group_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2720:1: ( rule__GSSIfaceUartPort__Group_2_4__1__Impl rule__GSSIfaceUartPort__Group_2_4__2 )
            // InternalIFACE.g:2721:2: rule__GSSIfaceUartPort__Group_2_4__1__Impl rule__GSSIfaceUartPort__Group_2_4__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__GSSIfaceUartPort__Group_2_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_4__1"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_4__1__Impl"
    // InternalIFACE.g:2728:1: rule__GSSIfaceUartPort__Group_2_4__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartPort__Group_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2732:1: ( ( ':=' ) )
            // InternalIFACE.g:2733:1: ( ':=' )
            {
            // InternalIFACE.g:2733:1: ( ':=' )
            // InternalIFACE.g:2734:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_4_1()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_4__1__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_4__2"
    // InternalIFACE.g:2743:1: rule__GSSIfaceUartPort__Group_2_4__2 : rule__GSSIfaceUartPort__Group_2_4__2__Impl rule__GSSIfaceUartPort__Group_2_4__3 ;
    public final void rule__GSSIfaceUartPort__Group_2_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2747:1: ( rule__GSSIfaceUartPort__Group_2_4__2__Impl rule__GSSIfaceUartPort__Group_2_4__3 )
            // InternalIFACE.g:2748:2: rule__GSSIfaceUartPort__Group_2_4__2__Impl rule__GSSIfaceUartPort__Group_2_4__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceUartPort__Group_2_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_4__2"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_4__2__Impl"
    // InternalIFACE.g:2755:1: rule__GSSIfaceUartPort__Group_2_4__2__Impl : ( ( rule__GSSIfaceUartPort__StopBitsAssignment_2_4_2 ) ) ;
    public final void rule__GSSIfaceUartPort__Group_2_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2759:1: ( ( ( rule__GSSIfaceUartPort__StopBitsAssignment_2_4_2 ) ) )
            // InternalIFACE.g:2760:1: ( ( rule__GSSIfaceUartPort__StopBitsAssignment_2_4_2 ) )
            {
            // InternalIFACE.g:2760:1: ( ( rule__GSSIfaceUartPort__StopBitsAssignment_2_4_2 ) )
            // InternalIFACE.g:2761:2: ( rule__GSSIfaceUartPort__StopBitsAssignment_2_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsAssignment_2_4_2()); 
            }
            // InternalIFACE.g:2762:2: ( rule__GSSIfaceUartPort__StopBitsAssignment_2_4_2 )
            // InternalIFACE.g:2762:3: rule__GSSIfaceUartPort__StopBitsAssignment_2_4_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__StopBitsAssignment_2_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsAssignment_2_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_4__2__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_4__3"
    // InternalIFACE.g:2770:1: rule__GSSIfaceUartPort__Group_2_4__3 : rule__GSSIfaceUartPort__Group_2_4__3__Impl ;
    public final void rule__GSSIfaceUartPort__Group_2_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2774:1: ( rule__GSSIfaceUartPort__Group_2_4__3__Impl )
            // InternalIFACE.g:2775:2: rule__GSSIfaceUartPort__Group_2_4__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_4__3"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_4__3__Impl"
    // InternalIFACE.g:2781:1: rule__GSSIfaceUartPort__Group_2_4__3__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group_2_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2785:1: ( ( ';' ) )
            // InternalIFACE.g:2786:1: ( ';' )
            {
            // InternalIFACE.g:2786:1: ( ';' )
            // InternalIFACE.g:2787:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_4_3()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_4__3__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_5__0"
    // InternalIFACE.g:2797:1: rule__GSSIfaceUartPort__Group_2_5__0 : rule__GSSIfaceUartPort__Group_2_5__0__Impl rule__GSSIfaceUartPort__Group_2_5__1 ;
    public final void rule__GSSIfaceUartPort__Group_2_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2801:1: ( rule__GSSIfaceUartPort__Group_2_5__0__Impl rule__GSSIfaceUartPort__Group_2_5__1 )
            // InternalIFACE.g:2802:2: rule__GSSIfaceUartPort__Group_2_5__0__Impl rule__GSSIfaceUartPort__Group_2_5__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceUartPort__Group_2_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_5__0"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_5__0__Impl"
    // InternalIFACE.g:2809:1: rule__GSSIfaceUartPort__Group_2_5__0__Impl : ( 'inputQueueSize' ) ;
    public final void rule__GSSIfaceUartPort__Group_2_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2813:1: ( ( 'inputQueueSize' ) )
            // InternalIFACE.g:2814:1: ( 'inputQueueSize' )
            {
            // InternalIFACE.g:2814:1: ( 'inputQueueSize' )
            // InternalIFACE.g:2815:2: 'inputQueueSize'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeKeyword_2_5_0()); 
            }
            match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeKeyword_2_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_5__0__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_5__1"
    // InternalIFACE.g:2824:1: rule__GSSIfaceUartPort__Group_2_5__1 : rule__GSSIfaceUartPort__Group_2_5__1__Impl rule__GSSIfaceUartPort__Group_2_5__2 ;
    public final void rule__GSSIfaceUartPort__Group_2_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2828:1: ( rule__GSSIfaceUartPort__Group_2_5__1__Impl rule__GSSIfaceUartPort__Group_2_5__2 )
            // InternalIFACE.g:2829:2: rule__GSSIfaceUartPort__Group_2_5__1__Impl rule__GSSIfaceUartPort__Group_2_5__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__GSSIfaceUartPort__Group_2_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_5__1"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_5__1__Impl"
    // InternalIFACE.g:2836:1: rule__GSSIfaceUartPort__Group_2_5__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartPort__Group_2_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2840:1: ( ( ':=' ) )
            // InternalIFACE.g:2841:1: ( ':=' )
            {
            // InternalIFACE.g:2841:1: ( ':=' )
            // InternalIFACE.g:2842:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_5_1()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_5__1__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_5__2"
    // InternalIFACE.g:2851:1: rule__GSSIfaceUartPort__Group_2_5__2 : rule__GSSIfaceUartPort__Group_2_5__2__Impl rule__GSSIfaceUartPort__Group_2_5__3 ;
    public final void rule__GSSIfaceUartPort__Group_2_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2855:1: ( rule__GSSIfaceUartPort__Group_2_5__2__Impl rule__GSSIfaceUartPort__Group_2_5__3 )
            // InternalIFACE.g:2856:2: rule__GSSIfaceUartPort__Group_2_5__2__Impl rule__GSSIfaceUartPort__Group_2_5__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceUartPort__Group_2_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_5__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_5__2"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_5__2__Impl"
    // InternalIFACE.g:2863:1: rule__GSSIfaceUartPort__Group_2_5__2__Impl : ( ( rule__GSSIfaceUartPort__InputQueueSizeAssignment_2_5_2 ) ) ;
    public final void rule__GSSIfaceUartPort__Group_2_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2867:1: ( ( ( rule__GSSIfaceUartPort__InputQueueSizeAssignment_2_5_2 ) ) )
            // InternalIFACE.g:2868:1: ( ( rule__GSSIfaceUartPort__InputQueueSizeAssignment_2_5_2 ) )
            {
            // InternalIFACE.g:2868:1: ( ( rule__GSSIfaceUartPort__InputQueueSizeAssignment_2_5_2 ) )
            // InternalIFACE.g:2869:2: ( rule__GSSIfaceUartPort__InputQueueSizeAssignment_2_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeAssignment_2_5_2()); 
            }
            // InternalIFACE.g:2870:2: ( rule__GSSIfaceUartPort__InputQueueSizeAssignment_2_5_2 )
            // InternalIFACE.g:2870:3: rule__GSSIfaceUartPort__InputQueueSizeAssignment_2_5_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__InputQueueSizeAssignment_2_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeAssignment_2_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_5__2__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_5__3"
    // InternalIFACE.g:2878:1: rule__GSSIfaceUartPort__Group_2_5__3 : rule__GSSIfaceUartPort__Group_2_5__3__Impl ;
    public final void rule__GSSIfaceUartPort__Group_2_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2882:1: ( rule__GSSIfaceUartPort__Group_2_5__3__Impl )
            // InternalIFACE.g:2883:2: rule__GSSIfaceUartPort__Group_2_5__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_5__3"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_5__3__Impl"
    // InternalIFACE.g:2889:1: rule__GSSIfaceUartPort__Group_2_5__3__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group_2_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2893:1: ( ( ';' ) )
            // InternalIFACE.g:2894:1: ( ';' )
            {
            // InternalIFACE.g:2894:1: ( ';' )
            // InternalIFACE.g:2895:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_5_3()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_5_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_5__3__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_6__0"
    // InternalIFACE.g:2905:1: rule__GSSIfaceUartPort__Group_2_6__0 : rule__GSSIfaceUartPort__Group_2_6__0__Impl rule__GSSIfaceUartPort__Group_2_6__1 ;
    public final void rule__GSSIfaceUartPort__Group_2_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2909:1: ( rule__GSSIfaceUartPort__Group_2_6__0__Impl rule__GSSIfaceUartPort__Group_2_6__1 )
            // InternalIFACE.g:2910:2: rule__GSSIfaceUartPort__Group_2_6__0__Impl rule__GSSIfaceUartPort__Group_2_6__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceUartPort__Group_2_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_6__0"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_6__0__Impl"
    // InternalIFACE.g:2917:1: rule__GSSIfaceUartPort__Group_2_6__0__Impl : ( 'outputQueueSize' ) ;
    public final void rule__GSSIfaceUartPort__Group_2_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2921:1: ( ( 'outputQueueSize' ) )
            // InternalIFACE.g:2922:1: ( 'outputQueueSize' )
            {
            // InternalIFACE.g:2922:1: ( 'outputQueueSize' )
            // InternalIFACE.g:2923:2: 'outputQueueSize'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeKeyword_2_6_0()); 
            }
            match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeKeyword_2_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_6__0__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_6__1"
    // InternalIFACE.g:2932:1: rule__GSSIfaceUartPort__Group_2_6__1 : rule__GSSIfaceUartPort__Group_2_6__1__Impl rule__GSSIfaceUartPort__Group_2_6__2 ;
    public final void rule__GSSIfaceUartPort__Group_2_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2936:1: ( rule__GSSIfaceUartPort__Group_2_6__1__Impl rule__GSSIfaceUartPort__Group_2_6__2 )
            // InternalIFACE.g:2937:2: rule__GSSIfaceUartPort__Group_2_6__1__Impl rule__GSSIfaceUartPort__Group_2_6__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__GSSIfaceUartPort__Group_2_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_6__1"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_6__1__Impl"
    // InternalIFACE.g:2944:1: rule__GSSIfaceUartPort__Group_2_6__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartPort__Group_2_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2948:1: ( ( ':=' ) )
            // InternalIFACE.g:2949:1: ( ':=' )
            {
            // InternalIFACE.g:2949:1: ( ':=' )
            // InternalIFACE.g:2950:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_6_1()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_6__1__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_6__2"
    // InternalIFACE.g:2959:1: rule__GSSIfaceUartPort__Group_2_6__2 : rule__GSSIfaceUartPort__Group_2_6__2__Impl rule__GSSIfaceUartPort__Group_2_6__3 ;
    public final void rule__GSSIfaceUartPort__Group_2_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2963:1: ( rule__GSSIfaceUartPort__Group_2_6__2__Impl rule__GSSIfaceUartPort__Group_2_6__3 )
            // InternalIFACE.g:2964:2: rule__GSSIfaceUartPort__Group_2_6__2__Impl rule__GSSIfaceUartPort__Group_2_6__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceUartPort__Group_2_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_6__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_6__2"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_6__2__Impl"
    // InternalIFACE.g:2971:1: rule__GSSIfaceUartPort__Group_2_6__2__Impl : ( ( rule__GSSIfaceUartPort__OutputQueueSizeAssignment_2_6_2 ) ) ;
    public final void rule__GSSIfaceUartPort__Group_2_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2975:1: ( ( ( rule__GSSIfaceUartPort__OutputQueueSizeAssignment_2_6_2 ) ) )
            // InternalIFACE.g:2976:1: ( ( rule__GSSIfaceUartPort__OutputQueueSizeAssignment_2_6_2 ) )
            {
            // InternalIFACE.g:2976:1: ( ( rule__GSSIfaceUartPort__OutputQueueSizeAssignment_2_6_2 ) )
            // InternalIFACE.g:2977:2: ( rule__GSSIfaceUartPort__OutputQueueSizeAssignment_2_6_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeAssignment_2_6_2()); 
            }
            // InternalIFACE.g:2978:2: ( rule__GSSIfaceUartPort__OutputQueueSizeAssignment_2_6_2 )
            // InternalIFACE.g:2978:3: rule__GSSIfaceUartPort__OutputQueueSizeAssignment_2_6_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__OutputQueueSizeAssignment_2_6_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeAssignment_2_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_6__2__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_6__3"
    // InternalIFACE.g:2986:1: rule__GSSIfaceUartPort__Group_2_6__3 : rule__GSSIfaceUartPort__Group_2_6__3__Impl ;
    public final void rule__GSSIfaceUartPort__Group_2_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2990:1: ( rule__GSSIfaceUartPort__Group_2_6__3__Impl )
            // InternalIFACE.g:2991:2: rule__GSSIfaceUartPort__Group_2_6__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group_2_6__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_6__3"


    // $ANTLR start "rule__GSSIfaceUartPort__Group_2_6__3__Impl"
    // InternalIFACE.g:2997:1: rule__GSSIfaceUartPort__Group_2_6__3__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group_2_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3001:1: ( ( ';' ) )
            // InternalIFACE.g:3002:1: ( ';' )
            {
            // InternalIFACE.g:3002:1: ( ';' )
            // InternalIFACE.g:3003:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_6_3()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_6_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group_2_6__3__Impl"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__0"
    // InternalIFACE.g:3013:1: rule__GSSIfaceUartProtocol__Group__0 : rule__GSSIfaceUartProtocol__Group__0__Impl rule__GSSIfaceUartProtocol__Group__1 ;
    public final void rule__GSSIfaceUartProtocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3017:1: ( rule__GSSIfaceUartProtocol__Group__0__Impl rule__GSSIfaceUartProtocol__Group__1 )
            // InternalIFACE.g:3018:2: rule__GSSIfaceUartProtocol__Group__0__Impl rule__GSSIfaceUartProtocol__Group__1
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
    // InternalIFACE.g:3025:1: rule__GSSIfaceUartProtocol__Group__0__Impl : ( 'uartProtocol' ) ;
    public final void rule__GSSIfaceUartProtocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3029:1: ( ( 'uartProtocol' ) )
            // InternalIFACE.g:3030:1: ( 'uartProtocol' )
            {
            // InternalIFACE.g:3030:1: ( 'uartProtocol' )
            // InternalIFACE.g:3031:2: 'uartProtocol'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getUartProtocolKeyword_0()); 
            }
            match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3040:1: rule__GSSIfaceUartProtocol__Group__1 : rule__GSSIfaceUartProtocol__Group__1__Impl rule__GSSIfaceUartProtocol__Group__2 ;
    public final void rule__GSSIfaceUartProtocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3044:1: ( rule__GSSIfaceUartProtocol__Group__1__Impl rule__GSSIfaceUartProtocol__Group__2 )
            // InternalIFACE.g:3045:2: rule__GSSIfaceUartProtocol__Group__1__Impl rule__GSSIfaceUartProtocol__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
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
    // InternalIFACE.g:3052:1: rule__GSSIfaceUartProtocol__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceUartProtocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3056:1: ( ( '{' ) )
            // InternalIFACE.g:3057:1: ( '{' )
            {
            // InternalIFACE.g:3057:1: ( '{' )
            // InternalIFACE.g:3058:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3067:1: rule__GSSIfaceUartProtocol__Group__2 : rule__GSSIfaceUartProtocol__Group__2__Impl rule__GSSIfaceUartProtocol__Group__3 ;
    public final void rule__GSSIfaceUartProtocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3071:1: ( rule__GSSIfaceUartProtocol__Group__2__Impl rule__GSSIfaceUartProtocol__Group__3 )
            // InternalIFACE.g:3072:2: rule__GSSIfaceUartProtocol__Group__2__Impl rule__GSSIfaceUartProtocol__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
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
    // InternalIFACE.g:3079:1: rule__GSSIfaceUartProtocol__Group__2__Impl : ( ( rule__GSSIfaceUartProtocol__UnorderedGroup_2 ) ) ;
    public final void rule__GSSIfaceUartProtocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3083:1: ( ( ( rule__GSSIfaceUartProtocol__UnorderedGroup_2 ) ) )
            // InternalIFACE.g:3084:1: ( ( rule__GSSIfaceUartProtocol__UnorderedGroup_2 ) )
            {
            // InternalIFACE.g:3084:1: ( ( rule__GSSIfaceUartProtocol__UnorderedGroup_2 ) )
            // InternalIFACE.g:3085:2: ( rule__GSSIfaceUartProtocol__UnorderedGroup_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2()); 
            }
            // InternalIFACE.g:3086:2: ( rule__GSSIfaceUartProtocol__UnorderedGroup_2 )
            // InternalIFACE.g:3086:3: rule__GSSIfaceUartProtocol__UnorderedGroup_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__UnorderedGroup_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2()); 
            }

            }


            }

        }
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
    // InternalIFACE.g:3094:1: rule__GSSIfaceUartProtocol__Group__3 : rule__GSSIfaceUartProtocol__Group__3__Impl rule__GSSIfaceUartProtocol__Group__4 ;
    public final void rule__GSSIfaceUartProtocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3098:1: ( rule__GSSIfaceUartProtocol__Group__3__Impl rule__GSSIfaceUartProtocol__Group__4 )
            // InternalIFACE.g:3099:2: rule__GSSIfaceUartProtocol__Group__3__Impl rule__GSSIfaceUartProtocol__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalIFACE.g:3106:1: rule__GSSIfaceUartProtocol__Group__3__Impl : ( '}' ) ;
    public final void rule__GSSIfaceUartProtocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3110:1: ( ( '}' ) )
            // InternalIFACE.g:3111:1: ( '}' )
            {
            // InternalIFACE.g:3111:1: ( '}' )
            // InternalIFACE.g:3112:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
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
    // InternalIFACE.g:3121:1: rule__GSSIfaceUartProtocol__Group__4 : rule__GSSIfaceUartProtocol__Group__4__Impl ;
    public final void rule__GSSIfaceUartProtocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3125:1: ( rule__GSSIfaceUartProtocol__Group__4__Impl )
            // InternalIFACE.g:3126:2: rule__GSSIfaceUartProtocol__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalIFACE.g:3132:1: rule__GSSIfaceUartProtocol__Group__4__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartProtocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3136:1: ( ( ';' ) )
            // InternalIFACE.g:3137:1: ( ';' )
            {
            // InternalIFACE.g:3137:1: ( ';' )
            // InternalIFACE.g:3138:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_4()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group_2_0__0"
    // InternalIFACE.g:3148:1: rule__GSSIfaceUartProtocol__Group_2_0__0 : rule__GSSIfaceUartProtocol__Group_2_0__0__Impl rule__GSSIfaceUartProtocol__Group_2_0__1 ;
    public final void rule__GSSIfaceUartProtocol__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3152:1: ( rule__GSSIfaceUartProtocol__Group_2_0__0__Impl rule__GSSIfaceUartProtocol__Group_2_0__1 )
            // InternalIFACE.g:3153:2: rule__GSSIfaceUartProtocol__Group_2_0__0__Impl rule__GSSIfaceUartProtocol__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceUartProtocol__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__Group_2_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group_2_0__0"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group_2_0__0__Impl"
    // InternalIFACE.g:3160:1: rule__GSSIfaceUartProtocol__Group_2_0__0__Impl : ( 'unit' ) ;
    public final void rule__GSSIfaceUartProtocol__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3164:1: ( ( 'unit' ) )
            // InternalIFACE.g:3165:1: ( 'unit' )
            {
            // InternalIFACE.g:3165:1: ( 'unit' )
            // InternalIFACE.g:3166:2: 'unit'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getUnitKeyword_2_0_0()); 
            }
            match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getUnitKeyword_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group_2_0__0__Impl"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group_2_0__1"
    // InternalIFACE.g:3175:1: rule__GSSIfaceUartProtocol__Group_2_0__1 : rule__GSSIfaceUartProtocol__Group_2_0__1__Impl rule__GSSIfaceUartProtocol__Group_2_0__2 ;
    public final void rule__GSSIfaceUartProtocol__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3179:1: ( rule__GSSIfaceUartProtocol__Group_2_0__1__Impl rule__GSSIfaceUartProtocol__Group_2_0__2 )
            // InternalIFACE.g:3180:2: rule__GSSIfaceUartProtocol__Group_2_0__1__Impl rule__GSSIfaceUartProtocol__Group_2_0__2
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__GSSIfaceUartProtocol__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__Group_2_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group_2_0__1"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group_2_0__1__Impl"
    // InternalIFACE.g:3187:1: rule__GSSIfaceUartProtocol__Group_2_0__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartProtocol__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3191:1: ( ( ':=' ) )
            // InternalIFACE.g:3192:1: ( ':=' )
            {
            // InternalIFACE.g:3192:1: ( ':=' )
            // InternalIFACE.g:3193:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getColonEqualsSignKeyword_2_0_1()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getColonEqualsSignKeyword_2_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group_2_0__1__Impl"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group_2_0__2"
    // InternalIFACE.g:3202:1: rule__GSSIfaceUartProtocol__Group_2_0__2 : rule__GSSIfaceUartProtocol__Group_2_0__2__Impl rule__GSSIfaceUartProtocol__Group_2_0__3 ;
    public final void rule__GSSIfaceUartProtocol__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3206:1: ( rule__GSSIfaceUartProtocol__Group_2_0__2__Impl rule__GSSIfaceUartProtocol__Group_2_0__3 )
            // InternalIFACE.g:3207:2: rule__GSSIfaceUartProtocol__Group_2_0__2__Impl rule__GSSIfaceUartProtocol__Group_2_0__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceUartProtocol__Group_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__Group_2_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group_2_0__2"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group_2_0__2__Impl"
    // InternalIFACE.g:3214:1: rule__GSSIfaceUartProtocol__Group_2_0__2__Impl : ( ( rule__GSSIfaceUartProtocol__UnitAssignment_2_0_2 ) ) ;
    public final void rule__GSSIfaceUartProtocol__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3218:1: ( ( ( rule__GSSIfaceUartProtocol__UnitAssignment_2_0_2 ) ) )
            // InternalIFACE.g:3219:1: ( ( rule__GSSIfaceUartProtocol__UnitAssignment_2_0_2 ) )
            {
            // InternalIFACE.g:3219:1: ( ( rule__GSSIfaceUartProtocol__UnitAssignment_2_0_2 ) )
            // InternalIFACE.g:3220:2: ( rule__GSSIfaceUartProtocol__UnitAssignment_2_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getUnitAssignment_2_0_2()); 
            }
            // InternalIFACE.g:3221:2: ( rule__GSSIfaceUartProtocol__UnitAssignment_2_0_2 )
            // InternalIFACE.g:3221:3: rule__GSSIfaceUartProtocol__UnitAssignment_2_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__UnitAssignment_2_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getUnitAssignment_2_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group_2_0__2__Impl"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group_2_0__3"
    // InternalIFACE.g:3229:1: rule__GSSIfaceUartProtocol__Group_2_0__3 : rule__GSSIfaceUartProtocol__Group_2_0__3__Impl ;
    public final void rule__GSSIfaceUartProtocol__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3233:1: ( rule__GSSIfaceUartProtocol__Group_2_0__3__Impl )
            // InternalIFACE.g:3234:2: rule__GSSIfaceUartProtocol__Group_2_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__Group_2_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group_2_0__3"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group_2_0__3__Impl"
    // InternalIFACE.g:3240:1: rule__GSSIfaceUartProtocol__Group_2_0__3__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartProtocol__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3244:1: ( ( ';' ) )
            // InternalIFACE.g:3245:1: ( ';' )
            {
            // InternalIFACE.g:3245:1: ( ';' )
            // InternalIFACE.g:3246:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_2_0_3()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_2_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group_2_0__3__Impl"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group_2_1__0"
    // InternalIFACE.g:3256:1: rule__GSSIfaceUartProtocol__Group_2_1__0 : rule__GSSIfaceUartProtocol__Group_2_1__0__Impl rule__GSSIfaceUartProtocol__Group_2_1__1 ;
    public final void rule__GSSIfaceUartProtocol__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3260:1: ( rule__GSSIfaceUartProtocol__Group_2_1__0__Impl rule__GSSIfaceUartProtocol__Group_2_1__1 )
            // InternalIFACE.g:3261:2: rule__GSSIfaceUartProtocol__Group_2_1__0__Impl rule__GSSIfaceUartProtocol__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceUartProtocol__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group_2_1__0"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group_2_1__0__Impl"
    // InternalIFACE.g:3268:1: rule__GSSIfaceUartProtocol__Group_2_1__0__Impl : ( 'power' ) ;
    public final void rule__GSSIfaceUartProtocol__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3272:1: ( ( 'power' ) )
            // InternalIFACE.g:3273:1: ( 'power' )
            {
            // InternalIFACE.g:3273:1: ( 'power' )
            // InternalIFACE.g:3274:2: 'power'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getPowerKeyword_2_1_0()); 
            }
            match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getPowerKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group_2_1__0__Impl"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group_2_1__1"
    // InternalIFACE.g:3283:1: rule__GSSIfaceUartProtocol__Group_2_1__1 : rule__GSSIfaceUartProtocol__Group_2_1__1__Impl rule__GSSIfaceUartProtocol__Group_2_1__2 ;
    public final void rule__GSSIfaceUartProtocol__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3287:1: ( rule__GSSIfaceUartProtocol__Group_2_1__1__Impl rule__GSSIfaceUartProtocol__Group_2_1__2 )
            // InternalIFACE.g:3288:2: rule__GSSIfaceUartProtocol__Group_2_1__1__Impl rule__GSSIfaceUartProtocol__Group_2_1__2
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__GSSIfaceUartProtocol__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__Group_2_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group_2_1__1"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group_2_1__1__Impl"
    // InternalIFACE.g:3295:1: rule__GSSIfaceUartProtocol__Group_2_1__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartProtocol__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3299:1: ( ( ':=' ) )
            // InternalIFACE.g:3300:1: ( ':=' )
            {
            // InternalIFACE.g:3300:1: ( ':=' )
            // InternalIFACE.g:3301:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getColonEqualsSignKeyword_2_1_1()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getColonEqualsSignKeyword_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group_2_1__1__Impl"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group_2_1__2"
    // InternalIFACE.g:3310:1: rule__GSSIfaceUartProtocol__Group_2_1__2 : rule__GSSIfaceUartProtocol__Group_2_1__2__Impl rule__GSSIfaceUartProtocol__Group_2_1__3 ;
    public final void rule__GSSIfaceUartProtocol__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3314:1: ( rule__GSSIfaceUartProtocol__Group_2_1__2__Impl rule__GSSIfaceUartProtocol__Group_2_1__3 )
            // InternalIFACE.g:3315:2: rule__GSSIfaceUartProtocol__Group_2_1__2__Impl rule__GSSIfaceUartProtocol__Group_2_1__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceUartProtocol__Group_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__Group_2_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group_2_1__2"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group_2_1__2__Impl"
    // InternalIFACE.g:3322:1: rule__GSSIfaceUartProtocol__Group_2_1__2__Impl : ( ( rule__GSSIfaceUartProtocol__PowerAssignment_2_1_2 ) ) ;
    public final void rule__GSSIfaceUartProtocol__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3326:1: ( ( ( rule__GSSIfaceUartProtocol__PowerAssignment_2_1_2 ) ) )
            // InternalIFACE.g:3327:1: ( ( rule__GSSIfaceUartProtocol__PowerAssignment_2_1_2 ) )
            {
            // InternalIFACE.g:3327:1: ( ( rule__GSSIfaceUartProtocol__PowerAssignment_2_1_2 ) )
            // InternalIFACE.g:3328:2: ( rule__GSSIfaceUartProtocol__PowerAssignment_2_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getPowerAssignment_2_1_2()); 
            }
            // InternalIFACE.g:3329:2: ( rule__GSSIfaceUartProtocol__PowerAssignment_2_1_2 )
            // InternalIFACE.g:3329:3: rule__GSSIfaceUartProtocol__PowerAssignment_2_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__PowerAssignment_2_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getPowerAssignment_2_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group_2_1__2__Impl"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group_2_1__3"
    // InternalIFACE.g:3337:1: rule__GSSIfaceUartProtocol__Group_2_1__3 : rule__GSSIfaceUartProtocol__Group_2_1__3__Impl ;
    public final void rule__GSSIfaceUartProtocol__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3341:1: ( rule__GSSIfaceUartProtocol__Group_2_1__3__Impl )
            // InternalIFACE.g:3342:2: rule__GSSIfaceUartProtocol__Group_2_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__Group_2_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group_2_1__3"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group_2_1__3__Impl"
    // InternalIFACE.g:3348:1: rule__GSSIfaceUartProtocol__Group_2_1__3__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartProtocol__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3352:1: ( ( ';' ) )
            // InternalIFACE.g:3353:1: ( ';' )
            {
            // InternalIFACE.g:3353:1: ( ';' )
            // InternalIFACE.g:3354:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_2_1_3()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_2_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__Group_2_1__3__Impl"


    // $ANTLR start "rule__GSSIfaceConstSize__Group__0"
    // InternalIFACE.g:3364:1: rule__GSSIfaceConstSize__Group__0 : rule__GSSIfaceConstSize__Group__0__Impl rule__GSSIfaceConstSize__Group__1 ;
    public final void rule__GSSIfaceConstSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3368:1: ( rule__GSSIfaceConstSize__Group__0__Impl rule__GSSIfaceConstSize__Group__1 )
            // InternalIFACE.g:3369:2: rule__GSSIfaceConstSize__Group__0__Impl rule__GSSIfaceConstSize__Group__1
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
    // InternalIFACE.g:3376:1: rule__GSSIfaceConstSize__Group__0__Impl : ( 'constSize' ) ;
    public final void rule__GSSIfaceConstSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3380:1: ( ( 'constSize' ) )
            // InternalIFACE.g:3381:1: ( 'constSize' )
            {
            // InternalIFACE.g:3381:1: ( 'constSize' )
            // InternalIFACE.g:3382:2: 'constSize'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getConstSizeKeyword_0()); 
            }
            match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3391:1: rule__GSSIfaceConstSize__Group__1 : rule__GSSIfaceConstSize__Group__1__Impl rule__GSSIfaceConstSize__Group__2 ;
    public final void rule__GSSIfaceConstSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3395:1: ( rule__GSSIfaceConstSize__Group__1__Impl rule__GSSIfaceConstSize__Group__2 )
            // InternalIFACE.g:3396:2: rule__GSSIfaceConstSize__Group__1__Impl rule__GSSIfaceConstSize__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_23);
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
    // InternalIFACE.g:3403:1: rule__GSSIfaceConstSize__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceConstSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3407:1: ( ( '{' ) )
            // InternalIFACE.g:3408:1: ( '{' )
            {
            // InternalIFACE.g:3408:1: ( '{' )
            // InternalIFACE.g:3409:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3418:1: rule__GSSIfaceConstSize__Group__2 : rule__GSSIfaceConstSize__Group__2__Impl rule__GSSIfaceConstSize__Group__3 ;
    public final void rule__GSSIfaceConstSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3422:1: ( rule__GSSIfaceConstSize__Group__2__Impl rule__GSSIfaceConstSize__Group__3 )
            // InternalIFACE.g:3423:2: rule__GSSIfaceConstSize__Group__2__Impl rule__GSSIfaceConstSize__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
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
    // InternalIFACE.g:3430:1: rule__GSSIfaceConstSize__Group__2__Impl : ( ( rule__GSSIfaceConstSize__UnorderedGroup_2 ) ) ;
    public final void rule__GSSIfaceConstSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3434:1: ( ( ( rule__GSSIfaceConstSize__UnorderedGroup_2 ) ) )
            // InternalIFACE.g:3435:1: ( ( rule__GSSIfaceConstSize__UnorderedGroup_2 ) )
            {
            // InternalIFACE.g:3435:1: ( ( rule__GSSIfaceConstSize__UnorderedGroup_2 ) )
            // InternalIFACE.g:3436:2: ( rule__GSSIfaceConstSize__UnorderedGroup_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2()); 
            }
            // InternalIFACE.g:3437:2: ( rule__GSSIfaceConstSize__UnorderedGroup_2 )
            // InternalIFACE.g:3437:3: rule__GSSIfaceConstSize__UnorderedGroup_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__UnorderedGroup_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2()); 
            }

            }


            }

        }
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
    // InternalIFACE.g:3445:1: rule__GSSIfaceConstSize__Group__3 : rule__GSSIfaceConstSize__Group__3__Impl rule__GSSIfaceConstSize__Group__4 ;
    public final void rule__GSSIfaceConstSize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3449:1: ( rule__GSSIfaceConstSize__Group__3__Impl rule__GSSIfaceConstSize__Group__4 )
            // InternalIFACE.g:3450:2: rule__GSSIfaceConstSize__Group__3__Impl rule__GSSIfaceConstSize__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalIFACE.g:3457:1: rule__GSSIfaceConstSize__Group__3__Impl : ( '}' ) ;
    public final void rule__GSSIfaceConstSize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3461:1: ( ( '}' ) )
            // InternalIFACE.g:3462:1: ( '}' )
            {
            // InternalIFACE.g:3462:1: ( '}' )
            // InternalIFACE.g:3463:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
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
    // InternalIFACE.g:3472:1: rule__GSSIfaceConstSize__Group__4 : rule__GSSIfaceConstSize__Group__4__Impl ;
    public final void rule__GSSIfaceConstSize__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3476:1: ( rule__GSSIfaceConstSize__Group__4__Impl )
            // InternalIFACE.g:3477:2: rule__GSSIfaceConstSize__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalIFACE.g:3483:1: rule__GSSIfaceConstSize__Group__4__Impl : ( ';' ) ;
    public final void rule__GSSIfaceConstSize__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3487:1: ( ( ';' ) )
            // InternalIFACE.g:3488:1: ( ';' )
            {
            // InternalIFACE.g:3488:1: ( ';' )
            // InternalIFACE.g:3489:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_4()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__GSSIfaceConstSize__Group_2_0__0"
    // InternalIFACE.g:3499:1: rule__GSSIfaceConstSize__Group_2_0__0 : rule__GSSIfaceConstSize__Group_2_0__0__Impl rule__GSSIfaceConstSize__Group_2_0__1 ;
    public final void rule__GSSIfaceConstSize__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3503:1: ( rule__GSSIfaceConstSize__Group_2_0__0__Impl rule__GSSIfaceConstSize__Group_2_0__1 )
            // InternalIFACE.g:3504:2: rule__GSSIfaceConstSize__Group_2_0__0__Impl rule__GSSIfaceConstSize__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceConstSize__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__Group_2_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group_2_0__0"


    // $ANTLR start "rule__GSSIfaceConstSize__Group_2_0__0__Impl"
    // InternalIFACE.g:3511:1: rule__GSSIfaceConstSize__Group_2_0__0__Impl : ( 'bytes' ) ;
    public final void rule__GSSIfaceConstSize__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3515:1: ( ( 'bytes' ) )
            // InternalIFACE.g:3516:1: ( 'bytes' )
            {
            // InternalIFACE.g:3516:1: ( 'bytes' )
            // InternalIFACE.g:3517:2: 'bytes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getBytesKeyword_2_0_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getBytesKeyword_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group_2_0__0__Impl"


    // $ANTLR start "rule__GSSIfaceConstSize__Group_2_0__1"
    // InternalIFACE.g:3526:1: rule__GSSIfaceConstSize__Group_2_0__1 : rule__GSSIfaceConstSize__Group_2_0__1__Impl rule__GSSIfaceConstSize__Group_2_0__2 ;
    public final void rule__GSSIfaceConstSize__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3530:1: ( rule__GSSIfaceConstSize__Group_2_0__1__Impl rule__GSSIfaceConstSize__Group_2_0__2 )
            // InternalIFACE.g:3531:2: rule__GSSIfaceConstSize__Group_2_0__1__Impl rule__GSSIfaceConstSize__Group_2_0__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__GSSIfaceConstSize__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__Group_2_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group_2_0__1"


    // $ANTLR start "rule__GSSIfaceConstSize__Group_2_0__1__Impl"
    // InternalIFACE.g:3538:1: rule__GSSIfaceConstSize__Group_2_0__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceConstSize__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3542:1: ( ( ':=' ) )
            // InternalIFACE.g:3543:1: ( ':=' )
            {
            // InternalIFACE.g:3543:1: ( ':=' )
            // InternalIFACE.g:3544:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getColonEqualsSignKeyword_2_0_1()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getColonEqualsSignKeyword_2_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group_2_0__1__Impl"


    // $ANTLR start "rule__GSSIfaceConstSize__Group_2_0__2"
    // InternalIFACE.g:3553:1: rule__GSSIfaceConstSize__Group_2_0__2 : rule__GSSIfaceConstSize__Group_2_0__2__Impl rule__GSSIfaceConstSize__Group_2_0__3 ;
    public final void rule__GSSIfaceConstSize__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3557:1: ( rule__GSSIfaceConstSize__Group_2_0__2__Impl rule__GSSIfaceConstSize__Group_2_0__3 )
            // InternalIFACE.g:3558:2: rule__GSSIfaceConstSize__Group_2_0__2__Impl rule__GSSIfaceConstSize__Group_2_0__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceConstSize__Group_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__Group_2_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group_2_0__2"


    // $ANTLR start "rule__GSSIfaceConstSize__Group_2_0__2__Impl"
    // InternalIFACE.g:3565:1: rule__GSSIfaceConstSize__Group_2_0__2__Impl : ( ( rule__GSSIfaceConstSize__BytesAssignment_2_0_2 ) ) ;
    public final void rule__GSSIfaceConstSize__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3569:1: ( ( ( rule__GSSIfaceConstSize__BytesAssignment_2_0_2 ) ) )
            // InternalIFACE.g:3570:1: ( ( rule__GSSIfaceConstSize__BytesAssignment_2_0_2 ) )
            {
            // InternalIFACE.g:3570:1: ( ( rule__GSSIfaceConstSize__BytesAssignment_2_0_2 ) )
            // InternalIFACE.g:3571:2: ( rule__GSSIfaceConstSize__BytesAssignment_2_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getBytesAssignment_2_0_2()); 
            }
            // InternalIFACE.g:3572:2: ( rule__GSSIfaceConstSize__BytesAssignment_2_0_2 )
            // InternalIFACE.g:3572:3: rule__GSSIfaceConstSize__BytesAssignment_2_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__BytesAssignment_2_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getBytesAssignment_2_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group_2_0__2__Impl"


    // $ANTLR start "rule__GSSIfaceConstSize__Group_2_0__3"
    // InternalIFACE.g:3580:1: rule__GSSIfaceConstSize__Group_2_0__3 : rule__GSSIfaceConstSize__Group_2_0__3__Impl ;
    public final void rule__GSSIfaceConstSize__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3584:1: ( rule__GSSIfaceConstSize__Group_2_0__3__Impl )
            // InternalIFACE.g:3585:2: rule__GSSIfaceConstSize__Group_2_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__Group_2_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group_2_0__3"


    // $ANTLR start "rule__GSSIfaceConstSize__Group_2_0__3__Impl"
    // InternalIFACE.g:3591:1: rule__GSSIfaceConstSize__Group_2_0__3__Impl : ( ';' ) ;
    public final void rule__GSSIfaceConstSize__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3595:1: ( ( ';' ) )
            // InternalIFACE.g:3596:1: ( ';' )
            {
            // InternalIFACE.g:3596:1: ( ';' )
            // InternalIFACE.g:3597:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_2_0_3()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_2_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group_2_0__3__Impl"


    // $ANTLR start "rule__GSSIfaceConstSize__Group_2_1__0"
    // InternalIFACE.g:3607:1: rule__GSSIfaceConstSize__Group_2_1__0 : rule__GSSIfaceConstSize__Group_2_1__0__Impl rule__GSSIfaceConstSize__Group_2_1__1 ;
    public final void rule__GSSIfaceConstSize__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3611:1: ( rule__GSSIfaceConstSize__Group_2_1__0__Impl rule__GSSIfaceConstSize__Group_2_1__1 )
            // InternalIFACE.g:3612:2: rule__GSSIfaceConstSize__Group_2_1__0__Impl rule__GSSIfaceConstSize__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceConstSize__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group_2_1__0"


    // $ANTLR start "rule__GSSIfaceConstSize__Group_2_1__0__Impl"
    // InternalIFACE.g:3619:1: rule__GSSIfaceConstSize__Group_2_1__0__Impl : ( 'bits' ) ;
    public final void rule__GSSIfaceConstSize__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3623:1: ( ( 'bits' ) )
            // InternalIFACE.g:3624:1: ( 'bits' )
            {
            // InternalIFACE.g:3624:1: ( 'bits' )
            // InternalIFACE.g:3625:2: 'bits'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getBitsKeyword_2_1_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getBitsKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group_2_1__0__Impl"


    // $ANTLR start "rule__GSSIfaceConstSize__Group_2_1__1"
    // InternalIFACE.g:3634:1: rule__GSSIfaceConstSize__Group_2_1__1 : rule__GSSIfaceConstSize__Group_2_1__1__Impl rule__GSSIfaceConstSize__Group_2_1__2 ;
    public final void rule__GSSIfaceConstSize__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3638:1: ( rule__GSSIfaceConstSize__Group_2_1__1__Impl rule__GSSIfaceConstSize__Group_2_1__2 )
            // InternalIFACE.g:3639:2: rule__GSSIfaceConstSize__Group_2_1__1__Impl rule__GSSIfaceConstSize__Group_2_1__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__GSSIfaceConstSize__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__Group_2_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group_2_1__1"


    // $ANTLR start "rule__GSSIfaceConstSize__Group_2_1__1__Impl"
    // InternalIFACE.g:3646:1: rule__GSSIfaceConstSize__Group_2_1__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceConstSize__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3650:1: ( ( ':=' ) )
            // InternalIFACE.g:3651:1: ( ':=' )
            {
            // InternalIFACE.g:3651:1: ( ':=' )
            // InternalIFACE.g:3652:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getColonEqualsSignKeyword_2_1_1()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getColonEqualsSignKeyword_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group_2_1__1__Impl"


    // $ANTLR start "rule__GSSIfaceConstSize__Group_2_1__2"
    // InternalIFACE.g:3661:1: rule__GSSIfaceConstSize__Group_2_1__2 : rule__GSSIfaceConstSize__Group_2_1__2__Impl rule__GSSIfaceConstSize__Group_2_1__3 ;
    public final void rule__GSSIfaceConstSize__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3665:1: ( rule__GSSIfaceConstSize__Group_2_1__2__Impl rule__GSSIfaceConstSize__Group_2_1__3 )
            // InternalIFACE.g:3666:2: rule__GSSIfaceConstSize__Group_2_1__2__Impl rule__GSSIfaceConstSize__Group_2_1__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceConstSize__Group_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__Group_2_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group_2_1__2"


    // $ANTLR start "rule__GSSIfaceConstSize__Group_2_1__2__Impl"
    // InternalIFACE.g:3673:1: rule__GSSIfaceConstSize__Group_2_1__2__Impl : ( ( rule__GSSIfaceConstSize__BitsAssignment_2_1_2 ) ) ;
    public final void rule__GSSIfaceConstSize__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3677:1: ( ( ( rule__GSSIfaceConstSize__BitsAssignment_2_1_2 ) ) )
            // InternalIFACE.g:3678:1: ( ( rule__GSSIfaceConstSize__BitsAssignment_2_1_2 ) )
            {
            // InternalIFACE.g:3678:1: ( ( rule__GSSIfaceConstSize__BitsAssignment_2_1_2 ) )
            // InternalIFACE.g:3679:2: ( rule__GSSIfaceConstSize__BitsAssignment_2_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getBitsAssignment_2_1_2()); 
            }
            // InternalIFACE.g:3680:2: ( rule__GSSIfaceConstSize__BitsAssignment_2_1_2 )
            // InternalIFACE.g:3680:3: rule__GSSIfaceConstSize__BitsAssignment_2_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__BitsAssignment_2_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getBitsAssignment_2_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group_2_1__2__Impl"


    // $ANTLR start "rule__GSSIfaceConstSize__Group_2_1__3"
    // InternalIFACE.g:3688:1: rule__GSSIfaceConstSize__Group_2_1__3 : rule__GSSIfaceConstSize__Group_2_1__3__Impl ;
    public final void rule__GSSIfaceConstSize__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3692:1: ( rule__GSSIfaceConstSize__Group_2_1__3__Impl )
            // InternalIFACE.g:3693:2: rule__GSSIfaceConstSize__Group_2_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__Group_2_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group_2_1__3"


    // $ANTLR start "rule__GSSIfaceConstSize__Group_2_1__3__Impl"
    // InternalIFACE.g:3699:1: rule__GSSIfaceConstSize__Group_2_1__3__Impl : ( ';' ) ;
    public final void rule__GSSIfaceConstSize__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3703:1: ( ( ';' ) )
            // InternalIFACE.g:3704:1: ( ';' )
            {
            // InternalIFACE.g:3704:1: ( ';' )
            // InternalIFACE.g:3705:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_2_1_3()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_2_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__Group_2_1__3__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group__0"
    // InternalIFACE.g:3715:1: rule__GSSIfaceSizeFieldOffset__Group__0 : rule__GSSIfaceSizeFieldOffset__Group__0__Impl rule__GSSIfaceSizeFieldOffset__Group__1 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3719:1: ( rule__GSSIfaceSizeFieldOffset__Group__0__Impl rule__GSSIfaceSizeFieldOffset__Group__1 )
            // InternalIFACE.g:3720:2: rule__GSSIfaceSizeFieldOffset__Group__0__Impl rule__GSSIfaceSizeFieldOffset__Group__1
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
    // InternalIFACE.g:3727:1: rule__GSSIfaceSizeFieldOffset__Group__0__Impl : ( 'sizeFieldOffset' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3731:1: ( ( 'sizeFieldOffset' ) )
            // InternalIFACE.g:3732:1: ( 'sizeFieldOffset' )
            {
            // InternalIFACE.g:3732:1: ( 'sizeFieldOffset' )
            // InternalIFACE.g:3733:2: 'sizeFieldOffset'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSizeFieldOffsetKeyword_0()); 
            }
            match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3742:1: rule__GSSIfaceSizeFieldOffset__Group__1 : rule__GSSIfaceSizeFieldOffset__Group__1__Impl rule__GSSIfaceSizeFieldOffset__Group__2 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3746:1: ( rule__GSSIfaceSizeFieldOffset__Group__1__Impl rule__GSSIfaceSizeFieldOffset__Group__2 )
            // InternalIFACE.g:3747:2: rule__GSSIfaceSizeFieldOffset__Group__1__Impl rule__GSSIfaceSizeFieldOffset__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_23);
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
    // InternalIFACE.g:3754:1: rule__GSSIfaceSizeFieldOffset__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3758:1: ( ( '{' ) )
            // InternalIFACE.g:3759:1: ( '{' )
            {
            // InternalIFACE.g:3759:1: ( '{' )
            // InternalIFACE.g:3760:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3769:1: rule__GSSIfaceSizeFieldOffset__Group__2 : rule__GSSIfaceSizeFieldOffset__Group__2__Impl rule__GSSIfaceSizeFieldOffset__Group__3 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3773:1: ( rule__GSSIfaceSizeFieldOffset__Group__2__Impl rule__GSSIfaceSizeFieldOffset__Group__3 )
            // InternalIFACE.g:3774:2: rule__GSSIfaceSizeFieldOffset__Group__2__Impl rule__GSSIfaceSizeFieldOffset__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
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
    // InternalIFACE.g:3781:1: rule__GSSIfaceSizeFieldOffset__Group__2__Impl : ( ( rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2 ) ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3785:1: ( ( ( rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2 ) ) )
            // InternalIFACE.g:3786:1: ( ( rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2 ) )
            {
            // InternalIFACE.g:3786:1: ( ( rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2 ) )
            // InternalIFACE.g:3787:2: ( rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2()); 
            }
            // InternalIFACE.g:3788:2: ( rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2 )
            // InternalIFACE.g:3788:3: rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2()); 
            }

            }


            }

        }
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
    // InternalIFACE.g:3796:1: rule__GSSIfaceSizeFieldOffset__Group__3 : rule__GSSIfaceSizeFieldOffset__Group__3__Impl rule__GSSIfaceSizeFieldOffset__Group__4 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3800:1: ( rule__GSSIfaceSizeFieldOffset__Group__3__Impl rule__GSSIfaceSizeFieldOffset__Group__4 )
            // InternalIFACE.g:3801:2: rule__GSSIfaceSizeFieldOffset__Group__3__Impl rule__GSSIfaceSizeFieldOffset__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalIFACE.g:3808:1: rule__GSSIfaceSizeFieldOffset__Group__3__Impl : ( '}' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3812:1: ( ( '}' ) )
            // InternalIFACE.g:3813:1: ( '}' )
            {
            // InternalIFACE.g:3813:1: ( '}' )
            // InternalIFACE.g:3814:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
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
    // InternalIFACE.g:3823:1: rule__GSSIfaceSizeFieldOffset__Group__4 : rule__GSSIfaceSizeFieldOffset__Group__4__Impl ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3827:1: ( rule__GSSIfaceSizeFieldOffset__Group__4__Impl )
            // InternalIFACE.g:3828:2: rule__GSSIfaceSizeFieldOffset__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalIFACE.g:3834:1: rule__GSSIfaceSizeFieldOffset__Group__4__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3838:1: ( ( ';' ) )
            // InternalIFACE.g:3839:1: ( ';' )
            {
            // InternalIFACE.g:3839:1: ( ';' )
            // InternalIFACE.g:3840:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_4()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group_2_0__0"
    // InternalIFACE.g:3850:1: rule__GSSIfaceSizeFieldOffset__Group_2_0__0 : rule__GSSIfaceSizeFieldOffset__Group_2_0__0__Impl rule__GSSIfaceSizeFieldOffset__Group_2_0__1 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3854:1: ( rule__GSSIfaceSizeFieldOffset__Group_2_0__0__Impl rule__GSSIfaceSizeFieldOffset__Group_2_0__1 )
            // InternalIFACE.g:3855:2: rule__GSSIfaceSizeFieldOffset__Group_2_0__0__Impl rule__GSSIfaceSizeFieldOffset__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceSizeFieldOffset__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__Group_2_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group_2_0__0"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group_2_0__0__Impl"
    // InternalIFACE.g:3862:1: rule__GSSIfaceSizeFieldOffset__Group_2_0__0__Impl : ( 'bytes' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3866:1: ( ( 'bytes' ) )
            // InternalIFACE.g:3867:1: ( 'bytes' )
            {
            // InternalIFACE.g:3867:1: ( 'bytes' )
            // InternalIFACE.g:3868:2: 'bytes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesKeyword_2_0_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesKeyword_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group_2_0__0__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group_2_0__1"
    // InternalIFACE.g:3877:1: rule__GSSIfaceSizeFieldOffset__Group_2_0__1 : rule__GSSIfaceSizeFieldOffset__Group_2_0__1__Impl rule__GSSIfaceSizeFieldOffset__Group_2_0__2 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3881:1: ( rule__GSSIfaceSizeFieldOffset__Group_2_0__1__Impl rule__GSSIfaceSizeFieldOffset__Group_2_0__2 )
            // InternalIFACE.g:3882:2: rule__GSSIfaceSizeFieldOffset__Group_2_0__1__Impl rule__GSSIfaceSizeFieldOffset__Group_2_0__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__GSSIfaceSizeFieldOffset__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__Group_2_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group_2_0__1"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group_2_0__1__Impl"
    // InternalIFACE.g:3889:1: rule__GSSIfaceSizeFieldOffset__Group_2_0__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3893:1: ( ( ':=' ) )
            // InternalIFACE.g:3894:1: ( ':=' )
            {
            // InternalIFACE.g:3894:1: ( ':=' )
            // InternalIFACE.g:3895:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getColonEqualsSignKeyword_2_0_1()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getColonEqualsSignKeyword_2_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group_2_0__1__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group_2_0__2"
    // InternalIFACE.g:3904:1: rule__GSSIfaceSizeFieldOffset__Group_2_0__2 : rule__GSSIfaceSizeFieldOffset__Group_2_0__2__Impl rule__GSSIfaceSizeFieldOffset__Group_2_0__3 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3908:1: ( rule__GSSIfaceSizeFieldOffset__Group_2_0__2__Impl rule__GSSIfaceSizeFieldOffset__Group_2_0__3 )
            // InternalIFACE.g:3909:2: rule__GSSIfaceSizeFieldOffset__Group_2_0__2__Impl rule__GSSIfaceSizeFieldOffset__Group_2_0__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSizeFieldOffset__Group_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__Group_2_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group_2_0__2"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group_2_0__2__Impl"
    // InternalIFACE.g:3916:1: rule__GSSIfaceSizeFieldOffset__Group_2_0__2__Impl : ( ( rule__GSSIfaceSizeFieldOffset__BytesAssignment_2_0_2 ) ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3920:1: ( ( ( rule__GSSIfaceSizeFieldOffset__BytesAssignment_2_0_2 ) ) )
            // InternalIFACE.g:3921:1: ( ( rule__GSSIfaceSizeFieldOffset__BytesAssignment_2_0_2 ) )
            {
            // InternalIFACE.g:3921:1: ( ( rule__GSSIfaceSizeFieldOffset__BytesAssignment_2_0_2 ) )
            // InternalIFACE.g:3922:2: ( rule__GSSIfaceSizeFieldOffset__BytesAssignment_2_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesAssignment_2_0_2()); 
            }
            // InternalIFACE.g:3923:2: ( rule__GSSIfaceSizeFieldOffset__BytesAssignment_2_0_2 )
            // InternalIFACE.g:3923:3: rule__GSSIfaceSizeFieldOffset__BytesAssignment_2_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__BytesAssignment_2_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesAssignment_2_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group_2_0__2__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group_2_0__3"
    // InternalIFACE.g:3931:1: rule__GSSIfaceSizeFieldOffset__Group_2_0__3 : rule__GSSIfaceSizeFieldOffset__Group_2_0__3__Impl ;
    public final void rule__GSSIfaceSizeFieldOffset__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3935:1: ( rule__GSSIfaceSizeFieldOffset__Group_2_0__3__Impl )
            // InternalIFACE.g:3936:2: rule__GSSIfaceSizeFieldOffset__Group_2_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__Group_2_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group_2_0__3"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group_2_0__3__Impl"
    // InternalIFACE.g:3942:1: rule__GSSIfaceSizeFieldOffset__Group_2_0__3__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3946:1: ( ( ';' ) )
            // InternalIFACE.g:3947:1: ( ';' )
            {
            // InternalIFACE.g:3947:1: ( ';' )
            // InternalIFACE.g:3948:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_2_0_3()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_2_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group_2_0__3__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group_2_1__0"
    // InternalIFACE.g:3958:1: rule__GSSIfaceSizeFieldOffset__Group_2_1__0 : rule__GSSIfaceSizeFieldOffset__Group_2_1__0__Impl rule__GSSIfaceSizeFieldOffset__Group_2_1__1 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3962:1: ( rule__GSSIfaceSizeFieldOffset__Group_2_1__0__Impl rule__GSSIfaceSizeFieldOffset__Group_2_1__1 )
            // InternalIFACE.g:3963:2: rule__GSSIfaceSizeFieldOffset__Group_2_1__0__Impl rule__GSSIfaceSizeFieldOffset__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceSizeFieldOffset__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group_2_1__0"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group_2_1__0__Impl"
    // InternalIFACE.g:3970:1: rule__GSSIfaceSizeFieldOffset__Group_2_1__0__Impl : ( 'bits' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3974:1: ( ( 'bits' ) )
            // InternalIFACE.g:3975:1: ( 'bits' )
            {
            // InternalIFACE.g:3975:1: ( 'bits' )
            // InternalIFACE.g:3976:2: 'bits'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsKeyword_2_1_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group_2_1__0__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group_2_1__1"
    // InternalIFACE.g:3985:1: rule__GSSIfaceSizeFieldOffset__Group_2_1__1 : rule__GSSIfaceSizeFieldOffset__Group_2_1__1__Impl rule__GSSIfaceSizeFieldOffset__Group_2_1__2 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3989:1: ( rule__GSSIfaceSizeFieldOffset__Group_2_1__1__Impl rule__GSSIfaceSizeFieldOffset__Group_2_1__2 )
            // InternalIFACE.g:3990:2: rule__GSSIfaceSizeFieldOffset__Group_2_1__1__Impl rule__GSSIfaceSizeFieldOffset__Group_2_1__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__GSSIfaceSizeFieldOffset__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__Group_2_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group_2_1__1"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group_2_1__1__Impl"
    // InternalIFACE.g:3997:1: rule__GSSIfaceSizeFieldOffset__Group_2_1__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4001:1: ( ( ':=' ) )
            // InternalIFACE.g:4002:1: ( ':=' )
            {
            // InternalIFACE.g:4002:1: ( ':=' )
            // InternalIFACE.g:4003:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getColonEqualsSignKeyword_2_1_1()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getColonEqualsSignKeyword_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group_2_1__1__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group_2_1__2"
    // InternalIFACE.g:4012:1: rule__GSSIfaceSizeFieldOffset__Group_2_1__2 : rule__GSSIfaceSizeFieldOffset__Group_2_1__2__Impl rule__GSSIfaceSizeFieldOffset__Group_2_1__3 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4016:1: ( rule__GSSIfaceSizeFieldOffset__Group_2_1__2__Impl rule__GSSIfaceSizeFieldOffset__Group_2_1__3 )
            // InternalIFACE.g:4017:2: rule__GSSIfaceSizeFieldOffset__Group_2_1__2__Impl rule__GSSIfaceSizeFieldOffset__Group_2_1__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSizeFieldOffset__Group_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__Group_2_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group_2_1__2"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group_2_1__2__Impl"
    // InternalIFACE.g:4024:1: rule__GSSIfaceSizeFieldOffset__Group_2_1__2__Impl : ( ( rule__GSSIfaceSizeFieldOffset__BitsAssignment_2_1_2 ) ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4028:1: ( ( ( rule__GSSIfaceSizeFieldOffset__BitsAssignment_2_1_2 ) ) )
            // InternalIFACE.g:4029:1: ( ( rule__GSSIfaceSizeFieldOffset__BitsAssignment_2_1_2 ) )
            {
            // InternalIFACE.g:4029:1: ( ( rule__GSSIfaceSizeFieldOffset__BitsAssignment_2_1_2 ) )
            // InternalIFACE.g:4030:2: ( rule__GSSIfaceSizeFieldOffset__BitsAssignment_2_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsAssignment_2_1_2()); 
            }
            // InternalIFACE.g:4031:2: ( rule__GSSIfaceSizeFieldOffset__BitsAssignment_2_1_2 )
            // InternalIFACE.g:4031:3: rule__GSSIfaceSizeFieldOffset__BitsAssignment_2_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__BitsAssignment_2_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsAssignment_2_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group_2_1__2__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group_2_1__3"
    // InternalIFACE.g:4039:1: rule__GSSIfaceSizeFieldOffset__Group_2_1__3 : rule__GSSIfaceSizeFieldOffset__Group_2_1__3__Impl ;
    public final void rule__GSSIfaceSizeFieldOffset__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4043:1: ( rule__GSSIfaceSizeFieldOffset__Group_2_1__3__Impl )
            // InternalIFACE.g:4044:2: rule__GSSIfaceSizeFieldOffset__Group_2_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__Group_2_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group_2_1__3"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__Group_2_1__3__Impl"
    // InternalIFACE.g:4050:1: rule__GSSIfaceSizeFieldOffset__Group_2_1__3__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4054:1: ( ( ';' ) )
            // InternalIFACE.g:4055:1: ( ';' )
            {
            // InternalIFACE.g:4055:1: ( ';' )
            // InternalIFACE.g:4056:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_2_1_3()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_2_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__Group_2_1__3__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group__0"
    // InternalIFACE.g:4066:1: rule__GSSIfaceSizeFieldTrim__Group__0 : rule__GSSIfaceSizeFieldTrim__Group__0__Impl rule__GSSIfaceSizeFieldTrim__Group__1 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4070:1: ( rule__GSSIfaceSizeFieldTrim__Group__0__Impl rule__GSSIfaceSizeFieldTrim__Group__1 )
            // InternalIFACE.g:4071:2: rule__GSSIfaceSizeFieldTrim__Group__0__Impl rule__GSSIfaceSizeFieldTrim__Group__1
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
    // InternalIFACE.g:4078:1: rule__GSSIfaceSizeFieldTrim__Group__0__Impl : ( 'sizeFieldTrim' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4082:1: ( ( 'sizeFieldTrim' ) )
            // InternalIFACE.g:4083:1: ( 'sizeFieldTrim' )
            {
            // InternalIFACE.g:4083:1: ( 'sizeFieldTrim' )
            // InternalIFACE.g:4084:2: 'sizeFieldTrim'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSizeFieldTrimKeyword_0()); 
            }
            match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4093:1: rule__GSSIfaceSizeFieldTrim__Group__1 : rule__GSSIfaceSizeFieldTrim__Group__1__Impl rule__GSSIfaceSizeFieldTrim__Group__2 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4097:1: ( rule__GSSIfaceSizeFieldTrim__Group__1__Impl rule__GSSIfaceSizeFieldTrim__Group__2 )
            // InternalIFACE.g:4098:2: rule__GSSIfaceSizeFieldTrim__Group__1__Impl rule__GSSIfaceSizeFieldTrim__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_23);
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
    // InternalIFACE.g:4105:1: rule__GSSIfaceSizeFieldTrim__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4109:1: ( ( '{' ) )
            // InternalIFACE.g:4110:1: ( '{' )
            {
            // InternalIFACE.g:4110:1: ( '{' )
            // InternalIFACE.g:4111:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4120:1: rule__GSSIfaceSizeFieldTrim__Group__2 : rule__GSSIfaceSizeFieldTrim__Group__2__Impl rule__GSSIfaceSizeFieldTrim__Group__3 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4124:1: ( rule__GSSIfaceSizeFieldTrim__Group__2__Impl rule__GSSIfaceSizeFieldTrim__Group__3 )
            // InternalIFACE.g:4125:2: rule__GSSIfaceSizeFieldTrim__Group__2__Impl rule__GSSIfaceSizeFieldTrim__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
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
    // InternalIFACE.g:4132:1: rule__GSSIfaceSizeFieldTrim__Group__2__Impl : ( ( rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2 ) ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4136:1: ( ( ( rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2 ) ) )
            // InternalIFACE.g:4137:1: ( ( rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2 ) )
            {
            // InternalIFACE.g:4137:1: ( ( rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2 ) )
            // InternalIFACE.g:4138:2: ( rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2()); 
            }
            // InternalIFACE.g:4139:2: ( rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2 )
            // InternalIFACE.g:4139:3: rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2()); 
            }

            }


            }

        }
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
    // InternalIFACE.g:4147:1: rule__GSSIfaceSizeFieldTrim__Group__3 : rule__GSSIfaceSizeFieldTrim__Group__3__Impl rule__GSSIfaceSizeFieldTrim__Group__4 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4151:1: ( rule__GSSIfaceSizeFieldTrim__Group__3__Impl rule__GSSIfaceSizeFieldTrim__Group__4 )
            // InternalIFACE.g:4152:2: rule__GSSIfaceSizeFieldTrim__Group__3__Impl rule__GSSIfaceSizeFieldTrim__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalIFACE.g:4159:1: rule__GSSIfaceSizeFieldTrim__Group__3__Impl : ( '}' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4163:1: ( ( '}' ) )
            // InternalIFACE.g:4164:1: ( '}' )
            {
            // InternalIFACE.g:4164:1: ( '}' )
            // InternalIFACE.g:4165:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
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
    // InternalIFACE.g:4174:1: rule__GSSIfaceSizeFieldTrim__Group__4 : rule__GSSIfaceSizeFieldTrim__Group__4__Impl ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4178:1: ( rule__GSSIfaceSizeFieldTrim__Group__4__Impl )
            // InternalIFACE.g:4179:2: rule__GSSIfaceSizeFieldTrim__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalIFACE.g:4185:1: rule__GSSIfaceSizeFieldTrim__Group__4__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4189:1: ( ( ';' ) )
            // InternalIFACE.g:4190:1: ( ';' )
            {
            // InternalIFACE.g:4190:1: ( ';' )
            // InternalIFACE.g:4191:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_4()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group_2_0__0"
    // InternalIFACE.g:4201:1: rule__GSSIfaceSizeFieldTrim__Group_2_0__0 : rule__GSSIfaceSizeFieldTrim__Group_2_0__0__Impl rule__GSSIfaceSizeFieldTrim__Group_2_0__1 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4205:1: ( rule__GSSIfaceSizeFieldTrim__Group_2_0__0__Impl rule__GSSIfaceSizeFieldTrim__Group_2_0__1 )
            // InternalIFACE.g:4206:2: rule__GSSIfaceSizeFieldTrim__Group_2_0__0__Impl rule__GSSIfaceSizeFieldTrim__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceSizeFieldTrim__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__Group_2_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group_2_0__0"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group_2_0__0__Impl"
    // InternalIFACE.g:4213:1: rule__GSSIfaceSizeFieldTrim__Group_2_0__0__Impl : ( 'bytes' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4217:1: ( ( 'bytes' ) )
            // InternalIFACE.g:4218:1: ( 'bytes' )
            {
            // InternalIFACE.g:4218:1: ( 'bytes' )
            // InternalIFACE.g:4219:2: 'bytes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesKeyword_2_0_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesKeyword_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group_2_0__0__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group_2_0__1"
    // InternalIFACE.g:4228:1: rule__GSSIfaceSizeFieldTrim__Group_2_0__1 : rule__GSSIfaceSizeFieldTrim__Group_2_0__1__Impl rule__GSSIfaceSizeFieldTrim__Group_2_0__2 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4232:1: ( rule__GSSIfaceSizeFieldTrim__Group_2_0__1__Impl rule__GSSIfaceSizeFieldTrim__Group_2_0__2 )
            // InternalIFACE.g:4233:2: rule__GSSIfaceSizeFieldTrim__Group_2_0__1__Impl rule__GSSIfaceSizeFieldTrim__Group_2_0__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__GSSIfaceSizeFieldTrim__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__Group_2_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group_2_0__1"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group_2_0__1__Impl"
    // InternalIFACE.g:4240:1: rule__GSSIfaceSizeFieldTrim__Group_2_0__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4244:1: ( ( ':=' ) )
            // InternalIFACE.g:4245:1: ( ':=' )
            {
            // InternalIFACE.g:4245:1: ( ':=' )
            // InternalIFACE.g:4246:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getColonEqualsSignKeyword_2_0_1()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getColonEqualsSignKeyword_2_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group_2_0__1__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group_2_0__2"
    // InternalIFACE.g:4255:1: rule__GSSIfaceSizeFieldTrim__Group_2_0__2 : rule__GSSIfaceSizeFieldTrim__Group_2_0__2__Impl rule__GSSIfaceSizeFieldTrim__Group_2_0__3 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4259:1: ( rule__GSSIfaceSizeFieldTrim__Group_2_0__2__Impl rule__GSSIfaceSizeFieldTrim__Group_2_0__3 )
            // InternalIFACE.g:4260:2: rule__GSSIfaceSizeFieldTrim__Group_2_0__2__Impl rule__GSSIfaceSizeFieldTrim__Group_2_0__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSizeFieldTrim__Group_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__Group_2_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group_2_0__2"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group_2_0__2__Impl"
    // InternalIFACE.g:4267:1: rule__GSSIfaceSizeFieldTrim__Group_2_0__2__Impl : ( ( rule__GSSIfaceSizeFieldTrim__BytesAssignment_2_0_2 ) ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4271:1: ( ( ( rule__GSSIfaceSizeFieldTrim__BytesAssignment_2_0_2 ) ) )
            // InternalIFACE.g:4272:1: ( ( rule__GSSIfaceSizeFieldTrim__BytesAssignment_2_0_2 ) )
            {
            // InternalIFACE.g:4272:1: ( ( rule__GSSIfaceSizeFieldTrim__BytesAssignment_2_0_2 ) )
            // InternalIFACE.g:4273:2: ( rule__GSSIfaceSizeFieldTrim__BytesAssignment_2_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesAssignment_2_0_2()); 
            }
            // InternalIFACE.g:4274:2: ( rule__GSSIfaceSizeFieldTrim__BytesAssignment_2_0_2 )
            // InternalIFACE.g:4274:3: rule__GSSIfaceSizeFieldTrim__BytesAssignment_2_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__BytesAssignment_2_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesAssignment_2_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group_2_0__2__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group_2_0__3"
    // InternalIFACE.g:4282:1: rule__GSSIfaceSizeFieldTrim__Group_2_0__3 : rule__GSSIfaceSizeFieldTrim__Group_2_0__3__Impl ;
    public final void rule__GSSIfaceSizeFieldTrim__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4286:1: ( rule__GSSIfaceSizeFieldTrim__Group_2_0__3__Impl )
            // InternalIFACE.g:4287:2: rule__GSSIfaceSizeFieldTrim__Group_2_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__Group_2_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group_2_0__3"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group_2_0__3__Impl"
    // InternalIFACE.g:4293:1: rule__GSSIfaceSizeFieldTrim__Group_2_0__3__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4297:1: ( ( ';' ) )
            // InternalIFACE.g:4298:1: ( ';' )
            {
            // InternalIFACE.g:4298:1: ( ';' )
            // InternalIFACE.g:4299:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_2_0_3()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_2_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group_2_0__3__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group_2_1__0"
    // InternalIFACE.g:4309:1: rule__GSSIfaceSizeFieldTrim__Group_2_1__0 : rule__GSSIfaceSizeFieldTrim__Group_2_1__0__Impl rule__GSSIfaceSizeFieldTrim__Group_2_1__1 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4313:1: ( rule__GSSIfaceSizeFieldTrim__Group_2_1__0__Impl rule__GSSIfaceSizeFieldTrim__Group_2_1__1 )
            // InternalIFACE.g:4314:2: rule__GSSIfaceSizeFieldTrim__Group_2_1__0__Impl rule__GSSIfaceSizeFieldTrim__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceSizeFieldTrim__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group_2_1__0"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group_2_1__0__Impl"
    // InternalIFACE.g:4321:1: rule__GSSIfaceSizeFieldTrim__Group_2_1__0__Impl : ( 'bits' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4325:1: ( ( 'bits' ) )
            // InternalIFACE.g:4326:1: ( 'bits' )
            {
            // InternalIFACE.g:4326:1: ( 'bits' )
            // InternalIFACE.g:4327:2: 'bits'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsKeyword_2_1_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group_2_1__0__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group_2_1__1"
    // InternalIFACE.g:4336:1: rule__GSSIfaceSizeFieldTrim__Group_2_1__1 : rule__GSSIfaceSizeFieldTrim__Group_2_1__1__Impl rule__GSSIfaceSizeFieldTrim__Group_2_1__2 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4340:1: ( rule__GSSIfaceSizeFieldTrim__Group_2_1__1__Impl rule__GSSIfaceSizeFieldTrim__Group_2_1__2 )
            // InternalIFACE.g:4341:2: rule__GSSIfaceSizeFieldTrim__Group_2_1__1__Impl rule__GSSIfaceSizeFieldTrim__Group_2_1__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__GSSIfaceSizeFieldTrim__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__Group_2_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group_2_1__1"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group_2_1__1__Impl"
    // InternalIFACE.g:4348:1: rule__GSSIfaceSizeFieldTrim__Group_2_1__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4352:1: ( ( ':=' ) )
            // InternalIFACE.g:4353:1: ( ':=' )
            {
            // InternalIFACE.g:4353:1: ( ':=' )
            // InternalIFACE.g:4354:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getColonEqualsSignKeyword_2_1_1()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getColonEqualsSignKeyword_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group_2_1__1__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group_2_1__2"
    // InternalIFACE.g:4363:1: rule__GSSIfaceSizeFieldTrim__Group_2_1__2 : rule__GSSIfaceSizeFieldTrim__Group_2_1__2__Impl rule__GSSIfaceSizeFieldTrim__Group_2_1__3 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4367:1: ( rule__GSSIfaceSizeFieldTrim__Group_2_1__2__Impl rule__GSSIfaceSizeFieldTrim__Group_2_1__3 )
            // InternalIFACE.g:4368:2: rule__GSSIfaceSizeFieldTrim__Group_2_1__2__Impl rule__GSSIfaceSizeFieldTrim__Group_2_1__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSizeFieldTrim__Group_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__Group_2_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group_2_1__2"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group_2_1__2__Impl"
    // InternalIFACE.g:4375:1: rule__GSSIfaceSizeFieldTrim__Group_2_1__2__Impl : ( ( rule__GSSIfaceSizeFieldTrim__BitsAssignment_2_1_2 ) ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4379:1: ( ( ( rule__GSSIfaceSizeFieldTrim__BitsAssignment_2_1_2 ) ) )
            // InternalIFACE.g:4380:1: ( ( rule__GSSIfaceSizeFieldTrim__BitsAssignment_2_1_2 ) )
            {
            // InternalIFACE.g:4380:1: ( ( rule__GSSIfaceSizeFieldTrim__BitsAssignment_2_1_2 ) )
            // InternalIFACE.g:4381:2: ( rule__GSSIfaceSizeFieldTrim__BitsAssignment_2_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsAssignment_2_1_2()); 
            }
            // InternalIFACE.g:4382:2: ( rule__GSSIfaceSizeFieldTrim__BitsAssignment_2_1_2 )
            // InternalIFACE.g:4382:3: rule__GSSIfaceSizeFieldTrim__BitsAssignment_2_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__BitsAssignment_2_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsAssignment_2_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group_2_1__2__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group_2_1__3"
    // InternalIFACE.g:4390:1: rule__GSSIfaceSizeFieldTrim__Group_2_1__3 : rule__GSSIfaceSizeFieldTrim__Group_2_1__3__Impl ;
    public final void rule__GSSIfaceSizeFieldTrim__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4394:1: ( rule__GSSIfaceSizeFieldTrim__Group_2_1__3__Impl )
            // InternalIFACE.g:4395:2: rule__GSSIfaceSizeFieldTrim__Group_2_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__Group_2_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group_2_1__3"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__Group_2_1__3__Impl"
    // InternalIFACE.g:4401:1: rule__GSSIfaceSizeFieldTrim__Group_2_1__3__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4405:1: ( ( ';' ) )
            // InternalIFACE.g:4406:1: ( ';' )
            {
            // InternalIFACE.g:4406:1: ( ';' )
            // InternalIFACE.g:4407:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_2_1_3()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_2_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__Group_2_1__3__Impl"


    // $ANTLR start "rule__GSSIfaceSyncPattern__Group__0"
    // InternalIFACE.g:4417:1: rule__GSSIfaceSyncPattern__Group__0 : rule__GSSIfaceSyncPattern__Group__0__Impl rule__GSSIfaceSyncPattern__Group__1 ;
    public final void rule__GSSIfaceSyncPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4421:1: ( rule__GSSIfaceSyncPattern__Group__0__Impl rule__GSSIfaceSyncPattern__Group__1 )
            // InternalIFACE.g:4422:2: rule__GSSIfaceSyncPattern__Group__0__Impl rule__GSSIfaceSyncPattern__Group__1
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
    // InternalIFACE.g:4429:1: rule__GSSIfaceSyncPattern__Group__0__Impl : ( 'syncPattern' ) ;
    public final void rule__GSSIfaceSyncPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4433:1: ( ( 'syncPattern' ) )
            // InternalIFACE.g:4434:1: ( 'syncPattern' )
            {
            // InternalIFACE.g:4434:1: ( 'syncPattern' )
            // InternalIFACE.g:4435:2: 'syncPattern'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getSyncPatternKeyword_0()); 
            }
            match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4444:1: rule__GSSIfaceSyncPattern__Group__1 : rule__GSSIfaceSyncPattern__Group__1__Impl rule__GSSIfaceSyncPattern__Group__2 ;
    public final void rule__GSSIfaceSyncPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4448:1: ( rule__GSSIfaceSyncPattern__Group__1__Impl rule__GSSIfaceSyncPattern__Group__2 )
            // InternalIFACE.g:4449:2: rule__GSSIfaceSyncPattern__Group__1__Impl rule__GSSIfaceSyncPattern__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
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
    // InternalIFACE.g:4456:1: rule__GSSIfaceSyncPattern__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceSyncPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4460:1: ( ( '{' ) )
            // InternalIFACE.g:4461:1: ( '{' )
            {
            // InternalIFACE.g:4461:1: ( '{' )
            // InternalIFACE.g:4462:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4471:1: rule__GSSIfaceSyncPattern__Group__2 : rule__GSSIfaceSyncPattern__Group__2__Impl rule__GSSIfaceSyncPattern__Group__3 ;
    public final void rule__GSSIfaceSyncPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4475:1: ( rule__GSSIfaceSyncPattern__Group__2__Impl rule__GSSIfaceSyncPattern__Group__3 )
            // InternalIFACE.g:4476:2: rule__GSSIfaceSyncPattern__Group__2__Impl rule__GSSIfaceSyncPattern__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
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
    // InternalIFACE.g:4483:1: rule__GSSIfaceSyncPattern__Group__2__Impl : ( ( rule__GSSIfaceSyncPattern__Group_2__0 ) ) ;
    public final void rule__GSSIfaceSyncPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4487:1: ( ( ( rule__GSSIfaceSyncPattern__Group_2__0 ) ) )
            // InternalIFACE.g:4488:1: ( ( rule__GSSIfaceSyncPattern__Group_2__0 ) )
            {
            // InternalIFACE.g:4488:1: ( ( rule__GSSIfaceSyncPattern__Group_2__0 ) )
            // InternalIFACE.g:4489:2: ( rule__GSSIfaceSyncPattern__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getGroup_2()); 
            }
            // InternalIFACE.g:4490:2: ( rule__GSSIfaceSyncPattern__Group_2__0 )
            // InternalIFACE.g:4490:3: rule__GSSIfaceSyncPattern__Group_2__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSyncPattern__Group_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSyncPatternAccess().getGroup_2()); 
            }

            }


            }

        }
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
    // InternalIFACE.g:4498:1: rule__GSSIfaceSyncPattern__Group__3 : rule__GSSIfaceSyncPattern__Group__3__Impl rule__GSSIfaceSyncPattern__Group__4 ;
    public final void rule__GSSIfaceSyncPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4502:1: ( rule__GSSIfaceSyncPattern__Group__3__Impl rule__GSSIfaceSyncPattern__Group__4 )
            // InternalIFACE.g:4503:2: rule__GSSIfaceSyncPattern__Group__3__Impl rule__GSSIfaceSyncPattern__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalIFACE.g:4510:1: rule__GSSIfaceSyncPattern__Group__3__Impl : ( '}' ) ;
    public final void rule__GSSIfaceSyncPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4514:1: ( ( '}' ) )
            // InternalIFACE.g:4515:1: ( '}' )
            {
            // InternalIFACE.g:4515:1: ( '}' )
            // InternalIFACE.g:4516:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSyncPatternAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
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
    // InternalIFACE.g:4525:1: rule__GSSIfaceSyncPattern__Group__4 : rule__GSSIfaceSyncPattern__Group__4__Impl ;
    public final void rule__GSSIfaceSyncPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4529:1: ( rule__GSSIfaceSyncPattern__Group__4__Impl )
            // InternalIFACE.g:4530:2: rule__GSSIfaceSyncPattern__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSyncPattern__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalIFACE.g:4536:1: rule__GSSIfaceSyncPattern__Group__4__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSyncPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4540:1: ( ( ';' ) )
            // InternalIFACE.g:4541:1: ( ';' )
            {
            // InternalIFACE.g:4541:1: ( ';' )
            // InternalIFACE.g:4542:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getSemicolonKeyword_4()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSyncPatternAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__GSSIfaceSyncPattern__Group_2__0"
    // InternalIFACE.g:4552:1: rule__GSSIfaceSyncPattern__Group_2__0 : rule__GSSIfaceSyncPattern__Group_2__0__Impl rule__GSSIfaceSyncPattern__Group_2__1 ;
    public final void rule__GSSIfaceSyncPattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4556:1: ( rule__GSSIfaceSyncPattern__Group_2__0__Impl rule__GSSIfaceSyncPattern__Group_2__1 )
            // InternalIFACE.g:4557:2: rule__GSSIfaceSyncPattern__Group_2__0__Impl rule__GSSIfaceSyncPattern__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceSyncPattern__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSyncPattern__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSyncPattern__Group_2__0"


    // $ANTLR start "rule__GSSIfaceSyncPattern__Group_2__0__Impl"
    // InternalIFACE.g:4564:1: rule__GSSIfaceSyncPattern__Group_2__0__Impl : ( 'hexValue' ) ;
    public final void rule__GSSIfaceSyncPattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4568:1: ( ( 'hexValue' ) )
            // InternalIFACE.g:4569:1: ( 'hexValue' )
            {
            // InternalIFACE.g:4569:1: ( 'hexValue' )
            // InternalIFACE.g:4570:2: 'hexValue'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueKeyword_2_0()); 
            }
            match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSyncPattern__Group_2__0__Impl"


    // $ANTLR start "rule__GSSIfaceSyncPattern__Group_2__1"
    // InternalIFACE.g:4579:1: rule__GSSIfaceSyncPattern__Group_2__1 : rule__GSSIfaceSyncPattern__Group_2__1__Impl rule__GSSIfaceSyncPattern__Group_2__2 ;
    public final void rule__GSSIfaceSyncPattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4583:1: ( rule__GSSIfaceSyncPattern__Group_2__1__Impl rule__GSSIfaceSyncPattern__Group_2__2 )
            // InternalIFACE.g:4584:2: rule__GSSIfaceSyncPattern__Group_2__1__Impl rule__GSSIfaceSyncPattern__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__GSSIfaceSyncPattern__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSyncPattern__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSyncPattern__Group_2__1"


    // $ANTLR start "rule__GSSIfaceSyncPattern__Group_2__1__Impl"
    // InternalIFACE.g:4591:1: rule__GSSIfaceSyncPattern__Group_2__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSyncPattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4595:1: ( ( ':=' ) )
            // InternalIFACE.g:4596:1: ( ':=' )
            {
            // InternalIFACE.g:4596:1: ( ':=' )
            // InternalIFACE.g:4597:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getColonEqualsSignKeyword_2_1()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSyncPatternAccess().getColonEqualsSignKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSyncPattern__Group_2__1__Impl"


    // $ANTLR start "rule__GSSIfaceSyncPattern__Group_2__2"
    // InternalIFACE.g:4606:1: rule__GSSIfaceSyncPattern__Group_2__2 : rule__GSSIfaceSyncPattern__Group_2__2__Impl rule__GSSIfaceSyncPattern__Group_2__3 ;
    public final void rule__GSSIfaceSyncPattern__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4610:1: ( rule__GSSIfaceSyncPattern__Group_2__2__Impl rule__GSSIfaceSyncPattern__Group_2__3 )
            // InternalIFACE.g:4611:2: rule__GSSIfaceSyncPattern__Group_2__2__Impl rule__GSSIfaceSyncPattern__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSyncPattern__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSyncPattern__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSyncPattern__Group_2__2"


    // $ANTLR start "rule__GSSIfaceSyncPattern__Group_2__2__Impl"
    // InternalIFACE.g:4618:1: rule__GSSIfaceSyncPattern__Group_2__2__Impl : ( ( rule__GSSIfaceSyncPattern__HexValueAssignment_2_2 ) ) ;
    public final void rule__GSSIfaceSyncPattern__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4622:1: ( ( ( rule__GSSIfaceSyncPattern__HexValueAssignment_2_2 ) ) )
            // InternalIFACE.g:4623:1: ( ( rule__GSSIfaceSyncPattern__HexValueAssignment_2_2 ) )
            {
            // InternalIFACE.g:4623:1: ( ( rule__GSSIfaceSyncPattern__HexValueAssignment_2_2 ) )
            // InternalIFACE.g:4624:2: ( rule__GSSIfaceSyncPattern__HexValueAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueAssignment_2_2()); 
            }
            // InternalIFACE.g:4625:2: ( rule__GSSIfaceSyncPattern__HexValueAssignment_2_2 )
            // InternalIFACE.g:4625:3: rule__GSSIfaceSyncPattern__HexValueAssignment_2_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSyncPattern__HexValueAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSyncPattern__Group_2__2__Impl"


    // $ANTLR start "rule__GSSIfaceSyncPattern__Group_2__3"
    // InternalIFACE.g:4633:1: rule__GSSIfaceSyncPattern__Group_2__3 : rule__GSSIfaceSyncPattern__Group_2__3__Impl ;
    public final void rule__GSSIfaceSyncPattern__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4637:1: ( rule__GSSIfaceSyncPattern__Group_2__3__Impl )
            // InternalIFACE.g:4638:2: rule__GSSIfaceSyncPattern__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSyncPattern__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSyncPattern__Group_2__3"


    // $ANTLR start "rule__GSSIfaceSyncPattern__Group_2__3__Impl"
    // InternalIFACE.g:4644:1: rule__GSSIfaceSyncPattern__Group_2__3__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSyncPattern__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4648:1: ( ( ';' ) )
            // InternalIFACE.g:4649:1: ( ';' )
            {
            // InternalIFACE.g:4649:1: ( ';' )
            // InternalIFACE.g:4650:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getSemicolonKeyword_2_3()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSyncPatternAccess().getSemicolonKeyword_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSyncPattern__Group_2__3__Impl"


    // $ANTLR start "rule__GSSIfaceSpWTCPort__Group__0"
    // InternalIFACE.g:4660:1: rule__GSSIfaceSpWTCPort__Group__0 : rule__GSSIfaceSpWTCPort__Group__0__Impl rule__GSSIfaceSpWTCPort__Group__1 ;
    public final void rule__GSSIfaceSpWTCPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4664:1: ( rule__GSSIfaceSpWTCPort__Group__0__Impl rule__GSSIfaceSpWTCPort__Group__1 )
            // InternalIFACE.g:4665:2: rule__GSSIfaceSpWTCPort__Group__0__Impl rule__GSSIfaceSpWTCPort__Group__1
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
    // InternalIFACE.g:4672:1: rule__GSSIfaceSpWTCPort__Group__0__Impl : ( 'spwTCPort' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4676:1: ( ( 'spwTCPort' ) )
            // InternalIFACE.g:4677:1: ( 'spwTCPort' )
            {
            // InternalIFACE.g:4677:1: ( 'spwTCPort' )
            // InternalIFACE.g:4678:2: 'spwTCPort'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwTCPortKeyword_0()); 
            }
            match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4687:1: rule__GSSIfaceSpWTCPort__Group__1 : rule__GSSIfaceSpWTCPort__Group__1__Impl rule__GSSIfaceSpWTCPort__Group__2 ;
    public final void rule__GSSIfaceSpWTCPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4691:1: ( rule__GSSIfaceSpWTCPort__Group__1__Impl rule__GSSIfaceSpWTCPort__Group__2 )
            // InternalIFACE.g:4692:2: rule__GSSIfaceSpWTCPort__Group__1__Impl rule__GSSIfaceSpWTCPort__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_27);
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
    // InternalIFACE.g:4699:1: rule__GSSIfaceSpWTCPort__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4703:1: ( ( '{' ) )
            // InternalIFACE.g:4704:1: ( '{' )
            {
            // InternalIFACE.g:4704:1: ( '{' )
            // InternalIFACE.g:4705:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4714:1: rule__GSSIfaceSpWTCPort__Group__2 : rule__GSSIfaceSpWTCPort__Group__2__Impl rule__GSSIfaceSpWTCPort__Group__3 ;
    public final void rule__GSSIfaceSpWTCPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4718:1: ( rule__GSSIfaceSpWTCPort__Group__2__Impl rule__GSSIfaceSpWTCPort__Group__3 )
            // InternalIFACE.g:4719:2: rule__GSSIfaceSpWTCPort__Group__2__Impl rule__GSSIfaceSpWTCPort__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
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
    // InternalIFACE.g:4726:1: rule__GSSIfaceSpWTCPort__Group__2__Impl : ( ( rule__GSSIfaceSpWTCPort__Group_2__0 ) ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4730:1: ( ( ( rule__GSSIfaceSpWTCPort__Group_2__0 ) ) )
            // InternalIFACE.g:4731:1: ( ( rule__GSSIfaceSpWTCPort__Group_2__0 ) )
            {
            // InternalIFACE.g:4731:1: ( ( rule__GSSIfaceSpWTCPort__Group_2__0 ) )
            // InternalIFACE.g:4732:2: ( rule__GSSIfaceSpWTCPort__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getGroup_2()); 
            }
            // InternalIFACE.g:4733:2: ( rule__GSSIfaceSpWTCPort__Group_2__0 )
            // InternalIFACE.g:4733:3: rule__GSSIfaceSpWTCPort__Group_2__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWTCPort__Group_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWTCPortAccess().getGroup_2()); 
            }

            }


            }

        }
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
    // InternalIFACE.g:4741:1: rule__GSSIfaceSpWTCPort__Group__3 : rule__GSSIfaceSpWTCPort__Group__3__Impl rule__GSSIfaceSpWTCPort__Group__4 ;
    public final void rule__GSSIfaceSpWTCPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4745:1: ( rule__GSSIfaceSpWTCPort__Group__3__Impl rule__GSSIfaceSpWTCPort__Group__4 )
            // InternalIFACE.g:4746:2: rule__GSSIfaceSpWTCPort__Group__3__Impl rule__GSSIfaceSpWTCPort__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalIFACE.g:4753:1: rule__GSSIfaceSpWTCPort__Group__3__Impl : ( '}' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4757:1: ( ( '}' ) )
            // InternalIFACE.g:4758:1: ( '}' )
            {
            // InternalIFACE.g:4758:1: ( '}' )
            // InternalIFACE.g:4759:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWTCPortAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
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
    // InternalIFACE.g:4768:1: rule__GSSIfaceSpWTCPort__Group__4 : rule__GSSIfaceSpWTCPort__Group__4__Impl ;
    public final void rule__GSSIfaceSpWTCPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4772:1: ( rule__GSSIfaceSpWTCPort__Group__4__Impl )
            // InternalIFACE.g:4773:2: rule__GSSIfaceSpWTCPort__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWTCPort__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalIFACE.g:4779:1: rule__GSSIfaceSpWTCPort__Group__4__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4783:1: ( ( ';' ) )
            // InternalIFACE.g:4784:1: ( ';' )
            {
            // InternalIFACE.g:4784:1: ( ';' )
            // InternalIFACE.g:4785:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSemicolonKeyword_4()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWTCPortAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__GSSIfaceSpWTCPort__Group_2__0"
    // InternalIFACE.g:4795:1: rule__GSSIfaceSpWTCPort__Group_2__0 : rule__GSSIfaceSpWTCPort__Group_2__0__Impl rule__GSSIfaceSpWTCPort__Group_2__1 ;
    public final void rule__GSSIfaceSpWTCPort__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4799:1: ( rule__GSSIfaceSpWTCPort__Group_2__0__Impl rule__GSSIfaceSpWTCPort__Group_2__1 )
            // InternalIFACE.g:4800:2: rule__GSSIfaceSpWTCPort__Group_2__0__Impl rule__GSSIfaceSpWTCPort__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceSpWTCPort__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWTCPort__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWTCPort__Group_2__0"


    // $ANTLR start "rule__GSSIfaceSpWTCPort__Group_2__0__Impl"
    // InternalIFACE.g:4807:1: rule__GSSIfaceSpWTCPort__Group_2__0__Impl : ( 'spwPortRef' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4811:1: ( ( 'spwPortRef' ) )
            // InternalIFACE.g:4812:1: ( 'spwPortRef' )
            {
            // InternalIFACE.g:4812:1: ( 'spwPortRef' )
            // InternalIFACE.g:4813:2: 'spwPortRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefKeyword_2_0()); 
            }
            match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWTCPort__Group_2__0__Impl"


    // $ANTLR start "rule__GSSIfaceSpWTCPort__Group_2__1"
    // InternalIFACE.g:4822:1: rule__GSSIfaceSpWTCPort__Group_2__1 : rule__GSSIfaceSpWTCPort__Group_2__1__Impl rule__GSSIfaceSpWTCPort__Group_2__2 ;
    public final void rule__GSSIfaceSpWTCPort__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4826:1: ( rule__GSSIfaceSpWTCPort__Group_2__1__Impl rule__GSSIfaceSpWTCPort__Group_2__2 )
            // InternalIFACE.g:4827:2: rule__GSSIfaceSpWTCPort__Group_2__1__Impl rule__GSSIfaceSpWTCPort__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__GSSIfaceSpWTCPort__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWTCPort__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWTCPort__Group_2__1"


    // $ANTLR start "rule__GSSIfaceSpWTCPort__Group_2__1__Impl"
    // InternalIFACE.g:4834:1: rule__GSSIfaceSpWTCPort__Group_2__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4838:1: ( ( ':=' ) )
            // InternalIFACE.g:4839:1: ( ':=' )
            {
            // InternalIFACE.g:4839:1: ( ':=' )
            // InternalIFACE.g:4840:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getColonEqualsSignKeyword_2_1()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWTCPortAccess().getColonEqualsSignKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWTCPort__Group_2__1__Impl"


    // $ANTLR start "rule__GSSIfaceSpWTCPort__Group_2__2"
    // InternalIFACE.g:4849:1: rule__GSSIfaceSpWTCPort__Group_2__2 : rule__GSSIfaceSpWTCPort__Group_2__2__Impl rule__GSSIfaceSpWTCPort__Group_2__3 ;
    public final void rule__GSSIfaceSpWTCPort__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4853:1: ( rule__GSSIfaceSpWTCPort__Group_2__2__Impl rule__GSSIfaceSpWTCPort__Group_2__3 )
            // InternalIFACE.g:4854:2: rule__GSSIfaceSpWTCPort__Group_2__2__Impl rule__GSSIfaceSpWTCPort__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSpWTCPort__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWTCPort__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWTCPort__Group_2__2"


    // $ANTLR start "rule__GSSIfaceSpWTCPort__Group_2__2__Impl"
    // InternalIFACE.g:4861:1: rule__GSSIfaceSpWTCPort__Group_2__2__Impl : ( ( rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_2_2 ) ) ;
    public final void rule__GSSIfaceSpWTCPort__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4865:1: ( ( ( rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_2_2 ) ) )
            // InternalIFACE.g:4866:1: ( ( rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_2_2 ) )
            {
            // InternalIFACE.g:4866:1: ( ( rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_2_2 ) )
            // InternalIFACE.g:4867:2: ( rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefAssignment_2_2()); 
            }
            // InternalIFACE.g:4868:2: ( rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_2_2 )
            // InternalIFACE.g:4868:3: rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_2_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWTCPort__Group_2__2__Impl"


    // $ANTLR start "rule__GSSIfaceSpWTCPort__Group_2__3"
    // InternalIFACE.g:4876:1: rule__GSSIfaceSpWTCPort__Group_2__3 : rule__GSSIfaceSpWTCPort__Group_2__3__Impl ;
    public final void rule__GSSIfaceSpWTCPort__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4880:1: ( rule__GSSIfaceSpWTCPort__Group_2__3__Impl )
            // InternalIFACE.g:4881:2: rule__GSSIfaceSpWTCPort__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWTCPort__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWTCPort__Group_2__3"


    // $ANTLR start "rule__GSSIfaceSpWTCPort__Group_2__3__Impl"
    // InternalIFACE.g:4887:1: rule__GSSIfaceSpWTCPort__Group_2__3__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4891:1: ( ( ';' ) )
            // InternalIFACE.g:4892:1: ( ';' )
            {
            // InternalIFACE.g:4892:1: ( ';' )
            // InternalIFACE.g:4893:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSemicolonKeyword_2_3()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWTCPortAccess().getSemicolonKeyword_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWTCPort__Group_2__3__Impl"


    // $ANTLR start "rule__GSSIfaceDummyPort__Group__0"
    // InternalIFACE.g:4903:1: rule__GSSIfaceDummyPort__Group__0 : rule__GSSIfaceDummyPort__Group__0__Impl rule__GSSIfaceDummyPort__Group__1 ;
    public final void rule__GSSIfaceDummyPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4907:1: ( rule__GSSIfaceDummyPort__Group__0__Impl rule__GSSIfaceDummyPort__Group__1 )
            // InternalIFACE.g:4908:2: rule__GSSIfaceDummyPort__Group__0__Impl rule__GSSIfaceDummyPort__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
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
    // InternalIFACE.g:4915:1: rule__GSSIfaceDummyPort__Group__0__Impl : ( () ) ;
    public final void rule__GSSIfaceDummyPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4919:1: ( ( () ) )
            // InternalIFACE.g:4920:1: ( () )
            {
            // InternalIFACE.g:4920:1: ( () )
            // InternalIFACE.g:4921:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceDummyPortAccess().getGSSIfaceDummyPortAction_0()); 
            }
            // InternalIFACE.g:4922:2: ()
            // InternalIFACE.g:4922:3: 
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
    // InternalIFACE.g:4930:1: rule__GSSIfaceDummyPort__Group__1 : rule__GSSIfaceDummyPort__Group__1__Impl rule__GSSIfaceDummyPort__Group__2 ;
    public final void rule__GSSIfaceDummyPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4934:1: ( rule__GSSIfaceDummyPort__Group__1__Impl rule__GSSIfaceDummyPort__Group__2 )
            // InternalIFACE.g:4935:2: rule__GSSIfaceDummyPort__Group__1__Impl rule__GSSIfaceDummyPort__Group__2
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
    // InternalIFACE.g:4942:1: rule__GSSIfaceDummyPort__Group__1__Impl : ( 'dummyPort' ) ;
    public final void rule__GSSIfaceDummyPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4946:1: ( ( 'dummyPort' ) )
            // InternalIFACE.g:4947:1: ( 'dummyPort' )
            {
            // InternalIFACE.g:4947:1: ( 'dummyPort' )
            // InternalIFACE.g:4948:2: 'dummyPort'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceDummyPortAccess().getDummyPortKeyword_1()); 
            }
            match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4957:1: rule__GSSIfaceDummyPort__Group__2 : rule__GSSIfaceDummyPort__Group__2__Impl rule__GSSIfaceDummyPort__Group__3 ;
    public final void rule__GSSIfaceDummyPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4961:1: ( rule__GSSIfaceDummyPort__Group__2__Impl rule__GSSIfaceDummyPort__Group__3 )
            // InternalIFACE.g:4962:2: rule__GSSIfaceDummyPort__Group__2__Impl rule__GSSIfaceDummyPort__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
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
    // InternalIFACE.g:4969:1: rule__GSSIfaceDummyPort__Group__2__Impl : ( '{' ) ;
    public final void rule__GSSIfaceDummyPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4973:1: ( ( '{' ) )
            // InternalIFACE.g:4974:1: ( '{' )
            {
            // InternalIFACE.g:4974:1: ( '{' )
            // InternalIFACE.g:4975:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceDummyPortAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4984:1: rule__GSSIfaceDummyPort__Group__3 : rule__GSSIfaceDummyPort__Group__3__Impl rule__GSSIfaceDummyPort__Group__4 ;
    public final void rule__GSSIfaceDummyPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4988:1: ( rule__GSSIfaceDummyPort__Group__3__Impl rule__GSSIfaceDummyPort__Group__4 )
            // InternalIFACE.g:4989:2: rule__GSSIfaceDummyPort__Group__3__Impl rule__GSSIfaceDummyPort__Group__4
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
    // InternalIFACE.g:4996:1: rule__GSSIfaceDummyPort__Group__3__Impl : ( '}' ) ;
    public final void rule__GSSIfaceDummyPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5000:1: ( ( '}' ) )
            // InternalIFACE.g:5001:1: ( '}' )
            {
            // InternalIFACE.g:5001:1: ( '}' )
            // InternalIFACE.g:5002:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceDummyPortAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:5011:1: rule__GSSIfaceDummyPort__Group__4 : rule__GSSIfaceDummyPort__Group__4__Impl ;
    public final void rule__GSSIfaceDummyPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5015:1: ( rule__GSSIfaceDummyPort__Group__4__Impl )
            // InternalIFACE.g:5016:2: rule__GSSIfaceDummyPort__Group__4__Impl
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
    // InternalIFACE.g:5022:1: rule__GSSIfaceDummyPort__Group__4__Impl : ( ';' ) ;
    public final void rule__GSSIfaceDummyPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5026:1: ( ( ';' ) )
            // InternalIFACE.g:5027:1: ( ';' )
            {
            // InternalIFACE.g:5027:1: ( ';' )
            // InternalIFACE.g:5028:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceDummyPortAccess().getSemicolonKeyword_4()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:5038:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5042:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalIFACE.g:5043:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalIFACE.g:5050:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5054:1: ( ( RULE_ID ) )
            // InternalIFACE.g:5055:1: ( RULE_ID )
            {
            // InternalIFACE.g:5055:1: ( RULE_ID )
            // InternalIFACE.g:5056:2: RULE_ID
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
    // InternalIFACE.g:5065:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5069:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalIFACE.g:5070:2: rule__QualifiedName__Group__1__Impl
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
    // InternalIFACE.g:5076:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5080:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalIFACE.g:5081:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalIFACE.g:5081:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalIFACE.g:5082:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalIFACE.g:5083:2: ( rule__QualifiedName__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==65) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalIFACE.g:5083:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_29);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalIFACE.g:5092:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5096:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalIFACE.g:5097:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalIFACE.g:5104:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5108:1: ( ( '.' ) )
            // InternalIFACE.g:5109:1: ( '.' )
            {
            // InternalIFACE.g:5109:1: ( '.' )
            // InternalIFACE.g:5110:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:5119:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5123:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalIFACE.g:5124:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalIFACE.g:5130:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5134:1: ( ( RULE_ID ) )
            // InternalIFACE.g:5135:1: ( RULE_ID )
            {
            // InternalIFACE.g:5135:1: ( RULE_ID )
            // InternalIFACE.g:5136:2: RULE_ID
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
    // InternalIFACE.g:5146:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5150:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalIFACE.g:5151:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalIFACE.g:5158:1: rule__Version__Group__0__Impl : ( ( rule__Version__Alternatives_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5162:1: ( ( ( rule__Version__Alternatives_0 ) ) )
            // InternalIFACE.g:5163:1: ( ( rule__Version__Alternatives_0 ) )
            {
            // InternalIFACE.g:5163:1: ( ( rule__Version__Alternatives_0 ) )
            // InternalIFACE.g:5164:2: ( rule__Version__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_0()); 
            }
            // InternalIFACE.g:5165:2: ( rule__Version__Alternatives_0 )
            // InternalIFACE.g:5165:3: rule__Version__Alternatives_0
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
    // InternalIFACE.g:5173:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5177:1: ( rule__Version__Group__1__Impl )
            // InternalIFACE.g:5178:2: rule__Version__Group__1__Impl
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
    // InternalIFACE.g:5184:1: rule__Version__Group__1__Impl : ( ( rule__Version__Group_1__0 )* ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5188:1: ( ( ( rule__Version__Group_1__0 )* ) )
            // InternalIFACE.g:5189:1: ( ( rule__Version__Group_1__0 )* )
            {
            // InternalIFACE.g:5189:1: ( ( rule__Version__Group_1__0 )* )
            // InternalIFACE.g:5190:2: ( rule__Version__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1()); 
            }
            // InternalIFACE.g:5191:2: ( rule__Version__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==65) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalIFACE.g:5191:3: rule__Version__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_29);
            	    rule__Version__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalIFACE.g:5200:1: rule__Version__Group_0_1__0 : rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 ;
    public final void rule__Version__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5204:1: ( rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 )
            // InternalIFACE.g:5205:2: rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1
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
    // InternalIFACE.g:5212:1: rule__Version__Group_0_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5216:1: ( ( ( RULE_INT )? ) )
            // InternalIFACE.g:5217:1: ( ( RULE_INT )? )
            {
            // InternalIFACE.g:5217:1: ( ( RULE_INT )? )
            // InternalIFACE.g:5218:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
            }
            // InternalIFACE.g:5219:2: ( RULE_INT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalIFACE.g:5219:3: RULE_INT
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
    // InternalIFACE.g:5227:1: rule__Version__Group_0_1__1 : rule__Version__Group_0_1__1__Impl ;
    public final void rule__Version__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5231:1: ( rule__Version__Group_0_1__1__Impl )
            // InternalIFACE.g:5232:2: rule__Version__Group_0_1__1__Impl
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
    // InternalIFACE.g:5238:1: rule__Version__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5242:1: ( ( RULE_ID ) )
            // InternalIFACE.g:5243:1: ( RULE_ID )
            {
            // InternalIFACE.g:5243:1: ( RULE_ID )
            // InternalIFACE.g:5244:2: RULE_ID
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
    // InternalIFACE.g:5254:1: rule__Version__Group_1__0 : rule__Version__Group_1__0__Impl rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5258:1: ( rule__Version__Group_1__0__Impl rule__Version__Group_1__1 )
            // InternalIFACE.g:5259:2: rule__Version__Group_1__0__Impl rule__Version__Group_1__1
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
    // InternalIFACE.g:5266:1: rule__Version__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5270:1: ( ( '.' ) )
            // InternalIFACE.g:5271:1: ( '.' )
            {
            // InternalIFACE.g:5271:1: ( '.' )
            // InternalIFACE.g:5272:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            }
            match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:5281:1: rule__Version__Group_1__1 : rule__Version__Group_1__1__Impl ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5285:1: ( rule__Version__Group_1__1__Impl )
            // InternalIFACE.g:5286:2: rule__Version__Group_1__1__Impl
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
    // InternalIFACE.g:5292:1: rule__Version__Group_1__1__Impl : ( ( rule__Version__Alternatives_1_1 ) ) ;
    public final void rule__Version__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5296:1: ( ( ( rule__Version__Alternatives_1_1 ) ) )
            // InternalIFACE.g:5297:1: ( ( rule__Version__Alternatives_1_1 ) )
            {
            // InternalIFACE.g:5297:1: ( ( rule__Version__Alternatives_1_1 ) )
            // InternalIFACE.g:5298:2: ( rule__Version__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_1_1()); 
            }
            // InternalIFACE.g:5299:2: ( rule__Version__Alternatives_1_1 )
            // InternalIFACE.g:5299:3: rule__Version__Alternatives_1_1
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
    // InternalIFACE.g:5308:1: rule__Version__Group_1_1_1__0 : rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 ;
    public final void rule__Version__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5312:1: ( rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 )
            // InternalIFACE.g:5313:2: rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1
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
    // InternalIFACE.g:5320:1: rule__Version__Group_1_1_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5324:1: ( ( ( RULE_INT )? ) )
            // InternalIFACE.g:5325:1: ( ( RULE_INT )? )
            {
            // InternalIFACE.g:5325:1: ( ( RULE_INT )? )
            // InternalIFACE.g:5326:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
            }
            // InternalIFACE.g:5327:2: ( RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalIFACE.g:5327:3: RULE_INT
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
    // InternalIFACE.g:5335:1: rule__Version__Group_1_1_1__1 : rule__Version__Group_1_1_1__1__Impl ;
    public final void rule__Version__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5339:1: ( rule__Version__Group_1_1_1__1__Impl )
            // InternalIFACE.g:5340:2: rule__Version__Group_1_1_1__1__Impl
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
    // InternalIFACE.g:5346:1: rule__Version__Group_1_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5350:1: ( ( RULE_ID ) )
            // InternalIFACE.g:5351:1: ( RULE_ID )
            {
            // InternalIFACE.g:5351:1: ( RULE_ID )
            // InternalIFACE.g:5352:2: RULE_ID
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
    // InternalIFACE.g:5362:1: rule__VersionedQualifiedName__Group__0 : rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 ;
    public final void rule__VersionedQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5366:1: ( rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 )
            // InternalIFACE.g:5367:2: rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_30);
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
    // InternalIFACE.g:5374:1: rule__VersionedQualifiedName__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__VersionedQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5378:1: ( ( ruleQualifiedName ) )
            // InternalIFACE.g:5379:1: ( ruleQualifiedName )
            {
            // InternalIFACE.g:5379:1: ( ruleQualifiedName )
            // InternalIFACE.g:5380:2: ruleQualifiedName
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
    // InternalIFACE.g:5389:1: rule__VersionedQualifiedName__Group__1 : rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 ;
    public final void rule__VersionedQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5393:1: ( rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 )
            // InternalIFACE.g:5394:2: rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2
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
    // InternalIFACE.g:5401:1: rule__VersionedQualifiedName__Group__1__Impl : ( '(' ) ;
    public final void rule__VersionedQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5405:1: ( ( '(' ) )
            // InternalIFACE.g:5406:1: ( '(' )
            {
            // InternalIFACE.g:5406:1: ( '(' )
            // InternalIFACE.g:5407:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:5416:1: rule__VersionedQualifiedName__Group__2 : rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 ;
    public final void rule__VersionedQualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5420:1: ( rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 )
            // InternalIFACE.g:5421:2: rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_31);
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
    // InternalIFACE.g:5428:1: rule__VersionedQualifiedName__Group__2__Impl : ( ruleVersion ) ;
    public final void rule__VersionedQualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5432:1: ( ( ruleVersion ) )
            // InternalIFACE.g:5433:1: ( ruleVersion )
            {
            // InternalIFACE.g:5433:1: ( ruleVersion )
            // InternalIFACE.g:5434:2: ruleVersion
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
    // InternalIFACE.g:5443:1: rule__VersionedQualifiedName__Group__3 : rule__VersionedQualifiedName__Group__3__Impl ;
    public final void rule__VersionedQualifiedName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5447:1: ( rule__VersionedQualifiedName__Group__3__Impl )
            // InternalIFACE.g:5448:2: rule__VersionedQualifiedName__Group__3__Impl
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
    // InternalIFACE.g:5454:1: rule__VersionedQualifiedName__Group__3__Impl : ( ')' ) ;
    public final void rule__VersionedQualifiedName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5458:1: ( ( ')' ) )
            // InternalIFACE.g:5459:1: ( ')' )
            {
            // InternalIFACE.g:5459:1: ( ')' )
            // InternalIFACE.g:5460:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:5470:1: rule__INTEGER__Group_0__0 : rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 ;
    public final void rule__INTEGER__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5474:1: ( rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 )
            // InternalIFACE.g:5475:2: rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_32);
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
    // InternalIFACE.g:5482:1: rule__INTEGER__Group_0__0__Impl : ( ( '-' )? ) ;
    public final void rule__INTEGER__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5486:1: ( ( ( '-' )? ) )
            // InternalIFACE.g:5487:1: ( ( '-' )? )
            {
            // InternalIFACE.g:5487:1: ( ( '-' )? )
            // InternalIFACE.g:5488:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); 
            }
            // InternalIFACE.g:5489:2: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==68) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalIFACE.g:5489:3: '-'
                    {
                    match(input,68,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalIFACE.g:5497:1: rule__INTEGER__Group_0__1 : rule__INTEGER__Group_0__1__Impl ;
    public final void rule__INTEGER__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5501:1: ( rule__INTEGER__Group_0__1__Impl )
            // InternalIFACE.g:5502:2: rule__INTEGER__Group_0__1__Impl
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
    // InternalIFACE.g:5508:1: rule__INTEGER__Group_0__1__Impl : ( RULE_INT ) ;
    public final void rule__INTEGER__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5512:1: ( ( RULE_INT ) )
            // InternalIFACE.g:5513:1: ( RULE_INT )
            {
            // InternalIFACE.g:5513:1: ( RULE_INT )
            // InternalIFACE.g:5514:2: RULE_INT
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
    // InternalIFACE.g:5524:1: rule__GSSIfacePortConfig__UnorderedGroup_3 : rule__GSSIfacePortConfig__UnorderedGroup_3__0 {...}?;
    public final void rule__GSSIfacePortConfig__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3());
        	
        try {
            // InternalIFACE.g:5529:1: ( rule__GSSIfacePortConfig__UnorderedGroup_3__0 {...}?)
            // InternalIFACE.g:5530:2: rule__GSSIfacePortConfig__UnorderedGroup_3__0 {...}?
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
    // InternalIFACE.g:5538:1: rule__GSSIfacePortConfig__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfacePortConfig__PortAssignment_3_2 ) ) ) ) ) ;
    public final void rule__GSSIfacePortConfig__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalIFACE.g:5543:1: ( ( ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfacePortConfig__PortAssignment_3_2 ) ) ) ) ) )
            // InternalIFACE.g:5544:3: ( ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfacePortConfig__PortAssignment_3_2 ) ) ) ) )
            {
            // InternalIFACE.g:5544:3: ( ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfacePortConfig__PortAssignment_3_2 ) ) ) ) )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( LA18_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0) ) {
                alt18=1;
            }
            else if ( LA18_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1) ) {
                alt18=2;
            }
            else if ( ( LA18_0 == 40 || LA18_0 == 46 || LA18_0 == 62 || LA18_0 == 64 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 2) ) {
                alt18=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalIFACE.g:5545:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) )
                    {
                    // InternalIFACE.g:5545:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) )
                    // InternalIFACE.g:5546:4: {...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfacePortConfig__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalIFACE.g:5546:114: ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) )
                    // InternalIFACE.g:5547:5: ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // InternalIFACE.g:5553:5: ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) )
                    // InternalIFACE.g:5554:6: ( rule__GSSIfacePortConfig__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfacePortConfigAccess().getGroup_3_0()); 
                    }
                    // InternalIFACE.g:5555:6: ( rule__GSSIfacePortConfig__Group_3_0__0 )
                    // InternalIFACE.g:5555:7: rule__GSSIfacePortConfig__Group_3_0__0
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
                    // InternalIFACE.g:5560:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) )
                    {
                    // InternalIFACE.g:5560:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) )
                    // InternalIFACE.g:5561:4: {...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfacePortConfig__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalIFACE.g:5561:114: ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) )
                    // InternalIFACE.g:5562:5: ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // InternalIFACE.g:5568:5: ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) )
                    // InternalIFACE.g:5569:6: ( rule__GSSIfacePortConfig__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfacePortConfigAccess().getGroup_3_1()); 
                    }
                    // InternalIFACE.g:5570:6: ( rule__GSSIfacePortConfig__Group_3_1__0 )
                    // InternalIFACE.g:5570:7: rule__GSSIfacePortConfig__Group_3_1__0
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
                case 3 :
                    // InternalIFACE.g:5575:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__PortAssignment_3_2 ) ) ) )
                    {
                    // InternalIFACE.g:5575:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__PortAssignment_3_2 ) ) ) )
                    // InternalIFACE.g:5576:4: {...}? => ( ( ( rule__GSSIfacePortConfig__PortAssignment_3_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfacePortConfig__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalIFACE.g:5576:114: ( ( ( rule__GSSIfacePortConfig__PortAssignment_3_2 ) ) )
                    // InternalIFACE.g:5577:5: ( ( rule__GSSIfacePortConfig__PortAssignment_3_2 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 2);
                    selected = true;
                    // InternalIFACE.g:5583:5: ( ( rule__GSSIfacePortConfig__PortAssignment_3_2 ) )
                    // InternalIFACE.g:5584:6: ( rule__GSSIfacePortConfig__PortAssignment_3_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfacePortConfigAccess().getPortAssignment_3_2()); 
                    }
                    // InternalIFACE.g:5585:6: ( rule__GSSIfacePortConfig__PortAssignment_3_2 )
                    // InternalIFACE.g:5585:7: rule__GSSIfacePortConfig__PortAssignment_3_2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfacePortConfig__PortAssignment_3_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfacePortConfigAccess().getPortAssignment_3_2()); 
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
    // InternalIFACE.g:5598:1: rule__GSSIfacePortConfig__UnorderedGroup_3__0 : rule__GSSIfacePortConfig__UnorderedGroup_3__Impl ( rule__GSSIfacePortConfig__UnorderedGroup_3__1 )? ;
    public final void rule__GSSIfacePortConfig__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5602:1: ( rule__GSSIfacePortConfig__UnorderedGroup_3__Impl ( rule__GSSIfacePortConfig__UnorderedGroup_3__1 )? )
            // InternalIFACE.g:5603:2: rule__GSSIfacePortConfig__UnorderedGroup_3__Impl ( rule__GSSIfacePortConfig__UnorderedGroup_3__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__GSSIfacePortConfig__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalIFACE.g:5604:2: ( rule__GSSIfacePortConfig__UnorderedGroup_3__1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( LA19_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0) ) {
                alt19=1;
            }
            else if ( LA19_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1) ) {
                alt19=1;
            }
            else if ( LA19_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 2) ) {
                alt19=1;
            }
            else if ( LA19_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 2) ) {
                alt19=1;
            }
            else if ( LA19_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 2) ) {
                alt19=1;
            }
            else if ( LA19_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 2) ) {
                alt19=1;
            }
            switch (alt19) {
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
    // InternalIFACE.g:5610:1: rule__GSSIfacePortConfig__UnorderedGroup_3__1 : rule__GSSIfacePortConfig__UnorderedGroup_3__Impl ( rule__GSSIfacePortConfig__UnorderedGroup_3__2 )? ;
    public final void rule__GSSIfacePortConfig__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5614:1: ( rule__GSSIfacePortConfig__UnorderedGroup_3__Impl ( rule__GSSIfacePortConfig__UnorderedGroup_3__2 )? )
            // InternalIFACE.g:5615:2: rule__GSSIfacePortConfig__UnorderedGroup_3__Impl ( rule__GSSIfacePortConfig__UnorderedGroup_3__2 )?
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__GSSIfacePortConfig__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalIFACE.g:5616:2: ( rule__GSSIfacePortConfig__UnorderedGroup_3__2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( LA20_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0) ) {
                alt20=1;
            }
            else if ( LA20_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1) ) {
                alt20=1;
            }
            else if ( LA20_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 2) ) {
                alt20=1;
            }
            else if ( LA20_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 2) ) {
                alt20=1;
            }
            else if ( LA20_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 2) ) {
                alt20=1;
            }
            else if ( LA20_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 2) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalIFACE.g:0:0: rule__GSSIfacePortConfig__UnorderedGroup_3__2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfacePortConfig__UnorderedGroup_3__2();

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
    // $ANTLR end "rule__GSSIfacePortConfig__UnorderedGroup_3__1"


    // $ANTLR start "rule__GSSIfacePortConfig__UnorderedGroup_3__2"
    // InternalIFACE.g:5622:1: rule__GSSIfacePortConfig__UnorderedGroup_3__2 : rule__GSSIfacePortConfig__UnorderedGroup_3__Impl ;
    public final void rule__GSSIfacePortConfig__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5626:1: ( rule__GSSIfacePortConfig__UnorderedGroup_3__Impl )
            // InternalIFACE.g:5627:2: rule__GSSIfacePortConfig__UnorderedGroup_3__Impl
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
    // $ANTLR end "rule__GSSIfacePortConfig__UnorderedGroup_3__2"


    // $ANTLR start "rule__GSSIfaceSpWPort__UnorderedGroup_2"
    // InternalIFACE.g:5634:1: rule__GSSIfaceSpWPort__UnorderedGroup_2 : rule__GSSIfaceSpWPort__UnorderedGroup_2__0 {...}?;
    public final void rule__GSSIfaceSpWPort__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2());
        	
        try {
            // InternalIFACE.g:5639:1: ( rule__GSSIfaceSpWPort__UnorderedGroup_2__0 {...}?)
            // InternalIFACE.g:5640:2: rule__GSSIfaceSpWPort__UnorderedGroup_2__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__UnorderedGroup_2__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__GSSIfaceSpWPort__UnorderedGroup_2", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__UnorderedGroup_2"


    // $ANTLR start "rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl"
    // InternalIFACE.g:5648:1: rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_2__0 ) ) ) ) | ({...}? => ( ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 ) ) ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )=> rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )* ) ) ) ) ) ;
    public final void rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalIFACE.g:5653:1: ( ( ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_2__0 ) ) ) ) | ({...}? => ( ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 ) ) ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )=> rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )* ) ) ) ) ) )
            // InternalIFACE.g:5654:3: ( ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_2__0 ) ) ) ) | ({...}? => ( ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 ) ) ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )=> rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )* ) ) ) ) )
            {
            // InternalIFACE.g:5654:3: ( ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_2__0 ) ) ) ) | ({...}? => ( ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 ) ) ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )=> rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )* ) ) ) ) )
            int alt22=4;
            int LA22_0 = input.LA(1);

            if ( LA22_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 1) ) {
                alt22=2;
            }
            else if ( LA22_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 2) ) {
                alt22=3;
            }
            else if ( LA22_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 3) ) {
                alt22=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalIFACE.g:5655:3: ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_0__0 ) ) ) )
                    {
                    // InternalIFACE.g:5655:3: ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_0__0 ) ) ) )
                    // InternalIFACE.g:5656:4: {...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalIFACE.g:5656:111: ( ( ( rule__GSSIfaceSpWPort__Group_2_0__0 ) ) )
                    // InternalIFACE.g:5657:5: ( ( rule__GSSIfaceSpWPort__Group_2_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 0);
                    selected = true;
                    // InternalIFACE.g:5663:5: ( ( rule__GSSIfaceSpWPort__Group_2_0__0 ) )
                    // InternalIFACE.g:5664:6: ( rule__GSSIfaceSpWPort__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceSpWPortAccess().getGroup_2_0()); 
                    }
                    // InternalIFACE.g:5665:6: ( rule__GSSIfaceSpWPort__Group_2_0__0 )
                    // InternalIFACE.g:5665:7: rule__GSSIfaceSpWPort__Group_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceSpWPort__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceSpWPortAccess().getGroup_2_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:5670:3: ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_1__0 ) ) ) )
                    {
                    // InternalIFACE.g:5670:3: ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_1__0 ) ) ) )
                    // InternalIFACE.g:5671:4: {...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalIFACE.g:5671:111: ( ( ( rule__GSSIfaceSpWPort__Group_2_1__0 ) ) )
                    // InternalIFACE.g:5672:5: ( ( rule__GSSIfaceSpWPort__Group_2_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 1);
                    selected = true;
                    // InternalIFACE.g:5678:5: ( ( rule__GSSIfaceSpWPort__Group_2_1__0 ) )
                    // InternalIFACE.g:5679:6: ( rule__GSSIfaceSpWPort__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceSpWPortAccess().getGroup_2_1()); 
                    }
                    // InternalIFACE.g:5680:6: ( rule__GSSIfaceSpWPort__Group_2_1__0 )
                    // InternalIFACE.g:5680:7: rule__GSSIfaceSpWPort__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceSpWPort__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceSpWPortAccess().getGroup_2_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalIFACE.g:5685:3: ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_2__0 ) ) ) )
                    {
                    // InternalIFACE.g:5685:3: ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_2__0 ) ) ) )
                    // InternalIFACE.g:5686:4: {...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 2)");
                    }
                    // InternalIFACE.g:5686:111: ( ( ( rule__GSSIfaceSpWPort__Group_2_2__0 ) ) )
                    // InternalIFACE.g:5687:5: ( ( rule__GSSIfaceSpWPort__Group_2_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 2);
                    selected = true;
                    // InternalIFACE.g:5693:5: ( ( rule__GSSIfaceSpWPort__Group_2_2__0 ) )
                    // InternalIFACE.g:5694:6: ( rule__GSSIfaceSpWPort__Group_2_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceSpWPortAccess().getGroup_2_2()); 
                    }
                    // InternalIFACE.g:5695:6: ( rule__GSSIfaceSpWPort__Group_2_2__0 )
                    // InternalIFACE.g:5695:7: rule__GSSIfaceSpWPort__Group_2_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceSpWPort__Group_2_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceSpWPortAccess().getGroup_2_2()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalIFACE.g:5700:3: ({...}? => ( ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 ) ) ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )=> rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )* ) ) ) )
                    {
                    // InternalIFACE.g:5700:3: ({...}? => ( ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 ) ) ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )=> rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )* ) ) ) )
                    // InternalIFACE.g:5701:4: {...}? => ( ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 ) ) ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )=> rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 3)");
                    }
                    // InternalIFACE.g:5701:111: ( ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 ) ) ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )=> rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )* ) ) )
                    // InternalIFACE.g:5702:5: ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 ) ) ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )=> rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 3);
                    selected = true;
                    // InternalIFACE.g:5708:5: ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 ) ) ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )=> rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )* ) )
                    // InternalIFACE.g:5709:6: ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 ) ) ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )=> rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )* )
                    {
                    // InternalIFACE.g:5709:6: ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 ) )
                    // InternalIFACE.g:5710:7: ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortAssignment_2_3()); 
                    }
                    // InternalIFACE.g:5711:7: ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )
                    // InternalIFACE.g:5711:8: rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3
                    {
                    pushFollow(FollowSets000.FOLLOW_34);
                    rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortAssignment_2_3()); 
                    }

                    }

                    // InternalIFACE.g:5714:6: ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )=> rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )* )
                    // InternalIFACE.g:5715:7: ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )=> rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortAssignment_2_3()); 
                    }
                    // InternalIFACE.g:5716:7: ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )=> rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )*
                    loop21:
                    do {
                        int alt21=2;
                        alt21 = dfa21.predict(input);
                        switch (alt21) {
                    	case 1 :
                    	    // InternalIFACE.g:5716:8: ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )=> rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3
                    	    {
                    	    pushFollow(FollowSets000.FOLLOW_34);
                    	    rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortAssignment_2_3()); 
                    }

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__GSSIfaceSpWPort__UnorderedGroup_2__0"
    // InternalIFACE.g:5730:1: rule__GSSIfaceSpWPort__UnorderedGroup_2__0 : rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl ( rule__GSSIfaceSpWPort__UnorderedGroup_2__1 )? ;
    public final void rule__GSSIfaceSpWPort__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5734:1: ( rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl ( rule__GSSIfaceSpWPort__UnorderedGroup_2__1 )? )
            // InternalIFACE.g:5735:2: rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl ( rule__GSSIfaceSpWPort__UnorderedGroup_2__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalIFACE.g:5736:2: ( rule__GSSIfaceSpWPort__UnorderedGroup_2__1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( LA23_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 0) ) {
                alt23=1;
            }
            else if ( LA23_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 1) ) {
                alt23=1;
            }
            else if ( LA23_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 2) ) {
                alt23=1;
            }
            else if ( LA23_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 3) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalIFACE.g:0:0: rule__GSSIfaceSpWPort__UnorderedGroup_2__1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceSpWPort__UnorderedGroup_2__1();

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
    // $ANTLR end "rule__GSSIfaceSpWPort__UnorderedGroup_2__0"


    // $ANTLR start "rule__GSSIfaceSpWPort__UnorderedGroup_2__1"
    // InternalIFACE.g:5742:1: rule__GSSIfaceSpWPort__UnorderedGroup_2__1 : rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl ( rule__GSSIfaceSpWPort__UnorderedGroup_2__2 )? ;
    public final void rule__GSSIfaceSpWPort__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5746:1: ( rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl ( rule__GSSIfaceSpWPort__UnorderedGroup_2__2 )? )
            // InternalIFACE.g:5747:2: rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl ( rule__GSSIfaceSpWPort__UnorderedGroup_2__2 )?
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalIFACE.g:5748:2: ( rule__GSSIfaceSpWPort__UnorderedGroup_2__2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( LA24_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 1) ) {
                alt24=1;
            }
            else if ( LA24_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 2) ) {
                alt24=1;
            }
            else if ( LA24_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 3) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalIFACE.g:0:0: rule__GSSIfaceSpWPort__UnorderedGroup_2__2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceSpWPort__UnorderedGroup_2__2();

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
    // $ANTLR end "rule__GSSIfaceSpWPort__UnorderedGroup_2__1"


    // $ANTLR start "rule__GSSIfaceSpWPort__UnorderedGroup_2__2"
    // InternalIFACE.g:5754:1: rule__GSSIfaceSpWPort__UnorderedGroup_2__2 : rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl ( rule__GSSIfaceSpWPort__UnorderedGroup_2__3 )? ;
    public final void rule__GSSIfaceSpWPort__UnorderedGroup_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5758:1: ( rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl ( rule__GSSIfaceSpWPort__UnorderedGroup_2__3 )? )
            // InternalIFACE.g:5759:2: rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl ( rule__GSSIfaceSpWPort__UnorderedGroup_2__3 )?
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalIFACE.g:5760:2: ( rule__GSSIfaceSpWPort__UnorderedGroup_2__3 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( LA25_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 0) ) {
                alt25=1;
            }
            else if ( LA25_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 1) ) {
                alt25=1;
            }
            else if ( LA25_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 2) ) {
                alt25=1;
            }
            else if ( LA25_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 3) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalIFACE.g:0:0: rule__GSSIfaceSpWPort__UnorderedGroup_2__3
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceSpWPort__UnorderedGroup_2__3();

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
    // $ANTLR end "rule__GSSIfaceSpWPort__UnorderedGroup_2__2"


    // $ANTLR start "rule__GSSIfaceSpWPort__UnorderedGroup_2__3"
    // InternalIFACE.g:5766:1: rule__GSSIfaceSpWPort__UnorderedGroup_2__3 : rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl ;
    public final void rule__GSSIfaceSpWPort__UnorderedGroup_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5770:1: ( rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl )
            // InternalIFACE.g:5771:2: rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSpWPort__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__UnorderedGroup_2__3"


    // $ANTLR start "rule__GSSIfaceUartPort__UnorderedGroup_2"
    // InternalIFACE.g:5778:1: rule__GSSIfaceUartPort__UnorderedGroup_2 : rule__GSSIfaceUartPort__UnorderedGroup_2__0 {...}?;
    public final void rule__GSSIfaceUartPort__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2());
        	
        try {
            // InternalIFACE.g:5783:1: ( rule__GSSIfaceUartPort__UnorderedGroup_2__0 {...}?)
            // InternalIFACE.g:5784:2: rule__GSSIfaceUartPort__UnorderedGroup_2__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__UnorderedGroup_2__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__GSSIfaceUartPort__UnorderedGroup_2", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__UnorderedGroup_2"


    // $ANTLR start "rule__GSSIfaceUartPort__UnorderedGroup_2__Impl"
    // InternalIFACE.g:5792:1: rule__GSSIfaceUartPort__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_3__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_4__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_5__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_6__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__UartProtocolAssignment_2_7 ) ) ) ) ) ;
    public final void rule__GSSIfaceUartPort__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalIFACE.g:5797:1: ( ( ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_3__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_4__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_5__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_6__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__UartProtocolAssignment_2_7 ) ) ) ) ) )
            // InternalIFACE.g:5798:3: ( ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_3__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_4__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_5__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_6__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__UartProtocolAssignment_2_7 ) ) ) ) )
            {
            // InternalIFACE.g:5798:3: ( ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_3__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_4__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_5__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_6__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartPort__UartProtocolAssignment_2_7 ) ) ) ) )
            int alt26=8;
            int LA26_0 = input.LA(1);

            if ( LA26_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 0) ) {
                alt26=1;
            }
            else if ( LA26_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 1) ) {
                alt26=2;
            }
            else if ( LA26_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 2) ) {
                alt26=3;
            }
            else if ( LA26_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 3) ) {
                alt26=4;
            }
            else if ( LA26_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 4) ) {
                alt26=5;
            }
            else if ( LA26_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 5) ) {
                alt26=6;
            }
            else if ( LA26_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 6) ) {
                alt26=7;
            }
            else if ( LA26_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 7) ) {
                alt26=8;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalIFACE.g:5799:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_0__0 ) ) ) )
                    {
                    // InternalIFACE.g:5799:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_0__0 ) ) ) )
                    // InternalIFACE.g:5800:4: {...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfaceUartPort__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalIFACE.g:5800:112: ( ( ( rule__GSSIfaceUartPort__Group_2_0__0 ) ) )
                    // InternalIFACE.g:5801:5: ( ( rule__GSSIfaceUartPort__Group_2_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 0);
                    selected = true;
                    // InternalIFACE.g:5807:5: ( ( rule__GSSIfaceUartPort__Group_2_0__0 ) )
                    // InternalIFACE.g:5808:6: ( rule__GSSIfaceUartPort__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_0()); 
                    }
                    // InternalIFACE.g:5809:6: ( rule__GSSIfaceUartPort__Group_2_0__0 )
                    // InternalIFACE.g:5809:7: rule__GSSIfaceUartPort__Group_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartPort__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:5814:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_1__0 ) ) ) )
                    {
                    // InternalIFACE.g:5814:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_1__0 ) ) ) )
                    // InternalIFACE.g:5815:4: {...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfaceUartPort__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalIFACE.g:5815:112: ( ( ( rule__GSSIfaceUartPort__Group_2_1__0 ) ) )
                    // InternalIFACE.g:5816:5: ( ( rule__GSSIfaceUartPort__Group_2_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 1);
                    selected = true;
                    // InternalIFACE.g:5822:5: ( ( rule__GSSIfaceUartPort__Group_2_1__0 ) )
                    // InternalIFACE.g:5823:6: ( rule__GSSIfaceUartPort__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_1()); 
                    }
                    // InternalIFACE.g:5824:6: ( rule__GSSIfaceUartPort__Group_2_1__0 )
                    // InternalIFACE.g:5824:7: rule__GSSIfaceUartPort__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartPort__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalIFACE.g:5829:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_2__0 ) ) ) )
                    {
                    // InternalIFACE.g:5829:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_2__0 ) ) ) )
                    // InternalIFACE.g:5830:4: {...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfaceUartPort__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 2)");
                    }
                    // InternalIFACE.g:5830:112: ( ( ( rule__GSSIfaceUartPort__Group_2_2__0 ) ) )
                    // InternalIFACE.g:5831:5: ( ( rule__GSSIfaceUartPort__Group_2_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 2);
                    selected = true;
                    // InternalIFACE.g:5837:5: ( ( rule__GSSIfaceUartPort__Group_2_2__0 ) )
                    // InternalIFACE.g:5838:6: ( rule__GSSIfaceUartPort__Group_2_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_2()); 
                    }
                    // InternalIFACE.g:5839:6: ( rule__GSSIfaceUartPort__Group_2_2__0 )
                    // InternalIFACE.g:5839:7: rule__GSSIfaceUartPort__Group_2_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartPort__Group_2_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_2()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalIFACE.g:5844:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_3__0 ) ) ) )
                    {
                    // InternalIFACE.g:5844:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_3__0 ) ) ) )
                    // InternalIFACE.g:5845:4: {...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfaceUartPort__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 3)");
                    }
                    // InternalIFACE.g:5845:112: ( ( ( rule__GSSIfaceUartPort__Group_2_3__0 ) ) )
                    // InternalIFACE.g:5846:5: ( ( rule__GSSIfaceUartPort__Group_2_3__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 3);
                    selected = true;
                    // InternalIFACE.g:5852:5: ( ( rule__GSSIfaceUartPort__Group_2_3__0 ) )
                    // InternalIFACE.g:5853:6: ( rule__GSSIfaceUartPort__Group_2_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_3()); 
                    }
                    // InternalIFACE.g:5854:6: ( rule__GSSIfaceUartPort__Group_2_3__0 )
                    // InternalIFACE.g:5854:7: rule__GSSIfaceUartPort__Group_2_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartPort__Group_2_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_3()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalIFACE.g:5859:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_4__0 ) ) ) )
                    {
                    // InternalIFACE.g:5859:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_4__0 ) ) ) )
                    // InternalIFACE.g:5860:4: {...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 4) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfaceUartPort__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 4)");
                    }
                    // InternalIFACE.g:5860:112: ( ( ( rule__GSSIfaceUartPort__Group_2_4__0 ) ) )
                    // InternalIFACE.g:5861:5: ( ( rule__GSSIfaceUartPort__Group_2_4__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 4);
                    selected = true;
                    // InternalIFACE.g:5867:5: ( ( rule__GSSIfaceUartPort__Group_2_4__0 ) )
                    // InternalIFACE.g:5868:6: ( rule__GSSIfaceUartPort__Group_2_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_4()); 
                    }
                    // InternalIFACE.g:5869:6: ( rule__GSSIfaceUartPort__Group_2_4__0 )
                    // InternalIFACE.g:5869:7: rule__GSSIfaceUartPort__Group_2_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartPort__Group_2_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_4()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalIFACE.g:5874:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_5__0 ) ) ) )
                    {
                    // InternalIFACE.g:5874:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_5__0 ) ) ) )
                    // InternalIFACE.g:5875:4: {...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 5) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfaceUartPort__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 5)");
                    }
                    // InternalIFACE.g:5875:112: ( ( ( rule__GSSIfaceUartPort__Group_2_5__0 ) ) )
                    // InternalIFACE.g:5876:5: ( ( rule__GSSIfaceUartPort__Group_2_5__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 5);
                    selected = true;
                    // InternalIFACE.g:5882:5: ( ( rule__GSSIfaceUartPort__Group_2_5__0 ) )
                    // InternalIFACE.g:5883:6: ( rule__GSSIfaceUartPort__Group_2_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_5()); 
                    }
                    // InternalIFACE.g:5884:6: ( rule__GSSIfaceUartPort__Group_2_5__0 )
                    // InternalIFACE.g:5884:7: rule__GSSIfaceUartPort__Group_2_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartPort__Group_2_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_5()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalIFACE.g:5889:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_6__0 ) ) ) )
                    {
                    // InternalIFACE.g:5889:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_6__0 ) ) ) )
                    // InternalIFACE.g:5890:4: {...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_6__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 6) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfaceUartPort__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 6)");
                    }
                    // InternalIFACE.g:5890:112: ( ( ( rule__GSSIfaceUartPort__Group_2_6__0 ) ) )
                    // InternalIFACE.g:5891:5: ( ( rule__GSSIfaceUartPort__Group_2_6__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 6);
                    selected = true;
                    // InternalIFACE.g:5897:5: ( ( rule__GSSIfaceUartPort__Group_2_6__0 ) )
                    // InternalIFACE.g:5898:6: ( rule__GSSIfaceUartPort__Group_2_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_6()); 
                    }
                    // InternalIFACE.g:5899:6: ( rule__GSSIfaceUartPort__Group_2_6__0 )
                    // InternalIFACE.g:5899:7: rule__GSSIfaceUartPort__Group_2_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartPort__Group_2_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_6()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalIFACE.g:5904:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__UartProtocolAssignment_2_7 ) ) ) )
                    {
                    // InternalIFACE.g:5904:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__UartProtocolAssignment_2_7 ) ) ) )
                    // InternalIFACE.g:5905:4: {...}? => ( ( ( rule__GSSIfaceUartPort__UartProtocolAssignment_2_7 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 7) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfaceUartPort__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 7)");
                    }
                    // InternalIFACE.g:5905:112: ( ( ( rule__GSSIfaceUartPort__UartProtocolAssignment_2_7 ) ) )
                    // InternalIFACE.g:5906:5: ( ( rule__GSSIfaceUartPort__UartProtocolAssignment_2_7 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 7);
                    selected = true;
                    // InternalIFACE.g:5912:5: ( ( rule__GSSIfaceUartPort__UartProtocolAssignment_2_7 ) )
                    // InternalIFACE.g:5913:6: ( rule__GSSIfaceUartPort__UartProtocolAssignment_2_7 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortAccess().getUartProtocolAssignment_2_7()); 
                    }
                    // InternalIFACE.g:5914:6: ( rule__GSSIfaceUartPort__UartProtocolAssignment_2_7 )
                    // InternalIFACE.g:5914:7: rule__GSSIfaceUartPort__UartProtocolAssignment_2_7
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartPort__UartProtocolAssignment_2_7();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartPortAccess().getUartProtocolAssignment_2_7()); 
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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__UnorderedGroup_2__0"
    // InternalIFACE.g:5927:1: rule__GSSIfaceUartPort__UnorderedGroup_2__0 : rule__GSSIfaceUartPort__UnorderedGroup_2__Impl ( rule__GSSIfaceUartPort__UnorderedGroup_2__1 )? ;
    public final void rule__GSSIfaceUartPort__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5931:1: ( rule__GSSIfaceUartPort__UnorderedGroup_2__Impl ( rule__GSSIfaceUartPort__UnorderedGroup_2__1 )? )
            // InternalIFACE.g:5932:2: rule__GSSIfaceUartPort__UnorderedGroup_2__Impl ( rule__GSSIfaceUartPort__UnorderedGroup_2__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__GSSIfaceUartPort__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalIFACE.g:5933:2: ( rule__GSSIfaceUartPort__UnorderedGroup_2__1 )?
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalIFACE.g:0:0: rule__GSSIfaceUartPort__UnorderedGroup_2__1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartPort__UnorderedGroup_2__1();

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
    // $ANTLR end "rule__GSSIfaceUartPort__UnorderedGroup_2__0"


    // $ANTLR start "rule__GSSIfaceUartPort__UnorderedGroup_2__1"
    // InternalIFACE.g:5939:1: rule__GSSIfaceUartPort__UnorderedGroup_2__1 : rule__GSSIfaceUartPort__UnorderedGroup_2__Impl ( rule__GSSIfaceUartPort__UnorderedGroup_2__2 )? ;
    public final void rule__GSSIfaceUartPort__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5943:1: ( rule__GSSIfaceUartPort__UnorderedGroup_2__Impl ( rule__GSSIfaceUartPort__UnorderedGroup_2__2 )? )
            // InternalIFACE.g:5944:2: rule__GSSIfaceUartPort__UnorderedGroup_2__Impl ( rule__GSSIfaceUartPort__UnorderedGroup_2__2 )?
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__GSSIfaceUartPort__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalIFACE.g:5945:2: ( rule__GSSIfaceUartPort__UnorderedGroup_2__2 )?
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalIFACE.g:0:0: rule__GSSIfaceUartPort__UnorderedGroup_2__2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartPort__UnorderedGroup_2__2();

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
    // $ANTLR end "rule__GSSIfaceUartPort__UnorderedGroup_2__1"


    // $ANTLR start "rule__GSSIfaceUartPort__UnorderedGroup_2__2"
    // InternalIFACE.g:5951:1: rule__GSSIfaceUartPort__UnorderedGroup_2__2 : rule__GSSIfaceUartPort__UnorderedGroup_2__Impl ( rule__GSSIfaceUartPort__UnorderedGroup_2__3 )? ;
    public final void rule__GSSIfaceUartPort__UnorderedGroup_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5955:1: ( rule__GSSIfaceUartPort__UnorderedGroup_2__Impl ( rule__GSSIfaceUartPort__UnorderedGroup_2__3 )? )
            // InternalIFACE.g:5956:2: rule__GSSIfaceUartPort__UnorderedGroup_2__Impl ( rule__GSSIfaceUartPort__UnorderedGroup_2__3 )?
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__GSSIfaceUartPort__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalIFACE.g:5957:2: ( rule__GSSIfaceUartPort__UnorderedGroup_2__3 )?
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalIFACE.g:0:0: rule__GSSIfaceUartPort__UnorderedGroup_2__3
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartPort__UnorderedGroup_2__3();

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
    // $ANTLR end "rule__GSSIfaceUartPort__UnorderedGroup_2__2"


    // $ANTLR start "rule__GSSIfaceUartPort__UnorderedGroup_2__3"
    // InternalIFACE.g:5963:1: rule__GSSIfaceUartPort__UnorderedGroup_2__3 : rule__GSSIfaceUartPort__UnorderedGroup_2__Impl ( rule__GSSIfaceUartPort__UnorderedGroup_2__4 )? ;
    public final void rule__GSSIfaceUartPort__UnorderedGroup_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5967:1: ( rule__GSSIfaceUartPort__UnorderedGroup_2__Impl ( rule__GSSIfaceUartPort__UnorderedGroup_2__4 )? )
            // InternalIFACE.g:5968:2: rule__GSSIfaceUartPort__UnorderedGroup_2__Impl ( rule__GSSIfaceUartPort__UnorderedGroup_2__4 )?
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__GSSIfaceUartPort__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalIFACE.g:5969:2: ( rule__GSSIfaceUartPort__UnorderedGroup_2__4 )?
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalIFACE.g:0:0: rule__GSSIfaceUartPort__UnorderedGroup_2__4
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartPort__UnorderedGroup_2__4();

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
    // $ANTLR end "rule__GSSIfaceUartPort__UnorderedGroup_2__3"


    // $ANTLR start "rule__GSSIfaceUartPort__UnorderedGroup_2__4"
    // InternalIFACE.g:5975:1: rule__GSSIfaceUartPort__UnorderedGroup_2__4 : rule__GSSIfaceUartPort__UnorderedGroup_2__Impl ( rule__GSSIfaceUartPort__UnorderedGroup_2__5 )? ;
    public final void rule__GSSIfaceUartPort__UnorderedGroup_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5979:1: ( rule__GSSIfaceUartPort__UnorderedGroup_2__Impl ( rule__GSSIfaceUartPort__UnorderedGroup_2__5 )? )
            // InternalIFACE.g:5980:2: rule__GSSIfaceUartPort__UnorderedGroup_2__Impl ( rule__GSSIfaceUartPort__UnorderedGroup_2__5 )?
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__GSSIfaceUartPort__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalIFACE.g:5981:2: ( rule__GSSIfaceUartPort__UnorderedGroup_2__5 )?
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalIFACE.g:0:0: rule__GSSIfaceUartPort__UnorderedGroup_2__5
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartPort__UnorderedGroup_2__5();

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
    // $ANTLR end "rule__GSSIfaceUartPort__UnorderedGroup_2__4"


    // $ANTLR start "rule__GSSIfaceUartPort__UnorderedGroup_2__5"
    // InternalIFACE.g:5987:1: rule__GSSIfaceUartPort__UnorderedGroup_2__5 : rule__GSSIfaceUartPort__UnorderedGroup_2__Impl ( rule__GSSIfaceUartPort__UnorderedGroup_2__6 )? ;
    public final void rule__GSSIfaceUartPort__UnorderedGroup_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5991:1: ( rule__GSSIfaceUartPort__UnorderedGroup_2__Impl ( rule__GSSIfaceUartPort__UnorderedGroup_2__6 )? )
            // InternalIFACE.g:5992:2: rule__GSSIfaceUartPort__UnorderedGroup_2__Impl ( rule__GSSIfaceUartPort__UnorderedGroup_2__6 )?
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__GSSIfaceUartPort__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalIFACE.g:5993:2: ( rule__GSSIfaceUartPort__UnorderedGroup_2__6 )?
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // InternalIFACE.g:0:0: rule__GSSIfaceUartPort__UnorderedGroup_2__6
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartPort__UnorderedGroup_2__6();

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
    // $ANTLR end "rule__GSSIfaceUartPort__UnorderedGroup_2__5"


    // $ANTLR start "rule__GSSIfaceUartPort__UnorderedGroup_2__6"
    // InternalIFACE.g:5999:1: rule__GSSIfaceUartPort__UnorderedGroup_2__6 : rule__GSSIfaceUartPort__UnorderedGroup_2__Impl ( rule__GSSIfaceUartPort__UnorderedGroup_2__7 )? ;
    public final void rule__GSSIfaceUartPort__UnorderedGroup_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6003:1: ( rule__GSSIfaceUartPort__UnorderedGroup_2__Impl ( rule__GSSIfaceUartPort__UnorderedGroup_2__7 )? )
            // InternalIFACE.g:6004:2: rule__GSSIfaceUartPort__UnorderedGroup_2__Impl ( rule__GSSIfaceUartPort__UnorderedGroup_2__7 )?
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__GSSIfaceUartPort__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalIFACE.g:6005:2: ( rule__GSSIfaceUartPort__UnorderedGroup_2__7 )?
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // InternalIFACE.g:0:0: rule__GSSIfaceUartPort__UnorderedGroup_2__7
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartPort__UnorderedGroup_2__7();

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
    // $ANTLR end "rule__GSSIfaceUartPort__UnorderedGroup_2__6"


    // $ANTLR start "rule__GSSIfaceUartPort__UnorderedGroup_2__7"
    // InternalIFACE.g:6011:1: rule__GSSIfaceUartPort__UnorderedGroup_2__7 : rule__GSSIfaceUartPort__UnorderedGroup_2__Impl ;
    public final void rule__GSSIfaceUartPort__UnorderedGroup_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6015:1: ( rule__GSSIfaceUartPort__UnorderedGroup_2__Impl )
            // InternalIFACE.g:6016:2: rule__GSSIfaceUartPort__UnorderedGroup_2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__UnorderedGroup_2__7"


    // $ANTLR start "rule__GSSIfaceUartProtocol__UnorderedGroup_2"
    // InternalIFACE.g:6023:1: rule__GSSIfaceUartProtocol__UnorderedGroup_2 : rule__GSSIfaceUartProtocol__UnorderedGroup_2__0 {...}?;
    public final void rule__GSSIfaceUartProtocol__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2());
        	
        try {
            // InternalIFACE.g:6028:1: ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__0 {...}?)
            // InternalIFACE.g:6029:2: rule__GSSIfaceUartProtocol__UnorderedGroup_2__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__UnorderedGroup_2__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__GSSIfaceUartProtocol__UnorderedGroup_2", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__UnorderedGroup_2"


    // $ANTLR start "rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl"
    // InternalIFACE.g:6037:1: rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__GSSIfaceUartProtocol__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartProtocol__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartProtocol__SyncPatternAssignment_2_5 ) ) ) ) ) ;
    public final void rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalIFACE.g:6042:1: ( ( ({...}? => ( ( ( rule__GSSIfaceUartProtocol__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartProtocol__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartProtocol__SyncPatternAssignment_2_5 ) ) ) ) ) )
            // InternalIFACE.g:6043:3: ( ({...}? => ( ( ( rule__GSSIfaceUartProtocol__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartProtocol__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartProtocol__SyncPatternAssignment_2_5 ) ) ) ) )
            {
            // InternalIFACE.g:6043:3: ( ({...}? => ( ( ( rule__GSSIfaceUartProtocol__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartProtocol__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceUartProtocol__SyncPatternAssignment_2_5 ) ) ) ) )
            int alt34=6;
            int LA34_0 = input.LA(1);

            if ( LA34_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 0) ) {
                alt34=1;
            }
            else if ( LA34_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 1) ) {
                alt34=2;
            }
            else if ( LA34_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 2) ) {
                alt34=3;
            }
            else if ( LA34_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 3) ) {
                alt34=4;
            }
            else if ( LA34_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 4) ) {
                alt34=5;
            }
            else if ( LA34_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 5) ) {
                alt34=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalIFACE.g:6044:3: ({...}? => ( ( ( rule__GSSIfaceUartProtocol__Group_2_0__0 ) ) ) )
                    {
                    // InternalIFACE.g:6044:3: ({...}? => ( ( ( rule__GSSIfaceUartProtocol__Group_2_0__0 ) ) ) )
                    // InternalIFACE.g:6045:4: {...}? => ( ( ( rule__GSSIfaceUartProtocol__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalIFACE.g:6045:116: ( ( ( rule__GSSIfaceUartProtocol__Group_2_0__0 ) ) )
                    // InternalIFACE.g:6046:5: ( ( rule__GSSIfaceUartProtocol__Group_2_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 0);
                    selected = true;
                    // InternalIFACE.g:6052:5: ( ( rule__GSSIfaceUartProtocol__Group_2_0__0 ) )
                    // InternalIFACE.g:6053:6: ( rule__GSSIfaceUartProtocol__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartProtocolAccess().getGroup_2_0()); 
                    }
                    // InternalIFACE.g:6054:6: ( rule__GSSIfaceUartProtocol__Group_2_0__0 )
                    // InternalIFACE.g:6054:7: rule__GSSIfaceUartProtocol__Group_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartProtocol__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartProtocolAccess().getGroup_2_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:6059:3: ({...}? => ( ( ( rule__GSSIfaceUartProtocol__Group_2_1__0 ) ) ) )
                    {
                    // InternalIFACE.g:6059:3: ({...}? => ( ( ( rule__GSSIfaceUartProtocol__Group_2_1__0 ) ) ) )
                    // InternalIFACE.g:6060:4: {...}? => ( ( ( rule__GSSIfaceUartProtocol__Group_2_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalIFACE.g:6060:116: ( ( ( rule__GSSIfaceUartProtocol__Group_2_1__0 ) ) )
                    // InternalIFACE.g:6061:5: ( ( rule__GSSIfaceUartProtocol__Group_2_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 1);
                    selected = true;
                    // InternalIFACE.g:6067:5: ( ( rule__GSSIfaceUartProtocol__Group_2_1__0 ) )
                    // InternalIFACE.g:6068:6: ( rule__GSSIfaceUartProtocol__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartProtocolAccess().getGroup_2_1()); 
                    }
                    // InternalIFACE.g:6069:6: ( rule__GSSIfaceUartProtocol__Group_2_1__0 )
                    // InternalIFACE.g:6069:7: rule__GSSIfaceUartProtocol__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartProtocol__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartProtocolAccess().getGroup_2_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalIFACE.g:6074:3: ({...}? => ( ( ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2 ) ) ) )
                    {
                    // InternalIFACE.g:6074:3: ({...}? => ( ( ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2 ) ) ) )
                    // InternalIFACE.g:6075:4: {...}? => ( ( ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 2)");
                    }
                    // InternalIFACE.g:6075:116: ( ( ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2 ) ) )
                    // InternalIFACE.g:6076:5: ( ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 2);
                    selected = true;
                    // InternalIFACE.g:6082:5: ( ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2 ) )
                    // InternalIFACE.g:6083:6: ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartProtocolAccess().getConstSizeAssignment_2_2()); 
                    }
                    // InternalIFACE.g:6084:6: ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2 )
                    // InternalIFACE.g:6084:7: rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartProtocolAccess().getConstSizeAssignment_2_2()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalIFACE.g:6089:3: ({...}? => ( ( ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3 ) ) ) )
                    {
                    // InternalIFACE.g:6089:3: ({...}? => ( ( ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3 ) ) ) )
                    // InternalIFACE.g:6090:4: {...}? => ( ( ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 3)");
                    }
                    // InternalIFACE.g:6090:116: ( ( ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3 ) ) )
                    // InternalIFACE.g:6091:5: ( ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 3);
                    selected = true;
                    // InternalIFACE.g:6097:5: ( ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3 ) )
                    // InternalIFACE.g:6098:6: ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldOffsetAssignment_2_3()); 
                    }
                    // InternalIFACE.g:6099:6: ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3 )
                    // InternalIFACE.g:6099:7: rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldOffsetAssignment_2_3()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalIFACE.g:6104:3: ({...}? => ( ( ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4 ) ) ) )
                    {
                    // InternalIFACE.g:6104:3: ({...}? => ( ( ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4 ) ) ) )
                    // InternalIFACE.g:6105:4: {...}? => ( ( ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 4) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 4)");
                    }
                    // InternalIFACE.g:6105:116: ( ( ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4 ) ) )
                    // InternalIFACE.g:6106:5: ( ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 4);
                    selected = true;
                    // InternalIFACE.g:6112:5: ( ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4 ) )
                    // InternalIFACE.g:6113:6: ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldTrimAssignment_2_4()); 
                    }
                    // InternalIFACE.g:6114:6: ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4 )
                    // InternalIFACE.g:6114:7: rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldTrimAssignment_2_4()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalIFACE.g:6119:3: ({...}? => ( ( ( rule__GSSIfaceUartProtocol__SyncPatternAssignment_2_5 ) ) ) )
                    {
                    // InternalIFACE.g:6119:3: ({...}? => ( ( ( rule__GSSIfaceUartProtocol__SyncPatternAssignment_2_5 ) ) ) )
                    // InternalIFACE.g:6120:4: {...}? => ( ( ( rule__GSSIfaceUartProtocol__SyncPatternAssignment_2_5 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 5) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 5)");
                    }
                    // InternalIFACE.g:6120:116: ( ( ( rule__GSSIfaceUartProtocol__SyncPatternAssignment_2_5 ) ) )
                    // InternalIFACE.g:6121:5: ( ( rule__GSSIfaceUartProtocol__SyncPatternAssignment_2_5 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 5);
                    selected = true;
                    // InternalIFACE.g:6127:5: ( ( rule__GSSIfaceUartProtocol__SyncPatternAssignment_2_5 ) )
                    // InternalIFACE.g:6128:6: ( rule__GSSIfaceUartProtocol__SyncPatternAssignment_2_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartProtocolAccess().getSyncPatternAssignment_2_5()); 
                    }
                    // InternalIFACE.g:6129:6: ( rule__GSSIfaceUartProtocol__SyncPatternAssignment_2_5 )
                    // InternalIFACE.g:6129:7: rule__GSSIfaceUartProtocol__SyncPatternAssignment_2_5
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartProtocol__SyncPatternAssignment_2_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceUartProtocolAccess().getSyncPatternAssignment_2_5()); 
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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__GSSIfaceUartProtocol__UnorderedGroup_2__0"
    // InternalIFACE.g:6142:1: rule__GSSIfaceUartProtocol__UnorderedGroup_2__0 : rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__1 )? ;
    public final void rule__GSSIfaceUartProtocol__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6146:1: ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__1 )? )
            // InternalIFACE.g:6147:2: rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalIFACE.g:6148:2: ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( LA35_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 0) ) {
                alt35=1;
            }
            else if ( LA35_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 1) ) {
                alt35=1;
            }
            else if ( LA35_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 2) ) {
                alt35=1;
            }
            else if ( LA35_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 3) ) {
                alt35=1;
            }
            else if ( LA35_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 4) ) {
                alt35=1;
            }
            else if ( LA35_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 5) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalIFACE.g:0:0: rule__GSSIfaceUartProtocol__UnorderedGroup_2__1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartProtocol__UnorderedGroup_2__1();

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
    // $ANTLR end "rule__GSSIfaceUartProtocol__UnorderedGroup_2__0"


    // $ANTLR start "rule__GSSIfaceUartProtocol__UnorderedGroup_2__1"
    // InternalIFACE.g:6154:1: rule__GSSIfaceUartProtocol__UnorderedGroup_2__1 : rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__2 )? ;
    public final void rule__GSSIfaceUartProtocol__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6158:1: ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__2 )? )
            // InternalIFACE.g:6159:2: rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__2 )?
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalIFACE.g:6160:2: ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( LA36_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 0) ) {
                alt36=1;
            }
            else if ( LA36_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 1) ) {
                alt36=1;
            }
            else if ( LA36_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 2) ) {
                alt36=1;
            }
            else if ( LA36_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 3) ) {
                alt36=1;
            }
            else if ( LA36_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 4) ) {
                alt36=1;
            }
            else if ( LA36_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 5) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalIFACE.g:0:0: rule__GSSIfaceUartProtocol__UnorderedGroup_2__2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartProtocol__UnorderedGroup_2__2();

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
    // $ANTLR end "rule__GSSIfaceUartProtocol__UnorderedGroup_2__1"


    // $ANTLR start "rule__GSSIfaceUartProtocol__UnorderedGroup_2__2"
    // InternalIFACE.g:6166:1: rule__GSSIfaceUartProtocol__UnorderedGroup_2__2 : rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__3 )? ;
    public final void rule__GSSIfaceUartProtocol__UnorderedGroup_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6170:1: ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__3 )? )
            // InternalIFACE.g:6171:2: rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__3 )?
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalIFACE.g:6172:2: ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__3 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( LA37_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 0) ) {
                alt37=1;
            }
            else if ( LA37_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 1) ) {
                alt37=1;
            }
            else if ( LA37_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 2) ) {
                alt37=1;
            }
            else if ( LA37_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 3) ) {
                alt37=1;
            }
            else if ( LA37_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 4) ) {
                alt37=1;
            }
            else if ( LA37_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 5) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalIFACE.g:0:0: rule__GSSIfaceUartProtocol__UnorderedGroup_2__3
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartProtocol__UnorderedGroup_2__3();

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
    // $ANTLR end "rule__GSSIfaceUartProtocol__UnorderedGroup_2__2"


    // $ANTLR start "rule__GSSIfaceUartProtocol__UnorderedGroup_2__3"
    // InternalIFACE.g:6178:1: rule__GSSIfaceUartProtocol__UnorderedGroup_2__3 : rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__4 )? ;
    public final void rule__GSSIfaceUartProtocol__UnorderedGroup_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6182:1: ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__4 )? )
            // InternalIFACE.g:6183:2: rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__4 )?
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalIFACE.g:6184:2: ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__4 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( LA38_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 0) ) {
                alt38=1;
            }
            else if ( LA38_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 1) ) {
                alt38=1;
            }
            else if ( LA38_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 2) ) {
                alt38=1;
            }
            else if ( LA38_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 3) ) {
                alt38=1;
            }
            else if ( LA38_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 4) ) {
                alt38=1;
            }
            else if ( LA38_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 5) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalIFACE.g:0:0: rule__GSSIfaceUartProtocol__UnorderedGroup_2__4
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartProtocol__UnorderedGroup_2__4();

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
    // $ANTLR end "rule__GSSIfaceUartProtocol__UnorderedGroup_2__3"


    // $ANTLR start "rule__GSSIfaceUartProtocol__UnorderedGroup_2__4"
    // InternalIFACE.g:6190:1: rule__GSSIfaceUartProtocol__UnorderedGroup_2__4 : rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__5 )? ;
    public final void rule__GSSIfaceUartProtocol__UnorderedGroup_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6194:1: ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__5 )? )
            // InternalIFACE.g:6195:2: rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__5 )?
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalIFACE.g:6196:2: ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__5 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( LA39_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 0) ) {
                alt39=1;
            }
            else if ( LA39_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 1) ) {
                alt39=1;
            }
            else if ( LA39_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 2) ) {
                alt39=1;
            }
            else if ( LA39_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 3) ) {
                alt39=1;
            }
            else if ( LA39_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 4) ) {
                alt39=1;
            }
            else if ( LA39_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 5) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalIFACE.g:0:0: rule__GSSIfaceUartProtocol__UnorderedGroup_2__5
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceUartProtocol__UnorderedGroup_2__5();

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
    // $ANTLR end "rule__GSSIfaceUartProtocol__UnorderedGroup_2__4"


    // $ANTLR start "rule__GSSIfaceUartProtocol__UnorderedGroup_2__5"
    // InternalIFACE.g:6202:1: rule__GSSIfaceUartProtocol__UnorderedGroup_2__5 : rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl ;
    public final void rule__GSSIfaceUartProtocol__UnorderedGroup_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6206:1: ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl )
            // InternalIFACE.g:6207:2: rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartProtocol__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__UnorderedGroup_2__5"


    // $ANTLR start "rule__GSSIfaceConstSize__UnorderedGroup_2"
    // InternalIFACE.g:6214:1: rule__GSSIfaceConstSize__UnorderedGroup_2 : rule__GSSIfaceConstSize__UnorderedGroup_2__0 {...}?;
    public final void rule__GSSIfaceConstSize__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2());
        	
        try {
            // InternalIFACE.g:6219:1: ( rule__GSSIfaceConstSize__UnorderedGroup_2__0 {...}?)
            // InternalIFACE.g:6220:2: rule__GSSIfaceConstSize__UnorderedGroup_2__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__UnorderedGroup_2__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__GSSIfaceConstSize__UnorderedGroup_2", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__UnorderedGroup_2"


    // $ANTLR start "rule__GSSIfaceConstSize__UnorderedGroup_2__Impl"
    // InternalIFACE.g:6228:1: rule__GSSIfaceConstSize__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__GSSIfaceConstSize__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceConstSize__Group_2_1__0 ) ) ) ) ) ;
    public final void rule__GSSIfaceConstSize__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalIFACE.g:6233:1: ( ( ({...}? => ( ( ( rule__GSSIfaceConstSize__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceConstSize__Group_2_1__0 ) ) ) ) ) )
            // InternalIFACE.g:6234:3: ( ({...}? => ( ( ( rule__GSSIfaceConstSize__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceConstSize__Group_2_1__0 ) ) ) ) )
            {
            // InternalIFACE.g:6234:3: ( ({...}? => ( ( ( rule__GSSIfaceConstSize__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceConstSize__Group_2_1__0 ) ) ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( LA40_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 0) ) {
                alt40=1;
            }
            else if ( LA40_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 1) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalIFACE.g:6235:3: ({...}? => ( ( ( rule__GSSIfaceConstSize__Group_2_0__0 ) ) ) )
                    {
                    // InternalIFACE.g:6235:3: ({...}? => ( ( ( rule__GSSIfaceConstSize__Group_2_0__0 ) ) ) )
                    // InternalIFACE.g:6236:4: {...}? => ( ( ( rule__GSSIfaceConstSize__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfaceConstSize__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalIFACE.g:6236:113: ( ( ( rule__GSSIfaceConstSize__Group_2_0__0 ) ) )
                    // InternalIFACE.g:6237:5: ( ( rule__GSSIfaceConstSize__Group_2_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 0);
                    selected = true;
                    // InternalIFACE.g:6243:5: ( ( rule__GSSIfaceConstSize__Group_2_0__0 ) )
                    // InternalIFACE.g:6244:6: ( rule__GSSIfaceConstSize__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceConstSizeAccess().getGroup_2_0()); 
                    }
                    // InternalIFACE.g:6245:6: ( rule__GSSIfaceConstSize__Group_2_0__0 )
                    // InternalIFACE.g:6245:7: rule__GSSIfaceConstSize__Group_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceConstSize__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceConstSizeAccess().getGroup_2_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:6250:3: ({...}? => ( ( ( rule__GSSIfaceConstSize__Group_2_1__0 ) ) ) )
                    {
                    // InternalIFACE.g:6250:3: ({...}? => ( ( ( rule__GSSIfaceConstSize__Group_2_1__0 ) ) ) )
                    // InternalIFACE.g:6251:4: {...}? => ( ( ( rule__GSSIfaceConstSize__Group_2_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfaceConstSize__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalIFACE.g:6251:113: ( ( ( rule__GSSIfaceConstSize__Group_2_1__0 ) ) )
                    // InternalIFACE.g:6252:5: ( ( rule__GSSIfaceConstSize__Group_2_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 1);
                    selected = true;
                    // InternalIFACE.g:6258:5: ( ( rule__GSSIfaceConstSize__Group_2_1__0 ) )
                    // InternalIFACE.g:6259:6: ( rule__GSSIfaceConstSize__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceConstSizeAccess().getGroup_2_1()); 
                    }
                    // InternalIFACE.g:6260:6: ( rule__GSSIfaceConstSize__Group_2_1__0 )
                    // InternalIFACE.g:6260:7: rule__GSSIfaceConstSize__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceConstSize__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceConstSizeAccess().getGroup_2_1()); 
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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__GSSIfaceConstSize__UnorderedGroup_2__0"
    // InternalIFACE.g:6273:1: rule__GSSIfaceConstSize__UnorderedGroup_2__0 : rule__GSSIfaceConstSize__UnorderedGroup_2__Impl ( rule__GSSIfaceConstSize__UnorderedGroup_2__1 )? ;
    public final void rule__GSSIfaceConstSize__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6277:1: ( rule__GSSIfaceConstSize__UnorderedGroup_2__Impl ( rule__GSSIfaceConstSize__UnorderedGroup_2__1 )? )
            // InternalIFACE.g:6278:2: rule__GSSIfaceConstSize__UnorderedGroup_2__Impl ( rule__GSSIfaceConstSize__UnorderedGroup_2__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_37);
            rule__GSSIfaceConstSize__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalIFACE.g:6279:2: ( rule__GSSIfaceConstSize__UnorderedGroup_2__1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( LA41_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 0) ) {
                alt41=1;
            }
            else if ( LA41_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 1) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalIFACE.g:0:0: rule__GSSIfaceConstSize__UnorderedGroup_2__1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceConstSize__UnorderedGroup_2__1();

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
    // $ANTLR end "rule__GSSIfaceConstSize__UnorderedGroup_2__0"


    // $ANTLR start "rule__GSSIfaceConstSize__UnorderedGroup_2__1"
    // InternalIFACE.g:6285:1: rule__GSSIfaceConstSize__UnorderedGroup_2__1 : rule__GSSIfaceConstSize__UnorderedGroup_2__Impl ;
    public final void rule__GSSIfaceConstSize__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6289:1: ( rule__GSSIfaceConstSize__UnorderedGroup_2__Impl )
            // InternalIFACE.g:6290:2: rule__GSSIfaceConstSize__UnorderedGroup_2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceConstSize__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__UnorderedGroup_2__1"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2"
    // InternalIFACE.g:6297:1: rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2 : rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__0 {...}?;
    public final void rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2());
        	
        try {
            // InternalIFACE.g:6302:1: ( rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__0 {...}?)
            // InternalIFACE.g:6303:2: rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__Impl"
    // InternalIFACE.g:6311:1: rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__GSSIfaceSizeFieldOffset__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceSizeFieldOffset__Group_2_1__0 ) ) ) ) ) ;
    public final void rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalIFACE.g:6316:1: ( ( ({...}? => ( ( ( rule__GSSIfaceSizeFieldOffset__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceSizeFieldOffset__Group_2_1__0 ) ) ) ) ) )
            // InternalIFACE.g:6317:3: ( ({...}? => ( ( ( rule__GSSIfaceSizeFieldOffset__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceSizeFieldOffset__Group_2_1__0 ) ) ) ) )
            {
            // InternalIFACE.g:6317:3: ( ({...}? => ( ( ( rule__GSSIfaceSizeFieldOffset__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceSizeFieldOffset__Group_2_1__0 ) ) ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( LA42_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 0) ) {
                alt42=1;
            }
            else if ( LA42_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 1) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalIFACE.g:6318:3: ({...}? => ( ( ( rule__GSSIfaceSizeFieldOffset__Group_2_0__0 ) ) ) )
                    {
                    // InternalIFACE.g:6318:3: ({...}? => ( ( ( rule__GSSIfaceSizeFieldOffset__Group_2_0__0 ) ) ) )
                    // InternalIFACE.g:6319:4: {...}? => ( ( ( rule__GSSIfaceSizeFieldOffset__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalIFACE.g:6319:119: ( ( ( rule__GSSIfaceSizeFieldOffset__Group_2_0__0 ) ) )
                    // InternalIFACE.g:6320:5: ( ( rule__GSSIfaceSizeFieldOffset__Group_2_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 0);
                    selected = true;
                    // InternalIFACE.g:6326:5: ( ( rule__GSSIfaceSizeFieldOffset__Group_2_0__0 ) )
                    // InternalIFACE.g:6327:6: ( rule__GSSIfaceSizeFieldOffset__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getGroup_2_0()); 
                    }
                    // InternalIFACE.g:6328:6: ( rule__GSSIfaceSizeFieldOffset__Group_2_0__0 )
                    // InternalIFACE.g:6328:7: rule__GSSIfaceSizeFieldOffset__Group_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceSizeFieldOffset__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getGroup_2_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:6333:3: ({...}? => ( ( ( rule__GSSIfaceSizeFieldOffset__Group_2_1__0 ) ) ) )
                    {
                    // InternalIFACE.g:6333:3: ({...}? => ( ( ( rule__GSSIfaceSizeFieldOffset__Group_2_1__0 ) ) ) )
                    // InternalIFACE.g:6334:4: {...}? => ( ( ( rule__GSSIfaceSizeFieldOffset__Group_2_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalIFACE.g:6334:119: ( ( ( rule__GSSIfaceSizeFieldOffset__Group_2_1__0 ) ) )
                    // InternalIFACE.g:6335:5: ( ( rule__GSSIfaceSizeFieldOffset__Group_2_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 1);
                    selected = true;
                    // InternalIFACE.g:6341:5: ( ( rule__GSSIfaceSizeFieldOffset__Group_2_1__0 ) )
                    // InternalIFACE.g:6342:6: ( rule__GSSIfaceSizeFieldOffset__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getGroup_2_1()); 
                    }
                    // InternalIFACE.g:6343:6: ( rule__GSSIfaceSizeFieldOffset__Group_2_1__0 )
                    // InternalIFACE.g:6343:7: rule__GSSIfaceSizeFieldOffset__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceSizeFieldOffset__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getGroup_2_1()); 
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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__0"
    // InternalIFACE.g:6356:1: rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__0 : rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__Impl ( rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__1 )? ;
    public final void rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6360:1: ( rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__Impl ( rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__1 )? )
            // InternalIFACE.g:6361:2: rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__Impl ( rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_37);
            rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalIFACE.g:6362:2: ( rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( LA43_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 0) ) {
                alt43=1;
            }
            else if ( LA43_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 1) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalIFACE.g:0:0: rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__1();

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
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__0"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__1"
    // InternalIFACE.g:6368:1: rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__1 : rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__Impl ;
    public final void rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6372:1: ( rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__Impl )
            // InternalIFACE.g:6373:2: rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__1"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2"
    // InternalIFACE.g:6380:1: rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2 : rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__0 {...}?;
    public final void rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2());
        	
        try {
            // InternalIFACE.g:6385:1: ( rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__0 {...}?)
            // InternalIFACE.g:6386:2: rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__Impl"
    // InternalIFACE.g:6394:1: rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__GSSIfaceSizeFieldTrim__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceSizeFieldTrim__Group_2_1__0 ) ) ) ) ) ;
    public final void rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalIFACE.g:6399:1: ( ( ({...}? => ( ( ( rule__GSSIfaceSizeFieldTrim__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceSizeFieldTrim__Group_2_1__0 ) ) ) ) ) )
            // InternalIFACE.g:6400:3: ( ({...}? => ( ( ( rule__GSSIfaceSizeFieldTrim__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceSizeFieldTrim__Group_2_1__0 ) ) ) ) )
            {
            // InternalIFACE.g:6400:3: ( ({...}? => ( ( ( rule__GSSIfaceSizeFieldTrim__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfaceSizeFieldTrim__Group_2_1__0 ) ) ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( LA44_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 0) ) {
                alt44=1;
            }
            else if ( LA44_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 1) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalIFACE.g:6401:3: ({...}? => ( ( ( rule__GSSIfaceSizeFieldTrim__Group_2_0__0 ) ) ) )
                    {
                    // InternalIFACE.g:6401:3: ({...}? => ( ( ( rule__GSSIfaceSizeFieldTrim__Group_2_0__0 ) ) ) )
                    // InternalIFACE.g:6402:4: {...}? => ( ( ( rule__GSSIfaceSizeFieldTrim__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalIFACE.g:6402:117: ( ( ( rule__GSSIfaceSizeFieldTrim__Group_2_0__0 ) ) )
                    // InternalIFACE.g:6403:5: ( ( rule__GSSIfaceSizeFieldTrim__Group_2_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 0);
                    selected = true;
                    // InternalIFACE.g:6409:5: ( ( rule__GSSIfaceSizeFieldTrim__Group_2_0__0 ) )
                    // InternalIFACE.g:6410:6: ( rule__GSSIfaceSizeFieldTrim__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getGroup_2_0()); 
                    }
                    // InternalIFACE.g:6411:6: ( rule__GSSIfaceSizeFieldTrim__Group_2_0__0 )
                    // InternalIFACE.g:6411:7: rule__GSSIfaceSizeFieldTrim__Group_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceSizeFieldTrim__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getGroup_2_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:6416:3: ({...}? => ( ( ( rule__GSSIfaceSizeFieldTrim__Group_2_1__0 ) ) ) )
                    {
                    // InternalIFACE.g:6416:3: ({...}? => ( ( ( rule__GSSIfaceSizeFieldTrim__Group_2_1__0 ) ) ) )
                    // InternalIFACE.g:6417:4: {...}? => ( ( ( rule__GSSIfaceSizeFieldTrim__Group_2_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalIFACE.g:6417:117: ( ( ( rule__GSSIfaceSizeFieldTrim__Group_2_1__0 ) ) )
                    // InternalIFACE.g:6418:5: ( ( rule__GSSIfaceSizeFieldTrim__Group_2_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 1);
                    selected = true;
                    // InternalIFACE.g:6424:5: ( ( rule__GSSIfaceSizeFieldTrim__Group_2_1__0 ) )
                    // InternalIFACE.g:6425:6: ( rule__GSSIfaceSizeFieldTrim__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getGroup_2_1()); 
                    }
                    // InternalIFACE.g:6426:6: ( rule__GSSIfaceSizeFieldTrim__Group_2_1__0 )
                    // InternalIFACE.g:6426:7: rule__GSSIfaceSizeFieldTrim__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceSizeFieldTrim__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getGroup_2_1()); 
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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__0"
    // InternalIFACE.g:6439:1: rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__0 : rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__Impl ( rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__1 )? ;
    public final void rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6443:1: ( rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__Impl ( rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__1 )? )
            // InternalIFACE.g:6444:2: rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__Impl ( rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_37);
            rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalIFACE.g:6445:2: ( rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( LA45_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 0) ) {
                alt45=1;
            }
            else if ( LA45_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 1) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalIFACE.g:0:0: rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__1();

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
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__0"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__1"
    // InternalIFACE.g:6451:1: rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__1 : rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__Impl ;
    public final void rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6455:1: ( rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__Impl )
            // InternalIFACE.g:6456:2: rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__1"


    // $ANTLR start "rule__GSSModelFile__ImportsAssignment_0"
    // InternalIFACE.g:6463:1: rule__GSSModelFile__ImportsAssignment_0 : ( ruleGSSModelFileImport ) ;
    public final void rule__GSSModelFile__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6467:1: ( ( ruleGSSModelFileImport ) )
            // InternalIFACE.g:6468:2: ( ruleGSSModelFileImport )
            {
            // InternalIFACE.g:6468:2: ( ruleGSSModelFileImport )
            // InternalIFACE.g:6469:3: ruleGSSModelFileImport
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
    // InternalIFACE.g:6478:1: rule__GSSModelFile__ElementAssignment_1 : ( ruleGSSIfacePortConfig ) ;
    public final void rule__GSSModelFile__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6482:1: ( ( ruleGSSIfacePortConfig ) )
            // InternalIFACE.g:6483:2: ( ruleGSSIfacePortConfig )
            {
            // InternalIFACE.g:6483:2: ( ruleGSSIfacePortConfig )
            // InternalIFACE.g:6484:3: ruleGSSIfacePortConfig
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
    // InternalIFACE.g:6493:1: rule__GSSModelFileImport__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GSSModelFileImport__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6497:1: ( ( RULE_STRING ) )
            // InternalIFACE.g:6498:2: ( RULE_STRING )
            {
            // InternalIFACE.g:6498:2: ( RULE_STRING )
            // InternalIFACE.g:6499:3: RULE_STRING
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
    // InternalIFACE.g:6508:1: rule__GSSIfacePortConfig__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GSSIfacePortConfig__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6512:1: ( ( RULE_ID ) )
            // InternalIFACE.g:6513:2: ( RULE_ID )
            {
            // InternalIFACE.g:6513:2: ( RULE_ID )
            // InternalIFACE.g:6514:3: RULE_ID
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
    // InternalIFACE.g:6523:1: rule__GSSIfacePortConfig__UriAssignment_3_0_2 : ( ruleQualifiedName ) ;
    public final void rule__GSSIfacePortConfig__UriAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6527:1: ( ( ruleQualifiedName ) )
            // InternalIFACE.g:6528:2: ( ruleQualifiedName )
            {
            // InternalIFACE.g:6528:2: ( ruleQualifiedName )
            // InternalIFACE.g:6529:3: ruleQualifiedName
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
    // InternalIFACE.g:6538:1: rule__GSSIfacePortConfig__VersionAssignment_3_1_2 : ( ruleVersion ) ;
    public final void rule__GSSIfacePortConfig__VersionAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6542:1: ( ( ruleVersion ) )
            // InternalIFACE.g:6543:2: ( ruleVersion )
            {
            // InternalIFACE.g:6543:2: ( ruleVersion )
            // InternalIFACE.g:6544:3: ruleVersion
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


    // $ANTLR start "rule__GSSIfacePortConfig__PortAssignment_3_2"
    // InternalIFACE.g:6553:1: rule__GSSIfacePortConfig__PortAssignment_3_2 : ( ruleGSSIfacePort ) ;
    public final void rule__GSSIfacePortConfig__PortAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6557:1: ( ( ruleGSSIfacePort ) )
            // InternalIFACE.g:6558:2: ( ruleGSSIfacePort )
            {
            // InternalIFACE.g:6558:2: ( ruleGSSIfacePort )
            // InternalIFACE.g:6559:3: ruleGSSIfacePort
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getPortGSSIfacePortParserRuleCall_3_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfacePort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortConfigAccess().getPortGSSIfacePortParserRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortConfig__PortAssignment_3_2"


    // $ANTLR start "rule__GSSIfaceSpWPort__TypeAssignment_2_0_2"
    // InternalIFACE.g:6568:1: rule__GSSIfaceSpWPort__TypeAssignment_2_0_2 : ( ruleGSSIfaceSpWPortType ) ;
    public final void rule__GSSIfaceSpWPort__TypeAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6572:1: ( ( ruleGSSIfaceSpWPortType ) )
            // InternalIFACE.g:6573:2: ( ruleGSSIfaceSpWPortType )
            {
            // InternalIFACE.g:6573:2: ( ruleGSSIfaceSpWPortType )
            // InternalIFACE.g:6574:3: ruleGSSIfaceSpWPortType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getTypeGSSIfaceSpWPortTypeEnumRuleCall_2_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceSpWPortType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getTypeGSSIfaceSpWPortTypeEnumRuleCall_2_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__TypeAssignment_2_0_2"


    // $ANTLR start "rule__GSSIfaceSpWPort__LinkAssignment_2_1_2"
    // InternalIFACE.g:6583:1: rule__GSSIfaceSpWPort__LinkAssignment_2_1_2 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSpWPort__LinkAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6587:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6588:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6588:2: ( ruleINTEGER )
            // InternalIFACE.g:6589:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getLinkINTEGERParserRuleCall_2_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getLinkINTEGERParserRuleCall_2_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__LinkAssignment_2_1_2"


    // $ANTLR start "rule__GSSIfaceSpWPort__WritingPortAssignment_2_2_2"
    // InternalIFACE.g:6598:1: rule__GSSIfaceSpWPort__WritingPortAssignment_2_2_2 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSpWPort__WritingPortAssignment_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6602:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6603:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6603:2: ( ruleINTEGER )
            // InternalIFACE.g:6604:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortINTEGERParserRuleCall_2_2_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortINTEGERParserRuleCall_2_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__WritingPortAssignment_2_2_2"


    // $ANTLR start "rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3"
    // InternalIFACE.g:6613:1: rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 : ( ruleGSSIfaceReadingPort ) ;
    public final void rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6617:1: ( ( ruleGSSIfaceReadingPort ) )
            // InternalIFACE.g:6618:2: ( ruleGSSIfaceReadingPort )
            {
            // InternalIFACE.g:6618:2: ( ruleGSSIfaceReadingPort )
            // InternalIFACE.g:6619:3: ruleGSSIfaceReadingPort
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortGSSIfaceReadingPortParserRuleCall_2_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceReadingPort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortGSSIfaceReadingPortParserRuleCall_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3"


    // $ANTLR start "rule__GSSIfaceReadingPort__PortAssignment_2_2"
    // InternalIFACE.g:6628:1: rule__GSSIfaceReadingPort__PortAssignment_2_2 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceReadingPort__PortAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6632:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6633:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6633:2: ( ruleINTEGER )
            // InternalIFACE.g:6634:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getPortINTEGERParserRuleCall_2_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceReadingPortAccess().getPortINTEGERParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceReadingPort__PortAssignment_2_2"


    // $ANTLR start "rule__GSSIfaceUartPort__NumberAssignment_2_0_2"
    // InternalIFACE.g:6643:1: rule__GSSIfaceUartPort__NumberAssignment_2_0_2 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceUartPort__NumberAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6647:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6648:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6648:2: ( ruleINTEGER )
            // InternalIFACE.g:6649:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getNumberINTEGERParserRuleCall_2_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getNumberINTEGERParserRuleCall_2_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__NumberAssignment_2_0_2"


    // $ANTLR start "rule__GSSIfaceUartPort__BaudRateAssignment_2_1_2"
    // InternalIFACE.g:6658:1: rule__GSSIfaceUartPort__BaudRateAssignment_2_1_2 : ( ruleGSSIfaceUartPortBaudRate ) ;
    public final void rule__GSSIfaceUartPort__BaudRateAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6662:1: ( ( ruleGSSIfaceUartPortBaudRate ) )
            // InternalIFACE.g:6663:2: ( ruleGSSIfaceUartPortBaudRate )
            {
            // InternalIFACE.g:6663:2: ( ruleGSSIfaceUartPortBaudRate )
            // InternalIFACE.g:6664:3: ruleGSSIfaceUartPortBaudRate
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateGSSIfaceUartPortBaudRateEnumRuleCall_2_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceUartPortBaudRate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateGSSIfaceUartPortBaudRateEnumRuleCall_2_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__BaudRateAssignment_2_1_2"


    // $ANTLR start "rule__GSSIfaceUartPort__ParityAssignment_2_2_2"
    // InternalIFACE.g:6673:1: rule__GSSIfaceUartPort__ParityAssignment_2_2_2 : ( ruleGSSIfaceUartPortParity ) ;
    public final void rule__GSSIfaceUartPort__ParityAssignment_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6677:1: ( ( ruleGSSIfaceUartPortParity ) )
            // InternalIFACE.g:6678:2: ( ruleGSSIfaceUartPortParity )
            {
            // InternalIFACE.g:6678:2: ( ruleGSSIfaceUartPortParity )
            // InternalIFACE.g:6679:3: ruleGSSIfaceUartPortParity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getParityGSSIfaceUartPortParityEnumRuleCall_2_2_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceUartPortParity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getParityGSSIfaceUartPortParityEnumRuleCall_2_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__ParityAssignment_2_2_2"


    // $ANTLR start "rule__GSSIfaceUartPort__DataBitsAssignment_2_3_2"
    // InternalIFACE.g:6688:1: rule__GSSIfaceUartPort__DataBitsAssignment_2_3_2 : ( ruleGSSIfaceUartPortDataBits ) ;
    public final void rule__GSSIfaceUartPort__DataBitsAssignment_2_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6692:1: ( ( ruleGSSIfaceUartPortDataBits ) )
            // InternalIFACE.g:6693:2: ( ruleGSSIfaceUartPortDataBits )
            {
            // InternalIFACE.g:6693:2: ( ruleGSSIfaceUartPortDataBits )
            // InternalIFACE.g:6694:3: ruleGSSIfaceUartPortDataBits
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsGSSIfaceUartPortDataBitsEnumRuleCall_2_3_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceUartPortDataBits();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsGSSIfaceUartPortDataBitsEnumRuleCall_2_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__DataBitsAssignment_2_3_2"


    // $ANTLR start "rule__GSSIfaceUartPort__StopBitsAssignment_2_4_2"
    // InternalIFACE.g:6703:1: rule__GSSIfaceUartPort__StopBitsAssignment_2_4_2 : ( ruleGSSIfaceUartPortStopBits ) ;
    public final void rule__GSSIfaceUartPort__StopBitsAssignment_2_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6707:1: ( ( ruleGSSIfaceUartPortStopBits ) )
            // InternalIFACE.g:6708:2: ( ruleGSSIfaceUartPortStopBits )
            {
            // InternalIFACE.g:6708:2: ( ruleGSSIfaceUartPortStopBits )
            // InternalIFACE.g:6709:3: ruleGSSIfaceUartPortStopBits
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsGSSIfaceUartPortStopBitsEnumRuleCall_2_4_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceUartPortStopBits();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsGSSIfaceUartPortStopBitsEnumRuleCall_2_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__StopBitsAssignment_2_4_2"


    // $ANTLR start "rule__GSSIfaceUartPort__InputQueueSizeAssignment_2_5_2"
    // InternalIFACE.g:6718:1: rule__GSSIfaceUartPort__InputQueueSizeAssignment_2_5_2 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceUartPort__InputQueueSizeAssignment_2_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6722:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6723:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6723:2: ( ruleINTEGER )
            // InternalIFACE.g:6724:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeINTEGERParserRuleCall_2_5_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeINTEGERParserRuleCall_2_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__InputQueueSizeAssignment_2_5_2"


    // $ANTLR start "rule__GSSIfaceUartPort__OutputQueueSizeAssignment_2_6_2"
    // InternalIFACE.g:6733:1: rule__GSSIfaceUartPort__OutputQueueSizeAssignment_2_6_2 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceUartPort__OutputQueueSizeAssignment_2_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6737:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6738:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6738:2: ( ruleINTEGER )
            // InternalIFACE.g:6739:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeINTEGERParserRuleCall_2_6_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeINTEGERParserRuleCall_2_6_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__OutputQueueSizeAssignment_2_6_2"


    // $ANTLR start "rule__GSSIfaceUartPort__UartProtocolAssignment_2_7"
    // InternalIFACE.g:6748:1: rule__GSSIfaceUartPort__UartProtocolAssignment_2_7 : ( ruleGSSIfaceUartProtocol ) ;
    public final void rule__GSSIfaceUartPort__UartProtocolAssignment_2_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6752:1: ( ( ruleGSSIfaceUartProtocol ) )
            // InternalIFACE.g:6753:2: ( ruleGSSIfaceUartProtocol )
            {
            // InternalIFACE.g:6753:2: ( ruleGSSIfaceUartProtocol )
            // InternalIFACE.g:6754:3: ruleGSSIfaceUartProtocol
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getUartProtocolGSSIfaceUartProtocolParserRuleCall_2_7_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceUartProtocol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getUartProtocolGSSIfaceUartProtocolParserRuleCall_2_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__UartProtocolAssignment_2_7"


    // $ANTLR start "rule__GSSIfaceUartProtocol__UnitAssignment_2_0_2"
    // InternalIFACE.g:6763:1: rule__GSSIfaceUartProtocol__UnitAssignment_2_0_2 : ( ruleGSSIfaceUartProtocolUnit ) ;
    public final void rule__GSSIfaceUartProtocol__UnitAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6767:1: ( ( ruleGSSIfaceUartProtocolUnit ) )
            // InternalIFACE.g:6768:2: ( ruleGSSIfaceUartProtocolUnit )
            {
            // InternalIFACE.g:6768:2: ( ruleGSSIfaceUartProtocolUnit )
            // InternalIFACE.g:6769:3: ruleGSSIfaceUartProtocolUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getUnitGSSIfaceUartProtocolUnitEnumRuleCall_2_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceUartProtocolUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getUnitGSSIfaceUartProtocolUnitEnumRuleCall_2_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__UnitAssignment_2_0_2"


    // $ANTLR start "rule__GSSIfaceUartProtocol__PowerAssignment_2_1_2"
    // InternalIFACE.g:6778:1: rule__GSSIfaceUartProtocol__PowerAssignment_2_1_2 : ( ruleGSSIfaceUartProtocolPower ) ;
    public final void rule__GSSIfaceUartProtocol__PowerAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6782:1: ( ( ruleGSSIfaceUartProtocolPower ) )
            // InternalIFACE.g:6783:2: ( ruleGSSIfaceUartProtocolPower )
            {
            // InternalIFACE.g:6783:2: ( ruleGSSIfaceUartProtocolPower )
            // InternalIFACE.g:6784:3: ruleGSSIfaceUartProtocolPower
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getPowerGSSIfaceUartProtocolPowerEnumRuleCall_2_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceUartProtocolPower();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getPowerGSSIfaceUartProtocolPowerEnumRuleCall_2_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__PowerAssignment_2_1_2"


    // $ANTLR start "rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2"
    // InternalIFACE.g:6793:1: rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2 : ( ruleGSSIfaceConstSize ) ;
    public final void rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6797:1: ( ( ruleGSSIfaceConstSize ) )
            // InternalIFACE.g:6798:2: ( ruleGSSIfaceConstSize )
            {
            // InternalIFACE.g:6798:2: ( ruleGSSIfaceConstSize )
            // InternalIFACE.g:6799:3: ruleGSSIfaceConstSize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getConstSizeGSSIfaceConstSizeParserRuleCall_2_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceConstSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getConstSizeGSSIfaceConstSizeParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2"


    // $ANTLR start "rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3"
    // InternalIFACE.g:6808:1: rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3 : ( ruleGSSIfaceSizeFieldOffset ) ;
    public final void rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6812:1: ( ( ruleGSSIfaceSizeFieldOffset ) )
            // InternalIFACE.g:6813:2: ( ruleGSSIfaceSizeFieldOffset )
            {
            // InternalIFACE.g:6813:2: ( ruleGSSIfaceSizeFieldOffset )
            // InternalIFACE.g:6814:3: ruleGSSIfaceSizeFieldOffset
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldOffsetGSSIfaceSizeFieldOffsetParserRuleCall_2_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceSizeFieldOffset();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldOffsetGSSIfaceSizeFieldOffsetParserRuleCall_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3"


    // $ANTLR start "rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4"
    // InternalIFACE.g:6823:1: rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4 : ( ruleGSSIfaceSizeFieldTrim ) ;
    public final void rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6827:1: ( ( ruleGSSIfaceSizeFieldTrim ) )
            // InternalIFACE.g:6828:2: ( ruleGSSIfaceSizeFieldTrim )
            {
            // InternalIFACE.g:6828:2: ( ruleGSSIfaceSizeFieldTrim )
            // InternalIFACE.g:6829:3: ruleGSSIfaceSizeFieldTrim
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldTrimGSSIfaceSizeFieldTrimParserRuleCall_2_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceSizeFieldTrim();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldTrimGSSIfaceSizeFieldTrimParserRuleCall_2_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4"


    // $ANTLR start "rule__GSSIfaceUartProtocol__SyncPatternAssignment_2_5"
    // InternalIFACE.g:6838:1: rule__GSSIfaceUartProtocol__SyncPatternAssignment_2_5 : ( ruleGSSIfaceSyncPattern ) ;
    public final void rule__GSSIfaceUartProtocol__SyncPatternAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6842:1: ( ( ruleGSSIfaceSyncPattern ) )
            // InternalIFACE.g:6843:2: ( ruleGSSIfaceSyncPattern )
            {
            // InternalIFACE.g:6843:2: ( ruleGSSIfaceSyncPattern )
            // InternalIFACE.g:6844:3: ruleGSSIfaceSyncPattern
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getSyncPatternGSSIfaceSyncPatternParserRuleCall_2_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceSyncPattern();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartProtocolAccess().getSyncPatternGSSIfaceSyncPatternParserRuleCall_2_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartProtocol__SyncPatternAssignment_2_5"


    // $ANTLR start "rule__GSSIfaceConstSize__BytesAssignment_2_0_2"
    // InternalIFACE.g:6853:1: rule__GSSIfaceConstSize__BytesAssignment_2_0_2 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceConstSize__BytesAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6857:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6858:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6858:2: ( ruleINTEGER )
            // InternalIFACE.g:6859:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getBytesINTEGERParserRuleCall_2_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getBytesINTEGERParserRuleCall_2_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__BytesAssignment_2_0_2"


    // $ANTLR start "rule__GSSIfaceConstSize__BitsAssignment_2_1_2"
    // InternalIFACE.g:6868:1: rule__GSSIfaceConstSize__BitsAssignment_2_1_2 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceConstSize__BitsAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6872:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6873:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6873:2: ( ruleINTEGER )
            // InternalIFACE.g:6874:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getBitsINTEGERParserRuleCall_2_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceConstSizeAccess().getBitsINTEGERParserRuleCall_2_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceConstSize__BitsAssignment_2_1_2"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__BytesAssignment_2_0_2"
    // InternalIFACE.g:6883:1: rule__GSSIfaceSizeFieldOffset__BytesAssignment_2_0_2 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSizeFieldOffset__BytesAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6887:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6888:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6888:2: ( ruleINTEGER )
            // InternalIFACE.g:6889:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesINTEGERParserRuleCall_2_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesINTEGERParserRuleCall_2_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__BytesAssignment_2_0_2"


    // $ANTLR start "rule__GSSIfaceSizeFieldOffset__BitsAssignment_2_1_2"
    // InternalIFACE.g:6898:1: rule__GSSIfaceSizeFieldOffset__BitsAssignment_2_1_2 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSizeFieldOffset__BitsAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6902:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6903:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6903:2: ( ruleINTEGER )
            // InternalIFACE.g:6904:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsINTEGERParserRuleCall_2_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsINTEGERParserRuleCall_2_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldOffset__BitsAssignment_2_1_2"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__BytesAssignment_2_0_2"
    // InternalIFACE.g:6913:1: rule__GSSIfaceSizeFieldTrim__BytesAssignment_2_0_2 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSizeFieldTrim__BytesAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6917:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6918:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6918:2: ( ruleINTEGER )
            // InternalIFACE.g:6919:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesINTEGERParserRuleCall_2_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesINTEGERParserRuleCall_2_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__BytesAssignment_2_0_2"


    // $ANTLR start "rule__GSSIfaceSizeFieldTrim__BitsAssignment_2_1_2"
    // InternalIFACE.g:6928:1: rule__GSSIfaceSizeFieldTrim__BitsAssignment_2_1_2 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSizeFieldTrim__BitsAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6932:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6933:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6933:2: ( ruleINTEGER )
            // InternalIFACE.g:6934:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsINTEGERParserRuleCall_2_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsINTEGERParserRuleCall_2_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSizeFieldTrim__BitsAssignment_2_1_2"


    // $ANTLR start "rule__GSSIfaceSyncPattern__HexValueAssignment_2_2"
    // InternalIFACE.g:6943:1: rule__GSSIfaceSyncPattern__HexValueAssignment_2_2 : ( RULE_HEXADECIMAL ) ;
    public final void rule__GSSIfaceSyncPattern__HexValueAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6947:1: ( ( RULE_HEXADECIMAL ) )
            // InternalIFACE.g:6948:2: ( RULE_HEXADECIMAL )
            {
            // InternalIFACE.g:6948:2: ( RULE_HEXADECIMAL )
            // InternalIFACE.g:6949:3: RULE_HEXADECIMAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueHEXADECIMALTerminalRuleCall_2_2_0()); 
            }
            match(input,RULE_HEXADECIMAL,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueHEXADECIMALTerminalRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSyncPattern__HexValueAssignment_2_2"


    // $ANTLR start "rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_2_2"
    // InternalIFACE.g:6958:1: rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_2_2 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6962:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6963:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6963:2: ( ruleINTEGER )
            // InternalIFACE.g:6964:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefINTEGERParserRuleCall_2_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefINTEGERParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_2_2"

    // $ANTLR start synpred27_InternalIFACE
    public final void synpred27_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5545:3: ( ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) ) )
        // InternalIFACE.g:5545:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) )
        {
        // InternalIFACE.g:5545:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) )
        // InternalIFACE.g:5546:4: {...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred27_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalIFACE.g:5546:114: ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) )
        // InternalIFACE.g:5547:5: ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0);
        // InternalIFACE.g:5553:5: ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) )
        // InternalIFACE.g:5554:6: ( rule__GSSIfacePortConfig__Group_3_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSIfacePortConfigAccess().getGroup_3_0()); 
        }
        // InternalIFACE.g:5555:6: ( rule__GSSIfacePortConfig__Group_3_0__0 )
        // InternalIFACE.g:5555:7: rule__GSSIfacePortConfig__Group_3_0__0
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
    // $ANTLR end synpred27_InternalIFACE

    // $ANTLR start synpred28_InternalIFACE
    public final void synpred28_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5560:3: ( ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) ) )
        // InternalIFACE.g:5560:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) )
        {
        // InternalIFACE.g:5560:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) )
        // InternalIFACE.g:5561:4: {...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred28_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1)");
        }
        // InternalIFACE.g:5561:114: ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) )
        // InternalIFACE.g:5562:5: ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1);
        // InternalIFACE.g:5568:5: ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) )
        // InternalIFACE.g:5569:6: ( rule__GSSIfacePortConfig__Group_3_1__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSIfacePortConfigAccess().getGroup_3_1()); 
        }
        // InternalIFACE.g:5570:6: ( rule__GSSIfacePortConfig__Group_3_1__0 )
        // InternalIFACE.g:5570:7: rule__GSSIfacePortConfig__Group_3_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfacePortConfig__Group_3_1__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred28_InternalIFACE

    // $ANTLR start synpred29_InternalIFACE
    public final void synpred29_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5604:2: ( rule__GSSIfacePortConfig__UnorderedGroup_3__1 )
        // InternalIFACE.g:5604:2: rule__GSSIfacePortConfig__UnorderedGroup_3__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfacePortConfig__UnorderedGroup_3__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalIFACE

    // $ANTLR start synpred30_InternalIFACE
    public final void synpred30_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5616:2: ( rule__GSSIfacePortConfig__UnorderedGroup_3__2 )
        // InternalIFACE.g:5616:2: rule__GSSIfacePortConfig__UnorderedGroup_3__2
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfacePortConfig__UnorderedGroup_3__2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalIFACE

    // $ANTLR start synpred31_InternalIFACE
    public final void synpred31_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5655:3: ( ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_0__0 ) ) ) ) )
        // InternalIFACE.g:5655:3: ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_0__0 ) ) ) )
        {
        // InternalIFACE.g:5655:3: ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_0__0 ) ) ) )
        // InternalIFACE.g:5656:4: {...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred31_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 0)");
        }
        // InternalIFACE.g:5656:111: ( ( ( rule__GSSIfaceSpWPort__Group_2_0__0 ) ) )
        // InternalIFACE.g:5657:5: ( ( rule__GSSIfaceSpWPort__Group_2_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 0);
        // InternalIFACE.g:5663:5: ( ( rule__GSSIfaceSpWPort__Group_2_0__0 ) )
        // InternalIFACE.g:5664:6: ( rule__GSSIfaceSpWPort__Group_2_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSIfaceSpWPortAccess().getGroup_2_0()); 
        }
        // InternalIFACE.g:5665:6: ( rule__GSSIfaceSpWPort__Group_2_0__0 )
        // InternalIFACE.g:5665:7: rule__GSSIfaceSpWPort__Group_2_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceSpWPort__Group_2_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalIFACE

    // $ANTLR start synpred32_InternalIFACE
    public final void synpred32_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5670:3: ( ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_1__0 ) ) ) ) )
        // InternalIFACE.g:5670:3: ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_1__0 ) ) ) )
        {
        // InternalIFACE.g:5670:3: ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_1__0 ) ) ) )
        // InternalIFACE.g:5671:4: {...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_1__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred32_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 1)");
        }
        // InternalIFACE.g:5671:111: ( ( ( rule__GSSIfaceSpWPort__Group_2_1__0 ) ) )
        // InternalIFACE.g:5672:5: ( ( rule__GSSIfaceSpWPort__Group_2_1__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 1);
        // InternalIFACE.g:5678:5: ( ( rule__GSSIfaceSpWPort__Group_2_1__0 ) )
        // InternalIFACE.g:5679:6: ( rule__GSSIfaceSpWPort__Group_2_1__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSIfaceSpWPortAccess().getGroup_2_1()); 
        }
        // InternalIFACE.g:5680:6: ( rule__GSSIfaceSpWPort__Group_2_1__0 )
        // InternalIFACE.g:5680:7: rule__GSSIfaceSpWPort__Group_2_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceSpWPort__Group_2_1__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred32_InternalIFACE

    // $ANTLR start synpred33_InternalIFACE
    public final void synpred33_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5685:3: ( ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_2__0 ) ) ) ) )
        // InternalIFACE.g:5685:3: ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_2__0 ) ) ) )
        {
        // InternalIFACE.g:5685:3: ({...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_2__0 ) ) ) )
        // InternalIFACE.g:5686:4: {...}? => ( ( ( rule__GSSIfaceSpWPort__Group_2_2__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred33_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 2)");
        }
        // InternalIFACE.g:5686:111: ( ( ( rule__GSSIfaceSpWPort__Group_2_2__0 ) ) )
        // InternalIFACE.g:5687:5: ( ( rule__GSSIfaceSpWPort__Group_2_2__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 2);
        // InternalIFACE.g:5693:5: ( ( rule__GSSIfaceSpWPort__Group_2_2__0 ) )
        // InternalIFACE.g:5694:6: ( rule__GSSIfaceSpWPort__Group_2_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSIfaceSpWPortAccess().getGroup_2_2()); 
        }
        // InternalIFACE.g:5695:6: ( rule__GSSIfaceSpWPort__Group_2_2__0 )
        // InternalIFACE.g:5695:7: rule__GSSIfaceSpWPort__Group_2_2__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceSpWPort__Group_2_2__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred33_InternalIFACE

    // $ANTLR start synpred34_InternalIFACE
    public final void synpred34_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5716:8: ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )
        // InternalIFACE.g:5716:9: rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalIFACE

    // $ANTLR start synpred35_InternalIFACE
    public final void synpred35_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5736:2: ( rule__GSSIfaceSpWPort__UnorderedGroup_2__1 )
        // InternalIFACE.g:5736:2: rule__GSSIfaceSpWPort__UnorderedGroup_2__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceSpWPort__UnorderedGroup_2__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalIFACE

    // $ANTLR start synpred36_InternalIFACE
    public final void synpred36_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5748:2: ( rule__GSSIfaceSpWPort__UnorderedGroup_2__2 )
        // InternalIFACE.g:5748:2: rule__GSSIfaceSpWPort__UnorderedGroup_2__2
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceSpWPort__UnorderedGroup_2__2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_InternalIFACE

    // $ANTLR start synpred37_InternalIFACE
    public final void synpred37_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5760:2: ( rule__GSSIfaceSpWPort__UnorderedGroup_2__3 )
        // InternalIFACE.g:5760:2: rule__GSSIfaceSpWPort__UnorderedGroup_2__3
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceSpWPort__UnorderedGroup_2__3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalIFACE

    // $ANTLR start synpred38_InternalIFACE
    public final void synpred38_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5799:3: ( ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_0__0 ) ) ) ) )
        // InternalIFACE.g:5799:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_0__0 ) ) ) )
        {
        // InternalIFACE.g:5799:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_0__0 ) ) ) )
        // InternalIFACE.g:5800:4: {...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred38_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 0)");
        }
        // InternalIFACE.g:5800:112: ( ( ( rule__GSSIfaceUartPort__Group_2_0__0 ) ) )
        // InternalIFACE.g:5801:5: ( ( rule__GSSIfaceUartPort__Group_2_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 0);
        // InternalIFACE.g:5807:5: ( ( rule__GSSIfaceUartPort__Group_2_0__0 ) )
        // InternalIFACE.g:5808:6: ( rule__GSSIfaceUartPort__Group_2_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_0()); 
        }
        // InternalIFACE.g:5809:6: ( rule__GSSIfaceUartPort__Group_2_0__0 )
        // InternalIFACE.g:5809:7: rule__GSSIfaceUartPort__Group_2_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceUartPort__Group_2_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred38_InternalIFACE

    // $ANTLR start synpred39_InternalIFACE
    public final void synpred39_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5814:3: ( ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_1__0 ) ) ) ) )
        // InternalIFACE.g:5814:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_1__0 ) ) ) )
        {
        // InternalIFACE.g:5814:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_1__0 ) ) ) )
        // InternalIFACE.g:5815:4: {...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_1__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred39_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 1)");
        }
        // InternalIFACE.g:5815:112: ( ( ( rule__GSSIfaceUartPort__Group_2_1__0 ) ) )
        // InternalIFACE.g:5816:5: ( ( rule__GSSIfaceUartPort__Group_2_1__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 1);
        // InternalIFACE.g:5822:5: ( ( rule__GSSIfaceUartPort__Group_2_1__0 ) )
        // InternalIFACE.g:5823:6: ( rule__GSSIfaceUartPort__Group_2_1__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_1()); 
        }
        // InternalIFACE.g:5824:6: ( rule__GSSIfaceUartPort__Group_2_1__0 )
        // InternalIFACE.g:5824:7: rule__GSSIfaceUartPort__Group_2_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceUartPort__Group_2_1__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred39_InternalIFACE

    // $ANTLR start synpred40_InternalIFACE
    public final void synpred40_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5829:3: ( ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_2__0 ) ) ) ) )
        // InternalIFACE.g:5829:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_2__0 ) ) ) )
        {
        // InternalIFACE.g:5829:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_2__0 ) ) ) )
        // InternalIFACE.g:5830:4: {...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_2__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred40_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 2)");
        }
        // InternalIFACE.g:5830:112: ( ( ( rule__GSSIfaceUartPort__Group_2_2__0 ) ) )
        // InternalIFACE.g:5831:5: ( ( rule__GSSIfaceUartPort__Group_2_2__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 2);
        // InternalIFACE.g:5837:5: ( ( rule__GSSIfaceUartPort__Group_2_2__0 ) )
        // InternalIFACE.g:5838:6: ( rule__GSSIfaceUartPort__Group_2_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_2()); 
        }
        // InternalIFACE.g:5839:6: ( rule__GSSIfaceUartPort__Group_2_2__0 )
        // InternalIFACE.g:5839:7: rule__GSSIfaceUartPort__Group_2_2__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceUartPort__Group_2_2__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred40_InternalIFACE

    // $ANTLR start synpred41_InternalIFACE
    public final void synpred41_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5844:3: ( ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_3__0 ) ) ) ) )
        // InternalIFACE.g:5844:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_3__0 ) ) ) )
        {
        // InternalIFACE.g:5844:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_3__0 ) ) ) )
        // InternalIFACE.g:5845:4: {...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_3__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred41_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 3)");
        }
        // InternalIFACE.g:5845:112: ( ( ( rule__GSSIfaceUartPort__Group_2_3__0 ) ) )
        // InternalIFACE.g:5846:5: ( ( rule__GSSIfaceUartPort__Group_2_3__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 3);
        // InternalIFACE.g:5852:5: ( ( rule__GSSIfaceUartPort__Group_2_3__0 ) )
        // InternalIFACE.g:5853:6: ( rule__GSSIfaceUartPort__Group_2_3__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_3()); 
        }
        // InternalIFACE.g:5854:6: ( rule__GSSIfaceUartPort__Group_2_3__0 )
        // InternalIFACE.g:5854:7: rule__GSSIfaceUartPort__Group_2_3__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceUartPort__Group_2_3__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred41_InternalIFACE

    // $ANTLR start synpred42_InternalIFACE
    public final void synpred42_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5859:3: ( ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_4__0 ) ) ) ) )
        // InternalIFACE.g:5859:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_4__0 ) ) ) )
        {
        // InternalIFACE.g:5859:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_4__0 ) ) ) )
        // InternalIFACE.g:5860:4: {...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_4__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 4) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred42_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 4)");
        }
        // InternalIFACE.g:5860:112: ( ( ( rule__GSSIfaceUartPort__Group_2_4__0 ) ) )
        // InternalIFACE.g:5861:5: ( ( rule__GSSIfaceUartPort__Group_2_4__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 4);
        // InternalIFACE.g:5867:5: ( ( rule__GSSIfaceUartPort__Group_2_4__0 ) )
        // InternalIFACE.g:5868:6: ( rule__GSSIfaceUartPort__Group_2_4__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_4()); 
        }
        // InternalIFACE.g:5869:6: ( rule__GSSIfaceUartPort__Group_2_4__0 )
        // InternalIFACE.g:5869:7: rule__GSSIfaceUartPort__Group_2_4__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceUartPort__Group_2_4__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred42_InternalIFACE

    // $ANTLR start synpred43_InternalIFACE
    public final void synpred43_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5874:3: ( ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_5__0 ) ) ) ) )
        // InternalIFACE.g:5874:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_5__0 ) ) ) )
        {
        // InternalIFACE.g:5874:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_5__0 ) ) ) )
        // InternalIFACE.g:5875:4: {...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_5__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 5) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred43_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 5)");
        }
        // InternalIFACE.g:5875:112: ( ( ( rule__GSSIfaceUartPort__Group_2_5__0 ) ) )
        // InternalIFACE.g:5876:5: ( ( rule__GSSIfaceUartPort__Group_2_5__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 5);
        // InternalIFACE.g:5882:5: ( ( rule__GSSIfaceUartPort__Group_2_5__0 ) )
        // InternalIFACE.g:5883:6: ( rule__GSSIfaceUartPort__Group_2_5__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_5()); 
        }
        // InternalIFACE.g:5884:6: ( rule__GSSIfaceUartPort__Group_2_5__0 )
        // InternalIFACE.g:5884:7: rule__GSSIfaceUartPort__Group_2_5__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceUartPort__Group_2_5__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred43_InternalIFACE

    // $ANTLR start synpred44_InternalIFACE
    public final void synpred44_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5889:3: ( ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_6__0 ) ) ) ) )
        // InternalIFACE.g:5889:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_6__0 ) ) ) )
        {
        // InternalIFACE.g:5889:3: ({...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_6__0 ) ) ) )
        // InternalIFACE.g:5890:4: {...}? => ( ( ( rule__GSSIfaceUartPort__Group_2_6__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 6) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred44_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 6)");
        }
        // InternalIFACE.g:5890:112: ( ( ( rule__GSSIfaceUartPort__Group_2_6__0 ) ) )
        // InternalIFACE.g:5891:5: ( ( rule__GSSIfaceUartPort__Group_2_6__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 6);
        // InternalIFACE.g:5897:5: ( ( rule__GSSIfaceUartPort__Group_2_6__0 ) )
        // InternalIFACE.g:5898:6: ( rule__GSSIfaceUartPort__Group_2_6__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSIfaceUartPortAccess().getGroup_2_6()); 
        }
        // InternalIFACE.g:5899:6: ( rule__GSSIfaceUartPort__Group_2_6__0 )
        // InternalIFACE.g:5899:7: rule__GSSIfaceUartPort__Group_2_6__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceUartPort__Group_2_6__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred44_InternalIFACE

    // $ANTLR start synpred45_InternalIFACE
    public final void synpred45_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5933:2: ( rule__GSSIfaceUartPort__UnorderedGroup_2__1 )
        // InternalIFACE.g:5933:2: rule__GSSIfaceUartPort__UnorderedGroup_2__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceUartPort__UnorderedGroup_2__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_InternalIFACE

    // $ANTLR start synpred46_InternalIFACE
    public final void synpred46_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5945:2: ( rule__GSSIfaceUartPort__UnorderedGroup_2__2 )
        // InternalIFACE.g:5945:2: rule__GSSIfaceUartPort__UnorderedGroup_2__2
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceUartPort__UnorderedGroup_2__2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalIFACE

    // $ANTLR start synpred47_InternalIFACE
    public final void synpred47_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5957:2: ( rule__GSSIfaceUartPort__UnorderedGroup_2__3 )
        // InternalIFACE.g:5957:2: rule__GSSIfaceUartPort__UnorderedGroup_2__3
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceUartPort__UnorderedGroup_2__3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_InternalIFACE

    // $ANTLR start synpred48_InternalIFACE
    public final void synpred48_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5969:2: ( rule__GSSIfaceUartPort__UnorderedGroup_2__4 )
        // InternalIFACE.g:5969:2: rule__GSSIfaceUartPort__UnorderedGroup_2__4
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceUartPort__UnorderedGroup_2__4();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_InternalIFACE

    // $ANTLR start synpred49_InternalIFACE
    public final void synpred49_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5981:2: ( rule__GSSIfaceUartPort__UnorderedGroup_2__5 )
        // InternalIFACE.g:5981:2: rule__GSSIfaceUartPort__UnorderedGroup_2__5
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceUartPort__UnorderedGroup_2__5();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalIFACE

    // $ANTLR start synpred50_InternalIFACE
    public final void synpred50_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5993:2: ( rule__GSSIfaceUartPort__UnorderedGroup_2__6 )
        // InternalIFACE.g:5993:2: rule__GSSIfaceUartPort__UnorderedGroup_2__6
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceUartPort__UnorderedGroup_2__6();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_InternalIFACE

    // $ANTLR start synpred51_InternalIFACE
    public final void synpred51_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:6005:2: ( rule__GSSIfaceUartPort__UnorderedGroup_2__7 )
        // InternalIFACE.g:6005:2: rule__GSSIfaceUartPort__UnorderedGroup_2__7
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceUartPort__UnorderedGroup_2__7();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_InternalIFACE

    // $ANTLR start synpred52_InternalIFACE
    public final void synpred52_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:6044:3: ( ({...}? => ( ( ( rule__GSSIfaceUartProtocol__Group_2_0__0 ) ) ) ) )
        // InternalIFACE.g:6044:3: ({...}? => ( ( ( rule__GSSIfaceUartProtocol__Group_2_0__0 ) ) ) )
        {
        // InternalIFACE.g:6044:3: ({...}? => ( ( ( rule__GSSIfaceUartProtocol__Group_2_0__0 ) ) ) )
        // InternalIFACE.g:6045:4: {...}? => ( ( ( rule__GSSIfaceUartProtocol__Group_2_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred52_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 0)");
        }
        // InternalIFACE.g:6045:116: ( ( ( rule__GSSIfaceUartProtocol__Group_2_0__0 ) ) )
        // InternalIFACE.g:6046:5: ( ( rule__GSSIfaceUartProtocol__Group_2_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 0);
        // InternalIFACE.g:6052:5: ( ( rule__GSSIfaceUartProtocol__Group_2_0__0 ) )
        // InternalIFACE.g:6053:6: ( rule__GSSIfaceUartProtocol__Group_2_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSIfaceUartProtocolAccess().getGroup_2_0()); 
        }
        // InternalIFACE.g:6054:6: ( rule__GSSIfaceUartProtocol__Group_2_0__0 )
        // InternalIFACE.g:6054:7: rule__GSSIfaceUartProtocol__Group_2_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceUartProtocol__Group_2_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred52_InternalIFACE

    // $ANTLR start synpred53_InternalIFACE
    public final void synpred53_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:6059:3: ( ({...}? => ( ( ( rule__GSSIfaceUartProtocol__Group_2_1__0 ) ) ) ) )
        // InternalIFACE.g:6059:3: ({...}? => ( ( ( rule__GSSIfaceUartProtocol__Group_2_1__0 ) ) ) )
        {
        // InternalIFACE.g:6059:3: ({...}? => ( ( ( rule__GSSIfaceUartProtocol__Group_2_1__0 ) ) ) )
        // InternalIFACE.g:6060:4: {...}? => ( ( ( rule__GSSIfaceUartProtocol__Group_2_1__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred53_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 1)");
        }
        // InternalIFACE.g:6060:116: ( ( ( rule__GSSIfaceUartProtocol__Group_2_1__0 ) ) )
        // InternalIFACE.g:6061:5: ( ( rule__GSSIfaceUartProtocol__Group_2_1__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 1);
        // InternalIFACE.g:6067:5: ( ( rule__GSSIfaceUartProtocol__Group_2_1__0 ) )
        // InternalIFACE.g:6068:6: ( rule__GSSIfaceUartProtocol__Group_2_1__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSIfaceUartProtocolAccess().getGroup_2_1()); 
        }
        // InternalIFACE.g:6069:6: ( rule__GSSIfaceUartProtocol__Group_2_1__0 )
        // InternalIFACE.g:6069:7: rule__GSSIfaceUartProtocol__Group_2_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceUartProtocol__Group_2_1__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred53_InternalIFACE

    // $ANTLR start synpred54_InternalIFACE
    public final void synpred54_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:6074:3: ( ({...}? => ( ( ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2 ) ) ) ) )
        // InternalIFACE.g:6074:3: ({...}? => ( ( ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2 ) ) ) )
        {
        // InternalIFACE.g:6074:3: ({...}? => ( ( ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2 ) ) ) )
        // InternalIFACE.g:6075:4: {...}? => ( ( ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred54_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 2)");
        }
        // InternalIFACE.g:6075:116: ( ( ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2 ) ) )
        // InternalIFACE.g:6076:5: ( ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 2);
        // InternalIFACE.g:6082:5: ( ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2 ) )
        // InternalIFACE.g:6083:6: ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSIfaceUartProtocolAccess().getConstSizeAssignment_2_2()); 
        }
        // InternalIFACE.g:6084:6: ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2 )
        // InternalIFACE.g:6084:7: rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceUartProtocol__ConstSizeAssignment_2_2();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred54_InternalIFACE

    // $ANTLR start synpred55_InternalIFACE
    public final void synpred55_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:6089:3: ( ({...}? => ( ( ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3 ) ) ) ) )
        // InternalIFACE.g:6089:3: ({...}? => ( ( ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3 ) ) ) )
        {
        // InternalIFACE.g:6089:3: ({...}? => ( ( ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3 ) ) ) )
        // InternalIFACE.g:6090:4: {...}? => ( ( ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred55_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 3)");
        }
        // InternalIFACE.g:6090:116: ( ( ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3 ) ) )
        // InternalIFACE.g:6091:5: ( ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 3);
        // InternalIFACE.g:6097:5: ( ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3 ) )
        // InternalIFACE.g:6098:6: ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldOffsetAssignment_2_3()); 
        }
        // InternalIFACE.g:6099:6: ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3 )
        // InternalIFACE.g:6099:7: rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_2_3();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred55_InternalIFACE

    // $ANTLR start synpred56_InternalIFACE
    public final void synpred56_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:6104:3: ( ({...}? => ( ( ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4 ) ) ) ) )
        // InternalIFACE.g:6104:3: ({...}? => ( ( ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4 ) ) ) )
        {
        // InternalIFACE.g:6104:3: ({...}? => ( ( ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4 ) ) ) )
        // InternalIFACE.g:6105:4: {...}? => ( ( ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 4) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred56_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 4)");
        }
        // InternalIFACE.g:6105:116: ( ( ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4 ) ) )
        // InternalIFACE.g:6106:5: ( ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 4);
        // InternalIFACE.g:6112:5: ( ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4 ) )
        // InternalIFACE.g:6113:6: ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldTrimAssignment_2_4()); 
        }
        // InternalIFACE.g:6114:6: ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4 )
        // InternalIFACE.g:6114:7: rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_2_4();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred56_InternalIFACE

    // $ANTLR start synpred57_InternalIFACE
    public final void synpred57_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:6148:2: ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__1 )
        // InternalIFACE.g:6148:2: rule__GSSIfaceUartProtocol__UnorderedGroup_2__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceUartProtocol__UnorderedGroup_2__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalIFACE

    // $ANTLR start synpred58_InternalIFACE
    public final void synpred58_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:6160:2: ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__2 )
        // InternalIFACE.g:6160:2: rule__GSSIfaceUartProtocol__UnorderedGroup_2__2
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceUartProtocol__UnorderedGroup_2__2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalIFACE

    // $ANTLR start synpred59_InternalIFACE
    public final void synpred59_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:6172:2: ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__3 )
        // InternalIFACE.g:6172:2: rule__GSSIfaceUartProtocol__UnorderedGroup_2__3
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceUartProtocol__UnorderedGroup_2__3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_InternalIFACE

    // $ANTLR start synpred60_InternalIFACE
    public final void synpred60_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:6184:2: ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__4 )
        // InternalIFACE.g:6184:2: rule__GSSIfaceUartProtocol__UnorderedGroup_2__4
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceUartProtocol__UnorderedGroup_2__4();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_InternalIFACE

    // $ANTLR start synpred61_InternalIFACE
    public final void synpred61_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:6196:2: ( rule__GSSIfaceUartProtocol__UnorderedGroup_2__5 )
        // InternalIFACE.g:6196:2: rule__GSSIfaceUartProtocol__UnorderedGroup_2__5
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceUartProtocol__UnorderedGroup_2__5();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_InternalIFACE

    // $ANTLR start synpred62_InternalIFACE
    public final void synpred62_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:6235:3: ( ({...}? => ( ( ( rule__GSSIfaceConstSize__Group_2_0__0 ) ) ) ) )
        // InternalIFACE.g:6235:3: ({...}? => ( ( ( rule__GSSIfaceConstSize__Group_2_0__0 ) ) ) )
        {
        // InternalIFACE.g:6235:3: ({...}? => ( ( ( rule__GSSIfaceConstSize__Group_2_0__0 ) ) ) )
        // InternalIFACE.g:6236:4: {...}? => ( ( ( rule__GSSIfaceConstSize__Group_2_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred62_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 0)");
        }
        // InternalIFACE.g:6236:113: ( ( ( rule__GSSIfaceConstSize__Group_2_0__0 ) ) )
        // InternalIFACE.g:6237:5: ( ( rule__GSSIfaceConstSize__Group_2_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 0);
        // InternalIFACE.g:6243:5: ( ( rule__GSSIfaceConstSize__Group_2_0__0 ) )
        // InternalIFACE.g:6244:6: ( rule__GSSIfaceConstSize__Group_2_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSIfaceConstSizeAccess().getGroup_2_0()); 
        }
        // InternalIFACE.g:6245:6: ( rule__GSSIfaceConstSize__Group_2_0__0 )
        // InternalIFACE.g:6245:7: rule__GSSIfaceConstSize__Group_2_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceConstSize__Group_2_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred62_InternalIFACE

    // $ANTLR start synpred63_InternalIFACE
    public final void synpred63_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:6279:2: ( rule__GSSIfaceConstSize__UnorderedGroup_2__1 )
        // InternalIFACE.g:6279:2: rule__GSSIfaceConstSize__UnorderedGroup_2__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceConstSize__UnorderedGroup_2__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_InternalIFACE

    // $ANTLR start synpred64_InternalIFACE
    public final void synpred64_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:6318:3: ( ({...}? => ( ( ( rule__GSSIfaceSizeFieldOffset__Group_2_0__0 ) ) ) ) )
        // InternalIFACE.g:6318:3: ({...}? => ( ( ( rule__GSSIfaceSizeFieldOffset__Group_2_0__0 ) ) ) )
        {
        // InternalIFACE.g:6318:3: ({...}? => ( ( ( rule__GSSIfaceSizeFieldOffset__Group_2_0__0 ) ) ) )
        // InternalIFACE.g:6319:4: {...}? => ( ( ( rule__GSSIfaceSizeFieldOffset__Group_2_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred64_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 0)");
        }
        // InternalIFACE.g:6319:119: ( ( ( rule__GSSIfaceSizeFieldOffset__Group_2_0__0 ) ) )
        // InternalIFACE.g:6320:5: ( ( rule__GSSIfaceSizeFieldOffset__Group_2_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 0);
        // InternalIFACE.g:6326:5: ( ( rule__GSSIfaceSizeFieldOffset__Group_2_0__0 ) )
        // InternalIFACE.g:6327:6: ( rule__GSSIfaceSizeFieldOffset__Group_2_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getGroup_2_0()); 
        }
        // InternalIFACE.g:6328:6: ( rule__GSSIfaceSizeFieldOffset__Group_2_0__0 )
        // InternalIFACE.g:6328:7: rule__GSSIfaceSizeFieldOffset__Group_2_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceSizeFieldOffset__Group_2_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred64_InternalIFACE

    // $ANTLR start synpred65_InternalIFACE
    public final void synpred65_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:6362:2: ( rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__1 )
        // InternalIFACE.g:6362:2: rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceSizeFieldOffset__UnorderedGroup_2__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_InternalIFACE

    // $ANTLR start synpred66_InternalIFACE
    public final void synpred66_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:6401:3: ( ({...}? => ( ( ( rule__GSSIfaceSizeFieldTrim__Group_2_0__0 ) ) ) ) )
        // InternalIFACE.g:6401:3: ({...}? => ( ( ( rule__GSSIfaceSizeFieldTrim__Group_2_0__0 ) ) ) )
        {
        // InternalIFACE.g:6401:3: ({...}? => ( ( ( rule__GSSIfaceSizeFieldTrim__Group_2_0__0 ) ) ) )
        // InternalIFACE.g:6402:4: {...}? => ( ( ( rule__GSSIfaceSizeFieldTrim__Group_2_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred66_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 0)");
        }
        // InternalIFACE.g:6402:117: ( ( ( rule__GSSIfaceSizeFieldTrim__Group_2_0__0 ) ) )
        // InternalIFACE.g:6403:5: ( ( rule__GSSIfaceSizeFieldTrim__Group_2_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 0);
        // InternalIFACE.g:6409:5: ( ( rule__GSSIfaceSizeFieldTrim__Group_2_0__0 ) )
        // InternalIFACE.g:6410:6: ( rule__GSSIfaceSizeFieldTrim__Group_2_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getGroup_2_0()); 
        }
        // InternalIFACE.g:6411:6: ( rule__GSSIfaceSizeFieldTrim__Group_2_0__0 )
        // InternalIFACE.g:6411:7: rule__GSSIfaceSizeFieldTrim__Group_2_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceSizeFieldTrim__Group_2_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred66_InternalIFACE

    // $ANTLR start synpred67_InternalIFACE
    public final void synpred67_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:6445:2: ( rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__1 )
        // InternalIFACE.g:6445:2: rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfaceSizeFieldTrim__UnorderedGroup_2__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_InternalIFACE

    // Delegated rules

    public final boolean synpred39_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred67_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalIFACE_fragment(); // can never throw exception
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
    public final boolean synpred52_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred43_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\1\14\uffff";
    static final String dfa_3s = "\1\44\1\uffff\1\43\1\55\1\46\2\4\2\41\1\44\1\41\1\0\1\uffff";
    static final String dfa_4s = "\1\54\1\uffff\1\43\1\55\1\46\1\104\1\4\2\41\1\44\1\41\1\0\1\uffff";
    static final String dfa_5s = "\1\uffff\1\2\12\uffff\1\1";
    static final String dfa_6s = "\13\uffff\1\0\1\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\4\uffff\3\1\1\2",
            "",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\7\1\10\76\uffff\1\6",
            "\1\7",
            "\1\11",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\uffff",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 5716:7: ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )=> rule__GSSIfaceSpWPort__ReadingPortAssignment_2_3 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_11 = input.LA(1);

                         
                        int index21_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalIFACE()) ) {s = 12;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index21_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\1\44\11\uffff";
    static final String dfa_10s = "\1\66\11\uffff";
    static final String dfa_11s = "\1\uffff\10\1\1\2";
    static final String dfa_12s = "\1\0\11\uffff}>";
    static final String[] dfa_13s = {
            "\1\11\12\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "5933:2: ( rule__GSSIfaceUartPort__UnorderedGroup_2__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_0 = input.LA(1);

                         
                        int index27_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA27_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 0) ) {s = 1;}

                        else if ( LA27_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 1) ) {s = 2;}

                        else if ( LA27_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 2) ) {s = 3;}

                        else if ( LA27_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 3) ) {s = 4;}

                        else if ( LA27_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 4) ) {s = 5;}

                        else if ( LA27_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 5) ) {s = 6;}

                        else if ( LA27_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 6) ) {s = 7;}

                        else if ( LA27_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 7) ) {s = 8;}

                        else if ( (LA27_0==36) ) {s = 9;}

                         
                        input.seek(index27_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\1\11\11\uffff";
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_8;
            this.eof = dfa_14;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "5945:2: ( rule__GSSIfaceUartPort__UnorderedGroup_2__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_0 = input.LA(1);

                         
                        int index28_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA28_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 0) ) {s = 1;}

                        else if ( LA28_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 1) ) {s = 2;}

                        else if ( LA28_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 2) ) {s = 3;}

                        else if ( LA28_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 3) ) {s = 4;}

                        else if ( LA28_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 4) ) {s = 5;}

                        else if ( LA28_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 5) ) {s = 6;}

                        else if ( LA28_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 6) ) {s = 7;}

                        else if ( LA28_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 7) ) {s = 8;}

                        else if ( (LA28_0==EOF||LA28_0==36) ) {s = 9;}

                         
                        input.seek(index28_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_8;
            this.eof = dfa_14;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "5957:2: ( rule__GSSIfaceUartPort__UnorderedGroup_2__3 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_0 = input.LA(1);

                         
                        int index29_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA29_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 0) ) {s = 1;}

                        else if ( LA29_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 1) ) {s = 2;}

                        else if ( LA29_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 2) ) {s = 3;}

                        else if ( LA29_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 3) ) {s = 4;}

                        else if ( LA29_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 4) ) {s = 5;}

                        else if ( LA29_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 5) ) {s = 6;}

                        else if ( LA29_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 6) ) {s = 7;}

                        else if ( LA29_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 7) ) {s = 8;}

                        else if ( (LA29_0==EOF||LA29_0==36) ) {s = 9;}

                         
                        input.seek(index29_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_8;
            this.eof = dfa_14;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "5969:2: ( rule__GSSIfaceUartPort__UnorderedGroup_2__4 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_0 = input.LA(1);

                         
                        int index30_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA30_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 0) ) {s = 1;}

                        else if ( LA30_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 1) ) {s = 2;}

                        else if ( LA30_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 2) ) {s = 3;}

                        else if ( LA30_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 3) ) {s = 4;}

                        else if ( LA30_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 4) ) {s = 5;}

                        else if ( LA30_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 5) ) {s = 6;}

                        else if ( LA30_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 6) ) {s = 7;}

                        else if ( LA30_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 7) ) {s = 8;}

                        else if ( (LA30_0==EOF||LA30_0==36) ) {s = 9;}

                         
                        input.seek(index30_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_8;
            this.eof = dfa_14;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "5981:2: ( rule__GSSIfaceUartPort__UnorderedGroup_2__5 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_0 = input.LA(1);

                         
                        int index31_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA31_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 0) ) {s = 1;}

                        else if ( LA31_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 1) ) {s = 2;}

                        else if ( LA31_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 2) ) {s = 3;}

                        else if ( LA31_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 3) ) {s = 4;}

                        else if ( LA31_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 4) ) {s = 5;}

                        else if ( LA31_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 5) ) {s = 6;}

                        else if ( LA31_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 6) ) {s = 7;}

                        else if ( LA31_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 7) ) {s = 8;}

                        else if ( (LA31_0==EOF||LA31_0==36) ) {s = 9;}

                         
                        input.seek(index31_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_8;
            this.eof = dfa_14;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "5993:2: ( rule__GSSIfaceUartPort__UnorderedGroup_2__6 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_0 = input.LA(1);

                         
                        int index32_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA32_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 0) ) {s = 1;}

                        else if ( LA32_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 1) ) {s = 2;}

                        else if ( LA32_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 2) ) {s = 3;}

                        else if ( LA32_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 3) ) {s = 4;}

                        else if ( LA32_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 4) ) {s = 5;}

                        else if ( LA32_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 5) ) {s = 6;}

                        else if ( LA32_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 6) ) {s = 7;}

                        else if ( LA32_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 7) ) {s = 8;}

                        else if ( (LA32_0==EOF||LA32_0==36) ) {s = 9;}

                         
                        input.seek(index32_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_8;
            this.eof = dfa_14;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "6005:2: ( rule__GSSIfaceUartPort__UnorderedGroup_2__7 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_0 = input.LA(1);

                         
                        int index33_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA33_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 0) ) {s = 1;}

                        else if ( LA33_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 1) ) {s = 2;}

                        else if ( LA33_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 2) ) {s = 3;}

                        else if ( LA33_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 3) ) {s = 4;}

                        else if ( LA33_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 4) ) {s = 5;}

                        else if ( LA33_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 5) ) {s = 6;}

                        else if ( LA33_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 6) ) {s = 7;}

                        else if ( LA33_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 7) ) {s = 8;}

                        else if ( (LA33_0==EOF||LA33_0==36) ) {s = 9;}

                         
                        input.seek(index33_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x400041A000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00001E0000000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000007000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000010L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x007F800000000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000003E0000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000003C00000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x1F80000000000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000C8000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x400041A000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00001E0000000002L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x007F800000000002L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x1F80000000000002L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000030000002L});
    }


}