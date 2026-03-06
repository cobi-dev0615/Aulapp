package com.gse.aulapp.lib.encryption_gse.encryptGse.key;

import android.util.Base64;
import com.gse.aulapp.lib.encryption_gse.encryptGse.UtilCrypto;
import com.gse.aulapp.lib.encryption_gse.encryptGse.cipher.AsymCrypto;
import com.gse.aulapp.lib.encryption_gse.encryptGse.cipher.Utils;
import com.gse.aulapp.lib.encryption_gse.encryptGse.util.UtilConverter;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.util.Arrays;

/* loaded from: classes.dex */
public class KeyStoreCustom {
    private static final SecureRandom random = new SecureRandom();
    private String password;
    private SecretKey secretKey;
    private KeyAndroid keyAndroid = new KeyAndroid("GSEKey");
    private KeySalt keySalt = new KeySalt();
    private KeyDeriv keyDeriv = new KeyDeriv();

    private byte[] generateIVBytes(Cipher cipher, int i) {
        byte[] bArr = new byte[i];
        new Random().nextBytes(bArr);
        return bArr;
    }

    private String getContentDecryptStringFromByte(byte[] bArr) {
        if (bArr != null) {
            return decryptValue(bArr, getDerive(), 16);
        }
        return null;
    }

    private byte[] getContentEncryptStringFromByte(String str) {
        if (str == null) {
            return null;
        }
        str.getBytes();
        return encryptValue(str, getDerive(), 16);
    }

    private String getPubKey() {
        return "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEMVgSUxeUTr3pwWs/c0yxQNBrZUzWJh3VT7pYnr98Vuub1kuCnpcCltYqtp/kuU3rJ5pheFEHRd9QqvPU01xQ1g\\=\\=";
    }

    private byte[] getPublicKey() {
        return UtilCrypto.decodeBase64ByteArray(getPubKey());
    }

    public byte[] createKey(String str) throws Exception {
        setPassword(str);
        getKeyAndroid();
        getSalt();
        getDerive();
        return getECCrypt();
    }

    public byte[] createKeyCompanyV2(String str) throws Exception {
        return getECCrypt(str);
    }

    public byte[] decryptFile(byte[] bArr, byte[] bArr2, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        byte[] bArr3 = new byte[i];
        wrap.get(bArr3);
        byte[] bArr4 = new byte[wrap.remaining()];
        wrap.get(bArr4);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, new SecretKeySpec(bArr2, 0, bArr2.length, "AES"), new GCMParameterSpec(128, bArr3));
        return cipher.doFinal(bArr4);
    }

    public String decryptValue(byte[] bArr, byte[] bArr2, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        byte[] bArr3 = new byte[i];
        wrap.get(bArr3);
        byte[] bArr4 = new byte[wrap.remaining()];
        wrap.get(bArr4);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, new SecretKeySpec(bArr2, 0, bArr2.length, "AES"), new GCMParameterSpec(128, bArr3));
        return new String(cipher.doFinal(bArr4));
    }

    public byte[] encryptValue(String str, byte[] bArr, int i) {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        byte[] generateIVBytes = generateIVBytes(cipher, i);
        cipher.init(1, new SecretKeySpec(bArr, 0, bArr.length, "AES"), new GCMParameterSpec(128, generateIVBytes));
        return Arrays.concatenate(generateIVBytes, cipher.doFinal(str.getBytes()));
    }

    public byte[] getContentDecryptFileFromByte(String str, File file) {
        if (!file.exists()) {
            return null;
        }
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        bufferedInputStream.read(bArr, 0, length);
        fileInputStream.close();
        bufferedInputStream.close();
        return decryptFile(bArr, getDerive(str), 16);
    }

    public String getContentDecryptValue(String str) {
        try {
            return getContentDecryptStringFromByte(UtilConverter.getBytesByStringNew(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public String getContentEncryptValue(String str) {
        try {
            return UtilConverter.getStringByByteNew(getContentEncryptStringFromByte(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public byte[] getDerive() {
        return this.keyDeriv.derive(this.password, getSalt());
    }

    public String getDeriveP() {
        return UtilCrypto.encodeBase64ByteArray(getDerive());
    }

    public byte[] getECCrypt() throws Exception {
        ECPublicKey readPublicKey = Utils.readPublicKey(getPublicKey());
        AsymCrypto asymCrypto = new AsymCrypto();
        asymCrypto.ephemeralKeys(readPublicKey);
        return asymCrypto.doEncrypt(getDerive());
    }

    public void getKeyAndroid() {
        this.secretKey = this.keyAndroid.getKey();
    }

    public byte[] getSalt() {
        this.keySalt.setSecretKeyAndroid(this.secretKey);
        this.keySalt.createSalt();
        return this.keySalt.getSalt();
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public byte[] getDerive(String str) {
        byte[] salt = getSalt();
        Base64.encodeToString(salt, 2);
        return this.keyDeriv.derive(str, salt);
    }

    public byte[] getECCrypt(String str) throws Exception {
        ECPublicKey readPublicKey = Utils.readPublicKey(getPublicKey());
        AsymCrypto asymCrypto = new AsymCrypto();
        asymCrypto.ephemeralKeys(readPublicKey);
        return asymCrypto.doEncrypt(getDerive(str));
    }
}
