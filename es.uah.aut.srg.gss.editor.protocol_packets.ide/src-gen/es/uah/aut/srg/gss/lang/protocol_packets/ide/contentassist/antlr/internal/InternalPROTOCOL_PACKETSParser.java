package es.uah.aut.srg.gss.lang.protocol_packets.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.gss.lang.protocol_packets.services.PROTOCOL_PACKETSGrammarAccess;



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
public class InternalPROTOCOL_PACKETSParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_HEXADECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "':='", "';'", "'GSSProtocolPacketsProtocolPackets'", "'{'", "'}'", "'uri'", "'version'", "'GSSProtocolPacketsProtocolPacket'", "'name'", "'ifRef'", "'levelRef'", "'export'", "'GSSProtocolPacketsFormat'", "'file'", "'.'", "'('", "')'", "'-'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
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


        public InternalPROTOCOL_PACKETSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPROTOCOL_PACKETSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPROTOCOL_PACKETSParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPROTOCOL_PACKETS.g"; }


    	private PROTOCOL_PACKETSGrammarAccess grammarAccess;

    	public void setGrammarAccess(PROTOCOL_PACKETSGrammarAccess grammarAccess) {
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
    // InternalPROTOCOL_PACKETS.g:61:1: entryRuleGSSModelFile : ruleGSSModelFile EOF ;
    public final void entryRuleGSSModelFile() throws RecognitionException {
        try {
            // InternalPROTOCOL_PACKETS.g:62:1: ( ruleGSSModelFile EOF )
            // InternalPROTOCOL_PACKETS.g:63:1: ruleGSSModelFile EOF
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
    // InternalPROTOCOL_PACKETS.g:70:1: ruleGSSModelFile : ( ( rule__GSSModelFile__Group__0 ) ) ;
    public final void ruleGSSModelFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:74:2: ( ( ( rule__GSSModelFile__Group__0 ) ) )
            // InternalPROTOCOL_PACKETS.g:75:2: ( ( rule__GSSModelFile__Group__0 ) )
            {
            // InternalPROTOCOL_PACKETS.g:75:2: ( ( rule__GSSModelFile__Group__0 ) )
            // InternalPROTOCOL_PACKETS.g:76:3: ( rule__GSSModelFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getGroup()); 
            }
            // InternalPROTOCOL_PACKETS.g:77:3: ( rule__GSSModelFile__Group__0 )
            // InternalPROTOCOL_PACKETS.g:77:4: rule__GSSModelFile__Group__0
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
    // InternalPROTOCOL_PACKETS.g:86:1: entryRuleGSSModelFileImport : ruleGSSModelFileImport EOF ;
    public final void entryRuleGSSModelFileImport() throws RecognitionException {
        try {
            // InternalPROTOCOL_PACKETS.g:87:1: ( ruleGSSModelFileImport EOF )
            // InternalPROTOCOL_PACKETS.g:88:1: ruleGSSModelFileImport EOF
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
    // InternalPROTOCOL_PACKETS.g:95:1: ruleGSSModelFileImport : ( ( rule__GSSModelFileImport__Group__0 ) ) ;
    public final void ruleGSSModelFileImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:99:2: ( ( ( rule__GSSModelFileImport__Group__0 ) ) )
            // InternalPROTOCOL_PACKETS.g:100:2: ( ( rule__GSSModelFileImport__Group__0 ) )
            {
            // InternalPROTOCOL_PACKETS.g:100:2: ( ( rule__GSSModelFileImport__Group__0 ) )
            // InternalPROTOCOL_PACKETS.g:101:3: ( rule__GSSModelFileImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getGroup()); 
            }
            // InternalPROTOCOL_PACKETS.g:102:3: ( rule__GSSModelFileImport__Group__0 )
            // InternalPROTOCOL_PACKETS.g:102:4: rule__GSSModelFileImport__Group__0
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


    // $ANTLR start "entryRuleGSSProtocolPacketsProtocolPackets"
    // InternalPROTOCOL_PACKETS.g:111:1: entryRuleGSSProtocolPacketsProtocolPackets : ruleGSSProtocolPacketsProtocolPackets EOF ;
    public final void entryRuleGSSProtocolPacketsProtocolPackets() throws RecognitionException {
        try {
            // InternalPROTOCOL_PACKETS.g:112:1: ( ruleGSSProtocolPacketsProtocolPackets EOF )
            // InternalPROTOCOL_PACKETS.g:113:1: ruleGSSProtocolPacketsProtocolPackets EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSProtocolPacketsProtocolPackets();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketsRule()); 
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
    // $ANTLR end "entryRuleGSSProtocolPacketsProtocolPackets"


    // $ANTLR start "ruleGSSProtocolPacketsProtocolPackets"
    // InternalPROTOCOL_PACKETS.g:120:1: ruleGSSProtocolPacketsProtocolPackets : ( ( rule__GSSProtocolPacketsProtocolPackets__Group__0 ) ) ;
    public final void ruleGSSProtocolPacketsProtocolPackets() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:124:2: ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group__0 ) ) )
            // InternalPROTOCOL_PACKETS.g:125:2: ( ( rule__GSSProtocolPacketsProtocolPackets__Group__0 ) )
            {
            // InternalPROTOCOL_PACKETS.g:125:2: ( ( rule__GSSProtocolPacketsProtocolPackets__Group__0 ) )
            // InternalPROTOCOL_PACKETS.g:126:3: ( rule__GSSProtocolPacketsProtocolPackets__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getGroup()); 
            }
            // InternalPROTOCOL_PACKETS.g:127:3: ( rule__GSSProtocolPacketsProtocolPackets__Group__0 )
            // InternalPROTOCOL_PACKETS.g:127:4: rule__GSSProtocolPacketsProtocolPackets__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPackets__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSProtocolPacketsProtocolPackets"


    // $ANTLR start "entryRuleGSSProtocolPacketsProtocolPacket"
    // InternalPROTOCOL_PACKETS.g:136:1: entryRuleGSSProtocolPacketsProtocolPacket : ruleGSSProtocolPacketsProtocolPacket EOF ;
    public final void entryRuleGSSProtocolPacketsProtocolPacket() throws RecognitionException {
        try {
            // InternalPROTOCOL_PACKETS.g:137:1: ( ruleGSSProtocolPacketsProtocolPacket EOF )
            // InternalPROTOCOL_PACKETS.g:138:1: ruleGSSProtocolPacketsProtocolPacket EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSProtocolPacketsProtocolPacket();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketRule()); 
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
    // $ANTLR end "entryRuleGSSProtocolPacketsProtocolPacket"


    // $ANTLR start "ruleGSSProtocolPacketsProtocolPacket"
    // InternalPROTOCOL_PACKETS.g:145:1: ruleGSSProtocolPacketsProtocolPacket : ( ( rule__GSSProtocolPacketsProtocolPacket__Group__0 ) ) ;
    public final void ruleGSSProtocolPacketsProtocolPacket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:149:2: ( ( ( rule__GSSProtocolPacketsProtocolPacket__Group__0 ) ) )
            // InternalPROTOCOL_PACKETS.g:150:2: ( ( rule__GSSProtocolPacketsProtocolPacket__Group__0 ) )
            {
            // InternalPROTOCOL_PACKETS.g:150:2: ( ( rule__GSSProtocolPacketsProtocolPacket__Group__0 ) )
            // InternalPROTOCOL_PACKETS.g:151:3: ( rule__GSSProtocolPacketsProtocolPacket__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getGroup()); 
            }
            // InternalPROTOCOL_PACKETS.g:152:3: ( rule__GSSProtocolPacketsProtocolPacket__Group__0 )
            // InternalPROTOCOL_PACKETS.g:152:4: rule__GSSProtocolPacketsProtocolPacket__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSProtocolPacketsProtocolPacket"


    // $ANTLR start "entryRuleGSSProtocolPacketsFormat"
    // InternalPROTOCOL_PACKETS.g:161:1: entryRuleGSSProtocolPacketsFormat : ruleGSSProtocolPacketsFormat EOF ;
    public final void entryRuleGSSProtocolPacketsFormat() throws RecognitionException {
        try {
            // InternalPROTOCOL_PACKETS.g:162:1: ( ruleGSSProtocolPacketsFormat EOF )
            // InternalPROTOCOL_PACKETS.g:163:1: ruleGSSProtocolPacketsFormat EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsFormatRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSProtocolPacketsFormat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsFormatRule()); 
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
    // $ANTLR end "entryRuleGSSProtocolPacketsFormat"


    // $ANTLR start "ruleGSSProtocolPacketsFormat"
    // InternalPROTOCOL_PACKETS.g:170:1: ruleGSSProtocolPacketsFormat : ( ( rule__GSSProtocolPacketsFormat__Group__0 ) ) ;
    public final void ruleGSSProtocolPacketsFormat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:174:2: ( ( ( rule__GSSProtocolPacketsFormat__Group__0 ) ) )
            // InternalPROTOCOL_PACKETS.g:175:2: ( ( rule__GSSProtocolPacketsFormat__Group__0 ) )
            {
            // InternalPROTOCOL_PACKETS.g:175:2: ( ( rule__GSSProtocolPacketsFormat__Group__0 ) )
            // InternalPROTOCOL_PACKETS.g:176:3: ( rule__GSSProtocolPacketsFormat__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsFormatAccess().getGroup()); 
            }
            // InternalPROTOCOL_PACKETS.g:177:3: ( rule__GSSProtocolPacketsFormat__Group__0 )
            // InternalPROTOCOL_PACKETS.g:177:4: rule__GSSProtocolPacketsFormat__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsFormat__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsFormatAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSProtocolPacketsFormat"


    // $ANTLR start "entryRuleEString"
    // InternalPROTOCOL_PACKETS.g:186:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalPROTOCOL_PACKETS.g:187:1: ( ruleEString EOF )
            // InternalPROTOCOL_PACKETS.g:188:1: ruleEString EOF
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
    // InternalPROTOCOL_PACKETS.g:195:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:199:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalPROTOCOL_PACKETS.g:200:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalPROTOCOL_PACKETS.g:200:2: ( ( rule__EString__Alternatives ) )
            // InternalPROTOCOL_PACKETS.g:201:3: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalPROTOCOL_PACKETS.g:202:3: ( rule__EString__Alternatives )
            // InternalPROTOCOL_PACKETS.g:202:4: rule__EString__Alternatives
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
    // InternalPROTOCOL_PACKETS.g:211:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalPROTOCOL_PACKETS.g:212:1: ( ruleQualifiedName EOF )
            // InternalPROTOCOL_PACKETS.g:213:1: ruleQualifiedName EOF
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
    // InternalPROTOCOL_PACKETS.g:220:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:224:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalPROTOCOL_PACKETS.g:225:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalPROTOCOL_PACKETS.g:225:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalPROTOCOL_PACKETS.g:226:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalPROTOCOL_PACKETS.g:227:3: ( rule__QualifiedName__Group__0 )
            // InternalPROTOCOL_PACKETS.g:227:4: rule__QualifiedName__Group__0
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
    // InternalPROTOCOL_PACKETS.g:236:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalPROTOCOL_PACKETS.g:237:1: ( ruleVersion EOF )
            // InternalPROTOCOL_PACKETS.g:238:1: ruleVersion EOF
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
    // InternalPROTOCOL_PACKETS.g:245:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:249:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalPROTOCOL_PACKETS.g:250:2: ( ( rule__Version__Group__0 ) )
            {
            // InternalPROTOCOL_PACKETS.g:250:2: ( ( rule__Version__Group__0 ) )
            // InternalPROTOCOL_PACKETS.g:251:3: ( rule__Version__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup()); 
            }
            // InternalPROTOCOL_PACKETS.g:252:3: ( rule__Version__Group__0 )
            // InternalPROTOCOL_PACKETS.g:252:4: rule__Version__Group__0
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
    // InternalPROTOCOL_PACKETS.g:261:1: entryRuleVersionedQualifiedName : ruleVersionedQualifiedName EOF ;
    public final void entryRuleVersionedQualifiedName() throws RecognitionException {
        try {
            // InternalPROTOCOL_PACKETS.g:262:1: ( ruleVersionedQualifiedName EOF )
            // InternalPROTOCOL_PACKETS.g:263:1: ruleVersionedQualifiedName EOF
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
    // InternalPROTOCOL_PACKETS.g:270:1: ruleVersionedQualifiedName : ( ( rule__VersionedQualifiedName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:274:2: ( ( ( rule__VersionedQualifiedName__Group__0 ) ) )
            // InternalPROTOCOL_PACKETS.g:275:2: ( ( rule__VersionedQualifiedName__Group__0 ) )
            {
            // InternalPROTOCOL_PACKETS.g:275:2: ( ( rule__VersionedQualifiedName__Group__0 ) )
            // InternalPROTOCOL_PACKETS.g:276:3: ( rule__VersionedQualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); 
            }
            // InternalPROTOCOL_PACKETS.g:277:3: ( rule__VersionedQualifiedName__Group__0 )
            // InternalPROTOCOL_PACKETS.g:277:4: rule__VersionedQualifiedName__Group__0
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
    // InternalPROTOCOL_PACKETS.g:286:1: entryRuleINTEGER : ruleINTEGER EOF ;
    public final void entryRuleINTEGER() throws RecognitionException {
        try {
            // InternalPROTOCOL_PACKETS.g:287:1: ( ruleINTEGER EOF )
            // InternalPROTOCOL_PACKETS.g:288:1: ruleINTEGER EOF
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
    // InternalPROTOCOL_PACKETS.g:295:1: ruleINTEGER : ( ( rule__INTEGER__Alternatives ) ) ;
    public final void ruleINTEGER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:299:2: ( ( ( rule__INTEGER__Alternatives ) ) )
            // InternalPROTOCOL_PACKETS.g:300:2: ( ( rule__INTEGER__Alternatives ) )
            {
            // InternalPROTOCOL_PACKETS.g:300:2: ( ( rule__INTEGER__Alternatives ) )
            // InternalPROTOCOL_PACKETS.g:301:3: ( rule__INTEGER__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getAlternatives()); 
            }
            // InternalPROTOCOL_PACKETS.g:302:3: ( rule__INTEGER__Alternatives )
            // InternalPROTOCOL_PACKETS.g:302:4: rule__INTEGER__Alternatives
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


    // $ANTLR start "entryRuleXMLREF"
    // InternalPROTOCOL_PACKETS.g:311:1: entryRuleXMLREF : ruleXMLREF EOF ;
    public final void entryRuleXMLREF() throws RecognitionException {
        try {
            // InternalPROTOCOL_PACKETS.g:312:1: ( ruleXMLREF EOF )
            // InternalPROTOCOL_PACKETS.g:313:1: ruleXMLREF EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMLREFRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXMLREF();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMLREFRule()); 
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
    // $ANTLR end "entryRuleXMLREF"


    // $ANTLR start "ruleXMLREF"
    // InternalPROTOCOL_PACKETS.g:320:1: ruleXMLREF : ( RULE_ID ) ;
    public final void ruleXMLREF() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:324:2: ( ( RULE_ID ) )
            // InternalPROTOCOL_PACKETS.g:325:2: ( RULE_ID )
            {
            // InternalPROTOCOL_PACKETS.g:325:2: ( RULE_ID )
            // InternalPROTOCOL_PACKETS.g:326:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXMLREFAccess().getIDTerminalRuleCall()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXMLREFAccess().getIDTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXMLREF"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalPROTOCOL_PACKETS.g:335:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:339:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalPROTOCOL_PACKETS.g:340:2: ( RULE_STRING )
                    {
                    // InternalPROTOCOL_PACKETS.g:340:2: ( RULE_STRING )
                    // InternalPROTOCOL_PACKETS.g:341:3: RULE_STRING
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
                    // InternalPROTOCOL_PACKETS.g:346:2: ( RULE_ID )
                    {
                    // InternalPROTOCOL_PACKETS.g:346:2: ( RULE_ID )
                    // InternalPROTOCOL_PACKETS.g:347:3: RULE_ID
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
    // InternalPROTOCOL_PACKETS.g:356:1: rule__Version__Alternatives_0 : ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) );
    public final void rule__Version__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:360:1: ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    alt2=2;
                }
                else if ( (LA2_1==EOF||LA2_1==14||LA2_1==27||LA2_1==29) ) {
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
                    // InternalPROTOCOL_PACKETS.g:361:2: ( RULE_INT )
                    {
                    // InternalPROTOCOL_PACKETS.g:361:2: ( RULE_INT )
                    // InternalPROTOCOL_PACKETS.g:362:3: RULE_INT
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
                    // InternalPROTOCOL_PACKETS.g:367:2: ( ( rule__Version__Group_0_1__0 ) )
                    {
                    // InternalPROTOCOL_PACKETS.g:367:2: ( ( rule__Version__Group_0_1__0 ) )
                    // InternalPROTOCOL_PACKETS.g:368:3: ( rule__Version__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_0_1()); 
                    }
                    // InternalPROTOCOL_PACKETS.g:369:3: ( rule__Version__Group_0_1__0 )
                    // InternalPROTOCOL_PACKETS.g:369:4: rule__Version__Group_0_1__0
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
    // InternalPROTOCOL_PACKETS.g:377:1: rule__Version__Alternatives_1_1 : ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) );
    public final void rule__Version__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:381:1: ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==14||LA3_1==27||LA3_1==29) ) {
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
                    // InternalPROTOCOL_PACKETS.g:382:2: ( RULE_INT )
                    {
                    // InternalPROTOCOL_PACKETS.g:382:2: ( RULE_INT )
                    // InternalPROTOCOL_PACKETS.g:383:3: RULE_INT
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
                    // InternalPROTOCOL_PACKETS.g:388:2: ( ( rule__Version__Group_1_1_1__0 ) )
                    {
                    // InternalPROTOCOL_PACKETS.g:388:2: ( ( rule__Version__Group_1_1_1__0 ) )
                    // InternalPROTOCOL_PACKETS.g:389:3: ( rule__Version__Group_1_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_1_1_1()); 
                    }
                    // InternalPROTOCOL_PACKETS.g:390:3: ( rule__Version__Group_1_1_1__0 )
                    // InternalPROTOCOL_PACKETS.g:390:4: rule__Version__Group_1_1_1__0
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
    // InternalPROTOCOL_PACKETS.g:398:1: rule__INTEGER__Alternatives : ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) );
    public final void rule__INTEGER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:402:1: ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) )
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
                    // InternalPROTOCOL_PACKETS.g:403:2: ( ( rule__INTEGER__Group_0__0 ) )
                    {
                    // InternalPROTOCOL_PACKETS.g:403:2: ( ( rule__INTEGER__Group_0__0 ) )
                    // InternalPROTOCOL_PACKETS.g:404:3: ( rule__INTEGER__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getINTEGERAccess().getGroup_0()); 
                    }
                    // InternalPROTOCOL_PACKETS.g:405:3: ( rule__INTEGER__Group_0__0 )
                    // InternalPROTOCOL_PACKETS.g:405:4: rule__INTEGER__Group_0__0
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
                    // InternalPROTOCOL_PACKETS.g:409:2: ( RULE_HEXADECIMAL )
                    {
                    // InternalPROTOCOL_PACKETS.g:409:2: ( RULE_HEXADECIMAL )
                    // InternalPROTOCOL_PACKETS.g:410:3: RULE_HEXADECIMAL
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


    // $ANTLR start "rule__GSSModelFile__Group__0"
    // InternalPROTOCOL_PACKETS.g:419:1: rule__GSSModelFile__Group__0 : rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1 ;
    public final void rule__GSSModelFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:423:1: ( rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1 )
            // InternalPROTOCOL_PACKETS.g:424:2: rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1
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
    // InternalPROTOCOL_PACKETS.g:431:1: rule__GSSModelFile__Group__0__Impl : ( ( rule__GSSModelFile__ImportsAssignment_0 )* ) ;
    public final void rule__GSSModelFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:435:1: ( ( ( rule__GSSModelFile__ImportsAssignment_0 )* ) )
            // InternalPROTOCOL_PACKETS.g:436:1: ( ( rule__GSSModelFile__ImportsAssignment_0 )* )
            {
            // InternalPROTOCOL_PACKETS.g:436:1: ( ( rule__GSSModelFile__ImportsAssignment_0 )* )
            // InternalPROTOCOL_PACKETS.g:437:2: ( rule__GSSModelFile__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getImportsAssignment_0()); 
            }
            // InternalPROTOCOL_PACKETS.g:438:2: ( rule__GSSModelFile__ImportsAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==12) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPROTOCOL_PACKETS.g:438:3: rule__GSSModelFile__ImportsAssignment_0
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
    // InternalPROTOCOL_PACKETS.g:446:1: rule__GSSModelFile__Group__1 : rule__GSSModelFile__Group__1__Impl ;
    public final void rule__GSSModelFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:450:1: ( rule__GSSModelFile__Group__1__Impl )
            // InternalPROTOCOL_PACKETS.g:451:2: rule__GSSModelFile__Group__1__Impl
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
    // InternalPROTOCOL_PACKETS.g:457:1: rule__GSSModelFile__Group__1__Impl : ( ( rule__GSSModelFile__ElementAssignment_1 ) ) ;
    public final void rule__GSSModelFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:461:1: ( ( ( rule__GSSModelFile__ElementAssignment_1 ) ) )
            // InternalPROTOCOL_PACKETS.g:462:1: ( ( rule__GSSModelFile__ElementAssignment_1 ) )
            {
            // InternalPROTOCOL_PACKETS.g:462:1: ( ( rule__GSSModelFile__ElementAssignment_1 ) )
            // InternalPROTOCOL_PACKETS.g:463:2: ( rule__GSSModelFile__ElementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getElementAssignment_1()); 
            }
            // InternalPROTOCOL_PACKETS.g:464:2: ( rule__GSSModelFile__ElementAssignment_1 )
            // InternalPROTOCOL_PACKETS.g:464:3: rule__GSSModelFile__ElementAssignment_1
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
    // InternalPROTOCOL_PACKETS.g:473:1: rule__GSSModelFileImport__Group__0 : rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1 ;
    public final void rule__GSSModelFileImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:477:1: ( rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1 )
            // InternalPROTOCOL_PACKETS.g:478:2: rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1
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
    // InternalPROTOCOL_PACKETS.g:485:1: rule__GSSModelFileImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__GSSModelFileImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:489:1: ( ( 'import' ) )
            // InternalPROTOCOL_PACKETS.g:490:1: ( 'import' )
            {
            // InternalPROTOCOL_PACKETS.g:490:1: ( 'import' )
            // InternalPROTOCOL_PACKETS.g:491:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getImportKeyword_0()); 
            }
            match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPROTOCOL_PACKETS.g:500:1: rule__GSSModelFileImport__Group__1 : rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2 ;
    public final void rule__GSSModelFileImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:504:1: ( rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2 )
            // InternalPROTOCOL_PACKETS.g:505:2: rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2
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
    // InternalPROTOCOL_PACKETS.g:512:1: rule__GSSModelFileImport__Group__1__Impl : ( ':=' ) ;
    public final void rule__GSSModelFileImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:516:1: ( ( ':=' ) )
            // InternalPROTOCOL_PACKETS.g:517:1: ( ':=' )
            {
            // InternalPROTOCOL_PACKETS.g:517:1: ( ':=' )
            // InternalPROTOCOL_PACKETS.g:518:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPROTOCOL_PACKETS.g:527:1: rule__GSSModelFileImport__Group__2 : rule__GSSModelFileImport__Group__2__Impl rule__GSSModelFileImport__Group__3 ;
    public final void rule__GSSModelFileImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:531:1: ( rule__GSSModelFileImport__Group__2__Impl rule__GSSModelFileImport__Group__3 )
            // InternalPROTOCOL_PACKETS.g:532:2: rule__GSSModelFileImport__Group__2__Impl rule__GSSModelFileImport__Group__3
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
    // InternalPROTOCOL_PACKETS.g:539:1: rule__GSSModelFileImport__Group__2__Impl : ( ( rule__GSSModelFileImport__ImportURIAssignment_2 ) ) ;
    public final void rule__GSSModelFileImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:543:1: ( ( ( rule__GSSModelFileImport__ImportURIAssignment_2 ) ) )
            // InternalPROTOCOL_PACKETS.g:544:1: ( ( rule__GSSModelFileImport__ImportURIAssignment_2 ) )
            {
            // InternalPROTOCOL_PACKETS.g:544:1: ( ( rule__GSSModelFileImport__ImportURIAssignment_2 ) )
            // InternalPROTOCOL_PACKETS.g:545:2: ( rule__GSSModelFileImport__ImportURIAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getImportURIAssignment_2()); 
            }
            // InternalPROTOCOL_PACKETS.g:546:2: ( rule__GSSModelFileImport__ImportURIAssignment_2 )
            // InternalPROTOCOL_PACKETS.g:546:3: rule__GSSModelFileImport__ImportURIAssignment_2
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
    // InternalPROTOCOL_PACKETS.g:554:1: rule__GSSModelFileImport__Group__3 : rule__GSSModelFileImport__Group__3__Impl ;
    public final void rule__GSSModelFileImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:558:1: ( rule__GSSModelFileImport__Group__3__Impl )
            // InternalPROTOCOL_PACKETS.g:559:2: rule__GSSModelFileImport__Group__3__Impl
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
    // InternalPROTOCOL_PACKETS.g:565:1: rule__GSSModelFileImport__Group__3__Impl : ( ';' ) ;
    public final void rule__GSSModelFileImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:569:1: ( ( ';' ) )
            // InternalPROTOCOL_PACKETS.g:570:1: ( ';' )
            {
            // InternalPROTOCOL_PACKETS.g:570:1: ( ';' )
            // InternalPROTOCOL_PACKETS.g:571:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getSemicolonKeyword_3()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group__0"
    // InternalPROTOCOL_PACKETS.g:581:1: rule__GSSProtocolPacketsProtocolPackets__Group__0 : rule__GSSProtocolPacketsProtocolPackets__Group__0__Impl rule__GSSProtocolPacketsProtocolPackets__Group__1 ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:585:1: ( rule__GSSProtocolPacketsProtocolPackets__Group__0__Impl rule__GSSProtocolPacketsProtocolPackets__Group__1 )
            // InternalPROTOCOL_PACKETS.g:586:2: rule__GSSProtocolPacketsProtocolPackets__Group__0__Impl rule__GSSProtocolPacketsProtocolPackets__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSProtocolPacketsProtocolPackets__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPackets__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group__0"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group__0__Impl"
    // InternalPROTOCOL_PACKETS.g:593:1: rule__GSSProtocolPacketsProtocolPackets__Group__0__Impl : ( 'GSSProtocolPacketsProtocolPackets' ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:597:1: ( ( 'GSSProtocolPacketsProtocolPackets' ) )
            // InternalPROTOCOL_PACKETS.g:598:1: ( 'GSSProtocolPacketsProtocolPackets' )
            {
            // InternalPROTOCOL_PACKETS.g:598:1: ( 'GSSProtocolPacketsProtocolPackets' )
            // InternalPROTOCOL_PACKETS.g:599:2: 'GSSProtocolPacketsProtocolPackets'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getGSSProtocolPacketsProtocolPacketsKeyword_0()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getGSSProtocolPacketsProtocolPacketsKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group__0__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group__1"
    // InternalPROTOCOL_PACKETS.g:608:1: rule__GSSProtocolPacketsProtocolPackets__Group__1 : rule__GSSProtocolPacketsProtocolPackets__Group__1__Impl rule__GSSProtocolPacketsProtocolPackets__Group__2 ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:612:1: ( rule__GSSProtocolPacketsProtocolPackets__Group__1__Impl rule__GSSProtocolPacketsProtocolPackets__Group__2 )
            // InternalPROTOCOL_PACKETS.g:613:2: rule__GSSProtocolPacketsProtocolPackets__Group__1__Impl rule__GSSProtocolPacketsProtocolPackets__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSProtocolPacketsProtocolPackets__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPackets__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group__1"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group__1__Impl"
    // InternalPROTOCOL_PACKETS.g:620:1: rule__GSSProtocolPacketsProtocolPackets__Group__1__Impl : ( ( rule__GSSProtocolPacketsProtocolPackets__NameAssignment_1 ) ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:624:1: ( ( ( rule__GSSProtocolPacketsProtocolPackets__NameAssignment_1 ) ) )
            // InternalPROTOCOL_PACKETS.g:625:1: ( ( rule__GSSProtocolPacketsProtocolPackets__NameAssignment_1 ) )
            {
            // InternalPROTOCOL_PACKETS.g:625:1: ( ( rule__GSSProtocolPacketsProtocolPackets__NameAssignment_1 ) )
            // InternalPROTOCOL_PACKETS.g:626:2: ( rule__GSSProtocolPacketsProtocolPackets__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getNameAssignment_1()); 
            }
            // InternalPROTOCOL_PACKETS.g:627:2: ( rule__GSSProtocolPacketsProtocolPackets__NameAssignment_1 )
            // InternalPROTOCOL_PACKETS.g:627:3: rule__GSSProtocolPacketsProtocolPackets__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPackets__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group__1__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group__2"
    // InternalPROTOCOL_PACKETS.g:635:1: rule__GSSProtocolPacketsProtocolPackets__Group__2 : rule__GSSProtocolPacketsProtocolPackets__Group__2__Impl rule__GSSProtocolPacketsProtocolPackets__Group__3 ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:639:1: ( rule__GSSProtocolPacketsProtocolPackets__Group__2__Impl rule__GSSProtocolPacketsProtocolPackets__Group__3 )
            // InternalPROTOCOL_PACKETS.g:640:2: rule__GSSProtocolPacketsProtocolPackets__Group__2__Impl rule__GSSProtocolPacketsProtocolPackets__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSProtocolPacketsProtocolPackets__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPackets__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group__2"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group__2__Impl"
    // InternalPROTOCOL_PACKETS.g:647:1: rule__GSSProtocolPacketsProtocolPackets__Group__2__Impl : ( '{' ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:651:1: ( ( '{' ) )
            // InternalPROTOCOL_PACKETS.g:652:1: ( '{' )
            {
            // InternalPROTOCOL_PACKETS.g:652:1: ( '{' )
            // InternalPROTOCOL_PACKETS.g:653:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group__2__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group__3"
    // InternalPROTOCOL_PACKETS.g:662:1: rule__GSSProtocolPacketsProtocolPackets__Group__3 : rule__GSSProtocolPacketsProtocolPackets__Group__3__Impl rule__GSSProtocolPacketsProtocolPackets__Group__4 ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:666:1: ( rule__GSSProtocolPacketsProtocolPackets__Group__3__Impl rule__GSSProtocolPacketsProtocolPackets__Group__4 )
            // InternalPROTOCOL_PACKETS.g:667:2: rule__GSSProtocolPacketsProtocolPackets__Group__3__Impl rule__GSSProtocolPacketsProtocolPackets__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSProtocolPacketsProtocolPackets__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPackets__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group__3"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group__3__Impl"
    // InternalPROTOCOL_PACKETS.g:674:1: rule__GSSProtocolPacketsProtocolPackets__Group__3__Impl : ( ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3 ) ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:678:1: ( ( ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3 ) ) )
            // InternalPROTOCOL_PACKETS.g:679:1: ( ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3 ) )
            {
            // InternalPROTOCOL_PACKETS.g:679:1: ( ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3 ) )
            // InternalPROTOCOL_PACKETS.g:680:2: ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3()); 
            }
            // InternalPROTOCOL_PACKETS.g:681:2: ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3 )
            // InternalPROTOCOL_PACKETS.g:681:3: rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group__3__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group__4"
    // InternalPROTOCOL_PACKETS.g:689:1: rule__GSSProtocolPacketsProtocolPackets__Group__4 : rule__GSSProtocolPacketsProtocolPackets__Group__4__Impl rule__GSSProtocolPacketsProtocolPackets__Group__5 ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:693:1: ( rule__GSSProtocolPacketsProtocolPackets__Group__4__Impl rule__GSSProtocolPacketsProtocolPackets__Group__5 )
            // InternalPROTOCOL_PACKETS.g:694:2: rule__GSSProtocolPacketsProtocolPackets__Group__4__Impl rule__GSSProtocolPacketsProtocolPackets__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSProtocolPacketsProtocolPackets__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPackets__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group__4"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group__4__Impl"
    // InternalPROTOCOL_PACKETS.g:701:1: rule__GSSProtocolPacketsProtocolPackets__Group__4__Impl : ( ( ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 ) ) ( ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 )* ) ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:705:1: ( ( ( ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 ) ) ( ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 )* ) ) )
            // InternalPROTOCOL_PACKETS.g:706:1: ( ( ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 ) ) ( ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 )* ) )
            {
            // InternalPROTOCOL_PACKETS.g:706:1: ( ( ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 ) ) ( ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 )* ) )
            // InternalPROTOCOL_PACKETS.g:707:2: ( ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 ) ) ( ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 )* )
            {
            // InternalPROTOCOL_PACKETS.g:707:2: ( ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 ) )
            // InternalPROTOCOL_PACKETS.g:708:3: ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getProtocolPacketAssignment_4()); 
            }
            // InternalPROTOCOL_PACKETS.g:709:3: ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 )
            // InternalPROTOCOL_PACKETS.g:709:4: rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getProtocolPacketAssignment_4()); 
            }

            }

            // InternalPROTOCOL_PACKETS.g:712:2: ( ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 )* )
            // InternalPROTOCOL_PACKETS.g:713:3: ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getProtocolPacketAssignment_4()); 
            }
            // InternalPROTOCOL_PACKETS.g:714:3: ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPROTOCOL_PACKETS.g:714:4: rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getProtocolPacketAssignment_4()); 
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
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group__4__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group__5"
    // InternalPROTOCOL_PACKETS.g:723:1: rule__GSSProtocolPacketsProtocolPackets__Group__5 : rule__GSSProtocolPacketsProtocolPackets__Group__5__Impl rule__GSSProtocolPacketsProtocolPackets__Group__6 ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:727:1: ( rule__GSSProtocolPacketsProtocolPackets__Group__5__Impl rule__GSSProtocolPacketsProtocolPackets__Group__6 )
            // InternalPROTOCOL_PACKETS.g:728:2: rule__GSSProtocolPacketsProtocolPackets__Group__5__Impl rule__GSSProtocolPacketsProtocolPackets__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSProtocolPacketsProtocolPackets__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPackets__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group__5"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group__5__Impl"
    // InternalPROTOCOL_PACKETS.g:735:1: rule__GSSProtocolPacketsProtocolPackets__Group__5__Impl : ( '}' ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:739:1: ( ( '}' ) )
            // InternalPROTOCOL_PACKETS.g:740:1: ( '}' )
            {
            // InternalPROTOCOL_PACKETS.g:740:1: ( '}' )
            // InternalPROTOCOL_PACKETS.g:741:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group__5__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group__6"
    // InternalPROTOCOL_PACKETS.g:750:1: rule__GSSProtocolPacketsProtocolPackets__Group__6 : rule__GSSProtocolPacketsProtocolPackets__Group__6__Impl ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:754:1: ( rule__GSSProtocolPacketsProtocolPackets__Group__6__Impl )
            // InternalPROTOCOL_PACKETS.g:755:2: rule__GSSProtocolPacketsProtocolPackets__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPackets__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group__6"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group__6__Impl"
    // InternalPROTOCOL_PACKETS.g:761:1: rule__GSSProtocolPacketsProtocolPackets__Group__6__Impl : ( ';' ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:765:1: ( ( ';' ) )
            // InternalPROTOCOL_PACKETS.g:766:1: ( ';' )
            {
            // InternalPROTOCOL_PACKETS.g:766:1: ( ';' )
            // InternalPROTOCOL_PACKETS.g:767:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getSemicolonKeyword_6()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getSemicolonKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group__6__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0"
    // InternalPROTOCOL_PACKETS.g:777:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 : rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1 ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:781:1: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1 )
            // InternalPROTOCOL_PACKETS.g:782:2: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0__Impl"
    // InternalPROTOCOL_PACKETS.g:789:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0__Impl : ( 'uri' ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:793:1: ( ( 'uri' ) )
            // InternalPROTOCOL_PACKETS.g:794:1: ( 'uri' )
            {
            // InternalPROTOCOL_PACKETS.g:794:1: ( 'uri' )
            // InternalPROTOCOL_PACKETS.g:795:2: 'uri'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUriKeyword_3_0_0()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUriKeyword_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1"
    // InternalPROTOCOL_PACKETS.g:804:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1 : rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2 ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:808:1: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2 )
            // InternalPROTOCOL_PACKETS.g:809:2: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1__Impl"
    // InternalPROTOCOL_PACKETS.g:816:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1__Impl : ( ':=' ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:820:1: ( ( ':=' ) )
            // InternalPROTOCOL_PACKETS.g:821:1: ( ':=' )
            {
            // InternalPROTOCOL_PACKETS.g:821:1: ( ':=' )
            // InternalPROTOCOL_PACKETS.g:822:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getColonEqualsSignKeyword_3_0_1()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getColonEqualsSignKeyword_3_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2"
    // InternalPROTOCOL_PACKETS.g:831:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2 : rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3 ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:835:1: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3 )
            // InternalPROTOCOL_PACKETS.g:836:2: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2__Impl"
    // InternalPROTOCOL_PACKETS.g:843:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2__Impl : ( ( rule__GSSProtocolPacketsProtocolPackets__UriAssignment_3_0_2 ) ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:847:1: ( ( ( rule__GSSProtocolPacketsProtocolPackets__UriAssignment_3_0_2 ) ) )
            // InternalPROTOCOL_PACKETS.g:848:1: ( ( rule__GSSProtocolPacketsProtocolPackets__UriAssignment_3_0_2 ) )
            {
            // InternalPROTOCOL_PACKETS.g:848:1: ( ( rule__GSSProtocolPacketsProtocolPackets__UriAssignment_3_0_2 ) )
            // InternalPROTOCOL_PACKETS.g:849:2: ( rule__GSSProtocolPacketsProtocolPackets__UriAssignment_3_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUriAssignment_3_0_2()); 
            }
            // InternalPROTOCOL_PACKETS.g:850:2: ( rule__GSSProtocolPacketsProtocolPackets__UriAssignment_3_0_2 )
            // InternalPROTOCOL_PACKETS.g:850:3: rule__GSSProtocolPacketsProtocolPackets__UriAssignment_3_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPackets__UriAssignment_3_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUriAssignment_3_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3"
    // InternalPROTOCOL_PACKETS.g:858:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3 : rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3__Impl ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:862:1: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3__Impl )
            // InternalPROTOCOL_PACKETS.g:863:2: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3__Impl"
    // InternalPROTOCOL_PACKETS.g:869:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3__Impl : ( ';' ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:873:1: ( ( ';' ) )
            // InternalPROTOCOL_PACKETS.g:874:1: ( ';' )
            {
            // InternalPROTOCOL_PACKETS.g:874:1: ( ';' )
            // InternalPROTOCOL_PACKETS.g:875:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getSemicolonKeyword_3_0_3()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getSemicolonKeyword_3_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0"
    // InternalPROTOCOL_PACKETS.g:885:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0 : rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1 ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:889:1: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1 )
            // InternalPROTOCOL_PACKETS.g:890:2: rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0__Impl"
    // InternalPROTOCOL_PACKETS.g:897:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0__Impl : ( 'version' ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:901:1: ( ( 'version' ) )
            // InternalPROTOCOL_PACKETS.g:902:1: ( 'version' )
            {
            // InternalPROTOCOL_PACKETS.g:902:1: ( 'version' )
            // InternalPROTOCOL_PACKETS.g:903:2: 'version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getVersionKeyword_3_1_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getVersionKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1"
    // InternalPROTOCOL_PACKETS.g:912:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1 : rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2 ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:916:1: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2 )
            // InternalPROTOCOL_PACKETS.g:917:2: rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1__Impl"
    // InternalPROTOCOL_PACKETS.g:924:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1__Impl : ( ':=' ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:928:1: ( ( ':=' ) )
            // InternalPROTOCOL_PACKETS.g:929:1: ( ':=' )
            {
            // InternalPROTOCOL_PACKETS.g:929:1: ( ':=' )
            // InternalPROTOCOL_PACKETS.g:930:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getColonEqualsSignKeyword_3_1_1()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getColonEqualsSignKeyword_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2"
    // InternalPROTOCOL_PACKETS.g:939:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2 : rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3 ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:943:1: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3 )
            // InternalPROTOCOL_PACKETS.g:944:2: rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2__Impl"
    // InternalPROTOCOL_PACKETS.g:951:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2__Impl : ( ( rule__GSSProtocolPacketsProtocolPackets__VersionAssignment_3_1_2 ) ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:955:1: ( ( ( rule__GSSProtocolPacketsProtocolPackets__VersionAssignment_3_1_2 ) ) )
            // InternalPROTOCOL_PACKETS.g:956:1: ( ( rule__GSSProtocolPacketsProtocolPackets__VersionAssignment_3_1_2 ) )
            {
            // InternalPROTOCOL_PACKETS.g:956:1: ( ( rule__GSSProtocolPacketsProtocolPackets__VersionAssignment_3_1_2 ) )
            // InternalPROTOCOL_PACKETS.g:957:2: ( rule__GSSProtocolPacketsProtocolPackets__VersionAssignment_3_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getVersionAssignment_3_1_2()); 
            }
            // InternalPROTOCOL_PACKETS.g:958:2: ( rule__GSSProtocolPacketsProtocolPackets__VersionAssignment_3_1_2 )
            // InternalPROTOCOL_PACKETS.g:958:3: rule__GSSProtocolPacketsProtocolPackets__VersionAssignment_3_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPackets__VersionAssignment_3_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getVersionAssignment_3_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3"
    // InternalPROTOCOL_PACKETS.g:966:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3 : rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3__Impl ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:970:1: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3__Impl )
            // InternalPROTOCOL_PACKETS.g:971:2: rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3__Impl"
    // InternalPROTOCOL_PACKETS.g:977:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3__Impl : ( ';' ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:981:1: ( ( ';' ) )
            // InternalPROTOCOL_PACKETS.g:982:1: ( ';' )
            {
            // InternalPROTOCOL_PACKETS.g:982:1: ( ';' )
            // InternalPROTOCOL_PACKETS.g:983:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getSemicolonKeyword_3_1_3()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getSemicolonKeyword_3_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__0"
    // InternalPROTOCOL_PACKETS.g:993:1: rule__GSSProtocolPacketsProtocolPacket__Group__0 : rule__GSSProtocolPacketsProtocolPacket__Group__0__Impl rule__GSSProtocolPacketsProtocolPacket__Group__1 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:997:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__0__Impl rule__GSSProtocolPacketsProtocolPacket__Group__1 )
            // InternalPROTOCOL_PACKETS.g:998:2: rule__GSSProtocolPacketsProtocolPacket__Group__0__Impl rule__GSSProtocolPacketsProtocolPacket__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSProtocolPacketsProtocolPacket__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__0"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__0__Impl"
    // InternalPROTOCOL_PACKETS.g:1005:1: rule__GSSProtocolPacketsProtocolPacket__Group__0__Impl : ( 'GSSProtocolPacketsProtocolPacket' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1009:1: ( ( 'GSSProtocolPacketsProtocolPacket' ) )
            // InternalPROTOCOL_PACKETS.g:1010:1: ( 'GSSProtocolPacketsProtocolPacket' )
            {
            // InternalPROTOCOL_PACKETS.g:1010:1: ( 'GSSProtocolPacketsProtocolPacket' )
            // InternalPROTOCOL_PACKETS.g:1011:2: 'GSSProtocolPacketsProtocolPacket'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getGSSProtocolPacketsProtocolPacketKeyword_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getGSSProtocolPacketsProtocolPacketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__0__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__1"
    // InternalPROTOCOL_PACKETS.g:1020:1: rule__GSSProtocolPacketsProtocolPacket__Group__1 : rule__GSSProtocolPacketsProtocolPacket__Group__1__Impl rule__GSSProtocolPacketsProtocolPacket__Group__2 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1024:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__1__Impl rule__GSSProtocolPacketsProtocolPacket__Group__2 )
            // InternalPROTOCOL_PACKETS.g:1025:2: rule__GSSProtocolPacketsProtocolPacket__Group__1__Impl rule__GSSProtocolPacketsProtocolPacket__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__GSSProtocolPacketsProtocolPacket__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__1"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__1__Impl"
    // InternalPROTOCOL_PACKETS.g:1032:1: rule__GSSProtocolPacketsProtocolPacket__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1036:1: ( ( '{' ) )
            // InternalPROTOCOL_PACKETS.g:1037:1: ( '{' )
            {
            // InternalPROTOCOL_PACKETS.g:1037:1: ( '{' )
            // InternalPROTOCOL_PACKETS.g:1038:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__1__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__2"
    // InternalPROTOCOL_PACKETS.g:1047:1: rule__GSSProtocolPacketsProtocolPacket__Group__2 : rule__GSSProtocolPacketsProtocolPacket__Group__2__Impl rule__GSSProtocolPacketsProtocolPacket__Group__3 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1051:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__2__Impl rule__GSSProtocolPacketsProtocolPacket__Group__3 )
            // InternalPROTOCOL_PACKETS.g:1052:2: rule__GSSProtocolPacketsProtocolPacket__Group__2__Impl rule__GSSProtocolPacketsProtocolPacket__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSProtocolPacketsProtocolPacket__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__2"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__2__Impl"
    // InternalPROTOCOL_PACKETS.g:1059:1: rule__GSSProtocolPacketsProtocolPacket__Group__2__Impl : ( 'name' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1063:1: ( ( 'name' ) )
            // InternalPROTOCOL_PACKETS.g:1064:1: ( 'name' )
            {
            // InternalPROTOCOL_PACKETS.g:1064:1: ( 'name' )
            // InternalPROTOCOL_PACKETS.g:1065:2: 'name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getNameKeyword_2()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getNameKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__2__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__3"
    // InternalPROTOCOL_PACKETS.g:1074:1: rule__GSSProtocolPacketsProtocolPacket__Group__3 : rule__GSSProtocolPacketsProtocolPacket__Group__3__Impl rule__GSSProtocolPacketsProtocolPacket__Group__4 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1078:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__3__Impl rule__GSSProtocolPacketsProtocolPacket__Group__4 )
            // InternalPROTOCOL_PACKETS.g:1079:2: rule__GSSProtocolPacketsProtocolPacket__Group__3__Impl rule__GSSProtocolPacketsProtocolPacket__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__GSSProtocolPacketsProtocolPacket__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__3"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__3__Impl"
    // InternalPROTOCOL_PACKETS.g:1086:1: rule__GSSProtocolPacketsProtocolPacket__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1090:1: ( ( ':=' ) )
            // InternalPROTOCOL_PACKETS.g:1091:1: ( ':=' )
            {
            // InternalPROTOCOL_PACKETS.g:1091:1: ( ':=' )
            // InternalPROTOCOL_PACKETS.g:1092:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__3__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__4"
    // InternalPROTOCOL_PACKETS.g:1101:1: rule__GSSProtocolPacketsProtocolPacket__Group__4 : rule__GSSProtocolPacketsProtocolPacket__Group__4__Impl rule__GSSProtocolPacketsProtocolPacket__Group__5 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1105:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__4__Impl rule__GSSProtocolPacketsProtocolPacket__Group__5 )
            // InternalPROTOCOL_PACKETS.g:1106:2: rule__GSSProtocolPacketsProtocolPacket__Group__4__Impl rule__GSSProtocolPacketsProtocolPacket__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSProtocolPacketsProtocolPacket__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__4"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__4__Impl"
    // InternalPROTOCOL_PACKETS.g:1113:1: rule__GSSProtocolPacketsProtocolPacket__Group__4__Impl : ( ( rule__GSSProtocolPacketsProtocolPacket__NameAssignment_4 ) ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1117:1: ( ( ( rule__GSSProtocolPacketsProtocolPacket__NameAssignment_4 ) ) )
            // InternalPROTOCOL_PACKETS.g:1118:1: ( ( rule__GSSProtocolPacketsProtocolPacket__NameAssignment_4 ) )
            {
            // InternalPROTOCOL_PACKETS.g:1118:1: ( ( rule__GSSProtocolPacketsProtocolPacket__NameAssignment_4 ) )
            // InternalPROTOCOL_PACKETS.g:1119:2: ( rule__GSSProtocolPacketsProtocolPacket__NameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getNameAssignment_4()); 
            }
            // InternalPROTOCOL_PACKETS.g:1120:2: ( rule__GSSProtocolPacketsProtocolPacket__NameAssignment_4 )
            // InternalPROTOCOL_PACKETS.g:1120:3: rule__GSSProtocolPacketsProtocolPacket__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__NameAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getNameAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__4__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__5"
    // InternalPROTOCOL_PACKETS.g:1128:1: rule__GSSProtocolPacketsProtocolPacket__Group__5 : rule__GSSProtocolPacketsProtocolPacket__Group__5__Impl rule__GSSProtocolPacketsProtocolPacket__Group__6 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1132:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__5__Impl rule__GSSProtocolPacketsProtocolPacket__Group__6 )
            // InternalPROTOCOL_PACKETS.g:1133:2: rule__GSSProtocolPacketsProtocolPacket__Group__5__Impl rule__GSSProtocolPacketsProtocolPacket__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSProtocolPacketsProtocolPacket__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__5"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__5__Impl"
    // InternalPROTOCOL_PACKETS.g:1140:1: rule__GSSProtocolPacketsProtocolPacket__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1144:1: ( ( ';' ) )
            // InternalPROTOCOL_PACKETS.g:1145:1: ( ';' )
            {
            // InternalPROTOCOL_PACKETS.g:1145:1: ( ';' )
            // InternalPROTOCOL_PACKETS.g:1146:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_5()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__5__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__6"
    // InternalPROTOCOL_PACKETS.g:1155:1: rule__GSSProtocolPacketsProtocolPacket__Group__6 : rule__GSSProtocolPacketsProtocolPacket__Group__6__Impl rule__GSSProtocolPacketsProtocolPacket__Group__7 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1159:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__6__Impl rule__GSSProtocolPacketsProtocolPacket__Group__7 )
            // InternalPROTOCOL_PACKETS.g:1160:2: rule__GSSProtocolPacketsProtocolPacket__Group__6__Impl rule__GSSProtocolPacketsProtocolPacket__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSProtocolPacketsProtocolPacket__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__6"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__6__Impl"
    // InternalPROTOCOL_PACKETS.g:1167:1: rule__GSSProtocolPacketsProtocolPacket__Group__6__Impl : ( 'ifRef' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1171:1: ( ( 'ifRef' ) )
            // InternalPROTOCOL_PACKETS.g:1172:1: ( 'ifRef' )
            {
            // InternalPROTOCOL_PACKETS.g:1172:1: ( 'ifRef' )
            // InternalPROTOCOL_PACKETS.g:1173:2: 'ifRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getIfRefKeyword_6()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getIfRefKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__6__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__7"
    // InternalPROTOCOL_PACKETS.g:1182:1: rule__GSSProtocolPacketsProtocolPacket__Group__7 : rule__GSSProtocolPacketsProtocolPacket__Group__7__Impl rule__GSSProtocolPacketsProtocolPacket__Group__8 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1186:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__7__Impl rule__GSSProtocolPacketsProtocolPacket__Group__8 )
            // InternalPROTOCOL_PACKETS.g:1187:2: rule__GSSProtocolPacketsProtocolPacket__Group__7__Impl rule__GSSProtocolPacketsProtocolPacket__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__GSSProtocolPacketsProtocolPacket__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__7"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__7__Impl"
    // InternalPROTOCOL_PACKETS.g:1194:1: rule__GSSProtocolPacketsProtocolPacket__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1198:1: ( ( ':=' ) )
            // InternalPROTOCOL_PACKETS.g:1199:1: ( ':=' )
            {
            // InternalPROTOCOL_PACKETS.g:1199:1: ( ':=' )
            // InternalPROTOCOL_PACKETS.g:1200:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__7__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__8"
    // InternalPROTOCOL_PACKETS.g:1209:1: rule__GSSProtocolPacketsProtocolPacket__Group__8 : rule__GSSProtocolPacketsProtocolPacket__Group__8__Impl rule__GSSProtocolPacketsProtocolPacket__Group__9 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1213:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__8__Impl rule__GSSProtocolPacketsProtocolPacket__Group__9 )
            // InternalPROTOCOL_PACKETS.g:1214:2: rule__GSSProtocolPacketsProtocolPacket__Group__8__Impl rule__GSSProtocolPacketsProtocolPacket__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSProtocolPacketsProtocolPacket__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__8"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__8__Impl"
    // InternalPROTOCOL_PACKETS.g:1221:1: rule__GSSProtocolPacketsProtocolPacket__Group__8__Impl : ( ( rule__GSSProtocolPacketsProtocolPacket__IfRefAssignment_8 ) ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1225:1: ( ( ( rule__GSSProtocolPacketsProtocolPacket__IfRefAssignment_8 ) ) )
            // InternalPROTOCOL_PACKETS.g:1226:1: ( ( rule__GSSProtocolPacketsProtocolPacket__IfRefAssignment_8 ) )
            {
            // InternalPROTOCOL_PACKETS.g:1226:1: ( ( rule__GSSProtocolPacketsProtocolPacket__IfRefAssignment_8 ) )
            // InternalPROTOCOL_PACKETS.g:1227:2: ( rule__GSSProtocolPacketsProtocolPacket__IfRefAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getIfRefAssignment_8()); 
            }
            // InternalPROTOCOL_PACKETS.g:1228:2: ( rule__GSSProtocolPacketsProtocolPacket__IfRefAssignment_8 )
            // InternalPROTOCOL_PACKETS.g:1228:3: rule__GSSProtocolPacketsProtocolPacket__IfRefAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__IfRefAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getIfRefAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__8__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__9"
    // InternalPROTOCOL_PACKETS.g:1236:1: rule__GSSProtocolPacketsProtocolPacket__Group__9 : rule__GSSProtocolPacketsProtocolPacket__Group__9__Impl rule__GSSProtocolPacketsProtocolPacket__Group__10 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1240:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__9__Impl rule__GSSProtocolPacketsProtocolPacket__Group__10 )
            // InternalPROTOCOL_PACKETS.g:1241:2: rule__GSSProtocolPacketsProtocolPacket__Group__9__Impl rule__GSSProtocolPacketsProtocolPacket__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__GSSProtocolPacketsProtocolPacket__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__9"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__9__Impl"
    // InternalPROTOCOL_PACKETS.g:1248:1: rule__GSSProtocolPacketsProtocolPacket__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1252:1: ( ( ';' ) )
            // InternalPROTOCOL_PACKETS.g:1253:1: ( ';' )
            {
            // InternalPROTOCOL_PACKETS.g:1253:1: ( ';' )
            // InternalPROTOCOL_PACKETS.g:1254:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_9()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__9__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__10"
    // InternalPROTOCOL_PACKETS.g:1263:1: rule__GSSProtocolPacketsProtocolPacket__Group__10 : rule__GSSProtocolPacketsProtocolPacket__Group__10__Impl rule__GSSProtocolPacketsProtocolPacket__Group__11 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1267:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__10__Impl rule__GSSProtocolPacketsProtocolPacket__Group__11 )
            // InternalPROTOCOL_PACKETS.g:1268:2: rule__GSSProtocolPacketsProtocolPacket__Group__10__Impl rule__GSSProtocolPacketsProtocolPacket__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSProtocolPacketsProtocolPacket__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__10"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__10__Impl"
    // InternalPROTOCOL_PACKETS.g:1275:1: rule__GSSProtocolPacketsProtocolPacket__Group__10__Impl : ( 'levelRef' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1279:1: ( ( 'levelRef' ) )
            // InternalPROTOCOL_PACKETS.g:1280:1: ( 'levelRef' )
            {
            // InternalPROTOCOL_PACKETS.g:1280:1: ( 'levelRef' )
            // InternalPROTOCOL_PACKETS.g:1281:2: 'levelRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getLevelRefKeyword_10()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getLevelRefKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__10__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__11"
    // InternalPROTOCOL_PACKETS.g:1290:1: rule__GSSProtocolPacketsProtocolPacket__Group__11 : rule__GSSProtocolPacketsProtocolPacket__Group__11__Impl rule__GSSProtocolPacketsProtocolPacket__Group__12 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1294:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__11__Impl rule__GSSProtocolPacketsProtocolPacket__Group__12 )
            // InternalPROTOCOL_PACKETS.g:1295:2: rule__GSSProtocolPacketsProtocolPacket__Group__11__Impl rule__GSSProtocolPacketsProtocolPacket__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__GSSProtocolPacketsProtocolPacket__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__11"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__11__Impl"
    // InternalPROTOCOL_PACKETS.g:1302:1: rule__GSSProtocolPacketsProtocolPacket__Group__11__Impl : ( ':=' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1306:1: ( ( ':=' ) )
            // InternalPROTOCOL_PACKETS.g:1307:1: ( ':=' )
            {
            // InternalPROTOCOL_PACKETS.g:1307:1: ( ':=' )
            // InternalPROTOCOL_PACKETS.g:1308:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_11()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__11__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__12"
    // InternalPROTOCOL_PACKETS.g:1317:1: rule__GSSProtocolPacketsProtocolPacket__Group__12 : rule__GSSProtocolPacketsProtocolPacket__Group__12__Impl rule__GSSProtocolPacketsProtocolPacket__Group__13 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1321:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__12__Impl rule__GSSProtocolPacketsProtocolPacket__Group__13 )
            // InternalPROTOCOL_PACKETS.g:1322:2: rule__GSSProtocolPacketsProtocolPacket__Group__12__Impl rule__GSSProtocolPacketsProtocolPacket__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSProtocolPacketsProtocolPacket__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__12"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__12__Impl"
    // InternalPROTOCOL_PACKETS.g:1329:1: rule__GSSProtocolPacketsProtocolPacket__Group__12__Impl : ( ( rule__GSSProtocolPacketsProtocolPacket__LevelRefAssignment_12 ) ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1333:1: ( ( ( rule__GSSProtocolPacketsProtocolPacket__LevelRefAssignment_12 ) ) )
            // InternalPROTOCOL_PACKETS.g:1334:1: ( ( rule__GSSProtocolPacketsProtocolPacket__LevelRefAssignment_12 ) )
            {
            // InternalPROTOCOL_PACKETS.g:1334:1: ( ( rule__GSSProtocolPacketsProtocolPacket__LevelRefAssignment_12 ) )
            // InternalPROTOCOL_PACKETS.g:1335:2: ( rule__GSSProtocolPacketsProtocolPacket__LevelRefAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getLevelRefAssignment_12()); 
            }
            // InternalPROTOCOL_PACKETS.g:1336:2: ( rule__GSSProtocolPacketsProtocolPacket__LevelRefAssignment_12 )
            // InternalPROTOCOL_PACKETS.g:1336:3: rule__GSSProtocolPacketsProtocolPacket__LevelRefAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__LevelRefAssignment_12();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getLevelRefAssignment_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__12__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__13"
    // InternalPROTOCOL_PACKETS.g:1344:1: rule__GSSProtocolPacketsProtocolPacket__Group__13 : rule__GSSProtocolPacketsProtocolPacket__Group__13__Impl rule__GSSProtocolPacketsProtocolPacket__Group__14 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1348:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__13__Impl rule__GSSProtocolPacketsProtocolPacket__Group__14 )
            // InternalPROTOCOL_PACKETS.g:1349:2: rule__GSSProtocolPacketsProtocolPacket__Group__13__Impl rule__GSSProtocolPacketsProtocolPacket__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__GSSProtocolPacketsProtocolPacket__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__13"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__13__Impl"
    // InternalPROTOCOL_PACKETS.g:1356:1: rule__GSSProtocolPacketsProtocolPacket__Group__13__Impl : ( ';' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1360:1: ( ( ';' ) )
            // InternalPROTOCOL_PACKETS.g:1361:1: ( ';' )
            {
            // InternalPROTOCOL_PACKETS.g:1361:1: ( ';' )
            // InternalPROTOCOL_PACKETS.g:1362:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_13()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__13__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__14"
    // InternalPROTOCOL_PACKETS.g:1371:1: rule__GSSProtocolPacketsProtocolPacket__Group__14 : rule__GSSProtocolPacketsProtocolPacket__Group__14__Impl rule__GSSProtocolPacketsProtocolPacket__Group__15 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1375:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__14__Impl rule__GSSProtocolPacketsProtocolPacket__Group__15 )
            // InternalPROTOCOL_PACKETS.g:1376:2: rule__GSSProtocolPacketsProtocolPacket__Group__14__Impl rule__GSSProtocolPacketsProtocolPacket__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSProtocolPacketsProtocolPacket__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__Group__15();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__14"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__14__Impl"
    // InternalPROTOCOL_PACKETS.g:1383:1: rule__GSSProtocolPacketsProtocolPacket__Group__14__Impl : ( 'export' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1387:1: ( ( 'export' ) )
            // InternalPROTOCOL_PACKETS.g:1388:1: ( 'export' )
            {
            // InternalPROTOCOL_PACKETS.g:1388:1: ( 'export' )
            // InternalPROTOCOL_PACKETS.g:1389:2: 'export'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getExportKeyword_14()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getExportKeyword_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__14__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__15"
    // InternalPROTOCOL_PACKETS.g:1398:1: rule__GSSProtocolPacketsProtocolPacket__Group__15 : rule__GSSProtocolPacketsProtocolPacket__Group__15__Impl rule__GSSProtocolPacketsProtocolPacket__Group__16 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1402:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__15__Impl rule__GSSProtocolPacketsProtocolPacket__Group__16 )
            // InternalPROTOCOL_PACKETS.g:1403:2: rule__GSSProtocolPacketsProtocolPacket__Group__15__Impl rule__GSSProtocolPacketsProtocolPacket__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__GSSProtocolPacketsProtocolPacket__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__Group__16();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__15"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__15__Impl"
    // InternalPROTOCOL_PACKETS.g:1410:1: rule__GSSProtocolPacketsProtocolPacket__Group__15__Impl : ( ':=' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1414:1: ( ( ':=' ) )
            // InternalPROTOCOL_PACKETS.g:1415:1: ( ':=' )
            {
            // InternalPROTOCOL_PACKETS.g:1415:1: ( ':=' )
            // InternalPROTOCOL_PACKETS.g:1416:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_15()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_15()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__15__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__16"
    // InternalPROTOCOL_PACKETS.g:1425:1: rule__GSSProtocolPacketsProtocolPacket__Group__16 : rule__GSSProtocolPacketsProtocolPacket__Group__16__Impl rule__GSSProtocolPacketsProtocolPacket__Group__17 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1429:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__16__Impl rule__GSSProtocolPacketsProtocolPacket__Group__17 )
            // InternalPROTOCOL_PACKETS.g:1430:2: rule__GSSProtocolPacketsProtocolPacket__Group__16__Impl rule__GSSProtocolPacketsProtocolPacket__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSProtocolPacketsProtocolPacket__Group__16__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__Group__17();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__16"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__16__Impl"
    // InternalPROTOCOL_PACKETS.g:1437:1: rule__GSSProtocolPacketsProtocolPacket__Group__16__Impl : ( ( rule__GSSProtocolPacketsProtocolPacket__ExportAssignment_16 ) ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1441:1: ( ( ( rule__GSSProtocolPacketsProtocolPacket__ExportAssignment_16 ) ) )
            // InternalPROTOCOL_PACKETS.g:1442:1: ( ( rule__GSSProtocolPacketsProtocolPacket__ExportAssignment_16 ) )
            {
            // InternalPROTOCOL_PACKETS.g:1442:1: ( ( rule__GSSProtocolPacketsProtocolPacket__ExportAssignment_16 ) )
            // InternalPROTOCOL_PACKETS.g:1443:2: ( rule__GSSProtocolPacketsProtocolPacket__ExportAssignment_16 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getExportAssignment_16()); 
            }
            // InternalPROTOCOL_PACKETS.g:1444:2: ( rule__GSSProtocolPacketsProtocolPacket__ExportAssignment_16 )
            // InternalPROTOCOL_PACKETS.g:1444:3: rule__GSSProtocolPacketsProtocolPacket__ExportAssignment_16
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__ExportAssignment_16();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getExportAssignment_16()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__16__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__17"
    // InternalPROTOCOL_PACKETS.g:1452:1: rule__GSSProtocolPacketsProtocolPacket__Group__17 : rule__GSSProtocolPacketsProtocolPacket__Group__17__Impl rule__GSSProtocolPacketsProtocolPacket__Group__18 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1456:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__17__Impl rule__GSSProtocolPacketsProtocolPacket__Group__18 )
            // InternalPROTOCOL_PACKETS.g:1457:2: rule__GSSProtocolPacketsProtocolPacket__Group__17__Impl rule__GSSProtocolPacketsProtocolPacket__Group__18
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__GSSProtocolPacketsProtocolPacket__Group__17__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__Group__18();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__17"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__17__Impl"
    // InternalPROTOCOL_PACKETS.g:1464:1: rule__GSSProtocolPacketsProtocolPacket__Group__17__Impl : ( ';' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1468:1: ( ( ';' ) )
            // InternalPROTOCOL_PACKETS.g:1469:1: ( ';' )
            {
            // InternalPROTOCOL_PACKETS.g:1469:1: ( ';' )
            // InternalPROTOCOL_PACKETS.g:1470:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_17()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_17()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__17__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__18"
    // InternalPROTOCOL_PACKETS.g:1479:1: rule__GSSProtocolPacketsProtocolPacket__Group__18 : rule__GSSProtocolPacketsProtocolPacket__Group__18__Impl rule__GSSProtocolPacketsProtocolPacket__Group__19 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1483:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__18__Impl rule__GSSProtocolPacketsProtocolPacket__Group__19 )
            // InternalPROTOCOL_PACKETS.g:1484:2: rule__GSSProtocolPacketsProtocolPacket__Group__18__Impl rule__GSSProtocolPacketsProtocolPacket__Group__19
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSProtocolPacketsProtocolPacket__Group__18__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__Group__19();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__18"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__18__Impl"
    // InternalPROTOCOL_PACKETS.g:1491:1: rule__GSSProtocolPacketsProtocolPacket__Group__18__Impl : ( ( rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_18 ) ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1495:1: ( ( ( rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_18 ) ) )
            // InternalPROTOCOL_PACKETS.g:1496:1: ( ( rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_18 ) )
            {
            // InternalPROTOCOL_PACKETS.g:1496:1: ( ( rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_18 ) )
            // InternalPROTOCOL_PACKETS.g:1497:2: ( rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_18 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getFormatAssignment_18()); 
            }
            // InternalPROTOCOL_PACKETS.g:1498:2: ( rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_18 )
            // InternalPROTOCOL_PACKETS.g:1498:3: rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_18
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_18();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getFormatAssignment_18()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__18__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__19"
    // InternalPROTOCOL_PACKETS.g:1506:1: rule__GSSProtocolPacketsProtocolPacket__Group__19 : rule__GSSProtocolPacketsProtocolPacket__Group__19__Impl rule__GSSProtocolPacketsProtocolPacket__Group__20 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1510:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__19__Impl rule__GSSProtocolPacketsProtocolPacket__Group__20 )
            // InternalPROTOCOL_PACKETS.g:1511:2: rule__GSSProtocolPacketsProtocolPacket__Group__19__Impl rule__GSSProtocolPacketsProtocolPacket__Group__20
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSProtocolPacketsProtocolPacket__Group__19__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__Group__20();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__19"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__19__Impl"
    // InternalPROTOCOL_PACKETS.g:1518:1: rule__GSSProtocolPacketsProtocolPacket__Group__19__Impl : ( '}' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1522:1: ( ( '}' ) )
            // InternalPROTOCOL_PACKETS.g:1523:1: ( '}' )
            {
            // InternalPROTOCOL_PACKETS.g:1523:1: ( '}' )
            // InternalPROTOCOL_PACKETS.g:1524:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getRightCurlyBracketKeyword_19()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getRightCurlyBracketKeyword_19()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__19__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__20"
    // InternalPROTOCOL_PACKETS.g:1533:1: rule__GSSProtocolPacketsProtocolPacket__Group__20 : rule__GSSProtocolPacketsProtocolPacket__Group__20__Impl ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1537:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__20__Impl )
            // InternalPROTOCOL_PACKETS.g:1538:2: rule__GSSProtocolPacketsProtocolPacket__Group__20__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__Group__20__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__20"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__20__Impl"
    // InternalPROTOCOL_PACKETS.g:1544:1: rule__GSSProtocolPacketsProtocolPacket__Group__20__Impl : ( ';' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1548:1: ( ( ';' ) )
            // InternalPROTOCOL_PACKETS.g:1549:1: ( ';' )
            {
            // InternalPROTOCOL_PACKETS.g:1549:1: ( ';' )
            // InternalPROTOCOL_PACKETS.g:1550:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_20()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_20()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__20__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsFormat__Group__0"
    // InternalPROTOCOL_PACKETS.g:1560:1: rule__GSSProtocolPacketsFormat__Group__0 : rule__GSSProtocolPacketsFormat__Group__0__Impl rule__GSSProtocolPacketsFormat__Group__1 ;
    public final void rule__GSSProtocolPacketsFormat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1564:1: ( rule__GSSProtocolPacketsFormat__Group__0__Impl rule__GSSProtocolPacketsFormat__Group__1 )
            // InternalPROTOCOL_PACKETS.g:1565:2: rule__GSSProtocolPacketsFormat__Group__0__Impl rule__GSSProtocolPacketsFormat__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSProtocolPacketsFormat__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsFormat__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsFormat__Group__0"


    // $ANTLR start "rule__GSSProtocolPacketsFormat__Group__0__Impl"
    // InternalPROTOCOL_PACKETS.g:1572:1: rule__GSSProtocolPacketsFormat__Group__0__Impl : ( 'GSSProtocolPacketsFormat' ) ;
    public final void rule__GSSProtocolPacketsFormat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1576:1: ( ( 'GSSProtocolPacketsFormat' ) )
            // InternalPROTOCOL_PACKETS.g:1577:1: ( 'GSSProtocolPacketsFormat' )
            {
            // InternalPROTOCOL_PACKETS.g:1577:1: ( 'GSSProtocolPacketsFormat' )
            // InternalPROTOCOL_PACKETS.g:1578:2: 'GSSProtocolPacketsFormat'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsFormatAccess().getGSSProtocolPacketsFormatKeyword_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsFormatAccess().getGSSProtocolPacketsFormatKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsFormat__Group__0__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsFormat__Group__1"
    // InternalPROTOCOL_PACKETS.g:1587:1: rule__GSSProtocolPacketsFormat__Group__1 : rule__GSSProtocolPacketsFormat__Group__1__Impl rule__GSSProtocolPacketsFormat__Group__2 ;
    public final void rule__GSSProtocolPacketsFormat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1591:1: ( rule__GSSProtocolPacketsFormat__Group__1__Impl rule__GSSProtocolPacketsFormat__Group__2 )
            // InternalPROTOCOL_PACKETS.g:1592:2: rule__GSSProtocolPacketsFormat__Group__1__Impl rule__GSSProtocolPacketsFormat__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__GSSProtocolPacketsFormat__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsFormat__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsFormat__Group__1"


    // $ANTLR start "rule__GSSProtocolPacketsFormat__Group__1__Impl"
    // InternalPROTOCOL_PACKETS.g:1599:1: rule__GSSProtocolPacketsFormat__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSProtocolPacketsFormat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1603:1: ( ( '{' ) )
            // InternalPROTOCOL_PACKETS.g:1604:1: ( '{' )
            {
            // InternalPROTOCOL_PACKETS.g:1604:1: ( '{' )
            // InternalPROTOCOL_PACKETS.g:1605:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsFormatAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsFormatAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsFormat__Group__1__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsFormat__Group__2"
    // InternalPROTOCOL_PACKETS.g:1614:1: rule__GSSProtocolPacketsFormat__Group__2 : rule__GSSProtocolPacketsFormat__Group__2__Impl rule__GSSProtocolPacketsFormat__Group__3 ;
    public final void rule__GSSProtocolPacketsFormat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1618:1: ( rule__GSSProtocolPacketsFormat__Group__2__Impl rule__GSSProtocolPacketsFormat__Group__3 )
            // InternalPROTOCOL_PACKETS.g:1619:2: rule__GSSProtocolPacketsFormat__Group__2__Impl rule__GSSProtocolPacketsFormat__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSProtocolPacketsFormat__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsFormat__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsFormat__Group__2"


    // $ANTLR start "rule__GSSProtocolPacketsFormat__Group__2__Impl"
    // InternalPROTOCOL_PACKETS.g:1626:1: rule__GSSProtocolPacketsFormat__Group__2__Impl : ( 'file' ) ;
    public final void rule__GSSProtocolPacketsFormat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1630:1: ( ( 'file' ) )
            // InternalPROTOCOL_PACKETS.g:1631:1: ( 'file' )
            {
            // InternalPROTOCOL_PACKETS.g:1631:1: ( 'file' )
            // InternalPROTOCOL_PACKETS.g:1632:2: 'file'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsFormatAccess().getFileKeyword_2()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsFormatAccess().getFileKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsFormat__Group__2__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsFormat__Group__3"
    // InternalPROTOCOL_PACKETS.g:1641:1: rule__GSSProtocolPacketsFormat__Group__3 : rule__GSSProtocolPacketsFormat__Group__3__Impl rule__GSSProtocolPacketsFormat__Group__4 ;
    public final void rule__GSSProtocolPacketsFormat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1645:1: ( rule__GSSProtocolPacketsFormat__Group__3__Impl rule__GSSProtocolPacketsFormat__Group__4 )
            // InternalPROTOCOL_PACKETS.g:1646:2: rule__GSSProtocolPacketsFormat__Group__3__Impl rule__GSSProtocolPacketsFormat__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__GSSProtocolPacketsFormat__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsFormat__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsFormat__Group__3"


    // $ANTLR start "rule__GSSProtocolPacketsFormat__Group__3__Impl"
    // InternalPROTOCOL_PACKETS.g:1653:1: rule__GSSProtocolPacketsFormat__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSProtocolPacketsFormat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1657:1: ( ( ':=' ) )
            // InternalPROTOCOL_PACKETS.g:1658:1: ( ':=' )
            {
            // InternalPROTOCOL_PACKETS.g:1658:1: ( ':=' )
            // InternalPROTOCOL_PACKETS.g:1659:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsFormatAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsFormatAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsFormat__Group__3__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsFormat__Group__4"
    // InternalPROTOCOL_PACKETS.g:1668:1: rule__GSSProtocolPacketsFormat__Group__4 : rule__GSSProtocolPacketsFormat__Group__4__Impl rule__GSSProtocolPacketsFormat__Group__5 ;
    public final void rule__GSSProtocolPacketsFormat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1672:1: ( rule__GSSProtocolPacketsFormat__Group__4__Impl rule__GSSProtocolPacketsFormat__Group__5 )
            // InternalPROTOCOL_PACKETS.g:1673:2: rule__GSSProtocolPacketsFormat__Group__4__Impl rule__GSSProtocolPacketsFormat__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSProtocolPacketsFormat__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsFormat__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsFormat__Group__4"


    // $ANTLR start "rule__GSSProtocolPacketsFormat__Group__4__Impl"
    // InternalPROTOCOL_PACKETS.g:1680:1: rule__GSSProtocolPacketsFormat__Group__4__Impl : ( ( rule__GSSProtocolPacketsFormat__FileAssignment_4 ) ) ;
    public final void rule__GSSProtocolPacketsFormat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1684:1: ( ( ( rule__GSSProtocolPacketsFormat__FileAssignment_4 ) ) )
            // InternalPROTOCOL_PACKETS.g:1685:1: ( ( rule__GSSProtocolPacketsFormat__FileAssignment_4 ) )
            {
            // InternalPROTOCOL_PACKETS.g:1685:1: ( ( rule__GSSProtocolPacketsFormat__FileAssignment_4 ) )
            // InternalPROTOCOL_PACKETS.g:1686:2: ( rule__GSSProtocolPacketsFormat__FileAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsFormatAccess().getFileAssignment_4()); 
            }
            // InternalPROTOCOL_PACKETS.g:1687:2: ( rule__GSSProtocolPacketsFormat__FileAssignment_4 )
            // InternalPROTOCOL_PACKETS.g:1687:3: rule__GSSProtocolPacketsFormat__FileAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsFormat__FileAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsFormatAccess().getFileAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsFormat__Group__4__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsFormat__Group__5"
    // InternalPROTOCOL_PACKETS.g:1695:1: rule__GSSProtocolPacketsFormat__Group__5 : rule__GSSProtocolPacketsFormat__Group__5__Impl rule__GSSProtocolPacketsFormat__Group__6 ;
    public final void rule__GSSProtocolPacketsFormat__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1699:1: ( rule__GSSProtocolPacketsFormat__Group__5__Impl rule__GSSProtocolPacketsFormat__Group__6 )
            // InternalPROTOCOL_PACKETS.g:1700:2: rule__GSSProtocolPacketsFormat__Group__5__Impl rule__GSSProtocolPacketsFormat__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSProtocolPacketsFormat__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsFormat__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsFormat__Group__5"


    // $ANTLR start "rule__GSSProtocolPacketsFormat__Group__5__Impl"
    // InternalPROTOCOL_PACKETS.g:1707:1: rule__GSSProtocolPacketsFormat__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSProtocolPacketsFormat__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1711:1: ( ( ';' ) )
            // InternalPROTOCOL_PACKETS.g:1712:1: ( ';' )
            {
            // InternalPROTOCOL_PACKETS.g:1712:1: ( ';' )
            // InternalPROTOCOL_PACKETS.g:1713:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsFormatAccess().getSemicolonKeyword_5()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsFormatAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsFormat__Group__5__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsFormat__Group__6"
    // InternalPROTOCOL_PACKETS.g:1722:1: rule__GSSProtocolPacketsFormat__Group__6 : rule__GSSProtocolPacketsFormat__Group__6__Impl rule__GSSProtocolPacketsFormat__Group__7 ;
    public final void rule__GSSProtocolPacketsFormat__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1726:1: ( rule__GSSProtocolPacketsFormat__Group__6__Impl rule__GSSProtocolPacketsFormat__Group__7 )
            // InternalPROTOCOL_PACKETS.g:1727:2: rule__GSSProtocolPacketsFormat__Group__6__Impl rule__GSSProtocolPacketsFormat__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSProtocolPacketsFormat__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsFormat__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsFormat__Group__6"


    // $ANTLR start "rule__GSSProtocolPacketsFormat__Group__6__Impl"
    // InternalPROTOCOL_PACKETS.g:1734:1: rule__GSSProtocolPacketsFormat__Group__6__Impl : ( '}' ) ;
    public final void rule__GSSProtocolPacketsFormat__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1738:1: ( ( '}' ) )
            // InternalPROTOCOL_PACKETS.g:1739:1: ( '}' )
            {
            // InternalPROTOCOL_PACKETS.g:1739:1: ( '}' )
            // InternalPROTOCOL_PACKETS.g:1740:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsFormatAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsFormatAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsFormat__Group__6__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsFormat__Group__7"
    // InternalPROTOCOL_PACKETS.g:1749:1: rule__GSSProtocolPacketsFormat__Group__7 : rule__GSSProtocolPacketsFormat__Group__7__Impl ;
    public final void rule__GSSProtocolPacketsFormat__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1753:1: ( rule__GSSProtocolPacketsFormat__Group__7__Impl )
            // InternalPROTOCOL_PACKETS.g:1754:2: rule__GSSProtocolPacketsFormat__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsFormat__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsFormat__Group__7"


    // $ANTLR start "rule__GSSProtocolPacketsFormat__Group__7__Impl"
    // InternalPROTOCOL_PACKETS.g:1760:1: rule__GSSProtocolPacketsFormat__Group__7__Impl : ( ';' ) ;
    public final void rule__GSSProtocolPacketsFormat__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1764:1: ( ( ';' ) )
            // InternalPROTOCOL_PACKETS.g:1765:1: ( ';' )
            {
            // InternalPROTOCOL_PACKETS.g:1765:1: ( ';' )
            // InternalPROTOCOL_PACKETS.g:1766:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsFormatAccess().getSemicolonKeyword_7()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsFormatAccess().getSemicolonKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsFormat__Group__7__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalPROTOCOL_PACKETS.g:1776:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1780:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalPROTOCOL_PACKETS.g:1781:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
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
    // InternalPROTOCOL_PACKETS.g:1788:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1792:1: ( ( RULE_ID ) )
            // InternalPROTOCOL_PACKETS.g:1793:1: ( RULE_ID )
            {
            // InternalPROTOCOL_PACKETS.g:1793:1: ( RULE_ID )
            // InternalPROTOCOL_PACKETS.g:1794:2: RULE_ID
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
    // InternalPROTOCOL_PACKETS.g:1803:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1807:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalPROTOCOL_PACKETS.g:1808:2: rule__QualifiedName__Group__1__Impl
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
    // InternalPROTOCOL_PACKETS.g:1814:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1818:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalPROTOCOL_PACKETS.g:1819:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalPROTOCOL_PACKETS.g:1819:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalPROTOCOL_PACKETS.g:1820:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalPROTOCOL_PACKETS.g:1821:2: ( rule__QualifiedName__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPROTOCOL_PACKETS.g:1821:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalPROTOCOL_PACKETS.g:1830:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1834:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalPROTOCOL_PACKETS.g:1835:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalPROTOCOL_PACKETS.g:1842:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1846:1: ( ( '.' ) )
            // InternalPROTOCOL_PACKETS.g:1847:1: ( '.' )
            {
            // InternalPROTOCOL_PACKETS.g:1847:1: ( '.' )
            // InternalPROTOCOL_PACKETS.g:1848:2: '.'
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
    // InternalPROTOCOL_PACKETS.g:1857:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1861:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalPROTOCOL_PACKETS.g:1862:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalPROTOCOL_PACKETS.g:1868:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1872:1: ( ( RULE_ID ) )
            // InternalPROTOCOL_PACKETS.g:1873:1: ( RULE_ID )
            {
            // InternalPROTOCOL_PACKETS.g:1873:1: ( RULE_ID )
            // InternalPROTOCOL_PACKETS.g:1874:2: RULE_ID
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
    // InternalPROTOCOL_PACKETS.g:1884:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1888:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalPROTOCOL_PACKETS.g:1889:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
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
    // InternalPROTOCOL_PACKETS.g:1896:1: rule__Version__Group__0__Impl : ( ( rule__Version__Alternatives_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1900:1: ( ( ( rule__Version__Alternatives_0 ) ) )
            // InternalPROTOCOL_PACKETS.g:1901:1: ( ( rule__Version__Alternatives_0 ) )
            {
            // InternalPROTOCOL_PACKETS.g:1901:1: ( ( rule__Version__Alternatives_0 ) )
            // InternalPROTOCOL_PACKETS.g:1902:2: ( rule__Version__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_0()); 
            }
            // InternalPROTOCOL_PACKETS.g:1903:2: ( rule__Version__Alternatives_0 )
            // InternalPROTOCOL_PACKETS.g:1903:3: rule__Version__Alternatives_0
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
    // InternalPROTOCOL_PACKETS.g:1911:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1915:1: ( rule__Version__Group__1__Impl )
            // InternalPROTOCOL_PACKETS.g:1916:2: rule__Version__Group__1__Impl
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
    // InternalPROTOCOL_PACKETS.g:1922:1: rule__Version__Group__1__Impl : ( ( rule__Version__Group_1__0 )* ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1926:1: ( ( ( rule__Version__Group_1__0 )* ) )
            // InternalPROTOCOL_PACKETS.g:1927:1: ( ( rule__Version__Group_1__0 )* )
            {
            // InternalPROTOCOL_PACKETS.g:1927:1: ( ( rule__Version__Group_1__0 )* )
            // InternalPROTOCOL_PACKETS.g:1928:2: ( rule__Version__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1()); 
            }
            // InternalPROTOCOL_PACKETS.g:1929:2: ( rule__Version__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPROTOCOL_PACKETS.g:1929:3: rule__Version__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalPROTOCOL_PACKETS.g:1938:1: rule__Version__Group_0_1__0 : rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 ;
    public final void rule__Version__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1942:1: ( rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 )
            // InternalPROTOCOL_PACKETS.g:1943:2: rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1
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
    // InternalPROTOCOL_PACKETS.g:1950:1: rule__Version__Group_0_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1954:1: ( ( ( RULE_INT )? ) )
            // InternalPROTOCOL_PACKETS.g:1955:1: ( ( RULE_INT )? )
            {
            // InternalPROTOCOL_PACKETS.g:1955:1: ( ( RULE_INT )? )
            // InternalPROTOCOL_PACKETS.g:1956:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
            }
            // InternalPROTOCOL_PACKETS.g:1957:2: ( RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPROTOCOL_PACKETS.g:1957:3: RULE_INT
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
    // InternalPROTOCOL_PACKETS.g:1965:1: rule__Version__Group_0_1__1 : rule__Version__Group_0_1__1__Impl ;
    public final void rule__Version__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1969:1: ( rule__Version__Group_0_1__1__Impl )
            // InternalPROTOCOL_PACKETS.g:1970:2: rule__Version__Group_0_1__1__Impl
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
    // InternalPROTOCOL_PACKETS.g:1976:1: rule__Version__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1980:1: ( ( RULE_ID ) )
            // InternalPROTOCOL_PACKETS.g:1981:1: ( RULE_ID )
            {
            // InternalPROTOCOL_PACKETS.g:1981:1: ( RULE_ID )
            // InternalPROTOCOL_PACKETS.g:1982:2: RULE_ID
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
    // InternalPROTOCOL_PACKETS.g:1992:1: rule__Version__Group_1__0 : rule__Version__Group_1__0__Impl rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1996:1: ( rule__Version__Group_1__0__Impl rule__Version__Group_1__1 )
            // InternalPROTOCOL_PACKETS.g:1997:2: rule__Version__Group_1__0__Impl rule__Version__Group_1__1
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
    // InternalPROTOCOL_PACKETS.g:2004:1: rule__Version__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2008:1: ( ( '.' ) )
            // InternalPROTOCOL_PACKETS.g:2009:1: ( '.' )
            {
            // InternalPROTOCOL_PACKETS.g:2009:1: ( '.' )
            // InternalPROTOCOL_PACKETS.g:2010:2: '.'
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
    // InternalPROTOCOL_PACKETS.g:2019:1: rule__Version__Group_1__1 : rule__Version__Group_1__1__Impl ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2023:1: ( rule__Version__Group_1__1__Impl )
            // InternalPROTOCOL_PACKETS.g:2024:2: rule__Version__Group_1__1__Impl
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
    // InternalPROTOCOL_PACKETS.g:2030:1: rule__Version__Group_1__1__Impl : ( ( rule__Version__Alternatives_1_1 ) ) ;
    public final void rule__Version__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2034:1: ( ( ( rule__Version__Alternatives_1_1 ) ) )
            // InternalPROTOCOL_PACKETS.g:2035:1: ( ( rule__Version__Alternatives_1_1 ) )
            {
            // InternalPROTOCOL_PACKETS.g:2035:1: ( ( rule__Version__Alternatives_1_1 ) )
            // InternalPROTOCOL_PACKETS.g:2036:2: ( rule__Version__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_1_1()); 
            }
            // InternalPROTOCOL_PACKETS.g:2037:2: ( rule__Version__Alternatives_1_1 )
            // InternalPROTOCOL_PACKETS.g:2037:3: rule__Version__Alternatives_1_1
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
    // InternalPROTOCOL_PACKETS.g:2046:1: rule__Version__Group_1_1_1__0 : rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 ;
    public final void rule__Version__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2050:1: ( rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 )
            // InternalPROTOCOL_PACKETS.g:2051:2: rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1
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
    // InternalPROTOCOL_PACKETS.g:2058:1: rule__Version__Group_1_1_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2062:1: ( ( ( RULE_INT )? ) )
            // InternalPROTOCOL_PACKETS.g:2063:1: ( ( RULE_INT )? )
            {
            // InternalPROTOCOL_PACKETS.g:2063:1: ( ( RULE_INT )? )
            // InternalPROTOCOL_PACKETS.g:2064:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
            }
            // InternalPROTOCOL_PACKETS.g:2065:2: ( RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPROTOCOL_PACKETS.g:2065:3: RULE_INT
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
    // InternalPROTOCOL_PACKETS.g:2073:1: rule__Version__Group_1_1_1__1 : rule__Version__Group_1_1_1__1__Impl ;
    public final void rule__Version__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2077:1: ( rule__Version__Group_1_1_1__1__Impl )
            // InternalPROTOCOL_PACKETS.g:2078:2: rule__Version__Group_1_1_1__1__Impl
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
    // InternalPROTOCOL_PACKETS.g:2084:1: rule__Version__Group_1_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2088:1: ( ( RULE_ID ) )
            // InternalPROTOCOL_PACKETS.g:2089:1: ( RULE_ID )
            {
            // InternalPROTOCOL_PACKETS.g:2089:1: ( RULE_ID )
            // InternalPROTOCOL_PACKETS.g:2090:2: RULE_ID
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
    // InternalPROTOCOL_PACKETS.g:2100:1: rule__VersionedQualifiedName__Group__0 : rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 ;
    public final void rule__VersionedQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2104:1: ( rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 )
            // InternalPROTOCOL_PACKETS.g:2105:2: rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
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
    // InternalPROTOCOL_PACKETS.g:2112:1: rule__VersionedQualifiedName__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__VersionedQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2116:1: ( ( ruleQualifiedName ) )
            // InternalPROTOCOL_PACKETS.g:2117:1: ( ruleQualifiedName )
            {
            // InternalPROTOCOL_PACKETS.g:2117:1: ( ruleQualifiedName )
            // InternalPROTOCOL_PACKETS.g:2118:2: ruleQualifiedName
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
    // InternalPROTOCOL_PACKETS.g:2127:1: rule__VersionedQualifiedName__Group__1 : rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 ;
    public final void rule__VersionedQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2131:1: ( rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 )
            // InternalPROTOCOL_PACKETS.g:2132:2: rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2
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
    // InternalPROTOCOL_PACKETS.g:2139:1: rule__VersionedQualifiedName__Group__1__Impl : ( '(' ) ;
    public final void rule__VersionedQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2143:1: ( ( '(' ) )
            // InternalPROTOCOL_PACKETS.g:2144:1: ( '(' )
            {
            // InternalPROTOCOL_PACKETS.g:2144:1: ( '(' )
            // InternalPROTOCOL_PACKETS.g:2145:2: '('
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
    // InternalPROTOCOL_PACKETS.g:2154:1: rule__VersionedQualifiedName__Group__2 : rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 ;
    public final void rule__VersionedQualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2158:1: ( rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 )
            // InternalPROTOCOL_PACKETS.g:2159:2: rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalPROTOCOL_PACKETS.g:2166:1: rule__VersionedQualifiedName__Group__2__Impl : ( ruleVersion ) ;
    public final void rule__VersionedQualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2170:1: ( ( ruleVersion ) )
            // InternalPROTOCOL_PACKETS.g:2171:1: ( ruleVersion )
            {
            // InternalPROTOCOL_PACKETS.g:2171:1: ( ruleVersion )
            // InternalPROTOCOL_PACKETS.g:2172:2: ruleVersion
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
    // InternalPROTOCOL_PACKETS.g:2181:1: rule__VersionedQualifiedName__Group__3 : rule__VersionedQualifiedName__Group__3__Impl ;
    public final void rule__VersionedQualifiedName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2185:1: ( rule__VersionedQualifiedName__Group__3__Impl )
            // InternalPROTOCOL_PACKETS.g:2186:2: rule__VersionedQualifiedName__Group__3__Impl
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
    // InternalPROTOCOL_PACKETS.g:2192:1: rule__VersionedQualifiedName__Group__3__Impl : ( ')' ) ;
    public final void rule__VersionedQualifiedName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2196:1: ( ( ')' ) )
            // InternalPROTOCOL_PACKETS.g:2197:1: ( ')' )
            {
            // InternalPROTOCOL_PACKETS.g:2197:1: ( ')' )
            // InternalPROTOCOL_PACKETS.g:2198:2: ')'
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
    // InternalPROTOCOL_PACKETS.g:2208:1: rule__INTEGER__Group_0__0 : rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 ;
    public final void rule__INTEGER__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2212:1: ( rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 )
            // InternalPROTOCOL_PACKETS.g:2213:2: rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
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
    // InternalPROTOCOL_PACKETS.g:2220:1: rule__INTEGER__Group_0__0__Impl : ( ( '-' )? ) ;
    public final void rule__INTEGER__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2224:1: ( ( ( '-' )? ) )
            // InternalPROTOCOL_PACKETS.g:2225:1: ( ( '-' )? )
            {
            // InternalPROTOCOL_PACKETS.g:2225:1: ( ( '-' )? )
            // InternalPROTOCOL_PACKETS.g:2226:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); 
            }
            // InternalPROTOCOL_PACKETS.g:2227:2: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPROTOCOL_PACKETS.g:2227:3: '-'
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
    // InternalPROTOCOL_PACKETS.g:2235:1: rule__INTEGER__Group_0__1 : rule__INTEGER__Group_0__1__Impl ;
    public final void rule__INTEGER__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2239:1: ( rule__INTEGER__Group_0__1__Impl )
            // InternalPROTOCOL_PACKETS.g:2240:2: rule__INTEGER__Group_0__1__Impl
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
    // InternalPROTOCOL_PACKETS.g:2246:1: rule__INTEGER__Group_0__1__Impl : ( RULE_INT ) ;
    public final void rule__INTEGER__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2250:1: ( ( RULE_INT ) )
            // InternalPROTOCOL_PACKETS.g:2251:1: ( RULE_INT )
            {
            // InternalPROTOCOL_PACKETS.g:2251:1: ( RULE_INT )
            // InternalPROTOCOL_PACKETS.g:2252:2: RULE_INT
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


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3"
    // InternalPROTOCOL_PACKETS.g:2262:1: rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3 : rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__0 {...}?;
    public final void rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3());
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2267:1: ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__0 {...}?)
            // InternalPROTOCOL_PACKETS.g:2268:2: rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl"
    // InternalPROTOCOL_PACKETS.g:2276:1: rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2281:1: ( ( ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0 ) ) ) ) ) )
            // InternalPROTOCOL_PACKETS.g:2282:3: ( ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0 ) ) ) ) )
            {
            // InternalPROTOCOL_PACKETS.g:2282:3: ( ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0 ) ) ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( LA12_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0) ) {
                alt12=1;
            }
            else if ( LA12_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 1) ) {
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
                    // InternalPROTOCOL_PACKETS.g:2283:3: ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) ) ) )
                    {
                    // InternalPROTOCOL_PACKETS.g:2283:3: ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) ) ) )
                    // InternalPROTOCOL_PACKETS.g:2284:4: {...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalPROTOCOL_PACKETS.g:2284:129: ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) ) )
                    // InternalPROTOCOL_PACKETS.g:2285:5: ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // InternalPROTOCOL_PACKETS.g:2291:5: ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) )
                    // InternalPROTOCOL_PACKETS.g:2292:6: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getGroup_3_0()); 
                    }
                    // InternalPROTOCOL_PACKETS.g:2293:6: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 )
                    // InternalPROTOCOL_PACKETS.g:2293:7: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getGroup_3_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPROTOCOL_PACKETS.g:2298:3: ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0 ) ) ) )
                    {
                    // InternalPROTOCOL_PACKETS.g:2298:3: ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0 ) ) ) )
                    // InternalPROTOCOL_PACKETS.g:2299:4: {...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalPROTOCOL_PACKETS.g:2299:129: ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0 ) ) )
                    // InternalPROTOCOL_PACKETS.g:2300:5: ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // InternalPROTOCOL_PACKETS.g:2306:5: ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0 ) )
                    // InternalPROTOCOL_PACKETS.g:2307:6: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getGroup_3_1()); 
                    }
                    // InternalPROTOCOL_PACKETS.g:2308:6: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0 )
                    // InternalPROTOCOL_PACKETS.g:2308:7: rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getGroup_3_1()); 
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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__0"
    // InternalPROTOCOL_PACKETS.g:2321:1: rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__0 : rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__1 )? ;
    public final void rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2325:1: ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__1 )? )
            // InternalPROTOCOL_PACKETS.g:2326:2: rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalPROTOCOL_PACKETS.g:2327:2: ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( LA13_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0) ) {
                alt13=1;
            }
            else if ( LA13_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 1) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPROTOCOL_PACKETS.g:0:0: rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__1();

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
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__0"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__1"
    // InternalPROTOCOL_PACKETS.g:2333:1: rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__1 : rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl ;
    public final void rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2337:1: ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl )
            // InternalPROTOCOL_PACKETS.g:2338:2: rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__1"


    // $ANTLR start "rule__GSSModelFile__ImportsAssignment_0"
    // InternalPROTOCOL_PACKETS.g:2345:1: rule__GSSModelFile__ImportsAssignment_0 : ( ruleGSSModelFileImport ) ;
    public final void rule__GSSModelFile__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2349:1: ( ( ruleGSSModelFileImport ) )
            // InternalPROTOCOL_PACKETS.g:2350:2: ( ruleGSSModelFileImport )
            {
            // InternalPROTOCOL_PACKETS.g:2350:2: ( ruleGSSModelFileImport )
            // InternalPROTOCOL_PACKETS.g:2351:3: ruleGSSModelFileImport
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
    // InternalPROTOCOL_PACKETS.g:2360:1: rule__GSSModelFile__ElementAssignment_1 : ( ruleGSSProtocolPacketsProtocolPackets ) ;
    public final void rule__GSSModelFile__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2364:1: ( ( ruleGSSProtocolPacketsProtocolPackets ) )
            // InternalPROTOCOL_PACKETS.g:2365:2: ( ruleGSSProtocolPacketsProtocolPackets )
            {
            // InternalPROTOCOL_PACKETS.g:2365:2: ( ruleGSSProtocolPacketsProtocolPackets )
            // InternalPROTOCOL_PACKETS.g:2366:3: ruleGSSProtocolPacketsProtocolPackets
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getElementGSSProtocolPacketsProtocolPacketsParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSProtocolPacketsProtocolPackets();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSModelFileAccess().getElementGSSProtocolPacketsProtocolPacketsParserRuleCall_1_0()); 
            }

            }


            }

        }
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
    // InternalPROTOCOL_PACKETS.g:2375:1: rule__GSSModelFileImport__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GSSModelFileImport__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2379:1: ( ( RULE_STRING ) )
            // InternalPROTOCOL_PACKETS.g:2380:2: ( RULE_STRING )
            {
            // InternalPROTOCOL_PACKETS.g:2380:2: ( RULE_STRING )
            // InternalPROTOCOL_PACKETS.g:2381:3: RULE_STRING
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


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__NameAssignment_1"
    // InternalPROTOCOL_PACKETS.g:2390:1: rule__GSSProtocolPacketsProtocolPackets__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2394:1: ( ( ruleEString ) )
            // InternalPROTOCOL_PACKETS.g:2395:2: ( ruleEString )
            {
            // InternalPROTOCOL_PACKETS.g:2395:2: ( ruleEString )
            // InternalPROTOCOL_PACKETS.g:2396:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getNameEStringParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__NameAssignment_1"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__UriAssignment_3_0_2"
    // InternalPROTOCOL_PACKETS.g:2405:1: rule__GSSProtocolPacketsProtocolPackets__UriAssignment_3_0_2 : ( ruleQualifiedName ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__UriAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2409:1: ( ( ruleQualifiedName ) )
            // InternalPROTOCOL_PACKETS.g:2410:2: ( ruleQualifiedName )
            {
            // InternalPROTOCOL_PACKETS.g:2410:2: ( ruleQualifiedName )
            // InternalPROTOCOL_PACKETS.g:2411:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__UriAssignment_3_0_2"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__VersionAssignment_3_1_2"
    // InternalPROTOCOL_PACKETS.g:2420:1: rule__GSSProtocolPacketsProtocolPackets__VersionAssignment_3_1_2 : ( ruleVersion ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__VersionAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2424:1: ( ( ruleVersion ) )
            // InternalPROTOCOL_PACKETS.g:2425:2: ( ruleVersion )
            {
            // InternalPROTOCOL_PACKETS.g:2425:2: ( ruleVersion )
            // InternalPROTOCOL_PACKETS.g:2426:3: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getVersionVersionParserRuleCall_3_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getVersionVersionParserRuleCall_3_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__VersionAssignment_3_1_2"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4"
    // InternalPROTOCOL_PACKETS.g:2435:1: rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 : ( ruleGSSProtocolPacketsProtocolPacket ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2439:1: ( ( ruleGSSProtocolPacketsProtocolPacket ) )
            // InternalPROTOCOL_PACKETS.g:2440:2: ( ruleGSSProtocolPacketsProtocolPacket )
            {
            // InternalPROTOCOL_PACKETS.g:2440:2: ( ruleGSSProtocolPacketsProtocolPacket )
            // InternalPROTOCOL_PACKETS.g:2441:3: ruleGSSProtocolPacketsProtocolPacket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getProtocolPacketGSSProtocolPacketsProtocolPacketParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSProtocolPacketsProtocolPacket();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getProtocolPacketGSSProtocolPacketsProtocolPacketParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__NameAssignment_4"
    // InternalPROTOCOL_PACKETS.g:2450:1: rule__GSSProtocolPacketsProtocolPacket__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2454:1: ( ( RULE_ID ) )
            // InternalPROTOCOL_PACKETS.g:2455:2: ( RULE_ID )
            {
            // InternalPROTOCOL_PACKETS.g:2455:2: ( RULE_ID )
            // InternalPROTOCOL_PACKETS.g:2456:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getNameIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getNameIDTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__NameAssignment_4"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__IfRefAssignment_8"
    // InternalPROTOCOL_PACKETS.g:2465:1: rule__GSSProtocolPacketsProtocolPacket__IfRefAssignment_8 : ( ruleINTEGER ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__IfRefAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2469:1: ( ( ruleINTEGER ) )
            // InternalPROTOCOL_PACKETS.g:2470:2: ( ruleINTEGER )
            {
            // InternalPROTOCOL_PACKETS.g:2470:2: ( ruleINTEGER )
            // InternalPROTOCOL_PACKETS.g:2471:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getIfRefINTEGERParserRuleCall_8_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getIfRefINTEGERParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__IfRefAssignment_8"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__LevelRefAssignment_12"
    // InternalPROTOCOL_PACKETS.g:2480:1: rule__GSSProtocolPacketsProtocolPacket__LevelRefAssignment_12 : ( ruleINTEGER ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__LevelRefAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2484:1: ( ( ruleINTEGER ) )
            // InternalPROTOCOL_PACKETS.g:2485:2: ( ruleINTEGER )
            {
            // InternalPROTOCOL_PACKETS.g:2485:2: ( ruleINTEGER )
            // InternalPROTOCOL_PACKETS.g:2486:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getLevelRefINTEGERParserRuleCall_12_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getLevelRefINTEGERParserRuleCall_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__LevelRefAssignment_12"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__ExportAssignment_16"
    // InternalPROTOCOL_PACKETS.g:2495:1: rule__GSSProtocolPacketsProtocolPacket__ExportAssignment_16 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__ExportAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2499:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalPROTOCOL_PACKETS.g:2500:2: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalPROTOCOL_PACKETS.g:2500:2: ( ( ruleVersionedQualifiedName ) )
            // InternalPROTOCOL_PACKETS.g:2501:3: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getExportGSSExportExportCrossReference_16_0()); 
            }
            // InternalPROTOCOL_PACKETS.g:2502:3: ( ruleVersionedQualifiedName )
            // InternalPROTOCOL_PACKETS.g:2503:4: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getExportGSSExportExportVersionedQualifiedNameParserRuleCall_16_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getExportGSSExportExportVersionedQualifiedNameParserRuleCall_16_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getExportGSSExportExportCrossReference_16_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__ExportAssignment_16"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_18"
    // InternalPROTOCOL_PACKETS.g:2514:1: rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_18 : ( ruleGSSProtocolPacketsFormat ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2518:1: ( ( ruleGSSProtocolPacketsFormat ) )
            // InternalPROTOCOL_PACKETS.g:2519:2: ( ruleGSSProtocolPacketsFormat )
            {
            // InternalPROTOCOL_PACKETS.g:2519:2: ( ruleGSSProtocolPacketsFormat )
            // InternalPROTOCOL_PACKETS.g:2520:3: ruleGSSProtocolPacketsFormat
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getFormatGSSProtocolPacketsFormatParserRuleCall_18_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSProtocolPacketsFormat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getFormatGSSProtocolPacketsFormatParserRuleCall_18_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_18"


    // $ANTLR start "rule__GSSProtocolPacketsFormat__FileAssignment_4"
    // InternalPROTOCOL_PACKETS.g:2529:1: rule__GSSProtocolPacketsFormat__FileAssignment_4 : ( ruleXMLREF ) ;
    public final void rule__GSSProtocolPacketsFormat__FileAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2533:1: ( ( ruleXMLREF ) )
            // InternalPROTOCOL_PACKETS.g:2534:2: ( ruleXMLREF )
            {
            // InternalPROTOCOL_PACKETS.g:2534:2: ( ruleXMLREF )
            // InternalPROTOCOL_PACKETS.g:2535:3: ruleXMLREF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsFormatAccess().getFileXMLREFParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXMLREF();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsFormatAccess().getFileXMLREFParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsFormat__FileAssignment_4"

    // $ANTLR start synpred12_InternalPROTOCOL_PACKETS
    public final void synpred12_InternalPROTOCOL_PACKETS_fragment() throws RecognitionException {   
        // InternalPROTOCOL_PACKETS.g:2283:3: ( ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) ) ) ) )
        // InternalPROTOCOL_PACKETS.g:2283:3: ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) ) ) )
        {
        // InternalPROTOCOL_PACKETS.g:2283:3: ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) ) ) )
        // InternalPROTOCOL_PACKETS.g:2284:4: {...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalPROTOCOL_PACKETS", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalPROTOCOL_PACKETS.g:2284:129: ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) ) )
        // InternalPROTOCOL_PACKETS.g:2285:5: ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0);
        // InternalPROTOCOL_PACKETS.g:2291:5: ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) )
        // InternalPROTOCOL_PACKETS.g:2292:6: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getGroup_3_0()); 
        }
        // InternalPROTOCOL_PACKETS.g:2293:6: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 )
        // InternalPROTOCOL_PACKETS.g:2293:7: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred12_InternalPROTOCOL_PACKETS

    // $ANTLR start synpred13_InternalPROTOCOL_PACKETS
    public final void synpred13_InternalPROTOCOL_PACKETS_fragment() throws RecognitionException {   
        // InternalPROTOCOL_PACKETS.g:2327:2: ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__1 )
        // InternalPROTOCOL_PACKETS.g:2327:2: rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalPROTOCOL_PACKETS

    // Delegated rules

    public final boolean synpred12_InternalPROTOCOL_PACKETS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalPROTOCOL_PACKETS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalPROTOCOL_PACKETS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalPROTOCOL_PACKETS_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000400000C0L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000040L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000000C0002L});
    }


}