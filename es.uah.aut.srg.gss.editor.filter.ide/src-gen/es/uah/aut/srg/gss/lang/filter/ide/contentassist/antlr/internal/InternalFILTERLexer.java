package es.uah.aut.srg.gss.lang.filter.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFILTERLexer extends Lexer {
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

    public InternalFILTERLexer() {;} 
    public InternalFILTERLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFILTERLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalFILTER.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFILTER.g:11:7: ( 'decimal' )
            // InternalFILTER.g:11:9: 'decimal'
            {
            match("decimal"); 


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
            // InternalFILTER.g:12:7: ( 'hex' )
            // InternalFILTER.g:12:9: 'hex'
            {
            match("hex"); 


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
            // InternalFILTER.g:13:7: ( 'binary' )
            // InternalFILTER.g:13:9: 'binary'
            {
            match("binary"); 


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
            // InternalFILTER.g:14:7: ( 'char' )
            // InternalFILTER.g:14:9: 'char'
            {
            match("char"); 


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
            // InternalFILTER.g:15:7: ( 'string' )
            // InternalFILTER.g:15:9: 'string'
            {
            match("string"); 


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
            // InternalFILTER.g:16:7: ( 'equal' )
            // InternalFILTER.g:16:9: 'equal'
            {
            match("equal"); 


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
            // InternalFILTER.g:17:7: ( 'different' )
            // InternalFILTER.g:17:9: 'different'
            {
            match("different"); 


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
            // InternalFILTER.g:18:7: ( 'bigger_than' )
            // InternalFILTER.g:18:9: 'bigger_than'
            {
            match("bigger_than"); 


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
            // InternalFILTER.g:19:7: ( 'smaller_than' )
            // InternalFILTER.g:19:9: 'smaller_than'
            {
            match("smaller_than"); 


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
            // InternalFILTER.g:20:7: ( 'bigger_or_equal' )
            // InternalFILTER.g:20:9: 'bigger_or_equal'
            {
            match("bigger_or_equal"); 


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
            // InternalFILTER.g:21:7: ( 'smaller_or_equal' )
            // InternalFILTER.g:21:9: 'smaller_or_equal'
            {
            match("smaller_or_equal"); 


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
            // InternalFILTER.g:22:7: ( 'data' )
            // InternalFILTER.g:22:9: 'data'
            {
            match("data"); 


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
            // InternalFILTER.g:23:7: ( 'size' )
            // InternalFILTER.g:23:9: 'size'
            {
            match("size"); 


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
            // InternalFILTER.g:24:7: ( 'crc' )
            // InternalFILTER.g:24:9: 'crc'
            {
            match("crc"); 


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
            // InternalFILTER.g:25:7: ( 'import' )
            // InternalFILTER.g:25:9: 'import'
            {
            match("import"); 


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
            // InternalFILTER.g:26:7: ( ':=' )
            // InternalFILTER.g:26:9: ':='
            {
            match(":="); 


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
            // InternalFILTER.g:27:7: ( ';' )
            // InternalFILTER.g:27:9: ';'
            {
            match(';'); 

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
            // InternalFILTER.g:28:7: ( 'GSSFilterMaxtermFilter' )
            // InternalFILTER.g:28:9: 'GSSFilterMaxtermFilter'
            {
            match("GSSFilterMaxtermFilter"); 


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
            // InternalFILTER.g:29:7: ( '{' )
            // InternalFILTER.g:29:9: '{'
            {
            match('{'); 

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
            // InternalFILTER.g:30:7: ( 'uri' )
            // InternalFILTER.g:30:9: 'uri'
            {
            match("uri"); 


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
            // InternalFILTER.g:31:7: ( 'version' )
            // InternalFILTER.g:31:9: 'version'
            {
            match("version"); 


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
            // InternalFILTER.g:32:7: ( 'formatFile' )
            // InternalFILTER.g:32:9: 'formatFile'
            {
            match("formatFile"); 


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
            // InternalFILTER.g:33:7: ( '}' )
            // InternalFILTER.g:33:9: '}'
            {
            match('}'); 

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
            // InternalFILTER.g:34:7: ( 'GSSFilterMintermFilter' )
            // InternalFILTER.g:34:9: 'GSSFilterMintermFilter'
            {
            match("GSSFilterMintermFilter"); 


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
            // InternalFILTER.g:35:7: ( 'GSSFilterBoolVar' )
            // InternalFILTER.g:35:9: 'GSSFilterBoolVar'
            {
            match("GSSFilterBoolVar"); 


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
            // InternalFILTER.g:36:7: ( 'id' )
            // InternalFILTER.g:36:9: 'id'
            {
            match("id"); 


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
            // InternalFILTER.g:37:7: ( 'name' )
            // InternalFILTER.g:37:9: 'name'
            {
            match("name"); 


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
            // InternalFILTER.g:38:7: ( 'constantType' )
            // InternalFILTER.g:38:9: 'constantType'
            {
            match("constantType"); 


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
            // InternalFILTER.g:39:7: ( 'FieldRef' )
            // InternalFILTER.g:39:9: 'FieldRef'
            {
            match("FieldRef"); 


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
            // InternalFILTER.g:40:7: ( 'GSSFilterBoolVarFromArrayItem' )
            // InternalFILTER.g:40:9: 'GSSFilterBoolVarFromArrayItem'
            {
            match("GSSFilterBoolVarFromArrayItem"); 


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
            // InternalFILTER.g:41:7: ( 'AIFieldRef' )
            // InternalFILTER.g:41:9: 'AIFieldRef'
            {
            match("AIFieldRef"); 


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
            // InternalFILTER.g:42:7: ( 'GSSFilterBoolVarFromGroupedArrayItem' )
            // InternalFILTER.g:42:9: 'GSSFilterBoolVarFromGroupedArrayItem'
            {
            match("GSSFilterBoolVarFromGroupedArrayItem"); 


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
            // InternalFILTER.g:43:7: ( 'group' )
            // InternalFILTER.g:43:9: 'group'
            {
            match("group"); 


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
            // InternalFILTER.g:44:7: ( 'AIFieldRefs' )
            // InternalFILTER.g:44:9: 'AIFieldRefs'
            {
            match("AIFieldRefs"); 


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
            // InternalFILTER.g:45:7: ( 'GSSFilterBoolVarFDIC' )
            // InternalFILTER.g:45:9: 'GSSFilterBoolVarFDIC'
            {
            match("GSSFilterBoolVarFDIC"); 


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
            // InternalFILTER.g:46:7: ( 'GSSFilterFieldOp' )
            // InternalFILTER.g:46:9: 'GSSFilterFieldOp'
            {
            match("GSSFilterFieldOp"); 


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
            // InternalFILTER.g:47:7: ( 'type' )
            // InternalFILTER.g:47:9: 'type'
            {
            match("type"); 


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
            // InternalFILTER.g:48:7: ( 'GSSFilterConstant' )
            // InternalFILTER.g:48:9: 'GSSFilterConstant'
            {
            match("GSSFilterConstant"); 


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
            // InternalFILTER.g:49:7: ( 'value' )
            // InternalFILTER.g:49:9: 'value'
            {
            match("value"); 


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
            // InternalFILTER.g:50:7: ( 'mask' )
            // InternalFILTER.g:50:9: 'mask'
            {
            match("mask"); 


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
            // InternalFILTER.g:51:7: ( 'GSSFilterSelect' )
            // InternalFILTER.g:51:9: 'GSSFilterSelect'
            {
            match("GSSFilterSelect"); 


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
            // InternalFILTER.g:52:7: ( 'fromFile' )
            // InternalFILTER.g:52:9: 'fromFile'
            {
            match("fromFile"); 


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
            // InternalFILTER.g:53:7: ( 'offset' )
            // InternalFILTER.g:53:9: 'offset'
            {
            match("offset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFILTER.g:54:7: ( 'GSSFilterSelectLine' )
            // InternalFILTER.g:54:9: 'GSSFilterSelectLine'
            {
            match("GSSFilterSelectLine"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFILTER.g:55:7: ( 'line' )
            // InternalFILTER.g:55:9: 'line'
            {
            match("line"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFILTER.g:56:7: ( 'leftTrim' )
            // InternalFILTER.g:56:9: 'leftTrim'
            {
            match("leftTrim"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFILTER.g:57:7: ( 'rightTrim' )
            // InternalFILTER.g:57:9: 'rightTrim'
            {
            match("rightTrim"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFILTER.g:58:7: ( 'GSSFilterMaxterm' )
            // InternalFILTER.g:58:9: 'GSSFilterMaxterm'
            {
            match("GSSFilterMaxterm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFILTER.g:59:7: ( 'GSSFilterMinterm' )
            // InternalFILTER.g:59:9: 'GSSFilterMinterm'
            {
            match("GSSFilterMinterm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFILTER.g:60:7: ( 'GSSFilterBoolVarRef' )
            // InternalFILTER.g:60:9: 'GSSFilterBoolVarRef'
            {
            match("GSSFilterBoolVarRef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFILTER.g:61:7: ( 'idRef' )
            // InternalFILTER.g:61:9: 'idRef'
            {
            match("idRef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFILTER.g:62:7: ( '.' )
            // InternalFILTER.g:62:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFILTER.g:63:7: ( '(' )
            // InternalFILTER.g:63:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFILTER.g:64:7: ( ')' )
            // InternalFILTER.g:64:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFILTER.g:65:7: ( '::' )
            // InternalFILTER.g:65:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFILTER.g:66:7: ( '-' )
            // InternalFILTER.g:66:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "RULE_HEXADECIMAL"
    public final void mRULE_HEXADECIMAL() throws RecognitionException {
        try {
            int _type = RULE_HEXADECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFILTER.g:8783:18: ( '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // InternalFILTER.g:8783:20: '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match("0x"); 

            // InternalFILTER.g:8783:25: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
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
            	    // InternalFILTER.g:
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
            // InternalFILTER.g:8785:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalFILTER.g:8785:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalFILTER.g:8785:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalFILTER.g:8785:11: '^'
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

            // InternalFILTER.g:8785:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFILTER.g:
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
            // InternalFILTER.g:8787:10: ( ( '0' .. '9' )+ )
            // InternalFILTER.g:8787:12: ( '0' .. '9' )+
            {
            // InternalFILTER.g:8787:12: ( '0' .. '9' )+
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
            	    // InternalFILTER.g:8787:13: '0' .. '9'
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
            // InternalFILTER.g:8789:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalFILTER.g:8789:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalFILTER.g:8789:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalFILTER.g:8789:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalFILTER.g:8789:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalFILTER.g:8789:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalFILTER.g:8789:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalFILTER.g:8789:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalFILTER.g:8789:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalFILTER.g:8789:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalFILTER.g:8789:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalFILTER.g:8791:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalFILTER.g:8791:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalFILTER.g:8791:24: ( options {greedy=false; } : . )*
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
            	    // InternalFILTER.g:8791:52: .
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
            // InternalFILTER.g:8793:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalFILTER.g:8793:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalFILTER.g:8793:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFILTER.g:8793:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalFILTER.g:8793:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalFILTER.g:8793:41: ( '\\r' )? '\\n'
                    {
                    // InternalFILTER.g:8793:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalFILTER.g:8793:41: '\\r'
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
            // InternalFILTER.g:8795:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalFILTER.g:8795:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalFILTER.g:8795:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalFILTER.g:
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
            // InternalFILTER.g:8797:16: ( . )
            // InternalFILTER.g:8797:18: .
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
        // InternalFILTER.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | RULE_HEXADECIMAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=64;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalFILTER.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalFILTER.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalFILTER.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalFILTER.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalFILTER.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalFILTER.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalFILTER.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalFILTER.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalFILTER.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalFILTER.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalFILTER.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalFILTER.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalFILTER.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalFILTER.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalFILTER.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalFILTER.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalFILTER.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalFILTER.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalFILTER.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalFILTER.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalFILTER.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalFILTER.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalFILTER.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalFILTER.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalFILTER.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalFILTER.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalFILTER.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalFILTER.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalFILTER.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalFILTER.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalFILTER.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalFILTER.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalFILTER.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalFILTER.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalFILTER.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalFILTER.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalFILTER.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalFILTER.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalFILTER.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalFILTER.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalFILTER.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalFILTER.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalFILTER.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // InternalFILTER.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // InternalFILTER.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // InternalFILTER.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // InternalFILTER.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // InternalFILTER.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // InternalFILTER.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // InternalFILTER.g:1:304: T__61
                {
                mT__61(); 

                }
                break;
            case 51 :
                // InternalFILTER.g:1:310: T__62
                {
                mT__62(); 

                }
                break;
            case 52 :
                // InternalFILTER.g:1:316: T__63
                {
                mT__63(); 

                }
                break;
            case 53 :
                // InternalFILTER.g:1:322: T__64
                {
                mT__64(); 

                }
                break;
            case 54 :
                // InternalFILTER.g:1:328: T__65
                {
                mT__65(); 

                }
                break;
            case 55 :
                // InternalFILTER.g:1:334: T__66
                {
                mT__66(); 

                }
                break;
            case 56 :
                // InternalFILTER.g:1:340: T__67
                {
                mT__67(); 

                }
                break;
            case 57 :
                // InternalFILTER.g:1:346: RULE_HEXADECIMAL
                {
                mRULE_HEXADECIMAL(); 

                }
                break;
            case 58 :
                // InternalFILTER.g:1:363: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 59 :
                // InternalFILTER.g:1:371: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 60 :
                // InternalFILTER.g:1:380: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 61 :
                // InternalFILTER.g:1:392: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 62 :
                // InternalFILTER.g:1:408: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 63 :
                // InternalFILTER.g:1:424: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 64 :
                // InternalFILTER.g:1:432: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\7\51\1\45\1\uffff\1\51\1\uffff\3\51\1\uffff\11\51\4\uffff\1\117\1\45\2\uffff\3\45\2\uffff\3\51\1\uffff\12\51\1\143\3\uffff\1\51\1\uffff\5\51\1\uffff\12\51\12\uffff\3\51\1\167\3\51\1\173\7\51\1\uffff\1\51\1\u0084\20\51\1\u0095\1\uffff\2\51\1\u0098\1\uffff\3\51\1\u009c\4\51\1\uffff\4\51\1\u00a5\3\51\1\u00a9\1\u00aa\1\51\1\u00ac\4\51\1\uffff\2\51\1\uffff\3\51\1\uffff\1\u00b6\1\51\1\u00b8\2\51\1\u00bb\2\51\1\uffff\2\51\1\u00c0\2\uffff\1\51\1\uffff\4\51\1\u00c6\2\51\1\u00c9\1\51\1\uffff\1\u00cb\1\uffff\2\51\1\uffff\4\51\1\uffff\1\u00d2\2\51\1\u00d5\1\51\1\uffff\2\51\1\uffff\1\51\1\uffff\1\51\1\u00dc\4\51\1\uffff\2\51\1\uffff\6\51\1\uffff\1\51\1\u00eb\1\u00ec\1\51\1\u00ee\1\51\1\u00f0\7\51\2\uffff\1\51\1\uffff\1\u00fd\1\uffff\12\51\1\u0109\1\u010b\1\uffff\1\u010c\12\51\1\uffff\1\u0117\2\uffff\1\51\1\u0119\1\u011a\7\51\1\uffff\1\51\2\uffff\17\51\1\u0132\6\51\1\u013a\1\uffff\1\u013b\1\u013d\1\u013f\1\u0142\1\u0143\2\51\2\uffff\1\51\1\uffff\1\51\1\uffff\2\51\2\uffff\1\u014b\6\51\1\uffff\5\51\1\u0157\1\u0158\3\51\1\u015d\2\uffff\4\51\1\uffff\1\u0162\1\u0163\2\51\2\uffff\14\51\1\u0172\1\51\1\uffff\6\51\1\u017a\1\uffff";
    static final String DFA13_eofS =
        "\u017b\uffff";
    static final String DFA13_minS =
        "\1\0\1\141\1\145\1\151\1\150\1\151\1\161\1\144\1\72\1\uffff\1\123\1\uffff\1\162\1\141\1\157\1\uffff\1\141\1\151\1\111\1\162\1\171\1\141\1\146\1\145\1\151\4\uffff\1\170\1\101\2\uffff\2\0\1\52\2\uffff\1\143\1\146\1\164\1\uffff\1\170\1\147\1\141\1\143\1\156\1\162\1\141\1\172\1\165\1\160\1\60\3\uffff\1\123\1\uffff\1\151\1\162\1\154\1\162\1\157\1\uffff\1\155\1\145\1\106\1\157\1\160\1\163\1\146\1\156\1\146\1\147\12\uffff\1\151\1\146\1\141\1\60\1\141\1\147\1\162\1\60\1\163\1\151\1\154\1\145\1\141\1\157\1\145\1\uffff\1\106\1\60\1\163\1\165\2\155\1\145\1\154\1\151\1\165\1\145\1\153\1\163\1\145\1\164\1\150\1\155\1\145\1\60\1\uffff\1\162\1\145\1\60\1\uffff\1\164\1\156\1\154\1\60\1\154\1\162\1\146\1\151\1\uffff\1\151\1\145\1\141\1\106\1\60\1\144\1\145\1\160\2\60\1\145\1\60\1\124\1\164\1\141\1\162\1\uffff\1\171\1\162\1\uffff\1\141\1\147\1\145\1\uffff\1\60\1\164\1\60\1\154\1\157\1\60\1\164\1\151\1\uffff\1\122\1\154\1\60\2\uffff\1\164\1\uffff\1\162\1\124\1\154\1\145\1\60\1\137\1\156\1\60\1\162\1\uffff\1\60\1\uffff\1\164\1\156\1\uffff\1\106\1\154\1\145\1\144\1\uffff\1\60\1\151\1\162\1\60\1\156\1\uffff\1\157\1\164\1\uffff\1\137\1\uffff\1\145\1\60\1\151\1\145\1\146\1\122\1\uffff\1\155\1\151\1\uffff\1\164\1\150\1\162\1\124\1\157\1\162\1\uffff\1\154\2\60\1\145\1\60\1\155\1\60\1\141\1\137\1\171\1\150\1\162\1\102\1\145\2\uffff\1\146\1\uffff\1\60\1\uffff\1\156\1\145\1\160\1\141\1\137\1\141\1\157\1\151\1\157\1\145\2\60\1\uffff\1\60\1\161\1\145\1\156\1\145\1\170\1\156\1\157\1\145\1\156\1\154\1\uffff\1\60\2\uffff\1\165\2\60\1\161\2\164\2\154\1\163\1\145\1\uffff\1\141\2\uffff\1\165\2\145\1\126\1\144\1\164\1\143\1\154\1\141\2\162\1\141\1\117\1\141\1\164\1\60\1\154\2\155\1\162\1\160\1\156\1\60\1\uffff\5\60\1\164\1\151\2\uffff\1\151\1\uffff\1\151\1\uffff\1\104\1\145\2\uffff\1\60\1\156\2\154\1\157\1\111\1\146\1\uffff\1\145\2\164\1\155\1\103\2\60\2\145\1\101\1\60\2\uffff\4\162\1\uffff\2\60\1\162\1\157\2\uffff\1\141\1\165\1\171\1\160\1\111\1\145\1\164\1\144\1\145\1\101\1\155\1\162\1\60\1\162\1\uffff\1\141\1\171\1\111\1\164\1\145\1\155\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\151\1\145\1\151\1\162\1\164\1\161\1\155\1\75\1\uffff\1\123\1\uffff\1\162\1\145\1\162\1\uffff\1\141\1\151\1\111\1\162\1\171\1\141\1\146\2\151\4\uffff\1\170\1\172\2\uffff\2\uffff\1\57\2\uffff\1\143\1\146\1\164\1\uffff\1\170\1\156\1\141\1\143\1\156\1\162\1\141\1\172\1\165\1\160\1\172\3\uffff\1\123\1\uffff\1\151\1\162\1\154\1\162\1\157\1\uffff\1\155\1\145\1\106\1\157\1\160\1\163\1\146\1\156\1\146\1\147\12\uffff\1\151\1\146\1\141\1\172\1\141\1\147\1\162\1\172\1\163\1\151\1\154\1\145\1\141\1\157\1\145\1\uffff\1\106\1\172\1\163\1\165\2\155\1\145\1\154\1\151\1\165\1\145\1\153\1\163\1\145\1\164\1\150\1\155\1\145\1\172\1\uffff\1\162\1\145\1\172\1\uffff\1\164\1\156\1\154\1\172\1\154\1\162\1\146\1\151\1\uffff\1\151\1\145\1\141\1\106\1\172\1\144\1\145\1\160\2\172\1\145\1\172\1\124\1\164\1\141\1\162\1\uffff\1\171\1\162\1\uffff\1\141\1\147\1\145\1\uffff\1\172\1\164\1\172\1\154\1\157\1\172\1\164\1\151\1\uffff\1\122\1\154\1\172\2\uffff\1\164\1\uffff\1\162\1\124\1\154\1\145\1\172\1\137\1\156\1\172\1\162\1\uffff\1\172\1\uffff\1\164\1\156\1\uffff\1\106\1\154\1\145\1\144\1\uffff\1\172\1\151\1\162\1\172\1\156\1\uffff\2\164\1\uffff\1\137\1\uffff\1\145\1\172\1\151\1\145\1\146\1\122\1\uffff\1\155\1\151\1\uffff\1\164\1\150\1\162\1\124\1\164\1\162\1\uffff\1\154\2\172\1\145\1\172\1\155\1\172\1\141\1\137\1\171\1\150\1\162\1\123\1\145\2\uffff\1\146\1\uffff\1\172\1\uffff\1\156\1\145\1\160\1\141\1\137\1\151\1\157\1\151\1\157\1\145\2\172\1\uffff\1\172\1\161\1\145\1\156\1\145\1\170\1\156\1\157\1\145\1\156\1\154\1\uffff\1\172\2\uffff\1\165\2\172\1\161\2\164\2\154\1\163\1\145\1\uffff\1\141\2\uffff\1\165\2\145\1\126\1\144\1\164\1\143\1\154\1\141\2\162\1\141\1\117\1\141\1\164\1\172\1\154\2\155\1\162\1\160\1\156\1\172\1\uffff\5\172\1\164\1\151\2\uffff\1\151\1\uffff\1\151\1\uffff\1\162\1\145\2\uffff\1\172\1\156\2\154\1\157\1\111\1\146\1\uffff\1\145\2\164\1\155\1\103\2\172\2\145\1\107\1\172\2\uffff\4\162\1\uffff\2\172\1\162\1\157\2\uffff\1\141\1\165\1\171\1\160\1\111\1\145\1\164\1\144\1\145\1\101\1\155\1\162\1\172\1\162\1\uffff\1\141\1\171\1\111\1\164\1\145\1\155\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\11\uffff\1\21\1\uffff\1\23\3\uffff\1\27\11\uffff\1\64\1\65\1\66\1\70\2\uffff\1\72\1\73\3\uffff\1\77\1\100\3\uffff\1\72\13\uffff\1\20\1\67\1\21\1\uffff\1\23\5\uffff\1\27\12\uffff\1\64\1\65\1\66\1\70\1\71\1\73\1\74\1\75\1\76\1\77\17\uffff\1\32\23\uffff\1\2\3\uffff\1\16\10\uffff\1\24\20\uffff\1\14\2\uffff\1\4\3\uffff\1\15\10\uffff\1\33\3\uffff\1\45\1\50\1\uffff\1\55\11\uffff\1\6\1\uffff\1\63\2\uffff\1\47\4\uffff\1\41\5\uffff\1\3\2\uffff\1\5\1\uffff\1\17\6\uffff\1\53\2\uffff\1\1\6\uffff\1\25\16\uffff\1\52\1\35\1\uffff\1\56\1\uffff\1\7\14\uffff\1\57\13\uffff\1\26\1\uffff\1\37\1\10\12\uffff\1\42\1\uffff\1\34\1\11\27\uffff\1\12\7\uffff\1\51\1\13\1\uffff\1\60\1\uffff\1\61\2\uffff\1\31\1\44\7\uffff\1\46\13\uffff\1\62\1\54\4\uffff\1\43\4\uffff\1\22\1\30\16\uffff\1\36\7\uffff\1\40";
    static final String DFA13_specialS =
        "\1\1\40\uffff\1\0\1\2\u0158\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\45\2\44\2\45\1\44\22\45\1\44\1\45\1\41\4\45\1\42\1\32\1\33\3\45\1\34\1\31\1\43\1\35\11\40\1\10\1\11\5\45\1\22\4\37\1\21\1\12\23\37\3\45\1\36\1\37\1\45\1\37\1\3\1\4\1\1\1\6\1\16\1\23\1\2\1\7\2\37\1\27\1\25\1\20\1\26\2\37\1\30\1\5\1\24\1\14\1\15\4\37\1\13\1\45\1\17\uff82\45",
            "\1\50\3\uffff\1\46\3\uffff\1\47",
            "\1\52",
            "\1\53",
            "\1\54\6\uffff\1\56\2\uffff\1\55",
            "\1\61\3\uffff\1\60\6\uffff\1\57",
            "\1\62",
            "\1\64\10\uffff\1\63",
            "\1\66\2\uffff\1\65",
            "",
            "\1\70",
            "",
            "\1\72",
            "\1\74\3\uffff\1\73",
            "\1\75\2\uffff\1\76",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\110\3\uffff\1\107",
            "\1\111",
            "",
            "",
            "",
            "",
            "\1\116",
            "\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\0\120",
            "\0\120",
            "\1\121\4\uffff\1\122",
            "",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "\1\127",
            "\1\131\6\uffff\1\130",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\12\51\7\uffff\21\51\1\142\10\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "\1\144",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
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
            "\1\164",
            "\1\165",
            "\1\166",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\170",
            "\1\171",
            "\1\172",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "",
            "\1\u0083",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u0096",
            "\1\u0097",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00ab",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00b7",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00b9",
            "\1\u00ba",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00bc",
            "\1\u00bd",
            "",
            "\1\u00be",
            "\1\u00bf",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\1\u00c1",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00c7",
            "\1\u00c8",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00ca",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00d3",
            "\1\u00d4",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00d6",
            "",
            "\1\u00d8\4\uffff\1\u00d7",
            "\1\u00d9",
            "",
            "\1\u00da",
            "",
            "\1\u00db",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e8\4\uffff\1\u00e7",
            "\1\u00e9",
            "",
            "\1\u00ea",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00ed",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00ef",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f7\1\u00f9\2\uffff\1\u00f8\6\uffff\1\u00f6\5\uffff\1\u00fa",
            "\1\u00fb",
            "",
            "",
            "\1\u00fc",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103\7\uffff\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\22\51\1\u010a\7\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\1\u0118",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "",
            "\1\u0122",
            "",
            "",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\12\51\7\uffff\13\51\1\u0139\16\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\5\51\1\u013c\24\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\5\51\1\u013e\24\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\5\51\1\u0140\13\51\1\u0141\10\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0144",
            "\1\u0145",
            "",
            "",
            "\1\u0146",
            "",
            "\1\u0147",
            "",
            "\1\u0149\55\uffff\1\u0148",
            "\1\u014a",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b\5\uffff\1\u015c",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0164",
            "\1\u0165",
            "",
            "",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0173",
            "",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | RULE_HEXADECIMAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_33 = input.LA(1);

                        s = -1;
                        if ( ((LA13_33>='\u0000' && LA13_33<='\uFFFF')) ) {s = 80;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='d') ) {s = 1;}

                        else if ( (LA13_0=='h') ) {s = 2;}

                        else if ( (LA13_0=='b') ) {s = 3;}

                        else if ( (LA13_0=='c') ) {s = 4;}

                        else if ( (LA13_0=='s') ) {s = 5;}

                        else if ( (LA13_0=='e') ) {s = 6;}

                        else if ( (LA13_0=='i') ) {s = 7;}

                        else if ( (LA13_0==':') ) {s = 8;}

                        else if ( (LA13_0==';') ) {s = 9;}

                        else if ( (LA13_0=='G') ) {s = 10;}

                        else if ( (LA13_0=='{') ) {s = 11;}

                        else if ( (LA13_0=='u') ) {s = 12;}

                        else if ( (LA13_0=='v') ) {s = 13;}

                        else if ( (LA13_0=='f') ) {s = 14;}

                        else if ( (LA13_0=='}') ) {s = 15;}

                        else if ( (LA13_0=='n') ) {s = 16;}

                        else if ( (LA13_0=='F') ) {s = 17;}

                        else if ( (LA13_0=='A') ) {s = 18;}

                        else if ( (LA13_0=='g') ) {s = 19;}

                        else if ( (LA13_0=='t') ) {s = 20;}

                        else if ( (LA13_0=='m') ) {s = 21;}

                        else if ( (LA13_0=='o') ) {s = 22;}

                        else if ( (LA13_0=='l') ) {s = 23;}

                        else if ( (LA13_0=='r') ) {s = 24;}

                        else if ( (LA13_0=='.') ) {s = 25;}

                        else if ( (LA13_0=='(') ) {s = 26;}

                        else if ( (LA13_0==')') ) {s = 27;}

                        else if ( (LA13_0=='-') ) {s = 28;}

                        else if ( (LA13_0=='0') ) {s = 29;}

                        else if ( (LA13_0=='^') ) {s = 30;}

                        else if ( ((LA13_0>='B' && LA13_0<='E')||(LA13_0>='H' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='a'||(LA13_0>='j' && LA13_0<='k')||(LA13_0>='p' && LA13_0<='q')||(LA13_0>='w' && LA13_0<='z')) ) {s = 31;}

                        else if ( ((LA13_0>='1' && LA13_0<='9')) ) {s = 32;}

                        else if ( (LA13_0=='\"') ) {s = 33;}

                        else if ( (LA13_0=='\'') ) {s = 34;}

                        else if ( (LA13_0=='/') ) {s = 35;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 36;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='*' && LA13_0<=',')||(LA13_0>='<' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 37;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_34 = input.LA(1);

                        s = -1;
                        if ( ((LA13_34>='\u0000' && LA13_34<='\uFFFF')) ) {s = 80;}

                        else s = 37;

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