package com.identy;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.identy.PngjInputException;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.Hand;
import com.identy.enums.Template;
import com.identy.ex.FingerError;
import com.identy.ex.PreCaptureOutput;
import com.identy.ex.RResult;
import com.identy.ex.SIDE;
import com.identy.ex.STATUS;
import com.karumi.dexter.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.ByteCompanionObject;
import org.camera.preview.PngjBadCrcException;
import org.identy.nativealgo.NativeAlgoUtils;
import org.identy.opencv.android.Utils;
import org.identy.opencv.core.Mat;
import org.identy.opencv.imgcodecs.Imgcodecs;
import org.identy.opencv.imgproc.Imgproc;

/* loaded from: classes2.dex */
abstract class getL3Score extends e1 {
    private static  byte[] $$d = null;
    private static  int $$e = 0;
    private static  byte[] $$l = null;
    private static  byte[] $$m = null;
    private static  int $$n = 0;
    private static  int $$o = 0;
    private static int $10;
    private static int $11;
    private static int generate;
    private static int[] pfkrolfinalize;
    private static int rgenerate;
    List configure;
    boolean configureroll;
    private String destroy;
    private float getServerRequest;
    int pfk;
    ArrayList pfkrol;
    private Handler pfkrolGetQuality;
    private List pfkrolfinalizeF;
    boolean resetAttempt;

    public class PngjBadCrcException implements Runnable {
        public PngjBadCrcException() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                getL3Score.this.getPadSub3();
            } catch (Exception e) {
                try {
                    if (LibSettings.isSaveCaptured()) {
                        e.getMessage();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public class PngjBadSignature implements Runnable {
        private /* synthetic */ Mat PngjException;

        public class PngjException implements com.identy.c.PngjBadCrcException {
            private static  byte[] $$a = null;
            private static  int $$b = 0;
            private static  byte[] $$c = null;
            private static  int $$d = 0;
            private static int $10;
            private static int $11;
            private static int PngjBadCrcException;
            private static long PngjException;
            private static int PngjOutputException;
            private static int[] values;
            private /* synthetic */ HashMap PngjBadSignature;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002f). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static String $$e(short s, byte b, byte b2) {
                int i;
                int i2;
                int i3;
                int i4 = b * 3;
                int i5 = 4 - (b2 * 2);
                byte[] bArr = $$c;
                int i6 = (s * 3) + 65;
                byte[] bArr2 = new byte[1 - i4];
                int i7 = 0 - i4;
                if (bArr == null) {
                    int i8 = i7;
                    int i9 = i5;
                    i3 = 0;
                    int i10 = i5 + 1;
                    i = i9 + (-i8);
                    i2 = i10;
                    bArr2[i3] = (byte) i;
                    if (i3 == i7) {
                        return new String(bArr2, 0);
                    }
                    i3++;
                    i8 = bArr[i2];
                    int i11 = i;
                    i5 = i2;
                    i9 = i11;
                    int i102 = i5 + 1;
                    i = i9 + (-i8);
                    i2 = i102;
                    bArr2[i3] = (byte) i;
                    if (i3 == i7) {
                    }
                } else {
                    i = i6;
                    i2 = i5;
                    i3 = 0;
                    bArr2[i3] = (byte) i;
                    if (i3 == i7) {
                    }
                }
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                PngjBadCrcException = 0;
                PngjOutputException = 1;
                values = new int[]{-574749357, -1819408349, 249075297, 1597575610, 1763943897, 126697249, -1182689085, 1858445975, -2042760805, 469055584, -1820902805, -407747802, -1342604871, -2072601855, 1604804861, 77491724, -278835602, -243545253};
                PngjException = 4138727549942454500L;
            }

            public PngjException(HashMap hashMap) {
                this.PngjBadSignature = hashMap;
            }

            /*  JADX ERROR: Types fix failed
                jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r9v155 ?? I:long), method size: 9378
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
                */
            public static java.lang.Object[] PngjBadCrcException(android.content.Context r64, int r65, int r66, int r67) {
                /*
                    Method dump skipped, instructions count: 9378
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.identy.getL3Score.PngjBadSignature.PngjException.PngjBadCrcException(android.content.Context, int, int, int):java.lang.Object[]");
            }

            private static void a(String str, int i, Object[] objArr) {
                char[] cArr;
                int i2 = ($11 + 83) % 128;
                $10 = i2;
                if (str != null) {
                    $11 = (i2 + 85) % 128;
                    cArr = str.toCharArray();
                    $11 = ($10 + 117) % 128;
                } else {
                    cArr = str;
                }
                com.d.e.ComDeA aVar = new com.d.e.ComDeA();
                char[] values2 = com.d.e.ComDeA.values(PngjException ^ 8332534422373704609L, cArr, i);
                aVar.PngjBadSignature = 4;
                while (true) {
                    int i3 = aVar.PngjBadSignature;
                    if (i3 >= values2.length) {
                        String str2 = new String(values2, 4, values2.length - 4);
                        $11 = ($10 + 79) % 128;
                        objArr[0] = str2;
                        return;
                    }
                    int i4 = i3 - 4;
                    aVar.PngjBadCrcException = i4;
                    try {
                        Object[] objArr2 = {Long.valueOf(values2[i3] ^ values2[i3 % 4]), Long.valueOf(i4), Long.valueOf(PngjException)};
                        Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1668670198);
                        if (PngjBadSignature == null) {
                            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                            int lastIndexOf = 28 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0');
                            int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
                            Class cls = Long.TYPE;
                            PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(deadChar, lastIndexOf, fadingEdgeLength, 1617260721, false, "o", new Class[]{cls, cls, cls});
                        }
                        values2[i3] = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {aVar, aVar};
                        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1405973094);
                        if (PngjBadSignature2 == null) {
                            byte b = (byte) 0;
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14829), 28 - Color.argb(0, 0, 0, 0), 721 - View.resolveSize(0, 0), -1356718115, false, $$e((byte) 14, b, b), new Class[]{Object.class, Object.class});
                        }
                        ((Method) PngjBadSignature2).invoke(null, objArr3);
                        $10 = ($11 + 15) % 128;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();

                        if (cause == null) {

                            throw new RuntimeException(th);

                        }

                        throw new RuntimeException(cause);
                    }
                }
            }

            private static void b(int[] iArr, int i, Object[] objArr) {
                long j;
                char c;
                char[] cArr;
                int[] iArr2;
                int i2;
                int i3;
                com.d.e.PngBadCharsetException pngBadCharsetException = new com.d.e.PngBadCharsetException();
                char[] cArr2 = new char[4];
                int i4 = 2;
                char[] cArr3 = new char[iArr.length * 2];
                int[] iArr3 = values;
                int i5 = 19;
                Class cls = Integer.TYPE;
                int i6 = 0;
                if (iArr3 != null) {
                    int length = iArr3.length;
                    j = 0;
                    int[] iArr4 = new int[length];
                    int i7 = 0;
                    while (i7 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                            Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(1618428774);
                            if (PngjBadSignature == null) {
                                i3 = i4;
                                byte b = (byte) i5;
                                byte b2 = (byte) i6;
                                PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((-1) - MotionEvent.axisFromString(BuildConfig.FLAVOR)), 32 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1381 - Color.red(i6), -1667748131, false, $$e(b, b2, b2), new Class[]{cls});
                            } else {
                                i3 = i4;
                            }
                            iArr4[i7] = ((Integer) ((Method) PngjBadSignature).invoke(null, objArr2)).intValue();
                            i7++;
                            i4 = i3;
                            i5 = 19;
                            i6 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();

                            if (cause == null) {

                                throw new RuntimeException(th);

                            }

                            throw new RuntimeException(cause);
                        }
                    }
                    iArr3 = iArr4;
                } else {
                    j = 0;
                }
                int i8 = i4;
                int length2 = iArr3.length;
                int[] iArr5 = new int[length2];
                int[] iArr6 = values;
                int i9 = 16;
                if (iArr6 != null) {
                    int length3 = iArr6.length;
                    int[] iArr7 = new int[length3];
                    int i10 = 0;
                    while (i10 < length3) {
                        $10 = ($11 + 43) % 128;
                        Object[] objArr3 = {Integer.valueOf(iArr6[i10])};
                        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1618428774);
                        if (PngjBadSignature2 == null) {
                            cArr = cArr2;
                            i2 = i9;
                            iArr2 = iArr6;
                            byte b3 = (byte) 0;
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 31, 1381 - (ViewConfiguration.getJumpTapTimeout() >> i9), -1667748131, false, $$e((byte) 19, b3, b3), new Class[]{cls});
                        } else {
                            cArr = cArr2;
                            iArr2 = iArr6;
                            i2 = i9;
                        }
                        iArr7[i10] = ((Integer) ((Method) PngjBadSignature2).invoke(null, objArr3)).intValue();
                        i10++;
                        i9 = i2;
                        cArr2 = cArr;
                        iArr6 = iArr2;
                    }
                    iArr6 = iArr7;
                }
                char[] cArr4 = cArr2;
                int i11 = i9;
                System.arraycopy(iArr6, 0, iArr5, 0, length2);
                pngBadCharsetException.values = 0;
                $10 = ($11 + 41) % 128;
                while (true) {
                    int i12 = pngBadCharsetException.values;
                    if (i12 >= iArr.length) {
                        objArr[0] = new String(cArr3, 0, i);
                        return;
                    }
                    $11 = ($10 + 73) % 128;
                    int i13 = iArr[i12];
                    char c2 = (char) (i13 >> 16);
                    cArr4[0] = c2;
                    char c3 = (char) i13;
                    char c4 = 1;
                    cArr4[1] = c3;
                    char c5 = (char) (iArr[i12 + 1] >> 16);
                    cArr4[i8] = c5;
                    char c6 = (char) iArr[i12 + 1];
                    cArr4[3] = c6;
                    pngBadCharsetException.PngjException = (c2 << 16) + c3;
                    pngBadCharsetException.PngjBadCrcException = (c5 << 16) + c6;
                    com.d.e.PngBadCharsetException.values(iArr5);
                    int i14 = 0;
                    while (i14 < i11) {
                        int i15 = pngBadCharsetException.PngjException ^ iArr5[i14];
                        pngBadCharsetException.PngjException = i15;
                        int PngjBadCrcException2 = com.d.e.PngBadCharsetException.PngjBadCrcException(i15);
                        Object[] objArr4 = new Object[4];
                        objArr4[3] = pngBadCharsetException;
                        objArr4[i8] = pngBadCharsetException;
                        objArr4[c4] = Integer.valueOf(PngjBadCrcException2);
                        objArr4[0] = pngBadCharsetException;
                        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-2104166611);
                        if (PngjBadSignature3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            c = c4;
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2786), 36 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), Color.red(0) + 785, 2122029718, false, $$e(b4, b5, b5), new Class[]{Object.class, cls, Object.class, Object.class});
                        } else {
                            c = c4;
                        }
                        int intValue = ((Integer) ((Method) PngjBadSignature3).invoke(null, objArr4)).intValue();
                        pngBadCharsetException.PngjException = pngBadCharsetException.PngjBadCrcException;
                        pngBadCharsetException.PngjBadCrcException = intValue;
                        i14++;
                        c4 = c;
                        i11 = 16;
                    }
                    char c7 = c4;
                    int i16 = pngBadCharsetException.PngjException;
                    int i17 = pngBadCharsetException.PngjBadCrcException;
                    pngBadCharsetException.PngjException = i17;
                    pngBadCharsetException.PngjBadCrcException = i16;
                    i11 = 16;
                    int i18 = i16 ^ iArr5[16];
                    pngBadCharsetException.PngjBadCrcException = i18;
                    int i19 = i17 ^ iArr5[17];
                    pngBadCharsetException.PngjException = i19;
                    cArr4[0] = (char) (i19 >>> 16);
                    cArr4[c7] = (char) i19;
                    cArr4[i8] = (char) (i18 >>> 16);
                    cArr4[3] = (char) i18;
                    com.d.e.PngBadCharsetException.values(iArr5);
                    int i20 = pngBadCharsetException.values;
                    cArr3[i20 * 2] = cArr4[0];
                    cArr3[(i20 * 2) + 1] = cArr4[c7];
                    cArr3[(i20 * 2) + 2] = cArr4[i8];
                    cArr3[(i20 * 2) + 3] = cArr4[3];
                    int i21 = i8;
                    Object[] objArr5 = new Object[i21];
                    objArr5[c7] = pngBadCharsetException;
                    objArr5[0] = pngBadCharsetException;
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-800662452);
                    if (PngjBadSignature4 == null) {
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) KeyEvent.getDeadChar(0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21, 28 - ExpandableListView.getPackedPositionChild(j), 749318647, false, "E", new Class[]{Object.class, Object.class});
                    }
                    ((Method) PngjBadSignature4).invoke(null, objArr5);
                    i8 = i21;
                }
            }

            private static void c(byte b, int i, int i2, Object[] objArr) {
                int i3 = 7 - i;
                int i4 = i2 + 80;
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[13 - b];
                int i5 = 12 - b;
                int i6 = -1;
                if (bArr == null) {
                    i4 = (-i3) + i5;
                    i3++;
                    bArr = bArr;
                    i6 = -1;
                }
                while (true) {
                    int i7 = i6 + 1;
                    bArr2[i7] = (byte) i4;
                    if (i7 == i5) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    int i8 = i4;
                    byte[] bArr3 = bArr;
                    i4 = (-bArr[i3]) + i8;
                    i3++;
                    bArr = bArr3;
                    i6 = i7;
                }
            }

            public static void init$0() {
                $$a = new byte[]{5, -80, 22, 85, 10, -5, 52, -30, 7, -3, 37, -51, 21, -2, -11, -4, 11, -6, 1};
                $$b = 88;
            }

            public static void init$1() {
                $$c = new byte[]{70, 91, ByteCompanionObject.MAX_VALUE, -16};
                $$d = 186;
            }

            @Override // com.identy.c.PngjBadCrcException
            public final void valueOf() {
                int i = (PngjBadCrcException + 77) % 128;
                PngjOutputException = i;
                getL3Score getl3score = getL3Score.this;
                int i2 = getl3score.getShortform - 1;
                getl3score.getShortform = i2;
                if (i2 <= 0) {
                    PngjBadCrcException = (i + 55) % 128;
                    long timeInMillis = Calendar.getInstance().getTimeInMillis();
                    getL3Score getl3score2 = getL3Score.this;
                    getl3score.Enroll2IndexActivity = (int) (timeInMillis - getl3score2.EnrollThumbActivity);
                    long timeInMillis2 = Calendar.getInstance().getTimeInMillis();
                    getL3Score getl3score3 = getL3Score.this;
                    getl3score2.toString = (int) (timeInMillis2 - getl3score3.Capture4FActivity);
                    getl3score3.valueOf();
                    com.identy.d.PngjBadSignature pngjBadSignature = getL3Score.this.Attempt;
                    if (pngjBadSignature != null) {
                        PngjBadCrcException = (PngjOutputException + 35) % 128;
                        pngjBadSignature.PngjException(this.PngjBadSignature, null, null, true, false);
                    }
                }
            }
        }

        public PngjBadSignature(Mat mat) {
            this.PngjException = mat;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IdentySdk identySdk;
            try {
                StringBuilder sb = new StringBuilder(" cap ");
                sb.append(String.valueOf(this.PngjException == null));
                getPadSub2.PngjException("FINISH ONE SIDE ", sb.toString());
                RResult PngjBadCrcException = getL3Score.this.PngjBadCrcException(this.PngjException);
                getL3Score.this.configureroll = false;
                if (PngjBadCrcException == null || !PngjBadCrcException.isDone()) {
                    getL3Score.this.a();
                } else {
                    a aVar = new a(0, getL3Score.this.CapturePosition.getHand(), getL3Score.this.CapturePosition.getFinger(), getL3Score.this.CapturePosition, true);
                    ((FingerActivity) getL3Score.this.Action).Action.PngjException();
                    getL3Score.this.PngjException(R.string.id_processing);
                    Mat mat = new Mat(Fpnative.pfkrolfinalizeF(e1.PngjBadCrcException));
                    aVar.values(mat);
                    PngjBadCrcException.quality = Fpnative.pfkrolGetQuality(e1.PngjBadCrcException);
                    aVar.PngjUnsupportedException = (int) PngjBadCrcException.getQuality();
                    aVar.PngjException = PngjBadCrcException.getQuality();
                    HashMap hashMap = new HashMap();
                    hashMap.put(new Pair(aVar.values(), aVar.PngjBadSignature()), aVar);
                    getL3Score getl3score = getL3Score.this;
                    int Attempt = getl3score.Attempt();
                    com.identy.d.PngjBadSignature pngjBadSignature = getl3score.Attempt;
                    if (pngjBadSignature != null) {
                        pngjBadSignature.PngjBadSignature(Attempt, false);
                    }
                    if (LibSettings.isSaveCaptured()) {
                        Bitmap createBitmap = Bitmap.createBitmap(Mat.n_cols(mat.PngjException), Mat.n_rows(mat.PngjException), Bitmap.Config.ARGB_8888);
                        Utils.PngjBadSignature(mat, createBitmap);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        getL3Score getl3score2 = getL3Score.this;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(e1.PngjUnsupportedException);
                        sb2.append("_captured");
                        getl3score2.PngjBadSignature(byteArray, sb2.toString(), "CAPTURED", BuildConfig.FLAVOR);
                        createBitmap.recycle();
                    }
                    try {
                        identySdk = IdentySdk.getInstance();
                    } catch (Exception e) {
                        e.printStackTrace();
                        identySdk = null;
                    }
                    IdentySdk identySdk2 = identySdk;
                    Template[] templateArr = (Template[]) identySdk2.p().keySet().toArray(new Template[identySdk2.p().keySet().size()]);
                    getL3Score.this.getShortform = 1;
                    PngjException pngjException = new PngjException(hashMap);
                    if (getL3Score.this.getShortform == 0) {
                        pngjException.valueOf();
                    }
                    Iterator it = hashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        try {
                            ((a) ((Map.Entry) it.next()).getValue()).PngjException(templateArr, identySdk2.getWSQCompression(), IdentySdk.getInstance().getAction().equals(Action.ENROLL), pngjException);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                getL3Score.this.getFingers.quitSafely();
            } catch (Throwable th) {
                getL3Score.this.getFingers.quitSafely();
                throw th;
            }
        }
    }

    public class PngjException implements Runnable {
        public PngjException() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.identy.ui.d.values valuesVar;
            com.identy.ui.d.values valuesVar2;
            com.identy.ui.d.values valuesVar3;
            com.identy.ui.d.values valuesVar4;
            com.identy.ui.d.values valuesVar5;
            com.identy.ui.d.values valuesVar6;
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            try {
                try {
                    getL3Score.this.PngBadCharsetException();
                    Mat mat = getL3Score.this.getFingerPrintQualityScore;
                    if (mat == null || Mat.n_empty(mat.PngjException)) {
                        getL3Score getl3score = getL3Score.this;
                        getl3score.getCaptureTime = false;
                        try {
                            if (getl3score.Capture2TActivity != null && (valuesVar3 = getl3score.getL2Score) != null) {
                                valuesVar3.values(getl3score.configure);
                                getL3Score.this.Capture2TActivity.postInvalidate();
                            }
                            getL3Score getl3score2 = getL3Score.this;
                            Calendar.getInstance().getTimeInMillis();
                            getl3score2.getCaptureTime = false;
                            com.identy.d.PngjBadSignature pngjBadSignature = getl3score2.Attempt;
                            if (pngjBadSignature != null) {
                                pngjBadSignature.getData();
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            e.printStackTrace();
                            return;
                        }
                    }
                    getL3Score getl3score3 = getL3Score.this;
                    if (getl3score3.onErrorResponse) {
                        try {
                            if (getl3score3.Capture2TActivity != null && (valuesVar4 = getl3score3.getL2Score) != null) {
                                valuesVar4.values(getl3score3.configure);
                                getL3Score.this.Capture2TActivity.postInvalidate();
                            }
                            getL3Score getl3score4 = getL3Score.this;
                            Calendar.getInstance().getTimeInMillis();
                            getl3score4.getCaptureTime = false;
                            com.identy.d.PngjBadSignature pngjBadSignature2 = getl3score4.Attempt;
                            if (pngjBadSignature2 != null) {
                                pngjBadSignature2.getData();
                                return;
                            }
                            return;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return;
                        }
                    }
                    if (getl3score3.configureroll) {
                        try {
                            if (getl3score3.Capture2TActivity != null && (valuesVar5 = getl3score3.getL2Score) != null) {
                                valuesVar5.values(getl3score3.configure);
                                getL3Score.this.Capture2TActivity.postInvalidate();
                            }
                            getL3Score getl3score5 = getL3Score.this;
                            Calendar.getInstance().getTimeInMillis();
                            getl3score5.getCaptureTime = false;
                            com.identy.d.PngjBadSignature pngjBadSignature3 = getl3score5.Attempt;
                            if (pngjBadSignature3 != null) {
                                pngjBadSignature3.getData();
                                return;
                            }
                            return;
                        } catch (Exception e3) {
                            e3.printStackTrace();
                            return;
                        }
                    }
                    if (getl3score3.CaptureMode != 0 && timeInMillis > 15000) {
                        getl3score3.CaptureMode = 0L;
                    }
                    RResult values = getl3score3.values(new Mat(Mat.n_clone(getl3score3.getFingerPrintQualityScore.PngjException)));
                    PreCaptureOutput preCaptureOutput = values.getPreCaptureOutput();
                    if (values.getStatus().equals(STATUS.PRECAPTURE_ERROR)) {
                        FingerError error = values.getPreCaptureOutput().getError();
                        FingerError fingerError = FingerError.NO_BOXES;
                        if (error == fingerError || values.getPreCaptureOutput().getError() == FingerError.INCORRECT_DIAGNOSIS) {
                            getL3Score getl3score6 = getL3Score.this;
                            getl3score6.resetAttempt = true;
                            getl3score6.pfk++;
                        }
                        if (preCaptureOutput.getError() != null) {
                            if (preCaptureOutput.getError().equals(fingerError)) {
                                getL3Score.this.configure.clear();
                                getL3Score getl3score7 = getL3Score.this;
                                int res = preCaptureOutput.getError().getRes();
                                com.identy.d.PngjBadSignature pngjBadSignature4 = getl3score7.Attempt;
                                if (pngjBadSignature4 != null) {
                                    pngjBadSignature4.PngjBadSignature(res, true);
                                }
                            } else {
                                getL3Score getl3score8 = getL3Score.this;
                                getl3score8.configure = getl3score8.getSpoofScore;
                                if (preCaptureOutput.getError().equals(FingerError.CORRECT)) {
                                    getL3Score.this.PngjBadCrcException(3 - preCaptureOutput.getStreakCount());
                                } else {
                                    getL3Score getl3score9 = getL3Score.this;
                                    int res2 = preCaptureOutput.getError().getRes();
                                    com.identy.d.PngjBadSignature pngjBadSignature5 = getl3score9.Attempt;
                                    if (pngjBadSignature5 != null) {
                                        pngjBadSignature5.PngjBadSignature(res2, true);
                                    }
                                }
                            }
                        }
                    } else {
                        getL3Score getl3score10 = getL3Score.this;
                        getl3score10.configure = getl3score10.getSpoofScore;
                        int message = values.getStatus().getMessage();
                        com.identy.d.PngjBadSignature pngjBadSignature6 = getl3score10.Attempt;
                        if (pngjBadSignature6 != null) {
                            pngjBadSignature6.PngjBadSignature(message, true);
                        }
                    }
                    getL3Score.this.getSpoofScore = preCaptureOutput.getRecog(null, false);
                    getL3Score getl3score11 = getL3Score.this;
                    getl3score11.configure = getl3score11.getSpoofScore;
                    if (values.isReadyForCapture() && !values.isSideDone()) {
                        getL3Score getl3score12 = getL3Score.this;
                        getl3score12.resetAttempt = true;
                        getl3score12.configureroll = false;
                        getl3score12.pfk++;
                        org.camera.preview.PngjBadCrcException pngjBadCrcException = ((FingerActivity) getl3score12.Action).Action;
                        try {
                            pngjBadCrcException.getQualityScore.Attempt();
                            if (pngjBadCrcException.getQualityScore.PngjBadSignature(0.0f)) {
                                try {
                                    LibSettings.isSaveCaptured();
                                } catch (Exception e4) {
                                    e4.printStackTrace();
                                }
                            }
                        } catch (Exception e5) {
                            e5.getMessage();
                            try {
                                LibSettings.isSaveCaptured();
                            } catch (Exception e6) {
                                e6.printStackTrace();
                            }
                        }
                        getL3Score.this.Attempt.getScore();
                    }
                    if (values.isSideDone()) {
                        getL3Score getl3score13 = getL3Score.this;
                        getl3score13.configureroll = true;
                        getl3score13.onErrorResponse = true;
                        if (((SIDE) getl3score13.pfkrol.get(0)).equals(SIDE.CENTER)) {
                            getL3Score.this.PngjOutputException();
                            getL3Score getl3score14 = getL3Score.this;
                            int i = R.string.id_capturing;
                            com.identy.d.PngjBadSignature pngjBadSignature7 = getl3score14.Attempt;
                            if (pngjBadSignature7 != null) {
                                pngjBadSignature7.PngjBadSignature(i, false);
                            }
                            getL3Score.this.PngjBadCrcException(0);
                        } else {
                            getL3Score.this.PngjException((Mat) null);
                        }
                    }
                    try {
                        getL3Score getl3score15 = getL3Score.this;
                        if (getl3score15.Capture2TActivity != null && (valuesVar6 = getl3score15.getL2Score) != null) {
                            valuesVar6.values(getl3score15.configure);
                            getL3Score.this.Capture2TActivity.postInvalidate();
                        }
                        getL3Score getl3score16 = getL3Score.this;
                        Calendar.getInstance().getTimeInMillis();
                        getl3score16.getCaptureTime = false;
                        com.identy.d.PngjBadSignature pngjBadSignature8 = getl3score16.Attempt;
                        if (pngjBadSignature8 != null) {
                            pngjBadSignature8.getData();
                        }
                    } catch (Exception e7) {
                        e7.printStackTrace();
                    }
                } catch (Exception e8) {
                    try {
                        if (LibSettings.isSaveCaptured()) {
                            e8.getMessage();
                        }
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                    Arrays.toString(e8.getStackTrace());
                    try {
                        LibSettings.isSaveCaptured();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    try {
                        getL3Score getl3score17 = getL3Score.this;
                        if (getl3score17.Capture2TActivity != null && (valuesVar2 = getl3score17.getL2Score) != null) {
                            valuesVar2.values(getl3score17.configure);
                            getL3Score.this.Capture2TActivity.postInvalidate();
                        }
                        getL3Score getl3score18 = getL3Score.this;
                        Calendar.getInstance().getTimeInMillis();
                        getl3score18.getCaptureTime = false;
                        com.identy.d.PngjBadSignature pngjBadSignature9 = getl3score18.Attempt;
                        if (pngjBadSignature9 != null) {
                            pngjBadSignature9.getData();
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            } catch (Throwable th) {
                try {
                    getL3Score getl3score19 = getL3Score.this;
                    if (getl3score19.Capture2TActivity != null && (valuesVar = getl3score19.getL2Score) != null) {
                        valuesVar.values(getl3score19.configure);
                        getL3Score.this.Capture2TActivity.postInvalidate();
                    }
                    getL3Score getl3score20 = getL3Score.this;
                    Calendar.getInstance().getTimeInMillis();
                    getl3score20.getCaptureTime = false;
                    com.identy.d.PngjBadSignature pngjBadSignature10 = getl3score20.Attempt;
                    if (pngjBadSignature10 != null) {
                        pngjBadSignature10.getData();
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                throw th;
            }
        }
    }

    public class valueOf implements Runnable {
        public valueOf() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long j = e1.PngjBadCrcException;
            if (j != 0) {
                Fpnative.destroy(j, e1.values);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$r(short s, int i, short s2) {
        int i2;
        int i3;
        byte[] bArr = $$l;
        int i4 = 1 - (s * 2);
        int i5 = 122 - (s2 * 57);
        int i6 = 4 - (i * 2);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            int i8 = i6;
            int i9 = i8 + 1;
            i5 = i6 + (-i7);
            i6 = i9;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i6];
            int i10 = i5;
            i8 = i6;
            i6 = i10;
            int i92 = i8 + 1;
            i5 = i6 + (-i7);
            i6 = i92;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        rgenerate = 0;
        generate = 1;
        pfkrolfinalize = new int[]{154365777, 627796412, -1540720954, -2023022356, 129519842, -1981281180, 1097167136, -594775756, -375318303, -819052103, -1125954916, 1525089317, -1213802796, 1003996461, 244224866, -263232076, -275700061, -2052345053};
    }

    public getL3Score(Activity activity, com.identy.d.PngjBadSignature pngjBadSignature, FingerDetectionMode fingerDetectionMode, Finger[] fingerArr, boolean z, boolean z2) {
        super(activity, z2, fingerDetectionMode, true, true);
        this.configureroll = false;
        this.pfk = 0;
        this.destroy = "focus_mode_continuous_video";
        this.configure = new LinkedList();
        this.pfkrol = new ArrayList();
        this.getServerRequest = 1.0f;
        this.resetAttempt = true;
        new NativeAlgoUtils();
        this.pfkrol.add(SIDE.CENTER);
        this.pfkrol.add(SIDE.LEFT);
        this.pfkrol.add(SIDE.RIGHT);
        this.getProcessingTime = 1;
        this.isAuthSucess = new StringBuilder();
        this.Action = activity;
        this.Attempt = pngjBadSignature;
        this.pfkrolGetQuality = new Handler(this.Action.getMainLooper());
        e1.PngjOutputException = 0L;
        this.getOveralTimetaken = new float[0];
        this.a = fingerDetectionMode.getHand();
        this.pfkrolfinalizeF = new ArrayList(Arrays.asList(fingerArr));
        this.getL3Score = z;
        int PngjBadCrcException2 = PngjBadCrcException.onErrorResponse.PngjBadCrcException();
        this.Capture2IndexActivity = new PngjOutputException((Pair[]) PngjException(PngjBadCrcException.onErrorResponse.PngjBadCrcException(), 1616550217, -1616550216, new Object[]{this}, PngjBadCrcException.onErrorResponse.PngjBadCrcException(), PngjBadCrcException.onErrorResponse.PngjBadCrcException(), PngjBadCrcException2));
        int Attempt = Attempt();
        com.identy.d.PngjBadSignature pngjBadSignature2 = this.Attempt;
        if (pngjBadSignature2 != null) {
            pngjBadSignature2.PngjBadSignature(Attempt, false);
        }
    }

    private static /* synthetic */ Object PngjBadSignature(Object[] objArr) {
        getL3Score getl3score = (getL3Score) objArr[0];
        Mat mat = (Mat) objArr[1];
        HandlerThread handlerThread = new HandlerThread("post processing");
        getl3score.getFingers = handlerThread;
        handlerThread.start();
        new Handler(getl3score.getFingers.getLooper()).post(getl3score.new PngjBadSignature(mat));
        int i = generate + 5;
        rgenerate = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Object PngjException(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~((~i3) | i2 | i6);
        int i8 = ~((~i2) | i3);
        int i9 = ~i6;
        int i10 = i8 | (~(i9 | i3));
        int i11 = ~(i9 | i2);
        int i12 = (1617068012 * i4) + ((-1568348280) * i5) + i3 + i2 + i;
        int i13 = i12 * i12;
        int i14 = (858456064 * i13) + (1743781888 * i4) + ((-1885339648) * i5) + (557056000 * i) + (987930861 * i11) + ((-987930861) * i10) + (i7 * 987930861) + (1544986862 * i2) + (((-430874860) * i3) - 739508224);
        int i15 = i11 * 945;
        int i16 = i * (-973780651);
        int i17 = i5 * 424585256;
        int i18 = i4 * 537576796;
        int i19 = i13 * 1078394880;
        int i20 = i19 + i18 + i17 + i16 + i15 + (i10 * (-945)) + (i7 * 945) + (i2 * (-973779706)) + (i3 * (-973781596)) + 539565670;
        int i21 = (i20 * i20 * 192741376) + i14;
        if (i21 != 1) {
            return i21 != 2 ? PngjBadSignature(objArr) : PngjException(objArr);
        }
        getL3Score getl3score = (getL3Score) objArr[0];
        ArrayList arrayList = new ArrayList();
        Iterator it = getl3score.pfkrolfinalizeF.iterator();
        while (it.hasNext()) {
            arrayList.add(new Pair(getl3score.a, (Finger) it.next()));
            rgenerate = (generate + 111) % 128;
        }
        return (Pair[]) arrayList.toArray(new Pair[arrayList.size()]);
    }

    private static void e(int[] iArr, int i, Object[] objArr) {
        int i2;
        int i3;
        int i4;
        char c;
        char[] cArr;
        int[] iArr2;
        int i5;
        int i6;
        com.d.e.PngBadCharsetException pngBadCharsetException = new com.d.e.PngBadCharsetException();
        char[] cArr2 = new char[4];
        int i7 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr3 = pfkrolfinalize;
        Class cls = Integer.TYPE;
        int i8 = 16;
        int i9 = 0;
        if (iArr3 != null) {
            $11 = ($10 + 23) % 128;
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i10])};
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1618428774);
                    if (PngjBadSignature2 == null) {
                        i5 = i7;
                        i6 = i8;
                        byte b = (byte) i9;
                        byte b2 = b;
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, i9, i9), 31 - View.MeasureSpec.makeMeasureSpec(i9, i9), (KeyEvent.getMaxKeyCode() >> 16) + 1381, -1667748131, false, $$r(b, b2, b2), new Class[]{cls});
                    } else {
                        i5 = i7;
                        i6 = i8;
                    }
                    iArr4[i10] = ((Integer) ((Method) PngjBadSignature2).invoke(null, objArr2)).intValue();
                    i10++;
                    i7 = i5;
                    i8 = i6;
                    i9 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();

                    if (cause == null) {

                        throw new RuntimeException(th);

                    }

                    throw new RuntimeException(cause);
                }
            }
            i2 = i7;
            i3 = i8;
            i4 = 1618428774;
            $11 = ($10 + 101) % 128;
            iArr3 = iArr4;
        } else {
            i2 = 2;
            i3 = 16;
            i4 = 1618428774;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = pfkrolfinalize;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                int i12 = $11 + 69;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    Object[] objArr3 = {Integer.valueOf(iArr6[i11])};
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i4);
                    if (PngjBadSignature3 == null) {
                        cArr = cArr2;
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        iArr2 = iArr6;
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) Drawable.resolveOpacity(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 31, 1380 - Process.getGidForName(BuildConfig.FLAVOR), -1667748131, false, $$r(b3, b4, b4), new Class[]{cls});
                    } else {
                        cArr = cArr2;
                        iArr2 = iArr6;
                    }
                    iArr7[i11] = ((Integer) ((Method) PngjBadSignature3).invoke(null, objArr3)).intValue();
                } else {
                    cArr = cArr2;
                    iArr2 = iArr6;
                    Object[] objArr4 = {Integer.valueOf(iArr2[i11])};
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i4);
                    if (PngjBadSignature4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getFadingEdgeLength() >> 16), Color.blue(0) + 31, MotionEvent.axisFromString(BuildConfig.FLAVOR) + 1382, -1667748131, false, $$r(b5, b6, b6), new Class[]{cls});
                    }
                    iArr7[i11] = ((Integer) ((Method) PngjBadSignature4).invoke(null, objArr4)).intValue();
                    i11++;
                }
                cArr2 = cArr;
                iArr6 = iArr2;
            }
            iArr6 = iArr7;
        }
        char[] cArr4 = cArr2;
        char c2 = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        pngBadCharsetException.values = 0;
        while (true) {
            int i13 = pngBadCharsetException.values;
            if (i13 >= iArr.length) {
                objArr[0] = new String(cArr3, 0, i);
                return;
            }
            int i14 = iArr[i13];
            char c3 = (char) (i14 >> 16);
            cArr4[c2] = c3;
            char c4 = (char) i14;
            char c5 = 1;
            cArr4[1] = c4;
            char c6 = (char) (iArr[i13 + 1] >> 16);
            cArr4[i2] = c6;
            char c7 = (char) iArr[i13 + 1];
            cArr4[3] = c7;
            pngBadCharsetException.PngjException = (c3 << 16) + c4;
            pngBadCharsetException.PngjBadCrcException = (c6 << 16) + c7;
            com.d.e.PngBadCharsetException.values(iArr5);
            int i15 = 0;
            while (i15 < i3) {
                int i16 = $10 + 19;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = pngBadCharsetException.PngjException ^ iArr5[i15];
                    pngBadCharsetException.PngjException = i17;
                    int PngjBadCrcException2 = com.d.e.PngBadCharsetException.PngjBadCrcException(i17);
                    Object[] objArr5 = new Object[4];
                    objArr5[3] = pngBadCharsetException;
                    objArr5[i2] = pngBadCharsetException;
                    objArr5[c5] = Integer.valueOf(PngjBadCrcException2);
                    objArr5[0] = pngBadCharsetException;
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-2104166611);
                    if (PngjBadSignature5 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (Process.getGidForName(BuildConfig.FLAVOR) + 2787), 36 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 784, 2122029718, false, $$r(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, cls, Object.class, Object.class});
                    }
                    int intValue = ((Integer) ((Method) PngjBadSignature5).invoke(null, objArr5)).intValue();
                    pngBadCharsetException.PngjException = pngBadCharsetException.PngjBadCrcException;
                    pngBadCharsetException.PngjBadCrcException = intValue;
                    i15 += 83;
                } else {
                    int i18 = pngBadCharsetException.PngjException ^ iArr5[i15];
                    pngBadCharsetException.PngjException = i18;
                    int PngjBadCrcException3 = com.d.e.PngBadCharsetException.PngjBadCrcException(i18);
                    Object[] objArr6 = new Object[4];
                    objArr6[3] = pngBadCharsetException;
                    objArr6[i2] = pngBadCharsetException;
                    objArr6[c5] = Integer.valueOf(PngjBadCrcException3);
                    objArr6[0] = pngBadCharsetException;
                    Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-2104166611);
                    if (PngjBadSignature6 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        c = c5;
                        PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 2786), (ViewConfiguration.getTapTimeout() >> 16) + 36, 785 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), 2122029718, false, $$r(b9, b10, (byte) (b10 + 1)), new Class[]{Object.class, cls, Object.class, Object.class});
                    } else {
                        c = c5;
                    }
                    int intValue2 = ((Integer) ((Method) PngjBadSignature6).invoke(null, objArr6)).intValue();
                    pngBadCharsetException.PngjException = pngBadCharsetException.PngjBadCrcException;
                    pngBadCharsetException.PngjBadCrcException = intValue2;
                    i15++;
                    c5 = c;
                }
                i3 = 16;
            }
            char c8 = c5;
            int i19 = pngBadCharsetException.PngjException;
            int i20 = pngBadCharsetException.PngjBadCrcException;
            pngBadCharsetException.PngjException = i20;
            pngBadCharsetException.PngjBadCrcException = i19;
            i3 = 16;
            int i21 = i19 ^ iArr5[16];
            pngBadCharsetException.PngjBadCrcException = i21;
            int i22 = i20 ^ iArr5[17];
            pngBadCharsetException.PngjException = i22;
            cArr4[0] = (char) (i22 >>> 16);
            cArr4[c8] = (char) i22;
            cArr4[i2] = (char) (i21 >>> 16);
            cArr4[3] = (char) i21;
            com.d.e.PngBadCharsetException.values(iArr5);
            int i23 = pngBadCharsetException.values;
            cArr3[i23 * 2] = cArr4[0];
            cArr3[(i23 * 2) + 1] = cArr4[c8];
            cArr3[(i23 * 2) + 2] = cArr4[i2];
            cArr3[(i23 * 2) + 3] = cArr4[3];
            int i24 = i2;
            Object[] objArr7 = new Object[i24];
            objArr7[c8] = pngBadCharsetException;
            objArr7[0] = pngBadCharsetException;
            Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-800662452);
            if (PngjBadSignature7 == null) {
                PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) Drawable.resolveOpacity(0, 0), 23 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 29 - KeyEvent.normalizeMetaState(0), 749318647, false, "E", new Class[]{Object.class, Object.class});
            }
            ((Method) PngjBadSignature7).invoke(null, objArr7);
            i2 = i24;
            c2 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(byte b, byte b2, byte b3, Object[] objArr) {
        int i;
        byte[] bArr = $$d;
        int i2 = 118 - (b3 * 38);
        int i3 = 38 - b;
        byte[] bArr2 = new byte[19 - b2];
        int i4 = 18 - b2;
        if (bArr == null) {
            int i5 = i3;
            int i6 = i4;
            i = 0;
            int i7 = i5;
            i2 = i3 + (-i6) + 5;
            i3 = i7;
            bArr2[i] = (byte) i2;
            if (i == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i3 + 1;
            i6 = bArr[i8];
            i++;
            int i9 = i2;
            i5 = i8;
            i3 = i9;
            int i72 = i5;
            i2 = i3 + (-i6) + 5;
            i3 = i72;
            bArr2[i] = (byte) i2;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            if (i == i4) {
            }
        }
    }

    private static void g(int i, short s, short s2, Object[] objArr) {
        int i2 = s2 + 4;
        int i3 = (s * 31) + 80;
        byte[] bArr = $$m;
        int i4 = i * 32;
        byte[] bArr2 = new byte[i4 + 16];
        int i5 = i4 + 15;
        int i6 = -1;
        if (bArr == null) {
            i3 = i5 + (-i3) + 2;
            i2 = i2;
            bArr = bArr;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            int i8 = i2 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = i3 + (-bArr[i8]) + 2;
            i2 = i8;
            bArr = bArr;
            i6 = i7;
        }
    }

    private void getScore() {
        generate = (rgenerate + 37) % 128;
        if (this.destroy.equals("focus_mode_continuous_video")) {
            this.destroy = "focus_mode_continuous_picture";
        } else if (!this.destroy.equals("focus_mode_continuous_picture")) {
            this.destroy = "focus_mode_continuous_video";
        } else {
            this.destroy = "focus_mode_auto";
            generate = (rgenerate + 37) % 128;
        }
    }

    public static void init$0() {
        $$d = new byte[]{87, 36, -81, -25, -25, 12, 2, 45, -26, 2, 38, -42, 20, 35, -46, 26, 3, -6, 1, 16, -1, 6, 26, -6, -4, 21, -9, -25, 12, 2, 42, -46, 26, 3, -6, 1, 16, -1, 6, 26, -6, -4, 21, 27, -18};
        $$e = 90;
    }

    public static void init$1() {
        $$m = new byte[]{15, 64, -39, -48, -1, 13, 59, -51, 4, -10, 10, -11, 19, 0, -10, 3, -4, 4, 5, 5, 2, 9, -11, 70, -70, 23, -9, -7, 18, 24, -21, 68, -42, -28, 9, -1, 29, -36, 3, 6, -3, 3, 49, -49, 23, 0, -9, -2, 13, -4, 3, -28, 9, -1, 42, -29, -1, 19, -20, 4, -5, 15, -17, 1, 5, 15};
        $$n = 229;
    }

    public static void init$2() {
        $$l = new byte[]{12, -72, -13, -35};
        $$o = 187;
    }

    @Override // com.identy.e1
    public final RectF Action() {
        com.identy.ui.d.values valuesVar = this.getL2Score;
        RectF rectF = this.CaptureRolledThumbActivity;
        Matrix matrix = new Matrix(valuesVar.valueOf);
        RectF rectF2 = new RectF(rectF);
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        generate = (rgenerate + 65) % 128;
        return rectF3;
    }

    public final int Attempt() {
        int i = generate + 123;
        rgenerate = i % 128;
        if (i % 2 != 0) {
            this.a.equals(Hand.LEFT);
            throw null;
        }
        if (!this.a.equals(Hand.LEFT)) {
            int i2 = this.getProcessingTime;
            if (i2 == 1) {
                int i3 = rgenerate + 109;
                generate = i3 % 128;
                if (i3 % 2 != 0 ? i2 == 1 : i2 == 0) {
                    if (this.pfkrolfinalizeF.size() == 1) {
                        if (((Finger) this.pfkrolfinalizeF.get(0)).equals(Finger.INDEX)) {
                            return R.string.id_searching_right_index;
                        }
                        if (((Finger) this.pfkrolfinalizeF.get(0)).equals(Finger.MIDDLE)) {
                            return R.string.id_searching_right_middle;
                        }
                        if (((Finger) this.pfkrolfinalizeF.get(0)).equals(Finger.RING)) {
                            return R.string.id_searching_right_ring;
                        }
                        if (((Finger) this.pfkrolfinalizeF.get(0)).equals(Finger.LITTLE)) {
                            return R.string.id_searching_right_little;
                        }
                        if (((Finger) this.pfkrolfinalizeF.get(0)).equals(Finger.THUMB)) {
                            return R.string.id_searching_right_thumb;
                        }
                    }
                }
            }
            return R.string.id_searching_right;
        }
        if (this.getProcessingTime == 1) {
            int i4 = generate + 43;
            rgenerate = i4 % 128;
            if (i4 % 2 == 0 ? this.pfkrolfinalizeF.size() == 1 : this.pfkrolfinalizeF.size() == 1) {
                if (((Finger) this.pfkrolfinalizeF.get(0)).equals(Finger.INDEX)) {
                    int i5 = generate + 43;
                    rgenerate = i5 % 128;
                    if (i5 % 2 == 0) {
                        return R.string.id_searching_left_index;
                    }
                    throw null;
                }
                if (((Finger) this.pfkrolfinalizeF.get(0)).equals(Finger.MIDDLE)) {
                    return R.string.id_searching_left_middle;
                }
                if (((Finger) this.pfkrolfinalizeF.get(0)).equals(Finger.RING)) {
                    return R.string.id_searching_left_ring;
                }
                if (((Finger) this.pfkrolfinalizeF.get(0)).equals(Finger.LITTLE)) {
                    return R.string.id_searching_left_little;
                }
                if (((Finger) this.pfkrolfinalizeF.get(0)).equals(Finger.THUMB)) {
                    int i6 = generate + 125;
                    rgenerate = i6 % 128;
                    if (i6 % 2 == 0) {
                        return R.string.id_searching_left_thumb;
                    }
                    int i7 = 6 / 0;
                    return R.string.id_searching_left_thumb;
                }
            }
        }
        return R.string.id_searching_left;
    }

    @Override // com.identy.e1
    public final void PngjBadCrcException() {
        int i = (generate + 91) % 128;
        rgenerate = i;
        this.getMatchingTime = false;
        int i2 = i + 67;
        generate = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 22 / 0;
        }
    }

    @Override // com.identy.e1
    public final Pair[] PngjExceptionInternal() {
        int PngjBadCrcException2 = PngjBadCrcException.onErrorResponse.PngjBadCrcException();
        return (Pair[]) PngjException(PngjBadCrcException.onErrorResponse.PngjBadCrcException(), 1616550217, -1616550216, new Object[]{this}, PngjBadCrcException.onErrorResponse.PngjBadCrcException(), PngjBadCrcException.onErrorResponse.PngjBadCrcException(), PngjBadCrcException2);
    }

    @Override // com.identy.e1
    public final boolean PngjUnsupportedException() {
        boolean PngjUnsupportedException;
        try {
            PngjUnsupportedException = super.PngjUnsupportedException();
        } catch (Exception e) {
            try {
                if (LibSettings.isSaveCaptured()) {
                    e.getMessage();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (this.PngBadCharsetException || this.onErrorResponse || !PngjUnsupportedException) {
            return false;
        }
        this.getQualityScore++;
        if (this.CaptureThumbActivity) {
            this.getL2Score.values(this.getPadSub3, this.getPadSub2, this.getData.intValue(), this.CaptureRolledFingersActivity);
        } else {
            this.getL2Score.values(this.getPadSub2, this.getPadSub3, this.getData.intValue(), this.CaptureRolledFingersActivity);
        }
        if (this.getQualityScore < 1) {
            generate = (rgenerate + 87) % 128;
            com.identy.d.PngjBadSignature pngjBadSignature = this.Attempt;
            if (pngjBadSignature != null) {
                pngjBadSignature.getData();
            }
            return false;
        }
        if (this.getCaptureTime) {
            return false;
        }
        this.getCaptureTime = true;
        rgenerate = (generate + 19) % 128;
        values(new PngjException());
        return true;
    }

    @Override // com.identy.e1
    public final void a() {
        generate = (rgenerate + 29) % 128;
        super.a();
        int Attempt = Attempt();
        com.identy.d.PngjBadSignature pngjBadSignature = this.Attempt;
        if (pngjBadSignature != null) {
            pngjBadSignature.PngjBadSignature(Attempt, false);
            generate = (rgenerate + 89) % 128;
        }
        this.onErrorResponse = false;
        this.getQualityScore = 0L;
        this.getL2Score.PngjBadCrcException();
        this.Capture2TActivity.postInvalidate();
        this.Action.runOnUiThread(new PngjBadCrcException());
        com.identy.d.PngjBadSignature pngjBadSignature2 = this.Attempt;
        if (pngjBadSignature2 != null) {
            pngjBadSignature2.getData();
        }
    }

    @Override // com.identy.e1
    public final void e1() {
        int i = rgenerate + 101;
        generate = i % 128;
        try {
            if (i % 2 == 0) {
                super.e1();
                this.isFoundMatchingTemplates = true;
            } else {
                super.e1();
                this.isFoundMatchingTemplates = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        int Attempt = Attempt();
        com.identy.d.PngjBadSignature pngjBadSignature = this.Attempt;
        if (pngjBadSignature != null) {
            int i2 = rgenerate + 43;
            generate = i2 % 128;
            if (i2 % 2 == 0) {
                pngjBadSignature.PngjBadSignature(Attempt, true);
            } else {
                pngjBadSignature.PngjBadSignature(Attempt, false);
            }
            rgenerate = (generate + 9) % 128;
        }
    }

    @Override // com.identy.e1
    public final void getPadSub1() {
        super.getPadSub1();
        AsyncTask.execute(new valueOf());
        if (this.getL1Score != null) {
            rgenerate = (generate + 3) % 128;
            this.getL1Score = null;
        }
        if (this.Capture2TActivity != null) {
            rgenerate = (generate + 97) % 128;
            this.Capture2TActivity = null;
        }
        rgenerate = (generate + 113) % 128;
    }

    public final void getPadSub3() {
        int PngjBadCrcException2 = PngjBadCrcException.onErrorResponse.PngjBadCrcException();
        PngjException(PngjBadCrcException.onErrorResponse.PngjBadCrcException(), 2077396356, -2077396354, new Object[]{this}, PngjBadCrcException.onErrorResponse.PngjBadCrcException(), PngjBadCrcException.onErrorResponse.PngjBadCrcException(), PngjBadCrcException2);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0b02  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0b5f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0a00 A[Catch: all -> 0x069b, TryCatch #3 {all -> 0x069b, blocks: (B:48:0x09e4, B:50:0x0a00, B:51:0x0a3f, B:82:0x065e, B:84:0x066f, B:85:0x069e), top: B:81:0x065e }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0a50  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0ab2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x07db  */
    @Override // com.identy.e1, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceive(Context context, Intent intent) {
        int i;
        char c;
        char c2;
        int i2;
        int i3;
        int i4;
        int i5;
        Context context2;
        Object[] objArr;
        int i6;
        int intValue;
        Object[] PngjBadCrcException$1eba2e16;
        char c3;
        char c4;
        int i7;
        int i8;
        Object PngjBadSignature2;
        long j;
        Object PngjBadSignature3;
        Object[] objArr2;
        Object PngjBadSignature4;
        Object PngjBadSignature5;
        int i9;
        int i10;
        char c5;
        Object[] objArr3 = new Object[1];
        e(new int[]{351171047, 321601801, 187533674, -905813479, 443996423, -1334465623, -1234450157, 1748484355, -2074254608, 108461050, 1005535775, -1358162383}, 22 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr3);
        String str = (String) objArr3[0];
        Object[] objArr4 = new Object[1];
        e(new int[]{-1569494957, 1131663063, -771311370, -152783832, -1815029918, 364886725, 600519631, 1863751150}, TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 16, objArr4);
        String str2 = (String) objArr4[0];
        Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
        if (PngjBadSignature6 == null) {
            char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 31077);
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 49;
            i2 = -1200224935;
            int i11 = 1044 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            byte[] bArr = $$d;
            i = -175041514;
            byte b = bArr[13];
            c = '\r';
            byte b2 = bArr[18];
            c2 = 18;
            i3 = 4;
            Object[] objArr5 = new Object[1];
            f(b, (byte) (b2 - 1), b2, objArr5);
            PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(longPressTimeout, maximumFlingVelocity, i11, 159283629, false, (String) objArr5[0], null);
        } else {
            i = -175041514;
            c = '\r';
            c2 = 18;
            i2 = -1200224935;
            i3 = 4;
        }
        long j2 = ((Field) PngjBadSignature6).getLong(null);
        if (j2 == -1 || j2 + 4611686018427387768L < ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
            i4 = 2;
            i5 = 3;
            if (context != null) {
                if (context instanceof ContextWrapper) {
                    generate = (rgenerate + 29) % 128;
                    if (((ContextWrapper) context).getBaseContext() == null) {
                        context2 = null;
                    }
                }
                context2 = context.getApplicationContext();
            } else {
                context2 = context;
            }
            Object[] objArr6 = new Object[1];
            e(new int[]{-2053671547, 94937047, 495425776, -408225771, -839374423, -922359145, 1261017679, -1812046059}, 16 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            e(new int[]{246717870, -1706160973, -857543913, -798526455, 1427215364, -1489066450, -683683737, -1871066575}, 15 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0), objArr7);
            int intValue2 = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, this)).intValue();
            rgenerate = (generate + 21) % 128;
            try {
                Object[] objArr8 = new Object[i3];
                objArr8[3] = 2030180533;
                objArr8[2] = 0;
                objArr8[1] = Integer.valueOf(intValue2);
                objArr8[0] = context2;
                byte[] bArr2 = $$m;
                byte b3 = bArr2[63];
                Object[] objArr9 = new Object[1];
                g(b3, b3, bArr2[4], objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                byte b4 = bArr2[c];
                byte b5 = b4;
                Object[] objArr10 = new Object[1];
                g(b4, b5, (byte) (b5 | 46), objArr10);
                String str3 = (String) objArr10[0];
                Class cls3 = Integer.TYPE;
                objArr = (Object[]) cls2.getMethod(str3, Context.class, cls3, cls3, cls3).invoke(null, objArr8);
                if (context2 != null) {
                    int i12 = rgenerate + 41;
                    generate = i12 % 128;
                    try {
                        if (i12 % 2 == 0) {
                            Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i2);
                            if (PngjBadSignature7 == null) {
                                char defaultSize = (char) (View.getDefaultSize(0, 0) + 31077);
                                int tapTimeout = 49 - (ViewConfiguration.getTapTimeout() >> 16);
                                int i13 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1043;
                                byte[] bArr3 = $$d;
                                byte b6 = (byte) (bArr3[19] + 1);
                                Object[] objArr11 = new Object[1];
                                f(b6, (byte) (b6 - 4), (byte) (bArr3[c2] - 1), objArr11);
                                PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(defaultSize, tapTimeout, i13, 1150904546, false, (String) objArr11[0], null);
                            }
                            ((Field) PngjBadSignature7).set(null, objArr);
                            Long valueOf2 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                            Object PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i);
                            if (PngjBadSignature8 == null) {
                                char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 31077);
                                int alpha = Color.alpha(0) + 49;
                                int packedPositionGroup = 1043 - ExpandableListView.getPackedPositionGroup(0L);
                                byte[] bArr4 = $$d;
                                byte b7 = bArr4[c];
                                byte b8 = bArr4[c2];
                                Object[] objArr12 = new Object[1];
                                f(b7, (byte) (b8 - 1), b8, objArr12);
                                PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(touchSlop, alpha, packedPositionGroup, 159283629, false, (String) objArr12[0], null);
                            }
                            ((Field) PngjBadSignature8).set(null, valueOf2);
                        } else {
                            Object PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i2);
                            if (PngjBadSignature9 == null) {
                                char c6 = (char) (31077 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                int offsetAfter = 49 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0);
                                int combineMeasuredStates = View.combineMeasuredStates(0, 0) + 1043;
                                byte[] bArr5 = $$d;
                                byte b9 = (byte) (bArr5[19] + 1);
                                Object[] objArr13 = new Object[1];
                                f(b9, (byte) (b9 - 4), (byte) (bArr5[c2] - 1), objArr13);
                                PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c6, offsetAfter, combineMeasuredStates, 1150904546, false, (String) objArr13[0], null);
                            }
                            ((Field) PngjBadSignature9).set(null, objArr);
                            Long valueOf3 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                            Object PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i);
                            if (PngjBadSignature10 == null) {
                                char c7 = (char) (31077 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                int i14 = 50 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                int myTid = (Process.myTid() >> 22) + 1043;
                                byte[] bArr6 = $$d;
                                byte b10 = bArr6[c];
                                byte b11 = bArr6[c2];
                                Object[] objArr14 = new Object[1];
                                f(b10, (byte) (b11 - 1), b11, objArr14);
                                PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c7, i14, myTid, 159283629, false, (String) objArr14[0], null);
                            }
                            ((Field) PngjBadSignature10).set(null, valueOf3);
                        }
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();

                if (cause == null) {

                    throw new RuntimeException(th);

                }

                throw new RuntimeException(cause);
            }
        } else {
            Object PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i2);
            if (PngjBadSignature11 == null) {
                char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31077);
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 49;
                int i15 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1043;
                byte[] bArr7 = $$d;
                i4 = 2;
                byte b12 = (byte) (bArr7[19] + 1);
                i5 = 3;
                c5 = 0;
                Object[] objArr15 = new Object[1];
                f(b12, (byte) (b12 - 4), (byte) (bArr7[c2] - 1), objArr15);
                PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(maximumDrawingCacheSize, maxKeyCode, i15, 1150904546, false, (String) objArr15[0], null);
            } else {
                c5 = 0;
                i4 = 2;
                i5 = 3;
            }
            Object[] objArr16 = (Object[]) ((Field) PngjBadSignature11).get(null);
            objArr = new Object[5];
            int[] iArr = new int[1];
            objArr[i4] = iArr;
            int[] iArr2 = new int[1];
            objArr[i5] = iArr2;
            objArr[i3] = new int[1];
            int i16 = ((int[]) objArr16[i5])[c5];
            int i17 = ((int[]) objArr16[i4])[c5];
            String str4 = (String) objArr16[1];
            String str5 = (String) objArr16[c5];
            iArr2[c5] = i16;
            iArr[c5] = i17;
            objArr[1] = str4;
            objArr[c5] = str5;
            int b13 = defpackage.a.b(148146762);
            int c8 = defpackage.a.c((~((~b13) | 42300346)) | (-582057024), 305, (((~(b13 | 42300346)) | (-582320064)) * 305) + 2074794500, 2030180533);
            int i18 = c8 ^ (c8 << 13);
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr[i3])[c5] = i19 ^ (i19 << 5);
        }
        int i20 = ((int[]) objArr[i4])[0];
        int i21 = ((int[]) objArr[i5])[0];
        if (i21 == i20) {
            Object[] objArr17 = new Object[5];
            objArr17[i4] = new int[]{0};
            objArr17[i5] = new int[]{0};
            objArr17[4] = new int[1];
            int i22 = ((int[]) objArr[4])[0];
            int i23 = ((int[]) objArr[i5])[0];
            int i24 = ((int[]) objArr[i4])[0];
            String str6 = (String) objArr[1];
            String str7 = (String) objArr[0];
            objArr17[1] = str6;
            objArr17[0] = str7;
            int identityHashCode = System.identityHashCode(this);
            int i25 = ~identityHashCode;
            int c9 = defpackage.a.c((~(959063373 | i25)) | 334706003, 712, (((~(identityHashCode | (-47255571))) | (~(i25 | 1006318943))) * (-712)) + ((((-1006318944) | 0) * (-712)) - 1416437711), i22);
            int i26 = c9 ^ (c9 << 13);
            int i27 = i26 ^ (i26 >>> 17);
            i6 = 0;
            ((int[]) objArr17[4])[0] = i27 ^ (i27 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add((String) objArr[1]);
            arrayList.add((String) objArr[0]);
            Toast.makeText((Context) null, i21 / (((i21 - 1) * i21) % 2), 0).show();
            Object[] objArr18 = new Object[5];
            objArr18[i4] = new int[]{0};
            objArr18[i5] = new int[]{0};
            objArr18[4] = new int[1];
            int i28 = ((int[]) objArr[4])[0];
            int i29 = ((int[]) objArr[i5])[0];
            int i30 = ((int[]) objArr[i4])[0];
            String str8 = (String) objArr[1];
            String str9 = (String) objArr[0];
            objArr18[1] = str8;
            objArr18[0] = str9;
            int identityHashCode2 = System.identityHashCode(this);
            int i31 = ~identityHashCode2;
            int c10 = defpackage.a.c(~(i31 | (-416158353)), 301, (((~(identityHashCode2 | (-1040515723))) | 637599754 | (~((-13242385) | i31))) * (-301)) + ((((~((-1040515723) | i31)) | (-416158353)) * (-602)) - 1132248255), i28);
            int i32 = c10 ^ (c10 << 13);
            int i33 = i32 ^ (i32 >>> 17);
            i6 = 0;
            ((int[]) objArr18[4])[0] = i33 ^ (i33 << 5);
        }
        Object PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
        if (PngjBadSignature12 == null) {
            char c11 = (char) (14830 - (TypedValue.complexToFraction(i6, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i6, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
            int offsetBefore = TextUtils.getOffsetBefore(BuildConfig.FLAVOR, i6) + 28;
            int threadPriority = ((Process.getThreadPriority(i6) + 20) >> 6) + 721;
            byte[] bArr8 = $$d;
            byte b14 = bArr8[c];
            byte b15 = bArr8[c2];
            Object[] objArr19 = new Object[1];
            f(b14, (byte) (b15 - 1), b15, objArr19);
            PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c11, offsetBefore, threadPriority, -815159504, false, (String) objArr19[0], null);
        }
        long j3 = ((Field) PngjBadSignature12).getLong(null);
        try {
            try {
                try {
                    if (j3 != -1) {
                        rgenerate = (generate + 89) % 128;
                        if (j3 + 4611686018427387904L >= ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
                            Object PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                            if (PngjBadSignature13 == null) {
                                char c12 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14829);
                                int resolveSize = 28 - View.resolveSize(0, 0);
                                int trimmedLength = 721 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR);
                                byte[] bArr9 = $$d;
                                Object[] objArr20 = new Object[1];
                                f(bArr9[5], bArr9[21], bArr9[c2], objArr20);
                                PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c12, resolveSize, trimmedLength, -779023007, false, (String) objArr20[0], null);
                            }
                            Object[] objArr21 = (Object[]) ((Field) PngjBadSignature13).get(null);
                            PngjBadCrcException$1eba2e16 = new Object[4];
                            PngjBadCrcException$1eba2e16[0] = new int[]{0};
                            PngjBadCrcException$1eba2e16[1] = new int[1];
                            PngjBadCrcException$1eba2e16[i5] = new int[]{0};
                            int i34 = ((int[]) objArr21[i5])[0];
                            int i35 = ((int[]) objArr21[0])[0];
                            PngjBadCrcException$1eba2e16[i4] = (String[]) objArr21[i4];
                            int identityHashCode3 = System.identityHashCode(this);
                            int c13 = defpackage.a.c(~((~identityHashCode3) | (-602373)), 476, ((~((-602373) | identityHashCode3)) * 952) + (((564134945 | 0) * (-476)) - 1306868927), 1331820402);
                            int i36 = c13 ^ (c13 << 13);
                            int i37 = i36 ^ (i36 >>> 17);
                            ((int[]) PngjBadCrcException$1eba2e16[1])[0] = i37 ^ (i37 << 5);
                            rgenerate = (generate + 45) % 128;
                            c3 = 5;
                            c4 = 0;
                            i7 = ((int[]) PngjBadCrcException$1eba2e16[c4])[c4];
                            i8 = ((int[]) PngjBadCrcException$1eba2e16[i5])[c4];
                            if (i8 != i7) {
                                rgenerate = (generate + 69) % 128;
                                Object[] objArr22 = new Object[4];
                                int[] iArr3 = new int[1];
                                objArr22[c4] = iArr3;
                                objArr22[1] = new int[1];
                                int[] iArr4 = new int[1];
                                objArr22[i5] = iArr4;
                                int i38 = ((int[]) PngjBadCrcException$1eba2e16[1])[c4];
                                int i39 = ((int[]) PngjBadCrcException$1eba2e16[i5])[c4];
                                int i40 = ((int[]) PngjBadCrcException$1eba2e16[c4])[c4];
                                String[] strArr = (String[]) PngjBadCrcException$1eba2e16[i4];
                                iArr4[c4] = i39;
                                iArr3[c4] = i40;
                                objArr22[i4] = strArr;
                                int identityHashCode4 = System.identityHashCode(this);
                                int i41 = ~identityHashCode4;
                                int i42 = (~((-1053314082) | i41)) | 1052789792;
                                int i43 = ~(identityHashCode4 | (-18223819));
                                int c14 = defpackage.a.c(i43 | (~(i41 | (-524290))), 502, ((i42 | i43) * (-502)) + 1254064149, i38);
                                int i44 = c14 ^ (c14 << 13);
                                int i45 = i44 ^ (i44 >>> 17);
                                ((int[]) objArr22[1])[0] = i45 ^ (i45 << 5);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                String[] strArr2 = (String[]) PngjBadCrcException$1eba2e16[i4];
                                if (strArr2 != null) {
                                    rgenerate = (generate + 49) % 128;
                                    int i46 = 0;
                                    while (i46 < strArr2.length) {
                                        arrayList2.add(strArr2[i46]);
                                        i46++;
                                        generate = (rgenerate + 27) % 128;
                                    }
                                }
                                Toast.makeText((Context) null, i8 / (((i8 - 1) * i8) % 2), 0).show();
                                Object[] objArr23 = new Object[4];
                                objArr23[0] = new int[]{0};
                                objArr23[1] = new int[1];
                                objArr23[i5] = new int[]{0};
                                int i47 = ((int[]) PngjBadCrcException$1eba2e16[1])[0];
                                int i48 = ((int[]) PngjBadCrcException$1eba2e16[i5])[0];
                                int i49 = ((int[]) PngjBadCrcException$1eba2e16[0])[0];
                                objArr23[i4] = (String[]) PngjBadCrcException$1eba2e16[i4];
                                int maxMemory = (int) Runtime.getRuntime().maxMemory();
                                int c15 = defpackage.a.c((~(maxMemory | (-948448080))) | 2566 | (~((~maxMemory) | 1034563407)), 521, ((86117894 | maxMemory) * 521) + ((((~(0 | 86117894)) | 948448079) * (-1042)) - 662973722), i47);
                                int i50 = c15 ^ (c15 << 13);
                                int i51 = i50 ^ (i50 >>> 17);
                                ((int[]) objArr23[1])[0] = i51 ^ (i51 << 5);
                            }
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
                            if (PngjBadSignature2 == null) {
                                char c16 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int mirror = AndroidCharacter.getMirror('0') - 11;
                                int gidForName = Process.getGidForName(BuildConfig.FLAVOR) + 550;
                                byte[] bArr10 = $$d;
                                byte b16 = bArr10[c];
                                byte b17 = bArr10[c2];
                                Object[] objArr24 = new Object[1];
                                f(b16, (byte) (b17 - 1), b17, objArr24);
                                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c16, mirror, gidForName, -1608103378, false, (String) objArr24[0], null);
                            }
                            j = ((Field) PngjBadSignature2).getLong(null);
                            if (j != -1 || j + 4611686018427387940L < ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
                                Object[] objArr25 = new Object[1];
                                e(new int[]{-2053671547, 94937047, 495425776, -408225771, -839374423, -922359145, 1261017679, -1812046059}, 16 - Color.red(0), objArr25);
                                Class<?> cls4 = Class.forName((String) objArr25[0]);
                                Object[] objArr26 = new Object[1];
                                e(new int[]{246717870, -1706160973, -857543913, -798526455, 1427215364, -1489066450, -683683737, -1871066575}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, objArr26);
                                int intValue3 = ((Integer) cls4.getMethod((String) objArr26[0], Object.class).invoke(null, this)).intValue();
                                Object[] objArr27 = new Object[i4];
                                objArr27[1] = -1170519535;
                                objArr27[0] = Integer.valueOf(intValue3);
                                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1437710995);
                                if (PngjBadSignature3 == null) {
                                    char myPid = (char) (Process.myPid() >> 22);
                                    int gidForName2 = 36 - Process.getGidForName(BuildConfig.FLAVOR);
                                    int argb = Color.argb(0, 0, 0, 0) + 549;
                                    byte[] bArr11 = $$d;
                                    Object[] objArr28 = new Object[1];
                                    f(bArr11[c3], bArr11[21], bArr11[c2], objArr28);
                                    String str10 = (String) objArr28[0];
                                    Class cls5 = Integer.TYPE;
                                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(myPid, gidForName2, argb, -1453402328, false, str10, new Class[]{cls5, cls5});
                                }
                                objArr2 = (Object[]) ((Method) PngjBadSignature3).invoke(null, objArr27);
                                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
                                if (PngjBadSignature4 == null) {
                                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                    int resolveOpacity = Drawable.resolveOpacity(0, 0) + 37;
                                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 549;
                                    byte b18 = $$d[c2];
                                    Object[] objArr29 = new Object[1];
                                    f((byte) (b18 - 1), $$a[c3], (byte) (b18 - 1), objArr29);
                                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(scrollBarFadeDuration, resolveOpacity, fadingEdgeLength, 1452666181, false, (String) objArr29[0], null);
                                }
                                ((Field) PngjBadSignature4).set(null, objArr2);
                                Long valueOf4 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
                                if (PngjBadSignature5 == null) {
                                    char keyCodeFromString = (char) KeyEvent.keyCodeFromString(BuildConfig.FLAVOR);
                                    int packedPositionChild = 36 - ExpandableListView.getPackedPositionChild(0L);
                                    int offsetBefore2 = 549 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0);
                                    byte[] bArr12 = $$d;
                                    byte b19 = bArr12[c];
                                    byte b20 = bArr12[c2];
                                    Object[] objArr30 = new Object[1];
                                    f(b19, (byte) (b20 - 1), b20, objArr30);
                                    PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(keyCodeFromString, packedPositionChild, offsetBefore2, -1608103378, false, (String) objArr30[0], null);
                                }
                                ((Field) PngjBadSignature5).set(null, valueOf4);
                                i4 = 2;
                            } else {
                                generate = (rgenerate + 125) % 128;
                                Object PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
                                if (PngjBadSignature14 == null) {
                                    char red = (char) Color.red(0);
                                    int combineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 37;
                                    int combineMeasuredStates3 = 549 - View.combineMeasuredStates(0, 0);
                                    byte b21 = $$d[c2];
                                    Object[] objArr31 = new Object[1];
                                    f((byte) (b21 - 1), $$a[c3], (byte) (b21 - 1), objArr31);
                                    PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(red, combineMeasuredStates2, combineMeasuredStates3, 1452666181, false, (String) objArr31[0], null);
                                }
                                Object[] objArr32 = (Object[]) ((Field) PngjBadSignature14).get(null);
                                objArr2 = new Object[i5];
                                objArr2[0] = new int[1];
                                objArr2[1] = new int[]{0};
                                objArr2[i4] = new int[]{0};
                                int i52 = ((int[]) objArr32[1])[0];
                                int i53 = ((int[]) objArr32[i4])[0];
                                int freeMemory = (int) Runtime.getRuntime().freeMemory();
                                int c17 = defpackage.a.c((~(freeMemory | 481570596)) | (~(982672638 | freeMemory)), -1324, (((~freeMemory) | 412099620) * 1324) - 1497136074, 1631809485);
                                int i54 = c17 ^ (c17 << 13);
                                int i55 = i54 ^ (i54 >>> 17);
                                ((int[]) objArr2[0])[0] = i55 ^ (i55 << 5);
                            }
                            Object obj = objArr2[i4];
                            i9 = ((int[]) obj)[0];
                            Object obj2 = objArr2[1];
                            i10 = ((int[]) obj2)[0];
                            if (i10 != i9) {
                                generate = (rgenerate + 21) % 128;
                                Object[] objArr33 = {new int[1], new int[1], new int[1]};
                                int i56 = ((int[]) objArr2[0])[0];
                                int i57 = ((int[]) obj2)[0];
                                int i58 = ((int[]) obj)[0];
                                ((int[]) objArr33[1])[0] = i57;
                                ((int[]) objArr33[2])[0] = i58;
                                int identityHashCode5 = System.identityHashCode(this);
                                int c18 = defpackage.a.c(~(identityHashCode5 | (-4890757)), 283, (((~((-276492445) | identityHashCode5)) | 271601688) * (-283)) + 1018109610, i56);
                                int i59 = c18 ^ (c18 << 13);
                                int i60 = i59 ^ (i59 >>> 17);
                                ((int[]) objArr33[0])[0] = i60 ^ (i60 << 5);
                            } else {
                                Toast.makeText((Context) null, i10 / (((i10 - 1) * i10) % 2), 0).show();
                                Object[] objArr34 = {new int[1], new int[1], new int[1]};
                                int i61 = ((int[]) objArr2[0])[0];
                                int i62 = ((int[]) objArr2[1])[0];
                                int i63 = ((int[]) objArr2[2])[0];
                                ((int[]) objArr34[1])[0] = i62;
                                ((int[]) objArr34[2])[0] = i63;
                                int identityHashCode6 = System.identityHashCode(this);
                                int i64 = ~identityHashCode6;
                                int c19 = defpackage.a.c((~((-1361724801) | i64)) | 1361182976, 859, (((~(identityHashCode6 | (-541825))) | (~(102518434 | i64))) * 859) + ((identityHashCode6 | 102518434) * (-859)) + 2137733432, i61);
                                int i65 = c19 ^ (c19 << 13);
                                int i66 = i65 ^ (i65 >>> 17);
                                ((int[]) objArr34[0])[0] = i66 ^ (i66 << 5);
                            }
                            super.onReceive(context, intent);
                            return;
                        }
                    }
                    Long valueOf42 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                    PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
                    if (PngjBadSignature5 == null) {
                    }
                    ((Field) PngjBadSignature5).set(null, valueOf42);
                    i4 = 2;
                    Object obj3 = objArr2[i4];
                    i9 = ((int[]) obj3)[0];
                    Object obj22 = objArr2[1];
                    i10 = ((int[]) obj22)[0];
                    if (i10 != i9) {
                    }
                    super.onReceive(context, intent);
                    return;
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
                Long valueOf5 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                Object PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
                if (PngjBadSignature15 == null) {
                    char c20 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14829);
                    int modifierMetaStateMask = 27 - ((byte) KeyEvent.getModifierMetaStateMask());
                    c4 = 0;
                    int combineMeasuredStates4 = View.combineMeasuredStates(0, 0) + 721;
                    byte[] bArr13 = $$d;
                    byte b22 = bArr13[c];
                    byte b23 = bArr13[c2];
                    c3 = 5;
                    Object[] objArr35 = new Object[1];
                    f(b22, (byte) (b23 - 1), b23, objArr35);
                    PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c20, modifierMetaStateMask, combineMeasuredStates4, -815159504, false, (String) objArr35[0], null);
                } else {
                    c3 = 5;
                    c4 = 0;
                }
                ((Field) PngjBadSignature15).set(null, valueOf5);
                i7 = ((int[]) PngjBadCrcException$1eba2e16[c4])[c4];
                i8 = ((int[]) PngjBadCrcException$1eba2e16[i5])[c4];
                if (i8 != i7) {
                }
                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
                if (PngjBadSignature2 == null) {
                }
                j = ((Field) PngjBadSignature2).getLong(null);
                if (j != -1) {
                }
                Object[] objArr252 = new Object[1];
                e(new int[]{-2053671547, 94937047, 495425776, -408225771, -839374423, -922359145, 1261017679, -1812046059}, 16 - Color.red(0), objArr252);
                Class<?> cls42 = Class.forName((String) objArr252[0]);
                Object[] objArr262 = new Object[1];
                e(new int[]{246717870, -1706160973, -857543913, -798526455, 1427215364, -1489066450, -683683737, -1871066575}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, objArr262);
                int intValue32 = ((Integer) cls42.getMethod((String) objArr262[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr272 = new Object[i4];
                objArr272[1] = -1170519535;
                objArr272[0] = Integer.valueOf(intValue32);
                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1437710995);
                if (PngjBadSignature3 == null) {
                }
                objArr2 = (Object[]) ((Method) PngjBadSignature3).invoke(null, objArr272);
                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
                if (PngjBadSignature4 == null) {
                }
                ((Field) PngjBadSignature4).set(null, objArr2);
            } catch (Exception unused3) {
                throw new RuntimeException();
            }
            Object[] objArr36 = {-1536487498};
            Object PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
            if (PngjBadSignature16 == null) {
                PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) View.MeasureSpec.getSize(0), 24 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 698, 1457201313, false, null, new Class[]{Integer.TYPE});
            }
            PngjBadCrcException$1eba2e16 = PngjInputException.values.PngjBadCrcException$1eba2e16(intValue, ((Constructor) PngjBadSignature16).newInstance(objArr36), 1331820402);
            Object PngjBadSignature17 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
            if (PngjBadSignature17 == null) {
                char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 14830);
                int keyCodeFromString2 = 28 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR);
                int i67 = 722 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                byte[] bArr14 = $$d;
                Object[] objArr37 = new Object[1];
                f(bArr14[5], bArr14[21], bArr14[c2], objArr37);
                PngjBadSignature17 = com.d.e.a.PngjBadCrcException.PngjBadSignature(pressedStateDuration, keyCodeFromString2, i67, -779023007, false, (String) objArr37[0], null);
            }
            ((Field) PngjBadSignature17).set(null, PngjBadCrcException$1eba2e16);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
        Object[] objArr38 = new Object[1];
        e(new int[]{-2053671547, 94937047, 495425776, -408225771, -839374423, -922359145, 1261017679, -1812046059}, (Process.myPid() >> 22) + 16, objArr38);
        Class<?> cls6 = Class.forName((String) objArr38[0]);
        Object[] objArr39 = new Object[1];
        e(new int[]{246717870, -1706160973, -857543913, -798526455, 1427215364, -1489066450, -683683737, -1871066575}, (Process.myPid() >> 22) + 16, objArr39);
        intValue = ((Integer) cls6.getMethod((String) objArr39[0], Object.class).invoke(null, this)).intValue();
    }

    public final RResult values(Mat mat) {
        int i;
        float f;
        if (!this.isFoundMatchingTemplates) {
            try {
                values();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (Mat.n_empty(mat.PngjException) || new org.identy.opencv.core.valueOf(Mat.n_size(mat.PngjException)).PngjBadSignature == 0.0d || new org.identy.opencv.core.valueOf(Mat.n_size(mat.PngjException)).values == 0.0d) {
            return null;
        }
        rgenerate = (generate + 57) % 128;
        RResult pfkrol = Fpnative.pfkrol(e1.PngjBadCrcException, mat.PngjException, this.getPadSub3, this.getPadSub2, this.EnrollFingersActivity ? 1 : 2);
        PreCaptureOutput preCaptureOutput = pfkrol.getPreCaptureOutput();
        if (preCaptureOutput == null) {
            return null;
        }
        preCaptureOutput.setWidthHeight(this.getPadSub3, this.getPadSub2);
        if (!preCaptureOutput.getBoxes().isEmpty() && preCaptureOutput.getError() != null && !preCaptureOutput.getError().equals(FingerError.BE_INSIDE_GUIDE) && !(!this.resetAttempt)) {
            rgenerate = (generate + 99) % 128;
            this.resetAttempt = false;
            this.Attempt.getScore();
        }
        if (pfkrol.getStatus().equals(STATUS.BAD_QUALITY)) {
            generate = (rgenerate + 87) % 128;
            this.pfk++;
            this.resetAttempt = true;
        }
        int i2 = this.pfk;
        if (i2 > 0 && i2 % 5 == 0) {
            org.camera.preview.PngjBadCrcException pngjBadCrcException = ((FingerActivity) this.Action).Action;
            String str = this.destroy;
            org.cameracontroller.PngjBadSignature pngjBadSignature = pngjBadCrcException.getQualityScore;
            if (pngjBadSignature != null) {
                pngjBadSignature.PngjException(str);
                pngjBadCrcException.getQualityScore.PngjBadSignature(pngjBadCrcException.CaptureRolledThumbActivity);
            }
            getScore();
            this.Attempt.getScore();
        }
        if (this.pfk > 20) {
            org.camera.preview.PngjBadCrcException pngjBadCrcException2 = ((FingerActivity) this.Action).Action;
            String str2 = this.destroy;
            org.cameracontroller.PngjBadSignature pngjBadSignature2 = pngjBadCrcException2.getQualityScore;
            if (pngjBadSignature2 != null) {
                int i3 = rgenerate + 121;
                generate = i3 % 128;
                if (i3 % 2 == 0) {
                    pngjBadSignature2.PngjException(str2);
                    pngjBadCrcException2.getQualityScore.PngjBadSignature(pngjBadCrcException2.CaptureRolledThumbActivity);
                    int i4 = 16 / 0;
                } else {
                    pngjBadSignature2.PngjException(str2);
                    pngjBadCrcException2.getQualityScore.PngjBadSignature(pngjBadCrcException2.CaptureRolledThumbActivity);
                }
            }
            getScore();
            this.pfk = 0;
            this.Attempt.getScore();
            float f2 = this.getServerRequest;
            if (f2 > 0.75d) {
                int i5 = generate + 73;
                rgenerate = i5 % 128;
                if (i5 % 2 != 0) {
                    float f3 = f2 - 0.05f;
                    this.getServerRequest = f3;
                    i = (int) (this.isQualityFailed / f3);
                    f = this.getScore - f3;
                } else {
                    float f4 = f2 - 0.05f;
                    this.getServerRequest = f4;
                    i = (int) (this.isQualityFailed * f4);
                    f = this.getScore * f4;
                }
                Fpnative.pfkrolChangeMinMaxWidth(e1.PngjBadCrcException, i, (int) f);
            }
        }
        if (preCaptureOutput.getBoxes() == null) {
            this.Capture2IndexActivity.PngjBadCrcException((Integer) 0);
            generate = (rgenerate + 39) % 128;
        } else {
            this.Capture2IndexActivity.PngjBadCrcException(Integer.valueOf(preCaptureOutput.getBoxes().size()));
        }
        if (preCaptureOutput.getError().equals(FingerError.CORRECT)) {
            if (this.Capture4FActivity == 0) {
                this.Capture4FActivity = Calendar.getInstance().getTimeInMillis();
            }
            LibSettings.saveML4FData();
            long timeInMillis2 = (Calendar.getInstance().getTimeInMillis() - timeInMillis) + this.closefDialog;
            if (timeInMillis2 < 200 && timeInMillis2 > 10) {
                try {
                    Thread.sleep(200 - timeInMillis2);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
        }
        if (preCaptureOutput.getError() != null) {
            rgenerate = (generate + 79) % 128;
            PngjOutputException pngjOutputException = this.Capture2IndexActivity;
            String servermeta = preCaptureOutput.getError().getServermeta();
            if (servermeta.isEmpty()) {
                int i6 = pngjOutputException.PngjInputException;
                generate = (rgenerate + 85) % 128;
            } else {
                pngjOutputException.PngjUnsupportedException.set(pngjOutputException.PngjInputException, servermeta);
                generate = (rgenerate + 31) % 128;
            }
            PngjException(preCaptureOutput.getError().getStatus());
            rgenerate = (generate + 35) % 128;
        }
        Mat.n_release(mat.PngjException);
        return pfkrol;
    }

    @Override // com.identy.e1
    public final void PngjBadCrcException(byte[] bArr, boolean z, List list, List list2, float f, Long l) {
        this.toJson = bArr;
        this.isAuthSucess = new StringBuilder();
        Mat values = Imgcodecs.values(new org.identy.opencv.core.PngjException(this.toJson));
        Imgproc.valueOf(values, values);
        int PngjBadCrcException2 = PngjBadCrcException.onErrorResponse.PngjBadCrcException();
        PngjException(PngjBadCrcException.onErrorResponse.PngjBadCrcException(), -1035848081, 1035848081, new Object[]{this, values}, PngjBadCrcException.onErrorResponse.PngjBadCrcException(), PngjBadCrcException.onErrorResponse.PngjBadCrcException(), PngjBadCrcException2);
        rgenerate = (generate + 105) % 128;
    }

    private static /* synthetic */ Object PngjException(Object[] objArr) {
        getL3Score getl3score = (getL3Score) objArr[0];
        try {
            if (!getl3score.getL3Score) {
                int i = rgenerate + 119;
                generate = i % 128;
                if (i % 2 != 0) {
                    if (IdentySdk.getInstance().getFingerPrintDrawable() == 0) {
                        getl3score.getL1Score.PngjBadSignature(getl3score.a, 4.0d, 3.5d, 2.0d);
                        return null;
                    }
                } else {
                    IdentySdk.getInstance().getFingerPrintDrawable();
                    throw null;
                }
            }
        } catch (Exception e) {
            try {
                if (LibSettings.isSaveCaptured()) {
                    e.getMessage();
                    return null;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        generate = (rgenerate + 9) % 128;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        if (0 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        0 = 0.getTwistRoation();
        0 = 0.CapturePosition.getFinger().equals(com.identy.enums.Finger.THUMB);
        0 = 0.Attempt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
    
        if (0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        0.PngjException(0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        0 = Attempt();
        0 = 0.Attempt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        if (0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
    
        com.identy.getL3Score.rgenerate = (com.identy.getL3Score.generate + 51) % 128;
        0.PngjBadSignature(0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
    
        PngjBadSignature();
        com.identy.getL3Score.generate = (com.identy.getL3Score.rgenerate + 73) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        0.values(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (0 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RResult PngjBadCrcException(Mat mat) {
        long j;
        SIDE side;
        int sdrawable;
        com.identy.d.PngjBadSignature pngjBadSignature;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        long j2 = e1.PngjBadCrcException;
        if (mat == null) {
            generate = (rgenerate + 89) % 128;
            j = 0;
        } else {
            j = mat.PngjException;
        }
        RResult pfkrolfinalize2 = Fpnative.pfkrolfinalize(j2, j, this.getPadSub3, this.getPadSub2);
        com.identy.PngjBadCrcException.PngjException("get rr ? ", timeInMillis);
        if (pfkrolfinalize2 == null) {
            return null;
        }
        if (pfkrolfinalize2.getStatus().equals(STATUS.STATUS_OK) && pfkrolfinalize2.isSideDone()) {
            int i = rgenerate + 77;
            generate = i % 128;
            if (i % 2 == 0) {
                side = (SIDE) this.pfkrol.remove(0);
                sdrawable = side.getSdrawable();
                pngjBadSignature = this.Attempt;
            } else {
                side = (SIDE) this.pfkrol.remove(0);
                sdrawable = side.getSdrawable();
                pngjBadSignature = this.Attempt;
            }
        }
        PreCaptureOutput preCaptureOutput = pfkrolfinalize2.getPreCaptureOutput();
        Objects.toString(pfkrolfinalize2.getStatus());
        pfkrolfinalize2.toString();
        if (preCaptureOutput == null) {
            int i2 = rgenerate + 107;
            generate = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 68 / 0;
            }
            return null;
        }
        preCaptureOutput.setWidthHeight(this.getPadSub3, this.getPadSub2);
        String str = this.getPadSub1.username;
        LibSettings.saveML4FData();
        if (preCaptureOutput.getBoxes() == null) {
            this.Capture2IndexActivity.PngjBadCrcException((Integer) 0);
        } else {
            this.Capture2IndexActivity.PngjBadCrcException(Integer.valueOf(preCaptureOutput.getBoxes().size()));
        }
        if (preCaptureOutput.getError().equals(FingerError.CORRECT)) {
            int i4 = generate + 61;
            rgenerate = i4 % 128;
            if (i4 % 2 == 0 ? this.Capture4FActivity == 0 : this.Capture4FActivity == 1) {
                this.Capture4FActivity = Calendar.getInstance().getTimeInMillis();
            }
            LibSettings.saveML4FData();
            generate = (rgenerate + 65) % 128;
        }
        if (preCaptureOutput.getError() != null) {
            PngjOutputException pngjOutputException = this.Capture2IndexActivity;
            String servermeta = preCaptureOutput.getError().getServermeta();
            if (!servermeta.isEmpty()) {
                pngjOutputException.PngjUnsupportedException.set(pngjOutputException.PngjInputException, servermeta);
                generate = (rgenerate + 27) % 128;
            } else {
                int i5 = pngjOutputException.PngjInputException;
            }
            PngjException(preCaptureOutput.getError().getStatus());
        }
        if (mat != null) {
            rgenerate = (generate + 75) % 128;
            Mat.n_release(mat.PngjException);
        }
        pfkrolfinalize2.toString();
        return pfkrolfinalize2;
    }

    public final void PngjException(Mat mat) {
        int PngjBadCrcException2 = PngjBadCrcException.onErrorResponse.PngjBadCrcException();
        PngjException(PngjBadCrcException.onErrorResponse.PngjBadCrcException(), -1035848081, 1035848081, new Object[]{this, mat}, PngjBadCrcException.onErrorResponse.PngjBadCrcException(), PngjBadCrcException.onErrorResponse.PngjBadCrcException(), PngjBadCrcException2);
    }

    @Override // com.identy.e1
    public final void values() {
        boolean z;
        Action action = IdentySdk.getInstance().getAction();
        FingerAS h = IdentySdk.getInstance().h();
        Objects.toString(this.CaptureRolledFingersActivity);
        boolean t = IdentySdk.getInstance().t();
        RectF rectF = new RectF(this.CaptureRolledFingersActivity);
        rectF.inset(this.CaptureRolledFingersActivity.width() * (-0.3f), this.CaptureRolledFingersActivity.height() * (-0.3f));
        if (e1.PngjBadCrcException == 0) {
            e1.PngjBadCrcException = Fpnative.uxd566jk(this.Action.getAssets(), e1.values, e1.PngjBadCrcException);
        }
        long j = e1.PngjBadCrcException;
        int ordinal = h.ordinal();
        int ordinal2 = Position.getFromHandFinger(new Pair(this.CapturePosition.getHand(), this.CapturePosition.getFinger())).ordinal();
        boolean equals = action.equals(Action.ENROLL);
        int i = this.isQualityFailed;
        int i2 = this.getScore;
        int i3 = (int) rectF.top;
        int i4 = (int) rectF.left;
        int i5 = (int) rectF.bottom;
        int i6 = (int) rectF.right;
        if (this.uxd566jk.getScore == CapturePosition.HORIZONTAL) {
            generate = (rgenerate + 79) % 128;
            z = false;
        } else {
            generate = (rgenerate + 11) % 128;
            z = true;
        }
        Fpnative.configureroll(j, ordinal, ordinal2, equals, i, i2, i3, i4, i5, i6, t, z);
        this.isFoundMatchingTemplates = true;
    }
}
