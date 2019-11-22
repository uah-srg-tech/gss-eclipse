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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_HEXADECIMAL", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'GSSProtocolPacketsProtocolPackets'", "'{'", "'}'", "'uri'", "':='", "'version'", "'GSSProtocolPacketsProtocolPacket'", "'name'", "'ifRef'", "'levelRef'", "'export'", "'format'", "'.'", "'('", "')'", "'-'"
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalPROTOCOL_PACKETS.g:161:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalPROTOCOL_PACKETS.g:162:1: ( ruleQualifiedName EOF )
            // InternalPROTOCOL_PACKETS.g:163:1: ruleQualifiedName EOF
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
    // InternalPROTOCOL_PACKETS.g:170:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:174:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalPROTOCOL_PACKETS.g:175:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalPROTOCOL_PACKETS.g:175:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalPROTOCOL_PACKETS.g:176:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalPROTOCOL_PACKETS.g:177:3: ( rule__QualifiedName__Group__0 )
            // InternalPROTOCOL_PACKETS.g:177:4: rule__QualifiedName__Group__0
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
    // InternalPROTOCOL_PACKETS.g:186:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalPROTOCOL_PACKETS.g:187:1: ( ruleVersion EOF )
            // InternalPROTOCOL_PACKETS.g:188:1: ruleVersion EOF
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
    // InternalPROTOCOL_PACKETS.g:195:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:199:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalPROTOCOL_PACKETS.g:200:2: ( ( rule__Version__Group__0 ) )
            {
            // InternalPROTOCOL_PACKETS.g:200:2: ( ( rule__Version__Group__0 ) )
            // InternalPROTOCOL_PACKETS.g:201:3: ( rule__Version__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup()); 
            }
            // InternalPROTOCOL_PACKETS.g:202:3: ( rule__Version__Group__0 )
            // InternalPROTOCOL_PACKETS.g:202:4: rule__Version__Group__0
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
    // InternalPROTOCOL_PACKETS.g:211:1: entryRuleVersionedQualifiedName : ruleVersionedQualifiedName EOF ;
    public final void entryRuleVersionedQualifiedName() throws RecognitionException {
        try {
            // InternalPROTOCOL_PACKETS.g:212:1: ( ruleVersionedQualifiedName EOF )
            // InternalPROTOCOL_PACKETS.g:213:1: ruleVersionedQualifiedName EOF
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
    // InternalPROTOCOL_PACKETS.g:220:1: ruleVersionedQualifiedName : ( ( rule__VersionedQualifiedName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:224:2: ( ( ( rule__VersionedQualifiedName__Group__0 ) ) )
            // InternalPROTOCOL_PACKETS.g:225:2: ( ( rule__VersionedQualifiedName__Group__0 ) )
            {
            // InternalPROTOCOL_PACKETS.g:225:2: ( ( rule__VersionedQualifiedName__Group__0 ) )
            // InternalPROTOCOL_PACKETS.g:226:3: ( rule__VersionedQualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); 
            }
            // InternalPROTOCOL_PACKETS.g:227:3: ( rule__VersionedQualifiedName__Group__0 )
            // InternalPROTOCOL_PACKETS.g:227:4: rule__VersionedQualifiedName__Group__0
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
    // InternalPROTOCOL_PACKETS.g:236:1: entryRuleINTEGER : ruleINTEGER EOF ;
    public final void entryRuleINTEGER() throws RecognitionException {
        try {
            // InternalPROTOCOL_PACKETS.g:237:1: ( ruleINTEGER EOF )
            // InternalPROTOCOL_PACKETS.g:238:1: ruleINTEGER EOF
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
    // InternalPROTOCOL_PACKETS.g:245:1: ruleINTEGER : ( ( rule__INTEGER__Alternatives ) ) ;
    public final void ruleINTEGER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:249:2: ( ( ( rule__INTEGER__Alternatives ) ) )
            // InternalPROTOCOL_PACKETS.g:250:2: ( ( rule__INTEGER__Alternatives ) )
            {
            // InternalPROTOCOL_PACKETS.g:250:2: ( ( rule__INTEGER__Alternatives ) )
            // InternalPROTOCOL_PACKETS.g:251:3: ( rule__INTEGER__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getAlternatives()); 
            }
            // InternalPROTOCOL_PACKETS.g:252:3: ( rule__INTEGER__Alternatives )
            // InternalPROTOCOL_PACKETS.g:252:4: rule__INTEGER__Alternatives
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


    // $ANTLR start "rule__Version__Alternatives_0"
    // InternalPROTOCOL_PACKETS.g:260:1: rule__Version__Alternatives_0 : ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) );
    public final void rule__Version__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:264:1: ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==EOF||LA1_1==13||LA1_1==26||LA1_1==28) ) {
                    alt1=1;
                }
                else if ( (LA1_1==RULE_ID) ) {
                    alt1=2;
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
                    // InternalPROTOCOL_PACKETS.g:265:2: ( RULE_INT )
                    {
                    // InternalPROTOCOL_PACKETS.g:265:2: ( RULE_INT )
                    // InternalPROTOCOL_PACKETS.g:266:3: RULE_INT
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
                    // InternalPROTOCOL_PACKETS.g:271:2: ( ( rule__Version__Group_0_1__0 ) )
                    {
                    // InternalPROTOCOL_PACKETS.g:271:2: ( ( rule__Version__Group_0_1__0 ) )
                    // InternalPROTOCOL_PACKETS.g:272:3: ( rule__Version__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_0_1()); 
                    }
                    // InternalPROTOCOL_PACKETS.g:273:3: ( rule__Version__Group_0_1__0 )
                    // InternalPROTOCOL_PACKETS.g:273:4: rule__Version__Group_0_1__0
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
    // InternalPROTOCOL_PACKETS.g:281:1: rule__Version__Alternatives_1_1 : ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) );
    public final void rule__Version__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:285:1: ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||LA2_1==13||LA2_1==26||LA2_1==28) ) {
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
                    // InternalPROTOCOL_PACKETS.g:286:2: ( RULE_INT )
                    {
                    // InternalPROTOCOL_PACKETS.g:286:2: ( RULE_INT )
                    // InternalPROTOCOL_PACKETS.g:287:3: RULE_INT
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
                    // InternalPROTOCOL_PACKETS.g:292:2: ( ( rule__Version__Group_1_1_1__0 ) )
                    {
                    // InternalPROTOCOL_PACKETS.g:292:2: ( ( rule__Version__Group_1_1_1__0 ) )
                    // InternalPROTOCOL_PACKETS.g:293:3: ( rule__Version__Group_1_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_1_1_1()); 
                    }
                    // InternalPROTOCOL_PACKETS.g:294:3: ( rule__Version__Group_1_1_1__0 )
                    // InternalPROTOCOL_PACKETS.g:294:4: rule__Version__Group_1_1_1__0
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
    // InternalPROTOCOL_PACKETS.g:302:1: rule__INTEGER__Alternatives : ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) );
    public final void rule__INTEGER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:306:1: ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT||LA3_0==29) ) {
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
                    // InternalPROTOCOL_PACKETS.g:307:2: ( ( rule__INTEGER__Group_0__0 ) )
                    {
                    // InternalPROTOCOL_PACKETS.g:307:2: ( ( rule__INTEGER__Group_0__0 ) )
                    // InternalPROTOCOL_PACKETS.g:308:3: ( rule__INTEGER__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getINTEGERAccess().getGroup_0()); 
                    }
                    // InternalPROTOCOL_PACKETS.g:309:3: ( rule__INTEGER__Group_0__0 )
                    // InternalPROTOCOL_PACKETS.g:309:4: rule__INTEGER__Group_0__0
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
                    // InternalPROTOCOL_PACKETS.g:313:2: ( RULE_HEXADECIMAL )
                    {
                    // InternalPROTOCOL_PACKETS.g:313:2: ( RULE_HEXADECIMAL )
                    // InternalPROTOCOL_PACKETS.g:314:3: RULE_HEXADECIMAL
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
    // InternalPROTOCOL_PACKETS.g:323:1: rule__GSSModelFile__Group__0 : rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1 ;
    public final void rule__GSSModelFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:327:1: ( rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1 )
            // InternalPROTOCOL_PACKETS.g:328:2: rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1
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
    // InternalPROTOCOL_PACKETS.g:335:1: rule__GSSModelFile__Group__0__Impl : ( ( rule__GSSModelFile__ImportsAssignment_0 )* ) ;
    public final void rule__GSSModelFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:339:1: ( ( ( rule__GSSModelFile__ImportsAssignment_0 )* ) )
            // InternalPROTOCOL_PACKETS.g:340:1: ( ( rule__GSSModelFile__ImportsAssignment_0 )* )
            {
            // InternalPROTOCOL_PACKETS.g:340:1: ( ( rule__GSSModelFile__ImportsAssignment_0 )* )
            // InternalPROTOCOL_PACKETS.g:341:2: ( rule__GSSModelFile__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getImportsAssignment_0()); 
            }
            // InternalPROTOCOL_PACKETS.g:342:2: ( rule__GSSModelFile__ImportsAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPROTOCOL_PACKETS.g:342:3: rule__GSSModelFile__ImportsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__GSSModelFile__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalPROTOCOL_PACKETS.g:350:1: rule__GSSModelFile__Group__1 : rule__GSSModelFile__Group__1__Impl ;
    public final void rule__GSSModelFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:354:1: ( rule__GSSModelFile__Group__1__Impl )
            // InternalPROTOCOL_PACKETS.g:355:2: rule__GSSModelFile__Group__1__Impl
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
    // InternalPROTOCOL_PACKETS.g:361:1: rule__GSSModelFile__Group__1__Impl : ( ( rule__GSSModelFile__ElementAssignment_1 ) ) ;
    public final void rule__GSSModelFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:365:1: ( ( ( rule__GSSModelFile__ElementAssignment_1 ) ) )
            // InternalPROTOCOL_PACKETS.g:366:1: ( ( rule__GSSModelFile__ElementAssignment_1 ) )
            {
            // InternalPROTOCOL_PACKETS.g:366:1: ( ( rule__GSSModelFile__ElementAssignment_1 ) )
            // InternalPROTOCOL_PACKETS.g:367:2: ( rule__GSSModelFile__ElementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getElementAssignment_1()); 
            }
            // InternalPROTOCOL_PACKETS.g:368:2: ( rule__GSSModelFile__ElementAssignment_1 )
            // InternalPROTOCOL_PACKETS.g:368:3: rule__GSSModelFile__ElementAssignment_1
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
    // InternalPROTOCOL_PACKETS.g:377:1: rule__GSSModelFileImport__Group__0 : rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1 ;
    public final void rule__GSSModelFileImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:381:1: ( rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1 )
            // InternalPROTOCOL_PACKETS.g:382:2: rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1
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
    // InternalPROTOCOL_PACKETS.g:389:1: rule__GSSModelFileImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__GSSModelFileImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:393:1: ( ( 'import' ) )
            // InternalPROTOCOL_PACKETS.g:394:1: ( 'import' )
            {
            // InternalPROTOCOL_PACKETS.g:394:1: ( 'import' )
            // InternalPROTOCOL_PACKETS.g:395:2: 'import'
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
    // InternalPROTOCOL_PACKETS.g:404:1: rule__GSSModelFileImport__Group__1 : rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2 ;
    public final void rule__GSSModelFileImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:408:1: ( rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2 )
            // InternalPROTOCOL_PACKETS.g:409:2: rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2
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
    // InternalPROTOCOL_PACKETS.g:416:1: rule__GSSModelFileImport__Group__1__Impl : ( ( rule__GSSModelFileImport__ImportURIAssignment_1 ) ) ;
    public final void rule__GSSModelFileImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:420:1: ( ( ( rule__GSSModelFileImport__ImportURIAssignment_1 ) ) )
            // InternalPROTOCOL_PACKETS.g:421:1: ( ( rule__GSSModelFileImport__ImportURIAssignment_1 ) )
            {
            // InternalPROTOCOL_PACKETS.g:421:1: ( ( rule__GSSModelFileImport__ImportURIAssignment_1 ) )
            // InternalPROTOCOL_PACKETS.g:422:2: ( rule__GSSModelFileImport__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getImportURIAssignment_1()); 
            }
            // InternalPROTOCOL_PACKETS.g:423:2: ( rule__GSSModelFileImport__ImportURIAssignment_1 )
            // InternalPROTOCOL_PACKETS.g:423:3: rule__GSSModelFileImport__ImportURIAssignment_1
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
    // InternalPROTOCOL_PACKETS.g:431:1: rule__GSSModelFileImport__Group__2 : rule__GSSModelFileImport__Group__2__Impl ;
    public final void rule__GSSModelFileImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:435:1: ( rule__GSSModelFileImport__Group__2__Impl )
            // InternalPROTOCOL_PACKETS.g:436:2: rule__GSSModelFileImport__Group__2__Impl
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
    // InternalPROTOCOL_PACKETS.g:442:1: rule__GSSModelFileImport__Group__2__Impl : ( ';' ) ;
    public final void rule__GSSModelFileImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:446:1: ( ( ';' ) )
            // InternalPROTOCOL_PACKETS.g:447:1: ( ';' )
            {
            // InternalPROTOCOL_PACKETS.g:447:1: ( ';' )
            // InternalPROTOCOL_PACKETS.g:448:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getSemicolonKeyword_2()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__Group__0"
    // InternalPROTOCOL_PACKETS.g:458:1: rule__GSSProtocolPacketsProtocolPackets__Group__0 : rule__GSSProtocolPacketsProtocolPackets__Group__0__Impl rule__GSSProtocolPacketsProtocolPackets__Group__1 ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:462:1: ( rule__GSSProtocolPacketsProtocolPackets__Group__0__Impl rule__GSSProtocolPacketsProtocolPackets__Group__1 )
            // InternalPROTOCOL_PACKETS.g:463:2: rule__GSSProtocolPacketsProtocolPackets__Group__0__Impl rule__GSSProtocolPacketsProtocolPackets__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalPROTOCOL_PACKETS.g:470:1: rule__GSSProtocolPacketsProtocolPackets__Group__0__Impl : ( 'GSSProtocolPacketsProtocolPackets' ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:474:1: ( ( 'GSSProtocolPacketsProtocolPackets' ) )
            // InternalPROTOCOL_PACKETS.g:475:1: ( 'GSSProtocolPacketsProtocolPackets' )
            {
            // InternalPROTOCOL_PACKETS.g:475:1: ( 'GSSProtocolPacketsProtocolPackets' )
            // InternalPROTOCOL_PACKETS.g:476:2: 'GSSProtocolPacketsProtocolPackets'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getGSSProtocolPacketsProtocolPacketsKeyword_0()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPROTOCOL_PACKETS.g:485:1: rule__GSSProtocolPacketsProtocolPackets__Group__1 : rule__GSSProtocolPacketsProtocolPackets__Group__1__Impl rule__GSSProtocolPacketsProtocolPackets__Group__2 ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:489:1: ( rule__GSSProtocolPacketsProtocolPackets__Group__1__Impl rule__GSSProtocolPacketsProtocolPackets__Group__2 )
            // InternalPROTOCOL_PACKETS.g:490:2: rule__GSSProtocolPacketsProtocolPackets__Group__1__Impl rule__GSSProtocolPacketsProtocolPackets__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalPROTOCOL_PACKETS.g:497:1: rule__GSSProtocolPacketsProtocolPackets__Group__1__Impl : ( ( rule__GSSProtocolPacketsProtocolPackets__NameAssignment_1 ) ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:501:1: ( ( ( rule__GSSProtocolPacketsProtocolPackets__NameAssignment_1 ) ) )
            // InternalPROTOCOL_PACKETS.g:502:1: ( ( rule__GSSProtocolPacketsProtocolPackets__NameAssignment_1 ) )
            {
            // InternalPROTOCOL_PACKETS.g:502:1: ( ( rule__GSSProtocolPacketsProtocolPackets__NameAssignment_1 ) )
            // InternalPROTOCOL_PACKETS.g:503:2: ( rule__GSSProtocolPacketsProtocolPackets__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getNameAssignment_1()); 
            }
            // InternalPROTOCOL_PACKETS.g:504:2: ( rule__GSSProtocolPacketsProtocolPackets__NameAssignment_1 )
            // InternalPROTOCOL_PACKETS.g:504:3: rule__GSSProtocolPacketsProtocolPackets__NameAssignment_1
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
    // InternalPROTOCOL_PACKETS.g:512:1: rule__GSSProtocolPacketsProtocolPackets__Group__2 : rule__GSSProtocolPacketsProtocolPackets__Group__2__Impl rule__GSSProtocolPacketsProtocolPackets__Group__3 ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:516:1: ( rule__GSSProtocolPacketsProtocolPackets__Group__2__Impl rule__GSSProtocolPacketsProtocolPackets__Group__3 )
            // InternalPROTOCOL_PACKETS.g:517:2: rule__GSSProtocolPacketsProtocolPackets__Group__2__Impl rule__GSSProtocolPacketsProtocolPackets__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_9);
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
    // InternalPROTOCOL_PACKETS.g:524:1: rule__GSSProtocolPacketsProtocolPackets__Group__2__Impl : ( '{' ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:528:1: ( ( '{' ) )
            // InternalPROTOCOL_PACKETS.g:529:1: ( '{' )
            {
            // InternalPROTOCOL_PACKETS.g:529:1: ( '{' )
            // InternalPROTOCOL_PACKETS.g:530:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPROTOCOL_PACKETS.g:539:1: rule__GSSProtocolPacketsProtocolPackets__Group__3 : rule__GSSProtocolPacketsProtocolPackets__Group__3__Impl rule__GSSProtocolPacketsProtocolPackets__Group__4 ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:543:1: ( rule__GSSProtocolPacketsProtocolPackets__Group__3__Impl rule__GSSProtocolPacketsProtocolPackets__Group__4 )
            // InternalPROTOCOL_PACKETS.g:544:2: rule__GSSProtocolPacketsProtocolPackets__Group__3__Impl rule__GSSProtocolPacketsProtocolPackets__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_10);
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
    // InternalPROTOCOL_PACKETS.g:551:1: rule__GSSProtocolPacketsProtocolPackets__Group__3__Impl : ( ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3 ) ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:555:1: ( ( ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3 ) ) )
            // InternalPROTOCOL_PACKETS.g:556:1: ( ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3 ) )
            {
            // InternalPROTOCOL_PACKETS.g:556:1: ( ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3 ) )
            // InternalPROTOCOL_PACKETS.g:557:2: ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3()); 
            }
            // InternalPROTOCOL_PACKETS.g:558:2: ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3 )
            // InternalPROTOCOL_PACKETS.g:558:3: rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3
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
    // InternalPROTOCOL_PACKETS.g:566:1: rule__GSSProtocolPacketsProtocolPackets__Group__4 : rule__GSSProtocolPacketsProtocolPackets__Group__4__Impl rule__GSSProtocolPacketsProtocolPackets__Group__5 ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:570:1: ( rule__GSSProtocolPacketsProtocolPackets__Group__4__Impl rule__GSSProtocolPacketsProtocolPackets__Group__5 )
            // InternalPROTOCOL_PACKETS.g:571:2: rule__GSSProtocolPacketsProtocolPackets__Group__4__Impl rule__GSSProtocolPacketsProtocolPackets__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_11);
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
    // InternalPROTOCOL_PACKETS.g:578:1: rule__GSSProtocolPacketsProtocolPackets__Group__4__Impl : ( ( ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 ) ) ( ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 )* ) ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:582:1: ( ( ( ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 ) ) ( ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 )* ) ) )
            // InternalPROTOCOL_PACKETS.g:583:1: ( ( ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 ) ) ( ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 )* ) )
            {
            // InternalPROTOCOL_PACKETS.g:583:1: ( ( ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 ) ) ( ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 )* ) )
            // InternalPROTOCOL_PACKETS.g:584:2: ( ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 ) ) ( ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 )* )
            {
            // InternalPROTOCOL_PACKETS.g:584:2: ( ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 ) )
            // InternalPROTOCOL_PACKETS.g:585:3: ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getProtocolPacketAssignment_4()); 
            }
            // InternalPROTOCOL_PACKETS.g:586:3: ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 )
            // InternalPROTOCOL_PACKETS.g:586:4: rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getProtocolPacketAssignment_4()); 
            }

            }

            // InternalPROTOCOL_PACKETS.g:589:2: ( ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 )* )
            // InternalPROTOCOL_PACKETS.g:590:3: ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getProtocolPacketAssignment_4()); 
            }
            // InternalPROTOCOL_PACKETS.g:591:3: ( rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPROTOCOL_PACKETS.g:591:4: rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalPROTOCOL_PACKETS.g:600:1: rule__GSSProtocolPacketsProtocolPackets__Group__5 : rule__GSSProtocolPacketsProtocolPackets__Group__5__Impl rule__GSSProtocolPacketsProtocolPackets__Group__6 ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:604:1: ( rule__GSSProtocolPacketsProtocolPackets__Group__5__Impl rule__GSSProtocolPacketsProtocolPackets__Group__6 )
            // InternalPROTOCOL_PACKETS.g:605:2: rule__GSSProtocolPacketsProtocolPackets__Group__5__Impl rule__GSSProtocolPacketsProtocolPackets__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalPROTOCOL_PACKETS.g:612:1: rule__GSSProtocolPacketsProtocolPackets__Group__5__Impl : ( '}' ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:616:1: ( ( '}' ) )
            // InternalPROTOCOL_PACKETS.g:617:1: ( '}' )
            {
            // InternalPROTOCOL_PACKETS.g:617:1: ( '}' )
            // InternalPROTOCOL_PACKETS.g:618:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPROTOCOL_PACKETS.g:627:1: rule__GSSProtocolPacketsProtocolPackets__Group__6 : rule__GSSProtocolPacketsProtocolPackets__Group__6__Impl ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:631:1: ( rule__GSSProtocolPacketsProtocolPackets__Group__6__Impl )
            // InternalPROTOCOL_PACKETS.g:632:2: rule__GSSProtocolPacketsProtocolPackets__Group__6__Impl
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
    // InternalPROTOCOL_PACKETS.g:638:1: rule__GSSProtocolPacketsProtocolPackets__Group__6__Impl : ( ';' ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:642:1: ( ( ';' ) )
            // InternalPROTOCOL_PACKETS.g:643:1: ( ';' )
            {
            // InternalPROTOCOL_PACKETS.g:643:1: ( ';' )
            // InternalPROTOCOL_PACKETS.g:644:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getSemicolonKeyword_6()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPROTOCOL_PACKETS.g:654:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 : rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1 ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:658:1: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1 )
            // InternalPROTOCOL_PACKETS.g:659:2: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalPROTOCOL_PACKETS.g:666:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0__Impl : ( 'uri' ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:670:1: ( ( 'uri' ) )
            // InternalPROTOCOL_PACKETS.g:671:1: ( 'uri' )
            {
            // InternalPROTOCOL_PACKETS.g:671:1: ( 'uri' )
            // InternalPROTOCOL_PACKETS.g:672:2: 'uri'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUriKeyword_3_0_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPROTOCOL_PACKETS.g:681:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1 : rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2 ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:685:1: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2 )
            // InternalPROTOCOL_PACKETS.g:686:2: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalPROTOCOL_PACKETS.g:693:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1__Impl : ( ':=' ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:697:1: ( ( ':=' ) )
            // InternalPROTOCOL_PACKETS.g:698:1: ( ':=' )
            {
            // InternalPROTOCOL_PACKETS.g:698:1: ( ':=' )
            // InternalPROTOCOL_PACKETS.g:699:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getColonEqualsSignKeyword_3_0_1()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPROTOCOL_PACKETS.g:708:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2 : rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3 ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:712:1: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3 )
            // InternalPROTOCOL_PACKETS.g:713:2: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalPROTOCOL_PACKETS.g:720:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2__Impl : ( ( rule__GSSProtocolPacketsProtocolPackets__UriAssignment_3_0_2 ) ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:724:1: ( ( ( rule__GSSProtocolPacketsProtocolPackets__UriAssignment_3_0_2 ) ) )
            // InternalPROTOCOL_PACKETS.g:725:1: ( ( rule__GSSProtocolPacketsProtocolPackets__UriAssignment_3_0_2 ) )
            {
            // InternalPROTOCOL_PACKETS.g:725:1: ( ( rule__GSSProtocolPacketsProtocolPackets__UriAssignment_3_0_2 ) )
            // InternalPROTOCOL_PACKETS.g:726:2: ( rule__GSSProtocolPacketsProtocolPackets__UriAssignment_3_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUriAssignment_3_0_2()); 
            }
            // InternalPROTOCOL_PACKETS.g:727:2: ( rule__GSSProtocolPacketsProtocolPackets__UriAssignment_3_0_2 )
            // InternalPROTOCOL_PACKETS.g:727:3: rule__GSSProtocolPacketsProtocolPackets__UriAssignment_3_0_2
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
    // InternalPROTOCOL_PACKETS.g:735:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3 : rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3__Impl ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:739:1: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3__Impl )
            // InternalPROTOCOL_PACKETS.g:740:2: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3__Impl
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
    // InternalPROTOCOL_PACKETS.g:746:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3__Impl : ( ';' ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:750:1: ( ( ';' ) )
            // InternalPROTOCOL_PACKETS.g:751:1: ( ';' )
            {
            // InternalPROTOCOL_PACKETS.g:751:1: ( ';' )
            // InternalPROTOCOL_PACKETS.g:752:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getSemicolonKeyword_3_0_3()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPROTOCOL_PACKETS.g:762:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0 : rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1 ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:766:1: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1 )
            // InternalPROTOCOL_PACKETS.g:767:2: rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalPROTOCOL_PACKETS.g:774:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0__Impl : ( 'version' ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:778:1: ( ( 'version' ) )
            // InternalPROTOCOL_PACKETS.g:779:1: ( 'version' )
            {
            // InternalPROTOCOL_PACKETS.g:779:1: ( 'version' )
            // InternalPROTOCOL_PACKETS.g:780:2: 'version'
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
    // InternalPROTOCOL_PACKETS.g:789:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1 : rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2 ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:793:1: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2 )
            // InternalPROTOCOL_PACKETS.g:794:2: rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalPROTOCOL_PACKETS.g:801:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1__Impl : ( ':=' ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:805:1: ( ( ':=' ) )
            // InternalPROTOCOL_PACKETS.g:806:1: ( ':=' )
            {
            // InternalPROTOCOL_PACKETS.g:806:1: ( ':=' )
            // InternalPROTOCOL_PACKETS.g:807:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getColonEqualsSignKeyword_3_1_1()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPROTOCOL_PACKETS.g:816:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2 : rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3 ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:820:1: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3 )
            // InternalPROTOCOL_PACKETS.g:821:2: rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2__Impl rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalPROTOCOL_PACKETS.g:828:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2__Impl : ( ( rule__GSSProtocolPacketsProtocolPackets__VersionAssignment_3_1_2 ) ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:832:1: ( ( ( rule__GSSProtocolPacketsProtocolPackets__VersionAssignment_3_1_2 ) ) )
            // InternalPROTOCOL_PACKETS.g:833:1: ( ( rule__GSSProtocolPacketsProtocolPackets__VersionAssignment_3_1_2 ) )
            {
            // InternalPROTOCOL_PACKETS.g:833:1: ( ( rule__GSSProtocolPacketsProtocolPackets__VersionAssignment_3_1_2 ) )
            // InternalPROTOCOL_PACKETS.g:834:2: ( rule__GSSProtocolPacketsProtocolPackets__VersionAssignment_3_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getVersionAssignment_3_1_2()); 
            }
            // InternalPROTOCOL_PACKETS.g:835:2: ( rule__GSSProtocolPacketsProtocolPackets__VersionAssignment_3_1_2 )
            // InternalPROTOCOL_PACKETS.g:835:3: rule__GSSProtocolPacketsProtocolPackets__VersionAssignment_3_1_2
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
    // InternalPROTOCOL_PACKETS.g:843:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3 : rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3__Impl ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:847:1: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3__Impl )
            // InternalPROTOCOL_PACKETS.g:848:2: rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3__Impl
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
    // InternalPROTOCOL_PACKETS.g:854:1: rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3__Impl : ( ';' ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:858:1: ( ( ';' ) )
            // InternalPROTOCOL_PACKETS.g:859:1: ( ';' )
            {
            // InternalPROTOCOL_PACKETS.g:859:1: ( ';' )
            // InternalPROTOCOL_PACKETS.g:860:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getSemicolonKeyword_3_1_3()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPROTOCOL_PACKETS.g:870:1: rule__GSSProtocolPacketsProtocolPacket__Group__0 : rule__GSSProtocolPacketsProtocolPacket__Group__0__Impl rule__GSSProtocolPacketsProtocolPacket__Group__1 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:874:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__0__Impl rule__GSSProtocolPacketsProtocolPacket__Group__1 )
            // InternalPROTOCOL_PACKETS.g:875:2: rule__GSSProtocolPacketsProtocolPacket__Group__0__Impl rule__GSSProtocolPacketsProtocolPacket__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalPROTOCOL_PACKETS.g:882:1: rule__GSSProtocolPacketsProtocolPacket__Group__0__Impl : ( 'GSSProtocolPacketsProtocolPacket' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:886:1: ( ( 'GSSProtocolPacketsProtocolPacket' ) )
            // InternalPROTOCOL_PACKETS.g:887:1: ( 'GSSProtocolPacketsProtocolPacket' )
            {
            // InternalPROTOCOL_PACKETS.g:887:1: ( 'GSSProtocolPacketsProtocolPacket' )
            // InternalPROTOCOL_PACKETS.g:888:2: 'GSSProtocolPacketsProtocolPacket'
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
    // InternalPROTOCOL_PACKETS.g:897:1: rule__GSSProtocolPacketsProtocolPacket__Group__1 : rule__GSSProtocolPacketsProtocolPacket__Group__1__Impl rule__GSSProtocolPacketsProtocolPacket__Group__2 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:901:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__1__Impl rule__GSSProtocolPacketsProtocolPacket__Group__2 )
            // InternalPROTOCOL_PACKETS.g:902:2: rule__GSSProtocolPacketsProtocolPacket__Group__1__Impl rule__GSSProtocolPacketsProtocolPacket__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
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
    // InternalPROTOCOL_PACKETS.g:909:1: rule__GSSProtocolPacketsProtocolPacket__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:913:1: ( ( '{' ) )
            // InternalPROTOCOL_PACKETS.g:914:1: ( '{' )
            {
            // InternalPROTOCOL_PACKETS.g:914:1: ( '{' )
            // InternalPROTOCOL_PACKETS.g:915:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPROTOCOL_PACKETS.g:924:1: rule__GSSProtocolPacketsProtocolPacket__Group__2 : rule__GSSProtocolPacketsProtocolPacket__Group__2__Impl rule__GSSProtocolPacketsProtocolPacket__Group__3 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:928:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__2__Impl rule__GSSProtocolPacketsProtocolPacket__Group__3 )
            // InternalPROTOCOL_PACKETS.g:929:2: rule__GSSProtocolPacketsProtocolPacket__Group__2__Impl rule__GSSProtocolPacketsProtocolPacket__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalPROTOCOL_PACKETS.g:936:1: rule__GSSProtocolPacketsProtocolPacket__Group__2__Impl : ( 'name' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:940:1: ( ( 'name' ) )
            // InternalPROTOCOL_PACKETS.g:941:1: ( 'name' )
            {
            // InternalPROTOCOL_PACKETS.g:941:1: ( 'name' )
            // InternalPROTOCOL_PACKETS.g:942:2: 'name'
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
    // InternalPROTOCOL_PACKETS.g:951:1: rule__GSSProtocolPacketsProtocolPacket__Group__3 : rule__GSSProtocolPacketsProtocolPacket__Group__3__Impl rule__GSSProtocolPacketsProtocolPacket__Group__4 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:955:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__3__Impl rule__GSSProtocolPacketsProtocolPacket__Group__4 )
            // InternalPROTOCOL_PACKETS.g:956:2: rule__GSSProtocolPacketsProtocolPacket__Group__3__Impl rule__GSSProtocolPacketsProtocolPacket__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_5);
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
    // InternalPROTOCOL_PACKETS.g:963:1: rule__GSSProtocolPacketsProtocolPacket__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:967:1: ( ( ':=' ) )
            // InternalPROTOCOL_PACKETS.g:968:1: ( ':=' )
            {
            // InternalPROTOCOL_PACKETS.g:968:1: ( ':=' )
            // InternalPROTOCOL_PACKETS.g:969:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPROTOCOL_PACKETS.g:978:1: rule__GSSProtocolPacketsProtocolPacket__Group__4 : rule__GSSProtocolPacketsProtocolPacket__Group__4__Impl rule__GSSProtocolPacketsProtocolPacket__Group__5 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:982:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__4__Impl rule__GSSProtocolPacketsProtocolPacket__Group__5 )
            // InternalPROTOCOL_PACKETS.g:983:2: rule__GSSProtocolPacketsProtocolPacket__Group__4__Impl rule__GSSProtocolPacketsProtocolPacket__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalPROTOCOL_PACKETS.g:990:1: rule__GSSProtocolPacketsProtocolPacket__Group__4__Impl : ( ( rule__GSSProtocolPacketsProtocolPacket__NameAssignment_4 ) ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:994:1: ( ( ( rule__GSSProtocolPacketsProtocolPacket__NameAssignment_4 ) ) )
            // InternalPROTOCOL_PACKETS.g:995:1: ( ( rule__GSSProtocolPacketsProtocolPacket__NameAssignment_4 ) )
            {
            // InternalPROTOCOL_PACKETS.g:995:1: ( ( rule__GSSProtocolPacketsProtocolPacket__NameAssignment_4 ) )
            // InternalPROTOCOL_PACKETS.g:996:2: ( rule__GSSProtocolPacketsProtocolPacket__NameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getNameAssignment_4()); 
            }
            // InternalPROTOCOL_PACKETS.g:997:2: ( rule__GSSProtocolPacketsProtocolPacket__NameAssignment_4 )
            // InternalPROTOCOL_PACKETS.g:997:3: rule__GSSProtocolPacketsProtocolPacket__NameAssignment_4
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
    // InternalPROTOCOL_PACKETS.g:1005:1: rule__GSSProtocolPacketsProtocolPacket__Group__5 : rule__GSSProtocolPacketsProtocolPacket__Group__5__Impl rule__GSSProtocolPacketsProtocolPacket__Group__6 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1009:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__5__Impl rule__GSSProtocolPacketsProtocolPacket__Group__6 )
            // InternalPROTOCOL_PACKETS.g:1010:2: rule__GSSProtocolPacketsProtocolPacket__Group__5__Impl rule__GSSProtocolPacketsProtocolPacket__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalPROTOCOL_PACKETS.g:1017:1: rule__GSSProtocolPacketsProtocolPacket__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1021:1: ( ( ';' ) )
            // InternalPROTOCOL_PACKETS.g:1022:1: ( ';' )
            {
            // InternalPROTOCOL_PACKETS.g:1022:1: ( ';' )
            // InternalPROTOCOL_PACKETS.g:1023:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_5()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPROTOCOL_PACKETS.g:1032:1: rule__GSSProtocolPacketsProtocolPacket__Group__6 : rule__GSSProtocolPacketsProtocolPacket__Group__6__Impl rule__GSSProtocolPacketsProtocolPacket__Group__7 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1036:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__6__Impl rule__GSSProtocolPacketsProtocolPacket__Group__7 )
            // InternalPROTOCOL_PACKETS.g:1037:2: rule__GSSProtocolPacketsProtocolPacket__Group__6__Impl rule__GSSProtocolPacketsProtocolPacket__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalPROTOCOL_PACKETS.g:1044:1: rule__GSSProtocolPacketsProtocolPacket__Group__6__Impl : ( 'ifRef' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1048:1: ( ( 'ifRef' ) )
            // InternalPROTOCOL_PACKETS.g:1049:1: ( 'ifRef' )
            {
            // InternalPROTOCOL_PACKETS.g:1049:1: ( 'ifRef' )
            // InternalPROTOCOL_PACKETS.g:1050:2: 'ifRef'
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
    // InternalPROTOCOL_PACKETS.g:1059:1: rule__GSSProtocolPacketsProtocolPacket__Group__7 : rule__GSSProtocolPacketsProtocolPacket__Group__7__Impl rule__GSSProtocolPacketsProtocolPacket__Group__8 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1063:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__7__Impl rule__GSSProtocolPacketsProtocolPacket__Group__8 )
            // InternalPROTOCOL_PACKETS.g:1064:2: rule__GSSProtocolPacketsProtocolPacket__Group__7__Impl rule__GSSProtocolPacketsProtocolPacket__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalPROTOCOL_PACKETS.g:1071:1: rule__GSSProtocolPacketsProtocolPacket__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1075:1: ( ( ':=' ) )
            // InternalPROTOCOL_PACKETS.g:1076:1: ( ':=' )
            {
            // InternalPROTOCOL_PACKETS.g:1076:1: ( ':=' )
            // InternalPROTOCOL_PACKETS.g:1077:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPROTOCOL_PACKETS.g:1086:1: rule__GSSProtocolPacketsProtocolPacket__Group__8 : rule__GSSProtocolPacketsProtocolPacket__Group__8__Impl rule__GSSProtocolPacketsProtocolPacket__Group__9 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1090:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__8__Impl rule__GSSProtocolPacketsProtocolPacket__Group__9 )
            // InternalPROTOCOL_PACKETS.g:1091:2: rule__GSSProtocolPacketsProtocolPacket__Group__8__Impl rule__GSSProtocolPacketsProtocolPacket__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalPROTOCOL_PACKETS.g:1098:1: rule__GSSProtocolPacketsProtocolPacket__Group__8__Impl : ( ( rule__GSSProtocolPacketsProtocolPacket__IfRefAssignment_8 ) ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1102:1: ( ( ( rule__GSSProtocolPacketsProtocolPacket__IfRefAssignment_8 ) ) )
            // InternalPROTOCOL_PACKETS.g:1103:1: ( ( rule__GSSProtocolPacketsProtocolPacket__IfRefAssignment_8 ) )
            {
            // InternalPROTOCOL_PACKETS.g:1103:1: ( ( rule__GSSProtocolPacketsProtocolPacket__IfRefAssignment_8 ) )
            // InternalPROTOCOL_PACKETS.g:1104:2: ( rule__GSSProtocolPacketsProtocolPacket__IfRefAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getIfRefAssignment_8()); 
            }
            // InternalPROTOCOL_PACKETS.g:1105:2: ( rule__GSSProtocolPacketsProtocolPacket__IfRefAssignment_8 )
            // InternalPROTOCOL_PACKETS.g:1105:3: rule__GSSProtocolPacketsProtocolPacket__IfRefAssignment_8
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
    // InternalPROTOCOL_PACKETS.g:1113:1: rule__GSSProtocolPacketsProtocolPacket__Group__9 : rule__GSSProtocolPacketsProtocolPacket__Group__9__Impl rule__GSSProtocolPacketsProtocolPacket__Group__10 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1117:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__9__Impl rule__GSSProtocolPacketsProtocolPacket__Group__10 )
            // InternalPROTOCOL_PACKETS.g:1118:2: rule__GSSProtocolPacketsProtocolPacket__Group__9__Impl rule__GSSProtocolPacketsProtocolPacket__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_18);
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
    // InternalPROTOCOL_PACKETS.g:1125:1: rule__GSSProtocolPacketsProtocolPacket__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1129:1: ( ( ';' ) )
            // InternalPROTOCOL_PACKETS.g:1130:1: ( ';' )
            {
            // InternalPROTOCOL_PACKETS.g:1130:1: ( ';' )
            // InternalPROTOCOL_PACKETS.g:1131:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_9()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPROTOCOL_PACKETS.g:1140:1: rule__GSSProtocolPacketsProtocolPacket__Group__10 : rule__GSSProtocolPacketsProtocolPacket__Group__10__Impl rule__GSSProtocolPacketsProtocolPacket__Group__11 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1144:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__10__Impl rule__GSSProtocolPacketsProtocolPacket__Group__11 )
            // InternalPROTOCOL_PACKETS.g:1145:2: rule__GSSProtocolPacketsProtocolPacket__Group__10__Impl rule__GSSProtocolPacketsProtocolPacket__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalPROTOCOL_PACKETS.g:1152:1: rule__GSSProtocolPacketsProtocolPacket__Group__10__Impl : ( 'levelRef' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1156:1: ( ( 'levelRef' ) )
            // InternalPROTOCOL_PACKETS.g:1157:1: ( 'levelRef' )
            {
            // InternalPROTOCOL_PACKETS.g:1157:1: ( 'levelRef' )
            // InternalPROTOCOL_PACKETS.g:1158:2: 'levelRef'
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
    // InternalPROTOCOL_PACKETS.g:1167:1: rule__GSSProtocolPacketsProtocolPacket__Group__11 : rule__GSSProtocolPacketsProtocolPacket__Group__11__Impl rule__GSSProtocolPacketsProtocolPacket__Group__12 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1171:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__11__Impl rule__GSSProtocolPacketsProtocolPacket__Group__12 )
            // InternalPROTOCOL_PACKETS.g:1172:2: rule__GSSProtocolPacketsProtocolPacket__Group__11__Impl rule__GSSProtocolPacketsProtocolPacket__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalPROTOCOL_PACKETS.g:1179:1: rule__GSSProtocolPacketsProtocolPacket__Group__11__Impl : ( ':=' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1183:1: ( ( ':=' ) )
            // InternalPROTOCOL_PACKETS.g:1184:1: ( ':=' )
            {
            // InternalPROTOCOL_PACKETS.g:1184:1: ( ':=' )
            // InternalPROTOCOL_PACKETS.g:1185:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_11()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPROTOCOL_PACKETS.g:1194:1: rule__GSSProtocolPacketsProtocolPacket__Group__12 : rule__GSSProtocolPacketsProtocolPacket__Group__12__Impl rule__GSSProtocolPacketsProtocolPacket__Group__13 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1198:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__12__Impl rule__GSSProtocolPacketsProtocolPacket__Group__13 )
            // InternalPROTOCOL_PACKETS.g:1199:2: rule__GSSProtocolPacketsProtocolPacket__Group__12__Impl rule__GSSProtocolPacketsProtocolPacket__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalPROTOCOL_PACKETS.g:1206:1: rule__GSSProtocolPacketsProtocolPacket__Group__12__Impl : ( ( rule__GSSProtocolPacketsProtocolPacket__LevelRefAssignment_12 ) ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1210:1: ( ( ( rule__GSSProtocolPacketsProtocolPacket__LevelRefAssignment_12 ) ) )
            // InternalPROTOCOL_PACKETS.g:1211:1: ( ( rule__GSSProtocolPacketsProtocolPacket__LevelRefAssignment_12 ) )
            {
            // InternalPROTOCOL_PACKETS.g:1211:1: ( ( rule__GSSProtocolPacketsProtocolPacket__LevelRefAssignment_12 ) )
            // InternalPROTOCOL_PACKETS.g:1212:2: ( rule__GSSProtocolPacketsProtocolPacket__LevelRefAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getLevelRefAssignment_12()); 
            }
            // InternalPROTOCOL_PACKETS.g:1213:2: ( rule__GSSProtocolPacketsProtocolPacket__LevelRefAssignment_12 )
            // InternalPROTOCOL_PACKETS.g:1213:3: rule__GSSProtocolPacketsProtocolPacket__LevelRefAssignment_12
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
    // InternalPROTOCOL_PACKETS.g:1221:1: rule__GSSProtocolPacketsProtocolPacket__Group__13 : rule__GSSProtocolPacketsProtocolPacket__Group__13__Impl rule__GSSProtocolPacketsProtocolPacket__Group__14 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1225:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__13__Impl rule__GSSProtocolPacketsProtocolPacket__Group__14 )
            // InternalPROTOCOL_PACKETS.g:1226:2: rule__GSSProtocolPacketsProtocolPacket__Group__13__Impl rule__GSSProtocolPacketsProtocolPacket__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalPROTOCOL_PACKETS.g:1233:1: rule__GSSProtocolPacketsProtocolPacket__Group__13__Impl : ( ';' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1237:1: ( ( ';' ) )
            // InternalPROTOCOL_PACKETS.g:1238:1: ( ';' )
            {
            // InternalPROTOCOL_PACKETS.g:1238:1: ( ';' )
            // InternalPROTOCOL_PACKETS.g:1239:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_13()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPROTOCOL_PACKETS.g:1248:1: rule__GSSProtocolPacketsProtocolPacket__Group__14 : rule__GSSProtocolPacketsProtocolPacket__Group__14__Impl rule__GSSProtocolPacketsProtocolPacket__Group__15 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1252:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__14__Impl rule__GSSProtocolPacketsProtocolPacket__Group__15 )
            // InternalPROTOCOL_PACKETS.g:1253:2: rule__GSSProtocolPacketsProtocolPacket__Group__14__Impl rule__GSSProtocolPacketsProtocolPacket__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalPROTOCOL_PACKETS.g:1260:1: rule__GSSProtocolPacketsProtocolPacket__Group__14__Impl : ( 'export' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1264:1: ( ( 'export' ) )
            // InternalPROTOCOL_PACKETS.g:1265:1: ( 'export' )
            {
            // InternalPROTOCOL_PACKETS.g:1265:1: ( 'export' )
            // InternalPROTOCOL_PACKETS.g:1266:2: 'export'
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
    // InternalPROTOCOL_PACKETS.g:1275:1: rule__GSSProtocolPacketsProtocolPacket__Group__15 : rule__GSSProtocolPacketsProtocolPacket__Group__15__Impl rule__GSSProtocolPacketsProtocolPacket__Group__16 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1279:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__15__Impl rule__GSSProtocolPacketsProtocolPacket__Group__16 )
            // InternalPROTOCOL_PACKETS.g:1280:2: rule__GSSProtocolPacketsProtocolPacket__Group__15__Impl rule__GSSProtocolPacketsProtocolPacket__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalPROTOCOL_PACKETS.g:1287:1: rule__GSSProtocolPacketsProtocolPacket__Group__15__Impl : ( ':=' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1291:1: ( ( ':=' ) )
            // InternalPROTOCOL_PACKETS.g:1292:1: ( ':=' )
            {
            // InternalPROTOCOL_PACKETS.g:1292:1: ( ':=' )
            // InternalPROTOCOL_PACKETS.g:1293:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_15()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPROTOCOL_PACKETS.g:1302:1: rule__GSSProtocolPacketsProtocolPacket__Group__16 : rule__GSSProtocolPacketsProtocolPacket__Group__16__Impl rule__GSSProtocolPacketsProtocolPacket__Group__17 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1306:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__16__Impl rule__GSSProtocolPacketsProtocolPacket__Group__17 )
            // InternalPROTOCOL_PACKETS.g:1307:2: rule__GSSProtocolPacketsProtocolPacket__Group__16__Impl rule__GSSProtocolPacketsProtocolPacket__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalPROTOCOL_PACKETS.g:1314:1: rule__GSSProtocolPacketsProtocolPacket__Group__16__Impl : ( ( rule__GSSProtocolPacketsProtocolPacket__ExportAssignment_16 ) ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1318:1: ( ( ( rule__GSSProtocolPacketsProtocolPacket__ExportAssignment_16 ) ) )
            // InternalPROTOCOL_PACKETS.g:1319:1: ( ( rule__GSSProtocolPacketsProtocolPacket__ExportAssignment_16 ) )
            {
            // InternalPROTOCOL_PACKETS.g:1319:1: ( ( rule__GSSProtocolPacketsProtocolPacket__ExportAssignment_16 ) )
            // InternalPROTOCOL_PACKETS.g:1320:2: ( rule__GSSProtocolPacketsProtocolPacket__ExportAssignment_16 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getExportAssignment_16()); 
            }
            // InternalPROTOCOL_PACKETS.g:1321:2: ( rule__GSSProtocolPacketsProtocolPacket__ExportAssignment_16 )
            // InternalPROTOCOL_PACKETS.g:1321:3: rule__GSSProtocolPacketsProtocolPacket__ExportAssignment_16
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
    // InternalPROTOCOL_PACKETS.g:1329:1: rule__GSSProtocolPacketsProtocolPacket__Group__17 : rule__GSSProtocolPacketsProtocolPacket__Group__17__Impl rule__GSSProtocolPacketsProtocolPacket__Group__18 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1333:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__17__Impl rule__GSSProtocolPacketsProtocolPacket__Group__18 )
            // InternalPROTOCOL_PACKETS.g:1334:2: rule__GSSProtocolPacketsProtocolPacket__Group__17__Impl rule__GSSProtocolPacketsProtocolPacket__Group__18
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalPROTOCOL_PACKETS.g:1341:1: rule__GSSProtocolPacketsProtocolPacket__Group__17__Impl : ( ';' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1345:1: ( ( ';' ) )
            // InternalPROTOCOL_PACKETS.g:1346:1: ( ';' )
            {
            // InternalPROTOCOL_PACKETS.g:1346:1: ( ';' )
            // InternalPROTOCOL_PACKETS.g:1347:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_17()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPROTOCOL_PACKETS.g:1356:1: rule__GSSProtocolPacketsProtocolPacket__Group__18 : rule__GSSProtocolPacketsProtocolPacket__Group__18__Impl rule__GSSProtocolPacketsProtocolPacket__Group__19 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1360:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__18__Impl rule__GSSProtocolPacketsProtocolPacket__Group__19 )
            // InternalPROTOCOL_PACKETS.g:1361:2: rule__GSSProtocolPacketsProtocolPacket__Group__18__Impl rule__GSSProtocolPacketsProtocolPacket__Group__19
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalPROTOCOL_PACKETS.g:1368:1: rule__GSSProtocolPacketsProtocolPacket__Group__18__Impl : ( 'format' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1372:1: ( ( 'format' ) )
            // InternalPROTOCOL_PACKETS.g:1373:1: ( 'format' )
            {
            // InternalPROTOCOL_PACKETS.g:1373:1: ( 'format' )
            // InternalPROTOCOL_PACKETS.g:1374:2: 'format'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getFormatKeyword_18()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getFormatKeyword_18()); 
            }

            }


            }

        }
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
    // InternalPROTOCOL_PACKETS.g:1383:1: rule__GSSProtocolPacketsProtocolPacket__Group__19 : rule__GSSProtocolPacketsProtocolPacket__Group__19__Impl rule__GSSProtocolPacketsProtocolPacket__Group__20 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1387:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__19__Impl rule__GSSProtocolPacketsProtocolPacket__Group__20 )
            // InternalPROTOCOL_PACKETS.g:1388:2: rule__GSSProtocolPacketsProtocolPacket__Group__19__Impl rule__GSSProtocolPacketsProtocolPacket__Group__20
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
    // InternalPROTOCOL_PACKETS.g:1395:1: rule__GSSProtocolPacketsProtocolPacket__Group__19__Impl : ( ':=' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1399:1: ( ( ':=' ) )
            // InternalPROTOCOL_PACKETS.g:1400:1: ( ':=' )
            {
            // InternalPROTOCOL_PACKETS.g:1400:1: ( ':=' )
            // InternalPROTOCOL_PACKETS.g:1401:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_19()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_19()); 
            }

            }


            }

        }
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
    // InternalPROTOCOL_PACKETS.g:1410:1: rule__GSSProtocolPacketsProtocolPacket__Group__20 : rule__GSSProtocolPacketsProtocolPacket__Group__20__Impl rule__GSSProtocolPacketsProtocolPacket__Group__21 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1414:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__20__Impl rule__GSSProtocolPacketsProtocolPacket__Group__21 )
            // InternalPROTOCOL_PACKETS.g:1415:2: rule__GSSProtocolPacketsProtocolPacket__Group__20__Impl rule__GSSProtocolPacketsProtocolPacket__Group__21
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSProtocolPacketsProtocolPacket__Group__20__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__Group__21();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalPROTOCOL_PACKETS.g:1422:1: rule__GSSProtocolPacketsProtocolPacket__Group__20__Impl : ( ( rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_20 ) ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1426:1: ( ( ( rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_20 ) ) )
            // InternalPROTOCOL_PACKETS.g:1427:1: ( ( rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_20 ) )
            {
            // InternalPROTOCOL_PACKETS.g:1427:1: ( ( rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_20 ) )
            // InternalPROTOCOL_PACKETS.g:1428:2: ( rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_20 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getFormatAssignment_20()); 
            }
            // InternalPROTOCOL_PACKETS.g:1429:2: ( rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_20 )
            // InternalPROTOCOL_PACKETS.g:1429:3: rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_20
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_20();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getFormatAssignment_20()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__21"
    // InternalPROTOCOL_PACKETS.g:1437:1: rule__GSSProtocolPacketsProtocolPacket__Group__21 : rule__GSSProtocolPacketsProtocolPacket__Group__21__Impl rule__GSSProtocolPacketsProtocolPacket__Group__22 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1441:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__21__Impl rule__GSSProtocolPacketsProtocolPacket__Group__22 )
            // InternalPROTOCOL_PACKETS.g:1442:2: rule__GSSProtocolPacketsProtocolPacket__Group__21__Impl rule__GSSProtocolPacketsProtocolPacket__Group__22
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSProtocolPacketsProtocolPacket__Group__21__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__Group__22();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__21"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__21__Impl"
    // InternalPROTOCOL_PACKETS.g:1449:1: rule__GSSProtocolPacketsProtocolPacket__Group__21__Impl : ( ';' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1453:1: ( ( ';' ) )
            // InternalPROTOCOL_PACKETS.g:1454:1: ( ';' )
            {
            // InternalPROTOCOL_PACKETS.g:1454:1: ( ';' )
            // InternalPROTOCOL_PACKETS.g:1455:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_21()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_21()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__21__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__22"
    // InternalPROTOCOL_PACKETS.g:1464:1: rule__GSSProtocolPacketsProtocolPacket__Group__22 : rule__GSSProtocolPacketsProtocolPacket__Group__22__Impl rule__GSSProtocolPacketsProtocolPacket__Group__23 ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1468:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__22__Impl rule__GSSProtocolPacketsProtocolPacket__Group__23 )
            // InternalPROTOCOL_PACKETS.g:1469:2: rule__GSSProtocolPacketsProtocolPacket__Group__22__Impl rule__GSSProtocolPacketsProtocolPacket__Group__23
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__GSSProtocolPacketsProtocolPacket__Group__22__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__Group__23();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__22"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__22__Impl"
    // InternalPROTOCOL_PACKETS.g:1476:1: rule__GSSProtocolPacketsProtocolPacket__Group__22__Impl : ( '}' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1480:1: ( ( '}' ) )
            // InternalPROTOCOL_PACKETS.g:1481:1: ( '}' )
            {
            // InternalPROTOCOL_PACKETS.g:1481:1: ( '}' )
            // InternalPROTOCOL_PACKETS.g:1482:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getRightCurlyBracketKeyword_22()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getRightCurlyBracketKeyword_22()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__22__Impl"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__23"
    // InternalPROTOCOL_PACKETS.g:1491:1: rule__GSSProtocolPacketsProtocolPacket__Group__23 : rule__GSSProtocolPacketsProtocolPacket__Group__23__Impl ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1495:1: ( rule__GSSProtocolPacketsProtocolPacket__Group__23__Impl )
            // InternalPROTOCOL_PACKETS.g:1496:2: rule__GSSProtocolPacketsProtocolPacket__Group__23__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSProtocolPacketsProtocolPacket__Group__23__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__23"


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__Group__23__Impl"
    // InternalPROTOCOL_PACKETS.g:1502:1: rule__GSSProtocolPacketsProtocolPacket__Group__23__Impl : ( ';' ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1506:1: ( ( ';' ) )
            // InternalPROTOCOL_PACKETS.g:1507:1: ( ';' )
            {
            // InternalPROTOCOL_PACKETS.g:1507:1: ( ';' )
            // InternalPROTOCOL_PACKETS.g:1508:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_23()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_23()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__Group__23__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalPROTOCOL_PACKETS.g:1518:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1522:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalPROTOCOL_PACKETS.g:1523:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalPROTOCOL_PACKETS.g:1530:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1534:1: ( ( RULE_ID ) )
            // InternalPROTOCOL_PACKETS.g:1535:1: ( RULE_ID )
            {
            // InternalPROTOCOL_PACKETS.g:1535:1: ( RULE_ID )
            // InternalPROTOCOL_PACKETS.g:1536:2: RULE_ID
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
    // InternalPROTOCOL_PACKETS.g:1545:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1549:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalPROTOCOL_PACKETS.g:1550:2: rule__QualifiedName__Group__1__Impl
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
    // InternalPROTOCOL_PACKETS.g:1556:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1560:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalPROTOCOL_PACKETS.g:1561:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalPROTOCOL_PACKETS.g:1561:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalPROTOCOL_PACKETS.g:1562:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalPROTOCOL_PACKETS.g:1563:2: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPROTOCOL_PACKETS.g:1563:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_22);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalPROTOCOL_PACKETS.g:1572:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1576:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalPROTOCOL_PACKETS.g:1577:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalPROTOCOL_PACKETS.g:1584:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1588:1: ( ( '.' ) )
            // InternalPROTOCOL_PACKETS.g:1589:1: ( '.' )
            {
            // InternalPROTOCOL_PACKETS.g:1589:1: ( '.' )
            // InternalPROTOCOL_PACKETS.g:1590:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPROTOCOL_PACKETS.g:1599:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1603:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalPROTOCOL_PACKETS.g:1604:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalPROTOCOL_PACKETS.g:1610:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1614:1: ( ( RULE_ID ) )
            // InternalPROTOCOL_PACKETS.g:1615:1: ( RULE_ID )
            {
            // InternalPROTOCOL_PACKETS.g:1615:1: ( RULE_ID )
            // InternalPROTOCOL_PACKETS.g:1616:2: RULE_ID
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
    // InternalPROTOCOL_PACKETS.g:1626:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1630:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalPROTOCOL_PACKETS.g:1631:2: rule__Version__Group__0__Impl rule__Version__Group__1
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
    // InternalPROTOCOL_PACKETS.g:1638:1: rule__Version__Group__0__Impl : ( ( rule__Version__Alternatives_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1642:1: ( ( ( rule__Version__Alternatives_0 ) ) )
            // InternalPROTOCOL_PACKETS.g:1643:1: ( ( rule__Version__Alternatives_0 ) )
            {
            // InternalPROTOCOL_PACKETS.g:1643:1: ( ( rule__Version__Alternatives_0 ) )
            // InternalPROTOCOL_PACKETS.g:1644:2: ( rule__Version__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_0()); 
            }
            // InternalPROTOCOL_PACKETS.g:1645:2: ( rule__Version__Alternatives_0 )
            // InternalPROTOCOL_PACKETS.g:1645:3: rule__Version__Alternatives_0
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
    // InternalPROTOCOL_PACKETS.g:1653:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1657:1: ( rule__Version__Group__1__Impl )
            // InternalPROTOCOL_PACKETS.g:1658:2: rule__Version__Group__1__Impl
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
    // InternalPROTOCOL_PACKETS.g:1664:1: rule__Version__Group__1__Impl : ( ( rule__Version__Group_1__0 )* ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1668:1: ( ( ( rule__Version__Group_1__0 )* ) )
            // InternalPROTOCOL_PACKETS.g:1669:1: ( ( rule__Version__Group_1__0 )* )
            {
            // InternalPROTOCOL_PACKETS.g:1669:1: ( ( rule__Version__Group_1__0 )* )
            // InternalPROTOCOL_PACKETS.g:1670:2: ( rule__Version__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1()); 
            }
            // InternalPROTOCOL_PACKETS.g:1671:2: ( rule__Version__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPROTOCOL_PACKETS.g:1671:3: rule__Version__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_22);
            	    rule__Version__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalPROTOCOL_PACKETS.g:1680:1: rule__Version__Group_0_1__0 : rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 ;
    public final void rule__Version__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1684:1: ( rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 )
            // InternalPROTOCOL_PACKETS.g:1685:2: rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1
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
    // InternalPROTOCOL_PACKETS.g:1692:1: rule__Version__Group_0_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1696:1: ( ( ( RULE_INT )? ) )
            // InternalPROTOCOL_PACKETS.g:1697:1: ( ( RULE_INT )? )
            {
            // InternalPROTOCOL_PACKETS.g:1697:1: ( ( RULE_INT )? )
            // InternalPROTOCOL_PACKETS.g:1698:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
            }
            // InternalPROTOCOL_PACKETS.g:1699:2: ( RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPROTOCOL_PACKETS.g:1699:3: RULE_INT
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
    // InternalPROTOCOL_PACKETS.g:1707:1: rule__Version__Group_0_1__1 : rule__Version__Group_0_1__1__Impl ;
    public final void rule__Version__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1711:1: ( rule__Version__Group_0_1__1__Impl )
            // InternalPROTOCOL_PACKETS.g:1712:2: rule__Version__Group_0_1__1__Impl
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
    // InternalPROTOCOL_PACKETS.g:1718:1: rule__Version__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1722:1: ( ( RULE_ID ) )
            // InternalPROTOCOL_PACKETS.g:1723:1: ( RULE_ID )
            {
            // InternalPROTOCOL_PACKETS.g:1723:1: ( RULE_ID )
            // InternalPROTOCOL_PACKETS.g:1724:2: RULE_ID
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
    // InternalPROTOCOL_PACKETS.g:1734:1: rule__Version__Group_1__0 : rule__Version__Group_1__0__Impl rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1738:1: ( rule__Version__Group_1__0__Impl rule__Version__Group_1__1 )
            // InternalPROTOCOL_PACKETS.g:1739:2: rule__Version__Group_1__0__Impl rule__Version__Group_1__1
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
    // InternalPROTOCOL_PACKETS.g:1746:1: rule__Version__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1750:1: ( ( '.' ) )
            // InternalPROTOCOL_PACKETS.g:1751:1: ( '.' )
            {
            // InternalPROTOCOL_PACKETS.g:1751:1: ( '.' )
            // InternalPROTOCOL_PACKETS.g:1752:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPROTOCOL_PACKETS.g:1761:1: rule__Version__Group_1__1 : rule__Version__Group_1__1__Impl ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1765:1: ( rule__Version__Group_1__1__Impl )
            // InternalPROTOCOL_PACKETS.g:1766:2: rule__Version__Group_1__1__Impl
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
    // InternalPROTOCOL_PACKETS.g:1772:1: rule__Version__Group_1__1__Impl : ( ( rule__Version__Alternatives_1_1 ) ) ;
    public final void rule__Version__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1776:1: ( ( ( rule__Version__Alternatives_1_1 ) ) )
            // InternalPROTOCOL_PACKETS.g:1777:1: ( ( rule__Version__Alternatives_1_1 ) )
            {
            // InternalPROTOCOL_PACKETS.g:1777:1: ( ( rule__Version__Alternatives_1_1 ) )
            // InternalPROTOCOL_PACKETS.g:1778:2: ( rule__Version__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_1_1()); 
            }
            // InternalPROTOCOL_PACKETS.g:1779:2: ( rule__Version__Alternatives_1_1 )
            // InternalPROTOCOL_PACKETS.g:1779:3: rule__Version__Alternatives_1_1
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
    // InternalPROTOCOL_PACKETS.g:1788:1: rule__Version__Group_1_1_1__0 : rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 ;
    public final void rule__Version__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1792:1: ( rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 )
            // InternalPROTOCOL_PACKETS.g:1793:2: rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1
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
    // InternalPROTOCOL_PACKETS.g:1800:1: rule__Version__Group_1_1_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1804:1: ( ( ( RULE_INT )? ) )
            // InternalPROTOCOL_PACKETS.g:1805:1: ( ( RULE_INT )? )
            {
            // InternalPROTOCOL_PACKETS.g:1805:1: ( ( RULE_INT )? )
            // InternalPROTOCOL_PACKETS.g:1806:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
            }
            // InternalPROTOCOL_PACKETS.g:1807:2: ( RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPROTOCOL_PACKETS.g:1807:3: RULE_INT
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
    // InternalPROTOCOL_PACKETS.g:1815:1: rule__Version__Group_1_1_1__1 : rule__Version__Group_1_1_1__1__Impl ;
    public final void rule__Version__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1819:1: ( rule__Version__Group_1_1_1__1__Impl )
            // InternalPROTOCOL_PACKETS.g:1820:2: rule__Version__Group_1_1_1__1__Impl
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
    // InternalPROTOCOL_PACKETS.g:1826:1: rule__Version__Group_1_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1830:1: ( ( RULE_ID ) )
            // InternalPROTOCOL_PACKETS.g:1831:1: ( RULE_ID )
            {
            // InternalPROTOCOL_PACKETS.g:1831:1: ( RULE_ID )
            // InternalPROTOCOL_PACKETS.g:1832:2: RULE_ID
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
    // InternalPROTOCOL_PACKETS.g:1842:1: rule__VersionedQualifiedName__Group__0 : rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 ;
    public final void rule__VersionedQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1846:1: ( rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 )
            // InternalPROTOCOL_PACKETS.g:1847:2: rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1
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
    // InternalPROTOCOL_PACKETS.g:1854:1: rule__VersionedQualifiedName__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__VersionedQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1858:1: ( ( ruleQualifiedName ) )
            // InternalPROTOCOL_PACKETS.g:1859:1: ( ruleQualifiedName )
            {
            // InternalPROTOCOL_PACKETS.g:1859:1: ( ruleQualifiedName )
            // InternalPROTOCOL_PACKETS.g:1860:2: ruleQualifiedName
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
    // InternalPROTOCOL_PACKETS.g:1869:1: rule__VersionedQualifiedName__Group__1 : rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 ;
    public final void rule__VersionedQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1873:1: ( rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 )
            // InternalPROTOCOL_PACKETS.g:1874:2: rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2
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
    // InternalPROTOCOL_PACKETS.g:1881:1: rule__VersionedQualifiedName__Group__1__Impl : ( '(' ) ;
    public final void rule__VersionedQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1885:1: ( ( '(' ) )
            // InternalPROTOCOL_PACKETS.g:1886:1: ( '(' )
            {
            // InternalPROTOCOL_PACKETS.g:1886:1: ( '(' )
            // InternalPROTOCOL_PACKETS.g:1887:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPROTOCOL_PACKETS.g:1896:1: rule__VersionedQualifiedName__Group__2 : rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 ;
    public final void rule__VersionedQualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1900:1: ( rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 )
            // InternalPROTOCOL_PACKETS.g:1901:2: rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3
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
    // InternalPROTOCOL_PACKETS.g:1908:1: rule__VersionedQualifiedName__Group__2__Impl : ( ruleVersion ) ;
    public final void rule__VersionedQualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1912:1: ( ( ruleVersion ) )
            // InternalPROTOCOL_PACKETS.g:1913:1: ( ruleVersion )
            {
            // InternalPROTOCOL_PACKETS.g:1913:1: ( ruleVersion )
            // InternalPROTOCOL_PACKETS.g:1914:2: ruleVersion
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
    // InternalPROTOCOL_PACKETS.g:1923:1: rule__VersionedQualifiedName__Group__3 : rule__VersionedQualifiedName__Group__3__Impl ;
    public final void rule__VersionedQualifiedName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1927:1: ( rule__VersionedQualifiedName__Group__3__Impl )
            // InternalPROTOCOL_PACKETS.g:1928:2: rule__VersionedQualifiedName__Group__3__Impl
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
    // InternalPROTOCOL_PACKETS.g:1934:1: rule__VersionedQualifiedName__Group__3__Impl : ( ')' ) ;
    public final void rule__VersionedQualifiedName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1938:1: ( ( ')' ) )
            // InternalPROTOCOL_PACKETS.g:1939:1: ( ')' )
            {
            // InternalPROTOCOL_PACKETS.g:1939:1: ( ')' )
            // InternalPROTOCOL_PACKETS.g:1940:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalPROTOCOL_PACKETS.g:1950:1: rule__INTEGER__Group_0__0 : rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 ;
    public final void rule__INTEGER__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1954:1: ( rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 )
            // InternalPROTOCOL_PACKETS.g:1955:2: rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1
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
    // InternalPROTOCOL_PACKETS.g:1962:1: rule__INTEGER__Group_0__0__Impl : ( ( '-' )? ) ;
    public final void rule__INTEGER__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1966:1: ( ( ( '-' )? ) )
            // InternalPROTOCOL_PACKETS.g:1967:1: ( ( '-' )? )
            {
            // InternalPROTOCOL_PACKETS.g:1967:1: ( ( '-' )? )
            // InternalPROTOCOL_PACKETS.g:1968:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); 
            }
            // InternalPROTOCOL_PACKETS.g:1969:2: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPROTOCOL_PACKETS.g:1969:3: '-'
                    {
                    match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalPROTOCOL_PACKETS.g:1977:1: rule__INTEGER__Group_0__1 : rule__INTEGER__Group_0__1__Impl ;
    public final void rule__INTEGER__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1981:1: ( rule__INTEGER__Group_0__1__Impl )
            // InternalPROTOCOL_PACKETS.g:1982:2: rule__INTEGER__Group_0__1__Impl
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
    // InternalPROTOCOL_PACKETS.g:1988:1: rule__INTEGER__Group_0__1__Impl : ( RULE_INT ) ;
    public final void rule__INTEGER__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:1992:1: ( ( RULE_INT ) )
            // InternalPROTOCOL_PACKETS.g:1993:1: ( RULE_INT )
            {
            // InternalPROTOCOL_PACKETS.g:1993:1: ( RULE_INT )
            // InternalPROTOCOL_PACKETS.g:1994:2: RULE_INT
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
    // InternalPROTOCOL_PACKETS.g:2004:1: rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3 : rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__0 {...}?;
    public final void rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3());
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2009:1: ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__0 {...}?)
            // InternalPROTOCOL_PACKETS.g:2010:2: rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__0 {...}?
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
    // InternalPROTOCOL_PACKETS.g:2018:1: rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2023:1: ( ( ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0 ) ) ) ) ) )
            // InternalPROTOCOL_PACKETS.g:2024:3: ( ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0 ) ) ) ) )
            {
            // InternalPROTOCOL_PACKETS.g:2024:3: ( ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0 ) ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( LA11_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0) ) {
                alt11=1;
            }
            else if ( LA11_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 1) ) {
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
                    // InternalPROTOCOL_PACKETS.g:2025:3: ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) ) ) )
                    {
                    // InternalPROTOCOL_PACKETS.g:2025:3: ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) ) ) )
                    // InternalPROTOCOL_PACKETS.g:2026:4: {...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalPROTOCOL_PACKETS.g:2026:129: ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) ) )
                    // InternalPROTOCOL_PACKETS.g:2027:5: ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // InternalPROTOCOL_PACKETS.g:2033:5: ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) )
                    // InternalPROTOCOL_PACKETS.g:2034:6: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getGroup_3_0()); 
                    }
                    // InternalPROTOCOL_PACKETS.g:2035:6: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 )
                    // InternalPROTOCOL_PACKETS.g:2035:7: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0
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
                    // InternalPROTOCOL_PACKETS.g:2040:3: ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0 ) ) ) )
                    {
                    // InternalPROTOCOL_PACKETS.g:2040:3: ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0 ) ) ) )
                    // InternalPROTOCOL_PACKETS.g:2041:4: {...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalPROTOCOL_PACKETS.g:2041:129: ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0 ) ) )
                    // InternalPROTOCOL_PACKETS.g:2042:5: ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // InternalPROTOCOL_PACKETS.g:2048:5: ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0 ) )
                    // InternalPROTOCOL_PACKETS.g:2049:6: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getGroup_3_1()); 
                    }
                    // InternalPROTOCOL_PACKETS.g:2050:6: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0 )
                    // InternalPROTOCOL_PACKETS.g:2050:7: rule__GSSProtocolPacketsProtocolPackets__Group_3_1__0
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
    // InternalPROTOCOL_PACKETS.g:2063:1: rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__0 : rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__1 )? ;
    public final void rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2067:1: ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__1 )? )
            // InternalPROTOCOL_PACKETS.g:2068:2: rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalPROTOCOL_PACKETS.g:2069:2: ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( LA12_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0) ) {
                alt12=1;
            }
            else if ( LA12_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 1) ) {
                alt12=1;
            }
            switch (alt12) {
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
    // InternalPROTOCOL_PACKETS.g:2075:1: rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__1 : rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl ;
    public final void rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2079:1: ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl )
            // InternalPROTOCOL_PACKETS.g:2080:2: rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__Impl
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
    // InternalPROTOCOL_PACKETS.g:2087:1: rule__GSSModelFile__ImportsAssignment_0 : ( ruleGSSModelFileImport ) ;
    public final void rule__GSSModelFile__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2091:1: ( ( ruleGSSModelFileImport ) )
            // InternalPROTOCOL_PACKETS.g:2092:2: ( ruleGSSModelFileImport )
            {
            // InternalPROTOCOL_PACKETS.g:2092:2: ( ruleGSSModelFileImport )
            // InternalPROTOCOL_PACKETS.g:2093:3: ruleGSSModelFileImport
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
    // InternalPROTOCOL_PACKETS.g:2102:1: rule__GSSModelFile__ElementAssignment_1 : ( ruleGSSProtocolPacketsProtocolPackets ) ;
    public final void rule__GSSModelFile__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2106:1: ( ( ruleGSSProtocolPacketsProtocolPackets ) )
            // InternalPROTOCOL_PACKETS.g:2107:2: ( ruleGSSProtocolPacketsProtocolPackets )
            {
            // InternalPROTOCOL_PACKETS.g:2107:2: ( ruleGSSProtocolPacketsProtocolPackets )
            // InternalPROTOCOL_PACKETS.g:2108:3: ruleGSSProtocolPacketsProtocolPackets
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


    // $ANTLR start "rule__GSSModelFileImport__ImportURIAssignment_1"
    // InternalPROTOCOL_PACKETS.g:2117:1: rule__GSSModelFileImport__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GSSModelFileImport__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2121:1: ( ( RULE_STRING ) )
            // InternalPROTOCOL_PACKETS.g:2122:2: ( RULE_STRING )
            {
            // InternalPROTOCOL_PACKETS.g:2122:2: ( RULE_STRING )
            // InternalPROTOCOL_PACKETS.g:2123:3: RULE_STRING
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


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPackets__NameAssignment_1"
    // InternalPROTOCOL_PACKETS.g:2132:1: rule__GSSProtocolPacketsProtocolPackets__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2136:1: ( ( RULE_ID ) )
            // InternalPROTOCOL_PACKETS.g:2137:2: ( RULE_ID )
            {
            // InternalPROTOCOL_PACKETS.g:2137:2: ( RULE_ID )
            // InternalPROTOCOL_PACKETS.g:2138:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
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
    // InternalPROTOCOL_PACKETS.g:2147:1: rule__GSSProtocolPacketsProtocolPackets__UriAssignment_3_0_2 : ( ruleQualifiedName ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__UriAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2151:1: ( ( ruleQualifiedName ) )
            // InternalPROTOCOL_PACKETS.g:2152:2: ( ruleQualifiedName )
            {
            // InternalPROTOCOL_PACKETS.g:2152:2: ( ruleQualifiedName )
            // InternalPROTOCOL_PACKETS.g:2153:3: ruleQualifiedName
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
    // InternalPROTOCOL_PACKETS.g:2162:1: rule__GSSProtocolPacketsProtocolPackets__VersionAssignment_3_1_2 : ( ruleVersion ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__VersionAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2166:1: ( ( ruleVersion ) )
            // InternalPROTOCOL_PACKETS.g:2167:2: ( ruleVersion )
            {
            // InternalPROTOCOL_PACKETS.g:2167:2: ( ruleVersion )
            // InternalPROTOCOL_PACKETS.g:2168:3: ruleVersion
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
    // InternalPROTOCOL_PACKETS.g:2177:1: rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4 : ( ruleGSSProtocolPacketsProtocolPacket ) ;
    public final void rule__GSSProtocolPacketsProtocolPackets__ProtocolPacketAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2181:1: ( ( ruleGSSProtocolPacketsProtocolPacket ) )
            // InternalPROTOCOL_PACKETS.g:2182:2: ( ruleGSSProtocolPacketsProtocolPacket )
            {
            // InternalPROTOCOL_PACKETS.g:2182:2: ( ruleGSSProtocolPacketsProtocolPacket )
            // InternalPROTOCOL_PACKETS.g:2183:3: ruleGSSProtocolPacketsProtocolPacket
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
    // InternalPROTOCOL_PACKETS.g:2192:1: rule__GSSProtocolPacketsProtocolPacket__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2196:1: ( ( RULE_STRING ) )
            // InternalPROTOCOL_PACKETS.g:2197:2: ( RULE_STRING )
            {
            // InternalPROTOCOL_PACKETS.g:2197:2: ( RULE_STRING )
            // InternalPROTOCOL_PACKETS.g:2198:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            }

            }


            }

        }
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
    // InternalPROTOCOL_PACKETS.g:2207:1: rule__GSSProtocolPacketsProtocolPacket__IfRefAssignment_8 : ( ruleINTEGER ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__IfRefAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2211:1: ( ( ruleINTEGER ) )
            // InternalPROTOCOL_PACKETS.g:2212:2: ( ruleINTEGER )
            {
            // InternalPROTOCOL_PACKETS.g:2212:2: ( ruleINTEGER )
            // InternalPROTOCOL_PACKETS.g:2213:3: ruleINTEGER
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
    // InternalPROTOCOL_PACKETS.g:2222:1: rule__GSSProtocolPacketsProtocolPacket__LevelRefAssignment_12 : ( ruleINTEGER ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__LevelRefAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2226:1: ( ( ruleINTEGER ) )
            // InternalPROTOCOL_PACKETS.g:2227:2: ( ruleINTEGER )
            {
            // InternalPROTOCOL_PACKETS.g:2227:2: ( ruleINTEGER )
            // InternalPROTOCOL_PACKETS.g:2228:3: ruleINTEGER
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
    // InternalPROTOCOL_PACKETS.g:2237:1: rule__GSSProtocolPacketsProtocolPacket__ExportAssignment_16 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__ExportAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2241:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalPROTOCOL_PACKETS.g:2242:2: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalPROTOCOL_PACKETS.g:2242:2: ( ( ruleVersionedQualifiedName ) )
            // InternalPROTOCOL_PACKETS.g:2243:3: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getExportGSSExportExportCrossReference_16_0()); 
            }
            // InternalPROTOCOL_PACKETS.g:2244:3: ( ruleVersionedQualifiedName )
            // InternalPROTOCOL_PACKETS.g:2245:4: ruleVersionedQualifiedName
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


    // $ANTLR start "rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_20"
    // InternalPROTOCOL_PACKETS.g:2256:1: rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_20 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPROTOCOL_PACKETS.g:2260:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalPROTOCOL_PACKETS.g:2261:2: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalPROTOCOL_PACKETS.g:2261:2: ( ( ruleVersionedQualifiedName ) )
            // InternalPROTOCOL_PACKETS.g:2262:3: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getFormatGSSFormatFormatCrossReference_20_0()); 
            }
            // InternalPROTOCOL_PACKETS.g:2263:3: ( ruleVersionedQualifiedName )
            // InternalPROTOCOL_PACKETS.g:2264:4: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getFormatGSSFormatFormatVersionedQualifiedNameParserRuleCall_20_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getFormatGSSFormatFormatVersionedQualifiedNameParserRuleCall_20_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getFormatGSSFormatFormatCrossReference_20_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSProtocolPacketsProtocolPacket__FormatAssignment_20"

    // $ANTLR start synpred11_InternalPROTOCOL_PACKETS
    public final void synpred11_InternalPROTOCOL_PACKETS_fragment() throws RecognitionException {   
        // InternalPROTOCOL_PACKETS.g:2025:3: ( ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) ) ) ) )
        // InternalPROTOCOL_PACKETS.g:2025:3: ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) ) ) )
        {
        // InternalPROTOCOL_PACKETS.g:2025:3: ({...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) ) ) )
        // InternalPROTOCOL_PACKETS.g:2026:4: {...}? => ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred11_InternalPROTOCOL_PACKETS", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalPROTOCOL_PACKETS.g:2026:129: ( ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) ) )
        // InternalPROTOCOL_PACKETS.g:2027:5: ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0);
        // InternalPROTOCOL_PACKETS.g:2033:5: ( ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 ) )
        // InternalPROTOCOL_PACKETS.g:2034:6: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getGroup_3_0()); 
        }
        // InternalPROTOCOL_PACKETS.g:2035:6: ( rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0 )
        // InternalPROTOCOL_PACKETS.g:2035:7: rule__GSSProtocolPacketsProtocolPackets__Group_3_0__0
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
    // $ANTLR end synpred11_InternalPROTOCOL_PACKETS

    // $ANTLR start synpred12_InternalPROTOCOL_PACKETS
    public final void synpred12_InternalPROTOCOL_PACKETS_fragment() throws RecognitionException {   
        // InternalPROTOCOL_PACKETS.g:2069:2: ( rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__1 )
        // InternalPROTOCOL_PACKETS.g:2069:2: rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSProtocolPacketsProtocolPackets__UnorderedGroup_3__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalPROTOCOL_PACKETS

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
    public final boolean synpred11_InternalPROTOCOL_PACKETS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalPROTOCOL_PACKETS_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000030L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000010L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000000A0002L});
    }


}