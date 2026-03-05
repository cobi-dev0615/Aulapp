package com.d.e;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import kotlin.UByte;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class values extends FilterInputStream {
    private int PngjBadCrcException;
    private final int PngjBadSignature;
    private long[] PngjException;
    private int PngjExceptionInternal;
    private long[] PngjInputException;
    private short PngjOutputException;
    private int PngjPrematureEnding;
    private byte[] PngjUnsupportedException;
    private int a;
    private final int valueOf;
    private final int values;

    public values(InputStream inputStream, int i, int i2, short s, int i3, int i4) {
        this(inputStream, i, i2, s, i3, i4, (byte) 0);
    }

    private void valueOf() {
        long[] jArr = this.PngjException;
        long[] jArr2 = this.PngjInputException;
        short s = this.PngjOutputException;
        long j = jArr[s % 4] * 2147483085;
        long j2 = jArr2[(s + 2) % 4];
        int i = (s + 3) % 4;
        jArr2[i] = ((jArr[i] * 2147483085) + j2) / 2147483647L;
        jArr[i] = (j + j2) % 2147483647L;
        for (int i2 = 0; i2 < this.values; i2++) {
            this.PngjUnsupportedException[i2] = (byte) (r1[i2] ^ ((this.PngjException[this.PngjOutputException] >> (i2 << 3)) & 255));
        }
        this.PngjOutputException = (short) ((this.PngjOutputException + 1) % 4);
    }

    private int values() {
        int i;
        if (this.PngjPrematureEnding == Integer.MAX_VALUE) {
            this.PngjPrematureEnding = ((FilterInputStream) this).in.read();
        }
        if (this.PngjExceptionInternal == this.values) {
            byte[] bArr = this.PngjUnsupportedException;
            int i2 = this.PngjPrematureEnding;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i3 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.PngjUnsupportedException, i3, this.values - i3);
                if (read <= 0) {
                    break;
                }
                i3 += read;
            } while (i3 < this.values);
            if (i3 < this.values) {
                throw new IllegalStateException("unexpected block size");
            }
            int i4 = this.PngjBadSignature;
            if (i4 == this.valueOf) {
                valueOf();
            } else {
                if (this.PngjBadCrcException <= i4) {
                    valueOf();
                }
                int i5 = this.PngjBadCrcException;
                if (i5 < this.valueOf) {
                    this.PngjBadCrcException = i5 + 1;
                } else {
                    this.PngjBadCrcException = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.PngjPrematureEnding = read2;
            this.PngjExceptionInternal = 0;
            if (read2 < 0) {
                int i6 = this.values;
                i = i6 - (this.PngjUnsupportedException[i6 - 1] & UByte.MAX_VALUE);
            } else {
                i = this.values;
            }
            this.a = i;
        }
        return this.a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        values();
        return this.a - this.PngjExceptionInternal;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        values();
        int i = this.PngjExceptionInternal;
        if (i >= this.a) {
            return -1;
        }
        byte[] bArr = this.PngjUnsupportedException;
        this.PngjExceptionInternal = i + 1;
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

    private values(InputStream inputStream, int i, int i2, short s, int i3, int i4, byte b) {
        super(new BufferedInputStream(inputStream, ConstantsKt.DEFAULT_BLOCK_SIZE));
        this.PngjBadCrcException = 1;
        this.PngjPrematureEnding = IntCompanionObject.MAX_VALUE;
        int min = Math.min(Math.max((int) s, 4), 8);
        this.values = min;
        this.PngjUnsupportedException = new byte[min];
        this.PngjException = new long[4];
        this.PngjInputException = new long[4];
        this.PngjExceptionInternal = min;
        this.a = min;
        this.PngjException = PngjBadSignature.valueOf(i ^ i4, min ^ i4);
        this.PngjInputException = PngjBadSignature.valueOf(i2 ^ i4, i3 ^ i4);
        this.PngjBadSignature = 100;
        this.valueOf = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            values();
            int i5 = this.PngjExceptionInternal;
            if (i5 >= this.a) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.PngjUnsupportedException;
            this.PngjExceptionInternal = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }
}
