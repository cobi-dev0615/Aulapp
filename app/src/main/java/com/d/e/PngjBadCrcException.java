package com.d.e;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import kotlin.UByte;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class PngjBadCrcException extends FilterInputStream {
    private static final short PngjException = (short) (Math.pow(2.0d, 15.0d) * (Math.sqrt(5.0d) - 1.0d));
    private int Action;
    private int Attempt;
    private final int PngBadCharsetException;
    private byte[] PngjBadCrcException;
    private int PngjBadSignature;
    private int PngjExceptionInternal;
    private int PngjInputException;
    private int PngjOutputException;
    private int PngjPrematureEnding;
    private int PngjUnsupportedException;
    private int a;
    private final int e1;
    private int onErrorResponse;
    private byte[] valueOf;
    private byte[] values;

    public PngjBadCrcException(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) {
        this(inputStream, iArr, i, bArr, i2, i3, (byte) 0);
    }

    private void PngjBadSignature() {
        if (this.PngjPrematureEnding == 3) {
            byte[] bArr = this.PngjBadCrcException;
            System.arraycopy(bArr, 0, this.values, 0, bArr.length);
        }
        byte[] bArr2 = this.PngjBadCrcException;
        boolean z = true;
        char c = 2;
        int i = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & UByte.MAX_VALUE);
        int i2 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & UByte.MAX_VALUE);
        int i3 = 0;
        while (true) {
            int i4 = this.PngjOutputException;
            if (i3 >= i4) {
                break;
            }
            short s = PngjException;
            i2 -= ((((i4 - i3) * s) + i) ^ ((i << 4) + this.onErrorResponse)) ^ ((i >>> 5) + this.Action);
            i -= (((i2 << 4) + this.PngjExceptionInternal) ^ (((i4 - i3) * s) + i2)) ^ ((i2 >>> 5) + this.a);
            i3++;
            c = c;
            z = z;
        }
        byte[] bArr3 = this.PngjBadCrcException;
        bArr3[0] = (byte) (i >> 24);
        bArr3[z ? 1 : 0] = (byte) (i >> 16);
        bArr3[c] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.PngjPrematureEnding == 3) {
            for (int i5 = 0; i5 < 8; i5++) {
                byte[] bArr4 = this.PngjBadCrcException;
                bArr4[i5] = (byte) (bArr4[i5] ^ this.valueOf[i5]);
            }
            byte[] bArr5 = this.values;
            System.arraycopy(bArr5, 0, this.valueOf, 0, bArr5.length);
        }
    }

    private int valueOf() throws java.io.IOException {
        if (this.PngjUnsupportedException == Integer.MAX_VALUE) {
            this.PngjUnsupportedException = super.in.read();
        }
        if (this.PngjBadSignature == 8) {
            byte[] bArr = this.PngjBadCrcException;
            int i = this.PngjUnsupportedException;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = super.in.read(this.PngjBadCrcException, i2, 8 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i3 = this.e1;
            if (i3 == this.PngBadCharsetException) {
                PngjBadSignature();
            } else {
                if (this.Attempt <= i3) {
                    PngjBadSignature();
                }
                int i4 = this.Attempt;
                if (i4 < this.PngBadCharsetException) {
                    this.Attempt = i4 + 1;
                } else {
                    this.Attempt = 1;
                }
            }
            int read2 = super.in.read();
            this.PngjUnsupportedException = read2;
            this.PngjBadSignature = 0;
            this.PngjInputException = read2 < 0 ? 8 - (this.PngjBadCrcException[7] & UByte.MAX_VALUE) : 8;
        }
        return this.PngjInputException;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws java.io.IOException {
        valueOf();
        return this.PngjInputException - this.PngjBadSignature;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        valueOf();
        int i = this.PngjBadSignature;
        if (i >= this.PngjInputException) {
            return -1;
        }
        byte[] bArr = this.PngjBadCrcException;
        this.PngjBadSignature = i + 1;
        return bArr[i] & UByte.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    private PngjBadCrcException(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3, byte b) {
        super(new BufferedInputStream(inputStream, ConstantsKt.DEFAULT_BLOCK_SIZE));
        this.PngjUnsupportedException = IntCompanionObject.MAX_VALUE;
        this.Attempt = 1;
        this.PngjBadCrcException = new byte[8];
        this.valueOf = new byte[8];
        this.values = new byte[8];
        this.PngjBadSignature = 8;
        this.PngjInputException = 8;
        this.PngjOutputException = Math.min(Math.max(i2, 5), 16);
        this.PngjPrematureEnding = i3;
        if (i3 == 3) {
            System.arraycopy(bArr, 0, this.valueOf, 0, 8);
        }
        long j = (iArr[1] & 4294967295L) | ((iArr[0] & 4294967295L) << 32);
        if (i == 0) {
            this.PngjExceptionInternal = (int) j;
            long j2 = j >> 3;
            short s = PngjException;
            this.a = (int) ((s * j2) >> 32);
            this.onErrorResponse = (int) (j >> 32);
            this.Action = (int) (j2 + s);
        } else {
            int i4 = (int) j;
            this.PngjExceptionInternal = i4;
            this.a = i4 * i;
            this.onErrorResponse = i ^ i4;
            this.Action = (int) (j >> 32);
        }
        this.e1 = 100;
        this.PngBadCharsetException = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            valueOf();
            int i5 = this.PngjBadSignature;
            if (i5 >= this.PngjInputException) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.PngjBadCrcException;
            this.PngjBadSignature = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }
}
