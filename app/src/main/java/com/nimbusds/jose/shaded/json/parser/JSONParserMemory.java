package com.nimbusds.jose.shaded.json.parser;

/* loaded from: classes2.dex */
abstract class JSONParserMemory extends JSONParserBase {
    protected int len;

    public JSONParserMemory(int i) {
        super(i);
    }

    public abstract void extractString(int i, int i2);

    public abstract void extractStringTrim(int i, int i2);

    public abstract int indexOf(char c, int i);

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public void readNQString(boolean[] zArr) {
        int i = this.pos;
        skipNQString(zArr);
        extractStringTrim(i, this.pos);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public Object readNumber(boolean[] zArr) {
        int i = this.pos;
        read();
        skipDigits();
        char c = this.c;
        if (c != '.' && c != 'E' && c != 'e') {
            skipSpace();
            char c2 = this.c;
            if (c2 < 0 || c2 >= '~' || zArr[c2] || c2 == 26) {
                extractStringTrim(i, this.pos);
                return parseNumber(this.xs);
            }
            skipNQString(zArr);
            extractStringTrim(i, this.pos);
            if (this.acceptNonQuote) {
                return this.xs;
            }
            throw new ParseException(this.pos, 1, this.xs);
        }
        if (c == '.') {
            read();
            skipDigits();
        }
        char c3 = this.c;
        if (c3 != 'E' && c3 != 'e') {
            skipSpace();
            char c4 = this.c;
            if (c4 < 0 || c4 >= '~' || zArr[c4] || c4 == 26) {
                extractStringTrim(i, this.pos);
                return extractFloat();
            }
            skipNQString(zArr);
            extractStringTrim(i, this.pos);
            if (this.acceptNonQuote) {
                return this.xs;
            }
            throw new ParseException(this.pos, 1, this.xs);
        }
        this.sb.append('E');
        read();
        char c5 = this.c;
        if (c5 != '+' && c5 != '-' && (c5 < '0' || c5 > '9')) {
            skipNQString(zArr);
            extractStringTrim(i, this.pos);
            if (!this.acceptNonQuote) {
                throw new ParseException(this.pos, 1, this.xs);
            }
            if (!this.acceptLeadinZero) {
                checkLeadinZero();
            }
            return this.xs;
        }
        this.sb.append(c5);
        read();
        skipDigits();
        skipSpace();
        char c6 = this.c;
        if (c6 < 0 || c6 >= '~' || zArr[c6] || c6 == 26) {
            extractStringTrim(i, this.pos);
            return extractFloat();
        }
        skipNQString(zArr);
        extractStringTrim(i, this.pos);
        if (this.acceptNonQuote) {
            return this.xs;
        }
        throw new ParseException(this.pos, 1, this.xs);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public void readString() {
        if (!this.acceptSimpleQuote && this.c == '\'') {
            if (!this.acceptNonQuote) {
                throw new ParseException(this.pos, 0, Character.valueOf(this.c));
            }
            readNQString(JSONParserBase.stopAll);
            return;
        }
        int indexOf = indexOf(this.c, this.pos + 1);
        if (indexOf == -1) {
            throw new ParseException(this.len, 3, null);
        }
        extractString(this.pos + 1, indexOf);
        if (this.xs.indexOf(92) != -1) {
            this.sb.clear();
            readString2();
        } else {
            checkControleChar();
            this.pos = indexOf;
            read();
        }
    }
}
