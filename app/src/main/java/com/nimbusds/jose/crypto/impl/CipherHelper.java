package com.nimbusds.jose.crypto.impl;

import java.security.Provider;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
public abstract class CipherHelper {
    public static Cipher getInstance(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
