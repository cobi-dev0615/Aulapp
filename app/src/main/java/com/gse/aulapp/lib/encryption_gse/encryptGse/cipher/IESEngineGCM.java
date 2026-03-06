package com.gse.aulapp.lib.encryption_gse.encryptGse.cipher;

import co.ceduladigital.sdk.x5;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.EphemeralKeyPair;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.KeyParser;
import org.bouncycastle.crypto.generators.EphemeralKeyPairGenerator;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.IESParameters;
import org.bouncycastle.crypto.params.IESWithCipherParameters;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes.dex */
public class IESEngineGCM {
    private byte[] IV;
    BasicAgreement agree;
    BufferedBlockCipher cipher;
    byte[] encodedPublicKey;
    boolean forEncryption;
    DerivationFunction kdf;
    private EphemeralKeyPairGenerator keyPairGenerator;
    private KeyParser keyParser;
    IESParameters param;
    CipherParameters privParam;
    CipherParameters pubParam;

    public IESEngineGCM(BasicAgreement basicAgreement, DerivationFunction derivationFunction, BufferedBlockCipher bufferedBlockCipher) {
        this.agree = basicAgreement;
        this.kdf = derivationFunction;
        this.cipher = bufferedBlockCipher;
    }

    private byte[] decryptBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        int doFinal;
        byte[] bArr2;
        byte[] bArr3 = this.encodedPublicKey;
        if (i2 < bArr3.length) {
            throw new InvalidCipherTextException("Length of input must be greater than the MAC and encodedPublicKey combined");
        }
        if (this.cipher == null) {
            doFinal = i2 - bArr3.length;
            byte[] bArr4 = new byte[doFinal];
            int macKeySize = this.param.getMacKeySize() / 8;
            byte[] bArr5 = new byte[macKeySize];
            int i3 = doFinal + macKeySize;
            byte[] bArr6 = new byte[i3];
            this.kdf.generateBytes(bArr6, 0, i3);
            if (this.encodedPublicKey.length != 0) {
                System.arraycopy(bArr6, 0, bArr5, 0, macKeySize);
                System.arraycopy(bArr6, macKeySize, bArr4, 0, doFinal);
            } else {
                System.arraycopy(bArr6, 0, bArr4, 0, doFinal);
                System.arraycopy(bArr6, doFinal, bArr5, 0, macKeySize);
            }
            bArr2 = new byte[doFinal];
            for (int i4 = 0; i4 != doFinal; i4++) {
                bArr2[i4] = (byte) (bArr[(this.encodedPublicKey.length + i) + i4] ^ bArr4[i4]);
            }
        } else {
            int cipherKeySize = ((IESWithCipherParameters) this.param).getCipherKeySize() / 8;
            byte[] bArr7 = new byte[cipherKeySize];
            int macKeySize2 = this.param.getMacKeySize() / 8;
            byte[] bArr8 = new byte[macKeySize2];
            int i5 = cipherKeySize + macKeySize2;
            byte[] bArr9 = new byte[i5];
            this.kdf.generateBytes(bArr9, 0, i5);
            System.arraycopy(bArr9, 0, bArr7, 0, cipherKeySize);
            System.arraycopy(bArr9, cipherKeySize, bArr8, 0, macKeySize2);
            if (this.IV != null) {
                this.cipher.init(false, new ParametersWithIV(new KeyParameter(bArr7), this.IV));
            } else {
                this.cipher.init(false, new ParametersWithIV(new KeyParameter(bArr7), bArr8));
            }
            byte[] bArr10 = new byte[this.cipher.getOutputSize(i2 - this.encodedPublicKey.length)];
            BufferedBlockCipher bufferedBlockCipher = this.cipher;
            byte[] bArr11 = this.encodedPublicKey;
            int processBytes = bufferedBlockCipher.processBytes(bArr, i + bArr11.length, i2 - bArr11.length, bArr10, 0);
            doFinal = this.cipher.doFinal(bArr10, processBytes) + processBytes;
            bArr2 = bArr10;
        }
        return Arrays.copyOfRange(bArr2, 0, doFinal);
    }

    private byte[] encryptBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        byte[] bArr2;
        if (this.cipher == null) {
            byte[] bArr3 = new byte[i2];
            int macKeySize = this.param.getMacKeySize() / 8;
            byte[] bArr4 = new byte[macKeySize];
            int i3 = i2 + macKeySize;
            byte[] bArr5 = new byte[i3];
            this.kdf.generateBytes(bArr5, 0, i3);
            if (this.encodedPublicKey.length != 0) {
                System.arraycopy(bArr5, 0, bArr4, 0, macKeySize);
                System.arraycopy(bArr5, macKeySize, bArr3, 0, i2);
            } else {
                System.arraycopy(bArr5, 0, bArr3, 0, i2);
                System.arraycopy(bArr5, i2, bArr4, 0, macKeySize);
            }
            bArr2 = new byte[i2];
            for (int i4 = 0; i4 != i2; i4++) {
                bArr2[i4] = (byte) (bArr[i + i4] ^ bArr3[i4]);
            }
        } else {
            int cipherKeySize = ((IESWithCipherParameters) this.param).getCipherKeySize() / 8;
            byte[] bArr6 = new byte[cipherKeySize];
            int macKeySize2 = this.param.getMacKeySize() / 8;
            byte[] bArr7 = new byte[macKeySize2];
            int i5 = cipherKeySize + macKeySize2;
            byte[] bArr8 = new byte[i5];
            this.kdf.generateBytes(bArr8, 0, i5);
            System.arraycopy(bArr8, 0, bArr6, 0, cipherKeySize);
            System.arraycopy(bArr8, cipherKeySize, bArr7, 0, macKeySize2);
            if (this.IV != null) {
                this.cipher.init(true, new ParametersWithIV(new KeyParameter(bArr6), this.IV));
            } else {
                this.cipher.init(true, new ParametersWithIV(new KeyParameter(bArr6), bArr7));
            }
            byte[] bArr9 = new byte[this.cipher.getOutputSize(i2)];
            int processBytes = this.cipher.processBytes(bArr, i, i2, bArr9, 0);
            i2 = this.cipher.doFinal(bArr9, processBytes) + processBytes;
            bArr2 = bArr9;
        }
        byte[] bArr10 = this.encodedPublicKey;
        byte[] bArr11 = new byte[bArr10.length + i2];
        System.arraycopy(bArr10, 0, bArr11, 0, bArr10.length);
        System.arraycopy(bArr2, 0, bArr11, this.encodedPublicKey.length, i2);
        return bArr11;
    }

    private void extractParams(CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            this.IV = null;
            this.param = (IESParameters) cipherParameters;
        } else {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.IV = parametersWithIV.getIV();
            this.param = (IESParameters) parametersWithIV.getParameters();
        }
    }

    public BufferedBlockCipher getCipher() {
        return this.cipher;
    }

    public void init(boolean z, CipherParameters cipherParameters, CipherParameters cipherParameters2, CipherParameters cipherParameters3) {
        this.forEncryption = z;
        this.privParam = cipherParameters;
        this.pubParam = cipherParameters2;
        this.encodedPublicKey = new byte[0];
        extractParams(cipherParameters3);
    }

    public byte[] processBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (this.forEncryption) {
            EphemeralKeyPairGenerator ephemeralKeyPairGenerator = this.keyPairGenerator;
            if (ephemeralKeyPairGenerator != null) {
                EphemeralKeyPair generate = ephemeralKeyPairGenerator.generate();
                this.privParam = generate.getKeyPair().getPrivate();
                this.encodedPublicKey = generate.getEncodedPublicKey();
            }
        } else if (this.keyParser != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, i, i2);
            try {
                this.pubParam = this.keyParser.readKey(byteArrayInputStream);
                this.encodedPublicKey = Arrays.copyOfRange(bArr, i, (i2 - byteArrayInputStream.available()) + i);
            } catch (IOException e) {
                throw new InvalidCipherTextException(x5.g(e, new StringBuilder("unable to recover ephemeral public key: ")), e);
            }
        }
        this.agree.init(this.privParam);
        byte[] asUnsignedByteArray = BigIntegers.asUnsignedByteArray(this.agree.getFieldSize(), this.agree.calculateAgreement(this.pubParam));
        try {
            this.kdf.init(new KDFParameters(asUnsignedByteArray, this.encodedPublicKey));
            byte[] encryptBlock = this.forEncryption ? encryptBlock(bArr, i, i2) : decryptBlock(bArr, i, i2);
            Arrays.fill(asUnsignedByteArray, (byte) 0);
            return encryptBlock;
        } catch (Throwable th) {
            Arrays.fill(asUnsignedByteArray, (byte) 0);
            throw th;
        }
    }

    public void init(AsymmetricKeyParameter asymmetricKeyParameter, CipherParameters cipherParameters, EphemeralKeyPairGenerator ephemeralKeyPairGenerator) {
        this.forEncryption = true;
        this.pubParam = asymmetricKeyParameter;
        this.keyPairGenerator = ephemeralKeyPairGenerator;
        extractParams(cipherParameters);
    }

    public void init(AsymmetricKeyParameter asymmetricKeyParameter, CipherParameters cipherParameters, KeyParser keyParser) {
        this.forEncryption = false;
        this.privParam = asymmetricKeyParameter;
        this.keyParser = keyParser;
        extractParams(cipherParameters);
    }
}
