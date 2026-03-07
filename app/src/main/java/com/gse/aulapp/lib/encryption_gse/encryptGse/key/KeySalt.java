package com.gse.aulapp.lib.encryption_gse.encryptGse.key;

import android.util.Base64;
import com.gse.aulapp.lib.encryption_gse.encryptGse.CryptoUtil;
import com.gse.aulapp.lib.encryption_gse.encryptGse.util.PreferenceService;
import java.nio.ByteBuffer;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes.dex */
public class KeySalt {
    private byte[] salt = null;
    private SecretKey secretKeyAndroid;

    private byte[] generateRandomSalt() {
        byte[] bArr = new byte[20];
        new Random().nextBytes(bArr);
        return bArr;
    }

    public void createSalt() throws Exception {
        byte[] salt = getSalt();
        this.salt = salt;
        if (salt != null) {
            return;
        }
        saveSaltCrypt(encryptSalt(generateRandomSalt()));
        this.salt = getSalt();
    }

    public byte[] decryptSalt(byte[] bArr) throws Exception {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        byte[] bArr2 = new byte[12];
        wrap.get(bArr2);
        byte[] bArr3 = new byte[wrap.remaining()];
        wrap.get(bArr3);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, this.secretKeyAndroid, new GCMParameterSpec(128, bArr2));
        return cipher.doFinal(bArr3);
    }

    public byte[] encryptSalt(byte[] bArr) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, this.secretKeyAndroid);
        byte[] iv = cipher.getIV();
        byte[] doFinal = cipher.doFinal(bArr);
        return ByteBuffer.allocate(iv.length + doFinal.length).put(iv).put(doFinal).array();
    }

    public byte[] getSalt() throws Exception {
        byte[] loadSaltCrypt = loadSaltCrypt();
        if (loadSaltCrypt == null) {
            return null;
        }
        return decryptSalt(loadSaltCrypt);
    }

    public byte[] loadSaltCrypt() {
        String gSEKey = PreferenceService.INSTANCE.getGSEKey(CryptoUtil.INSTANCE.getContext());
        if (gSEKey == null) {
            return null;
        }
        return Base64.decode(gSEKey, 2);
    }

    public void saveSaltCrypt(byte[] bArr) {
        PreferenceService.INSTANCE.saveGSEKey(CryptoUtil.INSTANCE.getContext(), Base64.encodeToString(bArr, 2));
    }

    public void setSecretKeyAndroid(SecretKey secretKey) {
        this.secretKeyAndroid = secretKey;
    }
}
