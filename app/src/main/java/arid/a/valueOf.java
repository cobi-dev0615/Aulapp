package arid.a;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import arid.e1;
import com.d.e.PngjExceptionInternal;
import com.d.e.PngjUnsupportedException;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.R;
import java.io.OutputStream;
import java.lang.reflect.Method;
import kotlin.io.ConstantsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.uuid.Uuid;

/* loaded from: classes.dex */
public abstract class valueOf extends OutputStream implements AutoCloseable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10;
    private static int $11;
    private static int Action;
    private static boolean PngBadCharsetException;
    private static char[] PngjOutputException;
    private static long a;
    private static int e1;
    private static int getPadSub2;
    private static boolean onErrorResponse;
    private long PngjExceptionInternal;
    private int PngjInputException;
    protected e1 valueOf;
    boolean PngjException = false;
    protected boolean values = false;
    protected long PngjBadCrcException = 0;
    protected long PngjBadSignature = 0;
    private int PngjPrematureEnding = -1;
    private boolean PngjUnsupportedException = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$e(byte b, int i, short s) {
        int i2;
        int i3;
        int i4 = (s * 2) + 1;
        byte[] bArr = $$c;
        int i5 = i + 4;
        int i6 = b + 97;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            i6 = i4;
            byte[] bArr3 = bArr;
            i3 = 0;
            int i7 = i5;
            i6 += -i5;
            i5 = i7;
            bArr = bArr3;
            i2 = i3;
            i3 = i2 + 1;
            int i8 = i5 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
                return new String(bArr2, 0);
            }
            byte b2 = bArr[i8];
            byte[] bArr4 = bArr;
            i7 = i8;
            i5 = b2;
            bArr3 = bArr4;
            i6 += -i5;
            i5 = i7;
            bArr = bArr3;
            i2 = i3;
            i3 = i2 + 1;
            int i82 = i5 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            int i822 = i5 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        e1 = 0;
        getPadSub2 = 1;
        PngjOutputException = new char[]{25178, 25191, 25510, 25184, 25193, 25196, 25183, 25197, 25511, 25180, 25195, 25185, 25190, 25188, 25187, 25509, 25194, 25181, 25199, 25179, 25182, 25176, 25189, 25177, 25499, 25207, 25198, 25169, 25168, 25203, 25496, 25489, 25205, 25507};
        Action = -2081201208;
        onErrorResponse = true;
        PngBadCharsetException = true;
        a = 7780316455206619931L;
    }

    public valueOf(e1 e1Var, int i, long j) {
        this.valueOf = e1Var;
        i = i < 0 ? ConstantsKt.DEFAULT_BLOCK_SIZE : i;
        j = j < 0 ? LongCompanionObject.MAX_VALUE : j;
        if (i <= 0 || j < 1) {
            throw new RuntimeException(" maxBlockLen or totalLen invalid");
        }
        this.PngjInputException = i;
        this.PngjExceptionInternal = j;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r4v1167 int), method size: 15035
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static java.lang.Object[] PngjException$1eba2e16(int r84, java.lang.Object r85, int r86) {
        /*
            Method dump skipped, instructions count: 15035
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: arid.a.valueOf.PngjException$1eba2e16(int, java.lang.Object, int):java.lang.Object[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, short s, Object[] objArr) {
        int i;
        int i2;
        int i3;
        byte[] bArr = $$a;
        ?? r9 = 101 - (s * 4);
        int i4 = b + 1;
        int i5 = 3 - (b2 * 4);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            byte b3 = r9;
            i3 = 0;
            int i6 = i5;
            int i7 = (i5 + (-b3)) - 52;
            int i8 = i6;
            i2 = i7;
            i5 = i8;
            i = i3;
            i3 = i + 1;
            bArr2[i] = (byte) i2;
            int i9 = i5 + 1;
            if (i3 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            b3 = bArr[i9];
            int i10 = i2;
            i6 = i9;
            i5 = i10;
            int i72 = (i5 + (-b3)) - 52;
            int i82 = i6;
            i2 = i72;
            i5 = i82;
            i = i3;
            i3 = i + 1;
            bArr2[i] = (byte) i2;
            int i92 = i5 + 1;
            if (i3 == i4) {
            }
        } else {
            i = 0;
            i2 = r9;
            i3 = i + 1;
            bArr2[i] = (byte) i2;
            int i922 = i5 + 1;
            if (i3 == i4) {
            }
        }
    }

    private static void c(int[] iArr, int i, String str, String str2, Object[] objArr) {
        long j;
        int i2;
        char c;
        String str3 = str2;
        $10 = ($11 + 33) % Uuid.SIZE_BITS;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        PngjExceptionInternal pngjExceptionInternal = new PngjExceptionInternal();
        char[] cArr = PngjOutputException;
        Class cls = Integer.TYPE;
        if (cArr != null) {
            $11 = ($10 + 79) % Uuid.SIZE_BITS;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i3])};
                    Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(358189806);
                    if (PngjBadSignature == null) {
                        PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((ViewConfiguration.getTapTimeout() >> 16) + 27092), 37 - (ViewConfiguration.getTouchSlop() >> 8), ((byte) KeyEvent.getModifierMetaStateMask()) + 119, -373889195, false, "b", new Class[]{cls});
                    }
                    cArr2[i3] = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            $11 = ($10 + 31) % Uuid.SIZE_BITS;
            cArr = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(Action)};
        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1639226071);
        if (PngjBadSignature2 == null) {
            char lastIndexOf = (char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 61714);
            int myPid = (Process.myPid() >> 22) + 34;
            int i4 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 277;
            byte length2 = (byte) $$c.length;
            j = 0;
            byte b = (byte) (length2 - 5);
            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(lastIndexOf, myPid, i4, -1654917268, false, $$e(length2, b, (byte) (b + 1)), new Class[]{cls});
        } else {
            j = 0;
        }
        int intValue = ((Integer) ((Method) PngjBadSignature2).invoke(null, objArr3)).intValue();
        int i5 = -528960794;
        int i6 = 2;
        char c2 = 1;
        if (PngBadCharsetException) {
            int length3 = bArr2.length;
            pngjExceptionInternal.PngjException = length3;
            char[] cArr3 = new char[length3];
            pngjExceptionInternal.values = 0;
            while (true) {
                int i7 = pngjExceptionInternal.values;
                int i8 = pngjExceptionInternal.PngjException;
                if (i7 >= i8) {
                    objArr[0] = new String(cArr3);
                    return;
                }
                cArr3[i7] = (char) (cArr[bArr2[(i8 - 1) - i7] + i] - intValue);
                Object[] objArr4 = new Object[i6];
                objArr4[c2] = pngjExceptionInternal;
                objArr4[0] = pngjExceptionInternal;
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i5);
                if (PngjBadSignature3 == null) {
                    i2 = i5;
                    byte b2 = (byte) 0;
                    c = c2;
                    byte b3 = (byte) (b2 - 1);
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1))), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 37, 548 - ((byte) KeyEvent.getModifierMetaStateMask()), 479715165, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
                } else {
                    i2 = i5;
                    c = c2;
                }
                ((Method) PngjBadSignature3).invoke(null, objArr4);
                i5 = i2;
                c2 = c;
                i6 = 2;
            }
        } else if (onErrorResponse) {
            int length4 = charArray.length;
            pngjExceptionInternal.PngjException = length4;
            char[] cArr4 = new char[length4];
            pngjExceptionInternal.values = 0;
            while (true) {
                int i9 = pngjExceptionInternal.values;
                int i10 = pngjExceptionInternal.PngjException;
                if (i9 >= i10) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                cArr4[i9] = (char) (cArr[charArray[(i10 - 1) - i9] - i] - intValue);
                Object[] objArr5 = {pngjExceptionInternal, pngjExceptionInternal};
                Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-528960794);
                if (PngjBadSignature4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 36, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 549, 479715165, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature4).invoke(null, objArr5);
            }
        } else {
            int length5 = iArr.length;
            pngjExceptionInternal.PngjException = length5;
            char[] cArr5 = new char[length5];
            pngjExceptionInternal.values = 0;
            while (true) {
                int i11 = pngjExceptionInternal.values;
                int i12 = pngjExceptionInternal.PngjException;
                if (i11 >= i12) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                int i13 = $11 + 107;
                $10 = i13 % Uuid.SIZE_BITS;
                if (i13 % 2 != 0) {
                    cArr5[i11] = (char) (cArr[iArr[i12 - i11] + i] / intValue);
                } else {
                    cArr5[i11] = (char) (cArr[iArr[(i12 - 1) - i11] - i] - intValue);
                    i11++;
                }
                pngjExceptionInternal.values = i11;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x010c, code lost:
    
        r2[r4] = (char) r3[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0112, code lost:
    
        r0 = new java.lang.Object[]{r1, r1};
        r1 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-125632871);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011d, code lost:
    
        if (r1 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011f, code lost:
    
        r3 = (byte) (-1);
        r1 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 35511), android.view.Gravity.getAbsoluteGravity(0, 0) + 42, android.text.TextUtils.lastIndexOf(com.karumi.dexter.BuildConfig.FLAVOR, '0', 0, 0) + 508, 74289954, false, $$e((byte) 23, r3, (byte) (r3 + 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x014c, code lost:
    
        ((java.lang.reflect.Method) r1).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0151, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(String str, int i, Object[] objArr) {
        char[] cArr;
        Throwable cause;
        int i2;
        char c;
        int i3;
        if (str != null) {
            cArr = str.toCharArray();
            $10 = ($11 + R.styleable.AppCompatTheme_tooltipFrameBackground) % Uuid.SIZE_BITS;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        PngjUnsupportedException pngjUnsupportedException = new PngjUnsupportedException();
        pngjUnsupportedException.PngjBadCrcException = i;
        int length = cArr2.length;
        long[] jArr = new long[length];
        int i4 = 0;
        pngjUnsupportedException.valueOf = 0;
        while (true) {
            int i5 = pngjUnsupportedException.valueOf;
            if (i5 >= cArr2.length) {
                break;
            }
            char c2 = cArr2[i5];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[2] = pngjUnsupportedException;
                objArr2[1] = pngjUnsupportedException;
                objArr2[i4] = Integer.valueOf(c2);
                Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(-930920279);
                if (PngjBadSignature == null) {
                    i3 = -125632871;
                    c = 1;
                    byte b = (byte) (-1);
                    i2 = i4;
                    PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (Process.myTid() >> 22), Gravity.getAbsoluteGravity(i4, i4) + 48, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 944, 879502610, false, $$e((byte) ($$d >>> 2), b, (byte) (b + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                } else {
                    i2 = i4;
                    c = 1;
                    i3 = -125632871;
                }
                jArr[i5] = ((Long) ((Method) PngjBadSignature).invoke(null, objArr2)).longValue() ^ (a ^ 2636593786896957769L);
                Object[] objArr3 = new Object[2];
                objArr3[c] = pngjUnsupportedException;
                objArr3[i2] = pngjUnsupportedException;
                Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                if (PngjBadSignature2 == null) {
                    byte b2 = (byte) (-1);
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 35511), (ViewConfiguration.getTouchSlop() >> 8) + 42, Color.red(i2) + 507, 74289954, false, $$e((byte) 23, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature2).invoke(null, objArr3);
                i4 = i2;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr3 = new char[length];
        pngjUnsupportedException.valueOf = i4;
        while (true) {
            int i6 = pngjUnsupportedException.valueOf;
            if (i6 >= cArr2.length) {
                objArr[0] = new String(cArr3);
                return;
            }
            int i7 = $11 + 57;
            $10 = i7 % Uuid.SIZE_BITS;
            if (i7 % 2 != 0) {
                break;
            }
            cArr3[i6] = (char) jArr[i6];
            Object[] objArr4 = {pngjUnsupportedException, pngjUnsupportedException};
            Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-125632871);
            if (PngjBadSignature3 == null) {
                byte b3 = (byte) (-1);
                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (35511 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0)), 42 - View.getDefaultSize(0, 0), 508 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 74289954, false, $$e((byte) 23, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) PngjBadSignature3).invoke(null, objArr4);
        }
    }

    public static void init$0() {
        $$a = new byte[]{25, Base64.padSymbol, -16, 69, 0};
        $$b = 195;
    }

    public static void init$1() {
        $$c = new byte[]{105, 69, 94, -3};
        $$d = 73;
    }

    public abstract void PngjBadCrcException(byte[] bArr, int i, int i2);

    public abstract void PngjBadSignature();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i = e1 + 41;
        getPadSub2 = i % Uuid.SIZE_BITS;
        if (i % 2 == 0) {
            PngjBadSignature();
            throw null;
        }
        PngjBadSignature();
        e1 e1Var = this.valueOf;
        if (e1Var != null) {
            e1Var.PngjException();
            e1Var.values = 0;
            e1Var.valueOf = null;
            getPadSub2 = (e1 + R.styleable.AppCompatTheme_tooltipFrameBackground) % Uuid.SIZE_BITS;
        }
        this.PngjException = true;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        int length;
        int i;
        int i2 = getPadSub2 + 55;
        e1 = i2 % Uuid.SIZE_BITS;
        if (i2 % 2 != 0) {
            length = bArr.length;
            i = 1;
        } else {
            length = bArr.length;
            i = 0;
        }
        write(bArr, i, length);
        int i3 = e1 + 93;
        getPadSub2 = i3 % Uuid.SIZE_BITS;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        PngjBadCrcException(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (r6 <= 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        PngjBadCrcException(r4, r5, r3.PngjInputException);
        r0 = r3.PngjInputException;
        r5 = r5 + r0;
        r6 = r6 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x001f, code lost:
    
        if (r6 <= r3.PngjInputException) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r6 <= r3.PngjInputException) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        r0 = r0 + 7;
        arid.a.valueOf.getPadSub2 = r0 % kotlin.uuid.Uuid.SIZE_BITS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if ((r0 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        PngjBadCrcException(r4, r5, r6);
     */
    @Override // java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void write(byte[] bArr, int i, int i2) {
        int i3 = e1;
        int i4 = i3 + 97;
        getPadSub2 = i4 % Uuid.SIZE_BITS;
        if (i4 % 2 == 0) {
            this.PngjPrematureEnding >>>= 1;
        } else {
            this.PngjPrematureEnding++;
        }
        if (this.PngjBadCrcException >= this.PngjExceptionInternal) {
            getPadSub2 = (e1 + 65) % Uuid.SIZE_BITS;
            PngjBadSignature();
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        getPadSub2 = (e1 + 55) % Uuid.SIZE_BITS;
        write(new byte[]{(byte) i});
        int i2 = e1 + 49;
        getPadSub2 = i2 % Uuid.SIZE_BITS;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}
