package com.nimbusds.jose;


/* loaded from: classes2.dex */
public class KeyLengthException extends KeyException {
    private final Algorithm alg;
    private final int expectedLength;

    public KeyLengthException(String str) {
        super(str);
        this.expectedLength = 0;
        this.alg = null;
    }

    public KeyLengthException(int i, Algorithm algorithm) {
        super(buildMessage(i, algorithm));
        this.expectedLength = i;
        this.alg = algorithm;
    }

    private static String buildMessage(int i, Algorithm algorithm) {
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            sb.append("The expected key length is ").append(i).append(" bits");
        } else {
            sb.append("Unexpected key length");
        }
        if (algorithm != null) {
            sb.append(" (for ").append(algorithm).append(" algorithm)");
        }
        return sb.toString();
    }
}
