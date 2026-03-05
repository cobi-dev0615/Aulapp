package com.nimbusds.jose.shaded.ow2asm;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class Type {
    private final int sort;
    private final int valueBegin;
    private final String valueBuffer;
    private final int valueEnd;
    public static final Type VOID_TYPE = new Type(0, "VZCBSIFJD", 0, 1);
    public static final Type BOOLEAN_TYPE = new Type(1, "VZCBSIFJD", 1, 2);
    public static final Type CHAR_TYPE = new Type(2, "VZCBSIFJD", 2, 3);
    public static final Type BYTE_TYPE = new Type(3, "VZCBSIFJD", 3, 4);
    public static final Type SHORT_TYPE = new Type(4, "VZCBSIFJD", 4, 5);
    public static final Type INT_TYPE = new Type(5, "VZCBSIFJD", 5, 6);
    public static final Type FLOAT_TYPE = new Type(6, "VZCBSIFJD", 6, 7);
    public static final Type LONG_TYPE = new Type(7, "VZCBSIFJD", 7, 8);
    public static final Type DOUBLE_TYPE = new Type(8, "VZCBSIFJD", 8, 9);

    private Type(int i, String str, int i2, int i3) {
        this.sort = i;
        this.valueBuffer = str;
        this.valueBegin = i2;
        this.valueEnd = i3;
    }

    private static void appendDescriptor(Class<?> cls, StringBuilder sb) {
        char c;
        while (cls.isArray()) {
            sb.append('[');
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive()) {
            sb.append('L');
            sb.append(getInternalName(cls));
            sb.append(';');
            return;
        }
        if (cls == Integer.TYPE) {
            c = 'I';
        } else if (cls == Void.TYPE) {
            c = 'V';
        } else if (cls == Boolean.TYPE) {
            c = 'Z';
        } else if (cls == Byte.TYPE) {
            c = 'B';
        } else if (cls == Character.TYPE) {
            c = 'C';
        } else if (cls == Short.TYPE) {
            c = 'S';
        } else if (cls == Double.TYPE) {
            c = 'D';
        } else if (cls == Float.TYPE) {
            c = 'F';
        } else {
            if (cls != Long.TYPE) {
                throw new AssertionError();
            }
            c = 'J';
        }
        sb.append(c);
    }

    public static Type[] getArgumentTypes(String str) {
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        while (str.charAt(i3) != ')') {
            while (str.charAt(i3) == '[') {
                i3++;
            }
            int i4 = i3 + 1;
            i3 = str.charAt(i3) == 'L' ? Math.max(i4, str.indexOf(59, i4) + 1) : i4;
            i2++;
        }
        Type[] typeArr = new Type[i2];
        int i5 = 1;
        while (str.charAt(i5) != ')') {
            int i6 = i5;
            while (str.charAt(i6) == '[') {
                i6++;
            }
            int i7 = i6 + 1;
            if (str.charAt(i6) == 'L') {
                i7 = Math.max(i7, str.indexOf(59, i7) + 1);
            }
            typeArr[i] = getTypeInternal(str, i5, i7);
            i++;
            i5 = i7;
        }
        return typeArr;
    }

    public static int getArgumentsAndReturnSizes(String str) {
        char charAt = str.charAt(1);
        int i = 1;
        int i2 = 1;
        while (charAt != ')') {
            if (charAt == 'J' || charAt == 'D') {
                i++;
                i2 += 2;
            } else {
                while (str.charAt(i) == '[') {
                    i++;
                }
                int i3 = i + 1;
                if (str.charAt(i) == 'L') {
                    i3 = Math.max(i3, str.indexOf(59, i3) + 1);
                }
                i2++;
                i = i3;
            }
            charAt = str.charAt(i);
        }
        char charAt2 = str.charAt(i + 1);
        if (charAt2 == 'V') {
            return i2 << 2;
        }
        return (i2 << 2) | ((charAt2 == 'J' || charAt2 == 'D') ? 2 : 1);
    }

    public static String getMethodDescriptor(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        for (Class<?> cls : method.getParameterTypes()) {
            appendDescriptor(cls, sb);
        }
        sb.append(')');
        appendDescriptor(method.getReturnType(), sb);
        return sb.toString();
    }

    public static Type getMethodType(String str) {
        return new Type(11, str, 0, str.length());
    }

    public static Type getObjectType(String str) {
        return new Type(str.charAt(0) == '[' ? 9 : 12, str, 0, str.length());
    }

    public static int getReturnTypeOffset(String str) {
        int i = 1;
        while (str.charAt(i) != ')') {
            while (str.charAt(i) == '[') {
                i++;
            }
            int i2 = i + 1;
            i = str.charAt(i) == 'L' ? Math.max(i2, str.indexOf(59, i2) + 1) : i2;
        }
        return i + 1;
    }

    public static Type getType(String str) {
        return getTypeInternal(str, 0, str.length());
    }

    private static Type getTypeInternal(String str, int i, int i2) {
        char charAt = str.charAt(i);
        if (charAt == '(') {
            return new Type(11, str, i, i2);
        }
        if (charAt == 'F') {
            return FLOAT_TYPE;
        }
        if (charAt == 'L') {
            return new Type(10, str, i + 1, i2 - 1);
        }
        if (charAt == 'S') {
            return SHORT_TYPE;
        }
        if (charAt == 'V') {
            return VOID_TYPE;
        }
        if (charAt == 'I') {
            return INT_TYPE;
        }
        if (charAt == 'J') {
            return LONG_TYPE;
        }
        if (charAt == 'Z') {
            return BOOLEAN_TYPE;
        }
        if (charAt == '[') {
            return new Type(9, str, i, i2);
        }
        switch (charAt) {
            case 'B':
                return BYTE_TYPE;
            case 'C':
                return CHAR_TYPE;
            case 'D':
                return DOUBLE_TYPE;
            default:
                throw new IllegalArgumentException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Type)) {
            return false;
        }
        Type type = (Type) obj;
        int i = this.sort;
        if (i == 12) {
            i = 10;
        }
        int i2 = type.sort;
        if (i != (i2 != 12 ? i2 : 10)) {
            return false;
        }
        int i3 = this.valueBegin;
        int i4 = this.valueEnd;
        int i5 = type.valueBegin;
        if (i4 - i3 != type.valueEnd - i5) {
            return false;
        }
        while (i3 < i4) {
            if (this.valueBuffer.charAt(i3) != type.valueBuffer.charAt(i5)) {
                return false;
            }
            i3++;
            i5++;
        }
        return true;
    }

    public String getDescriptor() {
        int i = this.sort;
        if (i == 10) {
            return this.valueBuffer.substring(this.valueBegin - 1, this.valueEnd + 1);
        }
        if (i != 12) {
            return this.valueBuffer.substring(this.valueBegin, this.valueEnd);
        }
        return "L" + this.valueBuffer.substring(this.valueBegin, this.valueEnd) + ';';
    }

    public String getInternalName() {
        return this.valueBuffer.substring(this.valueBegin, this.valueEnd);
    }

    public int getSort() {
        int i = this.sort;
        if (i == 12) {
            return 10;
        }
        return i;
    }

    public int hashCode() {
        int i = this.sort;
        int i2 = (i == 12 ? 10 : i) * 13;
        if (i >= 9) {
            int i3 = this.valueEnd;
            for (int i4 = this.valueBegin; i4 < i3; i4++) {
                i2 = (this.valueBuffer.charAt(i4) + i2) * 17;
            }
        }
        return i2;
    }

    public String toString() {
        return getDescriptor();
    }

    public static String getInternalName(Class<?> cls) {
        return cls.getName().replace('.', '/');
    }

    public static Type getType(Class<?> cls) {
        if (!cls.isPrimitive()) {
            return getType(getDescriptor(cls));
        }
        if (cls == Integer.TYPE) {
            return INT_TYPE;
        }
        if (cls == Void.TYPE) {
            return VOID_TYPE;
        }
        if (cls == Boolean.TYPE) {
            return BOOLEAN_TYPE;
        }
        if (cls == Byte.TYPE) {
            return BYTE_TYPE;
        }
        if (cls == Character.TYPE) {
            return CHAR_TYPE;
        }
        if (cls == Short.TYPE) {
            return SHORT_TYPE;
        }
        if (cls == Double.TYPE) {
            return DOUBLE_TYPE;
        }
        if (cls == Float.TYPE) {
            return FLOAT_TYPE;
        }
        if (cls == Long.TYPE) {
            return LONG_TYPE;
        }
        throw new AssertionError();
    }

    public static String getDescriptor(Class<?> cls) {
        StringBuilder sb = new StringBuilder();
        appendDescriptor(cls, sb);
        return sb.toString();
    }
}
