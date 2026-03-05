package com.identy.ex;

import android.os.Process;
import android.os.SystemClock;
import com.d.e.a.values;
import com.identy.Fpnative;
import com.identy.R;
import com.identy.statusupdate.CaptureStatus;
import com.karumi.dexter.BuildConfig;
import defpackage.a;
import java.lang.reflect.Method;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NO_BOXES' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class FingerError {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    public static final FingerError BACKHAND;
    public static final FingerError BE_INSIDE_GUIDE;
    public static final FingerError CORRECT;
    public static final FingerError INCORRECT_DIAGNOSIS;
    public static final FingerError LESS_BOXES;
    public static final FingerError MOVE_CLOSE;
    public static final FingerError MOVE_FAR;
    public static final FingerError NO_BOXES;
    public static final FingerError QC_ERROR;
    public static final FingerError SHOW_LOCATION_ERROR;
    public static final FingerError UNSTABLE;
    private static final /* synthetic */ FingerError[] a;
    public int res;
    public String servermeta;
    public CaptureStatus status;

    static {
        init$0();
        int i = R.string.id_no_msg;
        CaptureStatus captureStatus = CaptureStatus.NO_FINGERS;
        NO_BOXES = new FingerError("NO_BOXES", 0, i, captureStatus, "0");
        LESS_BOXES = new FingerError("LESS_BOXES", 1, i, captureStatus, BuildConfig.FLAVOR);
        INCORRECT_DIAGNOSIS = new FingerError("INCORRECT_DIAGNOSIS", 2, i, captureStatus, BuildConfig.FLAVOR);
        MOVE_FAR = new FingerError("MOVE_FAR", 3, R.string.id_hand_further_away, CaptureStatus.CLOSE, "C");
        MOVE_CLOSE = new FingerError("MOVE_CLOSE", 4, R.string.id_hand_closer, CaptureStatus.FAR, "A");
        BE_INSIDE_GUIDE = new FingerError("BE_INSIDE_GUIDE", 5, R.string.id_inside_guide, CaptureStatus.OUTSIDE, "I");
        BACKHAND = new FingerError("BACKHAND", 6, i, captureStatus, BuildConfig.FLAVOR);
        UNSTABLE = new FingerError("UNSTABLE", 7, R.string.id_stable, CaptureStatus.NOT_STABLE, "S");
        SHOW_LOCATION_ERROR = new FingerError("SHOW_LOCATION_ERROR", 8, i, captureStatus, "L");
        CORRECT = new FingerError("CORRECT", 9, 0, CaptureStatus.PLEASE_HOLD, "T");
        QC_ERROR = new FingerError("QC_ERROR", 10, R.string.id_qc, CaptureStatus.QC_ERROR, "Q");
        a = a();
    }

    private FingerError(String str, int i, int i2, CaptureStatus captureStatus, String str2) {
        this.res = i2;
        this.status = captureStatus;
        this.servermeta = str2;
    }

    private static /* synthetic */ FingerError[] a() {
        return new FingerError[]{NO_BOXES, LESS_BOXES, INCORRECT_DIAGNOSIS, MOVE_FAR, MOVE_CLOSE, BE_INSIDE_GUIDE, BACKHAND, UNSTABLE, SHOW_LOCATION_ERROR, CORRECT, QC_ERROR};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, short s2, Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4 = b + 6;
        ?? r8 = s2 + 4;
        int i5 = (s * 19) + 80;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            byte b2 = r8;
            i3 = 0;
            int i6 = r8;
            i5 = (i5 + b2) - 13;
            i = i3;
            i2 = i6 + 1;
            i3 = i + 1;
            bArr2[i] = (byte) i5;
            if (i3 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            b2 = bArr[i2];
            i6 = i2;
            i5 = (i5 + b2) - 13;
            i = i3;
            i2 = i6 + 1;
            i3 = i + 1;
            bArr2[i] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i = 0;
            i2 = r8;
            i3 = i + 1;
            bArr2[i] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{115, 31, 111, -79, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 70, -44, 47, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, -8, 24, 22, -3, 27, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12};
        $$b = 212;
    }

    public static FingerError valueOf(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int startUptimeMillis = (int) Process.getStartUptimeMillis();
                    int i = ~startUptimeMillis;
                    int c = a.c(startUptimeMillis | (-507802177), 397, (((~(i | (-21955729))) | ((~((-520845009) | i)) | 17499280)) * (-397)) - 1409829796, 1517693813);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5040;
                    Fpnative.valueOf = objArr;
                    return (FingerError) Enum.valueOf(FingerError.class, str);
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b(bArr[31], bArr[16], bArr[32], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[42];
            byte b2 = bArr[30];
            Object[] objArr4 = new Object[1];
            b(b, b2, (byte) (b2 | 72), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1517693813);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5040;
            Fpnative.valueOf = objArr;
            return (FingerError) Enum.valueOf(FingerError.class, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static FingerError[] values() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int uptimeMillis = (int) SystemClock.uptimeMillis();
                    int i = (((~((-284665206) | uptimeMillis)) | 271786293 | (~(214224074 | uptimeMillis))) * (-754)) + 2071894501;
                    int i2 = ~((-271786294) | uptimeMillis);
                    int i3 = ~uptimeMillis;
                    int c = a.c(i3 | (-284665206), 754, ((i2 | (~(486010367 | i3))) * (-754)) + i, 1529738362);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 5020;
                    Fpnative.valueOf = objArr;
                    return (FingerError[]) a.clone();
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (bArr[73] - 1), bArr[16], bArr[42], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[45];
            byte b2 = bArr[42];
            Object[] objArr4 = new Object[1];
            b(b, b2, (byte) (b2 | 28), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1529738362);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5020;
            Fpnative.valueOf = objArr;
            return (FingerError[]) a.clone();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final int getRes() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = ~Process.myPid();
                    int c = a.c((~((-715375810) | i)) | 570459200 | (~(216486529 | i)), 184, (((~(i | 786945729)) | (~((-144916610) | i))) * (-184)) - 1102424841, 1434009438);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5007;
                    Fpnative.valueOf = objArr;
                    return this.res;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (bArr[73] - 1), bArr[16], bArr[42], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[45];
            byte b2 = bArr[42];
            Object[] objArr4 = new Object[1];
            b(b, b2, (byte) (b2 | 28), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1717973014);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5007;
            Fpnative.valueOf = objArr;
            return this.res;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final String getServermeta() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = a.c((~((~System.identityHashCode(this)) | (-69304598))) | (-669381462), 241, (((~((-618787670) | r0)) | 549483072) * (-241)) - 2107501451, -1088125361);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5029;
                    Fpnative.valueOf = objArr;
                    return this.servermeta;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b(bArr[31], bArr[16], bArr[32], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[42];
            byte b2 = bArr[30];
            Object[] objArr4 = new Object[1];
            b(b, b2, (byte) (b2 | 72), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1088125361);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5029;
            Fpnative.valueOf = objArr;
            return this.servermeta;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final CaptureStatus getStatus() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int c = a.c((~((~elapsedRealtime) | 422102634)) | 76786645, 56, (((~(elapsedRealtime | 76786645)) | 422102634) * 56) + 497022071, -1581486748);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4968;
                    Fpnative.valueOf = objArr;
                    return this.status;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b(bArr[14], bArr[16], (byte) (-bArr[3]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[98];
            byte b2 = bArr[42];
            Object[] objArr4 = new Object[1];
            b(b, b2, (byte) (b2 | 122), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1581486748);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4968;
            Fpnative.valueOf = objArr;
            return this.status;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
