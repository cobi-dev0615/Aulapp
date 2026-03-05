package com.identy.enums;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import arid.Action;
import arid.PngBadCharsetException;
import arid.AridA;
import arid.chunks.Attempt;
import arid.onErrorResponse;
import com.d.e.a.values;
import com.identy.Fpnative;
import com.identy.Position;
import com.identy.TemplateSize;
import com.identy.WSQCompression;
import com.identy.e1;
import com.identy.enums.Template;
import com.identy.getPadSub1;
import com.identy.getPadSub2;
import com.identy.getPadSub3;
import com.identy.i.PngjOutputException;
import com.identy.i.PngjPrematureEnding;
import com.karumi.dexter.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.ByteCompanionObject;
import org.identy.opencv.android.Utils;
import org.identy.opencv.core.Mat;

/* loaded from: classes2.dex */
public enum Template {
    WSQ(new PngjPrematureEnding()),
    ISO_19794_4(new PngjOutputException() { // from class: com.identy.i.PngjBadCrcException
        @Override // com.identy.i.PngjOutputException
        public final byte[] PngjBadCrcException(Template template, getPadSub3 getpadsub3, Activity activity, long j, TemplateSize templateSize, WSQCompression wSQCompression) {
            super.PngjBadCrcException(template, getpadsub3, activity, j, templateSize, wSQCompression);
            try {
                return Fpnative.generateT(e1.values, new Mat(Mat.n_clone(getpadsub3.values(templateSize).PngjException)).PngjException, Template.ISO_19794_4.ordinal(), Position.getFromHandFinger(new Pair(getpadsub3.PngjException, getpadsub3.PngjBadCrcException)).ordinal(), (float) wSQCompression.getCompression());
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }),
    PNG_8(new PngjOutputException() { // from class: com.identy.i.PngjInputException
        @Override // com.identy.i.PngjOutputException
        public final byte[] PngjBadCrcException(Template template, getPadSub3 getpadsub3, Activity activity, long j, TemplateSize templateSize, WSQCompression wSQCompression) {
            super.PngjBadCrcException(template, getpadsub3, activity, j, templateSize, wSQCompression);
            Mat values = getpadsub3.values(templateSize);
            Bitmap createBitmap = Bitmap.createBitmap(Mat.n_cols(values.PngjException), Mat.n_rows(values.PngjException), Bitmap.Config.ARGB_8888);
            Utils.PngjBadSignature(values, createBitmap);
            createBitmap.compress(Bitmap.CompressFormat.PNG, 100, new ByteArrayOutputStream());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            getPadSub1 getpadsub1 = new getPadSub1(createBitmap);
            Action action = new Action(getpadsub1.values, getpadsub1.PngjBadSignature);
            onErrorResponse onerrorresponse = new onErrorResponse(byteArrayOutputStream, action);
            Attempt attempt = onerrorresponse.values;
            arid.chunks.PngjPrematureEnding pngjPrematureEnding = new arid.chunks.PngjPrematureEnding(attempt.PngjBadSignature.PngjException);
            pngjPrematureEnding.PngjExceptionInternal = 1;
            pngjPrematureEnding.PngjInputException = 19685L;
            pngjPrematureEnding.PngjUnsupportedException = 19685L;
            arid.chunks.values valuesVar = (arid.chunks.values) attempt.PngjBadSignature;
            arid.chunks.valueOf.PngjBadCrcException(valuesVar.values, new Attempt.PngjException(attempt, pngjPrematureEnding));
            valuesVar.values.add(pngjPrematureEnding);
            int i = 0;
            while (i < getpadsub1.PngjBadSignature) {
                PngBadCharsetException pngBadCharsetException = new PngBadCharsetException(action);
                int i2 = 0;
                while (true) {
                    int i3 = getpadsub1.values;
                    if (i2 >= i3) {
                        break;
                    }
                    pngBadCharsetException.values[i2] = (byte) Color.red(getpadsub1.PngjException[(i3 * i) + i2] & 16777215);
                    i2++;
                }
                int i4 = onerrorresponse.PngjBadCrcException + 1;
                onerrorresponse.PngjBadCrcException = i4;
                int i5 = onerrorresponse.PngjException.valueOf;
                if (i4 == i5) {
                    onerrorresponse.PngjBadCrcException = 0;
                }
                int i6 = i == i5 ? 0 : i;
                if (i6 >= 0 && onerrorresponse.PngjBadCrcException != i6) {
                    StringBuilder sb = new StringBuilder("rows must be written in order: expected:");
                    sb.append(onerrorresponse.PngjBadCrcException);
                    sb.append(" passed:");
                    sb.append(i6);
                    throw new arid.PngjOutputException(sb.toString());
                }
                if (onerrorresponse.PngjBadCrcException == 0) {
                    onerrorresponse.PngjUnsupportedException++;
                }
                if (i6 == 0 && onerrorresponse.PngjUnsupportedException == 1) {
                    arid.a.PngjException pngjException = onerrorresponse.PngjPrematureEnding;
                    OutputStream outputStream = onerrorresponse.PngjInputException;
                    pngjException.PngjExceptionInternal = outputStream;
                    pngjException.PngjInputException = 0;
                    AridA.PngjBadCrcException(outputStream, AridA.PngjBadSignature());
                    onerrorresponse.PngjBadSignature = 0;
                    arid.chunks.PngjOutputException pngjOutputException = new arid.chunks.PngjOutputException(onerrorresponse.PngjException);
                    pngjOutputException.values().PngjBadCrcException(onerrorresponse.PngjInputException);
                    onerrorresponse.valueOf.valueOf.add(pngjOutputException);
                    if (onerrorresponse.PngjBadSignature < 4) {
                        onerrorresponse.PngjBadSignature = 1;
                        onerrorresponse.valueOf.PngjException(onerrorresponse.PngjInputException, 1);
                        onerrorresponse.PngjBadSignature = 2;
                        int PngjException = onerrorresponse.valueOf.PngjException(onerrorresponse.PngjInputException, 2);
                        if (PngjException > 0 && onerrorresponse.PngjException.PngjBadSignature) {
                            throw new arid.PngjOutputException("cannot write palette for this format");
                        }
                        if (PngjException == 0) {
                            boolean z = onerrorresponse.PngjException.PngjExceptionInternal;
                        }
                        onerrorresponse.PngjBadSignature = 3;
                        onerrorresponse.valueOf.PngjException(onerrorresponse.PngjInputException, 3);
                    }
                    onerrorresponse.PngjBadSignature = 4;
                }
                byte[] values2 = onerrorresponse.PngjPrematureEnding.values();
                pngBadCharsetException.PngjBadSignature(values2);
                onerrorresponse.PngjPrematureEnding.PngjBadCrcException(values2);
                i++;
            }
            onerrorresponse.PngjBadCrcException();
            createBitmap.recycle();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                return byteArray;
            } catch (IOException e) {
                e.printStackTrace();
                return byteArray;
            }
        }
    }),
    PNG(new PngjOutputException() { // from class: com.identy.i.PngjExceptionInternal
        @Override // com.identy.i.PngjOutputException
        public final byte[] PngjBadCrcException(Template template, getPadSub3 getpadsub3, Activity activity, long j, TemplateSize templateSize, WSQCompression wSQCompression) {
            super.PngjBadCrcException(template, getpadsub3, activity, j, templateSize, wSQCompression);
            Mat values = getpadsub3.values(templateSize);
            Bitmap createBitmap = Bitmap.createBitmap(Mat.n_cols(values.PngjException), Mat.n_rows(values.PngjException), Bitmap.Config.ARGB_8888);
            Utils.PngjBadSignature(values, createBitmap);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                return byteArray;
            } catch (IOException e) {
                e.printStackTrace();
                return byteArray;
            }
        }
    }),
    JPEG_2000(null),
    JPEG(null),
    RAW(new PngjOutputException() { // from class: com.identy.i.PngjUnsupportedException
        @Override // com.identy.i.PngjOutputException
        public final byte[] PngjBadCrcException(Template template, getPadSub3 getpadsub3, Activity activity, long j, TemplateSize templateSize, WSQCompression wSQCompression) {
            super.PngjBadCrcException(template, getpadsub3, activity, j, templateSize, wSQCompression);
            try {
                try {
                    return Fpnative.generateT(e1.values, new Mat(Mat.n_clone(getpadsub3.values(templateSize).PngjException)).PngjException, Template.RAW.ordinal(), Position.getFromHandFinger(new Pair(getpadsub3.PngjException, getpadsub3.PngjBadCrcException)).ordinal(), (float) wSQCompression.getCompression());
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            } catch (Exception unused) {
                return null;
            }
        }
    }),
    ISO_19794_2(new PngjOutputException() { // from class: com.identy.i.valueOf
        @Override // com.identy.i.PngjOutputException
        public final byte[] PngjBadCrcException(Template template, getPadSub3 getpadsub3, Activity activity, long j, TemplateSize templateSize, WSQCompression wSQCompression) {
            super.PngjBadCrcException(template, getpadsub3, activity, j, templateSize, wSQCompression);
            try {
                return Fpnative.generateT(e1.values, new Mat(Mat.n_clone(getpadsub3.values(templateSize).PngjException)).PngjException, Template.ISO_19794_2.ordinal(), Position.getFromHandFinger(new Pair(getpadsub3.PngjException, getpadsub3.PngjBadCrcException)).ordinal(), (float) wSQCompression.getCompression());
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }),
    ANSI_378_2004(new PngjOutputException() { // from class: com.identy.i.values
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static int PngjBadCrcException;
        private static int PngjBadSignature;
        private static int PngjException;
        private static int PngjExceptionInternal;
        private static long PngjInputException;
        private static int PngjOutputException;
        private static char PngjPrematureEnding;
        private static int PngjUnsupportedException;
        private static byte[] valueOf;
        private static short[] values;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$e(byte b2, byte b3, byte b4) {
            int i;
            int i2;
            int i3;
            int i4 = 1 - (b3 * 4);
            int i5 = (b2 * 4) + 4;
            int i6 = 118 - b4;
            byte[] bArr = $$c;
            byte[] bArr2 = new byte[i4];
            if (bArr == null) {
                i = i5;
                int i7 = i4;
                i3 = 0;
                i5 += i7;
                i++;
                i2 = i3;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i3 == i4) {
                    return new String(bArr2, 0);
                }
                i7 = bArr[i];
                i5 += i7;
                i++;
                i2 = i3;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i3 == i4) {
                }
            } else {
                i = i5;
                i5 = i6;
                i2 = 0;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i3 == i4) {
                }
            }
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            PngjExceptionInternal = 0;
            PngjOutputException = 1;
            PngjException = 1239517161;
            PngjBadCrcException = -961251458;
            PngjBadSignature = 2013549687;
            valueOf = new byte[]{-108, 70, -73, 106, -71, 75, -108, 78, 65, -65, 65, 119, -68, -94, 92, -78, 74, -93, 66, -65, 8, -124, -76, -75, -78, 65, -71, 66, 124, -7, 70, 66, -76, 118, -114, -79, 67, 123, -127, -94, 92, -78, 122, -127, -94, 92, -78, 122, -74, -72, 8, -123, 77, 77, -66, -78, 10, -115, 68, -93, 94, 121, -123, -76, -75, -78, 65, -71, 66, 124, -122, -72, -80, 76, 70, 122, -114, -79, 67, 123, -127, -94, 92, -78, 122, -127, -94, 92, -78, 122, -87, -77, 92, -66, 73, -80, 99, 90, -11, 73, 70, -66, 73, -80, 67, 122, -123, -76, -75, -78, 65, -71, 66, -110, -73, 67, 92, -90, -79, 73, -71, 71, 77, 94, -109, 64, -79, -82, 70, -73, 106, -108, -80, 73, -70, 92, -79, -75, -78, -77, 79, 96, -126, 64, -79, -97, -99, 96, -100, -98, -70, -112, 76, -77, -68, 69, 91, 105, -120, -74, 66, -70, 113, -126, -92, 90, -72, -101, 77, 94, -94, 78, -101, 68, -88, -67, -80, -101, 68, 79, -74, -74, -100, 74, -75, 74, -91, -12, 79, 65, 77, -69, -78, 77, 31, -16, 14, -12, -66, 92, -77, -68, 64, 12, -2, -76, 27, -13, -80, -74, 76, 71, 84, -83, -122, -74, 74, -73, 79, 71, 118, -114, -79, 67, 102, -102, -79, 73, -71, 71, 77, -66, -97, -109, 89, -75, -78, -78, -80, 94, -75, 77, -75, -68, 94, 78, -112, 77, -75, -68, 75, 66, 93, -87, 71, -66, 78, -75, 105, -112, 64, -79, -69, 66, -79, 73, -68, 66, 91, -101, 89, -75, -78, -78, 80, -92, 77, -75, -68, 94, 110, 89, -113, 74, -77, 70, 76, 124, -15, 79, 64, 124, -123, -76, -75, -78, 65, -71, 66, -93, -73, 67, 92, -107, 73, 70, -72, -80, -80, 76, -79, 99, 90, -11, 73, 70, -66, 73, -80, 67, 122, -123, -76, -75, -78, 65, -71, 66, -81, 79, 96, ByteCompanionObject.MIN_VALUE, 66, -72, -72, 103, -91, -74, 76, 76, -72, -78, 109, -110, 69};
            PngjInputException = -4677903791971513060L;
            PngjUnsupportedException = 30656739;
            PngjPrematureEnding = (char) 51427;
        }

        /* JADX WARN: Code restructure failed: missing block: B:242:0x1478, code lost:
        
            r37.close();
         */
        /* JADX WARN: Removed duplicated region for block: B:254:0x164a A[Catch: all -> 0x1639, Exception -> 0x195e, TryCatch #6 {Exception -> 0x195e, blocks: (B:233:0x1253, B:252:0x163c, B:254:0x164a, B:255:0x1691, B:257:0x16a7, B:258:0x16ef, B:321:0x1920, B:331:0x1926, B:333:0x192c, B:334:0x192d, B:341:0x193a, B:343:0x1940, B:344:0x1941, B:354:0x1949, B:356:0x194f, B:357:0x1950, B:362:0x1951, B:364:0x1957, B:365:0x1958), top: B:232:0x1253 }] */
        /* JADX WARN: Removed duplicated region for block: B:257:0x16a7 A[Catch: all -> 0x1639, Exception -> 0x195e, TryCatch #6 {Exception -> 0x195e, blocks: (B:233:0x1253, B:252:0x163c, B:254:0x164a, B:255:0x1691, B:257:0x16a7, B:258:0x16ef, B:321:0x1920, B:331:0x1926, B:333:0x192c, B:334:0x192d, B:341:0x193a, B:343:0x1940, B:344:0x1941, B:354:0x1949, B:356:0x194f, B:357:0x1950, B:362:0x1951, B:364:0x1957, B:365:0x1958), top: B:232:0x1253 }] */
        /* JADX WARN: Removed duplicated region for block: B:262:0x173a A[Catch: all -> 0x1639, IOException -> 0x19c0, TryCatch #10 {, blocks: (B:199:0x0fab, B:202:0x0fda, B:205:0x104c, B:211:0x10cb, B:217:0x111a, B:233:0x1253, B:251:0x1635, B:252:0x163c, B:254:0x164a, B:255:0x1691, B:257:0x16a7, B:258:0x16ef, B:260:0x1700, B:262:0x173a, B:264:0x1799, B:266:0x17c7, B:268:0x17ea, B:270:0x1879, B:273:0x1881, B:320:0x191d, B:321:0x1920, B:325:0x195e, B:326:0x19b2, B:331:0x1926, B:333:0x192c, B:334:0x192d, B:341:0x193a, B:343:0x1940, B:344:0x1941, B:354:0x1949, B:356:0x194f, B:357:0x1950, B:362:0x1951, B:364:0x1957, B:365:0x1958), top: B:198:0x0fab }] */
        /* JADX WARN: Removed duplicated region for block: B:343:0x1940 A[Catch: all -> 0x1639, Exception -> 0x195e, TryCatch #6 {Exception -> 0x195e, blocks: (B:233:0x1253, B:252:0x163c, B:254:0x164a, B:255:0x1691, B:257:0x16a7, B:258:0x16ef, B:321:0x1920, B:331:0x1926, B:333:0x192c, B:334:0x192d, B:341:0x193a, B:343:0x1940, B:344:0x1941, B:354:0x1949, B:356:0x194f, B:357:0x1950, B:362:0x1951, B:364:0x1957, B:365:0x1958), top: B:232:0x1253 }] */
        /* JADX WARN: Removed duplicated region for block: B:344:0x1941 A[Catch: all -> 0x1639, Exception -> 0x195e, TryCatch #6 {Exception -> 0x195e, blocks: (B:233:0x1253, B:252:0x163c, B:254:0x164a, B:255:0x1691, B:257:0x16a7, B:258:0x16ef, B:321:0x1920, B:331:0x1926, B:333:0x192c, B:334:0x192d, B:341:0x193a, B:343:0x1940, B:344:0x1941, B:354:0x1949, B:356:0x194f, B:357:0x1950, B:362:0x1951, B:364:0x1957, B:365:0x1958), top: B:232:0x1253 }] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x1a68 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x1a69  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object[] PngjBadSignature(Context context, int i, int i2, int i3) {
            int i4;
            int i5;
            Object invoke;
            int i6;
            int i7;
            Object[] objArr;
            char c;
            char c2;
            Object[] objArr2;
            int i8;
            Object[] objArr3;
            char c3;
            Object[] objArr4;
            int i9;
            Object[] objArr5;
            char c4;
            int length;
            String str;
            int i10;
            String[] split;
            int length2;
            int i11;
            String str2;
            String[] strArr;
            int i12;
            int i13;
            Runtime runtime;
            short s;
            int trimmedLength;
            int i14;
            Process process;
            Object newInstance;
            Object newInstance2;
            Throwable cause;
            DataOutputStream dataOutputStream;
            long j;
            Object PngjBadSignature2;
            Object PngjBadSignature3;
            int length3;
            int i15;
            String[] strArr2;
            String str3;
            int i16;
            int i17;
            String str4;
            String str5;
            int i18;
            int i19;
            Object[] objArr6;
            char c5;
            Object[] objArr7;
            int i20;
            Object[] objArr8;
            int i21;
            int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
            int i22 = -(-MotionEvent.axisFromString(BuildConfig.FLAVOR));
            Object[] objArr9 = new Object[1];
            a("꿷펪砢䗊", doubleTapTimeout, (char) ((i22 ^ 1) + ((i22 & 1) << 1)), "\u05ff⯆ࡘ뚤", "葭マᢴ첛梹᧒㴮盟\ue8a4뫤쭁㡆㇇粟\ue9ee싫댂\ue1fc덀갠㶊衹ꁎε\ue41d谅銒㶧\ue2ec벰\ue298赙햞멯", objArr9);
            String str6 = (String) objArr9[0];
            Object[] objArr10 = new Object[1];
            a("哅ꥮ뮚ﳷ", (-1700172204) - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), "\u05ff⯆ࡘ뚤", "霟뻻\ue66d舘꓆㶗婭", objArr10);
            String str7 = (String) objArr10[0];
            short absoluteGravity = (short) Gravity.getAbsoluteGravity(0, 0);
            int i23 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i24 = ((i23 | 1095753010) << 1) - (i23 ^ 1095753010);
            int i25 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
            int i26 = (i25 ^ 1890193393) + ((i25 & 1890193393) << 1);
            byte keyRepeatTimeout = (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int green = Color.green(0);
            int i27 = (green ^ (-50)) + ((green & (-50)) << 1);
            Object[] objArr11 = new Object[1];
            b(absoluteGravity, i24, i26, keyRepeatTimeout, i27, objArr11);
            String str8 = (String) objArr11[0];
            int i28 = 32;
            int i29 = 2;
            try {
                if (context == null) {
                    short jumpTapTimeout = (short) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int i30 = 1095752949 - (~(-(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))));
                    int i31 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    Object[] objArr12 = new Object[1];
                    b(jumpTapTimeout, i30, (i31 ^ 1890193243) + ((i31 & 1890193243) << 1), (byte) (ViewConfiguration.getTouchSlop() >> 8), View.combineMeasuredStates(0, 0) - 50, objArr12);
                    Object[] objArr13 = {(String) objArr12[0]};
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1934049891);
                    if (PngjBadSignature4 == null) {
                        char c6 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                        int scrollDefaultDelay = 28 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int argb = Color.argb(0, 0, 0, 0) + 1447;
                        byte[] bArr = $$a;
                        byte b2 = (byte) (-bArr[13]);
                        i19 = 16;
                        Object[] objArr14 = new Object[1];
                        c(b2, (byte) (b2 - 2), (byte) (-bArr[18]), objArr14);
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c6, scrollDefaultDelay, argb, -1884803112, false, (String) objArr14[0], new Class[]{String.class});
                    } else {
                        i19 = 16;
                    }
                    long longValue = ((Long) ((Method) PngjBadSignature4).invoke(null, objArr13)).longValue();
                    long j2 = -1040275732;
                    long j3 = 433;
                    long j4 = -1;
                    long j5 = j2 ^ j4;
                    long j6 = i;
                    long j7 = j6 ^ j4;
                    long j8 = (((((j5 | j6) ^ j4) | ((j2 | longValue) ^ j4)) * j3) + (((-433) * (j5 | (((longValue ^ j4) | j6) ^ j4))) + (((((j5 | j7) | longValue) ^ j4) * j3) + ((434 * longValue) + ((-432) * j2))))) - 676641535;
                    int i32 = (((~((-701328350) | i)) | (-735898062)) * (-964)) - 1823205850;
                    int i33 = ~i;
                    if (((((int) j8) & ((((~(2079322110 | i33)) | (~((-1477190099) | i))) * 318) + (((~(2039358422 | i)) | (~((-1477190099) | i33))) * 318) + (((~((-602132013) | i)) | 2039358422) * (-318)) + 1038109199)) | (((int) (j8 >> 32)) & ((((~((-701328350) | i33)) | 66064) * (-964)) + i32))) != 0) {
                        objArr6 = new Object[]{null, null, new int[]{r5}, new int[]{i}, new int[1]};
                        int i34 = (~(i & 50)) & (i | 50);
                        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                        int i35 = (((~(65447144 | startElapsedRealtime)) | 558910225) * 672) + 2099099577;
                        int i36 = ~startElapsedRealtime;
                        int i37 = (((~((-558910226) | i36)) | 537938705) * 672) + (((~(startElapsedRealtime | 558910225)) | (~((-65447145) | i36))) * (-672)) + i35;
                        int i38 = (i37 & 16) + (i37 | 16) + i3;
                        int i39 = i38 << 13;
                        int i40 = (i38 | i39) & (~(i38 & i39));
                        int i41 = i40 ^ (i40 >>> 17);
                        ((int[]) objArr6[4])[0] = i41 ^ (i41 << 5);
                    } else {
                        objArr6 = new Object[]{null, null, new int[]{i}, new int[]{i}, new int[]{((~r1) & r4) | ((~r4) & r1)}};
                        int i42 = ((~((-268992965) | i33)) * 501) + ((((~((-268992965) | i)) | 8392241) * 501) - 906676864);
                        int i43 = (i3 & i42) + (i42 | i3);
                        int i44 = i43 << 13;
                        int i45 = (i43 | i44) & (~(i43 & i44));
                        int i46 = i45 >>> 17;
                        int i47 = (i45 | i46) & (~(i45 & i46));
                        int i48 = i47 << 5;
                    }
                    if (((int[]) objArr6[2])[0] != i) {
                        return objArr6;
                    }
                    Object[] objArr15 = new Object[1];
                    a("棖壗뺀傋", ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) (Process.myPid() >> 22), "\u05ff⯆ࡘ뚤", "윲缝寷砍\u2e71鯅紵ꮖ᪢䐝駲냵겨味蠱ტٽ煉Ƈ蛻", objArr15);
                    Object[] objArr16 = {(String) objArr15[0]};
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1934049891);
                    if (PngjBadSignature5 == null) {
                        char c7 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int lastIndexOf = TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 29;
                        int makeMeasureSpec = 1447 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        byte[] bArr2 = $$a;
                        byte b3 = (byte) (-bArr2[13]);
                        c5 = '0';
                        Object[] objArr17 = new Object[1];
                        c(b3, (byte) (b3 - 2), (byte) (-bArr2[18]), objArr17);
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c7, lastIndexOf, makeMeasureSpec, -1884803112, false, (String) objArr17[0], new Class[]{String.class});
                    } else {
                        c5 = '0';
                    }
                    long longValue2 = ((Long) ((Method) PngjBadSignature5).invoke(null, objArr16)).longValue();
                    long j9 = -1406183604;
                    long j10 = ((-859) * (j9 | j6)) + ((-858) * longValue2) + (860 * j9);
                    long j11 = 859;
                    long j12 = longValue2 ^ j4;
                    long j13 = ((j11 * (((j12 | j9) ^ j4) | ((j12 | j7) ^ j4))) + (((((j7 | j9) ^ j4) | ((((j9 ^ j4) | j12) | j6) ^ j4)) * j11) + j10)) - 310733663;
                    int i49 = ((int) (j13 >> 32)) & ((((~(263085876 | i33)) | (-1878982656) | (~((-84415509) | i))) * 168) + ((~((-1615896780) | i)) * 168) + (((~((-1700312288) | i33)) | 1615896779) * 168) + 501358106);
                    int i50 = ~((int) Process.getStartUptimeMillis());
                    if ((i49 | (((int) j13) & ((((~(i50 | (-268541954))) | 1166540800) * 241) + (((~((-979871020) | i50)) | 711329066) * (-241)) + 525895391))) != 0) {
                        objArr7 = new Object[]{null, null, new int[]{(i & (-61)) | (i33 & 60)}, new int[]{i}, new int[]{(r1 | r4) & (~(r1 & r4))}};
                        int i51 = -(-defpackage.a.A(436659936 | (~((-1061017307) | i)) | (~(i33 | 1061017306)), 45, (((~(436659936 | i)) | 139296) * (-45)) + ((((~(436659936 | i33)) | 1061017306) * (-90)) - 1344332098), -16));
                        int i52 = (i3 & i51) + (i51 | i3);
                        int i53 = i52 << 13;
                        int i54 = (i53 | i52) & (~(i52 & i53));
                        int i55 = i54 ^ (i54 >>> 17);
                        int i56 = i55 << 5;
                        i20 = 0;
                    } else {
                        objArr7 = new Object[]{null, null, new int[]{i}, new int[]{i}, new int[]{r1}};
                        int d = defpackage.a.d((~(232990691 | i33)) | (-447803382), 381, (((-303089685) | i) * (-381)) + 412648466, -486947388, i3);
                        int i57 = d << 13;
                        int i58 = ((~d) & i57) | ((~i57) & d);
                        int i59 = i58 >>> 17;
                        int i60 = ((~i58) & i59) | ((~i59) & i58);
                        int i61 = i60 << 5;
                        int i62 = ((~i60) & i61) | ((~i61) & i60);
                        i20 = 0;
                    }
                    if (((int[]) objArr7[2])[i20] != i) {
                        return objArr7;
                    }
                    short absoluteGravity2 = (short) Gravity.getAbsoluteGravity(i20, i20);
                    int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                    int i63 = (maximumDrawingCacheSize * (-958)) - 1759306834;
                    int i64 = ~i;
                    int i65 = ~(((-1095752952) & i64) | ((-1095752952) ^ i64));
                    int i66 = ~maximumDrawingCacheSize;
                    int i67 = ~((i66 & i) | (i66 ^ i));
                    int i68 = (i65 & i67) | (i65 ^ i67);
                    int i69 = ~(i64 | maximumDrawingCacheSize);
                    int i70 = -(-(((i69 & i68) | (i68 ^ i69)) * 959));
                    int i71 = (i63 ^ i70) + ((i63 & i70) << 1);
                    int i72 = (~((1095752951 & maximumDrawingCacheSize) | (maximumDrawingCacheSize ^ 1095752951))) * (-959);
                    int i73 = (i71 ^ i72) + ((i72 & i71) << 1);
                    int i74 = ~maximumDrawingCacheSize;
                    int i75 = ~((i74 & i33) | (i74 ^ i33));
                    int i76 = ~((-1095752952) | i);
                    int i77 = (((~((maximumDrawingCacheSize & i) | (maximumDrawingCacheSize ^ i))) | (i75 & i76) | (i75 ^ i76)) * 959) + i73;
                    char mirror = AndroidCharacter.getMirror(c5);
                    int i78 = (mirror & 3894) + (mirror | 3894);
                    byte b4 = (byte) (0 - (~(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))));
                    int i79 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i80 = ((i79 | (-50)) << 1) - (i79 ^ (-50));
                    Object[] objArr18 = new Object[1];
                    b(absoluteGravity2, i77, i78, b4, i80, objArr18);
                    Object[] objArr19 = {(String) objArr18[0]};
                    Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1142218481);
                    if (PngjBadSignature6 == null) {
                        char mode = (char) View.MeasureSpec.getMode(0);
                        int i81 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 28;
                        int deadChar = 1447 - KeyEvent.getDeadChar(0, 0);
                        byte b5 = $$a[18];
                        byte b6 = (byte) (b5 - 1);
                        Object[] objArr20 = new Object[1];
                        c(b6, (byte) (b6 | 15), b5, objArr20);
                        PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(mode, i81, deadChar, 1191464116, false, (String) objArr20[0], new Class[]{String.class});
                    }
                    long longValue3 = ((Long) ((Method) PngjBadSignature6).invoke(null, objArr19)).longValue();
                    long j14 = -1677952297;
                    long j15 = -712;
                    long j16 = longValue3 ^ j4;
                    long j17 = (j7 | j14) ^ j4;
                    long j18 = ((712 * (j16 | j17)) + ((j15 * ((((longValue3 | j14) | j6) ^ j4) | (((j16 | j7) | j14) ^ j4))) + (((((j16 | j14) ^ j4) | j17) * j15) + ((713 * longValue3) + ((-711) * j14))))) - 278045580;
                    int c8 = ((int) (j18 >> 32)) & defpackage.a.c((~((-1516057117) | i)) | 1247293464 | (~((-1341683769) | i)), -1444, (((-363153957) | i33) * 1444) - 1153123274, 204151176);
                    int startUptimeMillis = (int) Process.getStartUptimeMillis();
                    int i82 = ((int) j18) & ((((~(startUptimeMillis | (-679757825))) | (-2130640351)) * 366) + (((~((-686585883) | startUptimeMillis)) | (-2123812293)) * (-366)) + 1061842817);
                    if (((i82 & c8) | (c8 ^ i82)) != 0) {
                        objArr8 = new Object[]{null, null, new int[]{(i & (-81)) | (i33 & 80)}, new int[]{i}, new int[1]};
                        int i83 = ~defpackage.a.a();
                        int i84 = (i3 - (~defpackage.a.A((~(i83 | 521933041)) | (-419876858), 184, (((-184073) | i83) * 184) + 572288097, -16))) - 1;
                        int i85 = i84 ^ (i84 << 13);
                        int i86 = i85 >>> 17;
                        int i87 = (i85 | i86) & (~(i85 & i86));
                        int i88 = i87 << 5;
                        ((int[]) objArr8[4])[0] = (i87 | i88) & (~(i87 & i88));
                        i21 = 0;
                    } else {
                        objArr8 = new Object[]{null, null, new int[]{i}, new int[]{i}, new int[]{r1}};
                        int c9 = defpackage.a.c(601743343 | i, 220, (((~(56449547 | i33)) | 567907822) * (-440)) + (((~(601743343 | i33)) | 22614026) * 220) + 1476028173, i3);
                        int i89 = c9 << 13;
                        int i90 = ((~c9) & i89) | ((~i89) & c9);
                        int i91 = i90 >>> 17;
                        int i92 = ((~i90) & i91) | ((~i91) & i90);
                        int i93 = i92 << 5;
                        int i94 = (i92 | i93) & (~(i92 & i93));
                        i21 = 0;
                    }
                    if (((int[]) objArr8[2])[i21] != i) {
                        return objArr8;
                    }
                    int i95 = -(-TextUtils.indexOf(BuildConfig.FLAVOR, c5, i21, i21));
                    int i96 = -TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, i21);
                    int i97 = (i96 ^ 1095752951) + ((i96 & 1095752951) << 1);
                    int i98 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                    int i99 = i98 * 714;
                    int i100 = (i99 & (-1492858832)) + (i99 | (-1492858832));
                    int i101 = ~i98;
                    int i102 = ~((i101 ^ i33) | (i101 & i33));
                    int i103 = ~((i101 & 1890193290) | (i101 ^ 1890193290));
                    int i104 = (i103 & i102) | (i102 ^ i103);
                    int i105 = (-1890193291) | i98;
                    int i106 = ~((i105 & i) | (i105 ^ i));
                    int i107 = (i100 - (~(((i104 & i106) | (i104 ^ i106)) * (-713)))) - 1;
                    int i108 = (i98 & (-1890193291)) | ((-1890193291) ^ i98);
                    int i109 = (~((i108 & i) | (i108 ^ i))) * 1426;
                    int i110 = (i107 & i109) + (i109 | i107);
                    int i111 = (~(((-1890193291) ^ i33) | ((-1890193291) & i33))) * 713;
                    Object[] objArr21 = new Object[1];
                    b((short) (((i95 | 1) << 1) - (i95 ^ 1)), i97, ((i110 | i111) << 1) - (i111 ^ i110), (byte) TextUtils.getTrimmedLength(BuildConfig.FLAVOR), Gravity.getAbsoluteGravity(0, 0) - 50, objArr21);
                    Object[] objArr22 = {(String) objArr21[0]};
                    Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1142218481);
                    if (PngjBadSignature7 == null) {
                        char c10 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 28;
                        int threadPriority = 1447 - ((Process.getThreadPriority(0) + 20) >> 6);
                        byte b7 = $$a[18];
                        byte b8 = (byte) (b7 - 1);
                        Object[] objArr23 = new Object[1];
                        c(b8, (byte) (b8 | 15), b7, objArr23);
                        PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c10, edgeSlop, threadPriority, 1191464116, false, (String) objArr23[0], new Class[]{String.class});
                    }
                    long longValue4 = ((Long) ((Method) PngjBadSignature7).invoke(null, objArr22)).longValue();
                    long j19 = 5523017;
                    long j20 = 130;
                    long j21 = longValue4 ^ j4;
                    long a = defpackage.a.a();
                    long j22 = ((((j21 | (a ^ j4)) | j19) ^ j4) * j20) + (131 * longValue4) + ((-129) * j19);
                    long j23 = j21 | j19;
                    long j24 = ((j20 * (((longValue4 | (j19 ^ j4)) ^ j4) | ((j23 | a) ^ j4))) + (((-260) * (j23 ^ j4)) + j22)) - 1961520894;
                    int i112 = ~(defpackage.a.b(365252855) | (-933472080));
                    int i113 = ((int) (j24 >> 32)) & (((i112 | (-2008262480)) * 196) + ((1074790400 | i112) * (-196)) + 125202154);
                    int maxMemory = (int) Runtime.getRuntime().maxMemory();
                    int i114 = ((int) j24) & ((((~(maxMemory | (-1357520572))) | (~((~maxMemory) | 1357520571)) | (~(79705838 | maxMemory))) * 959) + (((((~(79705838 | r5)) | (~(1357520571 | maxMemory))) | (~(r5 | (-1357520572)))) * 959) - 1009275116));
                    if (((i113 & i114) | (i113 ^ i114)) == 0) {
                        Object[] objArr24 = {null, null, new int[]{i}, new int[]{i}, new int[]{r1 ^ (r1 << 5)}};
                        int c11 = defpackage.a.c((~(i | (-4524306))) | (~((-347666153) | i33)) | 75499240, 497, (((~((-272166913) | i)) | (~((-4524306) | i33))) * 497) + 1679359376, i3);
                        int i115 = c11 << 13;
                        int i116 = ((~c11) & i115) | ((~i115) & c11);
                        int i117 = i116 >>> 17;
                        int i118 = (i116 | i117) & (~(i116 & i117));
                        return objArr24;
                    }
                    Object[] objArr25 = {null, null, new int[]{i ^ 90}, new int[]{i}, new int[]{(r1 | r2) & (~(r1 & r2))}};
                    int c12 = defpackage.a.c(70320580 | (~(i | (-281214508))) | (~(281214507 | i33)), 988, (((~(343142862 | i33)) | 8392225) * (-1976)) + (((i | 70320580) * 988) - 154046499), i19);
                    int i119 = (i3 & c12) + (c12 | i3);
                    int i120 = i119 << 13;
                    int i121 = (i120 | i119) & (~(i119 & i120));
                    int i122 = i121 ^ (i121 >>> 17);
                    int i123 = i122 << 5;
                    return objArr25;
                }
                try {
                    short absoluteGravity3 = (short) Gravity.getAbsoluteGravity(0, 0);
                    int i124 = 1095753001 - (~TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0));
                    int i125 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int i126 = ((i125 | 1890193331) << 1) - (i125 ^ 1890193331);
                    int i127 = -(-Process.getGidForName(BuildConfig.FLAVOR));
                    int i128 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int values2 = getPadSub2.values();
                    int i129 = i128 * (-381);
                    int i130 = ((i129 | (-9792)) << 1) - (i129 ^ (-9792));
                    int i131 = ~i128;
                    int i132 = -(-(i131 * (-191)));
                    int i133 = (i130 ^ i132) + ((i132 & i130) << 1);
                    int i134 = ~((values2 ^ (-51)) | (values2 & (-51)));
                    int i135 = (i133 - (~(-(-(((i128 ^ i134) | (i128 & i134)) * 191))))) - 1;
                    int i136 = ~((i131 ^ (-51)) | (i131 & (-51)));
                    int i137 = ~values2;
                    int i138 = ~((i137 & (-51)) | (i137 ^ (-51)));
                    int i139 = ((i136 & i138) | (i136 ^ i138)) * 191;
                    int i140 = ((i135 | i139) << 1) - (i135 ^ i139);
                    Object[] objArr26 = new Object[1];
                    b(absoluteGravity3, i124, i126, (byte) ((i127 & 1) + (i127 | 1)), i140, objArr26);
                    Class<?> cls = Class.forName((String) objArr26[0]);
                    short packedPositionType = (short) ExpandableListView.getPackedPositionType(0L);
                    int i141 = -Gravity.getAbsoluteGravity(0, 0);
                    int i142 = (i141 & 1095753007) + (i141 | 1095753007);
                    int i143 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int i144 = i143 * 46;
                    int i145 = ((i144 | 1049548364) << 1) - (i144 ^ 1049548364);
                    i4 = ~i;
                    int i146 = ~((-1890193355) | i4);
                    int i147 = ((i143 ^ i146) | (i146 & i143)) * (-90);
                    int i148 = (i145 ^ i147) + ((i147 & i145) << 1);
                    int i149 = ~(((-1890193355) ^ i) | ((-1890193355) & i));
                    int i150 = ~((i143 ^ 1890193354) | (i143 & 1890193354));
                    int i151 = -(-(((i149 ^ i150) | (i150 & i149)) * (-45)));
                    int i152 = ((i148 | i151) << 1) - (i148 ^ i151);
                    int i153 = (-1890193355) | (~((~i143) | i));
                    i5 = ~i;
                    int i154 = (i152 - (~(-(-(((~((i5 ^ i143) | (i143 & i5))) | i153) * 45))))) - 1;
                    byte scrollDefaultDelay2 = (byte) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int i155 = -(Process.myPid() >> 22);
                    int i156 = (i155 & (-50)) + (i155 | (-50));
                    Object[] objArr27 = new Object[1];
                    b(packedPositionType, i142, i154, scrollDefaultDelay2, i156, objArr27);
                    String str9 = (String) cls.getMethod((String) objArr27[0], null).invoke(context, null);
                    short combineMeasuredStates = (short) View.combineMeasuredStates(0, 0);
                    int i157 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                    int i158 = ((i157 | 1095753001) << 1) - (i157 ^ 1095753001);
                    int i159 = 1890193331 - (~TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0));
                    byte indexOf = (byte) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                    int i160 = -Process.getGidForName(BuildConfig.FLAVOR);
                    Object[] objArr28 = new Object[1];
                    b(combineMeasuredStates, i158, i159, indexOf, ((i160 | (-51)) << 1) - (i160 ^ (-51)), objArr28);
                    Class<?> cls2 = Class.forName((String) objArr28[0]);
                    short blue = (short) Color.blue(0);
                    int i161 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int i162 = (i161 ^ 1095753008) + ((i161 & 1095753008) << 1);
                    int modifierMetaStateMask = 1890193368 - ((byte) KeyEvent.getModifierMetaStateMask());
                    byte modifierMetaStateMask2 = (byte) KeyEvent.getModifierMetaStateMask();
                    int i163 = -Gravity.getAbsoluteGravity(0, 0);
                    int i164 = (i163 ^ (-50)) + ((i163 & (-50)) << 1);
                    Object[] objArr29 = new Object[1];
                    b(blue, i162, modifierMetaStateMask, (byte) ((modifierMetaStateMask2 & 1) + (modifierMetaStateMask2 | 1)), i164, objArr29);
                    invoke = cls2.getMethod((String) objArr29[0], null).invoke(context, null);
                    int indexOf2 = ((String) defpackage.a.h(str6, str7, invoke)).indexOf(str9);
                    if (indexOf2 > 0) {
                        String str10 = (String) defpackage.a.h(str6, str7, invoke);
                        int length4 = str10.length() - 16;
                        if (length4 >= 0) {
                            int i165 = 0;
                            while (i165 <= length4) {
                                String substring = str10.substring(i165, (i165 ^ 16) + ((i165 & 16) << 1));
                                Object[] objArr30 = new Object[i29];
                                objArr30[1] = 931995;
                                objArr30[0] = substring;
                                Object PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                                if (PngjBadSignature8 == null) {
                                    char red = (char) (11039 - Color.red(0));
                                    int i166 = 31 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                    str4 = str10;
                                    str5 = str8;
                                    int indexOf3 = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 1283;
                                    byte b9 = $$a[18];
                                    i18 = length4;
                                    Object[] objArr31 = new Object[1];
                                    c(b9, r8[16], b9, objArr31);
                                    PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(red, i166, indexOf3, -971849413, false, (String) objArr31[0], new Class[]{String.class, Integer.TYPE});
                                } else {
                                    str4 = str10;
                                    str5 = str8;
                                    i18 = length4;
                                }
                                long longValue5 = ((Long) ((Method) PngjBadSignature8).invoke(null, objArr30)).longValue();
                                long j25 = -1392552803;
                                long j26 = (246 * longValue5) + ((-244) * j25);
                                long j27 = -245;
                                long j28 = -1;
                                long j29 = longValue5 ^ j28;
                                long j30 = i;
                                long j31 = ((((j29 | (j30 ^ j28)) ^ j28) | ((j29 | j25) ^ j28)) * j27) + j26;
                                long j32 = (j29 | j30) ^ j28;
                                long j33 = (245 * (j25 | j32)) + (j27 * j32) + j31 + 2048260503;
                                int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                                int i167 = ((int) (j33 >> 32)) & ((((~(startUptimeMillis2 | (-1221753672))) | 693195850) * 70) + ((~((-1082272518) | startUptimeMillis2)) * 70) + (((~((-1635987214) | startUptimeMillis2)) | 553714696) * (-140)) + 368803278);
                                int i168 = (int) j33;
                                int a2 = defpackage.a.a();
                                int i169 = ~a2;
                                int i170 = i168 & ((((~(a2 | 1854353625)) | 289949988 | (~(i169 | (-1140916354)))) * 369) + ((1003387260 | (~((-1854353626) | i169))) * (-369)) + ((2144303613 | i169) * (-369)) + 802172634);
                                if (((i167 & i170) | (i167 ^ i170)) == -725904754) {
                                    objArr = new Object[]{r4, null, new int[1], new int[1], new int[1]};
                                    int i171 = (~(i & 20)) & (i | 20);
                                    String str11 = (String) defpackage.a.h(str6, str7, invoke);
                                    ((int[]) objArr[3])[0] = i;
                                    ((int[]) objArr[2])[0] = i171;
                                    int b10 = defpackage.a.b(1568215941);
                                    int i172 = (((~(b10 | (-4490082))) | 276958352) * 235) + (((~((-175944550) | b10)) | 448412820) * (-470)) + ((((~((~b10) | (-175944550))) | 448412820) * (-235)) - 677718680);
                                    int i173 = (((i172 | 16) << 1) - (i172 ^ 16)) + i3;
                                    int i174 = i173 << 13;
                                    int i175 = (i174 & (~i173)) | ((~i174) & i173);
                                    int i176 = i175 >>> 17;
                                    int i177 = ((~i175) & i176) | ((~i176) & i175);
                                    ((int[]) objArr[4])[0] = i177 ^ (i177 << 5);
                                    break;
                                }
                                i165++;
                                length4 = i18;
                                str10 = str4;
                                str8 = str5;
                                i29 = 2;
                            }
                        }
                        str = str8;
                        String str12 = (String) defpackage.a.h(str6, str7, invoke);
                        int length5 = str12.length();
                        int i178 = (length5 ^ (-6)) + ((length5 & (-6)) << 1);
                        if (i178 >= 0) {
                            int i179 = 0;
                            while (i179 <= i178) {
                                Object[] objArr32 = {str12.substring(i179, i179 + 6), 931995};
                                Object PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                                if (PngjBadSignature9 == null) {
                                    char defaultSize = (char) (View.getDefaultSize(0, 0) + 11039);
                                    int maximumFlingVelocity = 31 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                    int gidForName = 1281 - Process.getGidForName(BuildConfig.FLAVOR);
                                    byte b11 = $$a[18];
                                    str3 = str12;
                                    i16 = i179;
                                    i17 = i178;
                                    Object[] objArr33 = new Object[1];
                                    c(b11, r30[16], b11, objArr33);
                                    PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(defaultSize, maximumFlingVelocity, gidForName, -971849413, false, (String) objArr33[0], new Class[]{String.class, Integer.TYPE});
                                } else {
                                    str3 = str12;
                                    i16 = i179;
                                    i17 = i178;
                                }
                                long longValue6 = ((Long) ((Method) PngjBadSignature9).invoke(null, objArr32)).longValue();
                                long j34 = 354660766;
                                long j35 = ((-929) * longValue6) + ((-464) * j34);
                                long j36 = -1;
                                long j37 = j34 ^ j36;
                                long j38 = i;
                                long j39 = longValue6 | j38;
                                long j40 = (465 * (j39 | j37)) + (930 * (longValue6 | ((j37 | j38) ^ j36))) + ((-465) * (j37 | (j39 ^ j36))) + j35 + 301046934;
                                int c13 = ((int) (j40 >> 32)) & defpackage.a.c((~((-499504901) | i)) | 134316288, 490, (((-365188613) | i5) * (-490)) + 1415000510, 77960282);
                                int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                                int i180 = ((int) j40) & ((((~(elapsedRealtime | (-553975850))) | (~((~elapsedRealtime) | (-1224250903))) | 144736768) * 168) + ((~((-1079514135) | elapsedRealtime)) * 168) + ((((~((-1633489984) | r10)) | 1079514134) * 168) - 501357939));
                                if (((c13 & i180) | (c13 ^ i180)) == -2096167706) {
                                    objArr = new Object[]{r4, null, new int[1], new int[1], new int[1]};
                                    String str13 = (String) defpackage.a.h(str6, str7, invoke);
                                    ((int[]) objArr[3])[0] = i;
                                    ((int[]) objArr[2])[0] = (i & (-21)) | (i5 & 20);
                                    int i181 = (~((-375518341) | i)) | 104919044;
                                    int i182 = -(-defpackage.a.A(248839029 | i, 496, ((i181 | (~(519438325 | i5))) * (-496)) + (i181 * 992) + 180747657, -16));
                                    int i183 = ((i3 | i182) << 1) - (i182 ^ i3);
                                    int i184 = i183 << 13;
                                    int i185 = (i184 & (~i183)) | ((~i184) & i183);
                                    int i186 = i185 ^ (i185 >>> 17);
                                    int i187 = i186 << 5;
                                    ((int[]) objArr[4])[0] = ((~i186) & i187) | ((~i187) & i186);
                                    i6 = i4;
                                    i7 = i5;
                                } else {
                                    i179 = i16 + 1;
                                    str12 = str3;
                                    i178 = i17;
                                }
                            }
                        }
                        String substring2 = ((String) defpackage.a.h(str6, str7, invoke)).substring(0, indexOf2);
                        short axisFromString = (short) ((-1) - MotionEvent.axisFromString(BuildConfig.FLAVOR));
                        int i188 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1095752951;
                        int maximumDrawingCacheSize2 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                        int i189 = maximumDrawingCacheSize2 * 69;
                        int i190 = ((i189 | (-2088905345)) << 1) - (i189 ^ (-2088905345));
                        int i191 = ~maximumDrawingCacheSize2;
                        int i192 = (i191 ^ (-1890193388)) | (i191 & (-1890193388));
                        int i193 = ~((i192 ^ i4) | (i192 & i4));
                        int i194 = ~(maximumDrawingCacheSize2 | 1890193387);
                        int i195 = (i193 ^ i194) | (i194 & i193);
                        int i196 = ~(i | 1890193387);
                        int i197 = -(-(((i195 ^ i196) | (i195 & i196)) * (-68)));
                        int i198 = ((i190 | i197) << 1) - (i197 ^ i190);
                        int i199 = (i191 ^ i5) | (i191 & i5);
                        int i200 = -(-((~((i199 & 1890193387) | (i199 ^ 1890193387))) * (-68)));
                        int i201 = ((i198 | i200) << 1) - (i200 ^ i198);
                        int i202 = ~(((-1890193388) ^ i5) | ((-1890193388) & i5));
                        int i203 = (i201 - (~(((i202 & i191) | (i191 ^ i202)) * 68))) - 1;
                        byte scrollBarSize = (byte) (ViewConfiguration.getScrollBarSize() >> 8);
                        i10 = 0;
                        int i204 = -View.MeasureSpec.getSize(0);
                        int i205 = (i204 ^ (-50)) + ((i204 & (-50)) << 1);
                        Object[] objArr34 = new Object[1];
                        b(axisFromString, i188, i203, scrollBarSize, i205, objArr34);
                        split = substring2.split((String) objArr34[0]);
                        length2 = split.length;
                        i11 = 0;
                        loop4: while (i11 < length2) {
                            str2 = split[i11];
                            short lastIndexOf2 = (short) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', i10));
                            int i206 = -TextUtils.getCapsMode(BuildConfig.FLAVOR, i10, i10);
                            Object[] objArr35 = new Object[1];
                            b(lastIndexOf2, (i206 & 1095752995) + (i206 | 1095752995), 1890193388 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-49) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr35);
                            if (str2.split((String) objArr35[0]).length > 1) {
                                synchronized (((Class) com.d.e.a.PngjBadCrcException.values((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 31078), 49 - Color.alpha(0), TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 1043))) {
                                    try {
                                        int maximumFlingVelocity2 = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                        int i207 = -TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0);
                                        Object[] objArr36 = new Object[1];
                                        a("˿栫馊噫", maximumFlingVelocity2, (char) ((i207 & 27544) + (i207 | 27544)), "\u05ff⯆ࡘ뚤", "ꊅ茭膎\ue2e2묈㠮ܴ掂财劥혩ᙅ킾턋팄㙔", objArr36);
                                        String str14 = (String) objArr36[0];
                                        try {
                                            runtime = Runtime.getRuntime();
                                            s = (short) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                            trimmedLength = 1095753019 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR);
                                            strArr = split;
                                            int i208 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                            i12 = length2;
                                            int i209 = i208 * 960;
                                            int i210 = (i209 ^ 1451669194) + ((i209 & 1451669194) << 1);
                                            int i211 = ~(((-1890193391) ^ i5) | ((-1890193391) & i5));
                                            int i212 = ~((i208 ^ i) | (i208 & i));
                                            int i213 = ((i211 ^ i212) | (i211 & i212)) * 959;
                                            int i214 = ((i210 ^ i213) + ((i210 & i213) << 1)) - (-219263057);
                                            int i215 = ~(((-1890193391) ^ i) | ((-1890193391) & i));
                                            int i216 = ~((i5 ^ i208) | (i208 & i5));
                                            i14 = (((i215 ^ i216) | (i216 & i215)) * 959) + i214;
                                        } catch (Exception unused) {
                                            strArr = split;
                                            i12 = length2;
                                        }
                                        try {
                                            Object[] objArr37 = new Object[1];
                                            b(s, trimmedLength, i14, (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-51) - (~(ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr37);
                                            Process exec = runtime.exec((String) objArr37[0], (String[]) null, (File) null);
                                            try {
                                                Object[] objArr38 = {exec.getInputStream()};
                                                Object PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(975476048);
                                                if (PngjBadSignature10 == null) {
                                                    process = exec;
                                                    PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (37426 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 26, TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 1018, -959710997, false, null, new Class[]{InputStream.class});
                                                } else {
                                                    process = exec;
                                                }
                                                newInstance = ((Constructor) PngjBadSignature10).newInstance(objArr38);
                                                try {
                                                    Object[] objArr39 = {process.getErrorStream()};
                                                    Object PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(975476048);
                                                    if (PngjBadSignature11 == null) {
                                                        PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 37425), ExpandableListView.getPackedPositionGroup(0L) + 26, TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 1017, -959710997, false, null, new Class[]{InputStream.class});
                                                    }
                                                    newInstance2 = ((Constructor) PngjBadSignature11).newInstance(objArr39);
                                                    DataOutputStream dataOutputStream2 = new DataOutputStream(process.getOutputStream());
                                                    try {
                                                        Class<?> cls3 = Class.forName(str);
                                                        short touchSlop = (short) (ViewConfiguration.getTouchSlop() >> 8);
                                                        int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 1095753019;
                                                        int i217 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                        int i218 = ((i217 | 1890193409) << 1) - (i217 ^ 1890193409);
                                                        i6 = i4;
                                                        try {
                                                            Object[] objArr40 = new Object[1];
                                                            DataOutputStream dataOutputStream3 = dataOutputStream2;
                                                            b(touchSlop, edgeSlop2, i218, (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.alpha(0) - 50, objArr40);
                                                            i13 = i11;
                                                            try {
                                                                cls3.getMethod((String) objArr40[0], null).invoke(newInstance, null);
                                                                try {
                                                                    Class<?> cls4 = Class.forName(str);
                                                                    short s2 = (short) ((-2) - (~(-(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))))));
                                                                    int alpha = Color.alpha(0) + 1095753019;
                                                                    i7 = i5;
                                                                    try {
                                                                        int i219 = -TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0);
                                                                        int i220 = ~i219;
                                                                        int i221 = (i220 ^ (-1890193409)) | (i220 & (-1890193409));
                                                                        int i222 = ~((i221 ^ i) | (i221 & i));
                                                                        int i223 = ((-1890193409) ^ i6) | ((-1890193409) & i6);
                                                                        int i224 = ~((i223 ^ i219) | (i223 & i219));
                                                                        int i225 = (((i219 * (-919)) - 1920954368) - (~(-(-(((i222 ^ i224) | (i222 & i224)) * 920))))) - 1;
                                                                        int i226 = ~i219;
                                                                        int i227 = (((~(i226 | (-1890193409))) | (~((i220 ^ i6) | (i220 & i6)))) * 920) + i225;
                                                                        int i228 = ~(i221 | i7);
                                                                        int i229 = ~((i226 ^ 1890193408) | (i226 & 1890193408) | i);
                                                                        int i230 = (i228 ^ i229) | (i229 & i228);
                                                                        int i231 = ((-1890193409) ^ i219) | ((-1890193409) & i219);
                                                                        int i232 = -(-((i230 | (~((i231 ^ i) | (i231 & i)))) * 920));
                                                                        int i233 = (i227 & i232) + (i227 | i232);
                                                                        byte makeMeasureSpec2 = (byte) View.MeasureSpec.makeMeasureSpec(0, 0);
                                                                        int i234 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                                        Object[] objArr41 = new Object[1];
                                                                        b(s2, alpha, i233, makeMeasureSpec2, (i234 & (-50)) + (i234 | (-50)), objArr41);
                                                                        cls4.getMethod((String) objArr41[0], null).invoke(newInstance2, null);
                                                                        try {
                                                                            StringBuilder sb = new StringBuilder();
                                                                            sb.append(str14);
                                                                            int i235 = -TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0);
                                                                            int i236 = ((i235 | (-487626817)) << 1) - (i235 ^ (-487626817));
                                                                            int i237 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                                            Object[] objArr42 = new Object[1];
                                                                            a("뼯\uef67⇢頂", i236, (char) (((i237 | 546) << 1) - (i237 ^ 546)), "\u05ff⯆ࡘ뚤", "\ue448", objArr42);
                                                                            sb.append((String) objArr42[0]);
                                                                            String obj = sb.toString();
                                                                            int i238 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                            int i239 = ((i238 | 1095752989) << 1) - (i238 ^ 1095752989);
                                                                            int absoluteGravity4 = 1890193414 - Gravity.getAbsoluteGravity(0, 0);
                                                                            int threadPriority2 = Process.getThreadPriority(0);
                                                                            int i240 = -(-(threadPriority2 * (-195)));
                                                                            int i241 = ((-7820) & i240) + (i240 | (-7820));
                                                                            int i242 = ~((~threadPriority2) | 20);
                                                                            int i243 = ~((threadPriority2 ^ i) | (threadPriority2 & i));
                                                                            int i244 = (((((i242 ^ i243) | (i242 & i243)) * (-196)) + i241) - (~(-(-(((threadPriority2 ^ 20) | (threadPriority2 & 20)) * 392))))) - 1;
                                                                            int i245 = ~threadPriority2;
                                                                            int i246 = ~(((-21) ^ i245) | (i245 & (-21)));
                                                                            int i247 = -(-(((i246 & i243) | (i246 ^ i243)) * 196));
                                                                            int i248 = -Color.argb(0, 0, 0, 0);
                                                                            int i249 = ((i248 | (-50)) << 1) - (i248 ^ (-50));
                                                                            Object[] objArr43 = new Object[1];
                                                                            b((short) (AndroidCharacter.getMirror('0') - '0'), i239, absoluteGravity4, (byte) ((((i244 | i247) << 1) - (i247 ^ i244)) >> 6), i249, objArr43);
                                                                            dataOutputStream3.write(obj.getBytes((String) objArr43[0]));
                                                                            dataOutputStream3.flush();
                                                                            Object[] objArr44 = new Object[1];
                                                                            a("碫첬βḮ", (-1295209352) - (~(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))), (char) (11777 - (~(-MotionEvent.axisFromString(BuildConfig.FLAVOR)))), "\u05ff⯆ࡘ뚤", "\uf6d9縠燁\ud901鴀", objArr44);
                                                                            String str15 = (String) objArr44[0];
                                                                            short s3 = (short) (47 - (~(-AndroidCharacter.getMirror('0'))));
                                                                            int maximumFlingVelocity3 = 1095752989 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                                            int i250 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                            Object[] objArr45 = new Object[1];
                                                                            b(s3, maximumFlingVelocity3, ((i250 | 1890193414) << 1) - (i250 ^ 1890193414), (byte) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 50, objArr45);
                                                                            dataOutputStream3.write(str15.getBytes((String) objArr45[0]));
                                                                            dataOutputStream3.flush();
                                                                            try {
                                                                                try {
                                                                                    long nanoTime = System.nanoTime();
                                                                                    long nanos = TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                                    while (true) {
                                                                                        try {
                                                                                            process.exitValue();
                                                                                            dataOutputStream = dataOutputStream3;
                                                                                            break;
                                                                                        } catch (IllegalThreadStateException unused2) {
                                                                                            if (nanos > 0) {
                                                                                                dataOutputStream = dataOutputStream3;
                                                                                                try {
                                                                                                    Object[] objArr46 = {Long.valueOf(Math.min(TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                                    Class<?> cls5 = Class.forName(str);
                                                                                                    short tapTimeout = (short) (ViewConfiguration.getTapTimeout() >> 16);
                                                                                                    int i251 = 1095753019 - (~(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                                                                                                    int i252 = -Color.red(0);
                                                                                                    j = nanoTime;
                                                                                                    Object[] objArr47 = new Object[1];
                                                                                                    b(tapTimeout, i251, (i252 ^ 1890193419) + ((i252 & 1890193419) << 1), (byte) ExpandableListView.getPackedPositionType(0L), (-51) - (~(-(ViewConfiguration.getKeyRepeatTimeout() >> 16))), objArr47);
                                                                                                    cls5.getMethod((String) objArr47[0], Long.TYPE).invoke(null, objArr46);
                                                                                                } catch (Throwable th) {
                                                                                                    Throwable cause2 = th.getCause();
                                                                                                    if (cause2 != null) {
                                                                                                        throw cause2;
                                                                                                    }
                                                                                                    throw th;
                                                                                                }
                                                                                            } else {
                                                                                                dataOutputStream = dataOutputStream3;
                                                                                                j = nanoTime;
                                                                                            }
                                                                                            nanos = TimeUnit.MILLISECONDS.toNanos(2000L) - (System.nanoTime() - j);
                                                                                            if (nanos > 0) {
                                                                                                dataOutputStream3 = dataOutputStream;
                                                                                                nanoTime = j;
                                                                                                i28 = 32;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } catch (InterruptedException e) {
                                                                                    throw e;
                                                                                }
                                                                            } finally {
                                                                                try {
                                                                                    process.destroy();
                                                                                } catch (Exception unused3) {
                                                                                }
                                                                            }
                                                                        } catch (Exception unused4) {
                                                                            short windowTouchSlop = (short) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                                                            int resolveSize = View.resolveSize(0, 0);
                                                                            int i253 = (resolveSize ^ 1095752974) + ((resolveSize & 1095752974) << 1);
                                                                            int i254 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                                            Object[] objArr48 = new Object[1];
                                                                            b(windowTouchSlop, i253, ((i254 | 1890193428) << 1) - (i254 ^ 1890193428), (byte) (0 - (~TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0))), (-50) - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr48);
                                                                            throw new IOException((String) objArr48[0]);
                                                                        }
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        Throwable cause3 = th.getCause();
                                                                        if (cause3 != null) {
                                                                            throw cause3;
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                }
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                cause = th.getCause();
                                                                if (cause == null) {
                                                                    throw cause;
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            cause = th.getCause();
                                                            if (cause == null) {
                                                            }
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                    }
                                                } catch (Throwable th7) {
                                                    Throwable cause4 = th7.getCause();
                                                    if (cause4 != null) {
                                                        throw cause4;
                                                    }
                                                    throw th7;
                                                }
                                            } catch (Throwable th8) {
                                                Throwable cause5 = th8.getCause();
                                                if (cause5 != null) {
                                                    throw cause5;
                                                }
                                                throw th8;
                                            }
                                        } catch (Exception unused5) {
                                            i6 = i4;
                                            i13 = i11;
                                            i7 = i5;
                                            short windowTouchSlop2 = (short) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                            int resolveSize2 = View.resolveSize(0, 0);
                                            int i2532 = (resolveSize2 ^ 1095752974) + ((resolveSize2 & 1095752974) << 1);
                                            int i2542 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                            Object[] objArr482 = new Object[1];
                                            b(windowTouchSlop2, i2532, ((i2542 | 1890193428) << 1) - (i2542 ^ 1890193428), (byte) (0 - (~TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0))), (-50) - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr482);
                                            throw new IOException((String) objArr482[0]);
                                        }
                                    } catch (IOException unused6) {
                                        strArr = split;
                                        i12 = length2;
                                        i6 = i4;
                                        i13 = i11;
                                        i7 = i5;
                                    }
                                }
                                objArr = new Object[]{r4, null, new int[1], new int[1], new int[1]};
                                String str16 = (String) defpackage.a.h(str6, str7, invoke);
                                ((int[]) objArr[3])[0] = i;
                                ((int[]) objArr[2])[0] = i ^ 20;
                                int i255 = (((~(i7 | 425968810)) | (-313585638)) * 184) + ((((-43002694) | i7) * 184) - 1805427199);
                                int i256 = ((i255 | 16) << 1) - (i255 ^ 16);
                                int i257 = (i3 ^ i256) + ((i256 & i3) << 1);
                                int i258 = (i257 << 13) ^ i257;
                                int i259 = i258 >>> 17;
                                int i260 = (i258 | i259) & (~(i258 & i259));
                                int i261 = i260 << 5;
                                ((int[]) objArr[4])[0] = ((~i260) & i261) | ((~i261) & i260);
                                c2 = 2;
                                c = 0;
                            } else {
                                strArr = split;
                                i12 = length2;
                                i6 = i4;
                                i13 = i11;
                                i7 = i5;
                            }
                            int i262 = ((i13 | (-116)) << 1) - (i13 ^ (-116));
                            i11 = (i262 & 117) + (i262 | 117);
                            split = strArr;
                            i4 = i6;
                            i5 = i7;
                            length2 = i12;
                            i10 = 0;
                            i28 = 32;
                        }
                    }
                    i6 = i4;
                    i7 = i5;
                    objArr = new Object[]{null, null, new int[]{i}, new int[]{i}, new int[1]};
                    int i263 = ~defpackage.a.a();
                    int i264 = (((~((-968151035) | i263)) | (~(i263 | (-343793665)))) * 590) + (((~(343793664 | i263)) | (-1040052219) | (~(968151034 | i263))) * (-1180)) + ((((~(r4 | (-271892481))) | r6) * 590) - 328901761);
                    int i265 = (i3 & i264) + (i264 | i3);
                    int i266 = i265 << 13;
                    int i267 = (i266 | i265) & (~(i265 & i266));
                    int i268 = i267 >>> 17;
                    int i269 = ((~i267) & i268) | ((~i268) & i267);
                    int i270 = i269 << 5;
                    c = 0;
                    ((int[]) objArr[4])[0] = ((~i269) & i270) | ((~i270) & i269);
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
                    int a3 = defpackage.a.a();
                    int i271 = -(-defpackage.a.c((~(a3 | (-514125237))) | (~((~a3) | (-110232134))) | (-515305462), -370, (((~((-514125237) | r5)) | (~((-110232134) | a3))) * (-370)) - 291650085, -1684459916));
                    int i272 = (i3 & i271) + (i271 | i3);
                    int i273 = i272 << 13;
                    int i274 = (i273 | i272) & (~(i272 & i273));
                    int i275 = i274 ^ (i274 >>> 17);
                    int i276 = i275 << 5;
                    ((int[]) objArr49[4])[0] = ((~i275) & i276) | ((~i276) & i275);
                    if (((int[]) objArr49[2])[0] != i) {
                        return objArr49;
                    }
                    if ((i2 & 1) == 0) {
                        int i277 = -(-TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0));
                        int i278 = 1095753002 - (~(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        int i279 = -KeyEvent.normalizeMetaState(0);
                        int i280 = (i279 ^ 1890193475) + ((i279 & 1890193475) << 1);
                        byte indexOf4 = (byte) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 1);
                        int i281 = -(Process.myPid() >> 22);
                        int i282 = (i281 & (-50)) + (i281 | (-50));
                        Object[] objArr50 = new Object[1];
                        b((short) (((i277 | 1) << 1) - (i277 ^ 1)), i278, i280, indexOf4, i282, objArr50);
                        try {
                            Object[] objArr51 = {(String) objArr50[0]};
                            int indexOf5 = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0);
                            int values3 = getPadSub2.values();
                            int i283 = indexOf5 * 217;
                            int i284 = ((i283 | (-215)) << 1) - (i283 ^ (-215));
                            int i285 = (~((indexOf5 ^ values3) | (indexOf5 & values3))) * 216;
                            int i286 = ((i284 | i285) << 1) - (i285 ^ i284);
                            int i287 = (indexOf5 ^ (-2)) | (indexOf5 & (-2));
                            int i288 = ~values3;
                            int i289 = (((i287 & i288) | (i287 ^ i288)) * (-216)) + i286;
                            int i290 = ~((indexOf5 & i288) | (i288 ^ indexOf5));
                            int i291 = -(-(((i290 & 1) | (i290 ^ 1)) * 216));
                            short s4 = (short) ((i289 & i291) + (i291 | i289));
                            int i292 = 1095753000 - (~(-View.combineMeasuredStates(0, 0)));
                            int i293 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                            int i294 = (i293 ^ 1890193332) + ((i293 & 1890193332) << 1);
                            byte bitsPerPixel = (byte) ((-1) - ImageFormat.getBitsPerPixel(0));
                            int i295 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int i296 = (i295 ^ (-50)) + ((i295 & (-50)) << 1);
                            Object[] objArr52 = new Object[1];
                            b(s4, i292, i294, bitsPerPixel, i296, objArr52);
                            Class<?> cls6 = Class.forName((String) objArr52[0]);
                            short edgeSlop3 = (short) (ViewConfiguration.getEdgeSlop() >> 16);
                            int i297 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            int i298 = i297 * (-55);
                            int i299 = (i298 & (-136873296)) + (i298 | (-136873296));
                            int i300 = ((~((i297 ^ i) | (i297 & i))) | 1095753008) * 56;
                            int i301 = ((((i299 | i300) << 1) - (i300 ^ i299)) - (~(-(-((~((i297 ^ 1095753008) | (i297 & 1095753008))) * (-56)))))) - 1;
                            int i302 = ~((i6 ^ 1095753008) | (i6 & 1095753008));
                            int i303 = -(-(((i297 & i302) | (i297 ^ i302)) * 56));
                            Object[] objArr53 = new Object[1];
                            b(edgeSlop3, ((i301 | i303) << 1) - (i303 ^ i301), 1890193488 - View.resolveSize(0, 0), (byte) Drawable.resolveOpacity(0, 0), (-51) - (~(-(-(ViewConfiguration.getLongPressTimeout() >> 16)))), objArr53);
                            Object invoke2 = cls6.getMethod((String) objArr53[0], String.class).invoke(context, objArr51);
                            if (invoke2 != null) {
                                short minimumFlingVelocity = (short) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                int i304 = -KeyEvent.getDeadChar(0, 0);
                                int i305 = (i304 ^ 1095753001) + ((i304 & 1095753001) << 1);
                                int i306 = -(-Color.alpha(0));
                                Object[] objArr54 = new Object[1];
                                b(minimumFlingVelocity, i305, (i306 & 1890193504) + (i306 | 1890193504), (byte) (KeyEvent.getMaxKeyCode() >> 16), (-50) - (~(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))), objArr54);
                                Class<?> cls7 = Class.forName((String) objArr54[0]);
                                int i307 = -View.resolveSizeAndState(0, 0, 0);
                                Object[] objArr55 = new Object[1];
                                a("履ヰୃ踄", (i307 ^ 1127280889) + ((i307 & 1127280889) << 1), (char) (1035 - (~TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0))), "\u05ff⯆ࡘ뚤", "\ue13a헯퓉\ue751㍋︳̦䡒삝헩\uea58濄塵聫\uddc1", objArr55);
                                List list = (List) cls7.getMethod((String) objArr55[0], null).invoke(invoke2, null);
                                if (list != null) {
                                    Iterator it = list.iterator();
                                    loop1: while (it.hasNext()) {
                                        Object next = it.next();
                                        short offsetAfter = (short) TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0);
                                        int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1095753001;
                                        int i308 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                        Object[] objArr56 = new Object[1];
                                        b(offsetAfter, keyRepeatTimeout2, (i308 ^ 1890193541) + ((i308 & 1890193541) << 1), (byte) Drawable.resolveOpacity(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 49, objArr56);
                                        Class<?> cls8 = Class.forName((String) objArr56[0]);
                                        short scrollBarSize2 = (short) (ViewConfiguration.getScrollBarSize() >> 8);
                                        int i309 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                        int i310 = (i309 & 1095753007) + (i309 | 1095753007);
                                        int i311 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
                                        int i312 = (i311 & 1890193356) + (i311 | 1890193356);
                                        byte touchSlop2 = (byte) (ViewConfiguration.getTouchSlop() >> 8);
                                        int i313 = -TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0');
                                        int i314 = (i313 & (-51)) + (i313 | (-51));
                                        Object[] objArr57 = new Object[1];
                                        b(scrollBarSize2, i310, i312, touchSlop2, i314, objArr57);
                                        String str17 = (String) cls8.getMethod((String) objArr57[0], null).invoke(next, null);
                                        short tapTimeout2 = (short) (ViewConfiguration.getTapTimeout() >> 16);
                                        int touchSlop3 = (ViewConfiguration.getTouchSlop() >> 8) + 1095753001;
                                        int i315 = 1890193505 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                        byte fadingEdgeLength = (byte) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                        int size = View.MeasureSpec.getSize(0);
                                        int i316 = (size ^ (-50)) + ((size & (-50)) << 1);
                                        Object[] objArr58 = new Object[1];
                                        b(tapTimeout2, touchSlop3, i315, fadingEdgeLength, i316, objArr58);
                                        Class<?> cls9 = Class.forName((String) objArr58[0]);
                                        short longPressTimeout = (short) (ViewConfiguration.getLongPressTimeout() >> 16);
                                        int i317 = -(-View.getDefaultSize(0, 0));
                                        int i318 = (i317 & 1095753009) + (i317 | 1095753009);
                                        int i319 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
                                        int i320 = (i319 ^ 1890193570) + ((i319 & 1890193570) << 1);
                                        int i321 = -Color.rgb(0, 0, 0);
                                        int defaultSize2 = View.getDefaultSize(0, 0);
                                        int i322 = ((defaultSize2 | (-50)) << 1) - (defaultSize2 ^ (-50));
                                        Object[] objArr59 = new Object[1];
                                        b(longPressTimeout, i318, i320, (byte) ((i321 ^ (-16777216)) + ((i321 & (-16777216)) << 1)), i322, objArr59);
                                        if (((Boolean) cls9.getMethod((String) objArr59[0], String.class).invoke(invoke2, str17)).booleanValue() && str17.length() - 20 >= 0) {
                                            int i323 = 0;
                                            while (i323 <= length) {
                                                Object[] objArr60 = {str17.substring(i323, i323 + 20), 931995};
                                                Object PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                                                if (PngjBadSignature12 == null) {
                                                    char capsMode = (char) (TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 11039);
                                                    int resolveOpacity = 31 - Drawable.resolveOpacity(0, 0);
                                                    int resolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1282;
                                                    byte b12 = $$a[18];
                                                    Object[] objArr61 = new Object[1];
                                                    c(b12, r12[16], b12, objArr61);
                                                    PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(capsMode, resolveOpacity, resolveSizeAndState, -971849413, false, (String) objArr61[0], new Class[]{String.class, Integer.TYPE});
                                                }
                                                long longValue7 = ((Long) ((Method) PngjBadSignature12).invoke(null, objArr60)).longValue();
                                                long j41 = -1143460339;
                                                long j42 = -115;
                                                Object obj2 = invoke2;
                                                Iterator it2 = it;
                                                long j43 = i;
                                                String str18 = str17;
                                                int i324 = length;
                                                long j44 = -1;
                                                long j45 = ((-116) * ((((j43 ^ j44) | j41) | longValue7) ^ j44)) + (j42 * longValue7) + (j42 * j41);
                                                long j46 = 116;
                                                long j47 = longValue7 ^ j44;
                                                long j48 = (j46 * ((j44 ^ (j47 | j43)) | (((j41 ^ j44) | j47) ^ j44))) + ((j41 | j43) * j46) + j45 + 1799168039;
                                                int i325 = ~((int) Process.getStartElapsedRealtime());
                                                int c14 = ((int) (j48 >> 32)) & defpackage.a.c(i325 | (-201461763), -828, (((~((-201461763) | i325)) | 1638688173) * (-828)) + 1754752898, -693385608);
                                                int i326 = ((int) j48) & (((134316033 | (~(i7 | 2130171867))) * 449) + (((~(2130171867 | i)) | 134316033) * 449) + 1170489263);
                                                if (((c14 & i326) | (c14 ^ i326)) == 1245577864) {
                                                    objArr5 = new Object[]{null, null, new int[]{(i & (-71)) | (i7 & 70)}, new int[]{i}, new int[1]};
                                                    int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
                                                    int i327 = (((~((~startElapsedRealtime2) | (-482635287))) | 347533301) * 262) + (((~((-482635287) | startElapsedRealtime2)) | 347533301) * 262) + 1296286833;
                                                    int i328 = (i327 & 16) + (i327 | 16);
                                                    int i329 = i328 * (-755);
                                                    int i330 = i3 * (-755);
                                                    int i331 = (i329 ^ i330) + ((i329 & i330) << 1);
                                                    int i332 = ~i328;
                                                    int i333 = ~i3;
                                                    int i334 = (~((i332 & i333) | (i332 ^ i333))) * 1512;
                                                    int i335 = (i331 ^ i334) + ((i334 & i331) << 1);
                                                    int i336 = ~i328;
                                                    int i337 = ~((i336 & i333) | (i336 ^ i333));
                                                    int i338 = i328 | i3;
                                                    int i339 = (((i328 & i3) | (i328 ^ i3) | i7) * 756) + ((i337 | (~((i338 & i) | (i338 ^ i)))) * (-756)) + i335;
                                                    int i340 = i339 << 13;
                                                    int i341 = (i340 & (~i339)) | ((~i340) & i339);
                                                    int i342 = i341 >>> 17;
                                                    int i343 = (i341 | i342) & (~(i341 & i342));
                                                    int i344 = i343 << 5;
                                                    ((int[]) objArr5[4])[0] = ((~i343) & i344) | ((~i344) & i343);
                                                    c4 = 0;
                                                    break loop1;
                                                }
                                                int i345 = (i323 ^ (-119)) + ((i323 & (-119)) << 1);
                                                i323 = (i345 & 120) + (i345 | 120);
                                                str17 = str18;
                                                invoke2 = obj2;
                                                it = it2;
                                                length = i324;
                                            }
                                        }
                                        invoke2 = invoke2;
                                        it = it;
                                    }
                                }
                            }
                            objArr5 = new Object[]{null, null, new int[]{i}, new int[]{i}, new int[]{(r1 | r4) & (~(r1 & r4))}};
                            int i346 = (((~(i7 | 204348387)) | 285262868) * (-1188)) - 1246125671;
                            int i347 = 285262868 | (~((-204348388) | i));
                            int i348 = ~(i7 | 420008982);
                            int i349 = (((~((-204348388) | i7)) | 69602273 | i348) * 594) + ((i347 | i348) * 594) + i346;
                            int i350 = -(-((i349 << 1) - i349));
                            int i351 = (i3 & i350) + (i350 | i3);
                            int i352 = (i351 << 13) ^ i351;
                            int i353 = i352 >>> 17;
                            int i354 = ((~i352) & i353) | ((~i353) & i352);
                            int i355 = i354 << 5;
                            c4 = 0;
                            if (((int[]) objArr5[2])[c4] != i) {
                                return objArr5;
                            }
                        } catch (Throwable th9) {
                            Throwable cause6 = th9.getCause();
                            if (cause6 != null) {
                                throw cause6;
                            }
                            throw th9;
                        }
                    }
                    int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1095752951;
                    int i356 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int i357 = ((i356 | 1890193242) << 1) - (i356 ^ 1890193242);
                    int i358 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    Object[] objArr62 = new Object[1];
                    b((short) ((-Process.getGidForName(BuildConfig.FLAVOR)) - 1), minimumFlingVelocity2, i357, (byte) ((i358 ^ 1) + ((i358 & 1) << 1)), Color.argb(0, 0, 0, 0) - 50, objArr62);
                    Object[] objArr63 = {(String) objArr62[0]};
                    Object PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1934049891);
                    if (PngjBadSignature13 == null) {
                        char windowTouchSlop3 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int i359 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29;
                        int absoluteGravity5 = 1447 - Gravity.getAbsoluteGravity(0, 0);
                        byte[] bArr3 = $$a;
                        byte b13 = (byte) (-bArr3[13]);
                        Object[] objArr64 = new Object[1];
                        c(b13, (byte) (b13 - 2), (byte) (-bArr3[18]), objArr64);
                        PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(windowTouchSlop3, i359, absoluteGravity5, -1884803112, false, (String) objArr64[0], new Class[]{String.class});
                    }
                    long longValue8 = ((Long) ((Method) PngjBadSignature13).invoke(null, objArr63)).longValue();
                    long j49 = -273008317;
                    long j50 = -112;
                    long j51 = -1;
                    long j52 = longValue8 ^ j51;
                    long j53 = i;
                    long j54 = j53 ^ j51;
                    long j55 = j52 | j54;
                    long j56 = j49 ^ j51;
                    long j57 = ((113 * ((j52 | j53) ^ j51)) + (((-113) * ((((j56 | longValue8) ^ j51) | ((j56 | j53) ^ j51)) | ((j55 | j49) ^ j51))) + ((226 * (j49 | (j55 ^ j51))) + ((j50 * longValue8) + (j50 * j49))))) - 1443908950;
                    int i360 = ((int) (j57 >> 32)) & ((((~(i7 | 1926614078)) | (-2147483328) | (~((-268518419) | i))) * 140) + (((~(i7 | (-489387668))) | 268518418) * (-280)) + (((-489387668) | i) * 140) + 169851250);
                    int a4 = defpackage.a.a();
                    int i361 = ((int) j57) & ((((~(a4 | (-16908609))) | 673190917) * 235) + (((~((-1100729289) | a4)) | 1757011597) * (-470)) + (((~((~a4) | (-1100729289))) | 1757011597) * (-235)) + 697848267);
                    if (((i361 & i360) | (i360 ^ i361)) != 0) {
                        objArr2 = new Object[]{null, null, new int[]{(i & (-51)) | (i7 & 50)}, new int[]{i}, new int[]{(r1 | r4) & (~(r1 & r4))}};
                        int i362 = -(-defpackage.a.A((~(996584123 | i)) | (-1064286972) | (~(i7 | (-304523906))), 369, (((~((-996584124) | i7)) | (-372226754)) * (-369)) + ((((-67702849) | i7) * (-369)) - 916007454), -16));
                        int i363 = (i3 & i362) + (i362 | i3);
                        int i364 = i363 << 13;
                        int i365 = (i364 | i363) & (~(i363 & i364));
                        int i366 = i365 >>> 17;
                        int i367 = ((~i365) & i366) | ((~i366) & i365);
                        int i368 = i367 << 5;
                        i8 = 0;
                    } else {
                        objArr2 = new Object[]{null, null, new int[]{i}, new int[]{i}, new int[]{r1}};
                        int d2 = defpackage.a.d((~((-52598889) | i)) | 19040360 | (~(571758481 | i)), -69, (((~((-33558529) | i)) | (~(590798841 | i))) * 69) - 837916180, -1518908907, i3);
                        int i369 = d2 ^ (d2 << 13);
                        int i370 = i369 >>> 17;
                        int i371 = (i369 | i370) & (~(i369 & i370));
                        int i372 = i371 << 5;
                        int i373 = (i371 | i372) & (~(i371 & i372));
                        i8 = 0;
                    }
                    if (((int[]) objArr2[2])[i8] != i) {
                        return objArr2;
                    }
                    Object[] objArr65 = new Object[1];
                    a("棖壗뺀傋", Color.green(i8), (char) View.resolveSizeAndState(i8, i8, i8), "\u05ff⯆ࡘ뚤", "윲缝寷砍\u2e71鯅紵ꮖ᪢䐝駲냵겨味蠱ტٽ煉Ƈ蛻", objArr65);
                    Object[] objArr66 = {(String) objArr65[i8]};
                    Object PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1934049891);
                    if (PngjBadSignature14 == null) {
                        char fadingEdgeLength2 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int keyCodeFromString = KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 28;
                        int i374 = 1448 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        byte[] bArr4 = $$a;
                        byte b14 = (byte) (-bArr4[13]);
                        Object[] objArr67 = new Object[1];
                        c(b14, (byte) (b14 - 2), (byte) (-bArr4[18]), objArr67);
                        PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(fadingEdgeLength2, keyCodeFromString, i374, -1884803112, false, (String) objArr67[0], new Class[]{String.class});
                    }
                    long longValue9 = ((Long) ((Method) PngjBadSignature14).invoke(null, objArr66)).longValue();
                    long j58 = -445780938;
                    long j59 = 503;
                    long j60 = -502;
                    long j61 = j58 | longValue9;
                    long j62 = (j60 * j61) + (j59 * longValue9) + (j59 * j58);
                    long j63 = j58 ^ j51;
                    long j64 = ((longValue9 ^ j51) | j63) ^ j51;
                    long j65 = j63 | j54;
                    long j66 = (j61 | j53) ^ j51;
                    long j67 = ((502 * (((longValue9 | j65) ^ j51) | j66)) + ((j60 * ((j64 | (j65 ^ j51)) | j66)) + j62)) - 1271136329;
                    int myTid = Process.myTid();
                    int i375 = ((int) (j67 >> 32)) & ((((~(myTid | 186031517)) | 185994389) * 433) + (((~((-1623257929) | myTid)) | 186031517) * (-433)) + (((~((~myTid) | 1809252317)) * 433) - 1119458640));
                    int i376 = ((int) j67) & (((~(i7 | (-1224737346))) * 501) + (((~((-1224737346) | i)) | 4302852) * 501) + 1288925516);
                    if (((i375 & i376) | (i375 ^ i376)) != 0) {
                        objArr3 = new Object[]{null, null, new int[]{i ^ 60}, new int[]{i}, new int[1]};
                        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                        int i377 = ((~(elapsedCpuTime | (-135725057))) * 566) + (((~((-220178521) | elapsedCpuTime)) | 84453464) * (-566)) + 1180377737;
                        int i378 = -(-((i377 & 16) + (i377 | 16)));
                        int i379 = ((i3 | i378) << 1) - (i378 ^ i3);
                        int i380 = (i379 << 13) ^ i379;
                        int i381 = i380 >>> 17;
                        int i382 = (i380 | i381) & (~(i380 & i381));
                        int i383 = i382 << 5;
                        c3 = 0;
                        ((int[]) objArr3[4])[0] = (i382 | i383) & (~(i382 & i383));
                    } else {
                        objArr3 = new Object[]{null, null, new int[]{i}, new int[]{i}, new int[]{(r1 | r4) & (~(r1 & r4))}};
                        int c15 = defpackage.a.c((~((-624365571) | i)) | (~(i7 | (-143132502))) | (~(i7 | 767506271)), 140, (((~((-767498072) | i)) | (~(143140701 | i))) * 140) + (((143132501 | r1) * (-280)) - 735233291), i3);
                        int i384 = c15 ^ (c15 << 13);
                        int i385 = i384 >>> 17;
                        int i386 = ((~i384) & i385) | ((~i385) & i384);
                        int i387 = i386 << 5;
                        c3 = 0;
                    }
                    if (((int[]) objArr3[2])[c3] != i) {
                        return objArr3;
                    }
                    int i388 = -AndroidCharacter.getMirror('0');
                    int i389 = -(-TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0));
                    int i390 = ((i389 | 1095752952) << 1) - (i389 ^ 1095752952);
                    int i391 = 1890193253 - (~(-(-(ViewConfiguration.getScrollDefaultDelay() >> 16))));
                    byte defaultSize3 = (byte) View.getDefaultSize(0, 0);
                    int keyCodeFromString2 = KeyEvent.keyCodeFromString(BuildConfig.FLAVOR);
                    int i392 = (keyCodeFromString2 * 370) - 18500;
                    int i393 = (keyCodeFromString2 ^ (-50)) | (keyCodeFromString2 & (-50));
                    int i394 = ((i393 & i6) | (i393 ^ i6)) * (-369);
                    int i395 = ((i392 | i394) << 1) - (i392 ^ i394);
                    int i396 = ~keyCodeFromString2;
                    int i397 = ~((i396 & i7) | (i396 ^ i7));
                    int i398 = -(-(((i397 & (-50)) | (i397 ^ (-50))) * (-369)));
                    int i399 = ((i395 | i398) << 1) - (i398 ^ i395);
                    int i400 = ~(49 | keyCodeFromString2);
                    int i401 = ~((keyCodeFromString2 ^ i) | (keyCodeFromString2 & i));
                    int i402 = (i400 & i401) | (i400 ^ i401);
                    int i403 = ~keyCodeFromString2;
                    int i404 = ~((i403 & i6) | (i403 ^ i6) | (-50));
                    int i405 = -(-(((i404 & i402) | (i402 ^ i404)) * 369));
                    int i406 = (i399 & i405) + (i405 | i399);
                    Object[] objArr68 = new Object[1];
                    b((short) (((i388 | 48) << 1) - (i388 ^ 48)), i390, i391, defaultSize3, i406, objArr68);
                    Object[] objArr69 = {(String) objArr68[0]};
                    Object PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1142218481);
                    if (PngjBadSignature15 == null) {
                        char offsetBefore = (char) TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0);
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 28;
                        int i407 = 1448 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        byte b15 = $$a[18];
                        byte b16 = (byte) (b15 - 1);
                        Object[] objArr70 = new Object[1];
                        c(b16, (byte) (b16 | 15), b15, objArr70);
                        PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(offsetBefore, pressedStateDuration, i407, 1191464116, false, (String) objArr70[0], new Class[]{String.class});
                    }
                    long longValue10 = ((Long) ((Method) PngjBadSignature15).invoke(null, objArr69)).longValue();
                    long j68 = -1613464095;
                    long j69 = -958;
                    long j70 = 959;
                    long j71 = longValue10 ^ j51;
                    long j72 = j68 ^ j51;
                    long j73 = ((j70 * ((((j72 | j54) ^ j51) | ((j71 | j53) ^ j51)) | ((j68 | j53) ^ j51))) + (((-959) * ((longValue10 | j68) ^ j51)) + ((((((j71 | j54) ^ j51) | ((j72 | j53) ^ j51)) | ((j54 | j68) ^ j51)) * j70) + ((j69 * longValue10) + (j69 * j68))))) - 342533782;
                    int c16 = ((int) (j73 >> 32)) & defpackage.a.c((~((-598273) | i)) | 1426064548, 446, (((~(2141603580 | i7)) | (-2142201853)) * 446) + 384374654, -1939286726);
                    int myPid = Process.myPid();
                    int i408 = ~myPid;
                    int i409 = (((~(1398783359 | i408)) | (~((-1380620591) | myPid))) * 520) + 1564827325;
                    int i410 = ~(1380620590 | i408);
                    int i411 = ~(myPid | (-56605820));
                    int i412 = ((int) j73) & (((i411 | (~(i408 | 56605819)) | 18162769) * 520) + ((i410 | i411) * (-1040)) + i409);
                    if (((c16 & i412) | (c16 ^ i412)) != 0) {
                        objArr4 = new Object[]{null, null, new int[]{i ^ 80}, new int[]{i}, new int[1]};
                        int i413 = ~((int) Runtime.getRuntime().totalMemory());
                        int i414 = (i3 - (~defpackage.a.c((~(i413 | 379418817)) | 1003776187, 160, (((~(i413 | 1003776187)) | 67702848) * (-160)) + 1176478489, 16))) - 1;
                        int i415 = i414 << 13;
                        int i416 = (i414 | i415) & (~(i414 & i415));
                        int i417 = i416 >>> 17;
                        int i418 = (i416 | i417) & (~(i416 & i417));
                        int i419 = i418 << 5;
                        ((int[]) objArr4[4])[0] = ((~i418) & i419) | ((~i419) & i418);
                        i9 = 0;
                    } else {
                        objArr4 = new Object[]{null, null, new int[]{i}, new int[]{i}, new int[1]};
                        int i420 = (int) Runtime.getRuntime().totalMemory();
                        int i421 = (((~((~i420) | (-270010520))) | 268961937) * 191) + (((~(i420 | (-270010520))) | 894367889) * 191) + 1566380833;
                        int i422 = (i3 ^ i421) + ((i421 & i3) << 1);
                        int i423 = i422 << 13;
                        int i424 = (i423 & (~i422)) | ((~i423) & i422);
                        int i425 = i424 ^ (i424 >>> 17);
                        i9 = 0;
                        ((int[]) objArr4[4])[0] = i425 ^ (i425 << 5);
                    }
                    if (((int[]) objArr4[2])[i9] != i) {
                        return objArr4;
                    }
                    int i426 = -(ExpandableListView.getPackedPositionForChild(i9, i9) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i9, i9) == 0L ? 0 : -1));
                    int i427 = 1095752951 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int i428 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int i429 = (i428 & 1890193289) + (i428 | 1890193289);
                    byte windowTouchSlop4 = (byte) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int i430 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    int i431 = (i430 ^ (-50)) + ((i430 & (-50)) << 1);
                    Object[] objArr71 = new Object[1];
                    b((short) ((i426 ^ (-1)) + (i426 << 1)), i427, i429, windowTouchSlop4, i431, objArr71);
                    Object[] objArr72 = {(String) objArr71[0]};
                    Object PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1142218481);
                    if (PngjBadSignature16 == null) {
                        char normalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                        int capsMode2 = 28 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0);
                        int i432 = 1448 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte b17 = $$a[18];
                        byte b18 = (byte) (b17 - 1);
                        Object[] objArr73 = new Object[1];
                        c(b18, (byte) (b18 | 15), b17, objArr73);
                        PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature(normalizeMetaState, capsMode2, i432, 1191464116, false, (String) objArr73[0], new Class[]{String.class});
                    }
                    long longValue11 = ((Long) ((Method) PngjBadSignature16).invoke(null, objArr72)).longValue();
                    long j74 = -1825169531;
                    long j75 = j74 ^ j51;
                    long j76 = (longValue11 | j53) ^ j51;
                    long j77 = ((110 * ((((longValue11 ^ j51) | j74) ^ j51) | ((j75 | longValue11) ^ j51))) + ((220 * (((j74 | longValue11) ^ j51) | j76)) + (((-220) * (j75 | j76)) + ((111 * longValue11) + ((-109) * j74))))) - 130828346;
                    int myUid = Process.myUid();
                    int i433 = ((int) (j77 >> 32)) & ((((~(myUid | (-842139422))) | (-595086990)) * 318) + (((~(842139421 | myUid)) | 21514368) * (-318)) + (((~((-573572622) | myUid)) | (~((~myUid) | 863653789))) * (-318)) + 183964362);
                    int startUptimeMillis3 = (int) Process.getStartUptimeMillis();
                    int i434 = ~startUptimeMillis3;
                    int i435 = ((int) j77) & ((((~(startUptimeMillis3 | (-578705269))) | (~(i434 | (-2015931679)))) * 333) + (((~((-578705269) | i434)) | (~((-2015931679) | startUptimeMillis3))) * 333) + 2132064363);
                    if (((i433 & i435) | (i433 ^ i435)) != 0) {
                        Object[] objArr74 = {null, null, new int[]{(i & (-91)) | (i7 & 90)}, new int[]{i}, new int[]{r1 ^ (r1 << 5)}};
                        int i436 = (((~((-26356004) | i)) | (-599191544)) * 49) + (((~((-598001367) | i7)) | (-26356004) | (~(598001366 | i))) * (-49)) + (((~((-26356004) | i7)) | 1190177) * 98) + 1573732233;
                        int i437 = ((i436 | 16) << 1) - (i436 ^ 16);
                        int i438 = (i3 ^ i437) + ((i437 & i3) << 1);
                        int i439 = i438 << 13;
                        int i440 = ((~i438) & i439) | ((~i439) & i438);
                        int i441 = i440 >>> 17;
                        int i442 = (i440 | i441) & (~(i440 & i441));
                        return objArr74;
                    }
                    Object[] objArr75 = {null, null, new int[]{i}, new int[]{i}, new int[1]};
                    int startUptimeMillis4 = (int) Process.getStartUptimeMillis();
                    int i443 = -(-defpackage.a.c((~(startUptimeMillis4 | 70967082)) | (~(553390287 | startUptimeMillis4)) | (-620683248), -1444, (((~startUptimeMillis4) | (-617009126)) * 1444) + 809903031, -1196010534));
                    int i444 = (i3 ^ i443) + ((i443 & i3) << 1);
                    int i445 = i444 << 13;
                    int i446 = (i445 | i444) & (~(i444 & i445));
                    int i447 = i446 >>> 17;
                    int i448 = ((~i446) & i447) | ((~i447) & i446);
                    int i449 = i448 << 5;
                    ((int[]) objArr75[4])[0] = ((~i448) & i449) | ((~i449) & i448);
                    return objArr75;
                } catch (Throwable th10) {
                    Throwable cause7 = th10.getCause();
                    if (cause7 != null) {
                        throw cause7;
                    }
                    throw th10;
                }
                int i2622 = ((i13 | (-116)) << 1) - (i13 ^ (-116));
                i11 = (i2622 & 117) + (i2622 | 117);
                split = strArr;
                i4 = i6;
                i5 = i7;
                length2 = i12;
                i10 = 0;
                i28 = 32;
                try {
                    Class<?> cls10 = Class.forName(str);
                    short alpha2 = (short) Color.alpha(0);
                    int i450 = -View.MeasureSpec.getSize(0);
                    int i451 = ((i450 | 1095753010) << 1) - (i450 ^ 1095753010);
                    int i452 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int values4 = getPadSub2.values();
                    int i453 = i452 * 522;
                    int i454 = ((i453 | 646930304) << 1) - (i453 ^ 646930304);
                    int i455 = ~values4;
                    int i456 = ~(i455 | 1890193424);
                    int i457 = (((i452 ^ i456) | (i456 & i452)) * (-1042)) + i454;
                    int i458 = ((values4 ^ 1890193424) | (values4 & 1890193424)) * 521;
                    int i459 = ((i457 | i458) << 1) - (i457 ^ i458);
                    int i460 = ~i452;
                    int i461 = ((~((i460 ^ (-1890193425)) | (i460 & (-1890193425)))) | (~((i460 ^ values4) | (i460 & values4)))) ^ (~((i455 | i452) | 1890193424));
                    Object[] objArr76 = new Object[1];
                    b(alpha2, i451, (i459 - (~(-(-(((r9 & r14) | i461) * 521))))) - 1, (byte) View.combineMeasuredStates(0, 0), (-50) - View.MeasureSpec.makeMeasureSpec(0, 0), objArr76);
                    String str19 = (String) objArr76[0];
                    Class cls11 = Long.TYPE;
                    cls10.getMethod(str19, cls11).invoke(newInstance, 100L);
                    try {
                        Class<?> cls12 = Class.forName(str);
                        short fadingEdgeLength3 = (short) (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int i462 = -Color.alpha(0);
                        int values5 = getPadSub2.values();
                        int i463 = (i462 * 960) - 319512426;
                        int i464 = ~values5;
                        int i465 = ~(((-1095753011) ^ i464) | ((-1095753011) & i464));
                        int i466 = ~((i462 ^ values5) | (i462 & values5));
                        int i467 = ((i465 ^ i466) | (i465 & i466)) * 959;
                        int i468 = ((i463 ^ i467) + ((i463 & i467) << 1)) - 1439849971;
                        int i469 = ~(((-1095753011) ^ values5) | ((-1095753011) & values5));
                        int i470 = ~((i464 ^ i462) | (i464 & i462));
                        int i471 = -(-(((i469 ^ i470) | (i469 & i470)) * 959));
                        int i472 = (i468 & i471) + (i471 | i468);
                        int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
                        int values6 = getPadSub2.values();
                        int i473 = (maxKeyCode * (-103)) - 1416394352;
                        int i474 = ~maxKeyCode;
                        int i475 = ~((i474 ^ (-1890193425)) | (i474 & (-1890193425)));
                        int i476 = ~(((-1890193425) ^ values6) | ((-1890193425) & values6));
                        int i477 = ((i475 ^ i476) | (i475 & i476)) * 104;
                        int i478 = (i473 ^ i477) + ((i473 & i477) << 1);
                        int i479 = (~values6) | maxKeyCode;
                        int i480 = (~((i479 ^ 1890193424) | (i479 & 1890193424))) * (-104);
                        Object[] objArr77 = new Object[1];
                        b(fadingEdgeLength3, i472, (((maxKeyCode ^ values6) | (maxKeyCode & values6)) * 104) + (i478 & i480) + (i478 | i480), (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-52) - (~(-(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))))), objArr77);
                        cls12.getMethod((String) objArr77[0], cls11).invoke(newInstance2, 10L);
                        StringBuilder sb2 = new StringBuilder();
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-772232296);
                        if (PngjBadSignature2 == null) {
                            char longPressTimeout2 = (char) (37426 - (ViewConfiguration.getLongPressTimeout() >> 16));
                            int defaultSize4 = 26 - View.getDefaultSize(0, 0);
                            int argb2 = Color.argb(0, 0, 0, 0) + 1017;
                            Object[] objArr78 = new Object[1];
                            c((byte) ($$b & 44), (byte) i28, (byte) (-$$a[13]), objArr78);
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(longPressTimeout2, defaultSize4, argb2, 756532771, false, (String) objArr78[0], null);
                        }
                        sb2.append(((Field) PngjBadSignature2).get(newInstance).toString());
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-772232296);
                        if (PngjBadSignature3 == null) {
                            char edgeSlop4 = (char) (37426 - (ViewConfiguration.getEdgeSlop() >> 16));
                            int keyCodeFromString3 = KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 26;
                            int keyCodeFromString4 = 1017 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR);
                            Object[] objArr79 = new Object[1];
                            c((byte) ($$b & 44), (byte) 32, (byte) (-$$a[13]), objArr79);
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(edgeSlop4, keyCodeFromString3, keyCodeFromString4, 756532771, false, (String) objArr79[0], null);
                        }
                        sb2.append(((Field) PngjBadSignature3).get(newInstance2).toString());
                        String obj3 = sb2.toString();
                        try {
                            int i481 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                            Object[] objArr80 = new Object[1];
                            a("뼯\uef67⇢頂", (i481 ^ (-487626817)) + ((i481 & (-487626817)) << 1), (char) (Color.rgb(0, 0, 0) + 16777761), "\u05ff⯆ࡘ뚤", "\ue448", objArr80);
                            String[] split2 = obj3.split((String) objArr80[0]);
                            length3 = split2.length;
                            i15 = 0;
                            while (i15 < length3) {
                                String str20 = split2[i15];
                                short green2 = (short) Color.green(0);
                                int i482 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                int i483 = (i482 ^ 1095753016) + ((i482 & 1095753016) << 1);
                                int i484 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                int i485 = ((i484 | 1890193455) << 1) - (i484 ^ 1890193455);
                                byte edgeSlop5 = (byte) (ViewConfiguration.getEdgeSlop() >> 16);
                                int i486 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                Object[] objArr81 = new Object[1];
                                b(green2, i483, i485, edgeSlop5, (i486 & (-50)) + (i486 | (-50)), objArr81);
                                if (!str20.startsWith((String) objArr81[0])) {
                                    Object[] objArr82 = new Object[1];
                                    a("튍⯌膇㫢", TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 1, (char) (ViewConfiguration.getEdgeSlop() >> 16), "\u05ff⯆ࡘ뚤", "푤ꃴ\ud8f5ﭗ䄕ᵍ訵ꡙ㑠\udc55缋颦뽴\ue1d7羌ᵟ⽸䑑ꃌ\uf4de", objArr82);
                                    if (!str20.startsWith((String) objArr82[0])) {
                                        Object[] objArr83 = new Object[1];
                                        a("鼾ᴴ㻬験", Color.argb(0, 0, 0, 0), (char) Gravity.getAbsoluteGravity(0, 0), "\u05ff⯆ࡘ뚤", "㠳ꋉⅎᬺ䙨֨慺\ueb86", objArr83);
                                        if (str20.startsWith((String) objArr83[0])) {
                                            int i487 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                            int values7 = getPadSub2.values();
                                            int i488 = i487 * 375;
                                            int i489 = (i488 ^ 747) + ((i488 & 747) << 1);
                                            int i490 = ~i487;
                                            strArr2 = split2;
                                            int i491 = ~((~i490) | i490);
                                            int i492 = ~values7;
                                            int i493 = ~((i492 ^ i487) | (i492 & i487));
                                            int i494 = (((i491 ^ i493) | (i491 & i493)) * (-374)) + i489;
                                            int i495 = (~i487) * 748;
                                            int i496 = (i494 & i495) + (i494 | i495);
                                            int i497 = ((~(~i487)) | (~((~values7) | i487))) * 374;
                                            int i498 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                            int i499 = ((i498 | 1095752962) << 1) - (i498 ^ 1095752962);
                                            int i500 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                            int i501 = ((i500 | 1890193473) << 1) - (i500 ^ 1890193473);
                                            byte resolveSize3 = (byte) View.resolveSize(0, 0);
                                            int i502 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                            int i503 = ((i502 | (-51)) << 1) - (i502 ^ (-51));
                                            Object[] objArr84 = new Object[1];
                                            b((short) ((i496 & i497) + (i497 | i496)), i499, i501, resolveSize3, i503, objArr84);
                                            String[] split3 = str20.split((String) objArr84[0]);
                                            if (split3.length > 1 && split3[1].equalsIgnoreCase(str2)) {
                                                objArr = new Object[]{str16, null, new int[1], new int[1], new int[1]};
                                                String str162 = (String) defpackage.a.h(str6, str7, invoke);
                                                ((int[]) objArr[3])[0] = i;
                                                ((int[]) objArr[2])[0] = i ^ 20;
                                                int i2552 = (((~(i7 | 425968810)) | (-313585638)) * 184) + ((((-43002694) | i7) * 184) - 1805427199);
                                                int i2562 = ((i2552 | 16) << 1) - (i2552 ^ 16);
                                                int i2572 = (i3 ^ i2562) + ((i2562 & i3) << 1);
                                                int i2582 = (i2572 << 13) ^ i2572;
                                                int i2592 = i2582 >>> 17;
                                                int i2602 = (i2582 | i2592) & (~(i2582 & i2592));
                                                int i2612 = i2602 << 5;
                                                ((int[]) objArr[4])[0] = ((~i2602) & i2612) | ((~i2612) & i2602);
                                                c2 = 2;
                                                c = 0;
                                                if (((int[]) objArr[c2])[c] == i) {
                                                }
                                            }
                                            i15 = ((i15 ^ 16) + ((i15 & 16) << 1)) - 15;
                                            split2 = strArr2;
                                        }
                                    }
                                }
                                strArr2 = split2;
                                i15 = ((i15 ^ 16) + ((i15 & 16) << 1)) - 15;
                                split2 = strArr2;
                            }
                        } catch (IOException unused7) {
                        }
                        int i26222 = ((i13 | (-116)) << 1) - (i13 ^ (-116));
                        i11 = (i26222 & 117) + (i26222 | 117);
                        split = strArr;
                        i4 = i6;
                        i5 = i7;
                        length2 = i12;
                        i10 = 0;
                        i28 = 32;
                    } catch (Throwable th11) {
                        Throwable cause8 = th11.getCause();
                        if (cause8 != null) {
                            throw cause8;
                        }
                        throw th11;
                    }
                } catch (Throwable th12) {
                    Throwable cause9 = th12.getCause();
                    if (cause9 != null) {
                        throw cause9;
                    }
                    throw th12;
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
                int i4812 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                Object[] objArr802 = new Object[1];
                a("뼯\uef67⇢頂", (i4812 ^ (-487626817)) + ((i4812 & (-487626817)) << 1), (char) (Color.rgb(0, 0, 0) + 16777761), "\u05ff⯆ࡘ뚤", "\ue448", objArr802);
                String[] split22 = obj32.split((String) objArr802[0]);
                length3 = split22.length;
                i15 = 0;
                while (i15 < length3) {
                }
                int i262222 = ((i13 | (-116)) << 1) - (i13 ^ (-116));
                i11 = (i262222 & 117) + (i262222 | 117);
                split = strArr;
                i4 = i6;
                i5 = i7;
                length2 = i12;
                i10 = 0;
                i28 = 32;
            } catch (Throwable th13) {
                Throwable cause10 = th13.getCause();
                if (cause10 != null) {
                    throw cause10;
                }
                throw th13;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static void a(String str, int i, char c, String str2, String str3, Object[] objArr) {
            char[] cArr;
            int i2;
            long j;
            char[] cArr2;
            char c2;
            int i3 = $11 + 51;
            $10 = i3 % 128;
            int i4 = 2;
            Object obj = null;
            if (i3 % 2 != 0) {
                throw null;
            }
            char[] charArray = str3 != 0 ? str3.toCharArray() : str3;
            if (str2 != null) {
                $10 = ($11 + 51) % 128;
                cArr = str2.toCharArray();
            } else {
                cArr = str2;
            }
            char[] cArr3 = cArr;
            char[] charArray2 = str != null ? str.toCharArray() : str;
            com.d.e.getPadSub2 getpadsub2 = new com.d.e.getPadSub2();
            int length = charArray2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr3.length;
            char[] cArr5 = new char[length2];
            int i5 = 0;
            System.arraycopy(charArray2, 0, cArr4, 0, length);
            System.arraycopy(cArr3, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = charArray.length;
            char[] cArr6 = new char[length3];
            getpadsub2.PngjBadSignature = 0;
            while (getpadsub2.PngjBadSignature < length3) {
                try {
                    Object[] objArr2 = {getpadsub2};
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(152054586);
                    if (PngjBadSignature2 == null) {
                        byte b2 = (byte) i5;
                        i2 = i4;
                        byte b3 = b2;
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 28 - View.MeasureSpec.getSize(i5), 1855 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), -167819647, false, $$e(b2, b3, b3), new Class[]{Object.class});
                    } else {
                        i2 = i4;
                    }
                    int intValue = ((Integer) ((Method) PngjBadSignature2).invoke(obj, objArr2)).intValue();
                    Object[] objArr3 = {getpadsub2};
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1496933771);
                    if (PngjBadSignature3 == null) {
                        j = 0;
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (35511 - (ViewConfiguration.getFadingEdgeLength() >> 16)), ExpandableListView.getPackedPositionGroup(0L) + 42, 555 - AndroidCharacter.getMirror('0'), 1512699854, false, $$e(b4, b5, (byte) (b5 | 50)), new Class[]{Object.class});
                    } else {
                        j = 0;
                    }
                    int intValue2 = ((Integer) ((Method) PngjBadSignature3).invoke(obj, objArr3)).intValue();
                    int i6 = cArr4[getpadsub2.PngjBadSignature % 4] * 32718;
                    Object[] objArr4 = new Object[3];
                    objArr4[i2] = Integer.valueOf(cArr5[intValue]);
                    objArr4[1] = Integer.valueOf(i6);
                    objArr4[0] = getpadsub2;
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1094318588);
                    Class cls = Integer.TYPE;
                    if (PngjBadSignature4 == null) {
                        c2 = 1;
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        cArr2 = charArray;
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (Process.myPid() >> 22), 32 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)), 246 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0), 1110010815, false, $$e(b6, b7, (byte) (b7 | 51)), new Class[]{Object.class, cls, cls});
                    } else {
                        cArr2 = charArray;
                        c2 = 1;
                    }
                    ((Method) PngjBadSignature4).invoke(null, objArr4);
                    int i7 = cArr4[intValue2] * 32718;
                    int i8 = i2;
                    Object[] objArr5 = new Object[i8];
                    objArr5[c2] = Integer.valueOf(cArr5[intValue]);
                    objArr5[0] = Integer.valueOf(i7);
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-2032891769);
                    if (PngjBadSignature5 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((-1) - Process.getGidForName(BuildConfig.FLAVOR)), (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 36, 549 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), 2050745660, false, $$e(b8, b9, (byte) (b9 | 52)), new Class[]{cls, cls});
                    }
                    cArr5[intValue2] = ((Character) ((Method) PngjBadSignature5).invoke(null, objArr5)).charValue();
                    cArr4[intValue2] = getpadsub2.values;
                    int i9 = getpadsub2.PngjBadSignature;
                    cArr6[i9] = (char) ((((r0 ^ cArr2[i9]) ^ (PngjInputException ^ 698259225915410659L)) ^ ((int) (PngjUnsupportedException ^ 698259225915410659L))) ^ ((char) (PngjPrematureEnding ^ 698259225915410659L)));
                    getpadsub2.PngjBadSignature = i9 + 1;
                    $11 = ($10 + 83) % 128;
                    charArray = cArr2;
                    i4 = i8;
                    obj = null;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x01b4, code lost:
        
            if (r8 != false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x01c9, code lost:
        
            r6 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x01c6, code lost:
        
            r6 = r18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x01c4, code lost:
        
            if (r8 != false) goto L46;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(short s, int i, int i2, byte b2, int i3, Object[] objArr) {
            int i4;
            int i5;
            long j;
            long j2;
            int i6;
            int i7;
            int i8;
            int i9;
            int length;
            byte[] bArr;
            int i10;
            int i11;
            com.d.e.PngjPrematureEnding pngjPrematureEnding = new com.d.e.PngjPrematureEnding();
            StringBuilder sb = new StringBuilder();
            try {
                int i12 = 1;
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(PngjBadCrcException)};
                int i13 = 0;
                Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1302984176);
                Class cls = Integer.TYPE;
                if (PngjBadSignature2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    i4 = -1302984176;
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (60329 - ExpandableListView.getPackedPositionType(0L)), 32 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 1168, 1320773547, false, $$e(b3, b4, (byte) (b4 | 13)), new Class[]{cls, cls});
                } else {
                    i4 = -1302984176;
                }
                int intValue = ((Integer) ((Method) PngjBadSignature2).invoke(null, objArr2)).intValue();
                boolean z = intValue == -1;
                if (z) {
                    int i14 = $10;
                    $11 = (i14 + 77) % 128;
                    byte[] bArr2 = valueOf;
                    if (bArr2 != null) {
                        $11 = (i14 + 21) % 128;
                        int length2 = bArr2.length;
                        j = 0;
                        byte[] bArr3 = new byte[length2];
                        int i15 = 0;
                        while (i15 < length2) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i15])};
                            Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1053815139);
                            if (PngjBadSignature3 == null) {
                                char doubleTapTimeout = (char) (14830 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                                int pressedStateDuration = 28 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                i10 = i12;
                                int defaultSize = View.getDefaultSize(i13, i13) + 721;
                                byte b5 = (byte) i13;
                                i11 = i13;
                                byte b6 = b5;
                                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(doubleTapTimeout, pressedStateDuration, defaultSize, 1038050086, false, $$e(b5, b6, (byte) (b6 | 9)), new Class[]{cls});
                            } else {
                                i10 = i12;
                                i11 = i13;
                            }
                            bArr3[i15] = ((Byte) ((Method) PngjBadSignature3).invoke(null, objArr3)).byteValue();
                            i15++;
                            i12 = i10;
                            i13 = i11;
                        }
                        bArr2 = bArr3;
                    } else {
                        j = 0;
                    }
                    i5 = i12;
                    int i16 = i13;
                    j2 = -6165791747575875761L;
                    if (bArr2 != null) {
                        byte[] bArr4 = valueOf;
                        Object[] objArr4 = new Object[2];
                        objArr4[i5] = Integer.valueOf(PngjException);
                        objArr4[i16] = Integer.valueOf(i2);
                        Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i4);
                        if (PngjBadSignature4 == null) {
                            byte b7 = (byte) i16;
                            byte b8 = b7;
                            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (60328 - MotionEvent.axisFromString(BuildConfig.FLAVOR)), 32 - (KeyEvent.getMaxKeyCode() >> 16), 1168 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), 1320773547, false, $$e(b7, b8, (byte) (b8 | 13)), new Class[]{cls, cls});
                        }
                        intValue = (byte) (((byte) (bArr4[((Integer) ((Method) PngjBadSignature4).invoke(null, objArr4)).intValue()] ^ (-6165791747575875761L))) + ((int) (PngjBadCrcException ^ (-6165791747575875761L))));
                    } else {
                        intValue = (short) (((short) (values[i2 + ((int) (PngjException ^ (-6165791747575875761L)))] ^ (-6165791747575875761L))) + ((int) (PngjBadCrcException ^ (-6165791747575875761L))));
                    }
                } else {
                    i5 = 1;
                    j = 0;
                    j2 = -6165791747575875761L;
                }
                if (intValue > 0) {
                    int i17 = $11 + 83;
                    $10 = i17 % 128;
                    if (i17 % 2 != 0) {
                        i6 = ((i2 * intValue) % 3) - ((int) (PngjException / j2));
                    } else {
                        i6 = ((i2 + intValue) - 2) + ((int) (PngjException ^ j2));
                    }
                    pngjPrematureEnding.values = i6 + i7;
                    int i18 = PngjBadSignature;
                    Object[] objArr5 = new Object[4];
                    objArr5[3] = sb;
                    objArr5[2] = Integer.valueOf(i18);
                    objArr5[i5] = Integer.valueOf(i);
                    objArr5[0] = pngjPrematureEnding;
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1013119226);
                    if (PngjBadSignature5 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 45717), 39 - ImageFormat.getBitsPerPixel(0), 624 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), 1064463037, false, $$e(b9, b10, (byte) (b10 | 10)), new Class[]{Object.class, cls, cls, Object.class});
                    }
                    ((StringBuilder) ((Method) PngjBadSignature5).invoke(null, objArr5)).append(pngjPrematureEnding.valueOf);
                    pngjPrematureEnding.PngjBadCrcException = pngjPrematureEnding.valueOf;
                    byte[] bArr5 = valueOf;
                    if (bArr5 != null) {
                        int i19 = $11 + 87;
                        $10 = i19 % 128;
                        if (i19 % 2 != 0) {
                            length = bArr5.length;
                            bArr = new byte[length];
                        } else {
                            length = bArr5.length;
                            bArr = new byte[length];
                        }
                        for (int i20 = 0; i20 < length; i20++) {
                            bArr[i20] = (byte) (bArr5[i20] ^ j2);
                        }
                        bArr5 = bArr;
                    }
                    if (bArr5 != null) {
                        i8 = i5;
                        i9 = i8;
                    } else {
                        i8 = i5;
                        i9 = 0;
                    }
                    pngjPrematureEnding.PngjException = i8;
                    $11 = ($10 + 97) % 128;
                    while (pngjPrematureEnding.PngjException < intValue) {
                        if (i9 != 0) {
                            $11 = ($10 + 59) % 128;
                            byte[] bArr6 = valueOf;
                            pngjPrematureEnding.values = pngjPrematureEnding.values - 1;
                            pngjPrematureEnding.valueOf = (char) (pngjPrematureEnding.PngjBadCrcException + (((byte) (((byte) (bArr6[r3] ^ j2)) + s)) ^ b2));
                        } else {
                            short[] sArr = values;
                            pngjPrematureEnding.values = pngjPrematureEnding.values - 1;
                            pngjPrematureEnding.valueOf = (char) (pngjPrematureEnding.PngjBadCrcException + (((short) (((short) (sArr[r3] ^ j2)) + s)) ^ b2));
                        }
                        sb.append(pngjPrematureEnding.valueOf);
                        pngjPrematureEnding.PngjBadCrcException = pngjPrematureEnding.valueOf;
                        pngjPrematureEnding.PngjException++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void c(int i, byte b2, int i2, Object[] objArr) {
            int i3;
            int i4 = 112 - b2;
            byte[] bArr = $$a;
            int i5 = i2 + 4;
            byte[] bArr2 = new byte[i + 1];
            if (bArr == null) {
                int i6 = i;
                int i7 = i5;
                i3 = 0;
                int i8 = i5 + (-i6);
                i5 = i7;
                i4 = i8;
                int i9 = i5 + 1;
                bArr2[i3] = (byte) i4;
                if (i3 == i) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i3++;
                i6 = bArr[i9];
                i5 = i4;
                i7 = i9;
                int i82 = i5 + (-i6);
                i5 = i7;
                i4 = i82;
                int i92 = i5 + 1;
                bArr2[i3] = (byte) i4;
                if (i3 == i) {
                }
            } else {
                i3 = 0;
                int i922 = i5 + 1;
                bArr2[i3] = (byte) i4;
                if (i3 == i) {
                }
            }
        }

        public static void init$0() {
            $$a = new byte[]{126, -62, -66, -22, 10, -5, 52, -30, 7, -3, 37, -51, 21, -2, -11, -4, 11, -6, 1};
            $$b = 159;
        }

        public static void init$1() {
            $$c = new byte[]{125, 30, -81, 105};
            $$d = 14;
        }

        @Override // com.identy.i.PngjOutputException
        public final byte[] PngjBadCrcException(Template template, getPadSub3 getpadsub3, Activity activity, long j, TemplateSize templateSize, WSQCompression wSQCompression) {
            super.PngjBadCrcException(template, getpadsub3, activity, j, templateSize, wSQCompression);
            try {
                byte[] generateT = Fpnative.generateT(e1.values, new Mat(Mat.n_clone(getpadsub3.values(templateSize).PngjException)).PngjException, Template.ANSI_378_2004.ordinal(), Position.getFromHandFinger(new Pair(getpadsub3.PngjException, getpadsub3.PngjBadCrcException)).ordinal(), (float) wSQCompression.getCompression());
                PngjOutputException = (PngjExceptionInternal + 113) % 128;
                return generateT;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }),
    IDENTY_1(null),
    NIST_ITL_1_2015_RECORD_9(new com.identy.i.PngjException()),
    NIST_ITL_1_2015_RECORD_14(new PngjOutputException() { // from class: com.identy.i.PngjBadSignature
        @Override // com.identy.i.PngjOutputException
        public final byte[] PngjBadCrcException(Template template, getPadSub3 getpadsub3, Activity activity, long j, TemplateSize templateSize, WSQCompression wSQCompression) {
            super.PngjBadCrcException(template, getpadsub3, activity, j, templateSize, wSQCompression);
            try {
                return Fpnative.generateT(e1.values, new Mat(Mat.n_clone(getpadsub3.values(templateSize).PngjException)).PngjException, template.ordinal(), Position.getFromHandFinger(new Pair(getpadsub3.PngjException, getpadsub3.PngjBadCrcException)).ordinal(), (float) wSQCompression.getCompression());
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }),
    SLAP_WSQ(null),
    SLAP_PNG(null),
    FF_ISO_19794_4(null),
    FF_WSQ(null);

    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private final PngjOutputException a;

    static {
        init$0();
    }

    Template(PngjOutputException pngjOutputException) {
        this.a = pngjOutputException;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, int i2, short s, Object[] objArr) {
        int i3;
        int i4 = (s * 19) + 80;
        int i5 = i + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[44 - i2];
        int i6 = 43 - i2;
        if (bArr == null) {
            int i7 = i5;
            byte[] bArr3 = bArr;
            int i8 = 0;
            int i9 = i6;
            int i10 = (i9 + (-i5)) - 13;
            int i11 = i7;
            i4 = i10;
            i5 = i11;
            bArr = bArr3;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i12 = i5 + 1;
            int i13 = i4;
            i7 = i12;
            i5 = bArr[i12];
            i8 = i3 + 1;
            bArr3 = bArr;
            i9 = i13;
            int i102 = (i9 + (-i5)) - 13;
            int i112 = i7;
            i4 = i102;
            i5 = i112;
            bArr = bArr3;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    public static Template getFromOrdinal(Integer num) {
        Object[] objArr;
        long j;
        Template[] valuesCustom;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myUid = Process.myUid();
                    int i = ~myUid;
                    int c = defpackage.a.c(~(i | 14196864), 301, (((~(myUid | (-484692416))) | 12615808 | (~(486273471 | i))) * (-301)) + (((~((-484692416) | i)) | 14196864) * (-602)) + 318995666, 51546506);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4971;
                    Fpnative.valueOf = objArr;
                    valuesCustom = valuesCustom();
                    if (num.intValue() < valuesCustom.length || num.intValue() < 0) {
                        return null;
                    }
                    return valuesCustom[num.intValue()];
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c((byte) (bArr[63] - 1), (byte) (-bArr[34]), (byte) (bArr[25] - 1), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((byte) (-bArr[60]), (byte) 38, bArr[25], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 51546506);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4971;
            Fpnative.valueOf = objArr;
            valuesCustom = valuesCustom();
            if (num.intValue() < valuesCustom.length) {
            }
            return null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void init$0() {
        $$a = new byte[]{15, -119, -68, 8, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -70, 44, -47, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, 8, -24, -22, 3, -27, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -36, -54, -17, -10, -10, -13, 43, -31, -8, -47, -30, -2, -26, 0, -24, -18, 72, -57, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12};
        $$b = 168;
    }

    public static Template valueOfString(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~(((int) Process.getStartUptimeMillis()) | 1073053125)) | 472975365, 366, (((~(523569605 | r0)) | 1022458885) * (-366)) - 253605313, 211946044);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4957;
                    Fpnative.valueOf = objArr;
                    return (Template) Enum.valueOf(Template.class, str);
                }
            }
            byte[] bArr = $$a;
            byte b2 = (byte) (-bArr[75]);
            byte b3 = bArr[63];
            Object[] objArr3 = new Object[1];
            c(b2, b3, (byte) (b3 + 1), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((byte) 78, (byte) (-bArr[4]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 211946044);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4957;
            Fpnative.valueOf = objArr;
            return (Template) Enum.valueOf(Template.class, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static Template[] valuesCustom() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = ~((int) Process.getStartUptimeMillis());
                    int c = defpackage.a.c((~((-820962466) | i)) | 550274176 | (~(322073185 | i)), 184, (((~(i | 872347361)) | (~((-270688290) | i))) * (-184)) - 1102424841, -425717918);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4867;
                    Fpnative.valueOf = objArr;
                    return (Template[]) values().clone();
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c((byte) (bArr[63] - 1), (byte) (-bArr[34]), (byte) (bArr[25] - 1), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((byte) (-bArr[60]), (byte) 38, bArr[25], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 439168538);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4867;
            Fpnative.valueOf = objArr;
            return (Template[]) values().clone();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final PngjOutputException getGenerator() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c(~(((int) Runtime.getRuntime().totalMemory()) | (-17009707)), -1504, (((~((-591396523) | r0)) | 574386816) * 1504) - 1003693777, -876852101);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5049;
                    Fpnative.valueOf = objArr;
                    return this.a;
                }
            }
            byte[] bArr = $$a;
            byte b2 = (byte) (-bArr[75]);
            byte b3 = bArr[63];
            Object[] objArr3 = new Object[1];
            c(b2, b3, (byte) (b3 + 1), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((byte) 78, (byte) (-bArr[4]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1790090389);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5049;
            Fpnative.valueOf = objArr;
            return this.a;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
