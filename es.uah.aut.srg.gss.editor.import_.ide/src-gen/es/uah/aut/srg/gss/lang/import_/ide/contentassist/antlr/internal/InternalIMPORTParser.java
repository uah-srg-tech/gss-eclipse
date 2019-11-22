package es.uah.aut.srg.gss.lang.import_.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.gss.lang.import_.services.IMPORTGrammarAccess;



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
public class InternalIMPORTParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_HEXADECIMAL", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NULL'", "'bits'", "'bytes'", "'import'", "':='", "';'", "'GSSImportImport'", "'{'", "'from'", "'to'", "'}'", "'uri'", "'version'", "'GSSImportDataSource'", "'FieldRef'", "'leftTrim'", "'rightTrim'", "'GSSImportVirtualSize'", "'addSize'", "'unit'", "'.'", "'('", "')'", "'::'", "'-'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
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


        public InternalIMPORTParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIMPORTParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIMPORTParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIMPORT.g"; }


    	private IMPORTGrammarAccess grammarAccess;

    	public void setGrammarAccess(IMPORTGrammarAccess grammarAccess) {
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
    // InternalIMPORT.g:61:1: entryRuleGSSModelFile : ruleGSSModelFile EOF ;
    public final void entryRuleGSSModelFile() throws RecognitionException {
        try {
            // InternalIMPORT.g:62:1: ( ruleGSSModelFile EOF )
            // InternalIMPORT.g:63:1: ruleGSSModelFile EOF
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
    // InternalIMPORT.g:70:1: ruleGSSModelFile : ( ( rule__GSSModelFile__Group__0 ) ) ;
    public final void ruleGSSModelFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:74:2: ( ( ( rule__GSSModelFile__Group__0 ) ) )
            // InternalIMPORT.g:75:2: ( ( rule__GSSModelFile__Group__0 ) )
            {
            // InternalIMPORT.g:75:2: ( ( rule__GSSModelFile__Group__0 ) )
            // InternalIMPORT.g:76:3: ( rule__GSSModelFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getGroup()); 
            }
            // InternalIMPORT.g:77:3: ( rule__GSSModelFile__Group__0 )
            // InternalIMPORT.g:77:4: rule__GSSModelFile__Group__0
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
    // InternalIMPORT.g:86:1: entryRuleGSSModelFileImport : ruleGSSModelFileImport EOF ;
    public final void entryRuleGSSModelFileImport() throws RecognitionException {
        try {
            // InternalIMPORT.g:87:1: ( ruleGSSModelFileImport EOF )
            // InternalIMPORT.g:88:1: ruleGSSModelFileImport EOF
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
    // InternalIMPORT.g:95:1: ruleGSSModelFileImport : ( ( rule__GSSModelFileImport__Group__0 ) ) ;
    public final void ruleGSSModelFileImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:99:2: ( ( ( rule__GSSModelFileImport__Group__0 ) ) )
            // InternalIMPORT.g:100:2: ( ( rule__GSSModelFileImport__Group__0 ) )
            {
            // InternalIMPORT.g:100:2: ( ( rule__GSSModelFileImport__Group__0 ) )
            // InternalIMPORT.g:101:3: ( rule__GSSModelFileImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getGroup()); 
            }
            // InternalIMPORT.g:102:3: ( rule__GSSModelFileImport__Group__0 )
            // InternalIMPORT.g:102:4: rule__GSSModelFileImport__Group__0
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


    // $ANTLR start "entryRuleGSSImportImport"
    // InternalIMPORT.g:111:1: entryRuleGSSImportImport : ruleGSSImportImport EOF ;
    public final void entryRuleGSSImportImport() throws RecognitionException {
        try {
            // InternalIMPORT.g:112:1: ( ruleGSSImportImport EOF )
            // InternalIMPORT.g:113:1: ruleGSSImportImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSImportImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportRule()); 
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
    // $ANTLR end "entryRuleGSSImportImport"


    // $ANTLR start "ruleGSSImportImport"
    // InternalIMPORT.g:120:1: ruleGSSImportImport : ( ( rule__GSSImportImport__Group__0 ) ) ;
    public final void ruleGSSImportImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:124:2: ( ( ( rule__GSSImportImport__Group__0 ) ) )
            // InternalIMPORT.g:125:2: ( ( rule__GSSImportImport__Group__0 ) )
            {
            // InternalIMPORT.g:125:2: ( ( rule__GSSImportImport__Group__0 ) )
            // InternalIMPORT.g:126:3: ( rule__GSSImportImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getGroup()); 
            }
            // InternalIMPORT.g:127:3: ( rule__GSSImportImport__Group__0 )
            // InternalIMPORT.g:127:4: rule__GSSImportImport__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSImportImport"


    // $ANTLR start "entryRuleGSSImportDataSource"
    // InternalIMPORT.g:136:1: entryRuleGSSImportDataSource : ruleGSSImportDataSource EOF ;
    public final void entryRuleGSSImportDataSource() throws RecognitionException {
        try {
            // InternalIMPORT.g:137:1: ( ruleGSSImportDataSource EOF )
            // InternalIMPORT.g:138:1: ruleGSSImportDataSource EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportDataSourceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSImportDataSource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportDataSourceRule()); 
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
    // $ANTLR end "entryRuleGSSImportDataSource"


    // $ANTLR start "ruleGSSImportDataSource"
    // InternalIMPORT.g:145:1: ruleGSSImportDataSource : ( ( rule__GSSImportDataSource__Group__0 ) ) ;
    public final void ruleGSSImportDataSource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:149:2: ( ( ( rule__GSSImportDataSource__Group__0 ) ) )
            // InternalIMPORT.g:150:2: ( ( rule__GSSImportDataSource__Group__0 ) )
            {
            // InternalIMPORT.g:150:2: ( ( rule__GSSImportDataSource__Group__0 ) )
            // InternalIMPORT.g:151:3: ( rule__GSSImportDataSource__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportDataSourceAccess().getGroup()); 
            }
            // InternalIMPORT.g:152:3: ( rule__GSSImportDataSource__Group__0 )
            // InternalIMPORT.g:152:4: rule__GSSImportDataSource__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportDataSource__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportDataSourceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSImportDataSource"


    // $ANTLR start "entryRuleGSSImportVirtualSize"
    // InternalIMPORT.g:161:1: entryRuleGSSImportVirtualSize : ruleGSSImportVirtualSize EOF ;
    public final void entryRuleGSSImportVirtualSize() throws RecognitionException {
        try {
            // InternalIMPORT.g:162:1: ( ruleGSSImportVirtualSize EOF )
            // InternalIMPORT.g:163:1: ruleGSSImportVirtualSize EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGSSImportVirtualSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeRule()); 
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
    // $ANTLR end "entryRuleGSSImportVirtualSize"


    // $ANTLR start "ruleGSSImportVirtualSize"
    // InternalIMPORT.g:170:1: ruleGSSImportVirtualSize : ( ( rule__GSSImportVirtualSize__Group__0 ) ) ;
    public final void ruleGSSImportVirtualSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:174:2: ( ( ( rule__GSSImportVirtualSize__Group__0 ) ) )
            // InternalIMPORT.g:175:2: ( ( rule__GSSImportVirtualSize__Group__0 ) )
            {
            // InternalIMPORT.g:175:2: ( ( rule__GSSImportVirtualSize__Group__0 ) )
            // InternalIMPORT.g:176:3: ( rule__GSSImportVirtualSize__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getGroup()); 
            }
            // InternalIMPORT.g:177:3: ( rule__GSSImportVirtualSize__Group__0 )
            // InternalIMPORT.g:177:4: rule__GSSImportVirtualSize__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSImportVirtualSize"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalIMPORT.g:186:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalIMPORT.g:187:1: ( ruleQualifiedName EOF )
            // InternalIMPORT.g:188:1: ruleQualifiedName EOF
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
    // InternalIMPORT.g:195:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:199:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalIMPORT.g:200:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalIMPORT.g:200:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalIMPORT.g:201:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalIMPORT.g:202:3: ( rule__QualifiedName__Group__0 )
            // InternalIMPORT.g:202:4: rule__QualifiedName__Group__0
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
    // InternalIMPORT.g:211:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalIMPORT.g:212:1: ( ruleVersion EOF )
            // InternalIMPORT.g:213:1: ruleVersion EOF
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
    // InternalIMPORT.g:220:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:224:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalIMPORT.g:225:2: ( ( rule__Version__Group__0 ) )
            {
            // InternalIMPORT.g:225:2: ( ( rule__Version__Group__0 ) )
            // InternalIMPORT.g:226:3: ( rule__Version__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup()); 
            }
            // InternalIMPORT.g:227:3: ( rule__Version__Group__0 )
            // InternalIMPORT.g:227:4: rule__Version__Group__0
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
    // InternalIMPORT.g:236:1: entryRuleVersionedQualifiedName : ruleVersionedQualifiedName EOF ;
    public final void entryRuleVersionedQualifiedName() throws RecognitionException {
        try {
            // InternalIMPORT.g:237:1: ( ruleVersionedQualifiedName EOF )
            // InternalIMPORT.g:238:1: ruleVersionedQualifiedName EOF
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
    // InternalIMPORT.g:245:1: ruleVersionedQualifiedName : ( ( rule__VersionedQualifiedName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:249:2: ( ( ( rule__VersionedQualifiedName__Group__0 ) ) )
            // InternalIMPORT.g:250:2: ( ( rule__VersionedQualifiedName__Group__0 ) )
            {
            // InternalIMPORT.g:250:2: ( ( rule__VersionedQualifiedName__Group__0 ) )
            // InternalIMPORT.g:251:3: ( rule__VersionedQualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); 
            }
            // InternalIMPORT.g:252:3: ( rule__VersionedQualifiedName__Group__0 )
            // InternalIMPORT.g:252:4: rule__VersionedQualifiedName__Group__0
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
    // InternalIMPORT.g:261:1: entryRuleVersionedQualifiedReferenceName : ruleVersionedQualifiedReferenceName EOF ;
    public final void entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        try {
            // InternalIMPORT.g:262:1: ( ruleVersionedQualifiedReferenceName EOF )
            // InternalIMPORT.g:263:1: ruleVersionedQualifiedReferenceName EOF
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
    // InternalIMPORT.g:270:1: ruleVersionedQualifiedReferenceName : ( ( rule__VersionedQualifiedReferenceName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedReferenceName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:274:2: ( ( ( rule__VersionedQualifiedReferenceName__Group__0 ) ) )
            // InternalIMPORT.g:275:2: ( ( rule__VersionedQualifiedReferenceName__Group__0 ) )
            {
            // InternalIMPORT.g:275:2: ( ( rule__VersionedQualifiedReferenceName__Group__0 ) )
            // InternalIMPORT.g:276:3: ( rule__VersionedQualifiedReferenceName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup()); 
            }
            // InternalIMPORT.g:277:3: ( rule__VersionedQualifiedReferenceName__Group__0 )
            // InternalIMPORT.g:277:4: rule__VersionedQualifiedReferenceName__Group__0
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
    // InternalIMPORT.g:286:1: entryRuleINTEGER : ruleINTEGER EOF ;
    public final void entryRuleINTEGER() throws RecognitionException {
        try {
            // InternalIMPORT.g:287:1: ( ruleINTEGER EOF )
            // InternalIMPORT.g:288:1: ruleINTEGER EOF
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
    // InternalIMPORT.g:295:1: ruleINTEGER : ( ( rule__INTEGER__Alternatives ) ) ;
    public final void ruleINTEGER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:299:2: ( ( ( rule__INTEGER__Alternatives ) ) )
            // InternalIMPORT.g:300:2: ( ( rule__INTEGER__Alternatives ) )
            {
            // InternalIMPORT.g:300:2: ( ( rule__INTEGER__Alternatives ) )
            // InternalIMPORT.g:301:3: ( rule__INTEGER__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getAlternatives()); 
            }
            // InternalIMPORT.g:302:3: ( rule__INTEGER__Alternatives )
            // InternalIMPORT.g:302:4: rule__INTEGER__Alternatives
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


    // $ANTLR start "ruleGSSImportUnit"
    // InternalIMPORT.g:311:1: ruleGSSImportUnit : ( ( rule__GSSImportUnit__Alternatives ) ) ;
    public final void ruleGSSImportUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:315:1: ( ( ( rule__GSSImportUnit__Alternatives ) ) )
            // InternalIMPORT.g:316:2: ( ( rule__GSSImportUnit__Alternatives ) )
            {
            // InternalIMPORT.g:316:2: ( ( rule__GSSImportUnit__Alternatives ) )
            // InternalIMPORT.g:317:3: ( rule__GSSImportUnit__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportUnitAccess().getAlternatives()); 
            }
            // InternalIMPORT.g:318:3: ( rule__GSSImportUnit__Alternatives )
            // InternalIMPORT.g:318:4: rule__GSSImportUnit__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportUnit__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportUnitAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSSImportUnit"


    // $ANTLR start "rule__GSSImportImport__Alternatives_10"
    // InternalIMPORT.g:326:1: rule__GSSImportImport__Alternatives_10 : ( ( 'NULL' ) | ( ( rule__GSSImportImport__ToAssignment_10_1 ) ) );
    public final void rule__GSSImportImport__Alternatives_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:330:1: ( ( 'NULL' ) | ( ( rule__GSSImportImport__ToAssignment_10_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
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
                    // InternalIMPORT.g:331:2: ( 'NULL' )
                    {
                    // InternalIMPORT.g:331:2: ( 'NULL' )
                    // InternalIMPORT.g:332:3: 'NULL'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSImportImportAccess().getNULLKeyword_10_0()); 
                    }
                    match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSImportImportAccess().getNULLKeyword_10_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIMPORT.g:337:2: ( ( rule__GSSImportImport__ToAssignment_10_1 ) )
                    {
                    // InternalIMPORT.g:337:2: ( ( rule__GSSImportImport__ToAssignment_10_1 ) )
                    // InternalIMPORT.g:338:3: ( rule__GSSImportImport__ToAssignment_10_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSImportImportAccess().getToAssignment_10_1()); 
                    }
                    // InternalIMPORT.g:339:3: ( rule__GSSImportImport__ToAssignment_10_1 )
                    // InternalIMPORT.g:339:4: rule__GSSImportImport__ToAssignment_10_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSImportImport__ToAssignment_10_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSImportImportAccess().getToAssignment_10_1()); 
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
    // $ANTLR end "rule__GSSImportImport__Alternatives_10"


    // $ANTLR start "rule__Version__Alternatives_0"
    // InternalIMPORT.g:347:1: rule__Version__Alternatives_0 : ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) );
    public final void rule__Version__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:351:1: ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    alt2=2;
                }
                else if ( (LA2_1==EOF||LA2_1==17||LA2_1==32||LA2_1==34) ) {
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
                    // InternalIMPORT.g:352:2: ( RULE_INT )
                    {
                    // InternalIMPORT.g:352:2: ( RULE_INT )
                    // InternalIMPORT.g:353:3: RULE_INT
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
                    // InternalIMPORT.g:358:2: ( ( rule__Version__Group_0_1__0 ) )
                    {
                    // InternalIMPORT.g:358:2: ( ( rule__Version__Group_0_1__0 ) )
                    // InternalIMPORT.g:359:3: ( rule__Version__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_0_1()); 
                    }
                    // InternalIMPORT.g:360:3: ( rule__Version__Group_0_1__0 )
                    // InternalIMPORT.g:360:4: rule__Version__Group_0_1__0
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
    // InternalIMPORT.g:368:1: rule__Version__Alternatives_1_1 : ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) );
    public final void rule__Version__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:372:1: ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==17||LA3_1==32||LA3_1==34) ) {
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
                    // InternalIMPORT.g:373:2: ( RULE_INT )
                    {
                    // InternalIMPORT.g:373:2: ( RULE_INT )
                    // InternalIMPORT.g:374:3: RULE_INT
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
                    // InternalIMPORT.g:379:2: ( ( rule__Version__Group_1_1_1__0 ) )
                    {
                    // InternalIMPORT.g:379:2: ( ( rule__Version__Group_1_1_1__0 ) )
                    // InternalIMPORT.g:380:3: ( rule__Version__Group_1_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_1_1_1()); 
                    }
                    // InternalIMPORT.g:381:3: ( rule__Version__Group_1_1_1__0 )
                    // InternalIMPORT.g:381:4: rule__Version__Group_1_1_1__0
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
    // InternalIMPORT.g:389:1: rule__INTEGER__Alternatives : ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) );
    public final void rule__INTEGER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:393:1: ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||LA4_0==36) ) {
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
                    // InternalIMPORT.g:394:2: ( ( rule__INTEGER__Group_0__0 ) )
                    {
                    // InternalIMPORT.g:394:2: ( ( rule__INTEGER__Group_0__0 ) )
                    // InternalIMPORT.g:395:3: ( rule__INTEGER__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getINTEGERAccess().getGroup_0()); 
                    }
                    // InternalIMPORT.g:396:3: ( rule__INTEGER__Group_0__0 )
                    // InternalIMPORT.g:396:4: rule__INTEGER__Group_0__0
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
                    // InternalIMPORT.g:400:2: ( RULE_HEXADECIMAL )
                    {
                    // InternalIMPORT.g:400:2: ( RULE_HEXADECIMAL )
                    // InternalIMPORT.g:401:3: RULE_HEXADECIMAL
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


    // $ANTLR start "rule__GSSImportUnit__Alternatives"
    // InternalIMPORT.g:410:1: rule__GSSImportUnit__Alternatives : ( ( ( 'bits' ) ) | ( ( 'bytes' ) ) );
    public final void rule__GSSImportUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:414:1: ( ( ( 'bits' ) ) | ( ( 'bytes' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
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
                    // InternalIMPORT.g:415:2: ( ( 'bits' ) )
                    {
                    // InternalIMPORT.g:415:2: ( ( 'bits' ) )
                    // InternalIMPORT.g:416:3: ( 'bits' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSImportUnitAccess().getBitsEnumLiteralDeclaration_0()); 
                    }
                    // InternalIMPORT.g:417:3: ( 'bits' )
                    // InternalIMPORT.g:417:4: 'bits'
                    {
                    match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSImportUnitAccess().getBitsEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIMPORT.g:421:2: ( ( 'bytes' ) )
                    {
                    // InternalIMPORT.g:421:2: ( ( 'bytes' ) )
                    // InternalIMPORT.g:422:3: ( 'bytes' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSImportUnitAccess().getBytesEnumLiteralDeclaration_1()); 
                    }
                    // InternalIMPORT.g:423:3: ( 'bytes' )
                    // InternalIMPORT.g:423:4: 'bytes'
                    {
                    match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSImportUnitAccess().getBytesEnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__GSSImportUnit__Alternatives"


    // $ANTLR start "rule__GSSModelFile__Group__0"
    // InternalIMPORT.g:431:1: rule__GSSModelFile__Group__0 : rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1 ;
    public final void rule__GSSModelFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:435:1: ( rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1 )
            // InternalIMPORT.g:436:2: rule__GSSModelFile__Group__0__Impl rule__GSSModelFile__Group__1
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
    // InternalIMPORT.g:443:1: rule__GSSModelFile__Group__0__Impl : ( ( rule__GSSModelFile__ImportsAssignment_0 )* ) ;
    public final void rule__GSSModelFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:447:1: ( ( ( rule__GSSModelFile__ImportsAssignment_0 )* ) )
            // InternalIMPORT.g:448:1: ( ( rule__GSSModelFile__ImportsAssignment_0 )* )
            {
            // InternalIMPORT.g:448:1: ( ( rule__GSSModelFile__ImportsAssignment_0 )* )
            // InternalIMPORT.g:449:2: ( rule__GSSModelFile__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getImportsAssignment_0()); 
            }
            // InternalIMPORT.g:450:2: ( rule__GSSModelFile__ImportsAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalIMPORT.g:450:3: rule__GSSModelFile__ImportsAssignment_0
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
    // InternalIMPORT.g:458:1: rule__GSSModelFile__Group__1 : rule__GSSModelFile__Group__1__Impl ;
    public final void rule__GSSModelFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:462:1: ( rule__GSSModelFile__Group__1__Impl )
            // InternalIMPORT.g:463:2: rule__GSSModelFile__Group__1__Impl
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
    // InternalIMPORT.g:469:1: rule__GSSModelFile__Group__1__Impl : ( ( rule__GSSModelFile__ElementAssignment_1 ) ) ;
    public final void rule__GSSModelFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:473:1: ( ( ( rule__GSSModelFile__ElementAssignment_1 ) ) )
            // InternalIMPORT.g:474:1: ( ( rule__GSSModelFile__ElementAssignment_1 ) )
            {
            // InternalIMPORT.g:474:1: ( ( rule__GSSModelFile__ElementAssignment_1 ) )
            // InternalIMPORT.g:475:2: ( rule__GSSModelFile__ElementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getElementAssignment_1()); 
            }
            // InternalIMPORT.g:476:2: ( rule__GSSModelFile__ElementAssignment_1 )
            // InternalIMPORT.g:476:3: rule__GSSModelFile__ElementAssignment_1
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
    // InternalIMPORT.g:485:1: rule__GSSModelFileImport__Group__0 : rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1 ;
    public final void rule__GSSModelFileImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:489:1: ( rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1 )
            // InternalIMPORT.g:490:2: rule__GSSModelFileImport__Group__0__Impl rule__GSSModelFileImport__Group__1
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
    // InternalIMPORT.g:497:1: rule__GSSModelFileImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__GSSModelFileImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:501:1: ( ( 'import' ) )
            // InternalIMPORT.g:502:1: ( 'import' )
            {
            // InternalIMPORT.g:502:1: ( 'import' )
            // InternalIMPORT.g:503:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getImportKeyword_0()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIMPORT.g:512:1: rule__GSSModelFileImport__Group__1 : rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2 ;
    public final void rule__GSSModelFileImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:516:1: ( rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2 )
            // InternalIMPORT.g:517:2: rule__GSSModelFileImport__Group__1__Impl rule__GSSModelFileImport__Group__2
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
    // InternalIMPORT.g:524:1: rule__GSSModelFileImport__Group__1__Impl : ( ':=' ) ;
    public final void rule__GSSModelFileImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:528:1: ( ( ':=' ) )
            // InternalIMPORT.g:529:1: ( ':=' )
            {
            // InternalIMPORT.g:529:1: ( ':=' )
            // InternalIMPORT.g:530:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIMPORT.g:539:1: rule__GSSModelFileImport__Group__2 : rule__GSSModelFileImport__Group__2__Impl rule__GSSModelFileImport__Group__3 ;
    public final void rule__GSSModelFileImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:543:1: ( rule__GSSModelFileImport__Group__2__Impl rule__GSSModelFileImport__Group__3 )
            // InternalIMPORT.g:544:2: rule__GSSModelFileImport__Group__2__Impl rule__GSSModelFileImport__Group__3
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
    // InternalIMPORT.g:551:1: rule__GSSModelFileImport__Group__2__Impl : ( ( rule__GSSModelFileImport__ImportURIAssignment_2 ) ) ;
    public final void rule__GSSModelFileImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:555:1: ( ( ( rule__GSSModelFileImport__ImportURIAssignment_2 ) ) )
            // InternalIMPORT.g:556:1: ( ( rule__GSSModelFileImport__ImportURIAssignment_2 ) )
            {
            // InternalIMPORT.g:556:1: ( ( rule__GSSModelFileImport__ImportURIAssignment_2 ) )
            // InternalIMPORT.g:557:2: ( rule__GSSModelFileImport__ImportURIAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getImportURIAssignment_2()); 
            }
            // InternalIMPORT.g:558:2: ( rule__GSSModelFileImport__ImportURIAssignment_2 )
            // InternalIMPORT.g:558:3: rule__GSSModelFileImport__ImportURIAssignment_2
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
    // InternalIMPORT.g:566:1: rule__GSSModelFileImport__Group__3 : rule__GSSModelFileImport__Group__3__Impl ;
    public final void rule__GSSModelFileImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:570:1: ( rule__GSSModelFileImport__Group__3__Impl )
            // InternalIMPORT.g:571:2: rule__GSSModelFileImport__Group__3__Impl
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
    // InternalIMPORT.g:577:1: rule__GSSModelFileImport__Group__3__Impl : ( ';' ) ;
    public final void rule__GSSModelFileImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:581:1: ( ( ';' ) )
            // InternalIMPORT.g:582:1: ( ';' )
            {
            // InternalIMPORT.g:582:1: ( ';' )
            // InternalIMPORT.g:583:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileImportAccess().getSemicolonKeyword_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__GSSImportImport__Group__0"
    // InternalIMPORT.g:593:1: rule__GSSImportImport__Group__0 : rule__GSSImportImport__Group__0__Impl rule__GSSImportImport__Group__1 ;
    public final void rule__GSSImportImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:597:1: ( rule__GSSImportImport__Group__0__Impl rule__GSSImportImport__Group__1 )
            // InternalIMPORT.g:598:2: rule__GSSImportImport__Group__0__Impl rule__GSSImportImport__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSImportImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__0"


    // $ANTLR start "rule__GSSImportImport__Group__0__Impl"
    // InternalIMPORT.g:605:1: rule__GSSImportImport__Group__0__Impl : ( 'GSSImportImport' ) ;
    public final void rule__GSSImportImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:609:1: ( ( 'GSSImportImport' ) )
            // InternalIMPORT.g:610:1: ( 'GSSImportImport' )
            {
            // InternalIMPORT.g:610:1: ( 'GSSImportImport' )
            // InternalIMPORT.g:611:2: 'GSSImportImport'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getGSSImportImportKeyword_0()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getGSSImportImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__0__Impl"


    // $ANTLR start "rule__GSSImportImport__Group__1"
    // InternalIMPORT.g:620:1: rule__GSSImportImport__Group__1 : rule__GSSImportImport__Group__1__Impl rule__GSSImportImport__Group__2 ;
    public final void rule__GSSImportImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:624:1: ( rule__GSSImportImport__Group__1__Impl rule__GSSImportImport__Group__2 )
            // InternalIMPORT.g:625:2: rule__GSSImportImport__Group__1__Impl rule__GSSImportImport__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSImportImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__1"


    // $ANTLR start "rule__GSSImportImport__Group__1__Impl"
    // InternalIMPORT.g:632:1: rule__GSSImportImport__Group__1__Impl : ( ( rule__GSSImportImport__NameAssignment_1 ) ) ;
    public final void rule__GSSImportImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:636:1: ( ( ( rule__GSSImportImport__NameAssignment_1 ) ) )
            // InternalIMPORT.g:637:1: ( ( rule__GSSImportImport__NameAssignment_1 ) )
            {
            // InternalIMPORT.g:637:1: ( ( rule__GSSImportImport__NameAssignment_1 ) )
            // InternalIMPORT.g:638:2: ( rule__GSSImportImport__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getNameAssignment_1()); 
            }
            // InternalIMPORT.g:639:2: ( rule__GSSImportImport__NameAssignment_1 )
            // InternalIMPORT.g:639:3: rule__GSSImportImport__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__1__Impl"


    // $ANTLR start "rule__GSSImportImport__Group__2"
    // InternalIMPORT.g:647:1: rule__GSSImportImport__Group__2 : rule__GSSImportImport__Group__2__Impl rule__GSSImportImport__Group__3 ;
    public final void rule__GSSImportImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:651:1: ( rule__GSSImportImport__Group__2__Impl rule__GSSImportImport__Group__3 )
            // InternalIMPORT.g:652:2: rule__GSSImportImport__Group__2__Impl rule__GSSImportImport__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__GSSImportImport__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__2"


    // $ANTLR start "rule__GSSImportImport__Group__2__Impl"
    // InternalIMPORT.g:659:1: rule__GSSImportImport__Group__2__Impl : ( '{' ) ;
    public final void rule__GSSImportImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:663:1: ( ( '{' ) )
            // InternalIMPORT.g:664:1: ( '{' )
            {
            // InternalIMPORT.g:664:1: ( '{' )
            // InternalIMPORT.g:665:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__2__Impl"


    // $ANTLR start "rule__GSSImportImport__Group__3"
    // InternalIMPORT.g:674:1: rule__GSSImportImport__Group__3 : rule__GSSImportImport__Group__3__Impl rule__GSSImportImport__Group__4 ;
    public final void rule__GSSImportImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:678:1: ( rule__GSSImportImport__Group__3__Impl rule__GSSImportImport__Group__4 )
            // InternalIMPORT.g:679:2: rule__GSSImportImport__Group__3__Impl rule__GSSImportImport__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__GSSImportImport__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__3"


    // $ANTLR start "rule__GSSImportImport__Group__3__Impl"
    // InternalIMPORT.g:686:1: rule__GSSImportImport__Group__3__Impl : ( ( rule__GSSImportImport__UnorderedGroup_3 ) ) ;
    public final void rule__GSSImportImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:690:1: ( ( ( rule__GSSImportImport__UnorderedGroup_3 ) ) )
            // InternalIMPORT.g:691:1: ( ( rule__GSSImportImport__UnorderedGroup_3 ) )
            {
            // InternalIMPORT.g:691:1: ( ( rule__GSSImportImport__UnorderedGroup_3 ) )
            // InternalIMPORT.g:692:2: ( rule__GSSImportImport__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3()); 
            }
            // InternalIMPORT.g:693:2: ( rule__GSSImportImport__UnorderedGroup_3 )
            // InternalIMPORT.g:693:3: rule__GSSImportImport__UnorderedGroup_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__UnorderedGroup_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__3__Impl"


    // $ANTLR start "rule__GSSImportImport__Group__4"
    // InternalIMPORT.g:701:1: rule__GSSImportImport__Group__4 : rule__GSSImportImport__Group__4__Impl rule__GSSImportImport__Group__5 ;
    public final void rule__GSSImportImport__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:705:1: ( rule__GSSImportImport__Group__4__Impl rule__GSSImportImport__Group__5 )
            // InternalIMPORT.g:706:2: rule__GSSImportImport__Group__4__Impl rule__GSSImportImport__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSImportImport__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__4"


    // $ANTLR start "rule__GSSImportImport__Group__4__Impl"
    // InternalIMPORT.g:713:1: rule__GSSImportImport__Group__4__Impl : ( 'from' ) ;
    public final void rule__GSSImportImport__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:717:1: ( ( 'from' ) )
            // InternalIMPORT.g:718:1: ( 'from' )
            {
            // InternalIMPORT.g:718:1: ( 'from' )
            // InternalIMPORT.g:719:2: 'from'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getFromKeyword_4()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getFromKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__4__Impl"


    // $ANTLR start "rule__GSSImportImport__Group__5"
    // InternalIMPORT.g:728:1: rule__GSSImportImport__Group__5 : rule__GSSImportImport__Group__5__Impl rule__GSSImportImport__Group__6 ;
    public final void rule__GSSImportImport__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:732:1: ( rule__GSSImportImport__Group__5__Impl rule__GSSImportImport__Group__6 )
            // InternalIMPORT.g:733:2: rule__GSSImportImport__Group__5__Impl rule__GSSImportImport__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSImportImport__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__5"


    // $ANTLR start "rule__GSSImportImport__Group__5__Impl"
    // InternalIMPORT.g:740:1: rule__GSSImportImport__Group__5__Impl : ( ':=' ) ;
    public final void rule__GSSImportImport__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:744:1: ( ( ':=' ) )
            // InternalIMPORT.g:745:1: ( ':=' )
            {
            // InternalIMPORT.g:745:1: ( ':=' )
            // InternalIMPORT.g:746:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getColonEqualsSignKeyword_5()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getColonEqualsSignKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__5__Impl"


    // $ANTLR start "rule__GSSImportImport__Group__6"
    // InternalIMPORT.g:755:1: rule__GSSImportImport__Group__6 : rule__GSSImportImport__Group__6__Impl rule__GSSImportImport__Group__7 ;
    public final void rule__GSSImportImport__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:759:1: ( rule__GSSImportImport__Group__6__Impl rule__GSSImportImport__Group__7 )
            // InternalIMPORT.g:760:2: rule__GSSImportImport__Group__6__Impl rule__GSSImportImport__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSImportImport__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__6"


    // $ANTLR start "rule__GSSImportImport__Group__6__Impl"
    // InternalIMPORT.g:767:1: rule__GSSImportImport__Group__6__Impl : ( ( rule__GSSImportImport__FromAssignment_6 ) ) ;
    public final void rule__GSSImportImport__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:771:1: ( ( ( rule__GSSImportImport__FromAssignment_6 ) ) )
            // InternalIMPORT.g:772:1: ( ( rule__GSSImportImport__FromAssignment_6 ) )
            {
            // InternalIMPORT.g:772:1: ( ( rule__GSSImportImport__FromAssignment_6 ) )
            // InternalIMPORT.g:773:2: ( rule__GSSImportImport__FromAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getFromAssignment_6()); 
            }
            // InternalIMPORT.g:774:2: ( rule__GSSImportImport__FromAssignment_6 )
            // InternalIMPORT.g:774:3: rule__GSSImportImport__FromAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__FromAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getFromAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__6__Impl"


    // $ANTLR start "rule__GSSImportImport__Group__7"
    // InternalIMPORT.g:782:1: rule__GSSImportImport__Group__7 : rule__GSSImportImport__Group__7__Impl rule__GSSImportImport__Group__8 ;
    public final void rule__GSSImportImport__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:786:1: ( rule__GSSImportImport__Group__7__Impl rule__GSSImportImport__Group__8 )
            // InternalIMPORT.g:787:2: rule__GSSImportImport__Group__7__Impl rule__GSSImportImport__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSImportImport__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__7"


    // $ANTLR start "rule__GSSImportImport__Group__7__Impl"
    // InternalIMPORT.g:794:1: rule__GSSImportImport__Group__7__Impl : ( ';' ) ;
    public final void rule__GSSImportImport__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:798:1: ( ( ';' ) )
            // InternalIMPORT.g:799:1: ( ';' )
            {
            // InternalIMPORT.g:799:1: ( ';' )
            // InternalIMPORT.g:800:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_7()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__7__Impl"


    // $ANTLR start "rule__GSSImportImport__Group__8"
    // InternalIMPORT.g:809:1: rule__GSSImportImport__Group__8 : rule__GSSImportImport__Group__8__Impl rule__GSSImportImport__Group__9 ;
    public final void rule__GSSImportImport__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:813:1: ( rule__GSSImportImport__Group__8__Impl rule__GSSImportImport__Group__9 )
            // InternalIMPORT.g:814:2: rule__GSSImportImport__Group__8__Impl rule__GSSImportImport__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSImportImport__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__8"


    // $ANTLR start "rule__GSSImportImport__Group__8__Impl"
    // InternalIMPORT.g:821:1: rule__GSSImportImport__Group__8__Impl : ( 'to' ) ;
    public final void rule__GSSImportImport__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:825:1: ( ( 'to' ) )
            // InternalIMPORT.g:826:1: ( 'to' )
            {
            // InternalIMPORT.g:826:1: ( 'to' )
            // InternalIMPORT.g:827:2: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getToKeyword_8()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getToKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__8__Impl"


    // $ANTLR start "rule__GSSImportImport__Group__9"
    // InternalIMPORT.g:836:1: rule__GSSImportImport__Group__9 : rule__GSSImportImport__Group__9__Impl rule__GSSImportImport__Group__10 ;
    public final void rule__GSSImportImport__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:840:1: ( rule__GSSImportImport__Group__9__Impl rule__GSSImportImport__Group__10 )
            // InternalIMPORT.g:841:2: rule__GSSImportImport__Group__9__Impl rule__GSSImportImport__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__GSSImportImport__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__9"


    // $ANTLR start "rule__GSSImportImport__Group__9__Impl"
    // InternalIMPORT.g:848:1: rule__GSSImportImport__Group__9__Impl : ( ':=' ) ;
    public final void rule__GSSImportImport__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:852:1: ( ( ':=' ) )
            // InternalIMPORT.g:853:1: ( ':=' )
            {
            // InternalIMPORT.g:853:1: ( ':=' )
            // InternalIMPORT.g:854:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getColonEqualsSignKeyword_9()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getColonEqualsSignKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__9__Impl"


    // $ANTLR start "rule__GSSImportImport__Group__10"
    // InternalIMPORT.g:863:1: rule__GSSImportImport__Group__10 : rule__GSSImportImport__Group__10__Impl rule__GSSImportImport__Group__11 ;
    public final void rule__GSSImportImport__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:867:1: ( rule__GSSImportImport__Group__10__Impl rule__GSSImportImport__Group__11 )
            // InternalIMPORT.g:868:2: rule__GSSImportImport__Group__10__Impl rule__GSSImportImport__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSImportImport__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__10"


    // $ANTLR start "rule__GSSImportImport__Group__10__Impl"
    // InternalIMPORT.g:875:1: rule__GSSImportImport__Group__10__Impl : ( ( rule__GSSImportImport__Alternatives_10 ) ) ;
    public final void rule__GSSImportImport__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:879:1: ( ( ( rule__GSSImportImport__Alternatives_10 ) ) )
            // InternalIMPORT.g:880:1: ( ( rule__GSSImportImport__Alternatives_10 ) )
            {
            // InternalIMPORT.g:880:1: ( ( rule__GSSImportImport__Alternatives_10 ) )
            // InternalIMPORT.g:881:2: ( rule__GSSImportImport__Alternatives_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getAlternatives_10()); 
            }
            // InternalIMPORT.g:882:2: ( rule__GSSImportImport__Alternatives_10 )
            // InternalIMPORT.g:882:3: rule__GSSImportImport__Alternatives_10
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__Alternatives_10();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getAlternatives_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__10__Impl"


    // $ANTLR start "rule__GSSImportImport__Group__11"
    // InternalIMPORT.g:890:1: rule__GSSImportImport__Group__11 : rule__GSSImportImport__Group__11__Impl rule__GSSImportImport__Group__12 ;
    public final void rule__GSSImportImport__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:894:1: ( rule__GSSImportImport__Group__11__Impl rule__GSSImportImport__Group__12 )
            // InternalIMPORT.g:895:2: rule__GSSImportImport__Group__11__Impl rule__GSSImportImport__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__GSSImportImport__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__11"


    // $ANTLR start "rule__GSSImportImport__Group__11__Impl"
    // InternalIMPORT.g:902:1: rule__GSSImportImport__Group__11__Impl : ( ';' ) ;
    public final void rule__GSSImportImport__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:906:1: ( ( ';' ) )
            // InternalIMPORT.g:907:1: ( ';' )
            {
            // InternalIMPORT.g:907:1: ( ';' )
            // InternalIMPORT.g:908:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_11()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__11__Impl"


    // $ANTLR start "rule__GSSImportImport__Group__12"
    // InternalIMPORT.g:917:1: rule__GSSImportImport__Group__12 : rule__GSSImportImport__Group__12__Impl rule__GSSImportImport__Group__13 ;
    public final void rule__GSSImportImport__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:921:1: ( rule__GSSImportImport__Group__12__Impl rule__GSSImportImport__Group__13 )
            // InternalIMPORT.g:922:2: rule__GSSImportImport__Group__12__Impl rule__GSSImportImport__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__GSSImportImport__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__12"


    // $ANTLR start "rule__GSSImportImport__Group__12__Impl"
    // InternalIMPORT.g:929:1: rule__GSSImportImport__Group__12__Impl : ( ( ( rule__GSSImportImport__DataSourceAssignment_12 ) ) ( ( rule__GSSImportImport__DataSourceAssignment_12 )* ) ) ;
    public final void rule__GSSImportImport__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:933:1: ( ( ( ( rule__GSSImportImport__DataSourceAssignment_12 ) ) ( ( rule__GSSImportImport__DataSourceAssignment_12 )* ) ) )
            // InternalIMPORT.g:934:1: ( ( ( rule__GSSImportImport__DataSourceAssignment_12 ) ) ( ( rule__GSSImportImport__DataSourceAssignment_12 )* ) )
            {
            // InternalIMPORT.g:934:1: ( ( ( rule__GSSImportImport__DataSourceAssignment_12 ) ) ( ( rule__GSSImportImport__DataSourceAssignment_12 )* ) )
            // InternalIMPORT.g:935:2: ( ( rule__GSSImportImport__DataSourceAssignment_12 ) ) ( ( rule__GSSImportImport__DataSourceAssignment_12 )* )
            {
            // InternalIMPORT.g:935:2: ( ( rule__GSSImportImport__DataSourceAssignment_12 ) )
            // InternalIMPORT.g:936:3: ( rule__GSSImportImport__DataSourceAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getDataSourceAssignment_12()); 
            }
            // InternalIMPORT.g:937:3: ( rule__GSSImportImport__DataSourceAssignment_12 )
            // InternalIMPORT.g:937:4: rule__GSSImportImport__DataSourceAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__GSSImportImport__DataSourceAssignment_12();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getDataSourceAssignment_12()); 
            }

            }

            // InternalIMPORT.g:940:2: ( ( rule__GSSImportImport__DataSourceAssignment_12 )* )
            // InternalIMPORT.g:941:3: ( rule__GSSImportImport__DataSourceAssignment_12 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getDataSourceAssignment_12()); 
            }
            // InternalIMPORT.g:942:3: ( rule__GSSImportImport__DataSourceAssignment_12 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalIMPORT.g:942:4: rule__GSSImportImport__DataSourceAssignment_12
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__GSSImportImport__DataSourceAssignment_12();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getDataSourceAssignment_12()); 
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
    // $ANTLR end "rule__GSSImportImport__Group__12__Impl"


    // $ANTLR start "rule__GSSImportImport__Group__13"
    // InternalIMPORT.g:951:1: rule__GSSImportImport__Group__13 : rule__GSSImportImport__Group__13__Impl rule__GSSImportImport__Group__14 ;
    public final void rule__GSSImportImport__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:955:1: ( rule__GSSImportImport__Group__13__Impl rule__GSSImportImport__Group__14 )
            // InternalIMPORT.g:956:2: rule__GSSImportImport__Group__13__Impl rule__GSSImportImport__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__GSSImportImport__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__13"


    // $ANTLR start "rule__GSSImportImport__Group__13__Impl"
    // InternalIMPORT.g:963:1: rule__GSSImportImport__Group__13__Impl : ( ( rule__GSSImportImport__VirtualSizeAssignment_13 )? ) ;
    public final void rule__GSSImportImport__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:967:1: ( ( ( rule__GSSImportImport__VirtualSizeAssignment_13 )? ) )
            // InternalIMPORT.g:968:1: ( ( rule__GSSImportImport__VirtualSizeAssignment_13 )? )
            {
            // InternalIMPORT.g:968:1: ( ( rule__GSSImportImport__VirtualSizeAssignment_13 )? )
            // InternalIMPORT.g:969:2: ( rule__GSSImportImport__VirtualSizeAssignment_13 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getVirtualSizeAssignment_13()); 
            }
            // InternalIMPORT.g:970:2: ( rule__GSSImportImport__VirtualSizeAssignment_13 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalIMPORT.g:970:3: rule__GSSImportImport__VirtualSizeAssignment_13
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSImportImport__VirtualSizeAssignment_13();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getVirtualSizeAssignment_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__13__Impl"


    // $ANTLR start "rule__GSSImportImport__Group__14"
    // InternalIMPORT.g:978:1: rule__GSSImportImport__Group__14 : rule__GSSImportImport__Group__14__Impl rule__GSSImportImport__Group__15 ;
    public final void rule__GSSImportImport__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:982:1: ( rule__GSSImportImport__Group__14__Impl rule__GSSImportImport__Group__15 )
            // InternalIMPORT.g:983:2: rule__GSSImportImport__Group__14__Impl rule__GSSImportImport__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSImportImport__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__Group__15();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__14"


    // $ANTLR start "rule__GSSImportImport__Group__14__Impl"
    // InternalIMPORT.g:990:1: rule__GSSImportImport__Group__14__Impl : ( '}' ) ;
    public final void rule__GSSImportImport__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:994:1: ( ( '}' ) )
            // InternalIMPORT.g:995:1: ( '}' )
            {
            // InternalIMPORT.g:995:1: ( '}' )
            // InternalIMPORT.g:996:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getRightCurlyBracketKeyword_14()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getRightCurlyBracketKeyword_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__14__Impl"


    // $ANTLR start "rule__GSSImportImport__Group__15"
    // InternalIMPORT.g:1005:1: rule__GSSImportImport__Group__15 : rule__GSSImportImport__Group__15__Impl ;
    public final void rule__GSSImportImport__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1009:1: ( rule__GSSImportImport__Group__15__Impl )
            // InternalIMPORT.g:1010:2: rule__GSSImportImport__Group__15__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__15"


    // $ANTLR start "rule__GSSImportImport__Group__15__Impl"
    // InternalIMPORT.g:1016:1: rule__GSSImportImport__Group__15__Impl : ( ';' ) ;
    public final void rule__GSSImportImport__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1020:1: ( ( ';' ) )
            // InternalIMPORT.g:1021:1: ( ';' )
            {
            // InternalIMPORT.g:1021:1: ( ';' )
            // InternalIMPORT.g:1022:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_15()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_15()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group__15__Impl"


    // $ANTLR start "rule__GSSImportImport__Group_3_0__0"
    // InternalIMPORT.g:1032:1: rule__GSSImportImport__Group_3_0__0 : rule__GSSImportImport__Group_3_0__0__Impl rule__GSSImportImport__Group_3_0__1 ;
    public final void rule__GSSImportImport__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1036:1: ( rule__GSSImportImport__Group_3_0__0__Impl rule__GSSImportImport__Group_3_0__1 )
            // InternalIMPORT.g:1037:2: rule__GSSImportImport__Group_3_0__0__Impl rule__GSSImportImport__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSImportImport__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__Group_3_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group_3_0__0"


    // $ANTLR start "rule__GSSImportImport__Group_3_0__0__Impl"
    // InternalIMPORT.g:1044:1: rule__GSSImportImport__Group_3_0__0__Impl : ( 'uri' ) ;
    public final void rule__GSSImportImport__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1048:1: ( ( 'uri' ) )
            // InternalIMPORT.g:1049:1: ( 'uri' )
            {
            // InternalIMPORT.g:1049:1: ( 'uri' )
            // InternalIMPORT.g:1050:2: 'uri'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getUriKeyword_3_0_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getUriKeyword_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group_3_0__0__Impl"


    // $ANTLR start "rule__GSSImportImport__Group_3_0__1"
    // InternalIMPORT.g:1059:1: rule__GSSImportImport__Group_3_0__1 : rule__GSSImportImport__Group_3_0__1__Impl rule__GSSImportImport__Group_3_0__2 ;
    public final void rule__GSSImportImport__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1063:1: ( rule__GSSImportImport__Group_3_0__1__Impl rule__GSSImportImport__Group_3_0__2 )
            // InternalIMPORT.g:1064:2: rule__GSSImportImport__Group_3_0__1__Impl rule__GSSImportImport__Group_3_0__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSImportImport__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__Group_3_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group_3_0__1"


    // $ANTLR start "rule__GSSImportImport__Group_3_0__1__Impl"
    // InternalIMPORT.g:1071:1: rule__GSSImportImport__Group_3_0__1__Impl : ( ':=' ) ;
    public final void rule__GSSImportImport__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1075:1: ( ( ':=' ) )
            // InternalIMPORT.g:1076:1: ( ':=' )
            {
            // InternalIMPORT.g:1076:1: ( ':=' )
            // InternalIMPORT.g:1077:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getColonEqualsSignKeyword_3_0_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getColonEqualsSignKeyword_3_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group_3_0__1__Impl"


    // $ANTLR start "rule__GSSImportImport__Group_3_0__2"
    // InternalIMPORT.g:1086:1: rule__GSSImportImport__Group_3_0__2 : rule__GSSImportImport__Group_3_0__2__Impl rule__GSSImportImport__Group_3_0__3 ;
    public final void rule__GSSImportImport__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1090:1: ( rule__GSSImportImport__Group_3_0__2__Impl rule__GSSImportImport__Group_3_0__3 )
            // InternalIMPORT.g:1091:2: rule__GSSImportImport__Group_3_0__2__Impl rule__GSSImportImport__Group_3_0__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSImportImport__Group_3_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__Group_3_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group_3_0__2"


    // $ANTLR start "rule__GSSImportImport__Group_3_0__2__Impl"
    // InternalIMPORT.g:1098:1: rule__GSSImportImport__Group_3_0__2__Impl : ( ( rule__GSSImportImport__UriAssignment_3_0_2 ) ) ;
    public final void rule__GSSImportImport__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1102:1: ( ( ( rule__GSSImportImport__UriAssignment_3_0_2 ) ) )
            // InternalIMPORT.g:1103:1: ( ( rule__GSSImportImport__UriAssignment_3_0_2 ) )
            {
            // InternalIMPORT.g:1103:1: ( ( rule__GSSImportImport__UriAssignment_3_0_2 ) )
            // InternalIMPORT.g:1104:2: ( rule__GSSImportImport__UriAssignment_3_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getUriAssignment_3_0_2()); 
            }
            // InternalIMPORT.g:1105:2: ( rule__GSSImportImport__UriAssignment_3_0_2 )
            // InternalIMPORT.g:1105:3: rule__GSSImportImport__UriAssignment_3_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__UriAssignment_3_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getUriAssignment_3_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group_3_0__2__Impl"


    // $ANTLR start "rule__GSSImportImport__Group_3_0__3"
    // InternalIMPORT.g:1113:1: rule__GSSImportImport__Group_3_0__3 : rule__GSSImportImport__Group_3_0__3__Impl ;
    public final void rule__GSSImportImport__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1117:1: ( rule__GSSImportImport__Group_3_0__3__Impl )
            // InternalIMPORT.g:1118:2: rule__GSSImportImport__Group_3_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__Group_3_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group_3_0__3"


    // $ANTLR start "rule__GSSImportImport__Group_3_0__3__Impl"
    // InternalIMPORT.g:1124:1: rule__GSSImportImport__Group_3_0__3__Impl : ( ';' ) ;
    public final void rule__GSSImportImport__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1128:1: ( ( ';' ) )
            // InternalIMPORT.g:1129:1: ( ';' )
            {
            // InternalIMPORT.g:1129:1: ( ';' )
            // InternalIMPORT.g:1130:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_3_0_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_3_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group_3_0__3__Impl"


    // $ANTLR start "rule__GSSImportImport__Group_3_1__0"
    // InternalIMPORT.g:1140:1: rule__GSSImportImport__Group_3_1__0 : rule__GSSImportImport__Group_3_1__0__Impl rule__GSSImportImport__Group_3_1__1 ;
    public final void rule__GSSImportImport__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1144:1: ( rule__GSSImportImport__Group_3_1__0__Impl rule__GSSImportImport__Group_3_1__1 )
            // InternalIMPORT.g:1145:2: rule__GSSImportImport__Group_3_1__0__Impl rule__GSSImportImport__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSImportImport__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group_3_1__0"


    // $ANTLR start "rule__GSSImportImport__Group_3_1__0__Impl"
    // InternalIMPORT.g:1152:1: rule__GSSImportImport__Group_3_1__0__Impl : ( 'version' ) ;
    public final void rule__GSSImportImport__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1156:1: ( ( 'version' ) )
            // InternalIMPORT.g:1157:1: ( 'version' )
            {
            // InternalIMPORT.g:1157:1: ( 'version' )
            // InternalIMPORT.g:1158:2: 'version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getVersionKeyword_3_1_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getVersionKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group_3_1__0__Impl"


    // $ANTLR start "rule__GSSImportImport__Group_3_1__1"
    // InternalIMPORT.g:1167:1: rule__GSSImportImport__Group_3_1__1 : rule__GSSImportImport__Group_3_1__1__Impl rule__GSSImportImport__Group_3_1__2 ;
    public final void rule__GSSImportImport__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1171:1: ( rule__GSSImportImport__Group_3_1__1__Impl rule__GSSImportImport__Group_3_1__2 )
            // InternalIMPORT.g:1172:2: rule__GSSImportImport__Group_3_1__1__Impl rule__GSSImportImport__Group_3_1__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__GSSImportImport__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__Group_3_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group_3_1__1"


    // $ANTLR start "rule__GSSImportImport__Group_3_1__1__Impl"
    // InternalIMPORT.g:1179:1: rule__GSSImportImport__Group_3_1__1__Impl : ( ':=' ) ;
    public final void rule__GSSImportImport__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1183:1: ( ( ':=' ) )
            // InternalIMPORT.g:1184:1: ( ':=' )
            {
            // InternalIMPORT.g:1184:1: ( ':=' )
            // InternalIMPORT.g:1185:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getColonEqualsSignKeyword_3_1_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getColonEqualsSignKeyword_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group_3_1__1__Impl"


    // $ANTLR start "rule__GSSImportImport__Group_3_1__2"
    // InternalIMPORT.g:1194:1: rule__GSSImportImport__Group_3_1__2 : rule__GSSImportImport__Group_3_1__2__Impl rule__GSSImportImport__Group_3_1__3 ;
    public final void rule__GSSImportImport__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1198:1: ( rule__GSSImportImport__Group_3_1__2__Impl rule__GSSImportImport__Group_3_1__3 )
            // InternalIMPORT.g:1199:2: rule__GSSImportImport__Group_3_1__2__Impl rule__GSSImportImport__Group_3_1__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSImportImport__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__Group_3_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group_3_1__2"


    // $ANTLR start "rule__GSSImportImport__Group_3_1__2__Impl"
    // InternalIMPORT.g:1206:1: rule__GSSImportImport__Group_3_1__2__Impl : ( ( rule__GSSImportImport__VersionAssignment_3_1_2 ) ) ;
    public final void rule__GSSImportImport__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1210:1: ( ( ( rule__GSSImportImport__VersionAssignment_3_1_2 ) ) )
            // InternalIMPORT.g:1211:1: ( ( rule__GSSImportImport__VersionAssignment_3_1_2 ) )
            {
            // InternalIMPORT.g:1211:1: ( ( rule__GSSImportImport__VersionAssignment_3_1_2 ) )
            // InternalIMPORT.g:1212:2: ( rule__GSSImportImport__VersionAssignment_3_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getVersionAssignment_3_1_2()); 
            }
            // InternalIMPORT.g:1213:2: ( rule__GSSImportImport__VersionAssignment_3_1_2 )
            // InternalIMPORT.g:1213:3: rule__GSSImportImport__VersionAssignment_3_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__VersionAssignment_3_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getVersionAssignment_3_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group_3_1__2__Impl"


    // $ANTLR start "rule__GSSImportImport__Group_3_1__3"
    // InternalIMPORT.g:1221:1: rule__GSSImportImport__Group_3_1__3 : rule__GSSImportImport__Group_3_1__3__Impl ;
    public final void rule__GSSImportImport__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1225:1: ( rule__GSSImportImport__Group_3_1__3__Impl )
            // InternalIMPORT.g:1226:2: rule__GSSImportImport__Group_3_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__Group_3_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group_3_1__3"


    // $ANTLR start "rule__GSSImportImport__Group_3_1__3__Impl"
    // InternalIMPORT.g:1232:1: rule__GSSImportImport__Group_3_1__3__Impl : ( ';' ) ;
    public final void rule__GSSImportImport__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1236:1: ( ( ';' ) )
            // InternalIMPORT.g:1237:1: ( ';' )
            {
            // InternalIMPORT.g:1237:1: ( ';' )
            // InternalIMPORT.g:1238:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_3_1_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_3_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__Group_3_1__3__Impl"


    // $ANTLR start "rule__GSSImportDataSource__Group__0"
    // InternalIMPORT.g:1248:1: rule__GSSImportDataSource__Group__0 : rule__GSSImportDataSource__Group__0__Impl rule__GSSImportDataSource__Group__1 ;
    public final void rule__GSSImportDataSource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1252:1: ( rule__GSSImportDataSource__Group__0__Impl rule__GSSImportDataSource__Group__1 )
            // InternalIMPORT.g:1253:2: rule__GSSImportDataSource__Group__0__Impl rule__GSSImportDataSource__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSImportDataSource__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportDataSource__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__0"


    // $ANTLR start "rule__GSSImportDataSource__Group__0__Impl"
    // InternalIMPORT.g:1260:1: rule__GSSImportDataSource__Group__0__Impl : ( 'GSSImportDataSource' ) ;
    public final void rule__GSSImportDataSource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1264:1: ( ( 'GSSImportDataSource' ) )
            // InternalIMPORT.g:1265:1: ( 'GSSImportDataSource' )
            {
            // InternalIMPORT.g:1265:1: ( 'GSSImportDataSource' )
            // InternalIMPORT.g:1266:2: 'GSSImportDataSource'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportDataSourceAccess().getGSSImportDataSourceKeyword_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportDataSourceAccess().getGSSImportDataSourceKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__0__Impl"


    // $ANTLR start "rule__GSSImportDataSource__Group__1"
    // InternalIMPORT.g:1275:1: rule__GSSImportDataSource__Group__1 : rule__GSSImportDataSource__Group__1__Impl rule__GSSImportDataSource__Group__2 ;
    public final void rule__GSSImportDataSource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1279:1: ( rule__GSSImportDataSource__Group__1__Impl rule__GSSImportDataSource__Group__2 )
            // InternalIMPORT.g:1280:2: rule__GSSImportDataSource__Group__1__Impl rule__GSSImportDataSource__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__GSSImportDataSource__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportDataSource__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__1"


    // $ANTLR start "rule__GSSImportDataSource__Group__1__Impl"
    // InternalIMPORT.g:1287:1: rule__GSSImportDataSource__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSImportDataSource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1291:1: ( ( '{' ) )
            // InternalIMPORT.g:1292:1: ( '{' )
            {
            // InternalIMPORT.g:1292:1: ( '{' )
            // InternalIMPORT.g:1293:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportDataSourceAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportDataSourceAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__1__Impl"


    // $ANTLR start "rule__GSSImportDataSource__Group__2"
    // InternalIMPORT.g:1302:1: rule__GSSImportDataSource__Group__2 : rule__GSSImportDataSource__Group__2__Impl rule__GSSImportDataSource__Group__3 ;
    public final void rule__GSSImportDataSource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1306:1: ( rule__GSSImportDataSource__Group__2__Impl rule__GSSImportDataSource__Group__3 )
            // InternalIMPORT.g:1307:2: rule__GSSImportDataSource__Group__2__Impl rule__GSSImportDataSource__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSImportDataSource__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportDataSource__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__2"


    // $ANTLR start "rule__GSSImportDataSource__Group__2__Impl"
    // InternalIMPORT.g:1314:1: rule__GSSImportDataSource__Group__2__Impl : ( 'FieldRef' ) ;
    public final void rule__GSSImportDataSource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1318:1: ( ( 'FieldRef' ) )
            // InternalIMPORT.g:1319:1: ( 'FieldRef' )
            {
            // InternalIMPORT.g:1319:1: ( 'FieldRef' )
            // InternalIMPORT.g:1320:2: 'FieldRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportDataSourceAccess().getFieldRefKeyword_2()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportDataSourceAccess().getFieldRefKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__2__Impl"


    // $ANTLR start "rule__GSSImportDataSource__Group__3"
    // InternalIMPORT.g:1329:1: rule__GSSImportDataSource__Group__3 : rule__GSSImportDataSource__Group__3__Impl rule__GSSImportDataSource__Group__4 ;
    public final void rule__GSSImportDataSource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1333:1: ( rule__GSSImportDataSource__Group__3__Impl rule__GSSImportDataSource__Group__4 )
            // InternalIMPORT.g:1334:2: rule__GSSImportDataSource__Group__3__Impl rule__GSSImportDataSource__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSImportDataSource__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportDataSource__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__3"


    // $ANTLR start "rule__GSSImportDataSource__Group__3__Impl"
    // InternalIMPORT.g:1341:1: rule__GSSImportDataSource__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSImportDataSource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1345:1: ( ( ':=' ) )
            // InternalIMPORT.g:1346:1: ( ':=' )
            {
            // InternalIMPORT.g:1346:1: ( ':=' )
            // InternalIMPORT.g:1347:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportDataSourceAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportDataSourceAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__3__Impl"


    // $ANTLR start "rule__GSSImportDataSource__Group__4"
    // InternalIMPORT.g:1356:1: rule__GSSImportDataSource__Group__4 : rule__GSSImportDataSource__Group__4__Impl rule__GSSImportDataSource__Group__5 ;
    public final void rule__GSSImportDataSource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1360:1: ( rule__GSSImportDataSource__Group__4__Impl rule__GSSImportDataSource__Group__5 )
            // InternalIMPORT.g:1361:2: rule__GSSImportDataSource__Group__4__Impl rule__GSSImportDataSource__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSImportDataSource__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportDataSource__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__4"


    // $ANTLR start "rule__GSSImportDataSource__Group__4__Impl"
    // InternalIMPORT.g:1368:1: rule__GSSImportDataSource__Group__4__Impl : ( ( rule__GSSImportDataSource__FieldRefAssignment_4 ) ) ;
    public final void rule__GSSImportDataSource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1372:1: ( ( ( rule__GSSImportDataSource__FieldRefAssignment_4 ) ) )
            // InternalIMPORT.g:1373:1: ( ( rule__GSSImportDataSource__FieldRefAssignment_4 ) )
            {
            // InternalIMPORT.g:1373:1: ( ( rule__GSSImportDataSource__FieldRefAssignment_4 ) )
            // InternalIMPORT.g:1374:2: ( rule__GSSImportDataSource__FieldRefAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportDataSourceAccess().getFieldRefAssignment_4()); 
            }
            // InternalIMPORT.g:1375:2: ( rule__GSSImportDataSource__FieldRefAssignment_4 )
            // InternalIMPORT.g:1375:3: rule__GSSImportDataSource__FieldRefAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportDataSource__FieldRefAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportDataSourceAccess().getFieldRefAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__4__Impl"


    // $ANTLR start "rule__GSSImportDataSource__Group__5"
    // InternalIMPORT.g:1383:1: rule__GSSImportDataSource__Group__5 : rule__GSSImportDataSource__Group__5__Impl rule__GSSImportDataSource__Group__6 ;
    public final void rule__GSSImportDataSource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1387:1: ( rule__GSSImportDataSource__Group__5__Impl rule__GSSImportDataSource__Group__6 )
            // InternalIMPORT.g:1388:2: rule__GSSImportDataSource__Group__5__Impl rule__GSSImportDataSource__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__GSSImportDataSource__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportDataSource__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__5"


    // $ANTLR start "rule__GSSImportDataSource__Group__5__Impl"
    // InternalIMPORT.g:1395:1: rule__GSSImportDataSource__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSImportDataSource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1399:1: ( ( ';' ) )
            // InternalIMPORT.g:1400:1: ( ';' )
            {
            // InternalIMPORT.g:1400:1: ( ';' )
            // InternalIMPORT.g:1401:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportDataSourceAccess().getSemicolonKeyword_5()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportDataSourceAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__5__Impl"


    // $ANTLR start "rule__GSSImportDataSource__Group__6"
    // InternalIMPORT.g:1410:1: rule__GSSImportDataSource__Group__6 : rule__GSSImportDataSource__Group__6__Impl rule__GSSImportDataSource__Group__7 ;
    public final void rule__GSSImportDataSource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1414:1: ( rule__GSSImportDataSource__Group__6__Impl rule__GSSImportDataSource__Group__7 )
            // InternalIMPORT.g:1415:2: rule__GSSImportDataSource__Group__6__Impl rule__GSSImportDataSource__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSImportDataSource__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportDataSource__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__6"


    // $ANTLR start "rule__GSSImportDataSource__Group__6__Impl"
    // InternalIMPORT.g:1422:1: rule__GSSImportDataSource__Group__6__Impl : ( 'leftTrim' ) ;
    public final void rule__GSSImportDataSource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1426:1: ( ( 'leftTrim' ) )
            // InternalIMPORT.g:1427:1: ( 'leftTrim' )
            {
            // InternalIMPORT.g:1427:1: ( 'leftTrim' )
            // InternalIMPORT.g:1428:2: 'leftTrim'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportDataSourceAccess().getLeftTrimKeyword_6()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportDataSourceAccess().getLeftTrimKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__6__Impl"


    // $ANTLR start "rule__GSSImportDataSource__Group__7"
    // InternalIMPORT.g:1437:1: rule__GSSImportDataSource__Group__7 : rule__GSSImportDataSource__Group__7__Impl rule__GSSImportDataSource__Group__8 ;
    public final void rule__GSSImportDataSource__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1441:1: ( rule__GSSImportDataSource__Group__7__Impl rule__GSSImportDataSource__Group__8 )
            // InternalIMPORT.g:1442:2: rule__GSSImportDataSource__Group__7__Impl rule__GSSImportDataSource__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__GSSImportDataSource__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportDataSource__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__7"


    // $ANTLR start "rule__GSSImportDataSource__Group__7__Impl"
    // InternalIMPORT.g:1449:1: rule__GSSImportDataSource__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSImportDataSource__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1453:1: ( ( ':=' ) )
            // InternalIMPORT.g:1454:1: ( ':=' )
            {
            // InternalIMPORT.g:1454:1: ( ':=' )
            // InternalIMPORT.g:1455:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportDataSourceAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportDataSourceAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__7__Impl"


    // $ANTLR start "rule__GSSImportDataSource__Group__8"
    // InternalIMPORT.g:1464:1: rule__GSSImportDataSource__Group__8 : rule__GSSImportDataSource__Group__8__Impl rule__GSSImportDataSource__Group__9 ;
    public final void rule__GSSImportDataSource__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1468:1: ( rule__GSSImportDataSource__Group__8__Impl rule__GSSImportDataSource__Group__9 )
            // InternalIMPORT.g:1469:2: rule__GSSImportDataSource__Group__8__Impl rule__GSSImportDataSource__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSImportDataSource__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportDataSource__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__8"


    // $ANTLR start "rule__GSSImportDataSource__Group__8__Impl"
    // InternalIMPORT.g:1476:1: rule__GSSImportDataSource__Group__8__Impl : ( ( rule__GSSImportDataSource__LeftTrimAssignment_8 ) ) ;
    public final void rule__GSSImportDataSource__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1480:1: ( ( ( rule__GSSImportDataSource__LeftTrimAssignment_8 ) ) )
            // InternalIMPORT.g:1481:1: ( ( rule__GSSImportDataSource__LeftTrimAssignment_8 ) )
            {
            // InternalIMPORT.g:1481:1: ( ( rule__GSSImportDataSource__LeftTrimAssignment_8 ) )
            // InternalIMPORT.g:1482:2: ( rule__GSSImportDataSource__LeftTrimAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportDataSourceAccess().getLeftTrimAssignment_8()); 
            }
            // InternalIMPORT.g:1483:2: ( rule__GSSImportDataSource__LeftTrimAssignment_8 )
            // InternalIMPORT.g:1483:3: rule__GSSImportDataSource__LeftTrimAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportDataSource__LeftTrimAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportDataSourceAccess().getLeftTrimAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__8__Impl"


    // $ANTLR start "rule__GSSImportDataSource__Group__9"
    // InternalIMPORT.g:1491:1: rule__GSSImportDataSource__Group__9 : rule__GSSImportDataSource__Group__9__Impl rule__GSSImportDataSource__Group__10 ;
    public final void rule__GSSImportDataSource__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1495:1: ( rule__GSSImportDataSource__Group__9__Impl rule__GSSImportDataSource__Group__10 )
            // InternalIMPORT.g:1496:2: rule__GSSImportDataSource__Group__9__Impl rule__GSSImportDataSource__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__GSSImportDataSource__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportDataSource__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__9"


    // $ANTLR start "rule__GSSImportDataSource__Group__9__Impl"
    // InternalIMPORT.g:1503:1: rule__GSSImportDataSource__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSImportDataSource__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1507:1: ( ( ';' ) )
            // InternalIMPORT.g:1508:1: ( ';' )
            {
            // InternalIMPORT.g:1508:1: ( ';' )
            // InternalIMPORT.g:1509:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportDataSourceAccess().getSemicolonKeyword_9()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportDataSourceAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__9__Impl"


    // $ANTLR start "rule__GSSImportDataSource__Group__10"
    // InternalIMPORT.g:1518:1: rule__GSSImportDataSource__Group__10 : rule__GSSImportDataSource__Group__10__Impl rule__GSSImportDataSource__Group__11 ;
    public final void rule__GSSImportDataSource__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1522:1: ( rule__GSSImportDataSource__Group__10__Impl rule__GSSImportDataSource__Group__11 )
            // InternalIMPORT.g:1523:2: rule__GSSImportDataSource__Group__10__Impl rule__GSSImportDataSource__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSImportDataSource__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportDataSource__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__10"


    // $ANTLR start "rule__GSSImportDataSource__Group__10__Impl"
    // InternalIMPORT.g:1530:1: rule__GSSImportDataSource__Group__10__Impl : ( 'rightTrim' ) ;
    public final void rule__GSSImportDataSource__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1534:1: ( ( 'rightTrim' ) )
            // InternalIMPORT.g:1535:1: ( 'rightTrim' )
            {
            // InternalIMPORT.g:1535:1: ( 'rightTrim' )
            // InternalIMPORT.g:1536:2: 'rightTrim'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportDataSourceAccess().getRightTrimKeyword_10()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportDataSourceAccess().getRightTrimKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__10__Impl"


    // $ANTLR start "rule__GSSImportDataSource__Group__11"
    // InternalIMPORT.g:1545:1: rule__GSSImportDataSource__Group__11 : rule__GSSImportDataSource__Group__11__Impl rule__GSSImportDataSource__Group__12 ;
    public final void rule__GSSImportDataSource__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1549:1: ( rule__GSSImportDataSource__Group__11__Impl rule__GSSImportDataSource__Group__12 )
            // InternalIMPORT.g:1550:2: rule__GSSImportDataSource__Group__11__Impl rule__GSSImportDataSource__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__GSSImportDataSource__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportDataSource__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__11"


    // $ANTLR start "rule__GSSImportDataSource__Group__11__Impl"
    // InternalIMPORT.g:1557:1: rule__GSSImportDataSource__Group__11__Impl : ( ':=' ) ;
    public final void rule__GSSImportDataSource__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1561:1: ( ( ':=' ) )
            // InternalIMPORT.g:1562:1: ( ':=' )
            {
            // InternalIMPORT.g:1562:1: ( ':=' )
            // InternalIMPORT.g:1563:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportDataSourceAccess().getColonEqualsSignKeyword_11()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportDataSourceAccess().getColonEqualsSignKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__11__Impl"


    // $ANTLR start "rule__GSSImportDataSource__Group__12"
    // InternalIMPORT.g:1572:1: rule__GSSImportDataSource__Group__12 : rule__GSSImportDataSource__Group__12__Impl rule__GSSImportDataSource__Group__13 ;
    public final void rule__GSSImportDataSource__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1576:1: ( rule__GSSImportDataSource__Group__12__Impl rule__GSSImportDataSource__Group__13 )
            // InternalIMPORT.g:1577:2: rule__GSSImportDataSource__Group__12__Impl rule__GSSImportDataSource__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSImportDataSource__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportDataSource__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__12"


    // $ANTLR start "rule__GSSImportDataSource__Group__12__Impl"
    // InternalIMPORT.g:1584:1: rule__GSSImportDataSource__Group__12__Impl : ( ( rule__GSSImportDataSource__RightTrimAssignment_12 ) ) ;
    public final void rule__GSSImportDataSource__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1588:1: ( ( ( rule__GSSImportDataSource__RightTrimAssignment_12 ) ) )
            // InternalIMPORT.g:1589:1: ( ( rule__GSSImportDataSource__RightTrimAssignment_12 ) )
            {
            // InternalIMPORT.g:1589:1: ( ( rule__GSSImportDataSource__RightTrimAssignment_12 ) )
            // InternalIMPORT.g:1590:2: ( rule__GSSImportDataSource__RightTrimAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportDataSourceAccess().getRightTrimAssignment_12()); 
            }
            // InternalIMPORT.g:1591:2: ( rule__GSSImportDataSource__RightTrimAssignment_12 )
            // InternalIMPORT.g:1591:3: rule__GSSImportDataSource__RightTrimAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportDataSource__RightTrimAssignment_12();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportDataSourceAccess().getRightTrimAssignment_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__12__Impl"


    // $ANTLR start "rule__GSSImportDataSource__Group__13"
    // InternalIMPORT.g:1599:1: rule__GSSImportDataSource__Group__13 : rule__GSSImportDataSource__Group__13__Impl rule__GSSImportDataSource__Group__14 ;
    public final void rule__GSSImportDataSource__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1603:1: ( rule__GSSImportDataSource__Group__13__Impl rule__GSSImportDataSource__Group__14 )
            // InternalIMPORT.g:1604:2: rule__GSSImportDataSource__Group__13__Impl rule__GSSImportDataSource__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__GSSImportDataSource__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportDataSource__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__13"


    // $ANTLR start "rule__GSSImportDataSource__Group__13__Impl"
    // InternalIMPORT.g:1611:1: rule__GSSImportDataSource__Group__13__Impl : ( ';' ) ;
    public final void rule__GSSImportDataSource__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1615:1: ( ( ';' ) )
            // InternalIMPORT.g:1616:1: ( ';' )
            {
            // InternalIMPORT.g:1616:1: ( ';' )
            // InternalIMPORT.g:1617:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportDataSourceAccess().getSemicolonKeyword_13()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportDataSourceAccess().getSemicolonKeyword_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__13__Impl"


    // $ANTLR start "rule__GSSImportDataSource__Group__14"
    // InternalIMPORT.g:1626:1: rule__GSSImportDataSource__Group__14 : rule__GSSImportDataSource__Group__14__Impl rule__GSSImportDataSource__Group__15 ;
    public final void rule__GSSImportDataSource__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1630:1: ( rule__GSSImportDataSource__Group__14__Impl rule__GSSImportDataSource__Group__15 )
            // InternalIMPORT.g:1631:2: rule__GSSImportDataSource__Group__14__Impl rule__GSSImportDataSource__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSImportDataSource__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportDataSource__Group__15();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__14"


    // $ANTLR start "rule__GSSImportDataSource__Group__14__Impl"
    // InternalIMPORT.g:1638:1: rule__GSSImportDataSource__Group__14__Impl : ( '}' ) ;
    public final void rule__GSSImportDataSource__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1642:1: ( ( '}' ) )
            // InternalIMPORT.g:1643:1: ( '}' )
            {
            // InternalIMPORT.g:1643:1: ( '}' )
            // InternalIMPORT.g:1644:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportDataSourceAccess().getRightCurlyBracketKeyword_14()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportDataSourceAccess().getRightCurlyBracketKeyword_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__14__Impl"


    // $ANTLR start "rule__GSSImportDataSource__Group__15"
    // InternalIMPORT.g:1653:1: rule__GSSImportDataSource__Group__15 : rule__GSSImportDataSource__Group__15__Impl ;
    public final void rule__GSSImportDataSource__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1657:1: ( rule__GSSImportDataSource__Group__15__Impl )
            // InternalIMPORT.g:1658:2: rule__GSSImportDataSource__Group__15__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportDataSource__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__15"


    // $ANTLR start "rule__GSSImportDataSource__Group__15__Impl"
    // InternalIMPORT.g:1664:1: rule__GSSImportDataSource__Group__15__Impl : ( ';' ) ;
    public final void rule__GSSImportDataSource__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1668:1: ( ( ';' ) )
            // InternalIMPORT.g:1669:1: ( ';' )
            {
            // InternalIMPORT.g:1669:1: ( ';' )
            // InternalIMPORT.g:1670:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportDataSourceAccess().getSemicolonKeyword_15()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportDataSourceAccess().getSemicolonKeyword_15()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__Group__15__Impl"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__0"
    // InternalIMPORT.g:1680:1: rule__GSSImportVirtualSize__Group__0 : rule__GSSImportVirtualSize__Group__0__Impl rule__GSSImportVirtualSize__Group__1 ;
    public final void rule__GSSImportVirtualSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1684:1: ( rule__GSSImportVirtualSize__Group__0__Impl rule__GSSImportVirtualSize__Group__1 )
            // InternalIMPORT.g:1685:2: rule__GSSImportVirtualSize__Group__0__Impl rule__GSSImportVirtualSize__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__GSSImportVirtualSize__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__0"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__0__Impl"
    // InternalIMPORT.g:1692:1: rule__GSSImportVirtualSize__Group__0__Impl : ( 'GSSImportVirtualSize' ) ;
    public final void rule__GSSImportVirtualSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1696:1: ( ( 'GSSImportVirtualSize' ) )
            // InternalIMPORT.g:1697:1: ( 'GSSImportVirtualSize' )
            {
            // InternalIMPORT.g:1697:1: ( 'GSSImportVirtualSize' )
            // InternalIMPORT.g:1698:2: 'GSSImportVirtualSize'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getGSSImportVirtualSizeKeyword_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getGSSImportVirtualSizeKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__0__Impl"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__1"
    // InternalIMPORT.g:1707:1: rule__GSSImportVirtualSize__Group__1 : rule__GSSImportVirtualSize__Group__1__Impl rule__GSSImportVirtualSize__Group__2 ;
    public final void rule__GSSImportVirtualSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1711:1: ( rule__GSSImportVirtualSize__Group__1__Impl rule__GSSImportVirtualSize__Group__2 )
            // InternalIMPORT.g:1712:2: rule__GSSImportVirtualSize__Group__1__Impl rule__GSSImportVirtualSize__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__GSSImportVirtualSize__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__1"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__1__Impl"
    // InternalIMPORT.g:1719:1: rule__GSSImportVirtualSize__Group__1__Impl : ( '{' ) ;
    public final void rule__GSSImportVirtualSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1723:1: ( ( '{' ) )
            // InternalIMPORT.g:1724:1: ( '{' )
            {
            // InternalIMPORT.g:1724:1: ( '{' )
            // InternalIMPORT.g:1725:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__1__Impl"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__2"
    // InternalIMPORT.g:1734:1: rule__GSSImportVirtualSize__Group__2 : rule__GSSImportVirtualSize__Group__2__Impl rule__GSSImportVirtualSize__Group__3 ;
    public final void rule__GSSImportVirtualSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1738:1: ( rule__GSSImportVirtualSize__Group__2__Impl rule__GSSImportVirtualSize__Group__3 )
            // InternalIMPORT.g:1739:2: rule__GSSImportVirtualSize__Group__2__Impl rule__GSSImportVirtualSize__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSImportVirtualSize__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__2"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__2__Impl"
    // InternalIMPORT.g:1746:1: rule__GSSImportVirtualSize__Group__2__Impl : ( 'FieldRef' ) ;
    public final void rule__GSSImportVirtualSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1750:1: ( ( 'FieldRef' ) )
            // InternalIMPORT.g:1751:1: ( 'FieldRef' )
            {
            // InternalIMPORT.g:1751:1: ( 'FieldRef' )
            // InternalIMPORT.g:1752:2: 'FieldRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getFieldRefKeyword_2()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getFieldRefKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__2__Impl"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__3"
    // InternalIMPORT.g:1761:1: rule__GSSImportVirtualSize__Group__3 : rule__GSSImportVirtualSize__Group__3__Impl rule__GSSImportVirtualSize__Group__4 ;
    public final void rule__GSSImportVirtualSize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1765:1: ( rule__GSSImportVirtualSize__Group__3__Impl rule__GSSImportVirtualSize__Group__4 )
            // InternalIMPORT.g:1766:2: rule__GSSImportVirtualSize__Group__3__Impl rule__GSSImportVirtualSize__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSImportVirtualSize__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__3"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__3__Impl"
    // InternalIMPORT.g:1773:1: rule__GSSImportVirtualSize__Group__3__Impl : ( ':=' ) ;
    public final void rule__GSSImportVirtualSize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1777:1: ( ( ':=' ) )
            // InternalIMPORT.g:1778:1: ( ':=' )
            {
            // InternalIMPORT.g:1778:1: ( ':=' )
            // InternalIMPORT.g:1779:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__3__Impl"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__4"
    // InternalIMPORT.g:1788:1: rule__GSSImportVirtualSize__Group__4 : rule__GSSImportVirtualSize__Group__4__Impl rule__GSSImportVirtualSize__Group__5 ;
    public final void rule__GSSImportVirtualSize__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1792:1: ( rule__GSSImportVirtualSize__Group__4__Impl rule__GSSImportVirtualSize__Group__5 )
            // InternalIMPORT.g:1793:2: rule__GSSImportVirtualSize__Group__4__Impl rule__GSSImportVirtualSize__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSImportVirtualSize__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__4"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__4__Impl"
    // InternalIMPORT.g:1800:1: rule__GSSImportVirtualSize__Group__4__Impl : ( ( rule__GSSImportVirtualSize__FieldRefAssignment_4 ) ) ;
    public final void rule__GSSImportVirtualSize__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1804:1: ( ( ( rule__GSSImportVirtualSize__FieldRefAssignment_4 ) ) )
            // InternalIMPORT.g:1805:1: ( ( rule__GSSImportVirtualSize__FieldRefAssignment_4 ) )
            {
            // InternalIMPORT.g:1805:1: ( ( rule__GSSImportVirtualSize__FieldRefAssignment_4 ) )
            // InternalIMPORT.g:1806:2: ( rule__GSSImportVirtualSize__FieldRefAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getFieldRefAssignment_4()); 
            }
            // InternalIMPORT.g:1807:2: ( rule__GSSImportVirtualSize__FieldRefAssignment_4 )
            // InternalIMPORT.g:1807:3: rule__GSSImportVirtualSize__FieldRefAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__FieldRefAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getFieldRefAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__4__Impl"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__5"
    // InternalIMPORT.g:1815:1: rule__GSSImportVirtualSize__Group__5 : rule__GSSImportVirtualSize__Group__5__Impl rule__GSSImportVirtualSize__Group__6 ;
    public final void rule__GSSImportVirtualSize__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1819:1: ( rule__GSSImportVirtualSize__Group__5__Impl rule__GSSImportVirtualSize__Group__6 )
            // InternalIMPORT.g:1820:2: rule__GSSImportVirtualSize__Group__5__Impl rule__GSSImportVirtualSize__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__GSSImportVirtualSize__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__5"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__5__Impl"
    // InternalIMPORT.g:1827:1: rule__GSSImportVirtualSize__Group__5__Impl : ( ';' ) ;
    public final void rule__GSSImportVirtualSize__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1831:1: ( ( ';' ) )
            // InternalIMPORT.g:1832:1: ( ';' )
            {
            // InternalIMPORT.g:1832:1: ( ';' )
            // InternalIMPORT.g:1833:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_5()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__5__Impl"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__6"
    // InternalIMPORT.g:1842:1: rule__GSSImportVirtualSize__Group__6 : rule__GSSImportVirtualSize__Group__6__Impl rule__GSSImportVirtualSize__Group__7 ;
    public final void rule__GSSImportVirtualSize__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1846:1: ( rule__GSSImportVirtualSize__Group__6__Impl rule__GSSImportVirtualSize__Group__7 )
            // InternalIMPORT.g:1847:2: rule__GSSImportVirtualSize__Group__6__Impl rule__GSSImportVirtualSize__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSImportVirtualSize__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__6"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__6__Impl"
    // InternalIMPORT.g:1854:1: rule__GSSImportVirtualSize__Group__6__Impl : ( 'to' ) ;
    public final void rule__GSSImportVirtualSize__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1858:1: ( ( 'to' ) )
            // InternalIMPORT.g:1859:1: ( 'to' )
            {
            // InternalIMPORT.g:1859:1: ( 'to' )
            // InternalIMPORT.g:1860:2: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getToKeyword_6()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getToKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__6__Impl"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__7"
    // InternalIMPORT.g:1869:1: rule__GSSImportVirtualSize__Group__7 : rule__GSSImportVirtualSize__Group__7__Impl rule__GSSImportVirtualSize__Group__8 ;
    public final void rule__GSSImportVirtualSize__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1873:1: ( rule__GSSImportVirtualSize__Group__7__Impl rule__GSSImportVirtualSize__Group__8 )
            // InternalIMPORT.g:1874:2: rule__GSSImportVirtualSize__Group__7__Impl rule__GSSImportVirtualSize__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__GSSImportVirtualSize__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__7"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__7__Impl"
    // InternalIMPORT.g:1881:1: rule__GSSImportVirtualSize__Group__7__Impl : ( ':=' ) ;
    public final void rule__GSSImportVirtualSize__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1885:1: ( ( ':=' ) )
            // InternalIMPORT.g:1886:1: ( ':=' )
            {
            // InternalIMPORT.g:1886:1: ( ':=' )
            // InternalIMPORT.g:1887:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__7__Impl"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__8"
    // InternalIMPORT.g:1896:1: rule__GSSImportVirtualSize__Group__8 : rule__GSSImportVirtualSize__Group__8__Impl rule__GSSImportVirtualSize__Group__9 ;
    public final void rule__GSSImportVirtualSize__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1900:1: ( rule__GSSImportVirtualSize__Group__8__Impl rule__GSSImportVirtualSize__Group__9 )
            // InternalIMPORT.g:1901:2: rule__GSSImportVirtualSize__Group__8__Impl rule__GSSImportVirtualSize__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSImportVirtualSize__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__8"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__8__Impl"
    // InternalIMPORT.g:1908:1: rule__GSSImportVirtualSize__Group__8__Impl : ( ( rule__GSSImportVirtualSize__ToAssignment_8 ) ) ;
    public final void rule__GSSImportVirtualSize__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1912:1: ( ( ( rule__GSSImportVirtualSize__ToAssignment_8 ) ) )
            // InternalIMPORT.g:1913:1: ( ( rule__GSSImportVirtualSize__ToAssignment_8 ) )
            {
            // InternalIMPORT.g:1913:1: ( ( rule__GSSImportVirtualSize__ToAssignment_8 ) )
            // InternalIMPORT.g:1914:2: ( rule__GSSImportVirtualSize__ToAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getToAssignment_8()); 
            }
            // InternalIMPORT.g:1915:2: ( rule__GSSImportVirtualSize__ToAssignment_8 )
            // InternalIMPORT.g:1915:3: rule__GSSImportVirtualSize__ToAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__ToAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getToAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__8__Impl"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__9"
    // InternalIMPORT.g:1923:1: rule__GSSImportVirtualSize__Group__9 : rule__GSSImportVirtualSize__Group__9__Impl rule__GSSImportVirtualSize__Group__10 ;
    public final void rule__GSSImportVirtualSize__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1927:1: ( rule__GSSImportVirtualSize__Group__9__Impl rule__GSSImportVirtualSize__Group__10 )
            // InternalIMPORT.g:1928:2: rule__GSSImportVirtualSize__Group__9__Impl rule__GSSImportVirtualSize__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__GSSImportVirtualSize__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__9"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__9__Impl"
    // InternalIMPORT.g:1935:1: rule__GSSImportVirtualSize__Group__9__Impl : ( ';' ) ;
    public final void rule__GSSImportVirtualSize__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1939:1: ( ( ';' ) )
            // InternalIMPORT.g:1940:1: ( ';' )
            {
            // InternalIMPORT.g:1940:1: ( ';' )
            // InternalIMPORT.g:1941:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_9()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__9__Impl"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__10"
    // InternalIMPORT.g:1950:1: rule__GSSImportVirtualSize__Group__10 : rule__GSSImportVirtualSize__Group__10__Impl rule__GSSImportVirtualSize__Group__11 ;
    public final void rule__GSSImportVirtualSize__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1954:1: ( rule__GSSImportVirtualSize__Group__10__Impl rule__GSSImportVirtualSize__Group__11 )
            // InternalIMPORT.g:1955:2: rule__GSSImportVirtualSize__Group__10__Impl rule__GSSImportVirtualSize__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__GSSImportVirtualSize__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__10"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__10__Impl"
    // InternalIMPORT.g:1962:1: rule__GSSImportVirtualSize__Group__10__Impl : ( ( rule__GSSImportVirtualSize__Group_10__0 )? ) ;
    public final void rule__GSSImportVirtualSize__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1966:1: ( ( ( rule__GSSImportVirtualSize__Group_10__0 )? ) )
            // InternalIMPORT.g:1967:1: ( ( rule__GSSImportVirtualSize__Group_10__0 )? )
            {
            // InternalIMPORT.g:1967:1: ( ( rule__GSSImportVirtualSize__Group_10__0 )? )
            // InternalIMPORT.g:1968:2: ( rule__GSSImportVirtualSize__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getGroup_10()); 
            }
            // InternalIMPORT.g:1969:2: ( rule__GSSImportVirtualSize__Group_10__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalIMPORT.g:1969:3: rule__GSSImportVirtualSize__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSImportVirtualSize__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getGroup_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__10__Impl"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__11"
    // InternalIMPORT.g:1977:1: rule__GSSImportVirtualSize__Group__11 : rule__GSSImportVirtualSize__Group__11__Impl rule__GSSImportVirtualSize__Group__12 ;
    public final void rule__GSSImportVirtualSize__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1981:1: ( rule__GSSImportVirtualSize__Group__11__Impl rule__GSSImportVirtualSize__Group__12 )
            // InternalIMPORT.g:1982:2: rule__GSSImportVirtualSize__Group__11__Impl rule__GSSImportVirtualSize__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__GSSImportVirtualSize__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__11"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__11__Impl"
    // InternalIMPORT.g:1989:1: rule__GSSImportVirtualSize__Group__11__Impl : ( ( rule__GSSImportVirtualSize__Group_11__0 )? ) ;
    public final void rule__GSSImportVirtualSize__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:1993:1: ( ( ( rule__GSSImportVirtualSize__Group_11__0 )? ) )
            // InternalIMPORT.g:1994:1: ( ( rule__GSSImportVirtualSize__Group_11__0 )? )
            {
            // InternalIMPORT.g:1994:1: ( ( rule__GSSImportVirtualSize__Group_11__0 )? )
            // InternalIMPORT.g:1995:2: ( rule__GSSImportVirtualSize__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getGroup_11()); 
            }
            // InternalIMPORT.g:1996:2: ( rule__GSSImportVirtualSize__Group_11__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalIMPORT.g:1996:3: rule__GSSImportVirtualSize__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSImportVirtualSize__Group_11__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getGroup_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__11__Impl"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__12"
    // InternalIMPORT.g:2004:1: rule__GSSImportVirtualSize__Group__12 : rule__GSSImportVirtualSize__Group__12__Impl rule__GSSImportVirtualSize__Group__13 ;
    public final void rule__GSSImportVirtualSize__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2008:1: ( rule__GSSImportVirtualSize__Group__12__Impl rule__GSSImportVirtualSize__Group__13 )
            // InternalIMPORT.g:2009:2: rule__GSSImportVirtualSize__Group__12__Impl rule__GSSImportVirtualSize__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSImportVirtualSize__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__12"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__12__Impl"
    // InternalIMPORT.g:2016:1: rule__GSSImportVirtualSize__Group__12__Impl : ( '}' ) ;
    public final void rule__GSSImportVirtualSize__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2020:1: ( ( '}' ) )
            // InternalIMPORT.g:2021:1: ( '}' )
            {
            // InternalIMPORT.g:2021:1: ( '}' )
            // InternalIMPORT.g:2022:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getRightCurlyBracketKeyword_12()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getRightCurlyBracketKeyword_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__12__Impl"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__13"
    // InternalIMPORT.g:2031:1: rule__GSSImportVirtualSize__Group__13 : rule__GSSImportVirtualSize__Group__13__Impl ;
    public final void rule__GSSImportVirtualSize__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2035:1: ( rule__GSSImportVirtualSize__Group__13__Impl )
            // InternalIMPORT.g:2036:2: rule__GSSImportVirtualSize__Group__13__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__13"


    // $ANTLR start "rule__GSSImportVirtualSize__Group__13__Impl"
    // InternalIMPORT.g:2042:1: rule__GSSImportVirtualSize__Group__13__Impl : ( ';' ) ;
    public final void rule__GSSImportVirtualSize__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2046:1: ( ( ';' ) )
            // InternalIMPORT.g:2047:1: ( ';' )
            {
            // InternalIMPORT.g:2047:1: ( ';' )
            // InternalIMPORT.g:2048:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_13()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group__13__Impl"


    // $ANTLR start "rule__GSSImportVirtualSize__Group_10__0"
    // InternalIMPORT.g:2058:1: rule__GSSImportVirtualSize__Group_10__0 : rule__GSSImportVirtualSize__Group_10__0__Impl rule__GSSImportVirtualSize__Group_10__1 ;
    public final void rule__GSSImportVirtualSize__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2062:1: ( rule__GSSImportVirtualSize__Group_10__0__Impl rule__GSSImportVirtualSize__Group_10__1 )
            // InternalIMPORT.g:2063:2: rule__GSSImportVirtualSize__Group_10__0__Impl rule__GSSImportVirtualSize__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSImportVirtualSize__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__Group_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group_10__0"


    // $ANTLR start "rule__GSSImportVirtualSize__Group_10__0__Impl"
    // InternalIMPORT.g:2070:1: rule__GSSImportVirtualSize__Group_10__0__Impl : ( 'addSize' ) ;
    public final void rule__GSSImportVirtualSize__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2074:1: ( ( 'addSize' ) )
            // InternalIMPORT.g:2075:1: ( 'addSize' )
            {
            // InternalIMPORT.g:2075:1: ( 'addSize' )
            // InternalIMPORT.g:2076:2: 'addSize'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getAddSizeKeyword_10_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getAddSizeKeyword_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group_10__0__Impl"


    // $ANTLR start "rule__GSSImportVirtualSize__Group_10__1"
    // InternalIMPORT.g:2085:1: rule__GSSImportVirtualSize__Group_10__1 : rule__GSSImportVirtualSize__Group_10__1__Impl rule__GSSImportVirtualSize__Group_10__2 ;
    public final void rule__GSSImportVirtualSize__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2089:1: ( rule__GSSImportVirtualSize__Group_10__1__Impl rule__GSSImportVirtualSize__Group_10__2 )
            // InternalIMPORT.g:2090:2: rule__GSSImportVirtualSize__Group_10__1__Impl rule__GSSImportVirtualSize__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__GSSImportVirtualSize__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__Group_10__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group_10__1"


    // $ANTLR start "rule__GSSImportVirtualSize__Group_10__1__Impl"
    // InternalIMPORT.g:2097:1: rule__GSSImportVirtualSize__Group_10__1__Impl : ( ':=' ) ;
    public final void rule__GSSImportVirtualSize__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2101:1: ( ( ':=' ) )
            // InternalIMPORT.g:2102:1: ( ':=' )
            {
            // InternalIMPORT.g:2102:1: ( ':=' )
            // InternalIMPORT.g:2103:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getColonEqualsSignKeyword_10_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getColonEqualsSignKeyword_10_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group_10__1__Impl"


    // $ANTLR start "rule__GSSImportVirtualSize__Group_10__2"
    // InternalIMPORT.g:2112:1: rule__GSSImportVirtualSize__Group_10__2 : rule__GSSImportVirtualSize__Group_10__2__Impl rule__GSSImportVirtualSize__Group_10__3 ;
    public final void rule__GSSImportVirtualSize__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2116:1: ( rule__GSSImportVirtualSize__Group_10__2__Impl rule__GSSImportVirtualSize__Group_10__3 )
            // InternalIMPORT.g:2117:2: rule__GSSImportVirtualSize__Group_10__2__Impl rule__GSSImportVirtualSize__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSImportVirtualSize__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__Group_10__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group_10__2"


    // $ANTLR start "rule__GSSImportVirtualSize__Group_10__2__Impl"
    // InternalIMPORT.g:2124:1: rule__GSSImportVirtualSize__Group_10__2__Impl : ( ( rule__GSSImportVirtualSize__AddSizeAssignment_10_2 ) ) ;
    public final void rule__GSSImportVirtualSize__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2128:1: ( ( ( rule__GSSImportVirtualSize__AddSizeAssignment_10_2 ) ) )
            // InternalIMPORT.g:2129:1: ( ( rule__GSSImportVirtualSize__AddSizeAssignment_10_2 ) )
            {
            // InternalIMPORT.g:2129:1: ( ( rule__GSSImportVirtualSize__AddSizeAssignment_10_2 ) )
            // InternalIMPORT.g:2130:2: ( rule__GSSImportVirtualSize__AddSizeAssignment_10_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getAddSizeAssignment_10_2()); 
            }
            // InternalIMPORT.g:2131:2: ( rule__GSSImportVirtualSize__AddSizeAssignment_10_2 )
            // InternalIMPORT.g:2131:3: rule__GSSImportVirtualSize__AddSizeAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__AddSizeAssignment_10_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getAddSizeAssignment_10_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group_10__2__Impl"


    // $ANTLR start "rule__GSSImportVirtualSize__Group_10__3"
    // InternalIMPORT.g:2139:1: rule__GSSImportVirtualSize__Group_10__3 : rule__GSSImportVirtualSize__Group_10__3__Impl ;
    public final void rule__GSSImportVirtualSize__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2143:1: ( rule__GSSImportVirtualSize__Group_10__3__Impl )
            // InternalIMPORT.g:2144:2: rule__GSSImportVirtualSize__Group_10__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__Group_10__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group_10__3"


    // $ANTLR start "rule__GSSImportVirtualSize__Group_10__3__Impl"
    // InternalIMPORT.g:2150:1: rule__GSSImportVirtualSize__Group_10__3__Impl : ( ';' ) ;
    public final void rule__GSSImportVirtualSize__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2154:1: ( ( ';' ) )
            // InternalIMPORT.g:2155:1: ( ';' )
            {
            // InternalIMPORT.g:2155:1: ( ';' )
            // InternalIMPORT.g:2156:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_10_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_10_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group_10__3__Impl"


    // $ANTLR start "rule__GSSImportVirtualSize__Group_11__0"
    // InternalIMPORT.g:2166:1: rule__GSSImportVirtualSize__Group_11__0 : rule__GSSImportVirtualSize__Group_11__0__Impl rule__GSSImportVirtualSize__Group_11__1 ;
    public final void rule__GSSImportVirtualSize__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2170:1: ( rule__GSSImportVirtualSize__Group_11__0__Impl rule__GSSImportVirtualSize__Group_11__1 )
            // InternalIMPORT.g:2171:2: rule__GSSImportVirtualSize__Group_11__0__Impl rule__GSSImportVirtualSize__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__GSSImportVirtualSize__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__Group_11__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group_11__0"


    // $ANTLR start "rule__GSSImportVirtualSize__Group_11__0__Impl"
    // InternalIMPORT.g:2178:1: rule__GSSImportVirtualSize__Group_11__0__Impl : ( 'unit' ) ;
    public final void rule__GSSImportVirtualSize__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2182:1: ( ( 'unit' ) )
            // InternalIMPORT.g:2183:1: ( 'unit' )
            {
            // InternalIMPORT.g:2183:1: ( 'unit' )
            // InternalIMPORT.g:2184:2: 'unit'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getUnitKeyword_11_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getUnitKeyword_11_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group_11__0__Impl"


    // $ANTLR start "rule__GSSImportVirtualSize__Group_11__1"
    // InternalIMPORT.g:2193:1: rule__GSSImportVirtualSize__Group_11__1 : rule__GSSImportVirtualSize__Group_11__1__Impl rule__GSSImportVirtualSize__Group_11__2 ;
    public final void rule__GSSImportVirtualSize__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2197:1: ( rule__GSSImportVirtualSize__Group_11__1__Impl rule__GSSImportVirtualSize__Group_11__2 )
            // InternalIMPORT.g:2198:2: rule__GSSImportVirtualSize__Group_11__1__Impl rule__GSSImportVirtualSize__Group_11__2
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__GSSImportVirtualSize__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__Group_11__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group_11__1"


    // $ANTLR start "rule__GSSImportVirtualSize__Group_11__1__Impl"
    // InternalIMPORT.g:2205:1: rule__GSSImportVirtualSize__Group_11__1__Impl : ( ':=' ) ;
    public final void rule__GSSImportVirtualSize__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2209:1: ( ( ':=' ) )
            // InternalIMPORT.g:2210:1: ( ':=' )
            {
            // InternalIMPORT.g:2210:1: ( ':=' )
            // InternalIMPORT.g:2211:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getColonEqualsSignKeyword_11_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getColonEqualsSignKeyword_11_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group_11__1__Impl"


    // $ANTLR start "rule__GSSImportVirtualSize__Group_11__2"
    // InternalIMPORT.g:2220:1: rule__GSSImportVirtualSize__Group_11__2 : rule__GSSImportVirtualSize__Group_11__2__Impl rule__GSSImportVirtualSize__Group_11__3 ;
    public final void rule__GSSImportVirtualSize__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2224:1: ( rule__GSSImportVirtualSize__Group_11__2__Impl rule__GSSImportVirtualSize__Group_11__3 )
            // InternalIMPORT.g:2225:2: rule__GSSImportVirtualSize__Group_11__2__Impl rule__GSSImportVirtualSize__Group_11__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__GSSImportVirtualSize__Group_11__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__Group_11__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group_11__2"


    // $ANTLR start "rule__GSSImportVirtualSize__Group_11__2__Impl"
    // InternalIMPORT.g:2232:1: rule__GSSImportVirtualSize__Group_11__2__Impl : ( ( rule__GSSImportVirtualSize__UnitAssignment_11_2 ) ) ;
    public final void rule__GSSImportVirtualSize__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2236:1: ( ( ( rule__GSSImportVirtualSize__UnitAssignment_11_2 ) ) )
            // InternalIMPORT.g:2237:1: ( ( rule__GSSImportVirtualSize__UnitAssignment_11_2 ) )
            {
            // InternalIMPORT.g:2237:1: ( ( rule__GSSImportVirtualSize__UnitAssignment_11_2 ) )
            // InternalIMPORT.g:2238:2: ( rule__GSSImportVirtualSize__UnitAssignment_11_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getUnitAssignment_11_2()); 
            }
            // InternalIMPORT.g:2239:2: ( rule__GSSImportVirtualSize__UnitAssignment_11_2 )
            // InternalIMPORT.g:2239:3: rule__GSSImportVirtualSize__UnitAssignment_11_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__UnitAssignment_11_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getUnitAssignment_11_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group_11__2__Impl"


    // $ANTLR start "rule__GSSImportVirtualSize__Group_11__3"
    // InternalIMPORT.g:2247:1: rule__GSSImportVirtualSize__Group_11__3 : rule__GSSImportVirtualSize__Group_11__3__Impl ;
    public final void rule__GSSImportVirtualSize__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2251:1: ( rule__GSSImportVirtualSize__Group_11__3__Impl )
            // InternalIMPORT.g:2252:2: rule__GSSImportVirtualSize__Group_11__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportVirtualSize__Group_11__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group_11__3"


    // $ANTLR start "rule__GSSImportVirtualSize__Group_11__3__Impl"
    // InternalIMPORT.g:2258:1: rule__GSSImportVirtualSize__Group_11__3__Impl : ( ';' ) ;
    public final void rule__GSSImportVirtualSize__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2262:1: ( ( ';' ) )
            // InternalIMPORT.g:2263:1: ( ';' )
            {
            // InternalIMPORT.g:2263:1: ( ';' )
            // InternalIMPORT.g:2264:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_11_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_11_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__Group_11__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalIMPORT.g:2274:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2278:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalIMPORT.g:2279:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
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
    // InternalIMPORT.g:2286:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2290:1: ( ( RULE_ID ) )
            // InternalIMPORT.g:2291:1: ( RULE_ID )
            {
            // InternalIMPORT.g:2291:1: ( RULE_ID )
            // InternalIMPORT.g:2292:2: RULE_ID
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
    // InternalIMPORT.g:2301:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2305:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalIMPORT.g:2306:2: rule__QualifiedName__Group__1__Impl
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
    // InternalIMPORT.g:2312:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2316:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalIMPORT.g:2317:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalIMPORT.g:2317:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalIMPORT.g:2318:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalIMPORT.g:2319:2: ( rule__QualifiedName__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==32) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalIMPORT.g:2319:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalIMPORT.g:2328:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2332:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalIMPORT.g:2333:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalIMPORT.g:2340:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2344:1: ( ( '.' ) )
            // InternalIMPORT.g:2345:1: ( '.' )
            {
            // InternalIMPORT.g:2345:1: ( '.' )
            // InternalIMPORT.g:2346:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIMPORT.g:2355:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2359:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalIMPORT.g:2360:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalIMPORT.g:2366:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2370:1: ( ( RULE_ID ) )
            // InternalIMPORT.g:2371:1: ( RULE_ID )
            {
            // InternalIMPORT.g:2371:1: ( RULE_ID )
            // InternalIMPORT.g:2372:2: RULE_ID
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
    // InternalIMPORT.g:2382:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2386:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalIMPORT.g:2387:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
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
    // InternalIMPORT.g:2394:1: rule__Version__Group__0__Impl : ( ( rule__Version__Alternatives_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2398:1: ( ( ( rule__Version__Alternatives_0 ) ) )
            // InternalIMPORT.g:2399:1: ( ( rule__Version__Alternatives_0 ) )
            {
            // InternalIMPORT.g:2399:1: ( ( rule__Version__Alternatives_0 ) )
            // InternalIMPORT.g:2400:2: ( rule__Version__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_0()); 
            }
            // InternalIMPORT.g:2401:2: ( rule__Version__Alternatives_0 )
            // InternalIMPORT.g:2401:3: rule__Version__Alternatives_0
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
    // InternalIMPORT.g:2409:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2413:1: ( rule__Version__Group__1__Impl )
            // InternalIMPORT.g:2414:2: rule__Version__Group__1__Impl
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
    // InternalIMPORT.g:2420:1: rule__Version__Group__1__Impl : ( ( rule__Version__Group_1__0 )* ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2424:1: ( ( ( rule__Version__Group_1__0 )* ) )
            // InternalIMPORT.g:2425:1: ( ( rule__Version__Group_1__0 )* )
            {
            // InternalIMPORT.g:2425:1: ( ( rule__Version__Group_1__0 )* )
            // InternalIMPORT.g:2426:2: ( rule__Version__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1()); 
            }
            // InternalIMPORT.g:2427:2: ( rule__Version__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalIMPORT.g:2427:3: rule__Version__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    rule__Version__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalIMPORT.g:2436:1: rule__Version__Group_0_1__0 : rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 ;
    public final void rule__Version__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2440:1: ( rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 )
            // InternalIMPORT.g:2441:2: rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalIMPORT.g:2448:1: rule__Version__Group_0_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2452:1: ( ( ( RULE_INT )? ) )
            // InternalIMPORT.g:2453:1: ( ( RULE_INT )? )
            {
            // InternalIMPORT.g:2453:1: ( ( RULE_INT )? )
            // InternalIMPORT.g:2454:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
            }
            // InternalIMPORT.g:2455:2: ( RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalIMPORT.g:2455:3: RULE_INT
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
    // InternalIMPORT.g:2463:1: rule__Version__Group_0_1__1 : rule__Version__Group_0_1__1__Impl ;
    public final void rule__Version__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2467:1: ( rule__Version__Group_0_1__1__Impl )
            // InternalIMPORT.g:2468:2: rule__Version__Group_0_1__1__Impl
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
    // InternalIMPORT.g:2474:1: rule__Version__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2478:1: ( ( RULE_ID ) )
            // InternalIMPORT.g:2479:1: ( RULE_ID )
            {
            // InternalIMPORT.g:2479:1: ( RULE_ID )
            // InternalIMPORT.g:2480:2: RULE_ID
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
    // InternalIMPORT.g:2490:1: rule__Version__Group_1__0 : rule__Version__Group_1__0__Impl rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2494:1: ( rule__Version__Group_1__0__Impl rule__Version__Group_1__1 )
            // InternalIMPORT.g:2495:2: rule__Version__Group_1__0__Impl rule__Version__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalIMPORT.g:2502:1: rule__Version__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2506:1: ( ( '.' ) )
            // InternalIMPORT.g:2507:1: ( '.' )
            {
            // InternalIMPORT.g:2507:1: ( '.' )
            // InternalIMPORT.g:2508:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIMPORT.g:2517:1: rule__Version__Group_1__1 : rule__Version__Group_1__1__Impl ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2521:1: ( rule__Version__Group_1__1__Impl )
            // InternalIMPORT.g:2522:2: rule__Version__Group_1__1__Impl
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
    // InternalIMPORT.g:2528:1: rule__Version__Group_1__1__Impl : ( ( rule__Version__Alternatives_1_1 ) ) ;
    public final void rule__Version__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2532:1: ( ( ( rule__Version__Alternatives_1_1 ) ) )
            // InternalIMPORT.g:2533:1: ( ( rule__Version__Alternatives_1_1 ) )
            {
            // InternalIMPORT.g:2533:1: ( ( rule__Version__Alternatives_1_1 ) )
            // InternalIMPORT.g:2534:2: ( rule__Version__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_1_1()); 
            }
            // InternalIMPORT.g:2535:2: ( rule__Version__Alternatives_1_1 )
            // InternalIMPORT.g:2535:3: rule__Version__Alternatives_1_1
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
    // InternalIMPORT.g:2544:1: rule__Version__Group_1_1_1__0 : rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 ;
    public final void rule__Version__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2548:1: ( rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 )
            // InternalIMPORT.g:2549:2: rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalIMPORT.g:2556:1: rule__Version__Group_1_1_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2560:1: ( ( ( RULE_INT )? ) )
            // InternalIMPORT.g:2561:1: ( ( RULE_INT )? )
            {
            // InternalIMPORT.g:2561:1: ( ( RULE_INT )? )
            // InternalIMPORT.g:2562:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
            }
            // InternalIMPORT.g:2563:2: ( RULE_INT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalIMPORT.g:2563:3: RULE_INT
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
    // InternalIMPORT.g:2571:1: rule__Version__Group_1_1_1__1 : rule__Version__Group_1_1_1__1__Impl ;
    public final void rule__Version__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2575:1: ( rule__Version__Group_1_1_1__1__Impl )
            // InternalIMPORT.g:2576:2: rule__Version__Group_1_1_1__1__Impl
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
    // InternalIMPORT.g:2582:1: rule__Version__Group_1_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2586:1: ( ( RULE_ID ) )
            // InternalIMPORT.g:2587:1: ( RULE_ID )
            {
            // InternalIMPORT.g:2587:1: ( RULE_ID )
            // InternalIMPORT.g:2588:2: RULE_ID
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
    // InternalIMPORT.g:2598:1: rule__VersionedQualifiedName__Group__0 : rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 ;
    public final void rule__VersionedQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2602:1: ( rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 )
            // InternalIMPORT.g:2603:2: rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
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
    // InternalIMPORT.g:2610:1: rule__VersionedQualifiedName__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__VersionedQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2614:1: ( ( ruleQualifiedName ) )
            // InternalIMPORT.g:2615:1: ( ruleQualifiedName )
            {
            // InternalIMPORT.g:2615:1: ( ruleQualifiedName )
            // InternalIMPORT.g:2616:2: ruleQualifiedName
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
    // InternalIMPORT.g:2625:1: rule__VersionedQualifiedName__Group__1 : rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 ;
    public final void rule__VersionedQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2629:1: ( rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 )
            // InternalIMPORT.g:2630:2: rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalIMPORT.g:2637:1: rule__VersionedQualifiedName__Group__1__Impl : ( '(' ) ;
    public final void rule__VersionedQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2641:1: ( ( '(' ) )
            // InternalIMPORT.g:2642:1: ( '(' )
            {
            // InternalIMPORT.g:2642:1: ( '(' )
            // InternalIMPORT.g:2643:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIMPORT.g:2652:1: rule__VersionedQualifiedName__Group__2 : rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 ;
    public final void rule__VersionedQualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2656:1: ( rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 )
            // InternalIMPORT.g:2657:2: rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalIMPORT.g:2664:1: rule__VersionedQualifiedName__Group__2__Impl : ( ruleVersion ) ;
    public final void rule__VersionedQualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2668:1: ( ( ruleVersion ) )
            // InternalIMPORT.g:2669:1: ( ruleVersion )
            {
            // InternalIMPORT.g:2669:1: ( ruleVersion )
            // InternalIMPORT.g:2670:2: ruleVersion
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
    // InternalIMPORT.g:2679:1: rule__VersionedQualifiedName__Group__3 : rule__VersionedQualifiedName__Group__3__Impl ;
    public final void rule__VersionedQualifiedName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2683:1: ( rule__VersionedQualifiedName__Group__3__Impl )
            // InternalIMPORT.g:2684:2: rule__VersionedQualifiedName__Group__3__Impl
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
    // InternalIMPORT.g:2690:1: rule__VersionedQualifiedName__Group__3__Impl : ( ')' ) ;
    public final void rule__VersionedQualifiedName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2694:1: ( ( ')' ) )
            // InternalIMPORT.g:2695:1: ( ')' )
            {
            // InternalIMPORT.g:2695:1: ( ')' )
            // InternalIMPORT.g:2696:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIMPORT.g:2706:1: rule__VersionedQualifiedReferenceName__Group__0 : rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2710:1: ( rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1 )
            // InternalIMPORT.g:2711:2: rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1
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
    // InternalIMPORT.g:2718:1: rule__VersionedQualifiedReferenceName__Group__0__Impl : ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2722:1: ( ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? ) )
            // InternalIMPORT.g:2723:1: ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? )
            {
            // InternalIMPORT.g:2723:1: ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? )
            // InternalIMPORT.g:2724:2: ( rule__VersionedQualifiedReferenceName__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_0()); 
            }
            // InternalIMPORT.g:2725:2: ( rule__VersionedQualifiedReferenceName__Group_0__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( ((LA15_1>=32 && LA15_1<=33)) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalIMPORT.g:2725:3: rule__VersionedQualifiedReferenceName__Group_0__0
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
    // InternalIMPORT.g:2733:1: rule__VersionedQualifiedReferenceName__Group__1 : rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2 ;
    public final void rule__VersionedQualifiedReferenceName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2737:1: ( rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2 )
            // InternalIMPORT.g:2738:2: rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_29);
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
    // InternalIMPORT.g:2745:1: rule__VersionedQualifiedReferenceName__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2749:1: ( ( RULE_ID ) )
            // InternalIMPORT.g:2750:1: ( RULE_ID )
            {
            // InternalIMPORT.g:2750:1: ( RULE_ID )
            // InternalIMPORT.g:2751:2: RULE_ID
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
    // InternalIMPORT.g:2760:1: rule__VersionedQualifiedReferenceName__Group__2 : rule__VersionedQualifiedReferenceName__Group__2__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2764:1: ( rule__VersionedQualifiedReferenceName__Group__2__Impl )
            // InternalIMPORT.g:2765:2: rule__VersionedQualifiedReferenceName__Group__2__Impl
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
    // InternalIMPORT.g:2771:1: rule__VersionedQualifiedReferenceName__Group__2__Impl : ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2775:1: ( ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* ) )
            // InternalIMPORT.g:2776:1: ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* )
            {
            // InternalIMPORT.g:2776:1: ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* )
            // InternalIMPORT.g:2777:2: ( rule__VersionedQualifiedReferenceName__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_2()); 
            }
            // InternalIMPORT.g:2778:2: ( rule__VersionedQualifiedReferenceName__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==35) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalIMPORT.g:2778:3: rule__VersionedQualifiedReferenceName__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_30);
            	    rule__VersionedQualifiedReferenceName__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalIMPORT.g:2787:1: rule__VersionedQualifiedReferenceName__Group_0__0 : rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2791:1: ( rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1 )
            // InternalIMPORT.g:2792:2: rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
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
    // InternalIMPORT.g:2799:1: rule__VersionedQualifiedReferenceName__Group_0__0__Impl : ( ruleVersionedQualifiedName ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2803:1: ( ( ruleVersionedQualifiedName ) )
            // InternalIMPORT.g:2804:1: ( ruleVersionedQualifiedName )
            {
            // InternalIMPORT.g:2804:1: ( ruleVersionedQualifiedName )
            // InternalIMPORT.g:2805:2: ruleVersionedQualifiedName
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
    // InternalIMPORT.g:2814:1: rule__VersionedQualifiedReferenceName__Group_0__1 : rule__VersionedQualifiedReferenceName__Group_0__1__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2818:1: ( rule__VersionedQualifiedReferenceName__Group_0__1__Impl )
            // InternalIMPORT.g:2819:2: rule__VersionedQualifiedReferenceName__Group_0__1__Impl
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
    // InternalIMPORT.g:2825:1: rule__VersionedQualifiedReferenceName__Group_0__1__Impl : ( '::' ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2829:1: ( ( '::' ) )
            // InternalIMPORT.g:2830:1: ( '::' )
            {
            // InternalIMPORT.g:2830:1: ( '::' )
            // InternalIMPORT.g:2831:2: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIMPORT.g:2841:1: rule__VersionedQualifiedReferenceName__Group_2__0 : rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2845:1: ( rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1 )
            // InternalIMPORT.g:2846:2: rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1
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
    // InternalIMPORT.g:2853:1: rule__VersionedQualifiedReferenceName__Group_2__0__Impl : ( '::' ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2857:1: ( ( '::' ) )
            // InternalIMPORT.g:2858:1: ( '::' )
            {
            // InternalIMPORT.g:2858:1: ( '::' )
            // InternalIMPORT.g:2859:2: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIMPORT.g:2868:1: rule__VersionedQualifiedReferenceName__Group_2__1 : rule__VersionedQualifiedReferenceName__Group_2__1__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2872:1: ( rule__VersionedQualifiedReferenceName__Group_2__1__Impl )
            // InternalIMPORT.g:2873:2: rule__VersionedQualifiedReferenceName__Group_2__1__Impl
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
    // InternalIMPORT.g:2879:1: rule__VersionedQualifiedReferenceName__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2883:1: ( ( RULE_ID ) )
            // InternalIMPORT.g:2884:1: ( RULE_ID )
            {
            // InternalIMPORT.g:2884:1: ( RULE_ID )
            // InternalIMPORT.g:2885:2: RULE_ID
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
    // InternalIMPORT.g:2895:1: rule__INTEGER__Group_0__0 : rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 ;
    public final void rule__INTEGER__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2899:1: ( rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 )
            // InternalIMPORT.g:2900:2: rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
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
    // InternalIMPORT.g:2907:1: rule__INTEGER__Group_0__0__Impl : ( ( '-' )? ) ;
    public final void rule__INTEGER__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2911:1: ( ( ( '-' )? ) )
            // InternalIMPORT.g:2912:1: ( ( '-' )? )
            {
            // InternalIMPORT.g:2912:1: ( ( '-' )? )
            // InternalIMPORT.g:2913:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); 
            }
            // InternalIMPORT.g:2914:2: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalIMPORT.g:2914:3: '-'
                    {
                    match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalIMPORT.g:2922:1: rule__INTEGER__Group_0__1 : rule__INTEGER__Group_0__1__Impl ;
    public final void rule__INTEGER__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2926:1: ( rule__INTEGER__Group_0__1__Impl )
            // InternalIMPORT.g:2927:2: rule__INTEGER__Group_0__1__Impl
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
    // InternalIMPORT.g:2933:1: rule__INTEGER__Group_0__1__Impl : ( RULE_INT ) ;
    public final void rule__INTEGER__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:2937:1: ( ( RULE_INT ) )
            // InternalIMPORT.g:2938:1: ( RULE_INT )
            {
            // InternalIMPORT.g:2938:1: ( RULE_INT )
            // InternalIMPORT.g:2939:2: RULE_INT
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


    // $ANTLR start "rule__GSSImportImport__UnorderedGroup_3"
    // InternalIMPORT.g:2949:1: rule__GSSImportImport__UnorderedGroup_3 : rule__GSSImportImport__UnorderedGroup_3__0 {...}?;
    public final void rule__GSSImportImport__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3());
        	
        try {
            // InternalIMPORT.g:2954:1: ( rule__GSSImportImport__UnorderedGroup_3__0 {...}?)
            // InternalIMPORT.g:2955:2: rule__GSSImportImport__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__UnorderedGroup_3__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__GSSImportImport__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__UnorderedGroup_3"


    // $ANTLR start "rule__GSSImportImport__UnorderedGroup_3__Impl"
    // InternalIMPORT.g:2963:1: rule__GSSImportImport__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__GSSImportImport__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSImportImport__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__GSSImportImport__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalIMPORT.g:2968:1: ( ( ({...}? => ( ( ( rule__GSSImportImport__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSImportImport__Group_3_1__0 ) ) ) ) ) )
            // InternalIMPORT.g:2969:3: ( ({...}? => ( ( ( rule__GSSImportImport__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSImportImport__Group_3_1__0 ) ) ) ) )
            {
            // InternalIMPORT.g:2969:3: ( ({...}? => ( ( ( rule__GSSImportImport__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__GSSImportImport__Group_3_1__0 ) ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( LA18_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 0) ) {
                alt18=1;
            }
            else if ( LA18_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 1) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalIMPORT.g:2970:3: ({...}? => ( ( ( rule__GSSImportImport__Group_3_0__0 ) ) ) )
                    {
                    // InternalIMPORT.g:2970:3: ({...}? => ( ( ( rule__GSSImportImport__Group_3_0__0 ) ) ) )
                    // InternalIMPORT.g:2971:4: {...}? => ( ( ( rule__GSSImportImport__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSImportImport__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalIMPORT.g:2971:111: ( ( ( rule__GSSImportImport__Group_3_0__0 ) ) )
                    // InternalIMPORT.g:2972:5: ( ( rule__GSSImportImport__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // InternalIMPORT.g:2978:5: ( ( rule__GSSImportImport__Group_3_0__0 ) )
                    // InternalIMPORT.g:2979:6: ( rule__GSSImportImport__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSImportImportAccess().getGroup_3_0()); 
                    }
                    // InternalIMPORT.g:2980:6: ( rule__GSSImportImport__Group_3_0__0 )
                    // InternalIMPORT.g:2980:7: rule__GSSImportImport__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSImportImport__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSImportImportAccess().getGroup_3_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIMPORT.g:2985:3: ({...}? => ( ( ( rule__GSSImportImport__Group_3_1__0 ) ) ) )
                    {
                    // InternalIMPORT.g:2985:3: ({...}? => ( ( ( rule__GSSImportImport__Group_3_1__0 ) ) ) )
                    // InternalIMPORT.g:2986:4: {...}? => ( ( ( rule__GSSImportImport__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__GSSImportImport__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalIMPORT.g:2986:111: ( ( ( rule__GSSImportImport__Group_3_1__0 ) ) )
                    // InternalIMPORT.g:2987:5: ( ( rule__GSSImportImport__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // InternalIMPORT.g:2993:5: ( ( rule__GSSImportImport__Group_3_1__0 ) )
                    // InternalIMPORT.g:2994:6: ( rule__GSSImportImport__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGSSImportImportAccess().getGroup_3_1()); 
                    }
                    // InternalIMPORT.g:2995:6: ( rule__GSSImportImport__Group_3_1__0 )
                    // InternalIMPORT.g:2995:7: rule__GSSImportImport__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSImportImport__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGSSImportImportAccess().getGroup_3_1()); 
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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__GSSImportImport__UnorderedGroup_3__0"
    // InternalIMPORT.g:3008:1: rule__GSSImportImport__UnorderedGroup_3__0 : rule__GSSImportImport__UnorderedGroup_3__Impl ( rule__GSSImportImport__UnorderedGroup_3__1 )? ;
    public final void rule__GSSImportImport__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:3012:1: ( rule__GSSImportImport__UnorderedGroup_3__Impl ( rule__GSSImportImport__UnorderedGroup_3__1 )? )
            // InternalIMPORT.g:3013:2: rule__GSSImportImport__UnorderedGroup_3__Impl ( rule__GSSImportImport__UnorderedGroup_3__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__GSSImportImport__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalIMPORT.g:3014:2: ( rule__GSSImportImport__UnorderedGroup_3__1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( LA19_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 0) ) {
                alt19=1;
            }
            else if ( LA19_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 1) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalIMPORT.g:0:0: rule__GSSImportImport__UnorderedGroup_3__1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__GSSImportImport__UnorderedGroup_3__1();

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
    // $ANTLR end "rule__GSSImportImport__UnorderedGroup_3__0"


    // $ANTLR start "rule__GSSImportImport__UnorderedGroup_3__1"
    // InternalIMPORT.g:3020:1: rule__GSSImportImport__UnorderedGroup_3__1 : rule__GSSImportImport__UnorderedGroup_3__Impl ;
    public final void rule__GSSImportImport__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:3024:1: ( rule__GSSImportImport__UnorderedGroup_3__Impl )
            // InternalIMPORT.g:3025:2: rule__GSSImportImport__UnorderedGroup_3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__GSSImportImport__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__UnorderedGroup_3__1"


    // $ANTLR start "rule__GSSModelFile__ImportsAssignment_0"
    // InternalIMPORT.g:3032:1: rule__GSSModelFile__ImportsAssignment_0 : ( ruleGSSModelFileImport ) ;
    public final void rule__GSSModelFile__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:3036:1: ( ( ruleGSSModelFileImport ) )
            // InternalIMPORT.g:3037:2: ( ruleGSSModelFileImport )
            {
            // InternalIMPORT.g:3037:2: ( ruleGSSModelFileImport )
            // InternalIMPORT.g:3038:3: ruleGSSModelFileImport
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
    // InternalIMPORT.g:3047:1: rule__GSSModelFile__ElementAssignment_1 : ( ruleGSSImportImport ) ;
    public final void rule__GSSModelFile__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:3051:1: ( ( ruleGSSImportImport ) )
            // InternalIMPORT.g:3052:2: ( ruleGSSImportImport )
            {
            // InternalIMPORT.g:3052:2: ( ruleGSSImportImport )
            // InternalIMPORT.g:3053:3: ruleGSSImportImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSModelFileAccess().getElementGSSImportImportParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSImportImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSModelFileAccess().getElementGSSImportImportParserRuleCall_1_0()); 
            }

            }


            }

        }
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
    // InternalIMPORT.g:3062:1: rule__GSSModelFileImport__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GSSModelFileImport__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:3066:1: ( ( RULE_STRING ) )
            // InternalIMPORT.g:3067:2: ( RULE_STRING )
            {
            // InternalIMPORT.g:3067:2: ( RULE_STRING )
            // InternalIMPORT.g:3068:3: RULE_STRING
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


    // $ANTLR start "rule__GSSImportImport__NameAssignment_1"
    // InternalIMPORT.g:3077:1: rule__GSSImportImport__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GSSImportImport__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:3081:1: ( ( RULE_ID ) )
            // InternalIMPORT.g:3082:2: ( RULE_ID )
            {
            // InternalIMPORT.g:3082:2: ( RULE_ID )
            // InternalIMPORT.g:3083:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__NameAssignment_1"


    // $ANTLR start "rule__GSSImportImport__UriAssignment_3_0_2"
    // InternalIMPORT.g:3092:1: rule__GSSImportImport__UriAssignment_3_0_2 : ( ruleQualifiedName ) ;
    public final void rule__GSSImportImport__UriAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:3096:1: ( ( ruleQualifiedName ) )
            // InternalIMPORT.g:3097:2: ( ruleQualifiedName )
            {
            // InternalIMPORT.g:3097:2: ( ruleQualifiedName )
            // InternalIMPORT.g:3098:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__UriAssignment_3_0_2"


    // $ANTLR start "rule__GSSImportImport__VersionAssignment_3_1_2"
    // InternalIMPORT.g:3107:1: rule__GSSImportImport__VersionAssignment_3_1_2 : ( ruleVersion ) ;
    public final void rule__GSSImportImport__VersionAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:3111:1: ( ( ruleVersion ) )
            // InternalIMPORT.g:3112:2: ( ruleVersion )
            {
            // InternalIMPORT.g:3112:2: ( ruleVersion )
            // InternalIMPORT.g:3113:3: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getVersionVersionParserRuleCall_3_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getVersionVersionParserRuleCall_3_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__VersionAssignment_3_1_2"


    // $ANTLR start "rule__GSSImportImport__FromAssignment_6"
    // InternalIMPORT.g:3122:1: rule__GSSImportImport__FromAssignment_6 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__GSSImportImport__FromAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:3126:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalIMPORT.g:3127:2: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalIMPORT.g:3127:2: ( ( ruleVersionedQualifiedName ) )
            // InternalIMPORT.g:3128:3: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getFromGSSFormatFormatCrossReference_6_0()); 
            }
            // InternalIMPORT.g:3129:3: ( ruleVersionedQualifiedName )
            // InternalIMPORT.g:3130:4: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getFromGSSFormatFormatVersionedQualifiedNameParserRuleCall_6_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getFromGSSFormatFormatVersionedQualifiedNameParserRuleCall_6_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getFromGSSFormatFormatCrossReference_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__FromAssignment_6"


    // $ANTLR start "rule__GSSImportImport__ToAssignment_10_1"
    // InternalIMPORT.g:3141:1: rule__GSSImportImport__ToAssignment_10_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__GSSImportImport__ToAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:3145:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalIMPORT.g:3146:2: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalIMPORT.g:3146:2: ( ( ruleVersionedQualifiedName ) )
            // InternalIMPORT.g:3147:3: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getToGSSFormatFormatCrossReference_10_1_0()); 
            }
            // InternalIMPORT.g:3148:3: ( ruleVersionedQualifiedName )
            // InternalIMPORT.g:3149:4: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getToGSSFormatFormatVersionedQualifiedNameParserRuleCall_10_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getToGSSFormatFormatVersionedQualifiedNameParserRuleCall_10_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getToGSSFormatFormatCrossReference_10_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__ToAssignment_10_1"


    // $ANTLR start "rule__GSSImportImport__DataSourceAssignment_12"
    // InternalIMPORT.g:3160:1: rule__GSSImportImport__DataSourceAssignment_12 : ( ruleGSSImportDataSource ) ;
    public final void rule__GSSImportImport__DataSourceAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:3164:1: ( ( ruleGSSImportDataSource ) )
            // InternalIMPORT.g:3165:2: ( ruleGSSImportDataSource )
            {
            // InternalIMPORT.g:3165:2: ( ruleGSSImportDataSource )
            // InternalIMPORT.g:3166:3: ruleGSSImportDataSource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getDataSourceGSSImportDataSourceParserRuleCall_12_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSImportDataSource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getDataSourceGSSImportDataSourceParserRuleCall_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__DataSourceAssignment_12"


    // $ANTLR start "rule__GSSImportImport__VirtualSizeAssignment_13"
    // InternalIMPORT.g:3175:1: rule__GSSImportImport__VirtualSizeAssignment_13 : ( ruleGSSImportVirtualSize ) ;
    public final void rule__GSSImportImport__VirtualSizeAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:3179:1: ( ( ruleGSSImportVirtualSize ) )
            // InternalIMPORT.g:3180:2: ( ruleGSSImportVirtualSize )
            {
            // InternalIMPORT.g:3180:2: ( ruleGSSImportVirtualSize )
            // InternalIMPORT.g:3181:3: ruleGSSImportVirtualSize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportImportAccess().getVirtualSizeGSSImportVirtualSizeParserRuleCall_13_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSImportVirtualSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportImportAccess().getVirtualSizeGSSImportVirtualSizeParserRuleCall_13_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportImport__VirtualSizeAssignment_13"


    // $ANTLR start "rule__GSSImportDataSource__FieldRefAssignment_4"
    // InternalIMPORT.g:3190:1: rule__GSSImportDataSource__FieldRefAssignment_4 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__GSSImportDataSource__FieldRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:3194:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalIMPORT.g:3195:2: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalIMPORT.g:3195:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalIMPORT.g:3196:3: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportDataSourceAccess().getFieldRefGSSFormatFieldCrossReference_4_0()); 
            }
            // InternalIMPORT.g:3197:3: ( ruleVersionedQualifiedReferenceName )
            // InternalIMPORT.g:3198:4: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportDataSourceAccess().getFieldRefGSSFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportDataSourceAccess().getFieldRefGSSFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportDataSourceAccess().getFieldRefGSSFormatFieldCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__FieldRefAssignment_4"


    // $ANTLR start "rule__GSSImportDataSource__LeftTrimAssignment_8"
    // InternalIMPORT.g:3209:1: rule__GSSImportDataSource__LeftTrimAssignment_8 : ( ruleINTEGER ) ;
    public final void rule__GSSImportDataSource__LeftTrimAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:3213:1: ( ( ruleINTEGER ) )
            // InternalIMPORT.g:3214:2: ( ruleINTEGER )
            {
            // InternalIMPORT.g:3214:2: ( ruleINTEGER )
            // InternalIMPORT.g:3215:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportDataSourceAccess().getLeftTrimINTEGERParserRuleCall_8_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportDataSourceAccess().getLeftTrimINTEGERParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__LeftTrimAssignment_8"


    // $ANTLR start "rule__GSSImportDataSource__RightTrimAssignment_12"
    // InternalIMPORT.g:3224:1: rule__GSSImportDataSource__RightTrimAssignment_12 : ( ruleINTEGER ) ;
    public final void rule__GSSImportDataSource__RightTrimAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:3228:1: ( ( ruleINTEGER ) )
            // InternalIMPORT.g:3229:2: ( ruleINTEGER )
            {
            // InternalIMPORT.g:3229:2: ( ruleINTEGER )
            // InternalIMPORT.g:3230:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportDataSourceAccess().getRightTrimINTEGERParserRuleCall_12_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportDataSourceAccess().getRightTrimINTEGERParserRuleCall_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportDataSource__RightTrimAssignment_12"


    // $ANTLR start "rule__GSSImportVirtualSize__FieldRefAssignment_4"
    // InternalIMPORT.g:3239:1: rule__GSSImportVirtualSize__FieldRefAssignment_4 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__GSSImportVirtualSize__FieldRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:3243:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalIMPORT.g:3244:2: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalIMPORT.g:3244:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalIMPORT.g:3245:3: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getFieldRefGSSFormatFieldCrossReference_4_0()); 
            }
            // InternalIMPORT.g:3246:3: ( ruleVersionedQualifiedReferenceName )
            // InternalIMPORT.g:3247:4: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getFieldRefGSSFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getFieldRefGSSFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getFieldRefGSSFormatFieldCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__FieldRefAssignment_4"


    // $ANTLR start "rule__GSSImportVirtualSize__ToAssignment_8"
    // InternalIMPORT.g:3258:1: rule__GSSImportVirtualSize__ToAssignment_8 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__GSSImportVirtualSize__ToAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:3262:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalIMPORT.g:3263:2: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalIMPORT.g:3263:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalIMPORT.g:3264:3: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getToGSSFormatFieldCrossReference_8_0()); 
            }
            // InternalIMPORT.g:3265:3: ( ruleVersionedQualifiedReferenceName )
            // InternalIMPORT.g:3266:4: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getToGSSFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getToGSSFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getToGSSFormatFieldCrossReference_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__ToAssignment_8"


    // $ANTLR start "rule__GSSImportVirtualSize__AddSizeAssignment_10_2"
    // InternalIMPORT.g:3277:1: rule__GSSImportVirtualSize__AddSizeAssignment_10_2 : ( ruleINTEGER ) ;
    public final void rule__GSSImportVirtualSize__AddSizeAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:3281:1: ( ( ruleINTEGER ) )
            // InternalIMPORT.g:3282:2: ( ruleINTEGER )
            {
            // InternalIMPORT.g:3282:2: ( ruleINTEGER )
            // InternalIMPORT.g:3283:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getAddSizeINTEGERParserRuleCall_10_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getAddSizeINTEGERParserRuleCall_10_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__AddSizeAssignment_10_2"


    // $ANTLR start "rule__GSSImportVirtualSize__UnitAssignment_11_2"
    // InternalIMPORT.g:3292:1: rule__GSSImportVirtualSize__UnitAssignment_11_2 : ( ruleGSSImportUnit ) ;
    public final void rule__GSSImportVirtualSize__UnitAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORT.g:3296:1: ( ( ruleGSSImportUnit ) )
            // InternalIMPORT.g:3297:2: ( ruleGSSImportUnit )
            {
            // InternalIMPORT.g:3297:2: ( ruleGSSImportUnit )
            // InternalIMPORT.g:3298:3: ruleGSSImportUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGSSImportVirtualSizeAccess().getUnitGSSImportUnitEnumRuleCall_11_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGSSImportUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGSSImportVirtualSizeAccess().getUnitGSSImportUnitEnumRuleCall_11_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSSImportVirtualSize__UnitAssignment_11_2"

    // $ANTLR start synpred18_InternalIMPORT
    public final void synpred18_InternalIMPORT_fragment() throws RecognitionException {   
        // InternalIMPORT.g:2970:3: ( ({...}? => ( ( ( rule__GSSImportImport__Group_3_0__0 ) ) ) ) )
        // InternalIMPORT.g:2970:3: ({...}? => ( ( ( rule__GSSImportImport__Group_3_0__0 ) ) ) )
        {
        // InternalIMPORT.g:2970:3: ({...}? => ( ( ( rule__GSSImportImport__Group_3_0__0 ) ) ) )
        // InternalIMPORT.g:2971:4: {...}? => ( ( ( rule__GSSImportImport__Group_3_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred18_InternalIMPORT", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalIMPORT.g:2971:111: ( ( ( rule__GSSImportImport__Group_3_0__0 ) ) )
        // InternalIMPORT.g:2972:5: ( ( rule__GSSImportImport__Group_3_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 0);
        // InternalIMPORT.g:2978:5: ( ( rule__GSSImportImport__Group_3_0__0 ) )
        // InternalIMPORT.g:2979:6: ( rule__GSSImportImport__Group_3_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGSSImportImportAccess().getGroup_3_0()); 
        }
        // InternalIMPORT.g:2980:6: ( rule__GSSImportImport__Group_3_0__0 )
        // InternalIMPORT.g:2980:7: rule__GSSImportImport__Group_3_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSImportImport__Group_3_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred18_InternalIMPORT

    // $ANTLR start synpred19_InternalIMPORT
    public final void synpred19_InternalIMPORT_fragment() throws RecognitionException {   
        // InternalIMPORT.g:3014:2: ( rule__GSSImportImport__UnorderedGroup_3__1 )
        // InternalIMPORT.g:3014:2: rule__GSSImportImport__UnorderedGroup_3__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__GSSImportImport__UnorderedGroup_3__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalIMPORT

    // Delegated rules

    public final boolean synpred18_InternalIMPORT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalIMPORT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalIMPORT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalIMPORT_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001040L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020400000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000030L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000C0400000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000010L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000001800002L});
    }


}