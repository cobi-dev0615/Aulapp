package com.nimbusds.jose.shaded.asm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public interface FieldFilter {
    boolean canUse(Field field, Method method);
}
