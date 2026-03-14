package com.nimbusds.jose.shaded.json.reader;

import com.nimbusds.jose.shaded.json.JSONStyle;
import com.nimbusds.jose.shaded.json.JSONUtil;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class BeansWriter implements JsonWriterI<Object> {
    @Override // com.nimbusds.jose.shaded.json.reader.JsonWriterI
    public <E> void writeJSONString(E e, Appendable appendable, JSONStyle jSONStyle) throws IOException {
        Method method;
        Object invoke = null;
        Class<?> type;
        try {
            jSONStyle.objectStart(appendable);
            boolean z = false;
            for (Class<?> cls = e.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
                for (Field field : cls.getDeclaredFields()) {
                    int modifiers = field.getModifiers();
                    if ((modifiers & 152) <= 0) {
                        if ((modifiers & 1) > 0) {
                            invoke = field.get(e);
                        } else {
                            try {
                                method = cls.getDeclaredMethod(JSONUtil.getGetterName(field.getName()), null);
                            } catch (Exception unused) {
                                method = null;
                            }
                            if (method == null && ((type = field.getType()) == Boolean.TYPE || type == Boolean.class)) {
                                method = cls.getDeclaredMethod(JSONUtil.getIsName(field.getName()), null);
                            }
                            if (method != null) {
                                invoke = method.invoke(e, null);
                            }
                        }
                        if (invoke != null || !jSONStyle.ignoreNull()) {
                            if (z) {
                                jSONStyle.objectNext(appendable);
                            } else {
                                z = true;
                            }
                            JsonWriter.writeJSONKV(field.getName(), invoke, appendable, jSONStyle);
                        }
                    }
                }
            }
            jSONStyle.objectStop(appendable);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
