package com.nimbusds.jose.shaded.json.reader;

import com.nimbusds.jose.shaded.asm.BeansAccess;
import com.nimbusds.jose.shaded.json.JSONStyle;
import com.nimbusds.jose.shaded.json.JSONUtil;
import java.io.IOException;

/* loaded from: classes2.dex */
public class BeansWriterASM implements JsonWriterI<Object> {
    @Override // com.nimbusds.jose.shaded.json.reader.JsonWriterI
    public <E> void writeJSONString(E e, Appendable appendable, JSONStyle jSONStyle) throws IOException {
        BeansAccess.get(e.getClass(), JSONUtil.JSON_SMART_FIELD_FILTER);
        appendable.append('{');
        throw null;
    }
}
