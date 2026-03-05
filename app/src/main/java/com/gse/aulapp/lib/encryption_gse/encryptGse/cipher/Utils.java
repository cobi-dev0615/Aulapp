package com.gse.aulapp.lib.encryption_gse.encryptGse.cipher;

import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* loaded from: classes.dex */
public abstract class Utils {
    public static ECPublicKey readPublicKey(byte[] bArr) {
        return (ECPublicKey) KeyFactory.getInstance("EC", new BouncyCastleProvider()).generatePublic(new X509EncodedKeySpec(bArr));
    }
}
