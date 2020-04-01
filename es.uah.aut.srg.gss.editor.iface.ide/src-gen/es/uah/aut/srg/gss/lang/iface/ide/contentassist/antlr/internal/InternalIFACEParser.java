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
    // InternalIFACE.g:1162:1: rule__GSSIfacePortConfig__Group__4__Impl : ( ( rule__GSSIfacePortConfig__PortConfigAssignment_4 ) ) ;
    public final void rule__GSSIfacePortConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1166:1: ( ( ( rule__GSSIfacePortConfig__PortConfigAssignment_4 ) ) )
            // InternalIFACE.g:1167:1: ( ( rule__GSSIfacePortConfig__PortConfigAssignment_4 ) )
            {
            // InternalIFACE.g:1167:1: ( ( rule__GSSIfacePortConfig__PortConfigAssignment_4 ) )
            // InternalIFACE.g:1168:2: ( rule__GSSIfacePortConfig__PortConfigAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getPortConfigAssignment_4()); 
            }
            // InternalIFACE.g:1169:2: ( rule__GSSIfacePortConfig__PortConfigAssignment_4 )
            // InternalIFACE.g:1169:3: rule__GSSIfacePortConfig__PortConfigAssignment_4
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
    // InternalIFACE.g:1177:1: rule__GSSIfacePortConfig__Group__5 : rule__GSSIfacePortConfig__Group__5__Impl rule__GSSIfacePortConfig__Group__6 ;
    public final void rule__GSSIfacePortConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1181:1: ( rule__GSSIfacePortConfig__Group__5__Impl rule__GSSIfacePortConfig__Group__6 )
            // InternalIFACE.g:1182:2: rule__GSSIfacePortConfig__Group__5__Impl rule__GSSIfacePortConfig__Group__6
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
    // InternalIFACE.g:1189:1: rule__GSSIfacePortConfig__Group__5__Impl : ( '}' ) ;
    public final void rule__GSSIfacePortConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1193:1: ( ( '}' ) )
            // InternalIFACE.g:1194:1: ( '}' )
            {
            // InternalIFACE.g:1194:1: ( '}' )
            // InternalIFACE.g:1195:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1204:1: rule__GSSIfacePortConfig__Group__6 : rule__GSSIfacePortConfig__Group__6__Impl ;
    public final void rule__GSSIfacePortConfig__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1208:1: ( rule__GSSIfacePortConfig__Group__6__Impl )
            // InternalIFACE.g:1209:2: rule__GSSIfacePortConfig__Group__6__Impl
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
    // InternalIFACE.g:1215:1: rule__GSSIfacePortConfig__Group__6__Impl : ( ';' ) ;
    public final void rule__GSSIfacePortConfig__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1219:1: ( ( ';' ) )
            // InternalIFACE.g:1220:1: ( ';' )
            {
            // InternalIFACE.g:1220:1: ( ';' )
            // InternalIFACE.g:1221:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getSemicolonKeyword_6()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1231:1: rule__GSSIfacePortConfig__Group_3_0__0 : rule__GSSIfacePortConfig__Group_3_0__0__Impl rule__GSSIfacePortConfig__Group_3_0__1 ;
    public final void rule__GSSIfacePortConfig__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1235:1: ( rule__GSSIfacePortConfig__Group_3_0__0__Impl rule__GSSIfacePortConfig__Group_3_0__1 )
            // InternalIFACE.g:1236:2: rule__GSSIfacePortConfig__Group_3_0__0__Impl rule__GSSIfacePortConfig__Group_3_0__1
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
    // InternalIFACE.g:1243:1: rule__GSSIfacePortConfig__Group_3_0__0__Impl : ( 'uri' ) ;
    public final void rule__GSSIfacePortConfig__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1247:1: ( ( 'uri' ) )
            // InternalIFACE.g:1248:1: ( 'uri' )
            {
            // InternalIFACE.g:1248:1: ( 'uri' )
            // InternalIFACE.g:1249:2: 'uri'
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
    // InternalIFACE.g:1258:1: rule__GSSIfacePortConfig__Group_3_0__1 : rule__GSSIfacePortConfig__Group_3_0__1__Impl rule__GSSIfacePortConfig__Group_3_0__2 ;
    public final void rule__GSSIfacePortConfig__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1262:1: ( rule__GSSIfacePortConfig__Group_3_0__1__Impl rule__GSSIfacePortConfig__Group_3_0__2 )
            // InternalIFACE.g:1263:2: rule__GSSIfacePortConfig__Group_3_0__1__Impl rule__GSSIfacePortConfig__Group_3_0__2
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
    // InternalIFACE.g:1270:1: rule__GSSIfacePortConfig__Group_3_0__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfacePortConfig__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1274:1: ( ( ':=' ) )
            // InternalIFACE.g:1275:1: ( ':=' )
            {
            // InternalIFACE.g:1275:1: ( ':=' )
            // InternalIFACE.g:1276:2: ':='
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
    // InternalIFACE.g:1285:1: rule__GSSIfacePortConfig__Group_3_0__2 : rule__GSSIfacePortConfig__Group_3_0__2__Impl rule__GSSIfacePortConfig__Group_3_0__3 ;
    public final void rule__GSSIfacePortConfig__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1289:1: ( rule__GSSIfacePortConfig__Group_3_0__2__Impl rule__GSSIfacePortConfig__Group_3_0__3 )
            // InternalIFACE.g:1290:2: rule__GSSIfacePortConfig__Group_3_0__2__Impl rule__GSSIfacePortConfig__Group_3_0__3
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
    // InternalIFACE.g:1297:1: rule__GSSIfacePortConfig__Group_3_0__2__Impl : ( ( rule__GSSIfacePortConfig__UriAssignment_3_0_2 ) ) ;
    public final void rule__GSSIfacePortConfig__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1301:1: ( ( ( rule__GSSIfacePortConfig__UriAssignment_3_0_2 ) ) )
            // InternalIFACE.g:1302:1: ( ( rule__GSSIfacePortConfig__UriAssignment_3_0_2 ) )
            {
            // InternalIFACE.g:1302:1: ( ( rule__GSSIfacePortConfig__UriAssignment_3_0_2 ) )
            // InternalIFACE.g:1303:2: ( rule__GSSIfacePortConfig__UriAssignment_3_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getUriAssignment_3_0_2()); 
            }
            // InternalIFACE.g:1304:2: ( rule__GSSIfacePortConfig__UriAssignment_3_0_2 )
            // InternalIFACE.g:1304:3: rule__GSSIfacePortConfig__UriAssignment_3_0_2
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
    // InternalIFACE.g:1312:1: rule__GSSIfacePortConfig__Group_3_0__3 : rule__GSSIfacePortConfig__Group_3_0__3__Impl ;
    public final void rule__GSSIfacePortConfig__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1316:1: ( rule__GSSIfacePortConfig__Group_3_0__3__Impl )
            // InternalIFACE.g:1317:2: rule__GSSIfacePortConfig__Group_3_0__3__Impl
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
    // InternalIFACE.g:1323:1: rule__GSSIfacePortConfig__Group_3_0__3__Impl : ( ';' ) ;
    public final void rule__GSSIfacePortConfig__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1327:1: ( ( ';' ) )
            // InternalIFACE.g:1328:1: ( ';' )
            {
            // InternalIFACE.g:1328:1: ( ';' )
            // InternalIFACE.g:1329:2: ';'
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
    // InternalIFACE.g:1339:1: rule__GSSIfacePortConfig__Group_3_1__0 : rule__GSSIfacePortConfig__Group_3_1__0__Impl rule__GSSIfacePortConfig__Group_3_1__1 ;
    public final void rule__GSSIfacePortConfig__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1343:1: ( rule__GSSIfacePortConfig__Group_3_1__0__Impl rule__GSSIfacePortConfig__Group_3_1__1 )
            // InternalIFACE.g:1344:2: rule__GSSIfacePortConfig__Group_3_1__0__Impl rule__GSSIfacePortConfig__Group_3_1__1
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
    // InternalIFACE.g:1351:1: rule__GSSIfacePortConfig__Group_3_1__0__Impl : ( 'version' ) ;
    public final void rule__GSSIfacePortConfig__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1355:1: ( ( 'version' ) )
            // InternalIFACE.g:1356:1: ( 'version' )
            {
            // InternalIFACE.g:1356:1: ( 'version' )
            // InternalIFACE.g:1357:2: 'version'
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
    // InternalIFACE.g:1366:1: rule__GSSIfacePortConfig__Group_3_1__1 : rule__GSSIfacePortConfig__Group_3_1__1__Impl rule__GSSIfacePortConfig__Group_3_1__2 ;
    public final void rule__GSSIfacePortConfig__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1370:1: ( rule__GSSIfacePortConfig__Group_3_1__1__Impl rule__GSSIfacePortConfig__Group_3_1__2 )
            // InternalIFACE.g:1371:2: rule__GSSIfacePortConfig__Group_3_1__1__Impl rule__GSSIfacePortConfig__Group_3_1__2
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
    // InternalIFACE.g:1378:1: rule__GSSIfacePortConfig__Group_3_1__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfacePortConfig__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1382:1: ( ( ':=' ) )
            // InternalIFACE.g:1383:1: ( ':=' )
            {
            // InternalIFACE.g:1383:1: ( ':=' )
            // InternalIFACE.g:1384:2: ':='
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
    // InternalIFACE.g:1393:1: rule__GSSIfacePortConfig__Group_3_1__2 : rule__GSSIfacePortConfig__Group_3_1__2__Impl rule__GSSIfacePortConfig__Group_3_1__3 ;
    public final void rule__GSSIfacePortConfig__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1397:1: ( rule__GSSIfacePortConfig__Group_3_1__2__Impl rule__GSSIfacePortConfig__Group_3_1__3 )
            // InternalIFACE.g:1398:2: rule__GSSIfacePortConfig__Group_3_1__2__Impl rule__GSSIfacePortConfig__Group_3_1__3
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
    // InternalIFACE.g:1405:1: rule__GSSIfacePortConfig__Group_3_1__2__Impl : ( ( rule__GSSIfacePortConfig__VersionAssignment_3_1_2 ) ) ;
    public final void rule__GSSIfacePortConfig__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1409:1: ( ( ( rule__GSSIfacePortConfig__VersionAssignment_3_1_2 ) ) )
            // InternalIFACE.g:1410:1: ( ( rule__GSSIfacePortConfig__VersionAssignment_3_1_2 ) )
            {
            // InternalIFACE.g:1410:1: ( ( rule__GSSIfacePortConfig__VersionAssignment_3_1_2 ) )
            // InternalIFACE.g:1411:2: ( rule__GSSIfacePortConfig__VersionAssignment_3_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getVersionAssignment_3_1_2()); 
            }
            // InternalIFACE.g:1412:2: ( rule__GSSIfacePortConfig__VersionAssignment_3_1_2 )
            // InternalIFACE.g:1412:3: rule__GSSIfacePortConfig__VersionAssignment_3_1_2
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
    // InternalIFACE.g:1420:1: rule__GSSIfacePortConfig__Group_3_1__3 : rule__GSSIfacePortConfig__Group_3_1__3__Impl ;
    public final void rule__GSSIfacePortConfig__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1424:1: ( rule__GSSIfacePortConfig__Group_3_1__3__Impl )
            // InternalIFACE.g:1425:2: rule__GSSIfacePortConfig__Group_3_1__3__Impl
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
    // InternalIFACE.g:1431:1: rule__GSSIfacePortConfig__Group_3_1__3__Impl : ( ';' ) ;
    public final void rule__GSSIfacePortConfig__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1435:1: ( ( ';' ) )
            // InternalIFACE.g:1436:1: ( ';' )
            {
            // InternalIFACE.g:1436:1: ( ';' )
            // InternalIFACE.g:1437:2: ';'
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
    // InternalIFACE.g:1447:1: rule__GSSIfaceSpWPort__Group__0 : rule__GSSIfaceSpWPort__Group__0__Impl rule__GSSIfaceSpWPort__Group__1 ;
    public final void rule__GSSIfaceSpWPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1451:1: ( rule__GSSIfaceSpWPort__Group__0__Impl rule__GSSIfaceSpWPort__Group__1 )
            // InternalIFACE.g:1452:2: rule__GSSIfaceSpWPort__Group__0__Impl rule__GSSIfaceSpWPort__Group__1
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
    // InternalIFACE.g:1459:1: rule__GSSIfaceSpWPort__Group__0__Impl : ( 'spwPort' ) ;
    public final void rule__GSSIfaceSpWPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1463:1: ( ( 'spwPort' ) )
            // InternalIFACE.g:1464:1: ( 'spwPort' )
            {
            // InternalIFACE.g:1464:1: ( 'spwPort' )
            // InternalIFACE.g:1465:2: 'spwPort'
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
    // InternalIFACE.g:1474:1: rule__GSSIfaceSpWPort__Group__1 : rule__GSSIfaceSpWPort__Group__1__Impl rule__GSSIfaceSpWPort__Group__2 ;
    public final void rule__GSSIfaceSpWPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1478:1: ( rule__GSSIfaceSpWPort__Group__1__Impl rule__GSSIfaceSpWPort__Group__2 )
            // InternalIFACE.g:1479:2: rule__GSSIfaceSpWPort__Group__1__Impl rule__GSSIfaceSpWPort__Group__2
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
    // InternalIFACE.g:1486:1: rule__GSSIfaceSpWPort__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceSpWPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1490:1: ( ( '{' ) )
            // InternalIFACE.g:1491:1: ( '{' )
            {
            // InternalIFACE.g:1491:1: ( '{' )
            // InternalIFACE.g:1492:2: '{'
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
    // InternalIFACE.g:1501:1: rule__GSSIfaceSpWPort__Group__2 : rule__GSSIfaceSpWPort__Group__2__Impl rule__GSSIfaceSpWPort__Group__3 ;
    public final void rule__GSSIfaceSpWPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1505:1: ( rule__GSSIfaceSpWPort__Group__2__Impl rule__GSSIfaceSpWPort__Group__3 )
            // InternalIFACE.g:1506:2: rule__GSSIfaceSpWPort__Group__2__Impl rule__GSSIfaceSpWPort__Group__3
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
    // InternalIFACE.g:1513:1: rule__GSSIfaceSpWPort__Group__2__Impl : ( 'type' ) ;
    public final void rule__GSSIfaceSpWPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1517:1: ( ( 'type' ) )
            // InternalIFACE.g:1518:1: ( 'type' )
            {
            // InternalIFACE.g:1518:1: ( 'type' )
            // InternalIFACE.g:1519:2: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getTypeKeyword_2()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1528:1: rule__GSSIfaceSpWPort__Group__3 : rule__GSSIfaceSpWPort__Group__3__Impl rule__GSSIfaceSpWPort__Group__4 ;
    public final void rule__GSSIfaceSpWPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1532:1: ( rule__GSSIfaceSpWPort__Group__3__Impl rule__GSSIfaceSpWPort__Group__4 )
            // InternalIFACE.g:1533:2: rule__GSSIfaceSpWPort__Group__3__Impl rule__GSSIfaceSpWPort__Group__4
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
    // InternalIFACE.g:1540:1: rule__GSSIfaceSpWPort__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSpWPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1544:1: ( ( ':=' ) )
            // InternalIFACE.g:1545:1: ( ':=' )
            {
            // InternalIFACE.g:1545:1: ( ':=' )
            // InternalIFACE.g:1546:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1555:1: rule__GSSIfaceSpWPort__Group__4 : rule__GSSIfaceSpWPort__Group__4__Impl rule__GSSIfaceSpWPort__Group__5 ;
    public final void rule__GSSIfaceSpWPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1559:1: ( rule__GSSIfaceSpWPort__Group__4__Impl rule__GSSIfaceSpWPort__Group__5 )
            // InternalIFACE.g:1560:2: rule__GSSIfaceSpWPort__Group__4__Impl rule__GSSIfaceSpWPort__Group__5
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
    // InternalIFACE.g:1567:1: rule__GSSIfaceSpWPort__Group__4__Impl : ( ( rule__GSSIfaceSpWPort__TypeAssignment_4 ) ) ;
    public final void rule__GSSIfaceSpWPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1571:1: ( ( ( rule__GSSIfaceSpWPort__TypeAssignment_4 ) ) )
            // InternalIFACE.g:1572:1: ( ( rule__GSSIfaceSpWPort__TypeAssignment_4 ) )
            {
            // InternalIFACE.g:1572:1: ( ( rule__GSSIfaceSpWPort__TypeAssignment_4 ) )
            // InternalIFACE.g:1573:2: ( rule__GSSIfaceSpWPort__TypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getTypeAssignment_4()); 
            }
            // InternalIFACE.g:1574:2: ( rule__GSSIfaceSpWPort__TypeAssignment_4 )
            // InternalIFACE.g:1574:3: rule__GSSIfaceSpWPort__TypeAssignment_4
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
    // InternalIFACE.g:1582:1: rule__GSSIfaceSpWPort__Group__5 : rule__GSSIfaceSpWPort__Group__5__Impl rule__GSSIfaceSpWPort__Group__6 ;
    public final void rule__GSSIfaceSpWPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1586:1: ( rule__GSSIfaceSpWPort__Group__5__Impl rule__GSSIfaceSpWPort__Group__6 )
            // InternalIFACE.g:1587:2: rule__GSSIfaceSpWPort__Group__5__Impl rule__GSSIfaceSpWPort__Group__6
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
    // InternalIFACE.g:1594:1: rule__GSSIfaceSpWPort__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSpWPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1598:1: ( ( ';' ) )
            // InternalIFACE.g:1599:1: ( ';' )
            {
            // InternalIFACE.g:1599:1: ( ';' )
            // InternalIFACE.g:1600:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_5()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1609:1: rule__GSSIfaceSpWPort__Group__6 : rule__GSSIfaceSpWPort__Group__6__Impl rule__GSSIfaceSpWPort__Group__7 ;
    public final void rule__GSSIfaceSpWPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1613:1: ( rule__GSSIfaceSpWPort__Group__6__Impl rule__GSSIfaceSpWPort__Group__7 )
            // InternalIFACE.g:1614:2: rule__GSSIfaceSpWPort__Group__6__Impl rule__GSSIfaceSpWPort__Group__7
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
    // InternalIFACE.g:1621:1: rule__GSSIfaceSpWPort__Group__6__Impl : ( 'link' ) ;
    public final void rule__GSSIfaceSpWPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1625:1: ( ( 'link' ) )
            // InternalIFACE.g:1626:1: ( 'link' )
            {
            // InternalIFACE.g:1626:1: ( 'link' )
            // InternalIFACE.g:1627:2: 'link'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getLinkKeyword_6()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1636:1: rule__GSSIfaceSpWPort__Group__7 : rule__GSSIfaceSpWPort__Group__7__Impl rule__GSSIfaceSpWPort__Group__8 ;
    public final void rule__GSSIfaceSpWPort__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1640:1: ( rule__GSSIfaceSpWPort__Group__7__Impl rule__GSSIfaceSpWPort__Group__8 )
            // InternalIFACE.g:1641:2: rule__GSSIfaceSpWPort__Group__7__Impl rule__GSSIfaceSpWPort__Group__8
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
    // InternalIFACE.g:1648:1: rule__GSSIfaceSpWPort__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSpWPort__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1652:1: ( ( ':=' ) )
            // InternalIFACE.g:1653:1: ( ':=' )
            {
            // InternalIFACE.g:1653:1: ( ':=' )
            // InternalIFACE.g:1654:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1663:1: rule__GSSIfaceSpWPort__Group__8 : rule__GSSIfaceSpWPort__Group__8__Impl rule__GSSIfaceSpWPort__Group__9 ;
    public final void rule__GSSIfaceSpWPort__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1667:1: ( rule__GSSIfaceSpWPort__Group__8__Impl rule__GSSIfaceSpWPort__Group__9 )
            // InternalIFACE.g:1668:2: rule__GSSIfaceSpWPort__Group__8__Impl rule__GSSIfaceSpWPort__Group__9
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
    // InternalIFACE.g:1675:1: rule__GSSIfaceSpWPort__Group__8__Impl : ( ( rule__GSSIfaceSpWPort__LinkAssignment_8 ) ) ;
    public final void rule__GSSIfaceSpWPort__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1679:1: ( ( ( rule__GSSIfaceSpWPort__LinkAssignment_8 ) ) )
            // InternalIFACE.g:1680:1: ( ( rule__GSSIfaceSpWPort__LinkAssignment_8 ) )
            {
            // InternalIFACE.g:1680:1: ( ( rule__GSSIfaceSpWPort__LinkAssignment_8 ) )
            // InternalIFACE.g:1681:2: ( rule__GSSIfaceSpWPort__LinkAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getLinkAssignment_8()); 
            }
            // InternalIFACE.g:1682:2: ( rule__GSSIfaceSpWPort__LinkAssignment_8 )
            // InternalIFACE.g:1682:3: rule__GSSIfaceSpWPort__LinkAssignment_8
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
    // InternalIFACE.g:1690:1: rule__GSSIfaceSpWPort__Group__9 : rule__GSSIfaceSpWPort__Group__9__Impl rule__GSSIfaceSpWPort__Group__10 ;
    public final void rule__GSSIfaceSpWPort__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1694:1: ( rule__GSSIfaceSpWPort__Group__9__Impl rule__GSSIfaceSpWPort__Group__10 )
            // InternalIFACE.g:1695:2: rule__GSSIfaceSpWPort__Group__9__Impl rule__GSSIfaceSpWPort__Group__10
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
    // InternalIFACE.g:1702:1: rule__GSSIfaceSpWPort__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSpWPort__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1706:1: ( ( ';' ) )
            // InternalIFACE.g:1707:1: ( ';' )
            {
            // InternalIFACE.g:1707:1: ( ';' )
            // InternalIFACE.g:1708:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_9()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1717:1: rule__GSSIfaceSpWPort__Group__10 : rule__GSSIfaceSpWPort__Group__10__Impl rule__GSSIfaceSpWPort__Group__11 ;
    public final void rule__GSSIfaceSpWPort__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1721:1: ( rule__GSSIfaceSpWPort__Group__10__Impl rule__GSSIfaceSpWPort__Group__11 )
            // InternalIFACE.g:1722:2: rule__GSSIfaceSpWPort__Group__10__Impl rule__GSSIfaceSpWPort__Group__11
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
    // InternalIFACE.g:1729:1: rule__GSSIfaceSpWPort__Group__10__Impl : ( 'writingPort' ) ;
    public final void rule__GSSIfaceSpWPort__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1733:1: ( ( 'writingPort' ) )
            // InternalIFACE.g:1734:1: ( 'writingPort' )
            {
            // InternalIFACE.g:1734:1: ( 'writingPort' )
            // InternalIFACE.g:1735:2: 'writingPort'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortKeyword_10()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1744:1: rule__GSSIfaceSpWPort__Group__11 : rule__GSSIfaceSpWPort__Group__11__Impl rule__GSSIfaceSpWPort__Group__12 ;
    public final void rule__GSSIfaceSpWPort__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1748:1: ( rule__GSSIfaceSpWPort__Group__11__Impl rule__GSSIfaceSpWPort__Group__12 )
            // InternalIFACE.g:1749:2: rule__GSSIfaceSpWPort__Group__11__Impl rule__GSSIfaceSpWPort__Group__12
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
    // InternalIFACE.g:1756:1: rule__GSSIfaceSpWPort__Group__11__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSpWPort__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1760:1: ( ( ':=' ) )
            // InternalIFACE.g:1761:1: ( ':=' )
            {
            // InternalIFACE.g:1761:1: ( ':=' )
            // InternalIFACE.g:1762:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_11()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1771:1: rule__GSSIfaceSpWPort__Group__12 : rule__GSSIfaceSpWPort__Group__12__Impl rule__GSSIfaceSpWPort__Group__13 ;
    public final void rule__GSSIfaceSpWPort__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1775:1: ( rule__GSSIfaceSpWPort__Group__12__Impl rule__GSSIfaceSpWPort__Group__13 )
            // InternalIFACE.g:1776:2: rule__GSSIfaceSpWPort__Group__12__Impl rule__GSSIfaceSpWPort__Group__13
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
    // InternalIFACE.g:1783:1: rule__GSSIfaceSpWPort__Group__12__Impl : ( ( rule__GSSIfaceSpWPort__WritingPortAssignment_12 ) ) ;
    public final void rule__GSSIfaceSpWPort__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1787:1: ( ( ( rule__GSSIfaceSpWPort__WritingPortAssignment_12 ) ) )
            // InternalIFACE.g:1788:1: ( ( rule__GSSIfaceSpWPort__WritingPortAssignment_12 ) )
            {
            // InternalIFACE.g:1788:1: ( ( rule__GSSIfaceSpWPort__WritingPortAssignment_12 ) )
            // InternalIFACE.g:1789:2: ( rule__GSSIfaceSpWPort__WritingPortAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortAssignment_12()); 
            }
            // InternalIFACE.g:1790:2: ( rule__GSSIfaceSpWPort__WritingPortAssignment_12 )
            // InternalIFACE.g:1790:3: rule__GSSIfaceSpWPort__WritingPortAssignment_12
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
    // InternalIFACE.g:1798:1: rule__GSSIfaceSpWPort__Group__13 : rule__GSSIfaceSpWPort__Group__13__Impl rule__GSSIfaceSpWPort__Group__14 ;
    public final void rule__GSSIfaceSpWPort__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1802:1: ( rule__GSSIfaceSpWPort__Group__13__Impl rule__GSSIfaceSpWPort__Group__14 )
            // InternalIFACE.g:1803:2: rule__GSSIfaceSpWPort__Group__13__Impl rule__GSSIfaceSpWPort__Group__14
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
    // InternalIFACE.g:1810:1: rule__GSSIfaceSpWPort__Group__13__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSpWPort__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1814:1: ( ( ';' ) )
            // InternalIFACE.g:1815:1: ( ';' )
            {
            // InternalIFACE.g:1815:1: ( ';' )
            // InternalIFACE.g:1816:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_13()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1825:1: rule__GSSIfaceSpWPort__Group__14 : rule__GSSIfaceSpWPort__Group__14__Impl rule__GSSIfaceSpWPort__Group__15 ;
    public final void rule__GSSIfaceSpWPort__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1829:1: ( rule__GSSIfaceSpWPort__Group__14__Impl rule__GSSIfaceSpWPort__Group__15 )
            // InternalIFACE.g:1830:2: rule__GSSIfaceSpWPort__Group__14__Impl rule__GSSIfaceSpWPort__Group__15
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
    // InternalIFACE.g:1837:1: rule__GSSIfaceSpWPort__Group__14__Impl : ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 ) ) ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )* ) ) ;
    public final void rule__GSSIfaceSpWPort__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1841:1: ( ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 ) ) ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )* ) ) )
            // InternalIFACE.g:1842:1: ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 ) ) ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )* ) )
            {
            // InternalIFACE.g:1842:1: ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 ) ) ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )* ) )
            // InternalIFACE.g:1843:2: ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 ) ) ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )* )
            {
            // InternalIFACE.g:1843:2: ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 ) )
            // InternalIFACE.g:1844:3: ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortAssignment_14()); 
            }
            // InternalIFACE.g:1845:3: ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )
            // InternalIFACE.g:1845:4: rule__GSSIfaceSpWPort__ReadingPortAssignment_14
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

            // InternalIFACE.g:1848:2: ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )* )
            // InternalIFACE.g:1849:3: ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortAssignment_14()); 
            }
            // InternalIFACE.g:1850:3: ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==44) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalIFACE.g:1850:4: rule__GSSIfaceSpWPort__ReadingPortAssignment_14
            	    {
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    rule__GSSIfaceSpWPort__ReadingPortAssignment_14();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalIFACE.g:1859:1: rule__GSSIfaceSpWPort__Group__15 : rule__GSSIfaceSpWPort__Group__15__Impl rule__GSSIfaceSpWPort__Group__16 ;
    public final void rule__GSSIfaceSpWPort__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1863:1: ( rule__GSSIfaceSpWPort__Group__15__Impl rule__GSSIfaceSpWPort__Group__16 )
            // InternalIFACE.g:1864:2: rule__GSSIfaceSpWPort__Group__15__Impl rule__GSSIfaceSpWPort__Group__16
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
    // InternalIFACE.g:1871:1: rule__GSSIfaceSpWPort__Group__15__Impl : ( '}' ) ;
    public final void rule__GSSIfaceSpWPort__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1875:1: ( ( '}' ) )
            // InternalIFACE.g:1876:1: ( '}' )
            {
            // InternalIFACE.g:1876:1: ( '}' )
            // InternalIFACE.g:1877:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getRightCurlyBracketKeyword_15()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1886:1: rule__GSSIfaceSpWPort__Group__16 : rule__GSSIfaceSpWPort__Group__16__Impl ;
    public final void rule__GSSIfaceSpWPort__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1890:1: ( rule__GSSIfaceSpWPort__Group__16__Impl )
            // InternalIFACE.g:1891:2: rule__GSSIfaceSpWPort__Group__16__Impl
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
    // InternalIFACE.g:1897:1: rule__GSSIfaceSpWPort__Group__16__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSpWPort__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1901:1: ( ( ';' ) )
            // InternalIFACE.g:1902:1: ( ';' )
            {
            // InternalIFACE.g:1902:1: ( ';' )
            // InternalIFACE.g:1903:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_16()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1913:1: rule__GSSIfaceReadingPort__Group__0 : rule__GSSIfaceReadingPort__Group__0__Impl rule__GSSIfaceReadingPort__Group__1 ;
    public final void rule__GSSIfaceReadingPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1917:1: ( rule__GSSIfaceReadingPort__Group__0__Impl rule__GSSIfaceReadingPort__Group__1 )
            // InternalIFACE.g:1918:2: rule__GSSIfaceReadingPort__Group__0__Impl rule__GSSIfaceReadingPort__Group__1
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
    // InternalIFACE.g:1925:1: rule__GSSIfaceReadingPort__Group__0__Impl : ( 'readingPort' ) ;
    public final void rule__GSSIfaceReadingPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1929:1: ( ( 'readingPort' ) )
            // InternalIFACE.g:1930:1: ( 'readingPort' )
            {
            // InternalIFACE.g:1930:1: ( 'readingPort' )
            // InternalIFACE.g:1931:2: 'readingPort'
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
    // InternalIFACE.g:1940:1: rule__GSSIfaceReadingPort__Group__1 : rule__GSSIfaceReadingPort__Group__1__Impl rule__GSSIfaceReadingPort__Group__2 ;
    public final void rule__GSSIfaceReadingPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1944:1: ( rule__GSSIfaceReadingPort__Group__1__Impl rule__GSSIfaceReadingPort__Group__2 )
            // InternalIFACE.g:1945:2: rule__GSSIfaceReadingPort__Group__1__Impl rule__GSSIfaceReadingPort__Group__2
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
    // InternalIFACE.g:1952:1: rule__GSSIfaceReadingPort__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceReadingPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1956:1: ( ( '{' ) )
            // InternalIFACE.g:1957:1: ( '{' )
            {
            // InternalIFACE.g:1957:1: ( '{' )
            // InternalIFACE.g:1958:2: '{'
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
    // InternalIFACE.g:1967:1: rule__GSSIfaceReadingPort__Group__2 : rule__GSSIfaceReadingPort__Group__2__Impl rule__GSSIfaceReadingPort__Group__3 ;
    public final void rule__GSSIfaceReadingPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1971:1: ( rule__GSSIfaceReadingPort__Group__2__Impl rule__GSSIfaceReadingPort__Group__3 )
            // InternalIFACE.g:1972:2: rule__GSSIfaceReadingPort__Group__2__Impl rule__GSSIfaceReadingPort__Group__3
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
    // InternalIFACE.g:1979:1: rule__GSSIfaceReadingPort__Group__2__Impl : ( 'port' ) ;
    public final void rule__GSSIfaceReadingPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1983:1: ( ( 'port' ) )
            // InternalIFACE.g:1984:1: ( 'port' )
            {
            // InternalIFACE.g:1984:1: ( 'port' )
            // InternalIFACE.g:1985:2: 'port'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getPortKeyword_2()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:1994:1: rule__GSSIfaceReadingPort__Group__3 : rule__GSSIfaceReadingPort__Group__3__Impl rule__GSSIfaceReadingPort__Group__4 ;
    public final void rule__GSSIfaceReadingPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1998:1: ( rule__GSSIfaceReadingPort__Group__3__Impl rule__GSSIfaceReadingPort__Group__4 )
            // InternalIFACE.g:1999:2: rule__GSSIfaceReadingPort__Group__3__Impl rule__GSSIfaceReadingPort__Group__4
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
    // InternalIFACE.g:2006:1: rule__GSSIfaceReadingPort__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceReadingPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2010:1: ( ( ':=' ) )
            // InternalIFACE.g:2011:1: ( ':=' )
            {
            // InternalIFACE.g:2011:1: ( ':=' )
            // InternalIFACE.g:2012:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:2021:1: rule__GSSIfaceReadingPort__Group__4 : rule__GSSIfaceReadingPort__Group__4__Impl rule__GSSIfaceReadingPort__Group__5 ;
    public final void rule__GSSIfaceReadingPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2025:1: ( rule__GSSIfaceReadingPort__Group__4__Impl rule__GSSIfaceReadingPort__Group__5 )
            // InternalIFACE.g:2026:2: rule__GSSIfaceReadingPort__Group__4__Impl rule__GSSIfaceReadingPort__Group__5
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
    // InternalIFACE.g:2033:1: rule__GSSIfaceReadingPort__Group__4__Impl : ( ( rule__GSSIfaceReadingPort__PortAssignment_4 ) ) ;
    public final void rule__GSSIfaceReadingPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2037:1: ( ( ( rule__GSSIfaceReadingPort__PortAssignment_4 ) ) )
            // InternalIFACE.g:2038:1: ( ( rule__GSSIfaceReadingPort__PortAssignment_4 ) )
            {
            // InternalIFACE.g:2038:1: ( ( rule__GSSIfaceReadingPort__PortAssignment_4 ) )
            // InternalIFACE.g:2039:2: ( rule__GSSIfaceReadingPort__PortAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getPortAssignment_4()); 
            }
            // InternalIFACE.g:2040:2: ( rule__GSSIfaceReadingPort__PortAssignment_4 )
            // InternalIFACE.g:2040:3: rule__GSSIfaceReadingPort__PortAssignment_4
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
    // InternalIFACE.g:2048:1: rule__GSSIfaceReadingPort__Group__5 : rule__GSSIfaceReadingPort__Group__5__Impl rule__GSSIfaceReadingPort__Group__6 ;
    public final void rule__GSSIfaceReadingPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2052:1: ( rule__GSSIfaceReadingPort__Group__5__Impl rule__GSSIfaceReadingPort__Group__6 )
            // InternalIFACE.g:2053:2: rule__GSSIfaceReadingPort__Group__5__Impl rule__GSSIfaceReadingPort__Group__6
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
    // InternalIFACE.g:2060:1: rule__GSSIfaceReadingPort__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceReadingPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2064:1: ( ( ';' ) )
            // InternalIFACE.g:2065:1: ( ';' )
            {
            // InternalIFACE.g:2065:1: ( ';' )
            // InternalIFACE.g:2066:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getSemicolonKeyword_5()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:2075:1: rule__GSSIfaceReadingPort__Group__6 : rule__GSSIfaceReadingPort__Group__6__Impl rule__GSSIfaceReadingPort__Group__7 ;
    public final void rule__GSSIfaceReadingPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2079:1: ( rule__GSSIfaceReadingPort__Group__6__Impl rule__GSSIfaceReadingPort__Group__7 )
            // InternalIFACE.g:2080:2: rule__GSSIfaceReadingPort__Group__6__Impl rule__GSSIfaceReadingPort__Group__7
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
    // InternalIFACE.g:2087:1: rule__GSSIfaceReadingPort__Group__6__Impl : ( '}' ) ;
    public final void rule__GSSIfaceReadingPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2091:1: ( ( '}' ) )
            // InternalIFACE.g:2092:1: ( '}' )
            {
            // InternalIFACE.g:2092:1: ( '}' )
            // InternalIFACE.g:2093:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:2102:1: rule__GSSIfaceReadingPort__Group__7 : rule__GSSIfaceReadingPort__Group__7__Impl ;
    public final void rule__GSSIfaceReadingPort__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2106:1: ( rule__GSSIfaceReadingPort__Group__7__Impl )
            // InternalIFACE.g:2107:2: rule__GSSIfaceReadingPort__Group__7__Impl
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
    // InternalIFACE.g:2113:1: rule__GSSIfaceReadingPort__Group__7__Impl : ( ';' ) ;
    public final void rule__GSSIfaceReadingPort__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2117:1: ( ( ';' ) )
            // InternalIFACE.g:2118:1: ( ';' )
            {
            // InternalIFACE.g:2118:1: ( ';' )
            // InternalIFACE.g:2119:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getSemicolonKeyword_7()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:2129:1: rule__GSSIfaceUartPort__Group__0 : rule__GSSIfaceUartPort__Group__0__Impl rule__GSSIfaceUartPort__Group__1 ;
    public final void rule__GSSIfaceUartPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2133:1: ( rule__GSSIfaceUartPort__Group__0__Impl rule__GSSIfaceUartPort__Group__1 )
            // InternalIFACE.g:2134:2: rule__GSSIfaceUartPort__Group__0__Impl rule__GSSIfaceUartPort__Group__1
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
    // InternalIFACE.g:2141:1: rule__GSSIfaceUartPort__Group__0__Impl : ( 'uartPort' ) ;
    public final void rule__GSSIfaceUartPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2145:1: ( ( 'uartPort' ) )
            // InternalIFACE.g:2146:1: ( 'uartPort' )
            {
            // InternalIFACE.g:2146:1: ( 'uartPort' )
            // InternalIFACE.g:2147:2: 'uartPort'
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
    // InternalIFACE.g:2156:1: rule__GSSIfaceUartPort__Group__1 : rule__GSSIfaceUartPort__Group__1__Impl rule__GSSIfaceUartPort__Group__2 ;
    public final void rule__GSSIfaceUartPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2160:1: ( rule__GSSIfaceUartPort__Group__1__Impl rule__GSSIfaceUartPort__Group__2 )
            // InternalIFACE.g:2161:2: rule__GSSIfaceUartPort__Group__1__Impl rule__GSSIfaceUartPort__Group__2
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
    // InternalIFACE.g:2168:1: rule__GSSIfaceUartPort__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceUartPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2172:1: ( ( '{' ) )
            // InternalIFACE.g:2173:1: ( '{' )
            {
            // InternalIFACE.g:2173:1: ( '{' )
            // InternalIFACE.g:2174:2: '{'
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
    // InternalIFACE.g:2183:1: rule__GSSIfaceUartPort__Group__2 : rule__GSSIfaceUartPort__Group__2__Impl rule__GSSIfaceUartPort__Group__3 ;
    public final void rule__GSSIfaceUartPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2187:1: ( rule__GSSIfaceUartPort__Group__2__Impl rule__GSSIfaceUartPort__Group__3 )
            // InternalIFACE.g:2188:2: rule__GSSIfaceUartPort__Group__2__Impl rule__GSSIfaceUartPort__Group__3
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
    // InternalIFACE.g:2195:1: rule__GSSIfaceUartPort__Group__2__Impl : ( 'number' ) ;
    public final void rule__GSSIfaceUartPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2199:1: ( ( 'number' ) )
            // InternalIFACE.g:2200:1: ( 'number' )
            {
            // InternalIFACE.g:2200:1: ( 'number' )
            // InternalIFACE.g:2201:2: 'number'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getNumberKeyword_2()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:2210:1: rule__GSSIfaceUartPort__Group__3 : rule__GSSIfaceUartPort__Group__3__Impl rule__GSSIfaceUartPort__Group__4 ;
    public final void rule__GSSIfaceUartPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2214:1: ( rule__GSSIfaceUartPort__Group__3__Impl rule__GSSIfaceUartPort__Group__4 )
            // InternalIFACE.g:2215:2: rule__GSSIfaceUartPort__Group__3__Impl rule__GSSIfaceUartPort__Group__4
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
    // InternalIFACE.g:2222:1: rule__GSSIfaceUartPort__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2226:1: ( ( ':=' ) )
            // InternalIFACE.g:2227:1: ( ':=' )
            {
            // InternalIFACE.g:2227:1: ( ':=' )
            // InternalIFACE.g:2228:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:2237:1: rule__GSSIfaceUartPort__Group__4 : rule__GSSIfaceUartPort__Group__4__Impl rule__GSSIfaceUartPort__Group__5 ;
    public final void rule__GSSIfaceUartPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2241:1: ( rule__GSSIfaceUartPort__Group__4__Impl rule__GSSIfaceUartPort__Group__5 )
            // InternalIFACE.g:2242:2: rule__GSSIfaceUartPort__Group__4__Impl rule__GSSIfaceUartPort__Group__5
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
    // InternalIFACE.g:2249:1: rule__GSSIfaceUartPort__Group__4__Impl : ( ( rule__GSSIfaceUartPort__NumberAssignment_4 ) ) ;
    public final void rule__GSSIfaceUartPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2253:1: ( ( ( rule__GSSIfaceUartPort__NumberAssignment_4 ) ) )
            // InternalIFACE.g:2254:1: ( ( rule__GSSIfaceUartPort__NumberAssignment_4 ) )
            {
            // InternalIFACE.g:2254:1: ( ( rule__GSSIfaceUartPort__NumberAssignment_4 ) )
            // InternalIFACE.g:2255:2: ( rule__GSSIfaceUartPort__NumberAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getNumberAssignment_4()); 
            }
            // InternalIFACE.g:2256:2: ( rule__GSSIfaceUartPort__NumberAssignment_4 )
            // InternalIFACE.g:2256:3: rule__GSSIfaceUartPort__NumberAssignment_4
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
    // InternalIFACE.g:2264:1: rule__GSSIfaceUartPort__Group__5 : rule__GSSIfaceUartPort__Group__5__Impl rule__GSSIfaceUartPort__Group__6 ;
    public final void rule__GSSIfaceUartPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2268:1: ( rule__GSSIfaceUartPort__Group__5__Impl rule__GSSIfaceUartPort__Group__6 )
            // InternalIFACE.g:2269:2: rule__GSSIfaceUartPort__Group__5__Impl rule__GSSIfaceUartPort__Group__6
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
    // InternalIFACE.g:2276:1: rule__GSSIfaceUartPort__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2280:1: ( ( ';' ) )
            // InternalIFACE.g:2281:1: ( ';' )
            {
            // InternalIFACE.g:2281:1: ( ';' )
            // InternalIFACE.g:2282:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_5()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:2291:1: rule__GSSIfaceUartPort__Group__6 : rule__GSSIfaceUartPort__Group__6__Impl rule__GSSIfaceUartPort__Group__7 ;
    public final void rule__GSSIfaceUartPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2295:1: ( rule__GSSIfaceUartPort__Group__6__Impl rule__GSSIfaceUartPort__Group__7 )
            // InternalIFACE.g:2296:2: rule__GSSIfaceUartPort__Group__6__Impl rule__GSSIfaceUartPort__Group__7
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
    // InternalIFACE.g:2303:1: rule__GSSIfaceUartPort__Group__6__Impl : ( 'baudRate' ) ;
    public final void rule__GSSIfaceUartPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2307:1: ( ( 'baudRate' ) )
            // InternalIFACE.g:2308:1: ( 'baudRate' )
            {
            // InternalIFACE.g:2308:1: ( 'baudRate' )
            // InternalIFACE.g:2309:2: 'baudRate'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateKeyword_6()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:2318:1: rule__GSSIfaceUartPort__Group__7 : rule__GSSIfaceUartPort__Group__7__Impl rule__GSSIfaceUartPort__Group__8 ;
    public final void rule__GSSIfaceUartPort__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2322:1: ( rule__GSSIfaceUartPort__Group__7__Impl rule__GSSIfaceUartPort__Group__8 )
            // InternalIFACE.g:2323:2: rule__GSSIfaceUartPort__Group__7__Impl rule__GSSIfaceUartPort__Group__8
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
    // InternalIFACE.g:2330:1: rule__GSSIfaceUartPort__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartPort__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2334:1: ( ( ':=' ) )
            // InternalIFACE.g:2335:1: ( ':=' )
            {
            // InternalIFACE.g:2335:1: ( ':=' )
            // InternalIFACE.g:2336:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:2345:1: rule__GSSIfaceUartPort__Group__8 : rule__GSSIfaceUartPort__Group__8__Impl rule__GSSIfaceUartPort__Group__9 ;
    public final void rule__GSSIfaceUartPort__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2349:1: ( rule__GSSIfaceUartPort__Group__8__Impl rule__GSSIfaceUartPort__Group__9 )
            // InternalIFACE.g:2350:2: rule__GSSIfaceUartPort__Group__8__Impl rule__GSSIfaceUartPort__Group__9
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
    // InternalIFACE.g:2357:1: rule__GSSIfaceUartPort__Group__8__Impl : ( ( rule__GSSIfaceUartPort__BaudRateAssignment_8 ) ) ;
    public final void rule__GSSIfaceUartPort__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2361:1: ( ( ( rule__GSSIfaceUartPort__BaudRateAssignment_8 ) ) )
            // InternalIFACE.g:2362:1: ( ( rule__GSSIfaceUartPort__BaudRateAssignment_8 ) )
            {
            // InternalIFACE.g:2362:1: ( ( rule__GSSIfaceUartPort__BaudRateAssignment_8 ) )
            // InternalIFACE.g:2363:2: ( rule__GSSIfaceUartPort__BaudRateAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateAssignment_8()); 
            }
            // InternalIFACE.g:2364:2: ( rule__GSSIfaceUartPort__BaudRateAssignment_8 )
            // InternalIFACE.g:2364:3: rule__GSSIfaceUartPort__BaudRateAssignment_8
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
    // InternalIFACE.g:2372:1: rule__GSSIfaceUartPort__Group__9 : rule__GSSIfaceUartPort__Group__9__Impl rule__GSSIfaceUartPort__Group__10 ;
    public final void rule__GSSIfaceUartPort__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2376:1: ( rule__GSSIfaceUartPort__Group__9__Impl rule__GSSIfaceUartPort__Group__10 )
            // InternalIFACE.g:2377:2: rule__GSSIfaceUartPort__Group__9__Impl rule__GSSIfaceUartPort__Group__10
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
    // InternalIFACE.g:2384:1: rule__GSSIfaceUartPort__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2388:1: ( ( ';' ) )
            // InternalIFACE.g:2389:1: ( ';' )
            {
            // InternalIFACE.g:2389:1: ( ';' )
            // InternalIFACE.g:2390:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_9()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:2399:1: rule__GSSIfaceUartPort__Group__10 : rule__GSSIfaceUartPort__Group__10__Impl rule__GSSIfaceUartPort__Group__11 ;
    public final void rule__GSSIfaceUartPort__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2403:1: ( rule__GSSIfaceUartPort__Group__10__Impl rule__GSSIfaceUartPort__Group__11 )
            // InternalIFACE.g:2404:2: rule__GSSIfaceUartPort__Group__10__Impl rule__GSSIfaceUartPort__Group__11
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
    // InternalIFACE.g:2411:1: rule__GSSIfaceUartPort__Group__10__Impl : ( 'parity' ) ;
    public final void rule__GSSIfaceUartPort__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2415:1: ( ( 'parity' ) )
            // InternalIFACE.g:2416:1: ( 'parity' )
            {
            // InternalIFACE.g:2416:1: ( 'parity' )
            // InternalIFACE.g:2417:2: 'parity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getParityKeyword_10()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:2426:1: rule__GSSIfaceUartPort__Group__11 : rule__GSSIfaceUartPort__Group__11__Impl rule__GSSIfaceUartPort__Group__12 ;
    public final void rule__GSSIfaceUartPort__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2430:1: ( rule__GSSIfaceUartPort__Group__11__Impl rule__GSSIfaceUartPort__Group__12 )
            // InternalIFACE.g:2431:2: rule__GSSIfaceUartPort__Group__11__Impl rule__GSSIfaceUartPort__Group__12
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
    // InternalIFACE.g:2438:1: rule__GSSIfaceUartPort__Group__11__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartPort__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2442:1: ( ( ':=' ) )
            // InternalIFACE.g:2443:1: ( ':=' )
            {
            // InternalIFACE.g:2443:1: ( ':=' )
            // InternalIFACE.g:2444:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_11()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:2453:1: rule__GSSIfaceUartPort__Group__12 : rule__GSSIfaceUartPort__Group__12__Impl rule__GSSIfaceUartPort__Group__13 ;
    public final void rule__GSSIfaceUartPort__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2457:1: ( rule__GSSIfaceUartPort__Group__12__Impl rule__GSSIfaceUartPort__Group__13 )
            // InternalIFACE.g:2458:2: rule__GSSIfaceUartPort__Group__12__Impl rule__GSSIfaceUartPort__Group__13
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
    // InternalIFACE.g:2465:1: rule__GSSIfaceUartPort__Group__12__Impl : ( ( rule__GSSIfaceUartPort__ParityAssignment_12 ) ) ;
    public final void rule__GSSIfaceUartPort__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2469:1: ( ( ( rule__GSSIfaceUartPort__ParityAssignment_12 ) ) )
            // InternalIFACE.g:2470:1: ( ( rule__GSSIfaceUartPort__ParityAssignment_12 ) )
            {
            // InternalIFACE.g:2470:1: ( ( rule__GSSIfaceUartPort__ParityAssignment_12 ) )
            // InternalIFACE.g:2471:2: ( rule__GSSIfaceUartPort__ParityAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getParityAssignment_12()); 
            }
            // InternalIFACE.g:2472:2: ( rule__GSSIfaceUartPort__ParityAssignment_12 )
            // InternalIFACE.g:2472:3: rule__GSSIfaceUartPort__ParityAssignment_12
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
    // InternalIFACE.g:2480:1: rule__GSSIfaceUartPort__Group__13 : rule__GSSIfaceUartPort__Group__13__Impl rule__GSSIfaceUartPort__Group__14 ;
    public final void rule__GSSIfaceUartPort__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2484:1: ( rule__GSSIfaceUartPort__Group__13__Impl rule__GSSIfaceUartPort__Group__14 )
            // InternalIFACE.g:2485:2: rule__GSSIfaceUartPort__Group__13__Impl rule__GSSIfaceUartPort__Group__14
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
    // InternalIFACE.g:2492:1: rule__GSSIfaceUartPort__Group__13__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2496:1: ( ( ';' ) )
            // InternalIFACE.g:2497:1: ( ';' )
            {
            // InternalIFACE.g:2497:1: ( ';' )
            // InternalIFACE.g:2498:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_13()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:2507:1: rule__GSSIfaceUartPort__Group__14 : rule__GSSIfaceUartPort__Group__14__Impl rule__GSSIfaceUartPort__Group__15 ;
    public final void rule__GSSIfaceUartPort__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2511:1: ( rule__GSSIfaceUartPort__Group__14__Impl rule__GSSIfaceUartPort__Group__15 )
            // InternalIFACE.g:2512:2: rule__GSSIfaceUartPort__Group__14__Impl rule__GSSIfaceUartPort__Group__15
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
    // InternalIFACE.g:2519:1: rule__GSSIfaceUartPort__Group__14__Impl : ( 'dataBits' ) ;
    public final void rule__GSSIfaceUartPort__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2523:1: ( ( 'dataBits' ) )
            // InternalIFACE.g:2524:1: ( 'dataBits' )
            {
            // InternalIFACE.g:2524:1: ( 'dataBits' )
            // InternalIFACE.g:2525:2: 'dataBits'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsKeyword_14()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:2534:1: rule__GSSIfaceUartPort__Group__15 : rule__GSSIfaceUartPort__Group__15__Impl rule__GSSIfaceUartPort__Group__16 ;
    public final void rule__GSSIfaceUartPort__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2538:1: ( rule__GSSIfaceUartPort__Group__15__Impl rule__GSSIfaceUartPort__Group__16 )
            // InternalIFACE.g:2539:2: rule__GSSIfaceUartPort__Group__15__Impl rule__GSSIfaceUartPort__Group__16
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
    // InternalIFACE.g:2546:1: rule__GSSIfaceUartPort__Group__15__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartPort__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2550:1: ( ( ':=' ) )
            // InternalIFACE.g:2551:1: ( ':=' )
            {
            // InternalIFACE.g:2551:1: ( ':=' )
            // InternalIFACE.g:2552:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_15()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:2561:1: rule__GSSIfaceUartPort__Group__16 : rule__GSSIfaceUartPort__Group__16__Impl rule__GSSIfaceUartPort__Group__17 ;
    public final void rule__GSSIfaceUartPort__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2565:1: ( rule__GSSIfaceUartPort__Group__16__Impl rule__GSSIfaceUartPort__Group__17 )
            // InternalIFACE.g:2566:2: rule__GSSIfaceUartPort__Group__16__Impl rule__GSSIfaceUartPort__Group__17
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
    // InternalIFACE.g:2573:1: rule__GSSIfaceUartPort__Group__16__Impl : ( ( rule__GSSIfaceUartPort__DataBitsAssignment_16 ) ) ;
    public final void rule__GSSIfaceUartPort__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2577:1: ( ( ( rule__GSSIfaceUartPort__DataBitsAssignment_16 ) ) )
            // InternalIFACE.g:2578:1: ( ( rule__GSSIfaceUartPort__DataBitsAssignment_16 ) )
            {
            // InternalIFACE.g:2578:1: ( ( rule__GSSIfaceUartPort__DataBitsAssignment_16 ) )
            // InternalIFACE.g:2579:2: ( rule__GSSIfaceUartPort__DataBitsAssignment_16 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsAssignment_16()); 
            }
            // InternalIFACE.g:2580:2: ( rule__GSSIfaceUartPort__DataBitsAssignment_16 )
            // InternalIFACE.g:2580:3: rule__GSSIfaceUartPort__DataBitsAssignment_16
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
    // InternalIFACE.g:2588:1: rule__GSSIfaceUartPort__Group__17 : rule__GSSIfaceUartPort__Group__17__Impl rule__GSSIfaceUartPort__Group__18 ;
    public final void rule__GSSIfaceUartPort__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2592:1: ( rule__GSSIfaceUartPort__Group__17__Impl rule__GSSIfaceUartPort__Group__18 )
            // InternalIFACE.g:2593:2: rule__GSSIfaceUartPort__Group__17__Impl rule__GSSIfaceUartPort__Group__18
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
    // InternalIFACE.g:2600:1: rule__GSSIfaceUartPort__Group__17__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2604:1: ( ( ';' ) )
            // InternalIFACE.g:2605:1: ( ';' )
            {
            // InternalIFACE.g:2605:1: ( ';' )
            // InternalIFACE.g:2606:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_17()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:2615:1: rule__GSSIfaceUartPort__Group__18 : rule__GSSIfaceUartPort__Group__18__Impl rule__GSSIfaceUartPort__Group__19 ;
    public final void rule__GSSIfaceUartPort__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2619:1: ( rule__GSSIfaceUartPort__Group__18__Impl rule__GSSIfaceUartPort__Group__19 )
            // InternalIFACE.g:2620:2: rule__GSSIfaceUartPort__Group__18__Impl rule__GSSIfaceUartPort__Group__19
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
    // InternalIFACE.g:2627:1: rule__GSSIfaceUartPort__Group__18__Impl : ( 'stopBits' ) ;
    public final void rule__GSSIfaceUartPort__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2631:1: ( ( 'stopBits' ) )
            // InternalIFACE.g:2632:1: ( 'stopBits' )
            {
            // InternalIFACE.g:2632:1: ( 'stopBits' )
            // InternalIFACE.g:2633:2: 'stopBits'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsKeyword_18()); 
            }
            match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:2642:1: rule__GSSIfaceUartPort__Group__19 : rule__GSSIfaceUartPort__Group__19__Impl rule__GSSIfaceUartPort__Group__20 ;
    public final void rule__GSSIfaceUartPort__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2646:1: ( rule__GSSIfaceUartPort__Group__19__Impl rule__GSSIfaceUartPort__Group__20 )
            // InternalIFACE.g:2647:2: rule__GSSIfaceUartPort__Group__19__Impl rule__GSSIfaceUartPort__Group__20
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
    // InternalIFACE.g:2654:1: rule__GSSIfaceUartPort__Group__19__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartPort__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2658:1: ( ( ':=' ) )
            // InternalIFACE.g:2659:1: ( ':=' )
            {
            // InternalIFACE.g:2659:1: ( ':=' )
            // InternalIFACE.g:2660:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_19()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:2669:1: rule__GSSIfaceUartPort__Group__20 : rule__GSSIfaceUartPort__Group__20__Impl rule__GSSIfaceUartPort__Group__21 ;
    public final void rule__GSSIfaceUartPort__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2673:1: ( rule__GSSIfaceUartPort__Group__20__Impl rule__GSSIfaceUartPort__Group__21 )
            // InternalIFACE.g:2674:2: rule__GSSIfaceUartPort__Group__20__Impl rule__GSSIfaceUartPort__Group__21
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
    // InternalIFACE.g:2681:1: rule__GSSIfaceUartPort__Group__20__Impl : ( ( rule__GSSIfaceUartPort__StopBitsAssignment_20 ) ) ;
    public final void rule__GSSIfaceUartPort__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2685:1: ( ( ( rule__GSSIfaceUartPort__StopBitsAssignment_20 ) ) )
            // InternalIFACE.g:2686:1: ( ( rule__GSSIfaceUartPort__StopBitsAssignment_20 ) )
            {
            // InternalIFACE.g:2686:1: ( ( rule__GSSIfaceUartPort__StopBitsAssignment_20 ) )
            // InternalIFACE.g:2687:2: ( rule__GSSIfaceUartPort__StopBitsAssignment_20 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsAssignment_20()); 
            }
            // InternalIFACE.g:2688:2: ( rule__GSSIfaceUartPort__StopBitsAssignment_20 )
            // InternalIFACE.g:2688:3: rule__GSSIfaceUartPort__StopBitsAssignment_20
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
    // InternalIFACE.g:2696:1: rule__GSSIfaceUartPort__Group__21 : rule__GSSIfaceUartPort__Group__21__Impl rule__GSSIfaceUartPort__Group__22 ;
    public final void rule__GSSIfaceUartPort__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2700:1: ( rule__GSSIfaceUartPort__Group__21__Impl rule__GSSIfaceUartPort__Group__22 )
            // InternalIFACE.g:2701:2: rule__GSSIfaceUartPort__Group__21__Impl rule__GSSIfaceUartPort__Group__22
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
    // InternalIFACE.g:2708:1: rule__GSSIfaceUartPort__Group__21__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2712:1: ( ( ';' ) )
            // InternalIFACE.g:2713:1: ( ';' )
            {
            // InternalIFACE.g:2713:1: ( ';' )
            // InternalIFACE.g:2714:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_21()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:2723:1: rule__GSSIfaceUartPort__Group__22 : rule__GSSIfaceUartPort__Group__22__Impl rule__GSSIfaceUartPort__Group__23 ;
    public final void rule__GSSIfaceUartPort__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2727:1: ( rule__GSSIfaceUartPort__Group__22__Impl rule__GSSIfaceUartPort__Group__23 )
            // InternalIFACE.g:2728:2: rule__GSSIfaceUartPort__Group__22__Impl rule__GSSIfaceUartPort__Group__23
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
    // InternalIFACE.g:2735:1: rule__GSSIfaceUartPort__Group__22__Impl : ( 'inputQueueSize' ) ;
    public final void rule__GSSIfaceUartPort__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2739:1: ( ( 'inputQueueSize' ) )
            // InternalIFACE.g:2740:1: ( 'inputQueueSize' )
            {
            // InternalIFACE.g:2740:1: ( 'inputQueueSize' )
            // InternalIFACE.g:2741:2: 'inputQueueSize'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeKeyword_22()); 
            }
            match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeKeyword_22()); 
            }

            }


            }

        }
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
    // InternalIFACE.g:2750:1: rule__GSSIfaceUartPort__Group__23 : rule__GSSIfaceUartPort__Group__23__Impl rule__GSSIfaceUartPort__Group__24 ;
    public final void rule__GSSIfaceUartPort__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2754:1: ( rule__GSSIfaceUartPort__Group__23__Impl rule__GSSIfaceUartPort__Group__24 )
            // InternalIFACE.g:2755:2: rule__GSSIfaceUartPort__Group__23__Impl rule__GSSIfaceUartPort__Group__24
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalIFACE.g:2762:1: rule__GSSIfaceUartPort__Group__23__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartPort__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2766:1: ( ( ':=' ) )
            // InternalIFACE.g:2767:1: ( ':=' )
            {
            // InternalIFACE.g:2767:1: ( ':=' )
            // InternalIFACE.g:2768:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_23()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:2777:1: rule__GSSIfaceUartPort__Group__24 : rule__GSSIfaceUartPort__Group__24__Impl rule__GSSIfaceUartPort__Group__25 ;
    public final void rule__GSSIfaceUartPort__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2781:1: ( rule__GSSIfaceUartPort__Group__24__Impl rule__GSSIfaceUartPort__Group__25 )
            // InternalIFACE.g:2782:2: rule__GSSIfaceUartPort__Group__24__Impl rule__GSSIfaceUartPort__Group__25
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
    // InternalIFACE.g:2789:1: rule__GSSIfaceUartPort__Group__24__Impl : ( ( rule__GSSIfaceUartPort__InputQueueSizeAssignment_24 ) ) ;
    public final void rule__GSSIfaceUartPort__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2793:1: ( ( ( rule__GSSIfaceUartPort__InputQueueSizeAssignment_24 ) ) )
            // InternalIFACE.g:2794:1: ( ( rule__GSSIfaceUartPort__InputQueueSizeAssignment_24 ) )
            {
            // InternalIFACE.g:2794:1: ( ( rule__GSSIfaceUartPort__InputQueueSizeAssignment_24 ) )
            // InternalIFACE.g:2795:2: ( rule__GSSIfaceUartPort__InputQueueSizeAssignment_24 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeAssignment_24()); 
            }
            // InternalIFACE.g:2796:2: ( rule__GSSIfaceUartPort__InputQueueSizeAssignment_24 )
            // InternalIFACE.g:2796:3: rule__GSSIfaceUartPort__InputQueueSizeAssignment_24
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__InputQueueSizeAssignment_24();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeAssignment_24()); 
            }

            }


            }

        }
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
    // InternalIFACE.g:2804:1: rule__GSSIfaceUartPort__Group__25 : rule__GSSIfaceUartPort__Group__25__Impl rule__GSSIfaceUartPort__Group__26 ;
    public final void rule__GSSIfaceUartPort__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2808:1: ( rule__GSSIfaceUartPort__Group__25__Impl rule__GSSIfaceUartPort__Group__26 )
            // InternalIFACE.g:2809:2: rule__GSSIfaceUartPort__Group__25__Impl rule__GSSIfaceUartPort__Group__26
            {
            pushFollow(FollowSets000.FOLLOW_32);
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
    // InternalIFACE.g:2816:1: rule__GSSIfaceUartPort__Group__25__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2820:1: ( ( ';' ) )
            // InternalIFACE.g:2821:1: ( ';' )
            {
            // InternalIFACE.g:2821:1: ( ';' )
            // InternalIFACE.g:2822:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_25()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:2831:1: rule__GSSIfaceUartPort__Group__26 : rule__GSSIfaceUartPort__Group__26__Impl rule__GSSIfaceUartPort__Group__27 ;
    public final void rule__GSSIfaceUartPort__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2835:1: ( rule__GSSIfaceUartPort__Group__26__Impl rule__GSSIfaceUartPort__Group__27 )
            // InternalIFACE.g:2836:2: rule__GSSIfaceUartPort__Group__26__Impl rule__GSSIfaceUartPort__Group__27
            {
            pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalIFACE.g:2843:1: rule__GSSIfaceUartPort__Group__26__Impl : ( 'outputQueueSize' ) ;
    public final void rule__GSSIfaceUartPort__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2847:1: ( ( 'outputQueueSize' ) )
            // InternalIFACE.g:2848:1: ( 'outputQueueSize' )
            {
            // InternalIFACE.g:2848:1: ( 'outputQueueSize' )
            // InternalIFACE.g:2849:2: 'outputQueueSize'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeKeyword_26()); 
            }
            match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeKeyword_26()); 
            }

            }


            }

        }
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
    // InternalIFACE.g:2858:1: rule__GSSIfaceUartPort__Group__27 : rule__GSSIfaceUartPort__Group__27__Impl rule__GSSIfaceUartPort__Group__28 ;
    public final void rule__GSSIfaceUartPort__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2862:1: ( rule__GSSIfaceUartPort__Group__27__Impl rule__GSSIfaceUartPort__Group__28 )
            // InternalIFACE.g:2863:2: rule__GSSIfaceUartPort__Group__27__Impl rule__GSSIfaceUartPort__Group__28
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalIFACE.g:2870:1: rule__GSSIfaceUartPort__Group__27__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartPort__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2874:1: ( ( ':=' ) )
            // InternalIFACE.g:2875:1: ( ':=' )
            {
            // InternalIFACE.g:2875:1: ( ':=' )
            // InternalIFACE.g:2876:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_27()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_27()); 
            }

            }


            }

        }
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
    // InternalIFACE.g:2885:1: rule__GSSIfaceUartPort__Group__28 : rule__GSSIfaceUartPort__Group__28__Impl rule__GSSIfaceUartPort__Group__29 ;
    public final void rule__GSSIfaceUartPort__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2889:1: ( rule__GSSIfaceUartPort__Group__28__Impl rule__GSSIfaceUartPort__Group__29 )
            // InternalIFACE.g:2890:2: rule__GSSIfaceUartPort__Group__28__Impl rule__GSSIfaceUartPort__Group__29
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceUartPort__Group__28__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__29();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalIFACE.g:2897:1: rule__GSSIfaceUartPort__Group__28__Impl : ( ( rule__GSSIfaceUartPort__OutputQueueSizeAssignment_28 ) ) ;
    public final void rule__GSSIfaceUartPort__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2901:1: ( ( ( rule__GSSIfaceUartPort__OutputQueueSizeAssignment_28 ) ) )
            // InternalIFACE.g:2902:1: ( ( rule__GSSIfaceUartPort__OutputQueueSizeAssignment_28 ) )
            {
            // InternalIFACE.g:2902:1: ( ( rule__GSSIfaceUartPort__OutputQueueSizeAssignment_28 ) )
            // InternalIFACE.g:2903:2: ( rule__GSSIfaceUartPort__OutputQueueSizeAssignment_28 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeAssignment_28()); 
            }
            // InternalIFACE.g:2904:2: ( rule__GSSIfaceUartPort__OutputQueueSizeAssignment_28 )
            // InternalIFACE.g:2904:3: rule__GSSIfaceUartPort__OutputQueueSizeAssignment_28
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__OutputQueueSizeAssignment_28();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeAssignment_28()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__GSSIfaceUartPort__Group__29"
    // InternalIFACE.g:2912:1: rule__GSSIfaceUartPort__Group__29 : rule__GSSIfaceUartPort__Group__29__Impl rule__GSSIfaceUartPort__Group__30 ;
    public final void rule__GSSIfaceUartPort__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2916:1: ( rule__GSSIfaceUartPort__Group__29__Impl rule__GSSIfaceUartPort__Group__30 )
            // InternalIFACE.g:2917:2: rule__GSSIfaceUartPort__Group__29__Impl rule__GSSIfaceUartPort__Group__30
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__GSSIfaceUartPort__Group__29__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__30();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__29"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__29__Impl"
    // InternalIFACE.g:2924:1: rule__GSSIfaceUartPort__Group__29__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2928:1: ( ( ';' ) )
            // InternalIFACE.g:2929:1: ( ';' )
            {
            // InternalIFACE.g:2929:1: ( ';' )
            // InternalIFACE.g:2930:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_29()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_29()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__29__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__30"
    // InternalIFACE.g:2939:1: rule__GSSIfaceUartPort__Group__30 : rule__GSSIfaceUartPort__Group__30__Impl rule__GSSIfaceUartPort__Group__31 ;
    public final void rule__GSSIfaceUartPort__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2943:1: ( rule__GSSIfaceUartPort__Group__30__Impl rule__GSSIfaceUartPort__Group__31 )
            // InternalIFACE.g:2944:2: rule__GSSIfaceUartPort__Group__30__Impl rule__GSSIfaceUartPort__Group__31
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceUartPort__Group__30__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__31();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__30"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__30__Impl"
    // InternalIFACE.g:2951:1: rule__GSSIfaceUartPort__Group__30__Impl : ( ( rule__GSSIfaceUartPort__UartProtocolAssignment_30 ) ) ;
    public final void rule__GSSIfaceUartPort__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2955:1: ( ( ( rule__GSSIfaceUartPort__UartProtocolAssignment_30 ) ) )
            // InternalIFACE.g:2956:1: ( ( rule__GSSIfaceUartPort__UartProtocolAssignment_30 ) )
            {
            // InternalIFACE.g:2956:1: ( ( rule__GSSIfaceUartPort__UartProtocolAssignment_30 ) )
            // InternalIFACE.g:2957:2: ( rule__GSSIfaceUartPort__UartProtocolAssignment_30 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getUartProtocolAssignment_30()); 
            }
            // InternalIFACE.g:2958:2: ( rule__GSSIfaceUartPort__UartProtocolAssignment_30 )
            // InternalIFACE.g:2958:3: rule__GSSIfaceUartPort__UartProtocolAssignment_30
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__UartProtocolAssignment_30();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getUartProtocolAssignment_30()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__30__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__31"
    // InternalIFACE.g:2966:1: rule__GSSIfaceUartPort__Group__31 : rule__GSSIfaceUartPort__Group__31__Impl rule__GSSIfaceUartPort__Group__32 ;
    public final void rule__GSSIfaceUartPort__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2970:1: ( rule__GSSIfaceUartPort__Group__31__Impl rule__GSSIfaceUartPort__Group__32 )
            // InternalIFACE.g:2971:2: rule__GSSIfaceUartPort__Group__31__Impl rule__GSSIfaceUartPort__Group__32
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceUartPort__Group__31__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__32();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__31"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__31__Impl"
    // InternalIFACE.g:2978:1: rule__GSSIfaceUartPort__Group__31__Impl : ( '}' ) ;
    public final void rule__GSSIfaceUartPort__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2982:1: ( ( '}' ) )
            // InternalIFACE.g:2983:1: ( '}' )
            {
            // InternalIFACE.g:2983:1: ( '}' )
            // InternalIFACE.g:2984:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getRightCurlyBracketKeyword_31()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getRightCurlyBracketKeyword_31()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__31__Impl"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__32"
    // InternalIFACE.g:2993:1: rule__GSSIfaceUartPort__Group__32 : rule__GSSIfaceUartPort__Group__32__Impl ;
    public final void rule__GSSIfaceUartPort__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2997:1: ( rule__GSSIfaceUartPort__Group__32__Impl )
            // InternalIFACE.g:2998:2: rule__GSSIfaceUartPort__Group__32__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__Group__32__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__32"


    // $ANTLR start "rule__GSSIfaceUartPort__Group__32__Impl"
    // InternalIFACE.g:3004:1: rule__GSSIfaceUartPort__Group__32__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3008:1: ( ( ';' ) )
            // InternalIFACE.g:3009:1: ( ';' )
            {
            // InternalIFACE.g:3009:1: ( ';' )
            // InternalIFACE.g:3010:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_32()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_32()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__Group__32__Impl"


    // $ANTLR start "rule__GSSIfaceUartProtocol__Group__0"
    // InternalIFACE.g:3020:1: rule__GSSIfaceUartProtocol__Group__0 : rule__GSSIfaceUartProtocol__Group__0__Impl rule__GSSIfaceUartProtocol__Group__1 ;
    public final void rule__GSSIfaceUartProtocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3024:1: ( rule__GSSIfaceUartProtocol__Group__0__Impl rule__GSSIfaceUartProtocol__Group__1 )
            // InternalIFACE.g:3025:2: rule__GSSIfaceUartProtocol__Group__0__Impl rule__GSSIfaceUartProtocol__Group__1
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
    // InternalIFACE.g:3032:1: rule__GSSIfaceUartProtocol__Group__0__Impl : ( 'uartProtocol' ) ;
    public final void rule__GSSIfaceUartProtocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3036:1: ( ( 'uartProtocol' ) )
            // InternalIFACE.g:3037:1: ( 'uartProtocol' )
            {
            // InternalIFACE.g:3037:1: ( 'uartProtocol' )
            // InternalIFACE.g:3038:2: 'uartProtocol'
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
    // InternalIFACE.g:3047:1: rule__GSSIfaceUartProtocol__Group__1 : rule__GSSIfaceUartProtocol__Group__1__Impl rule__GSSIfaceUartProtocol__Group__2 ;
    public final void rule__GSSIfaceUartProtocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3051:1: ( rule__GSSIfaceUartProtocol__Group__1__Impl rule__GSSIfaceUartProtocol__Group__2 )
            // InternalIFACE.g:3052:2: rule__GSSIfaceUartProtocol__Group__1__Impl rule__GSSIfaceUartProtocol__Group__2
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
    // InternalIFACE.g:3059:1: rule__GSSIfaceUartProtocol__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceUartProtocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3063:1: ( ( '{' ) )
            // InternalIFACE.g:3064:1: ( '{' )
            {
            // InternalIFACE.g:3064:1: ( '{' )
            // InternalIFACE.g:3065:2: '{'
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
    // InternalIFACE.g:3074:1: rule__GSSIfaceUartProtocol__Group__2 : rule__GSSIfaceUartProtocol__Group__2__Impl rule__GSSIfaceUartProtocol__Group__3 ;
    public final void rule__GSSIfaceUartProtocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3078:1: ( rule__GSSIfaceUartProtocol__Group__2__Impl rule__GSSIfaceUartProtocol__Group__3 )
            // InternalIFACE.g:3079:2: rule__GSSIfaceUartProtocol__Group__2__Impl rule__GSSIfaceUartProtocol__Group__3
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
    // InternalIFACE.g:3086:1: rule__GSSIfaceUartProtocol__Group__2__Impl : ( 'unit' ) ;
    public final void rule__GSSIfaceUartProtocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3090:1: ( ( 'unit' ) )
            // InternalIFACE.g:3091:1: ( 'unit' )
            {
            // InternalIFACE.g:3091:1: ( 'unit' )
            // InternalIFACE.g:3092:2: 'unit'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getUnitKeyword_2()); 
            }
            match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3101:1: rule__GSSIfaceUartProtocol__Group__3 : rule__GSSIfaceUartProtocol__Group__3__Impl rule__GSSIfaceUartProtocol__Group__4 ;
    public final void rule__GSSIfaceUartProtocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3105:1: ( rule__GSSIfaceUartProtocol__Group__3__Impl rule__GSSIfaceUartProtocol__Group__4 )
            // InternalIFACE.g:3106:2: rule__GSSIfaceUartProtocol__Group__3__Impl rule__GSSIfaceUartProtocol__Group__4
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
    // InternalIFACE.g:3113:1: rule__GSSIfaceUartProtocol__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartProtocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3117:1: ( ( ':=' ) )
            // InternalIFACE.g:3118:1: ( ':=' )
            {
            // InternalIFACE.g:3118:1: ( ':=' )
            // InternalIFACE.g:3119:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3128:1: rule__GSSIfaceUartProtocol__Group__4 : rule__GSSIfaceUartProtocol__Group__4__Impl rule__GSSIfaceUartProtocol__Group__5 ;
    public final void rule__GSSIfaceUartProtocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3132:1: ( rule__GSSIfaceUartProtocol__Group__4__Impl rule__GSSIfaceUartProtocol__Group__5 )
            // InternalIFACE.g:3133:2: rule__GSSIfaceUartProtocol__Group__4__Impl rule__GSSIfaceUartProtocol__Group__5
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
    // InternalIFACE.g:3140:1: rule__GSSIfaceUartProtocol__Group__4__Impl : ( ( rule__GSSIfaceUartProtocol__UnitAssignment_4 ) ) ;
    public final void rule__GSSIfaceUartProtocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3144:1: ( ( ( rule__GSSIfaceUartProtocol__UnitAssignment_4 ) ) )
            // InternalIFACE.g:3145:1: ( ( rule__GSSIfaceUartProtocol__UnitAssignment_4 ) )
            {
            // InternalIFACE.g:3145:1: ( ( rule__GSSIfaceUartProtocol__UnitAssignment_4 ) )
            // InternalIFACE.g:3146:2: ( rule__GSSIfaceUartProtocol__UnitAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getUnitAssignment_4()); 
            }
            // InternalIFACE.g:3147:2: ( rule__GSSIfaceUartProtocol__UnitAssignment_4 )
            // InternalIFACE.g:3147:3: rule__GSSIfaceUartProtocol__UnitAssignment_4
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
    // InternalIFACE.g:3155:1: rule__GSSIfaceUartProtocol__Group__5 : rule__GSSIfaceUartProtocol__Group__5__Impl rule__GSSIfaceUartProtocol__Group__6 ;
    public final void rule__GSSIfaceUartProtocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3159:1: ( rule__GSSIfaceUartProtocol__Group__5__Impl rule__GSSIfaceUartProtocol__Group__6 )
            // InternalIFACE.g:3160:2: rule__GSSIfaceUartProtocol__Group__5__Impl rule__GSSIfaceUartProtocol__Group__6
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
    // InternalIFACE.g:3167:1: rule__GSSIfaceUartProtocol__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartProtocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3171:1: ( ( ';' ) )
            // InternalIFACE.g:3172:1: ( ';' )
            {
            // InternalIFACE.g:3172:1: ( ';' )
            // InternalIFACE.g:3173:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_5()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3182:1: rule__GSSIfaceUartProtocol__Group__6 : rule__GSSIfaceUartProtocol__Group__6__Impl rule__GSSIfaceUartProtocol__Group__7 ;
    public final void rule__GSSIfaceUartProtocol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3186:1: ( rule__GSSIfaceUartProtocol__Group__6__Impl rule__GSSIfaceUartProtocol__Group__7 )
            // InternalIFACE.g:3187:2: rule__GSSIfaceUartProtocol__Group__6__Impl rule__GSSIfaceUartProtocol__Group__7
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
    // InternalIFACE.g:3194:1: rule__GSSIfaceUartProtocol__Group__6__Impl : ( 'power' ) ;
    public final void rule__GSSIfaceUartProtocol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3198:1: ( ( 'power' ) )
            // InternalIFACE.g:3199:1: ( 'power' )
            {
            // InternalIFACE.g:3199:1: ( 'power' )
            // InternalIFACE.g:3200:2: 'power'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getPowerKeyword_6()); 
            }
            match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3209:1: rule__GSSIfaceUartProtocol__Group__7 : rule__GSSIfaceUartProtocol__Group__7__Impl rule__GSSIfaceUartProtocol__Group__8 ;
    public final void rule__GSSIfaceUartProtocol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3213:1: ( rule__GSSIfaceUartProtocol__Group__7__Impl rule__GSSIfaceUartProtocol__Group__8 )
            // InternalIFACE.g:3214:2: rule__GSSIfaceUartProtocol__Group__7__Impl rule__GSSIfaceUartProtocol__Group__8
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
    // InternalIFACE.g:3221:1: rule__GSSIfaceUartProtocol__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartProtocol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3225:1: ( ( ':=' ) )
            // InternalIFACE.g:3226:1: ( ':=' )
            {
            // InternalIFACE.g:3226:1: ( ':=' )
            // InternalIFACE.g:3227:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3236:1: rule__GSSIfaceUartProtocol__Group__8 : rule__GSSIfaceUartProtocol__Group__8__Impl rule__GSSIfaceUartProtocol__Group__9 ;
    public final void rule__GSSIfaceUartProtocol__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3240:1: ( rule__GSSIfaceUartProtocol__Group__8__Impl rule__GSSIfaceUartProtocol__Group__9 )
            // InternalIFACE.g:3241:2: rule__GSSIfaceUartProtocol__Group__8__Impl rule__GSSIfaceUartProtocol__Group__9
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
    // InternalIFACE.g:3248:1: rule__GSSIfaceUartProtocol__Group__8__Impl : ( ( rule__GSSIfaceUartProtocol__PowerAssignment_8 ) ) ;
    public final void rule__GSSIfaceUartProtocol__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3252:1: ( ( ( rule__GSSIfaceUartProtocol__PowerAssignment_8 ) ) )
            // InternalIFACE.g:3253:1: ( ( rule__GSSIfaceUartProtocol__PowerAssignment_8 ) )
            {
            // InternalIFACE.g:3253:1: ( ( rule__GSSIfaceUartProtocol__PowerAssignment_8 ) )
            // InternalIFACE.g:3254:2: ( rule__GSSIfaceUartProtocol__PowerAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getPowerAssignment_8()); 
            }
            // InternalIFACE.g:3255:2: ( rule__GSSIfaceUartProtocol__PowerAssignment_8 )
            // InternalIFACE.g:3255:3: rule__GSSIfaceUartProtocol__PowerAssignment_8
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
    // InternalIFACE.g:3263:1: rule__GSSIfaceUartProtocol__Group__9 : rule__GSSIfaceUartProtocol__Group__9__Impl rule__GSSIfaceUartProtocol__Group__10 ;
    public final void rule__GSSIfaceUartProtocol__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3267:1: ( rule__GSSIfaceUartProtocol__Group__9__Impl rule__GSSIfaceUartProtocol__Group__10 )
            // InternalIFACE.g:3268:2: rule__GSSIfaceUartProtocol__Group__9__Impl rule__GSSIfaceUartProtocol__Group__10
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
    // InternalIFACE.g:3275:1: rule__GSSIfaceUartProtocol__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartProtocol__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3279:1: ( ( ';' ) )
            // InternalIFACE.g:3280:1: ( ';' )
            {
            // InternalIFACE.g:3280:1: ( ';' )
            // InternalIFACE.g:3281:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_9()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3290:1: rule__GSSIfaceUartProtocol__Group__10 : rule__GSSIfaceUartProtocol__Group__10__Impl rule__GSSIfaceUartProtocol__Group__11 ;
    public final void rule__GSSIfaceUartProtocol__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3294:1: ( rule__GSSIfaceUartProtocol__Group__10__Impl rule__GSSIfaceUartProtocol__Group__11 )
            // InternalIFACE.g:3295:2: rule__GSSIfaceUartProtocol__Group__10__Impl rule__GSSIfaceUartProtocol__Group__11
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
    // InternalIFACE.g:3302:1: rule__GSSIfaceUartProtocol__Group__10__Impl : ( ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_10 ) ) ;
    public final void rule__GSSIfaceUartProtocol__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3306:1: ( ( ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_10 ) ) )
            // InternalIFACE.g:3307:1: ( ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_10 ) )
            {
            // InternalIFACE.g:3307:1: ( ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_10 ) )
            // InternalIFACE.g:3308:2: ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getConstSizeAssignment_10()); 
            }
            // InternalIFACE.g:3309:2: ( rule__GSSIfaceUartProtocol__ConstSizeAssignment_10 )
            // InternalIFACE.g:3309:3: rule__GSSIfaceUartProtocol__ConstSizeAssignment_10
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
    // InternalIFACE.g:3317:1: rule__GSSIfaceUartProtocol__Group__11 : rule__GSSIfaceUartProtocol__Group__11__Impl rule__GSSIfaceUartProtocol__Group__12 ;
    public final void rule__GSSIfaceUartProtocol__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3321:1: ( rule__GSSIfaceUartProtocol__Group__11__Impl rule__GSSIfaceUartProtocol__Group__12 )
            // InternalIFACE.g:3322:2: rule__GSSIfaceUartProtocol__Group__11__Impl rule__GSSIfaceUartProtocol__Group__12
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
    // InternalIFACE.g:3329:1: rule__GSSIfaceUartProtocol__Group__11__Impl : ( ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_11 ) ) ;
    public final void rule__GSSIfaceUartProtocol__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3333:1: ( ( ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_11 ) ) )
            // InternalIFACE.g:3334:1: ( ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_11 ) )
            {
            // InternalIFACE.g:3334:1: ( ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_11 ) )
            // InternalIFACE.g:3335:2: ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_11 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldOffsetAssignment_11()); 
            }
            // InternalIFACE.g:3336:2: ( rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_11 )
            // InternalIFACE.g:3336:3: rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_11
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
    // InternalIFACE.g:3344:1: rule__GSSIfaceUartProtocol__Group__12 : rule__GSSIfaceUartProtocol__Group__12__Impl rule__GSSIfaceUartProtocol__Group__13 ;
    public final void rule__GSSIfaceUartProtocol__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3348:1: ( rule__GSSIfaceUartProtocol__Group__12__Impl rule__GSSIfaceUartProtocol__Group__13 )
            // InternalIFACE.g:3349:2: rule__GSSIfaceUartProtocol__Group__12__Impl rule__GSSIfaceUartProtocol__Group__13
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
    // InternalIFACE.g:3356:1: rule__GSSIfaceUartProtocol__Group__12__Impl : ( ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_12 ) ) ;
    public final void rule__GSSIfaceUartProtocol__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3360:1: ( ( ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_12 ) ) )
            // InternalIFACE.g:3361:1: ( ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_12 ) )
            {
            // InternalIFACE.g:3361:1: ( ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_12 ) )
            // InternalIFACE.g:3362:2: ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldTrimAssignment_12()); 
            }
            // InternalIFACE.g:3363:2: ( rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_12 )
            // InternalIFACE.g:3363:3: rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_12
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
    // InternalIFACE.g:3371:1: rule__GSSIfaceUartProtocol__Group__13 : rule__GSSIfaceUartProtocol__Group__13__Impl rule__GSSIfaceUartProtocol__Group__14 ;
    public final void rule__GSSIfaceUartProtocol__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3375:1: ( rule__GSSIfaceUartProtocol__Group__13__Impl rule__GSSIfaceUartProtocol__Group__14 )
            // InternalIFACE.g:3376:2: rule__GSSIfaceUartProtocol__Group__13__Impl rule__GSSIfaceUartProtocol__Group__14
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
    // InternalIFACE.g:3383:1: rule__GSSIfaceUartProtocol__Group__13__Impl : ( ( rule__GSSIfaceUartProtocol__SyncPatternAssignment_13 )? ) ;
    public final void rule__GSSIfaceUartProtocol__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3387:1: ( ( ( rule__GSSIfaceUartProtocol__SyncPatternAssignment_13 )? ) )
            // InternalIFACE.g:3388:1: ( ( rule__GSSIfaceUartProtocol__SyncPatternAssignment_13 )? )
            {
            // InternalIFACE.g:3388:1: ( ( rule__GSSIfaceUartProtocol__SyncPatternAssignment_13 )? )
            // InternalIFACE.g:3389:2: ( rule__GSSIfaceUartProtocol__SyncPatternAssignment_13 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getSyncPatternAssignment_13()); 
            }
            // InternalIFACE.g:3390:2: ( rule__GSSIfaceUartProtocol__SyncPatternAssignment_13 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==60) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalIFACE.g:3390:3: rule__GSSIfaceUartProtocol__SyncPatternAssignment_13
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
    // InternalIFACE.g:3398:1: rule__GSSIfaceUartProtocol__Group__14 : rule__GSSIfaceUartProtocol__Group__14__Impl rule__GSSIfaceUartProtocol__Group__15 ;
    public final void rule__GSSIfaceUartProtocol__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3402:1: ( rule__GSSIfaceUartProtocol__Group__14__Impl rule__GSSIfaceUartProtocol__Group__15 )
            // InternalIFACE.g:3403:2: rule__GSSIfaceUartProtocol__Group__14__Impl rule__GSSIfaceUartProtocol__Group__15
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
    // InternalIFACE.g:3410:1: rule__GSSIfaceUartProtocol__Group__14__Impl : ( '}' ) ;
    public final void rule__GSSIfaceUartProtocol__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3414:1: ( ( '}' ) )
            // InternalIFACE.g:3415:1: ( '}' )
            {
            // InternalIFACE.g:3415:1: ( '}' )
            // InternalIFACE.g:3416:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getRightCurlyBracketKeyword_14()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3425:1: rule__GSSIfaceUartProtocol__Group__15 : rule__GSSIfaceUartProtocol__Group__15__Impl ;
    public final void rule__GSSIfaceUartProtocol__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3429:1: ( rule__GSSIfaceUartProtocol__Group__15__Impl )
            // InternalIFACE.g:3430:2: rule__GSSIfaceUartProtocol__Group__15__Impl
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
    // InternalIFACE.g:3436:1: rule__GSSIfaceUartProtocol__Group__15__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartProtocol__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3440:1: ( ( ';' ) )
            // InternalIFACE.g:3441:1: ( ';' )
            {
            // InternalIFACE.g:3441:1: ( ';' )
            // InternalIFACE.g:3442:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_15()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3452:1: rule__GSSIfaceConstSize__Group__0 : rule__GSSIfaceConstSize__Group__0__Impl rule__GSSIfaceConstSize__Group__1 ;
    public final void rule__GSSIfaceConstSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3456:1: ( rule__GSSIfaceConstSize__Group__0__Impl rule__GSSIfaceConstSize__Group__1 )
            // InternalIFACE.g:3457:2: rule__GSSIfaceConstSize__Group__0__Impl rule__GSSIfaceConstSize__Group__1
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
    // InternalIFACE.g:3464:1: rule__GSSIfaceConstSize__Group__0__Impl : ( 'constSize' ) ;
    public final void rule__GSSIfaceConstSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3468:1: ( ( 'constSize' ) )
            // InternalIFACE.g:3469:1: ( 'constSize' )
            {
            // InternalIFACE.g:3469:1: ( 'constSize' )
            // InternalIFACE.g:3470:2: 'constSize'
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
    // InternalIFACE.g:3479:1: rule__GSSIfaceConstSize__Group__1 : rule__GSSIfaceConstSize__Group__1__Impl rule__GSSIfaceConstSize__Group__2 ;
    public final void rule__GSSIfaceConstSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3483:1: ( rule__GSSIfaceConstSize__Group__1__Impl rule__GSSIfaceConstSize__Group__2 )
            // InternalIFACE.g:3484:2: rule__GSSIfaceConstSize__Group__1__Impl rule__GSSIfaceConstSize__Group__2
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
    // InternalIFACE.g:3491:1: rule__GSSIfaceConstSize__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceConstSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3495:1: ( ( '{' ) )
            // InternalIFACE.g:3496:1: ( '{' )
            {
            // InternalIFACE.g:3496:1: ( '{' )
            // InternalIFACE.g:3497:2: '{'
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
    // InternalIFACE.g:3506:1: rule__GSSIfaceConstSize__Group__2 : rule__GSSIfaceConstSize__Group__2__Impl rule__GSSIfaceConstSize__Group__3 ;
    public final void rule__GSSIfaceConstSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3510:1: ( rule__GSSIfaceConstSize__Group__2__Impl rule__GSSIfaceConstSize__Group__3 )
            // InternalIFACE.g:3511:2: rule__GSSIfaceConstSize__Group__2__Impl rule__GSSIfaceConstSize__Group__3
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
    // InternalIFACE.g:3518:1: rule__GSSIfaceConstSize__Group__2__Impl : ( 'bytes' ) ;
    public final void rule__GSSIfaceConstSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3522:1: ( ( 'bytes' ) )
            // InternalIFACE.g:3523:1: ( 'bytes' )
            {
            // InternalIFACE.g:3523:1: ( 'bytes' )
            // InternalIFACE.g:3524:2: 'bytes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getBytesKeyword_2()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3533:1: rule__GSSIfaceConstSize__Group__3 : rule__GSSIfaceConstSize__Group__3__Impl rule__GSSIfaceConstSize__Group__4 ;
    public final void rule__GSSIfaceConstSize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3537:1: ( rule__GSSIfaceConstSize__Group__3__Impl rule__GSSIfaceConstSize__Group__4 )
            // InternalIFACE.g:3538:2: rule__GSSIfaceConstSize__Group__3__Impl rule__GSSIfaceConstSize__Group__4
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
    // InternalIFACE.g:3545:1: rule__GSSIfaceConstSize__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceConstSize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3549:1: ( ( ':=' ) )
            // InternalIFACE.g:3550:1: ( ':=' )
            {
            // InternalIFACE.g:3550:1: ( ':=' )
            // InternalIFACE.g:3551:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3560:1: rule__GSSIfaceConstSize__Group__4 : rule__GSSIfaceConstSize__Group__4__Impl rule__GSSIfaceConstSize__Group__5 ;
    public final void rule__GSSIfaceConstSize__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3564:1: ( rule__GSSIfaceConstSize__Group__4__Impl rule__GSSIfaceConstSize__Group__5 )
            // InternalIFACE.g:3565:2: rule__GSSIfaceConstSize__Group__4__Impl rule__GSSIfaceConstSize__Group__5
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
    // InternalIFACE.g:3572:1: rule__GSSIfaceConstSize__Group__4__Impl : ( ( rule__GSSIfaceConstSize__BytesAssignment_4 ) ) ;
    public final void rule__GSSIfaceConstSize__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3576:1: ( ( ( rule__GSSIfaceConstSize__BytesAssignment_4 ) ) )
            // InternalIFACE.g:3577:1: ( ( rule__GSSIfaceConstSize__BytesAssignment_4 ) )
            {
            // InternalIFACE.g:3577:1: ( ( rule__GSSIfaceConstSize__BytesAssignment_4 ) )
            // InternalIFACE.g:3578:2: ( rule__GSSIfaceConstSize__BytesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getBytesAssignment_4()); 
            }
            // InternalIFACE.g:3579:2: ( rule__GSSIfaceConstSize__BytesAssignment_4 )
            // InternalIFACE.g:3579:3: rule__GSSIfaceConstSize__BytesAssignment_4
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
    // InternalIFACE.g:3587:1: rule__GSSIfaceConstSize__Group__5 : rule__GSSIfaceConstSize__Group__5__Impl rule__GSSIfaceConstSize__Group__6 ;
    public final void rule__GSSIfaceConstSize__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3591:1: ( rule__GSSIfaceConstSize__Group__5__Impl rule__GSSIfaceConstSize__Group__6 )
            // InternalIFACE.g:3592:2: rule__GSSIfaceConstSize__Group__5__Impl rule__GSSIfaceConstSize__Group__6
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
    // InternalIFACE.g:3599:1: rule__GSSIfaceConstSize__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceConstSize__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3603:1: ( ( ';' ) )
            // InternalIFACE.g:3604:1: ( ';' )
            {
            // InternalIFACE.g:3604:1: ( ';' )
            // InternalIFACE.g:3605:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_5()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3614:1: rule__GSSIfaceConstSize__Group__6 : rule__GSSIfaceConstSize__Group__6__Impl rule__GSSIfaceConstSize__Group__7 ;
    public final void rule__GSSIfaceConstSize__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3618:1: ( rule__GSSIfaceConstSize__Group__6__Impl rule__GSSIfaceConstSize__Group__7 )
            // InternalIFACE.g:3619:2: rule__GSSIfaceConstSize__Group__6__Impl rule__GSSIfaceConstSize__Group__7
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
    // InternalIFACE.g:3626:1: rule__GSSIfaceConstSize__Group__6__Impl : ( 'bits' ) ;
    public final void rule__GSSIfaceConstSize__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3630:1: ( ( 'bits' ) )
            // InternalIFACE.g:3631:1: ( 'bits' )
            {
            // InternalIFACE.g:3631:1: ( 'bits' )
            // InternalIFACE.g:3632:2: 'bits'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getBitsKeyword_6()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3641:1: rule__GSSIfaceConstSize__Group__7 : rule__GSSIfaceConstSize__Group__7__Impl rule__GSSIfaceConstSize__Group__8 ;
    public final void rule__GSSIfaceConstSize__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3645:1: ( rule__GSSIfaceConstSize__Group__7__Impl rule__GSSIfaceConstSize__Group__8 )
            // InternalIFACE.g:3646:2: rule__GSSIfaceConstSize__Group__7__Impl rule__GSSIfaceConstSize__Group__8
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
    // InternalIFACE.g:3653:1: rule__GSSIfaceConstSize__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceConstSize__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3657:1: ( ( ':=' ) )
            // InternalIFACE.g:3658:1: ( ':=' )
            {
            // InternalIFACE.g:3658:1: ( ':=' )
            // InternalIFACE.g:3659:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3668:1: rule__GSSIfaceConstSize__Group__8 : rule__GSSIfaceConstSize__Group__8__Impl rule__GSSIfaceConstSize__Group__9 ;
    public final void rule__GSSIfaceConstSize__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3672:1: ( rule__GSSIfaceConstSize__Group__8__Impl rule__GSSIfaceConstSize__Group__9 )
            // InternalIFACE.g:3673:2: rule__GSSIfaceConstSize__Group__8__Impl rule__GSSIfaceConstSize__Group__9
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
    // InternalIFACE.g:3680:1: rule__GSSIfaceConstSize__Group__8__Impl : ( ( rule__GSSIfaceConstSize__BitsAssignment_8 ) ) ;
    public final void rule__GSSIfaceConstSize__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3684:1: ( ( ( rule__GSSIfaceConstSize__BitsAssignment_8 ) ) )
            // InternalIFACE.g:3685:1: ( ( rule__GSSIfaceConstSize__BitsAssignment_8 ) )
            {
            // InternalIFACE.g:3685:1: ( ( rule__GSSIfaceConstSize__BitsAssignment_8 ) )
            // InternalIFACE.g:3686:2: ( rule__GSSIfaceConstSize__BitsAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getBitsAssignment_8()); 
            }
            // InternalIFACE.g:3687:2: ( rule__GSSIfaceConstSize__BitsAssignment_8 )
            // InternalIFACE.g:3687:3: rule__GSSIfaceConstSize__BitsAssignment_8
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
    // InternalIFACE.g:3695:1: rule__GSSIfaceConstSize__Group__9 : rule__GSSIfaceConstSize__Group__9__Impl rule__GSSIfaceConstSize__Group__10 ;
    public final void rule__GSSIfaceConstSize__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3699:1: ( rule__GSSIfaceConstSize__Group__9__Impl rule__GSSIfaceConstSize__Group__10 )
            // InternalIFACE.g:3700:2: rule__GSSIfaceConstSize__Group__9__Impl rule__GSSIfaceConstSize__Group__10
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
    // InternalIFACE.g:3707:1: rule__GSSIfaceConstSize__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSIfaceConstSize__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3711:1: ( ( ';' ) )
            // InternalIFACE.g:3712:1: ( ';' )
            {
            // InternalIFACE.g:3712:1: ( ';' )
            // InternalIFACE.g:3713:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_9()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3722:1: rule__GSSIfaceConstSize__Group__10 : rule__GSSIfaceConstSize__Group__10__Impl rule__GSSIfaceConstSize__Group__11 ;
    public final void rule__GSSIfaceConstSize__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3726:1: ( rule__GSSIfaceConstSize__Group__10__Impl rule__GSSIfaceConstSize__Group__11 )
            // InternalIFACE.g:3727:2: rule__GSSIfaceConstSize__Group__10__Impl rule__GSSIfaceConstSize__Group__11
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
    // InternalIFACE.g:3734:1: rule__GSSIfaceConstSize__Group__10__Impl : ( '}' ) ;
    public final void rule__GSSIfaceConstSize__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3738:1: ( ( '}' ) )
            // InternalIFACE.g:3739:1: ( '}' )
            {
            // InternalIFACE.g:3739:1: ( '}' )
            // InternalIFACE.g:3740:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getRightCurlyBracketKeyword_10()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3749:1: rule__GSSIfaceConstSize__Group__11 : rule__GSSIfaceConstSize__Group__11__Impl ;
    public final void rule__GSSIfaceConstSize__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3753:1: ( rule__GSSIfaceConstSize__Group__11__Impl )
            // InternalIFACE.g:3754:2: rule__GSSIfaceConstSize__Group__11__Impl
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
    // InternalIFACE.g:3760:1: rule__GSSIfaceConstSize__Group__11__Impl : ( ';' ) ;
    public final void rule__GSSIfaceConstSize__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3764:1: ( ( ';' ) )
            // InternalIFACE.g:3765:1: ( ';' )
            {
            // InternalIFACE.g:3765:1: ( ';' )
            // InternalIFACE.g:3766:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_11()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3776:1: rule__GSSIfaceSizeFieldOffset__Group__0 : rule__GSSIfaceSizeFieldOffset__Group__0__Impl rule__GSSIfaceSizeFieldOffset__Group__1 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3780:1: ( rule__GSSIfaceSizeFieldOffset__Group__0__Impl rule__GSSIfaceSizeFieldOffset__Group__1 )
            // InternalIFACE.g:3781:2: rule__GSSIfaceSizeFieldOffset__Group__0__Impl rule__GSSIfaceSizeFieldOffset__Group__1
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
    // InternalIFACE.g:3788:1: rule__GSSIfaceSizeFieldOffset__Group__0__Impl : ( 'sizeFieldOffset' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3792:1: ( ( 'sizeFieldOffset' ) )
            // InternalIFACE.g:3793:1: ( 'sizeFieldOffset' )
            {
            // InternalIFACE.g:3793:1: ( 'sizeFieldOffset' )
            // InternalIFACE.g:3794:2: 'sizeFieldOffset'
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
    // InternalIFACE.g:3803:1: rule__GSSIfaceSizeFieldOffset__Group__1 : rule__GSSIfaceSizeFieldOffset__Group__1__Impl rule__GSSIfaceSizeFieldOffset__Group__2 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3807:1: ( rule__GSSIfaceSizeFieldOffset__Group__1__Impl rule__GSSIfaceSizeFieldOffset__Group__2 )
            // InternalIFACE.g:3808:2: rule__GSSIfaceSizeFieldOffset__Group__1__Impl rule__GSSIfaceSizeFieldOffset__Group__2
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
    // InternalIFACE.g:3815:1: rule__GSSIfaceSizeFieldOffset__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3819:1: ( ( '{' ) )
            // InternalIFACE.g:3820:1: ( '{' )
            {
            // InternalIFACE.g:3820:1: ( '{' )
            // InternalIFACE.g:3821:2: '{'
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
    // InternalIFACE.g:3830:1: rule__GSSIfaceSizeFieldOffset__Group__2 : rule__GSSIfaceSizeFieldOffset__Group__2__Impl rule__GSSIfaceSizeFieldOffset__Group__3 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3834:1: ( rule__GSSIfaceSizeFieldOffset__Group__2__Impl rule__GSSIfaceSizeFieldOffset__Group__3 )
            // InternalIFACE.g:3835:2: rule__GSSIfaceSizeFieldOffset__Group__2__Impl rule__GSSIfaceSizeFieldOffset__Group__3
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
    // InternalIFACE.g:3842:1: rule__GSSIfaceSizeFieldOffset__Group__2__Impl : ( 'bytes' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3846:1: ( ( 'bytes' ) )
            // InternalIFACE.g:3847:1: ( 'bytes' )
            {
            // InternalIFACE.g:3847:1: ( 'bytes' )
            // InternalIFACE.g:3848:2: 'bytes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesKeyword_2()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3857:1: rule__GSSIfaceSizeFieldOffset__Group__3 : rule__GSSIfaceSizeFieldOffset__Group__3__Impl rule__GSSIfaceSizeFieldOffset__Group__4 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3861:1: ( rule__GSSIfaceSizeFieldOffset__Group__3__Impl rule__GSSIfaceSizeFieldOffset__Group__4 )
            // InternalIFACE.g:3862:2: rule__GSSIfaceSizeFieldOffset__Group__3__Impl rule__GSSIfaceSizeFieldOffset__Group__4
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
    // InternalIFACE.g:3869:1: rule__GSSIfaceSizeFieldOffset__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3873:1: ( ( ':=' ) )
            // InternalIFACE.g:3874:1: ( ':=' )
            {
            // InternalIFACE.g:3874:1: ( ':=' )
            // InternalIFACE.g:3875:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3884:1: rule__GSSIfaceSizeFieldOffset__Group__4 : rule__GSSIfaceSizeFieldOffset__Group__4__Impl rule__GSSIfaceSizeFieldOffset__Group__5 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3888:1: ( rule__GSSIfaceSizeFieldOffset__Group__4__Impl rule__GSSIfaceSizeFieldOffset__Group__5 )
            // InternalIFACE.g:3889:2: rule__GSSIfaceSizeFieldOffset__Group__4__Impl rule__GSSIfaceSizeFieldOffset__Group__5
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
    // InternalIFACE.g:3896:1: rule__GSSIfaceSizeFieldOffset__Group__4__Impl : ( ( rule__GSSIfaceSizeFieldOffset__BytesAssignment_4 ) ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3900:1: ( ( ( rule__GSSIfaceSizeFieldOffset__BytesAssignment_4 ) ) )
            // InternalIFACE.g:3901:1: ( ( rule__GSSIfaceSizeFieldOffset__BytesAssignment_4 ) )
            {
            // InternalIFACE.g:3901:1: ( ( rule__GSSIfaceSizeFieldOffset__BytesAssignment_4 ) )
            // InternalIFACE.g:3902:2: ( rule__GSSIfaceSizeFieldOffset__BytesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesAssignment_4()); 
            }
            // InternalIFACE.g:3903:2: ( rule__GSSIfaceSizeFieldOffset__BytesAssignment_4 )
            // InternalIFACE.g:3903:3: rule__GSSIfaceSizeFieldOffset__BytesAssignment_4
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
    // InternalIFACE.g:3911:1: rule__GSSIfaceSizeFieldOffset__Group__5 : rule__GSSIfaceSizeFieldOffset__Group__5__Impl rule__GSSIfaceSizeFieldOffset__Group__6 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3915:1: ( rule__GSSIfaceSizeFieldOffset__Group__5__Impl rule__GSSIfaceSizeFieldOffset__Group__6 )
            // InternalIFACE.g:3916:2: rule__GSSIfaceSizeFieldOffset__Group__5__Impl rule__GSSIfaceSizeFieldOffset__Group__6
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
    // InternalIFACE.g:3923:1: rule__GSSIfaceSizeFieldOffset__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3927:1: ( ( ';' ) )
            // InternalIFACE.g:3928:1: ( ';' )
            {
            // InternalIFACE.g:3928:1: ( ';' )
            // InternalIFACE.g:3929:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_5()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3938:1: rule__GSSIfaceSizeFieldOffset__Group__6 : rule__GSSIfaceSizeFieldOffset__Group__6__Impl rule__GSSIfaceSizeFieldOffset__Group__7 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3942:1: ( rule__GSSIfaceSizeFieldOffset__Group__6__Impl rule__GSSIfaceSizeFieldOffset__Group__7 )
            // InternalIFACE.g:3943:2: rule__GSSIfaceSizeFieldOffset__Group__6__Impl rule__GSSIfaceSizeFieldOffset__Group__7
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
    // InternalIFACE.g:3950:1: rule__GSSIfaceSizeFieldOffset__Group__6__Impl : ( 'bits' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3954:1: ( ( 'bits' ) )
            // InternalIFACE.g:3955:1: ( 'bits' )
            {
            // InternalIFACE.g:3955:1: ( 'bits' )
            // InternalIFACE.g:3956:2: 'bits'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsKeyword_6()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3965:1: rule__GSSIfaceSizeFieldOffset__Group__7 : rule__GSSIfaceSizeFieldOffset__Group__7__Impl rule__GSSIfaceSizeFieldOffset__Group__8 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3969:1: ( rule__GSSIfaceSizeFieldOffset__Group__7__Impl rule__GSSIfaceSizeFieldOffset__Group__8 )
            // InternalIFACE.g:3970:2: rule__GSSIfaceSizeFieldOffset__Group__7__Impl rule__GSSIfaceSizeFieldOffset__Group__8
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
    // InternalIFACE.g:3977:1: rule__GSSIfaceSizeFieldOffset__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3981:1: ( ( ':=' ) )
            // InternalIFACE.g:3982:1: ( ':=' )
            {
            // InternalIFACE.g:3982:1: ( ':=' )
            // InternalIFACE.g:3983:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:3992:1: rule__GSSIfaceSizeFieldOffset__Group__8 : rule__GSSIfaceSizeFieldOffset__Group__8__Impl rule__GSSIfaceSizeFieldOffset__Group__9 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3996:1: ( rule__GSSIfaceSizeFieldOffset__Group__8__Impl rule__GSSIfaceSizeFieldOffset__Group__9 )
            // InternalIFACE.g:3997:2: rule__GSSIfaceSizeFieldOffset__Group__8__Impl rule__GSSIfaceSizeFieldOffset__Group__9
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
    // InternalIFACE.g:4004:1: rule__GSSIfaceSizeFieldOffset__Group__8__Impl : ( ( rule__GSSIfaceSizeFieldOffset__BitsAssignment_8 ) ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4008:1: ( ( ( rule__GSSIfaceSizeFieldOffset__BitsAssignment_8 ) ) )
            // InternalIFACE.g:4009:1: ( ( rule__GSSIfaceSizeFieldOffset__BitsAssignment_8 ) )
            {
            // InternalIFACE.g:4009:1: ( ( rule__GSSIfaceSizeFieldOffset__BitsAssignment_8 ) )
            // InternalIFACE.g:4010:2: ( rule__GSSIfaceSizeFieldOffset__BitsAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsAssignment_8()); 
            }
            // InternalIFACE.g:4011:2: ( rule__GSSIfaceSizeFieldOffset__BitsAssignment_8 )
            // InternalIFACE.g:4011:3: rule__GSSIfaceSizeFieldOffset__BitsAssignment_8
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
    // InternalIFACE.g:4019:1: rule__GSSIfaceSizeFieldOffset__Group__9 : rule__GSSIfaceSizeFieldOffset__Group__9__Impl rule__GSSIfaceSizeFieldOffset__Group__10 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4023:1: ( rule__GSSIfaceSizeFieldOffset__Group__9__Impl rule__GSSIfaceSizeFieldOffset__Group__10 )
            // InternalIFACE.g:4024:2: rule__GSSIfaceSizeFieldOffset__Group__9__Impl rule__GSSIfaceSizeFieldOffset__Group__10
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
    // InternalIFACE.g:4031:1: rule__GSSIfaceSizeFieldOffset__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4035:1: ( ( ';' ) )
            // InternalIFACE.g:4036:1: ( ';' )
            {
            // InternalIFACE.g:4036:1: ( ';' )
            // InternalIFACE.g:4037:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_9()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4046:1: rule__GSSIfaceSizeFieldOffset__Group__10 : rule__GSSIfaceSizeFieldOffset__Group__10__Impl rule__GSSIfaceSizeFieldOffset__Group__11 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4050:1: ( rule__GSSIfaceSizeFieldOffset__Group__10__Impl rule__GSSIfaceSizeFieldOffset__Group__11 )
            // InternalIFACE.g:4051:2: rule__GSSIfaceSizeFieldOffset__Group__10__Impl rule__GSSIfaceSizeFieldOffset__Group__11
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
    // InternalIFACE.g:4058:1: rule__GSSIfaceSizeFieldOffset__Group__10__Impl : ( '}' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4062:1: ( ( '}' ) )
            // InternalIFACE.g:4063:1: ( '}' )
            {
            // InternalIFACE.g:4063:1: ( '}' )
            // InternalIFACE.g:4064:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getRightCurlyBracketKeyword_10()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4073:1: rule__GSSIfaceSizeFieldOffset__Group__11 : rule__GSSIfaceSizeFieldOffset__Group__11__Impl ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4077:1: ( rule__GSSIfaceSizeFieldOffset__Group__11__Impl )
            // InternalIFACE.g:4078:2: rule__GSSIfaceSizeFieldOffset__Group__11__Impl
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
    // InternalIFACE.g:4084:1: rule__GSSIfaceSizeFieldOffset__Group__11__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4088:1: ( ( ';' ) )
            // InternalIFACE.g:4089:1: ( ';' )
            {
            // InternalIFACE.g:4089:1: ( ';' )
            // InternalIFACE.g:4090:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_11()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4100:1: rule__GSSIfaceSizeFieldTrim__Group__0 : rule__GSSIfaceSizeFieldTrim__Group__0__Impl rule__GSSIfaceSizeFieldTrim__Group__1 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4104:1: ( rule__GSSIfaceSizeFieldTrim__Group__0__Impl rule__GSSIfaceSizeFieldTrim__Group__1 )
            // InternalIFACE.g:4105:2: rule__GSSIfaceSizeFieldTrim__Group__0__Impl rule__GSSIfaceSizeFieldTrim__Group__1
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
    // InternalIFACE.g:4112:1: rule__GSSIfaceSizeFieldTrim__Group__0__Impl : ( 'sizeFieldTrim' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4116:1: ( ( 'sizeFieldTrim' ) )
            // InternalIFACE.g:4117:1: ( 'sizeFieldTrim' )
            {
            // InternalIFACE.g:4117:1: ( 'sizeFieldTrim' )
            // InternalIFACE.g:4118:2: 'sizeFieldTrim'
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
    // InternalIFACE.g:4127:1: rule__GSSIfaceSizeFieldTrim__Group__1 : rule__GSSIfaceSizeFieldTrim__Group__1__Impl rule__GSSIfaceSizeFieldTrim__Group__2 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4131:1: ( rule__GSSIfaceSizeFieldTrim__Group__1__Impl rule__GSSIfaceSizeFieldTrim__Group__2 )
            // InternalIFACE.g:4132:2: rule__GSSIfaceSizeFieldTrim__Group__1__Impl rule__GSSIfaceSizeFieldTrim__Group__2
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
    // InternalIFACE.g:4139:1: rule__GSSIfaceSizeFieldTrim__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4143:1: ( ( '{' ) )
            // InternalIFACE.g:4144:1: ( '{' )
            {
            // InternalIFACE.g:4144:1: ( '{' )
            // InternalIFACE.g:4145:2: '{'
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
    // InternalIFACE.g:4154:1: rule__GSSIfaceSizeFieldTrim__Group__2 : rule__GSSIfaceSizeFieldTrim__Group__2__Impl rule__GSSIfaceSizeFieldTrim__Group__3 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4158:1: ( rule__GSSIfaceSizeFieldTrim__Group__2__Impl rule__GSSIfaceSizeFieldTrim__Group__3 )
            // InternalIFACE.g:4159:2: rule__GSSIfaceSizeFieldTrim__Group__2__Impl rule__GSSIfaceSizeFieldTrim__Group__3
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
    // InternalIFACE.g:4166:1: rule__GSSIfaceSizeFieldTrim__Group__2__Impl : ( 'bytes' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4170:1: ( ( 'bytes' ) )
            // InternalIFACE.g:4171:1: ( 'bytes' )
            {
            // InternalIFACE.g:4171:1: ( 'bytes' )
            // InternalIFACE.g:4172:2: 'bytes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesKeyword_2()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4181:1: rule__GSSIfaceSizeFieldTrim__Group__3 : rule__GSSIfaceSizeFieldTrim__Group__3__Impl rule__GSSIfaceSizeFieldTrim__Group__4 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4185:1: ( rule__GSSIfaceSizeFieldTrim__Group__3__Impl rule__GSSIfaceSizeFieldTrim__Group__4 )
            // InternalIFACE.g:4186:2: rule__GSSIfaceSizeFieldTrim__Group__3__Impl rule__GSSIfaceSizeFieldTrim__Group__4
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
    // InternalIFACE.g:4193:1: rule__GSSIfaceSizeFieldTrim__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4197:1: ( ( ':=' ) )
            // InternalIFACE.g:4198:1: ( ':=' )
            {
            // InternalIFACE.g:4198:1: ( ':=' )
            // InternalIFACE.g:4199:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4208:1: rule__GSSIfaceSizeFieldTrim__Group__4 : rule__GSSIfaceSizeFieldTrim__Group__4__Impl rule__GSSIfaceSizeFieldTrim__Group__5 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4212:1: ( rule__GSSIfaceSizeFieldTrim__Group__4__Impl rule__GSSIfaceSizeFieldTrim__Group__5 )
            // InternalIFACE.g:4213:2: rule__GSSIfaceSizeFieldTrim__Group__4__Impl rule__GSSIfaceSizeFieldTrim__Group__5
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
    // InternalIFACE.g:4220:1: rule__GSSIfaceSizeFieldTrim__Group__4__Impl : ( ( rule__GSSIfaceSizeFieldTrim__BytesAssignment_4 ) ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4224:1: ( ( ( rule__GSSIfaceSizeFieldTrim__BytesAssignment_4 ) ) )
            // InternalIFACE.g:4225:1: ( ( rule__GSSIfaceSizeFieldTrim__BytesAssignment_4 ) )
            {
            // InternalIFACE.g:4225:1: ( ( rule__GSSIfaceSizeFieldTrim__BytesAssignment_4 ) )
            // InternalIFACE.g:4226:2: ( rule__GSSIfaceSizeFieldTrim__BytesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesAssignment_4()); 
            }
            // InternalIFACE.g:4227:2: ( rule__GSSIfaceSizeFieldTrim__BytesAssignment_4 )
            // InternalIFACE.g:4227:3: rule__GSSIfaceSizeFieldTrim__BytesAssignment_4
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
    // InternalIFACE.g:4235:1: rule__GSSIfaceSizeFieldTrim__Group__5 : rule__GSSIfaceSizeFieldTrim__Group__5__Impl rule__GSSIfaceSizeFieldTrim__Group__6 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4239:1: ( rule__GSSIfaceSizeFieldTrim__Group__5__Impl rule__GSSIfaceSizeFieldTrim__Group__6 )
            // InternalIFACE.g:4240:2: rule__GSSIfaceSizeFieldTrim__Group__5__Impl rule__GSSIfaceSizeFieldTrim__Group__6
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
    // InternalIFACE.g:4247:1: rule__GSSIfaceSizeFieldTrim__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4251:1: ( ( ';' ) )
            // InternalIFACE.g:4252:1: ( ';' )
            {
            // InternalIFACE.g:4252:1: ( ';' )
            // InternalIFACE.g:4253:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_5()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4262:1: rule__GSSIfaceSizeFieldTrim__Group__6 : rule__GSSIfaceSizeFieldTrim__Group__6__Impl rule__GSSIfaceSizeFieldTrim__Group__7 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4266:1: ( rule__GSSIfaceSizeFieldTrim__Group__6__Impl rule__GSSIfaceSizeFieldTrim__Group__7 )
            // InternalIFACE.g:4267:2: rule__GSSIfaceSizeFieldTrim__Group__6__Impl rule__GSSIfaceSizeFieldTrim__Group__7
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
    // InternalIFACE.g:4274:1: rule__GSSIfaceSizeFieldTrim__Group__6__Impl : ( 'bits' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4278:1: ( ( 'bits' ) )
            // InternalIFACE.g:4279:1: ( 'bits' )
            {
            // InternalIFACE.g:4279:1: ( 'bits' )
            // InternalIFACE.g:4280:2: 'bits'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsKeyword_6()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4289:1: rule__GSSIfaceSizeFieldTrim__Group__7 : rule__GSSIfaceSizeFieldTrim__Group__7__Impl rule__GSSIfaceSizeFieldTrim__Group__8 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4293:1: ( rule__GSSIfaceSizeFieldTrim__Group__7__Impl rule__GSSIfaceSizeFieldTrim__Group__8 )
            // InternalIFACE.g:4294:2: rule__GSSIfaceSizeFieldTrim__Group__7__Impl rule__GSSIfaceSizeFieldTrim__Group__8
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
    // InternalIFACE.g:4301:1: rule__GSSIfaceSizeFieldTrim__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4305:1: ( ( ':=' ) )
            // InternalIFACE.g:4306:1: ( ':=' )
            {
            // InternalIFACE.g:4306:1: ( ':=' )
            // InternalIFACE.g:4307:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4316:1: rule__GSSIfaceSizeFieldTrim__Group__8 : rule__GSSIfaceSizeFieldTrim__Group__8__Impl rule__GSSIfaceSizeFieldTrim__Group__9 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4320:1: ( rule__GSSIfaceSizeFieldTrim__Group__8__Impl rule__GSSIfaceSizeFieldTrim__Group__9 )
            // InternalIFACE.g:4321:2: rule__GSSIfaceSizeFieldTrim__Group__8__Impl rule__GSSIfaceSizeFieldTrim__Group__9
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
    // InternalIFACE.g:4328:1: rule__GSSIfaceSizeFieldTrim__Group__8__Impl : ( ( rule__GSSIfaceSizeFieldTrim__BitsAssignment_8 ) ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4332:1: ( ( ( rule__GSSIfaceSizeFieldTrim__BitsAssignment_8 ) ) )
            // InternalIFACE.g:4333:1: ( ( rule__GSSIfaceSizeFieldTrim__BitsAssignment_8 ) )
            {
            // InternalIFACE.g:4333:1: ( ( rule__GSSIfaceSizeFieldTrim__BitsAssignment_8 ) )
            // InternalIFACE.g:4334:2: ( rule__GSSIfaceSizeFieldTrim__BitsAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsAssignment_8()); 
            }
            // InternalIFACE.g:4335:2: ( rule__GSSIfaceSizeFieldTrim__BitsAssignment_8 )
            // InternalIFACE.g:4335:3: rule__GSSIfaceSizeFieldTrim__BitsAssignment_8
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
    // InternalIFACE.g:4343:1: rule__GSSIfaceSizeFieldTrim__Group__9 : rule__GSSIfaceSizeFieldTrim__Group__9__Impl rule__GSSIfaceSizeFieldTrim__Group__10 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4347:1: ( rule__GSSIfaceSizeFieldTrim__Group__9__Impl rule__GSSIfaceSizeFieldTrim__Group__10 )
            // InternalIFACE.g:4348:2: rule__GSSIfaceSizeFieldTrim__Group__9__Impl rule__GSSIfaceSizeFieldTrim__Group__10
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
    // InternalIFACE.g:4355:1: rule__GSSIfaceSizeFieldTrim__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4359:1: ( ( ';' ) )
            // InternalIFACE.g:4360:1: ( ';' )
            {
            // InternalIFACE.g:4360:1: ( ';' )
            // InternalIFACE.g:4361:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_9()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4370:1: rule__GSSIfaceSizeFieldTrim__Group__10 : rule__GSSIfaceSizeFieldTrim__Group__10__Impl rule__GSSIfaceSizeFieldTrim__Group__11 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4374:1: ( rule__GSSIfaceSizeFieldTrim__Group__10__Impl rule__GSSIfaceSizeFieldTrim__Group__11 )
            // InternalIFACE.g:4375:2: rule__GSSIfaceSizeFieldTrim__Group__10__Impl rule__GSSIfaceSizeFieldTrim__Group__11
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
    // InternalIFACE.g:4382:1: rule__GSSIfaceSizeFieldTrim__Group__10__Impl : ( '}' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4386:1: ( ( '}' ) )
            // InternalIFACE.g:4387:1: ( '}' )
            {
            // InternalIFACE.g:4387:1: ( '}' )
            // InternalIFACE.g:4388:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getRightCurlyBracketKeyword_10()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4397:1: rule__GSSIfaceSizeFieldTrim__Group__11 : rule__GSSIfaceSizeFieldTrim__Group__11__Impl ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4401:1: ( rule__GSSIfaceSizeFieldTrim__Group__11__Impl )
            // InternalIFACE.g:4402:2: rule__GSSIfaceSizeFieldTrim__Group__11__Impl
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
    // InternalIFACE.g:4408:1: rule__GSSIfaceSizeFieldTrim__Group__11__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4412:1: ( ( ';' ) )
            // InternalIFACE.g:4413:1: ( ';' )
            {
            // InternalIFACE.g:4413:1: ( ';' )
            // InternalIFACE.g:4414:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_11()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4424:1: rule__GSSIfaceSyncPattern__Group__0 : rule__GSSIfaceSyncPattern__Group__0__Impl rule__GSSIfaceSyncPattern__Group__1 ;
    public final void rule__GSSIfaceSyncPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4428:1: ( rule__GSSIfaceSyncPattern__Group__0__Impl rule__GSSIfaceSyncPattern__Group__1 )
            // InternalIFACE.g:4429:2: rule__GSSIfaceSyncPattern__Group__0__Impl rule__GSSIfaceSyncPattern__Group__1
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
    // InternalIFACE.g:4436:1: rule__GSSIfaceSyncPattern__Group__0__Impl : ( 'syncPattern' ) ;
    public final void rule__GSSIfaceSyncPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4440:1: ( ( 'syncPattern' ) )
            // InternalIFACE.g:4441:1: ( 'syncPattern' )
            {
            // InternalIFACE.g:4441:1: ( 'syncPattern' )
            // InternalIFACE.g:4442:2: 'syncPattern'
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
    // InternalIFACE.g:4451:1: rule__GSSIfaceSyncPattern__Group__1 : rule__GSSIfaceSyncPattern__Group__1__Impl rule__GSSIfaceSyncPattern__Group__2 ;
    public final void rule__GSSIfaceSyncPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4455:1: ( rule__GSSIfaceSyncPattern__Group__1__Impl rule__GSSIfaceSyncPattern__Group__2 )
            // InternalIFACE.g:4456:2: rule__GSSIfaceSyncPattern__Group__1__Impl rule__GSSIfaceSyncPattern__Group__2
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
    // InternalIFACE.g:4463:1: rule__GSSIfaceSyncPattern__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceSyncPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4467:1: ( ( '{' ) )
            // InternalIFACE.g:4468:1: ( '{' )
            {
            // InternalIFACE.g:4468:1: ( '{' )
            // InternalIFACE.g:4469:2: '{'
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
    // InternalIFACE.g:4478:1: rule__GSSIfaceSyncPattern__Group__2 : rule__GSSIfaceSyncPattern__Group__2__Impl rule__GSSIfaceSyncPattern__Group__3 ;
    public final void rule__GSSIfaceSyncPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4482:1: ( rule__GSSIfaceSyncPattern__Group__2__Impl rule__GSSIfaceSyncPattern__Group__3 )
            // InternalIFACE.g:4483:2: rule__GSSIfaceSyncPattern__Group__2__Impl rule__GSSIfaceSyncPattern__Group__3
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
    // InternalIFACE.g:4490:1: rule__GSSIfaceSyncPattern__Group__2__Impl : ( 'hexValue' ) ;
    public final void rule__GSSIfaceSyncPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4494:1: ( ( 'hexValue' ) )
            // InternalIFACE.g:4495:1: ( 'hexValue' )
            {
            // InternalIFACE.g:4495:1: ( 'hexValue' )
            // InternalIFACE.g:4496:2: 'hexValue'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueKeyword_2()); 
            }
            match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4505:1: rule__GSSIfaceSyncPattern__Group__3 : rule__GSSIfaceSyncPattern__Group__3__Impl rule__GSSIfaceSyncPattern__Group__4 ;
    public final void rule__GSSIfaceSyncPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4509:1: ( rule__GSSIfaceSyncPattern__Group__3__Impl rule__GSSIfaceSyncPattern__Group__4 )
            // InternalIFACE.g:4510:2: rule__GSSIfaceSyncPattern__Group__3__Impl rule__GSSIfaceSyncPattern__Group__4
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
    // InternalIFACE.g:4517:1: rule__GSSIfaceSyncPattern__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSyncPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4521:1: ( ( ':=' ) )
            // InternalIFACE.g:4522:1: ( ':=' )
            {
            // InternalIFACE.g:4522:1: ( ':=' )
            // InternalIFACE.g:4523:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4532:1: rule__GSSIfaceSyncPattern__Group__4 : rule__GSSIfaceSyncPattern__Group__4__Impl rule__GSSIfaceSyncPattern__Group__5 ;
    public final void rule__GSSIfaceSyncPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4536:1: ( rule__GSSIfaceSyncPattern__Group__4__Impl rule__GSSIfaceSyncPattern__Group__5 )
            // InternalIFACE.g:4537:2: rule__GSSIfaceSyncPattern__Group__4__Impl rule__GSSIfaceSyncPattern__Group__5
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
    // InternalIFACE.g:4544:1: rule__GSSIfaceSyncPattern__Group__4__Impl : ( ( rule__GSSIfaceSyncPattern__HexValueAssignment_4 ) ) ;
    public final void rule__GSSIfaceSyncPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4548:1: ( ( ( rule__GSSIfaceSyncPattern__HexValueAssignment_4 ) ) )
            // InternalIFACE.g:4549:1: ( ( rule__GSSIfaceSyncPattern__HexValueAssignment_4 ) )
            {
            // InternalIFACE.g:4549:1: ( ( rule__GSSIfaceSyncPattern__HexValueAssignment_4 ) )
            // InternalIFACE.g:4550:2: ( rule__GSSIfaceSyncPattern__HexValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueAssignment_4()); 
            }
            // InternalIFACE.g:4551:2: ( rule__GSSIfaceSyncPattern__HexValueAssignment_4 )
            // InternalIFACE.g:4551:3: rule__GSSIfaceSyncPattern__HexValueAssignment_4
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
    // InternalIFACE.g:4559:1: rule__GSSIfaceSyncPattern__Group__5 : rule__GSSIfaceSyncPattern__Group__5__Impl rule__GSSIfaceSyncPattern__Group__6 ;
    public final void rule__GSSIfaceSyncPattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4563:1: ( rule__GSSIfaceSyncPattern__Group__5__Impl rule__GSSIfaceSyncPattern__Group__6 )
            // InternalIFACE.g:4564:2: rule__GSSIfaceSyncPattern__Group__5__Impl rule__GSSIfaceSyncPattern__Group__6
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
    // InternalIFACE.g:4571:1: rule__GSSIfaceSyncPattern__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSyncPattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4575:1: ( ( ';' ) )
            // InternalIFACE.g:4576:1: ( ';' )
            {
            // InternalIFACE.g:4576:1: ( ';' )
            // InternalIFACE.g:4577:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getSemicolonKeyword_5()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4586:1: rule__GSSIfaceSyncPattern__Group__6 : rule__GSSIfaceSyncPattern__Group__6__Impl rule__GSSIfaceSyncPattern__Group__7 ;
    public final void rule__GSSIfaceSyncPattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4590:1: ( rule__GSSIfaceSyncPattern__Group__6__Impl rule__GSSIfaceSyncPattern__Group__7 )
            // InternalIFACE.g:4591:2: rule__GSSIfaceSyncPattern__Group__6__Impl rule__GSSIfaceSyncPattern__Group__7
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
    // InternalIFACE.g:4598:1: rule__GSSIfaceSyncPattern__Group__6__Impl : ( '}' ) ;
    public final void rule__GSSIfaceSyncPattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4602:1: ( ( '}' ) )
            // InternalIFACE.g:4603:1: ( '}' )
            {
            // InternalIFACE.g:4603:1: ( '}' )
            // InternalIFACE.g:4604:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4613:1: rule__GSSIfaceSyncPattern__Group__7 : rule__GSSIfaceSyncPattern__Group__7__Impl ;
    public final void rule__GSSIfaceSyncPattern__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4617:1: ( rule__GSSIfaceSyncPattern__Group__7__Impl )
            // InternalIFACE.g:4618:2: rule__GSSIfaceSyncPattern__Group__7__Impl
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
    // InternalIFACE.g:4624:1: rule__GSSIfaceSyncPattern__Group__7__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSyncPattern__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4628:1: ( ( ';' ) )
            // InternalIFACE.g:4629:1: ( ';' )
            {
            // InternalIFACE.g:4629:1: ( ';' )
            // InternalIFACE.g:4630:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getSemicolonKeyword_7()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4640:1: rule__GSSIfaceSpWTCPort__Group__0 : rule__GSSIfaceSpWTCPort__Group__0__Impl rule__GSSIfaceSpWTCPort__Group__1 ;
    public final void rule__GSSIfaceSpWTCPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4644:1: ( rule__GSSIfaceSpWTCPort__Group__0__Impl rule__GSSIfaceSpWTCPort__Group__1 )
            // InternalIFACE.g:4645:2: rule__GSSIfaceSpWTCPort__Group__0__Impl rule__GSSIfaceSpWTCPort__Group__1
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
    // InternalIFACE.g:4652:1: rule__GSSIfaceSpWTCPort__Group__0__Impl : ( 'spwTCPort' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4656:1: ( ( 'spwTCPort' ) )
            // InternalIFACE.g:4657:1: ( 'spwTCPort' )
            {
            // InternalIFACE.g:4657:1: ( 'spwTCPort' )
            // InternalIFACE.g:4658:2: 'spwTCPort'
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
    // InternalIFACE.g:4667:1: rule__GSSIfaceSpWTCPort__Group__1 : rule__GSSIfaceSpWTCPort__Group__1__Impl rule__GSSIfaceSpWTCPort__Group__2 ;
    public final void rule__GSSIfaceSpWTCPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4671:1: ( rule__GSSIfaceSpWTCPort__Group__1__Impl rule__GSSIfaceSpWTCPort__Group__2 )
            // InternalIFACE.g:4672:2: rule__GSSIfaceSpWTCPort__Group__1__Impl rule__GSSIfaceSpWTCPort__Group__2
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
    // InternalIFACE.g:4679:1: rule__GSSIfaceSpWTCPort__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4683:1: ( ( '{' ) )
            // InternalIFACE.g:4684:1: ( '{' )
            {
            // InternalIFACE.g:4684:1: ( '{' )
            // InternalIFACE.g:4685:2: '{'
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
    // InternalIFACE.g:4694:1: rule__GSSIfaceSpWTCPort__Group__2 : rule__GSSIfaceSpWTCPort__Group__2__Impl rule__GSSIfaceSpWTCPort__Group__3 ;
    public final void rule__GSSIfaceSpWTCPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4698:1: ( rule__GSSIfaceSpWTCPort__Group__2__Impl rule__GSSIfaceSpWTCPort__Group__3 )
            // InternalIFACE.g:4699:2: rule__GSSIfaceSpWTCPort__Group__2__Impl rule__GSSIfaceSpWTCPort__Group__3
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
    // InternalIFACE.g:4706:1: rule__GSSIfaceSpWTCPort__Group__2__Impl : ( 'spwPortRef' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4710:1: ( ( 'spwPortRef' ) )
            // InternalIFACE.g:4711:1: ( 'spwPortRef' )
            {
            // InternalIFACE.g:4711:1: ( 'spwPortRef' )
            // InternalIFACE.g:4712:2: 'spwPortRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefKeyword_2()); 
            }
            match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4721:1: rule__GSSIfaceSpWTCPort__Group__3 : rule__GSSIfaceSpWTCPort__Group__3__Impl rule__GSSIfaceSpWTCPort__Group__4 ;
    public final void rule__GSSIfaceSpWTCPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4725:1: ( rule__GSSIfaceSpWTCPort__Group__3__Impl rule__GSSIfaceSpWTCPort__Group__4 )
            // InternalIFACE.g:4726:2: rule__GSSIfaceSpWTCPort__Group__3__Impl rule__GSSIfaceSpWTCPort__Group__4
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
    // InternalIFACE.g:4733:1: rule__GSSIfaceSpWTCPort__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4737:1: ( ( ':=' ) )
            // InternalIFACE.g:4738:1: ( ':=' )
            {
            // InternalIFACE.g:4738:1: ( ':=' )
            // InternalIFACE.g:4739:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4748:1: rule__GSSIfaceSpWTCPort__Group__4 : rule__GSSIfaceSpWTCPort__Group__4__Impl rule__GSSIfaceSpWTCPort__Group__5 ;
    public final void rule__GSSIfaceSpWTCPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4752:1: ( rule__GSSIfaceSpWTCPort__Group__4__Impl rule__GSSIfaceSpWTCPort__Group__5 )
            // InternalIFACE.g:4753:2: rule__GSSIfaceSpWTCPort__Group__4__Impl rule__GSSIfaceSpWTCPort__Group__5
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
    // InternalIFACE.g:4760:1: rule__GSSIfaceSpWTCPort__Group__4__Impl : ( ( rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4 ) ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4764:1: ( ( ( rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4 ) ) )
            // InternalIFACE.g:4765:1: ( ( rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4 ) )
            {
            // InternalIFACE.g:4765:1: ( ( rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4 ) )
            // InternalIFACE.g:4766:2: ( rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefAssignment_4()); 
            }
            // InternalIFACE.g:4767:2: ( rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4 )
            // InternalIFACE.g:4767:3: rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4
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
    // InternalIFACE.g:4775:1: rule__GSSIfaceSpWTCPort__Group__5 : rule__GSSIfaceSpWTCPort__Group__5__Impl rule__GSSIfaceSpWTCPort__Group__6 ;
    public final void rule__GSSIfaceSpWTCPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4779:1: ( rule__GSSIfaceSpWTCPort__Group__5__Impl rule__GSSIfaceSpWTCPort__Group__6 )
            // InternalIFACE.g:4780:2: rule__GSSIfaceSpWTCPort__Group__5__Impl rule__GSSIfaceSpWTCPort__Group__6
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
    // InternalIFACE.g:4787:1: rule__GSSIfaceSpWTCPort__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4791:1: ( ( ';' ) )
            // InternalIFACE.g:4792:1: ( ';' )
            {
            // InternalIFACE.g:4792:1: ( ';' )
            // InternalIFACE.g:4793:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSemicolonKeyword_5()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4802:1: rule__GSSIfaceSpWTCPort__Group__6 : rule__GSSIfaceSpWTCPort__Group__6__Impl rule__GSSIfaceSpWTCPort__Group__7 ;
    public final void rule__GSSIfaceSpWTCPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4806:1: ( rule__GSSIfaceSpWTCPort__Group__6__Impl rule__GSSIfaceSpWTCPort__Group__7 )
            // InternalIFACE.g:4807:2: rule__GSSIfaceSpWTCPort__Group__6__Impl rule__GSSIfaceSpWTCPort__Group__7
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
    // InternalIFACE.g:4814:1: rule__GSSIfaceSpWTCPort__Group__6__Impl : ( '}' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4818:1: ( ( '}' ) )
            // InternalIFACE.g:4819:1: ( '}' )
            {
            // InternalIFACE.g:4819:1: ( '}' )
            // InternalIFACE.g:4820:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4829:1: rule__GSSIfaceSpWTCPort__Group__7 : rule__GSSIfaceSpWTCPort__Group__7__Impl ;
    public final void rule__GSSIfaceSpWTCPort__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4833:1: ( rule__GSSIfaceSpWTCPort__Group__7__Impl )
            // InternalIFACE.g:4834:2: rule__GSSIfaceSpWTCPort__Group__7__Impl
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
    // InternalIFACE.g:4840:1: rule__GSSIfaceSpWTCPort__Group__7__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4844:1: ( ( ';' ) )
            // InternalIFACE.g:4845:1: ( ';' )
            {
            // InternalIFACE.g:4845:1: ( ';' )
            // InternalIFACE.g:4846:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSemicolonKeyword_7()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4856:1: rule__GSSIfaceDummyPort__Group__0 : rule__GSSIfaceDummyPort__Group__0__Impl rule__GSSIfaceDummyPort__Group__1 ;
    public final void rule__GSSIfaceDummyPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4860:1: ( rule__GSSIfaceDummyPort__Group__0__Impl rule__GSSIfaceDummyPort__Group__1 )
            // InternalIFACE.g:4861:2: rule__GSSIfaceDummyPort__Group__0__Impl rule__GSSIfaceDummyPort__Group__1
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
    // InternalIFACE.g:4868:1: rule__GSSIfaceDummyPort__Group__0__Impl : ( () ) ;
    public final void rule__GSSIfaceDummyPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4872:1: ( ( () ) )
            // InternalIFACE.g:4873:1: ( () )
            {
            // InternalIFACE.g:4873:1: ( () )
            // InternalIFACE.g:4874:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceDummyPortAccess().getGSSIfaceDummyPortAction_0()); 
            }
            // InternalIFACE.g:4875:2: ()
            // InternalIFACE.g:4875:3: 
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
    // InternalIFACE.g:4883:1: rule__GSSIfaceDummyPort__Group__1 : rule__GSSIfaceDummyPort__Group__1__Impl rule__GSSIfaceDummyPort__Group__2 ;
    public final void rule__GSSIfaceDummyPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4887:1: ( rule__GSSIfaceDummyPort__Group__1__Impl rule__GSSIfaceDummyPort__Group__2 )
            // InternalIFACE.g:4888:2: rule__GSSIfaceDummyPort__Group__1__Impl rule__GSSIfaceDummyPort__Group__2
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
    // InternalIFACE.g:4895:1: rule__GSSIfaceDummyPort__Group__1__Impl : ( 'dummyPort' ) ;
    public final void rule__GSSIfaceDummyPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4899:1: ( ( 'dummyPort' ) )
            // InternalIFACE.g:4900:1: ( 'dummyPort' )
            {
            // InternalIFACE.g:4900:1: ( 'dummyPort' )
            // InternalIFACE.g:4901:2: 'dummyPort'
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
    // InternalIFACE.g:4910:1: rule__GSSIfaceDummyPort__Group__2 : rule__GSSIfaceDummyPort__Group__2__Impl rule__GSSIfaceDummyPort__Group__3 ;
    public final void rule__GSSIfaceDummyPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4914:1: ( rule__GSSIfaceDummyPort__Group__2__Impl rule__GSSIfaceDummyPort__Group__3 )
            // InternalIFACE.g:4915:2: rule__GSSIfaceDummyPort__Group__2__Impl rule__GSSIfaceDummyPort__Group__3
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
    // InternalIFACE.g:4922:1: rule__GSSIfaceDummyPort__Group__2__Impl : ( '{' ) ;
    public final void rule__GSSIfaceDummyPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4926:1: ( ( '{' ) )
            // InternalIFACE.g:4927:1: ( '{' )
            {
            // InternalIFACE.g:4927:1: ( '{' )
            // InternalIFACE.g:4928:2: '{'
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
    // InternalIFACE.g:4937:1: rule__GSSIfaceDummyPort__Group__3 : rule__GSSIfaceDummyPort__Group__3__Impl rule__GSSIfaceDummyPort__Group__4 ;
    public final void rule__GSSIfaceDummyPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4941:1: ( rule__GSSIfaceDummyPort__Group__3__Impl rule__GSSIfaceDummyPort__Group__4 )
            // InternalIFACE.g:4942:2: rule__GSSIfaceDummyPort__Group__3__Impl rule__GSSIfaceDummyPort__Group__4
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
    // InternalIFACE.g:4949:1: rule__GSSIfaceDummyPort__Group__3__Impl : ( '}' ) ;
    public final void rule__GSSIfaceDummyPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4953:1: ( ( '}' ) )
            // InternalIFACE.g:4954:1: ( '}' )
            {
            // InternalIFACE.g:4954:1: ( '}' )
            // InternalIFACE.g:4955:2: '}'
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
    // InternalIFACE.g:4964:1: rule__GSSIfaceDummyPort__Group__4 : rule__GSSIfaceDummyPort__Group__4__Impl ;
    public final void rule__GSSIfaceDummyPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4968:1: ( rule__GSSIfaceDummyPort__Group__4__Impl )
            // InternalIFACE.g:4969:2: rule__GSSIfaceDummyPort__Group__4__Impl
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
    // InternalIFACE.g:4975:1: rule__GSSIfaceDummyPort__Group__4__Impl : ( ';' ) ;
    public final void rule__GSSIfaceDummyPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4979:1: ( ( ';' ) )
            // InternalIFACE.g:4980:1: ( ';' )
            {
            // InternalIFACE.g:4980:1: ( ';' )
            // InternalIFACE.g:4981:2: ';'
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
    // InternalIFACE.g:4991:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4995:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalIFACE.g:4996:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalIFACE.g:5003:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5007:1: ( ( RULE_ID ) )
            // InternalIFACE.g:5008:1: ( RULE_ID )
            {
            // InternalIFACE.g:5008:1: ( RULE_ID )
            // InternalIFACE.g:5009:2: RULE_ID
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
    // InternalIFACE.g:5018:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5022:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalIFACE.g:5023:2: rule__QualifiedName__Group__1__Impl
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
    // InternalIFACE.g:5029:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5033:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalIFACE.g:5034:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalIFACE.g:5034:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalIFACE.g:5035:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalIFACE.g:5036:2: ( rule__QualifiedName__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==65) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalIFACE.g:5036:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_48);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalIFACE.g:5045:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5049:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalIFACE.g:5050:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalIFACE.g:5057:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5061:1: ( ( '.' ) )
            // InternalIFACE.g:5062:1: ( '.' )
            {
            // InternalIFACE.g:5062:1: ( '.' )
            // InternalIFACE.g:5063:2: '.'
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
    // InternalIFACE.g:5072:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5076:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalIFACE.g:5077:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalIFACE.g:5083:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5087:1: ( ( RULE_ID ) )
            // InternalIFACE.g:5088:1: ( RULE_ID )
            {
            // InternalIFACE.g:5088:1: ( RULE_ID )
            // InternalIFACE.g:5089:2: RULE_ID
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
    // InternalIFACE.g:5099:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5103:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalIFACE.g:5104:2: rule__Version__Group__0__Impl rule__Version__Group__1
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
    // InternalIFACE.g:5111:1: rule__Version__Group__0__Impl : ( ( rule__Version__Alternatives_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5115:1: ( ( ( rule__Version__Alternatives_0 ) ) )
            // InternalIFACE.g:5116:1: ( ( rule__Version__Alternatives_0 ) )
            {
            // InternalIFACE.g:5116:1: ( ( rule__Version__Alternatives_0 ) )
            // InternalIFACE.g:5117:2: ( rule__Version__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_0()); 
            }
            // InternalIFACE.g:5118:2: ( rule__Version__Alternatives_0 )
            // InternalIFACE.g:5118:3: rule__Version__Alternatives_0
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
    // InternalIFACE.g:5126:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5130:1: ( rule__Version__Group__1__Impl )
            // InternalIFACE.g:5131:2: rule__Version__Group__1__Impl
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
    // InternalIFACE.g:5137:1: rule__Version__Group__1__Impl : ( ( rule__Version__Group_1__0 )* ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5141:1: ( ( ( rule__Version__Group_1__0 )* ) )
            // InternalIFACE.g:5142:1: ( ( rule__Version__Group_1__0 )* )
            {
            // InternalIFACE.g:5142:1: ( ( rule__Version__Group_1__0 )* )
            // InternalIFACE.g:5143:2: ( rule__Version__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1()); 
            }
            // InternalIFACE.g:5144:2: ( rule__Version__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==65) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalIFACE.g:5144:3: rule__Version__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_48);
            	    rule__Version__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalIFACE.g:5153:1: rule__Version__Group_0_1__0 : rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 ;
    public final void rule__Version__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5157:1: ( rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 )
            // InternalIFACE.g:5158:2: rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1
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
    // InternalIFACE.g:5165:1: rule__Version__Group_0_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5169:1: ( ( ( RULE_INT )? ) )
            // InternalIFACE.g:5170:1: ( ( RULE_INT )? )
            {
            // InternalIFACE.g:5170:1: ( ( RULE_INT )? )
            // InternalIFACE.g:5171:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
            }
            // InternalIFACE.g:5172:2: ( RULE_INT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalIFACE.g:5172:3: RULE_INT
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
    // InternalIFACE.g:5180:1: rule__Version__Group_0_1__1 : rule__Version__Group_0_1__1__Impl ;
    public final void rule__Version__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5184:1: ( rule__Version__Group_0_1__1__Impl )
            // InternalIFACE.g:5185:2: rule__Version__Group_0_1__1__Impl
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
    // InternalIFACE.g:5191:1: rule__Version__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5195:1: ( ( RULE_ID ) )
            // InternalIFACE.g:5196:1: ( RULE_ID )
            {
            // InternalIFACE.g:5196:1: ( RULE_ID )
            // InternalIFACE.g:5197:2: RULE_ID
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
    // InternalIFACE.g:5207:1: rule__Version__Group_1__0 : rule__Version__Group_1__0__Impl rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5211:1: ( rule__Version__Group_1__0__Impl rule__Version__Group_1__1 )
            // InternalIFACE.g:5212:2: rule__Version__Group_1__0__Impl rule__Version__Group_1__1
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
    // InternalIFACE.g:5219:1: rule__Version__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5223:1: ( ( '.' ) )
            // InternalIFACE.g:5224:1: ( '.' )
            {
            // InternalIFACE.g:5224:1: ( '.' )
            // InternalIFACE.g:5225:2: '.'
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
    // InternalIFACE.g:5234:1: rule__Version__Group_1__1 : rule__Version__Group_1__1__Impl ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5238:1: ( rule__Version__Group_1__1__Impl )
            // InternalIFACE.g:5239:2: rule__Version__Group_1__1__Impl
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
    // InternalIFACE.g:5245:1: rule__Version__Group_1__1__Impl : ( ( rule__Version__Alternatives_1_1 ) ) ;
    public final void rule__Version__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5249:1: ( ( ( rule__Version__Alternatives_1_1 ) ) )
            // InternalIFACE.g:5250:1: ( ( rule__Version__Alternatives_1_1 ) )
            {
            // InternalIFACE.g:5250:1: ( ( rule__Version__Alternatives_1_1 ) )
            // InternalIFACE.g:5251:2: ( rule__Version__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_1_1()); 
            }
            // InternalIFACE.g:5252:2: ( rule__Version__Alternatives_1_1 )
            // InternalIFACE.g:5252:3: rule__Version__Alternatives_1_1
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
    // InternalIFACE.g:5261:1: rule__Version__Group_1_1_1__0 : rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 ;
    public final void rule__Version__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5265:1: ( rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 )
            // InternalIFACE.g:5266:2: rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1
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
    // InternalIFACE.g:5273:1: rule__Version__Group_1_1_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5277:1: ( ( ( RULE_INT )? ) )
            // InternalIFACE.g:5278:1: ( ( RULE_INT )? )
            {
            // InternalIFACE.g:5278:1: ( ( RULE_INT )? )
            // InternalIFACE.g:5279:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
            }
            // InternalIFACE.g:5280:2: ( RULE_INT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalIFACE.g:5280:3: RULE_INT
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
    // InternalIFACE.g:5288:1: rule__Version__Group_1_1_1__1 : rule__Version__Group_1_1_1__1__Impl ;
    public final void rule__Version__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5292:1: ( rule__Version__Group_1_1_1__1__Impl )
            // InternalIFACE.g:5293:2: rule__Version__Group_1_1_1__1__Impl
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
    // InternalIFACE.g:5299:1: rule__Version__Group_1_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5303:1: ( ( RULE_ID ) )
            // InternalIFACE.g:5304:1: ( RULE_ID )
            {
            // InternalIFACE.g:5304:1: ( RULE_ID )
            // InternalIFACE.g:5305:2: RULE_ID
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
    // InternalIFACE.g:5315:1: rule__VersionedQualifiedName__Group__0 : rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 ;
    public final void rule__VersionedQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5319:1: ( rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 )
            // InternalIFACE.g:5320:2: rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1
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
    // InternalIFACE.g:5327:1: rule__VersionedQualifiedName__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__VersionedQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5331:1: ( ( ruleQualifiedName ) )
            // InternalIFACE.g:5332:1: ( ruleQualifiedName )
            {
            // InternalIFACE.g:5332:1: ( ruleQualifiedName )
            // InternalIFACE.g:5333:2: ruleQualifiedName
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
    // InternalIFACE.g:5342:1: rule__VersionedQualifiedName__Group__1 : rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 ;
    public final void rule__VersionedQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5346:1: ( rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 )
            // InternalIFACE.g:5347:2: rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2
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
    // InternalIFACE.g:5354:1: rule__VersionedQualifiedName__Group__1__Impl : ( '(' ) ;
    public final void rule__VersionedQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5358:1: ( ( '(' ) )
            // InternalIFACE.g:5359:1: ( '(' )
            {
            // InternalIFACE.g:5359:1: ( '(' )
            // InternalIFACE.g:5360:2: '('
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
    // InternalIFACE.g:5369:1: rule__VersionedQualifiedName__Group__2 : rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 ;
    public final void rule__VersionedQualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5373:1: ( rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 )
            // InternalIFACE.g:5374:2: rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3
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
    // InternalIFACE.g:5381:1: rule__VersionedQualifiedName__Group__2__Impl : ( ruleVersion ) ;
    public final void rule__VersionedQualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5385:1: ( ( ruleVersion ) )
            // InternalIFACE.g:5386:1: ( ruleVersion )
            {
            // InternalIFACE.g:5386:1: ( ruleVersion )
            // InternalIFACE.g:5387:2: ruleVersion
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
    // InternalIFACE.g:5396:1: rule__VersionedQualifiedName__Group__3 : rule__VersionedQualifiedName__Group__3__Impl ;
    public final void rule__VersionedQualifiedName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5400:1: ( rule__VersionedQualifiedName__Group__3__Impl )
            // InternalIFACE.g:5401:2: rule__VersionedQualifiedName__Group__3__Impl
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
    // InternalIFACE.g:5407:1: rule__VersionedQualifiedName__Group__3__Impl : ( ')' ) ;
    public final void rule__VersionedQualifiedName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5411:1: ( ( ')' ) )
            // InternalIFACE.g:5412:1: ( ')' )
            {
            // InternalIFACE.g:5412:1: ( ')' )
            // InternalIFACE.g:5413:2: ')'
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
    // InternalIFACE.g:5423:1: rule__INTEGER__Group_0__0 : rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 ;
    public final void rule__INTEGER__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5427:1: ( rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 )
            // InternalIFACE.g:5428:2: rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1
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
    // InternalIFACE.g:5435:1: rule__INTEGER__Group_0__0__Impl : ( ( '-' )? ) ;
    public final void rule__INTEGER__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5439:1: ( ( ( '-' )? ) )
            // InternalIFACE.g:5440:1: ( ( '-' )? )
            {
            // InternalIFACE.g:5440:1: ( ( '-' )? )
            // InternalIFACE.g:5441:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); 
            }
            // InternalIFACE.g:5442:2: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==68) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalIFACE.g:5442:3: '-'
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
    // InternalIFACE.g:5450:1: rule__INTEGER__Group_0__1 : rule__INTEGER__Group_0__1__Impl ;
    public final void rule__INTEGER__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5454:1: ( rule__INTEGER__Group_0__1__Impl )
            // InternalIFACE.g:5455:2: rule__INTEGER__Group_0__1__Impl
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
    // InternalIFACE.g:5461:1: rule__INTEGER__Group_0__1__Impl : ( RULE_INT ) ;
    public final void rule__INTEGER__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5465:1: ( ( RULE_INT ) )
            // InternalIFACE.g:5466:1: ( RULE_INT )
            {
            // InternalIFACE.g:5466:1: ( RULE_INT )
            // InternalIFACE.g:5467:2: RULE_INT
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
    // InternalIFACE.g:5477:1: rule__GSSIfacePortConfig__UnorderedGroup_3 : rule__GSSIfacePortConfig__UnorderedGroup_3__0 {...}?;
    public final void rule__GSSIfacePortConfig__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3());
        	
        try {
            // InternalIFACE.g:5482:1: ( rule__GSSIfacePortConfig__UnorderedGroup_3__0 {...}?)
            // InternalIFACE.g:5483:2: rule__GSSIfacePortConfig__UnorderedGroup_3__0 {...}?
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
    // InternalIFACE.g:5491:1: rule__GSSIfacePortConfig__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__GSSIfacePortConfig__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalIFACE.g:5496:1: ( ( ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) ) ) )
            // InternalIFACE.g:5497:3: ( ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) ) )
            {
            // InternalIFACE.g:5497:3: ( ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( LA20_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0) ) {
                alt20=1;
            }
            else if ( LA20_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalIFACE.g:5498:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) )
                    {
                    // InternalIFACE.g:5498:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) )
                    // InternalIFACE.g:5499:4: {...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfacePortConfig__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalIFACE.g:5499:114: ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) )
                    // InternalIFACE.g:5500:5: ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // InternalIFACE.g:5506:5: ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) )
                    // InternalIFACE.g:5507:6: ( rule__GSSIfacePortConfig__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfacePortConfigAccess().getGroup_3_0()); 
                    }
                    // InternalIFACE.g:5508:6: ( rule__GSSIfacePortConfig__Group_3_0__0 )
                    // InternalIFACE.g:5508:7: rule__GSSIfacePortConfig__Group_3_0__0
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
                    // InternalIFACE.g:5513:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) )
                    {
                    // InternalIFACE.g:5513:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) )
                    // InternalIFACE.g:5514:4: {...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfacePortConfig__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalIFACE.g:5514:114: ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) )
                    // InternalIFACE.g:5515:5: ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // InternalIFACE.g:5521:5: ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) )
                    // InternalIFACE.g:5522:6: ( rule__GSSIfacePortConfig__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfacePortConfigAccess().getGroup_3_1()); 
                    }
                    // InternalIFACE.g:5523:6: ( rule__GSSIfacePortConfig__Group_3_1__0 )
                    // InternalIFACE.g:5523:7: rule__GSSIfacePortConfig__Group_3_1__0
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
    // InternalIFACE.g:5536:1: rule__GSSIfacePortConfig__UnorderedGroup_3__0 : rule__GSSIfacePortConfig__UnorderedGroup_3__Impl ( rule__GSSIfacePortConfig__UnorderedGroup_3__1 )? ;
    public final void rule__GSSIfacePortConfig__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5540:1: ( rule__GSSIfacePortConfig__UnorderedGroup_3__Impl ( rule__GSSIfacePortConfig__UnorderedGroup_3__1 )? )
            // InternalIFACE.g:5541:2: rule__GSSIfacePortConfig__UnorderedGroup_3__Impl ( rule__GSSIfacePortConfig__UnorderedGroup_3__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_52);
            rule__GSSIfacePortConfig__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalIFACE.g:5542:2: ( rule__GSSIfacePortConfig__UnorderedGroup_3__1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( LA21_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1) ) {
                alt21=1;
            }
            switch (alt21) {
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
    // InternalIFACE.g:5548:1: rule__GSSIfacePortConfig__UnorderedGroup_3__1 : rule__GSSIfacePortConfig__UnorderedGroup_3__Impl ;
    public final void rule__GSSIfacePortConfig__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5552:1: ( rule__GSSIfacePortConfig__UnorderedGroup_3__Impl )
            // InternalIFACE.g:5553:2: rule__GSSIfacePortConfig__UnorderedGroup_3__Impl
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
    // InternalIFACE.g:5560:1: rule__GSSModelFile__ImportsAssignment_0 : ( ruleGSSModelFileImport ) ;
    public final void rule__GSSModelFile__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5564:1: ( ( ruleGSSModelFileImport ) )
            // InternalIFACE.g:5565:2: ( ruleGSSModelFileImport )
            {
            // InternalIFACE.g:5565:2: ( ruleGSSModelFileImport )
            // InternalIFACE.g:5566:3: ruleGSSModelFileImport
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
    // InternalIFACE.g:5575:1: rule__GSSModelFile__ElementAssignment_1 : ( ruleGSSIfacePortConfig ) ;
    public final void rule__GSSModelFile__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5579:1: ( ( ruleGSSIfacePortConfig ) )
            // InternalIFACE.g:5580:2: ( ruleGSSIfacePortConfig )
            {
            // InternalIFACE.g:5580:2: ( ruleGSSIfacePortConfig )
            // InternalIFACE.g:5581:3: ruleGSSIfacePortConfig
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
    // InternalIFACE.g:5590:1: rule__GSSModelFileImport__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GSSModelFileImport__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5594:1: ( ( RULE_STRING ) )
            // InternalIFACE.g:5595:2: ( RULE_STRING )
            {
            // InternalIFACE.g:5595:2: ( RULE_STRING )
            // InternalIFACE.g:5596:3: RULE_STRING
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
    // InternalIFACE.g:5605:1: rule__GSSIfacePortConfig__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GSSIfacePortConfig__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5609:1: ( ( RULE_ID ) )
            // InternalIFACE.g:5610:2: ( RULE_ID )
            {
            // InternalIFACE.g:5610:2: ( RULE_ID )
            // InternalIFACE.g:5611:3: RULE_ID
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
    // InternalIFACE.g:5620:1: rule__GSSIfacePortConfig__UriAssignment_3_0_2 : ( ruleQualifiedName ) ;
    public final void rule__GSSIfacePortConfig__UriAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5624:1: ( ( ruleQualifiedName ) )
            // InternalIFACE.g:5625:2: ( ruleQualifiedName )
            {
            // InternalIFACE.g:5625:2: ( ruleQualifiedName )
            // InternalIFACE.g:5626:3: ruleQualifiedName
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
    // InternalIFACE.g:5635:1: rule__GSSIfacePortConfig__VersionAssignment_3_1_2 : ( ruleVersion ) ;
    public final void rule__GSSIfacePortConfig__VersionAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5639:1: ( ( ruleVersion ) )
            // InternalIFACE.g:5640:2: ( ruleVersion )
            {
            // InternalIFACE.g:5640:2: ( ruleVersion )
            // InternalIFACE.g:5641:3: ruleVersion
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
    // InternalIFACE.g:5650:1: rule__GSSIfacePortConfig__PortConfigAssignment_4 : ( ruleGSSIfacePort ) ;
    public final void rule__GSSIfacePortConfig__PortConfigAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5654:1: ( ( ruleGSSIfacePort ) )
            // InternalIFACE.g:5655:2: ( ruleGSSIfacePort )
            {
            // InternalIFACE.g:5655:2: ( ruleGSSIfacePort )
            // InternalIFACE.g:5656:3: ruleGSSIfacePort
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
    // InternalIFACE.g:5665:1: rule__GSSIfaceSpWPort__TypeAssignment_4 : ( ruleGSSIfaceSpWPortType ) ;
    public final void rule__GSSIfaceSpWPort__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5669:1: ( ( ruleGSSIfaceSpWPortType ) )
            // InternalIFACE.g:5670:2: ( ruleGSSIfaceSpWPortType )
            {
            // InternalIFACE.g:5670:2: ( ruleGSSIfaceSpWPortType )
            // InternalIFACE.g:5671:3: ruleGSSIfaceSpWPortType
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
    // InternalIFACE.g:5680:1: rule__GSSIfaceSpWPort__LinkAssignment_8 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSpWPort__LinkAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5684:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:5685:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:5685:2: ( ruleINTEGER )
            // InternalIFACE.g:5686:3: ruleINTEGER
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
    // InternalIFACE.g:5695:1: rule__GSSIfaceSpWPort__WritingPortAssignment_12 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSpWPort__WritingPortAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5699:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:5700:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:5700:2: ( ruleINTEGER )
            // InternalIFACE.g:5701:3: ruleINTEGER
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
    // InternalIFACE.g:5710:1: rule__GSSIfaceSpWPort__ReadingPortAssignment_14 : ( ruleGSSIfaceReadingPort ) ;
    public final void rule__GSSIfaceSpWPort__ReadingPortAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5714:1: ( ( ruleGSSIfaceReadingPort ) )
            // InternalIFACE.g:5715:2: ( ruleGSSIfaceReadingPort )
            {
            // InternalIFACE.g:5715:2: ( ruleGSSIfaceReadingPort )
            // InternalIFACE.g:5716:3: ruleGSSIfaceReadingPort
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
    // InternalIFACE.g:5725:1: rule__GSSIfaceReadingPort__PortAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceReadingPort__PortAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5729:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:5730:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:5730:2: ( ruleINTEGER )
            // InternalIFACE.g:5731:3: ruleINTEGER
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
    // InternalIFACE.g:5740:1: rule__GSSIfaceUartPort__NumberAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceUartPort__NumberAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5744:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:5745:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:5745:2: ( ruleINTEGER )
            // InternalIFACE.g:5746:3: ruleINTEGER
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
    // InternalIFACE.g:5755:1: rule__GSSIfaceUartPort__BaudRateAssignment_8 : ( ruleGSSIfaceUartPortBaudRate ) ;
    public final void rule__GSSIfaceUartPort__BaudRateAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5759:1: ( ( ruleGSSIfaceUartPortBaudRate ) )
            // InternalIFACE.g:5760:2: ( ruleGSSIfaceUartPortBaudRate )
            {
            // InternalIFACE.g:5760:2: ( ruleGSSIfaceUartPortBaudRate )
            // InternalIFACE.g:5761:3: ruleGSSIfaceUartPortBaudRate
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
    // InternalIFACE.g:5770:1: rule__GSSIfaceUartPort__ParityAssignment_12 : ( ruleGSSIfaceUartPortParity ) ;
    public final void rule__GSSIfaceUartPort__ParityAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5774:1: ( ( ruleGSSIfaceUartPortParity ) )
            // InternalIFACE.g:5775:2: ( ruleGSSIfaceUartPortParity )
            {
            // InternalIFACE.g:5775:2: ( ruleGSSIfaceUartPortParity )
            // InternalIFACE.g:5776:3: ruleGSSIfaceUartPortParity
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
    // InternalIFACE.g:5785:1: rule__GSSIfaceUartPort__DataBitsAssignment_16 : ( ruleGSSIfaceUartPortDataBits ) ;
    public final void rule__GSSIfaceUartPort__DataBitsAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5789:1: ( ( ruleGSSIfaceUartPortDataBits ) )
            // InternalIFACE.g:5790:2: ( ruleGSSIfaceUartPortDataBits )
            {
            // InternalIFACE.g:5790:2: ( ruleGSSIfaceUartPortDataBits )
            // InternalIFACE.g:5791:3: ruleGSSIfaceUartPortDataBits
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
    // InternalIFACE.g:5800:1: rule__GSSIfaceUartPort__StopBitsAssignment_20 : ( ruleGSSIfaceUartPortStopBits ) ;
    public final void rule__GSSIfaceUartPort__StopBitsAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5804:1: ( ( ruleGSSIfaceUartPortStopBits ) )
            // InternalIFACE.g:5805:2: ( ruleGSSIfaceUartPortStopBits )
            {
            // InternalIFACE.g:5805:2: ( ruleGSSIfaceUartPortStopBits )
            // InternalIFACE.g:5806:3: ruleGSSIfaceUartPortStopBits
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


    // $ANTLR start "rule__GSSIfaceUartPort__InputQueueSizeAssignment_24"
    // InternalIFACE.g:5815:1: rule__GSSIfaceUartPort__InputQueueSizeAssignment_24 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceUartPort__InputQueueSizeAssignment_24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5819:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:5820:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:5820:2: ( ruleINTEGER )
            // InternalIFACE.g:5821:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeINTEGERParserRuleCall_24_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeINTEGERParserRuleCall_24_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__InputQueueSizeAssignment_24"


    // $ANTLR start "rule__GSSIfaceUartPort__OutputQueueSizeAssignment_28"
    // InternalIFACE.g:5830:1: rule__GSSIfaceUartPort__OutputQueueSizeAssignment_28 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceUartPort__OutputQueueSizeAssignment_28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5834:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:5835:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:5835:2: ( ruleINTEGER )
            // InternalIFACE.g:5836:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeINTEGERParserRuleCall_28_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeINTEGERParserRuleCall_28_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__OutputQueueSizeAssignment_28"


    // $ANTLR start "rule__GSSIfaceUartPort__UartProtocolAssignment_30"
    // InternalIFACE.g:5845:1: rule__GSSIfaceUartPort__UartProtocolAssignment_30 : ( ruleGSSIfaceUartProtocol ) ;
    public final void rule__GSSIfaceUartPort__UartProtocolAssignment_30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5849:1: ( ( ruleGSSIfaceUartProtocol ) )
            // InternalIFACE.g:5850:2: ( ruleGSSIfaceUartProtocol )
            {
            // InternalIFACE.g:5850:2: ( ruleGSSIfaceUartProtocol )
            // InternalIFACE.g:5851:3: ruleGSSIfaceUartProtocol
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getUartProtocolGSSIfaceUartProtocolParserRuleCall_30_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceUartProtocol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getUartProtocolGSSIfaceUartProtocolParserRuleCall_30_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__UartProtocolAssignment_30"


    // $ANTLR start "rule__GSSIfaceUartProtocol__UnitAssignment_4"
    // InternalIFACE.g:5860:1: rule__GSSIfaceUartProtocol__UnitAssignment_4 : ( ruleGSSIfaceUartProtocolUnit ) ;
    public final void rule__GSSIfaceUartProtocol__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5864:1: ( ( ruleGSSIfaceUartProtocolUnit ) )
            // InternalIFACE.g:5865:2: ( ruleGSSIfaceUartProtocolUnit )
            {
            // InternalIFACE.g:5865:2: ( ruleGSSIfaceUartProtocolUnit )
            // InternalIFACE.g:5866:3: ruleGSSIfaceUartProtocolUnit
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
    // InternalIFACE.g:5875:1: rule__GSSIfaceUartProtocol__PowerAssignment_8 : ( ruleGSSIfaceUartProtocolPower ) ;
    public final void rule__GSSIfaceUartProtocol__PowerAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5879:1: ( ( ruleGSSIfaceUartProtocolPower ) )
            // InternalIFACE.g:5880:2: ( ruleGSSIfaceUartProtocolPower )
            {
            // InternalIFACE.g:5880:2: ( ruleGSSIfaceUartProtocolPower )
            // InternalIFACE.g:5881:3: ruleGSSIfaceUartProtocolPower
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
    // InternalIFACE.g:5890:1: rule__GSSIfaceUartProtocol__ConstSizeAssignment_10 : ( ruleGSSIfaceConstSize ) ;
    public final void rule__GSSIfaceUartProtocol__ConstSizeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5894:1: ( ( ruleGSSIfaceConstSize ) )
            // InternalIFACE.g:5895:2: ( ruleGSSIfaceConstSize )
            {
            // InternalIFACE.g:5895:2: ( ruleGSSIfaceConstSize )
            // InternalIFACE.g:5896:3: ruleGSSIfaceConstSize
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
    // InternalIFACE.g:5905:1: rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_11 : ( ruleGSSIfaceSizeFieldOffset ) ;
    public final void rule__GSSIfaceUartProtocol__SizeFieldOffsetAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5909:1: ( ( ruleGSSIfaceSizeFieldOffset ) )
            // InternalIFACE.g:5910:2: ( ruleGSSIfaceSizeFieldOffset )
            {
            // InternalIFACE.g:5910:2: ( ruleGSSIfaceSizeFieldOffset )
            // InternalIFACE.g:5911:3: ruleGSSIfaceSizeFieldOffset
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
    // InternalIFACE.g:5920:1: rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_12 : ( ruleGSSIfaceSizeFieldTrim ) ;
    public final void rule__GSSIfaceUartProtocol__SizeFieldTrimAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5924:1: ( ( ruleGSSIfaceSizeFieldTrim ) )
            // InternalIFACE.g:5925:2: ( ruleGSSIfaceSizeFieldTrim )
            {
            // InternalIFACE.g:5925:2: ( ruleGSSIfaceSizeFieldTrim )
            // InternalIFACE.g:5926:3: ruleGSSIfaceSizeFieldTrim
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
    // InternalIFACE.g:5935:1: rule__GSSIfaceUartProtocol__SyncPatternAssignment_13 : ( ruleGSSIfaceSyncPattern ) ;
    public final void rule__GSSIfaceUartProtocol__SyncPatternAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5939:1: ( ( ruleGSSIfaceSyncPattern ) )
            // InternalIFACE.g:5940:2: ( ruleGSSIfaceSyncPattern )
            {
            // InternalIFACE.g:5940:2: ( ruleGSSIfaceSyncPattern )
            // InternalIFACE.g:5941:3: ruleGSSIfaceSyncPattern
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
    // InternalIFACE.g:5950:1: rule__GSSIfaceConstSize__BytesAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceConstSize__BytesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5954:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:5955:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:5955:2: ( ruleINTEGER )
            // InternalIFACE.g:5956:3: ruleINTEGER
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
    // InternalIFACE.g:5965:1: rule__GSSIfaceConstSize__BitsAssignment_8 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceConstSize__BitsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5969:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:5970:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:5970:2: ( ruleINTEGER )
            // InternalIFACE.g:5971:3: ruleINTEGER
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
    // InternalIFACE.g:5980:1: rule__GSSIfaceSizeFieldOffset__BytesAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSizeFieldOffset__BytesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5984:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:5985:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:5985:2: ( ruleINTEGER )
            // InternalIFACE.g:5986:3: ruleINTEGER
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
    // InternalIFACE.g:5995:1: rule__GSSIfaceSizeFieldOffset__BitsAssignment_8 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSizeFieldOffset__BitsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5999:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6000:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6000:2: ( ruleINTEGER )
            // InternalIFACE.g:6001:3: ruleINTEGER
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
    // InternalIFACE.g:6010:1: rule__GSSIfaceSizeFieldTrim__BytesAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSizeFieldTrim__BytesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6014:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6015:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6015:2: ( ruleINTEGER )
            // InternalIFACE.g:6016:3: ruleINTEGER
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
    // InternalIFACE.g:6025:1: rule__GSSIfaceSizeFieldTrim__BitsAssignment_8 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSizeFieldTrim__BitsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6029:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6030:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6030:2: ( ruleINTEGER )
            // InternalIFACE.g:6031:3: ruleINTEGER
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
    // InternalIFACE.g:6040:1: rule__GSSIfaceSyncPattern__HexValueAssignment_4 : ( RULE_HEXADECIMAL ) ;
    public final void rule__GSSIfaceSyncPattern__HexValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6044:1: ( ( RULE_HEXADECIMAL ) )
            // InternalIFACE.g:6045:2: ( RULE_HEXADECIMAL )
            {
            // InternalIFACE.g:6045:2: ( RULE_HEXADECIMAL )
            // InternalIFACE.g:6046:3: RULE_HEXADECIMAL
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
    // InternalIFACE.g:6055:1: rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6059:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6060:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6060:2: ( ruleINTEGER )
            // InternalIFACE.g:6061:3: ruleINTEGER
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

    // $ANTLR start synpred29_InternalIFACE
    public final void synpred29_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5498:3: ( ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) ) )
        // InternalIFACE.g:5498:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) )
        {
        // InternalIFACE.g:5498:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) )
        // InternalIFACE.g:5499:4: {...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred29_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalIFACE.g:5499:114: ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) )
        // InternalIFACE.g:5500:5: ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0);
        // InternalIFACE.g:5506:5: ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) )
        // InternalIFACE.g:5507:6: ( rule__GSSIfacePortConfig__Group_3_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSIfacePortConfigAccess().getGroup_3_0()); 
        }
        // InternalIFACE.g:5508:6: ( rule__GSSIfacePortConfig__Group_3_0__0 )
        // InternalIFACE.g:5508:7: rule__GSSIfacePortConfig__Group_3_0__0
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
    // $ANTLR end synpred29_InternalIFACE

    // $ANTLR start synpred30_InternalIFACE
    public final void synpred30_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:5542:2: ( rule__GSSIfacePortConfig__UnorderedGroup_3__1 )
        // InternalIFACE.g:5542:2: rule__GSSIfacePortConfig__UnorderedGroup_3__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfacePortConfig__UnorderedGroup_3__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalIFACE

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


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000A000000000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x4000410000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000007000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000010L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000003E0000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000003C00000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000000C8000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1000001000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x000000A000000002L});
    }


}