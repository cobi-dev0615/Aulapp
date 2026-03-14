package com.nimbusds.jose.shaded.json.parser;

import com.nimbusds.jose.shaded.json.writer.JsonReader;
import com.nimbusds.jose.shaded.json.writer.JsonReaderI;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.io.ConstantsKt;
import kotlin.text.Typography;

/* loaded from: classes2.dex */
abstract class JSONParserBase {
    protected static boolean[] stopAll;
    protected static boolean[] stopArray;
    protected static boolean[] stopKey;
    protected static boolean[] stopValue;
    protected static boolean[] stopX;
    protected final boolean acceptLeadinZero;
    protected final boolean acceptNaN;
    protected final boolean acceptNonQuote;
    protected final boolean acceptSimpleQuote;
    protected final boolean acceptUselessComma;
    JsonReader base;
    protected char c;
    protected final boolean checkTaillingData;
    protected final boolean checkTaillingSpace;
    protected final boolean ignoreControlChar;
    private String lastKey;
    protected int pos;
    protected final boolean reject127;
    protected final MSB sb = new MSB(15);
    protected final boolean unrestictBigDigit;
    protected final boolean useHiPrecisionFloat;
    protected final boolean useIntegerStorage;
    protected Object xo;
    protected String xs;

    public static class MSB {
        char[] b;
        int p = -1;

        public MSB(int i) {
            this.b = new char[i];
        }

        public void append(char c) {
            int i = this.p + 1;
            this.p = i;
            char[] cArr = this.b;
            if (cArr.length <= i) {
                char[] cArr2 = new char[(cArr.length * 2) + 1];
                System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                this.b = cArr2;
            }
            this.b[this.p] = c;
        }

        public void clear() {
            this.p = -1;
        }

        public String toString() {
            return new String(this.b, 0, this.p + 1);
        }
    }

    static {
        boolean[] zArr = new boolean[126];
        stopAll = zArr;
        boolean[] zArr2 = new boolean[126];
        stopArray = zArr2;
        boolean[] zArr3 = new boolean[126];
        stopKey = zArr3;
        boolean[] zArr4 = new boolean[126];
        stopValue = zArr4;
        boolean[] zArr5 = new boolean[126];
        stopX = zArr5;
        zArr3[26] = true;
        zArr3[58] = true;
        zArr4[26] = true;
        zArr4[125] = true;
        zArr4[44] = true;
        zArr2[26] = true;
        zArr2[93] = true;
        zArr2[44] = true;
        zArr5[26] = true;
        zArr[58] = true;
        zArr[44] = true;
        zArr[26] = true;
        zArr[125] = true;
        zArr[93] = true;
    }

    public JSONParserBase(int i) {
        this.acceptNaN = (i & 4) > 0;
        this.acceptNonQuote = (i & 2) > 0;
        this.acceptSimpleQuote = (i & 1) > 0;
        this.ignoreControlChar = (i & 8) > 0;
        this.useIntegerStorage = (i & 16) > 0;
        this.acceptLeadinZero = (i & 32) > 0;
        this.acceptUselessComma = (i & 64) > 0;
        this.useHiPrecisionFloat = (i & 128) > 0;
        this.checkTaillingData = (i & 768) != 768;
        this.checkTaillingSpace = (i & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0;
        this.reject127 = (i & 1024) > 0;
        this.unrestictBigDigit = (i & 2048) > 0;
    }

    public void checkControleChar() {
        if (this.ignoreControlChar) {
            return;
        }
        int length = this.xs.length();
        for (int i = 0; i < length; i++) {
            char charAt = this.xs.charAt(i);
            if (charAt >= 0) {
                if (charAt <= 31) {
                    throw new ParseException(this.pos + i, 0, Character.valueOf(charAt));
                }
                if (charAt == 127 && this.reject127) {
                    throw new ParseException(this.pos + i, 0, Character.valueOf(charAt));
                }
            }
        }
    }

    public void checkLeadinZero() {
        int length = this.xs.length();
        if (length == 1) {
            return;
        }
        if (length == 2) {
            if (this.xs.equals("00")) {
                throw new ParseException(this.pos, 6, this.xs);
            }
            return;
        }
        char charAt = this.xs.charAt(0);
        char charAt2 = this.xs.charAt(1);
        if (charAt != '-') {
            if (charAt == '0' && charAt2 >= '0' && charAt2 <= '9') {
                throw new ParseException(this.pos, 6, this.xs);
            }
            return;
        }
        char charAt3 = this.xs.charAt(2);
        if (charAt2 == '0' && charAt3 >= '0' && charAt3 <= '9') {
            throw new ParseException(this.pos, 6, this.xs);
        }
    }

    public Number extractFloat() {
        if (!this.acceptLeadinZero) {
            checkLeadinZero();
        }
        try {
            if (!this.useHiPrecisionFloat) {
                return Float.valueOf(Float.parseFloat(this.xs));
            }
            if (this.xs.length() <= 18) {
                return Double.valueOf(Double.parseDouble(this.xs));
            }
            BigDecimal bigDecimal = new BigDecimal(this.xs);
            if (this.unrestictBigDigit) {
                return bigDecimal;
            }
            double parseDouble = Double.parseDouble(this.xs);
            return String.valueOf(parseDouble).equals(this.xs) ? Double.valueOf(parseDouble) : bigDecimal;
        } catch (NumberFormatException unused) {
            throw new ParseException(this.pos, 1, this.xs);
        }
    }

    public <T> T parse(JsonReaderI<T> jsonReaderI) {
        this.pos = -1;
        try {
            read();
            T t = (T) readFirst(jsonReaderI);
            if (this.checkTaillingData) {
                if (!this.checkTaillingSpace) {
                    skipSpace();
                }
                if (this.c != 26) {
                    throw new ParseException(this.pos - 1, 1, Character.valueOf(this.c));
                }
            }
            this.xs = null;
            this.xo = null;
            return t;
        } catch (IOException e) {
            throw new ParseException(this.pos, e);
        }
    }

    public Number parseNumber(String str) {
        int i;
        int i2;
        int length = str.length();
        boolean z = false;
        if (str.charAt(0) == '-') {
            if (!this.acceptLeadinZero && length >= 3 && str.charAt(1) == '0') {
                throw new ParseException(this.pos, 6, str);
            }
            i = 20;
            i2 = 1;
        } else {
            if (!this.acceptLeadinZero && length >= 2 && str.charAt(0) == '0') {
                throw new ParseException(this.pos, 6, str);
            }
            i = 19;
            i2 = 0;
        }
        int i3 = i2;
        if (length >= i) {
            if (length > i) {
                return new BigInteger(str, 10);
            }
            length--;
            z = true;
        }
        long j = 0;
        while (i2 < length) {
            j = (j * 10) + ('0' - str.charAt(i2));
            i2++;
        }
        if (z) {
            if (j <= -922337203685477580L) {
                if (j >= -922337203685477580L) {
                    if (i3 != 0) {
                    }
                }
                return new BigInteger(str, 10);
            }
            j = (j * 10) + ('0' - str.charAt(i2));
        }
        if (i3 != 0) {
            return (!this.useIntegerStorage || j < -2147483648L) ? Long.valueOf(j) : Integer.valueOf((int) j);
        }
        long j2 = -j;
        return (!this.useIntegerStorage || j2 > 2147483647L) ? Long.valueOf(j2) : Integer.valueOf((int) j2);
    }

    public abstract void read();

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0043, code lost:
    
        if (r4 == ':') goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0047, code lost:
    
        if (r4 == ']') goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004b, code lost:
    
        if (r4 == '}') goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
    
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r7.pos, 0, java.lang.Character.valueOf(r7.c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0057, code lost:
    
        if (r1 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x005b, code lost:
    
        if (r7.acceptUselessComma == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x006b, code lost:
    
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r7.pos, 0, java.lang.Character.valueOf(r7.c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x006c, code lost:
    
        read();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0073, code lost:
    
        return r8.convert(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> T readArray(JsonReaderI<T> jsonReaderI) {
        Object createArray = jsonReaderI.createArray();
        if (this.c != '[') {
            throw new RuntimeException("Internal Error");
        }
        read();
        if (this.c == ',' && !this.acceptUselessComma) {
            throw new ParseException(this.pos, 0, Character.valueOf(this.c));
        }
        while (true) {
            boolean z = false;
            while (true) {
                char c = this.c;
                if (c != '\t' && c != '\n' && c != '\r') {
                    if (c == 26) {
                        throw new ParseException(this.pos - 1, 3, "EOF");
                    }
                    if (c != ' ') {
                        if (c != ',') {
                            break;
                        }
                        if (z && !this.acceptUselessComma) {
                            throw new ParseException(this.pos, 0, Character.valueOf(this.c));
                        }
                        read();
                        z = true;
                    }
                }
                read();
            }
            jsonReaderI.addValue(createArray, readMain(jsonReaderI, stopArray));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ba, code lost:
    
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r3.pos, 0, java.lang.Character.valueOf(r3.c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00fd, code lost:
    
        r0 = readNumber(com.nimbusds.jose.shaded.json.parser.JSONParserBase.stopX);
        r3.xo = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0109, code lost:
    
        return r4.convert(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> T readFirst(JsonReaderI<T> jsonReaderI) {
        while (true) {
            char c = this.c;
            if (c != '\t' && c != '\n') {
                switch (c) {
                    case '\r':
                    case ' ':
                        break;
                    case '\"':
                    case '\'':
                        readString();
                        return jsonReaderI.convert(this.xs);
                    case '-':
                        break;
                    case 'N':
                        readNQString(stopX);
                        if (!this.acceptNaN) {
                            throw new ParseException(this.pos, 1, this.xs);
                        }
                        if ("NaN".equals(this.xs)) {
                            return jsonReaderI.convert(Float.valueOf(Float.NaN));
                        }
                        if (this.acceptNonQuote) {
                            return jsonReaderI.convert(this.xs);
                        }
                        throw new ParseException(this.pos, 1, this.xs);
                    case '[':
                        return (T) readArray(jsonReaderI);
                    case ']':
                    case '}':
                        break;
                    case 'f':
                        readNQString(stopX);
                        if ("false".equals(this.xs)) {
                            return jsonReaderI.convert(Boolean.FALSE);
                        }
                        if (this.acceptNonQuote) {
                            return jsonReaderI.convert(this.xs);
                        }
                        throw new ParseException(this.pos, 1, this.xs);
                    case 'n':
                        readNQString(stopX);
                        if ("null".equals(this.xs)) {
                            return null;
                        }
                        if (this.acceptNonQuote) {
                            return jsonReaderI.convert(this.xs);
                        }
                        throw new ParseException(this.pos, 1, this.xs);
                    case 't':
                        readNQString(stopX);
                        if ("true".equals(this.xs)) {
                            return jsonReaderI.convert(Boolean.TRUE);
                        }
                        if (this.acceptNonQuote) {
                            return jsonReaderI.convert(this.xs);
                        }
                        throw new ParseException(this.pos, 1, this.xs);
                    case '{':
                        return (T) readObject(jsonReaderI);
                    default:
                        switch (c) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                break;
                            case ':':
                                break;
                            default:
                                readNQString(stopX);
                                if (this.acceptNonQuote) {
                                    return jsonReaderI.convert(this.xs);
                                }
                                throw new ParseException(this.pos, 1, this.xs);
                        }
                }
            }
            read();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a0, code lost:
    
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r2.pos, 0, java.lang.Character.valueOf(r2.c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e3, code lost:
    
        return readNumber(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object readMain(JsonReaderI<?> jsonReaderI, boolean[] zArr) {
        while (true) {
            char c = this.c;
            if (c != '\t' && c != '\n') {
                switch (c) {
                    case '\r':
                    case ' ':
                        break;
                    case '\"':
                    case '\'':
                        readString();
                        return this.xs;
                    case '-':
                        break;
                    case 'N':
                        readNQString(zArr);
                        if (!this.acceptNaN) {
                            throw new ParseException(this.pos, 1, this.xs);
                        }
                        if ("NaN".equals(this.xs)) {
                            return Float.valueOf(Float.NaN);
                        }
                        if (this.acceptNonQuote) {
                            return this.xs;
                        }
                        throw new ParseException(this.pos, 1, this.xs);
                    case '[':
                        return readArray(jsonReaderI.startArray(this.lastKey));
                    case ']':
                    case '}':
                        break;
                    case 'f':
                        readNQString(zArr);
                        if ("false".equals(this.xs)) {
                            return Boolean.FALSE;
                        }
                        if (this.acceptNonQuote) {
                            return this.xs;
                        }
                        throw new ParseException(this.pos, 1, this.xs);
                    case 'n':
                        readNQString(zArr);
                        if ("null".equals(this.xs)) {
                            return null;
                        }
                        if (this.acceptNonQuote) {
                            return this.xs;
                        }
                        throw new ParseException(this.pos, 1, this.xs);
                    case 't':
                        readNQString(zArr);
                        if ("true".equals(this.xs)) {
                            return Boolean.TRUE;
                        }
                        if (this.acceptNonQuote) {
                            return this.xs;
                        }
                        throw new ParseException(this.pos, 1, this.xs);
                    case '{':
                        return readObject(jsonReaderI.startObject(this.lastKey));
                    default:
                        switch (c) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                break;
                            case ':':
                                break;
                            default:
                                readNQString(zArr);
                                if (this.acceptNonQuote) {
                                    return this.xs;
                                }
                                throw new ParseException(this.pos, 1, this.xs);
                        }
                }
            }
            read();
        }
    }

    public abstract void readNQString(boolean[] zArr);

    public abstract void readNoEnd() throws ParseException;

    public abstract Object readNumber(boolean[] zArr) throws ParseException;

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e7, code lost:
    
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r12.pos, 0, java.lang.Character.valueOf(r12.c));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> T readObject(JsonReaderI<T> jsonReaderI) {
        if (this.c != '{') {
            throw new RuntimeException("Internal Error");
        }
        Object createObject = jsonReaderI.createObject();
        boolean z = false;
        while (true) {
            read();
            char c = this.c;
            if (c != '\t' && c != '\n' && c != '\r' && c != ' ') {
                if (c != ',') {
                    if (c == ':' || c == '[' || c == ']' || c == '{') {
                        break;
                    }
                    if (c == '}') {
                        if (z && !this.acceptUselessComma) {
                            throw new ParseException(this.pos, 0, Character.valueOf(this.c));
                        }
                        read();
                        return jsonReaderI.convert(createObject);
                    }
                    if (c == '\"' || c == '\'') {
                        readString();
                    } else {
                        readNQString(stopKey);
                        if (!this.acceptNonQuote) {
                            throw new ParseException(this.pos, 1, this.xs);
                        }
                    }
                    String str = this.xs;
                    skipSpace();
                    char c2 = this.c;
                    if (c2 != ':') {
                        if (c2 == 26) {
                            throw new ParseException(this.pos - 1, 3, null);
                        }
                        throw new ParseException(this.pos - 1, 0, Character.valueOf(this.c));
                    }
                    readNoEnd();
                    this.lastKey = str;
                    jsonReaderI.setValue(createObject, str, readMain(jsonReaderI, stopValue));
                    this.lastKey = null;
                    skipSpace();
                    char c3 = this.c;
                    if (c3 == '}') {
                        read();
                        return jsonReaderI.convert(createObject);
                    }
                    if (c3 == 26) {
                        throw new ParseException(this.pos - 1, 3, null);
                    }
                    if (c3 != ',') {
                        throw new ParseException(this.pos - 1, 1, Character.valueOf(this.c));
                    }
                } else if (z && !this.acceptUselessComma) {
                    throw new ParseException(this.pos, 0, Character.valueOf(this.c));
                }
                z = true;
            }
        }
    }

    public abstract void readS();

    public abstract void readString() throws ParseException;

    public void readString2() {
        char c = this.c;
        while (true) {
            read();
            char c2 = this.c;
            if (c2 == '\"' || c2 == '\'') {
                if (c == c2) {
                    read();
                    this.xs = this.sb.toString();
                    return;
                }
                this.sb.append(c2);
            } else if (c2 == '\\') {
                read();
                char c3 = this.c;
                if (c3 == '\"') {
                    this.sb.append(Typography.quote);
                } else if (c3 == '\'') {
                    this.sb.append('\'');
                } else if (c3 == '/') {
                    this.sb.append('/');
                } else if (c3 == '\\') {
                    this.sb.append('\\');
                } else if (c3 == 'b') {
                    this.sb.append('\b');
                } else if (c3 == 'f') {
                    this.sb.append('\f');
                } else if (c3 == 'n') {
                    this.sb.append('\n');
                } else if (c3 == 'r') {
                    this.sb.append('\r');
                } else if (c3 == 'x') {
                    this.sb.append(readUnicode(2));
                } else if (c3 == 't') {
                    this.sb.append('\t');
                } else if (c3 == 'u') {
                    this.sb.append(readUnicode(4));
                }
            } else if (c2 != 127) {
                switch (c2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case '\b':
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        if (!this.ignoreControlChar) {
                            throw new ParseException(this.pos, 0, Character.valueOf(this.c));
                        }
                        continue;
                    case 26:
                        throw new ParseException(this.pos - 1, 3, null);
                }
                this.sb.append(c2);
            } else if (this.ignoreControlChar) {
                continue;
            } else {
                if (this.reject127) {
                    throw new ParseException(this.pos, 0, Character.valueOf(this.c));
                }
                this.sb.append(c2);
            }
        }
    }

    public char readUnicode(int i) {
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 * 16;
            read();
            char c = this.c;
            if (c <= '9' && c >= '0') {
                i2 = c - '0';
            } else if (c <= 'F' && c >= 'A') {
                i2 = c - '7';
            } else {
                if (c < 'a' || c > 'f') {
                    if (c == 26) {
                        throw new ParseException(this.pos, 3, "EOF");
                    }
                    throw new ParseException(this.pos, 4, Character.valueOf(this.c));
                }
                i2 = c - 'W';
            }
            i3 = i2 + i5;
        }
        return (char) i3;
    }

    public void skipDigits() {
        while (true) {
            char c = this.c;
            if (c < '0' || c > '9') {
                return;
            } else {
                readS();
            }
        }
    }

    public void skipNQString(boolean[] zArr) {
        while (true) {
            char c = this.c;
            if (c == 26) {
                return;
            }
            if (c >= 0 && c < '~' && zArr[c]) {
                return;
            } else {
                readS();
            }
        }
    }

    public void skipSpace() {
        while (true) {
            char c = this.c;
            if (c > ' ' || c == 26) {
                return;
            } else {
                readS();
            }
        }
    }
}
