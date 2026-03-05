package com.nimbusds.jose.shaded.asm;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
class DynamicClassLoader extends ClassLoader {
    private static final String BEAN_AC = BeansAccess.class.getName();
    private static final Class<?>[] DEF_CLASS_SIG;

    static {
        Class cls = Integer.TYPE;
        DEF_CLASS_SIG = new Class[]{String.class, byte[].class, cls, cls};
    }

    public DynamicClassLoader(ClassLoader classLoader) {
        super(classLoader);
    }

    public Class<?> defineClass(String str, byte[] bArr) {
        try {
            Method declaredMethod = ClassLoader.class.getDeclaredMethod("defineClass", DEF_CLASS_SIG);
            declaredMethod.setAccessible(true);
            return (Class) declaredMethod.invoke(getParent(), str, bArr, 0, Integer.valueOf(bArr.length));
        } catch (Exception unused) {
            return defineClass(str, bArr, 0, bArr.length);
        }
    }

    @Override // java.lang.ClassLoader
    public synchronized Class<?> loadClass(String str, boolean z) {
        if (str.equals(BEAN_AC)) {
            return BeansAccess.class;
        }
        return super.loadClass(str, z);
    }
}
