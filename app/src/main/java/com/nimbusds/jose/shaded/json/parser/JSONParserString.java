package com.nimbusds.jose.shaded.json.parser;

import com.nimbusds.jose.shaded.json.JSONValue;
import com.nimbusds.jose.shaded.json.writer.JsonReaderI;

/* loaded from: classes2.dex */
class JSONParserString extends JSONParserMemory {
    private String in;

    public JSONParserString(int i) {
        super(i);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserMemory
    public void extractString(int i, int i2) {
        this.xs = this.in.substring(i, i2);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserMemory
    public void extractStringTrim(int i, int i2) {
        while (i < i2 - 1 && Character.isWhitespace(this.in.charAt(i))) {
            i++;
        }
        while (true) {
            int i3 = i2 - 1;
            if (i3 <= i || !Character.isWhitespace(this.in.charAt(i3))) {
                break;
            } else {
                i2--;
            }
        }
        extractString(i, i2);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserMemory
    public int indexOf(char c, int i) {
        return this.in.indexOf(c, i);
    }

    public Object parse(String str) throws ParseException {
        return parse(str, JSONValue.defaultReader.DEFAULT);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public void read() {
        int i = this.pos + 1;
        this.pos = i;
        if (i >= this.len) {
            this.c = (char) 26;
        } else {
            this.c = this.in.charAt(i);
        }
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public void readNoEnd() throws ParseException {
        int i = this.pos + 1;
        this.pos = i;
        if (i < this.len) {
            this.c = this.in.charAt(i);
        } else {
            this.c = (char) 26;
            throw new ParseException(this.pos - 1, 3, "EOF");
        }
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public void readS() {
        int i = this.pos + 1;
        this.pos = i;
        if (i >= this.len) {
            this.c = (char) 26;
        } else {
            this.c = this.in.charAt(i);
        }
    }

    public <T> T parse(String str, JsonReaderI<T> jsonReaderI) throws ParseException {
        this.base = jsonReaderI.base;
        this.in = str;
        this.len = str.length();
        return (T) parse(jsonReaderI);
    }
}
