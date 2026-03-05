package com.nimbusds.jose.shaded.json;

import com.nimbusds.jose.shaded.json.reader.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class JSONArray extends ArrayList<Object> implements List<Object>, JSONAwareEx, JSONStreamAwareEx {
    public static String toJSONString(List<? extends Object> list, JSONStyle jSONStyle) {
        StringBuilder sb = new StringBuilder();
        try {
            writeJSONString(list, sb, jSONStyle);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public static void writeJSONString(Iterable<? extends Object> iterable, Appendable appendable, JSONStyle jSONStyle) {
        if (iterable == null) {
            appendable.append("null");
        } else {
            JsonWriter.JSONIterableWriter.writeJSONString(iterable, appendable, jSONStyle);
        }
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return toJSONString();
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStreamAware
    public void writeJSONString(Appendable appendable) {
        writeJSONString(this, appendable, JSONValue.COMPRESSION);
    }

    @Override // com.nimbusds.jose.shaded.json.JSONAware
    public String toJSONString() {
        return toJSONString(this, JSONValue.COMPRESSION);
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStreamAwareEx
    public void writeJSONString(Appendable appendable, JSONStyle jSONStyle) {
        writeJSONString(this, appendable, jSONStyle);
    }

    @Override // com.nimbusds.jose.shaded.json.JSONAwareEx
    public String toJSONString(JSONStyle jSONStyle) {
        return toJSONString(this, jSONStyle);
    }
}
