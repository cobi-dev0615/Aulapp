package com.nimbusds.jose;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class JOSEObjectType implements Serializable {
    public static final JOSEObjectType JOSE = new JOSEObjectType("JOSE");
    public static final JOSEObjectType JOSE_JSON = new JOSEObjectType("JOSE+JSON");
    public static final JOSEObjectType JWT = new JOSEObjectType("JWT");
    private final String type;

    public JOSEObjectType(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The object type must not be null");
        }
        this.type = str;
    }

    public boolean equals(Object obj) {
        return (obj instanceof JOSEObjectType) && this.type.equalsIgnoreCase(((JOSEObjectType) obj).type);
    }

    public int hashCode() {
        return this.type.toLowerCase().hashCode();
    }

    public String toString() {
        return this.type;
    }
}
