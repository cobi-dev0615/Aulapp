package com.nimbusds.jose.shaded.asm;

import co.ceduladigital.sdk.q;
import defpackage.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class BeansAccess<T> {
    private static ConcurrentHashMap<Class<?>, BeansAccess<?>> cache = new ConcurrentHashMap<>();

    public static <P> BeansAccess<P> get(Class<P> cls, FieldFilter fieldFilter) {
        Class<?> cls2;
        if (cache.get(cls) != null) {
            throw new ClassCastException();
        }
        Accessor[] accessors = ASMUtil.getAccessors(cls, fieldFilter);
        String name = cls.getName();
        String m = name.startsWith("java.util.") ? a.m("com.nimbusds.jose.shaded.asm.", name, "AccAccess") : name.concat("AccAccess");
        DynamicClassLoader dynamicClassLoader = new DynamicClassLoader(cls.getClassLoader());
        try {
            cls2 = dynamicClassLoader.loadClass(m);
        } catch (ClassNotFoundException unused) {
            cls2 = null;
        }
        LinkedList<Class<?>> parents = getParents(cls);
        if (cls2 == null) {
            BeansAccessBuilder beansAccessBuilder = new BeansAccessBuilder(cls, accessors, dynamicClassLoader);
            Iterator<Class<?>> it = parents.iterator();
            while (it.hasNext()) {
                beansAccessBuilder.addConversion(BeansAccessConfig.classMapper.get(it.next()));
            }
            cls2 = beansAccessBuilder.bulid();
        }
        try {
            if (cls2.newInstance() == null) {
                throw null;
            }
            throw new ClassCastException();
        } catch (Exception e) {
            throw new RuntimeException(q.i("Error constructing accessor class: ", m), e);
        }
    }

    private static LinkedList<Class<?>> getParents(Class<?> cls) {
        LinkedList<Class<?>> linkedList = new LinkedList<>();
        while (cls != null && !cls.equals(Object.class)) {
            linkedList.addLast(cls);
            for (Class<?> cls2 : cls.getInterfaces()) {
                linkedList.addLast(cls2);
            }
            cls = cls.getSuperclass();
        }
        linkedList.addLast(Object.class);
        return linkedList;
    }
}
