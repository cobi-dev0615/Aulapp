package com.gse.aulapp.lib.encryption_gse.encryptGse.cipher;

import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.GCMBlockCipher;

/* loaded from: classes.dex */
public class AESGCMBlockCipher extends BufferedBlockCipher {
    private final GCMBlockCipher internalCipher = new GCMBlockCipher(new AESEngine());

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i) {
        return this.internalCipher.doFinal(bArr, i);
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i) {
        return this.internalCipher.getOutputSize(i);
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        this.internalCipher.init(z, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return this.internalCipher.processBytes(bArr, i, i2, bArr2, i3);
    }
}
