package com.nimbusds.jose.util;

import com.karumi.dexter.BuildConfig;
import java.util.Arrays;
import kotlin.UByte;

/* loaded from: classes2.dex */
abstract class Base64Codec {
    private static int checkedCast(long j) {
        int i = (int) j;
        if (i == j) {
            return i;
        }
        throw new IllegalArgumentException(j + " cannot be cast to int without changing its value.");
    }

    public static int computeEncodedLength(int i, boolean z) {
        if (i == 0) {
            return 0;
        }
        if (!z) {
            return (((i - 1) / 3) + 1) << 2;
        }
        int i2 = (i / 3) << 2;
        int i3 = i % 3;
        return i3 == 0 ? i2 : i2 + i3 + 1;
    }

    public static byte[] decode(String str) {
        if (str == null || str.isEmpty()) {
            return new byte[0];
        }
        byte[] bytes = str.getBytes(StandardCharset.UTF_8);
        int length = bytes.length;
        byte[] bArr = new byte[checkedCast((length * 6) >> 3)];
        int i = 0;
        int i2 = 0;
        while (i < bytes.length) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < 4 && i < length) {
                int i5 = i + 1;
                int decodeDigit = decodeDigit(bytes[i]);
                if (decodeDigit >= 0) {
                    i4 |= decodeDigit << (18 - (i3 * 6));
                    i3++;
                }
                i = i5;
            }
            if (i3 >= 2) {
                int i6 = i2 + 1;
                bArr[i2] = (byte) (i4 >> 16);
                if (i3 >= 3) {
                    int i7 = i2 + 2;
                    bArr[i6] = (byte) (i4 >> 8);
                    if (i3 >= 4) {
                        i2 += 3;
                        bArr[i7] = (byte) i4;
                    } else {
                        i2 = i7;
                    }
                } else {
                    i2 = i6;
                }
            }
        }
        return Arrays.copyOf(bArr, i2);
    }

    public static int decodeDigit(byte b) {
        int tpGT = tpGT(b, 64) & tpLT(b, 91);
        int tpGT2 = tpGT(b, 96) & tpLT(b, 123);
        int tpGT3 = tpGT(b, 47) & tpLT(b, 58);
        int tpEq = tpEq(b, 45) | tpEq(b, 43);
        int tpEq2 = tpEq(b, 47) | tpEq(b, 95);
        return tpSelect(tpGT3, b + 4, 0) | tpSelect(tpGT, b - 65, 0) | tpSelect(tpGT2, b - 71, 0) | tpSelect(tpEq, 62, 0) | tpSelect(tpEq2, 63, 0) | tpSelect(tpGT | tpGT2 | tpGT3 | tpEq | tpEq2, 0, -1);
    }

    public static byte encodeDigitBase64(int i) {
        int tpLT = tpLT(i, 26);
        int tpGT = tpGT(i, 25) & tpLT(i, 52);
        return (byte) (tpSelect(tpGT(i, 51) & tpLT(i, 62), i - 4, 0) | tpSelect(tpLT, i + 65, 0) | tpSelect(tpGT, i + 71, 0) | tpSelect(tpEq(i, 62), 43, 0) | tpSelect(tpEq(i, 63), 47, 0));
    }

    public static byte encodeDigitBase64URL(int i) {
        int tpLT = tpLT(i, 26);
        int tpGT = tpGT(i, 25) & tpLT(i, 52);
        return (byte) (tpSelect(tpGT(i, 51) & tpLT(i, 62), i - 4, 0) | tpSelect(tpLT, i + 65, 0) | tpSelect(tpGT, i + 71, 0) | tpSelect(tpEq(i, 62), 45, 0) | tpSelect(tpEq(i, 63), 95, 0));
    }

    public static String encodeToString(byte[] bArr, boolean z) {
        int length = bArr != null ? bArr.length : 0;
        if (length == 0) {
            return BuildConfig.FLAVOR;
        }
        int i = (length / 3) * 3;
        int computeEncodedLength = computeEncodedLength(length, z);
        byte[] bArr2 = new byte[computeEncodedLength];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i2] & UByte.MAX_VALUE) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & UByte.MAX_VALUE);
            if (z) {
                bArr2[i3] = encodeDigitBase64URL((i6 >>> 18) & 63);
                bArr2[i3 + 1] = encodeDigitBase64URL((i6 >>> 12) & 63);
                int i7 = i3 + 3;
                bArr2[i3 + 2] = encodeDigitBase64URL((i6 >>> 6) & 63);
                i3 += 4;
                bArr2[i7] = encodeDigitBase64URL(i6 & 63);
            } else {
                bArr2[i3] = encodeDigitBase64((i6 >>> 18) & 63);
                bArr2[i3 + 1] = encodeDigitBase64((i6 >>> 12) & 63);
                int i8 = i3 + 3;
                bArr2[i3 + 2] = encodeDigitBase64((i6 >>> 6) & 63);
                i3 += 4;
                bArr2[i8] = encodeDigitBase64(i6 & 63);
            }
        }
        int i9 = length - i;
        if (i9 > 0) {
            int i10 = ((bArr[i] & UByte.MAX_VALUE) << 10) | (i9 == 2 ? (bArr[length - 1] & UByte.MAX_VALUE) << 2 : 0);
            if (!z) {
                bArr2[computeEncodedLength - 4] = encodeDigitBase64(i10 >> 12);
                bArr2[computeEncodedLength - 3] = encodeDigitBase64((i10 >>> 6) & 63);
                bArr2[computeEncodedLength - 2] = i9 == 2 ? encodeDigitBase64(i10 & 63) : (byte) 61;
                bArr2[computeEncodedLength - 1] = kotlin.io.encoding.Base64.padSymbol;
            } else if (i9 == 2) {
                bArr2[computeEncodedLength - 3] = encodeDigitBase64URL(i10 >> 12);
                bArr2[computeEncodedLength - 2] = encodeDigitBase64URL((i10 >>> 6) & 63);
                bArr2[computeEncodedLength - 1] = encodeDigitBase64URL(i10 & 63);
            } else {
                bArr2[computeEncodedLength - 2] = encodeDigitBase64URL(i10 >> 12);
                bArr2[computeEncodedLength - 1] = encodeDigitBase64URL((i10 >>> 6) & 63);
            }
        }
        return new String(bArr2, StandardCharset.UTF_8);
    }

    public static int tpEq(int i, int i2) {
        int i3 = i ^ i2;
        return ((~i3) & (i3 - 1)) >>> 63;
    }

    public static int tpGT(int i, int i2) {
        return (int) ((i2 - i) >>> 63);
    }

    public static int tpLT(int i, int i2) {
        return (int) ((i - i2) >>> 63);
    }

    public static int tpSelect(int i, int i2, int i3) {
        return ((i - 1) & (i3 ^ i2)) ^ i2;
    }
}
