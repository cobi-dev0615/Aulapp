package com.nimbusds.jose.shaded.json;

import com.nimbusds.jose.shaded.json.JStylerObj;
import java.io.IOException;
import kotlin.text.Typography;

/* loaded from: classes2.dex */
public class JSONStyle {
    private boolean _ignore_null;
    private boolean _protect4Web;
    private boolean _protectKeys;
    private boolean _protectValues;
    private JStylerObj.StringProtector esc;
    private JStylerObj.MustProtect mpKey;
    private JStylerObj.MustProtect mpValue;
    public static final JSONStyle NO_COMPRESS = new JSONStyle(0);
    public static final JSONStyle MAX_COMPRESS = new JSONStyle(-1);
    public static final JSONStyle LT_COMPRESS = new JSONStyle(2);

    public JSONStyle(int i) {
        boolean z = (i & 1) == 0;
        this._protectKeys = z;
        boolean z2 = (i & 4) == 0;
        this._protectValues = z2;
        boolean z3 = (i & 2) == 0;
        this._protect4Web = z3;
        this._ignore_null = (i & 16) > 0;
        JStylerObj.MustProtect mustProtect = (i & 8) > 0 ? JStylerObj.MP_AGGRESIVE : JStylerObj.MP_SIMPLE;
        if (z2) {
            this.mpValue = JStylerObj.MP_TRUE;
        } else {
            this.mpValue = mustProtect;
        }
        if (z) {
            this.mpKey = JStylerObj.MP_TRUE;
        } else {
            this.mpKey = mustProtect;
        }
        if (z3) {
            this.esc = JStylerObj.ESCAPE4Web;
        } else {
            this.esc = JStylerObj.ESCAPE_LT;
        }
    }

    public void arrayNextElm(Appendable appendable) throws IOException {
        appendable.append(',');
    }

    public void arrayObjectEnd(Appendable appendable) {
    }

    public void arrayStart(Appendable appendable) throws IOException {
        appendable.append('[');
    }

    public void arrayStop(Appendable appendable) throws IOException {
        appendable.append(']');
    }

    public void arrayfirstObject(Appendable appendable) {
    }

    public void escape(String str, Appendable appendable) {
        this.esc.escape(str, appendable);
    }

    public boolean ignoreNull() {
        return this._ignore_null;
    }

    public boolean mustProtectKey(String str) {
        return this.mpKey.mustBeProtect(str);
    }

    public boolean mustProtectValue(String str) {
        return this.mpValue.mustBeProtect(str);
    }

    public void objectElmStop(Appendable appendable) {
    }

    public void objectEndOfKey(Appendable appendable) throws IOException {
        appendable.append(':');
    }

    public void objectFirstStart(Appendable appendable) {
    }

    public void objectNext(Appendable appendable) throws IOException {
        appendable.append(',');
    }

    public void objectStart(Appendable appendable) throws IOException {
        appendable.append('{');
    }

    public void objectStop(Appendable appendable) throws IOException {
        appendable.append('}');
    }

    public void writeString(Appendable appendable, String str) throws IOException {
        if (!mustProtectValue(str)) {
            appendable.append(str);
            return;
        }
        appendable.append(Typography.quote);
        JSONValue.escape(str, appendable, this);
        appendable.append(Typography.quote);
    }
}
