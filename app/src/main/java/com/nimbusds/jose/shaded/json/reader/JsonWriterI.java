package com.nimbusds.jose.shaded.json.reader;

import com.nimbusds.jose.shaded.json.JSONStyle;

/* loaded from: classes2.dex */
public interface JsonWriterI<T> {
    <E extends T> void writeJSONString(E e, Appendable appendable, JSONStyle jSONStyle);
}
