package com.nimbusds.jose;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class Algorithm implements Serializable {
    public static final Algorithm NONE = new Algorithm("none", Requirement.REQUIRED);
    private final String name;
    private final Requirement requirement;

    public Algorithm(String str, Requirement requirement) {
        if (str == null) {
            throw new IllegalArgumentException("The algorithm name must not be null");
        }
        this.name = str;
        this.requirement = requirement;
    }

    public static Algorithm parse(String str) {
        if (str == null) {
            return null;
        }
        return new Algorithm(str);
    }

    public boolean equals(Object obj) {
        return (obj instanceof Algorithm) && toString().equals(obj.toString());
    }

    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        return this.name.hashCode();
    }

    public final String toString() {
        return this.name;
    }

    public Algorithm(String str) {
        this(str, null);
    }
}
