package com.getkeepsafe.relinker;

import java.util.Arrays;

/* loaded from: classes.dex */
public class MissingLibraryException extends RuntimeException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MissingLibraryException(String str, String[] strArr, String[] strArr2) {
        super("Could not find '" + str + "'. Looked for: " + Arrays.toString(strArr) + ", but only found: " + Arrays.toString(strArr2));
    }
}
