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
            arid.chunks.valueOf.PngjBadCrcException(valuesVar.values, attempt.new PngjException(pngjPrematureEnding));
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
        private static byte[] $$a = null;
        private static int $$b = 0;
        private static byte[] $$c = null;
        private static int $$d = 0;
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

        /* Method not decompiled: com.identy.i.values.PngjBadSignature - contains unrecoverable register variable references */
        public static Object[] PngjBadSignature(Context context, int i, int i2, int i3) {
            throw new UnsupportedOperationException("Method not decompiled: com.identy.i.values.PngjBadSignature");
        }

        /* Method not decompiled: com.identy.i.values.a - contains unrecoverable register variable references */
        private static void a(String str, int i, char c, String str2, String str3, Object[] objArr) {
            throw new UnsupportedOperationException("Method not decompiled: com.identy.i.values.a");
        }

        /* Method not decompiled: com.identy.i.values.b - contains unrecoverable register variable references */
        private static void b(short s, int i, int i2, byte b2, int i3, Object[] objArr) {
            throw new UnsupportedOperationException("Method not decompiled: com.identy.i.values.b");
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

    private static byte[] $$a = null;
    private static int $$b = 0;
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
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
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
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~(((int) Process.getStartUptimeMillis()) | 1073053125)) | 472975365, 366, (((~(523569605 | 0)) | 1022458885) * (-366)) - 253605313, 211946044);
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
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
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
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c(~(((int) Runtime.getRuntime().totalMemory()) | (-17009707)), -1504, (((~((-591396523) | 0)) | 574386816) * 1504) - 1003693777, -876852101);
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
