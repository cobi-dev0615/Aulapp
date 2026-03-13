package com.nimbusds.jose.shaded.ow2asm;


/* loaded from: classes2.dex */
public final class MethodTooLargeException extends IndexOutOfBoundsException {
    private final String className;
    private final int codeSize;
    private final String descriptor;
    private final String methodName;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MethodTooLargeException(String str, String str2, String str3, int i) {
        super("Method too large: " + str + "." + str2 + " " + str3);
        this.className = str;
        this.methodName = str2;
        this.descriptor = str3;
        this.codeSize = i;
    }
}
