package es.uah.aut.srg.gss.lang.format.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFORMATLexer extends Lexer {
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
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
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

    public InternalFORMATLexer() {;} 
    public InternalFORMATLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFORMATLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalFORMAT.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFORMAT.g:11:7: ( 'TM' )
            // InternalFORMAT.g:11:9: 'TM'
            {
            match("TM"); 


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
            // InternalFORMAT.g:12:7: ( 'TC' )
            // InternalFORMAT.g:12:9: 'TC'
            {
            match("TC"); 


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
            // InternalFORMAT.g:13:7: ( 'structured' )
            // InternalFORMAT.g:13:9: 'structured'
            {
            match("structured"); 


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
            // InternalFORMAT.g:14:7: ( 'uint' )
            // InternalFORMAT.g:14:9: 'uint'
            {
            match("uint"); 


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
            // InternalFORMAT.g:15:7: ( 'flag' )
            // InternalFORMAT.g:15:9: 'flag'
            {
            match("flag"); 


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
            // InternalFORMAT.g:16:7: ( 'enumerated' )
            // InternalFORMAT.g:16:9: 'enumerated'
            {
            match("enumerated"); 


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
            // InternalFORMAT.g:17:7: ( 'bit_vector' )
            // InternalFORMAT.g:17:9: 'bit_vector'
            {
            match("bit_vector"); 


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
            // InternalFORMAT.g:18:7: ( 'byte_vector' )
            // InternalFORMAT.g:18:9: 'byte_vector'
            {
            match("byte_vector"); 


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
            // InternalFORMAT.g:19:7: ( 'float' )
            // InternalFORMAT.g:19:9: 'float'
            {
            match("float"); 


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
            // InternalFORMAT.g:20:7: ( 'deduced' )
            // InternalFORMAT.g:20:9: 'deduced'
            {
            match("deduced"); 


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
            // InternalFORMAT.g:21:7: ( 'big_endian' )
            // InternalFORMAT.g:21:9: 'big_endian'
            {
            match("big_endian"); 


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
            // InternalFORMAT.g:22:7: ( 'little_endian' )
            // InternalFORMAT.g:22:9: 'little_endian'
            {
            match("little_endian"); 


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
            // InternalFORMAT.g:23:7: ( 'na' )
            // InternalFORMAT.g:23:9: 'na'
            {
            match("na"); 


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
            // InternalFORMAT.g:24:7: ( 'MSB' )
            // InternalFORMAT.g:24:9: 'MSB'
            {
            match("MSB"); 


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
            // InternalFORMAT.g:25:7: ( 'LSB' )
            // InternalFORMAT.g:25:9: 'LSB'
            {
            match("LSB"); 


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
            // InternalFORMAT.g:26:7: ( 'bytes' )
            // InternalFORMAT.g:26:9: 'bytes'
            {
            match("bytes"); 


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
            // InternalFORMAT.g:27:7: ( 'bits' )
            // InternalFORMAT.g:27:9: 'bits'
            {
            match("bits"); 


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
            // InternalFORMAT.g:28:7: ( 'halfword' )
            // InternalFORMAT.g:28:9: 'halfword'
            {
            match("halfword"); 


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
            // InternalFORMAT.g:29:7: ( 'string10' )
            // InternalFORMAT.g:29:9: 'string10'
            {
            match("string10"); 


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
            // InternalFORMAT.g:30:7: ( 'string17' )
            // InternalFORMAT.g:30:9: 'string17'
            {
            match("string17"); 


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
            // InternalFORMAT.g:31:7: ( 'string69' )
            // InternalFORMAT.g:31:9: 'string69'
            {
            match("string69"); 


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
            // InternalFORMAT.g:32:7: ( '2bits' )
            // InternalFORMAT.g:32:9: '2bits'
            {
            match("2bits"); 


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
            // InternalFORMAT.g:33:7: ( '2bits_with_0' )
            // InternalFORMAT.g:33:9: '2bits_with_0'
            {
            match("2bits_with_0"); 


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
            // InternalFORMAT.g:34:7: ( 'crc16' )
            // InternalFORMAT.g:34:9: 'crc16'
            {
            match("crc16"); 


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
            // InternalFORMAT.g:35:7: ( 'checksum16' )
            // InternalFORMAT.g:35:9: 'checksum16'
            {
            match("checksum16"); 


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
            // InternalFORMAT.g:36:7: ( 'import' )
            // InternalFORMAT.g:36:9: 'import'
            {
            match("import"); 


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
            // InternalFORMAT.g:37:7: ( ':=' )
            // InternalFORMAT.g:37:9: ':='
            {
            match(":="); 


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
            // InternalFORMAT.g:38:7: ( ';' )
            // InternalFORMAT.g:38:9: ';'
            {
            match(';'); 

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
            // InternalFORMAT.g:39:7: ( 'GSSFormatFormat' )
            // InternalFORMAT.g:39:9: 'GSSFormatFormat'
            {
            match("GSSFormatFormat"); 


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
            // InternalFORMAT.g:40:7: ( '{' )
            // InternalFORMAT.g:40:9: '{'
            {
            match('{'); 

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
            // InternalFORMAT.g:41:7: ( 'uri' )
            // InternalFORMAT.g:41:9: 'uri'
            {
            match("uri"); 


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
            // InternalFORMAT.g:42:7: ( 'version' )
            // InternalFORMAT.g:42:9: 'version'
            {
            match("version"); 


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
            // InternalFORMAT.g:43:7: ( 'protocol' )
            // InternalFORMAT.g:43:9: 'protocol'
            {
            match("protocol"); 


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
            // InternalFORMAT.g:44:7: ( 'type' )
            // InternalFORMAT.g:44:9: 'type'
            {
            match("type"); 


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
            // InternalFORMAT.g:45:7: ( '}' )
            // InternalFORMAT.g:45:9: '}'
            {
            match('}'); 

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
            // InternalFORMAT.g:46:7: ( 'GSSFormatCSField' )
            // InternalFORMAT.g:46:9: 'GSSFormatCSField'
            {
            match("GSSFormatCSField"); 


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
            // InternalFORMAT.g:47:7: ( 'fid' )
            // InternalFORMAT.g:47:9: 'fid'
            {
            match("fid"); 


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
            // InternalFORMAT.g:48:7: ( 'pfid' )
            // InternalFORMAT.g:48:9: 'pfid'
            {
            match("pfid"); 


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
            // InternalFORMAT.g:49:7: ( 'name' )
            // InternalFORMAT.g:49:9: 'name'
            {
            match("name"); 


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
            // InternalFORMAT.g:50:7: ( 'byteOrder' )
            // InternalFORMAT.g:50:9: 'byteOrder'
            {
            match("byteOrder"); 


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
            // InternalFORMAT.g:51:7: ( 'firstBit' )
            // InternalFORMAT.g:51:9: 'firstBit'
            {
            match("firstBit"); 


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
            // InternalFORMAT.g:52:7: ( 'description' )
            // InternalFORMAT.g:52:9: 'description'
            {
            match("description"); 


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
            // InternalFORMAT.g:53:7: ( 'GSSFormatCSFormulaField' )
            // InternalFORMAT.g:53:9: 'GSSFormatCSFormulaField'
            {
            match("GSSFormatCSFormulaField"); 


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
            // InternalFORMAT.g:54:7: ( 'GSSFormatVSField' )
            // InternalFORMAT.g:54:9: 'GSSFormatVSField'
            {
            match("GSSFormatVSField"); 


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
            // InternalFORMAT.g:55:7: ( 'GSSFormatVRFieldSize' )
            // InternalFORMAT.g:55:9: 'GSSFormatVRFieldSize'
            {
            match("GSSFormatVRFieldSize"); 


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
            // InternalFORMAT.g:56:7: ( 'GSSFormatFDICField' )
            // InternalFORMAT.g:56:9: 'GSSFormatFDICField'
            {
            match("GSSFormatFDICField"); 


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
            // InternalFORMAT.g:57:7: ( 'checkType' )
            // InternalFORMAT.g:57:9: 'checkType'
            {
            match("checkType"); 


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
            // InternalFORMAT.g:58:7: ( 'GSSFormatAField' )
            // InternalFORMAT.g:58:9: 'GSSFormatAField'
            {
            match("GSSFormatAField"); 


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
            // InternalFORMAT.g:59:7: ( 'GSSFormatAIField' )
            // InternalFORMAT.g:59:9: 'GSSFormatAIField'
            {
            match("GSSFormatAIField"); 


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
            // InternalFORMAT.g:60:7: ( 'GSSFormatSize' )
            // InternalFORMAT.g:60:9: 'GSSFormatSize'
            {
            match("GSSFormatSize"); 


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
            // InternalFORMAT.g:61:7: ( 'GSSFormatGlobalOffset' )
            // InternalFORMAT.g:61:9: 'GSSFormatGlobalOffset'
            {
            match("GSSFormatGlobalOffset"); 


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
            // InternalFORMAT.g:62:7: ( 'GSSFormatFormula' )
            // InternalFORMAT.g:62:9: 'GSSFormatFormula'
            {
            match("GSSFormatFormula"); 


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
            // InternalFORMAT.g:63:7: ( 'slope' )
            // InternalFORMAT.g:63:9: 'slope'
            {
            match("slope"); 


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
            // InternalFORMAT.g:64:7: ( 'intercept' )
            // InternalFORMAT.g:64:9: 'intercept'
            {
            match("intercept"); 


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
            // InternalFORMAT.g:65:7: ( 'GSSFormatConstSize' )
            // InternalFORMAT.g:65:9: 'GSSFormatConstSize'
            {
            match("GSSFormatConstSize"); 


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
            // InternalFORMAT.g:66:7: ( 'GSSFormatMaxSize' )
            // InternalFORMAT.g:66:9: 'GSSFormatMaxSize'
            {
            match("GSSFormatMaxSize"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFORMAT.g:67:7: ( 'GSSFormatVariableSize' )
            // InternalFORMAT.g:67:9: 'GSSFormatVariableSize'
            {
            match("GSSFormatVariableSize"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFORMAT.g:68:7: ( 'fidRef' )
            // InternalFORMAT.g:68:9: 'fidRef'
            {
            match("fidRef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFORMAT.g:69:7: ( 'unit' )
            // InternalFORMAT.g:69:9: 'unit'
            {
            match("unit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFORMAT.g:70:7: ( 'power' )
            // InternalFORMAT.g:70:9: 'power'
            {
            match("power"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFORMAT.g:71:7: ( 'GSSFormatFloatingOffset' )
            // InternalFORMAT.g:71:9: 'GSSFormatFloatingOffset'
            {
            match("GSSFormatFloatingOffset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFORMAT.g:72:7: ( 'GSSFormatSortedFieldsToCheck' )
            // InternalFORMAT.g:72:9: 'GSSFormatSortedFieldsToCheck'
            {
            match("GSSFormatSortedFieldsToCheck"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFORMAT.g:73:7: ( 'GSSFormatFieldToCheck' )
            // InternalFORMAT.g:73:9: 'GSSFormatFieldToCheck'
            {
            match("GSSFormatFieldToCheck"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFORMAT.g:74:7: ( 'GSSFormatArrayDimension' )
            // InternalFORMAT.g:74:9: 'GSSFormatArrayDimension'
            {
            match("GSSFormatArrayDimension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFORMAT.g:75:7: ( 'maxItems' )
            // InternalFORMAT.g:75:9: 'maxItems'
            {
            match("maxItems"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFORMAT.g:76:7: ( 'GSSFormatLocalOffset' )
            // InternalFORMAT.g:76:9: 'GSSFormatLocalOffset'
            {
            match("GSSFormatLocalOffset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFORMAT.g:77:7: ( 'GSSFormatArrayRef' )
            // InternalFORMAT.g:77:9: 'GSSFormatArrayRef'
            {
            match("GSSFormatArrayRef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFORMAT.g:78:7: ( '.' )
            // InternalFORMAT.g:78:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFORMAT.g:79:7: ( '-' )
            // InternalFORMAT.g:79:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "RULE_HEXADECIMAL"
    public final void mRULE_HEXADECIMAL() throws RecognitionException {
        try {
            int _type = RULE_HEXADECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFORMAT.g:13486:18: ( '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // InternalFORMAT.g:13486:20: '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match("0x"); 

            // InternalFORMAT.g:13486:25: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
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
            	    // InternalFORMAT.g:
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
            // InternalFORMAT.g:13488:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalFORMAT.g:13488:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalFORMAT.g:13488:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalFORMAT.g:13488:11: '^'
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

            // InternalFORMAT.g:13488:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFORMAT.g:
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
            // InternalFORMAT.g:13490:10: ( ( '0' .. '9' )+ )
            // InternalFORMAT.g:13490:12: ( '0' .. '9' )+
            {
            // InternalFORMAT.g:13490:12: ( '0' .. '9' )+
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
            	    // InternalFORMAT.g:13490:13: '0' .. '9'
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
            // InternalFORMAT.g:13492:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalFORMAT.g:13492:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalFORMAT.g:13492:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalFORMAT.g:13492:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalFORMAT.g:13492:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalFORMAT.g:13492:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalFORMAT.g:13492:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalFORMAT.g:13492:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalFORMAT.g:13492:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalFORMAT.g:13492:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalFORMAT.g:13492:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalFORMAT.g:13494:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalFORMAT.g:13494:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalFORMAT.g:13494:24: ( options {greedy=false; } : . )*
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
            	    // InternalFORMAT.g:13494:52: .
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
            // InternalFORMAT.g:13496:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalFORMAT.g:13496:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalFORMAT.g:13496:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFORMAT.g:13496:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalFORMAT.g:13496:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalFORMAT.g:13496:41: ( '\\r' )? '\\n'
                    {
                    // InternalFORMAT.g:13496:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalFORMAT.g:13496:41: '\\r'
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
            // InternalFORMAT.g:13498:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalFORMAT.g:13498:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalFORMAT.g:13498:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalFORMAT.g:
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
            // InternalFORMAT.g:13500:16: ( . )
            // InternalFORMAT.g:13500:18: .
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
        // InternalFORMAT.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | RULE_HEXADECIMAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=77;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalFORMAT.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalFORMAT.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalFORMAT.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalFORMAT.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalFORMAT.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalFORMAT.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalFORMAT.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalFORMAT.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalFORMAT.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalFORMAT.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalFORMAT.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalFORMAT.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalFORMAT.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalFORMAT.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalFORMAT.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalFORMAT.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalFORMAT.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalFORMAT.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalFORMAT.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalFORMAT.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalFORMAT.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalFORMAT.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalFORMAT.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalFORMAT.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalFORMAT.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalFORMAT.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalFORMAT.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalFORMAT.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalFORMAT.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalFORMAT.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalFORMAT.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalFORMAT.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalFORMAT.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalFORMAT.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalFORMAT.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalFORMAT.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalFORMAT.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalFORMAT.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalFORMAT.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalFORMAT.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalFORMAT.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalFORMAT.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalFORMAT.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // InternalFORMAT.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // InternalFORMAT.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // InternalFORMAT.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // InternalFORMAT.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // InternalFORMAT.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // InternalFORMAT.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // InternalFORMAT.g:1:304: T__61
                {
                mT__61(); 

                }
                break;
            case 51 :
                // InternalFORMAT.g:1:310: T__62
                {
                mT__62(); 

                }
                break;
            case 52 :
                // InternalFORMAT.g:1:316: T__63
                {
                mT__63(); 

                }
                break;
            case 53 :
                // InternalFORMAT.g:1:322: T__64
                {
                mT__64(); 

                }
                break;
            case 54 :
                // InternalFORMAT.g:1:328: T__65
                {
                mT__65(); 

                }
                break;
            case 55 :
                // InternalFORMAT.g:1:334: T__66
                {
                mT__66(); 

                }
                break;
            case 56 :
                // InternalFORMAT.g:1:340: T__67
                {
                mT__67(); 

                }
                break;
            case 57 :
                // InternalFORMAT.g:1:346: T__68
                {
                mT__68(); 

                }
                break;
            case 58 :
                // InternalFORMAT.g:1:352: T__69
                {
                mT__69(); 

                }
                break;
            case 59 :
                // InternalFORMAT.g:1:358: T__70
                {
                mT__70(); 

                }
                break;
            case 60 :
                // InternalFORMAT.g:1:364: T__71
                {
                mT__71(); 

                }
                break;
            case 61 :
                // InternalFORMAT.g:1:370: T__72
                {
                mT__72(); 

                }
                break;
            case 62 :
                // InternalFORMAT.g:1:376: T__73
                {
                mT__73(); 

                }
                break;
            case 63 :
                // InternalFORMAT.g:1:382: T__74
                {
                mT__74(); 

                }
                break;
            case 64 :
                // InternalFORMAT.g:1:388: T__75
                {
                mT__75(); 

                }
                break;
            case 65 :
                // InternalFORMAT.g:1:394: T__76
                {
                mT__76(); 

                }
                break;
            case 66 :
                // InternalFORMAT.g:1:400: T__77
                {
                mT__77(); 

                }
                break;
            case 67 :
                // InternalFORMAT.g:1:406: T__78
                {
                mT__78(); 

                }
                break;
            case 68 :
                // InternalFORMAT.g:1:412: T__79
                {
                mT__79(); 

                }
                break;
            case 69 :
                // InternalFORMAT.g:1:418: T__80
                {
                mT__80(); 

                }
                break;
            case 70 :
                // InternalFORMAT.g:1:424: RULE_HEXADECIMAL
                {
                mRULE_HEXADECIMAL(); 

                }
                break;
            case 71 :
                // InternalFORMAT.g:1:441: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 72 :
                // InternalFORMAT.g:1:449: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 73 :
                // InternalFORMAT.g:1:458: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 74 :
                // InternalFORMAT.g:1:470: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 75 :
                // InternalFORMAT.g:1:486: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 76 :
                // InternalFORMAT.g:1:502: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 77 :
                // InternalFORMAT.g:1:510: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\14\46\1\70\2\46\1\43\1\uffff\1\46\1\uffff\3\46\1\uffff\1\46\2\uffff\1\70\1\43\2\uffff\3\43\2\uffff\1\117\1\120\1\uffff\14\46\1\142\3\46\2\uffff\4\46\2\uffff\1\46\1\uffff\5\46\1\uffff\1\46\11\uffff\3\46\1\166\3\46\1\173\11\46\1\uffff\1\u0086\1\u0087\1\46\1\uffff\16\46\1\u0098\1\uffff\1\u0099\1\u009a\2\46\1\uffff\3\46\1\u00a0\5\46\1\u00a8\2\uffff\1\46\1\uffff\7\46\1\u00b2\1\46\1\u00b4\3\46\1\u00b8\3\uffff\1\u00b9\4\46\1\uffff\2\46\1\u00c0\4\46\1\uffff\1\46\1\u00c7\1\u00c8\6\46\1\uffff\1\u00d0\1\uffff\3\46\2\uffff\1\u00d5\5\46\1\uffff\5\46\3\uffff\2\46\1\u00e2\4\46\1\uffff\4\46\1\uffff\6\46\1\u00f2\5\46\1\uffff\2\46\1\u00fa\3\46\1\u00fe\1\u00ff\1\u0100\1\u0101\5\46\1\uffff\2\46\1\u0109\4\46\1\uffff\1\u010e\1\u010f\1\46\4\uffff\4\46\1\u0115\2\46\1\uffff\1\46\1\u0119\1\u011a\1\46\2\uffff\1\u0123\1\u0124\1\u0125\1\u0126\1\46\1\uffff\2\46\1\u012a\2\uffff\10\46\4\uffff\1\u013c\1\u013d\1\46\1\uffff\21\46\2\uffff\22\46\1\u0163\15\46\1\u0172\4\46\1\uffff\16\46\1\uffff\4\46\1\u018a\12\46\1\u0195\7\46\1\uffff\1\u019d\3\46\1\u01a1\2\46\1\u01a4\2\46\1\uffff\1\u01a7\4\46\1\u01ac\1\46\1\uffff\3\46\1\uffff\2\46\1\uffff\2\46\1\uffff\1\46\1\u01b6\2\46\1\uffff\1\46\1\u01ba\3\46\1\u01be\3\46\1\uffff\3\46\1\uffff\3\46\1\uffff\11\46\1\u01d1\4\46\1\u01d6\1\46\1\u01d8\1\46\1\uffff\1\u01da\2\46\1\u01dd\1\uffff\1\46\1\uffff\1\46\1\uffff\2\46\1\uffff\1\u01e2\1\u01e3\1\u01e4\1\46\3\uffff\4\46\1\u01ea\1\uffff";
    static final String DFA13_eofS =
        "\u01eb\uffff";
    static final String DFA13_minS =
        "\1\0\1\103\1\154\2\151\1\156\1\151\1\145\1\151\1\141\2\123\1\141\1\142\1\150\1\155\1\75\1\uffff\1\123\1\uffff\1\145\1\146\1\171\1\uffff\1\141\2\uffff\1\170\1\101\2\uffff\2\0\1\52\2\uffff\2\60\1\uffff\1\162\1\157\1\156\2\151\1\141\1\144\1\165\1\147\1\164\1\144\1\164\1\60\2\102\1\154\1\151\1\uffff\1\143\1\145\1\160\1\164\2\uffff\1\123\1\uffff\1\162\1\157\1\151\1\167\1\160\1\uffff\1\170\11\uffff\1\151\1\160\1\164\1\60\1\164\1\147\1\141\1\60\1\163\1\155\2\137\1\145\1\165\1\143\1\164\1\145\1\uffff\2\60\1\146\1\164\1\61\1\143\1\157\1\145\1\106\1\163\1\164\1\144\2\145\1\111\1\143\1\156\1\145\1\60\1\uffff\2\60\1\164\1\145\1\uffff\1\164\1\145\1\166\1\60\1\145\1\117\1\143\1\162\1\154\1\60\2\uffff\1\167\1\163\1\66\1\153\2\162\1\157\1\151\1\157\1\60\1\162\1\60\2\164\1\147\1\60\3\uffff\1\60\1\146\1\102\1\162\1\145\1\uffff\1\156\1\166\1\60\1\162\1\145\1\151\1\145\1\uffff\1\157\1\137\1\60\1\124\1\164\1\143\1\162\1\157\1\143\1\uffff\1\60\1\uffff\1\145\1\165\1\61\2\uffff\1\60\1\151\1\141\1\143\1\144\1\145\1\uffff\2\144\1\160\1\137\1\162\3\uffff\1\165\1\171\1\60\1\145\1\155\1\156\1\157\1\uffff\1\155\1\162\1\60\1\71\1\uffff\3\164\1\151\1\143\1\145\1\60\1\164\1\145\1\144\1\155\1\160\1\uffff\1\160\1\141\1\60\1\154\1\163\1\145\4\60\1\145\1\157\1\141\1\164\1\162\1\uffff\1\151\1\156\1\60\1\61\1\145\2\164\1\uffff\2\60\1\144\4\uffff\1\144\1\162\1\156\1\157\1\60\1\157\1\144\1\uffff\1\66\2\60\1\101\2\uffff\4\60\1\162\1\uffff\1\156\1\151\1\60\2\uffff\1\104\1\123\1\122\1\106\1\151\1\154\1\141\1\157\4\uffff\2\60\1\141\1\uffff\1\162\1\111\1\157\1\145\1\106\1\156\2\106\1\162\1\151\1\106\1\162\1\172\1\162\1\157\1\170\1\143\2\uffff\1\156\1\155\1\103\1\141\1\154\1\151\1\163\3\151\1\145\1\151\1\141\1\145\1\164\1\142\1\123\1\141\1\60\1\141\1\106\1\164\1\144\1\145\1\162\1\164\2\145\1\141\1\154\1\145\1\171\1\60\1\145\1\141\1\151\1\154\1\uffff\1\164\1\154\2\151\1\124\1\154\1\155\1\123\2\154\1\142\1\144\1\154\1\104\1\uffff\1\144\1\154\1\172\1\117\1\60\1\141\1\145\1\156\1\157\1\144\1\165\1\151\2\144\1\154\1\60\1\144\1\151\1\145\1\106\1\117\1\145\1\146\1\uffff\1\60\1\154\1\147\1\103\1\60\1\154\1\172\1\60\1\123\1\145\1\uffff\1\60\1\155\1\146\1\151\1\146\1\60\1\146\1\uffff\1\144\1\117\1\150\1\uffff\1\141\1\145\1\uffff\1\151\1\123\1\uffff\1\145\1\60\1\145\1\146\1\uffff\1\163\1\60\1\146\1\145\1\106\1\60\1\172\1\151\1\156\1\uffff\1\154\1\163\1\145\1\uffff\1\146\1\143\1\151\1\uffff\1\145\1\172\1\163\1\144\1\145\1\164\1\163\1\153\1\145\1\60\1\145\1\151\1\163\1\164\1\60\1\145\1\60\1\154\1\uffff\1\60\1\157\1\124\1\60\1\uffff\1\164\1\uffff\1\144\1\uffff\1\156\1\157\1\uffff\3\60\1\103\3\uffff\1\150\1\145\1\143\1\153\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\115\1\164\1\162\1\154\1\156\1\171\1\145\1\151\1\141\2\123\1\141\1\142\1\162\1\156\1\75\1\uffff\1\123\1\uffff\1\145\1\162\1\171\1\uffff\1\141\2\uffff\1\170\1\172\2\uffff\2\uffff\1\57\2\uffff\2\172\1\uffff\1\162\1\157\1\156\2\151\1\157\1\162\1\165\2\164\1\163\1\164\1\172\2\102\1\154\1\151\1\uffff\1\143\1\145\1\160\1\164\2\uffff\1\123\1\uffff\1\162\1\157\1\151\1\167\1\160\1\uffff\1\170\11\uffff\1\165\1\160\1\164\1\172\1\164\1\147\1\141\1\172\1\163\1\155\1\163\1\137\1\145\1\165\1\143\1\164\1\145\1\uffff\2\172\1\146\1\164\1\61\1\143\1\157\1\145\1\106\1\163\1\164\1\144\2\145\1\111\1\143\1\156\1\145\1\172\1\uffff\2\172\1\164\1\145\1\uffff\1\164\1\145\1\166\1\172\1\145\1\163\1\143\1\162\1\154\1\172\2\uffff\1\167\1\163\1\66\1\153\2\162\1\157\1\151\1\157\1\172\1\162\1\172\2\164\1\147\1\172\3\uffff\1\172\1\146\1\102\1\162\1\145\1\uffff\1\156\1\166\1\172\1\162\1\145\1\151\1\145\1\uffff\1\157\1\137\1\172\1\163\1\164\1\143\1\162\1\157\1\143\1\uffff\1\172\1\uffff\1\145\1\165\1\66\2\uffff\1\172\1\151\1\141\1\143\1\144\1\145\1\uffff\2\144\1\160\1\137\1\162\3\uffff\1\165\1\171\1\172\1\145\1\155\1\156\1\157\1\uffff\1\155\1\162\1\67\1\71\1\uffff\3\164\1\151\1\143\1\145\1\172\1\164\1\145\1\144\1\155\1\160\1\uffff\1\160\1\141\1\172\1\154\1\163\1\145\4\172\1\145\1\157\1\141\1\164\1\162\1\uffff\1\151\1\156\1\172\1\61\1\145\2\164\1\uffff\2\172\1\144\4\uffff\1\144\1\162\1\156\1\157\1\172\1\157\1\144\1\uffff\1\66\2\172\1\126\2\uffff\4\172\1\162\1\uffff\1\156\1\151\1\172\2\uffff\2\157\1\141\1\162\1\157\1\154\1\141\1\157\4\uffff\2\172\1\141\1\uffff\1\162\1\111\1\157\1\145\1\106\1\156\2\106\1\162\1\151\1\106\1\162\1\172\1\162\1\157\1\170\1\143\2\uffff\1\156\1\155\1\103\1\141\1\154\1\157\1\163\3\151\1\145\1\151\1\141\1\145\1\164\1\142\1\123\1\141\1\172\1\165\1\106\1\164\1\144\1\145\1\162\1\164\2\145\1\141\1\154\1\145\1\171\1\172\1\145\1\141\1\151\1\154\1\uffff\1\164\1\154\2\151\1\124\1\154\1\155\1\123\2\154\1\142\1\144\1\154\1\122\1\uffff\1\144\1\154\1\172\1\117\1\172\1\141\1\145\1\156\1\157\1\144\1\165\1\151\2\144\1\154\1\172\1\144\1\151\1\145\1\106\1\117\1\145\1\146\1\uffff\1\172\1\154\1\147\1\103\1\172\1\154\2\172\1\123\1\145\1\uffff\1\172\1\155\1\146\1\151\1\146\1\172\1\146\1\uffff\1\144\1\117\1\150\1\uffff\1\141\1\145\1\uffff\1\151\1\123\1\uffff\1\145\1\172\1\145\1\146\1\uffff\1\163\1\172\1\146\1\145\1\106\2\172\1\151\1\156\1\uffff\1\154\1\163\1\145\1\uffff\1\146\1\143\1\151\1\uffff\1\145\1\172\1\163\1\144\1\145\1\164\1\163\1\153\1\145\1\172\1\145\1\151\1\163\1\164\1\172\1\145\1\172\1\154\1\uffff\1\172\1\157\1\124\1\172\1\uffff\1\164\1\uffff\1\144\1\uffff\1\156\1\157\1\uffff\3\172\1\103\3\uffff\1\150\1\145\1\143\1\153\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\21\uffff\1\34\1\uffff\1\36\3\uffff\1\43\1\uffff\1\104\1\105\2\uffff\1\107\1\110\3\uffff\1\114\1\115\2\uffff\1\107\21\uffff\1\110\4\uffff\1\33\1\34\1\uffff\1\36\5\uffff\1\43\1\uffff\1\104\1\105\1\106\1\111\1\112\1\113\1\114\1\1\1\2\21\uffff\1\15\23\uffff\1\37\4\uffff\1\45\12\uffff\1\16\1\17\20\uffff\1\4\1\73\1\5\5\uffff\1\21\7\uffff\1\47\11\uffff\1\46\1\uffff\1\42\3\uffff\1\65\1\11\6\uffff\1\20\5\uffff\1\27\1\26\1\30\7\uffff\1\74\4\uffff\1\72\14\uffff\1\32\17\uffff\1\12\7\uffff\1\40\3\uffff\1\23\1\24\1\25\1\51\7\uffff\1\22\4\uffff\1\41\1\101\5\uffff\1\50\3\uffff\1\57\1\66\10\uffff\1\3\1\6\1\7\1\13\3\uffff\1\31\21\uffff\1\10\1\52\45\uffff\1\14\16\uffff\1\62\27\uffff\1\35\12\uffff\1\60\7\uffff\1\64\3\uffff\1\44\2\uffff\1\54\2\uffff\1\61\4\uffff\1\70\11\uffff\1\103\3\uffff\1\56\3\uffff\1\67\22\uffff\1\55\4\uffff\1\102\1\uffff\1\77\1\uffff\1\71\2\uffff\1\63\4\uffff\1\75\1\53\1\100\5\uffff\1\76";
    static final String DFA13_specialS =
        "\1\0\36\uffff\1\1\1\2\u01ca\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\43\1\37\4\43\1\40\5\43\1\32\1\31\1\41\1\33\1\36\1\15\7\36\1\20\1\21\5\43\6\35\1\22\4\35\1\13\1\12\6\35\1\1\6\35\3\43\1\34\1\35\1\43\1\35\1\6\1\16\1\7\1\5\1\4\1\35\1\14\1\17\2\35\1\10\1\30\1\11\1\35\1\25\2\35\1\2\1\26\1\3\1\24\4\35\1\23\1\43\1\27\uff82\43",
            "\1\45\11\uffff\1\44",
            "\1\50\7\uffff\1\47",
            "\1\51\4\uffff\1\53\3\uffff\1\52",
            "\1\55\2\uffff\1\54",
            "\1\56",
            "\1\57\17\uffff\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\72\11\uffff\1\71",
            "\1\73\1\74",
            "\1\75",
            "",
            "\1\77",
            "",
            "\1\101",
            "\1\103\10\uffff\1\104\2\uffff\1\102",
            "\1\105",
            "",
            "\1\107",
            "",
            "",
            "\1\112",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\0\113",
            "\0\113",
            "\1\114\4\uffff\1\115",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126\15\uffff\1\127",
            "\1\130\15\uffff\1\131",
            "\1\132",
            "\1\134\14\uffff\1\133",
            "\1\135",
            "\1\136\16\uffff\1\137",
            "\1\140",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\14\46\1\141\15\46",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "\1\161",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\163\13\uffff\1\162",
            "\1\164",
            "\1\165",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\167",
            "\1\170",
            "\1\171",
            "\12\46\7\uffff\21\46\1\172\10\46\4\uffff\1\46\1\uffff\32\46",
            "\1\174",
            "\1\175",
            "\1\176\23\uffff\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
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
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u009b",
            "\1\u009c",
            "",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00a1",
            "\1\u00a4\17\uffff\1\u00a2\23\uffff\1\u00a3",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00b3",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "",
            "\1\u00be",
            "\1\u00bf",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00ca\36\uffff\1\u00c9",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3\4\uffff\1\u00d4",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "",
            "",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9\6\uffff\1\u00ea",
            "\1\u00eb",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "",
            "\1\u00f8",
            "\1\u00f9",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "",
            "\1\u0107",
            "\1\u0108",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0110",
            "",
            "",
            "",
            "",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0116",
            "\1\u0117",
            "",
            "\1\u0118",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u011e\1\uffff\1\u011c\2\uffff\1\u011b\1\u0120\4\uffff\1\u0122\1\u0121\5\uffff\1\u011f\2\uffff\1\u011d",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0127",
            "",
            "\1\u0128",
            "\1\u0129",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\u012c\44\uffff\1\u012e\2\uffff\1\u012d\2\uffff\1\u012b",
            "\1\u012f\33\uffff\1\u0130",
            "\1\u0132\1\u0131\15\uffff\1\u0133",
            "\1\u0134\2\uffff\1\u0135\50\uffff\1\u0136",
            "\1\u0137\5\uffff\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u013e",
            "",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "",
            "",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155\5\uffff\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0164\23\uffff\1\u0165",
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
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184\15\uffff\1\u0185",
            "",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u01a2",
            "\1\u01a3",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u01a5",
            "\1\u01a6",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u01ad",
            "",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "",
            "\1\u01b1",
            "\1\u01b2",
            "",
            "\1\u01b3",
            "\1\u01b4",
            "",
            "\1\u01b5",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u01b7",
            "\1\u01b8",
            "",
            "\1\u01b9",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u01d7",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u01d9",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u01db",
            "\1\u01dc",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u01de",
            "",
            "\1\u01df",
            "",
            "\1\u01e0",
            "\1\u01e1",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u01e5",
            "",
            "",
            "",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | RULE_HEXADECIMAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='T') ) {s = 1;}

                        else if ( (LA13_0=='s') ) {s = 2;}

                        else if ( (LA13_0=='u') ) {s = 3;}

                        else if ( (LA13_0=='f') ) {s = 4;}

                        else if ( (LA13_0=='e') ) {s = 5;}

                        else if ( (LA13_0=='b') ) {s = 6;}

                        else if ( (LA13_0=='d') ) {s = 7;}

                        else if ( (LA13_0=='l') ) {s = 8;}

                        else if ( (LA13_0=='n') ) {s = 9;}

                        else if ( (LA13_0=='M') ) {s = 10;}

                        else if ( (LA13_0=='L') ) {s = 11;}

                        else if ( (LA13_0=='h') ) {s = 12;}

                        else if ( (LA13_0=='2') ) {s = 13;}

                        else if ( (LA13_0=='c') ) {s = 14;}

                        else if ( (LA13_0=='i') ) {s = 15;}

                        else if ( (LA13_0==':') ) {s = 16;}

                        else if ( (LA13_0==';') ) {s = 17;}

                        else if ( (LA13_0=='G') ) {s = 18;}

                        else if ( (LA13_0=='{') ) {s = 19;}

                        else if ( (LA13_0=='v') ) {s = 20;}

                        else if ( (LA13_0=='p') ) {s = 21;}

                        else if ( (LA13_0=='t') ) {s = 22;}

                        else if ( (LA13_0=='}') ) {s = 23;}

                        else if ( (LA13_0=='m') ) {s = 24;}

                        else if ( (LA13_0=='.') ) {s = 25;}

                        else if ( (LA13_0=='-') ) {s = 26;}

                        else if ( (LA13_0=='0') ) {s = 27;}

                        else if ( (LA13_0=='^') ) {s = 28;}

                        else if ( ((LA13_0>='A' && LA13_0<='F')||(LA13_0>='H' && LA13_0<='K')||(LA13_0>='N' && LA13_0<='S')||(LA13_0>='U' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='a'||LA13_0=='g'||(LA13_0>='j' && LA13_0<='k')||LA13_0=='o'||(LA13_0>='q' && LA13_0<='r')||(LA13_0>='w' && LA13_0<='z')) ) {s = 29;}

                        else if ( (LA13_0=='1'||(LA13_0>='3' && LA13_0<='9')) ) {s = 30;}

                        else if ( (LA13_0=='\"') ) {s = 31;}

                        else if ( (LA13_0=='\'') ) {s = 32;}

                        else if ( (LA13_0=='/') ) {s = 33;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 34;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<=',')||(LA13_0>='<' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_31 = input.LA(1);

                        s = -1;
                        if ( ((LA13_31>='\u0000' && LA13_31<='\uFFFF')) ) {s = 75;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_32 = input.LA(1);

                        s = -1;
                        if ( ((LA13_32>='\u0000' && LA13_32<='\uFFFF')) ) {s = 75;}

                        else s = 35;

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