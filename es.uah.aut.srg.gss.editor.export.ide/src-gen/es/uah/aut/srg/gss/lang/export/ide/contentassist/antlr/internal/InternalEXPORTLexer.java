package es.uah.aut.srg.gss.lang.export.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEXPORTLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=6;
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

    public InternalEXPORTLexer() {;} 
    public InternalEXPORTLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEXPORTLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalEXPORT.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:11:7: ( 'bits' )
            // InternalEXPORT.g:11:9: 'bits'
            {
            match("bits"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:12:7: ( 'bytes' )
            // InternalEXPORT.g:12:9: 'bytes'
            {
            match("bytes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:13:7: ( 'import' )
            // InternalEXPORT.g:13:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:14:7: ( ':=' )
            // InternalEXPORT.g:14:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:15:7: ( ';' )
            // InternalEXPORT.g:15:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:16:7: ( 'GSSExportExport' )
            // InternalEXPORT.g:16:9: 'GSSExportExport'
            {
            match("GSSExportExport"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:17:7: ( '{' )
            // InternalEXPORT.g:17:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:18:7: ( 'from' )
            // InternalEXPORT.g:18:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:19:7: ( 'to' )
            // InternalEXPORT.g:19:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:20:7: ( '}' )
            // InternalEXPORT.g:20:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:21:7: ( 'uri' )
            // InternalEXPORT.g:21:9: 'uri'
            {
            match("uri"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:22:7: ( 'version' )
            // InternalEXPORT.g:22:9: 'version'
            {
            match("version"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:23:7: ( 'GSSExportSizes' )
            // InternalEXPORT.g:23:9: 'GSSExportSizes'
            {
            match("GSSExportSizes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:24:7: ( 'GSSExportSizeFromFileLength' )
            // InternalEXPORT.g:24:9: 'GSSExportSizeFromFileLength'
            {
            match("GSSExportSizeFromFileLength"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:25:7: ( 'id' )
            // InternalEXPORT.g:25:9: 'id'
            {
            match("id"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:26:7: ( 'fromFile' )
            // InternalEXPORT.g:26:9: 'fromFile'
            {
            match("fromFile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:27:7: ( 'addSize' )
            // InternalEXPORT.g:27:9: 'addSize'
            {
            match("addSize"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:28:7: ( 'unit' )
            // InternalEXPORT.g:28:9: 'unit'
            {
            match("unit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:29:7: ( 'GSSExportSizeFromFileLine' )
            // InternalEXPORT.g:29:9: 'GSSExportSizeFromFileLine'
            {
            match("GSSExportSizeFromFileLine"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:30:7: ( 'line' )
            // InternalEXPORT.g:30:9: 'line'
            {
            match("line"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:31:7: ( 'GSSExportSizeInBits' )
            // InternalEXPORT.g:31:9: 'GSSExportSizeInBits'
            {
            match("GSSExportSizeInBits"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:32:7: ( 'GSSExportSettings' )
            // InternalEXPORT.g:32:9: 'GSSExportSettings'
            {
            match("GSSExportSettings"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:33:7: ( 'GSSExportSettingFromConst' )
            // InternalEXPORT.g:33:9: 'GSSExportSettingFromConst'
            {
            match("GSSExportSettingFromConst"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:34:7: ( 'value' )
            // InternalEXPORT.g:34:9: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:35:7: ( 'toFieldRef' )
            // InternalEXPORT.g:35:9: 'toFieldRef'
            {
            match("toFieldRef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:36:7: ( 'GSSExportSettingFromSize' )
            // InternalEXPORT.g:36:9: 'GSSExportSettingFromSize'
            {
            match("GSSExportSettingFromSize"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:37:7: ( 'sizeRef' )
            // InternalEXPORT.g:37:9: 'sizeRef'
            {
            match("sizeRef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:38:7: ( 'GSSExportSettingFromFile' )
            // InternalEXPORT.g:38:9: 'GSSExportSettingFromFile'
            {
            match("GSSExportSettingFromFile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:39:7: ( 'file' )
            // InternalEXPORT.g:39:9: 'file'
            {
            match("file"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:40:7: ( 'offset' )
            // InternalEXPORT.g:40:9: 'offset'
            {
            match("offset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:41:7: ( 'size' )
            // InternalEXPORT.g:41:9: 'size'
            {
            match("size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:42:7: ( 'GSSExportSettingFromField' )
            // InternalEXPORT.g:42:9: 'GSSExportSettingFromField'
            {
            match("GSSExportSettingFromField"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:43:7: ( 'fieldRef' )
            // InternalEXPORT.g:43:9: 'fieldRef'
            {
            match("fieldRef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:44:7: ( 'GSSExportSettingAIFromConst' )
            // InternalEXPORT.g:44:9: 'GSSExportSettingAIFromConst'
            {
            match("GSSExportSettingAIFromConst"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:45:7: ( 'GSSExportSettingAIFromFile' )
            // InternalEXPORT.g:45:9: 'GSSExportSettingAIFromFile'
            {
            match("GSSExportSettingAIFromFile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:46:7: ( 'toArrayIndex' )
            // InternalEXPORT.g:46:9: 'toArrayIndex'
            {
            match("toArrayIndex"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:47:7: ( 'GSSExportActivateDICs' )
            // InternalEXPORT.g:47:9: 'GSSExportActivateDICs'
            {
            match("GSSExportActivateDICs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:48:7: ( 'GSSExportDIC' )
            // InternalEXPORT.g:48:9: 'GSSExportDIC'
            {
            match("GSSExportDIC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:49:7: ( 'DICRef' )
            // InternalEXPORT.g:49:9: 'DICRef'
            {
            match("DICRef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:50:7: ( '.' )
            // InternalEXPORT.g:50:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:51:7: ( '(' )
            // InternalEXPORT.g:51:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:52:7: ( ')' )
            // InternalEXPORT.g:52:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:53:7: ( '-' )
            // InternalEXPORT.g:53:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "RULE_HEXADECIMAL"
    public final void mRULE_HEXADECIMAL() throws RecognitionException {
        try {
            int _type = RULE_HEXADECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:8539:18: ( '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // InternalEXPORT.g:8539:20: '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match("0x"); 

            // InternalEXPORT.g:8539:25: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='F')||(LA1_0>='a' && LA1_0<='f')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEXPORT.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEXADECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:8541:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalEXPORT.g:8541:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalEXPORT.g:8541:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEXPORT.g:8541:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalEXPORT.g:8541:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEXPORT.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:8543:10: ( ( '0' .. '9' )+ )
            // InternalEXPORT.g:8543:12: ( '0' .. '9' )+
            {
            // InternalEXPORT.g:8543:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEXPORT.g:8543:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:8545:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalEXPORT.g:8545:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalEXPORT.g:8545:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalEXPORT.g:8545:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalEXPORT.g:8545:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalEXPORT.g:8545:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEXPORT.g:8545:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalEXPORT.g:8545:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalEXPORT.g:8545:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalEXPORT.g:8545:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEXPORT.g:8545:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:8547:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalEXPORT.g:8547:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalEXPORT.g:8547:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEXPORT.g:8547:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:8549:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalEXPORT.g:8549:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalEXPORT.g:8549:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEXPORT.g:8549:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalEXPORT.g:8549:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEXPORT.g:8549:41: ( '\\r' )? '\\n'
                    {
                    // InternalEXPORT.g:8549:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalEXPORT.g:8549:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:8551:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalEXPORT.g:8551:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalEXPORT.g:8551:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEXPORT.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEXPORT.g:8553:16: ( . )
            // InternalEXPORT.g:8553:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalEXPORT.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | RULE_HEXADECIMAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=51;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalEXPORT.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalEXPORT.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalEXPORT.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalEXPORT.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalEXPORT.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalEXPORT.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalEXPORT.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalEXPORT.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalEXPORT.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalEXPORT.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalEXPORT.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalEXPORT.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalEXPORT.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalEXPORT.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalEXPORT.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalEXPORT.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalEXPORT.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalEXPORT.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalEXPORT.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalEXPORT.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalEXPORT.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalEXPORT.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalEXPORT.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalEXPORT.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalEXPORT.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalEXPORT.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalEXPORT.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalEXPORT.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalEXPORT.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalEXPORT.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalEXPORT.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalEXPORT.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalEXPORT.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalEXPORT.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalEXPORT.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalEXPORT.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalEXPORT.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalEXPORT.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalEXPORT.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalEXPORT.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalEXPORT.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalEXPORT.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalEXPORT.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // InternalEXPORT.g:1:268: RULE_HEXADECIMAL
                {
                mRULE_HEXADECIMAL(); 

                }
                break;
            case 45 :
                // InternalEXPORT.g:1:285: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 46 :
                // InternalEXPORT.g:1:293: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 47 :
                // InternalEXPORT.g:1:302: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 48 :
                // InternalEXPORT.g:1:314: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 49 :
                // InternalEXPORT.g:1:330: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 50 :
                // InternalEXPORT.g:1:346: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 51 :
                // InternalEXPORT.g:1:354: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\2\40\1\35\1\uffff\1\40\1\uffff\2\40\1\uffff\7\40\4\uffff\1\71\1\35\2\uffff\3\35\2\uffff\2\40\1\uffff\1\40\1\101\2\uffff\1\40\1\uffff\2\40\1\110\1\uffff\11\40\12\uffff\3\40\1\uffff\6\40\1\uffff\1\133\10\40\1\144\3\40\1\151\1\152\3\40\1\uffff\1\156\3\40\1\162\1\164\2\40\1\uffff\1\167\3\40\2\uffff\3\40\1\uffff\1\40\1\177\1\40\1\uffff\1\40\1\uffff\2\40\1\uffff\1\u0084\6\40\1\uffff\2\40\1\u008d\1\u008e\1\uffff\5\40\1\u0094\1\u0095\1\u0096\2\uffff\1\40\1\u0098\1\u0099\2\40\3\uffff\1\40\2\uffff\6\40\1\u00a7\6\40\1\uffff\5\40\1\u00b3\1\u00b4\4\40\2\uffff\1\40\1\u00bc\4\40\1\u00c1\1\uffff\4\40\1\uffff\6\40\1\u00ce\5\40\1\uffff\4\40\1\u00d8\4\40\1\uffff\10\40\1\u00e7\5\40\1\uffff\13\40\1\u00fb\1\u00fc\4\40\1\u0101\1\u0102\2\uffff\1\u0103\3\40\3\uffff\1\40\1\u0108\1\u0109\1\u010a\3\uffff";
    static final String DFA13_eofS =
        "\u010b\uffff";
    static final String DFA13_minS =
        "\1\0\1\151\1\144\1\75\1\uffff\1\123\1\uffff\1\151\1\157\1\uffff\1\156\1\141\1\144\2\151\1\146\1\111\4\uffff\1\170\1\101\2\uffff\2\0\1\52\2\uffff\2\164\1\uffff\1\160\1\60\2\uffff\1\123\1\uffff\1\157\1\145\1\60\1\uffff\2\151\1\162\1\154\1\144\1\156\1\172\1\146\1\103\12\uffff\1\163\1\145\1\157\1\uffff\1\105\1\155\1\145\1\154\1\151\1\162\1\uffff\1\60\1\164\1\163\1\165\1\123\2\145\1\163\1\122\1\60\1\163\1\162\1\170\2\60\1\144\1\145\1\162\1\uffff\1\60\1\151\1\145\1\151\2\60\2\145\1\uffff\1\60\1\164\1\160\1\151\2\uffff\1\122\1\154\1\141\1\uffff\1\157\1\60\1\172\1\uffff\1\145\1\uffff\1\164\1\146\1\uffff\1\60\1\157\1\154\1\145\1\144\1\171\1\156\1\uffff\1\145\1\146\2\60\1\uffff\1\162\1\145\1\146\1\122\1\111\3\60\2\uffff\1\164\2\60\1\145\1\156\3\uffff\1\101\2\uffff\1\146\1\144\1\170\1\145\1\143\1\111\1\60\1\145\1\160\1\172\2\164\1\103\1\uffff\1\170\1\157\1\145\1\164\1\151\2\60\1\162\1\106\1\151\1\166\2\uffff\1\164\1\60\1\162\2\156\1\141\1\60\1\uffff\1\157\1\102\1\147\1\164\1\uffff\1\155\1\151\1\101\1\145\1\106\1\164\1\60\1\162\1\111\1\104\1\151\1\163\1\uffff\1\157\1\106\1\111\1\154\1\60\1\155\1\162\1\103\1\145\1\uffff\1\103\1\157\1\163\1\114\1\157\2\151\1\155\1\60\1\145\1\156\1\172\1\145\1\103\1\uffff\2\156\1\163\2\145\1\154\1\157\1\151\1\147\1\145\1\164\2\60\1\144\1\156\1\154\1\164\2\60\2\uffff\1\60\1\163\1\145\1\150\3\uffff\1\164\3\60\3\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\171\1\155\1\75\1\uffff\1\123\1\uffff\1\162\1\157\1\uffff\1\162\1\145\1\144\2\151\1\146\1\111\4\uffff\1\170\1\172\2\uffff\2\uffff\1\57\2\uffff\2\164\1\uffff\1\160\1\172\2\uffff\1\123\1\uffff\1\157\1\154\1\172\1\uffff\2\151\1\162\1\154\1\144\1\156\1\172\1\146\1\103\12\uffff\1\163\1\145\1\157\1\uffff\1\105\1\155\1\145\1\154\1\151\1\162\1\uffff\1\172\1\164\1\163\1\165\1\123\2\145\1\163\1\122\1\172\1\163\1\162\1\170\2\172\1\144\1\145\1\162\1\uffff\1\172\1\151\1\145\1\151\2\172\2\145\1\uffff\1\172\1\164\1\160\1\151\2\uffff\1\122\1\154\1\141\1\uffff\1\157\2\172\1\uffff\1\145\1\uffff\1\164\1\146\1\uffff\1\172\1\157\1\154\1\145\1\144\1\171\1\156\1\uffff\1\145\1\146\2\172\1\uffff\1\162\1\145\1\146\1\122\1\111\3\172\2\uffff\1\164\2\172\1\145\1\156\3\uffff\1\123\2\uffff\1\146\1\144\1\170\1\151\1\143\1\111\1\172\1\145\1\160\1\172\2\164\1\103\1\uffff\1\170\1\157\1\145\1\164\1\151\2\172\1\162\1\163\1\151\1\166\2\uffff\1\164\1\172\1\162\2\156\1\141\1\172\1\uffff\1\157\1\102\1\147\1\164\1\uffff\1\155\1\151\1\163\1\145\1\106\1\164\1\172\1\162\1\111\1\104\1\151\1\163\1\uffff\1\157\1\106\1\111\1\154\1\172\1\155\1\162\1\103\1\145\1\uffff\1\123\1\157\1\163\1\114\1\157\2\151\1\155\1\172\1\151\1\156\1\172\1\154\1\106\1\uffff\2\156\1\163\2\145\1\154\1\157\1\151\1\147\1\145\1\164\2\172\1\144\1\156\1\154\1\164\2\172\2\uffff\1\172\1\163\1\145\1\150\3\uffff\1\164\3\172\3\uffff";
    static final String DFA13_acceptS =
        "\4\uffff\1\5\1\uffff\1\7\2\uffff\1\12\7\uffff\1\50\1\51\1\52\1\53\2\uffff\1\55\1\56\3\uffff\1\62\1\63\2\uffff\1\55\2\uffff\1\4\1\5\1\uffff\1\7\3\uffff\1\12\11\uffff\1\50\1\51\1\52\1\53\1\54\1\56\1\57\1\60\1\61\1\62\3\uffff\1\17\6\uffff\1\11\22\uffff\1\13\10\uffff\1\1\4\uffff\1\10\1\35\3\uffff\1\22\3\uffff\1\24\1\uffff\1\37\2\uffff\1\2\7\uffff\1\30\4\uffff\1\3\10\uffff\1\36\1\47\5\uffff\1\14\1\21\1\33\1\uffff\1\20\1\41\15\uffff\1\31\13\uffff\1\46\1\44\7\uffff\1\15\4\uffff\1\6\14\uffff\1\26\11\uffff\1\25\16\uffff\1\45\23\uffff\1\32\1\34\4\uffff\1\23\1\27\1\40\4\uffff\1\43\1\16\1\42";
    static final String DFA13_specialS =
        "\1\1\30\uffff\1\0\1\2\u00f0\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\34\1\35\1\31\4\35\1\32\1\22\1\23\3\35\1\24\1\21\1\33\1\25\11\30\1\3\1\4\5\35\3\27\1\20\2\27\1\5\23\27\3\35\1\26\1\27\1\35\1\14\1\1\3\27\1\7\2\27\1\2\2\27\1\15\2\27\1\17\3\27\1\16\1\10\1\12\1\13\4\27\1\6\1\35\1\11\uff82\35",
            "\1\36\17\uffff\1\37",
            "\1\42\10\uffff\1\41",
            "\1\43",
            "",
            "\1\45",
            "",
            "\1\50\10\uffff\1\47",
            "\1\51",
            "",
            "\1\54\3\uffff\1\53",
            "\1\56\3\uffff\1\55",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "",
            "",
            "",
            "",
            "\1\70",
            "\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\0\72",
            "\0\72",
            "\1\73\4\uffff\1\74",
            "",
            "",
            "\1\76",
            "\1\77",
            "",
            "\1\100",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\1\102",
            "",
            "\1\103",
            "\1\105\6\uffff\1\104",
            "\12\40\7\uffff\1\107\4\40\1\106\24\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\145",
            "\1\146",
            "\1\147",
            "\12\40\7\uffff\5\40\1\150\24\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\21\40\1\163\10\40\4\uffff\1\40\1\uffff\32\40",
            "\1\165",
            "\1\166",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "",
            "\1\173",
            "\1\174",
            "\1\175",
            "",
            "\1\176",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0080",
            "",
            "\1\u0081",
            "",
            "\1\u0082",
            "\1\u0083",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "",
            "\1\u008b",
            "\1\u008c",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\1\u0097",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u009a",
            "\1\u009b",
            "",
            "",
            "",
            "\1\u009e\2\uffff\1\u009f\1\u009c\15\uffff\1\u009d",
            "",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a4\3\uffff\1\u00a3",
            "\1\u00a5",
            "\1\u00a6",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00b5",
            "\1\u00b7\2\uffff\1\u00b8\51\uffff\1\u00b6",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "",
            "\1\u00bb",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00ca\4\uffff\1\u00c9\54\uffff\1\u00c8",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\1\u00dd\2\uffff\1\u00df\14\uffff\1\u00de",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00e8\3\uffff\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ed\6\uffff\1\u00ec",
            "\1\u00ee\2\uffff\1\u00ef",
            "",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "",
            "",
            "",
            "\1\u0107",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    static class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | RULE_HEXADECIMAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_25 = input.LA(1);

                        s = -1;
                        if ( ((LA13_25>='\u0000' && LA13_25<='\uFFFF')) ) {s = 58;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='b') ) {s = 1;}

                        else if ( (LA13_0=='i') ) {s = 2;}

                        else if ( (LA13_0==':') ) {s = 3;}

                        else if ( (LA13_0==';') ) {s = 4;}

                        else if ( (LA13_0=='G') ) {s = 5;}

                        else if ( (LA13_0=='{') ) {s = 6;}

                        else if ( (LA13_0=='f') ) {s = 7;}

                        else if ( (LA13_0=='t') ) {s = 8;}

                        else if ( (LA13_0=='}') ) {s = 9;}

                        else if ( (LA13_0=='u') ) {s = 10;}

                        else if ( (LA13_0=='v') ) {s = 11;}

                        else if ( (LA13_0=='a') ) {s = 12;}

                        else if ( (LA13_0=='l') ) {s = 13;}

                        else if ( (LA13_0=='s') ) {s = 14;}

                        else if ( (LA13_0=='o') ) {s = 15;}

                        else if ( (LA13_0=='D') ) {s = 16;}

                        else if ( (LA13_0=='.') ) {s = 17;}

                        else if ( (LA13_0=='(') ) {s = 18;}

                        else if ( (LA13_0==')') ) {s = 19;}

                        else if ( (LA13_0=='-') ) {s = 20;}

                        else if ( (LA13_0=='0') ) {s = 21;}

                        else if ( (LA13_0=='^') ) {s = 22;}

                        else if ( ((LA13_0>='A' && LA13_0<='C')||(LA13_0>='E' && LA13_0<='F')||(LA13_0>='H' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='c' && LA13_0<='e')||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='k')||(LA13_0>='m' && LA13_0<='n')||(LA13_0>='p' && LA13_0<='r')||(LA13_0>='w' && LA13_0<='z')) ) {s = 23;}

                        else if ( ((LA13_0>='1' && LA13_0<='9')) ) {s = 24;}

                        else if ( (LA13_0=='\"') ) {s = 25;}

                        else if ( (LA13_0=='\'') ) {s = 26;}

                        else if ( (LA13_0=='/') ) {s = 27;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 28;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='*' && LA13_0<=',')||(LA13_0>='<' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_26 = input.LA(1);

                        s = -1;
                        if ( ((LA13_26>='\u0000' && LA13_26<='\uFFFF')) ) {s = 58;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}