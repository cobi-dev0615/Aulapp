package com.identy;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.preference.PreferenceManager;
import android.util.Pair;
import java.lang.reflect.Method;
import java.util.Locale;
import org.camera.preview.ApplicationInterface;
import org.camera.preview.PngjBadCrcException;

/* loaded from: classes2.dex */
public final class PngjUnsupportedException implements ApplicationInterface {
    final onErrorResponse PngjBadCrcException;
    float PngjBadSignature;
    int PngjException;
    private final org.camera.a.PngjBadSignature PngjInputException;
    private boolean PngjUnsupportedException;
    final PngjException valueOf;
    private final FingerActivity values;
    private final float PngjOutputException = 2.0f;
    private final Rect PngjPrematureEnding = new Rect();
    private final int PngjExceptionInternal = 0;
    private int onErrorResponse = 0;

    public enum valueOf {
        Standard,
        DRO,
        HDR,
        ExpoBracketing,
        NoiseReduction;

        private static final byte[] $$a = null;
        private static final int $$b = 0;

        static {
            init$0();
        }

        private static void a(short s, short s2, short s3, Object[] objArr) {
            int i = (s2 * 19) + 80;
            byte[] bArr = $$a;
            int i2 = 78 - s;
            byte[] bArr2 = new byte[32 - s3];
            int i3 = 31 - s3;
            int i4 = -1;
            if (bArr == null) {
                int i5 = i3 + (-i2);
                i2++;
                i = i5 - 8;
                bArr = bArr;
                i4 = -1;
            }
            while (true) {
                int i6 = i4 + 1;
                bArr2[i6] = (byte) i;
                if (i6 == i3) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i7 = i;
                int i8 = i2;
                byte[] bArr3 = bArr;
                int i9 = i7 + (-bArr[i2]);
                i2 = i8 + 1;
                i = i9 - 8;
                bArr = bArr3;
                i4 = i6;
            }
        }

        public static void init$0() {
            $$a = new byte[]{7, -116, 1, 36, -20, -6, 55, -67, -3, -9, -17, -14, -13, 67, -33, -54, 4, -3, -9, 15, -41, 32, -54, 4, -3, -9, 21, -37, -15, -12, 3, -21, -38, -1, -11, 32, -39, -11, 9, -30, -6, -15, 5, -27, -9, -5, 5, -20, -6, 55, -67, -3, -9, -17, -14, -13, 67, -65, 49, -42, -38, -1, -11, 32, -39, -11, 25, -55, 7, 22, -59, 13, -10, -19, -12, 3, -14, -7, 13, -19, -17, 8, -22};
            $$b = 215;
        }

        public static valueOf valueOf(String str) {
            Object[] objArr;
            long j;
            Object[] objArr2 = Fpnative.valueOf;
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int myUid = Process.myUid();
                        int i = ~((-381084656) | myUid);
                        int i2 = ~myUid;
                        int i3 = i | (~(117804624 | i2));
                        int c = defpackage.a.c(16845840 | (~(381084655 | i2)), 516, (((~(myUid | (-100958785))) | (~(i2 | (-16845841)))) * 516) + (((i3 | r7) * (-516)) - 1087568197), 41025836);
                        int i4 = c ^ (c << 13);
                        int i5 = i4 ^ (i4 >>> 17);
                        ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                        ((long[]) objArr[0])[0] = j + 4877;
                        Fpnative.valueOf = objArr;
                        return (valueOf) Enum.valueOf(valueOf.class, str);
                    }
                }
                byte[] bArr = $$a;
                byte b = (byte) (bArr[21] - 1);
                byte b2 = bArr[2];
                Object[] objArr3 = new Object[1];
                a(b, b2, (byte) (b2 - 1), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                byte b3 = (byte) (bArr[2] - 1);
                byte b4 = (byte) (b3 + 2);
                Object[] objArr4 = new Object[1];
                a(b3, b4, (byte) (b4 | 24), objArr4);
                objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 41025836);
                j = ((long[]) objArr[0])[0];
                ((long[]) objArr[0])[0] = j + 4877;
                Fpnative.valueOf = objArr;
                return (valueOf) Enum.valueOf(valueOf.class, str);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static valueOf[] valuesCustom() {
            Object[] objArr;
            long j;
            Object[] objArr2 = Fpnative.valueOf;
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int c = defpackage.a.c((~((~((int) Process.getStartUptimeMillis())) | 235863463)) | (-263025817), 305, (((~(r0 | 235863463)) | (-263192000)) * 305) - 1958702672, 1210811437);
                        int i = c ^ (c << 13);
                        int i2 = i ^ (i >>> 17);
                        ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                        ((long[]) objArr[0])[0] = j + 4869;
                        Fpnative.valueOf = objArr;
                        return (valueOf[]) values().clone();
                    }
                }
                byte[] bArr = $$a;
                Object[] objArr3 = new Object[1];
                a((byte) 74, bArr[2], bArr[30], objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                byte b = (byte) (bArr[2] - 1);
                Object[] objArr4 = new Object[1];
                a((byte) 46, b, (byte) (b | 16), objArr4);
                objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1210811437);
                j = ((long[]) objArr[0])[0];
                ((long[]) objArr[0])[0] = j + 4869;
                Fpnative.valueOf = objArr;
                return (valueOf[]) values().clone();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    public enum values {
        ALIGNMENT_TOP,
        ALIGNMENT_CENTRE,
        ALIGNMENT_BOTTOM;

        private static final byte[] $$a = null;
        private static final int $$b = 0;

        static {
            init$0();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, byte b, int i2, Object[] objArr) {
            int i3;
            int i4;
            int i5 = 44 - i;
            int i6 = b + 4;
            int i7 = 118 - (i2 * 19);
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i5];
            if (bArr == null) {
                int i8 = i6;
                byte[] bArr3 = bArr;
                i4 = 0;
                int i9 = i5;
                int i10 = (i9 + i6) - 13;
                int i11 = i8;
                i7 = i10;
                i6 = i11;
                bArr = bArr3;
                i3 = i4;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i7;
                int i12 = i6 + 1;
                if (i4 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i13 = i7;
                i8 = i12;
                i6 = bArr[i12];
                bArr3 = bArr;
                i9 = i13;
                int i102 = (i9 + i6) - 13;
                int i112 = i8;
                i7 = i102;
                i6 = i112;
                bArr = bArr3;
                i3 = i4;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i7;
                int i122 = i6 + 1;
                if (i4 == i5) {
                }
            } else {
                i3 = 0;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i7;
                int i1222 = i6 + 1;
                if (i4 == i5) {
                }
            }
        }

        public static void init$0() {
            $$a = new byte[]{18, 103, 62, 73, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 70, -44, 47, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, -8, 24, 22, -3, 27, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12};
            $$b = 54;
        }

        public static values valueOf(String str) {
            Object[] objArr;
            long j;
            Object[] objArr2 = Fpnative.valueOf;
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int myTid = Process.myTid();
                        int i = ((~(myTid | 869898674)) * 216) - 2047907465;
                        int i2 = ~myTid;
                        int c = defpackage.a.c((~(i2 | 869898674)) | (-371009395), 216, ((937279474 | i2) * (-216)) + i, -483561348);
                        int i3 = c ^ (c << 13);
                        int i4 = i3 ^ (i3 >>> 17);
                        ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                        ((long[]) objArr[0])[0] = j + 5007;
                        Fpnative.valueOf = objArr;
                        return (values) Enum.valueOf(values.class, str);
                    }
                }
                byte[] bArr = $$a;
                byte b = bArr[63];
                byte b2 = bArr[75];
                Object[] objArr3 = new Object[1];
                a(b, b2, (byte) (b2 & 5), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                a(bArr[4], (byte) 78, bArr[32], objArr4);
                objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -483561348);
                j = ((long[]) objArr[0])[0];
                ((long[]) objArr[0])[0] = j + 5007;
                Fpnative.valueOf = objArr;
                return (values) Enum.valueOf(values.class, str);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static values[] valuesCustom() {
            Object[] objArr;
            long j;
            Object[] objArr2 = Fpnative.valueOf;
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int maxMemory = (int) Runtime.getRuntime().maxMemory();
                        int c = defpackage.a.c(maxMemory | 494394815, 744, (((~maxMemory) | 4494464) * 744) + (((((~(360094905 | maxMemory)) | (-494394816)) | (~(138794374 | maxMemory))) * (-744)) - 1307546841), -1057487933);
                        int i = c ^ (c << 13);
                        int i2 = i ^ (i >>> 17);
                        ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                        ((long[]) objArr[0])[0] = j + 5031;
                        Fpnative.valueOf = objArr;
                        return (values[]) values().clone();
                    }
                }
                byte[] bArr = $$a;
                byte b = bArr[34];
                byte b2 = (byte) (bArr[63] - 1);
                Object[] objArr3 = new Object[1];
                a(b, b2, (byte) (-b2), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                a((byte) ($$b & 239), bArr[60], bArr[63], objArr4);
                objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1057487933);
                j = ((long[]) objArr[0])[0];
                ((long[]) objArr[0])[0] = j + 5031;
                Fpnative.valueOf = objArr;
                return (values[]) values().clone();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    public PngjUnsupportedException(FingerActivity fingerActivity, Bundle bundle) {
        this.PngjException = 0;
        this.PngjBadSignature = 0.0f;
        this.values = fingerActivity;
        this.PngjBadCrcException = new onErrorResponse(fingerActivity);
        this.valueOf = new PngjException(fingerActivity);
        this.PngjInputException = new org.camera.a.PngjBadSignature(fingerActivity, this);
        if (bundle != null) {
            this.PngjException = bundle.getInt("cameraId", 0);
            this.PngjBadSignature = bundle.getFloat("focus_distance", 0.0f);
        }
    }

    private boolean getL2Score() {
        String action = this.values.getIntent().getAction();
        return "android.media.action.IMAGE_CAPTURE".equals(action) || "android.media.action.IMAGE_CAPTURE_SECURE".equals(action);
    }

    @Override // org.camera.preview.ApplicationInterface
    public final int Action() {
        if (valueOf.Standard == valueOf.DRO) {
            return 100;
        }
        valueOf valueof = valueOf.Standard;
        return 100;
    }

    @Override // org.camera.preview.ApplicationInterface
    public final boolean Attempt() {
        return valueOf.Standard == valueOf.NoiseReduction;
    }

    @Override // org.camera.preview.ApplicationInterface
    public final String PngBadCharsetException() {
        return "0";
    }

    @Override // org.camera.preview.ApplicationInterface
    public final boolean PngjBadCrcException() {
        return this.values.PngjPrematureEnding();
    }

    @Override // org.camera.preview.ApplicationInterface
    public final String PngjBadSignature() {
        try {
            return IdentySdk.getInstance().isRolledfp() ? "focus_mode_auto" : "focus_mode_continuous_picture";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // org.camera.preview.ApplicationInterface
    public final Context PngjException() {
        return this.values;
    }

    @Override // org.camera.preview.ApplicationInterface
    public final String PngjExceptionInternal() {
        return "auto";
    }

    @Override // org.camera.preview.ApplicationInterface
    public final String PngjInputException() {
        return "auto";
    }

    @Override // org.camera.preview.ApplicationInterface
    public final String PngjOutputException() {
        return "none";
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (r1.contains("SM-S911B") != false) goto L27;
     */
    @Override // org.camera.preview.ApplicationInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int PngjPrematureEnding() {
        String str;
        String str2 = "0";
        try {
            String upperCase = Build.MODEL.toUpperCase();
            String upperCase2 = Build.MANUFACTURER.toUpperCase();
            str = "-2";
            if (upperCase2.contains("HUAWEI") && upperCase.contains("LX")) {
                str2 = "-2";
            }
            if (upperCase2.contains("WHEATEK") && upperCase.contains("WP19")) {
                str2 = "-2";
            }
            if (upperCase2.contains("SAMSUNG")) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        str = str2;
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // org.camera.preview.ApplicationInterface
    public final int PngjUnsupportedException() {
        return 5000;
    }

    @Override // org.camera.preview.ApplicationInterface
    public final String a() {
        return "1";
    }

    @Override // org.camera.preview.ApplicationInterface
    public final boolean e1() {
        try {
            return IdentySdk.getInstance().isRolledfp();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // org.camera.preview.ApplicationInterface
    public final float getAsHighestSecurityLevelReached() {
        return this.PngjBadSignature;
    }

    @Override // org.camera.preview.ApplicationInterface
    public final void getCaptureTime() {
        this.values.PngjOutputException();
        org.camera.a.PngjBadSignature pngjBadSignature = this.PngjInputException;
        pngjBadSignature.getQualityScore = false;
        pngjBadSignature.isQualityFailed = 0L;
    }

    @Override // org.camera.preview.ApplicationInterface
    public final boolean getData() {
        return valueOf.Standard == valueOf.DRO;
    }

    @Override // org.camera.preview.ApplicationInterface
    public final int getFingerPrintQualityScore() {
        if (valueOf.Standard == valueOf.HDR) {
            return 3;
        }
        try {
            return Integer.parseInt("3");
        } catch (NumberFormatException unused) {
            return 3;
        }
    }

    @Override // org.camera.preview.ApplicationInterface
    public final void getL1Score() {
        if (valueOf.Standard == valueOf.NoiseReduction) {
            getL2Score();
        }
        org.camera.a.PngjBadSignature pngjBadSignature = this.PngjInputException;
        pngjBadSignature.getFingerPrintQualityScore = false;
        pngjBadSignature.getScore = false;
        pngjBadSignature.getData = false;
    }

    @Override // org.camera.preview.ApplicationInterface
    public final boolean getL3Score() {
        System.gc();
        return true;
    }

    @Override // org.camera.preview.ApplicationInterface
    public final void getMatchingTime() {
        org.camera.preview.PngjBadCrcException PngjInputException = this.values.PngjInputException();
        PngjInputException.values((org.camera.valueOf) null, PngjInputException.PngjBadCrcException.PngjException().getResources().getString(R.string.failed_to_take_picture));
    }

    @Override // org.camera.preview.ApplicationInterface
    public final void getNfiq1Score() {
        if (e1.valueOf == PngjBadCrcException.PngjBadSignature.LOW) {
            org.camera.preview.PngjBadCrcException PngjInputException = this.values.PngjInputException();
            PngjInputException.values((org.camera.valueOf) null, PngjInputException.PngjBadCrcException.PngjException().getResources().getString(R.string.camera_error));
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.values).edit();
            edit.putBoolean("camera_error", true);
            edit.apply();
            edit.commit();
        }
        this.values.PngjBadSignature();
    }

    @Override // org.camera.preview.ApplicationInterface
    public final void getOveralTimetaken() {
        if (e1.valueOf == PngjBadCrcException.PngjBadSignature.LOW) {
            org.camera.preview.PngjBadCrcException PngjInputException = this.values.PngjInputException();
            PngjInputException.values((org.camera.valueOf) null, PngjInputException.PngjBadCrcException.PngjException().getResources().getString(R.string.failed_to_start_camera_preview));
        }
        this.values.PngjBadSignature();
    }

    @Override // org.camera.preview.ApplicationInterface
    public final boolean getPadSub1() {
        valueOf valueof = valueOf.Standard;
        return valueof == valueOf.HDR || valueof == valueOf.ExpoBracketing;
    }

    @Override // org.camera.preview.ApplicationInterface
    public final int getPadSub2() {
        try {
            boolean isRolledfp = IdentySdk.getInstance().isRolledfp();
            boolean isKidsCapture = IdentySdk.getInstance().isKidsCapture();
            if (isRolledfp || isKidsCapture) {
                return LibSettings.a;
            }
            return 0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // org.camera.preview.ApplicationInterface
    public final long getPadSub3() {
        return 33333333L;
    }

    @Override // org.camera.preview.ApplicationInterface
    public final void getProcessingTime() {
        this.PngjUnsupportedException = true;
        this.values.valueOf(true);
        this.PngjInputException.getScore = true;
    }

    @Override // org.camera.preview.ApplicationInterface
    public final double getQualityScore() {
        if (valueOf.Standard == valueOf.HDR) {
            return 2.0d;
        }
        try {
            return Double.parseDouble("2");
        } catch (NumberFormatException unused) {
            return 2.0d;
        }
    }

    @Override // org.camera.preview.ApplicationInterface
    public final boolean getScore() {
        getL2Score();
        return false;
    }

    @Override // org.camera.preview.ApplicationInterface
    public final void getSpoofScore() {
        org.camera.a.PngjBadSignature pngjBadSignature = this.PngjInputException;
        pngjBadSignature.getQualityScore = false;
        pngjBadSignature.isQualityFailed = 0L;
    }

    @Override // org.camera.preview.ApplicationInterface
    public final boolean isAuthSucess() {
        valueOf valueof = valueOf.Standard;
        return false;
    }

    @Override // org.camera.preview.ApplicationInterface
    public final boolean isQualityFailed() {
        return true;
    }

    @Override // org.camera.preview.ApplicationInterface
    public final long onErrorResponse() {
        try {
            return Integer.parseInt("0") * 1000;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    @Override // org.camera.preview.ApplicationInterface
    public final String valueOf() {
        return "auto";
    }

    @Override // org.camera.preview.ApplicationInterface
    public final String values() {
        return Build.MANUFACTURER.toLowerCase(Locale.US).contains("tp-link") ? "flash_off" : "flash_torch";
    }

    public static boolean PngjBadCrcException(Activity activity) {
        try {
            if (Build.MODEL.toUpperCase().equalsIgnoreCase("SM-M127G")) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return PreferenceManager.getDefaultSharedPreferences(activity).getBoolean("camera_error", false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x087a  */
    @Override // org.camera.preview.ApplicationInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PngjException(Canvas canvas) {
        org.camera.preview.PngjBadCrcException pngjBadCrcException;
        org.cameracontroller.PngjBadSignature pngjBadSignature;
        int i;
        int i2;
        Canvas canvas2;
        float f;
        int i3;
        int i4;
        org.cameracontroller.PngjBadSignature pngjBadSignature2;
        int i5;
        int i6;
        int width;
        int height;
        float f2;
        float f3;
        long j;
        float f4;
        float f5;
        int i7;
        int i8;
        float f6;
        int i9 = 2;
        org.camera.a.PngjBadSignature pngjBadSignature3 = this.PngjInputException;
        if (!pngjBadSignature3.PngjBadSignature) {
            pngjBadSignature3.PngjBadCrcException = pngjBadSignature3.PngjException.getBoolean("identy_app_preference_show_time", true);
            pngjBadSignature3.PngjPrematureEnding = pngjBadSignature3.PngjException.getBoolean("identy_app_preference_show_angle", false);
            pngjBadSignature3.PngjOutputException = Color.parseColor(pngjBadSignature3.PngjException.getString("identy_app_preference_angle_highlight_color", "#14e715"));
            pngjBadSignature3.PngjUnsupportedException = pngjBadSignature3.PngjException.getBoolean("identy_app_preference_show_geo_direction", false);
            pngjBadSignature3.PngjExceptionInternal = pngjBadSignature3.PngjException.getBoolean("identy_app_preference_take_photo_border", true);
            pngjBadSignature3.PngjInputException = pngjBadSignature3.PngjException.getString("identy_app_preference_preview_size", "preference_preview_size_wysiwyg").equals("preference_preview_size_wysiwyg");
            pngjBadSignature3.Action = pngjBadSignature3.PngjException.getBoolean("identy_app_preference_show_angle_line", false);
            pngjBadSignature3.e1 = pngjBadSignature3.PngjException.getBoolean("identy_app_preference_show_pitch_lines", false);
            pngjBadSignature3.onErrorResponse = pngjBadSignature3.PngjException.getBoolean("identy_app_preference_show_geo_direction_lines", false);
            pngjBadSignature3.a = pngjBadSignature3.PngjException.getString("identy_app_preference_immersive_mode", "immersive_mode_low_profile").equals("immersive_mode_everything");
            pngjBadSignature3.PngBadCharsetException = pngjBadSignature3.PngjException.getString("identy_app_preference_grid", "preference_grid_none");
            pngjBadSignature3.PngjBadSignature = true;
        }
        org.camera.preview.PngjBadCrcException PngjInputException = pngjBadSignature3.values.PngjInputException();
        org.cameracontroller.PngjBadSignature pngjBadSignature4 = PngjInputException.getQualityScore;
        long currentTimeMillis = System.currentTimeMillis();
        if (PngjInputException.PngjException && (pngjBadSignature4 == null || pngjBadSignature4.PngjBadSignature())) {
            pngjBadSignature3.getPadSub1.setColor(-16777216);
            pngjBadSignature = pngjBadSignature4;
            pngjBadCrcException = PngjInputException;
            i = 0;
            i2 = 1;
            canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), pngjBadSignature3.getPadSub1);
        } else {
            pngjBadCrcException = PngjInputException;
            pngjBadSignature = pngjBadSignature4;
            i = 0;
            i2 = 1;
        }
        if (pngjBadSignature != null && pngjBadSignature3.getScore) {
            pngjBadSignature3.getPadSub1.setColor(-1);
            canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), pngjBadSignature3.getPadSub1);
        }
        if (pngjBadSignature3.values.PngjUnsupportedException().PngjException && pngjBadSignature3.a) {
            return;
        }
        if (pngjBadSignature != null && pngjBadSignature3.getFingerPrintQualityScore && !pngjBadSignature3.getScore && pngjBadSignature3.PngjExceptionInternal) {
            pngjBadSignature3.getPadSub1.setColor(-1);
            pngjBadSignature3.getPadSub1.setStyle(Paint.Style.STROKE);
            pngjBadSignature3.getPadSub1.setStrokeWidth((pngjBadSignature3.getAsHighestSecurityLevelReached * 5.0f) + 0.5f);
            canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), pngjBadSignature3.getPadSub1);
            pngjBadSignature3.getPadSub1.setStyle(Paint.Style.FILL);
            pngjBadSignature3.getPadSub1.setStrokeWidth(pngjBadSignature3.getPadSub2);
        }
        if (pngjBadSignature3.values.PngjInputException().getQualityScore != null) {
            String str = pngjBadSignature3.PngBadCharsetException;
            str.getClass();
            switch (str.hashCode()) {
                case -2062044919:
                    if (str.equals("preference_grid_diagonals")) {
                        i7 = i;
                        break;
                    }
                    i7 = -1;
                    break;
                case -1861951923:
                    if (str.equals("preference_grid_crosshair")) {
                        i7 = i2;
                        break;
                    }
                    i7 = -1;
                    break;
                case -1499749228:
                    if (str.equals("preference_grid_golden_spiral_left")) {
                        i7 = 2;
                        break;
                    }
                    i7 = -1;
                    break;
                case -1261883239:
                    if (str.equals("preference_grid_3x3")) {
                        i7 = 3;
                        break;
                    }
                    i7 = -1;
                    break;
                case -1261882279:
                    if (str.equals("preference_grid_4x2")) {
                        i7 = 4;
                        break;
                    }
                    i7 = -1;
                    break;
                case 305030335:
                    if (str.equals("preference_grid_golden_spiral_upside_down_right")) {
                        i7 = 5;
                        break;
                    }
                    i7 = -1;
                    break;
                case 563846404:
                    if (str.equals("preference_grid_golden_spiral_upside_down_left")) {
                        i7 = 6;
                        break;
                    }
                    i7 = -1;
                    break;
                case 758075183:
                    if (str.equals("preference_grid_golden_spiral_right")) {
                        i7 = 7;
                        break;
                    }
                    i7 = -1;
                    break;
                case 1473299275:
                    if (str.equals("preference_grid_phi_3x3")) {
                        i7 = 8;
                        break;
                    }
                    i7 = -1;
                    break;
                case 1925582811:
                    if (str.equals("preference_grid_golden_triangle_1")) {
                        i7 = 9;
                        break;
                    }
                    i7 = -1;
                    break;
                case 1925582812:
                    if (str.equals("preference_grid_golden_triangle_2")) {
                        i7 = 10;
                        break;
                    }
                    i7 = -1;
                    break;
                default:
                    i7 = -1;
                    break;
            }
            switch (i7) {
                case 0:
                    f = 1.0f;
                    i4 = 2;
                    i3 = i2;
                    pngjBadSignature3.getPadSub1.setColor(-1);
                    canvas.drawLine(0.0f, 0.0f, canvas.getHeight() - 1.0f, canvas.getHeight() - 1.0f, pngjBadSignature3.getPadSub1);
                    canvas.drawLine(canvas.getHeight() - 1.0f, 0.0f, 0.0f, canvas.getHeight() - 1.0f, pngjBadSignature3.getPadSub1);
                    int width2 = canvas.getWidth() - canvas.getHeight();
                    if (width2 <= 0) {
                        canvas2 = canvas;
                        break;
                    } else {
                        float f7 = width2;
                        canvas.drawLine(f7, 0.0f, (canvas.getHeight() + width2) - 1.0f, canvas.getHeight() - 1.0f, pngjBadSignature3.getPadSub1);
                        canvas2 = canvas;
                        canvas2.drawLine((canvas.getHeight() + width2) - 1.0f, 0.0f, f7, canvas.getHeight() - 1.0f, pngjBadSignature3.getPadSub1);
                        break;
                    }
                case 1:
                    f = 1.0f;
                    i4 = 2;
                    i3 = i2;
                    pngjBadSignature3.getPadSub1.setColor(-1);
                    canvas.drawLine(canvas.getWidth() / 2.0f, 0.0f, canvas.getWidth() / 2.0f, canvas.getHeight() - 1.0f, pngjBadSignature3.getPadSub1);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, canvas.getHeight() / 2.0f, canvas.getWidth() - 1.0f, canvas.getHeight() / 2.0f, pngjBadSignature3.getPadSub1);
                    break;
                case 2:
                case 5:
                case 6:
                case 7:
                    canvas2 = canvas;
                    canvas2.save();
                    String str2 = pngjBadSignature3.PngBadCharsetException;
                    str2.getClass();
                    switch (str2.hashCode()) {
                        case -1499749228:
                            if (str2.equals("preference_grid_golden_spiral_left")) {
                                i8 = i;
                                break;
                            }
                            i8 = -1;
                            break;
                        case 305030335:
                            if (str2.equals("preference_grid_golden_spiral_upside_down_right")) {
                                i8 = i2;
                                break;
                            }
                            i8 = -1;
                            break;
                        case 563846404:
                            if (str2.equals("preference_grid_golden_spiral_upside_down_left")) {
                                i8 = 2;
                                break;
                            }
                            i8 = -1;
                            break;
                        default:
                            i8 = -1;
                            break;
                    }
                    switch (i8) {
                        case 0:
                            canvas2.scale(-1.0f, 1.0f, canvas2.getWidth() * 0.5f, canvas2.getHeight() * 0.5f);
                            break;
                        case 1:
                            canvas2.scale(1.0f, -1.0f, canvas2.getWidth() * 0.5f, canvas2.getHeight() * 0.5f);
                            break;
                        case 2:
                            canvas2.rotate(180.0f, canvas2.getWidth() * 0.5f, canvas2.getHeight() * 0.5f);
                            break;
                    }
                    pngjBadSignature3.getPadSub1.setColor(-1);
                    pngjBadSignature3.getPadSub1.setStyle(Paint.Style.STROKE);
                    int width3 = canvas2.getWidth();
                    f = 1.0f;
                    int i10 = 34;
                    int i11 = i;
                    int i12 = i11;
                    int i13 = i12;
                    int i14 = (int) ((width3 * 21.0d) / 34.0d);
                    int height2 = canvas2.getHeight();
                    int i15 = width3;
                    int i16 = 21;
                    while (i12 < i9) {
                        canvas2.save();
                        int i17 = i9;
                        float f8 = i11;
                        int i18 = i2;
                        float f9 = i13;
                        int i19 = i11 + i14;
                        float f10 = i19;
                        pngjBadSignature3.getPadSub3.set(f8, f9, f10, i13 + height2);
                        canvas2.clipRect(pngjBadSignature3.getPadSub3);
                        canvas2.drawRect(pngjBadSignature3.getPadSub3, pngjBadSignature3.getPadSub1);
                        pngjBadSignature3.getPadSub3.set(f8, f9, i11 + (i14 << 1), i13 + (height2 << 1));
                        canvas2.drawOval(pngjBadSignature3.getPadSub3, pngjBadSignature3.getPadSub1);
                        canvas2.restore();
                        int i20 = i10 - i16;
                        int i21 = i15 - i14;
                        double d = height2;
                        int i22 = height2;
                        double d2 = i20;
                        int i23 = (int) ((d * d2) / i16);
                        canvas2.save();
                        float f11 = i19 + i21;
                        int i24 = i13 + i23;
                        float f12 = i24;
                        pngjBadSignature3.getPadSub3.set(f10, f9, f11, f12);
                        canvas2.clipRect(pngjBadSignature3.getPadSub3);
                        canvas2.drawRect(pngjBadSignature3.getPadSub3, pngjBadSignature3.getPadSub1);
                        pngjBadSignature3.getPadSub3.set(i19 - i21, f9, f11, i13 + (i23 << 1));
                        canvas2.drawOval(pngjBadSignature3.getPadSub3, pngjBadSignature3.getPadSub1);
                        canvas2.restore();
                        int i25 = i16 - i20;
                        int i26 = i22 - i23;
                        double d3 = i25;
                        int i27 = (int) ((i21 * d3) / d2);
                        i15 = i21 - i27;
                        int i28 = i19 + i15;
                        canvas2.save();
                        float f13 = i28 + i27;
                        float f14 = i24 + i26;
                        pngjBadSignature3.getPadSub3.set(i28, f12, f13, f14);
                        canvas2.clipRect(pngjBadSignature3.getPadSub3);
                        canvas2.drawRect(pngjBadSignature3.getPadSub3, pngjBadSignature3.getPadSub1);
                        pngjBadSignature3.getPadSub3.set(i28 - i27, i24 - i26, f13, f14);
                        canvas2.drawOval(pngjBadSignature3.getPadSub3, pngjBadSignature3.getPadSub1);
                        canvas2.restore();
                        i10 = i20 - i25;
                        int i29 = i28 - i15;
                        double d4 = i10;
                        int i30 = (int) ((i26 * d4) / d3);
                        height2 = i26 - i30;
                        int i31 = i24 + height2;
                        canvas2.save();
                        float f15 = i29;
                        float f16 = i31 + i30;
                        pngjBadSignature3.getPadSub3.set(f15, i31, i29 + i15, f16);
                        canvas2.clipRect(pngjBadSignature3.getPadSub3);
                        canvas2.drawRect(pngjBadSignature3.getPadSub3, pngjBadSignature3.getPadSub1);
                        pngjBadSignature3.getPadSub3.set(f15, i31 - i30, i29 + (i15 << 1), f16);
                        canvas2.drawOval(pngjBadSignature3.getPadSub3, pngjBadSignature3.getPadSub1);
                        canvas2.restore();
                        i16 = i25 - i10;
                        i14 = (int) ((i15 * i16) / d4);
                        i12++;
                        i13 = i31 - height2;
                        i9 = i17;
                        i2 = i18;
                        i11 = i29;
                    }
                    i4 = i9;
                    i3 = i2;
                    canvas2.restore();
                    pngjBadSignature3.getPadSub1.setStyle(Paint.Style.FILL);
                    break;
                case 3:
                    f6 = 1.0f;
                    pngjBadSignature3.getPadSub1.setColor(-1);
                    canvas.drawLine(canvas.getWidth() / 3.0f, 0.0f, canvas.getWidth() / 3.0f, canvas.getHeight() - 1.0f, pngjBadSignature3.getPadSub1);
                    canvas.drawLine((canvas.getWidth() * 2.0f) / 3.0f, 0.0f, (canvas.getWidth() * 2.0f) / 3.0f, canvas.getHeight() - 1.0f, pngjBadSignature3.getPadSub1);
                    canvas.drawLine(0.0f, canvas.getHeight() / 3.0f, canvas.getWidth() - 1.0f, canvas.getHeight() / 3.0f, pngjBadSignature3.getPadSub1);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, (canvas.getHeight() * 2.0f) / 3.0f, canvas.getWidth() - 1.0f, (canvas.getHeight() * 2.0f) / 3.0f, pngjBadSignature3.getPadSub1);
                    f = f6;
                    i4 = 2;
                    i3 = i2;
                    break;
                case 4:
                    f6 = 1.0f;
                    pngjBadSignature3.getPadSub1.setColor(-7829368);
                    canvas.drawLine(canvas.getWidth() / 4.0f, 0.0f, canvas.getWidth() / 4.0f, canvas.getHeight() - 1.0f, pngjBadSignature3.getPadSub1);
                    canvas.drawLine(canvas.getWidth() / 2.0f, 0.0f, canvas.getWidth() / 2.0f, canvas.getHeight() - 1.0f, pngjBadSignature3.getPadSub1);
                    canvas.drawLine((canvas.getWidth() * 3.0f) / 4.0f, 0.0f, (canvas.getWidth() * 3.0f) / 4.0f, canvas.getHeight() - 1.0f, pngjBadSignature3.getPadSub1);
                    canvas.drawLine(0.0f, canvas.getHeight() / 2.0f, canvas.getWidth() - 1.0f, canvas.getHeight() / 2.0f, pngjBadSignature3.getPadSub1);
                    pngjBadSignature3.getPadSub1.setColor(-1);
                    float f17 = (int) ((pngjBadSignature3.getAsHighestSecurityLevelReached * 20.0f) + 0.5f);
                    canvas.drawLine(canvas.getWidth() / 2.0f, (canvas.getHeight() / 2.0f) - f17, canvas.getWidth() / 2.0f, (canvas.getHeight() / 2.0f) + f17, pngjBadSignature3.getPadSub1);
                    canvas2 = canvas;
                    canvas2.drawLine((canvas.getWidth() / 2.0f) - f17, canvas.getHeight() / 2.0f, (canvas.getWidth() / 2.0f) + f17, canvas.getHeight() / 2.0f, pngjBadSignature3.getPadSub1);
                    f = f6;
                    i4 = 2;
                    i3 = i2;
                    break;
                case 8:
                    f6 = 1.0f;
                    pngjBadSignature3.getPadSub1.setColor(-1);
                    canvas.drawLine(canvas.getWidth() / 2.618f, 0.0f, canvas.getWidth() / 2.618f, canvas.getHeight() - 1.0f, pngjBadSignature3.getPadSub1);
                    canvas.drawLine((canvas.getWidth() * 1.618f) / 2.618f, 0.0f, (canvas.getWidth() * 1.618f) / 2.618f, canvas.getHeight() - 1.0f, pngjBadSignature3.getPadSub1);
                    canvas.drawLine(0.0f, canvas.getHeight() / 2.618f, canvas.getWidth() - 1.0f, canvas.getHeight() / 2.618f, pngjBadSignature3.getPadSub1);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, (canvas.getHeight() * 1.618f) / 2.618f, canvas.getWidth() - 1.0f, (canvas.getHeight() * 1.618f) / 2.618f, pngjBadSignature3.getPadSub1);
                    f = f6;
                    i4 = 2;
                    i3 = i2;
                    break;
                case 9:
                case 10:
                    pngjBadSignature3.getPadSub1.setColor(-1);
                    double atan2 = Math.atan2(canvas.getWidth(), canvas.getHeight());
                    double cos = Math.cos(atan2) * canvas.getHeight();
                    float sin = (float) (Math.sin(atan2) * cos);
                    float cos2 = (float) (Math.cos(atan2) * cos);
                    if (pngjBadSignature3.PngBadCharsetException.equals("preference_grid_golden_triangle_1")) {
                        f6 = 1.0f;
                        canvas.drawLine(0.0f, canvas.getHeight() - 1.0f, canvas.getWidth() - 1.0f, 0.0f, pngjBadSignature3.getPadSub1);
                        canvas.drawLine(0.0f, 0.0f, sin, canvas.getHeight() - cos2, pngjBadSignature3.getPadSub1);
                        canvas2 = canvas;
                        canvas2.drawLine((canvas.getWidth() - 1.0f) - sin, cos2 - 1.0f, canvas.getWidth() - 1.0f, canvas.getHeight() - 1.0f, pngjBadSignature3.getPadSub1);
                    } else {
                        f6 = 1.0f;
                        canvas.drawLine(0.0f, 0.0f, canvas.getWidth() - 1.0f, canvas.getHeight() - 1.0f, pngjBadSignature3.getPadSub1);
                        canvas.drawLine(canvas.getWidth() - 1.0f, 0.0f, (canvas.getWidth() - 1.0f) - sin, canvas.getHeight() - cos2, pngjBadSignature3.getPadSub1);
                        canvas2 = canvas;
                        canvas2.drawLine(sin, cos2 - 1.0f, 0.0f, canvas.getHeight() - 1.0f, pngjBadSignature3.getPadSub1);
                    }
                    f = f6;
                    i4 = 2;
                    i3 = i2;
                    break;
            }
            org.cameracontroller.PngjBadSignature pngjBadSignature5 = pngjBadSignature3.values.PngjInputException().getQualityScore;
            if (pngjBadSignature3.PngjInputException) {
                pngjBadSignature3.PngjException.getString("identy_app_preference_crop_guide", "crop_guide_none");
            }
            org.camera.preview.PngjBadCrcException PngjInputException2 = pngjBadSignature3.values.PngjInputException();
            pngjBadSignature2 = PngjInputException2.getQualityScore;
            boolean z = pngjBadSignature3.values.PngjUnsupportedException().values;
            float f18 = PngjInputException2.PngjOutputException[i];
            canvas2.save();
            canvas2.rotate(0.0f, canvas2.getWidth() / 2.0f, canvas2.getHeight() / 2.0f);
            if (pngjBadSignature2 != null || PngjInputException2.getProcessingTime == 3) {
                i5 = 21;
                if (pngjBadSignature2 == null) {
                    pngjBadSignature3.getPadSub1.setColor(-1);
                    pngjBadSignature3.getPadSub1.setTextSize((pngjBadSignature3.getAsHighestSecurityLevelReached * 14.0f) + 0.5f);
                    pngjBadSignature3.getPadSub1.setTextAlign(Paint.Align.CENTER);
                    if (PngjInputException2.getCaptureTime) {
                        PngjBadCrcException.getPadSub2 getpadsub2 = PngjBadCrcException.getPadSub2.CAMERAOPENSTATE_CLOSED;
                    }
                }
            } else {
                if (z) {
                    canvas2.getHeight();
                } else if (!z) {
                    canvas2.getHeight();
                }
                if (PngjInputException2.getProcessingTime == i3) {
                    long j2 = ((PngjInputException2.getL3Score - currentTimeMillis) + 999) / 1000;
                    if (j2 > 0) {
                        pngjBadSignature3.getPadSub1.setTextSize((pngjBadSignature3.getAsHighestSecurityLevelReached * 42.0f) + 0.5f);
                        pngjBadSignature3.getPadSub1.setTextAlign(Paint.Align.CENTER);
                        i5 = 21;
                        pngjBadSignature3.valueOf.values(canvas, pngjBadSignature3.getPadSub1, j2 < 60 ? String.valueOf(j2) : org.camera.a.PngjBadSignature.valueOf(j2), Color.rgb(244, 67, 54), -16777216, canvas.getWidth() / 2, canvas.getHeight() / 2, values.ALIGNMENT_BOTTOM, true, null);
                        canvas2 = canvas;
                    }
                }
                i5 = 21;
            }
            canvas2.restore();
            org.cameracontroller.PngjBadSignature pngjBadSignature6 = pngjBadSignature3.values.PngjInputException().getQualityScore;
            if (pngjBadSignature != null && pngjBadSignature3.getQualityScore && !pngjBadSignature3.getFingerPrintQualityScore) {
                j = currentTimeMillis - pngjBadSignature3.isQualityFailed;
                if (j > 1000) {
                    float f19 = j / 1000.0f;
                    float width4 = canvas2.getWidth() / 2.0f;
                    float height3 = canvas2.getHeight() / 2.0f;
                    float f20 = pngjBadSignature3.getAsHighestSecurityLevelReached;
                    float f21 = (f20 * 40.0f) + 0.5f;
                    float f22 = (f20 * 60.0f) + 0.5f;
                    if (f19 < 0.5f) {
                        float f23 = f19 * 2.0f;
                        f4 = (f - f23) * f21;
                        f5 = f23 * f22;
                    } else {
                        float f24 = (f19 - 0.5f) * 2.0f;
                        f4 = (f - f24) * f22;
                        f5 = f24 * f21;
                    }
                    float f25 = f5 + f4;
                    pngjBadSignature3.getPadSub1.setColor(-1);
                    pngjBadSignature3.getPadSub1.setStyle(Paint.Style.STROKE);
                    canvas2.drawCircle(width4, height3, f25, pngjBadSignature3.getPadSub1);
                    pngjBadSignature3.getPadSub1.setStyle(Paint.Style.FILL);
                } else {
                    pngjBadSignature3.getQualityScore = i;
                }
            }
            org.camera.preview.PngjBadCrcException pngjBadCrcException2 = pngjBadCrcException;
            i6 = pngjBadCrcException2.Enroll2IndexActivity;
            if ((i6 == 0 || i6 == 1 || i6 == i4) && pngjBadCrcException2.a) {
                long currentTimeMillis2 = pngjBadCrcException2.toString != -1 ? System.currentTimeMillis() - pngjBadCrcException2.toString : 0L;
                if (currentTimeMillis2 >= 350) {
                    float f26 = pngjBadSignature3.getAsHighestSecurityLevelReached;
                    float f27 = (40.0f * f26) + 0.5f;
                    float f28 = (f26 * 45.0f) + 0.5f;
                    if (currentTimeMillis2 > 0) {
                        float f29 = currentTimeMillis2 / 500.0f;
                        if (f29 > f) {
                            f29 = f;
                        }
                        if (f29 < 0.5f) {
                            float f30 = f29 * 2.0f;
                            f2 = (f - f30) * f27;
                            f3 = f30 * f28;
                        } else {
                            float f31 = (f29 - 0.5f) * 2.0f;
                            f2 = (f - f31) * f28;
                            f3 = f31 * f27;
                        }
                        f27 = f3 + f2;
                    }
                    int i32 = (int) f27;
                    int i33 = pngjBadCrcException2.Enroll2IndexActivity;
                    if (i33 == 1) {
                        pngjBadSignature3.getPadSub1.setColor(Color.rgb(20, 231, i5));
                    } else if (i33 == 2) {
                        pngjBadSignature3.getPadSub1.setColor(Color.rgb(244, 67, 54));
                    } else {
                        pngjBadSignature3.getPadSub1.setColor(-1);
                    }
                    pngjBadSignature3.getPadSub1.setStyle(Paint.Style.STROKE);
                    if (pngjBadCrcException2.setFoundMatchingTemplates) {
                        Pair pair = new Pair(Integer.valueOf(pngjBadCrcException2.ERRORS), Integer.valueOf(pngjBadCrcException2.Enroll2TActivity));
                        width = ((Integer) pair.first).intValue();
                        height = ((Integer) pair.second).intValue();
                    } else {
                        width = canvas2.getWidth() / 2;
                        height = canvas2.getHeight() / 2;
                    }
                    int i34 = height;
                    int i35 = width;
                    float f32 = i35 - i32;
                    float f33 = i34 - i32;
                    float f34 = i35;
                    float f35 = i32 * 0.5f;
                    float f36 = f34 - f35;
                    canvas2.drawLine(f32, f33, f36, f33, pngjBadSignature3.getPadSub1);
                    float f37 = f34 + f35;
                    float f38 = i35 + i32;
                    canvas.drawLine(f37, f33, f38, f33, pngjBadSignature3.getPadSub1);
                    float f39 = i32 + i34;
                    canvas.drawLine(f32, f39, f36, f39, pngjBadSignature3.getPadSub1);
                    canvas.drawLine(f37, f39, f38, f39, pngjBadSignature3.getPadSub1);
                    float f40 = i34;
                    float f41 = f40 - f35;
                    canvas.drawLine(f32, f33, f32, f41, pngjBadSignature3.getPadSub1);
                    float f42 = f40 + f35;
                    canvas.drawLine(f32, f42, f32, f39, pngjBadSignature3.getPadSub1);
                    canvas.drawLine(f38, f33, f38, f41, pngjBadSignature3.getPadSub1);
                    canvas.drawLine(f38, f42, f38, f39, pngjBadSignature3.getPadSub1);
                    pngjBadSignature3.getPadSub1.setStyle(Paint.Style.FILL);
                    return;
                }
                return;
            }
        }
        canvas2 = canvas;
        f = 1.0f;
        i4 = 2;
        i3 = i2;
        org.cameracontroller.PngjBadSignature pngjBadSignature52 = pngjBadSignature3.values.PngjInputException().getQualityScore;
        if (pngjBadSignature3.PngjInputException) {
        }
        org.camera.preview.PngjBadCrcException PngjInputException22 = pngjBadSignature3.values.PngjInputException();
        pngjBadSignature2 = PngjInputException22.getQualityScore;
        boolean z2 = pngjBadSignature3.values.PngjUnsupportedException().values;
        float f182 = PngjInputException22.PngjOutputException[i];
        canvas2.save();
        canvas2.rotate(0.0f, canvas2.getWidth() / 2.0f, canvas2.getHeight() / 2.0f);
        if (pngjBadSignature2 != null) {
        }
        i5 = 21;
        if (pngjBadSignature2 == null) {
        }
        canvas2.restore();
        org.cameracontroller.PngjBadSignature pngjBadSignature62 = pngjBadSignature3.values.PngjInputException().getQualityScore;
        if (pngjBadSignature != null) {
            j = currentTimeMillis - pngjBadSignature3.isQualityFailed;
            if (j > 1000) {
            }
        }
        org.camera.preview.PngjBadCrcException pngjBadCrcException22 = pngjBadCrcException;
        i6 = pngjBadCrcException22.Enroll2IndexActivity;
        if (i6 == 0) {
        }
    }

    private int values(Canvas canvas, Paint paint, String str, int i, int i2, int i3, int i4, values valuesVar, boolean z, Rect rect) {
        float f = this.values.getResources().getDisplayMetrics().density;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i2);
        paint.setAlpha(100);
        if (rect != null) {
            this.PngjPrematureEnding.set(rect);
        } else {
            paint.getTextBounds(str, 0, str.length(), this.PngjPrematureEnding);
        }
        int i5 = (int) ((f * 2.0f) + 0.5f);
        if (paint.getTextAlign() == Paint.Align.RIGHT || paint.getTextAlign() == Paint.Align.CENTER) {
            float measureText = paint.measureText(str);
            if (paint.getTextAlign() == Paint.Align.CENTER) {
                measureText /= 2.0f;
            }
            Rect rect2 = this.PngjPrematureEnding;
            rect2.left = (int) (rect2.left - measureText);
            rect2.right = (int) (rect2.right - measureText);
        }
        Rect rect3 = this.PngjPrematureEnding;
        rect3.left = (i3 - i5) + rect3.left;
        rect3.right = i3 + i5 + rect3.right;
        int i6 = rect3.top;
        int i7 = ((-i6) + i5) - 1;
        if (valuesVar == values.ALIGNMENT_TOP) {
            int i8 = (rect3.bottom - i6) + (i5 << 1);
            int i9 = i4 - 1;
            rect3.top = i9;
            rect3.bottom = i9 + i8;
            i4 += i7;
        } else if (valuesVar == values.ALIGNMENT_CENTRE) {
            int i10 = (rect3.bottom - i6) + (i5 << 1);
            int i11 = (int) ((((i6 + i4) - i5) + (i4 - 1)) * 0.5d);
            rect3.top = i11;
            rect3.bottom = i11 + i10;
            i4 += (int) (i7 * 0.5d);
        } else {
            rect3.top = (i4 - i5) + i6;
            rect3.bottom = i5 + i4 + rect3.bottom;
        }
        canvas.drawRect(rect3, paint);
        paint.setColor(i);
        canvas.drawText(str, i3, i4, paint);
        Rect rect4 = this.PngjPrematureEnding;
        return rect4.bottom - rect4.top;
    }

    @Override // org.camera.preview.ApplicationInterface
    public final void PngjBadSignature(boolean z) {
        org.camera.a.PngjBadSignature pngjBadSignature = this.PngjInputException;
        if (!z || pngjBadSignature.getQualityScore) {
            return;
        }
        pngjBadSignature.getQualityScore = true;
        pngjBadSignature.isQualityFailed = System.currentTimeMillis();
    }

    @Override // org.camera.preview.ApplicationInterface
    public final void PngjException(boolean z) {
        if (!z && this.PngjUnsupportedException) {
            this.values.valueOf(false);
            this.PngjUnsupportedException = false;
        }
        org.camera.a.PngjBadSignature pngjBadSignature = this.PngjInputException;
        if (z) {
            pngjBadSignature.getFingerPrintQualityScore = true;
        } else {
            pngjBadSignature.getFingerPrintQualityScore = false;
            pngjBadSignature.getScore = false;
            pngjBadSignature.getData = false;
        }
        this.values.PngjUnsupportedException();
    }
}
