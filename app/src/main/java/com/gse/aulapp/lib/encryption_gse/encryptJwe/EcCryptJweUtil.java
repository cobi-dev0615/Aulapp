package com.gse.aulapp.lib.encryption_gse.encryptJwe;

import com.karumi.dexter.BuildConfig;
import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.JWEObject;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.crypto.DirectEncrypter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import org.spongycastle.jce.ECNamedCurveTable;
import org.spongycastle.jce.spec.ECNamedCurveParameterSpec;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.io.pem.PemReader;

/* loaded from: classes.dex */
public abstract class EcCryptJweUtil {
    public static byte[] iv = new SecureRandom().generateSeed(16);

    public static KeyPair generateECKeys() {
        try {
            ECNamedCurveParameterSpec parameterSpec = ECNamedCurveTable.getParameterSpec("prime256v1");
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("ECDH", "SC");
            keyPairGenerator.initialize(parameterSpec);
            return keyPairGenerator.generateKeyPair();
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e) {
            Logger.getLogger(EcCryptJweUtil.class.getName()).log(Level.SEVERE, (String) null, e);
            return null;
        }
    }

    public static String generatePublicKeyEncoded(ECPublicKey eCPublicKey) {
        try {
            Base64.getEncoder().encodeToString(eCPublicKey.getEncoded());
            byte[] byteArray = eCPublicKey.getW().getAffineX().toByteArray();
            byte[] byteArray2 = eCPublicKey.getW().getAffineY().toByteArray();
            if (byteArray[0] == 0) {
                byteArray = Arrays.copyOfRange(byteArray, 1, byteArray.length);
            }
            if (byteArray2[0] == 0) {
                byteArray2 = Arrays.copyOfRange(byteArray2, 1, byteArray2.length);
            }
            ByteBuffer allocate = ByteBuffer.allocate(byteArray.length + 1 + byteArray2.length);
            allocate.put((byte) 4);
            allocate.put(byteArray);
            allocate.put(byteArray2);
            return Base64.getEncoder().encodeToString(allocate.array());
        } catch (Exception e) {
            e.getMessage();
            return BuildConfig.FLAVOR;
        }
    }

    public static SecretKey generateSharedSecret(PrivateKey privateKey, PublicKey publicKey) {
        try {
            KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH", "SC");
            keyAgreement.init(privateKey);
            keyAgreement.doPhase(publicKey, true);
            return keyAgreement.generateSecret("AES");
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ECPublicKey getBackendPubKeyByReader(Reader reader) {
        ECPublicKey eCPublicKey;
        PemReader pemReader;
        ECPublicKey eCPublicKey2 = null;
        try {
            pemReader = new PemReader(reader);
            try {
                eCPublicKey = (ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(pemReader.readPemObject().getContent()));
            } catch (Throwable th) {
                try {
                    pemReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException e2) {
            eCPublicKey = null;
            Logger.getLogger(EcCryptJweUtil.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e2);
            return eCPublicKey;
        } catch (IOException e3) {
            eCPublicKey = null;
            Logger.getLogger(EcCryptJweUtil.class.getName()).log(Level.SEVERE, (String) null, e3);
            return eCPublicKey;
        } catch (NoSuchAlgorithmException e4) {
            eCPublicKey = null;
            Logger.getLogger(EcCryptJweUtil.class.getName()).log(Level.SEVERE, (String) null, e4);
            return eCPublicKey;
        } catch (InvalidKeySpecException unused) {
            return eCPublicKey2;
        }
        try {
            pemReader.close();
            return eCPublicKey;
        } catch (FileNotFoundException e5) {
            Logger.getLogger(EcCryptJweUtil.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e5);
            return eCPublicKey;
        } catch (IOException e6) {
            Logger.getLogger(EcCryptJweUtil.class.getName()).log(Level.SEVERE, (String) null, e6);
            return eCPublicKey;
        } catch (NoSuchAlgorithmException e7) {
            Logger.getLogger(EcCryptJweUtil.class.getName()).log(Level.SEVERE, (String) null, e7);
            return eCPublicKey;
        } catch (InvalidKeySpecException unused2) {
            return eCPublicKey;
        }
    }

    public static String getJwe(SecretKey secretKey, String str) {
        JWEObject jWEObject = new JWEObject(new JWEHeader(JWEAlgorithm.DIR, EncryptionMethod.A256GCM), new Payload(str));
        jWEObject.encrypt(new DirectEncrypter(secretKey));
        return jWEObject.serialize();
    }
}
