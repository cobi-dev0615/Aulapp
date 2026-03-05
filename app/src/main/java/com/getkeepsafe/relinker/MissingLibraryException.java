package com.getkeepsafe.relinker;

import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.y7;
import java.util.Arrays;

/* loaded from: classes.dex */
public class MissingLibraryException extends RuntimeException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MissingLibraryException(String str, String[] strArr, String[] strArr2) {
        super(q.j(Arrays.toString(strArr2), ".", r3));
        StringBuilder u = y7.u("Could not find '", str, "'. Looked for: ");
        u.append(Arrays.toString(strArr));
        u.append(", but only found: ");
    }
}
