package com.nimbusds.jose.util;

import java.io.ByteArrayInputStream;
import java.security.Provider;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* loaded from: classes2.dex */
public abstract class X509CertUtils {
    private static Provider jcaProvider;

    public static X509Certificate parse(byte[] bArr) {
        try {
            return parseWithException(bArr);
        } catch (CertificateException unused) {
            return null;
        }
    }

    public static X509Certificate parseWithException(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        Provider provider = jcaProvider;
        Certificate generateCertificate = (provider != null ? CertificateFactory.getInstance("X.509", provider) : CertificateFactory.getInstance("X.509")).generateCertificate(new ByteArrayInputStream(bArr));
        if (generateCertificate instanceof X509Certificate) {
            return (X509Certificate) generateCertificate;
        }
        throw new CertificateException("Not a X.509 certificate: " + generateCertificate.getType());
    }
}
