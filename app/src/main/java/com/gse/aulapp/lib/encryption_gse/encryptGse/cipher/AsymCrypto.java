package com.gse.aulapp.lib.encryption_gse.encryptGse.cipher;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import org.bouncycastle.crypto.agreement.ECDHBasicAgreement;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.generators.KDF2BytesGenerator;
import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.ECPointUtil;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.jce.spec.IESParameterSpec;

/* loaded from: classes.dex */
public class AsymCrypto {
    private final SecureRandom random = new SecureRandom();
    private ECPublicKey senderKey;

    public byte[] doEncrypt(byte[] bArr) {
        IESParameterSpec iESParameterSpec = new IESParameterSpec(null, null, 128, 128, null);
        IESCipherGCM iESCipherGCM = new IESCipherGCM(new IESEngineGCM(new ECDHBasicAgreement(), new KDF2BytesGenerator(new SHA256Digest()), new AESGCMBlockCipher()), 16);
        iESCipherGCM.engineInit(1, this.senderKey, iESParameterSpec, this.random);
        return iESCipherGCM.engineDoFinal(bArr, 0, bArr.length);
    }

    public void ephemeralKeys(ECPublicKey eCPublicKey) throws NoSuchAlgorithmException, InvalidKeySpecException {
        ECNamedCurveParameterSpec parameterSpec = ECNamedCurveTable.getParameterSpec("prime256v1");
        KeyFactory keyFactory = KeyFactory.getInstance("EC", new BouncyCastleProvider());
        ECNamedCurveSpec eCNamedCurveSpec = new ECNamedCurveSpec("prime256v1", parameterSpec.getCurve(), parameterSpec.getG(), parameterSpec.getN());
        this.senderKey = (ECPublicKey) keyFactory.generatePublic(new ECPublicKeySpec(ECPointUtil.decodePoint(eCNamedCurveSpec.getCurve(), eCPublicKey.getQ().getEncoded(false)), eCNamedCurveSpec));
    }
}
