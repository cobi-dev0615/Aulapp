package com.nimbusds.jose;

import co.ceduladigital.sdk.q;
import com.karumi.dexter.BuildConfig;

/* loaded from: classes2.dex */
public class KeyLengthException extends KeyException {
    private final Algorithm alg;
    private final int expectedLength;

    public KeyLengthException(String str) {
        super(str);
        this.expectedLength = 0;
        this.alg = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KeyLengthException(int i, Algorithm algorithm) {
        super(r0.toString());
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            str = q.f(i, "The expected key length is ", " bits");
        } else {
            str = "Unexpected key length";
        }
        sb.append(str);
        if (algorithm != null) {
            str2 = " (for " + algorithm + " algorithm)";
        } else {
            str2 = BuildConfig.FLAVOR;
        }
        sb.append(str2);
        this.expectedLength = i;
        this.alg = algorithm;
    }
}
