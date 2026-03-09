package com.identy;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.display.DisplayManager;
import android.media.AudioTrack;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Display;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import co.ceduladigital.sdk.x5;
import com.d.e.a.c.getPadSub3B15685$PngjException;
import com.identy.IdentySdk;
import com.identy.PngjInputException;
import com.identy.e1;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.Hand;
import com.identy.isFoundMatchingTemplates;
import com.karumi.dexter.BuildConfig;
import com.touchlessid.TouchLessIDSDK$values;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.ByteCompanionObject;
import org.camera.a.valueOf.PngjBadCrcException;
import org.camera.preview.PngjBadCrcException.valueOf;
import org.cameracontroller.PngjBadSignature;
import org.identy.nativealgo.NativeAlgoUtils;

/* loaded from: classes2.dex */
public class FingerActivity extends Activity implements Camera.PreviewCallback, ImageReader.OnImageAvailableListener, com.identy.d.PngjBadSignature, com.identy.d.valueOf {
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    private static  byte[] $$d = null;
    private static  int $$e = 0;
    private static  byte[] $$g = null;
    private static  int $$h = 0;
    private static  byte[] $$j = null;
    private static  int $$k = 0;
    private static int $10;
    private static int $11;
    public static boolean PngjBadSignature;
    public static long PngjException;
    protected static boolean PngjPrematureEnding;
    private static int getFingers;
    private static int isFoundMatchingTemplates;
    private static long setFingers;
    private static int setFoundMatchingTemplates;
    private static int toJson;
    private static /* synthetic */ boolean valueOf;
    protected org.camera.preview.PngjBadCrcException Action;
    private boolean Capture2IndexActivity;
    private int Capture2TActivity;
    private boolean CaptureFingersActivity;
    private boolean CaptureMode;
    private FingerDetectionMode[] CapturePosition;
    private Runnable DeduplicationIdentyResponse;
    protected com.identy.PngjUnsupportedException PngBadCharsetException;
    public FingerDetectionMode PngjExceptionInternal;
    public com.identy.d.values PngjInputException;
    Finger[] a;
    TextView e1;
    private Sensor getL1Score;
    private OrientationEventListener getL2Score;
    private BroadcastReceiver getMatchingTime;
    private BroadcastReceiver getNfiq1Score;
    Dialog getPadSub1;
    private View.OnClickListener getProcessingTime;
    private SensorManager getSpoofScore;
    org.camera.a.valueOf isQualityFailed;
    protected com.identy.e1 onErrorResponse;
    private int values = 1;
    private final int PngjBadCrcException = 0;
    private final int getFingerPrintQualityScore = 1;
    public boolean PngjUnsupportedException = true;
    public Long PngjOutputException = 150794000L;
    private int getScore = 0;
    ArrayList getPadSub2 = new ArrayList();
    Dialog Attempt = null;
    private Long getOveralTimetaken = 0L;
    boolean getAsHighestSecurityLevelReached = true;
    private boolean getCaptureTime = false;
    private boolean getL3Score = false;
    private ObjectAnimator isAuthSucess = null;
    boolean getPadSub3 = false;
    boolean getData = false;
    private Handler Capture4FActivity = null;
    private Runnable CaptureRolledThumbActivity = null;
    private int CaptureThumbActivity = 0;
    protected com.identy.d.PngjException getQualityScore = new Attempt();
    private long CaptureRolledFingersActivity = 0;

    /* Helper to call the static values() method on the inner class
       isFoundMatchingTemplates.PngjBadCrcException, avoiding the field
       shadowing from e1.PngjBadCrcException (long). In a type context,
       the compiler correctly resolves PngjBadCrcException as the nested class. */
    @SuppressWarnings("static-access")
    private static int _isFoundMatchingTemplates_PngjBadCrcException_values() {
        com.identy.isFoundMatchingTemplates.PngjBadCrcException ref = null;
        return ref.values();
    }

    public class Action implements Runnable {
        public static int PngjBadCrcException;
        public static int PngjException;

        public Action() {
        }

        public static int PngjBadCrcException() {
            int i = PngjException;
            int i2 = i % 7618267;
            PngjException = i + 1;
            if (i2 != 0) {
                return PngjBadCrcException;
            }
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            PngjBadCrcException = elapsedCpuTime;
            return elapsedCpuTime;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.identy.app.PngjException.valueOf("left", FingerActivity.this);
            com.identy.app.PngjException.valueOf("right", FingerActivity.this);
        }
    }

    public class Attempt implements com.identy.d.PngjException {
        public Attempt() {
        }

        @Override // com.identy.d.PngjException
        public final void PngjBadCrcException() {
            try {
                IdentySdk identySdk = IdentySdk.getInstance();
                if (identySdk.isDisplayMoveNextDialog() && identySdk.getUitype().equals(UIAfterCaptures.ALERTS)) {
                    FingerActivity.this.Attempt();
                } else {
                    FingerActivity.this.Action();
                }
            } catch (Exception unused) {
                FingerActivity.this.Attempt();
            }
        }
    }

    public class Capture2TActivity implements Runnable {
        private /* synthetic */ int PngjException;

        public Capture2TActivity(int i) {
            this.PngjException = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                TextView textView = FingerActivity.this.e1;
                if (textView != null) {
                    textView.setText(this.PngjException);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class PngBadCharsetException implements View.OnClickListener {
        public PngBadCharsetException() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FingerActivity.this.getPadSub3();
        }
    }

    public class PngjBadCrcException implements Runnable {
        private static  byte[] $$a = null;
        private static  int $$b = 0;
        private static  byte[] $$c = null;
        private static  int $$d = 0;
        private static int $10;
        private static int $11;
        private static char[] PngjBadCrcException;
        private static int PngjBadSignature;
        private static char PngjException;
        private static boolean PngjExceptionInternal;
        private static int PngjInputException;
        private static int PngjOutputException;
        private static boolean PngjUnsupportedException;
        private static char[] valueOf;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:4:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$e(byte b, byte b2, byte b3) {
            int i;
            int i2 = b2 + 4;
            byte[] bArr = $$c;
            int i3 = b3 * 4;
            int i4 = 121 - (b * 2);
            byte[] bArr2 = new byte[i3 + 1];
            if (bArr == null) {
                int i5 = i3;
                i = 0;
                i4 += -i5;
                bArr2[i] = (byte) i4;
                if (i == i3) {
                    return new String(bArr2, 0);
                }
                i2++;
                i5 = bArr[i2];
                i++;
                i4 += -i5;
                bArr2[i] = (byte) i4;
                if (i == i3) {
                }
            } else {
                i = 0;
                bArr2[i] = (byte) i4;
                if (i == i3) {
                }
            }
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            PngjInputException = 0;
            PngjOutputException = 1;
            valueOf = new char[]{269, 298, 311, 283, 318, 285, 277, 308, 272, 304, 315, 274, 317, 301, 300, 258, 307, 273, 372, 282, 303, 305, 266, 278, 268, 288, 287, 276, 312, 316, 260, 280, 265, 353, 310, 279, 314, 262, 297, 319, 289, 299, 374, 375, 355, 275, 309, 302, 306};
            PngjException = (char) 13508;
            PngjBadCrcException = new char[]{25148, 25328, 25334, 25329, 25090, 25338, 25331, 25341, 25093, 25340, 25339, 25100, 25102, 25088, 25089, 25343, 25094, 25147, 25120, 25333, 25092, 25134, 25337, 25126, 25091, 25165, 25336, 25191, 25095, 25123, 25143, 25115};
            PngjBadSignature = -2081201555;
            PngjExceptionInternal = true;
            PngjUnsupportedException = true;
        }

        public PngjBadCrcException() {
        }

        private static void a(int[] iArr, String str, int i, String str2, Object[] objArr) {
            char[] cArr;
            int i2;
            int i3;
            char[] cArr2;
            int i4;
            int i5;
            String str3 = str2;
            int i6 = ($10 + 1) % 128;
            $11 = i6;
            byte[] bArr = str3 != null ? str3.getBytes() : null;
            if (str3 != null) {
                $10 = (i6 + 109) % 128;
                bArr = str3.getBytes("ISO-8859-1");
            }
            byte[] bArr2 = bArr;
            if (str != null) {
                cArr = str.toCharArray();
                $11 = ($10 + 21) % 128;
            } else {
                cArr = str != null ? str.toCharArray() : null;
            }
            char[] cArr3 = cArr;
            com.d.e.PngjExceptionInternal pngjExceptionInternal = new com.d.e.PngjExceptionInternal();
            char[] cArr4 = PngjBadCrcException;
            Class cls = Integer.TYPE;
            int i7 = 2;
            if (cArr4 != null) {
                int length = cArr4.length;
                char[] cArr5 = new char[length];
                int i8 = 0;
                while (i8 < length) {
                    int i9 = $11 + 21;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr4[i8])};
                            Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(358189806);
                            if (PngjBadSignature2 == null) {
                                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (27091 - Process.getGidForName(BuildConfig.FLAVOR)), Color.blue(0) + 37, 118 - ExpandableListView.getPackedPositionType(0L), -373889195, false, "b", new Class[]{cls});
                            }
                            cArr5[i8] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();

                            if (cause == null) {

                                throw new RuntimeException(th);

                            }

                            throw new RuntimeException(cause);
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr4[i8])};
                        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(358189806);
                        if (PngjBadSignature3 == null) {
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27091), 37 - (ViewConfiguration.getJumpTapTimeout() >> 16), ExpandableListView.getPackedPositionChild(0L) + 119, -373889195, false, "b", new Class[]{cls});
                        }
                        cArr5[i8] = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr3)).charValue();
                        i8++;
                    }
                }
                cArr4 = cArr5;
            }
            Object[] objArr4 = {Integer.valueOf(PngjBadSignature)};
            Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1639226071);
            if (PngjBadSignature4 == null) {
                i2 = 1;
                byte b = (byte) (-1);
                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (61713 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 34, 278 - View.MeasureSpec.getMode(0), -1654917268, false, $$e((byte) 10, b, (byte) (b + 1)), new Class[]{cls});
            } else {
                i2 = 1;
            }
            int intValue = ((Integer) ((Method) PngjBadSignature4).invoke(null, objArr4)).intValue();
            int i10 = 12;
            int i11 = -528960794;
            if (PngjUnsupportedException) {
                int length2 = bArr2.length;
                pngjExceptionInternal.PngjException = length2;
                char[] cArr6 = new char[length2];
                pngjExceptionInternal.values = 0;
                while (true) {
                    int i12 = pngjExceptionInternal.values;
                    int i13 = pngjExceptionInternal.PngjException;
                    if (i12 >= i13) {
                        objArr[0] = new String(cArr6);
                        return;
                    }
                    cArr6[i12] = (char) (cArr4[bArr2[(i13 - 1) - i12] + i] - intValue);
                    Object[] objArr5 = new Object[2];
                    objArr5[i2] = pngjExceptionInternal;
                    objArr5[0] = pngjExceptionInternal;
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i11);
                    if (PngjBadSignature5 == null) {
                        byte b2 = (byte) i10;
                        i5 = i11;
                        byte b3 = (byte) (-1);
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 1), (ViewConfiguration.getEdgeSlop() >> 16) + 37, TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 550, 479715165, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
                    } else {
                        i5 = i11;
                    }
                    ((Method) PngjBadSignature5).invoke(null, objArr5);
                    i11 = i5;
                    i10 = 12;
                }
            } else if (PngjExceptionInternal) {
                int i14 = $10 + 11;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    int length3 = cArr3.length;
                    pngjExceptionInternal.PngjException = length3;
                    cArr2 = new char[length3];
                    pngjExceptionInternal.values = i2;
                } else {
                    int length4 = cArr3.length;
                    pngjExceptionInternal.PngjException = length4;
                    cArr2 = new char[length4];
                    pngjExceptionInternal.values = 0;
                }
                while (true) {
                    int i15 = pngjExceptionInternal.values;
                    int i16 = pngjExceptionInternal.PngjException;
                    if (i15 >= i16) {
                        objArr[0] = new String(cArr2);
                        return;
                    }
                    cArr2[i15] = (char) (cArr4[cArr3[(i16 - 1) - i15] - i] - intValue);
                    Object[] objArr6 = new Object[i7];
                    objArr6[1] = pngjExceptionInternal;
                    objArr6[0] = pngjExceptionInternal;
                    Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-528960794);
                    if (PngjBadSignature6 == null) {
                        byte b4 = (byte) (-1);
                        i4 = i7;
                        PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), 37 - ExpandableListView.getPackedPositionGroup(0L), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 548, 479715165, false, $$e((byte) 12, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                    } else {
                        i4 = i7;
                    }
                    ((Method) PngjBadSignature6).invoke(null, objArr6);
                    i7 = i4;
                }
            } else {
                int length5 = iArr.length;
                pngjExceptionInternal.PngjException = length5;
                char[] cArr7 = new char[length5];
                pngjExceptionInternal.values = 0;
                while (true) {
                    int i17 = pngjExceptionInternal.values;
                    int i18 = pngjExceptionInternal.PngjException;
                    if (i17 >= i18) {
                        objArr[0] = new String(cArr7);
                        return;
                    }
                    int i19 = $11 + 7;
                    $10 = i19 % 128;
                    if (i19 % 2 != 0) {
                        cArr7[i17] = (char) (cArr4[iArr[i18 >> i17] << i] << intValue);
                        i3 = i17 << 1;
                    } else {
                        cArr7[i17] = (char) (cArr4[iArr[(i18 - 1) - i17] - i] - intValue);
                        i3 = i17 + 1;
                    }
                    pngjExceptionInternal.values = i3;
                }
            }
        }

        private static void b(String str, int i, byte b, Object[] objArr) {
            int i2;
            int i3;
            char c;
            char c2;
            char c3;
            int length;
            char[] cArr;
            int i4;
            char c4;
            int i5;
            int i6;
            char[] charArray = str != null ? str.toCharArray() : null;
            com.d.e.PngjInputException pngjInputException = new com.d.e.PngjInputException();
            char[] cArr2 = valueOf;
            Class cls = Integer.TYPE;
            int i7 = 252968584;
            char c5 = '\b';
            int i8 = 2;
            int i9 = 0;
            if (cArr2 != null) {
                int i10 = $11 + 113;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    length = cArr2.length;
                    cArr = new char[length];
                } else {
                    length = cArr2.length;
                    cArr = new char[length];
                }
                int i11 = 0;
                while (i11 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i11])};
                        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i7);
                        if (PngjBadSignature2 == null) {
                            i4 = i7;
                            c4 = c5;
                            byte b2 = (byte) i9;
                            i5 = i8;
                            byte b3 = (byte) (b2 - 1);
                            i6 = i9;
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) Gravity.getAbsoluteGravity(i9, i9), (ViewConfiguration.getWindowTouchSlop() >> 8) + 28, 1531 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, i9), -201551053, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{cls});
                        } else {
                            i4 = i7;
                            c4 = c5;
                            i5 = i8;
                            i6 = i9;
                        }
                        cArr[i11] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                        i11++;
                        i7 = i4;
                        c5 = c4;
                        i8 = i5;
                        i9 = i6;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();

                        if (cause == null) {

                            throw new RuntimeException(th);

                        }

                        throw new RuntimeException(cause);
                    }
                }
                cArr2 = cArr;
            }
            int i12 = i7;
            char c6 = c5;
            int i13 = i8;
            int i14 = i9;
            Object[] objArr3 = {Integer.valueOf(PngjException)};
            Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i12);
            if (PngjBadSignature3 == null) {
                byte b4 = (byte) i14;
                byte b5 = (byte) (b4 - 1);
                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((-1) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0')), 28 - View.MeasureSpec.getSize(i14), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1530, -201551053, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{cls});
            }
            char charValue = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr3)).charValue();
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr3[i2] = (char) (charArray[i2] - b);
            } else {
                i2 = i;
            }
            int i15 = 1;
            if (i2 > 1) {
                int i16 = $10 + 31;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    pngjInputException.values = 1;
                } else {
                    pngjInputException.values = 0;
                }
                while (true) {
                    int i17 = pngjInputException.values;
                    if (i17 >= i2) {
                        break;
                    }
                    $10 = ($11 + 55) % 128;
                    char c7 = charArray[i17];
                    pngjInputException.valueOf = c7;
                    char c8 = charArray[i17 + 1];
                    pngjInputException.PngjException = c8;
                    if (c7 == c8) {
                        cArr3[i17] = (char) (c7 - b);
                        cArr3[i17 + 1] = (char) (c8 - b);
                        i3 = i15;
                    } else {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = pngjInputException;
                        objArr4[11] = Integer.valueOf(charValue);
                        objArr4[10] = pngjInputException;
                        objArr4[9] = pngjInputException;
                        objArr4[c6] = Integer.valueOf(charValue);
                        objArr4[7] = pngjInputException;
                        objArr4[6] = pngjInputException;
                        objArr4[5] = Integer.valueOf(charValue);
                        objArr4[4] = pngjInputException;
                        objArr4[3] = pngjInputException;
                        objArr4[i13] = Integer.valueOf(charValue);
                        objArr4[i15] = pngjInputException;
                        objArr4[0] = pngjInputException;
                        Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1620847519);
                        if (PngjBadSignature4 == null) {
                            c = '\t';
                            char resolveSize = (char) View.resolveSize(0, 0);
                            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 27;
                            c2 = 7;
                            int indexOf = 1475 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0);
                            byte b6 = (byte) ($$d & 7);
                            c3 = 6;
                            byte b7 = (byte) (-b6);
                            i3 = i15;
                            String $$e = $$e(b6, b7, (byte) (b7 + 1));
                            Class cls2 = Integer.TYPE;
                            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(resolveSize, doubleTapTimeout, indexOf, 1670167002, false, $$e, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                        } else {
                            i3 = i15;
                            c = '\t';
                            c2 = 7;
                            c3 = 6;
                        }
                        int intValue = ((Integer) ((Method) PngjBadSignature4).invoke(null, objArr4)).intValue();
                        int i18 = pngjInputException.PngjUnsupportedException;
                        if (intValue == i18) {
                            Object[] objArr5 = new Object[11];
                            objArr5[10] = pngjInputException;
                            objArr5[c] = Integer.valueOf(charValue);
                            objArr5[c6] = pngjInputException;
                            objArr5[c2] = Integer.valueOf(charValue);
                            objArr5[c3] = Integer.valueOf(charValue);
                            objArr5[5] = pngjInputException;
                            objArr5[4] = pngjInputException;
                            objArr5[3] = Integer.valueOf(charValue);
                            objArr5[i13] = Integer.valueOf(charValue);
                            objArr5[i3] = pngjInputException;
                            objArr5[0] = pngjInputException;
                            Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1410004713);
                            if (PngjBadSignature5 == null) {
                                char scrollBarFadeDuration = (char) (37426 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                int edgeSlop = 26 - (ViewConfiguration.getEdgeSlop() >> 16);
                                int offsetBefore = 1017 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0);
                                byte b8 = (byte) i13;
                                byte b9 = (byte) (b8 - 3);
                                String $$e2 = $$e(b8, b9, (byte) (b9 + 1));
                                Class cls3 = Integer.TYPE;
                                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(scrollBarFadeDuration, edgeSlop, offsetBefore, 1461347500, false, $$e2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                            }
                            int intValue2 = ((Integer) ((Method) PngjBadSignature5).invoke(null, objArr5)).intValue();
                            int i19 = (pngjInputException.PngjBadCrcException * charValue) + pngjInputException.PngjUnsupportedException;
                            int i20 = pngjInputException.values;
                            cArr3[i20] = cArr2[intValue2];
                            cArr3[i20 + 1] = cArr2[i19];
                        } else {
                            int i21 = pngjInputException.PngjBadSignature;
                            int i22 = pngjInputException.PngjBadCrcException;
                            if (i21 == i22) {
                                int i23 = i3;
                                int C = x5.C(pngjInputException.PngjOutputException, charValue, i23, charValue);
                                pngjInputException.PngjOutputException = C;
                                int C2 = x5.C(i18, charValue, i23, charValue);
                                pngjInputException.PngjUnsupportedException = C2;
                                int i24 = (i22 * charValue) + C2;
                                int i25 = pngjInputException.values;
                                cArr3[i25] = cArr2[(i21 * charValue) + C];
                                cArr3[i25 + i23] = cArr2[i24];
                                $11 = ($10 + 109) % 128;
                                i3 = 1;
                            } else {
                                int i26 = (i21 * charValue) + i18;
                                int i27 = (i22 * charValue) + pngjInputException.PngjOutputException;
                                int i28 = pngjInputException.values;
                                cArr3[i28] = cArr2[i26];
                                i3 = 1;
                                cArr3[i28 + 1] = cArr2[i27];
                            }
                        }
                    }
                    pngjInputException.values += 2;
                    i15 = i3;
                    i13 = 2;
                }
            }
            int i29 = 0;
            while (i29 < i) {
                int i30 = $10 + 39;
                $11 = i30 % 128;
                if (i30 % 2 == 0) {
                    cArr3[i29] = (char) (cArr3[i29] ^ 16821);
                    i29 += 48;
                } else {
                    cArr3[i29] = (char) (cArr3[i29] ^ 13722);
                    i29++;
                }
            }
            objArr[0] = new String(cArr3);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0023). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void c(short s, short s2, int i, Object[] objArr) {
            int i2;
            byte[] bArr = $$a;
            int i3 = 112 - i;
            int i4 = s2 + 4;
            int i5 = 13 - s;
            byte[] bArr2 = new byte[i5];
            if (bArr == null) {
                int i6 = i5;
                i3 = i4;
                i2 = 0;
                i4++;
                i3 += -i6;
                bArr2[i2] = (byte) i3;
                i2++;
                if (i2 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i6 = bArr[i4];
                i4++;
                i3 += -i6;
                bArr2[i2] = (byte) i3;
                i2++;
                if (i2 == i5) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i3;
                i2++;
                if (i2 == i5) {
                }
            }
        }

        public static void init$0() {
            $$a = new byte[]{118, -22, -6, 86, 10, -5, 52, -30, 7, -3, 37, -51, 21, -2, -11, -4, 11, -6, 1};
            $$b = 81;
        }

        public static void init$1() {
            $$c = new byte[]{27, 69, 52, -61};
            $$d = 249;
        }

        /* JADX WARN: Code restructure failed: missing block: B:236:0x1251, code lost:
        
            0.close();
         */
        /* JADX WARN: Removed duplicated region for block: B:247:0x12d5 A[Catch: all -> 0x12c4, Exception -> 0x158b, TryCatch #1 {, blocks: (B:198:0x0ee1, B:201:0x0efd, B:204:0x0f24, B:211:0x0f7e, B:217:0x0fca, B:227:0x107f, B:244:0x12c0, B:245:0x12c7, B:247:0x12d5, B:248:0x131d, B:250:0x1333, B:251:0x137f, B:253:0x1390, B:255:0x13b6, B:257:0x13ea, B:259:0x145f, B:261:0x147e, B:263:0x14a1, B:266:0x14a9, B:316:0x1559, B:317:0x155c, B:321:0x158b, B:322:0x15ae, B:327:0x155e, B:329:0x1564, B:330:0x1565, B:333:0x156b, B:335:0x1571, B:336:0x1572, B:343:0x1576, B:345:0x157c, B:346:0x157d, B:350:0x157e, B:352:0x1584, B:353:0x1585), top: B:197:0x0ee1 }] */
        /* JADX WARN: Removed duplicated region for block: B:250:0x1333 A[Catch: all -> 0x12c4, Exception -> 0x158b, TryCatch #1 {, blocks: (B:198:0x0ee1, B:201:0x0efd, B:204:0x0f24, B:211:0x0f7e, B:217:0x0fca, B:227:0x107f, B:244:0x12c0, B:245:0x12c7, B:247:0x12d5, B:248:0x131d, B:250:0x1333, B:251:0x137f, B:253:0x1390, B:255:0x13b6, B:257:0x13ea, B:259:0x145f, B:261:0x147e, B:263:0x14a1, B:266:0x14a9, B:316:0x1559, B:317:0x155c, B:321:0x158b, B:322:0x15ae, B:327:0x155e, B:329:0x1564, B:330:0x1565, B:333:0x156b, B:335:0x1571, B:336:0x1572, B:343:0x1576, B:345:0x157c, B:346:0x157d, B:350:0x157e, B:352:0x1584, B:353:0x1585), top: B:197:0x0ee1 }] */
        /* JADX WARN: Removed duplicated region for block: B:255:0x13b6 A[Catch: all -> 0x12c4, IOException -> 0x15b8, TryCatch #0 {IOException -> 0x15b8, blocks: (B:253:0x1390, B:255:0x13b6, B:257:0x13ea, B:259:0x145f, B:261:0x147e, B:263:0x14a1, B:321:0x158b, B:322:0x15ae), top: B:252:0x1390 }] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x167d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x167e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object[] values(Context context, int i, int i2, int i3) {
            Object invoke;
            int i4;
            Object[] objArr;
            char c;
            char c2;
            Object[] objArr2;
            char c3;
            Object[] objArr3;
            char c4;
            Object[] objArr4;
            int i5;
            Object[] objArr5;
            char c5;
            String str;
            int i6;
            String[] split;
            int length;
            int i7;
            String str2;
            String[] strArr;
            int i8;
            int i9;
            Object newInstance;
            Object newInstance2;
            DataOutputStream dataOutputStream;
            Object PngjBadSignature2;
            Object PngjBadSignature3;
            int length2;
            int i10;
            String[] strArr2;
            String str3;
            int i11;
            String str4;
            String str5;
            int i12;
            Object[] objArr6;
            Object[] objArr7;
            Object[] objArr8;
            int i13;
            Object[] objArr9 = new Object[1];
            a(null, null, 128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\u008a\u0099\u008b\u0098\u008b\u008a\u0091\u0084\u008d\u008e\u0091\u0097\u0088\u0088\u0096\u0092\u0086\u0088\u0092\u0084\u008b\u0085\u0084\u008b\u008a\u008e\u0092\u008f\u0091\u008a\u0090\u008f\u008b\u008d", objArr9);
            String str6 = (String) objArr9[0];
            Object[] objArr10 = new Object[1];
            b("\u0007!\u0007\"\u0002\f㙆", 7 - (ViewConfiguration.getTouchSlop() >> 8), (byte) (93 - (~(-(Process.myTid() >> 22)))), objArr10);
            String str7 = (String) objArr10[0];
            int i14 = -TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0);
            int i15 = i14 * 253;
            int i16 = ((i15 | 3795) << 1) - (i15 ^ 3795);
            int i17 = ~i14;
            int i18 = ~((i17 & (-16)) | (i17 ^ (-16)));
            int i19 = ~i;
            int i20 = ~(((-16) ^ i19) | ((-16) & i19));
            int i21 = (i18 ^ i20) | (i18 & i20);
            int i22 = (i14 ^ 15) | (i14 & 15);
            int i23 = -16;
            int i24 = ~((i22 ^ i) | (i22 & i));
            int i25 = ((i21 ^ i24) | (i21 & i24)) * (-252);
            int i26 = (i22 * (-252)) + (i16 & i25) + (i25 | i16);
            int i27 = ~i;
            int i28 = ((-16) ^ i27) | ((-16) & i27);
            int i29 = ~((i28 ^ i14) | (i14 & i28));
            int i30 = ((i24 & i29) | (i29 ^ i24)) * 252;
            Object[] objArr11 = new Object[1];
            b("\u000e\u001e\u000e\",/\u001e\u0000\u0001.\u0007\u001c$\"!\u0007", (i26 & i30) + (i30 | i26), (byte) (81 - (~(-(ViewConfiguration.getKeyRepeatDelay() >> 16)))), objArr11);
            String str8 = (String) objArr11[0];
            float f = 0.0f;
            int i31 = 32;
            int i32 = 2;
            try {
                if (context == null) {
                    int i33 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                    int i34 = ~i33;
                    int i35 = ~((i ^ 12) | (i & 12));
                    int i36 = ((i34 | i35) * (-220)) + (i33 * (-109)) + 1332;
                    int i37 = ~((i33 ^ 12) | (i33 & 12));
                    int i38 = ((i37 ^ i35) | (i37 & i35)) * 220;
                    int i39 = ((i36 | i38) << 1) - (i38 ^ i36);
                    int i40 = ~((i34 ^ 12) | (i34 & 12));
                    int i41 = ~((i33 & (-13)) | ((-13) ^ i33));
                    int i42 = -(-(((i41 & i40) | (i40 ^ i41)) * 110));
                    Object[] objArr12 = new Object[1];
                    b(".\u0000\u000f\u001c\u0006\b\u0018\u0017\t\u0001) ", (i39 & i42) + (i42 | i39), (byte) (111 - (~(-(ViewConfiguration.getFadingEdgeLength() >> 16)))), objArr12);
                    Object[] objArr13 = {(String) objArr12[0]};
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1934049891);
                    if (PngjBadSignature4 == null) {
                        char c6 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int indexOf = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 29;
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1447;
                        byte[] bArr = $$a;
                        byte b = bArr[4];
                        byte b2 = (byte) (bArr[18] - 1);
                        Object[] objArr14 = new Object[1];
                        c(b, b2, b2, objArr14);
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c6, indexOf, maximumDrawingCacheSize, -1884803112, false, (String) objArr14[0], new Class[]{String.class});
                    }
                    long longValue = ((Long) ((Method) PngjBadSignature4).invoke(null, objArr13)).longValue();
                    long j = -523417659;
                    long j2 = (407 * longValue) + ((-405) * j);
                    long j3 = -406;
                    long j4 = -1;
                    long j5 = longValue ^ j4;
                    long j6 = i;
                    long j7 = j6 ^ j4;
                    long j8 = ((406 * ((((j ^ j4) | j6) ^ j4) | ((j7 | longValue) ^ j4))) + (((((j5 | j7) | j) ^ j4) * j3) + (((((j5 | j6) ^ j4) | (((j7 | j) | longValue) ^ j4)) * j3) + j2))) - 1193499608;
                    int i43 = ((int) (j8 >> 32)) & ((((~(i27 | (-451329393))) | (~(1888555803 | i))) * 950) + (((~(i27 | 1888555803)) | (~((-451329393) | i))) * (-950)) + (((~(451329392 | i27)) | (~((-1888555804) | i))) * 1900) + 1871737038);
                    int i44 = (((((~((-763370913) | i27)) | 746589344) | (~((-2094369974) | i27))) | (~(2111151541 | i))) * (-84)) - 1905160647;
                    int i45 = (~((-2094369974) | i)) | 763370912;
                    int i46 = ~(2094369973 | i27);
                    int i47 = ((int) j8) & ((((-2111151542) | i46) * 84) + ((i45 | i46) * (-84)) + i44);
                    if (((i47 & i43) | (i43 ^ i47)) != 0) {
                        objArr6 = new Object[]{null, null, new int[]{(i & (-51)) | (i27 & 50)}, new int[]{i}, new int[1]};
                        int myTid = Process.myTid();
                        int i48 = ~myTid;
                        int i49 = ((~(i48 | 371400859)) * 301) + (((~(myTid | (-252956511))) | 100859930 | (~(523497439 | i48))) * (-301)) + ((((~((-252956511) | i48)) | 371400859) * (-602)) - 300126723);
                        int values = _isFoundMatchingTemplates_PngjBadCrcException_values();
                        int i50 = (i49 * (-55)) - 880;
                        int i51 = ~((values ^ 16) | (values & 16));
                        int i52 = ((i51 & i49) | (i49 ^ i51)) * 56;
                        int i53 = ((i50 | i52) << 1) - (i50 ^ i52);
                        int i54 = (~((i49 ^ 16) | (i49 & 16))) * (-56);
                        int i55 = (i53 & i54) + (i54 | i53);
                        int i56 = ~((~values) | i49);
                        int i57 = -(-(((i56 & 16) | (i56 ^ 16)) * 56));
                        int i58 = -(-(((i55 | i57) << 1) - (i57 ^ i55)));
                        int i59 = (i3 ^ i58) + ((i58 & i3) << 1);
                        int i60 = i59 << 13;
                        int i61 = (i60 | i59) & (~(i59 & i60));
                        int i62 = i61 >>> 17;
                        int i63 = (i61 | i62) & (~(i61 & i62));
                        int i64 = i63 << 5;
                        ((int[]) objArr6[4])[0] = (i63 | i64) & (~(i63 & i64));
                    } else {
                        objArr6 = new Object[]{null, null, new int[]{i}, new int[]{i}, new int[]{(0 | 0) & (~(0 & 0))}};
                        int i65 = (((~((-155779085) | i27)) | (~((-268436642) | i)) | (~((-44362561) | i))) * 867) + (((~((-424215726) | i)) | 155779084 | (~((-200141645) | i))) * (-1734)) + (((~((-424215726) | i27)) | (~((-200141645) | i27))) * (-867)) + 776316996;
                        int i66 = (i3 & i65) + (i65 | i3);
                        int i67 = i66 << 13;
                        int i68 = ((~i66) & i67) | ((~i67) & i66);
                        int i69 = i68 ^ (i68 >>> 17);
                        int i70 = i69 << 5;
                    }
                    if (((int[]) objArr6[2])[0] != i) {
                        return objArr6;
                    }
                    int myTid2 = Process.myTid() >> 22;
                    Object[] objArr15 = new Object[1];
                    a(null, null, (myTid2 ^ 127) + ((myTid2 & 127) << 1), "\u0085\u008e\u008d\u0088\u0082\u008c\u0085\u008b\u008a\u0089\u0088\u0087\u0081\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr15);
                    Object[] objArr16 = {(String) objArr15[0]};
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1934049891);
                    if (PngjBadSignature5 == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int trimmedLength = 28 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR);
                        int normalizeMetaState = 1447 - KeyEvent.normalizeMetaState(0);
                        byte[] bArr2 = $$a;
                        byte b3 = bArr2[4];
                        byte b4 = (byte) (bArr2[18] - 1);
                        Object[] objArr17 = new Object[1];
                        c(b3, b4, b4, objArr17);
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionType, trimmedLength, normalizeMetaState, -1884803112, false, (String) objArr17[0], new Class[]{String.class});
                    }
                    long longValue2 = ((Long) ((Method) PngjBadSignature5).invoke(null, objArr16)).longValue();
                    long j9 = -601418780;
                    long j10 = ((-475) * longValue2) + (477 * j9);
                    long j11 = ((j9 ^ j4) | longValue2) ^ j4;
                    long j12 = longValue2 ^ j4;
                    long j13 = j12 | j9;
                    long j14 = (int) Runtime.getRuntime().totalMemory();
                    long j15 = (j13 | j14) ^ j4;
                    long j16 = ((476 * (((j12 | (j14 ^ j4)) | j9) ^ j4)) + ((952 * j15) + (((-476) * (j11 | j15)) + j10))) - 1115498487;
                    int i71 = ((int) (j16 >> 32)) & ((((~((-2012826061) | i27)) | 844914824) * 712) + (((~((-1168181573) | i27)) | (~((-844644489) | i))) * (-712)) + (((1168181572 | 0) * (-712)) - 233628982));
                    int a = defpackage.a.a();
                    int i72 = ~a;
                    int i73 = (~((-334565759) | i72)) | 26280232 | (~((-1771792169) | i72));
                    int i74 = ((int) j16) & ((((~(1771792168 | i72)) | (~(i72 | 334565758))) * 590) + (i73 * (-1180)) + (((~(a | 2080077694)) | i73) * 590) + 68401975);
                    if (((i71 & i74) | (i71 ^ i74)) != 0) {
                        objArr7 = new Object[]{null, null, new int[]{0}, new int[]{i}, new int[1]};
                        int i75 = (~(i & 60)) & (i | 60);
                        int i76 = 785804835 | i27;
                        int i77 = (((~i76) | 641728514) * 495) + (i76 * 495) + 796323338;
                        int values2 = _isFoundMatchingTemplates_PngjBadCrcException_values();
                        int i78 = (-6001) - (~(i77 * (-375)));
                        int i79 = ~i77;
                        int i80 = ~((i79 & (-17)) | ((-17) ^ i79));
                        int i81 = (i80 & values2) | (values2 ^ i80);
                        int i82 = ~((i77 ^ 16) | (i77 & 16));
                        int i83 = ((i81 & i82) | (i81 ^ i82)) * 376;
                        int i84 = (i78 & i83) + (i78 | i83);
                        int i85 = ~((~values2) | 16);
                        int i86 = ~(i77 | 16);
                        int i87 = -(-(((i85 & i86) | (i85 ^ i86)) * (-376)));
                        int i88 = (i84 ^ i87) + ((i87 & i84) << 1);
                        int i89 = ~(values2 | (-17));
                        int i90 = ((i77 & i89) | (i77 ^ i89)) * 376;
                        int i91 = (i88 & i90) + (i90 | i88);
                        int i92 = (i3 ^ i91) + ((i91 & i3) << 1);
                        int i93 = i92 << 13;
                        int i94 = ((~i92) & i93) | ((~i93) & i92);
                        int i95 = i94 >>> 17;
                        int i96 = (i94 | i95) & (~(i94 & i95));
                        int i97 = i96 << 5;
                        ((int[]) objArr7[4])[0] = (i96 | i97) & (~(i96 & i97));
                    } else {
                        objArr7 = new Object[]{null, null, new int[]{i}, new int[]{i}, new int[1]};
                        int i98 = (((~((~((int) Process.getStartElapsedRealtime())) | (-134220418))) | 268699000) * 449) + ((((~((-134220418) | 0)) | 268699000) * 449) - 284601144);
                        int i99 = (i3 ^ i98) + ((i98 & i3) << 1);
                        int i100 = (i99 << 13) ^ i99;
                        int i101 = i100 >>> 17;
                        int i102 = (i100 | i101) & (~(i100 & i101));
                        ((int[]) objArr7[4])[0] = i102 ^ (i102 << 5);
                    }
                    if (((int[]) objArr7[2])[0] != i) {
                        return objArr7;
                    }
                    int i103 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i104 = (i103 ^ 36) + ((i103 & 36) << 1);
                    int axisFromString = MotionEvent.axisFromString(BuildConfig.FLAVOR);
                    int values3 = _isFoundMatchingTemplates_PngjBadCrcException_values();
                    int i105 = axisFromString * (-129);
                    int i106 = (i105 & 4454) + (i105 | 4454);
                    int i107 = (-35) | (~values3);
                    int i108 = ((((~((i107 & axisFromString) | (i107 ^ axisFromString))) * 130) + i106) - (~(-(-((~(((-35) & axisFromString) | ((-35) ^ axisFromString))) * (-260)))))) - 1;
                    int i109 = ~((~axisFromString) | 34);
                    int i110 = (axisFromString & (-35)) | ((-35) ^ axisFromString);
                    int i111 = ~((i110 & values3) | (i110 ^ values3));
                    byte b5 = (byte) ((i108 - (~(-(-(((i111 & i109) | (i109 ^ i111)) * 130))))) - 1);
                    Object[] objArr18 = new Object[1];
                    b("/\u0007\"\u0007#\u0000\u0007!\u0007\"+#\u001c\r.\u0001\r\u001f$/\u001e\u0000\r(\u001e\r\u0007/\u0012)\u0002$\u0007!\u0007\"", i104, b5, objArr18);
                    Object[] objArr19 = {(String) objArr18[0]};
                    Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1142218481);
                    if (PngjBadSignature6 == null) {
                        char packedPositionType2 = (char) ExpandableListView.getPackedPositionType(0L);
                        int resolveSize = View.resolveSize(0, 0) + 28;
                        int keyCodeFromString = 1447 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR);
                        byte[] bArr3 = $$a;
                        byte b6 = (byte) (bArr3[16] + 1);
                        byte b7 = (byte) (-bArr3[13]);
                        Object[] objArr20 = new Object[1];
                        c(b6, b7, (byte) (b7 | 13), objArr20);
                        PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionType2, resolveSize, keyCodeFromString, 1191464116, false, (String) objArr20[0], new Class[]{String.class});
                    }
                    long longValue3 = ((Long) ((Method) PngjBadSignature6).invoke(null, objArr19)).longValue();
                    long j17 = -1140693522;
                    long j18 = 306;
                    long j19 = (j18 * longValue3) + (j18 * j17) + 610;
                    long j20 = 305;
                    long j21 = (j17 | longValue3) ^ j4;
                    long myUid = Process.myUid();
                    long j22 = ((j20 * ((((myUid ^ j4) | j17) ^ j4) | (longValue3 ^ j4))) + (((j21 | ((j17 | myUid) ^ j4)) * j20) + j19)) - 815304355;
                    int i112 = ((int) (j22 >> 32)) & ((((~((~Process.myTid()) | (-684260385))) | 1455140331) * 494) + ((((-675303425) | 0) * 494) - 142558178));
                    int i113 = ((int) j22) & ((((~((-111383467) | i27)) | 10555904 | (~((-1225015382) | i))) * 140) + (((~((-1325842944) | i27)) | 1225015381) * (-280)) + (((-1325842944) | i) * 140) + 2017794257);
                    if (((i112 & i113) | (i112 ^ i113)) != 0) {
                        objArr8 = new Object[]{null, null, new int[]{0}, new int[]{i}, new int[1]};
                        int i114 = (~(i & 80)) & (i | 80);
                        int i115 = (((-155774979) | i) * 591) + (((~((-155774979) | i27)) | (-468582392)) * (-591)) + 438770014;
                        int i116 = ((i115 | 16) << 1) - (i115 ^ 16);
                        int values4 = _isFoundMatchingTemplates_PngjBadCrcException_values();
                        int i117 = i116 * (-183);
                        int i118 = -(-(i3 * 185));
                        int i119 = (i117 & i118) + (i117 | i118);
                        int i120 = ~i116;
                        int i121 = (i119 - (~(-(-(((i3 ^ i120) | (i3 & i120)) * (-368)))))) - 1;
                        int i122 = ~i3;
                        int i123 = ~values4;
                        int i124 = (((i116 ^ i122) | (i116 & i122) | i123) * 184) + i121;
                        int i125 = ~((i120 & i122) | (i120 ^ i122));
                        int i126 = ~((i123 & i116) | (i123 ^ i116));
                        int i127 = (i126 & i125) | (i125 ^ i126);
                        int i128 = ~(i116 | i3);
                        int i129 = ((i128 & i127) | (i127 ^ i128)) * 184;
                        int i130 = (i124 & i129) + (i129 | i124);
                        int i131 = i130 << 13;
                        int i132 = (i131 | i130) & (~(i130 & i131));
                        int i133 = i132 >>> 17;
                        int i134 = ((~i132) & i133) | ((~i133) & i132);
                        int i135 = i134 << 5;
                        i13 = 0;
                        ((int[]) objArr8[4])[0] = (i134 | i135) & (~(i134 & i135));
                    } else {
                        objArr8 = new Object[]{null, null, new int[]{i}, new int[]{i}, new int[]{(0 | 0) & (~(0 & 0))}};
                        int i136 = (((~((-8457930) | i27)) | (~(1003486927 | i))) * 210) + (((~(193793743 | i27)) | (~((-818151114) | i))) * 210) + 890172855;
                        int i137 = i136 * 561;
                        int i138 = (i137 << 1) - i137;
                        int i139 = (~i19) * (-560);
                        int i140 = (i138 ^ i139) + ((i139 & i138) << 1);
                        int i141 = ~i136;
                        int i142 = (~((i141 & i) | (i141 ^ i))) * (-560);
                        int c7 = defpackage.a.c((~(((-1) ^ i136) | i136)) | (~((i136 & i19) | (i19 ^ i136))), 560, (i140 ^ i142) + ((i142 & i140) << 1), i3);
                        int i143 = c7 << 13;
                        int i144 = ((~c7) & i143) | ((~i143) & c7);
                        int i145 = i144 >>> 17;
                        int i146 = (i144 | i145) & (~(i144 & i145));
                        int i147 = i146 << 5;
                        i13 = 0;
                    }
                    if (((int[]) objArr8[2])[i13] != i) {
                        return objArr8;
                    }
                    int i148 = 41 - (~(TypedValue.complexToFloat(i13) > 0.0f ? 1 : (TypedValue.complexToFloat(i13) == 0.0f ? 0 : -1)));
                    int i149 = -((Process.getThreadPriority(i13) + 20) >> 6);
                    Object[] objArr21 = new Object[1];
                    b("/\u0007\"\u0007#\u0000\u0007!\u0007\"+#\u001c\r\u0001+0 \u0001\u001e*\u001d\u0005\t0)\n\r/\b\u0015#/,\u0003$\u001d#\u001c+\u000e\r", i148, (byte) ((i149 & 17) + (i149 | 17)), objArr21);
                    Object[] objArr22 = {(String) objArr21[0]};
                    Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1142218481);
                    if (PngjBadSignature7 == null) {
                        char lastIndexOf = (char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0));
                        int packedPositionType3 = 28 - ExpandableListView.getPackedPositionType(0L);
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1447;
                        byte[] bArr4 = $$a;
                        byte b8 = (byte) (bArr4[16] + 1);
                        byte b9 = (byte) (-bArr4[13]);
                        Object[] objArr23 = new Object[1];
                        c(b8, b9, (byte) (b9 | 13), objArr23);
                        PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(lastIndexOf, packedPositionType3, threadPriority, 1191464116, false, (String) objArr23[0], new Class[]{String.class});
                    }
                    long longValue4 = ((Long) ((Method) PngjBadSignature7).invoke(null, objArr22)).longValue();
                    long j23 = -78742277;
                    long j24 = -397;
                    long j25 = j23 ^ j4;
                    long b10 = defpackage.a.b(1913315792);
                    long j26 = b10 ^ j4;
                    long j27 = (j25 | j26) ^ j4;
                    long j28 = (j25 | longValue4) ^ j4;
                    long j29 = ((397 * ((((longValue4 ^ j4) | j23) ^ j4) | (b10 | j28))) + ((j24 * j28) + ((((j27 | j28) | ((j26 | longValue4) ^ j4)) * j24) + (((-396) * longValue4) + (398 * j23))))) - 1877255600;
                    int i150 = ((int) (j29 >> 32)) & ((((-1890066978) | (~(452840566 | i))) * 502) + ((~((-279445537) | i27)) * (-502)) + (((~((-1890066978) | i)) | 173395030) * (-502)) + 755774394);
                    int i151 = (~((-452327886) | i27)) | 278939973;
                    int i152 = ~(2062942207 | i);
                    int i153 = ((int) j29) & (((~(1889554295 | i27)) * 713) + (i152 * 1426) + ((i151 | i152) * (-713)) + 1877457794);
                    if (((i150 & i153) | (i150 ^ i153)) == 0) {
                        Object[] objArr24 = {null, null, new int[]{i}, new int[]{i}, new int[1]};
                        int myTid3 = Process.myTid();
                        int c8 = defpackage.a.c(myTid3 | 873761235, 104, ((~((~myTid3) | (-180949001))) * (-104)) + (((~(249403865 | myTid3)) | 805306370) * 104) + 115700433, i3);
                        int i154 = c8 << 13;
                        int i155 = (c8 | i154) & (~(c8 & i154));
                        int i156 = i155 >>> 17;
                        int i157 = (i155 | i156) & (~(i155 & i156));
                        int i158 = i157 << 5;
                        ((int[]) objArr24[4])[0] = (i157 | i158) & (~(i157 & i158));
                        return objArr24;
                    }
                    Object[] objArr25 = {null, null, new int[]{(i & (-91)) | (i27 & 90)}, new int[]{i}, new int[1]};
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int i159 = -(-defpackage.a.c((~(elapsedCpuTime | 519962617)) | (~((-372833577) | (~elapsedCpuTime))), 338, (((147129041 | 0) | (~(372833576 | elapsedCpuTime))) * (-338)) - 1185634325, 16));
                    int i160 = (i3 ^ i159) + ((i159 & i3) << 1);
                    int i161 = (i160 << 13) ^ i160;
                    int i162 = i161 >>> 17;
                    int i163 = ((~i161) & i162) | ((~i162) & i161);
                    int i164 = i163 << 5;
                    ((int[]) objArr25[4])[0] = ((~i163) & i164) | ((~i164) & i163);
                    return objArr25;
                }
                try {
                    Object[] objArr26 = new Object[1];
                    a(null, null, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, "\u0084\u0094\u0085\u0084\u008b\u008a\u0093\u0092\u0084\u008b\u0085\u0084\u008b\u008a\u008e\u0092\u008f\u0091\u008a\u0090\u008f\u008b\u008d", objArr26);
                    Class<?> cls = Class.forName((String) objArr26[0]);
                    int i165 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int i166 = (i165 & 15) + (i165 | 15);
                    int i167 = -View.resolveSize(0, 0);
                    Object[] objArr27 = new Object[1];
                    b("\u0001 \u000b\"\u001d#*\"\u0001 *#\b\u001c", i166, (byte) ((i167 & 69) + (i167 | 69)), objArr27);
                    String str9 = (String) cls.getMethod((String) objArr27[0], null).invoke(context, null);
                    Object[] objArr28 = new Object[1];
                    a(null, null, ExpandableListView.getPackedPositionChild(0L) + 128, "\u0084\u0094\u0085\u0084\u008b\u008a\u0093\u0092\u0084\u008b\u0085\u0084\u008b\u008a\u008e\u0092\u008f\u0091\u008a\u0090\u008f\u008b\u008d", objArr28);
                    Class<?> cls2 = Class.forName((String) objArr28[0]);
                    Object[] objArr29 = new Object[1];
                    a(null, null, 127 - Gravity.getAbsoluteGravity(0, 0), "\u008a\u0099\u008b\u0098\u008b\u008a\u0091\u0084\u008d\u008e\u0091\u0097\u0088\u0088\u0096\u0084\u0085\u0095", objArr29);
                    invoke = cls2.getMethod((String) objArr29[0], null).invoke(context, null);
                    int indexOf2 = ((String) defpackage.a.h(str6, str7, invoke)).indexOf(str9);
                    if (indexOf2 > 0) {
                        String str10 = (String) defpackage.a.h(str6, str7, invoke);
                        int length3 = str10.length();
                        int i168 = (length3 & (-16)) + (length3 | (-16));
                        if (i168 >= 0) {
                            int i169 = 0;
                            while (i169 <= i168) {
                                String substring = str10.substring(i169, i169 + 16);
                                Object[] objArr30 = new Object[i32];
                                objArr30[1] = 931995;
                                objArr30[0] = substring;
                                Object PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                                if (PngjBadSignature8 == null) {
                                    char c9 = (char) (11040 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 31;
                                    int maximumFlingVelocity = 1282 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                    byte[] bArr5 = $$a;
                                    byte b11 = bArr5[16];
                                    str4 = str8;
                                    i4 = i27;
                                    str5 = str10;
                                    i12 = i169;
                                    Object[] objArr31 = new Object[1];
                                    c(b11, (byte) (-bArr5[13]), b11, objArr31);
                                    PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c9, scrollBarSize, maximumFlingVelocity, -971849413, false, (String) objArr31[0], new Class[]{String.class, Integer.TYPE});
                                } else {
                                    str4 = str8;
                                    i4 = i27;
                                    str5 = str10;
                                    i12 = i169;
                                }
                                long longValue5 = ((Long) ((Method) PngjBadSignature8).invoke(null, objArr30)).longValue();
                                long j30 = 610202374;
                                int i170 = i168;
                                long j31 = -661;
                                long j32 = (j31 * longValue5) + (j31 * j30);
                                long j33 = i;
                                long j34 = -1;
                                long j35 = j30 ^ j34;
                                long j36 = longValue5 ^ j34;
                                long j37 = (662 * (((j35 | longValue5) ^ j34) | ((j36 | j30) ^ j34))) + ((-1324) * (((j30 | j33) ^ j34) | ((longValue5 | j33) ^ j34))) + (1324 * ((j33 ^ j34) | ((j35 | j36) ^ j34))) + j32 + 45505326;
                                int a2 = defpackage.a.a();
                                int i171 = ~a2;
                                int i172 = (~((-487118878) | i171)) | 84443152;
                                int i173 = ~(a2 | (-547431809));
                                int i174 = ((int) (j37 >> 32)) & (((~(i171 | (-950107534))) * 713) + (i173 * 1426) + ((i172 | i173) * (-713)) + 2038796474);
                                int uptimeMillis = (int) SystemClock.uptimeMillis();
                                int i175 = ((int) j37) & (((uptimeMillis | (-337911809)) * 465) + ((1268303667 | (~((-1589437219) | uptimeMillis))) * 930) + ((((~(1268303667 | uptimeMillis)) | (-1589437219)) * (-465)) - 197561779));
                                if (((i175 & i174) | (i174 ^ i175)) == -725904754) {
                                    objArr = new Object[]{0, null, new int[1], new int[1], new int[1]};
                                    String str11 = (String) defpackage.a.h(str6, str7, invoke);
                                    ((int[]) objArr[3])[0] = i;
                                    ((int[]) objArr[2])[0] = (i & (-21)) | (i4 & 20);
                                    int b12 = defpackage.a.b(1284425867);
                                    int i176 = ((~(b12 | (-4653057))) * 566) + (((~((-611299322) | b12)) | 606646265) * (-566)) + 388759679;
                                    int i177 = (i176 ^ 16) + ((i176 & 16) << 1);
                                    int i178 = (i3 & i177) + (i177 | i3);
                                    int i179 = i178 << 13;
                                    int i180 = (i178 | i179) & (~(i178 & i179));
                                    int i181 = i180 >>> 17;
                                    int i182 = ((~i180) & i181) | ((~i181) & i180);
                                    int i183 = i182 << 5;
                                    ((int[]) objArr[4])[0] = (i182 | i183) & (~(i182 & i183));
                                    break;
                                }
                                int i184 = i12 + 26;
                                i169 = (i184 & (-25)) + (i184 | (-25));
                                i168 = i170;
                                str10 = str5;
                                str8 = str4;
                                i27 = i4;
                                i32 = 2;
                            }
                        }
                        str = str8;
                        i4 = i27;
                        String str12 = (String) defpackage.a.h(str6, str7, invoke);
                        int length4 = str12.length();
                        char c10 = 1;
                        int i185 = (length4 ^ (-6)) + ((length4 & (-6)) << 1);
                        if (i185 >= 0) {
                            int i186 = 0;
                            while (i186 <= i185) {
                                String substring2 = str12.substring(i186, (i186 ^ 6) + ((i186 & 6) << 1));
                                Object[] objArr32 = new Object[2];
                                objArr32[c10] = 931995;
                                objArr32[0] = substring2;
                                Object PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                                if (PngjBadSignature9 == null) {
                                    char indexOf3 = (char) (11038 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0));
                                    int alpha = 31 - Color.alpha(0);
                                    int modifierMetaStateMask = 1281 - ((byte) KeyEvent.getModifierMetaStateMask());
                                    byte[] bArr6 = $$a;
                                    byte b13 = bArr6[16];
                                    str3 = str12;
                                    i11 = i186;
                                    Object[] objArr33 = new Object[1];
                                    c(b13, (byte) (-bArr6[13]), b13, objArr33);
                                    PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf3, alpha, modifierMetaStateMask, -971849413, false, (String) objArr33[0], new Class[]{String.class, Integer.TYPE});
                                } else {
                                    str3 = str12;
                                    i11 = i186;
                                }
                                long longValue6 = ((Long) ((Method) PngjBadSignature9).invoke(null, objArr32)).longValue();
                                long j38 = 236824083;
                                long j39 = (-463) * longValue6;
                                long j40 = 464;
                                long j41 = -1;
                                long j42 = longValue6 ^ j41;
                                long j43 = i;
                                long j44 = j43 ^ j41;
                                long j45 = (j42 | j38) ^ j41;
                                long j46 = (j40 * (j45 | ((j38 | j43) ^ j41))) + ((-464) * (j43 | (j38 ^ j41) | j42)) + ((((j42 | j44) ^ j41) | j45 | ((j44 | j38) ^ j41)) * j40) + j39 + (465 * j38) + 418883617;
                                int i187 = ((int) (j46 >> 32)) & ((((~((-1702472376) | i)) | 1613802163 | (~(i4 | (-176575753)))) * 521) + (((-265245965) | i) * 521) + (((~(i4 | (-265245965))) | 1702472375) * (-1042)) + 121297806);
                                int i188 = ((int) j46) & ((((~((-969778429) | i4)) | 814220376 | (~(2043520509 | i))) * 757) + ((~((-155558053) | i)) * 1514) + ((1887962457 | i4) * (-757)) + 2138348886);
                                if (((i187 & i188) | (i187 ^ i188)) == -2096167706) {
                                    objArr = new Object[]{0, null, new int[1], new int[1], new int[1]};
                                    int i189 = (~(i & 20)) & (i | 20);
                                    String str13 = (String) defpackage.a.h(str6, str7, invoke);
                                    ((int[]) objArr[3])[0] = i;
                                    ((int[]) objArr[2])[0] = i189;
                                    int maxMemory = (int) Runtime.getRuntime().maxMemory();
                                    int A = defpackage.a.A((~(maxMemory | (-8539010))) | 70558816, 235, (((~((-281168782) | maxMemory)) | 343188588) * (-470)) + (((~((~maxMemory) | (-281168782))) | 343188588) * (-235)) + 364390576, i23);
                                    int values5 = _isFoundMatchingTemplates_PngjBadCrcException_values();
                                    int i190 = (i3 * (-183)) + (A * (-183));
                                    int i191 = ~A;
                                    int i192 = ~values5;
                                    int i193 = (i191 & i192) | (i191 ^ i192);
                                    int i194 = ~((i193 & i3) | (i193 ^ i3));
                                    int i195 = ~i3;
                                    int i196 = ~values5;
                                    int i197 = (i195 ^ i196) | (i195 & i196);
                                    int i198 = ~((i197 & A) | (i197 ^ A));
                                    int i199 = -(-(((i194 & i198) | (i194 ^ i198)) * (-184)));
                                    int i200 = (i190 ^ i199) + ((i199 & i190) << 1);
                                    int i201 = ~A;
                                    int i202 = ~(i201 | i195);
                                    int i203 = ~((i201 & i196) | (i201 ^ i196));
                                    int i204 = (i203 & i202) | (i202 ^ i203);
                                    int i205 = ~((i196 & i195) | (i195 ^ i196));
                                    int i206 = ((i205 & i204) | (i204 ^ i205)) * 184;
                                    int i207 = ((A | i3) * 184) + (i200 ^ i206) + ((i206 & i200) << 1);
                                    int i208 = i207 << 13;
                                    int i209 = ((~i207) & i208) | ((~i208) & i207);
                                    int i210 = i209 >>> 17;
                                    int i211 = (i209 | i210) & (~(i209 & i210));
                                    int i212 = i211 << 5;
                                    ((int[]) objArr[4])[0] = (i211 | i212) & (~(i211 & i212));
                                    break;
                                }
                                i186 = ((i11 | 1) << 1) - (i11 ^ 1);
                                str12 = str3;
                                i23 = -16;
                                c10 = 1;
                            }
                        }
                        i6 = 0;
                        String substring3 = ((String) defpackage.a.h(str6, str7, invoke)).substring(0, indexOf2);
                        Object[] objArr34 = new Object[1];
                        a(null, null, 126 - (~KeyEvent.keyCodeFromString(BuildConfig.FLAVOR)), "\u0081", objArr34);
                        split = substring3.split((String) objArr34[0]);
                        length = split.length;
                        i7 = 0;
                        loop4: while (i7 < length) {
                            str2 = split[i7];
                            int i213 = -(-TextUtils.getOffsetAfter(BuildConfig.FLAVOR, i6));
                            Object[] objArr35 = new Object[1];
                            b("\u0016\u0001㗺", ((i213 | 3) << 1) - (i213 ^ 3), (byte) (50 - (~(-(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24))))), objArr35);
                            if (str2.split((String) objArr35[0]).length > 1) {
                                synchronized (((Class) com.d.e.a.PngjBadCrcException.values((char) (31077 - View.getDefaultSize(0, 0)), ImageFormat.getBitsPerPixel(0) + 50, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1043))) {
                                    float f2 = f;
                                    try {
                                        int i214 = -(TypedValue.complexToFraction(0, f2, f2) > f2 ? 1 : (TypedValue.complexToFraction(0, f2, f2) == f2 ? 0 : -1));
                                        Object[] objArr36 = new Object[1];
                                        a(null, null, ((i214 | 127) << 1) - (i214 ^ 127), "\u0082\u0085\u0095\u008d\u009b\u008e\u008d\u0088\u009a\u0084\u0082\u0091\u0097\u009a\u0086\u0088", objArr36);
                                        String str14 = (String) objArr36[0];
                                        try {
                                            Runtime runtime = Runtime.getRuntime();
                                            int i215 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                            int i216 = (i215 & 3) + (i215 | 3);
                                            int i217 = -(-View.MeasureSpec.getMode(0));
                                            strArr = split;
                                            i8 = length;
                                            try {
                                                Object[] objArr37 = new Object[1];
                                                b("\u0000\u0016", i216, (byte) ((i217 & 103) + (i217 | 103)), objArr37);
                                                java.lang.Process exec = runtime.exec((String) objArr37[0], (String[]) null, (File) null);
                                                try {
                                                    Object[] objArr38 = {exec.getInputStream()};
                                                    Object PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(975476048);
                                                    if (PngjBadSignature10 == null) {
                                                        PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (37425 - ImageFormat.getBitsPerPixel(0)), 26 - View.getDefaultSize(0, 0), 1017 - (ViewConfiguration.getTouchSlop() >> 8), -959710997, false, null, new Class[]{InputStream.class});
                                                    }
                                                    newInstance = ((Constructor) PngjBadSignature10).newInstance(objArr38);
                                                    try {
                                                        Object[] objArr39 = {exec.getErrorStream()};
                                                        Object PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(975476048);
                                                        if (PngjBadSignature11 == null) {
                                                            PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37426), View.getDefaultSize(0, 0) + 26, View.resolveSizeAndState(0, 0, 0) + 1017, -959710997, false, null, new Class[]{InputStream.class});
                                                        }
                                                        newInstance2 = ((Constructor) PngjBadSignature11).newInstance(objArr39);
                                                        DataOutputStream dataOutputStream2 = new DataOutputStream(exec.getOutputStream());
                                                        try {
                                                            Class<?> cls3 = Class.forName(str);
                                                            int threadPriority2 = Process.getThreadPriority(0);
                                                            int i218 = (threadPriority2 * 971) - 38780;
                                                            int i219 = ~threadPriority2;
                                                            int i220 = ~((i219 ^ 20) | (i219 & 20));
                                                            int i221 = ~((i4 ^ threadPriority2) | (i4 & threadPriority2));
                                                            int i222 = -(-(((i220 ^ i221) | (i220 & i221)) * (-970)));
                                                            int i223 = (i218 ^ i222) + ((i218 & i222) << 1);
                                                            int i224 = (~(((-21) ^ threadPriority2) | ((-21) & threadPriority2))) * 1940;
                                                            int i225 = (i223 & i224) + (i223 | i224);
                                                            int i226 = ~((-21) | i219);
                                                            int i227 = ~((i4 ^ threadPriority2) | (i4 & threadPriority2));
                                                            int i228 = -(-(((i226 ^ i227) | (i226 & i227)) * 970));
                                                            int i229 = -((((i225 | i228) << 1) - (i225 ^ i228)) >> 6);
                                                            i9 = i7;
                                                            try {
                                                                Object[] objArr40 = new Object[1];
                                                                a(null, null, (i229 & 127) + (i229 | 127), "\u0084\u0090\u008d\u0084\u0082", objArr40);
                                                                cls3.getMethod((String) objArr40[0], null).invoke(newInstance, null);
                                                                try {
                                                                    Class<?> cls4 = Class.forName(str);
                                                                    Object[] objArr41 = new Object[1];
                                                                    a(null, null, 127 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "\u0084\u0090\u008d\u0084\u0082", objArr41);
                                                                    cls4.getMethod((String) objArr41[0], null).invoke(newInstance2, null);
                                                                    try {
                                                                        StringBuilder sb = new StringBuilder();
                                                                        sb.append(str14);
                                                                        int green = Color.green(0);
                                                                        Object[] objArr42 = new Object[1];
                                                                        a(null, null, (green ^ 127) + ((green & 127) << 1), "\u009c", objArr42);
                                                                        sb.append((String) objArr42[0]);
                                                                        String obj = sb.toString();
                                                                        int i230 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                                        Object[] objArr43 = new Object[1];
                                                                        b("\u0015\u0003\u0019\u0013㗲", ((i230 | 4) << 1) - (i230 ^ 4), (byte) (79 - (~(-(-(ViewConfiguration.getKeyRepeatDelay() >> 16))))), objArr43);
                                                                        dataOutputStream2.write(obj.getBytes((String) objArr43[0]));
                                                                        dataOutputStream2.flush();
                                                                        int i231 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                                        int values6 = _isFoundMatchingTemplates_PngjBadCrcException_values();
                                                                        int i232 = ~i231;
                                                                        int i233 = (((i232 & 127) | (i232 ^ 127)) * 160) + ((i231 * (-159)) - 20193);
                                                                        int i234 = ~values6;
                                                                        int i235 = ~((i234 & i231) | (i234 ^ i231));
                                                                        int i236 = ~(i231 | 127);
                                                                        int i237 = ((i235 & i236) | (i235 ^ i236)) * (-160);
                                                                        int i238 = (i233 ^ i237) + ((i237 & i233) << 1);
                                                                        int i239 = ~values6;
                                                                        int i240 = (i231 | (~((i239 & (-128)) | ((-128) ^ i239)))) * 160;
                                                                        Object[] objArr44 = new Object[1];
                                                                        a(null, null, (i238 ^ i240) + ((i240 & i238) << 1), "\u009c\u0084\u0091\u0094\u0085", objArr44);
                                                                        String str15 = (String) objArr44[0];
                                                                        Object[] objArr45 = new Object[1];
                                                                        b("\u0015\u0003\u0019\u0013㗲", Color.green(0) + 5, (byte) (79 - (~(-(-Color.argb(0, 0, 0, 0))))), objArr45);
                                                                        dataOutputStream2.write(str15.getBytes((String) objArr45[0]));
                                                                        dataOutputStream2.flush();
                                                                        try {
                                                                            try {
                                                                                long nanoTime = System.nanoTime();
                                                                                long nanos = TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                                while (true) {
                                                                                    try {
                                                                                        exec.exitValue();
                                                                                        dataOutputStream = dataOutputStream2;
                                                                                        break;
                                                                                    } catch (IllegalThreadStateException unused) {
                                                                                        if (nanos > 0) {
                                                                                            DataOutputStream dataOutputStream3 = dataOutputStream2;
                                                                                            try {
                                                                                                Object[] objArr46 = {Long.valueOf(Math.min(TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                                Class<?> cls5 = Class.forName(str);
                                                                                                int i241 = -View.resolveSize(0, 0);
                                                                                                int i242 = ((i241 | 5) << 1) - (i241 ^ 5);
                                                                                                int gidForName = Process.getGidForName(BuildConfig.FLAVOR);
                                                                                                int i243 = gidForName * 989;
                                                                                                int i244 = (i243 ^ (-103635)) + ((i243 & (-103635)) << 1);
                                                                                                int i245 = ~(((-106) ^ i4) | ((-106) & i4) | gidForName);
                                                                                                int i246 = gidForName | 105;
                                                                                                dataOutputStream = dataOutputStream3;
                                                                                                int i247 = ~((i246 ^ i) | (i246 & i));
                                                                                                int i248 = ((i245 ^ i247) | (i247 & i245)) * 988;
                                                                                                int i249 = (i244 ^ i248) + ((i244 & i248) << 1);
                                                                                                int i250 = -(-(((gidForName ^ (-106)) | (gidForName & (-106))) * (-988)));
                                                                                                int i251 = ((i249 | i250) << 1) - (i250 ^ i249);
                                                                                                int i252 = ~((~gidForName) | (-106));
                                                                                                int i253 = ~((-106) | i);
                                                                                                int i254 = (i252 ^ i253) | (i252 & i253);
                                                                                                int i255 = (i4 & gidForName) | (i4 ^ gidForName);
                                                                                                int i256 = ~((i255 & 105) | (i255 ^ 105));
                                                                                                Object[] objArr47 = new Object[1];
                                                                                                b("\u0004+㙧㙧㙒", i242, (byte) ((i251 - (~(-(-(((i254 & i256) | (i254 ^ i256)) * 988))))) - 1), objArr47);
                                                                                                cls5.getMethod((String) objArr47[0], Long.TYPE).invoke(null, objArr46);
                                                                                            } catch (Throwable th) {
                                                                                                Throwable cause = th.getCause();
                                                                                                if (cause != null) {
                                                                                                    throw new RuntimeException(cause);
                                                                                                }
                                                                                                throw new RuntimeException(th);
                                                                                            }
                                                                                        } else {
                                                                                            dataOutputStream = dataOutputStream2;
                                                                                        }
                                                                                        long nanos2 = TimeUnit.MILLISECONDS.toNanos(2000L) - (System.nanoTime() - nanoTime);
                                                                                        if (nanos2 > 0) {
                                                                                            nanos = nanos2;
                                                                                            dataOutputStream2 = dataOutputStream;
                                                                                            i31 = 32;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } catch (InterruptedException e) {
                                                                                throw e;
                                                                            }
                                                                        } finally {
                                                                            try {
                                                                                exec.destroy();
                                                                            } catch (Exception unused2) {
                                                                            }
                                                                        }
                                                                    } catch (Exception unused3) {
                                                                        int i257 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                                        Object[] objArr48 = new Object[1];
                                                                        a(null, null, ((i257 | 127) << 1) - (i257 ^ 127), "\u0092\u0082\u0082\u0085\u008e\u008a\u0090\u0088\u009a\u008d\u009a\u0085\u0084\u008d\u0085\u0090\u008e\u009a\u008a\u0084\u009a\u008f\u0085\u0097\u0091\u008d\u009e", objArr48);
                                                                        throw new IOException((String) objArr48[0]);
                                                                    }
                                                                } catch (Throwable th2) {
                                                                    Throwable cause2 = th2.getCause();
                                                                    if (cause2 != null) {
                                                                        throw new RuntimeException(cause2);
                                                                    }
                                                                    throw new RuntimeException(th2);
                                                                }
                                                            } catch (Throwable th3) {
                                                                Throwable cause3 = th3.getCause();
                                                                if (cause3 != null) {
                                                                    throw new RuntimeException(cause3);
                                                                }
                                                                throw new RuntimeException(th3);
                                                            }
                                                        } catch (Throwable th4) {
                                                            throw new RuntimeException(th4);
                                                        }
                                                    } catch (Throwable th5) {
                                                        Throwable cause4 = th5.getCause();
                                                        if (cause4 != null) {
                                                            throw new RuntimeException(cause4);
                                                        }
                                                        throw new RuntimeException(th5);
                                                    }
                                                } catch (Throwable th6) {
                                                    Throwable cause5 = th6.getCause();
                                                    if (cause5 != null) {
                                                        throw new RuntimeException(cause5);
                                                    }
                                                    throw new RuntimeException(th6);
                                                }
                                            } catch (Exception unused4) {
                                                i9 = i7;
                                                int i2572 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                Object[] objArr482 = new Object[1];
                                                a(null, null, ((i2572 | 127) << 1) - (i2572 ^ 127), "\u0092\u0082\u0082\u0085\u008e\u008a\u0090\u0088\u009a\u008d\u009a\u0085\u0084\u008d\u0085\u0090\u008e\u009a\u008a\u0084\u009a\u008f\u0085\u0097\u0091\u008d\u009e", objArr482);
                                                throw new IOException((String) objArr482[0]);
                                            }
                                        } catch (Exception unused5) {
                                            strArr = split;
                                            i8 = length;
                                        }
                                    } catch (IOException unused6) {
                                        strArr = split;
                                        i8 = length;
                                        i9 = i7;
                                    }
                                }
                                objArr = new Object[]{0, null, new int[1], new int[1], new int[1]};
                                int i258 = (~(i & 20)) & (i | 20);
                                String str16 = (String) defpackage.a.h(str6, str7, invoke);
                                ((int[]) objArr[3])[0] = i;
                                ((int[]) objArr[2])[0] = i258;
                                int i259 = (((~((-1022632792) | i)) | 347349845 | (~((-398275422) | i))) * 407) + (((~(1022632791 | i)) | (~(398275421 | i4)) | 347349845) * 407) + ((((-1073558368) | 0) * (-814)) - 1759385883);
                                int i260 = (i3 - (~(-(-(((i259 | 16) << 1) - (i259 ^ 16)))))) - 1;
                                int i261 = i260 << 13;
                                int i262 = ((~i260) & i261) | ((~i261) & i260);
                                int i263 = i262 ^ (i262 >>> 17);
                                int i264 = i263 << 5;
                                ((int[]) objArr[4])[0] = (i263 | i264) & (~(i263 & i264));
                                c2 = 2;
                                c = 0;
                            } else {
                                strArr = split;
                                i8 = length;
                                i9 = i7;
                            }
                            i7 = (i9 & 1) + (i9 | 1);
                            split = strArr;
                            length = i8;
                            i6 = 0;
                            f = 0.0f;
                            i31 = 32;
                        }
                    } else {
                        i4 = i27;
                    }
                    objArr = new Object[]{null, null, new int[]{i}, new int[]{i}, new int[1]};
                    int i265 = (int) Runtime.getRuntime().totalMemory();
                    int i266 = ~i265;
                    int i267 = (((~(i266 | 850539122)) | (~(226181752 | i266))) * 865) + ((~(i265 | 850539122)) * 865) + ((((~((-850539123) | i266)) | 226181752) * (-865)) - 19988988);
                    int i268 = (i267 << 1) - i267;
                    int values7 = _isFoundMatchingTemplates_PngjBadCrcException_values();
                    int i269 = i268 * 784;
                    int i270 = -(-(i3 * (-782)));
                    int i271 = ((~i3) * (-783)) + (i269 & i270) + (i269 | i270);
                    int i272 = ~i268;
                    int i273 = ~values7;
                    int i274 = i272 | i273;
                    int i275 = ((~((i274 & i3) | (i274 ^ i3))) * (-783)) + i271;
                    int i276 = ~((i273 & i3) | (i273 ^ i3));
                    int i277 = ((i272 & i276) | (i272 ^ i276)) * 783;
                    int i278 = (i275 ^ i277) + ((i277 & i275) << 1);
                    int i279 = i278 << 13;
                    int i280 = (i279 & (~i278)) | ((~i279) & i278);
                    int i281 = i280 >>> 17;
                    int i282 = (i280 | i281) & (~(i280 & i281));
                    int i283 = i282 << 5;
                    c = 0;
                    ((int[]) objArr[4])[0] = ((~i282) & i283) | ((~i283) & i282);
                    c2 = 2;
                    if (((int[]) objArr[c2])[c] == i) {
                        return objArr;
                    }
                    Object[] objArr49 = new Object[5];
                    int[] iArr = new int[1];
                    objArr49[c2] = iArr;
                    int[] iArr2 = new int[1];
                    objArr49[3] = iArr2;
                    objArr49[4] = new int[1];
                    iArr2[c] = i;
                    iArr[c] = i;
                    objArr49[1] = null;
                    objArr49[c] = null;
                    int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i284 = (((~((-637534184) | elapsedRealtime)) | 13176813) * (-318)) + 1392024207;
                    int i285 = ~(13176813 | elapsedRealtime);
                    int i286 = ~elapsedRealtime;
                    int i287 = (((~(elapsedRealtime | (-9))) | (~(637534191 | i286))) * 318) + ((i285 | (~(i286 | (-9)))) * 318) + i284;
                    int i288 = -(-((i287 << 1) - i287));
                    int i289 = (i3 & i288) + (i288 | i3);
                    int i290 = (i289 << 13) ^ i289;
                    int i291 = i290 >>> 17;
                    int i292 = ((~i290) & i291) | ((~i291) & i290);
                    ((int[]) objArr49[4])[0] = i292 ^ (i292 << 5);
                    if (((int[]) objArr49[2])[0] != i) {
                        return objArr49;
                    }
                    if ((i2 & 1) == 0) {
                        int i293 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
                        int i294 = (i293 ^ 13) + ((i293 & 13) << 1);
                        int i295 = -View.MeasureSpec.getMode(0);
                        Object[] objArr50 = new Object[1];
                        b("\b!\u0010\r+$&' 0\b%㙔", i294, (byte) ((i295 & 113) + (i295 | 113)), objArr50);
                        try {
                            Object[] objArr51 = {(String) objArr50[0]};
                            int argb = Color.argb(0, 0, 0, 0);
                            Object[] objArr52 = new Object[1];
                            a(null, null, ((argb | 127) << 1) - (argb ^ 127), "\u0084\u0094\u0085\u0084\u008b\u008a\u0093\u0092\u0084\u008b\u0085\u0084\u008b\u008a\u008e\u0092\u008f\u0091\u008a\u0090\u008f\u008b\u008d", objArr52);
                            Class<?> cls6 = Class.forName((String) objArr52[0]);
                            int gidForName2 = 15 - Process.getGidForName(BuildConfig.FLAVOR);
                            int i296 = -(-View.combineMeasuredStates(0, 0));
                            Object[] objArr53 = new Object[1];
                            b("\u0001 \b\u001b\u0016\u0004\b\"\b\u0015\"$\u0010\r+$", gidForName2, (byte) (((i296 | 92) << 1) - (i296 ^ 92)), objArr53);
                            Object invoke2 = cls6.getMethod((String) objArr53[0], String.class).invoke(context, objArr51);
                            if (invoke2 != null) {
                                int i297 = 38 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                int i298 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                Object[] objArr54 = new Object[1];
                                b("\u001e\u0000\r(\u001e\r\b/\u001f#$-!\u0007\b\n\u0001,\u0001!\u0010\r+$!\u001c,\u000b'\u0016\u0015\"\u0000\u001e\u0001 㗿", i297, (byte) ((i298 & 23) + (i298 | 23)), objArr54);
                                Class<?> cls7 = Class.forName((String) objArr54[0]);
                                int i299 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                int i300 = ~i299;
                                int i301 = ~(i300 | i4);
                                int i302 = ~(i300 | 15);
                                int i303 = (i302 & i301) | (i301 ^ i302);
                                int i304 = ((-16) ^ i299) | ((-16) & i299);
                                int i305 = ~((i304 & i) | (i304 ^ i));
                                int i306 = (((i299 * 714) - 10680) - (~(-(-(((i303 & i305) | (i303 ^ i305)) * (-713)))))) - 1;
                                int i307 = ((-16) & i299) | ((-16) ^ i299);
                                Object[] objArr55 = new Object[1];
                                b("\u0001 \n\")\b\r\u0010\u001e \r\b\u0010\t㘳", ((~(((-16) ^ i4) | ((-16) & i4))) * 713) + ((i306 - (~(-(-((~((i307 & i) | (i307 ^ i))) * 1426))))) - 1), (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 73), objArr55);
                                List list = (List) cls7.getMethod((String) objArr55[0], null).invoke(invoke2, null);
                                if (list != null) {
                                    Iterator it = list.iterator();
                                    loop1: while (it.hasNext()) {
                                        Object next = it.next();
                                        Object[] objArr56 = new Object[1];
                                        a(null, null, 128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\u0085\u0086\u008d \u0084\u008b\u0085\u008b\u008a\u0088\u0086\u008a\u0093\u0092\u0084\u008b\u0085\u0084\u008b\u008a\u008e\u0092\u008f\u0091\u008a\u0090\u008f\u008b\u008d", objArr56);
                                        Class<?> cls8 = Class.forName((String) objArr56[0]);
                                        int myPid = 14 - (Process.myPid() >> 22);
                                        int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
                                        Object[] objArr57 = new Object[1];
                                        b("\u0001 \u000b\"\u001d#*\"\u0001 *#\b\u001c", myPid, (byte) ((pressedStateDuration & 69) + (pressedStateDuration | 69)), objArr57);
                                        String str17 = (String) cls8.getMethod((String) objArr57[0], null).invoke(next, null);
                                        Object[] objArr58 = new Object[1];
                                        b("\u001e\u0000\r(\u001e\r\b/\u001f#$-!\u0007\b\n\u0001,\u0001!\u0010\r+$!\u001c,\u000b'\u0016\u0015\"\u0000\u001e\u0001 㗿", 37 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), (byte) (22 - (~(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))), objArr58);
                                        Class<?> cls9 = Class.forName((String) objArr58[0]);
                                        int i308 = 17 - (~(-(-TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0))));
                                        int red = Color.red(0);
                                        Object[] objArr59 = new Object[1];
                                        b("\b\u0002\"' )\u000b,\u001e\u0016,\u0005\"$&-㘭", i308, (byte) ((red ^ 67) + ((red & 67) << 1)), objArr59);
                                        if (((Boolean) cls9.getMethod((String) objArr59[0], String.class).invoke(invoke2, str17)).booleanValue()) {
                                            int length5 = str17.length();
                                            int i309 = (length5 ^ (-20)) + ((length5 & (-20)) << 1);
                                            if (i309 >= 0) {
                                                int i310 = 0;
                                                while (i310 <= i309) {
                                                    Object[] objArr60 = {str17.substring(i310, i310 + 20), 931995};
                                                    Object PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                                                    if (PngjBadSignature12 == null) {
                                                        char pressedStateDuration2 = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 11039);
                                                        int windowTouchSlop = 31 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                                        int indexOf4 = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 1283;
                                                        byte[] bArr7 = $$a;
                                                        byte b14 = bArr7[16];
                                                        Object[] objArr61 = new Object[1];
                                                        c(b14, (byte) (-bArr7[13]), b14, objArr61);
                                                        PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(pressedStateDuration2, windowTouchSlop, indexOf4, -971849413, false, (String) objArr61[0], new Class[]{String.class, Integer.TYPE});
                                                    }
                                                    long longValue7 = ((Long) ((Method) PngjBadSignature12).invoke(null, objArr60)).longValue();
                                                    long j47 = -51799410;
                                                    long j48 = 521;
                                                    Object obj2 = invoke2;
                                                    Iterator it2 = it;
                                                    long j49 = -1;
                                                    long j50 = j47 ^ j49;
                                                    long j51 = i;
                                                    long j52 = ((((j50 | longValue7) | j51) ^ j49) * j48) + (522 * longValue7) + ((-520) * j47);
                                                    long j53 = ((longValue7 ^ j49) | j47) ^ j49;
                                                    long j54 = (j48 * ((((j50 | (j51 ^ j49)) | longValue7) ^ j49) | j53)) + ((-1042) * j53) + j52 + 707507110;
                                                    int freeMemory = (int) Runtime.getRuntime().freeMemory();
                                                    int i311 = (((~(1420386987 | freeMemory)) | 16839423) * 672) + 1297193930;
                                                    int i312 = ~freeMemory;
                                                    int i313 = ((int) (j54 >> 32)) & ((((~((-16839424) | i312)) | 16814164) * 672) + (((~(freeMemory | 16839423)) | (~((-1420386988) | i312))) * (-672)) + i311);
                                                    int i314 = ~((int) Process.getStartElapsedRealtime());
                                                    int i315 = ((int) j54) & ((((~(i314 | (-1073873298))) | 171967492) * 241) + (((~((-1879823346) | i314)) | 805950048) * (-241)) + 1028714225);
                                                    if (((i313 & i315) | (i313 ^ i315)) == 1245577864) {
                                                        objArr5 = new Object[]{null, null, new int[]{(i & (-71)) | (i4 & 70)}, new int[]{i}, new int[1]};
                                                        int startUptimeMillis = (int) Process.getStartUptimeMillis();
                                                        int i316 = ~startUptimeMillis;
                                                        int i317 = (((~(startUptimeMillis | 549602485)) | (~(i316 | (-549602486))) | (~((-74754885) | startUptimeMillis))) * 959) + (((~((-74754885) | i316)) | (~((-549602486) | startUptimeMillis)) | (~(i316 | 549602485))) * 959) + 896984252;
                                                        int i318 = (i317 & 16) + (i317 | 16) + i3;
                                                        int i319 = i318 << 13;
                                                        int i320 = (i319 & (~i318)) | ((~i319) & i318);
                                                        int i321 = i320 >>> 17;
                                                        int i322 = (i320 | i321) & (~(i320 & i321));
                                                        ((int[]) objArr5[4])[0] = i322 ^ (i322 << 5);
                                                        c5 = 0;
                                                        break loop1;
                                                    }
                                                    i310++;
                                                    invoke2 = obj2;
                                                    it = it2;
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                        invoke2 = invoke2;
                                        it = it;
                                    }
                                }
                            }
                            objArr5 = new Object[]{null, null, new int[]{i}, new int[]{i}, new int[1]};
                            int i323 = (((~((~defpackage.a.b(1989811794)) | (-268446089))) | 178308721) * 521) + (((~((-268446089) | 0)) * 521) - 206664136);
                            int i324 = (i323 << 1) - i323;
                            int i325 = (i3 ^ i324) + ((i324 & i3) << 1);
                            int i326 = i325 ^ (i325 << 13);
                            int i327 = i326 >>> 17;
                            int i328 = ((~i326) & i327) | ((~i327) & i326);
                            int i329 = i328 << 5;
                            c5 = 0;
                            ((int[]) objArr5[4])[0] = (i328 | i329) & (~(i328 & i329));
                            if (((int[]) objArr5[2])[c5] != i) {
                                return objArr5;
                            }
                        } catch (Throwable th7) {
                            Throwable cause6 = th7.getCause();
                            if (cause6 != null) {
                                throw new RuntimeException(cause6);
                            }
                            throw new RuntimeException(th7);
                        }
                    }
                    int red2 = Color.red(0);
                    int values8 = _isFoundMatchingTemplates_PngjBadCrcException_values();
                    int i330 = red2 * (-209);
                    int i331 = (i330 ^ (-2508)) + ((i330 & (-2508)) << 1);
                    int i332 = ~red2;
                    int i333 = -(-((~((i332 & (-13)) | (i332 ^ (-13)))) * 210));
                    int i334 = ((i331 | i333) << 1) - (i333 ^ i331);
                    int i335 = ~((~values8) | (-13));
                    int i336 = ~red2;
                    int i337 = ~((i336 ^ values8) | (i336 & values8));
                    int i338 = -(-(((i335 & i337) | (i335 ^ i337)) * 210));
                    int i339 = ((i334 | i338) << 1) - (i338 ^ i334);
                    int i340 = (~values8) | i336;
                    int i341 = ~((i340 & 12) | (i340 ^ 12));
                    int i342 = red2 | (-13);
                    int i343 = ~((i342 & values8) | (i342 ^ values8));
                    int i344 = -(-(((i343 & i341) | (i341 ^ i343)) * 210));
                    Object[] objArr62 = new Object[1];
                    b(".\u0000\u000f\u001c\u0006\b\u0018\u0017\t\u0001) ", (i339 ^ i344) + ((i344 & i339) << 1), (byte) (111 - (~(-View.getDefaultSize(0, 0)))), objArr62);
                    Object[] objArr63 = {(String) objArr62[0]};
                    Object PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1934049891);
                    if (PngjBadSignature13 == null) {
                        char keyCodeFromString2 = (char) KeyEvent.keyCodeFromString(BuildConfig.FLAVOR);
                        int lastIndexOf2 = TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 29;
                        int fadingEdgeLength = 1447 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        byte[] bArr8 = $$a;
                        byte b15 = bArr8[4];
                        byte b16 = (byte) (bArr8[18] - 1);
                        Object[] objArr64 = new Object[1];
                        c(b15, b16, b16, objArr64);
                        PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(keyCodeFromString2, lastIndexOf2, fadingEdgeLength, -1884803112, false, (String) objArr64[0], new Class[]{String.class});
                    }
                    long longValue8 = ((Long) ((Method) PngjBadSignature13).invoke(null, objArr63)).longValue();
                    long j55 = -760314023;
                    long j56 = ((-475) * longValue8) + (477 * j55);
                    long j57 = -1;
                    long j58 = ((j55 ^ j57) | longValue8) ^ j57;
                    long j59 = longValue8 ^ j57;
                    long uptimeMillis2 = (int) SystemClock.uptimeMillis();
                    long j60 = ((j59 | j55) | uptimeMillis2) ^ j57;
                    long j61 = ((476 * (((j59 | (uptimeMillis2 ^ j57)) | j55) ^ j57)) + ((952 * j60) + (((-476) * (j58 | j60)) + j56))) - 956603244;
                    int c11 = ((int) (j61 >> 32)) & defpackage.a.c((~(((int) Runtime.getRuntime().freeMemory()) | 755372174)) | 1346996544, 490, ((2102368718 | (~0)) * (-490)) - 1461079942, -631483140);
                    int i345 = ((int) j61) & ((((~(i4 | (-27263317))) | 604508161) * 521) + ((~((-27263317) | i)) * 521) + 122315864);
                    if (((c11 & i345) | (c11 ^ i345)) != 0) {
                        objArr2 = new Object[]{null, null, new int[]{0}, new int[]{i}, new int[]{(0 | 0) & (~(0 & 0))}};
                        int i346 = (~(i & 50)) & (i | 50);
                        int i347 = (((-191891604) | (~((-432465767) | i))) * 502) + ((~(i4 | (-36702354))) * (-502)) + (((~((-191891604) | i)) | (-469168120)) * (-502)) + 115211831;
                        int i348 = (i3 - (~(-(-((i347 ^ 16) + ((i347 & 16) << 1)))))) - 1;
                        int i349 = i348 ^ (i348 << 13);
                        int i350 = i349 >>> 17;
                        int i351 = ((~i349) & i350) | ((~i350) & i349);
                        int i352 = i351 << 5;
                        c3 = 0;
                    } else {
                        objArr2 = new Object[]{null, null, new int[]{i}, new int[]{i}, new int[]{0 ^ (0 << 5)}};
                        int c12 = defpackage.a.c((~((-1020761745) | i)) | 343967376 | (~((-396404375) | i)), -69, (((~((-676794369) | i)) | (~((-52436999) | i))) * 69) - 375428228, -1036269235);
                        int i353 = (c12 << 1) - c12;
                        int i354 = (i3 ^ i353) + ((i353 & i3) << 1);
                        int i355 = i354 << 13;
                        int i356 = (i354 | i355) & (~(i354 & i355));
                        int i357 = i356 >>> 17;
                        int i358 = ((~i356) & i357) | ((~i357) & i356);
                        c3 = 0;
                    }
                    if (((int[]) objArr2[2])[c3] != i) {
                        return objArr2;
                    }
                    Object[] objArr65 = new Object[1];
                    a(null, null, 127 - (Process.myPid() >> 22), "\u0085\u008e\u008d\u0088\u0082\u008c\u0085\u008b\u008a\u0089\u0088\u0087\u0081\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr65);
                    Object[] objArr66 = {(String) objArr65[c3]};
                    Object PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1934049891);
                    if (PngjBadSignature14 == null) {
                        char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 28;
                        int packedPositionType4 = ExpandableListView.getPackedPositionType(0L) + 1447;
                        byte[] bArr9 = $$a;
                        byte b17 = bArr9[4];
                        byte b18 = (byte) (bArr9[18] - 1);
                        Object[] objArr67 = new Object[1];
                        c(b17, b18, b18, objArr67);
                        PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(scrollBarSize2, longPressTimeout, packedPositionType4, -1884803112, false, (String) objArr67[0], new Class[]{String.class});
                    }
                    long longValue9 = ((Long) ((Method) PngjBadSignature14).invoke(null, objArr66)).longValue();
                    long j62 = -1674579904;
                    long j63 = 569;
                    long j64 = j62 ^ j57;
                    long j65 = longValue9 ^ j57;
                    long j66 = j64 | j65;
                    long myPid2 = Process.myPid();
                    long j67 = myPid2 ^ j57;
                    long j68 = ((-1136) * ((j66 ^ j57) | ((j64 | j67) ^ j57) | ((j65 | j67) ^ j57))) + (j63 * longValue9) + (j63 * j62);
                    long j69 = j67 | j62;
                    long j70 = ((568 * ((((j67 | longValue9) ^ j57) | (j69 ^ j57)) | ((j66 | myPid2) ^ j57))) + (((-568) * ((((j64 | myPid2) ^ j57) | ((j65 | myPid2) ^ j57)) | ((j69 | longValue9) ^ j57))) + j68)) - 42337363;
                    int i359 = (int) Runtime.getRuntime().totalMemory();
                    int i360 = ~i359;
                    int i361 = ((int) (j70 >> 32)) & ((((~(i359 | (-296306955))) | (~(i360 | (-570459729)))) * 168) + ((~((-570459729) | i359)) * 168) + (((~((-866766683) | i360)) | 570459728) * 168) + 501358106);
                    int myTid4 = Process.myTid();
                    int i362 = (((~((-96671596) | myTid4)) | (~(1533898005 | myTid4))) * 140) + (((21038337 | 0) * (-280)) - 790748959);
                    int i363 = ~((-75633259) | myTid4);
                    int i364 = ~myTid4;
                    int i365 = ((int) j70) & ((((~(i364 | 1609531263)) | i363 | (~((-21038338) | i364))) * 140) + i362);
                    if (((i361 & i365) | (i361 ^ i365)) != 0) {
                        objArr3 = new Object[]{null, null, new int[]{(i & (-61)) | (i4 & 60)}, new int[]{i}, new int[1]};
                        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                        int i366 = (((~(startElapsedRealtime | 792459327)) | 33720369) * 366) + (((~(100911163 | startElapsedRealtime)) | 725268533) * (-366)) + 327914929;
                        int values9 = _isFoundMatchingTemplates_PngjBadCrcException_values();
                        int i367 = 1135 - (~(-(-(i366 * (-69)))));
                        int i368 = ~(((-17) & i366) | ((-17) ^ i366));
                        int i369 = ~((i366 ^ values9) | (i366 & values9));
                        int i370 = (i367 - (~(-(-(((i368 & i369) | (i368 ^ i369)) * (-140)))))) - 1;
                        int i371 = (~((i366 ^ 16) | (i366 & 16) | values9)) * 70;
                        int i372 = (i370 & i371) + (i370 | i371);
                        int i373 = ~((-17) | i366);
                        int i374 = ~i366;
                        int i375 = ~((i374 & 16) | (i374 ^ 16));
                        int i376 = (i375 & i373) | (i373 ^ i375);
                        int i377 = ~(values9 | 16);
                        int i378 = -(-(((i376 & i377) | (i376 ^ i377)) * 70));
                        int i379 = -(-((i372 & i378) + (i378 | i372)));
                        int i380 = (i3 ^ i379) + ((i379 & i3) << 1);
                        int i381 = i380 << 13;
                        int i382 = (i381 & (~i380)) | ((~i381) & i380);
                        int i383 = i382 ^ (i382 >>> 17);
                        c4 = 0;
                        ((int[]) objArr3[4])[0] = i383 ^ (i383 << 5);
                    } else {
                        objArr3 = new Object[]{null, null, new int[]{i}, new int[]{i}, new int[1]};
                        int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
                        int i384 = (((~((~startElapsedRealtime2) | 758903326)) | 134251008) * 449) + (((~(758903326 | startElapsedRealtime2)) | 134251008) * 449) + 1771213912;
                        int values10 = _isFoundMatchingTemplates_PngjBadCrcException_values();
                        int i385 = (-1) - (~(i384 * (-932)));
                        int i386 = ~i384;
                        int i387 = ~values10;
                        int i388 = ~(i387 | ((-1) ^ i387));
                        int i389 = ((i388 & i386) | (i386 ^ i388)) * (-933);
                        int i390 = (i385 & i389) + (i389 | i385);
                        int i391 = ~values10;
                        int i392 = ~((i391 & i386) | (i386 ^ i391));
                        int i393 = ~(~i384);
                        int i394 = ((i392 & i393) | (i392 ^ i393)) * 933;
                        int i395 = ((i390 | i394) << 1) - (i394 ^ i390);
                        int i396 = (~i384) * 933;
                        int i397 = (i395 & i396) + (i396 | i395);
                        int i398 = (i3 ^ i397) + ((i397 & i3) << 1);
                        int i399 = i398 << 13;
                        int i400 = ((~i398) & i399) | ((~i399) & i398);
                        int i401 = i400 >>> 17;
                        int i402 = ((~i400) & i401) | ((~i401) & i400);
                        int i403 = i402 << 5;
                        c4 = 0;
                        ((int[]) objArr3[4])[0] = (i402 | i403) & (~(i402 & i403));
                    }
                    if (((int[]) objArr3[2])[c4] != i) {
                        return objArr3;
                    }
                    int i404 = -MotionEvent.axisFromString(BuildConfig.FLAVOR);
                    int i405 = (i404 & 35) + (i404 | 35);
                    int lastIndexOf3 = TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0);
                    int values11 = _isFoundMatchingTemplates_PngjBadCrcException_values();
                    int i406 = lastIndexOf3 * 934;
                    int i407 = ((i406 | (-31688)) << 1) - (i406 ^ (-31688));
                    int i408 = ~lastIndexOf3;
                    int i409 = ~values11;
                    int i410 = ~((i408 & i409) | (i408 ^ i409));
                    int i411 = -(-(((i410 & (-35)) | ((-35) ^ i410)) * (-933)));
                    int i412 = ((i407 | i411) << 1) - (i411 ^ i407);
                    int i413 = ~((i409 & (-35)) | ((-35) ^ i409));
                    int i414 = ~(((-35) & lastIndexOf3) | ((-35) ^ lastIndexOf3));
                    int i415 = ((i413 & i414) | (i413 ^ i414)) * 933;
                    byte b19 = (byte) ((((i412 ^ i415) + ((i415 & i412) << 1)) - (~(-(-((~(lastIndexOf3 | 34)) * 933))))) - 1);
                    Object[] objArr68 = new Object[1];
                    b("/\u0007\"\u0007#\u0000\u0007!\u0007\"+#\u001c\r.\u0001\r\u001f$/\u001e\u0000\r(\u001e\r\u0007/\u0012)\u0002$\u0007!\u0007\"", i405, b19, objArr68);
                    Object[] objArr69 = {(String) objArr68[0]};
                    Object PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1142218481);
                    if (PngjBadSignature15 == null) {
                        char lastIndexOf4 = (char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0));
                        int pressedStateDuration3 = (ViewConfiguration.getPressedStateDuration() >> 16) + 28;
                        int doubleTapTimeout = 1447 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        byte[] bArr10 = $$a;
                        byte b20 = (byte) (bArr10[16] + 1);
                        byte b21 = (byte) (-bArr10[13]);
                        Object[] objArr70 = new Object[1];
                        c(b20, b21, (byte) (b21 | 13), objArr70);
                        PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(lastIndexOf4, pressedStateDuration3, doubleTapTimeout, 1191464116, false, (String) objArr70[0], new Class[]{String.class});
                    }
                    long longValue10 = ((Long) ((Method) PngjBadSignature15).invoke(null, objArr69)).longValue();
                    long j71 = -34591638;
                    long j72 = j71 ^ j57;
                    long maxMemory2 = (int) Runtime.getRuntime().maxMemory();
                    long j73 = ((302 * (((longValue10 | maxMemory2) ^ j57) | ((j71 | (longValue10 ^ j57)) ^ j57))) + (((-604) * (((j72 | longValue10) | maxMemory2) ^ j57)) + (((-302) * ((((j72 | (maxMemory2 ^ j57)) | longValue10) ^ j57) | (((j71 | longValue10) | maxMemory2) ^ j57))) + (((-301) * longValue10) + (303 * j71))))) - 1921406239;
                    int a3 = defpackage.a.a();
                    int i416 = ((int) (j73 >> 32)) & (((~(a3 | (-1481790892))) * 566) + (((~(128786500 | a3)) | (-1610577392)) * (-566)) + 383489290);
                    int i417 = ((int) j73) & ((((~(1930758366 | i)) | (~(i4 | 493531956))) * 333) + ((((~(1930758366 | i4)) | (~(493531956 | i))) * 333) - 1602400167));
                    if (((i416 & i417) | (i416 ^ i417)) != 0) {
                        objArr4 = new Object[]{null, null, new int[]{(i & (-81)) | (i4 & 80)}, new int[]{i}, new int[1]};
                        int i418 = ~(defpackage.a.b(1094515168) | 9485918);
                        int i419 = ((i418 | 606470529) * 658) + ((607555525 | i418) * (-658)) + 1338284737;
                        int i420 = (i3 - (~((i419 ^ 16) + ((i419 & 16) << 1)))) - 1;
                        int i421 = i420 << 13;
                        int i422 = (i420 | i421) & (~(i420 & i421));
                        int i423 = i422 >>> 17;
                        int i424 = ((~i422) & i423) | ((~i423) & i422);
                        int i425 = i424 << 5;
                        ((int[]) objArr4[4])[0] = ((~i424) & i425) | ((~i425) & i424);
                        i5 = 0;
                    } else {
                        objArr4 = new Object[]{null, null, new int[]{i}, new int[]{i}, new int[1]};
                        int myUid2 = Process.myUid();
                        int i426 = -(-((((~myUid2) | 448131061) * 756) + (((~(448131061 | myUid2)) | 176226308) * (-756)) + 1222794309));
                        int i427 = ((i3 | i426) << 1) - (i426 ^ i3);
                        int i428 = i427 << 13;
                        int i429 = (i428 | i427) & (~(i427 & i428));
                        int i430 = i429 ^ (i429 >>> 17);
                        int i431 = i430 << 5;
                        i5 = 0;
                        ((int[]) objArr4[4])[0] = ((~i430) & i431) | ((~i431) & i430);
                    }
                    if (((int[]) objArr4[2])[i5] != i) {
                        return objArr4;
                    }
                    int i432 = -(TypedValue.complexToFraction(i5, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i5, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i433 = (i432 & 42) + (i432 | 42);
                    int i434 = -KeyEvent.keyCodeFromString(BuildConfig.FLAVOR);
                    Object[] objArr71 = new Object[1];
                    b("/\u0007\"\u0007#\u0000\u0007!\u0007\"+#\u001c\r\u0001+0 \u0001\u001e*\u001d\u0005\t0)\n\r/\b\u0015#/,\u0003$\u001d#\u001c+\u000e\r", i433, (byte) ((i434 & 17) + (i434 | 17)), objArr71);
                    Object[] objArr72 = {(String) objArr71[0]};
                    Object PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1142218481);
                    if (PngjBadSignature16 == null) {
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int alpha2 = Color.alpha(0) + 28;
                        int combineMeasuredStates = 1447 - View.combineMeasuredStates(0, 0);
                        byte[] bArr11 = $$a;
                        byte b22 = (byte) (bArr11[16] + 1);
                        byte b23 = (byte) (-bArr11[13]);
                        Object[] objArr73 = new Object[1];
                        c(b22, b23, (byte) (b23 | 13), objArr73);
                        PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature(jumpTapTimeout, alpha2, combineMeasuredStates, 1191464116, false, (String) objArr73[0], new Class[]{String.class});
                    }
                    long longValue11 = ((Long) ((Method) PngjBadSignature16).invoke(null, objArr72)).longValue();
                    long j74 = -1312677373;
                    long j75 = 530;
                    long j76 = 529;
                    long startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                    long j77 = ((j76 * ((longValue11 ^ j57) | ((j74 | startUptimeMillis2) ^ j57))) + ((((((startUptimeMillis2 ^ j57) | j74) ^ j57) | ((j74 | longValue11) ^ j57)) * j76) + ((j75 * longValue11) + ((j75 * j74) + 1058)))) - 643320504;
                    int elapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                    int i435 = ((int) (j77 >> 32)) & (((elapsedRealtime2 | 2054632092) * 104) + ((~((~elapsedRealtime2) | (-76074082))) * (-104)) + ((((~(617405681 | elapsedRealtime2)) | 1513300492) * 104) - 2005432166));
                    int startElapsedRealtime3 = (int) Process.getStartElapsedRealtime();
                    int c13 = ((int) j77) & defpackage.a.c((~(startElapsedRealtime3 | (-2088097748))) | (~(650871337 | startElapsedRealtime3)), -1324, (((~startElapsedRealtime3) | 42598440) * 1324) + 818885255, 1473095918);
                    if (((i435 & c13) | (i435 ^ c13)) == 0) {
                        Object[] objArr74 = {null, null, new int[]{i}, new int[]{i}, new int[]{(0 | 0) & (~(0 & 0))}};
                        int i436 = (i3 - (~((((~((-583390102) | i4)) | (~(i4 | 40967268))) * 865) + (((~(i | 40967268)) * 865) + ((((~((-40967269) | i4)) | (-583390102)) * (-865)) - 419957912))))) - 1;
                        int i437 = i436 << 13;
                        int i438 = ((~i436) & i437) | ((~i437) & i436);
                        int i439 = i438 >>> 17;
                        int i440 = (i438 | i439) & (~(i438 & i439));
                        int i441 = i440 << 5;
                        return objArr74;
                    }
                    Object[] objArr75 = {null, null, new int[]{i ^ 90}, new int[]{i}, new int[1]};
                    int i442 = (((~((~((int) Runtime.getRuntime().freeMemory())) | 406371180)) | (-217986190)) * 783) + (((~((-80086146) | 0)) * (-783)) - 491147701);
                    int i443 = -(-((i442 ^ 16) + ((i442 & 16) << 1)));
                    int i444 = (i3 & i443) + (i443 | i3);
                    int i445 = i444 << 13;
                    int i446 = (i445 & (~i444)) | ((~i445) & i444);
                    int i447 = i446 >>> 17;
                    int i448 = (i446 | i447) & (~(i446 & i447));
                    int i449 = i448 << 5;
                    ((int[]) objArr75[4])[0] = (i448 | i449) & (~(i448 & i449));
                    return objArr75;
                } catch (Throwable th8) {
                    Throwable cause7 = th8.getCause();
                    if (cause7 != null) {
                        throw new RuntimeException(cause7);
                    }
                    throw new RuntimeException(th8);
                }
                try {
                    Class<?> cls10 = Class.forName(str);
                    int i450 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    Object[] objArr76 = new Object[1];
                    a(null, null, (i450 ^ 126) + ((i450 & 126) << 1), "\u008b\u0091\u008a\u009d", objArr76);
                    String str18 = (String) objArr76[0];
                    Class cls11 = Long.TYPE;
                    cls10.getMethod(str18, cls11).invoke(newInstance, 100L);
                    try {
                        Class<?> cls12 = Class.forName(str);
                        Object[] objArr77 = new Object[1];
                        a(null, null, 126 - (~(-(ViewConfiguration.getKeyRepeatDelay() >> 16))), "\u008b\u0091\u008a\u009d", objArr77);
                        cls12.getMethod((String) objArr77[0], cls11).invoke(newInstance2, 10L);
                        StringBuilder sb2 = new StringBuilder();
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-772232296);
                        if (PngjBadSignature2 == null) {
                            char rgb = (char) (Color.rgb(0, 0, 0) + 16814642);
                            int i451 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 25;
                            int indexOf5 = 1017 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                            byte[] bArr12 = $$a;
                            Object[] objArr78 = new Object[1];
                            c((byte) (bArr12[18] - 1), (byte) (-bArr12[9]), (byte) i31, objArr78);
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(rgb, i451, indexOf5, 756532771, false, (String) objArr78[0], null);
                        }
                        sb2.append(((Field) PngjBadSignature2).get(newInstance).toString());
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-772232296);
                        if (PngjBadSignature3 == null) {
                            char longPressTimeout2 = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 37426);
                            int windowTouchSlop2 = 26 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int indexOf6 = TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 1017;
                            byte[] bArr13 = $$a;
                            Object[] objArr79 = new Object[1];
                            c((byte) (bArr13[18] - 1), (byte) (-bArr13[9]), (byte) 32, objArr79);
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(longPressTimeout2, windowTouchSlop2, indexOf6, 756532771, false, (String) objArr79[0], null);
                        }
                        sb2.append(((Field) PngjBadSignature3).get(newInstance2).toString());
                        String obj3 = sb2.toString();
                        try {
                            int lastIndexOf5 = TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0);
                            Object[] objArr80 = new Object[1];
                            a(null, null, ((lastIndexOf5 | 128) << 1) - (lastIndexOf5 ^ 128), "\u009c", objArr80);
                            String[] split2 = obj3.split((String) objArr80[0]);
                            length2 = split2.length;
                            i10 = 0;
                            while (i10 < length2) {
                                String str19 = split2[i10];
                                int i452 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                int i453 = ((i452 | 19) << 1) - (i452 ^ 19);
                                int i454 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                Object[] objArr81 = new Object[1];
                                b("#\u001f)+ \u0000\u001e+)\u001d\b*\u0006  \u0006+ 㘤", i453, (byte) ((i454 & 112) + (i454 | 112)), objArr81);
                                if (str19.startsWith((String) objArr81[0])) {
                                    strArr2 = split2;
                                } else {
                                    int indexOf7 = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0);
                                    int i455 = (indexOf7 * (-500)) - 10500;
                                    int i456 = ~(((-22) ^ indexOf7) | ((-22) & indexOf7));
                                    int i457 = ~indexOf7;
                                    strArr2 = split2;
                                    int i458 = ~(i457 | 21 | i);
                                    int i459 = ((i456 ^ i458) | (i458 & i456)) * 501;
                                    int i460 = (i455 & i459) + (i459 | i455);
                                    int i461 = (~((i457 ^ (-22)) | (i457 & (-22)))) * 1002;
                                    int i462 = (i460 ^ i461) + ((i461 & i460) << 1);
                                    int i463 = ~indexOf7;
                                    int i464 = (i463 & i4) | (i463 ^ i4);
                                    int i465 = (~((i464 & 21) | (i464 ^ 21))) * 501;
                                    int i466 = ((i462 | i465) << 1) - (i465 ^ i462);
                                    int i467 = -TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0);
                                    Object[] objArr82 = new Object[1];
                                    b("#\u001f)+ \u0000\u001e+)\u001d\b*\u001e\u0000\r(\u001e\r\b/", i466, (byte) ((i467 ^ 87) + ((i467 & 87) << 1)), objArr82);
                                    if (str19.startsWith((String) objArr82[0])) {
                                        continue;
                                    } else {
                                        Object[] objArr83 = new Object[1];
                                        a(null, null, 126 - (~(-(Process.myTid() >> 22))), "\u009f\u0085\u0095\u008d\u009b\u008e\u008d\u0088", objArr83);
                                        if (str19.startsWith((String) objArr83[0])) {
                                            int keyCodeFromString3 = KeyEvent.keyCodeFromString(BuildConfig.FLAVOR);
                                            Object[] objArr84 = new Object[1];
                                            a(null, null, ((keyCodeFromString3 | 127) << 1) - (keyCodeFromString3 ^ 127), "\u009f", objArr84);
                                            String[] split3 = str19.split((String) objArr84[0]);
                                            if (split3.length > 1 && split3[1].equalsIgnoreCase(str2)) {
                                                objArr = new Object[]{null, null, new int[1], new int[1], new int[1]};
                                                int i2582 = (~(i & 20)) & (i | 20);
                                                String str162 = (String) defpackage.a.h(str6, str7, invoke);
                                                ((int[]) objArr[3])[0] = i;
                                                ((int[]) objArr[2])[0] = i2582;
                                                int i2592 = (((~((-1022632792) | i)) | 347349845 | (~((-398275422) | i))) * 407) + (((~(1022632791 | i)) | (~(398275421 | i4)) | 347349845) * 407) + ((((-1073558368) | 0) * (-814)) - 1759385883);
                                                int i2602 = (i3 - (~(-(-(((i2592 | 16) << 1) - (i2592 ^ 16)))))) - 1;
                                                int i2612 = i2602 << 13;
                                                int i2622 = ((~i2602) & i2612) | ((~i2612) & i2602);
                                                int i2632 = i2622 ^ (i2622 >>> 17);
                                                int i2642 = i2632 << 5;
                                                ((int[]) objArr[4])[0] = (i2632 | i2642) & (~(i2632 & i2642));
                                                c2 = 2;
                                                c = 0;
                                                if (((int[]) objArr[c2])[c] == i) {
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                                i10++;
                                split2 = strArr2;
                            }
                        } catch (IOException unused7) {
                        }
                        i7 = (i9 & 1) + (i9 | 1);
                        split = strArr;
                        length = i8;
                        i6 = 0;
                        f = 0.0f;
                        i31 = 32;
                    } catch (Throwable th9) {
                        Throwable cause8 = th9.getCause();
                        if (cause8 != null) {
                            throw new RuntimeException(cause8);
                        }
                        throw new RuntimeException(th9);
                    }
                } catch (Throwable th10) {
                    Throwable cause9 = th10.getCause();
                    if (cause9 != null) {
                        throw new RuntimeException(cause9);
                    }
                    throw new RuntimeException(th10);
                }
                StringBuilder sb22 = new StringBuilder();
                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-772232296);
                if (PngjBadSignature2 == null) {
                }
                sb22.append(((Field) PngjBadSignature2).get(newInstance).toString());
                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-772232296);
                if (PngjBadSignature3 == null) {
                }
                sb22.append(((Field) PngjBadSignature3).get(newInstance2).toString());
                String obj32 = sb22.toString();
                int lastIndexOf52 = TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0);
                Object[] objArr802 = new Object[1];
                a(null, null, ((lastIndexOf52 | 128) << 1) - (lastIndexOf52 ^ 128), "\u009c", objArr802);
                String[] split22 = obj32.split((String) objArr802[0]);
                length2 = split22.length;
                i10 = 0;
                while (i10 < length2) {
                }
                i7 = (i9 & 1) + (i9 | 1);
                split = strArr;
                length = i8;
                i6 = 0;
                f = 0.0f;
                i31 = 32;
                i7 = (i9 & 1) + (i9 | 1);
                split = strArr;
                length = i8;
                i6 = 0;
                f = 0.0f;
                i31 = 32;
            } catch (Throwable th11) {
                Throwable cause10 = th11.getCause();
                if (cause10 != null) {
                    throw new RuntimeException(cause10);
                }
                throw new RuntimeException(th11);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            PngjInputException = (PngjOutputException + 77) % 128;
            org.camera.preview.PngjBadCrcException pngjBadCrcException = FingerActivity.this.Action;
            if (pngjBadCrcException != null) {
                /* valueOf is a static inner class, not a method - decompiler artifact */
            }
            PngjInputException = (PngjOutputException + 43) % 128;
        }
    }

    public class PngjBadSignature implements View.OnClickListener {
        public PngjBadSignature() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FingerActivity fingerActivity = FingerActivity.this;
            fingerActivity.getPadSub3 = true;
            FingerActivity.PngjBadSignature(fingerActivity);
            FingerActivity.this.Attempt = null;
        }
    }

    public class PngjException implements com.identy.d.PngjException {
        public PngjException() {
        }

        @Override // com.identy.d.PngjException
        public final void PngjBadCrcException() {
            FingerActivity.this.isQualityFailed();
            FingerActivity.PngjBadSignature = false;
        }
    }

    public class PngjExceptionInternal implements getPadSub3B15685$PngjException {
        public PngjExceptionInternal() {
        }

        @Override // com.d.e.a.c.getPadSub3B15685$PngjException
        public final void PngjBadCrcException(int i, int i2) {
            FingerActivity.this.PngjBadCrcException(i, i2);
        }
    }

    public class PngjInputException implements View.OnClickListener {
        public PngjInputException() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FingerActivity fingerActivity = FingerActivity.this;
            fingerActivity.getPadSub3 = true;
            fingerActivity.getData = true;
            FingerActivity.PngjBadCrcException(fingerActivity);
        }
    }

    public class PngjOutputException implements Runnable {
        private /* synthetic */ WindowManager.LayoutParams PngjBadSignature;

        public PngjOutputException(WindowManager.LayoutParams layoutParams) {
            this.PngjBadSignature = layoutParams;
        }

        @Override // java.lang.Runnable
        public final void run() {
            FingerActivity.this.getWindow().setAttributes(this.PngjBadSignature);
        }
    }

    public class PngjPrematureEnding implements View.OnClickListener {
        public PngjPrematureEnding() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FingerActivity fingerActivity = FingerActivity.this;
            fingerActivity.PngjExceptionInternal = fingerActivity.PngjExceptionInternal.changeHand();
            FingerActivity.this.getPadSub2();
            FingerActivity.this.onErrorResponse.e1();
            FingerActivity.this.getFingerPrintQualityScore();
        }
    }

    public class PngjUnsupportedException implements Runnable {
        private static  byte[] $$a = null;
        private static  int $$b = 0;
        private static  byte[] $$c = null;
        private static  int $$d = 0;
        private static int $10;
        private static int $11;
        private static boolean PngjBadCrcException;
        private static char[] PngjBadSignature;
        private static boolean PngjException;
        private static long PngjInputException;
        private static int PngjOutputException;
        private static int PngjPrematureEnding;
        private static int values;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
        /* JADX WARN: Type inference failed for: r8v2, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$e(byte b, byte b2, byte b3) {
            int i;
            int i2;
            int i0 = (b3 * 2) + 97;
            int i3 = b * 2;
            byte[] bArr = $$c;
            int i4 = b2 + 4;
            byte[] bArr2 = new byte[i3 + 1];
            if (bArr == null) {
                byte b4 = 0;
                i = 0;
                int i5 = i4;
                int i6 = i5;
                i2 = i4 + (-b4);
                i4 = i6;
                bArr2[i] = (byte) i2;
                if (i == i3) {
                    return new String(bArr2, 0);
                }
                int i7 = i4 + 1;
                i++;
                b4 = bArr[i7];
                int i8 = i2;
                i5 = i7;
                i4 = i8;
                int i62 = i5;
                i2 = i4 + (-b4);
                i4 = i62;
                bArr2[i] = (byte) i2;
                if (i == i3) {
                }
            } else {
                i = 0;
                i2 = 0;
                bArr2[i] = (byte) i2;
                if (i == i3) {
                }
            }
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            PngjPrematureEnding = 0;
            PngjOutputException = 1;
            PngjBadSignature = new char[]{25108, 25105, 25168, 25114, 25123, 25126, 25097, 25127, 25113, 25118, 25112, 25115, 25109, 25106, 25111, 25125, 25110, 25119, 25104, 25124, 25171, 25096, 25117, 25121, 25160, 25169, 25099, 25098, 25183, 25100};
            values = -2081201278;
            PngjBadCrcException = true;
            PngjException = true;
            PngjInputException = 4172351579175774125L;
        }

        public PngjUnsupportedException() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:182:0x1e72, code lost:
        
            0 = 56159 - (~(0 * (-622)));
            0 = ~0;
            0 = (0 ^ 90) | (0 & 90);
            0 = (0 - (~((~((0 & 0) | (0 ^ 0))) * 623))) - 1;
            0 = ((~((0 & (-91)) | ((-91) ^ 0))) | 0) * (-623);
            0 = (0 ^ 0) + ((0 & 0) << 1);
            0 = ~((0 ^ 90) | (0 & 90));
            0 = ~((0 & 0) | (0 ^ 0));
            0 = (0 & 0) | (0 ^ 0);
            0 = ~((0 ^ 90) | (0 & 90));
            0 = ((0 & 0) | (0 ^ 0)) * 623;
            0 = (0 | 0) + (0 & 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:211:0x1fb0, code lost:
        
            if (0 == false) goto L289;
         */
        /* JADX WARN: Code restructure failed: missing block: B:449:0x295c, code lost:
        
            if (0 == null) goto L413;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x04f3, code lost:
        
            if (((((int) (0 >> 32)) & (((0 | (-1632474423)) * 496) + ((((~((~0) | (-1091048727))) | 0) * (-496)) + ((0 * 992) + 1537498186)))) | (((int) 0) & ((((~(((int) android.os.Process.getElapsedCpuTime()) | (-134228002))) | 558891400) * 366) + ((((~((-1216538744) | 0)) | 1641202142) * (-366)) - 448486071)))) != 477111747) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x07f9, code lost:
        
            if (android.os.Build.VERSION.SDK_INT <= 33) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x07fb, code lost:
        
            0 = com.identy.FingerActivity.PngjUnsupportedException.PngjPrematureEnding;
            com.identy.FingerActivity.PngjUnsupportedException.PngjOutputException = ((0 & 29) + (0 | 29)) % 128;
            0 = new java.lang.Object[1];
            c("オ\uf484ゅ냭ꬅ셐⍩ഗ₵ꃑ㌣ᵭႾ郇̑ⶸQ聼ᎀ㶀瀏瀪推췓怽怙牯\udc28凯円䉏\uec77", android.view.Gravity.getAbsoluteGravity(0, 0), 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0817, code lost:
        
            0 = new java.lang.Object[]{(java.lang.String) $$a[0]};
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1666380462);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0822, code lost:
        
            if (0 != null) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0824, code lost:
        
            0 = (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 28;
            0 = 1446 - android.text.TextUtils.indexOf((java.lang.CharSequence) com.karumi.dexter.BuildConfig.FLAVOR, '0', 0, 0);
            0 = (byte) (com.identy.FingerActivity.PngjUnsupportedException.$$b & 3);
            0 = 0;
            0 = new java.lang.Object[1];
            a(0, 0, (byte) (0 | 10), 0);
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (android.text.AndroidCharacter.getMirror('0') - '0'), 0, 0, -1614962923, false, (java.lang.String) $$a[0], new java.lang.Class[]{0});
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0864, code lost:
        
            0 = ((java.lang.Long) ((java.lang.reflect.Method) 0).invoke(null, 0)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0871, code lost:
        
            0 = -791688681;
            0 = ((-328) * (0 | ((0 | 0) ^ 0))) + (((-163) * 0) + (165 * 0));
            0 = 164;
            0 = 0 ^ 0;
            0 = ((0 * ((((0 | 0) | 0) ^ 0) | ((((0 ^ 0) | 0) ^ 0) | ((0 | 0) ^ 0)))) + (((0 | 0) * 0) + 0)) + 1262176998;
            0 = (int) android.os.SystemClock.elapsedRealtime();
            0 = ((int) (0 >> 32)) & defpackage.a.c(~((~0) | (-1447336150)), -948, (((~((-2000985302) | 0)) | 563758890) * (-948)) + 1863230890, -873386932);
            0 = ((int) 0) & ((((-1243907114) | 0) * 465) + ((((-1340533866) | (~(96692544 | 0))) * 930) + ((((~((-1340533866) | 0)) | 96692544) * (-465)) + 1731113594)));
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x08fe, code lost:
        
            if (((0 & 0) | (0 ^ 0)) != 1) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0900, code lost:
        
            com.identy.FingerActivity.PngjUnsupportedException.PngjPrematureEnding = (com.identy.FingerActivity.PngjUnsupportedException.PngjOutputException + 87) % 128;
            0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:561:0x1394, code lost:
        
            if (((0 & 0) | (0 ^ 0)) == 477111747) goto L150;
         */
        /* JADX WARN: Code restructure failed: missing block: B:568:0x1192, code lost:
        
            if (((0 & 0) | (0 ^ 0)) != 477111747) goto L135;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0999, code lost:
        
            if (0 == false) goto L93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:575:0x090b, code lost:
        
            0 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:576:0x090e, code lost:
        
            0 = -android.widget.ExpandableListView.getPackedPositionGroup(0);
            0 = (0 & 127) + (0 | 127);
            0 = new java.lang.Object[1];
            b(null, 0, null, "\u0088\u008a\u0094\u0085\u0089\u0089\u008f\u0094\u0088\u0086\u0083\u0082\u0081", 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:577:0x0927, code lost:
        
            0 = new java.lang.Object[]{(java.lang.String) $$a[0]};
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
         */
        /* JADX WARN: Code restructure failed: missing block: B:578:0x092f, code lost:
        
            if (0 != null) goto L87;
         */
        /* JADX WARN: Code restructure failed: missing block: B:579:0x0931, code lost:
        
            0 = (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 8752);
            0 = (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 24;
            0 = 336 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            0 = (byte) 0;
            0 = (byte) (0 + 1);
            0 = new java.lang.Object[1];
            a(0, 0, (byte) (0 | 14), 0);
            0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(0, 0, 0, -598779726, false, (java.lang.String) $$a[0], new java.lang.Class[]{0});
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x099b, code lost:
        
            0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:580:0x0971, code lost:
        
            0 = ((java.lang.reflect.Method) 0).invoke(null, 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:581:0x0978, code lost:
        
            0 = -(-(android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)));
            0 = (0 ^ 126) + ((0 & 126) << 1);
            0 = new java.lang.Object[1];
            b(null, 0, null, "\u0095", 0);
            0 = 0.equals((java.lang.String) $$a[0]);
         */
        /* JADX WARN: Code restructure failed: missing block: B:588:0x05eb, code lost:
        
            if (((0 & 0) | (0 ^ 0)) != 477111747) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:595:0x06fc, code lost:
        
            if (((((int) (0 >> 32)) & ((((~(168872078 | 0)) | 49286) * 564) + (((~(1606147775 | 0)) * 1128) + (((((~((-1606098490) | 0)) | 168872078) | (~(1606098489 | 0))) * (-564)) + 1793246794)))) | (((int) 0) & ((((~((-784431973) | 0)) | 2073308913) * 217) + ((((~((-2073308914) | 0)) | 713042528) * 217) + ((((~((-2073308914) | 0)) | (~((-784431973) | 0))) * 217) - 2028175873))))) != (-1032769152)) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:603:0x07f3, code lost:
        
            if (((0 & 0) | (0 ^ 0)) == 542074309) goto L72;
         */
        /* JADX WARN: Removed duplicated region for block: B:123:0x1580  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x1600  */
        /* JADX WARN: Removed duplicated region for block: B:165:0x1a94  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x1b4e  */
        /* JADX WARN: Removed duplicated region for block: B:214:0x213f  */
        /* JADX WARN: Removed duplicated region for block: B:216:0x21ba  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object[] PngjBadSignature$1eba2e16(int i, Object obj, int i2) {
            int i3;
            int i4;
            int i5;
            char c;
            int i6;
            Class cls;
            Class cls2;
            String[] strArr;
            int i7;
            boolean z;
            long j;
            char c2;
            char c3;
            long j2;
            boolean z2;
            long j3;
            int i8;
            int i9;
            int i10;
            int i11;
            BufferedInputStream bufferedInputStream;
            BufferedInputStream bufferedInputStream2;
            int i12;
            int i13;
            Object[] objArr;
            int i14;
            long j4;
            String[] strArr2;
            int i15;
            Object[] objArr2;
            int parseInt;
            boolean z3;
            String[] strArr3;
            Object obj2;
            Object obj3;
            int i16;
            Object obj4;
            Object obj5;
            Class cls3 = Integer.TYPE;
            try {
                Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1085800324);
                if (PngjBadSignature2 == null) {
                    i3 = 989703296;
                    char indexOf = (char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 1180);
                    int indexOf2 = 44 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                    i4 = -68;
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1092;
                    i5 = 16;
                    byte b = (byte) 0;
                    c = 14;
                    byte b2 = (byte) (b + 1);
                    Object[] objArr3 = new Object[1];
                    a(b, b2, (byte) (b2 | 14), objArr3);
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf, indexOf2, maximumDrawingCacheSize, -1135046081, false, (String) objArr3[0], new Class[0]);
                } else {
                    i3 = 989703296;
                    i4 = -68;
                    i5 = 16;
                    c = 14;
                }
                long longValue = ((Long) ((Method) PngjBadSignature2).invoke(null, null)).longValue();
                long j5 = 1278106121;
                long j6 = -103;
                long j7 = j6 * j5;
                long j8 = 104;
                long j9 = -1;
                long j10 = longValue ^ j9;
                long j11 = ((j5 ^ j9) | j10) ^ j9;
                long j12 = i;
                long j13 = j12 ^ j9;
                long j14 = (j8 * (j5 | j12)) + ((-104) * (((j13 | j5) | longValue) ^ j9)) + ((j11 | ((j10 | j12) ^ j9)) * j8) + (j6 * longValue) + j7 + 646810196;
                int myPid = Process.myPid();
                int i17 = ~myPid;
                int i18 = -1;
                int i19 = ((int) (j14 >> 32)) & (((myPid | 1413846276) * 397) + ((((~(i17 | 16184407)) | ((~((-1421042004) | i17)) | 1409351936)) * (-397)) - 347026570));
                int i20 = ~i;
                if ((i19 | (((int) j14) & ((((~((-1779411158) | i20)) | 2120940542) * 494) + ((((-327682) | i20) * 494) - 1209833441)))) != 0) {
                    Object[] objArr4 = {new int[]{0}, new int[1], null, new int[]{i}};
                    int i21 = (~(i & 271)) & (i | 271);
                    int i22 = ~defpackage.a.a();
                    int i23 = -(-defpackage.a.c((~(i22 | (-28985661))) | 1050916, 933, (((~((-1005580314) | i22)) | (-28985661)) * (-933)) + 1664310470, 1410900250));
                    int i24 = (i2 ^ i23) + ((i23 & i2) << 1);
                    int i25 = i24 << 13;
                    int i26 = (i25 & (~i24)) | ((~i25) & i24);
                    int i27 = i26 >>> 17;
                    int i28 = (i26 | i27) & (~(i26 & i27));
                    int i29 = i28 << 5;
                    ((int[]) objArr4[1])[0] = ((~i28) & i29) | ((~i29) & i28);
                    return objArr4;
                }
                Object[] objArr5 = new Object[1];
                b(null, TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 128, null, "\u0088\u0081\u0085\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr5);
                Object[] objArr6 = {(String) objArr5[0]};
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                if (PngjBadSignature3 == null) {
                    char c4 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8751);
                    int i30 = 25 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int i31 = 337 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 1);
                    i6 = 0;
                    Object[] objArr7 = new Object[1];
                    a(b3, b4, (byte) (b4 | 14), objArr7);
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c4, i30, i31, -598779726, false, (String) objArr7[0], new Class[]{String.class});
                } else {
                    i6 = 0;
                }
                Object invoke = ((Method) PngjBadSignature3).invoke(null, objArr6);
                if (invoke != null) {
                    Object[] objArr8 = new Object[1];
                    c("İ\u0ba0ł俍溄卑\ue6f2鼖ᅨ忩", ViewConfiguration.getLongPressTimeout() >> 16, objArr8);
                    String str = (String) objArr8[i6];
                    int i32 = -ImageFormat.getBitsPerPixel(i6);
                    int i33 = ((i32 | 126) << 1) - (i32 ^ 126);
                    Object[] objArr9 = new Object[1];
                    b(null, i33, null, "\u0084\u008d\u008c\u008b\u0086\u008a\u0082\u0089", objArr9);
                    String[] strArr4 = {str, (String) objArr9[i6]};
                    Object[] objArr10 = new Object[2];
                    objArr10[1] = strArr4;
                    objArr10[i6] = invoke;
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-344601997);
                    if (PngjBadSignature4 == null) {
                        char indexOf3 = (char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 26717);
                        int size = 33 - View.MeasureSpec.getSize(i6);
                        int i34 = i6;
                        int rgb = (-16775548) - Color.rgb(i34, i34, i34);
                        byte b5 = (byte) i34;
                        byte b6 = (byte) (b5 + 1);
                        Object[] objArr11 = new Object[1];
                        a(b5, b6, (byte) (b6 | 14), objArr11);
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf3, size, rgb, 396011464, false, (String) objArr11[i34], new Class[]{String.class, String[].class});
                    }
                    long longValue2 = ((Long) ((Method) PngjBadSignature4).invoke(null, objArr10)).longValue();
                    long j15 = 94338306;
                    long j16 = (-317) * longValue2;
                    long j17 = longValue2 ^ j9;
                    long a = defpackage.a.a();
                    long j18 = ((-318) * (j17 | (((j15 ^ j9) | a) ^ j9))) + j16 + (319 * j15);
                    long j19 = 318;
                    long j20 = a ^ j9;
                    long j21 = ((j19 * (((a | (j15 | longValue2)) ^ j9) | (((j17 | j20) | j15) ^ j9))) + (((((j17 | a) ^ j9) | (((j20 | j15) | longValue2) ^ j9)) * j19) + j18)) - 1780930527;
                    int i35 = ((int) (j21 >> 32)) & ((((~((-2129199199) | i20)) | 691972787) * 68) + ((~(2147461887 | i20)) * (-68)) + (((((~((-1455489101) | i20)) | 18262689) | (~(2129199198 | i))) * (-68)) - 1423907614));
                    int maxMemory = (int) Runtime.getRuntime().maxMemory();
                    if ((i35 | (((int) j21) & defpackage.a.c((~(maxMemory | (-718827002))) | (~((-718399409) | maxMemory)), -1324, (((~maxMemory) | (-718925818)) * 1324) + 818885255, 413898950))) != 0) {
                        int i36 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int i37 = ((i36 | 127) << 1) - (i36 ^ 127);
                        Object[] objArr12 = new Object[1];
                        b(null, i37, null, "\u0081\u0088\u0081\u008f\u0091\u0090\u0085\u008b\u008f\u0093\u0085\u0092\u0083\u0091\u0090\u008f\u0086\u0082\u0081\u008e\u0083\u0082\u0081", objArr12);
                        Object[] objArr13 = {(String) objArr12[0]};
                        Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                        if (PngjBadSignature5 == null) {
                            char c5 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8752);
                            int jumpTapTimeout = 24 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int myPid2 = 336 - (Process.myPid() >> 22);
                            byte b7 = (byte) 0;
                            byte b8 = (byte) (b7 + 1);
                            Object[] objArr14 = new Object[1];
                            a(b7, b8, (byte) (b8 | 14), objArr14);
                            PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c5, jumpTapTimeout, myPid2, -598779726, false, (String) objArr14[0], new Class[]{String.class});
                        }
                        Object invoke2 = ((Method) PngjBadSignature5).invoke(null, objArr13);
                        Object[] objArr15 = new Object[1];
                        c("ߧᰢޕ塁誨℁ʞ\ued55ឥ䡱ኄﴠ⟤砺⋾췶㜎棍㉴\uddd0䝊飀䈝ⶄ坹被叆㱴暤륺揥ష盒ꤌ", KeyEvent.getMaxKeyCode() >> 16, objArr15);
                        Object[] objArr16 = {(String) objArr15[0]};
                        Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                        if (PngjBadSignature6 == null) {
                            char alpha = (char) (Color.alpha(0) + 8752);
                            int myTid = (Process.myTid() >> 22) + 24;
                            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 336;
                            byte b9 = (byte) 0;
                            byte b10 = (byte) (b9 + 1);
                            Object[] objArr17 = new Object[1];
                            a(b9, b10, (byte) (b10 | 14), objArr17);
                            PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(alpha, myTid, scrollDefaultDelay, -598779726, false, (String) objArr17[0], new Class[]{String.class});
                        }
                        Object invoke3 = ((Method) PngjBadSignature6).invoke(null, objArr16);
                        if (invoke2 != null) {
                            PngjPrematureEnding = (PngjOutputException + 65) % 128;
                            Object[] objArr18 = {invoke2, 42};
                            Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                            if (PngjBadSignature7 == null) {
                                char resolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 11039);
                                int i38 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 30;
                                int resolveSize = View.resolveSize(0, 0) + 1282;
                                byte b11 = (byte) ($$b & 3);
                                byte b12 = b11;
                                Object[] objArr19 = new Object[1];
                                a(b11, b12, (byte) (b12 | 10), objArr19);
                                cls2 = cls3;
                                cls = String.class;
                                PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(resolveOpacity, i38, resolveSize, -971849413, false, (String) objArr19[0], new Class[]{cls, cls2});
                            } else {
                                cls2 = cls3;
                                cls = String.class;
                            }
                            long longValue3 = ((Long) ((Method) PngjBadSignature7).invoke(null, objArr18)).longValue();
                            long j22 = 346830228;
                            obj4 = invoke3;
                            long j23 = 672;
                            long j24 = longValue3 ^ j9;
                            long j25 = (j23 * (((j24 | j13) ^ j9) | ((j24 | j22) ^ j9))) + ((-672) * ((((j22 ^ j9) | j13) ^ j9) | ((longValue3 | j12) ^ j9))) + ((longValue3 | ((j22 | j12) ^ j9)) * j23) + ((-1343) * longValue3) + (673 * j22) + 308877472;
                            int i39 = (int) Runtime.getRuntime().totalMemory();
                            int i40 = (~(1225266462 | i39)) | (-1766692159);
                            obj5 = invoke2;
                        } else {
                            obj4 = invoke3;
                            cls2 = cls3;
                            cls = String.class;
                            obj5 = invoke2;
                        }
                        if (obj4 != null) {
                            Object[] objArr20 = {obj4, 42};
                            Object PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                            if (PngjBadSignature8 == null) {
                                char trimmedLength = (char) (TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 11039);
                                int i41 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 30;
                                int argb = Color.argb(0, 0, 0, 0) + 1282;
                                byte b13 = (byte) ($$b & 3);
                                byte b14 = b13;
                                Object[] objArr21 = new Object[1];
                                a(b13, b14, (byte) (b14 | 10), objArr21);
                                PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(trimmedLength, i41, argb, -971849413, false, (String) objArr21[0], new Class[]{cls, cls2});
                            }
                            long longValue4 = ((Long) ((Method) PngjBadSignature8).invoke(null, objArr20)).longValue();
                            long j26 = 27546217;
                            long j27 = -712;
                            long j28 = longValue4 ^ j9;
                            long j29 = (j13 | j26) ^ j9;
                            long j30 = (712 * (j28 | j29)) + (j27 * ((((j28 | j13) | j26) ^ j9) | (((j26 | longValue4) | j12) ^ j9))) + ((((j28 | j26) ^ j9) | j29) * j27) + (713 * longValue4) + ((-711) * j26) + 628161483;
                            int i42 = ((int) (j30 >> 32)) & ((((~(989937796 | i)) | (-447288615)) * 529) + (((~(i20 | 989937796)) | (-1000953255)) * 529) + 1520786966);
                            int i43 = ((int) j30) & ((((~((-273629013) | i20)) | 1706066090) * 564) + ((~((-4789333) | i)) * 1128) + (((~(1710855422 | i20)) | (-273629013) | (~((-1710855423) | i))) * (-564)) + 300016505);
                        }
                        if (obj5 != null) {
                            Object[] objArr22 = {obj5, 42};
                            Object PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                            if (PngjBadSignature9 == null) {
                                char blue = (char) (11039 - Color.blue(0));
                                int i44 = 31 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                int argb2 = Color.argb(0, 0, 0, 0) + 1282;
                                byte b15 = (byte) ($$b & 3);
                                byte b16 = b15;
                                Object[] objArr23 = new Object[1];
                                a(b15, b16, (byte) (b16 | 10), objArr23);
                                PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(blue, i44, argb2, -971849413, false, (String) objArr23[0], new Class[]{cls, cls2});
                            }
                            long longValue5 = ((Long) ((Method) PngjBadSignature9).invoke(null, objArr22)).longValue();
                            long j31 = -425321199;
                            long j32 = 46;
                            long j33 = (j32 * longValue5) + (j32 * j31);
                            long j34 = longValue5 ^ j9;
                            long b17 = defpackage.a.b(512168670);
                            long j35 = b17 ^ j9;
                            long j36 = (45 * (j34 | (((j31 ^ j9) | b17) ^ j9) | ((j35 | j31) ^ j9))) + ((-45) * (((j34 | b17) ^ j9) | ((j31 | longValue5) ^ j9))) + ((-90) * (j31 | ((j34 | j35) ^ j9))) + j33 + 1081028899;
                        }
                        if (obj4 != null) {
                            Object[] objArr24 = {obj4, 42};
                            Object PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                            if (PngjBadSignature10 == null) {
                                char scrollBarSize = (char) (11039 - (ViewConfiguration.getScrollBarSize() >> 8));
                                int argb3 = Color.argb(0, 0, 0, 0) + 31;
                                int lastIndexOf = TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 1283;
                                byte b18 = (byte) ($$b & 3);
                                byte b19 = b18;
                                Object[] objArr25 = new Object[1];
                                a(b18, b19, (byte) (b19 | 10), objArr25);
                                PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(scrollBarSize, argb3, lastIndexOf, -971849413, false, (String) objArr25[0], new Class[]{cls, cls2});
                            }
                            long longValue6 = ((Long) ((Method) PngjBadSignature10).invoke(null, objArr24)).longValue();
                            long j37 = -1014661588;
                            long j38 = j37 ^ j9;
                            long j39 = ((-381) * (longValue6 | j12 | j38)) + (382 * longValue6) + ((-380) * j37);
                            long j40 = 381;
                            long j41 = (j40 * ((j38 | longValue6) ^ j9)) + ((((j38 | (longValue6 ^ j9)) ^ j9) | ((j13 | longValue6) ^ j9) | ((j37 | longValue6) ^ j9)) * j40) + j39 + 1670369288;
                            int i45 = ((int) (j41 >> 32)) & ((((~((-581943563) | i)) | (~(i20 | 855282848))) * 959) + 1576597587 + (((~((-581943563) | i20)) | (~(855282848 | i))) * 959));
                            int i46 = ((int) j41) & ((((~(i20 | (-1589527541))) | (~(152301130 | i))) * 950) + (((~(i20 | 152301130)) | (~((-1589527541) | i))) * (-950)) + ((((~(1589527540 | i20)) | (~((-152301131) | i))) * 1900) - 1871736089));
                        }
                    } else {
                        cls2 = cls3;
                        cls = String.class;
                    }
                } else {
                    cls = String.class;
                    cls2 = cls3;
                }
                boolean z4 = false;
                if (z4) {
                    Object[] objArr26 = {new int[]{(i & (-261)) | (i20 & 260)}, new int[1], null, new int[]{i}};
                    int i47 = (((~((~defpackage.a.a()) | (-73985))) | 574625809) * 241) + ((((~((-230007075) | 0)) | 229933090) * (-241)) - 432000682);
                    int i48 = (i47 ^ 16) + ((i47 & 16) << 1);
                    int PngjBadCrcException2 = 0; /* dead code - decompiler artifact: IdentySdk.valueOf.PngjBadCrcException() */
                    int i49 = ((i48 * (-519)) - (~(-(-(521 * i2))))) - 1;
                    int i50 = ~i48;
                    int i51 = ~i2;
                    int i52 = (i50 & i51) | (i50 ^ i51);
                    int i53 = ~PngjBadCrcException2;
                    int i54 = ~((i52 & i53) | (i52 ^ i53));
                    int i55 = ~((i2 ^ PngjBadCrcException2) | (i2 & PngjBadCrcException2));
                    int i56 = -(-(((i54 & i55) | (i54 ^ i55)) * 520));
                    int i57 = ((i49 | i56) << 1) - (i49 ^ i56);
                    int i58 = ~i2;
                    int i59 = ~PngjBadCrcException2;
                    int i60 = ((~((i59 & i58) | (i58 ^ i59))) | (~(i48 | PngjBadCrcException2))) * (-1040);
                    int i61 = (i57 & i60) + (i60 | i57);
                    int i62 = ~i48;
                    int i63 = ~((i62 & i53) | (i62 ^ i53));
                    int i64 = ~((i58 & i48) | (i58 ^ i48));
                    int i65 = (i64 & i63) | (i63 ^ i64);
                    int i66 = ~((PngjBadCrcException2 & i48) | (i48 ^ PngjBadCrcException2));
                    int i67 = (((i66 & i65) | (i65 ^ i66)) * 520) + i61;
                    int i68 = i67 << 13;
                    int i69 = ((~i67) & i68) | ((~i68) & i67);
                    int i70 = i69 >>> 17;
                    int i71 = ((~i69) & i70) | ((~i70) & i69);
                    ((int[]) objArr26[1])[0] = i71 ^ (i71 << 5);
                    return objArr26;
                }
                Object[] objArr27 = new Object[1];
                c("篼퇫箝閃瀰ᆔ\uf84a\uddef殧薲\ue801춳", TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), objArr27);
                String str2 = (String) objArr27[0];
                int i72 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int i73 = i72 * 530;
                int i74 = (i73 & 1058) + (i73 | 1058);
                int i75 = ((i74 | 67310) << 1) - (67310 ^ i74);
                int i76 = ~i;
                int i77 = -(-(((~((i76 ^ i72) | (i76 & i72))) | (~((i72 ^ 127) | (i72 & 127)))) * 529));
                int i78 = (i75 ^ i77) + ((i77 & i75) << 1);
                int i79 = ~((i72 & i) | (i72 ^ i));
                int i80 = -(-((((-128) & i79) | ((-128) ^ i79)) * 529));
                int i81 = ((i78 | i80) << 1) - (i80 ^ i78);
                Object[] objArr28 = new Object[1];
                b(null, i81, null, "\u0089\u0093\u008c\u008e\u0081\u0085", objArr28);
                String str3 = (String) objArr28[0];
                Object[] objArr29 = new Object[1];
                c("⒄ܺⓠ䍛쨕结䉸늄㓑却刹", ViewConfiguration.getFadingEdgeLength() >> 16, objArr29);
                String str4 = (String) objArr29[0];
                Object[] objArr30 = new Object[1];
                b(null, (-16777090) - (~(-Color.rgb(0, 0, 0))), null, "\u0081\u0088\u0096\u0081\u0088\u008d\u0094\u0086\u0089", objArr30);
                String str5 = (String) objArr30[0];
                Object[] objArr31 = new Object[1];
                c("ꦙ뇢꧰\uf58aⷕ\ue61dꖡ⩚맅\ue5b7", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr31);
                String str6 = (String) objArr31[0];
                Object[] objArr32 = new Object[1];
                c("僴㷊傝禨簧ꯆ\uf456枖䃩榒\ue40a矰烡姁푱䜰怇", TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), objArr32);
                String str7 = (String) objArr32[0];
                Object[] objArr33 = new Object[1];
                c("蠔⺮衽櫍⡡炙ꀍ볒顔", View.getDefaultSize(0, 0), objArr33);
                String str8 = (String) objArr33[0];
                int i82 = -(-ExpandableListView.getPackedPositionChild(0L));
                int i83 = (i82 ^ 1) + ((i82 & 1) << 1);
                Object[] objArr34 = new Object[1];
                c("ፂ䦮ጫි䢾礑샃땇̔ᶡ", i83, objArr34);
                String str9 = (String) objArr34[0];
                Object[] objArr35 = new Object[1];
                c("䏍贅䎤쥾⩅刐", View.combineMeasuredStates(0, 0), objArr35);
                String str10 = (String) objArr35[0];
                Object[] objArr36 = new Object[1];
                c("\u1f58ￇἴ뮤㘗㴯빨\uf17b།ꮉ긬\ue112㽋鯟鹁퇘⾼謺軍쇯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr36);
                String str11 = (String) objArr36[0];
                Object[] objArr37 = new Object[1];
                c("谧⮘豋濻僡ᢼ\ud89e퓬鱶翃죍쓆갵侗", ViewConfiguration.getKeyRepeatDelay() >> 16, objArr37);
                String str12 = (String) objArr37[0];
                Object[] objArr38 = new Object[1];
                b(null, 127 - View.getDefaultSize(0, 0), null, "\u0097\u0093\u0085\u0081\u0090\u0082\u0081\u008e", objArr38);
                String str13 = (String) objArr38[0];
                Object[] objArr39 = new Object[1];
                c("抣態拓┵懥ꜗ\ue992歕狰㔘療笯䊦Մ짩䯷", (-2) - ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) ^ (-1)), objArr39);
                String str14 = (String) objArr39[0];
                Object[] objArr40 = new Object[1];
                c("稿\uf710穏덮嘫䬀\ude5c蝂橬ꍃ츏霸娺錟︧\ua7e7䫛菠", TextUtils.getTrimmedLength(BuildConfig.FLAVOR), objArr40);
                String str15 = (String) objArr40[0];
                int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                int i84 = ((keyRepeatTimeout | 127) << 1) - (keyRepeatTimeout ^ 127);
                Object[] objArr41 = new Object[1];
                b(null, i84, null, "\u0091\u0093\u008f\u0082\u0092\u0088\u0081", objArr41);
                String str16 = (String) objArr41[0];
                int i85 = -Process.getGidForName(BuildConfig.FLAVOR);
                int i86 = ((i85 | 126) << 1) - (i85 ^ 126);
                Object[] objArr42 = new Object[1];
                b(null, i86, null, "\u008e\u0085\u0092\u0087\u0082\u0084\u008d", objArr42);
                String str17 = (String) objArr42[0];
                Object[] objArr43 = new Object[1];
                c("\u1b4d쏌ᬾ螱〷ꛋ롃檆ଉ鞕ꡌ", KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), objArr43);
                String str18 = (String) objArr43[0];
                Object[] objArr44 = new Object[1];
                c("ꈡ㑜ꉒ瀣릸․", TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), objArr44);
                String str19 = (String) objArr44[0];
                int i87 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                int i88 = ((i87 | 127) << 1) - (i87 ^ 127);
                Object[] objArr45 = new Object[1];
                b(null, i88, null, "\u0091\u0093\u0088\u0089\u0085\u0097\u0090\u0082\u008a\u0098\u0084\u0091\u008c\u0087\u0098\u0091\u0081\u0085\u0091\u008d", objArr45);
                String str20 = (String) objArr45[0];
                Object[] objArr46 = new Object[1];
                c("ײꤙց\ued61\ued96쾁旼τᖡ\ufd40", KeyEvent.getMaxKeyCode() >> 16, objArr46);
                String str21 = (String) objArr46[0];
                Object[] objArr47 = new Object[1];
                c("瞽캱矎諈칳儝", ViewConfiguration.getEdgeSlop() >> 16, objArr47);
                String str22 = (String) objArr47[0];
                Object[] objArr48 = new Object[1];
                c("땄්딷䦧旞䲵\ueda8胸ꔀ妟\ufdec還镖榋췕ꁅ薵礢\udd03끲", 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr48);
                String str23 = (String) objArr48[0];
                int i89 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
                int i90 = ((i89 | 127) << 1) - (i89 ^ 127);
                Object[] objArr49 = new Object[1];
                b(null, i90, null, "\u0084\u0091\u0085\u008e\u0088\u0090\u0085\u0081\u0091", objArr49);
                String str24 = (String) objArr49[0];
                int i91 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int i92 = ((i91 | 127) << 1) - (i91 ^ 127);
                Object[] objArr50 = new Object[1];
                b(null, i92, null, "\u0099\u0084\u0091\u0085\u008e\u0088\u0090\u0085\u0081\u0091", objArr50);
                String str25 = (String) objArr50[0];
                int rgb2 = Color.rgb(0, 0, 0);
                int PngjBadCrcException3 = 0; /* decompiler artifact */
                int i93 = rgb2 * 1773;
                int i94 = (i93 ^ (-1962934272)) + ((i93 & (-1962934272)) << 1);
                int i95 = ~rgb2;
                int i96 = ~((i95 & (-16777217)) | (i95 ^ (-16777217)));
                int i97 = ~((-16777217) | PngjBadCrcException3);
                int i98 = (i96 & i97) | (i96 ^ i97);
                int i99 = ~PngjBadCrcException3;
                int i100 = (i99 & rgb2) | (i99 ^ rgb2);
                int i101 = ~((i100 ^ 16777216) | (i100 & 16777216));
                int i102 = ((i98 ^ i101) | (i98 & i101)) * 886;
                int i103 = (i94 ^ i102) + ((i102 & i94) << 1);
                int i104 = ~PngjBadCrcException3;
                int i105 = ~(i104 | 16777216);
                int i106 = (((i105 & rgb2) | (rgb2 ^ i105)) * (-1772)) + i103;
                int i107 = (~((rgb2 & i104) | (i104 ^ rgb2))) * 886;
                int i108 = (i106 ^ i107) + ((i107 & i106) << 1);
                Object[] objArr51 = new Object[1];
                c("偡尀倕\u187e\udbb8ᱺ叁퀽䀴ࡎ䎟쁛灵㠉珶", i108, objArr51);
                String str26 = (String) objArr51[0];
                int i109 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int i110 = (i109 * 483) + 30976;
                int i111 = ~i109;
                int i112 = ~(i111 | (-129));
                int i113 = ~i109;
                int i114 = (i112 | (~((i113 & i20) | (i113 ^ i20)))) * (-241);
                int i115 = (((i109 ^ 128) | (i109 & 128)) * (-482)) + (i110 & i114) + (i110 | i114);
                int i116 = ~((i109 & (-129)) | ((-129) ^ i109));
                int i117 = (i111 & i20) | (i111 ^ i20);
                int i118 = ~((i117 & 128) | (i117 ^ 128));
                int i119 = -(-(((i116 & i118) | (i116 ^ i118)) * 241));
                int i120 = (i115 & i119) + (i119 | i115);
                Object[] objArr52 = new Object[1];
                b(null, i120, null, "\u0082\u008b\u0093\u008c\u0098\u0086\u0093\u008c\u0087\u0093\u008f", objArr52);
                String str27 = (String) objArr52[0];
                Object[] objArr53 = new Object[1];
                c("履鸰尐\uda52鏀Ꮸᮯ\udfa5䰻쩨ௗ쿎籠層㯧％沛\ueaca⬇", ExpandableListView.getPackedPositionGroup(0L), objArr53);
                String str28 = (String) objArr53[0];
                Object[] objArr54 = new Object[1];
                c("\uf031\ue46a\uf044ꀈ䗸趿춗䇲\ue06f뀲\uddef冘퀨聫\uede2慔샍邅", ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr54);
                String[] strArr5 = {str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, (String) objArr54[0]};
                int i121 = -Drawable.resolveOpacity(0, 0);
                int i122 = (i121 & 127) + (i121 | 127);
                Object[] objArr55 = new Object[1];
                b(null, i122, null, "\u0088\u0081\u0085\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr55);
                Object[] objArr56 = {(String) objArr55[0]};
                Object PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                if (PngjBadSignature11 == null) {
                    char scrollDefaultDelay2 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 8752);
                    int pressedStateDuration = 24 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int red = Color.red(0) + 336;
                    byte b20 = (byte) 0;
                    byte b21 = (byte) (b20 + 1);
                    strArr = strArr5;
                    i7 = i76;
                    Object[] objArr57 = new Object[1];
                    a(b20, b21, (byte) (b21 | 14), objArr57);
                    PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(scrollDefaultDelay2, pressedStateDuration, red, -598779726, false, (String) objArr57[0], new Class[]{cls});
                } else {
                    strArr = strArr5;
                    i7 = i76;
                }
                Object invoke4 = ((Method) PngjBadSignature11).invoke(null, objArr56);
                if (invoke4 != null) {
                    PngjOutputException = (PngjPrematureEnding + 1) % 128;
                    Object[] objArr58 = new Object[1];
                    c("İ\u0ba0ł俍溄卑\ue6f2鼖ᅨ忩", ViewConfiguration.getLongPressTimeout() >> 16, objArr58);
                    String str29 = (String) objArr58[0];
                    int myTid2 = Process.myTid() >> 22;
                    int PngjBadCrcException4 = 0; /* decompiler artifact */
                    int i123 = (myTid2 * (-129)) + 16637;
                    int i124 = ~PngjBadCrcException4;
                    int i125 = ((-128) & i124) | ((-128) ^ i124);
                    int i126 = -(-((~((i125 & myTid2) | (i125 ^ myTid2))) * 130));
                    int i127 = (i123 & i126) + (i123 | i126);
                    int i128 = (~((-128) | myTid2)) * (-260);
                    int i129 = (i127 ^ i128) + ((i128 & i127) << 1);
                    int i130 = ~myTid2;
                    int i131 = ~((i130 & 127) | (i130 ^ 127));
                    int i132 = ((-128) & myTid2) | ((-128) ^ myTid2);
                    int i133 = ~((i132 & PngjBadCrcException4) | (i132 ^ PngjBadCrcException4));
                    int i134 = -(-(((i133 & i131) | (i131 ^ i133)) * 130));
                    int i135 = (i129 ^ i134) + ((i134 & i129) << 1);
                    Object[] objArr59 = new Object[1];
                    b(null, i135, null, "\u0084\u008d\u008c\u008b\u0086\u008a\u0082\u0089", objArr59);
                    Object[] objArr60 = {invoke4, new String[]{str29, (String) objArr59[0]}};
                    Object PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-344601997);
                    if (PngjBadSignature12 == null) {
                        char offsetAfter = (char) (TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 26716);
                        int scrollDefaultDelay3 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 33;
                        int axisFromString = MotionEvent.axisFromString(BuildConfig.FLAVOR) + 1669;
                        byte b22 = (byte) 0;
                        byte b23 = (byte) (b22 + 1);
                        Object[] objArr61 = new Object[1];
                        a(b22, b23, (byte) (b23 | 14), objArr61);
                        PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(offsetAfter, scrollDefaultDelay3, axisFromString, 396011464, false, (String) objArr61[0], new Class[]{cls, String[].class});
                    }
                    long longValue7 = ((Long) ((Method) PngjBadSignature12).invoke(null, objArr60)).longValue();
                    long j42 = -620299872;
                    long j43 = (565 * longValue7) + ((-563) * j42);
                    long j44 = j42 ^ j9;
                    long j45 = longValue7 ^ j9;
                    long myTid3 = Process.myTid();
                    long j46 = myTid3 ^ j9;
                    long j47 = ((564 * (((j44 | j46) ^ j9) | ((j42 | longValue7) ^ j9))) + ((1128 * (((j44 | longValue7) | myTid3) ^ j9)) + (((-564) * ((j44 | ((j45 | j46) ^ j9)) | ((longValue7 | myTid3) ^ j9))) + j43))) - 1066292349;
                    int i136 = ((int) (j47 >> 32)) & ((((~(374339571 | i)) | (-1062886840)) * 529) + (((~(i20 | 374339571)) | (-1063256056)) * 529) + 1520786966);
                    int myTid4 = Process.myTid();
                    int i137 = ((int) j47) & (((myTid4 | (-538248210)) * 668) + (((-968844318) | (~(468382092 | myTid4))) * 1336) + ((((~((-968844318) | myTid4)) | 468382092) * (-668)) - 499748143));
                    if (((i136 & i137) | (i136 ^ i137)) != 0) {
                        int i138 = -Process.getGidForName(BuildConfig.FLAVOR);
                        int PngjBadCrcException5 = 0; /* decompiler artifact */
                        int i139 = i138 * (-391);
                        int i140 = (i139 ^ (-24570)) + ((i139 & (-24570)) << 1);
                        int i141 = ~(((-127) & i138) | ((-127) ^ i138));
                        int i142 = ~((PngjBadCrcException5 ^ 126) | (PngjBadCrcException5 & 126));
                        int i143 = (i140 - (~(-(-(((i141 & i142) | (i141 ^ i142)) * (-196)))))) - 1;
                        int i144 = ((i138 ^ 126) | (i138 & 126)) * 392;
                        int i145 = ~i138;
                        int i146 = ~((i145 & (-127)) | (i145 ^ (-127)));
                        int i147 = ~(PngjBadCrcException5 | 126);
                        int i148 = (((i146 & i147) | (i146 ^ i147)) * 196) + (i143 ^ i144) + ((i144 & i143) << 1);
                        Object[] objArr62 = new Object[1];
                        b(null, i148, null, "\u0081\u0088\u0081\u008f\u0091\u0090\u0085\u008b\u008f\u0093\u0085\u0092\u0083\u0091\u0090\u008f\u0086\u0082\u0081\u008e\u0083\u0082\u0081", objArr62);
                        Object[] objArr63 = {(String) objArr62[0]};
                        Object PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                        if (PngjBadSignature13 == null) {
                            char keyCodeFromString = (char) (8752 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR));
                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24;
                            int scrollDefaultDelay4 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 336;
                            byte b24 = (byte) 0;
                            byte b25 = (byte) (b24 + 1);
                            Object[] objArr64 = new Object[1];
                            a(b24, b25, (byte) (b25 | 14), objArr64);
                            PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(keyCodeFromString, minimumFlingVelocity, scrollDefaultDelay4, -598779726, false, (String) objArr64[0], new Class[]{cls});
                        }
                        Object invoke5 = ((Method) PngjBadSignature13).invoke(null, objArr63);
                        Object[] objArr65 = new Object[1];
                        c("ߧᰢޕ塁誨℁ʞ\ued55ឥ䡱ኄﴠ⟤砺⋾췶㜎棍㉴\uddd0䝊飀䈝ⶄ坹被叆㱴暤륺揥ష盒ꤌ", 0 - (~(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))), objArr65);
                        Object[] objArr66 = {(String) objArr65[0]};
                        Object PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                        if (PngjBadSignature14 == null) {
                            char threadPriority = (char) (8752 - ((Process.getThreadPriority(0) + 20) >> 6));
                            int edgeSlop = 24 - (ViewConfiguration.getEdgeSlop() >> 16);
                            int i149 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 335;
                            byte b26 = (byte) 0;
                            byte b27 = (byte) (b26 + 1);
                            obj2 = invoke5;
                            Object[] objArr67 = new Object[1];
                            a(b26, b27, (byte) (b27 | 14), objArr67);
                            PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(threadPriority, edgeSlop, i149, -598779726, false, (String) objArr67[0], new Class[]{cls});
                        } else {
                            obj2 = invoke5;
                        }
                        Object invoke6 = ((Method) PngjBadSignature14).invoke(null, objArr66);
                        if (obj2 == null) {
                            obj3 = invoke6;
                        } else {
                            /* IdentySdk.valueOf.PngjBadCrcException() - decompiler artifact */
                            /* IdentySdk.valueOf.PngjBadCrcException() - decompiler artifact */
                            Object[] objArr68 = {obj2, 42};
                            Object PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                            if (PngjBadSignature15 == null) {
                                char c6 = (char) (11039 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                int i150 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31;
                                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1282;
                                byte b28 = (byte) ($$b & 3);
                                byte b29 = b28;
                                obj3 = invoke6;
                                Object[] objArr69 = new Object[1];
                                a(b28, b29, (byte) (b29 | 10), objArr69);
                                PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c6, i150, longPressTimeout, -971849413, false, (String) objArr69[0], new Class[]{cls, cls2});
                            } else {
                                obj3 = invoke6;
                            }
                            long longValue8 = ((Long) ((Method) PngjBadSignature15).invoke(null, objArr68)).longValue();
                            long j48 = -134604357;
                            long j49 = 370;
                            long j50 = (j49 * longValue8) + (j49 * j48);
                            long j51 = -369;
                            long j52 = ((j48 | longValue8 | j13) * j51) + j50;
                            long j53 = (j48 ^ j9) | j13;
                            long j54 = (369 * ((((longValue8 ^ j9) | j48) ^ j9) | ((j48 | j12) ^ j9) | ((j53 | longValue8) ^ j9))) + (j51 * (longValue8 | (j53 ^ j9))) + j52 + 790312057;
                            int myUid = Process.myUid();
                            int i151 = ((int) (j54 >> 32)) & (((myUid | (-1092627610)) * 220) + (((~((~myUid) | (-1765109178))) | (-1092631708)) * (-440)) + ((((~((-1092627610) | 0)) | (-1765113276)) * 220) - 941585550));
                            int i152 = ((int) j54) & ((((~((-308222895) | i20)) | (-1398750208)) * 970) + (((1090527313 | 0) * (-970)) - 609651393));
                        }
                        if (obj3 != null) {
                            int i153 = PngjPrematureEnding;
                            int i154 = (i153 ^ 69) + ((i153 & 69) << 1);
                            PngjOutputException = i154 % 128;
                            if (i154 % 2 == 0) {
                                Object[] objArr70 = {obj3, 63};
                                Object PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                                if (PngjBadSignature16 == null) {
                                    char indexOf4 = (char) (11038 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0));
                                    int alpha2 = 31 - Color.alpha(0);
                                    int i155 = 1283 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                    byte b30 = (byte) ($$b & 3);
                                    byte b31 = b30;
                                    Object[] objArr71 = new Object[1];
                                    a(b30, b31, (byte) (b31 | 10), objArr71);
                                    PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf4, alpha2, i155, -971849413, false, (String) objArr71[0], new Class[]{cls, cls2});
                                }
                                long longValue9 = ((Long) ((Method) PngjBadSignature16).invoke(null, objArr70)).longValue();
                                long j55 = -725449579;
                                long j56 = j55 ^ j9;
                                long j57 = (j56 | j13) ^ j9;
                                long j58 = ((-338) * (j57 | (((longValue9 ^ j9) | j55) ^ j9) | ((j55 | j12) ^ j9))) + (339 * longValue9) + ((-337) * j55);
                                long j59 = 338;
                                long j60 = (j59 * (j57 | (((j55 | longValue9) | j12) ^ j9))) + (((j56 | longValue9) ^ j9) * j59) + j58 + 1381157279;
                                int i156 = ((int) (j60 >>> 41)) & ((((-340103171) | i) * 465) + ((556950360 | (~((-880276051) | i))) * 930) + (((~(556950360 | i)) | (-880276051)) * (-465)) + 1857964296);
                                int i157 = ~((-2022099647) | i20);
                                int i158 = ((int) j60) & (((i157 | (~(2043600831 | i))) * 338) + ((21501185 | i157 | (~(2022099646 | i))) * (-338)) + 1535206823);
                                if (((i156 & i158) | (i156 ^ i158)) == 477111747) {
                                    int i159 = 0;
                                    int i160 = 0;
                                    while (true) {
                                        if (i159 >= 28) {
                                            break;
                                        }
                                        String str30 = strArr[i159];
                                        int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                        int PngjBadCrcException6 = 0; /* decompiler artifact */
                                        int i161 = scrollBarFadeDuration * (-589);
                                        int i162 = (i161 ^ 75057) + ((i161 & 75057) << 1);
                                        int i163 = ~PngjBadCrcException6;
                                        int i164 = ((-128) ^ scrollBarFadeDuration) | ((-128) & scrollBarFadeDuration);
                                        int i165 = i159;
                                        int i166 = (~i164) | (~(((-128) ^ i163) | ((-128) & i163))) | (~((i163 ^ scrollBarFadeDuration) | (i163 & scrollBarFadeDuration)));
                                        int i167 = ~scrollBarFadeDuration;
                                        int i168 = (i167 ^ 127) | (i167 & 127);
                                        int i169 = ~((i168 ^ PngjBadCrcException6) | (i168 & PngjBadCrcException6));
                                        int i170 = ((i166 ^ i169) | (i166 & i169)) * 590;
                                        int i171 = (i162 ^ i170) + ((i162 & i170) << 1);
                                        int i172 = (~(((-128) ^ i163) | ((-128) & i163))) | (~i164);
                                        int i173 = ~PngjBadCrcException6;
                                        int i174 = ~((scrollBarFadeDuration & i173) | (i173 ^ scrollBarFadeDuration));
                                        int i175 = (i171 - (~(-(-(((i172 & i174) | (i172 ^ i174)) * (-1180)))))) - 1;
                                        int i176 = ~((i167 ^ i163) | (i167 & i163));
                                        int i177 = ~(i173 | 127);
                                        int i178 = -(-(((i176 & i177) | (i176 ^ i177)) * 590));
                                        int i179 = (i175 ^ i178) + ((i175 & i178) << 1);
                                        Object[] objArr72 = new Object[1];
                                        b(null, i179, null, "\u009a\u0093\u008c\u0094\u009a\u0092\u0088\u0091\u008d\u009b\u008d\u009a", objArr72);
                                        Object[] objArr73 = {((String) objArr72[0]).concat(String.valueOf(str30))};
                                        Object PngjBadSignature17 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1142218481);
                                        if (PngjBadSignature17 == null) {
                                            char myPid3 = (char) (Process.myPid() >> 22);
                                            int indexOf5 = TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 28;
                                            int scrollDefaultDelay5 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1447;
                                            byte b32 = (byte) 0;
                                            byte b33 = (byte) (b32 + 1);
                                            Object[] objArr74 = new Object[1];
                                            a(b32, b33, (byte) (b33 | 14), objArr74);
                                            PngjBadSignature17 = com.d.e.a.PngjBadCrcException.PngjBadSignature(myPid3, indexOf5, scrollDefaultDelay5, 1191464116, false, (String) objArr74[0], new Class[]{cls});
                                        }
                                        long longValue10 = ((Long) ((Method) PngjBadSignature17).invoke(null, objArr73)).longValue();
                                        long j61 = -1398722990;
                                        long j62 = (263 * longValue10) + ((-523) * j61);
                                        long j63 = 262;
                                        long j64 = ((j61 ^ j9) | longValue10) ^ j9;
                                        long j65 = longValue10 ^ j9;
                                        long j66 = (j65 | j61) ^ j9;
                                        long myUid2 = Process.myUid();
                                        long j67 = ((((((j65 | (myUid2 ^ j9)) ^ j9) | j64) | j66) * j63) + (((-786) * j66) + ((((j64 | j66) | ((j65 | myUid2) ^ j9)) * j63) + j62))) - 557274887;
                                        int maxMemory2 = (int) Runtime.getRuntime().maxMemory();
                                        int i180 = ~maxMemory2;
                                        int i181 = (~((-855456628) | i180)) | 581769779;
                                        int i182 = ~(maxMemory2 | 855456631);
                                        int i183 = ((int) (j67 >> 32)) & (((i182 | (~(i180 | (-273686849)))) * 502) + ((i181 | i182) * (-502)) + 1427879340);
                                        int i184 = ~defpackage.a.b(2011881280);
                                        int i185 = ((int) j67) & ((((~(1993610004 | i184)) | 1163232341) * 764) + (((~(i184 | 864130881)) | 1146355732) * (-1528)) + (((864130881 | 0) * 764) - 574632435));
                                        if (((i183 & i185) | (i183 ^ i185)) != 0) {
                                            i16 = 1;
                                        } else {
                                            PngjPrematureEnding = (PngjOutputException + 11) % 128;
                                            i16 = 0;
                                        }
                                        int i186 = -(-i16);
                                        i160 = (i160 ^ i186) + ((i186 & i160) << 1);
                                        i159 = (i165 & 1) + (i165 | 1);
                                    }
                                    if (i160 >= 25.2d) {
                                        int i187 = PngjPrematureEnding;
                                        PngjOutputException = ((i187 & 43) + (i187 | 43)) % 128;
                                        z = true;
                                    }
                                }
                            } else {
                                Object[] objArr75 = {obj3, 42};
                                Object PngjBadSignature18 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                                if (PngjBadSignature18 == null) {
                                    char lastIndexOf2 = (char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 11040);
                                    int i188 = 31 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                    int i189 = 1282 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                    byte b34 = (byte) ($$b & 3);
                                    byte b35 = b34;
                                    Object[] objArr76 = new Object[1];
                                    a(b34, b35, (byte) (b35 | 10), objArr76);
                                    PngjBadSignature18 = com.d.e.a.PngjBadCrcException.PngjBadSignature(lastIndexOf2, i188, i189, -971849413, false, (String) objArr76[0], new Class[]{cls, cls2});
                                }
                                long longValue11 = ((Long) ((Method) PngjBadSignature18).invoke(null, objArr75)).longValue();
                                long j68 = -1170798888;
                                long j69 = -167;
                                long j70 = (j69 * longValue11) + (j69 * j68);
                                long j71 = 168;
                                long j72 = j68 ^ j9;
                                long j73 = longValue11 ^ j9;
                                long j74 = j72 | j73;
                                long myUid3 = Process.myUid();
                                long j75 = myUid3 ^ j9;
                                long j76 = ((((j72 | j75) ^ j9) | ((j72 | longValue11) ^ j9) | ((myUid3 | (j73 | j68)) ^ j9)) * j71) + (((j74 | myUid3) ^ j9) * j71) + (((j74 ^ j9) | ((j73 | j75) ^ j9)) * j71) + j70 + 1826506588;
                                int i190 = ~((-664467043) | i20);
                                int i191 = ((int) (j76 >> 32)) & (((i190 | 1480919053) * 970) + (((-2145386096) | i190) * (-970)) + 1499447304);
                                int i192 = ((int) j76) & (((1378550844 | (~(58675565 | i))) * 502) + ((~((-22303042) | i20)) * (-502)) + (((~(1378550844 | i)) | 36372524) * (-502)) + 1705314411);
                            }
                            if (!z) {
                                int i193 = PngjOutputException;
                                PngjPrematureEnding = ((i193 ^ 105) + ((i193 & 105) << 1)) % 128;
                                Object[] objArr77 = {new int[]{i ^ 261}, new int[1], null, new int[]{i}};
                                int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                                int i194 = ~elapsedRealtime;
                                int i195 = (((~(elapsedRealtime | 495386759)) | 539179214) * 519) + (((~(i194 | (-538982473))) | (~(1034369231 | elapsedRealtime))) * (-519)) + (((~((-539179215) | i194)) | 495386759) * 519) + 965737986;
                                int i196 = (i195 & 16) + (i195 | 16);
                                int i197 = ((i2 | i196) << 1) - (i2 ^ i196);
                                int i198 = i197 << 13;
                                int i199 = ((~i197) & i198) | ((~i198) & i197);
                                int i200 = i199 ^ (i199 >>> 17);
                                int i201 = i200 << 5;
                                ((int[]) objArr77[1])[0] = (i200 | i201) & (~(i200 & i201));
                                return objArr77;
                            }
                            int i202 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i203 = ((i202 | 127) << 1) - (i202 ^ 127);
                            Object[] objArr78 = new Object[1];
                            b(null, i203, null, "\u0088\u0090\u0081\u0082\u008b\u0093\u0088\u009a\u009c\u008f\u0093\u008c\u008a\u0088\u008d\u009a\u008d\u008b\u009a\u008d\u009b\u008d\u009a", objArr78);
                            Object[] objArr79 = {(String) objArr78[0]};
                            Object PngjBadSignature19 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
                            if (PngjBadSignature19 == null) {
                                char red2 = (char) (29467 - Color.red(0));
                                int i204 = 40 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                int blue2 = Color.blue(0) + 432;
                                byte b36 = (byte) 0;
                                byte b37 = (byte) (b36 + 1);
                                Object[] objArr80 = new Object[1];
                                a(b36, b37, (byte) (b37 | 14), objArr80);
                                PngjBadSignature19 = com.d.e.a.PngjBadCrcException.PngjBadSignature(red2, i204, blue2, 886713584, false, (String) objArr80[0], new Class[]{cls});
                            }
                            long longValue12 = ((Long) ((Method) PngjBadSignature19).invoke(null, objArr79)).longValue();
                            long j77 = -1093904028;
                            long j78 = j77 ^ j9;
                            long j79 = ((-108) * (((j78 | longValue12) ^ j9) | ((j13 | longValue12) ^ j9))) + ((-107) * longValue12) + (55 * j77);
                            long j80 = 54;
                            long j81 = ((longValue12 ^ j9) | j77) ^ j9;
                            long j82 = ((j80 * (j12 | j81)) + ((((((j78 | j12) ^ j9) | j81) | ((j13 | j77) ^ j9)) * j80) + j79)) - 54808620;
                            int i205 = ((int) (j82 >> 32)) & ((((~(751054296 | i20)) | 2228738) * 560) + ((~((-67110921) | i)) * (-560)) + (((~(686172114 | i20)) * (-560)) - 883457334));
                            int startUptimeMillis = (int) Process.getStartUptimeMillis();
                            int c7 = ((int) j82) & defpackage.a.c((~(startUptimeMillis | (-271198573))) | (~((~startUptimeMillis) | 1708424982)) | 1708414482, -370, (((~((-271198573) | 0)) | (~(1708424982 | startUptimeMillis))) * (-370)) - 635053777, 753165828);
                            long j83 = (i205 & c7) | (i205 ^ c7);
                            Object[] objArr81 = new Object[1];
                            c("\ue11d됖\ue132\uf06aྤ㟇蟎ﮌ\uf14e\ue005鞟\uebf6섑퀜\ua7f3\udb30퇹샫띸쬆ꆮ", (-TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0)) - 1, objArr81);
                            Object[] objArr82 = {(String) objArr81[0]};
                            Object PngjBadSignature20 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
                            if (PngjBadSignature20 == null) {
                                char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 29467);
                                int resolveOpacity2 = 39 - Drawable.resolveOpacity(0, 0);
                                int indexOf6 = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 433;
                                byte b38 = (byte) 0;
                                byte b39 = (byte) (b38 + 1);
                                j = j83;
                                Object[] objArr83 = new Object[1];
                                a(b38, b39, (byte) (b39 | 14), objArr83);
                                PngjBadSignature20 = com.d.e.a.PngjBadCrcException.PngjBadSignature(deadChar, resolveOpacity2, indexOf6, 886713584, false, (String) objArr83[0], new Class[]{cls});
                            } else {
                                j = j83;
                            }
                            long longValue13 = ((Long) ((Method) PngjBadSignature20).invoke(null, objArr82)).longValue();
                            long j84 = -176722163;
                            long j85 = longValue13 ^ j9;
                            long j86 = (j13 | longValue13) ^ j9;
                            long j87 = ((-516) * (((j85 | j12) ^ j9) | ((j13 | j84) ^ j9) | j86)) + (517 * longValue13) + ((-515) * j84);
                            long j88 = 516;
                            long j89 = j84 ^ j9;
                            long j90 = ((j88 * (((j89 | longValue13) ^ j9) | j86)) + ((((((j89 | j85) | j12) ^ j9) | (((j89 | j13) | longValue13) ^ j9)) * j88) + j87)) - 971990485;
                            int myPid4 = Process.myPid();
                            long j91 = (((int) (j90 >> 32)) & ((((~(myPid4 | 1630062994)) | 1227677890) * 301) + (((~(1227677890 | myPid4)) | (~((~myPid4) | (-1630062995)))) * (-301)) + (((~((-1093189763) | myPid4)) * (-301)) - 1998908870))) | (((int) j90) & ((((~((~((int) Runtime.getRuntime().totalMemory())) | (-382716984))) | (-2058743255)) * 262) + ((((~((-382716984) | 0)) | (-2058743255)) * 262) - 506880027)));
                            if (((j > 0L ? 1 : (j == 0L ? 0 : -1)) > 0) && j91 > 0 && j91 - 3 < j) {
                                c2 = c;
                                c3 = c2;
                            } else {
                                c2 = 'F';
                                c3 = c;
                            }
                            if (c2 == c3) {
                                Object[] objArr84 = {new int[]{i ^ 247}, new int[1], null, new int[]{i}};
                                int myTid5 = Process.myTid();
                                int i206 = (i2 - (~(-(-defpackage.a.A((~(myTid5 | 530240592)) | ((~((~myTid5) | (-530240593))) | (~((-504325382) | myTid5))), 959, ((((~((-504325382) | 0)) | (~((-530240593) | myTid5))) | (~(0 | 530240592))) * 959) - 1254784748, -16))))) - 1;
                                int i207 = i206 ^ (i206 << 13);
                                int i208 = i207 >>> 17;
                                int i209 = (i207 | i208) & (~(i207 & i208));
                                int i210 = i209 << 5;
                                ((int[]) objArr84[1])[0] = ((~i209) & i210) | ((~i210) & i209);
                                return objArr84;
                            }
                            Object[] objArr85 = new Object[1];
                            b(null, 126 - (~(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))), null, "\u0088\u0090\u0081\u0082\u008b\u0093\u0088\u009a\u009c\u008f\u0093\u008c\u008a\u0088\u008d\u009a\u008d\u008b\u009a\u008d\u009b\u008d\u009a", objArr85);
                            Object[] objArr86 = {(String) objArr85[0]};
                            Object PngjBadSignature21 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
                            if (PngjBadSignature21 == null) {
                                char indexOf7 = (char) (TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 29467);
                                int touchSlop = 39 - (ViewConfiguration.getTouchSlop() >> 8);
                                int indexOf8 = 432 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0);
                                byte b40 = (byte) 0;
                                byte b41 = (byte) (b40 + 1);
                                Object[] objArr87 = new Object[1];
                                a(b40, b41, (byte) (b41 | 14), objArr87);
                                PngjBadSignature21 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf7, touchSlop, indexOf8, 886713584, false, (String) objArr87[0], new Class[]{cls});
                            }
                            long longValue14 = ((Long) ((Method) PngjBadSignature21).invoke(null, objArr86)).longValue();
                            long j92 = -978210610;
                            long j93 = 569;
                            long j94 = (j93 * longValue14) + (j93 * j92);
                            long j95 = j92 ^ j9;
                            long j96 = longValue14 ^ j9;
                            long j97 = j95 | j96;
                            long startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                            long j98 = startElapsedRealtime ^ j9;
                            long j99 = j98 | j92;
                            long j100 = ((568 * (((j99 ^ j9) | ((j98 | longValue14) ^ j9)) | ((j97 | startElapsedRealtime) ^ j9))) + (((-568) * ((((j95 | startElapsedRealtime) ^ j9) | ((j96 | startElapsedRealtime) ^ j9)) | ((j99 | longValue14) ^ j9))) + (((((j97 ^ j9) | ((j95 | j98) ^ j9)) | ((j96 | j98) ^ j9)) * (-1136)) + j94))) - 170502038;
                            int i211 = ((int) (j100 >> 32)) & ((((~((-1658790803) | i20)) | (-1877732982)) * 398) + ((((~((-1658790803) | i)) | (-1877732982)) * 398) - 1082861646));
                            int i212 = ((int) j100) & (((172040209 | (~((-1343506211) | i)) | (~(1343506210 | i20))) * 988) + (((~(1514234675 | i20)) | 1311744) * (-1976)) + ((i | 172040209) * 988) + 266502117);
                            long j101 = (i211 & i212) | (i211 ^ i212);
                            Object[] objArr88 = new Object[1];
                            c("쫣鍼쫌휔鹆悜ᘻ곎", ViewConfiguration.getScrollBarSize() >> 8, objArr88);
                            Object[] objArr89 = {(String) objArr88[0]};
                            Object PngjBadSignature22 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
                            if (PngjBadSignature22 == null) {
                                char fadingEdgeLength = (char) (29467 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                                int indexOf9 = 38 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0);
                                int i213 = 433 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                byte b42 = (byte) 0;
                                byte b43 = (byte) (b42 + 1);
                                j2 = j101;
                                Object[] objArr90 = new Object[1];
                                a(b42, b43, (byte) (b43 | 14), objArr90);
                                PngjBadSignature22 = com.d.e.a.PngjBadCrcException.PngjBadSignature(fadingEdgeLength, indexOf9, i213, 886713584, false, (String) objArr90[0], new Class[]{cls});
                            } else {
                                j2 = j101;
                            }
                            long longValue15 = ((Long) ((Method) PngjBadSignature22).invoke(null, objArr89)).longValue();
                            long j102 = 262834462;
                            long j103 = -433;
                            long j104 = -216;
                            long j105 = j104 * longValue15;
                            long j106 = 217;
                            long j107 = j102 ^ j9;
                            long myTid6 = Process.myTid();
                            long j108 = myTid6 ^ j9;
                            long j109 = longValue15 ^ j9;
                            long j110 = (((j102 | ((j109 | j108) ^ j9)) * j106) + (((((j107 | j109) ^ j9) | ((j107 | myTid6) ^ j9)) * j106) + (((((j107 | j108) ^ j9) | ((j109 | myTid6) ^ j9)) * j106) + (j105 + (j103 * j102))))) - 1411547110;
                            int c8 = ((int) (j110 >> 32)) & defpackage.a.c((~((-350758288) | i20)) | (~((-1086468124) | i)) | (-1424635296), -370, (((~((-350758288) | i)) | (~((-1086468124) | i20))) * (-370)) + 635053406, 1165917888);
                            int i214 = ((int) j110) & ((((~(201548192 | i20)) | 1168479657) * 262) + ((((~(201548192 | i)) | 1168479657) * 262) - 1790132123));
                            long j111 = (c8 & i214) | (c8 ^ i214);
                            if (j2 > 0 && j111 > 0) {
                                int i215 = (PngjPrematureEnding + 119) % 128;
                                PngjOutputException = i215;
                                if (j111 + 100 < j2) {
                                    PngjPrematureEnding = (i215 + 1) % 128;
                                    z2 = true;
                                    if (!z2) {
                                        int i216 = PngjOutputException;
                                        PngjPrematureEnding = ((i216 & 15) + (i216 | 15)) % 128;
                                        Object[] objArr91 = {new int[]{i ^ 248}, new int[1], null, new int[]{i}};
                                        int i217 = (((~(i | 1029175029)) | (~((-621057026) | i20))) * 318) + (((~((-626447970) | i)) | (~(1029175029 | i20))) * 318) + (((~((-408118005) | i)) | (-626447970)) * (-318)) + 325113839;
                                        int PngjBadCrcException7 = 0; /* decompiler artifact */
                                        int i218 = -(-(i217 * 334));
                                        int i219 = ((((-10640) | i218) << 1) - (i218 ^ (-10640))) + 5661;
                                        int i220 = ~PngjBadCrcException7;
                                        int i221 = -(-(((~((i220 & (-17)) | ((-17) ^ i220))) | (~((i217 ^ PngjBadCrcException7) | (i217 & PngjBadCrcException7)))) * 333));
                                        int i222 = (i219 ^ i221) + ((i221 & i219) << 1);
                                        int i223 = ~((-17) | PngjBadCrcException7);
                                        int i224 = ~PngjBadCrcException7;
                                        int i225 = ~((i217 & i224) | (i224 ^ i217));
                                        int i226 = (i2 - (~((((i225 & i223) | (i223 ^ i225)) * 333) + i222))) - 1;
                                        int i227 = i226 << 13;
                                        int i228 = ((~i226) & i227) | ((~i227) & i226);
                                        int i229 = i228 >>> 17;
                                        int i230 = (i228 | i229) & (~(i228 & i229));
                                        int i231 = i230 << 5;
                                        ((int[]) objArr91[1])[0] = ((~i230) & i231) | ((~i231) & i230);
                                        return objArr91;
                                    }
                                    int i232 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                    int i233 = (i232 ^ 126) + ((i232 & 126) << 1);
                                    Object[] objArr92 = new Object[1];
                                    b(null, i233, null, "\u0092\u0088\u0091\u008d\u009b\u008d\u009a", objArr92);
                                    String str31 = (String) objArr92[0];
                                    int maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                    int i234 = ((maximumFlingVelocity | 127) << 1) - (maximumFlingVelocity ^ 127);
                                    Object[] objArr93 = new Object[1];
                                    b(null, i234, null, "\u0093\u008c\u0094\u009a\u0092\u0088\u0091\u008d\u009b\u008d\u009a", objArr93);
                                    String str32 = (String) objArr93[0];
                                    Object[] objArr94 = new Object[1];
                                    b(null, 127 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))), null, "\u0093\u008c\u0094\u008d\u009a\u0092\u0088\u0091\u008d\u009b\u008d\u009a", objArr94);
                                    String str33 = (String) objArr94[0];
                                    int i235 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                    int i236 = i235 * (-947);
                                    int i237 = (i236 & 120523) + (i236 | 120523);
                                    int i238 = ~i235;
                                    int i239 = ~(((-128) ^ i) | ((-128) & i));
                                    int i240 = ((i238 & i239) | (i238 ^ i239)) * (-948);
                                    int i241 = ((i237 | i240) << 1) - (i240 ^ i237);
                                    int i242 = ~i235;
                                    int i243 = (i242 & (-128)) | (i242 ^ (-128));
                                    int i244 = ((~((i243 & i20) | (i243 ^ i20))) * (-948)) + i241;
                                    int i245 = -(-(((i235 & (-128)) | (i235 ^ (-128))) * 948));
                                    int i246 = (i244 ^ i245) + ((i245 & i244) << 1);
                                    Object[] objArr95 = new Object[1];
                                    b(null, i246, null, "\u0093\u008c\u0094\u009c\u009a\u0092\u0088\u0091\u008d\u009b\u008d\u009a", objArr95);
                                    String str34 = (String) objArr95[0];
                                    Object[] objArr96 = new Object[1];
                                    c("賭値賂ᑞㆅ뉈맸縂鲹ѷꦿ渳곯㐡馓", TextUtils.getTrimmedLength(BuildConfig.FLAVOR), objArr96);
                                    String str35 = (String) objArr96[0];
                                    Object[] objArr97 = new Object[1];
                                    c("퍧ᘼ퍈剃狄ﶲ諭ㇿ쌹", View.MeasureSpec.getSize(0), objArr97);
                                    String str36 = (String) objArr97[0];
                                    int i247 = -(-(KeyEvent.getMaxKeyCode() >> 16));
                                    int i248 = (i247 & 127) + (i247 | 127);
                                    boolean z5 = true;
                                    Object[] objArr98 = new Object[1];
                                    b(null, i248, null, "\u0090\u0091\u0088\u009a", objArr98);
                                    String[] strArr6 = {str31, str32, str33, str34, str35, str36, (String) objArr98[0]};
                                    int i249 = 0;
                                    while (true) {
                                        if ((i249 < 7 ? false : z5) == z5) {
                                            j3 = j12;
                                            i8 = 0;
                                            break;
                                        }
                                        int i250 = PngjOutputException;
                                        int i251 = (i250 & 121) + (i250 | 121);
                                        PngjPrematureEnding = i251 % 128;
                                        if (i251 % 2 != 0) {
                                            Object[] objArr99 = {strArr6[i249]};
                                            Object PngjBadSignature23 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1492900309);
                                            if (PngjBadSignature23 == null) {
                                                char blue3 = (char) Color.blue(0);
                                                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 35;
                                                int i252 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 397;
                                                strArr3 = strArr6;
                                                byte b44 = (byte) 0;
                                                byte b45 = (byte) (b44 + 1);
                                                j3 = j12;
                                                Object[] objArr100 = new Object[1];
                                                a(b44, b45, (byte) (b45 | 14), objArr100);
                                                PngjBadSignature23 = com.d.e.a.PngjBadCrcException.PngjBadSignature(blue3, makeMeasureSpec, i252, 1542146960, false, (String) objArr100[0], new Class[]{cls});
                                            } else {
                                                strArr3 = strArr6;
                                                j3 = j12;
                                            }
                                            long longValue16 = ((Long) ((Method) PngjBadSignature23).invoke(null, objArr99)).longValue();
                                            long j112 = -42678449;
                                            long j113 = ((-301) * longValue16) + (303 * j112);
                                            long j114 = j112 ^ j9;
                                            long myPid5 = Process.myPid();
                                            long j115 = ((302 * ((((longValue16 ^ j9) | j112) ^ j9) | ((longValue16 | myPid5) ^ j9))) + (((-604) * (((j114 | longValue16) | myPid5) ^ j9)) + (((-302) * ((((j114 | (myPid5 ^ j9)) | longValue16) ^ j9) | (((j112 | longValue16) | myPid5) ^ j9))) + j113))) - 321900330;
                                            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                            if (((((int) (j115 << 74)) & defpackage.a.c((~(elapsedCpuTime | 1491770822)) | (~((-54544412) | elapsedCpuTime)) | 50348057, -1444, (((~elapsedCpuTime) | 1537922525) * 1444) - 1153123274, 2016465892)) | (((int) j115) & defpackage.a.c((-440672781) | i20, -828, (((~((-440672781) | i20)) | (-996553630)) * (-828)) - 1754753727, -195158320))) != 0) {
                                                break;
                                            }
                                            int i253 = i249 + 52;
                                            i249 = ((i253 | (-51)) << 1) - (i253 ^ (-51));
                                            strArr6 = strArr3;
                                            j12 = j3;
                                            z5 = true;
                                        } else {
                                            strArr3 = strArr6;
                                            j3 = j12;
                                            Object[] objArr101 = {strArr3[i249]};
                                            Object PngjBadSignature24 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1492900309);
                                            if (PngjBadSignature24 == null) {
                                                char capsMode = (char) TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0);
                                                int i254 = 35 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                int i255 = 398 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                byte b46 = (byte) 0;
                                                byte b47 = (byte) (b46 + 1);
                                                Object[] objArr102 = new Object[1];
                                                a(b46, b47, (byte) (b47 | 14), objArr102);
                                                PngjBadSignature24 = com.d.e.a.PngjBadCrcException.PngjBadSignature(capsMode, i254, i255, 1542146960, false, (String) objArr102[0], new Class[]{cls});
                                            }
                                            long longValue17 = ((Long) ((Method) PngjBadSignature24).invoke(null, objArr101)).longValue();
                                            long j116 = 935897625;
                                            long j117 = -721;
                                            long j118 = (j117 * longValue17) + (j117 * j116);
                                            long uptimeMillis = (int) SystemClock.uptimeMillis();
                                            long j119 = j116 ^ j9;
                                            long j120 = longValue17 ^ j9;
                                            long j121 = (j116 | longValue17) ^ j9;
                                            long j122 = ((722 * (((j119 | longValue17) ^ j9) | ((j120 | j116) ^ j9))) + (((-1444) * ((j121 | ((j116 | uptimeMillis) ^ j9)) | ((longValue17 | uptimeMillis) ^ j9))) + ((1444 * (((uptimeMillis ^ j9) | ((j119 | j120) ^ j9)) | j121)) + j118))) - 1300476404;
                                            int myUid4 = Process.myUid();
                                            int i256 = (~(272353899 | myUid4)) | 1707352084;
                                            int i257 = ~((~myUid4) | (-270125674));
                                            int i258 = ((int) (j122 >> 32)) & ((((~(myUid4 | 1979705983)) | i257) * 470) + ((i256 | i257) * (-470)) + 733821538);
                                            int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
                                            int i259 = ~startElapsedRealtime2;
                                            int i260 = (~((-1482408856) | i259)) | 134349057;
                                            int i261 = ~(startElapsedRealtime2 | (-27272233));
                                            int i262 = ((int) j122) & (((~(i259 | (-1375332031))) * 713) + (i261 * 1426) + ((i260 | i261) * (-713)) + 1894105782);
                                            if (((i258 & i262) | (i258 ^ i262)) != 0) {
                                                break;
                                            }
                                            int i2532 = i249 + 52;
                                            i249 = ((i2532 | (-51)) << 1) - (i2532 ^ (-51));
                                            strArr6 = strArr3;
                                            j12 = j3;
                                            z5 = true;
                                        }
                                    }
                                    if (i8 != 0) {
                                        Object[] objArr103 = {new int[]{(i8 | i) & (~(i & i8))}, new int[1], null, new int[]{i}};
                                        int c9 = defpackage.a.c((~(((int) Runtime.getRuntime().freeMemory()) | (-25167874))) | 1008021636, 446, (((~((~0) | (-25856106))) | 688232) * 446) - 820357313, 306951472);
                                        int i263 = (c9 & 16) + (c9 | 16);
                                        int i264 = (i2 & i263) + (i263 | i2);
                                        int i265 = i264 << 13;
                                        int i266 = (i264 | i265) & (~(i264 & i265));
                                        int i267 = i266 >>> 17;
                                        int i268 = (i266 | i267) & (~(i266 & i267));
                                        ((int[]) objArr103[1])[0] = i268 ^ (i268 << 5);
                                        return objArr103;
                                    }
                                    try {
                                        int threadPriority2 = Process.getThreadPriority(0);
                                        Object[] objArr104 = new Object[1];
                                        c("壐枇墢⏤䐀\ue2ff찶⺹䢕㏒\udc24㻏碞\u0383\uec17จ栴", ((threadPriority2 ^ 20) + ((threadPriority2 & 20) << 1)) >> 6, objArr104);
                                        try {
                                            Object[] objArr105 = {(String) objArr104[0]};
                                            Object PngjBadSignature25 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                                            if (PngjBadSignature25 == null) {
                                                char minimumFlingVelocity2 = (char) (8752 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                int offsetBefore = 24 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0);
                                                int lastIndexOf3 = 335 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0);
                                                byte b48 = (byte) 0;
                                                byte b49 = (byte) (b48 + 1);
                                                Object[] objArr106 = new Object[1];
                                                a(b48, b49, (byte) (b49 | 14), objArr106);
                                                PngjBadSignature25 = com.d.e.a.PngjBadCrcException.PngjBadSignature(minimumFlingVelocity2, offsetBefore, lastIndexOf3, -598779726, false, (String) objArr106[0], new Class[]{cls});
                                            }
                                            String str37 = (String) ((Method) PngjBadSignature25).invoke(null, objArr105);
                                            if (str37 != null) {
                                                Object[] objArr107 = new Object[1];
                                                b(null, 126 - (~(-(ViewConfiguration.getTapTimeout() >> 16))), null, "\u0086\u0082\u0092\u0093\u0088\u0089\u0082\u0093\u0085\u009b\u0090", objArr107);
                                                String[] strArr7 = {(String) objArr107[0]};
                                                for (int i269 = 0; i269 <= 0; i269++) {
                                                    int i270 = PngjPrematureEnding;
                                                    int i271 = ((i270 | 99) << 1) - (i270 ^ 99);
                                                    PngjOutputException = i271 % 128;
                                                    if (i271 % 2 != 0) {
                                                        if ((str37.contains(strArr7[i269]) ? 'X' : 'D') == 'X') {
                                                            z3 = true;
                                                            break;
                                                        }
                                                    } else {
                                                        int i272 = 86 / 0;
                                                        if (str37.contains(strArr7[i269])) {
                                                            z3 = true;
                                                            break;
                                                        }
                                                    }
                                                }
                                                z3 = false;
                                            }
                                            int indexOf10 = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0');
                                            objArr2 = new Object[1];
                                            b(null, ((indexOf10 | 128) << 1) - (indexOf10 ^ 128), null, "\u0093\u0082\u0092\u0088\u0085\u0086\u0098\u008f\u008d\u0083\u0090\u0096\u008d\u0083\u0091\u008c\u0093\u008c", objArr2);
                                        } catch (Throwable th) {
                                            Throwable cause = th.getCause();
                                            if (cause != null) {
                                                throw new RuntimeException(cause);
                                            }
                                            throw new RuntimeException(th);
                                        }
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        Object[] objArr108 = {(String) objArr2[0]};
                                        Object PngjBadSignature26 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                                        if (PngjBadSignature26 == null) {
                                            char axisFromString2 = (char) (MotionEvent.axisFromString(BuildConfig.FLAVOR) + 8753);
                                            int makeMeasureSpec2 = 24 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                            int combineMeasuredStates = 336 - View.combineMeasuredStates(0, 0);
                                            byte b50 = (byte) 0;
                                            byte b51 = (byte) (b50 + 1);
                                            Object[] objArr109 = new Object[1];
                                            a(b50, b51, (byte) (b51 | 14), objArr109);
                                            PngjBadSignature26 = com.d.e.a.PngjBadCrcException.PngjBadSignature(axisFromString2, makeMeasureSpec2, combineMeasuredStates, -598779726, false, (String) objArr109[0], new Class[]{cls});
                                        }
                                        Object invoke7 = ((Method) PngjBadSignature26).invoke(null, objArr108);
                                        if (invoke7 != null) {
                                            int i273 = -((byte) KeyEvent.getModifierMetaStateMask());
                                            Object[] objArr110 = new Object[1];
                                            b(null, ((i273 | 126) << 1) - (i273 ^ 126), null, "\u0089\u0093\u008c\u0093\u0093\u008f\u0081", objArr110);
                                            if (invoke7.equals((String) objArr110[0])) {
                                                int i274 = -(KeyEvent.getMaxKeyCode() >> 16);
                                                Object[] objArr111 = new Object[1];
                                                b(null, (i274 ^ 127) + ((i274 & 127) << 1), null, "\u008d\u008d\u0088\u0090\u0090\u0085\u0098\u0091\u0082\u0082\u0081\u0083\u008d\u009b\u008d\u0083\u0091\u008d\u008c\u008d\u0081\u0088\u008e", objArr111);
                                                try {
                                                    Object[] objArr112 = {(String) objArr111[0]};
                                                    Object PngjBadSignature27 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                                                    if (PngjBadSignature27 == null) {
                                                        char alpha3 = (char) (Color.alpha(0) + 8752);
                                                        int edgeSlop2 = 24 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                        int capsMode2 = 336 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0);
                                                        byte b52 = (byte) 0;
                                                        byte b53 = (byte) (b52 + 1);
                                                        Object[] objArr113 = new Object[1];
                                                        a(b52, b53, (byte) (b53 | 14), objArr113);
                                                        PngjBadSignature27 = com.d.e.a.PngjBadCrcException.PngjBadSignature(alpha3, edgeSlop2, capsMode2, -598779726, false, (String) objArr113[0], new Class[]{cls});
                                                    }
                                                    String str38 = (String) ((Method) PngjBadSignature27).invoke(null, objArr112);
                                                    if (str38 != null && (parseInt = Integer.parseInt(str38)) != 0) {
                                                        int PngjBadCrcException8 = 0; /* decompiler artifact */
                                                        int i275 = -(-(parseInt * (-445)));
                                                        int i276 = (((-75650) | i275) << 1) - (i275 ^ (-75650));
                                                        int i277 = ~parseInt;
                                                        int i278 = ~(((-171) ^ i277) | ((-171) & i277));
                                                        int i279 = ~PngjBadCrcException8;
                                                        int i280 = -(-(((~((i277 & i279) | (i277 ^ i279))) | i278) * 446));
                                                        int i281 = (i276 & i280) + (i280 | i276);
                                                        int i282 = ~(((-171) ^ parseInt) | ((-171) & parseInt));
                                                        int i283 = ~parseInt;
                                                        int i284 = i283 | 170;
                                                        int i285 = ~((PngjBadCrcException8 & i284) | (i284 ^ PngjBadCrcException8));
                                                        int i286 = -(-(((i285 & i282) | (i282 ^ i285)) * 446));
                                                        i9 = (((i281 ^ i286) + ((i286 & i281) << 1)) - (~((~((i283 & (-171)) | ((-171) ^ i283))) * 446))) - 1;
                                                        /* IdentySdk.valueOf.PngjBadCrcException() - decompiler artifact */
                                                        if (i9 == 0) {
                                                            Object[] objArr114 = {new int[]{(i9 & i20) | ((~i9) & i)}, new int[1], null, new int[]{i}};
                                                            int startElapsedRealtime3 = (int) Process.getStartElapsedRealtime();
                                                            int i287 = (((~(startElapsedRealtime3 | (-379811878))) | (-654754097)) * 318) + (((~(379811877 | startElapsedRealtime3)) | 553943312) * (-318)) + ((((~((-100810785) | startElapsedRealtime3)) | (~((~startElapsedRealtime3) | 933755189))) * (-318)) - 1728121601);
                                                            int i288 = -(-((i287 ^ 16) + ((i287 & 16) << 1)));
                                                            int i289 = (i2 & i288) + (i288 | i2);
                                                            int i290 = (i289 << 13) ^ i289;
                                                            int i291 = i290 >>> 17;
                                                            int i292 = (i290 | i291) & (~(i290 & i291));
                                                            int i293 = i292 << 5;
                                                            ((int[]) objArr114[1])[0] = (i292 | i293) & (~(i292 & i293));
                                                            return objArr114;
                                                        }
                                                        int i294 = -TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0);
                                                        int i295 = (i294 ^ (-1)) + (i294 << 1);
                                                        Object[] objArr115 = new Object[1];
                                                        c("壐枇墢⏤䐀\ue2ff찶⺹䢕㏒\udc24㻏碞\u0383\uec17จ栴", i295, objArr115);
                                                        Object[] objArr116 = {(String) objArr115[0]};
                                                        Object PngjBadSignature28 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                                                        if (PngjBadSignature28 == null) {
                                                            char c10 = (char) (8753 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                                            int indexOf11 = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 25;
                                                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 336;
                                                            byte b54 = (byte) 0;
                                                            byte b55 = (byte) (b54 + 1);
                                                            Object[] objArr117 = new Object[1];
                                                            a(b54, b55, (byte) (b55 | 14), objArr117);
                                                            PngjBadSignature28 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c10, indexOf11, packedPositionGroup, -598779726, false, (String) objArr117[0], new Class[]{cls});
                                                        }
                                                        Object invoke8 = ((Method) PngjBadSignature28).invoke(null, objArr116);
                                                        if (invoke8 != null) {
                                                            Object[] objArr118 = new Object[1];
                                                            b(null, 127 - (~MotionEvent.axisFromString(BuildConfig.FLAVOR)), null, "\u0086\u0082\u0092\u0093\u0088\u0089\u0082\u0093\u0085\u009b\u0090", objArr118);
                                                            Object[] objArr119 = {invoke8, new String[]{(String) objArr118[0]}};
                                                            Object PngjBadSignature29 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-344601997);
                                                            if (PngjBadSignature29 == null) {
                                                                char pressedStateDuration2 = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 26716);
                                                                int fadingEdgeLength2 = 33 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                                                int i296 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1667;
                                                                byte b56 = (byte) 0;
                                                                byte b57 = (byte) (b56 + 1);
                                                                Object[] objArr120 = new Object[1];
                                                                a(b56, b57, (byte) (b57 | 14), objArr120);
                                                                PngjBadSignature29 = com.d.e.a.PngjBadCrcException.PngjBadSignature(pressedStateDuration2, fadingEdgeLength2, i296, 396011464, false, (String) objArr120[0], new Class[]{cls, String[].class});
                                                            }
                                                            long longValue18 = ((Long) ((Method) PngjBadSignature29).invoke(null, objArr119)).longValue();
                                                            long j123 = -761639184;
                                                            long j124 = ((-195) * longValue18) + ((-391) * j123);
                                                            long j125 = longValue18 ^ j9;
                                                            long myUid5 = (longValue18 | Process.myUid()) ^ j9;
                                                            long j126 = ((196 * ((((j123 ^ j9) | j125) ^ j9) | myUid5)) + ((392 * (j123 | longValue18)) + (((-196) * (((j125 | j123) ^ j9) | myUid5)) + j124))) - 924953037;
                                                            int maxMemory3 = (int) Runtime.getRuntime().maxMemory();
                                                            int i297 = ~maxMemory3;
                                                            int i298 = ((int) (j126 >> 32)) & ((((~((-1209466708) | maxMemory3)) | (~(i297 | 1209466707)) | (~(1648274177 | maxMemory3))) * 959) + (((~(1209466707 | maxMemory3)) | (~(1648274177 | i297)) | (~(i297 | (-1209466708)))) * 959) + 1470682389);
                                                            int myPid6 = Process.myPid();
                                                            int i299 = ((int) j126) & (((myPid6 | (-67113477)) * 465) + ((1664306249 | (~((-1193434637) | myPid6))) * 930) + (((~(1664306249 | myPid6)) | (-1193434637)) * (-465)) + 344831319);
                                                            if (!(((i298 & i299) | (i298 ^ i299)) == 1)) {
                                                                int i300 = -TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0);
                                                                int i301 = (i300 ^ 127) + ((i300 & 127) << 1);
                                                                Object[] objArr121 = new Object[1];
                                                                b(null, i301, null, "\u009a\u008a\u0085\u0090\u0082\u008a\u009a\u0085\u0091\u0085\u0086\u009a", objArr121);
                                                                String str39 = (String) objArr121[0];
                                                                int i302 = -TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0');
                                                                int i303 = (i302 ^ (-1)) + (i302 << 1);
                                                                Object[] objArr122 = new Object[1];
                                                                c("즜躻즳쫓閍ﴂᷴㅒ\ud9cd\udaa8ඩℹ\ue99f\ueab6㶙ᆩ葉祈ⵋƙ", i303, objArr122);
                                                                String str40 = (String) objArr122[0];
                                                                Object[] objArr123 = new Object[1];
                                                                c("렽\udcf0렒题ꗐ쾬ⶩϼꡬ裣㷴᎗頾룽හ⌇裕ꠎᴑ㍶\uf8d2", ViewConfiguration.getTouchSlop() >> 8, objArr123);
                                                                String str41 = (String) objArr123[0];
                                                                Object[] objArr124 = new Object[1];
                                                                c("⟐梒⟿Ⳮ뽳\uf658㜉㨕㞎㲁", (-2) - ((-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))) ^ (-1)), objArr124);
                                                                String str42 = (String) objArr124[0];
                                                                int resolveSize2 = View.resolveSize(0, 0);
                                                                int PngjBadCrcException9 = 0; /* decompiler artifact */
                                                                int i304 = resolveSize2 * 905;
                                                                int i305 = (i304 & (-114681)) + (i304 | (-114681));
                                                                int i306 = ~resolveSize2;
                                                                int i307 = ~((i306 ^ PngjBadCrcException9) | (i306 & PngjBadCrcException9));
                                                                int i308 = ~PngjBadCrcException9;
                                                                int i309 = ~((i308 ^ 127) | (i308 & 127));
                                                                int i310 = (((i307 ^ i309) | (i307 & i309)) * (-1808)) + i305;
                                                                int i311 = (i306 ^ (-128)) | (i306 & (-128));
                                                                int i312 = ~((i311 & PngjBadCrcException9) | (i311 ^ PngjBadCrcException9));
                                                                int i313 = ~PngjBadCrcException9;
                                                                int i314 = (i313 ^ resolveSize2) | (i313 & resolveSize2);
                                                                int i315 = ~((i314 ^ 127) | (i314 & 127));
                                                                int i316 = -(-(((i312 ^ i315) | (i312 & i315)) * 904));
                                                                int i317 = (i310 & i316) + (i310 | i316);
                                                                int i318 = ~((i306 & 127) | (i306 ^ 127));
                                                                int i319 = ~((-128) | PngjBadCrcException9);
                                                                int i320 = -(-(((~((resolveSize2 & i308) | (i308 ^ resolveSize2))) | (i319 & i318) | (i318 ^ i319)) * 904));
                                                                int i321 = (i317 & i320) + (i320 | i317);
                                                                Object[] objArr125 = new Object[1];
                                                                b(null, i321, null, "\u009a\u0093\u008c\u0094\u009a\u0092\u0088\u0091\u008d\u009b\u008d\u009a", objArr125);
                                                                String str43 = (String) objArr125[0];
                                                                int offsetAfter2 = TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0);
                                                                int i322 = (offsetAfter2 ^ 127) + ((offsetAfter2 & 127) << 1);
                                                                Object[] objArr126 = new Object[1];
                                                                b(null, i322, null, "\u009a\u0091\u009c\u0088\u0083\u009a\u0093\u008c\u0094\u009a\u0092\u0088\u0091\u008d\u009b\u008d\u009a", objArr126);
                                                                String str44 = (String) objArr126[0];
                                                                int i323 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                                                int i324 = (i323 & 127) + (i323 | 127);
                                                                Object[] objArr127 = new Object[1];
                                                                b(null, i324, null, "\u009a\u0088\u008b\u0085\u008d\u008a\u008c\u0085\u008b\u009a\u0093\u008c\u0094\u009a\u0092\u0088\u0091\u008d\u009b\u008d\u009a", objArr127);
                                                                String str45 = (String) objArr127[0];
                                                                int i325 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                                int i326 = (i325 ^ 126) + ((i325 & 126) << 1);
                                                                Object[] objArr128 = new Object[1];
                                                                b(null, i326, null, "\u009a\u0093\u008c\u0094\u009c\u009a\u0086\u008d\u009a\u0092\u0088\u0091\u008d\u009b\u008d\u009a", objArr128);
                                                                String str46 = (String) objArr128[0];
                                                                int i327 = -AndroidCharacter.getMirror('0');
                                                                int i328 = (i327 ^ 175) + ((i327 & 175) << 1);
                                                                Object[] objArr129 = new Object[1];
                                                                b(null, i328, null, "\u009a\u0091\u0082\u0082\u0081\u009d\u0086\u0088\u0088\u0093\u009d\u0088\u0087\u009a\u0081\u008d\u008f\u009a\u0092\u0088\u0091\u008d\u009b\u008d\u009a", objArr129);
                                                                String str47 = (String) objArr129[0];
                                                                Object[] objArr130 = new Object[1];
                                                                b(null, 126 - (~(ViewConfiguration.getScrollBarSize() >> 8)), null, "\u009a\u0093\u008c\u0094\u009c\u009a\u0092\u0088\u0091\u008d\u009b\u008d\u009a", objArr130);
                                                                String str48 = (String) objArr130[0];
                                                                int size2 = View.MeasureSpec.getSize(0);
                                                                int i329 = (size2 ^ 127) + ((size2 & 127) << 1);
                                                                Object[] objArr131 = new Object[1];
                                                                b(null, i329, null, "\u009a\u0093\u008c\u0094\u009a\u0081\u008d\u008f\u009a", objArr131);
                                                                String str49 = (String) objArr131[0];
                                                                Object[] objArr132 = new Object[1];
                                                                c("鷨枘鷇⏧唍\ue17f\udd60\u2d74趺㏍촫㴄", ViewConfiguration.getTouchSlop() >> 8, objArr132);
                                                                String[] strArr8 = {str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, (String) objArr132[0]};
                                                                int i330 = 0;
                                                                while (i330 < 12) {
                                                                    StringBuilder sb = new StringBuilder();
                                                                    sb.append(strArr8[i330]);
                                                                    Object[] objArr133 = new Object[1];
                                                                    c("瞽캱矎諈칳儝", '0' - AndroidCharacter.getMirror('0'), objArr133);
                                                                    sb.append((String) objArr133[0]);
                                                                    Object[] objArr134 = {sb.toString()};
                                                                    Object PngjBadSignature30 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1934049891);
                                                                    if (PngjBadSignature30 == null) {
                                                                        char size3 = (char) View.MeasureSpec.getSize(0);
                                                                        int indexOf12 = 28 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0);
                                                                        int argb4 = Color.argb(0, 0, 0, 0) + 1447;
                                                                        byte b58 = (byte) 2;
                                                                        byte b59 = (byte) (b58 - 2);
                                                                        strArr2 = strArr8;
                                                                        i15 = i330;
                                                                        Object[] objArr135 = new Object[1];
                                                                        a(b58, b59, b59, objArr135);
                                                                        PngjBadSignature30 = com.d.e.a.PngjBadCrcException.PngjBadSignature(size3, indexOf12, argb4, -1884803112, false, (String) objArr135[0], new Class[]{cls});
                                                                    } else {
                                                                        strArr2 = strArr8;
                                                                        i15 = i330;
                                                                    }
                                                                    long longValue19 = ((Long) ((Method) PngjBadSignature30).invoke(null, objArr134)).longValue();
                                                                    long j127 = -1150614791;
                                                                    long j128 = ((-932) * longValue19) + (934 * j127);
                                                                    long j129 = longValue19 ^ j9;
                                                                    long elapsedRealtime2 = ((int) SystemClock.elapsedRealtime()) ^ j9;
                                                                    long j130 = ((-933) * (j129 | (((j127 ^ j9) | elapsedRealtime2) ^ j9))) + j128;
                                                                    long j131 = 933;
                                                                    long j132 = ((j131 * ((j127 | longValue19) ^ j9)) + (((((j129 | elapsedRealtime2) ^ j9) | ((j129 | j127) ^ j9)) * j131) + j130)) - 566302476;
                                                                    int i331 = ((int) (j132 >> 32)) & (((~((-168893597) | i)) * 113) + (((~((-1268332815) | i)) | 1099440386 | (~(i20 | (-1169)))) * (-113)) + ((((~((-168893597) | i20)) | 1268332814) * 226) - 2055567968));
                                                                    int i332 = ~((int) Runtime.getRuntime().maxMemory());
                                                                    int i333 = ((int) j132) & ((((~((-540817881) | i332)) | 1978044290) * 68) + ((~(1979629530 | i332)) * (-68)) + ((((~(0 | 540817880)) | ((~((-1585241) | i332)) | 1438811650)) * (-68)) - 921162199));
                                                                    if (((i331 & i333) | (i331 ^ i333)) != 0) {
                                                                        i10 = ((i15 | 110) << 1) - (i15 ^ 110);
                                                                        break;
                                                                    }
                                                                    i330 = i15 + 1;
                                                                    strArr8 = strArr2;
                                                                }
                                                            }
                                                        }
                                                        i10 = 0;
                                                        if (i10 != 0) {
                                                            Object[] objArr136 = {new int[]{(i10 | i) & (~(i & i10))}, new int[]{(0 | 0) & (~(0 & 0))}, null, new int[]{i}};
                                                            int i334 = (((~((-838155228) | i20)) | 809566849) * (-964)) + (((~((-838155228) | i)) | (-196410747)) * (-964)) + 1200954069;
                                                            int i335 = ~i334;
                                                            int i336 = ~(((-17) ^ i335) | ((-17) & i335) | i7);
                                                            int i337 = ~((i334 ^ i) | (i334 & i));
                                                            int i338 = (((i336 & i337) | (i336 ^ i337)) * 520) + ((i334 * 521) - 8304);
                                                            int i339 = ~i334;
                                                            int i340 = ~((i339 & i7) | (i339 ^ i7));
                                                            int i341 = i | 16;
                                                            int i342 = ~i341;
                                                            int i343 = (i338 - (~(-(-(((i340 & i342) | (i340 ^ i342)) * (-1040)))))) - 1;
                                                            int i344 = ~(((-17) ^ i7) | ((-17) & i7));
                                                            int i345 = ~((i335 & 16) | (i335 ^ 16));
                                                            int i346 = (i344 & i345) | (i344 ^ i345);
                                                            int i347 = ~i341;
                                                            int i348 = ((i346 & i347) | (i346 ^ i347)) * 520;
                                                            int i349 = -(-(((i343 | i348) << 1) - (i348 ^ i343)));
                                                            int i350 = ((i2 | i349) << 1) - (i349 ^ i2);
                                                            int i351 = i350 << 13;
                                                            int i352 = (i351 | i350) & (~(i350 & i351));
                                                            int i353 = i352 >>> 17;
                                                            int i354 = ((~i352) & i353) | ((~i353) & i352);
                                                            int i355 = i354 << 5;
                                                            return objArr136;
                                                        }
                                                        long[] jArr = {472001035};
                                                        Object[] objArr137 = new Object[1];
                                                        c("\udc6f꽎\udc40\ueb32⡮ﻎꀄ㊅찼ﭝ끕⋿ﱣ쭄耹ሧ\uec90\udba7邨Ȏ鳜", 0 - (~(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))), objArr137);
                                                        Object[] objArr138 = {(String) objArr137[0], 5, 1073741823L, jArr};
                                                        Object PngjBadSignature31 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1000971846);
                                                        if (PngjBadSignature31 == null) {
                                                            char indexOf13 = (char) ((-1) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'));
                                                            int myTid7 = (Process.myTid() >> 22) + 35;
                                                            int red3 = Color.red(0) + 1313;
                                                            byte b60 = (byte) 0;
                                                            byte b61 = (byte) (b60 + 1);
                                                            Object[] objArr139 = new Object[1];
                                                            a(b60, b61, (byte) (b61 | 14), objArr139);
                                                            PngjBadSignature31 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf13, myTid7, red3, 951651329, false, (String) objArr139[0], new Class[]{cls, cls2, Long.TYPE, long[].class});
                                                        }
                                                        long longValue20 = ((Long) ((Method) PngjBadSignature31).invoke(null, objArr138)).longValue();
                                                        long j133 = 1738395101;
                                                        long j134 = ((-463) * longValue20) + (465 * j133);
                                                        long j135 = 464;
                                                        long j136 = longValue20 ^ j9;
                                                        long elapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                                                        long j137 = elapsedRealtime3 ^ j9;
                                                        long j138 = (j136 | j133) ^ j9;
                                                        long j139 = ((j135 * (j138 | ((j133 | elapsedRealtime3) ^ j9))) + (((-464) * ((elapsedRealtime3 | (j133 ^ j9)) | j136)) + ((((((j136 | j137) ^ j9) | j138) | ((j137 | j133) ^ j9)) * j135) + j134))) - 1918239270;
                                                        int i356 = ((int) (j139 >> 32)) & ((((~((-669274289) | i)) | 633602224 | (~(803624186 | i20))) * 521) + ((767952122 | i) * 521) + (((~(i20 | 767952122)) | 669274288) * (-1042)) + 1565682448);
                                                        int i357 = ((int) j139) & ((((~((~defpackage.a.a()) | 1266097029)) | (-1591643857)) * 783) + (((~((-344491089) | 0)) * (-783)) - 720602220));
                                                        if (((i356 & i357) | (i356 ^ i357)) != 0) {
                                                            i11 = 240;
                                                        } else {
                                                            int PngjBadCrcException10 = 0; /* decompiler artifact */
                                                            int i358 = (-1672955879) - (~(((-1006607068) | PngjBadCrcException10) * 988));
                                                            int i359 = ~PngjBadCrcException10;
                                                            int i360 = ~(((-962169491) & i359) | (i359 ^ (-962169491)));
                                                            int i361 = ((i360 & 268960256) | (268960256 ^ i360)) * (-1976);
                                                            int i362 = (i358 & i361) + (i358 | i361);
                                                            int i363 = ((~((PngjBadCrcException10 & (-313397834)) | ((-313397834) ^ PngjBadCrcException10))) | (-1006607068) | (~((i359 & 313397833) | (i359 ^ 313397833)))) * 988;
                                                            int i364 = (i362 & i363) + (i363 | i362);
                                                            int PngjBadCrcException11 = 0; /* decompiler artifact */
                                                            int i365 = -(-(((~(((-779977322) ^ PngjBadCrcException11) | ((-779977322) & PngjBadCrcException11))) | 1653644926) * 56));
                                                            int i366 = ((-807077964) & i365) + (i365 | (-807077964));
                                                            int i367 = ((i366 | 1210580936) << 1) - (1210580936 ^ i366);
                                                            int i368 = ~PngjBadCrcException11;
                                                            int i369 = ~((i368 & 1653644926) | (i368 ^ 1653644926));
                                                            int i370 = -(-(((i369 & (-779977322)) | ((-779977322) ^ i369)) * 56));
                                                            i11 = i364 > (i367 ^ i370) + ((i370 & i367) << 1) ? 1 : 0;
                                                        }
                                                        if ((i11 != 0 ? '[' : 'E') == '[') {
                                                            Object[] objArr140 = {new int[]{(i11 | i) & (~(i & i11))}, new int[1], null, new int[]{i}};
                                                            int elapsedRealtime4 = (int) SystemClock.elapsedRealtime();
                                                            int i371 = (((~(elapsedRealtime4 | (-812148572))) | (~((~elapsedRealtime4) | 222417402))) * 979) + ((elapsedRealtime4 | 222417402) * (-979)) + (((~((-812148572) | 0)) * 979) - 786630814);
                                                            int i372 = (i371 & 16) + (i371 | 16) + i2;
                                                            int i373 = i372 << 13;
                                                            int i374 = (i373 | i372) & (~(i372 & i373));
                                                            int i375 = i374 >>> 17;
                                                            int i376 = ((~i374) & i375) | ((~i375) & i374);
                                                            ((int[]) objArr140[1])[0] = i376 ^ (i376 << 5);
                                                            return objArr140;
                                                        }
                                                        long[] jArr2 = {472001035};
                                                        int i377 = -TextUtils.getTrimmedLength(BuildConfig.FLAVOR);
                                                        int i378 = (i377 ^ 127) + ((i377 & 127) << 1);
                                                        Object[] objArr141 = new Object[1];
                                                        b(null, i378, null, "\u009b\u0090\u008c\u008a\u0082\u008e\u009a\u009c\u008f\u0093\u008c\u008a\u0088\u008d\u009a\u008d\u008b\u009a\u008d\u009b\u008d\u009a", objArr141);
                                                        try {
                                                            bufferedInputStream2 = new BufferedInputStream(new FileInputStream((String) objArr141[0]));
                                                            j4 = 0;
                                                        } catch (IOException unused2) {
                                                            bufferedInputStream2 = null;
                                                        } catch (Throwable th2) {
                                                            bufferedInputStream = null;
                                                            throw new RuntimeException(th2);
                                                        }
                                                        loop4: while (true) {
                                                            try {
                                                                int read = bufferedInputStream2.read();
                                                                if (read != i18) {
                                                                    j4 = ((j4 << 5) ^ read) & 1073741823;
                                                                    int i379 = 0;
                                                                    while (i379 < 1) {
                                                                        if (!(j4 != jArr2[i379])) {
                                                                            int i380 = (-662) - (~(i379 * (-661)));
                                                                            int i381 = ~i379;
                                                                            int i382 = ~(((-2) ^ i381) | ((-2) & i381));
                                                                            int i383 = -(-(((i382 & i20) | (i20 ^ i382)) * 1324));
                                                                            int i384 = (i380 & i383) + (i380 | i383);
                                                                            int i385 = ~(i | 1);
                                                                            int i386 = ~((i379 ^ i) | (i379 & i));
                                                                            int i387 = ((i385 & i386) | (i385 ^ i386)) * (-1324);
                                                                            int i388 = (i384 & i387) + (i387 | i384);
                                                                            int i389 = ~(((-2) ^ i379) | ((-2) & i379));
                                                                            int i390 = ~((i381 & 1) | (i381 ^ 1));
                                                                            i12 = (i388 - (~(-(-(((i389 & i390) | (i389 ^ i390)) * 662))))) - 1;
                                                                            try {
                                                                                bufferedInputStream2.close();
                                                                                break loop4;
                                                                            } catch (Exception unused3) {
                                                                            }
                                                                        } else {
                                                                            i379 = (i379 | 1) + (i379 & 1);
                                                                            int i391 = PngjPrematureEnding;
                                                                            PngjOutputException = (((i391 | 77) << 1) - (i391 ^ 77)) % 128;
                                                                        }
                                                                    }
                                                                    i18 = -1;
                                                                }
                                                            } catch (IOException unused4) {
                                                            } catch (Throwable th3) {
                                                                bufferedInputStream = bufferedInputStream2;
                                                                if (bufferedInputStream != null) {
                                                                    try {
                                                                        bufferedInputStream.close();
                                                                    } catch (Exception unused5) {
                                                                    }
                                                                }
                                                                throw new RuntimeException(th3);
                                                            }
                                                            try {
                                                                bufferedInputStream2.close();
                                                                break;
                                                            } catch (Exception unused6) {
                                                            }
                                                        }
                                                        i12 = 0;
                                                        if (i12 != 0) {
                                                            Object[] objArr142 = {new int[]{(i & (-243)) | (i20 & 242)}, new int[1], null, new int[]{i}};
                                                            int maxMemory4 = (int) Runtime.getRuntime().maxMemory();
                                                            int i392 = (((~(maxMemory4 | (-392434495))) | 105120278 | (~((~maxMemory4) | 929445695))) * 164) + ((642131479 | maxMemory4) * 164) + ((((~(392434494 | 0)) | 642131479) * (-328)) - 964801447);
                                                            int i393 = (i392 & 16) + (i392 | 16);
                                                            int i394 = ((i2 | i393) << 1) - (i2 ^ i393);
                                                            int i395 = i394 ^ (i394 << 13);
                                                            int i396 = i395 >>> 17;
                                                            int i397 = ((~i395) & i396) | ((~i396) & i395);
                                                            ((int[]) objArr142[1])[0] = i397 ^ (i397 << 5);
                                                            return objArr142;
                                                        }
                                                        Object PngjBadSignature32 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1372235840);
                                                        if (PngjBadSignature32 == null) {
                                                            char c11 = (char) (23943 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                                            int deadChar2 = 24 - KeyEvent.getDeadChar(0, 0);
                                                            int indexOf14 = 312 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0);
                                                            byte b62 = (byte) ($$b & 3);
                                                            byte b63 = b62;
                                                            Object[] objArr143 = new Object[1];
                                                            a(b62, b63, (byte) (b63 | 10), objArr143);
                                                            PngjBadSignature32 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c11, deadChar2, indexOf14, 1390033531, false, (String) objArr143[0], new Class[0]);
                                                        }
                                                        long longValue21 = ((Long) ((Method) PngjBadSignature32).invoke(null, null)).longValue();
                                                        long j140 = -219637494;
                                                        long j141 = ((-215) * longValue21) + (j106 * j140);
                                                        long j142 = 216;
                                                        long myPid7 = Process.myPid();
                                                        long j143 = (((j140 | myPid7) ^ j9) * j142) + j141;
                                                        long j144 = j140 | (longValue21 ^ j9);
                                                        long j145 = myPid7 ^ j9;
                                                        long j146 = (j142 * (longValue21 | ((j145 | j140) ^ j9))) + (j104 * (j144 | j145)) + j143 + 366552220;
                                                        int i398 = ((int) (j146 >> 32)) & ((((~((-521137441) | i)) | (~((-916088971) | i20)) | (~(916088970 | i))) * 959) + (((((~((-521137441) | i20)) | (~((-916088971) | i))) | (~(i20 | 916088970))) * 959) - 995180183));
                                                        int myUid6 = Process.myUid();
                                                        int i399 = ((int) j146) & ((((~myUid6) | (-30693389)) * 756) + (((~((-30693389) | myUid6)) | (-1406533022)) * (-756)) + 2105063969);
                                                        if (((i398 & i399) | (i398 ^ i399)) != 0) {
                                                            objArr = new Object[]{new int[]{0}, new int[1], null, new int[]{i}};
                                                            int i400 = (~(i & 264)) & (i | 264);
                                                            int startElapsedRealtime4 = (int) Process.getStartElapsedRealtime();
                                                            int i401 = (i2 - (~defpackage.a.A((~((~startElapsedRealtime4) | 715429610)) | 285286401, 560, ((~(startElapsedRealtime4 | (-681579649))) * (-560)) + (((~(319136363 | 0)) * (-560)) - 379515099), -16))) - 1;
                                                            int i402 = i401 ^ (i401 << 13);
                                                            int i403 = i402 >>> 17;
                                                            int i404 = (i402 | i403) & (~(i402 & i403));
                                                            int i405 = i404 << 5;
                                                            i14 = 0;
                                                            ((int[]) objArr[1])[0] = ((~i404) & i405) | ((~i405) & i404);
                                                        } else {
                                                            Object PngjBadSignature33 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-40521023);
                                                            if (PngjBadSignature33 == null) {
                                                                char rgb3 = (char) (Color.rgb(0, 0, 0) + 16777216);
                                                                int blue4 = Color.blue(0) + 28;
                                                                int combineMeasuredStates2 = 1855 - View.combineMeasuredStates(0, 0);
                                                                byte b64 = (byte) 0;
                                                                byte b65 = (byte) (b64 + 1);
                                                                Object[] objArr144 = new Object[1];
                                                                a(b64, b65, (byte) (b65 | 14), objArr144);
                                                                PngjBadSignature33 = com.d.e.a.PngjBadCrcException.PngjBadSignature(rgb3, blue4, combineMeasuredStates2, 24829818, false, (String) objArr144[0], new Class[0]);
                                                            }
                                                            long longValue22 = ((Long) ((Method) PngjBadSignature33).invoke(null, null)).longValue();
                                                            long j147 = 623589144;
                                                            long j148 = (434 * longValue22) + ((-432) * j147);
                                                            long j149 = 433;
                                                            long j150 = j147 ^ j9;
                                                            long a2 = defpackage.a.a();
                                                            long j151 = ((j149 * (((j150 | a2) ^ j9) | ((j147 | longValue22) ^ j9))) + ((j103 * (j150 | (((longValue22 ^ j9) | a2) ^ j9))) + (((((j150 | (a2 ^ j9)) | longValue22) ^ j9) * j149) + j148))) - 1370955165;
                                                            if (!(((((int) (j151 >> 32)) & ((((~(2024250979 | i20)) | ((~(587024568 | i20)) | (-2063589116))) * 50) + ((((~((-1476564548) | i)) | (~(2063589115 | i20))) * 50) + (((2024250979 | i) * (-50)) + (-1142982366))))) | (((int) j151) & (((2028041493 | (~(829699392 | i20))) * 56) + ((((~(2028041493 | i)) | 829699392) * 56) + 357175949)))) == 0)) {
                                                                int i406 = (PngjOutputException + 89) % 128;
                                                                PngjPrematureEnding = i406;
                                                                i13 = i ^ 281;
                                                                PngjOutputException = (((i406 | 101) << 1) - (i406 ^ 101)) % 128;
                                                            } else {
                                                                i13 = i;
                                                            }
                                                            if ((i13 != i ? 'C' : 'a') != 'C') {
                                                                Object PngjBadSignature34 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-792668357);
                                                                if (PngjBadSignature34 == null) {
                                                                    char blue5 = (char) (30094 - Color.blue(0));
                                                                    int indexOf15 = 44 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0);
                                                                    int i407 = 1811 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                                    byte b66 = (byte) ($$b & 3);
                                                                    byte b67 = b66;
                                                                    Object[] objArr145 = new Object[1];
                                                                    a(b66, b67, (byte) (b67 | 10), objArr145);
                                                                    PngjBadSignature34 = com.d.e.a.PngjBadCrcException.PngjBadSignature(blue5, indexOf15, i407, 741325440, false, (String) objArr145[0], new Class[0]);
                                                                }
                                                                long longValue23 = ((Long) ((Method) PngjBadSignature34).invoke(null, null)).longValue();
                                                                long j152 = -653193078;
                                                                long j153 = -721;
                                                                long j154 = (j153 * longValue23) + (j153 * j152);
                                                                long startElapsedRealtime5 = (int) Process.getStartElapsedRealtime();
                                                                long j155 = j152 ^ j9;
                                                                long j156 = longValue23 ^ j9;
                                                                long j157 = (j152 | longValue23) ^ j9;
                                                                long j158 = (722 * (((j156 | j152) ^ j9) | ((j155 | longValue23) ^ j9))) + ((-1444) * (j157 | ((j152 | startElapsedRealtime5) ^ j9) | ((longValue23 | startElapsedRealtime5) ^ j9))) + (1444 * ((startElapsedRealtime5 ^ j9) | ((j155 | j156) ^ j9) | j157)) + j154 + 1008927622;
                                                                int i408 = (((~((-1258033683) | i20)) | 10748432) * (-1188)) + 294316640;
                                                                int i409 = 10748432 | (~(1258033682 | i));
                                                                int i410 = ~((-1599707203) | i20);
                                                                int i411 = ((int) (j158 >> 32)) & ((((~(1258033682 | i20)) | 352421952 | i410) * 594) + ((i409 | i410) * 594) + i408);
                                                                int c12 = ((int) j158) & defpackage.a.c((~((-536903714) | i20)) | 156312968, 576, (((~((-1619165816) | i)) | 1082262102) * 576) + 1771465493, 612712832);
                                                                if (!(((i411 & c12) | (i411 ^ c12)) != 0)) {
                                                                    Object PngjBadSignature35 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-25572490);
                                                                    if (PngjBadSignature35 == null) {
                                                                        char tapTimeout = (char) (30094 - (ViewConfiguration.getTapTimeout() >> 16));
                                                                        int offsetBefore2 = TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 45;
                                                                        int defaultSize = View.getDefaultSize(0, 0) + 1810;
                                                                        byte b68 = (byte) 0;
                                                                        byte b69 = (byte) (b68 + 1);
                                                                        Object[] objArr146 = new Object[1];
                                                                        a(b68, b69, (byte) (b69 | 14), objArr146);
                                                                        PngjBadSignature35 = com.d.e.a.PngjBadCrcException.PngjBadSignature(tapTimeout, offsetBefore2, defaultSize, 43427533, false, (String) objArr146[0], new Class[0]);
                                                                    }
                                                                    long longValue24 = ((Long) ((Method) PngjBadSignature35).invoke(null, null)).longValue();
                                                                    long j159 = -213987142;
                                                                    long j160 = (521 * longValue24) + ((-519) * j159);
                                                                    long j161 = 520;
                                                                    long j162 = j159 ^ j9;
                                                                    long j163 = longValue24 ^ j9;
                                                                    long elapsedRealtime5 = (int) SystemClock.elapsedRealtime();
                                                                    long j164 = elapsedRealtime5 ^ j9;
                                                                    long j165 = (((((j162 | j163) | j164) ^ j9) | ((longValue24 | elapsedRealtime5) ^ j9)) * j161) + j160;
                                                                    long j166 = (elapsedRealtime5 | j159) ^ j9;
                                                                    long j167 = ((j161 * (j166 | (((j162 | j164) ^ j9) | ((j163 | j159) ^ j9)))) + (((-1040) * (((j163 | j164) ^ j9) | j166)) + j165)) - 1384251644;
                                                                    int freeMemory = (int) Runtime.getRuntime().freeMemory();
                                                                    int i412 = ((int) (j167 >> 32)) & ((((~((~freeMemory) | (-1202522715))) | 1655218170) * 168) + (((~((-1202522715) | freeMemory)) | 1118308954) * (-168)) + (((~(1655218170 | freeMemory)) | (-1739431931)) * 336) + 501358106);
                                                                    int i413 = (~((-1438102715) | i)) | (~(1419638171 | i20));
                                                                    int i414 = ((int) j167) & (((540929 | (~(1438102714 | i20))) * 516) + (((~((-1419097243) | i)) | (~((-540930) | i20))) * 516) + (((i413 | 0) * (-516)) - 499456815));
                                                                    if (((i412 & i414) | (i412 ^ i414)) != 0) {
                                                                        PngjOutputException = (PngjPrematureEnding + 45) % 128;
                                                                        objArr = new Object[]{new int[]{0}, new int[1], null, new int[]{i}};
                                                                        int i415 = (~(i & 266)) & (i | 266);
                                                                        int c13 = defpackage.a.c((~((~((int) Process.getStartElapsedRealtime())) | 392189072)) | 642376901, 56, (((~(0 | 642376901)) | 392189072) * 56) - 543474291, i5);
                                                                        int PngjBadCrcException12 = 0; /* decompiler artifact */
                                                                        int i416 = (i2 * 370) + (c13 * 370);
                                                                        int i417 = c13 | i2;
                                                                        int i418 = ~PngjBadCrcException12;
                                                                        int i419 = -(-(((i417 & i418) | (i417 ^ i418)) * (-369)));
                                                                        int i420 = (i416 ^ i419) + ((i419 & i416) << 1);
                                                                        int i421 = ~c13;
                                                                        int i422 = ~((i421 ^ i418) | (i421 & i418));
                                                                        int i423 = (((i422 & i2) | (i2 ^ i422)) * (-369)) + i420;
                                                                        int i424 = ~i2;
                                                                        int i425 = (~(c13 | PngjBadCrcException12)) | (~((i424 & c13) | (i424 ^ c13)));
                                                                        int i426 = (i421 ^ i418) | (i421 & i418);
                                                                        int i427 = ~((i426 & i2) | (i426 ^ i2));
                                                                        int i428 = ((i425 & i427) | (i425 ^ i427)) * 369;
                                                                        int i429 = (i423 ^ i428) + ((i428 & i423) << 1);
                                                                        int i430 = i429 << 13;
                                                                        int i431 = (i430 | i429) & (~(i429 & i430));
                                                                        int i432 = i431 >>> 17;
                                                                        int i433 = (i431 | i432) & (~(i431 & i432));
                                                                        int i434 = i433 << 5;
                                                                        ((int[]) objArr[1])[0] = (i433 | i434) & (~(i433 & i434));
                                                                    } else {
                                                                        Object PngjBadSignature36 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-2091466614);
                                                                        if (PngjBadSignature36 == null) {
                                                                            char edgeSlop3 = (char) (45717 - (ViewConfiguration.getEdgeSlop() >> 16));
                                                                            int green = Color.green(0) + 40;
                                                                            int green2 = Color.green(0) + 625;
                                                                            byte b70 = (byte) ($$b & 3);
                                                                            byte b71 = b70;
                                                                            Object[] objArr147 = new Object[1];
                                                                            a(b70, b71, (byte) (b71 | 10), objArr147);
                                                                            PngjBadSignature36 = com.d.e.a.PngjBadCrcException.PngjBadSignature(edgeSlop3, green, green2, 2142874929, false, (String) objArr147[0], new Class[0]);
                                                                        }
                                                                        long longValue25 = ((Long) ((Method) PngjBadSignature36).invoke(null, null)).longValue();
                                                                        long j168 = 1064132156;
                                                                        long j169 = ((-657) * longValue25) + (659 * j168);
                                                                        long j170 = ((j168 ^ j9) | longValue25) ^ j9;
                                                                        long j171 = ((longValue25 ^ j9) | j168) ^ j9;
                                                                        long j172 = (j168 | j3) ^ j9;
                                                                        long j173 = ((-658) * (j170 | j171 | j172)) + j169;
                                                                        long j174 = 658;
                                                                        long j175 = (j174 * (j171 | j172)) + (j174 * j171) + j173 + 272671126;
                                                                        int i435 = ((int) (j175 >> 32)) & ((((~(553275031 | i)) | (-1996418776) | (~(1990501442 | i))) * 407) + (((~((-553275032) | i)) | (~((-1990501443) | i20)) | (-1996418776)) * 407) + (((547357698 | 0) * (-814)) - 783195672));
                                                                        int i436 = ((int) j175) & ((((~((-1387867044) | i20)) | (~(49359366 | i20)) | 1342701985) * 50) + (((~(1392061351 | i)) | (~((-1342701986) | i20))) * 50) + (((-1387867044) | i) * (-50)) + 356866475);
                                                                        if (((i435 & i436) | (i435 ^ i436)) != 0) {
                                                                            objArr = new Object[]{new int[]{i ^ 280}, new int[1], null, new int[]{i}};
                                                                            int myUid7 = Process.myUid();
                                                                            int i437 = ~myUid7;
                                                                            int i438 = ~(589534298 | i437);
                                                                            int i439 = (((-445031676) | i438) * 712) + (((~(myUid7 | 1000846587)) | (~(i437 | (-411312290)))) * (-712)) + ((411312289 | i438) * (-712)) + 1227913501;
                                                                            int i440 = (i2 - (~(-(-((i439 & 16) + (i439 | 16)))))) - 1;
                                                                            int i441 = i440 << 13;
                                                                            int i442 = ((~i440) & i441) | ((~i441) & i440);
                                                                            int i443 = i442 >>> 17;
                                                                            int i444 = ((~i442) & i443) | ((~i443) & i442);
                                                                            int i445 = i444 << 5;
                                                                            ((int[]) objArr[1])[0] = ((~i444) & i445) | ((~i445) & i444);
                                                                            i14 = 0;
                                                                        } else {
                                                                            objArr = new Object[]{new int[]{i}, new int[]{((~0) & 0) | ((~0) & 0)}, null, new int[]{i}};
                                                                            int i446 = -(-((((~((-71839810) | i)) | 939623444) * 366) + (((~((-83391170) | i)) | 951174804) * (-366)) + 967396437));
                                                                            int i447 = (i2 & i446) + (i446 | i2);
                                                                            int i448 = i447 << 13;
                                                                            int i449 = (i448 | i447) & (~(i447 & i448));
                                                                            int i450 = i449 ^ (i449 >>> 17);
                                                                            int i451 = i450 << 5;
                                                                        }
                                                                    }
                                                                } else {
                                                                    objArr = new Object[]{new int[]{i ^ 268}, new int[1], null, new int[]{i}};
                                                                    int myPid8 = Process.myPid();
                                                                    int i452 = ~myPid8;
                                                                    int i453 = (((~(myPid8 | 1000978383)) | (~((-34179023) | i452)) | 33587590) * 676) + (((~(1000386951 | i452)) | 591432) * 676) + (((-591433) | myPid8) * (-676)) + 1356096985;
                                                                    int i454 = (i453 ^ 16) + ((i453 & 16) << 1) + i2;
                                                                    int i455 = (i454 << 13) ^ i454;
                                                                    int i456 = i455 >>> 17;
                                                                    int i457 = ((~i455) & i456) | ((~i456) & i455);
                                                                    int i458 = i457 << 5;
                                                                    ((int[]) objArr[1])[0] = ((~i457) & i458) | ((~i458) & i457);
                                                                }
                                                                i14 = 0;
                                                            } else {
                                                                PngjPrematureEnding = (PngjOutputException + 59) % 128;
                                                                objArr = new Object[]{new int[]{i13}, new int[]{0}, null, new int[]{i}};
                                                                int i459 = (i2 - (~defpackage.a.c((~(1065746611 | i)) | (-1046333423), 70, ((~((-5883725) | i)) * 70) + ((((~((-31180638) | i)) | 25296913) * (-140)) + 510062075), 16))) - 1;
                                                                int i460 = i459 << 13;
                                                                int i461 = ((~i459) & i460) | ((~i460) & i459);
                                                                int i462 = i461 ^ (i461 >>> 17);
                                                                int i463 = i462 << 5;
                                                                int i464 = ((~i462) & i463) | ((~i463) & i462);
                                                                i14 = 0;
                                                            }
                                                        }
                                                        if (((int[]) objArr[3])[i14] != ((int[]) objArr[i14])[i14]) {
                                                            return objArr;
                                                        }
                                                        Object[] objArr148 = {2};
                                                        Object PngjBadSignature37 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-476828914);
                                                        if (PngjBadSignature37 == null) {
                                                            char deadChar3 = (char) (KeyEvent.getDeadChar(i14, i14) + 35511);
                                                            int i465 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 41;
                                                            int windowTouchSlop = 507 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                                            byte b72 = (byte) ($$b & 3);
                                                            byte b73 = b72;
                                                            Object[] objArr149 = new Object[1];
                                                            a(b72, b73, (byte) (b73 | 10), objArr149);
                                                            PngjBadSignature37 = com.d.e.a.PngjBadCrcException.PngjBadSignature(deadChar3, i465, windowTouchSlop, 528172725, false, (String) objArr149[0], new Class[]{cls2});
                                                        }
                                                        long longValue26 = ((Long) ((Method) PngjBadSignature37).invoke(null, objArr148)).longValue();
                                                        long j176 = -213980879;
                                                        long j177 = ((-712) * longValue26) + (714 * j176);
                                                        long j178 = j176 ^ j9;
                                                        long myUid8 = Process.myUid();
                                                        long j179 = myUid8 ^ j9;
                                                        long j180 = ((j178 | j179) ^ j9) | ((j178 | longValue26) ^ j9);
                                                        long j181 = longValue26 ^ j9;
                                                        long j182 = (myUid8 | (j181 | j176)) ^ j9;
                                                        long j183 = (713 * ((j181 | j179) ^ j9)) + (1426 * j182) + ((-713) * (j180 | j182)) + j177 + 1081727391;
                                                        int a3 = defpackage.a.a();
                                                        int i466 = ~a3;
                                                        int i467 = (((~((-360428417) | i466)) | 19005696) * (-1188)) - 1510433260;
                                                        int i468 = (~(a3 | 360428416)) | 19005696;
                                                        int i469 = ~(1797654827 | i466);
                                                        int i470 = ((int) (j183 >> 32)) & ((((~(i466 | 360428416)) | (-2139077548) | i469) * 594) + ((i468 | i469) * 594) + i467);
                                                        int i471 = ((int) j183) & ((((~(1236161861 | i)) | 536936464) * 658) + (((688455765 | 0) * (-658)) - 521774161));
                                                        if (((i470 & i471) | (i470 ^ i471)) == 2) {
                                                            Object[] objArr150 = {new int[]{0}, new int[1], null, new int[]{i}};
                                                            int i472 = (~(i & 270)) & (i | 270);
                                                            int myTid8 = Process.myTid();
                                                            int i473 = (((~(myTid8 | (-256513344))) | 239076374 | (~((~myTid8) | 795489599))) * 521) + ((778052630 | myTid8) * 521) + ((((~(0 | 778052630)) | 256513343) * (-1042)) - 104462906);
                                                            int PngjBadCrcException13 = 0; /* decompiler artifact */
                                                            int i474 = (i473 * (-49)) + 816;
                                                            int i475 = -(-(((PngjBadCrcException13 ^ 16) | (PngjBadCrcException13 & 16)) * (-50)));
                                                            int i476 = ((i474 | i475) << 1) - (i474 ^ i475);
                                                            int i477 = ~i473;
                                                            int i478 = (i477 & (-17)) | ((-17) ^ i477);
                                                            int i479 = ~((i478 & PngjBadCrcException13) | (i478 ^ PngjBadCrcException13));
                                                            int i480 = ~i473;
                                                            int i481 = ~PngjBadCrcException13;
                                                            int i482 = (i479 | (~(i480 | i481 | 16))) * 50;
                                                            int i483 = (i476 ^ i482) + ((i482 & i476) << 1);
                                                            int i484 = ~PngjBadCrcException13;
                                                            int i485 = ~((i484 & i480) | (i480 ^ i484));
                                                            int i486 = ~(i480 | 16);
                                                            int i487 = ((i486 & i485) | (i485 ^ i486) | (~(i481 | 16))) * 50;
                                                            int i488 = (i2 - (~(-(-(((i483 | i487) << 1) - (i487 ^ i483)))))) - 1;
                                                            int i489 = i488 << 13;
                                                            int i490 = ((~i488) & i489) | ((~i489) & i488);
                                                            int i491 = i490 ^ (i490 >>> 17);
                                                            ((int[]) objArr150[1])[0] = i491 ^ (i491 << 5);
                                                            return objArr150;
                                                        }
                                                        Object PngjBadSignature38 = com.d.e.a.PngjBadCrcException.PngjBadSignature(98436405);
                                                        if (PngjBadSignature38 == null) {
                                                            char normalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 51309);
                                                            int threadPriority3 = ((Process.getThreadPriority(0) + 20) >> 6) + 43;
                                                            int scrollDefaultDelay6 = 1767 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                            byte b74 = (byte) ($$b & 3);
                                                            byte b75 = b74;
                                                            Object[] objArr151 = new Object[1];
                                                            a(b74, b75, (byte) (b75 | 10), objArr151);
                                                            PngjBadSignature38 = com.d.e.a.PngjBadCrcException.PngjBadSignature(normalizeMetaState, threadPriority3, scrollDefaultDelay6, -114202482, false, (String) objArr151[0], new Class[0]);
                                                        }
                                                        long longValue27 = ((Long) ((Method) PngjBadSignature38).invoke(null, null)).longValue();
                                                        long j184 = 1335076330;
                                                        long j185 = ((-67) * longValue27) + (69 * j184);
                                                        long j186 = i4;
                                                        long j187 = j184 ^ j9;
                                                        long j188 = longValue27 ^ j9;
                                                        long a4 = defpackage.a.a();
                                                        long j189 = a4 ^ j9;
                                                        long j190 = ((68 * (j187 | ((j188 | j189) ^ j9))) + (((((j187 | j189) | longValue27) ^ j9) * j186) + (((((longValue27 | a4) ^ j9) | ((((j187 | j188) | j189) ^ j9) | ((j184 | longValue27) ^ j9))) * j186) + j185))) - 1963505410;
                                                        int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                                                        int i492 = ~startUptimeMillis2;
                                                        int i493 = ((int) (j190 >> 32)) & ((((~(startUptimeMillis2 | 178810400)) | 16896 | (~((-178810401) | i492))) * 988) + (((~(1616036811 | i492)) | (-1794830316)) * (-1976)) + (((startUptimeMillis2 | 16896) * 988) - 1261828250));
                                                        int elapsedRealtime6 = (int) SystemClock.elapsedRealtime();
                                                        int i494 = ((int) j190) & ((((~(elapsedRealtime6 | (-167870466))) | (~((~elapsedRealtime6) | 1873666241)) | (-2142235608)) * 168) + ((~((-268569367) | elapsedRealtime6)) * 168) + ((((~((-436439832) | 0)) | 268569366) * 168) - 501357939));
                                                        if (!(((i493 & i494) | (i493 ^ i494)) == 0)) {
                                                            Object[] objArr152 = {new int[]{0}, new int[1], null, new int[]{i}};
                                                            int i495 = (~(i & 272)) & (i | 272);
                                                            int i496 = ~(Process.myUid() | 313579364);
                                                            int i497 = ((i496 | 45105504) * 196) + ((268473860 | i496) * (-196)) + 1865090789;
                                                            int i498 = (i2 - (~((i497 & 16) + (i497 | 16)))) - 1;
                                                            int i499 = i498 << 13;
                                                            int i500 = ((~i498) & i499) | ((~i499) & i498);
                                                            int i501 = i500 >>> 17;
                                                            int i502 = (i500 | i501) & (~(i500 & i501));
                                                            int i503 = i502 << 5;
                                                            ((int[]) objArr152[1])[0] = ((~i502) & i503) | ((~i503) & i502);
                                                            return objArr152;
                                                        }
                                                        long[] jArr3 = {624887784092251L};
                                                        Object[] objArr153 = new Object[1];
                                                        c("\udc6f꽎\udc40\ueb32⡮ﻎꀄ㊅찼ﭝ끕⋿ﱣ쭄耹ሧ\uec90\udba7邨Ȏ鳜", Color.green(0), objArr153);
                                                        Object[] objArr154 = {(String) objArr153[0], 3, 2251799813685247L, jArr3};
                                                        Object PngjBadSignature39 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1000971846);
                                                        if (PngjBadSignature39 == null) {
                                                            char myTid9 = (char) (Process.myTid() >> 22);
                                                            int mode = 35 - View.MeasureSpec.getMode(0);
                                                            int deadChar4 = KeyEvent.getDeadChar(0, 0) + 1313;
                                                            byte b76 = (byte) 0;
                                                            byte b77 = (byte) (b76 + 1);
                                                            Object[] objArr155 = new Object[1];
                                                            a(b76, b77, (byte) (b77 | 14), objArr155);
                                                            PngjBadSignature39 = com.d.e.a.PngjBadCrcException.PngjBadSignature(myTid9, mode, deadChar4, 951651329, false, (String) objArr155[0], new Class[]{cls, cls2, Long.TYPE, long[].class});
                                                        }
                                                        long longValue28 = ((Long) ((Method) PngjBadSignature39).invoke(null, objArr154)).longValue();
                                                        long j191 = -60855444;
                                                        long j192 = (522 * longValue28) + ((-520) * j191);
                                                        long j193 = 521;
                                                        long j194 = j191 ^ j9;
                                                        long j195 = j194 | longValue28;
                                                        long elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                                                        long j196 = ((longValue28 ^ j9) | j191) ^ j9;
                                                        long j197 = ((j193 * ((((j194 | (elapsedCpuTime2 ^ j9)) | longValue28) ^ j9) | j196)) + (((-1042) * j196) + ((((j195 | elapsedCpuTime2) ^ j9) * j193) + j192))) - 118988725;
                                                        int i504 = ((int) (j197 >> 32)) & ((((~((-1438799922) | i)) | (~((-2466825) | i20)) | (~((-1573511) | i))) * 192) + (((~((-1441266746) | i20)) | 1438799921) * (-384)) + ((((-1442840256) | i20) * (-192)) - 1788177110));
                                                        int i505 = (int) j197;
                                                        int uptimeMillis2 = (int) SystemClock.uptimeMillis();
                                                        int i506 = (((~((-787680854) | uptimeMillis2)) | (-649545557)) * 672) - 1366915371;
                                                        int i507 = ~uptimeMillis2;
                                                        int i508 = i505 & ((((~(649545556 | i507)) | 138414081) * 672) + (((~(uptimeMillis2 | (-649545557))) | (~(787680853 | i507))) * (-672)) + i506);
                                                        if (((i504 & i508) | (i504 ^ i508)) != 0) {
                                                            Object[] objArr156 = {new int[]{0}, new int[1], null, new int[]{i}};
                                                            int i509 = (~(i & 275)) & (i | 275);
                                                            int myUid9 = Process.myUid();
                                                            int i510 = (((~((-982233707) | myUid9)) | 34243178 | (~((-52332268) | myUid9))) * (-880)) + 919555461;
                                                            int i511 = (~((-982233707) | (~myUid9))) | 52332267;
                                                            int i512 = ~(myUid9 | 982233706);
                                                            int d = defpackage.a.d(i512, 880, ((i511 | i512) * (-880)) + i510, 16, i2);
                                                            int i513 = d << 13;
                                                            int i514 = (d | i513) & (~(d & i513));
                                                            int i515 = i514 >>> 17;
                                                            int i516 = ((~i514) & i515) | ((~i515) & i514);
                                                            int i517 = i516 << 5;
                                                            ((int[]) objArr156[1])[0] = (i516 | i517) & (~(i516 & i517));
                                                            return objArr156;
                                                        }
                                                        int i518 = -TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0);
                                                        int i519 = (i518 & 127) + (i518 | 127);
                                                        Object[] objArr157 = new Object[1];
                                                        b(null, i519, null, "\u0097\u008d\u008c\u0089\u009b\u009e\u009a\u0096\u0088\u0086\u009a", objArr157);
                                                        Object[] objArr158 = {(String) objArr157[0]};
                                                        Object PngjBadSignature40 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1934049891);
                                                        if (PngjBadSignature40 == null) {
                                                            char capsMode3 = (char) TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0);
                                                            int resolveSizeAndState = 28 - View.resolveSizeAndState(0, 0, 0);
                                                            int normalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 1447;
                                                            byte b78 = (byte) 2;
                                                            byte b79 = (byte) (b78 - 2);
                                                            Object[] objArr159 = new Object[1];
                                                            a(b78, b79, b79, objArr159);
                                                            PngjBadSignature40 = com.d.e.a.PngjBadCrcException.PngjBadSignature(capsMode3, resolveSizeAndState, normalizeMetaState2, -1884803112, false, (String) objArr159[0], new Class[]{cls});
                                                        }
                                                        long longValue29 = ((Long) ((Method) PngjBadSignature40).invoke(null, objArr158)).longValue();
                                                        long j198 = 158291342;
                                                        long j199 = -167;
                                                        long j200 = longValue29 ^ j9;
                                                        long j201 = ((168 * (j200 | ((j13 | j198) ^ j9))) + (((-168) * (((longValue29 | j198) ^ j9) | ((j198 | j3) ^ j9))) + ((336 * ((((j198 ^ j9) | j200) ^ j9) | ((j200 | j3) ^ j9))) + ((j199 * longValue29) + (j199 * j198))))) - 1875208609;
                                                        int i520 = ~((-984741630) | i20);
                                                        if (((((int) (j201 >> 32)) & (((i520 | (-2142500864)) * 374) + (((1157759234 | i520) * (-374)) + (-1216078186)))) | (((int) j201) & ((((~(1720870518 | i20)) | 1712481842) * 564) + (((~(1996125950 | i)) * 1128) + (((((~((-283644109) | i20)) | 1720870518) | (~(283644108 | i))) * (-564)) + (-467375631)))))) != 0) {
                                                            int i521 = PngjOutputException;
                                                            PngjPrematureEnding = ((i521 ^ 49) + ((i521 & 49) << 1)) % 128;
                                                            Object[] objArr160 = {new int[]{(i & (-277)) | (i20 & 276)}, new int[1], null, new int[]{i}};
                                                            int c14 = defpackage.a.c(~((-101335585) | i20), -948, (((~((-655345445) | i)) | (-379220530)) * (-948)) + 807980337, -1215338116);
                                                            int PngjBadCrcException14 = 0; /* decompiler artifact */
                                                            int i522 = -(-(c14 * 471));
                                                            int i523 = ((3776 | i522) << 1) - (i522 ^ 3776);
                                                            int i524 = ~PngjBadCrcException14;
                                                            int i525 = ~((i524 & (-17)) | ((-17) ^ i524));
                                                            int i526 = ((i525 & c14) | (c14 ^ i525)) * (-235);
                                                            int i527 = (i523 ^ i526) + ((i526 & i523) << 1);
                                                            int i528 = ~((-17) | PngjBadCrcException14);
                                                            int i529 = (i527 - (~(((i528 & c14) | (c14 ^ i528)) * (-470)))) - 1;
                                                            int i530 = ~c14;
                                                            int i531 = ~((i530 & 16) | (i530 ^ 16));
                                                            int i532 = c14 | (-17);
                                                            int i533 = ~((i532 & PngjBadCrcException14) | (i532 ^ PngjBadCrcException14));
                                                            int i534 = ((i533 & i531) | (i531 ^ i533)) * 235;
                                                            int i535 = (i529 ^ i534) + ((i534 & i529) << 1);
                                                            int i536 = (i2 * (-675)) + (i535 * 677);
                                                            int i537 = i535 | i;
                                                            int i538 = ~i2;
                                                            int i539 = -(-(((i537 & i538) | (i537 ^ i538)) * (-676)));
                                                            int i540 = (i536 & i539) + (i539 | i536);
                                                            int i541 = ~((i538 ^ i535) | (i538 & i535));
                                                            int i542 = ~((i20 ^ i535) | (i20 & i535));
                                                            int i543 = (i540 - (~(-(-(((i541 & i542) | (i541 ^ i542)) * 676))))) - 1;
                                                            int i544 = ~((~i535) | i538);
                                                            int i545 = ~i2;
                                                            int i546 = ~((i545 & i20) | (i545 ^ i20));
                                                            int i547 = (i544 & i546) | (i544 ^ i546);
                                                            int i548 = (i2 & i535) | (i535 ^ i2);
                                                            int i549 = ~((i & i548) | (i548 ^ i));
                                                            int i550 = -(-(((i549 & i547) | (i547 ^ i549)) * 676));
                                                            int i551 = ((i543 | i550) << 1) - (i550 ^ i543);
                                                            int i552 = i551 << 13;
                                                            int i553 = (i552 | i551) & (~(i551 & i552));
                                                            int i554 = i553 >>> 17;
                                                            int i555 = ((~i553) & i554) | ((~i554) & i553);
                                                            int i556 = i555 << 5;
                                                            ((int[]) objArr160[1])[0] = ((~i555) & i556) | ((~i556) & i555);
                                                            return objArr160;
                                                        }
                                                        Object PngjBadSignature41 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1617763359);
                                                        if (PngjBadSignature41 == null) {
                                                            char size4 = (char) View.MeasureSpec.getSize(0);
                                                            int indexOf16 = 31 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                                                            int i557 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1380;
                                                            byte b80 = (byte) ($$b & 3);
                                                            byte b81 = b80;
                                                            Object[] objArr161 = new Object[1];
                                                            a(b80, b81, (byte) (b81 | 10), objArr161);
                                                            PngjBadSignature41 = com.d.e.a.PngjBadCrcException.PngjBadSignature(size4, indexOf16, i557, -1669172828, false, (String) objArr161[0], new Class[0]);
                                                        }
                                                        long longValue30 = ((Long) ((Method) PngjBadSignature41).invoke(null, null)).longValue();
                                                        long j202 = -51363511;
                                                        long j203 = j202 ^ j9;
                                                        long startUptimeMillis3 = (int) Process.getStartUptimeMillis();
                                                        long j204 = ((302 * (((longValue30 | startUptimeMillis3) ^ j9) | (((longValue30 ^ j9) | j202) ^ j9))) + (((-604) * (((j203 | longValue30) | startUptimeMillis3) ^ j9)) + (((-302) * ((((j203 | (startUptimeMillis3 ^ j9)) | longValue30) ^ j9) | (((j202 | longValue30) | startUptimeMillis3) ^ j9))) + (((-301) * longValue30) + (303 * j202))))) - 995330998;
                                                        int i558 = ((int) (j204 >> 32)) & ((((~(893277492 | i)) | 4194370) * 464) + (((-539754549) | i) * (-464)) + (((~((-543948919) | i20)) | 4194370 | (~(i20 | 893277492))) * 464) + 316927498);
                                                        int i559 = (int) j204;
                                                        int myUid10 = Process.myUid();
                                                        int i560 = ~myUid10;
                                                        if (!((i558 | (i559 & ((((~(myUid10 | (-18891050))) | ((~(i560 | (-1591687319))) | 344524800)) * 168) + (((~((-1247162519) | myUid10)) * 168) + ((((~((-1266053568) | i560)) | 1247162518) * 168) + (-501357939)))))) == 0)) {
                                                            int i561 = PngjOutputException;
                                                            PngjPrematureEnding = ((i561 & 49) + (i561 | 49)) % 128;
                                                            Object[] objArr162 = {new int[]{(i & (-274)) | (i20 & 273)}, new int[]{(0 | 0) & (~(0 & 0))}, null, new int[]{i}};
                                                            int d2 = defpackage.a.d((~(1012287885 | i20)) | 5392776, 495, (0 * 495) - 1634857652, 16, i2);
                                                            int i562 = d2 << 13;
                                                            int i563 = (d2 | i562) & (~(d2 & i562));
                                                            int i564 = i563 >>> 17;
                                                            int i565 = ((~i563) & i564) | ((~i564) & i563);
                                                            int i566 = i565 << 5;
                                                            return objArr162;
                                                        }
                                                        Object PngjBadSignature42 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-820027826);
                                                        if (PngjBadSignature42 == null) {
                                                            char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 13779);
                                                            int tapTimeout2 = 29 - (ViewConfiguration.getTapTimeout() >> 16);
                                                            int threadPriority4 = ((Process.getThreadPriority(0) + 20) >> 6) + 1502;
                                                            byte b82 = (byte) 0;
                                                            byte b83 = (byte) (b82 + 1);
                                                            Object[] objArr163 = new Object[1];
                                                            a(b82, b83, (byte) (b83 | 14), objArr163);
                                                            PngjBadSignature42 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionType, tapTimeout2, threadPriority4, 871379957, false, (String) objArr163[0], new Class[0]);
                                                        }
                                                        long longValue31 = ((Long) ((Method) PngjBadSignature42).invoke(null, null)).longValue();
                                                        long j205 = 500182033;
                                                        long j206 = longValue31 ^ j9;
                                                        long j207 = ((49 * (((longValue31 | j205) ^ j9) | ((j206 | j3) ^ j9))) + (((-49) * ((j206 | (((j205 ^ j9) | j13) ^ j9)) | ((j205 | j3) ^ j9))) + ((98 * (((j206 | j13) ^ j9) | ((j206 | j205) ^ j9))) + (((-97) * longValue31) + (50 * j205))))) - 667577249;
                                                        int i567 = ~defpackage.a.b(1735405557);
                                                        int i568 = ((int) (j207 >> 32)) & ((((~((-1428493042) | i567)) | (-8733370)) * 68) + ((~((-8405001) | i567)) * (-68)) + ((((~(0 | 1428493041)) | ((~((-328370) | i567)) | (-1436898042))) * (-68)) - 617150774));
                                                        int i569 = ((int) j207) & ((((~((~defpackage.a.b(1607931481)) | 517169422)) | 176308486) * 420) + (((~(517169422 | 0)) * 420) - 9553639));
                                                        if (((i568 & i569) | (i568 ^ i569)) != 0) {
                                                            Object[] objArr164 = {new int[]{i ^ 279}, new int[]{(0 | 0) & (~(0 & 0))}, null, new int[]{i}};
                                                            int d3 = defpackage.a.d(i | (-28475817), 591, (((~((-28475817) | i20)) | (-1006090158)) * (-591)) - 1209891894, 16, i2);
                                                            int i570 = d3 ^ (d3 << 13);
                                                            int i571 = i570 ^ (i570 >>> 17);
                                                            int i572 = i571 << 5;
                                                            return objArr164;
                                                        }
                                                        Object[] objArr165 = {Integer.valueOf(i), obj, Integer.valueOf(i2), 16777216};
                                                        Object PngjBadSignature43 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1284430186);
                                                        if (PngjBadSignature43 == null) {
                                                            PngjBadSignature43 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) View.resolveSize(0, 0), 26 - Color.blue(0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1224, 1335773997, false, null, new Class[]{cls2, (Class) com.d.e.a.PngjBadCrcException.values((char) Gravity.getAbsoluteGravity(0, 0), 25 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1247 - AndroidCharacter.getMirror('0')), cls2, cls2});
                                                        }
                                                        Object newInstance = ((Constructor) PngjBadSignature43).newInstance(objArr165);
                                                        try {
                                                            Object[] objArr166 = new Object[1];
                                                            c("꠶\uf6e9ꡜ늄箨쟆\uf3c6ஃ련ꊹ\ue381᯼蠱銫펄⬪飔舐썡㬖", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr166);
                                                            Class<?> cls4 = Class.forName((String) objArr166[0]);
                                                            Object[] objArr167 = new Object[1];
                                                            c("露〽靁瑅풎陖峷娀蝶", ViewConfiguration.getJumpTapTimeout() >> 16, objArr167);
                                                            cls4.getMethod((String) objArr167[0], null).invoke(newInstance, null);
                                                            Object[] objArr168 = {new int[]{i}, new int[]{0 ^ (0 << 5)}, null, new int[]{i}};
                                                            int i573 = (i2 - (~(-(-(((~(i20 | 804069126)) * 301) + (((((~(i | (-230496848))) | 229448198) | (~(805117775 | i20))) * (-301)) + ((((~((-230496848) | i20)) | 804069126) * (-602)) + 412949588))))))) - 1;
                                                            int i574 = i573 << 13;
                                                            int i575 = (i573 | i574) & (~(i573 & i574));
                                                            int i576 = i575 >>> 17;
                                                            int i577 = (i575 | i576) & (~(i575 & i576));
                                                            return objArr168;
                                                        } catch (Throwable th4) {
                                                            Throwable cause2 = th4.getCause();
                                                            if (cause2 != null) {
                                                                throw new RuntimeException(cause2);
                                                            }
                                                            throw new RuntimeException(th4);
                                                        }
                                                    }
                                                    int i578 = PngjPrematureEnding;
                                                    PngjOutputException = ((i578 & 49) + (i578 | 49)) % 128;
                                                } catch (Throwable th5) {
                                                    Throwable cause3 = th5.getCause();
                                                    if (cause3 != null) {
                                                        throw new RuntimeException(cause3);
                                                    }
                                                    throw new RuntimeException(th5);
                                                }
                                            }
                                        }
                                        i9 = 0;
                                        if (i9 == 0) {
                                        }
                                    } catch (Throwable th6) {
                                        Throwable cause4 = th6.getCause();
                                        if (cause4 != null) {
                                            throw new RuntimeException(cause4);
                                        }
                                        throw new RuntimeException(th6);
                                    }
                                }
                            }
                            z2 = false;
                            if (!z2) {
                            }
                        }
                    }
                }
                z = false;
                if (!z) {
                }
            } catch (Throwable th7) {
                Throwable cause5 = th7.getCause();
                if (cause5 != null) {
                    throw new RuntimeException(cause5);
                }
                throw new RuntimeException(th7);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(short s, byte b, byte b2, Object[] objArr) {
            int i;
            int i2;
            int i3 = 112 - b2;
            int i4 = 4 - b;
            byte[] bArr = $$a;
            int i5 = s + 1;
            byte[] bArr2 = new byte[i5];
            if (bArr == null) {
                byte[] bArr3 = bArr;
                i2 = 0;
                int i6 = i5;
                i3 = (i6 + (-i3)) - 23;
                bArr = bArr3;
                i = i2;
                i4++;
                i2 = i + 1;
                bArr2[i] = (byte) i3;
                if (i2 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                byte b3 = bArr[i4];
                byte[] bArr4 = bArr;
                i6 = i3;
                i3 = b3;
                bArr3 = bArr4;
                i3 = (i6 + (-i3)) - 23;
                bArr = bArr3;
                i = i2;
                i4++;
                i2 = i + 1;
                bArr2[i] = (byte) i3;
                if (i2 == i5) {
                }
            } else {
                i = 0;
                i4++;
                i2 = i + 1;
                bArr2[i] = (byte) i3;
                if (i2 == i5) {
                }
            }
        }

        private static void b(int[] iArr, int i, String str, String str2, Object[] objArr) {
            char[] cArr;
            int i2;
            int i3;
            char c;
            int i4;
            String str3 = str2;
            byte[] bArr = str3 != null ? str3.getBytes("ISO-8859-1") : null;
            if (str3 != null) {
                bArr = str3.getBytes("ISO-8859-1");
            }
            byte[] bArr2 = bArr;
            if (str != null) {
                int i5 = $11 + 51;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    str.toCharArray();
                    throw null;
                }
                cArr = str.toCharArray();
            } else {
                cArr = null;
            }
            char[] cArr2 = cArr;
            com.d.e.PngjExceptionInternal pngjExceptionInternal = new com.d.e.PngjExceptionInternal();
            char[] cArr3 = PngjBadSignature;
            Class cls = Integer.TYPE;
            if (cArr3 != null) {
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                for (int i6 = 0; i6 < length; i6++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(358189806);
                        if (PngjBadSignature2 == null) {
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (View.combineMeasuredStates(0, 0) + 27092), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 37, 118 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), -373889195, false, "b", new Class[]{cls});
                        }
                        cArr4[i6] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();

                        if (cause == null) {

                            throw new RuntimeException(th);

                        }

                        throw new RuntimeException(cause);
                    }
                }
                cArr3 = cArr4;
            }
            Object[] objArr3 = {Integer.valueOf(values)};
            Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1639226071);
            if (PngjBadSignature3 == null) {
                char scrollBarFadeDuration = (char) (61713 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                int trimmedLength = TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 34;
                int threadPriority = 278 - ((Process.getThreadPriority(0) + 20) >> 6);
                byte b = $$c[2];
                byte b2 = (byte) (b - 1);
                byte b3 = (byte) (-b);
                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(scrollBarFadeDuration, trimmedLength, threadPriority, -1654917268, false, $$e(b2, b3, (byte) (b3 + 3)), new Class[]{cls});
            }
            int intValue = ((Integer) ((Method) PngjBadSignature3).invoke(null, objArr3)).intValue();
            int i7 = -528960794;
            char c2 = '0';
            int i8 = 1;
            if (PngjException) {
                $10 = ($11 + 39) % 128;
                int length2 = bArr2.length;
                pngjExceptionInternal.PngjException = length2;
                char[] cArr5 = new char[length2];
                pngjExceptionInternal.values = 0;
                while (true) {
                    int i9 = pngjExceptionInternal.values;
                    int i10 = pngjExceptionInternal.PngjException;
                    if (i9 >= i10) {
                        objArr[0] = new String(cArr5);
                        return;
                    }
                    cArr5[i9] = (char) (cArr3[bArr2[(i10 - 1) - i9] + i] - intValue);
                    Object[] objArr4 = new Object[2];
                    objArr4[i8] = pngjExceptionInternal;
                    objArr4[0] = pngjExceptionInternal;
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i7);
                    if (PngjBadSignature4 == null) {
                        char indexOf = (char) (TextUtils.indexOf(BuildConfig.FLAVOR, c2, 0) + i8);
                        int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 37;
                        int alpha = Color.alpha(0) + 549;
                        i3 = i7;
                        byte b4 = $$c[2];
                        i4 = i8;
                        byte b5 = (byte) (b4 - 1);
                        byte b6 = (byte) (-b4);
                        c = c2;
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf, threadPriority2, alpha, 479715165, false, $$e(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                    } else {
                        i3 = i7;
                        c = c2;
                        i4 = i8;
                    }
                    ((Method) PngjBadSignature4).invoke(null, objArr4);
                    i7 = i3;
                    i8 = i4;
                    c2 = c;
                }
            } else {
                char c3 = '0';
                if (PngjBadCrcException) {
                    int length3 = cArr2.length;
                    pngjExceptionInternal.PngjException = length3;
                    char[] cArr6 = new char[length3];
                    pngjExceptionInternal.values = 0;
                    while (true) {
                        int i11 = pngjExceptionInternal.values;
                        int i12 = pngjExceptionInternal.PngjException;
                        if (i11 >= i12) {
                            objArr[0] = new String(cArr6);
                            return;
                        }
                        cArr6[i11] = (char) (cArr3[cArr2[(i12 - 1) - i11] - i] - intValue);
                        Object[] objArr5 = {pngjExceptionInternal, pngjExceptionInternal};
                        Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-528960794);
                        if (PngjBadSignature5 == null) {
                            char threadPriority3 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                            int mirror = 'U' - AndroidCharacter.getMirror(c3);
                            int indexOf2 = 548 - TextUtils.indexOf(BuildConfig.FLAVOR, c3, 0);
                            byte b7 = $$c[2];
                            byte b8 = (byte) (b7 - 1);
                            byte b9 = (byte) (-b7);
                            PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(threadPriority3, mirror, indexOf2, 479715165, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) PngjBadSignature5).invoke(null, objArr5);
                        c3 = '0';
                    }
                } else {
                    int length4 = iArr.length;
                    pngjExceptionInternal.PngjException = length4;
                    char[] cArr7 = new char[length4];
                    pngjExceptionInternal.values = 0;
                    $10 = ($11 + 25) % 128;
                    while (true) {
                        int i13 = pngjExceptionInternal.values;
                        int i14 = pngjExceptionInternal.PngjException;
                        if (i13 >= i14) {
                            objArr[0] = new String(cArr7);
                            return;
                        }
                        int i15 = $11 + 105;
                        $10 = i15 % 128;
                        if (i15 % 2 != 0) {
                            cArr7[i13] = (char) (cArr3[iArr[i14 / i13] % i] + intValue);
                            i2 = i13 / 0;
                        } else {
                            cArr7[i13] = (char) (cArr3[iArr[(i14 - 1) - i13] - i] - intValue);
                            i2 = i13 + 1;
                        }
                        pngjExceptionInternal.values = i2;
                    }
                }
            }
        }

        private static void c(String str, int i, Object[] objArr) {
            $11 = ($10 + 87) % 128;
            char[] charArray = str != null ? str.toCharArray() : null;
            com.d.e.ComDeA aVar = new com.d.e.ComDeA();
            char[] values2 = com.d.e.ComDeA.values(PngjInputException ^ 8332534422373704609L, charArray, i);
            aVar.PngjBadSignature = 4;
            while (true) {
                int i2 = aVar.PngjBadSignature;
                if (i2 >= values2.length) {
                    objArr[0] = new String(values2, 4, values2.length - 4);
                    return;
                }
                $11 = ($10 + 25) % 128;
                int i3 = i2 - 4;
                aVar.PngjBadCrcException = i3;
                try {
                    Object[] objArr2 = {Long.valueOf(values2[i2] ^ values2[i2 % 4]), Long.valueOf(i3), Long.valueOf(PngjInputException)};
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1668670198);
                    if (PngjBadSignature2 == null) {
                        char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 29;
                        int lastIndexOf = (-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0);
                        Class cls = Long.TYPE;
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c, threadPriority, lastIndexOf, 1617260721, false, "o", new Class[]{cls, cls, cls});
                    }
                    values2[i2] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {aVar, aVar};
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1405973094);
                    if (PngjBadSignature3 == null) {
                        char scrollBarSize = (char) (14830 - (ViewConfiguration.getScrollBarSize() >> 8));
                        int alpha = 28 - Color.alpha(0);
                        int myTid = (Process.myTid() >> 22) + 721;
                        byte b = $$c[2];
                        byte b2 = (byte) (b - 1);
                        byte b3 = (byte) (-b);
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(scrollBarSize, alpha, myTid, -1356718115, false, $$e(b2, b3, (byte) (b3 & 5)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) PngjBadSignature3).invoke(null, objArr3);
                    $10 = ($11 + 9) % 128;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();

                    if (cause == null) {

                        throw new RuntimeException(th);

                    }

                    throw new RuntimeException(cause);
                }
            }
        }

        public static void init$0() {
            $$a = new byte[]{37, -49, ByteCompanionObject.MAX_VALUE, 88, 29, -13, -28};
            $$b = 229;
        }

        public static void init$1() {
            $$c = new byte[]{56, -68, 1, -57};
            $$d = 11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PngjPrematureEnding = (PngjOutputException + 7) % 128;
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FingerActivity.this.Action();
        }
    }

    public class e1 implements View.OnClickListener {
        public e1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FingerActivity.this.getPadSub3();
        }
    }

    public class getAsHighestSecurityLevelReached extends OrientationEventListener {
        public getAsHighestSecurityLevelReached(Context context) {
            super(context);
        }

        @Override // android.view.OrientationEventListener
        public final void onOrientationChanged(int i) {
            int i2;
            org.camera.a.valueOf valueof = FingerActivity.this.isQualityFailed;
            if (i != -1) {
                int abs = Math.abs(i - valueof.PngjBadSignature);
                if (abs > 180) {
                    abs = 360 - abs;
                }
                if (abs <= 60 || (i2 = (((i + 45) / 90) * 90) % 360) == valueof.PngjBadSignature) {
                    return;
                }
                valueof.PngjBadSignature = i2;
            }
        }
    }

    public class getCaptureTime implements View.OnClickListener {
        public getCaptureTime() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FingerActivity.this.Action();
        }
    }

    public class getData extends BroadcastReceiver {
        private static  byte[] $$a = null;
        private static  int $$b = 0;
        private static  byte[] $$c = null;
        private static  byte[] $$d = null;
        private static  int $$e = 0;
        private static  int $$f = 0;
        private static int $10;
        private static int $11;
        private static long PngjBadCrcException;
        private static int PngjBadSignature;
        private static int PngjException;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$g(short s, byte b, byte b2) {
            int i;
            int i6 = 0;
            int i2 = b2 * 2;
            byte[] bArr = $$c;
            int i3 = (b * 5) + com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground;
            int i4 = s + 4;
            byte[] bArr2 = new byte[i2 + 1];
            if (bArr == null) {
                int i5 = i3;
                i3 = i2;
                i6 = 0;
                i3 += i5;
                i = i6;
                bArr2[i] = (byte) i3;
                i6 = i + 1;
                if (i == i2) {
                    return new String(bArr2, 0);
                }
                i4++;
                i5 = bArr[i4];
                i3 += i5;
                i = i6;
                bArr2[i] = (byte) i3;
                i6 = i + 1;
                if (i == i2) {
                }
            } else {
                i = 0;
                bArr2[i] = (byte) i3;
                i6 = i + 1;
                if (i == i2) {
                }
            }
        }

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            init$0();
            PngjException = 0;
            PngjBadSignature = 1;
            PngjBadCrcException = -3031056983797730459L;
        }

        public getData() {
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x015e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(String str, int i, Object[] objArr) {
            char[] cArr;
            Throwable cause;
            char c;
            int i2;
            int i3;
            if (str != null) {
                $11 = ($10 + 59) % 128;
                cArr = str.toCharArray();
                $10 = ($11 + 101) % 128;
            } else {
                cArr = null;
            }
            char[] cArr2 = cArr;
            com.d.e.PngjUnsupportedException pngjUnsupportedException = new com.d.e.PngjUnsupportedException();
            pngjUnsupportedException.PngjBadCrcException = i;
            int length = cArr2.length;
            long[] jArr = new long[length];
            pngjUnsupportedException.valueOf = 0;
            $11 = ($10 + 41) % 128;
            while (true) {
                int i4 = pngjUnsupportedException.valueOf;
                if (i4 >= cArr2.length) {
                    break;
                }
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4]), pngjUnsupportedException, pngjUnsupportedException};
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-930920279);
                    if (PngjBadSignature2 == null) {
                        char indexOf = (char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0);
                        int rgb = (-16777168) - Color.rgb(0, 0, 0);
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 944;
                        i2 = 35511;
                        byte b = $$c[0];
                        i3 = -125632871;
                        byte b2 = (byte) (b - 1);
                        byte b3 = b;
                        c = 1;
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf, rgb, packedPositionType, 879502610, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                    } else {
                        c = 1;
                        i2 = 35511;
                        i3 = -125632871;
                    }
                    jArr[i4] = ((Long) ((Method) PngjBadSignature2).invoke(null, objArr2)).longValue() ^ (PngjBadCrcException ^ 2636593786896957769L);
                    Object[] objArr3 = new Object[2];
                    objArr3[c] = pngjUnsupportedException;
                    objArr3[0] = pngjUnsupportedException;
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                    if (PngjBadSignature3 == null) {
                        char fadingEdgeLength = (char) (i2 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 42;
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 507;
                        byte b4 = $$c[0];
                        byte b5 = (byte) (b4 - 1);
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(fadingEdgeLength, makeMeasureSpec, scrollBarFadeDuration, 74289954, false, $$g(b5, (byte) (-b5), b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) PngjBadSignature3).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause2 = th.getCause();
                    if (cause2 != null) {
                        throw new RuntimeException(cause2);
                    }
                    throw new RuntimeException(th);
                }
            }
            char[] cArr3 = new char[length];
            pngjUnsupportedException.valueOf = 0;
            $10 = ($11 + 109) % 128;
            while (true) {
                int i5 = pngjUnsupportedException.valueOf;
                if (i5 >= cArr2.length) {
                    break;
                }
                cArr3[i5] = (char) jArr[i5];
                Object[] objArr4 = {pngjUnsupportedException, pngjUnsupportedException};
                Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-125632871);
                if (PngjBadSignature4 == null) {
                    char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 35511);
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 42;
                    int mode = 507 - View.MeasureSpec.getMode(0);
                    byte b6 = $$c[0];
                    byte b7 = (byte) (b6 - 1);
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(deadChar, makeMeasureSpec2, mode, 74289954, false, $$g(b7, (byte) (-b7), b6), new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature4).invoke(null, objArr4);
            }
            String str2 = new String(cArr3);
            int i6 = $11 + 71;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            objArr[0] = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(short s, byte b, byte b2, Object[] objArr) {
            int i;
            int i2;
            int i3 = (b2 * 38) + 80;
            int i4 = b + 6;
            int i5 = s + 4;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i4];
            if (bArr == null) {
                int i6 = i3;
                i2 = 0;
                i3 = i4;
                i3 = i3 + i6 + 5;
                i = i2;
                i5++;
                i2 = i + 1;
                bArr2[i] = (byte) i3;
                if (i2 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i6 = bArr[i5];
                i3 = i3 + i6 + 5;
                i = i2;
                i5++;
                i2 = i + 1;
                bArr2[i] = (byte) i3;
                if (i2 == i4) {
                }
            } else {
                i = 0;
                i5++;
                i2 = i + 1;
                bArr2[i] = (byte) i3;
                if (i2 == i4) {
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void c(int i, byte b, byte b2, Object[] objArr) {
            int i2;
            int i8 = 0;
            int i3 = 111 - (b2 * 31);
            int i4 = 52 - (i * 48);
            int i5 = b * 30;
            byte[] bArr = $$d;
            byte[] bArr2 = new byte[49 - i5];
            int i6 = 48 - i5;
            if (bArr == null) {
                int i7 = i3;
                i8 = 0;
                int i9 = i4;
                int i10 = i9 + 1;
                i3 = (i4 + i7) - 3;
                i4 = i10;
                i2 = i8;
                bArr2[i2] = (byte) i3;
                i8 = i2 + 1;
                if (i2 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i7 = bArr[i4];
                int i11 = i3;
                i9 = i4;
                i4 = i11;
                int i102 = i9 + 1;
                i3 = (i4 + i7) - 3;
                i4 = i102;
                i2 = i8;
                bArr2[i2] = (byte) i3;
                i8 = i2 + 1;
                if (i2 == i6) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i3;
                i8 = i2 + 1;
                if (i2 == i6) {
                }
            }
        }

        public static void init$0() {
            $$a = new byte[]{12, -20, 32, 85, 25, -12, -2, -45, 26, -2, -38, 42, -20, -35, 46, -26, -3, 6, -1, -16, 1, -6, -26, 6, 4, -21, 9, 25, -12, -2, -42, 46, -26, -3, 6, -1, -16, 1, -6, -26, 6, 4, -21, -27, 18};
            $$b = 199;
        }

        public static void init$1() {
            $$d = new byte[]{37, -49, ByteCompanionObject.MAX_VALUE, 88, 6, -8, -54, 56, 1, 15, -5, 16, -14, -48, 69, 5, -10, 20, -10, -1, 21, -70, 37, 33, -4, 6, -37, 34, 6, -30, 50, -12, -27, 54, -18, 5, 14, 7, -8, 9, 2, -71, 70, 1, 18, -33, 20, 6, -14, 37, -16, -46, 33, -4, 6, -37, 34, 6, -30, 50, -12, -27, 54, -18, 5, 14, 7, -8, 9, 2};
            $$e = 117;
        }

        public static void init$2() {
            $$c = new byte[]{0, -93, 11, 14};
            $$f = 27;
        }

        /* JADX WARN: Code restructure failed: missing block: B:157:0x019c, code lost:
        
            if ((0 instanceof android.content.ContextWrapper) != false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:158:0x01af, code lost:
        
            0 = 0.getApplicationContext();
         */
        /* JADX WARN: Code restructure failed: missing block: B:160:0x01aa, code lost:
        
            if (((android.content.ContextWrapper) 0).getBaseContext() == null) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:161:0x01ad, code lost:
        
            0 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:163:0x01a1, code lost:
        
            if ((0 instanceof android.content.ContextWrapper) != false) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0b7a  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x060a  */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onReceive(Context context, Intent intent) {
            char c;
            int i;
            int i2;
            int i3;
            Object[] objArr;
            int i4;
            int intValue;
            Object[] PngjException$52c725b;
            char c2;
            Object[] objArr2;
            boolean z;
            int i5;
            Context context2 = context;
            PngjBadSignature = (PngjException + 45) % 128;
            Object[] objArr3 = new Object[1];
            a("㉍ꗧᴂ\uf4b1泗쑼뾖ខ轫暒\ude70뙨⧩脾神탢䠑⎚鯚獼\ueaab䋎", 38821 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr3);
            String str = (String) objArr3[0];
            Object[] objArr4 = new Object[1];
            a("㉉姽\ue537煫鲫⣸됦쁕澡ﯨܢ鍇㺙䫘혟", 27580 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), objArr4);
            String str2 = (String) objArr4[0];
            Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
            if (PngjBadSignature2 == null) {
                char threadPriority = (char) (31077 - ((Process.getThreadPriority(0) + 20) >> 6));
                int fadingEdgeLength = 49 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int blue = 1043 - Color.blue(0);
                byte[] bArr = $$a;
                byte b = bArr[18];
                c = 18;
                Object[] objArr5 = new Object[1];
                b(b, (byte) (b & 13), (byte) (bArr[20] - 1), objArr5);
                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(threadPriority, fadingEdgeLength, blue, 159283629, false, (String) objArr5[0], null);
            } else {
                c = 18;
            }
            long j = ((Field) PngjBadSignature2).getLong(null);
            if (j == -1 || j + 4611686018427387931L < ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
                i = 2;
                i2 = 3;
                if (context2 != null) {
                    int i6 = PngjException + 23;
                    PngjBadSignature = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 8 / 0;
                    }
                }
                Object[] objArr6 = new Object[1];
                a("㉆권ෘ\ued0e䴆ⲅ賋氅챃꿋\u0ff5\uef1e体⺕軇渎", 40897 - ((Process.getThreadPriority(0) + 20) >> 6), objArr6);
                Class<?> cls = Class.forName((String) objArr6[0]);
                Object[] objArr7 = new Object[1];
                a("㉅‹ᚫԑ箜湰峾덂ꇬ鞴訵\uf89f\uef23\uddfeて⛖", Color.green(0) + 4721, objArr7);
                try {
                    Object[] objArr8 = {context2, Integer.valueOf(((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, this)).intValue()), 0, 903914835};
                    byte[] bArr2 = $$d;
                    byte b2 = bArr2[8];
                    byte b3 = (byte) (b2 - 1);
                    i3 = 4;
                    Object[] objArr9 = new Object[1];
                    c(b2, b3, b3, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    byte b4 = bArr2[8];
                    byte b5 = (byte) (b4 - 1);
                    byte b6 = b4;
                    Object[] objArr10 = new Object[1];
                    c(b5, b6, b6, objArr10);
                    String str3 = (String) objArr10[0];
                    Class cls3 = Integer.TYPE;
                    objArr = (Object[]) cls2.getMethod(str3, Context.class, cls3, cls3, cls3).invoke(null, objArr8);
                    if (context2 != null) {
                        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1200224935);
                        if (PngjBadSignature3 == null) {
                            char offsetAfter = (char) (31077 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0));
                            int normalizeMetaState = KeyEvent.normalizeMetaState(0) + 49;
                            int i8 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1042;
                            byte[] bArr3 = $$a;
                            byte b7 = (byte) (bArr3[44] - 1);
                            byte b8 = bArr3[20];
                            Object[] objArr11 = new Object[1];
                            b(b7, (byte) (b8 - 1), b8, objArr11);
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(offsetAfter, normalizeMetaState, i8, 1150904546, false, (String) objArr11[0], null);
                        }
                        ((Field) PngjBadSignature3).set(null, objArr);
                        try {
                            Long valueOf = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                            Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
                            if (PngjBadSignature4 == null) {
                                char size = (char) (View.MeasureSpec.getSize(0) + 31077);
                                int normalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 49;
                                int keyRepeatTimeout = 1043 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                byte[] bArr4 = $$a;
                                byte b9 = bArr4[c];
                                i4 = 0;
                                Object[] objArr12 = new Object[1];
                                b(b9, (byte) (b9 & 13), (byte) (bArr4[20] - 1), objArr12);
                                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(size, normalizeMetaState2, keyRepeatTimeout, 159283629, false, (String) objArr12[0], null);
                            } else {
                                i4 = 0;
                            }
                            ((Field) PngjBadSignature4).set(null, valueOf);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    } else {
                        i4 = 0;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();

                    if (cause == null) {

                        throw new RuntimeException(th);

                    }

                    throw new RuntimeException(cause);
                }
            } else {
                Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1200224935);
                if (PngjBadSignature5 == null) {
                    char lastIndexOf = (char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 31078);
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 49;
                    int indexOf = 1042 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0);
                    byte[] bArr5 = $$a;
                    byte b10 = (byte) (bArr5[44] - 1);
                    byte b11 = bArr5[20];
                    i = 2;
                    i2 = 3;
                    Object[] objArr13 = new Object[1];
                    b(b10, (byte) (b11 - 1), b11, objArr13);
                    PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(lastIndexOf, maxKeyCode, indexOf, 1150904546, false, (String) objArr13[0], null);
                } else {
                    i = 2;
                    i2 = 3;
                }
                Object[] objArr14 = (Object[]) ((Field) PngjBadSignature5).get(null);
                objArr = new Object[5];
                objArr[i] = new int[]{0};
                objArr[i2] = new int[]{0};
                objArr[4] = new int[1];
                int i9 = ((int[]) objArr14[i2])[0];
                int i10 = ((int[]) objArr14[i])[0];
                String str4 = (String) objArr14[1];
                String str5 = (String) objArr14[0];
                objArr[1] = str4;
                objArr[0] = str5;
                int maxMemory = (int) Runtime.getRuntime().maxMemory();
                int i11 = ~((-448287793) | maxMemory);
                int i12 = ~maxMemory;
                int i13 = i11 | (~(176069577 | i12));
                int c3 = defpackage.a.c(4623305 | (~(448287792 | i12)), 516, (((~(maxMemory | (-171446273))) | (~(i12 | (-4623306)))) * 516) + (((i13 | 0) * (-516)) - 644964459), 903914835);
                int i14 = c3 ^ (c3 << 13);
                int i15 = i14 ^ (i14 >>> 17);
                ((int[]) objArr[4])[0] = i15 ^ (i15 << 5);
                i4 = 0;
                i3 = 4;
            }
            if (((int[]) objArr[i2])[i4] != ((int[]) objArr[i])[i4]) {
                ArrayList arrayList = new ArrayList();
                arrayList.add((String) objArr[1]);
                arrayList.add((String) objArr[0]);
                throw null;
            }
            Object[] objArr15 = new Object[5];
            int[] iArr = new int[1];
            objArr15[i] = iArr;
            int[] iArr2 = new int[1];
            objArr15[i2] = iArr2;
            objArr15[i3] = new int[1];
            int i16 = ((int[]) objArr[i3])[i4];
            int i17 = ((int[]) objArr[i2])[i4];
            int i18 = ((int[]) objArr[i])[i4];
            String str6 = (String) objArr[1];
            String str7 = (String) objArr[i4];
            iArr2[i4] = i17;
            iArr[i4] = i18;
            objArr15[1] = str6;
            objArr15[i4] = str7;
            int c4 = defpackage.a.c((~((~System.identityHashCode(this)) | 736055358)) | 540720, 449, (((~(736055358 | 0)) | 540720) * 449) - 84834792, i16);
            int i19 = c4 ^ (c4 << 13);
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr15[i3])[i4] = i20 ^ (i20 << 5);
            PngjBadSignature = (PngjException + 123) % 128;
            Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
            if (PngjBadSignature6 == null) {
                char minimumFlingVelocity = (char) (14830 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                int i21 = i4;
                int lastIndexOf2 = 27 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', i21, i21);
                int i22 = 722 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                byte[] bArr6 = $$a;
                byte b12 = bArr6[c];
                Object[] objArr16 = new Object[1];
                b(b12, (byte) (b12 & 13), (byte) (bArr6[20] - 1), objArr16);
                PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(minimumFlingVelocity, lastIndexOf2, i22, -815159504, false, (String) objArr16[0], null);
            }
            long j2 = ((Field) PngjBadSignature6).getLong(null);
            try {
                try {
                    if (j2 != -1) {
                        PngjBadSignature = (PngjException + 109) % 128;
                        if (j2 + 4611686018427387820L >= ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
                            Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                            if (PngjBadSignature7 == null) {
                                char c5 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14829);
                                int i23 = 29 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 721;
                                Object[] objArr17 = new Object[1];
                                b((byte) 22, (byte) ($$b & 31), (byte) ($$a[20] - 1), objArr17);
                                PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c5, i23, scrollDefaultDelay, -779023007, false, (String) objArr17[0], null);
                            }
                            Object[] objArr18 = (Object[]) ((Field) PngjBadSignature7).get(null);
                            PngjException$52c725b = new Object[i3];
                            PngjException$52c725b[0] = new int[]{0};
                            PngjException$52c725b[1] = new int[1];
                            PngjException$52c725b[i2] = new int[]{0};
                            int i24 = ((int[]) objArr18[i2])[0];
                            int i25 = ((int[]) objArr18[0])[0];
                            PngjException$52c725b[i] = (String[]) objArr18[i];
                            int identityHashCode = System.identityHashCode(this);
                            int i26 = (((~(99781533 | identityHashCode)) | 934784440) * 672) + 1443409781;
                            int i27 = ~identityHashCode;
                            int c6 = defpackage.a.c((~((-934784441) | i27)) | 839197728, 672, (((~(identityHashCode | 934784440)) | (~((-99781534) | i27))) * (-672)) + i26, 270004813);
                            int i28 = c6 ^ (c6 << 13);
                            int i29 = i28 ^ (i28 >>> 17);
                            ((int[]) PngjException$52c725b[1])[0] = i29 ^ (i29 << 5);
                            c2 = 0;
                            if (((int[]) PngjException$52c725b[i2])[c2] == ((int[]) PngjException$52c725b[c2])[c2]) {
                                ArrayList arrayList2 = new ArrayList();
                                String[] strArr = (String[]) PngjException$52c725b[2];
                                if (strArr == null) {
                                    throw null;
                                }
                                int i30 = PngjException + 77;
                                PngjBadSignature = i30 % 128;
                                int i31 = i30 % 2 != 0 ? 0 : 1;
                                while (i31 < strArr.length) {
                                    arrayList2.add(strArr[i31]);
                                    i31++;
                                    PngjBadSignature = (PngjException + 123) % 128;
                                }
                                throw null;
                            }
                            Object[] objArr19 = new Object[4];
                            int[] iArr3 = new int[1];
                            objArr19[c2] = iArr3;
                            objArr19[1] = new int[1];
                            int[] iArr4 = new int[1];
                            objArr19[i2] = iArr4;
                            int i32 = ((int[]) PngjException$52c725b[1])[c2];
                            int i33 = ((int[]) PngjException$52c725b[i2])[c2];
                            int i34 = ((int[]) PngjException$52c725b[c2])[c2];
                            String[] strArr2 = (String[]) PngjException$52c725b[i];
                            iArr4[c2] = i33;
                            iArr3[c2] = i34;
                            objArr19[i] = strArr2;
                            int c7 = defpackage.a.c(~(System.identityHashCode(this) | (-29624931)), 566, (((~((-298061427) | 0)) | 268436496) * (-566)) - 1649199947, i32);
                            int i35 = c7 ^ (c7 << 13);
                            int i36 = i35 ^ (i35 >>> 17);
                            ((int[]) objArr19[1])[0] = i36 ^ (i36 << 5);
                            Object PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
                            if (PngjBadSignature8 == null) {
                                char resolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                                int indexOf2 = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 38;
                                int i37 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 548;
                                byte[] bArr7 = $$a;
                                byte b13 = bArr7[c];
                                Object[] objArr20 = new Object[1];
                                b(b13, (byte) (b13 & 13), (byte) (bArr7[20] - 1), objArr20);
                                PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(resolveOpacity, indexOf2, i37, -1608103378, false, (String) objArr20[0], null);
                            }
                            long j3 = ((Field) PngjBadSignature8).getLong(null);
                            if (j3 == -1 || j3 + 4611686018427387874L < ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
                                Object[] objArr21 = new Object[1];
                                a("㉆권ෘ\ued0e䴆ⲅ賋氅챃꿋\u0ff5\uef1e体⺕軇渎", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 40896, objArr21);
                                Class<?> cls4 = Class.forName((String) objArr21[0]);
                                Object[] objArr22 = new Object[1];
                                a("㉅‹ᚫԑ箜湰峾덂ꇬ鞴訵\uf89f\uef23\uddfeて⛖", 4721 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), objArr22);
                                int intValue2 = ((Integer) cls4.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
                                Object[] objArr23 = new Object[i];
                                objArr23[1] = -711384015;
                                objArr23[0] = Integer.valueOf(intValue2);
                                Object PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1437710995);
                                if (PngjBadSignature9 == null) {
                                    char c8 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 37;
                                    int packedPositionType = 549 - ExpandableListView.getPackedPositionType(0L);
                                    Object[] objArr24 = new Object[1];
                                    b((byte) 22, (byte) ($$b & 31), (byte) ($$a[20] - 1), objArr24);
                                    String str8 = (String) objArr24[0];
                                    Class cls5 = Integer.TYPE;
                                    PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c8, makeMeasureSpec, packedPositionType, -1453402328, false, str8, new Class[]{cls5, cls5});
                                }
                                Object[] objArr25 = (Object[]) ((Method) PngjBadSignature9).invoke(null, objArr23);
                                Object PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
                                if (PngjBadSignature10 == null) {
                                    char axisFromString = (char) ((-1) - MotionEvent.axisFromString(BuildConfig.FLAVOR));
                                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 37;
                                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 549;
                                    byte b14 = $$a[20];
                                    Object[] objArr26 = new Object[1];
                                    b((byte) 34, b14, b14, objArr26);
                                    PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(axisFromString, edgeSlop, touchSlop, 1452666181, false, (String) objArr26[0], null);
                                }
                                ((Field) PngjBadSignature10).set(null, objArr25);
                                try {
                                    Long valueOf2 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                                    Object PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
                                    if (PngjBadSignature11 == null) {
                                        char c9 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 37;
                                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 549;
                                        byte[] bArr8 = $$a;
                                        byte b15 = bArr8[c];
                                        Object[] objArr27 = new Object[1];
                                        b(b15, (byte) (b15 & 13), (byte) (bArr8[20] - 1), objArr27);
                                        PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c9, threadPriority2, scrollBarFadeDuration, -1608103378, false, (String) objArr27[0], null);
                                    }
                                    ((Field) PngjBadSignature11).set(null, valueOf2);
                                    objArr2 = objArr25;
                                    i = 2;
                                } catch (Exception unused2) {
                                    throw new RuntimeException();
                                }
                            } else {
                                PngjBadSignature = (PngjException + 105) % 128;
                                Object PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
                                if (PngjBadSignature12 == null) {
                                    int capsMode = 37 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0);
                                    int argb = 549 - Color.argb(0, 0, 0, 0);
                                    byte b16 = $$a[20];
                                    Object[] objArr28 = new Object[1];
                                    b((byte) 34, b16, b16, objArr28);
                                    PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), capsMode, argb, 1452666181, false, (String) objArr28[0], null);
                                }
                                Object[] objArr29 = (Object[]) ((Field) PngjBadSignature12).get(null);
                                objArr2 = new Object[i2];
                                objArr2[0] = new int[1];
                                objArr2[1] = new int[]{0};
                                objArr2[i] = new int[]{0};
                                int i38 = ((int[]) objArr29[1])[0];
                                int i39 = ((int[]) objArr29[i])[0];
                                int identityHashCode2 = System.identityHashCode(this);
                                int c10 = defpackage.a.c(~(identityHashCode2 | (-671619110)), 345, (((~((-725358838) | (~identityHashCode2))) | 67265288) * 345) + ((((~((-725358838) | identityHashCode2)) | 671619109) * 345) - 1188498864), -711384015);
                                int i40 = c10 ^ (c10 << 13);
                                int i41 = i40 ^ (i40 >>> 17);
                                ((int[]) objArr2[0])[0] = i41 ^ (i41 << 5);
                            }
                            Object obj = objArr2[i];
                            int i42 = ((int[]) obj)[0];
                            Object obj2 = objArr2[1];
                            if (((int[]) obj2)[0] != i42) {
                                throw null;
                            }
                            Object[] objArr30 = {new int[1], new int[1], new int[1]};
                            int i43 = ((int[]) objArr2[0])[0];
                            int i44 = ((int[]) obj2)[0];
                            int i45 = ((int[]) obj)[0];
                            ((int[]) objArr30[1])[0] = i44;
                            ((int[]) objArr30[2])[0] = i45;
                            int i46 = ~((int) Process.getStartElapsedRealtime());
                            int c11 = defpackage.a.c((~(i46 | (-618265752))) | 76638228, 983, (((~((-845977484) | i46)) | (-618265752)) * (-983)) + 1273430958, i43);
                            int i47 = c11 ^ (c11 << 13);
                            int i48 = i47 ^ (i47 >>> 17);
                            ((int[]) objArr30[0])[0] = i48 ^ (i48 << 5);
                            FingerActivity fingerActivity = FingerActivity.this;
                            if (fingerActivity.Action == null) {
                                return;
                            }
                            com.identy.PngjUnsupportedException pngjUnsupportedException = fingerActivity.PngBadCharsetException;
                            try {
                                z = !Build.MODEL.trim().equals("SM-N950U");
                            } catch (Exception unused3) {
                                z = true;
                            }
                            if (FingerActivity.this.PngjExceptionInternal.equals(FingerDetectionMode.LEFT_THUMB) || FingerActivity.this.PngjExceptionInternal.equals(FingerDetectionMode.RIGHT_THUMB)) {
                                int i49 = ((int[]) objArr15[4])[0];
                                int i50 = i49 * i49;
                                int i51 = -(1709111937 * i49);
                                int i52 = (i50 ^ i51) + ((i50 & i51) << 1);
                                int i53 = -(i49 * (-977949049));
                                int i54 = (i52 & i53) + (i53 | i52);
                                int i55 = (i54 ^ 607577104) + ((607577104 & i54) << 1);
                                int i56 = i55 >> 27;
                                int a = IdentyB.a(i56 & (-63), i56 | (-63), 32, -1);
                                int i57 = (i55 & a) + (a | i55);
                                int i58 = i55 >> 20;
                                int i59 = (((i58 | (-8191)) << 1) - (i58 ^ (-8191))) / ConstantsKt.DEFAULT_BLOCK_SIZE;
                                int i60 = -((((i59 | 1) << 1) - (i59 ^ 1)) ^ i57);
                                int i61 = ((i60 | 9) << 1) - (i60 ^ 9);
                                int i62 = i61 >> 27;
                                int i63 = (((i62 | (-63)) << 1) - (i62 ^ (-63))) / 32;
                                int i64 = (i63 & 1) + (i63 | 1);
                                int i65 = 10360548 / (((-((i64 ^ 1) + ((i64 & 1) << 1))) & i61) * 1539);
                                int i66 = ((int[]) objArr30[0])[0];
                                int i67 = ((i66 * i66) - (~(-(2051766388 * i66)))) - 1;
                                int i68 = -(i66 * (-1861333612));
                                int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
                                int i70 = (i69 & (-22013936)) + ((-22013936) | i69);
                                int i71 = i70 >> 19;
                                int i72 = (((i71 | (-16383)) << 1) - (i71 ^ (-16383))) / ConstantsKt.DEFAULT_BUFFER_SIZE;
                                int i73 = (i72 & 1) + (i72 | 1);
                                int i74 = ((i70 | i73) << 1) - (i73 ^ i70);
                                int i75 = i70 >> 18;
                                int i76 = (((i75 | (-32767)) << 1) - (i75 ^ (-32767))) / 16384;
                                int i77 = -((((i76 | 1) << 1) - (i76 ^ 1)) ^ i74);
                                int i78 = (i77 & 1) + (i77 | 1);
                                int i79 = ((i78 >> 29) - 15) / 8;
                                i5 = ((-1099446) / (((-(((i79 & 1) + (i79 | 1)) - (-1))) & i78) * 1542)) + i65;
                            } else {
                                i5 = 20;
                            }
                            if (FingerActivity.this.PngjExceptionInternal.equals(FingerDetectionMode.L4F) || FingerActivity.this.PngjExceptionInternal.equals(FingerDetectionMode.R4F)) {
                                Build.MANUFACTURER.contains("motorola");
                                PngjBadSignature = (PngjException + 89) % 128;
                                i5 = 35;
                            }
                            if (!(!FingerActivity.this.PngjExceptionInternal.equals(FingerDetectionMode.TWO_THUMB))) {
                                i5 = 100;
                            }
                            FingerActivity fingerActivity2 = FingerActivity.this;
                            if (fingerActivity2.Action == null || fingerActivity2.onErrorResponse == null) {
                                return;
                            }
                            PngjException = (PngjBadSignature + 55) % 128;
                            FingerActivity.PngjException = Calendar.getInstance().getTimeInMillis();
                            FingerActivity fingerActivity3 = FingerActivity.this;
                            org.camera.preview.PngjBadCrcException pngjBadCrcException = fingerActivity3.Action;
                            com.identy.e1 e1Var = fingerActivity3.onErrorResponse;
                            HashMap<Pair<Hand, Finger>, RectF> hashMap = e1Var.getAsHighestSecurityLevelReached;
                            RectF onErrorResponse = e1Var.onErrorResponse();
                            int i80 = ((int[]) objArr19[1])[0];
                            int i81 = i80 * i80;
                            int i82 = -(1677972382 * i80);
                            int i83 = (i81 & i82) + (i81 | i82);
                            int i84 = -(i80 * 786105118);
                            int i85 = (i83 & i84) + (i84 | i83);
                            int i86 = ((i85 | (-460605820)) << 1) - ((-460605820) ^ i85);
                            int i87 = i86 >> 29;
                            int i88 = ((i87 & (-15)) + (i87 | (-15))) / 8;
                            int i89 = (i88 ^ 1) + ((i88 & 1) << 1);
                            int i90 = (i86 ^ i89) + ((i89 & i86) << 1);
                            int i91 = i86 >> 22;
                            int i92 = (-(IdentyB.a(i91 ^ (-2047), (i91 & (-2047)) << 1, 1024, -1) ^ i90)) + 9;
                            int i93 = i92 >> 24;
                            int e = IdentyB.e((i93 | (-511)) << 1, i93 ^ (-511), 256, -1);
                            int i94 = 0 / ((i92 & (-((e & 1) + (e | 1)))) * 1770);
                            if (pngjBadCrcException.getQualityScore != null && pngjBadCrcException.EnrollThumbActivity) {
                                pngjBadCrcException.EnrollThumbActivity = false;
                                String PngjBadSignature13 = pngjBadCrcException.PngjBadSignature();
                                if (PngjBadSignature13 != null && !pngjBadCrcException.getQualityScore.PngjUnsupportedException().equals(PngjBadSignature13) && pngjBadCrcException.getQualityScore.PngjUnsupportedException().equals("focus_mode_auto")) {
                                    pngjBadCrcException.getQualityScore.Attempt();
                                    pngjBadCrcException.getQualityScore.PngjException(PngjBadSignature13);
                                }
                            }
                            pngjBadCrcException.PngjPrematureEnding = i5;
                            pngjBadCrcException.PngBadCharsetException = null;
                            pngjBadCrcException.Action = null;
                            pngjBadCrcException.getPadSub3 = false;
                            pngjBadCrcException.getPadSub2 = false;
                            pngjBadCrcException.getPadSub1 = false;
                            pngjBadCrcException.Attempt = true;
                            pngjBadCrcException.e1 = hashMap;
                            org.cameracontroller.PngjBadSignature pngjBadSignature = pngjBadCrcException.getQualityScore;
                            if (pngjBadSignature instanceof org.cameracontroller.valueOf) {
                                PngjException = (PngjBadSignature + 61) % 128;
                                int i95 = ((org.cameracontroller.valueOf) pngjBadSignature).getShortform;
                            }
                            Calendar.getInstance().getTimeInMillis();
                            RectF rectF = new RectF(onErrorResponse);
                            if (!z) {
                                pngjBadCrcException.PngjOutputException();
                                return;
                            } else {
                                pngjBadCrcException.getAsHighestSecurityLevelReached = 0;
                                pngjBadCrcException.PngjException(rectF, new org.camera.preview.PngjBadCrcException.valueOf(true, false));
                                return;
                            }
                        }
                    }
                    Long valueOf3 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                    Object PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
                    if (PngjBadSignature14 == null) {
                        char blue2 = (char) (14830 - Color.blue(0));
                        int offsetBefore = 28 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0);
                        int indexOf3 = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 722;
                        byte[] bArr9 = $$a;
                        byte b17 = bArr9[c];
                        Object[] objArr31 = new Object[1];
                        b(b17, (byte) (b17 & 13), (byte) (bArr9[20] - 1), objArr31);
                        c2 = 0;
                        PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(blue2, offsetBefore, indexOf3, -815159504, false, (String) objArr31[0], null);
                    } else {
                        c2 = 0;
                    }
                    ((Field) PngjBadSignature14).set(null, valueOf3);
                    if (((int[]) PngjException$52c725b[i2])[c2] == ((int[]) PngjException$52c725b[c2])[c2]) {
                    }
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
                Object[] objArr32 = {-169115604};
                Object PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
                if (PngjBadSignature15 == null) {
                    PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 25 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 697 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1457201313, false, null, new Class[]{Integer.TYPE});
                }
                PngjException$52c725b = arid.Action.PngjException$52c725b(intValue, ((Constructor) PngjBadSignature15).newInstance(objArr32));
                Object PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                if (PngjBadSignature16 == null) {
                    char gidForName = (char) (14829 - Process.getGidForName(BuildConfig.FLAVOR));
                    int i96 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27;
                    int i97 = 720 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    Object[] objArr33 = new Object[1];
                    b((byte) 22, (byte) ($$b & 31), (byte) ($$a[20] - 1), objArr33);
                    PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature(gidForName, i96, i97, -779023007, false, (String) objArr33[0], null);
                }
                ((Field) PngjBadSignature16).set(null, PngjException$52c725b);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw new RuntimeException(th2);
                }
                throw new RuntimeException(cause2);
            }
            Object[] objArr34 = new Object[1];
            a("㉆권ෘ\ued0e䴆ⲅ賋氅챃꿋\u0ff5\uef1e体⺕軇渎", (ViewConfiguration.getScrollBarSize() >> 8) + 40897, objArr34);
            Class<?> cls6 = Class.forName((String) objArr34[0]);
            Object[] objArr35 = new Object[1];
            a("㉅‹ᚫԑ箜湰峾덂ꇬ鞴訵\uf89f\uef23\uddfeて⛖", 4721 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr35);
            intValue = ((Integer) cls6.getMethod((String) objArr35[0], Object.class).invoke(null, this)).intValue();
        }
    }

    public class getFingerPrintQualityScore implements View.OnClickListener {
        public getFingerPrintQualityScore() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FingerActivity.this.Action();
        }
    }

    public class getL1Score implements org.cameracontroller.PngjBadSignature.values {
        private /* synthetic */ long PngjException;

        public getL1Score(long j) {
            this.PngjException = j;
        }

        @Override // org.cameracontroller.PngjBadSignature.values
        public final void PngjException(boolean z) {
            try {
                LibSettings.isSaveCaptured();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class getL2Score implements Runnable {
        public static int PngjBadCrcException;
        public static int PngjException;

        public getL2Score() {
        }

        public static int PngjBadSignature() {
            int i = PngjException;
            int i2 = i % 7768728;
            PngjException = i + 1;
            if (i2 != 0) {
                return PngjBadCrcException;
            }
            int maxMemory = (int) Runtime.getRuntime().maxMemory();
            PngjBadCrcException = maxMemory;
            return maxMemory;
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    public class getL3Score implements getPadSub3B15685$PngjException {
        public getL3Score() {
        }

        @Override // com.d.e.a.c.getPadSub3B15685$PngjException
        public final void PngjBadCrcException(int i, int i2) {
            FingerActivity.this.PngjBadCrcException(i, i2);
        }
    }

    public class getMatchingTime implements View.OnClickListener {
        public getMatchingTime() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            try {
                com.identy.e1 e1Var = FingerActivity.this.onErrorResponse;
                ERRORS errors = ERRORS.USER_CANCELLED_ON_NEXT_DETECTION;
                e1Var.valueOf(errors);
                IdentySdk identySdk = IdentySdk.getInstance();
                com.identy.e1 e1Var2 = FingerActivity.this.onErrorResponse;
                identySdk.a(errors, e1Var2 != null ? e1Var2.PngjExceptionInternal() : null);
            } catch (Exception e) {
                e.printStackTrace();
            }
            FingerActivity.this.finish();
        }
    }

    public class getNfiq1Score implements com.identy.d.PngjException {
        public getNfiq1Score() {
        }

        @Override // com.identy.d.PngjException
        public final void PngjBadCrcException() {
            FingerActivity.this.isQualityFailed();
            FingerActivity.this.getPadSub1();
        }
    }

    public class getOveralTimetaken implements DialogInterface.OnDismissListener {
        public getOveralTimetaken() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            FingerActivity.this.isQualityFailed();
            FingerActivity.this.getPadSub1();
        }
    }

    public class getPadSub1 implements View.OnSystemUiVisibilityChangeListener {
        public getPadSub1() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public final void onSystemUiVisibilityChange(int i) {
            if (FingerActivity.this.PngjBadCrcException()) {
                if ((i & 4) != 0) {
                    org.camera.a.valueOf valueof = FingerActivity.this.isQualityFailed;
                    valueof.PngjException = true;
                    valueof.valueOf.runOnUiThread(valueof.new PngjBadCrcException(true));
                } else {
                    org.camera.a.valueOf valueof2 = FingerActivity.this.isQualityFailed;
                    valueof2.PngjException = false;
                    valueof2.valueOf.runOnUiThread(valueof2.new PngjBadCrcException(false));
                    FingerActivity.this.values();
                }
            }
        }
    }

    public class getPadSub2 extends BroadcastReceiver {
        private static  byte[] $$a = null;
        private static  int $$b = 0;
        private static  byte[] $$c = null;
        private static  byte[] $$d = null;
        private static  int $$e = 0;
        private static  int $$f = 0;
        private static int $10;
        private static int $11;
        private static long PngjBadCrcException;
        private static int valueOf;
        private static int values;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
        /* JADX WARN: Type inference failed for: r9v2, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$g(short s, short s2, byte b) {
            int i;
            int i2;
            int i3;
            int i4 = 1 - (s2 * 2);
            byte[] bArr = $$c;
            int i0 = 107 - (b * 2);
            int i5 = 3 - (s * 2);
            byte[] bArr2 = new byte[i4];
            if (bArr == null) {
                byte b2 = 0;
                i3 = 0;
                int i6 = i5;
                int i7 = i5 + b2;
                int i8 = i6;
                i2 = i7;
                i5 = i8;
                i = i3;
                i3 = i + 1;
                bArr2[i] = (byte) i2;
                if (i3 == i4) {
                    return new String(bArr2, 0);
                }
                int i9 = i5 + 1;
                b2 = bArr[i9];
                int i10 = i2;
                i6 = i9;
                i5 = i10;
                int i72 = i5 + b2;
                int i82 = i6;
                i2 = i72;
                i5 = i82;
                i = i3;
                i3 = i + 1;
                bArr2[i] = (byte) i2;
                if (i3 == i4) {
                }
            } else {
                i = 0;
                i2 = 0;
                i3 = i + 1;
                bArr2[i] = (byte) i2;
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
            values = 0;
            valueOf = 1;
            PngjBadCrcException = -4737908155063718131L;
        }

        public getPadSub2() {
        }

        private static void a(String str, int i, Object[] objArr) {
            char[] cArr;
            int i2 = $10;
            $11 = (i2 + 53) % 128;
            if (str != null) {
                $11 = (i2 + 87) % 128;
                cArr = str.toCharArray();
            } else {
                cArr = null;
            }
            com.d.e.ComDeA aVar = new com.d.e.ComDeA();
            char[] values2 = com.d.e.ComDeA.values(PngjBadCrcException ^ 8332534422373704609L, cArr, i);
            aVar.PngjBadSignature = 4;
            while (true) {
                int i3 = aVar.PngjBadSignature;
                if (i3 >= values2.length) {
                    break;
                }
                int i4 = i3 - 4;
                aVar.PngjBadCrcException = i4;
                try {
                    Object[] objArr2 = {Long.valueOf(values2[i3] ^ values2[i3 % 4]), Long.valueOf(i4), Long.valueOf(PngjBadCrcException)};
                    Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1668670198);
                    if (PngjBadSignature == null) {
                        char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                        int indexOf = 28 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0);
                        int i5 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        Class cls = Long.TYPE;
                        PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(maxKeyCode, indexOf, i5, 1617260721, false, "o", new Class[]{cls, cls, cls});
                    }
                    values2[i3] = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {aVar, aVar};
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1405973094);
                    if (PngjBadSignature2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (14830 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 28, 721 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), -1356718115, false, $$g(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) PngjBadSignature2).invoke(null, objArr3);
                    $10 = ($11 + 51) % 128;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();

                    if (cause == null) {

                        throw new RuntimeException(th);

                    }

                    throw new RuntimeException(cause);
                }
            }
            String str2 = new String(values2, 4, values2.length - 4);
            int i6 = $11 + 5;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            objArr[0] = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(int i, int i2, short s, Object[] objArr) {
            int i3;
            int i4;
            int i5 = (s * 38) + 80;
            byte[] bArr = $$a;
            int i6 = i2 + 6;
            int i7 = (i * 6) + 4;
            byte[] bArr2 = new byte[i6];
            if (bArr == null) {
                int i8 = i7;
                i5 = i6;
                i4 = 0;
                i7++;
                i5 = i5 + (-i8) + 5;
                i3 = i4;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i5;
                if (i4 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i8 = bArr[i7];
                i7++;
                i5 = i5 + (-i8) + 5;
                i3 = i4;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i5;
                if (i4 == i6) {
                }
            } else {
                i3 = 0;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i5;
                if (i4 == i6) {
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void c(int i, short s, short s2, Object[] objArr) {
            int i2;
            int i3 = (s * 19) + 99;
            int i4 = i * 10;
            int i5 = s2 + 4;
            byte[] bArr = $$d;
            byte[] bArr2 = new byte[16 - i4];
            int i6 = 15 - i4;
            int i7 = 0;
            if (bArr == null) {
                byte[] bArr3 = bArr;
                i7 = 0;
                int i8 = i5;
                i3 = (i3 + i5) - 5;
                i5 = i8;
                bArr = bArr3;
                i2 = i7;
                bArr2[i2] = (byte) i3;
                int i9 = i5 + 1;
                i7 = i2 + 1;
                if (i2 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                byte b = bArr[i9];
                byte[] bArr4 = bArr;
                i8 = i9;
                i5 = b;
                bArr3 = bArr4;
                i3 = (i3 + i5) - 5;
                i5 = i8;
                bArr = bArr3;
                i2 = i7;
                bArr2[i2] = (byte) i3;
                int i92 = i5 + 1;
                i7 = i2 + 1;
                if (i2 == i6) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i3;
                int i922 = i5 + 1;
                i7 = i2 + 1;
                if (i2 == i6) {
                }
            }
        }

        public static void init$0() {
            $$a = new byte[]{97, -30, 34, 124, -25, 12, 2, 45, -26, 2, 38, -42, 20, 35, -46, 26, 3, -6, 1, 16, -1, 6, -25, 12, 2, 42, -46, 26, 3, -6, 1, 16, -1, 6, 26, -6, -4, 21, 27, -18, 26, -6, -4, 21, -9};
            $$b = 170;
        }

        public static void init$1() {
            $$d = new byte[]{122, 44, -96, 114, 17, 3, -58, 64, 0, 6, 14, 11, 10, -70, 60, -47, -8, 70, -47, -16, 16, 14, -11, 19};
            $$e = 180;
        }

        public static void init$2() {
            $$c = new byte[]{14, 12, 119, -3};
            $$f = 137;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0733  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0781  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x09ef  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0a69  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0866  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0927  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x087e  */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onReceive(Context context, Intent intent) {
            char c;
            long j;
            Object PngjBadSignature;
            long j2;
            Context applicationContext;
            Object[] objArr;
            int i;
            int i2;
            int i3;
            char c2;
            Object[] valueOf$1eba2e16;
            int i4;
            Object[] objArr2;
            Object obj;
            int i5;
            Object obj2;
            int i6;
            valueOf = (values + 81) % 128;
            Object[] objArr3 = new Object[1];
            a("\uf3dbʥ\uf3ba蹧눎ꬲ嫢ﲔ섄붐﹢艸雔\uf0da처凕殲♪̒撓㥶喊噺⩉່裒", Color.argb(0, 0, 0, 0), objArr3);
            String str = (String) objArr3[0];
            Object[] objArr4 = new Object[1];
            a("桾\uf7ca栛笊\u0600Ἱ䌑\ue565媽䣳䩬鯷ൻ֧磔䠁\uf007팛뜍", Process.myPid() >> 22, objArr4);
            String str2 = (String) objArr4[0];
            try {
                Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
                if (PngjBadSignature2 == null) {
                    try {
                        char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 14830);
                        int myPid = 28 - (Process.myPid() >> 22);
                        j = 0;
                        int myTid = (Process.myTid() >> 22) + 721;
                        try {
                            byte b = $$a[18];
                            c = 18;
                            byte b2 = (byte) (b - 1);
                            i3 = 2;
                            try {
                                Object[] objArr5 = new Object[1];
                                b(b2, (byte) (b2 | 13), (byte) (b - 1), objArr5);
                                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(deadChar, myPid, myTid, -815159504, false, (String) objArr5[0], null);
                            } catch (Exception e) {
                            }
                        } catch (Exception e2) {
                            c = 18;
                            e2.printStackTrace();
                            PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
                            if (PngjBadSignature == null) {
                            }
                            j2 = ((Field) PngjBadSignature).getLong(null);
                            if (j2 != -1) {
                            }
                            if (context != null) {
                            }
                            Object[] objArr6 = new Object[1];
                            a("ꐨ뷯ꑂㄢ\ue36c既ᦝ뿸隶˟꼅셇섯俍鶇ኀ㱋餧剡⟤", (-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), objArr6);
                            Class<?> cls = Class.forName((String) objArr6[0]);
                            Object[] objArr7 = new Object[1];
                            a("綈\ue947緡斏隒辯큊瘠佌噲\udaee\u0887ᢠᬪ\ue859\udb46\ue5db추➞\uee3b", (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), objArr7);
                            int intValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, this)).intValue();
                            valueOf = (values + 111) % 128;
                            try {
                                Object[] objArr8 = {applicationContext, Integer.valueOf(intValue), 0, -561598680};
                                byte[] bArr = $$d;
                                byte b3 = bArr[8];
                                byte b4 = b3;
                                Object[] objArr9 = new Object[1];
                                c(b3, b4, (byte) (b4 - 1), objArr9);
                                Class<?> cls2 = Class.forName((String) objArr9[0]);
                                byte b5 = (byte) (bArr[8] + 1);
                                Object[] objArr10 = new Object[1];
                                c(b5, b5, bArr[10], objArr10);
                                String str3 = (String) objArr10[0];
                                Class cls3 = Integer.TYPE;
                                objArr = (Object[]) cls2.getMethod(str3, Context.class, cls3, cls3, cls3).invoke(null, objArr8);
                                if (applicationContext != null) {
                                }
                                i = ((int[]) objArr[2])[0];
                                i2 = ((int[]) objArr[3])[0];
                                if (i2 == i) {
                                }
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();

                                if (cause == null) {

                                    throw new RuntimeException(th);

                                }

                                throw new RuntimeException(cause);
                            }
                        }
                    } catch (Exception e3) {
                        c = 18;
                        j = 0;
                    }
                } else {
                    c = 18;
                    j = 0;
                    i3 = 2;
                }
                long j3 = ((Field) PngjBadSignature2).getLong(null);
                if (j3 == -1 || j3 + 4611686018427387852L < ((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue()) {
                    c2 = 16;
                    Object[] objArr11 = new Object[1];
                    a("ꐨ뷯ꑂㄢ\ue36c既ᦝ뿸隶˟꼅셇섯俍鶇ኀ㱋餧剡⟤", KeyEvent.normalizeMetaState(0), objArr11);
                    Class<?> cls4 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    a("綈\ue947緡斏隒辯큊瘠佌噲\udaee\u0887ᢠᬪ\ue859\udb46\ue5db추➞\uee3b", TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), objArr12);
                    int intValue2 = ((Integer) cls4.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
                    try {
                        Object[] objArr13 = {1118103317};
                        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
                        if (PngjBadSignature3 == null) {
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), 24 - (ViewConfiguration.getEdgeSlop() >> 16), 697 - (KeyEvent.getMaxKeyCode() >> 16), 1457201313, false, null, new Class[]{Integer.TYPE});
                        }
                        valueOf$1eba2e16 = TouchLessIDSDK$values.valueOf$1eba2e16(intValue2, ((Constructor) PngjBadSignature3).newInstance(objArr13), 1252802998);
                        Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                        if (PngjBadSignature4 == null) {
                            try {
                                char lastIndexOf = (char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 14831);
                                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 28;
                                int indexOf = 721 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                                byte[] bArr2 = $$a;
                                byte b6 = bArr2[16];
                                i4 = 0;
                                Object[] objArr14 = new Object[1];
                                b(b6, (byte) (b6 + 4), (byte) (bArr2[c] - 1), objArr14);
                                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(lastIndexOf, doubleTapTimeout, indexOf, -779023007, false, (String) objArr14[0], null);
                            } catch (Exception e4) {
                                e4.printStackTrace();
                                PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
                                if (PngjBadSignature == null) {
                                }
                                j2 = ((Field) PngjBadSignature).getLong(null);
                                if (j2 != -1) {
                                }
                                if (context != null) {
                                }
                                Object[] objArr62 = new Object[1];
                                a("ꐨ뷯ꑂㄢ\ue36c既ᦝ뿸隶˟꼅셇섯俍鶇ኀ㱋餧剡⟤", (-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), objArr62);
                                Class<?> cls5 = Class.forName((String) objArr62[0]);
                                Object[] objArr72 = new Object[1];
                                a("綈\ue947緡斏隒辯큊瘠佌噲\udaee\u0887ᢠᬪ\ue859\udb46\ue5db추➞\uee3b", (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), objArr72);
                                int intValue3 = ((Integer) cls5.getMethod((String) objArr72[0], Object.class).invoke(null, this)).intValue();
                                valueOf = (values + 111) % 128;
                                Object[] objArr82 = {applicationContext, Integer.valueOf(intValue3), 0, -561598680};
                                byte[] bArr3 = $$d;
                                byte b32 = bArr3[8];
                                byte b42 = b32;
                                Object[] objArr92 = new Object[1];
                                c(b32, b42, (byte) (b42 - 1), objArr92);
                                Class<?> cls22 = Class.forName((String) objArr92[0]);
                                byte b52 = (byte) (bArr3[8] + 1);
                                Object[] objArr102 = new Object[1];
                                c(b52, b52, bArr3[10], objArr102);
                                String str32 = (String) objArr102[0];
                                Class cls32 = Integer.TYPE;
                                objArr = (Object[]) cls22.getMethod(str32, Context.class, cls32, cls32, cls32).invoke(null, objArr82);
                                if (applicationContext != null) {
                                }
                                i = ((int[]) objArr[2])[0];
                                i2 = ((int[]) objArr[3])[0];
                                if (i2 == i) {
                                }
                            }
                        } else {
                            i4 = 0;
                        }
                        ((Field) PngjBadSignature4).set(null, valueOf$1eba2e16);
                        try {
                            Long valueOf2 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                            Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
                            if (PngjBadSignature5 == null) {
                                char gidForName = (char) (Process.getGidForName(BuildConfig.FLAVOR) + 14831);
                                int indexOf2 = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 29;
                                int scrollBarFadeDuration = 721 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                byte b7 = $$a[c];
                                byte b8 = (byte) (b7 - 1);
                                Object[] objArr15 = new Object[1];
                                b(b8, (byte) (b8 | 13), (byte) (b7 - 1), objArr15);
                                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(gidForName, indexOf2, scrollBarFadeDuration, -815159504, false, (String) objArr15[i4], null);
                            }
                            ((Field) PngjBadSignature5).set(null, valueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw new RuntimeException(th2);
                        }
                        throw new RuntimeException(cause2);
                    }
                } else {
                    Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                    if (PngjBadSignature6 == null) {
                        char deadChar2 = (char) (14830 - KeyEvent.getDeadChar(0, 0));
                        int resolveSize = 28 - View.resolveSize(0, 0);
                        int i7 = (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 721;
                        byte[] bArr4 = $$a;
                        byte b9 = bArr4[16];
                        c2 = 16;
                        Object[] objArr16 = new Object[1];
                        b(b9, (byte) (b9 + 4), (byte) (bArr4[c] - 1), objArr16);
                        PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(deadChar2, resolveSize, i7, -779023007, false, (String) objArr16[0], null);
                    } else {
                        c2 = 16;
                    }
                    Object[] objArr17 = (Object[]) ((Field) PngjBadSignature6).get(null);
                    valueOf$1eba2e16 = new Object[4];
                    valueOf$1eba2e16[0] = new int[]{0};
                    valueOf$1eba2e16[1] = new int[1];
                    valueOf$1eba2e16[3] = new int[]{0};
                    int i8 = ((int[]) objArr17[3])[0];
                    int i9 = ((int[]) objArr17[0])[0];
                    valueOf$1eba2e16[i3] = (String[]) objArr17[i3];
                    int c3 = defpackage.a.c((~((int) Process.getElapsedCpuTime())) | 931078143, -828, (((~(931078143 | 0)) | 103487830) * (-828)) - 1338267583, -880754250);
                    int i10 = c3 ^ (c3 << 13);
                    int i11 = i10 ^ (i10 >>> 17);
                    ((int[]) valueOf$1eba2e16[1])[0] = i11 ^ (i11 << 5);
                    i4 = 0;
                }
                int i12 = ((int[]) valueOf$1eba2e16[i4])[i4];
                int i13 = ((int[]) valueOf$1eba2e16[3])[i4];
                if (i13 == i12) {
                    Object[] objArr18 = new Object[4];
                    int[] iArr = new int[1];
                    objArr18[i4] = iArr;
                    objArr18[1] = new int[1];
                    int[] iArr2 = new int[1];
                    objArr18[3] = iArr2;
                    int i14 = ((int[]) valueOf$1eba2e16[1])[i4];
                    int i15 = ((int[]) valueOf$1eba2e16[3])[i4];
                    int i16 = ((int[]) valueOf$1eba2e16[i4])[i4];
                    String[] strArr = (String[]) valueOf$1eba2e16[i3];
                    iArr2[i4] = i15;
                    iArr[i4] = i16;
                    objArr18[i3] = strArr;
                    int identityHashCode = System.identityHashCode(this);
                    int i17 = ~((-412105473) | (~identityHashCode));
                    int c4 = defpackage.a.c((~(identityHashCode | 1033502549)) | i17, 338, ((621397077 | i17 | (~(412105472 | identityHashCode))) * (-338)) + 613380495, i14);
                    int i18 = c4 ^ (c4 << 13);
                    int i19 = i18 ^ (i18 >>> 17);
                    ((int[]) objArr18[1])[i4] = i19 ^ (i19 << 5);
                    values = (valueOf + 111) % 128;
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr2 = (String[]) valueOf$1eba2e16[i3];
                    if (strArr2 != null) {
                        valueOf = (values + 109) % 128;
                        int i20 = i4;
                        while (i20 < strArr2.length) {
                            int i21 = values + 63;
                            valueOf = i21 % 128;
                            if (i21 % 2 == 0) {
                                arrayList.add(strArr2[i20]);
                                i20 += 92;
                            } else {
                                arrayList.add(strArr2[i20]);
                                i20++;
                            }
                        }
                    }
                    int i22 = i4;
                    Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), i22).show();
                    Object[] objArr19 = new Object[4];
                    objArr19[i22] = new int[]{0};
                    objArr19[1] = new int[1];
                    objArr19[3] = new int[]{0};
                    int i23 = ((int[]) valueOf$1eba2e16[1])[0];
                    int i24 = ((int[]) valueOf$1eba2e16[3])[0];
                    int i25 = ((int[]) valueOf$1eba2e16[0])[0];
                    objArr19[i3] = (String[]) valueOf$1eba2e16[i3];
                    int identityHashCode2 = System.identityHashCode(this);
                    int i26 = ~identityHashCode2;
                    int c5 = defpackage.a.c((~(identityHashCode2 | 771552813)) | 33620224 | (~(i26 | (-542159878))), 369, (((~((-771552814) | i26)) | 263013160) * (-369)) + ((805173037 | i26) * (-369)) + 537320666, i23);
                    int i27 = c5 ^ (c5 << 13);
                    int i28 = i27 ^ (i27 >>> 17);
                    ((int[]) objArr19[1])[0] = i28 ^ (i28 << 5);
                }
                Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
                if (PngjBadSignature7 == null) {
                    char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int i29 = (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 36;
                    int i30 = (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 548;
                    byte b10 = $$a[c];
                    byte b11 = (byte) (b10 - 1);
                    Object[] objArr20 = new Object[1];
                    b(b11, (byte) (b11 | 13), (byte) (b10 - 1), objArr20);
                    PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(modifierMetaStateMask, i29, i30, -1608103378, false, (String) objArr20[0], null);
                }
                long j4 = ((Field) PngjBadSignature7).getLong(null);
                if (j4 == -1 || j4 + 4611686018427387782L < ((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue()) {
                    Object[] objArr21 = new Object[1];
                    a("ꐨ뷯ꑂㄢ\ue36c既ᦝ뿸隶˟꼅셇섯俍鶇ኀ㱋餧剡⟤", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, objArr21);
                    Class<?> cls6 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    a("綈\ue947緡斏隒辯큊瘠佌噲\udaee\u0887ᢠᬪ\ue859\udb46\ue5db추➞\uee3b", TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 1, objArr22);
                    int intValue4 = ((Integer) cls6.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
                    try {
                        Object[] objArr23 = new Object[i3];
                        objArr23[1] = 401726129;
                        objArr23[0] = Integer.valueOf(intValue4);
                        Object PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1437710995);
                        if (PngjBadSignature8 == null) {
                            char offsetBefore = (char) TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0);
                            int offsetBefore2 = 37 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0);
                            int indexOf3 = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 550;
                            byte[] bArr5 = $$a;
                            byte b12 = bArr5[c2];
                            Object[] objArr24 = new Object[1];
                            b(b12, (byte) (b12 + 4), (byte) (bArr5[c] - 1), objArr24);
                            String str4 = (String) objArr24[0];
                            Class cls7 = Integer.TYPE;
                            PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(offsetBefore, offsetBefore2, indexOf3, -1453402328, false, str4, new Class[]{cls7, cls7});
                        }
                        objArr2 = (Object[]) ((Method) PngjBadSignature8).invoke(null, objArr23);
                        Object PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
                        if (PngjBadSignature9 == null) {
                            char alpha = (char) Color.alpha(0);
                            int packedPositionChild = 36 - ExpandableListView.getPackedPositionChild(j);
                            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 549;
                            byte[] bArr6 = $$a;
                            byte b13 = (byte) (bArr6[21] - 1);
                            byte b14 = bArr6[c];
                            Object[] objArr25 = new Object[1];
                            b(b13, b14, b14, objArr25);
                            PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(alpha, packedPositionChild, touchSlop, 1452666181, false, (String) objArr25[0], null);
                        }
                        ((Field) PngjBadSignature9).set(null, objArr2);
                        try {
                            Long valueOf3 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                            Object PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
                            if (PngjBadSignature10 == null) {
                                char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                int myTid2 = 37 - (Process.myTid() >> 22);
                                int indexOf4 = 549 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                                byte b15 = $$a[c];
                                byte b16 = (byte) (b15 - 1);
                                Object[] objArr26 = new Object[1];
                                b(b16, (byte) (b16 | 13), (byte) (b15 - 1), objArr26);
                                PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(longPressTimeout, myTid2, indexOf4, -1608103378, false, (String) objArr26[0], null);
                            }
                            ((Field) PngjBadSignature10).set(null, valueOf3);
                            i3 = 2;
                        } catch (Exception unused2) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw new RuntimeException(th3);
                        }
                        throw new RuntimeException(cause3);
                    }
                } else {
                    Object PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
                    if (PngjBadSignature11 == null) {
                        char indexOf5 = (char) ((-1) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0));
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 37;
                        int argb = Color.argb(0, 0, 0, 0) + 549;
                        byte[] bArr7 = $$a;
                        byte b17 = (byte) (bArr7[21] - 1);
                        byte b18 = bArr7[c];
                        Object[] objArr27 = new Object[1];
                        b(b17, b18, b18, objArr27);
                        PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf5, absoluteGravity, argb, 1452666181, false, (String) objArr27[0], null);
                    }
                    Object[] objArr28 = (Object[]) ((Field) PngjBadSignature11).get(null);
                    objArr2 = new Object[]{new int[1], new int[1], new int[1]};
                    int i31 = ((int[]) objArr28[1])[0];
                    int i32 = ((int[]) objArr28[i3])[0];
                    ((int[]) objArr2[1])[0] = i31;
                    ((int[]) objArr2[i3])[0] = i32;
                    int identityHashCode3 = System.identityHashCode(this);
                    int c6 = defpackage.a.c(~((~identityHashCode3) | (-18874769)), 476, ((~((-18874769) | identityHashCode3)) * 952) + (((102130242 | 0) * (-476)) - 1855824102), 401726129);
                    int i33 = c6 ^ (c6 << 13);
                    int i34 = i33 ^ (i33 >>> 17);
                    ((int[]) objArr2[0])[0] = i34 ^ (i34 << 5);
                }
                obj = objArr2[i3];
                i5 = ((int[]) obj)[0];
                obj2 = objArr2[1];
                i6 = ((int[]) obj2)[0];
            } catch (Exception e5) {
                c = 18;
                j = 0;
            }
            if (i6 != i5) {
                throw new RuntimeException(String.valueOf(i6));
            }
            Object[] objArr29 = {new int[1], new int[1], new int[1]};
            int i35 = ((int[]) objArr2[0])[0];
            int i36 = ((int[]) obj2)[0];
            int i37 = ((int[]) obj)[0];
            ((int[]) objArr29[1])[0] = i36;
            ((int[]) objArr29[2])[0] = i37;
            int identityHashCode4 = System.identityHashCode(this);
            int i38 = ~identityHashCode4;
            int c7 = defpackage.a.c((~(identityHashCode4 | (-65496544))) | (~(i38 | (-1343752705))), 765, (((~((-65496544) | i38)) | 54993987) * 1530) + (((((~((-54993988) | i38)) | (~((-10502557) | identityHashCode4))) | (~((-1343752705) | identityHashCode4))) * 765) - 555581659), i35);
            int i39 = c7 ^ (c7 << 13);
            int i40 = i39 ^ (i39 >>> 17);
            ((int[]) objArr29[0])[0] = i40 ^ (i40 << 5);
            int i41 = values + 31;
            valueOf = i41 % 128;
            if (i41 % 2 == 0) {
                FingerActivity fingerActivity = FingerActivity.this;
                fingerActivity.PngjBadSignature(fingerActivity.onErrorResponse.onErrorResponse());
                throw null;
            }
            FingerActivity fingerActivity2 = FingerActivity.this;
            fingerActivity2.PngjBadSignature(fingerActivity2.onErrorResponse.onErrorResponse());
            PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
            if (PngjBadSignature == null) {
                char c8 = (char) (31078 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)));
                int i42 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 48;
                int indexOf6 = 1042 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0);
                byte b19 = $$a[c];
                byte b20 = (byte) (b19 - 1);
                Object[] objArr30 = new Object[1];
                b(b20, (byte) (b20 | 13), (byte) (b19 - 1), objArr30);
                PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(c8, i42, indexOf6, 159283629, false, (String) objArr30[0], null);
            }
            j2 = ((Field) PngjBadSignature).getLong(null);
            if (j2 != -1 || j2 + 4611686018427387886L < ((Long) defpackage.a.i(str, str2, null, null, null)).longValue()) {
                applicationContext = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
                Object[] objArr622 = new Object[1];
                a("ꐨ뷯ꑂㄢ\ue36c既ᦝ뿸隶˟꼅셇섯俍鶇ኀ㱋餧剡⟤", (-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), objArr622);
                Class<?> cls52 = Class.forName((String) objArr622[0]);
                Object[] objArr722 = new Object[1];
                a("綈\ue947緡斏隒辯큊瘠佌噲\udaee\u0887ᢠᬪ\ue859\udb46\ue5db추➞\uee3b", (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), objArr722);
                int intValue32 = ((Integer) cls52.getMethod((String) objArr722[0], Object.class).invoke(null, this)).intValue();
                valueOf = (values + 111) % 128;
                Object[] objArr822 = {applicationContext, Integer.valueOf(intValue32), 0, -561598680};
                byte[] bArr32 = $$d;
                byte b322 = bArr32[8];
                byte b422 = b322;
                Object[] objArr922 = new Object[1];
                c(b322, b422, (byte) (b422 - 1), objArr922);
                Class<?> cls222 = Class.forName((String) objArr922[0]);
                byte b522 = (byte) (bArr32[8] + 1);
                Object[] objArr1022 = new Object[1];
                c(b522, b522, bArr32[10], objArr1022);
                String str322 = (String) objArr1022[0];
                Class cls322 = Integer.TYPE;
                objArr = (Object[]) cls222.getMethod(str322, Context.class, cls322, cls322, cls322).invoke(null, objArr822);
                if (applicationContext != null) {
                    Object PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1200224935);
                    if (PngjBadSignature12 == null) {
                        char resolveSize2 = (char) (31077 - View.resolveSize(0, 0));
                        int trimmedLength = 49 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR);
                        int i43 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1042;
                        byte[] bArr8 = $$a;
                        byte b21 = bArr8[21];
                        byte b22 = bArr8[c];
                        Object[] objArr31 = new Object[1];
                        b(b21, (byte) (b22 - 1), b22, objArr31);
                        PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(resolveSize2, trimmedLength, i43, 1150904546, false, (String) objArr31[0], null);
                    }
                    ((Field) PngjBadSignature12).set(null, objArr);
                    try {
                        Long valueOf4 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str2, null).invoke(null, null)).longValue());
                        Object PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
                        if (PngjBadSignature13 == null) {
                            char c9 = (char) (31078 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                            int i44 = 50 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            int packedPositionType = ExpandableListView.getPackedPositionType(j) + 1043;
                            byte b23 = $$a[c];
                            byte b24 = (byte) (b23 - 1);
                            Object[] objArr32 = new Object[1];
                            b(b24, (byte) (b24 | 13), (byte) (b23 - 1), objArr32);
                            PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c9, i44, packedPositionType, 159283629, false, (String) objArr32[0], null);
                        }
                        ((Field) PngjBadSignature13).set(null, valueOf4);
                    } catch (Exception unused3) {
                        throw new RuntimeException();
                    }
                }
            } else {
                Object PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1200224935);
                if (PngjBadSignature14 == null) {
                    char c10 = (char) (31078 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)));
                    int axisFromString = 48 - MotionEvent.axisFromString(BuildConfig.FLAVOR);
                    int indexOf7 = 1043 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                    byte[] bArr9 = $$a;
                    byte b25 = bArr9[21];
                    byte b26 = bArr9[c];
                    Object[] objArr33 = new Object[1];
                    b(b25, (byte) (b26 - 1), b26, objArr33);
                    PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c10, axisFromString, indexOf7, 1150904546, false, (String) objArr33[0], null);
                }
                Object[] objArr34 = (Object[]) ((Field) PngjBadSignature14).get(null);
                objArr = new Object[]{0, 0, new int[]{0}, new int[]{0}, new int[1]};
                int i45 = ((int[]) objArr34[3])[0];
                int i46 = ((int[]) objArr34[2])[0];
                String str5 = (String) objArr34[1];
                String str6 = (String) objArr34[0];
                int identityHashCode5 = System.identityHashCode(this);
                int c11 = defpackage.a.c((~(identityHashCode5 | 37778409)) | (~((-586578961) | identityHashCode5)) | 548801552, -69, (((~((-37777409) | identityHashCode5)) | (~(586579961 | identityHashCode5))) * 69) - 163110276, -561529611);
                int i47 = c11 ^ (c11 << 13);
                int i48 = i47 ^ (i47 >>> 17);
                ((int[]) objArr[4])[0] = i48 ^ (i48 << 5);
                valueOf = (values + 105) % 128;
            }
            i = ((int[]) objArr[2])[0];
            i2 = ((int[]) objArr[3])[0];
            if (i2 == i) {
                Object[] objArr35 = {0, 0, new int[]{0}, new int[]{0}, new int[1]};
                int i49 = ((int[]) objArr[4])[0];
                int i50 = ((int[]) objArr[3])[0];
                int i51 = ((int[]) objArr[2])[0];
                String str7 = (String) objArr[1];
                String str8 = (String) objArr[0];
                int identityHashCode6 = System.identityHashCode(this);
                int i52 = ~identityHashCode6;
                int c12 = defpackage.a.c((~(identityHashCode6 | 372207441)) | 67706896, 49, (((~(i52 | (-996564812))) | 372207441 | (~(996564811 | identityHashCode6))) * (-49)) + (((~(372207441 | i52)) | (-1064271708)) * 98) + 33016504, i49);
                int i53 = c12 ^ (c12 << 13);
                int i54 = i53 ^ (i53 >>> 17);
                ((int[]) objArr35[4])[0] = i54 ^ (i54 << 5);
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add((String) objArr[1]);
            arrayList2.add((String) objArr[0]);
            int[] iArr3 = new int[i2];
            int i55 = i2 - 1;
            iArr3[i55] = 1;
            Toast.makeText((Context) null, iArr3[((i2 * i55) % 2) - 1], 1).show();
            Object[] objArr36 = {0, 0, new int[]{0}, new int[]{0}, new int[1]};
            int i56 = ((int[]) objArr[4])[0];
            int i57 = ((int[]) objArr[3])[0];
            int i58 = ((int[]) objArr[2])[0];
            String str9 = (String) objArr[1];
            String str10 = (String) objArr[0];
            int i59 = ~System.identityHashCode(this);
            int c13 = defpackage.a.c((~(i59 | (-539497108))) | 538968721, 52, (((~(539497107 | i59)) | (~((-84860263) | i59)) | 84331876) * (-52)) + (((~(623828983 | i59)) * 52) - 1541922091), i56);
            int i60 = c13 ^ (c13 << 13);
            int i61 = i60 ^ (i60 >>> 17);
            ((int[]) objArr36[4])[0] = i61 ^ (i61 << 5);
        }
    }

    public class getPadSub3 implements View.OnClickListener {
        public getPadSub3() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            try {
                FingerActivity fingerActivity = FingerActivity.this;
                fingerActivity.values((Pair<Hand, Finger>[]) fingerActivity.onErrorResponse.PngjExceptionInternal());
            } catch (Exception e) {
                e.printStackTrace();
            }
            FingerActivity.this.finish();
        }
    }

    public class getProcessingTime implements Runnable {
        private /* synthetic */ int PngjBadCrcException;

        public getProcessingTime(int i) {
            this.PngjBadCrcException = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                ((TextView) FingerActivity.this.findViewById(R.id.id_header_title)).setText(this.PngjBadCrcException);
            } catch (Exception unused) {
            }
        }
    }

    public class getQualityScore implements View.OnClickListener {
        public getQualityScore() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            try {
                FingerActivity fingerActivity = FingerActivity.this;
                fingerActivity.values((Pair<Hand, Finger>[]) fingerActivity.onErrorResponse.PngjExceptionInternal());
            } catch (Exception e) {
                e.printStackTrace();
            }
            FingerActivity.this.finish();
        }
    }

    public class getScore implements DialogInterface.OnDismissListener {
        public getScore() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            try {
                FingerActivity fingerActivity = FingerActivity.this;
                fingerActivity.values((Pair<Hand, Finger>[]) fingerActivity.onErrorResponse.PngjExceptionInternal());
            } catch (Exception e) {
                e.printStackTrace();
            }
            FingerActivity.this.finish();
        }
    }

    public class getSpoofScore implements Runnable {
        private /* synthetic */ int PngjException;
        private /* synthetic */ boolean valueOf;

        public getSpoofScore(boolean z, int i) {
            this.valueOf = z;
            this.PngjException = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                FingerActivity.this.findViewById(R.id.rol_twist_info_msg).setVisibility(0);
                if (!this.valueOf && FingerActivity.this.onErrorResponse.uxd566jk.getScore.equals(com.identy.CapturePosition.HORIZONTAL)) {
                    FingerActivity fingerActivity = FingerActivity.this;
                    int i = R.id.rol_twist_info_image;
                    fingerActivity.findViewById(i).setRotationX(this.PngjException);
                    FingerActivity.this.findViewById(i).setVisibility(0);
                    return;
                }
                FingerActivity fingerActivity2 = FingerActivity.this;
                int i2 = R.id.rol_twist_info_image_thumb;
                fingerActivity2.findViewById(i2).setRotationY(this.PngjException);
                FingerActivity.this.findViewById(i2).setRotationX(0.0f);
                FingerActivity.this.findViewById(i2).setVisibility(0);
            } catch (Exception unused) {
            }
        }
    }

    public class isAuthSucess implements Runnable {
        private /* synthetic */ int PngjException;

        public isAuthSucess(int i) {
            this.PngjException = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                ((ImageView) FingerActivity.this.findViewById(R.id.middle_info_image)).setImageResource(this.PngjException);
            } catch (Exception unused) {
            }
        }
    }

    public static class isQualityFailed implements Runnable {
        private final byte[] PngjBadSignature;
        private final Camera valueOf;

        public isQualityFailed(Camera camera, byte[] bArr) {
            this.valueOf = camera;
            this.PngjBadSignature = bArr;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.valueOf.addCallbackBuffer(this.PngjBadSignature);
        }
    }

    public class onErrorResponse implements Runnable {
        public onErrorResponse() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Toast.makeText(FingerActivity.this, R.string.id_select_hand, 1).show();
        }
    }

    public class valueOf implements View.OnClickListener {
        public valueOf() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FingerActivity.this.Attempt = null;
        }
    }

    public class values implements Runnable {
        public values() {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    private static String $$l(short s, int i, int i2) {
        int i3 = i2 * 3;
        int i4 = (s * 2) + 107;
        byte[] bArr = $$j;
        int i5 = 4 - (i * 3);
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i5++;
            i4 += i5;
            bArr = bArr;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i3) {
                return new String(bArr2, 0);
            }
            byte b = bArr[i5];
            i5++;
            i4 = b + i4;
            bArr = bArr;
            i6 = i7;
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        getFingers = 0;
        isFoundMatchingTemplates = 1;
        toJson = 0;
        setFoundMatchingTemplates = 1;
        getProcessingTime();
        valueOf = true;
        PngjBadSignature = false;
        PngjPrematureEnding = false;
        int i = getFingers + 75;
        isFoundMatchingTemplates = i % 128;
        if (i % 2 == 0) {
            int i2 = 11 / 0;
        }
    }

    private static /* synthetic */ Object Action(Object[] objArr) {
        String str = Build.MODEL;
        if (!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) {
            String str2 = Build.FINGERPRINT;
            if (!str2.startsWith("generic")) {
                setFoundMatchingTemplates = (toJson + 3) % 128;
                if (!str2.startsWith("unknown")) {
                    String str3 = Build.HARDWARE;
                    if (!str3.contains("goldfish")) {
                        int i = setFoundMatchingTemplates;
                        toJson = ((i ^ 63) + ((i & 63) << 1)) % 128;
                        if (!str3.contains("ranchu")) {
                            int i2 = setFoundMatchingTemplates;
                            int i3 = ((i2 | 3) << 1) - (i2 ^ 3);
                            toJson = i3 % 128;
                            if (i3 % 2 != 0) {
                                str.contains("google_sdk");
                                throw null;
                            }
                            if (!str.contains("google_sdk") && !str.contains("Emulator")) {
                                int i4 = toJson;
                                int i5 = (i4 & 35) + (i4 | 35);
                                setFoundMatchingTemplates = i5 % 128;
                                if (i5 % 2 == 0) {
                                    str.contains("Android SDK built for x86");
                                    throw null;
                                }
                                if (!str.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion")) {
                                    int i6 = toJson;
                                    setFoundMatchingTemplates = ((i6 ^ 103) + ((i6 & 103) << 1)) % 128;
                                    String str4 = Build.PRODUCT;
                                    if (!str4.contains("sdk_google")) {
                                        int i7 = toJson;
                                        setFoundMatchingTemplates = ((i7 & 101) + (i7 | 101)) % 128;
                                        if (!str4.contains("google_sdk")) {
                                            int i8 = setFoundMatchingTemplates;
                                            toJson = ((i8 ^ 85) + ((i8 & 85) << 1)) % 128;
                                            if (!str4.contains("sdk") && !str4.contains("sdk_x86")) {
                                                int i9 = toJson;
                                                setFoundMatchingTemplates = ((i9 & 121) + (i9 | 121)) % 128;
                                                if (!str4.contains("sdk_gphone64_arm64")) {
                                                    toJson = (setFoundMatchingTemplates + 61) % 128;
                                                    if (!str4.contains("vbox86p") && !str4.contains("emulator") && !str4.contains("simulator")) {
                                                        int i10 = setFoundMatchingTemplates + 17;
                                                        toJson = i10 % 128;
                                                        if (i10 % 2 == 0) {
                                                            return Boolean.FALSE;
                                                        }
                                                        throw null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return Boolean.TRUE;
    }

    private void Capture2IndexActivity() {
        PngjException(com.identy.a.PngjException.values(), -1873363838, new Object[]{this}, com.identy.a.PngjException.values(), 1873363863, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x01f1, code lost:
    
        0 = com.identy.FingerActivity.toJson;
        com.identy.FingerActivity.setFoundMatchingTemplates = (0 + 21) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01f9, code lost:
    
        if (0 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01fb, code lost:
    
        0 = (0 ^ 67) + ((0 & 67) << 1);
        com.identy.FingerActivity.setFoundMatchingTemplates = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0207, code lost:
    
        if ((0 % 2) == 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0209, code lost:
    
        if (0 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x020b, code lost:
    
        0 = new com.identy.ui.c.getPadSub2(0);
        0.PngjException = com.identy.R.string.id_attempt_reached_next_detection_no_retries;
        0 = com.identy.R.string.id_no;
        0 = new com.identy.FingerActivity.getQualityScore(0);
        0.PngjBadCrcException = 0;
        0.PngjBadSignature = 0;
        0 = com.identy.R.string.id_yes;
        0 = new com.identy.FingerActivity.getFingerPrintQualityScore(0);
        0.values = 0;
        0.valueOf = 0;
        0.show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x022d, code lost:
    
        0 = com.identy.FingerActivity.toJson;
        0 = ((0 | 49) << 1) - (0 ^ 49);
        com.identy.FingerActivity.setFoundMatchingTemplates = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x023b, code lost:
    
        if ((0 % 2) == 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x023d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x023e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x023f, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d A[Catch: Exception -> 0x002e, TRY_ENTER, TryCatch #1 {Exception -> 0x002e, blocks: (B:4:0x000d, B:106:0x0029, B:6:0x0031, B:10:0x0049, B:11:0x0053, B:16:0x007f, B:21:0x009d, B:28:0x00d3, B:31:0x00da, B:32:0x00e9, B:34:0x010f, B:41:0x013f, B:43:0x0145, B:47:0x0180, B:49:0x0183, B:56:0x0196, B:58:0x01ac, B:59:0x01bc, B:61:0x01b8, B:70:0x020b, B:76:0x0240, B:82:0x01c5, B:84:0x01db, B:85:0x01eb, B:87:0x01e7, B:92:0x00de, B:93:0x00e4, B:95:0x00a4, B:98:0x0086, B:110:0x0026, B:111:0x0267, B:113:0x0271, B:105:0x001b), top: B:2:0x000b, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01db A[Catch: Exception -> 0x002e, TryCatch #1 {Exception -> 0x002e, blocks: (B:4:0x000d, B:106:0x0029, B:6:0x0031, B:10:0x0049, B:11:0x0053, B:16:0x007f, B:21:0x009d, B:28:0x00d3, B:31:0x00da, B:32:0x00e9, B:34:0x010f, B:41:0x013f, B:43:0x0145, B:47:0x0180, B:49:0x0183, B:56:0x0196, B:58:0x01ac, B:59:0x01bc, B:61:0x01b8, B:70:0x020b, B:76:0x0240, B:82:0x01c5, B:84:0x01db, B:85:0x01eb, B:87:0x01e7, B:92:0x00de, B:93:0x00e4, B:95:0x00a4, B:98:0x0086, B:110:0x0026, B:111:0x0267, B:113:0x0271, B:105:0x001b), top: B:2:0x000b, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e7 A[Catch: Exception -> 0x002e, TryCatch #1 {Exception -> 0x002e, blocks: (B:4:0x000d, B:106:0x0029, B:6:0x0031, B:10:0x0049, B:11:0x0053, B:16:0x007f, B:21:0x009d, B:28:0x00d3, B:31:0x00da, B:32:0x00e9, B:34:0x010f, B:41:0x013f, B:43:0x0145, B:47:0x0180, B:49:0x0183, B:56:0x0196, B:58:0x01ac, B:59:0x01bc, B:61:0x01b8, B:70:0x020b, B:76:0x0240, B:82:0x01c5, B:84:0x01db, B:85:0x01eb, B:87:0x01e7, B:92:0x00de, B:93:0x00e4, B:95:0x00a4, B:98:0x0086, B:110:0x0026, B:111:0x0267, B:113:0x0271, B:105:0x001b), top: B:2:0x000b, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00e4 A[Catch: Exception -> 0x002e, TryCatch #1 {Exception -> 0x002e, blocks: (B:4:0x000d, B:106:0x0029, B:6:0x0031, B:10:0x0049, B:11:0x0053, B:16:0x007f, B:21:0x009d, B:28:0x00d3, B:31:0x00da, B:32:0x00e9, B:34:0x010f, B:41:0x013f, B:43:0x0145, B:47:0x0180, B:49:0x0183, B:56:0x0196, B:58:0x01ac, B:59:0x01bc, B:61:0x01b8, B:70:0x020b, B:76:0x0240, B:82:0x01c5, B:84:0x01db, B:85:0x01eb, B:87:0x01e7, B:92:0x00de, B:93:0x00e4, B:95:0x00a4, B:98:0x0086, B:110:0x0026, B:111:0x0267, B:113:0x0271, B:105:0x001b), top: B:2:0x000b, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00a4 A[Catch: Exception -> 0x002e, TRY_LEAVE, TryCatch #1 {Exception -> 0x002e, blocks: (B:4:0x000d, B:106:0x0029, B:6:0x0031, B:10:0x0049, B:11:0x0053, B:16:0x007f, B:21:0x009d, B:28:0x00d3, B:31:0x00da, B:32:0x00e9, B:34:0x010f, B:41:0x013f, B:43:0x0145, B:47:0x0180, B:49:0x0183, B:56:0x0196, B:58:0x01ac, B:59:0x01bc, B:61:0x01b8, B:70:0x020b, B:76:0x0240, B:82:0x01c5, B:84:0x01db, B:85:0x01eb, B:87:0x01e7, B:92:0x00de, B:93:0x00e4, B:95:0x00a4, B:98:0x0086, B:110:0x0026, B:111:0x0267, B:113:0x0271, B:105:0x001b), top: B:2:0x000b, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void Capture2TActivity() {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2 = setFoundMatchingTemplates + 89;
        toJson = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                IdentySdk.getInstance();
                IdentySdk.getInstance().isDisplayTransactionAlerts();
                throw null;
            }
            IdentySdk identySdk = IdentySdk.getInstance();
            if (!IdentySdk.getInstance().isDisplayTransactionAlerts()) {
                try {
                    values((Pair<Hand, Finger>[]) this.onErrorResponse.PngjExceptionInternal());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                finish();
                return;
            }
            com.identy.e1 e1Var = this.onErrorResponse;
            boolean z4 = false;
            if (e1Var.PngjExceptionInternal.size() > 0) {
                int i3 = setFoundMatchingTemplates;
                toJson = ((i3 ^ com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground) + ((i3 & com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground) << 1)) % 128;
                z = e1Var.PngjExceptionInternal.contains(null);
            } else {
                z = false;
            }
            int intValue = identySdk.getQualityTriesCounter(this.PngjExceptionInternal).intValue();
            int intValue2 = identySdk.c(this.PngjExceptionInternal).intValue();
            if (identySdk.isEnableSkip()) {
                int i4 = setFoundMatchingTemplates;
                int i5 = (i4 ^ 77) + ((i4 & 77) << 1);
                toJson = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                if (!z) {
                    if (intValue >= identySdk.getQualityMinRetries()) {
                        z2 = true;
                    }
                } else if (intValue2 >= identySdk.getSpoofMinRetries()) {
                    int i6 = setFoundMatchingTemplates;
                    toJson = ((i6 & 121) + (i6 | 121)) % 128;
                    z2 = true;
                }
                if (z) {
                    if (intValue >= identySdk.getQualityMaxRetries()) {
                        z3 = true;
                    }
                    toJson = (setFoundMatchingTemplates + 119) % 128;
                    z3 = false;
                } else {
                    if (intValue2 >= identySdk.getSpoofMaxRetries()) {
                        int i7 = toJson;
                        setFoundMatchingTemplates = ((i7 ^ 59) + ((i7 & 59) << 1)) % 128;
                        z3 = true;
                    }
                    toJson = (setFoundMatchingTemplates + 119) % 128;
                    z3 = false;
                }
                if (z) {
                    identySdk.incrementQualityTriesCounter(this.PngjExceptionInternal);
                } else {
                    int i8 = setFoundMatchingTemplates;
                    int i9 = ((i8 | 5) << 1) - (i8 ^ 5);
                    toJson = i9 % 128;
                    if (i9 % 2 != 0) {
                        identySdk.e(this.PngjExceptionInternal);
                        int i10 = 57 / 0;
                    } else {
                        identySdk.e(this.PngjExceptionInternal);
                    }
                }
                boolean booleanValue = ((Boolean) PngjException(com.identy.a.PngjException.values(), -1456071114, new Object[]{this}, com.identy.a.PngjException.values(), 1456071122, com.identy.a.PngjException.values(), com.identy.a.PngjException.values())).booleanValue();
                if (z3 && (!com.identy.e1.valueOf(false))) {
                    toJson = (setFoundMatchingTemplates + 123) % 128;
                    z4 = true;
                } else {
                    int i11 = setFoundMatchingTemplates;
                    toJson = (((i11 | 67) << 1) - (i11 ^ 67)) % 128;
                }
                if (!z4) {
                    int i12 = setFoundMatchingTemplates;
                    int i13 = ((i12 | 69) << 1) - (i12 ^ 69);
                    toJson = i13 % 128;
                    if (i13 % 2 != 0) {
                        identySdk.isEnableAllFingerNistTemplate();
                        throw null;
                    }
                    if (identySdk.isEnableAllFingerNistTemplate()) {
                        com.identy.ui.c.PngjUnsupportedException pngjUnsupportedException = new com.identy.ui.c.PngjUnsupportedException(this, this.getQualityScore, this.PngjExceptionInternal, (FingerDetectionMode) PngjException(com.identy.a.PngjException.values(), -388390624, new Object[]{this}, com.identy.a.PngjException.values(), 388390631, com.identy.a.PngjException.values(), com.identy.a.PngjException.values()));
                        this.getPadSub1 = pngjUnsupportedException;
                        pngjUnsupportedException.show();
                        int i14 = setFoundMatchingTemplates;
                        toJson = ((i14 ^ 125) + ((i14 & 125) << 1)) % 128;
                        return;
                    }
                }
                if (z4) {
                    int i15 = toJson;
                    setFoundMatchingTemplates = ((i15 ^ 27) + ((i15 & 27) << 1)) % 128;
                    if (booleanValue) {
                        com.identy.ui.c.getPadSub2 getpadsub2 = new com.identy.ui.c.getPadSub2(this);
                        getpadsub2.PngjException = R.string.id_attempt_reached_next_detection;
                        int i16 = R.string.id_retry;
                        e1 e1Var2 = new e1();
                        getpadsub2.values = i16;
                        getpadsub2.valueOf = e1Var2;
                        if (z2) {
                            int i17 = R.string.id_process;
                            a aVar = new a();
                            getpadsub2.PngjBadCrcException = i17;
                            getpadsub2.PngjBadSignature = aVar;
                        } else {
                            getpadsub2.PngjException = R.string.id_attempt_reached_next_detection_no_skip;
                        }
                        getpadsub2.show();
                        return;
                    }
                }
                if (z4 && !booleanValue) {
                    com.identy.ui.c.getPadSub2 getpadsub22 = new com.identy.ui.c.getPadSub2(this);
                    getpadsub22.PngjException = R.string.id_attempt_reached_no_next_detection;
                    int i18 = R.string.id_retry;
                    PngBadCharsetException pngBadCharsetException = new PngBadCharsetException();
                    getpadsub22.values = i18;
                    getpadsub22.valueOf = pngBadCharsetException;
                    if (z2) {
                        getpadsub22.PngjException = R.string.id_attempt_reached_no_next_detection_no_skip;
                    } else {
                        int i19 = R.string.id_EXIT;
                        getPadSub3 getpadsub3 = new getPadSub3();
                        getpadsub22.PngjBadCrcException = i19;
                        getpadsub22.PngjBadSignature = getpadsub3;
                    }
                    getpadsub22.show();
                    return;
                }
                com.identy.ui.c.a aVar2 = new com.identy.ui.c.a(this);
                aVar2.PngjBadSignature = R.string.id_spoof_final_message;
                aVar2.PngjException = R.string.id_done;
                aVar2.values(new getScore()).show();
                i = setFoundMatchingTemplates + 97;
                toJson = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
                return;
            }
            z2 = false;
            if (z) {
            }
            if (z) {
            }
            boolean booleanValue2 = ((Boolean) PngjException(com.identy.a.PngjException.values(), -1456071114, new Object[]{this}, com.identy.a.PngjException.values(), 1456071122, com.identy.a.PngjException.values(), com.identy.a.PngjException.values())).booleanValue();
            if (z3) {
            }
            int i112 = setFoundMatchingTemplates;
            toJson = (((i112 | 67) << 1) - (i112 ^ 67)) % 128;
            if (!z4) {
            }
            if (z4) {
            }
            if (z4) {
                com.identy.ui.c.getPadSub2 getpadsub222 = new com.identy.ui.c.getPadSub2(this);
                getpadsub222.PngjException = R.string.id_attempt_reached_no_next_detection;
                int i182 = R.string.id_retry;
                PngBadCharsetException pngBadCharsetException2 = new PngBadCharsetException();
                getpadsub222.values = i182;
                getpadsub222.valueOf = pngBadCharsetException2;
                if (z2) {
                }
                getpadsub222.show();
                return;
            }
            com.identy.ui.c.a aVar22 = new com.identy.ui.c.a(this);
            aVar22.PngjBadSignature = R.string.id_spoof_final_message;
            aVar22.PngjException = R.string.id_done;
            aVar22.values(new getScore()).show();
            i = setFoundMatchingTemplates + 97;
            toJson = i % 128;
            if (i % 2 == 0) {
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            toJson = (setFoundMatchingTemplates + 65) % 128;
        }
    }

    private void Capture4FActivity() {
        int i = setFoundMatchingTemplates;
        toJson = ((i & 53) + (i | 53)) % 128;
        com.identy.e1 e1Var = this.onErrorResponse;
        if (e1Var != null) {
            int i2 = i + 11;
            toJson = i2 % 128;
            int i3 = i2 % 2;
            e1Var.PngjUnsupportedException();
            if (i3 != 0) {
                int i4 = 69 / 0;
            }
            toJson = (setFoundMatchingTemplates + 95) % 128;
        }
    }

    private void CaptureFingersActivity() {
        int i = setFoundMatchingTemplates;
        toJson = ((i ^ 101) + ((i & 101) << 1)) % 128;
        this.PngjExceptionInternal = this.CapturePosition[this.CaptureThumbActivity];
        getPadSub2();
        int i2 = toJson;
        setFoundMatchingTemplates = (((i2 | 53) << 1) - (i2 ^ 53)) % 128;
    }

    private void CaptureMode() {
        PngjException(com.identy.a.PngjException.values(), 797268418, new Object[]{this}, com.identy.a.PngjException.values(), -797268400, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        0.cancel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        0 = com.identy.FingerActivity.setFoundMatchingTemplates;
        com.identy.FingerActivity.toJson = ((0 ^ 91) + ((0 & 91) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001c, code lost:
    
        if (0 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (0 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
    
        ((android.widget.TextView) 0.findViewById(com.identy.R.id.id_header_title)).setTextColor(-1);
        0.isAuthSucess = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        0 = com.identy.FingerActivity.toJson;
        com.identy.FingerActivity.setFoundMatchingTemplates = ((0 & 89) + (0 | 89)) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object PngBadCharsetException(Object[] objArr) {
        ObjectAnimator objectAnimator;
        FingerActivity fingerActivity = (FingerActivity) objArr[0];
        int i = toJson + 65;
        setFoundMatchingTemplates = i % 128;
        try {
            if (i % 2 == 0) {
                objectAnimator = fingerActivity.isAuthSucess;
                int i2 = 57 / 0;
            } else {
                objectAnimator = fingerActivity.isAuthSucess;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static /* synthetic */ Object PngjBadCrcException(Object[] objArr) {
        FingerActivity fingerActivity = (FingerActivity) objArr[0];
        int i = setFoundMatchingTemplates;
        toJson = (i + 95) % 128;
        if (fingerActivity.CaptureThumbActivity + 1 >= fingerActivity.CapturePosition.length) {
            int i2 = ((i | 53) << 1) - (i ^ 53);
            toJson = i2 % 128;
            if (i2 % 2 == 0) {
                return Boolean.FALSE;
            }
            int i3 = 68 / 0;
            return Boolean.FALSE;
        }
        int i4 = (i + 67) % 128;
        toJson = i4;
        int i5 = (i4 & 27) + (i4 | 27);
        setFoundMatchingTemplates = i5 % 128;
        if (i5 % 2 != 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    private static boolean PngjBadSignature(Context context) {
        int i = toJson;
        int i2 = (i ^ 93) + ((i & 93) << 1);
        setFoundMatchingTemplates = i2 % 128;
        int i3 = i2 % 2;
        boolean z = context.getResources().getBoolean(R.bool.isTablet);
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x01a0, code lost:
    
        if (0 < 0.length) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01f0, code lost:
    
        com.identy.FingerActivity.toJson = (0 + 87) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01f6, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01ac, code lost:
    
        0 = com.identy.a.PngjException.values();
        0 = ~0;
        0 = (0 ^ 1) | (0 & 1);
        0 = ((~((0 & 0) | (0 ^ 0))) * 52) + ((0 * 53) - 51);
        0 = ~0;
        0 = ~(0 | 0);
        0 = ~((0 & 1) | (0 ^ 1));
        0 = $$a[(((~((0 & (-2)) | ((-2) ^ 0))) | (~(((-2) ^ 0) | (0 & (-2))))) * 52) + ((((~((~0) | 1)) | ((0 & 0) | (0 ^ 0))) * (-52)) + 0)];
        com.identy.FingerActivity.toJson = (com.identy.FingerActivity.setFoundMatchingTemplates + 15) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01ef, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01aa, code lost:
    
        if (0 < 0.length) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object PngjException(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7;
        FingerDetectionMode[] fingerDetectionModeArr;
        int i8 = ~i4;
        int i9 = ~i;
        int i10 = ~(i8 | i9);
        int i11 = i8 | i2;
        int i12 = (~i11) | i10;
        int i13 = ~i2;
        int i14 = (~(i | i11)) | (~(i13 | i4)) | (~(i9 | i13));
        int i15 = (461141949 * i6) + ((-1017789379) * i5) + i4 + i2 + i3;
        int i16 = i15 * i15;
        int i17 = ((-1005256704) * i16) + (1912995840 * i6) + ((-1727660032) * i5) + (1065222144 * i3) + ((-1616703077) * i10) + (i14 * (-1616703077)) + ((-1061561142) * i12) + ((-1613042074) * i2) + ((-551480932) * i4) + 431816704;
        int i18 = i14 * 489;
        int i19 = i10 * 489;
        int i20 = i3 * (-1063000885);
        int i21 = i5 * (-90181537);
        int i22 = i6 * (-1548859681);
        int i23 = i16 * 816250880;
        int i24 = i23 + i22 + i21 + i20 + i19 + i18 + (i12 * (-978)) + (i2 * (-1063001374)) + ((i4 * (-1063000396)) - 360994079);
        switch ((i24 * i24 * 1493368832) + i17) {
            case 1:
                return PngjBadSignature(objArr);
            case 2:
                FingerActivity fingerActivity = (FingerActivity) objArr[0];
                toJson = (setFoundMatchingTemplates + 89) % 128;
                fingerActivity.onBackPressed();
                int i25 = setFoundMatchingTemplates;
                toJson = ((i25 & 55) + (i25 | 55)) % 128;
                return null;
            case 3:
                FingerActivity fingerActivity2 = (FingerActivity) objArr[0];
                fingerActivity2.runOnUiThread(fingerActivity2.new isAuthSucess(((Number) objArr[1]).intValue()));
                int i26 = setFoundMatchingTemplates;
                toJson = ((i26 & 77) + (i26 | 77)) % 128;
                return null;
            case 4:
                ActivityManager activityManager = (ActivityManager) ((FingerActivity) objArr[0]).getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                long j = memoryInfo.totalMem;
                toJson = (setFoundMatchingTemplates + 125) % 128;
                return Long.valueOf(j);
            case 5:
                return values(objArr);
            case 6:
                FingerActivity fingerActivity3 = (FingerActivity) objArr[0];
                int intValue = ((Number) objArr[1]).intValue();
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                int i27 = toJson;
                setFoundMatchingTemplates = ((i27 & 7) + (i27 | 7)) % 128;
                if (booleanValue) {
                    fingerActivity3.runOnUiThread(fingerActivity3.new Capture2TActivity(intValue));
                    return null;
                }
                fingerActivity3.PngjBadSignature(intValue);
                fingerActivity3.runOnUiThread(fingerActivity3.new getL2Score());
                setFoundMatchingTemplates = (toJson + 67) % 128;
                return null;
            case 7:
                FingerActivity fingerActivity4 = (FingerActivity) objArr[0];
                int i28 = toJson + 63;
                int i29 = i28 % 128;
                setFoundMatchingTemplates = i29;
                if (i28 % 2 != 0) {
                    i7 = fingerActivity4.CaptureThumbActivity;
                    int i30 = i7 + 1;
                    fingerDetectionModeArr = fingerActivity4.CapturePosition;
                    break;
                } else {
                    i7 = fingerActivity4.CaptureThumbActivity;
                    int i31 = i7 >> 1;
                    fingerDetectionModeArr = fingerActivity4.CapturePosition;
                    break;
                }
            case 8:
                return PngjBadCrcException(objArr);
            case 9:
                return PngjException(objArr);
            case 10:
                return PngjPrematureEnding(objArr);
            case 11:
                return PngjInputException(objArr);
            case 12:
                return PngjOutputException(objArr);
            case 13:
                return PngjExceptionInternal(objArr);
            case 14:
                FingerActivity fingerActivity5 = (FingerActivity) objArr[0];
                int i32 = toJson;
                setFoundMatchingTemplates = (((i32 | 43) << 1) - (i32 ^ 43)) % 128;
                org.camera.a.valueOf valueof = fingerActivity5.isQualityFailed;
                setFoundMatchingTemplates = (i32 + 83) % 128;
                return valueof;
            case 15:
                FingerActivity fingerActivity6 = (FingerActivity) objArr[0];
                int i33 = setFoundMatchingTemplates;
                toJson = (i33 + 51) % 128;
                Runnable runnable = fingerActivity6.DeduplicationIdentyResponse;
                if (runnable != null) {
                    toJson = ((i33 ^ 89) + ((i33 & 89) << 1)) % 128;
                    runnable.run();
                }
                int i34 = setFoundMatchingTemplates;
                toJson = ((i34 ^ 23) + ((i34 & 23) << 1)) % 128;
                return null;
            case 16:
                FingerActivity fingerActivity7 = (FingerActivity) objArr[0];
                fingerActivity7.runOnUiThread(fingerActivity7.new getSpoofScore(((Boolean) objArr[2]).booleanValue(), ((Number) objArr[1]).intValue()));
                int i35 = toJson;
                setFoundMatchingTemplates = (((i35 | 81) << 1) - (i35 ^ 81)) % 128;
                return null;
            case 17:
                return PngjUnsupportedException(objArr);
            case 18:
                return PngBadCharsetException(objArr);
            case 19:
                return e1(objArr);
            case 20:
                FingerActivity fingerActivity8 = (FingerActivity) objArr[0];
                String str = (String) objArr[1];
                Resources resources = fingerActivity8.getResources();
                Configuration configuration = resources.getConfiguration();
                Locale locale = new Locale(str);
                Locale.setDefault(locale);
                int i36 = setFoundMatchingTemplates;
                toJson = (((i36 | 73) << 1) - (i36 ^ 73)) % 128;
                configuration.setLocale(locale);
                resources.updateConfiguration(configuration, resources.getDisplayMetrics());
                int i37 = setFoundMatchingTemplates;
                toJson = (((i37 | 3) << 1) - (i37 ^ 3)) % 128;
                toJson = (setFoundMatchingTemplates + com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground) % 128;
                return null;
            case 21:
                FingerActivity fingerActivity9 = (FingerActivity) objArr[0];
                setFoundMatchingTemplates = (toJson + 41) % 128;
                fingerActivity9.getL3Score();
                toJson = (setFoundMatchingTemplates + 95) % 128;
                return null;
            case 22:
                return a(objArr);
            case 23:
                return Action(objArr);
            case 24:
                return onErrorResponse(objArr);
            case 25:
                return getAsHighestSecurityLevelReached(objArr);
            default:
                return valueOf(objArr);
        }
    }

    private static /* synthetic */ Object PngjExceptionInternal(Object[] objArr) {
        FingerActivity fingerActivity = (FingerActivity) objArr[0];
        int i = setFoundMatchingTemplates;
        toJson = ((i & 21) + (i | 21)) % 128;
        Handler handler = fingerActivity.Capture4FActivity;
        if (handler != null) {
            int i2 = ((i | 55) << 1) - (i ^ 55);
            int i3 = i2 % 128;
            toJson = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            Runnable runnable = fingerActivity.CaptureRolledThumbActivity;
            if (runnable != null) {
                setFoundMatchingTemplates = (i3 + 59) % 128;
                handler.removeCallbacks(runnable);
                int i4 = toJson;
                setFoundMatchingTemplates = ((i4 ^ 11) + ((i4 & 11) << 1)) % 128;
            }
        }
        Handler handler2 = new Handler();
        fingerActivity.Capture4FActivity = handler2;
        values valuesVar = fingerActivity.new values();
        fingerActivity.CaptureRolledThumbActivity = valuesVar;
        handler2.postDelayed(valuesVar, 5000L);
        int values2 = com.identy.a.PngjException.values();
        int i5 = ~(1874780151 | (~values2));
        int i6 = (values2 & 1267632081) | (values2 ^ 1267632081);
        int i7 = (((((i5 & 1233552592) | (i5 ^ 1233552592)) * (-591)) + 178269230) - (~(((i6 & 1840700662) | (i6 ^ 1840700662)) * 591))) - 1;
        int values3 = com.identy.a.PngjException.values();
        int i8 = ~values3;
        int i9 = (((~(((-1216679642) ^ i8) | ((-1216679642) & i8))) | (~((144724404 ^ values3) | (144724404 & values3)))) * (-370)) - 1736565972;
        int i10 = ~((i8 & 144724404) | (144724404 ^ i8));
        int i11 = ~(values3 | (-1216679642));
        int i12 = (i11 & i10) | (i10 ^ i11);
        int i13 = ((i12 & 2117924) | (i12 ^ 2117924)) * (-370);
        int i14 = (i9 & i13) + (i13 | i9);
        if (i7 > (i14 & 783631880) + (783631880 | i14)) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        if (((0 ^ 1) + ((0 & 1) << 1)) < 0.CapturePosition.length) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if ((0.CaptureThumbActivity + 1) < 0.CapturePosition.length) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0048, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        com.identy.FingerActivity.toJson = ((0 & 91) + (0 | 91)) % 128;
        0 = ((0 | 41) << 1) - (0 ^ 41);
        com.identy.FingerActivity.toJson = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        if ((0 % 2) != 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object PngjInputException(Object[] objArr) {
        FingerActivity fingerActivity = (FingerActivity) objArr[0];
        int i = toJson + 105;
        int i2 = i % 128;
        setFoundMatchingTemplates = i2;
        if (i % 2 != 0) {
            int i3 = fingerActivity.CaptureThumbActivity;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008d, code lost:
    
        if (0.toLowerCase(0).contains("2") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009a, code lost:
    
        0 = com.identy.FingerActivity.toJson;
        com.identy.FingerActivity.setFoundMatchingTemplates = ((0 & 83) + (0 | 83)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00af, code lost:
    
        if (0.toLowerCase(0).contains("1") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0098, code lost:
    
        if (0.toLowerCase(0).contains("2") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0142, code lost:
    
        if (0 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x014a, code lost:
    
        0 = com.identy.FingerActivity.toJson + 1;
        com.identy.FingerActivity.setFoundMatchingTemplates = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0154, code lost:
    
        if ((0 % 2) == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0156, code lost:
    
        if (0 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0159, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0147, code lost:
    
        if ((!0) != true) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object PngjOutputException(Object[] objArr) {
        boolean z;
        boolean contains;
        int i;
        FingerActivity fingerActivity = (FingerActivity) objArr[0];
        setFoundMatchingTemplates = (toJson + 121) % 128;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(fingerActivity);
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        boolean contains2 = str.toLowerCase(locale).contains("samsung");
        String str2 = Build.MODEL;
        if (str2.toLowerCase(locale).contains("redmi")) {
            toJson = (setFoundMatchingTemplates + 33) % 128;
            if (!str2.toLowerCase(locale).contains("note 4")) {
                int i2 = setFoundMatchingTemplates;
                toJson = ((i2 & 113) + (i2 | 113)) % 128;
                if (!str2.toLowerCase(locale).contains("5") && !str2.toLowerCase(locale).contains("4") && !str2.toLowerCase(locale).contains("3")) {
                    int i3 = setFoundMatchingTemplates;
                    int i4 = (i3 & 47) + (i3 | 47);
                    toJson = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 34 / 0;
                    }
                    contains = str2.toLowerCase(locale).contains("nexus 6");
                    if (!contains2) {
                        int values2 = com.identy.a.PngjException.values();
                        int i6 = ~values2;
                        int i7 = (i6 & (-123400209)) | (i6 ^ (-123400209));
                        int i8 = (((~((i7 & (-940710064)) | (i7 ^ (-940710064)))) | (-1062926528)) * (-828)) - 1679120637;
                        int i9 = ~values2;
                        int i10 = ((i9 & (-1183745)) | ((-1183745) ^ i9)) * (-828);
                        int i11 = (i8 & i10) + (i10 | i8);
                        int i12 = (i11 & 980140032) + (980140032 | i11);
                        int identityHashCode = System.identityHashCode(fingerActivity);
                        int i13 = 2008882425 - (~((~(((-1360560898) & identityHashCode) | ((-1360560898) ^ identityHashCode))) * 623));
                        int i14 = ~identityHashCode;
                        int i15 = ((i14 & 671095034) | (i14 ^ 671095034)) * (-623);
                        int i16 = (i13 ^ i15) + ((i15 & i13) << 1);
                        int i17 = ~((-1369425670) | identityHashCode);
                        int i18 = (i17 & 1360560897) | (1360560897 ^ i17);
                        int i19 = ~((identityHashCode & 679959806) | (679959806 ^ identityHashCode));
                        int i20 = ((i19 & i18) | (i18 ^ i19)) * 623;
                        if (i12 > ((i16 | i20) << 1) - (i20 ^ i16)) {
                            int i21 = 70 / 0;
                        }
                        if (contains) {
                            int i22 = setFoundMatchingTemplates + 113;
                            toJson = i22 % 128;
                            int i23 = i22 % 2;
                            SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                            edit.putBoolean("identy_app_preference_camera2_fast_burst", false);
                            edit.apply();
                        }
                        int i24 = setFoundMatchingTemplates;
                        i = ((i24 | 83) << 1) - (i24 ^ 83);
                        toJson = i % 128;
                        if (i % 2 != 0) {
                            return null;
                        }
                        throw null;
                    }
                    SharedPreferences.Editor edit2 = defaultSharedPreferences.edit();
                    edit2.putBoolean("identy_app_preference_camera2_fake_flash_v3", true);
                    edit2.apply();
                    if (contains) {
                    }
                    int i242 = setFoundMatchingTemplates;
                    i = ((i242 | 83) << 1) - (i242 ^ 83);
                    toJson = i % 128;
                    if (i % 2 != 0) {
                    }
                }
            }
            z = true;
            contains = str2.toLowerCase(locale).contains("nexus 6");
            if (!contains2) {
            }
            SharedPreferences.Editor edit22 = defaultSharedPreferences.edit();
            edit22.putBoolean("identy_app_preference_camera2_fake_flash_v3", true);
            edit22.apply();
            if (contains) {
            }
            int i2422 = setFoundMatchingTemplates;
            i = ((i2422 | 83) << 1) - (i2422 ^ 83);
            toJson = i % 128;
            if (i % 2 != 0) {
            }
        }
        setFoundMatchingTemplates = (toJson + 47) % 128;
        z = false;
        contains = str2.toLowerCase(locale).contains("nexus 6");
        if (!contains2) {
        }
        SharedPreferences.Editor edit222 = defaultSharedPreferences.edit();
        edit222.putBoolean("identy_app_preference_camera2_fake_flash_v3", true);
        edit222.apply();
        if (contains) {
        }
        int i24222 = setFoundMatchingTemplates;
        i = ((i24222 | 83) << 1) - (i24222 ^ 83);
        toJson = i % 128;
        if (i % 2 != 0) {
        }
    }

    private static /* synthetic */ Object PngjUnsupportedException(Object[] objArr) {
        FingerActivity fingerActivity = (FingerActivity) objArr[0];
        int i = setFoundMatchingTemplates;
        int i2 = (i ^ 39) + ((i & 39) << 1);
        toJson = i2 % 128;
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (i2 % 2 != 0) {
            com.identy.e1 e1Var = fingerActivity.onErrorResponse;
            ERRORS errors = ERRORS.NETWORK_ERROR;
            e1Var.valueOf(errors);
            IdentySdk.getInstance().a(errors, null);
            throw null;
        }
        com.identy.e1 e1Var2 = fingerActivity.onErrorResponse;
        ERRORS errors2 = ERRORS.NETWORK_ERROR;
        e1Var2.valueOf(errors2);
        IdentySdk.getInstance().a(errors2, null);
        fingerActivity.finish();
        int i3 = setFoundMatchingTemplates;
        toJson = (((i3 | 31) << 1) - (i3 ^ 31)) % 128;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0018, code lost:
    
        0 = 0 + 67;
        com.identy.FingerActivity.$10 = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x001f, code lost:
    
        if ((0 % 2) != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0021, code lost:
    
        0 = 0.toCharArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0026, code lost:
    
        0.toCharArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0029, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0016, code lost:
    
        if (0 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (0 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        0 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(String str, int i, Object[] objArr) {
        char[] charArray;
        int i2 = $10 + 107;
        int i3 = i2 % 128;
        $11 = i3;
        if (i2 % 2 == 0) {
            int i4 = 93 / 0;
        }
        com.d.e.ComDeA aVar = new com.d.e.ComDeA();
        char[] values2 = com.d.e.ComDeA.values(setFingers ^ 8332534422373704609L, charArray, i);
        aVar.PngjBadSignature = 4;
        while (true) {
            int i5 = aVar.PngjBadSignature;
            if (i5 >= values2.length) {
                objArr[0] = new String(values2, 4, values2.length - 4);
                return;
            }
            int i6 = i5 - 4;
            aVar.PngjBadCrcException = i6;
            try {
                Object[] objArr2 = {Long.valueOf(values2[i5] ^ values2[i5 % 4]), Long.valueOf(i6), Long.valueOf(setFingers)};
                Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1668670198);
                if (PngjBadSignature2 == null) {
                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int jumpTapTimeout = 29 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int indexOf = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 1;
                    Class cls = Long.TYPE;
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(longPressTimeout, jumpTapTimeout, indexOf, 1617260721, false, "o", new Class[]{cls, cls, cls});
                }
                values2[i5] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {aVar, aVar};
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1405973094);
                if (PngjBadSignature3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (14830 - View.MeasureSpec.getSize(0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28, 721 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1356718115, false, $$l(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature3).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();

                if (cause == null) {

                    throw new RuntimeException(th);

                }

                throw new RuntimeException(cause);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(int i, short s, int i2, Object[] objArr) {
        int i3;
        int i4;
        int i5 = i2 + 6;
        int i6 = (s * 38) + 80;
        int i7 = 45 - i;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = i5;
            i4 = 0;
            i7++;
            i6 = i6 + i8 + 5;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i8 = bArr[i7];
            i7++;
            i6 = i6 + i8 + 5;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void g(int i, byte b, short s, Object[] objArr) {
        int i2;
        int i3 = 31 - (i * 27);
        int i4 = b * 9;
        byte[] bArr = $$g;
        int i5 = (s * 31) + 80;
        byte[] bArr2 = new byte[i4 + 19];
        int i6 = i4 + 18;
        int i7 = -1;
        if (bArr == null) {
            int i8 = i5;
            i2 = i3;
            i3 = i3 + i8 + 8;
            i2++;
            i7++;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i8 = bArr[i2];
            i3 = i3 + i8 + 8;
            i2++;
            i7++;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
            }
        } else {
            i2 = i3;
            i3 = i5;
            i7++;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
            }
        }
    }

    private static /* synthetic */ Object getAsHighestSecurityLevelReached(Object[] objArr) {
        FingerActivity fingerActivity = (FingerActivity) objArr[0];
        ObjectAnimator ofInt = ObjectAnimator.ofInt(fingerActivity.findViewById(R.id.id_header_title), "textColor", -16777216, -1);
        fingerActivity.isAuthSucess = ofInt;
        ofInt.setDuration(500L);
        fingerActivity.isAuthSucess.setEvaluator(new ArgbEvaluator());
        fingerActivity.isAuthSucess.setRepeatCount(-1);
        fingerActivity.isAuthSucess.setRepeatMode(2);
        fingerActivity.isAuthSucess.start();
        int i = toJson;
        int i2 = (i ^ 73) + ((i & 73) << 1);
        setFoundMatchingTemplates = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private void getCaptureTime() {
        try {
            this.Action = new org.camera.preview.PngjBadCrcException(this.PngBadCharsetException, (ViewGroup) findViewById(R.id.preview), this, LibSettings.cameraId, IdentySdk.getInstance().isRolledfp(), IdentySdk.getInstance().isKidsCapture());
            try {
                if (LibSettings.isSaveCaptured()) {
                    int i = setFoundMatchingTemplates;
                    int i2 = ((i ^ 13) + ((i & 13) << 1)) % 128;
                    toJson = i2;
                    int i3 = ((i2 | 65) << 1) - (i2 ^ 65);
                    setFoundMatchingTemplates = i3 % 128;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            int i4 = setFoundMatchingTemplates;
            int i5 = (i4 & 119) + (i4 | 119);
            toJson = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        getWindow().clearFlags(128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        if ((!0.getBoolean("identy_app_preference_keep_display_on", true)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (0.getBoolean("identy_app_preference_keep_display_on", false) != true) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002c, code lost:
    
        com.identy.FingerActivity.toJson = (com.identy.FingerActivity.setFoundMatchingTemplates + 39) % 128;
        getWindow().addFlags(128);
        com.identy.FingerActivity.toJson = (com.identy.FingerActivity.setFoundMatchingTemplates + 111) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getL1Score() {
        SharedPreferences defaultSharedPreferences;
        int i = toJson;
        int i2 = ((i | 83) << 1) - (i ^ 83);
        setFoundMatchingTemplates = i2 % 128;
        if (i2 % 2 == 0) {
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        } else {
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        }
        if (defaultSharedPreferences.getBoolean("identy_app_preference_show_when_locked", true)) {
            getWindow().addFlags(524288);
            setFoundMatchingTemplates = (toJson + 29) % 128;
        } else {
            getWindow().clearFlags(524288);
        }
        valueOf(false);
        PngjExceptionInternal();
        this.Capture2IndexActivity = false;
        int i3 = setFoundMatchingTemplates + 29;
        toJson = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private void getL2Score() {
        PngjException(com.identy.a.PngjException.values(), 1727349288, new Object[]{this}, com.identy.a.PngjException.values(), -1727349276, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
    }

    private synchronized void getL3Score() {
        Intent intent = new Intent(com.identy.PngjBadSignature.valueOf);
        intent.setPackage(getPackageName());
        sendBroadcast(intent);
        PngjException(com.identy.a.PngjException.values(), 797268418, new Object[]{this}, com.identy.a.PngjException.values(), -797268400, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
        PngjBadSignature(R.string.id_hold);
        int i = setFoundMatchingTemplates;
        int i2 = ((i | 113) << 1) - (i ^ 113);
        toJson = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private void getMatchingTime() {
        int i = setFoundMatchingTemplates;
        toJson = (((i | 125) << 1) - (i ^ 125)) % 128;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this).edit();
        edit.putBoolean("identy_app_done_first_time", true);
        edit.apply();
        int i2 = setFoundMatchingTemplates;
        int i3 = ((i2 | 25) << 1) - (i2 ^ 25);
        toJson = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private boolean getOveralTimetaken() {
        return ((Boolean) PngjException(com.identy.a.PngjException.values(), -22604197, new Object[]{this}, com.identy.a.PngjException.values(), 22604208, com.identy.a.PngjException.values(), com.identy.a.PngjException.values())).booleanValue();
    }

    public static void getProcessingTime() {
        setFingers = 3541249097668497186L;
    }

    private static String getSpoofScore() {
        BufferedReader bufferedReader;
        String property;
        StringBuilder sb = new StringBuilder();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[]{"logcat", "-d"}).getInputStream()), ConstantsKt.DEFAULT_BLOCK_SIZE);
            property = System.getProperty("line.separator");
            int i = setFoundMatchingTemplates;
            toJson = (((i | 35) << 1) - (i ^ 35)) % 128;
        } catch (Exception e) {
            e.printStackTrace();
        }
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                int i2 = setFoundMatchingTemplates + 11;
                toJson = i2 % 128;
                if (i2 % 2 != 0) {
                    sb.append(readLine);
                    sb.append(property);
                    throw null;
                }
                sb.append(readLine);
                sb.append(property);
            }
            try {
                Runtime.getRuntime().exec(new String[]{"logcat", "-c"});
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            String obj = sb.toString();
            setFoundMatchingTemplates = (toJson + 57) % 128;
            return obj;
        }
    }

    public static void init$0() {
        $$d = new byte[]{87, 56, 56, -96, 25, -12, -2, -45, 26, -2, -38, 42, -20, -35, 46, -26, -3, 6, -1, -16, 1, -6, 25, -12, -2, -42, 46, -26, -3, 6, -1, -16, 1, -6, -26, 6, 4, -21, -27, 18, -26, 6, 4, -21, 9, 25, -12, -2, -45, 26, -2, -22, 17, -7, 2, -18, 14, -4, -8, -18};
        $$e = 183;
    }

    public static void init$1() {
        $$g = new byte[]{18, -90, 23, -81, -5, -19, -65, 45, -10, 4, -16, 5, -25, -59, 43, -59, 64, -29, 3, 1, -24, -30, 15, -74, 74, -29, 3, 1, -24, -30, 15, 22, -15, -5, -48, 23, -5, -41, 39, -23, -38, 43, -29, -6, 3, -4, -19, -2, -9};
        $$h = 113;
    }

    public static void init$2() {
        $$j = new byte[]{97, -30, 34, 124};
        $$k = 111;
    }

    private long isAuthSucess() {
        return ((Long) PngjException(com.identy.a.PngjException.values(), 1438500373, new Object[]{this}, com.identy.a.PngjException.values(), -1438500369, com.identy.a.PngjException.values(), com.identy.a.PngjException.values())).longValue();
    }

    private static /* synthetic */ Object onErrorResponse(Object[] objArr) {
        FingerActivity fingerActivity = (FingerActivity) objArr[0];
        int i = toJson + 61;
        setFoundMatchingTemplates = i % 128;
        int i2 = i % 2;
        fingerActivity.onBackPressed();
        if (i2 == 0) {
            throw null;
        }
        int i3 = setFoundMatchingTemplates;
        int i4 = (i3 ^ 5) + ((i3 & 5) << 1);
        toJson = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object valueOf(Object[] objArr) {
        FingerActivity fingerActivity = (FingerActivity) objArr[0];
        int i = toJson;
        setFoundMatchingTemplates = ((i ^ 97) + ((i & 97) << 1)) % 128;
        PngjException(com.identy.a.PngjException.values(), -418890381, new Object[]{fingerActivity}, com.identy.a.PngjException.values(), 418890396, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
        int i2 = setFoundMatchingTemplates;
        int i3 = (i2 & 25) + (i2 | 25);
        toJson = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object values(Object[] objArr) {
        FingerActivity fingerActivity = (FingerActivity) objArr[0];
        int i = setFoundMatchingTemplates;
        toJson = ((i & 101) + (i | 101)) % 128;
        fingerActivity.onBackPressed();
        int i2 = toJson + 75;
        setFoundMatchingTemplates = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final void Attempt() {
        int i = toJson;
        int i2 = (i ^ 49) + ((i & 49) << 1);
        setFoundMatchingTemplates = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (PngjBadSignature) {
            int i3 = ((i | 61) << 1) - (i ^ 61);
            setFoundMatchingTemplates = i3 % 128;
            if (i3 % 2 == 0) {
                PngjException(com.identy.a.PngjException.values(), 843068644, new Object[]{this, Boolean.TRUE}, com.identy.a.PngjException.values(), -843068625, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
                return;
            } else {
                PngjException(com.identy.a.PngjException.values(), 843068644, new Object[]{this, Boolean.TRUE}, com.identy.a.PngjException.values(), -843068625, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
                return;
            }
        }
        if (((Boolean) PngjException(com.identy.a.PngjException.values(), -22604197, new Object[]{this}, com.identy.a.PngjException.values(), 22604208, com.identy.a.PngjException.values(), com.identy.a.PngjException.values())).booleanValue()) {
            int i4 = (setFoundMatchingTemplates + 105) % 128;
            toJson = i4;
            try {
                org.camera.preview.PngjBadCrcException pngjBadCrcException = this.Action;
                if (pngjBadCrcException != null) {
                    setFoundMatchingTemplates = ((i4 ^ 53) + ((i4 & 53) << 1)) % 128;
                    pngjBadCrcException.PngjException();
                }
            } catch (Exception unused) {
            }
            com.identy.ui.c.getPadSub2 getpadsub2 = new com.identy.ui.c.getPadSub2(this);
            getpadsub2.PngjException = R.string.id_next_detection;
            int i5 = R.string.id_yes;
            getCaptureTime getcapturetime = new getCaptureTime();
            getpadsub2.values = i5;
            getpadsub2.valueOf = getcapturetime;
            int i6 = R.string.id_no;
            getMatchingTime getmatchingtime = new getMatchingTime();
            getpadsub2.PngjBadCrcException = i6;
            getpadsub2.PngjBadSignature = getmatchingtime;
            if (PngjPrematureEnding) {
                toJson = (setFoundMatchingTemplates + 105) % 128;
                this.getPadSub1 = getpadsub2;
                getpadsub2.setTitle(getText(R.string.id_next_hand_confirm));
                this.getPadSub1.show();
                return;
            }
        } else {
            Action();
        }
        setFoundMatchingTemplates = (toJson + 85) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        0 = com.identy.FingerActivity.toJson + 97;
        com.identy.FingerActivity.setFoundMatchingTemplates = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        if ((0 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (android.os.Build.MANUFACTURER.toUpperCase().trim().contains("INGENICO") == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if ((!android.os.Build.MANUFACTURER.toUpperCase().trim().contains("INGENICO")) != true) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0042, code lost:
    
        if (android.os.Build.MODEL.contains("DX8000") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0044, code lost:
    
        0 = com.identy.FingerActivity.toJson;
        0 = 0.CaptureMode;
        0 = (0 & 59) + (0 | 59);
        com.identy.FingerActivity.setFoundMatchingTemplates = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0053, code lost:
    
        if ((0 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0055, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean PngjPrematureEnding() {
        int i = setFoundMatchingTemplates;
        int i2 = ((i | 97) << 1) - (i ^ 97);
        toJson = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 68 / 0;
        }
    }

    @Override // com.identy.d.PngjBadSignature
    public final void a() {
        int i = toJson + 91;
        setFoundMatchingTemplates = i % 128;
        if (i % 2 != 0) {
            this.Action.PngjException();
        } else {
            this.Action.PngjException();
            int i2 = 99 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x038a  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(Context context) {
        char c;
        char c2;
        int intValue;
        Object[] values$52c725b;
        int i = setFoundMatchingTemplates + 119;
        toJson = i % 128;
        int i2 = 0;
        if (i % 2 != 0) {
            super.attachBaseContext(context);
            Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
            if (PngjBadSignature2 == null) {
                char threadPriority = (char) (14830 - ((Process.getThreadPriority(0) + 20) >> 6));
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28;
                int indexOf = 720 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0');
                byte[] bArr = $$d;
                byte b = (byte) (bArr[11] - 1);
                byte b2 = (byte) (bArr[20] - 1);
                Object[] objArr = new Object[1];
                f(b, b2, (byte) (b2 | 13), objArr);
                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(threadPriority, keyRepeatTimeout, indexOf, -815159504, false, (String) objArr[0], null);
            }
            ((Field) PngjBadSignature2).getLong(null);
            throw null;
        }
        super.attachBaseContext(context);
        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
        if (PngjBadSignature3 == null) {
            char offsetBefore = (char) (TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 14830);
            int resolveOpacity = Drawable.resolveOpacity(0, 0) + 28;
            int indexOf2 = 721 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0);
            byte[] bArr2 = $$d;
            byte b3 = (byte) (bArr2[11] - 1);
            byte b4 = (byte) (bArr2[20] - 1);
            Object[] objArr2 = new Object[1];
            f(b3, b4, (byte) (b4 | 13), objArr2);
            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(offsetBefore, resolveOpacity, indexOf2, -815159504, false, (String) objArr2[0], null);
        }
        long j = ((Field) PngjBadSignature3).getLong(null);
        try {
            try {
                if (j != -1) {
                    long j2 = j + 4611686018427387763L;
                    c = 2;
                    Object[] objArr3 = new Object[1];
                    e("䲝ૣ䳼꘎⌥垸\ufefe穇吅焱剃\ue5f8⣪ᨋ읷㮱嫀젷ᔙ䦋蓀縓嬝龕㛂ⰷ", Drawable.resolveOpacity(0, 0) + 1, objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    c2 = 11;
                    Object[] objArr4 = new Object[1];
                    e("恊ﾵ怯博㈔튐툵歳ꅟ怅흩悮з\uef4f혁뺼瘇㵿м", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr4);
                    if (j2 >= ((Long) cls.getDeclaredMethod((String) objArr4[0], null).invoke(null, null)).longValue()) {
                        Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                        if (PngjBadSignature4 == null) {
                            char capsMode = (char) (TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 14830);
                            int lastIndexOf = 27 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0');
                            int tapTimeout = 721 - (ViewConfiguration.getTapTimeout() >> 16);
                            byte b5 = (byte) ($$e & 95);
                            byte[] bArr3 = $$d;
                            Object[] objArr5 = new Object[1];
                            f(b5, (byte) (bArr3[20] - 1), (byte) (-bArr3[53]), objArr5);
                            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(capsMode, lastIndexOf, tapTimeout, -779023007, false, (String) objArr5[0], null);
                        }
                        Object[] objArr6 = (Object[]) ((Field) PngjBadSignature4).get(null);
                        values$52c725b = new Object[]{new int[]{0}, new int[1], 0, new int[]{0}};
                        int i3 = ((int[]) objArr6[3])[0];
                        int i4 = ((int[]) objArr6[0])[0];
                        String[] strArr = (String[]) objArr6[2];
                        int identityHashCode = System.identityHashCode(this);
                        int c3 = defpackage.a.c((~(identityHashCode | 439336540)) | 403014660, 302, ((~((-558907554) | identityHashCode)) * (-604)) + (((~((~identityHashCode) | (-558907554))) | (~(998244093 | identityHashCode))) * (-302)) + 869579403, -1783891156);
                        int i5 = c3 ^ (c3 << 13);
                        int i6 = i5 ^ (i5 >>> 17);
                        ((int[]) values$52c725b[1])[0] = i6 ^ (i6 << 5);
                        if (((int[]) values$52c725b[3])[0] != ((int[]) values$52c725b[0])[0]) {
                            Object[] objArr7 = new Object[4];
                            objArr7[0] = new int[]{0};
                            objArr7[1] = new int[1];
                            objArr7[3] = new int[]{0};
                            int i7 = ((int[]) values$52c725b[1])[0];
                            int i8 = ((int[]) values$52c725b[3])[0];
                            int i9 = ((int[]) values$52c725b[0])[0];
                            objArr7[c] = (String[]) values$52c725b[c];
                            int identityHashCode2 = System.identityHashCode(this);
                            int c4 = defpackage.a.c((~(identityHashCode2 | 119367175)) | 915198798, 272, (((~((-119367176) | identityHashCode2)) | 17900545) * (-272)) + ((((~((-101466631) | (~identityHashCode2))) | (~(933099343 | identityHashCode2))) * (-272)) - 683270683), i7);
                            int i10 = c4 ^ (c4 << 13);
                            int i11 = i10 ^ (i10 >>> 17);
                            ((int[]) objArr7[1])[0] = i11 ^ (i11 << 5);
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        String[] strArr2 = (String[]) values$52c725b[c];
                        if (strArr2 == null) {
                            throw null;
                        }
                        int i12 = setFoundMatchingTemplates + 79;
                        while (true) {
                            toJson = i12 % 128;
                            if (i2 >= strArr2.length) {
                                throw null;
                            }
                            arrayList.add(strArr2[i2]);
                            i2++;
                            i12 = setFoundMatchingTemplates + 15;
                        }
                    }
                } else {
                    c = 2;
                    c2 = 11;
                }
                Object[] objArr8 = new Object[1];
                e("䲝ૣ䳼꘎⌥垸\ufefe穇吅焱剃\ue5f8⣪ᨋ읷㮱嫀젷ᔙ䦋蓀縓嬝龕㛂ⰷ", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e("恊ﾵ怯博㈔튐툵歳ꅟ怅흩悮з\uef4f혁뺼瘇㵿м", 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr9);
                Long valueOf2 = Long.valueOf(((Long) cls2.getDeclaredMethod((String) objArr9[0], null).invoke(null, null)).longValue());
                Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
                if (PngjBadSignature5 == null) {
                    char indexOf3 = (char) (TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 14830);
                    int i13 = 28 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int packedPositionGroup = 721 - ExpandableListView.getPackedPositionGroup(0L);
                    byte[] bArr4 = $$d;
                    byte b6 = (byte) (bArr4[c2] - 1);
                    byte b7 = (byte) (bArr4[20] - 1);
                    Object[] objArr10 = new Object[1];
                    f(b6, b7, (byte) (b7 | 13), objArr10);
                    PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf3, i13, packedPositionGroup, -815159504, false, (String) objArr10[0], null);
                }
                ((Field) PngjBadSignature5).set(null, valueOf2);
                toJson = (setFoundMatchingTemplates + 109) % 128;
                if (((int[]) values$52c725b[3])[0] != ((int[]) values$52c725b[0])[0]) {
                }
            } catch (Exception unused) {
                throw new RuntimeException();
            }
            Object[] objArr11 = {-1801624926};
            Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
            if (PngjBadSignature6 == null) {
                PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) KeyEvent.normalizeMetaState(0), 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 697 - (ViewConfiguration.getEdgeSlop() >> 16), 1457201313, false, null, new Class[]{Integer.TYPE});
            }
            values$52c725b = arid.chunks.PngjInputException.values$52c725b(intValue, ((Constructor) PngjBadSignature6).newInstance(objArr11));
            Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
            if (PngjBadSignature7 == null) {
                char argb = (char) (Color.argb(0, 0, 0, 0) + 14830);
                int i14 = 29 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 721;
                byte b8 = (byte) ($$e & 95);
                byte[] bArr5 = $$d;
                Object[] objArr12 = new Object[1];
                f(b8, (byte) (bArr5[20] - 1), (byte) (-bArr5[53]), objArr12);
                PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(argb, i14, scrollDefaultDelay, -779023007, false, (String) objArr12[0], null);
            }
            ((Field) PngjBadSignature7).set(null, values$52c725b);
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
        Object[] objArr13 = new Object[1];
        e("덉滸댣숚\u175c篔ū丬〛䕟縼짇휶繍\uf361៤ꔞ갫Ⅳ旼", 1 - (ViewConfiguration.getTapTimeout() >> 16), objArr13);
        Class<?> cls3 = Class.forName((String) objArr13[0]);
        Object[] objArr14 = new Object[1];
        e("汳蟨氚⬏惠\ue4ca\ude0b㦃\ud90e㋥\ue12d囁ࠣ霒蓮裤稔䔠囍\ufae5", ExpandableListView.getPackedPositionGroup(0L) + 1, objArr14);
        intValue = ((Integer) cls3.getMethod((String) objArr14[0], Object.class).invoke(null, this)).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0018, code lost:
    
        if (0 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (0 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void closeDialog(View view) {
        Dialog dialog;
        int i = toJson + 85;
        setFoundMatchingTemplates = i % 128;
        try {
            if (i % 2 == 0) {
                dialog = this.getPadSub1;
                int i2 = 11 / 0;
            } else {
                dialog = this.getPadSub1;
            }
            System.identityHashCode(this);
            com.identy.a.PngjException.values();
            if (dialog.isShowing()) {
                int i3 = toJson;
                int i4 = (i3 ^ 19) + ((i3 & 19) << 1);
                setFoundMatchingTemplates = i4 % 128;
                if (i4 % 2 != 0) {
                    this.getPadSub1.dismiss();
                    return;
                } else {
                    this.getPadSub1.dismiss();
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
        int i5 = toJson;
        int i6 = (i5 ^ 29) + ((i5 & 29) << 1);
        setFoundMatchingTemplates = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (0.isShowing() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002c, code lost:
    
        if (0.isShowing() != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void closefDialog(View view) {
        int i = setFoundMatchingTemplates;
        int i2 = ((i ^ 45) + ((i & 45) << 1)) % 128;
        toJson = i2;
        try {
            Dialog dialog = this.getPadSub1;
            if (dialog != null) {
                int i3 = i2 + 53;
                setFoundMatchingTemplates = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 61 / 0;
                }
                this.getPadSub1.dismiss();
                int i5 = toJson;
                int i6 = ((i5 | 105) << 1) - (i5 ^ 105);
                setFoundMatchingTemplates = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
                return;
            }
        } catch (Exception unused) {
        }
        int i7 = toJson;
        setFoundMatchingTemplates = (((i7 | 21) << 1) - (i7 ^ 21)) % 128;
    }

    public final void e1() {
        com.identy.a.PngjException.values();
        com.identy.a.PngjException.values();
        if (!LibSettings.isSaveCaptured()) {
            new com.identy.ui.c.getAsHighestSecurityLevelReached(this, new getNfiq1Score()).show();
            int i = toJson + 23;
            setFoundMatchingTemplates = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            return;
        }
        String aSResult = this.onErrorResponse.FingerActivity.getAsResult().toString();
        com.identy.ui.c.a aVar = new com.identy.ui.c.a(this);
        aVar.values = aSResult;
        aVar.PngjException = R.string.id_try_again;
        aVar.values(new getOveralTimetaken()).show();
        int i2 = setFoundMatchingTemplates;
        toJson = (((i2 | 73) << 1) - (i2 ^ 73)) % 128;
    }

    @Override // com.identy.d.PngjBadSignature
    public final void getData() {
        PngjException(com.identy.a.PngjException.values(), 367713155, new Object[]{this}, com.identy.a.PngjException.values(), -367713155, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
    }

    public final void getFingerPrintQualityScore() {
        PngjException(com.identy.a.PngjException.values(), 1180049510, new Object[]{this}, com.identy.a.PngjException.values(), -1180049488, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
    }

    @Override // com.identy.d.PngjBadSignature
    public final void getNfiq1Score() {
        PngjException(com.identy.a.PngjException.values(), 398705906, new Object[]{this}, com.identy.a.PngjException.values(), -398705889, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
    }

    public final void getPadSub1() {
        PngjException(com.identy.a.PngjException.values(), -418890381, new Object[]{this}, com.identy.a.PngjException.values(), 418890396, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
    }

    public void getPadSub2() {
        int i = setFoundMatchingTemplates;
        int i2 = ((i | 15) << 1) - (i ^ 15);
        toJson = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 22 / 0;
        }
    }

    public final boolean getPadSub3() {
        return ((Boolean) PngjException(com.identy.a.PngjException.values(), 601814984, new Object[]{this}, com.identy.a.PngjException.values(), -601814983, com.identy.a.PngjException.values(), com.identy.a.PngjException.values())).booleanValue();
    }

    public final boolean getQualityScore() {
        return ((Boolean) PngjException(com.identy.a.PngjException.values(), 1622584195, new Object[]{this}, com.identy.a.PngjException.values(), -1622584186, com.identy.a.PngjException.values(), com.identy.a.PngjException.values())).booleanValue();
    }

    @Override // com.identy.d.PngjBadSignature
    public final void getScore() {
        int i = toJson + 17;
        setFoundMatchingTemplates = i % 128;
        if (i % 2 != 0 ? Calendar.getInstance().getTimeInMillis() < this.CaptureRolledFingersActivity + 100 : Calendar.getInstance().getTimeInMillis() < this.CaptureRolledFingersActivity % 100) {
            int i2 = toJson;
            setFoundMatchingTemplates = ((i2 & 41) + (i2 | 41)) % 128;
            return;
        }
        this.CaptureRolledFingersActivity = Calendar.getInstance().getTimeInMillis();
        Intent intent = new Intent(com.identy.PngjBadSignature.PngjException);
        intent.setPackage(getPackageName());
        sendBroadcast(intent);
        int i3 = setFoundMatchingTemplates + 21;
        toJson = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final void isQualityFailed() {
        int i = toJson;
        setFoundMatchingTemplates = ((i & 79) + (i | 79)) % 128;
        if (this.onErrorResponse != null) {
            int i2 = i + 87;
            setFoundMatchingTemplates = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 88 / 0;
                if (this.Action == null) {
                    return;
                }
            } else if (this.Action == null) {
                return;
            }
            runOnUiThread(new PngjBadCrcException());
            org.camera.preview.PngjBadCrcException pngjBadCrcException = this.Action;
            pngjBadCrcException.valueOf.values();
            pngjBadCrcException.Enroll4FActivity = BuildConfig.FLAVOR;
            org.cameracontroller.PngjBadSignature pngjBadSignature = pngjBadCrcException.getQualityScore;
            if (pngjBadSignature != null) {
                int i4 = toJson;
                int i5 = (i4 ^ 43) + ((i4 & 43) << 1);
                setFoundMatchingTemplates = i5 % 128;
                if (i5 % 2 == 0) {
                    pngjBadSignature.PngjPrematureEnding("flash_torch");
                    throw null;
                }
                pngjBadSignature.PngjPrematureEnding("flash_torch");
                int i6 = toJson;
                setFoundMatchingTemplates = ((i6 ^ 19) + ((i6 & 19) << 1)) % 128;
            }
            this.onErrorResponse.a();
            this.onErrorResponse.valueOf();
            PngjException(com.identy.a.PngjException.values(), -418890381, new Object[]{this}, com.identy.a.PngjException.values(), 418890396, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = setFoundMatchingTemplates;
        toJson = ((i3 & 3) + (i3 | 3)) % 128;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        int i = setFoundMatchingTemplates;
        int i2 = (i & 83) + (i | 83);
        toJson = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                IdentySdk.getInstance().isDisplayMoveNextDialog();
                throw null;
            }
            if (!IdentySdk.getInstance().isDisplayMoveNextDialog()) {
                this.getPadSub3 = true;
                PngjException(com.identy.a.PngjException.values(), 1007695065, new Object[]{this}, com.identy.a.PngjException.values(), -1007695063, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
                this.Attempt = null;
                return;
            }
            com.identy.ui.c.getPadSub2 getpadsub2 = new com.identy.ui.c.getPadSub2(this);
            getpadsub2.PngjException = R.string.id_exit_text;
            int i3 = R.string.id_yes;
            PngjBadSignature pngjBadSignature = new PngjBadSignature();
            getpadsub2.values = i3;
            getpadsub2.valueOf = pngjBadSignature;
            int i4 = R.string.id_no;
            valueOf valueof = new valueOf();
            getpadsub2.PngjBadCrcException = i4;
            getpadsub2.PngjBadSignature = valueof;
            this.Attempt = getpadsub2;
            getpadsub2.show();
        } catch (Exception e) {
            e.printStackTrace();
            int i5 = setFoundMatchingTemplates + 97;
            toJson = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        toJson = (setFoundMatchingTemplates + 103) % 128;
        super.onConfigurationChanged(configuration);
        int i = toJson;
        setFoundMatchingTemplates = ((i ^ 63) + ((i & 63) << 1)) % 128;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(56:(48:39|(3:41|42|(16:44|45|(1:47)|48|49|(2:51|52)(1:398)|53|(1:55)|56|(9:358|(2:360|361)(1:397)|(3:363|(3:365|366|(1:368)(1:369))|370)|371|372|373|374|375|(9:377|378|(1:380)|381|382|383|384|(1:386)|387))(4:61|62|(1:64)|65)|66|67|(1:69)(1:357)|70|71|72))(1:399)|73|(1:77)|78|(2:80|(1:82))|83|84|85|86|87|(1:89)|90|91|92|94|95|(9:97|98|99|(1:101)|102|103|(5:105|106|107|108|109)(7:115|116|117|(1:119)|120|121|(5:123|124|125|126|128)(9:132|133|134|135|(1:137)|138|139|140|(3:142|143|(3:145|146|147)(4:148|149|150|151))(2:158|(4:160|161|162|164))))|340|341)|189|190|(2:192|(1:194)(4:195|196|197|198))|202|203|(2:205|(3:207|208|209))|213|214|216|217|(2:219|(3:221|222|223))|227|(1:229)(7:284|285|286|(6:303|304|305|306|(2:308|309)(2:311|312)|310)(2:288|289)|290|291|(2:293|(3:295|296|297)))|230|231|232|233|234|235|(1:237)(1:277)|238|239|240|(2:242|(3:244|245|246))|250|251|(2:253|(2:255|(2:257|258))(4:259|260|261|262))|266|267|269)|374|375|(0)|66|67|(0)(0)|70|71|72|73|(2:75|77)|78|(0)|83|84|85|86|87|(0)|90|91|92|94|95|(0)|189|190|(0)|202|203|(0)|213|214|216|217|(0)|227|(0)(0)|230|231|232|233|234|235|(0)(0)|238|239|240|(0)|250|251|(0)|266|267|269) */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x110d, code lost:
    
        0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x059d, code lost:
    
        if ((0 + 4611686018427387901L) >= ((java.lang.Long) java.lang.Class.forName(0).getDeclaredMethod(0, null).invoke(null, null)).longValue()) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x149b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x1504  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x1539  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x155d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x160a  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x1682  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x16a7  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x161b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x1566 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x15d5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0ff1 A[Catch: Exception -> 0x00e1, TryCatch #23 {Exception -> 0x00e1, blocks: (B:3:0x0091, B:15:0x00c6, B:16:0x00ff, B:25:0x0143, B:28:0x0257, B:30:0x0436, B:33:0x044d, B:35:0x0507, B:36:0x0544, B:42:0x0564, B:45:0x059f, B:47:0x05a8, B:48:0x05e5, B:49:0x08b2, B:52:0x08d1, B:53:0x0ac3, B:55:0x0acc, B:56:0x0b0f, B:58:0x0b1a, B:62:0x0b48, B:64:0x0b4e, B:65:0x0b90, B:67:0x0f16, B:69:0x0f26, B:70:0x1104, B:357:0x0ff1, B:358:0x0ca6, B:361:0x0cb7, B:363:0x0d49, B:366:0x0d53, B:370:0x0d60, B:372:0x0d65, B:378:0x0e56, B:380:0x0e5c, B:381:0x0e9a, B:384:0x0eb2, B:386:0x0ebf, B:387:0x0f08, B:389:0x0f10, B:390:0x0f15, B:393:0x1110, B:395:0x1116, B:396:0x1117, B:398:0x09b0, B:399:0x0582, B:402:0x06c1, B:410:0x07fc, B:412:0x0802, B:413:0x083a, B:416:0x0852, B:418:0x085f, B:419:0x08a8, B:422:0x1118, B:423:0x111d, B:427:0x111e, B:429:0x1124, B:430:0x1125, B:431:0x1126, B:434:0x1143, B:436:0x1146, B:438:0x115a, B:439:0x115f, B:445:0x02e5, B:453:0x037d, B:455:0x038a, B:456:0x03ca, B:459:0x03e2, B:461:0x03ef, B:462:0x042e, B:464:0x1160, B:465:0x1165, B:469:0x1166, B:471:0x116c, B:472:0x116d, B:405:0x0789, B:407:0x07a7, B:408:0x07ef, B:458:0x03d0, B:448:0x0334, B:450:0x0345, B:451:0x0374, B:383:0x0ea0, B:415:0x0840, B:375:0x0dea), top: B:2:0x0091, inners: #9, #11, #13, #24, #31, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0cac  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0d49 A[Catch: Exception -> 0x00e1, TRY_LEAVE, TryCatch #23 {Exception -> 0x00e1, blocks: (B:3:0x0091, B:15:0x00c6, B:16:0x00ff, B:25:0x0143, B:28:0x0257, B:30:0x0436, B:33:0x044d, B:35:0x0507, B:36:0x0544, B:42:0x0564, B:45:0x059f, B:47:0x05a8, B:48:0x05e5, B:49:0x08b2, B:52:0x08d1, B:53:0x0ac3, B:55:0x0acc, B:56:0x0b0f, B:58:0x0b1a, B:62:0x0b48, B:64:0x0b4e, B:65:0x0b90, B:67:0x0f16, B:69:0x0f26, B:70:0x1104, B:357:0x0ff1, B:358:0x0ca6, B:361:0x0cb7, B:363:0x0d49, B:366:0x0d53, B:370:0x0d60, B:372:0x0d65, B:378:0x0e56, B:380:0x0e5c, B:381:0x0e9a, B:384:0x0eb2, B:386:0x0ebf, B:387:0x0f08, B:389:0x0f10, B:390:0x0f15, B:393:0x1110, B:395:0x1116, B:396:0x1117, B:398:0x09b0, B:399:0x0582, B:402:0x06c1, B:410:0x07fc, B:412:0x0802, B:413:0x083a, B:416:0x0852, B:418:0x085f, B:419:0x08a8, B:422:0x1118, B:423:0x111d, B:427:0x111e, B:429:0x1124, B:430:0x1125, B:431:0x1126, B:434:0x1143, B:436:0x1146, B:438:0x115a, B:439:0x115f, B:445:0x02e5, B:453:0x037d, B:455:0x038a, B:456:0x03ca, B:459:0x03e2, B:461:0x03ef, B:462:0x042e, B:464:0x1160, B:465:0x1165, B:469:0x1166, B:471:0x116c, B:472:0x116d, B:405:0x0789, B:407:0x07a7, B:408:0x07ef, B:458:0x03d0, B:448:0x0334, B:450:0x0345, B:451:0x0374, B:383:0x0ea0, B:415:0x0840, B:375:0x0dea), top: B:2:0x0091, inners: #9, #11, #13, #24, #31, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0e48  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0d45  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x09b0 A[Catch: Exception -> 0x00e1, TryCatch #23 {Exception -> 0x00e1, blocks: (B:3:0x0091, B:15:0x00c6, B:16:0x00ff, B:25:0x0143, B:28:0x0257, B:30:0x0436, B:33:0x044d, B:35:0x0507, B:36:0x0544, B:42:0x0564, B:45:0x059f, B:47:0x05a8, B:48:0x05e5, B:49:0x08b2, B:52:0x08d1, B:53:0x0ac3, B:55:0x0acc, B:56:0x0b0f, B:58:0x0b1a, B:62:0x0b48, B:64:0x0b4e, B:65:0x0b90, B:67:0x0f16, B:69:0x0f26, B:70:0x1104, B:357:0x0ff1, B:358:0x0ca6, B:361:0x0cb7, B:363:0x0d49, B:366:0x0d53, B:370:0x0d60, B:372:0x0d65, B:378:0x0e56, B:380:0x0e5c, B:381:0x0e9a, B:384:0x0eb2, B:386:0x0ebf, B:387:0x0f08, B:389:0x0f10, B:390:0x0f15, B:393:0x1110, B:395:0x1116, B:396:0x1117, B:398:0x09b0, B:399:0x0582, B:402:0x06c1, B:410:0x07fc, B:412:0x0802, B:413:0x083a, B:416:0x0852, B:418:0x085f, B:419:0x08a8, B:422:0x1118, B:423:0x111d, B:427:0x111e, B:429:0x1124, B:430:0x1125, B:431:0x1126, B:434:0x1143, B:436:0x1146, B:438:0x115a, B:439:0x115f, B:445:0x02e5, B:453:0x037d, B:455:0x038a, B:456:0x03ca, B:459:0x03e2, B:461:0x03ef, B:462:0x042e, B:464:0x1160, B:465:0x1165, B:469:0x1166, B:471:0x116c, B:472:0x116d, B:405:0x0789, B:407:0x07a7, B:408:0x07ef, B:458:0x03d0, B:448:0x0334, B:450:0x0345, B:451:0x0374, B:383:0x0ea0, B:415:0x0840, B:375:0x0dea), top: B:2:0x0091, inners: #9, #11, #13, #24, #31, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:431:0x1126 A[Catch: Exception -> 0x00e1, TRY_LEAVE, TryCatch #23 {Exception -> 0x00e1, blocks: (B:3:0x0091, B:15:0x00c6, B:16:0x00ff, B:25:0x0143, B:28:0x0257, B:30:0x0436, B:33:0x044d, B:35:0x0507, B:36:0x0544, B:42:0x0564, B:45:0x059f, B:47:0x05a8, B:48:0x05e5, B:49:0x08b2, B:52:0x08d1, B:53:0x0ac3, B:55:0x0acc, B:56:0x0b0f, B:58:0x0b1a, B:62:0x0b48, B:64:0x0b4e, B:65:0x0b90, B:67:0x0f16, B:69:0x0f26, B:70:0x1104, B:357:0x0ff1, B:358:0x0ca6, B:361:0x0cb7, B:363:0x0d49, B:366:0x0d53, B:370:0x0d60, B:372:0x0d65, B:378:0x0e56, B:380:0x0e5c, B:381:0x0e9a, B:384:0x0eb2, B:386:0x0ebf, B:387:0x0f08, B:389:0x0f10, B:390:0x0f15, B:393:0x1110, B:395:0x1116, B:396:0x1117, B:398:0x09b0, B:399:0x0582, B:402:0x06c1, B:410:0x07fc, B:412:0x0802, B:413:0x083a, B:416:0x0852, B:418:0x085f, B:419:0x08a8, B:422:0x1118, B:423:0x111d, B:427:0x111e, B:429:0x1124, B:430:0x1125, B:431:0x1126, B:434:0x1143, B:436:0x1146, B:438:0x115a, B:439:0x115f, B:445:0x02e5, B:453:0x037d, B:455:0x038a, B:456:0x03ca, B:459:0x03e2, B:461:0x03ef, B:462:0x042e, B:464:0x1160, B:465:0x1165, B:469:0x1166, B:471:0x116c, B:472:0x116d, B:405:0x0789, B:407:0x07a7, B:408:0x07ef, B:458:0x03d0, B:448:0x0334, B:450:0x0345, B:451:0x0374, B:383:0x0ea0, B:415:0x0840, B:375:0x0dea), top: B:2:0x0091, inners: #9, #11, #13, #24, #31, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0acc A[Catch: Exception -> 0x00e1, TryCatch #23 {Exception -> 0x00e1, blocks: (B:3:0x0091, B:15:0x00c6, B:16:0x00ff, B:25:0x0143, B:28:0x0257, B:30:0x0436, B:33:0x044d, B:35:0x0507, B:36:0x0544, B:42:0x0564, B:45:0x059f, B:47:0x05a8, B:48:0x05e5, B:49:0x08b2, B:52:0x08d1, B:53:0x0ac3, B:55:0x0acc, B:56:0x0b0f, B:58:0x0b1a, B:62:0x0b48, B:64:0x0b4e, B:65:0x0b90, B:67:0x0f16, B:69:0x0f26, B:70:0x1104, B:357:0x0ff1, B:358:0x0ca6, B:361:0x0cb7, B:363:0x0d49, B:366:0x0d53, B:370:0x0d60, B:372:0x0d65, B:378:0x0e56, B:380:0x0e5c, B:381:0x0e9a, B:384:0x0eb2, B:386:0x0ebf, B:387:0x0f08, B:389:0x0f10, B:390:0x0f15, B:393:0x1110, B:395:0x1116, B:396:0x1117, B:398:0x09b0, B:399:0x0582, B:402:0x06c1, B:410:0x07fc, B:412:0x0802, B:413:0x083a, B:416:0x0852, B:418:0x085f, B:419:0x08a8, B:422:0x1118, B:423:0x111d, B:427:0x111e, B:429:0x1124, B:430:0x1125, B:431:0x1126, B:434:0x1143, B:436:0x1146, B:438:0x115a, B:439:0x115f, B:445:0x02e5, B:453:0x037d, B:455:0x038a, B:456:0x03ca, B:459:0x03e2, B:461:0x03ef, B:462:0x042e, B:464:0x1160, B:465:0x1165, B:469:0x1166, B:471:0x116c, B:472:0x116d, B:405:0x0789, B:407:0x07a7, B:408:0x07ef, B:458:0x03d0, B:448:0x0334, B:450:0x0345, B:451:0x0374, B:383:0x0ea0, B:415:0x0840, B:375:0x0dea), top: B:2:0x0091, inners: #9, #11, #13, #24, #31, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0f26 A[Catch: Exception -> 0x00e1, TryCatch #23 {Exception -> 0x00e1, blocks: (B:3:0x0091, B:15:0x00c6, B:16:0x00ff, B:25:0x0143, B:28:0x0257, B:30:0x0436, B:33:0x044d, B:35:0x0507, B:36:0x0544, B:42:0x0564, B:45:0x059f, B:47:0x05a8, B:48:0x05e5, B:49:0x08b2, B:52:0x08d1, B:53:0x0ac3, B:55:0x0acc, B:56:0x0b0f, B:58:0x0b1a, B:62:0x0b48, B:64:0x0b4e, B:65:0x0b90, B:67:0x0f16, B:69:0x0f26, B:70:0x1104, B:357:0x0ff1, B:358:0x0ca6, B:361:0x0cb7, B:363:0x0d49, B:366:0x0d53, B:370:0x0d60, B:372:0x0d65, B:378:0x0e56, B:380:0x0e5c, B:381:0x0e9a, B:384:0x0eb2, B:386:0x0ebf, B:387:0x0f08, B:389:0x0f10, B:390:0x0f15, B:393:0x1110, B:395:0x1116, B:396:0x1117, B:398:0x09b0, B:399:0x0582, B:402:0x06c1, B:410:0x07fc, B:412:0x0802, B:413:0x083a, B:416:0x0852, B:418:0x085f, B:419:0x08a8, B:422:0x1118, B:423:0x111d, B:427:0x111e, B:429:0x1124, B:430:0x1125, B:431:0x1126, B:434:0x1143, B:436:0x1146, B:438:0x115a, B:439:0x115f, B:445:0x02e5, B:453:0x037d, B:455:0x038a, B:456:0x03ca, B:459:0x03e2, B:461:0x03ef, B:462:0x042e, B:464:0x1160, B:465:0x1165, B:469:0x1166, B:471:0x116c, B:472:0x116d, B:405:0x0789, B:407:0x07a7, B:408:0x07ef, B:458:0x03d0, B:448:0x0334, B:450:0x0345, B:451:0x0374, B:383:0x0ea0, B:415:0x0840, B:375:0x0dea), top: B:2:0x0091, inners: #9, #11, #13, #24, #31, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x117b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x11b1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x120f A[Catch: all -> 0x1255, TryCatch #39 {all -> 0x1255, blocks: (B:87:0x11f5, B:89:0x120f, B:90:0x1258), top: B:86:0x11f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x1272  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle bundle) {
        IdentySdk identySdk;
        FingerAS fingerAS;
        boolean z;
        Object PngjBadSignature2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        boolean z5;
        boolean z6;
        int i2;
        int i3;
        int i4;
        float f;
        char c;
        int i5;
        long j;
        int i6;
        int intValue;
        Object[] values$1eba2e16;
        int intValue2;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        int i7;
        int i8;
        int i9;
        Object PngjBadSignature3;
        long j2;
        Context baseContext;
        String str;
        Object[] objArr4;
        int i10;
        int i11;
        char indexOf;
        int scrollBarFadeDuration;
        int modifierMetaStateMask;
        byte[] bArr;
        Class cls = Integer.TYPE;
        int i12 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
        int values2 = 0;
        int i13 = i12 * (-432);
        int i14 = (i13 & 434) + (i13 | 434);
        int i15 = ~i12;
        int i16 = (~values2) | i15;
        int i17 = (~((i16 ^ 1) | (i16 & 1))) * 433;
        int i18 = ((i14 | i17) << 1) - (i14 ^ i17);
        int i19 = ~(((-2) ^ values2) | ((-2) & values2));
        int i20 = ((i19 & i15) | (i15 ^ i19)) * (-433);
        int i21 = (i18 ^ i20) + ((i18 & i20) << 1);
        int i22 = -(-(((~((i12 & 1) | (i12 ^ 1))) | (~((values2 & i15) | (i15 ^ values2)))) * 433));
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        Object[] objArr5 = new Object[1];
        e("䲝ૣ䳼꘎⌥垸\ufefe穇吅焱剃\ue5f8⣪ᨋ읷㮱嫀젷ᔙ䦋蓀縓嬝龕㛂ⰷ", i23, objArr5);
        String str2 = (String) objArr5[0];
        int i24 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
        int i25 = ((i24 | 1) << 1) - (i24 ^ 1);
        Object[] objArr6 = new Object[1];
        e("恊ﾵ怯博㈔튐툵歳ꅟ怅흩悮з\uef4f혁뺼瘇㵿м", i25, objArr6);
        String str3 = (String) objArr6[0];
        super.onCreate(bundle);
        try {
            try {
                try {
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
                    if (PngjBadSignature4 == null) {
                        c = '0';
                        try {
                            indexOf = (char) (14830 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0));
                            scrollBarFadeDuration = 28 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            i5 = 2;
                            try {
                                modifierMetaStateMask = 720 - ((byte) KeyEvent.getModifierMetaStateMask());
                                bArr = $$d;
                                i3 = 11;
                            } catch (Exception e) {
                            }
                        } catch (Exception e2) {
                        }
                        try {
                            i4 = 0;
                            byte b = (byte) (bArr[20] - 1);
                            f = 0.0f;
                            Object[] objArr7 = new Object[1];
                            f((byte) (bArr[11] - 1), b, (byte) (b | 13), objArr7);
                            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf, scrollBarFadeDuration, modifierMetaStateMask, -815159504, false, (String) objArr7[0], null);
                        } catch (Exception e3) {
                            identySdk = null;
                            e3.printStackTrace();
                            fingerAS = null;
                            com.identy.getPadSub2.PngjException("START_UP", " onCreate start");
                            if (identySdk != null) {
                            }
                            com.identy.getPadSub2.PngjException("START_UP", " onCreate start 251");
                            DisplayManager displayManager = (DisplayManager) getSystemService("display");
                            if (fingerAS.ordinal() >= FingerAS.BALANCED_VERY_HIGH.ordinal()) {
                            }
                            try {
                                LibSettings.isSaveCaptured();
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                            try {
                                Object[] objArr8 = {this, 1, new getL3Score()};
                                z = false;
                                z = false;
                                z = false;
                                z = false;
                                z = false;
                                z = false;
                                z = false;
                                z = false;
                                z = false;
                                z = false;
                                z = false;
                                z2 = false;
                                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1578525895);
                                if (PngjBadSignature2 == null) {
                                }
                                ((Method) PngjBadSignature2).invoke(null, objArr8);
                                try {
                                    LibSettings.isSaveCaptured();
                                } catch (Exception e5) {
                                    e5.printStackTrace();
                                }
                                try {
                                    if (!IdentySdk.getInstance().y()) {
                                    }
                                } catch (Exception e6) {
                                    e6.printStackTrace();
                                    z2 = z;
                                }
                                try {
                                    if (IdentySdk.getInstance().getLocale() != null) {
                                    }
                                } catch (Exception e7) {
                                    e7.printStackTrace();
                                }
                                try {
                                    if (LibSettings.isSaveCaptured()) {
                                    }
                                } catch (Exception e8) {
                                    e8.printStackTrace();
                                }
                                try {
                                    IdentySdk.getInstance().b(true);
                                } catch (Exception e9) {
                                    e9.printStackTrace();
                                }
                                try {
                                    if (LibSettings.isSaveCaptured()) {
                                    }
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                                if (PngjBadSignature((Context) this)) {
                                }
                                try {
                                    LibSettings.isSaveCaptured();
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                                new NativeAlgoUtils();
                                try {
                                    z6 = IdentySdk.getInstance().isCustomSDK();
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                    z6 = z5;
                                }
                                com.identy.getPadSub2.PngjException("START_UP", " onCreate start 386");
                                if (z6) {
                                }
                                setContentView(i2);
                                this.PngjInputException = new com.identy.d.values(getApplicationContext());
                                values(bundle);
                                PngjException(com.identy.a.PngjException.values(), -1873363838, new Object[]{this}, com.identy.a.PngjException.values(), 1873363863, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
                                this.e1 = (TextView) findViewById(R.id.middle_info_text);
                                PngjException(com.identy.a.PngjException.values(), 1180049510, new Object[]{this}, com.identy.a.PngjException.values(), -1180049488, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
                                HandlerThread handlerThread = new HandlerThread("keystoreCreation");
                                handlerThread.start();
                                try {
                                    if (LibSettings.isSaveCaptured()) {
                                    }
                                } catch (Exception e13) {
                                    e13.printStackTrace();
                                }
                                try {
                                    if (IdentySdk.getInstance().getAction() != null) {
                                    }
                                } catch (Exception e14) {
                                    e14.printStackTrace();
                                }
                                try {
                                    LibSettings.isSaveCaptured();
                                    return;
                                } catch (Exception e15) {
                                    e15.printStackTrace();
                                    return;
                                }
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();

                                if (cause == null) {

                                    throw new RuntimeException(th);

                                }

                                throw new RuntimeException(cause);
                            }
                        }
                    } else {
                        i3 = 11;
                        i4 = 0;
                        f = 0.0f;
                        c = '0';
                        i5 = 2;
                    }
                    j = ((Field) PngjBadSignature4).getLong(null);
                } catch (Exception e16) {
                    identySdk = null;
                    e16.printStackTrace();
                    fingerAS = null;
                    com.identy.getPadSub2.PngjException("START_UP", " onCreate start");
                    if (identySdk != null) {
                    }
                    com.identy.getPadSub2.PngjException("START_UP", " onCreate start 251");
                    DisplayManager displayManager2 = (DisplayManager) getSystemService("display");
                    if (fingerAS.ordinal() >= FingerAS.BALANCED_VERY_HIGH.ordinal()) {
                    }
                    LibSettings.isSaveCaptured();
                    Object[] objArr82 = {this, 1, new getL3Score()};
                    z = false;
                    z = false;
                    z = false;
                    z = false;
                    z = false;
                    z = false;
                    z = false;
                    z = false;
                    z = false;
                    z = false;
                    z = false;
                    z2 = false;
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1578525895);
                    if (PngjBadSignature2 == null) {
                    }
                    ((Method) PngjBadSignature2).invoke(null, objArr82);
                    LibSettings.isSaveCaptured();
                    if (!IdentySdk.getInstance().y()) {
                    }
                    if (IdentySdk.getInstance().getLocale() != null) {
                    }
                    if (LibSettings.isSaveCaptured()) {
                    }
                    IdentySdk.getInstance().b(true);
                    if (LibSettings.isSaveCaptured()) {
                    }
                    if (PngjBadSignature((Context) this)) {
                    }
                    LibSettings.isSaveCaptured();
                    new NativeAlgoUtils();
                    z6 = IdentySdk.getInstance().isCustomSDK();
                    com.identy.getPadSub2.PngjException("START_UP", " onCreate start 386");
                    if (z6) {
                    }
                    setContentView(i2);
                    this.PngjInputException = new com.identy.d.values(getApplicationContext());
                    values(bundle);
                    PngjException(com.identy.a.PngjException.values(), -1873363838, new Object[]{this}, com.identy.a.PngjException.values(), 1873363863, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
                    this.e1 = (TextView) findViewById(R.id.middle_info_text);
                    PngjException(com.identy.a.PngjException.values(), 1180049510, new Object[]{this}, com.identy.a.PngjException.values(), -1180049488, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
                    HandlerThread handlerThread2 = new HandlerThread("keystoreCreation");
                    handlerThread2.start();
                    if (LibSettings.isSaveCaptured()) {
                    }
                    if (IdentySdk.getInstance().getAction() != null) {
                    }
                    LibSettings.isSaveCaptured();
                    return;
                }
                if (j != -1) {
                    int i26 = setFoundMatchingTemplates;
                    toJson = ((i26 ^ 79) + ((i26 & 79) << 1)) % 128;
                    try {
                    } catch (Exception e17) {
                        identySdk = null;
                        e17.printStackTrace();
                        fingerAS = null;
                        com.identy.getPadSub2.PngjException("START_UP", " onCreate start");
                        if (identySdk != null) {
                        }
                        com.identy.getPadSub2.PngjException("START_UP", " onCreate start 251");
                        DisplayManager displayManager22 = (DisplayManager) getSystemService("display");
                        if (fingerAS.ordinal() >= FingerAS.BALANCED_VERY_HIGH.ordinal()) {
                        }
                        LibSettings.isSaveCaptured();
                        Object[] objArr822 = {this, 1, new getL3Score()};
                        z = false;
                        z = false;
                        z = false;
                        z = false;
                        z = false;
                        z = false;
                        z = false;
                        z = false;
                        z = false;
                        z = false;
                        z = false;
                        z2 = false;
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1578525895);
                        if (PngjBadSignature2 == null) {
                        }
                        ((Method) PngjBadSignature2).invoke(null, objArr822);
                        LibSettings.isSaveCaptured();
                        if (!IdentySdk.getInstance().y()) {
                        }
                        if (IdentySdk.getInstance().getLocale() != null) {
                        }
                        if (LibSettings.isSaveCaptured()) {
                        }
                        IdentySdk.getInstance().b(true);
                        if (LibSettings.isSaveCaptured()) {
                        }
                        if (PngjBadSignature((Context) this)) {
                        }
                        LibSettings.isSaveCaptured();
                        new NativeAlgoUtils();
                        z6 = IdentySdk.getInstance().isCustomSDK();
                        com.identy.getPadSub2.PngjException("START_UP", " onCreate start 386");
                        if (z6) {
                        }
                        setContentView(i2);
                        this.PngjInputException = new com.identy.d.values(getApplicationContext());
                        values(bundle);
                        PngjException(com.identy.a.PngjException.values(), -1873363838, new Object[]{this}, com.identy.a.PngjException.values(), 1873363863, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
                        this.e1 = (TextView) findViewById(R.id.middle_info_text);
                        PngjException(com.identy.a.PngjException.values(), 1180049510, new Object[]{this}, com.identy.a.PngjException.values(), -1180049488, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
                        HandlerThread handlerThread22 = new HandlerThread("keystoreCreation");
                        handlerThread22.start();
                        if (LibSettings.isSaveCaptured()) {
                        }
                        if (IdentySdk.getInstance().getAction() != null) {
                        }
                        LibSettings.isSaveCaptured();
                        return;
                    }
                    if (j + 4611686018427387788L >= ((Long) Class.forName(str2).getDeclaredMethod(str3, null).invoke(null, null)).longValue()) {
                        Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                        if (PngjBadSignature5 == null) {
                            char c2 = (char) ((TypedValue.complexToFloat(i4) > f ? 1 : (TypedValue.complexToFloat(i4) == f ? 0 : -1)) + 14830);
                            float f2 = f;
                            int i27 = 28 - (TypedValue.complexToFraction(i4, f2, f2) > f2 ? 1 : (TypedValue.complexToFraction(i4, f2, f2) == f2 ? 0 : -1));
                            int axisFromString = MotionEvent.axisFromString(BuildConfig.FLAVOR) + 722;
                            i6 = -1;
                            Object[] objArr9 = new Object[1];
                            f((byte) ($$e & 95), (byte) ($$a[20] - 1), (byte) (-$$d[53]), objArr9);
                            PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c2, i27, axisFromString, -779023007, false, (String) objArr9[0], null);
                        } else {
                            i6 = -1;
                        }
                        Object[] objArr10 = (Object[]) ((Field) PngjBadSignature5).get(null);
                        values$1eba2e16 = new Object[4];
                        values$1eba2e16[0] = new int[]{0};
                        values$1eba2e16[1] = new int[1];
                        values$1eba2e16[3] = new int[]{0};
                        int i28 = ((int[]) objArr10[3])[0];
                        int i29 = ((int[]) objArr10[0])[0];
                        values$1eba2e16[i5] = (String[]) objArr10[i5];
                        int i30 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
                        int i31 = (((~((~i30) | (-321080323))) | (-1000861012)) * 564) + ((~(i30 | (-287375361))) * 1128) + (((((~((-713485652) | 0)) | (-321080323)) | (~(713485651 | i30))) * (-564)) - 987127863);
                        int values3 = 0;
                        int i32 = i31 * (-613);
                        int i33 = -(-(((~(~i31)) | values3) * 614));
                        int i34 = (i32 & i33) + (i32 | i33);
                        int i35 = ~values3;
                        int i36 = ~((i6 ^ i35) | i35);
                        int i37 = ~((i6 ^ i31) | i31);
                        int i38 = (i36 ^ i37) | (i37 & i36);
                        int i39 = ~values3;
                        int i40 = ~((i39 & i31) | (i39 ^ i31));
                        int i41 = (i34 - (~(-(-(((i40 & i38) | (i38 ^ i40)) * (-1228)))))) - 1;
                        int i42 = ~i31;
                        int i43 = i42 | (i6 ^ i42);
                        int i44 = ~((i43 & i35) | (i43 ^ i35));
                        int i45 = ~((i31 & i35) | (i35 ^ i31));
                        int i46 = -(-(((i44 & i45) | (i44 ^ i45)) * 614));
                        int i47 = (i41 & i46) + (i46 | i41);
                        int values4 = 0;
                        int i48 = i47 * 141;
                        int i49 = (i48 ^ 1554308854) + ((i48 & 1554308854) << 1);
                        int i50 = ~i47;
                        int i51 = ~((i50 ^ (-1154446754)) | (i50 & (-1154446754)));
                        int i52 = ~((i50 ^ values4) | (i50 & values4));
                        int i53 = ((i51 ^ i52) | (i52 & i51)) * (-280);
                        int i54 = ((i49 | i53) << 1) - (i53 ^ i49);
                        int i55 = ~i47;
                        int i56 = (((~((i55 & values4) | (i55 ^ values4))) | (~(1154446753 | values4))) * 140) + i54;
                        int i57 = (i50 ^ 1154446753) | (i50 & 1154446753);
                        int i58 = ~((i57 ^ values4) | (i57 & values4));
                        int i59 = ~values4;
                        int i60 = (i50 ^ i59) | (i50 & i59);
                        int i61 = ~((i60 & (-1154446754)) | (i60 ^ (-1154446754)));
                        int i62 = ~values4;
                        int i63 = (((~((1154446753 & i62) | (1154446753 ^ i62) | i47)) | (i61 & i58) | (i58 ^ i61)) * 140) + i56;
                        int i64 = i63 << 13;
                        int i65 = (i63 | i64) & (~(i63 & i64));
                        int i66 = i65 >>> 17;
                        int i67 = (i65 | i66) & (~(i65 & i66));
                        ((int[]) values$1eba2e16[1])[0] = i67 ^ (i67 << 5);
                        if (((int[]) values$1eba2e16[3])[0] == ((int[]) values$1eba2e16[0])[0]) {
                            ArrayList arrayList = new ArrayList();
                            String[] strArr = (String[]) values$1eba2e16[2];
                            if (strArr != null) {
                                int i68 = toJson;
                                setFoundMatchingTemplates = ((i68 ^ 81) + ((i68 & 81) << 1)) % 128;
                                int i69 = 0;
                                while (i69 < strArr.length) {
                                    arrayList.add(strArr[i69]);
                                    int i70 = (i69 & 68) + (i69 | 68);
                                    i69 = (i70 ^ (-67)) + ((i70 & (-67)) << 1);
                                }
                            }
                            throw new NullPointerException();
                        }
                        toJson = (setFoundMatchingTemplates + 55) % 128;
                        Object[] objArr11 = new Object[4];
                        objArr11[0] = new int[]{0};
                        objArr11[1] = new int[1];
                        objArr11[3] = new int[]{0};
                        int i71 = ((int[]) values$1eba2e16[1])[0];
                        int i72 = ((int[]) values$1eba2e16[3])[0];
                        int i73 = ((int[]) values$1eba2e16[0])[0];
                        objArr11[i5] = (String[]) values$1eba2e16[i5];
                        int identityHashCode = System.identityHashCode(this);
                        int i74 = (((~(identityHashCode | 304576581)) | (~((-729989393) | identityHashCode)) | 696287504) * 623) + (((~identityHashCode) | 270874693) * (-623)) + (((~((-696287505) | identityHashCode)) * 623) - 2004610224);
                        int identityHashCode2 = System.identityHashCode(this);
                        int i75 = i74 * (-864);
                        int i76 = (i75 << 1) - i75;
                        int i77 = ~i74;
                        int i78 = ~identityHashCode2;
                        int i79 = -(-(i77 * (-865)));
                        int i80 = ((~identityHashCode2) * 865) + (i76 ^ i79) + ((i76 & i79) << 1);
                        int i81 = ~(i77 | (~identityHashCode2));
                        int i82 = ~i78;
                        int i83 = ((i81 & i82) | (i81 ^ i82)) * 865;
                        int i84 = -(-((i80 ^ i83) + ((i83 & i80) << 1)));
                        int i85 = ((i71 | i84) << 1) - (i84 ^ i71);
                        int i86 = i85 << 13;
                        int i87 = (i86 | i85) & (~(i85 & i86));
                        int i88 = i87 >>> 17;
                        int i89 = (i87 | i88) & (~(i87 & i88));
                        int i90 = i89 << 5;
                        ((int[]) objArr11[1])[0] = (i89 | i90) & (~(i89 & i90));
                        Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
                        if (PngjBadSignature6 == null) {
                            char combineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                            int scrollBarFadeDuration2 = 37 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int deadChar = KeyEvent.getDeadChar(0, 0) + 549;
                            byte[] bArr2 = $$d;
                            byte b2 = (byte) (bArr2[i3] - 1);
                            byte b3 = (byte) (bArr2[20] - 1);
                            Object[] objArr12 = new Object[1];
                            f(b2, b3, (byte) (b3 | 13), objArr12);
                            PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(combineMeasuredStates, scrollBarFadeDuration2, deadChar, -1608103378, false, (String) objArr12[0], null);
                        }
                        long j3 = ((Field) PngjBadSignature6).getLong(null);
                        try {
                            try {
                                try {
                                    if (j3 != -1) {
                                        int i91 = toJson;
                                        int i92 = (i91 & 15) + (i91 | 15);
                                        setFoundMatchingTemplates = i92 % 128;
                                        if (i92 % 2 == 0) {
                                            if ((j3 | 4611686018427387901L) >= ((Long) Class.forName(str2).getDeclaredMethod(str3, null).invoke(null, new Object[1])).longValue()) {
                                                Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
                                                if (PngjBadSignature7 == null) {
                                                    int i93 = 38 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                    int mirror = AndroidCharacter.getMirror(c) + 501;
                                                    byte b4 = $$d[20];
                                                    Object[] objArr13 = new Object[1];
                                                    f((byte) i3, b4, b4, objArr13);
                                                    PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), i93, mirror, 1452666181, false, (String) objArr13[0], null);
                                                }
                                                Object[] objArr14 = (Object[]) ((Field) PngjBadSignature7).get(null);
                                                objArr3 = new Object[]{new int[1], new int[1], new int[1]};
                                                int i94 = ((int[]) objArr14[1])[0];
                                                int i95 = ((int[]) objArr14[i5])[0];
                                                ((int[]) objArr3[1])[0] = i94;
                                                ((int[]) objArr3[i5])[0] = i95;
                                                int myTid = Process.myTid();
                                                int i96 = ~myTid;
                                                int i97 = (((~(myTid | (-1283800903))) | (-1321566175)) * 49) + (((~(i96 | (-180442333))) | (-1283800903) | (~(180442332 | myTid))) * (-49)) + (((~((-1283800903) | i96)) | 1141123842) * 98) + 457546098;
                                                int identityHashCode3 = System.identityHashCode(this);
                                                int i98 = (i97 * (-183)) - 1762966914;
                                                int i99 = ~i97;
                                                int i100 = ~identityHashCode3;
                                                int i101 = ~((i100 & i99) | (i99 ^ i100) | 1065773198);
                                                int i102 = ~identityHashCode3;
                                                int i103 = ((-1065773199) ^ i102) | ((-1065773199) & i102);
                                                int i104 = ~((i103 ^ i97) | (i103 & i97));
                                                int i105 = -(-(((i101 ^ i104) | (i101 & i104)) * (-184)));
                                                int i106 = (i98 & i105) + (i98 | i105);
                                                int i107 = ~((i99 & (-1065773199)) | (i99 ^ (-1065773199)));
                                                int i108 = ~i97;
                                                int i109 = ~((i108 ^ i102) | (i108 & i102));
                                                int i110 = (i107 ^ i109) | (i107 & i109);
                                                int i111 = ~(i102 | (-1065773199));
                                                int i112 = -(-(((i111 & i110) | (i110 ^ i111)) * 184));
                                                int i113 = ((i106 | i112) << 1) - (i112 ^ i106);
                                                int i114 = ((i97 & 1065773198) | (i97 ^ 1065773198)) * 184;
                                                int i115 = (i113 ^ i114) + ((i114 & i113) << 1);
                                                int i116 = i115 << 13;
                                                int i117 = (i116 | i115) & (~(i115 & i116));
                                                int i118 = i117 ^ (i117 >>> 17);
                                                ((int[]) objArr3[0])[0] = i118 ^ (i118 << 5);
                                                Object obj = objArr3[i5];
                                                i7 = ((int[]) obj)[0];
                                                Object obj2 = objArr3[1];
                                                i8 = ((int[]) obj2)[0];
                                                if (i8 != i7) {
                                                    int i119 = setFoundMatchingTemplates;
                                                    toJson = (((i119 | 123) << 1) - (i119 ^ 123)) % 128;
                                                    Object[] objArr15 = {new int[1], new int[1], new int[1]};
                                                    int i120 = ((int[]) objArr3[0])[0];
                                                    int i121 = ((int[]) obj2)[0];
                                                    int i122 = ((int[]) obj)[0];
                                                    ((int[]) objArr15[1])[0] = i121;
                                                    ((int[]) objArr15[2])[0] = i122;
                                                    int i123 = (((~(((int) Process.getStartElapsedRealtime()) | (-1074004753))) | 373358796) * 130) + (((~((~0) | (-1074004753))) * 130) - 2009424278);
                                                    int identityHashCode4 = System.identityHashCode(this);
                                                    int i124 = i123 * (-919);
                                                    int i125 = i120 * (-919);
                                                    int i126 = (i124 & i125) + (i124 | i125);
                                                    int i127 = ~i123;
                                                    int i128 = ~i120;
                                                    int i129 = (i127 ^ i128) | (i127 & i128);
                                                    int i130 = ~((i129 ^ identityHashCode4) | (i129 & identityHashCode4));
                                                    int i131 = ~identityHashCode4;
                                                    int i132 = (i128 ^ i131) | (i128 & i131);
                                                    int i133 = (i130 | (~((i132 ^ i123) | (i132 & i123)))) * 920;
                                                    int i134 = (i126 & i133) + (i133 | i126);
                                                    int i135 = ~i123;
                                                    int i136 = ~i120;
                                                    int i137 = ~((i135 ^ i136) | (i135 & i136));
                                                    int i138 = ~((i127 ^ i131) | (i127 & i131));
                                                    int i139 = -(-(((i137 ^ i138) | (i138 & i137)) * 920));
                                                    int i140 = (i134 ^ i139) + ((i134 & i139) << 1);
                                                    int i141 = i127 | i136;
                                                    int i142 = ~((i141 ^ i131) | (i141 & i131));
                                                    int i143 = ~((i120 & i127) | (i127 ^ i120) | identityHashCode4);
                                                    int i144 = (i142 & i143) | (i142 ^ i143);
                                                    int i145 = i136 | i123;
                                                    int i146 = (i144 | (~((i145 & identityHashCode4) | (i145 ^ identityHashCode4)))) * 920;
                                                    int i147 = (i140 ^ i146) + ((i146 & i140) << 1);
                                                    int i148 = (i147 << 13) ^ i147;
                                                    int i149 = i148 >>> 17;
                                                    int i150 = ((~i148) & i149) | ((~i149) & i148);
                                                    int i151 = i150 << 5;
                                                    ((int[]) objArr15[0])[0] = (i150 | i151) & (~(i150 & i151));
                                                    i9 = 0;
                                                } else {
                                                    int[] iArr = new int[i8];
                                                    int i152 = i8 - 1;
                                                    iArr[i152] = 1;
                                                    Toast.makeText((Context) null, iArr[((i8 * i152) % 2) - 1], 1).show();
                                                    Object[] objArr16 = {new int[1], new int[1], new int[1]};
                                                    int i153 = ((int[]) objArr3[0])[0];
                                                    int i154 = ((int[]) objArr3[1])[0];
                                                    int i155 = ((int[]) objArr3[2])[0];
                                                    ((int[]) objArr16[1])[0] = i154;
                                                    ((int[]) objArr16[2])[0] = i155;
                                                    int maxMemory = (int) Runtime.getRuntime().maxMemory();
                                                    int i156 = ((346375132 | maxMemory) * 614) - 1507561462;
                                                    int i157 = ~maxMemory;
                                                    int i158 = (((~(i157 | 905309183)) | (~((-558934052) | i157))) * 614) + (((~((-827632432) | i157)) | 268698380 | (~(636610803 | i157))) * (-1228)) + i156;
                                                    int values5 = com.identy.a.PngjException.values();
                                                    int i159 = (-965) - (~(-(-(i158 * 965))));
                                                    int i160 = ~i158;
                                                    int i161 = ~(i160 | values5);
                                                    int i162 = ((i6 ^ i161) | i161) * (-964);
                                                    int i163 = (i159 ^ i162) + ((i159 & i162) << 1);
                                                    int i164 = ~values5;
                                                    int i165 = ~((i164 & i160) | (i160 ^ i164));
                                                    int i166 = ~(~i158);
                                                    int i167 = -(-(((i166 & i165) | (i165 ^ i166)) * (-964)));
                                                    int i168 = (i163 & i167) + (i163 | i167);
                                                    int values6 = com.identy.a.PngjException.values();
                                                    int i169 = i168 * 714;
                                                    int i170 = -(-(i153 * (-712)));
                                                    int i171 = (i169 & i170) + (i169 | i170);
                                                    int i172 = ~i168;
                                                    int i173 = ~values6;
                                                    int i174 = ~((i172 ^ i173) | (i172 & i173));
                                                    int i175 = ~(i172 | i153);
                                                    int i176 = (i174 ^ i175) | (i174 & i175);
                                                    int i177 = ~i153;
                                                    int i178 = ~(i177 | i168 | values6);
                                                    int i179 = (i171 - (~(((i176 ^ i178) | (i176 & i178)) * (-713)))) - 1;
                                                    int i180 = -(-((~((i177 ^ i168) | (i168 & i177) | values6)) * 1426));
                                                    int i181 = ((~((i177 ^ i173) | (i177 & i173))) * 713) + (i179 & i180) + (i180 | i179);
                                                    int i182 = i181 << 13;
                                                    int i183 = (i181 | i182) & (~(i181 & i182));
                                                    int i184 = i183 >>> 17;
                                                    int i185 = (i183 | i184) & (~(i183 & i184));
                                                    int i186 = i185 << 5;
                                                    i9 = 0;
                                                    ((int[]) objArr16[0])[0] = ((~i185) & i186) | ((~i186) & i185);
                                                }
                                                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
                                                if (PngjBadSignature3 == null) {
                                                    char size = (char) (View.MeasureSpec.getSize(i9) + 31077);
                                                    int indexOf2 = TextUtils.indexOf(BuildConfig.FLAVOR, c) + 50;
                                                    int maxKeyCode = 1043 - (KeyEvent.getMaxKeyCode() >> 16);
                                                    byte[] bArr3 = $$d;
                                                    byte b5 = (byte) (bArr3[11] - 1);
                                                    byte b6 = (byte) (bArr3[20] - 1);
                                                    Object[] objArr17 = new Object[1];
                                                    f(b5, b6, (byte) (b6 | 13), objArr17);
                                                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(size, indexOf2, maxKeyCode, 159283629, false, (String) objArr17[0], null);
                                                }
                                                j2 = ((Field) PngjBadSignature3).getLong(null);
                                                if (j2 != -1 || j2 + 4611686018427387774L < ((Long) Class.forName(str2).getDeclaredMethod(str3, null).invoke(null, null)).longValue()) {
                                                    baseContext = getBaseContext();
                                                    if (baseContext != null) {
                                                        int i187 = setFoundMatchingTemplates;
                                                        toJson = ((i187 & 93) + (i187 | 93)) % 128;
                                                        int rgb = Color.rgb(0, 0, 0);
                                                        int i188 = (rgb ^ 16777217) + ((rgb & 16777217) << 1);
                                                        Object[] objArr18 = new Object[1];
                                                        e("\ue8d1\ued15\ue8b0䇸祚㫂媲‸돳⭎㼹袂貨\ufdfe鵖嚶ﺴ⿑佦⓽ₗ駏ź\uf2f9銹쯂\uf308䂙쓸㖺", i188, objArr18);
                                                        Class<?> cls2 = Class.forName((String) objArr18[0]);
                                                        int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                                                        int values7 = com.identy.a.PngjException.values();
                                                        int i189 = windowTouchSlop * (-495);
                                                        int i190 = (i189 & (-495)) + (i189 | (-495));
                                                        int i191 = ~windowTouchSlop;
                                                        int i192 = ~(i191 | (-2));
                                                        str = str2;
                                                        int i193 = ~windowTouchSlop;
                                                        int i194 = ~((i193 ^ values7) | (i193 & values7));
                                                        int i195 = -(-(((i192 ^ i194) | (i194 & i192)) * 992));
                                                        int i196 = (i190 & i195) + (i195 | i190);
                                                        int i197 = ~((i191 ^ (-2)) | (i191 & (-2)));
                                                        int i198 = ~((i191 & values7) | (i191 ^ values7));
                                                        int i199 = (i197 & i198) | (i197 ^ i198);
                                                        int i200 = ~values7;
                                                        int i201 = (windowTouchSlop & i200) | (i200 ^ windowTouchSlop);
                                                        int i202 = ~((i201 & 1) | (i201 ^ 1));
                                                        int i203 = ((i202 & i199) | (i199 ^ i202)) * (-496);
                                                        int i204 = (((i196 & i203) + (i203 | i196)) - (~(((values7 ^ 1) | (values7 & 1)) * 496))) - 1;
                                                        Object[] objArr19 = new Object[1];
                                                        e("䁤铚䀇㠬亲좂\uf20dំ쨻Რ쵹窭␌萱ꪴ꒱嘣嘜碘횽蠻\ue007", i204, objArr19);
                                                        baseContext = (Context) cls2.getMethod((String) objArr19[0], null).invoke(null, null);
                                                    } else {
                                                        str = str2;
                                                    }
                                                    if (baseContext != null) {
                                                        if (baseContext instanceof ContextWrapper) {
                                                            System.identityHashCode(this);
                                                            com.identy.a.PngjException.values();
                                                            if (((ContextWrapper) baseContext).getBaseContext() == null) {
                                                                baseContext = null;
                                                            }
                                                        }
                                                        baseContext = baseContext.getApplicationContext();
                                                    }
                                                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
                                                    int values8 = com.identy.a.PngjException.values();
                                                    int i205 = absoluteGravity * (-380);
                                                    int i206 = (i205 & 382) + (i205 | 382);
                                                    int i207 = ~absoluteGravity;
                                                    int i208 = -(-(((values8 ^ 1) | (values8 & 1) | i207) * (-381)));
                                                    int i209 = ((i206 | i208) << 1) - (i208 ^ i206);
                                                    int i210 = ~((i207 ^ (-2)) | (i207 & (-2)));
                                                    int i211 = ~values8;
                                                    int i212 = ~((i211 & 1) | (i211 ^ 1));
                                                    int i213 = ((i212 & i210) | (i210 ^ i212) | (~((absoluteGravity ^ 1) | (absoluteGravity & 1)))) * 381;
                                                    int i214 = ((i209 | i213) << 1) - (i213 ^ i209);
                                                    int i215 = ~absoluteGravity;
                                                    int i216 = (~((i215 & 1) | (i215 ^ 1))) * 381;
                                                    int i217 = (i214 & i216) + (i216 | i214);
                                                    Object[] objArr20 = new Object[1];
                                                    e("덉滸댣숚\u175c篔ū丬〛䕟縼짇휶繍\uf361៤ꔞ갫Ⅳ旼", i217, objArr20);
                                                    Class<?> cls3 = Class.forName((String) objArr20[0]);
                                                    Object[] objArr21 = new Object[1];
                                                    e("汳蟨氚⬏惠\ue4ca\ude0b㦃\ud90e㋥\ue12d囁ࠣ霒蓮裤稔䔠囍\ufae5", 1 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr21);
                                                    Object[] objArr22 = {baseContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue()), 0, -766679971};
                                                    byte[] bArr4 = $$g;
                                                    byte b7 = bArr4[19];
                                                    byte b8 = b7;
                                                    Object[] objArr23 = new Object[1];
                                                    g(b7, b8, b8, objArr23);
                                                    Class<?> cls4 = Class.forName((String) objArr23[0]);
                                                    byte b9 = (byte) (bArr4[19] - 1);
                                                    byte b10 = b9;
                                                    Object[] objArr24 = new Object[1];
                                                    g(b9, b10, b10, objArr24);
                                                    objArr4 = (Object[]) cls4.getMethod((String) objArr24[0], Context.class, cls, cls, cls).invoke(null, objArr22);
                                                    if (baseContext != null) {
                                                        int i218 = setFoundMatchingTemplates;
                                                        toJson = ((i218 & 47) + (i218 | 47)) % 128;
                                                        Object PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1200224935);
                                                        if (PngjBadSignature8 == null) {
                                                            char keyCodeFromString = (char) (KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 31077);
                                                            int capsMode = TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 49;
                                                            int mode = View.MeasureSpec.getMode(0) + 1043;
                                                            byte b11 = (byte) ($$e & 13);
                                                            byte b12 = $$d[20];
                                                            Object[] objArr25 = new Object[1];
                                                            f(b11, b12, (byte) (b12 - 1), objArr25);
                                                            PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(keyCodeFromString, capsMode, mode, 1150904546, false, (String) objArr25[0], null);
                                                        }
                                                        ((Field) PngjBadSignature8).set(null, objArr4);
                                                        try {
                                                            Long valueOf2 = Long.valueOf(((Long) Class.forName(str).getDeclaredMethod(str3, null).invoke(null, null)).longValue());
                                                            Object PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
                                                            if (PngjBadSignature9 == null) {
                                                                char doubleTapTimeout = (char) (31077 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                                int scrollDefaultDelay = 49 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                                int i219 = 1043 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                                byte[] bArr5 = $$d;
                                                                byte b13 = (byte) (bArr5[11] - 1);
                                                                byte b14 = (byte) (bArr5[20] - 1);
                                                                Object[] objArr26 = new Object[1];
                                                                f(b13, b14, (byte) (b14 | 13), objArr26);
                                                                PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(doubleTapTimeout, scrollDefaultDelay, i219, 159283629, false, (String) objArr26[0], null);
                                                            }
                                                            ((Field) PngjBadSignature9).set(null, valueOf2);
                                                        } catch (Exception unused) {
                                                            throw new RuntimeException();
                                                        }
                                                    }
                                                } else {
                                                    int i220 = toJson;
                                                    setFoundMatchingTemplates = (((i220 | 67) << 1) - (i220 ^ 67)) % 128;
                                                    Object PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1200224935);
                                                    if (PngjBadSignature10 == null) {
                                                        char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 31077);
                                                        int lastIndexOf = TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 50;
                                                        int modifierMetaStateMask2 = 1042 - ((byte) KeyEvent.getModifierMetaStateMask());
                                                        byte b15 = (byte) ($$e & 13);
                                                        byte b16 = $$d[20];
                                                        Object[] objArr27 = new Object[1];
                                                        f(b15, b16, (byte) (b16 - 1), objArr27);
                                                        PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(longPressTimeout, lastIndexOf, modifierMetaStateMask2, 1150904546, false, (String) objArr27[0], null);
                                                    }
                                                    Object[] objArr28 = (Object[]) ((Field) PngjBadSignature10).get(null);
                                                    objArr4 = new Object[]{0, 0, new int[]{0}, new int[]{0}, new int[1]};
                                                    int i221 = ((int[]) objArr28[3])[0];
                                                    int i222 = ((int[]) objArr28[2])[0];
                                                    String str4 = (String) objArr28[1];
                                                    String str5 = (String) objArr28[0];
                                                    int myTid2 = Process.myTid();
                                                    int c3 = defpackage.a.c((~(myTid2 | (-222743971))) | (~((-847101341) | myTid2)) | 4492672, -69, (((~((-842608669) | myTid2)) | (~((-218251299) | myTid2))) * 69) + 1429239796, -494888059);
                                                    int values9 = com.identy.a.PngjException.values();
                                                    int i223 = -(-(c3 * (-782)));
                                                    int i224 = (~c3) * (-783);
                                                    int i225 = (i223 & i224) + (i223 | i224);
                                                    int i226 = ~values9;
                                                    int i227 = (~(c3 | i226 | (i6 ^ i226))) * (-783);
                                                    int i228 = (((i225 | i227) << 1) - (i227 ^ i225)) - 783;
                                                    int identityHashCode5 = System.identityHashCode(this);
                                                    int i229 = (i228 * 141) - 805666431;
                                                    int i230 = ~i228;
                                                    int i231 = ~((i230 & (-766679971)) | (i230 ^ (-766679971)));
                                                    int i232 = ~i228;
                                                    int i233 = ~((i232 ^ identityHashCode5) | (i232 & identityHashCode5));
                                                    int i234 = -(-(((i231 & i233) | (i231 ^ i233)) * (-280)));
                                                    int i235 = (i229 ^ i234) + ((i229 & i234) << 1);
                                                    int i236 = ~((766679970 & identityHashCode5) | (766679970 ^ identityHashCode5));
                                                    int i237 = (((i236 & i233) | (i233 ^ i236)) * 140) + i235;
                                                    int i238 = (766679970 & i232) | (i232 ^ 766679970);
                                                    int i239 = ~((i238 & identityHashCode5) | (i238 ^ identityHashCode5));
                                                    int i240 = ~identityHashCode5;
                                                    int i241 = (i232 & i240) | (i232 ^ i240);
                                                    int i242 = ~(((-766679971) & i241) | (i241 ^ (-766679971)));
                                                    int i243 = (i239 & i242) | (i239 ^ i242);
                                                    int i244 = ~identityHashCode5;
                                                    int i245 = ~((i244 & 766679970) | (766679970 ^ i244) | i228);
                                                    int i246 = -(-(((i245 & i243) | (i243 ^ i245)) * 140));
                                                    int i247 = (i237 & i246) + (i246 | i237);
                                                    int i248 = (i247 << 13) ^ i247;
                                                    int i249 = i248 ^ (i248 >>> 17);
                                                    ((int[]) objArr4[4])[0] = i249 ^ (i249 << 5);
                                                }
                                                i10 = ((int[]) objArr4[2])[0];
                                                i11 = ((int[]) objArr4[3])[0];
                                                if (i11 != i10) {
                                                    Object[] objArr29 = {0, 0, new int[]{0}, new int[]{0}, new int[1]};
                                                    int i250 = ((int[]) objArr4[4])[0];
                                                    int i251 = ((int[]) objArr4[3])[0];
                                                    int i252 = ((int[]) objArr4[2])[0];
                                                    String str6 = (String) objArr4[1];
                                                    String str7 = (String) objArr4[0];
                                                    int myTid3 = Process.myTid();
                                                    int c4 = defpackage.a.c((~(myTid3 | (-588385842))) | (~((~myTid3) | (-35971529))) | (-590802938), -370, (((~((-588385842) | 0)) | (~((-35971529) | myTid3))) * (-370)) - 291650085, 446245036);
                                                    int values10 = com.identy.a.PngjException.values();
                                                    int i253 = (-1) - (~(-(-(c4 * (-858)))));
                                                    int i254 = -(-(values10 * (-859)));
                                                    int i255 = (i253 & i254) + (i254 | i253);
                                                    int i256 = ~(~values10);
                                                    int i257 = ~c4;
                                                    int i258 = (i255 - (~(-(-((i256 | (~((i257 | (i6 ^ i257)) | values10))) * 859))))) - 1;
                                                    int i259 = ~c4;
                                                    int i260 = ~((~values10) | i259);
                                                    int i261 = ~i259;
                                                    int i262 = -(-((((i261 & i260) | (i260 ^ i261)) * 859) + i258));
                                                    int i263 = ((i250 | i262) << 1) - (i262 ^ i250);
                                                    int i264 = i263 << 13;
                                                    int i265 = (i264 | i263) & (~(i263 & i264));
                                                    int i266 = i265 >>> 17;
                                                    int i267 = ((~i265) & i266) | ((~i266) & i265);
                                                    int i268 = i267 << 5;
                                                    ((int[]) objArr29[4])[0] = (i267 | i268) & (~(i267 & i268));
                                                } else {
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add((String) objArr4[1]);
                                                    arrayList2.add((String) objArr4[0]);
                                                    int[] iArr2 = new int[i11];
                                                    iArr2[i11 - 1] = 1;
                                                    Toast.makeText((Context) null, iArr2[((((-2) - (i11 ^ (-1))) * i11) % 2) - 1], 1).show();
                                                    Object[] objArr30 = {0, 0, new int[]{0}, new int[]{0}, new int[1]};
                                                    int i269 = ((int[]) objArr4[4])[0];
                                                    int i270 = ((int[]) objArr4[3])[0];
                                                    int i271 = ((int[]) objArr4[2])[0];
                                                    String str8 = (String) objArr4[1];
                                                    String str9 = (String) objArr4[0];
                                                    int i272 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null)).getResources().getConfiguration().navigationHidden | 977191827);
                                                    int i273 = ((i272 | (-1061147548)) * 658) + (((-792268811) | i272) * (-658)) + 1452907179;
                                                    int values11 = com.identy.a.PngjException.values();
                                                    int i274 = i273 * (-559);
                                                    int i275 = -(-(i269 * 561));
                                                    int i276 = (i274 ^ i275) + ((i274 & i275) << 1);
                                                    int i277 = ~values11;
                                                    int i278 = -(-((~((i277 & i273) | (i277 ^ i273))) * (-560)));
                                                    int i279 = ((i276 | i278) << 1) - (i278 ^ i276);
                                                    int i280 = ~i269;
                                                    int i281 = (i280 & i273) | (i280 ^ i273);
                                                    int i282 = (~((i281 & values11) | (i281 ^ values11))) * (-560);
                                                    int i283 = (i279 & i282) + (i282 | i279);
                                                    int i284 = ~i273;
                                                    int i285 = ~((i284 & i269) | (i284 ^ i269));
                                                    int i286 = ~values11;
                                                    int i287 = ~((i286 & i269) | (i286 ^ i269));
                                                    int i288 = -(-(((i285 & i287) | (i285 ^ i287)) * 560));
                                                    int i289 = (i283 ^ i288) + ((i288 & i283) << 1);
                                                    int i290 = i289 << 13;
                                                    int i291 = (i290 | i289) & (~(i289 & i290));
                                                    int i292 = i291 ^ (i291 >>> 17);
                                                    int i293 = i292 << 5;
                                                    ((int[]) objArr30[4])[0] = ((~i292) & i293) | ((~i293) & i292);
                                                }
                                                identySdk = IdentySdk.getInstance();
                                                fingerAS = identySdk.h();
                                            }
                                        }
                                        com.identy.getPadSub2.PngjException("START_UP", " onCreate start");
                                        if (identySdk != null && identySdk.h().ordinal() >= FingerAS.BALANCED_VERY_HIGH.ordinal()) {
                                            getWindow().setFlags(ConstantsKt.DEFAULT_BUFFER_SIZE, ConstantsKt.DEFAULT_BUFFER_SIZE);
                                        }
                                        com.identy.getPadSub2.PngjException("START_UP", " onCreate start 251");
                                        DisplayManager displayManager222 = (DisplayManager) getSystemService("display");
                                        if (fingerAS.ordinal() >= FingerAS.BALANCED_VERY_HIGH.ordinal()) {
                                            Display[] displays = displayManager222.getDisplays(null);
                                            StringBuilder sb = new StringBuilder("There are currently ");
                                            sb.append(displays.length);
                                            sb.append(" displays connected.");
                                            com.identy.getPadSub2.PngjException("MainActivity", sb.toString());
                                            if (displays.length > 1) {
                                                setFoundMatchingTemplates = (toJson + 27) % 128;
                                                findViewById(R.id.preview).setVisibility(8);
                                            }
                                        }
                                        LibSettings.isSaveCaptured();
                                        Object[] objArr8222 = {this, 1, new getL3Score()};
                                        z = false;
                                        z = false;
                                        z = false;
                                        z = false;
                                        z = false;
                                        z = false;
                                        z = false;
                                        z = false;
                                        z = false;
                                        z = false;
                                        z = false;
                                        z2 = false;
                                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1578525895);
                                        if (PngjBadSignature2 == null) {
                                            char argb = (char) (14830 - Color.argb(0, 0, 0, 0));
                                            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 28;
                                            int lastIndexOf2 = 720 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0);
                                            byte b17 = (byte) ($$e & 13);
                                            byte b18 = $$d[20];
                                            Object[] objArr31 = new Object[1];
                                            f(b17, b18, (byte) (b18 - 1), objArr31);
                                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(argb, tapTimeout, lastIndexOf2, 1560737410, false, (String) objArr31[0], new Class[]{Context.class, cls, getPadSub3B15685$PngjException.class});
                                        }
                                        ((Method) PngjBadSignature2).invoke(null, objArr8222);
                                        LibSettings.isSaveCaptured();
                                        if (!IdentySdk.getInstance().y()) {
                                            System.identityHashCode(this);
                                            /* PngjBadCrcException.values.values(); */
                                            try {
                                                Object[] objArr32 = {this, 1};
                                                Object PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-505834749);
                                                if (PngjBadSignature11 == null) {
                                                    char keyRepeatTimeout = (char) (54373 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                                    int maxKeyCode2 = 37 - (KeyEvent.getMaxKeyCode() >> 16);
                                                    int myPid = (Process.myPid() >> 22) + 360;
                                                    byte b19 = (byte) ($$d[20] - 1);
                                                    byte b20 = b19;
                                                    Object[] objArr33 = new Object[1];
                                                    f(b19, b20, (byte) (b20 | 10), objArr33);
                                                    PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(keyRepeatTimeout, maxKeyCode2, myPid, 490143416, false, (String) objArr33[0], new Class[]{Context.class, cls});
                                                }
                                                if (((Integer) ((Method) PngjBadSignature11).invoke(null, objArr32)).intValue() != 1) {
                                                    finish();
                                                    try {
                                                        IdentySdk.getInstance().a(ERRORS.UNKNOWN, null);
                                                        int i294 = toJson;
                                                        setFoundMatchingTemplates = ((i294 & 11) + (i294 | 11)) % 128;
                                                        return;
                                                    } catch (Exception e18) {
                                                        e18.printStackTrace();
                                                        return;
                                                    }
                                                }
                                                try {
                                                    Object[] objArr34 = {this, 1};
                                                    Object PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-813359489);
                                                    if (PngjBadSignature12 == null) {
                                                        char c5 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31077);
                                                        int i295 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 49;
                                                        int trimmedLength = TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 1043;
                                                        byte b21 = (byte) ($$d[20] - 1);
                                                        byte b22 = b21;
                                                        Object[] objArr35 = new Object[1];
                                                        f(b21, b22, (byte) (b22 | 10), objArr35);
                                                        PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c5, i295, trimmedLength, 862614468, false, (String) objArr35[0], new Class[]{Context.class, cls});
                                                    }
                                                    if (((Integer) ((Method) PngjBadSignature12).invoke(null, objArr34)).intValue() != 1) {
                                                        com.identy.a.PngjException.values();
                                                        System.identityHashCode(this);
                                                        finish();
                                                        try {
                                                            IdentySdk.getInstance().a(ERRORS.UNKNOWN, null);
                                                            return;
                                                        } catch (Exception e19) {
                                                            e19.printStackTrace();
                                                            return;
                                                        }
                                                    }
                                                    try {
                                                        Object[] objArr36 = {this, 1, new PngjExceptionInternal()};
                                                        Object PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1578525895);
                                                        if (PngjBadSignature13 == null) {
                                                            char myTid4 = (char) ((Process.myTid() >> 22) + 14830);
                                                            int normalizeMetaState = 28 - KeyEvent.normalizeMetaState(0);
                                                            int normalizeMetaState2 = 721 - KeyEvent.normalizeMetaState(0);
                                                            byte b23 = (byte) ($$e & 13);
                                                            byte b24 = $$d[20];
                                                            Object[] objArr37 = new Object[1];
                                                            f(b23, b24, (byte) (b24 - 1), objArr37);
                                                            PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(myTid4, normalizeMetaState, normalizeMetaState2, 1560737410, false, (String) objArr37[0], new Class[]{Context.class, cls, getPadSub3B15685$PngjException.class});
                                                            z = false;
                                                        }
                                                        ((Method) PngjBadSignature13).invoke(null, objArr36);
                                                        z2 = false;
                                                        z = false;
                                                        z = false;
                                                        z = false;
                                                        if (((Boolean) PngjException(com.identy.a.PngjException.values(), 1791075781, new Object[0], com.identy.a.PngjException.values(), -1791075758, com.identy.a.PngjException.values(), com.identy.a.PngjException.values())).booleanValue()) {
                                                            int i296 = setFoundMatchingTemplates + 35;
                                                            toJson = i296 % 128;
                                                            try {
                                                                if (i296 % 2 == 0) {
                                                                    finish();
                                                                    IdentySdk.getInstance().a(ERRORS.UNKNOWN, null);
                                                                    return;
                                                                } else {
                                                                    finish();
                                                                    IdentySdk.getInstance().a(ERRORS.UNKNOWN, null);
                                                                    throw null;
                                                                }
                                                            } catch (Exception e20) {
                                                                e20.printStackTrace();
                                                                return;
                                                            }
                                                        }
                                                        if ("goldfish".equals(Build.HARDWARE)) {
                                                            finish();
                                                            try {
                                                                IdentySdk.getInstance().a(ERRORS.UNKNOWN, null);
                                                                return;
                                                            } catch (Exception e21) {
                                                                e21.printStackTrace();
                                                                return;
                                                            }
                                                        }
                                                    } catch (Throwable th2) {
                                                        Throwable cause2 = th2.getCause();
                                                        if (cause2 == null) {
                                                            throw new RuntimeException(th2);
                                                        }
                                                        throw new RuntimeException(cause2);
                                                    }
                                                } catch (Throwable th3) {
                                                    Throwable cause3 = th3.getCause();
                                                    if (cause3 == null) {
                                                        throw new RuntimeException(th3);
                                                    }
                                                    throw new RuntimeException(cause3);
                                                }
                                            } catch (Throwable th4) {
                                                Throwable cause4 = th4.getCause();
                                                if (cause4 == null) {
                                                    throw new RuntimeException(th4);
                                                }
                                                throw new RuntimeException(cause4);
                                            }
                                        }
                                        if (IdentySdk.getInstance().getLocale() != null) {
                                            int i297 = toJson + 33;
                                            setFoundMatchingTemplates = i297 % 128;
                                            if (i297 % 2 == 0) {
                                                PngjException(com.identy.a.PngjException.values(), -563322541, new Object[]{this, IdentySdk.getInstance().getLocale()}, com.identy.a.PngjException.values(), 563322561, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
                                                throw null;
                                            }
                                            PngjException(com.identy.a.PngjException.values(), -563322541, new Object[]{this, IdentySdk.getInstance().getLocale()}, com.identy.a.PngjException.values(), 563322561, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
                                        }
                                        if (LibSettings.isSaveCaptured()) {
                                            int i298 = toJson;
                                            int i299 = (i298 ^ 71) + ((i298 & 71) << 1);
                                            setFoundMatchingTemplates = i299 % 128;
                                            if (i299 % 2 == 0) {
                                                int i300 = 9 / 0;
                                            }
                                        }
                                        IdentySdk.getInstance().b(true);
                                        if (LibSettings.isSaveCaptured()) {
                                            int i301 = setFoundMatchingTemplates;
                                            int i302 = (i301 & 31) + (i301 | 31);
                                            toJson = i302 % 128;
                                            if (i302 % 2 != 0) {
                                                int i303 = 25 / 0;
                                            }
                                        }
                                        if (PngjBadSignature((Context) this)) {
                                            this.PngjUnsupportedException = true;
                                            setRequestedOrientation(1);
                                            z5 = false;
                                        } else {
                                            try {
                                                try {
                                                    if (IdentySdk.getInstance().isAllowTabletLandscape()) {
                                                        try {
                                                            LibSettings.isSaveCaptured();
                                                        } catch (Exception e22) {
                                                            e22.printStackTrace();
                                                        }
                                                        if (getResources().getConfiguration().orientation == 2) {
                                                            z4 = false;
                                                            this.PngjUnsupportedException = false;
                                                            setRequestedOrientation(0);
                                                        } else {
                                                            z4 = false;
                                                            this.PngjUnsupportedException = true;
                                                            setRequestedOrientation(1);
                                                            setFoundMatchingTemplates = (toJson + 25) % 128;
                                                        }
                                                        i = 1;
                                                        z2 = z4;
                                                    } else {
                                                        z2 = false;
                                                        i = 1;
                                                        this.PngjUnsupportedException = true;
                                                        setRequestedOrientation(1);
                                                    }
                                                    try {
                                                        z5 = z2;
                                                        if (LibSettings.isSaveCaptured()) {
                                                            int i304 = setFoundMatchingTemplates;
                                                            int i305 = ((i304 | 123) << i) - (i304 ^ 123);
                                                            toJson = i305 % 128;
                                                            z5 = z2;
                                                            if (i305 % 2 != 0) {
                                                                throw null;
                                                            }
                                                        }
                                                    } catch (Exception e23) {
                                                        e23.printStackTrace();
                                                        z5 = z2;
                                                    }
                                                } catch (Exception e24) {
                                                    z3 = z2;
                                                    e24.printStackTrace();
                                                    try {
                                                        if (LibSettings.isSaveCaptured()) {
                                                        }
                                                    } catch (Exception e25) {
                                                        e25.printStackTrace();
                                                    }
                                                    setRequestedOrientation(1);
                                                    z5 = z3;
                                                    LibSettings.isSaveCaptured();
                                                    new NativeAlgoUtils();
                                                    z6 = IdentySdk.getInstance().isCustomSDK();
                                                    com.identy.getPadSub2.PngjException("START_UP", " onCreate start 386");
                                                    if (z6) {
                                                    }
                                                    setContentView(i2);
                                                    this.PngjInputException = new com.identy.d.values(getApplicationContext());
                                                    values(bundle);
                                                    PngjException(com.identy.a.PngjException.values(), -1873363838, new Object[]{this}, com.identy.a.PngjException.values(), 1873363863, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
                                                    this.e1 = (TextView) findViewById(R.id.middle_info_text);
                                                    PngjException(com.identy.a.PngjException.values(), 1180049510, new Object[]{this}, com.identy.a.PngjException.values(), -1180049488, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
                                                    HandlerThread handlerThread222 = new HandlerThread("keystoreCreation");
                                                    handlerThread222.start();
                                                    if (LibSettings.isSaveCaptured()) {
                                                    }
                                                    if (IdentySdk.getInstance().getAction() != null) {
                                                    }
                                                    LibSettings.isSaveCaptured();
                                                    return;
                                                }
                                            } catch (Exception e26) {
                                                z3 = false;
                                                e26.printStackTrace();
                                                if (LibSettings.isSaveCaptured()) {
                                                    toJson = (setFoundMatchingTemplates + 97) % 128;
                                                }
                                                setRequestedOrientation(1);
                                                z5 = z3;
                                                LibSettings.isSaveCaptured();
                                                new NativeAlgoUtils();
                                                z6 = IdentySdk.getInstance().isCustomSDK();
                                                com.identy.getPadSub2.PngjException("START_UP", " onCreate start 386");
                                                if (z6) {
                                                }
                                                setContentView(i2);
                                                this.PngjInputException = new com.identy.d.values(getApplicationContext());
                                                values(bundle);
                                                PngjException(com.identy.a.PngjException.values(), -1873363838, new Object[]{this}, com.identy.a.PngjException.values(), 1873363863, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
                                                this.e1 = (TextView) findViewById(R.id.middle_info_text);
                                                PngjException(com.identy.a.PngjException.values(), 1180049510, new Object[]{this}, com.identy.a.PngjException.values(), -1180049488, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
                                                HandlerThread handlerThread2222 = new HandlerThread("keystoreCreation");
                                                handlerThread2222.start();
                                                if (LibSettings.isSaveCaptured()) {
                                                }
                                                if (IdentySdk.getInstance().getAction() != null) {
                                                }
                                                LibSettings.isSaveCaptured();
                                                return;
                                            }
                                        }
                                        LibSettings.isSaveCaptured();
                                        new NativeAlgoUtils();
                                        z6 = IdentySdk.getInstance().isCustomSDK();
                                        com.identy.getPadSub2.PngjException("START_UP", " onCreate start 386");
                                        if (z6) {
                                            i2 = R.layout.identy_activity_open_camera;
                                        } else {
                                            int i306 = (setFoundMatchingTemplates + 37) % 128;
                                            toJson = i306;
                                            i2 = R.layout.touchless_activity_open_camera;
                                            setFoundMatchingTemplates = (i306 + 107) % 128;
                                        }
                                        setContentView(i2);
                                        this.PngjInputException = new com.identy.d.values(getApplicationContext());
                                        values(bundle);
                                        PngjException(com.identy.a.PngjException.values(), -1873363838, new Object[]{this}, com.identy.a.PngjException.values(), 1873363863, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
                                        this.e1 = (TextView) findViewById(R.id.middle_info_text);
                                        PngjException(com.identy.a.PngjException.values(), 1180049510, new Object[]{this}, com.identy.a.PngjException.values(), -1180049488, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
                                        HandlerThread handlerThread22222 = new HandlerThread("keystoreCreation");
                                        handlerThread22222.start();
                                        if (LibSettings.isSaveCaptured()) {
                                            int i307 = setFoundMatchingTemplates;
                                            int i308 = (i307 & 43) + (i307 | 43);
                                            toJson = i308 % 128;
                                            if (i308 % 2 != 0) {
                                                throw null;
                                            }
                                        }
                                        if (IdentySdk.getInstance().getAction() != null) {
                                            int i309 = toJson;
                                            int i310 = (i309 ^ 41) + ((i309 & 41) << 1);
                                            setFoundMatchingTemplates = i310 % 128;
                                            if (i310 % 2 == 0) {
                                                IdentySdk.getInstance().getAction().equals(com.identy.Action.CAPTURE);
                                                throw null;
                                            }
                                            if (!IdentySdk.getInstance().getAction().equals(com.identy.Action.CAPTURE)) {
                                                new Handler(handlerThread22222.getLooper()).postDelayed(new Action(), 2000L);
                                                int i311 = toJson;
                                                setFoundMatchingTemplates = ((i311 & 23) + (i311 | 23)) % 128;
                                            }
                                        }
                                        LibSettings.isSaveCaptured();
                                        return;
                                    }
                                    Object[] objArr222 = {baseContext, Integer.valueOf(0), 0, -766679971};
                                    byte[] bArr42 = $$g;
                                    byte b72 = bArr42[19];
                                    byte b82 = b72;
                                    Object[] objArr232 = new Object[1];
                                    g(b72, b82, b82, objArr232);
                                    Class<?> cls42 = Class.forName((String) objArr232[0]);
                                    byte b92 = (byte) (bArr42[19] - 1);
                                    byte b102 = b92;
                                    Object[] objArr242 = new Object[1];
                                    g(b92, b102, b102, objArr242);
                                    objArr4 = (Object[]) cls42.getMethod((String) objArr242[0], Context.class, cls, cls, cls).invoke(null, objArr222);
                                    if (baseContext != null) {
                                    }
                                    i10 = ((int[]) objArr4[2])[0];
                                    i11 = ((int[]) objArr4[3])[0];
                                    if (i11 != i10) {
                                    }
                                    identySdk = IdentySdk.getInstance();
                                    fingerAS = identySdk.h();
                                    com.identy.getPadSub2.PngjException("START_UP", " onCreate start");
                                    if (identySdk != null) {
                                        getWindow().setFlags(ConstantsKt.DEFAULT_BUFFER_SIZE, ConstantsKt.DEFAULT_BUFFER_SIZE);
                                    }
                                    com.identy.getPadSub2.PngjException("START_UP", " onCreate start 251");
                                    DisplayManager displayManager2222 = (DisplayManager) getSystemService("display");
                                    if (fingerAS.ordinal() >= FingerAS.BALANCED_VERY_HIGH.ordinal()) {
                                    }
                                    LibSettings.isSaveCaptured();
                                    Object[] objArr82222 = {this, 1, new getL3Score()};
                                    z = false;
                                    z = false;
                                    z = false;
                                    z = false;
                                    z = false;
                                    z = false;
                                    z = false;
                                    z = false;
                                    z = false;
                                    z = false;
                                    z = false;
                                    z2 = false;
                                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1578525895);
                                    if (PngjBadSignature2 == null) {
                                    }
                                    ((Method) PngjBadSignature2).invoke(null, objArr82222);
                                    LibSettings.isSaveCaptured();
                                    if (!IdentySdk.getInstance().y()) {
                                    }
                                    if (IdentySdk.getInstance().getLocale() != null) {
                                    }
                                    if (LibSettings.isSaveCaptured()) {
                                    }
                                    IdentySdk.getInstance().b(true);
                                    if (LibSettings.isSaveCaptured()) {
                                    }
                                    if (PngjBadSignature((Context) this)) {
                                    }
                                    LibSettings.isSaveCaptured();
                                    new NativeAlgoUtils();
                                    z6 = IdentySdk.getInstance().isCustomSDK();
                                    com.identy.getPadSub2.PngjException("START_UP", " onCreate start 386");
                                    if (z6) {
                                    }
                                    setContentView(i2);
                                    this.PngjInputException = new com.identy.d.values(getApplicationContext());
                                    values(bundle);
                                    PngjException(com.identy.a.PngjException.values(), -1873363838, new Object[]{this}, com.identy.a.PngjException.values(), 1873363863, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
                                    this.e1 = (TextView) findViewById(R.id.middle_info_text);
                                    PngjException(com.identy.a.PngjException.values(), 1180049510, new Object[]{this}, com.identy.a.PngjException.values(), -1180049488, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
                                    HandlerThread handlerThread222222 = new HandlerThread("keystoreCreation");
                                    handlerThread222222.start();
                                    if (LibSettings.isSaveCaptured()) {
                                    }
                                    if (IdentySdk.getInstance().getAction() != null) {
                                    }
                                    LibSettings.isSaveCaptured();
                                    return;
                                } catch (Throwable th5) {
                                    Throwable cause5 = th5.getCause();
                                    if (cause5 == null) {
                                        throw new RuntimeException(th5);
                                    }
                                    throw new RuntimeException(cause5);
                                }
                                Long valueOf3 = Long.valueOf(((Long) Class.forName(str2).getDeclaredMethod(str3, null).invoke(null, null)).longValue());
                                Object PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1556686741);
                                if (PngjBadSignature14 == null) {
                                    char c6 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                    int resolveOpacity = 37 - Drawable.resolveOpacity(0, 0);
                                    int offsetBefore = TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 549;
                                    byte[] bArr6 = $$d;
                                    byte b25 = (byte) (bArr6[11] - 1);
                                    byte b26 = (byte) (bArr6[20] - 1);
                                    objArr2 = objArr;
                                    Object[] objArr38 = new Object[1];
                                    f(b25, b26, (byte) (b26 | 13), objArr38);
                                    PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c6, resolveOpacity, offsetBefore, -1608103378, false, (String) objArr38[0], null);
                                } else {
                                    objArr2 = objArr;
                                }
                                ((Field) PngjBadSignature14).set(null, valueOf3);
                                objArr3 = objArr2;
                                i5 = 2;
                                Object obj3 = objArr3[i5];
                                i7 = ((int[]) obj3)[0];
                                Object obj22 = objArr3[1];
                                i8 = ((int[]) obj22)[0];
                                if (i8 != i7) {
                                }
                                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
                                if (PngjBadSignature3 == null) {
                                }
                                j2 = ((Field) PngjBadSignature3).getLong(null);
                                if (j2 != -1) {
                                }
                                baseContext = getBaseContext();
                                if (baseContext != null) {
                                }
                                if (baseContext != null) {
                                }
                                int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0);
                                int values82 = com.identy.a.PngjException.values();
                                int i2052 = absoluteGravity2 * (-380);
                                int i2062 = (i2052 & 382) + (i2052 | 382);
                                int i2072 = ~absoluteGravity2;
                                int i2082 = -(-(((values82 ^ 1) | (values82 & 1) | i2072) * (-381)));
                                int i2092 = ((i2062 | i2082) << 1) - (i2082 ^ i2062);
                                int i2102 = ~((i2072 ^ (-2)) | (i2072 & (-2)));
                                int i2112 = ~values82;
                                int i2122 = ~((i2112 & 1) | (i2112 ^ 1));
                                int i2132 = ((i2122 & i2102) | (i2102 ^ i2122) | (~((absoluteGravity2 ^ 1) | (absoluteGravity2 & 1)))) * 381;
                                int i2142 = ((i2092 | i2132) << 1) - (i2132 ^ i2092);
                                int i2152 = ~absoluteGravity2;
                                int i2162 = (~((i2152 & 1) | (i2152 ^ 1))) * 381;
                                int i2172 = (i2142 & i2162) + (i2162 | i2142);
                                Object[] objArr202 = new Object[1];
                                e("덉滸댣숚\u175c篔ū丬〛䕟縼짇휶繍\uf361៤ꔞ갫Ⅳ旼", i2172, objArr202);
                                Class<?> cls32 = Class.forName((String) objArr202[0]);
                                Object[] objArr212 = new Object[1];
                                e("汳蟨氚⬏惠\ue4ca\ude0b㦃\ud90e㋥\ue12d囁ࠣ霒蓮裤稔䔠囍\ufae5", 1 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr212);
                            } catch (Exception unused2) {
                                throw new RuntimeException();
                            }
                            Object[] objArr39 = new Object[i5];
                            objArr39[1] = 1065773198;
                            objArr39[0] = Integer.valueOf(intValue2);
                            Object PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1437710995);
                            if (PngjBadSignature15 == null) {
                                char keyCodeFromString2 = (char) KeyEvent.keyCodeFromString(BuildConfig.FLAVOR);
                                int i312 = 38 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                int i313 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 550;
                                byte b27 = (byte) ($$e & 95);
                                byte[] bArr7 = $$d;
                                Object[] objArr40 = new Object[1];
                                f(b27, (byte) (bArr7[20] - 1), (byte) (-bArr7[53]), objArr40);
                                PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(keyCodeFromString2, i312, i313, -1453402328, false, (String) objArr40[0], new Class[]{cls, cls});
                            }
                            objArr = (Object[]) ((Method) PngjBadSignature15).invoke(null, objArr39);
                            Object PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1434812162);
                            if (PngjBadSignature16 == null) {
                                char combineMeasuredStates2 = (char) View.combineMeasuredStates(0, 0);
                                int normalizeMetaState3 = KeyEvent.normalizeMetaState(0) + 37;
                                int capsMode2 = TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 549;
                                byte b28 = $$d[20];
                                Object[] objArr41 = new Object[1];
                                f((byte) 11, b28, b28, objArr41);
                                PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature(combineMeasuredStates2, normalizeMetaState3, capsMode2, 1452666181, false, (String) objArr41[0], null);
                            }
                            ((Field) PngjBadSignature16).set(null, objArr);
                        } catch (Throwable th6) {
                            Throwable cause6 = th6.getCause();
                            if (cause6 == null) {
                                throw new RuntimeException(th6);
                            }
                            throw new RuntimeException(cause6);
                        }
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        int values12 = 0;
                        int i314 = makeMeasureSpec * (-949);
                        int i315 = ((i314 | (-949)) << 1) - (i314 ^ (-949));
                        int i316 = ~values12;
                        int i317 = ~(((-2) ^ i316) | ((-2) & i316));
                        int i318 = ~((~makeMeasureSpec) | values12);
                        int i319 = (i315 - (~(((i317 & i318) | (i317 ^ i318)) * 1900))) - 1;
                        int i320 = ~((i316 ^ makeMeasureSpec) | (i316 & makeMeasureSpec));
                        int i321 = ~((values12 ^ 1) | (values12 & 1));
                        int i322 = -(-(((i320 & i321) | (i320 ^ i321)) * (-950)));
                        int i323 = ~((i316 & 1) | (i316 ^ 1));
                        int i324 = ~(makeMeasureSpec | values12);
                        int i325 = (((i319 & i322) + (i319 | i322)) - (~(-(-(((i324 & i323) | (i323 ^ i324)) * 950))))) - 1;
                        Object[] objArr42 = new Object[1];
                        e("덉滸댣숚\u175c篔ū丬〛䕟縼짇휶繍\uf361៤ꔞ갫Ⅳ旼", i325, objArr42);
                        Class<?> cls5 = Class.forName((String) objArr42[0]);
                        int i326 = -AndroidCharacter.getMirror(c);
                        int values13 = 0;
                        int i327 = (i326 * (-391)) - 9555;
                        int i328 = ~((-50) | i326);
                        int i329 = ~((values13 & 49) | (values13 ^ 49));
                        int i330 = -(-(((i328 & i329) | (i328 ^ i329)) * (-196)));
                        int i331 = (((i326 ^ 49) | (i326 & 49)) * 392) + (i327 ^ i330) + ((i327 & i330) << 1);
                        int i332 = ~i326;
                        int i333 = ~((i332 & (-50)) | (i332 ^ (-50)));
                        int i334 = (((i333 & i329) | (i333 ^ i329)) * 196) + i331;
                        Object[] objArr43 = new Object[1];
                        e("汳蟨氚⬏惠\ue4ca\ude0b㦃\ud90e㋥\ue12d囁ࠣ霒蓮裤稔䔠囍\ufae5", i334, objArr43);
                        intValue2 = ((Integer) cls5.getMethod((String) objArr43[0], Object.class).invoke(null, this)).intValue();
                    }
                }
                Long valueOf4 = Long.valueOf(((Long) Class.forName(str2).getDeclaredMethod(str3, null).invoke(null, null)).longValue());
                Object PngjBadSignature17 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
                if (PngjBadSignature17 == null) {
                    char c7 = (char) (14831 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 29;
                    int mirror2 = 769 - AndroidCharacter.getMirror(c);
                    byte[] bArr8 = $$d;
                    byte b29 = (byte) (bArr8[i3] - 1);
                    byte b30 = (byte) (bArr8[20] - 1);
                    Object[] objArr44 = new Object[1];
                    f(b29, b30, (byte) (b30 | 13), objArr44);
                    PngjBadSignature17 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c7, packedPositionChild, mirror2, -815159504, false, (String) objArr44[0], null);
                }
                ((Field) PngjBadSignature17).set(null, valueOf4);
                if (((int[]) values$1eba2e16[3])[0] == ((int[]) values$1eba2e16[0])[0]) {
                }
            } catch (Exception unused3) {
                throw new RuntimeException();
            }
            Object[] objArr45 = {234785840};
            Object PngjBadSignature18 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
            if (PngjBadSignature18 == null) {
                PngjBadSignature18 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 24 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), 697 - View.getDefaultSize(0, 0), 1457201313, false, null, new Class[]{cls});
            }
            values$1eba2e16 = org.cameracontroller.PngjBadSignature.values$1eba2e16(intValue, ((Constructor) PngjBadSignature18).newInstance(objArr45), -1154446754);
            Object PngjBadSignature19 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
            if (PngjBadSignature19 == null) {
                char keyCodeFromString3 = (char) (14830 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR));
                int capsMode3 = 28 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0);
                int trimmedLength2 = 721 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR);
                byte b31 = (byte) ($$e & 95);
                byte[] bArr9 = $$d;
                Object[] objArr46 = new Object[1];
                f(b31, (byte) (bArr9[20] - 1), (byte) (-bArr9[53]), objArr46);
                PngjBadSignature19 = com.d.e.a.PngjBadCrcException.PngjBadSignature(keyCodeFromString3, capsMode3, trimmedLength2, -779023007, false, (String) objArr46[0], null);
            }
            ((Field) PngjBadSignature19).set(null, values$1eba2e16);
        } catch (Throwable th7) {
            Throwable cause7 = th7.getCause();
            if (cause7 == null) {
                throw new RuntimeException(th7);
            }
            throw new RuntimeException(cause7);
        }
        i6 = -1;
        Object[] objArr47 = new Object[1];
        e("덉滸댣숚\u175c篔ū丬〛䕟縼짇휶繍\uf361៤ꔞ갫Ⅳ旼", 0 - (~TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0)), objArr47);
        Class<?> cls6 = Class.forName((String) objArr47[0]);
        int i335 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
        int i336 = (i335 ^ 1) + ((i335 & 1) << 1);
        Object[] objArr48 = new Object[1];
        e("汳蟨氚⬏惠\ue4ca\ude0b㦃\ud90e㋥\ue12d囁ࠣ霒蓮裤稔䔠囍\ufae5", i336, objArr48);
        intValue = ((Integer) cls6.getMethod((String) objArr48[0], Object.class).invoke(null, this)).intValue();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        int i = toJson + 105;
        setFoundMatchingTemplates = i % 128;
        return i % 2 != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x001d, code lost:
    
        if (com.identy.LibSettings.isSaveCaptured() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (com.identy.LibSettings.isSaveCaptured() != false) goto L13;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDestroy() {
        int i = toJson + 57;
        setFoundMatchingTemplates = i % 128;
        try {
            if (i % 2 == 0) {
                int i2 = 80 / 0;
            }
            String spoofScore = getSpoofScore();
            try {
                File PngjBadCrcException2 = com.identy.app.PngjBadSignature.PngjBadCrcException("LOG", "LOG_71");
                StringBuilder sb = new StringBuilder();
                sb.append(Calendar.getInstance().getTimeInMillis());
                sb.append(".log");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(PngjBadCrcException2, sb.toString()));
                    fileOutputStream.write(spoofScore.getBytes(StandardCharsets.UTF_8));
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            try {
                org.camera.preview.PngjBadCrcException pngjBadCrcException = this.Action;
                if (pngjBadCrcException != null) {
                    if (pngjBadCrcException.getScore == 0) {
                        int i3 = setFoundMatchingTemplates;
                        int i4 = (((i3 | 89) << 1) - (i3 ^ 89)) % 128;
                        toJson = i4;
                        org.camera.preview.PngjBadCrcException.getQualityScore getqualityscore = pngjBadCrcException.getNfiq1Score;
                        if (getqualityscore != null) {
                            try {
                                /* getqualityscore.get(3000L, TimeUnit.MILLISECONDS); */
                            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                                int i5 = toJson;
                                setFoundMatchingTemplates = ((i5 ^ com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground) + ((i5 & com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground) << 1)) % 128;
                            }
                        } else {
                            setFoundMatchingTemplates = ((i4 & 123) + (i4 | 123)) % 128;
                        }
                    }
                    if (pngjBadCrcException.PngBadCharsetException != null) {
                        int i6 = setFoundMatchingTemplates;
                        int i7 = (i6 & 69) + (i6 | 69);
                        toJson = i7 % 128;
                        if (i7 % 2 != 0) {
                            pngjBadCrcException.PngBadCharsetException = null;
                            int i8 = 1 / 0;
                        } else {
                            pngjBadCrcException.PngBadCharsetException = null;
                        }
                    }
                    if (pngjBadCrcException.Action != null) {
                        int i9 = setFoundMatchingTemplates + 101;
                        toJson = i9 % 128;
                        if (i9 % 2 != 0) {
                            pngjBadCrcException.Action = null;
                            throw null;
                        }
                        pngjBadCrcException.Action = null;
                    }
                }
            } catch (Exception unused2) {
            }
            try {
                Dialog dialog = this.getPadSub1;
                if (dialog != null) {
                    int i10 = setFoundMatchingTemplates;
                    int i11 = (i10 ^ 69) + ((i10 & 69) << 1);
                    toJson = i11 % 128;
                    if (i11 % 2 != 0) {
                        dialog.isShowing();
                        throw null;
                    }
                    if (dialog.isShowing()) {
                        this.getPadSub1.dismiss();
                    }
                }
            } catch (Exception unused3) {
            }
            try {
                com.identy.e1 e1Var = this.onErrorResponse;
                if (e1Var != null) {
                    int i12 = toJson;
                    int i13 = (i12 & 9) + (i12 | 9);
                    setFoundMatchingTemplates = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                    ProgressDialog progressDialog = e1Var.getNfiq1Score;
                    if (progressDialog != null && progressDialog.isShowing()) {
                        setFoundMatchingTemplates = (toJson + 107) % 128;
                        this.onErrorResponse.getNfiq1Score.cancel();
                    }
                }
            } catch (Exception unused4) {
            }
            if (this.PngBadCharsetException != null) {
                this.PngBadCharsetException = null;
                int i14 = toJson;
                setFoundMatchingTemplates = ((i14 & 41) + (i14 | 41)) % 128;
            }
            com.identy.e1 e1Var2 = this.onErrorResponse;
            if (e1Var2 != null) {
                e1Var2.getPadSub1();
                this.onErrorResponse = null;
            }
            unregisterReceiver(this.getNfiq1Score);
            this.getNfiq1Score = null;
            unregisterReceiver(this.getMatchingTime);
            this.getMatchingTime = null;
            this.Action = null;
            if (this.e1 != null) {
                int i15 = toJson;
                setFoundMatchingTemplates = ((i15 & 117) + (i15 | 117)) % 128;
                this.e1 = null;
            }
        } catch (Exception unused5) {
        }
        super.onDestroy();
        int i16 = toJson;
        int i17 = (i16 & 41) + (i16 | 41);
        setFoundMatchingTemplates = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 66 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    @Override // android.media.ImageReader.OnImageAvailableListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onImageAvailable(ImageReader imageReader) {
        boolean z;
        org.cameracontroller.PngjBadSignature pngjBadSignature;
        int i;
        org.cameracontroller.PngjBadSignature pngjBadSignature2;
        int i2 = toJson + 35;
        setFoundMatchingTemplates = i2 % 128;
        if (i2 % 2 == 0) {
            imageReader.acquireLatestImage();
            throw null;
        }
        Image acquireLatestImage = imageReader.acquireLatestImage();
        try {
            if (acquireLatestImage != null) {
                int i3 = toJson;
                int i4 = (i3 ^ 99) + ((i3 & 99) << 1);
                setFoundMatchingTemplates = i4 % 128;
                if (i4 % 2 == 0) {
                    acquireLatestImage.getWidth();
                    acquireLatestImage.getHeight();
                    throw null;
                }
                int width = acquireLatestImage.getWidth();
                int height = acquireLatestImage.getHeight();
                org.camera.preview.PngjBadCrcException pngjBadCrcException = this.Action;
                if (pngjBadCrcException != null && !this.onErrorResponse.getMatchingTime) {
                    int i5 = toJson;
                    int i6 = (i5 ^ 3) + ((i5 & 3) << 1);
                    setFoundMatchingTemplates = i6 % 128;
                    if (i6 % 2 == 0) {
                        pngjBadCrcException.CaptureRolledFingersActivity.contains("focus_mode_macro");
                        throw null;
                    }
                    if (!pngjBadCrcException.CaptureRolledFingersActivity.contains("focus_mode_macro")) {
                        int i7 = toJson + 25;
                        setFoundMatchingTemplates = i7 % 128;
                        if (i7 % 2 != 0) {
                            z = true;
                            this.getCaptureTime = z;
                            com.identy.e1 e1Var = this.onErrorResponse;
                            pngjBadSignature = this.Action.getQualityScore;
                            if (pngjBadSignature == null) {
                                int i8 = toJson + 37;
                                setFoundMatchingTemplates = i8 % 128;
                                if (i8 % 2 == 0) {
                                    pngjBadSignature.getPadSub2();
                                    throw null;
                                }
                                i = pngjBadSignature.getPadSub2();
                            } else {
                                i = 0;
                            }
                            e1Var.valueOf(width, height, i, this.Action.CaptureRolledFingersActivity.contains("focus_mode_macro"));
                            org.camera.preview.PngjBadCrcException pngjBadCrcException2 = this.Action;
                            pngjBadCrcException2.valueOf.values();
                            pngjBadCrcException2.Enroll4FActivity = BuildConfig.FLAVOR;
                            pngjBadSignature2 = pngjBadCrcException2.getQualityScore;
                            if (pngjBadSignature2 != null) {
                                int i9 = toJson + 1;
                                setFoundMatchingTemplates = i9 % 128;
                                if (i9 % 2 == 0) {
                                    pngjBadSignature2.PngjPrematureEnding("flash_torch");
                                    int i10 = 50 / 0;
                                } else {
                                    pngjBadSignature2.PngjPrematureEnding("flash_torch");
                                }
                            }
                            setFoundMatchingTemplates = (toJson + 29) % 128;
                        }
                    }
                    z = false;
                    this.getCaptureTime = z;
                    com.identy.e1 e1Var2 = this.onErrorResponse;
                    pngjBadSignature = this.Action.getQualityScore;
                    if (pngjBadSignature == null) {
                    }
                    e1Var2.valueOf(width, height, i, this.Action.CaptureRolledFingersActivity.contains("focus_mode_macro"));
                    org.camera.preview.PngjBadCrcException pngjBadCrcException22 = this.Action;
                    pngjBadCrcException22.valueOf.values();
                    pngjBadCrcException22.Enroll4FActivity = BuildConfig.FLAVOR;
                    pngjBadSignature2 = pngjBadCrcException22.getQualityScore;
                    if (pngjBadSignature2 != null) {
                    }
                    setFoundMatchingTemplates = (toJson + 29) % 128;
                }
                this.PngjOutputException = Long.valueOf(acquireLatestImage.getTimestamp() - this.getOveralTimetaken.longValue());
                this.getOveralTimetaken = Long.valueOf(acquireLatestImage.getTimestamp());
                if (width != 0) {
                    int i11 = setFoundMatchingTemplates;
                    toJson = ((i11 ^ 19) + ((i11 & 19) << 1)) % 128;
                    if (height != 0) {
                        toJson = ((i11 & 23) + (i11 | 23)) % 128;
                        com.identy.e1 e1Var3 = this.onErrorResponse;
                        if (e1Var3 != null) {
                            if (!e1Var3.getTemplates) {
                                Calendar.getInstance().getTimeInMillis();
                                Image.Plane[] planes = acquireLatestImage.getPlanes();
                                byte[][] bArr = e1Var3.getAttempts;
                                int i12 = 0;
                                while (i12 < planes.length) {
                                    int i13 = toJson;
                                    int i14 = (i13 & 107) + (i13 | 107);
                                    setFoundMatchingTemplates = i14 % 128;
                                    if (i14 % 2 == 0) {
                                        planes[i12].getBuffer();
                                        byte[] bArr2 = bArr[i12];
                                        throw null;
                                    }
                                    ByteBuffer buffer = planes[i12].getBuffer();
                                    byte[] bArr3 = bArr[i12];
                                    if (bArr3 != null) {
                                        setFoundMatchingTemplates = (toJson + 27) % 128;
                                        if (bArr3.length == buffer.capacity()) {
                                            buffer.get(bArr[i12]);
                                            int i15 = i12 - 109;
                                            i12 = (i15 | 110) + (i15 & 110);
                                        }
                                    }
                                    bArr[i12] = new byte[buffer.capacity()];
                                    buffer.get(bArr[i12]);
                                    int i152 = i12 - 109;
                                    i12 = (i152 | 110) + (i152 & 110);
                                }
                                e1Var3.setScore = planes[0].getRowStride();
                                e1Var3.setSpoofScore = planes[0].getPixelStride();
                                e1Var3.uxd565jj = planes[1].getRowStride();
                                e1Var3.Fpnative = planes[1].getPixelStride();
                                e1Var3.getWidth = planes[2].getRowStride();
                                e1Var3.addTemplates = planes[2].getPixelStride();
                                e1Var3.EnrollFingersActivity = false;
                                e1Var3.FingerOutput = Long.valueOf(acquireLatestImage.getTimestamp());
                            }
                            setFoundMatchingTemplates = (toJson + 25) % 128;
                        }
                    }
                }
                acquireLatestImage.close();
                return;
            }
            Capture4FActivity();
            if (acquireLatestImage == null) {
                return;
            }
        } catch (Exception unused) {
            if (acquireLatestImage == null) {
                return;
            }
        } catch (Throwable th) {
            if (acquireLatestImage != null) {
                int i16 = setFoundMatchingTemplates + 39;
                toJson = i16 % 128;
                if (i16 % 2 != 0) {
                    acquireLatestImage.close();
                    throw null;
                }
                acquireLatestImage.close();
            }
            throw new RuntimeException(th);
        }
        acquireLatestImage.close();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        int i2 = toJson;
        setFoundMatchingTemplates = ((i2 ^ 125) + ((i2 & 125) << 1)) % 128;
        boolean onKeyUp = super.onKeyUp(i, keyEvent);
        int i3 = toJson + 65;
        setFoundMatchingTemplates = i3 % 128;
        if (i3 % 2 != 0) {
            return onKeyUp;
        }
        throw null;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        int i = toJson;
        setFoundMatchingTemplates = ((i ^ 29) + ((i & 29) << 1)) % 128;
        super.onLowMemory();
        toJson = (setFoundMatchingTemplates + 99) % 128;
    }

    @Override // android.app.Activity
    public void onPause() {
        com.identy.e1 e1Var;
        ERRORS errors;
        int i;
        ERRORS errors2;
        try {
            PngjPrematureEnding = false;
            Pair[] pairArr = null;
            try {
                Dialog dialog = this.Attempt;
                if (dialog != null) {
                    int i2 = toJson;
                    int i3 = (i2 & 53) + (i2 | 53);
                    setFoundMatchingTemplates = i3 % 128;
                    if (i3 % 2 == 0) {
                        dialog.isShowing();
                        throw null;
                    }
                    if (dialog.isShowing()) {
                        this.Attempt.dismiss();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (!isFinishing()) {
                try {
                    e1Var = this.onErrorResponse;
                    if (this.getPadSub3) {
                        errors = ERRORS.ACTIVITY_PAUSED_ON_BACK_PRESSED;
                        int i4 = setFoundMatchingTemplates;
                        toJson = ((i4 & 7) + (i4 | 7)) % 128;
                    } else {
                        errors = ERRORS.ACTIVITY_PAUSED;
                    }
                    i = toJson + 117;
                    setFoundMatchingTemplates = i % 128;
                } catch (Exception unused) {
                }
                if (i % 2 == 0) {
                    e1Var.valueOf(errors);
                    IdentySdk.getInstance();
                    throw null;
                }
                e1Var.valueOf(errors);
                IdentySdk identySdk = IdentySdk.getInstance();
                ERRORS errors3 = this.getPadSub3 ? ERRORS.ACTIVITY_PAUSED_ON_BACK_PRESSED : ERRORS.ACTIVITY_PAUSED;
                com.identy.e1 e1Var2 = this.onErrorResponse;
                if (e1Var2 != null) {
                    int i5 = toJson;
                    int i6 = ((i5 | 87) << 1) - (i5 ^ 87);
                    setFoundMatchingTemplates = i6 % 128;
                    if (i6 % 2 == 0) {
                        e1Var2.PngjExceptionInternal();
                        throw null;
                    }
                    pairArr = e1Var2.PngjExceptionInternal();
                }
                identySdk.a(errors3, pairArr);
                int i7 = setFoundMatchingTemplates;
                toJson = (((i7 | 33) << 1) - (i7 ^ 33)) % 128;
                finish();
            } else if (this.getPadSub3) {
                setFoundMatchingTemplates = (toJson + 63) % 128;
                try {
                    this.onErrorResponse.valueOf(this.getData ? ERRORS.CUSTOM_BACK_BUTTON_PRESSED : ERRORS.ACTIVITY_PAUSED_ON_BACK_PRESSED);
                    IdentySdk identySdk2 = IdentySdk.getInstance();
                    if (this.getData) {
                        setFoundMatchingTemplates = (toJson + 33) % 128;
                        errors2 = ERRORS.CUSTOM_BACK_BUTTON_PRESSED;
                    } else {
                        errors2 = ERRORS.ACTIVITY_PAUSED_ON_BACK_PRESSED;
                    }
                    int i8 = toJson;
                    int i9 = (((i8 | 83) << 1) - (i8 ^ 83)) % 128;
                    setFoundMatchingTemplates = i9;
                    com.identy.e1 e1Var3 = this.onErrorResponse;
                    if (e1Var3 != null) {
                        setFoundMatchingTemplates = ((i8 & 85) + (i8 | 85)) % 128;
                        pairArr = e1Var3.PngjExceptionInternal();
                    } else {
                        toJson = ((i9 & 109) + (i9 | 109)) % 128;
                    }
                    identySdk2.a(errors2, pairArr);
                } catch (Exception unused2) {
                }
            }
            super.onPause();
            this.getSpoofScore.unregisterListener(this.PngjInputException);
            this.getL2Score.disable();
            com.identy.onErrorResponse onerrorresponse = this.PngBadCharsetException.PngjBadCrcException;
            if (onerrorresponse.valueOf) {
                int i10 = toJson;
                setFoundMatchingTemplates = ((i10 ^ 95) + ((i10 & 95) << 1)) % 128;
                onerrorresponse.valueOf = false;
                onerrorresponse.PngjBadSignature = 0L;
                onerrorresponse.values.unregisterListener(onerrorresponse);
            }
            com.identy.PngjException pngjException = this.PngBadCharsetException.valueOf;
            if (pngjException.valueOf) {
                System.identityHashCode(this);
                /* PngjBadCrcException.values.values(); */
                pngjException.valueOf = false;
                pngjException.PngjException = 0L;
                pngjException.PngjBadCrcException.unregisterListener(pngjException);
                /* PngjBadCrcException.values.values(); */
                com.identy.a.PngjException.values();
            }
            this.Action.PngjException();
        } catch (Exception unused3) {
        }
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        boolean z;
        org.camera.preview.PngjBadCrcException pngjBadCrcException = this.Action;
        org.cameracontroller.PngjBadSignature.PngjExceptionInternal pngjExceptionInternal = new org.cameracontroller.PngjBadSignature.PngjExceptionInternal(pngjBadCrcException.getFingerPrintQualityScore, pngjBadCrcException.getData);
        this.PngjOutputException = Long.valueOf(SystemClock.elapsedRealtimeNanos() - this.getOveralTimetaken.longValue());
        this.getOveralTimetaken = Long.valueOf(SystemClock.elapsedRealtimeNanos());
        this.DeduplicationIdentyResponse = new isQualityFailed(camera, bArr);
        try {
            int i = pngjExceptionInternal.values;
            int i2 = pngjExceptionInternal.PngjBadCrcException;
            org.camera.preview.PngjBadCrcException pngjBadCrcException2 = this.Action;
            if (pngjBadCrcException2 != null) {
                int i3 = toJson;
                setFoundMatchingTemplates = (i3 + 57) % 128;
                if (!this.onErrorResponse.getMatchingTime) {
                    setFoundMatchingTemplates = ((i3 ^ 117) + ((i3 & 117) << 1)) % 128;
                    if (pngjBadCrcException2.CaptureRolledFingersActivity.contains("focus_mode_macro")) {
                        int i4 = setFoundMatchingTemplates;
                        toJson = (((i4 | 5) << 1) - (i4 ^ 5)) % 128;
                        z = false;
                    } else {
                        toJson = (setFoundMatchingTemplates + 39) % 128;
                        z = true;
                    }
                    this.getCaptureTime = z;
                    com.identy.e1 e1Var = this.onErrorResponse;
                    org.cameracontroller.PngjBadSignature pngjBadSignature = this.Action.getQualityScore;
                    e1Var.valueOf(i, i2, pngjBadSignature != null ? pngjBadSignature.getPadSub2() : 0, this.Action.CaptureRolledFingersActivity.contains("focus_mode_macro"));
                    org.camera.preview.PngjBadCrcException pngjBadCrcException3 = this.Action;
                    pngjBadCrcException3.valueOf.values();
                    pngjBadCrcException3.Enroll4FActivity = BuildConfig.FLAVOR;
                    org.cameracontroller.PngjBadSignature pngjBadSignature2 = pngjBadCrcException3.getQualityScore;
                    if (pngjBadSignature2 != null) {
                        pngjBadSignature2.PngjPrematureEnding("flash_torch");
                        int i5 = toJson;
                        setFoundMatchingTemplates = (((i5 | 83) << 1) - (i5 ^ 83)) % 128;
                    }
                    int i6 = toJson;
                    setFoundMatchingTemplates = ((i6 ^ 5) + ((i6 & 5) << 1)) % 128;
                }
            }
            if (i != 0) {
                int i7 = setFoundMatchingTemplates;
                toJson = ((i7 ^ 13) + ((i7 & 13) << 1)) % 128;
                if (i2 != 0) {
                    com.identy.e1 e1Var2 = this.onErrorResponse;
                    e1Var2.getAttempts[0] = bArr;
                    e1Var2.setScore = e1Var2.getIdentyQuality;
                    e1Var2.EnrollFingersActivity = true;
                    e1Var2.FingerOutput = Long.valueOf(SystemClock.elapsedRealtimeNanos());
                    Capture4FActivity();
                    int i8 = toJson;
                    int i9 = ((i8 | 3) << 1) - (i8 ^ 3);
                    setFoundMatchingTemplates = i9 % 128;
                    if (i9 % 2 == 0) {
                        throw null;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = setFoundMatchingTemplates;
        int i3 = ((i2 ^ 109) + ((i2 & 109) << 1)) % 128;
        toJson = i3;
        if (i != 0) {
            if (i == 1 && iArr.length > 0) {
                int i4 = iArr[0];
                setFoundMatchingTemplates = (((i3 | 109) << 1) - (i3 ^ 109)) % 128;
                return;
            }
            return;
        }
        if (iArr.length > 0) {
            setFoundMatchingTemplates = (i3 + 99) % 128;
            int i5 = iArr[0];
            setFoundMatchingTemplates = ((i3 ^ 79) + ((i3 & 79) << 1)) % 128;
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        int i = setFoundMatchingTemplates;
        int i2 = (i & 7) + (i | 7);
        toJson = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        com.identy.e1 e1Var = this.onErrorResponse;
        if (e1Var == null) {
            return;
        }
        PngjPrematureEnding = true;
        e1Var.PngjBadCrcException();
        super.onResume();
        com.identy.onErrorResponse onerrorresponse = this.PngBadCharsetException.PngjBadCrcException;
        onerrorresponse.valueOf = true;
        onerrorresponse.PngjBadSignature = 0L;
        onerrorresponse.values();
        onerrorresponse.values.registerListener(onerrorresponse, onerrorresponse.PngjBadCrcException, 1000);
        com.identy.PngjException pngjException = this.PngBadCharsetException.valueOf;
        pngjException.valueOf = true;
        pngjException.PngjException = 0L;
        pngjException.PngjBadCrcException.registerListener(pngjException, pngjException.PngjBadSignature, 1000);
        getWindow().getDecorView().getRootView().setBackgroundColor(-16777216);
        this.getSpoofScore.registerListener(this.PngjInputException, this.getL1Score, 1000);
        this.getL2Score.enable();
        this.Action.valueOf();
        int i3 = setFoundMatchingTemplates + 109;
        toJson = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 58 / 0;
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        int i;
        int i2 = toJson;
        int i3 = (((i2 | 89) << 1) - (i2 ^ 89)) % 128;
        setFoundMatchingTemplates = i3;
        com.identy.PngjUnsupportedException pngjUnsupportedException = this.PngBadCharsetException;
        if (pngjUnsupportedException != null) {
            int i4 = (i3 ^ 35) + ((i3 & 35) << 1);
            toJson = i4 % 128;
            if (i4 % 2 != 0) {
                bundle.putInt("cameraId", pngjUnsupportedException.PngjException);
                i = 3670;
            } else {
                bundle.putInt("cameraId", pngjUnsupportedException.PngjException);
                i = 200;
            }
            bundle.putInt("zoom_factor", i);
            bundle.putFloat("focus_distance", pngjUnsupportedException.PngjBadSignature);
        }
        int i5 = setFoundMatchingTemplates;
        int i6 = (i5 & 9) + (i5 | 9);
        toJson = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        int i = toJson;
        setFoundMatchingTemplates = ((i & 27) + (i | 27)) % 128;
        PngjPrematureEnding = true;
        super.onStart();
        int i2 = setFoundMatchingTemplates;
        toJson = ((i2 ^ 93) + ((i2 & 93) << 1)) % 128;
    }

    @Override // android.app.Activity
    public void onStop() {
        int i = toJson;
        int i2 = (i & 45) + (i | 45);
        setFoundMatchingTemplates = i2 % 128;
        int i3 = i2 % 2;
        super.onStop();
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        int i = toJson;
        int i2 = (i ^ 95) + ((i & 95) << 1);
        setFoundMatchingTemplates = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (z) {
            PngjExceptionInternal();
            setFoundMatchingTemplates = (toJson + 95) % 128;
        }
        toJson = (setFoundMatchingTemplates + 19) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        if ((0 instanceof com.identy.getL2Score) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
    
        if ((0 instanceof com.identy.getL1Score) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0089, code lost:
    
        if ((0 instanceof com.identy.getL2Score) != true) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object a(Object[] objArr) {
        IdentySdk identySdk;
        View findViewById;
        FingerActivity fingerActivity = (FingerActivity) objArr[0];
        if (fingerActivity.onErrorResponse == null || fingerActivity.Action == null) {
            toJson = (setFoundMatchingTemplates + 53) % 128;
            return null;
        }
        int i = toJson;
        setFoundMatchingTemplates = ((i ^ 21) + ((i & 21) << 1)) % 128;
        try {
            identySdk = IdentySdk.getInstance();
        } catch (Exception unused) {
            identySdk = null;
        }
        if (identySdk == null) {
            fingerActivity.findViewById(R.id.change_hand).setVisibility(8);
            return null;
        }
        boolean b = identySdk.b(fingerActivity.PngjExceptionInternal);
        com.identy.e1 e1Var = fingerActivity.onErrorResponse;
        if ((e1Var instanceof isFoundMatchingTemplates) || (e1Var instanceof setFingers)) {
            fingerActivity.findViewById(R.id.left_hand_icon).setVisibility(0);
            fingerActivity.findViewById(R.id.right_hand_icon).setVisibility(0);
        }
        com.identy.e1 e1Var2 = fingerActivity.onErrorResponse;
        if (!(e1Var2 instanceof com.identy.isAuthSucess)) {
            int i2 = setFoundMatchingTemplates;
            int i3 = (i2 ^ 97) + ((i2 & 97) << 1);
            toJson = i3 % 128;
            if (i3 % 2 != 0) {
                boolean z = e1Var2 instanceof com.identy.getOveralTimetaken;
                throw null;
            }
            if (!(e1Var2 instanceof com.identy.getOveralTimetaken) && !(e1Var2 instanceof getFingers)) {
                int i4 = i2 + 99;
                toJson = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 40 / 0;
                }
                if (fingerActivity.onErrorResponse instanceof setFingers) {
                    int i6 = R.id.left_hand_icon;
                    fingerActivity.findViewById(i6).setRotation(-90.0f);
                    int i7 = R.id.right_hand_icon;
                    fingerActivity.findViewById(i7).setRotation(90.0f);
                    fingerActivity.findViewById(i6).setScaleY(-1.0f);
                    fingerActivity.findViewById(i7).setScaleY(-1.0f);
                    int i8 = toJson;
                    setFoundMatchingTemplates = ((i8 ^ 117) + ((i8 & 117) << 1)) % 128;
                }
                if (!(!b)) {
                    fingerActivity.findViewById(R.id.change_hand).setVisibility(8);
                    return null;
                }
                int i9 = setFoundMatchingTemplates;
                toJson = ((i9 & 35) + (i9 | 35)) % 128;
                int i10 = R.id.id_change_hand_button;
                fingerActivity.findViewById(i10).setVisibility(0);
                if (!identySdk.s()) {
                    fingerActivity.findViewById(i10).setOnClickListener(fingerActivity.new PngjPrematureEnding());
                    return null;
                }
                fingerActivity.getProcessingTime = fingerActivity.new PngjInputException();
                fingerActivity.findViewById(i10).setOnClickListener(fingerActivity.getProcessingTime);
                fingerActivity.findViewById(R.id.change_hand).setVisibility(0);
                return null;
            }
        }
        boolean equals = e1Var2.a.equals(Hand.LEFT);
        CapturePosition capturePosition = fingerActivity.onErrorResponse.cvtyuv2bgr;
        CapturePosition capturePosition2 = com.identy.CapturePosition.VERTICAL_FROM_TOP;
        boolean z2 = equals;
        if (capturePosition.equals(capturePosition2)) {
            z2 = ((~(equals ? 1 : 0)) & 1) != 0;
        }
        if (z2) {
            findViewById = fingerActivity.findViewById(R.id.left_hand_icon);
            findViewById.setVisibility(0);
            fingerActivity.findViewById(R.id.right_hand_icon).setVisibility(8);
        } else {
            findViewById = fingerActivity.findViewById(R.id.right_hand_icon);
            fingerActivity.findViewById(R.id.left_hand_icon).setVisibility(8);
            findViewById.setVisibility(0);
            int i11 = toJson;
            setFoundMatchingTemplates = ((i11 ^ 53) + ((i11 & 53) << 1)) % 128;
        }
        com.identy.e1 e1Var3 = fingerActivity.onErrorResponse;
        if (e1Var3 instanceof com.identy.isAuthSucess) {
            if (e1Var3.cvtyuv2bgr.equals(capturePosition2)) {
                int i12 = setFoundMatchingTemplates;
                int i13 = ((i12 | 113) << 1) - (i12 ^ 113);
                toJson = i13 % 128;
                if (i13 % 2 != 0) {
                    throw null;
                }
                if (z2) {
                    findViewById.setRotation(90.0f);
                } else {
                    findViewById.setRotation(-90.0f);
                }
                findViewById.setScaleY(-1.0f);
            } else if (fingerActivity.onErrorResponse.cvtyuv2bgr.equals(com.identy.CapturePosition.VERTICAL_FROM_BOTTOM)) {
                int i14 = (setFoundMatchingTemplates + 95) % 128;
                toJson = i14;
                if (z2) {
                    setFoundMatchingTemplates = ((i14 & 31) + (i14 | 31)) % 128;
                    findViewById.setRotation(-90.0f);
                } else {
                    findViewById.setRotation(90.0f);
                    int i15 = toJson;
                    setFoundMatchingTemplates = ((i15 & 45) + (i15 | 45)) % 128;
                }
            }
        }
        if (fingerActivity.onErrorResponse instanceof setFingers) {
        }
        if (!(!b)) {
        }
    }

    public final boolean PngjBadCrcException() {
        int i = setFoundMatchingTemplates;
        int i2 = ((i | 59) << 1) - (i ^ 59);
        toJson = i2 % 128;
        if (i2 % 2 != 0) {
            PreferenceManager.getDefaultSharedPreferences(this).getString("identy_app_preference_immersive_mode", "immersive_mode_low_profile").equals("immersive_mode_gui");
            throw null;
        }
        String string = PreferenceManager.getDefaultSharedPreferences(this).getString("identy_app_preference_immersive_mode", "immersive_mode_low_profile");
        if (!string.equals("immersive_mode_gui")) {
            int i3 = toJson + 35;
            setFoundMatchingTemplates = i3 % 128;
            if (i3 % 2 == 0) {
                string.equals("immersive_mode_everything");
                throw null;
            }
            if (!string.equals("immersive_mode_everything")) {
                int i4 = setFoundMatchingTemplates;
                int i5 = ((i4 | 83) << 1) - (i4 ^ 83);
                toJson = i5 % 128;
                if (i5 % 2 == 0) {
                    return false;
                }
                throw null;
            }
        }
        int i6 = setFoundMatchingTemplates;
        int i7 = (i6 & 53) + (i6 | 53);
        toJson = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public void PngjBadSignature(List<HashMap<Pair<Hand, Finger>, com.identy.IdentyA>> list, boolean z, boolean z2, HashMap<Pair<Hand, Finger>, Float> hashMap) {
        if (this.onErrorResponse == null || z) {
            return;
        }
        int i = setFoundMatchingTemplates;
        toJson = (((i | 123) << 1) - (i ^ 123)) % 128;
        if (LibSettings.isSaveCaptured()) {
            toJson = (setFoundMatchingTemplates + 13) % 128;
            Iterator<Map.Entry<Pair<Hand, Finger>, Float>> it = hashMap.entrySet().iterator();
            while (!(!it.hasNext())) {
                setFoundMatchingTemplates = (toJson + 1) % 128;
                Map.Entry<Pair<Hand, Finger>, Float> next = it.next();
                Pair<Hand, Finger> key = next.getKey();
                next.getValue();
                Objects.toString(key.first);
                Objects.toString(key.second);
            }
            runOnUiThread(new PngjUnsupportedException());
        }
        int i2 = 0;
        try {
            i2 = IdentySdk.getInstance().getAllowedAttempts();
            if (!z2) {
                toJson = (setFoundMatchingTemplates + 123) % 128;
                IdentySdk identySdk = IdentySdk.getInstance();
                FingerDetectionMode fingerDetectionMode = this.PngjExceptionInternal;
                com.identy.e1 e1Var = this.onErrorResponse;
                int i3 = e1Var.getEncryptedTemplates;
                Pair[] PngjExceptionInternal2 = e1Var.PngjExceptionInternal();
                com.identy.e1 e1Var2 = this.onErrorResponse;
                identySdk.a(fingerDetectionMode, i3, PngjExceptionInternal2, e1Var2.toString, e1Var2.Enroll2IndexActivity, hashMap);
                toJson = (setFoundMatchingTemplates + 33) % 128;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!z2) {
            int i4 = toJson;
            int i5 = (i4 ^ 35) + ((i4 & 35) << 1);
            setFoundMatchingTemplates = i5 % 128;
            if (i5 % 2 == 0) {
                com.identy.e1 e1Var3 = this.onErrorResponse;
                e1Var3.getEncryptedTemplates = e1Var3.getEncryptedTemplates;
            } else {
                com.identy.e1 e1Var4 = this.onErrorResponse;
                int i6 = e1Var4.getEncryptedTemplates;
                e1Var4.getEncryptedTemplates = (i6 & 1) + (i6 | 1);
            }
        }
        if (this.onErrorResponse.getEncryptedTemplates >= i2) {
            Capture2TActivity();
        }
        this.onErrorResponse.valueOf();
        PngjException(com.identy.a.PngjException.values(), 843068644, new Object[]{this, Boolean.valueOf(z2)}, com.identy.a.PngjException.values(), -843068625, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
        int i7 = toJson;
        setFoundMatchingTemplates = (((i7 | 19) << 1) - (i7 ^ 19)) % 128;
    }

    public final org.camera.preview.PngjBadCrcException PngjInputException() {
        int i = setFoundMatchingTemplates;
        int i2 = (i ^ 87) + ((i & 87) << 1);
        toJson = i2 % 128;
        int i3 = i2 % 2;
        org.camera.preview.PngjBadCrcException pngjBadCrcException = this.Action;
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        return pngjBadCrcException;
    }

    public final FingerDetectionMode onErrorResponse() {
        return (FingerDetectionMode) PngjException(com.identy.a.PngjException.values(), -388390624, new Object[]{this}, com.identy.a.PngjException.values(), 388390631, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        0.screenBrightness = -1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        0.screenBrightness = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        if (0 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (0 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if (0.getBoolean("identy_app_preference_max_brightness", true) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        0 = com.identy.FingerActivity.toJson;
        0 = ((0 | 69) << 1) - (0 ^ 69);
        0 = 0 % 128;
        com.identy.FingerActivity.setFoundMatchingTemplates = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0048, code lost:
    
        if ((0 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004a, code lost:
    
        0.screenBrightness = -1.0f;
        com.identy.FingerActivity.toJson = ((0 ^ 83) + ((0 & 83) << 1)) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void valueOf(boolean z) {
        SharedPreferences defaultSharedPreferences;
        WindowManager.LayoutParams attributes;
        int i = toJson + 97;
        setFoundMatchingTemplates = i % 128;
        if (i % 2 == 0) {
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
            attributes = getWindow().getAttributes();
            int i2 = 75 / 0;
        } else {
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
            attributes = getWindow().getAttributes();
        }
        runOnUiThread(new PngjOutputException(attributes));
        int i3 = setFoundMatchingTemplates;
        int i4 = (i3 & 5) + (i3 | 5);
        toJson = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void values(Pair<Hand, Finger>[] pairArr) {
        int i = toJson;
        setFoundMatchingTemplates = ((i ^ 37) + ((i & 37) << 1)) % 128;
        try {
            com.identy.e1 e1Var = this.onErrorResponse;
            ERRORS errors = ERRORS.EXCEEDED_TRANSACTION_LIMIT;
            e1Var.valueOf(errors);
            IdentySdk.getInstance().a(errors, pairArr);
            setFoundMatchingTemplates = (toJson + 75) % 128;
        } catch (Exception e) {
            e.printStackTrace();
        }
        finish();
        int i2 = toJson;
        int i3 = (i2 ^ com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground) + ((i2 & com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground) << 1);
        setFoundMatchingTemplates = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object PngjPrematureEnding(Object[] objArr) {
        FingerActivity fingerActivity = (FingerActivity) objArr[0];
        Pair[] pairArr = (Pair[]) objArr[1];
        int i = setFoundMatchingTemplates;
        int i2 = (i ^ 39) + ((i & 39) << 1);
        toJson = i2 % 128;
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (i2 % 2 == 0) {
            com.identy.e1 e1Var = fingerActivity.onErrorResponse;
            ERRORS errors = ERRORS.TIMED_OUT;
            e1Var.valueOf(errors);
            IdentySdk.getInstance().a(errors, pairArr);
            int i3 = setFoundMatchingTemplates;
            toJson = (((i3 | 45) << 1) - (i3 ^ 45)) % 128;
            fingerActivity.finish();
            int i4 = toJson;
            int i5 = (i4 ^ 71) + ((i4 & 71) << 1);
            setFoundMatchingTemplates = i5 % 128;
            if (i5 % 2 != 0) {
                return null;
            }
            throw null;
        }
        com.identy.e1 e1Var2 = fingerActivity.onErrorResponse;
        ERRORS errors2 = ERRORS.TIMED_OUT;
        e1Var2.valueOf(errors2);
        IdentySdk.getInstance().a(errors2, pairArr);
        throw null;
    }

    public final boolean PngBadCharsetException() {
        return ((Boolean) PngjException(com.identy.a.PngjException.values(), -1456071114, new Object[]{this}, com.identy.a.PngjException.values(), 1456071122, com.identy.a.PngjException.values(), com.identy.a.PngjException.values())).booleanValue();
    }

    @Override // com.identy.d.PngjBadSignature
    public final void getAsHighestSecurityLevelReached() {
        PngjException(com.identy.a.PngjException.values(), -213252982, new Object[]{this}, com.identy.a.PngjException.values(), 213253003, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
    }

    public void values(Bundle bundle) {
        FingerDetectionMode[] fingerDetectionModeArr = (FingerDetectionMode[]) getIntent().getSerializableExtra("option_selected");
        this.CapturePosition = fingerDetectionModeArr;
        if (fingerDetectionModeArr.length == 0) {
            runOnUiThread(new onErrorResponse());
            finish();
            setFoundMatchingTemplates = (toJson + com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground) % 128;
            return;
        }
        this.PngjExceptionInternal = fingerDetectionModeArr[this.CaptureThumbActivity];
        ArrayList arrayList = new ArrayList();
        if (this.PngjExceptionInternal.canClub()) {
            Hand hand = this.PngjExceptionInternal.getHand();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = new ArrayList(Arrays.asList(this.CapturePosition)).iterator();
            int i = 0;
            while (it.hasNext()) {
                FingerDetectionMode fingerDetectionMode = (FingerDetectionMode) it.next();
                if (fingerDetectionMode.getHand() != null && !(!fingerDetectionMode.getHand().equals(hand))) {
                    int i2 = setFoundMatchingTemplates;
                    toJson = (((i2 | 27) << 1) - (i2 ^ 27)) % 128;
                    if (fingerDetectionMode.canClub()) {
                        arrayList2.add(fingerDetectionMode.getFinger());
                        this.getPadSub2.add(fingerDetectionMode);
                        if (i == 0) {
                            com.identy.a.PngjException.values();
                            com.identy.a.PngjException.values();
                            arrayList.add(fingerDetectionMode);
                        }
                        i++;
                    }
                }
                arrayList.add(fingerDetectionMode);
                i++;
            }
            this.CapturePosition = (FingerDetectionMode[]) arrayList.toArray(new FingerDetectionMode[arrayList.size()]);
            this.a = (Finger[]) arrayList2.toArray(new Finger[arrayList2.size()]);
            toJson = (setFoundMatchingTemplates + 65) % 128;
        }
        CaptureFingersActivity();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        int largeMemoryClass = ((ActivityManager) getSystemService("activity")).getLargeMemoryClass();
        this.Capture2TActivity = largeMemoryClass;
        if (largeMemoryClass >= 128) {
            int i3 = toJson + 47;
            setFoundMatchingTemplates = i3 % 128;
            if (i3 % 2 == 0) {
                this.CaptureFingersActivity = false;
            } else {
                this.CaptureFingersActivity = true;
            }
        }
        this.isQualityFailed = new org.camera.a.valueOf(this);
        this.PngBadCharsetException = new com.identy.PngjUnsupportedException(this, bundle);
        PngjException();
        getL1Score();
        SensorManager sensorManager = (SensorManager) getSystemService("sensor");
        this.getSpoofScore = sensorManager;
        if (!valueOf) {
            toJson = (setFoundMatchingTemplates + 83) % 128;
            if (sensorManager == null) {
                throw new AssertionError();
            }
        }
        if (sensorManager.getDefaultSensor(5) != null) {
            int i4 = toJson + 5;
            setFoundMatchingTemplates = i4 % 128;
            this.getL1Score = i4 % 2 == 0 ? this.getSpoofScore.getDefaultSensor(2) : this.getSpoofScore.getDefaultSensor(5);
        }
        try {
            this.onErrorResponse = new com.identy.getOveralTimetaken(this, this, this.PngjExceptionInternal, IdentySdk.getInstance().u(), this.PngjUnsupportedException, false);
        } catch (Exception unused) {
        }
        getCaptureTime();
        this.getL2Score = new getAsHighestSecurityLevelReached(this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new getPadSub1());
        boolean contains = defaultSharedPreferences.contains("identy_app_done_first_time");
        if (!contains) {
            toJson = (setFoundMatchingTemplates + 83) % 128;
            PngjException(com.identy.a.PngjException.values(), 1727349288, new Object[]{this}, com.identy.a.PngjException.values(), -1727349276, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
        }
        if (!contains) {
            getMatchingTime();
        }
        IntentFilter intentFilter = new IntentFilter(com.identy.PngjBadSignature.valueOf);
        IntentFilter intentFilter2 = new IntentFilter(com.identy.PngjBadSignature.PngjException);
        this.getMatchingTime = new getPadSub2();
        getData getdata = new getData();
        this.getNfiq1Score = getdata;
        int i5 = setFoundMatchingTemplates;
        toJson = ((i5 ^ 97) + ((i5 & 97) << 1)) % 128;
        registerReceiver(getdata, intentFilter, 2);
        registerReceiver(this.getMatchingTime, intentFilter2, 2);
        try {
            if (!LibSettings.isSaveCaptured()) {
                return;
            }
            setFoundMatchingTemplates = (toJson + 67) % 128;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0016, code lost:
    
        if (0 != 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (0 != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PngjBadCrcException(int i, int i2) {
        int i3 = setFoundMatchingTemplates;
        int i4 = (i3 & 109) + (i3 | 109);
        toJson = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        finish();
        try {
            IdentySdk.getInstance().a(ERRORS.UNKNOWN, null);
        } catch (Exception e) {
            e.printStackTrace();
            int i6 = setFoundMatchingTemplates;
            toJson = ((i6 ^ 63) + ((i6 & 63) << 1)) % 128;
        }
    }

    public final void PngjExceptionInternal() {
        int i = setFoundMatchingTemplates;
        int i2 = ((i | 31) << 1) - (i ^ 31);
        toJson = i2 % 128;
        if (i2 % 2 == 0) {
            if (PngjBadCrcException()) {
                int i3 = setFoundMatchingTemplates + 97;
                toJson = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {this};
                int values2 = com.identy.a.PngjException.values();
                int values3 = com.identy.a.PngjException.values();
                int values4 = com.identy.a.PngjException.values();
                int values5 = com.identy.a.PngjException.values();
                if (i4 != 0) {
                    PngjException(values2, 1835529429, objArr, values3, -1835529416, values4, values5);
                    int i5 = 53 / 0;
                } else {
                    PngjException(values2, 1835529429, objArr, values3, -1835529416, values4, values5);
                }
                int i6 = setFoundMatchingTemplates;
                toJson = ((i6 & 73) + (i6 | 73)) % 128;
            }
            toJson = (setFoundMatchingTemplates + 61) % 128;
            return;
        }
        PngjBadCrcException();
        throw null;
    }

    public final org.camera.a.valueOf PngjUnsupportedException() {
        return (org.camera.a.valueOf) PngjException(com.identy.a.PngjException.values(), -172044952, new Object[]{this}, com.identy.a.PngjException.values(), 172044966, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
    }

    public static /* synthetic */ void PngjBadCrcException(FingerActivity fingerActivity) {
        PngjException(com.identy.a.PngjException.values(), -765020429, new Object[]{fingerActivity}, com.identy.a.PngjException.values(), 765020434, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
    }

    private void PngjBadCrcException(String str) {
        PngjException(com.identy.a.PngjException.values(), -563322541, new Object[]{this, str}, com.identy.a.PngjException.values(), 563322561, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
    }

    @Override // com.identy.d.PngjBadSignature
    public final void valueOf(Pair<Hand, Finger>[] pairArr) {
        PngjException(com.identy.a.PngjException.values(), -927874741, new Object[]{this, pairArr}, com.identy.a.PngjException.values(), 927874751, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        0 = new com.identy.ui.c.getPadSub1(0, new com.identy.FingerActivity.PngjException(0));
        0.getPadSub1 = 0;
        0.show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
    
        if ((!0) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (0 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        0.onErrorResponse.valueOf();
        0.isQualityFailed();
        com.identy.FingerActivity.PngjBadSignature = false;
        0 = com.identy.FingerActivity.toJson + 121;
        com.identy.FingerActivity.setFoundMatchingTemplates = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
    
        if ((0 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        0 = 14 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object e1(Object[] objArr) {
        FingerActivity fingerActivity = (FingerActivity) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = setFoundMatchingTemplates + 41;
        toJson = i % 128;
        if (i % 2 != 0) {
            fingerActivity.getL3Score = true;
        } else {
            fingerActivity.getL3Score = true;
        }
        return null;
    }

    private static boolean valueOf() {
        return ((Boolean) PngjException(com.identy.a.PngjException.values(), 1791075781, new Object[0], com.identy.a.PngjException.values(), -1791075758, com.identy.a.PngjException.values(), com.identy.a.PngjException.values())).booleanValue();
    }

    public final void PngjOutputException() {
        int i = toJson + 65;
        setFoundMatchingTemplates = i % 128;
        if (i % 2 != 0 ? PreferenceManager.getDefaultSharedPreferences(this).getBoolean("identy_app_preference_show_take_photo", true) : PreferenceManager.getDefaultSharedPreferences(this).getBoolean("identy_app_preference_show_take_photo", true)) {
            boolean z = this.isQualityFailed.PngjException;
        }
        int i2 = toJson;
        setFoundMatchingTemplates = ((i2 & 89) + (i2 | 89)) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        if (i0[0].getFinger().equals(com.identy.enums.Finger.THUMB) != false) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d0 A[Catch: Exception -> 0x008a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x008a, blocks: (B:5:0x0067, B:9:0x007b, B:13:0x009e, B:16:0x00ae, B:19:0x00d0, B:20:0x0102, B:26:0x00e8, B:29:0x00f4, B:33:0x00f8, B:34:0x00b1, B:36:0x008d), top: B:4:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1 A[Catch: Exception -> 0x008a, TRY_LEAVE, TryCatch #2 {Exception -> 0x008a, blocks: (B:5:0x0067, B:9:0x007b, B:13:0x009e, B:16:0x00ae, B:19:0x00d0, B:20:0x0102, B:26:0x00e8, B:29:0x00f4, B:33:0x00f8, B:34:0x00b1, B:36:0x008d), top: B:4:0x0067 }] */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.identy.enums.FingerDetectionMode[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Action() {
        boolean z;
        Hand hand;
        boolean contains;
        int i = toJson;
        setFoundMatchingTemplates = (((i | 41) << 1) - (i ^ 41)) % 128;
        if (this.CaptureThumbActivity + 1 < this.CapturePosition.length) {
            finish();
            int i2 = this.CaptureThumbActivity;
            int values2 = com.identy.a.PngjException.values();
            int i3 = i2 * (-932);
            int i4 = (934 ^ i3) + ((i3 & 934) << 1);
            int i5 = ~i2;
            int i6 = ~values2;
            int i7 = -(-(((~(((-2) & i6) | ((-2) ^ i6))) | i5) * (-933)));
            int i8 = (i4 & i7) + (i7 | i4);
            int i9 = ~i2;
            int i10 = ~((i6 & i9) | (i9 ^ i6));
            int i11 = ~(i5 | 1);
            this.CaptureThumbActivity = (((i8 - (~(-(-(((i10 & i11) | (i10 ^ i11)) * 933))))) - 1) - (~(-(-((~((i2 & 1) | (i2 ^ 1))) * 933))))) - 1;
            FingerDetectionMode[] fingerDetectionModeArr = this.CapturePosition;
            FingerDetectionMode[] i0 = (FingerDetectionMode[]) Arrays.copyOfRange(fingerDetectionModeArr, 1, fingerDetectionModeArr.length);
            try {
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (i0[0].getFinger() != null) {
                int i12 = setFoundMatchingTemplates + 41;
                toJson = i12 % 128;
                if (i12 % 2 != 0) {
                    if (i0[1].getFinger().equals(Finger.THUMB)) {
                        z = true;
                    }
                }
                if (i0[0].getHand() != null) {
                    toJson = (setFoundMatchingTemplates + 45) % 128;
                    hand = Hand.LEFT;
                } else {
                    hand = i0[0].getHand();
                    int i13 = toJson;
                    setFoundMatchingTemplates = ((i13 & 33) + (i13 | 33)) % 128;
                }
                int i14 = setFoundMatchingTemplates;
                int i15 = ((i14 ^ 67) + ((i14 & 67) << 1)) % 128;
                toJson = i15;
                if (z) {
                    contains = IdentySdk.getInstance().PngjExceptionInternal.contains(hand);
                } else {
                    int i16 = (i15 & 45) + (i15 | 45);
                    setFoundMatchingTemplates = i16 % 128;
                    if (i16 % 2 == 0) {
                        contains = IdentySdk.getInstance().PngjPrematureEnding.contains(hand);
                        int i17 = 53 / 0;
                    } else {
                        contains = IdentySdk.getInstance().PngjPrematureEnding.contains(hand);
                    }
                }
                Intent intent = new Intent(this, (Class<?>) GuideNoGuideHelper.getClassForDetection(this, getIntent(), contains, null, IdentySdk.getInstance().isRolledfp()));
                intent.putExtra("type", getIntent().getStringExtra("type"));
                intent.putExtra("option_selected", (Serializable) 0);
                intent.putExtra("options", getIntent().getSerializableExtra("options"));
                startActivity(intent);
                return true;
            }
            z = false;
            if (i0[0].getHand() != null) {
            }
            int i142 = setFoundMatchingTemplates;
            int i152 = ((i142 ^ 67) + ((i142 & 67) << 1)) % 128;
            toJson = i152;
            if (z) {
            }
            Intent intent2 = new Intent(this, (Class<?>) GuideNoGuideHelper.getClassForDetection(this, getIntent(), contains, null, IdentySdk.getInstance().isRolledfp()));
            intent2.putExtra("type", getIntent().getStringExtra("type"));
            intent2.putExtra("option_selected", (Serializable) 0);
            intent2.putExtra("options", getIntent().getSerializableExtra("options"));
            startActivity(intent2);
            return true;
        }
        try {
            org.camera.preview.PngjBadCrcException pngjBadCrcException = this.Action;
            if (pngjBadCrcException != null) {
                setFoundMatchingTemplates = (i + 97) % 128;
                pngjBadCrcException.PngjException();
            }
        } catch (Exception unused) {
        }
        try {
            IdentySdk.getInstance().D();
        } catch (Exception unused2) {
        }
        finish();
        return false;
    }

    public final void PngjBadSignature(RectF rectF) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        this.getScore = 1;
        org.camera.preview.PngjBadCrcException pngjBadCrcException = this.Action;
        pngjBadCrcException.PngjPrematureEnding = 35;
        pngjBadCrcException.PngjException(rectF, new getL1Score(timeInMillis));
        int i = toJson;
        int i2 = (i ^ 113) + ((i & 113) << 1);
        setFoundMatchingTemplates = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 97 / 0;
        }
    }

    private static /* synthetic */ Object PngjBadSignature(Object[] objArr) {
        FingerActivity fingerActivity = (FingerActivity) objArr[0];
        int i = toJson;
        setFoundMatchingTemplates = (((i | 23) << 1) - (i ^ 23)) % 128;
        fingerActivity.finish();
        FingerDetectionMode[] fingerDetectionModeArr = fingerActivity.CapturePosition;
        try {
            fingerActivity.startActivity(fingerActivity.getIntent());
        } catch (Exception e) {
            e.printStackTrace();
        }
        int i2 = toJson + 113;
        setFoundMatchingTemplates = i2 % 128;
        if (i2 % 2 != 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    public static boolean PngjException(Context context) {
        boolean z;
        int i = toJson;
        setFoundMatchingTemplates = ((i ^ 53) + ((i & 53) << 1)) % 128;
        boolean PngjBadSignature2 = PngjBadSignature(context);
        if (context.getResources().getConfiguration().orientation == 2) {
            int i2 = setFoundMatchingTemplates;
            int i3 = i2 + 55;
            toJson = i3 % 128;
            z = i3 % 2 == 0;
            toJson = ((i2 & 13) + (i2 | 13)) % 128;
        } else {
            z = false;
        }
        if (PngjBadSignature2) {
            int i4 = setFoundMatchingTemplates;
            int i5 = (i4 ^ 43) + ((i4 & 43) << 1);
            toJson = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            if (z) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c2, code lost:
    
        if (0 != true) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c7, code lost:
    
        if (0 == true) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c9, code lost:
    
        if (0 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d3, code lost:
    
        if (android.os.Build.MODEL.equals("NTN-LX1") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d5, code lost:
    
        if (0 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d7, code lost:
    
        0 = com.identy.FingerActivity.toJson;
        com.identy.FingerActivity.setFoundMatchingTemplates = ((0 ^ 123) + ((0 & 123) << 1)) % 128;
        0 = android.os.Build.MODEL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00eb, code lost:
    
        if (0.equals("CPH2619") != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f3, code lost:
    
        if (0.equals("EB2101") == true) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f5, code lost:
    
        0.CaptureMode = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f8, code lost:
    
        if (0 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fb, code lost:
    
        java.lang.System.identityHashCode(0);
        java.lang.System.identityHashCode(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0108, code lost:
    
        if (0 > 3.1d) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x010a, code lost:
    
        0 = com.identy.FingerActivity.toJson;
        0 = (0 & 125) + (0 | 125);
        com.identy.FingerActivity.setFoundMatchingTemplates = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0117, code lost:
    
        if ((0 % 2) != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0119, code lost:
    
        0.CaptureMode = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x011b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x011c, code lost:
    
        0.CaptureMode = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x011e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011f, code lost:
    
        0 = new org.cameracontroller.PngjInputException(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0128, code lost:
    
        if (0.PngjBadSignature() == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012a, code lost:
    
        com.identy.FingerActivity.toJson = (com.identy.FingerActivity.setFoundMatchingTemplates + 57) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x013c, code lost:
    
        0.CaptureMode = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0142, code lost:
    
        if (0.PngjException() != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0144, code lost:
    
        0.CaptureMode = false;
        0 = com.identy.FingerActivity.setFoundMatchingTemplates;
        0 = (0 & 27) + (0 | 27);
        com.identy.FingerActivity.toJson = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0153, code lost:
    
        if ((0 % 2) != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0155, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0156, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0157, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0133, code lost:
    
        com.identy.FingerActivity.toJson = (com.identy.FingerActivity.setFoundMatchingTemplates + 111) % 128;
        0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0158, code lost:
    
        0.CaptureMode = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x015a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c5, code lost:
    
        if (0 != true) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void PngjException() {
        boolean z;
        int i = setFoundMatchingTemplates;
        boolean z2 = true;
        int i2 = (i ^ 41) + ((i & 41) << 1);
        toJson = i2 % 128;
        if (i2 % 2 != 0) {
            this.CaptureMode = true;
            if (com.identy.PngjUnsupportedException.PngjBadCrcException(this)) {
                return;
            }
        } else {
            this.CaptureMode = false;
            if (com.identy.PngjUnsupportedException.PngjBadCrcException(this)) {
                return;
            }
        }
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        boolean contains = str.toLowerCase(locale).contains("lge");
        boolean contains2 = str.toLowerCase(locale).contains("leno");
        boolean contains3 = str.toLowerCase(locale).contains("honor");
        boolean contains4 = str.toLowerCase(locale).contains("oneplus");
        boolean contains5 = str.toLowerCase(locale).contains("vivo");
        long longValue = ((Long) PngjException(com.identy.a.PngjException.values(), 1438500373, new Object[]{this}, com.identy.a.PngjException.values(), -1438500369, com.identy.a.PngjException.values(), com.identy.a.PngjException.values())).longValue();
        if (longValue < 1519572992) {
            int i3 = toJson;
            setFoundMatchingTemplates = ((i3 ^ 37) + ((i3 & 37) << 1)) % 128;
            z = true;
        } else {
            z = false;
        }
        double d = longValue / 1.048576E9d;
        com.identy.getPadSub2.PngjException("MEMORY", "Total memory ? ".concat(String.valueOf(longValue)));
        if (!contains) {
            int i4 = toJson;
            int i5 = (i4 ^ 13) + ((i4 & 13) << 1);
            setFoundMatchingTemplates = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 75 / 0;
            }
        }
        this.CaptureMode = true;
        int i7 = setFoundMatchingTemplates;
        int i8 = ((i7 | 47) << 1) - (i7 ^ 47);
        toJson = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    public final void PngjBadSignature() {
        setFoundMatchingTemplates = (toJson + 101) % 128;
        if (com.identy.e1.valueOf.equals(org.camera.preview.PngjBadCrcException.PngjBadSignature.HIGH)) {
            int i = toJson;
            setFoundMatchingTemplates = ((i ^ 73) + ((i & 73) << 1)) % 128;
            com.identy.e1.valueOf = org.camera.preview.PngjBadCrcException.PngjBadSignature.MEDIUM;
        } else if (!(!com.identy.e1.valueOf.equals(org.camera.preview.PngjBadCrcException.PngjBadSignature.MEDIUM))) {
            int i2 = setFoundMatchingTemplates;
            toJson = ((i2 ^ 65) + ((i2 & 65) << 1)) % 128;
            com.identy.e1.valueOf = org.camera.preview.PngjBadCrcException.PngjBadSignature.LOW;
        }
        try {
            IdentySdk.getInstance().F();
            try {
                if (LibSettings.isSaveCaptured()) {
                    int i3 = toJson + 29;
                    setFoundMatchingTemplates = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 41 / 0;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception unused) {
        }
        finish();
        setFoundMatchingTemplates = (toJson + 51) % 128;
    }

    private void PngjBadSignature(int i) {
        runOnUiThread(new getProcessingTime(i));
        toJson = (setFoundMatchingTemplates + 93) % 128;
    }

    private void PngjBadSignature(boolean z) {
        PngjException(com.identy.a.PngjException.values(), 843068644, new Object[]{this, Boolean.valueOf(z)}, com.identy.a.PngjException.values(), -843068625, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
    }

    @Override // com.identy.d.PngjBadSignature
    public final void PngjBadSignature(int i, boolean z) {
        PngjException(com.identy.a.PngjException.values(), -1432755179, new Object[]{this, Integer.valueOf(i), Boolean.valueOf(z)}, com.identy.a.PngjException.values(), 1432755185, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
    }

    public static /* synthetic */ void PngjBadSignature(FingerActivity fingerActivity) {
        PngjException(com.identy.a.PngjException.values(), 296769042, new Object[]{fingerActivity}, com.identy.a.PngjException.values(), -296769018, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
    }

    @Override // com.identy.d.PngjBadSignature
    public final void values(int i) {
        PngjException(com.identy.a.PngjException.values(), -1949008527, new Object[]{this, Integer.valueOf(i)}, com.identy.a.PngjException.values(), 1949008530, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
    }

    public final void values() {
        PngjException(com.identy.a.PngjException.values(), 1835529429, new Object[]{this}, com.identy.a.PngjException.values(), -1835529416, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
    }

    private static /* synthetic */ Object PngjException(Object[] objArr) {
        FingerActivity fingerActivity = (FingerActivity) objArr[0];
        int i = setFoundMatchingTemplates + 85;
        int i2 = i % 128;
        toJson = i2;
        int i3 = i % 2;
        org.camera.preview.PngjBadCrcException pngjBadCrcException = fingerActivity.Action;
        if (i3 == 0) {
            org.cameracontroller.PngjBadSignature pngjBadSignature = pngjBadCrcException.getQualityScore;
            if (pngjBadSignature instanceof org.cameracontroller.valueOf) {
                return Boolean.valueOf(((org.cameracontroller.valueOf) pngjBadSignature).closeDialog);
            }
            int i4 = i2 + 81;
            setFoundMatchingTemplates = i4 % 128;
            if (i4 % 2 != 0) {
                return Boolean.FALSE;
            }
            int i5 = 6 / 0;
            return Boolean.FALSE;
        }
        boolean z = pngjBadCrcException.getQualityScore instanceof org.cameracontroller.valueOf;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void PngjException(HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap, HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap2, Bitmap bitmap, boolean z, boolean z2) {
        boolean z3;
        com.identy.Action action;
        int i;
        int i2;
        int i3;
        int i4 = toJson;
        setFoundMatchingTemplates = (((i4 | 125) << 1) - (i4 ^ 125)) % 128;
        if (z) {
            try {
                IdentySdk.getInstance().a(this.PngjExceptionInternal);
                if (!z2) {
                    com.identy.e1.valueOf(false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.getAsHighestSecurityLevelReached = true;
        this.onErrorResponse.valueOf();
        try {
            boolean z4 = IdentySdk.getInstance().e1;
            int i5 = toJson;
            setFoundMatchingTemplates = (((i5 | 31) << 1) - (i5 ^ 31)) % 128;
            z3 = z4;
        } catch (Exception unused) {
            z3 = false;
        }
        try {
            action = IdentySdk.getInstance().e;
        } catch (Exception e2) {
            e2.printStackTrace();
            action = null;
        }
        if (!(!z2) && !action.equals(com.identy.Action.VERIFY)) {
            int i6 = toJson;
            setFoundMatchingTemplates = ((i6 & 81) + (i6 | 81)) % 128;
            try {
                i2 = IdentySdk.getInstance().getAllowedAttempts();
            } catch (Exception e3) {
                i2 = 0;
            }
            try {
                IdentySdk identySdk = IdentySdk.getInstance();
                FingerDetectionMode fingerDetectionMode = this.PngjExceptionInternal;
                com.identy.e1 e1Var = this.onErrorResponse;
                int i7 = e1Var.getEncryptedTemplates;
                Pair[] PngjExceptionInternal2 = e1Var.PngjExceptionInternal();
                com.identy.e1 e1Var2 = this.onErrorResponse;
                float f = e1Var2.CaptureFingersActivity;
                long j = e1Var2.toString;
                long j2 = e1Var2.Enroll2IndexActivity;
                byte[] PngjPrematureEnding2 = e1Var2.PngjPrematureEnding();
                com.identy.e1 e1Var3 = this.onErrorResponse;
                int i8 = e1Var3.setFoundMatchingTemplates;
                int i9 = e1Var3.Enroll2IndexActivity;
                int values2 = com.identy.a.PngjException.values();
                int i10 = i9 * 569;
                int i11 = i8 * 569;
                int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
                int i13 = ~i9;
                int i14 = ~i8;
                int i15 = ~(i13 | i14);
                int i16 = ~i9;
                int i17 = ~values2;
                int i18 = i15 | (~((i16 ^ i17) | (i16 & i17)));
                int i19 = ~((i14 ^ i17) | (i14 & i17));
                int i20 = -(-(((i18 ^ i19) | (i18 & i19)) * (-1136)));
                int i21 = ((i12 | i20) << 1) - (i12 ^ i20);
                int i22 = ~((i16 ^ values2) | (i16 & values2));
                int i23 = ~((~i8) | values2);
                int i24 = (i22 ^ i23) | (i22 & i23);
                int i25 = ~values2;
                int i26 = (i25 ^ i9) | (i25 & i9);
                int i27 = ~((i26 ^ i8) | (i26 & i8));
                int i28 = (((i24 ^ i27) | (i24 & i27)) * (-568)) + i21;
                int i29 = ~(i25 | i9);
                int i30 = ~((i17 ^ i8) | (i17 & i8));
                int i31 = (i29 ^ i30) | (i29 & i30);
                int i32 = (i16 & i14) | (i16 ^ i14);
                int i33 = ~((i32 & values2) | (i32 ^ values2));
                identySdk.a(fingerDetectionMode, i7, PngjExceptionInternal2, hashMap, f, f, f, j, j2, PngjPrematureEnding2, (((i31 & i33) | (i31 ^ i33)) * 568) + i28);
                int i34 = toJson;
                setFoundMatchingTemplates = ((i34 & 25) + (i34 | 25)) % 128;
            } catch (Exception e4) {
                e4.printStackTrace();
                com.identy.e1 e1Var4 = this.onErrorResponse;
                i3 = e1Var4.getEncryptedTemplates + 1;
                e1Var4.getEncryptedTemplates = i3;
                if (i3 >= i2) {
                }
                this.getAsHighestSecurityLevelReached = false;
                com.identy.e1.values(new Object[]{this.onErrorResponse}, com.identy.i.PngjPrematureEnding.values(), com.identy.i.PngjPrematureEnding.values(), -431637600, com.identy.i.PngjPrematureEnding.values(), 431637601, com.identy.i.PngjPrematureEnding.values());
                return;
            }
            com.identy.e1 e1Var42 = this.onErrorResponse;
            i3 = e1Var42.getEncryptedTemplates + 1;
            e1Var42.getEncryptedTemplates = i3;
            if (i3 >= i2) {
                setFoundMatchingTemplates = (toJson + 27) % 128;
                e1();
            } else {
                Capture2TActivity();
            }
            this.getAsHighestSecurityLevelReached = false;
            com.identy.e1.values(new Object[]{this.onErrorResponse}, com.identy.i.PngjPrematureEnding.values(), com.identy.i.PngjPrematureEnding.values(), -431637600, com.identy.i.PngjPrematureEnding.values(), 431637601, com.identy.i.PngjPrematureEnding.values());
            return;
        }
        try {
            i = IdentySdk.getInstance().getAllowedAttempts();
        } catch (Exception e5) {
            e5.printStackTrace();
            i = 0;
        }
        if (z2 && !z3 && action.equals(com.identy.Action.VERIFY)) {
            try {
                IdentySdk identySdk2 = IdentySdk.getInstance();
                FingerDetectionMode fingerDetectionMode2 = this.PngjExceptionInternal;
                com.identy.e1 e1Var5 = this.onErrorResponse;
                int i35 = e1Var5.getEncryptedTemplates;
                Pair[] PngjExceptionInternal3 = e1Var5.PngjExceptionInternal();
                com.identy.e1 e1Var6 = this.onErrorResponse;
                float f2 = e1Var6.CaptureFingersActivity;
                long j3 = e1Var6.toString;
                long j4 = e1Var6.Enroll2IndexActivity;
                byte[] PngjPrematureEnding3 = e1Var6.PngjPrematureEnding();
                com.identy.e1 e1Var7 = this.onErrorResponse;
                identySdk2.a(fingerDetectionMode2, i35, PngjExceptionInternal3, hashMap, f2, f2, f2, j3, j4, PngjPrematureEnding3, e1Var7.setFoundMatchingTemplates + e1Var7.Enroll2IndexActivity);
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            com.identy.e1 e1Var8 = this.onErrorResponse;
            int i36 = e1Var8.getEncryptedTemplates;
            int i37 = (i36 ^ 1) + ((i36 & 1) << 1);
            e1Var8.getEncryptedTemplates = i37;
            if (i37 < i) {
                int i38 = toJson;
                int i39 = ((i38 | 51) << 1) - (i38 ^ 51);
                setFoundMatchingTemplates = i39 % 128;
                if (i39 % 2 == 0) {
                    e1();
                    throw null;
                }
                e1();
            } else {
                Capture2TActivity();
            }
            this.getAsHighestSecurityLevelReached = false;
            return;
        }
        if (z) {
            return;
        }
        int i40 = toJson;
        setFoundMatchingTemplates = ((i40 ^ 45) + ((i40 & 45) << 1)) % 128;
        /* try block with no catch/finally removed */
        com.identy.e1 e1Var10 = this.onErrorResponse;
        int i41 = e1Var10.getEncryptedTemplates;
        int values3 = com.identy.a.PngjException.values();
        int i42 = i41 * 984;
        int i43 = ((-1965) & i42) + (i42 | (-1965));
        int i44 = ~i41;
        int i45 = ((i44 & 1) | (i44 ^ 1)) * 983;
        int i46 = (i43 ^ i45) + ((i45 & i43) << 1);
        int i47 = ~i41;
        int i48 = ~values3;
        int i49 = ((~((i47 & i48) | (i47 ^ i48))) | (-2)) * (-983);
        int i50 = ((i46 | i49) << 1) - (i49 ^ i46);
        int i51 = ~values3;
        int i52 = ~((i51 & (-2)) | ((-2) ^ i51));
        int i53 = ~((i41 & (-2)) | ((-2) ^ i41));
        int i54 = ((i53 & i52) | (i52 ^ i53)) * 983;
        e1Var10.getEncryptedTemplates = (i50 ^ i54) + ((i54 & i50) << 1);
        com.identy.e1 e1Var11 = this.onErrorResponse;
        if (e1Var11.getEncryptedTemplates >= i) {
            int i55 = toJson;
            setFoundMatchingTemplates = ((i55 & 39) + (i55 | 39)) % 128;
            Capture2TActivity();
        } else {
            com.identy.e1.values(new Object[]{e1Var11}, com.identy.i.PngjPrematureEnding.values(), com.identy.i.PngjPrematureEnding.values(), -431637600, com.identy.i.PngjPrematureEnding.values(), 431637601, com.identy.i.PngjPrematureEnding.values());
            PngjException(com.identy.a.PngjException.values(), 843068644, new Object[]{this, Boolean.FALSE}, com.identy.a.PngjException.values(), -843068625, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
        }
    }

    @Override // com.identy.d.PngjBadSignature
    public final void PngjException(int i, boolean z) {
        PngjException(com.identy.a.PngjException.values(), -733430483, new Object[]{this, Integer.valueOf(i), Boolean.valueOf(z)}, com.identy.a.PngjException.values(), 733430499, com.identy.a.PngjException.values(), com.identy.a.PngjException.values());
    }
}
