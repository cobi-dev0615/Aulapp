package com.identy;

import android.os.Process;
import android.util.Pair;
import com.identy.enums.Finger;
import com.identy.enums.Hand;
import java.lang.reflect.Method;
import kotlin.io.ConstantsKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'RIGHT_THUMB' uses external variables
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
public final class Position {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    public static final Position LEFT_INDEX;
    public static final Position LEFT_LITTLE;
    public static final Position LEFT_MIDDLE;
    public static final Position LEFT_RING;
    public static final Position LEFT_THUMB;
    public static final Position RIGHT_INDEX;
    public static final Position RIGHT_LITTLE;
    public static final Position RIGHT_MIDDLE;
    public static final Position RIGHT_RING;
    public static final Position RIGHT_THUMB;
    public static final Position UNKNOWN;
    private static final /* synthetic */ Position[] c;
    Hand a;
    Finger b;

    public static /* synthetic */ class PngjBadCrcException {
        static final /* synthetic */ int[] valueOf;
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[Hand.valuesCustom().length];
            values = iArr;
            try {
                iArr[Hand.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                values[Hand.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Finger.valuesCustom().length];
            valueOf = iArr2;
            try {
                iArr2[Finger.RING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                valueOf[Finger.INDEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                valueOf[Finger.THUMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                valueOf[Finger.LITTLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                valueOf[Finger.MIDDLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        init$0();
        UNKNOWN = new Position("UNKNOWN", 0, null, null);
        Hand hand = Hand.RIGHT;
        Finger finger = Finger.THUMB;
        RIGHT_THUMB = new Position("RIGHT_THUMB", 1, hand, finger);
        Finger finger2 = Finger.INDEX;
        RIGHT_INDEX = new Position("RIGHT_INDEX", 2, hand, finger2);
        Finger finger3 = Finger.MIDDLE;
        RIGHT_MIDDLE = new Position("RIGHT_MIDDLE", 3, hand, finger3);
        Finger finger4 = Finger.RING;
        RIGHT_RING = new Position("RIGHT_RING", 4, hand, finger4);
        Finger finger5 = Finger.LITTLE;
        RIGHT_LITTLE = new Position("RIGHT_LITTLE", 5, hand, finger5);
        Hand hand2 = Hand.LEFT;
        LEFT_THUMB = new Position("LEFT_THUMB", 6, hand2, finger);
        LEFT_INDEX = new Position("LEFT_INDEX", 7, hand2, finger2);
        LEFT_MIDDLE = new Position("LEFT_MIDDLE", 8, hand2, finger3);
        LEFT_RING = new Position("LEFT_RING", 9, hand2, finger4);
        LEFT_LITTLE = new Position("LEFT_LITTLE", 10, hand2, finger5);
        c = a();
    }

    private Position(String str, int i, Hand hand, Finger finger) {
        this.a = hand;
        this.b = finger;
    }

    private static /* synthetic */ Position[] a() {
        return new Position[]{UNKNOWN, RIGHT_THUMB, RIGHT_INDEX, RIGHT_MIDDLE, RIGHT_RING, RIGHT_LITTLE, LEFT_THUMB, LEFT_INDEX, LEFT_MIDDLE, LEFT_RING, LEFT_LITTLE};
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, byte b, byte b2, Object[] objArr) {
        int i2;
        int i3 = (b * 19) + 80;
        byte[] bArr = $$a;
        int i4 = 128 - b2;
        byte[] bArr2 = new byte[i + 6];
        int i5 = i + 5;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i6 = 0;
            int i7 = i4;
            i3 = (i3 + i4) - 13;
            i4 = i7;
            bArr = bArr3;
            i2 = i6;
            bArr2[i2] = (byte) i3;
            i6 = i2 + 1;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i4 + 1;
            byte b3 = bArr[i8];
            byte[] bArr4 = bArr;
            i7 = i8;
            i4 = b3;
            bArr3 = bArr4;
            i3 = (i3 + i4) - 13;
            i4 = i7;
            bArr = bArr3;
            i2 = i6;
            bArr2[i2] = (byte) i3;
            i6 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i6 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Position getFromHandFinger(Pair<Hand, Finger> pair) {
        Object[] objArr;
        long j;
        int i;
        int i2;
        int a;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myUid = Process.myUid();
                    int i3 = ~myUid;
                    int i4 = (~((-920715893) | i3)) | 270532660;
                    int c2 = defpackage.a.c(~(i3 | 421826612), 713, ((~(myUid | 1072009844)) * 1426) + (((i4 | r0) * (-713)) - 46011664), 1572082045);
                    int i5 = c2 ^ (c2 << 13);
                    int i6 = i5 ^ (i5 >>> 17);
                    ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
                    ((long[]) objArr[0])[0] = j + 4977;
                    Fpnative.valueOf = objArr;
                    i = PngjBadCrcException.values[((Hand) pair.first).ordinal()];
                    int i7 = ((int[]) objArr[1])[0];
                    int i8 = ((i7 * i7) - (~(-(164822923 * i7)))) - 1;
                    int i9 = -(i7 * 233890867);
                    int i10 = ((i8 & i9) + (i9 | i8)) - (-948150337);
                    int i11 = i10 >> 23;
                    int i12 = (((i11 | (-1023)) << 1) - (i11 ^ (-1023))) / ConstantsKt.MINIMUM_BLOCK_SIZE;
                    int i13 = (i12 & 1) + (i12 | 1);
                    int i14 = (i10 ^ i13) + ((i13 & i10) << 1);
                    int i15 = i10 >> 27;
                    int i16 = (((i15 | (-63)) << 1) - (i15 ^ (-63))) / 32;
                    int i17 = -(((i16 & 1) + (i16 | 1)) ^ i14);
                    i2 = (i17 ^ 6) + ((i17 & 6) << 1);
                    int i18 = i2 >> 25;
                    a = IdentyB.a(i18 ^ (-255), (i18 & (-255)) << 1, 128, -1);
                    if (i != 10788 / (((-((a & 1) + (a | 1))) & i2) * 1798)) {
                        int i19 = PngjBadCrcException.valueOf[((Finger) pair.second).ordinal()];
                        if (i19 == 1) {
                            return LEFT_RING;
                        }
                        if (i19 == 2) {
                            return LEFT_INDEX;
                        }
                        if (i19 == 3) {
                            return LEFT_THUMB;
                        }
                        if (i19 == 4) {
                            return LEFT_LITTLE;
                        }
                        if (i19 == 5) {
                            return LEFT_MIDDLE;
                        }
                    } else {
                        if (i != 2) {
                            return UNKNOWN;
                        }
                        int i20 = PngjBadCrcException.valueOf[((Finger) pair.second).ordinal()];
                        if (i20 == 1) {
                            return RIGHT_RING;
                        }
                        if (i20 == 2) {
                            return RIGHT_INDEX;
                        }
                        if (i20 == 3) {
                            return RIGHT_THUMB;
                        }
                        if (i20 == 4) {
                            return RIGHT_LITTLE;
                        }
                        if (i20 == 5) {
                            return RIGHT_MIDDLE;
                        }
                    }
                    return UNKNOWN;
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[62];
            byte b2 = bArr[113];
            Object[] objArr3 = new Object[1];
            d(b, b2, (byte) (b2 | 124), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b3 = bArr[63];
            byte b4 = bArr[32];
            Object[] objArr4 = new Object[1];
            d(b3, b4, (byte) (b4 | 92), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1572082045);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4977;
            Fpnative.valueOf = objArr;
            i = PngjBadCrcException.values[((Hand) pair.first).ordinal()];
            int i72 = ((int[]) objArr[1])[0];
            int i82 = ((i72 * i72) - (~(-(164822923 * i72)))) - 1;
            int i92 = -(i72 * 233890867);
            int i102 = ((i82 & i92) + (i92 | i82)) - (-948150337);
            int i112 = i102 >> 23;
            int i122 = (((i112 | (-1023)) << 1) - (i112 ^ (-1023))) / ConstantsKt.MINIMUM_BLOCK_SIZE;
            int i132 = (i122 & 1) + (i122 | 1);
            int i142 = (i102 ^ i132) + ((i132 & i102) << 1);
            int i152 = i102 >> 27;
            int i162 = (((i152 | (-63)) << 1) - (i152 ^ (-63))) / 32;
            int i172 = -(((i162 & 1) + (i162 | 1)) ^ i142);
            i2 = (i172 ^ 6) + ((i172 & 6) << 1);
            int i182 = i2 >> 25;
            a = IdentyB.a(i182 ^ (-255), (i182 & (-255)) << 1, 128, -1);
            if (i != 10788 / (((-((a & 1) + (a | 1))) & i2) * 1798)) {
            }
            return UNKNOWN;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Position getFromOrdinal(int i) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int c2 = defpackage.a.c((~(startElapsedRealtime | 1049724667)) | (~(550835387 | startElapsedRealtime)) | (-1054185212), 623, (((~startElapsedRealtime) | 546374843) * (-623)) + ((~(1054185211 | startElapsedRealtime)) * 623) + 1215390872, -1819137280);
                    int i2 = c2 ^ (c2 << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4869;
                    Fpnative.valueOf = objArr;
                    return i >= values().length ? values()[i] : UNKNOWN;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            d((byte) (bArr[30] - 1), bArr[113], (byte) ($$b >>> 2), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[53];
            byte b2 = bArr[63];
            Object[] objArr4 = new Object[1];
            d(b, b2, b2, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1819137280);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4869;
            Fpnative.valueOf = objArr;
            if (i >= values().length) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void init$0() {
        $$a = new byte[]{44, 12, -115, -112, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 70, -44, 47, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, -8, 24, 22, -3, 27, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0};
        $$b = 112;
    }

    public static Position valueOfString(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int freeMemory = (int) Runtime.getRuntime().freeMemory();
                    int i = ~((-1023361850) | freeMemory);
                    int i2 = ~freeMemory;
                    int c2 = defpackage.a.c((~(freeMemory | 524472569)) | 474103865 | (~(1023361849 | i2)), 904, (((~(i2 | (-50368705))) | (~((-549257985) | freeMemory))) * 904) + (((i | (~((-524472570) | i2))) * (-1808)) - 418134441), -539414364);
                    int i3 = c2 ^ (c2 << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 5025;
                    Fpnative.valueOf = objArr;
                    return (Position) Enum.valueOf(Position.class, str);
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[111];
            byte b2 = bArr[113];
            Object[] objArr3 = new Object[1];
            d(b, b2, (byte) (b2 | 88), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d(bArr[55], bArr[63], bArr[117], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -539414364);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5025;
            Fpnative.valueOf = objArr;
            return (Position) Enum.valueOf(Position.class, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Position[] values() {
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
                    int c2 = defpackage.a.c(~(myTid | (-354455475)), 113, (((~((~myTid) | (-354422067))) | (~((-144433806) | myTid)) | 144400397) * (-113)) + ((((~((-354455475) | r6)) | 144433805) * 226) - 41024400), 712215623);
                    int i = c2 ^ (c2 << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5029;
                    Fpnative.valueOf = objArr;
                    return (Position[]) c.clone();
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[62];
            byte b2 = bArr[113];
            Object[] objArr3 = new Object[1];
            d(b, b2, (byte) (b2 | 124), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b3 = bArr[63];
            byte b4 = bArr[32];
            Object[] objArr4 = new Object[1];
            d(b3, b4, (byte) (b4 | 92), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 712215623);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5029;
            Fpnative.valueOf = objArr;
            return (Position[]) c.clone();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final Pair<Hand, Finger> getPair() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c2 = defpackage.a.c((~(identityHashCode | 178323558)) | (~((~identityHashCode) | (-33620033))) | (-465269248), 717, ((((~(r5 | 178323558)) | (-465269248)) | (~((-33620033) | identityHashCode))) * 717) - 237295238, -1066307536);
                    int i = c2 ^ (c2 << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4940;
                    Fpnative.valueOf = objArr;
                    return new Pair<>(this.a, this.b);
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[111];
            byte b2 = bArr[113];
            Object[] objArr3 = new Object[1];
            d(b, b2, (byte) (b2 | 88), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d(bArr[55], bArr[63], bArr[117], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1066307536);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4940;
            Fpnative.valueOf = objArr;
            return new Pair<>(this.a, this.b);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
