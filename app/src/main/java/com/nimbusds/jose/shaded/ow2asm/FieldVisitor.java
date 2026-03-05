package com.nimbusds.jose.shaded.ow2asm;

import defpackage.a;

/* loaded from: classes2.dex */
public abstract class FieldVisitor {
    protected final int api;
    protected FieldVisitor fv;

    public FieldVisitor(int i) {
        this(i, null);
    }

    public abstract AnnotationVisitor visitAnnotation(String str, boolean z);

    public abstract void visitAttribute(Attribute attribute);

    public abstract void visitEnd();

    public abstract AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z);

    public FieldVisitor(int i, FieldVisitor fieldVisitor) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException(a.j("Unsupported api ", i));
        }
        if (i == 17432576) {
            Constants.checkAsmExperimental(this);
        }
        this.api = i;
        this.fv = fieldVisitor;
    }
}
