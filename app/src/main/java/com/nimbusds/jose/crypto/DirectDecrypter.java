package com.nimbusds.jose.crypto;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEDecrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
import com.nimbusds.jose.crypto.impl.ContentCryptoProvider;
import com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral;
import com.nimbusds.jose.crypto.impl.DirectCryptoProvider;
import com.nimbusds.jose.util.Base64URL;
import javax.crypto.SecretKey;

/* loaded from: classes2.dex */
public class DirectDecrypter extends DirectCryptoProvider implements JWEDecrypter {
    private final CriticalHeaderParamsDeferral critPolicy;
    private final boolean promiscuousMode;

    public DirectDecrypter(SecretKey secretKey) throws KeyLengthException {
        this(secretKey, false);
    }

    @Override // com.nimbusds.jose.JWEDecrypter
    public byte[] decrypt(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4) throws JOSEException {
        if (!this.promiscuousMode) {
            JWEAlgorithm algorithm = jWEHeader.getAlgorithm();
            if (!algorithm.equals(JWEAlgorithm.DIR)) {
                throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(algorithm, DirectCryptoProvider.SUPPORTED_ALGORITHMS));
            }
            if (base64URL != null) {
                throw new JOSEException("Unexpected present JWE encrypted key");
            }
        }
        if (base64URL2 == null) {
            throw new JOSEException("Unexpected present JWE initialization vector (IV)");
        }
        if (base64URL4 == null) {
            throw new JOSEException("Missing JWE authentication tag");
        }
        this.critPolicy.ensureHeaderPasses(jWEHeader);
        return ContentCryptoProvider.decrypt(jWEHeader, null, base64URL2, base64URL3, base64URL4, getKey(), getJCAContext());
    }

    public DirectDecrypter(SecretKey secretKey, boolean z) throws KeyLengthException {
        super(secretKey);
        this.critPolicy = new CriticalHeaderParamsDeferral();
        this.promiscuousMode = z;
    }
}
