package es.uah.aut.srg.gss.lang.tmheaderoutput.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTMHEADEROUTPUTLexer extends Lexer {
    public static final int RULE_STRING=6;
    public static final int RULE_UINT_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int RULE_HEX_STRING=5;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int RULE_INT=8;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalTMHEADEROUTPUTLexer() {;} 
    public InternalTMHEADEROUTPUTLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTMHEADEROUTPUTLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalTMHEADEROUTPUT.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTMHEADEROUTPUT.g:11:7: ( '/>' )
            // InternalTMHEADEROUTPUT.g:11:9: '/>'
            {
            match("/>"); 


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
            // InternalTMHEADEROUTPUT.g:12:7: ( '<GSSTMHeaderOutput' )
            // InternalTMHEADEROUTPUT.g:12:9: '<GSSTMHeaderOutput'
            {
            match("<GSSTMHeaderOutput"); 


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
            // InternalTMHEADEROUTPUT.g:13:7: ( 'name=' )
            // InternalTMHEADEROUTPUT.g:13:9: 'name='
            {
            match("name="); 


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
            // InternalTMHEADEROUTPUT.g:14:7: ( '>' )
            // InternalTMHEADEROUTPUT.g:14:9: '>'
            {
            match('>'); 

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
            // InternalTMHEADEROUTPUT.g:15:7: ( '<format' )
            // InternalTMHEADEROUTPUT.g:15:9: '<format'
            {
            match("<format"); 


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
            // InternalTMHEADEROUTPUT.g:16:7: ( 'file=' )
            // InternalTMHEADEROUTPUT.g:16:9: 'file='
            {
            match("file="); 


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
            // InternalTMHEADEROUTPUT.g:17:7: ( '</GSSTMHeaderOutput>' )
            // InternalTMHEADEROUTPUT.g:17:9: '</GSSTMHeaderOutput>'
            {
            match("</GSSTMHeaderOutput>"); 


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
            // InternalTMHEADEROUTPUT.g:18:7: ( '<fields>' )
            // InternalTMHEADEROUTPUT.g:18:9: '<fields>'
            {
            match("<fields>"); 


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
            // InternalTMHEADEROUTPUT.g:19:7: ( '</fields>' )
            // InternalTMHEADEROUTPUT.g:19:9: '</fields>'
            {
            match("</fields>"); 


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
            // InternalTMHEADEROUTPUT.g:20:7: ( '<HeaderField' )
            // InternalTMHEADEROUTPUT.g:20:9: '<HeaderField'
            {
            match("<HeaderField"); 


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
            // InternalTMHEADEROUTPUT.g:21:7: ( 'gssHeaderField=' )
            // InternalTMHEADEROUTPUT.g:21:9: 'gssHeaderField='
            {
            match("gssHeaderField="); 


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
            // InternalTMHEADEROUTPUT.g:22:7: ( '</HeaderField>' )
            // InternalTMHEADEROUTPUT.g:22:9: '</HeaderField>'
            {
            match("</HeaderField>"); 


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
            // InternalTMHEADEROUTPUT.g:23:7: ( '<FieldValueRaw' )
            // InternalTMHEADEROUTPUT.g:23:9: '<FieldValueRaw'
            {
            match("<FieldValueRaw"); 


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
            // InternalTMHEADEROUTPUT.g:24:7: ( 'value=' )
            // InternalTMHEADEROUTPUT.g:24:9: 'value='
            {
            match("value="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "RULE_UINT_STRING"
    public final void mRULE_UINT_STRING() throws RecognitionException {
        try {
            int _type = RULE_UINT_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTMHEADEROUTPUT.g:999:18: ( '\"' ( '0' .. '9' )+ '\"' )
            // InternalTMHEADEROUTPUT.g:999:20: '\"' ( '0' .. '9' )+ '\"'
            {
            match('\"'); 
            // InternalTMHEADEROUTPUT.g:999:24: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTMHEADEROUTPUT.g:999:25: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UINT_STRING"

    // $ANTLR start "RULE_HEX_STRING"
    public final void mRULE_HEX_STRING() throws RecognitionException {
        try {
            int _type = RULE_HEX_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTMHEADEROUTPUT.g:1001:17: ( '\"0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ '\"' )
            // InternalTMHEADEROUTPUT.g:1001:19: '\"0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ '\"'
            {
            match("\"0x"); 

            // InternalTMHEADEROUTPUT.g:1001:25: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='F')||(LA2_0>='a' && LA2_0<='f')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTMHEADEROUTPUT.g:
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTMHEADEROUTPUT.g:1003:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTMHEADEROUTPUT.g:1003:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTMHEADEROUTPUT.g:1003:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTMHEADEROUTPUT.g:1003:11: '^'
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

            // InternalTMHEADEROUTPUT.g:1003:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTMHEADEROUTPUT.g:
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
            	    break loop4;
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
            // InternalTMHEADEROUTPUT.g:1005:10: ( ( '0' .. '9' )+ )
            // InternalTMHEADEROUTPUT.g:1005:12: ( '0' .. '9' )+
            {
            // InternalTMHEADEROUTPUT.g:1005:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTMHEADEROUTPUT.g:1005:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // InternalTMHEADEROUTPUT.g:1007:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTMHEADEROUTPUT.g:1007:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTMHEADEROUTPUT.g:1007:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTMHEADEROUTPUT.g:1007:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTMHEADEROUTPUT.g:1007:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalTMHEADEROUTPUT.g:1007:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTMHEADEROUTPUT.g:1007:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalTMHEADEROUTPUT.g:1007:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTMHEADEROUTPUT.g:1007:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalTMHEADEROUTPUT.g:1007:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTMHEADEROUTPUT.g:1007:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // InternalTMHEADEROUTPUT.g:1009:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTMHEADEROUTPUT.g:1009:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTMHEADEROUTPUT.g:1009:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTMHEADEROUTPUT.g:1009:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // InternalTMHEADEROUTPUT.g:1011:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTMHEADEROUTPUT.g:1011:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalTMHEADEROUTPUT.g:1011:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTMHEADEROUTPUT.g:1011:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // InternalTMHEADEROUTPUT.g:1011:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTMHEADEROUTPUT.g:1011:41: ( '\\r' )? '\\n'
                    {
                    // InternalTMHEADEROUTPUT.g:1011:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalTMHEADEROUTPUT.g:1011:41: '\\r'
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
            // InternalTMHEADEROUTPUT.g:1013:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTMHEADEROUTPUT.g:1013:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTMHEADEROUTPUT.g:1013:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTMHEADEROUTPUT.g:
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalTMHEADEROUTPUT.g:1015:16: ( . )
            // InternalTMHEADEROUTPUT.g:1015:18: .
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
        // InternalTMHEADEROUTPUT.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_UINT_STRING | RULE_HEX_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=23;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalTMHEADEROUTPUT.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalTMHEADEROUTPUT.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalTMHEADEROUTPUT.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalTMHEADEROUTPUT.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalTMHEADEROUTPUT.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalTMHEADEROUTPUT.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalTMHEADEROUTPUT.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalTMHEADEROUTPUT.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalTMHEADEROUTPUT.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalTMHEADEROUTPUT.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalTMHEADEROUTPUT.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalTMHEADEROUTPUT.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalTMHEADEROUTPUT.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalTMHEADEROUTPUT.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalTMHEADEROUTPUT.g:1:94: RULE_UINT_STRING
                {
                mRULE_UINT_STRING(); 

                }
                break;
            case 16 :
                // InternalTMHEADEROUTPUT.g:1:111: RULE_HEX_STRING
                {
                mRULE_HEX_STRING(); 

                }
                break;
            case 17 :
                // InternalTMHEADEROUTPUT.g:1:127: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 18 :
                // InternalTMHEADEROUTPUT.g:1:135: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 19 :
                // InternalTMHEADEROUTPUT.g:1:144: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 20 :
                // InternalTMHEADEROUTPUT.g:1:156: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 21 :
                // InternalTMHEADEROUTPUT.g:1:172: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 22 :
                // InternalTMHEADEROUTPUT.g:1:188: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 23 :
                // InternalTMHEADEROUTPUT.g:1:196: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\2\16\1\30\1\uffff\3\30\2\16\2\uffff\1\16\12\uffff\1\30\2\uffff\3\30\12\uffff\4\30\2\uffff\4\30\4\uffff\2\30\1\uffff\1\30\2\uffff\10\30\1\uffff";
    static final String DFA14_eofS =
        "\104\uffff";
    static final String DFA14_minS =
        "\1\0\1\52\1\57\1\141\1\uffff\1\151\1\163\1\141\1\0\1\101\2\uffff\1\0\6\uffff\1\151\1\107\2\uffff\1\155\2\uffff\1\154\1\163\1\154\2\0\10\uffff\2\145\1\110\1\165\1\0\1\uffff\2\75\2\145\1\0\3\uffff\1\141\1\75\1\uffff\1\144\2\uffff\1\145\1\162\1\106\1\151\1\145\1\154\1\144\1\75\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\76\1\146\1\141\1\uffff\1\151\1\163\1\141\1\uffff\1\172\2\uffff\1\uffff\6\uffff\1\157\1\146\2\uffff\1\155\2\uffff\1\154\1\163\1\154\2\uffff\10\uffff\2\145\1\110\1\165\1\uffff\1\uffff\2\75\2\145\1\uffff\3\uffff\1\141\1\75\1\uffff\1\144\2\uffff\1\145\1\162\1\106\1\151\1\145\1\154\1\144\1\75\1\uffff";
    static final String DFA14_acceptS =
        "\4\uffff\1\4\5\uffff\1\21\1\22\1\uffff\1\26\1\27\1\1\1\24\1\25\1\2\2\uffff\1\12\1\15\1\uffff\1\21\1\4\5\uffff\1\23\1\22\1\26\1\5\1\10\1\7\1\11\1\14\5\uffff\1\17\5\uffff\1\17\1\3\1\6\2\uffff\1\20\1\uffff\1\16\1\20\10\uffff\1\13";
    static final String DFA14_specialS =
        "\1\2\7\uffff\1\3\3\uffff\1\4\20\uffff\1\5\1\6\14\uffff\1\1\5\uffff\1\0\22\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\16\2\15\2\16\1\15\22\16\1\15\1\16\1\10\4\16\1\14\7\16\1\1\12\13\2\16\1\2\1\16\1\4\2\16\32\12\3\16\1\11\1\12\1\16\5\12\1\5\1\6\6\12\1\3\7\12\1\7\4\12\uff85\16",
            "\1\20\4\uffff\1\21\16\uffff\1\17",
            "\1\24\26\uffff\1\26\1\22\1\25\35\uffff\1\23",
            "\1\27",
            "",
            "\1\32",
            "\1\33",
            "\1\34",
            "\60\37\1\35\11\36\uffc6\37",
            "\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "\0\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43\5\uffff\1\42",
            "\1\44\1\46\35\uffff\1\45",
            "",
            "",
            "\1\47",
            "",
            "",
            "\1\50",
            "\1\51",
            "\1\52",
            "\42\37\1\54\15\37\12\36\76\37\1\53\uff87\37",
            "\42\37\1\54\15\37\12\36\uffc6\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\60\37\12\61\7\37\6\61\32\37\6\61\uff99\37",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\42\37\1\67\15\37\12\61\7\37\6\61\32\37\6\61\uff99\37",
            "",
            "",
            "",
            "\1\70",
            "\1\71",
            "",
            "\1\73",
            "",
            "",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    static class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_UINT_STRING | RULE_HEX_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_49 = input.LA(1);

                        s = -1;
                        if ( (LA14_49=='\"') ) {s = 55;}

                        else if ( ((LA14_49>='\u0000' && LA14_49<='!')||(LA14_49>='#' && LA14_49<='/')||(LA14_49>=':' && LA14_49<='@')||(LA14_49>='G' && LA14_49<='`')||(LA14_49>='g' && LA14_49<='\uFFFF')) ) {s = 31;}

                        else if ( ((LA14_49>='0' && LA14_49<='9')||(LA14_49>='A' && LA14_49<='F')||(LA14_49>='a' && LA14_49<='f')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_43 = input.LA(1);

                        s = -1;
                        if ( ((LA14_43>='0' && LA14_43<='9')||(LA14_43>='A' && LA14_43<='F')||(LA14_43>='a' && LA14_43<='f')) ) {s = 49;}

                        else if ( ((LA14_43>='\u0000' && LA14_43<='/')||(LA14_43>=':' && LA14_43<='@')||(LA14_43>='G' && LA14_43<='`')||(LA14_43>='g' && LA14_43<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='/') ) {s = 1;}

                        else if ( (LA14_0=='<') ) {s = 2;}

                        else if ( (LA14_0=='n') ) {s = 3;}

                        else if ( (LA14_0=='>') ) {s = 4;}

                        else if ( (LA14_0=='f') ) {s = 5;}

                        else if ( (LA14_0=='g') ) {s = 6;}

                        else if ( (LA14_0=='v') ) {s = 7;}

                        else if ( (LA14_0=='\"') ) {s = 8;}

                        else if ( (LA14_0=='^') ) {s = 9;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='e')||(LA14_0>='h' && LA14_0<='m')||(LA14_0>='o' && LA14_0<='u')||(LA14_0>='w' && LA14_0<='z')) ) {s = 10;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 11;}

                        else if ( (LA14_0=='\'') ) {s = 12;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 13;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='.')||(LA14_0>=':' && LA14_0<=';')||LA14_0=='='||(LA14_0>='?' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_8 = input.LA(1);

                        s = -1;
                        if ( (LA14_8=='0') ) {s = 29;}

                        else if ( ((LA14_8>='1' && LA14_8<='9')) ) {s = 30;}

                        else if ( ((LA14_8>='\u0000' && LA14_8<='/')||(LA14_8>=':' && LA14_8<='\uFFFF')) ) {s = 31;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_12 = input.LA(1);

                        s = -1;
                        if ( ((LA14_12>='\u0000' && LA14_12<='\uFFFF')) ) {s = 31;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_29 = input.LA(1);

                        s = -1;
                        if ( (LA14_29=='x') ) {s = 43;}

                        else if ( (LA14_29=='\"') ) {s = 44;}

                        else if ( ((LA14_29>='\u0000' && LA14_29<='!')||(LA14_29>='#' && LA14_29<='/')||(LA14_29>=':' && LA14_29<='w')||(LA14_29>='y' && LA14_29<='\uFFFF')) ) {s = 31;}

                        else if ( ((LA14_29>='0' && LA14_29<='9')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_30 = input.LA(1);

                        s = -1;
                        if ( (LA14_30=='\"') ) {s = 44;}

                        else if ( ((LA14_30>='\u0000' && LA14_30<='!')||(LA14_30>='#' && LA14_30<='/')||(LA14_30>=':' && LA14_30<='\uFFFF')) ) {s = 31;}

                        else if ( ((LA14_30>='0' && LA14_30<='9')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}