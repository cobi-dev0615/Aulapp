package com.nimbusds.jose.crypto;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.JWEEncrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
import com.nimbusds.jose.crypto.impl.ContentCryptoProvider;
import com.nimbusds.jose.crypto.impl.DirectCryptoProvider;
import com.nimbusds.jose.util.ByteUtils;
import javax.crypto.SecretKey;

/* loaded from: classes2.dex */
public class DirectEncrypter extends DirectCryptoProvider implements JWEEncrypter {
    public DirectEncrypter(SecretKey secretKey) {
        super(secretKey);
    }

    @Override // com.nimbusds.jose.JWEEncrypter
    public JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr) {
        JWEAlgorithm algorithm = jWEHeader.getAlgorithm();
        if (!algorithm.equals(JWEAlgorithm.DIR)) {
            throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(algorithm, DirectCryptoProvider.SUPPORTED_ALGORITHMS));
        }
        EncryptionMethod encryptionMethod = jWEHeader.getEncryptionMethod();
        if (encryptionMethod.cekBitLength() == ByteUtils.safeBitLength(getKey().getEncoded())) {
            return ContentCryptoProvider.encrypt(jWEHeader, bArr, getKey(), null, getJCAContext());
        }
        throw new KeyLengthException(encryptionMethod.cekBitLength(), encryptionMethod);
    }
}
