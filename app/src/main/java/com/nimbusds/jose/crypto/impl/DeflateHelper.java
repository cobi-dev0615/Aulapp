package com.nimbusds.jose.crypto.impl;

import co.ceduladigital.sdk.q;
import com.nimbusds.jose.CompressionAlgorithm;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.util.DeflateUtils;

/* loaded from: classes2.dex */
public abstract class DeflateHelper {
    public static byte[] applyCompression(JWEHeader jWEHeader, byte[] bArr) {
        CompressionAlgorithm compressionAlgorithm = jWEHeader.getCompressionAlgorithm();
        if (compressionAlgorithm == null) {
            return bArr;
        }
        if (compressionAlgorithm.equals(CompressionAlgorithm.DEF)) {
            try {
                return DeflateUtils.compress(bArr);
            } catch (Exception e) {
                throw new JOSEException(q.g(e, new StringBuilder("Couldn't compress plain text: ")), e);
            }
        }
        throw new JOSEException("Unsupported compression algorithm: " + compressionAlgorithm);
    }

    public static byte[] applyDecompression(JWEHeader jWEHeader, byte[] bArr) {
        CompressionAlgorithm compressionAlgorithm = jWEHeader.getCompressionAlgorithm();
        if (compressionAlgorithm == null) {
            return bArr;
        }
        if (compressionAlgorithm.equals(CompressionAlgorithm.DEF)) {
            try {
                return DeflateUtils.decompress(bArr);
            } catch (Exception e) {
                throw new JOSEException(q.g(e, new StringBuilder("Couldn't decompress plain text: ")), e);
            }
        }
        throw new JOSEException("Unsupported compression algorithm: " + compressionAlgorithm);
    }
}
