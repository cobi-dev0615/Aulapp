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
import kotlin.uuid.Uuid;

/* loaded from: classes.dex */
public final class a {
    public static Charset valueOf;

    public class PngjBadCrcException extends ThreadLocal {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
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
            int i4;
            Object[] objArr;
            char c;
            long j;
            Object[] objArr2;
            int i5;
            Object[] objArr3;
            char c2;
            Object[] objArr4;
            int i6;
            Object[] objArr5;
            char c3;
            int length;
            Object obj;
            Iterator it;
            int i7;
            int i8;
            String[] split;
            int length2;
            int i9;
            String[] strArr;
            int i10;
            int i11;
            int i12;
            Runtime runtime;
            int i13;
            Process process;
            DataOutputStream dataOutputStream;
            long j2;
            String[] strArr2;
            String str;
            int i14;
            int i15;
            String str2;
            int i16;
            String str3;
            int i17;
            Object[] objArr6;
            Object[] objArr7;
            char c4;
            Object[] objArr8;
            int i18;
            int i19 = -View.combineMeasuredStates(0, 0);
            int i20 = ((i19 | 34) << 1) - (i19 ^ 34);
            int i21 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
            Object[] objArr9 = new Object[1];
            a(i20, false, "\r\t\u0006\u0000\ufffe\u0011\u0006\f\u000b￦\u000b\u0003\f\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\u0000\f\u000b\u0011\u0002\u000b\u0011ￋ\r\nￋ\uffde\r", (i21 ^ 14) + ((i21 & 14) << 1), 293 - (~(-(ViewConfiguration.getLongPressTimeout() >> 16))), objArr9);
            String str4 = (String) objArr9[0];
            Object[] objArr10 = new Object[1];
            a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 7, true, "￡\ufffe\u0011\ufffe\u0001\u000f\u0006", 5 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 293, objArr10);
            String str5 = (String) objArr10[0];
            int pressedStateDuration = 16 - (ViewConfiguration.getPressedStateDuration() >> 16);
            int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
            int i22 = ((keyRepeatTimeout | 15) << 1) - (keyRepeatTimeout ^ 15);
            int i23 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int i24 = ((i23 | 290) << 1) - (i23 ^ 290);
            Object[] objArr11 = new Object[1];
            a(pressedStateDuration, true, "\u0002\u0006\u0013\t\ufff5ￏ\b\u000f\u0002\rￏ\u0002\u0017\u0002\u000b\u0005", i22, i24, objArr11);
            String str6 = (String) objArr11[0];
            int i25 = 19;
            int i26 = 3;
            int i27 = 4;
            int i28 = 2;
            try {
                if (context == null) {
                    int i29 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11;
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 5;
                    int i30 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int i31 = ((i30 | 291) << 1) - (i30 ^ 291);
                    Object[] objArr12 = new Object[1];
                    a(i29, true, "\u0013\u0005\u0015\u0007ￏ\u000f\u0006\u000e￩\ufff3\uffef\u0014", minimumFlingVelocity, i31, objArr12);
                    Object[] objArr13 = {(String) objArr12[0]};
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1934049891);
                    if (PngjBadSignature2 == null) {
                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 28;
                        int windowTouchSlop = 1447 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        byte[] bArr = $$a;
                        i17 = 32;
                        Object[] objArr14 = new Object[1];
                        b((byte) (-bArr[19]), (byte) (-bArr[14]), (byte) 32, objArr14);
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(maximumFlingVelocity, maxKeyCode, windowTouchSlop, -1884803112, false, (String) objArr14[0], new Class[]{String.class});
                    } else {
                        i17 = 32;
                    }
                    long longValue = ((Long) ((Method) PngjBadSignature2).invoke(null, objArr13)).longValue();
                    long j3 = -192594246;
                    long j4 = i;
                    long j5 = -1;
                    long j6 = longValue ^ j5;
                    long j7 = 676;
                    long j8 = j4 ^ j5;
                    long j9 = ((j7 * ((((longValue | j3) | j4) ^ j5) | ((((j3 ^ j5) | j6) ^ j5) | ((j6 | j8) ^ j5)))) + (((((j6 | j3) ^ j5) | ((j8 | j3) ^ j5)) * j7) + (((-676) * ((j3 | j4) | j6)) + (((-675) * longValue) + (677 * j3))))) - 1524323021;
                    int i32 = (((~(1825452738 | i)) | 1363756368) * 262) - 1241180196;
                    int i33 = ~i;
                    int i34 = ((int) (j9 >> i17)) & ((((~(1825452738 | i33)) | 1363756368) * 262) + i32);
                    int myPid = Process.myPid();
                    int i35 = ((int) j9) & ((((~((~myPid) | (-797268419))) | 1431636305) * 398) + (((~((-797268419) | myPid)) | 1431636305) * 398) + 1114605661);
                    if (((i34 & i35) | (i34 ^ i35)) != 0) {
                        objArr6 = new Object[]{null, null, new int[]{(i & (-51)) | (i33 & 50)}, new int[]{i}, new int[]{(r1 | r4) & (~(r1 & r4))}};
                        int d = defpackage.a.d((~((-833272972) | i)) | 208915601, 318, (((~(833272971 | i)) | (-1039924380)) * (-318)) + ((((~((-831008779) | i)) | (~((-206651409) | i33))) * (-318)) - 79127053), 16, i3);
                        int i36 = d << 13;
                        int i37 = (d | i36) & (~(d & i36));
                        int i38 = i37 ^ (i37 >>> 17);
                        int i39 = i38 << 5;
                    } else {
                        objArr6 = new Object[]{null, null, new int[]{i}, new int[]{i}, new int[1]};
                        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                        int i40 = (((~((-781775195) | startElapsedRealtime)) | 647557146 | (~(157417824 | startElapsedRealtime))) * (-880)) + 303028201;
                        int i41 = (~((-781775195) | (~startElapsedRealtime))) | (-157417825);
                        int i42 = ~(startElapsedRealtime | 781775194);
                        int i43 = -(-((i42 * 880) + ((i41 | i42) * (-880)) + i40));
                        int i44 = (i3 ^ i43) + ((i43 & i3) << 1);
                        int i45 = i44 << 13;
                        int i46 = (i45 & (~i44)) | ((~i45) & i44);
                        int i47 = i46 ^ (i46 >>> 17);
                        ((int[]) objArr6[4])[0] = i47 ^ (i47 << 5);
                    }
                    if (((int[]) objArr6[2])[0] != i) {
                        return objArr6;
                    }
                    Object[] objArr15 = new Object[1];
                    c("\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000", true, new int[]{0, 20, 0, 0}, objArr15);
                    Object[] objArr16 = {(String) objArr15[0]};
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1934049891);
                    if (PngjBadSignature3 == null) {
                        char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int i48 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                        int i49 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1446;
                        byte[] bArr2 = $$a;
                        Object[] objArr17 = new Object[1];
                        b((byte) (-bArr2[19]), (byte) (-bArr2[14]), (byte) i17, objArr17);
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(doubleTapTimeout, i48, i49, -1884803112, false, (String) objArr17[0], new Class[]{String.class});
                    }
                    long longValue2 = ((Long) ((Method) PngjBadSignature3).invoke(null, objArr16)).longValue();
                    long j10 = -948804190;
                    long j11 = 471;
                    long j12 = (j11 * longValue2) + (j11 * j10);
                    long j13 = -470;
                    long j14 = longValue2 ^ j5;
                    long elapsedRealtime = (int) SystemClock.elapsedRealtime();
                    long j15 = (((elapsedRealtime ^ j5) | j10) | longValue2) ^ j5;
                    long j16 = ((470 * (j15 | (((j14 | j10) | elapsedRealtime) ^ j5))) + (((((((j10 ^ j5) | j14) ^ j5) | ((j14 | elapsedRealtime) ^ j5)) | j15) * j13) + (((j10 | longValue2) * j13) + j12))) - 768113077;
                    int i50 = ((int) (j16 >> 32)) & ((((~(1284218162 | i)) | (-1573522723)) * 376) + (((~((-1284218163) | i33)) | 1284115746) * (-376)) + ((((-289509393) | i) * 376) - 2088991750));
                    int i51 = ((int) j16) & ((((~((-7159284) | i)) | 332177 | (~((-1444385694) | i))) * 623) + (((-1451212800) | i33) * (-623)) + ((~((-332178) | i)) * 623) + 488352374);
                    if (((i50 & i51) | (i50 ^ i51)) != 0) {
                        objArr7 = new Object[]{null, null, new int[]{r1}, new int[]{i}, new int[1]};
                        int i52 = (~(i & 60)) & (i | 60);
                        int i53 = (~((-409080553) | i)) | (~(215276817 | i33));
                        int i54 = ~(409080552 | i33);
                        int i55 = ((76860689 | i54) * 516) + (((~((-138416129) | i)) | (~((-76860690) | i33))) * 516) + ((i53 | i54) * (-516)) + 1842836821;
                        int PngjBadSignature4 = isAuthSucess.PngjException.PngjBadSignature.values.PngjBadSignature();
                        int i56 = i55 * 949;
                        int i57 = ((-15152) ^ i56) + ((i56 & (-15152)) << 1);
                        int i58 = ~i55;
                        int i59 = ~(i58 | PngjBadSignature4);
                        int i60 = ((i58 | 16) * 948) + ((~((~PngjBadSignature4) | ((-17) & i58) | ((-17) ^ i58))) * (-948)) + (((i59 & (-17)) | ((-17) ^ i59)) * (-948)) + i57;
                        int i61 = (i3 & i60) + (i60 | i3);
                        int i62 = i61 << 13;
                        int i63 = (i62 | i61) & (~(i61 & i62));
                        int i64 = i63 ^ (i63 >>> 17);
                        int i65 = i64 << 5;
                        c4 = 0;
                        ((int[]) objArr7[4])[0] = ((~i64) & i65) | ((~i65) & i64);
                    } else {
                        objArr7 = new Object[]{null, null, new int[]{i}, new int[]{i}, new int[]{(r1 | r4) & (~(r1 & r4))}};
                        int c5 = defpackage.a.c((~((-2682561) | i33)) | 402653497, 576, (((~((-112193217) | i)) | 109510656) * 576) + 1771765689, -1346371584);
                        int i66 = (c5 << 1) - c5;
                        int i67 = (i3 & i66) + (i66 | i3);
                        int i68 = i67 << 13;
                        int i69 = ((~i67) & i68) | ((~i68) & i67);
                        int i70 = i69 >>> 17;
                        int i71 = ((~i69) & i70) | ((~i70) & i69);
                        int i72 = i71 << 5;
                        c4 = 0;
                    }
                    if (((int[]) objArr7[2])[c4] != i) {
                        return objArr7;
                    }
                    int keyCodeFromString = 36 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR);
                    int i73 = 2 - (~ExpandableListView.getPackedPositionType(0L));
                    int i74 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i75 = (i74 ^ 290) + ((i74 & 290) << 1);
                    Object[] objArr18 = new Object[1];
                    a(keyCodeFromString, true, "\u0002\u0005\uffd0\u0002\u0015\u0002\u0005\u0000\u0014\u0007\u0017\uffd0\u0005\n\u0010\u0013\u0005\u000f\u0002ￏ\u0019\u0010\u0003\bￏ\u000e\u0010\u0004\uffd0\u0002\u0015\u0002\u0005\uffd0\u0002\u0015", i73, i75, objArr18);
                    Object[] objArr19 = {(String) objArr18[0]};
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1142218481);
                    if (PngjBadSignature5 == null) {
                        char mode = (char) View.MeasureSpec.getMode(0);
                        int makeMeasureSpec = 28 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int i76 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1446;
                        byte[] bArr3 = $$a;
                        byte b = bArr3[19];
                        byte b2 = bArr3[0];
                        Object[] objArr20 = new Object[1];
                        b(b, b2, (byte) (b2 | 17), objArr20);
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(mode, makeMeasureSpec, i76, 1191464116, false, (String) objArr20[0], new Class[]{String.class});
                    }
                    long longValue3 = ((Long) ((Method) PngjBadSignature5).invoke(null, objArr19)).longValue();
                    long j17 = -26290633;
                    long j18 = -115;
                    long j19 = (j18 * longValue3) + (j18 * j17);
                    long maxMemory = (int) Runtime.getRuntime().maxMemory();
                    long j20 = ((-116) * ((((maxMemory ^ j5) | j17) | longValue3) ^ j5)) + j19;
                    long j21 = 116;
                    long j22 = longValue3 ^ j5;
                    long j23 = ((j21 * (((maxMemory | j22) ^ j5) | (((j17 ^ j5) | j22) ^ j5))) + (((j17 | maxMemory) * j21) + j20)) - 1929707244;
                    if (((((int) (j23 >> 32)) & ((((~((-293601569) | i)) | 1142957184) * 235) + (((~((-293935398) | i)) | 1143291013) * (-470)) + ((((~((-293935398) | i33)) | 1143291013) * (-235)) - 2026535217))) | (((int) j23) & defpackage.a.c((~((int) Process.getElapsedCpuTime())) | 2147188285, -828, (((~(2147188285 | r4)) | 710552600) * (-828)) - 1754753727, 244559736))) != 0) {
                        objArr8 = new Object[]{null, null, new int[]{i ^ 80}, new int[]{i}, new int[1]};
                        int maxMemory2 = (int) Runtime.getRuntime().maxMemory();
                        int i77 = ~maxMemory2;
                        int i78 = (((~(i77 | 602690226)) | (~((-21667144) | i77))) * 865) + ((~(maxMemory2 | 602690226)) * 865) + (((~((-602690227) | i77)) | (-21667144)) * (-865)) + 698150532;
                        int i79 = -(-((i78 & 16) + (i78 | 16)));
                        int i80 = (i3 ^ i79) + ((i79 & i3) << 1);
                        int i81 = (i80 << 13) ^ i80;
                        int i82 = i81 >>> 17;
                        int i83 = ((~i81) & i82) | ((~i82) & i81);
                        int i84 = i83 << 5;
                        i18 = 0;
                        ((int[]) objArr8[4])[0] = (i83 | i84) & (~(i83 & i84));
                    } else {
                        objArr8 = new Object[]{null, null, new int[]{i}, new int[]{i}, new int[1]};
                        int myTid = Process.myTid();
                        int i85 = -(-((((~((~myTid) | 70403617)) | (-553953753)) * 168) + (((~(myTid | 70403617)) | (-624357370)) * (-168)) + (((~((-553953753) | myTid)) * 336) - 1188465519)));
                        int i86 = (i3 ^ i85) + ((i85 & i3) << 1);
                        int i87 = i86 << 13;
                        int i88 = (i87 | i86) & (~(i86 & i87));
                        int i89 = i88 >>> 17;
                        int i90 = ((~i88) & i89) | ((~i89) & i88);
                        int i91 = i90 << 5;
                        i18 = 0;
                        ((int[]) objArr8[4])[0] = ((~i90) & i91) | ((~i91) & i90);
                    }
                    if (((int[]) objArr8[2])[i18] != i) {
                        return objArr8;
                    }
                    Object[] objArr21 = new Object[1];
                    c("\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000", i18, new int[]{20, 42, i18, 29}, objArr21);
                    Object[] objArr22 = {(String) objArr21[i18]};
                    Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1142218481);
                    if (PngjBadSignature6 == null) {
                        char threadPriority = (char) ((Process.getThreadPriority(i18) + 20) >> 6);
                        int i92 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27;
                        int indexOf = 1446 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0);
                        byte[] bArr4 = $$a;
                        byte b3 = bArr4[19];
                        byte b4 = bArr4[0];
                        Object[] objArr23 = new Object[1];
                        b(b3, b4, (byte) (b4 | 17), objArr23);
                        PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(threadPriority, i92, indexOf, 1191464116, false, (String) objArr23[0], new Class[]{String.class});
                    }
                    long longValue4 = ((Long) ((Method) PngjBadSignature6).invoke(null, objArr22)).longValue();
                    long j24 = -1762534135;
                    long j25 = -495;
                    long j26 = (j25 * longValue4) + (j25 * j24);
                    long j27 = j24 ^ j5;
                    long j28 = (j27 | (longValue4 ^ j5)) ^ j5;
                    long startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
                    long j29 = j28 | ((j27 | startElapsedRealtime2) ^ j5);
                    long j30 = ((496 * (longValue4 | startElapsedRealtime2)) + (((-496) * (j29 | (j5 ^ (((startElapsedRealtime2 ^ j5) | j24) | longValue4)))) + ((992 * j29) + j26))) - 193463742;
                    int i93 = (~((-1650479393) | i33)) | 1648361472;
                    int i94 = ((int) (j30 >> 32)) & ((((~((-211135062) | i)) | (~((-2117921) | i33))) * 502) + (((i93 | r4) * (-502)) - 14002774));
                    int i95 = (int) j30;
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    if ((i94 | (i95 & ((((~(elapsedCpuTime | (-1201538))) | (~((~elapsedCpuTime) | (-1392618089))) | (~((-71303173) | elapsedCpuTime))) * 867) + (((~((-1463921261) | elapsedCpuTime)) | 1392618088 | (~((-1393819626) | elapsedCpuTime))) * (-1734)) + ((((~((-1463921261) | r6)) | (~((-1393819626) | r6))) * (-867)) - 1972008908)))) != 0) {
                        Object[] objArr24 = {null, null, new int[]{r1}, new int[]{i}, new int[]{((~r1) & r2) | ((~r2) & r1)}};
                        int i96 = (~(i & 90)) & (i | 90);
                        int c6 = defpackage.a.c((~(397309066 | i33)) | (-726339599), 262, (((~(i | 397309066)) | (-726339599)) * 262) - 1873425771, 16);
                        int i97 = (i3 & c6) + (c6 | i3);
                        int i98 = i97 << 13;
                        int i99 = (i98 & (~i97)) | ((~i98) & i97);
                        int i100 = i99 >>> 17;
                        int i101 = ((~i99) & i100) | ((~i100) & i99);
                        int i102 = i101 << 5;
                        return objArr24;
                    }
                    Object[] objArr25 = {null, null, new int[]{i}, new int[]{i}, new int[1]};
                    int startUptimeMillis = (int) Process.getStartUptimeMillis();
                    int i103 = (((~(startUptimeMillis | (-41978066))) | (~((~startUptimeMillis) | (-427513639))) | 272647972) * 168) + ((~((-154865667) | startUptimeMillis)) * 168) + ((((~((-196843732) | r2)) | 154865666) * 168) - 1188465519);
                    int i104 = (i103 << 1) - i103;
                    int i105 = (i3 & i104) + (i104 | i3);
                    int i106 = i105 ^ (i105 << 13);
                    int i107 = i106 >>> 17;
                    int i108 = ((~i106) & i107) | ((~i107) & i106);
                    ((int[]) objArr25[4])[0] = i108 ^ (i108 << 5);
                    return objArr25;
                }
                try {
                    int i109 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int i110 = (i109 & 23) + (i109 | 23);
                    int myPid2 = 9 - (Process.myPid() >> 22);
                    int i111 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int i112 = (i111 & 297) + (i111 | 297);
                    Object[] objArr26 = new Object[1];
                    a(i110, false, "\u000f\uffc9\uffde\n\t\u000f\u0000\u0013\u000f￼\t\uffff\r\n\u0004\uffff\uffc9\ufffe\n\t\u000f\u0000\t", myPid2, i112, objArr26);
                    Class<?> cls = Class.forName((String) objArr26[0]);
                    Object[] objArr27 = new Object[1];
                    c("\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000", true, new int[]{62, 14, 0, 0}, objArr27);
                    String str7 = (String) cls.getMethod((String) objArr27[0], null).invoke(context, null);
                    int i113 = -(Process.myPid() >> 22);
                    int i114 = (i113 ^ 23) + ((i113 & 23) << 1);
                    int red = Color.red(0);
                    Object[] objArr28 = new Object[1];
                    a(i114, false, "\u000f\uffc9\uffde\n\t\u000f\u0000\u0013\u000f￼\t\uffff\r\n\u0004\uffff\uffc9\ufffe\n\t\u000f\u0000\t", (red ^ 9) + ((red & 9) << 1), 295 - (~(-(-TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0)))), objArr28);
                    Class<?> cls2 = Class.forName((String) objArr28[0]);
                    int i115 = 16 - (~(-((byte) KeyEvent.getModifierMetaStateMask())));
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 12;
                    int i116 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    int i117 = ((i116 | 298) << 1) - (i116 ^ 298);
                    Object[] objArr29 = new Object[1];
                    a(i115, false, "\u0005\u0002￼\ufffa\r\u0002\b\u0007￢\u0007\uffff\b\u0000\ufffe\rￚ\t\t", fadingEdgeLength, i117, objArr29);
                    Object invoke = cls2.getMethod((String) objArr29[0], null).invoke(context, null);
                    int indexOf2 = ((String) defpackage.a.h(str4, str5, invoke)).indexOf(str7);
                    if (indexOf2 > 0) {
                        String str8 = (String) defpackage.a.h(str4, str5, invoke);
                        int length3 = str8.length();
                        int i118 = (length3 & (-16)) + (length3 | (-16));
                        if (i118 >= 0) {
                            int i119 = 0;
                            while (i119 <= i118) {
                                String substring = str8.substring(i119, i119 + 16);
                                Object[] objArr30 = new Object[i28];
                                objArr30[1] = 931995;
                                objArr30[0] = substring;
                                Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                                if (PngjBadSignature7 == null) {
                                    char fadingEdgeLength2 = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 11039);
                                    int resolveSize = View.resolveSize(0, 0) + 31;
                                    int i120 = 1283 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                    byte[] bArr5 = $$a;
                                    i4 = 13;
                                    byte b5 = bArr5[19];
                                    str2 = str8;
                                    byte b6 = bArr5[13];
                                    i16 = i119;
                                    str3 = str6;
                                    Object[] objArr31 = new Object[1];
                                    b(b5, b5, b6, objArr31);
                                    PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(fadingEdgeLength2, resolveSize, i120, -971849413, false, (String) objArr31[0], new Class[]{String.class, Integer.TYPE});
                                } else {
                                    str2 = str8;
                                    i16 = i119;
                                    str3 = str6;
                                    i4 = 13;
                                }
                                long longValue5 = ((Long) ((Method) PngjBadSignature7).invoke(null, objArr30)).longValue();
                                long j31 = -82293396;
                                long j32 = (591 * longValue5) + ((-589) * j31);
                                long j33 = 590;
                                long j34 = -1;
                                long j35 = longValue5 ^ j34;
                                long startElapsedRealtime3 = (int) Process.getStartElapsedRealtime();
                                long j36 = startElapsedRealtime3 ^ j34;
                                long j37 = ((j35 | j36) ^ j34) | ((j35 | j31) ^ j34) | ((j36 | j31) ^ j34);
                                long j38 = j31 ^ j34;
                                long j39 = (j33 * (((j38 | j36) ^ j34) | ((j36 | longValue5) ^ j34))) + ((-1180) * j37) + ((j37 | (((j38 | longValue5) | startElapsedRealtime3) ^ j34)) * j33) + j32 + 738001096;
                                int myPid3 = Process.myPid();
                                int i121 = ~myPid3;
                                int i122 = (((~((-483228705) | i121)) | 272977920) * (-1188)) - 1723652140;
                                int i123 = (~(myPid3 | 483228704)) | 272977920;
                                int i124 = ~(1920455115 | i121);
                                int i125 = ((int) (j39 >> 32)) & ((((~(i121 | 483228704)) | (-2130705900) | i124) * 594) + ((i123 | i124) * 594) + i122);
                                int i126 = ~i;
                                int i127 = ((int) j39) & ((((~(382537914 | i)) | (-1819764325)) * 519) + (((~(i126 | 2130671358)) | (~((-1748133445) | i))) * (-519)) + (((~(1819764324 | i126)) | 382537914) * 519) + 1453938690);
                                if (((i125 & i127) | (i125 ^ i127)) == -725904754) {
                                    objArr = new Object[]{r4, null, new int[1], new int[1], new int[1]};
                                    int i128 = (i & (-21)) | ((~i) & 20);
                                    String str9 = (String) defpackage.a.h(str4, str5, invoke);
                                    ((int[]) objArr[3])[0] = i;
                                    ((int[]) objArr[2])[0] = i128;
                                    int c7 = defpackage.a.c(~((~((int) Runtime.getRuntime().totalMemory())) | (-36353)), 501, (((~((-36353) | r4)) | (-769376255)) * 501) - 483407868, 16);
                                    int i129 = (i3 & c7) + (c7 | i3);
                                    int i130 = i129 << 13;
                                    int i131 = (i130 | i129) & (~(i129 & i130));
                                    int i132 = i131 >>> 17;
                                    int i133 = (i131 | i132) & (~(i131 & i132));
                                    ((int[]) objArr[4])[0] = i133 ^ (i133 << 5);
                                    break;
                                }
                                int i134 = (i16 & (-57)) + (i16 | (-57));
                                i119 = (i134 ^ 58) + ((i134 & 58) << 1);
                                str8 = str2;
                                str6 = str3;
                                i28 = 2;
                            }
                        }
                        String str10 = str6;
                        i4 = 13;
                        String str11 = (String) defpackage.a.h(str4, str5, invoke);
                        int length4 = str11.length();
                        int i135 = length4 * (-753);
                        int i136 = (((-4530) | i135) << 1) - (i135 ^ (-4530));
                        int i137 = ~((5 ^ length4) | (5 & length4));
                        int i138 = ~((5 ^ i) | (5 & i));
                        int i139 = (i137 & i138) | (i137 ^ i138);
                        int i140 = ~(length4 | i);
                        int i141 = (((i139 & i140) | (i139 ^ i140)) * (-754)) + i136;
                        int i142 = (5 ^ length4) | (5 & length4);
                        int i143 = ~((i142 & i) | (i142 ^ i));
                        i7 = ~i;
                        int i144 = ~(length4 | (i7 ^ (-6)) | (i7 & (-6)));
                        int i145 = ((i144 & i143) | (i143 ^ i144)) * (-754);
                        int i146 = ((i141 | i145) << 1) - (i145 ^ i141);
                        int i147 = ~i;
                        int i148 = ((5 ^ i147) | (5 & i147)) * 754;
                        int i149 = (i146 & i148) + (i148 | i146);
                        if (i149 >= 0) {
                            int i150 = 0;
                            while (i150 <= i149) {
                                Object[] objArr32 = {str11.substring(i150, i150 + 6), 931995};
                                Object PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                                if (PngjBadSignature8 == null) {
                                    char resolveOpacity = (char) (11039 - Drawable.resolveOpacity(0, 0));
                                    int indexOf3 = 30 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0');
                                    int capsMode = 1282 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0);
                                    str = str11;
                                    byte b7 = $$a[19];
                                    i14 = i147;
                                    i15 = i150;
                                    Object[] objArr33 = new Object[1];
                                    b(b7, b7, r15[13], objArr33);
                                    PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(resolveOpacity, indexOf3, capsMode, -971849413, false, (String) objArr33[0], new Class[]{String.class, Integer.TYPE});
                                } else {
                                    str = str11;
                                    i14 = i147;
                                    i15 = i150;
                                }
                                long longValue6 = ((Long) ((Method) PngjBadSignature8).invoke(null, objArr32)).longValue();
                                long j40 = 496261142;
                                long j41 = ((-317) * longValue6) + (319 * j40);
                                long j42 = -1;
                                long j43 = longValue6 ^ j42;
                                long j44 = j40 ^ j42;
                                long a = defpackage.a.a();
                                long j45 = ((-318) * (j43 | ((j44 | a) ^ j42))) + j41;
                                long j46 = 318;
                                long j47 = a ^ j42;
                                long j48 = (j46 * ((((j43 | j47) | j40) ^ j42) | (((j40 | longValue6) | a) ^ j42))) + ((((j43 | a) ^ j42) | (((j47 | j40) | longValue6) ^ j42)) * j46) + j45 + 159446558;
                                int myUid = Process.myUid();
                                int i151 = ~myUid;
                                int i152 = ((int) (j48 >> 32)) & (((~(i151 | (-1748696928))) * 184) + ((myUid | (-2059075584)) * (-184)) + (((~((-311470517) | i151)) | 1091860) * 184) + 323538762);
                                int elapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                                int i153 = ~elapsedRealtime2;
                                int i154 = (((~(1635267973 | i153)) | 142950480) * (-1188)) + 1784043457;
                                int i155 = (~(elapsedRealtime2 | (-1635267974))) | 142950480;
                                int i156 = ~(1222472912 | i153);
                                if (((((int) j48) & ((((~(i153 | (-1635267974))) | 555745541 | i156) * 594) + ((i155 | i156) * 594) + i154)) | i152) == -2096167706) {
                                    objArr = new Object[]{r4, null, new int[1], new int[1], new int[1]};
                                    int i157 = (~(i & 20)) & (i | 20);
                                    String str12 = (String) defpackage.a.h(str4, str5, invoke);
                                    ((int[]) objArr[3])[0] = i;
                                    ((int[]) objArr[2])[0] = i157;
                                    int i158 = (int) Runtime.getRuntime().totalMemory();
                                    int A = defpackage.a.A((~(i158 | (-25677823))) | (~((-650035193) | i158)) | 8818680, 407, (((~(650035192 | i158)) | (~((~i158) | 25677822)) | 8818680) * 407) + ((((-666894335) | r5) * (-814)) - 2084250880), -16);
                                    int PngjBadSignature9 = isAuthSucess.PngjException.PngjBadSignature.values.PngjBadSignature();
                                    int i159 = A * 477;
                                    int i160 = i3 * (-475);
                                    int i161 = (i159 & i160) + (i159 | i160);
                                    int i162 = ~A;
                                    int i163 = ~((i162 & i3) | (i162 ^ i3));
                                    int i164 = ~i3;
                                    int i165 = (i164 ^ A) | (i164 & A);
                                    int i166 = ~((i165 & PngjBadSignature9) | (i165 ^ PngjBadSignature9));
                                    int i167 = (i161 - (~(((i163 & i166) | (i163 ^ i166)) * (-476)))) - 1;
                                    int i168 = ~i3;
                                    int i169 = (i168 & A) | (i168 ^ A);
                                    int i170 = (~((i169 & PngjBadSignature9) | (i169 ^ PngjBadSignature9))) * 952;
                                    int i171 = (i167 & i170) + (i170 | i167);
                                    int i172 = (~(A | (~PngjBadSignature9) | i164)) * 476;
                                    int i173 = ((i171 | i172) << 1) - (i172 ^ i171);
                                    int i174 = i173 << 13;
                                    int i175 = (i174 & (~i173)) | ((~i174) & i173);
                                    int i176 = i175 >>> 17;
                                    int i177 = ((~i175) & i176) | ((~i176) & i175);
                                    ((int[]) objArr[4])[0] = i177 ^ (i177 << 5);
                                    break;
                                }
                                int i178 = i15 - 68;
                                i150 = ((i178 | 69) << 1) - (i178 ^ 69);
                                str11 = str;
                                i147 = i14;
                            }
                        }
                        int i179 = i147;
                        i8 = 0;
                        String substring2 = ((String) defpackage.a.h(str4, str5, invoke)).substring(0, indexOf2);
                        Object[] objArr34 = new Object[1];
                        c(null, true, new int[]{76, 1, 75, 1}, objArr34);
                        split = substring2.split((String) objArr34[0]);
                        length2 = split.length;
                        i9 = 0;
                        loop4: while (i9 < length2) {
                            String str13 = split[i9];
                            Object[] objArr35 = new Object[1];
                            a(2 - ImageFormat.getBitsPerPixel(i8), false, "\u0011\u000f￢", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, 269 - (~(-TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', i8))), objArr35);
                            if (str13.split((String) objArr35[i8]).length > 1) {
                                synchronized (((Class) com.d.e.a.PngjBadCrcException.values((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 31077), 49 - KeyEvent.normalizeMetaState(i8), ((byte) KeyEvent.getModifierMetaStateMask()) + 1044))) {
                                    try {
                                        int i180 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                        int i181 = (i180 & 16) + (i180 | 16);
                                        int packedPositionType = 11 - ExpandableListView.getPackedPositionType(0L);
                                        int i182 = -AndroidCharacter.getMirror('0');
                                        Object[] objArr36 = new Object[1];
                                        a(i181, false, "\u0012\u0013\uffbf\u000f\u0000\u0002\n\u0000\u0006\u0004\u0012\u000f\f\uffbf\u000b\b", packedPositionType, (i182 & 340) + (i182 | 340), objArr36);
                                        String str14 = (String) objArr36[0];
                                        try {
                                            runtime = Runtime.getRuntime();
                                            try {
                                                int i183 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                int PngjBadSignature10 = isAuthSucess.PngjException.PngjBadSignature.values.PngjBadSignature();
                                                strArr = split;
                                                int i184 = (i183 * 465) - 926;
                                                int i185 = ~PngjBadSignature10;
                                                int i186 = ~(((-3) ^ i185) | ((-3) & i185));
                                                int i187 = ~(((-3) ^ i183) | ((-3) & i183));
                                                int i188 = ((i186 ^ i187) | (i186 & i187) | (~((i185 ^ i183) | (i185 & i183)))) * 464;
                                                int i189 = (i184 & i188) + (i184 | i188);
                                                int i190 = ~i183;
                                                int i191 = ((PngjBadSignature10 ^ i190) | (i190 & PngjBadSignature10) | (-3)) * (-464);
                                                int i192 = ((i189 | i191) << 1) - (i189 ^ i191);
                                                int i193 = ~(((-3) ^ i183) | ((-3) & i183));
                                                int i194 = ~((i183 ^ PngjBadSignature10) | (i183 & PngjBadSignature10));
                                                int i195 = -(-(((i193 & i194) | (i193 ^ i194)) * 464));
                                                i13 = ((i192 | i195) << 1) - (i192 ^ i195);
                                            } catch (Exception unused) {
                                                strArr = split;
                                                i10 = length2;
                                                i11 = i9;
                                                i12 = i7;
                                            }
                                        } catch (Exception unused2) {
                                            strArr = split;
                                        }
                                        try {
                                            int i196 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                            int i197 = i196 * 69;
                                            int i198 = ((i197 | (-67)) << 1) - (i197 ^ (-67));
                                            int i199 = ~i196;
                                            int i200 = ~((i199 ^ (-2)) | (i199 & (-2)) | i179);
                                            i10 = length2;
                                            int i201 = ~((i196 ^ 1) | (i196 & 1));
                                            int i202 = -(-(((i200 ^ i201) | (i201 & i200) | (~((i ^ 1) | (i & 1)))) * (-68)));
                                            int i203 = ((i198 | i202) << 1) - (i202 ^ i198);
                                            int i204 = ~i196;
                                            int i205 = (i204 ^ i179) | (i204 & i179);
                                            int i206 = (~((i205 & 1) | (i205 ^ 1))) * (-68);
                                            int i207 = (i203 & i206) + (i206 | i203);
                                            int i208 = ~((-2) | i179);
                                            int i209 = (i207 - (~(-(-(((i204 & i208) | (i204 ^ i208)) * 68))))) - 1;
                                            try {
                                                int i210 = -View.getDefaultSize(0, 0);
                                                int i211 = (i210 & 304) + (i210 | 304);
                                                Object[] objArr37 = new Object[1];
                                                a(i13, true, "\u0006\ufffb", i209, i211, objArr37);
                                                Process exec = runtime.exec((String) objArr37[0], (String[]) null, (File) null);
                                                try {
                                                    Object[] objArr38 = {exec.getInputStream()};
                                                    Object PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(975476048);
                                                    if (PngjBadSignature11 == null) {
                                                        PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 37426), View.MeasureSpec.getMode(0) + 26, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1017, -959710997, false, null, new Class[]{InputStream.class});
                                                    }
                                                    Object newInstance = ((Constructor) PngjBadSignature11).newInstance(objArr38);
                                                    try {
                                                        Object[] objArr39 = {exec.getErrorStream()};
                                                        Object PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(975476048);
                                                        if (PngjBadSignature12 == null) {
                                                            process = exec;
                                                            PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37426), 26 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), KeyEvent.getDeadChar(0, 0) + 1017, -959710997, false, null, new Class[]{InputStream.class});
                                                        } else {
                                                            process = exec;
                                                        }
                                                        Object newInstance2 = ((Constructor) PngjBadSignature12).newInstance(objArr39);
                                                        DataOutputStream dataOutputStream2 = new DataOutputStream(process.getOutputStream());
                                                        try {
                                                            Class<?> cls3 = Class.forName(str10);
                                                            int longPressTimeout = 5 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                                            int longPressTimeout2 = 2 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                                            int i212 = -(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                            i11 = i9;
                                                            int i213 = (i212 ^ 306) + ((i212 & 306) << 1);
                                                            try {
                                                                Object[] objArr40 = new Object[1];
                                                                a(longPressTimeout, true, "\u0005\u0004\u0005\u0003\ufff2", longPressTimeout2, i213, objArr40);
                                                                cls3.getMethod((String) objArr40[0], null).invoke(newInstance, null);
                                                                try {
                                                                    Class<?> cls4 = Class.forName(str10);
                                                                    int i214 = -(Process.myTid() >> 22);
                                                                    int i215 = (i214 & 5) + (i214 | 5);
                                                                    int i216 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2;
                                                                    int i217 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                                    int PngjBadSignature13 = isAuthSucess.PngjException.PngjBadSignature.values.PngjBadSignature();
                                                                    i12 = i7;
                                                                    int i218 = i217 * (-380);
                                                                    int i219 = (i218 & 117274) + (i218 | 117274);
                                                                    int i220 = (PngjBadSignature13 ^ 307) | (PngjBadSignature13 & 307);
                                                                    int i221 = ~i217;
                                                                    int i222 = -(-(((i220 ^ i221) | (i220 & i221)) * (-381)));
                                                                    int i223 = ((i219 | i222) << 1) - (i219 ^ i222);
                                                                    int i224 = ~(i221 | (-308));
                                                                    int i225 = ~PngjBadSignature13;
                                                                    int i226 = i224 | (~((i225 ^ 307) | (i225 & 307)));
                                                                    int i227 = ~((i217 & 307) | (i217 ^ 307));
                                                                    int i228 = ((i226 & i227) | (i226 ^ i227)) * 381;
                                                                    int i229 = (i223 ^ i228) + ((i223 & i228) << 1);
                                                                    int i230 = (~(i221 | 307)) * 381;
                                                                    int i231 = ((i229 | i230) << 1) - (i230 ^ i229);
                                                                    try {
                                                                        Object[] objArr41 = new Object[1];
                                                                        a(i215, true, "\u0005\u0004\u0005\u0003\ufff2", i216, i231, objArr41);
                                                                        cls4.getMethod((String) objArr41[0], null).invoke(newInstance2, null);
                                                                        try {
                                                                            StringBuilder sb = new StringBuilder();
                                                                            sb.append(str14);
                                                                            Object[] objArr42 = new Object[1];
                                                                            c("\u0001", false, new int[]{77, 1, 21, 1}, objArr42);
                                                                            sb.append((String) objArr42[0]);
                                                                            String obj2 = sb.toString();
                                                                            Object[] objArr43 = new Object[1];
                                                                            c("\u0001\u0001\u0000\u0001\u0001", false, new int[]{78, 5, 176, 0}, objArr43);
                                                                            dataOutputStream2.write(obj2.getBytes((String) objArr43[0]));
                                                                            dataOutputStream2.flush();
                                                                            Object[] objArr44 = new Object[1];
                                                                            c("\u0000\u0000\u0001\u0001\u0001", true, new int[]{83, 5, 0, 0}, objArr44);
                                                                            String str15 = (String) objArr44[0];
                                                                            Object[] objArr45 = new Object[1];
                                                                            c("\u0001\u0001\u0000\u0001\u0001", false, new int[]{78, 5, 176, 0}, objArr45);
                                                                            dataOutputStream2.write(str15.getBytes((String) objArr45[0]));
                                                                            dataOutputStream2.flush();
                                                                            try {
                                                                                try {
                                                                                    long nanoTime = System.nanoTime();
                                                                                    DataOutputStream dataOutputStream3 = dataOutputStream2;
                                                                                    long nanos = TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                                    while (true) {
                                                                                        try {
                                                                                            process.exitValue();
                                                                                            dataOutputStream = dataOutputStream3;
                                                                                            break;
                                                                                        } catch (IllegalThreadStateException unused3) {
                                                                                            if (nanos > 0) {
                                                                                                j2 = nanoTime;
                                                                                                try {
                                                                                                    Object[] objArr46 = {Long.valueOf(Math.min(TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                                    Class<?> cls5 = Class.forName(str10);
                                                                                                    dataOutputStream = dataOutputStream3;
                                                                                                    Object[] objArr47 = new Object[1];
                                                                                                    c("\u0000\u0001\u0001\u0000\u0001", false, new int[]{88, 5, i26, 0}, objArr47);
                                                                                                    cls5.getMethod((String) objArr47[0], Long.TYPE).invoke(null, objArr46);
                                                                                                } catch (Throwable th) {
                                                                                                    Throwable cause = th.getCause();
                                                                                                    if (cause != null) {
                                                                                                        throw cause;
                                                                                                    }
                                                                                                    throw th;
                                                                                                }
                                                                                            } else {
                                                                                                dataOutputStream = dataOutputStream3;
                                                                                                j2 = nanoTime;
                                                                                            }
                                                                                            long nanos2 = TimeUnit.MILLISECONDS.toNanos(2000L) - (System.nanoTime() - j2);
                                                                                            if (nanos2 > 0) {
                                                                                                nanos = nanos2;
                                                                                                dataOutputStream3 = dataOutputStream;
                                                                                                nanoTime = j2;
                                                                                                i25 = 19;
                                                                                                i26 = 3;
                                                                                                i27 = 4;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        dataOutputStream.close();
                                                                                    } catch (IOException unused4) {
                                                                                    }
                                                                                    try {
                                                                                        Class<?> cls6 = Class.forName(str10);
                                                                                        Object[] objArr48 = new Object[1];
                                                                                        c("\u0001\u0000\u0001\u0000", false, new int[]{93, i27, 46, 3}, objArr48);
                                                                                        String str16 = (String) objArr48[0];
                                                                                        Class cls7 = Long.TYPE;
                                                                                        cls6.getMethod(str16, cls7).invoke(newInstance, 100L);
                                                                                        try {
                                                                                            Class<?> cls8 = Class.forName(str10);
                                                                                            Object[] objArr49 = new Object[1];
                                                                                            c("\u0001\u0000\u0001\u0000", false, new int[]{93, 4, 46, 3}, objArr49);
                                                                                            cls8.getMethod((String) objArr49[0], cls7).invoke(newInstance2, 10L);
                                                                                            StringBuilder sb2 = new StringBuilder();
                                                                                            Object PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-772232296);
                                                                                            if (PngjBadSignature14 == null) {
                                                                                                char argb = (char) (Color.argb(0, 0, 0, 0) + 37426);
                                                                                                int indexOf4 = 25 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0);
                                                                                                int gidForName = 1016 - Process.getGidForName(BuildConfig.FLAVOR);
                                                                                                Object[] objArr50 = new Object[1];
                                                                                                b((byte) (-$$a[14]), (byte) ($$b & 60), r12[0], objArr50);
                                                                                                PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(argb, indexOf4, gidForName, 756532771, false, (String) objArr50[0], null);
                                                                                            }
                                                                                            sb2.append(((Field) PngjBadSignature14).get(newInstance).toString());
                                                                                            Object PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-772232296);
                                                                                            if (PngjBadSignature15 == null) {
                                                                                                char blue = (char) (Color.blue(0) + 37426);
                                                                                                int absoluteGravity = 26 - Gravity.getAbsoluteGravity(0, 0);
                                                                                                int indexOf5 = 1016 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0);
                                                                                                Object[] objArr51 = new Object[1];
                                                                                                b((byte) (-$$a[14]), (byte) ($$b & 60), r11[0], objArr51);
                                                                                                PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(blue, absoluteGravity, indexOf5, 756532771, false, (String) objArr51[0], null);
                                                                                            }
                                                                                            sb2.append(((Field) PngjBadSignature15).get(newInstance2).toString());
                                                                                            String obj3 = sb2.toString();
                                                                                            try {
                                                                                                Object[] objArr52 = new Object[1];
                                                                                                c("\u0001", false, new int[]{77, 1, 21, 1}, objArr52);
                                                                                                String[] split2 = obj3.split((String) objArr52[0]);
                                                                                                int length5 = split2.length;
                                                                                                int i232 = 0;
                                                                                                while (i232 < length5) {
                                                                                                    String str17 = split2[i232];
                                                                                                    Object[] objArr53 = new Object[1];
                                                                                                    c("\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001", true, new int[]{97, i25, 2, 0}, objArr53);
                                                                                                    if (str17.startsWith((String) objArr53[0])) {
                                                                                                        strArr2 = split2;
                                                                                                    } else {
                                                                                                        int i233 = -KeyEvent.getDeadChar(0, 0);
                                                                                                        int i234 = ((i233 | 20) << 1) - (i233 ^ 20);
                                                                                                        int i235 = -Drawable.resolveOpacity(0, 0);
                                                                                                        int PngjBadSignature16 = isAuthSucess.PngjException.PngjBadSignature.values.PngjBadSignature();
                                                                                                        int i236 = (i235 * 522) - 6240;
                                                                                                        int i237 = ~PngjBadSignature16;
                                                                                                        int i238 = ((~((i237 ^ 12) | (i237 & 12))) | i235) * (-1042);
                                                                                                        int i239 = ((i236 | i238) << 1) - (i238 ^ i236);
                                                                                                        int i240 = (PngjBadSignature16 | 12) * 521;
                                                                                                        int i241 = (i239 ^ i240) + ((i239 & i240) << 1);
                                                                                                        int i242 = ~i235;
                                                                                                        strArr2 = split2;
                                                                                                        int i243 = ~((i242 ^ (-13)) | (i242 & (-13)));
                                                                                                        int i244 = ~((i242 ^ PngjBadSignature16) | (PngjBadSignature16 & i242));
                                                                                                        int i245 = (i243 & i244) | (i243 ^ i244);
                                                                                                        int i246 = (i235 & i237) | (i237 ^ i235);
                                                                                                        int i247 = ~((i246 & 12) | (i246 ^ 12));
                                                                                                        Object[] objArr54 = new Object[1];
                                                                                                        a(i234, false, "\u0003\u000f\rￎ\u0001\u000e\u0004\u0012\u000f\t\u0004ￎ\u0010\u0001\u0003\u000b\u0001\u0007\u0005ￚ", (i241 - (~(((i245 & i247) | (i245 ^ i247)) * 521))) - 1, 290 - (~(-KeyEvent.normalizeMetaState(0))), objArr54);
                                                                                                        if (str17.startsWith((String) objArr54[0])) {
                                                                                                            continue;
                                                                                                        } else {
                                                                                                            int mode2 = View.MeasureSpec.getMode(0);
                                                                                                            int PngjBadSignature17 = isAuthSucess.PngjException.PngjBadSignature.values.PngjBadSignature();
                                                                                                            int i248 = mode2 * (-464);
                                                                                                            int i249 = (i248 & (-7432)) + (i248 | (-7432));
                                                                                                            int i250 = ~mode2;
                                                                                                            int i251 = (PngjBadSignature17 ^ 8) | (PngjBadSignature17 & 8);
                                                                                                            int i252 = ~i251;
                                                                                                            int i253 = (i249 - (~(((i250 ^ i252) | (i252 & i250)) * (-465)))) - 1;
                                                                                                            int i254 = ~((PngjBadSignature17 & i250) | (i250 ^ PngjBadSignature17));
                                                                                                            int i255 = (((i254 & 8) | (i254 ^ 8)) * 930) + i253;
                                                                                                            int i256 = ~mode2;
                                                                                                            int i257 = ((i256 & i251) | (i251 ^ i256)) * 465;
                                                                                                            int i258 = ((i255 | i257) << 1) - (i257 ^ i255);
                                                                                                            int rgb = Color.rgb(0, 0, 0);
                                                                                                            int i259 = rgb * 755;
                                                                                                            int i260 = (i259 & 251655981) + (i259 | 251655981);
                                                                                                            int i261 = ~rgb;
                                                                                                            int i262 = ~(i261 | 16777219);
                                                                                                            int i263 = ~rgb;
                                                                                                            int i264 = ~((i263 ^ i) | (i263 & i));
                                                                                                            int i265 = (((i262 ^ i264) | (i264 & i262) | (~((i ^ 16777219) | (i & 16777219)))) * (-754)) + i260;
                                                                                                            int i266 = (i263 & 16777219) | (i263 ^ 16777219);
                                                                                                            int i267 = ~((i266 & i) | (i266 ^ i));
                                                                                                            int i268 = ~(i179 | rgb | 16777219);
                                                                                                            int i269 = ((i268 & i267) | (i267 ^ i268)) * (-754);
                                                                                                            int i270 = (i265 & i269) + (i269 | i265);
                                                                                                            int i271 = -(-(((i261 ^ i12) | (i261 & i12)) * 754));
                                                                                                            int i272 = (i270 ^ i271) + ((i271 & i270) << 1);
                                                                                                            int i273 = -(-View.combineMeasuredStates(0, 0));
                                                                                                            int i274 = ((i273 | 291) << 1) - (i273 ^ 291);
                                                                                                            Object[] objArr55 = new Object[1];
                                                                                                            a(i258, false, "\u0007\u0005ￚ\u0010\u0001\u0003\u000b\u0001", i272, i274, objArr55);
                                                                                                            if (str17.startsWith((String) objArr55[0])) {
                                                                                                                int i275 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                                                                                int i276 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                                                                                                                int i277 = ((i276 | 1) << 1) - (i276 ^ 1);
                                                                                                                int keyCodeFromString2 = KeyEvent.keyCodeFromString(BuildConfig.FLAVOR);
                                                                                                                int i278 = ((keyCodeFromString2 | 253) << 1) - (keyCodeFromString2 ^ 253);
                                                                                                                Object[] objArr56 = new Object[1];
                                                                                                                a(i275, true, "\u0000", i277, i278, objArr56);
                                                                                                                String[] split3 = str17.split((String) objArr56[0]);
                                                                                                                if (split3.length > 1 && split3[1].equalsIgnoreCase(str13)) {
                                                                                                                }
                                                                                                            } else {
                                                                                                                continue;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    i232 = ((i232 & 1) << 1) + (i232 ^ 1);
                                                                                                    split2 = strArr2;
                                                                                                    i25 = 19;
                                                                                                }
                                                                                            } catch (IOException unused5) {
                                                                                            }
                                                                                        } catch (Throwable th2) {
                                                                                            Throwable cause2 = th2.getCause();
                                                                                            if (cause2 != null) {
                                                                                                throw cause2;
                                                                                            }
                                                                                            throw th2;
                                                                                        }
                                                                                    } catch (Throwable th3) {
                                                                                        Throwable cause3 = th3.getCause();
                                                                                        if (cause3 != null) {
                                                                                            throw cause3;
                                                                                        }
                                                                                        throw th3;
                                                                                    }
                                                                                } finally {
                                                                                    try {
                                                                                        process.destroy();
                                                                                    } catch (Exception unused6) {
                                                                                    }
                                                                                }
                                                                            } catch (InterruptedException e) {
                                                                                throw e;
                                                                            }
                                                                        } catch (Exception unused7) {
                                                                            int i279 = 27 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                            int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 2;
                                                                            int i280 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                                            int i281 = (i280 ^ 286) + ((i280 & 286) << 1);
                                                                            Object[] objArr57 = new Object[1];
                                                                            a(i279, true, "\u0006￫ￓ\u0018\u0018\n\b\u0014\u0017\u0015ￅ\u0006ￅ\n\u0019\u0006\n\u0017\bￅ\u0014\u0019ￅ\t\n\u0011\u000e", pressedStateDuration2, i281, objArr57);
                                                                            throw new IOException((String) objArr57[0]);
                                                                        }
                                                                    } catch (Throwable th4) {
                                                                        th = th4;
                                                                        Throwable cause4 = th.getCause();
                                                                        if (cause4 != null) {
                                                                            throw cause4;
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                }
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                Throwable cause5 = th.getCause();
                                                                if (cause5 != null) {
                                                                    throw cause5;
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                        }
                                                    } catch (Throwable th8) {
                                                        Throwable cause6 = th8.getCause();
                                                        if (cause6 != null) {
                                                            throw cause6;
                                                        }
                                                        throw th8;
                                                    }
                                                } catch (Throwable th9) {
                                                    Throwable cause7 = th9.getCause();
                                                    if (cause7 != null) {
                                                        throw cause7;
                                                    }
                                                    throw th9;
                                                }
                                            } catch (Exception unused8) {
                                                i11 = i9;
                                                i12 = i7;
                                                int i2792 = 27 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                int pressedStateDuration22 = (ViewConfiguration.getPressedStateDuration() >> 16) + 2;
                                                int i2802 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                int i2812 = (i2802 ^ 286) + ((i2802 & 286) << 1);
                                                Object[] objArr572 = new Object[1];
                                                a(i2792, true, "\u0006￫ￓ\u0018\u0018\n\b\u0014\u0017\u0015ￅ\u0006ￅ\n\u0019\u0006\n\u0017\bￅ\u0014\u0019ￅ\t\n\u0011\u000e", pressedStateDuration22, i2812, objArr572);
                                                throw new IOException((String) objArr572[0]);
                                            }
                                        } catch (Exception unused9) {
                                            i10 = length2;
                                            i11 = i9;
                                            i12 = i7;
                                            int i27922 = 27 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                            int pressedStateDuration222 = (ViewConfiguration.getPressedStateDuration() >> 16) + 2;
                                            int i28022 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                            int i28122 = (i28022 ^ 286) + ((i28022 & 286) << 1);
                                            Object[] objArr5722 = new Object[1];
                                            a(i27922, true, "\u0006￫ￓ\u0018\u0018\n\b\u0014\u0017\u0015ￅ\u0006ￅ\n\u0019\u0006\n\u0017\bￅ\u0014\u0019ￅ\t\n\u0011\u000e", pressedStateDuration222, i28122, objArr5722);
                                            throw new IOException((String) objArr5722[0]);
                                        }
                                    } catch (IOException unused10) {
                                        strArr = split;
                                        i10 = length2;
                                        i11 = i9;
                                        i12 = i7;
                                    }
                                }
                                objArr = new Object[]{r4, null, new int[1], new int[1], new int[1]};
                                String str18 = (String) defpackage.a.h(str4, str5, invoke);
                                ((int[]) objArr[3])[0] = i;
                                ((int[]) objArr[2])[0] = (i & (-21)) | (i179 & 20);
                                int i282 = (((~((-357347561) | i179)) | 268730600) * 983) + ((((~((-267009810) | i179)) | (-357347561)) * (-983)) - 630151566);
                                int i283 = (i282 & 16) + (i282 | 16);
                                int i284 = (i3 & i283) + (i283 | i3);
                                int i285 = (i284 << 13) ^ i284;
                                int i286 = i285 ^ (i285 >>> 17);
                                int i287 = i286 << 5;
                                ((int[]) objArr[4])[0] = (i286 | i287) & (~(i286 & i287));
                                c = 0;
                            } else {
                                strArr = split;
                                i10 = length2;
                                i11 = i9;
                                i12 = i7;
                            }
                            int i288 = (i11 ^ (-6)) + ((i11 & (-6)) << 1);
                            i9 = (i288 & 7) + (i288 | 7);
                            split = strArr;
                            i7 = i12;
                            length2 = i10;
                            i8 = 0;
                            i25 = 19;
                            i26 = 3;
                            i27 = 4;
                        }
                    } else {
                        i4 = 13;
                    }
                    objArr = new Object[]{null, null, new int[]{i}, new int[]{i}, new int[]{r1 ^ (r1 << 5)}};
                    int i289 = (((~((~i) | (-505826723))) | 405163424) * (-245)) + 1022615232;
                    int i290 = ~((-505826723) | i);
                    int c8 = defpackage.a.c(i290 | 118530647, 245, (i290 * (-245)) + i289, i3);
                    int i291 = c8 << 13;
                    int i292 = ((~c8) & i291) | ((~i291) & c8);
                    int i293 = i292 >>> 17;
                    int i294 = ((~i292) & i293) | ((~i293) & i292);
                    c = 0;
                    if (((int[]) objArr[2])[c] != i) {
                        return objArr;
                    }
                    Object[] objArr58 = new Object[5];
                    int[] iArr = new int[1];
                    objArr58[2] = iArr;
                    int[] iArr2 = new int[1];
                    objArr58[3] = iArr2;
                    objArr58[4] = new int[1];
                    iArr2[c] = i;
                    iArr[c] = i;
                    objArr58[1] = null;
                    objArr58[c] = null;
                    int i295 = ~i;
                    int i296 = ((138446721 | (~((-398157887) | i)) | (~(398157886 | i295))) * 988) + (((~(226199483 | i295)) | 310405124) * (-1976)) + (((i | 138446721) * 988) - 1426222119);
                    int PngjBadSignature18 = isAuthSucess.PngjException.PngjBadSignature.values.PngjBadSignature();
                    int i297 = i296 * 399;
                    int i298 = -(-(i3 * 399));
                    int i299 = (i297 ^ i298) + ((i297 & i298) << 1);
                    int i300 = ~i296;
                    int i301 = ~((i300 & i3) | (i300 ^ i3));
                    int i302 = ~i3;
                    int i303 = ~((i302 ^ i296) | (i302 & i296));
                    int i304 = (i301 & i303) | (i301 ^ i303);
                    int i305 = ~((i302 ^ PngjBadSignature18) | (i302 & PngjBadSignature18));
                    int i306 = ((i304 & i305) | (i304 ^ i305)) * 398;
                    int i307 = ((i299 | i306) << 1) - (i306 ^ i299);
                    int i308 = -(-(((i296 ^ i3) | (i296 & i3)) * (-1194)));
                    int i309 = ((i307 | i308) << 1) - (i308 ^ i307);
                    int i310 = ~((~PngjBadSignature18) | i302);
                    int i311 = ~i296;
                    int i312 = ~((i311 & i3) | (i311 ^ i3));
                    int i313 = (i310 & i312) | (i310 ^ i312);
                    int i314 = ~(i296 | (~i3));
                    int i315 = (i309 - (~(-(-(((i314 & i313) | (i313 ^ i314)) * 398))))) - 1;
                    int i316 = i315 << 13;
                    int i317 = (i316 & (~i315)) | ((~i316) & i315);
                    int i318 = i317 ^ (i317 >>> 17);
                    int i319 = i318 << 5;
                    ((int[]) objArr58[4])[0] = ((~i318) & i319) | ((~i319) & i318);
                    if (((int[]) objArr58[2])[0] != i) {
                        return objArr58;
                    }
                    if ((i2 & 1) == 0) {
                        Object[] objArr59 = new Object[1];
                        c("\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000", true, new int[]{116, i4, 34, 11}, objArr59);
                        try {
                            Object[] objArr60 = {(String) objArr59[0]};
                            int packedPositionType2 = ExpandableListView.getPackedPositionType(0L);
                            int i320 = (packedPositionType2 ^ 23) + ((packedPositionType2 & 23) << 1);
                            int i321 = -Color.blue(0);
                            int i322 = (i321 & 9) + (i321 | 9);
                            int i323 = -(-(ViewConfiguration.getTapTimeout() >> 16));
                            int i324 = (i323 & 296) + (i323 | 296);
                            Object[] objArr61 = new Object[1];
                            a(i320, false, "\u000f\uffc9\uffde\n\t\u000f\u0000\u0013\u000f￼\t\uffff\r\n\u0004\uffff\uffc9\ufffe\n\t\u000f\u0000\t", i322, i324, objArr61);
                            Class<?> cls9 = Class.forName((String) objArr61[0]);
                            int i325 = -TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0');
                            int i326 = (i325 ^ 15) | (i325 & 15);
                            int i327 = ((~((i326 & i) | (i326 ^ i))) * (-301)) + (i325 * (-300)) + 4530;
                            int i328 = ~(((-16) & i) | ((-16) ^ i));
                            int i329 = ~i;
                            int i330 = ~((i329 ^ i325) | (i329 & i325));
                            int i331 = -(-(((i328 & i330) | (i328 ^ i330)) * (-301)));
                            int i332 = (i327 & i331) + (i331 | i327);
                            int i333 = ~i325;
                            int i334 = ~((i333 & i) | (i333 ^ i));
                            int i335 = -(-(((i334 & (-16)) | ((-16) ^ i334)) * 301));
                            Object[] objArr62 = new Object[1];
                            a((i332 ^ i335) + ((i335 & i332) << 1), true, "\u000b￼\ufffe￼\ufffa\u0000\r\t￼￪\u0004￼\u000b\n\u0010￪", 3 - (ViewConfiguration.getKeyRepeatDelay() >> 16), View.combineMeasuredStates(0, 0) + 300, objArr62);
                            Object invoke2 = cls9.getMethod((String) objArr62[0], String.class).invoke(context, objArr60);
                            if (invoke2 != null) {
                                Object[] objArr63 = new Object[1];
                                a(37 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), true, "￫\u0017\u0001\u0007\n\r￮\u0003\u0001\u0007\u0014\u0003￢ￌ\f\u0007\u000b\u0002\uffffￌ\u000e\u000e\uffffￌ\u0002\u0007\r\u0010\u0002\f\uffff\u0010\u0003\u0005\uffff\f\uffff", TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 31, 292 - (~(-(-Color.alpha(0)))), objArr63);
                                Class<?> cls10 = Class.forName((String) objArr63[0]);
                                int i336 = 15 - (~(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                                int i337 = 7 - (~(-(ViewConfiguration.getFadingEdgeLength() >> 16)));
                                int threadPriority2 = (Process.getThreadPriority(0) + 20) >> 6;
                                int PngjBadSignature19 = isAuthSucess.PngjException.PngjBadSignature.values.PngjBadSignature();
                                int i338 = -(-(threadPriority2 * 306));
                                int i339 = ((i338 ^ 610) + ((i338 & 610) << 1)) - (-90576);
                                int i340 = ~((threadPriority2 ^ 296) | (threadPriority2 & 296));
                                int i341 = ~((threadPriority2 ^ PngjBadSignature19) | (threadPriority2 & PngjBadSignature19));
                                int i342 = (i339 - (~(((i340 & i341) | (i340 ^ i341)) * 305))) - 1;
                                int i343 = -(-(((~(threadPriority2 | (~PngjBadSignature19))) | (-297)) * 305));
                                int i344 = (i342 ^ i343) + ((i343 & i342) << 1);
                                Object[] objArr64 = new Object[1];
                                a(i336, false, "\u0011\u0000ￜ\uffff\b\u0004\t\u000e\u0002\u0000\u000fￜ\ufffe\u000f\u0004", i337, i344, objArr64);
                                List list = (List) cls10.getMethod((String) objArr64[0], null).invoke(invoke2, null);
                                if (list != null) {
                                    Iterator it2 = list.iterator();
                                    loop1: while (it2.hasNext()) {
                                        Object next = it2.next();
                                        int i345 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                        Object[] objArr65 = new Object[1];
                                        a((i345 ^ 30) + ((i345 & 30) << 1), true, "\u0005\u000b\u000e\u0000\n�\u0001\t�￪\u0010\n\u0001\n\u000b\f\t\u000b\uffdfￊ\u0010\n\u0001\u0010\n\u000b\uffffￊ\u0000", 5 - ExpandableListView.getPackedPositionChild(0L), 293 - (~(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr65);
                                        Class<?> cls11 = Class.forName((String) objArr65[0]);
                                        Object[] objArr66 = new Object[1];
                                        c("\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000", true, new int[]{62, 14, 0, 0}, objArr66);
                                        String str19 = (String) cls11.getMethod((String) objArr66[0], null).invoke(next, null);
                                        int keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay() >> 16;
                                        int PngjBadSignature20 = isAuthSucess.PngjException.PngjBadSignature.values.PngjBadSignature();
                                        int i346 = keyRepeatDelay * 51;
                                        int i347 = (((keyRepeatDelay ^ PngjBadSignature20) | (keyRepeatDelay & PngjBadSignature20)) * (-50)) + (((i346 | (-1813)) << 1) - (i346 ^ (-1813)));
                                        int i348 = ~keyRepeatDelay;
                                        int i349 = (i348 & (-38)) | (i348 ^ (-38));
                                        int i350 = ~((i349 & PngjBadSignature20) | (i349 ^ PngjBadSignature20));
                                        int i351 = ~PngjBadSignature20;
                                        int i352 = ((-38) ^ i351) | ((-38) & i351);
                                        int i353 = ~((i352 ^ keyRepeatDelay) | (i352 & keyRepeatDelay));
                                        int i354 = ((i350 ^ i353) | (i350 & i353)) * 50;
                                        int i355 = (i347 & i354) + (i347 | i354);
                                        int i356 = ~PngjBadSignature20;
                                        int i357 = ~(((-38) & i356) | ((-38) ^ i356));
                                        int i358 = ~((-38) | keyRepeatDelay);
                                        int i359 = (i357 & i358) | (i357 ^ i358);
                                        int i360 = ~((keyRepeatDelay & i351) | (i351 ^ keyRepeatDelay));
                                        int i361 = -(-(((i360 & i359) | (i359 ^ i360)) * 50));
                                        int i362 = (i355 ^ i361) + ((i361 & i355) << 1);
                                        int i363 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                        int i364 = i363 * 595;
                                        int i365 = (i364 ^ (-36797)) + ((i364 & (-36797)) << 1);
                                        int i366 = ~i363;
                                        int i367 = ~((i366 & 31) | (i366 ^ 31));
                                        int i368 = ~((i329 ^ 31) | (i329 & 31));
                                        int i369 = ((i368 & i367) | (i367 ^ i368)) * (-1188);
                                        int i370 = ((i365 | i369) << 1) - (i369 ^ i365);
                                        int i371 = i367 | (~(((-32) ^ i) | ((-32) & i)));
                                        int i372 = ~((i295 ^ i363) | (i295 & i363));
                                        int i373 = ((i371 & i372) | (i371 ^ i372)) * 594;
                                        int i374 = (i370 & i373) + (i373 | i370);
                                        int i375 = ~(((-32) ^ i295) | ((-32) & i295));
                                        int i376 = ~(((-32) & i363) | ((-32) ^ i363));
                                        int i377 = (i375 & i376) | (i375 ^ i376);
                                        int i378 = ~((i363 & i295) | (i295 ^ i363));
                                        int i379 = (((i378 & i377) | (i377 ^ i378)) * 594) + i374;
                                        int i380 = -(-View.MeasureSpec.getMode(0));
                                        int i381 = (i380 & 293) + (i380 | 293);
                                        Object[] objArr67 = new Object[1];
                                        a(i362, true, "￫\u0017\u0001\u0007\n\r￮\u0003\u0001\u0007\u0014\u0003￢ￌ\f\u0007\u000b\u0002\uffffￌ\u000e\u000e\uffffￌ\u0002\u0007\r\u0010\u0002\f\uffff\u0010\u0003\u0005\uffff\f\uffff", i379, i381, objArr67);
                                        Class<?> cls12 = Class.forName((String) objArr67[0]);
                                        Object[] objArr68 = new Object[1];
                                        c("\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", false, new int[]{129, 17, 0, 11}, objArr68);
                                        if (((Boolean) cls12.getMethod((String) objArr68[0], String.class).invoke(invoke2, str19)).booleanValue() && str19.length() - 20 >= 0) {
                                            int i382 = 0;
                                            while (i382 <= length) {
                                                Object[] objArr69 = {str19.substring(i382, (i382 ^ 20) + ((i382 & 20) << 1)), 931995};
                                                Object PngjBadSignature21 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                                                if (PngjBadSignature21 == null) {
                                                    char rgb2 = (char) (Color.rgb(0, 0, 0) + 16788255);
                                                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31;
                                                    int resolveSize2 = 1282 - View.resolveSize(0, 0);
                                                    byte b8 = $$a[19];
                                                    obj = invoke2;
                                                    it = it2;
                                                    Object[] objArr70 = new Object[1];
                                                    b(b8, b8, r14[13], objArr70);
                                                    PngjBadSignature21 = com.d.e.a.PngjBadCrcException.PngjBadSignature(rgb2, scrollBarFadeDuration, resolveSize2, -971849413, false, (String) objArr70[0], new Class[]{String.class, Integer.TYPE});
                                                } else {
                                                    obj = invoke2;
                                                    it = it2;
                                                }
                                                long longValue7 = ((Long) ((Method) PngjBadSignature21).invoke(null, objArr69)).longValue();
                                                long j49 = 39378044;
                                                long j50 = ((-279) * longValue7) + (141 * j49);
                                                long j51 = 140;
                                                long a2 = defpackage.a.a();
                                                long j52 = ((longValue7 | a2) * j51) + j50;
                                                long j53 = -1;
                                                long j54 = (j49 ^ j53) | longValue7;
                                                long j55 = a2 ^ j53;
                                                long j56 = (j51 * (((j54 | a2) ^ j53) | (((longValue7 ^ j53) | j49) ^ j53) | ((j55 | j49) ^ j53))) + ((-280) * ((j54 ^ j53) | ((j55 | longValue7) ^ j53))) + j52 + 616329656;
                                                int i383 = ((int) (j56 >> 32)) & ((((~((-1641741496) | i295)) | 1215999389) * 783) + (((~((-562057251) | i295)) * (-783)) - 1502522761));
                                                int i384 = ((int) j56) & ((((~(1609428990 | i)) | 4195744) * 366) + ((((~(1525425572 | i)) | 88199162) * (-366)) - 756746495));
                                                if (((i383 & i384) | (i383 ^ i384)) == 1245577864) {
                                                    objArr5 = new Object[]{null, null, new int[]{i ^ 70}, new int[]{i}, new int[1]};
                                                    int myUid2 = Process.myUid();
                                                    int i385 = (((~(myUid2 | 541423432)) | (~((-82933938) | myUid2)) | 78645425) * 407) + (((~(82933937 | myUid2)) | (~((~myUid2) | (-541423433))) | 78645425) * 407) + (((537134920 | r4) * (-814)) - 1143353181);
                                                    int i386 = (i385 ^ 16) | (i385 & 16);
                                                    int i387 = (((i385 * 503) + 8048) - (~(i386 * (-502)))) - 1;
                                                    int i388 = (~((-17) | (~i385))) | (~((i329 & (-17)) | ((-17) ^ i329)));
                                                    int i389 = ~((i386 & i) | (i386 ^ i));
                                                    int i390 = -(-(((i388 & i389) | (i388 ^ i389)) * (-502)));
                                                    int i391 = ~(i385 | ((-17) ^ i295) | ((-17) & i295));
                                                    int i392 = (((i391 & i389) | (i391 ^ i389)) * 502) + (i387 & i390) + (i387 | i390);
                                                    int i393 = (i3 ^ i392) + ((i392 & i3) << 1);
                                                    int i394 = i393 << 13;
                                                    int i395 = (i394 | i393) & (~(i393 & i394));
                                                    int i396 = i395 >>> 17;
                                                    int i397 = ((~i395) & i396) | ((~i396) & i395);
                                                    int i398 = i397 << 5;
                                                    ((int[]) objArr5[4])[0] = (i397 | i398) & (~(i397 & i398));
                                                    c3 = 0;
                                                    break loop1;
                                                }
                                                i382 = (i382 & 1) + (i382 | 1);
                                                it2 = it;
                                                invoke2 = obj;
                                            }
                                        }
                                        it2 = it2;
                                        invoke2 = invoke2;
                                    }
                                }
                            }
                            objArr5 = new Object[]{null, null, new int[]{i}, new int[]{i}, new int[]{r1 ^ (r1 << 5)}};
                            int i399 = (((~((-154734619) | i)) | (~((-4196038) | i295)) | (~(469622751 | i))) * 192) + (((~((-158930656) | i295)) | 154734618) * (-384)) + ((310692096 | i295) * (-192)) + 241887929;
                            int i400 = -(-((i399 << 1) - i399));
                            int i401 = (i3 & i400) + (i400 | i3);
                            int i402 = i401 << 13;
                            int i403 = (i402 | i401) & (~(i401 & i402));
                            int i404 = i403 >>> 17;
                            int i405 = ((~i403) & i404) | ((~i404) & i403);
                            c3 = 0;
                            if (((int[]) objArr5[2])[c3] != i) {
                                return objArr5;
                            }
                        } catch (Throwable th10) {
                            Throwable cause8 = th10.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th10;
                        }
                    }
                    int i406 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
                    int i407 = (i406 ^ 12) + ((i406 & 12) << 1);
                    int i408 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int i409 = ((i408 | 6) << 1) - (i408 ^ 6);
                    int i410 = -(ViewConfiguration.getScrollBarSize() >> 8);
                    int i411 = (i410 ^ 291) + ((i410 & 291) << 1);
                    Object[] objArr71 = new Object[1];
                    a(i407, true, "\u0013\u0005\u0015\u0007ￏ\u000f\u0006\u000e￩\ufff3\uffef\u0014", i409, i411, objArr71);
                    Object[] objArr72 = {(String) objArr71[0]};
                    Object PngjBadSignature22 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1934049891);
                    if (PngjBadSignature22 == null) {
                        char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
                        int indexOf6 = TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 28;
                        int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1447;
                        byte[] bArr6 = $$a;
                        Object[] objArr73 = new Object[1];
                        b((byte) (-bArr6[19]), (byte) (-bArr6[14]), (byte) 32, objArr73);
                        PngjBadSignature22 = com.d.e.a.PngjBadCrcException.PngjBadSignature(absoluteGravity2, indexOf6, minimumFlingVelocity2, -1884803112, false, (String) objArr73[0], new Class[]{String.class});
                    }
                    long longValue8 = ((Long) ((Method) PngjBadSignature22).invoke(null, objArr72)).longValue();
                    long j57 = 48385633;
                    long j58 = ((-782) * longValue8) + (784 * j57);
                    long j59 = -783;
                    long j60 = -1;
                    long j61 = j57 ^ j60;
                    long j62 = i;
                    long j63 = j62 ^ j60;
                    long j64 = ((783 * (j61 | ((j63 | longValue8) ^ j60))) + ((j59 * (((j61 | j63) | longValue8) ^ j60)) + (((longValue8 ^ j60) * j59) + j58))) - 1765302900;
                    int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                    int i412 = ((int) (j64 >> 32)) & (((~((~startUptimeMillis2) | (-8454409))) * 501) + (((~((-8454409) | startUptimeMillis2)) | 85196866) * 501) + 1762578392);
                    int elapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                    int i413 = ~elapsedRealtime3;
                    int i414 = ((int) j64) & ((((~(elapsedRealtime3 | 1835269990)) | 277872777 | (~(i413 | (-1090671873)))) * 369) + (((~((-1835269991) | i413)) | 1022470895) * (-369)) + ((2113142767 | i413) * (-369)) + 802172634);
                    if (((i414 & i412) | (i412 ^ i414)) != 0) {
                        objArr2 = new Object[]{null, null, new int[]{(i & (-51)) | (i295 & 50)}, new int[]{i}, new int[]{((~r1) & r4) | ((~r4) & r1)}};
                        j = j62;
                        int i415 = ((~(i295 | 699657266)) * 886) + ((699657266 | (~((-75299897) | i295))) * (-1772)) + (((~(75299896 | i)) | 696451074 | (~((-72093705) | i295))) * 886) + 1462683479;
                        int i416 = (i3 - (~(-(-(((i415 | 16) << 1) - (i415 ^ 16)))))) - 1;
                        int i417 = i416 << 13;
                        int i418 = (i416 | i417) & (~(i416 & i417));
                        int i419 = i418 >>> 17;
                        int i420 = ((~i418) & i419) | ((~i419) & i418);
                        int i421 = i420 << 5;
                        i5 = 0;
                    } else {
                        j = j62;
                        objArr2 = new Object[]{null, null, new int[]{i}, new int[]{i}, new int[1]};
                        int i422 = -(-((((~(defpackage.a.b(1414105693) | (-413172838))) | 34892672) * 366) + ((((~((-501318768) | r1)) | 123038602) * (-366)) - 1473970619)));
                        int i423 = (i3 ^ i422) + ((i422 & i3) << 1);
                        int i424 = i423 << 13;
                        int i425 = (i424 & (~i423)) | ((~i424) & i423);
                        int i426 = i425 ^ (i425 >>> 17);
                        int i427 = i426 << 5;
                        i5 = 0;
                        ((int[]) objArr2[4])[0] = ((~i426) & i427) | ((~i427) & i426);
                    }
                    if (((int[]) objArr2[2])[i5] != i) {
                        return objArr2;
                    }
                    Object[] objArr74 = new Object[1];
                    c("\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000", true, new int[]{i5, 20, i5, i5}, objArr74);
                    Object[] objArr75 = {(String) objArr74[i5]};
                    Object PngjBadSignature23 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1934049891);
                    if (PngjBadSignature23 == null) {
                        char blue2 = (char) Color.blue(i5);
                        int i428 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 27;
                        int i429 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1446;
                        byte[] bArr7 = $$a;
                        Object[] objArr76 = new Object[1];
                        b((byte) (-bArr7[19]), (byte) (-bArr7[14]), (byte) 32, objArr76);
                        PngjBadSignature23 = com.d.e.a.PngjBadCrcException.PngjBadSignature(blue2, i428, i429, -1884803112, false, (String) objArr76[0], new Class[]{String.class});
                    }
                    long longValue9 = ((Long) ((Method) PngjBadSignature23).invoke(null, objArr75)).longValue();
                    long j65 = -282091692;
                    long j66 = 371;
                    long j67 = (j66 * longValue9) + (j66 * j65);
                    long j68 = -370;
                    long j69 = longValue9 ^ j60;
                    long b9 = defpackage.a.b(1732316131);
                    long j70 = b9 ^ j60;
                    long j71 = j65 ^ j60;
                    long j72 = (j65 | longValue9) ^ j60;
                    long j73 = ((370 * j72) + ((((((j69 | b9) ^ j60) | ((j71 | j70) ^ j60)) | j72) * j68) + (((((j69 | j70) ^ j60) | ((j71 | b9) ^ j60)) * j68) + j67))) - 1434825575;
                    int i430 = ((int) (j73 >> 32)) & ((((~(564548043 | i)) | 2001774454) * 376) + (((~((-564548044) | i295)) | 10899593) * (-376)) + (((1459025597 | i) * 376) - 2088991750));
                    int b10 = defpackage.a.b(1958521568);
                    int i431 = ~((-842121629) | b10);
                    int i432 = ~b10;
                    int i433 = i431 | (~(2015619257 | i432));
                    int i434 = ((int) j73) & (((1208100897 | (~(842121628 | i432))) * 516) + (((~(b10 | (-807518361))) | (~(i432 | (-1208100898)))) * 516) + (((i433 | r11) * (-516)) - 1371614239));
                    if (((i430 & i434) | (i430 ^ i434)) != 0) {
                        objArr3 = new Object[]{null, null, new int[]{r6}, new int[]{i}, new int[1]};
                        int i435 = (~(i & 60)) & (i | 60);
                        int c9 = defpackage.a.c((~(Process.myUid() | 362219212)) | (-530575342), 220, (((-262138158) | r1) * (-220)) - 1251628469, 802624174);
                        int i436 = (c9 ^ 16) + ((c9 & 16) << 1);
                        int i437 = ((i3 | i436) << 1) - (i436 ^ i3);
                        int i438 = i437 << 13;
                        int i439 = ((~i437) & i438) | ((~i438) & i437);
                        int i440 = i439 >>> 17;
                        int i441 = (i439 | i440) & (~(i439 & i440));
                        int i442 = i441 << 5;
                        c2 = 0;
                        ((int[]) objArr3[4])[0] = ((~i441) & i442) | ((~i442) & i441);
                    } else {
                        objArr3 = new Object[]{null, null, new int[]{i}, new int[]{i}, new int[]{(r1 | r4) & (~(r1 & r4))}};
                        int i443 = -(-((((~((-361926989) | i295)) | 794497034) * 494) + ((((-276857157) | i295) * 494) - 1015152997)));
                        int i444 = ((i3 | i443) << 1) - (i443 ^ i3);
                        int i445 = i444 << 13;
                        int i446 = (i445 & (~i444)) | ((~i445) & i444);
                        int i447 = i446 >>> 17;
                        int i448 = (i446 | i447) & (~(i446 & i447));
                        int i449 = i448 << 5;
                        c2 = 0;
                    }
                    if (((int[]) objArr3[2])[c2] != i) {
                        return objArr3;
                    }
                    int i450 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    int i451 = ((i450 | 36) << 1) - (i450 ^ 36);
                    int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                    int i452 = ~jumpTapTimeout;
                    int i453 = (~((i452 ^ (-4)) | (i452 & (-4)))) | i;
                    int i454 = ~((jumpTapTimeout ^ 3) | (jumpTapTimeout & 3));
                    int i455 = (((jumpTapTimeout * (-375)) - 1125) - (~(((i453 & i454) | (i453 ^ i454)) * 376))) - 1;
                    int i456 = ~(i295 | jumpTapTimeout);
                    int i457 = ~(jumpTapTimeout | 3);
                    int i458 = ((i457 & i456) | (i456 ^ i457)) * (-376);
                    int i459 = ((i455 | i458) << 1) - (i458 ^ i455);
                    int i460 = ~((i452 ^ i) | (i452 & i));
                    int i461 = (i459 - (~(((i460 & 3) | (i460 ^ 3)) * 376))) - 1;
                    int i462 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int i463 = (i462 ^ 291) + ((i462 & 291) << 1);
                    Object[] objArr77 = new Object[1];
                    a(i451, true, "\u0002\u0005\uffd0\u0002\u0015\u0002\u0005\u0000\u0014\u0007\u0017\uffd0\u0005\n\u0010\u0013\u0005\u000f\u0002ￏ\u0019\u0010\u0003\bￏ\u000e\u0010\u0004\uffd0\u0002\u0015\u0002\u0005\uffd0\u0002\u0015", i461, i463, objArr77);
                    Object[] objArr78 = {(String) objArr77[0]};
                    Object PngjBadSignature24 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1142218481);
                    if (PngjBadSignature24 == null) {
                        char windowTouchSlop2 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int defaultSize = 28 - View.getDefaultSize(0, 0);
                        int i464 = 1448 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte[] bArr8 = $$a;
                        byte b11 = bArr8[19];
                        byte b12 = bArr8[0];
                        Object[] objArr79 = new Object[1];
                        b(b11, b12, (byte) (b12 | 17), objArr79);
                        PngjBadSignature24 = com.d.e.a.PngjBadCrcException.PngjBadSignature(windowTouchSlop2, defaultSize, i464, 1191464116, false, (String) objArr79[0], new Class[]{String.class});
                    }
                    long longValue10 = ((Long) ((Method) PngjBadSignature24).invoke(null, objArr78)).longValue();
                    long j74 = -1585172453;
                    long j75 = 868;
                    long j76 = j74 ^ j60;
                    long j77 = longValue10 ^ j60;
                    long j78 = j76 | j77;
                    long j79 = ((867 * ((((j78 | j63) ^ j60) | (((j76 | longValue10) | j) ^ j60)) | (((j77 | j74) | j) ^ j60))) + (((-1734) * (((j78 ^ j60) | ((j76 | j) ^ j60)) | ((j77 | j) ^ j60))) + (((-867) * (((j76 | j63) ^ j60) | ((j77 | j63) ^ j60))) + ((j75 * longValue10) + (j75 * j74))))) - 370825424;
                    if (((((int) j79) & ((((~((-1816385904) | i)) | 67207493 | (~(2128337903 | i295))) * 369) + (((~(1816385903 | i295)) | 379159493) * (-369)) + (((-1749178411) | i295) * (-369)) + 802172634)) | (((int) (j79 >> 32)) & ((((~((-1521549869) | i295)) | (~((-524545) | i)) | (~(1606397869 | i))) * 867) + (((~((-1522074413) | i)) | 1521549868 | (~(84848001 | i))) * (-1734)) + (((~((-1522074413) | i295)) | (~(84848001 | i295))) * (-867)) + 1972008040))) != 0) {
                        objArr4 = new Object[]{null, null, new int[]{(i & (-81)) | (i295 & 80)}, new int[]{i}, new int[]{((~r1) & r4) | ((~r4) & r1)}};
                        int i465 = (((~((-618046121) | i)) | (~(6311249 | i295))) * 406) + ((~((-2116946) | i295)) * (-406)) + (((~((-6311250) | i)) | (~(620163065 | i295))) * (-406)) + 1368102911;
                        int i466 = i465 * 628;
                        int i467 = ((10048 | i466) << 1) - (i466 ^ 10048);
                        int i468 = (i465 ^ i) | (i465 & i);
                        int i469 = -(-(((i468 & (-17)) | (i468 ^ (-17))) * (-627)));
                        int i470 = ((i467 | i469) << 1) - (i469 ^ i467);
                        int i471 = ~i465;
                        int i472 = (((~((i471 & i) | (i471 ^ i))) | 16) * (-627)) + i470;
                        int i473 = ((~(i465 | (~i))) | (~((i ^ 16) | (i & 16)))) * 627;
                        int i474 = -(-(((i472 | i473) << 1) - (i473 ^ i472)));
                        int i475 = ((i3 | i474) << 1) - (i474 ^ i3);
                        int i476 = i475 << 13;
                        int i477 = (i476 | i475) & (~(i475 & i476));
                        int i478 = i477 >>> 17;
                        int i479 = (i477 | i478) & (~(i477 & i478));
                        int i480 = i479 << 5;
                        i6 = 0;
                    } else {
                        objArr4 = new Object[]{null, null, new int[]{i}, new int[]{i}, new int[1]};
                        int maxMemory3 = (int) Runtime.getRuntime().maxMemory();
                        int i481 = ~maxMemory3;
                        int i482 = ~(210039659 | i481);
                        int i483 = (((-414317711) | i482) * 712) + (((~(maxMemory3 | 481689583)) | (~(i481 | (-271649925)))) * (-712)) + ((271649924 | i482) * (-712)) + 41441617;
                        int i484 = (i3 & i483) + (i483 | i3);
                        int i485 = i484 << 13;
                        int i486 = (i484 | i485) & (~(i484 & i485));
                        int i487 = i486 >>> 17;
                        int i488 = (i486 | i487) & (~(i486 & i487));
                        int i489 = i488 << 5;
                        i6 = 0;
                        ((int[]) objArr4[4])[0] = ((~i488) & i489) | ((~i489) & i488);
                    }
                    if (((int[]) objArr4[2])[i6] != i) {
                        return objArr4;
                    }
                    Object[] objArr80 = new Object[1];
                    c("\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000", i6, new int[]{20, 42, i6, 29}, objArr80);
                    Object[] objArr81 = {(String) objArr80[i6]};
                    Object PngjBadSignature25 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1142218481);
                    if (PngjBadSignature25 == null) {
                        char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        int resolveSizeAndState = 28 - View.resolveSizeAndState(0, 0, 0);
                        int trimmedLength = TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 1447;
                        byte[] bArr9 = $$a;
                        byte b13 = bArr9[19];
                        byte b14 = bArr9[0];
                        Object[] objArr82 = new Object[1];
                        b(b13, b14, (byte) (b14 | 17), objArr82);
                        PngjBadSignature25 = com.d.e.a.PngjBadCrcException.PngjBadSignature(scrollBarSize, resolveSizeAndState, trimmedLength, 1191464116, false, (String) objArr82[0], new Class[]{String.class});
                    }
                    long longValue11 = ((Long) ((Method) PngjBadSignature25).invoke(null, objArr81)).longValue();
                    long j80 = -791940657;
                    long j81 = 628;
                    long j82 = (j81 * longValue11) + (j81 * j80);
                    long j83 = -627;
                    long j84 = ((627 * (((j63 | longValue11) ^ j60) | ((j | j80) ^ j60))) + ((j83 * ((((longValue11 ^ j60) | j) ^ j60) | j80)) + ((((longValue11 | j) | (j80 ^ j60)) * j83) + j82))) - 1164057220;
                    if (((((int) (j84 >> 32)) & ((((~((-1488540372) | i295)) | (-1369200514)) * 216) + (((-136380499) | i295) * (-216)) + ((~((-1488540372) | i)) * 216) + 1429620858)) | (((int) j84) & (((~((-1113768103) | i)) * 283) + (((~((-1139984552) | i)) | 26216449) * (-283)) + 1687061360))) == 0) {
                        Object[] objArr83 = {null, null, new int[]{i}, new int[]{i}, new int[1]};
                        int maxMemory4 = (int) Runtime.getRuntime().maxMemory();
                        int i490 = ~maxMemory4;
                        int i491 = (((~(i490 | 1065906061)) | (~(441548691 | i490))) * 865) + ((~(maxMemory4 | 1065906061)) * 865) + ((((~((-1065906062) | i490)) | 441548691) * (-865)) - 1097339270);
                        int PngjBadSignature26 = isAuthSucess.PngjException.PngjBadSignature.values.PngjBadSignature();
                        int i492 = -(-(i491 * 111));
                        int i493 = ~((i491 ^ PngjBadSignature26) | (i491 & PngjBadSignature26));
                        int i494 = -(-((i493 | ((-1) ^ i493)) * (-220)));
                        int i495 = (i492 ^ i494) + ((i492 & i494) << 1);
                        int i496 = ~i491;
                        int i497 = ~(PngjBadSignature26 | i491);
                        int i498 = (i3 - (~(-(-((((((i497 & i496) | (i496 ^ i497)) * 220) + i495) - (~(-(-(((~(~i491)) | (~(((-1) ^ i491) | i491))) * 110))))) - 1))))) - 1;
                        int i499 = i498 << 13;
                        int i500 = ((~i498) & i499) | ((~i499) & i498);
                        int i501 = i500 >>> 17;
                        int i502 = ((~i500) & i501) | ((~i501) & i500);
                        int i503 = i502 << 5;
                        ((int[]) objArr83[4])[0] = (i502 | i503) & (~(i502 & i503));
                        return objArr83;
                    }
                    Object[] objArr84 = {null, null, new int[]{r6}, new int[]{i}, new int[1]};
                    int i504 = (~(i & 90)) & (i | 90);
                    int elapsedRealtime4 = (int) SystemClock.elapsedRealtime();
                    int c10 = defpackage.a.c((~(elapsedRealtime4 | 99961268)) | 705179658 | (~((~elapsedRealtime4) | (-80822289))), 164, ((724318638 | elapsedRealtime4) * 164) + ((((~((-99961269) | r4)) | 724318638) * (-328)) - 1632691355), 16);
                    int i505 = (i3 * (-219)) + (c10 * 221);
                    int i506 = ~c10;
                    int i507 = ~((i506 & i302) | (i506 ^ i302));
                    int i508 = i295 | c10;
                    int i509 = ~((i508 & i3) | (i508 ^ i3));
                    int i510 = -(-(((i507 & i509) | (i507 ^ i509)) * 220));
                    int i511 = (i505 & i510) + (i510 | i505);
                    int i512 = ~((i295 ^ i3) | (i295 & i3));
                    int i513 = -(-(((i512 & c10) | (c10 ^ i512)) * (-440)));
                    int i514 = (((c10 & i3) | (c10 ^ i3) | i) * 220) + (i511 ^ i513) + ((i513 & i511) << 1);
                    int i515 = i514 << 13;
                    int i516 = (i514 | i515) & (~(i514 & i515));
                    int i517 = i516 >>> 17;
                    int i518 = (i516 | i517) & (~(i516 & i517));
                    int i519 = i518 << 5;
                    ((int[]) objArr84[4])[0] = ((~i518) & i519) | ((~i519) & i518);
                    return objArr84;
                } catch (Throwable th11) {
                    Throwable cause9 = th11.getCause();
                    if (cause9 != null) {
                        throw cause9;
                    }
                    throw th11;
                }
                int i2882 = (i11 ^ (-6)) + ((i11 & (-6)) << 1);
                i9 = (i2882 & 7) + (i2882 | 7);
                split = strArr;
                i7 = i12;
                length2 = i10;
                i8 = 0;
                i25 = 19;
                i26 = 3;
                i27 = 4;
            } catch (Throwable th12) {
                Throwable cause10 = th12.getCause();
                if (cause10 != null) {
                    throw cause10;
                }
                throw th12;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x015e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, boolean z, String str, int i2, int i3, Object[] objArr) {
            Throwable cause;
            char c;
            int i4;
            int i5 = $11 + 41;
            $10 = i5 % Uuid.SIZE_BITS;
            if (i5 % 2 != 0) {
                throw null;
            }
            char[] charArray = str != null ? str.toCharArray() : str;
            com.d.e.Action action = new com.d.e.Action();
            char[] cArr = new char[i];
            action.valueOf = 0;
            while (true) {
                int i6 = action.valueOf;
                if (i6 >= i) {
                    break;
                }
                $11 = ($10 + 53) % Uuid.SIZE_BITS;
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
                    if (cause != null) {
                    }
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            if (i2 > 0) {
                $10 = ($11 + 33) % Uuid.SIZE_BITS;
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
                $11 = ($10 + 85) % Uuid.SIZE_BITS;
                while (true) {
                    int i9 = action.valueOf;
                    if (i9 >= i) {
                        break;
                    }
                    $10 = ($11 + 23) % Uuid.SIZE_BITS;
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
            $11 = ($10 + 19) % Uuid.SIZE_BITS;
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

        private static void c(String str, boolean z, int[] iArr, Object[] objArr) {
            int i;
            int i2;
            byte[] bArr;
            int i3;
            String str2 = str;
            byte[] bArr2 = str2;
            if (str2 != null) {
                bArr2 = str2.getBytes("ISO-8859-1");
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
                $10 = ($11 + 59) % Uuid.SIZE_BITS;
                int i9 = 0;
                while (i9 < length) {
                    int i10 = $10 + 107;
                    $11 = i10 % Uuid.SIZE_BITS;
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
                $10 = ($11 + 11) % Uuid.SIZE_BITS;
                char[] cArr4 = new char[i6];
                e1Var.PngjBadSignature = 0;
                char c = 0;
                while (true) {
                    int i12 = e1Var.PngjBadSignature;
                    if (i12 >= i6) {
                        break;
                    }
                    $10 = ($11 + 123) % Uuid.SIZE_BITS;
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
                        $10 = ($11 + 101) % Uuid.SIZE_BITS;
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
            valueOf = i % Uuid.SIZE_BITS;
            if (i % 2 == 0) {
                int i2 = 48 / 0;
            }
            return bool;
        }
    }

    static {
        Logger.getLogger(a.class.getName());
        valueOf = StandardCharsets.ISO_8859_1;
        new PngjBadCrcException();
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
