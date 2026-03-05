package com.nimbusds.jose;

import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;

/* loaded from: classes2.dex */
public final class EncryptionMethod extends Algorithm {
    public static final EncryptionMethod A128CBC_HS256;
    public static final EncryptionMethod A128CBC_HS256_DEPRECATED;
    public static final EncryptionMethod A128GCM;
    public static final EncryptionMethod A192CBC_HS384;
    public static final EncryptionMethod A192GCM;
    public static final EncryptionMethod A256CBC_HS512;
    public static final EncryptionMethod A256CBC_HS512_DEPRECATED;
    public static final EncryptionMethod A256GCM;
    private final int cekBitLength;

    static {
        Requirement requirement = Requirement.REQUIRED;
        A128CBC_HS256 = new EncryptionMethod("A128CBC-HS256", requirement, 256);
        Requirement requirement2 = Requirement.OPTIONAL;
        A192CBC_HS384 = new EncryptionMethod("A192CBC-HS384", requirement2, 384);
        A256CBC_HS512 = new EncryptionMethod("A256CBC-HS512", requirement, ConstantsKt.MINIMUM_BLOCK_SIZE);
        A128CBC_HS256_DEPRECATED = new EncryptionMethod("A128CBC+HS256", requirement2, 256);
        A256CBC_HS512_DEPRECATED = new EncryptionMethod("A256CBC+HS512", requirement2, ConstantsKt.MINIMUM_BLOCK_SIZE);
        Requirement requirement3 = Requirement.RECOMMENDED;
        A128GCM = new EncryptionMethod("A128GCM", requirement3, Uuid.SIZE_BITS);
        A192GCM = new EncryptionMethod("A192GCM", requirement2, 192);
        A256GCM = new EncryptionMethod("A256GCM", requirement3, 256);
    }

    public EncryptionMethod(String str, Requirement requirement, int i) {
        super(str, requirement);
        this.cekBitLength = i;
    }

    public static EncryptionMethod parse(String str) {
        EncryptionMethod encryptionMethod = A128CBC_HS256;
        if (str.equals(encryptionMethod.getName())) {
            return encryptionMethod;
        }
        EncryptionMethod encryptionMethod2 = A192CBC_HS384;
        if (str.equals(encryptionMethod2.getName())) {
            return encryptionMethod2;
        }
        EncryptionMethod encryptionMethod3 = A256CBC_HS512;
        if (str.equals(encryptionMethod3.getName())) {
            return encryptionMethod3;
        }
        EncryptionMethod encryptionMethod4 = A128GCM;
        if (str.equals(encryptionMethod4.getName())) {
            return encryptionMethod4;
        }
        EncryptionMethod encryptionMethod5 = A192GCM;
        if (str.equals(encryptionMethod5.getName())) {
            return encryptionMethod5;
        }
        EncryptionMethod encryptionMethod6 = A256GCM;
        if (str.equals(encryptionMethod6.getName())) {
            return encryptionMethod6;
        }
        EncryptionMethod encryptionMethod7 = A128CBC_HS256_DEPRECATED;
        if (str.equals(encryptionMethod7.getName())) {
            return encryptionMethod7;
        }
        EncryptionMethod encryptionMethod8 = A256CBC_HS512_DEPRECATED;
        return str.equals(encryptionMethod8.getName()) ? encryptionMethod8 : new EncryptionMethod(str);
    }

    public int cekBitLength() {
        return this.cekBitLength;
    }

    public EncryptionMethod(String str) {
        this(str, null, 0);
    }
}
