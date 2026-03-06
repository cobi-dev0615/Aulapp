package arid;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import arid.chunks.Attempt;
import com.identy.getOveralTimetaken;
import com.karumi.dexter.BuildConfig;
import java.io.Closeable;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class onErrorResponse implements Closeable, AutoCloseable {
    private static byte[] $$a = null;
    private static int $$b = 0;
    private static final Logger PngBadCharsetException;
    public Action PngjException;
    public final OutputStream PngjInputException;
    public arid.a.PngjException PngjPrematureEnding;
    public final arid.chunks.values valueOf;
    public final Attempt values;
    public int PngjBadCrcException = -1;
    public int PngjBadSignature = -1;
    private final int Action = 1;
    public int PngjUnsupportedException = 0;
    private boolean onErrorResponse = true;
    public int PngjExceptionInternal = 0;
    private arid.chunks.PngjBadCrcException a = null;
    public arid.chunks.PngjException PngjOutputException = null;
    private StringBuilder e1 = new StringBuilder();

    static {
        init$0();
        PngBadCharsetException = Logger.getLogger(onErrorResponse.class.getName());
    }

    public onErrorResponse(OutputStream outputStream, Action action) throws Throwable {
        Object[] PngjBadCrcException$52c725b;
        int i;
        this.PngjInputException = outputStream;
        this.PngjException = action;
        arid.chunks.values valuesVar = new arid.chunks.values(action);
        this.valueOf = valuesVar;
        this.values = new Attempt(valuesVar);
        arid.a.values valuesVar2 = new arid.a.values(action);
        this.PngjPrematureEnding = valuesVar2;
        Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
        if (PngjBadSignature == null) {
            char resolveSize = (char) (View.resolveSize(0, 0) + 14830);
            int rgb = Color.rgb(0, 0, 0) + 16777244;
            int size = 721 - View.MeasureSpec.getSize(0);
            byte b = $$a[18];
            byte b2 = (byte) (b - 1);
            byte b3 = b;
            Object[] objArr = new Object[1];
            b(b2, b3, (byte) (b3 - 1), objArr);
            PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(resolveSize, rgb, size, -815159504, false, (String) objArr[0], null);
        }
        long j = ((Field) PngjBadSignature).getLong(null);
        if (j == -1 || j + 1946 < ((Long) defpackage.a.i("android.os.SystemClock", "elapsedRealtime", null, null, null)).longValue()) {
            int intValue = ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, valuesVar2)).intValue();
            try {
                Object[] objArr2 = {188688844};
                Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
                PngjBadCrcException$52c725b = ((com.identy.getOveralTimetaken.PngjException) null).PngjBadCrcException$52c725b(intValue, ((Constructor) (PngjBadSignature2 == null ? com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0)), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 25, 697 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), 1457201313, false, null, new Class[]{Integer.TYPE}) : PngjBadSignature2)).newInstance(objArr2));
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                if (PngjBadSignature3 == null) {
                    char indexOf = (char) (14830 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0));
                    int i2 = 29 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 721;
                    byte b4 = $$a[18];
                    byte b5 = (byte) (b4 - 1);
                    i = 0;
                    Object[] objArr3 = new Object[1];
                    b(b5, b5, b4, objArr3);
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf, i2, threadPriority, -779023007, false, (String) objArr3[0], null);
                } else {
                    i = 0;
                }
                ((Field) PngjBadSignature3).set(null, PngjBadCrcException$52c725b);
                try {
                    Long valueOf = Long.valueOf(((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", null).invoke(null, null)).longValue());
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
                    if (PngjBadSignature4 == null) {
                        char axisFromString = (char) (MotionEvent.axisFromString(BuildConfig.FLAVOR) + 14831);
                        int maximumFlingVelocity = 28 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int indexOf2 = TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 721;
                        byte b6 = $$a[18];
                        byte b7 = (byte) (b6 - 1);
                        byte b8 = b6;
                        Object[] objArr4 = new Object[1];
                        b(b7, b8, (byte) (b8 - 1), objArr4);
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(axisFromString, maximumFlingVelocity, indexOf2, -815159504, false, (String) objArr4[i], null);
                    }
                    ((Field) PngjBadSignature4).set(null, valueOf);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } else {
            throw new UnsupportedOperationException("Method not decompiled: else branch of onErrorResponse constructor");
        }
        int i9 = ((int[]) PngjBadCrcException$52c725b[i])[i];
        int i10 = ((int[]) PngjBadCrcException$52c725b[3])[i];
        if (i10 == i9) {
            Object[] objArr7 = new Object[4];
            int[] iArr = new int[1];
            objArr7[i] = iArr;
            objArr7[1] = new int[1];
            int[] iArr2 = new int[1];
            objArr7[3] = iArr2;
            int i11 = ((int[]) PngjBadCrcException$52c725b[1])[i];
            int i12 = ((int[]) PngjBadCrcException$52c725b[3])[i];
            int i13 = ((int[]) PngjBadCrcException$52c725b[i])[i];
            String[] strArr2 = (String[]) PngjBadCrcException$52c725b[2];
            iArr2[i] = i12;
            iArr[i] = i13;
            objArr7[2] = strArr2;
            int i14 = (int) Runtime.getRuntime().totalMemory();
            int c2 = defpackage.a.c((~(i14 | (-26274011))) | 1065050 | (~((~i14) | 1033500923)), 988, (((~((-25208961) | i14)) | (~(1033500923 | i14))) * 988) - 257655667, i11);
            int i15 = c2 ^ (c2 << 13);
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr7[1])[i] = i16 ^ (i16 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) PngjBadCrcException$52c725b[2];
            if (strArr3 != null) {
                for (int i17 = i; i17 < strArr3.length; i17++) {
                    arrayList.add(strArr3[i17]);
                }
            }
            int[] iArr3 = new int[i10];
            int i18 = i10 - 1;
            iArr3[i18] = 1;
            Toast.makeText((Context) null, iArr3[((i10 * i18) % 2) - 1], 1).show();
            Object[] objArr8 = new Object[4];
            int[] iArr4 = new int[1];
            objArr8[i] = iArr4;
            objArr8[1] = new int[1];
            int[] iArr5 = new int[1];
            objArr8[3] = iArr5;
            int i19 = ((int[]) PngjBadCrcException$52c725b[1])[i];
            int i20 = ((int[]) PngjBadCrcException$52c725b[3])[i];
            int i21 = ((int[]) PngjBadCrcException$52c725b[i])[i];
            String[] strArr4 = (String[]) PngjBadCrcException$52c725b[2];
            iArr5[i] = i20;
            iArr4[i] = i21;
            objArr8[2] = strArr4;
            int myPid = Process.myPid();
            int c3 = defpackage.a.c((~(myPid | 180613901)) | 853952072, 272, (((~((-180613902) | myPid)) | 134328581) * (-272)) + ((((~((-46285321) | (~myPid))) | (~(988280653 | myPid))) * (-272)) - 1724790107), i19);
            int i22 = c3 ^ (c3 << 13);
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr8[1])[i] = i23 ^ (i23 << 5);
        }
        valuesVar2.values = 9;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, short s, Object[] objArr) {
        int i3;
        int i4;
        int i5 = 21 - (i2 * 18);
        int i6 = 80 - (i * 2);
        int i7 = 19 - (s * 6);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            i6 = i7;
            byte[] bArr3 = bArr;
            i4 = 0;
            int i8 = i5;
            i6 = i6 + (-i5) + 5;
            i5 = i8;
            bArr = bArr3;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i9 = i5 + 1;
            byte b = bArr[i9];
            byte[] bArr4 = bArr;
            i8 = i9;
            i5 = b;
            bArr3 = bArr4;
            i6 = i6 + (-i5) + 5;
            i5 = i8;
            bArr = bArr3;
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

    public static void init$0() {
        $$a = new byte[]{64, -40, -69, -46, -25, 12, 2, 45, -26, 2, 38, -42, 20, 35, -46, 26, 3, -6, 1, 16, -1, 6, -25, 12, 2, 42, -46, 26, 3, -6, 1, 16, -1, 6};
        $$b = 162;
    }

    public final void PngjBadCrcException() {
        if (this.PngjBadCrcException != this.PngjException.valueOf - 1 || !this.PngjPrematureEnding.PngjExceptionInternal()) {
            throw new PngjOutputException("all rows have not been written");
        }
        try {
            arid.a.PngjException pngjException = this.PngjPrematureEnding;
            if (pngjException != null) {
                pngjException.PngjBadCrcException();
            }
            if (this.PngjBadSignature < 5) {
                this.PngjBadSignature = 5;
                this.valueOf.PngjException(this.PngjInputException, 5);
                List list = this.valueOf.values;
                if (!list.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(list.size());
                    sb.append(" chunks were not written! Eg: ");
                    sb.append(((arid.chunks.PngjInputException) list.get(0)).toString());
                    throw new PngjOutputException(sb.toString());
                }
            }
            if (this.PngjBadSignature < 6) {
                this.PngjBadSignature = 6;
                arid.chunks.PngjExceptionInternal pngjExceptionInternal = new arid.chunks.PngjExceptionInternal(this.PngjException);
                pngjExceptionInternal.values().PngjBadCrcException(this.PngjInputException);
                this.valueOf.valueOf.add(pngjExceptionInternal);
            }
            close();
        } catch (Throwable th) {
            close();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        OutputStream outputStream;
        arid.a.PngjException pngjException = this.PngjPrematureEnding;
        if (pngjException != null) {
            pngjException.PngjBadCrcException();
        }
        if (!this.onErrorResponse || (outputStream = this.PngjInputException) == null) {
            return;
        }
        try {
            outputStream.close();
        } catch (Exception e) {
            PngBadCharsetException.warning("Error closing writer ".concat(String.valueOf(e)));
        }
    }
}
