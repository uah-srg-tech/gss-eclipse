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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_HEXADECIMAL", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'usb'", "'mk2'", "'pci'", "'38400bauds'", "'115200bauds'", "'NO'", "'ODD'", "'EVEN'", "'MARK'", "'SPACE'", "'5bits'", "'6bits'", "'7bits'", "'8bits'", "'1bit'", "'2bits'", "'rts_cts'", "'xon_xoff'", "'bytes'", "'bits'", "'no'", "'2_with_0'", "'import'", "';'", "'portConfig'", "'{'", "'}'", "'uri'", "':='", "'version'", "'spwPort'", "'type'", "'link'", "'writingPort'", "'readingPort'", "'port'", "'uartPort'", "'number'", "'baudRate'", "'parity'", "'dataBits'", "'stopBits'", "'flowControl'", "'socketSrvPort'", "'portNumber'", "'socketCliPort'", "'ipAddress'", "'portProtocol'", "'unit'", "'power'", "'constSize'", "'sizeFieldOffset'", "'sizeFieldTrim'", "'syncPattern'", "'hexValue'", "'spwTCPort'", "'spwPortRef'", "'dummyPort'", "'.'", "'('", "')'", "'-'"
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
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
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


    // $ANTLR start "entryRuleGSSIfaceSocketSrvPort"
    // InternalIFACE.g:236:1: entryRuleGSSIfaceSocketSrvPort : ruleGSSIfaceSocketSrvPort EOF ;
    public final void entryRuleGSSIfaceSocketSrvPort() throws RecognitionException {
        try {
            // InternalIFACE.g:237:1: ( ruleGSSIfaceSocketSrvPort EOF )
            // InternalIFACE.g:238:1: ruleGSSIfaceSocketSrvPort EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketSrvPortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSIfaceSocketSrvPort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketSrvPortRule()); 
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
    // $ANTLR end "entryRuleGSSIfaceSocketSrvPort"


    // $ANTLR start "ruleGSSIfaceSocketSrvPort"
    // InternalIFACE.g:245:1: ruleGSSIfaceSocketSrvPort : ( ( rule__GSSIfaceSocketSrvPort__Group__0 ) ) ;
    public final void ruleGSSIfaceSocketSrvPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:249:2: ( ( ( rule__GSSIfaceSocketSrvPort__Group__0 ) ) )
            // InternalIFACE.g:250:2: ( ( rule__GSSIfaceSocketSrvPort__Group__0 ) )
            {
            // InternalIFACE.g:250:2: ( ( rule__GSSIfaceSocketSrvPort__Group__0 ) )
            // InternalIFACE.g:251:3: ( rule__GSSIfaceSocketSrvPort__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketSrvPortAccess().getGroup()); 
            }
            // InternalIFACE.g:252:3: ( rule__GSSIfaceSocketSrvPort__Group__0 )
            // InternalIFACE.g:252:4: rule__GSSIfaceSocketSrvPort__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketSrvPort__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketSrvPortAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSIfaceSocketSrvPort"


    // $ANTLR start "entryRuleGSSIfaceSocketCliPort"
    // InternalIFACE.g:261:1: entryRuleGSSIfaceSocketCliPort : ruleGSSIfaceSocketCliPort EOF ;
    public final void entryRuleGSSIfaceSocketCliPort() throws RecognitionException {
        try {
            // InternalIFACE.g:262:1: ( ruleGSSIfaceSocketCliPort EOF )
            // InternalIFACE.g:263:1: ruleGSSIfaceSocketCliPort EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketCliPortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSIfaceSocketCliPort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketCliPortRule()); 
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
    // $ANTLR end "entryRuleGSSIfaceSocketCliPort"


    // $ANTLR start "ruleGSSIfaceSocketCliPort"
    // InternalIFACE.g:270:1: ruleGSSIfaceSocketCliPort : ( ( rule__GSSIfaceSocketCliPort__Group__0 ) ) ;
    public final void ruleGSSIfaceSocketCliPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:274:2: ( ( ( rule__GSSIfaceSocketCliPort__Group__0 ) ) )
            // InternalIFACE.g:275:2: ( ( rule__GSSIfaceSocketCliPort__Group__0 ) )
            {
            // InternalIFACE.g:275:2: ( ( rule__GSSIfaceSocketCliPort__Group__0 ) )
            // InternalIFACE.g:276:3: ( rule__GSSIfaceSocketCliPort__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketCliPortAccess().getGroup()); 
            }
            // InternalIFACE.g:277:3: ( rule__GSSIfaceSocketCliPort__Group__0 )
            // InternalIFACE.g:277:4: rule__GSSIfaceSocketCliPort__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketCliPort__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketCliPortAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSIfaceSocketCliPort"


    // $ANTLR start "entryRuleGSSIfacePortProtocol"
    // InternalIFACE.g:286:1: entryRuleGSSIfacePortProtocol : ruleGSSIfacePortProtocol EOF ;
    public final void entryRuleGSSIfacePortProtocol() throws RecognitionException {
        try {
            // InternalIFACE.g:287:1: ( ruleGSSIfacePortProtocol EOF )
            // InternalIFACE.g:288:1: ruleGSSIfacePortProtocol EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortProtocolRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSIfacePortProtocol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortProtocolRule()); 
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
    // $ANTLR end "entryRuleGSSIfacePortProtocol"


    // $ANTLR start "ruleGSSIfacePortProtocol"
    // InternalIFACE.g:295:1: ruleGSSIfacePortProtocol : ( ( rule__GSSIfacePortProtocol__Group__0 ) ) ;
    public final void ruleGSSIfacePortProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:299:2: ( ( ( rule__GSSIfacePortProtocol__Group__0 ) ) )
            // InternalIFACE.g:300:2: ( ( rule__GSSIfacePortProtocol__Group__0 ) )
            {
            // InternalIFACE.g:300:2: ( ( rule__GSSIfacePortProtocol__Group__0 ) )
            // InternalIFACE.g:301:3: ( rule__GSSIfacePortProtocol__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortProtocolAccess().getGroup()); 
            }
            // InternalIFACE.g:302:3: ( rule__GSSIfacePortProtocol__Group__0 )
            // InternalIFACE.g:302:4: rule__GSSIfacePortProtocol__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortProtocol__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortProtocolAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSIfacePortProtocol"


    // $ANTLR start "entryRuleGSSIfaceConstSize"
    // InternalIFACE.g:311:1: entryRuleGSSIfaceConstSize : ruleGSSIfaceConstSize EOF ;
    public final void entryRuleGSSIfaceConstSize() throws RecognitionException {
        try {
            // InternalIFACE.g:312:1: ( ruleGSSIfaceConstSize EOF )
            // InternalIFACE.g:313:1: ruleGSSIfaceConstSize EOF
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
    // InternalIFACE.g:320:1: ruleGSSIfaceConstSize : ( ( rule__GSSIfaceConstSize__Group__0 ) ) ;
    public final void ruleGSSIfaceConstSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:324:2: ( ( ( rule__GSSIfaceConstSize__Group__0 ) ) )
            // InternalIFACE.g:325:2: ( ( rule__GSSIfaceConstSize__Group__0 ) )
            {
            // InternalIFACE.g:325:2: ( ( rule__GSSIfaceConstSize__Group__0 ) )
            // InternalIFACE.g:326:3: ( rule__GSSIfaceConstSize__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getGroup()); 
            }
            // InternalIFACE.g:327:3: ( rule__GSSIfaceConstSize__Group__0 )
            // InternalIFACE.g:327:4: rule__GSSIfaceConstSize__Group__0
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
    // InternalIFACE.g:336:1: entryRuleGSSIfaceSizeFieldOffset : ruleGSSIfaceSizeFieldOffset EOF ;
    public final void entryRuleGSSIfaceSizeFieldOffset() throws RecognitionException {
        try {
            // InternalIFACE.g:337:1: ( ruleGSSIfaceSizeFieldOffset EOF )
            // InternalIFACE.g:338:1: ruleGSSIfaceSizeFieldOffset EOF
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
    // InternalIFACE.g:345:1: ruleGSSIfaceSizeFieldOffset : ( ( rule__GSSIfaceSizeFieldOffset__Group__0 ) ) ;
    public final void ruleGSSIfaceSizeFieldOffset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:349:2: ( ( ( rule__GSSIfaceSizeFieldOffset__Group__0 ) ) )
            // InternalIFACE.g:350:2: ( ( rule__GSSIfaceSizeFieldOffset__Group__0 ) )
            {
            // InternalIFACE.g:350:2: ( ( rule__GSSIfaceSizeFieldOffset__Group__0 ) )
            // InternalIFACE.g:351:3: ( rule__GSSIfaceSizeFieldOffset__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getGroup()); 
            }
            // InternalIFACE.g:352:3: ( rule__GSSIfaceSizeFieldOffset__Group__0 )
            // InternalIFACE.g:352:4: rule__GSSIfaceSizeFieldOffset__Group__0
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
    // InternalIFACE.g:361:1: entryRuleGSSIfaceSizeFieldTrim : ruleGSSIfaceSizeFieldTrim EOF ;
    public final void entryRuleGSSIfaceSizeFieldTrim() throws RecognitionException {
        try {
            // InternalIFACE.g:362:1: ( ruleGSSIfaceSizeFieldTrim EOF )
            // InternalIFACE.g:363:1: ruleGSSIfaceSizeFieldTrim EOF
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
    // InternalIFACE.g:370:1: ruleGSSIfaceSizeFieldTrim : ( ( rule__GSSIfaceSizeFieldTrim__Group__0 ) ) ;
    public final void ruleGSSIfaceSizeFieldTrim() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:374:2: ( ( ( rule__GSSIfaceSizeFieldTrim__Group__0 ) ) )
            // InternalIFACE.g:375:2: ( ( rule__GSSIfaceSizeFieldTrim__Group__0 ) )
            {
            // InternalIFACE.g:375:2: ( ( rule__GSSIfaceSizeFieldTrim__Group__0 ) )
            // InternalIFACE.g:376:3: ( rule__GSSIfaceSizeFieldTrim__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getGroup()); 
            }
            // InternalIFACE.g:377:3: ( rule__GSSIfaceSizeFieldTrim__Group__0 )
            // InternalIFACE.g:377:4: rule__GSSIfaceSizeFieldTrim__Group__0
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
    // InternalIFACE.g:386:1: entryRuleGSSIfaceSyncPattern : ruleGSSIfaceSyncPattern EOF ;
    public final void entryRuleGSSIfaceSyncPattern() throws RecognitionException {
        try {
            // InternalIFACE.g:387:1: ( ruleGSSIfaceSyncPattern EOF )
            // InternalIFACE.g:388:1: ruleGSSIfaceSyncPattern EOF
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
    // InternalIFACE.g:395:1: ruleGSSIfaceSyncPattern : ( ( rule__GSSIfaceSyncPattern__Group__0 ) ) ;
    public final void ruleGSSIfaceSyncPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:399:2: ( ( ( rule__GSSIfaceSyncPattern__Group__0 ) ) )
            // InternalIFACE.g:400:2: ( ( rule__GSSIfaceSyncPattern__Group__0 ) )
            {
            // InternalIFACE.g:400:2: ( ( rule__GSSIfaceSyncPattern__Group__0 ) )
            // InternalIFACE.g:401:3: ( rule__GSSIfaceSyncPattern__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getGroup()); 
            }
            // InternalIFACE.g:402:3: ( rule__GSSIfaceSyncPattern__Group__0 )
            // InternalIFACE.g:402:4: rule__GSSIfaceSyncPattern__Group__0
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
    // InternalIFACE.g:411:1: entryRuleGSSIfaceSpWTCPort : ruleGSSIfaceSpWTCPort EOF ;
    public final void entryRuleGSSIfaceSpWTCPort() throws RecognitionException {
        try {
            // InternalIFACE.g:412:1: ( ruleGSSIfaceSpWTCPort EOF )
            // InternalIFACE.g:413:1: ruleGSSIfaceSpWTCPort EOF
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
    // InternalIFACE.g:420:1: ruleGSSIfaceSpWTCPort : ( ( rule__GSSIfaceSpWTCPort__Group__0 ) ) ;
    public final void ruleGSSIfaceSpWTCPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:424:2: ( ( ( rule__GSSIfaceSpWTCPort__Group__0 ) ) )
            // InternalIFACE.g:425:2: ( ( rule__GSSIfaceSpWTCPort__Group__0 ) )
            {
            // InternalIFACE.g:425:2: ( ( rule__GSSIfaceSpWTCPort__Group__0 ) )
            // InternalIFACE.g:426:3: ( rule__GSSIfaceSpWTCPort__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getGroup()); 
            }
            // InternalIFACE.g:427:3: ( rule__GSSIfaceSpWTCPort__Group__0 )
            // InternalIFACE.g:427:4: rule__GSSIfaceSpWTCPort__Group__0
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
    // InternalIFACE.g:436:1: entryRuleGSSIfaceDummyPort : ruleGSSIfaceDummyPort EOF ;
    public final void entryRuleGSSIfaceDummyPort() throws RecognitionException {
        try {
            // InternalIFACE.g:437:1: ( ruleGSSIfaceDummyPort EOF )
            // InternalIFACE.g:438:1: ruleGSSIfaceDummyPort EOF
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
    // InternalIFACE.g:445:1: ruleGSSIfaceDummyPort : ( ( rule__GSSIfaceDummyPort__Group__0 ) ) ;
    public final void ruleGSSIfaceDummyPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:449:2: ( ( ( rule__GSSIfaceDummyPort__Group__0 ) ) )
            // InternalIFACE.g:450:2: ( ( rule__GSSIfaceDummyPort__Group__0 ) )
            {
            // InternalIFACE.g:450:2: ( ( rule__GSSIfaceDummyPort__Group__0 ) )
            // InternalIFACE.g:451:3: ( rule__GSSIfaceDummyPort__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceDummyPortAccess().getGroup()); 
            }
            // InternalIFACE.g:452:3: ( rule__GSSIfaceDummyPort__Group__0 )
            // InternalIFACE.g:452:4: rule__GSSIfaceDummyPort__Group__0
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
    // InternalIFACE.g:461:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalIFACE.g:462:1: ( ruleQualifiedName EOF )
            // InternalIFACE.g:463:1: ruleQualifiedName EOF
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
    // InternalIFACE.g:470:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:474:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalIFACE.g:475:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalIFACE.g:475:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalIFACE.g:476:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalIFACE.g:477:3: ( rule__QualifiedName__Group__0 )
            // InternalIFACE.g:477:4: rule__QualifiedName__Group__0
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
    // InternalIFACE.g:486:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalIFACE.g:487:1: ( ruleVersion EOF )
            // InternalIFACE.g:488:1: ruleVersion EOF
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
    // InternalIFACE.g:495:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:499:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalIFACE.g:500:2: ( ( rule__Version__Group__0 ) )
            {
            // InternalIFACE.g:500:2: ( ( rule__Version__Group__0 ) )
            // InternalIFACE.g:501:3: ( rule__Version__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup()); 
            }
            // InternalIFACE.g:502:3: ( rule__Version__Group__0 )
            // InternalIFACE.g:502:4: rule__Version__Group__0
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
    // InternalIFACE.g:511:1: entryRuleVersionedQualifiedName : ruleVersionedQualifiedName EOF ;
    public final void entryRuleVersionedQualifiedName() throws RecognitionException {
        try {
            // InternalIFACE.g:512:1: ( ruleVersionedQualifiedName EOF )
            // InternalIFACE.g:513:1: ruleVersionedQualifiedName EOF
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
    // InternalIFACE.g:520:1: ruleVersionedQualifiedName : ( ( rule__VersionedQualifiedName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:524:2: ( ( ( rule__VersionedQualifiedName__Group__0 ) ) )
            // InternalIFACE.g:525:2: ( ( rule__VersionedQualifiedName__Group__0 ) )
            {
            // InternalIFACE.g:525:2: ( ( rule__VersionedQualifiedName__Group__0 ) )
            // InternalIFACE.g:526:3: ( rule__VersionedQualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); 
            }
            // InternalIFACE.g:527:3: ( rule__VersionedQualifiedName__Group__0 )
            // InternalIFACE.g:527:4: rule__VersionedQualifiedName__Group__0
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
    // InternalIFACE.g:536:1: entryRuleINTEGER : ruleINTEGER EOF ;
    public final void entryRuleINTEGER() throws RecognitionException {
        try {
            // InternalIFACE.g:537:1: ( ruleINTEGER EOF )
            // InternalIFACE.g:538:1: ruleINTEGER EOF
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
    // InternalIFACE.g:545:1: ruleINTEGER : ( ( rule__INTEGER__Alternatives ) ) ;
    public final void ruleINTEGER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:549:2: ( ( ( rule__INTEGER__Alternatives ) ) )
            // InternalIFACE.g:550:2: ( ( rule__INTEGER__Alternatives ) )
            {
            // InternalIFACE.g:550:2: ( ( rule__INTEGER__Alternatives ) )
            // InternalIFACE.g:551:3: ( rule__INTEGER__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getAlternatives()); 
            }
            // InternalIFACE.g:552:3: ( rule__INTEGER__Alternatives )
            // InternalIFACE.g:552:4: rule__INTEGER__Alternatives
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
    // InternalIFACE.g:561:1: ruleGSSIfaceSpWPortType : ( ( rule__GSSIfaceSpWPortType__Alternatives ) ) ;
    public final void ruleGSSIfaceSpWPortType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:565:1: ( ( ( rule__GSSIfaceSpWPortType__Alternatives ) ) )
            // InternalIFACE.g:566:2: ( ( rule__GSSIfaceSpWPortType__Alternatives ) )
            {
            // InternalIFACE.g:566:2: ( ( rule__GSSIfaceSpWPortType__Alternatives ) )
            // InternalIFACE.g:567:3: ( rule__GSSIfaceSpWPortType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortTypeAccess().getAlternatives()); 
            }
            // InternalIFACE.g:568:3: ( rule__GSSIfaceSpWPortType__Alternatives )
            // InternalIFACE.g:568:4: rule__GSSIfaceSpWPortType__Alternatives
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
    // InternalIFACE.g:577:1: ruleGSSIfaceUartPortBaudRate : ( ( rule__GSSIfaceUartPortBaudRate__Alternatives ) ) ;
    public final void ruleGSSIfaceUartPortBaudRate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:581:1: ( ( ( rule__GSSIfaceUartPortBaudRate__Alternatives ) ) )
            // InternalIFACE.g:582:2: ( ( rule__GSSIfaceUartPortBaudRate__Alternatives ) )
            {
            // InternalIFACE.g:582:2: ( ( rule__GSSIfaceUartPortBaudRate__Alternatives ) )
            // InternalIFACE.g:583:3: ( rule__GSSIfaceUartPortBaudRate__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortBaudRateAccess().getAlternatives()); 
            }
            // InternalIFACE.g:584:3: ( rule__GSSIfaceUartPortBaudRate__Alternatives )
            // InternalIFACE.g:584:4: rule__GSSIfaceUartPortBaudRate__Alternatives
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
    // InternalIFACE.g:593:1: ruleGSSIfaceUartPortParity : ( ( rule__GSSIfaceUartPortParity__Alternatives ) ) ;
    public final void ruleGSSIfaceUartPortParity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:597:1: ( ( ( rule__GSSIfaceUartPortParity__Alternatives ) ) )
            // InternalIFACE.g:598:2: ( ( rule__GSSIfaceUartPortParity__Alternatives ) )
            {
            // InternalIFACE.g:598:2: ( ( rule__GSSIfaceUartPortParity__Alternatives ) )
            // InternalIFACE.g:599:3: ( rule__GSSIfaceUartPortParity__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortParityAccess().getAlternatives()); 
            }
            // InternalIFACE.g:600:3: ( rule__GSSIfaceUartPortParity__Alternatives )
            // InternalIFACE.g:600:4: rule__GSSIfaceUartPortParity__Alternatives
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
    // InternalIFACE.g:609:1: ruleGSSIfaceUartPortDataBits : ( ( rule__GSSIfaceUartPortDataBits__Alternatives ) ) ;
    public final void ruleGSSIfaceUartPortDataBits() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:613:1: ( ( ( rule__GSSIfaceUartPortDataBits__Alternatives ) ) )
            // InternalIFACE.g:614:2: ( ( rule__GSSIfaceUartPortDataBits__Alternatives ) )
            {
            // InternalIFACE.g:614:2: ( ( rule__GSSIfaceUartPortDataBits__Alternatives ) )
            // InternalIFACE.g:615:3: ( rule__GSSIfaceUartPortDataBits__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortDataBitsAccess().getAlternatives()); 
            }
            // InternalIFACE.g:616:3: ( rule__GSSIfaceUartPortDataBits__Alternatives )
            // InternalIFACE.g:616:4: rule__GSSIfaceUartPortDataBits__Alternatives
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
    // InternalIFACE.g:625:1: ruleGSSIfaceUartPortStopBits : ( ( rule__GSSIfaceUartPortStopBits__Alternatives ) ) ;
    public final void ruleGSSIfaceUartPortStopBits() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:629:1: ( ( ( rule__GSSIfaceUartPortStopBits__Alternatives ) ) )
            // InternalIFACE.g:630:2: ( ( rule__GSSIfaceUartPortStopBits__Alternatives ) )
            {
            // InternalIFACE.g:630:2: ( ( rule__GSSIfaceUartPortStopBits__Alternatives ) )
            // InternalIFACE.g:631:3: ( rule__GSSIfaceUartPortStopBits__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortStopBitsAccess().getAlternatives()); 
            }
            // InternalIFACE.g:632:3: ( rule__GSSIfaceUartPortStopBits__Alternatives )
            // InternalIFACE.g:632:4: rule__GSSIfaceUartPortStopBits__Alternatives
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
    // InternalIFACE.g:641:1: ruleGSSIfaceUartPortFlowControl : ( ( rule__GSSIfaceUartPortFlowControl__Alternatives ) ) ;
    public final void ruleGSSIfaceUartPortFlowControl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:645:1: ( ( ( rule__GSSIfaceUartPortFlowControl__Alternatives ) ) )
            // InternalIFACE.g:646:2: ( ( rule__GSSIfaceUartPortFlowControl__Alternatives ) )
            {
            // InternalIFACE.g:646:2: ( ( rule__GSSIfaceUartPortFlowControl__Alternatives ) )
            // InternalIFACE.g:647:3: ( rule__GSSIfaceUartPortFlowControl__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortFlowControlAccess().getAlternatives()); 
            }
            // InternalIFACE.g:648:3: ( rule__GSSIfaceUartPortFlowControl__Alternatives )
            // InternalIFACE.g:648:4: rule__GSSIfaceUartPortFlowControl__Alternatives
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


    // $ANTLR start "ruleGSSIfacePortProtocolUnit"
    // InternalIFACE.g:657:1: ruleGSSIfacePortProtocolUnit : ( ( rule__GSSIfacePortProtocolUnit__Alternatives ) ) ;
    public final void ruleGSSIfacePortProtocolUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:661:1: ( ( ( rule__GSSIfacePortProtocolUnit__Alternatives ) ) )
            // InternalIFACE.g:662:2: ( ( rule__GSSIfacePortProtocolUnit__Alternatives ) )
            {
            // InternalIFACE.g:662:2: ( ( rule__GSSIfacePortProtocolUnit__Alternatives ) )
            // InternalIFACE.g:663:3: ( rule__GSSIfacePortProtocolUnit__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortProtocolUnitAccess().getAlternatives()); 
            }
            // InternalIFACE.g:664:3: ( rule__GSSIfacePortProtocolUnit__Alternatives )
            // InternalIFACE.g:664:4: rule__GSSIfacePortProtocolUnit__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortProtocolUnit__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortProtocolUnitAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSIfacePortProtocolUnit"


    // $ANTLR start "ruleGSSIfacePortProtocolPower"
    // InternalIFACE.g:673:1: ruleGSSIfacePortProtocolPower : ( ( rule__GSSIfacePortProtocolPower__Alternatives ) ) ;
    public final void ruleGSSIfacePortProtocolPower() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:677:1: ( ( ( rule__GSSIfacePortProtocolPower__Alternatives ) ) )
            // InternalIFACE.g:678:2: ( ( rule__GSSIfacePortProtocolPower__Alternatives ) )
            {
            // InternalIFACE.g:678:2: ( ( rule__GSSIfacePortProtocolPower__Alternatives ) )
            // InternalIFACE.g:679:3: ( rule__GSSIfacePortProtocolPower__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortProtocolPowerAccess().getAlternatives()); 
            }
            // InternalIFACE.g:680:3: ( rule__GSSIfacePortProtocolPower__Alternatives )
            // InternalIFACE.g:680:4: rule__GSSIfacePortProtocolPower__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortProtocolPower__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortProtocolPowerAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSIfacePortProtocolPower"


    // $ANTLR start "rule__GSSIfacePort__Alternatives"
    // InternalIFACE.g:688:1: rule__GSSIfacePort__Alternatives : ( ( ruleGSSIfaceSpWPort ) | ( ruleGSSIfaceUartPort ) | ( ruleGSSIfaceSocketSrvPort ) | ( ruleGSSIfaceSocketCliPort ) | ( ruleGSSIfaceSpWTCPort ) | ( ruleGSSIfaceDummyPort ) );
    public final void rule__GSSIfacePort__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:692:1: ( ( ruleGSSIfaceSpWPort ) | ( ruleGSSIfaceUartPort ) | ( ruleGSSIfaceSocketSrvPort ) | ( ruleGSSIfaceSocketCliPort ) | ( ruleGSSIfaceSpWTCPort ) | ( ruleGSSIfaceDummyPort ) )
            int alt1=6;
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
            case 55:
                {
                alt1=3;
                }
                break;
            case 57:
                {
                alt1=4;
                }
                break;
            case 67:
                {
                alt1=5;
                }
                break;
            case 69:
                {
                alt1=6;
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
                    // InternalIFACE.g:693:2: ( ruleGSSIfaceSpWPort )
                    {
                    // InternalIFACE.g:693:2: ( ruleGSSIfaceSpWPort )
                    // InternalIFACE.g:694:3: ruleGSSIfaceSpWPort
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
                    // InternalIFACE.g:699:2: ( ruleGSSIfaceUartPort )
                    {
                    // InternalIFACE.g:699:2: ( ruleGSSIfaceUartPort )
                    // InternalIFACE.g:700:3: ruleGSSIfaceUartPort
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
                    // InternalIFACE.g:705:2: ( ruleGSSIfaceSocketSrvPort )
                    {
                    // InternalIFACE.g:705:2: ( ruleGSSIfaceSocketSrvPort )
                    // InternalIFACE.g:706:3: ruleGSSIfaceSocketSrvPort
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSocketSrvPortParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleGSSIfaceSocketSrvPort();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSocketSrvPortParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalIFACE.g:711:2: ( ruleGSSIfaceSocketCliPort )
                    {
                    // InternalIFACE.g:711:2: ( ruleGSSIfaceSocketCliPort )
                    // InternalIFACE.g:712:3: ruleGSSIfaceSocketCliPort
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSocketCliPortParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleGSSIfaceSocketCliPort();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSocketCliPortParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalIFACE.g:717:2: ( ruleGSSIfaceSpWTCPort )
                    {
                    // InternalIFACE.g:717:2: ( ruleGSSIfaceSpWTCPort )
                    // InternalIFACE.g:718:3: ruleGSSIfaceSpWTCPort
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSpWTCPortParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleGSSIfaceSpWTCPort();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSpWTCPortParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalIFACE.g:723:2: ( ruleGSSIfaceDummyPort )
                    {
                    // InternalIFACE.g:723:2: ( ruleGSSIfaceDummyPort )
                    // InternalIFACE.g:724:3: ruleGSSIfaceDummyPort
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfacePortAccess().getGSSIfaceDummyPortParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleGSSIfaceDummyPort();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfacePortAccess().getGSSIfaceDummyPortParserRuleCall_5()); 
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
    // InternalIFACE.g:733:1: rule__Version__Alternatives_0 : ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) );
    public final void rule__Version__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:737:1: ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||LA2_1==35||LA2_1==70||LA2_1==72) ) {
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
                    // InternalIFACE.g:738:2: ( RULE_INT )
                    {
                    // InternalIFACE.g:738:2: ( RULE_INT )
                    // InternalIFACE.g:739:3: RULE_INT
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
                    // InternalIFACE.g:744:2: ( ( rule__Version__Group_0_1__0 ) )
                    {
                    // InternalIFACE.g:744:2: ( ( rule__Version__Group_0_1__0 ) )
                    // InternalIFACE.g:745:3: ( rule__Version__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_0_1()); 
                    }
                    // InternalIFACE.g:746:3: ( rule__Version__Group_0_1__0 )
                    // InternalIFACE.g:746:4: rule__Version__Group_0_1__0
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
    // InternalIFACE.g:754:1: rule__Version__Alternatives_1_1 : ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) );
    public final void rule__Version__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:758:1: ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==35||LA3_1==70||LA3_1==72) ) {
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
                    // InternalIFACE.g:759:2: ( RULE_INT )
                    {
                    // InternalIFACE.g:759:2: ( RULE_INT )
                    // InternalIFACE.g:760:3: RULE_INT
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
                    // InternalIFACE.g:765:2: ( ( rule__Version__Group_1_1_1__0 ) )
                    {
                    // InternalIFACE.g:765:2: ( ( rule__Version__Group_1_1_1__0 ) )
                    // InternalIFACE.g:766:3: ( rule__Version__Group_1_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_1_1_1()); 
                    }
                    // InternalIFACE.g:767:3: ( rule__Version__Group_1_1_1__0 )
                    // InternalIFACE.g:767:4: rule__Version__Group_1_1_1__0
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
    // InternalIFACE.g:775:1: rule__INTEGER__Alternatives : ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) );
    public final void rule__INTEGER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:779:1: ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||LA4_0==73) ) {
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
                    // InternalIFACE.g:780:2: ( ( rule__INTEGER__Group_0__0 ) )
                    {
                    // InternalIFACE.g:780:2: ( ( rule__INTEGER__Group_0__0 ) )
                    // InternalIFACE.g:781:3: ( rule__INTEGER__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getINTEGERAccess().getGroup_0()); 
                    }
                    // InternalIFACE.g:782:3: ( rule__INTEGER__Group_0__0 )
                    // InternalIFACE.g:782:4: rule__INTEGER__Group_0__0
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
                    // InternalIFACE.g:786:2: ( RULE_HEXADECIMAL )
                    {
                    // InternalIFACE.g:786:2: ( RULE_HEXADECIMAL )
                    // InternalIFACE.g:787:3: RULE_HEXADECIMAL
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
    // InternalIFACE.g:796:1: rule__GSSIfaceSpWPortType__Alternatives : ( ( ( 'usb' ) ) | ( ( 'mk2' ) ) | ( ( 'pci' ) ) );
    public final void rule__GSSIfaceSpWPortType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:800:1: ( ( ( 'usb' ) ) | ( ( 'mk2' ) ) | ( ( 'pci' ) ) )
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
                    // InternalIFACE.g:801:2: ( ( 'usb' ) )
                    {
                    // InternalIFACE.g:801:2: ( ( 'usb' ) )
                    // InternalIFACE.g:802:3: ( 'usb' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceSpWPortTypeAccess().getUsbEnumLiteralDeclaration_0()); 
                    }
                    // InternalIFACE.g:803:3: ( 'usb' )
                    // InternalIFACE.g:803:4: 'usb'
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
                    // InternalIFACE.g:807:2: ( ( 'mk2' ) )
                    {
                    // InternalIFACE.g:807:2: ( ( 'mk2' ) )
                    // InternalIFACE.g:808:3: ( 'mk2' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceSpWPortTypeAccess().getMk2EnumLiteralDeclaration_1()); 
                    }
                    // InternalIFACE.g:809:3: ( 'mk2' )
                    // InternalIFACE.g:809:4: 'mk2'
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
                    // InternalIFACE.g:813:2: ( ( 'pci' ) )
                    {
                    // InternalIFACE.g:813:2: ( ( 'pci' ) )
                    // InternalIFACE.g:814:3: ( 'pci' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceSpWPortTypeAccess().getPciEnumLiteralDeclaration_2()); 
                    }
                    // InternalIFACE.g:815:3: ( 'pci' )
                    // InternalIFACE.g:815:4: 'pci'
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
    // InternalIFACE.g:823:1: rule__GSSIfaceUartPortBaudRate__Alternatives : ( ( ( '38400bauds' ) ) | ( ( '115200bauds' ) ) );
    public final void rule__GSSIfaceUartPortBaudRate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:827:1: ( ( ( '38400bauds' ) ) | ( ( '115200bauds' ) ) )
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
                    // InternalIFACE.g:828:2: ( ( '38400bauds' ) )
                    {
                    // InternalIFACE.g:828:2: ( ( '38400bauds' ) )
                    // InternalIFACE.g:829:3: ( '38400bauds' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortBaudRateAccess().get_38400EnumLiteralDeclaration_0()); 
                    }
                    // InternalIFACE.g:830:3: ( '38400bauds' )
                    // InternalIFACE.g:830:4: '38400bauds'
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
                    // InternalIFACE.g:834:2: ( ( '115200bauds' ) )
                    {
                    // InternalIFACE.g:834:2: ( ( '115200bauds' ) )
                    // InternalIFACE.g:835:3: ( '115200bauds' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortBaudRateAccess().get_115200EnumLiteralDeclaration_1()); 
                    }
                    // InternalIFACE.g:836:3: ( '115200bauds' )
                    // InternalIFACE.g:836:4: '115200bauds'
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
    // InternalIFACE.g:844:1: rule__GSSIfaceUartPortParity__Alternatives : ( ( ( 'NO' ) ) | ( ( 'ODD' ) ) | ( ( 'EVEN' ) ) | ( ( 'MARK' ) ) | ( ( 'SPACE' ) ) );
    public final void rule__GSSIfaceUartPortParity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:848:1: ( ( ( 'NO' ) ) | ( ( 'ODD' ) ) | ( ( 'EVEN' ) ) | ( ( 'MARK' ) ) | ( ( 'SPACE' ) ) )
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
                    // InternalIFACE.g:849:2: ( ( 'NO' ) )
                    {
                    // InternalIFACE.g:849:2: ( ( 'NO' ) )
                    // InternalIFACE.g:850:3: ( 'NO' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortParityAccess().getNOEnumLiteralDeclaration_0()); 
                    }
                    // InternalIFACE.g:851:3: ( 'NO' )
                    // InternalIFACE.g:851:4: 'NO'
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
                    // InternalIFACE.g:855:2: ( ( 'ODD' ) )
                    {
                    // InternalIFACE.g:855:2: ( ( 'ODD' ) )
                    // InternalIFACE.g:856:3: ( 'ODD' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortParityAccess().getODDEnumLiteralDeclaration_1()); 
                    }
                    // InternalIFACE.g:857:3: ( 'ODD' )
                    // InternalIFACE.g:857:4: 'ODD'
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
                    // InternalIFACE.g:861:2: ( ( 'EVEN' ) )
                    {
                    // InternalIFACE.g:861:2: ( ( 'EVEN' ) )
                    // InternalIFACE.g:862:3: ( 'EVEN' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortParityAccess().getEVENEnumLiteralDeclaration_2()); 
                    }
                    // InternalIFACE.g:863:3: ( 'EVEN' )
                    // InternalIFACE.g:863:4: 'EVEN'
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
                    // InternalIFACE.g:867:2: ( ( 'MARK' ) )
                    {
                    // InternalIFACE.g:867:2: ( ( 'MARK' ) )
                    // InternalIFACE.g:868:3: ( 'MARK' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortParityAccess().getMARKEnumLiteralDeclaration_3()); 
                    }
                    // InternalIFACE.g:869:3: ( 'MARK' )
                    // InternalIFACE.g:869:4: 'MARK'
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
                    // InternalIFACE.g:873:2: ( ( 'SPACE' ) )
                    {
                    // InternalIFACE.g:873:2: ( ( 'SPACE' ) )
                    // InternalIFACE.g:874:3: ( 'SPACE' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortParityAccess().getSPACEEnumLiteralDeclaration_4()); 
                    }
                    // InternalIFACE.g:875:3: ( 'SPACE' )
                    // InternalIFACE.g:875:4: 'SPACE'
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
    // InternalIFACE.g:883:1: rule__GSSIfaceUartPortDataBits__Alternatives : ( ( ( '5bits' ) ) | ( ( '6bits' ) ) | ( ( '7bits' ) ) | ( ( '8bits' ) ) );
    public final void rule__GSSIfaceUartPortDataBits__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:887:1: ( ( ( '5bits' ) ) | ( ( '6bits' ) ) | ( ( '7bits' ) ) | ( ( '8bits' ) ) )
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
                    // InternalIFACE.g:888:2: ( ( '5bits' ) )
                    {
                    // InternalIFACE.g:888:2: ( ( '5bits' ) )
                    // InternalIFACE.g:889:3: ( '5bits' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_5EnumLiteralDeclaration_0()); 
                    }
                    // InternalIFACE.g:890:3: ( '5bits' )
                    // InternalIFACE.g:890:4: '5bits'
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
                    // InternalIFACE.g:894:2: ( ( '6bits' ) )
                    {
                    // InternalIFACE.g:894:2: ( ( '6bits' ) )
                    // InternalIFACE.g:895:3: ( '6bits' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_6EnumLiteralDeclaration_1()); 
                    }
                    // InternalIFACE.g:896:3: ( '6bits' )
                    // InternalIFACE.g:896:4: '6bits'
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
                    // InternalIFACE.g:900:2: ( ( '7bits' ) )
                    {
                    // InternalIFACE.g:900:2: ( ( '7bits' ) )
                    // InternalIFACE.g:901:3: ( '7bits' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_7EnumLiteralDeclaration_2()); 
                    }
                    // InternalIFACE.g:902:3: ( '7bits' )
                    // InternalIFACE.g:902:4: '7bits'
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
                    // InternalIFACE.g:906:2: ( ( '8bits' ) )
                    {
                    // InternalIFACE.g:906:2: ( ( '8bits' ) )
                    // InternalIFACE.g:907:3: ( '8bits' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_8EnumLiteralDeclaration_3()); 
                    }
                    // InternalIFACE.g:908:3: ( '8bits' )
                    // InternalIFACE.g:908:4: '8bits'
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
    // InternalIFACE.g:916:1: rule__GSSIfaceUartPortStopBits__Alternatives : ( ( ( '1bit' ) ) | ( ( '2bits' ) ) );
    public final void rule__GSSIfaceUartPortStopBits__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:920:1: ( ( ( '1bit' ) ) | ( ( '2bits' ) ) )
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
                    // InternalIFACE.g:921:2: ( ( '1bit' ) )
                    {
                    // InternalIFACE.g:921:2: ( ( '1bit' ) )
                    // InternalIFACE.g:922:3: ( '1bit' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortStopBitsAccess().get_1EnumLiteralDeclaration_0()); 
                    }
                    // InternalIFACE.g:923:3: ( '1bit' )
                    // InternalIFACE.g:923:4: '1bit'
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
                    // InternalIFACE.g:927:2: ( ( '2bits' ) )
                    {
                    // InternalIFACE.g:927:2: ( ( '2bits' ) )
                    // InternalIFACE.g:928:3: ( '2bits' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortStopBitsAccess().get_2EnumLiteralDeclaration_1()); 
                    }
                    // InternalIFACE.g:929:3: ( '2bits' )
                    // InternalIFACE.g:929:4: '2bits'
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
    // InternalIFACE.g:937:1: rule__GSSIfaceUartPortFlowControl__Alternatives : ( ( ( 'rts_cts' ) ) | ( ( 'xon_xoff' ) ) );
    public final void rule__GSSIfaceUartPortFlowControl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:941:1: ( ( ( 'rts_cts' ) ) | ( ( 'xon_xoff' ) ) )
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
                    // InternalIFACE.g:942:2: ( ( 'rts_cts' ) )
                    {
                    // InternalIFACE.g:942:2: ( ( 'rts_cts' ) )
                    // InternalIFACE.g:943:3: ( 'rts_cts' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortFlowControlAccess().getRts_ctsEnumLiteralDeclaration_0()); 
                    }
                    // InternalIFACE.g:944:3: ( 'rts_cts' )
                    // InternalIFACE.g:944:4: 'rts_cts'
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
                    // InternalIFACE.g:948:2: ( ( 'xon_xoff' ) )
                    {
                    // InternalIFACE.g:948:2: ( ( 'xon_xoff' ) )
                    // InternalIFACE.g:949:3: ( 'xon_xoff' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfaceUartPortFlowControlAccess().getXon_xoffEnumLiteralDeclaration_1()); 
                    }
                    // InternalIFACE.g:950:3: ( 'xon_xoff' )
                    // InternalIFACE.g:950:4: 'xon_xoff'
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


    // $ANTLR start "rule__GSSIfacePortProtocolUnit__Alternatives"
    // InternalIFACE.g:958:1: rule__GSSIfacePortProtocolUnit__Alternatives : ( ( ( 'bytes' ) ) | ( ( 'bits' ) ) );
    public final void rule__GSSIfacePortProtocolUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:962:1: ( ( ( 'bytes' ) ) | ( ( 'bits' ) ) )
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
                    // InternalIFACE.g:963:2: ( ( 'bytes' ) )
                    {
                    // InternalIFACE.g:963:2: ( ( 'bytes' ) )
                    // InternalIFACE.g:964:3: ( 'bytes' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfacePortProtocolUnitAccess().getBytesEnumLiteralDeclaration_0()); 
                    }
                    // InternalIFACE.g:965:3: ( 'bytes' )
                    // InternalIFACE.g:965:4: 'bytes'
                    {
                    match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfacePortProtocolUnitAccess().getBytesEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:969:2: ( ( 'bits' ) )
                    {
                    // InternalIFACE.g:969:2: ( ( 'bits' ) )
                    // InternalIFACE.g:970:3: ( 'bits' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfacePortProtocolUnitAccess().getBitsEnumLiteralDeclaration_1()); 
                    }
                    // InternalIFACE.g:971:3: ( 'bits' )
                    // InternalIFACE.g:971:4: 'bits'
                    {
                    match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfacePortProtocolUnitAccess().getBitsEnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__GSSIfacePortProtocolUnit__Alternatives"


    // $ANTLR start "rule__GSSIfacePortProtocolPower__Alternatives"
    // InternalIFACE.g:979:1: rule__GSSIfacePortProtocolPower__Alternatives : ( ( ( 'no' ) ) | ( ( '2bits' ) ) | ( ( '2_with_0' ) ) );
    public final void rule__GSSIfacePortProtocolPower__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:983:1: ( ( ( 'no' ) ) | ( ( '2bits' ) ) | ( ( '2_with_0' ) ) )
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
                    // InternalIFACE.g:984:2: ( ( 'no' ) )
                    {
                    // InternalIFACE.g:984:2: ( ( 'no' ) )
                    // InternalIFACE.g:985:3: ( 'no' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfacePortProtocolPowerAccess().getNoEnumLiteralDeclaration_0()); 
                    }
                    // InternalIFACE.g:986:3: ( 'no' )
                    // InternalIFACE.g:986:4: 'no'
                    {
                    match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfacePortProtocolPowerAccess().getNoEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:990:2: ( ( '2bits' ) )
                    {
                    // InternalIFACE.g:990:2: ( ( '2bits' ) )
                    // InternalIFACE.g:991:3: ( '2bits' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfacePortProtocolPowerAccess().get_2EnumLiteralDeclaration_1()); 
                    }
                    // InternalIFACE.g:992:3: ( '2bits' )
                    // InternalIFACE.g:992:4: '2bits'
                    {
                    match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfacePortProtocolPowerAccess().get_2EnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIFACE.g:996:2: ( ( '2_with_0' ) )
                    {
                    // InternalIFACE.g:996:2: ( ( '2_with_0' ) )
                    // InternalIFACE.g:997:3: ( '2_with_0' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfacePortProtocolPowerAccess().get_2_with_0EnumLiteralDeclaration_2()); 
                    }
                    // InternalIFACE.g:998:3: ( '2_with_0' )
                    // InternalIFACE.g:998:4: '2_with_0'
                    {
                    match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSIfacePortProtocolPowerAccess().get_2_with_0EnumLiteralDeclaration_2()); 
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
    // $ANTLR end "rule__GSSIfacePortProtocolPower__Alternatives"


    // $ANTLR start "rule__GSSModelFile__Group__0"
    // InternalIFACE.g:1006:1: rule__GSSModelFile__Group__0 : rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1 ;
    public final void rule__GSSModelFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1010:1: ( rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1 )
            // InternalIFACE.g:1011:2: rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1
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
    // InternalIFACE.g:1018:1: rule__GSSModelFile__Group__0__Impl : ( ( rule__GSSModelFile__ImportsAssignment_0 )* ) ;
    public final void rule__GSSModelFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1022:1: ( ( ( rule__GSSModelFile__ImportsAssignment_0 )* ) )
            // InternalIFACE.g:1023:1: ( ( rule__GSSModelFile__ImportsAssignment_0 )* )
            {
            // InternalIFACE.g:1023:1: ( ( rule__GSSModelFile__ImportsAssignment_0 )* )
            // InternalIFACE.g:1024:2: ( rule__GSSModelFile__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getImportsAssignment_0()); 
            }
            // InternalIFACE.g:1025:2: ( rule__GSSModelFile__ImportsAssignment_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==34) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalIFACE.g:1025:3: rule__GSSModelFile__ImportsAssignment_0
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
    // InternalIFACE.g:1033:1: rule__GSSModelFile__Group__1 : rule__GSSModelFile__Group__1__Impl ;
    public final void rule__GSSModelFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1037:1: ( rule__GSSModelFile__Group__1__Impl )
            // InternalIFACE.g:1038:2: rule__GSSModelFile__Group__1__Impl
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
    // InternalIFACE.g:1044:1: rule__GSSModelFile__Group__1__Impl : ( ( rule__GSSModelFile__ElementAssignment_1 ) ) ;
    public final void rule__GSSModelFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1048:1: ( ( ( rule__GSSModelFile__ElementAssignment_1 ) ) )
            // InternalIFACE.g:1049:1: ( ( rule__GSSModelFile__ElementAssignment_1 ) )
            {
            // InternalIFACE.g:1049:1: ( ( rule__GSSModelFile__ElementAssignment_1 ) )
            // InternalIFACE.g:1050:2: ( rule__GSSModelFile__ElementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getElementAssignment_1()); 
            }
            // InternalIFACE.g:1051:2: ( rule__GSSModelFile__ElementAssignment_1 )
            // InternalIFACE.g:1051:3: rule__GSSModelFile__ElementAssignment_1
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
    // InternalIFACE.g:1060:1: rule__GSSModelFileImport__Group__0 : rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1 ;
    public final void rule__GSSModelFileImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1064:1: ( rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1 )
            // InternalIFACE.g:1065:2: rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1
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
    // InternalIFACE.g:1072:1: rule__GSSModelFileImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__GSSModelFileImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1076:1: ( ( 'import' ) )
            // InternalIFACE.g:1077:1: ( 'import' )
            {
            // InternalIFACE.g:1077:1: ( 'import' )
            // InternalIFACE.g:1078:2: 'import'
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
    // InternalIFACE.g:1087:1: rule__GSSModelFileImport__Group__1 : rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2 ;
    public final void rule__GSSModelFileImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1091:1: ( rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2 )
            // InternalIFACE.g:1092:2: rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2
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
    // InternalIFACE.g:1099:1: rule__GSSModelFileImport__Group__1__Impl : ( ( rule__GSSModelFileImport__ImportURIAssignment_1 ) ) ;
    public final void rule__GSSModelFileImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1103:1: ( ( ( rule__GSSModelFileImport__ImportURIAssignment_1 ) ) )
            // InternalIFACE.g:1104:1: ( ( rule__GSSModelFileImport__ImportURIAssignment_1 ) )
            {
            // InternalIFACE.g:1104:1: ( ( rule__GSSModelFileImport__ImportURIAssignment_1 ) )
            // InternalIFACE.g:1105:2: ( rule__GSSModelFileImport__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getImportURIAssignment_1()); 
            }
            // InternalIFACE.g:1106:2: ( rule__GSSModelFileImport__ImportURIAssignment_1 )
            // InternalIFACE.g:1106:3: rule__GSSModelFileImport__ImportURIAssignment_1
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
    // InternalIFACE.g:1114:1: rule__GSSModelFileImport__Group__2 : rule__GSSModelFileImport__Group__2__Impl ;
    public final void rule__GSSModelFileImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1118:1: ( rule__GSSModelFileImport__Group__2__Impl )
            // InternalIFACE.g:1119:2: rule__GSSModelFileImport__Group__2__Impl
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
    // InternalIFACE.g:1125:1: rule__GSSModelFileImport__Group__2__Impl : ( ';' ) ;
    public final void rule__GSSModelFileImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1129:1: ( ( ';' ) )
            // InternalIFACE.g:1130:1: ( ';' )
            {
            // InternalIFACE.g:1130:1: ( ';' )
            // InternalIFACE.g:1131:2: ';'
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
    // InternalIFACE.g:1141:1: rule__GSSIfacePortConfig__Group__0 : rule__GSSIfacePortConfig__Group__0__Impl rule__GSSIfacePortConfig__Group__1 ;
    public final void rule__GSSIfacePortConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1145:1: ( rule__GSSIfacePortConfig__Group__0__Impl rule__GSSIfacePortConfig__Group__1 )
            // InternalIFACE.g:1146:2: rule__GSSIfacePortConfig__Group__0__Impl rule__GSSIfacePortConfig__Group__1
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
    // InternalIFACE.g:1153:1: rule__GSSIfacePortConfig__Group__0__Impl : ( 'portConfig' ) ;
    public final void rule__GSSIfacePortConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1157:1: ( ( 'portConfig' ) )
            // InternalIFACE.g:1158:1: ( 'portConfig' )
            {
            // InternalIFACE.g:1158:1: ( 'portConfig' )
            // InternalIFACE.g:1159:2: 'portConfig'
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
    // InternalIFACE.g:1168:1: rule__GSSIfacePortConfig__Group__1 : rule__GSSIfacePortConfig__Group__1__Impl rule__GSSIfacePortConfig__Group__2 ;
    public final void rule__GSSIfacePortConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1172:1: ( rule__GSSIfacePortConfig__Group__1__Impl rule__GSSIfacePortConfig__Group__2 )
            // InternalIFACE.g:1173:2: rule__GSSIfacePortConfig__Group__1__Impl rule__GSSIfacePortConfig__Group__2
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
    // InternalIFACE.g:1180:1: rule__GSSIfacePortConfig__Group__1__Impl : ( ( rule__GSSIfacePortConfig__NameAssignment_1 ) ) ;
    public final void rule__GSSIfacePortConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1184:1: ( ( ( rule__GSSIfacePortConfig__NameAssignment_1 ) ) )
            // InternalIFACE.g:1185:1: ( ( rule__GSSIfacePortConfig__NameAssignment_1 ) )
            {
            // InternalIFACE.g:1185:1: ( ( rule__GSSIfacePortConfig__NameAssignment_1 ) )
            // InternalIFACE.g:1186:2: ( rule__GSSIfacePortConfig__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getNameAssignment_1()); 
            }
            // InternalIFACE.g:1187:2: ( rule__GSSIfacePortConfig__NameAssignment_1 )
            // InternalIFACE.g:1187:3: rule__GSSIfacePortConfig__NameAssignment_1
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
    // InternalIFACE.g:1195:1: rule__GSSIfacePortConfig__Group__2 : rule__GSSIfacePortConfig__Group__2__Impl rule__GSSIfacePortConfig__Group__3 ;
    public final void rule__GSSIfacePortConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1199:1: ( rule__GSSIfacePortConfig__Group__2__Impl rule__GSSIfacePortConfig__Group__3 )
            // InternalIFACE.g:1200:2: rule__GSSIfacePortConfig__Group__2__Impl rule__GSSIfacePortConfig__Group__3
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
    // InternalIFACE.g:1207:1: rule__GSSIfacePortConfig__Group__2__Impl : ( '{' ) ;
    public final void rule__GSSIfacePortConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1211:1: ( ( '{' ) )
            // InternalIFACE.g:1212:1: ( '{' )
            {
            // InternalIFACE.g:1212:1: ( '{' )
            // InternalIFACE.g:1213:2: '{'
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
    // InternalIFACE.g:1222:1: rule__GSSIfacePortConfig__Group__3 : rule__GSSIfacePortConfig__Group__3__Impl rule__GSSIfacePortConfig__Group__4 ;
    public final void rule__GSSIfacePortConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1226:1: ( rule__GSSIfacePortConfig__Group__3__Impl rule__GSSIfacePortConfig__Group__4 )
            // InternalIFACE.g:1227:2: rule__GSSIfacePortConfig__Group__3__Impl rule__GSSIfacePortConfig__Group__4
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
    // InternalIFACE.g:1234:1: rule__GSSIfacePortConfig__Group__3__Impl : ( ( rule__GSSIfacePortConfig__UnorderedGroup_3 ) ) ;
    public final void rule__GSSIfacePortConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1238:1: ( ( ( rule__GSSIfacePortConfig__UnorderedGroup_3 ) ) )
            // InternalIFACE.g:1239:1: ( ( rule__GSSIfacePortConfig__UnorderedGroup_3 ) )
            {
            // InternalIFACE.g:1239:1: ( ( rule__GSSIfacePortConfig__UnorderedGroup_3 ) )
            // InternalIFACE.g:1240:2: ( rule__GSSIfacePortConfig__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3()); 
            }
            // InternalIFACE.g:1241:2: ( rule__GSSIfacePortConfig__UnorderedGroup_3 )
            // InternalIFACE.g:1241:3: rule__GSSIfacePortConfig__UnorderedGroup_3
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
    // InternalIFACE.g:1249:1: rule__GSSIfacePortConfig__Group__4 : rule__GSSIfacePortConfig__Group__4__Impl rule__GSSIfacePortConfig__Group__5 ;
    public final void rule__GSSIfacePortConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1253:1: ( rule__GSSIfacePortConfig__Group__4__Impl rule__GSSIfacePortConfig__Group__5 )
            // InternalIFACE.g:1254:2: rule__GSSIfacePortConfig__Group__4__Impl rule__GSSIfacePortConfig__Group__5
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
    // InternalIFACE.g:1261:1: rule__GSSIfacePortConfig__Group__4__Impl : ( ( rule__GSSIfacePortConfig__PortConfigAssignment_4 ) ) ;
    public final void rule__GSSIfacePortConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1265:1: ( ( ( rule__GSSIfacePortConfig__PortConfigAssignment_4 ) ) )
            // InternalIFACE.g:1266:1: ( ( rule__GSSIfacePortConfig__PortConfigAssignment_4 ) )
            {
            // InternalIFACE.g:1266:1: ( ( rule__GSSIfacePortConfig__PortConfigAssignment_4 ) )
            // InternalIFACE.g:1267:2: ( rule__GSSIfacePortConfig__PortConfigAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getPortConfigAssignment_4()); 
            }
            // InternalIFACE.g:1268:2: ( rule__GSSIfacePortConfig__PortConfigAssignment_4 )
            // InternalIFACE.g:1268:3: rule__GSSIfacePortConfig__PortConfigAssignment_4
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
    // InternalIFACE.g:1276:1: rule__GSSIfacePortConfig__Group__5 : rule__GSSIfacePortConfig__Group__5__Impl rule__GSSIfacePortConfig__Group__6 ;
    public final void rule__GSSIfacePortConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1280:1: ( rule__GSSIfacePortConfig__Group__5__Impl rule__GSSIfacePortConfig__Group__6 )
            // InternalIFACE.g:1281:2: rule__GSSIfacePortConfig__Group__5__Impl rule__GSSIfacePortConfig__Group__6
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
    // InternalIFACE.g:1288:1: rule__GSSIfacePortConfig__Group__5__Impl : ( '}' ) ;
    public final void rule__GSSIfacePortConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1292:1: ( ( '}' ) )
            // InternalIFACE.g:1293:1: ( '}' )
            {
            // InternalIFACE.g:1293:1: ( '}' )
            // InternalIFACE.g:1294:2: '}'
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
    // InternalIFACE.g:1303:1: rule__GSSIfacePortConfig__Group__6 : rule__GSSIfacePortConfig__Group__6__Impl ;
    public final void rule__GSSIfacePortConfig__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1307:1: ( rule__GSSIfacePortConfig__Group__6__Impl )
            // InternalIFACE.g:1308:2: rule__GSSIfacePortConfig__Group__6__Impl
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
    // InternalIFACE.g:1314:1: rule__GSSIfacePortConfig__Group__6__Impl : ( ';' ) ;
    public final void rule__GSSIfacePortConfig__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1318:1: ( ( ';' ) )
            // InternalIFACE.g:1319:1: ( ';' )
            {
            // InternalIFACE.g:1319:1: ( ';' )
            // InternalIFACE.g:1320:2: ';'
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
    // InternalIFACE.g:1330:1: rule__GSSIfacePortConfig__Group_3_0__0 : rule__GSSIfacePortConfig__Group_3_0__0__Impl rule__GSSIfacePortConfig__Group_3_0__1 ;
    public final void rule__GSSIfacePortConfig__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1334:1: ( rule__GSSIfacePortConfig__Group_3_0__0__Impl rule__GSSIfacePortConfig__Group_3_0__1 )
            // InternalIFACE.g:1335:2: rule__GSSIfacePortConfig__Group_3_0__0__Impl rule__GSSIfacePortConfig__Group_3_0__1
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
    // InternalIFACE.g:1342:1: rule__GSSIfacePortConfig__Group_3_0__0__Impl : ( 'uri' ) ;
    public final void rule__GSSIfacePortConfig__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1346:1: ( ( 'uri' ) )
            // InternalIFACE.g:1347:1: ( 'uri' )
            {
            // InternalIFACE.g:1347:1: ( 'uri' )
            // InternalIFACE.g:1348:2: 'uri'
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
    // InternalIFACE.g:1357:1: rule__GSSIfacePortConfig__Group_3_0__1 : rule__GSSIfacePortConfig__Group_3_0__1__Impl rule__GSSIfacePortConfig__Group_3_0__2 ;
    public final void rule__GSSIfacePortConfig__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1361:1: ( rule__GSSIfacePortConfig__Group_3_0__1__Impl rule__GSSIfacePortConfig__Group_3_0__2 )
            // InternalIFACE.g:1362:2: rule__GSSIfacePortConfig__Group_3_0__1__Impl rule__GSSIfacePortConfig__Group_3_0__2
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
    // InternalIFACE.g:1369:1: rule__GSSIfacePortConfig__Group_3_0__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfacePortConfig__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1373:1: ( ( ':=' ) )
            // InternalIFACE.g:1374:1: ( ':=' )
            {
            // InternalIFACE.g:1374:1: ( ':=' )
            // InternalIFACE.g:1375:2: ':='
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
    // InternalIFACE.g:1384:1: rule__GSSIfacePortConfig__Group_3_0__2 : rule__GSSIfacePortConfig__Group_3_0__2__Impl rule__GSSIfacePortConfig__Group_3_0__3 ;
    public final void rule__GSSIfacePortConfig__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1388:1: ( rule__GSSIfacePortConfig__Group_3_0__2__Impl rule__GSSIfacePortConfig__Group_3_0__3 )
            // InternalIFACE.g:1389:2: rule__GSSIfacePortConfig__Group_3_0__2__Impl rule__GSSIfacePortConfig__Group_3_0__3
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
    // InternalIFACE.g:1396:1: rule__GSSIfacePortConfig__Group_3_0__2__Impl : ( ( rule__GSSIfacePortConfig__UriAssignment_3_0_2 ) ) ;
    public final void rule__GSSIfacePortConfig__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1400:1: ( ( ( rule__GSSIfacePortConfig__UriAssignment_3_0_2 ) ) )
            // InternalIFACE.g:1401:1: ( ( rule__GSSIfacePortConfig__UriAssignment_3_0_2 ) )
            {
            // InternalIFACE.g:1401:1: ( ( rule__GSSIfacePortConfig__UriAssignment_3_0_2 ) )
            // InternalIFACE.g:1402:2: ( rule__GSSIfacePortConfig__UriAssignment_3_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getUriAssignment_3_0_2()); 
            }
            // InternalIFACE.g:1403:2: ( rule__GSSIfacePortConfig__UriAssignment_3_0_2 )
            // InternalIFACE.g:1403:3: rule__GSSIfacePortConfig__UriAssignment_3_0_2
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
    // InternalIFACE.g:1411:1: rule__GSSIfacePortConfig__Group_3_0__3 : rule__GSSIfacePortConfig__Group_3_0__3__Impl ;
    public final void rule__GSSIfacePortConfig__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1415:1: ( rule__GSSIfacePortConfig__Group_3_0__3__Impl )
            // InternalIFACE.g:1416:2: rule__GSSIfacePortConfig__Group_3_0__3__Impl
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
    // InternalIFACE.g:1422:1: rule__GSSIfacePortConfig__Group_3_0__3__Impl : ( ';' ) ;
    public final void rule__GSSIfacePortConfig__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1426:1: ( ( ';' ) )
            // InternalIFACE.g:1427:1: ( ';' )
            {
            // InternalIFACE.g:1427:1: ( ';' )
            // InternalIFACE.g:1428:2: ';'
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
    // InternalIFACE.g:1438:1: rule__GSSIfacePortConfig__Group_3_1__0 : rule__GSSIfacePortConfig__Group_3_1__0__Impl rule__GSSIfacePortConfig__Group_3_1__1 ;
    public final void rule__GSSIfacePortConfig__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1442:1: ( rule__GSSIfacePortConfig__Group_3_1__0__Impl rule__GSSIfacePortConfig__Group_3_1__1 )
            // InternalIFACE.g:1443:2: rule__GSSIfacePortConfig__Group_3_1__0__Impl rule__GSSIfacePortConfig__Group_3_1__1
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
    // InternalIFACE.g:1450:1: rule__GSSIfacePortConfig__Group_3_1__0__Impl : ( 'version' ) ;
    public final void rule__GSSIfacePortConfig__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1454:1: ( ( 'version' ) )
            // InternalIFACE.g:1455:1: ( 'version' )
            {
            // InternalIFACE.g:1455:1: ( 'version' )
            // InternalIFACE.g:1456:2: 'version'
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
    // InternalIFACE.g:1465:1: rule__GSSIfacePortConfig__Group_3_1__1 : rule__GSSIfacePortConfig__Group_3_1__1__Impl rule__GSSIfacePortConfig__Group_3_1__2 ;
    public final void rule__GSSIfacePortConfig__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1469:1: ( rule__GSSIfacePortConfig__Group_3_1__1__Impl rule__GSSIfacePortConfig__Group_3_1__2 )
            // InternalIFACE.g:1470:2: rule__GSSIfacePortConfig__Group_3_1__1__Impl rule__GSSIfacePortConfig__Group_3_1__2
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
    // InternalIFACE.g:1477:1: rule__GSSIfacePortConfig__Group_3_1__1__Impl : ( ':=' ) ;
    public final void rule__GSSIfacePortConfig__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1481:1: ( ( ':=' ) )
            // InternalIFACE.g:1482:1: ( ':=' )
            {
            // InternalIFACE.g:1482:1: ( ':=' )
            // InternalIFACE.g:1483:2: ':='
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
    // InternalIFACE.g:1492:1: rule__GSSIfacePortConfig__Group_3_1__2 : rule__GSSIfacePortConfig__Group_3_1__2__Impl rule__GSSIfacePortConfig__Group_3_1__3 ;
    public final void rule__GSSIfacePortConfig__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1496:1: ( rule__GSSIfacePortConfig__Group_3_1__2__Impl rule__GSSIfacePortConfig__Group_3_1__3 )
            // InternalIFACE.g:1497:2: rule__GSSIfacePortConfig__Group_3_1__2__Impl rule__GSSIfacePortConfig__Group_3_1__3
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
    // InternalIFACE.g:1504:1: rule__GSSIfacePortConfig__Group_3_1__2__Impl : ( ( rule__GSSIfacePortConfig__VersionAssignment_3_1_2 ) ) ;
    public final void rule__GSSIfacePortConfig__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1508:1: ( ( ( rule__GSSIfacePortConfig__VersionAssignment_3_1_2 ) ) )
            // InternalIFACE.g:1509:1: ( ( rule__GSSIfacePortConfig__VersionAssignment_3_1_2 ) )
            {
            // InternalIFACE.g:1509:1: ( ( rule__GSSIfacePortConfig__VersionAssignment_3_1_2 ) )
            // InternalIFACE.g:1510:2: ( rule__GSSIfacePortConfig__VersionAssignment_3_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortConfigAccess().getVersionAssignment_3_1_2()); 
            }
            // InternalIFACE.g:1511:2: ( rule__GSSIfacePortConfig__VersionAssignment_3_1_2 )
            // InternalIFACE.g:1511:3: rule__GSSIfacePortConfig__VersionAssignment_3_1_2
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
    // InternalIFACE.g:1519:1: rule__GSSIfacePortConfig__Group_3_1__3 : rule__GSSIfacePortConfig__Group_3_1__3__Impl ;
    public final void rule__GSSIfacePortConfig__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1523:1: ( rule__GSSIfacePortConfig__Group_3_1__3__Impl )
            // InternalIFACE.g:1524:2: rule__GSSIfacePortConfig__Group_3_1__3__Impl
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
    // InternalIFACE.g:1530:1: rule__GSSIfacePortConfig__Group_3_1__3__Impl : ( ';' ) ;
    public final void rule__GSSIfacePortConfig__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1534:1: ( ( ';' ) )
            // InternalIFACE.g:1535:1: ( ';' )
            {
            // InternalIFACE.g:1535:1: ( ';' )
            // InternalIFACE.g:1536:2: ';'
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
    // InternalIFACE.g:1546:1: rule__GSSIfaceSpWPort__Group__0 : rule__GSSIfaceSpWPort__Group__0__Impl rule__GSSIfaceSpWPort__Group__1 ;
    public final void rule__GSSIfaceSpWPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1550:1: ( rule__GSSIfaceSpWPort__Group__0__Impl rule__GSSIfaceSpWPort__Group__1 )
            // InternalIFACE.g:1551:2: rule__GSSIfaceSpWPort__Group__0__Impl rule__GSSIfaceSpWPort__Group__1
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
    // InternalIFACE.g:1558:1: rule__GSSIfaceSpWPort__Group__0__Impl : ( 'spwPort' ) ;
    public final void rule__GSSIfaceSpWPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1562:1: ( ( 'spwPort' ) )
            // InternalIFACE.g:1563:1: ( 'spwPort' )
            {
            // InternalIFACE.g:1563:1: ( 'spwPort' )
            // InternalIFACE.g:1564:2: 'spwPort'
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
    // InternalIFACE.g:1573:1: rule__GSSIfaceSpWPort__Group__1 : rule__GSSIfaceSpWPort__Group__1__Impl rule__GSSIfaceSpWPort__Group__2 ;
    public final void rule__GSSIfaceSpWPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1577:1: ( rule__GSSIfaceSpWPort__Group__1__Impl rule__GSSIfaceSpWPort__Group__2 )
            // InternalIFACE.g:1578:2: rule__GSSIfaceSpWPort__Group__1__Impl rule__GSSIfaceSpWPort__Group__2
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
    // InternalIFACE.g:1585:1: rule__GSSIfaceSpWPort__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceSpWPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1589:1: ( ( '{' ) )
            // InternalIFACE.g:1590:1: ( '{' )
            {
            // InternalIFACE.g:1590:1: ( '{' )
            // InternalIFACE.g:1591:2: '{'
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
    // InternalIFACE.g:1600:1: rule__GSSIfaceSpWPort__Group__2 : rule__GSSIfaceSpWPort__Group__2__Impl rule__GSSIfaceSpWPort__Group__3 ;
    public final void rule__GSSIfaceSpWPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1604:1: ( rule__GSSIfaceSpWPort__Group__2__Impl rule__GSSIfaceSpWPort__Group__3 )
            // InternalIFACE.g:1605:2: rule__GSSIfaceSpWPort__Group__2__Impl rule__GSSIfaceSpWPort__Group__3
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
    // InternalIFACE.g:1612:1: rule__GSSIfaceSpWPort__Group__2__Impl : ( 'type' ) ;
    public final void rule__GSSIfaceSpWPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1616:1: ( ( 'type' ) )
            // InternalIFACE.g:1617:1: ( 'type' )
            {
            // InternalIFACE.g:1617:1: ( 'type' )
            // InternalIFACE.g:1618:2: 'type'
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
    // InternalIFACE.g:1627:1: rule__GSSIfaceSpWPort__Group__3 : rule__GSSIfaceSpWPort__Group__3__Impl rule__GSSIfaceSpWPort__Group__4 ;
    public final void rule__GSSIfaceSpWPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1631:1: ( rule__GSSIfaceSpWPort__Group__3__Impl rule__GSSIfaceSpWPort__Group__4 )
            // InternalIFACE.g:1632:2: rule__GSSIfaceSpWPort__Group__3__Impl rule__GSSIfaceSpWPort__Group__4
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
    // InternalIFACE.g:1639:1: rule__GSSIfaceSpWPort__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSpWPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1643:1: ( ( ':=' ) )
            // InternalIFACE.g:1644:1: ( ':=' )
            {
            // InternalIFACE.g:1644:1: ( ':=' )
            // InternalIFACE.g:1645:2: ':='
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
    // InternalIFACE.g:1654:1: rule__GSSIfaceSpWPort__Group__4 : rule__GSSIfaceSpWPort__Group__4__Impl rule__GSSIfaceSpWPort__Group__5 ;
    public final void rule__GSSIfaceSpWPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1658:1: ( rule__GSSIfaceSpWPort__Group__4__Impl rule__GSSIfaceSpWPort__Group__5 )
            // InternalIFACE.g:1659:2: rule__GSSIfaceSpWPort__Group__4__Impl rule__GSSIfaceSpWPort__Group__5
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
    // InternalIFACE.g:1666:1: rule__GSSIfaceSpWPort__Group__4__Impl : ( ( rule__GSSIfaceSpWPort__TypeAssignment_4 ) ) ;
    public final void rule__GSSIfaceSpWPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1670:1: ( ( ( rule__GSSIfaceSpWPort__TypeAssignment_4 ) ) )
            // InternalIFACE.g:1671:1: ( ( rule__GSSIfaceSpWPort__TypeAssignment_4 ) )
            {
            // InternalIFACE.g:1671:1: ( ( rule__GSSIfaceSpWPort__TypeAssignment_4 ) )
            // InternalIFACE.g:1672:2: ( rule__GSSIfaceSpWPort__TypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getTypeAssignment_4()); 
            }
            // InternalIFACE.g:1673:2: ( rule__GSSIfaceSpWPort__TypeAssignment_4 )
            // InternalIFACE.g:1673:3: rule__GSSIfaceSpWPort__TypeAssignment_4
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
    // InternalIFACE.g:1681:1: rule__GSSIfaceSpWPort__Group__5 : rule__GSSIfaceSpWPort__Group__5__Impl rule__GSSIfaceSpWPort__Group__6 ;
    public final void rule__GSSIfaceSpWPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1685:1: ( rule__GSSIfaceSpWPort__Group__5__Impl rule__GSSIfaceSpWPort__Group__6 )
            // InternalIFACE.g:1686:2: rule__GSSIfaceSpWPort__Group__5__Impl rule__GSSIfaceSpWPort__Group__6
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
    // InternalIFACE.g:1693:1: rule__GSSIfaceSpWPort__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSpWPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1697:1: ( ( ';' ) )
            // InternalIFACE.g:1698:1: ( ';' )
            {
            // InternalIFACE.g:1698:1: ( ';' )
            // InternalIFACE.g:1699:2: ';'
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
    // InternalIFACE.g:1708:1: rule__GSSIfaceSpWPort__Group__6 : rule__GSSIfaceSpWPort__Group__6__Impl rule__GSSIfaceSpWPort__Group__7 ;
    public final void rule__GSSIfaceSpWPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1712:1: ( rule__GSSIfaceSpWPort__Group__6__Impl rule__GSSIfaceSpWPort__Group__7 )
            // InternalIFACE.g:1713:2: rule__GSSIfaceSpWPort__Group__6__Impl rule__GSSIfaceSpWPort__Group__7
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
    // InternalIFACE.g:1720:1: rule__GSSIfaceSpWPort__Group__6__Impl : ( 'link' ) ;
    public final void rule__GSSIfaceSpWPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1724:1: ( ( 'link' ) )
            // InternalIFACE.g:1725:1: ( 'link' )
            {
            // InternalIFACE.g:1725:1: ( 'link' )
            // InternalIFACE.g:1726:2: 'link'
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
    // InternalIFACE.g:1735:1: rule__GSSIfaceSpWPort__Group__7 : rule__GSSIfaceSpWPort__Group__7__Impl rule__GSSIfaceSpWPort__Group__8 ;
    public final void rule__GSSIfaceSpWPort__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1739:1: ( rule__GSSIfaceSpWPort__Group__7__Impl rule__GSSIfaceSpWPort__Group__8 )
            // InternalIFACE.g:1740:2: rule__GSSIfaceSpWPort__Group__7__Impl rule__GSSIfaceSpWPort__Group__8
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
    // InternalIFACE.g:1747:1: rule__GSSIfaceSpWPort__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSpWPort__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1751:1: ( ( ':=' ) )
            // InternalIFACE.g:1752:1: ( ':=' )
            {
            // InternalIFACE.g:1752:1: ( ':=' )
            // InternalIFACE.g:1753:2: ':='
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
    // InternalIFACE.g:1762:1: rule__GSSIfaceSpWPort__Group__8 : rule__GSSIfaceSpWPort__Group__8__Impl rule__GSSIfaceSpWPort__Group__9 ;
    public final void rule__GSSIfaceSpWPort__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1766:1: ( rule__GSSIfaceSpWPort__Group__8__Impl rule__GSSIfaceSpWPort__Group__9 )
            // InternalIFACE.g:1767:2: rule__GSSIfaceSpWPort__Group__8__Impl rule__GSSIfaceSpWPort__Group__9
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
    // InternalIFACE.g:1774:1: rule__GSSIfaceSpWPort__Group__8__Impl : ( ( rule__GSSIfaceSpWPort__LinkAssignment_8 ) ) ;
    public final void rule__GSSIfaceSpWPort__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1778:1: ( ( ( rule__GSSIfaceSpWPort__LinkAssignment_8 ) ) )
            // InternalIFACE.g:1779:1: ( ( rule__GSSIfaceSpWPort__LinkAssignment_8 ) )
            {
            // InternalIFACE.g:1779:1: ( ( rule__GSSIfaceSpWPort__LinkAssignment_8 ) )
            // InternalIFACE.g:1780:2: ( rule__GSSIfaceSpWPort__LinkAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getLinkAssignment_8()); 
            }
            // InternalIFACE.g:1781:2: ( rule__GSSIfaceSpWPort__LinkAssignment_8 )
            // InternalIFACE.g:1781:3: rule__GSSIfaceSpWPort__LinkAssignment_8
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
    // InternalIFACE.g:1789:1: rule__GSSIfaceSpWPort__Group__9 : rule__GSSIfaceSpWPort__Group__9__Impl rule__GSSIfaceSpWPort__Group__10 ;
    public final void rule__GSSIfaceSpWPort__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1793:1: ( rule__GSSIfaceSpWPort__Group__9__Impl rule__GSSIfaceSpWPort__Group__10 )
            // InternalIFACE.g:1794:2: rule__GSSIfaceSpWPort__Group__9__Impl rule__GSSIfaceSpWPort__Group__10
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
    // InternalIFACE.g:1801:1: rule__GSSIfaceSpWPort__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSpWPort__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1805:1: ( ( ';' ) )
            // InternalIFACE.g:1806:1: ( ';' )
            {
            // InternalIFACE.g:1806:1: ( ';' )
            // InternalIFACE.g:1807:2: ';'
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
    // InternalIFACE.g:1816:1: rule__GSSIfaceSpWPort__Group__10 : rule__GSSIfaceSpWPort__Group__10__Impl rule__GSSIfaceSpWPort__Group__11 ;
    public final void rule__GSSIfaceSpWPort__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1820:1: ( rule__GSSIfaceSpWPort__Group__10__Impl rule__GSSIfaceSpWPort__Group__11 )
            // InternalIFACE.g:1821:2: rule__GSSIfaceSpWPort__Group__10__Impl rule__GSSIfaceSpWPort__Group__11
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
    // InternalIFACE.g:1828:1: rule__GSSIfaceSpWPort__Group__10__Impl : ( 'writingPort' ) ;
    public final void rule__GSSIfaceSpWPort__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1832:1: ( ( 'writingPort' ) )
            // InternalIFACE.g:1833:1: ( 'writingPort' )
            {
            // InternalIFACE.g:1833:1: ( 'writingPort' )
            // InternalIFACE.g:1834:2: 'writingPort'
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
    // InternalIFACE.g:1843:1: rule__GSSIfaceSpWPort__Group__11 : rule__GSSIfaceSpWPort__Group__11__Impl rule__GSSIfaceSpWPort__Group__12 ;
    public final void rule__GSSIfaceSpWPort__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1847:1: ( rule__GSSIfaceSpWPort__Group__11__Impl rule__GSSIfaceSpWPort__Group__12 )
            // InternalIFACE.g:1848:2: rule__GSSIfaceSpWPort__Group__11__Impl rule__GSSIfaceSpWPort__Group__12
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
    // InternalIFACE.g:1855:1: rule__GSSIfaceSpWPort__Group__11__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSpWPort__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1859:1: ( ( ':=' ) )
            // InternalIFACE.g:1860:1: ( ':=' )
            {
            // InternalIFACE.g:1860:1: ( ':=' )
            // InternalIFACE.g:1861:2: ':='
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
    // InternalIFACE.g:1870:1: rule__GSSIfaceSpWPort__Group__12 : rule__GSSIfaceSpWPort__Group__12__Impl rule__GSSIfaceSpWPort__Group__13 ;
    public final void rule__GSSIfaceSpWPort__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1874:1: ( rule__GSSIfaceSpWPort__Group__12__Impl rule__GSSIfaceSpWPort__Group__13 )
            // InternalIFACE.g:1875:2: rule__GSSIfaceSpWPort__Group__12__Impl rule__GSSIfaceSpWPort__Group__13
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
    // InternalIFACE.g:1882:1: rule__GSSIfaceSpWPort__Group__12__Impl : ( ( rule__GSSIfaceSpWPort__WritingPortAssignment_12 ) ) ;
    public final void rule__GSSIfaceSpWPort__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1886:1: ( ( ( rule__GSSIfaceSpWPort__WritingPortAssignment_12 ) ) )
            // InternalIFACE.g:1887:1: ( ( rule__GSSIfaceSpWPort__WritingPortAssignment_12 ) )
            {
            // InternalIFACE.g:1887:1: ( ( rule__GSSIfaceSpWPort__WritingPortAssignment_12 ) )
            // InternalIFACE.g:1888:2: ( rule__GSSIfaceSpWPort__WritingPortAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortAssignment_12()); 
            }
            // InternalIFACE.g:1889:2: ( rule__GSSIfaceSpWPort__WritingPortAssignment_12 )
            // InternalIFACE.g:1889:3: rule__GSSIfaceSpWPort__WritingPortAssignment_12
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
    // InternalIFACE.g:1897:1: rule__GSSIfaceSpWPort__Group__13 : rule__GSSIfaceSpWPort__Group__13__Impl rule__GSSIfaceSpWPort__Group__14 ;
    public final void rule__GSSIfaceSpWPort__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1901:1: ( rule__GSSIfaceSpWPort__Group__13__Impl rule__GSSIfaceSpWPort__Group__14 )
            // InternalIFACE.g:1902:2: rule__GSSIfaceSpWPort__Group__13__Impl rule__GSSIfaceSpWPort__Group__14
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
    // InternalIFACE.g:1909:1: rule__GSSIfaceSpWPort__Group__13__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSpWPort__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1913:1: ( ( ';' ) )
            // InternalIFACE.g:1914:1: ( ';' )
            {
            // InternalIFACE.g:1914:1: ( ';' )
            // InternalIFACE.g:1915:2: ';'
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
    // InternalIFACE.g:1924:1: rule__GSSIfaceSpWPort__Group__14 : rule__GSSIfaceSpWPort__Group__14__Impl rule__GSSIfaceSpWPort__Group__15 ;
    public final void rule__GSSIfaceSpWPort__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1928:1: ( rule__GSSIfaceSpWPort__Group__14__Impl rule__GSSIfaceSpWPort__Group__15 )
            // InternalIFACE.g:1929:2: rule__GSSIfaceSpWPort__Group__14__Impl rule__GSSIfaceSpWPort__Group__15
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
    // InternalIFACE.g:1936:1: rule__GSSIfaceSpWPort__Group__14__Impl : ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 ) ) ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )* ) ) ;
    public final void rule__GSSIfaceSpWPort__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1940:1: ( ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 ) ) ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )* ) ) )
            // InternalIFACE.g:1941:1: ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 ) ) ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )* ) )
            {
            // InternalIFACE.g:1941:1: ( ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 ) ) ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )* ) )
            // InternalIFACE.g:1942:2: ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 ) ) ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )* )
            {
            // InternalIFACE.g:1942:2: ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 ) )
            // InternalIFACE.g:1943:3: ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortAssignment_14()); 
            }
            // InternalIFACE.g:1944:3: ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )
            // InternalIFACE.g:1944:4: rule__GSSIfaceSpWPort__ReadingPortAssignment_14
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

            // InternalIFACE.g:1947:2: ( ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )* )
            // InternalIFACE.g:1948:3: ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortAssignment_14()); 
            }
            // InternalIFACE.g:1949:3: ( rule__GSSIfaceSpWPort__ReadingPortAssignment_14 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==46) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalIFACE.g:1949:4: rule__GSSIfaceSpWPort__ReadingPortAssignment_14
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
    // InternalIFACE.g:1958:1: rule__GSSIfaceSpWPort__Group__15 : rule__GSSIfaceSpWPort__Group__15__Impl rule__GSSIfaceSpWPort__Group__16 ;
    public final void rule__GSSIfaceSpWPort__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1962:1: ( rule__GSSIfaceSpWPort__Group__15__Impl rule__GSSIfaceSpWPort__Group__16 )
            // InternalIFACE.g:1963:2: rule__GSSIfaceSpWPort__Group__15__Impl rule__GSSIfaceSpWPort__Group__16
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
    // InternalIFACE.g:1970:1: rule__GSSIfaceSpWPort__Group__15__Impl : ( '}' ) ;
    public final void rule__GSSIfaceSpWPort__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1974:1: ( ( '}' ) )
            // InternalIFACE.g:1975:1: ( '}' )
            {
            // InternalIFACE.g:1975:1: ( '}' )
            // InternalIFACE.g:1976:2: '}'
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
    // InternalIFACE.g:1985:1: rule__GSSIfaceSpWPort__Group__16 : rule__GSSIfaceSpWPort__Group__16__Impl ;
    public final void rule__GSSIfaceSpWPort__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:1989:1: ( rule__GSSIfaceSpWPort__Group__16__Impl )
            // InternalIFACE.g:1990:2: rule__GSSIfaceSpWPort__Group__16__Impl
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
    // InternalIFACE.g:1996:1: rule__GSSIfaceSpWPort__Group__16__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSpWPort__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2000:1: ( ( ';' ) )
            // InternalIFACE.g:2001:1: ( ';' )
            {
            // InternalIFACE.g:2001:1: ( ';' )
            // InternalIFACE.g:2002:2: ';'
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
    // InternalIFACE.g:2012:1: rule__GSSIfaceReadingPort__Group__0 : rule__GSSIfaceReadingPort__Group__0__Impl rule__GSSIfaceReadingPort__Group__1 ;
    public final void rule__GSSIfaceReadingPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2016:1: ( rule__GSSIfaceReadingPort__Group__0__Impl rule__GSSIfaceReadingPort__Group__1 )
            // InternalIFACE.g:2017:2: rule__GSSIfaceReadingPort__Group__0__Impl rule__GSSIfaceReadingPort__Group__1
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
    // InternalIFACE.g:2024:1: rule__GSSIfaceReadingPort__Group__0__Impl : ( 'readingPort' ) ;
    public final void rule__GSSIfaceReadingPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2028:1: ( ( 'readingPort' ) )
            // InternalIFACE.g:2029:1: ( 'readingPort' )
            {
            // InternalIFACE.g:2029:1: ( 'readingPort' )
            // InternalIFACE.g:2030:2: 'readingPort'
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
    // InternalIFACE.g:2039:1: rule__GSSIfaceReadingPort__Group__1 : rule__GSSIfaceReadingPort__Group__1__Impl rule__GSSIfaceReadingPort__Group__2 ;
    public final void rule__GSSIfaceReadingPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2043:1: ( rule__GSSIfaceReadingPort__Group__1__Impl rule__GSSIfaceReadingPort__Group__2 )
            // InternalIFACE.g:2044:2: rule__GSSIfaceReadingPort__Group__1__Impl rule__GSSIfaceReadingPort__Group__2
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
    // InternalIFACE.g:2051:1: rule__GSSIfaceReadingPort__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceReadingPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2055:1: ( ( '{' ) )
            // InternalIFACE.g:2056:1: ( '{' )
            {
            // InternalIFACE.g:2056:1: ( '{' )
            // InternalIFACE.g:2057:2: '{'
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
    // InternalIFACE.g:2066:1: rule__GSSIfaceReadingPort__Group__2 : rule__GSSIfaceReadingPort__Group__2__Impl rule__GSSIfaceReadingPort__Group__3 ;
    public final void rule__GSSIfaceReadingPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2070:1: ( rule__GSSIfaceReadingPort__Group__2__Impl rule__GSSIfaceReadingPort__Group__3 )
            // InternalIFACE.g:2071:2: rule__GSSIfaceReadingPort__Group__2__Impl rule__GSSIfaceReadingPort__Group__3
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
    // InternalIFACE.g:2078:1: rule__GSSIfaceReadingPort__Group__2__Impl : ( 'port' ) ;
    public final void rule__GSSIfaceReadingPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2082:1: ( ( 'port' ) )
            // InternalIFACE.g:2083:1: ( 'port' )
            {
            // InternalIFACE.g:2083:1: ( 'port' )
            // InternalIFACE.g:2084:2: 'port'
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
    // InternalIFACE.g:2093:1: rule__GSSIfaceReadingPort__Group__3 : rule__GSSIfaceReadingPort__Group__3__Impl rule__GSSIfaceReadingPort__Group__4 ;
    public final void rule__GSSIfaceReadingPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2097:1: ( rule__GSSIfaceReadingPort__Group__3__Impl rule__GSSIfaceReadingPort__Group__4 )
            // InternalIFACE.g:2098:2: rule__GSSIfaceReadingPort__Group__3__Impl rule__GSSIfaceReadingPort__Group__4
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
    // InternalIFACE.g:2105:1: rule__GSSIfaceReadingPort__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceReadingPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2109:1: ( ( ':=' ) )
            // InternalIFACE.g:2110:1: ( ':=' )
            {
            // InternalIFACE.g:2110:1: ( ':=' )
            // InternalIFACE.g:2111:2: ':='
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
    // InternalIFACE.g:2120:1: rule__GSSIfaceReadingPort__Group__4 : rule__GSSIfaceReadingPort__Group__4__Impl rule__GSSIfaceReadingPort__Group__5 ;
    public final void rule__GSSIfaceReadingPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2124:1: ( rule__GSSIfaceReadingPort__Group__4__Impl rule__GSSIfaceReadingPort__Group__5 )
            // InternalIFACE.g:2125:2: rule__GSSIfaceReadingPort__Group__4__Impl rule__GSSIfaceReadingPort__Group__5
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
    // InternalIFACE.g:2132:1: rule__GSSIfaceReadingPort__Group__4__Impl : ( ( rule__GSSIfaceReadingPort__PortAssignment_4 ) ) ;
    public final void rule__GSSIfaceReadingPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2136:1: ( ( ( rule__GSSIfaceReadingPort__PortAssignment_4 ) ) )
            // InternalIFACE.g:2137:1: ( ( rule__GSSIfaceReadingPort__PortAssignment_4 ) )
            {
            // InternalIFACE.g:2137:1: ( ( rule__GSSIfaceReadingPort__PortAssignment_4 ) )
            // InternalIFACE.g:2138:2: ( rule__GSSIfaceReadingPort__PortAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceReadingPortAccess().getPortAssignment_4()); 
            }
            // InternalIFACE.g:2139:2: ( rule__GSSIfaceReadingPort__PortAssignment_4 )
            // InternalIFACE.g:2139:3: rule__GSSIfaceReadingPort__PortAssignment_4
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
    // InternalIFACE.g:2147:1: rule__GSSIfaceReadingPort__Group__5 : rule__GSSIfaceReadingPort__Group__5__Impl rule__GSSIfaceReadingPort__Group__6 ;
    public final void rule__GSSIfaceReadingPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2151:1: ( rule__GSSIfaceReadingPort__Group__5__Impl rule__GSSIfaceReadingPort__Group__6 )
            // InternalIFACE.g:2152:2: rule__GSSIfaceReadingPort__Group__5__Impl rule__GSSIfaceReadingPort__Group__6
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
    // InternalIFACE.g:2159:1: rule__GSSIfaceReadingPort__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceReadingPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2163:1: ( ( ';' ) )
            // InternalIFACE.g:2164:1: ( ';' )
            {
            // InternalIFACE.g:2164:1: ( ';' )
            // InternalIFACE.g:2165:2: ';'
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
    // InternalIFACE.g:2174:1: rule__GSSIfaceReadingPort__Group__6 : rule__GSSIfaceReadingPort__Group__6__Impl rule__GSSIfaceReadingPort__Group__7 ;
    public final void rule__GSSIfaceReadingPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2178:1: ( rule__GSSIfaceReadingPort__Group__6__Impl rule__GSSIfaceReadingPort__Group__7 )
            // InternalIFACE.g:2179:2: rule__GSSIfaceReadingPort__Group__6__Impl rule__GSSIfaceReadingPort__Group__7
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
    // InternalIFACE.g:2186:1: rule__GSSIfaceReadingPort__Group__6__Impl : ( '}' ) ;
    public final void rule__GSSIfaceReadingPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2190:1: ( ( '}' ) )
            // InternalIFACE.g:2191:1: ( '}' )
            {
            // InternalIFACE.g:2191:1: ( '}' )
            // InternalIFACE.g:2192:2: '}'
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
    // InternalIFACE.g:2201:1: rule__GSSIfaceReadingPort__Group__7 : rule__GSSIfaceReadingPort__Group__7__Impl ;
    public final void rule__GSSIfaceReadingPort__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2205:1: ( rule__GSSIfaceReadingPort__Group__7__Impl )
            // InternalIFACE.g:2206:2: rule__GSSIfaceReadingPort__Group__7__Impl
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
    // InternalIFACE.g:2212:1: rule__GSSIfaceReadingPort__Group__7__Impl : ( ';' ) ;
    public final void rule__GSSIfaceReadingPort__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2216:1: ( ( ';' ) )
            // InternalIFACE.g:2217:1: ( ';' )
            {
            // InternalIFACE.g:2217:1: ( ';' )
            // InternalIFACE.g:2218:2: ';'
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
    // InternalIFACE.g:2228:1: rule__GSSIfaceUartPort__Group__0 : rule__GSSIfaceUartPort__Group__0__Impl rule__GSSIfaceUartPort__Group__1 ;
    public final void rule__GSSIfaceUartPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2232:1: ( rule__GSSIfaceUartPort__Group__0__Impl rule__GSSIfaceUartPort__Group__1 )
            // InternalIFACE.g:2233:2: rule__GSSIfaceUartPort__Group__0__Impl rule__GSSIfaceUartPort__Group__1
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
    // InternalIFACE.g:2240:1: rule__GSSIfaceUartPort__Group__0__Impl : ( 'uartPort' ) ;
    public final void rule__GSSIfaceUartPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2244:1: ( ( 'uartPort' ) )
            // InternalIFACE.g:2245:1: ( 'uartPort' )
            {
            // InternalIFACE.g:2245:1: ( 'uartPort' )
            // InternalIFACE.g:2246:2: 'uartPort'
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
    // InternalIFACE.g:2255:1: rule__GSSIfaceUartPort__Group__1 : rule__GSSIfaceUartPort__Group__1__Impl rule__GSSIfaceUartPort__Group__2 ;
    public final void rule__GSSIfaceUartPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2259:1: ( rule__GSSIfaceUartPort__Group__1__Impl rule__GSSIfaceUartPort__Group__2 )
            // InternalIFACE.g:2260:2: rule__GSSIfaceUartPort__Group__1__Impl rule__GSSIfaceUartPort__Group__2
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
    // InternalIFACE.g:2267:1: rule__GSSIfaceUartPort__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceUartPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2271:1: ( ( '{' ) )
            // InternalIFACE.g:2272:1: ( '{' )
            {
            // InternalIFACE.g:2272:1: ( '{' )
            // InternalIFACE.g:2273:2: '{'
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
    // InternalIFACE.g:2282:1: rule__GSSIfaceUartPort__Group__2 : rule__GSSIfaceUartPort__Group__2__Impl rule__GSSIfaceUartPort__Group__3 ;
    public final void rule__GSSIfaceUartPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2286:1: ( rule__GSSIfaceUartPort__Group__2__Impl rule__GSSIfaceUartPort__Group__3 )
            // InternalIFACE.g:2287:2: rule__GSSIfaceUartPort__Group__2__Impl rule__GSSIfaceUartPort__Group__3
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
    // InternalIFACE.g:2294:1: rule__GSSIfaceUartPort__Group__2__Impl : ( 'number' ) ;
    public final void rule__GSSIfaceUartPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2298:1: ( ( 'number' ) )
            // InternalIFACE.g:2299:1: ( 'number' )
            {
            // InternalIFACE.g:2299:1: ( 'number' )
            // InternalIFACE.g:2300:2: 'number'
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
    // InternalIFACE.g:2309:1: rule__GSSIfaceUartPort__Group__3 : rule__GSSIfaceUartPort__Group__3__Impl rule__GSSIfaceUartPort__Group__4 ;
    public final void rule__GSSIfaceUartPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2313:1: ( rule__GSSIfaceUartPort__Group__3__Impl rule__GSSIfaceUartPort__Group__4 )
            // InternalIFACE.g:2314:2: rule__GSSIfaceUartPort__Group__3__Impl rule__GSSIfaceUartPort__Group__4
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
    // InternalIFACE.g:2321:1: rule__GSSIfaceUartPort__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2325:1: ( ( ':=' ) )
            // InternalIFACE.g:2326:1: ( ':=' )
            {
            // InternalIFACE.g:2326:1: ( ':=' )
            // InternalIFACE.g:2327:2: ':='
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
    // InternalIFACE.g:2336:1: rule__GSSIfaceUartPort__Group__4 : rule__GSSIfaceUartPort__Group__4__Impl rule__GSSIfaceUartPort__Group__5 ;
    public final void rule__GSSIfaceUartPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2340:1: ( rule__GSSIfaceUartPort__Group__4__Impl rule__GSSIfaceUartPort__Group__5 )
            // InternalIFACE.g:2341:2: rule__GSSIfaceUartPort__Group__4__Impl rule__GSSIfaceUartPort__Group__5
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
    // InternalIFACE.g:2348:1: rule__GSSIfaceUartPort__Group__4__Impl : ( ( rule__GSSIfaceUartPort__NumberAssignment_4 ) ) ;
    public final void rule__GSSIfaceUartPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2352:1: ( ( ( rule__GSSIfaceUartPort__NumberAssignment_4 ) ) )
            // InternalIFACE.g:2353:1: ( ( rule__GSSIfaceUartPort__NumberAssignment_4 ) )
            {
            // InternalIFACE.g:2353:1: ( ( rule__GSSIfaceUartPort__NumberAssignment_4 ) )
            // InternalIFACE.g:2354:2: ( rule__GSSIfaceUartPort__NumberAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getNumberAssignment_4()); 
            }
            // InternalIFACE.g:2355:2: ( rule__GSSIfaceUartPort__NumberAssignment_4 )
            // InternalIFACE.g:2355:3: rule__GSSIfaceUartPort__NumberAssignment_4
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
    // InternalIFACE.g:2363:1: rule__GSSIfaceUartPort__Group__5 : rule__GSSIfaceUartPort__Group__5__Impl rule__GSSIfaceUartPort__Group__6 ;
    public final void rule__GSSIfaceUartPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2367:1: ( rule__GSSIfaceUartPort__Group__5__Impl rule__GSSIfaceUartPort__Group__6 )
            // InternalIFACE.g:2368:2: rule__GSSIfaceUartPort__Group__5__Impl rule__GSSIfaceUartPort__Group__6
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
    // InternalIFACE.g:2375:1: rule__GSSIfaceUartPort__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2379:1: ( ( ';' ) )
            // InternalIFACE.g:2380:1: ( ';' )
            {
            // InternalIFACE.g:2380:1: ( ';' )
            // InternalIFACE.g:2381:2: ';'
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
    // InternalIFACE.g:2390:1: rule__GSSIfaceUartPort__Group__6 : rule__GSSIfaceUartPort__Group__6__Impl rule__GSSIfaceUartPort__Group__7 ;
    public final void rule__GSSIfaceUartPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2394:1: ( rule__GSSIfaceUartPort__Group__6__Impl rule__GSSIfaceUartPort__Group__7 )
            // InternalIFACE.g:2395:2: rule__GSSIfaceUartPort__Group__6__Impl rule__GSSIfaceUartPort__Group__7
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
    // InternalIFACE.g:2402:1: rule__GSSIfaceUartPort__Group__6__Impl : ( 'baudRate' ) ;
    public final void rule__GSSIfaceUartPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2406:1: ( ( 'baudRate' ) )
            // InternalIFACE.g:2407:1: ( 'baudRate' )
            {
            // InternalIFACE.g:2407:1: ( 'baudRate' )
            // InternalIFACE.g:2408:2: 'baudRate'
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
    // InternalIFACE.g:2417:1: rule__GSSIfaceUartPort__Group__7 : rule__GSSIfaceUartPort__Group__7__Impl rule__GSSIfaceUartPort__Group__8 ;
    public final void rule__GSSIfaceUartPort__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2421:1: ( rule__GSSIfaceUartPort__Group__7__Impl rule__GSSIfaceUartPort__Group__8 )
            // InternalIFACE.g:2422:2: rule__GSSIfaceUartPort__Group__7__Impl rule__GSSIfaceUartPort__Group__8
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
    // InternalIFACE.g:2429:1: rule__GSSIfaceUartPort__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartPort__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2433:1: ( ( ':=' ) )
            // InternalIFACE.g:2434:1: ( ':=' )
            {
            // InternalIFACE.g:2434:1: ( ':=' )
            // InternalIFACE.g:2435:2: ':='
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
    // InternalIFACE.g:2444:1: rule__GSSIfaceUartPort__Group__8 : rule__GSSIfaceUartPort__Group__8__Impl rule__GSSIfaceUartPort__Group__9 ;
    public final void rule__GSSIfaceUartPort__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2448:1: ( rule__GSSIfaceUartPort__Group__8__Impl rule__GSSIfaceUartPort__Group__9 )
            // InternalIFACE.g:2449:2: rule__GSSIfaceUartPort__Group__8__Impl rule__GSSIfaceUartPort__Group__9
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
    // InternalIFACE.g:2456:1: rule__GSSIfaceUartPort__Group__8__Impl : ( ( rule__GSSIfaceUartPort__BaudRateAssignment_8 ) ) ;
    public final void rule__GSSIfaceUartPort__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2460:1: ( ( ( rule__GSSIfaceUartPort__BaudRateAssignment_8 ) ) )
            // InternalIFACE.g:2461:1: ( ( rule__GSSIfaceUartPort__BaudRateAssignment_8 ) )
            {
            // InternalIFACE.g:2461:1: ( ( rule__GSSIfaceUartPort__BaudRateAssignment_8 ) )
            // InternalIFACE.g:2462:2: ( rule__GSSIfaceUartPort__BaudRateAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateAssignment_8()); 
            }
            // InternalIFACE.g:2463:2: ( rule__GSSIfaceUartPort__BaudRateAssignment_8 )
            // InternalIFACE.g:2463:3: rule__GSSIfaceUartPort__BaudRateAssignment_8
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
    // InternalIFACE.g:2471:1: rule__GSSIfaceUartPort__Group__9 : rule__GSSIfaceUartPort__Group__9__Impl rule__GSSIfaceUartPort__Group__10 ;
    public final void rule__GSSIfaceUartPort__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2475:1: ( rule__GSSIfaceUartPort__Group__9__Impl rule__GSSIfaceUartPort__Group__10 )
            // InternalIFACE.g:2476:2: rule__GSSIfaceUartPort__Group__9__Impl rule__GSSIfaceUartPort__Group__10
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
    // InternalIFACE.g:2483:1: rule__GSSIfaceUartPort__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2487:1: ( ( ';' ) )
            // InternalIFACE.g:2488:1: ( ';' )
            {
            // InternalIFACE.g:2488:1: ( ';' )
            // InternalIFACE.g:2489:2: ';'
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
    // InternalIFACE.g:2498:1: rule__GSSIfaceUartPort__Group__10 : rule__GSSIfaceUartPort__Group__10__Impl rule__GSSIfaceUartPort__Group__11 ;
    public final void rule__GSSIfaceUartPort__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2502:1: ( rule__GSSIfaceUartPort__Group__10__Impl rule__GSSIfaceUartPort__Group__11 )
            // InternalIFACE.g:2503:2: rule__GSSIfaceUartPort__Group__10__Impl rule__GSSIfaceUartPort__Group__11
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
    // InternalIFACE.g:2510:1: rule__GSSIfaceUartPort__Group__10__Impl : ( 'parity' ) ;
    public final void rule__GSSIfaceUartPort__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2514:1: ( ( 'parity' ) )
            // InternalIFACE.g:2515:1: ( 'parity' )
            {
            // InternalIFACE.g:2515:1: ( 'parity' )
            // InternalIFACE.g:2516:2: 'parity'
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
    // InternalIFACE.g:2525:1: rule__GSSIfaceUartPort__Group__11 : rule__GSSIfaceUartPort__Group__11__Impl rule__GSSIfaceUartPort__Group__12 ;
    public final void rule__GSSIfaceUartPort__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2529:1: ( rule__GSSIfaceUartPort__Group__11__Impl rule__GSSIfaceUartPort__Group__12 )
            // InternalIFACE.g:2530:2: rule__GSSIfaceUartPort__Group__11__Impl rule__GSSIfaceUartPort__Group__12
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
    // InternalIFACE.g:2537:1: rule__GSSIfaceUartPort__Group__11__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartPort__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2541:1: ( ( ':=' ) )
            // InternalIFACE.g:2542:1: ( ':=' )
            {
            // InternalIFACE.g:2542:1: ( ':=' )
            // InternalIFACE.g:2543:2: ':='
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
    // InternalIFACE.g:2552:1: rule__GSSIfaceUartPort__Group__12 : rule__GSSIfaceUartPort__Group__12__Impl rule__GSSIfaceUartPort__Group__13 ;
    public final void rule__GSSIfaceUartPort__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2556:1: ( rule__GSSIfaceUartPort__Group__12__Impl rule__GSSIfaceUartPort__Group__13 )
            // InternalIFACE.g:2557:2: rule__GSSIfaceUartPort__Group__12__Impl rule__GSSIfaceUartPort__Group__13
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
    // InternalIFACE.g:2564:1: rule__GSSIfaceUartPort__Group__12__Impl : ( ( rule__GSSIfaceUartPort__ParityAssignment_12 ) ) ;
    public final void rule__GSSIfaceUartPort__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2568:1: ( ( ( rule__GSSIfaceUartPort__ParityAssignment_12 ) ) )
            // InternalIFACE.g:2569:1: ( ( rule__GSSIfaceUartPort__ParityAssignment_12 ) )
            {
            // InternalIFACE.g:2569:1: ( ( rule__GSSIfaceUartPort__ParityAssignment_12 ) )
            // InternalIFACE.g:2570:2: ( rule__GSSIfaceUartPort__ParityAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getParityAssignment_12()); 
            }
            // InternalIFACE.g:2571:2: ( rule__GSSIfaceUartPort__ParityAssignment_12 )
            // InternalIFACE.g:2571:3: rule__GSSIfaceUartPort__ParityAssignment_12
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
    // InternalIFACE.g:2579:1: rule__GSSIfaceUartPort__Group__13 : rule__GSSIfaceUartPort__Group__13__Impl rule__GSSIfaceUartPort__Group__14 ;
    public final void rule__GSSIfaceUartPort__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2583:1: ( rule__GSSIfaceUartPort__Group__13__Impl rule__GSSIfaceUartPort__Group__14 )
            // InternalIFACE.g:2584:2: rule__GSSIfaceUartPort__Group__13__Impl rule__GSSIfaceUartPort__Group__14
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
    // InternalIFACE.g:2591:1: rule__GSSIfaceUartPort__Group__13__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2595:1: ( ( ';' ) )
            // InternalIFACE.g:2596:1: ( ';' )
            {
            // InternalIFACE.g:2596:1: ( ';' )
            // InternalIFACE.g:2597:2: ';'
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
    // InternalIFACE.g:2606:1: rule__GSSIfaceUartPort__Group__14 : rule__GSSIfaceUartPort__Group__14__Impl rule__GSSIfaceUartPort__Group__15 ;
    public final void rule__GSSIfaceUartPort__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2610:1: ( rule__GSSIfaceUartPort__Group__14__Impl rule__GSSIfaceUartPort__Group__15 )
            // InternalIFACE.g:2611:2: rule__GSSIfaceUartPort__Group__14__Impl rule__GSSIfaceUartPort__Group__15
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
    // InternalIFACE.g:2618:1: rule__GSSIfaceUartPort__Group__14__Impl : ( 'dataBits' ) ;
    public final void rule__GSSIfaceUartPort__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2622:1: ( ( 'dataBits' ) )
            // InternalIFACE.g:2623:1: ( 'dataBits' )
            {
            // InternalIFACE.g:2623:1: ( 'dataBits' )
            // InternalIFACE.g:2624:2: 'dataBits'
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
    // InternalIFACE.g:2633:1: rule__GSSIfaceUartPort__Group__15 : rule__GSSIfaceUartPort__Group__15__Impl rule__GSSIfaceUartPort__Group__16 ;
    public final void rule__GSSIfaceUartPort__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2637:1: ( rule__GSSIfaceUartPort__Group__15__Impl rule__GSSIfaceUartPort__Group__16 )
            // InternalIFACE.g:2638:2: rule__GSSIfaceUartPort__Group__15__Impl rule__GSSIfaceUartPort__Group__16
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
    // InternalIFACE.g:2645:1: rule__GSSIfaceUartPort__Group__15__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartPort__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2649:1: ( ( ':=' ) )
            // InternalIFACE.g:2650:1: ( ':=' )
            {
            // InternalIFACE.g:2650:1: ( ':=' )
            // InternalIFACE.g:2651:2: ':='
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
    // InternalIFACE.g:2660:1: rule__GSSIfaceUartPort__Group__16 : rule__GSSIfaceUartPort__Group__16__Impl rule__GSSIfaceUartPort__Group__17 ;
    public final void rule__GSSIfaceUartPort__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2664:1: ( rule__GSSIfaceUartPort__Group__16__Impl rule__GSSIfaceUartPort__Group__17 )
            // InternalIFACE.g:2665:2: rule__GSSIfaceUartPort__Group__16__Impl rule__GSSIfaceUartPort__Group__17
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
    // InternalIFACE.g:2672:1: rule__GSSIfaceUartPort__Group__16__Impl : ( ( rule__GSSIfaceUartPort__DataBitsAssignment_16 ) ) ;
    public final void rule__GSSIfaceUartPort__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2676:1: ( ( ( rule__GSSIfaceUartPort__DataBitsAssignment_16 ) ) )
            // InternalIFACE.g:2677:1: ( ( rule__GSSIfaceUartPort__DataBitsAssignment_16 ) )
            {
            // InternalIFACE.g:2677:1: ( ( rule__GSSIfaceUartPort__DataBitsAssignment_16 ) )
            // InternalIFACE.g:2678:2: ( rule__GSSIfaceUartPort__DataBitsAssignment_16 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsAssignment_16()); 
            }
            // InternalIFACE.g:2679:2: ( rule__GSSIfaceUartPort__DataBitsAssignment_16 )
            // InternalIFACE.g:2679:3: rule__GSSIfaceUartPort__DataBitsAssignment_16
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
    // InternalIFACE.g:2687:1: rule__GSSIfaceUartPort__Group__17 : rule__GSSIfaceUartPort__Group__17__Impl rule__GSSIfaceUartPort__Group__18 ;
    public final void rule__GSSIfaceUartPort__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2691:1: ( rule__GSSIfaceUartPort__Group__17__Impl rule__GSSIfaceUartPort__Group__18 )
            // InternalIFACE.g:2692:2: rule__GSSIfaceUartPort__Group__17__Impl rule__GSSIfaceUartPort__Group__18
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
    // InternalIFACE.g:2699:1: rule__GSSIfaceUartPort__Group__17__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2703:1: ( ( ';' ) )
            // InternalIFACE.g:2704:1: ( ';' )
            {
            // InternalIFACE.g:2704:1: ( ';' )
            // InternalIFACE.g:2705:2: ';'
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
    // InternalIFACE.g:2714:1: rule__GSSIfaceUartPort__Group__18 : rule__GSSIfaceUartPort__Group__18__Impl rule__GSSIfaceUartPort__Group__19 ;
    public final void rule__GSSIfaceUartPort__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2718:1: ( rule__GSSIfaceUartPort__Group__18__Impl rule__GSSIfaceUartPort__Group__19 )
            // InternalIFACE.g:2719:2: rule__GSSIfaceUartPort__Group__18__Impl rule__GSSIfaceUartPort__Group__19
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
    // InternalIFACE.g:2726:1: rule__GSSIfaceUartPort__Group__18__Impl : ( 'stopBits' ) ;
    public final void rule__GSSIfaceUartPort__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2730:1: ( ( 'stopBits' ) )
            // InternalIFACE.g:2731:1: ( 'stopBits' )
            {
            // InternalIFACE.g:2731:1: ( 'stopBits' )
            // InternalIFACE.g:2732:2: 'stopBits'
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
    // InternalIFACE.g:2741:1: rule__GSSIfaceUartPort__Group__19 : rule__GSSIfaceUartPort__Group__19__Impl rule__GSSIfaceUartPort__Group__20 ;
    public final void rule__GSSIfaceUartPort__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2745:1: ( rule__GSSIfaceUartPort__Group__19__Impl rule__GSSIfaceUartPort__Group__20 )
            // InternalIFACE.g:2746:2: rule__GSSIfaceUartPort__Group__19__Impl rule__GSSIfaceUartPort__Group__20
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
    // InternalIFACE.g:2753:1: rule__GSSIfaceUartPort__Group__19__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartPort__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2757:1: ( ( ':=' ) )
            // InternalIFACE.g:2758:1: ( ':=' )
            {
            // InternalIFACE.g:2758:1: ( ':=' )
            // InternalIFACE.g:2759:2: ':='
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
    // InternalIFACE.g:2768:1: rule__GSSIfaceUartPort__Group__20 : rule__GSSIfaceUartPort__Group__20__Impl rule__GSSIfaceUartPort__Group__21 ;
    public final void rule__GSSIfaceUartPort__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2772:1: ( rule__GSSIfaceUartPort__Group__20__Impl rule__GSSIfaceUartPort__Group__21 )
            // InternalIFACE.g:2773:2: rule__GSSIfaceUartPort__Group__20__Impl rule__GSSIfaceUartPort__Group__21
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
    // InternalIFACE.g:2780:1: rule__GSSIfaceUartPort__Group__20__Impl : ( ( rule__GSSIfaceUartPort__StopBitsAssignment_20 ) ) ;
    public final void rule__GSSIfaceUartPort__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2784:1: ( ( ( rule__GSSIfaceUartPort__StopBitsAssignment_20 ) ) )
            // InternalIFACE.g:2785:1: ( ( rule__GSSIfaceUartPort__StopBitsAssignment_20 ) )
            {
            // InternalIFACE.g:2785:1: ( ( rule__GSSIfaceUartPort__StopBitsAssignment_20 ) )
            // InternalIFACE.g:2786:2: ( rule__GSSIfaceUartPort__StopBitsAssignment_20 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsAssignment_20()); 
            }
            // InternalIFACE.g:2787:2: ( rule__GSSIfaceUartPort__StopBitsAssignment_20 )
            // InternalIFACE.g:2787:3: rule__GSSIfaceUartPort__StopBitsAssignment_20
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
    // InternalIFACE.g:2795:1: rule__GSSIfaceUartPort__Group__21 : rule__GSSIfaceUartPort__Group__21__Impl rule__GSSIfaceUartPort__Group__22 ;
    public final void rule__GSSIfaceUartPort__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2799:1: ( rule__GSSIfaceUartPort__Group__21__Impl rule__GSSIfaceUartPort__Group__22 )
            // InternalIFACE.g:2800:2: rule__GSSIfaceUartPort__Group__21__Impl rule__GSSIfaceUartPort__Group__22
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
    // InternalIFACE.g:2807:1: rule__GSSIfaceUartPort__Group__21__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2811:1: ( ( ';' ) )
            // InternalIFACE.g:2812:1: ( ';' )
            {
            // InternalIFACE.g:2812:1: ( ';' )
            // InternalIFACE.g:2813:2: ';'
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
    // InternalIFACE.g:2822:1: rule__GSSIfaceUartPort__Group__22 : rule__GSSIfaceUartPort__Group__22__Impl rule__GSSIfaceUartPort__Group__23 ;
    public final void rule__GSSIfaceUartPort__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2826:1: ( rule__GSSIfaceUartPort__Group__22__Impl rule__GSSIfaceUartPort__Group__23 )
            // InternalIFACE.g:2827:2: rule__GSSIfaceUartPort__Group__22__Impl rule__GSSIfaceUartPort__Group__23
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
    // InternalIFACE.g:2834:1: rule__GSSIfaceUartPort__Group__22__Impl : ( 'flowControl' ) ;
    public final void rule__GSSIfaceUartPort__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2838:1: ( ( 'flowControl' ) )
            // InternalIFACE.g:2839:1: ( 'flowControl' )
            {
            // InternalIFACE.g:2839:1: ( 'flowControl' )
            // InternalIFACE.g:2840:2: 'flowControl'
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
    // InternalIFACE.g:2849:1: rule__GSSIfaceUartPort__Group__23 : rule__GSSIfaceUartPort__Group__23__Impl rule__GSSIfaceUartPort__Group__24 ;
    public final void rule__GSSIfaceUartPort__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2853:1: ( rule__GSSIfaceUartPort__Group__23__Impl rule__GSSIfaceUartPort__Group__24 )
            // InternalIFACE.g:2854:2: rule__GSSIfaceUartPort__Group__23__Impl rule__GSSIfaceUartPort__Group__24
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
    // InternalIFACE.g:2861:1: rule__GSSIfaceUartPort__Group__23__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceUartPort__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2865:1: ( ( ':=' ) )
            // InternalIFACE.g:2866:1: ( ':=' )
            {
            // InternalIFACE.g:2866:1: ( ':=' )
            // InternalIFACE.g:2867:2: ':='
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
    // InternalIFACE.g:2876:1: rule__GSSIfaceUartPort__Group__24 : rule__GSSIfaceUartPort__Group__24__Impl rule__GSSIfaceUartPort__Group__25 ;
    public final void rule__GSSIfaceUartPort__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2880:1: ( rule__GSSIfaceUartPort__Group__24__Impl rule__GSSIfaceUartPort__Group__25 )
            // InternalIFACE.g:2881:2: rule__GSSIfaceUartPort__Group__24__Impl rule__GSSIfaceUartPort__Group__25
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
    // InternalIFACE.g:2888:1: rule__GSSIfaceUartPort__Group__24__Impl : ( ( rule__GSSIfaceUartPort__FlowControlAssignment_24 ) ) ;
    public final void rule__GSSIfaceUartPort__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2892:1: ( ( ( rule__GSSIfaceUartPort__FlowControlAssignment_24 ) ) )
            // InternalIFACE.g:2893:1: ( ( rule__GSSIfaceUartPort__FlowControlAssignment_24 ) )
            {
            // InternalIFACE.g:2893:1: ( ( rule__GSSIfaceUartPort__FlowControlAssignment_24 ) )
            // InternalIFACE.g:2894:2: ( rule__GSSIfaceUartPort__FlowControlAssignment_24 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getFlowControlAssignment_24()); 
            }
            // InternalIFACE.g:2895:2: ( rule__GSSIfaceUartPort__FlowControlAssignment_24 )
            // InternalIFACE.g:2895:3: rule__GSSIfaceUartPort__FlowControlAssignment_24
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
    // InternalIFACE.g:2903:1: rule__GSSIfaceUartPort__Group__25 : rule__GSSIfaceUartPort__Group__25__Impl rule__GSSIfaceUartPort__Group__26 ;
    public final void rule__GSSIfaceUartPort__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2907:1: ( rule__GSSIfaceUartPort__Group__25__Impl rule__GSSIfaceUartPort__Group__26 )
            // InternalIFACE.g:2908:2: rule__GSSIfaceUartPort__Group__25__Impl rule__GSSIfaceUartPort__Group__26
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
    // InternalIFACE.g:2915:1: rule__GSSIfaceUartPort__Group__25__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2919:1: ( ( ';' ) )
            // InternalIFACE.g:2920:1: ( ';' )
            {
            // InternalIFACE.g:2920:1: ( ';' )
            // InternalIFACE.g:2921:2: ';'
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
    // InternalIFACE.g:2930:1: rule__GSSIfaceUartPort__Group__26 : rule__GSSIfaceUartPort__Group__26__Impl rule__GSSIfaceUartPort__Group__27 ;
    public final void rule__GSSIfaceUartPort__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2934:1: ( rule__GSSIfaceUartPort__Group__26__Impl rule__GSSIfaceUartPort__Group__27 )
            // InternalIFACE.g:2935:2: rule__GSSIfaceUartPort__Group__26__Impl rule__GSSIfaceUartPort__Group__27
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
    // InternalIFACE.g:2942:1: rule__GSSIfaceUartPort__Group__26__Impl : ( ( rule__GSSIfaceUartPort__PortProtocolAssignment_26 ) ) ;
    public final void rule__GSSIfaceUartPort__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2946:1: ( ( ( rule__GSSIfaceUartPort__PortProtocolAssignment_26 ) ) )
            // InternalIFACE.g:2947:1: ( ( rule__GSSIfaceUartPort__PortProtocolAssignment_26 ) )
            {
            // InternalIFACE.g:2947:1: ( ( rule__GSSIfaceUartPort__PortProtocolAssignment_26 ) )
            // InternalIFACE.g:2948:2: ( rule__GSSIfaceUartPort__PortProtocolAssignment_26 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getPortProtocolAssignment_26()); 
            }
            // InternalIFACE.g:2949:2: ( rule__GSSIfaceUartPort__PortProtocolAssignment_26 )
            // InternalIFACE.g:2949:3: rule__GSSIfaceUartPort__PortProtocolAssignment_26
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceUartPort__PortProtocolAssignment_26();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getPortProtocolAssignment_26()); 
            }

            }


            }

        }
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
    // InternalIFACE.g:2957:1: rule__GSSIfaceUartPort__Group__27 : rule__GSSIfaceUartPort__Group__27__Impl rule__GSSIfaceUartPort__Group__28 ;
    public final void rule__GSSIfaceUartPort__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2961:1: ( rule__GSSIfaceUartPort__Group__27__Impl rule__GSSIfaceUartPort__Group__28 )
            // InternalIFACE.g:2962:2: rule__GSSIfaceUartPort__Group__27__Impl rule__GSSIfaceUartPort__Group__28
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
    // InternalIFACE.g:2969:1: rule__GSSIfaceUartPort__Group__27__Impl : ( '}' ) ;
    public final void rule__GSSIfaceUartPort__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2973:1: ( ( '}' ) )
            // InternalIFACE.g:2974:1: ( '}' )
            {
            // InternalIFACE.g:2974:1: ( '}' )
            // InternalIFACE.g:2975:2: '}'
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
    // InternalIFACE.g:2984:1: rule__GSSIfaceUartPort__Group__28 : rule__GSSIfaceUartPort__Group__28__Impl ;
    public final void rule__GSSIfaceUartPort__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2988:1: ( rule__GSSIfaceUartPort__Group__28__Impl )
            // InternalIFACE.g:2989:2: rule__GSSIfaceUartPort__Group__28__Impl
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
    // InternalIFACE.g:2995:1: rule__GSSIfaceUartPort__Group__28__Impl : ( ';' ) ;
    public final void rule__GSSIfaceUartPort__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:2999:1: ( ( ';' ) )
            // InternalIFACE.g:3000:1: ( ';' )
            {
            // InternalIFACE.g:3000:1: ( ';' )
            // InternalIFACE.g:3001:2: ';'
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


    // $ANTLR start "rule__GSSIfaceSocketSrvPort__Group__0"
    // InternalIFACE.g:3011:1: rule__GSSIfaceSocketSrvPort__Group__0 : rule__GSSIfaceSocketSrvPort__Group__0__Impl rule__GSSIfaceSocketSrvPort__Group__1 ;
    public final void rule__GSSIfaceSocketSrvPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3015:1: ( rule__GSSIfaceSocketSrvPort__Group__0__Impl rule__GSSIfaceSocketSrvPort__Group__1 )
            // InternalIFACE.g:3016:2: rule__GSSIfaceSocketSrvPort__Group__0__Impl rule__GSSIfaceSocketSrvPort__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSIfaceSocketSrvPort__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketSrvPort__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketSrvPort__Group__0"


    // $ANTLR start "rule__GSSIfaceSocketSrvPort__Group__0__Impl"
    // InternalIFACE.g:3023:1: rule__GSSIfaceSocketSrvPort__Group__0__Impl : ( 'socketSrvPort' ) ;
    public final void rule__GSSIfaceSocketSrvPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3027:1: ( ( 'socketSrvPort' ) )
            // InternalIFACE.g:3028:1: ( 'socketSrvPort' )
            {
            // InternalIFACE.g:3028:1: ( 'socketSrvPort' )
            // InternalIFACE.g:3029:2: 'socketSrvPort'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketSrvPortAccess().getSocketSrvPortKeyword_0()); 
            }
            match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketSrvPortAccess().getSocketSrvPortKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketSrvPort__Group__0__Impl"


    // $ANTLR start "rule__GSSIfaceSocketSrvPort__Group__1"
    // InternalIFACE.g:3038:1: rule__GSSIfaceSocketSrvPort__Group__1 : rule__GSSIfaceSocketSrvPort__Group__1__Impl rule__GSSIfaceSocketSrvPort__Group__2 ;
    public final void rule__GSSIfaceSocketSrvPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3042:1: ( rule__GSSIfaceSocketSrvPort__Group__1__Impl rule__GSSIfaceSocketSrvPort__Group__2 )
            // InternalIFACE.g:3043:2: rule__GSSIfaceSocketSrvPort__Group__1__Impl rule__GSSIfaceSocketSrvPort__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__GSSIfaceSocketSrvPort__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketSrvPort__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketSrvPort__Group__1"


    // $ANTLR start "rule__GSSIfaceSocketSrvPort__Group__1__Impl"
    // InternalIFACE.g:3050:1: rule__GSSIfaceSocketSrvPort__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceSocketSrvPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3054:1: ( ( '{' ) )
            // InternalIFACE.g:3055:1: ( '{' )
            {
            // InternalIFACE.g:3055:1: ( '{' )
            // InternalIFACE.g:3056:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketSrvPortAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketSrvPortAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketSrvPort__Group__1__Impl"


    // $ANTLR start "rule__GSSIfaceSocketSrvPort__Group__2"
    // InternalIFACE.g:3065:1: rule__GSSIfaceSocketSrvPort__Group__2 : rule__GSSIfaceSocketSrvPort__Group__2__Impl rule__GSSIfaceSocketSrvPort__Group__3 ;
    public final void rule__GSSIfaceSocketSrvPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3069:1: ( rule__GSSIfaceSocketSrvPort__Group__2__Impl rule__GSSIfaceSocketSrvPort__Group__3 )
            // InternalIFACE.g:3070:2: rule__GSSIfaceSocketSrvPort__Group__2__Impl rule__GSSIfaceSocketSrvPort__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfaceSocketSrvPort__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketSrvPort__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketSrvPort__Group__2"


    // $ANTLR start "rule__GSSIfaceSocketSrvPort__Group__2__Impl"
    // InternalIFACE.g:3077:1: rule__GSSIfaceSocketSrvPort__Group__2__Impl : ( 'portNumber' ) ;
    public final void rule__GSSIfaceSocketSrvPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3081:1: ( ( 'portNumber' ) )
            // InternalIFACE.g:3082:1: ( 'portNumber' )
            {
            // InternalIFACE.g:3082:1: ( 'portNumber' )
            // InternalIFACE.g:3083:2: 'portNumber'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketSrvPortAccess().getPortNumberKeyword_2()); 
            }
            match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketSrvPortAccess().getPortNumberKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketSrvPort__Group__2__Impl"


    // $ANTLR start "rule__GSSIfaceSocketSrvPort__Group__3"
    // InternalIFACE.g:3092:1: rule__GSSIfaceSocketSrvPort__Group__3 : rule__GSSIfaceSocketSrvPort__Group__3__Impl rule__GSSIfaceSocketSrvPort__Group__4 ;
    public final void rule__GSSIfaceSocketSrvPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3096:1: ( rule__GSSIfaceSocketSrvPort__Group__3__Impl rule__GSSIfaceSocketSrvPort__Group__4 )
            // InternalIFACE.g:3097:2: rule__GSSIfaceSocketSrvPort__Group__3__Impl rule__GSSIfaceSocketSrvPort__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSIfaceSocketSrvPort__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketSrvPort__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketSrvPort__Group__3"


    // $ANTLR start "rule__GSSIfaceSocketSrvPort__Group__3__Impl"
    // InternalIFACE.g:3104:1: rule__GSSIfaceSocketSrvPort__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSocketSrvPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3108:1: ( ( ':=' ) )
            // InternalIFACE.g:3109:1: ( ':=' )
            {
            // InternalIFACE.g:3109:1: ( ':=' )
            // InternalIFACE.g:3110:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketSrvPortAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketSrvPortAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketSrvPort__Group__3__Impl"


    // $ANTLR start "rule__GSSIfaceSocketSrvPort__Group__4"
    // InternalIFACE.g:3119:1: rule__GSSIfaceSocketSrvPort__Group__4 : rule__GSSIfaceSocketSrvPort__Group__4__Impl rule__GSSIfaceSocketSrvPort__Group__5 ;
    public final void rule__GSSIfaceSocketSrvPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3123:1: ( rule__GSSIfaceSocketSrvPort__Group__4__Impl rule__GSSIfaceSocketSrvPort__Group__5 )
            // InternalIFACE.g:3124:2: rule__GSSIfaceSocketSrvPort__Group__4__Impl rule__GSSIfaceSocketSrvPort__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSocketSrvPort__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketSrvPort__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketSrvPort__Group__4"


    // $ANTLR start "rule__GSSIfaceSocketSrvPort__Group__4__Impl"
    // InternalIFACE.g:3131:1: rule__GSSIfaceSocketSrvPort__Group__4__Impl : ( ( rule__GSSIfaceSocketSrvPort__PortNumberAssignment_4 ) ) ;
    public final void rule__GSSIfaceSocketSrvPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3135:1: ( ( ( rule__GSSIfaceSocketSrvPort__PortNumberAssignment_4 ) ) )
            // InternalIFACE.g:3136:1: ( ( rule__GSSIfaceSocketSrvPort__PortNumberAssignment_4 ) )
            {
            // InternalIFACE.g:3136:1: ( ( rule__GSSIfaceSocketSrvPort__PortNumberAssignment_4 ) )
            // InternalIFACE.g:3137:2: ( rule__GSSIfaceSocketSrvPort__PortNumberAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketSrvPortAccess().getPortNumberAssignment_4()); 
            }
            // InternalIFACE.g:3138:2: ( rule__GSSIfaceSocketSrvPort__PortNumberAssignment_4 )
            // InternalIFACE.g:3138:3: rule__GSSIfaceSocketSrvPort__PortNumberAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketSrvPort__PortNumberAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketSrvPortAccess().getPortNumberAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketSrvPort__Group__4__Impl"


    // $ANTLR start "rule__GSSIfaceSocketSrvPort__Group__5"
    // InternalIFACE.g:3146:1: rule__GSSIfaceSocketSrvPort__Group__5 : rule__GSSIfaceSocketSrvPort__Group__5__Impl rule__GSSIfaceSocketSrvPort__Group__6 ;
    public final void rule__GSSIfaceSocketSrvPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3150:1: ( rule__GSSIfaceSocketSrvPort__Group__5__Impl rule__GSSIfaceSocketSrvPort__Group__6 )
            // InternalIFACE.g:3151:2: rule__GSSIfaceSocketSrvPort__Group__5__Impl rule__GSSIfaceSocketSrvPort__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__GSSIfaceSocketSrvPort__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketSrvPort__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketSrvPort__Group__5"


    // $ANTLR start "rule__GSSIfaceSocketSrvPort__Group__5__Impl"
    // InternalIFACE.g:3158:1: rule__GSSIfaceSocketSrvPort__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSocketSrvPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3162:1: ( ( ';' ) )
            // InternalIFACE.g:3163:1: ( ';' )
            {
            // InternalIFACE.g:3163:1: ( ';' )
            // InternalIFACE.g:3164:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketSrvPortAccess().getSemicolonKeyword_5()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketSrvPortAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketSrvPort__Group__5__Impl"


    // $ANTLR start "rule__GSSIfaceSocketSrvPort__Group__6"
    // InternalIFACE.g:3173:1: rule__GSSIfaceSocketSrvPort__Group__6 : rule__GSSIfaceSocketSrvPort__Group__6__Impl rule__GSSIfaceSocketSrvPort__Group__7 ;
    public final void rule__GSSIfaceSocketSrvPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3177:1: ( rule__GSSIfaceSocketSrvPort__Group__6__Impl rule__GSSIfaceSocketSrvPort__Group__7 )
            // InternalIFACE.g:3178:2: rule__GSSIfaceSocketSrvPort__Group__6__Impl rule__GSSIfaceSocketSrvPort__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceSocketSrvPort__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketSrvPort__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketSrvPort__Group__6"


    // $ANTLR start "rule__GSSIfaceSocketSrvPort__Group__6__Impl"
    // InternalIFACE.g:3185:1: rule__GSSIfaceSocketSrvPort__Group__6__Impl : ( ( rule__GSSIfaceSocketSrvPort__PortProtocolAssignment_6 ) ) ;
    public final void rule__GSSIfaceSocketSrvPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3189:1: ( ( ( rule__GSSIfaceSocketSrvPort__PortProtocolAssignment_6 ) ) )
            // InternalIFACE.g:3190:1: ( ( rule__GSSIfaceSocketSrvPort__PortProtocolAssignment_6 ) )
            {
            // InternalIFACE.g:3190:1: ( ( rule__GSSIfaceSocketSrvPort__PortProtocolAssignment_6 ) )
            // InternalIFACE.g:3191:2: ( rule__GSSIfaceSocketSrvPort__PortProtocolAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketSrvPortAccess().getPortProtocolAssignment_6()); 
            }
            // InternalIFACE.g:3192:2: ( rule__GSSIfaceSocketSrvPort__PortProtocolAssignment_6 )
            // InternalIFACE.g:3192:3: rule__GSSIfaceSocketSrvPort__PortProtocolAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketSrvPort__PortProtocolAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketSrvPortAccess().getPortProtocolAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketSrvPort__Group__6__Impl"


    // $ANTLR start "rule__GSSIfaceSocketSrvPort__Group__7"
    // InternalIFACE.g:3200:1: rule__GSSIfaceSocketSrvPort__Group__7 : rule__GSSIfaceSocketSrvPort__Group__7__Impl rule__GSSIfaceSocketSrvPort__Group__8 ;
    public final void rule__GSSIfaceSocketSrvPort__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3204:1: ( rule__GSSIfaceSocketSrvPort__Group__7__Impl rule__GSSIfaceSocketSrvPort__Group__8 )
            // InternalIFACE.g:3205:2: rule__GSSIfaceSocketSrvPort__Group__7__Impl rule__GSSIfaceSocketSrvPort__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSocketSrvPort__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketSrvPort__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketSrvPort__Group__7"


    // $ANTLR start "rule__GSSIfaceSocketSrvPort__Group__7__Impl"
    // InternalIFACE.g:3212:1: rule__GSSIfaceSocketSrvPort__Group__7__Impl : ( '}' ) ;
    public final void rule__GSSIfaceSocketSrvPort__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3216:1: ( ( '}' ) )
            // InternalIFACE.g:3217:1: ( '}' )
            {
            // InternalIFACE.g:3217:1: ( '}' )
            // InternalIFACE.g:3218:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketSrvPortAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketSrvPortAccess().getRightCurlyBracketKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketSrvPort__Group__7__Impl"


    // $ANTLR start "rule__GSSIfaceSocketSrvPort__Group__8"
    // InternalIFACE.g:3227:1: rule__GSSIfaceSocketSrvPort__Group__8 : rule__GSSIfaceSocketSrvPort__Group__8__Impl ;
    public final void rule__GSSIfaceSocketSrvPort__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3231:1: ( rule__GSSIfaceSocketSrvPort__Group__8__Impl )
            // InternalIFACE.g:3232:2: rule__GSSIfaceSocketSrvPort__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketSrvPort__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketSrvPort__Group__8"


    // $ANTLR start "rule__GSSIfaceSocketSrvPort__Group__8__Impl"
    // InternalIFACE.g:3238:1: rule__GSSIfaceSocketSrvPort__Group__8__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSocketSrvPort__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3242:1: ( ( ';' ) )
            // InternalIFACE.g:3243:1: ( ';' )
            {
            // InternalIFACE.g:3243:1: ( ';' )
            // InternalIFACE.g:3244:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketSrvPortAccess().getSemicolonKeyword_8()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketSrvPortAccess().getSemicolonKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketSrvPort__Group__8__Impl"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__Group__0"
    // InternalIFACE.g:3254:1: rule__GSSIfaceSocketCliPort__Group__0 : rule__GSSIfaceSocketCliPort__Group__0__Impl rule__GSSIfaceSocketCliPort__Group__1 ;
    public final void rule__GSSIfaceSocketCliPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3258:1: ( rule__GSSIfaceSocketCliPort__Group__0__Impl rule__GSSIfaceSocketCliPort__Group__1 )
            // InternalIFACE.g:3259:2: rule__GSSIfaceSocketCliPort__Group__0__Impl rule__GSSIfaceSocketCliPort__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSIfaceSocketCliPort__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketCliPort__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__Group__0"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__Group__0__Impl"
    // InternalIFACE.g:3266:1: rule__GSSIfaceSocketCliPort__Group__0__Impl : ( 'socketCliPort' ) ;
    public final void rule__GSSIfaceSocketCliPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3270:1: ( ( 'socketCliPort' ) )
            // InternalIFACE.g:3271:1: ( 'socketCliPort' )
            {
            // InternalIFACE.g:3271:1: ( 'socketCliPort' )
            // InternalIFACE.g:3272:2: 'socketCliPort'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketCliPortAccess().getSocketCliPortKeyword_0()); 
            }
            match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketCliPortAccess().getSocketCliPortKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__Group__0__Impl"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__Group__1"
    // InternalIFACE.g:3281:1: rule__GSSIfaceSocketCliPort__Group__1 : rule__GSSIfaceSocketCliPort__Group__1__Impl rule__GSSIfaceSocketCliPort__Group__2 ;
    public final void rule__GSSIfaceSocketCliPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3285:1: ( rule__GSSIfaceSocketCliPort__Group__1__Impl rule__GSSIfaceSocketCliPort__Group__2 )
            // InternalIFACE.g:3286:2: rule__GSSIfaceSocketCliPort__Group__1__Impl rule__GSSIfaceSocketCliPort__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__GSSIfaceSocketCliPort__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketCliPort__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__Group__1"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__Group__1__Impl"
    // InternalIFACE.g:3293:1: rule__GSSIfaceSocketCliPort__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceSocketCliPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3297:1: ( ( '{' ) )
            // InternalIFACE.g:3298:1: ( '{' )
            {
            // InternalIFACE.g:3298:1: ( '{' )
            // InternalIFACE.g:3299:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketCliPortAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketCliPortAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__Group__1__Impl"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__Group__2"
    // InternalIFACE.g:3308:1: rule__GSSIfaceSocketCliPort__Group__2 : rule__GSSIfaceSocketCliPort__Group__2__Impl rule__GSSIfaceSocketCliPort__Group__3 ;
    public final void rule__GSSIfaceSocketCliPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3312:1: ( rule__GSSIfaceSocketCliPort__Group__2__Impl rule__GSSIfaceSocketCliPort__Group__3 )
            // InternalIFACE.g:3313:2: rule__GSSIfaceSocketCliPort__Group__2__Impl rule__GSSIfaceSocketCliPort__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfaceSocketCliPort__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketCliPort__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__Group__2"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__Group__2__Impl"
    // InternalIFACE.g:3320:1: rule__GSSIfaceSocketCliPort__Group__2__Impl : ( 'ipAddress' ) ;
    public final void rule__GSSIfaceSocketCliPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3324:1: ( ( 'ipAddress' ) )
            // InternalIFACE.g:3325:1: ( 'ipAddress' )
            {
            // InternalIFACE.g:3325:1: ( 'ipAddress' )
            // InternalIFACE.g:3326:2: 'ipAddress'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketCliPortAccess().getIpAddressKeyword_2()); 
            }
            match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketCliPortAccess().getIpAddressKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__Group__2__Impl"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__Group__3"
    // InternalIFACE.g:3335:1: rule__GSSIfaceSocketCliPort__Group__3 : rule__GSSIfaceSocketCliPort__Group__3__Impl rule__GSSIfaceSocketCliPort__Group__4 ;
    public final void rule__GSSIfaceSocketCliPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3339:1: ( rule__GSSIfaceSocketCliPort__Group__3__Impl rule__GSSIfaceSocketCliPort__Group__4 )
            // InternalIFACE.g:3340:2: rule__GSSIfaceSocketCliPort__Group__3__Impl rule__GSSIfaceSocketCliPort__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSIfaceSocketCliPort__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketCliPort__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__Group__3"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__Group__3__Impl"
    // InternalIFACE.g:3347:1: rule__GSSIfaceSocketCliPort__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSocketCliPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3351:1: ( ( ':=' ) )
            // InternalIFACE.g:3352:1: ( ':=' )
            {
            // InternalIFACE.g:3352:1: ( ':=' )
            // InternalIFACE.g:3353:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketCliPortAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketCliPortAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__Group__3__Impl"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__Group__4"
    // InternalIFACE.g:3362:1: rule__GSSIfaceSocketCliPort__Group__4 : rule__GSSIfaceSocketCliPort__Group__4__Impl rule__GSSIfaceSocketCliPort__Group__5 ;
    public final void rule__GSSIfaceSocketCliPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3366:1: ( rule__GSSIfaceSocketCliPort__Group__4__Impl rule__GSSIfaceSocketCliPort__Group__5 )
            // InternalIFACE.g:3367:2: rule__GSSIfaceSocketCliPort__Group__4__Impl rule__GSSIfaceSocketCliPort__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSocketCliPort__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketCliPort__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__Group__4"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__Group__4__Impl"
    // InternalIFACE.g:3374:1: rule__GSSIfaceSocketCliPort__Group__4__Impl : ( ( rule__GSSIfaceSocketCliPort__IpAddressAssignment_4 ) ) ;
    public final void rule__GSSIfaceSocketCliPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3378:1: ( ( ( rule__GSSIfaceSocketCliPort__IpAddressAssignment_4 ) ) )
            // InternalIFACE.g:3379:1: ( ( rule__GSSIfaceSocketCliPort__IpAddressAssignment_4 ) )
            {
            // InternalIFACE.g:3379:1: ( ( rule__GSSIfaceSocketCliPort__IpAddressAssignment_4 ) )
            // InternalIFACE.g:3380:2: ( rule__GSSIfaceSocketCliPort__IpAddressAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketCliPortAccess().getIpAddressAssignment_4()); 
            }
            // InternalIFACE.g:3381:2: ( rule__GSSIfaceSocketCliPort__IpAddressAssignment_4 )
            // InternalIFACE.g:3381:3: rule__GSSIfaceSocketCliPort__IpAddressAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketCliPort__IpAddressAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketCliPortAccess().getIpAddressAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__Group__4__Impl"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__Group__5"
    // InternalIFACE.g:3389:1: rule__GSSIfaceSocketCliPort__Group__5 : rule__GSSIfaceSocketCliPort__Group__5__Impl rule__GSSIfaceSocketCliPort__Group__6 ;
    public final void rule__GSSIfaceSocketCliPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3393:1: ( rule__GSSIfaceSocketCliPort__Group__5__Impl rule__GSSIfaceSocketCliPort__Group__6 )
            // InternalIFACE.g:3394:2: rule__GSSIfaceSocketCliPort__Group__5__Impl rule__GSSIfaceSocketCliPort__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__GSSIfaceSocketCliPort__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketCliPort__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__Group__5"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__Group__5__Impl"
    // InternalIFACE.g:3401:1: rule__GSSIfaceSocketCliPort__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSocketCliPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3405:1: ( ( ';' ) )
            // InternalIFACE.g:3406:1: ( ';' )
            {
            // InternalIFACE.g:3406:1: ( ';' )
            // InternalIFACE.g:3407:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketCliPortAccess().getSemicolonKeyword_5()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketCliPortAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__Group__5__Impl"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__Group__6"
    // InternalIFACE.g:3416:1: rule__GSSIfaceSocketCliPort__Group__6 : rule__GSSIfaceSocketCliPort__Group__6__Impl rule__GSSIfaceSocketCliPort__Group__7 ;
    public final void rule__GSSIfaceSocketCliPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3420:1: ( rule__GSSIfaceSocketCliPort__Group__6__Impl rule__GSSIfaceSocketCliPort__Group__7 )
            // InternalIFACE.g:3421:2: rule__GSSIfaceSocketCliPort__Group__6__Impl rule__GSSIfaceSocketCliPort__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfaceSocketCliPort__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketCliPort__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__Group__6"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__Group__6__Impl"
    // InternalIFACE.g:3428:1: rule__GSSIfaceSocketCliPort__Group__6__Impl : ( 'portNumber' ) ;
    public final void rule__GSSIfaceSocketCliPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3432:1: ( ( 'portNumber' ) )
            // InternalIFACE.g:3433:1: ( 'portNumber' )
            {
            // InternalIFACE.g:3433:1: ( 'portNumber' )
            // InternalIFACE.g:3434:2: 'portNumber'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketCliPortAccess().getPortNumberKeyword_6()); 
            }
            match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketCliPortAccess().getPortNumberKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__Group__6__Impl"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__Group__7"
    // InternalIFACE.g:3443:1: rule__GSSIfaceSocketCliPort__Group__7 : rule__GSSIfaceSocketCliPort__Group__7__Impl rule__GSSIfaceSocketCliPort__Group__8 ;
    public final void rule__GSSIfaceSocketCliPort__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3447:1: ( rule__GSSIfaceSocketCliPort__Group__7__Impl rule__GSSIfaceSocketCliPort__Group__8 )
            // InternalIFACE.g:3448:2: rule__GSSIfaceSocketCliPort__Group__7__Impl rule__GSSIfaceSocketCliPort__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSIfaceSocketCliPort__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketCliPort__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__Group__7"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__Group__7__Impl"
    // InternalIFACE.g:3455:1: rule__GSSIfaceSocketCliPort__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSocketCliPort__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3459:1: ( ( ':=' ) )
            // InternalIFACE.g:3460:1: ( ':=' )
            {
            // InternalIFACE.g:3460:1: ( ':=' )
            // InternalIFACE.g:3461:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketCliPortAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketCliPortAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__Group__7__Impl"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__Group__8"
    // InternalIFACE.g:3470:1: rule__GSSIfaceSocketCliPort__Group__8 : rule__GSSIfaceSocketCliPort__Group__8__Impl rule__GSSIfaceSocketCliPort__Group__9 ;
    public final void rule__GSSIfaceSocketCliPort__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3474:1: ( rule__GSSIfaceSocketCliPort__Group__8__Impl rule__GSSIfaceSocketCliPort__Group__9 )
            // InternalIFACE.g:3475:2: rule__GSSIfaceSocketCliPort__Group__8__Impl rule__GSSIfaceSocketCliPort__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSocketCliPort__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketCliPort__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__Group__8"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__Group__8__Impl"
    // InternalIFACE.g:3482:1: rule__GSSIfaceSocketCliPort__Group__8__Impl : ( ( rule__GSSIfaceSocketCliPort__PortNumberAssignment_8 ) ) ;
    public final void rule__GSSIfaceSocketCliPort__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3486:1: ( ( ( rule__GSSIfaceSocketCliPort__PortNumberAssignment_8 ) ) )
            // InternalIFACE.g:3487:1: ( ( rule__GSSIfaceSocketCliPort__PortNumberAssignment_8 ) )
            {
            // InternalIFACE.g:3487:1: ( ( rule__GSSIfaceSocketCliPort__PortNumberAssignment_8 ) )
            // InternalIFACE.g:3488:2: ( rule__GSSIfaceSocketCliPort__PortNumberAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketCliPortAccess().getPortNumberAssignment_8()); 
            }
            // InternalIFACE.g:3489:2: ( rule__GSSIfaceSocketCliPort__PortNumberAssignment_8 )
            // InternalIFACE.g:3489:3: rule__GSSIfaceSocketCliPort__PortNumberAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketCliPort__PortNumberAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketCliPortAccess().getPortNumberAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__Group__8__Impl"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__Group__9"
    // InternalIFACE.g:3497:1: rule__GSSIfaceSocketCliPort__Group__9 : rule__GSSIfaceSocketCliPort__Group__9__Impl rule__GSSIfaceSocketCliPort__Group__10 ;
    public final void rule__GSSIfaceSocketCliPort__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3501:1: ( rule__GSSIfaceSocketCliPort__Group__9__Impl rule__GSSIfaceSocketCliPort__Group__10 )
            // InternalIFACE.g:3502:2: rule__GSSIfaceSocketCliPort__Group__9__Impl rule__GSSIfaceSocketCliPort__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__GSSIfaceSocketCliPort__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketCliPort__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__Group__9"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__Group__9__Impl"
    // InternalIFACE.g:3509:1: rule__GSSIfaceSocketCliPort__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSocketCliPort__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3513:1: ( ( ';' ) )
            // InternalIFACE.g:3514:1: ( ';' )
            {
            // InternalIFACE.g:3514:1: ( ';' )
            // InternalIFACE.g:3515:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketCliPortAccess().getSemicolonKeyword_9()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketCliPortAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__Group__9__Impl"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__Group__10"
    // InternalIFACE.g:3524:1: rule__GSSIfaceSocketCliPort__Group__10 : rule__GSSIfaceSocketCliPort__Group__10__Impl rule__GSSIfaceSocketCliPort__Group__11 ;
    public final void rule__GSSIfaceSocketCliPort__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3528:1: ( rule__GSSIfaceSocketCliPort__Group__10__Impl rule__GSSIfaceSocketCliPort__Group__11 )
            // InternalIFACE.g:3529:2: rule__GSSIfaceSocketCliPort__Group__10__Impl rule__GSSIfaceSocketCliPort__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSIfaceSocketCliPort__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketCliPort__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__Group__10"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__Group__10__Impl"
    // InternalIFACE.g:3536:1: rule__GSSIfaceSocketCliPort__Group__10__Impl : ( ( rule__GSSIfaceSocketCliPort__PortProtocolAssignment_10 ) ) ;
    public final void rule__GSSIfaceSocketCliPort__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3540:1: ( ( ( rule__GSSIfaceSocketCliPort__PortProtocolAssignment_10 ) ) )
            // InternalIFACE.g:3541:1: ( ( rule__GSSIfaceSocketCliPort__PortProtocolAssignment_10 ) )
            {
            // InternalIFACE.g:3541:1: ( ( rule__GSSIfaceSocketCliPort__PortProtocolAssignment_10 ) )
            // InternalIFACE.g:3542:2: ( rule__GSSIfaceSocketCliPort__PortProtocolAssignment_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketCliPortAccess().getPortProtocolAssignment_10()); 
            }
            // InternalIFACE.g:3543:2: ( rule__GSSIfaceSocketCliPort__PortProtocolAssignment_10 )
            // InternalIFACE.g:3543:3: rule__GSSIfaceSocketCliPort__PortProtocolAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketCliPort__PortProtocolAssignment_10();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketCliPortAccess().getPortProtocolAssignment_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__Group__10__Impl"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__Group__11"
    // InternalIFACE.g:3551:1: rule__GSSIfaceSocketCliPort__Group__11 : rule__GSSIfaceSocketCliPort__Group__11__Impl rule__GSSIfaceSocketCliPort__Group__12 ;
    public final void rule__GSSIfaceSocketCliPort__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3555:1: ( rule__GSSIfaceSocketCliPort__Group__11__Impl rule__GSSIfaceSocketCliPort__Group__12 )
            // InternalIFACE.g:3556:2: rule__GSSIfaceSocketCliPort__Group__11__Impl rule__GSSIfaceSocketCliPort__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfaceSocketCliPort__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketCliPort__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__Group__11"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__Group__11__Impl"
    // InternalIFACE.g:3563:1: rule__GSSIfaceSocketCliPort__Group__11__Impl : ( '}' ) ;
    public final void rule__GSSIfaceSocketCliPort__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3567:1: ( ( '}' ) )
            // InternalIFACE.g:3568:1: ( '}' )
            {
            // InternalIFACE.g:3568:1: ( '}' )
            // InternalIFACE.g:3569:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketCliPortAccess().getRightCurlyBracketKeyword_11()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketCliPortAccess().getRightCurlyBracketKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__Group__11__Impl"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__Group__12"
    // InternalIFACE.g:3578:1: rule__GSSIfaceSocketCliPort__Group__12 : rule__GSSIfaceSocketCliPort__Group__12__Impl ;
    public final void rule__GSSIfaceSocketCliPort__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3582:1: ( rule__GSSIfaceSocketCliPort__Group__12__Impl )
            // InternalIFACE.g:3583:2: rule__GSSIfaceSocketCliPort__Group__12__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfaceSocketCliPort__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__Group__12"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__Group__12__Impl"
    // InternalIFACE.g:3589:1: rule__GSSIfaceSocketCliPort__Group__12__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSocketCliPort__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3593:1: ( ( ';' ) )
            // InternalIFACE.g:3594:1: ( ';' )
            {
            // InternalIFACE.g:3594:1: ( ';' )
            // InternalIFACE.g:3595:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketCliPortAccess().getSemicolonKeyword_12()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketCliPortAccess().getSemicolonKeyword_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__Group__12__Impl"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__0"
    // InternalIFACE.g:3605:1: rule__GSSIfacePortProtocol__Group__0 : rule__GSSIfacePortProtocol__Group__0__Impl rule__GSSIfacePortProtocol__Group__1 ;
    public final void rule__GSSIfacePortProtocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3609:1: ( rule__GSSIfacePortProtocol__Group__0__Impl rule__GSSIfacePortProtocol__Group__1 )
            // InternalIFACE.g:3610:2: rule__GSSIfacePortProtocol__Group__0__Impl rule__GSSIfacePortProtocol__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSIfacePortProtocol__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortProtocol__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__0"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__0__Impl"
    // InternalIFACE.g:3617:1: rule__GSSIfacePortProtocol__Group__0__Impl : ( 'portProtocol' ) ;
    public final void rule__GSSIfacePortProtocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3621:1: ( ( 'portProtocol' ) )
            // InternalIFACE.g:3622:1: ( 'portProtocol' )
            {
            // InternalIFACE.g:3622:1: ( 'portProtocol' )
            // InternalIFACE.g:3623:2: 'portProtocol'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortProtocolAccess().getPortProtocolKeyword_0()); 
            }
            match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortProtocolAccess().getPortProtocolKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__0__Impl"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__1"
    // InternalIFACE.g:3632:1: rule__GSSIfacePortProtocol__Group__1 : rule__GSSIfacePortProtocol__Group__1__Impl rule__GSSIfacePortProtocol__Group__2 ;
    public final void rule__GSSIfacePortProtocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3636:1: ( rule__GSSIfacePortProtocol__Group__1__Impl rule__GSSIfacePortProtocol__Group__2 )
            // InternalIFACE.g:3637:2: rule__GSSIfacePortProtocol__Group__1__Impl rule__GSSIfacePortProtocol__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__GSSIfacePortProtocol__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortProtocol__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__1"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__1__Impl"
    // InternalIFACE.g:3644:1: rule__GSSIfacePortProtocol__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfacePortProtocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3648:1: ( ( '{' ) )
            // InternalIFACE.g:3649:1: ( '{' )
            {
            // InternalIFACE.g:3649:1: ( '{' )
            // InternalIFACE.g:3650:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortProtocolAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortProtocolAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__1__Impl"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__2"
    // InternalIFACE.g:3659:1: rule__GSSIfacePortProtocol__Group__2 : rule__GSSIfacePortProtocol__Group__2__Impl rule__GSSIfacePortProtocol__Group__3 ;
    public final void rule__GSSIfacePortProtocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3663:1: ( rule__GSSIfacePortProtocol__Group__2__Impl rule__GSSIfacePortProtocol__Group__3 )
            // InternalIFACE.g:3664:2: rule__GSSIfacePortProtocol__Group__2__Impl rule__GSSIfacePortProtocol__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfacePortProtocol__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortProtocol__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__2"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__2__Impl"
    // InternalIFACE.g:3671:1: rule__GSSIfacePortProtocol__Group__2__Impl : ( 'unit' ) ;
    public final void rule__GSSIfacePortProtocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3675:1: ( ( 'unit' ) )
            // InternalIFACE.g:3676:1: ( 'unit' )
            {
            // InternalIFACE.g:3676:1: ( 'unit' )
            // InternalIFACE.g:3677:2: 'unit'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortProtocolAccess().getUnitKeyword_2()); 
            }
            match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortProtocolAccess().getUnitKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__2__Impl"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__3"
    // InternalIFACE.g:3686:1: rule__GSSIfacePortProtocol__Group__3 : rule__GSSIfacePortProtocol__Group__3__Impl rule__GSSIfacePortProtocol__Group__4 ;
    public final void rule__GSSIfacePortProtocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3690:1: ( rule__GSSIfacePortProtocol__Group__3__Impl rule__GSSIfacePortProtocol__Group__4 )
            // InternalIFACE.g:3691:2: rule__GSSIfacePortProtocol__Group__3__Impl rule__GSSIfacePortProtocol__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_37);
            rule__GSSIfacePortProtocol__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortProtocol__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__3"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__3__Impl"
    // InternalIFACE.g:3698:1: rule__GSSIfacePortProtocol__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfacePortProtocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3702:1: ( ( ':=' ) )
            // InternalIFACE.g:3703:1: ( ':=' )
            {
            // InternalIFACE.g:3703:1: ( ':=' )
            // InternalIFACE.g:3704:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortProtocolAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortProtocolAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__3__Impl"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__4"
    // InternalIFACE.g:3713:1: rule__GSSIfacePortProtocol__Group__4 : rule__GSSIfacePortProtocol__Group__4__Impl rule__GSSIfacePortProtocol__Group__5 ;
    public final void rule__GSSIfacePortProtocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3717:1: ( rule__GSSIfacePortProtocol__Group__4__Impl rule__GSSIfacePortProtocol__Group__5 )
            // InternalIFACE.g:3718:2: rule__GSSIfacePortProtocol__Group__4__Impl rule__GSSIfacePortProtocol__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfacePortProtocol__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortProtocol__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__4"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__4__Impl"
    // InternalIFACE.g:3725:1: rule__GSSIfacePortProtocol__Group__4__Impl : ( ( rule__GSSIfacePortProtocol__UnitAssignment_4 ) ) ;
    public final void rule__GSSIfacePortProtocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3729:1: ( ( ( rule__GSSIfacePortProtocol__UnitAssignment_4 ) ) )
            // InternalIFACE.g:3730:1: ( ( rule__GSSIfacePortProtocol__UnitAssignment_4 ) )
            {
            // InternalIFACE.g:3730:1: ( ( rule__GSSIfacePortProtocol__UnitAssignment_4 ) )
            // InternalIFACE.g:3731:2: ( rule__GSSIfacePortProtocol__UnitAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortProtocolAccess().getUnitAssignment_4()); 
            }
            // InternalIFACE.g:3732:2: ( rule__GSSIfacePortProtocol__UnitAssignment_4 )
            // InternalIFACE.g:3732:3: rule__GSSIfacePortProtocol__UnitAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortProtocol__UnitAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortProtocolAccess().getUnitAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__4__Impl"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__5"
    // InternalIFACE.g:3740:1: rule__GSSIfacePortProtocol__Group__5 : rule__GSSIfacePortProtocol__Group__5__Impl rule__GSSIfacePortProtocol__Group__6 ;
    public final void rule__GSSIfacePortProtocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3744:1: ( rule__GSSIfacePortProtocol__Group__5__Impl rule__GSSIfacePortProtocol__Group__6 )
            // InternalIFACE.g:3745:2: rule__GSSIfacePortProtocol__Group__5__Impl rule__GSSIfacePortProtocol__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_38);
            rule__GSSIfacePortProtocol__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortProtocol__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__5"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__5__Impl"
    // InternalIFACE.g:3752:1: rule__GSSIfacePortProtocol__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfacePortProtocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3756:1: ( ( ';' ) )
            // InternalIFACE.g:3757:1: ( ';' )
            {
            // InternalIFACE.g:3757:1: ( ';' )
            // InternalIFACE.g:3758:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortProtocolAccess().getSemicolonKeyword_5()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortProtocolAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__5__Impl"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__6"
    // InternalIFACE.g:3767:1: rule__GSSIfacePortProtocol__Group__6 : rule__GSSIfacePortProtocol__Group__6__Impl rule__GSSIfacePortProtocol__Group__7 ;
    public final void rule__GSSIfacePortProtocol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3771:1: ( rule__GSSIfacePortProtocol__Group__6__Impl rule__GSSIfacePortProtocol__Group__7 )
            // InternalIFACE.g:3772:2: rule__GSSIfacePortProtocol__Group__6__Impl rule__GSSIfacePortProtocol__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSIfacePortProtocol__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortProtocol__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__6"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__6__Impl"
    // InternalIFACE.g:3779:1: rule__GSSIfacePortProtocol__Group__6__Impl : ( 'power' ) ;
    public final void rule__GSSIfacePortProtocol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3783:1: ( ( 'power' ) )
            // InternalIFACE.g:3784:1: ( 'power' )
            {
            // InternalIFACE.g:3784:1: ( 'power' )
            // InternalIFACE.g:3785:2: 'power'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortProtocolAccess().getPowerKeyword_6()); 
            }
            match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortProtocolAccess().getPowerKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__6__Impl"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__7"
    // InternalIFACE.g:3794:1: rule__GSSIfacePortProtocol__Group__7 : rule__GSSIfacePortProtocol__Group__7__Impl rule__GSSIfacePortProtocol__Group__8 ;
    public final void rule__GSSIfacePortProtocol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3798:1: ( rule__GSSIfacePortProtocol__Group__7__Impl rule__GSSIfacePortProtocol__Group__8 )
            // InternalIFACE.g:3799:2: rule__GSSIfacePortProtocol__Group__7__Impl rule__GSSIfacePortProtocol__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__GSSIfacePortProtocol__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortProtocol__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__7"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__7__Impl"
    // InternalIFACE.g:3806:1: rule__GSSIfacePortProtocol__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSIfacePortProtocol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3810:1: ( ( ':=' ) )
            // InternalIFACE.g:3811:1: ( ':=' )
            {
            // InternalIFACE.g:3811:1: ( ':=' )
            // InternalIFACE.g:3812:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortProtocolAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortProtocolAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__7__Impl"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__8"
    // InternalIFACE.g:3821:1: rule__GSSIfacePortProtocol__Group__8 : rule__GSSIfacePortProtocol__Group__8__Impl rule__GSSIfacePortProtocol__Group__9 ;
    public final void rule__GSSIfacePortProtocol__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3825:1: ( rule__GSSIfacePortProtocol__Group__8__Impl rule__GSSIfacePortProtocol__Group__9 )
            // InternalIFACE.g:3826:2: rule__GSSIfacePortProtocol__Group__8__Impl rule__GSSIfacePortProtocol__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfacePortProtocol__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortProtocol__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__8"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__8__Impl"
    // InternalIFACE.g:3833:1: rule__GSSIfacePortProtocol__Group__8__Impl : ( ( rule__GSSIfacePortProtocol__PowerAssignment_8 ) ) ;
    public final void rule__GSSIfacePortProtocol__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3837:1: ( ( ( rule__GSSIfacePortProtocol__PowerAssignment_8 ) ) )
            // InternalIFACE.g:3838:1: ( ( rule__GSSIfacePortProtocol__PowerAssignment_8 ) )
            {
            // InternalIFACE.g:3838:1: ( ( rule__GSSIfacePortProtocol__PowerAssignment_8 ) )
            // InternalIFACE.g:3839:2: ( rule__GSSIfacePortProtocol__PowerAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortProtocolAccess().getPowerAssignment_8()); 
            }
            // InternalIFACE.g:3840:2: ( rule__GSSIfacePortProtocol__PowerAssignment_8 )
            // InternalIFACE.g:3840:3: rule__GSSIfacePortProtocol__PowerAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortProtocol__PowerAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortProtocolAccess().getPowerAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__8__Impl"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__9"
    // InternalIFACE.g:3848:1: rule__GSSIfacePortProtocol__Group__9 : rule__GSSIfacePortProtocol__Group__9__Impl rule__GSSIfacePortProtocol__Group__10 ;
    public final void rule__GSSIfacePortProtocol__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3852:1: ( rule__GSSIfacePortProtocol__Group__9__Impl rule__GSSIfacePortProtocol__Group__10 )
            // InternalIFACE.g:3853:2: rule__GSSIfacePortProtocol__Group__9__Impl rule__GSSIfacePortProtocol__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__GSSIfacePortProtocol__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortProtocol__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__9"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__9__Impl"
    // InternalIFACE.g:3860:1: rule__GSSIfacePortProtocol__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSIfacePortProtocol__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3864:1: ( ( ';' ) )
            // InternalIFACE.g:3865:1: ( ';' )
            {
            // InternalIFACE.g:3865:1: ( ';' )
            // InternalIFACE.g:3866:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortProtocolAccess().getSemicolonKeyword_9()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortProtocolAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__9__Impl"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__10"
    // InternalIFACE.g:3875:1: rule__GSSIfacePortProtocol__Group__10 : rule__GSSIfacePortProtocol__Group__10__Impl rule__GSSIfacePortProtocol__Group__11 ;
    public final void rule__GSSIfacePortProtocol__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3879:1: ( rule__GSSIfacePortProtocol__Group__10__Impl rule__GSSIfacePortProtocol__Group__11 )
            // InternalIFACE.g:3880:2: rule__GSSIfacePortProtocol__Group__10__Impl rule__GSSIfacePortProtocol__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_41);
            rule__GSSIfacePortProtocol__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortProtocol__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__10"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__10__Impl"
    // InternalIFACE.g:3887:1: rule__GSSIfacePortProtocol__Group__10__Impl : ( ( rule__GSSIfacePortProtocol__ConstSizeAssignment_10 ) ) ;
    public final void rule__GSSIfacePortProtocol__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3891:1: ( ( ( rule__GSSIfacePortProtocol__ConstSizeAssignment_10 ) ) )
            // InternalIFACE.g:3892:1: ( ( rule__GSSIfacePortProtocol__ConstSizeAssignment_10 ) )
            {
            // InternalIFACE.g:3892:1: ( ( rule__GSSIfacePortProtocol__ConstSizeAssignment_10 ) )
            // InternalIFACE.g:3893:2: ( rule__GSSIfacePortProtocol__ConstSizeAssignment_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortProtocolAccess().getConstSizeAssignment_10()); 
            }
            // InternalIFACE.g:3894:2: ( rule__GSSIfacePortProtocol__ConstSizeAssignment_10 )
            // InternalIFACE.g:3894:3: rule__GSSIfacePortProtocol__ConstSizeAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortProtocol__ConstSizeAssignment_10();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortProtocolAccess().getConstSizeAssignment_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__10__Impl"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__11"
    // InternalIFACE.g:3902:1: rule__GSSIfacePortProtocol__Group__11 : rule__GSSIfacePortProtocol__Group__11__Impl rule__GSSIfacePortProtocol__Group__12 ;
    public final void rule__GSSIfacePortProtocol__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3906:1: ( rule__GSSIfacePortProtocol__Group__11__Impl rule__GSSIfacePortProtocol__Group__12 )
            // InternalIFACE.g:3907:2: rule__GSSIfacePortProtocol__Group__11__Impl rule__GSSIfacePortProtocol__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__GSSIfacePortProtocol__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortProtocol__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__11"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__11__Impl"
    // InternalIFACE.g:3914:1: rule__GSSIfacePortProtocol__Group__11__Impl : ( ( rule__GSSIfacePortProtocol__SizeFieldOffsetAssignment_11 ) ) ;
    public final void rule__GSSIfacePortProtocol__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3918:1: ( ( ( rule__GSSIfacePortProtocol__SizeFieldOffsetAssignment_11 ) ) )
            // InternalIFACE.g:3919:1: ( ( rule__GSSIfacePortProtocol__SizeFieldOffsetAssignment_11 ) )
            {
            // InternalIFACE.g:3919:1: ( ( rule__GSSIfacePortProtocol__SizeFieldOffsetAssignment_11 ) )
            // InternalIFACE.g:3920:2: ( rule__GSSIfacePortProtocol__SizeFieldOffsetAssignment_11 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortProtocolAccess().getSizeFieldOffsetAssignment_11()); 
            }
            // InternalIFACE.g:3921:2: ( rule__GSSIfacePortProtocol__SizeFieldOffsetAssignment_11 )
            // InternalIFACE.g:3921:3: rule__GSSIfacePortProtocol__SizeFieldOffsetAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortProtocol__SizeFieldOffsetAssignment_11();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortProtocolAccess().getSizeFieldOffsetAssignment_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__11__Impl"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__12"
    // InternalIFACE.g:3929:1: rule__GSSIfacePortProtocol__Group__12 : rule__GSSIfacePortProtocol__Group__12__Impl rule__GSSIfacePortProtocol__Group__13 ;
    public final void rule__GSSIfacePortProtocol__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3933:1: ( rule__GSSIfacePortProtocol__Group__12__Impl rule__GSSIfacePortProtocol__Group__13 )
            // InternalIFACE.g:3934:2: rule__GSSIfacePortProtocol__Group__12__Impl rule__GSSIfacePortProtocol__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_43);
            rule__GSSIfacePortProtocol__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortProtocol__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__12"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__12__Impl"
    // InternalIFACE.g:3941:1: rule__GSSIfacePortProtocol__Group__12__Impl : ( ( rule__GSSIfacePortProtocol__SizeFieldTrimAssignment_12 ) ) ;
    public final void rule__GSSIfacePortProtocol__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3945:1: ( ( ( rule__GSSIfacePortProtocol__SizeFieldTrimAssignment_12 ) ) )
            // InternalIFACE.g:3946:1: ( ( rule__GSSIfacePortProtocol__SizeFieldTrimAssignment_12 ) )
            {
            // InternalIFACE.g:3946:1: ( ( rule__GSSIfacePortProtocol__SizeFieldTrimAssignment_12 ) )
            // InternalIFACE.g:3947:2: ( rule__GSSIfacePortProtocol__SizeFieldTrimAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortProtocolAccess().getSizeFieldTrimAssignment_12()); 
            }
            // InternalIFACE.g:3948:2: ( rule__GSSIfacePortProtocol__SizeFieldTrimAssignment_12 )
            // InternalIFACE.g:3948:3: rule__GSSIfacePortProtocol__SizeFieldTrimAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortProtocol__SizeFieldTrimAssignment_12();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortProtocolAccess().getSizeFieldTrimAssignment_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__12__Impl"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__13"
    // InternalIFACE.g:3956:1: rule__GSSIfacePortProtocol__Group__13 : rule__GSSIfacePortProtocol__Group__13__Impl rule__GSSIfacePortProtocol__Group__14 ;
    public final void rule__GSSIfacePortProtocol__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3960:1: ( rule__GSSIfacePortProtocol__Group__13__Impl rule__GSSIfacePortProtocol__Group__14 )
            // InternalIFACE.g:3961:2: rule__GSSIfacePortProtocol__Group__13__Impl rule__GSSIfacePortProtocol__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_43);
            rule__GSSIfacePortProtocol__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortProtocol__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__13"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__13__Impl"
    // InternalIFACE.g:3968:1: rule__GSSIfacePortProtocol__Group__13__Impl : ( ( rule__GSSIfacePortProtocol__SyncPatternAssignment_13 )? ) ;
    public final void rule__GSSIfacePortProtocol__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3972:1: ( ( ( rule__GSSIfacePortProtocol__SyncPatternAssignment_13 )? ) )
            // InternalIFACE.g:3973:1: ( ( rule__GSSIfacePortProtocol__SyncPatternAssignment_13 )? )
            {
            // InternalIFACE.g:3973:1: ( ( rule__GSSIfacePortProtocol__SyncPatternAssignment_13 )? )
            // InternalIFACE.g:3974:2: ( rule__GSSIfacePortProtocol__SyncPatternAssignment_13 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortProtocolAccess().getSyncPatternAssignment_13()); 
            }
            // InternalIFACE.g:3975:2: ( rule__GSSIfacePortProtocol__SyncPatternAssignment_13 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==65) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalIFACE.g:3975:3: rule__GSSIfacePortProtocol__SyncPatternAssignment_13
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSIfacePortProtocol__SyncPatternAssignment_13();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortProtocolAccess().getSyncPatternAssignment_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__13__Impl"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__14"
    // InternalIFACE.g:3983:1: rule__GSSIfacePortProtocol__Group__14 : rule__GSSIfacePortProtocol__Group__14__Impl rule__GSSIfacePortProtocol__Group__15 ;
    public final void rule__GSSIfacePortProtocol__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3987:1: ( rule__GSSIfacePortProtocol__Group__14__Impl rule__GSSIfacePortProtocol__Group__15 )
            // InternalIFACE.g:3988:2: rule__GSSIfacePortProtocol__Group__14__Impl rule__GSSIfacePortProtocol__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSIfacePortProtocol__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortProtocol__Group__15();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__14"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__14__Impl"
    // InternalIFACE.g:3995:1: rule__GSSIfacePortProtocol__Group__14__Impl : ( '}' ) ;
    public final void rule__GSSIfacePortProtocol__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:3999:1: ( ( '}' ) )
            // InternalIFACE.g:4000:1: ( '}' )
            {
            // InternalIFACE.g:4000:1: ( '}' )
            // InternalIFACE.g:4001:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortProtocolAccess().getRightCurlyBracketKeyword_14()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortProtocolAccess().getRightCurlyBracketKeyword_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__14__Impl"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__15"
    // InternalIFACE.g:4010:1: rule__GSSIfacePortProtocol__Group__15 : rule__GSSIfacePortProtocol__Group__15__Impl ;
    public final void rule__GSSIfacePortProtocol__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4014:1: ( rule__GSSIfacePortProtocol__Group__15__Impl )
            // InternalIFACE.g:4015:2: rule__GSSIfacePortProtocol__Group__15__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSIfacePortProtocol__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__15"


    // $ANTLR start "rule__GSSIfacePortProtocol__Group__15__Impl"
    // InternalIFACE.g:4021:1: rule__GSSIfacePortProtocol__Group__15__Impl : ( ';' ) ;
    public final void rule__GSSIfacePortProtocol__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4025:1: ( ( ';' ) )
            // InternalIFACE.g:4026:1: ( ';' )
            {
            // InternalIFACE.g:4026:1: ( ';' )
            // InternalIFACE.g:4027:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortProtocolAccess().getSemicolonKeyword_15()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortProtocolAccess().getSemicolonKeyword_15()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__Group__15__Impl"


    // $ANTLR start "rule__GSSIfaceConstSize__Group__0"
    // InternalIFACE.g:4037:1: rule__GSSIfaceConstSize__Group__0 : rule__GSSIfaceConstSize__Group__0__Impl rule__GSSIfaceConstSize__Group__1 ;
    public final void rule__GSSIfaceConstSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4041:1: ( rule__GSSIfaceConstSize__Group__0__Impl rule__GSSIfaceConstSize__Group__1 )
            // InternalIFACE.g:4042:2: rule__GSSIfaceConstSize__Group__0__Impl rule__GSSIfaceConstSize__Group__1
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
    // InternalIFACE.g:4049:1: rule__GSSIfaceConstSize__Group__0__Impl : ( 'constSize' ) ;
    public final void rule__GSSIfaceConstSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4053:1: ( ( 'constSize' ) )
            // InternalIFACE.g:4054:1: ( 'constSize' )
            {
            // InternalIFACE.g:4054:1: ( 'constSize' )
            // InternalIFACE.g:4055:2: 'constSize'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getConstSizeKeyword_0()); 
            }
            match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4064:1: rule__GSSIfaceConstSize__Group__1 : rule__GSSIfaceConstSize__Group__1__Impl rule__GSSIfaceConstSize__Group__2 ;
    public final void rule__GSSIfaceConstSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4068:1: ( rule__GSSIfaceConstSize__Group__1__Impl rule__GSSIfaceConstSize__Group__2 )
            // InternalIFACE.g:4069:2: rule__GSSIfaceConstSize__Group__1__Impl rule__GSSIfaceConstSize__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_44);
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
    // InternalIFACE.g:4076:1: rule__GSSIfaceConstSize__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceConstSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4080:1: ( ( '{' ) )
            // InternalIFACE.g:4081:1: ( '{' )
            {
            // InternalIFACE.g:4081:1: ( '{' )
            // InternalIFACE.g:4082:2: '{'
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
    // InternalIFACE.g:4091:1: rule__GSSIfaceConstSize__Group__2 : rule__GSSIfaceConstSize__Group__2__Impl rule__GSSIfaceConstSize__Group__3 ;
    public final void rule__GSSIfaceConstSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4095:1: ( rule__GSSIfaceConstSize__Group__2__Impl rule__GSSIfaceConstSize__Group__3 )
            // InternalIFACE.g:4096:2: rule__GSSIfaceConstSize__Group__2__Impl rule__GSSIfaceConstSize__Group__3
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
    // InternalIFACE.g:4103:1: rule__GSSIfaceConstSize__Group__2__Impl : ( 'bytes' ) ;
    public final void rule__GSSIfaceConstSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4107:1: ( ( 'bytes' ) )
            // InternalIFACE.g:4108:1: ( 'bytes' )
            {
            // InternalIFACE.g:4108:1: ( 'bytes' )
            // InternalIFACE.g:4109:2: 'bytes'
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
    // InternalIFACE.g:4118:1: rule__GSSIfaceConstSize__Group__3 : rule__GSSIfaceConstSize__Group__3__Impl rule__GSSIfaceConstSize__Group__4 ;
    public final void rule__GSSIfaceConstSize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4122:1: ( rule__GSSIfaceConstSize__Group__3__Impl rule__GSSIfaceConstSize__Group__4 )
            // InternalIFACE.g:4123:2: rule__GSSIfaceConstSize__Group__3__Impl rule__GSSIfaceConstSize__Group__4
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
    // InternalIFACE.g:4130:1: rule__GSSIfaceConstSize__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceConstSize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4134:1: ( ( ':=' ) )
            // InternalIFACE.g:4135:1: ( ':=' )
            {
            // InternalIFACE.g:4135:1: ( ':=' )
            // InternalIFACE.g:4136:2: ':='
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
    // InternalIFACE.g:4145:1: rule__GSSIfaceConstSize__Group__4 : rule__GSSIfaceConstSize__Group__4__Impl rule__GSSIfaceConstSize__Group__5 ;
    public final void rule__GSSIfaceConstSize__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4149:1: ( rule__GSSIfaceConstSize__Group__4__Impl rule__GSSIfaceConstSize__Group__5 )
            // InternalIFACE.g:4150:2: rule__GSSIfaceConstSize__Group__4__Impl rule__GSSIfaceConstSize__Group__5
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
    // InternalIFACE.g:4157:1: rule__GSSIfaceConstSize__Group__4__Impl : ( ( rule__GSSIfaceConstSize__BytesAssignment_4 ) ) ;
    public final void rule__GSSIfaceConstSize__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4161:1: ( ( ( rule__GSSIfaceConstSize__BytesAssignment_4 ) ) )
            // InternalIFACE.g:4162:1: ( ( rule__GSSIfaceConstSize__BytesAssignment_4 ) )
            {
            // InternalIFACE.g:4162:1: ( ( rule__GSSIfaceConstSize__BytesAssignment_4 ) )
            // InternalIFACE.g:4163:2: ( rule__GSSIfaceConstSize__BytesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getBytesAssignment_4()); 
            }
            // InternalIFACE.g:4164:2: ( rule__GSSIfaceConstSize__BytesAssignment_4 )
            // InternalIFACE.g:4164:3: rule__GSSIfaceConstSize__BytesAssignment_4
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
    // InternalIFACE.g:4172:1: rule__GSSIfaceConstSize__Group__5 : rule__GSSIfaceConstSize__Group__5__Impl rule__GSSIfaceConstSize__Group__6 ;
    public final void rule__GSSIfaceConstSize__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4176:1: ( rule__GSSIfaceConstSize__Group__5__Impl rule__GSSIfaceConstSize__Group__6 )
            // InternalIFACE.g:4177:2: rule__GSSIfaceConstSize__Group__5__Impl rule__GSSIfaceConstSize__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_45);
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
    // InternalIFACE.g:4184:1: rule__GSSIfaceConstSize__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceConstSize__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4188:1: ( ( ';' ) )
            // InternalIFACE.g:4189:1: ( ';' )
            {
            // InternalIFACE.g:4189:1: ( ';' )
            // InternalIFACE.g:4190:2: ';'
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
    // InternalIFACE.g:4199:1: rule__GSSIfaceConstSize__Group__6 : rule__GSSIfaceConstSize__Group__6__Impl rule__GSSIfaceConstSize__Group__7 ;
    public final void rule__GSSIfaceConstSize__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4203:1: ( rule__GSSIfaceConstSize__Group__6__Impl rule__GSSIfaceConstSize__Group__7 )
            // InternalIFACE.g:4204:2: rule__GSSIfaceConstSize__Group__6__Impl rule__GSSIfaceConstSize__Group__7
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
    // InternalIFACE.g:4211:1: rule__GSSIfaceConstSize__Group__6__Impl : ( 'bits' ) ;
    public final void rule__GSSIfaceConstSize__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4215:1: ( ( 'bits' ) )
            // InternalIFACE.g:4216:1: ( 'bits' )
            {
            // InternalIFACE.g:4216:1: ( 'bits' )
            // InternalIFACE.g:4217:2: 'bits'
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
    // InternalIFACE.g:4226:1: rule__GSSIfaceConstSize__Group__7 : rule__GSSIfaceConstSize__Group__7__Impl rule__GSSIfaceConstSize__Group__8 ;
    public final void rule__GSSIfaceConstSize__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4230:1: ( rule__GSSIfaceConstSize__Group__7__Impl rule__GSSIfaceConstSize__Group__8 )
            // InternalIFACE.g:4231:2: rule__GSSIfaceConstSize__Group__7__Impl rule__GSSIfaceConstSize__Group__8
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
    // InternalIFACE.g:4238:1: rule__GSSIfaceConstSize__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceConstSize__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4242:1: ( ( ':=' ) )
            // InternalIFACE.g:4243:1: ( ':=' )
            {
            // InternalIFACE.g:4243:1: ( ':=' )
            // InternalIFACE.g:4244:2: ':='
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
    // InternalIFACE.g:4253:1: rule__GSSIfaceConstSize__Group__8 : rule__GSSIfaceConstSize__Group__8__Impl rule__GSSIfaceConstSize__Group__9 ;
    public final void rule__GSSIfaceConstSize__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4257:1: ( rule__GSSIfaceConstSize__Group__8__Impl rule__GSSIfaceConstSize__Group__9 )
            // InternalIFACE.g:4258:2: rule__GSSIfaceConstSize__Group__8__Impl rule__GSSIfaceConstSize__Group__9
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
    // InternalIFACE.g:4265:1: rule__GSSIfaceConstSize__Group__8__Impl : ( ( rule__GSSIfaceConstSize__BitsAssignment_8 ) ) ;
    public final void rule__GSSIfaceConstSize__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4269:1: ( ( ( rule__GSSIfaceConstSize__BitsAssignment_8 ) ) )
            // InternalIFACE.g:4270:1: ( ( rule__GSSIfaceConstSize__BitsAssignment_8 ) )
            {
            // InternalIFACE.g:4270:1: ( ( rule__GSSIfaceConstSize__BitsAssignment_8 ) )
            // InternalIFACE.g:4271:2: ( rule__GSSIfaceConstSize__BitsAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceConstSizeAccess().getBitsAssignment_8()); 
            }
            // InternalIFACE.g:4272:2: ( rule__GSSIfaceConstSize__BitsAssignment_8 )
            // InternalIFACE.g:4272:3: rule__GSSIfaceConstSize__BitsAssignment_8
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
    // InternalIFACE.g:4280:1: rule__GSSIfaceConstSize__Group__9 : rule__GSSIfaceConstSize__Group__9__Impl rule__GSSIfaceConstSize__Group__10 ;
    public final void rule__GSSIfaceConstSize__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4284:1: ( rule__GSSIfaceConstSize__Group__9__Impl rule__GSSIfaceConstSize__Group__10 )
            // InternalIFACE.g:4285:2: rule__GSSIfaceConstSize__Group__9__Impl rule__GSSIfaceConstSize__Group__10
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
    // InternalIFACE.g:4292:1: rule__GSSIfaceConstSize__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSIfaceConstSize__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4296:1: ( ( ';' ) )
            // InternalIFACE.g:4297:1: ( ';' )
            {
            // InternalIFACE.g:4297:1: ( ';' )
            // InternalIFACE.g:4298:2: ';'
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
    // InternalIFACE.g:4307:1: rule__GSSIfaceConstSize__Group__10 : rule__GSSIfaceConstSize__Group__10__Impl rule__GSSIfaceConstSize__Group__11 ;
    public final void rule__GSSIfaceConstSize__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4311:1: ( rule__GSSIfaceConstSize__Group__10__Impl rule__GSSIfaceConstSize__Group__11 )
            // InternalIFACE.g:4312:2: rule__GSSIfaceConstSize__Group__10__Impl rule__GSSIfaceConstSize__Group__11
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
    // InternalIFACE.g:4319:1: rule__GSSIfaceConstSize__Group__10__Impl : ( '}' ) ;
    public final void rule__GSSIfaceConstSize__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4323:1: ( ( '}' ) )
            // InternalIFACE.g:4324:1: ( '}' )
            {
            // InternalIFACE.g:4324:1: ( '}' )
            // InternalIFACE.g:4325:2: '}'
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
    // InternalIFACE.g:4334:1: rule__GSSIfaceConstSize__Group__11 : rule__GSSIfaceConstSize__Group__11__Impl ;
    public final void rule__GSSIfaceConstSize__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4338:1: ( rule__GSSIfaceConstSize__Group__11__Impl )
            // InternalIFACE.g:4339:2: rule__GSSIfaceConstSize__Group__11__Impl
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
    // InternalIFACE.g:4345:1: rule__GSSIfaceConstSize__Group__11__Impl : ( ';' ) ;
    public final void rule__GSSIfaceConstSize__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4349:1: ( ( ';' ) )
            // InternalIFACE.g:4350:1: ( ';' )
            {
            // InternalIFACE.g:4350:1: ( ';' )
            // InternalIFACE.g:4351:2: ';'
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
    // InternalIFACE.g:4361:1: rule__GSSIfaceSizeFieldOffset__Group__0 : rule__GSSIfaceSizeFieldOffset__Group__0__Impl rule__GSSIfaceSizeFieldOffset__Group__1 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4365:1: ( rule__GSSIfaceSizeFieldOffset__Group__0__Impl rule__GSSIfaceSizeFieldOffset__Group__1 )
            // InternalIFACE.g:4366:2: rule__GSSIfaceSizeFieldOffset__Group__0__Impl rule__GSSIfaceSizeFieldOffset__Group__1
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
    // InternalIFACE.g:4373:1: rule__GSSIfaceSizeFieldOffset__Group__0__Impl : ( 'sizeFieldOffset' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4377:1: ( ( 'sizeFieldOffset' ) )
            // InternalIFACE.g:4378:1: ( 'sizeFieldOffset' )
            {
            // InternalIFACE.g:4378:1: ( 'sizeFieldOffset' )
            // InternalIFACE.g:4379:2: 'sizeFieldOffset'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSizeFieldOffsetKeyword_0()); 
            }
            match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4388:1: rule__GSSIfaceSizeFieldOffset__Group__1 : rule__GSSIfaceSizeFieldOffset__Group__1__Impl rule__GSSIfaceSizeFieldOffset__Group__2 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4392:1: ( rule__GSSIfaceSizeFieldOffset__Group__1__Impl rule__GSSIfaceSizeFieldOffset__Group__2 )
            // InternalIFACE.g:4393:2: rule__GSSIfaceSizeFieldOffset__Group__1__Impl rule__GSSIfaceSizeFieldOffset__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_44);
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
    // InternalIFACE.g:4400:1: rule__GSSIfaceSizeFieldOffset__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4404:1: ( ( '{' ) )
            // InternalIFACE.g:4405:1: ( '{' )
            {
            // InternalIFACE.g:4405:1: ( '{' )
            // InternalIFACE.g:4406:2: '{'
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
    // InternalIFACE.g:4415:1: rule__GSSIfaceSizeFieldOffset__Group__2 : rule__GSSIfaceSizeFieldOffset__Group__2__Impl rule__GSSIfaceSizeFieldOffset__Group__3 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4419:1: ( rule__GSSIfaceSizeFieldOffset__Group__2__Impl rule__GSSIfaceSizeFieldOffset__Group__3 )
            // InternalIFACE.g:4420:2: rule__GSSIfaceSizeFieldOffset__Group__2__Impl rule__GSSIfaceSizeFieldOffset__Group__3
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
    // InternalIFACE.g:4427:1: rule__GSSIfaceSizeFieldOffset__Group__2__Impl : ( 'bytes' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4431:1: ( ( 'bytes' ) )
            // InternalIFACE.g:4432:1: ( 'bytes' )
            {
            // InternalIFACE.g:4432:1: ( 'bytes' )
            // InternalIFACE.g:4433:2: 'bytes'
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
    // InternalIFACE.g:4442:1: rule__GSSIfaceSizeFieldOffset__Group__3 : rule__GSSIfaceSizeFieldOffset__Group__3__Impl rule__GSSIfaceSizeFieldOffset__Group__4 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4446:1: ( rule__GSSIfaceSizeFieldOffset__Group__3__Impl rule__GSSIfaceSizeFieldOffset__Group__4 )
            // InternalIFACE.g:4447:2: rule__GSSIfaceSizeFieldOffset__Group__3__Impl rule__GSSIfaceSizeFieldOffset__Group__4
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
    // InternalIFACE.g:4454:1: rule__GSSIfaceSizeFieldOffset__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4458:1: ( ( ':=' ) )
            // InternalIFACE.g:4459:1: ( ':=' )
            {
            // InternalIFACE.g:4459:1: ( ':=' )
            // InternalIFACE.g:4460:2: ':='
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
    // InternalIFACE.g:4469:1: rule__GSSIfaceSizeFieldOffset__Group__4 : rule__GSSIfaceSizeFieldOffset__Group__4__Impl rule__GSSIfaceSizeFieldOffset__Group__5 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4473:1: ( rule__GSSIfaceSizeFieldOffset__Group__4__Impl rule__GSSIfaceSizeFieldOffset__Group__5 )
            // InternalIFACE.g:4474:2: rule__GSSIfaceSizeFieldOffset__Group__4__Impl rule__GSSIfaceSizeFieldOffset__Group__5
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
    // InternalIFACE.g:4481:1: rule__GSSIfaceSizeFieldOffset__Group__4__Impl : ( ( rule__GSSIfaceSizeFieldOffset__BytesAssignment_4 ) ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4485:1: ( ( ( rule__GSSIfaceSizeFieldOffset__BytesAssignment_4 ) ) )
            // InternalIFACE.g:4486:1: ( ( rule__GSSIfaceSizeFieldOffset__BytesAssignment_4 ) )
            {
            // InternalIFACE.g:4486:1: ( ( rule__GSSIfaceSizeFieldOffset__BytesAssignment_4 ) )
            // InternalIFACE.g:4487:2: ( rule__GSSIfaceSizeFieldOffset__BytesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesAssignment_4()); 
            }
            // InternalIFACE.g:4488:2: ( rule__GSSIfaceSizeFieldOffset__BytesAssignment_4 )
            // InternalIFACE.g:4488:3: rule__GSSIfaceSizeFieldOffset__BytesAssignment_4
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
    // InternalIFACE.g:4496:1: rule__GSSIfaceSizeFieldOffset__Group__5 : rule__GSSIfaceSizeFieldOffset__Group__5__Impl rule__GSSIfaceSizeFieldOffset__Group__6 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4500:1: ( rule__GSSIfaceSizeFieldOffset__Group__5__Impl rule__GSSIfaceSizeFieldOffset__Group__6 )
            // InternalIFACE.g:4501:2: rule__GSSIfaceSizeFieldOffset__Group__5__Impl rule__GSSIfaceSizeFieldOffset__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_45);
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
    // InternalIFACE.g:4508:1: rule__GSSIfaceSizeFieldOffset__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4512:1: ( ( ';' ) )
            // InternalIFACE.g:4513:1: ( ';' )
            {
            // InternalIFACE.g:4513:1: ( ';' )
            // InternalIFACE.g:4514:2: ';'
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
    // InternalIFACE.g:4523:1: rule__GSSIfaceSizeFieldOffset__Group__6 : rule__GSSIfaceSizeFieldOffset__Group__6__Impl rule__GSSIfaceSizeFieldOffset__Group__7 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4527:1: ( rule__GSSIfaceSizeFieldOffset__Group__6__Impl rule__GSSIfaceSizeFieldOffset__Group__7 )
            // InternalIFACE.g:4528:2: rule__GSSIfaceSizeFieldOffset__Group__6__Impl rule__GSSIfaceSizeFieldOffset__Group__7
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
    // InternalIFACE.g:4535:1: rule__GSSIfaceSizeFieldOffset__Group__6__Impl : ( 'bits' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4539:1: ( ( 'bits' ) )
            // InternalIFACE.g:4540:1: ( 'bits' )
            {
            // InternalIFACE.g:4540:1: ( 'bits' )
            // InternalIFACE.g:4541:2: 'bits'
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
    // InternalIFACE.g:4550:1: rule__GSSIfaceSizeFieldOffset__Group__7 : rule__GSSIfaceSizeFieldOffset__Group__7__Impl rule__GSSIfaceSizeFieldOffset__Group__8 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4554:1: ( rule__GSSIfaceSizeFieldOffset__Group__7__Impl rule__GSSIfaceSizeFieldOffset__Group__8 )
            // InternalIFACE.g:4555:2: rule__GSSIfaceSizeFieldOffset__Group__7__Impl rule__GSSIfaceSizeFieldOffset__Group__8
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
    // InternalIFACE.g:4562:1: rule__GSSIfaceSizeFieldOffset__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4566:1: ( ( ':=' ) )
            // InternalIFACE.g:4567:1: ( ':=' )
            {
            // InternalIFACE.g:4567:1: ( ':=' )
            // InternalIFACE.g:4568:2: ':='
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
    // InternalIFACE.g:4577:1: rule__GSSIfaceSizeFieldOffset__Group__8 : rule__GSSIfaceSizeFieldOffset__Group__8__Impl rule__GSSIfaceSizeFieldOffset__Group__9 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4581:1: ( rule__GSSIfaceSizeFieldOffset__Group__8__Impl rule__GSSIfaceSizeFieldOffset__Group__9 )
            // InternalIFACE.g:4582:2: rule__GSSIfaceSizeFieldOffset__Group__8__Impl rule__GSSIfaceSizeFieldOffset__Group__9
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
    // InternalIFACE.g:4589:1: rule__GSSIfaceSizeFieldOffset__Group__8__Impl : ( ( rule__GSSIfaceSizeFieldOffset__BitsAssignment_8 ) ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4593:1: ( ( ( rule__GSSIfaceSizeFieldOffset__BitsAssignment_8 ) ) )
            // InternalIFACE.g:4594:1: ( ( rule__GSSIfaceSizeFieldOffset__BitsAssignment_8 ) )
            {
            // InternalIFACE.g:4594:1: ( ( rule__GSSIfaceSizeFieldOffset__BitsAssignment_8 ) )
            // InternalIFACE.g:4595:2: ( rule__GSSIfaceSizeFieldOffset__BitsAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsAssignment_8()); 
            }
            // InternalIFACE.g:4596:2: ( rule__GSSIfaceSizeFieldOffset__BitsAssignment_8 )
            // InternalIFACE.g:4596:3: rule__GSSIfaceSizeFieldOffset__BitsAssignment_8
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
    // InternalIFACE.g:4604:1: rule__GSSIfaceSizeFieldOffset__Group__9 : rule__GSSIfaceSizeFieldOffset__Group__9__Impl rule__GSSIfaceSizeFieldOffset__Group__10 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4608:1: ( rule__GSSIfaceSizeFieldOffset__Group__9__Impl rule__GSSIfaceSizeFieldOffset__Group__10 )
            // InternalIFACE.g:4609:2: rule__GSSIfaceSizeFieldOffset__Group__9__Impl rule__GSSIfaceSizeFieldOffset__Group__10
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
    // InternalIFACE.g:4616:1: rule__GSSIfaceSizeFieldOffset__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4620:1: ( ( ';' ) )
            // InternalIFACE.g:4621:1: ( ';' )
            {
            // InternalIFACE.g:4621:1: ( ';' )
            // InternalIFACE.g:4622:2: ';'
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
    // InternalIFACE.g:4631:1: rule__GSSIfaceSizeFieldOffset__Group__10 : rule__GSSIfaceSizeFieldOffset__Group__10__Impl rule__GSSIfaceSizeFieldOffset__Group__11 ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4635:1: ( rule__GSSIfaceSizeFieldOffset__Group__10__Impl rule__GSSIfaceSizeFieldOffset__Group__11 )
            // InternalIFACE.g:4636:2: rule__GSSIfaceSizeFieldOffset__Group__10__Impl rule__GSSIfaceSizeFieldOffset__Group__11
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
    // InternalIFACE.g:4643:1: rule__GSSIfaceSizeFieldOffset__Group__10__Impl : ( '}' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4647:1: ( ( '}' ) )
            // InternalIFACE.g:4648:1: ( '}' )
            {
            // InternalIFACE.g:4648:1: ( '}' )
            // InternalIFACE.g:4649:2: '}'
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
    // InternalIFACE.g:4658:1: rule__GSSIfaceSizeFieldOffset__Group__11 : rule__GSSIfaceSizeFieldOffset__Group__11__Impl ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4662:1: ( rule__GSSIfaceSizeFieldOffset__Group__11__Impl )
            // InternalIFACE.g:4663:2: rule__GSSIfaceSizeFieldOffset__Group__11__Impl
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
    // InternalIFACE.g:4669:1: rule__GSSIfaceSizeFieldOffset__Group__11__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSizeFieldOffset__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4673:1: ( ( ';' ) )
            // InternalIFACE.g:4674:1: ( ';' )
            {
            // InternalIFACE.g:4674:1: ( ';' )
            // InternalIFACE.g:4675:2: ';'
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
    // InternalIFACE.g:4685:1: rule__GSSIfaceSizeFieldTrim__Group__0 : rule__GSSIfaceSizeFieldTrim__Group__0__Impl rule__GSSIfaceSizeFieldTrim__Group__1 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4689:1: ( rule__GSSIfaceSizeFieldTrim__Group__0__Impl rule__GSSIfaceSizeFieldTrim__Group__1 )
            // InternalIFACE.g:4690:2: rule__GSSIfaceSizeFieldTrim__Group__0__Impl rule__GSSIfaceSizeFieldTrim__Group__1
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
    // InternalIFACE.g:4697:1: rule__GSSIfaceSizeFieldTrim__Group__0__Impl : ( 'sizeFieldTrim' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4701:1: ( ( 'sizeFieldTrim' ) )
            // InternalIFACE.g:4702:1: ( 'sizeFieldTrim' )
            {
            // InternalIFACE.g:4702:1: ( 'sizeFieldTrim' )
            // InternalIFACE.g:4703:2: 'sizeFieldTrim'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSizeFieldTrimKeyword_0()); 
            }
            match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:4712:1: rule__GSSIfaceSizeFieldTrim__Group__1 : rule__GSSIfaceSizeFieldTrim__Group__1__Impl rule__GSSIfaceSizeFieldTrim__Group__2 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4716:1: ( rule__GSSIfaceSizeFieldTrim__Group__1__Impl rule__GSSIfaceSizeFieldTrim__Group__2 )
            // InternalIFACE.g:4717:2: rule__GSSIfaceSizeFieldTrim__Group__1__Impl rule__GSSIfaceSizeFieldTrim__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_44);
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
    // InternalIFACE.g:4724:1: rule__GSSIfaceSizeFieldTrim__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4728:1: ( ( '{' ) )
            // InternalIFACE.g:4729:1: ( '{' )
            {
            // InternalIFACE.g:4729:1: ( '{' )
            // InternalIFACE.g:4730:2: '{'
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
    // InternalIFACE.g:4739:1: rule__GSSIfaceSizeFieldTrim__Group__2 : rule__GSSIfaceSizeFieldTrim__Group__2__Impl rule__GSSIfaceSizeFieldTrim__Group__3 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4743:1: ( rule__GSSIfaceSizeFieldTrim__Group__2__Impl rule__GSSIfaceSizeFieldTrim__Group__3 )
            // InternalIFACE.g:4744:2: rule__GSSIfaceSizeFieldTrim__Group__2__Impl rule__GSSIfaceSizeFieldTrim__Group__3
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
    // InternalIFACE.g:4751:1: rule__GSSIfaceSizeFieldTrim__Group__2__Impl : ( 'bytes' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4755:1: ( ( 'bytes' ) )
            // InternalIFACE.g:4756:1: ( 'bytes' )
            {
            // InternalIFACE.g:4756:1: ( 'bytes' )
            // InternalIFACE.g:4757:2: 'bytes'
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
    // InternalIFACE.g:4766:1: rule__GSSIfaceSizeFieldTrim__Group__3 : rule__GSSIfaceSizeFieldTrim__Group__3__Impl rule__GSSIfaceSizeFieldTrim__Group__4 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4770:1: ( rule__GSSIfaceSizeFieldTrim__Group__3__Impl rule__GSSIfaceSizeFieldTrim__Group__4 )
            // InternalIFACE.g:4771:2: rule__GSSIfaceSizeFieldTrim__Group__3__Impl rule__GSSIfaceSizeFieldTrim__Group__4
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
    // InternalIFACE.g:4778:1: rule__GSSIfaceSizeFieldTrim__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4782:1: ( ( ':=' ) )
            // InternalIFACE.g:4783:1: ( ':=' )
            {
            // InternalIFACE.g:4783:1: ( ':=' )
            // InternalIFACE.g:4784:2: ':='
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
    // InternalIFACE.g:4793:1: rule__GSSIfaceSizeFieldTrim__Group__4 : rule__GSSIfaceSizeFieldTrim__Group__4__Impl rule__GSSIfaceSizeFieldTrim__Group__5 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4797:1: ( rule__GSSIfaceSizeFieldTrim__Group__4__Impl rule__GSSIfaceSizeFieldTrim__Group__5 )
            // InternalIFACE.g:4798:2: rule__GSSIfaceSizeFieldTrim__Group__4__Impl rule__GSSIfaceSizeFieldTrim__Group__5
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
    // InternalIFACE.g:4805:1: rule__GSSIfaceSizeFieldTrim__Group__4__Impl : ( ( rule__GSSIfaceSizeFieldTrim__BytesAssignment_4 ) ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4809:1: ( ( ( rule__GSSIfaceSizeFieldTrim__BytesAssignment_4 ) ) )
            // InternalIFACE.g:4810:1: ( ( rule__GSSIfaceSizeFieldTrim__BytesAssignment_4 ) )
            {
            // InternalIFACE.g:4810:1: ( ( rule__GSSIfaceSizeFieldTrim__BytesAssignment_4 ) )
            // InternalIFACE.g:4811:2: ( rule__GSSIfaceSizeFieldTrim__BytesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesAssignment_4()); 
            }
            // InternalIFACE.g:4812:2: ( rule__GSSIfaceSizeFieldTrim__BytesAssignment_4 )
            // InternalIFACE.g:4812:3: rule__GSSIfaceSizeFieldTrim__BytesAssignment_4
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
    // InternalIFACE.g:4820:1: rule__GSSIfaceSizeFieldTrim__Group__5 : rule__GSSIfaceSizeFieldTrim__Group__5__Impl rule__GSSIfaceSizeFieldTrim__Group__6 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4824:1: ( rule__GSSIfaceSizeFieldTrim__Group__5__Impl rule__GSSIfaceSizeFieldTrim__Group__6 )
            // InternalIFACE.g:4825:2: rule__GSSIfaceSizeFieldTrim__Group__5__Impl rule__GSSIfaceSizeFieldTrim__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_45);
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
    // InternalIFACE.g:4832:1: rule__GSSIfaceSizeFieldTrim__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4836:1: ( ( ';' ) )
            // InternalIFACE.g:4837:1: ( ';' )
            {
            // InternalIFACE.g:4837:1: ( ';' )
            // InternalIFACE.g:4838:2: ';'
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
    // InternalIFACE.g:4847:1: rule__GSSIfaceSizeFieldTrim__Group__6 : rule__GSSIfaceSizeFieldTrim__Group__6__Impl rule__GSSIfaceSizeFieldTrim__Group__7 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4851:1: ( rule__GSSIfaceSizeFieldTrim__Group__6__Impl rule__GSSIfaceSizeFieldTrim__Group__7 )
            // InternalIFACE.g:4852:2: rule__GSSIfaceSizeFieldTrim__Group__6__Impl rule__GSSIfaceSizeFieldTrim__Group__7
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
    // InternalIFACE.g:4859:1: rule__GSSIfaceSizeFieldTrim__Group__6__Impl : ( 'bits' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4863:1: ( ( 'bits' ) )
            // InternalIFACE.g:4864:1: ( 'bits' )
            {
            // InternalIFACE.g:4864:1: ( 'bits' )
            // InternalIFACE.g:4865:2: 'bits'
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
    // InternalIFACE.g:4874:1: rule__GSSIfaceSizeFieldTrim__Group__7 : rule__GSSIfaceSizeFieldTrim__Group__7__Impl rule__GSSIfaceSizeFieldTrim__Group__8 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4878:1: ( rule__GSSIfaceSizeFieldTrim__Group__7__Impl rule__GSSIfaceSizeFieldTrim__Group__8 )
            // InternalIFACE.g:4879:2: rule__GSSIfaceSizeFieldTrim__Group__7__Impl rule__GSSIfaceSizeFieldTrim__Group__8
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
    // InternalIFACE.g:4886:1: rule__GSSIfaceSizeFieldTrim__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4890:1: ( ( ':=' ) )
            // InternalIFACE.g:4891:1: ( ':=' )
            {
            // InternalIFACE.g:4891:1: ( ':=' )
            // InternalIFACE.g:4892:2: ':='
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
    // InternalIFACE.g:4901:1: rule__GSSIfaceSizeFieldTrim__Group__8 : rule__GSSIfaceSizeFieldTrim__Group__8__Impl rule__GSSIfaceSizeFieldTrim__Group__9 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4905:1: ( rule__GSSIfaceSizeFieldTrim__Group__8__Impl rule__GSSIfaceSizeFieldTrim__Group__9 )
            // InternalIFACE.g:4906:2: rule__GSSIfaceSizeFieldTrim__Group__8__Impl rule__GSSIfaceSizeFieldTrim__Group__9
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
    // InternalIFACE.g:4913:1: rule__GSSIfaceSizeFieldTrim__Group__8__Impl : ( ( rule__GSSIfaceSizeFieldTrim__BitsAssignment_8 ) ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4917:1: ( ( ( rule__GSSIfaceSizeFieldTrim__BitsAssignment_8 ) ) )
            // InternalIFACE.g:4918:1: ( ( rule__GSSIfaceSizeFieldTrim__BitsAssignment_8 ) )
            {
            // InternalIFACE.g:4918:1: ( ( rule__GSSIfaceSizeFieldTrim__BitsAssignment_8 ) )
            // InternalIFACE.g:4919:2: ( rule__GSSIfaceSizeFieldTrim__BitsAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsAssignment_8()); 
            }
            // InternalIFACE.g:4920:2: ( rule__GSSIfaceSizeFieldTrim__BitsAssignment_8 )
            // InternalIFACE.g:4920:3: rule__GSSIfaceSizeFieldTrim__BitsAssignment_8
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
    // InternalIFACE.g:4928:1: rule__GSSIfaceSizeFieldTrim__Group__9 : rule__GSSIfaceSizeFieldTrim__Group__9__Impl rule__GSSIfaceSizeFieldTrim__Group__10 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4932:1: ( rule__GSSIfaceSizeFieldTrim__Group__9__Impl rule__GSSIfaceSizeFieldTrim__Group__10 )
            // InternalIFACE.g:4933:2: rule__GSSIfaceSizeFieldTrim__Group__9__Impl rule__GSSIfaceSizeFieldTrim__Group__10
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
    // InternalIFACE.g:4940:1: rule__GSSIfaceSizeFieldTrim__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4944:1: ( ( ';' ) )
            // InternalIFACE.g:4945:1: ( ';' )
            {
            // InternalIFACE.g:4945:1: ( ';' )
            // InternalIFACE.g:4946:2: ';'
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
    // InternalIFACE.g:4955:1: rule__GSSIfaceSizeFieldTrim__Group__10 : rule__GSSIfaceSizeFieldTrim__Group__10__Impl rule__GSSIfaceSizeFieldTrim__Group__11 ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4959:1: ( rule__GSSIfaceSizeFieldTrim__Group__10__Impl rule__GSSIfaceSizeFieldTrim__Group__11 )
            // InternalIFACE.g:4960:2: rule__GSSIfaceSizeFieldTrim__Group__10__Impl rule__GSSIfaceSizeFieldTrim__Group__11
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
    // InternalIFACE.g:4967:1: rule__GSSIfaceSizeFieldTrim__Group__10__Impl : ( '}' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4971:1: ( ( '}' ) )
            // InternalIFACE.g:4972:1: ( '}' )
            {
            // InternalIFACE.g:4972:1: ( '}' )
            // InternalIFACE.g:4973:2: '}'
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
    // InternalIFACE.g:4982:1: rule__GSSIfaceSizeFieldTrim__Group__11 : rule__GSSIfaceSizeFieldTrim__Group__11__Impl ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4986:1: ( rule__GSSIfaceSizeFieldTrim__Group__11__Impl )
            // InternalIFACE.g:4987:2: rule__GSSIfaceSizeFieldTrim__Group__11__Impl
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
    // InternalIFACE.g:4993:1: rule__GSSIfaceSizeFieldTrim__Group__11__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSizeFieldTrim__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:4997:1: ( ( ';' ) )
            // InternalIFACE.g:4998:1: ( ';' )
            {
            // InternalIFACE.g:4998:1: ( ';' )
            // InternalIFACE.g:4999:2: ';'
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
    // InternalIFACE.g:5009:1: rule__GSSIfaceSyncPattern__Group__0 : rule__GSSIfaceSyncPattern__Group__0__Impl rule__GSSIfaceSyncPattern__Group__1 ;
    public final void rule__GSSIfaceSyncPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5013:1: ( rule__GSSIfaceSyncPattern__Group__0__Impl rule__GSSIfaceSyncPattern__Group__1 )
            // InternalIFACE.g:5014:2: rule__GSSIfaceSyncPattern__Group__0__Impl rule__GSSIfaceSyncPattern__Group__1
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
    // InternalIFACE.g:5021:1: rule__GSSIfaceSyncPattern__Group__0__Impl : ( 'syncPattern' ) ;
    public final void rule__GSSIfaceSyncPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5025:1: ( ( 'syncPattern' ) )
            // InternalIFACE.g:5026:1: ( 'syncPattern' )
            {
            // InternalIFACE.g:5026:1: ( 'syncPattern' )
            // InternalIFACE.g:5027:2: 'syncPattern'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getSyncPatternKeyword_0()); 
            }
            match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:5036:1: rule__GSSIfaceSyncPattern__Group__1 : rule__GSSIfaceSyncPattern__Group__1__Impl rule__GSSIfaceSyncPattern__Group__2 ;
    public final void rule__GSSIfaceSyncPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5040:1: ( rule__GSSIfaceSyncPattern__Group__1__Impl rule__GSSIfaceSyncPattern__Group__2 )
            // InternalIFACE.g:5041:2: rule__GSSIfaceSyncPattern__Group__1__Impl rule__GSSIfaceSyncPattern__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_46);
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
    // InternalIFACE.g:5048:1: rule__GSSIfaceSyncPattern__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceSyncPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5052:1: ( ( '{' ) )
            // InternalIFACE.g:5053:1: ( '{' )
            {
            // InternalIFACE.g:5053:1: ( '{' )
            // InternalIFACE.g:5054:2: '{'
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
    // InternalIFACE.g:5063:1: rule__GSSIfaceSyncPattern__Group__2 : rule__GSSIfaceSyncPattern__Group__2__Impl rule__GSSIfaceSyncPattern__Group__3 ;
    public final void rule__GSSIfaceSyncPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5067:1: ( rule__GSSIfaceSyncPattern__Group__2__Impl rule__GSSIfaceSyncPattern__Group__3 )
            // InternalIFACE.g:5068:2: rule__GSSIfaceSyncPattern__Group__2__Impl rule__GSSIfaceSyncPattern__Group__3
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
    // InternalIFACE.g:5075:1: rule__GSSIfaceSyncPattern__Group__2__Impl : ( 'hexValue' ) ;
    public final void rule__GSSIfaceSyncPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5079:1: ( ( 'hexValue' ) )
            // InternalIFACE.g:5080:1: ( 'hexValue' )
            {
            // InternalIFACE.g:5080:1: ( 'hexValue' )
            // InternalIFACE.g:5081:2: 'hexValue'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueKeyword_2()); 
            }
            match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:5090:1: rule__GSSIfaceSyncPattern__Group__3 : rule__GSSIfaceSyncPattern__Group__3__Impl rule__GSSIfaceSyncPattern__Group__4 ;
    public final void rule__GSSIfaceSyncPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5094:1: ( rule__GSSIfaceSyncPattern__Group__3__Impl rule__GSSIfaceSyncPattern__Group__4 )
            // InternalIFACE.g:5095:2: rule__GSSIfaceSyncPattern__Group__3__Impl rule__GSSIfaceSyncPattern__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_47);
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
    // InternalIFACE.g:5102:1: rule__GSSIfaceSyncPattern__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSyncPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5106:1: ( ( ':=' ) )
            // InternalIFACE.g:5107:1: ( ':=' )
            {
            // InternalIFACE.g:5107:1: ( ':=' )
            // InternalIFACE.g:5108:2: ':='
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
    // InternalIFACE.g:5117:1: rule__GSSIfaceSyncPattern__Group__4 : rule__GSSIfaceSyncPattern__Group__4__Impl rule__GSSIfaceSyncPattern__Group__5 ;
    public final void rule__GSSIfaceSyncPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5121:1: ( rule__GSSIfaceSyncPattern__Group__4__Impl rule__GSSIfaceSyncPattern__Group__5 )
            // InternalIFACE.g:5122:2: rule__GSSIfaceSyncPattern__Group__4__Impl rule__GSSIfaceSyncPattern__Group__5
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
    // InternalIFACE.g:5129:1: rule__GSSIfaceSyncPattern__Group__4__Impl : ( ( rule__GSSIfaceSyncPattern__HexValueAssignment_4 ) ) ;
    public final void rule__GSSIfaceSyncPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5133:1: ( ( ( rule__GSSIfaceSyncPattern__HexValueAssignment_4 ) ) )
            // InternalIFACE.g:5134:1: ( ( rule__GSSIfaceSyncPattern__HexValueAssignment_4 ) )
            {
            // InternalIFACE.g:5134:1: ( ( rule__GSSIfaceSyncPattern__HexValueAssignment_4 ) )
            // InternalIFACE.g:5135:2: ( rule__GSSIfaceSyncPattern__HexValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueAssignment_4()); 
            }
            // InternalIFACE.g:5136:2: ( rule__GSSIfaceSyncPattern__HexValueAssignment_4 )
            // InternalIFACE.g:5136:3: rule__GSSIfaceSyncPattern__HexValueAssignment_4
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
    // InternalIFACE.g:5144:1: rule__GSSIfaceSyncPattern__Group__5 : rule__GSSIfaceSyncPattern__Group__5__Impl rule__GSSIfaceSyncPattern__Group__6 ;
    public final void rule__GSSIfaceSyncPattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5148:1: ( rule__GSSIfaceSyncPattern__Group__5__Impl rule__GSSIfaceSyncPattern__Group__6 )
            // InternalIFACE.g:5149:2: rule__GSSIfaceSyncPattern__Group__5__Impl rule__GSSIfaceSyncPattern__Group__6
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
    // InternalIFACE.g:5156:1: rule__GSSIfaceSyncPattern__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSyncPattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5160:1: ( ( ';' ) )
            // InternalIFACE.g:5161:1: ( ';' )
            {
            // InternalIFACE.g:5161:1: ( ';' )
            // InternalIFACE.g:5162:2: ';'
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
    // InternalIFACE.g:5171:1: rule__GSSIfaceSyncPattern__Group__6 : rule__GSSIfaceSyncPattern__Group__6__Impl rule__GSSIfaceSyncPattern__Group__7 ;
    public final void rule__GSSIfaceSyncPattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5175:1: ( rule__GSSIfaceSyncPattern__Group__6__Impl rule__GSSIfaceSyncPattern__Group__7 )
            // InternalIFACE.g:5176:2: rule__GSSIfaceSyncPattern__Group__6__Impl rule__GSSIfaceSyncPattern__Group__7
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
    // InternalIFACE.g:5183:1: rule__GSSIfaceSyncPattern__Group__6__Impl : ( '}' ) ;
    public final void rule__GSSIfaceSyncPattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5187:1: ( ( '}' ) )
            // InternalIFACE.g:5188:1: ( '}' )
            {
            // InternalIFACE.g:5188:1: ( '}' )
            // InternalIFACE.g:5189:2: '}'
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
    // InternalIFACE.g:5198:1: rule__GSSIfaceSyncPattern__Group__7 : rule__GSSIfaceSyncPattern__Group__7__Impl ;
    public final void rule__GSSIfaceSyncPattern__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5202:1: ( rule__GSSIfaceSyncPattern__Group__7__Impl )
            // InternalIFACE.g:5203:2: rule__GSSIfaceSyncPattern__Group__7__Impl
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
    // InternalIFACE.g:5209:1: rule__GSSIfaceSyncPattern__Group__7__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSyncPattern__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5213:1: ( ( ';' ) )
            // InternalIFACE.g:5214:1: ( ';' )
            {
            // InternalIFACE.g:5214:1: ( ';' )
            // InternalIFACE.g:5215:2: ';'
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
    // InternalIFACE.g:5225:1: rule__GSSIfaceSpWTCPort__Group__0 : rule__GSSIfaceSpWTCPort__Group__0__Impl rule__GSSIfaceSpWTCPort__Group__1 ;
    public final void rule__GSSIfaceSpWTCPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5229:1: ( rule__GSSIfaceSpWTCPort__Group__0__Impl rule__GSSIfaceSpWTCPort__Group__1 )
            // InternalIFACE.g:5230:2: rule__GSSIfaceSpWTCPort__Group__0__Impl rule__GSSIfaceSpWTCPort__Group__1
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
    // InternalIFACE.g:5237:1: rule__GSSIfaceSpWTCPort__Group__0__Impl : ( 'spwTCPort' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5241:1: ( ( 'spwTCPort' ) )
            // InternalIFACE.g:5242:1: ( 'spwTCPort' )
            {
            // InternalIFACE.g:5242:1: ( 'spwTCPort' )
            // InternalIFACE.g:5243:2: 'spwTCPort'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwTCPortKeyword_0()); 
            }
            match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:5252:1: rule__GSSIfaceSpWTCPort__Group__1 : rule__GSSIfaceSpWTCPort__Group__1__Impl rule__GSSIfaceSpWTCPort__Group__2 ;
    public final void rule__GSSIfaceSpWTCPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5256:1: ( rule__GSSIfaceSpWTCPort__Group__1__Impl rule__GSSIfaceSpWTCPort__Group__2 )
            // InternalIFACE.g:5257:2: rule__GSSIfaceSpWTCPort__Group__1__Impl rule__GSSIfaceSpWTCPort__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_48);
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
    // InternalIFACE.g:5264:1: rule__GSSIfaceSpWTCPort__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5268:1: ( ( '{' ) )
            // InternalIFACE.g:5269:1: ( '{' )
            {
            // InternalIFACE.g:5269:1: ( '{' )
            // InternalIFACE.g:5270:2: '{'
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
    // InternalIFACE.g:5279:1: rule__GSSIfaceSpWTCPort__Group__2 : rule__GSSIfaceSpWTCPort__Group__2__Impl rule__GSSIfaceSpWTCPort__Group__3 ;
    public final void rule__GSSIfaceSpWTCPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5283:1: ( rule__GSSIfaceSpWTCPort__Group__2__Impl rule__GSSIfaceSpWTCPort__Group__3 )
            // InternalIFACE.g:5284:2: rule__GSSIfaceSpWTCPort__Group__2__Impl rule__GSSIfaceSpWTCPort__Group__3
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
    // InternalIFACE.g:5291:1: rule__GSSIfaceSpWTCPort__Group__2__Impl : ( 'spwPortRef' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5295:1: ( ( 'spwPortRef' ) )
            // InternalIFACE.g:5296:1: ( 'spwPortRef' )
            {
            // InternalIFACE.g:5296:1: ( 'spwPortRef' )
            // InternalIFACE.g:5297:2: 'spwPortRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefKeyword_2()); 
            }
            match(input,68,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:5306:1: rule__GSSIfaceSpWTCPort__Group__3 : rule__GSSIfaceSpWTCPort__Group__3__Impl rule__GSSIfaceSpWTCPort__Group__4 ;
    public final void rule__GSSIfaceSpWTCPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5310:1: ( rule__GSSIfaceSpWTCPort__Group__3__Impl rule__GSSIfaceSpWTCPort__Group__4 )
            // InternalIFACE.g:5311:2: rule__GSSIfaceSpWTCPort__Group__3__Impl rule__GSSIfaceSpWTCPort__Group__4
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
    // InternalIFACE.g:5318:1: rule__GSSIfaceSpWTCPort__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5322:1: ( ( ':=' ) )
            // InternalIFACE.g:5323:1: ( ':=' )
            {
            // InternalIFACE.g:5323:1: ( ':=' )
            // InternalIFACE.g:5324:2: ':='
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
    // InternalIFACE.g:5333:1: rule__GSSIfaceSpWTCPort__Group__4 : rule__GSSIfaceSpWTCPort__Group__4__Impl rule__GSSIfaceSpWTCPort__Group__5 ;
    public final void rule__GSSIfaceSpWTCPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5337:1: ( rule__GSSIfaceSpWTCPort__Group__4__Impl rule__GSSIfaceSpWTCPort__Group__5 )
            // InternalIFACE.g:5338:2: rule__GSSIfaceSpWTCPort__Group__4__Impl rule__GSSIfaceSpWTCPort__Group__5
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
    // InternalIFACE.g:5345:1: rule__GSSIfaceSpWTCPort__Group__4__Impl : ( ( rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4 ) ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5349:1: ( ( ( rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4 ) ) )
            // InternalIFACE.g:5350:1: ( ( rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4 ) )
            {
            // InternalIFACE.g:5350:1: ( ( rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4 ) )
            // InternalIFACE.g:5351:2: ( rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefAssignment_4()); 
            }
            // InternalIFACE.g:5352:2: ( rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4 )
            // InternalIFACE.g:5352:3: rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4
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
    // InternalIFACE.g:5360:1: rule__GSSIfaceSpWTCPort__Group__5 : rule__GSSIfaceSpWTCPort__Group__5__Impl rule__GSSIfaceSpWTCPort__Group__6 ;
    public final void rule__GSSIfaceSpWTCPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5364:1: ( rule__GSSIfaceSpWTCPort__Group__5__Impl rule__GSSIfaceSpWTCPort__Group__6 )
            // InternalIFACE.g:5365:2: rule__GSSIfaceSpWTCPort__Group__5__Impl rule__GSSIfaceSpWTCPort__Group__6
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
    // InternalIFACE.g:5372:1: rule__GSSIfaceSpWTCPort__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5376:1: ( ( ';' ) )
            // InternalIFACE.g:5377:1: ( ';' )
            {
            // InternalIFACE.g:5377:1: ( ';' )
            // InternalIFACE.g:5378:2: ';'
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
    // InternalIFACE.g:5387:1: rule__GSSIfaceSpWTCPort__Group__6 : rule__GSSIfaceSpWTCPort__Group__6__Impl rule__GSSIfaceSpWTCPort__Group__7 ;
    public final void rule__GSSIfaceSpWTCPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5391:1: ( rule__GSSIfaceSpWTCPort__Group__6__Impl rule__GSSIfaceSpWTCPort__Group__7 )
            // InternalIFACE.g:5392:2: rule__GSSIfaceSpWTCPort__Group__6__Impl rule__GSSIfaceSpWTCPort__Group__7
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
    // InternalIFACE.g:5399:1: rule__GSSIfaceSpWTCPort__Group__6__Impl : ( '}' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5403:1: ( ( '}' ) )
            // InternalIFACE.g:5404:1: ( '}' )
            {
            // InternalIFACE.g:5404:1: ( '}' )
            // InternalIFACE.g:5405:2: '}'
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
    // InternalIFACE.g:5414:1: rule__GSSIfaceSpWTCPort__Group__7 : rule__GSSIfaceSpWTCPort__Group__7__Impl ;
    public final void rule__GSSIfaceSpWTCPort__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5418:1: ( rule__GSSIfaceSpWTCPort__Group__7__Impl )
            // InternalIFACE.g:5419:2: rule__GSSIfaceSpWTCPort__Group__7__Impl
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
    // InternalIFACE.g:5425:1: rule__GSSIfaceSpWTCPort__Group__7__Impl : ( ';' ) ;
    public final void rule__GSSIfaceSpWTCPort__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5429:1: ( ( ';' ) )
            // InternalIFACE.g:5430:1: ( ';' )
            {
            // InternalIFACE.g:5430:1: ( ';' )
            // InternalIFACE.g:5431:2: ';'
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
    // InternalIFACE.g:5441:1: rule__GSSIfaceDummyPort__Group__0 : rule__GSSIfaceDummyPort__Group__0__Impl rule__GSSIfaceDummyPort__Group__1 ;
    public final void rule__GSSIfaceDummyPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5445:1: ( rule__GSSIfaceDummyPort__Group__0__Impl rule__GSSIfaceDummyPort__Group__1 )
            // InternalIFACE.g:5446:2: rule__GSSIfaceDummyPort__Group__0__Impl rule__GSSIfaceDummyPort__Group__1
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
    // InternalIFACE.g:5453:1: rule__GSSIfaceDummyPort__Group__0__Impl : ( () ) ;
    public final void rule__GSSIfaceDummyPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5457:1: ( ( () ) )
            // InternalIFACE.g:5458:1: ( () )
            {
            // InternalIFACE.g:5458:1: ( () )
            // InternalIFACE.g:5459:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceDummyPortAccess().getGSSIfaceDummyPortAction_0()); 
            }
            // InternalIFACE.g:5460:2: ()
            // InternalIFACE.g:5460:3: 
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
    // InternalIFACE.g:5468:1: rule__GSSIfaceDummyPort__Group__1 : rule__GSSIfaceDummyPort__Group__1__Impl rule__GSSIfaceDummyPort__Group__2 ;
    public final void rule__GSSIfaceDummyPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5472:1: ( rule__GSSIfaceDummyPort__Group__1__Impl rule__GSSIfaceDummyPort__Group__2 )
            // InternalIFACE.g:5473:2: rule__GSSIfaceDummyPort__Group__1__Impl rule__GSSIfaceDummyPort__Group__2
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
    // InternalIFACE.g:5480:1: rule__GSSIfaceDummyPort__Group__1__Impl : ( 'dummyPort' ) ;
    public final void rule__GSSIfaceDummyPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5484:1: ( ( 'dummyPort' ) )
            // InternalIFACE.g:5485:1: ( 'dummyPort' )
            {
            // InternalIFACE.g:5485:1: ( 'dummyPort' )
            // InternalIFACE.g:5486:2: 'dummyPort'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceDummyPortAccess().getDummyPortKeyword_1()); 
            }
            match(input,69,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:5495:1: rule__GSSIfaceDummyPort__Group__2 : rule__GSSIfaceDummyPort__Group__2__Impl rule__GSSIfaceDummyPort__Group__3 ;
    public final void rule__GSSIfaceDummyPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5499:1: ( rule__GSSIfaceDummyPort__Group__2__Impl rule__GSSIfaceDummyPort__Group__3 )
            // InternalIFACE.g:5500:2: rule__GSSIfaceDummyPort__Group__2__Impl rule__GSSIfaceDummyPort__Group__3
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
    // InternalIFACE.g:5507:1: rule__GSSIfaceDummyPort__Group__2__Impl : ( '{' ) ;
    public final void rule__GSSIfaceDummyPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5511:1: ( ( '{' ) )
            // InternalIFACE.g:5512:1: ( '{' )
            {
            // InternalIFACE.g:5512:1: ( '{' )
            // InternalIFACE.g:5513:2: '{'
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
    // InternalIFACE.g:5522:1: rule__GSSIfaceDummyPort__Group__3 : rule__GSSIfaceDummyPort__Group__3__Impl rule__GSSIfaceDummyPort__Group__4 ;
    public final void rule__GSSIfaceDummyPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5526:1: ( rule__GSSIfaceDummyPort__Group__3__Impl rule__GSSIfaceDummyPort__Group__4 )
            // InternalIFACE.g:5527:2: rule__GSSIfaceDummyPort__Group__3__Impl rule__GSSIfaceDummyPort__Group__4
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
    // InternalIFACE.g:5534:1: rule__GSSIfaceDummyPort__Group__3__Impl : ( '}' ) ;
    public final void rule__GSSIfaceDummyPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5538:1: ( ( '}' ) )
            // InternalIFACE.g:5539:1: ( '}' )
            {
            // InternalIFACE.g:5539:1: ( '}' )
            // InternalIFACE.g:5540:2: '}'
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
    // InternalIFACE.g:5549:1: rule__GSSIfaceDummyPort__Group__4 : rule__GSSIfaceDummyPort__Group__4__Impl ;
    public final void rule__GSSIfaceDummyPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5553:1: ( rule__GSSIfaceDummyPort__Group__4__Impl )
            // InternalIFACE.g:5554:2: rule__GSSIfaceDummyPort__Group__4__Impl
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
    // InternalIFACE.g:5560:1: rule__GSSIfaceDummyPort__Group__4__Impl : ( ';' ) ;
    public final void rule__GSSIfaceDummyPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5564:1: ( ( ';' ) )
            // InternalIFACE.g:5565:1: ( ';' )
            {
            // InternalIFACE.g:5565:1: ( ';' )
            // InternalIFACE.g:5566:2: ';'
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
    // InternalIFACE.g:5576:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5580:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalIFACE.g:5581:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_49);
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
    // InternalIFACE.g:5588:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5592:1: ( ( RULE_ID ) )
            // InternalIFACE.g:5593:1: ( RULE_ID )
            {
            // InternalIFACE.g:5593:1: ( RULE_ID )
            // InternalIFACE.g:5594:2: RULE_ID
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
    // InternalIFACE.g:5603:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5607:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalIFACE.g:5608:2: rule__QualifiedName__Group__1__Impl
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
    // InternalIFACE.g:5614:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5618:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalIFACE.g:5619:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalIFACE.g:5619:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalIFACE.g:5620:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalIFACE.g:5621:2: ( rule__QualifiedName__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==70) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalIFACE.g:5621:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_50);
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
    // InternalIFACE.g:5630:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5634:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalIFACE.g:5635:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalIFACE.g:5642:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5646:1: ( ( '.' ) )
            // InternalIFACE.g:5647:1: ( '.' )
            {
            // InternalIFACE.g:5647:1: ( '.' )
            // InternalIFACE.g:5648:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,70,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:5657:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5661:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalIFACE.g:5662:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalIFACE.g:5668:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5672:1: ( ( RULE_ID ) )
            // InternalIFACE.g:5673:1: ( RULE_ID )
            {
            // InternalIFACE.g:5673:1: ( RULE_ID )
            // InternalIFACE.g:5674:2: RULE_ID
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
    // InternalIFACE.g:5684:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5688:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalIFACE.g:5689:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_49);
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
    // InternalIFACE.g:5696:1: rule__Version__Group__0__Impl : ( ( rule__Version__Alternatives_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5700:1: ( ( ( rule__Version__Alternatives_0 ) ) )
            // InternalIFACE.g:5701:1: ( ( rule__Version__Alternatives_0 ) )
            {
            // InternalIFACE.g:5701:1: ( ( rule__Version__Alternatives_0 ) )
            // InternalIFACE.g:5702:2: ( rule__Version__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_0()); 
            }
            // InternalIFACE.g:5703:2: ( rule__Version__Alternatives_0 )
            // InternalIFACE.g:5703:3: rule__Version__Alternatives_0
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
    // InternalIFACE.g:5711:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5715:1: ( rule__Version__Group__1__Impl )
            // InternalIFACE.g:5716:2: rule__Version__Group__1__Impl
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
    // InternalIFACE.g:5722:1: rule__Version__Group__1__Impl : ( ( rule__Version__Group_1__0 )* ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5726:1: ( ( ( rule__Version__Group_1__0 )* ) )
            // InternalIFACE.g:5727:1: ( ( rule__Version__Group_1__0 )* )
            {
            // InternalIFACE.g:5727:1: ( ( rule__Version__Group_1__0 )* )
            // InternalIFACE.g:5728:2: ( rule__Version__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1()); 
            }
            // InternalIFACE.g:5729:2: ( rule__Version__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==70) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalIFACE.g:5729:3: rule__Version__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_50);
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
    // InternalIFACE.g:5738:1: rule__Version__Group_0_1__0 : rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 ;
    public final void rule__Version__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5742:1: ( rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 )
            // InternalIFACE.g:5743:2: rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1
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
    // InternalIFACE.g:5750:1: rule__Version__Group_0_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5754:1: ( ( ( RULE_INT )? ) )
            // InternalIFACE.g:5755:1: ( ( RULE_INT )? )
            {
            // InternalIFACE.g:5755:1: ( ( RULE_INT )? )
            // InternalIFACE.g:5756:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
            }
            // InternalIFACE.g:5757:2: ( RULE_INT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalIFACE.g:5757:3: RULE_INT
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
    // InternalIFACE.g:5765:1: rule__Version__Group_0_1__1 : rule__Version__Group_0_1__1__Impl ;
    public final void rule__Version__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5769:1: ( rule__Version__Group_0_1__1__Impl )
            // InternalIFACE.g:5770:2: rule__Version__Group_0_1__1__Impl
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
    // InternalIFACE.g:5776:1: rule__Version__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5780:1: ( ( RULE_ID ) )
            // InternalIFACE.g:5781:1: ( RULE_ID )
            {
            // InternalIFACE.g:5781:1: ( RULE_ID )
            // InternalIFACE.g:5782:2: RULE_ID
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
    // InternalIFACE.g:5792:1: rule__Version__Group_1__0 : rule__Version__Group_1__0__Impl rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5796:1: ( rule__Version__Group_1__0__Impl rule__Version__Group_1__1 )
            // InternalIFACE.g:5797:2: rule__Version__Group_1__0__Impl rule__Version__Group_1__1
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
    // InternalIFACE.g:5804:1: rule__Version__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5808:1: ( ( '.' ) )
            // InternalIFACE.g:5809:1: ( '.' )
            {
            // InternalIFACE.g:5809:1: ( '.' )
            // InternalIFACE.g:5810:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            }
            match(input,70,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:5819:1: rule__Version__Group_1__1 : rule__Version__Group_1__1__Impl ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5823:1: ( rule__Version__Group_1__1__Impl )
            // InternalIFACE.g:5824:2: rule__Version__Group_1__1__Impl
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
    // InternalIFACE.g:5830:1: rule__Version__Group_1__1__Impl : ( ( rule__Version__Alternatives_1_1 ) ) ;
    public final void rule__Version__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5834:1: ( ( ( rule__Version__Alternatives_1_1 ) ) )
            // InternalIFACE.g:5835:1: ( ( rule__Version__Alternatives_1_1 ) )
            {
            // InternalIFACE.g:5835:1: ( ( rule__Version__Alternatives_1_1 ) )
            // InternalIFACE.g:5836:2: ( rule__Version__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_1_1()); 
            }
            // InternalIFACE.g:5837:2: ( rule__Version__Alternatives_1_1 )
            // InternalIFACE.g:5837:3: rule__Version__Alternatives_1_1
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
    // InternalIFACE.g:5846:1: rule__Version__Group_1_1_1__0 : rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 ;
    public final void rule__Version__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5850:1: ( rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 )
            // InternalIFACE.g:5851:2: rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1
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
    // InternalIFACE.g:5858:1: rule__Version__Group_1_1_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5862:1: ( ( ( RULE_INT )? ) )
            // InternalIFACE.g:5863:1: ( ( RULE_INT )? )
            {
            // InternalIFACE.g:5863:1: ( ( RULE_INT )? )
            // InternalIFACE.g:5864:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
            }
            // InternalIFACE.g:5865:2: ( RULE_INT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalIFACE.g:5865:3: RULE_INT
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
    // InternalIFACE.g:5873:1: rule__Version__Group_1_1_1__1 : rule__Version__Group_1_1_1__1__Impl ;
    public final void rule__Version__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5877:1: ( rule__Version__Group_1_1_1__1__Impl )
            // InternalIFACE.g:5878:2: rule__Version__Group_1_1_1__1__Impl
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
    // InternalIFACE.g:5884:1: rule__Version__Group_1_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5888:1: ( ( RULE_ID ) )
            // InternalIFACE.g:5889:1: ( RULE_ID )
            {
            // InternalIFACE.g:5889:1: ( RULE_ID )
            // InternalIFACE.g:5890:2: RULE_ID
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
    // InternalIFACE.g:5900:1: rule__VersionedQualifiedName__Group__0 : rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 ;
    public final void rule__VersionedQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5904:1: ( rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 )
            // InternalIFACE.g:5905:2: rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_51);
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
    // InternalIFACE.g:5912:1: rule__VersionedQualifiedName__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__VersionedQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5916:1: ( ( ruleQualifiedName ) )
            // InternalIFACE.g:5917:1: ( ruleQualifiedName )
            {
            // InternalIFACE.g:5917:1: ( ruleQualifiedName )
            // InternalIFACE.g:5918:2: ruleQualifiedName
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
    // InternalIFACE.g:5927:1: rule__VersionedQualifiedName__Group__1 : rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 ;
    public final void rule__VersionedQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5931:1: ( rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 )
            // InternalIFACE.g:5932:2: rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2
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
    // InternalIFACE.g:5939:1: rule__VersionedQualifiedName__Group__1__Impl : ( '(' ) ;
    public final void rule__VersionedQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5943:1: ( ( '(' ) )
            // InternalIFACE.g:5944:1: ( '(' )
            {
            // InternalIFACE.g:5944:1: ( '(' )
            // InternalIFACE.g:5945:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,71,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:5954:1: rule__VersionedQualifiedName__Group__2 : rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 ;
    public final void rule__VersionedQualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5958:1: ( rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 )
            // InternalIFACE.g:5959:2: rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_52);
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
    // InternalIFACE.g:5966:1: rule__VersionedQualifiedName__Group__2__Impl : ( ruleVersion ) ;
    public final void rule__VersionedQualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5970:1: ( ( ruleVersion ) )
            // InternalIFACE.g:5971:1: ( ruleVersion )
            {
            // InternalIFACE.g:5971:1: ( ruleVersion )
            // InternalIFACE.g:5972:2: ruleVersion
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
    // InternalIFACE.g:5981:1: rule__VersionedQualifiedName__Group__3 : rule__VersionedQualifiedName__Group__3__Impl ;
    public final void rule__VersionedQualifiedName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5985:1: ( rule__VersionedQualifiedName__Group__3__Impl )
            // InternalIFACE.g:5986:2: rule__VersionedQualifiedName__Group__3__Impl
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
    // InternalIFACE.g:5992:1: rule__VersionedQualifiedName__Group__3__Impl : ( ')' ) ;
    public final void rule__VersionedQualifiedName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:5996:1: ( ( ')' ) )
            // InternalIFACE.g:5997:1: ( ')' )
            {
            // InternalIFACE.g:5997:1: ( ')' )
            // InternalIFACE.g:5998:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,72,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIFACE.g:6008:1: rule__INTEGER__Group_0__0 : rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 ;
    public final void rule__INTEGER__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6012:1: ( rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 )
            // InternalIFACE.g:6013:2: rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_53);
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
    // InternalIFACE.g:6020:1: rule__INTEGER__Group_0__0__Impl : ( ( '-' )? ) ;
    public final void rule__INTEGER__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6024:1: ( ( ( '-' )? ) )
            // InternalIFACE.g:6025:1: ( ( '-' )? )
            {
            // InternalIFACE.g:6025:1: ( ( '-' )? )
            // InternalIFACE.g:6026:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); 
            }
            // InternalIFACE.g:6027:2: ( '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==73) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalIFACE.g:6027:3: '-'
                    {
                    match(input,73,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalIFACE.g:6035:1: rule__INTEGER__Group_0__1 : rule__INTEGER__Group_0__1__Impl ;
    public final void rule__INTEGER__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6039:1: ( rule__INTEGER__Group_0__1__Impl )
            // InternalIFACE.g:6040:2: rule__INTEGER__Group_0__1__Impl
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
    // InternalIFACE.g:6046:1: rule__INTEGER__Group_0__1__Impl : ( RULE_INT ) ;
    public final void rule__INTEGER__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6050:1: ( ( RULE_INT ) )
            // InternalIFACE.g:6051:1: ( RULE_INT )
            {
            // InternalIFACE.g:6051:1: ( RULE_INT )
            // InternalIFACE.g:6052:2: RULE_INT
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
    // InternalIFACE.g:6062:1: rule__GSSIfacePortConfig__UnorderedGroup_3 : rule__GSSIfacePortConfig__UnorderedGroup_3__0 {...}?;
    public final void rule__GSSIfacePortConfig__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3());
        	
        try {
            // InternalIFACE.g:6067:1: ( rule__GSSIfacePortConfig__UnorderedGroup_3__0 {...}?)
            // InternalIFACE.g:6068:2: rule__GSSIfacePortConfig__UnorderedGroup_3__0 {...}?
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
    // InternalIFACE.g:6076:1: rule__GSSIfacePortConfig__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__GSSIfacePortConfig__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalIFACE.g:6081:1: ( ( ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) ) ) )
            // InternalIFACE.g:6082:3: ( ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) ) )
            {
            // InternalIFACE.g:6082:3: ( ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) ) )
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
                    // InternalIFACE.g:6083:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) )
                    {
                    // InternalIFACE.g:6083:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) )
                    // InternalIFACE.g:6084:4: {...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfacePortConfig__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalIFACE.g:6084:114: ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) )
                    // InternalIFACE.g:6085:5: ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // InternalIFACE.g:6091:5: ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) )
                    // InternalIFACE.g:6092:6: ( rule__GSSIfacePortConfig__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfacePortConfigAccess().getGroup_3_0()); 
                    }
                    // InternalIFACE.g:6093:6: ( rule__GSSIfacePortConfig__Group_3_0__0 )
                    // InternalIFACE.g:6093:7: rule__GSSIfacePortConfig__Group_3_0__0
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
                    // InternalIFACE.g:6098:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) )
                    {
                    // InternalIFACE.g:6098:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) ) )
                    // InternalIFACE.g:6099:4: {...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSIfacePortConfig__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalIFACE.g:6099:114: ( ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) ) )
                    // InternalIFACE.g:6100:5: ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // InternalIFACE.g:6106:5: ( ( rule__GSSIfacePortConfig__Group_3_1__0 ) )
                    // InternalIFACE.g:6107:6: ( rule__GSSIfacePortConfig__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSIfacePortConfigAccess().getGroup_3_1()); 
                    }
                    // InternalIFACE.g:6108:6: ( rule__GSSIfacePortConfig__Group_3_1__0 )
                    // InternalIFACE.g:6108:7: rule__GSSIfacePortConfig__Group_3_1__0
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
    // InternalIFACE.g:6121:1: rule__GSSIfacePortConfig__UnorderedGroup_3__0 : rule__GSSIfacePortConfig__UnorderedGroup_3__Impl ( rule__GSSIfacePortConfig__UnorderedGroup_3__1 )? ;
    public final void rule__GSSIfacePortConfig__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6125:1: ( rule__GSSIfacePortConfig__UnorderedGroup_3__Impl ( rule__GSSIfacePortConfig__UnorderedGroup_3__1 )? )
            // InternalIFACE.g:6126:2: rule__GSSIfacePortConfig__UnorderedGroup_3__Impl ( rule__GSSIfacePortConfig__UnorderedGroup_3__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_54);
            rule__GSSIfacePortConfig__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalIFACE.g:6127:2: ( rule__GSSIfacePortConfig__UnorderedGroup_3__1 )?
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
    // InternalIFACE.g:6133:1: rule__GSSIfacePortConfig__UnorderedGroup_3__1 : rule__GSSIfacePortConfig__UnorderedGroup_3__Impl ;
    public final void rule__GSSIfacePortConfig__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6137:1: ( rule__GSSIfacePortConfig__UnorderedGroup_3__Impl )
            // InternalIFACE.g:6138:2: rule__GSSIfacePortConfig__UnorderedGroup_3__Impl
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
    // InternalIFACE.g:6145:1: rule__GSSModelFile__ImportsAssignment_0 : ( ruleGSSModelFileImport ) ;
    public final void rule__GSSModelFile__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6149:1: ( ( ruleGSSModelFileImport ) )
            // InternalIFACE.g:6150:2: ( ruleGSSModelFileImport )
            {
            // InternalIFACE.g:6150:2: ( ruleGSSModelFileImport )
            // InternalIFACE.g:6151:3: ruleGSSModelFileImport
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
    // InternalIFACE.g:6160:1: rule__GSSModelFile__ElementAssignment_1 : ( ruleGSSIfacePortConfig ) ;
    public final void rule__GSSModelFile__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6164:1: ( ( ruleGSSIfacePortConfig ) )
            // InternalIFACE.g:6165:2: ( ruleGSSIfacePortConfig )
            {
            // InternalIFACE.g:6165:2: ( ruleGSSIfacePortConfig )
            // InternalIFACE.g:6166:3: ruleGSSIfacePortConfig
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
    // InternalIFACE.g:6175:1: rule__GSSModelFileImport__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GSSModelFileImport__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6179:1: ( ( RULE_STRING ) )
            // InternalIFACE.g:6180:2: ( RULE_STRING )
            {
            // InternalIFACE.g:6180:2: ( RULE_STRING )
            // InternalIFACE.g:6181:3: RULE_STRING
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
    // InternalIFACE.g:6190:1: rule__GSSIfacePortConfig__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GSSIfacePortConfig__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6194:1: ( ( RULE_ID ) )
            // InternalIFACE.g:6195:2: ( RULE_ID )
            {
            // InternalIFACE.g:6195:2: ( RULE_ID )
            // InternalIFACE.g:6196:3: RULE_ID
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
    // InternalIFACE.g:6205:1: rule__GSSIfacePortConfig__UriAssignment_3_0_2 : ( ruleQualifiedName ) ;
    public final void rule__GSSIfacePortConfig__UriAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6209:1: ( ( ruleQualifiedName ) )
            // InternalIFACE.g:6210:2: ( ruleQualifiedName )
            {
            // InternalIFACE.g:6210:2: ( ruleQualifiedName )
            // InternalIFACE.g:6211:3: ruleQualifiedName
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
    // InternalIFACE.g:6220:1: rule__GSSIfacePortConfig__VersionAssignment_3_1_2 : ( ruleVersion ) ;
    public final void rule__GSSIfacePortConfig__VersionAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6224:1: ( ( ruleVersion ) )
            // InternalIFACE.g:6225:2: ( ruleVersion )
            {
            // InternalIFACE.g:6225:2: ( ruleVersion )
            // InternalIFACE.g:6226:3: ruleVersion
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
    // InternalIFACE.g:6235:1: rule__GSSIfacePortConfig__PortConfigAssignment_4 : ( ruleGSSIfacePort ) ;
    public final void rule__GSSIfacePortConfig__PortConfigAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6239:1: ( ( ruleGSSIfacePort ) )
            // InternalIFACE.g:6240:2: ( ruleGSSIfacePort )
            {
            // InternalIFACE.g:6240:2: ( ruleGSSIfacePort )
            // InternalIFACE.g:6241:3: ruleGSSIfacePort
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
    // InternalIFACE.g:6250:1: rule__GSSIfaceSpWPort__TypeAssignment_4 : ( ruleGSSIfaceSpWPortType ) ;
    public final void rule__GSSIfaceSpWPort__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6254:1: ( ( ruleGSSIfaceSpWPortType ) )
            // InternalIFACE.g:6255:2: ( ruleGSSIfaceSpWPortType )
            {
            // InternalIFACE.g:6255:2: ( ruleGSSIfaceSpWPortType )
            // InternalIFACE.g:6256:3: ruleGSSIfaceSpWPortType
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
    // InternalIFACE.g:6265:1: rule__GSSIfaceSpWPort__LinkAssignment_8 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSpWPort__LinkAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6269:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6270:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6270:2: ( ruleINTEGER )
            // InternalIFACE.g:6271:3: ruleINTEGER
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
    // InternalIFACE.g:6280:1: rule__GSSIfaceSpWPort__WritingPortAssignment_12 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSpWPort__WritingPortAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6284:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6285:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6285:2: ( ruleINTEGER )
            // InternalIFACE.g:6286:3: ruleINTEGER
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
    // InternalIFACE.g:6295:1: rule__GSSIfaceSpWPort__ReadingPortAssignment_14 : ( ruleGSSIfaceReadingPort ) ;
    public final void rule__GSSIfaceSpWPort__ReadingPortAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6299:1: ( ( ruleGSSIfaceReadingPort ) )
            // InternalIFACE.g:6300:2: ( ruleGSSIfaceReadingPort )
            {
            // InternalIFACE.g:6300:2: ( ruleGSSIfaceReadingPort )
            // InternalIFACE.g:6301:3: ruleGSSIfaceReadingPort
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
    // InternalIFACE.g:6310:1: rule__GSSIfaceReadingPort__PortAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceReadingPort__PortAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6314:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6315:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6315:2: ( ruleINTEGER )
            // InternalIFACE.g:6316:3: ruleINTEGER
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
    // InternalIFACE.g:6325:1: rule__GSSIfaceUartPort__NumberAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceUartPort__NumberAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6329:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6330:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6330:2: ( ruleINTEGER )
            // InternalIFACE.g:6331:3: ruleINTEGER
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
    // InternalIFACE.g:6340:1: rule__GSSIfaceUartPort__BaudRateAssignment_8 : ( ruleGSSIfaceUartPortBaudRate ) ;
    public final void rule__GSSIfaceUartPort__BaudRateAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6344:1: ( ( ruleGSSIfaceUartPortBaudRate ) )
            // InternalIFACE.g:6345:2: ( ruleGSSIfaceUartPortBaudRate )
            {
            // InternalIFACE.g:6345:2: ( ruleGSSIfaceUartPortBaudRate )
            // InternalIFACE.g:6346:3: ruleGSSIfaceUartPortBaudRate
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
    // InternalIFACE.g:6355:1: rule__GSSIfaceUartPort__ParityAssignment_12 : ( ruleGSSIfaceUartPortParity ) ;
    public final void rule__GSSIfaceUartPort__ParityAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6359:1: ( ( ruleGSSIfaceUartPortParity ) )
            // InternalIFACE.g:6360:2: ( ruleGSSIfaceUartPortParity )
            {
            // InternalIFACE.g:6360:2: ( ruleGSSIfaceUartPortParity )
            // InternalIFACE.g:6361:3: ruleGSSIfaceUartPortParity
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
    // InternalIFACE.g:6370:1: rule__GSSIfaceUartPort__DataBitsAssignment_16 : ( ruleGSSIfaceUartPortDataBits ) ;
    public final void rule__GSSIfaceUartPort__DataBitsAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6374:1: ( ( ruleGSSIfaceUartPortDataBits ) )
            // InternalIFACE.g:6375:2: ( ruleGSSIfaceUartPortDataBits )
            {
            // InternalIFACE.g:6375:2: ( ruleGSSIfaceUartPortDataBits )
            // InternalIFACE.g:6376:3: ruleGSSIfaceUartPortDataBits
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
    // InternalIFACE.g:6385:1: rule__GSSIfaceUartPort__StopBitsAssignment_20 : ( ruleGSSIfaceUartPortStopBits ) ;
    public final void rule__GSSIfaceUartPort__StopBitsAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6389:1: ( ( ruleGSSIfaceUartPortStopBits ) )
            // InternalIFACE.g:6390:2: ( ruleGSSIfaceUartPortStopBits )
            {
            // InternalIFACE.g:6390:2: ( ruleGSSIfaceUartPortStopBits )
            // InternalIFACE.g:6391:3: ruleGSSIfaceUartPortStopBits
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
    // InternalIFACE.g:6400:1: rule__GSSIfaceUartPort__FlowControlAssignment_24 : ( ruleGSSIfaceUartPortFlowControl ) ;
    public final void rule__GSSIfaceUartPort__FlowControlAssignment_24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6404:1: ( ( ruleGSSIfaceUartPortFlowControl ) )
            // InternalIFACE.g:6405:2: ( ruleGSSIfaceUartPortFlowControl )
            {
            // InternalIFACE.g:6405:2: ( ruleGSSIfaceUartPortFlowControl )
            // InternalIFACE.g:6406:3: ruleGSSIfaceUartPortFlowControl
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


    // $ANTLR start "rule__GSSIfaceUartPort__PortProtocolAssignment_26"
    // InternalIFACE.g:6415:1: rule__GSSIfaceUartPort__PortProtocolAssignment_26 : ( ruleGSSIfacePortProtocol ) ;
    public final void rule__GSSIfaceUartPort__PortProtocolAssignment_26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6419:1: ( ( ruleGSSIfacePortProtocol ) )
            // InternalIFACE.g:6420:2: ( ruleGSSIfacePortProtocol )
            {
            // InternalIFACE.g:6420:2: ( ruleGSSIfacePortProtocol )
            // InternalIFACE.g:6421:3: ruleGSSIfacePortProtocol
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceUartPortAccess().getPortProtocolGSSIfacePortProtocolParserRuleCall_26_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfacePortProtocol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceUartPortAccess().getPortProtocolGSSIfacePortProtocolParserRuleCall_26_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceUartPort__PortProtocolAssignment_26"


    // $ANTLR start "rule__GSSIfaceSocketSrvPort__PortNumberAssignment_4"
    // InternalIFACE.g:6430:1: rule__GSSIfaceSocketSrvPort__PortNumberAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSocketSrvPort__PortNumberAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6434:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6435:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6435:2: ( ruleINTEGER )
            // InternalIFACE.g:6436:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketSrvPortAccess().getPortNumberINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketSrvPortAccess().getPortNumberINTEGERParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketSrvPort__PortNumberAssignment_4"


    // $ANTLR start "rule__GSSIfaceSocketSrvPort__PortProtocolAssignment_6"
    // InternalIFACE.g:6445:1: rule__GSSIfaceSocketSrvPort__PortProtocolAssignment_6 : ( ruleGSSIfacePortProtocol ) ;
    public final void rule__GSSIfaceSocketSrvPort__PortProtocolAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6449:1: ( ( ruleGSSIfacePortProtocol ) )
            // InternalIFACE.g:6450:2: ( ruleGSSIfacePortProtocol )
            {
            // InternalIFACE.g:6450:2: ( ruleGSSIfacePortProtocol )
            // InternalIFACE.g:6451:3: ruleGSSIfacePortProtocol
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketSrvPortAccess().getPortProtocolGSSIfacePortProtocolParserRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfacePortProtocol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketSrvPortAccess().getPortProtocolGSSIfacePortProtocolParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketSrvPort__PortProtocolAssignment_6"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__IpAddressAssignment_4"
    // InternalIFACE.g:6460:1: rule__GSSIfaceSocketCliPort__IpAddressAssignment_4 : ( RULE_STRING ) ;
    public final void rule__GSSIfaceSocketCliPort__IpAddressAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6464:1: ( ( RULE_STRING ) )
            // InternalIFACE.g:6465:2: ( RULE_STRING )
            {
            // InternalIFACE.g:6465:2: ( RULE_STRING )
            // InternalIFACE.g:6466:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketCliPortAccess().getIpAddressSTRINGTerminalRuleCall_4_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketCliPortAccess().getIpAddressSTRINGTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__IpAddressAssignment_4"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__PortNumberAssignment_8"
    // InternalIFACE.g:6475:1: rule__GSSIfaceSocketCliPort__PortNumberAssignment_8 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSocketCliPort__PortNumberAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6479:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6480:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6480:2: ( ruleINTEGER )
            // InternalIFACE.g:6481:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketCliPortAccess().getPortNumberINTEGERParserRuleCall_8_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketCliPortAccess().getPortNumberINTEGERParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__PortNumberAssignment_8"


    // $ANTLR start "rule__GSSIfaceSocketCliPort__PortProtocolAssignment_10"
    // InternalIFACE.g:6490:1: rule__GSSIfaceSocketCliPort__PortProtocolAssignment_10 : ( ruleGSSIfacePortProtocol ) ;
    public final void rule__GSSIfaceSocketCliPort__PortProtocolAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6494:1: ( ( ruleGSSIfacePortProtocol ) )
            // InternalIFACE.g:6495:2: ( ruleGSSIfacePortProtocol )
            {
            // InternalIFACE.g:6495:2: ( ruleGSSIfacePortProtocol )
            // InternalIFACE.g:6496:3: ruleGSSIfacePortProtocol
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfaceSocketCliPortAccess().getPortProtocolGSSIfacePortProtocolParserRuleCall_10_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfacePortProtocol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfaceSocketCliPortAccess().getPortProtocolGSSIfacePortProtocolParserRuleCall_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfaceSocketCliPort__PortProtocolAssignment_10"


    // $ANTLR start "rule__GSSIfacePortProtocol__UnitAssignment_4"
    // InternalIFACE.g:6505:1: rule__GSSIfacePortProtocol__UnitAssignment_4 : ( ruleGSSIfacePortProtocolUnit ) ;
    public final void rule__GSSIfacePortProtocol__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6509:1: ( ( ruleGSSIfacePortProtocolUnit ) )
            // InternalIFACE.g:6510:2: ( ruleGSSIfacePortProtocolUnit )
            {
            // InternalIFACE.g:6510:2: ( ruleGSSIfacePortProtocolUnit )
            // InternalIFACE.g:6511:3: ruleGSSIfacePortProtocolUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortProtocolAccess().getUnitGSSIfacePortProtocolUnitEnumRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfacePortProtocolUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortProtocolAccess().getUnitGSSIfacePortProtocolUnitEnumRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__UnitAssignment_4"


    // $ANTLR start "rule__GSSIfacePortProtocol__PowerAssignment_8"
    // InternalIFACE.g:6520:1: rule__GSSIfacePortProtocol__PowerAssignment_8 : ( ruleGSSIfacePortProtocolPower ) ;
    public final void rule__GSSIfacePortProtocol__PowerAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6524:1: ( ( ruleGSSIfacePortProtocolPower ) )
            // InternalIFACE.g:6525:2: ( ruleGSSIfacePortProtocolPower )
            {
            // InternalIFACE.g:6525:2: ( ruleGSSIfacePortProtocolPower )
            // InternalIFACE.g:6526:3: ruleGSSIfacePortProtocolPower
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortProtocolAccess().getPowerGSSIfacePortProtocolPowerEnumRuleCall_8_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfacePortProtocolPower();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortProtocolAccess().getPowerGSSIfacePortProtocolPowerEnumRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__PowerAssignment_8"


    // $ANTLR start "rule__GSSIfacePortProtocol__ConstSizeAssignment_10"
    // InternalIFACE.g:6535:1: rule__GSSIfacePortProtocol__ConstSizeAssignment_10 : ( ruleGSSIfaceConstSize ) ;
    public final void rule__GSSIfacePortProtocol__ConstSizeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6539:1: ( ( ruleGSSIfaceConstSize ) )
            // InternalIFACE.g:6540:2: ( ruleGSSIfaceConstSize )
            {
            // InternalIFACE.g:6540:2: ( ruleGSSIfaceConstSize )
            // InternalIFACE.g:6541:3: ruleGSSIfaceConstSize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortProtocolAccess().getConstSizeGSSIfaceConstSizeParserRuleCall_10_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceConstSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortProtocolAccess().getConstSizeGSSIfaceConstSizeParserRuleCall_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__ConstSizeAssignment_10"


    // $ANTLR start "rule__GSSIfacePortProtocol__SizeFieldOffsetAssignment_11"
    // InternalIFACE.g:6550:1: rule__GSSIfacePortProtocol__SizeFieldOffsetAssignment_11 : ( ruleGSSIfaceSizeFieldOffset ) ;
    public final void rule__GSSIfacePortProtocol__SizeFieldOffsetAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6554:1: ( ( ruleGSSIfaceSizeFieldOffset ) )
            // InternalIFACE.g:6555:2: ( ruleGSSIfaceSizeFieldOffset )
            {
            // InternalIFACE.g:6555:2: ( ruleGSSIfaceSizeFieldOffset )
            // InternalIFACE.g:6556:3: ruleGSSIfaceSizeFieldOffset
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortProtocolAccess().getSizeFieldOffsetGSSIfaceSizeFieldOffsetParserRuleCall_11_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceSizeFieldOffset();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortProtocolAccess().getSizeFieldOffsetGSSIfaceSizeFieldOffsetParserRuleCall_11_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__SizeFieldOffsetAssignment_11"


    // $ANTLR start "rule__GSSIfacePortProtocol__SizeFieldTrimAssignment_12"
    // InternalIFACE.g:6565:1: rule__GSSIfacePortProtocol__SizeFieldTrimAssignment_12 : ( ruleGSSIfaceSizeFieldTrim ) ;
    public final void rule__GSSIfacePortProtocol__SizeFieldTrimAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6569:1: ( ( ruleGSSIfaceSizeFieldTrim ) )
            // InternalIFACE.g:6570:2: ( ruleGSSIfaceSizeFieldTrim )
            {
            // InternalIFACE.g:6570:2: ( ruleGSSIfaceSizeFieldTrim )
            // InternalIFACE.g:6571:3: ruleGSSIfaceSizeFieldTrim
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortProtocolAccess().getSizeFieldTrimGSSIfaceSizeFieldTrimParserRuleCall_12_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceSizeFieldTrim();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortProtocolAccess().getSizeFieldTrimGSSIfaceSizeFieldTrimParserRuleCall_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__SizeFieldTrimAssignment_12"


    // $ANTLR start "rule__GSSIfacePortProtocol__SyncPatternAssignment_13"
    // InternalIFACE.g:6580:1: rule__GSSIfacePortProtocol__SyncPatternAssignment_13 : ( ruleGSSIfaceSyncPattern ) ;
    public final void rule__GSSIfacePortProtocol__SyncPatternAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6584:1: ( ( ruleGSSIfaceSyncPattern ) )
            // InternalIFACE.g:6585:2: ( ruleGSSIfaceSyncPattern )
            {
            // InternalIFACE.g:6585:2: ( ruleGSSIfaceSyncPattern )
            // InternalIFACE.g:6586:3: ruleGSSIfaceSyncPattern
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSIfacePortProtocolAccess().getSyncPatternGSSIfaceSyncPatternParserRuleCall_13_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSIfaceSyncPattern();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSIfacePortProtocolAccess().getSyncPatternGSSIfaceSyncPatternParserRuleCall_13_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSIfacePortProtocol__SyncPatternAssignment_13"


    // $ANTLR start "rule__GSSIfaceConstSize__BytesAssignment_4"
    // InternalIFACE.g:6595:1: rule__GSSIfaceConstSize__BytesAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceConstSize__BytesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6599:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6600:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6600:2: ( ruleINTEGER )
            // InternalIFACE.g:6601:3: ruleINTEGER
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
    // InternalIFACE.g:6610:1: rule__GSSIfaceConstSize__BitsAssignment_8 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceConstSize__BitsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6614:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6615:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6615:2: ( ruleINTEGER )
            // InternalIFACE.g:6616:3: ruleINTEGER
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
    // InternalIFACE.g:6625:1: rule__GSSIfaceSizeFieldOffset__BytesAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSizeFieldOffset__BytesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6629:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6630:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6630:2: ( ruleINTEGER )
            // InternalIFACE.g:6631:3: ruleINTEGER
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
    // InternalIFACE.g:6640:1: rule__GSSIfaceSizeFieldOffset__BitsAssignment_8 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSizeFieldOffset__BitsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6644:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6645:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6645:2: ( ruleINTEGER )
            // InternalIFACE.g:6646:3: ruleINTEGER
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
    // InternalIFACE.g:6655:1: rule__GSSIfaceSizeFieldTrim__BytesAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSizeFieldTrim__BytesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6659:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6660:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6660:2: ( ruleINTEGER )
            // InternalIFACE.g:6661:3: ruleINTEGER
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
    // InternalIFACE.g:6670:1: rule__GSSIfaceSizeFieldTrim__BitsAssignment_8 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSizeFieldTrim__BitsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6674:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6675:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6675:2: ( ruleINTEGER )
            // InternalIFACE.g:6676:3: ruleINTEGER
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
    // InternalIFACE.g:6685:1: rule__GSSIfaceSyncPattern__HexValueAssignment_4 : ( RULE_HEXADECIMAL ) ;
    public final void rule__GSSIfaceSyncPattern__HexValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6689:1: ( ( RULE_HEXADECIMAL ) )
            // InternalIFACE.g:6690:2: ( RULE_HEXADECIMAL )
            {
            // InternalIFACE.g:6690:2: ( RULE_HEXADECIMAL )
            // InternalIFACE.g:6691:3: RULE_HEXADECIMAL
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
    // InternalIFACE.g:6700:1: rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__GSSIfaceSpWTCPort__SpwPortRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIFACE.g:6704:1: ( ( ruleINTEGER ) )
            // InternalIFACE.g:6705:2: ( ruleINTEGER )
            {
            // InternalIFACE.g:6705:2: ( ruleINTEGER )
            // InternalIFACE.g:6706:3: ruleINTEGER
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

    // $ANTLR start synpred32_InternalIFACE
    public final void synpred32_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:6083:3: ( ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) ) )
        // InternalIFACE.g:6083:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) )
        {
        // InternalIFACE.g:6083:3: ({...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) ) )
        // InternalIFACE.g:6084:4: {...}? => ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred32_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalIFACE.g:6084:114: ( ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) ) )
        // InternalIFACE.g:6085:5: ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0);
        // InternalIFACE.g:6091:5: ( ( rule__GSSIfacePortConfig__Group_3_0__0 ) )
        // InternalIFACE.g:6092:6: ( rule__GSSIfacePortConfig__Group_3_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSIfacePortConfigAccess().getGroup_3_0()); 
        }
        // InternalIFACE.g:6093:6: ( rule__GSSIfacePortConfig__Group_3_0__0 )
        // InternalIFACE.g:6093:7: rule__GSSIfacePortConfig__Group_3_0__0
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
    // $ANTLR end synpred32_InternalIFACE

    // $ANTLR start synpred33_InternalIFACE
    public final void synpred33_InternalIFACE_fragment() throws RecognitionException {   
        // InternalIFACE.g:6127:2: ( rule__GSSIfacePortConfig__UnorderedGroup_3__1 )
        // InternalIFACE.g:6127:2: rule__GSSIfacePortConfig__UnorderedGroup_3__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSIfacePortConfig__UnorderedGroup_3__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalIFACE

    // Delegated rules

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
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0281040000000000L,0x0000000000000028L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000007000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000200L});
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
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000308000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000200L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000028000000002L});
    }


}