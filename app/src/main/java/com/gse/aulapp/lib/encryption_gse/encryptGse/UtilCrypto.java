package com.gse.aulapp.lib.encryption_gse.encryptGse;

import android.content.Context;
import android.util.Base64;
import com.gse.aulapp.lib.encryption_gse.encryptGse.key.KeyStoreCustom;
import java.io.File;

/* loaded from: classes.dex */
public class UtilCrypto {
    private Context context;
    private byte[] keyECCrypt = null;
    private KeyStoreCustom keyStoreCustom = new KeyStoreCustom();

    public UtilCrypto(Context context) {
        this.context = context;
    }

    public static byte[] decodeBase64ByteArray(String str) {
        return Base64.decode(str, 2);
    }

    public static String decodeBase64Value(String str) {
        return new String(decodeBase64ByteArray(str));
    }

    public static String encodeBase64ByteArray(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    public void createKey(String str) {
        this.keyECCrypt = this.keyStoreCustom.createKey(str);
    }

    public String createKeyCompanyV2(String str) {
        return getKeyEcCrypt(this.keyStoreCustom.createKeyCompanyV2(str));
    }

    public byte[] decryptFileByteByPassword(String str, File file) {
        try {
            return this.keyStoreCustom.getContentDecryptFileFromByte(str, file);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public String decryptValue(String str) {
        try {
            return this.keyStoreCustom.getContentDecryptValue(str);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public String encryptValue(String str) {
        try {
            return this.keyStoreCustom.getContentEncryptValue(str);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public String getBase64KeyECCrypt() {
        return encodeBase64ByteArray(this.keyECCrypt);
    }

    public String getDeriveP() {
        return this.keyStoreCustom.getDeriveP();
    }

    public String getKeyEcCrypt() {
        return getBase64KeyECCrypt();
    }

    public String getSalt() {
        return Base64.encodeToString(this.keyStoreCustom.getSalt(), 2);
    }

    public String getBase64KeyECCrypt(byte[] bArr) {
        return encodeBase64ByteArray(bArr);
    }

    public String getKeyEcCrypt(byte[] bArr) {
        return getBase64KeyECCrypt(bArr);
    }
}
