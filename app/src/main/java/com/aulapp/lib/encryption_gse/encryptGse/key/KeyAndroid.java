package com.gse.aulapp.lib.encryption_gse.encryptGse.key;

import android.security.keystore.KeyGenParameterSpec;
import java.security.KeyStore;
import java.util.Enumeration;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* loaded from: classes.dex */
public class KeyAndroid {
    private final String ALIAS_KEY;
    private SecretKey SECRET_KEY;
    private final String TAG = KeyAndroid.class.getName();
    private String ALGORITHM = "AES";
    private final String PROVIDER = "AndroidKeyStore";

    public KeyAndroid(String str) {
        this.ALIAS_KEY = str;
        SecretKey findSecretKey = findSecretKey();
        this.SECRET_KEY = findSecretKey;
        if (findSecretKey == null) {
            this.SECRET_KEY = createSecretKey();
        }
    }

    private SecretKey createSecretKey() {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(this.ALGORITHM, "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(this.ALIAS_KEY, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        return keyGenerator.generateKey();
    }

    private SecretKey findSecretKey() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Enumeration<String> aliases = keyStore.aliases();
        while (aliases.hasMoreElements()) {
            String nextElement = aliases.nextElement();
            if (keyStore.isKeyEntry(nextElement) && nextElement.equals(this.ALIAS_KEY)) {
                return loadSecretKey();
            }
        }
        return null;
    }

    public SecretKey getKey() {
        return this.SECRET_KEY;
    }

    public SecretKey loadSecretKey() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        return ((KeyStore.SecretKeyEntry) keyStore.getEntry(this.ALIAS_KEY, null)).getSecretKey();
    }
}
