package com.nimbusds.jose.shaded.json;

import com.nimbusds.jose.shaded.json.reader.JsonWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class JSONObject extends HashMap<String, Object> implements JSONAwareEx, JSONStreamAwareEx {
    public static String toJSONString(Map<String, ? extends Object> map) {
        return toJSONString(map, JSONValue.COMPRESSION);
    }

    public static void writeJSON(Map<String, ? extends Object> map, Appendable appendable, JSONStyle jSONStyle) {
        if (map == null) {
            appendable.append("null");
        } else {
            JsonWriter.JSONMapWriter.writeJSONString(map, appendable, jSONStyle);
        }
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return toJSONString(this, JSONValue.COMPRESSION);
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStreamAware
    public void writeJSONString(Appendable appendable) {
        writeJSON(this, appendable, JSONValue.COMPRESSION);
    }

    public static String toJSONString(Map<String, ? extends Object> map, JSONStyle jSONStyle) {
        StringBuilder sb = new StringBuilder();
        try {
            writeJSON(map, sb, jSONStyle);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    @Override // com.nimbusds.jose.shaded.json.JSONStreamAwareEx
    public void writeJSONString(Appendable appendable, JSONStyle jSONStyle) {
        writeJSON(this, appendable, jSONStyle);
    }

    @Override // com.nimbusds.jose.shaded.json.JSONAware
    public String toJSONString() {
        return toJSONString(this, JSONValue.COMPRESSION);
    }

    @Override // com.nimbusds.jose.shaded.json.JSONAwareEx
    public String toJSONString(JSONStyle jSONStyle) {
        return toJSONString(this, jSONStyle);
    }
}
