package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.ByteUtils;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
public abstract class AAD {
    public static byte[] compute(JWEHeader jWEHeader) {
        return compute(jWEHeader.toBase64URL());
    }

    public static byte[] computeLength(byte[] bArr) {
        return ByteBuffer.allocate(8).putLong(ByteUtils.safeBitLength(bArr)).array();
    }

    public static byte[] compute(Base64URL base64URL) {
        return base64URL.toString().getBytes(StandardCharsets.US_ASCII);
    }
}
