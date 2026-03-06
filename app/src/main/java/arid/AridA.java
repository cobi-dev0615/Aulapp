package arid;

import android.content.Context;
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
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.identy.isAuthSucess;
import com.karumi.dexter.BuildConfig;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes.dex */
public final class AridA {
    public static Charset valueOf;

    public class PngjBadCrcException extends ThreadLocal {
        private static byte[] $$a = null;
        private static int $$b = 0;
        private static byte[] $$c = null;
        private static int $$d = 0;
        private static int $10;
        private static int $11;
        private static int PngjBadSignature;
        private static char[] PngjException;
        private static int valueOf;
        private static int values;

        private static String $$e(short s, short s2, int i) {
            int i2 = (s2 * 2) + 4;
            int i3 = 104 - i;
            int i4 = s * 4;
            byte[] bArr = $$c;
            byte[] bArr2 = new byte[i4 + 1];
            int i5 = -1;
            if (bArr == null) {
                i3 += i4;
                i2++;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i3;
                if (i5 == i4) {
                    return new String(bArr2, 0);
                }
                i3 += bArr[i2];
                i2++;
            }
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            PngjBadSignature = 0;
            valueOf = 1;
            values = 97774025;
            PngjException = new char[]{40102, 40176, 40182, 40188, 40165, 40189, 40182, 40189, 40186, 40191, 40184, 40167, 40134, 40154, 40189, 40184, 40167, 40162, 40162, 40133, 40098, 40153, 40156, 40179, 40185, 40186, 40189, 40157, 40147, 40179, 40189, 40191, 40164, 40184, 40178, 40157, 40157, 40184, 40191, 40178, 40153, 40132, 40165, 40188, 40182, 40176, 40158, 40134, 40165, 40154, 40157, 40182, 40190, 40190, 40156, 40157, 40182, 40190, 40190, 40156, 40157, 40189, 40102, 40189, 40179, 40131, 40141, 40178, 40176, 40178, 40179, 40182, 40140, 40182, 40184, 40178, 40174, 40091, 39958, 40336, 40041, 40061, 40054, 40081, 40107, 40186, 40164, 40186, 40111, 40166, 40191, 40188, 40185, 40154, 39950, 39949, 39950, 40076, 40159, 40190, 40191, 40185, 40165, 40185, 40152, 40155, 40164, 40191, 40132, 40133, 40188, 40178, 40188, 40189, 40176, 40190, 40145, 39960, 39963, 39941, 39965, 39952, 39954, 39964, 39941, 39963, 39954, 39940, 39940, 40096, 40190, 40188, 40142, 40183, 40166, 40189, 40191, 40141, 40140, 40164, 40184, 40186, 40181, 40181, 40164, 40190};
        }

        /* JADX WARN: Type inference failed for: r13v246 */
        /* JADX WARN: Type inference failed for: r13v257 */
        /* JADX WARN: Type inference failed for: r13v30 */
        /* JADX WARN: Type inference failed for: r13v42 */
        public static Object[] PngjBadCrcException(Context context, int i, int i2, int i3) {
            throw new UnsupportedOperationException("Method not decompiled: arid.AridA.PngjBadCrcException.PngjBadCrcException(android.content.Context, int, int, int):java.lang.Object[]");
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x015e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, boolean z, String str, int i2, int i3, Object[] objArr) throws Throwable {
            Throwable cause;
            char c;
            int i4;
            int i5 = $11 + 41;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            char[] charArray = str != null ? str.toCharArray() : null;
            com.d.e.Action action = new com.d.e.Action();
            char[] cArr = new char[i];
            action.valueOf = 0;
            while (true) {
                int i6 = action.valueOf;
                if (i6 >= i) {
                    break;
                }
                $11 = ($10 + 53) % 128;
                char c2 = charArray[i6];
                action.values = c2;
                char c3 = (char) (i3 + c2);
                cArr[i6] = c3;
                try {
                    Object[] objArr2 = {Integer.valueOf(c3), Integer.valueOf(values)};
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(610361420);
                    if (PngjBadSignature2 == null) {
                        char resolveSize = (char) View.resolveSize(0, 0);
                        int deadChar = 28 - KeyEvent.getDeadChar(0, 0);
                        int lastIndexOf = TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 1532;
                        byte b = (byte) 0;
                        i4 = -743328348;
                        byte b2 = b;
                        c = 1;
                        String $$e = $$e(b, b2, b2);
                        Class cls = Integer.TYPE;
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(resolveSize, deadChar, lastIndexOf, -661778953, false, $$e, new Class[]{cls, cls});
                    } else {
                        c = 1;
                        i4 = -743328348;
                    }
                    cArr[i6] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = new Object[2];
                    objArr3[c] = action;
                    objArr3[0] = action;
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i4);
                    if (PngjBadSignature3 == null) {
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 39, 190 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 794744863, false, "j", new Class[]{Object.class, Object.class});
                    }
                    ((Method) PngjBadSignature3).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            if (i2 > 0) {
                $10 = ($11 + 33) % 128;
                action.PngjException = i2;
                char[] cArr2 = new char[i];
                System.arraycopy(cArr, 0, cArr2, 0, i);
                int i7 = action.PngjException;
                System.arraycopy(cArr2, 0, cArr, i - i7, i7);
                int i8 = action.PngjException;
                System.arraycopy(cArr2, i8, cArr, 0, i - i8);
            }
            if (z) {
                char[] cArr3 = new char[i];
                action.valueOf = 0;
                $11 = ($10 + 85) % 128;
                while (true) {
                    int i9 = action.valueOf;
                    if (i9 >= i) {
                        break;
                    }
                    $10 = ($11 + 23) % 128;
                    cArr3[i9] = cArr[(i - i9) - 1];
                    Object[] objArr4 = {action, action};
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-743328348);
                    if (PngjBadSignature4 == null) {
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 40, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 189, 794744863, false, "j", new Class[]{Object.class, Object.class});
                    }
                    ((Method) PngjBadSignature4).invoke(null, objArr4);
                }
                cArr = cArr3;
            }
            String str2 = new String(cArr);
            $11 = ($10 + 19) % 128;
            objArr[0] = str2;
        }

        private static void b(byte b, int i, int i2, Object[] objArr) {
            int i3 = i2 + 80;
            int i4 = b + 5;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i + 1];
            int i5 = -1;
            if (bArr == null) {
                i3 = i4 + (-i);
                i4 = i4;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i3;
                if (i5 == i) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i6 = i4 + 1;
                i3 += -bArr[i6];
                i4 = i6;
            }
        }

        private static void c(String str, boolean z, int[] iArr, Object[] objArr) throws Throwable {
            int i;
            int i2;
            byte[] bArr;
            int i3;
            String str2 = str;
            byte[] bArr2 = str2 != null ? str2.getBytes() : null;
            if (str2 != null) {
                bArr2 = str2.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1);
            }
            byte[] bArr3 = bArr2;
            com.d.e.e1 e1Var = new com.d.e.e1();
            int i4 = 0;
            int i5 = iArr[0];
            int i6 = iArr[1];
            int i7 = iArr[2];
            int i8 = iArr[3];
            char[] cArr = PngjException;
            Class cls = Integer.TYPE;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                i = 2;
                $10 = ($11 + 59) % 128;
                int i9 = 0;
                while (i9 < length) {
                    int i10 = $10 + 107;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                            Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-259747866);
                            if (PngjBadSignature2 == null) {
                                bArr = bArr3;
                                byte b = (byte) i4;
                                i3 = i9;
                                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), Drawable.resolveOpacity(i4, i4) + 35, 1313 - (KeyEvent.getMaxKeyCode() >> 16), 208396893, false, $$e(b, b, (byte) $$c.length), new Class[]{cls});
                            } else {
                                bArr = bArr3;
                                i3 = i9;
                            }
                            cArr2[i3] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                            i9 = i3;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        bArr = bArr3;
                        int i11 = i9;
                        Object[] objArr3 = {Integer.valueOf(cArr[i11])};
                        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-259747866);
                        if (PngjBadSignature3 == null) {
                            byte b2 = (byte) 0;
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35, 1313 - View.MeasureSpec.makeMeasureSpec(0, 0), 208396893, false, $$e(b2, b2, (byte) $$c.length), new Class[]{cls});
                        }
                        cArr2[i11] = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr3)).charValue();
                        i9 = i11 + 1;
                    }
                    bArr3 = bArr;
                    i4 = 0;
                }
                cArr = cArr2;
            } else {
                i = 2;
            }
            byte[] bArr4 = bArr3;
            char[] cArr3 = new char[i6];
            System.arraycopy(cArr, i5, cArr3, 0, i6);
            if (bArr4 != null) {
                $10 = ($11 + 11) % 128;
                char[] cArr4 = new char[i6];
                e1Var.PngjBadSignature = 0;
                char c = 0;
                while (true) {
                    int i12 = e1Var.PngjBadSignature;
                    if (i12 >= i6) {
                        break;
                    }
                    $10 = ($11 + 123) % 128;
                    if (bArr4[i12] == 1) {
                        char c2 = cArr3[i12];
                        Object[] objArr4 = new Object[i];
                        objArr4[1] = Integer.valueOf(c);
                        objArr4[0] = Integer.valueOf(c2);
                        Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-655108508);
                        if (PngjBadSignature4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (31882 - ExpandableListView.getPackedPositionGroup(0L)), 33 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1250, 605862879, false, $$e(b3, b4, (byte) (b4 + 5)), new Class[]{cls, cls});
                        }
                        cArr4[i12] = ((Character) ((Method) PngjBadSignature4).invoke(null, objArr4)).charValue();
                        $10 = ($11 + 101) % 128;
                    } else {
                        Object[] objArr5 = {Integer.valueOf(cArr3[i12]), Integer.valueOf(c)};
                        Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(269554740);
                        if (PngjBadSignature5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) View.getDefaultSize(0, 0), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 36, KeyEvent.normalizeMetaState(0) + 1598, -318867057, false, $$e(b5, b6, (byte) (b6 + 2)), new Class[]{cls, cls});
                        }
                        cArr4[i12] = ((Character) ((Method) PngjBadSignature5).invoke(null, objArr5)).charValue();
                    }
                    c = cArr4[e1Var.PngjBadSignature];
                    Object[] objArr6 = {e1Var, e1Var};
                    Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1060060353);
                    if (PngjBadSignature6 == null) {
                        PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (Process.myPid() >> 22), View.resolveSizeAndState(0, 0, 0) + 35, 155 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1010806406, false, "g", new Class[]{Object.class, Object.class});
                    }
                    ((Method) PngjBadSignature6).invoke(null, objArr6);
                    i = 2;
                }
                cArr3 = cArr4;
            }
            if (i8 > 0) {
                char[] cArr5 = new char[i6];
                i2 = 0;
                System.arraycopy(cArr3, 0, cArr5, 0, i6);
                int i13 = i6 - i8;
                System.arraycopy(cArr5, 0, cArr3, i13, i8);
                System.arraycopy(cArr5, i8, cArr3, 0, i13);
            } else {
                i2 = 0;
            }
            if (z) {
                char[] cArr6 = new char[i6];
                e1Var.PngjBadSignature = i2;
                while (true) {
                    int i14 = e1Var.PngjBadSignature;
                    if (i14 >= i6) {
                        break;
                    }
                    cArr6[i14] = cArr3[(i6 - i14) - 1];
                    e1Var.PngjBadSignature = i14 + 1;
                }
                cArr3 = cArr6;
            }
            if (i7 > 0) {
                e1Var.PngjBadSignature = 0;
                while (true) {
                    int i15 = e1Var.PngjBadSignature;
                    if (i15 >= i6) {
                        break;
                    }
                    cArr3[i15] = (char) (cArr3[i15] - iArr[2]);
                    e1Var.PngjBadSignature = i15 + 1;
                }
            }
            objArr[0] = new String(cArr3);
        }

        public static void init$0() {
            $$a = new byte[]{0, ByteCompanionObject.MIN_VALUE, -106, -9, 69, 10, -5, 52, -30, 7, -3, 37, -51, 21, -2, -11, -4, 11, -6, 1};
            $$b = 79;
        }

        public static void init$1() {
            $$c = new byte[]{60, 89, 26, -54};
            $$d = 26;
        }

        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ Object initialValue() {
            Boolean bool = Boolean.FALSE;
            int i = PngjBadSignature + 67;
            valueOf = i % 128;
            if (i % 2 == 0) {
                int i2 = 48 / 0;
            }
            return bool;
        }
    }

    static {
        Logger.getLogger(AridA.class.getName());
        valueOf = StandardCharsets.ISO_8859_1;
    }

    public static int PngjBadCrcException(int i, int i2, int i3, int i4) {
        int i5 = (i2 + i3) - i4;
        int i6 = i5 >= i2 ? i5 - i2 : i2 - i5;
        int i7 = i5 >= i3 ? i5 - i3 : i3 - i5;
        int i8 = i5 >= i4 ? i5 - i4 : i4 - i5;
        if (i6 > i7 || i6 > i8) {
            i2 = i7 <= i8 ? i3 : i4;
        }
        return (i - i2) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public static void PngjBadSignature(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >> 16);
        bArr[i2 + 2] = (byte) (i >> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static void PngjException(OutputStream outputStream, int i) {
        byte[] bArr = new byte[4];
        PngjBadSignature(i, bArr, 0);
        try {
            outputStream.write(bArr);
        } catch (IOException e) {
            throw new PngjOutputException(e);
        }
    }

    public static void PngjBadCrcException(OutputStream outputStream, byte[] bArr) {
        try {
            outputStream.write(bArr);
        } catch (IOException e) {
            throw new PngjOutputException(e);
        }
    }

    public static void PngjBadCrcException(OutputStream outputStream, byte[] bArr, int i) {
        try {
            outputStream.write(bArr, 0, i);
        } catch (IOException e) {
            throw new PngjOutputException(e);
        }
    }

    public static byte[] PngjBadSignature() {
        return new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
    }
}
