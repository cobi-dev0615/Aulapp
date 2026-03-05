package com.gse.aulapp.lib.encryption_gse.encryptGse.key;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/* loaded from: classes.dex */
public class KeyDeriv {
    public byte[] derive(String str, byte[] bArr) {
        return SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256").generateSecret(new PBEKeySpec(str.toCharArray(), bArr, 12000, 256)).getEncoded();
    }
}
