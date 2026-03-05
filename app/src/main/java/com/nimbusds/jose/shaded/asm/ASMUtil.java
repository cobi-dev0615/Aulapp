package com.nimbusds.jose.shaded.asm;

import com.nimbusds.jose.shaded.ow2asm.Label;
import com.nimbusds.jose.shaded.ow2asm.MethodVisitor;
import com.nimbusds.jose.shaded.ow2asm.Type;
import java.lang.reflect.Field;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class ASMUtil {
    public static void autoBoxing(MethodVisitor methodVisitor, Type type) {
        switch (type.getSort()) {
            case 1:
                methodVisitor.visitMethodInsn(184, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
                break;
            case 2:
                methodVisitor.visitMethodInsn(184, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
                break;
            case 3:
                methodVisitor.visitMethodInsn(184, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;", false);
                break;
            case 4:
                methodVisitor.visitMethodInsn(184, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;", false);
                break;
            case 5:
                methodVisitor.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
                break;
            case 6:
                methodVisitor.visitMethodInsn(184, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;", false);
                break;
            case 7:
                methodVisitor.visitMethodInsn(184, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
                break;
            case 8:
                methodVisitor.visitMethodInsn(184, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;", false);
                break;
        }
    }

    public static Accessor[] getAccessors(Class<?> cls, FieldFilter fieldFilter) {
        HashMap hashMap = new HashMap();
        if (fieldFilter == null) {
            fieldFilter = BasicFiledFilter.SINGLETON;
        }
        while (cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                String name = field.getName();
                if (!hashMap.containsKey(name)) {
                    Accessor accessor = new Accessor(cls, field, fieldFilter);
                    if (accessor.isUsable()) {
                        hashMap.put(name, accessor);
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return (Accessor[]) hashMap.values().toArray(new Accessor[hashMap.size()]);
    }

    public static String getGetterName(String str) {
        int length = str.length();
        char[] cArr = new char[length + 3];
        cArr[0] = 'g';
        cArr[1] = 'e';
        cArr[2] = 't';
        char charAt = str.charAt(0);
        if (charAt >= 'a' && charAt <= 'z') {
            charAt = (char) (charAt - ' ');
        }
        cArr[3] = charAt;
        for (int i = 1; i < length; i++) {
            cArr[i + 3] = str.charAt(i);
        }
        return new String(cArr);
    }

    public static String getIsName(String str) {
        int length = str.length();
        char[] cArr = new char[length + 2];
        cArr[0] = 'i';
        cArr[1] = 's';
        char charAt = str.charAt(0);
        if (charAt >= 'a' && charAt <= 'z') {
            charAt = (char) (charAt - ' ');
        }
        cArr[2] = charAt;
        for (int i = 1; i < length; i++) {
            cArr[i + 2] = str.charAt(i);
        }
        return new String(cArr);
    }

    public static String getSetterName(String str) {
        int length = str.length();
        char[] cArr = new char[length + 3];
        cArr[0] = 's';
        cArr[1] = 'e';
        cArr[2] = 't';
        char charAt = str.charAt(0);
        if (charAt >= 'a' && charAt <= 'z') {
            charAt = (char) (charAt - ' ');
        }
        cArr[3] = charAt;
        for (int i = 1; i < length; i++) {
            cArr[i + 3] = str.charAt(i);
        }
        return new String(cArr);
    }

    public static Label[] newLabels(int i) {
        Label[] labelArr = new Label[i];
        for (int i2 = 0; i2 < i; i2++) {
            labelArr[i2] = new Label();
        }
        return labelArr;
    }
}
