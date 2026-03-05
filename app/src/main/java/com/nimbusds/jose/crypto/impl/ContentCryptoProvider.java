package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.jca.JWEJCAContext;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.ByteUtils;
import com.nimbusds.jose.util.Container;
import com.nimbusds.jose.util.IntegerOverflowException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKey;
import kotlin.io.ConstantsKt;

/* loaded from: classes2.dex */
public abstract class ContentCryptoProvider {
    public static final Map<Integer, Set<EncryptionMethod>> COMPATIBLE_ENCRYPTION_METHODS;
    public static final Set<EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        EncryptionMethod encryptionMethod = EncryptionMethod.A128CBC_HS256;
        linkedHashSet.add(encryptionMethod);
        EncryptionMethod encryptionMethod2 = EncryptionMethod.A192CBC_HS384;
        linkedHashSet.add(encryptionMethod2);
        EncryptionMethod encryptionMethod3 = EncryptionMethod.A256CBC_HS512;
        linkedHashSet.add(encryptionMethod3);
        EncryptionMethod encryptionMethod4 = EncryptionMethod.A128GCM;
        linkedHashSet.add(encryptionMethod4);
        EncryptionMethod encryptionMethod5 = EncryptionMethod.A192GCM;
        linkedHashSet.add(encryptionMethod5);
        EncryptionMethod encryptionMethod6 = EncryptionMethod.A256GCM;
        linkedHashSet.add(encryptionMethod6);
        EncryptionMethod encryptionMethod7 = EncryptionMethod.A128CBC_HS256_DEPRECATED;
        linkedHashSet.add(encryptionMethod7);
        EncryptionMethod encryptionMethod8 = EncryptionMethod.A256CBC_HS512_DEPRECATED;
        linkedHashSet.add(encryptionMethod8);
        SUPPORTED_ENCRYPTION_METHODS = Collections.unmodifiableSet(linkedHashSet);
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        hashSet.add(encryptionMethod4);
        hashSet2.add(encryptionMethod5);
        hashSet3.add(encryptionMethod6);
        hashSet3.add(encryptionMethod);
        hashSet3.add(encryptionMethod7);
        hashSet4.add(encryptionMethod2);
        hashSet5.add(encryptionMethod3);
        hashSet5.add(encryptionMethod8);
        hashMap.put(Integer.valueOf(128), Collections.unmodifiableSet(hashSet));
        hashMap.put(192, Collections.unmodifiableSet(hashSet2));
        hashMap.put(256, Collections.unmodifiableSet(hashSet3));
        hashMap.put(384, Collections.unmodifiableSet(hashSet4));
        hashMap.put(Integer.valueOf(ConstantsKt.MINIMUM_BLOCK_SIZE), Collections.unmodifiableSet(hashSet5));
        COMPATIBLE_ENCRYPTION_METHODS = Collections.unmodifiableMap(hashMap);
    }

    private static void checkCEKLength(SecretKey secretKey, EncryptionMethod encryptionMethod) {
        try {
            if (encryptionMethod.cekBitLength() == ByteUtils.safeBitLength(secretKey.getEncoded())) {
                return;
            }
            throw new KeyLengthException("The Content Encryption Key (CEK) length for " + encryptionMethod + " must be " + encryptionMethod.cekBitLength() + " bits");
        } catch (IntegerOverflowException e) {
            throw new KeyLengthException("The Content Encryption Key (CEK) is too long: " + e.getMessage());
        }
    }

    public static byte[] decrypt(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, SecretKey secretKey, JWEJCAContext jWEJCAContext) {
        JWEHeader jWEHeader2;
        byte[] decryptAuthenticated;
        checkCEKLength(secretKey, jWEHeader.getEncryptionMethod());
        byte[] compute = AAD.compute(jWEHeader);
        if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128CBC_HS256) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A192CBC_HS384) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256CBC_HS512)) {
            jWEHeader2 = jWEHeader;
            decryptAuthenticated = AESCBC.decryptAuthenticated(secretKey, base64URL2.decode(), base64URL3.decode(), compute, base64URL4.decode(), jWEJCAContext.getContentEncryptionProvider(), jWEJCAContext.getMACProvider());
        } else if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128GCM) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A192GCM) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256GCM)) {
            jWEHeader2 = jWEHeader;
            decryptAuthenticated = AESGCM.decrypt(secretKey, base64URL2.decode(), base64URL3.decode(), compute, base64URL4.decode(), jWEJCAContext.getContentEncryptionProvider());
        } else {
            if (!jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128CBC_HS256_DEPRECATED) && !jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256CBC_HS512_DEPRECATED)) {
                throw new JOSEException(AlgorithmSupportMessage.unsupportedEncryptionMethod(jWEHeader.getEncryptionMethod(), SUPPORTED_ENCRYPTION_METHODS));
            }
            jWEHeader2 = jWEHeader;
            decryptAuthenticated = AESCBC.decryptWithConcatKDF(jWEHeader2, secretKey, base64URL, base64URL2, base64URL3, base64URL4, jWEJCAContext.getContentEncryptionProvider(), jWEJCAContext.getMACProvider());
        }
        return DeflateHelper.applyDecompression(jWEHeader2, decryptAuthenticated);
    }

    public static JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr, SecretKey secretKey, Base64URL base64URL, JWEJCAContext jWEJCAContext) {
        JWEHeader jWEHeader2;
        Base64URL base64URL2;
        AuthenticatedCipherText encryptAuthenticated;
        byte[] bArr2;
        checkCEKLength(secretKey, jWEHeader.getEncryptionMethod());
        byte[] applyCompression = DeflateHelper.applyCompression(jWEHeader, bArr);
        byte[] compute = AAD.compute(jWEHeader);
        if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128CBC_HS256) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A192CBC_HS384) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256CBC_HS512)) {
            jWEHeader2 = jWEHeader;
            base64URL2 = base64URL;
            byte[] generateIV = AESCBC.generateIV(jWEJCAContext.getSecureRandom());
            encryptAuthenticated = AESCBC.encryptAuthenticated(secretKey, generateIV, applyCompression, compute, jWEJCAContext.getContentEncryptionProvider(), jWEJCAContext.getMACProvider());
            bArr2 = generateIV;
        } else if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128GCM) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A192GCM) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256GCM)) {
            jWEHeader2 = jWEHeader;
            base64URL2 = base64URL;
            Container container = new Container(AESGCM.generateIV(jWEJCAContext.getSecureRandom()));
            AuthenticatedCipherText encrypt = AESGCM.encrypt(secretKey, container, applyCompression, compute, jWEJCAContext.getContentEncryptionProvider());
            bArr2 = (byte[]) container.get();
            encryptAuthenticated = encrypt;
        } else {
            if (!jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128CBC_HS256_DEPRECATED) && !jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256CBC_HS512_DEPRECATED)) {
                throw new JOSEException(AlgorithmSupportMessage.unsupportedEncryptionMethod(jWEHeader.getEncryptionMethod(), SUPPORTED_ENCRYPTION_METHODS));
            }
            bArr2 = AESCBC.generateIV(jWEJCAContext.getSecureRandom());
            encryptAuthenticated = AESCBC.encryptWithConcatKDF(jWEHeader, secretKey, base64URL, bArr2, applyCompression, jWEJCAContext.getContentEncryptionProvider(), jWEJCAContext.getMACProvider());
            jWEHeader2 = jWEHeader;
            base64URL2 = base64URL;
        }
        return new JWECryptoParts(jWEHeader2, base64URL2, Base64URL.encode(bArr2), Base64URL.encode(encryptAuthenticated.getCipherText()), Base64URL.encode(encryptAuthenticated.getAuthenticationTag()));
    }
}
