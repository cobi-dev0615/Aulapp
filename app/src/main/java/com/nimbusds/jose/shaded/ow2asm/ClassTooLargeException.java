package com.nimbusds.jose.shaded.ow2asm;

import co.ceduladigital.sdk.q;

/* loaded from: classes2.dex */
public final class ClassTooLargeException extends IndexOutOfBoundsException {
    private final String className;
    private final int constantPoolCount;

    public ClassTooLargeException(String str, int i) {
        super(q.i("Class too large: ", str));
        this.className = str;
        this.constantPoolCount = i;
    }
}
