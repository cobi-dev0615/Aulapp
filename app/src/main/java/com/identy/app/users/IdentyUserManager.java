package com.identy.app.users;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import androidx.room.Room;
import com.d.e.a.values;
import com.identy.Fpnative;
import com.identy.IdentyB;
import defpackage.a;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.io.ConstantsKt;

/* loaded from: classes2.dex */
public class IdentyUserManager {
    private static final byte[] $$a = {90, 12, -119, 4, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 70, -44, 47, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, -8, 24, 22, -3, 27, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0};
    private static final int $$b = 171;
    private static IdentyUserManager b;
    IdentyAppDatabase a;

    public IdentyUserManager(Context context) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = a.c((~((~((int) SystemClock.uptimeMillis())) | (-3672210))) | 402800942, 521, ((~((-3672210) | r0)) * 521) - 820224888, -2122646827);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5040;
                    Fpnative.valueOf = objArr;
                    String concat = "26,".concat("identy-db");
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = ((i3 * i3) - (~(-(1382418297 * i3)))) - 1;
                    int i5 = -(i3 * (-302467133));
                    int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
                    int i7 = (i6 ^ (-1078286972)) + (((-1078286972) & i6) << 1);
                    int i8 = i7 >> 26;
                    int i9 = ((i8 ^ (-127)) + ((i8 & (-127)) << 1)) / 64;
                    int i10 = (i9 ^ 1) + ((i9 & 1) << 1);
                    int i11 = (i7 & i10) + (i10 | i7);
                    int i12 = i7 >> 25;
                    int i13 = -(IdentyB.a(i12 ^ (-255), (i12 & (-255)) << 1, 128, -1) ^ i11);
                    int i14 = (i13 ^ 8) + ((i13 & 8) << 1);
                    int i15 = i14 >> 24;
                    int a = IdentyB.a(i15 & (-511), i15 | (-511), 256, -1);
                    this.a = (IdentyAppDatabase) Room.databaseBuilder(context, IdentyAppDatabase.class, IdentyB.c((-((a & 1) + (a | 1))) & i14, 121, 2904, concat)).fallbackToDestructiveMigration().build();
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c(bArr[113], bArr[63], bArr[50], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(bArr[32], bArr[4], (byte) 79, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -2122646827);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5040;
            Fpnative.valueOf = objArr;
            String concat2 = "26,".concat("identy-db");
            int i32 = ((int[]) objArr[1])[0];
            int i42 = ((i32 * i32) - (~(-(1382418297 * i32)))) - 1;
            int i52 = -(i32 * (-302467133));
            int i62 = ((i42 | i52) << 1) - (i52 ^ i42);
            int i72 = (i62 ^ (-1078286972)) + (((-1078286972) & i62) << 1);
            int i82 = i72 >> 26;
            int i92 = ((i82 ^ (-127)) + ((i82 & (-127)) << 1)) / 64;
            int i102 = (i92 ^ 1) + ((i92 & 1) << 1);
            int i112 = (i72 & i102) + (i102 | i72);
            int i122 = i72 >> 25;
            int i132 = -(IdentyB.a(i122 ^ (-255), (i122 & (-255)) << 1, 128, -1) ^ i112);
            int i142 = (i132 ^ 8) + ((i132 & 8) << 1);
            int i152 = i142 >> 24;
            int a2 = IdentyB.a(i152 & (-511), i152 | (-511), 256, -1);
            this.a = (IdentyAppDatabase) Room.databaseBuilder(context, IdentyAppDatabase.class, IdentyB.c((-((a2 & 1) + (a2 | 1))) & i142, 121, 2904, concat2)).fallbackToDestructiveMigration().build();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, short s, byte b2, Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = b2 + 4;
        int i4 = 118 - (i * 19);
        byte[] bArr2 = new byte[44 - s];
        int i5 = 43 - s;
        if (bArr == null) {
            int i6 = i4;
            i4 = i5;
            i2 = 0;
            i3++;
            i4 = (i4 + i6) - 13;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2++;
            i6 = bArr[i3];
            i3++;
            i4 = (i4 + i6) - 13;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static IdentyUserManager getInstance(Context context) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int c = a.c((~((~elapsedRealtime) | 776444872)) | 2440, 449, (((~(776444872 | elapsedRealtime)) | 2440) * 449) + 1228095160, -1588616472);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4870;
                    Fpnative.valueOf = objArr;
                    if (b == null) {
                        b = new IdentyUserManager(context);
                    }
                    return b;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c(bArr[113], bArr[1], bArr[63], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(bArr[63], bArr[111], bArr[57], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1588616472);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4870;
            Fpnative.valueOf = objArr;
            if (b == null) {
            }
            return b;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static native String getTUser();

    public static native String getdefUser();

    /* JADX WARN: Removed duplicated region for block: B:11:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IdentyUser createUser(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = a.c((~((~identityHashCode) | (-135950387))) | 304152845, 449, (((~((-135950387) | identityHashCode)) | 304152845) * 449) + 1335360243, -1098774099);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5043;
                    Fpnative.valueOf = objArr;
                    if (getUserByuserName(str) == null) {
                        throw new Exception("Username already exist");
                    }
                    IdentyUser identyUser = new IdentyUser();
                    identyUser.uid = getAllUsers().size() + 1;
                    identyUser.username = str;
                    UserDao userDao = this.a.userDao();
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = i3 * i3;
                    int i5 = -(113341603 * i3);
                    int i6 = (((i4 & i5) + (i4 | i5)) - (~(-(i3 * (-273022153))))) - 1;
                    int i7 = (i6 ^ (-689563287)) + (((-689563287) & i6) << 1);
                    int i8 = i7 >> 29;
                    int i9 = ((i8 & (-15)) + (i8 | (-15))) / 8;
                    int i10 = (i9 & 1) + (i9 | 1);
                    int i11 = (i7 & i10) + (i10 | i7);
                    int i12 = ((i7 >> 20) - 8191) / ConstantsKt.DEFAULT_BLOCK_SIZE;
                    int i13 = -(i11 ^ ((i12 ^ 1) + ((i12 & 1) << 1)));
                    int i14 = (i13 & 7) + (i13 | 7);
                    int i15 = i14 >> 25;
                    int i16 = ((i15 & (-255)) + (i15 | (-255))) / 128;
                    int i17 = (i16 & 1) + (i16 | 1);
                    IdentyUser[] identyUserArr = new IdentyUser[13426 / (((-((i17 & 1) + (i17 | 1))) & i14) * 1918)];
                    identyUserArr[0] = identyUser;
                    userDao.insertAll(identyUserArr);
                    return identyUser;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c(bArr[113], bArr[63], bArr[50], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(bArr[32], bArr[4], (byte) 79, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1098774099);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5043;
            Fpnative.valueOf = objArr;
            if (getUserByuserName(str) == null) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public IdentyUser deleteUser(IdentyUser identyUser) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = a.c((~(identityHashCode | 180317621)) | (~(318571658 | identityHashCode)) | (-452947392), -1444, (((~identityHashCode) | (-407005504)) * 1444) + 1078082705, 1546012503);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4924;
                    Fpnative.valueOf = objArr;
                    this.a.userDao().delete(identyUser);
                    return identyUser;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c(bArr[113], bArr[1], bArr[63], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(bArr[63], bArr[111], bArr[57], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -254184535);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4924;
            Fpnative.valueOf = objArr;
            this.a.userDao().delete(identyUser);
            return identyUser;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public List<IdentyUser> getAllUsers() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = a.c((~(identityHashCode | (-68177977))) | 405479431, 366, (((~((-80793913) | identityHashCode)) | 418095367) * (-366)) + 821354559, -1595304382);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4925;
                    Fpnative.valueOf = objArr;
                    return this.a.userDao().getAll();
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c(bArr[113], bArr[63], bArr[50], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(bArr[32], bArr[4], (byte) 79, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1595304382);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4925;
            Fpnative.valueOf = objArr;
            return this.a.userDao().getAll();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public List<IdentyUser> getByEmail(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int uptimeMillis = (int) SystemClock.uptimeMillis();
                    int c = a.c((~(uptimeMillis | (-557611552))) | 58722271, 301, (((~(58722271 | uptimeMillis)) | (~((~uptimeMillis) | 557611551))) * (-301)) + (((~((-41944513) | uptimeMillis)) * (-301)) - 333997716), 270119193);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4851;
                    Fpnative.valueOf = objArr;
                    return this.a.userDao().findByEmail(str);
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c(bArr[113], bArr[1], bArr[63], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(bArr[63], bArr[111], bArr[57], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 270119193);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4851;
            Fpnative.valueOf = objArr;
            return this.a.userDao().findByEmail(str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public IdentyUser getDefaultUser(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myUid = Process.myUid();
                    int i = ~((-453482991) | myUid);
                    int i2 = ~myUid;
                    int c = a.c((~(myUid | (-45406290))) | (~(453482990 | i2)), 406, ((~((-419627439) | i2)) * (-406)) + (((i | (~(465033727 | i2))) * (-406)) - 1325694659), 1718592650);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4910;
                    Fpnative.valueOf = objArr;
                    IdentyUser identyUser = new IdentyUser();
                    int i5 = ((int[]) objArr[1])[0];
                    int i6 = i5 * i5;
                    int i7 = -(1492726115 * i5);
                    int i8 = (i6 & i7) + (i6 | i7);
                    int i9 = -(i5 * 1471010371);
                    int i10 = (i8 & i9) + (i9 | i8);
                    int i11 = (i10 ^ (-827088919)) + (((-827088919) & i10) << 1);
                    int i12 = ((i11 >> 24) - 511) / 256;
                    int i13 = i11 >> 28;
                    int i14 = (-(((i11 - (~((i12 & 1) + (i12 | 1)))) - 1) ^ IdentyB.a(i13 ^ (-31), (i13 & (-31)) << 1, 16, -1))) + 5;
                    int i15 = ((i14 >> 15) - 262143) / 131072;
                    int i16 = (i15 & 1) + (i15 | 1);
                    identyUser.uid = 0 / ((i14 & (-(((i16 | 1) << 1) - (1 ^ i16)))) * 1481);
                    identyUser.username = str;
                    return identyUser;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c(bArr[113], bArr[1], bArr[63], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(bArr[63], bArr[111], bArr[57], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1718592650);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4910;
            Fpnative.valueOf = objArr;
            IdentyUser identyUser2 = new IdentyUser();
            int i52 = ((int[]) objArr[1])[0];
            int i62 = i52 * i52;
            int i72 = -(1492726115 * i52);
            int i82 = (i62 & i72) + (i62 | i72);
            int i92 = -(i52 * 1471010371);
            int i102 = (i82 & i92) + (i92 | i82);
            int i112 = (i102 ^ (-827088919)) + (((-827088919) & i102) << 1);
            int i122 = ((i112 >> 24) - 511) / 256;
            int i132 = i112 >> 28;
            int i142 = (-(((i112 - (~((i122 & 1) + (i122 | 1)))) - 1) ^ IdentyB.a(i132 ^ (-31), (i132 & (-31)) << 1, 16, -1))) + 5;
            int i152 = ((i142 >> 15) - 262143) / 131072;
            int i162 = (i152 & 1) + (i152 | 1);
            identyUser2.uid = 0 / ((i142 & (-(((i162 | 1) << 1) - (1 ^ i162)))) * 1481);
            identyUser2.username = str;
            return identyUser2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public IdentyUser getTempUser(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int b2 = a.b(1394247915);
                    int i = ~b2;
                    int i2 = (~((-935648689) | i)) | 633640064;
                    int i3 = ~(b2 | (-134750785));
                    int c = a.c(i3 | (~(i | (-302008625))), 502, ((i2 | i3) * (-502)) + 758621503, 277684984);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 4882;
                    Fpnative.valueOf = objArr;
                    IdentyUser identyUser = new IdentyUser();
                    int i6 = ((int[]) objArr[1])[0];
                    int i7 = ((i6 * i6) - (~(-(2102328061 * i6)))) - 1;
                    int i8 = -(i6 * (-2068763773));
                    int i9 = ((i7 ^ i8) + ((i8 & i7) << 1)) - 2123198464;
                    int i10 = i9 >> 18;
                    int a = IdentyB.a(i10 & (-32767), i10 | (-32767), 16384, -1);
                    int i11 = (i9 ^ a) + ((a & i9) << 1);
                    int i12 = i9 >> 17;
                    int i13 = -(IdentyB.a(i12 & (-65535), i12 | (-65535), 32768, -1) ^ i11);
                    int i14 = ((i13 | 3) << 1) - (i13 ^ 3);
                    int i15 = ((i14 >> 24) - 511) / 256;
                    int i16 = ((i15 | 1) << 1) - (i15 ^ 1);
                    identyUser.uid = 56370000 / (((-((i16 & 1) + (1 | i16))) & i14) * 1879);
                    identyUser.username = str;
                    return identyUser;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c(bArr[113], bArr[29], (byte) 97, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b3 = bArr[32];
            byte b4 = (byte) (bArr[39] + 1);
            Object[] objArr4 = new Object[1];
            c(b3, b4, (byte) (b4 | 97), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 277684984);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4882;
            Fpnative.valueOf = objArr;
            IdentyUser identyUser2 = new IdentyUser();
            int i62 = ((int[]) objArr[1])[0];
            int i72 = ((i62 * i62) - (~(-(2102328061 * i62)))) - 1;
            int i82 = -(i62 * (-2068763773));
            int i92 = ((i72 ^ i82) + ((i82 & i72) << 1)) - 2123198464;
            int i102 = i92 >> 18;
            int a2 = IdentyB.a(i102 & (-32767), i102 | (-32767), 16384, -1);
            int i112 = (i92 ^ a2) + ((a2 & i92) << 1);
            int i122 = i92 >> 17;
            int i132 = -(IdentyB.a(i122 & (-65535), i122 | (-65535), 32768, -1) ^ i112);
            int i142 = ((i132 | 3) << 1) - (i132 ^ 3);
            int i152 = ((i142 >> 24) - 511) / 256;
            int i162 = ((i152 | 1) << 1) - (i152 ^ 1);
            identyUser2.uid = 56370000 / (((-((i162 & 1) + (1 | i162))) & i142) * 1879);
            identyUser2.username = str;
            return identyUser2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public IdentyUser getUserByuserName(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int c = a.c((~(startElapsedRealtime | (-552339777))) | (~((-1051229057) | startElapsedRealtime)) | 547883264, -69, (((~((-503345793) | startElapsedRealtime)) | (~((-4456513) | startElapsedRealtime))) * 69) - 524010940, 862066564);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4906;
                    Fpnative.valueOf = objArr;
                    return this.a.userDao().findByName(str);
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c(bArr[113], bArr[29], (byte) 97, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[32];
            byte b3 = (byte) (bArr[39] + 1);
            Object[] objArr4 = new Object[1];
            c(b2, b3, (byte) (b3 | 97), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 689926793);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4906;
            Fpnative.valueOf = objArr;
            return this.a.userDao().findByName(str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IdentyUser createUser(String str, String str2) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = a.c((~((~((int) Runtime.getRuntime().freeMemory())) | 913571826)) | 271605810, 449, (((~(913571826 | r0)) | 271605810) * 449) - 713102322, 1871535459);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4925;
                    Fpnative.valueOf = objArr;
                    if (getUserByuserName(str) != null) {
                        IdentyUser identyUser = new IdentyUser();
                        identyUser.uid = getAllUsers().size() + 1;
                        identyUser.username = str;
                        identyUser.email = str2;
                        UserDao userDao = this.a.userDao();
                        int i3 = ((int[]) objArr[1])[0];
                        int i4 = i3 * i3;
                        int i5 = -(937853001 * i3);
                        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
                        int i7 = -(i3 * 237524143);
                        int i8 = (i6 & i7) + (i7 | i6);
                        int i9 = (i8 & (-418190320)) + ((-418190320) | i8);
                        int i10 = ((i9 >> 20) - 8191) / ConstantsKt.DEFAULT_BLOCK_SIZE;
                        int i11 = (i10 ^ 1) + ((i10 & 1) << 1);
                        int i12 = ((i9 | i11) << 1) - (i11 ^ i9);
                        int i13 = i9 >> 17;
                        int i14 = -(i12 ^ IdentyB.a(i13 & (-65535), i13 | (-65535), 32768, -1));
                        int i15 = ((i14 | 2) << 1) - (i14 ^ 2);
                        int i16 = ((i15 >> 26) - 127) / 64;
                        IdentyUser[] identyUserArr = new IdentyUser[3526 / (((-((((i16 | 1) << 1) - (i16 ^ 1)) - (-1))) & i15) * 1763)];
                        identyUserArr[0] = identyUser;
                        userDao.insertAll(identyUserArr);
                        return identyUser;
                    }
                    throw new Exception("Username already exist");
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            c(bArr[113], bArr[29], (byte) 97, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[32];
            byte b3 = (byte) (bArr[39] + 1);
            Object[] objArr4 = new Object[1];
            c(b2, b3, (byte) (b3 | 97), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1871535459);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4925;
            Fpnative.valueOf = objArr;
            if (getUserByuserName(str) != null) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
