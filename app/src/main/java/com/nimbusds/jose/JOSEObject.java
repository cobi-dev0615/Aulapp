package com.nimbusds.jose;

import com.nimbusds.jose.util.Base64URL;
import java.io.Serializable;
import java.text.ParseException;

/* loaded from: classes2.dex */
public abstract class JOSEObject implements Serializable {
    private Payload payload = null;
    private Base64URL[] parsedParts = null;

    public static Base64URL[] split(String str) {
        String trim = str.trim();
        int indexOf = trim.indexOf(".");
        if (indexOf == -1) {
            throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Missing part delimiters", 0);
        }
        int i = indexOf + 1;
        int indexOf2 = trim.indexOf(".", i);
        if (indexOf2 == -1) {
            throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Missing second delimiter", 0);
        }
        int i2 = indexOf2 + 1;
        int indexOf3 = trim.indexOf(".", i2);
        if (indexOf3 == -1) {
            return new Base64URL[]{new Base64URL(trim.substring(0, indexOf)), new Base64URL(trim.substring(i, indexOf2)), new Base64URL(trim.substring(i2))};
        }
        int i3 = indexOf3 + 1;
        int indexOf4 = trim.indexOf(".", i3);
        if (indexOf4 == -1) {
            throw new ParseException("Invalid serialized JWE object: Missing fourth delimiter", 0);
        }
        if (indexOf4 == -1 || trim.indexOf(".", indexOf4 + 1) == -1) {
            return new Base64URL[]{new Base64URL(trim.substring(0, indexOf)), new Base64URL(trim.substring(i, indexOf2)), new Base64URL(trim.substring(i2, indexOf3)), new Base64URL(trim.substring(i3, indexOf4)), new Base64URL(trim.substring(indexOf4 + 1))};
        }
        throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Too many part delimiters", 0);
    }

    public Payload getPayload() {
        return this.payload;
    }

    public void setParsedParts(Base64URL... base64URLArr) {
        this.parsedParts = base64URLArr;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }
}
