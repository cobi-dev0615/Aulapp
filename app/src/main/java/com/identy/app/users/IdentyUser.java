package com.identy.app.users;

import android.os.Process;
import com.d.e.a.values;
import com.identy.Fpnative;
import com.identy.IdentyB;
import defpackage.a;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;

/* loaded from: classes2.dex */
public class IdentyUser {
    private static final byte[] $$a = {119, -111, -91, -15, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0};
    private static final int $$b = 169;
    public String email;
    public int uid;
    public String uniqueId;
    public String username;

    public IdentyUser() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myPid = Process.myPid();
                    int i = ~myPid;
                    int i2 = (~((-858355118) | i)) | 570455168;
                    int c = a.c((~(myPid | (-71565889))) | (~(i | (-287899950))), 502, ((i2 | 0) * (-502)) - 895425217, -1567537592);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4925;
                    Fpnative.valueOf = objArr;
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[27];
            byte b2 = b;
            Object[] objArr3 = new Object[1];
            a(b, b2, (byte) (b2 | 28), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b3 = bArr[77];
            byte b4 = bArr[32];
            Object[] objArr4 = new Object[1];
            a(b3, b4, (byte) (b4 & 7), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1567537592);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4925;
            Fpnative.valueOf = objArr;
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, byte b, Object[] objArr) {
        int i3;
        int i4;
        int i5 = i2 + 4;
        byte[] bArr = $$a;
        int i6 = 99 - (i * 19);
        int i7 = b + 16;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i7;
            i4 = 0;
            i5++;
            i6 = (i6 + i8) - 13;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i8 = bArr[i5];
            i5++;
            i6 = (i6 + i8) - 13;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x012d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00d1  */
    /* JADX WARN: Type inference failed for: r1v22, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isDefault() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = a.c((~(identityHashCode | (-220200966))) | 276981818, 235, (((~((-221054214) | identityHashCode)) | 277835066) * (-470)) + ((((~((~identityHashCode) | (-221054214))) | 277835066) * (-235)) - 1654483374), -54707213);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5047;
                    Fpnative.valueOf = objArr;
                    if (this.uid == 0) {
                        return false;
                    }
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = i3 * i3;
                    int i5 = -(1020518906 * i3);
                    int i6 = (i4 & i5) + (i4 | i5);
                    int i7 = -(i3 * 1940760224);
                    int i8 = (((i6 | i7) << 1) - (i7 ^ i6)) - 1392115927;
                    int i9 = i8 >> 21;
                    int a = IdentyB.a(i9 ^ (-4095), (i9 & (-4095)) << 1, 2048, -1);
                    int i10 = ((i8 | a) << 1) - (a ^ i8);
                    int i11 = i8 >> 27;
                    int i12 = ((i11 ^ (-63)) + ((i11 & (-63)) << 1)) / 32;
                    int i13 = -(((i12 & 1) + (i12 | 1)) ^ i10);
                    int i14 = (i13 & 9) + (i13 | 9);
                    int i15 = i14 >> 29;
                    return false;
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[27];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b | Base64.padSymbol), bArr[19], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[77];
            Object[] objArr4 = new Object[1];
            a(b2, (byte) (b2 | 88), bArr[27], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -54707213);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5047;
            Fpnative.valueOf = objArr;
            if (this.uid == 0) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }
}
