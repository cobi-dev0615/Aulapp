package com.identy.app;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.identy.Fpnative;
import com.identy.IdentyB;
import defpackage.a;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class valueOf implements Response.ErrorListener {
    private static final byte[] $$a = {19, -54, -54, -53, 20, 6, -55, 67, 3, 9, 17, 14, 13, -67, 65, -49, 42, 38, 1, 11, -32, 39, 11, -25, 55, -7, -22, 59, -13, 10, 19, 12, -3, 14, 7, -13, 19, 17, -8, 22};
    private static final int $$b = 125;
    private PngjOutputException PngjException;

    public valueOf(PngjOutputException pngjOutputException) {
        this.PngjException = pngjOutputException;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, byte b2, int i, Object[] objArr) {
        int i2;
        int i3 = 118 - (i * 19);
        int i4 = b * 26;
        int i5 = b2 + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 6];
        int i6 = i4 + 5;
        if (bArr == null) {
            int i7 = i3;
            int i8 = 0;
            int i9 = i5;
            int i10 = (i5 + i7) - 8;
            int i11 = i9;
            i3 = i10;
            i5 = i11;
            i2 = i8;
            int i12 = i5 + 1;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i12];
            int i13 = i3;
            i9 = i12;
            i5 = i13;
            int i102 = (i5 + i7) - 8;
            int i112 = i9;
            i3 = i102;
            i5 = i112;
            i2 = i8;
            int i122 = i5 + 1;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i1222 = i5 + 1;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00d4  */
    @Override // com.android.volley.Response.ErrorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onErrorResponse(VolleyError volleyError) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        boolean z = false;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int identityHashCode = System.identityHashCode(this);
                        int i = (((~((-593622278) | identityHashCode)) | 94732997) * (-318)) + 352534633;
                        int i2 = ~(94732997 | identityHashCode);
                        int i3 = ~identityHashCode;
                        int c = a.c((~(identityHashCode | (-75760321))) | (~(669382597 | i3)), 318, ((i2 | (~(i3 | (-75760321)))) * 318) + i, 106441076);
                        int i4 = c ^ (c << 13);
                        int i5 = i4 ^ (i4 >>> 17);
                        ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                        ((long[]) objArr[0])[0] = j + 4857;
                        Fpnative.valueOf = objArr;
                        volleyError.printStackTrace();
                        PngjOutputException pngjOutputException = this.PngjException;
                        if (!(volleyError instanceof AuthFailureError)) {
                            int i6 = ((int[]) objArr[1])[0];
                            int i7 = i6 * i6;
                            int i8 = -(481649818 * i6);
                            int i9 = (((i7 ^ i8) + ((i7 & i8) << 1)) - (~(-(i6 * (-1716003862))))) - 1;
                            int i10 = (i9 ^ (-332754684)) + (((-332754684) & i9) << 1);
                            int i11 = i10 >> 28;
                            int a = IdentyB.a(i11 & (-31), i11 | (-31), 16, -1);
                            int i12 = ((i10 | a) << 1) - (a ^ i10);
                            int i13 = i10 >> 27;
                            int i14 = (-(IdentyB.a(i13 & (-63), i13 | (-63), 32, -1) ^ i12)) + 8;
                            int i15 = i14 >> 26;
                            int a2 = IdentyB.a(i15 ^ (-127), (i15 & (-127)) << 1, 64, -1);
                            z = 12488 / ((i14 & (-((a2 ^ 1) + ((a2 & 1) << 1)))) * 1561);
                        }
                        pngjOutputException.values(z);
                        return;
                    }
                }
                PngjOutputException pngjOutputException2 = this.PngjException;
                if (!(volleyError instanceof AuthFailureError)) {
                }
                pngjOutputException2.values(z);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
            byte[] bArr = $$a;
            byte b = bArr[18];
            byte b2 = b;
            Object[] objArr3 = new Object[1];
            a(b2, (byte) (-b2), b, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b3 = bArr[18];
            byte b4 = (byte) (b3 - 1);
            Object[] objArr4 = new Object[1];
            a(b4, (byte) (b4 | 30), (byte) (b3 - 1), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 106441076);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4857;
            Fpnative.valueOf = objArr;
            volleyError.printStackTrace();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
