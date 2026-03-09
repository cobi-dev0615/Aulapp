package com.identy.app;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.UnrecoverableEntryException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.spec.ECGenParameterSpec;
import java.util.Calendar;
import java.util.Date;
import javax.crypto.KeyGenerator;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* loaded from: classes2.dex */
public final class PngjException {
    public static KeyPair PngjBadCrcException() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("ECDSA", new BouncyCastleProvider());
            keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
            return keyPairGenerator.generateKeyPair();
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static KeyPair PngjBadSignature(String str, Context context) {
        try {
            Calendar.getInstance().getTimeInMillis();
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(str, 3).setUserAuthenticationRequired(false).setDigests("SHA-256", "SHA-512").setBlockModes("ECB").setEncryptionPaddings("OAEPPadding").build());
            return keyPairGenerator.generateKeyPair();
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Key PngjException(String str, Context context) {
        try {
            Calendar.getInstance().getTimeInMillis();
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setUserAuthenticationRequired(false).setDigests("SHA-256", "SHA-512").setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
            return keyGenerator.generateKey();
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String valueOf(byte[] bArr, PrivateKey privateKey) {
        try {
            Calendar.getInstance().getTimeInMillis();
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(privateKey);
            signature.update(bArr);
            return new String(Base64.encode(signature.sign(), 8));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Key values(String str) {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.getKey(str, null);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (KeyStoreException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e3) {
            e3.printStackTrace();
            return null;
        } catch (UnrecoverableEntryException e4) {
            e4.printStackTrace();
            return null;
        } catch (CertificateException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static KeyPair PngjBadCrcException(String str) {
        PrivateKey privateKey;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (keyStore.containsAlias(str) && (privateKey = (PrivateKey) keyStore.getKey(str, null)) != null) {
                return new KeyPair(keyStore.getCertificate(str).getPublicKey(), privateKey);
            }
            return null;
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | CertificateException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static KeyPair valueOf(String str) {
        PrivateKey privateKey;
        Certificate certificate;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!keyStore.containsAlias(str) || (privateKey = (PrivateKey) keyStore.getKey(str, null)) == null || (certificate = keyStore.getCertificate(str)) == null) {
                return null;
            }
            return new KeyPair(certificate.getPublicKey(), privateKey);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | CertificateException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static PublicKey PngjBadSignature(String str) {
        try {
            if (str.contains("left")) {
                str = "leftv2";
            } else if (str.contains("right")) {
                str = "rightv2";
            }
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            keyStore.getEntry(str, null);
            return keyStore.getCertificate(str).getPublicKey();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (KeyStoreException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e3) {
            e3.printStackTrace();
            return null;
        } catch (UnrecoverableEntryException e4) {
            e4.printStackTrace();
            return null;
        } catch (CertificateException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static Date PngjException(String str) {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.getCreationDate(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static KeyPair valueOf(String str, Context context) {
        if (str.contains("left")) {
            str = "leftv2";
        } else if (str.contains("right")) {
            str = "rightv2";
        }
        try {
            KeyPair valueOf = valueOf(str);
            if (valueOf != null) {
                return valueOf;
            }
            Calendar.getInstance().getTimeInMillis();
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(str, 12).setDigests("SHA-256", "SHA-512").setKeySize(2048).setSignaturePaddings("PKCS1").build());
            return keyPairGenerator.generateKeyPair();
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException | ProviderException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean PngjBadSignature(byte[] bArr, String str, PublicKey publicKey) {
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(publicKey);
            signature.update(bArr);
            return signature.verify(Base64.decode(str, 8));
        } catch (Exception unused) {
            return false;
        }
    }
}
