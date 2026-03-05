package com.identy.app;

import com.android.volley.Response;
import com.identy.Fpnative;
import defpackage.a;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class PngjExceptionInternal implements Response.Listener<JSONObject> {
    private static final byte[] $$a = {118, -22, -6, 86, -20, -6, 55, -67, -3, -9, -17, -14, -13, 67, -33, -54, 4, -3, -9, 15, -41, 32, -54, 4, -3, -9, 21, -37, -15, -12, 3, -21, -38, -1, -11, 32, -39, -11, 9, -30, -6, -15, 5, -27, -9, -5, 5};
    private static final int $$b = 108;
    private PngjOutputException PngjException;

    public PngjExceptionInternal(PngjOutputException pngjOutputException) {
        this.PngjException = pngjOutputException;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:4:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, byte b, Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4 = s2 * 13;
        byte[] bArr = $$a;
        int i5 = 32 - (b * 28);
        int i6 = 99 - (s * 19);
        byte[] bArr2 = new byte[29 - i4];
        int i7 = 28 - i4;
        if (bArr == null) {
            int i8 = i7;
            int i9 = i5;
            int i10 = 0;
            int i11 = i5 + 1;
            i = (i9 + (-i8)) - 8;
            i2 = i11;
            i3 = i10;
            bArr2[i3] = (byte) i;
            i10 = i3 + 1;
            if (i3 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i8 = bArr[i2];
            int i12 = i;
            i5 = i2;
            i9 = i12;
            int i112 = i5 + 1;
            i = (i9 + (-i8)) - 8;
            i2 = i112;
            i3 = i10;
            bArr2[i3] = (byte) i;
            i10 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i = i6;
            i2 = i5;
            i3 = 0;
            bArr2[i3] = (byte) i;
            i10 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    @Override // com.android.volley.Response.Listener
    public final void onResponse(JSONObject jSONObject) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int identityHashCode = System.identityHashCode(this);
                        int i = ~((-20152334) | identityHashCode);
                        int c = a.c(~((~identityHashCode) | (-20152334)), 476, (i * 952) + ((411566514 | i) * (-476)) + 2128445707, -1759822187);
                        int i2 = c ^ (c << 13);
                        int i3 = i2 ^ (i2 >>> 17);
                        ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                        ((long[]) objArr[0])[0] = j + 4926;
                        Fpnative.valueOf = objArr;
                        this.PngjException.PngjException(jSONObject);
                        return;
                    }
                }
                this.PngjException.PngjException(jSONObject);
                return;
            } catch (Exception unused) {
                this.PngjException.PngjException(null);
                return;
            }
            byte[] bArr = $$a;
            byte b = bArr[33];
            byte b2 = (byte) (b + 1);
            Object[] objArr3 = new Object[1];
            a(b2, b2, (byte) (-b), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b3 = (byte) (-bArr[33]);
            byte b4 = b3;
            Object[] objArr4 = new Object[1];
            a(b3, b4, (byte) (b4 - 1), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1759822187);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4926;
            Fpnative.valueOf = objArr;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
