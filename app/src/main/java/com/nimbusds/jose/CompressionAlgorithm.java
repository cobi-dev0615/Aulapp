package com.nimbusds.jose;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class CompressionAlgorithm implements Serializable {
    public static final CompressionAlgorithm DEF = new CompressionAlgorithm("DEF");
    private final String name;

    public CompressionAlgorithm(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The compression algorithm name must not be null");
        }
        this.name = str;
    }

    public boolean equals(Object obj) {
        return (obj instanceof CompressionAlgorithm) && toString().equals(obj.toString());
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return this.name;
    }
}
