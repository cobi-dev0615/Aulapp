package com.nimbusds.jose.shaded.json.parser;

/* loaded from: classes2.dex */
public class JSONParser {
    public static int DEFAULT_PERMISSIVE_MODE;
    private int mode;
    private JSONParserString pString;

    static {
        DEFAULT_PERMISSIVE_MODE = System.getProperty("JSON_SMART_SIMPLE") != null ? 4032 : -1;
    }

    public JSONParser(int i) {
        this.mode = i;
    }

    private JSONParserString getPString() {
        if (this.pString == null) {
            this.pString = new JSONParserString(this.mode);
        }
        return this.pString;
    }

    public Object parse(String str) {
        return getPString().parse(str);
    }
}
