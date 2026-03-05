package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

/* loaded from: classes2.dex */
public abstract class HMAC {
    public static byte[] compute(SecretKey secretKey, byte[] bArr, Provider provider) {
        Mac initMac = getInitMac(secretKey, provider);
        initMac.update(bArr);
        return initMac.doFinal();
    }

    public static Mac getInitMac(SecretKey secretKey, Provider provider) {
        try {
            Mac mac = provider != null ? Mac.getInstance(secretKey.getAlgorithm(), provider) : Mac.getInstance(secretKey.getAlgorithm());
            mac.init(secretKey);
            return mac;
        } catch (InvalidKeyException e) {
            throw new JOSEException("Invalid HMAC key: " + e.getMessage(), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new JOSEException("Unsupported HMAC algorithm: " + e2.getMessage(), e2);
        }
    }
}
