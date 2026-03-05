package com.nimbusds.jose.shaded.asm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public class Accessor {
    protected Field field;
    protected String fieldName;
    protected Type genericType;
    protected Method getter;
    protected Method setter;
    protected Class<?> type;

    public Accessor(Class<?> cls, Field field, FieldFilter fieldFilter) {
        this.fieldName = field.getName();
        int modifiers = field.getModifiers();
        if ((modifiers & 136) > 0) {
            return;
        }
        if ((modifiers & 1) > 0) {
            this.field = field;
        }
        try {
            this.setter = cls.getDeclaredMethod(ASMUtil.getSetterName(field.getName()), field.getType());
        } catch (Exception unused) {
        }
        boolean equals = field.getType().equals(Boolean.TYPE);
        try {
            this.getter = cls.getDeclaredMethod(equals ? ASMUtil.getIsName(field.getName()) : ASMUtil.getGetterName(field.getName()), null);
        } catch (Exception unused2) {
        }
        if (this.getter == null && equals) {
            try {
                this.getter = cls.getDeclaredMethod(ASMUtil.getGetterName(field.getName()), null);
            } catch (Exception unused3) {
            }
        }
        if (this.field == null && this.getter == null && this.setter == null) {
            return;
        }
        Method method = this.getter;
        if (method != null && !fieldFilter.canUse(field, method)) {
            this.getter = null;
        }
        Method method2 = this.setter;
        if (method2 != null && !fieldFilter.canUse(field, method2)) {
            this.setter = null;
        }
        if (this.getter == null && this.setter == null && this.field == null) {
            return;
        }
        this.type = field.getType();
        this.genericType = field.getGenericType();
    }

    public String getName() {
        return this.fieldName;
    }

    public Class<?> getType() {
        return this.type;
    }

    public boolean isEnum() {
        return this.type.isEnum();
    }

    public boolean isPublic() {
        return this.setter == null && this.getter == null;
    }

    public boolean isReadable() {
        return (this.field == null && this.getter == null) ? false : true;
    }

    public boolean isUsable() {
        return (this.field == null && this.getter == null && this.setter == null) ? false : true;
    }

    public boolean isWritable() {
        return (this.field == null && this.getter == null) ? false : true;
    }
}
