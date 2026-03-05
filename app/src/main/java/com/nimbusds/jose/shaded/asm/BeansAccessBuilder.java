package com.nimbusds.jose.shaded.asm;

import co.ceduladigital.sdk.q;
import com.nimbusds.jose.shaded.ow2asm.ClassWriter;
import com.nimbusds.jose.shaded.ow2asm.Label;
import com.nimbusds.jose.shaded.ow2asm.MethodVisitor;
import com.nimbusds.jose.shaded.ow2asm.Type;
import defpackage.a;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class BeansAccessBuilder {
    private static String METHOD_ACCESS_NAME = Type.getInternalName(BeansAccess.class);
    final String accessClassName;
    final String accessClassNameInternal;
    final Accessor[] accs;
    final String className;
    final String classNameInternal;
    final HashMap<Class<?>, Method> convMtds = new HashMap<>();
    Class<? extends Exception> exceptionClass = NoSuchFieldException.class;
    final DynamicClassLoader loader;
    final Class<?> type;

    public BeansAccessBuilder(Class<?> cls, Accessor[] accessorArr, DynamicClassLoader dynamicClassLoader) {
        this.type = cls;
        this.accs = accessorArr;
        this.loader = dynamicClassLoader;
        String name = cls.getName();
        this.className = name;
        if (name.startsWith("java.")) {
            this.accessClassName = a.m("com.nimbusds.jose.shaded.asm.", name, "AccAccess");
        } else {
            this.accessClassName = name.concat("AccAccess");
        }
        this.accessClassNameInternal = this.accessClassName.replace('.', '/');
        this.classNameInternal = name.replace('.', '/');
    }

    private void ifNotEqJmp(MethodVisitor methodVisitor, int i, int i2, Label label) {
        methodVisitor.visitVarInsn(21, i);
        if (i2 == 0) {
            methodVisitor.visitJumpInsn(154, label);
            return;
        }
        if (i2 == 1) {
            methodVisitor.visitInsn(4);
            methodVisitor.visitJumpInsn(160, label);
            return;
        }
        if (i2 == 2) {
            methodVisitor.visitInsn(5);
            methodVisitor.visitJumpInsn(160, label);
            return;
        }
        if (i2 == 3) {
            methodVisitor.visitInsn(6);
            methodVisitor.visitJumpInsn(160, label);
            return;
        }
        if (i2 == 4) {
            methodVisitor.visitInsn(7);
            methodVisitor.visitJumpInsn(160, label);
        } else if (i2 == 5) {
            methodVisitor.visitInsn(8);
            methodVisitor.visitJumpInsn(160, label);
        } else {
            if (i2 < 6) {
                throw new RuntimeException("non supported negative values");
            }
            methodVisitor.visitIntInsn(16, i2);
            methodVisitor.visitJumpInsn(160, label);
        }
    }

    private void internalSetFiled(MethodVisitor methodVisitor, Accessor accessor) {
        Method method;
        MethodVisitor methodVisitor2 = methodVisitor;
        methodVisitor2.visitVarInsn(25, 1);
        methodVisitor2.visitTypeInsn(192, this.classNameInternal);
        methodVisitor2.visitVarInsn(25, 3);
        Type type = Type.getType(accessor.getType());
        Class<?> type2 = accessor.getType();
        String internalName = Type.getInternalName(type2);
        Method method2 = this.convMtds.get(type2);
        if (method2 != null) {
            methodVisitor2.visitMethodInsn(184, Type.getInternalName(method2.getDeclaringClass()), method2.getName(), Type.getMethodDescriptor(method2), false);
        } else if (accessor.isEnum()) {
            Label label = new Label();
            methodVisitor2.visitJumpInsn(198, label);
            methodVisitor2.visitVarInsn(25, 3);
            methodVisitor2.visitMethodInsn(182, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
            methodVisitor2 = methodVisitor;
            methodVisitor2.visitMethodInsn(184, internalName, "valueOf", a.m("(Ljava/lang/String;)L", internalName, ";"), false);
            methodVisitor2.visitVarInsn(58, 3);
            methodVisitor2.visitLabel(label);
            methodVisitor2.visitFrame(3, 0, null, 0, null);
            methodVisitor2.visitVarInsn(25, 1);
            methodVisitor2.visitTypeInsn(192, this.classNameInternal);
            methodVisitor2.visitVarInsn(25, 3);
            methodVisitor2.visitTypeInsn(192, internalName);
        } else if (type2.equals(String.class)) {
            Label label2 = new Label();
            methodVisitor2.visitJumpInsn(198, label2);
            methodVisitor2.visitVarInsn(25, 3);
            methodVisitor2.visitMethodInsn(182, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
            methodVisitor2.visitVarInsn(58, 3);
            methodVisitor2.visitLabel(label2);
            methodVisitor2.visitFrame(3, 0, null, 0, null);
            methodVisitor2.visitVarInsn(25, 1);
            methodVisitor2.visitTypeInsn(192, this.classNameInternal);
            methodVisitor2.visitVarInsn(25, 3);
            methodVisitor2.visitTypeInsn(192, internalName);
        } else {
            methodVisitor2.visitTypeInsn(192, internalName);
        }
        if (accessor.isPublic() || (method = accessor.setter) == null) {
            methodVisitor2.visitFieldInsn(181, this.classNameInternal, accessor.getName(), type.getDescriptor());
        } else {
            methodVisitor2.visitMethodInsn(182, this.classNameInternal, accessor.setter.getName(), Type.getMethodDescriptor(method), false);
        }
        methodVisitor2.visitInsn(177);
    }

    private void throwExIntParam(MethodVisitor methodVisitor, Class<?> cls) {
        String internalName = Type.getInternalName(cls);
        methodVisitor.visitTypeInsn(187, internalName);
        methodVisitor.visitInsn(89);
        methodVisitor.visitLdcInsn("mapping " + this.className + " failed to map field:");
        methodVisitor.visitVarInsn(21, 2);
        methodVisitor.visitMethodInsn(184, "java/lang/Integer", "toString", "(I)Ljava/lang/String;", false);
        methodVisitor.visitMethodInsn(182, "java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", false);
        methodVisitor.visitMethodInsn(183, internalName, "<init>", "(Ljava/lang/String;)V", false);
        methodVisitor.visitInsn(191);
    }

    private void throwExStrParam(MethodVisitor methodVisitor, Class<?> cls) {
        String internalName = Type.getInternalName(cls);
        methodVisitor.visitTypeInsn(187, internalName);
        methodVisitor.visitInsn(89);
        methodVisitor.visitLdcInsn("mapping " + this.className + " failed to map field:");
        methodVisitor.visitVarInsn(25, 2);
        methodVisitor.visitMethodInsn(182, "java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", false);
        methodVisitor.visitMethodInsn(183, internalName, "<init>", "(Ljava/lang/String;)V", false);
        methodVisitor.visitInsn(191);
    }

    public void addConversion(Iterable<Class<?>> iterable) {
        if (iterable == null) {
            return;
        }
        Iterator<Class<?>> it = iterable.iterator();
        while (it.hasNext()) {
            addConversion(it.next());
        }
    }

    public Class<?> bulid() {
        Method method;
        Type type;
        Method method2;
        int i;
        int i2;
        int i3;
        Type type2;
        Method method3;
        int i4 = 1;
        ClassWriter classWriter = new ClassWriter(1);
        boolean z = this.accs.length > 10;
        classWriter.visit(50, 33, this.accessClassNameInternal, q.j(this.classNameInternal, ";>;", new StringBuilder("Lnet/minidev/asm/BeansAccess<L")), METHOD_ACCESS_NAME, null);
        MethodVisitor visitMethod = classWriter.visitMethod(1, "<init>", "()V", null, null);
        visitMethod.visitCode();
        visitMethod.visitVarInsn(25, 0);
        visitMethod.visitMethodInsn(183, METHOD_ACCESS_NAME, "<init>", "()V", false);
        visitMethod.visitInsn(177);
        visitMethod.visitMaxs(1, 1);
        visitMethod.visitEnd();
        MethodVisitor visitMethod2 = classWriter.visitMethod(1, "set", "(Ljava/lang/Object;ILjava/lang/Object;)V", null, null);
        visitMethod2.visitCode();
        Accessor[] accessorArr = this.accs;
        if (accessorArr.length != 0) {
            if (accessorArr.length > 14) {
                visitMethod2.visitVarInsn(21, 2);
                Label[] newLabels = ASMUtil.newLabels(this.accs.length);
                Label label = new Label();
                visitMethod2.visitTableSwitchInsn(0, newLabels.length - 1, label, newLabels);
                Accessor[] accessorArr2 = this.accs;
                int length = accessorArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length) {
                    Accessor accessor = accessorArr2[i5];
                    int i7 = i6 + 1;
                    visitMethod2.visitLabel(newLabels[i6]);
                    if (accessor.isWritable()) {
                        internalSetFiled(visitMethod2, accessor);
                    } else {
                        visitMethod2.visitInsn(177);
                    }
                    i5++;
                    i6 = i7;
                }
                visitMethod2.visitLabel(label);
            } else {
                Label[] newLabels2 = ASMUtil.newLabels(accessorArr.length);
                int i8 = 0;
                for (Accessor accessor2 : this.accs) {
                    ifNotEqJmp(visitMethod2, 2, i8, newLabels2[i8]);
                    internalSetFiled(visitMethod2, accessor2);
                    visitMethod2.visitLabel(newLabels2[i8]);
                    visitMethod2.visitFrame(3, 0, null, 0, null);
                    i8++;
                }
            }
        }
        Class<? extends Exception> cls = this.exceptionClass;
        if (cls != null) {
            throwExIntParam(visitMethod2, cls);
        } else {
            visitMethod2.visitInsn(177);
        }
        visitMethod2.visitMaxs(0, 0);
        visitMethod2.visitEnd();
        MethodVisitor visitMethod3 = classWriter.visitMethod(1, "get", "(Ljava/lang/Object;I)Ljava/lang/Object;", null, null);
        visitMethod3.visitCode();
        Accessor[] accessorArr3 = this.accs;
        int i9 = 192;
        if (accessorArr3.length == 0) {
            visitMethod3.visitFrame(3, 0, null, 0, null);
        } else if (accessorArr3.length > 14) {
            visitMethod3.visitVarInsn(21, 2);
            Label[] newLabels3 = ASMUtil.newLabels(this.accs.length);
            Label label2 = new Label();
            visitMethod3.visitTableSwitchInsn(0, newLabels3.length - 1, label2, newLabels3);
            Accessor[] accessorArr4 = this.accs;
            int length2 = accessorArr4.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length2) {
                Accessor accessor3 = accessorArr4[i10];
                int i12 = i11 + 1;
                visitMethod3.visitLabel(newLabels3[i11]);
                int i13 = i10;
                visitMethod3.visitFrame(3, 0, null, 0, null);
                if (accessor3.isReadable()) {
                    visitMethod3.visitVarInsn(25, i4);
                    visitMethod3.visitTypeInsn(i9, this.classNameInternal);
                    Type type3 = Type.getType(accessor3.getType());
                    if (accessor3.isPublic() || (method2 = accessor3.getter) == null) {
                        type = type3;
                        visitMethod3.visitFieldInsn(180, this.classNameInternal, accessor3.getName(), type.getDescriptor());
                    } else {
                        String methodDescriptor = Type.getMethodDescriptor(method2);
                        type = type3;
                        visitMethod3.visitMethodInsn(182, this.classNameInternal, accessor3.getter.getName(), methodDescriptor, false);
                    }
                    ASMUtil.autoBoxing(visitMethod3, type);
                    visitMethod3.visitInsn(176);
                } else {
                    visitMethod3.visitInsn(i4);
                    visitMethod3.visitInsn(176);
                }
                i10 = i13 + 1;
                i11 = i12;
                i9 = 192;
                i4 = 1;
            }
            visitMethod3.visitLabel(label2);
            visitMethod3.visitFrame(3, 0, null, 0, null);
        } else {
            Label[] newLabels4 = ASMUtil.newLabels(accessorArr3.length);
            int i14 = 0;
            for (Accessor accessor4 : this.accs) {
                ifNotEqJmp(visitMethod3, 2, i14, newLabels4[i14]);
                visitMethod3.visitVarInsn(25, 1);
                visitMethod3.visitTypeInsn(192, this.classNameInternal);
                Type type4 = Type.getType(accessor4.getType());
                if (accessor4.isPublic() || (method = accessor4.getter) == null) {
                    visitMethod3.visitFieldInsn(180, this.classNameInternal, accessor4.getName(), type4.getDescriptor());
                } else {
                    if (method == null) {
                        throw new RuntimeException("no Getter for field " + accessor4.getName() + " in class " + this.className);
                    }
                    visitMethod3.visitMethodInsn(182, this.classNameInternal, accessor4.getter.getName(), Type.getMethodDescriptor(method), false);
                }
                ASMUtil.autoBoxing(visitMethod3, type4);
                visitMethod3.visitInsn(176);
                visitMethod3.visitLabel(newLabels4[i14]);
                visitMethod3.visitFrame(3, 0, null, 0, null);
                i14++;
            }
        }
        Class<? extends Exception> cls2 = this.exceptionClass;
        if (cls2 != null) {
            throwExIntParam(visitMethod3, cls2);
        } else {
            visitMethod3.visitInsn(1);
            visitMethod3.visitInsn(176);
        }
        visitMethod3.visitMaxs(0, 0);
        visitMethod3.visitEnd();
        int i15 = 153;
        if (z) {
            i = 180;
            i2 = 176;
            i3 = 192;
        } else {
            i2 = 176;
            i = 180;
            i3 = 192;
            MethodVisitor visitMethod4 = classWriter.visitMethod(1, "set", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", null, null);
            visitMethod4.visitCode();
            Label[] newLabels5 = ASMUtil.newLabels(this.accs.length);
            int i16 = 0;
            for (Accessor accessor5 : this.accs) {
                visitMethod4.visitVarInsn(25, 2);
                visitMethod4.visitLdcInsn(accessor5.fieldName);
                visitMethod4.visitMethodInsn(182, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
                visitMethod4.visitJumpInsn(153, newLabels5[i16]);
                internalSetFiled(visitMethod4, accessor5);
                visitMethod4.visitLabel(newLabels5[i16]);
                visitMethod4.visitFrame(3, 0, null, 0, null);
                i16++;
            }
            Class<? extends Exception> cls3 = this.exceptionClass;
            if (cls3 != null) {
                throwExStrParam(visitMethod4, cls3);
            } else {
                visitMethod4.visitInsn(177);
            }
            visitMethod4.visitMaxs(0, 0);
            visitMethod4.visitEnd();
        }
        if (!z) {
            MethodVisitor visitMethod5 = classWriter.visitMethod(1, "get", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", null, null);
            visitMethod5.visitCode();
            Label[] newLabels6 = ASMUtil.newLabels(this.accs.length);
            Accessor[] accessorArr5 = this.accs;
            int length3 = accessorArr5.length;
            int i17 = 0;
            int i18 = 0;
            while (i17 < length3) {
                Accessor accessor6 = accessorArr5[i17];
                visitMethod5.visitVarInsn(25, 2);
                visitMethod5.visitLdcInsn(accessor6.fieldName);
                visitMethod5.visitMethodInsn(182, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
                visitMethod5.visitJumpInsn(i15, newLabels6[i18]);
                visitMethod5.visitVarInsn(25, 1);
                visitMethod5.visitTypeInsn(i3, this.classNameInternal);
                Type type5 = Type.getType(accessor6.getType());
                if (accessor6.isPublic() || (method3 = accessor6.getter) == null) {
                    type2 = type5;
                    visitMethod5.visitFieldInsn(i, this.classNameInternal, accessor6.getName(), type2.getDescriptor());
                } else {
                    String methodDescriptor2 = Type.getMethodDescriptor(method3);
                    type2 = type5;
                    visitMethod5.visitMethodInsn(182, this.classNameInternal, accessor6.getter.getName(), methodDescriptor2, false);
                }
                ASMUtil.autoBoxing(visitMethod5, type2);
                visitMethod5.visitInsn(i2);
                visitMethod5.visitLabel(newLabels6[i18]);
                visitMethod5.visitFrame(3, 0, null, 0, null);
                i18++;
                i17++;
                i15 = 153;
            }
            Class<? extends Exception> cls4 = this.exceptionClass;
            if (cls4 != null) {
                throwExStrParam(visitMethod5, cls4);
            } else {
                visitMethod5.visitInsn(1);
                visitMethod5.visitInsn(i2);
            }
            visitMethod5.visitMaxs(0, 0);
            visitMethod5.visitEnd();
        }
        MethodVisitor visitMethod6 = classWriter.visitMethod(1, "newInstance", "()Ljava/lang/Object;", null, null);
        visitMethod6.visitCode();
        visitMethod6.visitTypeInsn(187, this.classNameInternal);
        visitMethod6.visitInsn(89);
        visitMethod6.visitMethodInsn(183, this.classNameInternal, "<init>", "()V", false);
        visitMethod6.visitInsn(i2);
        visitMethod6.visitMaxs(2, 1);
        visitMethod6.visitEnd();
        classWriter.visitEnd();
        return this.loader.defineClass(this.accessClassName, classWriter.toByteArray());
    }

    public void addConversion(Class<?> cls) {
        if (cls == null) {
            return;
        }
        for (Method method : cls.getMethods()) {
            if ((method.getModifiers() & 8) != 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0].equals(Object.class)) {
                    Class<?> returnType = method.getReturnType();
                    if (!returnType.equals(Void.TYPE)) {
                        this.convMtds.put(returnType, method);
                    }
                }
            }
        }
    }
}
